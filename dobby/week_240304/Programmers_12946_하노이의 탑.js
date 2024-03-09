// n-1 개의 블록을 C를 경유지로 두고 B로 옮긴다.
// n 번째 블록을 C로 옮긴다.
// B에 위치한 블록들을 A를 경유지로 활용해 C로 옮긴다.

function solution(n) {
  var answer = [[]];

  const move = (n, start, to) => {
    answer.push([start, to]);
  };

  const hanoi = (n, start, via, to) => {
    if (n === 1) {
      move(1, start, to);
      return;
    }

    hanoi(n - 1, start, to, via);
    move(n, start, to);
    hanoi(n - 1, via, start, to);
  };

  hanoi(n, 1, 2, 3);

  answer.shift();

  return answer;
}

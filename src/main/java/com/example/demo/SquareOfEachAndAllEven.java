package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

public class SquareOfEachAndAllEven {


        public List<Integer> getSquare (List<Integer> list) {
            return list
                    .stream().map(n -> n * n)
                    .collect(Collectors.toList());
        }

        public List<Integer> getEvenSquare (List < Integer > list) {

            return list
                    .stream().filter(n -> n % 2 == 0)
                    .map(n -> n * n)
                    .collect(Collectors.toList());
        }

    }

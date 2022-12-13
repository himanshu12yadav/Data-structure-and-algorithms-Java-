package Patterns;

public class PatternCollection {

    public void pattern1(int n){
        int row = 1;
        while (row <= n){
            int col = 1;
            while(col <= n){
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern2(int n){
        int row = 1;
        while (row <= n){
            int col = 1;
            while (col <= n){
                System.out.print(row);
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern3(int n){
        int row = 1;
        while (row <= n){
            int col = 1;
            while (col <= n){
                System.out.print(col);
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern4(int n){
        int row = 1;
        while (row <= n){
            int col = n;
            while (col > 0){
                System.out.print(col);
                col--;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern_second_4(int n){
        int row = 1;
        while (row <= n){
            int col = 1;
            while (col <= n){
                System.out.print(n-col+1);
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern5(int n){
         int row = 1;
         int count = 1;
         while (row <= n){
             int col = 1;
             while (col <= n){
                 System.out.print(count + " ");
                 count++;
                 col++;
             }
             System.out.println();
             row++;
         }
    }

    public void pattern6(int n){
        int row = 1;
        while(row <= n){
            int col = 1;
            while (col <= row){
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern7(int n){
        int row = 1;
        while (row <= n){
            int col = 1;
            while (col <= row){
                System.out.print(row);
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern8(int n){
        int row = 1;
        int count = 1;
        while(row <= n){
            int col = 1;
            while (col <= row){
                System.out.print(count);
                count++;
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern9(int n){
        int row = 1;
        int count = 1;
        while (row <= n){
            count = row;
            int col = 1;
            while (col <= row){
                System.out.print(count);
                count++;
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern_second_9(int n){
        int row = 1;
        while (row <= n){
            int col = 1;
            while (col <= row){
                System.out.print(row+col-1);
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern10(int n){
        int row = 1;
        while (row <= n){
            int col = 1;
            int temp = row;
            while (col <= row){
                System.out.print(temp);
                temp--;
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern_second_10(int n){
        int row = 1;
        while (row <= n){
            int col = 1;
            while (col <= row){
                System.out.print(row-col+1 + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern11(int n){
        int row = 1;
        while (row <= n){
            int col = 1;
            while (col <= n){
                char t = (char)('A' + row - 1);
                System.out.print(t);
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern12(int n){
        int row = 1;
        while (row <= n){
            int col = 1;
            while (col <= n){
                char t = (char)('A' + col - 1);
                System.out.print(t);
                col++;
            }
            System.out.println();
            row++;

        }
    }

    public void pattern13(int n){
        int row = 1;
        char start = 'A';
        while (row <= n){
            int col = 1;
            while (col <= n){
                System.out.print(start);
                start++;
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern14(int n){
        int row = 1;
        while (row <= n){
            int col = 1;
            while(col <= n){
                char t = (char) ('A'+row+col-2);
                System.out.print(t);
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern15(int n){
        int row = 1;
        while (row <= n){
            int col = 1;
            while (col <= row){
                char t = (char) ('A' + row - 1);
                System.out.print(t);
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern16(int n){
        int row = 1;
        char value = 'A';
        while (row <= n){
            int col = 1;
            while (col <= row){
                System.out.print(value);
                value++;
                col++;
            }
            System.out.println();
            row++;

        }
    }

    public void pattern17(int n){
        int row = 1;
        while (row <= n){
            int col = 1;
            while (col <= row){
                char t = (char) ('A' + row + col - 2);
                System.out.print(t);
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern18(int n){
        int row = 1;
        while (row <= n){
            int col = 1;
            while (col <= row){
                char t = (char)('D' - row + col);
                System.out.print(t);
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern_second_18(int n){
        int row = 1;
        while(row <= n){
            int col = 1;
            char start  = (char)('A' + n - row);
            while (col <= row){
                System.out.print(start);
                start++;
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern19(int n){
        int row = 1;
        while (row <= n){
            int spaces = n-row;
            while (spaces > 0){
                System.out.print(" ");
                spaces--;
            }
            int col = 1;
            while (col <= row){
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern20(int n){
        int row = 1;
        while (row <= n){
            int star = n-row;
            while (star > 0){
                System.out.print("*");
                star--;
            }
            int col = 1;
            while (col <= row){
                System.out.print(" ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern21(int n){
        int row = 1;
        while (row <= n){
            int space = row-1;
            while (space > 0) {
                System.out.print(" ");
                space--;
            }
            int remains = n-row+1;
            int col = 1;
            while ( col <= remains){
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern22(int n){
        int row = 1;
        while (row <= n){
            int spaces = row - 1;
            while (spaces > 0){
                System.out.print(" ");
                spaces--;
            }

            int remains = n- row + 1;
            int col = 1;
            while (col <= remains){
                System.out.print(row);
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern23(int n){
        int row = 1;
        while (row <= n){
            int space = n-row;
            while (space > 0){
                System.out.print(" ");
                space--;
            }
            int col = 1;
            while (col <= row){
                System.out.print(row);
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern24(int n){
        int row = 1;
        while (row <= n){
            int spaces = row - 1;
            while (spaces > 0){
                System.out.print(" ");
                spaces--;
            }

            int remains = n-row+1;
            int col = 1;
            while (col <= remains){
                System.out.print(row+col-1);
                col++;
            }
            System.out.println();
            row++;

        }
    }

    public void pattern25(int n){
        int row = 1;
        while (row <= n){
            int space1 = n - row;
            while (space1 > 0){
                System.out.print("_");
                space1--;
            }

            int col = 1;
            while (col <= row){
                System.out.print(col);
                col++;
            }

            int start = row-1;

            while (start > 0){
                System.out.print(start);
                start--;
            }

            int space2 = n-row;
            while (space2 > 0){
                System.out.print("_");
                space2--;
            }
            System.out.println();
            row++;
        }
    }

    public void pattern26(int n){
        int row = 1;
        while (row <= n){
            int temp = n - row + 1;
            int col = 1;
            while (col <= temp){
                System.out.print(col);
                if (col == temp){
                    break;
                }
                col++;
            }

            int star = 2 * (row - 1);
            while (star > 0){
                System.out.print("*");
                star--;
            }


            while(col > 0){
                System.out.print(col);
                col--;
            }

            System.out.println();
            row++;
        }


    }


}

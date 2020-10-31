package org.gxuwz.arithmatic.lanqiao.guosai.lanqiao10;

/**
 * @Author: 韦永恒
 * @Date: 2020-10-28 13:58:13
 * @Description:
 *
 * 题意: 将一个7*7的网格沿着边界线裁剪，使得裁剪完右边翻转可以恰好拼成“直角”
 *
 * 思路: 发现，右边翻转其实就是沿着 中间大正方形左下到右上这条对角线翻转的，
 *
 * 也就是我们的裁剪完应该要让 左右侧 部分按这条对角线对称，既然我们从左上开始裁剪，
 *
 * 那么裁剪到对角线上之后，再从右下角开始对称裁剪就好了
 *
 * 其实就是问从左上角开始，保证两边块连续的情况下，走到对角线一共有多少种方案
 *
 */
public class Main3 {
}

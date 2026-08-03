package Yue;

import Yue.C4128;

/* JADX INFO: renamed from: Yue.ۥۣۡۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6579 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f2150 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f2151 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f16885 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f16886 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f16887 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f16888 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f16889 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f16890 = 64;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f16891 = 128;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f16892 = 256;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f16893 = 512;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f16894 = 1024;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f16895 = 257;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static boolean[] f16896 = new boolean[3];

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f16897 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f16898 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f16899 = 2;

    /* JADX INFO: renamed from: ۥ */
    public static void m3033(C4129 c4129, C5714 c5714, C4128 c4128) {
        c4128.f8364 = -1;
        c4128.f8365 = -1;
        C4128.EnumC0339 enumC0339 = c4129.f8397[0];
        C4128.EnumC0339 enumC03392 = C4128.EnumC0339.WRAP_CONTENT;
        if (enumC0339 != enumC03392 && c4128.f8397[0] == C4128.EnumC0339.MATCH_PARENT) {
            int i = c4128.f8386.f8276;
            int iM11891 = c4129.m11891() - c4128.f8388.f8276;
            C4125 c4125 = c4128.f8386;
            c4125.f8278 = c5714.m17638(c4125);
            C4125 c41252 = c4128.f8388;
            c41252.f8278 = c5714.m17638(c41252);
            c5714.m17623(c4128.f8386.f8278, i);
            c5714.m17623(c4128.f8388.f8278, iM11891);
            c4128.f8364 = 2;
            c4128.m11939(i, iM11891);
        }
        if (c4129.f8397[1] == enumC03392 || c4128.f8397[1] != C4128.EnumC0339.MATCH_PARENT) {
            return;
        }
        int i2 = c4128.f8387.f8276;
        int iM11859 = c4129.m11859() - c4128.f8389.f8276;
        C4125 c41253 = c4128.f8387;
        c41253.f8278 = c5714.m17638(c41253);
        C4125 c41254 = c4128.f8389;
        c41254.f8278 = c5714.m17638(c41254);
        c5714.m17623(c4128.f8387.f8278, i2);
        c5714.m17623(c4128.f8389.f8278, iM11859);
        if (c4128.f8409 > 0 || c4128.m11890() == 8) {
            C4125 c41255 = c4128.f8390;
            c41255.f8278 = c5714.m17638(c41255);
            c5714.m17623(c4128.f8390.f8278, c4128.f8409 + i2);
        }
        c4128.f8365 = 2;
        c4128.m11960(i2, iM11859);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean m3034(int i, int i2) {
        return (i & i2) == i2;
    }
}

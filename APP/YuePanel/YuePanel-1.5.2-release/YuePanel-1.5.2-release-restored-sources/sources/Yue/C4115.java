package Yue;

import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "ConsoleKt")
public final class C4115 {
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ */
    public static final void m1083(byte b) {
        System.out.print(Byte.valueOf(b));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m1084(char c) {
        System.out.print(c);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m11730(double d) {
        System.out.print(d);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m11731(float f) {
        System.out.print(f);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m11732(int i) {
        System.out.print(i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m11733(long j) {
        System.out.print(j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m11734(Object obj) {
        System.out.print(obj);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final void m11735(short s) {
        System.out.print(Short.valueOf(s));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final void m11736(boolean z) {
        System.out.print(z);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final void m11737(char[] cArr) {
        C5499.m17103(cArr, "message");
        System.out.print(cArr);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final void m11738() {
        System.out.println();
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m11739(byte b) {
        System.out.println(Byte.valueOf(b));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final void m11740(char c) {
        System.out.println(c);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final void m11741(double d) {
        System.out.println(d);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final void m11742(float f) {
        System.out.println(f);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final void m11743(int i) {
        System.out.println(i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final void m11744(long j) {
        System.out.println(j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final void m11745(Object obj) {
        System.out.println(obj);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final void m11746(short s) {
        System.out.println(Short.valueOf(s));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final void m11747(boolean z) {
        System.out.println(z);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final void m11748(char[] cArr) {
        C5499.m17103(cArr, "message");
        System.out.println(cArr);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final String m11749() {
        C5702 c5702 = C5702.f1623;
        InputStream inputStream = System.in;
        C5499.m17102(inputStream, "`in`");
        Charset charsetDefaultCharset = Charset.defaultCharset();
        C5499.m17102(charsetDefaultCharset, "defaultCharset()");
        return c5702.m17613(inputStream, charsetDefaultCharset);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final String m11750() {
        String strM11751 = m11751();
        if (strM11751 != null) {
            return strM11751;
        }
        throw new C7010("EOF has already been reached");
    }

    @InterfaceC7470(version = "1.6")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final String m11751() {
        return m11749();
    }
}

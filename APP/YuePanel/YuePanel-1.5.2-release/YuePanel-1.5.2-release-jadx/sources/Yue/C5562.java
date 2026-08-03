package Yue;

import Yue.C4483;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5562 {
    /* JADX INFO: renamed from: ۥ */
    public static String m2296(String str, C7215 c7215) {
        return m2297(str, "", c7215);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static String m2297(String str, String str2, C7215 c7215) {
        return new C3834(c7215).m10605(m17344(str, str2)).m12987().m13774();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String m17328(String str, String str2, C7215 c7215, C4483.C0414 c0414) {
        C4483 c4483M10605 = new C3834(c7215).m10605(m17344(str, str2));
        c4483M10605.m13002(c0414);
        return c4483M10605.m12987().m13774();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC4103 m17329(String str) {
        return C5375.m16691(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m17330(String str, C7215 c7215) {
        return new C3834(c7215).m10609(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static InterfaceC4103 m17331() {
        return new C5375();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C4483 m17332(File file) throws IOException {
        return C4300.m12421(file, null, file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static C4483 m17333(File file, String str) throws IOException {
        return C4300.m12421(file, str, file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static C4483 m17334(File file, String str, String str2) throws IOException {
        return C4300.m12421(file, str, str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static C4483 m17335(File file, String str, String str2, C6617 c6617) throws IOException {
        return C4300.m12422(file, str, str2, c6617);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static C4483 m17336(InputStream inputStream, String str, String str2) throws IOException {
        return C4300.m12423(inputStream, str, str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static C4483 m17337(InputStream inputStream, String str, String str2, C6617 c6617) throws IOException {
        return C4300.m12424(inputStream, str, str2, c6617);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static C4483 m17338(String str) {
        return C6617.m20996(str, "");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static C4483 m17339(String str, C6617 c6617) {
        return c6617.m21010(str, "");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static C4483 m17340(String str, String str2) {
        return C6617.m20996(str, str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static C4483 m17341(String str, String str2, C6617 c6617) {
        return c6617.m21010(str, str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static C4483 m17342(URL url, int i) throws IOException {
        InterfaceC4103 interfaceC4103M16692 = C5375.m16692(url);
        interfaceC4103M16692.mo11610(i);
        return interfaceC4103M16692.get();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static C4483 m17343(String str) {
        return C6617.m20997(str, "");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static C4483 m17344(String str, String str2) {
        return C6617.m20997(str, str2);
    }
}

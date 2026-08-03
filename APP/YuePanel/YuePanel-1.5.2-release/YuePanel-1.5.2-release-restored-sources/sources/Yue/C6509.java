package Yue;

import Yue.C6504;
import com.nmmedit.protect.NativeUtil;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥۡۢۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6509 {

    /* JADX INFO: renamed from: ۥ */
    public static final C6504 f2126;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final C6149 f2127;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16737;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16738;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16739;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16740;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16741;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16742;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16743;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16744;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16745;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16746;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16747;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16748;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16749;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16750;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16751;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16752;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f16753;

    /* JADX INFO: renamed from: Yue.ۥۡۢۨۦ$ۥ */
    public interface InterfaceC1006 {
        /* JADX INFO: renamed from: ۥ */
        void mo2441(int i);
    }

    static {
        NativeUtil.classesInit0(147);
        f2127 = C6149.m18948(yue_xin_awa(16));
        C6504.C1004 c1004 = new C6504.C1004();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f2126 = c1004.m20671(10L, timeUnit).m20722(30L, timeUnit).m20756(10L, timeUnit).m20724(true).m20666();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native String m3003(String str) throws IOException;

    /* JADX INFO: renamed from: ۥ۟ */
    public static native String m3004(String str, Map<String, String> map) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native String m20758(String str, Map<String, String> map) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native String m20759(String str, Map<String, String> map, Map<String, String> map2) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native String m20760(String str, String str2) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native String m20761(String str, String str2, Map<String, String> map) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native void m20762(String str, String str2, String str3, InterfaceC1006 interfaceC1006) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native void m20763(String str, String str2, InterfaceC1006 interfaceC1006) throws IOException;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native String m20764(String str, String str2, String str3, InterfaceC1006 interfaceC1006) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native String m20765(C7141 c7141) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native String m20766(String str, File file, String str2, C5062 c5062) throws IOException;
}

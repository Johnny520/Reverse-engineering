package Yue;

import Yue.C6504;
import android.os.Handler;
import android.os.Looper;
import com.nmmedit.protect.NativeUtil;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥ۠۠۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4509 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f9559;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9560;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9561;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9562;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9563;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9564;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9565;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9566;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9567;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9568;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9569;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9570;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9571;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9572;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9573;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9574;

    /* JADX INFO: renamed from: ۥ */
    public final String f928;

    /* JADX INFO: renamed from: ۥ۟ */
    public final String f929;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C4494 f9575;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C6504 f9576;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final ExecutorService f9577;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Handler f9578;

    /* JADX INFO: renamed from: Yue.ۥ۠۠۟ۦ$ۥ */
    public interface InterfaceC0418 {
        /* JADX INFO: renamed from: ۥ */
        void m1425(int i, String str);

        /* JADX INFO: renamed from: ۥ۟ */
        void m1426(List<C3985> list);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠۟ۦ$ۥ۟ */
    public interface InterfaceC0419 {
        /* JADX INFO: renamed from: ۥ */
        void m1427(int i, String str);

        /* JADX INFO: renamed from: ۥ۟ */
        void m1428(C3986 c3986);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠۟ۦ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC4510 {
        /* JADX INFO: renamed from: ۥ */
        void m1429(int i, String str);

        /* JADX INFO: renamed from: ۥ۟ */
        void m1430(C3985 c3985, int i);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        void m13134();
    }

    static {
        NativeUtil.classesInit0(268);
        f9559 = yue_xin_awa(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4509(String str) {
        this(str, yue_xin_awa(0));
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m1423(InterfaceC4510 interfaceC4510, Exception exc);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m1424(InterfaceC0419 interfaceC0419, C3986 c3986);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m13102(InterfaceC0419 interfaceC0419, Exception exc);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m13103(InterfaceC0419 interfaceC0419, C3986 c3986);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m13104(InterfaceC0419 interfaceC0419, Exception exc);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m13105(InterfaceC0418 interfaceC0418, List list);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m13106(C4509 c4509, String str, String str2, InterfaceC4510 interfaceC4510);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m13107(InterfaceC0419 interfaceC0419, C3986 c3986);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m13108(C4509 c4509, String str, String str2, int i, int i2, InterfaceC0419 interfaceC0419);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m13109(InterfaceC4510 interfaceC4510, C3985 c3985, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m13110(InterfaceC0418 interfaceC0418, Exception exc);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ void m13111(C4509 c4509, int i, String str, InterfaceC0419 interfaceC0419, InterfaceC0418 interfaceC0418);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native /* synthetic */ void m13112(C4509 c4509, String str, int i, int i2, InterfaceC0419 interfaceC0419);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m13113(InterfaceC0419 interfaceC0419, C3986 c3986);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m13114(InterfaceC0418 interfaceC0418, List list);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static native /* synthetic */ void m13115(InterfaceC0418 interfaceC0418, Exception exc);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static native /* synthetic */ void m13116(InterfaceC0419 interfaceC0419, C3986 c3986);

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m13117(InterfaceC0419 interfaceC0419, Exception exc);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static native /* synthetic */ void m13118(InterfaceC0419 interfaceC0419, C3986 c3986);

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m13119(InterfaceC0419 interfaceC0419, Exception exc);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m13120(InterfaceC4510 interfaceC4510, C3985 c3985, int i);

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m13121(InterfaceC4510 interfaceC4510, Exception exc);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public native void m13122(String str, int i, InterfaceC0419 interfaceC0419, InterfaceC0418 interfaceC0418);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public native void m13123(String str, String str2, int i, int i2, InterfaceC0419 interfaceC0419);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public native C3986 m13124(String str, String str2, int i, int i2) throws Exception;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public native void m13125(String str, int i, int i2, InterfaceC0419 interfaceC0419);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public native C3986 m13126(String str, int i, int i2) throws Exception;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public native void m13127(String str, String str2, InterfaceC4510 interfaceC4510);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public native C3985 m13128(String str, String str2) throws Exception;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final native /* synthetic */ void m13129(int i, String str, InterfaceC0419 interfaceC0419, InterfaceC0418 interfaceC0418);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final native /* synthetic */ void m13130(String str, String str2, int i, int i2, InterfaceC0419 interfaceC0419);

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final native /* synthetic */ void m13131(String str, int i, int i2, InterfaceC0419 interfaceC0419);

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final native /* synthetic */ void m13132(String str, String str2, InterfaceC4510 interfaceC4510);

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public native void m13133();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4509(String str, String str2) {
        this.f928 = str;
        this.f929 = str2;
        this.f9575 = new C4494(str2);
        C6504.C1004 c1004 = new C6504.C1004();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f9576 = c1004.m20671(15L, timeUnit).m20722(15L, timeUnit).m20666();
        this.f9577 = Executors.newSingleThreadExecutor();
        this.f9578 = new Handler(Looper.getMainLooper());
    }
}

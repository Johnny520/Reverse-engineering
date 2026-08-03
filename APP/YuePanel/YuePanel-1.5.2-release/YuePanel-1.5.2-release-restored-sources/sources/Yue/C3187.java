package Yue;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.kongzue.dialogx.dialogs.BottomDialog;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.nmmedit.protect.NativeUtil;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: Yue.ۥۣ۟۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3187 {

    /* JADX INFO: renamed from: ۥ */
    public static final C4262 f117;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f118;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4763;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4764;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4765;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4766;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4767;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4768;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4769;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4770;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4771;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4772;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4773;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4774;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4775;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4776;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4777;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4778;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4779;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4780;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4781;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4782;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4783;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4784;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4785;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4786;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4787;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4788;

    /* JADX INFO: renamed from: Yue.ۥۣ۟۠۟$ۥ */
    public class C0071 extends OnBindView<BottomDialog> {

        /* JADX INFO: renamed from: ۥ۟ */
        public static volatile /* synthetic */ String f119;

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ WebView f120;

        static {
            NativeUtil.classesInit0(660);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0071(View view, WebView webView) {
            super(view);
            this.f120 = webView;
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, android.view.View] */
        @Override // com.kongzue.dialogx.interfaces.OnBindView
        public native /* bridge */ /* synthetic */ void onBind(BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ */
        public native void m256(BottomDialog bottomDialog, View view);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۠۟$ۥ۟ */
    public class C0072 extends TimerTask {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f4789;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f4790;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Context f4791;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ BottomDialog f4792;

        static {
            NativeUtil.classesInit0(721);
        }

        public C0072(Context context, BottomDialog bottomDialog) {
            this.f4791 = context;
            this.f4792 = bottomDialog;
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        @Override // java.util.TimerTask, java.lang.Runnable
        public native void run();
    }

    static {
        NativeUtil.classesInit0(840);
        f117 = new C4262();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m254(String str);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m255(MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m6519();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m6520(Timer timer, BottomDialog bottomDialog);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m6521(Context context);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m6522(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m6523(Context context);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m6524(Context context);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native void m6525(Context context);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m6526(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m6527(Context context);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ void m6528(Context context);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m6529(MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native /* synthetic */ void m6530(String str);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m6531();

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native /* synthetic */ void m6532(Timer timer, BottomDialog bottomDialog);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native void m6533(String str, C7255 c7255);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native void m6534(Context context);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native void m6535();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native boolean m6536(Context context);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native void m6537(BottomDialog bottomDialog, Context context);
}

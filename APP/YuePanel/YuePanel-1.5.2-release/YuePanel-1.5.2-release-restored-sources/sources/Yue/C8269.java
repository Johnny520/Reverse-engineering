package Yue;

import Yue.C6517;
import android.content.Context;
import android.view.View;
import com.kongzue.dialogx.dialogs.BottomDialog;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.dialogs.MessageMenu;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XposedHelpers;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢۤۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8269 {

    /* JADX INFO: renamed from: ۥ */
    public static C3828 f3370;

    /* JADX INFO: renamed from: ۥ۟ */
    public static C6320 f3371;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24608;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24609;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24610;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24611;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24612;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24613;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24614;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24615;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24616;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24617;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24618;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24619;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24620;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24621;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24622;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24623;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24624;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24625;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24626;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24627;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24628;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24629;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24630;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24631;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24632;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24633;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24634;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24635;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24636;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24637;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24638;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24639;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24640;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24641;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24642;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24643;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24644;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24645;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24646;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24647;

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۢ$ۥ */
    public class C1468 extends OnBindView<BottomDialog> {

        /* JADX INFO: renamed from: ۥ۟ */
        public static volatile /* synthetic */ String f3372;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24648;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24649;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24650;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24651;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24652;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24653;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24654;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24655;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24656;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24657;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24658;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24659;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24660;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24661;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24662;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24663;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24664;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24665;

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Context f3373;

        static {
            NativeUtil.classesInit0(1034);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1468(View view, Context context) {
            super(view);
            this.f3373 = context;
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        /* JADX INFO: renamed from: ۥ */
        public static native /* synthetic */ void m4242(C6320 c6320, View view);

        /* JADX INFO: renamed from: ۥ۟ */
        public static native /* synthetic */ boolean m4243(C6320 c6320, View view);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static native /* synthetic */ void m27277(BottomDialog bottomDialog, C6320 c6320, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static native /* synthetic */ void m27278(C6320 c6320, BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static native /* synthetic */ void m27279(BottomDialog bottomDialog, Context context, C6320 c6320, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static native /* synthetic */ void m27280(C6320 c6320, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static native /* synthetic */ boolean m27281(C6320 c6320, MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static native /* synthetic */ void m27282(C6320 c6320, BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static native /* synthetic */ boolean m27283(String str, MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static native /* synthetic */ void m27284(C6320 c6320, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static native /* synthetic */ void m27285(C6320 c6320, BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static native /* synthetic */ void m27286(C6320 c6320, BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static native /* synthetic */ void m27287(C6320 c6320, BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static native /* synthetic */ void m27288(BottomDialog bottomDialog, C6320 c6320, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static native /* synthetic */ void m27289(BottomDialog bottomDialog, Context context, C6320 c6320, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static native /* synthetic */ void m27290(C6320 c6320, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static native /* synthetic */ void m27291(C6320 c6320, BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static native /* synthetic */ void m27292(C6320 c6320, BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static native /* synthetic */ void m27293(C6320 c6320, BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static native /* synthetic */ void m27294(BottomDialog bottomDialog, C6320 c6320, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        private static native /* synthetic */ boolean m27295(String str, MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static native /* synthetic */ void m27296(C6320 c6320, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static native /* synthetic */ boolean m27297(C6320 c6320, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static native /* synthetic */ void m27298(C6320 c6320, BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static native /* synthetic */ void m27299(BottomDialog bottomDialog, C6320 c6320, View view);

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static native /* synthetic */ void m27300(C6320 c6320, BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static native /* synthetic */ boolean m27301(C6320 c6320, MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static native /* synthetic */ void m27302(C6320 c6320, View view);

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, android.view.View] */
        @Override // com.kongzue.dialogx.interfaces.OnBindView
        public native /* bridge */ /* synthetic */ void onBind(BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public native void m27303(BottomDialog bottomDialog, View view);
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۤۢ$ۥ۟ */
    public class C1469 implements C6517.InterfaceC6522 {

        /* JADX INFO: renamed from: ۥ۟ */
        public static volatile /* synthetic */ String f3374;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24666;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24667;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24668;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f24669;

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ C4464 f3375;

        static {
            NativeUtil.classesInit0(928);
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C1469(C4464 c4464) {
            this.f3375 = c4464;
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        @Override // Yue.C6517.InterfaceC6522
        /* JADX INFO: renamed from: ۥ۟ */
        public native void mo2379(String str);

        @Override // Yue.C6517.InterfaceC6522
        /* JADX INFO: renamed from: ۥ۟۟ */
        public native void mo17611(String str);
    }

    static {
        NativeUtil.classesInit0(340);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m4240(C6320 c6320, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m4241(int i, String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27241(List list, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27242(List list, C6320 c6320, int i, C4464 c4464, MessageMenu messageMenu, CharSequence charSequence, int i2);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27243(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27244(C6320 c6320, C4464 c4464, int i, MessageMenu messageMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27245(C6320 c6320, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27246(C6320 c6320, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27247(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27248(int i, C6320 c6320, List list, int i2, C4464 c4464, MessageMenu messageMenu, CharSequence charSequence, int i3);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27249(C6320 c6320, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27250(C6320 c6320, MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native C6320 m27251();

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native void m27252(Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native void m27253(long j);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27254(C6320 c6320, MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27255(C6320 c6320, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27256(C6320 c6320, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27257(C6320 c6320, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27258(List list, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27259(C6320 c6320, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27260(int i, String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27261(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27262(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27263(List list, C6320 c6320, int i, C4464 c4464, MessageMenu messageMenu, CharSequence charSequence, int i2);

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27264(C6320 c6320, C4464 c4464, int i, MessageMenu messageMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m27265(int i, C6320 c6320, List list, int i2, C4464 c4464, MessageMenu messageMenu, CharSequence charSequence, int i3);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static void m27266() {
        Object objM3171;
        try {
            C6320 c6320M27251 = m27251();
            if (c6320M27251 == null || c6320M27251.m19672() == null || (objM3171 = C6687.m3171()) == null) {
                return;
            }
            XposedHelpers.callMethod(objM3171, yue_xin_awa(30), new Object[0]);
        } catch (Throwable th) {
            C6334.m19807(yue_xin_awa(31) + th, 1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static void m27267() {
        Object objM3171;
        try {
            C6320 c6320M27251 = m27251();
            if (c6320M27251 == null || c6320M27251.m19672() == null || (objM3171 = C6687.m3171()) == null) {
                return;
            }
            XposedHelpers.callMethod(objM3171, yue_xin_awa(32), new Object[0]);
        } catch (Throwable th) {
            C6334.m19807(yue_xin_awa(33) + th, 1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static native void m27268(String str, C4464 c4464);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static native void m27269(C6320 c6320);

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static native boolean m27270(C6320 c6320);

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static native void m27271(C6320 c6320);

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static native void m27272(C6320 c6320, boolean z, boolean z2);

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static native void m27273(List<String> list, int i);

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static native void m27274(C6320 c6320, C4464 c4464, int i);

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static native void m27275(C6320 c6320, C4464 c4464, int i);

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static native void m27276();
}

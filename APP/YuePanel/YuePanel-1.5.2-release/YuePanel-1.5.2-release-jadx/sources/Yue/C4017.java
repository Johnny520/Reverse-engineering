package Yue;

import android.content.Context;
import android.view.View;
import com.kongzue.dialogx.dialogs.BottomDialog;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4017 {

    /* JADX INFO: renamed from: ۥ */
    public static C6322 f624;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f625;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8017;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8018;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8019;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8020;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8021;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8022;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8023;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8024;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8025;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8026;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8027;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8028;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8029;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8030;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8031;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8032;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8033;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8034;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8035;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8036;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8037;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8038;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8039;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8040;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8041;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8042;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8043;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8044;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8045;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8046;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8047;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8048;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8049;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8050;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8051;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8052;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8053;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8054;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8055;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8056;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8057;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8058;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8059;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8060;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f8061;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۡ$ۥ */
    public class C0306 extends OnBindView<BottomDialog> {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f8062;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f8063;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f8064;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f8065;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f8066;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f8067;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f8068;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f8069;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f8070;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f8071;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f8072;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f8073;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f8074;

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ C6322 f626;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ String f627;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ C0307 f8075;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Object f8076;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Context f8077;

        static {
            NativeUtil.classesInit0(245);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0306(View view, C6322 c6322, String str, C0307 c0307, Object obj, Context context) {
            super(view);
            this.f626 = c6322;
            this.f627 = str;
            this.f8075 = c0307;
            this.f8076 = obj;
            this.f8077 = context;
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        /* JADX INFO: renamed from: ۥ */
        public static native /* synthetic */ void m977(C0307 c0307, BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ۟ */
        public static native /* synthetic */ boolean m978(String str, MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static native /* synthetic */ void m11340(BottomDialog bottomDialog, Object obj, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static native /* synthetic */ void m11341(C0307 c0307, BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static native /* synthetic */ void m11342(BottomDialog bottomDialog, C6322 c6322, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static native /* synthetic */ void m11343(String str, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static native /* synthetic */ boolean m11344(String str, MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static native /* synthetic */ boolean m11345(String str, MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static native /* synthetic */ boolean m11346(String str, MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static native /* synthetic */ void m11347(String str, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static native /* synthetic */ boolean m11348(String str, MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static native /* synthetic */ boolean m11349(String str, MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static native /* synthetic */ void m11350(BottomDialog bottomDialog, Object obj, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static native /* synthetic */ void m11351(BottomDialog bottomDialog, C6322 c6322, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static native /* synthetic */ void m11352(C0307 c0307, BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static native /* synthetic */ void m11353(C0307 c0307, BottomDialog bottomDialog, View view);

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, android.view.View] */
        @Override // com.kongzue.dialogx.interfaces.OnBindView
        public native /* bridge */ /* synthetic */ void onBind(BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public native void m11354(BottomDialog bottomDialog, View view);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۡ$ۥ۟ */
    public static class C0307 {

        /* JADX INFO: renamed from: ۥ */
        public List<String> f628 = new ArrayList();

        /* JADX INFO: renamed from: ۥ۟ */
        public List<String> f629 = new ArrayList();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public List<String> f8078 = new ArrayList();

        static {
            NativeUtil.classesInit0(373);
        }

        /* JADX INFO: renamed from: ۥ */
        public native List<String> m979();

        /* JADX INFO: renamed from: ۥ۟ */
        public native List<String> m980();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public native List<String> m11355();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public native void m11356(List<String> list);

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public native void m11357(List<String> list);

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public native void m11358(List<String> list);
    }

    static {
        NativeUtil.classesInit0(675);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m975(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m976(List list);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m11319(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m11320(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11321(int i, String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m11322(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11323(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m11324(List list, int i);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native void m11325(List<View> list);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native void m11326(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static C6322 m11327(Object obj) {
        try {
            C4805 c4805M14538 = new C4805().m14538(obj);
            C4805 c4805 = new C4805();
            C4805 c48052 = new C4805();
            ClassLoader classLoaderM6707 = C3270.m6707();
            C6322 c6322 = new C6322();
            String str = (String) c4805M14538.m14540(String.class).m1709(yue_xin_awa(14));
            String str2 = (String) c4805M14538.m14540(String.class).m1709(yue_xin_awa(15));
            String str3 = (String) c4805M14538.m14540(String.class).m1709(yue_xin_awa(16));
            long jLongValue = ((Long) c4805M14538.m14540(null).m1709(yue_xin_awa(17))).longValue();
            Class<?> cls = Integer.TYPE;
            int iIntValue = ((Integer) c4805M14538.m14540(cls).m1709(yue_xin_awa(18))).intValue();
            Object objM1709 = c4805M14538.m14540(null).m1709(yue_xin_awa(19));
            c4805.m14538(objM1709);
            Object objM17092 = c4805M14538.m14540(null).m1709(yue_xin_awa(20));
            C0307 c0307M11328 = m11328(obj);
            List list = (List) XposedHelpers.callMethod(C5898.m18284(objM1709, yue_xin_awa(21), classLoaderM6707.loadClass(yue_xin_awa(22))), yue_xin_awa(23), new Object[0]);
            int iIntValue2 = ((Integer) c4805M14538.m14540(cls).m1709(yue_xin_awa(24))).intValue();
            long jLongValue2 = ((Long) c4805M14538.m14540(Long.TYPE).m1709(yue_xin_awa(25))).longValue();
            String str4 = (String) c4805.m14540(String.class).m1709(yue_xin_awa(26));
            String str5 = (String) c4805.m14540(String.class).m1709(yue_xin_awa(27));
            c6322.m19728(str4);
            c6322.m19737(iIntValue);
            c6322.m19738(jLongValue);
            c6322.m19730(str2);
            c6322.m19735(iIntValue2);
            c6322.m19727((String) list.get(0));
            c6322.m19731(str);
            c6322.m19739(str5);
            c6322.m19724(c0307M11328);
            c6322.m19732(obj);
            try {
                c6322.m19733(((Integer) c4805M14538.m14540(null).m1709(yue_xin_awa(28))).intValue());
            } catch (Throwable unused) {
            }
            if (objM17092 != null) {
                try {
                    c48052.m14538(objM17092);
                    String strYue_xin_awa = yue_xin_awa(29);
                    try {
                        strYue_xin_awa = C5224.m1992((String) c48052.m14540(String.class).m1709(yue_xin_awa(30))).get(yue_xin_awa(31)).getAsJsonArray().get(0).getAsJsonObject().get(yue_xin_awa(32)).getAsString();
                        c6322.m19725(((Long) c48052.m14540(null).m1709(yue_xin_awa(33))).longValue());
                    } catch (Throwable unused2) {
                    }
                    c6322.m19726(strYue_xin_awa);
                } catch (Throwable th) {
                    C6334.m19808(yue_xin_awa(34) + th.getMessage(), 1);
                }
            }
            c6322.m19736(jLongValue2);
            c6322.m19734(str3);
            return c6322;
        } catch (Throwable th2) {
            C6334.m19808(yue_xin_awa(35) + th2.getMessage(), 1);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native C0307 m11328(Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native C6322 m11329();

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native /* synthetic */ void m11330(View view);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m11331(View view);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native /* synthetic */ void m11332(List list);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native /* synthetic */ void m11333(View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11334(int i, String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11335(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11336(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native void m11337(C6322 c6322);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static native void m11338(List<String> list, int i);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static native void m11339(Object obj) throws Throwable;
}

package Yue;

import Yue.C6144;
import Yue.C6517;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.nmmedit.protect.NativeUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.EnumMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6144 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f1849 = 1048576;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final Bitmap.CompressFormat f1850;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f14917 = 100;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final EnumMap<EnumC6148, CopyOnWriteArrayList<InterfaceC6147>> f14918;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final EnumMap<EnumC0915, EnumMap<EnumC6148, CopyOnWriteArrayList<InterfaceC6147>>> f14919;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14920;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14921;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14922;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14923;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14924;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14925;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14926;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14927;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14928;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14929;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14930;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14931;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14932;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14933;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14934;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14935;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14936;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14937;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14938;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14939;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14940;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14941;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14942;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14943;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14944;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14945;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14946;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14947;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14948;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14949;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14950;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14951;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14952;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14953;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14954;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14955;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14956;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14957;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14958;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14959;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14960;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14961;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14962;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14963;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14964;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14965;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14966;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14967;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14968;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14969;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14970;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14971;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14972;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14973;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14974;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14975;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14976;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14977;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14978;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14979;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14980;

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14981;

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14982;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14983;

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14984;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14985;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14986;

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14987;

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14988;

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14989;

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14990;

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14991;

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14992;

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14993;

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14994;

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14995;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14996;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14997;

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14998;

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f14999;

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15000;

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15001;

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15002;

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15003;

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15004;

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15005;

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15006;

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15007;

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15008;

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15009;

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15010;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15011;

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15012;

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15013;

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15014;

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15015;

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15016;

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15017;

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۥۧ$ۥ */
    public class C0914 implements C6517.InterfaceC6521 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15018;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15019;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15020;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15021;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15022;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15023;

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Context f1851;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ String f1852;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ EnumC6148 f15024;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ C4464 f15025;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ EnumC0915 f15026;

        static {
            NativeUtil.classesInit0(85);
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0914(Context context, String str, EnumC6148 enumC6148, C4464 c4464, EnumC0915 enumC0915) {
            this.f1851 = context;
            this.f1852 = str;
            this.f15024 = enumC6148;
            this.f15025 = c4464;
            this.f15026 = enumC0915;
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static native /* synthetic */ void m18933(Context context, String str, EnumC6148 enumC6148, C4464 c4464, EnumC0915 enumC0915, String str2);

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static native /* synthetic */ void m18934(Context context, String str, EnumC6148 enumC6148, C4464 c4464, EnumC0915 enumC0915, String str2);

        @Override // Yue.C6517.InterfaceC6521
        /* JADX INFO: renamed from: ۥ */
        public native void mo273(int i);

        @Override // Yue.C6517.InterfaceC6521
        /* JADX INFO: renamed from: ۥ۟ */
        public native void mo274(String str);

        @Override // Yue.C6517.InterfaceC6521
        /* JADX INFO: renamed from: ۥ۟۟ */
        public native void mo6558(String str);
    }

    /* JADX WARN: Enum visitor error
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "this.exitBlock" is null
    	at jadx.core.dex.nodes.MethodNode.getPreExitBlocks(MethodNode.java:405)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:287)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: Yue.ۥۡ۠ۥۧ$ۥ۟ */
    public static final class EnumC0915 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final EnumC0915 f15027;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static final EnumC0915 f15028;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final /* synthetic */ EnumC0915[] f15029;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15030;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15031;

        static {
            NativeUtil.classesInit0(331);
            f15027 = new EnumC0915(yue_xin_awa(0), 0);
            f15028 = new EnumC0915(yue_xin_awa(1), 1);
            f15029 = m2641();
        }

        public EnumC0915(String str, int i) {
        }

        public static native EnumC0915 valueOf(String str);

        public static native EnumC0915[] values();

        private static native /* synthetic */ String yue_xin_awa(int i);

        /* JADX INFO: renamed from: ۥ */
        public static native /* synthetic */ EnumC0915[] m2641();
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۥۧ$ۥ۟۟, reason: contains not printable characters */
    public static final class C6145 {

        /* JADX INFO: renamed from: ۥ */
        public final Context f1853;

        /* JADX INFO: renamed from: ۥ۟ */
        public final String f1854;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final EnumC6148 f15032;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C4464 f15033;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final int f15034;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final EnumC0915 f15035;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public String f15036;

        static {
            NativeUtil.classesInit0(9);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 java.lang.String)
  (r3v0 Yue.ۥۡ۠ۥۧ$ۥ۟۟۟۠)
  (r4v0 Yue.ۥ۠۟ۦ)
  (r5v0 int)
  (r6v0 Yue.ۥۡ۠ۥۧ$ۥ۟)
 A[MD:(android.content.Context, java.lang.String, Yue.ۥۡ۠ۥۧ$ۥ۟۟۟۠, Yue.ۥ۠۟ۦ, int, Yue.ۥۡ۠ۥۧ$ۥ۟):void (m)] (LINE:1) call: Yue.ۥۡ۠ۥۧ.ۥ۟۟.<init>(android.content.Context, java.lang.String, Yue.ۥۡ۠ۥۧ$ۥ۟۟۟۠, Yue.ۥ۠۟ۦ, int, Yue.ۥۡ۠ۥۧ$ۥ۟):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C6145(Context context, String str, EnumC6148 enumC6148, C4464 c4464, int i, EnumC0915 enumC0915, C0914 c0914) {
            this(context, str, enumC6148, c4464, i, enumC0915);
        }

        /* JADX INFO: renamed from: ۥ */
        public native Context m2642();

        /* JADX INFO: renamed from: ۥ۟ */
        public native int m2643();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public native EnumC6148 m18935();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public native String m18936();

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public native C4464 m18937();

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public native EnumC0915 m18938();

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public native String m18939();

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public native void m18940(String str);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C6145(Context context, String str, EnumC6148 enumC6148, C4464 c4464, int i, EnumC0915 enumC0915) {
            this.f1853 = context;
            this.f1854 = str;
            this.f15032 = enumC6148;
            this.f15033 = c4464;
            this.f15034 = i;
            this.f15035 = enumC0915 == null ? EnumC0915.f15027 : enumC0915;
            this.f15036 = c4464.m1400();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۥۧ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C6146 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15037;

        /* JADX INFO: renamed from: ۥ */
        public final boolean f1855;

        /* JADX INFO: renamed from: ۥ۟ */
        public final String f1856;

        static {
            NativeUtil.classesInit0(1033);
        }

        public C6146(boolean z, String str) {
            this.f1855 = z;
            this.f1856 = str;
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        /* JADX INFO: renamed from: ۥ */
        public static native /* synthetic */ boolean m2644(C6146 c6146);

        /* JADX INFO: renamed from: ۥ۟ */
        public static native /* synthetic */ String m2645(C6146 c6146);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static native /* synthetic */ C6146 m18941(String str);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static native /* synthetic */ C6146 m18942();

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static native C6146 m18943(String str);

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static native C6146 m18944();
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۥۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    public interface InterfaceC6147 {
        /* JADX INFO: renamed from: ۥ */
        File mo2638(C6145 c6145, File file) throws Exception;
    }

    /* JADX WARN: Enum visitor error
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "this.exitBlock" is null
    	at jadx.core.dex.nodes.MethodNode.getPreExitBlocks(MethodNode.java:405)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:287)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: Yue.ۥۡ۠ۥۧ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class EnumC6148 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final EnumC6148 f15038;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static final EnumC6148 f15039;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final EnumC6148 f15040;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static final /* synthetic */ EnumC6148[] f15041;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15042;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15043;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15044;

        static {
            NativeUtil.classesInit0(372);
            f15038 = new EnumC6148(yue_xin_awa(0), 0);
            f15039 = new EnumC6148(yue_xin_awa(1), 1);
            f15040 = new EnumC6148(yue_xin_awa(2), 2);
            f15041 = m2646();
        }

        public EnumC6148(String str, int i) {
        }

        public static native EnumC6148 valueOf(String str);

        public static native EnumC6148[] values();

        private static native /* synthetic */ String yue_xin_awa(int i);

        /* JADX INFO: renamed from: ۥ */
        public static native /* synthetic */ EnumC6148[] m2646();
    }

    static {
        NativeUtil.classesInit0(174);
        f1850 = Bitmap.CompressFormat.JPEG;
        f14918 = new EnumMap<>(EnumC6148.class);
        f14919 = new EnumMap<>(EnumC0915.class);
        for (EnumC6148 enumC6148 : EnumC6148.values()) {
            f14918.put(enumC6148, new CopyOnWriteArrayList<>());
        }
        for (EnumC0915 enumC0915 : EnumC0915.values()) {
            EnumMap<EnumC6148, CopyOnWriteArrayList<InterfaceC6147>> enumMap = new EnumMap<>(EnumC6148.class);
            for (EnumC6148 enumC61482 : EnumC6148.values()) {
                enumMap.put(enumC61482, new CopyOnWriteArrayList<>());
            }
            f14919.put(enumC0915, enumMap);
        }
        m18899(EnumC6148.f15038, new InterfaceC6147() { // from class: Yue.ۥۡ۠ۥۣ
            static {
                NativeUtil.classesInit0(114);
            }

            @Override // Yue.C6144.InterfaceC6147
            /* JADX INFO: renamed from: ۥ */
            public final native File mo2638(C6144.C6145 c6145, File file);
        });
        m18898(EnumC0915.f15028, EnumC6148.f15040, new InterfaceC6147() { // from class: Yue.ۥۡ۠ۥۤ
            static {
                NativeUtil.classesInit0(117);
            }

            @Override // Yue.C6144.InterfaceC6147
            /* JADX INFO: renamed from: ۥ */
            public final native File mo2638(C6144.C6145 c6145, File file);
        });
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ File m2639(C6145 c6145, File file);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ File m2640(C6145 c6145, File file);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m18863(int i);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m18864(int i, List list, int i2);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m18865(List list, C4464 c4464, EnumC6148 enumC6148, Context context, EnumC0915 enumC0915);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m18866(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m18867(C6145 c6145, File file) throws Exception;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ String m18868(EnumC6148 enumC6148);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m18869(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ String m18870(Throwable th);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native String m18871(String str, String str2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native File m18872(C6145 c6145, File file) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native C4464 m18873(C4464 c4464, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native void m18874(InputStream inputStream, OutputStream outputStream) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native ContentValues m18875();

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native File m18876(EnumC6148 enumC6148, String str, int i) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native void m18877(ContentResolver contentResolver, Uri uri);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native void m18878(File file);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native String m18879(File file, EnumC6148 enumC6148, String str);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native void m18880(Context context, String str, C4464 c4464, EnumC6148 enumC6148);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native void m18881(Context context, String str, C4464 c4464, EnumC6148 enumC6148, EnumC0915 enumC0915);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static native String m18882(String str, EnumC6148 enumC6148);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static native String m18883(EnumC6148 enumC6148);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static native String m18884(EnumC6148 enumC6148);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static native String m18885(String str);

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static native List<InterfaceC6147> m18886(C6145 c6145);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static native C6146 m18887(Context context, File file, EnumC6148 enumC6148, String str, String str2, boolean z);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static native boolean m18888(C6145 c6145);

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static native boolean m18889(String str);

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static native boolean m18890(File file) throws IOException;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m18891(int i);

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m18892(int i, List list, int i2);

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m18893(List list, C4464 c4464, EnumC6148 enumC6148, Context context, EnumC0915 enumC0915);

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static native /* synthetic */ File m18894(C6145 c6145, File file) throws Exception;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static native Uri m18895(EnumC6148 enumC6148);

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static native String m18896(String str, String str2, EnumC6148 enumC6148);

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static native void m18897(ContentResolver contentResolver, Uri uri) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static native void m18898(EnumC0915 enumC0915, EnumC6148 enumC6148, InterfaceC6147 interfaceC6147);

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static native void m18899(EnumC6148 enumC6148, InterfaceC6147 interfaceC6147);

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static native String m18900(EnumC6148 enumC6148);

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static native String m18901(String str);

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static native String m18902(Throwable th);

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static native boolean m18903(File file, File file2);

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static native String m18904(String str);

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static native void m18905(Context context, String str, C4464 c4464);

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static native boolean m18906(Context context, Bitmap bitmap);

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static native void m18907(C6145 c6145, File file) throws Exception;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static native void m18908(Context context, List<List<String>> list, int[] iArr, C4464 c4464);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native void m18909(Context context, List<List<String>> list, int[] iArr, C4464 c4464, EnumC0915 enumC0915);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native void m18910(Context context, String[] strArr, int[] iArr, C4464 c4464);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static native void m18911(Context context, String[] strArr, int[] iArr, C4464 c4464, EnumC0915 enumC0915);

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static native void m18912(Context context, String str, C4464 c4464);

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static native boolean m18913(Context context, File file);

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static native boolean m18914(Context context, String str);

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static native C6146 m18915(Context context, File file, EnumC6148 enumC6148, String str, String str2);

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static native void m18916(Context context, List<List<String>> list, int[] iArr, C4464 c4464, EnumC6148 enumC6148, EnumC0915 enumC0915);

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static native boolean m18917(Context context, File file, EnumC6148 enumC6148, String str);

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static native C6146 m18918(Context context, File file, EnumC6148 enumC6148, String str);

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static native boolean m18919(C6145 c6145, File file) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static native void m18920(Context context, String[] strArr, int[] iArr, C4464 c4464);

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static native void m18921(Context context, String[] strArr, int[] iArr, C4464 c4464, EnumC0915 enumC0915);

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static native void m18922(Context context, String str, C4464 c4464);

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static native boolean m18923(Context context, File file);

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static native boolean m18924(Context context, String str);

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static native boolean m18925(C6145 c6145);

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static native boolean m18926(C6145 c6145);

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static native void m18927(String str);

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static native void m18928(String str);

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static native String m18929(EnumC6148 enumC6148);

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static native File m18930(File file, String str);

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static native boolean m18931(EnumC0915 enumC0915, EnumC6148 enumC6148, InterfaceC6147 interfaceC6147);

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static native boolean m18932(EnumC6148 enumC6148, InterfaceC6147 interfaceC6147);
}

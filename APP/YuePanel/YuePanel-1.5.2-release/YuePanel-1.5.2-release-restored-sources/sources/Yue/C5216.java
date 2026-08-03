package Yue;

import android.view.View;
import com.android.p001dx.p004io.Opcodes;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.GridGestureConfig;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5216 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۤ$ۥ */
    public static class C0668 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12419;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12420;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12421;

        /* JADX INFO: renamed from: ۥ */
        public int f1347;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f1348;

        static {
            NativeUtil.classesInit0(40);
        }

        public C0668(int i, int i2) {
            this.f1347 = i;
            this.f1348 = i2;
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        public native boolean equals(Object obj);

        public native int hashCode();

        public native String toString();

        /* JADX INFO: renamed from: ۥ */
        public native String m1982();
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
    /* JADX INFO: renamed from: Yue.ۥ۠ۤ$ۥ۟ */
    public static final class EnumC0669 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final EnumC0669 f12422;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static final EnumC0669 f12423;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final EnumC0669 f12424;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static final /* synthetic */ EnumC0669[] f12425;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12426;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12427;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12428;

        static {
            NativeUtil.classesInit0(996);
            f12422 = new EnumC0669(yue_xin_awa(0), 0);
            f12423 = new EnumC0669(yue_xin_awa(1), 1);
            f12424 = new EnumC0669(yue_xin_awa(2), 2);
            f12425 = m1983();
        }

        public EnumC0669(String str, int i) {
        }

        public static native EnumC0669 valueOf(String str);

        public static native EnumC0669[] values();

        private static native /* synthetic */ String yue_xin_awa(int i);

        /* JADX INFO: renamed from: ۥ */
        public static native /* synthetic */ EnumC0669[] m1983();
    }

    static {
        NativeUtil.classesInit0(Opcodes.INVOKE_POLYMORPHIC_RANGE);
    }

    /* JADX INFO: renamed from: ۥ */
    public static native int m1980(int i, int i2, int i3);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native C0668 m1981(int i, int i2, float f, float f2, GridGestureConfig gridGestureConfig);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native C0668 m15975(View view, float f, float f2, GridGestureConfig gridGestureConfig);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native EnumC4453 m15976(int i, int i2, EnumC0669 enumC0669, GridGestureConfig gridGestureConfig);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native String m15977(int i, int i2, EnumC0669 enumC0669, GridGestureConfig gridGestureConfig);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native boolean m15978(int i, int i2, GridGestureConfig gridGestureConfig);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native boolean m15979(int i, int i2, EnumC0669 enumC0669, GridGestureConfig gridGestureConfig);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native boolean m15980(C0668 c0668, EnumC0669 enumC0669, GridGestureConfig gridGestureConfig);
}

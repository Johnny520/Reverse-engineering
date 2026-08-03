package p000;

import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.EdgeEffect;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.robv.android.xposed.XposedHelpers;
import io.github.cherrywechat.R;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: Pj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0671Pj {

    /* JADX INFO: renamed from: a */
    public static final Object[] f2138a = null;

    /* JADX INFO: renamed from: b */
    public static final ExecutorC2346p3 f2139b = null;

    /* JADX INFO: renamed from: c */
    public static final ExecutorC2346p3 f2140c = null;

    /* JADX INFO: renamed from: d */
    public static final C2610v1 f2141d = null;

    /* JADX INFO: renamed from: e */
    public static final C1517hw f2142e = null;

    /* JADX INFO: renamed from: f */
    public static Object f2143f;

    static {
        f2138a = new Object[0];
        f2139b = new ExecutorC2346p3(1);
        f2140c = new ExecutorC2346p3(2);
        f2141d = new C2610v1("NULL", 10);
        f2142e = new C1517hw(6);
    }

    /* JADX INFO: renamed from: A */
    public static void m1340A(Class r3, ReflectiveOperationException r4) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + r3, r4);
    }

    /* JADX INFO: renamed from: B */
    public static final Object[] m1341B(Collection r4) {
        int r0 = r4.size();
        if (r0 == 0) goto L8;
        Iterator r42 = r4.iterator();
        if (r42.hasNext() == false) goto L8;
        Object[] r02 = new Object[r0];
        int r1 = 0;
    L10:
        int r2 = r1 + 1;
        r02[r1] = r42.next();
        if (r2 < r02.length) goto L25;
        if (r42.hasNext() == false) goto L14;
        int r12 = ((r2 * 3) + 1) >>> 1;
        if (r12 > r2) goto L22;
        r12 = 2147483645;
        if (r2 < 2147483645) goto L22;
        throw new OutOfMemoryError();
    L22:
        r02 = Arrays.copyOf(r02, r12);
    L23:
        r1 = r2;
        goto L10
    L14:
        return r02;
    L25:
        if (r42.hasNext() == true) goto L23;
        return Arrays.copyOf(r02, r2);
    L8:
        return f2138a;
    }

    /* JADX INFO: renamed from: C */
    public static final Object[] m1342C(Collection r5, Object[] r6) {
        int r0 = r5.size();
        int r2 = 0;
        if (r0 == 0) goto L5;
        Iterator r52 = r5.iterator();
        if (r52.hasNext() == true) goto L15;
        if (r6.length <= 0) goto L13;
        r6[0] = null;
    L13:
        return r6;
    L15:
        if (r0 > r6.length) goto L17;
        Object[] r02 = r6;
    L18:
        int r3 = r2 + 1;
        r02[r2] = r52.next();
        if (r3 < r02.length) goto L33;
        if (r52.hasNext() == false) goto L22;
        int r22 = ((r3 * 3) + 1) >>> 1;
        if (r22 > r3) goto L30;
        r22 = 2147483645;
        if (r3 < 2147483645) goto L30;
        throw new OutOfMemoryError();
    L30:
        r02 = Arrays.copyOf(r02, r22);
    L31:
        r2 = r3;
        goto L18
    L22:
        return r02;
    L33:
        if (r52.hasNext() == true) goto L31;
        if (r02 != r6) goto L38;
        r6[r3] = null;
        return r6;
    L38:
        return Arrays.copyOf(r02, r3);
    L17:
        r02 = (Object[]) Array.newInstance(r6.getClass().getComponentType(), r0);
        goto L18
    L5:
        if (r6.length <= 0) goto L13;
        r6[0] = null;
        return r6;
    }

    /* JADX INFO: renamed from: a */
    public static final C0104Cb m1343a(InterfaceC1137ac r2) {
        if (r2.mo24m(C1456gf.f5162f) != null) goto L7;
        r2 = r2.mo23l(new C1419fm());
    L7:
        return new C0104Cb(r2);
    }

    /* JADX INFO: renamed from: b */
    public static void m1344b(StringBuilder r0, Object r1, InterfaceC1416fj r2) {
        if (r2 == null) goto L5;
        r0.append((CharSequence) r2.mo90g(r1));
        return;
    L5:
        if (r1 != null) goto L7;
        boolean r22 = true;
    L8:
        if (r22 == false) goto L12;
        r0.append((CharSequence) r1);
        return;
    L12:
        if ((r1 instanceof Character) == false) goto L15;
        r0.append(((Character) r1).charValue());
        return;
    L15:
        r0.append(r1.toString());
        return;
    L7:
        r22 = r1 instanceof CharSequence;
        goto L8
    }

    /* JADX INFO: renamed from: c */
    public static final void m1345c(View r3) {
        C2537tE r0 = new C2537tE(r3, null);
        C2820zx r32 = new C2820zx();
        r32.f9541d = AbstractC0628Oj.m1242k(r32, r32, r0);
    L4:
        if (r32.hasNext() == false) goto L13;
        View r02 = (View) r32.next();
        C0981Wt r2 = (C0981Wt) r02.getTag(R.id.pooling_container_listener_holder_tag);
        if (r2 != null) goto L8;
        r2 = new C0981Wt();
        r02.setTag(R.id.pooling_container_listener_holder_tag, r2);
    L8:
        ArrayList r03 = r2.f3064a;
        int r1 = AbstractC2496sa.m4976a0(r03);
        if ((-1) >= r1) goto L4;
        r03.get(r1).getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: d */
    public static int m1346d(Comparable r0, Comparable r1) {
        if (r0 != r1) goto L5;
        return 0;
    L5:
        if (r0 != null) goto L8;
        return -1;
    L8:
        if (r1 != null) goto L12;
        return 1;
    L12:
        return r0.compareTo(r1);
    }

    /* JADX INFO: renamed from: e */
    public static void m1347e(View r3, boolean r4) {
        if (r4 == false) goto L5;
        r3.setPadding(r3.getPaddingLeft(), r3.getPaddingTop(), r3.getPaddingLeft(), r3.getPaddingBottom());
        return;
    L5:
        r3.setPadding(r3.getPaddingRight(), r3.getPaddingTop(), r3.getPaddingRight(), r3.getPaddingBottom());
    }

    /* JADX INFO: renamed from: f */
    public static void m1348f(ViewGroup r11, int r12, boolean r13, boolean r14) {
        int r0 = r11.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L17;
        View r2 = r11.getChildAt(r1);
        r2.setBackground(null);
        m1347e(r2, r14);
        if (r13 == true) goto L7;
    L9:
        if (r13 == true) goto L11;
    L14:
        if ((r2 instanceof ViewGroup) == false) goto L16;
        m1348f((ViewGroup) r2, r12, r13, r14);
    L16:
        r1 = r1 + 1;
        goto L3
    L11:
        if (r2.getClass().getName().equals(AbstractC0295Gu.m625r(-198964359985205L)) == false) goto L14;
        String r6 = AbstractC0295Gu.m625r(-198586402863157L);
        Object[] r7 = {Integer.valueOf(r12)};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r2, r6, Arrays.copyOf(r7, 1));
        goto L14
    L7:
        if (r2.getClass().getName().equals(AbstractC0295Gu.m625r(-198753906587701L)) == false) goto L9;
        String r62 = AbstractC0295Gu.m625r(-198908525410357L);
        Object[] r72 = {Integer.valueOf(Color.argb(155, Color.red(r12), Color.green(r12), Color.blue(r12)))};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r2, r62, Arrays.copyOf(r72, 1));
        goto L14
    }

    /* JADX INFO: renamed from: g */
    public static void m1349g(C0089C2 r6) {
        Object r0 = r6.f202h;
        C2648vx r1 = new C2648vx();
        boolean r2 = r0 instanceof Class;
        View r3 = null;
        if (r2 == false) goto L5;
        r1.f9163b = (Class) r0;
    L10:
        r1.m5182e(AbstractC0295Gu.m625r(-167104292583477L));
        View r12 = (View) r1.m5178a();
        if (r12 == null) goto L13;
        r3 = r12;
    L24:
        HashMap r02 = AbstractC0999XA.f3193a;
        int r03 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-198642237438005L));
        if (r03 == 0) goto L28;
        if (r3 == null) goto L28;
        String r13 = AbstractC0295Gu.m625r(-197104639146037L);
        Object[] r22 = {Integer.valueOf(r03)};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r3, r13, Arrays.copyOf(r22, 1));
    L28:
        if (r03 == 0) goto L33;
        TextView r62 = (TextView) r6.f200f;
        if (r62 == null) goto L34;
        r62.setTextColor(r03);
        return;
    L34:
        return;
    L33:
        return;
    L13:
        C2648vx r14 = new C2648vx();
        if (r2 == false) goto L16;
        r14.f9163b = (Class) r0;
    L21:
        r14.f9165d = LinearLayout.class;
        ViewGroup r04 = (ViewGroup) r14.m5178a();
        if (r04 == null) goto L24;
        r3 = r04.getChildAt(0);
        goto L24
    L16:
        r14.f9164c = r0;
        if (r0 == null) goto L19;
        Class<?> r05 = r0.getClass();
    L20:
        r14.f9163b = r05;
        goto L21
    L19:
        r05 = null;
        goto L20
    L5:
        r1.f9164c = r0;
        if (r0 == null) goto L8;
        Class<?> r4 = r0.getClass();
    L9:
        r1.f9163b = r4;
        goto L10
    L8:
        r4 = null;
        goto L9
    }

    /* JADX INFO: renamed from: h */
    public static void m1350h(C0089C2 r3, C0089C2 r4) {
        View r32 = r3.m141c();
        if (r32 != null) goto L5;
        return;
    L5:
        if (r4.m142d() == false) goto L7;
        HashMap r0 = AbstractC0999XA.f3193a;
        Drawable r02 = C1517hw.m2890b(AbstractC0295Gu.m625r(-197250668034101L));
    L8:
        if (r02 == null) goto L19;
        m1347e(r32, r4.m142d());
        r32.setBackground(r02);
        if (r4.m142d() == false) goto L13;
        long r03 = -196962905225269L;
    L14:
        int r42 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(r03));
        if (r42 == 0) goto L20;
        String r04 = AbstractC0295Gu.m625r(-197800423847989L);
        Object[] r43 = {Integer.valueOf(r42)};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r32, r04, Arrays.copyOf(r43, 1));
        return;
    L20:
        return;
    L13:
        r03 = -197654394959925L;
        goto L14
    L19:
        return;
    L7:
        HashMap r05 = AbstractC0999XA.f3193a;
        r02 = C1517hw.m2890b(AbstractC0295Gu.m625r(-196834056206389L));
        goto L8
    }

    /* JADX INFO: renamed from: k */
    public static View m1351k(View r3) {
        Object r32 = r3.getParent();
        if (r32 != null) goto L5;
        return null;
    L5:
        if ((r32 instanceof ViewGroup) == false) goto L15;
        String r0 = r32.getClass().getName();
        AbstractC0295Gu.m625r(-198126841362485L);
        if (AbstractC2564tz.m5051L(r0, AbstractC0295Gu.m625r(-198182675937333L), false) == false) goto L12;
        return (View) r32;
    L12:
        return m1351k((View) r32);
    L15:
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static float m1352l(EdgeEffect r2) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return 0.0f;
    L5:
        return AbstractC1140af.m2056b(r2);
    }

    /* JADX INFO: renamed from: m */
    public static Object m1353m(Bundle r2, String r3) {
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        Parcelable r22 = r2.getParcelable(r3);
        if (C0689Q0.class.isInstance(r22) == false) goto L9;
        return r22;
    L9:
        return null;
    L5:
        return AbstractC0988X.m1877c(r2, r3);
    }

    /* JADX INFO: renamed from: r */
    public static final InterfaceC2100je m1354r(InterfaceC1332dm r7, boolean r8, AbstractC1507hm r9) {
        if ((r7 instanceof C2152km) == false) goto L7;
        return ((C2152km) r7).m4345C(r8, r9);
    L7:
        return r7.mo1747o(r9.mo1505j(), r8, new C1463gm(1, AbstractC1507hm.class, r9, "invoke", "invoke(Ljava/lang/Throwable;)V"));
    }

    /* JADX INFO: renamed from: t */
    public static float m1355t(EdgeEffect r2, float r3, float r4) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        AbstractC1095Ze.m2022a(r2, r3, r4);
        return r3;
    L5:
        return AbstractC1140af.m2057c(r2, r3, r4);
    }

    /* JADX INFO: renamed from: u */
    public static void m1356u(String r3) {
        Class<?> r32 = Class.forName(r3);     // Catch: ClassNotFoundException -> L23
    L6:
        throw new RuntimeException("Expected instanceof GlideModule, but found: " + r32.getDeclaredConstructor(null).newInstance(null));
    L11:
        e = move-exception;
        m1340A(r32, e);
        throw null;
    L13:
        e = move-exception;
        m1340A(r32, e);
        throw null;
    L9:
        e = move-exception;
        m1340A(r32, e);
        throw null;
    L7:
        e = move-exception;
        m1340A(r32, e);
        throw null;
    L23:
        e = move-exception;
        throw new IllegalArgumentException("Unable to find GlideModule implementation", e);
    }

    /* JADX INFO: renamed from: w */
    public static Cursor m1357w(String r7, String[] r8) {
        AbstractC0295Gu.m625r(-725827998185525L);
        Object r0 = f2143f;
        boolean r4 = false;
        if (r0 != null) goto L23;
    L11:
        if (r4 == true) goto L21;
        return null;
    L21:
        String r42 = AbstractC0295Gu.m625r(-725845178054709L);     // Catch: Exception -> L18
        AbstractC0295Gu.m625r(-578325936338997L);     // Catch: Exception -> L18
        Object r72 = XposedHelpers.callMethod(r0, r42, Arrays.copyOf(new Object[]{r7, r8}, 2));     // Catch: Exception -> L18
        if ((r72 instanceof Cursor) == false) goto L25;
        return (Cursor) r72;
    L25:
        return null;
    L18:
        f2143f = null;
        return null;
    L23:
        String r5 = AbstractC0295Gu.m625r(-726029861648437L);     // Catch: Exception -> L20
        AbstractC0295Gu.m625r(-578325936338997L);     // Catch: Exception -> L20
        Object r52 = XposedHelpers.callMethod(r0, r5, Arrays.copyOf(new Object[0], 0));     // Catch: Exception -> L20
        if ((r52 instanceof Boolean) == false) goto L9;
        Boolean r53 = (Boolean) r52;     // Catch: Exception -> L20
    L10:
        r4 = AbstractC0585Nj.m1134a(r53, Boolean.TRUE);     // Catch: Exception -> L20
        goto L11
    L9:
        r53 = null;
        goto L10
    }

    /* JADX INFO: renamed from: x */
    public static C0679Pr m1358x(MappedByteBuffer r13) {
        ByteBuffer r132 = r13.duplicate();
        r132.order(ByteOrder.BIG_ENDIAN);
        r132.position(r132.position() + 4);
        int r0 = r132.getShort() & 65535;
        if (r0 > 100) goto L28;
        r132.position(r132.position() + 6);
        int r1 = 0;
        int r3 = 0;
    L6:
        if (r3 >= r0) goto L11;
        int r8 = r132.getInt();
        r132.position(r132.position() + 4);
        long r9 = ((long) r132.getInt()) & 4294967295L;
        r132.position(r132.position() + 4);
        if (1835365473 == r8) goto L13;
        r3 = r3 + 1;
    L13:
        if (r9 == (-1)) goto L26;
        r132.position(r132.position() + ((int) (r9 - ((long) r132.position()))));
        r132.position(r132.position() + 12);
        long r6 = ((long) r132.getInt()) & 4294967295L;
    L16:
        if (r1 >= r6) goto L26;
        int r02 = r132.getInt();
        long r11 = ((long) r132.getInt()) & 4294967295L;
        r132.getInt();
        if (1164798569 == r02) goto L23;
        if (1701669481 == r02) goto L23;
        r1 = r1 + 1;
    L23:
        r132.position((int) (r11 + r9));
        C0679Pr r03 = new C0679Pr();
        r132.order(ByteOrder.LITTLE_ENDIAN);
        int r2 = r132.position() + r132.getInt(r132.position());
        r03.f8037d = r132;
        r03.f8034a = r2;
        int r22 = r2 - r132.getInt(r2);
        r03.f8035b = r22;
        r03.f8036c = ((ByteBuffer) r03.f8037d).getShort(r22);
        return r03;
    L26:
        throw new IOException("Cannot read metadata.");
    L11:
        r9 = -1;
        goto L13
    L28:
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: renamed from: y */
    public static void m1359y(Window r2, boolean r3) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 35) goto L7;
        AbstractC0945W.m1803d(r2, r3);
        return;
    L7:
        if (r0 < 30) goto L10;
        AbstractC0945W.m1802c(r2, r3);
        return;
    L10:
        View r22 = r2.getDecorView();
        int r02 = r22.getSystemUiVisibility();
        if (r3 == false) goto L13;
        int r32 = r02 & (-1793);
    L14:
        r22.setSystemUiVisibility(r32);
        return;
    L13:
        r32 = r02 | 1792;
        goto L14
    }

    /* JADX INFO: renamed from: i */
    public abstract String mo1360i(byte[] r1, int r2, int r3);

    /* JADX INFO: renamed from: j */
    public abstract int mo1361j(String r1, byte[] r2, int r3, int r4);

    /* JADX INFO: renamed from: n */
    public abstract int mo36n(View r1, ViewGroup.MarginLayoutParams r2);

    /* JADX INFO: renamed from: o */
    public abstract float mo191o(InterfaceC1300cy r1);

    /* JADX INFO: renamed from: p */
    public abstract int mo37p();

    /* JADX INFO: renamed from: q */
    public abstract ViewPropertyAnimator mo38q(View r1, int r2);

    /* JADX INFO: renamed from: s */
    public boolean m1362s(byte[] r1, int r2, int r3) {
        if (mo1363v(r1, r2, r3) != 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: v */
    public abstract int mo1363v(byte[] r1, int r2, int r3);

    /* JADX INFO: renamed from: z */
    public abstract void mo192z(InterfaceC1300cy r1, float r2);
}

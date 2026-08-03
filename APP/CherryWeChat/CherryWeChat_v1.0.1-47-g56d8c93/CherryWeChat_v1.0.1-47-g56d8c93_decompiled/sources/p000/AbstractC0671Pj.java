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
import java.lang.reflect.InvocationTargetException;
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
    public static final Object[] f2138a = new Object[0];

    /* JADX INFO: renamed from: b */
    public static final ExecutorC2346p3 f2139b = new ExecutorC2346p3(1);

    /* JADX INFO: renamed from: c */
    public static final ExecutorC2346p3 f2140c = new ExecutorC2346p3(2);

    /* JADX INFO: renamed from: d */
    public static final C2610v1 f2141d = new C2610v1("NULL", 10);

    /* JADX INFO: renamed from: e */
    public static final C1517hw f2142e = new C1517hw(6);

    /* JADX INFO: renamed from: f */
    public static Object f2143f;

    /* JADX INFO: renamed from: A */
    public static void m1340A(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    /* JADX INFO: renamed from: B */
    public static final Object[] m1341B(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArrCopyOf, i2);
                    }
                    i = i2;
                }
            }
        }
        return f2138a;
    }

    /* JADX INFO: renamed from: C */
    public static final Object[] m1342C(Collection collection, Object[] objArr) {
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: a */
    public static final C0104Cb m1343a(InterfaceC1137ac interfaceC1137ac) {
        if (interfaceC1137ac.mo24m(C1456gf.f5162f) == null) {
            interfaceC1137ac = interfaceC1137ac.mo23l(new C1419fm());
        }
        return new C0104Cb(interfaceC1137ac);
    }

    /* JADX INFO: renamed from: b */
    public static void m1344b(StringBuilder sb, Object obj, InterfaceC1416fj interfaceC1416fj) {
        if (interfaceC1416fj != null) {
            sb.append((CharSequence) interfaceC1416fj.mo90g(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m1345c(View view) {
        C2537tE c2537tE = new C2537tE(view, null);
        C2820zx c2820zx = new C2820zx();
        c2820zx.f9541d = AbstractC0628Oj.m1242k(c2820zx, c2820zx, c2537tE);
        while (c2820zx.hasNext()) {
            View view2 = (View) c2820zx.next();
            C0981Wt c0981Wt = (C0981Wt) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (c0981Wt == null) {
                c0981Wt = new C0981Wt();
                view2.setTag(R.id.pooling_container_listener_holder_tag, c0981Wt);
            }
            ArrayList arrayList = c0981Wt.f3064a;
            int iM4976a0 = AbstractC2496sa.m4976a0(arrayList);
            if (-1 < iM4976a0) {
                arrayList.get(iM4976a0).getClass();
                throw new ClassCastException();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m1346d(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: e */
    public static void m1347e(View view, boolean z) {
        if (z) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingLeft(), view.getPaddingBottom());
        } else {
            view.setPadding(view.getPaddingRight(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1348f(ViewGroup viewGroup, int i, boolean z, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setBackground(null);
            m1347e(childAt, z2);
            if (z && childAt.getClass().getName().equals(AbstractC0295Gu.m625r(-198753906587701L))) {
                String strM625r = AbstractC0295Gu.m625r(-198908525410357L);
                Object[] objArr = {Integer.valueOf(Color.argb(155, Color.red(i), Color.green(i), Color.blue(i)))};
                AbstractC0295Gu.m625r(-578325936338997L);
                XposedHelpers.callMethod(childAt, strM625r, Arrays.copyOf(objArr, 1));
            } else if (z && childAt.getClass().getName().equals(AbstractC0295Gu.m625r(-198964359985205L))) {
                String strM625r2 = AbstractC0295Gu.m625r(-198586402863157L);
                Object[] objArr2 = {Integer.valueOf(i)};
                AbstractC0295Gu.m625r(-578325936338997L);
                XposedHelpers.callMethod(childAt, strM625r2, Arrays.copyOf(objArr2, 1));
            }
            if (childAt instanceof ViewGroup) {
                m1348f((ViewGroup) childAt, i, z, z2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1349g(C0089C2 c0089c2) {
        TextView textView;
        Object obj = c0089c2.f202h;
        C2648vx c2648vx = new C2648vx();
        boolean z = obj instanceof Class;
        View childAt = null;
        if (z) {
            c2648vx.f9163b = (Class) obj;
        } else {
            c2648vx.f9164c = obj;
            c2648vx.f9163b = obj != null ? obj.getClass() : null;
        }
        c2648vx.m5182e(AbstractC0295Gu.m625r(-167104292583477L));
        View view = (View) c2648vx.m5178a();
        if (view != null) {
            childAt = view;
        } else {
            C2648vx c2648vx2 = new C2648vx();
            if (z) {
                c2648vx2.f9163b = (Class) obj;
            } else {
                c2648vx2.f9164c = obj;
                c2648vx2.f9163b = obj != null ? obj.getClass() : null;
            }
            c2648vx2.f9165d = LinearLayout.class;
            ViewGroup viewGroup = (ViewGroup) c2648vx2.m5178a();
            if (viewGroup != null) {
                childAt = viewGroup.getChildAt(0);
            }
        }
        HashMap map = AbstractC0999XA.f3193a;
        int iM2889a = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-198642237438005L));
        if (iM2889a != 0 && childAt != null) {
            String strM625r = AbstractC0295Gu.m625r(-197104639146037L);
            Object[] objArr = {Integer.valueOf(iM2889a)};
            AbstractC0295Gu.m625r(-578325936338997L);
            XposedHelpers.callMethod(childAt, strM625r, Arrays.copyOf(objArr, 1));
        }
        if (iM2889a == 0 || (textView = (TextView) c0089c2.f200f) == null) {
            return;
        }
        textView.setTextColor(iM2889a);
    }

    /* JADX INFO: renamed from: h */
    public static void m1350h(C0089C2 c0089c2, C0089C2 c0089c22) {
        Drawable drawableM2890b;
        View viewM141c = c0089c2.m141c();
        if (viewM141c != null) {
            if (c0089c22.m142d()) {
                HashMap map = AbstractC0999XA.f3193a;
                drawableM2890b = C1517hw.m2890b(AbstractC0295Gu.m625r(-197250668034101L));
            } else {
                HashMap map2 = AbstractC0999XA.f3193a;
                drawableM2890b = C1517hw.m2890b(AbstractC0295Gu.m625r(-196834056206389L));
            }
            if (drawableM2890b != null) {
                m1347e(viewM141c, c0089c22.m142d());
                viewM141c.setBackground(drawableM2890b);
                int iM2889a = C1517hw.m2889a(0, AbstractC0295Gu.m625r(c0089c22.m142d() ? -196962905225269L : -197654394959925L));
                if (iM2889a != 0) {
                    String strM625r = AbstractC0295Gu.m625r(-197800423847989L);
                    Object[] objArr = {Integer.valueOf(iM2889a)};
                    AbstractC0295Gu.m625r(-578325936338997L);
                    XposedHelpers.callMethod(viewM141c, strM625r, Arrays.copyOf(objArr, 1));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static View m1351k(View view) {
        Object parent = view.getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            return null;
        }
        String name = parent.getClass().getName();
        AbstractC0295Gu.m625r(-198126841362485L);
        return AbstractC2564tz.m5051L(name, AbstractC0295Gu.m625r(-198182675937333L), false) ? (View) parent : m1351k((View) parent);
    }

    /* JADX INFO: renamed from: l */
    public static float m1352l(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1140af.m2056b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: m */
    public static Object m1353m(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC0988X.m1877c(bundle, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C0689Q0.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static final InterfaceC2100je m1354r(InterfaceC1332dm interfaceC1332dm, boolean z, AbstractC1507hm abstractC1507hm) {
        return interfaceC1332dm instanceof C2152km ? ((C2152km) interfaceC1332dm).m4345C(z, abstractC1507hm) : interfaceC1332dm.mo1747o(abstractC1507hm.mo1505j(), z, new C1463gm(1, AbstractC1507hm.class, abstractC1507hm, "invoke", "invoke(Ljava/lang/Throwable;)V"));
    }

    /* JADX INFO: renamed from: t */
    public static float m1355t(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1140af.m2057c(edgeEffect, f, f2);
        }
        AbstractC1095Ze.m2022a(edgeEffect, f, f2);
        return f;
    }

    /* JADX INFO: renamed from: u */
    public static void m1356u(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e) {
                m1340A(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                m1340A(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m1340A(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m1340A(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* JADX INFO: renamed from: w */
    public static Cursor m1357w(String str, String[] strArr) {
        AbstractC0295Gu.m625r(-725827998185525L);
        Object obj = f2143f;
        boolean zM1134a = false;
        if (obj != null) {
            try {
                String strM625r = AbstractC0295Gu.m625r(-726029861648437L);
                AbstractC0295Gu.m625r(-578325936338997L);
                Object objCallMethod = XposedHelpers.callMethod(obj, strM625r, Arrays.copyOf(new Object[0], 0));
                zM1134a = AbstractC0585Nj.m1134a(objCallMethod instanceof Boolean ? (Boolean) objCallMethod : null, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
        if (!zM1134a) {
            return null;
        }
        try {
            String strM625r2 = AbstractC0295Gu.m625r(-725845178054709L);
            AbstractC0295Gu.m625r(-578325936338997L);
            Object objCallMethod2 = XposedHelpers.callMethod(obj, strM625r2, Arrays.copyOf(new Object[]{str, strArr}, 2));
            if (objCallMethod2 instanceof Cursor) {
                return (Cursor) objCallMethod2;
            }
            return null;
        } catch (Exception unused2) {
            f2143f = null;
            return null;
        }
    }

    /* JADX INFO: renamed from: x */
    public static C0679Pr m1358x(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    C0679Pr c0679Pr = new C0679Pr();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c0679Pr.f8037d = byteBufferDuplicate;
                    c0679Pr.f8034a = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c0679Pr.f8035b = i6;
                    c0679Pr.f8036c = ((ByteBuffer) c0679Pr.f8037d).getShort(i6);
                    return c0679Pr;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: renamed from: y */
    public static void m1359y(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            AbstractC0945W.m1803d(window, z);
        } else {
            if (i >= 30) {
                AbstractC0945W.m1802c(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract String mo1360i(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: j */
    public abstract int mo1361j(String str, byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: n */
    public abstract int mo36n(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    /* JADX INFO: renamed from: o */
    public abstract float mo191o(InterfaceC1300cy interfaceC1300cy);

    /* JADX INFO: renamed from: p */
    public abstract int mo37p();

    /* JADX INFO: renamed from: q */
    public abstract ViewPropertyAnimator mo38q(View view, int i);

    /* JADX INFO: renamed from: s */
    public boolean m1362s(byte[] bArr, int i, int i2) {
        return mo1363v(bArr, i, i2) == 0;
    }

    /* JADX INFO: renamed from: v */
    public abstract int mo1363v(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: z */
    public abstract void mo192z(InterfaceC1300cy interfaceC1300cy, float f);
}

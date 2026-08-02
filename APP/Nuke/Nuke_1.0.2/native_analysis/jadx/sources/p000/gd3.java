package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import de.robv.android.xposed.XposedBridge;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.InvalidPathException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gd3 implements InterfaceC0927yl, x00, z10, InterfaceC0662rn, ks2, InterfaceC0814vl, kh1 {

    /* JADX INFO: renamed from: K */
    public static final um2 f3424K;

    /* JADX INFO: renamed from: M */
    public static final um2 f3426M;

    /* JADX INFO: renamed from: N */
    public static final um2 f3427N;

    /* JADX INFO: renamed from: i */
    public static final gd3 f3431i;

    /* JADX INFO: renamed from: l */
    public static final gd3 f3434l;

    /* JADX INFO: renamed from: m */
    public static final gd3 f3435m;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3449h;

    /* JADX INFO: renamed from: j */
    public static final gd3 f3432j = new gd3(1);

    /* JADX INFO: renamed from: k */
    public static final gd3 f3433k = new gd3(2);

    /* JADX INFO: renamed from: n */
    public static final gd3 f3436n = new gd3(5);

    /* JADX INFO: renamed from: o */
    public static final gd3 f3437o = new gd3(6);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ gd3 f3438p = new gd3(7);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ gd3 f3439q = new gd3(8);

    /* JADX INFO: renamed from: r */
    public static final gd3 f3440r = new gd3(9);

    /* JADX INFO: renamed from: s */
    public static final gd3 f3441s = new gd3(10);

    /* JADX INFO: renamed from: t */
    public static final d61 f3442t = d61.f1885h;

    /* JADX INFO: renamed from: u */
    public static final h70 f3443u = new h70(1.0f, 1.0f);

    /* JADX INFO: renamed from: v */
    public static final gd3 f3444v = new gd3(11);

    /* JADX INFO: renamed from: w */
    public static final o62 f3445w = new o62(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: x */
    public static final gd3 f3446x = new gd3(13);

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ gd3 f3447y = new gd3(14);

    /* JADX INFO: renamed from: z */
    public static final gd3 f3448z = new gd3(15);

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ gd3 f3414A = new gd3(16);

    /* JADX INFO: renamed from: B */
    public static final gd3 f3415B = new gd3(17);

    /* JADX INFO: renamed from: C */
    public static final gd3 f3416C = new gd3(18);

    /* JADX INFO: renamed from: D */
    public static final gd3 f3417D = new gd3(19);

    /* JADX INFO: renamed from: E */
    public static final gd3 f3418E = new gd3(20);

    /* JADX INFO: renamed from: F */
    public static final c80 f3419F = new c80(25);

    /* JADX INFO: renamed from: G */
    public static final gd3 f3420G = new gd3(22);

    /* JADX INFO: renamed from: H */
    public static final c80 f3421H = new c80(27);

    /* JADX INFO: renamed from: I */
    public static final c80 f3422I = new c80(28);

    /* JADX INFO: renamed from: J */
    public static final c80 f3423J = new c80(29);

    /* JADX INFO: renamed from: L */
    public static final gd3 f3425L = new gd3(24);

    /* JADX INFO: renamed from: O */
    public static final gd3 f3428O = new gd3(26);

    /* JADX INFO: renamed from: P */
    public static final um2 f3429P = new um2(12);

    /* JADX INFO: renamed from: Q */
    public static final qf3 f3430Q = new qf3();

    static {
        int i = 0;
        f3431i = new gd3(i);
        int i2 = 3;
        f3434l = new gd3(i2);
        int i3 = 4;
        f3435m = new gd3(i3);
        f3424K = new um2(i);
        f3426M = new um2(i2);
        f3427N = new um2(i3);
    }

    public /* synthetic */ gd3(int i) {
        this.f3449h = i;
    }

    /* JADX INFO: renamed from: h */
    public static qo2 m1835h(po2 po2Var, io2 io2Var, String str, String str2, String str3, Throwable th) {
        Object x92Var;
        jo2 jo2Var = new jo2(po2Var, io2Var, str, str2, str3, th);
        StringBuilder sb = new StringBuilder();
        String lowerCase = po2Var.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        sb.append(lowerCase.concat(" send failed: "));
        sb.append(str);
        if (th != null) {
            sb.append("\n".concat(fg1.m1624Q(th)));
        }
        String string = sb.toString().toString();
        try {
            XposedBridge.log("[WeMsgApi]" + string);
            x92Var = a83.f116a;
        } catch (Throwable th2) {
            x92Var = new x92(th2);
        }
        if (x92Var instanceof x92) {
            Log.println(6, "WeMsgApi", string);
        }
        return new qo2(jo2Var);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ qo2 m1836i(po2 po2Var, io2 io2Var, String str, String str2, String str3, Throwable th, int i) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            th = null;
        }
        return m1835h(po2Var, io2Var, str, str2, str3, th);
    }

    /* JADX INFO: renamed from: k */
    public static qo2 m1837k(po2 po2Var, String str, String str2, Throwable th) {
        Throwable cause = th;
        while (cause.getCause() != null && cause.getCause() != cause) {
            cause = cause.getCause();
            cause.getClass();
        }
        io2 io2Var = cause instanceof UnsatisfiedLinkError ? io2.f4726r : cause instanceof InvalidPathException ? io2.f4718j : cause instanceof IOException ? io2.f4722n : cause instanceof ReflectiveOperationException ? io2.f4727s : io2.f4728t;
        String message = cause.getMessage();
        if (message == null) {
            message = cause.getClass().getSimpleName();
        }
        return m1835h(po2Var, io2Var, message, str, str2, th);
    }

    /* JADX INFO: renamed from: l */
    public static so2 m1838l(String str, String str2) {
        str.getClass();
        str2.getClass();
        boolean zM4006s0 = pv2.m4006s0(str);
        po2 po2Var = po2.f8424h;
        if (zM4006s0) {
            return m1836i(po2Var, io2.f4716h, "Talker is empty", str, null, null, 48);
        }
        if (pv2.m4006s0(str2)) {
            return m1836i(po2Var, io2.f4717i, "Text content is empty", str, null, null, 48);
        }
        try {
            fn1.f3069d.getClass();
            Object objM1142c = AbstractC0141dt.m1142c((Class) fn1.f3071f.getValue(), new Object[]{str, str2, 1, 0, 0});
            bn1.f944d.getClass();
            Object objInvoke = ((Method) bn1.f948h.getValue()).invoke(bn1.f947g.getValue(), objM1142c);
            objInvoke.getClass();
            return !((Boolean) objInvoke).booleanValue() ? m1836i(po2Var, io2.f4723o, "WeChat rejected the text message task", str, null, null, 48) : new ro2(new mo2(str, str2));
        } catch (Throwable th) {
            return m1837k(po2Var, str, null, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1839a(Drawable drawable, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(257732500);
        int i2 = 4;
        int i3 = (go0Var.m1984h(drawable) ? 4 : 2) | i;
        if (go0Var.m1958O(i3 & 1, (i3 & 3) != 2)) {
            uh1 uh1VarM5211g0 = AbstractC0731te.m5211g0(rh1.f9587a, o00.f7392e);
            boolean zM1984h = go0Var.m1984h(drawable);
            Object objM1956L = go0Var.m1956L();
            if (zM1984h || objM1956L == C0520nx.f7360a) {
                objM1956L = new xq2(i2, drawable);
                go0Var.m1981f0(objM1956L);
            }
            AbstractC0135dm.m1057a(qp0.m4264s(uh1VarM5211g0, (in0) objM1956L), go0Var, 0);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0016af(i, 19, this, drawable);
        }
    }

    @Override // p000.InterfaceC0662rn
    /* JADX INFO: renamed from: b */
    public e70 mo1840b() {
        return f3443u;
    }

    @Override // p000.ks2
    /* JADX INFO: renamed from: c */
    public boolean mo1841c(Object obj, Object obj2) {
        return false;
    }

    @Override // p000.InterfaceC0662rn
    /* JADX INFO: renamed from: d */
    public long mo1842d() {
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: e */
    public void m1843e(final Icon icon, InterfaceC0596px interfaceC0596px, final int i) {
        b62 b62VarM1996r;
        mn0 mn0Var;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(2116504409);
        int i2 = (go0Var.m1984h(icon) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) go0Var.m1988j(AbstractC0646r7.f9411b);
            boolean zM1980f = go0Var.m1980f(icon) | go0Var.m1980f(context);
            Object objM1956L = go0Var.m1956L();
            if (zM1980f || objM1956L == C0520nx.f7360a) {
                objM1956L = icon.loadDrawable(context);
                go0Var.m1981f0(objM1956L);
            }
            Drawable drawable = (Drawable) objM1956L;
            if (drawable == null) {
                b62VarM1996r = go0Var.m1996r();
                if (b62VarM1996r != null) {
                    mn0Var = new mn0(this, icon, i, i3) { // from class: wy2

                        /* JADX INFO: renamed from: h */
                        public final /* synthetic */ int f12737h;

                        /* JADX INFO: renamed from: i */
                        public final /* synthetic */ gd3 f12738i;

                        /* JADX INFO: renamed from: j */
                        public final /* synthetic */ Icon f12739j;

                        {
                            this.f12737h = i3;
                            this.f12738i = this;
                        }

                        @Override // p000.mn0
                        /* JADX INFO: renamed from: g */
                        public final Object mo12g(Object obj, Object obj2) {
                            int i5 = this.f12737h;
                            a83 a83Var = a83.f116a;
                            Icon icon2 = this.f12739j;
                            gd3 gd3Var = this.f12738i;
                            InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    gd3Var.m1843e(icon2, interfaceC0596px2, pp0.m3902N(49));
                                    break;
                                default:
                                    gd3Var.m1843e(icon2, interfaceC0596px2, pp0.m3902N(49));
                                    break;
                            }
                            return a83Var;
                        }
                    };
                    b62VarM1996r.f616d = mn0Var;
                }
                return;
            }
            m1839a(drawable, go0Var, 48);
        } else {
            go0Var.m1961R();
        }
        b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            mn0Var = new mn0(this, icon, i, i4) { // from class: wy2

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ int f12737h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ gd3 f12738i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ Icon f12739j;

                {
                    this.f12737h = i4;
                    this.f12738i = this;
                }

                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    int i5 = this.f12737h;
                    a83 a83Var = a83.f116a;
                    Icon icon2 = this.f12739j;
                    gd3 gd3Var = this.f12738i;
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            gd3Var.m1843e(icon2, interfaceC0596px2, pp0.m3902N(49));
                            break;
                        default:
                            gd3Var.m1843e(icon2, interfaceC0596px2, pp0.m3902N(49));
                            break;
                    }
                    return a83Var;
                }
            };
            b62VarM1996r.f616d = mn0Var;
        }
    }

    @Override // p000.InterfaceC0814vl
    /* JADX INFO: renamed from: f */
    public long mo1844f(bo0 bo0Var, int i) {
        String str = ((y03) bo0Var.f960e).f13266a.f12754a.f10051i;
        return fg1.m1636i(fg1.m1647v(str, i), fg1.m1646u(str, i));
    }

    @Override // p000.InterfaceC0927yl
    /* JADX INFO: renamed from: g */
    public Rect mo1845g(Activity activity) throws Exception {
        C0890xl c0890xl = InterfaceC0927yl.f13504a;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutoutM39j = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                objInvoke.getClass();
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                objInvoke2.getClass();
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            c0890xl.getClass();
            Log.w(C0890xl.f13071b, e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                if (AbstractC0005a4.m53x(obj2)) {
                    displayCutoutM39j = AbstractC0005a4.m39j(obj2);
                }
            } catch (Exception e2) {
                if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                    throw e2;
                }
                c0890xl.getClass();
                Log.w(C0890xl.f13071b, e2);
            }
            if (displayCutoutM39j != null) {
                if (rect.left == displayCutoutM39j.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutoutM39j.getSafeInsetRight()) {
                    rect.right = displayCutoutM39j.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutoutM39j.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutoutM39j.getSafeInsetBottom()) {
                    rect.bottom = displayCutoutM39j.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }

    @Override // p000.InterfaceC0662rn
    public d61 getLayoutDirection() {
        return f3442t;
    }

    /* JADX WARN: Finally extract failed */
    @Override // p000.x00
    /* JADX INFO: renamed from: j */
    public Object mo1846j(Object obj) {
        switch (this.f3449h) {
            case 3:
                u92 u92Var = (u92) obj;
                try {
                    C0209fn c0209fn = new C0209fn();
                    u92Var.mo275g().mo1681i(c0209fn);
                    t92 t92Var = new t92(u92Var.mo274e(), u92Var.mo273c(), c0209fn);
                    u92Var.close();
                    return t92Var;
                } catch (Throwable th) {
                    u92Var.close();
                    throw th;
                }
            case 4:
                return (u92) obj;
            default:
                ((u92) obj).close();
                return null;
        }
    }

    @Override // p000.kh1
    /* JADX INFO: renamed from: q */
    public jh1 mo1330q(kj1 kj1Var) {
        return b83.f738b;
    }

    public String toString() {
        switch (this.f3449h) {
            case 18:
                return "NeverEqualPolicy";
            default:
                return super.toString();
        }
    }
}

package defpackage;

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
public final class gd3 implements yl, x00, z10, rn, ks2, vl, kh1 {
    public static final um2 K;
    public static final um2 M;
    public static final um2 N;
    public static final gd3 i;
    public static final gd3 l;
    public static final gd3 m;
    public final /* synthetic */ int h;
    public static final gd3 j = new gd3(1);
    public static final gd3 k = new gd3(2);
    public static final gd3 n = new gd3(5);
    public static final gd3 o = new gd3(6);
    public static final /* synthetic */ gd3 p = new gd3(7);
    public static final /* synthetic */ gd3 q = new gd3(8);
    public static final gd3 r = new gd3(9);
    public static final gd3 s = new gd3(10);
    public static final d61 t = d61.h;
    public static final h70 u = new h70(1.0f, 1.0f);
    public static final gd3 v = new gd3(11);
    public static final o62 w = new o62(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final gd3 x = new gd3(13);
    public static final /* synthetic */ gd3 y = new gd3(14);
    public static final gd3 z = new gd3(15);
    public static final /* synthetic */ gd3 A = new gd3(16);
    public static final gd3 B = new gd3(17);
    public static final gd3 C = new gd3(18);
    public static final gd3 D = new gd3(19);
    public static final gd3 E = new gd3(20);
    public static final c80 F = new c80(25);
    public static final gd3 G = new gd3(22);
    public static final c80 H = new c80(27);
    public static final c80 I = new c80(28);
    public static final c80 J = new c80(29);
    public static final gd3 L = new gd3(24);
    public static final gd3 O = new gd3(26);
    public static final um2 P = new um2(12);
    public static final qf3 Q = new qf3();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i2 = 0;
        i = new gd3(i2);
        int i3 = 3;
        l = new gd3(i3);
        int i4 = 4;
        m = new gd3(i4);
        K = new um2(i2);
        M = new um2(i3);
        N = new um2(i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [eu.D(android.content.Context):yl0, gd3.<clinit>():void] */
    public /* synthetic */ gd3(int i2) {
        this.h = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static qo2 h(po2 po2Var, io2 io2Var, String str, String str2, String str3, Throwable th) {
        Object x92Var;
        jo2 jo2Var = new jo2(po2Var, io2Var, str, str2, str3, th);
        StringBuilder sb = new StringBuilder();
        String lowerCase = po2Var.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        sb.append(lowerCase.concat(" send failed: "));
        sb.append(str);
        if (th != null) {
            sb.append("\n".concat(fg1.Q(th)));
        }
        String string = sb.toString().toString();
        try {
            XposedBridge.log("[WeMsgApi]" + string);
            x92Var = a83.a;
        } catch (Throwable th2) {
            x92Var = new x92(th2);
        }
        if (x92Var instanceof x92) {
            Log.println(6, "WeMsgApi", string);
        }
        return new qo2(jo2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ qo2 i(po2 po2Var, io2 io2Var, String str, String str2, String str3, Throwable th, int i2) {
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        if ((i2 & 32) != 0) {
            th = null;
        }
        return h(po2Var, io2Var, str, str2, str3, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static qo2 k(po2 po2Var, String str, String str2, Throwable th) {
        Throwable cause = th;
        while (cause.getCause() != null && cause.getCause() != cause) {
            cause = cause.getCause();
            cause.getClass();
        }
        io2 io2Var = cause instanceof UnsatisfiedLinkError ? io2.r : cause instanceof InvalidPathException ? io2.j : cause instanceof IOException ? io2.n : cause instanceof ReflectiveOperationException ? io2.s : io2.t;
        String message = cause.getMessage();
        if (message == null) {
            message = cause.getClass().getSimpleName();
        }
        return h(po2Var, io2Var, message, str, str2, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static so2 l(String str, String str2) {
        str.getClass();
        str2.getClass();
        boolean zS0 = pv2.s0(str);
        po2 po2Var = po2.h;
        if (zS0) {
            return i(po2Var, io2.h, "Talker is empty", str, null, null, 48);
        }
        if (pv2.s0(str2)) {
            return i(po2Var, io2.i, "Text content is empty", str, null, null, 48);
        }
        try {
            fn1.d.getClass();
            Object objC = dt.c((Class) fn1.f.getValue(), new Object[]{str, str2, 1, 0, 0});
            bn1.d.getClass();
            Object objInvoke = ((Method) bn1.h.getValue()).invoke(bn1.g.getValue(), objC);
            objInvoke.getClass();
            return !((Boolean) objInvoke).booleanValue() ? i(po2Var, io2.o, "WeChat rejected the text message task", str, null, null, 48) : new ro2(new mo2(str, str2));
        } catch (Throwable th) {
            return k(po2Var, str, null, th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(Drawable drawable, px pxVar, int i2) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(257732500);
        int i3 = 4;
        int i4 = (go0Var.h(drawable) ? 4 : 2) | i2;
        if (go0Var.O(i4 & 1, (i4 & 3) != 2)) {
            uh1 uh1VarG0 = te.g0(rh1.a, o00.e);
            boolean zH = go0Var.h(drawable);
            Object objL = go0Var.L();
            if (zH || objL == nx.a) {
                objL = new xq2(i3, drawable);
                go0Var.f0(objL);
            }
            dm.a(qp0.s(uh1VarG0, (in0) objL), go0Var, 0);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new af(i2, 19, this, drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rn
    public e70 b() {
        return u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ks2
    public boolean c(Object obj, Object obj2) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rn
    public long d() {
        return 9205357640488583168L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(final Icon icon, px pxVar, final int i2) {
        b62 b62VarR;
        mn0 mn0Var;
        go0 go0Var = (go0) pxVar;
        go0Var.X(2116504409);
        int i3 = (go0Var.h(icon) ? 4 : 2) | i2;
        final int i4 = 0;
        final int i5 = 1;
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) go0Var.j(r7.b);
            boolean zF = go0Var.f(icon) | go0Var.f(context);
            Object objL = go0Var.L();
            if (zF || objL == nx.a) {
                objL = icon.loadDrawable(context);
                go0Var.f0(objL);
            }
            Drawable drawable = (Drawable) objL;
            if (drawable == null) {
                b62VarR = go0Var.r();
                if (b62VarR != null) {
                    mn0Var = new mn0(this, icon, i2, i4) { // from class: wy2
                        public final /* synthetic */ int h;
                        public final /* synthetic */ gd3 i;
                        public final /* synthetic */ Icon j;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        {
                            this.h = i4;
                            this.i = this;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.mn0
                        public final Object g(Object obj, Object obj2) {
                            int i6 = this.h;
                            a83 a83Var = a83.a;
                            Icon icon2 = this.j;
                            gd3 gd3Var = this.i;
                            px pxVar2 = (px) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    gd3Var.e(icon2, pxVar2, pp0.N(49));
                                    break;
                                default:
                                    gd3Var.e(icon2, pxVar2, pp0.N(49));
                                    break;
                            }
                            return a83Var;
                        }
                    };
                    b62VarR.d = mn0Var;
                }
                return;
            }
            a(drawable, go0Var, 48);
        } else {
            go0Var.R();
        }
        b62VarR = go0Var.r();
        if (b62VarR != null) {
            mn0Var = new mn0(this, icon, i2, i5) { // from class: wy2
                public final /* synthetic */ int h;
                public final /* synthetic */ gd3 i;
                public final /* synthetic */ Icon j;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.h = i5;
                    this.i = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    int i6 = this.h;
                    a83 a83Var = a83.a;
                    Icon icon2 = this.j;
                    gd3 gd3Var = this.i;
                    px pxVar2 = (px) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            gd3Var.e(icon2, pxVar2, pp0.N(49));
                            break;
                        default:
                            gd3Var.e(icon2, pxVar2, pp0.N(49));
                            break;
                    }
                    return a83Var;
                }
            };
            b62VarR.d = mn0Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vl
    public long f(bo0 bo0Var, int i2) {
        String str = ((y03) bo0Var.e).a.a.i;
        return fg1.i(fg1.v(str, i2), fg1.u(str, i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yl
    public Rect g(Activity activity) throws Exception {
        xl xlVar = yl.a;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutoutJ = null;
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
            xlVar.getClass();
            Log.w(xl.b, e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = rect.bottom + dimensionPixelSize;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i3 = rect.right + dimensionPixelSize;
                if (i3 == point.x) {
                    rect.right = i3;
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
                if (a4.x(obj2)) {
                    displayCutoutJ = a4.j(obj2);
                }
            } catch (Exception e2) {
                if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                    throw e2;
                }
                xlVar.getClass();
                Log.w(xl.b, e2);
            }
            if (displayCutoutJ != null) {
                if (rect.left == displayCutoutJ.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutoutJ.getSafeInsetRight()) {
                    rect.right = displayCutoutJ.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutoutJ.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutoutJ.getSafeInsetBottom()) {
                    rect.bottom = displayCutoutJ.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rn
    public d61 getLayoutDirection() {
        return t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[INVOKE, CONST] complete}, expected: {[INVOKE] complete} */
    /* JADX WARN: Finally extract failed */
    @Override // defpackage.x00
    public Object j(Object obj) {
        switch (this.h) {
            case 3:
                u92 u92Var = (u92) obj;
                try {
                    fn fnVar = new fn();
                    u92Var.g().i(fnVar);
                    t92 t92Var = new t92(u92Var.e(), u92Var.c(), fnVar);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kh1
    public jh1 q(kj1 kj1Var) {
        return b83.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.h) {
            case 18:
                return "NeverEqualPolicy";
            default:
                return super.toString();
        }
    }
}

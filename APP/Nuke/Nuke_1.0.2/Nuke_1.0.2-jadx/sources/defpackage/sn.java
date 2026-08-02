package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sn implements x00, yl, f70, i81, z92, z10, ks2, vl, l03, n92, pf3 {
    public static final s A;
    public static final x7 B;
    public static final x7 C;
    public static final sn D;
    public static final sn E;
    public static final sn F;
    public static final sn G;
    public static final sn H;
    public static final sn I;
    public static final /* synthetic */ sn J;
    public static final /* synthetic */ sn K;
    public static final sn L;
    public static final /* synthetic */ sn M;
    public static final sn N;
    public static final /* synthetic */ sn O;
    public static final sn P;
    public static final c80 Q;
    public static final c80 R;
    public static final sn S;
    public static final sn T;
    public static final sn U;
    public static final sn V;
    public static final sn W;
    public static final sn X;
    public static final sn i = new sn(0);
    public static final rk j = new rk(-1.0f, -1.0f);
    public static final rk k = new rk(0.0f, -1.0f);
    public static final rk l = new rk(1.0f, -1.0f);
    public static final rk m = new rk(-1.0f, 0.0f);
    public static final rk n = new rk(0.0f, 0.0f);
    public static final rk o = new rk(1.0f, 0.0f);
    public static final rk p = new rk(-1.0f, 1.0f);
    public static final rk q = new rk(0.0f, 1.0f);
    public static final rk r = new rk(1.0f, 1.0f);
    public static final qk s = new qk(-1.0f);
    public static final qk t = new qk(0.0f);
    public static final pk u = new pk(-1.0f);
    public static final pk v = new pk(0.0f);
    public static final sn w;
    public static final sn x;
    public static final sn y;
    public static final sn z;
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new pk(1.0f);
        w = new sn(2);
        x = new sn(3);
        y = new sn(4);
        z = new sn(5);
        A = new s(8);
        B = new x7(1);
        C = new x7(2);
        D = new sn(8);
        E = new sn(9);
        F = new sn(10);
        G = new sn(11);
        H = new sn(12);
        I = new sn(13);
        J = new sn(14);
        K = new sn(15);
        L = new sn(16);
        M = new sn(17);
        N = new sn(18);
        O = new sn(19);
        P = new sn(20);
        Q = new c80(24);
        R = new c80(26);
        S = new sn(23);
        T = new sn(24);
        U = new sn(25);
        V = new sn(26);
        W = new sn(27);
        X = new sn(28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [sn.<clinit>():void] */
    public /* synthetic */ sn(int i2) {
        this.h = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l03
    public float a() {
        return Float.NaN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l03
    public long b() {
        int i2 = ju.h;
        return ju.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ks2
    public boolean c(Object obj, Object obj2) {
        switch (this.h) {
            case AIChatConfig.MaxContextRounds /* 20 */:
                return obj == obj2;
            default:
                return t11.l(obj, obj2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pf3
    public lf3 d(ContextWrapper contextWrapper, f70 f70Var) {
        f70Var.getClass();
        Context baseContext = contextWrapper;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = contextWrapper;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper2.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            yl.a.getClass();
            int i2 = Build.VERSION.SDK_INT;
            return new lf3(new wl((i2 >= 30 ? zl.h : i2 >= 29 ? x : i2 >= 28 ? gd3.k : w).g(activity)), f70Var.h(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            s.j("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = contextWrapper.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new lf3(new Rect(0, 0, point.x, point.y), f70Var.h(contextWrapper));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vl
    public long f(bo0 bo0Var, int i2) {
        return ((y03) bo0Var.e).i(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yl
    public Rect g(Activity activity) throws Exception {
        switch (this.h) {
            case 2:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
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
                        }
                    }
                }
                return rect;
            default:
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                    objInvoke.getClass();
                    return new Rect((Rect) objInvoke);
                } catch (Exception e) {
                    if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    yl.a.getClass();
                    Log.w(xl.b, e);
                    return gd3.k.g(activity);
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f70
    public float h(ContextWrapper contextWrapper) {
        return contextWrapper.getResources().getDisplayMetrics().density;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x00
    public Object j(Object obj) {
        switch (this.h) {
            case 0:
                return obj.toString();
            case 4:
                return (o82) obj;
            default:
                ((u92) obj).close();
                return a83.a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l03
    public an k() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.h) {
            case AIChatConfig.MaxContextRounds /* 20 */:
                return "ReferentialEqualityPolicy";
            case 24:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.i81
    public void cancel() {
    }

    @Override // defpackage.i81
    public void e() {
    }

    @Override // defpackage.n92
    public d92 i(d92 d92Var, ov1 ov1Var) {
        return d92Var;
    }
}

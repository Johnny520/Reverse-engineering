package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: sn */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0700sn implements x00, InterfaceC0927yl, f70, i81, z92, z10, ks2, InterfaceC0814vl, l03, n92, pf3 {

    /* JADX INFO: renamed from: A */
    public static final C0676s f10197A;

    /* JADX INFO: renamed from: B */
    public static final C0874x7 f10198B;

    /* JADX INFO: renamed from: C */
    public static final C0874x7 f10199C;

    /* JADX INFO: renamed from: D */
    public static final C0700sn f10200D;

    /* JADX INFO: renamed from: E */
    public static final C0700sn f10201E;

    /* JADX INFO: renamed from: F */
    public static final C0700sn f10202F;

    /* JADX INFO: renamed from: G */
    public static final C0700sn f10203G;

    /* JADX INFO: renamed from: H */
    public static final C0700sn f10204H;

    /* JADX INFO: renamed from: I */
    public static final C0700sn f10205I;

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ C0700sn f10206J;

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ C0700sn f10207K;

    /* JADX INFO: renamed from: L */
    public static final C0700sn f10208L;

    /* JADX INFO: renamed from: M */
    public static final /* synthetic */ C0700sn f10209M;

    /* JADX INFO: renamed from: N */
    public static final C0700sn f10210N;

    /* JADX INFO: renamed from: O */
    public static final /* synthetic */ C0700sn f10211O;

    /* JADX INFO: renamed from: P */
    public static final C0700sn f10212P;

    /* JADX INFO: renamed from: Q */
    public static final c80 f10213Q;

    /* JADX INFO: renamed from: R */
    public static final c80 f10214R;

    /* JADX INFO: renamed from: S */
    public static final C0700sn f10215S;

    /* JADX INFO: renamed from: T */
    public static final C0700sn f10216T;

    /* JADX INFO: renamed from: U */
    public static final C0700sn f10217U;

    /* JADX INFO: renamed from: V */
    public static final C0700sn f10218V;

    /* JADX INFO: renamed from: W */
    public static final C0700sn f10219W;

    /* JADX INFO: renamed from: X */
    public static final C0700sn f10220X;

    /* JADX INFO: renamed from: i */
    public static final C0700sn f10221i = new C0700sn(0);

    /* JADX INFO: renamed from: j */
    public static final C0659rk f10222j = new C0659rk(-1.0f, -1.0f);

    /* JADX INFO: renamed from: k */
    public static final C0659rk f10223k = new C0659rk(0.0f, -1.0f);

    /* JADX INFO: renamed from: l */
    public static final C0659rk f10224l = new C0659rk(1.0f, -1.0f);

    /* JADX INFO: renamed from: m */
    public static final C0659rk f10225m = new C0659rk(-1.0f, 0.0f);

    /* JADX INFO: renamed from: n */
    public static final C0659rk f10226n = new C0659rk(0.0f, 0.0f);

    /* JADX INFO: renamed from: o */
    public static final C0659rk f10227o = new C0659rk(1.0f, 0.0f);

    /* JADX INFO: renamed from: p */
    public static final C0659rk f10228p = new C0659rk(-1.0f, 1.0f);

    /* JADX INFO: renamed from: q */
    public static final C0659rk f10229q = new C0659rk(0.0f, 1.0f);

    /* JADX INFO: renamed from: r */
    public static final C0659rk f10230r = new C0659rk(1.0f, 1.0f);

    /* JADX INFO: renamed from: s */
    public static final C0622qk f10231s = new C0622qk(-1.0f);

    /* JADX INFO: renamed from: t */
    public static final C0622qk f10232t = new C0622qk(0.0f);

    /* JADX INFO: renamed from: u */
    public static final C0583pk f10233u = new C0583pk(-1.0f);

    /* JADX INFO: renamed from: v */
    public static final C0583pk f10234v = new C0583pk(0.0f);

    /* JADX INFO: renamed from: w */
    public static final C0700sn f10235w;

    /* JADX INFO: renamed from: x */
    public static final C0700sn f10236x;

    /* JADX INFO: renamed from: y */
    public static final C0700sn f10237y;

    /* JADX INFO: renamed from: z */
    public static final C0700sn f10238z;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10239h;

    static {
        new C0583pk(1.0f);
        f10235w = new C0700sn(2);
        f10236x = new C0700sn(3);
        f10237y = new C0700sn(4);
        f10238z = new C0700sn(5);
        f10197A = new C0676s(8);
        f10198B = new C0874x7(1);
        f10199C = new C0874x7(2);
        f10200D = new C0700sn(8);
        f10201E = new C0700sn(9);
        f10202F = new C0700sn(10);
        f10203G = new C0700sn(11);
        f10204H = new C0700sn(12);
        f10205I = new C0700sn(13);
        f10206J = new C0700sn(14);
        f10207K = new C0700sn(15);
        f10208L = new C0700sn(16);
        f10209M = new C0700sn(17);
        f10210N = new C0700sn(18);
        f10211O = new C0700sn(19);
        f10212P = new C0700sn(20);
        f10213Q = new c80(24);
        f10214R = new c80(26);
        f10215S = new C0700sn(23);
        f10216T = new C0700sn(24);
        f10217U = new C0700sn(25);
        f10218V = new C0700sn(26);
        f10219W = new C0700sn(27);
        f10220X = new C0700sn(28);
    }

    public /* synthetic */ C0700sn(int i) {
        this.f10239h = i;
    }

    @Override // p000.l03
    /* JADX INFO: renamed from: a */
    public float mo863a() {
        return Float.NaN;
    }

    @Override // p000.l03
    /* JADX INFO: renamed from: b */
    public long mo864b() {
        int i = C0363ju.f5218h;
        return C0363ju.f5217g;
    }

    @Override // p000.ks2
    /* JADX INFO: renamed from: c */
    public boolean mo1841c(Object obj, Object obj2) {
        switch (this.f10239h) {
            case AIChatConfig.MaxContextRounds /* 20 */:
                return obj == obj2;
            default:
                return t11.m5086l(obj, obj2);
        }
    }

    @Override // p000.pf3
    /* JADX INFO: renamed from: d */
    public lf3 mo1810d(ContextWrapper contextWrapper, f70 f70Var) {
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
            InterfaceC0927yl.f13504a.getClass();
            int i = Build.VERSION.SDK_INT;
            return new lf3(new C0851wl((i >= 30 ? C0966zl.f13940h : i >= 29 ? f10236x : i >= 28 ? gd3.f3433k : f10235w).mo1845g(activity)), f70Var.mo1534h(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            C0676s.m4651j("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = contextWrapper.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new lf3(new Rect(0, 0, point.x, point.y), f70Var.mo1534h(contextWrapper));
    }

    @Override // p000.InterfaceC0814vl
    /* JADX INFO: renamed from: f */
    public long mo1844f(bo0 bo0Var, int i) {
        return ((y03) bo0Var.f960e).m6209i(i);
    }

    @Override // p000.InterfaceC0927yl
    /* JADX INFO: renamed from: g */
    public Rect mo1845g(Activity activity) throws Exception {
        switch (this.f10239h) {
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
                    int i = rect.bottom + dimensionPixelSize;
                    if (i == point.y) {
                        rect.bottom = i;
                    } else {
                        int i2 = rect.right + dimensionPixelSize;
                        if (i2 == point.x) {
                            rect.right = i2;
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
                    InterfaceC0927yl.f13504a.getClass();
                    Log.w(C0890xl.f13071b, e);
                    return gd3.f3433k.mo1845g(activity);
                }
        }
    }

    @Override // p000.f70
    /* JADX INFO: renamed from: h */
    public float mo1534h(ContextWrapper contextWrapper) {
        return contextWrapper.getResources().getDisplayMetrics().density;
    }

    @Override // p000.x00
    /* JADX INFO: renamed from: j */
    public Object mo1846j(Object obj) {
        switch (this.f10239h) {
            case 0:
                return obj.toString();
            case 4:
                return (o82) obj;
            default:
                ((u92) obj).close();
                return a83.f116a;
        }
    }

    @Override // p000.l03
    /* JADX INFO: renamed from: k */
    public AbstractC0024an mo865k() {
        return null;
    }

    public String toString() {
        switch (this.f10239h) {
            case AIChatConfig.MaxContextRounds /* 20 */:
                return "ReferentialEqualityPolicy";
            case 24:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // p000.i81
    public void cancel() {
    }

    @Override // p000.i81
    /* JADX INFO: renamed from: e */
    public void mo2303e() {
    }

    @Override // p000.n92
    /* JADX INFO: renamed from: i */
    public d92 mo422i(d92 d92Var, ov1 ov1Var) {
        return d92Var;
    }
}

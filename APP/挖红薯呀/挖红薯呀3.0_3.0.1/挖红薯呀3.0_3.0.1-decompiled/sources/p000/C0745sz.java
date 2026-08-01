package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: sz */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0745sz {

    /* JADX INFO: renamed from: c */
    private static final String f5864c = "?imageView2/2/w/200/h/200/q/50";

    /* JADX INFO: renamed from: d */
    private static final String f5865d = "?imageView2/2/w/720/h/960/q/60";

    /* JADX INFO: renamed from: h */
    private static final int f5869h;

    /* JADX INFO: renamed from: i */
    private static final a f5870i;

    /* JADX INFO: renamed from: j */
    private static InterfaceC0298hw f5871j;

    /* JADX INFO: renamed from: k */
    private static InterfaceC0298hw f5872k;

    /* JADX INFO: renamed from: l */
    private static boolean f5873l;

    /* JADX INFO: renamed from: m */
    private static boolean f5874m;

    /* JADX INFO: renamed from: n */
    private static boolean f5875n;

    /* JADX INFO: renamed from: o */
    public static final int f5876o;

    /* JADX INFO: renamed from: a */
    public static final C0745sz f5862a = new C0745sz();

    /* JADX INFO: renamed from: b */
    private static final u60 f5863b = new x51(new C0658qn(20));

    /* JADX INFO: renamed from: e */
    private static final List<String> f5866e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private static String f5867f = "";

    /* JADX INFO: renamed from: g */
    private static final LruCache<String, Bitmap> f5868g = new LruCache<>(80);

    /* JADX INFO: renamed from: sz$a */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class a extends LruCache<String, Bitmap> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(int i) {
            super(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, Bitmap bitmap) {
            str.getClass();
            bitmap.getClass();
            return bitmap.getByteCount() / 1024;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int iMaxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        f5869h = iMaxMemory;
        f5870i = new a(iMaxMemory / 8);
        f5876o = 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0745sz() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final String m4111d() {
        return ik0.f2579a.m1592a(35, 12, 4, 65, 56, 66, 95, 30, 56, 22, 3, 28, 34, 21, 23, 28, 35, 15, 94, 73, 35, 11, 19, 85, 37, 86, 19, 94, 38, 87);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    private final String m4112n() {
        return (String) f5863b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    private final void m4113q() {
        if (f5875n) {
            return;
        }
        List<String> list = f5866e;
        if (list.isEmpty()) {
            return;
        }
        String str = list.get(0);
        if (f5868g.get(str) == null || f5870i.get(str) == null) {
            return;
        }
        f5875n = true;
        InterfaceC0298hw interfaceC0298hw = f5872k;
        if (interfaceC0298hw != null) {
            interfaceC0298hw.invoke();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final na1 m4114t(String str, Bitmap bitmap) {
        if (bitmap != null) {
            f5870i.put(str, bitmap);
        }
        f5862a.m4113q();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final na1 m4115v(String str, Bitmap bitmap) {
        if (bitmap != null) {
            f5868g.put(str, bitmap);
        }
        f5862a.m4113q();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m4116A(String str, List<String> list) {
        str.getClass();
        list.getClass();
        if (str.equals(f5867f)) {
            return;
        }
        f5867f = str;
        f5868g.evictAll();
        f5870i.evictAll();
        List<String> list2 = f5866e;
        list2.clear();
        list2.addAll(list);
        f5873l = false;
        f5874m = false;
        f5875n = false;
        InterfaceC0298hw interfaceC0298hw = f5871j;
        if (interfaceC0298hw != null) {
            interfaceC0298hw.invoke();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4117e() {
        f5870i.evictAll();
        f5874m = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Bitmap m4118f(String str) {
        str.getClass();
        return f5870i.get(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final Bitmap m4119g(String str) {
        str.getClass();
        return f5868g.get(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final String m4120h(String str) {
        str.getClass();
        return m4112n() + str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final List<String> m4121i() {
        return AbstractC0960ye.m5253W(f5866e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final String m4122j(String str) {
        str.getClass();
        return m4112n() + str + f5865d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final InterfaceC0298hw m4123k() {
        return f5871j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final InterfaceC0298hw m4124l() {
        return f5872k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final String m4125m(String str) {
        str.getClass();
        return m4112n() + str + f5864c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final boolean m4126o() {
        List<String> list = f5866e;
        if (list.isEmpty()) {
            return false;
        }
        String str = list.get(0);
        return (f5868g.get(str) == null || f5870i.get(str) == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final boolean m4127p() {
        return !f5866e.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m4128r() {
        InterfaceC0298hw interfaceC0298hw;
        if (f5866e.isEmpty() || (interfaceC0298hw = f5871j) == null) {
            return;
        }
        interfaceC0298hw.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m4129s(Context context) {
        context.getClass();
        if (f5874m) {
            return;
        }
        List<String> list = f5866e;
        if (list.isEmpty()) {
            return;
        }
        f5874m = true;
        for (String str : list) {
            if (f5870i.get(str) == null) {
                C0870vz.f6878a.m4821o(m4122j(str), new C0516nl(str, 3));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m4130u(Context context) {
        context.getClass();
        if (f5873l) {
            return;
        }
        List<String> list = f5866e;
        if (list.isEmpty()) {
            return;
        }
        f5873l = true;
        for (String str : list) {
            if (f5868g.get(str) == null) {
                C0870vz.f6878a.m4821o(m4125m(str), new C0516nl(str, 2));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m4131w(String str, Bitmap bitmap) {
        str.getClass();
        bitmap.getClass();
        f5870i.put(str, bitmap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m4132x(String str, Bitmap bitmap) {
        str.getClass();
        bitmap.getClass();
        f5868g.put(str, bitmap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m4133y(InterfaceC0298hw interfaceC0298hw) {
        f5871j = interfaceC0298hw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final void m4134z(InterfaceC0298hw interfaceC0298hw) {
        f5872k = interfaceC0298hw;
    }
}

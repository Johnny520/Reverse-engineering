package p000;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: zy */
/* JADX INFO: loaded from: classes.dex */
public final class C2821zy {

    /* JADX INFO: renamed from: d */
    public static final Bitmap.Config[] f9542d = null;

    /* JADX INFO: renamed from: e */
    public static final Bitmap.Config[] f9543e = null;

    /* JADX INFO: renamed from: f */
    public static final Bitmap.Config[] f9544f = null;

    /* JADX INFO: renamed from: g */
    public static final Bitmap.Config[] f9545g = null;

    /* JADX INFO: renamed from: h */
    public static final Bitmap.Config[] f9546h = null;

    /* JADX INFO: renamed from: a */
    public final C2769yp f9547a;

    /* JADX INFO: renamed from: b */
    public final C0649P3 f9548b;

    /* JADX INFO: renamed from: c */
    public final HashMap f9549c;

    static {
        Bitmap.Config[] r0 = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        r0[r0.length - 1] = Bitmap.Config.RGBA_F16;
        f9542d = r0;
        f9543e = r0;
        f9544f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f9545g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f9546h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public C2821zy() {
        this.f9547a = new C2769yp(1);
        this.f9548b = new C0649P3(21);
        this.f9549c = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public static String m5455c(int r2, Bitmap.Config r3) {
        return "[" + r2 + "](" + r3 + ")";
    }

    /* JADX INFO: renamed from: a */
    public final void m5456a(Integer r4, Bitmap r5) {
        NavigableMap r0 = m5458d(r5.getConfig());
        Integer r1 = (Integer) r0.get(r4);
        if (r1 == null) goto L11;
        if (r1.intValue() != 1) goto L8;
        r0.remove(r4);
        return;
    L8:
        r0.put(r4, Integer.valueOf(r1.intValue() - 1));
        return;
    L11:
        throw new NullPointerException("Tried to decrement empty size, size: " + r4 + ", removed: " + m5455c(AbstractC2622vD.m5132c(r5), r5.getConfig()) + ", this: " + this);
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m5457b(int r11, int r12, Bitmap.Config r13) {
        int r1 = AbstractC2622vD.m5133d(r13);
        int r14 = r1 * (r11 * r12);
        C2769yp r0 = this.f9547a;
        InterfaceC0938Vt r2 = (InterfaceC0938Vt) ((ArrayDeque) r0.f9067a).poll();
        if (r2 != null) goto L5;
        r2 = r0.m5340g();
    L5:
        C2778yy r22 = (C2778yy) r2;
        r22.f9435b = r14;
        r22.f9436c = r13;
        if (Bitmap.Config.RGBA_F16.equals(r13) == false) goto L8;
        Bitmap.Config[] r3 = f9543e;
    L21:
        int r4 = r3.length;
        int r5 = 0;
    L22:
        if (r5 >= r4) goto L39;
        Bitmap.Config r6 = r3[r5];
        Integer r7 = (Integer) m5458d(r6).ceilingKey(Integer.valueOf(r14));
        if (r7 == null) goto L38;
        if (r7.intValue() > (r14 * 8)) goto L38;
        if (r7.intValue() != r14) goto L34;
        if (r6 != null) goto L33;
        if (r13 == null) goto L39;
    L33:
        if (r6.equals(r13) == true) goto L39;
    L34:
        r0.m5128d(r22);
        int r15 = r7.intValue();
        InterfaceC0938Vt r23 = (InterfaceC0938Vt) ((ArrayDeque) r0.f9067a).poll();
        if (r23 != null) goto L37;
        r23 = r0.m5340g();
    L37:
        r22 = (C2778yy) r23;
        r22.f9435b = r15;
        r22.f9436c = r6;
    L38:
        r5 = r5 + 1;
    L39:
        Bitmap r02 = (Bitmap) this.f9548b.m1272B(r22);
        if (r02 == null) goto L42;
        m5456a(Integer.valueOf(r22.f9435b), r02);
        r02.reconfigure(r11, r12, r13);
    L42:
        return r02;
    L8:
        int r32 = AbstractC2735xy.f9342a[r13.ordinal()];
        if (r32 != 1) goto L11;
        r3 = f9542d;
        goto L21
    L11:
        if (r32 != 2) goto L13;
        r3 = f9544f;
        goto L21
    L13:
        if (r32 != 3) goto L15;
        r3 = f9545g;
        goto L21
    L15:
        if (r32 == 4) goto L17;
        r3 = new Bitmap.Config[]{r13};
        goto L21
    L17:
        r3 = f9546h;
        goto L21
    }

    /* JADX INFO: renamed from: d */
    public final NavigableMap m5458d(Bitmap.Config r3) {
        HashMap r0 = this.f9549c;
        NavigableMap r1 = (NavigableMap) r0.get(r3);
        if (r1 != null) goto L6;
        TreeMap r12 = new TreeMap();
        r0.put(r3, r12);
        return r12;
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: e */
    public final void m5459e(Bitmap r5) {
        int r0 = AbstractC2622vD.m5132c(r5);
        Bitmap.Config r1 = r5.getConfig();
        C2769yp r2 = this.f9547a;
        InterfaceC0938Vt r3 = (InterfaceC0938Vt) ((ArrayDeque) r2.f9067a).poll();
        if (r3 != null) goto L5;
        r3 = r2.m5340g();
    L5:
        C2778yy r32 = (C2778yy) r3;
        r32.f9435b = r0;
        r32.f9436c = r1;
        this.f9548b.m1283N(r32, r5);
        NavigableMap r52 = m5458d(r5.getConfig());
        Integer r02 = (Integer) r52.get(Integer.valueOf(r32.f9435b));
        Integer r12 = Integer.valueOf(r32.f9435b);
        int r22 = 1;
        if (r02 == null) goto L9;
        r22 = 1 + r02.intValue();
    L9:
        r52.put(r12, Integer.valueOf(r22));
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("SizeConfigStrategy{groupedMap=");
        r0.append(this.f9548b);
        r0.append(", sortedSizes=(");
        HashMap r1 = this.f9549c;
        Iterator r2 = r1.entrySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        Map.Entry r3 = (Map.Entry) r2.next();
        r0.append(r3.getKey());
        r0.append('[');
        r0.append(r3.getValue());
        r0.append("], ");
        goto L4
    L7:
        if (r1.isEmpty() == true) goto L9;
        r0.replace(r0.length() - 2, r0.length(), "");
    L9:
        r0.append(")}");
        return r0.toString();
    }
}

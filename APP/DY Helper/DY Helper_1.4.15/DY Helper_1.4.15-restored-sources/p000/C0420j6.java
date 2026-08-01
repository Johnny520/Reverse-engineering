package p000;

/* JADX INFO: renamed from: j6 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0420j6 {

    /* JADX INFO: renamed from: α */
    public int f5333;

    /* JADX INFO: renamed from: β */
    public float f5334;

    /* JADX INFO: renamed from: γ */
    public float f5335;

    /* JADX INFO: renamed from: δ */
    public float f5336;

    /* JADX INFO: renamed from: ε */
    public int[] f5337;

    /* JADX INFO: renamed from: ζ */
    public boolean f5338;

    /* JADX INFO: renamed from: η */
    public final android.widget.TextView f5339;

    /* JADX INFO: renamed from: θ */
    public final android.content.Context f5340;

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            return
    }

    public C0420j6(android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f5333 = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.f5334 = r1
            r2.f5335 = r1
            r2.f5336 = r1
            int[] r1 = new int[r0]
            r2.f5337 = r1
            r2.f5338 = r0
            r2.f5339 = r3
            android.content.Context r3 = r3.getContext()
            r2.f5340 = r3
            h6 r2 = new h6
            r2.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    public static int[] m2866(int[] r6) {
            int r0 = r6.length
            if (r0 != 0) goto L4
            goto L2e
        L4:
            java.util.Arrays.sort(r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r0) goto L28
            r4 = r6[r3]
            if (r4 <= 0) goto L25
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            int r5 = java.util.Collections.binarySearch(r1, r5)
            if (r5 >= 0) goto L25
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        L25:
            int r3 = r3 + 1
            goto Le
        L28:
            int r3 = r1.size()
            if (r0 != r3) goto L2f
        L2e:
            return r6
        L2f:
            int r6 = r1.size()
            int[] r0 = new int[r6]
        L35:
            if (r2 >= r6) goto L46
            java.lang.Object r3 = r1.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0[r2] = r3
            int r2 = r2 + 1
            goto L35
        L46:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final boolean m2867() {
            r0 = this;
            android.widget.TextView r0 = r0.f5339
            boolean r0 = r0 instanceof androidx.appcompat.widget.AppCompatEditText
            r0 = r0 ^ 1
            return r0
    }
}

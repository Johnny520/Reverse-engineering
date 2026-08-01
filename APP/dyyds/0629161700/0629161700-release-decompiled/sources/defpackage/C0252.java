package defpackage;

/* JADX INFO: renamed from: ᛲᛲᛵᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0252 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final android.content.Context f1469;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int[] f1470;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public float f1471;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public float f1472;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int f1473;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public float f1474;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f1475;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final android.widget.TextView f1476;

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            return
    }

    public C0252(android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1473 = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.f1474 = r1
            r2.f1472 = r1
            r2.f1471 = r1
            int[] r1 = new int[r0]
            r2.f1470 = r1
            r2.f1475 = r0
            r2.f1476 = r3
            android.content.Context r3 = r3.getContext()
            r2.f1469 = r3
            ᛸᲁᛱ r2 = new ᛸᲁᛱ
            r2.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static int[] m875(int[] r6) {
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

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean m876() {
            r0 = this;
            android.widget.TextView r0 = r0.f1476
            boolean r0 = r0 instanceof defpackage.C2015
            r0 = r0 ^ 1
            return r0
    }
}

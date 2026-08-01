package xhss;

/* JADX INFO: renamed from: xhss.ᛲᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0207 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public float f767;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public float f768;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int[] f769;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public int f770;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final android.content.Context f771;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final android.widget.TextView f772;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public float f773;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public boolean f774;

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            return
    }

    public C0207(android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f770 = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.f767 = r1
            r2.f768 = r1
            r2.f773 = r1
            int[] r1 = new int[r0]
            r2.f769 = r1
            r2.f774 = r0
            r2.f772 = r3
            android.content.Context r3 = r3.getContext()
            r2.f771 = r3
            xhss.ᛷᲈᛵᛸ r2 = new xhss.ᛷᲈᛵᛸ
            r2.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static int[] m471(int[] r6) {
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
}

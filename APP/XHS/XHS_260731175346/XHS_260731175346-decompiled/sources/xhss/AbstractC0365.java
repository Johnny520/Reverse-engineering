package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛵᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0365 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final int[] f1334 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final int[] f1335 = null;

    static {
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            xhss.AbstractC0365.f1335 = r0
            r0 = 0
            int[] r0 = new int[r0]
            xhss.AbstractC0365.f1334 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static android.graphics.PorterDuff.Mode m718(int r1) {
            r0 = 3
            if (r1 == r0) goto L1e
            r0 = 5
            if (r1 == r0) goto L1b
            r0 = 9
            if (r1 == r0) goto L18
            switch(r1) {
                case 14: goto L15;
                case 15: goto L12;
                case 16: goto Lf;
                default: goto Ld;
            }
        Ld:
            r1 = 0
            return r1
        Lf:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L12:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L15:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L18:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L1b:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L1e:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }
}

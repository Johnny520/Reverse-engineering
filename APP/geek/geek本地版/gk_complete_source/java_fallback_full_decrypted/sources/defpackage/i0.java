package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public static defpackage.i0 b;
    public final java.lang.Object a;

    public i0() {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.a = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            v30 r2 = new v30
            r2.<init>(r3)
            r0.<init>(r1, r2)
            return
    }

    public i0(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static defpackage.i0 a(boolean r7, int r8, int r9, int r10, int r11) {
            i0 r0 = new i0
            r5 = 0
            r6 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r7 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r1, r2, r3, r4, r5, r6)
            r0.<init>(r7)
            return r0
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mj extends defpackage.l0 {
    public final /* synthetic */ defpackage.ia c;

    public mj(defpackage.ia r1) {
            r0 = this;
            r0.c = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // defpackage.l0
    public final defpackage.j0 t(int r2) {
            r1 = this;
            ia r0 = r1.c
            j0 r2 = r0.n(r2)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.a
            android.view.accessibility.AccessibilityNodeInfo r2 = android.view.accessibility.AccessibilityNodeInfo.obtain(r2)
            j0 r0 = new j0
            r0.<init>(r2)
            return r0
    }

    @Override // defpackage.l0
    public final defpackage.j0 u(int r3) {
            r2 = this;
            r0 = 2
            ia r1 = r2.c
            if (r3 != r0) goto L8
            int r3 = r1.k
            goto La
        L8:
            int r3 = r1.l
        La:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r0) goto L10
            r3 = 0
            return r3
        L10:
            j0 r3 = r2.t(r3)
            return r3
    }

    @Override // defpackage.l0
    public final boolean w(int r7, int r8, android.os.Bundle r9) {
            r6 = this;
            ia r0 = r6.c
            com.google.android.material.chip.Chip r1 = r0.i
            r2 = -1
            if (r7 == r2) goto L80
            r9 = 1
            if (r8 == r9) goto L7b
            r2 = 2
            if (r8 == r2) goto L76
            r2 = 64
            r3 = 65536(0x10000, float:9.1835E-41)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            if (r8 == r2) goto L4c
            r2 = 128(0x80, float:1.8E-43)
            if (r8 == r2) goto L3e
            com.google.android.material.chip.Chip r0 = r0.n
            r1 = 16
            if (r8 != r1) goto L3d
            if (r7 != 0) goto L27
            boolean r7 = r0.performClick()
            return r7
        L27:
            if (r7 != r9) goto L3d
            r0.playSoundEffect(r5)
            android.view.View$OnClickListener r7 = r0.h
            if (r7 == 0) goto L34
            r7.onClick(r0)
            r5 = r9
        L34:
            boolean r7 = r0.s
            if (r7 == 0) goto L3d
            ia r7 = r0.r
            r7.p(r9, r9)
        L3d:
            return r5
        L3e:
            int r8 = r0.k
            if (r8 != r7) goto L4b
            r0.k = r4
            r1.invalidate()
            r0.p(r7, r3)
            return r9
        L4b:
            return r5
        L4c:
            android.view.accessibility.AccessibilityManager r8 = r0.h
            boolean r2 = r8.isEnabled()
            if (r2 == 0) goto L75
            boolean r8 = r8.isTouchExplorationEnabled()
            if (r8 != 0) goto L5b
            goto L75
        L5b:
            int r8 = r0.k
            if (r8 == r7) goto L75
            if (r8 == r4) goto L69
            r0.k = r4
            r1.invalidate()
            r0.p(r8, r3)
        L69:
            r0.k = r7
            r1.invalidate()
            r8 = 32768(0x8000, float:4.5918E-41)
            r0.p(r7, r8)
            return r9
        L75:
            return r5
        L76:
            boolean r7 = r0.j(r7)
            return r7
        L7b:
            boolean r7 = r0.o(r7)
            return r7
        L80:
            java.util.WeakHashMap r7 = defpackage.ja0.a
            boolean r7 = defpackage.s90.j(r1, r8, r9)
            return r7
    }
}

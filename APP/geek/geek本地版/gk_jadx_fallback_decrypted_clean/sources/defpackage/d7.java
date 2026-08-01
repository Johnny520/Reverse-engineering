package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d7 extends defpackage.ec {
    public int g;
    public int h;
    public defpackage.e7 i;

    @Override // defpackage.ec
    public final void f(defpackage.pc r6, boolean r7) {
            r5 = this;
            int r0 = r5.g
            r5.h = r0
            r1 = 0
            r2 = 6
            r3 = 1
            r4 = 5
            if (r7 == 0) goto L14
            if (r0 != r4) goto Lf
            r5.h = r3
            goto L1d
        Lf:
            if (r0 != r2) goto L1d
            r5.h = r1
            goto L1d
        L14:
            if (r0 != r4) goto L19
            r5.h = r1
            goto L1d
        L19:
            if (r0 != r2) goto L1d
            r5.h = r3
        L1d:
            boolean r7 = r6 instanceof defpackage.e7
            if (r7 == 0) goto L27
            e7 r6 = (defpackage.e7) r6
            int r7 = r5.h
            r6.f0 = r7
        L27:
            return
    }

    public int getMargin() {
            r1 = this;
            e7 r0 = r1.i
            int r0 = r0.h0
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public void setAllowsGoneWidget(boolean r2) {
            r1 = this;
            e7 r0 = r1.i
            r0.g0 = r2
            return
    }

    public void setDpMargin(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = (float) r2
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            e7 r0 = r1.i
            r0.h0 = r2
            return
    }

    public void setMargin(int r2) {
            r1 = this;
            e7 r0 = r1.i
            r0.h0 = r2
            return
    }

    public void setType(int r1) {
            r0 = this;
            r0.g = r1
            return
    }
}

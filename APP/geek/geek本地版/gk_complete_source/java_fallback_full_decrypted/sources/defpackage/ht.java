package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ht extends android.widget.ArrayAdapter {
    public android.content.res.ColorStateList a;
    public android.content.res.ColorStateList b;
    public final /* synthetic */ defpackage.jt c;

    public ht(defpackage.jt r1, android.content.Context r2, int r3, java.lang.String[] r4) {
            r0 = this;
            r0.c = r1
            r0.<init>(r2, r3, r4)
            r0.a()
            return
    }

    public final void a() {
            r7 = this;
            jt r0 = r7.c
            android.content.res.ColorStateList r1 = r0.l
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L23
            r4 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r4 = new int[]{r4}
            int r1 = r1.getColorForState(r4, r3)
            int[] r1 = new int[]{r1, r3}
            int[] r5 = new int[r3]
            int[][] r4 = new int[][]{r4, r5}
            android.content.res.ColorStateList r5 = new android.content.res.ColorStateList
            r5.<init>(r4, r1)
            goto L24
        L23:
            r5 = r2
        L24:
            r7.b = r5
            int r1 = r0.k
            if (r1 == 0) goto L68
            android.content.res.ColorStateList r1 = r0.l
            if (r1 == 0) goto L68
            r1 = 16843623(0x1010367, float:2.3696E-38)
            r2 = -16842919(0xfffffffffefeff59, float:-1.6947488E38)
            int[] r1 = new int[]{r1, r2}
            r4 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r2 = new int[]{r4, r2}
            android.content.res.ColorStateList r4 = r0.l
            int r4 = r4.getColorForState(r2, r3)
            android.content.res.ColorStateList r5 = r0.l
            int r5 = r5.getColorForState(r1, r3)
            int r6 = r0.k
            int r4 = defpackage.ib.b(r4, r6)
            int r6 = r0.k
            int r5 = defpackage.ib.b(r5, r6)
            int r0 = r0.k
            int[] r0 = new int[]{r4, r5, r0}
            int[] r3 = new int[r3]
            int[][] r1 = new int[][]{r2, r1, r3}
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
        L68:
            r7.a = r2
            return
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
            r3 = this;
            android.view.View r4 = super.getView(r4, r5, r6)
            boolean r5 = r4 instanceof android.widget.TextView
            if (r5 == 0) goto L43
            r5 = r4
            android.widget.TextView r5 = (android.widget.TextView) r5
            jt r6 = r3.c
            android.text.Editable r0 = r6.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r1 = r5.getText()
            boolean r0 = r0.contentEquals(r1)
            r1 = 0
            if (r0 == 0) goto L3e
            int r0 = r6.k
            if (r0 == 0) goto L3e
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            int r6 = r6.k
            r0.<init>(r6)
            android.content.res.ColorStateList r6 = r3.b
            if (r6 == 0) goto L3d
            android.content.res.ColorStateList r6 = r3.a
            defpackage.ch.h(r0, r6)
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r2 = r3.b
            r6.<init>(r2, r0, r1)
            r1 = r6
            goto L3e
        L3d:
            r1 = r0
        L3e:
            java.util.WeakHashMap r6 = defpackage.ja0.a
            defpackage.s90.q(r5, r1)
        L43:
            return r4
    }
}

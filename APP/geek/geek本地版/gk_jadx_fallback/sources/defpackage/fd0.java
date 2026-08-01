package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fd0 extends defpackage.fz {
    public final defpackage.ut c;

    public fd0(defpackage.ut r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            return
    }

    @Override // defpackage.fz
    public final int a() {
            r1 = this;
            ut r0 = r1.c
            c8 r0 = r0.T
            int r0 = r0.f
            return r0
    }

    @Override // defpackage.fz
    public final void c(defpackage.b00 r5, int r6) {
            r4 = this;
            ed0 r5 = (defpackage.ed0) r5
            ut r0 = r4.c
            c8 r1 = r0.T
            zv r1 = r1.a
            int r1 = r1.c
            int r1 = r1 + r6
            android.widget.TextView r5 = r5.t
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r6, r3, r2)
            r5.setText(r6)
            android.content.Context r6 = r5.getContext()
            java.util.Calendar r2 = defpackage.u80.b()
            r3 = 1
            int r2 = r2.get(r3)
            if (r2 != r1) goto L45
            r2 = 2131755125(0x7f100075, float:1.914112E38)
            java.lang.String r6 = r6.getString(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r6 = java.lang.String.format(r6, r2)
            goto L58
        L45:
            r2 = 2131755126(0x7f100076, float:1.9141122E38)
            java.lang.String r6 = r6.getString(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r6 = java.lang.String.format(r6, r2)
        L58:
            r5.setContentDescription(r6)
            d4 r5 = r0.W
            java.util.Calendar r6 = defpackage.u80.b()
            int r6 = r6.get(r3)
            if (r6 != r1) goto L6a
            java.lang.Object r5 = r5.c
            goto L6c
        L6a:
            java.lang.Object r5 = r5.b
        L6c:
            r5 = 0
            throw r5
    }

    @Override // defpackage.fz
    public final defpackage.b00 d(android.view.ViewGroup r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131492944(0x7f0c0050, float:1.8609354E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            android.widget.TextView r4 = (android.widget.TextView) r4
            ed0 r0 = new ed0
            r0.<init>(r4)
            return r0
    }
}

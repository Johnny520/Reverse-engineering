package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fu<S> extends defpackage.px {
    public int S;
    public defpackage.c8 T;

    public fu() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.ml
    public final void m(android.os.Bundle r2) {
            r1 = this;
            super.m(r2)
            if (r2 != 0) goto L7
            android.os.Bundle r2 = r1.f
        L7:
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.S = r0
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            if (r0 != 0) goto L22
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            android.os.Parcelable r2 = r2.getParcelable(r0)
            c8 r2 = (defpackage.c8) r2
            r1.T = r2
            return
        L22:
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r2.<init>()
            throw r2
    }

    @Override // defpackage.ml
    public final android.view.View n(android.view.LayoutInflater r3, android.view.ViewGroup r4) {
            r2 = this;
            android.view.ContextThemeWrapper r4 = new android.view.ContextThemeWrapper
            android.content.Context r0 = r2.h()
            int r1 = r2.S
            r4.<init>(r0, r1)
            r3.cloneInContext(r4)
            r3 = 0
            throw r3
    }

    @Override // defpackage.ml
    public final void r(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r1 = r2.S
            r3.putInt(r0, r1)
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            r1 = 0
            r3.putParcelable(r0, r1)
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            c8 r1 = r2.T
            r3.putParcelable(r0, r1)
            return
    }
}

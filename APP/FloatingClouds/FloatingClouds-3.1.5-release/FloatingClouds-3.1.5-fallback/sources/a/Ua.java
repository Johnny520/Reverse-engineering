package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ua<S> extends a.AbstractC0392tc<S> {
    public int W;
    public a.I4<S> X;
    public com.google.android.material.datepicker.a Y;

    public class a extends a.AbstractC0142fc<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.Ua f291a;

        public a(a.Ua r1) {
                r0 = this;
                r0.f291a = r1
                r0.<init>()
                return
        }

        @Override // a.AbstractC0142fc
        public final void a(S r3) {
                r2 = this;
                a.Ua r0 = r2.f291a
                java.util.LinkedHashSet<a.fc<S>> r0 = r0.V
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                a.fc r1 = (a.AbstractC0142fc) r1
                r1.a(r3)
                goto L8
            L18:
                return
        }
    }

    public Ua() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.fragment.app.b
    public final void o(android.os.Bundle r2) {
            r1 = this;
            super.o(r2)
            if (r2 != 0) goto L7
            android.os.Bundle r2 = r1.f
        L7:
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.W = r0
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            a.I4 r0 = (a.I4) r0
            r1.X = r0
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            android.os.Parcelable r2 = r2.getParcelable(r0)
            com.google.android.material.datepicker.a r2 = (com.google.android.material.datepicker.a) r2
            r1.Y = r2
            return
    }

    @Override // androidx.fragment.app.b
    public final android.view.View p(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            android.view.ContextThemeWrapper r3 = new android.view.ContextThemeWrapper
            android.content.Context r4 = r1.d()
            int r0 = r1.W
            r3.<init>(r4, r0)
            r2.cloneInContext(r3)
            a.I4<S> r2 = r1.X
            a.Ua$a r3 = new a.Ua$a
            r3.<init>(r1)
            android.view.View r2 = r2.g()
            return r2
    }

    @Override // androidx.fragment.app.b
    public final void t(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r1 = r2.W
            r3.putInt(r0, r1)
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            a.I4<S> r1 = r2.X
            r3.putParcelable(r0, r1)
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            com.google.android.material.datepicker.a r1 = r2.Y
            r3.putParcelable(r0, r1)
            return
    }
}

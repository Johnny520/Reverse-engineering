package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1679 extends android.widget.Filter {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C1679.InterfaceC1680 f5277;

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۨۨ$ۥ, reason: contains not printable characters */
    public interface InterfaceC1680 {
        android.database.Cursor getCursor();

        /* JADX INFO: renamed from: ۥ */
        java.lang.CharSequence mo8056(android.database.Cursor r1);

        /* JADX INFO: renamed from: ۥ۟ */
        void mo8057(android.database.Cursor r1);

        /* JADX INFO: renamed from: ۥ۟۟ */
        android.database.Cursor mo8058(java.lang.CharSequence r1);
    }

    public C1679(Yue.C1679.InterfaceC1680 r1) {
            r0 = this;
            r0.<init>()
            r0.f5277 = r1
            return
    }

    @Override // android.widget.Filter
    public java.lang.CharSequence convertResultToString(java.lang.Object r2) {
            r1 = this;
            Yue.ۥ۟ۧۨۨ$ۥ r0 = r1.f5277
            android.database.Cursor r2 = (android.database.Cursor) r2
            java.lang.CharSequence r2 = r0.mo8056(r2)
            return r2
    }

    @Override // android.widget.Filter
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r3) {
            r2 = this;
            Yue.ۥ۟ۧۨۨ$ۥ r0 = r2.f5277
            android.database.Cursor r3 = r0.mo8058(r3)
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r3 == 0) goto L16
            int r1 = r3.getCount()
            r0.count = r1
            r0.values = r3
            goto L1c
        L16:
            r3 = 0
            r0.count = r3
            r3 = 0
            r0.values = r3
        L1c:
            return r0
    }

    @Override // android.widget.Filter
    public void publishResults(java.lang.CharSequence r1, android.widget.Filter.FilterResults r2) {
            r0 = this;
            Yue.ۥ۟ۧۨۨ$ۥ r1 = r0.f5277
            android.database.Cursor r1 = r1.getCursor()
            java.lang.Object r2 = r2.values
            if (r2 == 0) goto L13
            if (r2 == r1) goto L13
            Yue.ۥ۟ۧۨۨ$ۥ r1 = r0.f5277
            android.database.Cursor r2 = (android.database.Cursor) r2
            r1.mo8057(r2)
        L13:
            return
    }
}

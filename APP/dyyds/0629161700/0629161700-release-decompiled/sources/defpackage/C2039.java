package defpackage;

/* JADX INFO: renamed from: ᲇᛴᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2039 extends android.database.DataSetObserver {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f8786;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f8787;

    public /* synthetic */ C2039(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f8786 = r1
            r0.f8787 = r2
            r0.<init>()
            return
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
            r1 = this;
            int r0 = r1.f8786
            java.lang.Object r1 = r1.f8787
            switch(r0) {
                case 0: goto L15;
                default: goto L7;
            }
        L7:
            ᛸᛶᛳᛷ r1 = (defpackage.AbstractC1503) r1
            ᛳᲇᲇᛲ r0 = r1.f6630
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L14
            r1.show()
        L14:
            return
        L15:
            ᲇᛵᛶᛸ r1 = (defpackage.ViewOnClickListenerC2050) r1
            r0 = 1
            r1.f1072 = r0
            r1.notifyDataSetChanged()
            return
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
            r1 = this;
            int r0 = r1.f8786
            java.lang.Object r1 = r1.f8787
            switch(r0) {
                case 0: goto Ld;
                default: goto L7;
            }
        L7:
            ᛸᛶᛳᛷ r1 = (defpackage.AbstractC1503) r1
            r1.dismiss()
            return
        Ld:
            ᲇᛵᛶᛸ r1 = (defpackage.ViewOnClickListenerC2050) r1
            r0 = 0
            r1.f1072 = r0
            r1.notifyDataSetInvalidated()
            return
    }
}

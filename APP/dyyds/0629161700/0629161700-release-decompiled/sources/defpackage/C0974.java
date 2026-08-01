package defpackage;

/* JADX INFO: renamed from: ᛵᲁᛸᛸ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0974 extends defpackage.AbstractC1191 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.util.LinkedHashSet f4364;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C2370 f4365;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1316 f4366;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.List f4367;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final com.ss.android.ugc.aweme.feed.model.Aweme f4368;

    static {
            r0 = 96
            com.android.NativeUtil.classesInit0(r0)
            return
    }

    public C0974(java.util.List r3, com.ss.android.ugc.aweme.feed.model.Aweme r4, defpackage.C1316 r5, defpackage.C2370 r6) {
            r2 = this;
            r0 = -156427288485422(0xffff71baef0961d2, double:NaN)
            r0 = -156470238158382(0xffff71b0ef0961d2, double:NaN)
            r0 = -156496007962158(0xffff71aaef0961d2, double:NaN)
            r0 = -156547547569710(0xffff719eef0961d2, double:NaN)
            r2.<init>()
            r2.f4367 = r3
            r2.f4368 = r4
            r2.f4366 = r5
            r2.f4365 = r6
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            r2.f4364 = r3
            return
    }

    @Override // defpackage.AbstractC1191
    public final native int getItemCount();

    @Override // defpackage.AbstractC1191
    public final native void onBindViewHolder(defpackage.AbstractC2316 r1, int r2);

    @Override // defpackage.AbstractC1191
    public final native defpackage.AbstractC2316 onCreateViewHolder(android.view.ViewGroup r1, int r2);
}

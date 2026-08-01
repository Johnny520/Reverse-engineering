package defpackage;

/* JADX INFO: renamed from: ᛱᛳᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0059 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public long f689;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public long f690;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public long f691;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.C1662 f692;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.util.ArrayList f693;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public long f694;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m470(defpackage.AbstractC2316 r2) {
            int r0 = r2.f9792
            boolean r1 = r2.m3775()
            if (r1 == 0) goto L9
            goto L10
        L9:
            r0 = r0 & 4
            if (r0 != 0) goto L10
            r2.m3789()
        L10:
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public abstract void mo471();

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public abstract void mo472(defpackage.AbstractC2316 r1);

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m473(defpackage.AbstractC2316 r10) {
            r9 = this;
            ᲀᛴᛴᛸ r9 = r9.f692
            if (r9 == 0) goto Lb0
            ᛱᛳᛶᛱ r9 = r9.f7409
            r0 = 1
            r10.m3791(r0)
            android.view.View r1 = r10.f9791
            ᲈᛸᲈᛷ r2 = r10.f9781
            r3 = 0
            if (r2 == 0) goto L17
            ᲈᛸᲈᛷ r2 = r10.f9784
            if (r2 != 0) goto L17
            r10.f9781 = r3
        L17:
            r10.f9784 = r3
            int r2 = r10.f9792
            r2 = r2 & 16
            if (r2 == 0) goto L21
            goto Lb0
        L21:
            ᲀᛲᲁᛳ r2 = r9.f637
            r9.m451()
            ᲈᛷᲀᲀ r3 = r9.f611
            java.lang.Object r4 = r3.f9710
            ᛱᲀᛸᛴ r4 = (defpackage.C0167) r4
            java.lang.Object r5 = r3.f9711
            ᲀᛴᛴᛸ r5 = (defpackage.C1662) r5
            int r6 = r3.f9712
            r7 = 0
            if (r6 != r0) goto L43
            java.lang.Object r0 = r3.f9715
            android.view.View r0 = (android.view.View) r0
            if (r0 != r1) goto L3d
        L3b:
            r0 = r7
            goto L6c
        L3d:
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            defpackage.C2264.m3676(r9)
            return
        L43:
            r8 = 2
            if (r6 == r8) goto Lab
            r3.f9712 = r8     // Catch: java.lang.Throwable -> L57
            ᛱᛳᛶᛱ r6 = r5.f7409     // Catch: java.lang.Throwable -> L57
            int r6 = r6.indexOfChild(r1)     // Catch: java.lang.Throwable -> L57
            r8 = -1
            if (r6 != r8) goto L59
            r3.m3724(r1)     // Catch: java.lang.Throwable -> L57
        L54:
            r3.f9712 = r7
            goto L6c
        L57:
            r9 = move-exception
            goto La8
        L59:
            boolean r8 = r4.m699(r6)     // Catch: java.lang.Throwable -> L57
            if (r8 == 0) goto L69
            r4.m704(r6)     // Catch: java.lang.Throwable -> L57
            r3.m3724(r1)     // Catch: java.lang.Throwable -> L57
            r5.m3055(r6)     // Catch: java.lang.Throwable -> L57
            goto L54
        L69:
            r3.f9712 = r7
            goto L3b
        L6c:
            if (r0 == 0) goto L97
            ᲈᛸᲈᛷ r3 = defpackage.C0055.m405(r1)
            r2.m3001(r3)
            r2.m3002(r3)
            boolean r2 = defpackage.C0055.f605
            if (r2 == 0) goto L97
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "after removing animated view: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RecyclerView"
            android.util.Log.d(r3, r2)
        L97:
            r2 = r0 ^ 1
            r9.m435(r2)
            if (r0 != 0) goto Lb0
            boolean r10 = r10.m3777()
            if (r10 == 0) goto Lb0
            r9.removeDetachedView(r1, r7)
            return
        La8:
            r3.f9712 = r7
            throw r9
        Lab:
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            defpackage.C2264.m3676(r9)
        Lb0:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public abstract boolean mo474(defpackage.AbstractC2316 r1, defpackage.AbstractC2316 r2, defpackage.C0088 r3, defpackage.C0088 r4);

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public abstract boolean mo475();
}

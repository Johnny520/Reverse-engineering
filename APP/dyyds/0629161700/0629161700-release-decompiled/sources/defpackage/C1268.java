package defpackage;

/* JADX INFO: renamed from: ᛷᛴᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1268 implements android.os.Handler.Callback {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0352 f5678;

    public C1268(defpackage.C0352 r1) {
            r0 = this;
            r0.<init>()
            r0.f5678 = r1
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r3) {
            r2 = this;
            int r0 = r3.what
            ᛲᲀᲁᛲ r2 = r2.f5678
            r1 = 1
            if (r0 != r1) goto Lf
            java.lang.Object r3 = r3.obj
            ᛱᲁᲇᛵ r3 = (defpackage.C0189) r3
            r2.m1065(r3)
            return r1
        Lf:
            r1 = 2
            if (r0 != r1) goto L1b
            java.lang.Object r3 = r3.obj
            ᛱᲁᲇᛵ r3 = (defpackage.C0189) r3
            ᲈᛲᛵᲀ r2 = r2.f1824
            r2.m3583(r3)
        L1b:
            r2 = 0
            return r2
    }
}

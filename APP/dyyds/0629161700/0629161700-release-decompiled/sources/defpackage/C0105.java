package defpackage;

/* JADX INFO: renamed from: ᛱᛵᲇᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0105 implements defpackage.InterfaceC0165 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ androidx.activity.C0000 f935;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1773 f936;

    public C0105(androidx.activity.C0000 r1, defpackage.C1773 r2) {
            r0 = this;
            r0.<init>()
            r0.f935 = r1
            r0.f936 = r2
            return
    }

    @Override // defpackage.InterfaceC0165
    public final void cancel() {
            r3 = this;
            androidx.activity.ᛷᲁᛳᛳ r0 = r3.f935
            ᛶᲈᛷᛵ r1 = r0.f12
            ᲀᲇᲁᲇ r2 = r3.f936
            r1.remove(r2)
            java.util.concurrent.CopyOnWriteArrayList r1 = r2.f3137
            r1.remove(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r3 < r1) goto L1a
            r3 = 0
            r2.f3135 = r3
            r0.m7()
        L1a:
            return
    }
}

package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2987<T> extends java.lang.ref.WeakReference<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC3417
    public final int f9645;

    public C2987(T r1, @Yue.InterfaceC4543 java.lang.ref.ReferenceQueue<T> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = 0
        Lb:
            r0.f9645 = r1
            return
    }
}

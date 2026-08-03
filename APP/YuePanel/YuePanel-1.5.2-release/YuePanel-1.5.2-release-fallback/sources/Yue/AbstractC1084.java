package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1084 implements java.util.Iterator<java.lang.Character>, Yue.InterfaceC3443 {
    public AbstractC1084() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Character next() {
            r1 = this;
            char r0 = r1.mo1983()
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Character m5759() {
            r1 = this;
            char r0 = r1.mo1983()
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract char mo1983();
}

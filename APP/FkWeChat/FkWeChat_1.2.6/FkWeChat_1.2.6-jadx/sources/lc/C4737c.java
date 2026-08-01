package lc;

import ec.AbstractC2149k0;
import p145jc.AbstractC3816l;

/* JADX INFO: renamed from: lc.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4737c extends AbstractC4740f {

    /* JADX INFO: renamed from: y */
    public static final C4737c f14048y = new C4737c();

    public C4737c() {
        super(AbstractC4744j.f14060c, AbstractC4744j.f14061d, AbstractC4744j.f14062e, AbstractC4744j.f14058a);
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: b0 */
    public AbstractC2149k0 mo7753b0(int i10, String str) {
        AbstractC3816l.m15199a(i10);
        return i10 >= AbstractC4744j.f14060c ? AbstractC3816l.m15200b(this, str) : super.mo7753b0(i10, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // ec.AbstractC2149k0
    public String toString() {
        return "Dispatchers.Default";
    }
}

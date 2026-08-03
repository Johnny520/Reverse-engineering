package p009j;

import p010k.AbstractC0171a;
import p010k.AbstractC0192v;

/* JADX INFO: renamed from: j.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0153d extends AbstractC0156g {

    /* JADX INFO: renamed from: e */
    private final AbstractC0171a f488e;

    public AbstractC0153d(C0166q c0166q, C0168s c0168s, C0162m c0162m, C0164o c0164o, AbstractC0192v abstractC0192v) {
        super(c0166q, c0168s, c0162m, c0164o);
        if (abstractC0192v == null) {
            throw new NullPointerException("cst == null");
        }
        this.f488e = abstractC0192v;
    }

    @Override // p009j.AbstractC0156g
    /* JADX INFO: renamed from: g */
    public String mo361g() {
        return this.f488e.mo107a();
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC0171a m362l() {
        return this.f488e;
    }
}

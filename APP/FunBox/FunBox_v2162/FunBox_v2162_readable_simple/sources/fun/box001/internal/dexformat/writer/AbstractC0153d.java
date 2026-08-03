package fun.box001.internal.dexformat.writer;

import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.AbstractC0192v;

/* JADX INFO: renamed from: j.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0153d extends AbstractC0156g {

    /* JADX INFO: renamed from: e */
    private final AbstractC0171a f488e;

    public AbstractC0153d(C0166q r1, C0168s r2, C0162m r3, C0164o r4, AbstractC0192v r5) {
        super(r1, r2, r3, r4);
        if (r5 == null) goto L7;
        this.f488e = r5;
        return;
    L7:
        throw new NullPointerException("cst == null");
    }

    @Override // fun.box001.internal.dexformat.writer.AbstractC0156g
    /* JADX INFO: renamed from: g */
    public String mo361g() {
        return this.f488e.mo107a();
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC0171a m362l() {
        return this.f488e;
    }
}

package p038T0;

import java.util.Iterator;
import p011F0.C0115c;

/* JADX INFO: renamed from: T0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0287l implements InterfaceC0283h, InterfaceC0278c {

    /* JADX INFO: renamed from: a */
    public final C0281f f660a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0287l(C0281f c0281f) {
        this.f660a = c0281f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p038T0.InterfaceC0283h
    public final Iterator iterator() {
        return new C0115c(this);
    }

    @Override // p038T0.InterfaceC0278c
    /* JADX INFO: renamed from: a */
    public final InterfaceC0283h mo494a() {
        return this;
    }
}

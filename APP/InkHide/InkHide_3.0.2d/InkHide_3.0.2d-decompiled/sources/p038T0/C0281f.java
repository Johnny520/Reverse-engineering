package p038T0;

import java.util.Iterator;
import p025M0.InterfaceC0204l;

/* JADX INFO: renamed from: T0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0281f implements InterfaceC0283h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0283h f651a;

    /* JADX INFO: renamed from: b */
    public final boolean f652b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0204l f653c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0281f(InterfaceC0283h interfaceC0283h, boolean z2, InterfaceC0204l interfaceC0204l) {
        this.f651a = interfaceC0283h;
        this.f652b = z2;
        this.f653c = interfaceC0204l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p038T0.InterfaceC0283h
    public final Iterator iterator() {
        return new C0280e(this);
    }
}

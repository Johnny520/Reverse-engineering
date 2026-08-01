package p095T;

import p112W2.InterfaceC1601c;
import p158f0.AbstractC2082n;
import p158f0.C2073e;
import p158f0.C2080l;

/* JADX INFO: renamed from: T.V */
/* JADX INFO: loaded from: classes.dex */
public final class C1342V implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4780d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1601c f4781e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1342V(InterfaceC1601c interfaceC1601c, int i5) {
        this.f4780d = i5;
        this.f4781e = interfaceC1601c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        long j5;
        switch (this.f4780d) {
            case 0:
                return this.f4781e.mo1h(Long.valueOf(((Number) obj).longValue() / 1000000));
            default:
                C2080l c2080l = (C2080l) obj;
                synchronized (AbstractC2082n.f6972c) {
                    j5 = AbstractC2082n.f6974e;
                    AbstractC2082n.f6974e = ((long) 1) + j5;
                }
                return new C2073e(j5, c2080l, this.f4781e);
        }
    }
}

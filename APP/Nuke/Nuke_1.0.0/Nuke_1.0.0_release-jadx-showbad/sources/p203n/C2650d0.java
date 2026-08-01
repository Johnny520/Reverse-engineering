package p203n;

import p095T.C1352b0;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: n.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2650d0 implements InterfaceC2677v {

    /* JADX INFO: renamed from: a */
    public final int f8455a;

    /* JADX INFO: renamed from: b */
    public final int f8456b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2675t f8457c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2650d0(int i5, int i6, InterfaceC2675t interfaceC2675t) {
        this.f8455a = i5;
        this.f8456b = i6;
        this.f8457c = interfaceC2675t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2659i
    /* JADX INFO: renamed from: a */
    public final InterfaceC2656g0 mo4572a(C2652e0 c2652e0) {
        return new C1352b0(this.f8455a, this.f8456b, this.f8457c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C2650d0) {
            C2650d0 c2650d0 = (C2650d0) obj;
            if (c2650d0.f8455a == this.f8455a && c2650d0.f8456b == this.f8456b && AbstractC1665j.m2981a(c2650d0.f8457c, this.f8457c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return ((this.f8457c.hashCode() + (this.f8455a * 31)) * 31) + this.f8456b;
    }
}

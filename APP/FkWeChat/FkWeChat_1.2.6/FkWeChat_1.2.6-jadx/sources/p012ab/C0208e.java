package p012ab;

import gb.AbstractC2650c1;
import p024b9.AbstractC1061t;
import p229p9.InterfaceC5995e;

/* JADX INFO: renamed from: ab.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C0208e implements InterfaceC0210g, InterfaceC0211h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5995e f541a;

    /* JADX INFO: renamed from: b */
    public final C0208e f542b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5995e f543c;

    public C0208e(InterfaceC5995e interfaceC5995e, C0208e c0208e) {
        interfaceC5995e.getClass();
        this.f541a = interfaceC5995e;
        this.f542b = c0208e == null ? this : c0208e;
        this.f543c = interfaceC5995e;
    }

    @Override // p012ab.InterfaceC0210g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC2650c1 getType() {
        AbstractC2650c1 abstractC2650c1Mo7508x = this.f541a.mo7508x();
        abstractC2650c1Mo7508x.getClass();
        return abstractC2650c1Mo7508x;
    }

    public boolean equals(Object obj) {
        InterfaceC5995e interfaceC5995e = this.f541a;
        C0208e c0208e = obj instanceof C0208e ? (C0208e) obj : null;
        return AbstractC1061t.m3842c(interfaceC5995e, c0208e != null ? c0208e.f541a : null);
    }

    public int hashCode() {
        return this.f541a.hashCode();
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }

    @Override // p012ab.InterfaceC0211h
    /* JADX INFO: renamed from: w */
    public final InterfaceC5995e mo447w() {
        return this.f541a;
    }
}

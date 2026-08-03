package Yue;

import Yue.C5850;
import Yue.C7148;

/* JADX INFO: renamed from: Yue.ۥۡۨۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7318<E> extends AbstractC7312 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final E f22090;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final InterfaceC3665<C8107> f22091;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۟ۨ۟<? super Yue.ۥۣۢ۠ۤ> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7318(E e, @InterfaceC6399 InterfaceC3665<? super C8107> interfaceC3665) {
        this.f22090 = e;
        this.f22091 = interfaceC3665;
    }

    @Override // Yue.C5850
    @InterfaceC6399
    public String toString() {
        return C4325.m1288(this) + '@' + C4325.m1289(this) + '(' + mo5875() + ')';
    }

    @Override // Yue.AbstractC7312
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
    public void mo5874() {
        this.f22091.mo10022(C3667.f6491);
    }

    @Override // Yue.AbstractC7312
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ */
    public E mo5875() {
        return this.f22090;
    }

    @Override // Yue.AbstractC7312
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
    public void mo5876(@InterfaceC6399 C3850<?> c3850) {
        InterfaceC3665<C8107> interfaceC3665 = this.f22091;
        C7148.C1189 c1189 = C7148.f21560;
        interfaceC3665.resumeWith(C7148.m3438(C7149.m3441(c3850.m10658())));
    }

    @Override // Yue.AbstractC7312
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ */
    public C7694 mo5877(@InterfaceC6489 C5850.C5852 c5852) {
        if (this.f22091.mo10015(C8107.f3222, c5852 != null ? c5852.f14507 : null) == null) {
            return null;
        }
        if (c5852 != null) {
            c5852.m18124();
        }
        return C3667.f6491;
    }
}

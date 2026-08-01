package p029F0;

import java.util.Map;
import p023E0.AbstractC0277a;
import p112W2.InterfaceC1601c;
import p153e1.EnumC2017m;

/* JADX INFO: renamed from: F0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0428u implements InterfaceC0379Q, InterfaceC0420q {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0420q f1290d;

    /* JADX INFO: renamed from: e */
    public final EnumC2017m f1291e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0428u(InterfaceC0420q interfaceC0420q, EnumC2017m enumC2017m) {
        this.f1290d = interfaceC0420q;
        this.f1291e = enumC2017m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: C */
    public final long mo266C(float f2) {
        return this.f1290d.mo266C(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: E */
    public final long mo267E(long j5) {
        return this.f1290d.mo267E(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: G */
    public final float mo268G(float f2) {
        return this.f1290d.mo268G(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: M */
    public final float mo269M(long j5) {
        return this.f1290d.mo269M(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: S */
    public final int mo270S(float f2) {
        return this.f1290d.mo270S(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        return this.f1290d.mo272b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: c0 */
    public final long mo273c0(long j5) {
        return this.f1290d.mo273c0(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: e0 */
    public final float mo276e0(long j5) {
        return this.f1290d.mo276e0(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0420q
    public final EnumC2017m getLayoutDirection() {
        return this.f1291e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: k0 */
    public final long mo280k0(float f2) {
        return this.f1290d.mo280k0(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        return this.f1290d.mo282p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: q0 */
    public final float mo283q0(int i5) {
        return this.f1290d.mo283q0(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0379Q
    /* JADX INFO: renamed from: r */
    public final InterfaceC0378P mo605r(int i5, int i6, Map map, InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2) {
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        if ((i5 & (-16777216)) != 0 || ((-16777216) & i6) != 0) {
            AbstractC0277a.m483b("Size(" + i5 + " x " + i6 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C0426t(i5, i6, map, interfaceC1601c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: u0 */
    public final float mo284u0(float f2) {
        return this.f1290d.mo284u0(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0420q
    /* JADX INFO: renamed from: z */
    public final boolean mo606z() {
        return this.f1290d.mo606z();
    }
}

package p029F0;

import java.util.Map;
import p023E0.AbstractC0277a;
import p041H0.EnumC0557E;
import p112W2.InterfaceC1601c;
import p153e1.EnumC2017m;

/* JADX INFO: renamed from: F0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0367E implements InterfaceC0415n0 {

    /* JADX INFO: renamed from: d */
    public EnumC2017m f1154d = EnumC2017m.f6743e;

    /* JADX INFO: renamed from: e */
    public float f1155e;

    /* JADX INFO: renamed from: f */
    public float f1156f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0373K f1157g;

    public C0367E(C0373K c0373k) {
        this.f1157g = c0373k;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    @Override // p029F0.InterfaceC0415n0
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List mo603J(p112W2.InterfaceC1603e r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p029F0.C0367E.mo603J(W2.e, java.lang.Object):java.util.List");
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        return this.f1155e;
    }

    @Override // p029F0.InterfaceC0420q
    public final EnumC2017m getLayoutDirection() {
        return this.f1154d;
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        return this.f1156f;
    }

    @Override // p029F0.InterfaceC0379Q
    /* JADX INFO: renamed from: r */
    public final InterfaceC0378P mo605r(int i5, int i6, Map map, InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2) {
        if ((i5 & (-16777216)) != 0 || ((-16777216) & i6) != 0) {
            AbstractC0277a.m483b("Size(" + i5 + " x " + i6 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C0366D(i5, i6, map, interfaceC1601c, this, this.f1157g, interfaceC1601c2);
    }

    @Override // p029F0.InterfaceC0420q
    /* JADX INFO: renamed from: z */
    public final boolean mo606z() {
        EnumC0557E enumC0557E = this.f1157g.f1171d.f1700K.f1748d;
        return enumC0557E == EnumC0557E.f1675g || enumC0557E == EnumC0557E.f1673e;
    }
}

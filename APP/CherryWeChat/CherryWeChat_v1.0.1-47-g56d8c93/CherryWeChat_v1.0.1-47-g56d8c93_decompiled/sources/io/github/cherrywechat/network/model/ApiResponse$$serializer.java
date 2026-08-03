package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0628Oj;
import p000.C0329Hl;
import p000.C0809St;
import p000.C2521sz;
import p000.C2766ym;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0406Jc;
import p000.InterfaceC0624Of;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0919Va;
import p000.InterfaceC2677wj;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ApiResponse$$serializer<T> implements InterfaceC2677wj {
    private final InterfaceC0126Cx descriptor;
    private final /* synthetic */ InterfaceC0717Qm typeSerial0;

    private ApiResponse$$serializer() {
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.ApiResponse", this, 4);
        c0809St.m1614l("code");
        c0809St.m1614l("msg");
        c0809St.m1614l("message");
        c0809St.m1614l("data");
        this.descriptor = c0809St;
    }

    private final /* synthetic */ InterfaceC0717Qm getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        InterfaceC0717Qm interfaceC0717QmM1249v = AbstractC0628Oj.m1249v(this.typeSerial0);
        C2521sz c2521sz = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{C0329Hl.f1129a, c2521sz, c2521sz, interfaceC0717QmM1249v};
    }

    @Override // p000.InterfaceC0717Qm
    public final ApiResponse<T> deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx interfaceC0126Cx = this.descriptor;
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(interfaceC0126Cx);
        int i = 0;
        int iMo1780w = 0;
        String strMo1775o = null;
        String strMo1775o2 = null;
        Object objMo1769i = null;
        boolean z = true;
        while (z) {
            int iMo1770j = interfaceC0919VaMo839B.mo1770j(interfaceC0126Cx);
            if (iMo1770j == -1) {
                z = false;
            } else if (iMo1770j == 0) {
                iMo1780w = interfaceC0919VaMo839B.mo1780w(interfaceC0126Cx, 0);
                i |= 1;
            } else if (iMo1770j == 1) {
                strMo1775o = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 1);
                i |= 2;
            } else if (iMo1770j == 2) {
                strMo1775o2 = interfaceC0919VaMo839B.mo1775o(interfaceC0126Cx, 2);
                i |= 4;
            } else {
                if (iMo1770j != 3) {
                    throw new C2766ym(iMo1770j);
                }
                objMo1769i = interfaceC0919VaMo839B.mo1769i(interfaceC0126Cx, 3, this.typeSerial0, objMo1769i);
                i |= 8;
            }
        }
        interfaceC0919VaMo839B.mo1777r(interfaceC0126Cx);
        return new ApiResponse<>(i, iMo1780w, strMo1775o, strMo1775o2, objMo1769i, (AbstractC0298Gx) null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return this.descriptor;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, ApiResponse<T> apiResponse) {
        InterfaceC0126Cx interfaceC0126Cx = this.descriptor;
        interfaceC0624Of.m1213c();
        ApiResponse.write$Self$app_release(apiResponse, null, interfaceC0126Cx, this.typeSerial0);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] typeParametersSerializers() {
        return new InterfaceC0717Qm[]{this.typeSerial0};
    }

    public ApiResponse$$serializer(InterfaceC0717Qm interfaceC0717Qm) {
        this();
        this.typeSerial0 = interfaceC0717Qm;
    }
}

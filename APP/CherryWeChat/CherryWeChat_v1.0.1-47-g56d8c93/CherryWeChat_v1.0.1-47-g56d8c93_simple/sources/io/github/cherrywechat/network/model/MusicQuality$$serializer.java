package io.github.cherrywechat.network.model;

import p000.AbstractC0295Gu;
import p000.C0809St;
import p000.C2597up;
import p000.C2766ym;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0406Jc;
import p000.InterfaceC0624Of;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0919Va;
import p000.InterfaceC2677wj;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MusicQuality$$serializer implements InterfaceC2677wj {
    public static final MusicQuality$$serializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        MusicQuality$$serializer r0 = new MusicQuality$$serializer();
        INSTANCE = r0;
        C0809St r1 = new C0809St("io.github.cherrywechat.network.model.MusicQuality", r0, 1);
        r1.m1614l("size");
        descriptor = r1;
    }

    private MusicQuality$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        return new InterfaceC0717Qm[]{C2597up.f8972a};
    }

    @Override // p000.InterfaceC0717Qm
    public final MusicQuality deserialize(InterfaceC0406Jc r10) {
        InterfaceC0126Cx r0 = descriptor;
        InterfaceC0919Va r102 = r10.mo839B(r0);
        long r3 = 0;
        boolean r5 = true;
        int r6 = 0;
    L3:
        if (r5 == false) goto L11;
        int r7 = r102.mo1770j(r0);
        if (r7 != (-1)) goto L6;
        r5 = false;
        goto L3
    L6:
        if (r7 != 0) goto L9;
        r3 = r102.mo1767A(r0, 0);
        r6 = 1;
        goto L3
    L9:
        throw new C2766ym(r7);
    L11:
        r102.mo1777r(r0);
        return new MusicQuality(r6, r3, null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    public final void serialize(InterfaceC0624Of r2, MusicQuality r3) {
        InterfaceC0126Cx r0 = descriptor;
        r2.m1213c();
        MusicQuality.write$Self$app_release(r3, null, r0);
        throw null;
    }

    @Override // p000.InterfaceC2677wj
    public InterfaceC0717Qm[] typeParametersSerializers() {
        return AbstractC0295Gu.f1004i;
    }

    @Override // p000.InterfaceC0717Qm
    public /* bridge */ /* synthetic */ Object deserialize(InterfaceC0406Jc r1) {
        return deserialize(r1);
    }

    @Override // p000.InterfaceC0717Qm
    public /* bridge */ /* synthetic */ void serialize(InterfaceC0624Of r1, Object r2) {
        serialize(r1, (MusicQuality) r2);
    }
}

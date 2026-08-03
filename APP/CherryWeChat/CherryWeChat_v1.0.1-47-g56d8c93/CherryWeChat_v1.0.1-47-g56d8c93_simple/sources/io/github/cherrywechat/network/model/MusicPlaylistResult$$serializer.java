package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0295Gu;
import p000.AbstractC0628Oj;
import p000.C0809St;
import p000.C2521sz;
import p000.C2597up;
import p000.C2766ym;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0406Jc;
import p000.InterfaceC0624Of;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0919Va;
import p000.InterfaceC2677wj;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MusicPlaylistResult$$serializer implements InterfaceC2677wj {
    public static final MusicPlaylistResult$$serializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        MusicPlaylistResult$$serializer r0 = new MusicPlaylistResult$$serializer();
        INSTANCE = r0;
        C0809St r1 = new C0809St("io.github.cherrywechat.network.model.MusicPlaylistResult", r0, 5);
        r1.m1614l("id");
        r1.m1614l("name");
        r1.m1614l("coverImgUrl");
        r1.m1614l("description");
        r1.m1614l("tracks");
        descriptor = r1;
    }

    private MusicPlaylistResult$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        InterfaceC0159Dn[] r0 = MusicPlaylistResult.access$get$childSerializers$cp();
        C2521sz r2 = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{C2597up.f8972a, AbstractC0628Oj.m1249v(r2), AbstractC0628Oj.m1249v(r2), AbstractC0628Oj.m1249v(r2), r0[4].getValue()};
    }

    @Override // p000.InterfaceC0717Qm
    public final MusicPlaylistResult deserialize(InterfaceC0406Jc r18) {
        InterfaceC0126Cx r0 = descriptor;
        InterfaceC0919Va r1 = r18.mo839B(r0);
        InterfaceC0159Dn[] r2 = MusicPlaylistResult.access$get$childSerializers$cp();
        int r9 = 0;
        long r10 = 0;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        List r15 = null;
        boolean r5 = true;
    L3:
        if (r5 == false) goto L22;
        int r6 = r1.mo1770j(r0);
        if (r6 != (-1)) goto L6;
        r5 = false;
        goto L3
    L6:
        if (r6 != 0) goto L7;
        r10 = r1.mo1767A(r0, 0);
        r9 = r9 | 1;
        goto L3
    L7:
        if (r6 != 1) goto L9;
        r12 = (String) r1.mo1769i(r0, 1, C2521sz.f8819a, r12);
        r9 = r9 | 2;
        goto L3
    L9:
        if (r6 != 2) goto L11;
        r13 = (String) r1.mo1769i(r0, 2, C2521sz.f8819a, r13);
        r9 = r9 | 4;
        goto L3
    L11:
        if (r6 != 3) goto L13;
        r14 = (String) r1.mo1769i(r0, 3, C2521sz.f8819a, r14);
        r9 = r9 | 8;
        goto L3
    L13:
        if (r6 != 4) goto L16;
        r15 = (List) r1.mo1779v(r0, 4, (InterfaceC0717Qm) r2[4].getValue(), r15);
        r9 = r9 | 16;
        goto L3
    L16:
        throw new C2766ym(r6);
    L22:
        r1.mo1777r(r0);
        return new MusicPlaylistResult(r9, r10, r12, r13, r14, r15, null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    public final void serialize(InterfaceC0624Of r2, MusicPlaylistResult r3) {
        InterfaceC0126Cx r0 = descriptor;
        r2.m1213c();
        MusicPlaylistResult.write$Self$app_release(r3, null, r0);
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
        serialize(r1, (MusicPlaylistResult) r2);
    }
}

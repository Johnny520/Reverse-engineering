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
public final /* synthetic */ class MusicTrack$$serializer implements InterfaceC2677wj {
    public static final MusicTrack$$serializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        MusicTrack$$serializer r0 = new MusicTrack$$serializer();
        INSTANCE = r0;
        C0809St r1 = new C0809St("io.github.cherrywechat.network.model.MusicTrack", r0, 8);
        r1.m1614l("id");
        r1.m1614l("name");
        r1.m1614l("artists");
        r1.m1614l("album");
        r1.m1614l("duration");
        r1.m1614l("hMusic");
        r1.m1614l("mMusic");
        r1.m1614l("lMusic");
        descriptor = r1;
    }

    private MusicTrack$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        InterfaceC0159Dn[] r0 = MusicTrack.access$get$childSerializers$cp();
        C2597up r2 = C2597up.f8972a;
        MusicQuality$$serializer r02 = MusicQuality$$serializer.INSTANCE;
        return new InterfaceC0717Qm[]{r2, AbstractC0628Oj.m1249v(C2521sz.f8819a), r0[2].getValue(), AbstractC0628Oj.m1249v(MusicAlbum$$serializer.INSTANCE), r2, AbstractC0628Oj.m1249v(r02), AbstractC0628Oj.m1249v(r02), AbstractC0628Oj.m1249v(r02)};
    }

    @Override // p000.InterfaceC0717Qm
    public final MusicTrack deserialize(InterfaceC0406Jc r22) {
        InterfaceC0126Cx r0 = descriptor;
        InterfaceC0919Va r1 = r22.mo839B(r0);
        InterfaceC0159Dn[] r2 = MusicTrack.access$get$childSerializers$cp();
        MusicQuality r7 = null;
        long r10 = 0;
        long r15 = 0;
        MusicQuality r5 = null;
        MusicQuality r6 = null;
        String r12 = null;
        List r13 = null;
        MusicAlbum r14 = null;
        boolean r8 = true;
        int r9 = 0;
    L3:
        if (r8 == false) goto L17;
        int r4 = r1.mo1770j(r0);
        switch(r4) {
            case -1: goto L16;
            case 0: goto L15;
            case 1: goto L14;
            case 2: goto L13;
            case 3: goto L12;
            case 4: goto L11;
            case 5: goto L10;
            case 6: goto L9;
            case 7: goto L8;
            default: goto L7;
        };
    L7:
        throw new C2766ym(r4);
    L9:
        r5 = (MusicQuality) r1.mo1769i(r0, 6, MusicQuality$$serializer.INSTANCE, r5);
        r9 = r9 | 64;
        goto L3
    L10:
        r7 = (MusicQuality) r1.mo1769i(r0, 5, MusicQuality$$serializer.INSTANCE, r7);
        r9 = r9 | 32;
        goto L3
    L11:
        r15 = r1.mo1767A(r0, 4);
        r9 = r9 | 16;
        goto L3
    L12:
        r14 = (MusicAlbum) r1.mo1769i(r0, 3, MusicAlbum$$serializer.INSTANCE, r14);
        r9 = r9 | 8;
        goto L3
    L13:
        r13 = (List) r1.mo1779v(r0, 2, (InterfaceC0717Qm) r2[2].getValue(), r13);
        r9 = r9 | 4;
        goto L3
    L14:
        r12 = (String) r1.mo1769i(r0, 1, C2521sz.f8819a, r12);
        r9 = r9 | 2;
        goto L3
    L15:
        r10 = r1.mo1767A(r0, 0);
        r9 = r9 | 1;
        goto L3
    L16:
        r8 = false;
        goto L3
    L8:
        r6 = (MusicQuality) r1.mo1769i(r0, 7, MusicQuality$$serializer.INSTANCE, r6);
        r9 = r9 | 128;
        goto L3
    L17:
        r1.mo1777r(r0);
        return new MusicTrack(r9, r10, r12, r13, r14, r15, r7, r5, r6, null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    public final void serialize(InterfaceC0624Of r2, MusicTrack r3) {
        InterfaceC0126Cx r0 = descriptor;
        r2.m1213c();
        MusicTrack.write$Self$app_release(r3, null, r0);
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
        serialize(r1, (MusicTrack) r2);
    }
}

package io.github.cherrywechat.network.model;

import p000.AbstractC0295Gu;
import p000.C0809St;
import p000.C2521sz;
import p000.C2597up;
import p000.C2766ym;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0406Jc;
import p000.InterfaceC0624Of;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0919Va;
import p000.InterfaceC2677wj;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SavedMusicItem$$serializer implements InterfaceC2677wj {
    public static final SavedMusicItem$$serializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        SavedMusicItem$$serializer r0 = new SavedMusicItem$$serializer();
        INSTANCE = r0;
        C0809St r1 = new C0809St("io.github.cherrywechat.network.model.SavedMusicItem", r0, 9);
        r1.m1614l("songId");
        r1.m1614l("albumId");
        r1.m1614l("title");
        r1.m1614l("artist");
        r1.m1614l("size");
        r1.m1614l("url");
        r1.m1614l("duration");
        r1.m1614l("album");
        r1.m1614l("imageUrl");
        descriptor = r1;
    }

    private SavedMusicItem$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        C2597up r1 = C2597up.f8972a;
        C2521sz r2 = C2521sz.f8819a;
        return new InterfaceC0717Qm[]{r1, r1, r2, r2, r1, r2, r1, r2, r2};
    }

    @Override // p000.InterfaceC0717Qm
    public final SavedMusicItem deserialize(InterfaceC0406Jc r24) {
        InterfaceC0126Cx r0 = descriptor;
        InterfaceC0919Va r1 = r24.mo839B(r0);
        int r8 = 0;
        long r9 = 0;
        long r11 = 0;
        long r15 = 0;
        long r18 = 0;
        String r13 = null;
        String r14 = null;
        String r17 = null;
        String r20 = null;
        String r21 = null;
        boolean r4 = true;
    L3:
        if (r4 == false) goto L18;
        int r5 = r1.mo1770j(r0);
        switch(r5) {
            case -1: goto L17;
            case 0: goto L16;
            case 1: goto L15;
            case 2: goto L14;
            case 3: goto L13;
            case 4: goto L12;
            case 5: goto L11;
            case 6: goto L10;
            case 7: goto L9;
            case 8: goto L8;
            default: goto L7;
        };
    L7:
        throw new C2766ym(r5);
    L9:
        r20 = r1.mo1775o(r0, 7);
        r8 = r8 | 128;
        goto L3
    L10:
        r18 = r1.mo1767A(r0, 6);
        r8 = r8 | 64;
        goto L3
    L11:
        r17 = r1.mo1775o(r0, 5);
        r8 = r8 | 32;
        goto L3
    L12:
        r15 = r1.mo1767A(r0, 4);
        r8 = r8 | 16;
        goto L3
    L13:
        r14 = r1.mo1775o(r0, 3);
        r8 = r8 | 8;
        goto L3
    L14:
        r13 = r1.mo1775o(r0, 2);
        r8 = r8 | 4;
        goto L3
    L15:
        r11 = r1.mo1767A(r0, 1);
        r8 = r8 | 2;
        goto L3
    L16:
        r9 = r1.mo1767A(r0, 0);
        r8 = r8 | 1;
        goto L3
    L17:
        r4 = false;
        goto L3
    L8:
        r21 = r1.mo1775o(r0, 8);
        r8 = r8 | 256;
        goto L3
    L18:
        r1.mo1777r(r0);
        return new SavedMusicItem(r8, r9, r11, r13, r14, r15, r17, r18, r20, r21, null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    public final void serialize(InterfaceC0624Of r2, SavedMusicItem r3) {
        InterfaceC0126Cx r0 = descriptor;
        r2.m1213c();
        SavedMusicItem.write$Self$app_release(r3, null, r0);
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
        serialize(r1, (SavedMusicItem) r2);
    }
}

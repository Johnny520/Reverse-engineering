package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0295Gu;
import p000.AbstractC0628Oj;
import p000.C0809St;
import p000.C0865U5;
import p000.C2521sz;
import p000.C2766ym;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0406Jc;
import p000.InterfaceC0624Of;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0919Va;
import p000.InterfaceC2677wj;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AnnouncementItem$$serializer implements InterfaceC2677wj {
    public static final AnnouncementItem$$serializer INSTANCE = null;
    private static final InterfaceC0126Cx descriptor = null;

    static {
        AnnouncementItem$$serializer r0 = new AnnouncementItem$$serializer();
        INSTANCE = r0;
        C0809St r1 = new C0809St("io.github.cherrywechat.network.model.AnnouncementItem", r0, 8);
        r1.m1614l("id");
        r1.m1614l("title");
        r1.m1614l("content");
        r1.m1614l("type");
        r1.m1614l("isPopup");
        r1.m1614l("canClose");
        r1.m1614l("targetUsers");
        r1.m1614l("betaUserList");
        descriptor = r1;
    }

    private AnnouncementItem$$serializer() {
    }

    @Override // p000.InterfaceC2677wj
    public final InterfaceC0717Qm[] childSerializers() {
        InterfaceC0717Qm r0 = AbstractC0628Oj.m1249v((InterfaceC0717Qm) AnnouncementItem.access$get$childSerializers$cp()[7].getValue());
        C2521sz r3 = C2521sz.f8819a;
        C0865U5 r4 = C0865U5.f2734a;
        return new InterfaceC0717Qm[]{r3, r3, r3, r3, r4, r4, r3, r0};
    }

    @Override // p000.InterfaceC0717Qm
    public final AnnouncementItem deserialize(InterfaceC0406Jc r18) {
        InterfaceC0126Cx r0 = descriptor;
        InterfaceC0919Va r1 = r18.mo839B(r0);
        InterfaceC0159Dn[] r2 = AnnouncementItem.access$get$childSerializers$cp();
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r14 = null;
        List r15 = null;
        int r7 = 0;
        boolean r12 = false;
        boolean r13 = false;
        boolean r5 = true;
    L3:
        if (r5 == false) goto L17;
        int r6 = r1.mo1770j(r0);
        switch(r6) {
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
        throw new C2766ym(r6);
    L9:
        r14 = r1.mo1775o(r0, 6);
        r7 = r7 | 64;
        goto L3
    L10:
        r13 = r1.mo1778s(r0, 5);
        r7 = r7 | 32;
        goto L3
    L11:
        r12 = r1.mo1778s(r0, 4);
        r7 = r7 | 16;
        goto L3
    L12:
        r11 = r1.mo1775o(r0, 3);
        r7 = r7 | 8;
        goto L3
    L13:
        r10 = r1.mo1775o(r0, 2);
        r7 = r7 | 4;
        goto L3
    L14:
        r9 = r1.mo1775o(r0, 1);
        r7 = r7 | 2;
        goto L3
    L15:
        r8 = r1.mo1775o(r0, 0);
        r7 = r7 | 1;
        goto L3
    L16:
        r5 = false;
        goto L3
    L8:
        r15 = (List) r1.mo1769i(r0, 7, (InterfaceC0717Qm) r2[7].getValue(), r15);
        r7 = r7 | 128;
        goto L3
    L17:
        r1.mo1777r(r0);
        return new AnnouncementItem(r7, r8, r9, r10, r11, r12, r13, r14, r15, null);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return descriptor;
    }

    public final void serialize(InterfaceC0624Of r2, AnnouncementItem r3) {
        InterfaceC0126Cx r0 = descriptor;
        r2.m1213c();
        AnnouncementItem.write$Self$app_release(r3, null, r0);
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
        serialize(r1, (AnnouncementItem) r2);
    }
}

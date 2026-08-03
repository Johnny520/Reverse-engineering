package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0148Dc;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.C0263G4;
import p000.C1302d;
import p000.C2521sz;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class AnnouncementItem {
    private static final InterfaceC0159Dn[] $childSerializers = null;
    public static final Companion Companion = null;
    private final List<String> betaUserList;
    private final boolean canClose;
    private final String content;

    /* JADX INFO: renamed from: id */
    private final String f5564id;
    private final boolean isPopup;
    private final String targetUsers;
    private final String title;
    private final String type;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return AnnouncementItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
        $childSerializers = new InterfaceC0159Dn[]{null, null, null, null, null, null, null, AbstractC0148Dc.m280n(2, new C1302d(3))};
    }

    public AnnouncementItem() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        boolean r5 = false;
        boolean r6 = false;
        String r7 = null;
        List r8 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, 255, null);
    }

    private static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(C2521sz.f8819a);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0717Qm m3540a() {
        return _childSerializers$_anonymous_();
    }

    public static final /* synthetic */ InterfaceC0159Dn[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnnouncementItem copy$default(AnnouncementItem r0, String r1, String r2, String r3, String r4, boolean r5, boolean r6, String r7, List r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.f5564id;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.title;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.content;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.type;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.isPopup;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.canClose;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.targetUsers;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.betaUserList;
    L26:
        String r92 = r7;
        List r102 = r8;
        boolean r72 = r5;
        boolean r82 = r6;
        String r52 = r3;
        String r62 = r4;
        return r0.copy(r1, r2, r52, r62, r72, r82, r92, r102);
    }

    public static final /* synthetic */ void write$Self$app_release(AnnouncementItem r2, InterfaceC0962Wa r3, InterfaceC0126Cx r4) {
        InterfaceC0159Dn[] r42 = $childSerializers;
        if (r3.m1845g() == false) goto L6;
    L7:
        String r0 = r2.f5564id;
        r3.m1842d();
    L9:
        if (r3.m1845g() == false) goto L12;
    L13:
        String r02 = r2.title;
        r3.m1842d();
    L15:
        if (r3.m1845g() == false) goto L18;
    L19:
        String r03 = r2.content;
        r3.m1842d();
    L21:
        if (r3.m1845g() == false) goto L24;
    L25:
        String r04 = r2.type;
        r3.m1842d();
    L27:
        if (r3.m1845g() == false) goto L30;
    L31:
        boolean r05 = r2.isPopup;
        r3.m1840b();
    L33:
        if (r3.m1845g() == false) goto L36;
    L37:
        boolean r06 = r2.canClose;
        r3.m1840b();
    L39:
        if (r3.m1845g() == false) goto L42;
    L43:
        String r07 = r2.targetUsers;
        r3.m1842d();
    L45:
        if (r3.m1845g() == false) goto L48;
    L49:
        InterfaceC0717Qm r43 = (InterfaceC0717Qm) r42[7].getValue();
        List<String> r22 = r2.betaUserList;
        r3.m1844f();
        return;
    L48:
        if (r2.betaUserList != null) goto L49;
        return;
    L42:
        if (AbstractC0585Nj.m1134a(r2.targetUsers, "all") == true) goto L45;
    L36:
        if (r2.canClose == true) goto L39;
    L30:
        if (r2.isPopup == false) goto L33;
    L24:
        if (AbstractC0585Nj.m1134a(r2.type, "") == true) goto L27;
    L18:
        if (AbstractC0585Nj.m1134a(r2.content, "") == true) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r2.title, "") == true) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r2.f5564id, "") == true) goto L9;
        goto L7
    }

    public final String component1() {
        return this.f5564id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.content;
    }

    public final String component4() {
        return this.type;
    }

    public final boolean component5() {
        return this.isPopup;
    }

    public final boolean component6() {
        return this.canClose;
    }

    public final String component7() {
        return this.targetUsers;
    }

    public final List<String> component8() {
        return this.betaUserList;
    }

    public final AnnouncementItem copy(String r10, String r11, String r12, String r13, boolean r14, boolean r15, String r16, List<String> r17) {
        return new AnnouncementItem(r10, r11, r12, r13, r14, r15, r16, r17);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AnnouncementItem) == true) goto L8;
        return false;
    L8:
        AnnouncementItem r52 = (AnnouncementItem) r5;
        if (AbstractC0585Nj.m1134a(this.f5564id, r52.f5564id) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.title, r52.title) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.content, r52.content) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.type, r52.type) == true) goto L21;
        return false;
    L21:
        if (this.isPopup == r52.isPopup) goto L24;
        return false;
    L24:
        if (this.canClose == r52.canClose) goto L27;
        return false;
    L27:
        if (AbstractC0585Nj.m1134a(this.targetUsers, r52.targetUsers) == true) goto L30;
        return false;
    L30:
        if (AbstractC0585Nj.m1134a(this.betaUserList, r52.betaUserList) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final List<String> getBetaUserList() {
        return this.betaUserList;
    }

    public final boolean getCanClose() {
        return this.canClose;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getId() {
        return this.f5564id;
    }

    public final String getTargetUsers() {
        return this.targetUsers;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int r0 = this.f5564id.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.title, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.content, r02, 31);
        int r04 = AbstractC2374ph.m4810g(this.type, r03, 31);
        int r2 = (Boolean.hashCode(this.isPopup) + r04) * 31;
        int r05 = (Boolean.hashCode(this.canClose) + r2) * 31;
        int r06 = AbstractC2374ph.m4810g(this.targetUsers, r05, 31);
        List<String> r1 = this.betaUserList;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r06 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final boolean isPopup() {
        return this.isPopup;
    }

    public String toString() {
        return "AnnouncementItem(id=" + this.f5564id + ", title=" + this.title + ", content=" + this.content + ", type=" + this.type + ", isPopup=" + this.isPopup + ", canClose=" + this.canClose + ", targetUsers=" + this.targetUsers + ", betaUserList=" + this.betaUserList + ')';
    }

    public /* synthetic */ AnnouncementItem(int r2, String r3, String r4, String r5, String r6, boolean r7, boolean r8, String r9, List r10, AbstractC0298Gx r11) {
        if ((r2 & 1) != 0) goto L5;
        this.f5564id = "";
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.title = "";
    L11:
        if ((r2 & 4) != 0) goto L13;
        this.content = "";
    L15:
        if ((r2 & 8) != 0) goto L17;
        this.type = "";
    L19:
        if ((r2 & 16) != 0) goto L21;
        this.isPopup = false;
    L23:
        if ((r2 & 32) != 0) goto L25;
        this.canClose = true;
    L27:
        if ((r2 & 64) != 0) goto L29;
        this.targetUsers = "all";
    L31:
        if ((r2 & 128) != 0) goto L34;
        this.betaUserList = null;
        return;
    L34:
        this.betaUserList = r10;
        return;
    L29:
        this.targetUsers = r9;
        goto L31
    L25:
        this.canClose = r8;
        goto L27
    L21:
        this.isPopup = r7;
        goto L23
    L17:
        this.type = r6;
        goto L19
    L13:
        this.content = r5;
        goto L15
    L9:
        this.title = r4;
        goto L11
    L5:
        this.f5564id = r3;
        goto L7
    }

    public AnnouncementItem(String r1, String r2, String r3, String r4, boolean r5, boolean r6, String r7, List<String> r8) {
        this.f5564id = r1;
        this.title = r2;
        this.content = r3;
        this.type = r4;
        this.isPopup = r5;
        this.canClose = r6;
        this.targetUsers = r7;
        this.betaUserList = r8;
    }

    public /* synthetic */ AnnouncementItem(String r2, String r3, String r4, String r5, boolean r6, boolean r7, String r8, List r9, int r10, AbstractC0621Oc r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = false;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = true;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = "all";
    L24:
        if ((r10 & 128) == 0) goto L26;
        r9 = null;
    L26:
        List r102 = r9;
        String r92 = r8;
        boolean r82 = r7;
        boolean r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92, r102);
    }
}

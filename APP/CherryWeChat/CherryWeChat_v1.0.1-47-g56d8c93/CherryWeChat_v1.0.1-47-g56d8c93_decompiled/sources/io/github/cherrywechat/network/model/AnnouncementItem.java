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
    private final List<String> betaUserList;
    private final boolean canClose;
    private final String content;

    /* JADX INFO: renamed from: id */
    private final String f5564id;
    private final boolean isPopup;
    private final String targetUsers;
    private final String title;
    private final String type;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0159Dn[] $childSerializers = {null, null, null, null, null, null, null, AbstractC0148Dc.m280n(2, new C1302d(3))};

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return AnnouncementItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public AnnouncementItem() {
        this((String) null, (String) null, (String) null, (String) null, false, false, (String) null, (List) null, 255, (AbstractC0621Oc) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(C2521sz.f8819a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnnouncementItem copy$default(AnnouncementItem announcementItem, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = announcementItem.f5564id;
        }
        if ((i & 2) != 0) {
            str2 = announcementItem.title;
        }
        if ((i & 4) != 0) {
            str3 = announcementItem.content;
        }
        if ((i & 8) != 0) {
            str4 = announcementItem.type;
        }
        if ((i & 16) != 0) {
            z = announcementItem.isPopup;
        }
        if ((i & 32) != 0) {
            z2 = announcementItem.canClose;
        }
        if ((i & 64) != 0) {
            str5 = announcementItem.targetUsers;
        }
        if ((i & 128) != 0) {
            list = announcementItem.betaUserList;
        }
        String str6 = str5;
        List list2 = list;
        boolean z3 = z;
        boolean z4 = z2;
        return announcementItem.copy(str, str2, str3, str4, z3, z4, str6, list2);
    }

    public static final /* synthetic */ void write$Self$app_release(AnnouncementItem announcementItem, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        InterfaceC0159Dn[] interfaceC0159DnArr = $childSerializers;
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(announcementItem.f5564id, "")) {
            String str = announcementItem.f5564id;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(announcementItem.title, "")) {
            String str2 = announcementItem.title;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(announcementItem.content, "")) {
            String str3 = announcementItem.content;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(announcementItem.type, "")) {
            String str4 = announcementItem.type;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || announcementItem.isPopup) {
            boolean z = announcementItem.isPopup;
            interfaceC0962Wa.m1840b();
        }
        if (interfaceC0962Wa.m1845g() || !announcementItem.canClose) {
            boolean z2 = announcementItem.canClose;
            interfaceC0962Wa.m1840b();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(announcementItem.targetUsers, "all")) {
            String str5 = announcementItem.targetUsers;
            interfaceC0962Wa.m1842d();
        }
        if (!interfaceC0962Wa.m1845g() && announcementItem.betaUserList == null) {
            return;
        }
        List<String> list = announcementItem.betaUserList;
        interfaceC0962Wa.m1844f();
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

    public final AnnouncementItem copy(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, List<String> list) {
        return new AnnouncementItem(str, str2, str3, str4, z, z2, str5, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnouncementItem)) {
            return false;
        }
        AnnouncementItem announcementItem = (AnnouncementItem) obj;
        return AbstractC0585Nj.m1134a(this.f5564id, announcementItem.f5564id) && AbstractC0585Nj.m1134a(this.title, announcementItem.title) && AbstractC0585Nj.m1134a(this.content, announcementItem.content) && AbstractC0585Nj.m1134a(this.type, announcementItem.type) && this.isPopup == announcementItem.isPopup && this.canClose == announcementItem.canClose && AbstractC0585Nj.m1134a(this.targetUsers, announcementItem.targetUsers) && AbstractC0585Nj.m1134a(this.betaUserList, announcementItem.betaUserList);
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
        int iM4810g = AbstractC2374ph.m4810g(this.targetUsers, (Boolean.hashCode(this.canClose) + ((Boolean.hashCode(this.isPopup) + AbstractC2374ph.m4810g(this.type, AbstractC2374ph.m4810g(this.content, AbstractC2374ph.m4810g(this.title, this.f5564id.hashCode() * 31, 31), 31), 31)) * 31)) * 31, 31);
        List<String> list = this.betaUserList;
        return iM4810g + (list == null ? 0 : list.hashCode());
    }

    public final boolean isPopup() {
        return this.isPopup;
    }

    public String toString() {
        return "AnnouncementItem(id=" + this.f5564id + ", title=" + this.title + ", content=" + this.content + ", type=" + this.type + ", isPopup=" + this.isPopup + ", canClose=" + this.canClose + ", targetUsers=" + this.targetUsers + ", betaUserList=" + this.betaUserList + ')';
    }

    public /* synthetic */ AnnouncementItem(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, List list, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.f5564id = "";
        } else {
            this.f5564id = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.content = "";
        } else {
            this.content = str3;
        }
        if ((i & 8) == 0) {
            this.type = "";
        } else {
            this.type = str4;
        }
        if ((i & 16) == 0) {
            this.isPopup = false;
        } else {
            this.isPopup = z;
        }
        if ((i & 32) == 0) {
            this.canClose = true;
        } else {
            this.canClose = z2;
        }
        if ((i & 64) == 0) {
            this.targetUsers = "all";
        } else {
            this.targetUsers = str5;
        }
        if ((i & 128) == 0) {
            this.betaUserList = null;
        } else {
            this.betaUserList = list;
        }
    }

    public AnnouncementItem(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, List<String> list) {
        this.f5564id = str;
        this.title = str2;
        this.content = str3;
        this.type = str4;
        this.isPopup = z;
        this.canClose = z2;
        this.targetUsers = str5;
        this.betaUserList = list;
    }

    public /* synthetic */ AnnouncementItem(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, List list, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? "all" : str5, (i & 128) != 0 ? null : list);
    }
}

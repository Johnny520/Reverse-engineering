package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0148Dc;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.C0263G4;
import p000.C0452Kf;
import p000.C1302d;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class AnnouncementsWrapper {
    private final List<AnnouncementItem> data;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0159Dn[] $childSerializers = {AbstractC0148Dc.m280n(2, new C1302d(4))};

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return AnnouncementsWrapper$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnouncementsWrapper() {
        this((List) null, 1, (AbstractC0621Oc) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(AnnouncementItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnnouncementsWrapper copy$default(AnnouncementsWrapper announcementsWrapper, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = announcementsWrapper.data;
        }
        return announcementsWrapper.copy(list);
    }

    public static final /* synthetic */ void write$Self$app_release(AnnouncementsWrapper announcementsWrapper, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        InterfaceC0159Dn[] interfaceC0159DnArr = $childSerializers;
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(announcementsWrapper.data, C0452Kf.f1484a)) {
            return;
        }
        List<AnnouncementItem> list = announcementsWrapper.data;
        interfaceC0962Wa.m1839a();
    }

    public final List<AnnouncementItem> component1() {
        return this.data;
    }

    public final AnnouncementsWrapper copy(List<AnnouncementItem> list) {
        return new AnnouncementsWrapper(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnnouncementsWrapper) && AbstractC0585Nj.m1134a(this.data, ((AnnouncementsWrapper) obj).data);
    }

    public final List<AnnouncementItem> getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "AnnouncementsWrapper(data=" + this.data + ')';
    }

    public /* synthetic */ AnnouncementsWrapper(int i, List list, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.data = C0452Kf.f1484a;
        } else {
            this.data = list;
        }
    }

    public AnnouncementsWrapper(List<AnnouncementItem> list) {
        this.data = list;
    }

    public /* synthetic */ AnnouncementsWrapper(List list, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? C0452Kf.f1484a : list);
    }
}

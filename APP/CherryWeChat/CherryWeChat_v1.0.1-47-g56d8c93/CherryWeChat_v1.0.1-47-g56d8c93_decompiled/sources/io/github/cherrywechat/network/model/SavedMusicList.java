package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0148Dc;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.C0263G4;
import p000.C0452Kf;
import p000.C1302d;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class SavedMusicList {
    private final String coverImgUrl;
    private final String description;

    /* JADX INFO: renamed from: id */
    private final String f5573id;
    private final List<SavedMusicItem> list;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0159Dn[] $childSerializers = {null, null, null, null, AbstractC0148Dc.m280n(2, new C1302d(21))};

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return SavedMusicList$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public SavedMusicList() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, 31, (AbstractC0621Oc) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(SavedMusicItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavedMusicList copy$default(SavedMusicList savedMusicList, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedMusicList.f5573id;
        }
        if ((i & 2) != 0) {
            str2 = savedMusicList.name;
        }
        if ((i & 4) != 0) {
            str3 = savedMusicList.coverImgUrl;
        }
        if ((i & 8) != 0) {
            str4 = savedMusicList.description;
        }
        if ((i & 16) != 0) {
            list = savedMusicList.list;
        }
        List list2 = list;
        String str5 = str3;
        return savedMusicList.copy(str, str2, str5, str4, list2);
    }

    public static final /* synthetic */ void write$Self$app_release(SavedMusicList savedMusicList, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        InterfaceC0159Dn[] interfaceC0159DnArr = $childSerializers;
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(savedMusicList.f5573id, "")) {
            String str = savedMusicList.f5573id;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(savedMusicList.name, "")) {
            String str2 = savedMusicList.name;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(savedMusicList.coverImgUrl, "")) {
            String str3 = savedMusicList.coverImgUrl;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(savedMusicList.description, "")) {
            String str4 = savedMusicList.description;
            interfaceC0962Wa.m1842d();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(savedMusicList.list, C0452Kf.f1484a)) {
            return;
        }
        List<SavedMusicItem> list = savedMusicList.list;
        interfaceC0962Wa.m1839a();
    }

    public final String component1() {
        return this.f5573id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.coverImgUrl;
    }

    public final String component4() {
        return this.description;
    }

    public final List<SavedMusicItem> component5() {
        return this.list;
    }

    public final SavedMusicList copy(String str, String str2, String str3, String str4, List<SavedMusicItem> list) {
        return new SavedMusicList(str, str2, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedMusicList)) {
            return false;
        }
        SavedMusicList savedMusicList = (SavedMusicList) obj;
        return AbstractC0585Nj.m1134a(this.f5573id, savedMusicList.f5573id) && AbstractC0585Nj.m1134a(this.name, savedMusicList.name) && AbstractC0585Nj.m1134a(this.coverImgUrl, savedMusicList.coverImgUrl) && AbstractC0585Nj.m1134a(this.description, savedMusicList.description) && AbstractC0585Nj.m1134a(this.list, savedMusicList.list);
    }

    public final String getCoverImgUrl() {
        return this.coverImgUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f5573id;
    }

    public final List<SavedMusicItem> getList() {
        return this.list;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.list.hashCode() + AbstractC2374ph.m4810g(this.description, AbstractC2374ph.m4810g(this.coverImgUrl, AbstractC2374ph.m4810g(this.name, this.f5573id.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        return "SavedMusicList(id=" + this.f5573id + ", name=" + this.name + ", coverImgUrl=" + this.coverImgUrl + ", description=" + this.description + ", list=" + this.list + ')';
    }

    public /* synthetic */ SavedMusicList(int i, String str, String str2, String str3, String str4, List list, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.f5573id = "";
        } else {
            this.f5573id = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.coverImgUrl = "";
        } else {
            this.coverImgUrl = str3;
        }
        if ((i & 8) == 0) {
            this.description = "";
        } else {
            this.description = str4;
        }
        if ((i & 16) == 0) {
            this.list = C0452Kf.f1484a;
        } else {
            this.list = list;
        }
    }

    public SavedMusicList(String str, String str2, String str3, String str4, List<SavedMusicItem> list) {
        this.f5573id = str;
        this.name = str2;
        this.coverImgUrl = str3;
        this.description = str4;
        this.list = list;
    }

    public /* synthetic */ SavedMusicList(String str, String str2, String str3, String str4, List list, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? C0452Kf.f1484a : list);
    }
}

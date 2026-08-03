package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.C2521sz;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class Developer {
    public static final Companion Companion = new Companion(null);
    private final String avatar;
    private final String link;
    private final String name;
    private final String role;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return Developer$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public Developer() {
        this((String) null, (String) null, (String) null, (String) null, 15, (AbstractC0621Oc) null);
    }

    public static /* synthetic */ Developer copy$default(Developer developer, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = developer.name;
        }
        if ((i & 2) != 0) {
            str2 = developer.role;
        }
        if ((i & 4) != 0) {
            str3 = developer.link;
        }
        if ((i & 8) != 0) {
            str4 = developer.avatar;
        }
        return developer.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$app_release(Developer developer, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(developer.name, "")) {
            String str = developer.name;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(developer.role, "")) {
            String str2 = developer.role;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || developer.link != null) {
            C2521sz c2521sz = C2521sz.f8819a;
            String str3 = developer.link;
            interfaceC0962Wa.m1844f();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(developer.avatar, "")) {
            return;
        }
        String str4 = developer.avatar;
        interfaceC0962Wa.m1842d();
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.role;
    }

    public final String component3() {
        return this.link;
    }

    public final String component4() {
        return this.avatar;
    }

    public final Developer copy(String str, String str2, String str3, String str4) {
        return new Developer(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Developer)) {
            return false;
        }
        Developer developer = (Developer) obj;
        return AbstractC0585Nj.m1134a(this.name, developer.name) && AbstractC0585Nj.m1134a(this.role, developer.role) && AbstractC0585Nj.m1134a(this.link, developer.link) && AbstractC0585Nj.m1134a(this.avatar, developer.avatar);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        int iM4810g = AbstractC2374ph.m4810g(this.role, this.name.hashCode() * 31, 31);
        String str = this.link;
        return this.avatar.hashCode() + ((iM4810g + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Developer(name=");
        sb.append(this.name);
        sb.append(", role=");
        sb.append(this.role);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", avatar=");
        return AbstractC2374ph.m4815l(sb, this.avatar, ')');
    }

    public /* synthetic */ Developer(int i, String str, String str2, String str3, String str4, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.role = "";
        } else {
            this.role = str2;
        }
        if ((i & 4) == 0) {
            this.link = null;
        } else {
            this.link = str3;
        }
        if ((i & 8) == 0) {
            this.avatar = "";
        } else {
            this.avatar = str4;
        }
    }

    public Developer(String str, String str2, String str3, String str4) {
        this.name = str;
        this.role = str2;
        this.link = str3;
        this.avatar = str4;
    }

    public /* synthetic */ Developer(String str, String str2, String str3, String str4, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4);
    }
}

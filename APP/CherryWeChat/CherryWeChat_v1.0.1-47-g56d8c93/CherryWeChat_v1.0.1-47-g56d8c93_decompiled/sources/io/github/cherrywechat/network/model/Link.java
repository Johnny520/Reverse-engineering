package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class Link {
    public static final Companion Companion = new Companion(null);
    private final String description;
    private final String title;
    private final String url;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return Link$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public Link() {
        this((String) null, (String) null, (String) null, 7, (AbstractC0621Oc) null);
    }

    public static /* synthetic */ Link copy$default(Link link, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = link.title;
        }
        if ((i & 2) != 0) {
            str2 = link.description;
        }
        if ((i & 4) != 0) {
            str3 = link.url;
        }
        return link.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app_release(Link link, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(link.title, "")) {
            String str = link.title;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(link.description, "")) {
            String str2 = link.description;
            interfaceC0962Wa.m1842d();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(link.url, "")) {
            return;
        }
        String str3 = link.url;
        interfaceC0962Wa.m1842d();
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.url;
    }

    public final Link copy(String str, String str2, String str3) {
        return new Link(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Link)) {
            return false;
        }
        Link link = (Link) obj;
        return AbstractC0585Nj.m1134a(this.title, link.title) && AbstractC0585Nj.m1134a(this.description, link.description) && AbstractC0585Nj.m1134a(this.url, link.url);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + AbstractC2374ph.m4810g(this.description, this.title.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Link(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", url=");
        return AbstractC2374ph.m4815l(sb, this.url, ')');
    }

    public /* synthetic */ Link(int i, String str, String str2, String str3, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.description = "";
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.url = "";
        } else {
            this.url = str3;
        }
    }

    public Link(String str, String str2, String str3) {
        this.title = str;
        this.description = str2;
        this.url = str3;
    }

    public /* synthetic */ Link(String str, String str2, String str3, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}

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
    public static final Companion Companion = null;
    private final String description;
    private final String title;
    private final String url;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return Link$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public Link() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ Link copy$default(Link r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.title;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.description;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.url;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public static final /* synthetic */ void write$Self$app_release(Link r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        String r32 = r1.title;
        r2.m1842d();
    L9:
        if (r2.m1845g() == false) goto L12;
    L13:
        String r33 = r1.description;
        r2.m1842d();
    L15:
        if (r2.m1845g() == false) goto L18;
    L19:
        String r12 = r1.url;
        r2.m1842d();
        return;
    L18:
        if (AbstractC0585Nj.m1134a(r1.url, "") == false) goto L19;
        return;
    L12:
        if (AbstractC0585Nj.m1134a(r1.description, "") == true) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r1.title, "") == true) goto L9;
        goto L7
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

    public final Link copy(String r2, String r3, String r4) {
        return new Link(r2, r3, r4);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Link) == true) goto L8;
        return false;
    L8:
        Link r52 = (Link) r5;
        if (AbstractC0585Nj.m1134a(this.title, r52.title) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.description, r52.description) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.url, r52.url) == true) goto L17;
        return false;
    L17:
        return true;
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
        int r0 = this.title.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.description, r0, 31);
        return this.url.hashCode() + r02;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("Link(title=");
        r0.append(this.title);
        r0.append(", description=");
        r0.append(this.description);
        r0.append(", url=");
        return AbstractC2374ph.m4815l(r0, this.url, ')');
    }

    public /* synthetic */ Link(int r2, String r3, String r4, String r5, AbstractC0298Gx r6) {
        if ((r2 & 1) != 0) goto L5;
        this.title = "";
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.description = "";
    L11:
        if ((r2 & 4) != 0) goto L14;
        this.url = "";
        return;
    L14:
        this.url = r5;
        return;
    L9:
        this.description = r4;
        goto L11
    L5:
        this.title = r3;
        goto L7
    }

    public Link(String r1, String r2, String r3) {
        this.title = r1;
        this.description = r2;
        this.url = r3;
    }

    public /* synthetic */ Link(String r2, String r3, String r4, int r5, AbstractC0621Oc r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}

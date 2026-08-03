package io.github.cherrywechat.network.model;

import p000.AbstractC0213Ey;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class FriendLinkItem {
    public static final Companion Companion = new Companion(null);
    private final int color;
    private final String description;
    private final String icon;
    private final String name;
    private final String url;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return FriendLinkItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public FriendLinkItem() {
        this((String) null, (String) null, (String) null, (String) null, 0, 31, (AbstractC0621Oc) null);
    }

    public static /* synthetic */ FriendLinkItem copy$default(FriendLinkItem friendLinkItem, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = friendLinkItem.name;
        }
        if ((i2 & 2) != 0) {
            str2 = friendLinkItem.description;
        }
        if ((i2 & 4) != 0) {
            str3 = friendLinkItem.url;
        }
        if ((i2 & 8) != 0) {
            str4 = friendLinkItem.icon;
        }
        if ((i2 & 16) != 0) {
            i = friendLinkItem.color;
        }
        int i3 = i;
        String str5 = str3;
        return friendLinkItem.copy(str, str2, str5, str4, i3);
    }

    public static final /* synthetic */ void write$Self$app_release(FriendLinkItem friendLinkItem, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(friendLinkItem.name, "")) {
            String str = friendLinkItem.name;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(friendLinkItem.description, "")) {
            String str2 = friendLinkItem.description;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(friendLinkItem.url, "")) {
            String str3 = friendLinkItem.url;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(friendLinkItem.icon, "")) {
            String str4 = friendLinkItem.icon;
            interfaceC0962Wa.m1842d();
        }
        if (!interfaceC0962Wa.m1845g() && friendLinkItem.color == 0) {
            return;
        }
        int i = friendLinkItem.color;
        interfaceC0962Wa.m1843e();
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.icon;
    }

    public final int component5() {
        return this.color;
    }

    public final FriendLinkItem copy(String str, String str2, String str3, String str4, int i) {
        return new FriendLinkItem(str, str2, str3, str4, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendLinkItem)) {
            return false;
        }
        FriendLinkItem friendLinkItem = (FriendLinkItem) obj;
        return AbstractC0585Nj.m1134a(this.name, friendLinkItem.name) && AbstractC0585Nj.m1134a(this.description, friendLinkItem.description) && AbstractC0585Nj.m1134a(this.url, friendLinkItem.url) && AbstractC0585Nj.m1134a(this.icon, friendLinkItem.icon) && this.color == friendLinkItem.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Integer.hashCode(this.color) + AbstractC2374ph.m4810g(this.icon, AbstractC2374ph.m4810g(this.url, AbstractC2374ph.m4810g(this.description, this.name.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FriendLinkItem(name=");
        sb.append(this.name);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", color=");
        return AbstractC0213Ey.m408f(sb, this.color, ')');
    }

    public /* synthetic */ FriendLinkItem(int i, String str, String str2, String str3, String str4, int i2, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
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
        if ((i & 8) == 0) {
            this.icon = "";
        } else {
            this.icon = str4;
        }
        if ((i & 16) == 0) {
            this.color = 0;
        } else {
            this.color = i2;
        }
    }

    public FriendLinkItem(String str, String str2, String str3, String str4, int i) {
        this.name = str;
        this.description = str2;
        this.url = str3;
        this.icon = str4;
        this.color = i;
    }

    public /* synthetic */ FriendLinkItem(String str, String str2, String str3, String str4, int i, int i2, AbstractC0621Oc abstractC0621Oc) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 0 : i);
    }
}

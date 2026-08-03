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
    public static final Companion Companion = null;
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

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public FriendLinkItem() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        int r5 = 0;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ FriendLinkItem copy$default(FriendLinkItem r0, String r1, String r2, String r3, String r4, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.name;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.description;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.url;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.icon;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.color;
    L17:
        String r62 = r4;
        int r72 = r5;
        String r52 = r3;
        String r32 = r1;
        return r0.copy(r32, r2, r52, r62, r72);
    }

    public static final /* synthetic */ void write$Self$app_release(FriendLinkItem r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        String r32 = r1.name;
        r2.m1842d();
    L9:
        if (r2.m1845g() == false) goto L12;
    L13:
        String r33 = r1.description;
        r2.m1842d();
    L15:
        if (r2.m1845g() == false) goto L18;
    L19:
        String r34 = r1.url;
        r2.m1842d();
    L21:
        if (r2.m1845g() == false) goto L24;
    L25:
        String r35 = r1.icon;
        r2.m1842d();
    L27:
        if (r2.m1845g() == false) goto L30;
    L31:
        int r12 = r1.color;
        r2.m1843e();
        return;
    L30:
        if (r1.color != 0) goto L31;
        return;
    L24:
        if (AbstractC0585Nj.m1134a(r1.icon, "") == true) goto L27;
    L18:
        if (AbstractC0585Nj.m1134a(r1.url, "") == true) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r1.description, "") == true) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r1.name, "") == true) goto L9;
        goto L7
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

    public final FriendLinkItem copy(String r7, String r8, String r9, String r10, int r11) {
        return new FriendLinkItem(r7, r8, r9, r10, r11);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof FriendLinkItem) == true) goto L8;
        return false;
    L8:
        FriendLinkItem r52 = (FriendLinkItem) r5;
        if (AbstractC0585Nj.m1134a(this.name, r52.name) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.description, r52.description) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.url, r52.url) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.icon, r52.icon) == true) goto L21;
        return false;
    L21:
        if (this.color == r52.color) goto L23;
        return false;
    L23:
        return true;
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
        int r0 = this.name.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.description, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.url, r02, 31);
        int r04 = AbstractC2374ph.m4810g(this.icon, r03, 31);
        return Integer.hashCode(this.color) + r04;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("FriendLinkItem(name=");
        r0.append(this.name);
        r0.append(", description=");
        r0.append(this.description);
        r0.append(", url=");
        r0.append(this.url);
        r0.append(", icon=");
        r0.append(this.icon);
        r0.append(", color=");
        return AbstractC0213Ey.m408f(r0, this.color, ')');
    }

    public /* synthetic */ FriendLinkItem(int r2, String r3, String r4, String r5, String r6, int r7, AbstractC0298Gx r8) {
        if ((r2 & 1) != 0) goto L5;
        this.name = "";
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.description = "";
    L11:
        if ((r2 & 4) != 0) goto L13;
        this.url = "";
    L15:
        if ((r2 & 8) != 0) goto L17;
        this.icon = "";
    L19:
        if ((r2 & 16) != 0) goto L22;
        this.color = 0;
        return;
    L22:
        this.color = r7;
        return;
    L17:
        this.icon = r6;
        goto L19
    L13:
        this.url = r5;
        goto L15
    L9:
        this.description = r4;
        goto L11
    L5:
        this.name = r3;
        goto L7
    }

    public FriendLinkItem(String r1, String r2, String r3, String r4, int r5) {
        this.name = r1;
        this.description = r2;
        this.url = r3;
        this.icon = r4;
        this.color = r5;
    }

    public /* synthetic */ FriendLinkItem(String r2, String r3, String r4, String r5, int r6, int r7, AbstractC0621Oc r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = 0;
    L17:
        int r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72);
    }
}

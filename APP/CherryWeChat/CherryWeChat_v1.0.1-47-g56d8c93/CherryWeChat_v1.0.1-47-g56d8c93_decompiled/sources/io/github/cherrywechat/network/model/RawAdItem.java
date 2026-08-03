package io.github.cherrywechat.network.model;

import p000.AbstractC0213Ey;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.C2521sz;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class RawAdItem {
    public static final Companion Companion = new Companion(null);
    private final String endTime;

    /* JADX INFO: renamed from: id */
    private final String f5572id;
    private final String imageUrl;
    private final String linkUrl;
    private final int sortOrder;
    private final int status;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return RawAdItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public RawAdItem() {
        this((String) null, (String) null, (String) null, 0, 0, (String) null, 63, (AbstractC0621Oc) null);
    }

    public static /* synthetic */ RawAdItem copy$default(RawAdItem rawAdItem, String str, String str2, String str3, int i, int i2, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = rawAdItem.f5572id;
        }
        if ((i3 & 2) != 0) {
            str2 = rawAdItem.imageUrl;
        }
        if ((i3 & 4) != 0) {
            str3 = rawAdItem.linkUrl;
        }
        if ((i3 & 8) != 0) {
            i = rawAdItem.status;
        }
        if ((i3 & 16) != 0) {
            i2 = rawAdItem.sortOrder;
        }
        if ((i3 & 32) != 0) {
            str4 = rawAdItem.endTime;
        }
        int i4 = i2;
        String str5 = str4;
        return rawAdItem.copy(str, str2, str3, i, i4, str5);
    }

    public static final /* synthetic */ void write$Self$app_release(RawAdItem rawAdItem, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(rawAdItem.f5572id, "default_id")) {
            String str = rawAdItem.f5572id;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(rawAdItem.imageUrl, "")) {
            String str2 = rawAdItem.imageUrl;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(rawAdItem.linkUrl, "")) {
            String str3 = rawAdItem.linkUrl;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || rawAdItem.status != 0) {
            int i = rawAdItem.status;
            interfaceC0962Wa.m1843e();
        }
        if (interfaceC0962Wa.m1845g() || rawAdItem.sortOrder != 0) {
            int i2 = rawAdItem.sortOrder;
            interfaceC0962Wa.m1843e();
        }
        if (!interfaceC0962Wa.m1845g() && rawAdItem.endTime == null) {
            return;
        }
        C2521sz c2521sz = C2521sz.f8819a;
        String str4 = rawAdItem.endTime;
        interfaceC0962Wa.m1844f();
    }

    public final String component1() {
        return this.f5572id;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.linkUrl;
    }

    public final int component4() {
        return this.status;
    }

    public final int component5() {
        return this.sortOrder;
    }

    public final String component6() {
        return this.endTime;
    }

    public final RawAdItem copy(String str, String str2, String str3, int i, int i2, String str4) {
        return new RawAdItem(str, str2, str3, i, i2, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawAdItem)) {
            return false;
        }
        RawAdItem rawAdItem = (RawAdItem) obj;
        return AbstractC0585Nj.m1134a(this.f5572id, rawAdItem.f5572id) && AbstractC0585Nj.m1134a(this.imageUrl, rawAdItem.imageUrl) && AbstractC0585Nj.m1134a(this.linkUrl, rawAdItem.linkUrl) && this.status == rawAdItem.status && this.sortOrder == rawAdItem.sortOrder && AbstractC0585Nj.m1134a(this.endTime, rawAdItem.endTime);
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getId() {
        return this.f5572id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iM403a = AbstractC0213Ey.m403a(this.sortOrder, AbstractC0213Ey.m403a(this.status, AbstractC2374ph.m4810g(this.linkUrl, AbstractC2374ph.m4810g(this.imageUrl, this.f5572id.hashCode() * 31, 31), 31), 31), 31);
        String str = this.endTime;
        return iM403a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RawAdItem(id=");
        sb.append(this.f5572id);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", linkUrl=");
        sb.append(this.linkUrl);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", sortOrder=");
        sb.append(this.sortOrder);
        sb.append(", endTime=");
        return AbstractC2374ph.m4815l(sb, this.endTime, ')');
    }

    public /* synthetic */ RawAdItem(int i, String str, String str2, String str3, int i2, int i3, String str4, AbstractC0298Gx abstractC0298Gx) {
        this.f5572id = (i & 1) == 0 ? "default_id" : str;
        if ((i & 2) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str2;
        }
        if ((i & 4) == 0) {
            this.linkUrl = "";
        } else {
            this.linkUrl = str3;
        }
        if ((i & 8) == 0) {
            this.status = 0;
        } else {
            this.status = i2;
        }
        if ((i & 16) == 0) {
            this.sortOrder = 0;
        } else {
            this.sortOrder = i3;
        }
        if ((i & 32) == 0) {
            this.endTime = null;
        } else {
            this.endTime = str4;
        }
    }

    public RawAdItem(String str, String str2, String str3, int i, int i2, String str4) {
        this.f5572id = str;
        this.imageUrl = str2;
        this.linkUrl = str3;
        this.status = i;
        this.sortOrder = i2;
        this.endTime = str4;
    }

    public /* synthetic */ RawAdItem(String str, String str2, String str3, int i, int i2, String str4, int i3, AbstractC0621Oc abstractC0621Oc) {
        this((i3 & 1) != 0 ? "default_id" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : str4);
    }
}

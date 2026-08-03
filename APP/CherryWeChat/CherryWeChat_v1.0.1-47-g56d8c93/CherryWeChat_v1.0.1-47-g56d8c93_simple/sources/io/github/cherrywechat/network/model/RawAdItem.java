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
    public static final Companion Companion = null;
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

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public RawAdItem() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        int r4 = 0;
        int r5 = 0;
        String r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ RawAdItem copy$default(RawAdItem r0, String r1, String r2, String r3, int r4, int r5, String r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.f5572id;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.imageUrl;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.linkUrl;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.status;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.sortOrder;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.endTime;
    L20:
        int r72 = r5;
        String r82 = r6;
        String r52 = r3;
        int r62 = r4;
        return r0.copy(r1, r2, r52, r62, r72, r82);
    }

    public static final /* synthetic */ void write$Self$app_release(RawAdItem r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        String r32 = r1.f5572id;
        r2.m1842d();
    L9:
        if (r2.m1845g() == false) goto L12;
    L13:
        String r33 = r1.imageUrl;
        r2.m1842d();
    L15:
        if (r2.m1845g() == false) goto L18;
    L19:
        String r34 = r1.linkUrl;
        r2.m1842d();
    L21:
        if (r2.m1845g() == false) goto L24;
    L25:
        int r35 = r1.status;
        r2.m1843e();
    L27:
        if (r2.m1845g() == false) goto L30;
    L31:
        int r36 = r1.sortOrder;
        r2.m1843e();
    L33:
        if (r2.m1845g() == false) goto L36;
    L37:
        C2521sz r37 = C2521sz.f8819a;
        String r12 = r1.endTime;
        r2.m1844f();
        return;
    L36:
        if (r1.endTime != null) goto L37;
        return;
    L30:
        if (r1.sortOrder == 0) goto L33;
    L24:
        if (r1.status == 0) goto L27;
    L18:
        if (AbstractC0585Nj.m1134a(r1.linkUrl, "") == true) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r1.imageUrl, "") == true) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r1.f5572id, "default_id") == true) goto L9;
        goto L7
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

    public final RawAdItem copy(String r8, String r9, String r10, int r11, int r12, String r13) {
        return new RawAdItem(r8, r9, r10, r11, r12, r13);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RawAdItem) == true) goto L8;
        return false;
    L8:
        RawAdItem r52 = (RawAdItem) r5;
        if (AbstractC0585Nj.m1134a(this.f5572id, r52.f5572id) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.imageUrl, r52.imageUrl) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.linkUrl, r52.linkUrl) == true) goto L18;
        return false;
    L18:
        if (this.status == r52.status) goto L21;
        return false;
    L21:
        if (this.sortOrder == r52.sortOrder) goto L24;
        return false;
    L24:
        if (AbstractC0585Nj.m1134a(this.endTime, r52.endTime) == true) goto L26;
        return false;
    L26:
        return true;
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
        int r0 = this.f5572id.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.imageUrl, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.linkUrl, r02, 31);
        int r04 = AbstractC0213Ey.m403a(this.status, r03, 31);
        int r05 = AbstractC0213Ey.m403a(this.sortOrder, r04, 31);
        String r1 = this.endTime;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r05 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("RawAdItem(id=");
        r0.append(this.f5572id);
        r0.append(", imageUrl=");
        r0.append(this.imageUrl);
        r0.append(", linkUrl=");
        r0.append(this.linkUrl);
        r0.append(", status=");
        r0.append(this.status);
        r0.append(", sortOrder=");
        r0.append(this.sortOrder);
        r0.append(", endTime=");
        return AbstractC2374ph.m4815l(r0, this.endTime, ')');
    }

    public /* synthetic */ RawAdItem(int r1, String r2, String r3, String r4, int r5, int r6, String r7, AbstractC0298Gx r8) {
        if ((r1 & 1) != 0) goto L5;
        r2 = "default_id";
    L5:
        this.f5572id = r2;
        if ((r1 & 2) != 0) goto L8;
        this.imageUrl = "";
    L10:
        if ((r1 & 4) != 0) goto L12;
        this.linkUrl = "";
    L14:
        if ((r1 & 8) != 0) goto L16;
        this.status = 0;
    L18:
        if ((r1 & 16) != 0) goto L20;
        this.sortOrder = 0;
    L22:
        if ((r1 & 32) != 0) goto L25;
        this.endTime = null;
        return;
    L25:
        this.endTime = r7;
        return;
    L20:
        this.sortOrder = r6;
        goto L22
    L16:
        this.status = r5;
        goto L18
    L12:
        this.linkUrl = r4;
        goto L14
    L8:
        this.imageUrl = r3;
        goto L10
    }

    public RawAdItem(String r1, String r2, String r3, int r4, int r5, String r6) {
        this.f5572id = r1;
        this.imageUrl = r2;
        this.linkUrl = r3;
        this.status = r4;
        this.sortOrder = r5;
        this.endTime = r6;
    }

    public /* synthetic */ RawAdItem(String r2, String r3, String r4, int r5, int r6, String r7, int r8, AbstractC0621Oc r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = "default_id";
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = null;
    L20:
        int r82 = r6;
        String r92 = r7;
        this(r2, r3, r4, r5, r82, r92);
    }
}

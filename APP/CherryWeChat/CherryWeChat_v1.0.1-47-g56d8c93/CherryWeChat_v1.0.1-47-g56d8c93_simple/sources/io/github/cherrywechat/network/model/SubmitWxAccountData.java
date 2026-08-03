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
public final class SubmitWxAccountData {
    public static final Companion Companion = null;
    private final String adUrl;
    private final int adVersion;
    private final int continuousDays;
    private final int isUnlockedInt;
    private final int totalCheckins;
    private final String wxId;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return SubmitWxAccountData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public SubmitWxAccountData() {
        String r1 = null;
        String r2 = null;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ SubmitWxAccountData copy$default(SubmitWxAccountData r0, String r1, String r2, int r3, int r4, int r5, int r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.wxId;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.adUrl;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.adVersion;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.isUnlockedInt;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.continuousDays;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.totalCheckins;
    L20:
        int r72 = r5;
        int r82 = r6;
        int r52 = r3;
        int r62 = r4;
        return r0.copy(r1, r2, r52, r62, r72, r82);
    }

    public static /* synthetic */ void getAdUrl$annotations() {
    }

    public static /* synthetic */ void getAdVersion$annotations() {
    }

    public static /* synthetic */ void getContinuousDays$annotations() {
    }

    public static /* synthetic */ void getTotalCheckins$annotations() {
    }

    public static /* synthetic */ void getWxId$annotations() {
    }

    public static /* synthetic */ void isUnlockedInt$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(SubmitWxAccountData r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        String r32 = r1.wxId;
        r2.m1842d();
    L9:
        if (r2.m1845g() == false) goto L12;
    L13:
        String r33 = r1.adUrl;
        r2.m1842d();
    L15:
        if (r2.m1845g() == false) goto L18;
    L19:
        int r34 = r1.adVersion;
        r2.m1843e();
    L21:
        if (r2.m1845g() == false) goto L24;
    L25:
        int r35 = r1.isUnlockedInt;
        r2.m1843e();
    L27:
        if (r2.m1845g() == false) goto L30;
    L31:
        int r36 = r1.continuousDays;
        r2.m1843e();
    L33:
        if (r2.m1845g() == false) goto L36;
    L37:
        int r12 = r1.totalCheckins;
        r2.m1843e();
        return;
    L36:
        if (r1.totalCheckins != 0) goto L37;
        return;
    L30:
        if (r1.continuousDays == 0) goto L33;
    L24:
        if (r1.isUnlockedInt == 0) goto L27;
    L18:
        if (r1.adVersion == 0) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r1.adUrl, "") == true) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r1.wxId, "") == true) goto L9;
        goto L7
    }

    public final String component1() {
        return this.wxId;
    }

    public final String component2() {
        return this.adUrl;
    }

    public final int component3() {
        return this.adVersion;
    }

    public final int component4() {
        return this.isUnlockedInt;
    }

    public final int component5() {
        return this.continuousDays;
    }

    public final int component6() {
        return this.totalCheckins;
    }

    public final SubmitWxAccountData copy(String r8, String r9, int r10, int r11, int r12, int r13) {
        return new SubmitWxAccountData(r8, r9, r10, r11, r12, r13);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SubmitWxAccountData) == true) goto L8;
        return false;
    L8:
        SubmitWxAccountData r52 = (SubmitWxAccountData) r5;
        if (AbstractC0585Nj.m1134a(this.wxId, r52.wxId) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.adUrl, r52.adUrl) == true) goto L15;
        return false;
    L15:
        if (this.adVersion == r52.adVersion) goto L18;
        return false;
    L18:
        if (this.isUnlockedInt == r52.isUnlockedInt) goto L21;
        return false;
    L21:
        if (this.continuousDays == r52.continuousDays) goto L24;
        return false;
    L24:
        if (this.totalCheckins == r52.totalCheckins) goto L26;
        return false;
    L26:
        return true;
    }

    public final String getAdUrl() {
        return this.adUrl;
    }

    public final int getAdVersion() {
        return this.adVersion;
    }

    public final int getContinuousDays() {
        return this.continuousDays;
    }

    public final int getTotalCheckins() {
        return this.totalCheckins;
    }

    public final String getWxId() {
        return this.wxId;
    }

    public int hashCode() {
        int r0 = this.wxId.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.adUrl, r0, 31);
        int r03 = AbstractC0213Ey.m403a(this.adVersion, r02, 31);
        int r04 = AbstractC0213Ey.m403a(this.isUnlockedInt, r03, 31);
        int r05 = AbstractC0213Ey.m403a(this.continuousDays, r04, 31);
        return Integer.hashCode(this.totalCheckins) + r05;
    }

    public final boolean isUnlocked() {
        if (this.isUnlockedInt != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public final int isUnlockedInt() {
        return this.isUnlockedInt;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("SubmitWxAccountData(wxId=");
        r0.append(this.wxId);
        r0.append(", adUrl=");
        r0.append(this.adUrl);
        r0.append(", adVersion=");
        r0.append(this.adVersion);
        r0.append(", isUnlockedInt=");
        r0.append(this.isUnlockedInt);
        r0.append(", continuousDays=");
        r0.append(this.continuousDays);
        r0.append(", totalCheckins=");
        return AbstractC0213Ey.m408f(r0, this.totalCheckins, ')');
    }

    public /* synthetic */ SubmitWxAccountData(int r2, String r3, String r4, int r5, int r6, int r7, int r8, AbstractC0298Gx r9) {
        if ((r2 & 1) != 0) goto L5;
        this.wxId = "";
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.adUrl = "";
    L11:
        if ((r2 & 4) != 0) goto L13;
        this.adVersion = 0;
    L15:
        if ((r2 & 8) != 0) goto L17;
        this.isUnlockedInt = 0;
    L19:
        if ((r2 & 16) != 0) goto L21;
        this.continuousDays = 0;
    L23:
        if ((r2 & 32) != 0) goto L26;
        this.totalCheckins = 0;
        return;
    L26:
        this.totalCheckins = r8;
        return;
    L21:
        this.continuousDays = r7;
        goto L23
    L17:
        this.isUnlockedInt = r6;
        goto L19
    L13:
        this.adVersion = r5;
        goto L15
    L9:
        this.adUrl = r4;
        goto L11
    L5:
        this.wxId = r3;
        goto L7
    }

    public SubmitWxAccountData(String r1, String r2, int r3, int r4, int r5, int r6) {
        this.wxId = r1;
        this.adUrl = r2;
        this.adVersion = r3;
        this.isUnlockedInt = r4;
        this.continuousDays = r5;
        this.totalCheckins = r6;
    }

    public /* synthetic */ SubmitWxAccountData(String r2, String r3, int r4, int r5, int r6, int r7, int r8, AbstractC0621Oc r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r8 & 32) == 0) goto L21;
        int r82 = 0;
    L20:
        int r72 = r6;
        int r62 = r5;
        int r52 = r4;
        this(r2, r3, r52, r62, r72, r82);
        return;
    L21:
        r82 = r7;
        goto L20
    }
}

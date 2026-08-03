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
public final class UnlockStatusData {
    public static final Companion Companion = null;
    private final String adUrl;
    private final int adVersion;
    private final int continuousDays;
    private final int isUnlockedInt;
    private final int totalCheckins;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return UnlockStatusData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public UnlockStatusData() {
        int r1 = 0;
        int r2 = 0;
        String r3 = null;
        int r4 = 0;
        int r5 = 0;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ UnlockStatusData copy$default(UnlockStatusData r0, int r1, int r2, String r3, int r4, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.isUnlockedInt;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.continuousDays;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.adUrl;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.adVersion;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.totalCheckins;
    L17:
        int r62 = r4;
        int r72 = r5;
        String r52 = r3;
        int r32 = r1;
        return r0.copy(r32, r2, r52, r62, r72);
    }

    public static /* synthetic */ void getAdUrl$annotations() {
    }

    public static /* synthetic */ void getAdVersion$annotations() {
    }

    public static /* synthetic */ void getContinuousDays$annotations() {
    }

    public static /* synthetic */ void getTotalCheckins$annotations() {
    }

    public static /* synthetic */ void isUnlockedInt$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(UnlockStatusData r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        int r32 = r1.isUnlockedInt;
        r2.m1843e();
    L9:
        if (r2.m1845g() == false) goto L12;
    L13:
        int r33 = r1.continuousDays;
        r2.m1843e();
    L15:
        if (r2.m1845g() == false) goto L18;
    L19:
        String r34 = r1.adUrl;
        r2.m1842d();
    L21:
        if (r2.m1845g() == false) goto L24;
    L25:
        int r35 = r1.adVersion;
        r2.m1843e();
    L27:
        if (r2.m1845g() == false) goto L30;
    L31:
        int r12 = r1.totalCheckins;
        r2.m1843e();
        return;
    L30:
        if (r1.totalCheckins != 0) goto L31;
        return;
    L24:
        if (r1.adVersion == 0) goto L27;
    L18:
        if (AbstractC0585Nj.m1134a(r1.adUrl, "") == true) goto L21;
    L12:
        if (r1.continuousDays == 0) goto L15;
    L6:
        if (r1.isUnlockedInt == 0) goto L9;
        goto L7
    }

    public final int component1() {
        return this.isUnlockedInt;
    }

    public final int component2() {
        return this.continuousDays;
    }

    public final String component3() {
        return this.adUrl;
    }

    public final int component4() {
        return this.adVersion;
    }

    public final int component5() {
        return this.totalCheckins;
    }

    public final UnlockStatusData copy(int r7, int r8, String r9, int r10, int r11) {
        return new UnlockStatusData(r7, r8, r9, r10, r11);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnlockStatusData) == true) goto L8;
        return false;
    L8:
        UnlockStatusData r52 = (UnlockStatusData) r5;
        if (this.isUnlockedInt == r52.isUnlockedInt) goto L12;
        return false;
    L12:
        if (this.continuousDays == r52.continuousDays) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.adUrl, r52.adUrl) == true) goto L18;
        return false;
    L18:
        if (this.adVersion == r52.adVersion) goto L21;
        return false;
    L21:
        if (this.totalCheckins == r52.totalCheckins) goto L23;
        return false;
    L23:
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

    public int hashCode() {
        int r0 = Integer.hashCode(this.isUnlockedInt) * 31;
        int r02 = AbstractC0213Ey.m403a(this.continuousDays, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.adUrl, r02, 31);
        int r04 = AbstractC0213Ey.m403a(this.adVersion, r03, 31);
        return Integer.hashCode(this.totalCheckins) + r04;
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
        StringBuilder r0 = new StringBuilder("UnlockStatusData(isUnlockedInt=");
        r0.append(this.isUnlockedInt);
        r0.append(", continuousDays=");
        r0.append(this.continuousDays);
        r0.append(", adUrl=");
        r0.append(this.adUrl);
        r0.append(", adVersion=");
        r0.append(this.adVersion);
        r0.append(", totalCheckins=");
        return AbstractC0213Ey.m408f(r0, this.totalCheckins, ')');
    }

    public /* synthetic */ UnlockStatusData(int r2, int r3, int r4, String r5, int r6, int r7, AbstractC0298Gx r8) {
        if ((r2 & 1) != 0) goto L5;
        this.isUnlockedInt = 0;
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.continuousDays = 0;
    L11:
        if ((r2 & 4) != 0) goto L13;
        this.adUrl = "";
    L15:
        if ((r2 & 8) != 0) goto L17;
        this.adVersion = 0;
    L19:
        if ((r2 & 16) != 0) goto L22;
        this.totalCheckins = 0;
        return;
    L22:
        this.totalCheckins = r7;
        return;
    L17:
        this.adVersion = r6;
        goto L19
    L13:
        this.adUrl = r5;
        goto L15
    L9:
        this.continuousDays = r4;
        goto L11
    L5:
        this.isUnlockedInt = r3;
        goto L7
    }

    public UnlockStatusData(int r1, int r2, String r3, int r4, int r5) {
        this.isUnlockedInt = r1;
        this.continuousDays = r2;
        this.adUrl = r3;
        this.adVersion = r4;
        this.totalCheckins = r5;
    }

    public /* synthetic */ UnlockStatusData(int r2, int r3, String r4, int r5, int r6, int r7, AbstractC0621Oc r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r7 & 16) == 0) goto L18;
        int r72 = 0;
    L17:
        int r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}

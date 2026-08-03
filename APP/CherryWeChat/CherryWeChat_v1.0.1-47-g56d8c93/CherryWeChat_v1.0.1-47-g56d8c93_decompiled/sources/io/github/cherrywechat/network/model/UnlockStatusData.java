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
    public static final Companion Companion = new Companion(null);
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

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public UnlockStatusData() {
        this(0, 0, (String) null, 0, 0, 31, (AbstractC0621Oc) null);
    }

    public static /* synthetic */ UnlockStatusData copy$default(UnlockStatusData unlockStatusData, int i, int i2, String str, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = unlockStatusData.isUnlockedInt;
        }
        if ((i5 & 2) != 0) {
            i2 = unlockStatusData.continuousDays;
        }
        if ((i5 & 4) != 0) {
            str = unlockStatusData.adUrl;
        }
        if ((i5 & 8) != 0) {
            i3 = unlockStatusData.adVersion;
        }
        if ((i5 & 16) != 0) {
            i4 = unlockStatusData.totalCheckins;
        }
        int i6 = i4;
        String str2 = str;
        return unlockStatusData.copy(i, i2, str2, i3, i6);
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

    public static final /* synthetic */ void write$Self$app_release(UnlockStatusData unlockStatusData, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || unlockStatusData.isUnlockedInt != 0) {
            int i = unlockStatusData.isUnlockedInt;
            interfaceC0962Wa.m1843e();
        }
        if (interfaceC0962Wa.m1845g() || unlockStatusData.continuousDays != 0) {
            int i2 = unlockStatusData.continuousDays;
            interfaceC0962Wa.m1843e();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(unlockStatusData.adUrl, "")) {
            String str = unlockStatusData.adUrl;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || unlockStatusData.adVersion != 0) {
            int i3 = unlockStatusData.adVersion;
            interfaceC0962Wa.m1843e();
        }
        if (!interfaceC0962Wa.m1845g() && unlockStatusData.totalCheckins == 0) {
            return;
        }
        int i4 = unlockStatusData.totalCheckins;
        interfaceC0962Wa.m1843e();
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

    public final UnlockStatusData copy(int i, int i2, String str, int i3, int i4) {
        return new UnlockStatusData(i, i2, str, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnlockStatusData)) {
            return false;
        }
        UnlockStatusData unlockStatusData = (UnlockStatusData) obj;
        return this.isUnlockedInt == unlockStatusData.isUnlockedInt && this.continuousDays == unlockStatusData.continuousDays && AbstractC0585Nj.m1134a(this.adUrl, unlockStatusData.adUrl) && this.adVersion == unlockStatusData.adVersion && this.totalCheckins == unlockStatusData.totalCheckins;
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
        return Integer.hashCode(this.totalCheckins) + AbstractC0213Ey.m403a(this.adVersion, AbstractC2374ph.m4810g(this.adUrl, AbstractC0213Ey.m403a(this.continuousDays, Integer.hashCode(this.isUnlockedInt) * 31, 31), 31), 31);
    }

    public final boolean isUnlocked() {
        return this.isUnlockedInt == 1;
    }

    public final int isUnlockedInt() {
        return this.isUnlockedInt;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UnlockStatusData(isUnlockedInt=");
        sb.append(this.isUnlockedInt);
        sb.append(", continuousDays=");
        sb.append(this.continuousDays);
        sb.append(", adUrl=");
        sb.append(this.adUrl);
        sb.append(", adVersion=");
        sb.append(this.adVersion);
        sb.append(", totalCheckins=");
        return AbstractC0213Ey.m408f(sb, this.totalCheckins, ')');
    }

    public /* synthetic */ UnlockStatusData(int i, int i2, int i3, String str, int i4, int i5, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.isUnlockedInt = 0;
        } else {
            this.isUnlockedInt = i2;
        }
        if ((i & 2) == 0) {
            this.continuousDays = 0;
        } else {
            this.continuousDays = i3;
        }
        if ((i & 4) == 0) {
            this.adUrl = "";
        } else {
            this.adUrl = str;
        }
        if ((i & 8) == 0) {
            this.adVersion = 0;
        } else {
            this.adVersion = i4;
        }
        if ((i & 16) == 0) {
            this.totalCheckins = 0;
        } else {
            this.totalCheckins = i5;
        }
    }

    public UnlockStatusData(int i, int i2, String str, int i3, int i4) {
        this.isUnlockedInt = i;
        this.continuousDays = i2;
        this.adUrl = str;
        this.adVersion = i3;
        this.totalCheckins = i4;
    }

    public /* synthetic */ UnlockStatusData(int i, int i2, String str, int i3, int i4, int i5, AbstractC0621Oc abstractC0621Oc) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4);
    }
}

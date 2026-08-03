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
    public static final Companion Companion = new Companion(null);
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

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public SubmitWxAccountData() {
        this((String) null, (String) null, 0, 0, 0, 0, 63, (AbstractC0621Oc) null);
    }

    public static /* synthetic */ SubmitWxAccountData copy$default(SubmitWxAccountData submitWxAccountData, String str, String str2, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = submitWxAccountData.wxId;
        }
        if ((i5 & 2) != 0) {
            str2 = submitWxAccountData.adUrl;
        }
        if ((i5 & 4) != 0) {
            i = submitWxAccountData.adVersion;
        }
        if ((i5 & 8) != 0) {
            i2 = submitWxAccountData.isUnlockedInt;
        }
        if ((i5 & 16) != 0) {
            i3 = submitWxAccountData.continuousDays;
        }
        if ((i5 & 32) != 0) {
            i4 = submitWxAccountData.totalCheckins;
        }
        int i6 = i3;
        int i7 = i4;
        return submitWxAccountData.copy(str, str2, i, i2, i6, i7);
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

    public static final /* synthetic */ void write$Self$app_release(SubmitWxAccountData submitWxAccountData, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(submitWxAccountData.wxId, "")) {
            String str = submitWxAccountData.wxId;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(submitWxAccountData.adUrl, "")) {
            String str2 = submitWxAccountData.adUrl;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || submitWxAccountData.adVersion != 0) {
            int i = submitWxAccountData.adVersion;
            interfaceC0962Wa.m1843e();
        }
        if (interfaceC0962Wa.m1845g() || submitWxAccountData.isUnlockedInt != 0) {
            int i2 = submitWxAccountData.isUnlockedInt;
            interfaceC0962Wa.m1843e();
        }
        if (interfaceC0962Wa.m1845g() || submitWxAccountData.continuousDays != 0) {
            int i3 = submitWxAccountData.continuousDays;
            interfaceC0962Wa.m1843e();
        }
        if (!interfaceC0962Wa.m1845g() && submitWxAccountData.totalCheckins == 0) {
            return;
        }
        int i4 = submitWxAccountData.totalCheckins;
        interfaceC0962Wa.m1843e();
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

    public final SubmitWxAccountData copy(String str, String str2, int i, int i2, int i3, int i4) {
        return new SubmitWxAccountData(str, str2, i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitWxAccountData)) {
            return false;
        }
        SubmitWxAccountData submitWxAccountData = (SubmitWxAccountData) obj;
        return AbstractC0585Nj.m1134a(this.wxId, submitWxAccountData.wxId) && AbstractC0585Nj.m1134a(this.adUrl, submitWxAccountData.adUrl) && this.adVersion == submitWxAccountData.adVersion && this.isUnlockedInt == submitWxAccountData.isUnlockedInt && this.continuousDays == submitWxAccountData.continuousDays && this.totalCheckins == submitWxAccountData.totalCheckins;
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
        return Integer.hashCode(this.totalCheckins) + AbstractC0213Ey.m403a(this.continuousDays, AbstractC0213Ey.m403a(this.isUnlockedInt, AbstractC0213Ey.m403a(this.adVersion, AbstractC2374ph.m4810g(this.adUrl, this.wxId.hashCode() * 31, 31), 31), 31), 31);
    }

    public final boolean isUnlocked() {
        return this.isUnlockedInt == 1;
    }

    public final int isUnlockedInt() {
        return this.isUnlockedInt;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubmitWxAccountData(wxId=");
        sb.append(this.wxId);
        sb.append(", adUrl=");
        sb.append(this.adUrl);
        sb.append(", adVersion=");
        sb.append(this.adVersion);
        sb.append(", isUnlockedInt=");
        sb.append(this.isUnlockedInt);
        sb.append(", continuousDays=");
        sb.append(this.continuousDays);
        sb.append(", totalCheckins=");
        return AbstractC0213Ey.m408f(sb, this.totalCheckins, ')');
    }

    public /* synthetic */ SubmitWxAccountData(int i, String str, String str2, int i2, int i3, int i4, int i5, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.wxId = "";
        } else {
            this.wxId = str;
        }
        if ((i & 2) == 0) {
            this.adUrl = "";
        } else {
            this.adUrl = str2;
        }
        if ((i & 4) == 0) {
            this.adVersion = 0;
        } else {
            this.adVersion = i2;
        }
        if ((i & 8) == 0) {
            this.isUnlockedInt = 0;
        } else {
            this.isUnlockedInt = i3;
        }
        if ((i & 16) == 0) {
            this.continuousDays = 0;
        } else {
            this.continuousDays = i4;
        }
        if ((i & 32) == 0) {
            this.totalCheckins = 0;
        } else {
            this.totalCheckins = i5;
        }
    }

    public SubmitWxAccountData(String str, String str2, int i, int i2, int i3, int i4) {
        this.wxId = str;
        this.adUrl = str2;
        this.adVersion = i;
        this.isUnlockedInt = i2;
        this.continuousDays = i3;
        this.totalCheckins = i4;
    }

    public /* synthetic */ SubmitWxAccountData(String str, String str2, int i, int i2, int i3, int i4, int i5, AbstractC0621Oc abstractC0621Oc) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4);
    }
}

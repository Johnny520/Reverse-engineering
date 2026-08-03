package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.C2521sz;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class ExchangeThemeResponseData {
    public static final Companion Companion = null;
    private final String baiduInputSkinLink;

    /* JADX INFO: renamed from: id */
    private final String f5567id;
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ExchangeThemeResponseData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public ExchangeThemeResponseData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ ExchangeThemeResponseData copy$default(ExchangeThemeResponseData r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.name;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.f5567id;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.baiduInputSkinLink;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public static final /* synthetic */ void write$Self$app_release(ExchangeThemeResponseData r0, InterfaceC0962Wa r1, InterfaceC0126Cx r2) {
        if (r1.m1845g() == false) goto L6;
    L7:
        C2521sz r22 = C2521sz.f8819a;
        String r23 = r0.name;
        r1.m1844f();
    L9:
        if (r1.m1845g() == false) goto L12;
    L13:
        C2521sz r24 = C2521sz.f8819a;
        String r25 = r0.f5567id;
        r1.m1844f();
    L15:
        if (r1.m1845g() == false) goto L18;
    L19:
        C2521sz r26 = C2521sz.f8819a;
        String r02 = r0.baiduInputSkinLink;
        r1.m1844f();
        return;
    L18:
        if (r0.baiduInputSkinLink != null) goto L19;
        return;
    L12:
        if (r0.f5567id == null) goto L15;
    L6:
        if (r0.name == null) goto L9;
        goto L7
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.f5567id;
    }

    public final String component3() {
        return this.baiduInputSkinLink;
    }

    public final ExchangeThemeResponseData copy(String r2, String r3, String r4) {
        return new ExchangeThemeResponseData(r2, r3, r4);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ExchangeThemeResponseData) == true) goto L8;
        return false;
    L8:
        ExchangeThemeResponseData r52 = (ExchangeThemeResponseData) r5;
        if (AbstractC0585Nj.m1134a(this.name, r52.name) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f5567id, r52.f5567id) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.baiduInputSkinLink, r52.baiduInputSkinLink) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final String getBaiduInputSkinLink() {
        return this.baiduInputSkinLink;
    }

    public final String getId() {
        return this.f5567id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String r0 = this.name;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r02 = 0;
    L6:
        int r03 = r02 * 31;
        String r2 = this.f5567id;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r04 = (r03 + r22) * 31;
        String r23 = this.baiduInputSkinLink;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r04 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r02 = r0.hashCode();
        goto L6
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("ExchangeThemeResponseData(name=");
        r0.append(this.name);
        r0.append(", id=");
        r0.append(this.f5567id);
        r0.append(", baiduInputSkinLink=");
        return AbstractC2374ph.m4815l(r0, this.baiduInputSkinLink, ')');
    }

    public /* synthetic */ ExchangeThemeResponseData(int r2, String r3, String r4, String r5, AbstractC0298Gx r6) {
        if ((r2 & 1) != 0) goto L5;
        this.name = null;
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.f5567id = null;
    L11:
        if ((r2 & 4) != 0) goto L14;
        this.baiduInputSkinLink = null;
        return;
    L14:
        this.baiduInputSkinLink = r5;
        return;
    L9:
        this.f5567id = r4;
        goto L11
    L5:
        this.name = r3;
        goto L7
    }

    public ExchangeThemeResponseData(String r1, String r2, String r3) {
        this.name = r1;
        this.f5567id = r2;
        this.baiduInputSkinLink = r3;
    }

    public /* synthetic */ ExchangeThemeResponseData(String r2, String r3, String r4, int r5, AbstractC0621Oc r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}

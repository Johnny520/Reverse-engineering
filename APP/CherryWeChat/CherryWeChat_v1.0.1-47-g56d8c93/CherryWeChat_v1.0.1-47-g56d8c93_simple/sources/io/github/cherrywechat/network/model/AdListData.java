package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0148Dc;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.C0263G4;
import p000.C1302d;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class AdListData {
    private static final InterfaceC0159Dn[] $childSerializers = null;
    public static final Companion Companion = null;
    private final List<RawAdItem> items;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return AdListData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
        $childSerializers = new InterfaceC0159Dn[]{AbstractC0148Dc.m280n(2, new C1302d(2))};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdListData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(RawAdItem$$serializer.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0717Qm m3539a() {
        return _childSerializers$_anonymous_();
    }

    public static final /* synthetic */ InterfaceC0159Dn[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdListData copy$default(AdListData r0, List r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.items;
    L6:
        return r0.copy(r1);
    }

    public static final /* synthetic */ void write$Self$app_release(AdListData r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        InterfaceC0159Dn[] r32 = $childSerializers;
        if (r2.m1845g() == false) goto L6;
    L7:
        InterfaceC0717Qm r33 = (InterfaceC0717Qm) r32[0].getValue();
        List<RawAdItem> r12 = r1.items;
        r2.m1844f();
        return;
    L6:
        if (r1.items != null) goto L7;
    }

    public final List<RawAdItem> component1() {
        return this.items;
    }

    public final AdListData copy(List<RawAdItem> r2) {
        return new AdListData(r2);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof AdListData) == true) goto L9;
        return false;
    L9:
        if (AbstractC0585Nj.m1134a(this.items, ((AdListData) r4).items) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final List<RawAdItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        List<RawAdItem> r0 = this.items;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    public String toString() {
        return "AdListData(items=" + this.items + ')';
    }

    public /* synthetic */ AdListData(int r1, List r2, AbstractC0298Gx r3) {
        if ((r1 & 1) != 0) goto L6;
        this.items = null;
        return;
    L6:
        this.items = r2;
    }

    public AdListData(List<RawAdItem> r1) {
        this.items = r1;
    }

    public /* synthetic */ AdListData(List r1, int r2, AbstractC0621Oc r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}

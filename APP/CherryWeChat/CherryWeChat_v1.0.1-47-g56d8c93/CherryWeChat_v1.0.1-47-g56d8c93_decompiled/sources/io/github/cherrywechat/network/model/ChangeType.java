package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class ChangeType {
    public static final Companion Companion = new Companion(null);
    private final String icon;
    private final String label;
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ChangeType$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public ChangeType() {
        this((String) null, (String) null, (String) null, 7, (AbstractC0621Oc) null);
    }

    public static /* synthetic */ ChangeType copy$default(ChangeType changeType, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changeType.icon;
        }
        if ((i & 2) != 0) {
            str2 = changeType.name;
        }
        if ((i & 4) != 0) {
            str3 = changeType.label;
        }
        return changeType.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app_release(ChangeType changeType, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(changeType.icon, "")) {
            String str = changeType.icon;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(changeType.name, "")) {
            String str2 = changeType.name;
            interfaceC0962Wa.m1842d();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(changeType.label, "")) {
            return;
        }
        String str3 = changeType.label;
        interfaceC0962Wa.m1842d();
    }

    public final String component1() {
        return this.icon;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.label;
    }

    public final ChangeType copy(String str, String str2, String str3) {
        return new ChangeType(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeType)) {
            return false;
        }
        ChangeType changeType = (ChangeType) obj;
        return AbstractC0585Nj.m1134a(this.icon, changeType.icon) && AbstractC0585Nj.m1134a(this.name, changeType.name) && AbstractC0585Nj.m1134a(this.label, changeType.label);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.label.hashCode() + AbstractC2374ph.m4810g(this.name, this.icon.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChangeType(icon=");
        sb.append(this.icon);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", label=");
        return AbstractC2374ph.m4815l(sb, this.label, ')');
    }

    public /* synthetic */ ChangeType(int i, String str, String str2, String str3, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.icon = "";
        } else {
            this.icon = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.label = "";
        } else {
            this.label = str3;
        }
    }

    public ChangeType(String str, String str2, String str3) {
        this.icon = str;
        this.name = str2;
        this.label = str3;
    }

    public /* synthetic */ ChangeType(String str, String str2, String str3, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}

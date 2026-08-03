package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateType {
    public static final Companion Companion = new Companion(null);
    private final String color;
    private final String label;
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return UpdateType$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public UpdateType() {
        this((String) null, (String) null, (String) null, 7, (AbstractC0621Oc) null);
    }

    public static /* synthetic */ UpdateType copy$default(UpdateType updateType, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateType.name;
        }
        if ((i & 2) != 0) {
            str2 = updateType.label;
        }
        if ((i & 4) != 0) {
            str3 = updateType.color;
        }
        return updateType.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app_release(UpdateType updateType, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(updateType.name, "")) {
            String str = updateType.name;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(updateType.label, "")) {
            String str2 = updateType.label;
            interfaceC0962Wa.m1842d();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(updateType.color, "")) {
            return;
        }
        String str3 = updateType.color;
        interfaceC0962Wa.m1842d();
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.color;
    }

    public final UpdateType copy(String str, String str2, String str3) {
        return new UpdateType(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateType)) {
            return false;
        }
        UpdateType updateType = (UpdateType) obj;
        return AbstractC0585Nj.m1134a(this.name, updateType.name) && AbstractC0585Nj.m1134a(this.label, updateType.label) && AbstractC0585Nj.m1134a(this.color, updateType.color);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.color.hashCode() + AbstractC2374ph.m4810g(this.label, this.name.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UpdateType(name=");
        sb.append(this.name);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", color=");
        return AbstractC2374ph.m4815l(sb, this.color, ')');
    }

    public /* synthetic */ UpdateType(int i, String str, String str2, String str3, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.label = "";
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.color = "";
        } else {
            this.color = str3;
        }
    }

    public UpdateType(String str, String str2, String str3) {
        this.name = str;
        this.label = str2;
        this.color = str3;
    }

    public /* synthetic */ UpdateType(String str, String str2, String str3, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}

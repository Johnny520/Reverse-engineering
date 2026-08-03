package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class Feature {
    public static final Companion Companion = new Companion(null);
    private final String description;
    private final String title;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return Feature$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Feature() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (AbstractC0621Oc) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ Feature copy$default(Feature feature, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feature.title;
        }
        if ((i & 2) != 0) {
            str2 = feature.description;
        }
        return feature.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$app_release(Feature feature, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(feature.title, "")) {
            String str = feature.title;
            interfaceC0962Wa.m1842d();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(feature.description, "")) {
            return;
        }
        String str2 = feature.description;
        interfaceC0962Wa.m1842d();
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final Feature copy(String str, String str2) {
        return new Feature(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        return AbstractC0585Nj.m1134a(this.title, feature.title) && AbstractC0585Nj.m1134a(this.description, feature.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.description.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Feature(title=");
        sb.append(this.title);
        sb.append(", description=");
        return AbstractC2374ph.m4815l(sb, this.description, ')');
    }

    public /* synthetic */ Feature(int i, String str, String str2, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.description = "";
        } else {
            this.description = str2;
        }
    }

    public Feature(String str, String str2) {
        this.title = str;
        this.description = str2;
    }

    public /* synthetic */ Feature(String str, String str2, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}

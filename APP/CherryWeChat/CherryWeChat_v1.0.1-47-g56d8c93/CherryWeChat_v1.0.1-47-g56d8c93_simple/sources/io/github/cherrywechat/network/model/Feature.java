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
    public static final Companion Companion = null;
    private final String description;
    private final String title;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return Feature$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Feature() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Feature copy$default(Feature r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.title;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.description;
    L9:
        return r0.copy(r1, r2);
    }

    public static final /* synthetic */ void write$Self$app_release(Feature r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        String r32 = r1.title;
        r2.m1842d();
    L9:
        if (r2.m1845g() == false) goto L12;
    L13:
        String r12 = r1.description;
        r2.m1842d();
        return;
    L12:
        if (AbstractC0585Nj.m1134a(r1.description, "") == false) goto L13;
        return;
    L6:
        if (AbstractC0585Nj.m1134a(r1.title, "") == true) goto L9;
        goto L7
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final Feature copy(String r2, String r3) {
        return new Feature(r2, r3);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Feature) == true) goto L8;
        return false;
    L8:
        Feature r52 = (Feature) r5;
        if (AbstractC0585Nj.m1134a(this.title, r52.title) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.description, r52.description) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int r0 = this.title.hashCode() * 31;
        return this.description.hashCode() + r0;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("Feature(title=");
        r0.append(this.title);
        r0.append(", description=");
        return AbstractC2374ph.m4815l(r0, this.description, ')');
    }

    public /* synthetic */ Feature(int r2, String r3, String r4, AbstractC0298Gx r5) {
        if ((r2 & 1) != 0) goto L5;
        this.title = "";
    L7:
        if ((r2 & 2) != 0) goto L10;
        this.description = "";
        return;
    L10:
        this.description = r4;
        return;
    L5:
        this.title = r3;
        goto L7
    }

    public Feature(String r1, String r2) {
        this.title = r1;
        this.description = r2;
    }

    public /* synthetic */ Feature(String r2, String r3, int r4, AbstractC0621Oc r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}

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
    public static final Companion Companion = null;
    private final String icon;
    private final String label;
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ChangeType$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public ChangeType() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ ChangeType copy$default(ChangeType r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.icon;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.name;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.label;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public static final /* synthetic */ void write$Self$app_release(ChangeType r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        String r32 = r1.icon;
        r2.m1842d();
    L9:
        if (r2.m1845g() == false) goto L12;
    L13:
        String r33 = r1.name;
        r2.m1842d();
    L15:
        if (r2.m1845g() == false) goto L18;
    L19:
        String r12 = r1.label;
        r2.m1842d();
        return;
    L18:
        if (AbstractC0585Nj.m1134a(r1.label, "") == false) goto L19;
        return;
    L12:
        if (AbstractC0585Nj.m1134a(r1.name, "") == true) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r1.icon, "") == true) goto L9;
        goto L7
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

    public final ChangeType copy(String r2, String r3, String r4) {
        return new ChangeType(r2, r3, r4);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ChangeType) == true) goto L8;
        return false;
    L8:
        ChangeType r52 = (ChangeType) r5;
        if (AbstractC0585Nj.m1134a(this.icon, r52.icon) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.name, r52.name) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.label, r52.label) == true) goto L17;
        return false;
    L17:
        return true;
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
        int r0 = this.icon.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.name, r0, 31);
        return this.label.hashCode() + r02;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("ChangeType(icon=");
        r0.append(this.icon);
        r0.append(", name=");
        r0.append(this.name);
        r0.append(", label=");
        return AbstractC2374ph.m4815l(r0, this.label, ')');
    }

    public /* synthetic */ ChangeType(int r2, String r3, String r4, String r5, AbstractC0298Gx r6) {
        if ((r2 & 1) != 0) goto L5;
        this.icon = "";
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.name = "";
    L11:
        if ((r2 & 4) != 0) goto L14;
        this.label = "";
        return;
    L14:
        this.label = r5;
        return;
    L9:
        this.name = r4;
        goto L11
    L5:
        this.icon = r3;
        goto L7
    }

    public ChangeType(String r1, String r2, String r3) {
        this.icon = r1;
        this.name = r2;
        this.label = r3;
    }

    public /* synthetic */ ChangeType(String r2, String r3, String r4, int r5, AbstractC0621Oc r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}

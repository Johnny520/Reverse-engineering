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
public final class Developer {
    public static final Companion Companion = null;
    private final String avatar;
    private final String link;
    private final String name;
    private final String role;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return Developer$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public Developer() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ Developer copy$default(Developer r0, String r1, String r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.name;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.role;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.link;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.avatar;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public static final /* synthetic */ void write$Self$app_release(Developer r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        String r32 = r1.name;
        r2.m1842d();
    L9:
        if (r2.m1845g() == false) goto L12;
    L13:
        String r33 = r1.role;
        r2.m1842d();
    L15:
        if (r2.m1845g() == false) goto L18;
    L19:
        C2521sz r34 = C2521sz.f8819a;
        String r35 = r1.link;
        r2.m1844f();
    L21:
        if (r2.m1845g() == false) goto L24;
    L25:
        String r12 = r1.avatar;
        r2.m1842d();
        return;
    L24:
        if (AbstractC0585Nj.m1134a(r1.avatar, "") == false) goto L25;
        return;
    L18:
        if (r1.link == null) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r1.role, "") == true) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r1.name, "") == true) goto L9;
        goto L7
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.role;
    }

    public final String component3() {
        return this.link;
    }

    public final String component4() {
        return this.avatar;
    }

    public final Developer copy(String r2, String r3, String r4, String r5) {
        return new Developer(r2, r3, r4, r5);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Developer) == true) goto L8;
        return false;
    L8:
        Developer r52 = (Developer) r5;
        if (AbstractC0585Nj.m1134a(this.name, r52.name) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.role, r52.role) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.link, r52.link) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.avatar, r52.avatar) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        int r0 = this.name.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.role, r0, 31);
        String r2 = this.link;
        if (r2 != null) goto L5;
        int r22 = 0;
    L6:
        int r1 = this.avatar.hashCode();
        return r1 + ((r02 + r22) * 31);
    L5:
        r22 = r2.hashCode();
        goto L6
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("Developer(name=");
        r0.append(this.name);
        r0.append(", role=");
        r0.append(this.role);
        r0.append(", link=");
        r0.append(this.link);
        r0.append(", avatar=");
        return AbstractC2374ph.m4815l(r0, this.avatar, ')');
    }

    public /* synthetic */ Developer(int r2, String r3, String r4, String r5, String r6, AbstractC0298Gx r7) {
        if ((r2 & 1) != 0) goto L5;
        this.name = "";
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.role = "";
    L11:
        if ((r2 & 4) != 0) goto L13;
        this.link = null;
    L15:
        if ((r2 & 8) != 0) goto L18;
        this.avatar = "";
        return;
    L18:
        this.avatar = r6;
        return;
    L13:
        this.link = r5;
        goto L15
    L9:
        this.role = r4;
        goto L11
    L5:
        this.name = r3;
        goto L7
    }

    public Developer(String r1, String r2, String r3, String r4) {
        this.name = r1;
        this.role = r2;
        this.link = r3;
        this.avatar = r4;
    }

    public /* synthetic */ Developer(String r2, String r3, String r4, String r5, int r6, AbstractC0621Oc r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}

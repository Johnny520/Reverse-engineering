package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class Change {
    public static final Companion Companion = null;
    private final String description;
    private final ChangeType type;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return Change$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Change() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Change copy$default(Change r0, ChangeType r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.type;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.description;
    L9:
        return r0.copy(r1, r2);
    }

    public static final /* synthetic */ void write$Self$app_release(Change r6, InterfaceC0962Wa r7, InterfaceC0126Cx r8) {
        if (r7.m1845g() == false) goto L6;
    L7:
        ChangeType$$serializer r82 = ChangeType$$serializer.INSTANCE;
        ChangeType r83 = r6.type;
        r7.m1839a();
    L9:
        if (r7.m1845g() == false) goto L12;
    L13:
        String r62 = r6.description;
        r7.m1842d();
        return;
    L12:
        if (AbstractC0585Nj.m1134a(r6.description, "") == false) goto L13;
        return;
    L6:
        if (AbstractC0585Nj.m1134a(r6.type, new ChangeType(null, null, null, 7, null)) == true) goto L9;
        goto L7
    }

    public final ChangeType component1() {
        return this.type;
    }

    public final String component2() {
        return this.description;
    }

    public final Change copy(ChangeType r2, String r3) {
        return new Change(r2, r3);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Change) == true) goto L8;
        return false;
    L8:
        Change r52 = (Change) r5;
        if (AbstractC0585Nj.m1134a(this.type, r52.type) == true) goto L12;
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

    public final ChangeType getType() {
        return this.type;
    }

    public int hashCode() {
        int r0 = this.type.hashCode() * 31;
        return this.description.hashCode() + r0;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("Change(type=");
        r0.append(this.type);
        r0.append(", description=");
        return AbstractC2374ph.m4815l(r0, this.description, ')');
    }

    public /* synthetic */ Change(int r7, ChangeType r8, String r9, AbstractC0298Gx r10) {
        if ((r7 & 1) != 0) goto L5;
        this.type = new ChangeType(null, null, null, 7, null);
    L7:
        if ((r7 & 2) != 0) goto L10;
        this.description = "";
        return;
    L10:
        this.description = r9;
        return;
    L5:
        this.type = r8;
        goto L7
    }

    public Change(ChangeType r1, String r2) {
        this.type = r1;
        this.description = r2;
    }

    public /* synthetic */ Change(ChangeType r7, String r8, int r9, AbstractC0621Oc r10) {
        if ((r9 & 1) == 0) goto L6;
        r7 = new ChangeType(null, null, null, 7, null);
    L6:
        if ((r9 & 2) == 0) goto L8;
        r8 = "";
    L8:
        this(r7, r8);
    }
}

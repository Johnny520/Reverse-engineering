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
    public static final Companion Companion = new Companion(null);
    private final String description;
    private final ChangeType type;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return Change$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Change() {
        this((ChangeType) null, (String) (0 == true ? 1 : 0), 3, (AbstractC0621Oc) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ Change copy$default(Change change, ChangeType changeType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            changeType = change.type;
        }
        if ((i & 2) != 0) {
            str = change.description;
        }
        return change.copy(changeType, str);
    }

    public static final /* synthetic */ void write$Self$app_release(Change change, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(change.type, new ChangeType((String) null, (String) null, (String) null, 7, (AbstractC0621Oc) null))) {
            ChangeType$$serializer changeType$$serializer = ChangeType$$serializer.INSTANCE;
            ChangeType changeType = change.type;
            interfaceC0962Wa.m1839a();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(change.description, "")) {
            return;
        }
        String str = change.description;
        interfaceC0962Wa.m1842d();
    }

    public final ChangeType component1() {
        return this.type;
    }

    public final String component2() {
        return this.description;
    }

    public final Change copy(ChangeType changeType, String str) {
        return new Change(changeType, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Change)) {
            return false;
        }
        Change change = (Change) obj;
        return AbstractC0585Nj.m1134a(this.type, change.type) && AbstractC0585Nj.m1134a(this.description, change.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final ChangeType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.description.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Change(type=");
        sb.append(this.type);
        sb.append(", description=");
        return AbstractC2374ph.m4815l(sb, this.description, ')');
    }

    public /* synthetic */ Change(int i, ChangeType changeType, String str, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.type = new ChangeType((String) null, (String) null, (String) null, 7, (AbstractC0621Oc) null);
        } else {
            this.type = changeType;
        }
        if ((i & 2) == 0) {
            this.description = "";
        } else {
            this.description = str;
        }
    }

    public Change(ChangeType changeType, String str) {
        this.type = changeType;
        this.description = str;
    }

    public /* synthetic */ Change(ChangeType changeType, String str, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? new ChangeType((String) null, (String) null, (String) null, 7, (AbstractC0621Oc) null) : changeType, (i & 2) != 0 ? "" : str);
    }
}

package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0148Dc;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.C0263G4;
import p000.C0452Kf;
import p000.C1302d;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateItem {
    private final List<Change> changes;
    private final String date;

    /* JADX INFO: renamed from: id */
    private final int f5576id;
    private final UpdateType type;
    private final String version;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0159Dn[] $childSerializers = {null, null, null, null, AbstractC0148Dc.m280n(2, new C1302d(25))};

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return UpdateItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public UpdateItem() {
        this(0, (String) null, (String) null, (UpdateType) null, (List) null, 31, (AbstractC0621Oc) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(Change$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateItem copy$default(UpdateItem updateItem, int i, String str, String str2, UpdateType updateType, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = updateItem.f5576id;
        }
        if ((i2 & 2) != 0) {
            str = updateItem.version;
        }
        if ((i2 & 4) != 0) {
            str2 = updateItem.date;
        }
        if ((i2 & 8) != 0) {
            updateType = updateItem.type;
        }
        if ((i2 & 16) != 0) {
            list = updateItem.changes;
        }
        List list2 = list;
        String str3 = str2;
        return updateItem.copy(i, str, str3, updateType, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$app_release(UpdateItem updateItem, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        InterfaceC0159Dn[] interfaceC0159DnArr = $childSerializers;
        if (interfaceC0962Wa.m1845g() || updateItem.f5576id != 0) {
            int i = updateItem.f5576id;
            interfaceC0962Wa.m1843e();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(updateItem.version, "")) {
            String str = updateItem.version;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(updateItem.date, "")) {
            String str2 = updateItem.date;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g()) {
            UpdateType$$serializer updateType$$serializer = UpdateType$$serializer.INSTANCE;
            UpdateType updateType = updateItem.type;
            interfaceC0962Wa.m1839a();
        } else {
            if (!AbstractC0585Nj.m1134a(updateItem.type, new UpdateType((String) null, (String) null, (String) null, 7, (AbstractC0621Oc) null))) {
            }
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(updateItem.changes, C0452Kf.f1484a)) {
            return;
        }
        List<Change> list = updateItem.changes;
        interfaceC0962Wa.m1839a();
    }

    public final int component1() {
        return this.f5576id;
    }

    public final String component2() {
        return this.version;
    }

    public final String component3() {
        return this.date;
    }

    public final UpdateType component4() {
        return this.type;
    }

    public final List<Change> component5() {
        return this.changes;
    }

    public final UpdateItem copy(int i, String str, String str2, UpdateType updateType, List<Change> list) {
        return new UpdateItem(i, str, str2, updateType, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateItem)) {
            return false;
        }
        UpdateItem updateItem = (UpdateItem) obj;
        return this.f5576id == updateItem.f5576id && AbstractC0585Nj.m1134a(this.version, updateItem.version) && AbstractC0585Nj.m1134a(this.date, updateItem.date) && AbstractC0585Nj.m1134a(this.type, updateItem.type) && AbstractC0585Nj.m1134a(this.changes, updateItem.changes);
    }

    public final List<Change> getChanges() {
        return this.changes;
    }

    public final String getDate() {
        return this.date;
    }

    public final int getId() {
        return this.f5576id;
    }

    public final UpdateType getType() {
        return this.type;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.changes.hashCode() + ((this.type.hashCode() + AbstractC2374ph.m4810g(this.date, AbstractC2374ph.m4810g(this.version, Integer.hashCode(this.f5576id) * 31, 31), 31)) * 31);
    }

    public String toString() {
        return "UpdateItem(id=" + this.f5576id + ", version=" + this.version + ", date=" + this.date + ", type=" + this.type + ", changes=" + this.changes + ')';
    }

    public /* synthetic */ UpdateItem(int i, int i2, String str, String str2, UpdateType updateType, List list, AbstractC0298Gx abstractC0298Gx) {
        this.f5576id = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.version = "";
        } else {
            this.version = str;
        }
        if ((i & 4) == 0) {
            this.date = "";
        } else {
            this.date = str2;
        }
        if ((i & 8) == 0) {
            this.type = new UpdateType((String) null, (String) null, (String) null, 7, (AbstractC0621Oc) null);
        } else {
            this.type = updateType;
        }
        if ((i & 16) == 0) {
            this.changes = C0452Kf.f1484a;
        } else {
            this.changes = list;
        }
    }

    public UpdateItem(int i, String str, String str2, UpdateType updateType, List<Change> list) {
        this.f5576id = i;
        this.version = str;
        this.date = str2;
        this.type = updateType;
        this.changes = list;
    }

    public /* synthetic */ UpdateItem(int i, String str, String str2, UpdateType updateType, List list, int i2, AbstractC0621Oc abstractC0621Oc) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? new UpdateType((String) null, (String) null, (String) null, 7, (AbstractC0621Oc) null) : updateType, (i2 & 16) != 0 ? C0452Kf.f1484a : list);
    }
}

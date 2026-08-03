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
    private static final InterfaceC0159Dn[] $childSerializers = null;
    public static final Companion Companion = null;
    private final List<Change> changes;
    private final String date;

    /* JADX INFO: renamed from: id */
    private final int f5576id;
    private final UpdateType type;
    private final String version;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return UpdateItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
        $childSerializers = new InterfaceC0159Dn[]{null, null, null, null, AbstractC0148Dc.m280n(2, new C1302d(25))};
    }

    public UpdateItem() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        UpdateType r4 = null;
        List r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    private static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(Change$$serializer.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0717Qm m3554a() {
        return _childSerializers$_anonymous_();
    }

    public static final /* synthetic */ InterfaceC0159Dn[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateItem copy$default(UpdateItem r0, int r1, String r2, String r3, UpdateType r4, List r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.f5576id;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.version;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.date;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.type;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.changes;
    L17:
        UpdateType r62 = r4;
        List r72 = r5;
        String r52 = r3;
        int r32 = r1;
        return r0.copy(r32, r2, r52, r62, r72);
    }

    public static final /* synthetic */ void write$Self$app_release(UpdateItem r7, InterfaceC0962Wa r8, InterfaceC0126Cx r9) {
        InterfaceC0159Dn[] r92 = $childSerializers;
        if (r8.m1845g() == false) goto L6;
    L7:
        int r0 = r7.f5576id;
        r8.m1843e();
    L9:
        if (r8.m1845g() == false) goto L12;
    L13:
        String r02 = r7.version;
        r8.m1842d();
    L15:
        if (r8.m1845g() == false) goto L18;
    L19:
        String r03 = r7.date;
        r8.m1842d();
    L21:
        if (r8.m1845g() == false) goto L24;
    L25:
        UpdateType$$serializer r04 = UpdateType$$serializer.INSTANCE;
        UpdateType r05 = r7.type;
        r8.m1839a();
    L27:
        if (r8.m1845g() == false) goto L30;
    L31:
        InterfaceC0717Qm r93 = (InterfaceC0717Qm) r92[4].getValue();
        List<Change> r72 = r7.changes;
        r8.m1839a();
        return;
    L30:
        if (AbstractC0585Nj.m1134a(r7.changes, C0452Kf.f1484a) == false) goto L31;
        return;
    L24:
        if (AbstractC0585Nj.m1134a(r7.type, new UpdateType(null, null, null, 7, null)) == true) goto L27;
    L18:
        if (AbstractC0585Nj.m1134a(r7.date, "") == true) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r7.version, "") == true) goto L15;
    L6:
        if (r7.f5576id == 0) goto L9;
        goto L7
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

    public final UpdateItem copy(int r7, String r8, String r9, UpdateType r10, List<Change> r11) {
        return new UpdateItem(r7, r8, r9, r10, r11);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UpdateItem) == true) goto L8;
        return false;
    L8:
        UpdateItem r52 = (UpdateItem) r5;
        if (this.f5576id == r52.f5576id) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.version, r52.version) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.date, r52.date) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.type, r52.type) == true) goto L21;
        return false;
    L21:
        if (AbstractC0585Nj.m1134a(this.changes, r52.changes) == true) goto L23;
        return false;
    L23:
        return true;
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
        int r0 = Integer.hashCode(this.f5576id) * 31;
        int r02 = AbstractC2374ph.m4810g(this.version, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.date, r02, 31);
        int r2 = (this.type.hashCode() + r03) * 31;
        return this.changes.hashCode() + r2;
    }

    public String toString() {
        return "UpdateItem(id=" + this.f5576id + ", version=" + this.version + ", date=" + this.date + ", type=" + this.type + ", changes=" + this.changes + ')';
    }

    public /* synthetic */ UpdateItem(int r7, int r8, String r9, String r10, UpdateType r11, List r12, AbstractC0298Gx r13) {
        if ((r7 & 1) != 0) goto L5;
        r8 = 0;
    L5:
        this.f5576id = r8;
        if ((r7 & 2) != 0) goto L8;
        this.version = "";
    L10:
        if ((r7 & 4) != 0) goto L12;
        this.date = "";
    L14:
        if ((r7 & 8) != 0) goto L16;
        this.type = new UpdateType(null, null, null, 7, null);
    L18:
        if ((r7 & 16) != 0) goto L21;
        this.changes = C0452Kf.f1484a;
        return;
    L21:
        this.changes = r12;
        return;
    L16:
        this.type = r11;
        goto L18
    L12:
        this.date = r10;
        goto L14
    L8:
        this.version = r9;
        goto L10
    }

    public UpdateItem(int r1, String r2, String r3, UpdateType r4, List<Change> r5) {
        this.f5576id = r1;
        this.version = r2;
        this.date = r3;
        this.type = r4;
        this.changes = r5;
    }

    public /* synthetic */ UpdateItem(int r7, String r8, String r9, UpdateType r10, List r11, int r12, AbstractC0621Oc r13) {
        if ((r12 & 1) == 0) goto L6;
        r7 = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r8 = "";
    L9:
        if ((r12 & 4) == 0) goto L12;
        r9 = "";
    L12:
        if ((r12 & 8) == 0) goto L15;
        r10 = new UpdateType(null, null, null, 7, null);
    L15:
        if ((r12 & 16) == 0) goto L17;
        r11 = C0452Kf.f1484a;
    L17:
        UpdateType r122 = r10;
        List r132 = r11;
        String r112 = r9;
        int r92 = r7;
        this(r92, r8, r112, r122, r132);
    }
}

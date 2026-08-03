package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0148Dc;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.C0263G4;
import p000.C0452Kf;
import p000.C1302d;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class AnnouncementsWrapper {
    private static final InterfaceC0159Dn[] $childSerializers = null;
    public static final Companion Companion = null;
    private final List<AnnouncementItem> data;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return AnnouncementsWrapper$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
        $childSerializers = new InterfaceC0159Dn[]{AbstractC0148Dc.m280n(2, new C1302d(4))};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnouncementsWrapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(AnnouncementItem$$serializer.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0717Qm m3541a() {
        return _childSerializers$_anonymous_();
    }

    public static final /* synthetic */ InterfaceC0159Dn[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnnouncementsWrapper copy$default(AnnouncementsWrapper r0, List r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.data;
    L6:
        return r0.copy(r1);
    }

    public static final /* synthetic */ void write$Self$app_release(AnnouncementsWrapper r2, InterfaceC0962Wa r3, InterfaceC0126Cx r4) {
        InterfaceC0159Dn[] r42 = $childSerializers;
        if (r3.m1845g() == false) goto L6;
    L7:
        InterfaceC0717Qm r43 = (InterfaceC0717Qm) r42[0].getValue();
        List<AnnouncementItem> r22 = r2.data;
        r3.m1839a();
        return;
    L6:
        if (AbstractC0585Nj.m1134a(r2.data, C0452Kf.f1484a) == false) goto L7;
    }

    public final List<AnnouncementItem> component1() {
        return this.data;
    }

    public final AnnouncementsWrapper copy(List<AnnouncementItem> r2) {
        return new AnnouncementsWrapper(r2);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof AnnouncementsWrapper) == true) goto L9;
        return false;
    L9:
        if (AbstractC0585Nj.m1134a(this.data, ((AnnouncementsWrapper) r4).data) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final List<AnnouncementItem> getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "AnnouncementsWrapper(data=" + this.data + ')';
    }

    public /* synthetic */ AnnouncementsWrapper(int r1, List r2, AbstractC0298Gx r3) {
        if ((r1 & 1) != 0) goto L6;
        this.data = C0452Kf.f1484a;
        return;
    L6:
        this.data = r2;
    }

    public AnnouncementsWrapper(List<AnnouncementItem> r1) {
        this.data = r1;
    }

    public /* synthetic */ AnnouncementsWrapper(List r1, int r2, AbstractC0621Oc r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = C0452Kf.f1484a;
    L5:
        this(r1);
    }
}

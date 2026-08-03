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
public final class SavedMusicList {
    private static final InterfaceC0159Dn[] $childSerializers = null;
    public static final Companion Companion = null;
    private final String coverImgUrl;
    private final String description;

    /* JADX INFO: renamed from: id */
    private final String f5573id;
    private final List<SavedMusicItem> list;
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return SavedMusicList$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
        $childSerializers = new InterfaceC0159Dn[]{null, null, null, null, AbstractC0148Dc.m280n(2, new C1302d(21))};
    }

    public SavedMusicList() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        List r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    private static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(SavedMusicItem$$serializer.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0717Qm m3550a() {
        return _childSerializers$_anonymous_();
    }

    public static final /* synthetic */ InterfaceC0159Dn[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavedMusicList copy$default(SavedMusicList r0, String r1, String r2, String r3, String r4, List r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.f5573id;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.name;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.coverImgUrl;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.description;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.list;
    L17:
        String r62 = r4;
        List r72 = r5;
        String r52 = r3;
        String r32 = r1;
        return r0.copy(r32, r2, r52, r62, r72);
    }

    public static final /* synthetic */ void write$Self$app_release(SavedMusicList r2, InterfaceC0962Wa r3, InterfaceC0126Cx r4) {
        InterfaceC0159Dn[] r42 = $childSerializers;
        if (r3.m1845g() == false) goto L6;
    L7:
        String r0 = r2.f5573id;
        r3.m1842d();
    L9:
        if (r3.m1845g() == false) goto L12;
    L13:
        String r02 = r2.name;
        r3.m1842d();
    L15:
        if (r3.m1845g() == false) goto L18;
    L19:
        String r03 = r2.coverImgUrl;
        r3.m1842d();
    L21:
        if (r3.m1845g() == false) goto L24;
    L25:
        String r04 = r2.description;
        r3.m1842d();
    L27:
        if (r3.m1845g() == false) goto L30;
    L31:
        InterfaceC0717Qm r43 = (InterfaceC0717Qm) r42[4].getValue();
        List<SavedMusicItem> r22 = r2.list;
        r3.m1839a();
        return;
    L30:
        if (AbstractC0585Nj.m1134a(r2.list, C0452Kf.f1484a) == false) goto L31;
        return;
    L24:
        if (AbstractC0585Nj.m1134a(r2.description, "") == true) goto L27;
    L18:
        if (AbstractC0585Nj.m1134a(r2.coverImgUrl, "") == true) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r2.name, "") == true) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r2.f5573id, "") == true) goto L9;
        goto L7
    }

    public final String component1() {
        return this.f5573id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.coverImgUrl;
    }

    public final String component4() {
        return this.description;
    }

    public final List<SavedMusicItem> component5() {
        return this.list;
    }

    public final SavedMusicList copy(String r7, String r8, String r9, String r10, List<SavedMusicItem> r11) {
        return new SavedMusicList(r7, r8, r9, r10, r11);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SavedMusicList) == true) goto L8;
        return false;
    L8:
        SavedMusicList r52 = (SavedMusicList) r5;
        if (AbstractC0585Nj.m1134a(this.f5573id, r52.f5573id) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.name, r52.name) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.coverImgUrl, r52.coverImgUrl) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.description, r52.description) == true) goto L21;
        return false;
    L21:
        if (AbstractC0585Nj.m1134a(this.list, r52.list) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final String getCoverImgUrl() {
        return this.coverImgUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f5573id;
    }

    public final List<SavedMusicItem> getList() {
        return this.list;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int r0 = this.f5573id.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.name, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.coverImgUrl, r02, 31);
        int r04 = AbstractC2374ph.m4810g(this.description, r03, 31);
        return this.list.hashCode() + r04;
    }

    public String toString() {
        return "SavedMusicList(id=" + this.f5573id + ", name=" + this.name + ", coverImgUrl=" + this.coverImgUrl + ", description=" + this.description + ", list=" + this.list + ')';
    }

    public /* synthetic */ SavedMusicList(int r2, String r3, String r4, String r5, String r6, List r7, AbstractC0298Gx r8) {
        if ((r2 & 1) != 0) goto L5;
        this.f5573id = "";
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.name = "";
    L11:
        if ((r2 & 4) != 0) goto L13;
        this.coverImgUrl = "";
    L15:
        if ((r2 & 8) != 0) goto L17;
        this.description = "";
    L19:
        if ((r2 & 16) != 0) goto L22;
        this.list = C0452Kf.f1484a;
        return;
    L22:
        this.list = r7;
        return;
    L17:
        this.description = r6;
        goto L19
    L13:
        this.coverImgUrl = r5;
        goto L15
    L9:
        this.name = r4;
        goto L11
    L5:
        this.f5573id = r3;
        goto L7
    }

    public SavedMusicList(String r1, String r2, String r3, String r4, List<SavedMusicItem> r5) {
        this.f5573id = r1;
        this.name = r2;
        this.coverImgUrl = r3;
        this.description = r4;
        this.list = r5;
    }

    public /* synthetic */ SavedMusicList(String r2, String r3, String r4, String r5, List r6, int r7, AbstractC0621Oc r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = C0452Kf.f1484a;
    L17:
        List r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72);
    }
}

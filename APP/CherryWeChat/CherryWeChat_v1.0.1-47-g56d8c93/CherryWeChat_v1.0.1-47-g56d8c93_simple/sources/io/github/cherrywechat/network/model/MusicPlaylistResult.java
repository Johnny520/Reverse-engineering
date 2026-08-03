package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0148Dc;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.C0263G4;
import p000.C0452Kf;
import p000.C1302d;
import p000.C2521sz;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class MusicPlaylistResult {
    private static final InterfaceC0159Dn[] $childSerializers = null;
    public static final Companion Companion = null;
    private final String coverImgUrl;
    private final String description;

    /* JADX INFO: renamed from: id */
    private final long f5570id;
    private final String name;
    private final List<MusicTrack> tracks;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return MusicPlaylistResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
        $childSerializers = new InterfaceC0159Dn[]{null, null, null, null, AbstractC0148Dc.m280n(2, new C1302d(18))};
    }

    public MusicPlaylistResult() {
        long r1 = 0;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        List r6 = null;
        this(r1, r3, r4, r5, r6, 31, null);
    }

    private static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(MusicTrack$$serializer.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0717Qm m3548a() {
        return _childSerializers$_anonymous_();
    }

    public static final /* synthetic */ InterfaceC0159Dn[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MusicPlaylistResult copy$default(MusicPlaylistResult r7, long r8, String r10, String r11, String r12, List r13, int r14, Object r15) {
        if ((r14 & 1) == 0) goto L5;
        r8 = r7.f5570id;
    L5:
        long r1 = r8;
        if ((r14 & 2) == 0) goto L8;
        r10 = r7.name;
    L8:
        String r3 = r10;
        if ((r14 & 4) == 0) goto L11;
        r11 = r7.coverImgUrl;
    L11:
        String r4 = r11;
        if ((r14 & 8) == 0) goto L14;
        r12 = r7.description;
    L14:
        String r5 = r12;
        if ((r14 & 16) == 0) goto L18;
        r13 = r7.tracks;
    L18:
        return r7.copy(r1, r3, r4, r5, r13);
    }

    public static final /* synthetic */ void write$Self$app_release(MusicPlaylistResult r4, InterfaceC0962Wa r5, InterfaceC0126Cx r6) {
        InterfaceC0159Dn[] r62 = $childSerializers;
        if (r5.m1845g() == false) goto L6;
    L7:
        long r0 = r4.f5570id;
        r5.m1841c();
    L9:
        if (r5.m1845g() == false) goto L12;
    L13:
        C2521sz r02 = C2521sz.f8819a;
        String r03 = r4.name;
        r5.m1844f();
    L15:
        if (r5.m1845g() == false) goto L18;
    L19:
        C2521sz r04 = C2521sz.f8819a;
        String r05 = r4.coverImgUrl;
        r5.m1844f();
    L21:
        if (r5.m1845g() == false) goto L24;
    L25:
        C2521sz r06 = C2521sz.f8819a;
        String r07 = r4.description;
        r5.m1844f();
    L27:
        if (r5.m1845g() == false) goto L30;
    L31:
        InterfaceC0717Qm r63 = (InterfaceC0717Qm) r62[4].getValue();
        List<MusicTrack> r42 = r4.tracks;
        r5.m1839a();
        return;
    L30:
        if (AbstractC0585Nj.m1134a(r4.tracks, C0452Kf.f1484a) == false) goto L31;
        return;
    L24:
        if (r4.description == null) goto L27;
    L18:
        if (r4.coverImgUrl == null) goto L21;
    L12:
        if (r4.name == null) goto L15;
    L6:
        if (r4.f5570id == 0) goto L9;
        goto L7
    }

    public final long component1() {
        return this.f5570id;
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

    public final List<MusicTrack> component5() {
        return this.tracks;
    }

    public final MusicPlaylistResult copy(long r8, String r10, String r11, String r12, List<MusicTrack> r13) {
        return new MusicPlaylistResult(r8, r10, r11, r12, r13);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof MusicPlaylistResult) == true) goto L8;
        return false;
    L8:
        MusicPlaylistResult r82 = (MusicPlaylistResult) r8;
        if (this.f5570id == r82.f5570id) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.name, r82.name) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.coverImgUrl, r82.coverImgUrl) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.description, r82.description) == true) goto L21;
        return false;
    L21:
        if (AbstractC0585Nj.m1134a(this.tracks, r82.tracks) == true) goto L23;
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

    public final long getId() {
        return this.f5570id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<MusicTrack> getTracks() {
        return this.tracks;
    }

    public int hashCode() {
        int r0 = Long.hashCode(this.f5570id) * 31;
        String r1 = this.name;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r02 = (r0 + r12) * 31;
        String r13 = this.coverImgUrl;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r03 = (r02 + r14) * 31;
        String r15 = this.description;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return this.tracks.hashCode() + ((r03 + r2) * 31);
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "MusicPlaylistResult(id=" + this.f5570id + ", name=" + this.name + ", coverImgUrl=" + this.coverImgUrl + ", description=" + this.description + ", tracks=" + this.tracks + ')';
    }

    public /* synthetic */ MusicPlaylistResult(int r1, long r2, String r4, String r5, String r6, List r7, AbstractC0298Gx r8) {
        if ((r1 & 1) != 0) goto L5;
        r2 = 0;
    L5:
        this.f5570id = r2;
        if ((r1 & 2) != 0) goto L8;
        this.name = null;
    L10:
        if ((r1 & 4) != 0) goto L12;
        this.coverImgUrl = null;
    L14:
        if ((r1 & 8) != 0) goto L16;
        this.description = null;
    L18:
        if ((r1 & 16) != 0) goto L21;
        this.tracks = C0452Kf.f1484a;
        return;
    L21:
        this.tracks = r7;
        return;
    L16:
        this.description = r6;
        goto L18
    L12:
        this.coverImgUrl = r5;
        goto L14
    L8:
        this.name = r4;
        goto L10
    }

    public MusicPlaylistResult(long r1, String r3, String r4, String r5, List<MusicTrack> r6) {
        this.f5570id = r1;
        this.name = r3;
        this.coverImgUrl = r4;
        this.description = r5;
        this.tracks = r6;
    }

    public /* synthetic */ MusicPlaylistResult(long r8, String r10, String r11, String r12, List r13, int r14, AbstractC0621Oc r15) {
        if ((r14 & 1) == 0) goto L5;
        r8 = 0;
    L5:
        long r1 = r8;
        if ((r14 & 2) == 0) goto L8;
        String r3 = null;
    L10:
        if ((r14 & 4) == 0) goto L12;
        String r4 = null;
    L14:
        if ((r14 & 8) == 0) goto L16;
        String r5 = null;
    L18:
        if ((r14 & 16) == 0) goto L20;
        r13 = C0452Kf.f1484a;
    L20:
        this(r1, r3, r4, r5, r13);
        return;
    L16:
        r5 = r12;
        goto L18
    L12:
        r4 = r11;
        goto L14
    L8:
        r3 = r10;
        goto L10
    }
}

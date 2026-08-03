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
public final class MusicTrack {
    private static final InterfaceC0159Dn[] $childSerializers = null;
    public static final Companion Companion = null;
    private final MusicAlbum album;
    private final List<MusicArtist> artists;
    private final long duration;
    private final MusicQuality hMusic;

    /* JADX INFO: renamed from: id */
    private final long f5571id;
    private final MusicQuality lMusic;
    private final MusicQuality mMusic;
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return MusicTrack$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
        $childSerializers = new InterfaceC0159Dn[]{null, null, AbstractC0148Dc.m280n(2, new C1302d(19)), null, null, null, null, null};
    }

    public MusicTrack() {
        long r1 = 0;
        String r3 = null;
        List r4 = null;
        MusicAlbum r5 = null;
        long r6 = 0;
        MusicQuality r8 = null;
        MusicQuality r9 = null;
        MusicQuality r10 = null;
        this(r1, r3, r4, r5, r6, r8, r9, r10, 255, null);
    }

    private static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(MusicArtist$$serializer.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0717Qm m3549a() {
        return _childSerializers$_anonymous_();
    }

    public static final /* synthetic */ InterfaceC0159Dn[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MusicTrack copy$default(MusicTrack r11, long r12, String r14, List r15, MusicAlbum r16, long r17, MusicQuality r19, MusicQuality r20, MusicQuality r21, int r22, Object r23) {
        if ((r22 & 1) == 0) goto L5;
        r12 = r11.f5571id;
    L5:
        long r1 = r12;
        if ((r22 & 2) == 0) goto L8;
        r14 = r11.name;
    L8:
        String r3 = r14;
        if ((r22 & 4) == 0) goto L11;
        r15 = r11.artists;
    L11:
        List r4 = r15;
        if ((r22 & 8) == 0) goto L14;
        MusicAlbum r5 = r11.album;
    L16:
        if ((r22 & 16) == 0) goto L18;
        long r6 = r11.duration;
    L20:
        if ((r22 & 32) == 0) goto L22;
        MusicQuality r8 = r11.hMusic;
    L24:
        if ((r22 & 64) == 0) goto L26;
        MusicQuality r9 = r11.mMusic;
    L28:
        if ((r22 & 128) == 0) goto L31;
        MusicQuality r10 = r11.lMusic;
    L33:
        return r11.copy(r1, r3, r4, r5, r6, r8, r9, r10);
    L31:
        r10 = r21;
        goto L33
    L26:
        r9 = r20;
        goto L28
    L22:
        r8 = r19;
        goto L24
    L18:
        r6 = r17;
        goto L20
    L14:
        r5 = r16;
        goto L16
    }

    public static final /* synthetic */ void write$Self$app_release(MusicTrack r5, InterfaceC0962Wa r6, InterfaceC0126Cx r7) {
        InterfaceC0159Dn[] r72 = $childSerializers;
        if (r6.m1845g() == false) goto L6;
    L7:
        long r3 = r5.f5571id;
        r6.m1841c();
    L9:
        if (r6.m1845g() == false) goto L12;
    L13:
        C2521sz r0 = C2521sz.f8819a;
        String r02 = r5.name;
        r6.m1844f();
    L15:
        if (r6.m1845g() == false) goto L18;
    L19:
        InterfaceC0717Qm r73 = (InterfaceC0717Qm) r72[2].getValue();
        List<MusicArtist> r74 = r5.artists;
        r6.m1839a();
    L21:
        if (r6.m1845g() == false) goto L24;
    L25:
        MusicAlbum$$serializer r75 = MusicAlbum$$serializer.INSTANCE;
        MusicAlbum r76 = r5.album;
        r6.m1844f();
    L27:
        if (r6.m1845g() == false) goto L30;
    L31:
        long r03 = r5.duration;
        r6.m1841c();
    L33:
        if (r6.m1845g() == false) goto L36;
    L37:
        MusicQuality$$serializer r77 = MusicQuality$$serializer.INSTANCE;
        MusicQuality r78 = r5.hMusic;
        r6.m1844f();
    L39:
        if (r6.m1845g() == false) goto L42;
    L43:
        MusicQuality$$serializer r79 = MusicQuality$$serializer.INSTANCE;
        MusicQuality r710 = r5.mMusic;
        r6.m1844f();
    L45:
        if (r6.m1845g() == false) goto L48;
    L49:
        MusicQuality$$serializer r711 = MusicQuality$$serializer.INSTANCE;
        MusicQuality r52 = r5.lMusic;
        r6.m1844f();
        return;
    L48:
        if (r5.lMusic != null) goto L49;
        return;
    L42:
        if (r5.mMusic == null) goto L45;
    L36:
        if (r5.hMusic == null) goto L39;
    L30:
        if (r5.duration == 0) goto L33;
    L24:
        if (r5.album == null) goto L27;
    L18:
        if (AbstractC0585Nj.m1134a(r5.artists, C0452Kf.f1484a) == true) goto L21;
    L12:
        if (r5.name == null) goto L15;
    L6:
        if (r5.f5571id == 0) goto L9;
        goto L7
    }

    public final long component1() {
        return this.f5571id;
    }

    public final String component2() {
        return this.name;
    }

    public final List<MusicArtist> component3() {
        return this.artists;
    }

    public final MusicAlbum component4() {
        return this.album;
    }

    public final long component5() {
        return this.duration;
    }

    public final MusicQuality component6() {
        return this.hMusic;
    }

    public final MusicQuality component7() {
        return this.mMusic;
    }

    public final MusicQuality component8() {
        return this.lMusic;
    }

    public final MusicTrack copy(long r12, String r14, List<MusicArtist> r15, MusicAlbum r16, long r17, MusicQuality r19, MusicQuality r20, MusicQuality r21) {
        return new MusicTrack(r12, r14, r15, r16, r17, r19, r20, r21);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof MusicTrack) == true) goto L8;
        return false;
    L8:
        MusicTrack r82 = (MusicTrack) r8;
        if (this.f5571id == r82.f5571id) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.name, r82.name) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.artists, r82.artists) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.album, r82.album) == true) goto L21;
        return false;
    L21:
        if (this.duration == r82.duration) goto L24;
        return false;
    L24:
        if (AbstractC0585Nj.m1134a(this.hMusic, r82.hMusic) == true) goto L27;
        return false;
    L27:
        if (AbstractC0585Nj.m1134a(this.mMusic, r82.mMusic) == true) goto L30;
        return false;
    L30:
        if (AbstractC0585Nj.m1134a(this.lMusic, r82.lMusic) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final MusicAlbum getAlbum() {
        return this.album;
    }

    public final List<MusicArtist> getArtists() {
        return this.artists;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final MusicQuality getHMusic() {
        return this.hMusic;
    }

    public final long getId() {
        return this.f5571id;
    }

    public final MusicQuality getLMusic() {
        return this.lMusic;
    }

    public final MusicQuality getMMusic() {
        return this.mMusic;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int r0 = Long.hashCode(this.f5571id) * 31;
        String r1 = this.name;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r13 = (this.artists.hashCode() + ((r0 + r12) * 31)) * 31;
        MusicAlbum r02 = this.album;
        if (r02 != null) goto L9;
        int r03 = 0;
    L10:
        int r04 = (Long.hashCode(this.duration) + ((r13 + r03) * 31)) * 31;
        MusicQuality r14 = this.hMusic;
        if (r14 != null) goto L13;
        int r15 = 0;
    L14:
        int r05 = (r04 + r15) * 31;
        MusicQuality r16 = this.mMusic;
        if (r16 != null) goto L17;
        int r17 = 0;
    L18:
        int r06 = (r05 + r17) * 31;
        MusicQuality r18 = this.lMusic;
        if (r18 == null) goto L23;
        r2 = r18.hashCode();
    L23:
        return r06 + r2;
    L17:
        r17 = r16.hashCode();
        goto L18
    L13:
        r15 = r14.hashCode();
        goto L14
    L9:
        r03 = r02.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "MusicTrack(id=" + this.f5571id + ", name=" + this.name + ", artists=" + this.artists + ", album=" + this.album + ", duration=" + this.duration + ", hMusic=" + this.hMusic + ", mMusic=" + this.mMusic + ", lMusic=" + this.lMusic + ')';
    }

    public /* synthetic */ MusicTrack(int r3, long r4, String r6, List r7, MusicAlbum r8, long r9, MusicQuality r11, MusicQuality r12, MusicQuality r13, AbstractC0298Gx r14) {
        if ((r3 & 1) != 0) goto L5;
        this.f5571id = 0;
    L7:
        if ((r3 & 2) != 0) goto L9;
        this.name = null;
    L11:
        if ((r3 & 4) != 0) goto L13;
        this.artists = C0452Kf.f1484a;
    L15:
        if ((r3 & 8) != 0) goto L17;
        this.album = null;
    L19:
        if ((r3 & 16) != 0) goto L21;
        this.duration = 0;
    L23:
        if ((r3 & 32) != 0) goto L25;
        this.hMusic = null;
    L27:
        if ((r3 & 64) != 0) goto L29;
        this.mMusic = null;
    L31:
        if ((r3 & 128) != 0) goto L34;
        this.lMusic = null;
        return;
    L34:
        this.lMusic = r13;
        return;
    L29:
        this.mMusic = r12;
        goto L31
    L25:
        this.hMusic = r11;
        goto L27
    L21:
        this.duration = r9;
        goto L23
    L17:
        this.album = r8;
        goto L19
    L13:
        this.artists = r7;
        goto L15
    L9:
        this.name = r6;
        goto L11
    L5:
        this.f5571id = r4;
        goto L7
    }

    public MusicTrack(long r1, String r3, List<MusicArtist> r4, MusicAlbum r5, long r6, MusicQuality r8, MusicQuality r9, MusicQuality r10) {
        this.f5571id = r1;
        this.name = r3;
        this.artists = r4;
        this.album = r5;
        this.duration = r6;
        this.hMusic = r8;
        this.mMusic = r9;
        this.lMusic = r10;
    }

    public /* synthetic */ MusicTrack(long r4, String r6, List r7, MusicAlbum r8, long r9, MusicQuality r11, MusicQuality r12, MusicQuality r13, int r14, AbstractC0621Oc r15) {
        if ((r14 & 1) == 0) goto L6;
        r4 = 0;
    L6:
        if ((r14 & 2) == 0) goto L9;
        r6 = null;
    L9:
        if ((r14 & 4) == 0) goto L12;
        r7 = C0452Kf.f1484a;
    L12:
        if ((r14 & 8) == 0) goto L15;
        r8 = null;
    L15:
        if ((r14 & 16) == 0) goto L18;
        r9 = 0;
    L18:
        if ((r14 & 32) == 0) goto L21;
        r11 = null;
    L21:
        if ((r14 & 64) == 0) goto L24;
        r12 = null;
    L24:
        if ((r14 & 128) == 0) goto L27;
        MusicQuality r142 = null;
    L26:
        long r10 = r9;
        MusicAlbum r92 = r8;
        this(r4, r6, r7, r92, r10, r11, r12, r142);
        return;
    L27:
        r142 = r13;
        goto L26
    }
}

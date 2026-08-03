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
    private final MusicAlbum album;
    private final List<MusicArtist> artists;
    private final long duration;
    private final MusicQuality hMusic;

    /* JADX INFO: renamed from: id */
    private final long f5571id;
    private final MusicQuality lMusic;
    private final MusicQuality mMusic;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0159Dn[] $childSerializers = {null, null, AbstractC0148Dc.m280n(2, new C1302d(19)), null, null, null, null, null};

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return MusicTrack$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public MusicTrack() {
        this(0L, (String) null, (List) null, (MusicAlbum) null, 0L, (MusicQuality) null, (MusicQuality) null, (MusicQuality) null, 255, (AbstractC0621Oc) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(MusicArtist$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MusicTrack copy$default(MusicTrack musicTrack, long j, String str, List list, MusicAlbum musicAlbum, long j2, MusicQuality musicQuality, MusicQuality musicQuality2, MusicQuality musicQuality3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = musicTrack.f5571id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = musicTrack.name;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            list = musicTrack.artists;
        }
        return musicTrack.copy(j3, str2, list, (i & 8) != 0 ? musicTrack.album : musicAlbum, (i & 16) != 0 ? musicTrack.duration : j2, (i & 32) != 0 ? musicTrack.hMusic : musicQuality, (i & 64) != 0 ? musicTrack.mMusic : musicQuality2, (i & 128) != 0 ? musicTrack.lMusic : musicQuality3);
    }

    public static final /* synthetic */ void write$Self$app_release(MusicTrack musicTrack, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        InterfaceC0159Dn[] interfaceC0159DnArr = $childSerializers;
        if (interfaceC0962Wa.m1845g() || musicTrack.f5571id != 0) {
            long j = musicTrack.f5571id;
            interfaceC0962Wa.m1841c();
        }
        if (interfaceC0962Wa.m1845g() || musicTrack.name != null) {
            C2521sz c2521sz = C2521sz.f8819a;
            String str = musicTrack.name;
            interfaceC0962Wa.m1844f();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(musicTrack.artists, C0452Kf.f1484a)) {
            List<MusicArtist> list = musicTrack.artists;
            interfaceC0962Wa.m1839a();
        }
        if (interfaceC0962Wa.m1845g() || musicTrack.album != null) {
            MusicAlbum$$serializer musicAlbum$$serializer = MusicAlbum$$serializer.INSTANCE;
            MusicAlbum musicAlbum = musicTrack.album;
            interfaceC0962Wa.m1844f();
        }
        if (interfaceC0962Wa.m1845g() || musicTrack.duration != 0) {
            long j2 = musicTrack.duration;
            interfaceC0962Wa.m1841c();
        }
        if (interfaceC0962Wa.m1845g() || musicTrack.hMusic != null) {
            MusicQuality$$serializer musicQuality$$serializer = MusicQuality$$serializer.INSTANCE;
            MusicQuality musicQuality = musicTrack.hMusic;
            interfaceC0962Wa.m1844f();
        }
        if (interfaceC0962Wa.m1845g() || musicTrack.mMusic != null) {
            MusicQuality$$serializer musicQuality$$serializer2 = MusicQuality$$serializer.INSTANCE;
            MusicQuality musicQuality2 = musicTrack.mMusic;
            interfaceC0962Wa.m1844f();
        }
        if (!interfaceC0962Wa.m1845g() && musicTrack.lMusic == null) {
            return;
        }
        MusicQuality$$serializer musicQuality$$serializer3 = MusicQuality$$serializer.INSTANCE;
        MusicQuality musicQuality3 = musicTrack.lMusic;
        interfaceC0962Wa.m1844f();
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

    public final MusicTrack copy(long j, String str, List<MusicArtist> list, MusicAlbum musicAlbum, long j2, MusicQuality musicQuality, MusicQuality musicQuality2, MusicQuality musicQuality3) {
        return new MusicTrack(j, str, list, musicAlbum, j2, musicQuality, musicQuality2, musicQuality3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicTrack)) {
            return false;
        }
        MusicTrack musicTrack = (MusicTrack) obj;
        return this.f5571id == musicTrack.f5571id && AbstractC0585Nj.m1134a(this.name, musicTrack.name) && AbstractC0585Nj.m1134a(this.artists, musicTrack.artists) && AbstractC0585Nj.m1134a(this.album, musicTrack.album) && this.duration == musicTrack.duration && AbstractC0585Nj.m1134a(this.hMusic, musicTrack.hMusic) && AbstractC0585Nj.m1134a(this.mMusic, musicTrack.mMusic) && AbstractC0585Nj.m1134a(this.lMusic, musicTrack.lMusic);
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
        int iHashCode = Long.hashCode(this.f5571id) * 31;
        String str = this.name;
        int iHashCode2 = (this.artists.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        MusicAlbum musicAlbum = this.album;
        int iHashCode3 = (Long.hashCode(this.duration) + ((iHashCode2 + (musicAlbum == null ? 0 : musicAlbum.hashCode())) * 31)) * 31;
        MusicQuality musicQuality = this.hMusic;
        int iHashCode4 = (iHashCode3 + (musicQuality == null ? 0 : musicQuality.hashCode())) * 31;
        MusicQuality musicQuality2 = this.mMusic;
        int iHashCode5 = (iHashCode4 + (musicQuality2 == null ? 0 : musicQuality2.hashCode())) * 31;
        MusicQuality musicQuality3 = this.lMusic;
        return iHashCode5 + (musicQuality3 != null ? musicQuality3.hashCode() : 0);
    }

    public String toString() {
        return "MusicTrack(id=" + this.f5571id + ", name=" + this.name + ", artists=" + this.artists + ", album=" + this.album + ", duration=" + this.duration + ", hMusic=" + this.hMusic + ", mMusic=" + this.mMusic + ", lMusic=" + this.lMusic + ')';
    }

    public /* synthetic */ MusicTrack(int i, long j, String str, List list, MusicAlbum musicAlbum, long j2, MusicQuality musicQuality, MusicQuality musicQuality2, MusicQuality musicQuality3, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.f5571id = 0L;
        } else {
            this.f5571id = j;
        }
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 4) == 0) {
            this.artists = C0452Kf.f1484a;
        } else {
            this.artists = list;
        }
        if ((i & 8) == 0) {
            this.album = null;
        } else {
            this.album = musicAlbum;
        }
        if ((i & 16) == 0) {
            this.duration = 0L;
        } else {
            this.duration = j2;
        }
        if ((i & 32) == 0) {
            this.hMusic = null;
        } else {
            this.hMusic = musicQuality;
        }
        if ((i & 64) == 0) {
            this.mMusic = null;
        } else {
            this.mMusic = musicQuality2;
        }
        if ((i & 128) == 0) {
            this.lMusic = null;
        } else {
            this.lMusic = musicQuality3;
        }
    }

    public MusicTrack(long j, String str, List<MusicArtist> list, MusicAlbum musicAlbum, long j2, MusicQuality musicQuality, MusicQuality musicQuality2, MusicQuality musicQuality3) {
        this.f5571id = j;
        this.name = str;
        this.artists = list;
        this.album = musicAlbum;
        this.duration = j2;
        this.hMusic = musicQuality;
        this.mMusic = musicQuality2;
        this.lMusic = musicQuality3;
    }

    public /* synthetic */ MusicTrack(long j, String str, List list, MusicAlbum musicAlbum, long j2, MusicQuality musicQuality, MusicQuality musicQuality2, MusicQuality musicQuality3, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? C0452Kf.f1484a : list, (i & 8) != 0 ? null : musicAlbum, (i & 16) != 0 ? 0L : j2, (i & 32) != 0 ? null : musicQuality, (i & 64) != 0 ? null : musicQuality2, (i & 128) != 0 ? null : musicQuality3);
    }
}

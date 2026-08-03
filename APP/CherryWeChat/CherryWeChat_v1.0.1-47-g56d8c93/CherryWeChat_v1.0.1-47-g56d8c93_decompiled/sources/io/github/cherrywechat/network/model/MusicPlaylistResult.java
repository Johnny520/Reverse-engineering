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
    private final String coverImgUrl;
    private final String description;

    /* JADX INFO: renamed from: id */
    private final long f5570id;
    private final String name;
    private final List<MusicTrack> tracks;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0159Dn[] $childSerializers = {null, null, null, null, AbstractC0148Dc.m280n(2, new C1302d(18))};

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return MusicPlaylistResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public MusicPlaylistResult() {
        this(0L, (String) null, (String) null, (String) null, (List) null, 31, (AbstractC0621Oc) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(MusicTrack$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MusicPlaylistResult copy$default(MusicPlaylistResult musicPlaylistResult, long j, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = musicPlaylistResult.f5570id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = musicPlaylistResult.name;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = musicPlaylistResult.coverImgUrl;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = musicPlaylistResult.description;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            list = musicPlaylistResult.tracks;
        }
        return musicPlaylistResult.copy(j2, str4, str5, str6, list);
    }

    public static final /* synthetic */ void write$Self$app_release(MusicPlaylistResult musicPlaylistResult, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        InterfaceC0159Dn[] interfaceC0159DnArr = $childSerializers;
        if (interfaceC0962Wa.m1845g() || musicPlaylistResult.f5570id != 0) {
            long j = musicPlaylistResult.f5570id;
            interfaceC0962Wa.m1841c();
        }
        if (interfaceC0962Wa.m1845g() || musicPlaylistResult.name != null) {
            C2521sz c2521sz = C2521sz.f8819a;
            String str = musicPlaylistResult.name;
            interfaceC0962Wa.m1844f();
        }
        if (interfaceC0962Wa.m1845g() || musicPlaylistResult.coverImgUrl != null) {
            C2521sz c2521sz2 = C2521sz.f8819a;
            String str2 = musicPlaylistResult.coverImgUrl;
            interfaceC0962Wa.m1844f();
        }
        if (interfaceC0962Wa.m1845g() || musicPlaylistResult.description != null) {
            C2521sz c2521sz3 = C2521sz.f8819a;
            String str3 = musicPlaylistResult.description;
            interfaceC0962Wa.m1844f();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(musicPlaylistResult.tracks, C0452Kf.f1484a)) {
            return;
        }
        List<MusicTrack> list = musicPlaylistResult.tracks;
        interfaceC0962Wa.m1839a();
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

    public final MusicPlaylistResult copy(long j, String str, String str2, String str3, List<MusicTrack> list) {
        return new MusicPlaylistResult(j, str, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicPlaylistResult)) {
            return false;
        }
        MusicPlaylistResult musicPlaylistResult = (MusicPlaylistResult) obj;
        return this.f5570id == musicPlaylistResult.f5570id && AbstractC0585Nj.m1134a(this.name, musicPlaylistResult.name) && AbstractC0585Nj.m1134a(this.coverImgUrl, musicPlaylistResult.coverImgUrl) && AbstractC0585Nj.m1134a(this.description, musicPlaylistResult.description) && AbstractC0585Nj.m1134a(this.tracks, musicPlaylistResult.tracks);
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
        int iHashCode = Long.hashCode(this.f5570id) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coverImgUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        return this.tracks.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "MusicPlaylistResult(id=" + this.f5570id + ", name=" + this.name + ", coverImgUrl=" + this.coverImgUrl + ", description=" + this.description + ", tracks=" + this.tracks + ')';
    }

    public /* synthetic */ MusicPlaylistResult(int i, long j, String str, String str2, String str3, List list, AbstractC0298Gx abstractC0298Gx) {
        this.f5570id = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 4) == 0) {
            this.coverImgUrl = null;
        } else {
            this.coverImgUrl = str2;
        }
        if ((i & 8) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i & 16) == 0) {
            this.tracks = C0452Kf.f1484a;
        } else {
            this.tracks = list;
        }
    }

    public MusicPlaylistResult(long j, String str, String str2, String str3, List<MusicTrack> list) {
        this.f5570id = j;
        this.name = str;
        this.coverImgUrl = str2;
        this.description = str3;
        this.tracks = list;
    }

    public /* synthetic */ MusicPlaylistResult(long j, String str, String str2, String str3, List list, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? C0452Kf.f1484a : list);
    }
}

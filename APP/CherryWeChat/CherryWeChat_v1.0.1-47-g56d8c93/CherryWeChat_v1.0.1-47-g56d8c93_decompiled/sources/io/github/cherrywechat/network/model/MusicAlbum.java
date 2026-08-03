package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.C2521sz;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class MusicAlbum {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: id */
    private final long f5569id;
    private final String name;
    private final String picUrl;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return MusicAlbum$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public MusicAlbum() {
        this(0L, (String) null, (String) null, 7, (AbstractC0621Oc) null);
    }

    public static /* synthetic */ MusicAlbum copy$default(MusicAlbum musicAlbum, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = musicAlbum.f5569id;
        }
        if ((i & 2) != 0) {
            str = musicAlbum.name;
        }
        if ((i & 4) != 0) {
            str2 = musicAlbum.picUrl;
        }
        return musicAlbum.copy(j, str, str2);
    }

    public static final /* synthetic */ void write$Self$app_release(MusicAlbum musicAlbum, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || musicAlbum.f5569id != 0) {
            long j = musicAlbum.f5569id;
            interfaceC0962Wa.m1841c();
        }
        if (interfaceC0962Wa.m1845g() || musicAlbum.name != null) {
            C2521sz c2521sz = C2521sz.f8819a;
            String str = musicAlbum.name;
            interfaceC0962Wa.m1844f();
        }
        if (!interfaceC0962Wa.m1845g() && musicAlbum.picUrl == null) {
            return;
        }
        C2521sz c2521sz2 = C2521sz.f8819a;
        String str2 = musicAlbum.picUrl;
        interfaceC0962Wa.m1844f();
    }

    public final long component1() {
        return this.f5569id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.picUrl;
    }

    public final MusicAlbum copy(long j, String str, String str2) {
        return new MusicAlbum(j, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicAlbum)) {
            return false;
        }
        MusicAlbum musicAlbum = (MusicAlbum) obj;
        return this.f5569id == musicAlbum.f5569id && AbstractC0585Nj.m1134a(this.name, musicAlbum.name) && AbstractC0585Nj.m1134a(this.picUrl, musicAlbum.picUrl);
    }

    public final long getId() {
        return this.f5569id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPicUrl() {
        return this.picUrl;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f5569id) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.picUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MusicAlbum(id=");
        sb.append(this.f5569id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", picUrl=");
        return AbstractC2374ph.m4815l(sb, this.picUrl, ')');
    }

    public /* synthetic */ MusicAlbum(int i, long j, String str, String str2, AbstractC0298Gx abstractC0298Gx) {
        this.f5569id = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 4) == 0) {
            this.picUrl = null;
        } else {
            this.picUrl = str2;
        }
    }

    public MusicAlbum(long j, String str, String str2) {
        this.f5569id = j;
        this.name = str;
        this.picUrl = str2;
    }

    public /* synthetic */ MusicAlbum(long j, String str, String str2, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}

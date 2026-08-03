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
public final class MusicLrc {
    public static final Companion Companion = new Companion(null);
    private final String lyric;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return MusicLrc$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicLrc() {
        this((String) null, 1, (AbstractC0621Oc) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ MusicLrc copy$default(MusicLrc musicLrc, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicLrc.lyric;
        }
        return musicLrc.copy(str);
    }

    public static final /* synthetic */ void write$Self$app_release(MusicLrc musicLrc, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (!interfaceC0962Wa.m1845g() && musicLrc.lyric == null) {
            return;
        }
        C2521sz c2521sz = C2521sz.f8819a;
        String str = musicLrc.lyric;
        interfaceC0962Wa.m1844f();
    }

    public final String component1() {
        return this.lyric;
    }

    public final MusicLrc copy(String str) {
        return new MusicLrc(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MusicLrc) && AbstractC0585Nj.m1134a(this.lyric, ((MusicLrc) obj).lyric);
    }

    public final String getLyric() {
        return this.lyric;
    }

    public int hashCode() {
        String str = this.lyric;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return AbstractC2374ph.m4815l(new StringBuilder("MusicLrc(lyric="), this.lyric, ')');
    }

    public /* synthetic */ MusicLrc(int i, String str, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.lyric = null;
        } else {
            this.lyric = str;
        }
    }

    public MusicLrc(String str) {
        this.lyric = str;
    }

    public /* synthetic */ MusicLrc(String str, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? null : str);
    }
}

package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class MusicLyricResponse {
    public static final Companion Companion = new Companion(null);
    private final int code;
    private final MusicLrc lrc;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return MusicLyricResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicLyricResponse() {
        this(0, (MusicLrc) null, 3, (AbstractC0621Oc) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ MusicLyricResponse copy$default(MusicLyricResponse musicLyricResponse, int i, MusicLrc musicLrc, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = musicLyricResponse.code;
        }
        if ((i2 & 2) != 0) {
            musicLrc = musicLyricResponse.lrc;
        }
        return musicLyricResponse.copy(i, musicLrc);
    }

    public static final /* synthetic */ void write$Self$app_release(MusicLyricResponse musicLyricResponse, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || musicLyricResponse.code != -1) {
            int i = musicLyricResponse.code;
            interfaceC0962Wa.m1843e();
        }
        if (!interfaceC0962Wa.m1845g() && musicLyricResponse.lrc == null) {
            return;
        }
        MusicLrc$$serializer musicLrc$$serializer = MusicLrc$$serializer.INSTANCE;
        MusicLrc musicLrc = musicLyricResponse.lrc;
        interfaceC0962Wa.m1844f();
    }

    public final int component1() {
        return this.code;
    }

    public final MusicLrc component2() {
        return this.lrc;
    }

    public final MusicLyricResponse copy(int i, MusicLrc musicLrc) {
        return new MusicLyricResponse(i, musicLrc);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicLyricResponse)) {
            return false;
        }
        MusicLyricResponse musicLyricResponse = (MusicLyricResponse) obj;
        return this.code == musicLyricResponse.code && AbstractC0585Nj.m1134a(this.lrc, musicLyricResponse.lrc);
    }

    public final int getCode() {
        return this.code;
    }

    public final MusicLrc getLrc() {
        return this.lrc;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        MusicLrc musicLrc = this.lrc;
        return iHashCode + (musicLrc == null ? 0 : musicLrc.hashCode());
    }

    public String toString() {
        return "MusicLyricResponse(code=" + this.code + ", lrc=" + this.lrc + ')';
    }

    public /* synthetic */ MusicLyricResponse(int i, int i2, MusicLrc musicLrc, AbstractC0298Gx abstractC0298Gx) {
        this.code = (i & 1) == 0 ? -1 : i2;
        if ((i & 2) == 0) {
            this.lrc = null;
        } else {
            this.lrc = musicLrc;
        }
    }

    public MusicLyricResponse(int i, MusicLrc musicLrc) {
        this.code = i;
        this.lrc = musicLrc;
    }

    public /* synthetic */ MusicLyricResponse(int i, MusicLrc musicLrc, int i2, AbstractC0621Oc abstractC0621Oc) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : musicLrc);
    }
}

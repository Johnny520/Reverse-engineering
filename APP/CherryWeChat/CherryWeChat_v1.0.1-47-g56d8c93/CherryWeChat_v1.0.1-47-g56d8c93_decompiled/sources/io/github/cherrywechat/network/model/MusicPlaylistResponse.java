package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class MusicPlaylistResponse {
    public static final Companion Companion = new Companion(null);
    private final int code;
    private final MusicPlaylistResult result;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return MusicPlaylistResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicPlaylistResponse() {
        this(0, (MusicPlaylistResult) null, 3, (AbstractC0621Oc) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ MusicPlaylistResponse copy$default(MusicPlaylistResponse musicPlaylistResponse, int i, MusicPlaylistResult musicPlaylistResult, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = musicPlaylistResponse.code;
        }
        if ((i2 & 2) != 0) {
            musicPlaylistResult = musicPlaylistResponse.result;
        }
        return musicPlaylistResponse.copy(i, musicPlaylistResult);
    }

    public static final /* synthetic */ void write$Self$app_release(MusicPlaylistResponse musicPlaylistResponse, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || musicPlaylistResponse.code != -1) {
            int i = musicPlaylistResponse.code;
            interfaceC0962Wa.m1843e();
        }
        if (!interfaceC0962Wa.m1845g() && musicPlaylistResponse.result == null) {
            return;
        }
        MusicPlaylistResult$$serializer musicPlaylistResult$$serializer = MusicPlaylistResult$$serializer.INSTANCE;
        MusicPlaylistResult musicPlaylistResult = musicPlaylistResponse.result;
        interfaceC0962Wa.m1844f();
    }

    public final int component1() {
        return this.code;
    }

    public final MusicPlaylistResult component2() {
        return this.result;
    }

    public final MusicPlaylistResponse copy(int i, MusicPlaylistResult musicPlaylistResult) {
        return new MusicPlaylistResponse(i, musicPlaylistResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicPlaylistResponse)) {
            return false;
        }
        MusicPlaylistResponse musicPlaylistResponse = (MusicPlaylistResponse) obj;
        return this.code == musicPlaylistResponse.code && AbstractC0585Nj.m1134a(this.result, musicPlaylistResponse.result);
    }

    public final int getCode() {
        return this.code;
    }

    public final MusicPlaylistResult getResult() {
        return this.result;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        MusicPlaylistResult musicPlaylistResult = this.result;
        return iHashCode + (musicPlaylistResult == null ? 0 : musicPlaylistResult.hashCode());
    }

    public String toString() {
        return "MusicPlaylistResponse(code=" + this.code + ", result=" + this.result + ')';
    }

    public /* synthetic */ MusicPlaylistResponse(int i, int i2, MusicPlaylistResult musicPlaylistResult, AbstractC0298Gx abstractC0298Gx) {
        this.code = (i & 1) == 0 ? -1 : i2;
        if ((i & 2) == 0) {
            this.result = null;
        } else {
            this.result = musicPlaylistResult;
        }
    }

    public MusicPlaylistResponse(int i, MusicPlaylistResult musicPlaylistResult) {
        this.code = i;
        this.result = musicPlaylistResult;
    }

    public /* synthetic */ MusicPlaylistResponse(int i, MusicPlaylistResult musicPlaylistResult, int i2, AbstractC0621Oc abstractC0621Oc) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : musicPlaylistResult);
    }
}

package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class MusicPlaylistResponse {
    public static final Companion Companion = null;
    private final int code;
    private final MusicPlaylistResult result;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return MusicPlaylistResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicPlaylistResponse() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MusicPlaylistResponse copy$default(MusicPlaylistResponse r0, int r1, MusicPlaylistResult r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.code;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.result;
    L9:
        return r0.copy(r1, r2);
    }

    public static final /* synthetic */ void write$Self$app_release(MusicPlaylistResponse r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        int r32 = r1.code;
        r2.m1843e();
    L9:
        if (r2.m1845g() == false) goto L12;
    L13:
        MusicPlaylistResult$$serializer r33 = MusicPlaylistResult$$serializer.INSTANCE;
        MusicPlaylistResult r12 = r1.result;
        r2.m1844f();
        return;
    L12:
        if (r1.result != null) goto L13;
        return;
    L6:
        if (r1.code == (-1)) goto L9;
        goto L7
    }

    public final int component1() {
        return this.code;
    }

    public final MusicPlaylistResult component2() {
        return this.result;
    }

    public final MusicPlaylistResponse copy(int r2, MusicPlaylistResult r3) {
        return new MusicPlaylistResponse(r2, r3);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MusicPlaylistResponse) == true) goto L8;
        return false;
    L8:
        MusicPlaylistResponse r52 = (MusicPlaylistResponse) r5;
        if (this.code == r52.code) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.result, r52.result) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getCode() {
        return this.code;
    }

    public final MusicPlaylistResult getResult() {
        return this.result;
    }

    public int hashCode() {
        int r0 = Integer.hashCode(this.code) * 31;
        MusicPlaylistResult r1 = this.result;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r0 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "MusicPlaylistResponse(code=" + this.code + ", result=" + this.result + ')';
    }

    public /* synthetic */ MusicPlaylistResponse(int r1, int r2, MusicPlaylistResult r3, AbstractC0298Gx r4) {
        if ((r1 & 1) != 0) goto L5;
        r2 = -1;
    L5:
        this.code = r2;
        if ((r1 & 2) != 0) goto L9;
        this.result = null;
        return;
    L9:
        this.result = r3;
    }

    public MusicPlaylistResponse(int r1, MusicPlaylistResult r2) {
        this.code = r1;
        this.result = r2;
    }

    public /* synthetic */ MusicPlaylistResponse(int r1, MusicPlaylistResult r2, int r3, AbstractC0621Oc r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = -1;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = null;
    L8:
        this(r1, r2);
    }
}

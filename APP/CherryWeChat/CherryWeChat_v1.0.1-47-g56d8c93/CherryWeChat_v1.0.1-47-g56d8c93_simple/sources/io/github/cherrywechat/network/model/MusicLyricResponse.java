package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class MusicLyricResponse {
    public static final Companion Companion = null;
    private final int code;
    private final MusicLrc lrc;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return MusicLyricResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicLyricResponse() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MusicLyricResponse copy$default(MusicLyricResponse r0, int r1, MusicLrc r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.code;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.lrc;
    L9:
        return r0.copy(r1, r2);
    }

    public static final /* synthetic */ void write$Self$app_release(MusicLyricResponse r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        int r32 = r1.code;
        r2.m1843e();
    L9:
        if (r2.m1845g() == false) goto L12;
    L13:
        MusicLrc$$serializer r33 = MusicLrc$$serializer.INSTANCE;
        MusicLrc r12 = r1.lrc;
        r2.m1844f();
        return;
    L12:
        if (r1.lrc != null) goto L13;
        return;
    L6:
        if (r1.code == (-1)) goto L9;
        goto L7
    }

    public final int component1() {
        return this.code;
    }

    public final MusicLrc component2() {
        return this.lrc;
    }

    public final MusicLyricResponse copy(int r2, MusicLrc r3) {
        return new MusicLyricResponse(r2, r3);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MusicLyricResponse) == true) goto L8;
        return false;
    L8:
        MusicLyricResponse r52 = (MusicLyricResponse) r5;
        if (this.code == r52.code) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.lrc, r52.lrc) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getCode() {
        return this.code;
    }

    public final MusicLrc getLrc() {
        return this.lrc;
    }

    public int hashCode() {
        int r0 = Integer.hashCode(this.code) * 31;
        MusicLrc r1 = this.lrc;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r0 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "MusicLyricResponse(code=" + this.code + ", lrc=" + this.lrc + ')';
    }

    public /* synthetic */ MusicLyricResponse(int r1, int r2, MusicLrc r3, AbstractC0298Gx r4) {
        if ((r1 & 1) != 0) goto L5;
        r2 = -1;
    L5:
        this.code = r2;
        if ((r1 & 2) != 0) goto L9;
        this.lrc = null;
        return;
    L9:
        this.lrc = r3;
    }

    public MusicLyricResponse(int r1, MusicLrc r2) {
        this.code = r1;
        this.lrc = r2;
    }

    public /* synthetic */ MusicLyricResponse(int r1, MusicLrc r2, int r3, AbstractC0621Oc r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = -1;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = null;
    L8:
        this(r1, r2);
    }
}

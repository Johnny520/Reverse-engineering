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
    public static final Companion Companion = null;
    private final String lyric;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return MusicLrc$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicLrc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MusicLrc copy$default(MusicLrc r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.lyric;
    L6:
        return r0.copy(r1);
    }

    public static final /* synthetic */ void write$Self$app_release(MusicLrc r0, InterfaceC0962Wa r1, InterfaceC0126Cx r2) {
        if (r1.m1845g() == false) goto L6;
    L7:
        C2521sz r22 = C2521sz.f8819a;
        String r02 = r0.lyric;
        r1.m1844f();
        return;
    L6:
        if (r0.lyric != null) goto L7;
    }

    public final String component1() {
        return this.lyric;
    }

    public final MusicLrc copy(String r2) {
        return new MusicLrc(r2);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof MusicLrc) == true) goto L9;
        return false;
    L9:
        if (AbstractC0585Nj.m1134a(this.lyric, ((MusicLrc) r4).lyric) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final String getLyric() {
        return this.lyric;
    }

    public int hashCode() {
        String r0 = this.lyric;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    public String toString() {
        return AbstractC2374ph.m4815l(new StringBuilder("MusicLrc(lyric="), this.lyric, ')');
    }

    public /* synthetic */ MusicLrc(int r1, String r2, AbstractC0298Gx r3) {
        if ((r1 & 1) != 0) goto L6;
        this.lyric = null;
        return;
    L6:
        this.lyric = r2;
    }

    public MusicLrc(String r1) {
        this.lyric = r1;
    }

    public /* synthetic */ MusicLrc(String r1, int r2, AbstractC0621Oc r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}

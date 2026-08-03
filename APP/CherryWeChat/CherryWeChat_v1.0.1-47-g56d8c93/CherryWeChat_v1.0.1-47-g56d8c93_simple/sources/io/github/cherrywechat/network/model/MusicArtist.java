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
public final class MusicArtist {
    public static final Companion Companion = null;
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return MusicArtist$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicArtist() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MusicArtist copy$default(MusicArtist r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.name;
    L6:
        return r0.copy(r1);
    }

    public static final /* synthetic */ void write$Self$app_release(MusicArtist r0, InterfaceC0962Wa r1, InterfaceC0126Cx r2) {
        if (r1.m1845g() == false) goto L6;
    L7:
        C2521sz r22 = C2521sz.f8819a;
        String r02 = r0.name;
        r1.m1844f();
        return;
    L6:
        if (r0.name != null) goto L7;
    }

    public final String component1() {
        return this.name;
    }

    public final MusicArtist copy(String r2) {
        return new MusicArtist(r2);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof MusicArtist) == true) goto L9;
        return false;
    L9:
        if (AbstractC0585Nj.m1134a(this.name, ((MusicArtist) r4).name) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String r0 = this.name;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    public String toString() {
        return AbstractC2374ph.m4815l(new StringBuilder("MusicArtist(name="), this.name, ')');
    }

    public /* synthetic */ MusicArtist(int r1, String r2, AbstractC0298Gx r3) {
        if ((r1 & 1) != 0) goto L6;
        this.name = null;
        return;
    L6:
        this.name = r2;
    }

    public MusicArtist(String r1) {
        this.name = r1;
    }

    public /* synthetic */ MusicArtist(String r1, int r2, AbstractC0621Oc r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}

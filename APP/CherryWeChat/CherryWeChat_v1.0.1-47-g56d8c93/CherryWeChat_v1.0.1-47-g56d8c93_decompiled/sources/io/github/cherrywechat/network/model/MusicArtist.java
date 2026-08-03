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
    public static final Companion Companion = new Companion(null);
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return MusicArtist$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicArtist() {
        this((String) null, 1, (AbstractC0621Oc) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ MusicArtist copy$default(MusicArtist musicArtist, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicArtist.name;
        }
        return musicArtist.copy(str);
    }

    public static final /* synthetic */ void write$Self$app_release(MusicArtist musicArtist, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (!interfaceC0962Wa.m1845g() && musicArtist.name == null) {
            return;
        }
        C2521sz c2521sz = C2521sz.f8819a;
        String str = musicArtist.name;
        interfaceC0962Wa.m1844f();
    }

    public final String component1() {
        return this.name;
    }

    public final MusicArtist copy(String str) {
        return new MusicArtist(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MusicArtist) && AbstractC0585Nj.m1134a(this.name, ((MusicArtist) obj).name);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return AbstractC2374ph.m4815l(new StringBuilder("MusicArtist(name="), this.name, ')');
    }

    public /* synthetic */ MusicArtist(int i, String str, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
    }

    public MusicArtist(String str) {
        this.name = str;
    }

    public /* synthetic */ MusicArtist(String str, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? null : str);
    }
}

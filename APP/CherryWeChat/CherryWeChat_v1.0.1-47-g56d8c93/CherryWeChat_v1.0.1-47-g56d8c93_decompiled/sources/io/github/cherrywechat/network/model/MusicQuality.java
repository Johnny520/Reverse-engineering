package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0621Oc;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class MusicQuality {
    public static final Companion Companion = new Companion(null);
    private final long size;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return MusicQuality$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public MusicQuality() {
        this(0L, 1, (AbstractC0621Oc) null);
    }

    public static /* synthetic */ MusicQuality copy$default(MusicQuality musicQuality, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = musicQuality.size;
        }
        return musicQuality.copy(j);
    }

    public static final /* synthetic */ void write$Self$app_release(MusicQuality musicQuality, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (!interfaceC0962Wa.m1845g() && musicQuality.size == 0) {
            return;
        }
        long j = musicQuality.size;
        interfaceC0962Wa.m1841c();
    }

    public final long component1() {
        return this.size;
    }

    public final MusicQuality copy(long j) {
        return new MusicQuality(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MusicQuality) && this.size == ((MusicQuality) obj).size;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        return Long.hashCode(this.size);
    }

    public String toString() {
        return "MusicQuality(size=" + this.size + ')';
    }

    public /* synthetic */ MusicQuality(int i, long j, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.size = 0L;
        } else {
            this.size = j;
        }
    }

    public MusicQuality(long j) {
        this.size = j;
    }

    public /* synthetic */ MusicQuality(long j, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? 0L : j);
    }
}

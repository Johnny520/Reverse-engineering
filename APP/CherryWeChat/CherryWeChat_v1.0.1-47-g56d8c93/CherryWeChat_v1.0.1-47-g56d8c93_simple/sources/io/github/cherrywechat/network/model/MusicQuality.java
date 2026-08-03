package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0621Oc;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class MusicQuality {
    public static final Companion Companion = null;
    private final long size;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return MusicQuality$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public MusicQuality() {
        long r2 = 0;
        this(r2, 1, null);
    }

    public static /* synthetic */ MusicQuality copy$default(MusicQuality r0, long r1, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.size;
    L6:
        return r0.copy(r1);
    }

    public static final /* synthetic */ void write$Self$app_release(MusicQuality r4, InterfaceC0962Wa r5, InterfaceC0126Cx r6) {
        if (r5.m1845g() == false) goto L6;
    L7:
        long r0 = r4.size;
        r5.m1841c();
        return;
    L6:
        if (r4.size != 0) goto L7;
    }

    public final long component1() {
        return this.size;
    }

    public final MusicQuality copy(long r2) {
        return new MusicQuality(r2);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof MusicQuality) == true) goto L9;
        return false;
    L9:
        if (this.size == ((MusicQuality) r8).size) goto L11;
        return false;
    L11:
        return true;
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

    public /* synthetic */ MusicQuality(int r1, long r2, AbstractC0298Gx r4) {
        if ((r1 & 1) != 0) goto L6;
        this.size = 0;
        return;
    L6:
        this.size = r2;
    }

    public MusicQuality(long r1) {
        this.size = r1;
    }

    public /* synthetic */ MusicQuality(long r1, int r3, AbstractC0621Oc r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }
}

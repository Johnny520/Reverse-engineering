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
public final class MusicAlbum {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: id */
    private final long f5569id;
    private final String name;
    private final String picUrl;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return MusicAlbum$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public MusicAlbum() {
        long r1 = 0;
        String r3 = null;
        String r4 = null;
        this(r1, r3, r4, 7, null);
    }

    public static /* synthetic */ MusicAlbum copy$default(MusicAlbum r0, long r1, String r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.f5569id;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = r0.name;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r4 = r0.picUrl;
    L12:
        return r0.copy(r1, r3, r4);
    }

    public static final /* synthetic */ void write$Self$app_release(MusicAlbum r4, InterfaceC0962Wa r5, InterfaceC0126Cx r6) {
        if (r5.m1845g() == false) goto L6;
    L7:
        long r0 = r4.f5569id;
        r5.m1841c();
    L9:
        if (r5.m1845g() == false) goto L12;
    L13:
        C2521sz r62 = C2521sz.f8819a;
        String r63 = r4.name;
        r5.m1844f();
    L15:
        if (r5.m1845g() == false) goto L18;
    L19:
        C2521sz r64 = C2521sz.f8819a;
        String r42 = r4.picUrl;
        r5.m1844f();
        return;
    L18:
        if (r4.picUrl != null) goto L19;
        return;
    L12:
        if (r4.name == null) goto L15;
    L6:
        if (r4.f5569id == 0) goto L9;
        goto L7
    }

    public final long component1() {
        return this.f5569id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.picUrl;
    }

    public final MusicAlbum copy(long r2, String r4, String r5) {
        return new MusicAlbum(r2, r4, r5);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof MusicAlbum) == true) goto L8;
        return false;
    L8:
        MusicAlbum r82 = (MusicAlbum) r8;
        if (this.f5569id == r82.f5569id) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.name, r82.name) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.picUrl, r82.picUrl) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final long getId() {
        return this.f5569id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPicUrl() {
        return this.picUrl;
    }

    public int hashCode() {
        int r0 = Long.hashCode(this.f5569id) * 31;
        String r1 = this.name;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r02 = (r0 + r12) * 31;
        String r13 = this.picUrl;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r02 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("MusicAlbum(id=");
        r0.append(this.f5569id);
        r0.append(", name=");
        r0.append(this.name);
        r0.append(", picUrl=");
        return AbstractC2374ph.m4815l(r0, this.picUrl, ')');
    }

    public /* synthetic */ MusicAlbum(int r1, long r2, String r4, String r5, AbstractC0298Gx r6) {
        if ((r1 & 1) != 0) goto L5;
        r2 = 0;
    L5:
        this.f5569id = r2;
        if ((r1 & 2) != 0) goto L8;
        this.name = null;
    L10:
        if ((r1 & 4) != 0) goto L13;
        this.picUrl = null;
        return;
    L13:
        this.picUrl = r5;
        return;
    L8:
        this.name = r4;
        goto L10
    }

    public MusicAlbum(long r1, String r3, String r4) {
        this.f5569id = r1;
        this.name = r3;
        this.picUrl = r4;
    }

    public /* synthetic */ MusicAlbum(long r2, String r4, String r5, int r6, AbstractC0621Oc r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r4 = null;
    L9:
        if ((r6 & 4) == 0) goto L11;
        r5 = null;
    L11:
        this(r2, r4, r5);
    }
}

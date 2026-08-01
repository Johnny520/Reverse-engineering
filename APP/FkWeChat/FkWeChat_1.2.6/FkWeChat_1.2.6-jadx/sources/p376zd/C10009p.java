package p376zd;

import java.util.ArrayList;
import java.util.Map;
import okio.C5799e;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5109u0;

/* JADX INFO: renamed from: zd.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10009p {

    /* JADX INFO: renamed from: a */
    public final boolean f33606a;

    /* JADX INFO: renamed from: b */
    public final boolean f33607b;

    /* JADX INFO: renamed from: c */
    public final C5799e f33608c;

    /* JADX INFO: renamed from: d */
    public final Long f33609d;

    /* JADX INFO: renamed from: e */
    public final Long f33610e;

    /* JADX INFO: renamed from: f */
    public final Long f33611f;

    /* JADX INFO: renamed from: g */
    public final Long f33612g;

    /* JADX INFO: renamed from: h */
    public final Map f33613h;

    public /* synthetic */ C10009p(boolean z10, boolean z11, C5799e c5799e, Long l10, Long l11, Long l12, Long l13, Map map, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : c5799e, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) != 0 ? null : l13, (i10 & 128) != 0 ? AbstractC5109u0.m20768i() : map);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C10009p m38815b(C10009p c10009p, boolean z10, boolean z11, C5799e c5799e, Long l10, Long l11, Long l12, Long l13, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c10009p.f33606a;
        }
        if ((i10 & 2) != 0) {
            z11 = c10009p.f33607b;
        }
        if ((i10 & 4) != 0) {
            c5799e = c10009p.f33608c;
        }
        if ((i10 & 8) != 0) {
            l10 = c10009p.f33609d;
        }
        if ((i10 & 16) != 0) {
            l11 = c10009p.f33610e;
        }
        if ((i10 & 32) != 0) {
            l12 = c10009p.f33611f;
        }
        if ((i10 & 64) != 0) {
            l13 = c10009p.f33612g;
        }
        if ((i10 & 128) != 0) {
            map = c10009p.f33613h;
        }
        Long l14 = l13;
        Map map2 = map;
        Long l15 = l11;
        Long l16 = l12;
        return c10009p.m38816a(z10, z11, c5799e, l10, l15, l16, l14, map2);
    }

    /* JADX INFO: renamed from: a */
    public final C10009p m38816a(boolean z10, boolean z11, C5799e c5799e, Long l10, Long l11, Long l12, Long l13, Map map) {
        map.getClass();
        return new C10009p(z10, z11, c5799e, l10, l11, l12, l13, map);
    }

    /* JADX INFO: renamed from: c */
    public final Long m38817c() {
        return this.f33609d;
    }

    /* JADX INFO: renamed from: d */
    public final C5799e m38818d() {
        return this.f33608c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m38819e() {
        return this.f33607b;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f33606a) {
            arrayList.add("isRegularFile");
        }
        if (this.f33607b) {
            arrayList.add("isDirectory");
        }
        if (this.f33609d != null) {
            arrayList.add("byteCount=" + this.f33609d.longValue());
        }
        if (this.f33610e != null) {
            arrayList.add("createdAt=" + this.f33610e.longValue());
        }
        if (this.f33611f != null) {
            arrayList.add("lastModifiedAt=" + this.f33611f.longValue());
        }
        if (this.f33612g != null) {
            arrayList.add("lastAccessedAt=" + this.f33612g.longValue());
        }
        if (!this.f33613h.isEmpty()) {
            arrayList.add("extras=" + this.f33613h);
        }
        return AbstractC5081g0.m20585s0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public C10009p(boolean z10, boolean z11, C5799e c5799e, Long l10, Long l11, Long l12, Long l13, Map map) {
        map.getClass();
        this.f33606a = z10;
        this.f33607b = z11;
        this.f33608c = c5799e;
        this.f33609d = l10;
        this.f33610e = l11;
        this.f33611f = l12;
        this.f33612g = l13;
        this.f33613h = AbstractC5109u0.m20780u(map);
    }
}

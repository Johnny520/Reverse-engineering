package p303v;

import androidx.compose.foundation.lazy.layout.AbstractC0403n0;
import androidx.compose.foundation.lazy.layout.InterfaceC0355b0;
import androidx.compose.foundation.lazy.layout.InterfaceC0383i0;
import java.util.List;
import p024b9.AbstractC1043k;
import p117i.AbstractC3071m;
import p121i3.AbstractC3174d;
import p121i3.C3173c;
import p215oc.C5725t;

/* JADX INFO: renamed from: v.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8696g0 extends AbstractC0403n0 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC8711o f28889b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0383i0 f28890c;

    /* JADX INFO: renamed from: d */
    public final long f28891d;

    public AbstractC8696g0(long j10, boolean z10, InterfaceC8711o interfaceC8711o, InterfaceC0383i0 interfaceC0383i0) {
        this.f28889b = interfaceC8711o;
        this.f28890c = interfaceC0383i0;
        this.f28891d = AbstractC3174d.m11985b(0, z10 ? C3173c.m11973l(j10) : Integer.MAX_VALUE, 0, z10 ? Integer.MAX_VALUE : C3173c.m11972k(j10), 5, null);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C8694f0 m33417f(AbstractC8696g0 abstractC8696g0, int i10, long j10, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
            return null;
        }
        if ((i11 & 2) != 0) {
            j10 = abstractC8696g0.f28891d;
        }
        return abstractC8696g0.m33420e(i10, j10);
    }

    /* JADX INFO: renamed from: c */
    public abstract C8694f0 mo33418c(int i10, Object obj, Object obj2, List list, long j10);

    @Override // androidx.compose.foundation.lazy.layout.AbstractC0403n0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C8694f0 mo1291a(int i10, int i11, int i12, long j10) {
        return m33420e(i10, j10);
    }

    /* JADX INFO: renamed from: e */
    public final C8694f0 m33420e(int i10, long j10) {
        return mo33418c(i10, this.f28889b.mo1452b(i10), this.f28889b.mo1454f(i10), m1292b(this.f28890c, i10, j10), j10);
    }

    /* JADX INFO: renamed from: g */
    public final long m33421g() {
        return this.f28891d;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC3071m m33422h() {
        return this.f28889b.mo33453d();
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC0355b0 m33423i() {
        return this.f28889b.mo33452c();
    }

    public /* synthetic */ AbstractC8696g0(long j10, boolean z10, InterfaceC8711o interfaceC8711o, InterfaceC0383i0 interfaceC0383i0, AbstractC1043k abstractC1043k) {
        this(j10, z10, interfaceC8711o, interfaceC0383i0);
    }
}

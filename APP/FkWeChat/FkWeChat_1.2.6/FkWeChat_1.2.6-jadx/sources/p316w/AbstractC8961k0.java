package p316w;

import androidx.compose.foundation.lazy.layout.AbstractC0403n0;
import androidx.compose.foundation.lazy.layout.InterfaceC0355b0;
import androidx.compose.foundation.lazy.layout.InterfaceC0383i0;
import java.util.List;
import p117i.AbstractC3071m;
import p121i3.C3173c;
import p263s.AbstractC6635e;

/* JADX INFO: renamed from: w.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8961k0 extends AbstractC0403n0 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC8966n f29723b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0383i0 f29724c;

    /* JADX INFO: renamed from: d */
    public final int f29725d;

    public AbstractC8961k0(InterfaceC8966n interfaceC8966n, InterfaceC0383i0 interfaceC0383i0, int i10) {
        this.f29723b = interfaceC8966n;
        this.f29724c = interfaceC0383i0;
        this.f29725d = i10;
    }

    /* JADX INFO: renamed from: c */
    public abstract C8959j0 mo34303c(int i10, Object obj, Object obj2, int i11, int i12, List list, long j10, int i13, int i14);

    @Override // androidx.compose.foundation.lazy.layout.AbstractC0403n0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C8959j0 mo1291a(int i10, int i11, int i12, long j10) {
        return m34412e(i10, j10, i11, i12, this.f29725d);
    }

    /* JADX INFO: renamed from: e */
    public final C8959j0 m34412e(int i10, long j10, int i11, int i12, int i13) {
        int iM11974m;
        Object objMo1452b = this.f29723b.mo1452b(i10);
        Object objMo1454f = this.f29723b.mo1454f(i10);
        List listM1292b = m1292b(this.f29724c, i10, j10);
        if (C3173c.m11971j(j10)) {
            iM11974m = C3173c.m11975n(j10);
        } else {
            if (!C3173c.m11970i(j10)) {
                AbstractC6635e.m26318a("does not have fixed height");
            }
            iM11974m = C3173c.m11974m(j10);
        }
        return mo34303c(i10, objMo1452b, objMo1454f, iM11974m, i13, listM1292b, j10, i11, i12);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC3071m m34413f() {
        return this.f29723b.mo34431d();
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0355b0 m34414g() {
        return this.f29723b.mo34430c();
    }
}

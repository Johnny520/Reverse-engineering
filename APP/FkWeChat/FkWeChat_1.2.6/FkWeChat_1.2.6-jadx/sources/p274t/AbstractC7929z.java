package p274t;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p024b9.AbstractC1061t;
import p121i3.AbstractC3174d;
import p121i3.C3173c;
import p135j2.InterfaceC3555o0;
import p165l1.InterfaceC4499e;
import p274t.C7823e;

/* JADX INFO: renamed from: t.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7929z {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3555o0 f26425a = new C7806b0(C7823e.f26045a.m30278j(), InterfaceC4499e.f13028a.m17422k());

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3555o0 m30623a(C7823e.m mVar, InterfaceC4499e.b bVar, InterfaceC0572r interfaceC0572r, int i10) {
        InterfaceC3555o0 interfaceC3555o0;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(1089876336, i10, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:108)");
        }
        if (AbstractC1061t.m3842c(mVar, C7823e.f26045a.m30278j()) && AbstractC1061t.m3842c(bVar, InterfaceC4499e.f13028a.m17422k())) {
            interfaceC0572r.mo2163V(-1446569784);
            interfaceC0572r.mo2152K();
            interfaceC3555o0 = f26425a;
        } else {
            interfaceC0572r.mo2163V(-1446515937);
            boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC0572r.mo2162U(mVar)) || (i10 & 6) == 4) | ((((i10 & Opcodes.IREM) ^ 48) > 32 && interfaceC0572r.mo2162U(bVar)) || (i10 & 48) == 32);
            Object objMo2170f = interfaceC0572r.mo2170f();
            if (z10 || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f = new C7806b0(mVar, bVar);
                interfaceC0572r.mo2153L(objMo2170f);
            }
            interfaceC3555o0 = (C7806b0) objMo2170f;
            interfaceC0572r.mo2152K();
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC3555o0;
    }

    /* JADX INFO: renamed from: b */
    public static final long m30624b(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 ? AbstractC3174d.m11984a(i11, i13, i10, i12) : C3173c.f8451b.m11979a(i11, i13, i10, i12);
    }
}

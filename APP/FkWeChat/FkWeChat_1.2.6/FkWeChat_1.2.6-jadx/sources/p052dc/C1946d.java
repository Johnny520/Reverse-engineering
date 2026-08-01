package p052dc;

import p185m8.C5072d;
import p185m8.C5075e;
import p185m8.C5085i0;

/* JADX INFO: renamed from: dc.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1946d {

    /* JADX INFO: renamed from: a */
    public static final C1946d f5422a = new C1946d();

    /* JADX INFO: renamed from: a */
    public static final void m7053a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            C5085i0.m20599a("index: ", i10, ", size: ", i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m7054b(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            C5085i0.m20599a("index: ", i10, ", size: ", i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m7055c(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            C5075e.m20517a("fromIndex: ", i10, ", toIndex: ", i11, i12);
        } else {
            if (i10 <= i11) {
                return;
            }
            C5072d.m20505a("fromIndex: ", i10, " > toIndex: ", i11);
        }
    }
}

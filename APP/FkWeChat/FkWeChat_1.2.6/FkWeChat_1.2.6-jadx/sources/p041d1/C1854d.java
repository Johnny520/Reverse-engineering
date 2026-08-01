package p041d1;

import p185m8.C5072d;
import p185m8.C5075e;
import p185m8.C5085i0;

/* JADX INFO: renamed from: d1.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1854d {

    /* JADX INFO: renamed from: a */
    public static final C1854d f4897a = new C1854d();

    /* JADX INFO: renamed from: a */
    public static final void m6552a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            C5085i0.m20599a("index: ", i10, ", size: ", i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m6553b(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            C5085i0.m20599a("index: ", i10, ", size: ", i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m6554c(int i10, int i11, int i12) {
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

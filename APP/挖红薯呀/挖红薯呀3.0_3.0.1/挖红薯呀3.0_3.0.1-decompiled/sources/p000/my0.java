package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class my0 implements en0 {

    /* JADX INFO: renamed from: d */
    public final int f4076d;

    /* JADX INFO: renamed from: e */
    public final List f4077e;

    /* JADX INFO: renamed from: f */
    public Float f4078f = null;

    /* JADX INFO: renamed from: g */
    public Float f4079g = null;

    /* JADX INFO: renamed from: h */
    public hy0 f4080h = null;

    /* JADX INFO: renamed from: i */
    public hy0 f4081i = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public my0(int i, ArrayList arrayList) {
        this.f4076d = i;
        this.f4077e = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.en0
    /* JADX INFO: renamed from: q */
    public final boolean mo310q() {
        return this.f4077e.contains(this);
    }
}

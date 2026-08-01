package p150k1;

import java.util.List;

/* JADX INFO: renamed from: k1.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3907a {

    /* JADX INFO: renamed from: a */
    public final List f11369a;

    public C3907a(List list) {
        this.f11369a = list;
    }

    /* JADX INFO: renamed from: a */
    public final List m15561a() {
        return this.f11369a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15562b() {
        List list = this.f11369a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C3911d) list.get(i10)).m15583e() != null) {
                return true;
            }
        }
        return false;
    }
}

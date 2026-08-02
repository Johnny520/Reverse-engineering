package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g91 implements fc2, cc2 {

    /* JADX INFO: renamed from: h */
    public final gc2 f3365h;

    /* JADX INFO: renamed from: i */
    public final dc2 f3366i;

    /* JADX INFO: renamed from: j */
    public final sk1 f3367j;

    public g91(fc2 fc2Var, Map map, dc2 dc2Var) {
        C0792v c0792v = new C0792v(15, fc2Var);
        tu2 tu2Var = hc2.f3953a;
        this.f3365h = new gc2(map, c0792v);
        this.f3366i = dc2Var;
        sk1 sk1Var = fd2.f2911a;
        this.f3367j = new sk1();
    }

    @Override // p000.fc2
    /* JADX INFO: renamed from: a */
    public final ec2 mo975a(String str, xm0 xm0Var) {
        return this.f3365h.mo975a(str, xm0Var);
    }

    @Override // p000.fc2
    /* JADX INFO: renamed from: b */
    public final boolean mo976b(Object obj) {
        return this.f3365h.mo976b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // p000.fc2
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map mo977c() {
        sk1 sk1Var = this.f3367j;
        Object[] objArr = sk1Var.f10175b;
        long[] jArr = sk1Var.f10174a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            dc2 dc2Var = this.f3366i;
                            if (dc2Var.f1986i.m4509k(obj) == null) {
                                dc2Var.f1985h.remove(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.f3365h.mo977c();
    }

    @Override // p000.fc2
    /* JADX INFO: renamed from: d */
    public final Object mo978d(String str) {
        return this.f3365h.mo978d(str);
    }

    @Override // p000.cc2
    /* JADX INFO: renamed from: e */
    public final void mo742e(Object obj, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-858296452);
        if ((i & 6) == 0) {
            i2 = (go0Var.m1984h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(c0402kw) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(this) ? 256 : 128;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            this.f3366i.mo742e(obj, c0402kw, go0Var, i2 & 126);
            boolean zM1984h = go0Var.m1984h(this) | go0Var.m1984h(obj);
            Object objM1956L = go0Var.m1956L();
            if (zM1984h || objM1956L == C0520nx.f7360a) {
                objM1956L = new C0115d2(19, this, obj);
                go0Var.m1981f0(objM1956L);
            }
            AbstractC0179eu.m1450c(obj, (in0) objM1956L, go0Var);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0803va(this, obj, c0402kw, i, 9);
        }
    }
}

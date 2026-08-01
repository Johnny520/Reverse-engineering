package p213o2;

import java.io.IOException;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: o2.k */
/* JADX INFO: loaded from: classes.dex */
public class C2782k extends AbstractC2770B {
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) {
        if (c3390a.m5630J() != 9) {
            return Long.valueOf(c3390a.m5623C());
        }
        c3390a.m5626F();
        return null;
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c3391b.m5666n();
        } else {
            c3391b.m5655E(number.toString());
        }
    }
}

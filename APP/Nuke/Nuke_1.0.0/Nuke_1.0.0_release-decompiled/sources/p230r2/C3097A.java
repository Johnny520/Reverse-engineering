package p230r2;

import java.io.IOException;
import p213o2.AbstractC2770B;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.A */
/* JADX INFO: loaded from: classes.dex */
public class C3097A extends AbstractC2770B {
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) {
        if (c3390a.m5630J() != 9) {
            return Float.valueOf((float) c3390a.m5651x());
        }
        c3390a.m5626F();
        return null;
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        Number numberValueOf = (Number) obj;
        if (numberValueOf == null) {
            c3391b.m5666n();
            return;
        }
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(numberValueOf.floatValue());
        }
        c3391b.m5654D(numberValueOf);
    }
}

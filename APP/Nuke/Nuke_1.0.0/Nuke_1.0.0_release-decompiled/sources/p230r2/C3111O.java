package p230r2;

import java.io.IOException;
import java.util.Currency;
import p213o2.AbstractC2770B;
import p213o2.C2789r;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.O */
/* JADX INFO: loaded from: classes.dex */
public class C3111O extends AbstractC2770B {
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) throws IOException {
        String strM5628H = c3390a.m5628H();
        try {
            return Currency.getInstance(strM5628H);
        } catch (IllegalArgumentException e5) {
            throw new C2789r("Failed parsing '" + strM5628H + "' as Currency; at path " + c3390a.m5646m(true), e5);
        }
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        c3391b.m5655E(((Currency) obj).getCurrencyCode());
    }
}

package p213o2;

import java.io.IOException;
import me.dartcv.nuke.BuildConfig;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: o2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2781j extends AbstractC2770B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8787a;

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) throws IOException {
        switch (this.f8787a) {
            case 0:
                if (c3390a.m5630J() != 9) {
                    return Double.valueOf(c3390a.m5651x());
                }
                c3390a.m5626F();
                return null;
            case BuildConfig.VERSION_CODE /* 1 */:
                if (c3390a.m5630J() != 9) {
                    return Float.valueOf((float) c3390a.m5651x());
                }
                c3390a.m5626F();
                return null;
            default:
                c3390a.m5636P();
                return null;
        }
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        switch (this.f8787a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    C2785n.m4972a(dDoubleValue);
                    c3391b.m5652A(dDoubleValue);
                } else {
                    c3391b.m5666n();
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    C2785n.m4972a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    c3391b.m5654D(numberValueOf);
                } else {
                    c3391b.m5666n();
                }
                break;
            default:
                c3391b.m5666n();
                break;
        }
    }

    public String toString() {
        switch (this.f8787a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}

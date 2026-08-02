package p000;

import java.util.List;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: y0 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0906y0 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13249h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f13250i;

    public C0906y0(int i, List list) {
        this.f13249h = i;
        switch (i) {
            case 2:
                C0923yh c0923yh = C0923yh.f13455o;
                this.f13250i = list;
                break;
            case 4:
                C0462mi c0462mi = C0462mi.f6654o;
                this.f13250i = list;
                break;
            case 8:
                rc3 rc3Var = rc3.f9513o;
                this.f13250i = list;
                break;
            default:
                C0830w0 c0830w0 = C0830w0.f12238o;
                this.f13250i = list;
                break;
        }
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f13249h;
        List list = this.f13250i;
        switch (i) {
            case 0:
                return C0830w0.f12238o.get(list.get(((Number) obj).intValue()));
            case 1:
                list.get(((Number) obj).intValue());
                return null;
            case 2:
                return C0923yh.f13455o.get(list.get(((Number) obj).intValue()));
            case 3:
                list.get(((Number) obj).intValue());
                return null;
            case 4:
                return C0462mi.f6654o.get(list.get(((Number) obj).intValue()));
            case 5:
                list.get(((Number) obj).intValue());
                return null;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                list.get(((Number) obj).intValue());
                return null;
            case 7:
                list.get(((Number) obj).intValue());
                return null;
            case 8:
                return rc3.f9513o.get(list.get(((Number) obj).intValue()));
            default:
                list.get(((Number) obj).intValue());
                return null;
        }
    }

    public /* synthetic */ C0906y0(List list, int i, boolean z) {
        this.f13249h = i;
        this.f13250i = list;
    }
}

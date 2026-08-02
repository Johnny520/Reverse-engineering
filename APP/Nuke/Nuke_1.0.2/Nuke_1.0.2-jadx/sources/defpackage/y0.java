package defpackage;

import java.util.List;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ List i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y0(int i, List list) {
        this.h = i;
        switch (i) {
            case 2:
                yh yhVar = yh.o;
                this.i = list;
                break;
            case 4:
                mi miVar = mi.o;
                this.i = list;
                break;
            case 8:
                rc3 rc3Var = rc3.o;
                this.i = list;
                break;
            default:
                w0 w0Var = w0.o;
                this.i = list;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        List list = this.i;
        switch (i) {
            case 0:
                return w0.o.get(list.get(((Number) obj).intValue()));
            case 1:
                list.get(((Number) obj).intValue());
                return null;
            case 2:
                return yh.o.get(list.get(((Number) obj).intValue()));
            case 3:
                list.get(((Number) obj).intValue());
                return null;
            case 4:
                return mi.o.get(list.get(((Number) obj).intValue()));
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
                return rc3.o.get(list.get(((Number) obj).intValue()));
            default:
                list.get(((Number) obj).intValue());
                return null;
        }
    }

    public /* synthetic */ y0(List list, int i, boolean z) {
        this.h = i;
        this.i = list;
    }
}

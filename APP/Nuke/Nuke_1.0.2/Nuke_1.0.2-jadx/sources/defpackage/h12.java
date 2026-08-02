package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h12 {
    public final List a;
    public final er2 b;
    public final int c;
    public final int d;
    public final int e;
    public int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h12(List list, er2 er2Var) {
        MotionEvent motionEventA;
        this.a = list;
        this.b = er2Var;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        this.c = (i < 29 || (motionEventA = a()) == null) ? 0 : motionEventA.getClassification();
        MotionEvent motionEventA2 = a();
        this.d = motionEventA2 != null ? motionEventA2.getButtonState() : 0;
        MotionEvent motionEventA3 = a();
        this.e = motionEventA3 != null ? motionEventA3.getMetaState() : 0;
        MotionEvent motionEventA4 = a();
        if (motionEventA4 != null) {
            boolean z = i >= 29 && motionEventA4.getClassification() == 3;
            boolean z2 = i >= 29 && motionEventA4.getClassification() == 5;
            int actionMasked = motionEventA4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                if (!z) {
                                    i2 = !z2 ? 1 : 8;
                                }
                                i2 = 10;
                                break;
                            case AIChatConfig.DefaultContextRounds /* 6 */:
                                if (!z) {
                                    if (!z2) {
                                        i2 = 2;
                                        break;
                                    }
                                }
                                i2 = 12;
                                break;
                            case 7:
                                if (z) {
                                    i2 = 11;
                                    break;
                                } else if (!z2) {
                                    i2 = 3;
                                    break;
                                }
                                break;
                            case 8:
                                i2 = 6;
                                break;
                            case 9:
                                i2 = 4;
                                break;
                            case 10:
                                i2 = 5;
                                break;
                        }
                    }
                } else if (z) {
                    i2 = 12;
                } else if (z2) {
                    i2 = 9;
                }
            } else if (z) {
                i2 = 10;
            } else if (z2) {
                i2 = 7;
            }
        } else {
            int size = list.size();
            while (i2 < size) {
                o12 o12Var = (o12) list.get(i2);
                if (tp0.q(o12Var)) {
                    i2 = 2;
                } else if (!tp0.o(o12Var)) {
                    i2++;
                }
            }
            i2 = 3;
        }
        this.f = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MotionEvent a() {
        er2 er2Var = this.b;
        if (er2Var != null) {
            return (MotionEvent) ((dq1) er2Var.k).j;
        }
        return null;
    }
}

package p000;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h12 {

    /* JADX INFO: renamed from: a */
    public final List f3776a;

    /* JADX INFO: renamed from: b */
    public final er2 f3777b;

    /* JADX INFO: renamed from: c */
    public final int f3778c;

    /* JADX INFO: renamed from: d */
    public final int f3779d;

    /* JADX INFO: renamed from: e */
    public final int f3780e;

    /* JADX INFO: renamed from: f */
    public int f3781f;

    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h12(List list, er2 er2Var) {
        MotionEvent motionEventM2043a;
        this.f3776a = list;
        this.f3777b = er2Var;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        this.f3778c = (i < 29 || (motionEventM2043a = m2043a()) == null) ? 0 : motionEventM2043a.getClassification();
        MotionEvent motionEventM2043a2 = m2043a();
        this.f3779d = motionEventM2043a2 != null ? motionEventM2043a2.getButtonState() : 0;
        MotionEvent motionEventM2043a3 = m2043a();
        this.f3780e = motionEventM2043a3 != null ? motionEventM2043a3.getMetaState() : 0;
        MotionEvent motionEventM2043a4 = m2043a();
        if (motionEventM2043a4 != null) {
            boolean z = i >= 29 && motionEventM2043a4.getClassification() == 3;
            boolean z2 = i >= 29 && motionEventM2043a4.getClassification() == 5;
            int actionMasked = motionEventM2043a4.getActionMasked();
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
                if (tp0.m5369q(o12Var)) {
                    i2 = 2;
                } else if (!tp0.m5367o(o12Var)) {
                    i2++;
                }
            }
            i2 = 3;
        }
        this.f3781f = i2;
    }

    /* JADX INFO: renamed from: a */
    public final MotionEvent m2043a() {
        er2 er2Var = this.f3777b;
        if (er2Var != null) {
            return (MotionEvent) ((dq1) er2Var.f2578k).f2148j;
        }
        return null;
    }
}

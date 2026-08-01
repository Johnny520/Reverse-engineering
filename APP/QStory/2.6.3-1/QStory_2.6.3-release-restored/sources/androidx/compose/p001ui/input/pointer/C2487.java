package androidx.compose.p001ui.input.pointer;

import android.os.Build;
import android.view.MotionEvent;
import androidx.appcompat.app.C0923;
import java.util.List;
import p248.C8894;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2487 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f5192;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f5193;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f5194;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f5195;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8894 f5196;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f5197;

    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2487(List list, C8894 c8894) {
        MotionEvent motionEventM3606;
        this.f5197 = list;
        this.f5196 = c8894;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        this.f5195 = (i < 29 || (motionEventM3606 = m3606()) == null) ? 0 : motionEventM3606.getClassification();
        MotionEvent motionEventM36062 = m3606();
        this.f5194 = motionEventM36062 != null ? motionEventM36062.getButtonState() : 0;
        MotionEvent motionEventM36063 = m3606();
        this.f5193 = motionEventM36063 != null ? motionEventM36063.getMetaState() : 0;
        MotionEvent motionEventM36064 = m3606();
        if (motionEventM36064 != null) {
            boolean z = i >= 29 && motionEventM36064.getClassification() == 3;
            boolean z2 = i >= 29 && motionEventM36064.getClassification() == 5;
            int actionMasked = motionEventM36064.getActionMasked();
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
                            case 6:
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
                C2478 c2478 = (C2478) list.get(i2);
                if (AbstractC2481.m3587(c2478)) {
                    i2 = 2;
                } else if (!AbstractC2481.m3589(c2478)) {
                    i2++;
                }
            }
            i2 = 3;
        }
        this.f5192 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final MotionEvent m3606() {
        C8894 c8894 = this.f5196;
        if (c8894 != null) {
            return (MotionEvent) ((C0923) c8894.f22589).f573;
        }
        return null;
    }
}

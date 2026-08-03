package p267s1;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;
import p100h0.C1545q0;
import p227p4.C3315t;

/* JADX INFO: renamed from: s1.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3903k {

    /* JADX INFO: renamed from: a */
    public final Object f12800a;

    /* JADX INFO: renamed from: b */
    public final C1545q0 f12801b;

    /* JADX INFO: renamed from: c */
    public final int f12802c;

    /* JADX INFO: renamed from: d */
    public final int f12803d;

    /* JADX INFO: renamed from: e */
    public final int f12804e;

    /* JADX INFO: renamed from: f */
    public int f12805f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3903k(List list, C1545q0 c1545q0) {
        MotionEvent motionEventM8098a;
        this.f12800a = list;
        this.f12801b = c1545q0;
        int i9 = Build.VERSION.SDK_INT;
        int i10 = 0;
        this.f12802c = (i9 < 29 || (motionEventM8098a = m8098a()) == null) ? 0 : motionEventM8098a.getClassification();
        MotionEvent motionEventM8098a2 = m8098a();
        this.f12803d = motionEventM8098a2 != null ? motionEventM8098a2.getButtonState() : 0;
        MotionEvent motionEventM8098a3 = m8098a();
        this.f12804e = motionEventM8098a3 != null ? motionEventM8098a3.getMetaState() : 0;
        MotionEvent motionEventM8098a4 = m8098a();
        if (motionEventM8098a4 != null) {
            boolean z9 = i9 >= 29 && motionEventM8098a4.getClassification() == 3;
            boolean z10 = i9 >= 29 && motionEventM8098a4.getClassification() == 5;
            int actionMasked = motionEventM8098a4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                if (!z9) {
                                    i10 = !z10 ? 1 : 8;
                                }
                                i10 = 10;
                                break;
                            case 6:
                                if (!z9) {
                                    if (!z10) {
                                        i10 = 2;
                                        break;
                                    }
                                }
                                i10 = 12;
                                break;
                            case 7:
                                if (z9) {
                                    i10 = 11;
                                    break;
                                } else if (!z10) {
                                    i10 = 3;
                                    break;
                                }
                                break;
                            case 8:
                                i10 = 6;
                                break;
                            case 9:
                                i10 = 4;
                                break;
                            case 10:
                                i10 = 5;
                                break;
                        }
                    }
                } else if (z9) {
                    i10 = 12;
                } else if (z10) {
                    i10 = 9;
                }
            } else if (z9) {
                i10 = 10;
            } else if (z10) {
                i10 = 7;
            }
        } else {
            int size = list.size();
            while (i10 < size) {
                C3914t c3914t = (C3914t) list.get(i10);
                if (AbstractC3913s.m8111d(c3914t)) {
                    i10 = 2;
                } else if (!AbstractC3913s.m8109b(c3914t)) {
                    i10++;
                }
            }
            i10 = 3;
        }
        this.f12805f = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final MotionEvent m8098a() {
        C1545q0 c1545q0 = this.f12801b;
        if (c1545q0 != null) {
            return (MotionEvent) ((C3315t) c1545q0.f5154d).f10678i;
        }
        return null;
    }
}

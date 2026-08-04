package yyds;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛶᲁᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1421 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Object f6712;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f6713 = 0;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f6714;

    public RunnableC1421(List list, int i, Throwable th) {
        AbstractC2217.m4200(list, "initCallbacks cannot be null");
        this.f6712 = new ArrayList(list);
        this.f6714 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2312 c2312;
        int i;
        int i2 = this.f6713;
        int i3 = this.f6714;
        Object obj = this.f6712;
        int i4 = 0;
        switch (i2) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                if (i3 == 1) {
                    while (i4 < size) {
                        ((AbstractC0505) arrayList.get(i4)).mo1356();
                        i4++;
                    }
                } else {
                    while (i4 < size) {
                        ((AbstractC0505) arrayList.get(i4)).getClass();
                        i4++;
                    }
                }
                break;
            default:
                C2458 c2458 = (C2458) obj;
                C1624 c1624 = c2458.f12153;
                c1624.f8269 = AbstractC2104.m4012(i3);
                if (c2458.f12149 != null) {
                    int iM4012 = AbstractC2104.m4012(i3);
                    if (iM4012 != 0) {
                        if (iM4012 == 1) {
                            C2312 c23122 = c2458.f12149;
                            int i5 = c23122.f11347;
                            if (i5 != 1) {
                                if (i5 == 4) {
                                    c23122.m4324(1.0f);
                                    c23122.f11343 = new RunnableC1481(c23122, 2);
                                } else {
                                    c23122.m4323(1, new AccelerateDecelerateInterpolator());
                                }
                            }
                        } else if (iM4012 == 2) {
                            C2312 c23123 = c2458.f12149;
                            int i6 = c23123.f11347;
                            if (i6 != 2) {
                                if (i6 == 4) {
                                    c23123.m4324(1.0f);
                                    c23123.f11343 = new RunnableC1481(c23123, 3);
                                } else {
                                    c23123.m4323(2, new AccelerateInterpolator(2.0f));
                                }
                            }
                        } else if (iM4012 == 3 && (i = (c2312 = c2458.f12149).f11347) != 3) {
                            if (i == 4) {
                                c2312.m4324(1.0f);
                                c2312.f11343 = new RunnableC1481(c2312, 4);
                            } else {
                                c2312.m4323(3, new DecelerateInterpolator(2.0f));
                            }
                        }
                        RelativeLayout relativeLayout = c2458.f12156;
                        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                            c2458.f12149.f11324 = new RunnableC1873(this, 0);
                        } else {
                            new C1344().m2748();
                            c2458.m4500();
                            long j = c1624.f8273;
                            if (j > 0) {
                                AbstractC0041.m268(new RunnableC1873(this, 1), j);
                            }
                        }
                        break;
                    } else {
                        C2312 c23124 = c2458.f12149;
                        if (c23124.f11347 != 0) {
                            c23124.f11345 = false;
                            c23124.f11346 = 0;
                            c23124.f11336 = 0;
                            c23124.f11331 = 0;
                            c23124.f11347 = 0;
                            C0291 c0291 = c23124.f11349;
                            if (c0291 != null) {
                                c0291.f1553 = false;
                            }
                            C0291 c02912 = c23124.f11338;
                            if (c02912 != null) {
                                c02912.f1553 = false;
                            }
                            c23124.f11325 = false;
                            c23124.m4322();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public RunnableC1421(C2458 c2458, int i) {
        this.f6712 = c2458;
        this.f6714 = i;
    }
}

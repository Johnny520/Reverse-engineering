package yyds;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲈᛵᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2660 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Object f13060;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f13061;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f13062;

    public RunnableC2660(C1877 c1877, C1472 c1472, int i) {
        this.f13061 = 5;
        this.f13060 = c1877;
        this.f13062 = c1472;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0209  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        InterfaceC1643 interfaceC1643;
        C2552 c2552;
        int i;
        Object[] objArr;
        int i2;
        int i3;
        int i4 = this.f13061;
        int i5 = 1;
        Object obj = this.f13060;
        switch (i4) {
            case 0:
                C0640 c0640 = (C0640) this.f13062;
                C1313 c1313 = (C1313) obj;
                MenuC0836 menuC0836 = c1313.f6004;
                if (menuC0836 != null && (interfaceC1643 = menuC0836.f3834) != null) {
                    interfaceC1643.mo407(menuC0836);
                }
                View view = (View) c1313.f6016;
                if (view != null && view.getWindowToken() != null) {
                    if (c0640.m3361()) {
                        c1313.f6013 = c0640;
                    } else if (c0640.f8391 != null) {
                        c0640.m3362(0, 0, false, false);
                        c1313.f6013 = c0640;
                    }
                }
                c1313.f6009 = null;
                break;
            case 1:
                RunnableC0908 runnableC0908 = (RunnableC0908) obj;
                C0399 c0399 = runnableC0908.f4131;
                if (c0399.f2104 == runnableC0908.f4130) {
                    List list = runnableC0908.f4134;
                    C2552 c25522 = (C2552) this.f13062;
                    Runnable runnable = runnableC0908.f4133;
                    c0399.f2101 = list;
                    c0399.f2106 = Collections.unmodifiableList(list);
                    C0052 c0052 = c0399.f2102;
                    int[] iArr = (int[]) c25522.f12608;
                    ArrayList arrayList = (ArrayList) c25522.f12614;
                    int i6 = c25522.f12609;
                    C0052 c00522 = (C0052) c25522.f12611;
                    C1759 c1759 = new C1759(c0052);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    int i7 = c25522.f12610;
                    int size = arrayList.size() - 1;
                    int i8 = i7;
                    int i9 = i6;
                    while (size >= 0) {
                        C1138 c1138 = (C1138) arrayList.get(size);
                        int i10 = c1138.f5219;
                        int i11 = i5;
                        int i12 = c1138.f5221;
                        int i13 = i10 + i12;
                        int i14 = c1138.f5220;
                        int[] iArr2 = iArr;
                        int i15 = i14 + i12;
                        ArrayList arrayList2 = arrayList;
                        while (i9 > i13) {
                            i9--;
                            int i16 = iArr2[i9];
                            if ((i16 & 12) != 0) {
                                int i17 = i16 >> 4;
                                i2 = i13;
                                int i18 = i6;
                                C0844 c0844M4634 = C2552.m4634(arrayDeque, i17, false);
                                if (c0844M4634 != null) {
                                    int i19 = (i18 - c0844M4634.f3881) - 1;
                                    c1759.m3495(i9, i19);
                                    if ((i16 & 4) != 0) {
                                        c00522.m396(i9, i17);
                                        c1759.m3494(i19, i11);
                                    }
                                } else {
                                    boolean z = i11;
                                    arrayDeque.add(new C0844(i9, (i18 - i9) - (z ? 1 : 0), z));
                                }
                                i6 = i18;
                            } else {
                                i2 = i13;
                                int i20 = i6;
                                if (c1759.f8834 != 2 || (i3 = c1759.f8835) < i9 || i3 > i9 + 1) {
                                    c1759.m3493();
                                    c1759.f8835 = i9;
                                    c1759.f8836 = 1;
                                    c1759.f8834 = 2;
                                } else {
                                    c1759.f8836++;
                                    c1759.f8835 = i9;
                                }
                                i6 = i20 - 1;
                            }
                            i13 = i2;
                            i11 = 1;
                        }
                        while (i8 > i15) {
                            i8--;
                            int i21 = ((int[]) c25522.f12613)[i8];
                            if ((i21 & 12) != 0) {
                                int i22 = i21 >> 4;
                                c2552 = c25522;
                                if (C2552.m4634(arrayDeque, i22, true) == null) {
                                    objArr = true;
                                    arrayDeque.add(new C0844(i8, i6 - i9, false));
                                } else {
                                    objArr = true;
                                    c1759.m3495((i6 - r3.f3881) - 1, i9);
                                    if ((i21 & 4) != 0) {
                                        c00522.m396(i22, i8);
                                        c1759.m3494(i9, 1);
                                    }
                                }
                            } else {
                                c2552 = c25522;
                                if (c1759.f8834 != 1 || i9 < (i = c1759.f8835)) {
                                    c1759.m3493();
                                    c1759.f8835 = i9;
                                    c1759.f8836 = 1;
                                    c1759.f8834 = 1;
                                    i6++;
                                } else {
                                    int i23 = c1759.f8836;
                                    if (i9 <= i + i23) {
                                        c1759.f8836 = i23 + 1;
                                        c1759.f8835 = Math.min(i9, i);
                                    }
                                    i6++;
                                }
                            }
                            c25522 = c2552;
                        }
                        C2552 c25523 = c25522;
                        int i24 = i14;
                        int i25 = i10;
                        for (int i26 = 0; i26 < i12; i26++) {
                            if ((iArr2[i25] & 15) == 2) {
                                c00522.m396(i25, i24);
                                c1759.m3494(i25, 1);
                            }
                            i25++;
                            i24++;
                        }
                        size--;
                        iArr = iArr2;
                        i5 = 1;
                        i8 = i14;
                        i9 = i10;
                        arrayList = arrayList2;
                        c25522 = c25523;
                    }
                    c1759.m3493();
                    c0399.m1155(runnable);
                }
                break;
            case 2:
                ((C1849) ((C2014) this.f13062).f10074).m3614((Typeface) obj);
                break;
            case 3:
                if (((ThreadFactoryC2122) obj).f10472) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f13062).run();
                } catch (Throwable th) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
                break;
            case 4:
                ((C1853) this.f13062).m3632((C1158) obj);
                break;
            case 5:
                C1472 c1472 = (C1472) this.f13062;
                C1877 c1877 = (C1877) obj;
                C1213 c1213 = c1877.f9450;
                if (c1213 != null && c1213.f5557 && !c1472.f6998 && c1472.f6993.m778() != -1) {
                    AbstractC2411 itemAnimator = c1877.f9450.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.mo4466()) {
                        ArrayList arrayList3 = c1877.f9464;
                        int size2 = arrayList3.size();
                        for (int i27 = 0; i27 < size2; i27++) {
                            if (((C1472) arrayList3.get(i27)).f6999) {
                            }
                        }
                        c1877.f9442.mo1231();
                    }
                    c1877.f9450.post(this);
                    break;
                }
                break;
            case 6:
                C1134 c1134 = (C1134) obj;
                AbstractC0974 abstractC0974 = c1134.f5210;
                int i28 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f13062).run();
                    } catch (Throwable th2) {
                        AbstractC2071.m3956(C2586.f12764, th2);
                    }
                    Runnable runnableM2326 = c1134.m2326();
                    if (runnableM2326 == null) {
                        break;
                    } else {
                        this.f13062 = runnableM2326;
                        i28++;
                        if (i28 >= 16 && abstractC0974.mo2117(c1134)) {
                            abstractC0974.mo1251(c1134, this);
                            break;
                        }
                    }
                    break;
                }
                break;
            case 7:
                ((C2212) this.f13062).accept(obj);
                break;
            case 8:
                ((C1853) obj).m3632((C2751) this.f13062);
                break;
            default:
                AbstractC0427.m1186((Activity) this.f13062, (View) obj);
                break;
        }
    }

    public /* synthetic */ RunnableC2660(Object obj, int i, Object obj2) {
        this.f13061 = i;
        this.f13060 = obj;
        this.f13062 = obj2;
    }

    public /* synthetic */ RunnableC2660(int i, Object obj, Object obj2, boolean z) {
        this.f13061 = i;
        this.f13062 = obj;
        this.f13060 = obj2;
    }
}

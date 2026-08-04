package yyds;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: yyds.ᲇᛱᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2378 implements InterfaceC1181 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C1213 f11724;

    public /* synthetic */ C2378(C1213 c1213) {
        this.f11724 = c1213;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public void m4415(AbstractC0185 abstractC0185, C2292 c2292, C2292 c22922) {
        boolean zM4486;
        C1213 c1213 = this.f11724;
        c1213.f5529.m4935(abstractC0185);
        c1213.m2448(abstractC0185);
        abstractC0185.m777(false);
        C2446 c2446 = (C2446) c1213.f5532;
        c2446.getClass();
        int i = c2292.f11256;
        int i2 = c2292.f11257;
        View view = abstractC0185.f1093;
        int left = c22922 == null ? view.getLeft() : c22922.f11256;
        int top = c22922 == null ? view.getTop() : c22922.f11257;
        if (abstractC0185.m774() || (i == left && i2 == top)) {
            c2446.m4488(abstractC0185);
            c2446.f12044.add(abstractC0185);
            zM4486 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM4486 = c2446.m4486(abstractC0185, i, i2, left, top);
        }
        if (zM4486) {
            c1213.m2443();
        }
    }

    @Override // yyds.InterfaceC1181
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public float mo2375() {
        float f;
        C1213 c1213 = this.f11724;
        if (c1213.f5583.mo174()) {
            f = c1213.f5589;
        } else {
            if (!c1213.f5583.mo206()) {
                return 0.0f;
            }
            f = c1213.f5541;
        }
        return -f;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public void m4416(int i) {
        C1213 c1213 = this.f11724;
        View childAt = c1213.getChildAt(i);
        if (childAt != null) {
            c1213.m2444(childAt);
            childAt.clearAnimation();
        }
        c1213.removeViewAt(i);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public void m4417(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C1213 c1213 = this.f11724;
        int iM4907 = c1213.f5523.m4907();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iM4907; i11++) {
            AbstractC0185 abstractC0185M2412 = C1213.m2412(c1213.f5523.m4909(i11));
            if (abstractC0185M2412 != null && (i9 = abstractC0185M2412.f1102) >= i4 && i9 <= i3) {
                if (C1213.f5512) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + abstractC0185M2412);
                }
                if (abstractC0185M2412.f1102 == i) {
                    abstractC0185M2412.m773(i2 - i, false);
                } else {
                    abstractC0185M2412.m773(i5, false);
                }
                c1213.f5568.f12982 = true;
            }
        }
        ArrayList arrayList = c1213.f5529.f13692;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC0185 abstractC0185 = (AbstractC0185) arrayList.get(i12);
            if (abstractC0185 != null && (i8 = abstractC0185.f1102) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC0185.m773(i2 - i, false);
                } else {
                    abstractC0185.m773(i10, false);
                }
                if (C1213.f5512) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + abstractC0185);
                }
            }
        }
        c1213.requestLayout();
        c1213.f5538 = true;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m4418(C1931 c1931) {
        int i = c1931.f9729;
        C1213 c1213 = this.f11724;
        if (i == 1) {
            c1213.f5583.mo164(c1931.f9730, c1931.f9732);
            return;
        }
        if (i == 2) {
            c1213.f5583.mo135(c1931.f9730, c1931.f9732);
        } else if (i == 4) {
            c1213.f5583.mo147(c1931.f9730, c1931.f9732);
        } else {
            if (i != 8) {
                return;
            }
            c1213.f5583.mo165(c1931.f9730, c1931.f9732);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public AbstractC0185 m4419(int i) {
        C1213 c1213 = this.f11724;
        int iM4907 = c1213.f5523.m4907();
        int i2 = 0;
        AbstractC0185 abstractC0185 = null;
        while (true) {
            if (i2 >= iM4907) {
                break;
            }
            AbstractC0185 abstractC0185M2412 = C1213.m2412(c1213.f5523.m4909(i2));
            if (abstractC0185M2412 != null && !abstractC0185M2412.m774() && abstractC0185M2412.f1102 == i) {
                if (!((ArrayList) c1213.f5523.f13647).contains(abstractC0185M2412.f1093)) {
                    abstractC0185 = abstractC0185M2412;
                    break;
                }
                abstractC0185 = abstractC0185M2412;
            }
            i2++;
        }
        if (abstractC0185 != null) {
            if (!((ArrayList) c1213.f5523.f13647).contains(abstractC0185.f1093)) {
                return abstractC0185;
            }
            if (C1213.f5512) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m4420(AbstractC0185 abstractC0185, C2292 c2292, C2292 c22922) {
        boolean zM4486;
        abstractC0185.m777(false);
        C1213 c1213 = this.f11724;
        C2446 c2446 = (C2446) c1213.f5532;
        if (c2292 != null) {
            c2446.getClass();
            int i = c2292.f11256;
            int i2 = c22922.f11256;
            if (i == i2 && c2292.f11257 == c22922.f11257) {
                c2446.m4488(abstractC0185);
                abstractC0185.f1093.setAlpha(0.0f);
                c2446.f12046.add(abstractC0185);
                zM4486 = true;
            } else {
                zM4486 = c2446.m4486(abstractC0185, i, c2292.f11257, i2, c22922.f11257);
            }
        }
        if (zM4486) {
            c1213.m2443();
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void m4421(int i, int i2, Object obj) {
        int i3;
        int i4;
        C1213 c1213 = this.f11724;
        int iM4907 = c1213.f5523.m4907();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM4907; i6++) {
            View viewM4909 = c1213.f5523.m4909(i6);
            AbstractC0185 abstractC0185M2412 = C1213.m2412(viewM4909);
            if (abstractC0185M2412 != null && !abstractC0185M2412.m785() && (i4 = abstractC0185M2412.f1102) >= i && i4 < i5) {
                abstractC0185M2412.m776(2);
                if (obj == null) {
                    abstractC0185M2412.m776(1024);
                } else if ((1024 & abstractC0185M2412.f1091) == 0) {
                    if (abstractC0185M2412.f1101 == null) {
                        ArrayList arrayList = new ArrayList();
                        abstractC0185M2412.f1101 = arrayList;
                        abstractC0185M2412.f1099 = Collections.unmodifiableList(arrayList);
                    }
                    abstractC0185M2412.f1101.add(obj);
                }
                ((C2526) viewM4909.getLayoutParams()).f12450 = true;
            }
        }
        C2808 c2808 = c1213.f5529;
        ArrayList arrayList2 = c2808.f13692;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            AbstractC0185 abstractC0185 = (AbstractC0185) arrayList2.get(size);
            if (abstractC0185 != null && (i3 = abstractC0185.f1102) >= i && i3 < i5) {
                abstractC0185.m776(2);
                c2808.m4933(size);
            }
        }
        c1213.f5542 = true;
    }

    @Override // yyds.InterfaceC1181
    /* JADX INFO: renamed from: ᲇᛱᛲ */
    public void mo2376() {
        this.f11724.m2418();
    }

    @Override // yyds.InterfaceC1181
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public boolean mo2377(float f) {
        int i;
        int i2;
        C1213 c1213 = this.f11724;
        if (c1213.f5583.mo174()) {
            i2 = (int) f;
            i = 0;
        } else if (c1213.f5583.mo206()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        c1213.m2418();
        return c1213.m2471(i, i2, 0, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public void m4422(int i, int i2) {
        C1213 c1213 = this.f11724;
        int iM4907 = c1213.f5523.m4907();
        for (int i3 = 0; i3 < iM4907; i3++) {
            AbstractC0185 abstractC0185M2412 = C1213.m2412(c1213.f5523.m4909(i3));
            if (abstractC0185M2412 != null && !abstractC0185M2412.m785() && abstractC0185M2412.f1102 >= i) {
                if (C1213.f5512) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + abstractC0185M2412 + " now at position " + (abstractC0185M2412.f1102 + i2));
                }
                abstractC0185M2412.m773(i2, false);
                c1213.f5568.f12982 = true;
            }
        }
        ArrayList arrayList = c1213.f5529.f13692;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0185 abstractC0185 = (AbstractC0185) arrayList.get(i4);
            if (abstractC0185 != null && abstractC0185.f1102 >= i) {
                if (C1213.f5512) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + abstractC0185 + " now at position " + (abstractC0185.f1102 + i2));
                }
                abstractC0185.m773(i2, false);
            }
        }
        c1213.requestLayout();
        c1213.f5538 = true;
    }
}

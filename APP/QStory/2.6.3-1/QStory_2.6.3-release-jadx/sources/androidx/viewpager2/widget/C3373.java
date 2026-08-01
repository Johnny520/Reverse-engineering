package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC3366;
import androidx.recyclerview.widget.C3351;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3373 extends AbstractC3366 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f7995;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f7996;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinearLayoutManager f7997;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3383 f7998;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3382 f7999;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3376 f8000;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f8001;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C3374 f8002;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f8003;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f8004;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f8005;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f8006;

    public C3373(C3382 c3382) {
        this.f7999 = c3382;
        C3383 c3383 = c3382.f8022;
        this.f7998 = c3383;
        this.f7997 = (LinearLayoutManager) c3383.getLayoutManager();
        this.f8002 = new C3374();
        m5607();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x013e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5606() {
        int top2;
        int iM5557;
        int top3;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.f7997;
        int iM5206 = linearLayoutManager.m5206();
        C3374 c3374 = this.f8002;
        c3374.f8009 = iM5206;
        if (iM5206 == -1) {
            c3374.f8009 = -1;
            c3374.f8008 = 0.0f;
            c3374.f8007 = 0;
            return;
        }
        View viewMo5204 = linearLayoutManager.mo5204(iM5206);
        if (viewMo5204 == null) {
            c3374.f8009 = -1;
            c3374.f8008 = 0.0f;
            c3374.f8007 = 0;
            return;
        }
        int i3 = ((C3351) viewMo5204.getLayoutParams()).f7922.left;
        int i4 = ((C3351) viewMo5204.getLayoutParams()).f7922.right;
        int i5 = ((C3351) viewMo5204.getLayoutParams()).f7922.top;
        int i6 = ((C3351) viewMo5204.getLayoutParams()).f7922.bottom;
        ViewGroup.LayoutParams layoutParams = viewMo5204.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 += marginLayoutParams.leftMargin;
            i4 += marginLayoutParams.rightMargin;
            i5 += marginLayoutParams.topMargin;
            i6 += marginLayoutParams.bottomMargin;
        }
        int height = viewMo5204.getHeight() + i5 + i6;
        int width = viewMo5204.getWidth() + i3 + i4;
        int i7 = linearLayoutManager.f7512;
        C3383 c3383 = this.f7998;
        if (i7 == 0) {
            top2 = (viewMo5204.getLeft() - i3) - c3383.getPaddingLeft();
            if (this.f7999.f8033.f7937.getLayoutDirection() == 1) {
                top2 = -top2;
            }
            height = width;
        } else {
            top2 = (viewMo5204.getTop() - i5) - c3383.getPaddingTop();
        }
        int i8 = -top2;
        c3374.f8007 = i8;
        if (i8 >= 0) {
            c3374.f8008 = height != 0 ? i8 / height : 0.0f;
            return;
        }
        int iM55572 = linearLayoutManager.m5557();
        if (iM55572 != 0) {
            boolean z = linearLayoutManager.f7512 == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iM55572, 2);
            for (int i9 = 0; i9 < iM55572; i9++) {
                View viewM5558 = linearLayoutManager.m5558(i9);
                if (viewM5558 == null) {
                    C6755.m11870("null view contained in the view hierarchy");
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = viewM5558.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : C3377.f8012;
                int[] iArr2 = iArr[i9];
                if (z) {
                    top3 = viewM5558.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top3 = viewM5558.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top3 - i;
                int[] iArr3 = iArr[i9];
                if (z) {
                    bottom = viewM5558.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewM5558.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new C3378());
            int i10 = 1;
            while (true) {
                if (i10 >= iM55572) {
                    int[] iArr4 = iArr[0];
                    int i11 = iArr4[1];
                    int i12 = iArr4[0];
                    int i13 = i11 - i12;
                    if (i12 > 0 || iArr[iM55572 - 1][1] < i13) {
                        break;
                    }
                } else if (iArr[i10 - 1][1] != iArr[i10][0]) {
                    break;
                } else {
                    i10++;
                }
            }
            iM5557 = linearLayoutManager.m5557();
            for (int i14 = 0; i14 < iM5557; i14++) {
                if (C3377.m5612(linearLayoutManager.m5558(i14))) {
                    C6755.m11870("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    return;
                }
            }
        } else if (linearLayoutManager.m5557() <= 1) {
            iM5557 = linearLayoutManager.m5557();
            while (i14 < iM5557) {
            }
        }
        Locale locale = Locale.US;
        C6755.m11870(AbstractC7012.m12147(c3374.f8007, "Page can only be offset by a positive amount, not by "));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m5607() {
        this.f7996 = 0;
        this.f7995 = 0;
        C3374 c3374 = this.f8002;
        c3374.f8009 = -1;
        c3374.f8008 = 0.0f;
        c3374.f8007 = 0;
        this.f8001 = -1;
        this.f8005 = -1;
        this.f8006 = false;
        this.f8003 = false;
        this.f8004 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m5608(int i) {
        if ((this.f7996 == 3 && this.f7995 == 0) || this.f7995 == i) {
            return;
        }
        this.f7995 = i;
        C3376 c3376 = this.f8000;
        if (c3376 != null) {
            c3376.mo5611(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    @Override // androidx.recyclerview.widget.AbstractC3366
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo5458(RecyclerView recyclerView, int i, int i2) {
        int i3;
        C3376 c3376;
        this.f8003 = true;
        m5606();
        boolean z = this.f8006;
        C3374 c3374 = this.f8002;
        if (z) {
            this.f8006 = false;
            if (i2 > 0) {
                i3 = c3374.f8007 != 0 ? c3374.f8009 + 1 : c3374.f8009;
                this.f8005 = i3;
                if (this.f8001 != i3 && (c3376 = this.f8000) != null) {
                    c3376.mo5609(i3);
                }
            } else {
                if (i2 == 0) {
                    if ((i < 0) == (this.f7999.f8033.f7937.getLayoutDirection() == 1)) {
                    }
                }
                this.f8005 = i3;
                if (this.f8001 != i3) {
                    c3376.mo5609(i3);
                }
            }
        } else if (this.f7996 == 0) {
            int i4 = c3374.f8009;
            if (i4 == -1) {
                i4 = 0;
            }
            C3376 c33762 = this.f8000;
            if (c33762 != null) {
                c33762.mo5609(i4);
            }
        }
        int i5 = c3374.f8009;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = c3374.f8008;
        int i6 = c3374.f8007;
        C3376 c33763 = this.f8000;
        if (c33763 != null) {
            c33763.mo5610(i5, f, i6);
        }
        int i7 = c3374.f8009;
        int i8 = this.f8005;
        if ((i7 == i8 || i8 == -1) && c3374.f8007 == 0 && this.f7995 != 1) {
            m5608(0);
            m5607();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3366
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5459(RecyclerView recyclerView, int i) {
        C3376 c3376;
        C3376 c33762;
        int i2 = this.f7996;
        if (!(i2 == 1 && this.f7995 == 1) && i == 1) {
            this.f7996 = 1;
            int i3 = this.f8005;
            if (i3 != -1) {
                this.f8001 = i3;
                this.f8005 = -1;
            } else if (this.f8001 == -1) {
                this.f8001 = this.f7997.m5206();
            }
            m5608(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.f8003) {
                m5608(2);
                this.f8006 = true;
                return;
            }
            return;
        }
        C3374 c3374 = this.f8002;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            m5606();
            if (!this.f8003) {
                int i4 = c3374.f8009;
                if (i4 != -1 && (c33762 = this.f8000) != null) {
                    c33762.mo5610(i4, 0.0f, 0);
                }
            } else if (c3374.f8007 == 0) {
                int i5 = this.f8001;
                int i6 = c3374.f8009;
                if (i5 != i6 && (c3376 = this.f8000) != null) {
                    c3376.mo5609(i6);
                }
            }
            m5608(0);
            m5607();
        }
        if (this.f7996 == 2 && i == 0 && this.f8004) {
            m5606();
            if (c3374.f8007 == 0) {
                int i7 = this.f8005;
                int i8 = c3374.f8009;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    C3376 c33763 = this.f8000;
                    if (c33763 != null) {
                        c33763.mo5609(i8);
                    }
                }
                m5608(0);
                m5607();
            }
        }
    }
}

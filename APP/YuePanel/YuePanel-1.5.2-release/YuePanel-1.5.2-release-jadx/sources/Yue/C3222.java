package Yue;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3222 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final ViewGroup.MarginLayoutParams f142;

    /* JADX INFO: renamed from: ۥ */
    public LinearLayoutManager f143;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦ$ۥ */
    public class C0085 implements Comparator<int[]> {
        public C0085() {
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f142 = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public C3222(@InterfaceC6391 LinearLayoutManager linearLayoutManager) {
        this.f143 = linearLayoutManager;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m6584(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m6584(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ */
    public final boolean m300() {
        int top;
        int i;
        int bottom;
        int i2;
        int childCount = this.f143.getChildCount();
        if (childCount == 0) {
            return true;
        }
        boolean z = this.f143.getOrientation() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount, 2);
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f143.getChildAt(i3);
            if (childAt == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f142;
            int[] iArr2 = iArr[i3];
            if (z) {
                top = childAt.getLeft();
                i = marginLayoutParams.leftMargin;
            } else {
                top = childAt.getTop();
                i = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i;
            int[] iArr3 = iArr[i3];
            if (z) {
                bottom = childAt.getRight();
                i2 = marginLayoutParams.rightMargin;
            } else {
                bottom = childAt.getBottom();
                i2 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i2;
        }
        Arrays.sort(iArr, new C0085());
        for (int i4 = 1; i4 < childCount; i4++) {
            if (iArr[i4 - 1][1] != iArr[i4][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i5 = iArr4[1];
        int i6 = iArr4[0];
        return i6 <= 0 && iArr[childCount - 1][1] >= i5 - i6;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m301() {
        int childCount = this.f143.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m6584(this.f143.getChildAt(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m6585() {
        return (!m300() || this.f143.getChildCount() <= 1) && m301();
    }
}

package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.core.widgets.analyzer.C2149;
import java.util.ArrayList;
import java.util.HashMap;
import p199.AbstractC7856;
import p199.AbstractC7861;
import p203.C7878;
import p203.C7883;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC7856 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C7883 f6378;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21491 = new int[32];
        this.f21488 = new HashMap();
        this.f21490 = context;
        super.mo13181(attributeSet);
        C7883 c7883 = new C7883();
        c7883.f21828 = 0;
        c7883.f21827 = 0;
        c7883.f21816 = 0;
        c7883.f21815 = 0;
        c7883.f21819 = 0;
        c7883.f21820 = 0;
        c7883.f21817 = false;
        c7883.f21818 = 0;
        c7883.f21806 = 0;
        c7883.f21805 = new C2149();
        c7883.f21808 = null;
        c7883.f21807 = -1;
        c7883.f21803 = -1;
        c7883.f21804 = -1;
        c7883.f21825 = -1;
        c7883.f21826 = -1;
        c7883.f21822 = -1;
        c7883.f21821 = 0.5f;
        c7883.f21824 = 0.5f;
        c7883.f21823 = 0.5f;
        c7883.f21811 = 0.5f;
        c7883.f21812 = 0.5f;
        c7883.f21809 = 0.5f;
        c7883.f21810 = 0;
        c7883.f21814 = 0;
        c7883.f21813 = 2;
        c7883.f21798 = 2;
        c7883.f21797 = 0;
        c7883.f21801 = -1;
        c7883.f21802 = 0;
        c7883.f21799 = new ArrayList();
        c7883.f21800 = null;
        c7883.f21794 = null;
        c7883.f21793 = null;
        c7883.f21795 = 0;
        this.f6378 = c7883;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC7861.f21526);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f6378.f21802 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C7883 c78832 = this.f6378;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c78832.f21828 = dimensionPixelSize;
                    c78832.f21827 = dimensionPixelSize;
                    c78832.f21816 = dimensionPixelSize;
                    c78832.f21815 = dimensionPixelSize;
                } else if (index == 18) {
                    C7883 c78833 = this.f6378;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c78833.f21816 = dimensionPixelSize2;
                    c78833.f21819 = dimensionPixelSize2;
                    c78833.f21820 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f6378.f21815 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f6378.f21819 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f6378.f21828 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f6378.f21820 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f6378.f21827 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f6378.f21797 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f6378.f21807 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f6378.f21803 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f6378.f21804 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f6378.f21826 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f6378.f21825 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f6378.f21822 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f6378.f21821 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f6378.f21823 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f6378.f21812 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f6378.f21811 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f6378.f21809 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f6378.f21824 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f6378.f21813 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f6378.f21798 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f6378.f21810 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f6378.f21814 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f6378.f21801 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f21486 = this.f6378;
        m13182();
    }

    @Override // p199.AbstractC7853, android.view.View
    public final void onMeasure(int i, int i2) {
        mo3912(this.f6378, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f6378.f21823 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f6378.f21804 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f6378.f21811 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f6378.f21825 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f6378.f21813 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f6378.f21821 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f6378.f21810 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f6378.f21807 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f6378.f21812 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f6378.f21826 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f6378.f21809 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f6378.f21822 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f6378.f21801 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f6378.f21802 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C7883 c7883 = this.f6378;
        c7883.f21828 = i;
        c7883.f21827 = i;
        c7883.f21816 = i;
        c7883.f21815 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f6378.f21827 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f6378.f21819 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f6378.f21820 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f6378.f21828 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f6378.f21798 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f6378.f21824 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f6378.f21814 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f6378.f21803 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f6378.f21797 = i;
        requestLayout();
    }

    @Override // p199.AbstractC7853
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo3911(C7878 c7878, boolean z) {
        C7883 c7883 = this.f6378;
        int i = c7883.f21816;
        if (i > 0 || c7883.f21815 > 0) {
            if (z) {
                c7883.f21819 = c7883.f21815;
                c7883.f21820 = i;
            } else {
                c7883.f21819 = i;
                c7883.f21820 = c7883.f21815;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x010b A[EDGE_INSN: B:424:0x010b->B:61:0x010b BREAK  A[LOOP:1: B:55:0x00f4->B:60:0x0106], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0131  */
    @Override // p199.AbstractC7856
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3912(p203.C7883 r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 1897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.mo3912(飘花落叶言子苏兰楪哲世.飘花落叶言子楪苏世兰哲, int, int):void");
    }
}

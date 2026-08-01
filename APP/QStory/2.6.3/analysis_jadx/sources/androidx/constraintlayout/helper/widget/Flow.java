package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.core.widgets.analyzer.C2149;
import java.util.ArrayList;
import java.util.HashMap;
import p199.AbstractC7857;
import p199.AbstractC7862;
import p203.C7879;
import p203.C7884;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC7857 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C7884 f6379;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21488 = new int[32];
        this.f21485 = new HashMap();
        this.f21487 = context;
        super.mo13209(attributeSet);
        C7884 c7884 = new C7884();
        c7884.f21825 = 0;
        c7884.f21824 = 0;
        c7884.f21813 = 0;
        c7884.f21812 = 0;
        c7884.f21816 = 0;
        c7884.f21817 = 0;
        c7884.f21814 = false;
        c7884.f21815 = 0;
        c7884.f21803 = 0;
        c7884.f21802 = new C2149();
        c7884.f21805 = null;
        c7884.f21804 = -1;
        c7884.f21800 = -1;
        c7884.f21801 = -1;
        c7884.f21822 = -1;
        c7884.f21823 = -1;
        c7884.f21819 = -1;
        c7884.f21818 = 0.5f;
        c7884.f21821 = 0.5f;
        c7884.f21820 = 0.5f;
        c7884.f21808 = 0.5f;
        c7884.f21809 = 0.5f;
        c7884.f21806 = 0.5f;
        c7884.f21807 = 0;
        c7884.f21811 = 0;
        c7884.f21810 = 2;
        c7884.f21795 = 2;
        c7884.f21794 = 0;
        c7884.f21798 = -1;
        c7884.f21799 = 0;
        c7884.f21796 = new ArrayList();
        c7884.f21797 = null;
        c7884.f21791 = null;
        c7884.f21790 = null;
        c7884.f21792 = 0;
        this.f6379 = c7884;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC7862.f21523);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f6379.f21799 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C7884 c78842 = this.f6379;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c78842.f21825 = dimensionPixelSize;
                    c78842.f21824 = dimensionPixelSize;
                    c78842.f21813 = dimensionPixelSize;
                    c78842.f21812 = dimensionPixelSize;
                } else if (index == 18) {
                    C7884 c78843 = this.f6379;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c78843.f21813 = dimensionPixelSize2;
                    c78843.f21816 = dimensionPixelSize2;
                    c78843.f21817 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f6379.f21812 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f6379.f21816 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f6379.f21825 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f6379.f21817 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f6379.f21824 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f6379.f21794 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f6379.f21804 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f6379.f21800 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f6379.f21801 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f6379.f21823 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f6379.f21822 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f6379.f21819 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f6379.f21818 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f6379.f21820 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f6379.f21809 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f6379.f21808 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f6379.f21806 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f6379.f21821 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f6379.f21810 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f6379.f21795 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f6379.f21807 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f6379.f21811 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f6379.f21798 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f21483 = this.f6379;
        m13210();
    }

    @Override // p199.AbstractC7854, android.view.View
    public final void onMeasure(int i, int i2) {
        mo3922(this.f6379, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f6379.f21820 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f6379.f21801 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f6379.f21808 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f6379.f21822 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f6379.f21810 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f6379.f21818 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f6379.f21807 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f6379.f21804 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f6379.f21809 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f6379.f21823 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f6379.f21806 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f6379.f21819 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f6379.f21798 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f6379.f21799 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C7884 c7884 = this.f6379;
        c7884.f21825 = i;
        c7884.f21824 = i;
        c7884.f21813 = i;
        c7884.f21812 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f6379.f21824 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f6379.f21816 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f6379.f21817 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f6379.f21825 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f6379.f21795 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f6379.f21821 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f6379.f21811 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f6379.f21800 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f6379.f21794 = i;
        requestLayout();
    }

    @Override // p199.AbstractC7854
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo3921(C7879 c7879, boolean z) {
        C7884 c7884 = this.f6379;
        int i = c7884.f21813;
        if (i > 0 || c7884.f21812 > 0) {
            if (z) {
                c7884.f21816 = c7884.f21812;
                c7884.f21817 = i;
            } else {
                c7884.f21816 = i;
                c7884.f21817 = c7884.f21812;
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
    @Override // p199.AbstractC7857
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3922(p203.C7884 r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 1897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.mo3922(飘花落叶言子苏兰楪哲世.飘花落叶言子楪苏世兰哲, int, int):void");
    }
}

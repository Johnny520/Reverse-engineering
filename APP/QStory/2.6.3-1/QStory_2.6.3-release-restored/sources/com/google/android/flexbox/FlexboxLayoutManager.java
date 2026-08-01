package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0900;
import androidx.recyclerview.widget.AbstractC3283;
import androidx.recyclerview.widget.AbstractC3290;
import androidx.recyclerview.widget.AbstractC3352;
import androidx.recyclerview.widget.C3289;
import androidx.recyclerview.widget.C3292;
import androidx.recyclerview.widget.C3351;
import androidx.recyclerview.widget.C3353;
import androidx.recyclerview.widget.C3358;
import androidx.recyclerview.widget.C3364;
import androidx.recyclerview.widget.InterfaceC3355;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayoutManager extends AbstractC3352 implements InterfaceC3914, InterfaceC3355 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static final Rect f10204 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public int f10205;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public int f10206;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public AbstractC3290 f10207;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public AbstractC3290 f10208;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public int f10209;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public SavedState f10210;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C3918 f10211;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C3916 f10212;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C3358 f10215;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C3364 f10216;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f10217;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f10218;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final int f10220;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int f10221;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f10222;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final SparseArray f10223;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public int f10224;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public int f10225;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final C3912 f10226;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final Context f10227;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public View f10228;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final int f10219 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public List f10214 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C3910 f10213 = new C3910(this);

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class LayoutParams extends C3351 implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C3915();

        /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
        public boolean f10229;

        /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
        public int f10230;

        /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
        public int f10231;

        /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
        public int f10232;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
        public float f10233;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
        public float f10234;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
        public int f10235;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
        public float f10236;

        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
        public int f10237;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return 1;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f10233);
            parcel.writeFloat(this.f10236);
            parcel.writeInt(this.f10237);
            parcel.writeFloat(this.f10234);
            parcel.writeInt(this.f10235);
            parcel.writeInt(this.f10232);
            parcel.writeInt(this.f10231);
            parcel.writeInt(this.f10230);
            parcel.writeByte(this.f10229 ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
        public final int mo7461() {
            return this.f10231;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
        public final int mo7462() {
            return this.f10230;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
        public final float mo7463() {
            return this.f10234;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
        public final float mo7464() {
            return this.f10233;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
        public final boolean mo7465() {
            return this.f10229;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
        public final int mo7466() {
            return this.f10232;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
        public final int mo7467() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
        public final int mo7468() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
        public final int mo7469() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
        public final int mo7470() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
        public final void mo7471(int i) {
            this.f10232 = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
        public final int mo7472() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
        public final int mo7473() {
            return this.f10237;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
        public final void mo7474(int i) {
            this.f10235 = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
        public final int mo7475() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
        public final float mo7476() {
            return this.f10236;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
        public final int mo7477() {
            return this.f10235;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3919();

        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
        public int f10238;

        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
        public int f10239;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.f10239);
            sb.append(", mAnchorOffset=");
            return AbstractC0900.m716(sb, this.f10238, '}');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f10239);
            parcel.writeInt(this.f10238);
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C3916 c3916 = new C3916(this);
        this.f10212 = c3916;
        this.f10209 = -1;
        this.f10205 = Integer.MIN_VALUE;
        this.f10206 = Integer.MIN_VALUE;
        this.f10224 = Integer.MIN_VALUE;
        this.f10223 = new SparseArray();
        this.f10225 = -1;
        this.f10226 = new C3912();
        C3353 c3353M5542 = AbstractC3352.m5542(context, attributeSet, i, i2);
        int i3 = c3353M5542.f7943;
        if (i3 != 0) {
            if (i3 == 1) {
                if (c3353M5542.f7941) {
                    m7518(3);
                } else {
                    m7518(2);
                }
            }
        } else if (c3353M5542.f7941) {
            m7518(1);
        } else {
            m7518(0);
        }
        int i4 = this.f10221;
        if (i4 != 1) {
            if (i4 == 0) {
                m5566();
                this.f10214.clear();
                C3916.m7545(c3916);
                c3916.f10269 = 0;
            }
            this.f10221 = 1;
            this.f10208 = null;
            this.f10207 = null;
            m5561();
        }
        if (this.f10220 != 4) {
            m5566();
            this.f10214.clear();
            C3916.m7545(c3916);
            c3916.f10269 = 0;
            this.f10220 = 4;
            m5561();
        }
        this.f10227 = context;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static boolean m7499(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public final int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public final int getAlignItems() {
        return this.f10220;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public final int getFlexDirection() {
        return this.f10222;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public final int getFlexItemCount() {
        return this.f10215.m5585();
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public final List getFlexLinesInternal() {
        return this.f10214;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public final int getFlexWrap() {
        return this.f10221;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public final int getLargestMainSize() {
        if (this.f10214.size() == 0) {
            return 0;
        }
        int size = this.f10214.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((C3913) this.f10214.get(i)).f10250);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public final int getMaxLine() {
        return this.f10219;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public final int getSumOfCrossSize() {
        int size = this.f10214.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C3913) this.f10214.get(i2)).f10262;
        }
        return i;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    public final void setFlexLines(List list) {
        this.f10214 = list;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final C3351 mo5161() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f10233 = 0.0f;
        layoutParams.f10236 = 1.0f;
        layoutParams.f10237 = -1;
        layoutParams.f10234 = -1.0f;
        layoutParams.f10231 = 16777215;
        layoutParams.f10230 = 16777215;
        return layoutParams;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final int mo5162(C3358 c3358) {
        return m7513(c3358);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo5163(C3358 c3358) {
        return m7509(c3358);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final int mo5205(C3358 c3358) {
        return m7510(c3358);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final C3351 mo5166(Context context, AttributeSet attributeSet) {
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f10233 = 0.0f;
        layoutParams.f10236 = 1.0f;
        layoutParams.f10237 = -1;
        layoutParams.f10234 = -1.0f;
        layoutParams.f10231 = 16777215;
        layoutParams.f10230 = 16777215;
        return layoutParams;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public final View m7500(int i, int i2, int i3) {
        int iM5543;
        m7514();
        if (this.f10211 == null) {
            C3918 c3918 = new C3918();
            c3918.f10283 = 1;
            this.f10211 = c3918;
        }
        int iMo5405 = this.f10208.mo5405();
        int iMo5404 = this.f10208.mo5404();
        int i4 = i2 <= i ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewM5558 = m5558(i);
            if (viewM5558 != null && (iM5543 = AbstractC3352.m5543(viewM5558)) >= 0 && iM5543 < i3) {
                if (((C3351) viewM5558.getLayoutParams()).f7924.isRemoved()) {
                    if (view2 == null) {
                        view2 = viewM5558;
                    }
                } else {
                    if (this.f10208.mo5396(viewM5558) >= iMo5405 && this.f10208.mo5399(viewM5558) <= iMo5404) {
                        return viewM5558;
                    }
                    if (view == null) {
                        view = viewM5558;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public final int m7501(int i, C3364 c3364, C3358 c3358, boolean z) {
        int iM7520;
        int iMo5404;
        if (mo7498() || !this.f10218) {
            int iMo54042 = this.f10208.mo5404() - i;
            if (iMo54042 <= 0) {
                return 0;
            }
            iM7520 = -m7520(-iMo54042, c3364, c3358);
        } else {
            int iMo5405 = i - this.f10208.mo5405();
            if (iMo5405 <= 0) {
                return 0;
            }
            iM7520 = m7520(iMo5405, c3364, c3358);
        }
        int i2 = i + iM7520;
        if (!z || (iMo5404 = this.f10208.mo5404() - i2) <= 0) {
            return iM7520;
        }
        this.f10208.mo5402(iMo5404);
        return iMo5404 + iM7520;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public final View m7502(int i) {
        View viewM7500 = m7500(m5557() - 1, -1, i);
        if (viewM7500 == null) {
            return null;
        }
        return m7505(viewM7500, (C3913) this.f10214.get(this.f10213.f10242[AbstractC3352.m5543(viewM7500)]));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m7503(View view, C3913 c3913) {
        boolean zMo7498 = mo7498();
        int i = c3913.f10261;
        for (int i2 = 1; i2 < i; i2++) {
            View viewM5558 = m5558(i2);
            if (viewM5558 != null && viewM5558.getVisibility() != 8) {
                if (!this.f10218 || zMo7498) {
                    if (this.f10208.mo5396(view) > this.f10208.mo5396(viewM5558)) {
                        view = viewM5558;
                    }
                } else if (this.f10208.mo5399(view) < this.f10208.mo5399(viewM5558)) {
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public final View m7504(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View viewM5558 = m5558(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.f7926 - getPaddingRight();
            int paddingBottom = this.f7925 - getPaddingBottom();
            int iM5548 = AbstractC3352.m5548(viewM5558) - ((ViewGroup.MarginLayoutParams) ((C3351) viewM5558.getLayoutParams())).leftMargin;
            int iM5541 = AbstractC3352.m5541(viewM5558) - ((ViewGroup.MarginLayoutParams) ((C3351) viewM5558.getLayoutParams())).topMargin;
            int iM5545 = AbstractC3352.m5545(viewM5558) + ((ViewGroup.MarginLayoutParams) ((C3351) viewM5558.getLayoutParams())).rightMargin;
            int iM5546 = AbstractC3352.m5546(viewM5558) + ((ViewGroup.MarginLayoutParams) ((C3351) viewM5558.getLayoutParams())).bottomMargin;
            boolean z = iM5548 >= paddingRight || iM5545 >= paddingLeft;
            boolean z2 = iM5541 >= paddingBottom || iM5546 >= paddingTop;
            if (z && z2) {
                return viewM5558;
            }
            i += i3;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m7505(View view, C3913 c3913) {
        boolean zMo7498 = mo7498();
        int iM5557 = (m5557() - c3913.f10261) - 1;
        for (int iM55572 = m5557() - 2; iM55572 > iM5557; iM55572--) {
            View viewM5558 = m5558(iM55572);
            if (viewM5558 != null && viewM5558.getVisibility() != 8) {
                if (!this.f10218 || zMo7498) {
                    if (this.f10208.mo5399(view) < this.f10208.mo5399(viewM5558)) {
                        view = viewM5558;
                    }
                } else if (this.f10208.mo5396(view) > this.f10208.mo5396(viewM5558)) {
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public final void m7506(C3916 c3916, boolean z, boolean z2) {
        if (z2) {
            int i = mo7498() ? this.f7927 : this.f7928;
            this.f10211.f10281 = i == 0 || i == Integer.MIN_VALUE;
        } else {
            this.f10211.f10281 = false;
        }
        if (mo7498() || !this.f10218) {
            this.f10211.f10282 = c3916.f10270 - this.f10208.mo5405();
        } else {
            this.f10211.f10282 = (this.f10228.getWidth() - c3916.f10270) - this.f10208.mo5405();
        }
        C3918 c3918 = this.f10211;
        c3918.f10279 = c3916.f10272;
        c3918.f10283 = -1;
        c3918.f10278 = c3916.f10270;
        c3918.f10277 = Integer.MIN_VALUE;
        int i2 = c3916.f10271;
        c3918.f10280 = i2;
        if (!z || i2 <= 0) {
            return;
        }
        int size = this.f10214.size();
        int i3 = c3916.f10271;
        if (size > i3) {
            C3913 c3913 = (C3913) this.f10214.get(i3);
            C3918 c39182 = this.f10211;
            c39182.f10280--;
            c39182.f10279 -= c3913.f10261;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
    public final void m7507(int i) {
        View viewM7504 = m7504(m5557() - 1, -1);
        if (i >= (viewM7504 != null ? AbstractC3352.m5543(viewM7504) : -1)) {
            return;
        }
        int iM5557 = m5557();
        C3910 c3910 = this.f10213;
        c3910.m7542(iM5557);
        c3910.m7539(iM5557);
        c3910.m7541(iM5557);
        if (i >= c3910.f10242.length) {
            return;
        }
        this.f10225 = i;
        View viewM5558 = m5558(0);
        if (viewM5558 == null) {
            return;
        }
        this.f10209 = AbstractC3352.m5543(viewM5558);
        if (mo7498() || !this.f10218) {
            this.f10205 = this.f10208.mo5396(viewM5558) - this.f10208.mo5405();
        } else {
            this.f10205 = this.f10208.mo5403() + this.f10208.mo5399(viewM5558);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public final void m7508(C3916 c3916, boolean z, boolean z2) {
        int i;
        if (z2) {
            int i2 = mo7498() ? this.f7927 : this.f7928;
            this.f10211.f10281 = i2 == 0 || i2 == Integer.MIN_VALUE;
        } else {
            this.f10211.f10281 = false;
        }
        if (mo7498() || !this.f10218) {
            this.f10211.f10282 = this.f10208.mo5404() - c3916.f10270;
        } else {
            this.f10211.f10282 = c3916.f10270 - getPaddingRight();
        }
        C3918 c3918 = this.f10211;
        c3918.f10279 = c3916.f10272;
        c3918.f10283 = 1;
        c3918.f10278 = c3916.f10270;
        c3918.f10277 = Integer.MIN_VALUE;
        c3918.f10280 = c3916.f10271;
        if (!z || this.f10214.size() <= 1 || (i = c3916.f10271) < 0 || i >= this.f10214.size() - 1) {
            return;
        }
        C3913 c3913 = (C3913) this.f10214.get(c3916.f10271);
        C3918 c39182 = this.f10211;
        c39182.f10280++;
        c39182.f10279 += c3913.f10261;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final int m7509(C3358 c3358) {
        if (m5557() == 0) {
            return 0;
        }
        int iM5585 = c3358.m5585();
        View viewM7512 = m7512(iM5585);
        View viewM7502 = m7502(iM5585);
        if (c3358.m5585() == 0 || viewM7512 == null || viewM7502 == null) {
            return 0;
        }
        int iM5543 = AbstractC3352.m5543(viewM7512);
        int iM55432 = AbstractC3352.m5543(viewM7502);
        int iAbs = Math.abs(this.f10208.mo5399(viewM7502) - this.f10208.mo5396(viewM7512));
        int i = this.f10213.f10242[iM5543];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (iAbs / ((r3[iM55432] - i) + 1))) + (this.f10208.mo5405() - this.f10208.mo5396(viewM7512)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final int m7510(C3358 c3358) {
        if (m5557() == 0) {
            return 0;
        }
        int iM5585 = c3358.m5585();
        m7514();
        View viewM7512 = m7512(iM5585);
        View viewM7502 = m7502(iM5585);
        if (c3358.m5585() == 0 || viewM7512 == null || viewM7502 == null) {
            return 0;
        }
        return Math.min(this.f10208.mo5406(), this.f10208.mo5399(viewM7502) - this.f10208.mo5396(viewM7512));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final int m7511(C3364 c3364, C3358 c3358, C3918 c3918) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Rect rect;
        int i8;
        int i9;
        Rect rect2;
        int i10;
        boolean z2;
        int i11;
        int i12;
        Rect rect3;
        int i13;
        int i14 = c3918.f10277;
        if (i14 != Integer.MIN_VALUE) {
            int i15 = c3918.f10282;
            if (i15 < 0) {
                c3918.f10277 = i14 + i15;
            }
            m7515(c3364, c3918);
        }
        int i16 = c3918.f10282;
        boolean zMo7498 = mo7498();
        int i17 = i16;
        int i18 = 0;
        while (true) {
            if (i17 <= 0 && !this.f10211.f10281) {
                break;
            }
            List list = this.f10214;
            int i19 = c3918.f10279;
            if (i19 < 0 || i19 >= c3358.m5585() || (i = c3918.f10280) < 0 || i >= list.size()) {
                break;
            }
            C3913 c3913 = (C3913) this.f10214.get(c3918.f10280);
            c3918.f10279 = c3913.f10259;
            boolean zMo74982 = mo7498();
            C3916 c3916 = this.f10212;
            Rect rect4 = f10204;
            C3910 c3910 = this.f10213;
            if (zMo74982) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i20 = this.f7926;
                int i21 = c3918.f10278;
                if (c3918.f10283 == -1) {
                    i21 -= c3913.f10262;
                }
                int i22 = i21;
                int i23 = c3918.f10279;
                float f = c3916.f10269;
                float f2 = paddingLeft - f;
                float measuredWidth = (i20 - paddingRight) - f;
                float fMax = Math.max(0.0f, 0.0f);
                int i24 = c3913.f10261;
                i2 = i16;
                int i25 = i23;
                int i26 = 0;
                while (i25 < i23 + i24) {
                    int i27 = i23;
                    View viewMo7478 = mo7478(i25);
                    if (viewMo7478 == null) {
                        i13 = i27;
                        z2 = zMo7498;
                        i11 = i24;
                        i12 = i25;
                        rect3 = rect4;
                    } else {
                        z2 = zMo7498;
                        if (c3918.f10283 == 1) {
                            m5574(rect4, viewMo7478);
                            m5575(viewMo7478);
                        } else {
                            m5574(rect4, viewMo7478);
                            m5573(viewMo7478, i26, false);
                            i26++;
                        }
                        int i28 = i26;
                        float f3 = measuredWidth;
                        long j = c3910.f10241[i25];
                        int i29 = (int) j;
                        int i30 = (int) (j >> 32);
                        if (m7517(viewMo7478, i29, i30, (LayoutParams) viewMo7478.getLayoutParams())) {
                            viewMo7478.measure(i29, i30);
                        }
                        float f4 = f2 + ((ViewGroup.MarginLayoutParams) r6).leftMargin + ((C3351) viewMo7478.getLayoutParams()).f7922.left;
                        float f5 = f3 - (((ViewGroup.MarginLayoutParams) r6).rightMargin + ((C3351) viewMo7478.getLayoutParams()).f7922.right);
                        int i31 = i22 + ((C3351) viewMo7478.getLayoutParams()).f7922.top;
                        boolean z3 = this.f10218;
                        i11 = i24;
                        C3910 c39102 = this.f10213;
                        if (z3) {
                            i12 = i25;
                            rect3 = rect4;
                            i13 = i27;
                            c39102.m7535(viewMo7478, c3913, Math.round(f5) - viewMo7478.getMeasuredWidth(), i31, Math.round(f5), viewMo7478.getMeasuredHeight() + i31);
                        } else {
                            i12 = i25;
                            rect3 = rect4;
                            i13 = i27;
                            c39102.m7535(viewMo7478, c3913, Math.round(f4), i31, viewMo7478.getMeasuredWidth() + Math.round(f4), viewMo7478.getMeasuredHeight() + i31);
                        }
                        float measuredWidth2 = viewMo7478.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).rightMargin + ((C3351) viewMo7478.getLayoutParams()).f7922.right + fMax + f4;
                        measuredWidth = f5 - (((viewMo7478.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).leftMargin) + ((C3351) viewMo7478.getLayoutParams()).f7922.left) + fMax);
                        f2 = measuredWidth2;
                        i26 = i28;
                    }
                    i25 = i12 + 1;
                    zMo7498 = z2;
                    i24 = i11;
                    i23 = i13;
                    rect4 = rect3;
                }
                z = zMo7498;
                c3918.f10280 += this.f10211.f10283;
                i6 = c3913.f10262;
                i5 = i17;
            } else {
                i2 = i16;
                z = zMo7498;
                Rect rect5 = rect4;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i32 = this.f7925;
                int i33 = c3918.f10278;
                if (c3918.f10283 == -1) {
                    int i34 = c3913.f10262;
                    i4 = i33 + i34;
                    i3 = i33 - i34;
                } else {
                    i3 = i33;
                    i4 = i3;
                }
                int i35 = c3918.f10279;
                float f6 = i32 - paddingBottom;
                float f7 = c3916.f10269;
                float f8 = paddingTop - f7;
                float f9 = f6 - f7;
                float fMax2 = Math.max(0.0f, 0.0f);
                int i36 = c3913.f10261;
                float measuredHeight = f9;
                int i37 = i35;
                float measuredHeight2 = f8;
                int i38 = 0;
                while (i37 < i35 + i36) {
                    int i39 = i35;
                    View viewMo74782 = mo7478(i37);
                    if (viewMo74782 == null) {
                        i7 = i17;
                        i8 = i36;
                        i9 = i39;
                        rect2 = rect5;
                        i10 = i37;
                    } else {
                        float f10 = measuredHeight2;
                        i7 = i17;
                        long j2 = c3910.f10241[i37];
                        int i40 = (int) j2;
                        int i41 = (int) (j2 >> 32);
                        if (m7517(viewMo74782, i40, i41, (LayoutParams) viewMo74782.getLayoutParams())) {
                            viewMo74782.measure(i40, i41);
                        }
                        float f11 = f10 + ((ViewGroup.MarginLayoutParams) r7).topMargin + ((C3351) viewMo74782.getLayoutParams()).f7922.top;
                        float f12 = measuredHeight - (((ViewGroup.MarginLayoutParams) r7).rightMargin + ((C3351) viewMo74782.getLayoutParams()).f7922.bottom);
                        if (c3918.f10283 == 1) {
                            rect = rect5;
                            m5574(rect, viewMo74782);
                            m5575(viewMo74782);
                        } else {
                            rect = rect5;
                            m5574(rect, viewMo74782);
                            m5573(viewMo74782, i38, false);
                            i38++;
                        }
                        int i42 = i3 + ((C3351) viewMo74782.getLayoutParams()).f7922.left;
                        int i43 = i4 - ((C3351) viewMo74782.getLayoutParams()).f7922.right;
                        Rect rect6 = rect;
                        boolean z4 = this.f10218;
                        boolean z5 = this.f10217;
                        i8 = i36;
                        C3910 c39103 = this.f10213;
                        if (!z4) {
                            i9 = i39;
                            rect2 = rect6;
                            i10 = i37;
                            if (z5) {
                                c39103.m7536(viewMo74782, c3913, z4, i42, Math.round(f12) - viewMo74782.getMeasuredHeight(), viewMo74782.getMeasuredWidth() + i42, Math.round(f12));
                            } else {
                                c39103.m7536(viewMo74782, c3913, z4, i42, Math.round(f11), viewMo74782.getMeasuredWidth() + i42, viewMo74782.getMeasuredHeight() + Math.round(f11));
                            }
                        } else if (z5) {
                            i9 = i39;
                            rect2 = rect6;
                            i10 = i37;
                            c39103.m7536(viewMo74782, c3913, z4, i43 - viewMo74782.getMeasuredWidth(), Math.round(f12) - viewMo74782.getMeasuredHeight(), i43, Math.round(f12));
                        } else {
                            i9 = i39;
                            rect2 = rect6;
                            i10 = i37;
                            c39103.m7536(viewMo74782, c3913, z4, i43 - viewMo74782.getMeasuredWidth(), Math.round(f11), i43, viewMo74782.getMeasuredHeight() + Math.round(f11));
                        }
                        measuredHeight = f12 - (((viewMo74782.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r7).bottomMargin) + ((C3351) viewMo74782.getLayoutParams()).f7922.top) + fMax2);
                        measuredHeight2 = viewMo74782.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r7).topMargin + ((C3351) viewMo74782.getLayoutParams()).f7922.bottom + fMax2 + f11;
                    }
                    i37 = i10 + 1;
                    i17 = i7;
                    i36 = i8;
                    i35 = i9;
                    rect5 = rect2;
                }
                i5 = i17;
                c3918.f10280 += this.f10211.f10283;
                i6 = c3913.f10262;
            }
            i18 += i6;
            if (z || !this.f10218) {
                c3918.f10278 += c3913.f10262 * c3918.f10283;
            } else {
                c3918.f10278 -= c3913.f10262 * c3918.f10283;
            }
            i17 = i5 - c3913.f10262;
            i16 = i2;
            zMo7498 = z;
        }
        int i44 = i16;
        int i45 = c3918.f10282 - i18;
        c3918.f10282 = i45;
        int i46 = c3918.f10277;
        if (i46 != Integer.MIN_VALUE) {
            int i47 = i46 + i18;
            c3918.f10277 = i47;
            if (i45 < 0) {
                c3918.f10277 = i47 + i45;
            }
            m7515(c3364, c3918);
        }
        return i44 - c3918.f10282;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public final View m7512(int i) {
        View viewM7500 = m7500(0, m5557(), i);
        if (viewM7500 == null) {
            return null;
        }
        int i2 = this.f10213.f10242[AbstractC3352.m5543(viewM7500)];
        if (i2 == -1) {
            return null;
        }
        return m7503(viewM7500, (C3913) this.f10214.get(i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public final int m7513(C3358 c3358) {
        if (m5557() != 0) {
            int iM5585 = c3358.m5585();
            View viewM7512 = m7512(iM5585);
            View viewM7502 = m7502(iM5585);
            if (c3358.m5585() != 0 && viewM7512 != null && viewM7502 != null) {
                View viewM7504 = m7504(0, m5557());
                int iM5543 = viewM7504 == null ? -1 : AbstractC3352.m5543(viewM7504);
                return (int) ((Math.abs(this.f10208.mo5399(viewM7502) - this.f10208.mo5396(viewM7512)) / (((m7504(m5557() - 1, -1) != null ? AbstractC3352.m5543(r4) : -1) - iM5543) + 1)) * c3358.m5585());
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public final void m7514() {
        if (this.f10208 != null) {
            return;
        }
        boolean zMo7498 = mo7498();
        int i = this.f10221;
        if (zMo7498) {
            if (i == 0) {
                this.f10208 = new C3289(this, 0);
                this.f10207 = new C3289(this, 1);
                return;
            } else {
                this.f10208 = new C3289(this, 1);
                this.f10207 = new C3289(this, 0);
                return;
            }
        }
        if (i == 0) {
            this.f10208 = new C3289(this, 1);
            this.f10207 = new C3289(this, 0);
        } else {
            this.f10208 = new C3289(this, 0);
            this.f10207 = new C3289(this, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7515(C3364 c3364, C3918 c3918) {
        int iM5557;
        int i;
        int iM55572;
        int i2;
        View viewM5558;
        int i3;
        if (c3918.f10285) {
            int i4 = c3918.f10283;
            int i5 = c3918.f10277;
            C3910 c3910 = this.f10213;
            int i6 = -1;
            if (i4 == -1) {
                if (i5 < 0 || (iM55572 = m5557()) == 0 || (viewM5558 = m5558(iM55572 - 1)) == null || (i3 = c3910.f10242[AbstractC3352.m5543(viewM5558)]) == -1) {
                    return;
                }
                C3913 c3913 = (C3913) this.f10214.get(i3);
                int i7 = i2;
                while (true) {
                    if (i7 < 0) {
                        break;
                    }
                    View viewM55582 = m5558(i7);
                    if (viewM55582 != null) {
                        int i8 = c3918.f10277;
                        if (!mo7498() && this.f10218) {
                            if (this.f10208.mo5399(viewM55582) > i8) {
                                break;
                            }
                        } else {
                            if (this.f10208.mo5396(viewM55582) < this.f10208.mo5395() - i8) {
                                break;
                            }
                            if (c3913.f10259 != AbstractC3352.m5543(viewM55582)) {
                                continue;
                            } else if (i3 <= 0) {
                                iM55572 = i7;
                                break;
                            } else {
                                i3 += c3918.f10283;
                                c3913 = (C3913) this.f10214.get(i3);
                                iM55572 = i7;
                            }
                        }
                    }
                    i7--;
                }
                while (i2 >= iM55572) {
                    View viewM55583 = m5558(i2);
                    if (m5558(i2) != null) {
                        this.f7939.m5506(i2);
                    }
                    c3364.m5601(viewM55583);
                    i2--;
                }
                return;
            }
            if (i5 >= 0 && (iM5557 = m5557()) != 0) {
                int i9 = 0;
                View viewM55584 = m5558(0);
                if (viewM55584 == null || (i = c3910.f10242[AbstractC3352.m5543(viewM55584)]) == -1) {
                    return;
                }
                C3913 c39132 = (C3913) this.f10214.get(i);
                while (i9 < iM5557) {
                    View viewM55585 = m5558(i9);
                    if (viewM55585 != null) {
                        int i10 = c3918.f10277;
                        if (mo7498() || !this.f10218) {
                            if (this.f10208.mo5399(viewM55585) > i10) {
                                break;
                            }
                            if (c39132.f10260 != AbstractC3352.m5543(viewM55585)) {
                                continue;
                            } else {
                                if (i >= this.f10214.size() - 1) {
                                    break;
                                }
                                i += c3918.f10283;
                                c39132 = (C3913) this.f10214.get(i);
                                i6 = i9;
                            }
                        } else {
                            if (this.f10208.mo5395() - this.f10208.mo5396(viewM55585) > i10) {
                                break;
                            }
                            if (c39132.f10260 != AbstractC3352.m5543(viewM55585)) {
                            }
                        }
                    }
                    i9++;
                }
                i9 = i6;
                while (i9 >= 0) {
                    View viewM55586 = m5558(i9);
                    if (m5558(i9) != null) {
                        this.f7939.m5506(i9);
                    }
                    c3364.m5601(viewM55586);
                    i9--;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final int m7516(int i) {
        if (m5557() == 0 || i == 0) {
            return 0;
        }
        m7514();
        boolean zMo7498 = mo7498();
        View view = this.f10228;
        int width = zMo7498 ? view.getWidth() : view.getHeight();
        int i2 = zMo7498 ? this.f7926 : this.f7925;
        int layoutDirection = this.f7937.getLayoutDirection();
        C3916 c3916 = this.f10212;
        if (layoutDirection == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i2 + c3916.f10269) - width, iAbs);
            }
            int i3 = c3916.f10269;
            if (i3 + i > 0) {
                return -i3;
            }
        } else {
            if (i > 0) {
                return Math.min((i2 - c3916.f10269) - width, i);
            }
            int i4 = c3916.f10269;
            if (i4 + i < 0) {
                return -i4;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public final boolean m7517(View view, int i, int i2, LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && this.f7933 && m7499(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m7499(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public final void m7518(int i) {
        if (this.f10222 != i) {
            m5566();
            this.f10222 = i;
            this.f10208 = null;
            this.f10207 = null;
            this.f10214.clear();
            C3916 c3916 = this.f10212;
            C3916.m7545(c3916);
            c3916.f10269 = 0;
            m5561();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public final int m7519(int i, C3364 c3364, C3358 c3358, boolean z) {
        int iM7520;
        int iMo5405;
        if (mo7498() || !this.f10218) {
            int iMo54052 = i - this.f10208.mo5405();
            if (iMo54052 <= 0) {
                return 0;
            }
            iM7520 = -m7520(iMo54052, c3364, c3358);
        } else {
            int iMo5404 = this.f10208.mo5404() - i;
            if (iMo5404 <= 0) {
                return 0;
            }
            iM7520 = m7520(-iMo5404, c3364, c3358);
        }
        int i2 = i + iM7520;
        if (!z || (iMo5405 = i2 - this.f10208.mo5405()) <= 0) {
            return iM7520;
        }
        this.f10208.mo5402(-iMo5405);
        return iM7520 - iMo5405;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e7  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m7520(int i, C3364 c3364, C3358 c3358) {
        int iM7511;
        int i2;
        if (m5557() != 0 && i != 0) {
            m7514();
            this.f10211.f10285 = true;
            boolean z = !mo7498() && this.f10218;
            int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
            int iAbs = Math.abs(i);
            this.f10211.f10283 = i3;
            boolean zMo7498 = mo7498();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f7926, this.f7928);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f7925, this.f7927);
            boolean z2 = !zMo7498 && this.f10218;
            C3910 c3910 = this.f10213;
            if (i3 == 1) {
                View viewM5558 = m5558(m5557() - 1);
                if (viewM5558 != null) {
                    this.f10211.f10278 = this.f10208.mo5399(viewM5558);
                    int iM5543 = AbstractC3352.m5543(viewM5558);
                    View viewM7505 = m7505(viewM5558, (C3913) this.f10214.get(c3910.f10242[iM5543]));
                    C3918 c3918 = this.f10211;
                    c3918.getClass();
                    int i4 = iM5543 + 1;
                    c3918.f10279 = i4;
                    int[] iArr = c3910.f10242;
                    if (iArr.length <= i4) {
                        c3918.f10280 = -1;
                    } else {
                        c3918.f10280 = iArr[i4];
                    }
                    AbstractC3290 abstractC3290 = this.f10208;
                    if (z2) {
                        c3918.f10278 = abstractC3290.mo5396(viewM7505);
                        this.f10211.f10277 = this.f10208.mo5405() + (-this.f10208.mo5396(viewM7505));
                        C3918 c39182 = this.f10211;
                        c39182.f10277 = Math.max(c39182.f10277, 0);
                    } else {
                        c3918.f10278 = abstractC3290.mo5399(viewM7505);
                        this.f10211.f10277 = this.f10208.mo5399(viewM7505) - this.f10208.mo5404();
                    }
                    int i5 = this.f10211.f10280;
                    if ((i5 == -1 || i5 > this.f10214.size() - 1) && this.f10211.f10279 <= this.f10215.m5585()) {
                        C3918 c39183 = this.f10211;
                        int i6 = iAbs - c39183.f10277;
                        C3912 c3912 = this.f10226;
                        c3912.f10247 = null;
                        c3912.f10248 = 0;
                        if (i6 > 0) {
                            C3910 c39102 = this.f10213;
                            if (zMo7498) {
                                c39102.m7526(c3912, iMakeMeasureSpec, iMakeMeasureSpec2, i6, c39183.f10279, -1, this.f10214);
                            } else {
                                c39102.m7526(c3912, iMakeMeasureSpec2, iMakeMeasureSpec, i6, c39183.f10279, -1, this.f10214);
                                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                                iMakeMeasureSpec = iMakeMeasureSpec;
                            }
                            c3910.m7537(iMakeMeasureSpec, iMakeMeasureSpec2, this.f10211.f10279);
                            c3910.m7530(this.f10211.f10279);
                        }
                    }
                    C3918 c39184 = this.f10211;
                    c39184.f10282 = iAbs - c39184.f10277;
                }
                C3918 c39185 = this.f10211;
                iM7511 = m7511(c3364, c3358, c39185) + c39185.f10277;
                if (iM7511 >= 0) {
                    if (z) {
                        i2 = iAbs > iM7511 ? (-i3) * iM7511 : i;
                    } else if (iAbs > iM7511) {
                        i2 = i3 * iM7511;
                    }
                    this.f10208.mo5402(-i2);
                    this.f10211.f10284 = i2;
                    return i2;
                }
            } else {
                View viewM55582 = m5558(0);
                if (viewM55582 != null) {
                    this.f10211.f10278 = this.f10208.mo5396(viewM55582);
                    int iM55432 = AbstractC3352.m5543(viewM55582);
                    View viewM7503 = m7503(viewM55582, (C3913) this.f10214.get(c3910.f10242[iM55432]));
                    C3918 c39186 = this.f10211;
                    c39186.getClass();
                    int i7 = c3910.f10242[iM55432];
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        this.f10211.f10279 = iM55432 - ((C3913) this.f10214.get(i7 - 1)).f10261;
                    } else {
                        c39186.f10279 = -1;
                    }
                    C3918 c39187 = this.f10211;
                    c39187.f10280 = i7 > 0 ? i7 - 1 : 0;
                    AbstractC3290 abstractC32902 = this.f10208;
                    if (z2) {
                        c39187.f10278 = abstractC32902.mo5399(viewM7503);
                        this.f10211.f10277 = this.f10208.mo5399(viewM7503) - this.f10208.mo5404();
                        C3918 c39188 = this.f10211;
                        c39188.f10277 = Math.max(c39188.f10277, 0);
                    } else {
                        c39187.f10278 = abstractC32902.mo5396(viewM7503);
                        this.f10211.f10277 = this.f10208.mo5405() + (-this.f10208.mo5396(viewM7503));
                    }
                    C3918 c391842 = this.f10211;
                    c391842.f10282 = iAbs - c391842.f10277;
                }
                C3918 c391852 = this.f10211;
                iM7511 = m7511(c3364, c3358, c391852) + c391852.f10277;
                if (iM7511 >= 0) {
                }
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final int mo5171(int i, C3364 c3364, C3358 c3358) {
        if (!mo7498() || this.f10221 == 0) {
            int iM7520 = m7520(i, c3364, c3358);
            this.f10223.clear();
            return iM7520;
        }
        int iM7516 = m7516(i);
        this.f10212.f10269 += iM7516;
        this.f10207.mo5402(-iM7516);
        return iM7516;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final void mo5226(int i) {
        this.f10209 = i;
        this.f10205 = Integer.MIN_VALUE;
        SavedState savedState = this.f10210;
        if (savedState != null) {
            savedState.f10239 = -1;
        }
        m5561();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪 */
    public final void mo5227(RecyclerView recyclerView, int i) {
        C3292 c3292 = new C3292(recyclerView.getContext());
        c3292.f7662 = i;
        m5565(c3292);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final Parcelable mo5229() {
        SavedState savedState = this.f10210;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f10239 = savedState.f10239;
            savedState2.f10238 = savedState.f10238;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (m5557() <= 0) {
            savedState3.f10239 = -1;
            return savedState3;
        }
        View viewM5558 = m5558(0);
        savedState3.f10239 = AbstractC3352.m5543(viewM5558);
        savedState3.f10238 = this.f10208.mo5396(viewM5558) - this.f10208.mo5405();
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final int mo5175(int i, C3364 c3364, C3358 c3358) {
        if (mo7498() || (this.f10221 == 0 && !mo7498())) {
            int iM7520 = m7520(i, c3364, c3358);
            this.f10223.clear();
            return iM7520;
        }
        int iM7516 = m7516(i);
        this.f10212.f10269 += iM7516;
        this.f10207.mo5402(-iM7516);
        return iM7516;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final View mo7478(int i) {
        View view = (View) this.f10223.get(i);
        return view != null ? view : this.f10216.m5591(i);
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo7479(int i, int i2, int i3) {
        return AbstractC3352.m5549(mo5236(), this.f7926, this.f7928, i2, i3);
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final View mo7480(int i) {
        return mo7478(i);
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo7482(View view, int i, int i2, C3913 c3913) {
        m5574(f10204, view);
        if (mo7498()) {
            int i3 = ((C3351) view.getLayoutParams()).f7922.left + ((C3351) view.getLayoutParams()).f7922.right;
            c3913.f10250 += i3;
            c3913.f10249 += i3;
        } else {
            int i4 = ((C3351) view.getLayoutParams()).f7922.top + ((C3351) view.getLayoutParams()).f7922.bottom;
            c3913.f10250 += i4;
            c3913.f10249 += i4;
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC3355
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final PointF mo5230(int i) {
        View viewM5558;
        if (m5557() == 0 || (viewM5558 = m5558(0)) == null) {
            return null;
        }
        int i2 = i < AbstractC3352.m5543(viewM5558) ? -1 : 1;
        return mo7498() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo5176(C3358 c3358) {
        return m7509(c3358);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo5177(C3358 c3358) {
        return m7513(c3358);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final int mo5233(C3358 c3358) {
        return m7510(c3358);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo5235() {
        if (this.f10221 == 0) {
            return !mo7498();
        }
        if (!mo7498()) {
            int i = this.f7925;
            View view = this.f10228;
            if (i <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo5178(C3351 c3351) {
        return c3351 instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final boolean mo5236() {
        if (this.f10221 == 0) {
            return mo7498();
        }
        if (!mo7498()) {
            return true;
        }
        int i = this.f7926;
        View view = this.f10228;
        return i > (view != null ? view.getWidth() : 0);
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final int mo7493(int i, int i2, int i3) {
        return AbstractC3352.m5549(mo5235(), this.f7925, this.f7927, i2, i3);
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo7494(View view, int i, int i2) {
        int i3;
        int i4;
        if (mo7498()) {
            i3 = ((C3351) view.getLayoutParams()).f7922.left;
            i4 = ((C3351) view.getLayoutParams()).f7922.right;
        } else {
            i3 = ((C3351) view.getLayoutParams()).f7922.top;
            i4 = ((C3351) view.getLayoutParams()).f7922.bottom;
        }
        return i3 + i4;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final int mo7495(View view) {
        int i;
        int i2;
        if (mo7498()) {
            i = ((C3351) view.getLayoutParams()).f7922.top;
            i2 = ((C3351) view.getLayoutParams()).f7922.bottom;
        } else {
            i = ((C3351) view.getLayoutParams()).f7922.left;
            i2 = ((C3351) view.getLayoutParams()).f7922.right;
        }
        return i + i2;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo7497(View view, int i) {
        this.f10223.put(i, view);
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo7498() {
        int i = this.f10222;
        return i == 0 || i == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final void mo5576(RecyclerView recyclerView) {
        this.f10228 = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final void mo5344(AbstractC3283 abstractC3283) {
        m5566();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e8  */
    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo5180(C3364 c3364, C3358 c3358) {
        int i;
        View viewM5558;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        this.f10216 = c3364;
        this.f10215 = c3358;
        int iM5585 = c3358.m5585();
        if (iM5585 == 0 && c3358.f7962) {
            return;
        }
        int layoutDirection = this.f7937.getLayoutDirection();
        int i6 = this.f10222;
        int i7 = this.f10221;
        if (i6 == 0) {
            this.f10218 = layoutDirection == 1;
            this.f10217 = i7 == 2;
        } else if (i6 == 1) {
            this.f10218 = layoutDirection != 1;
            this.f10217 = i7 == 2;
        } else if (i6 == 2) {
            boolean z3 = layoutDirection == 1;
            this.f10218 = z3;
            if (i7 == 2) {
                this.f10218 = !z3;
            }
            this.f10217 = false;
        } else if (i6 != 3) {
            this.f10218 = false;
            this.f10217 = false;
        } else {
            boolean z4 = layoutDirection == 1;
            this.f10218 = z4;
            if (i7 == 2) {
                this.f10218 = !z4;
            }
            this.f10217 = true;
        }
        m7514();
        if (this.f10211 == null) {
            C3918 c3918 = new C3918();
            c3918.f10283 = 1;
            this.f10211 = c3918;
        }
        C3910 c3910 = this.f10213;
        c3910.m7542(iM5585);
        c3910.m7539(iM5585);
        c3910.m7541(iM5585);
        this.f10211.f10285 = false;
        SavedState savedState = this.f10210;
        if (savedState != null && (i5 = savedState.f10239) >= 0 && i5 < iM5585) {
            this.f10209 = i5;
        }
        C3916 c3916 = this.f10212;
        if (!c3916.f10267 || this.f10209 != -1 || savedState != null) {
            C3916.m7545(c3916);
            SavedState savedState2 = this.f10210;
            if (c3358.f7962 || (i = this.f10209) == -1) {
                if (m5557() != 0) {
                    View viewM7502 = c3916.f10268 ? m7502(c3358.m5585()) : m7512(c3358.m5585());
                    if (viewM7502 != null) {
                        FlexboxLayoutManager flexboxLayoutManager = c3916.f10273;
                        AbstractC3290 abstractC3290 = flexboxLayoutManager.f10221 == 0 ? flexboxLayoutManager.f10207 : flexboxLayoutManager.f10208;
                        if (flexboxLayoutManager.mo7498() || !flexboxLayoutManager.f10218) {
                            if (c3916.f10268) {
                                c3916.f10270 = abstractC3290.m5410() + abstractC3290.mo5399(viewM7502);
                            } else {
                                c3916.f10270 = abstractC3290.mo5396(viewM7502);
                            }
                        } else if (c3916.f10268) {
                            c3916.f10270 = abstractC3290.m5410() + abstractC3290.mo5396(viewM7502);
                        } else {
                            c3916.f10270 = abstractC3290.mo5399(viewM7502);
                        }
                        int iM5543 = AbstractC3352.m5543(viewM7502);
                        c3916.f10272 = iM5543;
                        c3916.f10274 = false;
                        int[] iArr = flexboxLayoutManager.f10213.f10242;
                        if (iM5543 == -1) {
                            iM5543 = 0;
                        }
                        int i8 = iArr[iM5543];
                        if (i8 == -1) {
                            i8 = 0;
                        }
                        c3916.f10271 = i8;
                        int size = flexboxLayoutManager.f10214.size();
                        int i9 = c3916.f10271;
                        if (size > i9) {
                            c3916.f10272 = ((C3913) flexboxLayoutManager.f10214.get(i9)).f10259;
                        }
                    } else {
                        C3916.m7546(c3916);
                        c3916.f10272 = 0;
                        c3916.f10271 = 0;
                    }
                    c3916.f10267 = true;
                }
            } else if (i < 0 || i >= c3358.m5585()) {
                this.f10209 = -1;
                this.f10205 = Integer.MIN_VALUE;
                if (m5557() != 0) {
                }
            } else {
                int i10 = this.f10209;
                c3916.f10272 = i10;
                c3916.f10271 = c3910.f10242[i10];
                SavedState savedState3 = this.f10210;
                if (savedState3 != null) {
                    int iM55852 = c3358.m5585();
                    int i11 = savedState3.f10239;
                    if (i11 >= 0 && i11 < iM55852) {
                        c3916.f10270 = this.f10208.mo5405() + savedState2.f10238;
                        c3916.f10274 = true;
                        c3916.f10271 = -1;
                    } else if (this.f10205 == Integer.MIN_VALUE) {
                        View viewMo5204 = mo5204(this.f10209);
                        if (viewMo5204 == null) {
                            if (m5557() > 0 && (viewM5558 = m5558(0)) != null) {
                                c3916.f10268 = this.f10209 < AbstractC3352.m5543(viewM5558);
                            }
                            C3916.m7546(c3916);
                        } else if (this.f10208.mo5398(viewMo5204) > this.f10208.mo5406()) {
                            C3916.m7546(c3916);
                        } else {
                            int iMo5396 = this.f10208.mo5396(viewMo5204) - this.f10208.mo5405();
                            AbstractC3290 abstractC32902 = this.f10208;
                            if (iMo5396 < 0) {
                                c3916.f10270 = abstractC32902.mo5405();
                                c3916.f10268 = false;
                            } else if (abstractC32902.mo5404() - this.f10208.mo5399(viewMo5204) < 0) {
                                c3916.f10270 = this.f10208.mo5404();
                                c3916.f10268 = true;
                            } else {
                                boolean z5 = c3916.f10268;
                                AbstractC3290 abstractC32903 = this.f10208;
                                c3916.f10270 = z5 ? this.f10208.m5410() + abstractC32903.mo5399(viewMo5204) : abstractC32903.mo5396(viewMo5204);
                            }
                        }
                    } else if (mo7498() || !this.f10218) {
                        c3916.f10270 = this.f10208.mo5405() + this.f10205;
                    } else {
                        c3916.f10270 = this.f10205 - this.f10208.mo5403();
                    }
                    c3916.f10267 = true;
                }
            }
        }
        m5556(c3364);
        if (c3916.f10268) {
            m7506(c3916, false, true);
        } else {
            m7508(c3916, false, true);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f7926, this.f7928);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f7925, this.f7927);
        int i12 = this.f7926;
        int i13 = this.f7925;
        boolean zMo7498 = mo7498();
        Context context = this.f10227;
        if (zMo7498) {
            int i14 = this.f10206;
            z = (i14 == Integer.MIN_VALUE || i14 == i12) ? false : true;
            C3918 c39182 = this.f10211;
            i2 = c39182.f10281 ? context.getResources().getDisplayMetrics().heightPixels : c39182.f10282;
        } else {
            int i15 = this.f10224;
            z = (i15 == Integer.MIN_VALUE || i15 == i13) ? false : true;
            C3918 c39183 = this.f10211;
            i2 = c39183.f10281 ? context.getResources().getDisplayMetrics().widthPixels : c39183.f10282;
        }
        int i16 = i2;
        this.f10206 = i12;
        this.f10224 = i13;
        int i17 = this.f10225;
        C3912 c3912 = this.f10226;
        if (i17 != -1 || (this.f10209 == -1 && !z)) {
            int iMin = c3916.f10272;
            if (i17 != -1) {
                iMin = Math.min(i17, iMin);
            }
            c3912.f10247 = null;
            c3912.f10248 = 0;
            boolean zMo74982 = mo7498();
            List list = this.f10214;
            if (zMo74982) {
                if (list.size() > 0) {
                    c3910.m7524(iMin, this.f10214);
                    this.f10213.m7526(this.f10226, iMakeMeasureSpec, iMakeMeasureSpec2, i16, iMin, c3916.f10272, this.f10214);
                } else {
                    c3910.m7541(iM5585);
                    this.f10213.m7526(this.f10226, iMakeMeasureSpec, iMakeMeasureSpec2, i16, 0, -1, this.f10214);
                }
            } else if (list.size() > 0) {
                c3910.m7524(iMin, this.f10214);
                int i18 = iMin;
                this.f10213.m7526(this.f10226, iMakeMeasureSpec2, iMakeMeasureSpec, i16, i18, c3916.f10272, this.f10214);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                iMin = i18;
            } else {
                c3910.m7541(iM5585);
                this.f10213.m7526(this.f10226, iMakeMeasureSpec2, iMakeMeasureSpec, i16, 0, -1, this.f10214);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.f10214 = c3912.f10247;
            c3910.m7537(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
            c3910.m7530(iMin);
        } else if (!c3916.f10268) {
            this.f10214.clear();
            c3912.f10247 = null;
            c3912.f10248 = 0;
            boolean zMo74983 = mo7498();
            int i19 = c3916.f10272;
            C3910 c39102 = this.f10213;
            C3912 c39122 = this.f10226;
            if (zMo74983) {
                c39102.m7526(c39122, iMakeMeasureSpec, iMakeMeasureSpec2, i16, 0, i19, this.f10214);
            } else {
                c39102.m7526(c39122, iMakeMeasureSpec2, iMakeMeasureSpec, i16, 0, i19, this.f10214);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.f10214 = c3912.f10247;
            c3910.m7537(iMakeMeasureSpec, iMakeMeasureSpec2, 0);
            c3910.m7530(0);
            int i20 = c3910.f10242[c3916.f10272];
            c3916.f10271 = i20;
            this.f10211.f10280 = i20;
        }
        m7511(c3364, c3358, this.f10211);
        boolean z6 = c3916.f10268;
        C3918 c39184 = this.f10211;
        if (z6) {
            i4 = c39184.f10278;
            z2 = true;
            m7508(c3916, true, false);
            m7511(c3364, c3358, this.f10211);
            i3 = this.f10211.f10278;
        } else {
            z2 = true;
            i3 = c39184.f10278;
            m7506(c3916, true, false);
            m7511(c3364, c3358, this.f10211);
            i4 = this.f10211.f10278;
        }
        if (m5557() > 0) {
            if (c3916.f10268) {
                m7519(m7501(i3, c3364, c3358, z2) + i4, c3364, c3358, false);
            } else {
                m7501(m7519(i4, c3364, c3358, z2) + i3, c3364, c3358, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public final void mo5181(RecyclerView recyclerView, int i, int i2) {
        m7507(i);
        m7507(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo5239(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f10210 = (SavedState) parcelable;
            m5561();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public final void mo5182(C3358 c3358) {
        this.f10210 = null;
        this.f10209 = -1;
        this.f10205 = Integer.MIN_VALUE;
        this.f10225 = -1;
        C3916.m7545(this.f10212);
        this.f10223.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo5183(int i, int i2) {
        m7507(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final void mo5577(int i) {
        m7507(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final void mo5184(int i, int i2) {
        m7507(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final void mo5186(int i, int i2) {
        m7507(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final boolean mo5241() {
        return true;
    }

    @Override // com.google.android.flexbox.InterfaceC3914
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7481(C3913 c3913) {
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo5238(RecyclerView recyclerView) {
    }
}

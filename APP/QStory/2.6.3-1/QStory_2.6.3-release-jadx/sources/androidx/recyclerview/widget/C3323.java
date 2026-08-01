package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3323 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7630 = parcel.readInt();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7628 = parcel.readInt();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7627 = parcel.readInt() == 1;
        int i = parcel.readInt();
        if (i > 0) {
            int[] iArr = new int[i];
            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7629 = iArr;
            parcel.readIntArray(iArr);
        }
        return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i];
    }
}

package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3320 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager.SavedState savedState = new StaggeredGridLayoutManager.SavedState();
        savedState.f7640 = parcel.readInt();
        savedState.f7638 = parcel.readInt();
        int i = parcel.readInt();
        savedState.f7639 = i;
        if (i > 0) {
            int[] iArr = new int[i];
            savedState.f7633 = iArr;
            parcel.readIntArray(iArr);
        }
        int i2 = parcel.readInt();
        savedState.f7632 = i2;
        if (i2 > 0) {
            int[] iArr2 = new int[i2];
            savedState.f7636 = iArr2;
            parcel.readIntArray(iArr2);
        }
        savedState.f7634 = parcel.readInt() == 1;
        savedState.f7635 = parcel.readInt() == 1;
        savedState.f7631 = parcel.readInt() == 1;
        savedState.f7637 = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new StaggeredGridLayoutManager.SavedState[i];
    }
}

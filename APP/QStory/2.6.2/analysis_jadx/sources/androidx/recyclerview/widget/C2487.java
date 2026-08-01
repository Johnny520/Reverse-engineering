package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2487 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager.SavedState savedState = new StaggeredGridLayoutManager.SavedState();
        savedState.f7294 = parcel.readInt();
        savedState.f7292 = parcel.readInt();
        int i = parcel.readInt();
        savedState.f7293 = i;
        if (i > 0) {
            int[] iArr = new int[i];
            savedState.f7287 = iArr;
            parcel.readIntArray(iArr);
        }
        int i2 = parcel.readInt();
        savedState.f7286 = i2;
        if (i2 > 0) {
            int[] iArr2 = new int[i2];
            savedState.f7290 = iArr2;
            parcel.readIntArray(iArr2);
        }
        savedState.f7288 = parcel.readInt() == 1;
        savedState.f7289 = parcel.readInt() == 1;
        savedState.f7285 = parcel.readInt() == 1;
        savedState.f7291 = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new StaggeredGridLayoutManager.SavedState[i];
    }
}

package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3301 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinearLayoutManager.SavedState savedState = new LinearLayoutManager.SavedState();
        savedState.f7515 = parcel.readInt();
        savedState.f7513 = parcel.readInt();
        savedState.f7514 = parcel.readInt() == 1;
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LinearLayoutManager.SavedState[i];
    }
}

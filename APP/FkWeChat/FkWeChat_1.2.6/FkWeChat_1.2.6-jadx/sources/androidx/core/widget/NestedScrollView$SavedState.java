package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class NestedScrollView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<NestedScrollView$SavedState> CREATOR = new C0637a();

    /* JADX INFO: renamed from: q */
    public int f1846q;

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class C0637a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NestedScrollView$SavedState createFromParcel(Parcel parcel) {
            return new NestedScrollView$SavedState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NestedScrollView$SavedState[] newArray(int i10) {
            return new NestedScrollView$SavedState[i10];
        }
    }

    public NestedScrollView$SavedState(Parcel parcel) {
        super(parcel);
        this.f1846q = parcel.readInt();
    }

    public String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1846q + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f1846q);
    }
}

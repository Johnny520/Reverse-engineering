package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0198 implements Parcelable.Creator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f797;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f797) {
            case 0:
                ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
                actionMenuPresenter$SavedState.f449 = parcel.readInt();
                return actionMenuPresenter$SavedState;
            default:
                AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(parcel);
                appCompatSpinner$SavedState.f463 = parcel.readByte() != 0;
                return appCompatSpinner$SavedState;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f797) {
            case 0:
                return new ActionMenuPresenter$SavedState[i];
            default:
                return new AppCompatSpinner$SavedState[i];
        }
    }
}

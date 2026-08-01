package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.C1282;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Parcelable f6699;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final AbsSavedState f6698 = new AnonymousClass1();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C1282(2);

    /* JADX INFO: renamed from: androidx.customview.view.AbsSavedState$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public class AnonymousClass1 extends AbsSavedState {
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f6699 = parcelable == f6698 ? null : parcelable;
        } else {
            C5925.m11310("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6699, i);
    }

    public AbsSavedState() {
        this.f6699 = null;
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f6699 = parcelable == null ? f6698 : parcelable;
    }
}

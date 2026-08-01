package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.C2117;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Parcelable f7044;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final AbsSavedState f7043 = new C02251();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C2117(2);

    /* JADX INFO: renamed from: androidx.customview.view.AbsSavedState$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public class C02251 extends AbsSavedState {
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f7044 = parcelable == f7043 ? null : parcelable;
        } else {
            C6755.m11869("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7044, i);
    }

    public AbsSavedState() {
        this.f7044 = null;
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f7044 = parcelable == null ? f7043 : parcelable;
    }
}

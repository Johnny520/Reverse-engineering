package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, m151d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;", "Landroid/os/Parcelable;", "runtime"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class ParcelableSnapshotMutableState<T> extends AbstractC2182 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new C2212();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        C2188 c2188 = C2188.f4265;
        C2188 c21882 = this.f4258;
        if (AbstractC5227.m9466(c21882, c2188)) {
            i2 = 0;
        } else if (AbstractC5227.m9466(c21882, C2188.f4267)) {
            i2 = 1;
        } else {
            if (!AbstractC5227.m9466(c21882, C2188.f4264)) {
                C6755.m11870("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}

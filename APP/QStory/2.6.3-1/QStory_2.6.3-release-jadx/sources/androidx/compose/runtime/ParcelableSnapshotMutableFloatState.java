package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.compose.runtime.snapshots.C2107;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;", "Landroidx/compose/runtime/飘花落叶言子哲苏楪世兰;", "Landroid/os/Parcelable;", "runtime"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class ParcelableSnapshotMutableFloatState extends AbstractC2184 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new C2213(1);

    public ParcelableSnapshotMutableFloatState(float f) {
        AbstractC2121 abstractC2121M2840 = AbstractC2115.m2840();
        C2163 c2163 = new C2163(f, abstractC2121M2840.mo2770());
        if (!(abstractC2121M2840 instanceof C2107)) {
            c2163.f3991 = new C2163(f, 1L);
        }
        this.f4261 = c2163;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(m2994());
    }
}

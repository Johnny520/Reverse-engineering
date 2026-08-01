package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.runtime.snapshots.C1272;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;", "Landroidx/compose/runtime/飘花落叶言子哲苏楪世兰;", "Landroid/os/Parcelable;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ParcelableSnapshotMutableFloatState extends AbstractC1349 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new C1378(1);

    public ParcelableSnapshotMutableFloatState(float f) {
        AbstractC1286 abstractC1286M2280 = AbstractC1280.m2280();
        C1328 c1328 = new C1328(f, abstractC1286M2280.mo2210());
        if (!(abstractC1286M2280 instanceof C1272)) {
            c1328.f3646 = new C1328(f, 1L);
        }
        this.f3916 = c1328;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(m2434());
    }
}

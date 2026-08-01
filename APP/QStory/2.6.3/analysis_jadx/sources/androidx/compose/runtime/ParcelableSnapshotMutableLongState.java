package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.runtime.snapshots.C1272;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;", "Landroidx/compose/runtime/飘花落叶言子哲世兰楪苏;", "Landroid/os/Parcelable;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ParcelableSnapshotMutableLongState extends AbstractC1327 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new C1378(3);

    public ParcelableSnapshotMutableLongState(long j) {
        super(1);
        AbstractC1286 abstractC1286M2280 = AbstractC1280.m2280();
        C1345 c1345 = new C1345(abstractC1286M2280.mo2210(), j);
        if (!(abstractC1286M2280 instanceof C1272)) {
            c1345.f3646 = new C1345(1L, j);
        }
        this.f3884 = c1345;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(m2397());
    }
}

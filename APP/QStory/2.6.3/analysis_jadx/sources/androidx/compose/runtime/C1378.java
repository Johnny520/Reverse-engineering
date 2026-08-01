package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.runtime.snapshots.C1272;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1378 implements Parcelable.Creator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f3983;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3983) {
            case 0:
                double d = parcel.readDouble();
                ParcelableSnapshotMutableDoubleState parcelableSnapshotMutableDoubleState = new ParcelableSnapshotMutableDoubleState(0);
                AbstractC1286 abstractC1286M2280 = AbstractC1280.m2280();
                C1331 c1331 = new C1331(abstractC1286M2280.mo2210(), d);
                if (!(abstractC1286M2280 instanceof C1272)) {
                    c1331.f3646 = new C1331(1L, d);
                }
                parcelableSnapshotMutableDoubleState.f3884 = c1331;
                return parcelableSnapshotMutableDoubleState;
            case 1:
                return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
            case 2:
                return new ParcelableSnapshotMutableIntState(parcel.readInt());
            default:
                return new ParcelableSnapshotMutableLongState(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f3983) {
            case 0:
                return new ParcelableSnapshotMutableDoubleState[i];
            case 1:
                return new ParcelableSnapshotMutableFloatState[i];
            case 2:
                return new ParcelableSnapshotMutableIntState[i];
            default:
                return new ParcelableSnapshotMutableLongState[i];
        }
    }
}

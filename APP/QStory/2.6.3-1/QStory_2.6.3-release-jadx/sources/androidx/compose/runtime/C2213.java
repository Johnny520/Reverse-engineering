package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.compose.runtime.snapshots.C2107;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2213 implements Parcelable.Creator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f4328;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4328) {
            case 0:
                double d = parcel.readDouble();
                ParcelableSnapshotMutableDoubleState parcelableSnapshotMutableDoubleState = new ParcelableSnapshotMutableDoubleState(0);
                AbstractC2121 abstractC2121M2840 = AbstractC2115.m2840();
                C2166 c2166 = new C2166(abstractC2121M2840.mo2770(), d);
                if (!(abstractC2121M2840 instanceof C2107)) {
                    c2166.f3991 = new C2166(1L, d);
                }
                parcelableSnapshotMutableDoubleState.f4229 = c2166;
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
        switch (this.f4328) {
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

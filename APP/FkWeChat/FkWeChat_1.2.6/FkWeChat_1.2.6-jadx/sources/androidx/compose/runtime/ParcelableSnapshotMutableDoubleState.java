package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m16758d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;", "Landroidx/compose/runtime/w4;", "Landroid/os/Parcelable;", _UrlKt.FRAGMENT_ENCODE_SET, "value", "<init>", "(D)V", "Landroid/os/Parcel;", "parcel", _UrlKt.FRAGMENT_ENCODE_SET, "flags", "Ll8/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "s", "b", "runtime"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class ParcelableSnapshotMutableDoubleState extends AbstractC0616w4 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableDoubleState> CREATOR = new C0443a();

    /* JADX INFO: renamed from: androidx.compose.runtime.ParcelableSnapshotMutableDoubleState$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C0443a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableDoubleState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableDoubleState(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableDoubleState[] newArray(int i10) {
            return new ParcelableSnapshotMutableDoubleState[i10];
        }
    }

    public ParcelableSnapshotMutableDoubleState(double d10) {
        super(d10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeDouble(mo1631i());
    }
}

package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m16758d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "Landroidx/compose/runtime/y4;", "Landroid/os/Parcelable;", _UrlKt.FRAGMENT_ENCODE_SET, "value", "<init>", "(I)V", "Landroid/os/Parcel;", "parcel", "flags", "Ll8/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "s", "b", "runtime"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class ParcelableSnapshotMutableIntState extends AbstractC0628y4 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new C0447a();

    /* JADX INFO: renamed from: androidx.compose.runtime.ParcelableSnapshotMutableIntState$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C0447a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableIntState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableIntState(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableIntState[] newArray(int i10) {
            return new ParcelableSnapshotMutableIntState[i10];
        }
    }

    public ParcelableSnapshotMutableIntState(int i10) {
        super(i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeInt(mo1686f());
    }
}

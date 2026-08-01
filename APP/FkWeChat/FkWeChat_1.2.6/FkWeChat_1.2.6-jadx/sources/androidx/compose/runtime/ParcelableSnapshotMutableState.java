package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p376zd.C10010p0;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0013B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m16758d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Landroidx/compose/runtime/a5;", "Landroid/os/Parcelable;", "value", "Landroidx/compose/runtime/b5;", "policy", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/b5;)V", "Landroid/os/Parcel;", "parcel", _UrlKt.FRAGMENT_ENCODE_SET, "flags", "Ll8/i0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "t", "b", "runtime"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class ParcelableSnapshotMutableState<T> extends AbstractC0459a5 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new C0451a();

    /* JADX INFO: renamed from: androidx.compose.runtime.ParcelableSnapshotMutableState$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C0451a implements Parcelable.ClassLoaderCreator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            InterfaceC0466b5 interfaceC0466b5M1572k;
            if (classLoader == null) {
                classLoader = C0451a.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i10 = parcel.readInt();
            if (i10 == 0) {
                interfaceC0466b5M1572k = AbstractC0473c5.m1572k();
            } else if (i10 == 1) {
                interfaceC0466b5M1572k = AbstractC0473c5.m1579r();
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Unsupported MutableState policy " + i10 + " was restored");
                }
                interfaceC0466b5M1572k = AbstractC0473c5.m1576o();
            }
            return new ParcelableSnapshotMutableState(value, interfaceC0466b5M1572k);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState[] newArray(int i10) {
            return new ParcelableSnapshotMutableState[i10];
        }
    }

    public ParcelableSnapshotMutableState(Object obj, InterfaceC0466b5 interfaceC0466b5) {
        super(obj, interfaceC0466b5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int i10;
        parcel.writeValue(getValue());
        InterfaceC0466b5 interfaceC0466b5Mo1518c = mo1518c();
        if (AbstractC1061t.m3842c(interfaceC0466b5Mo1518c, AbstractC0473c5.m1572k())) {
            i10 = 0;
        } else if (AbstractC1061t.m3842c(interfaceC0466b5Mo1518c, AbstractC0473c5.m1579r())) {
            i10 = 1;
        } else {
            if (!AbstractC1061t.m3842c(interfaceC0466b5Mo1518c, AbstractC0473c5.m1576o())) {
                C10010p0.m38820a("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i10 = 2;
        }
        parcel.writeInt(i10);
    }
}

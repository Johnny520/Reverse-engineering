package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.AbstractC0053;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1377 implements Parcelable.ClassLoaderCreator {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ParcelableSnapshotMutableState m2498(Parcel parcel, ClassLoader classLoader) {
        C1353 c1353;
        if (classLoader == null) {
            classLoader = C1377.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            c1353 = C1353.f3919;
        } else if (i == 1) {
            c1353 = C1353.f3921;
        } else {
            if (i != 2) {
                C5919.m11250(AbstractC0053.m161(i, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            c1353 = C1353.f3918;
        }
        return new ParcelableSnapshotMutableState(value, c1353);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m2498(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ParcelableSnapshotMutableState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m2498(parcel, classLoader);
    }
}

package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.AbstractC0900;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2212 implements Parcelable.ClassLoaderCreator {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ParcelableSnapshotMutableState m3068(Parcel parcel, ClassLoader classLoader) {
        C2188 c2188;
        if (classLoader == null) {
            classLoader = C2212.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            c2188 = C2188.f4265;
        } else if (i == 1) {
            c2188 = C2188.f4267;
        } else {
            if (i != 2) {
                C6755.m11870(AbstractC0900.m722(i, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            c2188 = C2188.f4264;
        }
        return new ParcelableSnapshotMutableState(value, c2188);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m3068(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ParcelableSnapshotMutableState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m3068(parcel, classLoader);
    }
}

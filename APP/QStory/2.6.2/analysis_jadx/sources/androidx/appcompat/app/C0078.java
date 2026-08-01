package androidx.appcompat.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0078 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return AppCompatDelegateImpl$PanelFeatureState$SavedState.m166(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AppCompatDelegateImpl$PanelFeatureState$SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return AppCompatDelegateImpl$PanelFeatureState$SavedState.m166(parcel, classLoader);
    }
}

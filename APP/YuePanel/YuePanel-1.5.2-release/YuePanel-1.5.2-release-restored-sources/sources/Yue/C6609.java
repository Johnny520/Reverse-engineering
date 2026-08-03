package Yue;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Yue.ۥۣۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C6609 {

    /* JADX INFO: renamed from: Yue.ۥۣۡۧ$ۥ */
    public static class C1030<T> implements Parcelable.ClassLoaderCreator<T> {

        /* JADX INFO: renamed from: ۥ */
        public final InterfaceC6610<T> f2172;

        public C1030(InterfaceC6610<T> interfaceC6610) {
            this.f2172 = interfaceC6610;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.f2172.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            return this.f2172.newArray(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f2172.createFromParcel(parcel, classLoader);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ */
    public static <T> Parcelable.Creator<T> m3075(InterfaceC6610<T> interfaceC6610) {
        return new C1030(interfaceC6610);
    }
}

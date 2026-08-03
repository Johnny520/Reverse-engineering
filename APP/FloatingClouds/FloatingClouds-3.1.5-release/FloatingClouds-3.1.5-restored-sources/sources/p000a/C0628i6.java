package p000a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: a.i6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0628i6 extends AbstractC0792r {
    public static final Parcelable.Creator<C0628i6> CREATOR = new a();

    /* JADX INFO: renamed from: c */
    public final C0598ge<String, Bundle> f2305c;

    /* JADX INFO: renamed from: a.i6$a */
    public class a implements Parcelable.ClassLoaderCreator<C0628i6> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final C0628i6 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C0628i6(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new C0628i6[i];
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new C0628i6(parcel, null);
        }
    }

    public C0628i6(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        C0598ge<String, Bundle> c0598ge = new C0598ge<>();
        if (i == 0) {
            c0598ge.f2219a = C0889w1.f3481i;
            c0598ge.f2220b = C0889w1.f3482j;
        } else {
            c0598ge.m1430a(i);
        }
        c0598ge.f2221c = 0;
        this.f2305c = c0598ge;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2305c.put(strArr[i2], bundleArr[i2]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f2305c + "}";
    }

    @Override // p000a.AbstractC0792r, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        C0598ge<String, Bundle> c0598ge = this.f2305c;
        int i2 = c0598ge.f2221c;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = c0598ge.m1436h(i3);
            bundleArr[i3] = c0598ge.m1438j(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}

package p000a;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: a.g9 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class C0593g9 implements Parcelable {
    public static final Parcelable.Creator<C0593g9> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    public final IntentSender f2202a;

    /* JADX INFO: renamed from: b */
    public final Intent f2203b;

    /* JADX INFO: renamed from: c */
    public final int f2204c;

    /* JADX INFO: renamed from: d */
    public final int f2205d;

    /* JADX INFO: renamed from: a.g9$a */
    public static final class a implements Parcelable.Creator<C0593g9> {
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C0593g9 createFromParcel(Parcel parcel) {
            C0631i9.m1482e(parcel, "inParcel");
            Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
            C0631i9.m1479b(parcelable);
            return new C0593g9((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C0593g9[] newArray(int i) {
            return new C0593g9[i];
        }
    }

    public C0593g9(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f2202a = intentSender;
        this.f2203b = intent;
        this.f2204c = i;
        this.f2205d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C0631i9.m1482e(parcel, "dest");
        parcel.writeParcelable(this.f2202a, i);
        parcel.writeParcelable(this.f2203b, i);
        parcel.writeInt(this.f2204c);
        parcel.writeInt(this.f2205d);
    }
}

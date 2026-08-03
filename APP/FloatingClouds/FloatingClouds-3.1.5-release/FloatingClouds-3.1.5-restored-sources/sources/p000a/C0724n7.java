package p000a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ComponentCallbacksC1100b;

/* JADX INFO: renamed from: a.n7 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class C0724n7 implements Parcelable {
    public static final Parcelable.Creator<C0724n7> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    public final String f2830a;

    /* JADX INFO: renamed from: b */
    public final String f2831b;

    /* JADX INFO: renamed from: c */
    public final boolean f2832c;

    /* JADX INFO: renamed from: d */
    public final boolean f2833d;

    /* JADX INFO: renamed from: e */
    public final int f2834e;

    /* JADX INFO: renamed from: f */
    public final int f2835f;

    /* JADX INFO: renamed from: g */
    public final String f2836g;

    /* JADX INFO: renamed from: h */
    public final boolean f2837h;

    /* JADX INFO: renamed from: i */
    public final boolean f2838i;

    /* JADX INFO: renamed from: j */
    public final boolean f2839j;

    /* JADX INFO: renamed from: k */
    public final boolean f2840k;

    /* JADX INFO: renamed from: l */
    public final int f2841l;

    /* JADX INFO: renamed from: m */
    public final String f2842m;

    /* JADX INFO: renamed from: n */
    public final int f2843n;

    /* JADX INFO: renamed from: o */
    public final boolean f2844o;

    /* JADX INFO: renamed from: a.n7$a */
    public class a implements Parcelable.Creator<C0724n7> {
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C0724n7 createFromParcel(Parcel parcel) {
            return new C0724n7(parcel);
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C0724n7[] newArray(int i) {
            return new C0724n7[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0724n7(ComponentCallbacksC1100b componentCallbacksC1100b) {
        this.f2830a = componentCallbacksC1100b.getClass().getName();
        this.f2831b = componentCallbacksC1100b.f4561e;
        this.f2832c = componentCallbacksC1100b.f4570n;
        this.f2833d = componentCallbacksC1100b.f4572p;
        this.f2834e = componentCallbacksC1100b.f4580x;
        this.f2835f = componentCallbacksC1100b.f4581y;
        this.f2836g = componentCallbacksC1100b.f4582z;
        this.f2837h = componentCallbacksC1100b.f4539C;
        this.f2838i = componentCallbacksC1100b.f4568l;
        this.f2839j = componentCallbacksC1100b.f4538B;
        this.f2840k = componentCallbacksC1100b.f4537A;
        this.f2841l = componentCallbacksC1100b.f4550N.ordinal();
        this.f2842m = componentCallbacksC1100b.f4564h;
        this.f2843n = componentCallbacksC1100b.f4565i;
        this.f2844o = componentCallbacksC1100b.f4545I;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2830a);
        sb.append(" (");
        sb.append(this.f2831b);
        sb.append(")}:");
        if (this.f2832c) {
            sb.append(" fromLayout");
        }
        if (this.f2833d) {
            sb.append(" dynamicContainer");
        }
        int i = this.f2835f;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f2836g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f2837h) {
            sb.append(" retainInstance");
        }
        if (this.f2838i) {
            sb.append(" removing");
        }
        if (this.f2839j) {
            sb.append(" detached");
        }
        if (this.f2840k) {
            sb.append(" hidden");
        }
        String str2 = this.f2842m;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f2843n);
        }
        if (this.f2844o) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2830a);
        parcel.writeString(this.f2831b);
        parcel.writeInt(this.f2832c ? 1 : 0);
        parcel.writeInt(this.f2833d ? 1 : 0);
        parcel.writeInt(this.f2834e);
        parcel.writeInt(this.f2835f);
        parcel.writeString(this.f2836g);
        parcel.writeInt(this.f2837h ? 1 : 0);
        parcel.writeInt(this.f2838i ? 1 : 0);
        parcel.writeInt(this.f2839j ? 1 : 0);
        parcel.writeInt(this.f2840k ? 1 : 0);
        parcel.writeInt(this.f2841l);
        parcel.writeString(this.f2842m);
        parcel.writeInt(this.f2843n);
        parcel.writeInt(this.f2844o ? 1 : 0);
    }

    public C0724n7(Parcel parcel) {
        this.f2830a = parcel.readString();
        this.f2831b = parcel.readString();
        this.f2832c = parcel.readInt() != 0;
        this.f2833d = parcel.readInt() != 0;
        this.f2834e = parcel.readInt();
        this.f2835f = parcel.readInt();
        this.f2836g = parcel.readString();
        this.f2837h = parcel.readInt() != 0;
        this.f2838i = parcel.readInt() != 0;
        this.f2839j = parcel.readInt() != 0;
        this.f2840k = parcel.readInt() != 0;
        this.f2841l = parcel.readInt();
        this.f2842m = parcel.readString();
        this.f2843n = parcel.readInt();
        this.f2844o = parcel.readInt() != 0;
    }
}

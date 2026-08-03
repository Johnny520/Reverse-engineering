package p000a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.ComponentCallbacksC1100b;
import java.util.ArrayList;
import p000a.AbstractC0762p7;

/* JADX INFO: renamed from: a.T1 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class C0345T1 implements Parcelable {
    public static final Parcelable.Creator<C0345T1> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    public final int[] f1209a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<String> f1210b;

    /* JADX INFO: renamed from: c */
    public final int[] f1211c;

    /* JADX INFO: renamed from: d */
    public final int[] f1212d;

    /* JADX INFO: renamed from: e */
    public final int f1213e;

    /* JADX INFO: renamed from: f */
    public final String f1214f;

    /* JADX INFO: renamed from: g */
    public final int f1215g;

    /* JADX INFO: renamed from: h */
    public final int f1216h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f1217i;

    /* JADX INFO: renamed from: j */
    public final int f1218j;

    /* JADX INFO: renamed from: k */
    public final CharSequence f1219k;

    /* JADX INFO: renamed from: l */
    public final ArrayList<String> f1220l;

    /* JADX INFO: renamed from: m */
    public final ArrayList<String> f1221m;

    /* JADX INFO: renamed from: n */
    public final boolean f1222n;

    /* JADX INFO: renamed from: a.T1$a */
    public class a implements Parcelable.Creator<C0345T1> {
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C0345T1 createFromParcel(Parcel parcel) {
            return new C0345T1(parcel);
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C0345T1[] newArray(int i) {
            return new C0345T1[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0345T1(C0327S1 c0327s1) {
        int size = c0327s1.f3000a.size();
        this.f1209a = new int[size * 6];
        if (!c0327s1.f3006g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1210b = new ArrayList<>(size);
        this.f1211c = new int[size];
        this.f1212d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0762p7.a aVar = c0327s1.f3000a.get(i2);
            int i3 = i + 1;
            this.f1209a[i] = aVar.f3016a;
            ArrayList<String> arrayList = this.f1210b;
            ComponentCallbacksC1100b componentCallbacksC1100b = aVar.f3017b;
            arrayList.add(componentCallbacksC1100b != null ? componentCallbacksC1100b.f4561e : null);
            int[] iArr = this.f1209a;
            iArr[i3] = aVar.f3018c ? 1 : 0;
            iArr[i + 2] = aVar.f3019d;
            iArr[i + 3] = aVar.f3020e;
            int i4 = i + 5;
            iArr[i + 4] = aVar.f3021f;
            i += 6;
            iArr[i4] = aVar.f3022g;
            this.f1211c[i2] = aVar.f3023h.ordinal();
            this.f1212d[i2] = aVar.f3024i.ordinal();
        }
        this.f1213e = c0327s1.f3005f;
        this.f1214f = c0327s1.f3007h;
        this.f1215g = c0327s1.f1163s;
        this.f1216h = c0327s1.f3008i;
        this.f1217i = c0327s1.f3009j;
        this.f1218j = c0327s1.f3010k;
        this.f1219k = c0327s1.f3011l;
        this.f1220l = c0327s1.f3012m;
        this.f1221m = c0327s1.f3013n;
        this.f1222n = c0327s1.f3014o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1209a);
        parcel.writeStringList(this.f1210b);
        parcel.writeIntArray(this.f1211c);
        parcel.writeIntArray(this.f1212d);
        parcel.writeInt(this.f1213e);
        parcel.writeString(this.f1214f);
        parcel.writeInt(this.f1215g);
        parcel.writeInt(this.f1216h);
        TextUtils.writeToParcel(this.f1217i, parcel, 0);
        parcel.writeInt(this.f1218j);
        TextUtils.writeToParcel(this.f1219k, parcel, 0);
        parcel.writeStringList(this.f1220l);
        parcel.writeStringList(this.f1221m);
        parcel.writeInt(this.f1222n ? 1 : 0);
    }

    public C0345T1(Parcel parcel) {
        this.f1209a = parcel.createIntArray();
        this.f1210b = parcel.createStringArrayList();
        this.f1211c = parcel.createIntArray();
        this.f1212d = parcel.createIntArray();
        this.f1213e = parcel.readInt();
        this.f1214f = parcel.readString();
        this.f1215g = parcel.readInt();
        this.f1216h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f1217i = (CharSequence) creator.createFromParcel(parcel);
        this.f1218j = parcel.readInt();
        this.f1219k = (CharSequence) creator.createFromParcel(parcel);
        this.f1220l = parcel.createStringArrayList();
        this.f1221m = parcel.createStringArrayList();
        this.f1222n = parcel.readInt() != 0;
    }
}

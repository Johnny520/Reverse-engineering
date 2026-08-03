package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: i5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1527i5 implements Parcelable {
    public static final Parcelable.Creator<C1527i5> CREATOR = new C0646P0(2);

    /* JADX INFO: renamed from: a */
    public final int[] f5397a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5398b;

    /* JADX INFO: renamed from: c */
    public final int[] f5399c;

    /* JADX INFO: renamed from: d */
    public final int[] f5400d;

    /* JADX INFO: renamed from: e */
    public final int f5401e;

    /* JADX INFO: renamed from: f */
    public final String f5402f;

    /* JADX INFO: renamed from: g */
    public final int f5403g;

    /* JADX INFO: renamed from: h */
    public final int f5404h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f5405i;

    /* JADX INFO: renamed from: j */
    public final int f5406j;

    /* JADX INFO: renamed from: k */
    public final CharSequence f5407k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f5408l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f5409m;

    /* JADX INFO: renamed from: n */
    public final boolean f5410n;

    public C1527i5(C1483h5 c1483h5) {
        int size = c1483h5.f5236a.size();
        this.f5397a = new int[size * 6];
        if (!c1483h5.f5242g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f5398b = new ArrayList(size);
        this.f5399c = new int[size];
        this.f5400d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0455Ki c0455Ki = (C0455Ki) c1483h5.f5236a.get(i2);
            int i3 = i + 1;
            this.f5397a[i] = c0455Ki.f1489a;
            ArrayList arrayList = this.f5398b;
            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = c0455Ki.f1490b;
            arrayList.add(abstractComponentCallbacksC1503hi != null ? abstractComponentCallbacksC1503hi.f5314e : null);
            int[] iArr = this.f5397a;
            iArr[i3] = c0455Ki.f1491c ? 1 : 0;
            iArr[i + 2] = c0455Ki.f1492d;
            iArr[i + 3] = c0455Ki.f1493e;
            int i4 = i + 5;
            iArr[i + 4] = c0455Ki.f1494f;
            i += 6;
            iArr[i4] = c0455Ki.f1495g;
            this.f5399c[i2] = c0455Ki.f1496h.ordinal();
            this.f5400d[i2] = c0455Ki.f1497i.ordinal();
        }
        this.f5401e = c1483h5.f5241f;
        this.f5402f = c1483h5.f5243h;
        this.f5403g = c1483h5.f5253r;
        this.f5404h = c1483h5.f5244i;
        this.f5405i = c1483h5.f5245j;
        this.f5406j = c1483h5.f5246k;
        this.f5407k = c1483h5.f5247l;
        this.f5408l = c1483h5.f5248m;
        this.f5409m = c1483h5.f5249n;
        this.f5410n = c1483h5.f5250o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f5397a);
        parcel.writeStringList(this.f5398b);
        parcel.writeIntArray(this.f5399c);
        parcel.writeIntArray(this.f5400d);
        parcel.writeInt(this.f5401e);
        parcel.writeString(this.f5402f);
        parcel.writeInt(this.f5403g);
        parcel.writeInt(this.f5404h);
        TextUtils.writeToParcel(this.f5405i, parcel, 0);
        parcel.writeInt(this.f5406j);
        TextUtils.writeToParcel(this.f5407k, parcel, 0);
        parcel.writeStringList(this.f5408l);
        parcel.writeStringList(this.f5409m);
        parcel.writeInt(this.f5410n ? 1 : 0);
    }

    public C1527i5(Parcel parcel) {
        this.f5397a = parcel.createIntArray();
        this.f5398b = parcel.createStringArrayList();
        this.f5399c = parcel.createIntArray();
        this.f5400d = parcel.createIntArray();
        this.f5401e = parcel.readInt();
        this.f5402f = parcel.readString();
        this.f5403g = parcel.readInt();
        this.f5404h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f5405i = (CharSequence) creator.createFromParcel(parcel);
        this.f5406j = parcel.readInt();
        this.f5407k = (CharSequence) creator.createFromParcel(parcel);
        this.f5408l = parcel.createStringArrayList();
        this.f5409m = parcel.createStringArrayList();
        this.f5410n = parcel.readInt() != 0;
    }
}

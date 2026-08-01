package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p006D.C0085n;

/* JADX INFO: renamed from: androidx.fragment.app.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0424b implements Parcelable {
    public static final Parcelable.Creator<C0424b> CREATOR = new C0085n(3);

    /* JADX INFO: renamed from: a */
    public final int[] f1299a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1300b;

    /* JADX INFO: renamed from: c */
    public final int[] f1301c;

    /* JADX INFO: renamed from: d */
    public final int[] f1302d;

    /* JADX INFO: renamed from: e */
    public final int f1303e;

    /* JADX INFO: renamed from: f */
    public final String f1304f;

    /* JADX INFO: renamed from: g */
    public final int f1305g;

    /* JADX INFO: renamed from: h */
    public final int f1306h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f1307i;

    /* JADX INFO: renamed from: j */
    public final int f1308j;

    /* JADX INFO: renamed from: k */
    public final CharSequence f1309k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f1310l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f1311m;

    /* JADX INFO: renamed from: n */
    public final boolean f1312n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0424b(C0423a c0423a) {
        int size = c0423a.f1282a.size();
        this.f1299a = new int[size * 5];
        if (!c0423a.f1288g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1300b = new ArrayList(size);
        this.f1301c = new int[size];
        this.f1302d = new int[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C0416G c0416g = (C0416G) c0423a.f1282a.get(i3);
            int i4 = i2 + 1;
            this.f1299a[i2] = c0416g.f1258a;
            ArrayList arrayList = this.f1300b;
            AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = c0416g.f1259b;
            arrayList.add(abstractComponentCallbacksC0434l != null ? abstractComponentCallbacksC0434l.f1369f : null);
            int[] iArr = this.f1299a;
            iArr[i4] = c0416g.f1260c;
            iArr[i2 + 2] = c0416g.f1261d;
            int i5 = i2 + 4;
            iArr[i2 + 3] = c0416g.f1262e;
            i2 += 5;
            iArr[i5] = c0416g.f1263f;
            this.f1301c[i3] = c0416g.f1264g.ordinal();
            this.f1302d[i3] = c0416g.f1265h.ordinal();
        }
        this.f1303e = c0423a.f1287f;
        this.f1304f = c0423a.f1289h;
        this.f1305g = c0423a.f1298q;
        this.f1306h = c0423a.f1290i;
        this.f1307i = c0423a.f1291j;
        this.f1308j = c0423a.f1292k;
        this.f1309k = c0423a.f1293l;
        this.f1310l = c0423a.f1294m;
        this.f1311m = c0423a.f1295n;
        this.f1312n = c0423a.f1296o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f1299a);
        parcel.writeStringList(this.f1300b);
        parcel.writeIntArray(this.f1301c);
        parcel.writeIntArray(this.f1302d);
        parcel.writeInt(this.f1303e);
        parcel.writeString(this.f1304f);
        parcel.writeInt(this.f1305g);
        parcel.writeInt(this.f1306h);
        TextUtils.writeToParcel(this.f1307i, parcel, 0);
        parcel.writeInt(this.f1308j);
        TextUtils.writeToParcel(this.f1309k, parcel, 0);
        parcel.writeStringList(this.f1310l);
        parcel.writeStringList(this.f1311m);
        parcel.writeInt(this.f1312n ? 1 : 0);
    }

    public C0424b(Parcel parcel) {
        this.f1299a = parcel.createIntArray();
        this.f1300b = parcel.createStringArrayList();
        this.f1301c = parcel.createIntArray();
        this.f1302d = parcel.createIntArray();
        this.f1303e = parcel.readInt();
        this.f1304f = parcel.readString();
        this.f1305g = parcel.readInt();
        this.f1306h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f1307i = (CharSequence) creator.createFromParcel(parcel);
        this.f1308j = parcel.readInt();
        this.f1309k = (CharSequence) creator.createFromParcel(parcel);
        this.f1310l = parcel.createStringArrayList();
        this.f1311m = parcel.createStringArrayList();
        this.f1312n = parcel.readInt() != 0;
    }
}

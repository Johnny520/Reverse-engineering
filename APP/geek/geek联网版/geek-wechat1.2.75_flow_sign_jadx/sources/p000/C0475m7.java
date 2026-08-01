package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: m7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0475m7 implements Parcelable {
    public static final Parcelable.Creator<C0475m7> CREATOR = new C0728t1(2);

    /* JADX INFO: renamed from: a */
    public final int[] f3083a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f3084b;

    /* JADX INFO: renamed from: c */
    public final int[] f3085c;

    /* JADX INFO: renamed from: d */
    public final int[] f3086d;

    /* JADX INFO: renamed from: e */
    public final int f3087e;

    /* JADX INFO: renamed from: f */
    public final String f3088f;

    /* JADX INFO: renamed from: g */
    public final int f3089g;

    /* JADX INFO: renamed from: h */
    public final int f3090h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f3091i;

    /* JADX INFO: renamed from: j */
    public final int f3092j;

    /* JADX INFO: renamed from: k */
    public final CharSequence f3093k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f3094l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f3095m;

    /* JADX INFO: renamed from: n */
    public final boolean f3096n;

    public C0475m7(C0438l7 c0438l7) {
        int size = c0438l7.f2947a.size();
        this.f3083a = new int[size * 5];
        if (!c0438l7.f2953g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f3084b = new ArrayList(size);
        this.f3085c = new int[size];
        this.f3086d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0266gm c0266gm = (C0266gm) c0438l7.f2947a.get(i2);
            int i3 = i + 1;
            this.f3083a[i] = c0266gm.f2028a;
            ArrayList arrayList = this.f3084b;
            AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = c0266gm.f2029b;
            arrayList.add(abstractComponentCallbacksC0563ol != null ? abstractComponentCallbacksC0563ol.f3490e : null);
            int[] iArr = this.f3083a;
            iArr[i3] = c0266gm.f2030c;
            iArr[i + 2] = c0266gm.f2031d;
            int i4 = i + 4;
            iArr[i + 3] = c0266gm.f2032e;
            i += 5;
            iArr[i4] = c0266gm.f2033f;
            this.f3085c[i2] = c0266gm.f2034g.ordinal();
            this.f3086d[i2] = c0266gm.f2035h.ordinal();
        }
        this.f3087e = c0438l7.f2952f;
        this.f3088f = c0438l7.f2954h;
        this.f3089g = c0438l7.f2964r;
        this.f3090h = c0438l7.f2955i;
        this.f3091i = c0438l7.f2956j;
        this.f3092j = c0438l7.f2957k;
        this.f3093k = c0438l7.f2958l;
        this.f3094l = c0438l7.f2959m;
        this.f3095m = c0438l7.f2960n;
        this.f3096n = c0438l7.f2961o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f3083a);
        parcel.writeStringList(this.f3084b);
        parcel.writeIntArray(this.f3085c);
        parcel.writeIntArray(this.f3086d);
        parcel.writeInt(this.f3087e);
        parcel.writeString(this.f3088f);
        parcel.writeInt(this.f3089g);
        parcel.writeInt(this.f3090h);
        TextUtils.writeToParcel(this.f3091i, parcel, 0);
        parcel.writeInt(this.f3092j);
        TextUtils.writeToParcel(this.f3093k, parcel, 0);
        parcel.writeStringList(this.f3094l);
        parcel.writeStringList(this.f3095m);
        parcel.writeInt(this.f3096n ? 1 : 0);
    }

    public C0475m7(Parcel parcel) {
        this.f3083a = parcel.createIntArray();
        this.f3084b = parcel.createStringArrayList();
        this.f3085c = parcel.createIntArray();
        this.f3086d = parcel.createIntArray();
        this.f3087e = parcel.readInt();
        this.f3088f = parcel.readString();
        this.f3089g = parcel.readInt();
        this.f3090h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f3091i = (CharSequence) creator.createFromParcel(parcel);
        this.f3092j = parcel.readInt();
        this.f3093k = (CharSequence) creator.createFromParcel(parcel);
        this.f3094l = parcel.createStringArrayList();
        this.f3095m = parcel.createStringArrayList();
        this.f3096n = parcel.readInt() != 0;
    }
}

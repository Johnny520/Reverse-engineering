package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: c7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0094c7 implements Parcelable {
    public static final Parcelable.Creator<C0094c7> CREATOR = new C0729t1(2);

    /* JADX INFO: renamed from: a */
    public final int[] f893a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f894b;

    /* JADX INFO: renamed from: c */
    public final int[] f895c;

    /* JADX INFO: renamed from: d */
    public final int[] f896d;

    /* JADX INFO: renamed from: e */
    public final int f897e;

    /* JADX INFO: renamed from: f */
    public final String f898f;

    /* JADX INFO: renamed from: g */
    public final int f899g;

    /* JADX INFO: renamed from: h */
    public final int f900h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f901i;

    /* JADX INFO: renamed from: j */
    public final int f902j;

    /* JADX INFO: renamed from: k */
    public final CharSequence f903k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f904l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f905m;

    /* JADX INFO: renamed from: n */
    public final boolean f906n;

    public C0094c7(C0058b7 c0058b7) {
        int size = c0058b7.f756a.size();
        this.f893a = new int[size * 5];
        if (!c0058b7.f762g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f894b = new ArrayList(size);
        this.f895c = new int[size];
        this.f896d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0192em c0192em = (C0192em) c0058b7.f756a.get(i2);
            int i3 = i + 1;
            this.f893a[i] = c0192em.f1817a;
            ArrayList arrayList = this.f894b;
            AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = c0192em.f1818b;
            arrayList.add(abstractComponentCallbacksC0489ml != null ? abstractComponentCallbacksC0489ml.f3245e : null);
            int[] iArr = this.f893a;
            iArr[i3] = c0192em.f1819c;
            iArr[i + 2] = c0192em.f1820d;
            int i4 = i + 4;
            iArr[i + 3] = c0192em.f1821e;
            i += 5;
            iArr[i4] = c0192em.f1822f;
            this.f895c[i2] = c0192em.f1823g.ordinal();
            this.f896d[i2] = c0192em.f1824h.ordinal();
        }
        this.f897e = c0058b7.f761f;
        this.f898f = c0058b7.f763h;
        this.f899g = c0058b7.f773r;
        this.f900h = c0058b7.f764i;
        this.f901i = c0058b7.f765j;
        this.f902j = c0058b7.f766k;
        this.f903k = c0058b7.f767l;
        this.f904l = c0058b7.f768m;
        this.f905m = c0058b7.f769n;
        this.f906n = c0058b7.f770o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f893a);
        parcel.writeStringList(this.f894b);
        parcel.writeIntArray(this.f895c);
        parcel.writeIntArray(this.f896d);
        parcel.writeInt(this.f897e);
        parcel.writeString(this.f898f);
        parcel.writeInt(this.f899g);
        parcel.writeInt(this.f900h);
        TextUtils.writeToParcel(this.f901i, parcel, 0);
        parcel.writeInt(this.f902j);
        TextUtils.writeToParcel(this.f903k, parcel, 0);
        parcel.writeStringList(this.f904l);
        parcel.writeStringList(this.f905m);
        parcel.writeInt(this.f906n ? 1 : 0);
    }

    public C0094c7(Parcel parcel) {
        this.f893a = parcel.createIntArray();
        this.f894b = parcel.createStringArrayList();
        this.f895c = parcel.createIntArray();
        this.f896d = parcel.createIntArray();
        this.f897e = parcel.readInt();
        this.f898f = parcel.readString();
        this.f899g = parcel.readInt();
        this.f900h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f901i = (CharSequence) creator.createFromParcel(parcel);
        this.f902j = parcel.readInt();
        this.f903k = (CharSequence) creator.createFromParcel(parcel);
        this.f904l = parcel.createStringArrayList();
        this.f905m = parcel.createStringArrayList();
        this.f906n = parcel.readInt() != 0;
    }
}

package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: i5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1527i5 implements Parcelable {
    public static final Parcelable.Creator<C1527i5> CREATOR = null;

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

    static {
        CREATOR = new C0646P0(2);
    }

    public C1527i5(C1483h5 r9) {
        int r0 = r9.f5236a.size();
        this.f5397a = new int[r0 * 6];
        if (r9.f5242g == false) goto L14;
        this.f5398b = new ArrayList(r0);
        this.f5399c = new int[r0];
        this.f5400d = new int[r0];
        int r1 = 0;
        int r2 = 0;
    L5:
        if (r1 >= r0) goto L11;
        C0455Ki r3 = (C0455Ki) r9.f5236a.get(r1);
        int r5 = r2 + 1;
        this.f5397a[r2] = r3.f1489a;
        ArrayList r4 = this.f5398b;
        AbstractComponentCallbacksC1503hi r6 = r3.f1490b;
        if (r6 == null) goto L9;
        String r62 = r6.f5314e;
    L10:
        r4.add(r62);
        int[] r42 = this.f5397a;
        r42[r5] = r3.f1491c ? 1 : 0;
        r42[r2 + 2] = r3.f1492d;
        r42[r2 + 3] = r3.f1493e;
        int r52 = r2 + 5;
        r42[r2 + 4] = r3.f1494f;
        r2 = r2 + 6;
        r42[r52] = r3.f1495g;
        this.f5399c[r1] = r3.f1496h.ordinal();
        this.f5400d[r1] = r3.f1497i.ordinal();
        r1 = r1 + 1;
        goto L5
    L9:
        r62 = null;
        goto L10
    L11:
        this.f5401e = r9.f5241f;
        this.f5402f = r9.f5243h;
        this.f5403g = r9.f5253r;
        this.f5404h = r9.f5244i;
        this.f5405i = r9.f5245j;
        this.f5406j = r9.f5246k;
        this.f5407k = r9.f5247l;
        this.f5408l = r9.f5248m;
        this.f5409m = r9.f5249n;
        this.f5410n = r9.f5250o;
        return;
    L14:
        throw new IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeIntArray(this.f5397a);
        r2.writeStringList(this.f5398b);
        r2.writeIntArray(this.f5399c);
        r2.writeIntArray(this.f5400d);
        r2.writeInt(this.f5401e);
        r2.writeString(this.f5402f);
        r2.writeInt(this.f5403g);
        r2.writeInt(this.f5404h);
        TextUtils.writeToParcel(this.f5405i, r2, 0);
        r2.writeInt(this.f5406j);
        TextUtils.writeToParcel(this.f5407k, r2, 0);
        r2.writeStringList(this.f5408l);
        r2.writeStringList(this.f5409m);
        r2.writeInt(this.f5410n ? 1 : 0);
    }

    public C1527i5(Parcel r3) {
        this.f5397a = r3.createIntArray();
        this.f5398b = r3.createStringArrayList();
        this.f5399c = r3.createIntArray();
        this.f5400d = r3.createIntArray();
        this.f5401e = r3.readInt();
        this.f5402f = r3.readString();
        this.f5403g = r3.readInt();
        this.f5404h = r3.readInt();
        Parcelable.Creator r0 = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f5405i = (CharSequence) r0.createFromParcel(r3);
        this.f5406j = r3.readInt();
        this.f5407k = (CharSequence) r0.createFromParcel(r3);
        this.f5408l = r3.createStringArrayList();
        this.f5409m = r3.createStringArrayList();
        if (r3.readInt() == 0) goto L5;
        boolean r32 = true;
    L6:
        this.f5410n = r32;
        return;
    L5:
        r32 = false;
        goto L6
    }
}

package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.AbstractC1160i;

/* JADX INFO: renamed from: yv */
/* JADX INFO: loaded from: classes.dex */
public final class C2775yv extends AbstractC2393q {
    public static final Parcelable.Creator<C2775yv> CREATOR = null;

    /* JADX INFO: renamed from: c */
    public Parcelable f9425c;

    static {
        CREATOR = new C2342p(6);
    }

    public C2775yv(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        if (r2 != null) goto L6;
        r2 = AbstractC1160i.class.getClassLoader();
    L6:
        this.f9425c = r1.readParcelable(r2);
    }

    @Override // p000.AbstractC2393q, android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        super.writeToParcel(r2, r3);
        r2.writeParcelable(this.f9425c, 0);
    }
}

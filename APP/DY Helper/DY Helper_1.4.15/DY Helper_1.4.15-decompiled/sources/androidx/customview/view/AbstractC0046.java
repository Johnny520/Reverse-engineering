package androidx.customview.view;

/* JADX INFO: renamed from: androidx.customview.view.α */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0046 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.customview.view.AbstractC0046> CREATOR = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.C1088 f1062 = null;

    /* JADX INFO: renamed from: ε */
    public final android.os.Parcelable f1063;

    static {
            λ r0 = new λ
            r0.<init>()
            androidx.customview.view.AbstractC0046.f1062 = r0
            w91 r0 = new w91
            r1 = 1
            r0.<init>(r1)
            androidx.customview.view.AbstractC0046.CREATOR = r0
            return
    }

    public AbstractC0046() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1063 = r0
            return
    }

    public AbstractC0046(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            android.os.Parcelable r1 = r1.readParcelable(r2)
            if (r1 == 0) goto La
            goto Lc
        La:
            λ r1 = androidx.customview.view.AbstractC0046.f1062
        Lc:
            r0.f1063 = r1
            return
    }

    public AbstractC0046(android.os.Parcelable r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Le
            λ r0 = androidx.customview.view.AbstractC0046.f1062
            if (r2 == r0) goto La
            goto Lb
        La:
            r2 = 0
        Lb:
            r1.f1063 = r2
            return
        Le:
            java.lang.String r1 = "superState must not be null"
            p000.C1080.m7275(r1)
            r1 = 0
            throw r1
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            android.os.Parcelable r0 = r0.f1063
            r1.writeParcelable(r0, r2)
            return
    }
}

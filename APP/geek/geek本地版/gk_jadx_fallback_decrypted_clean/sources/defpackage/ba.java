package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ba extends defpackage.d {
    public static final android.os.Parcelable.Creator<defpackage.ba> CREATOR = null;
    public boolean c;

    static {
            c r0 = new c
            r1 = 2
            r0.<init>(r1)
            defpackage.ba.CREATOR = r0
            return
    }

    public ba(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            int r1 = r1.readInt()
            r2 = 1
            if (r1 != r2) goto Lb
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r0.c = r2
            return
    }

    @Override // defpackage.d, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            boolean r2 = r0.c
            r1.writeInt(r2)
            return
    }
}

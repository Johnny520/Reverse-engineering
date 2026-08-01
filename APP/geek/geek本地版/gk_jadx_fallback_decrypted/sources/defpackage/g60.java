package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g60 extends defpackage.d {
    public static final android.os.Parcelable.Creator<defpackage.g60> CREATOR = null;
    public java.lang.CharSequence c;
    public boolean d;

    static {
            c r0 = new c
            r1 = 8
            r0.<init>(r1)
            defpackage.g60.CREATOR = r0
            return
    }

    public g60(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.os.Parcelable$Creator r2 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r2 = r2.createFromParcel(r1)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.c = r2
            int r1 = r1.readInt()
            r2 = 1
            if (r1 != r2) goto L15
            goto L16
        L15:
            r2 = 0
        L16:
            r0.d = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextInputLayout.SavedState{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " error="
            r0.append(r1)
            java.lang.CharSequence r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // defpackage.d, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            super.writeToParcel(r2, r3)
            java.lang.CharSequence r0 = r1.c
            android.text.TextUtils.writeToParcel(r0, r2, r3)
            boolean r3 = r1.d
            r2.writeInt(r3)
            return
    }
}

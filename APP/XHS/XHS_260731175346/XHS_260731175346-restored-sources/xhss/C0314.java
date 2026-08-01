package xhss;

/* JADX INFO: renamed from: xhss.ᛳᲁᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0314 implements android.os.Parcelable.Creator {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1193;

    public /* synthetic */ C0314(int r1) {
            r0 = this;
            r0.f1193 = r1
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r1) {
            r0 = this;
            int r0 = r0.f1193
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            androidx.versionedparcelable.ParcelImpl r0 = new androidx.versionedparcelable.ParcelImpl
            r0.<init>(r1)
            return r0
        Lb:
            xhss.ᛱᲈᛸᛵ r0 = new xhss.ᛱᲈᛸᛵ
            r0.<init>(r1)
            int r1 = r1.readInt()
            r0.f500 = r1
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r1) {
            r0 = this;
            int r0 = r0.f1193
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            androidx.versionedparcelable.ParcelImpl[] r0 = new androidx.versionedparcelable.ParcelImpl[r1]
            return r0
        L8:
            xhss.ᛱᲈᛸᛵ[] r0 = new xhss.C0116[r1]
            return r0
    }
}

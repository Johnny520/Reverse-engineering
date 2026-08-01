package defpackage;

/* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0813 implements android.os.Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f3738;

    public /* synthetic */ C0813(int r1) {
            r0 = this;
            r0.f3738 = r1
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r2) {
            r1 = this;
            int r1 = r1.f3738
            r0 = 0
            switch(r1) {
                case 0: goto L18;
                case 1: goto L12;
                case 2: goto Lc;
                default: goto L6;
            }
        L6:
            ᲈᲈᛱᛳ r1 = new ᲈᲈᛱᛳ
            r1.<init>(r2, r0)
            return r1
        Lc:
            ᲇᲁᲇᲁ r1 = new ᲇᲁᲇᲁ
            r1.<init>(r2, r0)
            return r1
        L12:
            ᛱᲀᲁᛴ r1 = new ᛱᲀᲁᛴ
            r1.<init>(r2, r0)
            return r1
        L18:
            android.os.Parcelable r1 = r2.readParcelable(r0)
            if (r1 != 0) goto L21
            ᛷᛲᲇᲈ r0 = defpackage.AbstractC2109.f9062
            goto L26
        L21:
            java.lang.String r1 = "superState must be null"
            defpackage.C2264.m3676(r1)
        L26:
            return r0
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final java.lang.Object createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            int r0 = r0.f3738
            switch(r0) {
                case 0: goto L17;
                case 1: goto L11;
                case 2: goto Lb;
                default: goto L5;
            }
        L5:
            ᲈᲈᛱᛳ r0 = new ᲈᲈᛱᛳ
            r0.<init>(r1, r2)
            return r0
        Lb:
            ᲇᲁᲇᲁ r0 = new ᲇᲁᲇᲁ
            r0.<init>(r1, r2)
            return r0
        L11:
            ᛱᲀᲁᛴ r0 = new ᛱᲀᲁᛴ
            r0.<init>(r1, r2)
            return r0
        L17:
            android.os.Parcelable r0 = r1.readParcelable(r2)
            if (r0 != 0) goto L20
            ᛷᛲᲇᲈ r0 = defpackage.AbstractC2109.f9062
            goto L26
        L20:
            java.lang.String r0 = "superState must be null"
            defpackage.C2264.m3676(r0)
            r0 = 0
        L26:
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r1) {
            r0 = this;
            int r0 = r0.f3738
            switch(r0) {
                case 0: goto Le;
                case 1: goto Lb;
                case 2: goto L8;
                default: goto L5;
            }
        L5:
            ᲈᲈᛱᛳ[] r0 = new defpackage.C2362[r1]
            return r0
        L8:
            ᲇᲁᲇᲁ[] r0 = new defpackage.C2135[r1]
            return r0
        Lb:
            ᛱᲀᲁᛴ[] r0 = new defpackage.C0169[r1]
            return r0
        Le:
            ᲇᛸᲁᛱ[] r0 = new defpackage.AbstractC2109[r1]
            return r0
    }
}

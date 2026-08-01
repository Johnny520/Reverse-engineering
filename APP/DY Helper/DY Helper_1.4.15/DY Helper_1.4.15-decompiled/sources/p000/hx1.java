package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class hx1 implements android.os.Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f4836;

    public /* synthetic */ hx1(int r1) {
            r0 = this;
            r0.f4836 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.ix1 m2545(android.os.Parcel r4, java.lang.ClassLoader r5) {
            if (r5 != 0) goto L8
            java.lang.Class<hx1> r5 = p000.hx1.class
            java.lang.ClassLoader r5 = r5.getClassLoader()
        L8:
            int r0 = r4.readInt()
            if (r0 != 0) goto L14
            ix1 r4 = new ix1
            r4.<init>()
            return r4
        L14:
            sw1 r1 = p000.sw1.f10062
            qa1 r1 = r1.mo4445()
            r2 = 0
        L1b:
            if (r2 >= r0) goto L27
            java.lang.Object r3 = r4.readValue(r5)
            r1.add(r3)
            int r2 = r2 + 1
            goto L1b
        L27:
            ix1 r4 = new ix1
            б r5 = r1.m4829()
            r4.<init>(r5)
            return r4
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r2) {
            r1 = this;
            int r1 = r1.f4836
            switch(r1) {
                case 0: goto L1a;
                case 1: goto L13;
                case 2: goto Lc;
                default: goto L5;
            }
        L5:
            w92 r1 = new w92
            r0 = 0
            r1.<init>(r2, r0)
            return r1
        Lc:
            kr1 r1 = new kr1
            r0 = 0
            r1.<init>(r2, r0)
            return r1
        L13:
            lw r1 = new lw
            r0 = 0
            r1.<init>(r2, r0)
            return r1
        L1a:
            r1 = 0
            ix1 r1 = m2545(r2, r1)
            return r1
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final java.lang.Object createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            int r0 = r0.f4836
            switch(r0) {
                case 0: goto L17;
                case 1: goto L11;
                case 2: goto Lb;
                default: goto L5;
            }
        L5:
            w92 r0 = new w92
            r0.<init>(r1, r2)
            return r0
        Lb:
            kr1 r0 = new kr1
            r0.<init>(r1, r2)
            return r0
        L11:
            lw r0 = new lw
            r0.<init>(r1, r2)
            return r0
        L17:
            ix1 r0 = m2545(r1, r2)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r1) {
            r0 = this;
            int r0 = r0.f4836
            switch(r0) {
                case 0: goto Le;
                case 1: goto Lb;
                case 2: goto L8;
                default: goto L5;
            }
        L5:
            w92[] r0 = new p000.w92[r1]
            return r0
        L8:
            kr1[] r0 = new p000.kr1[r1]
            return r0
        Lb:
            lw[] r0 = new p000.C0527lw[r1]
            return r0
        Le:
            ix1[] r0 = new p000.ix1[r1]
            return r0
    }
}

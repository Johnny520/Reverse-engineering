package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class w91 implements android.os.Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f11614;

    public /* synthetic */ w91(int r1) {
            r0 = this;
            r0.f11614 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.x91 m6332(android.os.Parcel r2, java.lang.ClassLoader r3) {
            if (r3 != 0) goto L8
            java.lang.Class<w91> r3 = p000.w91.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
        L8:
            java.lang.Object r3 = r2.readValue(r3)
            int r2 = r2.readInt()
            x91 r0 = new x91
            if (r2 == 0) goto L2d
            r1 = 1
            if (r2 == r1) goto L2a
            r1 = 2
            if (r2 != r1) goto L1d
            xn0 r2 = p000.xn0.f12218
            goto L2f
        L1d:
            java.lang.String r3 = "Unsupported MutableState policy "
            java.lang.String r0 = " was restored"
            java.lang.String r2 = p000.AbstractC0602nx.m4127(r3, r2, r0)
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
        L2a:
            xn0 r2 = p000.xn0.f12220
            goto L2f
        L2d:
            xn0 r2 = p000.xn0.f12230
        L2f:
            r0.<init>(r3, r2)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r2) {
            r1 = this;
            int r1 = r1.f11614
            switch(r1) {
                case 0: goto L24;
                case 1: goto L13;
                case 2: goto Lc;
                default: goto L5;
            }
        L5:
            y42 r1 = new y42
            r0 = 0
            r1.<init>(r2, r0)
            return r1
        Lc:
            hm1 r1 = new hm1
            r0 = 0
            r1.<init>(r2, r0)
            return r1
        L13:
            r1 = 0
            android.os.Parcelable r1 = r2.readParcelable(r1)
            if (r1 != 0) goto L1d
            λ r1 = androidx.customview.view.AbstractC0046.f1062
            goto L23
        L1d:
            java.lang.String r1 = "superState must be null"
            p000.C1080.m7279(r1)
            r1 = 0
        L23:
            return r1
        L24:
            r1 = 0
            x91 r1 = m6332(r2, r1)
            return r1
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final java.lang.Object createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            int r0 = r0.f11614
            switch(r0) {
                case 0: goto L21;
                case 1: goto L11;
                case 2: goto Lb;
                default: goto L5;
            }
        L5:
            y42 r0 = new y42
            r0.<init>(r1, r2)
            return r0
        Lb:
            hm1 r0 = new hm1
            r0.<init>(r1, r2)
            return r0
        L11:
            android.os.Parcelable r0 = r1.readParcelable(r2)
            if (r0 != 0) goto L1a
            λ r0 = androidx.customview.view.AbstractC0046.f1062
            goto L20
        L1a:
            java.lang.String r0 = "superState must be null"
            p000.C1080.m7279(r0)
            r0 = 0
        L20:
            return r0
        L21:
            x91 r0 = m6332(r1, r2)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r1) {
            r0 = this;
            int r0 = r0.f11614
            switch(r0) {
                case 0: goto Le;
                case 1: goto Lb;
                case 2: goto L8;
                default: goto L5;
            }
        L5:
            y42[] r0 = new p000.y42[r1]
            return r0
        L8:
            hm1[] r0 = new p000.hm1[r1]
            return r0
        Lb:
            androidx.customview.view.α[] r0 = new androidx.customview.view.AbstractC0046[r1]
            return r0
        Le:
            x91[] r0 = new p000.x91[r1]
            return r0
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c implements android.os.Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r3) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L44;
                case 1: goto L3d;
                case 2: goto L36;
                case 3: goto L2f;
                case 4: goto L28;
                case 5: goto L21;
                case 6: goto L1a;
                case 7: goto L13;
                case 8: goto Lc;
                default: goto L5;
            }
        L5:
            i70 r0 = new i70
            r1 = 0
            r0.<init>(r3, r1)
            return r0
        Lc:
            g60 r0 = new g60
            r1 = 0
            r0.<init>(r3, r1)
            return r0
        L13:
            t30 r0 = new t30
            r1 = 0
            r0.<init>(r3, r1)
            return r0
        L1a:
            g20 r0 = new g20
            r1 = 0
            r0.<init>(r3, r1)
            return r0
        L21:
            vz r0 = new vz
            r1 = 0
            r0.<init>(r3, r1)
            return r0
        L28:
            lt r0 = new lt
            r1 = 0
            r0.<init>(r3, r1)
            return r0
        L2f:
            be r0 = new be
            r1 = 0
            r0.<init>(r3, r1)
            return r0
        L36:
            ba r0 = new ba
            r1 = 0
            r0.<init>(r3, r1)
            return r0
        L3d:
            t7 r0 = new t7
            r1 = 0
            r0.<init>(r3, r1)
            return r0
        L44:
            r0 = 0
            android.os.Parcelable r3 = r3.readParcelable(r0)
            if (r3 != 0) goto L4e
            b r3 = defpackage.d.b
            return r3
        L4e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "superState must be null"
            r3.<init>(r0)
            throw r3
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final java.lang.Object createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L35;
                case 2: goto L2f;
                case 3: goto L29;
                case 4: goto L23;
                case 5: goto L1d;
                case 6: goto L17;
                case 7: goto L11;
                case 8: goto Lb;
                default: goto L5;
            }
        L5:
            i70 r0 = new i70
            r0.<init>(r2, r3)
            return r0
        Lb:
            g60 r0 = new g60
            r0.<init>(r2, r3)
            return r0
        L11:
            t30 r0 = new t30
            r0.<init>(r2, r3)
            return r0
        L17:
            g20 r0 = new g20
            r0.<init>(r2, r3)
            return r0
        L1d:
            vz r0 = new vz
            r0.<init>(r2, r3)
            return r0
        L23:
            lt r0 = new lt
            r0.<init>(r2, r3)
            return r0
        L29:
            be r0 = new be
            r0.<init>(r2, r3)
            return r0
        L2f:
            ba r0 = new ba
            r0.<init>(r2, r3)
            return r0
        L35:
            t7 r0 = new t7
            r0.<init>(r2, r3)
            return r0
        L3b:
            android.os.Parcelable r2 = r2.readParcelable(r3)
            if (r2 != 0) goto L44
            b r2 = defpackage.d.b
            return r2
        L44:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "superState must be null"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L20;
                case 1: goto L1d;
                case 2: goto L1a;
                case 3: goto L17;
                case 4: goto L14;
                case 5: goto L11;
                case 6: goto Le;
                case 7: goto Lb;
                case 8: goto L8;
                default: goto L5;
            }
        L5:
            i70[] r2 = new defpackage.i70[r2]
            return r2
        L8:
            g60[] r2 = new defpackage.g60[r2]
            return r2
        Lb:
            t30[] r2 = new defpackage.t30[r2]
            return r2
        Le:
            g20[] r2 = new defpackage.g20[r2]
            return r2
        L11:
            vz[] r2 = new defpackage.vz[r2]
            return r2
        L14:
            lt[] r2 = new defpackage.lt[r2]
            return r2
        L17:
            be[] r2 = new defpackage.be[r2]
            return r2
        L1a:
            ba[] r2 = new defpackage.ba[r2]
            return r2
        L1d:
            t7[] r2 = new defpackage.t7[r2]
            return r2
        L20:
            d[] r2 = new defpackage.d[r2]
            return r2
    }
}

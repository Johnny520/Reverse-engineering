package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t1 implements android.os.Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ t1(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = r8.a
            switch(r0) {
                case 0: goto L1a4;
                case 1: goto L193;
                case 2: goto L18d;
                case 3: goto L153;
                case 4: goto L149;
                case 5: goto L137;
                case 6: goto Le6;
                case 7: goto Le0;
                case 8: goto Lc3;
                case 9: goto Lab;
                case 10: goto L9e;
                case 11: goto L92;
                case 12: goto L8c;
                case 13: goto L62;
                default: goto L5;
            }
        L5:
            m40 r0 = new m40
            r0.<init>()
            int r1 = r9.readInt()
            r0.a = r1
            int r1 = r9.readInt()
            r0.b = r1
            int r1 = r9.readInt()
            r0.c = r1
            if (r1 <= 0) goto L25
            int[] r1 = new int[r1]
            r0.d = r1
            r9.readIntArray(r1)
        L25:
            int r1 = r9.readInt()
            r0.e = r1
            if (r1 <= 0) goto L34
            int[] r1 = new int[r1]
            r0.f = r1
            r9.readIntArray(r1)
        L34:
            int r1 = r9.readInt()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L3e
            r1 = r3
            goto L3f
        L3e:
            r1 = r2
        L3f:
            r0.h = r1
            int r1 = r9.readInt()
            if (r1 != r3) goto L49
            r1 = r3
            goto L4a
        L49:
            r1 = r2
        L4a:
            r0.i = r1
            int r1 = r9.readInt()
            if (r1 != r3) goto L53
            r2 = r3
        L53:
            r0.j = r2
            java.lang.Class<l40> r1 = defpackage.l40.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.util.ArrayList r9 = r9.readArrayList(r1)
            r0.g = r9
            return r0
        L62:
            l40 r0 = new l40
            r0.<init>()
            int r1 = r9.readInt()
            r0.a = r1
            int r1 = r9.readInt()
            r0.b = r1
            int r1 = r9.readInt()
            r2 = 1
            if (r1 != r2) goto L7b
            goto L7c
        L7b:
            r2 = 0
        L7c:
            r0.d = r2
            int r1 = r9.readInt()
            if (r1 <= 0) goto L8b
            int[] r1 = new int[r1]
            r0.c = r1
            r9.readIntArray(r1)
        L8b:
            return r0
        L8c:
            androidx.versionedparcelable.ParcelImpl r0 = new androidx.versionedparcelable.ParcelImpl
            r0.<init>(r9)
            return r0
        L92:
            hw r0 = new hw
            r0.<init>(r9)
            int r9 = r9.readInt()
            r0.a = r9
            return r0
        L9e:
            int r0 = r9.readInt()
            int r9 = r9.readInt()
            zv r9 = defpackage.zv.a(r0, r9)
            return r9
        Lab:
            wt r0 = new wt
            r0.<init>(r9)
            java.lang.Class<wt> r1 = defpackage.wt.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r9 = r9.readValue(r1)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r0.a = r9
            return r0
        Lc3:
            xq r0 = new xq
            r0.<init>()
            int r1 = r9.readInt()
            r0.a = r1
            int r1 = r9.readInt()
            r0.b = r1
            int r9 = r9.readInt()
            r1 = 1
            if (r9 != r1) goto Ldc
            goto Ldd
        Ldc:
            r1 = 0
        Ldd:
            r0.c = r1
            return r0
        Le0:
            cm r0 = new cm
            r0.<init>(r9)
            return r0
        Le6:
            zl r0 = new zl
            r0.<init>()
            r1 = 0
            r0.e = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.g = r1
            android.os.Parcelable$Creator<cm> r1 = defpackage.cm.CREATOR
            java.util.ArrayList r1 = r9.createTypedArrayList(r1)
            r0.a = r1
            java.util.ArrayList r1 = r9.createStringArrayList()
            r0.b = r1
            android.os.Parcelable$Creator<c7> r1 = defpackage.c7.CREATOR
            java.lang.Object[] r1 = r9.createTypedArray(r1)
            c7[] r1 = (defpackage.c7[]) r1
            r0.c = r1
            int r1 = r9.readInt()
            r0.d = r1
            java.lang.String r1 = r9.readString()
            r0.e = r1
            java.util.ArrayList r1 = r9.createStringArrayList()
            r0.f = r1
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            java.util.ArrayList r1 = r9.createTypedArrayList(r1)
            r0.g = r1
            android.os.Parcelable$Creator<vl> r1 = defpackage.vl.CREATOR
            java.util.ArrayList r9 = r9.createTypedArrayList(r1)
            r0.h = r9
            return r0
        L137:
            vl r0 = new vl
            r0.<init>()
            java.lang.String r1 = r9.readString()
            r0.a = r1
            int r9 = r9.readInt()
            r0.b = r9
            return r0
        L149:
            cf r0 = new cf
            long r1 = r9.readLong()
            r0.<init>(r1)
            return r0
        L153:
            java.lang.Class<zv> r0 = defpackage.zv.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            android.os.Parcelable r1 = r9.readParcelable(r1)
            r3 = r1
            zv r3 = (defpackage.zv) r3
            java.lang.ClassLoader r1 = r0.getClassLoader()
            android.os.Parcelable r1 = r9.readParcelable(r1)
            r4 = r1
            zv r4 = (defpackage.zv) r4
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r9.readParcelable(r0)
            r6 = r0
            zv r6 = (defpackage.zv) r6
            java.lang.Class<cf> r0 = defpackage.cf.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r9.readParcelable(r0)
            r5 = r0
            cf r5 = (defpackage.cf) r5
            int r7 = r9.readInt()
            c8 r2 = new c8
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L18d:
            c7 r0 = new c7
            r0.<init>(r9)
            return r0
        L193:
            t4 r0 = new t4
            r0.<init>(r9)
            byte r9 = r9.readByte()
            if (r9 == 0) goto L1a0
            r9 = 1
            goto L1a1
        L1a0:
            r9 = 0
        L1a1:
            r0.a = r9
            return r0
        L1a4:
            u1 r0 = new u1
            r0.<init>(r9)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L2f;
                case 1: goto L2c;
                case 2: goto L29;
                case 3: goto L26;
                case 4: goto L23;
                case 5: goto L20;
                case 6: goto L1d;
                case 7: goto L1a;
                case 8: goto L17;
                case 9: goto L14;
                case 10: goto L11;
                case 11: goto Le;
                case 12: goto Lb;
                case 13: goto L8;
                default: goto L5;
            }
        L5:
            m40[] r2 = new defpackage.m40[r2]
            return r2
        L8:
            l40[] r2 = new defpackage.l40[r2]
            return r2
        Lb:
            androidx.versionedparcelable.ParcelImpl[] r2 = new androidx.versionedparcelable.ParcelImpl[r2]
            return r2
        Le:
            hw[] r2 = new defpackage.hw[r2]
            return r2
        L11:
            zv[] r2 = new defpackage.zv[r2]
            return r2
        L14:
            wt[] r2 = new defpackage.wt[r2]
            return r2
        L17:
            xq[] r2 = new defpackage.xq[r2]
            return r2
        L1a:
            cm[] r2 = new defpackage.cm[r2]
            return r2
        L1d:
            zl[] r2 = new defpackage.zl[r2]
            return r2
        L20:
            vl[] r2 = new defpackage.vl[r2]
            return r2
        L23:
            cf[] r2 = new defpackage.cf[r2]
            return r2
        L26:
            c8[] r2 = new defpackage.c8[r2]
            return r2
        L29:
            c7[] r2 = new defpackage.c7[r2]
            return r2
        L2c:
            t4[] r2 = new defpackage.t4[r2]
            return r2
        L2f:
            u1[] r2 = new defpackage.u1[r2]
            return r2
    }
}

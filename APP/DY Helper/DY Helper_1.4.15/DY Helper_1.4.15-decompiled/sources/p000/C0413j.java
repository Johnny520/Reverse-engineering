package p000;

/* JADX INFO: renamed from: j */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0413j implements android.os.Parcelable.Creator {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f5278;

    public /* synthetic */ C0413j(int r1) {
            r0 = this;
            r0.f5278 = r1
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r4) {
            r3 = this;
            int r3 = r3.f5278
            switch(r3) {
                case 0: goto L169;
                case 1: goto L158;
                case 2: goto L152;
                case 3: goto L14c;
                case 4: goto L13a;
                case 5: goto Leb;
                case 6: goto Le5;
                case 7: goto Ld9;
                case 8: goto Lbc;
                case 9: goto Lb0;
                case 10: goto Laa;
                case 11: goto La0;
                case 12: goto L96;
                case 13: goto L8c;
                case 14: goto L62;
                default: goto L5;
            }
        L5:
            uz1 r3 = new uz1
            r3.<init>()
            int r0 = r4.readInt()
            r3.f11034 = r0
            int r0 = r4.readInt()
            r3.f11035 = r0
            int r0 = r4.readInt()
            r3.f11036 = r0
            if (r0 <= 0) goto L25
            int[] r0 = new int[r0]
            r3.f11037 = r0
            r4.readIntArray(r0)
        L25:
            int r0 = r4.readInt()
            r3.f11038 = r0
            if (r0 <= 0) goto L34
            int[] r0 = new int[r0]
            r3.f11039 = r0
            r4.readIntArray(r0)
        L34:
            int r0 = r4.readInt()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L3e
            r0 = r2
            goto L3f
        L3e:
            r0 = r1
        L3f:
            r3.f11041 = r0
            int r0 = r4.readInt()
            if (r0 != r2) goto L49
            r0 = r2
            goto L4a
        L49:
            r0 = r1
        L4a:
            r3.f11042 = r0
            int r0 = r4.readInt()
            if (r0 != r2) goto L53
            r1 = r2
        L53:
            r3.f11043 = r1
            java.lang.Class<tz1> r0 = p000.tz1.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r4 = r4.readArrayList(r0)
            r3.f11040 = r4
            return r3
        L62:
            tz1 r3 = new tz1
            r3.<init>()
            int r0 = r4.readInt()
            r3.f10516 = r0
            int r0 = r4.readInt()
            r3.f10517 = r0
            int r0 = r4.readInt()
            r1 = 1
            if (r0 != r1) goto L7b
            goto L7c
        L7b:
            r1 = 0
        L7c:
            r3.f10519 = r1
            int r0 = r4.readInt()
            if (r0 <= 0) goto L8b
            int[] r0 = new int[r0]
            r3.f10518 = r0
            r4.readIntArray(r0)
        L8b:
            return r3
        L8c:
            v91 r3 = new v91
            long r0 = r4.readLong()
            r3.<init>(r0)
            return r3
        L96:
            u91 r3 = new u91
            int r4 = r4.readInt()
            r3.<init>(r4)
            return r3
        La0:
            t91 r3 = new t91
            float r4 = r4.readFloat()
            r3.<init>(r4)
            return r3
        Laa:
            androidx.versionedparcelable.ParcelImpl r3 = new androidx.versionedparcelable.ParcelImpl
            r3.<init>(r4)
            return r3
        Lb0:
            a31 r3 = new a31
            r3.<init>(r4)
            int r4 = r4.readInt()
            r3.f56 = r4
            return r3
        Lbc:
            cs0 r3 = new cs0
            r3.<init>()
            int r0 = r4.readInt()
            r3.f2734 = r0
            int r0 = r4.readInt()
            r3.f2735 = r0
            int r4 = r4.readInt()
            r0 = 1
            if (r4 != r0) goto Ld5
            goto Ld6
        Ld5:
            r0 = 0
        Ld6:
            r3.f2736 = r0
            return r3
        Ld9:
            l70 r3 = new l70
            r3.<init>(r4)
            java.lang.String r4 = r4.readString()
            r3.f6462 = r4
            return r3
        Le5:
            h70 r3 = new h70
            r3.<init>(r4)
            return r3
        Leb:
            c70 r3 = new c70
            r3.<init>()
            r0 = 0
            r3.f1978 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f1979 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f1980 = r0
            java.util.ArrayList r0 = r4.createStringArrayList()
            r3.f1974 = r0
            java.util.ArrayList r0 = r4.createStringArrayList()
            r3.f1975 = r0
            android.os.Parcelable$Creator<l8> r0 = p000.C0503l8.CREATOR
            java.lang.Object[] r0 = r4.createTypedArray(r0)
            l8[] r0 = (p000.C0503l8[]) r0
            r3.f1976 = r0
            int r0 = r4.readInt()
            r3.f1977 = r0
            java.lang.String r0 = r4.readString()
            r3.f1978 = r0
            java.util.ArrayList r0 = r4.createStringArrayList()
            r3.f1979 = r0
            android.os.Parcelable$Creator<m8> r0 = p000.C0540m8.CREATOR
            java.util.ArrayList r0 = r4.createTypedArrayList(r0)
            r3.f1980 = r0
            android.os.Parcelable$Creator<y60> r0 = p000.y60.CREATOR
            java.util.ArrayList r4 = r4.createTypedArrayList(r0)
            r3.f1981 = r4
            return r3
        L13a:
            y60 r3 = new y60
            r3.<init>()
            java.lang.String r0 = r4.readString()
            r3.f12469 = r0
            int r4 = r4.readInt()
            r3.f12470 = r4
            return r3
        L14c:
            m8 r3 = new m8
            r3.<init>(r4)
            return r3
        L152:
            l8 r3 = new l8
            r3.<init>(r4)
            return r3
        L158:
            w5 r3 = new w5
            r3.<init>(r4)
            byte r4 = r4.readByte()
            if (r4 == 0) goto L165
            r4 = 1
            goto L166
        L165:
            r4 = 0
        L166:
            r3.f11566 = r4
            return r3
        L169:
            k r3 = new k
            r3.<init>(r4)
            return r3
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r1) {
            r0 = this;
            int r0 = r0.f5278
            switch(r0) {
                case 0: goto L32;
                case 1: goto L2f;
                case 2: goto L2c;
                case 3: goto L29;
                case 4: goto L26;
                case 5: goto L23;
                case 6: goto L20;
                case 7: goto L1d;
                case 8: goto L1a;
                case 9: goto L17;
                case 10: goto L14;
                case 11: goto L11;
                case 12: goto Le;
                case 13: goto Lb;
                case 14: goto L8;
                default: goto L5;
            }
        L5:
            uz1[] r0 = new p000.uz1[r1]
            return r0
        L8:
            tz1[] r0 = new p000.tz1[r1]
            return r0
        Lb:
            v91[] r0 = new p000.v91[r1]
            return r0
        Le:
            u91[] r0 = new p000.u91[r1]
            return r0
        L11:
            t91[] r0 = new p000.t91[r1]
            return r0
        L14:
            androidx.versionedparcelable.ParcelImpl[] r0 = new androidx.versionedparcelable.ParcelImpl[r1]
            return r0
        L17:
            a31[] r0 = new p000.a31[r1]
            return r0
        L1a:
            cs0[] r0 = new p000.cs0[r1]
            return r0
        L1d:
            l70[] r0 = new p000.l70[r1]
            return r0
        L20:
            h70[] r0 = new p000.h70[r1]
            return r0
        L23:
            c70[] r0 = new p000.c70[r1]
            return r0
        L26:
            y60[] r0 = new p000.y60[r1]
            return r0
        L29:
            m8[] r0 = new p000.C0540m8[r1]
            return r0
        L2c:
            l8[] r0 = new p000.C0503l8[r1]
            return r0
        L2f:
            w5[] r0 = new p000.C0935w5[r1]
            return r0
        L32:
            k[] r0 = new p000.C0451k[r1]
            return r0
    }
}

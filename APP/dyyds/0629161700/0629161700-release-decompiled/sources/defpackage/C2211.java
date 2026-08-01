package defpackage;

/* JADX INFO: renamed from: ᲈᛳᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2211 implements android.os.Parcelable.Creator {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f9425;

    public /* synthetic */ C2211(int r1) {
            r0 = this;
            r0.f9425 = r1
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r7 = r7.f9425
            r0 = 1
            r1 = 0
            switch(r7) {
                case 0: goto L1b2;
                case 1: goto L1ac;
                case 2: goto Ld8;
                case 3: goto Lbc;
                case 4: goto Lb0;
                case 5: goto Laa;
                case 6: goto La4;
                case 7: goto L9e;
                case 8: goto L98;
                case 9: goto L92;
                case 10: goto L8c;
                case 11: goto L63;
                default: goto L7;
            }
        L7:
            ᲈᛵᛴᲇ r7 = new ᲈᛵᛴᲇ
            r7.<init>()
            int r2 = r8.readInt()
            r7.f9544 = r2
            int r2 = r8.readInt()
            r7.f9543 = r2
            int r2 = r8.readInt()
            r7.f9542 = r2
            if (r2 <= 0) goto L27
            int[] r2 = new int[r2]
            r7.f9546 = r2
            r8.readIntArray(r2)
        L27:
            int r2 = r8.readInt()
            r7.f9547 = r2
            if (r2 <= 0) goto L36
            int[] r2 = new int[r2]
            r7.f9538 = r2
            r8.readIntArray(r2)
        L36:
            int r2 = r8.readInt()
            if (r2 != r0) goto L3e
            r2 = r0
            goto L3f
        L3e:
            r2 = r1
        L3f:
            r7.f9545 = r2
            int r2 = r8.readInt()
            if (r2 != r0) goto L49
            r2 = r0
            goto L4a
        L49:
            r2 = r1
        L4a:
            r7.f9539 = r2
            int r2 = r8.readInt()
            if (r2 != r0) goto L53
            goto L54
        L53:
            r0 = r1
        L54:
            r7.f9540 = r0
            java.lang.Class<ᛵᛶᲁᲇ> r0 = defpackage.C0917.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r8 = r8.readArrayList(r0)
            r7.f9541 = r8
            return r7
        L63:
            ᛵᛶᲁᲇ r7 = new ᛵᛶᲁᲇ
            r7.<init>()
            int r2 = r8.readInt()
            r7.f4159 = r2
            int r2 = r8.readInt()
            r7.f4158 = r2
            int r2 = r8.readInt()
            if (r2 != r0) goto L7b
            goto L7c
        L7b:
            r0 = r1
        L7c:
            r7.f4160 = r0
            int r0 = r8.readInt()
            if (r0 <= 0) goto L8b
            int[] r0 = new int[r0]
            r7.f4157 = r0
            r8.readIntArray(r0)
        L8b:
            return r7
        L8c:
            ᛶᛲᲇᛴ r7 = new ᛶᛲᲇᛴ
            r7.<init>()
            return r7
        L92:
            ᛳᛲᛸᛸ r7 = new ᛳᛲᛸᛸ
            r7.<init>()
            return r7
        L98:
            ᛴᛳᲁᲈ r7 = new ᛴᛳᲁᲈ
            r7.<init>()
            return r7
        L9e:
            ᲁᲇᛸᲇ r7 = new ᲁᲇᛸᲇ
            r7.<init>()
            return r7
        La4:
            ᛵᛲᛶᛶ r7 = new ᛵᛲᛶᛶ
            r7.<init>()
            return r7
        Laa:
            androidx.versionedparcelable.ParcelImpl r7 = new androidx.versionedparcelable.ParcelImpl
            r7.<init>(r8)
            return r7
        Lb0:
            ᲁᲇᲈᛲ r7 = new ᲁᲇᲈᛲ
            r7.<init>(r8)
            int r8 = r8.readInt()
            r7.f8504 = r8
            return r7
        Lbc:
            ᛸᲈᛵᛶ r7 = new ᛸᲈᛵᛶ
            r7.<init>()
            int r2 = r8.readInt()
            r7.f7091 = r2
            int r2 = r8.readInt()
            r7.f7090 = r2
            int r8 = r8.readInt()
            if (r8 != r0) goto Ld4
            goto Ld5
        Ld4:
            r0 = r1
        Ld5:
            r7.f7089 = r0
            return r7
        Ld8:
            ᛴᛶᛴᲀ r7 = new ᛴᛶᛴᲀ
            r7.<init>()
            r2 = 0
            r7.f3318 = r2
            r7.f3317 = r1
            r7.f3316 = r1
            r7.f3320 = r1
            r7.f3315 = r2
            int r0 = r8.dataPosition()
            int r1 = r8.readInt()
            r2 = 4
            java.lang.String r3 = "Overflow in the size of parcelable"
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r1 < r2) goto L196
            int r2 = r8.dataPosition()     // Catch: java.lang.Throwable -> L194
            int r2 = r2 - r0
            if (r2 < r1) goto L10f
            int r4 = r4 - r1
            if (r0 > r4) goto L109
        L103:
            int r0 = r0 + r1
            r8.setDataPosition(r0)
            goto L18d
        L109:
            android.os.BadParcelableException r7 = new android.os.BadParcelableException
            r7.<init>(r3)
            throw r7
        L10f:
            long r5 = r8.readLong()     // Catch: java.lang.Throwable -> L194
            r7.f3318 = r5     // Catch: java.lang.Throwable -> L194
            int r2 = r8.dataPosition()     // Catch: java.lang.Throwable -> L194
            int r2 = r2 - r0
            if (r2 < r1) goto L126
            int r4 = r4 - r1
            if (r0 > r4) goto L120
            goto L103
        L120:
            android.os.BadParcelableException r7 = new android.os.BadParcelableException
            r7.<init>(r3)
            throw r7
        L126:
            int r2 = r8.readInt()     // Catch: java.lang.Throwable -> L194
            r7.f3317 = r2     // Catch: java.lang.Throwable -> L194
            int r2 = r8.dataPosition()     // Catch: java.lang.Throwable -> L194
            int r2 = r2 - r0
            if (r2 < r1) goto L13d
            int r4 = r4 - r1
            if (r0 > r4) goto L137
            goto L103
        L137:
            android.os.BadParcelableException r7 = new android.os.BadParcelableException
            r7.<init>(r3)
            throw r7
        L13d:
            int r2 = r8.readInt()     // Catch: java.lang.Throwable -> L194
            r7.f3316 = r2     // Catch: java.lang.Throwable -> L194
            int r2 = r8.dataPosition()     // Catch: java.lang.Throwable -> L194
            int r2 = r2 - r0
            if (r2 < r1) goto L154
            int r4 = r4 - r1
            if (r0 > r4) goto L14e
            goto L103
        L14e:
            android.os.BadParcelableException r7 = new android.os.BadParcelableException
            r7.<init>(r3)
            throw r7
        L154:
            java.lang.String r2 = r8.readString()     // Catch: java.lang.Throwable -> L194
            r7.f3319 = r2     // Catch: java.lang.Throwable -> L194
            int r2 = r8.dataPosition()     // Catch: java.lang.Throwable -> L194
            int r2 = r2 - r0
            if (r2 < r1) goto L16b
            int r4 = r4 - r1
            if (r0 > r4) goto L165
            goto L103
        L165:
            android.os.BadParcelableException r7 = new android.os.BadParcelableException
            r7.<init>(r3)
            throw r7
        L16b:
            int r2 = r8.readInt()     // Catch: java.lang.Throwable -> L194
            r7.f3320 = r2     // Catch: java.lang.Throwable -> L194
            int r2 = r8.dataPosition()     // Catch: java.lang.Throwable -> L194
            int r2 = r2 - r0
            if (r2 < r1) goto L182
            int r4 = r4 - r1
            if (r0 > r4) goto L17c
            goto L103
        L17c:
            android.os.BadParcelableException r7 = new android.os.BadParcelableException
            r7.<init>(r3)
            throw r7
        L182:
            long r5 = r8.readLong()     // Catch: java.lang.Throwable -> L194
            r7.f3315 = r5     // Catch: java.lang.Throwable -> L194
            int r4 = r4 - r1
            if (r0 > r4) goto L18e
            goto L103
        L18d:
            return r7
        L18e:
            android.os.BadParcelableException r7 = new android.os.BadParcelableException
            r7.<init>(r3)
            throw r7
        L194:
            r7 = move-exception
            goto L19e
        L196:
            android.os.BadParcelableException r7 = new android.os.BadParcelableException     // Catch: java.lang.Throwable -> L194
            java.lang.String r2 = "Parcelable too small"
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L194
            throw r7     // Catch: java.lang.Throwable -> L194
        L19e:
            int r4 = r4 - r1
            if (r0 <= r4) goto L1a7
            android.os.BadParcelableException r7 = new android.os.BadParcelableException
            r7.<init>(r3)
            throw r7
        L1a7:
            int r0 = r0 + r1
            r8.setDataPosition(r0)
            throw r7
        L1ac:
            ᛷᛱᛸᛵ r7 = new ᛷᛱᛸᛵ
            r7.<init>()
            return r7
        L1b2:
            ᲁᛴᛴᛸ r7 = new ᲁᛴᛴᛸ
            r7.<init>(r8)
            byte r8 = r8.readByte()
            if (r8 == 0) goto L1be
            goto L1bf
        L1be:
            r0 = r1
        L1bf:
            r7.f8039 = r0
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r1) {
            r0 = this;
            int r0 = r0.f9425
            switch(r0) {
                case 0: goto L29;
                case 1: goto L26;
                case 2: goto L23;
                case 3: goto L20;
                case 4: goto L1d;
                case 5: goto L1a;
                case 6: goto L17;
                case 7: goto L14;
                case 8: goto L11;
                case 9: goto Le;
                case 10: goto Lb;
                case 11: goto L8;
                default: goto L5;
            }
        L5:
            ᲈᛵᛴᲇ[] r0 = new defpackage.C2240[r1]
            return r0
        L8:
            ᛵᛶᲁᲇ[] r0 = new defpackage.C0917[r1]
            return r0
        Lb:
            ᛶᛲᲇᛴ[] r0 = new defpackage.C1028[r1]
            return r0
        Le:
            ᛳᛲᛸᛸ[] r0 = new defpackage.C0428[r1]
            return r0
        L11:
            ᛴᛳᲁᲈ[] r0 = new defpackage.C0642[r1]
            return r0
        L14:
            ᲁᲇᛸᲇ[] r0 = new defpackage.C1948[r1]
            return r0
        L17:
            ᛵᛲᛶᛶ[] r0 = new defpackage.C0829[r1]
            return r0
        L1a:
            androidx.versionedparcelable.ParcelImpl[] r0 = new androidx.versionedparcelable.ParcelImpl[r1]
            return r0
        L1d:
            ᲁᲇᲈᛲ[] r0 = new defpackage.C1954[r1]
            return r0
        L20:
            ᛸᲈᛵᛶ[] r0 = new defpackage.C1602[r1]
            return r0
        L23:
            ᛴᛶᛴᲀ[] r0 = new defpackage.C0690[r1]
            return r0
        L26:
            ᛷᛱᛸᛵ[] r0 = new defpackage.C1209[r1]
            return r0
        L29:
            ᲁᛴᛴᛸ[] r0 = new defpackage.C1843[r1]
            return r0
    }
}

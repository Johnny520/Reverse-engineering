package com.tencent.mmkv;

/* JADX INFO: loaded from: classes2.dex */
public final class ParcelableMMKV implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mmkv.ParcelableMMKV> CREATOR = null;
    private int ashmemFD;
    private int ashmemMetaFD;
    private java.lang.String cryptKey;
    private final java.lang.String mmapID;


    static {
            com.tencent.mmkv.ParcelableMMKV$1 r0 = new com.tencent.mmkv.ParcelableMMKV$1
            r0.<init>()
            com.tencent.mmkv.ParcelableMMKV.CREATOR = r0
            return
    }

    public ParcelableMMKV(com.tencent.mmkv.MMKV r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.ashmemFD = r0
            r1.ashmemMetaFD = r0
            r0 = 0
            r1.cryptKey = r0
            java.lang.String r0 = r2.mmapID()
            r1.mmapID = r0
            int r0 = r2.ashmemFD()
            r1.ashmemFD = r0
            int r0 = r2.ashmemMetaFD()
            r1.ashmemMetaFD = r0
            java.lang.String r0 = r2.cryptKey()
            r1.cryptKey = r0
            return
    }

    private ParcelableMMKV(java.lang.String r2, int r3, int r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.ashmemFD = r0
            r1.ashmemMetaFD = r0
            r0 = 0
            r1.cryptKey = r0
            r1.mmapID = r2
            r1.ashmemFD = r3
            r1.ashmemMetaFD = r4
            r1.cryptKey = r5
            return
    }

    /* synthetic */ ParcelableMMKV(java.lang.String r1, int r2, int r3, java.lang.String r4, com.tencent.mmkv.ParcelableMMKV.C04761 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 1
            return r0
    }

    public com.tencent.mmkv.MMKV toMMKV() {
            r4 = this;
            int r0 = r4.ashmemFD
            if (r0 < 0) goto L15
            int r0 = r4.ashmemMetaFD
            if (r0 < 0) goto L15
            java.lang.String r0 = r4.mmapID
            int r1 = r4.ashmemFD
            int r2 = r4.ashmemMetaFD
            java.lang.String r3 = r4.cryptKey
            com.tencent.mmkv.MMKV r0 = com.tencent.mmkv.MMKV.mmkvWithAshmemFD(r0, r1, r2, r3)
            return r0
        L15:
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r0 = r3.mmapID     // Catch: java.io.IOException -> L23
            r4.writeString(r0)     // Catch: java.io.IOException -> L23
            int r0 = r3.ashmemFD     // Catch: java.io.IOException -> L23
            android.os.ParcelFileDescriptor r0 = android.os.ParcelFileDescriptor.fromFd(r0)     // Catch: java.io.IOException -> L23
            int r1 = r3.ashmemMetaFD     // Catch: java.io.IOException -> L23
            android.os.ParcelFileDescriptor r1 = android.os.ParcelFileDescriptor.fromFd(r1)     // Catch: java.io.IOException -> L23
            r5 = r5 | 1
            r0.writeToParcel(r4, r5)     // Catch: java.io.IOException -> L23
            r1.writeToParcel(r4, r5)     // Catch: java.io.IOException -> L23
            java.lang.String r2 = r3.cryptKey     // Catch: java.io.IOException -> L23
            if (r2 == 0) goto L22
            java.lang.String r2 = r3.cryptKey     // Catch: java.io.IOException -> L23
            r4.writeString(r2)     // Catch: java.io.IOException -> L23
        L22:
            goto L27
        L23:
            r0 = move-exception
            r0.printStackTrace()
        L27:
            return
    }
}

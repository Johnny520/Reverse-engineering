package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
interface by extends android.os.IInterface {

    public static abstract class a extends android.os.Binder implements com.tendcloud.tenddata.by {
        public a() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.hihonor.cloudservice.oaid.IOAIDCallBack"
                r1.attachInterface(r1, r0)
                return
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r12, android.os.Parcel r13, android.os.Parcel r14, int r15) {
                r11 = this;
                java.lang.String r0 = "com.hihonor.cloudservice.oaid.IOAIDCallBack"
                r1 = 1
                if (r12 != r1) goto L34
                java.lang.String r12 = "transact first"
                java.lang.String[] r12 = new java.lang.String[]{r12}
                com.tendcloud.tenddata.h.iForInternal(r12)
                r13.enforceInterface(r0)
                int r3 = r13.readInt()
                long r4 = r13.readLong()
                int r12 = r13.readInt()
                if (r12 == 0) goto L21
                r6 = r1
                goto L23
            L21:
                r12 = 0
                r6 = r12
            L23:
                float r7 = r13.readFloat()
                double r8 = r13.readDouble()
                java.lang.String r10 = r13.readString()
                r2 = r11
                r2.callback(r3, r4, r6, r7, r8, r10)
                goto L7a
            L34:
                r2 = 2
                if (r12 == r2) goto L57
                java.lang.String r2 = "transact !2"
                java.lang.String[] r2 = new java.lang.String[]{r2}
                com.tendcloud.tenddata.h.iForInternal(r2)
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r12 == r2) goto L53
                java.lang.String r0 = "transact !transaction"
                java.lang.String[] r0 = new java.lang.String[]{r0}
                com.tendcloud.tenddata.h.iForInternal(r0)
                boolean r12 = super.onTransact(r12, r13, r14, r15)
                return r12
            L53:
                r14.writeString(r0)
                return r1
            L57:
                java.lang.String r12 = "transact else"
                java.lang.String[] r12 = new java.lang.String[]{r12}
                com.tendcloud.tenddata.h.iForInternal(r12)
                r13.enforceInterface(r0)
                int r12 = r13.readInt()
                int r15 = r13.readInt()
                if (r15 == 0) goto L76
                android.os.Parcelable$Creator r15 = android.os.Bundle.CREATOR
                java.lang.Object r13 = r15.createFromParcel(r13)
                android.os.Bundle r13 = (android.os.Bundle) r13
                goto L77
            L76:
                r13 = 0
            L77:
                r11.callback(r12, r13)
            L7a:
                r14.writeNoException()
                return r1
        }
    }

    void callback(int r1, long r2, boolean r4, float r5, double r6, java.lang.String r8);

    void callback(int r1, android.os.Bundle r2);
}

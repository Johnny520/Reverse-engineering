package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
class cc implements android.content.ServiceConnection {
    public com.tendcloud.tenddata.cb.a a;
    public java.util.concurrent.CountDownLatch b;
    public com.tendcloud.tenddata.cc.b c;
    public com.tendcloud.tenddata.cc.a d;

    public class a extends com.tendcloud.tenddata.by.a {
        public final /* synthetic */ com.tendcloud.tenddata.cc this$0;

        public a(com.tendcloud.tenddata.cc r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.tendcloud.tenddata.by
        public void callback(int r4, long r5, boolean r7, float r8, double r9, java.lang.String r11) {
                r3 = this;
                r0 = 2
                java.lang.String[] r0 = new java.lang.String[r0]
                r1 = 0
                java.lang.String r2 = "SSSS"
                r0[r1] = r2
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "OAIDCallback.callback("
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ","
                r1.append(r4)
                r1.append(r5)
                r1.append(r4)
                r1.append(r7)
                r1.append(r4)
                r1.append(r8)
                r1.append(r4)
                r1.append(r9)
                r1.append(r4)
                r1.append(r11)
                java.lang.String r4 = ")"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r5 = 1
                r0[r5] = r4
                com.tendcloud.tenddata.h.iForInternal(r0)
                return
        }

        @Override // com.tendcloud.tenddata.by
        public void callback(int r7, android.os.Bundle r8) {
                r6 = this;
                r0 = 2
                java.lang.String[] r1 = new java.lang.String[r0]
                r2 = 0
                java.lang.String r3 = "SSSS-AdvertisingIdPlatform"
                r1[r2] = r3
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "OAIDCallBack handleResult retcode="
                r4.append(r5)
                r4.append(r7)
                java.lang.String r5 = " retInfo="
                r4.append(r5)
                r4.append(r8)
                java.lang.String r4 = r4.toString()
                r5 = 1
                r1[r5] = r4
                com.tendcloud.tenddata.h.eForInternal(r1)
                if (r7 != 0) goto L57
                if (r8 != 0) goto L2c
                goto L57
            L2c:
                com.tendcloud.tenddata.cc r7 = r6.this$0
                com.tendcloud.tenddata.cb$a r7 = r7.a
                if (r7 == 0) goto L71
                java.lang.String r1 = "oa_id_flag"
                java.lang.String r8 = r8.getString(r1)
                r7.id = r8
                java.lang.String[] r7 = new java.lang.String[r0]
                r7[r2] = r3
                java.lang.String r8 = "OAIDCallBack handleResult success:"
                java.lang.StringBuilder r8 = p000.c4.m108(r8)
                com.tendcloud.tenddata.cc r0 = r6.this$0
                com.tendcloud.tenddata.cb$a r0 = r0.a
                java.lang.String r0 = r0.id
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                r7[r5] = r8
                com.tendcloud.tenddata.h.iForInternal(r7)
                goto L71
            L57:
                java.lang.String[] r8 = new java.lang.String[r0]
                r8[r2] = r3
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OAIDCallBack handleResult error retcode=$ "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                r8[r5] = r7
                com.tendcloud.tenddata.h.eForInternal(r8)
            L71:
                com.tendcloud.tenddata.cc r7 = r6.this$0
                java.util.concurrent.CountDownLatch r7 = r7.b
                r7.countDown()
                return
        }
    }

    public class b extends com.tendcloud.tenddata.by.a {
        public final /* synthetic */ com.tendcloud.tenddata.cc this$0;

        public b(com.tendcloud.tenddata.cc r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.tendcloud.tenddata.by
        public void callback(int r4, long r5, boolean r7, float r8, double r9, java.lang.String r11) {
                r3 = this;
                r0 = 2
                java.lang.String[] r0 = new java.lang.String[r0]
                r1 = 0
                java.lang.String r2 = "SSSS"
                r0[r1] = r2
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "OAIDLimitCallback.callback("
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ","
                r1.append(r4)
                r1.append(r5)
                r1.append(r4)
                r1.append(r7)
                r1.append(r4)
                r1.append(r8)
                r1.append(r4)
                r1.append(r9)
                r1.append(r4)
                r1.append(r11)
                java.lang.String r4 = ")"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r5 = 1
                r0[r5] = r4
                com.tendcloud.tenddata.h.iForInternal(r0)
                return
        }

        @Override // com.tendcloud.tenddata.by
        public void callback(int r7, android.os.Bundle r8) {
                r6 = this;
                r0 = 2
                java.lang.String[] r1 = new java.lang.String[r0]
                r2 = 0
                java.lang.String r3 = "SSSS-AdvertisingIdPlatform"
                r1[r2] = r3
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "OAIDCallBack handleResult retCode="
                r4.append(r5)
                r4.append(r7)
                java.lang.String r5 = " retInfo= "
                r4.append(r5)
                r4.append(r8)
                java.lang.String r4 = r4.toString()
                r5 = 1
                r1[r5] = r4
                com.tendcloud.tenddata.h.eForInternal(r1)
                if (r7 != 0) goto L59
                if (r8 != 0) goto L2c
                goto L59
            L2c:
                com.tendcloud.tenddata.cc r7 = r6.this$0
                com.tendcloud.tenddata.cb$a r7 = r7.a
                if (r7 == 0) goto L73
                java.lang.String r7 = "oa_id_limit_state"
                boolean r7 = r8.getBoolean(r7)
                com.tendcloud.tenddata.cc r8 = r6.this$0
                com.tendcloud.tenddata.cb$a r8 = r8.a
                r8.isLimit = r7
                java.lang.String[] r8 = new java.lang.String[r0]
                r8[r2] = r3
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OAIDLimitCallback handleResult success  isLimit="
                r0.append(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                r8[r5] = r7
                com.tendcloud.tenddata.h.iForInternal(r8)
                goto L73
            L59:
                java.lang.String[] r8 = new java.lang.String[r0]
                r8[r2] = r3
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OAIDLimitCallback handleResult error retCode= "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                r8[r5] = r7
                com.tendcloud.tenddata.h.eForInternal(r8)
            L73:
                com.tendcloud.tenddata.cc r7 = r6.this$0
                java.util.concurrent.CountDownLatch r7 = r7.b
                r7.countDown()
                return
        }
    }

    public cc() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 2
            r0.<init>(r1)
            r2.b = r0
            com.tendcloud.tenddata.cc$b r0 = new com.tendcloud.tenddata.cc$b
            r0.<init>(r2)
            r2.c = r0
            com.tendcloud.tenddata.cc$a r0 = new com.tendcloud.tenddata.cc$a
            r0.<init>(r2)
            r2.d = r0
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
            r3 = this;
            java.lang.String r4 = "SSSS-AdvertisingIdPlatform"
            java.lang.String r0 = "onServiceConnected "
            java.lang.String[] r4 = new java.lang.String[]{r4, r0}
            com.tendcloud.tenddata.h.iForInternal(r4)
            com.tendcloud.tenddata.cb$a r4 = new com.tendcloud.tenddata.cb$a
            r4.<init>()
            r3.a = r4
            java.lang.String r4 = "SSSS"
            if (r5 != 0) goto L20
            java.lang.String r5 = "service connected but service is null"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            com.tendcloud.tenddata.h.iForInternal(r4)
            goto L6b
        L20:
            java.lang.String r0 = "service connected and do get"
            java.lang.String[] r0 = new java.lang.String[]{r4, r0}
            com.tendcloud.tenddata.h.iForInternal(r0)
            java.lang.String r0 = "com.hihonor.cloudservice.oaid.IOAIDService"
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "local interface is null"
            java.lang.String[] r4 = new java.lang.String[]{r4, r0}
            com.tendcloud.tenddata.h.iForInternal(r4)
            goto L5c
        L3b:
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            java.lang.String r2 = "local interface class:"
            java.lang.StringBuilder r2 = p000.c4.m108(r2)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1[r4] = r0
            com.tendcloud.tenddata.h.iForInternal(r1)
        L5c:
            com.tendcloud.tenddata.ch$a$a r4 = new com.tendcloud.tenddata.ch$a$a
            r4.<init>(r5)
            com.tendcloud.tenddata.cc$a r5 = r3.d
            r4.a(r5)
            com.tendcloud.tenddata.cc$b r5 = r3.c
            r4.b(r5)
        L6b:
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName r2) {
            r1 = this;
            java.lang.String r2 = "AdvertisingIdPlatform"
            java.lang.String r0 = "onServiceDisconnected "
            java.lang.String[] r2 = new java.lang.String[]{r2, r0}
            com.tendcloud.tenddata.h.iForInternal(r2)
            java.util.concurrent.CountDownLatch r2 = r1.b
            r2.countDown()
            java.util.concurrent.CountDownLatch r2 = r1.b
            r2.countDown()
            return
    }

    public final void unbind(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "AdvertisingIdPlatform"
            java.lang.String r1 = "disconnect"
            java.lang.String[] r1 = new java.lang.String[]{r0, r1}
            com.tendcloud.tenddata.h.iForInternal(r1)
            r4.unbindService(r3)     // Catch: java.lang.Exception -> Lf
            goto L2d
        Lf:
            r4 = move-exception
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            java.lang.String r2 = "OAIDClientImpl#disconnect#Disconnect error::"
            java.lang.StringBuilder r2 = p000.c4.m108(r2)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1[r0] = r4
            com.tendcloud.tenddata.h.eForInternal(r1)
        L2d:
            return
    }
}

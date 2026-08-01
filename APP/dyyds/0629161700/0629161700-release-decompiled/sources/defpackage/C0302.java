package defpackage;

/* JADX INFO: renamed from: ᛲᛶᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0302 implements defpackage.InterfaceC0126, defpackage.InterfaceC0319, defpackage.InterfaceC0373 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.lang.Object f1615;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.Object f1616;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1617;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public java.lang.Object f1618;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public java.lang.Object f1619;

    static {
            return
    }

    public C0302(int r1) {
            r0 = this;
            r0.f1617 = r1
            switch(r1) {
                case 3: goto L30;
                case 6: goto L17;
                default: goto L5;
            }
        L5:
            r0.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r1.<init>()
            r0.f1616 = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f1618 = r1
            return
        L17:
            r0.<init>()
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.f1615 = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.f1618 = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.f1619 = r1
            return
        L30:
            r0.<init>()
            return
    }

    public C0302(android.content.Context r2, android.view.ActionMode.Callback r3) {
            r1 = this;
            r0 = 8
            r1.f1617 = r0
            r1.<init>()
            r1.f1615 = r2
            r1.f1616 = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f1619 = r2
            ᛸᲇᛲᛶ r2 = new ᛸᲇᛲᛶ
            r3 = 0
            r2.<init>(r3)
            r1.f1618 = r2
            return
    }

    public C0302(android.graphics.Typeface r8, defpackage.C1688 r9) {
            r7 = this;
            r0 = 7
            r7.f1617 = r0
            r7.<init>()
            r7.f1619 = r8
            r7.f1616 = r9
            ᲇᛵᲁᛲ r8 = new ᲇᛵᲁᛲ
            r0 = 1024(0x400, float:1.435E-42)
            r8.<init>(r0)
            r7.f1618 = r8
            r8 = 6
            int r0 = r9.m2420(r8)
            r1 = 0
            if (r0 == 0) goto L30
            int r2 = r9.f5768
            int r0 = r0 + r2
            java.lang.Object r2 = r9.f5769
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r0)
            int r2 = r2 + r0
            java.lang.Object r0 = r9.f5769
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt(r2)
            goto L31
        L30:
            r0 = r1
        L31:
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            r7.f1615 = r0
            int r8 = r9.m2420(r8)
            if (r8 == 0) goto L52
            int r0 = r9.f5768
            int r8 = r8 + r0
            java.lang.Object r0 = r9.f5769
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt(r8)
            int r0 = r0 + r8
            java.lang.Object r8 = r9.f5769
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            int r8 = r8.getInt(r0)
            goto L53
        L52:
            r8 = r1
        L53:
            r9 = r1
        L54:
            if (r9 >= r8) goto Ld8
            ᛵᛸᛸᛳ r0 = new ᛵᛸᛸᛳ
            r0.<init>(r7, r9)
            ᲈᛱᛵᛱ r2 = r0.m1901()
            r3 = 4
            int r3 = r2.m2420(r3)
            if (r3 == 0) goto L72
            java.lang.Object r4 = r2.f5769
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r2 = r2.f5768
            int r3 = r3 + r2
            int r2 = r4.getInt(r3)
            goto L73
        L72:
            r2 = r1
        L73:
            java.lang.Object r3 = r7.f1615
            char[] r3 = (char[]) r3
            int r4 = r9 * 2
            java.lang.Character.toChars(r2, r3, r4)
            ᲈᛱᛵᛱ r2 = r0.m1901()
            r3 = 16
            int r4 = r2.m2420(r3)
            if (r4 == 0) goto L9d
            int r5 = r2.f5768
            int r4 = r4 + r5
            java.lang.Object r5 = r2.f5769
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r5 = r5.getInt(r4)
            int r5 = r5 + r4
            java.lang.Object r2 = r2.f5769
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r5)
            goto L9e
        L9d:
            r2 = r1
        L9e:
            r4 = 1
            if (r2 <= 0) goto La3
            r2 = r4
            goto La4
        La3:
            r2 = r1
        La4:
            if (r2 == 0) goto Ld1
            java.lang.Object r2 = r7.f1618
            ᲇᛵᲁᛲ r2 = (defpackage.C2055) r2
            ᲈᛱᛵᛱ r5 = r0.m1901()
            int r3 = r5.m2420(r3)
            if (r3 == 0) goto Lc9
            int r6 = r5.f5768
            int r3 = r3 + r6
            java.lang.Object r6 = r5.f5769
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            int r6 = r6.getInt(r3)
            int r6 = r6 + r3
            java.lang.Object r3 = r5.f5769
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r6)
            goto Lca
        Lc9:
            r3 = r1
        Lca:
            int r3 = r3 - r4
            r2.m3456(r0, r1, r3)
            int r9 = r9 + 1
            goto L54
        Ld1:
            java.lang.String r7 = "invalid metadata codepoint length"
            defpackage.C2264.m3684(r7)
            r7 = 0
            throw r7
        Ld8:
            return
    }

    public C0302(android.widget.LinearLayout r1, android.widget.Switch r2, android.widget.LinearLayout r3, android.widget.TextView r4, android.view.View r5, android.widget.TextView r6, android.widget.LinearLayout r7, android.widget.TextView r8, android.widget.LinearLayout r9, android.widget.TextView r10, android.widget.LinearLayout r11, android.widget.Switch r12, android.widget.EditText r13, android.widget.Switch r14, android.widget.Switch r15, android.widget.Switch r16, android.widget.Switch r17, android.widget.Switch r18, android.widget.Switch r19, android.widget.Switch r20, android.widget.Switch r21, android.widget.Switch r22, android.widget.Switch r23, android.widget.TextView r24, android.widget.TextView r25, android.widget.Switch r26, android.widget.Switch r27, android.widget.EditText r28, android.widget.LinearLayout r29, android.widget.EditText r30) {
            r0 = this;
            r1 = 2
            r0.f1617 = r1
            r0.<init>()
            r0.f1616 = r6
            r0.f1615 = r10
            r1 = r27
            r0.f1618 = r1
            r1 = r29
            r0.f1619 = r1
            return
    }

    public C0302(java.io.File r3) {
            r2 = this;
            r0 = 5
            r2.f1617 = r0
            r2.<init>()
            ᛴᛵᲇᲇ r0 = new ᛴᛵᲇᲇ
            r1 = 17
            r0.<init>(r1)
            r2.f1618 = r0
            r2.f1615 = r3
            ᲁᛷᛵ r3 = new ᲁᛷᛵ
            r0 = 4
            r3.<init>(r0)
            r2.f1616 = r3
            return
    }

    public C0302(java.net.Socket r2) {
            r1 = this;
            r0 = 4
            r1.f1617 = r0
            r1.<init>()
            r1.f1616 = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>()
            r1.f1615 = r2
            ᛵᛶᛸᲁ r2 = new ᛵᛶᛸᲁ
            r2.<init>(r1)
            r1.f1618 = r2
            ᛵᛵᲁᛷ r2 = new ᛵᛵᲁᛷ
            r2.<init>(r1)
            r1.f1619 = r2
            return
    }

    public C0302(java.util.ArrayList r2, defpackage.C2220 r3, defpackage.C2063 r4, android.content.ContentResolver r5) {
            r1 = this;
            r0 = 0
            r1.f1617 = r0
            r1.<init>()
            r1.f1616 = r3
            r1.f1615 = r4
            r1.f1618 = r5
            r1.f1619 = r2
            return
    }

    @Override // defpackage.InterfaceC0319
    public defpackage.InterfaceC2182 getSource() {
            r0 = this;
            java.lang.Object r0 = r0.f1618
            ᛵᛶᛸᲁ r0 = (defpackage.C0916) r0
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f1617
            switch(r0) {
                case 4: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.Object r1 = r1.f1616
            java.net.Socket r1 = (java.net.Socket) r1
            java.lang.String r1 = r1.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public boolean m959(defpackage.AbstractC1115 r3, android.view.MenuItem r4) {
            r2 = this;
            java.lang.Object r0 = r2.f1616
            android.view.ActionMode$Callback r0 = (android.view.ActionMode.Callback) r0
            ᛲᛱᛷᲈ r3 = r2.m963(r3)
            ᲀᛸᛱᲈ r1 = new ᲀᛸᛱᲈ
            java.lang.Object r2 = r2.f1615
            android.content.Context r2 = (android.content.Context) r2
            ᛵᲈᛶᛲ r4 = (defpackage.InterfaceMenuItemC0997) r4
            r1.<init>(r2, r4)
            boolean r2 = r0.onActionItemClicked(r3, r1)
            return r2
    }

    @Override // defpackage.InterfaceC0373
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public void mo960(defpackage.InterfaceC1711 r8, defpackage.C1326 r9) {
            r7 = this;
            java.lang.String r0 = "Had two simultaneous puts for: "
            java.lang.String r1 = "Put: Obtained: "
            java.lang.Object r2 = r7.f1616
            ᲁᛷᛵ r2 = (defpackage.C1884) r2
            java.lang.String r2 = r2.m3303(r8)
            java.lang.Object r3 = r7.f1618
            ᛴᛵᲇᲇ r3 = (defpackage.C0682) r3
            monitor-enter(r3)
            java.lang.Object r4 = r3.f3286     // Catch: java.lang.Throwable -> L3c
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L3c
            ᛵᲈᛳᲇ r4 = (defpackage.C0994) r4     // Catch: java.lang.Throwable -> L3c
            if (r4 != 0) goto L42
            java.lang.Object r4 = r3.f3285     // Catch: java.lang.Throwable -> L3c
            ᛸᛴᛱᛸ r4 = (defpackage.C1467) r4     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayDeque r5 = r4.f6497     // Catch: java.lang.Throwable -> L3c
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayDeque r4 = r4.f6497     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L3f
            ᛵᲈᛳᲇ r4 = (defpackage.C0994) r4     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3f
            if (r4 != 0) goto L34
            ᛵᲈᛳᲇ r4 = new ᛵᲈᛳᲇ     // Catch: java.lang.Throwable -> L3c
            r4.<init>()     // Catch: java.lang.Throwable -> L3c
        L34:
            java.lang.Object r5 = r3.f3286     // Catch: java.lang.Throwable -> L3c
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch: java.lang.Throwable -> L3c
            r5.put(r2, r4)     // Catch: java.lang.Throwable -> L3c
            goto L42
        L3c:
            r7 = move-exception
            goto Lde
        L3f:
            r7 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3f
            throw r7     // Catch: java.lang.Throwable -> L3c
        L42:
            int r5 = r4.f4436     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            int r5 = r5 + r6
            r4.f4436 = r5     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.locks.ReentrantLock r3 = r4.f4435
            r3.lock()
            java.lang.String r3 = "DiskLruCacheWrapper"
            r4 = 2
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch: java.lang.Throwable -> L71
            if (r3 == 0) goto L73
            java.lang.String r3 = "DiskLruCacheWrapper"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L71
            r4.append(r2)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = " for for Key: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L71
            r4.append(r8)     // Catch: java.lang.Throwable -> L71
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L71
            android.util.Log.v(r3, r8)     // Catch: java.lang.Throwable -> L71
            goto L73
        L71:
            r8 = move-exception
            goto Ld6
        L73:
            ᛲᛲᛳᛳ r8 = r7.m968()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> Lb0
            ᛸᲈᛸᲈ r1 = r8.m866(r2)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> Lb0
            if (r1 == 0) goto L85
        L7d:
            java.lang.Object r7 = r7.f1618
            ᛴᛵᲇᲇ r7 = (defpackage.C0682) r7
            r7.m1566(r2)
            return
        L85:
            ᛴᛷᛳᲀ r8 = r8.m863(r2)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> Lb0
            if (r8 == 0) goto Lbb
            java.io.File r0 = r8.m1595()     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r1 = r9.f5856     // Catch: java.lang.Throwable -> Lb2
            ᛷᲇᲇᛴ r1 = (defpackage.InterfaceC1393) r1     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r3 = r9.f5857     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r9 = r9.f5859     // Catch: java.lang.Throwable -> Lb2
            ᛳᛸᲁᛶ r9 = (defpackage.C0533) r9     // Catch: java.lang.Throwable -> Lb2
            boolean r9 = r1.mo1359(r3, r0, r9)     // Catch: java.lang.Throwable -> Lb2
            if (r9 == 0) goto La8
            java.lang.Object r9 = r8.f3353     // Catch: java.lang.Throwable -> Lb2
            ᛲᛲᛳᛳ r9 = (defpackage.C0246) r9     // Catch: java.lang.Throwable -> Lb2
            r9.m871(r8, r6)     // Catch: java.lang.Throwable -> Lb2
            r8.f3355 = r6     // Catch: java.lang.Throwable -> Lb2
        La8:
            boolean r9 = r8.f3355     // Catch: java.lang.Throwable -> L71 java.io.IOException -> Lb0
            if (r9 != 0) goto L7d
            r8.m1597()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> L7d
            goto L7d
        Lb0:
            r8 = move-exception
            goto Lc5
        Lb2:
            r9 = move-exception
            boolean r0 = r8.f3355     // Catch: java.lang.Throwable -> L71 java.io.IOException -> Lb0
            if (r0 != 0) goto Lba
            r8.m1597()     // Catch: java.lang.Throwable -> L71 java.io.IOException -> Lba
        Lba:
            throw r9     // Catch: java.lang.Throwable -> L71 java.io.IOException -> Lb0
        Lbb:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71 java.io.IOException -> Lb0
            java.lang.String r9 = r0.concat(r2)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> Lb0
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L71 java.io.IOException -> Lb0
            throw r8     // Catch: java.lang.Throwable -> L71 java.io.IOException -> Lb0
        Lc5:
            java.lang.String r9 = "DiskLruCacheWrapper"
            r0 = 5
            boolean r9 = android.util.Log.isLoggable(r9, r0)     // Catch: java.lang.Throwable -> L71
            if (r9 == 0) goto L7d
            java.lang.String r9 = "DiskLruCacheWrapper"
            java.lang.String r0 = "Unable to put to disk cache"
            android.util.Log.w(r9, r0, r8)     // Catch: java.lang.Throwable -> L71
            goto L7d
        Ld6:
            java.lang.Object r7 = r7.f1618
            ᛴᛵᲇᲇ r7 = (defpackage.C0682) r7
            r7.m1566(r2)
            throw r8
        Lde:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            throw r7
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public boolean m961(defpackage.AbstractC1115 r4, defpackage.MenuC1701 r5) {
            r3 = this;
            java.lang.Object r0 = r3.f1616
            android.view.ActionMode$Callback r0 = (android.view.ActionMode.Callback) r0
            ᛲᛱᛷᲈ r4 = r3.m963(r4)
            java.lang.Object r1 = r3.f1618
            ᛸᲇᛲᛶ r1 = (defpackage.C1580) r1
            java.lang.Object r2 = r1.get(r5)
            android.view.Menu r2 = (android.view.Menu) r2
            if (r2 != 0) goto L20
            ᲀᲁᛲᛸ r2 = new ᲀᲁᛲᛸ
            java.lang.Object r3 = r3.f1615
            android.content.Context r3 = (android.content.Context) r3
            r2.<init>(r3, r5)
            r1.put(r5, r2)
        L20:
            boolean r3 = r0.onCreateActionMode(r4, r2)
            return r3
    }

    @Override // defpackage.InterfaceC0373
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.io.File mo962(defpackage.InterfaceC1711 r5) {
            r4 = this;
            java.lang.Object r0 = r4.f1616
            ᲁᛷᛵ r0 = (defpackage.C1884) r0
            java.lang.String r0 = r0.m3303(r5)
            r1 = 2
            java.lang.String r2 = "DiskLruCacheWrapper"
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Get: Obtained: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r3 = " for for Key: "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            android.util.Log.v(r2, r5)
        L2a:
            ᛲᛲᛳᛳ r4 = r4.m968()     // Catch: java.io.IOException -> L3c
            ᛸᲈᛸᲈ r4 = r4.m866(r0)     // Catch: java.io.IOException -> L3c
            if (r4 == 0) goto L49
            java.lang.Object r4 = r4.f7101     // Catch: java.io.IOException -> L3c
            java.io.File[] r4 = (java.io.File[]) r4     // Catch: java.io.IOException -> L3c
            r5 = 0
            r4 = r4[r5]     // Catch: java.io.IOException -> L3c
            return r4
        L3c:
            r4 = move-exception
            r5 = 5
            boolean r5 = android.util.Log.isLoggable(r2, r5)
            if (r5 == 0) goto L49
            java.lang.String r5 = "Unable to get from disk cache"
            android.util.Log.w(r2, r5, r4)
        L49:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.C0237 m963(defpackage.AbstractC1115 r6) {
            r5 = this;
            java.lang.Object r0 = r5.f1619
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L1b
            java.lang.Object r3 = r0.get(r2)
            ᛲᛱᛷᲈ r3 = (defpackage.C0237) r3
            if (r3 == 0) goto L18
            ᛶᛷᛸᲈ r4 = r3.f1422
            if (r4 != r6) goto L18
            return r3
        L18:
            int r2 = r2 + 1
            goto L9
        L1b:
            ᛲᛱᛷᲈ r1 = new ᛲᛱᛷᲈ
            java.lang.Object r5 = r5.f1615
            android.content.Context r5 = (android.content.Context) r5
            r1.<init>(r5, r6)
            r0.add(r1)
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public void m964(defpackage.C1065 r6) {
            r5 = this;
            java.util.TimeZone r0 = defpackage.AbstractC0508.f2501
            java.util.concurrent.ExecutorService r0 = r5.m966()
            boolean r0 = r0.isShutdown()
            monitor-enter(r5)
            java.lang.Object r1 = r5.f1619     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L22
            boolean r6 = r1.remove(r6)     // Catch: java.lang.Throwable -> L22
            if (r6 == 0) goto L9a
            if (r0 != 0) goto L25
            java.lang.Object r6 = r5.f1618     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r6 = (java.util.ArrayDeque) r6     // Catch: java.lang.Throwable -> L22
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L22
            if (r6 == 0) goto L2d
            goto L25
        L22:
            r6 = move-exception
            goto La2
        L25:
            java.lang.Object r6 = r5.f1619     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r6 = (java.util.ArrayDeque) r6     // Catch: java.lang.Throwable -> L22
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L22
        L2d:
            r6 = 17
            r1 = 0
            if (r0 == 0) goto L47
            java.lang.Object r2 = r5.f1615     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2     // Catch: java.lang.Throwable -> L22
            java.util.List r2 = defpackage.AbstractC1107.m2113(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r3 = r5.f1615     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L22
            r3.clear()     // Catch: java.lang.Throwable -> L22
            ᛸᲈᛸᲈ r3 = new ᛸᲈᛸᲈ     // Catch: java.lang.Throwable -> L22
            r3.<init>(r6, r2)     // Catch: java.lang.Throwable -> L22
            goto L79
        L47:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L22
            r2.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.Object r3 = r5.f1615     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L22
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L74
            java.lang.Object r3 = r3.next()     // Catch: java.lang.Throwable -> L22
            if (r3 != 0) goto L6e
            java.lang.Object r3 = r5.f1618     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L22
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L22
            r4 = 64
            if (r3 < r4) goto L6d
            goto L74
        L6d:
            throw r1     // Catch: java.lang.Throwable -> L22
        L6e:
            java.lang.ClassCastException r6 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L22
            r6.<init>()     // Catch: java.lang.Throwable -> L22
            throw r6     // Catch: java.lang.Throwable -> L22
        L74:
            ᛸᲈᛸᲈ r3 = new ᛸᲈᛸᲈ     // Catch: java.lang.Throwable -> L22
            r3.<init>(r6, r2)     // Catch: java.lang.Throwable -> L22
        L79:
            monitor-exit(r5)
            java.lang.Object r6 = r3.f7101
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            if (r6 <= 0) goto L99
            java.lang.Object r6 = r3.f7101
            java.util.List r6 = (java.util.List) r6
            r2 = 0
            java.lang.Object r6 = r6.get(r2)
            if (r6 != 0) goto L96
            if (r0 == 0) goto L92
            throw r1
        L92:
            r5.m966()
            throw r1
        L96:
            defpackage.C2264.m3679()
        L99:
            return
        L9a:
            java.lang.String r6 = "Call wasn't in-flight!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L22
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        La2:
            monitor-exit(r5)
            throw r6
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.C1184 m965() {
            r4 = this;
            java.lang.Object r0 = r4.f1616
            ᛸᲈᛸᲈ r0 = (defpackage.C1606) r0
            if (r0 == 0) goto Lc
            java.lang.Object r1 = r4.f1615
            ᛱᲈᲇ r1 = (defpackage.C0226) r1
            if (r1 != 0) goto L27
        Lc:
            ᛸᛵᛲᛶ r1 = defpackage.C1485.f6572
            if (r0 != 0) goto L1b
            r1.getClass()
            ᛸᲈᛸᲈ r0 = new ᛸᲈᛸᲈ
            r2 = 0
            r0.<init>(r2)
            r4.f1616 = r0
        L1b:
            java.lang.Object r2 = r4.f1615
            ᛱᲈᲇ r2 = (defpackage.C0226) r2
            if (r2 != 0) goto L26
            ᛱᲈᲇ r1 = r1.f6573
            r4.f1615 = r1
            goto L27
        L26:
            r1 = r2
        L27:
            ᛶᲈᛵᛲ r2 = new ᛶᲈᛵᛲ
            java.lang.Object r3 = r4.f1618
            java.util.EnumSet r3 = (java.util.EnumSet) r3
            java.lang.Object r4 = r4.f1619
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r2.<init>(r0, r1, r3, r4)
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public synchronized java.util.concurrent.ExecutorService m966() {
            r9 = this;
            monitor-enter(r9)
            java.lang.Object r0 = r9.f1616     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L38
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> L36
            r7.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r0.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = defpackage.AbstractC0508.f2502     // Catch: java.lang.Throwable -> L36
            r0.append(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = " Dispatcher"
            r0.append(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L36
            ᛳᛴᛵᛷ r8 = new ᛳᛴᛵᛷ     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r8.<init>(r0, r2)     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 60
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L36
            r9.f1616 = r1     // Catch: java.lang.Throwable -> L36
            r0 = r1
            goto L38
        L36:
            r0 = move-exception
            goto L3a
        L38:
            monitor-exit(r9)
            return r0
        L3a:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L36
            throw r0
    }

    @Override // defpackage.InterfaceC0319
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.InterfaceC2085 mo967() {
            r0 = this;
            java.lang.Object r0 = r0.f1619
            ᛵᛵᲁᛷ r0 = (defpackage.C0899) r0
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public synchronized defpackage.C0246 m968() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.f1619     // Catch: java.lang.Throwable -> L12
            ᛲᛲᛳᛳ r0 = (defpackage.C0246) r0     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            java.lang.Object r0 = r1.f1615     // Catch: java.lang.Throwable -> L12
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L12
            ᛲᛲᛳᛳ r0 = defpackage.C0246.m862(r0)     // Catch: java.lang.Throwable -> L12
            r1.f1619 = r0     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r0 = move-exception
            goto L16
        L14:
            monitor-exit(r1)
            return r0
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r0
    }
}

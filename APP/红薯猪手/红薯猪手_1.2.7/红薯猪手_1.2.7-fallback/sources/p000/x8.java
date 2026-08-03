package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x8 {

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final java.util.concurrent.atomic.AtomicInteger f1172 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final p000.z7 f1173;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final ۟.w8.a f1174;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f1175;

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            p000.x8.f1172 = r0
            return
    }

    public x8(p000.z7 r2, android.net.Uri r3) {
            r1 = this;
            r1.<init>()
            r1.f1173 = r2
            ۟.w8$a r0 = new ۟.w8$a
            android.graphics.Bitmap$Config r2 = r2.f1259
            r0.<init>(r3, r2)
            r1.f1174 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m462(android.widget.ImageView r19, p000.f0 r20) {
            r18 = this;
            r0 = r18
            r3 = r19
            long r1 = java.lang.System.nanoTime()
            java.lang.StringBuilder r4 = p000.ic.f502
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            java.lang.Thread r4 = r4.getThread()
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            if (r4 != r5) goto L1a
            r4 = 1
            goto L1b
        L1a:
            r4 = 0
        L1b:
            if (r4 == 0) goto L15e
            ۟.w8$a r4 = r0.f1174
            android.net.Uri r5 = r4.f1144
            if (r5 != 0) goto L2a
            int r4 = r4.f1145
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r4 = 0
            goto L2b
        L2a:
            r4 = 1
        L2b:
            r5 = 0
            if (r4 != 0) goto L4a
            ۟.z7 r1 = r0.f1173
            r1.m496(r3)
            android.graphics.Paint r1 = p000.a8.f92
            r3.setImageDrawable(r5)
            android.graphics.drawable.Drawable r1 = r19.getDrawable()
            boolean r1 = r1 instanceof android.graphics.drawable.AnimationDrawable
            if (r1 == 0) goto L49
            android.graphics.drawable.Drawable r1 = r19.getDrawable()
            android.graphics.drawable.AnimationDrawable r1 = (android.graphics.drawable.AnimationDrawable) r1
            r1.start()
        L49:
            return
        L4a:
            java.util.concurrent.atomic.AtomicInteger r4 = p000.x8.f1172
            int r4 = r4.getAndIncrement()
            ۟.w8$a r5 = r0.f1174
            int r8 = r5.f1147
            if (r8 != 0) goto L59
            r8 = 2
            r5.f1147 = r8
        L59:
            ۟.w8 r8 = new ۟.w8
            android.net.Uri r15 = r5.f1144
            int r14 = r5.f1145
            r13 = 0
            r5.getClass()
            r12 = 0
            r5.getClass()
            android.graphics.Bitmap$Config r11 = r5.f1146
            int r5 = r5.f1147
            r9 = r8
            r10 = r15
            r16 = r11
            r11 = r14
            r17 = r12
            r12 = r13
            r6 = r13
            r13 = r17
            r7 = r14
            r14 = r16
            r16 = r15
            r15 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r8.f1127 = r4
            r8.f1128 = r1
            ۟.z7 r1 = r0.f1173
            boolean r1 = r1.f1261
            if (r1 == 0) goto L8f
            r8.m456()
            r8.toString()
        L8f:
            ۟.z7 r1 = r0.f1173
            ۟.z7$f r1 = r1.f1250
            ۟.z7$f$a r1 = (۟.z7.f.a) r1
            r1.getClass()
            java.lang.StringBuilder r1 = p000.ic.f502
            r2 = 50
            if (r16 == 0) goto Lae
            java.lang.String r4 = r16.toString()
            int r5 = r4.length()
            int r5 = r5 + r2
            r1.ensureCapacity(r5)
            r1.append(r4)
            goto Lb4
        Lae:
            r1.ensureCapacity(r2)
            r1.append(r7)
        Lb4:
            r2 = 10
            r1.append(r2)
            r4 = 0
            int r5 = (r4 > r4 ? 1 : (r4 == r4 ? 0 : -1))
            r7 = 120(0x78, float:1.68E-43)
            if (r5 == 0) goto Lcb
            java.lang.String r5 = "rotation:"
            r1.append(r5)
            r1.append(r4)
            r1.append(r2)
        Lcb:
            boolean r4 = r8.m453()
            if (r4 == 0) goto Le4
            java.lang.String r4 = "resize:"
            r1.append(r4)
            r1.append(r6)
            r1.append(r7)
            r4 = r17
            r1.append(r4)
            r1.append(r2)
        Le4:
            java.lang.String r5 = r1.toString()
            java.lang.StringBuilder r1 = p000.ic.f502
            r2 = 0
            r1.setLength(r2)
            ۟.z7 r1 = r0.f1173
            ۟.e0 r4 = r1.f1254
            ۟.h5 r4 = (p000.h5) r4
            android.graphics.Bitmap r4 = r4.m192(r5)
            ۟.fa r1 = r1.f1255
            if (r4 == 0) goto L102
            ۟.fa$a r1 = r1.f365
            r1.sendEmptyMessage(r2)
            goto L108
        L102:
            ۟.fa$a r1 = r1.f365
            r2 = 1
            r1.sendEmptyMessage(r2)
        L108:
            if (r4 == 0) goto L132
            ۟.z7 r1 = r0.f1173
            r1.m496(r3)
            ۟.z7 r1 = r0.f1173
            android.content.Context r2 = r1.f1252
            ۟.z7$e r7 = ۟.z7.e.f1270
            boolean r5 = r0.f1175
            boolean r6 = r1.f1260
            r1 = r19
            r3 = r4
            r4 = r7
            p000.a8.m33(r1, r2, r3, r4, r5, r6)
            ۟.z7 r1 = r0.f1173
            boolean r1 = r1.f1261
            if (r1 == 0) goto L12c
            r8.m456()
            r7.toString()
        L12c:
            if (r20 == 0) goto L131
            r20.m147()
        L131:
            return
        L132:
            android.graphics.Paint r1 = p000.a8.f92
            r1 = 0
            r3.setImageDrawable(r1)
            android.graphics.drawable.Drawable r1 = r19.getDrawable()
            boolean r1 = r1 instanceof android.graphics.drawable.AnimationDrawable
            if (r1 == 0) goto L149
            android.graphics.drawable.Drawable r1 = r19.getDrawable()
            android.graphics.drawable.AnimationDrawable r1 = (android.graphics.drawable.AnimationDrawable) r1
            r1.start()
        L149:
            ۟.b4 r9 = new ۟.b4
            ۟.z7 r2 = r0.f1173
            boolean r7 = r0.f1175
            r1 = r9
            r3 = r19
            r4 = r8
            r6 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7)
            ۟.z7 r1 = r0.f1173
            r1.m498(r9)
            return
        L15e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Method call should happen from the main thread."
            r1.<init>(r2)
            throw r1
    }
}

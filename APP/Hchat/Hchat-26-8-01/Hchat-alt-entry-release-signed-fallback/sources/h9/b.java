package h9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.List f5145e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f5146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ab.b f5147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f5148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f5149d;

    static {
            java.lang.String r0 = "MicroMsg.SLocationListener"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r1 = "MicroMsg.SLocationListenerWgs84"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r2 = "MicroMsg.DefaultTencentLocationManager"
            java.lang.String r3 = "[mlocationListener]error:%d, reason:%s"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.lang.String[][] r0 = new java.lang.String[][]{r0, r1, r2}
            java.util.List r0 = a.a.y0(r0)
            h9.b.f5145e = r0
            return
    }

    public b(r8.g r1, ab.b r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f5146a = r1
            r0.f5147b = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_fake_location_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f5148c = r1
            return
    }

    public final java.util.ArrayList a() {
            r14 = this;
            r8.g r0 = r14.f5146a
            android.content.Context r1 = r0.f11620a
            java.lang.ClassLoader r2 = r0.f11622c
            java.lang.String r1 = e8.b.g(r1, r2)
            android.content.SharedPreferences r3 = r14.f5148c
            java.lang.String r4 = "location_callbacks_v1"
            java.util.List r5 = e8.b.f(r3, r1, r2, r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L1b:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L32
            java.lang.Object r7 = r5.next()
            r8 = r7
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            boolean r8 = ig.a.c(r8)
            if (r8 == 0) goto L1b
            r6.add(r7)
            goto L1b
        L32:
            boolean r5 = r6.isEmpty()
            r7 = 0
            if (r5 != 0) goto L3a
            goto L3b
        L3a:
            r6 = r7
        L3b:
            if (r6 == 0) goto L3e
            return r6
        L3e:
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.util.List r6 = h9.b.f5145e
            java.util.Iterator r6 = r6.iterator()
        L49:
            boolean r8 = r6.hasNext()
            ab.b r9 = r14.f5147b
            if (r8 == 0) goto Lc9
            java.lang.Object r8 = r6.next()
            java.lang.String[] r8 = (java.lang.String[]) r8
            org.luckypray.dexkit.DexKitBridge r10 = r0.f11623d     // Catch: java.lang.Throwable -> L74
            ch.e r11 = new ch.e     // Catch: java.lang.Throwable -> L74
            r11.<init>()     // Catch: java.lang.Throwable -> L74
            fh.k r12 = new fh.k     // Catch: java.lang.Throwable -> L74
            r12.<init>()     // Catch: java.lang.Throwable -> L74
            int r13 = r8.length     // Catch: java.lang.Throwable -> L74
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r8, r13)     // Catch: java.lang.Throwable -> L74
            java.lang.String[] r13 = (java.lang.String[]) r13     // Catch: java.lang.Throwable -> L74
            r12.r0(r13)     // Catch: java.lang.Throwable -> L74
            r11.f1666h = r12     // Catch: java.lang.Throwable -> L74
            hh.p r10 = r10.findMethod(r11)     // Catch: java.lang.Throwable -> L74
            goto L7b
        L74:
            r10 = move-exception
            sf.f r11 = new sf.f
            r11.<init>(r10)
            r10 = r11
        L7b:
            java.lang.Throwable r11 = sf.g.b(r10)
            if (r11 != 0) goto L82
            goto L93
        L82:
            r10 = 63
            java.lang.String r8 = tf.l.F0(r8, r7, r10)
            java.lang.String r10 = "定位微信定位回调失败: "
            java.lang.String r8 = r10.concat(r8)
            r9.invoke(r8, r11)
            tf.t r10 = tf.t.f13167g
        L93:
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r8 = r10.iterator()
        L99:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L49
            java.lang.Object r9 = r8.next()
            hh.o r9 = (hh.o) r9
            java.lang.reflect.Method r9 = r9.r(r2)     // Catch: java.lang.Throwable -> Laa
            goto Lb1
        Laa:
            r9 = move-exception
            sf.f r10 = new sf.f
            r10.<init>(r9)
            r9 = r10
        Lb1:
            boolean r10 = r9 instanceof sf.f
            if (r10 == 0) goto Lb7
            r9 = r7
        Lb7:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto Lc2
            boolean r10 = ig.a.c(r9)
            if (r10 == 0) goto Lc2
            goto Lc3
        Lc2:
            r9 = r7
        Lc3:
            if (r9 == 0) goto L99
            r5.add(r9)
            goto L99
        Lc9:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r5 = r5.iterator()
        Ld7:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lf2
            java.lang.Object r6 = r5.next()
            r8 = r6
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.String r8 = r8.toGenericString()
            boolean r8 = r0.add(r8)
            if (r8 == 0) goto Ld7
            r2.add(r6)
            goto Ld7
        Lf2:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L11e
            java.lang.String r0 = "cache.key"
            android.content.SharedPreferences$Editor r5 = r3.edit()     // Catch: java.lang.Throwable -> L118
            java.lang.String r6 = ""
            java.lang.String r3 = r3.getString(r0, r6)     // Catch: java.lang.Throwable -> L118
            boolean r3 = gg.l.a(r3, r1)     // Catch: java.lang.Throwable -> L118
            if (r3 != 0) goto L111
            android.content.SharedPreferences$Editor r3 = r5.clear()     // Catch: java.lang.Throwable -> L118
            r3.putString(r0, r1)     // Catch: java.lang.Throwable -> L118
        L111:
            android.content.SharedPreferences$Editor r0 = r5.remove(r4)     // Catch: java.lang.Throwable -> L118
            r0.apply()     // Catch: java.lang.Throwable -> L118
        L118:
            java.lang.String r0 = "未找到微信定位回调方法"
            r9.invoke(r0, r7)
            goto L123
        L11e:
            e8.b r0 = e8.b.f2358a
            r0.j(r3, r1, r4, r2)
        L123:
            return r2
    }
}

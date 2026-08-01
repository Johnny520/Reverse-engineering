package p000;

/* JADX INFO: renamed from: h */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0341h extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f4515;

    public /* synthetic */ C0341h(int r1) {
            r0 = this;
            r0.f4515 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ C0341h(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f4515 = r1
            r0.<init>()
            return
    }

    public C0341h(java.lang.String r1) {
            r0 = this;
            r1 = 23
            r0.f4515 = r1
            ql r1 = p000.C0728ql.f9031
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    private final void m2341(p000.k01 r6) {
            r5 = this;
            r6.getClass()
            java.lang.Object r5 = r6.f5691
            boolean r6 = r5 instanceof android.view.View
            r0 = 0
            if (r6 == 0) goto Ld
            android.view.View r5 = (android.view.View) r5
            goto Le
        Ld:
            r5 = r0
        Le:
            if (r5 != 0) goto L12
            goto La8
        L12:
            int r6 = p000.C0287fj.m2122()
            if (r6 == 0) goto L1d
            r1 = 2
            if (r6 == r1) goto L1d
            goto La8
        L1d:
            java.util.Map r6 = p000.C0287fj.f3960
            monitor-enter(r6)
            boolean r1 = r6.containsKey(r5)     // Catch: java.lang.Throwable -> Lab
            if (r1 == 0) goto L29
            monitor-exit(r6)
            r0 = r5
            goto L4c
        L29:
            monitor-exit(r6)
            android.view.ViewParent r5 = r5.getParent()
        L2e:
            boolean r6 = r5 instanceof android.view.View
            if (r6 == 0) goto L4c
            java.util.Map r6 = p000.C0287fj.f3960
            monitor-enter(r6)
            boolean r1 = r6.containsKey(r5)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L42
            r0 = r5
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L40
            monitor-exit(r6)
            goto L4c
        L40:
            r5 = move-exception
            goto L4a
        L42:
            monitor-exit(r6)
            android.view.View r5 = (android.view.View) r5
            android.view.ViewParent r5 = r5.getParent()
            goto L2e
        L4a:
            monitor-exit(r6)
            throw r5
        L4c:
            if (r0 != 0) goto L4f
            goto La8
        L4f:
            long r5 = java.lang.System.currentTimeMillis()
            java.util.Map r1 = p000.C0287fj.f3961
            monitor-enter(r1)
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L65
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L63
            goto L67
        L63:
            r5 = move-exception
            goto La9
        L65:
            r2 = 0
        L67:
            java.lang.Long r4 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L63
            r1.put(r0, r4)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r1)
            long r5 = r5 - r2
            r2 = 1
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 > 0) goto La8
            r2 = 361(0x169, double:1.784E-321)
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto La8
            r1.remove(r0)
            java.util.Map r5 = p000.C0287fj.f3960
            monitor-enter(r5)
            java.lang.Object r6 = r5.get(r0)     // Catch: java.lang.Throwable -> La5
            cj r6 = (p000.C0115cj) r6     // Catch: java.lang.Throwable -> La5
            monitor-exit(r5)
            if (r6 != 0) goto L8c
            goto La8
        L8c:
            android.content.Context r5 = r0.getContext()
            if (r5 != 0) goto L93
            goto La8
        L93:
            java.util.concurrent.ConcurrentHashMap r0 = p000.C0287fj.f3958
            java.lang.String r1 = r6.f2154
            java.lang.Object r0 = r0.get(r1)
            cj r0 = (p000.C0115cj) r0
            if (r0 != 0) goto La0
            goto La1
        La0:
            r6 = r0
        La1:
            p000.C0287fj.m2117(r5, r6)
            return
        La5:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        La8:
            return
        La9:
            monitor-exit(r1)
            throw r5
        Lab:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
    }

    @Override // p000.m01
    public void afterHookedMethod(p000.k01 r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f4515
            r3 = 2
            r4 = 4
            r5 = 1
            r6 = 0
            r7 = 0
            switch(r2) {
                case 0: goto L755;
                case 1: goto L73b;
                case 2: goto L682;
                case 3: goto L64c;
                case 4: goto L60c;
                case 5: goto L56f;
                case 6: goto L52f;
                case 7: goto L516;
                case 8: goto L4fd;
                case 9: goto Le;
                case 10: goto Le;
                case 11: goto Le;
                case 12: goto L4e6;
                case 13: goto L4c8;
                case 14: goto Le;
                case 15: goto L4b1;
                case 16: goto L477;
                case 17: goto L29c;
                case 18: goto L27d;
                case 19: goto L140;
                case 20: goto L13c;
                case 21: goto Lfd;
                case 22: goto Lce;
                case 23: goto L97;
                case 24: goto L57;
                case 25: goto L12;
                default: goto Le;
            }
        Le:
            super.afterHookedMethod(r18)
            return
        L12:
            r1.getClass()
            java.lang.Object r0 = r1.f5691     // Catch: java.lang.Throwable -> L50
            boolean r2 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L1e
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L50
            goto L1f
        L1e:
            r0 = r7
        L1f:
            if (r0 != 0) goto L22
            goto L56
        L22:
            java.lang.Object[] r1 = r1.f5692     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L56
            java.lang.Object r1 = p000.AbstractC0312g7.m2250(r1)     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L2d
            goto L56
        L2d:
            java.util.Map r2 = p000.C0728ql.f9039     // Catch: java.lang.Throwable -> L50
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L3d
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L3f
            java.util.List r7 = p000.AbstractC0984xh.m6666(r1)     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r0 = move-exception
            goto L4e
        L3f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L50
            if (r7 != 0) goto L44
            jz r7 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L50
        L44:
            boolean r1 = r7.isEmpty()     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L56
            p000.C0728ql.m4905(r0, r7)     // Catch: java.lang.Throwable -> L50
            goto L56
        L4e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L50
            throw r0     // Catch: java.lang.Throwable -> L50
        L50:
            r0 = move-exception
            r0.getMessage()
            int r0 = com.example.dyhelper.MainHook.f2222
        L56:
            return
        L57:
            r1.getClass()
            ql r0 = p000.C0728ql.f9031
            java.lang.Object r0 = r1.f5691     // Catch: java.lang.Throwable -> L90
            if (r0 != 0) goto L61
            goto L96
        L61:
            java.lang.Object r1 = r1.f5694     // Catch: java.lang.Throwable -> L90
            if (r1 != 0) goto L66
            goto L96
        L66:
            java.util.Map r2 = p000.C0728ql.f9038     // Catch: java.lang.Throwable -> L90
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L76
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L78
            java.util.List r7 = p000.AbstractC0984xh.m6666(r0)     // Catch: java.lang.Throwable -> L76
            goto L78
        L76:
            r0 = move-exception
            goto L8e
        L78:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L90
            if (r7 != 0) goto L7d
            jz r7 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L90
        L7d:
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Throwable -> L90
            if (r0 != 0) goto L96
            java.util.Map r2 = p000.C0728ql.f9039     // Catch: java.lang.Throwable -> L90
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L90
            r2.put(r1, r7)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L90
            goto L96
        L8b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L90
            throw r0     // Catch: java.lang.Throwable -> L90
        L8e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L90
            throw r0     // Catch: java.lang.Throwable -> L90
        L90:
            r0 = move-exception
            r0.getMessage()
            int r0 = com.example.dyhelper.MainHook.f2222
        L96:
            return
        L97:
            r1.getClass()
            ql r0 = p000.C0728ql.f9031
            java.lang.Object r0 = r1.f5691     // Catch: java.lang.Throwable -> Lc7
            if (r0 != 0) goto La1
            goto Lcd
        La1:
            java.lang.Object[] r1 = r1.f5692     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto Lb9
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc7
            r7.<init>()     // Catch: java.lang.Throwable -> Lc7
            int r2 = r1.length     // Catch: java.lang.Throwable -> Lc7
        Lab:
            if (r6 >= r2) goto Lb9
            r3 = r1[r6]     // Catch: java.lang.Throwable -> Lc7
            java.util.List r3 = p000.C0728ql.m4923(r3)     // Catch: java.lang.Throwable -> Lc7
            p000.AbstractC0984xh.m6660(r7, r3)     // Catch: java.lang.Throwable -> Lc7
            int r6 = r6 + 1
            goto Lab
        Lb9:
            if (r7 != 0) goto Lbd
            jz r7 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> Lc7
        Lbd:
            boolean r1 = r7.isEmpty()     // Catch: java.lang.Throwable -> Lc7
            if (r1 != 0) goto Lcd
            p000.C0728ql.m4911(r0, r7)     // Catch: java.lang.Throwable -> Lc7
            goto Lcd
        Lc7:
            r0 = move-exception
            r0.getMessage()
            int r0 = com.example.dyhelper.MainHook.f2222
        Lcd:
            return
        Lce:
            r1.getClass()
            java.lang.Object r0 = r1.f5691     // Catch: java.lang.Throwable -> Lf6
            boolean r2 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> Lf6
            if (r2 == 0) goto Lda
            r7 = r0
            android.view.View r7 = (android.view.View) r7     // Catch: java.lang.Throwable -> Lf6
        Lda:
            if (r7 != 0) goto Ldd
            goto Lfc
        Ldd:
            java.lang.Object[] r0 = r1.f5692     // Catch: java.lang.Throwable -> Lf6
            if (r0 == 0) goto Lfc
            java.lang.Object r0 = p000.AbstractC0312g7.m2250(r0)     // Catch: java.lang.Throwable -> Lf6
            if (r0 != 0) goto Le8
            goto Lfc
        Le8:
            java.util.List r0 = p000.C0728ql.m4923(r0)     // Catch: java.lang.Throwable -> Lf6
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lf6
            if (r1 != 0) goto Lfc
            p000.C0728ql.m4905(r7, r0)     // Catch: java.lang.Throwable -> Lf6
            goto Lfc
        Lf6:
            r0 = move-exception
            r0.getMessage()
            int r0 = com.example.dyhelper.MainHook.f2222
        Lfc:
            return
        Lfd:
            r1.getClass()
            java.lang.Object r0 = r1.f5691     // Catch: java.lang.Throwable -> L135
            boolean r2 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> L135
            if (r2 == 0) goto L109
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L135
            goto L10a
        L109:
            r0 = r7
        L10a:
            if (r0 != 0) goto L10d
            goto L13b
        L10d:
            java.lang.Object[] r1 = r1.f5692     // Catch: java.lang.Throwable -> L135
            if (r1 == 0) goto L13b
            java.lang.Object r1 = p000.AbstractC0312g7.m2250(r1)     // Catch: java.lang.Throwable -> L135
            if (r1 != 0) goto L118
            goto L13b
        L118:
            boolean r2 = r1 instanceof android.net.Uri     // Catch: java.lang.Throwable -> L135
            if (r2 == 0) goto L123
            android.net.Uri r1 = (android.net.Uri) r1     // Catch: java.lang.Throwable -> L135
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L135
            goto L12a
        L123:
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L135
            if (r2 == 0) goto L12a
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L135
        L12a:
            if (r7 != 0) goto L12d
            goto L13b
        L12d:
            java.util.List r1 = p000.AbstractC1021yh.m6896(r7)     // Catch: java.lang.Throwable -> L135
            p000.C0728ql.m4905(r0, r1)     // Catch: java.lang.Throwable -> L135
            goto L13b
        L135:
            r0 = move-exception
            r0.getMessage()
            int r0 = com.example.dyhelper.MainHook.f2222
        L13b:
            return
        L13c:
            r17.m2341(r18)
            return
        L140:
            r1.getClass()
            java.util.concurrent.atomic.AtomicReference r0 = p000.C0287fj.f3964
            java.lang.Object r2 = r0.get()
            if (r2 != 0) goto L14d
            goto L27c
        L14d:
            java.lang.Object r0 = r0.get()
            dj r0 = (p000.C0214dj) r0
            if (r0 != 0) goto L157
            goto L27c
        L157:
            java.lang.Object r2 = r1.f5694
            boolean r8 = r2 instanceof java.lang.Integer
            if (r8 == 0) goto L160
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L161
        L160:
            r2 = r7
        L161:
            if (r2 == 0) goto L27c
            int r8 = r2.intValue()
            if (r8 <= 0) goto L16a
            goto L16b
        L16a:
            r2 = r7
        L16b:
            if (r2 == 0) goto L27c
            int r2 = r2.intValue()
            java.lang.Object r8 = r1.f5691
            boolean r9 = r8 instanceof android.media.AudioTrack
            if (r9 == 0) goto L17a
            android.media.AudioTrack r8 = (android.media.AudioTrack) r8
            goto L17b
        L17a:
            r8 = r7
        L17b:
            java.lang.Object[] r9 = r1.f5692
            if (r9 != 0) goto L181
            goto L27c
        L181:
            java.lang.Object r10 = p000.AbstractC0312g7.m2250(r9)
            if (r10 != 0) goto L189
            goto L27c
        L189:
            boolean r11 = r10 instanceof byte[]
            if (r11 == 0) goto L1b9
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r5, r9)
            boolean r3 = r1 instanceof java.lang.Integer
            if (r3 == 0) goto L198
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L199
        L198:
            r1 = r7
        L199:
            if (r1 == 0) goto L19f
            int r6 = r1.intValue()
        L19f:
            byte[] r10 = (byte[]) r10
            int r1 = r10.length
            int r1 = r1 - r6
            int r1 = java.lang.Math.min(r2, r1)
            if (r1 > 0) goto L1ab
            goto L27c
        L1ab:
            int r1 = r1 + r6
            byte[] r1 = p000.AbstractC0312g7.m2241(r10, r6, r1)
            ej r2 = p000.C0287fj.m2113(r8, r7)
            p000.C0287fj.m2128(r0, r1, r2)
            goto L27c
        L1b9:
            boolean r11 = r10 instanceof short[]
            if (r11 == 0) goto L204
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r5, r9)
            boolean r4 = r1 instanceof java.lang.Integer
            if (r4 == 0) goto L1c8
            r7 = r1
            java.lang.Integer r7 = (java.lang.Integer) r7
        L1c8:
            if (r7 == 0) goto L1cf
            int r1 = r7.intValue()
            goto L1d0
        L1cf:
            r1 = r6
        L1d0:
            short[] r10 = (short[]) r10
            int r4 = r10.length
            int r4 = r4 - r1
            int r2 = java.lang.Math.min(r2, r4)
            if (r2 > 0) goto L1dc
            goto L27c
        L1dc:
            int r4 = r2 * 2
            byte[] r4 = new byte[r4]
            int r2 = r2 + r1
        L1e1:
            if (r1 >= r2) goto L1f7
            short r5 = r10[r1]
            int r7 = r6 + 1
            r9 = r5 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r4[r6] = r9
            int r6 = r6 + r3
            int r5 = r5 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r4[r7] = r5
            int r1 = r1 + 1
            goto L1e1
        L1f7:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            ej r1 = p000.C0287fj.m2113(r8, r1)
            p000.C0287fj.m2128(r0, r4, r1)
            goto L27c
        L204:
            boolean r3 = r10 instanceof float[]
            if (r3 == 0) goto L24e
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r5, r9)
            boolean r3 = r1 instanceof java.lang.Integer
            if (r3 == 0) goto L213
            r7 = r1
            java.lang.Integer r7 = (java.lang.Integer) r7
        L213:
            if (r7 == 0) goto L219
            int r6 = r7.intValue()
        L219:
            float[] r10 = (float[]) r10
            int r1 = r10.length
            int r1 = r1 - r6
            int r1 = java.lang.Math.min(r2, r1)
            if (r1 > 0) goto L224
            goto L27c
        L224:
            int r2 = r1 * 4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            int r1 = r1 + r6
        L231:
            if (r6 >= r1) goto L23b
            r3 = r10[r6]
            r2.putFloat(r3)
            int r6 = r6 + 1
            goto L231
        L23b:
            byte[] r1 = r2.array()
            r1.getClass()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            ej r2 = p000.C0287fj.m2113(r8, r2)
            p000.C0287fj.m2128(r0, r1, r2)
            goto L27c
        L24e:
            boolean r3 = r10 instanceof java.nio.ByteBuffer
            if (r3 == 0) goto L27c
            java.lang.String r3 = "dy_audio_bytes"
            java.util.concurrent.ConcurrentHashMap r1 = r1.f5693
            java.lang.Object r1 = r1.get(r3)
            boolean r3 = r1 instanceof byte[]
            if (r3 == 0) goto L261
            byte[] r1 = (byte[]) r1
            goto L262
        L261:
            r1 = r7
        L262:
            if (r1 != 0) goto L265
            goto L27c
        L265:
            int r3 = r1.length
            int r2 = java.lang.Math.min(r2, r3)
            if (r2 > 0) goto L26d
            goto L27c
        L26d:
            int r3 = r1.length
            if (r2 != r3) goto L271
            goto L275
        L271:
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
        L275:
            ej r2 = p000.C0287fj.m2113(r8, r7)
            p000.C0287fj.m2128(r0, r1, r2)
        L27c:
            return
        L27d:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.media.AudioTrack
            if (r1 == 0) goto L289
            android.media.AudioTrack r0 = (android.media.AudioTrack) r0
            goto L28a
        L289:
            r0 = r7
        L28a:
            if (r0 != 0) goto L28d
            goto L298
        L28d:
            ej r1 = p000.C0287fj.m2113(r0, r7)
            java.util.Map r2 = p000.C0287fj.f3965
            monitor-enter(r2)
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> L299
            monitor-exit(r2)
        L298:
            return
        L299:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L29c:
            java.lang.String r2 = "http"
            r1.getClass()
            fj r0 = p000.C0287fj.f3949
            java.lang.Object r0 = r1.f5691
            boolean r4 = r0 instanceof android.view.View
            if (r4 == 0) goto L2ad
            android.view.View r0 = (android.view.View) r0
            r4 = r0
            goto L2ae
        L2ad:
            r4 = r7
        L2ae:
            if (r4 != 0) goto L2b2
            goto L476
        L2b2:
            java.lang.Object[] r0 = r1.f5692
            if (r0 == 0) goto L476
            int r1 = r0.length
            r8 = r6
        L2b8:
            if (r8 >= r1) goto L2d8
            r9 = r0[r8]
            if (r9 == 0) goto L2c7
            java.lang.Class r10 = r9.getClass()
            java.lang.String r10 = r10.getName()
            goto L2c8
        L2c7:
            r10 = r7
        L2c8:
            java.lang.String r11 = "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AFAE24985FA802AAD9131B3F256364FE597603FE0C9F429AC0783D12F128B686"
            java.lang.String r11 = p000.jf0.m2957(r11)
            boolean r10 = p000.ln0.m3626(r10, r11)
            if (r10 == 0) goto L2d5
            goto L2d9
        L2d5:
            int r8 = r8 + 1
            goto L2b8
        L2d8:
            r9 = r7
        L2d9:
            if (r9 != 0) goto L2dd
            goto L476
        L2dd:
            java.lang.String r0 = ""
            java.lang.String r1 = "content"
            java.lang.Object r1 = p000.C0287fj.m2110(r9, r1)
            boolean r8 = r1 instanceof java.lang.String
            if (r8 == 0) goto L2ed
            java.lang.String r1 = (java.lang.String) r1
            r12 = r1
            goto L2ee
        L2ed:
            r12 = r7
        L2ee:
            java.lang.String r1 = "vid"
            java.lang.Object r1 = p000.C0287fj.m2110(r9, r1)
            boolean r8 = r1 instanceof java.lang.String
            if (r8 == 0) goto L2fb
            java.lang.String r1 = (java.lang.String) r1
            goto L2fc
        L2fb:
            r1 = r7
        L2fc:
            if (r1 != 0) goto L2ff
            r1 = r0
        L2ff:
            boolean r8 = p000.q02.m4671(r1)
            if (r8 == 0) goto L332
            if (r12 == 0) goto L312
            boolean r1 = p000.q02.m4671(r12)
            if (r1 != 0) goto L30f
            r1 = r12
            goto L310
        L30f:
            r1 = r7
        L310:
            if (r1 != 0) goto L324
        L312:
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.getName()
            int r8 = java.lang.System.identityHashCode(r9)
            java.lang.String r10 = "@"
            java.lang.String r1 = p000.AbstractC0602nx.m4130(r1, r10, r8)
        L324:
            int r1 = r1.hashCode()
            long r10 = java.lang.Integer.toUnsignedLong(r1)
            java.lang.String r1 = "comment_audio_"
            java.lang.String r1 = p000.AbstractC0602nx.m4126(r10, r1)
        L332:
            r11 = r1
            boolean r1 = p000.q02.m4671(r11)
            if (r1 == 0) goto L33b
            goto L400
        L33b:
            java.lang.String r1 = "duration"
            java.lang.Object r1 = p000.C0287fj.m2110(r9, r1)
            boolean r8 = r1 instanceof java.lang.Number
            if (r8 == 0) goto L348
            java.lang.Number r1 = (java.lang.Number) r1
            goto L349
        L348:
            r1 = r7
        L349:
            if (r1 == 0) goto L355
            long r13 = r1.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r14 = r1
            goto L356
        L355:
            r14 = r7
        L356:
            java.lang.String r1 = "asr_text"
            java.lang.Object r1 = p000.C0287fj.m2110(r9, r1)
            boolean r8 = r1 instanceof java.lang.String
            if (r8 == 0) goto L363
            java.lang.String r1 = (java.lang.String) r1
            goto L364
        L363:
            r1 = r7
        L364:
            if (r1 != 0) goto L367
            r1 = r0
        L367:
            java.lang.String r8 = "timbre_text"
            java.lang.Object r8 = p000.C0287fj.m2110(r9, r8)
            boolean r10 = r8 instanceof java.lang.String
            if (r10 == 0) goto L374
            java.lang.String r8 = (java.lang.String) r8
            goto L375
        L374:
            r8 = r7
        L375:
            if (r8 != 0) goto L378
            r8 = r0
        L378:
            java.lang.String r10 = "isLocal"
            java.lang.Class r0 = r9.getClass()
            r13 = r0
        L37f:
            if (r13 == 0) goto L3dc
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L3dc
            java.lang.reflect.Field r0 = r13.getDeclaredField(r10)     // Catch: java.lang.Throwable -> L38e
            goto L395
        L38e:
            r0 = move-exception
            eo1 r15 = new eo1
            r15.<init>(r0)
            r0 = r15
        L395:
            boolean r15 = r0 instanceof p000.eo1
            if (r15 == 0) goto L39a
            r0 = r7
        L39a:
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            if (r0 == 0) goto L3d6
            java.lang.Class r15 = r0.getType()
            java.lang.Class r7 = java.lang.Boolean.TYPE
            boolean r7 = p000.ln0.m3626(r15, r7)
            if (r7 != 0) goto L3b6
            java.lang.Class r7 = r0.getType()
            java.lang.Class<java.lang.Boolean> r15 = java.lang.Boolean.class
            boolean r7 = p000.ln0.m3626(r7, r15)
            if (r7 == 0) goto L3d6
        L3b6:
            r0.setAccessible(r5)     // Catch: java.lang.Throwable -> L3c4
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L3c4
            boolean r7 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L3c4
            if (r7 == 0) goto L3c6
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L3c4
            goto L3ce
        L3c4:
            r0 = move-exception
            goto L3c8
        L3c6:
            r0 = 0
            goto L3ce
        L3c8:
            eo1 r7 = new eo1
            r7.<init>(r0)
            r0 = r7
        L3ce:
            boolean r7 = r0 instanceof p000.eo1
            if (r7 == 0) goto L3d3
            r0 = 0
        L3d3:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L3dd
        L3d6:
            java.lang.Class r13 = r13.getSuperclass()
            r7 = 0
            goto L37f
        L3dc:
            r0 = 0
        L3dd:
            if (r0 == 0) goto L3e5
            boolean r0 = r0.booleanValue()
        L3e3:
            r13 = r0
            goto L3ea
        L3e5:
            boolean r0 = p000.C0287fj.m2137(r12)
            goto L3e3
        L3ea:
            boolean r0 = p000.q02.m4671(r1)
            if (r0 == 0) goto L3f1
            r1 = r8
        L3f1:
            boolean r0 = p000.q02.m4671(r1)
            if (r0 != 0) goto L3f9
            r15 = r1
            goto L3fa
        L3f9:
            r15 = 0
        L3fa:
            cj r10 = new cj
            r10.<init>(r11, r12, r13, r14, r15)
            r7 = r10
        L400:
            if (r7 != 0) goto L404
            goto L476
        L404:
            java.util.concurrent.ConcurrentHashMap r0 = p000.C0287fj.f3958
            java.lang.String r1 = r7.f2154
            r0.put(r1, r7)
            java.lang.String r0 = r7.f2155
            if (r0 != 0) goto L410
            goto L461
        L410:
            boolean r8 = p000.C0287fj.m2137(r0)
            if (r8 == 0) goto L417
            goto L461
        L417:
            java.lang.String r8 = p000.C0287fj.m2140(r0)
            boolean r9 = p000.x02.m6485(r8, r2, r5)
            if (r9 == 0) goto L428
            boolean r9 = p000.C0287fj.m2135(r8)
            if (r9 == 0) goto L428
            goto L432
        L428:
            java.lang.Object r8 = p000.C0287fj.m2141(r8)
            r9 = 12
            java.lang.String r8 = p000.C0287fj.m2130(r9, r8)
        L432:
            if (r8 == 0) goto L43e
            boolean r9 = p000.q02.m4671(r8)
            if (r9 == 0) goto L43b
            goto L43e
        L43b:
            p000.C0287fj.m2121(r1, r8, r5)
        L43e:
            java.lang.String r0 = p000.C0287fj.m2140(r0)
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r8 = p000.AbstractC0602nx.m4134(r8, r0, r8)
            boolean r2 = p000.x02.m6485(r0, r2, r5)
            if (r2 == 0) goto L461
            java.lang.String r2 = "fplay"
            boolean r2 = p000.q02.m4654(r8, r2, r6)
            if (r2 != 0) goto L45e
            java.lang.String r2 = "video_id"
            boolean r2 = p000.q02.m4654(r8, r2, r6)
            if (r2 == 0) goto L461
        L45e:
            p000.C0287fj.m2121(r1, r0, r6)
        L461:
            java.util.Map r0 = p000.C0287fj.f3960
            r0.put(r4, r7)
            int r0 = p000.C0287fj.m2122()
            if (r0 == r5) goto L473
            if (r0 == r3) goto L46f
            goto L476
        L46f:
            p000.C0287fj.m2129(r4, r7)
            goto L476
        L473:
            p000.C0287fj.m2129(r4, r7)
        L476:
            return
        L477:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L483
            android.view.View r0 = (android.view.View) r0
            goto L484
        L483:
            r0 = 0
        L484:
            if (r0 != 0) goto L487
            goto L4b0
        L487:
            java.lang.Object[] r1 = r1.f5692
            r1.getClass()
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r6, r1)
            boolean r2 = r1 instanceof android.view.MotionEvent
            if (r2 == 0) goto L498
            r7 = r1
            android.view.MotionEvent r7 = (android.view.MotionEvent) r7
            goto L499
        L498:
            r7 = 0
        L499:
            if (r7 != 0) goto L49c
            goto L4b0
        L49c:
            int r1 = r7.getActionMasked()
            if (r1 == r5) goto L4a6
            r2 = 3
            if (r1 == r2) goto L4a6
            goto L4b0
        L4a6:
            java.util.Set r1 = p000.C0623oh.f8108
            r1.remove(r0)
            oh r1 = p000.C0623oh.f8099
            r1.m4246(r0)
        L4b0:
            return
        L4b1:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L4be
            r7 = r0
            android.view.View r7 = (android.view.View) r7
            goto L4bf
        L4be:
            r7 = 0
        L4bf:
            if (r7 != 0) goto L4c2
            goto L4c7
        L4c2:
            oh r0 = p000.C0623oh.f8099
            p000.C0623oh.m4237(r7)
        L4c7:
            return
        L4c8:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L4d5
            r7 = r0
            android.view.View r7 = (android.view.View) r7
            goto L4d6
        L4d5:
            r7 = 0
        L4d6:
            if (r7 != 0) goto L4d9
            goto L4e5
        L4d9:
            oh r0 = p000.C0623oh.f8099
            boolean r0 = p000.C0623oh.f8105
            if (r0 != 0) goto L4e0
            goto L4e5
        L4e0:
            r0 = 1065353216(0x3f800000, float:1.0)
            p000.C0623oh.m4238(r7, r0)
        L4e5:
            return
        L4e6:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L4f3
            r7 = r0
            android.view.View r7 = (android.view.View) r7
            goto L4f4
        L4f3:
            r7 = 0
        L4f4:
            if (r7 != 0) goto L4f7
            goto L4fc
        L4f7:
            oh r0 = p000.C0623oh.f8099
            r0.m4246(r7)
        L4fc:
            return
        L4fd:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L50a
            r7 = r0
            android.view.View r7 = (android.view.View) r7
            goto L50b
        L50a:
            r7 = 0
        L50b:
            if (r7 != 0) goto L50e
            goto L515
        L50e:
            java.lang.String r0 = "AwemeIntroInfoLayout attached"
            tg r1 = p000.AbstractC0871ug.f10771
            r1.m5691(r7, r0)
        L515:
            return
        L516:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L523
            r7 = r0
            android.view.View r7 = (android.view.View) r7
            goto L524
        L523:
            r7 = 0
        L524:
            if (r7 != 0) goto L527
            goto L52e
        L527:
            java.lang.String r0 = "AwemeIntroInfoLayout constructor"
            tg r1 = p000.AbstractC0871ug.f10771
            r1.m5691(r7, r0)
        L52e:
            return
        L52f:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L53b
            android.app.Activity r0 = (android.app.Activity) r0
            goto L53c
        L53b:
            r0 = 0
        L53c:
            if (r0 != 0) goto L53f
            goto L56e
        L53f:
            a r1 = p000.AbstractC0871ug.f10782
            r1.getClass()
            java.lang.Object r2 = r1.f1
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 == 0) goto L54f
            java.lang.Object r2 = r2.get()
            goto L550
        L54f:
            r2 = 0
        L550:
            if (r2 == r0) goto L553
            goto L56e
        L553:
            r2 = 0
            r1.f1 = r2
            tg r0 = p000.AbstractC0871ug.f10771
            p000.C0834tg.m5655()
            p000.AbstractC0871ug.f10791 = r6
            p000.C0834tg.m5656()
            p000.AbstractC0871ug.f10794 = r6
            p000.AbstractC0871ug.f10748 = r2
            java.lang.String r0 = "activity pause"
            p000.C0834tg.m5654(r0)
            sb r0 = p000.C0792sb.f9786     // Catch: java.lang.Throwable -> L56e
            p000.C0792sb.m5428(r6)     // Catch: java.lang.Throwable -> L56e
        L56e:
            return
        L56f:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L57c
            r7 = r0
            android.app.Activity r7 = (android.app.Activity) r7
            goto L57d
        L57c:
            r7 = 0
        L57d:
            if (r7 != 0) goto L581
            goto L60b
        L581:
            a r0 = p000.AbstractC0871ug.f10782
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            r0.getClass()
            java.lang.Object r2 = r0.f0
            java.util.Set r2 = (java.util.Set) r2
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L59a
            goto L60b
        L59a:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r7)
            r0.f1 = r1
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r7)
            p000.AbstractC0871ug.f10777 = r0
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L5b1
            p000.ui1.m5896(r7)
        L5b1:
            boolean r0 = p000.AbstractC0871ug.f10763
            if (r0 != 0) goto L5d6
            p000.AbstractC0976x9.m6537(r7)     // Catch: java.lang.Throwable -> L5cc
            boolean r0 = p000.AbstractC0976x9.m6538()     // Catch: java.lang.Throwable -> L5cc
            if (r0 == 0) goto L5c6
            boolean r0 = com.example.dyhelper.beta.BetaNativeBridge.m1283()     // Catch: java.lang.Throwable -> L5cc
            if (r0 == 0) goto L5c6
            r0 = r5
            goto L5c7
        L5c6:
            r0 = r6
        L5c7:
            p000.AbstractC0871ug.f10765 = r0     // Catch: java.lang.Throwable -> L5cc
            p000.AbstractC0871ug.f10763 = r5     // Catch: java.lang.Throwable -> L5cc
            goto L5d6
        L5cc:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "r34e75321ec25175"
            p000.AbstractC0602nx.m4142(r1, r0)
        L5d6:
            tg r0 = p000.AbstractC0871ug.f10771
            p000.C0834tg.m5668()
            boolean r1 = p000.C0834tg.m5640()
            if (r1 == 0) goto L5e4
            r0.m5697()
        L5e4:
            r0.m5698()
            r0.m5707()
            p000.AbstractC0871ug.f10791 = r6
            p000.C0834tg.m5655()
            java.lang.String r0 = "activity resume"
            p000.C0834tg.m5685(r0)
            android.view.Window r0 = r7.getWindow()
            if (r0 == 0) goto L60b
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L60b
            s0 r1 = new s0
            r2 = 7
            r1.<init>(r2)
            r2 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r1, r2)
        L60b:
            return
        L60c:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L618
            android.view.View r0 = (android.view.View) r0
            goto L619
        L618:
            r0 = 0
        L619:
            if (r0 != 0) goto L61c
            goto L64b
        L61c:
            kf r2 = p000.C0467kf.f5879
            java.lang.Float r3 = p000.C0467kf.m3234(r0)
            if (r3 != 0) goto L645
            java.lang.Object[] r1 = r1.f5692
            r1.getClass()
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r6, r1)
            boolean r3 = r1 instanceof java.lang.Number
            if (r3 == 0) goto L634
            java.lang.Number r1 = (java.lang.Number) r1
            goto L635
        L634:
            r1 = 0
        L635:
            if (r1 == 0) goto L640
            float r1 = r1.floatValue()
            java.lang.Float r7 = java.lang.Float.valueOf(r1)
            goto L641
        L640:
            r7 = 0
        L641:
            java.lang.Float r3 = p000.C0467kf.m3228(r7)
        L645:
            p000.C0467kf.m3213(r0)
            r2.m3239(r0, r3)
        L64b:
            return
        L64c:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L658
            android.view.View r0 = (android.view.View) r0
            goto L659
        L658:
            r0 = 0
        L659:
            if (r0 != 0) goto L65c
            goto L681
        L65c:
            java.lang.Object[] r1 = r1.f5692
            r1.getClass()
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r6, r1)
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L66c
            java.lang.Number r1 = (java.lang.Number) r1
            goto L66d
        L66c:
            r1 = 0
        L66d:
            if (r1 == 0) goto L678
            float r1 = r1.floatValue()
            java.lang.Float r7 = java.lang.Float.valueOf(r1)
            goto L679
        L678:
            r7 = 0
        L679:
            kf r1 = p000.C0467kf.f5879
            p000.C0467kf.m3213(r0)
            r1.m3239(r0, r7)
        L681:
            return
        L682:
            r1.getClass()
            java.lang.Object r2 = r1.f5691
            if (r2 != 0) goto L68b
            goto L73a
        L68b:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "~78A74DB286A5B58D592E394EF41C63DE20BC788EDC43993D9FE552FEA93640AEDFE5AFE7C8A3CFD3375E6FDE1627078188FD62BAA7A10FBBFD96F951B4D213E33F2539ED5D9CE6C02C8B6F73"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L6a1
            goto L73a
        L6a1:
            java.lang.Object[] r0 = r1.f5692
            r0.getClass()
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r6, r0)
            if (r0 != 0) goto L6ae
            goto L73a
        L6ae:
            java.lang.String r1 = "getAweme"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L6b7
            java.lang.Object r0 = p000.qe0.m4869(r0, r1, r3)     // Catch: java.lang.Throwable -> L6b7
            goto L6be
        L6b7:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L6be:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L6c4
            r1 = 0
            goto L6c5
        L6c4:
            r1 = r0
        L6c5:
            if (r1 != 0) goto L6c9
            goto L73a
        L6c9:
            kf r0 = p000.C0467kf.f5879
            android.view.View r3 = p000.C0467kf.m3222(r2)
            r4 = 160(0xa0, double:7.9E-322)
            if (r3 == 0) goto L705
            p000.C0467kf.m3214(r3, r1)
            w1 r1 = new w1     // Catch: java.lang.Throwable -> L6df
            r2 = 5
            r1.<init>(r0, r2, r3)     // Catch: java.lang.Throwable -> L6df
            r3.postDelayed(r1, r4)     // Catch: java.lang.Throwable -> L6df
        L6df:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            int r1 = r3.hashCode()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "bind from FeedSyncPresenter#onBind view="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "@"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            p000.C0467kf.m3226(r0)
            goto L73a
        L705:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            p000.C0467kf.f5882 = r0
            java.lang.String r0 = "bind aweme from FeedSyncPresenter#onBind, seekbar pending"
            p000.C0467kf.m3226(r0)
            java.lang.String r0 = "getView"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L71a
            java.lang.Object r0 = p000.qe0.m4869(r2, r0, r3)     // Catch: java.lang.Throwable -> L71a
            goto L721
        L71a:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L721:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L726
            r0 = 0
        L726:
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto L72e
            r7 = r0
            android.view.View r7 = (android.view.View) r7
            goto L72f
        L72e:
            r7 = 0
        L72f:
            if (r7 != 0) goto L732
            goto L73a
        L732:
            w1 r0 = new w1     // Catch: java.lang.Throwable -> L73a
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L73a
            r7.postDelayed(r0, r4)     // Catch: java.lang.Throwable -> L73a
        L73a:
            return
        L73b:
            r1.getClass()
            java.lang.ref.WeakReference r0 = p000.AbstractC0378i.f4853
            if (r0 == 0) goto L749
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            goto L74a
        L749:
            r0 = 0
        L74a:
            java.lang.Object r1 = r1.f5691
            if (r0 != r1) goto L754
            java.lang.ref.WeakReference r0 = p000.AbstractC0378i.f4853
            r16 = 0
            p000.AbstractC0378i.f4853 = r16
        L754:
            return
        L755:
            java.lang.String r2 = "r176f35f04e7b0cfb"
            s62 r3 = p000.s62.f9751
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L766
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = r0
            goto L767
        L766:
            r1 = 0
        L767:
            if (r1 != 0) goto L76b
            goto L802
        L76b:
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r7 = "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"
            java.lang.String r7 = p000.jf0.m2957(r7)
            boolean r7 = p000.x02.m6485(r0, r7, r6)
            if (r7 != 0) goto L787
            java.lang.String r7 = "com.bytedance"
            boolean r0 = p000.x02.m6485(r0, r7, r6)
            if (r0 == 0) goto L802
        L787:
            java.lang.ref.WeakReference r0 = p000.AbstractC0378i.f4853
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            p000.AbstractC0378i.f4853 = r0
            pq r0 = p000.C0696pq.f8651     // Catch: java.lang.Throwable -> L792
        L792:
            boolean r0 = p000.AbstractC0378i.f4854
            if (r0 != 0) goto L7c0
            p000.AbstractC0378i.f4854 = r5
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.AbstractC0976x9.f12071     // Catch: java.lang.Throwable -> L7a6
            android.content.Context r0 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L7a6
            r0.getClass()     // Catch: java.lang.Throwable -> L7a6
            p000.AbstractC0976x9.m6537(r0)     // Catch: java.lang.Throwable -> L7a6
            r5 = r3
            goto L7ac
        L7a6:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
        L7ac:
            java.lang.Throwable r0 = p000.fo1.m2190(r5)
            if (r0 == 0) goto L7c0
            java.lang.String r0 = r0.getMessage()
            java.lang.String r5 = "BetaVerifier 初始化失败: "
            java.lang.String r0 = p000.lz1.m3687(r5, r0)
            r5 = 0
            p000.C0888ux.m5988(r2, r0, r5, r4, r5)
        L7c0:
            java.util.concurrent.CopyOnWriteArraySet r0 = p000.AbstractC0378i.f4855
            java.util.Iterator r5 = r0.iterator()
        L7c6:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L802
            java.lang.Object r0 = r5.next()
            r6 = r0
            ib0 r6 = (p000.ib0) r6
            r6.getClass()     // Catch: java.lang.Throwable -> L7db
            p000.jb0.m2919(r1)     // Catch: java.lang.Throwable -> L7db
            r7 = r3
            goto L7e1
        L7db:
            r0 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r0)
        L7e1:
            java.lang.Throwable r0 = p000.fo1.m2190(r7)
            if (r0 == 0) goto L800
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r7 = "宿主恢复监听器执行失败: "
            java.lang.String r8 = ", "
            java.lang.String r0 = p000.a12.m18(r7, r6, r8, r0)
            r6 = 0
            p000.C0888ux.m5988(r2, r0, r6, r4, r6)
            goto L7c6
        L800:
            r6 = 0
            goto L7c6
        L802:
            return
    }

    @Override // p000.m01
    public void beforeHookedMethod(p000.k01 r11) {
            r10 = this;
            int r0 = r10.f4515
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1
            r3 = 2
            r4 = 0
            r5 = 0
            switch(r0) {
                case 9: goto L325;
                case 10: goto L29b;
                case 11: goto L1ab;
                case 14: goto L196;
                case 16: goto L155;
                case 19: goto Lfd;
                case 26: goto L4f;
                case 27: goto L2f;
                case 28: goto Lf;
                default: goto Lb;
            }
        Lb:
            super.beforeHookedMethod(r11)
            return
        Lf:
            r11.getClass()
            java.lang.Object[] r10 = r11.f5692
            r11 = r10[r4]
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L1d
            r5 = r11
            java.lang.String r5 = (java.lang.String) r5
        L1d:
            if (r5 != 0) goto L20
            goto L2e
        L20:
            android.util.LruCache r11 = p000.C0839tl.f10408
            java.lang.String r11 = p000.C0839tl.m5718(r5)
            boolean r0 = p000.ln0.m3626(r11, r5)
            if (r0 != 0) goto L2e
            r10[r4] = r11
        L2e:
            return
        L2f:
            r11.getClass()
            java.lang.Object[] r10 = r11.f5692
            r11 = r10[r4]
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L3d
            r5 = r11
            java.lang.String r5 = (java.lang.String) r5
        L3d:
            if (r5 != 0) goto L40
            goto L4e
        L40:
            android.util.LruCache r11 = p000.C0839tl.f10408
            java.lang.String r11 = p000.C0839tl.m5718(r5)
            boolean r0 = p000.ln0.m3626(r11, r5)
            if (r0 != 0) goto L4e
            r10[r4] = r11
        L4e:
            return
        L4f:
            r11.getClass()
            java.lang.Object[] r10 = r11.f5692
            r10.getClass()
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r3, r10)
            if (r0 == 0) goto L62
            java.lang.String r0 = r0.toString()
            goto L63
        L62:
            r0 = r5
        L63:
            if (r0 != 0) goto L67
            java.lang.String r0 = ""
        L67:
            java.lang.String r1 = "TokenCert:bpea-comment_save_image_to_album"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L71
            goto Lfc
        L71:
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r4, r10)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L7c
            java.lang.String r0 = (java.lang.String) r0
            goto L7d
        L7c:
            r0 = r5
        L7d:
            if (r0 != 0) goto L81
            goto Lfc
        L81:
            java.lang.Object r10 = p000.AbstractC0312g7.m2253(r2, r10)
            boolean r1 = r10 instanceof java.lang.String
            if (r1 == 0) goto L8c
            java.lang.String r10 = (java.lang.String) r10
            goto L8d
        L8c:
            r10 = r5
        L8d:
            android.util.LruCache r1 = p000.C0839tl.f10408
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "currentApplication"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r5)     // Catch: java.lang.Throwable -> La6
            java.lang.Object r1 = r1.invoke(r5, r5)     // Catch: java.lang.Throwable -> La6
            boolean r2 = r1 instanceof android.content.Context     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto La8
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> La6
            goto Lb0
        La6:
            r1 = move-exception
            goto Laa
        La8:
            r1 = r5
            goto Lb0
        Laa:
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        Lb0:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto Lb5
            r1 = r5
        Lb5:
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto Lbd
            android.content.Context r5 = r1.getApplicationContext()
        Lbd:
            if (r5 != 0) goto Lc0
            goto Lfc
        Lc0:
            qy0 r1 = p000.qy0.f9157     // Catch: java.lang.Throwable -> Lcd
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> Lcd
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lcd
            r1.m5033(r5, r2, r10)     // Catch: java.lang.Throwable -> Lcd
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lcd
            goto Ld4
        Lcd:
            r10 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r10)
            r10 = r0
        Ld4:
            boolean r0 = r10 instanceof p000.eo1
            java.lang.String r1 = "DYHelper_ImageWatermark"
            if (r0 != 0) goto Led
            r0 = r10
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Led
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r11.m3107(r0)
            java.lang.String r11 = "评论图片已写入用户下载路径/评论区图片"
            p000.C0888ux.m5975(r1, r11)
        Led:
            java.lang.Throwable r10 = p000.fo1.m2190(r10)
            if (r10 == 0) goto Lfc
            java.lang.String r11 = r10.getMessage()
            java.lang.String r0 = "接管评论图片保存失败，降级宿主原路径: "
            p000.AbstractC0602nx.m4145(r0, r11, r1, r10)
        Lfc:
            return
        Lfd:
            r11.getClass()
            java.lang.Object[] r10 = r11.f5692
            java.util.concurrent.atomic.AtomicReference r0 = p000.C0287fj.f3964
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L10b
            goto L154
        L10b:
            if (r10 == 0) goto L112
            java.lang.Object r0 = p000.AbstractC0312g7.m2250(r10)
            goto L113
        L112:
            r0 = r5
        L113:
            boolean r1 = r0 instanceof java.nio.ByteBuffer
            if (r1 == 0) goto L154
            if (r10 == 0) goto L11e
            java.lang.Object r10 = p000.AbstractC0312g7.m2253(r2, r10)
            goto L11f
        L11e:
            r10 = r5
        L11f:
            boolean r1 = r10 instanceof java.lang.Integer
            if (r1 == 0) goto L126
            r5 = r10
            java.lang.Integer r5 = (java.lang.Integer) r5
        L126:
            if (r5 == 0) goto L154
            int r10 = r5.intValue()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            if (r10 > 0) goto L133
            byte[] r10 = new byte[r4]
            goto L149
        L133:
            java.nio.ByteBuffer r0 = r0.duplicate()
            int r1 = r0.remaining()
            int r10 = java.lang.Math.min(r10, r1)
            if (r10 > 0) goto L144
            byte[] r10 = new byte[r4]
            goto L149
        L144:
            byte[] r10 = new byte[r10]
            r0.get(r10)
        L149:
            int r0 = r10.length
            if (r0 != 0) goto L14d
            goto L154
        L14d:
            java.lang.String r0 = "dy_audio_bytes"
            java.util.concurrent.ConcurrentHashMap r11 = r11.f5693
            r11.put(r0, r10)
        L154:
            return
        L155:
            r11.getClass()
            java.lang.Object r10 = r11.f5691
            boolean r0 = r10 instanceof android.view.View
            if (r0 == 0) goto L161
            android.view.View r10 = (android.view.View) r10
            goto L162
        L161:
            r10 = r5
        L162:
            if (r10 != 0) goto L165
            goto L195
        L165:
            java.lang.Object[] r11 = r11.f5692
            r11.getClass()
            java.lang.Object r11 = p000.AbstractC0312g7.m2253(r4, r11)
            boolean r0 = r11 instanceof android.view.MotionEvent
            if (r0 == 0) goto L175
            r5 = r11
            android.view.MotionEvent r5 = (android.view.MotionEvent) r5
        L175:
            if (r5 != 0) goto L178
            goto L195
        L178:
            int r11 = r5.getActionMasked()
            if (r11 == 0) goto L181
            if (r11 == r3) goto L181
            goto L195
        L181:
            boolean r11 = p000.C0623oh.f8105
            if (r11 == 0) goto L195
            oh r11 = p000.C0623oh.f8099
            boolean r11 = p000.C0623oh.m4240()
            if (r11 == 0) goto L195
            java.util.Set r11 = p000.C0623oh.f8108
            r11.add(r10)
            p000.C0623oh.m4238(r10, r1)
        L195:
            return
        L196:
            r11.getClass()
            java.lang.Object r10 = r11.f5691
            boolean r11 = r10 instanceof android.view.View
            if (r11 == 0) goto L1a2
            r5 = r10
            android.view.View r5 = (android.view.View) r5
        L1a2:
            if (r5 != 0) goto L1a5
            goto L1aa
        L1a5:
            oh r10 = p000.C0623oh.f8099
            p000.C0623oh.m4237(r5)
        L1aa:
            return
        L1ab:
            r11.getClass()
            java.lang.Object[] r10 = r11.f5692
            r10.getClass()
            java.lang.Object r10 = p000.AbstractC0312g7.m2253(r4, r10)
            if (r10 != 0) goto L1bb
            goto L29a
        L1bb:
            kh r11 = p000.C0469kh.f5917
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.Class r0 = r10.getClass()
        L1c6:
            if (r0 == 0) goto L1f4
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L1f4
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()
            r1.getClass()
            int r3 = r1.length
            r6 = r4
        L1d9:
            if (r6 >= r3) goto L1ef
            r7 = r1[r6]
            java.lang.Class r8 = r7.getType()
            java.lang.Class r9 = java.lang.Boolean.TYPE
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 == 0) goto L1ec
            r11.add(r7)
        L1ec:
            int r6 = r6 + 1
            goto L1d9
        L1ef:
            java.lang.Class r0 = r0.getSuperclass()
            goto L1c6
        L1f4:
            int r0 = r11.size()
            if (r0 == r2) goto L1fb
            goto L21c
        L1fb:
            java.lang.Object r11 = p000.AbstractC0984xh.m6638(r11)     // Catch: java.lang.Throwable -> L20d
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11     // Catch: java.lang.Throwable -> L20d
            r11.setAccessible(r2)     // Catch: java.lang.Throwable -> L20d
            boolean r11 = r11.getBoolean(r10)     // Catch: java.lang.Throwable -> L20d
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> L20d
            goto L214
        L20d:
            r11 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r11)
            r11 = r0
        L214:
            boolean r0 = r11 instanceof p000.eo1
            if (r0 == 0) goto L219
            goto L21a
        L219:
            r5 = r11
        L21a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
        L21c:
            if (r5 == 0) goto L29a
            boolean r11 = r5.booleanValue()
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = p000.C0469kh.f5922
            r0.getClass()
            java.util.Set r0 = p000.AbstractC0984xh.m6671(r0)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            r1.getClass()
            int r2 = r1.length
            r3 = r4
        L238:
            if (r3 >= r2) goto L29a
            r5 = r1[r3]
            java.lang.String r5 = r5.getClassName()
            boolean r6 = r0.contains(r5)
            if (r6 != 0) goto L269
            java.lang.String r6 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444E45EFE5413F312250C3EB77D079E4AFD3F67A87735342D1C21387EB"
            java.lang.String r6 = p000.jf0.m2957(r6)
            boolean r6 = p000.ln0.m3626(r5, r6)
            if (r6 != 0) goto L269
            r5.getClass()
            java.lang.String r6 = "FeedPlayerWrapper"
            boolean r6 = p000.q02.m4654(r5, r6, r4)
            if (r6 != 0) goto L269
            java.lang.String r6 = ".feed.controller."
            boolean r5 = p000.q02.m4654(r5, r6, r4)
            if (r5 == 0) goto L266
            goto L269
        L266:
            int r3 = r3 + 1
            goto L238
        L269:
            tg r0 = p000.AbstractC0871ug.f10771
            r0 = r11 ^ 1
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "EventBusWrapper.post("
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r10 = ", playing="
            r1.append(r10)
            r1.append(r11)
            java.lang.String r10 = ")"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.os.Handler r11 = p000.AbstractC0871ug.f10780
            jg r1 = new jg
            r1.<init>(r10, r0)
            r11.post(r1)
        L29a:
            return
        L29b:
            r11.getClass()
            int r10 = p000.AbstractC0871ug.f10792
            if (r10 > 0) goto L324
            boolean r10 = p000.C0834tg.m5640()
            if (r10 != 0) goto L2aa
            goto L324
        L2aa:
            java.lang.Object r10 = r11.f5691
            boolean r0 = r10 instanceof android.view.View
            if (r0 == 0) goto L2b3
            android.view.View r10 = (android.view.View) r10
            goto L2b4
        L2b3:
            r10 = r5
        L2b4:
            if (r10 != 0) goto L2b8
            goto L324
        L2b8:
            java.lang.Integer r0 = p000.C0834tg.m5664(r10)
            if (r0 == 0) goto L324
            int r0 = r0.intValue()
            java.lang.Object[] r1 = r11.f5692
            r1 = r1[r4]
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L2cd
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L2ce
        L2cd:
            r1 = r5
        L2ce:
            if (r1 == 0) goto L324
            int r1 = r1.intValue()
            java.lang.Float r2 = p000.C0834tg.m5658(r10, r0)
            if (r2 == 0) goto L324
            float r2 = r2.floatValue()
            boolean r3 = p000.C0834tg.m5679(r10, r0)
            if (r3 == 0) goto L2e5
            goto L324
        L2e5:
            r3 = 0
            int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r7 = 2131618521(0x7f0dead9, float:1.8864055E38)
            r8 = 2131618525(0x7f0deadd, float:1.8864063E38)
            if (r6 > 0) goto L30f
            boolean r0 = p000.C0834tg.m5678(r0)
            if (r0 == 0) goto L30f
            if (r1 != 0) goto L30f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r10.setTag(r8, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r10.setTag(r7, r0)
            java.lang.Object[] r10 = r11.f5692
            r11 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r4] = r11
            goto L324
        L30f:
            int r11 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r11 <= 0) goto L31c
            if (r1 != 0) goto L31c
            r10.setTag(r7, r5)
            r10.setTag(r8, r5)
            goto L324
        L31c:
            if (r1 == 0) goto L324
            r10.setTag(r7, r5)
            r10.setTag(r8, r5)
        L324:
            return
        L325:
            r11.getClass()
            int r10 = p000.AbstractC0871ug.f10792
            if (r10 <= 0) goto L32d
            goto L38a
        L32d:
            java.lang.Object r10 = r11.f5691
            boolean r0 = r10 instanceof android.view.View
            if (r0 == 0) goto L336
            android.view.View r10 = (android.view.View) r10
            goto L337
        L336:
            r10 = r5
        L337:
            if (r10 != 0) goto L33a
            goto L38a
        L33a:
            java.lang.Integer r0 = p000.C0834tg.m5664(r10)
            if (r0 == 0) goto L38a
            int r0 = r0.intValue()
            java.lang.Object[] r2 = r11.f5692
            r2 = r2[r4]
            boolean r6 = r2 instanceof java.lang.Float
            if (r6 == 0) goto L34f
            r5 = r2
            java.lang.Float r5 = (java.lang.Float) r5
        L34f:
            if (r5 == 0) goto L38a
            float r2 = r5.floatValue()
            boolean r6 = p000.C0834tg.m5640()
            if (r6 != 0) goto L35c
            goto L38a
        L35c:
            java.lang.Float r6 = p000.C0834tg.m5658(r10, r0)
            if (r6 == 0) goto L38a
            boolean r7 = p000.C0834tg.m5679(r10, r0)
            if (r7 == 0) goto L369
            goto L38a
        L369:
            r7 = 2131618523(0x7f0deadb, float:1.8864059E38)
            r10.setTag(r7, r5)
            if (r0 != r3) goto L372
            goto L376
        L372:
            float r1 = r6.floatValue()
        L376:
            float r2 = r2 - r1
            float r10 = java.lang.Math.abs(r2)
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 <= 0) goto L38a
            java.lang.Object[] r10 = r11.f5692
            java.lang.Float r11 = java.lang.Float.valueOf(r1)
            r10[r4] = r11
        L38a:
            return
    }
}

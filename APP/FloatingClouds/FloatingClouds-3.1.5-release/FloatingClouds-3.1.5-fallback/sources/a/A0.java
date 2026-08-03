package a;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends a.X1 {
    public final java.util.ArrayList b;

    public static final class a {
        public static a.A0 a(org.luckypray.dexkit.DexKitBridge r10, a.C0056b r11) {
                java.lang.String r0 = "bridge"
                a.C0193i9.e(r10, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 4
                int r2 = r11.b(r1)
                r3 = 0
                if (r2 == 0) goto L17
                int r2 = r11.f(r2)
                goto L18
            L17:
                r2 = r3
            L18:
                r4 = r3
            L19:
                if (r4 >= r2) goto L296
                a.a r5 = new a.a
                r5.<init>()
                int r6 = r11.b(r1)
                r7 = 0
                if (r6 == 0) goto L3d
                int r6 = r11.e(r6)
                int r8 = r4 * 4
                int r8 = r8 + r6
                int r6 = r11.a(r8)
                java.nio.ByteBuffer r8 = r11.b
                java.lang.String r9 = "bb"
                a.C0193i9.d(r8, r9)
                r5.c(r6, r8)
                goto L3e
            L3d:
                r5 = r7
            L3e:
                a.C0193i9.b(r5)
                r6 = 6
                int r6 = r5.b(r6)
                if (r6 == 0) goto L52
                java.nio.ByteBuffer r8 = r5.b
                int r9 = r5.f212a
                int r6 = r6 + r9
                byte r6 = r8.get(r6)
                goto L53
            L52:
                r6 = r3
            L53:
                a.C0 r6 = a.C0.a.a(r6)
                int r8 = r6.ordinal()
                switch(r8) {
                    case 0: goto L260;
                    case 1: goto L23a;
                    case 2: goto L214;
                    case 3: goto L1ed;
                    case 4: goto L1c5;
                    case 5: goto L19e;
                    case 6: goto L176;
                    case 7: goto L10f;
                    case 8: goto Lf9;
                    case 9: goto Le3;
                    case 10: goto Lcd;
                    case 11: goto Lb7;
                    case 12: goto La1;
                    case 13: goto L8f;
                    case 14: goto L64;
                    default: goto L5e;
                }
            L5e:
                a.Ob r10 = new a.Ob
                r10.<init>()
                throw r10
            L64:
                a.e r7 = new a.e
                r7.<init>()
                a.Pe r5 = r5.l(r7)
                java.lang.String r7 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }"
                a.C0193i9.c(r5, r7)
                a.e r5 = (a.C0111e) r5
                int r7 = r5.b(r1)
                if (r7 == 0) goto L88
                byte r8 = (byte) r3
                java.nio.ByteBuffer r9 = r5.b
                int r5 = r5.f212a
                int r7 = r7 + r5
                byte r5 = r9.get(r7)
                if (r8 == r5) goto L88
                r5 = 1
                goto L89
            L88:
                r5 = r3
            L89:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                goto L285
            L8f:
                a.l r7 = new a.l
                r7.<init>()
                a.Pe r5 = r5.l(r7)
                java.lang.String r7 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }"
                a.C0193i9.c(r5, r7)
                a.l r5 = (a.C0236l) r5
                goto L285
            La1:
                a.c r7 = new a.c
                r7.<init>()
                a.Pe r5 = r5.l(r7)
                java.lang.String r7 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }"
                a.C0193i9.c(r5, r7)
                a.c r5 = (a.C0075c) r5
                a.x0 r5 = a.C0452x0.a.a(r10, r5)
                goto L285
            Lb7:
                a.b r7 = new a.b
                r7.<init>()
                a.Pe r5 = r5.l(r7)
                java.lang.String r7 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }"
                a.C0193i9.c(r5, r7)
                a.b r5 = (a.C0056b) r5
                a.A0 r5 = a(r10, r5)
                goto L285
            Lcd:
                a.o r7 = new a.o
                r7.<init>()
                a.Pe r5 = r5.l(r7)
                java.lang.String r7 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }"
                a.C0193i9.c(r5, r7)
                a.o r5 = (a.C0290o) r5
                a.r6 r5 = a.C0350r6.a.a(r10, r5)
                goto L285
            Le3:
                a.p r7 = new a.p
                r7.<init>()
                a.Pe r5 = r5.l(r7)
                java.lang.String r7 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }"
                a.C0193i9.c(r5, r7)
                a.p r5 = (a.C0308p) r5
                a.lb r5 = a.C0248lb.a.a(r10, r5)
                goto L285
            Lf9:
                a.d r7 = new a.d
                r7.<init>()
                a.Pe r5 = r5.l(r7)
                java.lang.String r7 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }"
                a.C0193i9.c(r5, r7)
                a.d r5 = (a.C0093d) r5
                a.b3 r5 = a.C0060b3.a.a(r10, r5)
                goto L285
            L10f:
                a.n r8 = new a.n
                r8.<init>()
                a.Pe r5 = r5.l(r8)
                java.lang.String r8 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }"
                a.C0193i9.c(r5, r8)
                a.n r5 = (a.C0272n) r5
                int r8 = r5.b(r1)     // Catch: java.lang.IllegalArgumentException -> L134
                if (r8 == 0) goto L12d
                int r9 = r5.f212a     // Catch: java.lang.IllegalArgumentException -> L134
                int r8 = r8 + r9
                java.lang.String r8 = r5.d(r8)     // Catch: java.lang.IllegalArgumentException -> L134
                goto L12e
            L12d:
                r8 = r7
            L12e:
                a.C0193i9.b(r8)     // Catch: java.lang.IllegalArgumentException -> L134
                r5 = r8
                goto L285
            L134:
                int r8 = r5.b(r1)     // Catch: java.lang.Throwable -> L164
                if (r8 != 0) goto L13b
                goto L156
            L13b:
                java.nio.ByteBuffer r7 = r5.b     // Catch: java.lang.Throwable -> L164
                java.nio.ByteBuffer r7 = r7.duplicate()     // Catch: java.lang.Throwable -> L164
                java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L164
                java.nio.ByteBuffer r7 = r7.order(r9)     // Catch: java.lang.Throwable -> L164
                int r9 = r5.e(r8)     // Catch: java.lang.Throwable -> L164
                r7.position(r9)     // Catch: java.lang.Throwable -> L164
                int r5 = r5.f(r8)     // Catch: java.lang.Throwable -> L164
                int r5 = r5 + r9
                r7.limit(r5)     // Catch: java.lang.Throwable -> L164
            L156:
                java.lang.String r5 = "__vector_as_bytebuffer(4, 1)"
                a.C0193i9.d(r7, r5)     // Catch: java.lang.Throwable -> L164
                java.lang.String r5 = a.C0282n9.n(r7)     // Catch: java.lang.Throwable -> L164
                java.lang.String r5 = a.C0282n9.o(r5)     // Catch: java.lang.Throwable -> L164
                goto L169
            L164:
                r5 = move-exception
                a.wd$a r5 = a.C0465xd.a(r5)
            L169:
                java.lang.Throwable r7 = a.C0447wd.a(r5)
                if (r7 != 0) goto L170
                goto L172
            L170:
                java.lang.String r5 = ""
            L172:
                java.lang.String r5 = (java.lang.String) r5
                goto L285
            L176:
                a.h r7 = new a.h
                r7.<init>()
                a.Pe r5 = r5.l(r7)
                java.lang.String r7 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }"
                a.C0193i9.c(r5, r7)
                a.h r5 = (a.C0165h) r5
                int r7 = r5.b(r1)
                if (r7 == 0) goto L196
                java.nio.ByteBuffer r8 = r5.b
                int r5 = r5.f212a
                int r7 = r7 + r5
                double r7 = r8.getDouble(r7)
                goto L198
            L196:
                r7 = 0
            L198:
                java.lang.Double r5 = java.lang.Double.valueOf(r7)
                goto L285
            L19e:
                a.i r7 = new a.i
                r7.<init>()
                a.Pe r5 = r5.l(r7)
                java.lang.String r7 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }"
                a.C0193i9.c(r5, r7)
                a.i r5 = (a.C0183i) r5
                int r7 = r5.b(r1)
                if (r7 == 0) goto L1be
                java.nio.ByteBuffer r8 = r5.b
                int r5 = r5.f212a
                int r7 = r7 + r5
                float r5 = r8.getFloat(r7)
                goto L1bf
            L1be:
                r5 = 0
            L1bf:
                java.lang.Float r5 = java.lang.Float.valueOf(r5)
                goto L285
            L1c5:
                a.k r7 = new a.k
                r7.<init>()
                a.Pe r5 = r5.l(r7)
                java.lang.String r7 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }"
                a.C0193i9.c(r5, r7)
                a.k r5 = (a.C0218k) r5
                int r7 = r5.b(r1)
                if (r7 == 0) goto L1e5
                java.nio.ByteBuffer r8 = r5.b
                int r5 = r5.f212a
                int r7 = r7 + r5
                long r7 = r8.getLong(r7)
                goto L1e7
            L1e5:
                r7 = 0
            L1e7:
                java.lang.Long r5 = java.lang.Long.valueOf(r7)
                goto L285
            L1ed:
                a.j r7 = new a.j
                r7.<init>()
                a.Pe r5 = r5.l(r7)
                java.lang.String r7 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }"
                a.C0193i9.c(r5, r7)
                a.j r5 = (a.C0200j) r5
                int r7 = r5.b(r1)
                if (r7 == 0) goto L20d
                java.nio.ByteBuffer r8 = r5.b
                int r5 = r5.f212a
                int r7 = r7 + r5
                int r5 = r8.getInt(r7)
                goto L20e
            L20d:
                r5 = r3
            L20e:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L285
            L214:
                a.g r7 = new a.g
                r7.<init>()
                a.Pe r5 = r5.l(r7)
                java.lang.String r7 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }"
                a.C0193i9.c(r5, r7)
                a.g r5 = (a.C0147g) r5
                int r7 = r5.b(r1)
                if (r7 == 0) goto L234
                java.nio.ByteBuffer r8 = r5.b
                int r5 = r5.f212a
                int r7 = r7 + r5
                short r5 = r8.getShort(r7)
                goto L235
            L234:
                r5 = r3
            L235:
                java.lang.Short r5 = java.lang.Short.valueOf(r5)
                goto L285
            L23a:
                a.m r7 = new a.m
                r7.<init>()
                a.Pe r5 = r5.l(r7)
                java.lang.String r7 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }"
                a.C0193i9.c(r5, r7)
                a.m r5 = (a.C0254m) r5
                int r7 = r5.b(r1)
                if (r7 == 0) goto L25a
                java.nio.ByteBuffer r8 = r5.b
                int r5 = r5.f212a
                int r7 = r7 + r5
                short r5 = r8.getShort(r7)
                goto L25b
            L25a:
                r5 = r3
            L25b:
                java.lang.Short r5 = java.lang.Short.valueOf(r5)
                goto L285
            L260:
                a.f r7 = new a.f
                r7.<init>()
                a.Pe r5 = r5.l(r7)
                java.lang.String r7 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }"
                a.C0193i9.c(r5, r7)
                a.f r5 = (a.C0129f) r5
                int r7 = r5.b(r1)
                if (r7 == 0) goto L280
                java.nio.ByteBuffer r8 = r5.b
                int r5 = r5.f212a
                int r7 = r7 + r5
                byte r5 = r8.get(r7)
                goto L281
            L280:
                r5 = r3
            L281:
                java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            L285:
                java.lang.String r7 = "when (type) {\n          …lue\n                    }"
                a.C0193i9.d(r5, r7)
                a.B0 r7 = new a.B0
                r7.<init>(r5, r6)
                r0.add(r7)
                int r4 = r4 + 1
                goto L19
            L296:
                a.A0 r11 = new a.A0
                r11.<init>(r10, r0)
                return r11
        }
    }

    public A0() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public A0(org.luckypray.dexkit.DexKitBridge r2, java.util.ArrayList r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0, r0)
            r1.b = r3
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{"
            r0.<init>(r1)
            java.util.ArrayList r1 = r5.b
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        Le:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L32
            java.lang.Object r3 = r1.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L2a
            a.B0 r3 = (a.B0) r3
            if (r2 == 0) goto L25
            java.lang.String r2 = ", "
            r0.append(r2)
        L25:
            r0.append(r3)
            r2 = r4
            goto Le
        L2a:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Index overflow has happened."
            r0.<init>(r1)
            throw r0
        L32:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            a.C0193i9.d(r0, r1)
            return r0
    }
}

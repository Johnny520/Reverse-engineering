package a;

/* JADX INFO: renamed from: a.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0452x0 extends a.X1 {
    public final java.lang.String b;
    public final java.util.ArrayList c;

    /* JADX INFO: renamed from: a.x0$a */
    public static final class a {
        public static a.C0452x0 a(org.luckypray.dexkit.DexKitBridge r17, a.C0075c r18) {
                r0 = r17
                r1 = r18
                r2 = 1
                r3 = 4
                java.lang.String r4 = "bridge"
                a.C0193i9.e(r0, r4)
                int r4 = r1.b(r3)
                if (r4 == 0) goto L19
                java.nio.ByteBuffer r5 = r1.b
                int r6 = r1.f212a
                int r4 = r4 + r6
                r5.getInt(r4)
            L19:
                r4 = 6
                int r5 = r1.b(r4)
                if (r5 == 0) goto L28
                java.nio.ByteBuffer r6 = r1.b
                int r7 = r1.f212a
                int r5 = r5 + r7
                r6.getInt(r5)
            L28:
                r5 = 8
                int r5 = r1.b(r5)
                if (r5 == 0) goto L38
                int r7 = r1.f212a
                int r5 = r5 + r7
                java.lang.String r5 = r1.d(r5)
                goto L39
            L38:
                r5 = 0
            L39:
                a.C0193i9.b(r5)
                r7 = 10
                int r7 = r1.b(r7)
                r8 = 0
                if (r7 == 0) goto L4f
                java.nio.ByteBuffer r9 = r1.b
                int r10 = r1.f212a
                int r7 = r7 + r10
                byte r7 = r9.get(r7)
                goto L50
            L4f:
                r7 = r8
            L50:
                if (r7 != 0) goto L53
                goto L5d
            L53:
                if (r7 != r2) goto L56
                goto L5d
            L56:
                r9 = 2
                if (r7 != r9) goto L5a
                goto L5d
            L5a:
                r9 = 3
                if (r7 != r9) goto L2ea
            L5d:
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                r9 = 12
                int r10 = r1.b(r9)
                if (r10 == 0) goto L6f
                int r10 = r1.f(r10)
                goto L70
            L6f:
                r10 = r8
            L70:
                r11 = r8
            L71:
                if (r11 >= r10) goto L2e2
                a.a r12 = new a.a
                r12.<init>()
                int r13 = r1.b(r9)
                java.lang.String r14 = "bb"
                if (r13 == 0) goto L94
                int r13 = r1.e(r13)
                int r15 = r11 * 4
                int r15 = r15 + r13
                int r13 = r1.a(r15)
                java.nio.ByteBuffer r15 = r1.b
                a.C0193i9.d(r15, r14)
                r12.c(r13, r15)
                goto L95
            L94:
                r12 = 0
            L95:
                a.C0193i9.b(r12)
                a.a r13 = new a.a
                r13.<init>()
                int r15 = r12.b(r4)
                r16 = r2
                if (r15 == 0) goto Lb5
                int r2 = r12.f212a
                int r15 = r15 + r2
                int r2 = r12.a(r15)
                java.nio.ByteBuffer r15 = r12.b
                a.C0193i9.d(r15, r14)
                r13.c(r2, r15)
                goto Lb6
            Lb5:
                r13 = 0
            Lb6:
                java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeValueMeta }"
                a.C0193i9.c(r13, r2)
                a.z0 r2 = new a.z0
                int r14 = r12.b(r3)
                if (r14 == 0) goto Lcb
                int r15 = r12.f212a
                int r14 = r14 + r15
                java.lang.String r12 = r12.d(r14)
                goto Lcc
            Lcb:
                r12 = 0
            Lcc:
                a.C0193i9.b(r12)
                int r14 = r13.b(r4)
                if (r14 == 0) goto Ldf
                java.nio.ByteBuffer r15 = r13.b
                int r4 = r13.f212a
                int r14 = r14 + r4
                byte r4 = r15.get(r14)
                goto Le0
            Ldf:
                r4 = r8
            Le0:
                a.C0 r4 = a.C0.a.a(r4)
                int r14 = r4.ordinal()
                switch(r14) {
                    case 0: goto L2ab;
                    case 1: goto L285;
                    case 2: goto L25f;
                    case 3: goto L238;
                    case 4: goto L210;
                    case 5: goto L1e9;
                    case 6: goto L1c1;
                    case 7: goto L19d;
                    case 8: goto L187;
                    case 9: goto L171;
                    case 10: goto L15b;
                    case 11: goto L145;
                    case 12: goto L12f;
                    case 13: goto L11d;
                    case 14: goto Lf1;
                    default: goto Leb;
                }
            Leb:
                a.Ob r0 = new a.Ob
                r0.<init>()
                throw r0
            Lf1:
                a.e r14 = new a.e
                r14.<init>()
                a.Pe r13 = r13.l(r14)
                java.lang.String r14 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }"
                a.C0193i9.c(r13, r14)
                a.e r13 = (a.C0111e) r13
                int r14 = r13.b(r3)
                if (r14 == 0) goto L116
                byte r15 = (byte) r8
                java.nio.ByteBuffer r6 = r13.b
                int r13 = r13.f212a
                int r14 = r14 + r13
                byte r6 = r6.get(r14)
                if (r15 == r6) goto L116
                r6 = r16
                goto L117
            L116:
                r6 = r8
            L117:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                goto L2d0
            L11d:
                a.l r6 = new a.l
                r6.<init>()
                a.Pe r6 = r13.l(r6)
                java.lang.String r13 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }"
                a.C0193i9.c(r6, r13)
                a.l r6 = (a.C0236l) r6
                goto L2d0
            L12f:
                a.c r6 = new a.c
                r6.<init>()
                a.Pe r6 = r13.l(r6)
                java.lang.String r13 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }"
                a.C0193i9.c(r6, r13)
                a.c r6 = (a.C0075c) r6
                a.x0 r6 = a(r0, r6)
                goto L2d0
            L145:
                a.b r6 = new a.b
                r6.<init>()
                a.Pe r6 = r13.l(r6)
                java.lang.String r13 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }"
                a.C0193i9.c(r6, r13)
                a.b r6 = (a.C0056b) r6
                a.A0 r6 = a.A0.a.a(r0, r6)
                goto L2d0
            L15b:
                a.o r6 = new a.o
                r6.<init>()
                a.Pe r6 = r13.l(r6)
                java.lang.String r13 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }"
                a.C0193i9.c(r6, r13)
                a.o r6 = (a.C0290o) r6
                a.r6 r6 = a.C0350r6.a.a(r0, r6)
                goto L2d0
            L171:
                a.p r6 = new a.p
                r6.<init>()
                a.Pe r6 = r13.l(r6)
                java.lang.String r13 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }"
                a.C0193i9.c(r6, r13)
                a.p r6 = (a.C0308p) r6
                a.lb r6 = a.C0248lb.a.a(r0, r6)
                goto L2d0
            L187:
                a.d r6 = new a.d
                r6.<init>()
                a.Pe r6 = r13.l(r6)
                java.lang.String r13 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }"
                a.C0193i9.c(r6, r13)
                a.d r6 = (a.C0093d) r6
                a.b3 r6 = a.C0060b3.a.a(r0, r6)
                goto L2d0
            L19d:
                a.n r6 = new a.n
                r6.<init>()
                a.Pe r6 = r13.l(r6)
                java.lang.String r13 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }"
                a.C0193i9.c(r6, r13)
                a.n r6 = (a.C0272n) r6
                int r13 = r6.b(r3)
                if (r13 == 0) goto L1bb
                int r14 = r6.f212a
                int r13 = r13 + r14
                java.lang.String r6 = r6.d(r13)
                goto L1bc
            L1bb:
                r6 = 0
            L1bc:
                a.C0193i9.b(r6)
                goto L2d0
            L1c1:
                a.h r6 = new a.h
                r6.<init>()
                a.Pe r6 = r13.l(r6)
                java.lang.String r13 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }"
                a.C0193i9.c(r6, r13)
                a.h r6 = (a.C0165h) r6
                int r13 = r6.b(r3)
                if (r13 == 0) goto L1e1
                java.nio.ByteBuffer r14 = r6.b
                int r6 = r6.f212a
                int r13 = r13 + r6
                double r13 = r14.getDouble(r13)
                goto L1e3
            L1e1:
                r13 = 0
            L1e3:
                java.lang.Double r6 = java.lang.Double.valueOf(r13)
                goto L2d0
            L1e9:
                a.i r6 = new a.i
                r6.<init>()
                a.Pe r6 = r13.l(r6)
                java.lang.String r13 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }"
                a.C0193i9.c(r6, r13)
                a.i r6 = (a.C0183i) r6
                int r13 = r6.b(r3)
                if (r13 == 0) goto L209
                java.nio.ByteBuffer r14 = r6.b
                int r6 = r6.f212a
                int r13 = r13 + r6
                float r6 = r14.getFloat(r13)
                goto L20a
            L209:
                r6 = 0
            L20a:
                java.lang.Float r6 = java.lang.Float.valueOf(r6)
                goto L2d0
            L210:
                a.k r6 = new a.k
                r6.<init>()
                a.Pe r6 = r13.l(r6)
                java.lang.String r13 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }"
                a.C0193i9.c(r6, r13)
                a.k r6 = (a.C0218k) r6
                int r13 = r6.b(r3)
                if (r13 == 0) goto L230
                java.nio.ByteBuffer r14 = r6.b
                int r6 = r6.f212a
                int r13 = r13 + r6
                long r13 = r14.getLong(r13)
                goto L232
            L230:
                r13 = 0
            L232:
                java.lang.Long r6 = java.lang.Long.valueOf(r13)
                goto L2d0
            L238:
                a.j r6 = new a.j
                r6.<init>()
                a.Pe r6 = r13.l(r6)
                java.lang.String r13 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }"
                a.C0193i9.c(r6, r13)
                a.j r6 = (a.C0200j) r6
                int r13 = r6.b(r3)
                if (r13 == 0) goto L258
                java.nio.ByteBuffer r14 = r6.b
                int r6 = r6.f212a
                int r13 = r13 + r6
                int r6 = r14.getInt(r13)
                goto L259
            L258:
                r6 = r8
            L259:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                goto L2d0
            L25f:
                a.g r6 = new a.g
                r6.<init>()
                a.Pe r6 = r13.l(r6)
                java.lang.String r13 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }"
                a.C0193i9.c(r6, r13)
                a.g r6 = (a.C0147g) r6
                int r13 = r6.b(r3)
                if (r13 == 0) goto L27f
                java.nio.ByteBuffer r14 = r6.b
                int r6 = r6.f212a
                int r13 = r13 + r6
                short r6 = r14.getShort(r13)
                goto L280
            L27f:
                r6 = r8
            L280:
                java.lang.Short r6 = java.lang.Short.valueOf(r6)
                goto L2d0
            L285:
                a.m r6 = new a.m
                r6.<init>()
                a.Pe r6 = r13.l(r6)
                java.lang.String r13 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }"
                a.C0193i9.c(r6, r13)
                a.m r6 = (a.C0254m) r6
                int r13 = r6.b(r3)
                if (r13 == 0) goto L2a5
                java.nio.ByteBuffer r14 = r6.b
                int r6 = r6.f212a
                int r13 = r13 + r6
                short r6 = r14.getShort(r13)
                goto L2a6
            L2a5:
                r6 = r8
            L2a6:
                java.lang.Short r6 = java.lang.Short.valueOf(r6)
                goto L2d0
            L2ab:
                a.f r6 = new a.f
                r6.<init>()
                a.Pe r6 = r13.l(r6)
                java.lang.String r13 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }"
                a.C0193i9.c(r6, r13)
                a.f r6 = (a.C0129f) r6
                int r13 = r6.b(r3)
                if (r13 == 0) goto L2cb
                java.nio.ByteBuffer r14 = r6.b
                int r6 = r6.f212a
                int r13 = r13 + r6
                byte r6 = r14.get(r13)
                goto L2cc
            L2cb:
                r6 = r8
            L2cc:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            L2d0:
                a.B0 r13 = new a.B0
                r13.<init>(r6, r4)
                r2.<init>(r0, r12, r13)
                r7.add(r2)
                int r11 = r11 + 1
                r2 = r16
                r4 = 6
                goto L71
            L2e2:
                a.Wf r1 = a.Wf.f330a
                a.x0 r1 = new a.x0
                r1.<init>(r0, r5, r7)
                return r1
            L2ea:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Unknown AnnotationVisibilityType: "
                java.lang.String r1 = a.C0487z.e(r1, r7)
                r0.<init>(r1)
                throw r0
        }
    }

    public C0452x0() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public C0452x0(org.luckypray.dexkit.DexKitBridge r2, java.lang.String r3, java.util.ArrayList r4) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0, r0)
            r1.b = r3
            r1.c = r4
            a.y0 r2 = new a.y0
            r3 = 0
            r2.<init>(r1, r3)
            a.Me r3 = new a.Me
            r3.<init>(r2)
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.b
            java.lang.String r1 = a.C0171h5.a(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "@"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.util.ArrayList r1 = r5.c
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L28:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r1.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L44
            a.z0 r3 = (a.C0488z0) r3
            if (r2 == 0) goto L3f
            java.lang.String r2 = ", "
            r0.append(r2)
        L3f:
            r0.append(r3)
            r2 = r4
            goto L28
        L44:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Index overflow has happened."
            r0.<init>(r1)
            throw r0
        L4c:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            a.C0193i9.d(r0, r1)
            return r0
    }
}

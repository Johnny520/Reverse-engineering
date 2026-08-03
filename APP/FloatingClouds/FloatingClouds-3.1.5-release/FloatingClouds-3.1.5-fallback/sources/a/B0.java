package a;

/* JADX INFO: loaded from: classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f20a;
    public final a.C0 b;

    public B0(java.lang.Object r1, a.C0 r2) {
            r0 = this;
            r0.<init>()
            r0.f20a = r1
            r0.b = r2
            return
    }

    public final java.lang.String toString() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            a.C0 r1 = r7.b
            int r1 = r1.ordinal()
            r2 = 0
            java.lang.String r3 = ", "
            r4 = 62
            java.lang.String r5 = "."
            java.lang.Object r6 = r7.f20a
            switch(r1) {
                case 7: goto Lbd;
                case 8: goto Lae;
                case 9: goto L6c;
                case 10: goto L4f;
                case 11: goto L33;
                case 12: goto L23;
                case 13: goto L1c;
                default: goto L17;
            }
        L17:
            r0.append(r6)
            goto Lc8
        L1c:
            java.lang.String r1 = "null"
            r0.append(r1)
            goto Lc8
        L23:
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationData"
            a.C0193i9.c(r6, r1)
            a.x0 r6 = (a.C0452x0) r6
            java.lang.String r1 = r6.toString()
            r0.append(r1)
            goto Lc8
        L33:
            java.lang.String r1 = "{"
            r0.append(r1)
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationEncodeArrayData"
            a.C0193i9.c(r6, r1)
            a.A0 r6 = (a.A0) r6
            java.util.ArrayList r1 = r6.b
            java.lang.String r1 = a.C0383t3.p0(r1, r3, r2, r4)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            goto Lc8
        L4f:
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.result.FieldData"
            a.C0193i9.c(r6, r1)
            a.r6 r6 = (a.C0350r6) r6
            a.Y4 r1 = r6.b()
            java.lang.String r1 = r1.c
            r0.append(r1)
            r0.append(r5)
            a.Y4 r1 = r6.b()
            java.lang.String r1 = r1.b
            r0.append(r1)
            goto Lc8
        L6c:
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.result.MethodData"
            a.C0193i9.c(r6, r1)
            a.lb r6 = (a.C0248lb) r6
            a.f5 r1 = r6.b()
            java.lang.String r1 = r1.d
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            a.f5 r1 = r6.b()
            java.lang.String r1 = r1.f469a
            r0.append(r1)
            r0.append(r5)
            a.f5 r1 = r6.b()
            java.lang.String r1 = r1.b
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            a.f5 r1 = r6.b()
            java.util.ArrayList r1 = r1.c
            java.lang.String r1 = a.C0383t3.p0(r1, r3, r2, r4)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            goto Lc8
        Lae:
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.result.ClassData"
            a.C0193i9.c(r6, r1)
            a.b3 r6 = (a.C0060b3) r6
            java.lang.String r1 = r6.b()
            r0.append(r1)
            goto Lc8
        Lbd:
            java.lang.String r1 = "\""
            r0.append(r1)
            r0.append(r6)
            r0.append(r1)
        Lc8:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            a.C0193i9.d(r0, r1)
            return r0
    }
}

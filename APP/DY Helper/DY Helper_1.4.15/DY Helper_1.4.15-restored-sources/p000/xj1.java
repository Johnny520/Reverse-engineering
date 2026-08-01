package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class xj1 extends kotlin.jvm.internal.AbstractC0477 implements p000.so0 {

    /* JADX INFO: renamed from: ε */
    public final boolean f12194;

    public xj1(int r9, java.lang.Class r10, java.lang.Object r11, java.lang.String r12, java.lang.String r13) {
            r8 = this;
            r0 = 1
            r9 = r9 & r0
            r1 = 0
            if (r9 != r0) goto Lc
            r7 = r0
        L6:
            r2 = r8
            r4 = r10
            r3 = r11
            r5 = r12
            r6 = r13
            goto Le
        Lc:
            r7 = r1
            goto L6
        Le:
            r2.<init>(r3, r4, r5, r6, r7)
            r2.f12194 = r1
            return
    }

    @Override // kotlin.jvm.internal.AbstractC0477
    public final p000.io0 compute() {
            r1 = this;
            boolean r0 = r1.f12194
            if (r0 == 0) goto L5
            return r1
        L5:
            io0 r1 = super.compute()
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.xj1
            r2 = 0
            if (r1 == 0) goto L45
            xj1 r5 = (p000.xj1) r5
            jo0 r1 = r4.getOwner()
            jo0 r3 = r5.getOwner()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            java.lang.String r1 = r4.getName()
            java.lang.String r3 = r5.getName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            java.lang.String r1 = r4.getSignature()
            java.lang.String r3 = r5.getSignature()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            java.lang.Object r4 = r4.getBoundReceiver()
            java.lang.Object r5 = r5.getBoundReceiver()
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L44
            return r0
        L44:
            return r2
        L45:
            boolean r0 = r5 instanceof p000.so0
            if (r0 == 0) goto L52
            io0 r4 = r4.compute()
            boolean r4 = r5.equals(r4)
            return r4
        L52:
            return r2
    }

    @Override // kotlin.jvm.internal.AbstractC0477
    public final /* bridge */ /* synthetic */ p000.io0 getReflected() {
            r0 = this;
            so0 r0 = r0.m6677()
            return r0
    }

    public final int hashCode() {
            r2 = this;
            jo0 r0 = r2.getOwner()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.getName()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r2 = r2.getSignature()
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            io0 r0 = r2.compute()
            if (r0 == r2) goto Lb
            java.lang.String r2 = r0.toString()
            return r2
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "property "
            r0.<init>(r1)
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = " (Kotlin reflection is not available)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: β */
    public final p000.so0 m6677() {
            r1 = this;
            boolean r0 = r1.f12194
            if (r0 != 0) goto L15
            io0 r0 = r1.compute()
            if (r0 == r1) goto Ld
            so0 r0 = (p000.so0) r0
            return r0
        Ld:
            fq r1 = new fq
            java.lang.String r0 = "Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath"
            r1.<init>(r0)
            throw r1
        L15:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980"
            r1.<init>(r0)
            throw r1
    }
}

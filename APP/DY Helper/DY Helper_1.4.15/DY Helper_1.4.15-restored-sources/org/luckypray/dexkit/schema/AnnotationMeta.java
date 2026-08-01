package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMeta, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationMeta extends p000.p22 {
    public static final org.luckypray.dexkit.schema.AnnotationMeta.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMeta$Companion */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(p000.AbstractC1067zq r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: addDexId-Qn1smSk, reason: not valid java name */
        public final void m7418addDexIdQn1smSk(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 0
                r1.m724(r0, r2)
                return
        }

        public final void addElements(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 4
                r1.m727(r0, r2)
                return
        }

        public final void addTypeDescriptor(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 2
                r1.m727(r0, r2)
                return
        }

        /* JADX INFO: renamed from: addTypeId-Qn1smSk, reason: not valid java name */
        public final void m7419addTypeIdQn1smSk(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 1
                r1.m724(r0, r2)
                return
        }

        public final void addVisibility(p000.b40 r1, byte r2) {
                r0 = this;
                r1.getClass()
                r0 = 3
                r1.m722(r0, r2)
                return
        }

        /* JADX INFO: renamed from: createAnnotationMeta-d0p9NHs, reason: not valid java name */
        public final int m7420createAnnotationMetad0p9NHs(p000.b40 r2, int r3, int r4, int r5, byte r6, int r7) {
                r1 = this;
                r2.getClass()
                r0 = 5
                r2.m737(r0)
                r1.addElements(r2, r7)
                r1.addTypeDescriptor(r2, r5)
                r1.m7419addTypeIdQn1smSk(r2, r4)
                r1.m7418addDexIdQn1smSk(r2, r3)
                r1.addVisibility(r2, r6)
                int r1 = r1.endAnnotationMeta(r2)
                return r1
        }

        public final int createElementsVector(p000.b40 r2, int[] r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r1 = 4
                int r0 = r3.length
                r2.m738(r1, r0, r1)
                int r1 = r3.length
                int r1 = r1 + (-1)
            Le:
                r0 = -1
                if (r0 >= r1) goto L19
                r0 = r3[r1]
                r2.m726(r0)
                int r1 = r1 + (-1)
                goto Le
            L19:
                int r1 = r2.m732()
                return r1
        }

        public final int endAnnotationMeta(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                int r0 = r1.m731()
                return r0
        }

        public final org.luckypray.dexkit.schema.AnnotationMeta getRootAsAnnotationMeta(java.nio.ByteBuffer r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.schema.-AnnotationMeta r0 = new org.luckypray.dexkit.schema.-AnnotationMeta
                r0.<init>()
                org.luckypray.dexkit.schema.-AnnotationMeta r1 = r1.getRootAsAnnotationMeta(r2, r0)
                return r1
        }

        public final org.luckypray.dexkit.schema.AnnotationMeta getRootAsAnnotationMeta(java.nio.ByteBuffer r2, org.luckypray.dexkit.schema.AnnotationMeta r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                int r1 = p000.AbstractC0602nx.m4122(r2, r1)
                int r0 = r2.position()
                int r0 = r0 + r1
                org.luckypray.dexkit.schema.-AnnotationMeta r1 = r3.__assign(r0, r2)
                return r1
        }

        public final void startAnnotationMeta(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                r0 = 5
                r1.m737(r0)
                return
        }

        public final void startElementsVector(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 4
                r1.m738(r0, r2, r0)
                return
        }

        public final void validateVersion() {
                r0 = this;
                return
        }
    }

    static {
            org.luckypray.dexkit.schema.-AnnotationMeta$Companion r0 = new org.luckypray.dexkit.schema.-AnnotationMeta$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.AnnotationMeta.Companion = r0
            return
    }

    public AnnotationMeta() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.AnnotationMeta __assign(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r2.getClass()
            r0.__init(r1, r2)
            return r0
    }

    public final void __init(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r2.getClass()
            r0.__reset(r1, r2)
            return
    }

    public final org.luckypray.dexkit.schema.AnnotationElementMeta elements(int r2) {
            r1 = this;
            org.luckypray.dexkit.schema.-AnnotationElementMeta r0 = new org.luckypray.dexkit.schema.-AnnotationElementMeta
            r0.<init>()
            org.luckypray.dexkit.schema.-AnnotationElementMeta r1 = r1.elements(r0, r2)
            return r1
    }

    public final org.luckypray.dexkit.schema.AnnotationElementMeta elements(org.luckypray.dexkit.schema.AnnotationElementMeta r2, int r3) {
            r1 = this;
            r2.getClass()
            r0 = 12
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto L20
            int r0 = r1.__vector(r0)
            int r3 = r3 * 4
            int r3 = r3 + r0
            int r3 = r1.__indirect(r3)
            java.nio.ByteBuffer r1 = r1.f8399bb
            r1.getClass()
            org.luckypray.dexkit.schema.-AnnotationElementMeta r1 = r2.__assign(r3, r1)
            return r1
        L20:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: getDexId-pVg5ArA, reason: not valid java name */
    public final int m7414getDexIdpVg5ArA() {
            r2 = this;
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            int r2 = r1.getInt(r0)
            return r2
        L11:
            r2 = 0
            return r2
    }

    public final int getElementsLength() {
            r1 = this;
            r0 = 12
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Ld
            int r1 = r1.__vector_len(r0)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public final java.lang.String getTypeDescriptor() {
            r2 = this;
            r0 = 8
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L10
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            java.lang.String r2 = r2.__string(r0)
            return r2
        L10:
            r2 = 0
            return r2
    }

    public final java.nio.ByteBuffer getTypeDescriptorAsByteBuffer() {
            r2 = this;
            r0 = 8
            r1 = 1
            java.nio.ByteBuffer r2 = r2.__vector_as_bytebuffer(r0, r1)
            r2.getClass()
            return r2
    }

    /* JADX INFO: renamed from: getTypeId-pVg5ArA, reason: not valid java name */
    public final int m7415getTypeIdpVg5ArA() {
            r2 = this;
            r0 = 6
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            int r2 = r1.getInt(r0)
            return r2
        L11:
            r2 = 0
            return r2
    }

    public final byte getVisibility() {
            r2 = this;
            r0 = 10
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            byte r2 = r1.get(r0)
            return r2
        L12:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: mutateDexId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m7416mutateDexIdWZ4Q5Ns(int r3) {
            r2 = this;
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            r1.putInt(r0, r3)
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: mutateTypeId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m7417mutateTypeIdWZ4Q5Ns(int r3) {
            r2 = this;
            r0 = 6
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            r1.putInt(r0, r3)
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    public final boolean mutateVisibility(byte r3) {
            r2 = this;
            r0 = 10
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            r1.put(r0, r3)
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final java.nio.ByteBuffer typeDescriptorInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            r3.getClass()
            r0 = 8
            r1 = 1
            java.nio.ByteBuffer r2 = r2.__vector_in_bytebuffer(r3, r0, r1)
            r2.getClass()
            return r2
    }
}

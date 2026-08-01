package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMeta, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class FieldMeta extends p000.p22 {
    public static final org.luckypray.dexkit.schema.FieldMeta.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMeta$Companion */
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

        /* JADX INFO: renamed from: addAccessFlags-Qn1smSk, reason: not valid java name */
        public final void m7444addAccessFlagsQn1smSk(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 3
                r1.m724(r0, r2)
                return
        }

        /* JADX INFO: renamed from: addClassId-Qn1smSk, reason: not valid java name */
        public final void m7445addClassIdQn1smSk(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 2
                r1.m724(r0, r2)
                return
        }

        public final void addDexDescriptor(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 4
                r1.m727(r0, r2)
                return
        }

        /* JADX INFO: renamed from: addDexId-Qn1smSk, reason: not valid java name */
        public final void m7446addDexIdQn1smSk(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 1
                r1.m724(r0, r2)
                return
        }

        /* JADX INFO: renamed from: addId-Qn1smSk, reason: not valid java name */
        public final void m7447addIdQn1smSk(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 0
                r1.m724(r0, r2)
                return
        }

        /* JADX INFO: renamed from: addTypeId-Qn1smSk, reason: not valid java name */
        public final void m7448addTypeIdQn1smSk(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 5
                r1.m724(r0, r2)
                return
        }

        /* JADX INFO: renamed from: createFieldMeta--riHEuE, reason: not valid java name */
        public final int m7449createFieldMetariHEuE(p000.b40 r2, int r3, int r4, int r5, int r6, int r7, int r8) {
                r1 = this;
                r2.getClass()
                r0 = 6
                r2.m737(r0)
                r1.m7448addTypeIdQn1smSk(r2, r8)
                r1.addDexDescriptor(r2, r7)
                r1.m7444addAccessFlagsQn1smSk(r2, r6)
                r1.m7445addClassIdQn1smSk(r2, r5)
                r1.m7446addDexIdQn1smSk(r2, r4)
                r1.m7447addIdQn1smSk(r2, r3)
                int r1 = r1.endFieldMeta(r2)
                return r1
        }

        public final int endFieldMeta(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                int r0 = r1.m731()
                return r0
        }

        public final org.luckypray.dexkit.schema.FieldMeta getRootAsFieldMeta(java.nio.ByteBuffer r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.schema.-FieldMeta r0 = new org.luckypray.dexkit.schema.-FieldMeta
                r0.<init>()
                org.luckypray.dexkit.schema.-FieldMeta r1 = r1.getRootAsFieldMeta(r2, r0)
                return r1
        }

        public final org.luckypray.dexkit.schema.FieldMeta getRootAsFieldMeta(java.nio.ByteBuffer r2, org.luckypray.dexkit.schema.FieldMeta r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                int r1 = p000.AbstractC0602nx.m4122(r2, r1)
                int r0 = r2.position()
                int r0 = r0 + r1
                org.luckypray.dexkit.schema.-FieldMeta r1 = r3.__assign(r0, r2)
                return r1
        }

        public final void startFieldMeta(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                r0 = 6
                r1.m737(r0)
                return
        }

        public final void validateVersion() {
                r0 = this;
                return
        }
    }

    static {
            org.luckypray.dexkit.schema.-FieldMeta$Companion r0 = new org.luckypray.dexkit.schema.-FieldMeta$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.FieldMeta.Companion = r0
            return
    }

    public FieldMeta() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.FieldMeta __assign(int r1, java.nio.ByteBuffer r2) {
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

    public final java.nio.ByteBuffer dexDescriptorInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            r3.getClass()
            r0 = 12
            r1 = 1
            java.nio.ByteBuffer r2 = r2.__vector_in_bytebuffer(r3, r0, r1)
            r2.getClass()
            return r2
    }

    /* JADX INFO: renamed from: getAccessFlags-pVg5ArA, reason: not valid java name */
    public final int m7434getAccessFlagspVg5ArA() {
            r2 = this;
            r0 = 10
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            int r2 = r1.getInt(r0)
            return r2
        L12:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: getClassId-pVg5ArA, reason: not valid java name */
    public final int m7435getClassIdpVg5ArA() {
            r2 = this;
            r0 = 8
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            int r2 = r1.getInt(r0)
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final java.lang.String getDexDescriptor() {
            r2 = this;
            r0 = 12
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

    public final java.nio.ByteBuffer getDexDescriptorAsByteBuffer() {
            r2 = this;
            r0 = 12
            r1 = 1
            java.nio.ByteBuffer r2 = r2.__vector_as_bytebuffer(r0, r1)
            r2.getClass()
            return r2
    }

    /* JADX INFO: renamed from: getDexId-pVg5ArA, reason: not valid java name */
    public final int m7436getDexIdpVg5ArA() {
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

    /* JADX INFO: renamed from: getId-pVg5ArA, reason: not valid java name */
    public final int m7437getIdpVg5ArA() {
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

    /* JADX INFO: renamed from: getTypeId-pVg5ArA, reason: not valid java name */
    public final int m7438getTypeIdpVg5ArA() {
            r2 = this;
            r0 = 14
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            int r2 = r1.getInt(r0)
            return r2
        L12:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: mutateAccessFlags-WZ4Q5Ns, reason: not valid java name */
    public final boolean m7439mutateAccessFlagsWZ4Q5Ns(int r3) {
            r2 = this;
            r0 = 10
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            r1.putInt(r0, r3)
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: mutateClassId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m7440mutateClassIdWZ4Q5Ns(int r3) {
            r2 = this;
            r0 = 8
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            r1.putInt(r0, r3)
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: mutateDexId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m7441mutateDexIdWZ4Q5Ns(int r3) {
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

    /* JADX INFO: renamed from: mutateId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m7442mutateIdWZ4Q5Ns(int r3) {
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
    public final boolean m7443mutateTypeIdWZ4Q5Ns(int r3) {
            r2 = this;
            r0 = 14
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            r1.putInt(r0, r3)
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }
}

package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public abstract class CstBaseMethodRef extends com.android.dx.rop.cst.CstMemberRef {
    private com.android.dx.rop.type.Prototype instancePrototype;
    private final com.android.dx.rop.type.Prototype prototype;

    public CstBaseMethodRef(com.android.dx.rop.cst.CstType r1, com.android.dx.rop.cst.CstNat r2) {
            r0 = this;
            r0.<init>(r1, r2)
            com.android.dx.rop.cst.CstNat r1 = r0.getNat()
            com.android.dx.rop.cst.CstString r1 = r1.getDescriptor()
            java.lang.String r1 = r1.getString()
            boolean r2 = r0.isSignaturePolymorphic()
            if (r2 == 0) goto L1c
            com.android.dx.rop.type.Prototype r1 = com.android.dx.rop.type.Prototype.fromDescriptor(r1)
            r0.prototype = r1
            goto L22
        L1c:
            com.android.dx.rop.type.Prototype r1 = com.android.dx.rop.type.Prototype.intern(r1)
            r0.prototype = r1
        L22:
            r1 = 0
            r0.instancePrototype = r1
            return
    }

    @Override // com.android.dx.rop.cst.CstMemberRef, com.android.dx.rop.cst.Constant
    public final int compareTo0(com.android.dx.rop.cst.Constant r2) {
            r1 = this;
            int r0 = super.compareTo0(r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            com.android.dx.rop.cst.CstBaseMethodRef r2 = (com.android.dx.rop.cst.CstBaseMethodRef) r2
            com.android.dx.rop.type.Prototype r0 = r1.prototype
            com.android.dx.rop.type.Prototype r2 = r2.prototype
            int r2 = r0.compareTo2(r2)
            return r2
    }

    public final int getParameterWordCount(boolean r1) {
            r0 = this;
            com.android.dx.rop.type.Prototype r1 = r0.getPrototype(r1)
            com.android.dx.rop.type.StdTypeList r1 = r1.getParameterTypes()
            int r1 = r1.getWordCount()
            return r1
    }

    public final com.android.dx.rop.type.Prototype getPrototype() {
            r1 = this;
            com.android.dx.rop.type.Prototype r0 = r1.prototype
            return r0
    }

    public final com.android.dx.rop.type.Prototype getPrototype(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L5
            com.android.dx.rop.type.Prototype r2 = r1.prototype
            return r2
        L5:
            com.android.dx.rop.type.Prototype r2 = r1.instancePrototype
            if (r2 != 0) goto L19
            com.android.dx.rop.cst.CstType r2 = r1.getDefiningClass()
            com.android.dx.rop.type.Type r2 = r2.getClassType()
            com.android.dx.rop.type.Prototype r0 = r1.prototype
            com.android.dx.rop.type.Prototype r2 = r0.withFirstParameter(r2)
            r1.instancePrototype = r2
        L19:
            com.android.dx.rop.type.Prototype r2 = r1.instancePrototype
            return r2
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public final com.android.dx.rop.type.Type getType() {
            r1 = this;
            com.android.dx.rop.type.Prototype r0 = r1.prototype
            com.android.dx.rop.type.Type r0 = r0.getReturnType()
            return r0
    }

    public final boolean isClassInit() {
            r1 = this;
            com.android.dx.rop.cst.CstNat r0 = r1.getNat()
            boolean r0 = r0.isClassInit()
            return r0
    }

    public final boolean isInstanceInit() {
            r1 = this;
            com.android.dx.rop.cst.CstNat r0 = r1.getNat()
            boolean r0 = r0.isInstanceInit()
            return r0
    }

    public final boolean isSignaturePolymorphic() {
            r5 = this;
            r0 = 0
            com.android.dx.rop.cst.CstType r1 = r5.getDefiningClass()
            com.android.dx.rop.cst.CstType r2 = com.android.dx.rop.cst.CstType.METHOD_HANDLE
            boolean r2 = r1.equals(r2)
            r3 = 1
            if (r2 == 0) goto L30
            com.android.dx.rop.cst.CstNat r1 = r5.getNat()
            com.android.dx.rop.cst.CstString r1 = r1.getName()
            java.lang.String r1 = r1.getString()
            r1.hashCode()
            java.lang.String r2 = "invoke"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L2f
            java.lang.String r2 = "invokeExact"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2f
            goto L1ef
        L2f:
            return r3
        L30:
            com.android.dx.rop.cst.CstType r2 = com.android.dx.rop.cst.CstType.VAR_HANDLE
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1ef
            com.android.dx.rop.cst.CstNat r1 = r5.getNat()
            com.android.dx.rop.cst.CstString r1 = r1.getName()
            java.lang.String r1 = r1.getString()
            r1.hashCode()
            r2 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case -1946504908: goto L1e0;
                case -1686727776: goto L1d5;
                case -1671098288: goto L1ca;
                case -1292078254: goto L1bf;
                case -1117944904: goto L1b4;
                case -1103072857: goto L1a9;
                case -1032914329: goto L19e;
                case -1032892181: goto L193;
                case -794517348: goto L185;
                case -567150350: goto L177;
                case -240822786: goto L169;
                case -230706875: goto L15b;
                case -127361888: goto L14d;
                case -37641530: goto L13f;
                case 102230: goto L131;
                case 113762: goto L123;
                case 93645315: goto L115;
                case 101293086: goto L107;
                case 189872914: goto Lf9;
                case 282707520: goto Leb;
                case 282724865: goto Ldd;
                case 353422447: goto Lcf;
                case 470702883: goto Lc1;
                case 685319959: goto Lb3;
                case 748071969: goto La5;
                case 937077366: goto L97;
                case 1245632875: goto L89;
                case 1352153939: goto L7b;
                case 1483964149: goto L6d;
                case 2002508693: goto L5f;
                case 2013994287: goto L51;
                default: goto L4f;
            }
        L4f:
            goto L1ea
        L51:
            java.lang.String r4 = "weakCompareAndSetRelease"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L5b
            goto L1ea
        L5b:
            r2 = 30
            goto L1ea
        L5f:
            java.lang.String r4 = "getAndSetAcquire"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L69
            goto L1ea
        L69:
            r2 = 29
            goto L1ea
        L6d:
            java.lang.String r4 = "compareAndExchange"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L77
            goto L1ea
        L77:
            r2 = 28
            goto L1ea
        L7b:
            java.lang.String r4 = "getAndBitwiseOr"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L85
            goto L1ea
        L85:
            r2 = 27
            goto L1ea
        L89:
            java.lang.String r4 = "getAndBitwiseXorAcquire"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L93
            goto L1ea
        L93:
            r2 = 26
            goto L1ea
        L97:
            java.lang.String r4 = "getAndAddAcquire"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto La1
            goto L1ea
        La1:
            r2 = 25
            goto L1ea
        La5:
            java.lang.String r4 = "compareAndExchangeAcquire"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Laf
            goto L1ea
        Laf:
            r2 = 24
            goto L1ea
        Lb3:
            java.lang.String r4 = "getOpaque"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Lbd
            goto L1ea
        Lbd:
            r2 = 23
            goto L1ea
        Lc1:
            java.lang.String r4 = "setOpaque"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Lcb
            goto L1ea
        Lcb:
            r2 = 22
            goto L1ea
        Lcf:
            java.lang.String r4 = "getAndBitwiseAndAcquire"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Ld9
            goto L1ea
        Ld9:
            r2 = 21
            goto L1ea
        Ldd:
            java.lang.String r4 = "getAndSet"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Le7
            goto L1ea
        Le7:
            r2 = 20
            goto L1ea
        Leb:
            java.lang.String r4 = "getAndAdd"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto Lf5
            goto L1ea
        Lf5:
            r2 = 19
            goto L1ea
        Lf9:
            java.lang.String r4 = "getVolatile"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L103
            goto L1ea
        L103:
            r2 = 18
            goto L1ea
        L107:
            java.lang.String r4 = "setVolatile"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L111
            goto L1ea
        L111:
            r2 = 17
            goto L1ea
        L115:
            java.lang.String r4 = "getAndBitwiseOrAcquire"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L11f
            goto L1ea
        L11f:
            r2 = 16
            goto L1ea
        L123:
            java.lang.String r4 = "set"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L12d
            goto L1ea
        L12d:
            r2 = 15
            goto L1ea
        L131:
            java.lang.String r4 = "get"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L13b
            goto L1ea
        L13b:
            r2 = 14
            goto L1ea
        L13f:
            java.lang.String r4 = "getAndSetRelease"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L149
            goto L1ea
        L149:
            r2 = 13
            goto L1ea
        L14d:
            java.lang.String r4 = "getAcquire"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L157
            goto L1ea
        L157:
            r2 = 12
            goto L1ea
        L15b:
            java.lang.String r4 = "setRelease"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L165
            goto L1ea
        L165:
            r2 = 11
            goto L1ea
        L169:
            java.lang.String r4 = "weakCompareAndSetAcquire"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L173
            goto L1ea
        L173:
            r2 = 10
            goto L1ea
        L177:
            java.lang.String r4 = "weakCompareAndSetPlain"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L181
            goto L1ea
        L181:
            r2 = 9
            goto L1ea
        L185:
            java.lang.String r4 = "getAndBitwiseXorRelease"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L18f
            goto L1ea
        L18f:
            r2 = 8
            goto L1ea
        L193:
            java.lang.String r4 = "getAndBitwiseXor"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L19c
            goto L1ea
        L19c:
            r2 = 7
            goto L1ea
        L19e:
            java.lang.String r4 = "getAndBitwiseAnd"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L1a7
            goto L1ea
        L1a7:
            r2 = 6
            goto L1ea
        L1a9:
            java.lang.String r4 = "getAndAddRelease"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L1b2
            goto L1ea
        L1b2:
            r2 = 5
            goto L1ea
        L1b4:
            java.lang.String r4 = "weakCompareAndSet"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L1bd
            goto L1ea
        L1bd:
            r2 = 4
            goto L1ea
        L1bf:
            java.lang.String r4 = "compareAndExchangeRelease"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L1c8
            goto L1ea
        L1c8:
            r2 = 3
            goto L1ea
        L1ca:
            java.lang.String r4 = "compareAndSet"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L1d3
            goto L1ea
        L1d3:
            r2 = 2
            goto L1ea
        L1d5:
            java.lang.String r4 = "getAndBitwiseAndRelease"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L1de
            goto L1ea
        L1de:
            r2 = r3
            goto L1ea
        L1e0:
            java.lang.String r4 = "getAndBitwiseOrRelease"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L1e9
            goto L1ea
        L1e9:
            r2 = r0
        L1ea:
            switch(r2) {
                case 0: goto L1ee;
                case 1: goto L1ee;
                case 2: goto L1ee;
                case 3: goto L1ee;
                case 4: goto L1ee;
                case 5: goto L1ee;
                case 6: goto L1ee;
                case 7: goto L1ee;
                case 8: goto L1ee;
                case 9: goto L1ee;
                case 10: goto L1ee;
                case 11: goto L1ee;
                case 12: goto L1ee;
                case 13: goto L1ee;
                case 14: goto L1ee;
                case 15: goto L1ee;
                case 16: goto L1ee;
                case 17: goto L1ee;
                case 18: goto L1ee;
                case 19: goto L1ee;
                case 20: goto L1ee;
                case 21: goto L1ee;
                case 22: goto L1ee;
                case 23: goto L1ee;
                case 24: goto L1ee;
                case 25: goto L1ee;
                case 26: goto L1ee;
                case 27: goto L1ee;
                case 28: goto L1ee;
                case 29: goto L1ee;
                case 30: goto L1ee;
                default: goto L1ed;
            }
        L1ed:
            goto L1ef
        L1ee:
            return r3
        L1ef:
            return r0
    }
}

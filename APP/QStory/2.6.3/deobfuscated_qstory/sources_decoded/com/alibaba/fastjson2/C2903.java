package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2849;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.android.dx.io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2903 extends C2902 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final String f9228;

    public C2903(C2943 c2943, String str, byte[] bArr, int i) {
        super(i, c2943, bArr);
        this.f9228 = str;
        this.f9220 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.C2902, com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mo6104() {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2903.mo6104():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.C2902, com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final long mo6106() {
        int i;
        int i2;
        int i3;
        long j;
        long j2;
        int i4 = this.f9219;
        char c = '\"';
        byte[] bArr = this.f9224;
        int i5 = (i4 <= 0 || bArr[i4 + (-1)] != '\'') ? '\"' : '\'';
        int i6 = 0;
        long j3 = 0;
        while (true) {
            i = this.f9223;
            if (i4 < i) {
                int iM5694 = bArr[i4];
                if (iM5694 == 92) {
                    int i7 = i4 + 1;
                    int i8 = bArr[i7];
                    if (i8 == 117) {
                        int i9 = i4 + 2;
                        C2904.m6271(i9, i);
                        iM5694 = AbstractC2849.m5694(bArr, i9);
                        i4 += 5;
                    } else if (i8 != 120) {
                        iM5694 = m6161(i8);
                        i4 = i7;
                    } else {
                        int i10 = bArr[i4 + 2];
                        i4 += 3;
                        iM5694 = AbstractC2899.m6095(i10, bArr[i4]);
                    }
                } else if (iM5694 == i5) {
                }
                if (iM5694 <= 255 && iM5694 >= 0 && i6 < 8 && (i6 != 0 || iM5694 != 0)) {
                    if ((iM5694 != 95 && iM5694 != 45 && iM5694 != 32) || (i3 = bArr[i4 + 1]) == 34 || i3 == 39 || i3 == iM5694) {
                        if (iM5694 >= 65 && iM5694 <= 90) {
                            iM5694 = (char) (iM5694 + 32);
                        }
                        switch (i6) {
                            case 0:
                                j3 = (byte) iM5694;
                                break;
                            case 1:
                                j = ((byte) iM5694) << 8;
                                j2 = 255;
                                j3 = (j3 & j2) + j;
                                break;
                            case 2:
                                j = ((byte) iM5694) << 16;
                                j2 = 65535;
                                j3 = (j3 & j2) + j;
                                break;
                            case 3:
                                j = ((byte) iM5694) << 24;
                                j2 = 16777215;
                                j3 = (j3 & j2) + j;
                                break;
                            case 4:
                                j = ((long) ((byte) iM5694)) << 32;
                                j2 = 4294967295L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 5:
                                j = ((long) ((byte) iM5694)) << 40;
                                j2 = 1099511627775L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 6:
                                j = ((long) ((byte) iM5694)) << 48;
                                j2 = 281474976710655L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 7:
                                j = ((long) ((byte) iM5694)) << 56;
                                j2 = 72057594037927935L;
                                j3 = (j3 & j2) + j;
                                break;
                        }
                        i6++;
                    }
                    i4++;
                }
            }
        }
        i4 = this.f9219;
        j3 = 0;
        if (j3 != 0) {
            return j3;
        }
        long j4 = -3750763034362895579L;
        while (i4 < i) {
            int iM56942 = bArr[i4];
            if (iM56942 == 92) {
                int i11 = i4 + 1;
                int i12 = bArr[i11];
                if (i12 == 117) {
                    int i13 = i4 + 2;
                    C2904.m6271(i13, i);
                    iM56942 = AbstractC2849.m5694(bArr, i13);
                    i4 += 5;
                } else if (i12 != 120) {
                    iM56942 = m6161(i12);
                    i4 = i11;
                } else {
                    int i14 = bArr[i4 + 2];
                    i4 += 3;
                    iM56942 = AbstractC2899.m6095(i14, bArr[i4]);
                }
            } else if (iM56942 == i5) {
                return j4;
            }
            i4++;
            if ((iM56942 == 95 || iM56942 == 45 || iM56942 == 32) && (i2 = bArr[i4]) != c) {
                if (i2 == 39 || i2 == iM56942) {
                }
                c = '\"';
            }
            if (iM56942 >= 65 && iM56942 <= 90) {
                iM56942 = (char) (iM56942 + 32);
            }
            if (iM56942 < 0) {
                iM56942 = (iM56942 == true ? 1 : 0) & Opcodes.CONST_METHOD_TYPE;
            }
            j4 = 1099511628211L * (j4 ^ ((long) iM56942));
            bArr = bArr;
            c = '\"';
        }
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x053d  */
    @Override // com.alibaba.fastjson2.C2902, com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mo6126() {
        /*
            Method dump skipped, instruction units count: 1618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2903.mo6126():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x010a, code lost:
    
        r27.f9221 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010c, code lost:
    
        if (r6 != 26) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010e, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0110, code lost:
    
        r3 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0112, code lost:
    
        r27.f9218 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0116, code lost:
    
        if (r6 > 32) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011e, code lost:
    
        if (((1 << r6) & 4294981376L) == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0120, code lost:
    
        if (r2 != r12) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0122, code lost:
    
        r3 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0124, code lost:
    
        r3 = (char) r1[r2];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012f, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0136  */
    @Override // com.alibaba.fastjson2.C2902, com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo6128() {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2903.mo6128():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x026d A[PHI: r6 r10
  0x026d: PHI (r6v4 int) = (r6v3 int), (r6v28 int), (r6v29 int), (r6v30 int) binds: [B:137:0x025e, B:233:0x026d, B:145:0x0270, B:143:0x026b] A[DONT_GENERATE, DONT_INLINE]
  0x026d: PHI (r10v3 long) = (r10v2 long), (r10v9 long), (r10v9 long), (r10v9 long) binds: [B:137:0x025e, B:233:0x026d, B:145:0x0270, B:143:0x026b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03ed  */
    @Override // com.alibaba.fastjson2.C2902, com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo6129() {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2903.mo6129():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0013, code lost:
    
        if (r4 != r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // com.alibaba.fastjson2.C2902, com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo6148() {
        /*
            r10 = this;
            char r0 = r10.f9193
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L8
            r10 = 0
            return r10
        L8:
            int r0 = r10.f9194
            r1 = 26
            int r2 = r10.f9223
            byte[] r3 = r10.f9224
            if (r0 != r2) goto L15
            r4 = r0
        L13:
            r0 = r1
            goto L19
        L15:
            int r4 = r0 + 1
            r0 = r3[r0]
        L19:
            if (r0 == 0) goto L3f
            r5 = 32
            if (r0 > r5) goto L2f
            r5 = 1
            long r5 = r5 << r0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L2f
            goto L3f
        L2f:
            r1 = r0 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r10.f9193 = r1
            r10.f9194 = r4
            r1 = 47
            if (r0 != r1) goto L3d
            r10.mo6235()
        L3d:
            r10 = 1
            return r10
        L3f:
            if (r4 != r2) goto L42
            goto L13
        L42:
            int r0 = r4 + 1
            r4 = r3[r4]
            r9 = r4
            r4 = r0
            r0 = r9
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2903.mo6148():boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x006c -> B:33:0x0050). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:36:0x0061
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.C2902, com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final boolean mo6151() {
        /*
            r18 = this;
            r0 = r18
            char r1 = r0.f9193
            int r2 = r0.f9194
            r3 = 110(0x6e, float:1.54E-43)
            r4 = 0
            r5 = 1
            int r6 = r0.f9223
            byte[] r7 = r0.f9224
            if (r1 != r3) goto L29
            int r3 = r2 + 2
            if (r3 >= r6) goto L29
            r8 = r7[r2]
            r9 = 117(0x75, float:1.64E-43)
            if (r8 != r9) goto L29
            int r8 = r2 + 1
            r8 = r7[r8]
            r9 = 108(0x6c, float:1.51E-43)
            if (r8 != r9) goto L29
            r3 = r7[r3]
            if (r3 != r9) goto L29
            int r2 = r2 + 3
            goto L4b
        L29:
            r3 = 34
            if (r1 == r3) goto L33
            r3 = 39
            if (r1 != r3) goto L32
            goto L33
        L32:
            return r4
        L33:
            if (r2 >= r6) goto L3b
            r3 = r7[r2]
            if (r3 != r1) goto L3b
            int r2 = r2 + r5
            goto L4b
        L3b:
            int r3 = r2 + 4
            if (r3 >= r6) goto Laa
            boolean r8 = com.alibaba.fastjson2.util.AbstractC2849.m5692(r7, r2)
            if (r8 == 0) goto Laa
            r3 = r7[r3]
            if (r3 != r1) goto Laa
            int r2 = r2 + 5
        L4b:
            r1 = 26
            if (r2 != r6) goto L52
            r3 = r2
        L50:
            r2 = r1
            goto L56
        L52:
            int r3 = r2 + 1
            r2 = r7[r2]
        L56:
            r8 = 0
            r10 = 4294981376(0x100003700, double:2.1220027474E-314)
            r12 = 1
            r14 = 32
            if (r2 < 0) goto L79
            if (r2 > r14) goto L79
            long r15 = r12 << r2
            long r15 = r15 & r10
            int r15 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r15 == 0) goto L79
            if (r3 != r6) goto L6f
            goto L50
        L6f:
            int r2 = r3 + 1
            r3 = r7[r3]
            r17 = r3
            r3 = r2
            r2 = r17
            goto L56
        L79:
            r15 = 44
            if (r2 != r15) goto L7e
            r4 = r5
        L7e:
            r0.f9197 = r4
            if (r4 == 0) goto L8f
            if (r3 != r6) goto L86
        L84:
            r2 = r1
            goto L8f
        L86:
            int r2 = r3 + 1
            r3 = r7[r3]
        L8a:
            r17 = r3
            r3 = r2
            r2 = r17
        L8f:
            if (r2 < 0) goto La2
            if (r2 > r14) goto La2
            long r15 = r12 << r2
            long r15 = r15 & r10
            int r4 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r4 == 0) goto La2
            if (r3 != r6) goto L9d
            goto L84
        L9d:
            int r2 = r3 + 1
            r3 = r7[r3]
            goto L8a
        La2:
            r0.f9194 = r3
            r1 = r2 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r0.f9193 = r1
            return r5
        Laa:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2903.mo6151():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x000b, code lost:
    
        if (r4 != r3) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    @Override // com.alibaba.fastjson2.C2902, com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6173() {
        /*
            r10 = this;
            int r0 = r10.f9194
            r1 = 26
            byte[] r2 = r10.f9224
            int r3 = r10.f9223
            if (r0 < r3) goto Ld
            r4 = r0
        Lb:
            r0 = r1
            goto L11
        Ld:
            int r4 = r0 + 1
            r0 = r2[r0]
        L11:
            if (r0 == 0) goto L38
            if (r0 <= 0) goto L29
            r5 = 32
            if (r0 > r5) goto L29
            r5 = 1
            long r5 = r5 << r0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L29
            goto L38
        L29:
            r10.f9194 = r4
            r1 = r0 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r10.f9193 = r1
            r1 = 47
            if (r0 != r1) goto L37
            r10.mo6235()
        L37:
            return
        L38:
            if (r4 != r3) goto L3b
            goto Lb
        L3b:
            int r0 = r4 + 1
            r4 = r2[r4]
            r9 = r4
            r4 = r0
            r0 = r9
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2903.mo6173():void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x01ad -> B:114:0x019c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0107 -> B:68:0x00f6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:116:0x01a3
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.C2902, com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪世兰哲子苏 */
    public final java.lang.String mo6184() {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2903.mo6184():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.C2902
    /* JADX INFO: renamed from: 飘花落叶言楪哲子世苏兰 */
    public final void mo6263() {
        byte[] bArr;
        String str;
        byte b = this.f9193;
        int i = this.f9194;
        this.f9195 = false;
        int i2 = i;
        int i3 = 0;
        while (true) {
            bArr = this.f9224;
            byte b2 = bArr[i2];
            if (b2 == 92) {
                this.f9195 = true;
                byte b3 = bArr[i2 + 1];
                i2 += b3 == 117 ? 6 : b3 == 120 ? 4 : 2;
            } else if (b2 == b) {
                break;
            } else {
                i2++;
            }
            i3++;
        }
        if (this.f9195) {
            char[] cArr = new char[i3];
            int i4 = 0;
            while (true) {
                char cM5694 = (char) (bArr[i] & DefaultClassResolver.NAME);
                if (cM5694 == '\\') {
                    int i5 = i + 1;
                    char c = (char) bArr[i5];
                    if (c == '\"' || c == '\\') {
                        i = i5;
                        cM5694 = c;
                    } else if (c == 'u') {
                        int i6 = i + 2;
                        C2904.m6271(i6, this.f9223);
                        cM5694 = (char) AbstractC2849.m5694(bArr, i6);
                        i += 5;
                    } else if (c != 'x') {
                        cM5694 = m6161(c);
                        i = i5;
                    } else {
                        byte b4 = bArr[i + 2];
                        i += 3;
                        cM5694 = AbstractC2899.m6095(b4, bArr[i]);
                    }
                } else if (cM5694 == '\"') {
                    break;
                }
                cArr[i4] = cM5694;
                i++;
                i4++;
            }
            str = new String(cArr);
            i2 = i;
        } else {
            BiFunction biFunction = AbstractC2854.f8922;
            str = biFunction != null ? (String) biFunction.apply(Arrays.copyOfRange(bArr, i, i2), (byte) 0) : new String(bArr, i, i2 - i, StandardCharsets.ISO_8859_1);
        }
        int i7 = i2 + 1;
        byte b5 = bArr[i7];
        while (b5 > 0 && b5 <= 32 && ((1 << b5) & 4294981376L) != 0) {
            i7++;
            b5 = bArr[i7];
        }
        this.f9194 = i7 + 1;
        boolean z = b5 == 44;
        this.f9197 = z;
        if (z) {
            mo6173();
        } else {
            this.f9193 = (char) b5;
        }
        this.f9188 = str;
    }

    @Override // com.alibaba.fastjson2.C2902, com.alibaba.fastjson2.AbstractC2899
    /* JADX INFO: renamed from: 飘花落叶言楪苏子哲兰世 */
    public final long mo6244() {
        int i;
        byte[] bArr;
        byte b;
        int i2;
        byte b2;
        int i3;
        byte b3;
        byte b4;
        int i4;
        int iM5694;
        int i5;
        int iM6161;
        long j;
        long j2;
        char c = this.f9193;
        if (c != '\"' && c != '\'') {
            return -1L;
        }
        boolean z = true;
        z = true;
        this.f9220 = true;
        this.f9198 = false;
        int i6 = this.f9194;
        this.f9219 = i6;
        int i7 = 0;
        long j3 = 0;
        while (true) {
            i = this.f9223;
            bArr = this.f9224;
            if (i6 < i) {
                byte b5 = bArr[i6];
                b = 32;
                int iM56942 = b5 & DefaultClassResolver.NAME;
                if (iM56942 != c) {
                    if (iM56942 == 92) {
                        this.f9198 = true;
                        int i8 = i6 + 1;
                        byte b6 = bArr[i8];
                        if (b6 == 117) {
                            int i9 = i6 + 2;
                            C2904.m6271(i9, i);
                            iM56942 = AbstractC2849.m5694(bArr, i9);
                            i6 += 5;
                        } else if (b6 != 120) {
                            iM56942 = m6161(b6);
                            i6 = i8;
                        } else {
                            byte b7 = bArr[i6 + 2];
                            i6 += 3;
                            iM56942 = AbstractC2899.m6095(b7, bArr[i6]);
                        }
                    } else if (iM56942 == -61 || iM56942 == -62) {
                        i6++;
                        iM56942 = (char) (((b5 & 31) << 6) | (bArr[i6] & 63));
                    }
                    if (iM56942 <= 255 && iM56942 >= 0 && i7 < 8 && (i7 != 0 || iM56942 != 0)) {
                        switch (i7) {
                            case 0:
                                j3 = (byte) iM56942;
                                continue;
                                i6++;
                                i7++;
                                break;
                            case 1:
                                j = ((byte) iM56942) << 8;
                                j2 = 255;
                                break;
                            case 2:
                                j = ((byte) iM56942) << 16;
                                j2 = 65535;
                                break;
                            case 3:
                                j = ((byte) iM56942) << 24;
                                j2 = 16777215;
                                break;
                            case 4:
                                j = ((long) ((byte) iM56942)) << 32;
                                j2 = 4294967295L;
                                break;
                            case 5:
                                j = ((long) ((byte) iM56942)) << 40;
                                j2 = 1099511627775L;
                                break;
                            case 6:
                                j = ((long) ((byte) iM56942)) << 48;
                                j2 = 281474976710655L;
                                break;
                            case 7:
                                j = ((long) ((byte) iM56942)) << 56;
                                j2 = 72057594037927935L;
                                break;
                            default:
                                i6++;
                                i7++;
                                break;
                        }
                        j3 = (j3 & j2) + j;
                        i6++;
                        i7++;
                    }
                } else if (i7 == 0) {
                    i6 = this.f9219;
                } else {
                    this.f9221 = i7;
                    this.f9218 = i6;
                    i6++;
                }
            } else {
                b = 32;
            }
        }
        i6 = this.f9219;
        j3 = 0;
        if (j3 == 0) {
            j3 = -3750763034362895579L;
            int i10 = 0;
            while (true) {
                byte b8 = bArr[i6];
                if (b8 == 92) {
                    this.f9198 = z;
                    int i11 = i6 + 1;
                    byte b9 = bArr[i11];
                    if (b9 == 117) {
                        int i12 = i6 + 2;
                        C2904.m6271(i12, i);
                        iM5694 = AbstractC2849.m5694(bArr, i12);
                        i5 = i6 + 5;
                    } else if (b9 != 120) {
                        iM6161 = m6161(b9);
                        long j4 = (((long) iM6161) ^ j3) * 1099511628211L;
                        i6 = i11 + (z ? 1 : 0);
                        j3 = j4;
                        b4 = b;
                        i4 = i;
                    } else {
                        byte b10 = bArr[i6 + 2];
                        i5 = i6 + 3;
                        iM5694 = AbstractC2899.m6095(b10, bArr[i5]);
                    }
                    int i13 = i5;
                    iM6161 = iM5694;
                    i11 = i13;
                    long j42 = (((long) iM6161) ^ j3) * 1099511628211L;
                    i6 = i11 + (z ? 1 : 0);
                    j3 = j42;
                    b4 = b;
                    i4 = i;
                } else if (b8 == 34) {
                    this.f9221 = i10;
                    this.f9218 = i6;
                    i6 += z ? 1 : 0;
                } else {
                    b4 = b;
                    i6++;
                    i4 = i;
                    j3 = (j3 ^ ((long) b8)) * 1099511628211L;
                }
                i10++;
                i = i4;
                z = true;
                b = b4;
            }
        }
        if (i6 == i) {
            i2 = i6;
            b2 = 26;
        } else {
            i2 = i6 + 1;
            b2 = bArr[i6];
        }
        while (b2 <= b && ((1 << b2) & 4294981376L) != 0) {
            if (i2 == i) {
                b2 = 26;
            } else {
                b2 = bArr[i2];
                i2++;
            }
            b = 32;
        }
        if (b2 != 44) {
            z = false;
        }
        this.f9197 = z;
        if (z) {
            if (i2 == i) {
                i3 = i2;
                b3 = 26;
            } else {
                i3 = i2 + 1;
                b3 = bArr[i2];
            }
            b2 = b3;
            i2 = i3;
            while (b2 <= 32 && ((1 << b2) & 4294981376L) != 0) {
                if (i2 == i) {
                    b2 = 26;
                } else {
                    b2 = bArr[i2];
                    i2++;
                }
            }
        }
        this.f9194 = i2;
        this.f9193 = (char) (b2 & DefaultClassResolver.NAME);
        return j3;
    }
}

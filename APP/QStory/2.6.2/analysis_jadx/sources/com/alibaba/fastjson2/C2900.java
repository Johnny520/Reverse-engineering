package com.alibaba.fastjson2;

import androidx.collection.C0276;
import com.alibaba.fastjson2.util.AbstractC2848;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.alibaba.fastjson2.util.AbstractC2866;
import com.android.dx.io.Opcodes;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.UUID;
import p007.AbstractC6136;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2900 extends AbstractC2898 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final int f9204;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public int f9205;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public int f9206;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public int f9207;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public int f9208;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final int f9209;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final int f9210;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final char[] f9211;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final String f9212;

    static {
        Unsafe unsafe = AbstractC2853.f8919;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r11 = r9.f9191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r11 > ' ') goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (((1 << r11) & 4294981376L) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = r9.f9192 + 1;
        r9.f9192 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r11 < r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        r9.f9191 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        r9.f9191 = r9.f9211[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        r9.f9192++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        if (r11 == 65534) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r11 != 65279) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        mo6127();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r9.f9191 != '/') goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        mo6190();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2900(int r10, com.alibaba.fastjson2.C2942 r11, byte[] r12) {
        /*
            r9 = this;
            r0 = 0
            r9.<init>(r11, r0)
            r11 = -1
            r9.f9204 = r11
            r11 = 0
            r9.f9212 = r11
            int r11 = r10 / 2
            char[] r11 = new char[r11]
            r9.f9211 = r11
            r11 = r0
        L11:
            if (r0 >= r10) goto L2a
            r1 = r12[r0]
            int r2 = r0 + 1
            r2 = r12[r2]
            char[] r3 = r9.f9211
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r2
            char r1 = (char) r1
            r3[r11] = r1
            int r0 = r0 + 2
            int r11 = r11 + 1
            goto L11
        L2a:
            r9.f9209 = r11
            r9.f9210 = r11
            int r12 = r9.f9192
            r0 = 26
            if (r12 < r11) goto L37
            r9.f9191 = r0
            return
        L37:
            char[] r11 = r9.f9211
            char r11 = r11[r12]
            r9.f9191 = r11
        L3d:
            char r11 = r9.f9191
            r1 = 0
            r3 = 4294981376(0x100003700, double:2.1220027474E-314)
            r5 = 1
            r12 = 32
            if (r11 > r12) goto L65
            long r7 = r5 << r11
            long r7 = r7 & r3
            int r11 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r11 == 0) goto L65
            int r11 = r9.f9192
            int r11 = r11 + 1
            r9.f9192 = r11
            if (r11 < r10) goto L5e
            r9.f9191 = r0
            return
        L5e:
            char[] r12 = r9.f9211
            char r11 = r12[r11]
            r9.f9191 = r11
            goto L3d
        L65:
            char r11 = r9.f9191
            if (r11 > r12) goto L82
            long r7 = r5 << r11
            long r7 = r7 & r3
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 == 0) goto L82
            int r11 = r9.f9192
            int r11 = r11 + 1
            r9.f9192 = r11
            if (r11 < r10) goto L7b
            r9.f9191 = r0
            return
        L7b:
            char[] r7 = r9.f9211
            char r11 = r7[r11]
            r9.f9191 = r11
            goto L65
        L82:
            int r10 = r9.f9192
            int r10 = r10 + 1
            r9.f9192 = r10
            r10 = 65534(0xfffe, float:9.1833E-41)
            if (r11 == r10) goto L92
            r10 = 65279(0xfeff, float:9.1475E-41)
            if (r11 != r10) goto L95
        L92:
            r9.mo6127()
        L95:
            char r10 = r9.f9191
            r11 = 47
            if (r10 != r11) goto L9e
            r9.mo6190()
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.<init>(int, com.alibaba.fastjson2.飘花落叶言子苏兰哲世楪, byte[]):void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0045 -> B:20:0x002b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0066 -> B:33:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:23:0x003c
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: 飘花落叶言楪苏兰子世哲, reason: contains not printable characters */
    public static int m6200(com.alibaba.fastjson2.C2900 r12, char[] r13, int r14, int r15) {
        /*
            char r0 = r12.f9191
            boolean r1 = r12.m6116(r0)
            if (r1 == 0) goto Lb
            int r12 = r12.f9192
            return r12
        Lb:
            int r1 = r14 + 1
            char r2 = r13[r14]
            r3 = 92
            if (r2 != r3) goto L24
            char r14 = r13[r1]
            r2 = 117(0x75, float:1.64E-43)
            if (r14 != r2) goto L1b
            r14 = 5
            goto L22
        L1b:
            r2 = 120(0x78, float:1.68E-43)
            if (r14 != r2) goto L21
            r14 = 3
            goto L22
        L21:
            r14 = 1
        L22:
            int r14 = r14 + r1
            goto Lb
        L24:
            if (r2 != r0) goto L8e
            r0 = 26
            if (r1 != r15) goto L2d
            r14 = r1
        L2b:
            r1 = r0
            goto L31
        L2d:
            int r14 = r14 + 2
            char r1 = r13[r1]
        L31:
            r2 = 0
            r4 = 4294981376(0x100003700, double:2.1220027474E-314)
            r6 = 1
            r8 = 32
            if (r1 > r8) goto L50
            long r9 = r6 << r1
            long r9 = r9 & r4
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 == 0) goto L50
            if (r14 != r15) goto L48
            goto L2b
        L48:
            int r1 = r14 + 1
            char r14 = r13[r14]
            r11 = r1
            r1 = r14
            r14 = r11
            goto L31
        L50:
            r9 = 58
            if (r1 != r9) goto L74
            if (r14 != r15) goto L59
            r1 = r14
        L57:
            r14 = r0
            goto L5d
        L59:
            int r1 = r14 + 1
            char r14 = r13[r14]
        L5d:
            if (r14 > r8) goto L71
            long r9 = r6 << r14
            long r9 = r9 & r4
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 == 0) goto L71
            if (r1 != r15) goto L69
            goto L57
        L69:
            int r14 = r1 + 1
            char r1 = r13[r1]
            r11 = r1
            r1 = r14
            r14 = r11
            goto L5d
        L71:
            r12.f9191 = r14
            return r1
        L74:
            com.alibaba.fastjson2.JSONException r12 = new com.alibaba.fastjson2.JSONException
            char r13 = (char) r1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "syntax error, expect ',', but '"
            r14.<init>(r15)
            r14.append(r13)
            java.lang.String r13 = "'"
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r12.<init>(r13)
            throw r12
        L8e:
            r14 = r1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.m6200(com.alibaba.fastjson2.飘花落叶言子哲楪兰世苏, char[], int, int):int");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0152 -> B:113:0x013a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x01be -> B:152:0x01a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x01e4 -> B:165:0x01cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:213:0x025f -> B:206:0x0247). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x0285 -> B:219:0x026d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:262:0x02eb -> B:255:0x02d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:275:0x0311 -> B:268:0x02f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:311:0x0375 -> B:304:0x035d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:324:0x039b -> B:317:0x0383). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:365:0x0402 -> B:358:0x03ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:397:0x0466 -> B:390:0x0452). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x00be -> B:61:0x00ae). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:394:0x045c
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
    /* JADX INFO: renamed from: 飘花落叶言楪苏兰子哲世, reason: contains not printable characters */
    public static int m6201(com.alibaba.fastjson2.C2900 r27, char[] r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 1231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.m6201(com.alibaba.fastjson2.飘花落叶言子哲楪兰世苏, char[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0005, code lost:
    
        if (r1 != r10) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    /* JADX INFO: renamed from: 飘花落叶言楪苏哲世兰子, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m6202(com.alibaba.fastjson2.C2900 r7, char[] r8, int r9, int r10) {
        /*
            r0 = 26
            if (r9 != r10) goto L7
            r1 = r9
        L5:
            r9 = r0
            goto Lb
        L7:
            int r1 = r9 + 1
            char r9 = r8[r9]
        Lb:
            if (r9 == 0) goto L31
            r2 = 32
            if (r9 > r2) goto L21
            r2 = 1
            long r2 = r2 << r9
            r4 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            goto L31
        L21:
            char r8 = (char) r9
            r7.f9191 = r8
            r8 = 47
            if (r9 != r8) goto L30
            r7.f9192 = r1
            r7.mo6190()
            int r7 = r7.f9192
            return r7
        L30:
            return r1
        L31:
            if (r1 != r10) goto L34
            goto L5
        L34:
            int r9 = r1 + 1
            char r1 = r8[r1]
            r6 = r1
            r1 = r9
            r9 = r6
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.m6202(com.alibaba.fastjson2.飘花落叶言子哲楪兰世苏, char[], int, int):int");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0031 -> B:8:0x0017). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:11:0x0028
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
    /* JADX INFO: renamed from: 飘花落叶言楪苏哲兰世子, reason: contains not printable characters */
    public static int m6203(com.alibaba.fastjson2.C2900 r18, char[] r19, int r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            int r3 = m6202(r18, r19, r20, r21)
            r4 = 0
            r5 = r4
        Lc:
            char r6 = r0.f9191
            r7 = 93
            if (r6 != r7) goto L83
            r5 = 26
            if (r3 != r2) goto L19
            r6 = r3
        L17:
            r3 = r5
            goto L1d
        L19:
            int r6 = r3 + 1
            char r3 = r1[r3]
        L1d:
            r8 = 0
            r10 = 4294981376(0x100003700, double:2.1220027474E-314)
            r12 = 1
            r14 = 32
            if (r3 > r14) goto L3e
            long r15 = r12 << r3
            long r15 = r15 & r10
            int r15 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r15 == 0) goto L3e
            if (r6 != r2) goto L34
            goto L17
        L34:
            int r3 = r6 + 1
            char r6 = r1[r6]
            r17 = r6
            r6 = r3
            r3 = r17
            goto L1d
        L3e:
            r15 = 44
            if (r3 != r15) goto L60
            if (r6 != r2) goto L46
            r4 = r5
            goto L4b
        L46:
            int r3 = r6 + 1
            char r4 = r1[r6]
            goto L5d
        L4b:
            r3 = r4
        L4c:
            if (r3 > r14) goto L5f
            long r15 = r12 << r3
            long r15 = r15 & r10
            int r4 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r4 == 0) goto L5f
            if (r6 != r2) goto L59
            r3 = r5
            goto L4c
        L59:
            int r3 = r6 + 1
            char r4 = r1[r6]
        L5d:
            r6 = r3
            goto L4b
        L5f:
            r4 = 1
        L60:
            r1 = 0
            r2 = 125(0x7d, float:1.75E-43)
            if (r4 != 0) goto L70
            if (r3 == r2) goto L70
            if (r3 == r7) goto L70
            if (r3 != r5) goto L6c
            goto L70
        L6c:
            com.alibaba.fastjson2.AbstractC2898.m6049(r6, r3)
            throw r1
        L70:
            if (r4 == 0) goto L7d
            if (r3 == r2) goto L79
            if (r3 == r7) goto L79
            if (r3 == r5) goto L79
            goto L7d
        L79:
            com.alibaba.fastjson2.AbstractC2898.m6049(r6, r3)
            throw r1
        L7d:
            r0.f9195 = r4
            char r1 = (char) r3
            r0.f9191 = r1
            return r6
        L83:
            if (r5 == 0) goto L94
            boolean r6 = r0.f9195
            if (r6 == 0) goto L8a
            goto L94
        L8a:
            java.lang.String r1 = "illegal value"
            java.lang.String r0 = r0.mo6124(r1)
            androidx.collection.C0276.m849(r0)
            return r4
        L94:
            int r3 = m6201(r0, r1, r3, r2)
            int r5 = r5 + 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.m6203(com.alibaba.fastjson2.飘花落叶言子哲楪兰世苏, char[], int, int):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲兰子世, reason: contains not printable characters */
    public static long m6204(int i, char[] cArr) {
        byte[] bArr = AbstractC2932.f9278;
        char c = cArr[i];
        char c2 = cArr[i + 1];
        char c3 = cArr[i + 2];
        if ((c | c2 | c3 | cArr[i + 3]) > 255) {
            return -1L;
        }
        return bArr[r5] | (bArr[c] << 12) | (bArr[c2] << 8) | (bArr[c3] << 4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f9204;
        if (i != -1) {
            char[] cArr = this.f9211;
            if (cArr.length < 8388608) {
                AbstractC2932.f9289.lazySet(AbstractC2932.f9297[i], cArr);
            }
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final String mo6055() {
        String str = this.f9186;
        if (str != null) {
            return str;
        }
        int i = this.f9205;
        int i2 = this.f9206;
        int i3 = i - i2;
        boolean z = this.f9196;
        char[] cArr = this.f9211;
        if (!z) {
            return new String(cArr, i2, i3);
        }
        char[] cArr2 = new char[this.f9208];
        int i4 = 0;
        while (true) {
            char cM5650 = cArr[i2];
            if (cM5650 == '\\') {
                int i5 = i2 + 1;
                char c = cArr[i5];
                if (c == '\"' || c == '\\') {
                    i2 = i5;
                    cM5650 = c;
                } else if (c == 'u') {
                    int i6 = i2 + 2;
                    C2903.m6226(i6, this.f9210);
                    cM5650 = (char) AbstractC2848.m5650(i6, cArr);
                    i2 += 5;
                } else if (c != 'x') {
                    cM5650 = m6115(c);
                    i2 = i5;
                } else {
                    char c2 = cArr[i2 + 2];
                    i2 += 3;
                    cM5650 = AbstractC2898.m6050(c2, cArr[i2]);
                }
            } else if (cM5650 == '\"') {
                String str2 = new String(cArr2);
                this.f9186 = str2;
                return str2;
            }
            cArr2[i4] = cM5650;
            i2++;
            i4++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
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
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final java.lang.String mo6058() {
        /*
            r9 = this;
            boolean r0 = r9.f9196
            char[] r1 = r9.f9211
            if (r0 != 0) goto L1c
            int r0 = r9.f9206
            java.lang.String r2 = r9.f9212
            if (r2 == 0) goto L13
            int r9 = r9.f9205
            java.lang.String r9 = r2.substring(r0, r9)
            return r9
        L13:
            java.lang.String r2 = new java.lang.String
            int r9 = r9.f9205
            int r9 = r9 - r0
            r2.<init>(r1, r0, r9)
            return r2
        L1c:
            int r0 = r9.f9208
            char[] r0 = new char[r0]
            int r2 = r9.f9206
            r3 = 0
        L23:
            int r4 = r9.f9205
            if (r2 >= r4) goto L7e
            char r4 = r1[r2]
            r5 = 34
            r6 = 92
            if (r4 != r6) goto L74
            int r4 = r2 + 1
            char r7 = r1[r4]
            if (r7 == r5) goto L71
            r5 = 58
            if (r7 == r5) goto L71
            r5 = 64
            if (r7 == r5) goto L71
            if (r7 == r6) goto L71
            r5 = 117(0x75, float:1.64E-43)
            if (r7 == r5) goto L62
            r5 = 120(0x78, float:1.68E-43)
            if (r7 == r5) goto L55
            switch(r7) {
                case 42: goto L71;
                case 43: goto L71;
                case 44: goto L71;
                case 45: goto L71;
                case 46: goto L71;
                case 47: goto L71;
                default: goto L4a;
            }
        L4a:
            switch(r7) {
                case 60: goto L71;
                case 61: goto L71;
                case 62: goto L71;
                default: goto L4d;
            }
        L4d:
            char r2 = r9.m6115(r7)
            r8 = r4
            r4 = r2
            r2 = r8
            goto L77
        L55:
            int r4 = r2 + 2
            char r4 = r1[r4]
            int r2 = r2 + 3
            char r5 = r1[r2]
            char r4 = com.alibaba.fastjson2.AbstractC2898.m6050(r4, r5)
            goto L77
        L62:
            int r4 = r2 + 2
            int r5 = r9.f9210
            com.alibaba.fastjson2.C2903.m6226(r4, r5)
            int r4 = com.alibaba.fastjson2.util.AbstractC2848.m5650(r4, r1)
            char r4 = (char) r4
            int r2 = r2 + 5
            goto L77
        L71:
            r2 = r4
            r4 = r7
            goto L77
        L74:
            if (r4 != r5) goto L77
            goto L7e
        L77:
            r0[r3] = r4
            int r2 = r2 + 1
            int r3 = r3 + 1
            goto L23
        L7e:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6058():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo6060() {
        int i;
        char c;
        char c2;
        long j;
        long j2;
        int i2 = this.f9206;
        char c3 = '\"';
        char[] cArr = this.f9211;
        char c4 = (i2 <= 0 || cArr[i2 + (-1)] != '\'') ? '\"' : '\'';
        int i3 = 0;
        long j3 = 0;
        while (true) {
            i = this.f9210;
            if (i2 < i) {
                char cM5650 = cArr[i2];
                if (cM5650 == '\\') {
                    int i4 = i2 + 1;
                    char c5 = cArr[i4];
                    if (c5 == 'u') {
                        int i5 = i2 + 2;
                        C2903.m6226(i5, i);
                        cM5650 = (char) AbstractC2848.m5650(i5, cArr);
                        i2 += 5;
                    } else if (c5 != 'x') {
                        cM5650 = m6115(c5);
                        i2 = i4;
                    } else {
                        char c6 = cArr[i2 + 2];
                        i2 += 3;
                        cM5650 = AbstractC2898.m6050(c6, cArr[i2]);
                    }
                } else if (cM5650 == c4) {
                }
                if (cM5650 <= 255 && i3 < 8 && (i3 != 0 || cM5650 != 0)) {
                    if ((cM5650 != '_' && cM5650 != '-' && cM5650 != ' ') || (c2 = cArr[i2 + 1]) == '\"' || c2 == '\'' || c2 == cM5650) {
                        if (cM5650 >= 'A' && cM5650 <= 'Z') {
                            cM5650 = (char) (cM5650 + ' ');
                        }
                        switch (i3) {
                            case 0:
                                j3 = (byte) cM5650;
                                break;
                            case 1:
                                j = ((byte) cM5650) << 8;
                                j2 = 255;
                                j3 = (j3 & j2) + j;
                                break;
                            case 2:
                                j = ((byte) cM5650) << 16;
                                j2 = 65535;
                                j3 = (j3 & j2) + j;
                                break;
                            case 3:
                                j = ((byte) cM5650) << 24;
                                j2 = 16777215;
                                j3 = (j3 & j2) + j;
                                break;
                            case 4:
                                j = ((long) ((byte) cM5650)) << 32;
                                j2 = 4294967295L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 5:
                                j = ((long) ((byte) cM5650)) << 40;
                                j2 = 1099511627775L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 6:
                                j = ((long) ((byte) cM5650)) << 48;
                                j2 = 281474976710655L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 7:
                                j = ((long) ((byte) cM5650)) << 56;
                                j2 = 72057594037927935L;
                                j3 = (j3 & j2) + j;
                                break;
                        }
                        i3++;
                    }
                    i2++;
                }
            }
        }
        i2 = this.f9206;
        j3 = 0;
        if (j3 != 0) {
            return j3;
        }
        long j4 = -3750763034362895579L;
        while (i2 < i) {
            char cM56502 = cArr[i2];
            if (cM56502 == '\\') {
                int i6 = i2 + 1;
                char c7 = cArr[i6];
                if (c7 == 'u') {
                    int i7 = i2 + 2;
                    C2903.m6226(i7, i);
                    cM56502 = (char) AbstractC2848.m5650(i7, cArr);
                    i2 += 5;
                } else if (c7 != 'x') {
                    cM56502 = m6115(c7);
                    i2 = i6;
                } else {
                    char c8 = cArr[i2 + 2];
                    i2 += 3;
                    cM56502 = AbstractC2898.m6050(c8, cArr[i2]);
                }
            } else if (cM56502 == c4) {
                return j4;
            }
            i2++;
            if ((cM56502 == '_' || cM56502 == '-' || cM56502 == ' ') && (c = cArr[i2]) != c3) {
                if (c == '\'' || c == cM56502) {
                }
                c3 = '\"';
            }
            if (cM56502 >= 'A' && cM56502 <= 'Z') {
                cM56502 = (char) (cM56502 + ' ');
            }
            j4 = 1099511628211L * (j4 ^ ((long) cM56502));
            cArr = cArr;
            c3 = '\"';
        }
        return j4;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x00fa -> B:77:0x00e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0128 -> B:93:0x0117). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:80:0x00f0
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
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏 */
    public final boolean mo6062() {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6062():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:197:0x02a8, B:243:?], limit reached: 246 */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[LOOP:0: B:25:0x0059->B:39:0x008f, LOOP_END] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.String, java.math.BigDecimal] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, com.alibaba.fastjson2.飘花落叶言子哲楪兰世苏] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.math.BigDecimal] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.math.BigDecimal] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:206:0x02cc -> B:198:0x02aa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:203:0x02c1
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.math.BigDecimal mo6065() {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6065():java.math.BigDecimal");
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0208, code lost:
    
        r14 = -r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0202  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float mo6068() {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6068():float");
    }

    /* JADX WARN: Path cross not found for [B:20:0x003a, B:21:0x003c], limit reached: 96 */
    /* JADX WARN: Path cross not found for [B:21:0x003c, B:20:0x003a], limit reached: 96 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[ADDED_TO_REGION] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] mo6069() {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6069():byte[]");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世 */
    public final boolean mo6073() {
        int i;
        char c;
        int i2 = this.f9192;
        if (this.f9191 == 'n') {
            char[] cArr = this.f9211;
            if (cArr[i2] == 'u' && cArr[i2 + 1] == 'l' && cArr[i2 + 2] == 'l') {
                int i3 = i2 + 3;
                int i4 = this.f9210;
                char c2 = i3 == i4 ? (char) 26 : cArr[i3];
                int i5 = i2 + 4;
                while (c2 <= ' ' && ((1 << c2) & 4294981376L) != 0) {
                    if (i5 == i4) {
                        c2 = 26;
                    } else {
                        c2 = cArr[i5];
                        i5++;
                    }
                }
                boolean z = c2 == ',';
                this.f9195 = z;
                if (z) {
                    if (i5 == i4) {
                        i = i5;
                        c = 26;
                    } else {
                        i = i5 + 1;
                        c = cArr[i5];
                    }
                    loop1: while (true) {
                        int i6 = i;
                        c2 = c;
                        i5 = i6;
                        while (c2 <= ' ' && ((1 << c2) & 4294981376L) != 0) {
                            if (i5 == i4) {
                                c2 = 26;
                            }
                        }
                        i = i5 + 1;
                        c = cArr[i5];
                    }
                }
                this.f9191 = c2;
                this.f9192 = i5;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:347:0x07f9 A[PHI: r17 r22 r26 r27 r28
  0x07f9: PHI (r17v18 long) = 
  (r17v0 long)
  (r17v0 long)
  (r17v0 long)
  (r17v1 long)
  (r17v1 long)
  (r17v1 long)
  (r17v1 long)
  (r17v2 long)
  (r17v2 long)
  (r17v2 long)
  (r17v2 long)
  (r17v2 long)
  (r17v3 long)
  (r17v3 long)
  (r17v3 long)
  (r17v3 long)
  (r17v3 long)
  (r17v3 long)
  (r17v4 long)
  (r17v4 long)
  (r17v4 long)
  (r17v4 long)
  (r17v4 long)
  (r17v4 long)
  (r17v4 long)
  (r17v6 long)
  (r17v6 long)
  (r17v6 long)
  (r17v6 long)
  (r17v6 long)
  (r17v6 long)
  (r17v6 long)
  (r17v6 long)
  (r17v7 long)
  (r17v7 long)
  (r17v7 long)
  (r17v7 long)
  (r17v7 long)
  (r17v7 long)
  (r17v7 long)
  (r17v7 long)
  (r17v7 long)
  (r17v8 long)
  (r17v8 long)
  (r17v8 long)
  (r17v8 long)
  (r17v8 long)
  (r17v8 long)
  (r17v8 long)
  (r17v8 long)
  (r17v8 long)
  (r17v8 long)
  (r17v9 long)
  (r17v9 long)
  (r17v9 long)
  (r17v9 long)
  (r17v9 long)
  (r17v9 long)
  (r17v9 long)
  (r17v9 long)
  (r17v9 long)
  (r17v9 long)
  (r17v9 long)
  (r17v10 long)
  (r17v10 long)
  (r17v10 long)
  (r17v10 long)
  (r17v10 long)
  (r17v10 long)
  (r17v10 long)
  (r17v10 long)
  (r17v10 long)
  (r17v10 long)
  (r17v10 long)
  (r17v10 long)
  (r17v11 long)
  (r17v11 long)
  (r17v11 long)
  (r17v11 long)
  (r17v11 long)
  (r17v11 long)
  (r17v11 long)
  (r17v11 long)
  (r17v11 long)
  (r17v11 long)
  (r17v11 long)
  (r17v11 long)
  (r17v11 long)
  (r17v12 long)
  (r17v12 long)
  (r17v12 long)
  (r17v12 long)
  (r17v12 long)
  (r17v12 long)
  (r17v12 long)
  (r17v12 long)
  (r17v12 long)
  (r17v12 long)
  (r17v12 long)
  (r17v12 long)
  (r17v12 long)
  (r17v12 long)
  (r17v15 long)
  (r17v15 long)
  (r17v15 long)
  (r17v15 long)
  (r17v15 long)
  (r17v15 long)
  (r17v15 long)
  (r17v15 long)
  (r17v15 long)
  (r17v15 long)
  (r17v15 long)
  (r17v15 long)
  (r17v15 long)
  (r17v15 long)
  (r17v15 long)
  (r17v16 long)
  (r17v16 long)
  (r17v16 long)
  (r17v16 long)
  (r17v16 long)
  (r17v16 long)
  (r17v16 long)
  (r17v16 long)
  (r17v16 long)
  (r17v16 long)
  (r17v16 long)
  (r17v16 long)
  (r17v16 long)
  (r17v16 long)
  (r17v16 long)
  (r17v16 long)
  (r17v19 long)
 binds: [B:341:0x07e6, B:343:0x07ea, B:345:0x07ee, B:332:0x07b2, B:334:0x07b6, B:336:0x07ba, B:338:0x07be, B:321:0x076c, B:323:0x0770, B:325:0x0774, B:327:0x0778, B:329:0x077c, B:308:0x071a, B:310:0x071e, B:312:0x0722, B:314:0x0726, B:316:0x072a, B:318:0x072e, B:293:0x06bb, B:295:0x06bf, B:297:0x06c3, B:299:0x06c7, B:301:0x06cb, B:303:0x06cf, B:305:0x06d3, B:275:0x064a, B:277:0x064e, B:279:0x0652, B:281:0x0656, B:283:0x065a, B:285:0x065e, B:287:0x0662, B:289:0x0666, B:256:0x05cf, B:258:0x05d3, B:260:0x05d7, B:262:0x05db, B:264:0x05df, B:266:0x05e3, B:268:0x05e7, B:270:0x05eb, B:272:0x05ef, B:235:0x054c, B:237:0x0550, B:239:0x0554, B:241:0x0558, B:243:0x055c, B:245:0x0560, B:247:0x0564, B:249:0x0568, B:251:0x056c, B:253:0x0570, B:212:0x04be, B:214:0x04c2, B:216:0x04c6, B:218:0x04ca, B:220:0x04ce, B:222:0x04d2, B:224:0x04d6, B:226:0x04da, B:228:0x04de, B:230:0x04e2, B:232:0x04e6, B:187:0x0426, B:189:0x042a, B:191:0x042e, B:193:0x0432, B:195:0x0436, B:197:0x043a, B:199:0x043e, B:201:0x0442, B:203:0x0446, B:205:0x044a, B:207:0x044e, B:209:0x0452, B:160:0x037f, B:162:0x0383, B:164:0x0387, B:166:0x038b, B:168:0x038f, B:170:0x0393, B:172:0x0397, B:174:0x039b, B:176:0x039f, B:178:0x03a3, B:180:0x03a7, B:182:0x03ab, B:184:0x03af, B:131:0x02cc, B:133:0x02d0, B:135:0x02d4, B:137:0x02d8, B:139:0x02dc, B:141:0x02e0, B:143:0x02e4, B:145:0x02e8, B:147:0x02ec, B:149:0x02f0, B:151:0x02f4, B:153:0x02f8, B:155:0x02fc, B:157:0x0300, B:98:0x0206, B:100:0x020a, B:102:0x020e, B:104:0x0212, B:106:0x0216, B:108:0x021a, B:110:0x021e, B:112:0x0222, B:114:0x0226, B:116:0x022a, B:118:0x022e, B:120:0x0232, B:122:0x0236, B:124:0x023a, B:126:0x023e, B:65:0x012f, B:67:0x0133, B:69:0x0137, B:71:0x013b, B:73:0x013f, B:75:0x0143, B:77:0x0147, B:79:0x014b, B:81:0x014f, B:83:0x0153, B:85:0x0157, B:87:0x015b, B:89:0x015f, B:91:0x0163, B:93:0x0167, B:95:0x016f, B:63:0x00cb] A[DONT_GENERATE, DONT_INLINE]
  0x07f9: PHI (r22v18 char) = 
  (r22v0 char)
  (r22v0 char)
  (r22v0 char)
  (r22v1 char)
  (r22v1 char)
  (r22v1 char)
  (r22v1 char)
  (r22v2 char)
  (r22v2 char)
  (r22v2 char)
  (r22v2 char)
  (r22v2 char)
  (r22v3 char)
  (r22v3 char)
  (r22v3 char)
  (r22v3 char)
  (r22v3 char)
  (r22v3 char)
  (r22v4 char)
  (r22v4 char)
  (r22v4 char)
  (r22v4 char)
  (r22v4 char)
  (r22v4 char)
  (r22v4 char)
  (r22v6 char)
  (r22v6 char)
  (r22v6 char)
  (r22v6 char)
  (r22v6 char)
  (r22v6 char)
  (r22v6 char)
  (r22v6 char)
  (r22v7 char)
  (r22v7 char)
  (r22v7 char)
  (r22v7 char)
  (r22v7 char)
  (r22v7 char)
  (r22v7 char)
  (r22v7 char)
  (r22v7 char)
  (r22v8 char)
  (r22v8 char)
  (r22v8 char)
  (r22v8 char)
  (r22v8 char)
  (r22v8 char)
  (r22v8 char)
  (r22v8 char)
  (r22v8 char)
  (r22v8 char)
  (r22v9 char)
  (r22v9 char)
  (r22v9 char)
  (r22v9 char)
  (r22v9 char)
  (r22v9 char)
  (r22v9 char)
  (r22v9 char)
  (r22v9 char)
  (r22v9 char)
  (r22v9 char)
  (r22v10 char)
  (r22v10 char)
  (r22v10 char)
  (r22v10 char)
  (r22v10 char)
  (r22v10 char)
  (r22v10 char)
  (r22v10 char)
  (r22v10 char)
  (r22v10 char)
  (r22v10 char)
  (r22v10 char)
  (r22v11 char)
  (r22v11 char)
  (r22v11 char)
  (r22v11 char)
  (r22v11 char)
  (r22v11 char)
  (r22v11 char)
  (r22v11 char)
  (r22v11 char)
  (r22v11 char)
  (r22v11 char)
  (r22v11 char)
  (r22v11 char)
  (r22v12 char)
  (r22v12 char)
  (r22v12 char)
  (r22v12 char)
  (r22v12 char)
  (r22v12 char)
  (r22v12 char)
  (r22v12 char)
  (r22v12 char)
  (r22v12 char)
  (r22v12 char)
  (r22v12 char)
  (r22v12 char)
  (r22v12 char)
  (r22v15 char)
  (r22v15 char)
  (r22v15 char)
  (r22v15 char)
  (r22v15 char)
  (r22v15 char)
  (r22v15 char)
  (r22v15 char)
  (r22v15 char)
  (r22v15 char)
  (r22v15 char)
  (r22v15 char)
  (r22v15 char)
  (r22v15 char)
  (r22v15 char)
  (r22v16 char)
  (r22v16 char)
  (r22v16 char)
  (r22v16 char)
  (r22v16 char)
  (r22v16 char)
  (r22v16 char)
  (r22v16 char)
  (r22v16 char)
  (r22v16 char)
  (r22v16 char)
  (r22v16 char)
  (r22v16 char)
  (r22v16 char)
  (r22v16 char)
  (r22v16 char)
  (r22v19 char)
 binds: [B:341:0x07e6, B:343:0x07ea, B:345:0x07ee, B:332:0x07b2, B:334:0x07b6, B:336:0x07ba, B:338:0x07be, B:321:0x076c, B:323:0x0770, B:325:0x0774, B:327:0x0778, B:329:0x077c, B:308:0x071a, B:310:0x071e, B:312:0x0722, B:314:0x0726, B:316:0x072a, B:318:0x072e, B:293:0x06bb, B:295:0x06bf, B:297:0x06c3, B:299:0x06c7, B:301:0x06cb, B:303:0x06cf, B:305:0x06d3, B:275:0x064a, B:277:0x064e, B:279:0x0652, B:281:0x0656, B:283:0x065a, B:285:0x065e, B:287:0x0662, B:289:0x0666, B:256:0x05cf, B:258:0x05d3, B:260:0x05d7, B:262:0x05db, B:264:0x05df, B:266:0x05e3, B:268:0x05e7, B:270:0x05eb, B:272:0x05ef, B:235:0x054c, B:237:0x0550, B:239:0x0554, B:241:0x0558, B:243:0x055c, B:245:0x0560, B:247:0x0564, B:249:0x0568, B:251:0x056c, B:253:0x0570, B:212:0x04be, B:214:0x04c2, B:216:0x04c6, B:218:0x04ca, B:220:0x04ce, B:222:0x04d2, B:224:0x04d6, B:226:0x04da, B:228:0x04de, B:230:0x04e2, B:232:0x04e6, B:187:0x0426, B:189:0x042a, B:191:0x042e, B:193:0x0432, B:195:0x0436, B:197:0x043a, B:199:0x043e, B:201:0x0442, B:203:0x0446, B:205:0x044a, B:207:0x044e, B:209:0x0452, B:160:0x037f, B:162:0x0383, B:164:0x0387, B:166:0x038b, B:168:0x038f, B:170:0x0393, B:172:0x0397, B:174:0x039b, B:176:0x039f, B:178:0x03a3, B:180:0x03a7, B:182:0x03ab, B:184:0x03af, B:131:0x02cc, B:133:0x02d0, B:135:0x02d4, B:137:0x02d8, B:139:0x02dc, B:141:0x02e0, B:143:0x02e4, B:145:0x02e8, B:147:0x02ec, B:149:0x02f0, B:151:0x02f4, B:153:0x02f8, B:155:0x02fc, B:157:0x0300, B:98:0x0206, B:100:0x020a, B:102:0x020e, B:104:0x0212, B:106:0x0216, B:108:0x021a, B:110:0x021e, B:112:0x0222, B:114:0x0226, B:116:0x022a, B:118:0x022e, B:120:0x0232, B:122:0x0236, B:124:0x023a, B:126:0x023e, B:65:0x012f, B:67:0x0133, B:69:0x0137, B:71:0x013b, B:73:0x013f, B:75:0x0143, B:77:0x0147, B:79:0x014b, B:81:0x014f, B:83:0x0153, B:85:0x0157, B:87:0x015b, B:89:0x015f, B:91:0x0163, B:93:0x0167, B:95:0x016f, B:63:0x00cb] A[DONT_GENERATE, DONT_INLINE]
  0x07f9: PHI (r26v18 char[]) = 
  (r26v0 char[])
  (r26v0 char[])
  (r26v0 char[])
  (r26v1 char[])
  (r26v1 char[])
  (r26v1 char[])
  (r26v1 char[])
  (r26v2 char[])
  (r26v2 char[])
  (r26v2 char[])
  (r26v2 char[])
  (r26v2 char[])
  (r26v3 char[])
  (r26v3 char[])
  (r26v3 char[])
  (r26v3 char[])
  (r26v3 char[])
  (r26v3 char[])
  (r26v4 char[])
  (r26v4 char[])
  (r26v4 char[])
  (r26v4 char[])
  (r26v4 char[])
  (r26v4 char[])
  (r26v4 char[])
  (r26v6 char[])
  (r26v6 char[])
  (r26v6 char[])
  (r26v6 char[])
  (r26v6 char[])
  (r26v6 char[])
  (r26v6 char[])
  (r26v6 char[])
  (r26v7 char[])
  (r26v7 char[])
  (r26v7 char[])
  (r26v7 char[])
  (r26v7 char[])
  (r26v7 char[])
  (r26v7 char[])
  (r26v7 char[])
  (r26v7 char[])
  (r26v8 char[])
  (r26v8 char[])
  (r26v8 char[])
  (r26v8 char[])
  (r26v8 char[])
  (r26v8 char[])
  (r26v8 char[])
  (r26v8 char[])
  (r26v8 char[])
  (r26v8 char[])
  (r26v9 char[])
  (r26v9 char[])
  (r26v9 char[])
  (r26v9 char[])
  (r26v9 char[])
  (r26v9 char[])
  (r26v9 char[])
  (r26v9 char[])
  (r26v9 char[])
  (r26v9 char[])
  (r26v9 char[])
  (r26v10 char[])
  (r26v10 char[])
  (r26v10 char[])
  (r26v10 char[])
  (r26v10 char[])
  (r26v10 char[])
  (r26v10 char[])
  (r26v10 char[])
  (r26v10 char[])
  (r26v10 char[])
  (r26v10 char[])
  (r26v10 char[])
  (r26v11 char[])
  (r26v11 char[])
  (r26v11 char[])
  (r26v11 char[])
  (r26v11 char[])
  (r26v11 char[])
  (r26v11 char[])
  (r26v11 char[])
  (r26v11 char[])
  (r26v11 char[])
  (r26v11 char[])
  (r26v11 char[])
  (r26v11 char[])
  (r26v12 char[])
  (r26v12 char[])
  (r26v12 char[])
  (r26v12 char[])
  (r26v12 char[])
  (r26v12 char[])
  (r26v12 char[])
  (r26v12 char[])
  (r26v12 char[])
  (r26v12 char[])
  (r26v12 char[])
  (r26v12 char[])
  (r26v12 char[])
  (r26v12 char[])
  (r26v15 char[])
  (r26v15 char[])
  (r26v15 char[])
  (r26v15 char[])
  (r26v15 char[])
  (r26v15 char[])
  (r26v15 char[])
  (r26v15 char[])
  (r26v15 char[])
  (r26v15 char[])
  (r26v15 char[])
  (r26v15 char[])
  (r26v15 char[])
  (r26v15 char[])
  (r26v15 char[])
  (r26v16 char[])
  (r26v16 char[])
  (r26v16 char[])
  (r26v16 char[])
  (r26v16 char[])
  (r26v16 char[])
  (r26v16 char[])
  (r26v16 char[])
  (r26v16 char[])
  (r26v16 char[])
  (r26v16 char[])
  (r26v16 char[])
  (r26v16 char[])
  (r26v16 char[])
  (r26v16 char[])
  (r26v16 char[])
  (r26v19 char[])
 binds: [B:341:0x07e6, B:343:0x07ea, B:345:0x07ee, B:332:0x07b2, B:334:0x07b6, B:336:0x07ba, B:338:0x07be, B:321:0x076c, B:323:0x0770, B:325:0x0774, B:327:0x0778, B:329:0x077c, B:308:0x071a, B:310:0x071e, B:312:0x0722, B:314:0x0726, B:316:0x072a, B:318:0x072e, B:293:0x06bb, B:295:0x06bf, B:297:0x06c3, B:299:0x06c7, B:301:0x06cb, B:303:0x06cf, B:305:0x06d3, B:275:0x064a, B:277:0x064e, B:279:0x0652, B:281:0x0656, B:283:0x065a, B:285:0x065e, B:287:0x0662, B:289:0x0666, B:256:0x05cf, B:258:0x05d3, B:260:0x05d7, B:262:0x05db, B:264:0x05df, B:266:0x05e3, B:268:0x05e7, B:270:0x05eb, B:272:0x05ef, B:235:0x054c, B:237:0x0550, B:239:0x0554, B:241:0x0558, B:243:0x055c, B:245:0x0560, B:247:0x0564, B:249:0x0568, B:251:0x056c, B:253:0x0570, B:212:0x04be, B:214:0x04c2, B:216:0x04c6, B:218:0x04ca, B:220:0x04ce, B:222:0x04d2, B:224:0x04d6, B:226:0x04da, B:228:0x04de, B:230:0x04e2, B:232:0x04e6, B:187:0x0426, B:189:0x042a, B:191:0x042e, B:193:0x0432, B:195:0x0436, B:197:0x043a, B:199:0x043e, B:201:0x0442, B:203:0x0446, B:205:0x044a, B:207:0x044e, B:209:0x0452, B:160:0x037f, B:162:0x0383, B:164:0x0387, B:166:0x038b, B:168:0x038f, B:170:0x0393, B:172:0x0397, B:174:0x039b, B:176:0x039f, B:178:0x03a3, B:180:0x03a7, B:182:0x03ab, B:184:0x03af, B:131:0x02cc, B:133:0x02d0, B:135:0x02d4, B:137:0x02d8, B:139:0x02dc, B:141:0x02e0, B:143:0x02e4, B:145:0x02e8, B:147:0x02ec, B:149:0x02f0, B:151:0x02f4, B:153:0x02f8, B:155:0x02fc, B:157:0x0300, B:98:0x0206, B:100:0x020a, B:102:0x020e, B:104:0x0212, B:106:0x0216, B:108:0x021a, B:110:0x021e, B:112:0x0222, B:114:0x0226, B:116:0x022a, B:118:0x022e, B:120:0x0232, B:122:0x0236, B:124:0x023a, B:126:0x023e, B:65:0x012f, B:67:0x0133, B:69:0x0137, B:71:0x013b, B:73:0x013f, B:75:0x0143, B:77:0x0147, B:79:0x014b, B:81:0x014f, B:83:0x0153, B:85:0x0157, B:87:0x015b, B:89:0x015f, B:91:0x0163, B:93:0x0167, B:95:0x016f, B:63:0x00cb] A[DONT_GENERATE, DONT_INLINE]
  0x07f9: PHI (r27v18 int) = 
  (r27v0 int)
  (r27v0 int)
  (r27v0 int)
  (r27v1 int)
  (r27v1 int)
  (r27v1 int)
  (r27v1 int)
  (r27v2 int)
  (r27v2 int)
  (r27v2 int)
  (r27v2 int)
  (r27v2 int)
  (r27v3 int)
  (r27v3 int)
  (r27v3 int)
  (r27v3 int)
  (r27v3 int)
  (r27v3 int)
  (r27v4 int)
  (r27v4 int)
  (r27v4 int)
  (r27v4 int)
  (r27v4 int)
  (r27v4 int)
  (r27v4 int)
  (r27v6 int)
  (r27v6 int)
  (r27v6 int)
  (r27v6 int)
  (r27v6 int)
  (r27v6 int)
  (r27v6 int)
  (r27v6 int)
  (r27v7 int)
  (r27v7 int)
  (r27v7 int)
  (r27v7 int)
  (r27v7 int)
  (r27v7 int)
  (r27v7 int)
  (r27v7 int)
  (r27v7 int)
  (r27v8 int)
  (r27v8 int)
  (r27v8 int)
  (r27v8 int)
  (r27v8 int)
  (r27v8 int)
  (r27v8 int)
  (r27v8 int)
  (r27v8 int)
  (r27v8 int)
  (r27v9 int)
  (r27v9 int)
  (r27v9 int)
  (r27v9 int)
  (r27v9 int)
  (r27v9 int)
  (r27v9 int)
  (r27v9 int)
  (r27v9 int)
  (r27v9 int)
  (r27v9 int)
  (r27v10 int)
  (r27v10 int)
  (r27v10 int)
  (r27v10 int)
  (r27v10 int)
  (r27v10 int)
  (r27v10 int)
  (r27v10 int)
  (r27v10 int)
  (r27v10 int)
  (r27v10 int)
  (r27v10 int)
  (r27v11 int)
  (r27v11 int)
  (r27v11 int)
  (r27v11 int)
  (r27v11 int)
  (r27v11 int)
  (r27v11 int)
  (r27v11 int)
  (r27v11 int)
  (r27v11 int)
  (r27v11 int)
  (r27v11 int)
  (r27v11 int)
  (r27v12 int)
  (r27v12 int)
  (r27v12 int)
  (r27v12 int)
  (r27v12 int)
  (r27v12 int)
  (r27v12 int)
  (r27v12 int)
  (r27v12 int)
  (r27v12 int)
  (r27v12 int)
  (r27v12 int)
  (r27v12 int)
  (r27v12 int)
  (r27v15 int)
  (r27v15 int)
  (r27v15 int)
  (r27v15 int)
  (r27v15 int)
  (r27v15 int)
  (r27v15 int)
  (r27v15 int)
  (r27v15 int)
  (r27v15 int)
  (r27v15 int)
  (r27v15 int)
  (r27v15 int)
  (r27v15 int)
  (r27v15 int)
  (r27v16 int)
  (r27v16 int)
  (r27v16 int)
  (r27v16 int)
  (r27v16 int)
  (r27v16 int)
  (r27v16 int)
  (r27v16 int)
  (r27v16 int)
  (r27v16 int)
  (r27v16 int)
  (r27v16 int)
  (r27v16 int)
  (r27v16 int)
  (r27v16 int)
  (r27v16 int)
  (r27v19 int)
 binds: [B:341:0x07e6, B:343:0x07ea, B:345:0x07ee, B:332:0x07b2, B:334:0x07b6, B:336:0x07ba, B:338:0x07be, B:321:0x076c, B:323:0x0770, B:325:0x0774, B:327:0x0778, B:329:0x077c, B:308:0x071a, B:310:0x071e, B:312:0x0722, B:314:0x0726, B:316:0x072a, B:318:0x072e, B:293:0x06bb, B:295:0x06bf, B:297:0x06c3, B:299:0x06c7, B:301:0x06cb, B:303:0x06cf, B:305:0x06d3, B:275:0x064a, B:277:0x064e, B:279:0x0652, B:281:0x0656, B:283:0x065a, B:285:0x065e, B:287:0x0662, B:289:0x0666, B:256:0x05cf, B:258:0x05d3, B:260:0x05d7, B:262:0x05db, B:264:0x05df, B:266:0x05e3, B:268:0x05e7, B:270:0x05eb, B:272:0x05ef, B:235:0x054c, B:237:0x0550, B:239:0x0554, B:241:0x0558, B:243:0x055c, B:245:0x0560, B:247:0x0564, B:249:0x0568, B:251:0x056c, B:253:0x0570, B:212:0x04be, B:214:0x04c2, B:216:0x04c6, B:218:0x04ca, B:220:0x04ce, B:222:0x04d2, B:224:0x04d6, B:226:0x04da, B:228:0x04de, B:230:0x04e2, B:232:0x04e6, B:187:0x0426, B:189:0x042a, B:191:0x042e, B:193:0x0432, B:195:0x0436, B:197:0x043a, B:199:0x043e, B:201:0x0442, B:203:0x0446, B:205:0x044a, B:207:0x044e, B:209:0x0452, B:160:0x037f, B:162:0x0383, B:164:0x0387, B:166:0x038b, B:168:0x038f, B:170:0x0393, B:172:0x0397, B:174:0x039b, B:176:0x039f, B:178:0x03a3, B:180:0x03a7, B:182:0x03ab, B:184:0x03af, B:131:0x02cc, B:133:0x02d0, B:135:0x02d4, B:137:0x02d8, B:139:0x02dc, B:141:0x02e0, B:143:0x02e4, B:145:0x02e8, B:147:0x02ec, B:149:0x02f0, B:151:0x02f4, B:153:0x02f8, B:155:0x02fc, B:157:0x0300, B:98:0x0206, B:100:0x020a, B:102:0x020e, B:104:0x0212, B:106:0x0216, B:108:0x021a, B:110:0x021e, B:112:0x0222, B:114:0x0226, B:116:0x022a, B:118:0x022e, B:120:0x0232, B:122:0x0236, B:124:0x023a, B:126:0x023e, B:65:0x012f, B:67:0x0133, B:69:0x0137, B:71:0x013b, B:73:0x013f, B:75:0x0143, B:77:0x0147, B:79:0x014b, B:81:0x014f, B:83:0x0153, B:85:0x0157, B:87:0x015b, B:89:0x015f, B:91:0x0163, B:93:0x0167, B:95:0x016f, B:63:0x00cb] A[DONT_GENERATE, DONT_INLINE]
  0x07f9: PHI (r28v18 int) = 
  (r28v0 int)
  (r28v0 int)
  (r28v0 int)
  (r28v1 int)
  (r28v1 int)
  (r28v1 int)
  (r28v1 int)
  (r28v2 int)
  (r28v2 int)
  (r28v2 int)
  (r28v2 int)
  (r28v2 int)
  (r28v3 int)
  (r28v3 int)
  (r28v3 int)
  (r28v3 int)
  (r28v3 int)
  (r28v3 int)
  (r28v4 int)
  (r28v4 int)
  (r28v4 int)
  (r28v4 int)
  (r28v4 int)
  (r28v4 int)
  (r28v4 int)
  (r28v6 int)
  (r28v6 int)
  (r28v6 int)
  (r28v6 int)
  (r28v6 int)
  (r28v6 int)
  (r28v6 int)
  (r28v6 int)
  (r28v7 int)
  (r28v7 int)
  (r28v7 int)
  (r28v7 int)
  (r28v7 int)
  (r28v7 int)
  (r28v7 int)
  (r28v7 int)
  (r28v7 int)
  (r28v8 int)
  (r28v8 int)
  (r28v8 int)
  (r28v8 int)
  (r28v8 int)
  (r28v8 int)
  (r28v8 int)
  (r28v8 int)
  (r28v8 int)
  (r28v8 int)
  (r28v9 int)
  (r28v9 int)
  (r28v9 int)
  (r28v9 int)
  (r28v9 int)
  (r28v9 int)
  (r28v9 int)
  (r28v9 int)
  (r28v9 int)
  (r28v9 int)
  (r28v9 int)
  (r28v10 int)
  (r28v10 int)
  (r28v10 int)
  (r28v10 int)
  (r28v10 int)
  (r28v10 int)
  (r28v10 int)
  (r28v10 int)
  (r28v10 int)
  (r28v10 int)
  (r28v10 int)
  (r28v10 int)
  (r28v11 int)
  (r28v11 int)
  (r28v11 int)
  (r28v11 int)
  (r28v11 int)
  (r28v11 int)
  (r28v11 int)
  (r28v11 int)
  (r28v11 int)
  (r28v11 int)
  (r28v11 int)
  (r28v11 int)
  (r28v11 int)
  (r28v12 int)
  (r28v12 int)
  (r28v12 int)
  (r28v12 int)
  (r28v12 int)
  (r28v12 int)
  (r28v12 int)
  (r28v12 int)
  (r28v12 int)
  (r28v12 int)
  (r28v12 int)
  (r28v12 int)
  (r28v12 int)
  (r28v12 int)
  (r28v15 int)
  (r28v15 int)
  (r28v15 int)
  (r28v15 int)
  (r28v15 int)
  (r28v15 int)
  (r28v15 int)
  (r28v15 int)
  (r28v15 int)
  (r28v15 int)
  (r28v15 int)
  (r28v15 int)
  (r28v15 int)
  (r28v15 int)
  (r28v15 int)
  (r28v16 int)
  (r28v16 int)
  (r28v16 int)
  (r28v16 int)
  (r28v16 int)
  (r28v16 int)
  (r28v16 int)
  (r28v16 int)
  (r28v16 int)
  (r28v16 int)
  (r28v16 int)
  (r28v16 int)
  (r28v16 int)
  (r28v16 int)
  (r28v16 int)
  (r28v16 int)
  (r28v19 int)
 binds: [B:341:0x07e6, B:343:0x07ea, B:345:0x07ee, B:332:0x07b2, B:334:0x07b6, B:336:0x07ba, B:338:0x07be, B:321:0x076c, B:323:0x0770, B:325:0x0774, B:327:0x0778, B:329:0x077c, B:308:0x071a, B:310:0x071e, B:312:0x0722, B:314:0x0726, B:316:0x072a, B:318:0x072e, B:293:0x06bb, B:295:0x06bf, B:297:0x06c3, B:299:0x06c7, B:301:0x06cb, B:303:0x06cf, B:305:0x06d3, B:275:0x064a, B:277:0x064e, B:279:0x0652, B:281:0x0656, B:283:0x065a, B:285:0x065e, B:287:0x0662, B:289:0x0666, B:256:0x05cf, B:258:0x05d3, B:260:0x05d7, B:262:0x05db, B:264:0x05df, B:266:0x05e3, B:268:0x05e7, B:270:0x05eb, B:272:0x05ef, B:235:0x054c, B:237:0x0550, B:239:0x0554, B:241:0x0558, B:243:0x055c, B:245:0x0560, B:247:0x0564, B:249:0x0568, B:251:0x056c, B:253:0x0570, B:212:0x04be, B:214:0x04c2, B:216:0x04c6, B:218:0x04ca, B:220:0x04ce, B:222:0x04d2, B:224:0x04d6, B:226:0x04da, B:228:0x04de, B:230:0x04e2, B:232:0x04e6, B:187:0x0426, B:189:0x042a, B:191:0x042e, B:193:0x0432, B:195:0x0436, B:197:0x043a, B:199:0x043e, B:201:0x0442, B:203:0x0446, B:205:0x044a, B:207:0x044e, B:209:0x0452, B:160:0x037f, B:162:0x0383, B:164:0x0387, B:166:0x038b, B:168:0x038f, B:170:0x0393, B:172:0x0397, B:174:0x039b, B:176:0x039f, B:178:0x03a3, B:180:0x03a7, B:182:0x03ab, B:184:0x03af, B:131:0x02cc, B:133:0x02d0, B:135:0x02d4, B:137:0x02d8, B:139:0x02dc, B:141:0x02e0, B:143:0x02e4, B:145:0x02e8, B:147:0x02ec, B:149:0x02f0, B:151:0x02f4, B:153:0x02f8, B:155:0x02fc, B:157:0x0300, B:98:0x0206, B:100:0x020a, B:102:0x020e, B:104:0x0212, B:106:0x0216, B:108:0x021a, B:110:0x021e, B:112:0x0222, B:114:0x0226, B:116:0x022a, B:118:0x022e, B:120:0x0232, B:122:0x0236, B:124:0x023a, B:126:0x023e, B:65:0x012f, B:67:0x0133, B:69:0x0137, B:71:0x013b, B:73:0x013f, B:75:0x0143, B:77:0x0147, B:79:0x014b, B:81:0x014f, B:83:0x0153, B:85:0x0157, B:87:0x015b, B:89:0x015f, B:91:0x0163, B:93:0x0167, B:95:0x016f, B:63:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x088f  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mo6080() {
        /*
            Method dump skipped, instruction units count: 2270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6080():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0209, code lost:
    
        r14 = -r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0203  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double mo6081() {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6081():double");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0108, code lost:
    
        r27.f9208 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010a, code lost:
    
        if (r6 != 26) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010c, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010e, code lost:
    
        r3 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0110, code lost:
    
        r27.f9205 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0114, code lost:
    
        if (r6 > ' ') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011c, code lost:
    
        if (((1 << r6) & 4294981376L) == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x011e, code lost:
    
        if (r2 != r12) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0120, code lost:
    
        r3 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0122, code lost:
    
        r3 = r1[r2];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012c, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0133  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo6082() {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6082():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x035f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo6083() {
        /*
            Method dump skipped, instruction units count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6083():long");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final boolean mo6087() {
        if (this.f9191 != 'n') {
            return false;
        }
        int i = this.f9192;
        if (i + 2 >= this.f9210 || this.f9211[i] != 'u') {
            return false;
        }
        mo6157();
        return true;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x003f -> B:16:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:20:0x002e
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final boolean mo6088(char r8, char r9, char r10, char r11) {
        /*
            r7 = this;
            char r0 = r7.f9191
            if (r0 == r8) goto L6
            goto L6e
        L6:
            int r8 = r7.f9192
            int r0 = r8 + 3
            int r1 = r7.f9210
            if (r0 > r1) goto L6e
            char[] r2 = r7.f9211
            char r3 = r2[r8]
            if (r3 != r9) goto L6e
            int r9 = r8 + 1
            char r9 = r2[r9]
            if (r9 != r10) goto L6e
            int r9 = r8 + 2
            char r9 = r2[r9]
            if (r9 == r11) goto L21
            goto L6e
        L21:
            r9 = 26
            if (r0 != r1) goto L27
        L25:
            r10 = r9
            goto L2c
        L27:
            int r8 = r8 + 4
            char r10 = r2[r0]
        L2b:
            r0 = r8
        L2c:
            r8 = 32
            if (r10 > r8) goto L47
            r3 = 1
            long r3 = r3 << r10
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r3 = r3 & r5
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L47
            if (r0 != r1) goto L42
            goto L25
        L42:
            int r8 = r0 + 1
            char r10 = r2[r0]
            goto L2b
        L47:
            int r8 = r7.f9192
            int r8 = r8 + 4
            if (r0 != r8) goto L68
            if (r10 == r9) goto L68
            r8 = 40
            if (r10 == r8) goto L68
            r8 = 91
            if (r10 == r8) goto L68
            r8 = 93
            if (r10 == r8) goto L68
            r8 = 41
            if (r10 == r8) goto L68
            r8 = 58
            if (r10 == r8) goto L68
            r8 = 44
            if (r10 == r8) goto L68
            goto L6e
        L68:
            r7.f9192 = r0
            r7.f9191 = r10
            r7 = 1
            return r7
        L6e:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6088(char, char, char, char):boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x003f -> B:15:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:18:0x002e
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final boolean mo6089() {
        /*
            r10 = this;
            char r0 = r10.f9191
            r1 = 108(0x6c, float:1.51E-43)
            if (r0 == r1) goto L8
            goto L71
        L8:
            int r0 = r10.f9192
            int r1 = r0 + 2
            int r2 = r10.f9210
            if (r1 > r2) goto L71
            char[] r3 = r10.f9211
            char r4 = r3[r0]
            r5 = 97
            if (r4 != r5) goto L71
            int r4 = r0 + 1
            char r4 = r3[r4]
            r5 = 120(0x78, float:1.68E-43)
            if (r4 == r5) goto L21
            goto L71
        L21:
            r4 = 26
            if (r1 != r2) goto L28
            r0 = r1
        L26:
            r1 = r4
            goto L2c
        L28:
            int r0 = r0 + 3
            char r1 = r3[r1]
        L2c:
            r5 = 32
            if (r1 > r5) goto L4a
            r5 = 1
            long r5 = r5 << r1
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L4a
            if (r0 != r2) goto L42
            goto L26
        L42:
            int r1 = r0 + 1
            char r0 = r3[r0]
            r9 = r1
            r1 = r0
            r0 = r9
            goto L2c
        L4a:
            int r2 = r10.f9192
            int r2 = r2 + 3
            if (r0 != r2) goto L6b
            if (r1 == r4) goto L6b
            r2 = 40
            if (r1 == r2) goto L6b
            r2 = 91
            if (r1 == r2) goto L6b
            r2 = 93
            if (r1 == r2) goto L6b
            r2 = 41
            if (r1 == r2) goto L6b
            r2 = 58
            if (r1 == r2) goto L6b
            r2 = 44
            if (r1 == r2) goto L6b
            goto L71
        L6b:
            r10.f9192 = r0
            r10.f9191 = r1
            r10 = 1
            return r10
        L71:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6089():boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004d -> B:19:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:22:0x003c
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public final boolean mo6090() {
        /*
            r10 = this;
            char r0 = r10.f9191
            r1 = 34
            if (r0 == r1) goto L8
            goto L7f
        L8:
            int r0 = r10.f9192
            int r2 = r0 + 4
            int r3 = r10.f9210
            if (r2 > r3) goto L7f
            char[] r4 = r10.f9211
            char r5 = r4[r0]
            r6 = 118(0x76, float:1.65E-43)
            if (r5 != r6) goto L7f
            int r5 = r0 + 1
            char r5 = r4[r5]
            r6 = 97
            if (r5 != r6) goto L7f
            int r5 = r0 + 2
            char r5 = r4[r5]
            r6 = 108(0x6c, float:1.51E-43)
            if (r5 != r6) goto L7f
            int r5 = r0 + 3
            char r5 = r4[r5]
            if (r5 == r1) goto L2f
            goto L7f
        L2f:
            r1 = 26
            if (r2 != r3) goto L36
            r0 = r2
        L34:
            r2 = r1
            goto L3a
        L36:
            int r0 = r0 + 5
            char r2 = r4[r2]
        L3a:
            r5 = 32
            if (r2 > r5) goto L58
            r5 = 1
            long r5 = r5 << r2
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L58
            if (r0 != r3) goto L50
            goto L34
        L50:
            int r2 = r0 + 1
            char r0 = r4[r0]
            r9 = r2
            r2 = r0
            r0 = r9
            goto L3a
        L58:
            int r3 = r10.f9192
            int r3 = r3 + 5
            if (r0 != r3) goto L79
            if (r2 == r1) goto L79
            r1 = 40
            if (r2 == r1) goto L79
            r1 = 91
            if (r2 == r1) goto L79
            r1 = 93
            if (r2 == r1) goto L79
            r1 = 41
            if (r2 == r1) goto L79
            r1 = 58
            if (r2 == r1) goto L79
            r1 = 44
            if (r2 == r1) goto L79
            goto L7f
        L79:
            r10.f9192 = r0
            r10.f9191 = r2
            r10 = 1
            return r10
        L7f:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6090():boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x004b -> B:20:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:24:0x003a
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final boolean mo6091(char r6, char r7, char r8, char r9, char r10, char r11) {
        /*
            r5 = this;
            char r0 = r5.f9191
            if (r0 == r6) goto L6
            goto L7a
        L6:
            int r6 = r5.f9192
            int r0 = r6 + 5
            int r1 = r5.f9210
            if (r0 > r1) goto L7a
            char[] r2 = r5.f9211
            char r3 = r2[r6]
            if (r3 != r7) goto L7a
            int r7 = r6 + 1
            char r7 = r2[r7]
            if (r7 != r8) goto L7a
            int r7 = r6 + 2
            char r7 = r2[r7]
            if (r7 != r9) goto L7a
            int r7 = r6 + 3
            char r7 = r2[r7]
            if (r7 != r10) goto L7a
            int r7 = r6 + 4
            char r7 = r2[r7]
            if (r7 == r11) goto L2d
            goto L7a
        L2d:
            r7 = 26
            if (r0 != r1) goto L33
        L31:
            r8 = r7
            goto L38
        L33:
            int r6 = r6 + 6
            char r8 = r2[r0]
        L37:
            r0 = r6
        L38:
            r6 = 32
            if (r8 > r6) goto L53
            r9 = 1
            long r9 = r9 << r8
            r3 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r9 = r9 & r3
            r3 = 0
            int r6 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r6 == 0) goto L53
            if (r0 != r1) goto L4e
            goto L31
        L4e:
            int r6 = r0 + 1
            char r8 = r2[r0]
            goto L37
        L53:
            int r6 = r5.f9192
            int r6 = r6 + 6
            if (r0 != r6) goto L74
            if (r8 == r7) goto L74
            r6 = 40
            if (r8 == r6) goto L74
            r6 = 91
            if (r8 == r6) goto L74
            r6 = 93
            if (r8 == r6) goto L74
            r6 = 41
            if (r8 == r6) goto L74
            r6 = 58
            if (r8 == r6) goto L74
            r6 = 44
            if (r8 == r6) goto L74
            goto L7a
        L74:
            r5.f9192 = r0
            r5.f9191 = r8
            r5 = 1
            return r5
        L7a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6091(char, char, char, char, char, char):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0013, code lost:
    
        if (r4 != r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo6095() {
        /*
            r10 = this;
            char r0 = r10.f9191
            r1 = 91
            if (r0 == r1) goto L8
            r10 = 0
            return r10
        L8:
            int r0 = r10.f9192
            r1 = 26
            int r2 = r10.f9210
            char[] r3 = r10.f9211
            if (r0 != r2) goto L15
            r4 = r0
        L13:
            r0 = r1
            goto L19
        L15:
            int r4 = r0 + 1
            char r0 = r3[r0]
        L19:
            if (r0 == 0) goto L3c
            r5 = 32
            if (r0 > r5) goto L2f
            r5 = 1
            long r5 = r5 << r0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L2f
            goto L3c
        L2f:
            r10.f9191 = r0
            r10.f9192 = r4
            r1 = 47
            if (r0 != r1) goto L3a
            r10.mo6190()
        L3a:
            r10 = 1
            return r10
        L3c:
            if (r4 != r2) goto L3f
            goto L13
        L3f:
            int r0 = r4 + 1
            char r4 = r3[r4]
            r9 = r4
            r4 = r0
            r0 = r9
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6095():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0015, code lost:
    
        if (r5 != r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo6096() {
        /*
            r18 = this;
            r0 = r18
            char r1 = r0.f9191
            r2 = 93
            if (r1 == r2) goto La
            r0 = 0
            return r0
        La:
            int r1 = r0.f9192
            r2 = 26
            int r3 = r0.f9210
            char[] r4 = r0.f9211
            if (r1 != r3) goto L17
            r5 = r1
        L15:
            r1 = r2
            goto L1b
        L17:
            int r5 = r1 + 1
            char r1 = r4[r1]
        L1b:
            if (r1 == 0) goto L67
            r6 = 0
            r8 = 4294981376(0x100003700, double:2.1220027474E-314)
            r10 = 1
            r12 = 32
            if (r1 > r12) goto L32
            long r13 = r10 << r1
            long r13 = r13 & r8
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 == 0) goto L32
            goto L67
        L32:
            r13 = 44
            r14 = 1
            if (r1 != r13) goto L5b
            r0.f9195 = r14
            if (r5 != r3) goto L3e
            r1 = r5
            r5 = r2
            goto L42
        L3e:
            int r1 = r5 + 1
            char r5 = r4[r5]
        L42:
            r17 = r5
            r5 = r1
            r1 = r17
        L47:
            if (r1 == 0) goto L52
            if (r1 > r12) goto L5b
            long r15 = r10 << r1
            long r15 = r15 & r8
            int r13 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r13 == 0) goto L5b
        L52:
            if (r5 != r3) goto L56
            r1 = r2
            goto L47
        L56:
            int r1 = r5 + 1
            char r5 = r4[r5]
            goto L42
        L5b:
            r0.f9191 = r1
            r0.f9192 = r5
            r2 = 47
            if (r1 != r2) goto L66
            r0.mo6190()
        L66:
            return r14
        L67:
            if (r5 != r3) goto L6a
            goto L15
        L6a:
            int r1 = r5 + 1
            char r5 = r4[r5]
            r17 = r5
            r5 = r1
            r1 = r17
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6096():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo6098(char r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.f9192
            char r2 = r0.f9191
        L6:
            r3 = 0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            r7 = 1
            r9 = 32
            r10 = 26
            int r11 = r0.f9210
            char[] r12 = r0.f9211
            if (r2 > r9) goto L2c
            long r13 = r7 << r2
            long r13 = r13 & r5
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 == 0) goto L2c
            if (r1 != r11) goto L24
            r2 = r10
            goto L6
        L24:
            int r2 = r1 + 1
            char r1 = r12[r1]
            r15 = r2
            r2 = r1
            r1 = r15
            goto L6
        L2c:
            r13 = r17
            if (r2 == r13) goto L32
            r0 = 0
            return r0
        L32:
            if (r1 != r11) goto L37
            r2 = r1
        L35:
            r1 = r10
            goto L3b
        L37:
            int r2 = r1 + 1
            char r1 = r12[r1]
        L3b:
            if (r1 == 0) goto L54
            if (r1 > r9) goto L47
            long r13 = r7 << r1
            long r13 = r13 & r5
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 == 0) goto L47
            goto L54
        L47:
            r0.f9192 = r2
            r0.f9191 = r1
            r2 = 47
            r3 = 1
            if (r1 != r2) goto L53
            r0.mo6190()
        L53:
            return r3
        L54:
            if (r2 != r11) goto L57
            goto L35
        L57:
            int r1 = r2 + 1
            char r2 = r12[r2]
            r15 = r2
            r2 = r1
            r1 = r15
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6098(char):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo6099() {
        /*
            r15 = this;
            int r0 = r15.f9192
            char r1 = r15.f9191
        L4:
            r2 = 0
            r4 = 4294981376(0x100003700, double:2.1220027474E-314)
            r6 = 1
            r8 = 32
            r9 = 26
            int r10 = r15.f9210
            char[] r11 = r15.f9211
            if (r1 > r8) goto L2a
            long r12 = r6 << r1
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L2a
            if (r0 != r10) goto L22
            r1 = r9
            goto L4
        L22:
            int r1 = r0 + 1
            char r0 = r11[r0]
            r14 = r1
            r1 = r0
            r0 = r14
            goto L4
        L2a:
            r12 = 44
            if (r1 == r12) goto L34
            r15.f9192 = r0
            r15.f9191 = r1
            r15 = 0
            return r15
        L34:
            if (r0 != r10) goto L39
            r1 = r0
        L37:
            r0 = r9
            goto L3d
        L39:
            int r1 = r0 + 1
            char r0 = r11[r0]
        L3d:
            if (r0 == 0) goto L56
            if (r0 > r8) goto L49
            long r12 = r6 << r0
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L49
            goto L56
        L49:
            r15.f9192 = r1
            r15.f9191 = r0
            r1 = 47
            if (r0 != r1) goto L54
            r15.mo6190()
        L54:
            r15 = 1
            return r15
        L56:
            if (r1 != r10) goto L59
            goto L37
        L59:
            int r0 = r1 + 1
            char r1 = r11[r1]
            r14 = r1
            r1 = r0
            r0 = r14
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6099():boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0060 -> B:23:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:26:0x004f
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final boolean mo6100() {
        /*
            r10 = this;
            int r0 = r10.f9192
            char r1 = r10.f9191
            r2 = 73
            if (r1 != r2) goto L71
            int r1 = r0 + 6
            int r2 = r10.f9210
            if (r1 >= r2) goto L71
            char[] r3 = r10.f9211
            char r4 = r3[r0]
            r5 = 110(0x6e, float:1.54E-43)
            if (r4 != r5) goto L71
            int r4 = r0 + 1
            char r4 = r3[r4]
            r6 = 102(0x66, float:1.43E-43)
            if (r4 != r6) goto L71
            int r4 = r0 + 2
            char r4 = r3[r4]
            r6 = 105(0x69, float:1.47E-43)
            if (r4 != r6) goto L71
            int r4 = r0 + 3
            char r4 = r3[r4]
            if (r4 != r5) goto L71
            int r4 = r0 + 4
            char r4 = r3[r4]
            if (r4 != r6) goto L71
            int r4 = r0 + 5
            char r4 = r3[r4]
            r5 = 116(0x74, float:1.63E-43)
            if (r4 != r5) goto L71
            char r1 = r3[r1]
            r4 = 121(0x79, float:1.7E-43)
            if (r1 != r4) goto L71
            int r1 = r0 + 7
            r4 = 26
            if (r1 != r2) goto L49
            r0 = r1
        L47:
            r1 = r4
            goto L4d
        L49:
            int r0 = r0 + 8
            char r1 = r3[r1]
        L4d:
            r5 = 32
            if (r1 > r5) goto L6b
            r5 = 1
            long r5 = r5 << r1
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L6b
            if (r0 != r2) goto L63
            goto L47
        L63:
            int r1 = r0 + 1
            char r0 = r3[r0]
            r9 = r1
            r1 = r0
            r0 = r9
            goto L4d
        L6b:
            r10.f9192 = r0
            r10.f9191 = r1
            r10 = 1
            return r10
        L71:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6100():boolean");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003c -> B:13:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:16:0x002b
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final boolean mo6101() {
        /*
            r10 = this;
            int r0 = r10.f9192
            char r1 = r10.f9191
            r2 = 83
            if (r1 != r2) goto L4d
            int r1 = r0 + 1
            int r2 = r10.f9210
            if (r1 >= r2) goto L4d
            char[] r3 = r10.f9211
            char r4 = r3[r0]
            r5 = 101(0x65, float:1.42E-43)
            if (r4 != r5) goto L4d
            char r1 = r3[r1]
            r4 = 116(0x74, float:1.63E-43)
            if (r1 != r4) goto L4d
            int r1 = r0 + 2
            r4 = 26
            if (r1 != r2) goto L25
            r0 = r1
        L23:
            r1 = r4
            goto L29
        L25:
            int r0 = r0 + 3
            char r1 = r3[r1]
        L29:
            r5 = 32
            if (r1 > r5) goto L47
            r5 = 1
            long r5 = r5 << r1
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L47
            if (r0 != r2) goto L3f
            goto L23
        L3f:
            int r1 = r0 + 1
            char r0 = r3[r0]
            r9 = r1
            r1 = r0
            r0 = r9
            goto L29
        L47:
            r10.f9192 = r0
            r10.f9191 = r1
            r10 = 1
            return r10
        L4d:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6101():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0013, code lost:
    
        if (r4 != r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo6102() {
        /*
            r10 = this;
            char r0 = r10.f9191
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L8
            r10 = 0
            return r10
        L8:
            int r0 = r10.f9192
            r1 = 26
            int r2 = r10.f9210
            char[] r3 = r10.f9211
            if (r0 != r2) goto L15
            r4 = r0
        L13:
            r0 = r1
            goto L19
        L15:
            int r4 = r0 + 1
            char r0 = r3[r0]
        L19:
            if (r0 == 0) goto L3c
            r5 = 32
            if (r0 > r5) goto L2f
            r5 = 1
            long r5 = r5 << r0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L2f
            goto L3c
        L2f:
            r10.f9191 = r0
            r10.f9192 = r4
            r1 = 47
            if (r0 != r1) goto L3a
            r10.mo6190()
        L3a:
            r10 = 1
            return r10
        L3c:
            if (r4 != r2) goto L3f
            goto L13
        L3f:
            int r0 = r4 + 1
            char r4 = r3[r4]
            r9 = r4
            r4 = r0
            r0 = r9
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6102():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6104() {
        /*
            r10 = this;
            int r0 = r10.f9192
            r1 = 26
            char[] r2 = r10.f9211
            int r3 = r10.f9210
            if (r0 < r3) goto Ld
            r4 = r0
        Lb:
            r0 = r1
            goto L11
        Ld:
            int r4 = r0 + 1
            char r0 = r2[r0]
        L11:
            if (r0 == 0) goto L2c
            r5 = 32
            if (r0 > r5) goto L27
            r5 = 1
            long r5 = r5 << r0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L27
            goto L2c
        L27:
            r10.f9192 = r4
            r10.f9191 = r0
            return
        L2c:
            if (r4 != r3) goto L2f
            goto Lb
        L2f:
            int r0 = r4 + 1
            char r4 = r2[r4]
            r9 = r4
            r4 = r0
            r0 = r9
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6104():void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x006c -> B:31:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:34:0x0063
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
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final boolean mo6105() {
        /*
            r18 = this;
            r0 = r18
            char r1 = r0.f9191
            int r2 = r0.f9192
            r3 = 110(0x6e, float:1.54E-43)
            r4 = 0
            r5 = 1
            int r6 = r0.f9210
            char[] r7 = r0.f9211
            if (r1 != r3) goto L29
            int r3 = r2 + 2
            if (r3 >= r6) goto L29
            char r8 = r7[r2]
            r9 = 117(0x75, float:1.64E-43)
            if (r8 != r9) goto L29
            int r8 = r2 + 1
            char r8 = r7[r8]
            r9 = 108(0x6c, float:1.51E-43)
            if (r8 != r9) goto L29
            char r3 = r7[r3]
            if (r3 != r9) goto L29
            int r2 = r2 + 3
            goto L4d
        L29:
            r3 = 34
            if (r1 == r3) goto L31
            r3 = 39
            if (r1 != r3) goto La5
        L31:
            if (r2 >= r6) goto L39
            char r3 = r7[r2]
            if (r3 != r1) goto L39
            int r2 = r2 + r5
            goto L4d
        L39:
            int r3 = r2 + 4
            if (r3 >= r6) goto La5
            long r8 = com.alibaba.fastjson2.util.AbstractC2848.m5684(r2, r7)
            long r10 = com.alibaba.fastjson2.util.AbstractC2848.f8876
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto La5
            char r3 = r7[r3]
            if (r3 != r1) goto La5
            int r2 = r2 + 5
        L4d:
            r1 = 26
            if (r2 != r6) goto L54
            r3 = r2
        L52:
            r2 = r1
            goto L58
        L54:
            int r3 = r2 + 1
            char r2 = r7[r2]
        L58:
            r8 = 0
            r10 = 4294981376(0x100003700, double:2.1220027474E-314)
            r12 = 1
            r14 = 32
            if (r2 > r14) goto L79
            long r15 = r12 << r2
            long r15 = r15 & r10
            int r15 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r15 == 0) goto L79
            if (r3 != r6) goto L6f
            goto L52
        L6f:
            int r2 = r3 + 1
            char r3 = r7[r3]
            r17 = r3
            r3 = r2
            r2 = r17
            goto L58
        L79:
            r15 = 44
            if (r2 != r15) goto L7e
            r4 = r5
        L7e:
            r0.f9195 = r4
            if (r4 == 0) goto L8f
            if (r3 != r6) goto L86
        L84:
            r2 = r1
            goto L8f
        L86:
            int r2 = r3 + 1
            char r3 = r7[r3]
        L8a:
            r17 = r3
            r3 = r2
            r2 = r17
        L8f:
            if (r2 > r14) goto La0
            long r15 = r12 << r2
            long r15 = r15 & r10
            int r4 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r4 == 0) goto La0
            if (r3 != r6) goto L9b
            goto L84
        L9b:
            int r2 = r3 + 1
            char r3 = r7[r3]
            goto L8a
        La0:
            r0.f9192 = r3
            r0.f9191 = r2
            return r5
        La5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6105():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0015, code lost:
    
        if (r5 != r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo6106() {
        /*
            r18 = this;
            r0 = r18
            char r1 = r0.f9191
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto La
            r0 = 0
            return r0
        La:
            int r1 = r0.f9192
            r2 = 26
            int r3 = r0.f9210
            char[] r4 = r0.f9211
            if (r1 != r3) goto L17
            r5 = r1
        L15:
            r1 = r2
            goto L1b
        L17:
            int r5 = r1 + 1
            char r1 = r4[r1]
        L1b:
            if (r1 == 0) goto L67
            r6 = 0
            r8 = 4294981376(0x100003700, double:2.1220027474E-314)
            r10 = 1
            r12 = 32
            if (r1 > r12) goto L32
            long r13 = r10 << r1
            long r13 = r13 & r8
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 == 0) goto L32
            goto L67
        L32:
            r13 = 44
            r14 = 1
            if (r1 != r13) goto L5b
            r0.f9195 = r14
            if (r5 != r3) goto L3e
            r1 = r5
            r5 = r2
            goto L42
        L3e:
            int r1 = r5 + 1
            char r5 = r4[r5]
        L42:
            r17 = r5
            r5 = r1
            r1 = r17
        L47:
            if (r1 == 0) goto L52
            if (r1 > r12) goto L5b
            long r15 = r10 << r1
            long r15 = r15 & r8
            int r13 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r13 == 0) goto L5b
        L52:
            if (r5 != r3) goto L56
            r1 = r2
            goto L47
        L56:
            int r1 = r5 + 1
            char r5 = r4[r5]
            goto L42
        L5b:
            r0.f9191 = r1
            r0.f9192 = r5
            r2 = 47
            if (r1 != r2) goto L66
            r0.mo6190()
        L66:
            return r14
        L67:
            if (r5 != r3) goto L6a
            goto L15
        L6a:
            int r1 = r5 + 1
            char r5 = r4[r5]
            r17 = r5
            r5 = r1
            r1 = r17
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6106():boolean");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    public final String mo6124(String str) {
        char[] cArr;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = (i2 < this.f9192) & (i2 < this.f9210);
            cArr = this.f9211;
            if (!z) {
                break;
            }
            if (cArr[i2] == '\n') {
                i++;
                i3 = 0;
            }
            i2++;
            i3++;
        }
        StringBuilder sb = new StringBuilder();
        if (str != null && !str.isEmpty()) {
            sb.append(str);
            sb.append(", ");
        }
        sb.append("offset ");
        sb.append(this.f9192);
        sb.append(", character ");
        sb.append(this.f9191);
        sb.append(", line ");
        sb.append(i);
        sb.append(", column ");
        sb.append(i3);
        sb.append(", fastjson-version 2.0.60");
        sb.append(i <= 1 ? ' ' : '\n');
        sb.append(cArr, 0, Math.min(this.f9209, Opcodes.MAX_VALUE));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x000b, code lost:
    
        if (r4 != r3) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6127() {
        /*
            r10 = this;
            int r0 = r10.f9192
            r1 = 26
            char[] r2 = r10.f9211
            int r3 = r10.f9210
            if (r0 < r3) goto Ld
            r4 = r0
        Lb:
            r0 = r1
            goto L11
        Ld:
            int r4 = r0 + 1
            char r0 = r2[r0]
        L11:
            if (r0 == 0) goto L33
            r5 = 32
            if (r0 > r5) goto L27
            r5 = 1
            long r5 = r5 << r0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L27
            goto L33
        L27:
            r10.f9192 = r4
            r10.f9191 = r0
            r1 = 47
            if (r0 != r1) goto L32
            r10.mo6190()
        L32:
            return
        L33:
            if (r4 != r3) goto L36
            goto Lb
        L36:
            int r0 = r4 + 1
            char r4 = r2[r4]
            r9 = r4
            r4 = r0
            r0 = r9
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6127():void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final boolean mo6134() {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        if ((this.f9199.f9318 & 8589934592L) != 0 || this.f9191 != '{' || (i = this.f9192) == (i2 = this.f9210)) {
            return false;
        }
        char[] cArr = this.f9211;
        char c2 = cArr[i];
        while (c2 <= ' ' && ((1 << c2) & 4294981376L) != 0) {
            i++;
            if (i >= i2) {
                return false;
            }
            c2 = cArr[i];
        }
        int i5 = i + 6;
        if (i5 >= i2 || cArr[i + 1] != '$') {
            return false;
        }
        if (cArr[i + 2] != 'r' || cArr[i + 3] != 'e' || cArr[i + 4] != 'f' || cArr[i + 5] != c2) {
            return false;
        }
        char c3 = cArr[i5];
        while (c3 <= ' ' && ((1 << c3) & 4294981376L) != 0) {
            i5++;
            if (i5 >= i2) {
                break;
            }
            c3 = cArr[i5];
        }
        if (c3 == ':' && (i3 = i5 + 1) < i2) {
            char c4 = cArr[i3];
            while (c4 <= ' ' && ((1 << c4) & 4294981376L) != 0) {
                i3++;
                if (i3 >= i2) {
                    break;
                }
                c4 = cArr[i3];
            }
            if (c4 == c2 && ((i4 = i3 + 1) >= i2 || (c = cArr[i4]) == '$' || c == '.' || c == '@')) {
                this.f9207 = i3;
                return true;
            }
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final int mo6136() {
        char c = this.f9191;
        int i = 0;
        if (c != '\"' && c != '\'') {
            C0276.m849("string length only support string input");
            return 0;
        }
        int i2 = this.f9192;
        int i3 = i2 + 8;
        int i4 = this.f9210;
        char[] cArr = this.f9211;
        if (i3 < i4 && i3 < cArr.length && cArr[i2] != c && cArr[i2 + 1] != c && cArr[i2 + 2] != c && cArr[i2 + 3] != c && cArr[i2 + 4] != c && cArr[i2 + 5] != c && cArr[i2 + 6] != c && cArr[i2 + 7] != c) {
            i = 8;
            i2 = i3;
        }
        while (i2 < i4 && cArr[i2] != c) {
            i2++;
            i++;
        }
        return i;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x015d -> B:91:0x0146). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:94:0x0154
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
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
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世兰哲子苏 */
    public final java.lang.String mo6139() {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6139():java.lang.String");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0041 -> B:14:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:17:0x0038
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
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世兰子哲苏 */
    public final java.lang.String mo6141() {
        /*
            r17 = this;
            r0 = r17
            char r1 = r0.f9191
            r2 = 47
            if (r1 != r2) goto L7e
            int r1 = r0.f9192
            r3 = r1
        Lb:
            int r4 = r0.f9210
            char[] r5 = r0.f9211
            if (r3 >= r4) goto L19
            char r6 = r5[r3]
            if (r6 != r2) goto L16
            goto L19
        L16:
            int r3 = r3 + 1
            goto Lb
        L19:
            java.lang.String r2 = new java.lang.String
            int r6 = r3 - r1
            r2.<init>(r5, r1, r6)
            int r1 = r3 + 1
            r6 = 26
            if (r1 != r4) goto L29
            r3 = r1
        L27:
            r1 = r6
            goto L2d
        L29:
            int r3 = r3 + 2
            char r1 = r5[r1]
        L2d:
            r7 = 0
            r9 = 4294981376(0x100003700, double:2.1220027474E-314)
            r11 = 1
            r13 = 32
            if (r1 > r13) goto L4e
            long r14 = r11 << r1
            long r14 = r14 & r9
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 == 0) goto L4e
            if (r3 != r4) goto L44
            goto L27
        L44:
            int r1 = r3 + 1
            char r3 = r5[r3]
            r16 = r3
            r3 = r1
            r1 = r16
            goto L2d
        L4e:
            r14 = 44
            if (r1 != r14) goto L54
            r14 = 1
            goto L55
        L54:
            r14 = 0
        L55:
            r0.f9195 = r14
            if (r14 == 0) goto L79
            if (r3 != r4) goto L5e
            r1 = r3
            r3 = r6
            goto L62
        L5e:
            int r1 = r3 + 1
            char r3 = r5[r3]
        L62:
            r16 = r3
            r3 = r1
            r1 = r16
        L67:
            if (r1 > r13) goto L79
            long r14 = r11 << r1
            long r14 = r14 & r9
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 == 0) goto L79
            if (r3 != r4) goto L74
            r1 = r6
            goto L67
        L74:
            int r1 = r3 + 1
            char r3 = r5[r3]
            goto L62
        L79:
            r0.f9192 = r3
            r0.f9191 = r1
            return r2
        L7e:
            java.lang.String r0 = "illegal pattern"
            androidx.collection.C0276.m849(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6141():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        r8 = 0;
     */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世兰子苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.time.OffsetTime mo6142() {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6142():java.time.OffsetTime");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0056 -> B:16:0x0046). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x007b -> B:32:0x006b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:19:0x004d
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世兰苏子哲 */
    public final java.lang.String mo6144() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f9207
            r2 = 0
            int r3 = r0.f9210
            if (r1 != r3) goto La
            return r2
        La:
            int r4 = r1 + 1
            r0.f9192 = r4
            char[] r4 = r0.f9211
            char r1 = r4[r1]
            r0.f9191 = r1
            java.lang.String r1 = r0.mo6139()
            char r5 = r0.f9191
            int r6 = r0.f9192
        L1c:
            r7 = 0
            r9 = 4294981376(0x100003700, double:2.1220027474E-314)
            r11 = 1
            r13 = 32
            r14 = 26
            if (r5 > r13) goto L40
            long r15 = r11 << r5
            long r15 = r15 & r9
            int r15 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r15 == 0) goto L40
            if (r6 != r3) goto L36
            r5 = r14
            goto L1c
        L36:
            int r5 = r6 + 1
            char r6 = r4[r6]
            r17 = r6
            r6 = r5
            r5 = r17
            goto L1c
        L40:
            r15 = 125(0x7d, float:1.75E-43)
            if (r5 != r15) goto L88
            if (r6 != r3) goto L48
        L46:
            r5 = r14
            goto L4d
        L48:
            int r2 = r6 + 1
            char r5 = r4[r6]
        L4c:
            r6 = r2
        L4d:
            if (r5 > r13) goto L5e
            long r15 = r11 << r5
            long r15 = r15 & r9
            int r2 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r2 == 0) goto L5e
            if (r6 != r3) goto L59
            goto L46
        L59:
            int r2 = r6 + 1
            char r5 = r4[r6]
            goto L4c
        L5e:
            r2 = 44
            if (r5 != r2) goto L64
            r2 = 1
            goto L65
        L64:
            r2 = 0
        L65:
            r0.f9195 = r2
            if (r2 == 0) goto L83
            if (r6 != r3) goto L6d
        L6b:
            r5 = r14
            goto L72
        L6d:
            int r2 = r6 + 1
            char r5 = r4[r6]
        L71:
            r6 = r2
        L72:
            if (r5 > r13) goto L83
            long r15 = r11 << r5
            long r15 = r15 & r9
            int r2 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r2 == 0) goto L83
            if (r6 != r3) goto L7e
            goto L6b
        L7e:
            int r2 = r6 + 1
            char r5 = r4[r6]
            goto L71
        L83:
            r0.f9191 = r5
            r0.f9192 = r6
            return r1
        L88:
            java.lang.String r0 = "illegal reference : "
            java.lang.String r0 = r0.concat(r1)
            androidx.collection.C0276.m849(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6144():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世哲兰苏子 */
    public final OffsetDateTime mo6146() {
        int i;
        char c;
        int i2;
        char c2;
        int i3 = this.f9192;
        char c3 = this.f9191;
        if (c3 == '\"' || c3 == '\'') {
            this.f9199.getClass();
            int i4 = i3 + 19;
            char[] cArr = this.f9211;
            if (i4 < cArr.length && i4 < (i = this.f9210) && cArr[i3 + 4] == '-' && cArr[i3 + 7] == '-' && (((c = cArr[i3 + 10]) == ' ' || c == 'T') && cArr[i3 + 13] == ':' && cArr[i3 + 16] == ':')) {
                int iM5694 = AbstractC2848.m5694(i3, cArr);
                int iM5676 = AbstractC2848.m5676(i3 + 5, cArr);
                int iM56762 = AbstractC2848.m5676(i3 + 8, cArr);
                int iM56763 = AbstractC2848.m5676(i3 + 11, cArr);
                int iM56764 = AbstractC2848.m5676(i3 + 14, cArr);
                int iM56765 = AbstractC2848.m5676(i3 + 17, cArr);
                if ((iM5694 | iM5676 | iM56762 | iM56764 | iM56765) < 0) {
                    ZonedDateTime zonedDateTimeMo6196 = mo6196();
                    if (zonedDateTimeMo6196 == null) {
                        return null;
                    }
                    return zonedDateTimeMo6196.toOffsetDateTime();
                }
                int i5 = i3 + 20;
                char c4 = cArr[i4];
                if (c4 == '.') {
                    c4 = cArr[i5];
                    i5 = i3 + 21;
                }
                int i6 = 0;
                int i7 = 0;
                while (c4 >= '0' && c4 <= '9') {
                    i6 = (i6 * 10) + (c4 - '0');
                    i7++;
                    if (i5 >= i) {
                        break;
                    }
                    int i8 = i5 + 1;
                    char c5 = cArr[i5];
                    i5 = i8;
                    c4 = c5;
                }
                if (i7 != 0) {
                    i6 *= AbstractC2865.f9028[(9 - i7) & 15];
                }
                ZoneOffset zoneOffsetOf = ZoneOffset.UTC;
                if (c4 == 'Z') {
                    c4 = cArr[i5];
                    i2 = i6;
                    i5++;
                } else if (c4 != c3) {
                    int i9 = i5;
                    while (true) {
                        if (i9 >= i) {
                            i2 = i6;
                            i9 = -1;
                            break;
                        }
                        i2 = i6;
                        if (cArr[i9] == '\"') {
                            break;
                        }
                        i9++;
                        i6 = i2;
                    }
                    if (i9 != -1) {
                        ZoneId zoneId = AbstractC2865.f9025;
                        zoneOffsetOf = ZoneOffset.of(new String(cArr, i5 - 1, (i9 - i5) + 1));
                        i5 = i9 + 1;
                        c4 = c3;
                    }
                } else {
                    i2 = i6;
                }
                if (c4 == c3) {
                    if (i5 >= i) {
                        c2 = 26;
                    } else {
                        c2 = cArr[i5];
                        i5++;
                    }
                    while (true) {
                        if (c2 != 0 && (c2 > ' ' || ((1 << c2) & 4294981376L) == 0)) {
                            break;
                        }
                        ZoneOffset zoneOffset = zoneOffsetOf;
                        if (i5 == i) {
                            c2 = 26;
                        } else {
                            char c6 = cArr[i5];
                            i5++;
                            c2 = c6;
                        }
                        zoneOffsetOf = zoneOffset;
                    }
                    boolean z = c2 == ',';
                    this.f9195 = z;
                    if (z) {
                        if (i5 == i) {
                            c2 = 26;
                        } else {
                            c2 = cArr[i5];
                            i5++;
                        }
                        while (c2 <= ' ' && ((1 << c2) & 4294981376L) != 0) {
                            if (i5 == i) {
                                c2 = 26;
                            } else {
                                char c7 = cArr[i5];
                                i5++;
                                c2 = c7;
                            }
                        }
                    }
                    this.f9192 = i5;
                    this.f9191 = c2;
                    return OffsetDateTime.of(iM5694, iM5676, iM56762, iM56763, iM56764, iM56765, i2, zoneOffsetOf);
                }
            }
        }
        ZonedDateTime zonedDateTimeMo61962 = mo6196();
        if (zonedDateTimeMo61962 == null) {
            return null;
        }
        return zonedDateTimeMo61962.toOffsetDateTime();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0097 -> B:43:0x008a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:45:0x008e
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世哲子苏兰 */
    public final java.util.Date mo6148() {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6148():java.util.Date");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:12:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:14:0x0046
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
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世哲苏子兰 */
    public final void mo6150() {
        /*
            Method dump skipped, instruction units count: 1396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6150():void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世子兰哲苏 */
    public final LocalTime mo6151() {
        int iM5676;
        int i;
        int iM5678;
        int iM56782;
        LocalTime localTimeM5834;
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("localTime only support string input");
            return null;
        }
        int i2 = this.f9192;
        ZoneId zoneId = AbstractC2865.f9025;
        int i3 = i2 + 5;
        char[] cArr = this.f9211;
        if (i3 > cArr.length) {
            localTimeM5834 = null;
        } else {
            int i4 = i2 + 2;
            char c2 = cArr[i4];
            char c3 = cArr[i2 + 4];
            if (cArr[i2 + 1] == ':' && c3 == ':') {
                iM56782 = AbstractC2848.m5678(i2, cArr);
                iM5676 = AbstractC2848.m5676(i4, cArr);
                iM5678 = AbstractC2848.m5676(i3, cArr);
            } else {
                if (c2 == ':' && c3 == ':') {
                    int iM56762 = AbstractC2848.m5676(i2, cArr);
                    int iM56783 = AbstractC2848.m5678(i2 + 3, cArr);
                    iM5678 = AbstractC2848.m5676(i3, cArr);
                    i = iM56762;
                    iM5676 = iM56783;
                } else {
                    if (c2 == ':' && cArr[i3] == ':') {
                        int iM56763 = AbstractC2848.m5676(i2, cArr);
                        iM5676 = AbstractC2848.m5676(i2 + 3, cArr);
                        i = iM56763;
                        iM5678 = AbstractC2848.m5678(i2 + 6, cArr);
                    }
                    localTimeM5834 = null;
                }
                iM56782 = i;
            }
            localTimeM5834 = AbstractC2865.m5834(iM56782, iM5676, iM5678);
        }
        if (localTimeM5834 == null) {
            return null;
        }
        this.f9192 += 8;
        mo6127();
        boolean z = this.f9191 == ',';
        this.f9195 = z;
        if (z) {
            mo6127();
        }
        return localTimeM5834;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲 */
    public final LocalTime mo6152() {
        int iM5678;
        int iM56782;
        int iM5676;
        LocalTime localTimeM5834;
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("localTime only support string input");
            return null;
        }
        int i = this.f9192;
        ZoneId zoneId = AbstractC2865.f9025;
        int i2 = i + 5;
        char[] cArr = this.f9211;
        if (i2 > cArr.length) {
            localTimeM5834 = null;
        } else {
            char c2 = cArr[i + 1];
            int i3 = i + 4;
            char c3 = cArr[i3];
            int i4 = i + 2;
            if (cArr[i4] == ':' && c3 == ':') {
                iM5678 = AbstractC2848.m5676(i, cArr);
                iM56782 = AbstractC2848.m5678(i + 3, cArr);
                iM5676 = AbstractC2848.m5678(i2, cArr);
            } else if (c2 == ':' && c3 == ':') {
                iM5678 = AbstractC2848.m5678(i, cArr);
                iM56782 = AbstractC2848.m5676(i4, cArr);
                iM5676 = AbstractC2848.m5678(i2, cArr);
            } else {
                if (c2 == ':' && cArr[i + 3] == ':') {
                    iM5678 = AbstractC2848.m5678(i, cArr);
                    iM56782 = AbstractC2848.m5678(i4, cArr);
                    iM5676 = AbstractC2848.m5676(i3, cArr);
                }
                localTimeM5834 = null;
            }
            localTimeM5834 = AbstractC2865.m5834(iM5678, iM56782, iM5676);
        }
        if (localTimeM5834 == null) {
            return null;
        }
        this.f9192 += 7;
        mo6127();
        boolean z = this.f9191 == ',';
        this.f9195 = z;
        if (z) {
            mo6127();
        }
        return localTimeM5834;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏 */
    public final LocalTime mo6153() {
        int iM5678;
        int iM56782;
        int iM5676;
        LocalTime localTimeM5834;
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("localTime only support string input");
            return null;
        }
        int i = this.f9192;
        ZoneId zoneId = AbstractC2865.f9025;
        int i2 = i + 5;
        char[] cArr = this.f9211;
        if (i2 > cArr.length) {
            localTimeM5834 = null;
        } else {
            int i3 = i + 2;
            if (cArr[i3] == ':') {
                int iM56762 = AbstractC2848.m5676(i, cArr);
                iM5676 = AbstractC2848.m5676(i + 3, cArr);
                iM5678 = iM56762;
                iM56782 = 0;
            } else {
                if (cArr[i + 1] == ':' && cArr[i + 3] == ':') {
                    iM5678 = AbstractC2848.m5678(i, cArr);
                    int iM56783 = AbstractC2848.m5678(i3, cArr);
                    iM56782 = AbstractC2848.m5678(i + 4, cArr);
                    iM5676 = iM56783;
                }
                localTimeM5834 = null;
            }
            localTimeM5834 = AbstractC2865.m5834(iM5678, iM5676, iM56782);
        }
        if (localTimeM5834 == null) {
            return null;
        }
        this.f9192 += 6;
        mo6127();
        boolean z = this.f9191 == ',';
        this.f9195 = z;
        if (z) {
            mo6127();
        }
        return localTimeM5834;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.time.LocalTime mo6154() {
        /*
            r7 = this;
            char r0 = r7.f9191
            r1 = 34
            r2 = 0
            if (r0 == r1) goto L12
            r1 = 39
            if (r0 != r1) goto Lc
            goto L12
        Lc:
            java.lang.String r7 = "localTime only support string input"
            androidx.collection.C0276.m849(r7)
            return r2
        L12:
            int r0 = r7.f9192
            java.time.ZoneId r1 = com.alibaba.fastjson2.util.AbstractC2865.f9025
            int r1 = r0 + 18
            char[] r3 = r7.f9211
            int r4 = r3.length
            if (r1 > r4) goto L51
            int r1 = r0 + 2
            char r1 = r3[r1]
            r4 = 58
            if (r1 != r4) goto L51
            int r1 = r0 + 5
            char r1 = r3[r1]
            if (r1 != r4) goto L51
            int r1 = r0 + 8
            char r1 = r3[r1]
            r4 = 46
            if (r1 == r4) goto L34
            goto L51
        L34:
            int r1 = com.alibaba.fastjson2.util.AbstractC2848.m5676(r0, r3)
            int r4 = r0 + 3
            int r4 = com.alibaba.fastjson2.util.AbstractC2848.m5676(r4, r3)
            int r5 = r0 + 6
            int r5 = com.alibaba.fastjson2.util.AbstractC2848.m5676(r5, r3)
            r6 = 9
            int r0 = r0 + r6
            int r0 = com.alibaba.fastjson2.util.AbstractC2865.m5846(r6, r0, r3)
            r3 = r1 | r4
            r3 = r3 | r5
            r3 = r3 | r0
            if (r3 >= 0) goto L53
        L51:
            r0 = r2
            goto L57
        L53:
            java.time.LocalTime r0 = java.time.LocalTime.of(r1, r4, r5, r0)
        L57:
            if (r0 != 0) goto L5a
            return r2
        L5a:
            int r1 = r7.f9192
            int r1 = r1 + 19
            r7.f9192 = r1
            r7.mo6127()
            char r1 = r7.f9191
            r2 = 44
            if (r1 != r2) goto L6b
            r1 = 1
            goto L6c
        L6b:
            r1 = 0
        L6c:
            r7.f9195 = r1
            if (r1 == 0) goto L73
            r7.mo6127()
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6154():java.time.LocalTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.time.LocalTime mo6155() {
        /*
            r7 = this;
            char r0 = r7.f9191
            r1 = 34
            r2 = 0
            if (r0 == r1) goto L12
            r1 = 39
            if (r0 != r1) goto Lc
            goto L12
        Lc:
            java.lang.String r7 = "localTime only support string input"
            androidx.collection.C0276.m849(r7)
            return r2
        L12:
            int r0 = r7.f9192
            java.time.ZoneId r1 = com.alibaba.fastjson2.util.AbstractC2865.f9025
            int r1 = r0 + 15
            char[] r3 = r7.f9211
            int r4 = r3.length
            if (r1 > r4) goto L51
            int r1 = r0 + 2
            char r1 = r3[r1]
            r4 = 58
            if (r1 != r4) goto L51
            int r1 = r0 + 5
            char r1 = r3[r1]
            if (r1 != r4) goto L51
            int r1 = r0 + 8
            char r1 = r3[r1]
            r4 = 46
            if (r1 == r4) goto L34
            goto L51
        L34:
            int r1 = com.alibaba.fastjson2.util.AbstractC2848.m5676(r0, r3)
            int r4 = r0 + 3
            int r4 = com.alibaba.fastjson2.util.AbstractC2848.m5676(r4, r3)
            int r5 = r0 + 6
            int r5 = com.alibaba.fastjson2.util.AbstractC2848.m5676(r5, r3)
            int r0 = r0 + 9
            r6 = 6
            int r0 = com.alibaba.fastjson2.util.AbstractC2865.m5846(r6, r0, r3)
            r3 = r1 | r4
            r3 = r3 | r5
            r3 = r3 | r0
            if (r3 >= 0) goto L53
        L51:
            r0 = r2
            goto L57
        L53:
            java.time.LocalTime r0 = java.time.LocalTime.of(r1, r4, r5, r0)
        L57:
            if (r0 != 0) goto L5a
            return r2
        L5a:
            int r1 = r7.f9192
            int r1 = r1 + 16
            r7.f9192 = r1
            r7.mo6127()
            char r1 = r7.f9191
            r2 = 44
            if (r1 != r2) goto L6b
            r1 = 1
            goto L6c
        L6b:
            r1 = 0
        L6c:
            r7.f9195 = r1
            if (r1 == 0) goto L73
            r7.mo6127()
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6155():java.time.LocalTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世子苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.time.LocalTime mo6156() {
        /*
            r17 = this;
            r0 = r17
            char r1 = r0.f9191
            r2 = 34
            r3 = 0
            if (r1 == r2) goto L14
            r2 = 39
            if (r1 != r2) goto Le
            goto L14
        Le:
            java.lang.String r0 = "localTime only support string input"
            androidx.collection.C0276.m849(r0)
            return r3
        L14:
            int r1 = r0.f9192
            java.time.ZoneId r2 = com.alibaba.fastjson2.util.AbstractC2865.f9025
            int r2 = r1 + 12
            char[] r4 = r0.f9211
            int r5 = r4.length
            if (r2 > r5) goto L9c
            int r2 = r1 + 2
            char r2 = r4[r2]
            r5 = 58
            if (r2 != r5) goto L9c
            int r2 = r1 + 5
            char r2 = r4[r2]
            if (r2 != r5) goto L9c
            int r2 = r1 + 8
            char r2 = r4[r2]
            r5 = 46
            if (r2 == r5) goto L36
            goto L9c
        L36:
            int r2 = com.alibaba.fastjson2.util.AbstractC2848.m5676(r1, r4)
            int r5 = r1 + 3
            int r5 = com.alibaba.fastjson2.util.AbstractC2848.m5676(r5, r4)
            int r6 = r1 + 6
            int r6 = com.alibaba.fastjson2.util.AbstractC2848.m5676(r6, r4)
            int r7 = r1 + 9
            int r7 = com.alibaba.fastjson2.util.AbstractC2848.m5689(r7, r4)
            long r7 = (long) r7
            int r1 = r1 + 11
            char r1 = com.alibaba.fastjson2.util.AbstractC2848.m5696(r1, r4)
            long r9 = (long) r1
            r1 = 32
            long r9 = r9 << r1
            long r7 = r7 + r9
            r9 = 281410551218160(0xfff0fff0fff0, double:1.390352857341414E-309)
            long r9 = r9 & r7
            r11 = 206161575984(0x3000300030, double:1.01857352186E-312)
            long r9 = r9 - r11
            r11 = 64425492495(0xf000f000f, double:3.1830422558E-313)
            long r11 = r11 & r7
            r13 = 25770196998(0x600060006, double:1.27321690233E-313)
            long r13 = r13 + r11
            r15 = 1030807879920(0xf000f000f0, double:5.09286760931E-312)
            long r13 = r13 & r15
            long r9 = r9 | r13
            r13 = 0
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 == 0) goto L7f
            r1 = -1
            goto L90
        L7f:
            r9 = 15
            long r7 = r7 & r9
            r13 = 10
            long r7 = r7 * r13
            r4 = 16
            long r15 = r11 >> r4
            long r9 = r9 & r15
            long r7 = r7 + r9
            long r7 = r7 * r13
            long r9 = r11 >> r1
            long r7 = r7 + r9
            int r1 = (int) r7
        L90:
            if (r1 <= 0) goto L96
            r4 = 1000000(0xf4240, float:1.401298E-39)
            int r1 = r1 * r4
        L96:
            r4 = r2 | r5
            r4 = r4 | r6
            r4 = r4 | r5
            if (r4 >= 0) goto L9e
        L9c:
            r1 = r3
            goto La2
        L9e:
            java.time.LocalTime r1 = java.time.LocalTime.of(r2, r5, r6, r1)
        La2:
            if (r1 != 0) goto La5
            return r3
        La5:
            int r2 = r0.f9192
            int r2 = r2 + 13
            r0.f9192 = r2
            r0.mo6127()
            char r2 = r0.f9191
            r3 = 44
            if (r2 != r3) goto Lb6
            r2 = 1
            goto Lb7
        Lb6:
            r2 = 0
        Lb7:
            r0.f9195 = r2
            if (r2 == 0) goto Lbe
            r0.mo6127()
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6156():java.time.LocalTime");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子 */
    public final void mo6157() {
        int i;
        char c;
        int i2 = this.f9192;
        char[] cArr = this.f9211;
        if (cArr[i2] != 'u' || cArr[i2 + 1] != 'l' || cArr[i2 + 2] != 'l') {
            C0276.m849(AbstractC6136.m11556(i2, "json syntax error, not match null, offset "));
            return;
        }
        int i3 = i2 + 3;
        int i4 = this.f9210;
        char c2 = i3 == i4 ? (char) 26 : cArr[i3];
        int i5 = i2 + 4;
        while (c2 <= ' ' && ((1 << c2) & 4294981376L) != 0) {
            if (i5 == i4) {
                c2 = 26;
            } else {
                c2 = cArr[i5];
                i5++;
            }
        }
        boolean z = c2 == ',';
        this.f9195 = z;
        if (z) {
            if (i5 == i4) {
                i = i5;
                c = 26;
            } else {
                i = i5 + 1;
                c = cArr[i5];
            }
            loop1: while (true) {
                int i6 = i;
                c2 = c;
                i5 = i6;
                while (c2 <= ' ' && ((1 << c2) & 4294981376L) != 0) {
                    if (i5 == i4) {
                        c2 = 26;
                    }
                }
                i = i5 + 1;
                c = cArr[i5];
            }
        }
        this.f9191 = c2;
        this.f9192 = i5;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:9:0x001b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:12:0x002c
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
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰子哲 */
    public final double mo6158() {
        /*
            r15 = this;
            int r0 = r15.f9192
            char[] r1 = r15.f9211
            char r2 = r1[r0]
            r3 = 97
            if (r2 != r3) goto L71
            int r2 = r0 + 1
            char r2 = r1[r2]
            r3 = 78
            if (r2 != r3) goto L71
            int r2 = r0 + 2
            r3 = 26
            int r4 = r15.f9210
            if (r2 != r4) goto L1d
            r0 = r2
        L1b:
            r2 = r3
            goto L21
        L1d:
            int r0 = r0 + 3
            char r2 = r1[r2]
        L21:
            r5 = 0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            r9 = 1
            r11 = 32
            if (r2 > r11) goto L40
            long r12 = r9 << r2
            long r12 = r12 & r7
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 == 0) goto L40
            if (r0 < r4) goto L38
            goto L1b
        L38:
            int r2 = r0 + 1
            char r0 = r1[r0]
            r14 = r2
            r2 = r0
            r0 = r14
            goto L21
        L40:
            r12 = 44
            if (r2 != r12) goto L46
            r12 = 1
            goto L47
        L46:
            r12 = 0
        L47:
            r15.f9195 = r12
            if (r12 == 0) goto L69
            if (r0 < r4) goto L50
            r2 = r0
            r0 = r3
            goto L54
        L50:
            int r2 = r0 + 1
            char r0 = r1[r0]
        L54:
            r14 = r2
            r2 = r0
            r0 = r14
        L57:
            if (r2 > r11) goto L69
            long r12 = r9 << r2
            long r12 = r12 & r7
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 == 0) goto L69
            if (r0 < r4) goto L64
            r2 = r3
            goto L57
        L64:
            int r2 = r0 + 1
            char r0 = r1[r0]
            goto L54
        L69:
            char r1 = (char) r2
            r15.f9191 = r1
            r15.f9192 = r0
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L71:
            java.lang.String r15 = "json syntax error, not NaN "
            java.lang.String r15 = p007.AbstractC6136.m11556(r0, r15)
            androidx.collection.C0276.m849(r15)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6158():double");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲子兰 */
    public final long mo6160() {
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("date only support string input");
            return 0L;
        }
        int i = this.f9192;
        if (i + 18 >= this.f9210) {
            this.f9194 = true;
            return 0L;
        }
        ZoneId zoneId = (ZoneId) this.f9199.f9317;
        char[] cArr = this.f9211;
        long jM5837 = AbstractC2865.m5837(cArr, i, zoneId);
        int i2 = this.f9192;
        if (cArr[i2 + 19] != c) {
            C0276.m849(mo6124("illegal date input"));
            return 0L;
        }
        this.f9192 = i2 + 20;
        mo6127();
        boolean z = this.f9191 == ',';
        this.f9195 = z;
        if (z) {
            mo6127();
        }
        return jM5837;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲 */
    public final LocalTime mo6161() {
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("localTime only support string input");
            return null;
        }
        LocalTime localTimeM5852 = AbstractC2865.m5852(this.f9192, this.f9211);
        if (localTimeM5852 == null) {
            return null;
        }
        this.f9192 += 10;
        mo6127();
        boolean z = this.f9191 == ',';
        this.f9195 = z;
        if (z) {
            mo6127();
        }
        return localTimeM5852;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪世苏子哲兰 */
    public final LocalTime mo6162() {
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("localTime only support string input");
            return null;
        }
        LocalTime localTimeM5852 = AbstractC2865.m5852(this.f9192, this.f9211);
        if (localTimeM5852 == null) {
            return null;
        }
        this.f9192 += 9;
        mo6127();
        boolean z = this.f9191 == ',';
        this.f9195 = z;
        if (z) {
            mo6127();
        }
        return localTimeM5852;
    }

    /* JADX WARN: Path cross not found for [B:76:0x00d3, B:120:?], limit reached: 122 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x00ee -> B:77:0x00d5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:81:0x00e4
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
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲 */
    public final long mo6164() {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6164():long");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏 */
    public final Long mo6165() {
        char c = this.f9191;
        if ((c == '\"' || c == '\'' || c == 'n') && mo6105()) {
            return null;
        }
        return Long.valueOf(mo6164());
    }

    /* JADX WARN: Path cross not found for [B:73:0x00b5, B:117:?], limit reached: 119 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x00d3 -> B:74:0x00b7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x00c9
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
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲 */
    public final int mo6167() {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6167():int");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰 */
    public final Integer mo6168() {
        char c = this.f9191;
        if ((c == '\"' || c == '\'' || c == 'n') && mo6105()) {
            return null;
        }
        return Integer.valueOf(mo6167());
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世哲苏 */
    public final LocalDateTime mo6169() {
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeM5797 = AbstractC2865.m5797(this.f9192, this.f9211);
        if (localDateTimeM5797 == null) {
            return null;
        }
        this.f9192 += 21;
        mo6127();
        boolean z = this.f9191 == ',';
        this.f9195 = z;
        if (z) {
            mo6127();
        }
        return localDateTimeM5797;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲 */
    public final LocalDateTime mo6170() {
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeM5795 = AbstractC2865.m5795(this.f9192, this.f9211);
        if (localDateTimeM5795 == null) {
            return null;
        }
        this.f9192 += 20;
        mo6127();
        boolean z = this.f9191 == ',';
        this.f9195 = z;
        if (z) {
            mo6127();
        }
        return localDateTimeM5795;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.time.LocalTime mo6171() {
        /*
            r6 = this;
            char r0 = r6.f9191
            r1 = 34
            r2 = 0
            if (r0 == r1) goto L12
            r1 = 39
            if (r0 != r1) goto Lc
            goto L12
        Lc:
            java.lang.String r6 = "localTime only support string input"
            androidx.collection.C0276.m849(r6)
            return r2
        L12:
            int r0 = r6.f9192
            java.time.ZoneId r1 = com.alibaba.fastjson2.util.AbstractC2865.f9025
            int r1 = r0 + 10
            char[] r3 = r6.f9211
            int r4 = r3.length
            if (r1 > r4) goto L56
            int r1 = r0 + 2
            char r1 = r3[r1]
            r4 = 58
            if (r1 != r4) goto L56
            int r1 = r0 + 5
            char r1 = r3[r1]
            if (r1 != r4) goto L56
            int r1 = r0 + 8
            char r1 = r3[r1]
            r4 = 46
            if (r1 == r4) goto L34
            goto L56
        L34:
            int r1 = com.alibaba.fastjson2.util.AbstractC2848.m5676(r0, r3)
            int r4 = r0 + 3
            int r4 = com.alibaba.fastjson2.util.AbstractC2848.m5676(r4, r3)
            int r5 = r0 + 6
            int r5 = com.alibaba.fastjson2.util.AbstractC2848.m5676(r5, r3)
            int r0 = r0 + 9
            int r0 = com.alibaba.fastjson2.util.AbstractC2848.m5678(r0, r3)
            if (r0 <= 0) goto L50
            r3 = 100000000(0x5f5e100, float:2.3122341E-35)
            int r0 = r0 * r3
        L50:
            r3 = r1 | r4
            r3 = r3 | r5
            r3 = r3 | r4
            if (r3 >= 0) goto L58
        L56:
            r0 = r2
            goto L5c
        L58:
            java.time.LocalTime r0 = java.time.LocalTime.of(r1, r4, r5, r0)
        L5c:
            if (r0 != 0) goto L5f
            return r2
        L5f:
            int r1 = r6.f9192
            int r1 = r1 + 11
            r6.f9192 = r1
            r6.mo6127()
            char r1 = r6.f9191
            r2 = 44
            if (r1 != r2) goto L70
            r1 = 1
            goto L71
        L70:
            r1 = 0
        L71:
            r6.f9195 = r1
            if (r1 == 0) goto L78
            r6.mo6127()
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6171():java.time.LocalTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.time.LocalTime mo6172() {
        /*
            r6 = this;
            char r0 = r6.f9191
            r1 = 34
            r2 = 0
            if (r0 == r1) goto L12
            r1 = 39
            if (r0 != r1) goto Lc
            goto L12
        Lc:
            java.lang.String r6 = "localTime only support string input"
            androidx.collection.C0276.m849(r6)
            return r2
        L12:
            int r0 = r6.f9192
            java.time.ZoneId r1 = com.alibaba.fastjson2.util.AbstractC2865.f9025
            int r1 = r0 + 11
            char[] r3 = r6.f9211
            int r4 = r3.length
            if (r1 > r4) goto L56
            int r1 = r0 + 2
            char r1 = r3[r1]
            r4 = 58
            if (r1 != r4) goto L56
            int r1 = r0 + 5
            char r1 = r3[r1]
            if (r1 != r4) goto L56
            int r1 = r0 + 8
            char r1 = r3[r1]
            r4 = 46
            if (r1 == r4) goto L34
            goto L56
        L34:
            int r1 = com.alibaba.fastjson2.util.AbstractC2848.m5676(r0, r3)
            int r4 = r0 + 3
            int r4 = com.alibaba.fastjson2.util.AbstractC2848.m5676(r4, r3)
            int r5 = r0 + 6
            int r5 = com.alibaba.fastjson2.util.AbstractC2848.m5676(r5, r3)
            int r0 = r0 + 9
            int r0 = com.alibaba.fastjson2.util.AbstractC2848.m5676(r0, r3)
            if (r0 <= 0) goto L50
            r3 = 10000000(0x989680, float:1.4012985E-38)
            int r0 = r0 * r3
        L50:
            r3 = r1 | r4
            r3 = r3 | r5
            r3 = r3 | r4
            if (r3 >= 0) goto L58
        L56:
            r0 = r2
            goto L5c
        L58:
            java.time.LocalTime r0 = java.time.LocalTime.of(r1, r4, r5, r0)
        L5c:
            if (r0 != 0) goto L5f
            return r2
        L5f:
            int r1 = r6.f9192
            int r1 = r1 + 12
            r6.f9192 = r1
            r6.mo6127()
            char r1 = r6.f9191
            r2 = 44
            if (r1 != r2) goto L70
            r1 = 1
            goto L71
        L70:
            r1 = 0
        L71:
            r6.f9195 = r1
            if (r1 == 0) goto L78
            r6.mo6127()
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6172():java.time.LocalTime");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲 */
    public final LocalDateTime mo6173(int i) {
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("date only support string input");
            return null;
        }
        int i2 = this.f9192;
        char[] cArr = this.f9211;
        LocalDateTime localDateTime = cArr[(i2 + i) - 1] == 'Z' ? AbstractC2865.m5835(cArr, i2, i, AbstractC2865.f9025).toInstant().atZone(this.f9199.m6351()).toLocalDateTime() : AbstractC2865.m5794(i2, i, cArr);
        if (localDateTime == 0) {
            return null;
        }
        this.f9192 = i + 1 + this.f9192;
        mo6127();
        boolean z = this.f9191 == ',';
        this.f9195 = z;
        if (z) {
            mo6127();
        }
        return localDateTime;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏 */
    public final LocalDateTime mo6175() {
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeM5801 = AbstractC2865.m5801(this.f9192, this.f9211);
        if (localDateTimeM5801 == null) {
            return null;
        }
        this.f9192 += 13;
        mo6127();
        boolean z = this.f9191 == ',';
        this.f9195 = z;
        if (z) {
            mo6127();
        }
        return localDateTimeM5801;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏 */
    public final LocalDateTime mo6177() {
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeM5807 = AbstractC2865.m5807(this.f9192, this.f9211);
        if (localDateTimeM5807 == null) {
            return null;
        }
        this.f9192 += 18;
        mo6127();
        boolean z = this.f9191 == ',';
        this.f9195 = z;
        if (z) {
            mo6127();
        }
        return localDateTimeM5807;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世 */
    public final LocalDateTime mo6178() {
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeM5805 = AbstractC2865.m5805(this.f9192, this.f9211);
        this.f9192 += 19;
        mo6127();
        boolean z = this.f9191 == ',';
        this.f9195 = z;
        if (z) {
            mo6127();
        }
        return localDateTimeM5805;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰 */
    public final LocalDateTime mo6179() {
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeM5799 = AbstractC2865.m5799(this.f9192, this.f9211);
        if (localDateTimeM5799 == null) {
            return null;
        }
        this.f9192 += 15;
        mo6127();
        boolean z = this.f9191 == ',';
        this.f9195 = z;
        if (z) {
            mo6127();
        }
        return localDateTimeM5799;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世 */
    public final LocalDateTime mo6180() {
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeM5809 = AbstractC2865.m5809(this.f9192, this.f9211);
        if (localDateTimeM5809 == null) {
            return null;
        }
        this.f9192 += 17;
        mo6127();
        boolean z = this.f9191 == ',';
        this.f9195 = z;
        if (z) {
            mo6127();
        }
        return localDateTimeM5809;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子苏世兰哲 */
    public final LocalDate mo6181() {
        int i;
        boolean z;
        int i2 = this.f9192;
        char c = this.f9191;
        if (c == '\"' || c == '\'') {
            this.f9199.getClass();
            int i3 = i2 + 10;
            char[] cArr = this.f9211;
            int length = cArr.length;
            LocalDate localDateOf = null;
            int i4 = this.f9210;
            if (i3 < length && i3 < i4 && cArr[i2 + 4] == '-' && cArr[i2 + 7] == '-' && cArr[i3] == c) {
                int iM5694 = AbstractC2848.m5694(i2, cArr);
                int iM5676 = AbstractC2848.m5676(i2 + 5, cArr);
                int iM56762 = AbstractC2848.m5676(i2 + 8, cArr);
                int i5 = iM5694 | iM5676 | iM56762;
                if (i5 < 0) {
                    C0276.m849(mo6124("read date error"));
                    return null;
                }
                if (i5 != 0) {
                    try {
                        localDateOf = LocalDate.of(iM5694, iM5676, iM56762);
                    } catch (DateTimeException e) {
                        C0276.m842(mo6124("read date error"), e);
                        return null;
                    }
                }
                this.f9192 = i2 + 11;
                mo6127();
                z = this.f9191 == ',';
                this.f9195 = z;
                if (z) {
                    mo6127();
                }
                return localDateOf;
            }
            int iMin = Math.min(i2 + 17, i4);
            int i6 = -1;
            for (int i7 = i2; i7 < iMin; i7++) {
                if (cArr[i7] == c) {
                    i6 = i7;
                }
            }
            if (i6 != -1 && (i = i6 - i2) > 10 && cArr[i6 - 6] == '-' && cArr[i6 - 3] == '-') {
                localDateOf = LocalDate.of(AbstractC2866.m5885(i2, i - 6, cArr), AbstractC2848.m5676(i6 - 5, cArr), AbstractC2848.m5676(i6 - 2, cArr));
                this.f9192 = i6 + 1;
                mo6127();
                z = this.f9191 == ',';
                this.f9195 = z;
                if (z) {
                    mo6127();
                }
            }
            if (localDateOf != null) {
                return localDateOf;
            }
        }
        return super.mo6181();
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲 */
    public final LocalDate mo6183() {
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("localDate only support string input");
            return null;
        }
        try {
            LocalDate localDateM5821 = AbstractC2865.m5821(this.f9192, this.f9211);
            this.f9192 += 9;
            mo6127();
            boolean z = this.f9191 == ',';
            this.f9195 = z;
            if (z) {
                mo6127();
            }
            return localDateM5821;
        } catch (DateTimeException e) {
            C0276.m842(mo6124("read date error"), e);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世 */
    public final LocalDate mo6184() {
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("localDate only support string input");
            return null;
        }
        try {
            LocalDate localDateM5819 = AbstractC2865.m5819(this.f9192, this.f9211);
            this.f9192 += 10;
            mo6127();
            boolean z = this.f9191 == ',';
            this.f9195 = z;
            if (z) {
                mo6127();
            }
            return localDateM5819;
        } catch (DateTimeException e) {
            C0276.m842(mo6124("read date error"), e);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰 */
    public final LocalDate mo6185() {
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("localDate only support string input");
            return null;
        }
        try {
            LocalDate localDateM5825 = AbstractC2865.m5825(this.f9192, this.f9211);
            if (localDateM5825 == null) {
                return null;
            }
            this.f9192 += 11;
            mo6127();
            boolean z = this.f9191 == ',';
            this.f9195 = z;
            if (z) {
                mo6127();
            }
            return localDateM5825;
        } catch (DateTimeException e) {
            C0276.m842(mo6124("read date error"), e);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世 */
    public final LocalDate mo6186() {
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            C0276.m849("localDate only support string input");
            return null;
        }
        LocalDate localDateM5818 = AbstractC2865.m5818(this.f9192, this.f9211);
        if (localDateM5818 == null) {
            return null;
        }
        this.f9192 += 12;
        mo6127();
        boolean z = this.f9191 == ',';
        this.f9195 = z;
        if (z) {
            mo6127();
        }
        return localDateM5818;
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪苏世哲兰子 */
    public final void mo6188() {
        this.f9192 = m6201(this, this.f9211, this.f9192, this.f9210);
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰 */
    public final void mo6189() {
        this.f9192 = m6200(this, this.f9211, this.f9192, this.f9210);
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪苏世子兰哲 */
    public final void mo6190() {
        boolean z;
        boolean z2;
        char c;
        int i = this.f9192;
        int i2 = i + 1;
        int i3 = this.f9210;
        if (i2 >= i3) {
            C0276.m849(mo6124(null));
            return;
        }
        char[] cArr = this.f9211;
        char c2 = cArr[i];
        if (c2 == '*') {
            z = true;
        } else {
            if (c2 != '/') {
                C0276.m849(mo6124("parse comment error"));
                return;
            }
            z = false;
        }
        int i4 = i + 2;
        char c3 = cArr[i2];
        while (true) {
            if (z) {
                if (c3 == '*' && i4 <= i3 && cArr[i4] == '/') {
                    i4++;
                }
            } else {
                z2 = c3 == '\n';
            }
            c = 26;
            if (z2) {
                if (i4 < i3) {
                    char c4 = cArr[i4];
                    while (c4 <= ' ' && ((1 << c4) & 4294981376L) != 0) {
                        i4++;
                        if (i4 >= i3) {
                            break;
                        } else {
                            c4 = cArr[i4];
                        }
                    }
                    c = c4;
                    i4++;
                }
            } else {
                if (i4 >= i3) {
                    break;
                }
                c3 = cArr[i4];
                i4++;
            }
        }
        this.f9191 = c;
        this.f9192 = i4;
        if (c == '/') {
            mo6190();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cc  */
    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪苏子兰哲世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.time.ZonedDateTime mo6197(int r22) {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.mo6197(int):java.time.ZonedDateTime");
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪苏子哲世兰 */
    public final UUID mo6198() {
        long jM6204;
        long jM62042;
        long jM62043;
        long jM62044;
        long jM62045;
        long jM62046;
        long jM62047;
        long jM62048;
        int i;
        int i2;
        char c;
        char c2 = this.f9191;
        if (c2 == 'n') {
            mo6157();
            return null;
        }
        if (c2 != '\"' && c2 != '\'') {
            C0276.m849(mo6124("syntax error, can not read uuid"));
            return null;
        }
        int i3 = this.f9192;
        int i4 = i3 + 36;
        int i5 = this.f9210;
        char[] cArr = this.f9211;
        if (i4 < i5 && cArr[i4] == c2 && cArr[i3 + 8] == '-' && cArr[i3 + 13] == '-' && cArr[i3 + 18] == '-' && cArr[i3 + 23] == '-') {
            jM6204 = m6204(i3, cArr);
            jM62042 = m6204(i3 + 4, cArr);
            jM62043 = m6204(i3 + 9, cArr);
            jM62044 = m6204(i3 + 14, cArr);
            jM62045 = m6204(i3 + 19, cArr);
            jM62046 = m6204(i3 + 24, cArr);
            jM62047 = m6204(i3 + 28, cArr);
            jM62048 = m6204(i3 + 32, cArr);
            i = i3 + 37;
        } else {
            int i6 = i3 + 32;
            if (i6 >= i5 || cArr[i6] != c2) {
                String strMo6139 = mo6139();
                if (strMo6139.isEmpty()) {
                    return null;
                }
                return UUID.fromString(strMo6139);
            }
            jM6204 = m6204(i3, cArr);
            jM62042 = m6204(i3 + 4, cArr);
            jM62043 = m6204(i3 + 8, cArr);
            jM62044 = m6204(i3 + 12, cArr);
            jM62045 = m6204(i3 + 16, cArr);
            jM62046 = m6204(i3 + 20, cArr);
            jM62047 = m6204(i3 + 24, cArr);
            jM62048 = m6204(i3 + 28, cArr);
            i = i3 + 33;
        }
        if (i == i5) {
            i2 = i;
            c = 26;
        } else {
            i2 = i + 1;
            c = cArr[i];
        }
        long j = jM6204;
        int i7 = i2;
        while (c <= ' ' && ((1 << c) & 4294981376L) != 0) {
            if (i7 == i5) {
                c = 26;
            } else {
                c = cArr[i7];
                i7++;
            }
        }
        this.f9192 = i7;
        boolean z = c == ',';
        this.f9195 = z;
        if (z) {
            mo6127();
        } else {
            this.f9191 = c;
        }
        return new UUID((j << 48) | (jM62042 << 32) | (jM62043 << 16) | jM62044, (jM62047 << 16) | (jM62045 << 48) | (jM62046 << 32) | jM62048);
    }

    @Override // com.alibaba.fastjson2.AbstractC2898
    /* JADX INFO: renamed from: 飘花落叶言楪苏子哲兰世 */
    public final long mo6199() {
        char[] cArr;
        int i;
        char cM5650;
        int i2;
        char cM6115;
        long j;
        long j2;
        char c = this.f9191;
        if (c != '\"' && c != '\'') {
            return -1L;
        }
        this.f9196 = false;
        int i3 = this.f9192;
        this.f9206 = i3;
        int i4 = 0;
        long j3 = 0;
        while (true) {
            cArr = this.f9211;
            i = this.f9210;
            if (i3 < i) {
                char cM56502 = cArr[i3];
                if (cM56502 != c) {
                    if (cM56502 == '\\') {
                        this.f9196 = true;
                        int i5 = i3 + 1;
                        char c2 = cArr[i5];
                        if (c2 == 'u') {
                            int i6 = i3 + 2;
                            C2903.m6226(i6, i);
                            cM56502 = (char) AbstractC2848.m5650(i6, cArr);
                            i3 += 5;
                        } else if (c2 != 'x') {
                            cM56502 = m6115(c2);
                            i3 = i5;
                        } else {
                            char c3 = cArr[i3 + 2];
                            i3 += 3;
                            cM56502 = AbstractC2898.m6050(c3, cArr[i3]);
                        }
                    }
                    if (cM56502 <= 255 && i4 < 8 && (i4 != 0 || cM56502 != 0)) {
                        switch (i4) {
                            case 0:
                                j3 = (byte) cM56502;
                                continue;
                                i3++;
                                i4++;
                                break;
                            case 1:
                                j = ((byte) cM56502) << 8;
                                j2 = 255;
                                break;
                            case 2:
                                j = ((byte) cM56502) << 16;
                                j2 = 65535;
                                break;
                            case 3:
                                j = ((byte) cM56502) << 24;
                                j2 = 16777215;
                                break;
                            case 4:
                                j = ((long) ((byte) cM56502)) << 32;
                                j2 = 4294967295L;
                                break;
                            case 5:
                                j = ((long) ((byte) cM56502)) << 40;
                                j2 = 1099511627775L;
                                break;
                            case 6:
                                j = ((long) ((byte) cM56502)) << 48;
                                j2 = 281474976710655L;
                                break;
                            case 7:
                                j = ((long) ((byte) cM56502)) << 56;
                                j2 = 72057594037927935L;
                                break;
                            default:
                                i3++;
                                i4++;
                                break;
                        }
                        j3 = (j3 & j2) + j;
                        i3++;
                        i4++;
                    }
                } else if (i4 == 0) {
                    i3 = this.f9206;
                } else {
                    this.f9208 = i4;
                    this.f9205 = i3;
                    i3++;
                }
            }
        }
        i3 = this.f9206;
        j3 = 0;
        if (j3 == 0) {
            j3 = -3750763034362895579L;
            int i7 = 0;
            while (true) {
                char c4 = cArr[i3];
                if (c4 == '\\') {
                    this.f9196 = true;
                    int i8 = i3 + 1;
                    char c5 = cArr[i8];
                    if (c5 == 'u') {
                        int i9 = i3 + 2;
                        C2903.m6226(i9, i);
                        cM5650 = (char) AbstractC2848.m5650(i9, cArr);
                        i2 = i3 + 5;
                    } else if (c5 != 'x') {
                        cM6115 = m6115(c5);
                        long j4 = (((long) cM6115) ^ j3) * 1099511628211L;
                        i3 = i8 + 1;
                        j3 = j4;
                    } else {
                        char c6 = cArr[i3 + 2];
                        i2 = i3 + 3;
                        cM5650 = AbstractC2898.m6050(c6, cArr[i2]);
                    }
                    char c7 = cM5650;
                    i8 = i2;
                    cM6115 = c7;
                    long j42 = (((long) cM6115) ^ j3) * 1099511628211L;
                    i3 = i8 + 1;
                    j3 = j42;
                } else if (c4 == '\"') {
                    this.f9208 = i7;
                    this.f9205 = i3;
                    this.f9186 = null;
                    i3++;
                } else {
                    i3++;
                    j3 = (((long) c4) ^ j3) * 1099511628211L;
                }
                i7++;
            }
        }
        char c8 = i3 == i ? (char) 26 : cArr[i3];
        while (c8 <= ' ' && ((1 << c8) & 4294981376L) != 0) {
            i3++;
            c8 = cArr[i3];
        }
        boolean z = c8 == ',';
        this.f9195 = z;
        if (z) {
            i3++;
            char c9 = i3 != i ? cArr[i3] : (char) 26;
            while (c9 <= ' ' && ((1 << c9) & 4294981376L) != 0) {
                i3++;
                c9 = cArr[i3];
            }
            c8 = c9;
        }
        this.f9192 = i3 + 1;
        this.f9191 = c8;
        return j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r4.f9192++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r6 == 65534) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r6 != 65279) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        mo6127();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r4.f9191 != '/') goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        mo6190();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2900(com.alibaba.fastjson2.C2942 r5, java.lang.String r6, char[] r7, int r8) {
        /*
            r4 = this;
            r0 = 0
            r4.<init>(r5, r0)
            r5 = -1
            r4.f9204 = r5
            r4.f9212 = r6
            r4.f9211 = r7
            r4.f9192 = r0
            r4.f9209 = r8
            r4.f9210 = r8
            r5 = 26
            if (r8 > 0) goto L18
            r4.f9191 = r5
            return
        L18:
            char r6 = r7[r0]
            r4.f9191 = r6
        L1c:
            char r6 = r4.f9191
            r0 = 32
            if (r6 > r0) goto L41
            r0 = 1
            long r0 = r0 << r6
            r2 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L41
            int r6 = r4.f9192
            int r6 = r6 + 1
            r4.f9192 = r6
            if (r6 < r8) goto L3c
            r4.f9191 = r5
            return
        L3c:
            char r6 = r7[r6]
            r4.f9191 = r6
            goto L1c
        L41:
            int r5 = r4.f9192
            int r5 = r5 + 1
            r4.f9192 = r5
            r5 = 65534(0xfffe, float:9.1833E-41)
            if (r6 == r5) goto L51
            r5 = 65279(0xfeff, float:9.1475E-41)
            if (r6 != r5) goto L54
        L51:
            r4.mo6127()
        L54:
            char r5 = r4.f9191
            r6 = 47
            if (r5 != r6) goto L5d
            r4.mo6190()
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2900.<init>(com.alibaba.fastjson2.飘花落叶言子苏兰哲世楪, java.lang.String, char[], int):void");
    }
}

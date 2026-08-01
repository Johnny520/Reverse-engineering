package com.alibaba.fastjson2;

import androidx.collection.C1123;
import androidx.recyclerview.widget.C3329;
import com.alibaba.fastjson2.util.AbstractC3682;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3699;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.android.p002dx.p005io.Opcodes;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.UUID;
import p025.AbstractC7012;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3734 extends AbstractC3732 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final int f9551;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public int f9552;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public int f9553;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public int f9554;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public int f9555;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final int f9556;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final int f9557;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final char[] f9558;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final String f9559;

    static {
        Unsafe unsafe = AbstractC3687.f9266;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r11 = r9.f9538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r11 > ' ') goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (((1 << r11) & 4294981376L) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = r9.f9539 + 1;
        r9.f9539 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r11 < r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        r9.f9538 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        r9.f9538 = r9.f9558[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        r9.f9539++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        if (r11 == 65534) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r11 != 65279) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        mo6733();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r9.f9538 != '/') goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        mo6795();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3734(int i, C3776 c3776, byte[] bArr) {
        super(c3776, false);
        int i2 = 0;
        this.f9551 = -1;
        this.f9559 = null;
        this.f9558 = new char[i / 2];
        int i3 = 0;
        while (i2 < i) {
            this.f9558[i3] = (char) (((bArr[i2] & DefaultClassResolver.NAME) << 8) | (bArr[i2 + 1] & DefaultClassResolver.NAME));
            i2 += 2;
            i3++;
        }
        this.f9556 = i3;
        this.f9557 = i3;
        int i4 = this.f9539;
        if (i4 >= i3) {
            this.f9538 = (char) 26;
            return;
        }
        this.f9538 = this.f9558[i4];
        while (true) {
            char c = this.f9538;
            if (c > ' ' || ((1 << c) & 4294981376L) == 0) {
                break;
            }
            int i5 = this.f9539 + 1;
            this.f9539 = i5;
            if (i5 >= i) {
                this.f9538 = (char) 26;
                return;
            }
            this.f9538 = this.f9558[i5];
        }
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
    public static int m6805(com.alibaba.fastjson2.C3734 r12, char[] r13, int r14, int r15) {
        /*
            char r0 = r12.f9538
            boolean r1 = r12.m6722(r0)
            if (r1 == 0) goto Lb
            int r12 = r12.f9539
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
            r12.f9538 = r14
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
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.m6805(com.alibaba.fastjson2.飘花落叶言子哲楪兰世苏, char[], int, int):int");
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
    public static int m6806(com.alibaba.fastjson2.C3734 r27, char[] r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 1231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.m6806(com.alibaba.fastjson2.飘花落叶言子哲楪兰世苏, char[], int, int):int");
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
    */
    public static int m6807(C3734 c3734, char[] cArr, int i, int i2) {
        int i3;
        char c;
        if (i == i2) {
            i3 = i;
            c = 26;
            while (true) {
                if (c == 0) {
                    if (i3 == i2) {
                        break;
                    }
                    int i4 = i3 + 1;
                    char c2 = cArr[i3];
                    i3 = i4;
                    c = c2;
                } else if (c > ' ' || ((1 << c) & 4294981376L) == 0) {
                    break;
                }
            }
            c3734.f9538 = c;
            if (c == '/') {
                return i3;
            }
            c3734.f9539 = i3;
            c3734.mo6795();
            return c3734.f9539;
        }
        i3 = i + 1;
        c = cArr[i];
        while (true) {
            if (c == 0) {
            }
            int i42 = i3 + 1;
            char c22 = cArr[i3];
            i3 = i42;
            c = c22;
        }
        c3734.f9538 = c;
        if (c == '/') {
        }
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
    public static int m6808(com.alibaba.fastjson2.C3734 r18, char[] r19, int r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            int r3 = m6807(r18, r19, r20, r21)
            r4 = 0
            r5 = r4
        Lc:
            char r6 = r0.f9538
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
            com.alibaba.fastjson2.AbstractC3732.m6654(r6, r3)
            throw r1
        L70:
            if (r4 == 0) goto L7d
            if (r3 == r2) goto L79
            if (r3 == r7) goto L79
            if (r3 == r5) goto L79
            goto L7d
        L79:
            com.alibaba.fastjson2.AbstractC3732.m6654(r6, r3)
            throw r1
        L7d:
            r0.f9542 = r4
            char r1 = (char) r3
            r0.f9538 = r1
            return r6
        L83:
            if (r5 == 0) goto L94
            boolean r6 = r0.f9542
            if (r6 == 0) goto L8a
            goto L94
        L8a:
            java.lang.String r1 = "illegal value"
            java.lang.String r0 = r0.mo6730(r1)
            androidx.collection.C1123.m1410(r0)
            return r4
        L94:
            int r3 = m6806(r0, r1, r3, r2)
            int r5 = r5 + 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.m6808(com.alibaba.fastjson2.飘花落叶言子哲楪兰世苏, char[], int, int):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲兰子世, reason: contains not printable characters */
    public static long m6809(int i, char[] cArr) {
        byte[] bArr = AbstractC3766.f9625;
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
        int i = this.f9551;
        if (i != -1) {
            char[] cArr = this.f9558;
            if (cArr.length < 8388608) {
                AbstractC3766.f9636.lazySet(AbstractC3766.f9644[i], cArr);
            }
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final int mo6659() {
        char c = this.f9538;
        int i = 0;
        if (c != '\"' && c != '\'') {
            C1123.m1410("string length only support string input");
            return 0;
        }
        int i2 = this.f9539;
        int i3 = i2 + 8;
        int i4 = this.f9557;
        char[] cArr = this.f9558;
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

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final String mo6660() {
        String str = this.f9533;
        if (str != null) {
            return str;
        }
        int i = this.f9552;
        int i2 = this.f9553;
        int i3 = i - i2;
        boolean z = this.f9543;
        char[] cArr = this.f9558;
        if (!z) {
            return new String(cArr, i2, i3);
        }
        char[] cArr2 = new char[this.f9555];
        int i4 = 0;
        while (true) {
            char cM6255 = cArr[i2];
            if (cM6255 == '\\') {
                int i5 = i2 + 1;
                char c = cArr[i5];
                if (c == '\"' || c == '\\') {
                    i2 = i5;
                    cM6255 = c;
                } else if (c == 'u') {
                    int i6 = i2 + 2;
                    C3737.m6831(i6, this.f9557);
                    cM6255 = (char) AbstractC3682.m6255(i6, cArr);
                    i2 += 5;
                } else if (c != 'x') {
                    cM6255 = m6721(c);
                    i2 = i5;
                } else {
                    char c2 = cArr[i2 + 2];
                    i2 += 3;
                    cM6255 = AbstractC3732.m6655(c2, cArr[i2]);
                }
            } else if (cM6255 == '\"') {
                String str2 = new String(cArr2);
                this.f9533 = str2;
                return str2;
            }
            cArr2[i4] = cM6255;
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final java.lang.String mo6664() {
        /*
            r9 = this;
            boolean r0 = r9.f9543
            char[] r1 = r9.f9558
            if (r0 != 0) goto L1c
            int r0 = r9.f9553
            java.lang.String r2 = r9.f9559
            if (r2 == 0) goto L13
            int r9 = r9.f9552
            java.lang.String r9 = r2.substring(r0, r9)
            return r9
        L13:
            java.lang.String r2 = new java.lang.String
            int r9 = r9.f9552
            int r9 = r9 - r0
            r2.<init>(r1, r0, r9)
            return r2
        L1c:
            int r0 = r9.f9555
            char[] r0 = new char[r0]
            int r2 = r9.f9553
            r3 = 0
        L23:
            int r4 = r9.f9552
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
            char r2 = r9.m6721(r7)
            r8 = r4
            r4 = r2
            r2 = r8
            goto L77
        L55:
            int r4 = r2 + 2
            char r4 = r1[r4]
            int r2 = r2 + 3
            char r5 = r1[r2]
            char r4 = com.alibaba.fastjson2.AbstractC3732.m6655(r4, r5)
            goto L77
        L62:
            int r4 = r2 + 2
            int r5 = r9.f9557
            com.alibaba.fastjson2.C3737.m6831(r4, r5)
            int r4 = com.alibaba.fastjson2.util.AbstractC3682.m6255(r4, r1)
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
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6664():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final long mo6666() {
        int i;
        char c;
        char c2;
        long j;
        long j2;
        int i2 = this.f9553;
        char c3 = '\"';
        char[] cArr = this.f9558;
        char c4 = (i2 <= 0 || cArr[i2 + (-1)] != '\'') ? '\"' : '\'';
        int i3 = 0;
        long j3 = 0;
        while (true) {
            i = this.f9557;
            if (i2 < i) {
                char cM6255 = cArr[i2];
                if (cM6255 == '\\') {
                    int i4 = i2 + 1;
                    char c5 = cArr[i4];
                    if (c5 == 'u') {
                        int i5 = i2 + 2;
                        C3737.m6831(i5, i);
                        cM6255 = (char) AbstractC3682.m6255(i5, cArr);
                        i2 += 5;
                    } else if (c5 != 'x') {
                        cM6255 = m6721(c5);
                        i2 = i4;
                    } else {
                        char c6 = cArr[i2 + 2];
                        i2 += 3;
                        cM6255 = AbstractC3732.m6655(c6, cArr[i2]);
                    }
                } else if (cM6255 == c4) {
                }
                if (cM6255 <= 255 && i3 < 8 && (i3 != 0 || cM6255 != 0)) {
                    if ((cM6255 != '_' && cM6255 != '-' && cM6255 != ' ') || (c2 = cArr[i2 + 1]) == '\"' || c2 == '\'' || c2 == cM6255) {
                        if (cM6255 >= 'A' && cM6255 <= 'Z') {
                            cM6255 = (char) (cM6255 + ' ');
                        }
                        switch (i3) {
                            case 0:
                                j3 = (byte) cM6255;
                                break;
                            case 1:
                                j = ((byte) cM6255) << 8;
                                j2 = 255;
                                j3 = (j3 & j2) + j;
                                break;
                            case 2:
                                j = ((byte) cM6255) << 16;
                                j2 = 65535;
                                j3 = (j3 & j2) + j;
                                break;
                            case 3:
                                j = ((byte) cM6255) << 24;
                                j2 = 16777215;
                                j3 = (j3 & j2) + j;
                                break;
                            case 4:
                                j = ((long) ((byte) cM6255)) << 32;
                                j2 = 4294967295L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 5:
                                j = ((long) ((byte) cM6255)) << 40;
                                j2 = 1099511627775L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 6:
                                j = ((long) ((byte) cM6255)) << 48;
                                j2 = 281474976710655L;
                                j3 = (j3 & j2) + j;
                                break;
                            case 7:
                                j = ((long) ((byte) cM6255)) << 56;
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
        i2 = this.f9553;
        j3 = 0;
        if (j3 != 0) {
            return j3;
        }
        long j4 = -3750763034362895579L;
        while (i2 < i) {
            char cM62552 = cArr[i2];
            if (cM62552 == '\\') {
                int i6 = i2 + 1;
                char c7 = cArr[i6];
                if (c7 == 'u') {
                    int i7 = i2 + 2;
                    C3737.m6831(i7, i);
                    cM62552 = (char) AbstractC3682.m6255(i7, cArr);
                    i2 += 5;
                } else if (c7 != 'x') {
                    cM62552 = m6721(c7);
                    i2 = i6;
                } else {
                    char c8 = cArr[i2 + 2];
                    i2 += 3;
                    cM62552 = AbstractC3732.m6655(c8, cArr[i2]);
                }
            } else if (cM62552 == c4) {
                return j4;
            }
            i2++;
            if ((cM62552 == '_' || cM62552 == '-' || cM62552 == ' ') && (c = cArr[i2]) != c3) {
                if (c == '\'' || c == cM62552) {
                }
                c3 = '\"';
            }
            if (cM62552 >= 'A' && cM62552 <= 'Z') {
                cM62552 = (char) (cM62552 + ' ');
            }
            j4 = 1099511628211L * (j4 ^ ((long) cM62552));
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏 */
    public final boolean mo6668() {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6668():boolean");
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.math.BigDecimal mo6671() {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6671():java.math.BigDecimal");
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0208, code lost:
    
        r14 = -r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0202  */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float mo6674() {
        int i;
        char c;
        long j;
        long j2;
        long j3;
        int i2;
        float f;
        char c2;
        int i3;
        char c3;
        float fM6501;
        boolean z;
        float f2;
        boolean z2;
        int i4;
        char c4;
        int i5;
        char c5;
        int iM6281;
        int iM62812;
        int i6;
        char c6;
        char c7 = this.f9538;
        int i7 = this.f9539;
        char[] cArr = this.f9558;
        int i8 = this.f9557;
        if (c7 != '\"' && c7 != '\'') {
            i = i7;
            c = c7;
            c7 = 0;
        } else if (i7 == i8) {
            i = i7;
            c = 26;
        } else {
            i = i7 + 1;
            c = cArr[i7];
        }
        long j4 = 0;
        if (c7 == 0 || c != c7) {
            if (c < '0' || c > '9') {
                j = 1;
                j2 = (c == '-' || c == '+') ? 0L : 1L;
            } else {
                j = 1;
                j2 = '0' - c;
            }
            while (true) {
                j3 = j4;
                i2 = -1;
                if (j2 > j4 || i + 1 >= i8 || (iM62812 = AbstractC3682.m6281(i, cArr)) == -1) {
                    break;
                }
                if (-92233720368547758L <= j2) {
                    j2 = (j2 * 100) - ((long) iM62812);
                    i += 2;
                } else {
                    j2 = j;
                }
                j4 = j3;
            }
            if (j2 > j4 || i >= i8) {
                f = 0.0f;
                c2 = c;
            } else {
                c2 = cArr[i];
                if (!AbstractC3682.m6250(c2)) {
                    f = 0.0f;
                } else if (-922337203685477580L <= j2) {
                    f = 0.0f;
                    j2 = ((j2 * 10) + 48) - ((long) c2);
                    i++;
                } else {
                    f = 0.0f;
                    j2 = j;
                }
            }
            if (j2 > j3 || i >= i8 || cArr[i] != '.') {
                i3 = 0;
            } else {
                i++;
                i3 = 0;
                while (j2 <= j3 && i + 1 < i8 && (iM6281 = AbstractC3682.m6281(i, cArr)) != i2) {
                    if (-92233720368547758L <= j2) {
                        j2 = (j2 * 100) - ((long) iM6281);
                        i += 2;
                        i3 += 2;
                        i2 = -1;
                    } else {
                        j2 = j;
                    }
                }
                if (j2 <= j3 && i < i8) {
                    c2 = cArr[i];
                    if (AbstractC3682.m6250(c2)) {
                        if (-922337203685477580L <= j2) {
                            j2 = ((j2 * 10) + 48) - ((long) c2);
                            i++;
                            i3++;
                        } else {
                            j2 = j;
                        }
                    }
                }
            }
            if (j2 <= j3) {
                if (i == i8) {
                    c2 = 26;
                } else {
                    c2 = cArr[i];
                    i++;
                }
            }
            if (j2 <= j3) {
                if (c2 == 'e' || c2 == 'E') {
                    if (i == i8) {
                        i5 = i;
                        c5 = 26;
                    } else {
                        i5 = i + 1;
                        c5 = cArr[i];
                    }
                    boolean z3 = c5 == '-';
                    if (z3 || c5 == '+') {
                        if (i5 == i8) {
                            c5 = 26;
                        } else {
                            int i9 = i5 + 1;
                            char c8 = cArr[i5];
                            i5 = i9;
                            c5 = c8;
                        }
                    } else if (c5 == ',') {
                        throw m6698();
                    }
                    if (AbstractC3682.m6250(c5)) {
                        int i10 = c5 - '0';
                        while (i5 < i8) {
                            char c9 = cArr[i5];
                            if (!AbstractC3682.m6250(c9)) {
                                break;
                            }
                            i10 = (i10 * 10) + (c9 - '0');
                            if (i10 > 2047) {
                                C1123.m1410(AbstractC7012.m12147(i10, "too large exp value : "));
                                return f;
                            }
                            i5++;
                        }
                        if (z3) {
                            i10 = -i10;
                        }
                        i3 -= i10;
                        if (i5 == i8) {
                            i = i5;
                            c2 = 26;
                        } else {
                            i = i5 + 1;
                            c2 = cArr[i5];
                        }
                    } else {
                        int i11 = i5;
                        c2 = c5;
                        i = i11;
                        j2 = j;
                    }
                } else if (c2 == 'L' || c2 == 'F' || c2 == 'D' || c2 == 'B' || c2 == 'S') {
                    if (i == i8) {
                        c2 = 26;
                    } else {
                        c2 = cArr[i];
                        i++;
                    }
                }
            }
            if (j2 <= j3 && c7 != 0) {
                if (c2 == c7) {
                    if (i == i8) {
                        i4 = i;
                        c4 = 26;
                    } else {
                        i4 = i + 1;
                        c4 = cArr[i];
                    }
                    c2 = c4;
                    i = i4;
                } else {
                    j2 = j;
                }
            }
            if (j2 <= j3) {
                if (i3 == 0) {
                    f2 = j2;
                } else {
                    float f3 = j2;
                    if (((long) f3) == j2) {
                        if (i3 > 0) {
                            float[] fArr = AbstractC3766.f9646;
                            if (i3 < 11) {
                                f2 = f3 / fArr[i3];
                            } else if (i3 < 0) {
                                float[] fArr2 = AbstractC3766.f9646;
                                if (i3 > -11) {
                                    f2 = f3 * fArr2[-i3];
                                }
                            }
                        }
                    }
                    f2 = f;
                    z2 = false;
                    if (z2) {
                        if (i3 <= 0 || i3 >= 128) {
                            c3 = c2;
                            fM6501 = f2;
                            j2 = j;
                        } else {
                            fM6501 = AbstractC3700.m6501(c == '-' ? -1 : 1, i3, Math.abs(j2));
                            c3 = c2;
                        }
                    } else if (c != '-') {
                        c3 = c2;
                        fM6501 = f2;
                    } else {
                        c3 = c2;
                        fM6501 = f2;
                    }
                }
                z2 = true;
                if (z2) {
                }
            } else {
                c3 = c2;
                fM6501 = f;
            }
            z = false;
        } else {
            if (i == i8) {
                c3 = 26;
            } else {
                c3 = cArr[i];
                i++;
            }
            j2 = 0;
            j3 = 0;
            z = true;
            fM6501 = 0.0f;
            j = 1;
        }
        if (j2 > j3) {
            mo6755();
            return (float) m6665();
        }
        while (c3 <= ' ' && ((j << c3) & 4294981376L) != j3) {
            if (i == i8) {
                c3 = 26;
            } else {
                c3 = cArr[i];
                i++;
            }
        }
        boolean z4 = c3 == ',';
        this.f9542 = z4;
        if (z4) {
            if (i == i8) {
                i6 = i;
                c6 = 26;
            } else {
                i6 = i + 1;
                c6 = cArr[i];
            }
            loop1: while (true) {
                char c10 = c6;
                i = i6;
                c3 = c10;
                while (c3 <= ' ' && ((j << c3) & 4294981376L) != j3) {
                    if (i == i8) {
                        c3 = 26;
                    }
                }
                i6 = i + 1;
                c6 = cArr[i];
            }
        }
        this.f9541 = z;
        this.f9538 = c3;
        this.f9539 = i;
        return fM6501;
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] mo6675() {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6675():byte[]");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世 */
    public final boolean mo6679() {
        int i;
        char c;
        int i2 = this.f9539;
        if (this.f9538 == 'n') {
            char[] cArr = this.f9558;
            if (cArr[i2] == 'u' && cArr[i2 + 1] == 'l' && cArr[i2 + 2] == 'l') {
                int i3 = i2 + 3;
                int i4 = this.f9557;
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
                this.f9542 = z;
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
                this.f9538 = c2;
                this.f9539 = i5;
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String mo6686() {
        char[] cArr;
        int i;
        int i2;
        char c;
        char[] cArr2;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        char[] cArr3;
        int i3;
        int i4;
        String str;
        char c2 = this.f9538;
        C3776 c3776 = this.f9546;
        if (c2 == '\'' && (c3776.f9665 & JSONReader$Feature.DisableSingleQuote.mask) != 0) {
            throw m6709();
        }
        if (c2 != '\"' && c2 != '\'') {
            if ((c3776.f9665 & JSONReader$Feature.AllowUnQuotedFieldNames.mask) == 0 || !AbstractC3732.m6656(c2)) {
                return null;
            }
            return m6676();
        }
        int i5 = 0;
        this.f9543 = false;
        int i6 = this.f9539;
        this.f9553 = i6;
        int i7 = i6;
        while (true) {
            cArr = this.f9558;
            int i8 = this.f9557;
            if (i7 >= i8) {
                break;
            }
            char c3 = cArr[i7];
            if (c3 == '\\') {
                this.f9543 = true;
                char c4 = cArr[i7 + 1];
                i7 += c4 == 'u' ? 6 : c4 == 'x' ? 4 : 2;
            } else if (c3 == c2) {
                this.f9555 = i5;
                this.f9552 = i7;
                int i9 = i7 + 1;
                char c5 = i9 < i8 ? cArr[i9] : (char) 26;
                while (c5 <= ' ' && ((1 << c5) & 4294981376L) != 0) {
                    i9++;
                    c5 = cArr[i9];
                }
                if (c5 != ':') {
                    C1123.m1410(AbstractC7012.m12147(i9, "syntax error : "));
                    return null;
                }
                i7 = i9 + 1;
                char c6 = i7 == i8 ? (char) 26 : cArr[i7];
                while (c6 <= ' ' && ((1 << c6) & 4294981376L) != 0) {
                    i7++;
                    c6 = cArr[i7];
                }
                this.f9539 = i7 + 1;
                this.f9538 = c6;
            } else {
                i7++;
            }
            i5++;
        }
        int i10 = this.f9552;
        if (i10 < i6) {
            C1123.m1410(AbstractC7012.m12147(i7, "syntax error : "));
            return null;
        }
        if (!this.f9543) {
            switch (this.f9555) {
                case 1:
                    return AbstractC3700.m6463(cArr[i6]);
                case 2:
                    return AbstractC3700.m6462(cArr[i6], cArr[i6 + 1]);
                case 3:
                    i = i10;
                    i2 = i6;
                    c = ' ';
                    cArr2 = cArr;
                    j = -1;
                    char c7 = cArr2[i2];
                    char c8 = cArr2[i2 + 1];
                    char c9 = cArr2[i2 + 2];
                    if ((c7 & 255) == c7 && (c8 & 255) == c8 && (c9 & 255) == c9) {
                        j2 = (c9 << 16) + (c8 << '\b') + c7;
                        j3 = j2;
                        j4 = j;
                        String str2 = this.f9559;
                        if (j3 == j) {
                            cArr3 = cArr2;
                            i3 = i;
                            i4 = i2;
                        } else if (j4 != j) {
                            long j9 = j3 ^ j4;
                            int i11 = (int) (j9 ^ (j9 >>> c));
                            C3762[] c3762Arr = AbstractC3766.f9650;
                            int i12 = i11 & 8191;
                            C3762 c3762 = c3762Arr[i12];
                            if (c3762 == null) {
                                if (str2 != null) {
                                    str = str2.substring(i2, i);
                                } else {
                                    int i13 = i2;
                                    str = new String(cArr2, i13, i - i13);
                                }
                                String str3 = str;
                                c3762Arr[i12] = new C3762(str3, j3, j4);
                                return str3;
                            }
                            cArr3 = cArr2;
                            i3 = i;
                            i4 = i2;
                            if (c3762.f9623 == j3 && c3762.f9622 == j4) {
                                return (String) c3762.f9621;
                            }
                        } else {
                            cArr3 = cArr2;
                            i3 = i;
                            i4 = i2;
                            C3329[] c3329Arr = AbstractC3766.f9649;
                            int i14 = ((int) ((j3 >>> c) ^ j3)) & 8191;
                            C3329 c3329 = c3329Arr[i14];
                            if (c3329 == null) {
                                String strSubstring = str2 != null ? str2.substring(i4, i3) : new String(cArr3, i4, i3 - i4);
                                c3329Arr[i14] = new C3329(strSubstring, j3);
                                return strSubstring;
                            }
                            if (c3329.f7820 == j3) {
                                return (String) c3329.f7819;
                            }
                        }
                        return str2 != null ? str2.substring(i4, i3) : new String(cArr3, i4, i3 - i4);
                    }
                    j3 = j;
                    j4 = j3;
                    String str22 = this.f9559;
                    if (j3 == j) {
                    }
                    if (str22 != null) {
                    }
                    break;
                case 4:
                    i = i10;
                    i2 = i6;
                    c = ' ';
                    cArr2 = cArr;
                    j = -1;
                    char c10 = cArr2[i2];
                    char c11 = cArr2[i2 + 1];
                    char c12 = cArr2[i2 + 2];
                    char c13 = cArr2[i2 + 3];
                    if ((c10 & 255) == c10 && (c11 & 255) == c11 && (c12 & 255) == c12 && (c13 & 255) == c13) {
                        j2 = (c13 << 24) + (c12 << 16) + (c11 << '\b') + c10;
                        j3 = j2;
                        j4 = j;
                        String str222 = this.f9559;
                        if (j3 == j) {
                        }
                        if (str222 != null) {
                        }
                    }
                    j3 = j;
                    j4 = j3;
                    String str2222 = this.f9559;
                    if (j3 == j) {
                    }
                    if (str2222 != null) {
                    }
                    break;
                case 5:
                    i = i10;
                    i2 = i6;
                    c = ' ';
                    cArr2 = cArr;
                    j = -1;
                    char c14 = cArr2[i2];
                    char c15 = cArr2[i2 + 1];
                    char c16 = cArr2[i2 + 2];
                    char c17 = cArr2[i2 + 3];
                    char c18 = cArr2[i2 + 4];
                    if ((c14 & 255) == c14 && (c15 & 255) == c15 && (c16 & 255) == c16 && (c17 & 255) == c17 && (c18 & 255) == c18) {
                        j2 = (((long) c18) << 32) + (((long) c17) << 24) + (((long) c16) << 16) + (((long) c15) << 8) + ((long) c14);
                        j3 = j2;
                        j4 = j;
                        String str22222 = this.f9559;
                        if (j3 == j) {
                        }
                        if (str22222 != null) {
                        }
                    }
                    j3 = j;
                    j4 = j3;
                    String str222222 = this.f9559;
                    if (j3 == j) {
                    }
                    if (str222222 != null) {
                    }
                    break;
                case 6:
                    i = i10;
                    i2 = i6;
                    c = ' ';
                    cArr2 = cArr;
                    j = -1;
                    char c19 = cArr2[i2];
                    char c20 = cArr2[i2 + 1];
                    char c21 = cArr2[i2 + 2];
                    char c22 = cArr2[i2 + 3];
                    char c23 = cArr2[i2 + 4];
                    char c24 = cArr2[i2 + 5];
                    if ((c19 & 255) == c19 && (c20 & 255) == c20 && (c21 & 255) == c21 && (c22 & 255) == c22 && (c23 & 255) == c23 && (c24 & 255) == c24) {
                        j2 = (((long) c24) << 40) + (((long) c23) << 32) + (((long) c22) << 24) + (((long) c21) << 16) + (((long) c20) << 8) + ((long) c19);
                        j3 = j2;
                        j4 = j;
                        String str2222222 = this.f9559;
                        if (j3 == j) {
                        }
                        if (str2222222 != null) {
                        }
                    }
                    j3 = j;
                    j4 = j3;
                    String str22222222 = this.f9559;
                    if (j3 == j) {
                    }
                    if (str22222222 != null) {
                    }
                    break;
                case 7:
                    i = i10;
                    i2 = i6;
                    c = ' ';
                    cArr2 = cArr;
                    j = -1;
                    char c25 = cArr2[i2];
                    char c26 = cArr2[i2 + 1];
                    char c27 = cArr2[i2 + 2];
                    char c28 = cArr2[i2 + 3];
                    char c29 = cArr2[i2 + 4];
                    char c30 = cArr2[i2 + 5];
                    char c31 = cArr2[i2 + 6];
                    if ((c25 & 255) == c25 && (c26 & 255) == c26 && (c27 & 255) == c27 && (c28 & 255) == c28 && (c29 & 255) == c29 && (c30 & 255) == c30 && (c31 & 255) == c31) {
                        j2 = (((long) c31) << 48) + (((long) c30) << 40) + (((long) c29) << 32) + (((long) c28) << 24) + (((long) c27) << 16) + (((long) c26) << 8) + ((long) c25);
                        j3 = j2;
                        j4 = j;
                        String str222222222 = this.f9559;
                        if (j3 == j) {
                        }
                        if (str222222222 != null) {
                        }
                    }
                    j3 = j;
                    j4 = j3;
                    String str2222222222 = this.f9559;
                    if (j3 == j) {
                    }
                    if (str2222222222 != null) {
                    }
                    break;
                case 8:
                    i = i10;
                    i2 = i6;
                    c = ' ';
                    cArr2 = cArr;
                    j = -1;
                    char c32 = cArr2[i2];
                    char c33 = cArr2[i2 + 1];
                    char c34 = cArr2[i2 + 2];
                    char c35 = cArr2[i2 + 3];
                    char c36 = cArr2[i2 + 4];
                    char c37 = cArr2[i2 + 5];
                    char c38 = cArr2[i2 + 6];
                    char c39 = cArr2[i2 + 7];
                    if ((c32 & 255) == c32 && (c33 & 255) == c33 && (c34 & 255) == c34 && (c35 & 255) == c35 && (c36 & 255) == c36 && (c37 & 255) == c37 && (c38 & 255) == c38 && (c39 & 255) == c39) {
                        j2 = (((long) c39) << 56) + (((long) c38) << 48) + (((long) c37) << 40) + (((long) c36) << 32) + (((long) c35) << 24) + (((long) c34) << 16) + (((long) c33) << 8) + ((long) c32);
                        j3 = j2;
                        j4 = j;
                        String str22222222222 = this.f9559;
                        if (j3 == j) {
                        }
                        if (str22222222222 != null) {
                        }
                    }
                    j3 = j;
                    j4 = j3;
                    String str222222222222 = this.f9559;
                    if (j3 == j) {
                    }
                    if (str222222222222 != null) {
                    }
                    break;
                case 9:
                    i = i10;
                    i2 = i6;
                    c = ' ';
                    cArr2 = cArr;
                    j = -1;
                    char c40 = cArr2[i2];
                    char c41 = cArr2[i2 + 1];
                    char c42 = cArr2[i2 + 2];
                    char c43 = cArr2[i2 + 3];
                    char c44 = cArr2[i2 + 4];
                    char c45 = cArr2[i2 + 5];
                    char c46 = cArr2[i2 + 6];
                    char c47 = cArr2[i2 + 7];
                    char c48 = cArr2[i2 + 8];
                    if ((c40 & 255) == c40 && (c41 & 255) == c41 && (c42 & 255) == c42 && (c43 & 255) == c43 && (c44 & 255) == c44 && (c45 & 255) == c45 && (c46 & 255) == c46 && (c47 & 255) == c47 && (c48 & 255) == c48) {
                        j4 = (((long) c48) << 56) + (((long) c47) << 48) + (((long) c46) << 40) + (((long) c45) << 32) + (((long) c44) << 24) + (((long) c43) << 16) + (((long) c42) << 8) + ((long) c41);
                        j3 = c40;
                    } else {
                        j3 = j;
                        j4 = j3;
                    }
                    String str2222222222222 = this.f9559;
                    if (j3 == j) {
                    }
                    if (str2222222222222 != null) {
                    }
                    break;
                case 10:
                    i = i10;
                    i2 = i6;
                    c = ' ';
                    cArr2 = cArr;
                    j = -1;
                    char c49 = cArr2[i2];
                    char c50 = cArr2[i2 + 1];
                    char c51 = cArr2[i2 + 2];
                    char c52 = cArr2[i2 + 3];
                    char c53 = cArr2[i2 + 4];
                    char c54 = cArr2[i2 + 5];
                    char c55 = cArr2[i2 + 6];
                    char c56 = cArr2[i2 + 7];
                    char c57 = cArr2[i2 + 8];
                    char c58 = cArr2[i2 + 9];
                    if ((c49 & 255) == c49 && (c50 & 255) == c50 && (c51 & 255) == c51 && (c52 & 255) == c52 && (c53 & 255) == c53 && (c54 & 255) == c54 && (c55 & 255) == c55 && (c56 & 255) == c56 && (c57 & 255) == c57 && (c58 & 255) == c58) {
                        j5 = (c50 << '\b') + c49;
                        j6 = ((long) c51) + (((long) c58) << 56) + (((long) c57) << 48) + (((long) c56) << 40) + (((long) c55) << 32) + (((long) c54) << 24) + (((long) c53) << 16) + (((long) c52) << 8);
                        j4 = j6;
                        j3 = j5;
                        String str22222222222222 = this.f9559;
                        if (j3 == j) {
                        }
                        if (str22222222222222 != null) {
                        }
                    }
                    j3 = j;
                    j4 = j3;
                    String str222222222222222 = this.f9559;
                    if (j3 == j) {
                    }
                    if (str222222222222222 != null) {
                    }
                    break;
                case 11:
                    i = i10;
                    i2 = i6;
                    c = ' ';
                    cArr2 = cArr;
                    j = -1;
                    char c59 = cArr2[i2];
                    char c60 = cArr2[i2 + 1];
                    char c61 = cArr2[i2 + 2];
                    char c62 = cArr2[i2 + 3];
                    char c63 = cArr2[i2 + 4];
                    char c64 = cArr2[i2 + 5];
                    char c65 = cArr2[i2 + 6];
                    char c66 = cArr2[i2 + 7];
                    char c67 = cArr2[i2 + 8];
                    char c68 = cArr2[i2 + 9];
                    char c69 = cArr2[i2 + 10];
                    if ((c59 & 255) == c59 && (c60 & 255) == c60 && (c61 & 255) == c61 && (c62 & 255) == c62 && (c63 & 255) == c63 && (c64 & 255) == c64 && (c65 & 255) == c65 && (c66 & 255) == c66 && (c67 & 255) == c67 && (c68 & 255) == c68 && (c69 & 255) == c69) {
                        j5 = (c61 << 16) + (c60 << '\b') + c59;
                        j6 = ((long) c62) + (((long) c69) << 56) + (((long) c68) << 48) + (((long) c67) << 40) + (((long) c66) << 32) + (((long) c65) << 24) + (((long) c64) << 16) + (((long) c63) << 8);
                        j4 = j6;
                        j3 = j5;
                        String str2222222222222222 = this.f9559;
                        if (j3 == j) {
                        }
                        if (str2222222222222222 != null) {
                        }
                    }
                    j3 = j;
                    j4 = j3;
                    String str22222222222222222 = this.f9559;
                    if (j3 == j) {
                    }
                    if (str22222222222222222 != null) {
                    }
                    break;
                case 12:
                    i = i10;
                    i2 = i6;
                    c = ' ';
                    cArr2 = cArr;
                    j = -1;
                    char c70 = cArr2[i2];
                    char c71 = cArr2[i2 + 1];
                    char c72 = cArr2[i2 + 2];
                    char c73 = cArr2[i2 + 3];
                    char c74 = cArr2[i2 + 4];
                    char c75 = cArr2[i2 + 5];
                    char c76 = cArr2[i2 + 6];
                    char c77 = cArr2[i2 + 7];
                    char c78 = cArr2[i2 + 8];
                    char c79 = cArr2[i2 + 9];
                    char c80 = cArr2[i2 + 10];
                    char c81 = cArr2[i2 + 11];
                    if ((c70 & 255) == c70 && (c71 & 255) == c71 && (c72 & 255) == c72 && (c73 & 255) == c73 && (c74 & 255) == c74 && (c75 & 255) == c75 && (c76 & 255) == c76 && (c77 & 255) == c77 && (c78 & 255) == c78 && (c79 & 255) == c79 && (c80 & 255) == c80 && (c81 & 255) == c81) {
                        j5 = (c73 << 24) + (c72 << 16) + (c71 << '\b') + c70;
                        j7 = (((long) c81) << 56) + (((long) c80) << 48) + (((long) c79) << 40) + (((long) c78) << 32) + (((long) c77) << 24) + (((long) c76) << 16) + (((long) c75) << 8);
                        j8 = c74;
                        j6 = j7 + j8;
                        j4 = j6;
                        j3 = j5;
                        String str222222222222222222 = this.f9559;
                        if (j3 == j) {
                        }
                        if (str222222222222222222 != null) {
                        }
                    }
                    j3 = j;
                    j4 = j3;
                    String str2222222222222222222 = this.f9559;
                    if (j3 == j) {
                    }
                    if (str2222222222222222222 != null) {
                    }
                    break;
                case 13:
                    i = i10;
                    i2 = i6;
                    c = ' ';
                    cArr2 = cArr;
                    j = -1;
                    char c82 = cArr2[i2];
                    char c83 = cArr2[i2 + 1];
                    char c84 = cArr2[i2 + 2];
                    char c85 = cArr2[i2 + 3];
                    char c86 = cArr2[i2 + 4];
                    char c87 = cArr2[i2 + 5];
                    char c88 = cArr2[i2 + 6];
                    char c89 = cArr2[i2 + 7];
                    char c90 = cArr2[i2 + 8];
                    char c91 = cArr2[i2 + 9];
                    char c92 = cArr2[i2 + 10];
                    char c93 = cArr2[i2 + 11];
                    char c94 = cArr2[i2 + 12];
                    if ((c82 & 255) == c82 && (c83 & 255) == c83 && (c84 & 255) == c84 && (c85 & 255) == c85 && (c86 & 255) == c86 && (c87 & 255) == c87 && (c88 & 255) == c88 && (c89 & 255) == c89 && (c90 & 255) == c90 && (c91 & 255) == c91 && (c92 & 255) == c92 && (c93 & 255) == c93 && (c94 & 255) == c94) {
                        j5 = ((long) c82) + (((long) c86) << 32) + (((long) c85) << 24) + (((long) c84) << 16) + (((long) c83) << 8);
                        j7 = (((long) c94) << 56) + (((long) c93) << 48) + (((long) c92) << 40) + (((long) c91) << 32) + (((long) c90) << 24) + (((long) c89) << 16) + (((long) c88) << 8);
                        j8 = c87;
                        j6 = j7 + j8;
                        j4 = j6;
                        j3 = j5;
                        String str22222222222222222222 = this.f9559;
                        if (j3 == j) {
                        }
                        if (str22222222222222222222 != null) {
                        }
                    }
                    j3 = j;
                    j4 = j3;
                    String str222222222222222222222 = this.f9559;
                    if (j3 == j) {
                    }
                    if (str222222222222222222222 != null) {
                    }
                    break;
                case 14:
                    i = i10;
                    i2 = i6;
                    c = ' ';
                    cArr2 = cArr;
                    j = -1;
                    char c95 = cArr2[i2];
                    char c96 = cArr2[i2 + 1];
                    char c97 = cArr2[i2 + 2];
                    char c98 = cArr2[i2 + 3];
                    char c99 = cArr2[i2 + 4];
                    char c100 = cArr2[i2 + 5];
                    char c101 = cArr2[i2 + 6];
                    char c102 = cArr2[i2 + 7];
                    char c103 = cArr2[i2 + 8];
                    char c104 = cArr2[i2 + 9];
                    char c105 = cArr2[i2 + 10];
                    char c106 = cArr2[i2 + 11];
                    char c107 = cArr2[i2 + 12];
                    char c108 = cArr2[i2 + 13];
                    if ((c95 & 255) == c95 && (c96 & 255) == c96 && (c97 & 255) == c97 && (c98 & 255) == c98 && (c99 & 255) == c99 && (c100 & 255) == c100 && (c101 & 255) == c101 && (c102 & 255) == c102 && (c103 & 255) == c103 && (c104 & 255) == c104 && (c105 & 255) == c105 && (c106 & 255) == c106 && (c107 & 255) == c107 && (c108 & 255) == c108) {
                        j5 = ((long) c95) + (((long) c100) << 40) + (((long) c99) << 32) + (((long) c98) << 24) + (((long) c97) << 16) + (((long) c96) << 8);
                        j7 = (((long) c108) << 56) + (((long) c107) << 48) + (((long) c106) << 40) + (((long) c105) << 32) + (((long) c104) << 24) + (((long) c103) << 16) + (((long) c102) << 8);
                        j8 = c101;
                        j6 = j7 + j8;
                        j4 = j6;
                        j3 = j5;
                        String str2222222222222222222222 = this.f9559;
                        if (j3 == j) {
                        }
                        if (str2222222222222222222222 != null) {
                        }
                    }
                    j3 = j;
                    j4 = j3;
                    String str22222222222222222222222 = this.f9559;
                    if (j3 == j) {
                    }
                    if (str22222222222222222222222 != null) {
                    }
                    break;
                case 15:
                    i = i10;
                    i2 = i6;
                    c = ' ';
                    cArr2 = cArr;
                    j = -1;
                    char c109 = cArr2[i2];
                    char c110 = cArr2[i2 + 1];
                    char c111 = cArr2[i2 + 2];
                    char c112 = cArr2[i2 + 3];
                    char c113 = cArr2[i2 + 4];
                    char c114 = cArr2[i2 + 5];
                    char c115 = cArr2[i2 + 6];
                    char c116 = cArr2[i2 + 7];
                    char c117 = cArr2[i2 + 8];
                    char c118 = cArr2[i2 + 9];
                    char c119 = cArr2[i2 + 10];
                    char c120 = cArr2[i2 + 11];
                    char c121 = cArr2[i2 + 12];
                    char c122 = cArr2[i2 + 13];
                    char c123 = cArr2[i2 + 14];
                    if ((c109 & 255) == c109 && (c110 & 255) == c110 && (c111 & 255) == c111 && (c112 & 255) == c112 && (c113 & 255) == c113 && (c114 & 255) == c114 && (c115 & 255) == c115 && (c116 & 255) == c116 && (c117 & 255) == c117 && (c118 & 255) == c118 && (c119 & 255) == c119 && (c120 & 255) == c120 && (c121 & 255) == c121 && (c122 & 255) == c122 && (c123 & 255) == c123) {
                        j5 = ((long) c109) + (((long) c115) << 48) + (((long) c114) << 40) + (((long) c113) << 32) + (((long) c112) << 24) + (((long) c111) << 16) + (((long) c110) << 8);
                        j7 = (((long) c123) << 56) + (((long) c122) << 48) + (((long) c121) << 40) + (((long) c120) << 32) + (((long) c119) << 24) + (((long) c118) << 16) + (((long) c117) << 8);
                        j8 = c116;
                        j6 = j7 + j8;
                        j4 = j6;
                        j3 = j5;
                        String str222222222222222222222222 = this.f9559;
                        if (j3 == j) {
                        }
                        if (str222222222222222222222222 != null) {
                        }
                    }
                    j3 = j;
                    j4 = j3;
                    String str2222222222222222222222222 = this.f9559;
                    if (j3 == j) {
                    }
                    if (str2222222222222222222222222 != null) {
                    }
                    break;
                case 16:
                    char c124 = cArr[i6];
                    char c125 = cArr[i6 + 1];
                    char c126 = cArr[i6 + 2];
                    j = -1;
                    char c127 = cArr[i6 + 3];
                    char c128 = cArr[i6 + 4];
                    char c129 = cArr[i6 + 5];
                    char c130 = cArr[i6 + 6];
                    char c131 = cArr[i6 + 7];
                    c = ' ';
                    char c132 = cArr[i6 + 8];
                    char c133 = cArr[i6 + 9];
                    char c134 = cArr[i6 + 10];
                    char c135 = cArr[i6 + 11];
                    cArr2 = cArr;
                    char c136 = cArr2[i6 + 12];
                    i = i10;
                    char c137 = cArr2[i6 + 13];
                    i2 = i6;
                    char c138 = cArr2[i6 + 14];
                    char c139 = cArr2[i2 + 15];
                    if ((c124 & 255) == c124 && (c125 & 255) == c125 && (c126 & 255) == c126 && (c127 & 255) == c127 && (c128 & 255) == c128 && (c129 & 255) == c129 && (c130 & 255) == c130 && (c131 & 255) == c131 && (c132 & 255) == c132 && (c133 & 255) == c133 && (c134 & 255) == c134 && (c135 & 255) == c135 && (c136 & 255) == c136 && (c137 & 255) == c137 && (c138 & 255) == c138 && (c139 & 255) == c139) {
                        long j10 = (((long) c131) << 56) + (((long) c130) << 48) + (((long) c129) << 40) + (((long) c128) << 32) + (((long) c127) << 24) + (((long) c126) << 16) + (((long) c125) << 8) + ((long) c124);
                        j4 = (((long) c139) << 56) + (((long) c138) << 48) + (((long) c137) << 40) + (((long) c136) << 32) + (((long) c135) << 24) + (((long) c134) << 16) + (((long) c133) << 8) + ((long) c132);
                        j3 = j10;
                    }
                    String str22222222222222222222222222 = this.f9559;
                    if (j3 == j) {
                    }
                    if (str22222222222222222222222222 != null) {
                    }
                    break;
                default:
                    i = i10;
                    i2 = i6;
                    c = ' ';
                    cArr2 = cArr;
                    j = -1;
                    j3 = j;
                    j4 = j3;
                    String str222222222222222222222222222 = this.f9559;
                    if (j3 == j) {
                    }
                    if (str222222222222222222222222222 != null) {
                    }
                    break;
            }
        } else {
            return mo6664();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0209, code lost:
    
        r14 = -r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0203  */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double mo6687() {
        int i;
        char c;
        long j;
        long j2;
        long j3;
        double d;
        char c2;
        int i2;
        char c3;
        double dM6482;
        boolean z;
        char c4;
        boolean z2;
        int i3;
        char c5;
        int i4;
        char c6;
        char c7;
        int iM6281;
        int iM62812;
        int i5;
        char c8;
        char c9 = this.f9538;
        int i6 = this.f9539;
        char[] cArr = this.f9558;
        int i7 = this.f9557;
        if (c9 != '\"' && c9 != '\'') {
            i = i6;
            c = c9;
            c9 = 0;
        } else if (i6 == i7) {
            i = i6;
            c = 26;
        } else {
            i = i6 + 1;
            c = cArr[i6];
        }
        long j4 = 0;
        if (c9 == 0 || c != c9) {
            j = 1;
            j2 = (c < '0' || c > '9') ? (c == '-' || c == '+') ? 0L : 1L : '0' - c;
            while (true) {
                j3 = j4;
                if (j2 > j4 || i + 1 >= i7 || (iM62812 = AbstractC3682.m6281(i, cArr)) == -1) {
                    break;
                }
                if (-92233720368547758L <= j2) {
                    j2 = (j2 * 100) - ((long) iM62812);
                    i += 2;
                } else {
                    j2 = 1;
                }
                j4 = j3;
            }
            if (j2 > j4 || i >= i7) {
                d = 0.0d;
                c2 = c;
            } else {
                c2 = cArr[i];
                if (!AbstractC3682.m6250(c2)) {
                    d = 0.0d;
                } else if (-922337203685477580L <= j2) {
                    d = 0.0d;
                    j2 = ((j2 * 10) + 48) - ((long) c2);
                    i++;
                } else {
                    d = 0.0d;
                    j2 = 1;
                }
            }
            if (j2 > j3 || i >= i7 || cArr[i] != '.') {
                i2 = 0;
            } else {
                i++;
                i2 = 0;
                while (j2 <= j3 && i + 1 < i7 && (iM6281 = AbstractC3682.m6281(i, cArr)) != -1) {
                    if (-92233720368547758L <= j2) {
                        j2 = (j2 * 100) - ((long) iM6281);
                        i += 2;
                        i2 += 2;
                    } else {
                        j2 = 1;
                    }
                }
                if (j2 <= j3 && i < i7) {
                    c2 = cArr[i];
                    if (AbstractC3682.m6250(c2)) {
                        if (-922337203685477580L <= j2) {
                            j2 = ((j2 * 10) + 48) - ((long) c2);
                            i++;
                            i2++;
                        } else {
                            j2 = 1;
                        }
                    }
                }
            }
            if (j2 <= j3) {
                if (i == i7) {
                    c2 = 26;
                } else {
                    c2 = cArr[i];
                    i++;
                }
            }
            if (j2 <= j3) {
                if (c2 == 'e' || c2 == 'E') {
                    if (i == i7) {
                        i4 = i;
                        c6 = 26;
                    } else {
                        i4 = i + 1;
                        c6 = cArr[i];
                    }
                    boolean z3 = c6 == '-';
                    if (z3 || c6 == '+') {
                        if (i4 == i7) {
                            c6 = 26;
                        } else {
                            char c10 = cArr[i4];
                            i4++;
                            c6 = c10;
                        }
                    } else if (c6 == ',') {
                        throw m6698();
                    }
                    if (AbstractC3682.m6250(c6)) {
                        int i8 = c6 - '0';
                        while (i4 < i7) {
                            char c11 = cArr[i4];
                            if (!AbstractC3682.m6250(c11)) {
                                break;
                            }
                            i8 = (i8 * 10) + (c11 - '0');
                            if (i8 > 2047) {
                                C1123.m1410(AbstractC7012.m12147(i8, "too large exp value : "));
                                return d;
                            }
                            i4++;
                        }
                        if (z3) {
                            i8 = -i8;
                        }
                        i2 -= i8;
                        if (i4 == i7) {
                            c7 = 26;
                        } else {
                            c7 = cArr[i4];
                            i4++;
                        }
                        i = i4;
                        c2 = c7;
                    } else {
                        int i9 = i4;
                        c2 = c6;
                        i = i9;
                        j2 = 1;
                    }
                } else if (c2 == 'L' || c2 == 'F' || c2 == 'D' || c2 == 'B' || c2 == 'S') {
                    if (i == i7) {
                        c2 = 26;
                    } else {
                        c2 = cArr[i];
                        i++;
                    }
                }
            }
            if (j2 <= j3 && c9 != 0) {
                if (c2 == c9) {
                    if (i == i7) {
                        i3 = i;
                        c5 = 26;
                    } else {
                        i3 = i + 1;
                        c5 = cArr[i];
                    }
                    c2 = c5;
                    i = i3;
                } else {
                    j2 = 1;
                }
            }
            if (j2 <= j3) {
                if (i2 == 0) {
                    dM6482 = j2;
                    c4 = c2;
                } else {
                    double d2 = j2;
                    c4 = c2;
                    if (((long) d2) == j2) {
                        if (i2 > 0) {
                            double[] dArr = AbstractC3766.f9643;
                            if (i2 < 23) {
                                dM6482 = d2 / dArr[i2];
                            } else if (i2 < 0) {
                                double[] dArr2 = AbstractC3766.f9643;
                                if (i2 > -23) {
                                    dM6482 = d2 * dArr2[-i2];
                                }
                            }
                        }
                    }
                    dM6482 = d;
                    z2 = false;
                    if (z2) {
                        if (i2 <= 0 || i2 >= 64) {
                            j2 = 1;
                        } else {
                            dM6482 = AbstractC3700.m6482(c == '-' ? -1 : 1, i2, Math.abs(j2));
                        }
                    } else if (c != '-') {
                    }
                    c3 = c4;
                }
                z2 = true;
                if (z2) {
                }
                c3 = c4;
            } else {
                c3 = c2;
                dM6482 = d;
            }
            z = false;
        } else {
            if (i == i7) {
                c3 = 26;
            } else {
                c3 = cArr[i];
                i++;
            }
            j2 = 0;
            j3 = 0;
            z = true;
            dM6482 = 0.0d;
            j = 1;
        }
        if (j2 > j3) {
            mo6755();
            return m6665();
        }
        while (c3 <= ' ' && ((j << c3) & 4294981376L) != j3) {
            if (i == i7) {
                c3 = 26;
            } else {
                c3 = cArr[i];
                i++;
            }
        }
        boolean z4 = c3 == ',';
        this.f9542 = z4;
        if (z4) {
            if (i == i7) {
                i5 = i;
                c8 = 26;
            } else {
                i5 = i + 1;
                c8 = cArr[i];
            }
            loop1: while (true) {
                char c12 = c8;
                i = i5;
                c3 = c12;
                while (c3 <= ' ' && ((j << c3) & 4294981376L) != j3) {
                    if (i == i7) {
                        c3 = 26;
                    }
                }
                i5 = i + 1;
                c8 = cArr[i];
            }
        }
        this.f9541 = z;
        this.f9538 = c3;
        this.f9539 = i;
        return dM6482;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0108, code lost:
    
        r27.f9555 = r7;
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
    
        r27.f9552 = r3;
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo6688() {
        int i;
        char c;
        int i2;
        char c2;
        long j;
        long j2;
        this.f9543 = false;
        int i3 = this.f9539;
        char c3 = this.f9538;
        this.f9553 = i3 - 1;
        int i4 = 0;
        char cM6255 = c3;
        long j3 = 0;
        while (true) {
            int i5 = this.f9557;
            char[] cArr = this.f9558;
            if (i3 <= i5) {
                if (cM6255 != '\f' && cM6255 != '\r' && cM6255 != 26 && cM6255 != '&' && cM6255 != ':' && cM6255 != '[' && cM6255 != ']' && cM6255 != ' ' && cM6255 != '!') {
                    switch (cM6255) {
                        case '\b':
                        case '\t':
                        case '\n':
                            break;
                        default:
                            switch (cM6255) {
                                case '(':
                                case ')':
                                case '*':
                                case '+':
                                case ',':
                                case '-':
                                case '.':
                                case '/':
                                    break;
                                default:
                                    switch (cM6255) {
                                        case '<':
                                        case '=':
                                        case '>':
                                            break;
                                        default:
                                            switch (cM6255) {
                                                case '{':
                                                case '|':
                                                case '}':
                                                    break;
                                                default:
                                                    if (cM6255 == '\\') {
                                                        this.f9543 = true;
                                                        int i6 = i3 + 1;
                                                        char c4 = cArr[i3];
                                                        if (c4 == '\"' || c4 == ':' || c4 == '@' || c4 == '\\') {
                                                            i3 = i6;
                                                            cM6255 = c4;
                                                        } else if (c4 == 'u') {
                                                            C3737.m6831(i6, i5);
                                                            cM6255 = (char) AbstractC3682.m6255(i6, cArr);
                                                            i3 += 5;
                                                        } else if (c4 == 'x') {
                                                            cM6255 = AbstractC3732.m6655(cArr[i6], cArr[i3 + 2]);
                                                            i3 += 3;
                                                        } else if (c4 != '*' && c4 != '+') {
                                                            switch (c4) {
                                                                default:
                                                                    switch (c4) {
                                                                        case '<':
                                                                        case '=':
                                                                        case '>':
                                                                            break;
                                                                        default:
                                                                            cM6255 = m6721(c4);
                                                                            i3 = i6;
                                                                            break;
                                                                    }
                                                                case '-':
                                                                case '.':
                                                                case '/':
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                    if (cM6255 <= 255 && i4 < 8 && (i4 != 0 || cM6255 != 0)) {
                                                        byte b = (byte) cM6255;
                                                        switch (i4) {
                                                            case 0:
                                                                j3 = b;
                                                                break;
                                                            case 1:
                                                                j = b << 8;
                                                                j2 = 255;
                                                                j3 = (j3 & j2) + j;
                                                                break;
                                                            case 2:
                                                                j = b << 16;
                                                                j2 = 65535;
                                                                j3 = (j3 & j2) + j;
                                                                break;
                                                            case 3:
                                                                j = b << 24;
                                                                j2 = 16777215;
                                                                j3 = (j3 & j2) + j;
                                                                break;
                                                            case 4:
                                                                j = ((long) b) << 32;
                                                                j2 = 4294967295L;
                                                                j3 = (j3 & j2) + j;
                                                                break;
                                                            case 5:
                                                                j = ((long) b) << 40;
                                                                j2 = 1099511627775L;
                                                                j3 = (j3 & j2) + j;
                                                                break;
                                                            case 6:
                                                                j = ((long) b) << 48;
                                                                j2 = 281474976710655L;
                                                                j3 = (j3 & j2) + j;
                                                                break;
                                                            case 7:
                                                                j = ((long) b) << 56;
                                                                j2 = 72057594037927935L;
                                                                j3 = (j3 & j2) + j;
                                                                break;
                                                        }
                                                        if (i3 == i5) {
                                                            cM6255 = 26;
                                                        } else {
                                                            cM6255 = cArr[i3];
                                                            i3++;
                                                        }
                                                        i4++;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (j3 == 0) {
                        j3 = -3750763034362895579L;
                        char c5 = c3;
                        int i7 = i3;
                        int i8 = 0;
                        while (true) {
                            if (c5 == '\\') {
                                this.f9543 = true;
                                int i9 = i7 + 1;
                                char cM62552 = cArr[i7];
                                if (cM62552 != '\"' && cM62552 != ':' && cM62552 != '@' && cM62552 != '\\') {
                                    if (cM62552 != 'u') {
                                        if (cM62552 != 'x') {
                                            if (cM62552 != '*' && cM62552 != '+') {
                                                switch (cM62552) {
                                                    case '-':
                                                    case '.':
                                                    case '/':
                                                        break;
                                                    default:
                                                        switch (cM62552) {
                                                            case '<':
                                                            case '=':
                                                            case '>':
                                                                break;
                                                            default:
                                                                cM62552 = m6721(cM62552);
                                                                break;
                                                        }
                                                        break;
                                                }
                                            }
                                        } else {
                                            cM62552 = AbstractC3732.m6655(cArr[i9], cArr[i7 + 2]);
                                            i9 = i7 + 3;
                                        }
                                    } else {
                                        C3737.m6831(i9, i5);
                                        cM62552 = (char) AbstractC3682.m6255(i9, cArr);
                                        i9 = i7 + 5;
                                    }
                                    long j4 = (((long) cM62552) ^ j3) * 1099511628211L;
                                    if (i9 != i5) {
                                        i7 = i9;
                                        c5 = 26;
                                    } else {
                                        i7 = i9 + 1;
                                        c5 = cArr[i9];
                                    }
                                    j3 = j4;
                                }
                                long j42 = (((long) cM62552) ^ j3) * 1099511628211L;
                                if (i9 != i5) {
                                }
                                j3 = j42;
                            } else if (c5 != '\f' && c5 != '\r' && c5 != 26 && c5 != ':' && c5 != '[' && c5 != ']' && c5 != '{' && c5 != '}' && c5 != ' ' && c5 != '!') {
                                switch (c5) {
                                    case '\b':
                                    case '\t':
                                    case '\n':
                                        break;
                                    default:
                                        switch (c5) {
                                            case '(':
                                            case ')':
                                            case '*':
                                            case '+':
                                            case ',':
                                            case '-':
                                            case '.':
                                            case '/':
                                                break;
                                            default:
                                                switch (c5) {
                                                    case '<':
                                                    case '=':
                                                    case '>':
                                                        break;
                                                    default:
                                                        long j5 = (j3 ^ ((long) c5)) * 1099511628211L;
                                                        if (i7 == i5) {
                                                            i2 = i7;
                                                            c2 = 26;
                                                        } else {
                                                            i2 = i7 + 1;
                                                            c2 = cArr[i7];
                                                        }
                                                        j3 = j5;
                                                        c5 = c2;
                                                        i7 = i2;
                                                        continue;
                                                }
                                                break;
                                        }
                                        break;
                                }
                            }
                            i8++;
                        }
                        this.f9555 = i8;
                        this.f9552 = c5 == 26 ? i7 : i7 - 1;
                        i3 = i7;
                        c3 = c5;
                        while (c3 <= ' ' && ((1 << c3) & 4294981376L) != 0) {
                            if (i3 == i5) {
                                c3 = 26;
                            } else {
                                c3 = cArr[i3];
                                i3++;
                            }
                        }
                    }
                    if (c3 == ':') {
                        if (i3 == i5) {
                            i = i3;
                            c = 26;
                        } else {
                            i = i3 + 1;
                            c = cArr[i3];
                        }
                        int i10 = i;
                        c3 = c;
                        i3 = i10;
                        while (c3 <= ' ' && ((1 << c3) & 4294981376L) != 0) {
                            if (i3 == i5) {
                                c3 = 26;
                            } else {
                                c3 = cArr[i3];
                                i3++;
                            }
                        }
                    }
                    this.f9539 = i3;
                    this.f9538 = c3;
                    return j3;
                }
            }
        }
        i3 = this.f9553 + 1;
        j3 = 0;
        if (j3 == 0) {
        }
        if (c3 == ':') {
        }
        this.f9539 = i3;
        this.f9538 = c3;
        return j3;
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo6689() {
        int i;
        int i2;
        char[] cArr;
        char c;
        char c2;
        char c3;
        long j;
        char[] cArr2;
        int i3;
        char c4;
        char cM6255;
        int i4;
        char cM6721;
        int i5;
        int i6;
        char c5;
        int i7;
        char c6;
        long j2;
        long j3;
        char c7;
        String str;
        int i8;
        char c8 = this.f9538;
        if (c8 == '/') {
            mo6795();
            c8 = this.f9538;
        }
        C3776 c3776 = this.f9546;
        if (c8 == '\'' && (c3776.f9665 & JSONReader$Feature.DisableSingleQuote.mask) != 0) {
            throw m6709();
        }
        int i9 = this.f9557;
        char[] cArr3 = this.f9558;
        if (c8 != '\"' && c8 != '\'') {
            if ((c3776.f9665 & JSONReader$Feature.AllowUnQuotedFieldNames.mask) != 0 && AbstractC3732.m6656(c8)) {
                return mo6688();
            }
            if (c8 == '}') {
                return -1L;
            }
            if (this.f9538 == 'n' && (i8 = this.f9539) < i9 && cArr3[i8] == 'u') {
                return -1L;
            }
            if (c8 != '[' || this.f9553 <= 0) {
                str = "illegal fieldName input" + c8;
            } else {
                str = "illegal fieldName input " + c8 + ", previous fieldName " + mo6664();
            }
            C1123.m1410(mo6730(str));
            return 0L;
        }
        this.f9533 = null;
        this.f9543 = false;
        int i10 = this.f9539;
        this.f9553 = i10;
        int i11 = i10 + 9;
        if (i11 < i9) {
            c = '0';
            char c9 = cArr3[i10];
            c2 = '(';
            int i12 = i10 + 1;
            char c10 = cArr3[i12];
            int i13 = i10 + 2;
            c3 = ' ';
            char c11 = cArr3[i13];
            int i14 = i10 + 3;
            char c12 = cArr3[i14];
            int i15 = i10 + 4;
            char c13 = cArr3[i15];
            int i16 = i10 + 5;
            i = i10;
            char c14 = cArr3[i16];
            int i17 = i + 6;
            cArr = cArr3;
            char c15 = cArr[i17];
            i2 = i9;
            int i18 = i + 7;
            char c16 = cArr[i18];
            int i19 = i + 8;
            char c17 = cArr[i19];
            if (c9 != c8) {
                if (c10 != c8 || c9 == 0) {
                    c7 = c17;
                } else {
                    c7 = c17;
                    if (c9 != '\\' && c9 <= 255) {
                        j = (byte) c9;
                        this.f9555 = 1;
                        this.f9552 = i12;
                        i = i13;
                    }
                }
                if (c11 == c8 && c9 != 0 && c9 != '\\' && c10 != '\\' && c9 <= 255 && c10 <= 255) {
                    j = (((byte) c10) << 8) + c9;
                    this.f9555 = 2;
                    this.f9552 = i13;
                    i = i14;
                } else if (c12 == c8 && c9 != 0 && c9 != '\\' && c10 != '\\' && c11 != '\\' && c9 <= 255 && c10 <= 255 && c11 <= 255) {
                    j = (((byte) c11) << 16) + (c10 << '\b') + c9;
                    this.f9555 = 3;
                    this.f9552 = i14;
                    i = i15;
                } else if (c13 == c8 && c9 != 0 && c9 != '\\' && c10 != '\\' && c11 != '\\' && c12 != '\\' && c9 <= 255 && c10 <= 255 && c11 <= 255 && c12 <= 255) {
                    j = (((byte) c12) << 24) + (c11 << 16) + (c10 << '\b') + c9;
                    this.f9555 = 4;
                    this.f9552 = i15;
                    i = i16;
                } else if (c14 == c8 && c9 != 0 && c9 != '\\' && c10 != '\\' && c11 != '\\' && c12 != '\\' && c13 != '\\' && c9 <= 255 && c10 <= 255 && c11 <= 255 && c12 <= 255 && c13 <= 255) {
                    j = (((long) ((byte) c13)) << 32) + (((long) c12) << 24) + (((long) c11) << 16) + (((long) c10) << 8) + ((long) c9);
                    this.f9555 = 5;
                    this.f9552 = i16;
                    i = i17;
                } else if (c15 == c8 && c9 != 0 && c9 != '\\' && c10 != '\\' && c11 != '\\' && c12 != '\\' && c13 != '\\' && c14 != '\\' && c9 <= 255 && c10 <= 255 && c11 <= 255 && c12 <= 255 && c13 <= 255 && c14 <= 255) {
                    j = (((long) ((byte) c14)) << 40) + (((long) c13) << 32) + (((long) c12) << 24) + (((long) c11) << 16) + (((long) c10) << 8) + ((long) c9);
                    this.f9555 = 6;
                    this.f9552 = i17;
                    i = i18;
                } else if (c16 == c8 && c9 != 0 && c9 != '\\' && c10 != '\\' && c11 != '\\' && c12 != '\\' && c13 != '\\' && c14 != '\\' && c15 != '\\' && c9 <= 255 && c10 <= 255 && c11 <= 255 && c12 <= 255 && c13 <= 255 && c14 <= 255 && c15 <= 255) {
                    j = ((long) c9) + (((long) ((byte) c15)) << 48) + (((long) c14) << 40) + (((long) c13) << 32) + (((long) c12) << 24) + (((long) c11) << 16) + (((long) c10) << 8);
                    this.f9555 = 7;
                    this.f9552 = i18;
                    i = i19;
                } else if (c7 == c8 && c9 != 0 && c9 != '\\' && c10 != '\\' && c11 != '\\' && c12 != '\\' && c13 != '\\' && c14 != '\\' && c15 != '\\' && c16 != '\\' && c9 <= 255 && c10 <= 255 && c11 <= 255 && c12 <= 255 && c13 <= 255 && c14 <= 255 && c15 <= 255 && c16 <= 255) {
                    j = ((long) c9) + (((long) ((byte) c16)) << 56) + (((long) c15) << 48) + (((long) c14) << 40) + (((long) c13) << 32) + (((long) c12) << 24) + (((long) c11) << 16) + (((long) c10) << 8);
                    this.f9555 = 8;
                    this.f9552 = i19;
                    i = i11;
                }
            }
            char c18 = 'x';
            if (j != 0) {
                int i20 = i;
                i3 = i2;
                int i21 = 0;
                while (true) {
                    if (i20 >= i3) {
                        cArr2 = cArr;
                        i = i20;
                    } else {
                        char cM62552 = cArr[i20];
                        if (cM62552 == c8) {
                            if (i21 == 0) {
                                i = this.f9553;
                            } else {
                                this.f9555 = i21;
                                this.f9552 = i20;
                                i = i20 + 1;
                            }
                            cArr2 = cArr;
                        } else if (cM62552 == '\\') {
                            this.f9543 = true;
                            int i22 = i20 + 1;
                            char c19 = cArr[i22];
                            if (c19 != 'u') {
                                if (c19 != 'x') {
                                    cM62552 = m6721(c19);
                                    i20 = i22;
                                } else {
                                    char c20 = cArr[i20 + 2];
                                    i20 += 3;
                                    cM62552 = AbstractC3732.m6655(c20, cArr[i20]);
                                }
                                cArr2 = cArr;
                                if (cM62552 <= 255 && i21 < 8 && (i21 != 0 || cM62552 != 0)) {
                                    switch (i21) {
                                        case 0:
                                            j = (byte) cM62552;
                                            break;
                                        case 1:
                                            j = ((long) (((byte) cM62552) << 8)) + (j & 255);
                                            break;
                                        case 2:
                                            j2 = ((byte) cM62552) << 16;
                                            j3 = 65535;
                                            j = j2 + (j & j3);
                                            break;
                                        case 3:
                                            j2 = ((byte) cM62552) << 24;
                                            j3 = 16777215;
                                            j = j2 + (j & j3);
                                            break;
                                        case 4:
                                            j2 = ((long) ((byte) cM62552)) << c3;
                                            j3 = 4294967295L;
                                            j = j2 + (j & j3);
                                            break;
                                        case 5:
                                            j2 = ((long) ((byte) cM62552)) << c2;
                                            j3 = 1099511627775L;
                                            j = j2 + (j & j3);
                                            break;
                                        case 6:
                                            j2 = ((long) ((byte) cM62552)) << c;
                                            j3 = 281474976710655L;
                                            j = j2 + (j & j3);
                                            break;
                                        case 7:
                                            j2 = ((long) ((byte) cM62552)) << 56;
                                            j3 = 72057594037927935L;
                                            j = j2 + (j & j3);
                                            break;
                                    }
                                    i20++;
                                    i21++;
                                    cArr = cArr2;
                                }
                            } else {
                                int i23 = i20 + 2;
                                C3737.m6831(i23, i3);
                                cArr2 = cArr;
                                cM62552 = (char) AbstractC3682.m6255(i23, cArr2);
                                i20 += 5;
                                if (cM62552 <= 255) {
                                }
                            }
                        } else {
                            cArr2 = cArr;
                            if (cM62552 <= 255) {
                            }
                        }
                    }
                }
                i = this.f9553;
                j = 0;
            } else {
                cArr2 = cArr;
                i3 = i2;
            }
            if (j == 0) {
                j = -3750763034362895579L;
                int i24 = i;
                int i25 = 0;
                while (true) {
                    char c21 = cArr2[i24];
                    if (c21 == '\\') {
                        this.f9543 = true;
                        int i26 = i24 + 1;
                        char c22 = cArr2[i26];
                        if (c22 == 'u') {
                            int i27 = i24 + 2;
                            C3737.m6831(i27, i3);
                            cM6255 = (char) AbstractC3682.m6255(i27, cArr2);
                            i4 = i24 + 5;
                        } else if (c22 != c18) {
                            cM6721 = m6721(c22);
                            j = (j ^ ((long) cM6721)) * 1099511628211L;
                            i24 = i26 + 1;
                            c4 = c3;
                        } else {
                            char c23 = cArr2[i24 + 2];
                            i4 = i24 + 3;
                            cM6255 = AbstractC3732.m6655(c23, cArr2[i4]);
                        }
                        char c24 = cM6255;
                        i26 = i4;
                        cM6721 = c24;
                        j = (j ^ ((long) cM6721)) * 1099511628211L;
                        i24 = i26 + 1;
                        c4 = c3;
                    } else if (c21 == c8) {
                        this.f9555 = i25;
                        this.f9552 = i24;
                        i = i24 + 1;
                    } else {
                        c4 = c3;
                        i24++;
                        j = (j ^ ((long) c21)) * 1099511628211L;
                    }
                    i25++;
                    c3 = c4;
                    c18 = 'x';
                }
            }
            i5 = i;
            if (i5 != i3) {
                i6 = i5;
                c5 = 26;
            } else {
                i6 = i5 + 1;
                c5 = cArr2[i5];
            }
            while (c5 <= c3 && ((1 << c5) & 4294981376L) != 0) {
                if (i6 != i3) {
                    c5 = 26;
                } else {
                    int i28 = i6 + 1;
                    char c25 = cArr2[i6];
                    i6 = i28;
                    c5 = c25;
                }
                c3 = ' ';
            }
            if (c5 == ':') {
                C1123.m1410(mo6730("expect ':', but " + c5));
                return 0L;
            }
            if (i6 == i3) {
                i7 = i6;
                c6 = 26;
            } else {
                i7 = i6 + 1;
                c6 = cArr2[i6];
            }
            while (c6 <= ' ' && ((1 << c6) & 4294981376L) != 0) {
                if (i7 == i3) {
                    c6 = 26;
                } else {
                    c6 = cArr2[i7];
                    i7++;
                }
            }
            this.f9539 = i7;
            this.f9538 = c6;
            return j;
        }
        i = i10;
        i2 = i9;
        cArr = cArr3;
        c = '0';
        c2 = '(';
        c3 = ' ';
        j = 0;
        char c182 = 'x';
        if (j != 0) {
        }
        if (j == 0) {
        }
        i5 = i;
        if (i5 != i3) {
        }
        while (c5 <= c3) {
            if (i6 != i3) {
            }
            c3 = ' ';
        }
        if (c5 == ':') {
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public final boolean mo6693() {
        if (this.f9538 != 'n') {
            return false;
        }
        int i = this.f9539;
        if (i + 2 >= this.f9557 || this.f9558[i] != 'u') {
            return false;
        }
        mo6762();
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final boolean mo6694(char r8, char r9, char r10, char r11) {
        /*
            r7 = this;
            char r0 = r7.f9538
            if (r0 == r8) goto L6
            goto L6e
        L6:
            int r8 = r7.f9539
            int r0 = r8 + 3
            int r1 = r7.f9557
            if (r0 > r1) goto L6e
            char[] r2 = r7.f9558
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
            int r8 = r7.f9539
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
            r7.f9539 = r0
            r7.f9538 = r10
            r7 = 1
            return r7
        L6e:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6694(char, char, char, char):boolean");
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final boolean mo6695() {
        /*
            r10 = this;
            char r0 = r10.f9538
            r1 = 108(0x6c, float:1.51E-43)
            if (r0 == r1) goto L8
            goto L71
        L8:
            int r0 = r10.f9539
            int r1 = r0 + 2
            int r2 = r10.f9557
            if (r1 > r2) goto L71
            char[] r3 = r10.f9558
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
            int r2 = r10.f9539
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
            r10.f9539 = r0
            r10.f9538 = r1
            r10 = 1
            return r10
        L71:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6695():boolean");
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public final boolean mo6696() {
        /*
            r10 = this;
            char r0 = r10.f9538
            r1 = 34
            if (r0 == r1) goto L8
            goto L7f
        L8:
            int r0 = r10.f9539
            int r2 = r0 + 4
            int r3 = r10.f9557
            if (r2 > r3) goto L7f
            char[] r4 = r10.f9558
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
            int r3 = r10.f9539
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
            r10.f9539 = r0
            r10.f9538 = r2
            r10 = 1
            return r10
        L7f:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6696():boolean");
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final boolean mo6697(char r6, char r7, char r8, char r9, char r10, char r11) {
        /*
            r5 = this;
            char r0 = r5.f9538
            if (r0 == r6) goto L6
            goto L7a
        L6:
            int r6 = r5.f9539
            int r0 = r6 + 5
            int r1 = r5.f9557
            if (r0 > r1) goto L7a
            char[] r2 = r5.f9558
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
            int r6 = r5.f9539
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
            r5.f9539 = r0
            r5.f9538 = r8
            r5 = 1
            return r5
        L7a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6697(char, char, char, char, char, char):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0013, code lost:
    
        if (r4 != r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo6701() {
        int i;
        char c;
        if (this.f9538 != '[') {
            return false;
        }
        int i2 = this.f9539;
        int i3 = this.f9557;
        char[] cArr = this.f9558;
        if (i2 == i3) {
            i = i2;
            c = 26;
            while (true) {
                if (c == 0) {
                    if (i == i3) {
                        break;
                    }
                    int i4 = i + 1;
                    char c2 = cArr[i];
                    i = i4;
                    c = c2;
                } else if (c > ' ' || ((1 << c) & 4294981376L) == 0) {
                    break;
                }
            }
            this.f9538 = c;
            this.f9539 = i;
            if (c == '/') {
                return true;
            }
            mo6795();
            return true;
        }
        i = i2 + 1;
        c = cArr[i2];
        while (true) {
            if (c == 0) {
            }
            int i42 = i + 1;
            char c22 = cArr[i];
            i = i42;
            c = c22;
        }
        this.f9538 = c;
        this.f9539 = i;
        if (c == '/') {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0015, code lost:
    
        if (r5 != r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo6702() {
        int i;
        char c;
        int i2;
        char c2;
        if (this.f9538 != ']') {
            return false;
        }
        int i3 = this.f9539;
        int i4 = this.f9557;
        char[] cArr = this.f9558;
        if (i3 != i4) {
            i = i3 + 1;
            c = cArr[i3];
            while (true) {
                if (c == 0) {
                }
                int i5 = i + 1;
                char c3 = cArr[i];
                i = i5;
                c = c3;
            }
            if (c == ',') {
            }
            this.f9538 = c;
            this.f9539 = i;
            if (c == '/') {
            }
            return true;
        }
        i = i3;
        c = 26;
        while (true) {
            if (c == 0) {
                if (i == i4) {
                    break;
                }
                int i52 = i + 1;
                char c32 = cArr[i];
                i = i52;
                c = c32;
            } else if (c > ' ' || ((1 << c) & 4294981376L) == 0) {
                break;
            }
        }
        if (c == ',') {
            this.f9542 = true;
            if (i == i4) {
                i2 = i;
                c2 = 26;
            } else {
                i2 = i + 1;
                c2 = cArr[i];
            }
            loop1: while (true) {
                char c4 = c2;
                i = i2;
                c = c4;
                while (true) {
                    if (c != 0 && (c > ' ' || ((1 << c) & 4294981376L) == 0)) {
                        break loop1;
                    }
                    if (i == i4) {
                        c = 26;
                    }
                }
                i2 = i + 1;
                c2 = cArr[i];
            }
        }
        this.f9538 = c;
        this.f9539 = i;
        if (c == '/') {
            mo6795();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo6704(char r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.f9539
            char r2 = r0.f9538
        L6:
            r3 = 0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            r7 = 1
            r9 = 32
            r10 = 26
            int r11 = r0.f9557
            char[] r12 = r0.f9558
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
            r0.f9539 = r2
            r0.f9538 = r1
            r2 = 47
            r3 = 1
            if (r1 != r2) goto L53
            r0.mo6795()
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
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6704(char):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo6705() {
        /*
            r15 = this;
            int r0 = r15.f9539
            char r1 = r15.f9538
        L4:
            r2 = 0
            r4 = 4294981376(0x100003700, double:2.1220027474E-314)
            r6 = 1
            r8 = 32
            r9 = 26
            int r10 = r15.f9557
            char[] r11 = r15.f9558
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
            r15.f9539 = r0
            r15.f9538 = r1
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
            r15.f9539 = r1
            r15.f9538 = r0
            r1 = 47
            if (r0 != r1) goto L54
            r15.mo6795()
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
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6705():boolean");
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final boolean mo6706() {
        /*
            r10 = this;
            int r0 = r10.f9539
            char r1 = r10.f9538
            r2 = 73
            if (r1 != r2) goto L71
            int r1 = r0 + 6
            int r2 = r10.f9557
            if (r1 >= r2) goto L71
            char[] r3 = r10.f9558
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
            r10.f9539 = r0
            r10.f9538 = r1
            r10 = 1
            return r10
        L71:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6706():boolean");
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final boolean mo6707() {
        /*
            r10 = this;
            int r0 = r10.f9539
            char r1 = r10.f9538
            r2 = 83
            if (r1 != r2) goto L4d
            int r1 = r0 + 1
            int r2 = r10.f9557
            if (r1 >= r2) goto L4d
            char[] r3 = r10.f9558
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
            r10.f9539 = r0
            r10.f9538 = r1
            r10 = 1
            return r10
        L4d:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6707():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0013, code lost:
    
        if (r4 != r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo6708() {
        int i;
        char c;
        if (this.f9538 != '{') {
            return false;
        }
        int i2 = this.f9539;
        int i3 = this.f9557;
        char[] cArr = this.f9558;
        if (i2 == i3) {
            i = i2;
            c = 26;
            while (true) {
                if (c == 0) {
                    if (i == i3) {
                        break;
                    }
                    int i4 = i + 1;
                    char c2 = cArr[i];
                    i = i4;
                    c = c2;
                } else if (c > ' ' || ((1 << c) & 4294981376L) == 0) {
                    break;
                }
            }
            this.f9538 = c;
            this.f9539 = i;
            if (c == '/') {
                return true;
            }
            mo6795();
            return true;
        }
        i = i2 + 1;
        c = cArr[i2];
        while (true) {
            if (c == 0) {
            }
            int i42 = i + 1;
            char c22 = cArr[i];
            i = i42;
            c = c22;
        }
        this.f9538 = c;
        this.f9539 = i;
        if (c == '/') {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6710() {
        /*
            r10 = this;
            int r0 = r10.f9539
            r1 = 26
            char[] r2 = r10.f9558
            int r3 = r10.f9557
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
            r10.f9539 = r4
            r10.f9538 = r0
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
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6710():void");
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public final boolean mo6711() {
        /*
            r18 = this;
            r0 = r18
            char r1 = r0.f9538
            int r2 = r0.f9539
            r3 = 110(0x6e, float:1.54E-43)
            r4 = 0
            r5 = 1
            int r6 = r0.f9557
            char[] r7 = r0.f9558
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
            long r8 = com.alibaba.fastjson2.util.AbstractC3682.m6289(r2, r7)
            long r10 = com.alibaba.fastjson2.util.AbstractC3682.f9223
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
            r0.f9542 = r4
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
            r0.f9539 = r3
            r0.f9538 = r2
            return r5
        La5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6711():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0015, code lost:
    
        if (r5 != r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo6712() {
        int i;
        char c;
        int i2;
        char c2;
        if (this.f9538 != '}') {
            return false;
        }
        int i3 = this.f9539;
        int i4 = this.f9557;
        char[] cArr = this.f9558;
        if (i3 != i4) {
            i = i3 + 1;
            c = cArr[i3];
            while (true) {
                if (c == 0) {
                }
                int i5 = i + 1;
                char c3 = cArr[i];
                i = i5;
                c = c3;
            }
            if (c == ',') {
            }
            this.f9538 = c;
            this.f9539 = i;
            if (c == '/') {
            }
            return true;
        }
        i = i3;
        c = 26;
        while (true) {
            if (c == 0) {
                if (i == i4) {
                    break;
                }
                int i52 = i + 1;
                char c32 = cArr[i];
                i = i52;
                c = c32;
            } else if (c > ' ' || ((1 << c) & 4294981376L) == 0) {
                break;
            }
        }
        if (c == ',') {
            this.f9542 = true;
            if (i == i4) {
                i2 = i;
                c2 = 26;
            } else {
                i2 = i + 1;
                c2 = cArr[i];
            }
            loop1: while (true) {
                char c4 = c2;
                i = i2;
                c = c4;
                while (true) {
                    if (c != 0 && (c > ' ' || ((1 << c) & 4294981376L) == 0)) {
                        break loop1;
                    }
                    if (i == i4) {
                        c = 26;
                    }
                }
                i2 = i + 1;
                c2 = cArr[i];
            }
        }
        this.f9538 = c;
        this.f9539 = i;
        if (c == '/') {
            mo6795();
        }
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    public final String mo6730(String str) {
        char[] cArr;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = (i2 < this.f9539) & (i2 < this.f9557);
            cArr = this.f9558;
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
        sb.append(this.f9539);
        sb.append(", character ");
        sb.append(this.f9538);
        sb.append(", line ");
        sb.append(i);
        sb.append(", column ");
        sb.append(i3);
        sb.append(", fastjson-version 2.0.60");
        sb.append(i <= 1 ? ' ' : '\n');
        sb.append(cArr, 0, Math.min(this.f9556, Opcodes.MAX_VALUE));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x000b, code lost:
    
        if (r4 != r3) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6733() {
        int i;
        char c;
        int i2 = this.f9539;
        char[] cArr = this.f9558;
        int i3 = this.f9557;
        if (i2 >= i3) {
            i = i2;
            c = 26;
            while (true) {
                if (c == 0) {
                    if (i == i3) {
                        break;
                    }
                    int i4 = i + 1;
                    char c2 = cArr[i];
                    i = i4;
                    c = c2;
                } else if (c > ' ' || ((1 << c) & 4294981376L) == 0) {
                    break;
                }
            }
            this.f9539 = i;
            this.f9538 = c;
            if (c != '/') {
                mo6795();
                return;
            }
            return;
        }
        i = i2 + 1;
        c = cArr[i2];
        while (true) {
            if (c == 0) {
            }
            int i42 = i + 1;
            char c22 = cArr[i];
            i = i42;
            c = c22;
        }
        this.f9539 = i;
        this.f9538 = c;
        if (c != '/') {
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final boolean mo6740() {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        if ((this.f9546.f9665 & 8589934592L) != 0 || this.f9538 != '{' || (i = this.f9539) == (i2 = this.f9557)) {
            return false;
        }
        char[] cArr = this.f9558;
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
                this.f9554 = i3;
                return true;
            }
        }
        return false;
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世兰哲子苏 */
    public final java.lang.String mo6744() {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6744():java.lang.String");
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世兰子哲苏 */
    public final java.lang.String mo6746() {
        /*
            r17 = this;
            r0 = r17
            char r1 = r0.f9538
            r2 = 47
            if (r1 != r2) goto L7e
            int r1 = r0.f9539
            r3 = r1
        Lb:
            int r4 = r0.f9557
            char[] r5 = r0.f9558
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
            r0.f9542 = r14
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
            r0.f9539 = r3
            r0.f9538 = r1
            return r2
        L7e:
            java.lang.String r0 = "illegal pattern"
            androidx.collection.C1123.m1410(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6746():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        r8 = 0;
     */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世兰子苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final OffsetTime mo6747() {
        int i;
        int i2;
        int i3 = this.f9539;
        char c = this.f9538;
        if (c == '\"' || c == '\'') {
            this.f9546.getClass();
            int i4 = i3 + 8;
            char[] cArr = this.f9558;
            if (i4 < cArr.length && i4 < (i = this.f9557) && cArr[i3 + 2] == ':' && cArr[i3 + 5] == ':') {
                char c2 = cArr[i3];
                char c3 = cArr[i3 + 1];
                char c4 = cArr[i3 + 3];
                char c5 = cArr[i3 + 4];
                char c6 = cArr[i3 + 6];
                char c7 = cArr[i3 + 7];
                if (c2 < '0' || c2 > '9' || c3 < '0' || c3 > '9') {
                    C1123.m1410(mo6730("illegal offsetTime"));
                    return null;
                }
                int i5 = (c3 - '0') + ((c2 - '0') * 10);
                if (c4 < '0' || c4 > '9' || c5 < '0' || c5 > '9') {
                    C1123.m1410(mo6730("illegal offsetTime"));
                    return null;
                }
                int i6 = (c5 - '0') + ((c4 - '0') * 10);
                if (c6 < '0' || c6 > '9' || c7 < '0' || c7 > '9') {
                    C1123.m1410(mo6730("illegal offsetTime"));
                    return null;
                }
                int i7 = (c7 - '0') + ((c6 - '0') * 10);
                int i8 = i3 + 25;
                int i9 = -1;
                int i10 = i4;
                int i11 = -1;
                while (true) {
                    if (i10 >= i8 || i10 >= i || i10 >= cArr.length) {
                        break;
                    }
                    char c8 = cArr[i10];
                    if (i11 == i9 && (c8 == 'Z' || c8 == '+' || c8 == '-')) {
                        i11 = (i10 - i4) - 1;
                    }
                    if (c8 == c) {
                        i2 = i10 - i3;
                        break;
                    }
                    i10++;
                    i9 = -1;
                }
                int i12 = (i2 - 9) - i11;
                OffsetTime offsetTimeOf = OffsetTime.of(LocalTime.of(i5, i6, i7, i11 <= 0 ? 0 : AbstractC3699.m6451(i11, i3 + 9, cArr)), i12 <= 1 ? ZoneOffset.UTC : ZoneOffset.of(new String(cArr, i3 + 9 + i11, i12)));
                this.f9539 = i2 + 1 + this.f9539;
                mo6733();
                boolean z = this.f9538 == ',';
                this.f9542 = z;
                if (z) {
                    mo6733();
                }
                return offsetTimeOf;
            }
        }
        C1123.m1410(mo6730("illegal offsetTime"));
        return null;
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世兰苏子哲 */
    public final java.lang.String mo6749() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f9554
            r2 = 0
            int r3 = r0.f9557
            if (r1 != r3) goto La
            return r2
        La:
            int r4 = r1 + 1
            r0.f9539 = r4
            char[] r4 = r0.f9558
            char r1 = r4[r1]
            r0.f9538 = r1
            java.lang.String r1 = r0.mo6744()
            char r5 = r0.f9538
            int r6 = r0.f9539
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
            r0.f9542 = r2
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
            r0.f9538 = r5
            r0.f9539 = r6
            return r1
        L88:
            java.lang.String r0 = "illegal reference : "
            java.lang.String r0 = r0.concat(r1)
            androidx.collection.C1123.m1410(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6749():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世哲兰苏子 */
    public final OffsetDateTime mo6751() {
        int i;
        char c;
        int i2;
        char c2;
        int i3 = this.f9539;
        char c3 = this.f9538;
        if (c3 == '\"' || c3 == '\'') {
            this.f9546.getClass();
            int i4 = i3 + 19;
            char[] cArr = this.f9558;
            if (i4 < cArr.length && i4 < (i = this.f9557) && cArr[i3 + 4] == '-' && cArr[i3 + 7] == '-' && (((c = cArr[i3 + 10]) == ' ' || c == 'T') && cArr[i3 + 13] == ':' && cArr[i3 + 16] == ':')) {
                int iM6299 = AbstractC3682.m6299(i3, cArr);
                int iM6281 = AbstractC3682.m6281(i3 + 5, cArr);
                int iM62812 = AbstractC3682.m6281(i3 + 8, cArr);
                int iM62813 = AbstractC3682.m6281(i3 + 11, cArr);
                int iM62814 = AbstractC3682.m6281(i3 + 14, cArr);
                int iM62815 = AbstractC3682.m6281(i3 + 17, cArr);
                if ((iM6299 | iM6281 | iM62812 | iM62814 | iM62815) < 0) {
                    ZonedDateTime zonedDateTimeMo6801 = mo6801();
                    if (zonedDateTimeMo6801 == null) {
                        return null;
                    }
                    return zonedDateTimeMo6801.toOffsetDateTime();
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
                    i6 *= AbstractC3699.f9375[(9 - i7) & 15];
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
                        ZoneId zoneId = AbstractC3699.f9372;
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
                    this.f9542 = z;
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
                    this.f9539 = i5;
                    this.f9538 = c2;
                    return OffsetDateTime.of(iM6299, iM6281, iM62812, iM62813, iM62814, iM62815, i2, zoneOffsetOf);
                }
            }
        }
        ZonedDateTime zonedDateTimeMo68012 = mo6801();
        if (zonedDateTimeMo68012 == null) {
            return null;
        }
        return zonedDateTimeMo68012.toOffsetDateTime();
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世哲子苏兰 */
    public final java.util.Date mo6753() {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6753():java.util.Date");
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世哲苏子兰 */
    public final void mo6755() {
        /*
            Method dump skipped, instruction units count: 1396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6755():void");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世子兰哲苏 */
    public final LocalTime mo6756() {
        int iM6281;
        int i;
        int iM6283;
        int iM62832;
        LocalTime localTimeM6439;
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("localTime only support string input");
            return null;
        }
        int i2 = this.f9539;
        ZoneId zoneId = AbstractC3699.f9372;
        int i3 = i2 + 5;
        char[] cArr = this.f9558;
        if (i3 > cArr.length) {
            localTimeM6439 = null;
        } else {
            int i4 = i2 + 2;
            char c2 = cArr[i4];
            char c3 = cArr[i2 + 4];
            if (cArr[i2 + 1] == ':' && c3 == ':') {
                iM62832 = AbstractC3682.m6283(i2, cArr);
                iM6281 = AbstractC3682.m6281(i4, cArr);
                iM6283 = AbstractC3682.m6281(i3, cArr);
            } else {
                if (c2 == ':' && c3 == ':') {
                    int iM62812 = AbstractC3682.m6281(i2, cArr);
                    int iM62833 = AbstractC3682.m6283(i2 + 3, cArr);
                    iM6283 = AbstractC3682.m6281(i3, cArr);
                    i = iM62812;
                    iM6281 = iM62833;
                } else {
                    if (c2 == ':' && cArr[i3] == ':') {
                        int iM62813 = AbstractC3682.m6281(i2, cArr);
                        iM6281 = AbstractC3682.m6281(i2 + 3, cArr);
                        i = iM62813;
                        iM6283 = AbstractC3682.m6283(i2 + 6, cArr);
                    }
                    localTimeM6439 = null;
                }
                iM62832 = i;
            }
            localTimeM6439 = AbstractC3699.m6439(iM62832, iM6281, iM6283);
        }
        if (localTimeM6439 == null) {
            return null;
        }
        this.f9539 += 8;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localTimeM6439;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲 */
    public final LocalTime mo6757() {
        int iM6283;
        int iM62832;
        int iM6281;
        LocalTime localTimeM6439;
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("localTime only support string input");
            return null;
        }
        int i = this.f9539;
        ZoneId zoneId = AbstractC3699.f9372;
        int i2 = i + 5;
        char[] cArr = this.f9558;
        if (i2 > cArr.length) {
            localTimeM6439 = null;
        } else {
            char c2 = cArr[i + 1];
            int i3 = i + 4;
            char c3 = cArr[i3];
            int i4 = i + 2;
            if (cArr[i4] == ':' && c3 == ':') {
                iM6283 = AbstractC3682.m6281(i, cArr);
                iM62832 = AbstractC3682.m6283(i + 3, cArr);
                iM6281 = AbstractC3682.m6283(i2, cArr);
            } else if (c2 == ':' && c3 == ':') {
                iM6283 = AbstractC3682.m6283(i, cArr);
                iM62832 = AbstractC3682.m6281(i4, cArr);
                iM6281 = AbstractC3682.m6283(i2, cArr);
            } else {
                if (c2 == ':' && cArr[i + 3] == ':') {
                    iM6283 = AbstractC3682.m6283(i, cArr);
                    iM62832 = AbstractC3682.m6283(i4, cArr);
                    iM6281 = AbstractC3682.m6281(i3, cArr);
                }
                localTimeM6439 = null;
            }
            localTimeM6439 = AbstractC3699.m6439(iM6283, iM62832, iM6281);
        }
        if (localTimeM6439 == null) {
            return null;
        }
        this.f9539 += 7;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localTimeM6439;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏 */
    public final LocalTime mo6758() {
        int iM6283;
        int iM62832;
        int iM6281;
        LocalTime localTimeM6439;
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("localTime only support string input");
            return null;
        }
        int i = this.f9539;
        ZoneId zoneId = AbstractC3699.f9372;
        int i2 = i + 5;
        char[] cArr = this.f9558;
        if (i2 > cArr.length) {
            localTimeM6439 = null;
        } else {
            int i3 = i + 2;
            if (cArr[i3] == ':') {
                int iM62812 = AbstractC3682.m6281(i, cArr);
                iM6281 = AbstractC3682.m6281(i + 3, cArr);
                iM6283 = iM62812;
                iM62832 = 0;
            } else {
                if (cArr[i + 1] == ':' && cArr[i + 3] == ':') {
                    iM6283 = AbstractC3682.m6283(i, cArr);
                    int iM62833 = AbstractC3682.m6283(i3, cArr);
                    iM62832 = AbstractC3682.m6283(i + 4, cArr);
                    iM6281 = iM62833;
                }
                localTimeM6439 = null;
            }
            localTimeM6439 = AbstractC3699.m6439(iM6283, iM6281, iM62832);
        }
        if (localTimeM6439 == null) {
            return null;
        }
        this.f9539 += 6;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localTimeM6439;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LocalTime mo6759() {
        LocalTime localTimeOf;
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("localTime only support string input");
            return null;
        }
        int i = this.f9539;
        ZoneId zoneId = AbstractC3699.f9372;
        int i2 = i + 18;
        char[] cArr = this.f9558;
        if (i2 <= cArr.length && cArr[i + 2] == ':' && cArr[i + 5] == ':' && cArr[i + 8] == '.') {
            int iM6281 = AbstractC3682.m6281(i, cArr);
            int iM62812 = AbstractC3682.m6281(i + 3, cArr);
            int iM62813 = AbstractC3682.m6281(i + 6, cArr);
            int iM6451 = AbstractC3699.m6451(9, i + 9, cArr);
            if ((iM6281 | iM62812 | iM62813 | iM6451) >= 0) {
                localTimeOf = LocalTime.of(iM6281, iM62812, iM62813, iM6451);
            }
        } else {
            localTimeOf = null;
        }
        if (localTimeOf == null) {
            return null;
        }
        this.f9539 += 19;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localTimeOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LocalTime mo6760() {
        LocalTime localTimeOf;
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("localTime only support string input");
            return null;
        }
        int i = this.f9539;
        ZoneId zoneId = AbstractC3699.f9372;
        int i2 = i + 15;
        char[] cArr = this.f9558;
        if (i2 <= cArr.length && cArr[i + 2] == ':' && cArr[i + 5] == ':' && cArr[i + 8] == '.') {
            int iM6281 = AbstractC3682.m6281(i, cArr);
            int iM62812 = AbstractC3682.m6281(i + 3, cArr);
            int iM62813 = AbstractC3682.m6281(i + 6, cArr);
            int iM6451 = AbstractC3699.m6451(6, i + 9, cArr);
            if ((iM6281 | iM62812 | iM62813 | iM6451) >= 0) {
                localTimeOf = LocalTime.of(iM6281, iM62812, iM62813, iM6451);
            }
        } else {
            localTimeOf = null;
        }
        if (localTimeOf == null) {
            return null;
        }
        this.f9539 += 16;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localTimeOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世子苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LocalTime mo6761() {
        LocalTime localTimeOf;
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("localTime only support string input");
            return null;
        }
        int i = this.f9539;
        ZoneId zoneId = AbstractC3699.f9372;
        int i2 = i + 12;
        char[] cArr = this.f9558;
        if (i2 <= cArr.length && cArr[i + 2] == ':' && cArr[i + 5] == ':' && cArr[i + 8] == '.') {
            int iM6281 = AbstractC3682.m6281(i, cArr);
            int iM62812 = AbstractC3682.m6281(i + 3, cArr);
            int iM62813 = AbstractC3682.m6281(i + 6, cArr);
            long jM6294 = ((long) AbstractC3682.m6294(i + 9, cArr)) + (((long) AbstractC3682.m6301(i + 11, cArr)) << 32);
            long j = 64425492495L & jM6294;
            int i3 = (((281410551218160L & jM6294) - 206161575984L) | ((25770196998L + j) & 1030807879920L)) != 0 ? -1 : (int) (((((jM6294 & 15) * 10) + (15 & (j >> 16))) * 10) + (j >> 32));
            if (i3 > 0) {
                i3 *= 1000000;
            }
            if ((iM6281 | iM62812 | iM62813 | iM62812) >= 0) {
                localTimeOf = LocalTime.of(iM6281, iM62812, iM62813, i3);
            }
        } else {
            localTimeOf = null;
        }
        if (localTimeOf == null) {
            return null;
        }
        this.f9539 += 13;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localTimeOf;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子 */
    public final void mo6762() {
        int i;
        char c;
        int i2 = this.f9539;
        char[] cArr = this.f9558;
        if (cArr[i2] != 'u' || cArr[i2 + 1] != 'l' || cArr[i2 + 2] != 'l') {
            C1123.m1410(AbstractC7012.m12147(i2, "json syntax error, not match null, offset "));
            return;
        }
        int i3 = i2 + 3;
        int i4 = this.f9557;
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
        this.f9542 = z;
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
        this.f9538 = c2;
        this.f9539 = i5;
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰子哲 */
    public final double mo6763() {
        /*
            r15 = this;
            int r0 = r15.f9539
            char[] r1 = r15.f9558
            char r2 = r1[r0]
            r3 = 97
            if (r2 != r3) goto L71
            int r2 = r0 + 1
            char r2 = r1[r2]
            r3 = 78
            if (r2 != r3) goto L71
            int r2 = r0 + 2
            r3 = 26
            int r4 = r15.f9557
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
            r15.f9542 = r12
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
            r15.f9538 = r1
            r15.f9539 = r0
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L71:
            java.lang.String r15 = "json syntax error, not NaN "
            java.lang.String r15 = p025.AbstractC7012.m12147(r0, r15)
            androidx.collection.C1123.m1410(r15)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6763():double");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲子兰 */
    public final long mo6765() {
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("date only support string input");
            return 0L;
        }
        int i = this.f9539;
        if (i + 18 >= this.f9557) {
            this.f9541 = true;
            return 0L;
        }
        ZoneId zoneId = (ZoneId) this.f9546.f9664;
        char[] cArr = this.f9558;
        long jM6442 = AbstractC3699.m6442(cArr, i, zoneId);
        int i2 = this.f9539;
        if (cArr[i2 + 19] != c) {
            C1123.m1410(mo6730("illegal date input"));
            return 0L;
        }
        this.f9539 = i2 + 20;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return jM6442;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲 */
    public final LocalTime mo6766() {
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("localTime only support string input");
            return null;
        }
        LocalTime localTimeM6457 = AbstractC3699.m6457(this.f9539, this.f9558);
        if (localTimeM6457 == null) {
            return null;
        }
        this.f9539 += 10;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localTimeM6457;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪世苏子哲兰 */
    public final LocalTime mo6767() {
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("localTime only support string input");
            return null;
        }
        LocalTime localTimeM6457 = AbstractC3699.m6457(this.f9539, this.f9558);
        if (localTimeM6457 == null) {
            return null;
        }
        this.f9539 += 9;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localTimeM6457;
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲 */
    public final long mo6769() {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6769():long");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏 */
    public final Long mo6770() {
        char c = this.f9538;
        if ((c == '\"' || c == '\'' || c == 'n') && mo6711()) {
            return null;
        }
        return Long.valueOf(mo6769());
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲 */
    public final int mo6772() {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C3734.mo6772():int");
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰 */
    public final Integer mo6773() {
        char c = this.f9538;
        if ((c == '\"' || c == '\'' || c == 'n') && mo6711()) {
            return null;
        }
        return Integer.valueOf(mo6772());
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世哲苏 */
    public final LocalDateTime mo6774() {
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeM6402 = AbstractC3699.m6402(this.f9539, this.f9558);
        if (localDateTimeM6402 == null) {
            return null;
        }
        this.f9539 += 21;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localDateTimeM6402;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲 */
    public final LocalDateTime mo6775() {
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeM6400 = AbstractC3699.m6400(this.f9539, this.f9558);
        if (localDateTimeM6400 == null) {
            return null;
        }
        this.f9539 += 20;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localDateTimeM6400;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LocalTime mo6776() {
        LocalTime localTimeOf;
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("localTime only support string input");
            return null;
        }
        int i = this.f9539;
        ZoneId zoneId = AbstractC3699.f9372;
        int i2 = i + 10;
        char[] cArr = this.f9558;
        if (i2 <= cArr.length && cArr[i + 2] == ':' && cArr[i + 5] == ':' && cArr[i + 8] == '.') {
            int iM6281 = AbstractC3682.m6281(i, cArr);
            int iM62812 = AbstractC3682.m6281(i + 3, cArr);
            int iM62813 = AbstractC3682.m6281(i + 6, cArr);
            int iM6283 = AbstractC3682.m6283(i + 9, cArr);
            if (iM6283 > 0) {
                iM6283 *= 100000000;
            }
            if ((iM6281 | iM62812 | iM62813 | iM62812) >= 0) {
                localTimeOf = LocalTime.of(iM6281, iM62812, iM62813, iM6283);
            }
        } else {
            localTimeOf = null;
        }
        if (localTimeOf == null) {
            return null;
        }
        this.f9539 += 11;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localTimeOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LocalTime mo6777() {
        LocalTime localTimeOf;
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("localTime only support string input");
            return null;
        }
        int i = this.f9539;
        ZoneId zoneId = AbstractC3699.f9372;
        int i2 = i + 11;
        char[] cArr = this.f9558;
        if (i2 <= cArr.length && cArr[i + 2] == ':' && cArr[i + 5] == ':' && cArr[i + 8] == '.') {
            int iM6281 = AbstractC3682.m6281(i, cArr);
            int iM62812 = AbstractC3682.m6281(i + 3, cArr);
            int iM62813 = AbstractC3682.m6281(i + 6, cArr);
            int iM62814 = AbstractC3682.m6281(i + 9, cArr);
            if (iM62814 > 0) {
                iM62814 *= 10000000;
            }
            if ((iM6281 | iM62812 | iM62813 | iM62812) >= 0) {
                localTimeOf = LocalTime.of(iM6281, iM62812, iM62813, iM62814);
            }
        } else {
            localTimeOf = null;
        }
        if (localTimeOf == null) {
            return null;
        }
        this.f9539 += 12;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localTimeOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲 */
    public final LocalDateTime mo6778(int i) {
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("date only support string input");
            return null;
        }
        int i2 = this.f9539;
        char[] cArr = this.f9558;
        LocalDateTime localDateTime = cArr[(i2 + i) - 1] == 'Z' ? AbstractC3699.m6440(cArr, i2, i, AbstractC3699.f9372).toInstant().atZone(this.f9546.m6969()).toLocalDateTime() : AbstractC3699.m6399(i2, i, cArr);
        if (localDateTime == 0) {
            return null;
        }
        this.f9539 = i + 1 + this.f9539;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localDateTime;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏 */
    public final LocalDateTime mo6780() {
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeM6406 = AbstractC3699.m6406(this.f9539, this.f9558);
        if (localDateTimeM6406 == null) {
            return null;
        }
        this.f9539 += 13;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localDateTimeM6406;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏 */
    public final LocalDateTime mo6782() {
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeM6412 = AbstractC3699.m6412(this.f9539, this.f9558);
        if (localDateTimeM6412 == null) {
            return null;
        }
        this.f9539 += 18;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localDateTimeM6412;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世 */
    public final LocalDateTime mo6783() {
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeM6410 = AbstractC3699.m6410(this.f9539, this.f9558);
        this.f9539 += 19;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localDateTimeM6410;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰 */
    public final LocalDateTime mo6784() {
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeM6404 = AbstractC3699.m6404(this.f9539, this.f9558);
        if (localDateTimeM6404 == null) {
            return null;
        }
        this.f9539 += 15;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localDateTimeM6404;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世 */
    public final LocalDateTime mo6785() {
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("date only support string input");
            return null;
        }
        LocalDateTime localDateTimeM6414 = AbstractC3699.m6414(this.f9539, this.f9558);
        if (localDateTimeM6414 == null) {
            return null;
        }
        this.f9539 += 17;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localDateTimeM6414;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子苏世兰哲 */
    public final LocalDate mo6786() {
        int i;
        boolean z;
        int i2 = this.f9539;
        char c = this.f9538;
        if (c == '\"' || c == '\'') {
            this.f9546.getClass();
            int i3 = i2 + 10;
            char[] cArr = this.f9558;
            int length = cArr.length;
            LocalDate localDateOf = null;
            int i4 = this.f9557;
            if (i3 < length && i3 < i4 && cArr[i2 + 4] == '-' && cArr[i2 + 7] == '-' && cArr[i3] == c) {
                int iM6299 = AbstractC3682.m6299(i2, cArr);
                int iM6281 = AbstractC3682.m6281(i2 + 5, cArr);
                int iM62812 = AbstractC3682.m6281(i2 + 8, cArr);
                int i5 = iM6299 | iM6281 | iM62812;
                if (i5 < 0) {
                    C1123.m1410(mo6730("read date error"));
                    return null;
                }
                if (i5 != 0) {
                    try {
                        localDateOf = LocalDate.of(iM6299, iM6281, iM62812);
                    } catch (DateTimeException e) {
                        C1123.m1403(mo6730("read date error"), e);
                        return null;
                    }
                }
                this.f9539 = i2 + 11;
                mo6733();
                z = this.f9538 == ',';
                this.f9542 = z;
                if (z) {
                    mo6733();
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
                localDateOf = LocalDate.of(AbstractC3700.m6490(i2, i - 6, cArr), AbstractC3682.m6281(i6 - 5, cArr), AbstractC3682.m6281(i6 - 2, cArr));
                this.f9539 = i6 + 1;
                mo6733();
                z = this.f9538 == ',';
                this.f9542 = z;
                if (z) {
                    mo6733();
                }
            }
            if (localDateOf != null) {
                return localDateOf;
            }
        }
        return super.mo6786();
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲 */
    public final LocalDate mo6788() {
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("localDate only support string input");
            return null;
        }
        try {
            LocalDate localDateM6426 = AbstractC3699.m6426(this.f9539, this.f9558);
            this.f9539 += 9;
            mo6733();
            boolean z = this.f9538 == ',';
            this.f9542 = z;
            if (z) {
                mo6733();
            }
            return localDateM6426;
        } catch (DateTimeException e) {
            C1123.m1403(mo6730("read date error"), e);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世 */
    public final LocalDate mo6789() {
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("localDate only support string input");
            return null;
        }
        try {
            LocalDate localDateM6424 = AbstractC3699.m6424(this.f9539, this.f9558);
            this.f9539 += 10;
            mo6733();
            boolean z = this.f9538 == ',';
            this.f9542 = z;
            if (z) {
                mo6733();
            }
            return localDateM6424;
        } catch (DateTimeException e) {
            C1123.m1403(mo6730("read date error"), e);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰 */
    public final LocalDate mo6790() {
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("localDate only support string input");
            return null;
        }
        try {
            LocalDate localDateM6430 = AbstractC3699.m6430(this.f9539, this.f9558);
            if (localDateM6430 == null) {
                return null;
            }
            this.f9539 += 11;
            mo6733();
            boolean z = this.f9538 == ',';
            this.f9542 = z;
            if (z) {
                mo6733();
            }
            return localDateM6430;
        } catch (DateTimeException e) {
            C1123.m1403(mo6730("read date error"), e);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世 */
    public final LocalDate mo6791() {
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            C1123.m1410("localDate only support string input");
            return null;
        }
        LocalDate localDateM6423 = AbstractC3699.m6423(this.f9539, this.f9558);
        if (localDateM6423 == null) {
            return null;
        }
        this.f9539 += 12;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return localDateM6423;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪苏世哲兰子 */
    public final void mo6793() {
        this.f9539 = m6806(this, this.f9558, this.f9539, this.f9557);
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰 */
    public final void mo6794() {
        this.f9539 = m6805(this, this.f9558, this.f9539, this.f9557);
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪苏世子兰哲 */
    public final void mo6795() {
        boolean z;
        boolean z2;
        char c;
        int i = this.f9539;
        int i2 = i + 1;
        int i3 = this.f9557;
        if (i2 >= i3) {
            C1123.m1410(mo6730(null));
            return;
        }
        char[] cArr = this.f9558;
        char c2 = cArr[i];
        if (c2 == '*') {
            z = true;
        } else {
            if (c2 != '/') {
                C1123.m1410(mo6730("parse comment error"));
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
        this.f9538 = c;
        this.f9539 = i4;
        if (c == '/') {
            mo6795();
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
    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪苏子兰哲世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ZonedDateTime mo6802(int i) {
        ZonedDateTime zonedDateTimeM6440;
        LocalDateTime localDateTimeOf;
        char c;
        LocalDateTime localDateTimeOf2;
        char c2;
        LocalDateTime localDateTimeOf3;
        char c3;
        LocalDateTime localDateTimeOf4;
        char c4;
        char c5 = this.f9538;
        if (c5 != '\"' && c5 != '\'') {
            C1123.m1410("date only support string input");
            return null;
        }
        if (i < 19) {
            return null;
        }
        char[] cArr = this.f9558;
        if (i == 30) {
            int i2 = this.f9539;
            if (cArr[i2 + 29] == 'Z') {
                ZoneId zoneId = AbstractC3699.f9372;
                if (i2 + 29 <= cArr.length && cArr[i2 + 4] == '-' && cArr[i2 + 7] == '-' && (((c4 = cArr[i2 + 10]) == ' ' || c4 == 'T') && cArr[i2 + 13] == ':' && cArr[i2 + 16] == ':' && cArr[i2 + 19] == '.')) {
                    int iM6299 = AbstractC3682.m6299(i2, cArr);
                    int iM6281 = AbstractC3682.m6281(i2 + 5, cArr);
                    int iM62812 = AbstractC3682.m6281(i2 + 8, cArr);
                    int iM62813 = AbstractC3682.m6281(i2 + 11, cArr);
                    int iM62814 = AbstractC3682.m6281(i2 + 14, cArr);
                    int iM62815 = AbstractC3682.m6281(i2 + 17, cArr);
                    int iM6451 = AbstractC3699.m6451(9, i2 + 20, cArr);
                    if ((iM6299 | iM6281 | iM62812 | iM62813 | iM62814 | iM62815 | iM6451) > 0 && iM62813 <= 24 && iM62814 <= 59 && iM62815 <= 60) {
                        localDateTimeOf4 = LocalDateTime.of(iM6299, iM6281, iM62812, iM62813, iM62814, iM62815, iM6451);
                    }
                    zonedDateTimeM6440 = ZonedDateTime.of(localDateTimeOf4, ZoneOffset.UTC);
                } else {
                    localDateTimeOf4 = null;
                    zonedDateTimeM6440 = ZonedDateTime.of(localDateTimeOf4, ZoneOffset.UTC);
                }
            } else if (i == 29) {
                int i3 = this.f9539;
                if (cArr[i3 + 28] == 'Z') {
                    ZoneId zoneId2 = AbstractC3699.f9372;
                    if (i3 + 28 <= cArr.length && cArr[i3 + 4] == '-' && cArr[i3 + 7] == '-' && (((c3 = cArr[i3 + 10]) == ' ' || c3 == 'T') && cArr[i3 + 13] == ':' && cArr[i3 + 16] == ':' && cArr[i3 + 19] == '.')) {
                        int iM62992 = AbstractC3682.m6299(i3, cArr);
                        int iM62816 = AbstractC3682.m6281(i3 + 5, cArr);
                        int iM62817 = AbstractC3682.m6281(i3 + 8, cArr);
                        int iM62818 = AbstractC3682.m6281(i3 + 11, cArr);
                        int iM62819 = AbstractC3682.m6281(i3 + 14, cArr);
                        int iM628110 = AbstractC3682.m6281(i3 + 17, cArr);
                        int iM64512 = AbstractC3699.m6451(8, i3 + 20, cArr);
                        if ((iM62992 | iM62816 | iM62817 | iM62818 | iM62819 | iM628110 | iM64512) > 0 && iM62818 <= 24 && iM62819 <= 59 && iM628110 <= 60) {
                            localDateTimeOf3 = LocalDateTime.of(iM62992, iM62816, iM62817, iM62818, iM62819, iM628110, iM64512);
                        }
                        zonedDateTimeM6440 = ZonedDateTime.of(localDateTimeOf3, ZoneOffset.UTC);
                    } else {
                        localDateTimeOf3 = null;
                        zonedDateTimeM6440 = ZonedDateTime.of(localDateTimeOf3, ZoneOffset.UTC);
                    }
                } else if (i == 28) {
                    int i4 = this.f9539;
                    if (cArr[i4 + 27] == 'Z') {
                        ZoneId zoneId3 = AbstractC3699.f9372;
                        if (i4 + 27 <= cArr.length && cArr[i4 + 4] == '-' && cArr[i4 + 7] == '-' && (((c2 = cArr[i4 + 10]) == ' ' || c2 == 'T') && cArr[i4 + 13] == ':' && cArr[i4 + 16] == ':' && cArr[i4 + 19] == '.')) {
                            int iM62993 = AbstractC3682.m6299(i4, cArr);
                            int iM628111 = AbstractC3682.m6281(i4 + 5, cArr);
                            int iM628112 = AbstractC3682.m6281(i4 + 8, cArr);
                            int iM628113 = AbstractC3682.m6281(i4 + 11, cArr);
                            int iM628114 = AbstractC3682.m6281(i4 + 14, cArr);
                            int iM628115 = AbstractC3682.m6281(i4 + 17, cArr);
                            int iM64513 = AbstractC3699.m6451(7, i4 + 20, cArr);
                            if ((iM62993 | iM628111 | iM628112 | iM628113 | iM628114 | iM628115 | iM64513) > 0 && iM628113 <= 24 && iM628114 <= 59 && iM628115 <= 60) {
                                localDateTimeOf2 = LocalDateTime.of(iM62993, iM628111, iM628112, iM628113, iM628114, iM628115, iM64513);
                            }
                            zonedDateTimeM6440 = ZonedDateTime.of(localDateTimeOf2, ZoneOffset.UTC);
                        } else {
                            localDateTimeOf2 = null;
                            zonedDateTimeM6440 = ZonedDateTime.of(localDateTimeOf2, ZoneOffset.UTC);
                        }
                    } else if (i == 27) {
                        int i5 = this.f9539;
                        if (cArr[i5 + 26] == 'Z') {
                            ZoneId zoneId4 = AbstractC3699.f9372;
                            if (i5 + 26 <= cArr.length && cArr[i5 + 4] == '-' && cArr[i5 + 7] == '-' && (((c = cArr[i5 + 10]) == ' ' || c == 'T') && cArr[i5 + 13] == ':' && cArr[i5 + 16] == ':' && cArr[i5 + 19] == '.')) {
                                int iM62994 = AbstractC3682.m6299(i5, cArr);
                                int iM628116 = AbstractC3682.m6281(i5 + 5, cArr);
                                int iM628117 = AbstractC3682.m6281(i5 + 8, cArr);
                                int iM628118 = AbstractC3682.m6281(i5 + 11, cArr);
                                int iM628119 = AbstractC3682.m6281(i5 + 14, cArr);
                                int iM628120 = AbstractC3682.m6281(i5 + 17, cArr);
                                int iM64514 = AbstractC3699.m6451(6, i5 + 20, cArr);
                                if ((iM62994 | iM628116 | iM628117 | iM628118 | iM628119 | iM628120 | iM64514) > 0 && iM628118 <= 24 && iM628119 <= 59 && iM628120 <= 60) {
                                    localDateTimeOf = LocalDateTime.of(iM62994, iM628116, iM628117, iM628118, iM628119, iM628120, iM64514);
                                }
                                zonedDateTimeM6440 = ZonedDateTime.of(localDateTimeOf, ZoneOffset.UTC);
                            } else {
                                localDateTimeOf = null;
                                zonedDateTimeM6440 = ZonedDateTime.of(localDateTimeOf, ZoneOffset.UTC);
                            }
                        } else {
                            zonedDateTimeM6440 = AbstractC3699.m6440(cArr, this.f9539, i, (ZoneId) this.f9546.f9664);
                        }
                    }
                }
            }
        }
        if (zonedDateTimeM6440 == null) {
            return null;
        }
        this.f9539 = i + 1 + this.f9539;
        mo6733();
        boolean z = this.f9538 == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        }
        return zonedDateTimeM6440;
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪苏子哲世兰 */
    public final UUID mo6803() {
        long jM6809;
        long jM68092;
        long jM68093;
        long jM68094;
        long jM68095;
        long jM68096;
        long jM68097;
        long jM68098;
        int i;
        int i2;
        char c;
        char c2 = this.f9538;
        if (c2 == 'n') {
            mo6762();
            return null;
        }
        if (c2 != '\"' && c2 != '\'') {
            C1123.m1410(mo6730("syntax error, can not read uuid"));
            return null;
        }
        int i3 = this.f9539;
        int i4 = i3 + 36;
        int i5 = this.f9557;
        char[] cArr = this.f9558;
        if (i4 < i5 && cArr[i4] == c2 && cArr[i3 + 8] == '-' && cArr[i3 + 13] == '-' && cArr[i3 + 18] == '-' && cArr[i3 + 23] == '-') {
            jM6809 = m6809(i3, cArr);
            jM68092 = m6809(i3 + 4, cArr);
            jM68093 = m6809(i3 + 9, cArr);
            jM68094 = m6809(i3 + 14, cArr);
            jM68095 = m6809(i3 + 19, cArr);
            jM68096 = m6809(i3 + 24, cArr);
            jM68097 = m6809(i3 + 28, cArr);
            jM68098 = m6809(i3 + 32, cArr);
            i = i3 + 37;
        } else {
            int i6 = i3 + 32;
            if (i6 >= i5 || cArr[i6] != c2) {
                String strMo6744 = mo6744();
                if (strMo6744.isEmpty()) {
                    return null;
                }
                return UUID.fromString(strMo6744);
            }
            jM6809 = m6809(i3, cArr);
            jM68092 = m6809(i3 + 4, cArr);
            jM68093 = m6809(i3 + 8, cArr);
            jM68094 = m6809(i3 + 12, cArr);
            jM68095 = m6809(i3 + 16, cArr);
            jM68096 = m6809(i3 + 20, cArr);
            jM68097 = m6809(i3 + 24, cArr);
            jM68098 = m6809(i3 + 28, cArr);
            i = i3 + 33;
        }
        if (i == i5) {
            i2 = i;
            c = 26;
        } else {
            i2 = i + 1;
            c = cArr[i];
        }
        long j = jM6809;
        int i7 = i2;
        while (c <= ' ' && ((1 << c) & 4294981376L) != 0) {
            if (i7 == i5) {
                c = 26;
            } else {
                c = cArr[i7];
                i7++;
            }
        }
        this.f9539 = i7;
        boolean z = c == ',';
        this.f9542 = z;
        if (z) {
            mo6733();
        } else {
            this.f9538 = c;
        }
        return new UUID((j << 48) | (jM68092 << 32) | (jM68093 << 16) | jM68094, (jM68097 << 16) | (jM68095 << 48) | (jM68096 << 32) | jM68098);
    }

    @Override // com.alibaba.fastjson2.AbstractC3732
    /* JADX INFO: renamed from: 飘花落叶言楪苏子哲兰世 */
    public final long mo6804() {
        char[] cArr;
        int i;
        char cM6255;
        int i2;
        char cM6721;
        long j;
        long j2;
        char c = this.f9538;
        if (c != '\"' && c != '\'') {
            return -1L;
        }
        this.f9543 = false;
        int i3 = this.f9539;
        this.f9553 = i3;
        int i4 = 0;
        long j3 = 0;
        while (true) {
            cArr = this.f9558;
            i = this.f9557;
            if (i3 < i) {
                char cM62552 = cArr[i3];
                if (cM62552 != c) {
                    if (cM62552 == '\\') {
                        this.f9543 = true;
                        int i5 = i3 + 1;
                        char c2 = cArr[i5];
                        if (c2 == 'u') {
                            int i6 = i3 + 2;
                            C3737.m6831(i6, i);
                            cM62552 = (char) AbstractC3682.m6255(i6, cArr);
                            i3 += 5;
                        } else if (c2 != 'x') {
                            cM62552 = m6721(c2);
                            i3 = i5;
                        } else {
                            char c3 = cArr[i3 + 2];
                            i3 += 3;
                            cM62552 = AbstractC3732.m6655(c3, cArr[i3]);
                        }
                    }
                    if (cM62552 <= 255 && i4 < 8 && (i4 != 0 || cM62552 != 0)) {
                        switch (i4) {
                            case 0:
                                j3 = (byte) cM62552;
                                continue;
                                i3++;
                                i4++;
                                break;
                            case 1:
                                j = ((byte) cM62552) << 8;
                                j2 = 255;
                                break;
                            case 2:
                                j = ((byte) cM62552) << 16;
                                j2 = 65535;
                                break;
                            case 3:
                                j = ((byte) cM62552) << 24;
                                j2 = 16777215;
                                break;
                            case 4:
                                j = ((long) ((byte) cM62552)) << 32;
                                j2 = 4294967295L;
                                break;
                            case 5:
                                j = ((long) ((byte) cM62552)) << 40;
                                j2 = 1099511627775L;
                                break;
                            case 6:
                                j = ((long) ((byte) cM62552)) << 48;
                                j2 = 281474976710655L;
                                break;
                            case 7:
                                j = ((long) ((byte) cM62552)) << 56;
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
                    i3 = this.f9553;
                } else {
                    this.f9555 = i4;
                    this.f9552 = i3;
                    i3++;
                }
            }
        }
        i3 = this.f9553;
        j3 = 0;
        if (j3 == 0) {
            j3 = -3750763034362895579L;
            int i7 = 0;
            while (true) {
                char c4 = cArr[i3];
                if (c4 == '\\') {
                    this.f9543 = true;
                    int i8 = i3 + 1;
                    char c5 = cArr[i8];
                    if (c5 == 'u') {
                        int i9 = i3 + 2;
                        C3737.m6831(i9, i);
                        cM6255 = (char) AbstractC3682.m6255(i9, cArr);
                        i2 = i3 + 5;
                    } else if (c5 != 'x') {
                        cM6721 = m6721(c5);
                        long j4 = (((long) cM6721) ^ j3) * 1099511628211L;
                        i3 = i8 + 1;
                        j3 = j4;
                    } else {
                        char c6 = cArr[i3 + 2];
                        i2 = i3 + 3;
                        cM6255 = AbstractC3732.m6655(c6, cArr[i2]);
                    }
                    char c7 = cM6255;
                    i8 = i2;
                    cM6721 = c7;
                    long j42 = (((long) cM6721) ^ j3) * 1099511628211L;
                    i3 = i8 + 1;
                    j3 = j42;
                } else if (c4 == '\"') {
                    this.f9555 = i7;
                    this.f9552 = i3;
                    this.f9533 = null;
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
        this.f9542 = z;
        if (z) {
            i3++;
            char c9 = i3 != i ? cArr[i3] : (char) 26;
            while (c9 <= ' ' && ((1 << c9) & 4294981376L) != 0) {
                i3++;
                c9 = cArr[i3];
            }
            c8 = c9;
        }
        this.f9539 = i3 + 1;
        this.f9538 = c8;
        return j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r4.f9539++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r6 == 65534) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r6 != 65279) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        mo6733();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r4.f9538 != '/') goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        mo6795();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3734(C3776 c3776, String str, char[] cArr, int i) {
        super(c3776, false);
        this.f9551 = -1;
        this.f9559 = str;
        this.f9558 = cArr;
        this.f9539 = 0;
        this.f9556 = i;
        this.f9557 = i;
        if (i <= 0) {
            this.f9538 = (char) 26;
            return;
        }
        this.f9538 = cArr[0];
        while (true) {
            char c = this.f9538;
            if (c > ' ' || ((1 << c) & 4294981376L) == 0) {
                break;
            }
            int i2 = this.f9539 + 1;
            this.f9539 = i2;
            if (i2 >= i) {
                this.f9538 = (char) 26;
                return;
            }
            this.f9538 = cArr[i2];
        }
    }
}

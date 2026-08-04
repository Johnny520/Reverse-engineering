package yyds;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: yyds.ᛶᛶᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1360 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public String f6332;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public AtomicReference f6333;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public Aweme f6334;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public C0947 f6335;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public int f6336;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public String f6337;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public int f6338;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final /* synthetic */ Context f6339;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public int f6340;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public AtomicBoolean f6341;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f6342;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public /* synthetic */ Object f6343;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public C0832 f6344;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public Object f6345;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public C0947 f6346;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public int f6347;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public C2143 f6348;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1360(ArrayList arrayList, Context context, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f6342 = arrayList;
        this.f6339 = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:302|94|270|95|96|259|97|98|308|99|100|288|101|102|268|103|104|257|105|(2:107|336)(17:108|318|109|110|111|290|129|(6:131|304|132|133|298|134)(1:140)|278|141|(1:143)|144|145|(3:183|146|265)|261|151|(4:182|235|(1:237)|238)(14:(3:282|154|(1:156))|160|161|162|163|330|164|165|320|166|167|(6:170|13|171|322|45|(0))|169|337))) */
    /* JADX WARN: Can't wrap try/catch for region: R(21:93|302|94|270|95|96|259|97|98|308|99|100|288|101|102|268|103|104|257|105|(2:107|336)(17:108|318|109|110|111|290|129|(6:131|304|132|133|298|134)(1:140)|278|141|(1:143)|144|145|(3:183|146|265)|261|151|(4:182|235|(1:237)|238)(14:(3:282|154|(1:156))|160|161|162|163|330|164|165|320|166|167|(6:170|13|171|322|45|(0))|169|337))) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0360, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0361, code lost:
    
        r4 = r3;
        r5 = r12;
        r3 = r13;
        r7 = r14;
        r10 = r16;
        r9 = r20;
        r12 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x036d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x036e, code lost:
    
        r21 = r8;
        r8 = r13;
        r22 = r11;
        r11 = r15;
        r20 = r18;
        r16 = r5;
        r18 = r6;
        r6 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x037e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x037f, code lost:
    
        r20 = r4;
        r18 = r6;
        r21 = r8;
        r8 = r13;
        r22 = r11;
        r11 = r15;
        r6 = r29;
        r16 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x038f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0390, code lost:
    
        r20 = r4;
        r18 = r6;
        r21 = r8;
        r8 = r13;
        r22 = r11;
        r13 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x039b, code lost:
    
        r6 = r29;
        r16 = r5;
        r11 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03a1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03a2, code lost:
    
        r20 = r4;
        r18 = r6;
        r21 = r8;
        r13 = r16;
        r22 = r11;
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03ae, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03af, code lost:
    
        r20 = r4;
        r16 = r5;
        r18 = r6;
        r21 = r8;
        r22 = r11;
        r8 = r13;
        r6 = r29;
        r11 = r15;
        r13 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x05ab, code lost:
    
        if (yyds.AbstractC2071.m3955(r5, r7, r28) == r6) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018c, code lost:
    
        if (r4 == r14) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00f0: MOVE (r10 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:241), block:B:30:0x00ef */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00ef: MOVE (r7 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:240), block:B:30:0x00ef */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0423 A[Catch: all -> 0x04a7, TRY_LEAVE, TryCatch #4 {all -> 0x04a7, blocks: (B:146:0x041c, B:161:0x044b, B:149:0x0423), top: B:265:0x041c }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0260 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x021a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:338:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:340:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:170:0x048a -> B:13:0x0064). Please report as a decompilation issue!!! */
    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo474(Object obj) throws Throwable {
        C0832 c0832;
        C0832 c08322;
        ArrayList arrayList;
        EnumC1765 enumC1765;
        Object obj2;
        Aweme aweme;
        AtomicReference atomicReference;
        int i;
        C2143 c2143;
        InterfaceC2213 interfaceC2213M1960;
        C0853 c0853;
        AtomicBoolean atomicBoolean;
        AtomicReference atomicReference2;
        Context context;
        int size;
        C0947 c0947;
        C0947 c09472;
        Object objM3955;
        Iterator it;
        C0947 c09473;
        C0947 c09474;
        C0832 c08323;
        AtomicReference atomicReference3;
        int i2;
        int i3;
        Aweme aweme2;
        C0947 c09475;
        C0947 c09476;
        String str;
        Context context2;
        int i4;
        int i5;
        Iterator it2;
        C0832 c08324;
        AtomicBoolean atomicBoolean2;
        EnumC1765 enumC17652;
        C0832 c08325;
        int i6;
        int i7;
        Aweme aweme3;
        String str2;
        AtomicReference atomicReference4;
        Object obj3;
        Iterator it3;
        AtomicBoolean atomicBoolean3;
        int i8;
        int i9;
        int i10;
        C2143 c21432;
        Aweme aweme4;
        Iterator it4;
        C0947 c09477;
        C0947 c09478;
        AtomicBoolean atomicBoolean4;
        int i11;
        Iterator it5;
        AtomicReference atomicReference5;
        EnumC1765 enumC17653;
        C0832 c08326;
        Object objM39552;
        Object c2658;
        int i12;
        int i13;
        Iterator it6;
        C0832 c08327;
        Aweme aweme5;
        AtomicReference atomicReference6;
        AtomicBoolean atomicBoolean5;
        C0947 c09479;
        int i14;
        C2143 c21433;
        AtomicReference atomicReference7;
        EnumC1765 enumC17654;
        Object obj4;
        Throwable thM4249;
        int i15;
        EnumC1765 enumC17655;
        C0832 c08328;
        C0947 c094710;
        C0947 c094711;
        AtomicReference atomicReference8;
        C0947 c094712;
        int i16;
        AtomicReference atomicReference9;
        EnumC1765 enumC17656;
        Object obj5;
        String str3;
        C0832 c08329;
        EnumC1765 enumC17657;
        Object obj6;
        C0947 c094713;
        Object obj7;
        AtomicReference atomicReference10;
        AtomicReference atomicReference11;
        Object obj8;
        String strM4682;
        EnumC1765 enumC17658;
        Object obj9;
        Aweme aweme6;
        C0947 c094714;
        C1158 c1158;
        C1139 c1139;
        C0947 c094715;
        Object obj10;
        EnumC1765 enumC17659;
        Object obj11;
        String strM1262;
        int i17;
        String str4;
        C0947 c094716;
        C0947 c094717;
        AtomicBoolean atomicBoolean6;
        Aweme aweme7;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) this.f6343;
        int i18 = this.f6336;
        Context context3 = this.f6339;
        ArrayList arrayList2 = this.f6342;
        EnumC1765 enumC176510 = EnumC1765.f8858;
        try {
            try {
                switch (i18) {
                    case 0:
                        AbstractC1544.m3189(obj);
                        atomicBoolean = new AtomicBoolean(false);
                        atomicReference2 = new AtomicReference();
                        context = context3;
                        size = arrayList2.size();
                        c0947 = new C0947();
                        c09472 = new C0947();
                        C1206 c1206 = AbstractC0221.f1238;
                        C1158 c11582 = AbstractC1353.f6250;
                        C1647 c1647 = new C1647(context, size, atomicBoolean, atomicReference2, (InterfaceC0274) null);
                        this.f6343 = interfaceC0990;
                        this.f6341 = atomicBoolean;
                        this.f6333 = atomicReference2;
                        this.f6335 = c0947;
                        this.f6346 = c09472;
                        this.f6340 = size;
                        this.f6336 = 1;
                        objM3955 = AbstractC2071.m3955(c11582, c1647, this);
                        break;
                    case 1:
                        int i19 = this.f6340;
                        c09472 = this.f6346;
                        C0947 c094718 = this.f6335;
                        AtomicReference atomicReference12 = this.f6333;
                        atomicBoolean = this.f6341;
                        AbstractC1544.m3189(obj);
                        atomicReference2 = atomicReference12;
                        context = context3;
                        size = i19;
                        c0947 = c094718;
                        objM3955 = obj;
                        C0832 c083210 = (C0832) objM3955;
                        try {
                            it = arrayList2.iterator();
                            c09473 = c0947;
                            c09474 = c09472;
                            c08323 = c083210;
                            i = size;
                            atomicReference3 = atomicReference2;
                            i2 = 0;
                            try {
                                if (it.hasNext()) {
                                    int i20 = i2 + 1;
                                    try {
                                        Aweme aweme8 = (Aweme) it.next();
                                        if (!atomicBoolean.get()) {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            C1206 c12062 = AbstractC0221.f1238;
                                                            C1158 c11583 = AbstractC1353.f6250;
                                                            C1639 c1639 = new C1639(c08323, i2, strM1262, c09474, c09473, (InterfaceC0274) null);
                                                            this.f6343 = interfaceC0990;
                                                            this.f6341 = atomicBoolean;
                                                            this.f6333 = atomicReference3;
                                                            this.f6335 = c094717;
                                                            this.f6346 = c094716;
                                                            this.f6344 = c08324;
                                                            this.f6345 = it;
                                                            this.f6334 = aweme8;
                                                            this.f6332 = str4;
                                                            this.f6337 = null;
                                                            this.f6348 = null;
                                                            this.f6340 = i;
                                                            this.f6338 = i20;
                                                            this.f6347 = i17;
                                                            this.f6336 = 2;
                                                            if (AbstractC2071.m3955(c11583, c1639, this) != enumC176510) {
                                                                atomicReference11 = atomicReference3;
                                                                c09475 = c094716;
                                                                aweme2 = aweme8;
                                                                i4 = i;
                                                                i3 = i17;
                                                                c09476 = c094717;
                                                                i5 = i20;
                                                                it2 = it;
                                                                atomicBoolean2 = atomicBoolean6;
                                                                str = str4;
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    Map map = C2609.f12814;
                                                                                    strM4682 = C2609.m4682(aweme2);
                                                                                    if (strM4682 != null) {
                                                                                        try {
                                                                                            if (!AbstractC0473.m1313(strM4682)) {
                                                                                                try {
                                                                                                    C1226 c1226 = C1226.f5638;
                                                                                                    this.f6343 = interfaceC0990;
                                                                                                    this.f6341 = atomicBoolean2;
                                                                                                    this.f6333 = atomicReference11;
                                                                                                    this.f6335 = c09476;
                                                                                                    this.f6346 = c09475;
                                                                                                    this.f6344 = c08324;
                                                                                                    this.f6345 = it2;
                                                                                                    this.f6334 = aweme2;
                                                                                                    this.f6332 = null;
                                                                                                    this.f6337 = strM4682;
                                                                                                    this.f6340 = i4;
                                                                                                    this.f6338 = i5;
                                                                                                    this.f6347 = i3;
                                                                                                    this.f6336 = 4;
                                                                                                    c1226.getClass();
                                                                                                    if (str != enumC176510) {
                                                                                                        try {
                                                                                                            AtomicBoolean atomicBoolean7 = atomicBoolean2;
                                                                                                            c08325 = c08324;
                                                                                                            atomicBoolean3 = atomicBoolean7;
                                                                                                            str2 = strM4682;
                                                                                                            it3 = it2;
                                                                                                            i7 = i4;
                                                                                                            atomicReference4 = atomicReference11;
                                                                                                            i6 = i5;
                                                                                                            aweme3 = aweme6;
                                                                                                            obj3 = str;
                                                                                                            str3 = (String) obj3;
                                                                                                            if (str3 != null) {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            c09475.f4410++;
                                                                                                                            C1206 c12063 = AbstractC0221.f1238;
                                                                                                                            C1158 c11584 = AbstractC1353.f6250;
                                                                                                                            C1139 c11392 = new C1139(c08329, c094713, c094712, null, 2);
                                                                                                                            this.f6343 = interfaceC0990;
                                                                                                                            this.f6341 = atomicBoolean3;
                                                                                                                            this.f6333 = atomicReference4;
                                                                                                                            this.f6335 = c094712;
                                                                                                                            this.f6346 = c094713;
                                                                                                                            this.f6344 = c08329;
                                                                                                                            this.f6345 = it3;
                                                                                                                            this.f6334 = null;
                                                                                                                            this.f6332 = null;
                                                                                                                            this.f6337 = null;
                                                                                                                            this.f6340 = i7;
                                                                                                                            this.f6338 = i6;
                                                                                                                            this.f6347 = i16;
                                                                                                                            this.f6336 = 5;
                                                                                                                            if (AbstractC2071.m3955(c11584, c11392, this) == enumC17657) {
                                                                                                                                return enumC17657;
                                                                                                                            }
                                                                                                                            atomicBoolean = atomicBoolean3;
                                                                                                                            c09473 = c094712;
                                                                                                                            i2 = i6;
                                                                                                                            c08323 = c08329;
                                                                                                                            c09474 = c094713;
                                                                                                                            atomicReference3 = atomicReference4;
                                                                                                                            context = context2;
                                                                                                                            i = i7;
                                                                                                                            enumC176510 = enumC17657;
                                                                                                                            it = it3;
                                                                                                                            if (it.hasNext()) {
                                                                                                                            }
                                                                                                                        } catch (Throwable th) {
                                                                                                                            th = th;
                                                                                                                            aweme = obj6;
                                                                                                                            atomicReference = atomicReference4;
                                                                                                                            enumC1765 = enumC17657;
                                                                                                                            c08322 = c08329;
                                                                                                                            i = i7;
                                                                                                                            c2143 = (C2143) atomicReference.getAndSet(aweme);
                                                                                                                            if (c2143 != null) {
                                                                                                                            }
                                                                                                                            C0948 c0948 = C0948.f4411;
                                                                                                                            C1206 c12064 = AbstractC0221.f1238;
                                                                                                                            interfaceC2213M1960 = AbstractC0879.m1960(c0948, AbstractC1353.f6250);
                                                                                                                            c0853 = new C0853(c08322, aweme, 5);
                                                                                                                            this.f6343 = aweme;
                                                                                                                            this.f6341 = aweme;
                                                                                                                            this.f6333 = aweme;
                                                                                                                            this.f6335 = aweme;
                                                                                                                            this.f6346 = aweme;
                                                                                                                            this.f6344 = aweme;
                                                                                                                            this.f6345 = th;
                                                                                                                            this.f6334 = aweme;
                                                                                                                            this.f6332 = aweme;
                                                                                                                            this.f6337 = aweme;
                                                                                                                            this.f6348 = aweme;
                                                                                                                            this.f6340 = i;
                                                                                                                            this.f6336 = 9;
                                                                                                                            if (AbstractC2071.m3955(interfaceC2213M1960, c0853, this) == enumC1765) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                        obj6 = null;
                                                                                                                    } catch (Throwable th2) {
                                                                                                                        th = th2;
                                                                                                                        obj6 = null;
                                                                                                                    }
                                                                                                                    EnumC1765 enumC176511 = enumC176510;
                                                                                                                    c08329 = c08325;
                                                                                                                    enumC17657 = enumC176511;
                                                                                                                    c094713 = c09475;
                                                                                                                } catch (Throwable th3) {
                                                                                                                    th = th3;
                                                                                                                    EnumC1765 enumC176512 = enumC176510;
                                                                                                                    c08329 = c08325;
                                                                                                                    enumC17657 = enumC176512;
                                                                                                                    obj6 = null;
                                                                                                                }
                                                                                                            } else {
                                                                                                                EnumC1765 enumC176513 = enumC176510;
                                                                                                                c08326 = c08325;
                                                                                                                c09477 = c09475;
                                                                                                                try {
                                                                                                                    C2143 c21434 = new C2143();
                                                                                                                    atomicReference4.set(c21434);
                                                                                                                    C1221 c1221 = C1221.f5600;
                                                                                                                    C1639 c16392 = new C1639(c08326, c09477, c094712, (InterfaceC0274) null, 10);
                                                                                                                    C0947 c094719 = c094712;
                                                                                                                    this.f6343 = interfaceC0990;
                                                                                                                    this.f6341 = atomicBoolean3;
                                                                                                                    this.f6333 = atomicReference4;
                                                                                                                    this.f6335 = c094719;
                                                                                                                    this.f6346 = c09477;
                                                                                                                    this.f6344 = c08326;
                                                                                                                    this.f6345 = it3;
                                                                                                                    this.f6334 = aweme3;
                                                                                                                    Aweme aweme9 = aweme3;
                                                                                                                    this.f6332 = null;
                                                                                                                    this.f6337 = null;
                                                                                                                    this.f6348 = c21434;
                                                                                                                    this.f6340 = i7;
                                                                                                                    this.f6338 = i6;
                                                                                                                    this.f6347 = i16;
                                                                                                                    this.f6336 = 6;
                                                                                                                    c1221.getClass();
                                                                                                                    C1206 c12065 = AbstractC0221.f1238;
                                                                                                                    AtomicBoolean atomicBoolean8 = atomicBoolean3;
                                                                                                                    c21432 = c21434;
                                                                                                                    i11 = i16;
                                                                                                                    enumC17653 = enumC176513;
                                                                                                                    AtomicReference atomicReference13 = atomicReference4;
                                                                                                                    Aweme aweme10 = aweme9;
                                                                                                                    it5 = it3;
                                                                                                                    context3 = context2;
                                                                                                                    objM39552 = AbstractC2071.m3955(ExecutorC2482.f12272, new C1328(str3, context3, str2, c21432, c16392, null), this);
                                                                                                                    if (objM39552 == enumC17653) {
                                                                                                                        return enumC17653;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                i10 = i7;
                                                                                                                                i9 = i6;
                                                                                                                                c09478 = c094719;
                                                                                                                                atomicReference8 = atomicReference13;
                                                                                                                                it4 = it5;
                                                                                                                                aweme4 = aweme10;
                                                                                                                                atomicBoolean4 = atomicBoolean8;
                                                                                                                                i8 = i11;
                                                                                                                                try {
                                                                                                                                } catch (Throwable th4) {
                                                                                                                                    try {
                                                                                                                                        th = th4;
                                                                                                                                        c2658 = new C2658(th);
                                                                                                                                        c08326 = c08322;
                                                                                                                                        i12 = i11;
                                                                                                                                        i13 = i9;
                                                                                                                                        it6 = it5;
                                                                                                                                        atomicReference7 = atomicReference5;
                                                                                                                                        context2 = context3;
                                                                                                                                        thM4249 = C2248.m4249(c2658);
                                                                                                                                        if (thM4249 == null) {
                                                                                                                                        }
                                                                                                                                        if (c2658 instanceof C2658) {
                                                                                                                                        }
                                                                                                                                        C1014 c1014 = (C1014) c2658;
                                                                                                                                        Object obj12 = null;
                                                                                                                                        obj12 = null;
                                                                                                                                        aweme = 0;
                                                                                                                                        aweme5 = null;
                                                                                                                                        obj12 = null;
                                                                                                                                        while (!atomicReference7.compareAndSet(c21432, null)) {
                                                                                                                                            try {
                                                                                                                                            } catch (Throwable th5) {
                                                                                                                                                th = th5;
                                                                                                                                                c08326 = c08328;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        if (atomicBoolean4.get()) {
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th6) {
                                                                                                                                        th = th6;
                                                                                                                                        EnumC1765 enumC176514 = enumC17653;
                                                                                                                                        aweme = 0;
                                                                                                                                        enumC1765 = enumC176514;
                                                                                                                                        atomicReference = atomicReference5;
                                                                                                                                        c2143 = (C2143) atomicReference.getAndSet(aweme);
                                                                                                                                        if (c2143 != null) {
                                                                                                                                        }
                                                                                                                                        C0948 c09482 = C0948.f4411;
                                                                                                                                        C1206 c120642 = AbstractC0221.f1238;
                                                                                                                                        interfaceC2213M1960 = AbstractC0879.m1960(c09482, AbstractC1353.f6250);
                                                                                                                                        c0853 = new C0853(c08322, aweme, 5);
                                                                                                                                        this.f6343 = aweme;
                                                                                                                                        this.f6341 = aweme;
                                                                                                                                        this.f6333 = aweme;
                                                                                                                                        this.f6335 = aweme;
                                                                                                                                        this.f6346 = aweme;
                                                                                                                                        this.f6344 = aweme;
                                                                                                                                        this.f6345 = th;
                                                                                                                                        this.f6334 = aweme;
                                                                                                                                        this.f6332 = aweme;
                                                                                                                                        this.f6337 = aweme;
                                                                                                                                        this.f6348 = aweme;
                                                                                                                                        this.f6340 = i;
                                                                                                                                        this.f6336 = 9;
                                                                                                                                        if (AbstractC2071.m3955(interfaceC2213M1960, c0853, this) == enumC1765) {
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    i11 = i8;
                                                                                                                                    i = i10;
                                                                                                                                    it5 = it4;
                                                                                                                                    atomicReference5 = atomicReference8;
                                                                                                                                    c08322 = c08326;
                                                                                                                                }
                                                                                                                                AtomicReference atomicReference14 = atomicReference8;
                                                                                                                                c2658 = (C1014) objM39552;
                                                                                                                                i12 = i8;
                                                                                                                                i = i10;
                                                                                                                                i13 = i9;
                                                                                                                                it6 = it4;
                                                                                                                                atomicReference7 = atomicReference14;
                                                                                                                                thM4249 = C2248.m4249(c2658);
                                                                                                                                if (thM4249 == null) {
                                                                                                                                    c08328 = c08326;
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            C2336 c2336 = C2336.f11496;
                                                                                                                                            StringBuilder sb = new StringBuilder();
                                                                                                                                            i15 = i12;
                                                                                                                                            sb.append(AbstractC2328.m4341(-203834425770862L));
                                                                                                                                            sb.append(aweme4.aid);
                                                                                                                                            sb.append(AbstractC2328.m4341(-203873080476526L));
                                                                                                                                            c2336.m4355(sb.toString(), thM4249);
                                                                                                                                            break;
                                                                                                                                        } catch (Throwable th7) {
                                                                                                                                            th = th7;
                                                                                                                                            c08322 = c08328;
                                                                                                                                            enumC1765 = enumC17655;
                                                                                                                                            obj2 = atomicReference7;
                                                                                                                                            aweme = 0;
                                                                                                                                            atomicReference = obj2;
                                                                                                                                            c2143 = (C2143) atomicReference.getAndSet(aweme);
                                                                                                                                            if (c2143 != null) {
                                                                                                                                            }
                                                                                                                                            C0948 c094822 = C0948.f4411;
                                                                                                                                            C1206 c1206422 = AbstractC0221.f1238;
                                                                                                                                            interfaceC2213M1960 = AbstractC0879.m1960(c094822, AbstractC1353.f6250);
                                                                                                                                            c0853 = new C0853(c08322, aweme, 5);
                                                                                                                                            this.f6343 = aweme;
                                                                                                                                            this.f6341 = aweme;
                                                                                                                                            this.f6333 = aweme;
                                                                                                                                            this.f6335 = aweme;
                                                                                                                                            this.f6346 = aweme;
                                                                                                                                            this.f6344 = aweme;
                                                                                                                                            this.f6345 = th;
                                                                                                                                            this.f6334 = aweme;
                                                                                                                                            this.f6332 = aweme;
                                                                                                                                            this.f6337 = aweme;
                                                                                                                                            this.f6348 = aweme;
                                                                                                                                            this.f6340 = i;
                                                                                                                                            this.f6336 = 9;
                                                                                                                                            if (AbstractC2071.m3955(interfaceC2213M1960, c0853, this) == enumC1765) {
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        enumC17655 = enumC17653;
                                                                                                                                    } catch (Throwable th8) {
                                                                                                                                        th = th8;
                                                                                                                                        enumC17655 = enumC17653;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i15 = i12;
                                                                                                                                    enumC17655 = enumC17653;
                                                                                                                                    c08328 = c08326;
                                                                                                                                }
                                                                                                                                if (c2658 instanceof C2658) {
                                                                                                                                    c2658 = null;
                                                                                                                                }
                                                                                                                                C1014 c10142 = (C1014) c2658;
                                                                                                                                Object obj122 = null;
                                                                                                                                obj122 = null;
                                                                                                                                aweme = 0;
                                                                                                                                aweme5 = null;
                                                                                                                                obj122 = null;
                                                                                                                                while (!atomicReference7.compareAndSet(c21432, null) && atomicReference7.get() == c21432) {
                                                                                                                                }
                                                                                                                                if (atomicBoolean4.get()) {
                                                                                                                                    c08327 = c08328;
                                                                                                                                    enumC17652 = enumC17655;
                                                                                                                                    i14 = i;
                                                                                                                                    atomicBoolean5 = atomicBoolean4;
                                                                                                                                    c09479 = c09477;
                                                                                                                                    atomicReference6 = atomicReference7;
                                                                                                                                    c21433 = (C2143) atomicReference6.getAndSet(aweme5);
                                                                                                                                    if (c21433 != null) {
                                                                                                                                        c21433.m4091();
                                                                                                                                    }
                                                                                                                                    C0948 c09483 = C0948.f4411;
                                                                                                                                    C1206 c12066 = AbstractC0221.f1238;
                                                                                                                                    InterfaceC2213 interfaceC2213M19602 = AbstractC0879.m1960(c09483, AbstractC1353.f6250);
                                                                                                                                    C0853 c08532 = new C0853(c08327, aweme5, 5);
                                                                                                                                    this.f6343 = aweme5;
                                                                                                                                    this.f6341 = atomicBoolean5;
                                                                                                                                    this.f6333 = aweme5;
                                                                                                                                    this.f6335 = c09478;
                                                                                                                                    this.f6346 = c09479;
                                                                                                                                    this.f6344 = aweme5;
                                                                                                                                    this.f6345 = aweme5;
                                                                                                                                    this.f6334 = aweme5;
                                                                                                                                    this.f6332 = aweme5;
                                                                                                                                    this.f6337 = aweme5;
                                                                                                                                    this.f6348 = aweme5;
                                                                                                                                    this.f6340 = i14;
                                                                                                                                    this.f6336 = 8;
                                                                                                                                    aweme7 = aweme5;
                                                                                                                                } else {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            if (c10142 != null) {
                                                                                                                                                try {
                                                                                                                                                    if (c10142.f4604) {
                                                                                                                                                        c09478.f4410++;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th9) {
                                                                                                                                                    th = th9;
                                                                                                                                                    c08322 = c08328;
                                                                                                                                                    enumC1765 = enumC17655;
                                                                                                                                                    atomicReference = atomicReference7;
                                                                                                                                                    c2143 = (C2143) atomicReference.getAndSet(aweme);
                                                                                                                                                    if (c2143 != null) {
                                                                                                                                                    }
                                                                                                                                                    C0948 c0948222 = C0948.f4411;
                                                                                                                                                    C1206 c12064222 = AbstractC0221.f1238;
                                                                                                                                                    interfaceC2213M1960 = AbstractC0879.m1960(c0948222, AbstractC1353.f6250);
                                                                                                                                                    c0853 = new C0853(c08322, aweme, 5);
                                                                                                                                                    this.f6343 = aweme;
                                                                                                                                                    this.f6341 = aweme;
                                                                                                                                                    this.f6333 = aweme;
                                                                                                                                                    this.f6335 = aweme;
                                                                                                                                                    this.f6346 = aweme;
                                                                                                                                                    this.f6344 = aweme;
                                                                                                                                                    this.f6345 = th;
                                                                                                                                                    this.f6334 = aweme;
                                                                                                                                                    this.f6332 = aweme;
                                                                                                                                                    this.f6337 = aweme;
                                                                                                                                                    this.f6348 = aweme;
                                                                                                                                                    this.f6340 = i;
                                                                                                                                                    this.f6336 = 9;
                                                                                                                                                    if (AbstractC2071.m3955(interfaceC2213M1960, c0853, this) == enumC1765) {
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            c09477.f4410++;
                                                                                                                                            C1206 c12067 = AbstractC0221.f1238;
                                                                                                                                            C1158 c11585 = AbstractC1353.f6250;
                                                                                                                                            C1139 c11393 = new C1139(c08326, c09477, c094710, null, 1);
                                                                                                                                            this.f6343 = interfaceC0990;
                                                                                                                                            this.f6341 = atomicBoolean4;
                                                                                                                                            this.f6333 = atomicReference7;
                                                                                                                                            this.f6335 = c094711;
                                                                                                                                            this.f6346 = c09477;
                                                                                                                                            this.f6344 = c08326;
                                                                                                                                            this.f6345 = it6;
                                                                                                                                            this.f6334 = null;
                                                                                                                                            this.f6332 = null;
                                                                                                                                            this.f6337 = null;
                                                                                                                                            this.f6348 = null;
                                                                                                                                            this.f6340 = i;
                                                                                                                                            this.f6338 = i13;
                                                                                                                                            this.f6347 = i15;
                                                                                                                                            this.f6336 = 7;
                                                                                                                                            enumC17652 = enumC17655;
                                                                                                                                            if (AbstractC2071.m3955(c11585, c11393, this) != enumC17652) {
                                                                                                                                                i2 = i13;
                                                                                                                                                atomicBoolean = atomicBoolean4;
                                                                                                                                                c08323 = c08326;
                                                                                                                                                c09474 = c09477;
                                                                                                                                                atomicReference3 = atomicReference7;
                                                                                                                                                c09473 = c094711;
                                                                                                                                                it = it6;
                                                                                                                                                context = context2;
                                                                                                                                                enumC176510 = enumC17652;
                                                                                                                                                if (it.hasNext()) {
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            return enumC17652;
                                                                                                                                        } catch (Throwable th10) {
                                                                                                                                            th = th10;
                                                                                                                                            enumC17654 = enumC17655;
                                                                                                                                            obj4 = obj122;
                                                                                                                                            enumC1765 = enumC17654;
                                                                                                                                            atomicReference10 = atomicReference7;
                                                                                                                                            obj7 = obj4;
                                                                                                                                            c08322 = c08326;
                                                                                                                                            atomicReference = atomicReference10;
                                                                                                                                            aweme = obj7;
                                                                                                                                            c2143 = (C2143) atomicReference.getAndSet(aweme);
                                                                                                                                            if (c2143 != null) {
                                                                                                                                            }
                                                                                                                                            C0948 c09482222 = C0948.f4411;
                                                                                                                                            C1206 c120642222 = AbstractC0221.f1238;
                                                                                                                                            interfaceC2213M1960 = AbstractC0879.m1960(c09482222, AbstractC1353.f6250);
                                                                                                                                            c0853 = new C0853(c08322, aweme, 5);
                                                                                                                                            this.f6343 = aweme;
                                                                                                                                            this.f6341 = aweme;
                                                                                                                                            this.f6333 = aweme;
                                                                                                                                            this.f6335 = aweme;
                                                                                                                                            this.f6346 = aweme;
                                                                                                                                            this.f6344 = aweme;
                                                                                                                                            this.f6345 = th;
                                                                                                                                            this.f6334 = aweme;
                                                                                                                                            this.f6332 = aweme;
                                                                                                                                            this.f6337 = aweme;
                                                                                                                                            this.f6348 = aweme;
                                                                                                                                            this.f6340 = i;
                                                                                                                                            this.f6336 = 9;
                                                                                                                                            if (AbstractC2071.m3955(interfaceC2213M1960, c0853, this) == enumC1765) {
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        c094711 = c094710;
                                                                                                                                    } catch (Throwable th11) {
                                                                                                                                        th = th11;
                                                                                                                                        obj122 = null;
                                                                                                                                    }
                                                                                                                                    c08326 = c08328;
                                                                                                                                    c094710 = c09478;
                                                                                                                                }
                                                                                                                            } catch (Throwable th12) {
                                                                                                                                th = th12;
                                                                                                                                c08326 = c08328;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        } catch (Throwable th13) {
                                                                                                                            th = th13;
                                                                                                                            c08326 = c08328;
                                                                                                                            enumC17654 = enumC17655;
                                                                                                                            obj4 = null;
                                                                                                                            enumC1765 = enumC17654;
                                                                                                                            atomicReference10 = atomicReference7;
                                                                                                                            obj7 = obj4;
                                                                                                                            c08322 = c08326;
                                                                                                                            atomicReference = atomicReference10;
                                                                                                                            aweme = obj7;
                                                                                                                            c2143 = (C2143) atomicReference.getAndSet(aweme);
                                                                                                                            if (c2143 != null) {
                                                                                                                            }
                                                                                                                            C0948 c094822222 = C0948.f4411;
                                                                                                                            C1206 c1206422222 = AbstractC0221.f1238;
                                                                                                                            interfaceC2213M1960 = AbstractC0879.m1960(c094822222, AbstractC1353.f6250);
                                                                                                                            c0853 = new C0853(c08322, aweme, 5);
                                                                                                                            this.f6343 = aweme;
                                                                                                                            this.f6341 = aweme;
                                                                                                                            this.f6333 = aweme;
                                                                                                                            this.f6335 = aweme;
                                                                                                                            this.f6346 = aweme;
                                                                                                                            this.f6344 = aweme;
                                                                                                                            this.f6345 = th;
                                                                                                                            this.f6334 = aweme;
                                                                                                                            this.f6332 = aweme;
                                                                                                                            this.f6337 = aweme;
                                                                                                                            this.f6348 = aweme;
                                                                                                                            this.f6340 = i;
                                                                                                                            this.f6336 = 9;
                                                                                                                            if (AbstractC2071.m3955(interfaceC2213M1960, c0853, this) == enumC1765) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } catch (Throwable th14) {
                                                                                                                        th = th14;
                                                                                                                        enumC17654 = enumC17653;
                                                                                                                    }
                                                                                                                    context2 = context3;
                                                                                                                } catch (Throwable th15) {
                                                                                                                    th = th15;
                                                                                                                    atomicReference9 = atomicReference4;
                                                                                                                    enumC17656 = enumC176513;
                                                                                                                    obj5 = null;
                                                                                                                    i = i7;
                                                                                                                    enumC1765 = enumC17656;
                                                                                                                    c08322 = c08326;
                                                                                                                    atomicReference = atomicReference9;
                                                                                                                    aweme = obj5;
                                                                                                                    c2143 = (C2143) atomicReference.getAndSet(aweme);
                                                                                                                    if (c2143 != null) {
                                                                                                                    }
                                                                                                                    C0948 c0948222222 = C0948.f4411;
                                                                                                                    C1206 c12064222222 = AbstractC0221.f1238;
                                                                                                                    interfaceC2213M1960 = AbstractC0879.m1960(c0948222222, AbstractC1353.f6250);
                                                                                                                    c0853 = new C0853(c08322, aweme, 5);
                                                                                                                    this.f6343 = aweme;
                                                                                                                    this.f6341 = aweme;
                                                                                                                    this.f6333 = aweme;
                                                                                                                    this.f6335 = aweme;
                                                                                                                    this.f6346 = aweme;
                                                                                                                    this.f6344 = aweme;
                                                                                                                    this.f6345 = th;
                                                                                                                    this.f6334 = aweme;
                                                                                                                    this.f6332 = aweme;
                                                                                                                    this.f6337 = aweme;
                                                                                                                    this.f6348 = aweme;
                                                                                                                    this.f6340 = i;
                                                                                                                    this.f6336 = 9;
                                                                                                                    if (AbstractC2071.m3955(interfaceC2213M1960, c0853, this) == enumC1765) {
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (Throwable th16) {
                                                                                                            th = th16;
                                                                                                            atomicReference9 = atomicReference4;
                                                                                                            enumC17656 = enumC176510;
                                                                                                            obj5 = null;
                                                                                                            c08326 = c08325;
                                                                                                        }
                                                                                                        c094712 = c09476;
                                                                                                        i16 = i3;
                                                                                                    }
                                                                                                } catch (Throwable th17) {
                                                                                                    th = th17;
                                                                                                    obj9 = null;
                                                                                                    enumC17658 = enumC176510;
                                                                                                    i = i4;
                                                                                                    enumC1765 = enumC17658;
                                                                                                    c08322 = c08324;
                                                                                                    atomicReference = atomicReference11;
                                                                                                    aweme = obj9;
                                                                                                    c2143 = (C2143) atomicReference.getAndSet(aweme);
                                                                                                    if (c2143 != null) {
                                                                                                        c2143.m4091();
                                                                                                    }
                                                                                                    C0948 c09482222222 = C0948.f4411;
                                                                                                    C1206 c120642222222 = AbstractC0221.f1238;
                                                                                                    interfaceC2213M1960 = AbstractC0879.m1960(c09482222222, AbstractC1353.f6250);
                                                                                                    c0853 = new C0853(c08322, aweme, 5);
                                                                                                    this.f6343 = aweme;
                                                                                                    this.f6341 = aweme;
                                                                                                    this.f6333 = aweme;
                                                                                                    this.f6335 = aweme;
                                                                                                    this.f6346 = aweme;
                                                                                                    this.f6344 = aweme;
                                                                                                    this.f6345 = th;
                                                                                                    this.f6334 = aweme;
                                                                                                    this.f6332 = aweme;
                                                                                                    this.f6337 = aweme;
                                                                                                    this.f6348 = aweme;
                                                                                                    this.f6340 = i;
                                                                                                    this.f6336 = 9;
                                                                                                    if (AbstractC2071.m3955(interfaceC2213M1960, c0853, this) == enumC1765) {
                                                                                                        return enumC1765;
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                                aweme6 = aweme2;
                                                                                            }
                                                                                        } catch (Throwable th18) {
                                                                                            th = th18;
                                                                                            enumC17658 = enumC176510;
                                                                                            obj9 = null;
                                                                                        }
                                                                                    }
                                                                                    C1206 c12068 = AbstractC0221.f1238;
                                                                                    c1158 = AbstractC1353.f6250;
                                                                                    c1139 = new C1139(c08326, c094715, c094714, null, 0);
                                                                                    this.f6343 = interfaceC0990;
                                                                                    this.f6341 = atomicBoolean2;
                                                                                    this.f6333 = atomicReference11;
                                                                                    this.f6335 = c094714;
                                                                                    this.f6346 = c094715;
                                                                                    this.f6344 = c08326;
                                                                                    this.f6345 = it2;
                                                                                    this.f6334 = null;
                                                                                    this.f6332 = null;
                                                                                    this.f6337 = null;
                                                                                    this.f6340 = i4;
                                                                                    this.f6338 = i5;
                                                                                    this.f6347 = i3;
                                                                                    this.f6336 = 3;
                                                                                    if (AbstractC2071.m3955(c1158, c1139, this) != enumC17652) {
                                                                                        i2 = i5;
                                                                                        i = i4;
                                                                                        atomicReference3 = atomicReference11;
                                                                                        c08323 = c08326;
                                                                                        c09474 = c094715;
                                                                                        c09473 = c094714;
                                                                                        atomicBoolean = atomicBoolean2;
                                                                                        it = it2;
                                                                                        context = context2;
                                                                                        enumC176510 = enumC17652;
                                                                                        if (it.hasNext()) {
                                                                                        }
                                                                                    }
                                                                                    return enumC17652;
                                                                                } catch (Throwable th19) {
                                                                                    th = th19;
                                                                                    i = i4;
                                                                                    enumC1765 = enumC17652;
                                                                                    atomicReference10 = atomicReference11;
                                                                                    obj7 = obj8;
                                                                                    c08322 = c08326;
                                                                                    atomicReference = atomicReference10;
                                                                                    aweme = obj7;
                                                                                    c2143 = (C2143) atomicReference.getAndSet(aweme);
                                                                                    if (c2143 != null) {
                                                                                    }
                                                                                    C0948 c094822222222 = C0948.f4411;
                                                                                    C1206 c1206422222222 = AbstractC0221.f1238;
                                                                                    interfaceC2213M1960 = AbstractC0879.m1960(c094822222222, AbstractC1353.f6250);
                                                                                    c0853 = new C0853(c08322, aweme, 5);
                                                                                    this.f6343 = aweme;
                                                                                    this.f6341 = aweme;
                                                                                    this.f6333 = aweme;
                                                                                    this.f6335 = aweme;
                                                                                    this.f6346 = aweme;
                                                                                    this.f6344 = aweme;
                                                                                    this.f6345 = th;
                                                                                    this.f6334 = aweme;
                                                                                    this.f6332 = aweme;
                                                                                    this.f6337 = aweme;
                                                                                    this.f6348 = aweme;
                                                                                    this.f6340 = i;
                                                                                    this.f6336 = 9;
                                                                                    if (AbstractC2071.m3955(interfaceC2213M1960, c0853, this) == enumC1765) {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th20) {
                                                                                th = th20;
                                                                                obj8 = null;
                                                                            }
                                                                            c08326 = c08324;
                                                                            c094715 = c09475;
                                                                        } catch (Throwable th21) {
                                                                            th = th21;
                                                                        }
                                                                        c094714 = c09476;
                                                                        enumC17652 = enumC176510;
                                                                        obj8 = null;
                                                                        obj8 = null;
                                                                        obj8 = null;
                                                                    } catch (Throwable th22) {
                                                                        th = th22;
                                                                        c08326 = c08324;
                                                                        i = i4;
                                                                        enumC1765 = enumC17652;
                                                                        atomicReference10 = atomicReference11;
                                                                        obj7 = obj8;
                                                                        c08322 = c08326;
                                                                        atomicReference = atomicReference10;
                                                                        aweme = obj7;
                                                                        c2143 = (C2143) atomicReference.getAndSet(aweme);
                                                                        if (c2143 != null) {
                                                                        }
                                                                        C0948 c0948222222222 = C0948.f4411;
                                                                        C1206 c12064222222222 = AbstractC0221.f1238;
                                                                        interfaceC2213M1960 = AbstractC0879.m1960(c0948222222222, AbstractC1353.f6250);
                                                                        c0853 = new C0853(c08322, aweme, 5);
                                                                        this.f6343 = aweme;
                                                                        this.f6341 = aweme;
                                                                        this.f6333 = aweme;
                                                                        this.f6335 = aweme;
                                                                        this.f6346 = aweme;
                                                                        this.f6344 = aweme;
                                                                        this.f6345 = th;
                                                                        this.f6334 = aweme;
                                                                        this.f6332 = aweme;
                                                                        this.f6337 = aweme;
                                                                        this.f6348 = aweme;
                                                                        this.f6340 = i;
                                                                        this.f6336 = 9;
                                                                        if (AbstractC2071.m3955(interfaceC2213M1960, c0853, this) == enumC1765) {
                                                                        }
                                                                    }
                                                                    c09475.f4410++;
                                                                } catch (Throwable th23) {
                                                                    th = th23;
                                                                    enumC17652 = enumC176510;
                                                                    obj8 = null;
                                                                }
                                                                break;
                                                            }
                                                            return enumC176510;
                                                        } catch (Throwable th24) {
                                                            th = th24;
                                                            enumC17659 = enumC176510;
                                                            obj11 = null;
                                                            enumC1765 = enumC17659;
                                                            obj10 = obj11;
                                                            c08322 = c08324;
                                                            atomicReference = atomicReference3;
                                                            aweme = obj10;
                                                            c2143 = (C2143) atomicReference.getAndSet(aweme);
                                                            if (c2143 != null) {
                                                            }
                                                            C0948 c09482222222222 = C0948.f4411;
                                                            C1206 c120642222222222 = AbstractC0221.f1238;
                                                            interfaceC2213M1960 = AbstractC0879.m1960(c09482222222222, AbstractC1353.f6250);
                                                            c0853 = new C0853(c08322, aweme, 5);
                                                            this.f6343 = aweme;
                                                            this.f6341 = aweme;
                                                            this.f6333 = aweme;
                                                            this.f6335 = aweme;
                                                            this.f6346 = aweme;
                                                            this.f6344 = aweme;
                                                            this.f6345 = th;
                                                            this.f6334 = aweme;
                                                            this.f6332 = aweme;
                                                            this.f6337 = aweme;
                                                            this.f6348 = aweme;
                                                            this.f6340 = i;
                                                            this.f6336 = 9;
                                                            if (AbstractC2071.m3955(interfaceC2213M1960, c0853, this) == enumC1765) {
                                                            }
                                                        }
                                                        context2 = context;
                                                        c08324 = c08323;
                                                        i17 = i2;
                                                        str4 = strM1262;
                                                        c094716 = c09474;
                                                        c094717 = c09473;
                                                    } catch (Throwable th25) {
                                                        th = th25;
                                                        obj11 = null;
                                                        enumC17659 = enumC176510;
                                                        enumC1765 = enumC17659;
                                                        obj10 = obj11;
                                                        c08322 = c08324;
                                                        atomicReference = atomicReference3;
                                                        aweme = obj10;
                                                        c2143 = (C2143) atomicReference.getAndSet(aweme);
                                                        if (c2143 != null) {
                                                        }
                                                        C0948 c094822222222222 = C0948.f4411;
                                                        C1206 c1206422222222222 = AbstractC0221.f1238;
                                                        interfaceC2213M1960 = AbstractC0879.m1960(c094822222222222, AbstractC1353.f6250);
                                                        c0853 = new C0853(c08322, aweme, 5);
                                                        this.f6343 = aweme;
                                                        this.f6341 = aweme;
                                                        this.f6333 = aweme;
                                                        this.f6335 = aweme;
                                                        this.f6346 = aweme;
                                                        this.f6344 = aweme;
                                                        this.f6345 = th;
                                                        this.f6334 = aweme;
                                                        this.f6332 = aweme;
                                                        this.f6337 = aweme;
                                                        this.f6348 = aweme;
                                                        this.f6340 = i;
                                                        this.f6336 = 9;
                                                        if (AbstractC2071.m3955(interfaceC2213M1960, c0853, this) == enumC1765) {
                                                        }
                                                    }
                                                    atomicBoolean6 = atomicBoolean;
                                                } catch (Throwable th26) {
                                                    th = th26;
                                                    enumC17659 = enumC176510;
                                                    c08324 = c08323;
                                                }
                                                strM1262 = C0469.m1262(AbstractC2328.m4341(-203817245901678L), aweme8, null, 12);
                                            } catch (Throwable th27) {
                                                th = th27;
                                                enumC17659 = enumC176510;
                                                c08324 = c08323;
                                            }
                                            obj11 = null;
                                        }
                                    } catch (Throwable th28) {
                                        th = th28;
                                        enumC17659 = enumC176510;
                                        c08324 = c08323;
                                    }
                                }
                                context2 = context;
                                enumC17652 = enumC176510;
                                aweme5 = null;
                                i14 = i;
                                c08327 = c08323;
                                c09479 = c09474;
                                c09478 = c09473;
                                atomicBoolean5 = atomicBoolean;
                                atomicReference6 = atomicReference3;
                                c21433 = (C2143) atomicReference6.getAndSet(aweme5);
                                if (c21433 != null) {
                                }
                                C0948 c094832 = C0948.f4411;
                                C1206 c120662 = AbstractC0221.f1238;
                                InterfaceC2213 interfaceC2213M196022 = AbstractC0879.m1960(c094832, AbstractC1353.f6250);
                                C0853 c085322 = new C0853(c08327, aweme5, 5);
                                this.f6343 = aweme5;
                                this.f6341 = atomicBoolean5;
                                this.f6333 = aweme5;
                                this.f6335 = c09478;
                                this.f6346 = c09479;
                                this.f6344 = aweme5;
                                this.f6345 = aweme5;
                                this.f6334 = aweme5;
                                this.f6332 = aweme5;
                                this.f6337 = aweme5;
                                this.f6348 = aweme5;
                                this.f6340 = i14;
                                this.f6336 = 8;
                                aweme7 = aweme5;
                            } catch (Throwable th29) {
                                th = th29;
                                enumC1765 = enumC176510;
                                c08324 = c08323;
                                obj10 = null;
                            }
                            break;
                        } catch (Throwable th30) {
                            th = th30;
                            enumC1765 = enumC176510;
                            aweme = 0;
                            c08322 = c083210;
                            i = size;
                            atomicReference = atomicReference2;
                            c2143 = (C2143) atomicReference.getAndSet(aweme);
                            if (c2143 != null) {
                            }
                            C0948 c0948222222222222 = C0948.f4411;
                            C1206 c12064222222222222 = AbstractC0221.f1238;
                            interfaceC2213M1960 = AbstractC0879.m1960(c0948222222222222, AbstractC1353.f6250);
                            c0853 = new C0853(c08322, aweme, 5);
                            this.f6343 = aweme;
                            this.f6341 = aweme;
                            this.f6333 = aweme;
                            this.f6335 = aweme;
                            this.f6346 = aweme;
                            this.f6344 = aweme;
                            this.f6345 = th;
                            this.f6334 = aweme;
                            this.f6332 = aweme;
                            this.f6337 = aweme;
                            this.f6348 = aweme;
                            this.f6340 = i;
                            this.f6336 = 9;
                            if (AbstractC2071.m3955(interfaceC2213M1960, c0853, this) == enumC1765) {
                            }
                        }
                        break;
                    case 2:
                        i3 = this.f6347;
                        int i21 = this.f6338;
                        int i22 = this.f6340;
                        String str5 = this.f6332;
                        aweme2 = this.f6334;
                        Iterator it7 = (Iterator) this.f6345;
                        C0832 c083211 = this.f6344;
                        c09475 = this.f6346;
                        c09476 = this.f6335;
                        AtomicReference atomicReference15 = this.f6333;
                        AtomicBoolean atomicBoolean9 = this.f6341;
                        AbstractC1544.m3189(obj);
                        str = str5;
                        context2 = context3;
                        i4 = i22;
                        i5 = i21;
                        it2 = it7;
                        c08324 = c083211;
                        atomicBoolean2 = atomicBoolean9;
                        atomicReference11 = atomicReference15;
                        Map map2 = C2609.f12814;
                        strM4682 = C2609.m4682(aweme2);
                        if (strM4682 != null) {
                        }
                        c094714 = c09476;
                        enumC17652 = enumC176510;
                        obj8 = null;
                        obj8 = null;
                        obj8 = null;
                        c09475.f4410++;
                        C1206 c120682 = AbstractC0221.f1238;
                        c1158 = AbstractC1353.f6250;
                        c08326 = c08324;
                        c094715 = c09475;
                        c1139 = new C1139(c08326, c094715, c094714, null, 0);
                        this.f6343 = interfaceC0990;
                        this.f6341 = atomicBoolean2;
                        this.f6333 = atomicReference11;
                        this.f6335 = c094714;
                        this.f6346 = c094715;
                        this.f6344 = c08326;
                        this.f6345 = it2;
                        this.f6334 = null;
                        this.f6332 = null;
                        this.f6337 = null;
                        this.f6340 = i4;
                        this.f6338 = i5;
                        this.f6347 = i3;
                        this.f6336 = 3;
                        if (AbstractC2071.m3955(c1158, c1139, this) != enumC17652) {
                        }
                        return enumC17652;
                    case 3:
                        int i23 = this.f6338;
                        i = this.f6340;
                        Iterator it8 = (Iterator) this.f6345;
                        C0832 c083212 = this.f6344;
                        C0947 c094720 = this.f6346;
                        C0947 c094721 = this.f6335;
                        atomicReference3 = this.f6333;
                        AtomicBoolean atomicBoolean10 = this.f6341;
                        AbstractC1544.m3189(obj);
                        i2 = i23;
                        c09474 = c094720;
                        context2 = context3;
                        c08323 = c083212;
                        enumC17652 = enumC176510;
                        c09473 = c094721;
                        atomicBoolean = atomicBoolean10;
                        it = it8;
                        context = context2;
                        enumC176510 = enumC17652;
                        if (it.hasNext()) {
                        }
                        context2 = context;
                        enumC17652 = enumC176510;
                        aweme5 = null;
                        i14 = i;
                        c08327 = c08323;
                        c09479 = c09474;
                        c09478 = c09473;
                        atomicBoolean5 = atomicBoolean;
                        atomicReference6 = atomicReference3;
                        c21433 = (C2143) atomicReference6.getAndSet(aweme5);
                        if (c21433 != null) {
                        }
                        C0948 c0948322 = C0948.f4411;
                        C1206 c1206622 = AbstractC0221.f1238;
                        InterfaceC2213 interfaceC2213M1960222 = AbstractC0879.m1960(c0948322, AbstractC1353.f6250);
                        C0853 c0853222 = new C0853(c08327, aweme5, 5);
                        this.f6343 = aweme5;
                        this.f6341 = atomicBoolean5;
                        this.f6333 = aweme5;
                        this.f6335 = c09478;
                        this.f6346 = c09479;
                        this.f6344 = aweme5;
                        this.f6345 = aweme5;
                        this.f6334 = aweme5;
                        this.f6332 = aweme5;
                        this.f6337 = aweme5;
                        this.f6348 = aweme5;
                        this.f6340 = i14;
                        this.f6336 = 8;
                        aweme7 = aweme5;
                        break;
                    case 4:
                        i3 = this.f6347;
                        int i24 = this.f6338;
                        int i25 = this.f6340;
                        String str6 = this.f6337;
                        Aweme aweme11 = this.f6334;
                        Iterator it9 = (Iterator) this.f6345;
                        c08325 = this.f6344;
                        c09475 = this.f6346;
                        c09476 = this.f6335;
                        AtomicReference atomicReference16 = this.f6333;
                        AtomicBoolean atomicBoolean11 = this.f6341;
                        AbstractC1544.m3189(obj);
                        i6 = i24;
                        i7 = i25;
                        aweme3 = aweme11;
                        str2 = str6;
                        atomicReference4 = atomicReference16;
                        obj3 = obj;
                        context2 = context3;
                        it3 = it9;
                        atomicBoolean3 = atomicBoolean11;
                        c094712 = c09476;
                        i16 = i3;
                        str3 = (String) obj3;
                        if (str3 != null) {
                        }
                        break;
                    case 5:
                        int i26 = this.f6338;
                        int i27 = this.f6340;
                        Iterator it10 = (Iterator) this.f6345;
                        C0832 c083213 = this.f6344;
                        C0947 c094722 = this.f6346;
                        C0947 c094723 = this.f6335;
                        atomicReference3 = this.f6333;
                        AtomicBoolean atomicBoolean12 = this.f6341;
                        AbstractC1544.m3189(obj);
                        i2 = i26;
                        c09474 = c094722;
                        c08323 = c083213;
                        c09473 = c094723;
                        atomicBoolean = atomicBoolean12;
                        context = context3;
                        i = i27;
                        enumC176510 = enumC176510;
                        it = it10;
                        if (it.hasNext()) {
                        }
                        context2 = context;
                        enumC17652 = enumC176510;
                        aweme5 = null;
                        i14 = i;
                        c08327 = c08323;
                        c09479 = c09474;
                        c09478 = c09473;
                        atomicBoolean5 = atomicBoolean;
                        atomicReference6 = atomicReference3;
                        c21433 = (C2143) atomicReference6.getAndSet(aweme5);
                        if (c21433 != null) {
                        }
                        C0948 c09483222 = C0948.f4411;
                        C1206 c12066222 = AbstractC0221.f1238;
                        InterfaceC2213 interfaceC2213M19602222 = AbstractC0879.m1960(c09483222, AbstractC1353.f6250);
                        C0853 c08532222 = new C0853(c08327, aweme5, 5);
                        this.f6343 = aweme5;
                        this.f6341 = atomicBoolean5;
                        this.f6333 = aweme5;
                        this.f6335 = c09478;
                        this.f6346 = c09479;
                        this.f6344 = aweme5;
                        this.f6345 = aweme5;
                        this.f6334 = aweme5;
                        this.f6332 = aweme5;
                        this.f6337 = aweme5;
                        this.f6348 = aweme5;
                        this.f6340 = i14;
                        this.f6336 = 8;
                        aweme7 = aweme5;
                        break;
                    case 6:
                        i8 = this.f6347;
                        i9 = this.f6338;
                        i10 = this.f6340;
                        c21432 = this.f6348;
                        aweme4 = this.f6334;
                        it4 = (Iterator) this.f6345;
                        C0832 c083214 = this.f6344;
                        c09477 = this.f6346;
                        c09478 = this.f6335;
                        AtomicReference atomicReference17 = this.f6333;
                        atomicBoolean4 = this.f6341;
                        try {
                            AbstractC1544.m3189(obj);
                            c08326 = c083214;
                            enumC17653 = enumC176510;
                            objM39552 = obj;
                            atomicReference8 = atomicReference17;
                        } catch (Throwable th31) {
                            th = th31;
                            i11 = i8;
                            i = i10;
                            it5 = it4;
                            c08322 = c083214;
                            atomicReference5 = atomicReference17;
                            enumC17653 = enumC176510;
                            c2658 = new C2658(th);
                            c08326 = c08322;
                            i12 = i11;
                            i13 = i9;
                            it6 = it5;
                            atomicReference7 = atomicReference5;
                            context2 = context3;
                            thM4249 = C2248.m4249(c2658);
                            if (thM4249 == null) {
                            }
                            if (c2658 instanceof C2658) {
                            }
                            C1014 c101422 = (C1014) c2658;
                            Object obj1222 = null;
                            obj1222 = null;
                            aweme = 0;
                            aweme5 = null;
                            obj1222 = null;
                            while (!atomicReference7.compareAndSet(c21432, null)) {
                                break;
                            }
                            if (atomicBoolean4.get()) {
                            }
                        }
                        AtomicReference atomicReference142 = atomicReference8;
                        c2658 = (C1014) objM39552;
                        i12 = i8;
                        i = i10;
                        i13 = i9;
                        it6 = it4;
                        atomicReference7 = atomicReference142;
                        context2 = context3;
                        thM4249 = C2248.m4249(c2658);
                        if (thM4249 == null) {
                        }
                        if (c2658 instanceof C2658) {
                        }
                        C1014 c1014222 = (C1014) c2658;
                        Object obj12222 = null;
                        obj12222 = null;
                        aweme = 0;
                        aweme5 = null;
                        obj12222 = null;
                        while (!atomicReference7.compareAndSet(c21432, null)) {
                            break;
                        }
                        if (atomicBoolean4.get()) {
                        }
                        break;
                    case 7:
                        int i28 = this.f6338;
                        i = this.f6340;
                        it6 = (Iterator) this.f6345;
                        C0832 c083215 = this.f6344;
                        C0947 c094724 = this.f6346;
                        c094711 = this.f6335;
                        AtomicReference atomicReference18 = this.f6333;
                        AtomicBoolean atomicBoolean13 = this.f6341;
                        AbstractC1544.m3189(obj);
                        i2 = i28;
                        context2 = context3;
                        c08323 = c083215;
                        c09474 = c094724;
                        atomicBoolean = atomicBoolean13;
                        enumC17652 = enumC176510;
                        atomicReference3 = atomicReference18;
                        c09473 = c094711;
                        it = it6;
                        context = context2;
                        enumC176510 = enumC17652;
                        if (it.hasNext()) {
                        }
                        context2 = context;
                        enumC17652 = enumC176510;
                        aweme5 = null;
                        i14 = i;
                        c08327 = c08323;
                        c09479 = c09474;
                        c09478 = c09473;
                        atomicBoolean5 = atomicBoolean;
                        atomicReference6 = atomicReference3;
                        c21433 = (C2143) atomicReference6.getAndSet(aweme5);
                        if (c21433 != null) {
                        }
                        C0948 c094832222 = C0948.f4411;
                        C1206 c120662222 = AbstractC0221.f1238;
                        InterfaceC2213 interfaceC2213M196022222 = AbstractC0879.m1960(c094832222, AbstractC1353.f6250);
                        C0853 c085322222 = new C0853(c08327, aweme5, 5);
                        this.f6343 = aweme5;
                        this.f6341 = atomicBoolean5;
                        this.f6333 = aweme5;
                        this.f6335 = c09478;
                        this.f6346 = c09479;
                        this.f6344 = aweme5;
                        this.f6345 = aweme5;
                        this.f6334 = aweme5;
                        this.f6332 = aweme5;
                        this.f6337 = aweme5;
                        this.f6348 = aweme5;
                        this.f6340 = i14;
                        this.f6336 = 8;
                        aweme7 = aweme5;
                        break;
                    case 8:
                        i14 = this.f6340;
                        c09479 = this.f6346;
                        c09478 = this.f6335;
                        atomicBoolean5 = this.f6341;
                        AbstractC1544.m3189(obj);
                        context2 = context3;
                        enumC17652 = enumC176510;
                        aweme7 = null;
                        int i29 = i14;
                        C0947 c094725 = c09479;
                        C0947 c094726 = c09478;
                        AtomicBoolean atomicBoolean14 = atomicBoolean5;
                        C1206 c12069 = AbstractC0221.f1238;
                        C1158 c11586 = AbstractC1353.f6250;
                        EnumC1765 enumC176515 = enumC17652;
                        C1639 c16393 = new C1639(c094726, context2, atomicBoolean14, i29, c094725, (InterfaceC0274) null);
                        this.f6343 = aweme7;
                        this.f6341 = aweme7;
                        this.f6333 = aweme7;
                        this.f6335 = aweme7;
                        this.f6346 = aweme7;
                        this.f6344 = aweme7;
                        this.f6340 = i29;
                        this.f6336 = 10;
                        if (AbstractC2071.m3955(c11586, c16393, this) == enumC176515) {
                            return enumC176515;
                        }
                        return C2746.f13459;
                    case 9:
                        Throwable th32 = (Throwable) this.f6345;
                        AbstractC1544.m3189(obj);
                        throw th32;
                    case 10:
                        AbstractC1544.m3189(obj);
                        return C2746.f13459;
                    default:
                        C0188.m800(AbstractC2328.m4341(-203890260345710L));
                        return null;
                }
            } catch (Throwable th33) {
                th = th33;
                enumC1765 = enumC176510;
                obj2 = arrayList2;
                aweme = 0;
                atomicReference = obj2;
                c2143 = (C2143) atomicReference.getAndSet(aweme);
                if (c2143 != null) {
                }
                C0948 c09482222222222222 = C0948.f4411;
                C1206 c120642222222222222 = AbstractC0221.f1238;
                interfaceC2213M1960 = AbstractC0879.m1960(c09482222222222222, AbstractC1353.f6250);
                c0853 = new C0853(c08322, aweme, 5);
                this.f6343 = aweme;
                this.f6341 = aweme;
                this.f6333 = aweme;
                this.f6335 = aweme;
                this.f6346 = aweme;
                this.f6344 = aweme;
                this.f6345 = th;
                this.f6334 = aweme;
                this.f6332 = aweme;
                this.f6337 = aweme;
                this.f6348 = aweme;
                this.f6340 = i;
                this.f6336 = 9;
                if (AbstractC2071.m3955(interfaceC2213M1960, c0853, this) == enumC1765) {
                }
            }
        } catch (Throwable th34) {
            th = th34;
            c08322 = c0832;
            arrayList2 = arrayList;
            enumC1765 = enumC176510;
            obj2 = arrayList2;
            aweme = 0;
            atomicReference = obj2;
            c2143 = (C2143) atomicReference.getAndSet(aweme);
            if (c2143 != null) {
            }
            C0948 c094822222222222222 = C0948.f4411;
            C1206 c1206422222222222222 = AbstractC0221.f1238;
            interfaceC2213M1960 = AbstractC0879.m1960(c094822222222222222, AbstractC1353.f6250);
            c0853 = new C0853(c08322, aweme, 5);
            this.f6343 = aweme;
            this.f6341 = aweme;
            this.f6333 = aweme;
            this.f6335 = aweme;
            this.f6346 = aweme;
            this.f6344 = aweme;
            this.f6345 = th;
            this.f6334 = aweme;
            this.f6332 = aweme;
            this.f6337 = aweme;
            this.f6348 = aweme;
            this.f6340 = i;
            this.f6336 = 9;
            if (AbstractC2071.m3955(interfaceC2213M1960, c0853, this) == enumC1765) {
            }
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        C1360 c1360 = new C1360(this.f6342, this.f6339, interfaceC0274);
        c1360.f6343 = obj;
        return c1360;
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        return ((C1360) mo630((InterfaceC0990) obj, (InterfaceC0274) obj2)).mo474(C2746.f13459);
    }
}

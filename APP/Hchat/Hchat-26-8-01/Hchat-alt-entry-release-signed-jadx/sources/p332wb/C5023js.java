package p332wb;

import android.content.Context;
import bi.AbstractC0316d;
import bi.C0314b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p036c9.C0491u0;
import p080fb.C1100a0;
import p080fb.C1134i2;
import p080fb.C1192y;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.C1858m2;
import p117i0.InterfaceC1809a1;
import p136j8.AbstractC2091b;
import p144k.AbstractC2192n;
import p218og.AbstractC3149m;
import p222p.AbstractC3208d;
import p222p.AbstractC3210d1;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.AbstractC3253s;
import p222p.C3211e;
import p222p.C3213e1;
import p222p.C3248q0;
import p222p.C3256t;
import p234q.AbstractC3418a;
import p266s0.C3878h;
import p276sf.C3967n;
import p304uf.C4329c;
import p339x1.C5593d;
import p339x1.C5597e;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5843e;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC3994c;
import sh.AbstractC4045s;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.js */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5023js implements InterfaceC1235p {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ InterfaceC1809a1 f18216A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ InterfaceC1809a1 f18217B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ InterfaceC1809a1 f18218C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ InterfaceC1809a1 f18219D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f18220E;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18221g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f18222h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1845j1 f18223i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1845j1 f18224j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f18225k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Context f18226l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f18227m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ String f18228n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C5518yt f18229o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1845j1 f18230p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f18231q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f18232r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f18233s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f18234t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f18235u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InterfaceC1809a1 f18236v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC1809a1 f18237w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC1809a1 f18238x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC1809a1 f18239y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC1809a1 f18240z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5023js(InterfaceC1809a1 interfaceC1809a1, C5321st c5321st, C1845j1 c1845j1, C1845j1 c1845j12, C1845j1 c1845j13, Context context, C1845j1 c1845j14, String str, C5518yt c5518yt, C1845j1 c1845j15, C1845j1 c1845j16, C1845j1 c1845j17, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113) {
        this.f18222h = interfaceC1809a1;
        this.f18220E = c5321st;
        this.f18223i = c1845j1;
        this.f18224j = c1845j12;
        this.f18225k = c1845j13;
        this.f18226l = context;
        this.f18227m = c1845j14;
        this.f18228n = str;
        this.f18229o = c5518yt;
        this.f18230p = c1845j15;
        this.f18231q = c1845j16;
        this.f18232r = c1845j17;
        this.f18233s = interfaceC1809a12;
        this.f18234t = interfaceC1809a13;
        this.f18235u = interfaceC1809a14;
        this.f18236v = interfaceC1809a15;
        this.f18237w = interfaceC1809a16;
        this.f18238x = interfaceC1809a17;
        this.f18239y = interfaceC1809a18;
        this.f18240z = interfaceC1809a19;
        this.f18216A = interfaceC1809a110;
        this.f18217B = interfaceC1809a111;
        this.f18218C = interfaceC1809a112;
        this.f18219D = interfaceC1809a113;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:151:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0946  */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p085fg.InterfaceC1235p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        final InterfaceC1809a1 interfaceC1809a1;
        C1845j1 c1845j1;
        C1845j1 c1845j12;
        InterfaceC1809a1 interfaceC1809a12;
        String str;
        Context context;
        C5518yt c5518yt;
        C1836h0 c1836h0;
        boolean z9;
        C5850l c5850l;
        boolean z10;
        C1823e c1823e;
        C1845j1 c1845j13;
        C1845j1 c1845j14;
        final InterfaceC1809a1 interfaceC1809a13;
        Context context2;
        InterfaceC1809a1 interfaceC1809a14;
        String str2;
        C5518yt c5518yt2;
        boolean zM4538h;
        Object objM4514P;
        InterfaceC1809a1 interfaceC1809a15;
        C1823e c1823e2;
        float f3;
        boolean z11;
        C5321st c5321st;
        C1845j1 c1845j15;
        C1845j1 c1845j16;
        Context context3;
        InterfaceC1809a1 interfaceC1809a16;
        String str3;
        C5518yt c5518yt3;
        final InterfaceC1809a1 interfaceC1809a17;
        final Context context4;
        final C5321st c5321st2;
        final C1845j1 c1845j17;
        final C1845j1 c1845j18;
        final InterfaceC1809a1 interfaceC1809a18;
        final String str4;
        final C5518yt c5518yt4;
        final C1845j1 c1845j19;
        final InterfaceC1809a1 interfaceC1809a19;
        final InterfaceC1809a1 interfaceC1809a110;
        boolean zM4534f;
        Object objM4514P2;
        C1836h0 c1836h02;
        boolean z12;
        C5850l c5850l2;
        Object c0491u0;
        boolean z13;
        C1823e c1823e3;
        InterfaceC1809a1 interfaceC1809a111;
        float f10;
        C1845j1 c1845j110;
        C1845j1 c1845j111;
        InterfaceC1809a1 interfaceC1809a112;
        String str5;
        Context context5;
        C5518yt c5518yt5;
        final InterfaceC1809a1 interfaceC1809a113;
        C1836h0 c1836h03;
        switch (this.f18221g) {
            case 0:
                final C5255qt c5255qt = (C5255qt) this.f18220E;
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h04, 0);
                    int iHashCode = Long.hashCode(c1836h04.f6095T);
                    C3878h c3878hM4546l = c1836h04.m4546l();
                    C5850l c5850l3 = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h04, c5850l3);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y = C5601f.f22758b;
                    c1836h04.m4531d0();
                    if (c1836h04.f6094S) {
                        c1836h04.m4544k(c5660y);
                    } else {
                        c1836h04.m4551n0();
                    }
                    C5597e c5597e = C5601f.f22761e;
                    AbstractC1874r.m4615A(c5597e, c1836h04, c3256tM6935a);
                    C5597e c5597e2 = C5601f.f22760d;
                    AbstractC1874r.m4615A(c5597e2, c1836h04, c3878hM4546l);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    C5597e c5597e3 = C5601f.f22762f;
                    AbstractC1874r.m4615A(c5597e3, c1836h04, numValueOf);
                    C5593d c5593d = C5601f.f22763g;
                    AbstractC1874r.m4641w(c5593d, c1836h04);
                    C5597e c5597e4 = C5601f.f22759c;
                    AbstractC1874r.m4615A(c5597e4, c1836h04, interfaceC5853oM10543c);
                    AbstractC4045s.m8250n(AbstractC0255e.m1022k("确定删除插件“", c5255qt.f20304c, "”（", c5255qt.f20303b, "）吗？插件目录内的全部文件都会被删除，此操作无法撤销。"), null, ((C0314b) c1836h04.m4542j(AbstractC0316d.f944a)).m1237g(), AbstractC5700d.m10248D(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h04, 24576, 0, 262122);
                    C5491y2 c5491y2 = C5491y2.f22066n;
                    final InterfaceC1809a1 interfaceC1809a114 = this.f18222h;
                    boolean zBooleanValue = ((Boolean) interfaceC1809a114.getValue()).booleanValue();
                    boolean zM4534f2 = c1836h04.m4534f(interfaceC1809a114);
                    Object objM4514P3 = c1836h04.m4514P();
                    C1823e c1823e4 = C1851l.f6155a;
                    if (zM4534f2 || objM4514P3 == c1823e4) {
                        objM4514P3 = new C5086lp(interfaceC1809a114, 16);
                        c1836h04.m4545k0(objM4514P3);
                    }
                    c5491y2.m9871N(zBooleanValue, "确认后，后续插件修改不再询问", (InterfaceC1231l) objM4514P3, c1836h04, 3120);
                    InterfaceC5853o interfaceC5853oM6886p = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l3, 1.0f), 0.0f, 12, 0.0f, 0.0f, 13);
                    C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(10), C5840b.f23770p, c1836h04, 6);
                    int iHashCode2 = Long.hashCode(c1836h04.f6095T);
                    C3878h c3878hM4546l2 = c1836h04.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h04, interfaceC5853oM6886p);
                    c1836h04.m4531d0();
                    if (c1836h04.f6094S) {
                        c1836h04.m4544k(c5660y);
                    } else {
                        c1836h04.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e, c1836h04, c3213e1M6892a);
                    AbstractC1874r.m4615A(c5597e2, c1836h04, c3878hM4546l2);
                    AbstractC2091b.m5169p(iHashCode2, c1836h04, c5597e3, c1836h04, c5593d);
                    AbstractC1874r.m4615A(c5597e4, c1836h04, interfaceC5853oM10543c2);
                    C1845j1 c1845j112 = this.f18223i;
                    boolean zM4534f3 = c1836h04.m4534f(c1845j112);
                    C1845j1 c1845j113 = this.f18224j;
                    boolean zM4534f4 = zM4534f3 | c1836h04.m4534f(c1845j113);
                    final InterfaceC1809a1 interfaceC1809a115 = this.f18225k;
                    boolean zM4534f5 = zM4534f4 | c1836h04.m4534f(interfaceC1809a115);
                    InterfaceC1809a1 interfaceC1809a116 = this.f18227m;
                    boolean zM4534f6 = zM4534f5 | c1836h04.m4534f(interfaceC1809a116);
                    String str6 = this.f18228n;
                    boolean zM4534f7 = zM4534f6 | c1836h04.m4534f(str6);
                    Context context6 = this.f18226l;
                    boolean zM4538h2 = zM4534f7 | c1836h04.m4538h(context6);
                    C5518yt c5518yt6 = this.f18229o;
                    boolean zM4538h3 = zM4538h2 | c1836h04.m4538h(c5518yt6) | c1836h04.m4534f(c5255qt);
                    Object objM4514P4 = c1836h04.m4514P();
                    InterfaceC1809a1 interfaceC1809a117 = this.f18233s;
                    if (zM4538h3 || objM4514P4 == c1823e4) {
                        interfaceC1809a1 = interfaceC1809a117;
                        C0491u0 c0491u02 = new C0491u0(c5255qt, c1845j112, c1845j113, interfaceC1809a115, interfaceC1809a116, str6, context6, c5518yt6, interfaceC1809a1, 7);
                        c1845j1 = c1845j112;
                        c1845j12 = c1845j113;
                        interfaceC1809a12 = interfaceC1809a116;
                        str = str6;
                        context = context6;
                        c5518yt = c5518yt6;
                        c1836h04.m4545k0(c0491u02);
                        objM4514P4 = c0491u02;
                    } else {
                        c1845j1 = c1845j112;
                        c1845j12 = c1845j113;
                        interfaceC1809a12 = interfaceC1809a116;
                        str = str6;
                        context = context6;
                        c5518yt = c5518yt6;
                        interfaceC1809a1 = interfaceC1809a117;
                    }
                    InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P4;
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    final Context context7 = context;
                    final C1845j1 c1845j114 = c1845j1;
                    final C1845j1 c1845j115 = c1845j12;
                    final InterfaceC1809a1 interfaceC1809a118 = interfaceC1809a12;
                    final String str7 = str;
                    final C5518yt c5518yt7 = c5518yt;
                    AbstractC4045s.m8251o("取消", interfaceC1220a, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h04), null, c1836h04, 6, 1912);
                    boolean zM4534f8 = c1836h04.m4534f(interfaceC1809a114) | c1836h04.m4538h(context7) | c1836h04.m4534f(c1845j114) | c1836h04.m4534f(c1845j115);
                    final C1845j1 c1845j116 = this.f18230p;
                    boolean zM4534f9 = zM4534f8 | c1836h04.m4534f(c1845j116) | c1836h04.m4534f(interfaceC1809a118) | c1836h04.m4534f(str7) | c1836h04.m4538h(c5518yt7) | c1836h04.m4534f(interfaceC1809a115);
                    final InterfaceC1809a1 interfaceC1809a119 = this.f18231q;
                    boolean zM4534f10 = zM4534f9 | c1836h04.m4534f(interfaceC1809a119);
                    final InterfaceC1809a1 interfaceC1809a120 = this.f18232r;
                    boolean zM4534f11 = zM4534f10 | c1836h04.m4534f(interfaceC1809a120) | c1836h04.m4534f(c5255qt);
                    Object objM4514P5 = c1836h04.m4514P();
                    if (zM4534f11 || objM4514P5 == c1823e4) {
                        final int i9 = 1;
                        final InterfaceC1809a1 interfaceC1809a121 = this.f18234t;
                        final InterfaceC1809a1 interfaceC1809a122 = this.f18235u;
                        final InterfaceC1809a1 interfaceC1809a123 = this.f18236v;
                        final InterfaceC1809a1 interfaceC1809a124 = this.f18237w;
                        final InterfaceC1809a1 interfaceC1809a125 = this.f18238x;
                        final InterfaceC1809a1 interfaceC1809a126 = this.f18239y;
                        final InterfaceC1809a1 interfaceC1809a127 = this.f18240z;
                        final InterfaceC1809a1 interfaceC1809a128 = this.f18216A;
                        final InterfaceC1809a1 interfaceC1809a129 = this.f18217B;
                        final InterfaceC1809a1 interfaceC1809a130 = this.f18218C;
                        final InterfaceC1809a1 interfaceC1809a131 = this.f18219D;
                        c1836h0 = c1836h04;
                        z9 = true;
                        InterfaceC1220a interfaceC1220a2 = new InterfaceC1220a() { // from class: wb.us
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() throws JSONException {
                                switch (i9) {
                                    case 0:
                                        C5354tt c5354tt = (C5354tt) c5255qt;
                                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a114.getValue()).booleanValue();
                                        Context context8 = context7;
                                        if (zBooleanValue2) {
                                            C5491y2.m9846v1(context8, interfaceC1809a121, interfaceC1809a122, interfaceC1809a123, interfaceC1809a124, interfaceC1809a125, interfaceC1809a126, interfaceC1809a127, interfaceC1809a128, interfaceC1809a129, interfaceC1809a130, interfaceC1809a131, "always_allow");
                                        }
                                        c1845j114.setValue(Boolean.FALSE);
                                        c1845j115.setValue(null);
                                        C5491y2.m9852x1(c5354tt.f20966a, context8, c5354tt.f20967b, interfaceC1809a118, interfaceC1809a1, interfaceC1809a115, interfaceC1809a119, interfaceC1809a120, c1845j116, str7, c5518yt7, c5354tt.f20969d);
                                        break;
                                    case 1:
                                        C5255qt c5255qt2 = (C5255qt) c5255qt;
                                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a114.getValue()).booleanValue();
                                        Context context9 = context7;
                                        if (zBooleanValue3) {
                                            C5491y2.m9846v1(context9, interfaceC1809a121, interfaceC1809a122, interfaceC1809a123, interfaceC1809a124, interfaceC1809a125, interfaceC1809a126, interfaceC1809a127, interfaceC1809a128, interfaceC1809a129, interfaceC1809a130, interfaceC1809a131, "always_allow");
                                        }
                                        c1845j114.setValue(Boolean.FALSE);
                                        c1845j115.setValue(null);
                                        C5491y2.m9771D0(c5255qt2.f20302a, context9, interfaceC1809a118, interfaceC1809a1, interfaceC1809a115, interfaceC1809a119, interfaceC1809a120, c1845j116, str7, c5255qt2.f20303b, c5518yt7);
                                        break;
                                    default:
                                        C5321st c5321st3 = (C5321st) c5255qt;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a114.getValue()).booleanValue();
                                        Context context10 = context7;
                                        if (zBooleanValue4) {
                                            C5491y2.m9846v1(context10, interfaceC1809a121, interfaceC1809a122, interfaceC1809a123, interfaceC1809a124, interfaceC1809a125, interfaceC1809a126, interfaceC1809a127, interfaceC1809a128, interfaceC1809a129, interfaceC1809a130, interfaceC1809a131, "always_allow");
                                        }
                                        Boolean bool = Boolean.FALSE;
                                        C1845j1 c1845j117 = c1845j114;
                                        c1845j117.setValue(bool);
                                        C1845j1 c1845j118 = c1845j115;
                                        c1845j118.setValue(null);
                                        C5491y2.m9853y0(c5321st3.f20718a, context10, c5321st3.f20719b, interfaceC1809a118, interfaceC1809a1, interfaceC1809a115, interfaceC1809a119, interfaceC1809a120, c1845j117, c1845j116, c1845j118, str7, c5518yt7);
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(interfaceC1220a2);
                        objM4514P5 = interfaceC1220a2;
                    } else {
                        c1836h0 = c1836h04;
                        z9 = true;
                    }
                    InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P5;
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    C1836h0 c1836h05 = c1836h0;
                    AbstractC4045s.m8251o("确认删除", interfaceC1220a3, new C3248q0(1.0f, z9), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h0), null, c1836h05, 6, 1912);
                    c1836h05.m4553p(z9);
                    c1836h05.m4553p(z9);
                } else {
                    c1836h04.m4519V();
                }
                break;
            case 1:
                C5321st c5321st3 = (C5321st) this.f18220E;
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h06.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C5850l c5850l4 = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM6904g = AbstractC3222h1.m6904g(AbstractC3222h1.m6901d(c5850l4, 1.0f), 0.0f, 520, 1);
                    C3211e c3211e = AbstractC3226j.f10300c;
                    C5843e c5843e = C5840b.f23773s;
                    C3256t c3256tM6935a2 = AbstractC3253s.m6935a(c3211e, c5843e, c1836h06, 0);
                    int iHashCode3 = Long.hashCode(c1836h06.f6095T);
                    C3878h c3878hM4546l3 = c1836h06.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c3 = AbstractC5839a.m10543c(c1836h06, interfaceC5853oM6904g);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y2 = C5601f.f22758b;
                    c1836h06.m4531d0();
                    if (c1836h06.f6094S) {
                        c1836h06.m4544k(c5660y2);
                    } else {
                        c1836h06.m4551n0();
                    }
                    C5597e c5597e5 = C5601f.f22761e;
                    AbstractC1874r.m4615A(c5597e5, c1836h06, c3256tM6935a2);
                    C5597e c5597e6 = C5601f.f22760d;
                    AbstractC1874r.m4615A(c5597e6, c1836h06, c3878hM4546l3);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    C5597e c5597e7 = C5601f.f22762f;
                    AbstractC1874r.m4615A(c5597e7, c1836h06, numValueOf2);
                    C5593d c5593d2 = C5601f.f22763g;
                    AbstractC1874r.m4641w(c5593d2, c1836h06);
                    C5597e c5597e8 = C5601f.f22759c;
                    AbstractC1874r.m4615A(c5597e8, c1836h06, interfaceC5853oM10543c3);
                    InterfaceC5853o interfaceC5853oM6901d = AbstractC3222h1.m6901d(c5850l4, 1.0f);
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    InterfaceC5853o interfaceC5853oM5441r = AbstractC2192n.m5441r(interfaceC5853oM6901d.mo10549d(new C3248q0(1.0f, false)), AbstractC2192n.m5440q(c1836h06), true, true);
                    C3256t c3256tM6935a3 = AbstractC3253s.m6935a(c3211e, c5843e, c1836h06, 0);
                    int iHashCode4 = Long.hashCode(c1836h06.f6095T);
                    C3878h c3878hM4546l4 = c1836h06.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c4 = AbstractC5839a.m10543c(c1836h06, interfaceC5853oM5441r);
                    c1836h06.m4531d0();
                    if (c1836h06.f6094S) {
                        c1836h06.m4544k(c5660y2);
                    } else {
                        c1836h06.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e5, c1836h06, c3256tM6935a3);
                    AbstractC1874r.m4615A(c5597e6, c1836h06, c3878hM4546l4);
                    AbstractC2091b.m5169p(iHashCode4, c1836h06, c5597e7, c1836h06, c5593d2);
                    AbstractC1874r.m4615A(c5597e8, c1836h06, interfaceC5853oM10543c4);
                    c1836h06.m4525a0(-822472577);
                    StringBuilder sb2 = new StringBuilder();
                    C1134i2 c1134i2 = c5321st3.f20719b;
                    boolean z14 = c5321st3.f20720c;
                    String str8 = c5321st3.f20723f;
                    boolean z15 = c1134i2.f3722l;
                    String str9 = c1134i2.f3712b;
                    String str10 = c1134i2.f3711a;
                    if (z15) {
                        sb2.append(AbstractC0255e.m1022k("Agent 将删除插件“", str9, "”（", str10, "）。"));
                    } else if (z14) {
                        sb2.append(AbstractC0255e.m1022k("Agent 将创建插件“", str9, "”（", str10, "）。"));
                    } else {
                        sb2.append("Agent 将更新插件 " + str10 + "。");
                    }
                    List list = c1134i2.f3718h;
                    List list2 = c1134i2.f3717g;
                    List list3 = c1134i2.f3716f;
                    if (!z15) {
                        sb2.append("提交后插件保持禁用。");
                    }
                    if (!AbstractC3149m.m6721t0(str8)) {
                        sb2.append("\n\n上次提交失败：");
                        sb2.append(str8);
                        sb2.append("\n暂存修改仍在，可直接重试；若目标代码文件已被其它操作修改，请取消后让 Agent 重新读取。");
                    }
                    C4329c c4329cM7E = AbstractC0000a.m7E();
                    if (list3.isEmpty()) {
                        c5850l = c5850l4;
                    } else {
                        c5850l = c5850l4;
                        c4329cM7E.add("新增 " + list3.size() + " 项");
                    }
                    if (!list2.isEmpty()) {
                        c4329cM7E.add("修改 " + list2.size() + " 项");
                    }
                    if (!list.isEmpty()) {
                        c4329cM7E.add("删除 " + list.size() + " 项");
                    }
                    C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
                    if (!c4329cM90t.isEmpty()) {
                        sb2.append("\n\n");
                        sb2.append(AbstractC4166m.m8392A1(c4329cM90t, "，", null, null, null, 62));
                    }
                    List listM8403L1 = AbstractC4166m.m8403L1(6, AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(AbstractC4166m.m8397F1(AbstractC4166m.m8397F1(list3, list2), list))));
                    boolean zIsEmpty = listM8403L1.isEmpty();
                    C1823e c1823e5 = C1851l.f6155a;
                    if (zIsEmpty) {
                        c1836h06.m4525a0(2004103216);
                        c1836h06.m4553p(false);
                    } else {
                        c1836h06.m4525a0(2003972520);
                        sb2.append("\n");
                        Object objM4514P6 = c1836h06.m4514P();
                        if (objM4514P6 == c1823e5) {
                            objM4514P6 = new C5319sr(4);
                            c1836h06.m4545k0(objM4514P6);
                        }
                        sb2.append(AbstractC4166m.m8392A1(listM8403L1, "\n", null, null, (InterfaceC1231l) objM4514P6, 30));
                        c1836h06.m4553p(false);
                    }
                    if (c5321st3.f20722e) {
                        c1836h06.m4525a0(2004165402);
                        sb2.append("\n\n静态检查发现高风险代码：");
                        ?? r12 = c1134i2.f3723m;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : r12) {
                            if (((C1100a0) obj3).f3546c) {
                                arrayList.add(obj3);
                            }
                        }
                        Object objM4514P7 = c1836h06.m4514P();
                        if (objM4514P7 == c1823e5) {
                            objM4514P7 = new C5319sr(9);
                            c1836h06.m4545k0(objM4514P7);
                        }
                        sb2.append(AbstractC4166m.m8392A1(arrayList, "；", null, null, (InterfaceC1231l) objM4514P7, 30));
                        z10 = false;
                        c1836h06.m4553p(false);
                    } else {
                        z10 = false;
                        c1836h06.m4525a0(2004494064);
                        c1836h06.m4553p(false);
                    }
                    String string = sb2.toString();
                    c1836h06.m4553p(z10);
                    C1858m2 c1858m2 = AbstractC0316d.f944a;
                    AbstractC4045s.m8250n(string, null, ((C0314b) c1836h06.m4542j(c1858m2)).m1237g(), AbstractC5700d.m10248D(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h06, 24576, 0, 262122);
                    float f11 = 12;
                    C5850l c5850l5 = c5850l;
                    AbstractC4045s.m8250n("代码差异", AbstractC3208d.m6886p(c5850l5, 0.0f, f11, 0.0f, 0.0f, 13), ((C0314b) c1836h06.m4542j(c1858m2)).m1238h(), AbstractC5700d.m10248D(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h06, 24630, 0, 262120);
                    C5491y2 c5491y22 = C5491y2.f22066n;
                    String str11 = c1134i2.f3719i;
                    if (AbstractC3149m.m6721t0(str11)) {
                        str11 = "无代码变化";
                    }
                    c5491y22.m9875T(str11, c1836h06, 48);
                    c1836h06.m4553p(true);
                    final InterfaceC1809a1 interfaceC1809a132 = this.f18222h;
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a132.getValue()).booleanValue();
                    boolean zM4534f12 = c1836h06.m4534f(interfaceC1809a132);
                    Object objM4514P8 = c1836h06.m4514P();
                    if (zM4534f12) {
                        c1823e = c1823e5;
                    } else {
                        c1823e = c1823e5;
                        if (objM4514P8 == c1823e) {
                        }
                        c5491y22.m9871N(zBooleanValue2, "确认后，后续插件修改不再询问", (InterfaceC1231l) objM4514P8, c1836h06, 3120);
                        InterfaceC5853o interfaceC5853oM6886p2 = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l5, 1.0f), 0.0f, f11, 0.0f, 0.0f, 13);
                        C3213e1 c3213e1M6892a2 = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(10), C5840b.f23770p, c1836h06, 6);
                        int iHashCode5 = Long.hashCode(c1836h06.f6095T);
                        C3878h c3878hM4546l5 = c1836h06.m4546l();
                        InterfaceC5853o interfaceC5853oM10543c5 = AbstractC5839a.m10543c(c1836h06, interfaceC5853oM6886p2);
                        InterfaceC5605g.f22815f.getClass();
                        C5660y c5660y3 = C5601f.f22758b;
                        c1836h06.m4531d0();
                        if (c1836h06.f6094S) {
                            c1836h06.m4551n0();
                        } else {
                            c1836h06.m4544k(c5660y3);
                        }
                        AbstractC1874r.m4615A(C5601f.f22761e, c1836h06, c3213e1M6892a2);
                        AbstractC1874r.m4615A(C5601f.f22760d, c1836h06, c3878hM4546l5);
                        AbstractC1874r.m4615A(C5601f.f22762f, c1836h06, Integer.valueOf(iHashCode5));
                        AbstractC1874r.m4641w(C5601f.f22763g, c1836h06);
                        AbstractC1874r.m4615A(C5601f.f22759c, c1836h06, interfaceC5853oM10543c5);
                        c1845j13 = this.f18223i;
                        boolean zM4534f13 = c1836h06.m4534f(c1845j13);
                        c1845j14 = this.f18224j;
                        boolean zM4534f14 = zM4534f13 | c1836h06.m4534f(c1845j14);
                        interfaceC1809a13 = this.f18225k;
                        boolean zM4534f15 = zM4534f14 | c1836h06.m4534f(interfaceC1809a13);
                        context2 = this.f18226l;
                        boolean zM4538h4 = zM4534f15 | c1836h06.m4538h(context2) | c1836h06.m4538h(c5321st3);
                        interfaceC1809a14 = this.f18227m;
                        boolean zM4534f16 = zM4538h4 | c1836h06.m4534f(interfaceC1809a14);
                        str2 = this.f18228n;
                        boolean zM4534f17 = zM4534f16 | c1836h06.m4534f(str2);
                        c5518yt2 = this.f18229o;
                        zM4538h = zM4534f17 | c1836h06.m4538h(c5518yt2);
                        objM4514P = c1836h06.m4514P();
                        interfaceC1809a15 = this.f18233s;
                        if (!zM4538h || objM4514P == c1823e) {
                            c1823e2 = c1823e;
                            f3 = 1.0f;
                            z11 = true;
                            c5321st = c5321st3;
                            C0491u0 c0491u03 = new C0491u0(c5321st, c1845j13, c1845j14, interfaceC1809a13, context2, interfaceC1809a14, str2, c5518yt2, interfaceC1809a15);
                            c1845j15 = c1845j13;
                            c1845j16 = c1845j14;
                            context3 = context2;
                            interfaceC1809a16 = interfaceC1809a14;
                            str3 = str2;
                            c5518yt3 = c5518yt2;
                            interfaceC1809a17 = interfaceC1809a15;
                            c1836h06.m4545k0(c0491u03);
                            objM4514P = c0491u03;
                        } else {
                            c1823e2 = c1823e;
                            c1845j15 = c1845j13;
                            c1845j16 = c1845j14;
                            context3 = context2;
                            interfaceC1809a16 = interfaceC1809a14;
                            str3 = str2;
                            c5518yt3 = c5518yt2;
                            interfaceC1809a17 = interfaceC1809a15;
                            f3 = 1.0f;
                            z11 = true;
                            c5321st = c5321st3;
                        }
                        InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P;
                        if (f3 <= 0.0d) {
                            AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                        }
                        context4 = context3;
                        c5321st2 = c5321st;
                        c1845j17 = c1845j15;
                        c1845j18 = c1845j16;
                        C1823e c1823e6 = c1823e2;
                        interfaceC1809a18 = interfaceC1809a16;
                        str4 = str3;
                        c5518yt4 = c5518yt3;
                        AbstractC4045s.m8251o("取消", interfaceC1220a4, new C3248q0(f3, z11), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h06), null, c1836h06, 6, 1912);
                        String str12 = !z15 ? "确认删除" : z14 ? "确认创建" : !AbstractC3149m.m6721t0(str8) ? "重试提交" : "确认提交";
                        boolean zM4534f18 = c1836h06.m4534f(interfaceC1809a132) | c1836h06.m4538h(context4) | c1836h06.m4534f(c1845j17) | c1836h06.m4534f(c1845j18);
                        c1845j19 = this.f18230p;
                        boolean zM4534f19 = zM4534f18 | c1836h06.m4534f(c1845j19) | c1836h06.m4534f(interfaceC1809a18) | c1836h06.m4534f(str4) | c1836h06.m4538h(c5518yt4) | c1836h06.m4534f(interfaceC1809a13);
                        interfaceC1809a19 = this.f18231q;
                        boolean zM4534f20 = zM4534f19 | c1836h06.m4534f(interfaceC1809a19);
                        interfaceC1809a110 = this.f18232r;
                        zM4534f = zM4534f20 | c1836h06.m4534f(interfaceC1809a110) | c1836h06.m4538h(c5321st2);
                        objM4514P2 = c1836h06.m4514P();
                        if (!zM4534f || objM4514P2 == c1823e6) {
                            final int i10 = 2;
                            final InterfaceC1809a1 interfaceC1809a133 = this.f18234t;
                            final InterfaceC1809a1 interfaceC1809a134 = this.f18235u;
                            final InterfaceC1809a1 interfaceC1809a135 = this.f18236v;
                            final InterfaceC1809a1 interfaceC1809a136 = this.f18237w;
                            final InterfaceC1809a1 interfaceC1809a137 = this.f18238x;
                            final InterfaceC1809a1 interfaceC1809a138 = this.f18239y;
                            final InterfaceC1809a1 interfaceC1809a139 = this.f18240z;
                            final InterfaceC1809a1 interfaceC1809a140 = this.f18216A;
                            final InterfaceC1809a1 interfaceC1809a141 = this.f18217B;
                            final InterfaceC1809a1 interfaceC1809a142 = this.f18218C;
                            final InterfaceC1809a1 interfaceC1809a143 = this.f18219D;
                            c1836h02 = c1836h06;
                            InterfaceC1220a interfaceC1220a5 = new InterfaceC1220a() { // from class: wb.us
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1220a
                                public final Object invoke() throws JSONException {
                                    switch (i10) {
                                        case 0:
                                            C5354tt c5354tt = (C5354tt) c5321st2;
                                            boolean zBooleanValue22 = ((Boolean) interfaceC1809a132.getValue()).booleanValue();
                                            Context context8 = context4;
                                            if (zBooleanValue22) {
                                                C5491y2.m9846v1(context8, interfaceC1809a133, interfaceC1809a134, interfaceC1809a135, interfaceC1809a136, interfaceC1809a137, interfaceC1809a138, interfaceC1809a139, interfaceC1809a140, interfaceC1809a141, interfaceC1809a142, interfaceC1809a143, "always_allow");
                                            }
                                            c1845j17.setValue(Boolean.FALSE);
                                            c1845j18.setValue(null);
                                            C5491y2.m9852x1(c5354tt.f20966a, context8, c5354tt.f20967b, interfaceC1809a18, interfaceC1809a17, interfaceC1809a13, interfaceC1809a19, interfaceC1809a110, c1845j19, str4, c5518yt4, c5354tt.f20969d);
                                            break;
                                        case 1:
                                            C5255qt c5255qt2 = (C5255qt) c5321st2;
                                            boolean zBooleanValue3 = ((Boolean) interfaceC1809a132.getValue()).booleanValue();
                                            Context context9 = context4;
                                            if (zBooleanValue3) {
                                                C5491y2.m9846v1(context9, interfaceC1809a133, interfaceC1809a134, interfaceC1809a135, interfaceC1809a136, interfaceC1809a137, interfaceC1809a138, interfaceC1809a139, interfaceC1809a140, interfaceC1809a141, interfaceC1809a142, interfaceC1809a143, "always_allow");
                                            }
                                            c1845j17.setValue(Boolean.FALSE);
                                            c1845j18.setValue(null);
                                            C5491y2.m9771D0(c5255qt2.f20302a, context9, interfaceC1809a18, interfaceC1809a17, interfaceC1809a13, interfaceC1809a19, interfaceC1809a110, c1845j19, str4, c5255qt2.f20303b, c5518yt4);
                                            break;
                                        default:
                                            C5321st c5321st32 = (C5321st) c5321st2;
                                            boolean zBooleanValue4 = ((Boolean) interfaceC1809a132.getValue()).booleanValue();
                                            Context context10 = context4;
                                            if (zBooleanValue4) {
                                                C5491y2.m9846v1(context10, interfaceC1809a133, interfaceC1809a134, interfaceC1809a135, interfaceC1809a136, interfaceC1809a137, interfaceC1809a138, interfaceC1809a139, interfaceC1809a140, interfaceC1809a141, interfaceC1809a142, interfaceC1809a143, "always_allow");
                                            }
                                            Boolean bool = Boolean.FALSE;
                                            C1845j1 c1845j117 = c1845j17;
                                            c1845j117.setValue(bool);
                                            C1845j1 c1845j118 = c1845j18;
                                            c1845j118.setValue(null);
                                            C5491y2.m9853y0(c5321st32.f20718a, context10, c5321st32.f20719b, interfaceC1809a18, interfaceC1809a17, interfaceC1809a13, interfaceC1809a19, interfaceC1809a110, c1845j117, c1845j19, c1845j118, str4, c5518yt4);
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h02.m4545k0(interfaceC1220a5);
                            objM4514P2 = interfaceC1220a5;
                        } else {
                            c1836h02 = c1836h06;
                        }
                        InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) objM4514P2;
                        if (1.0f <= 0.0d) {
                            AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                        }
                        C1836h0 c1836h07 = c1836h02;
                        AbstractC4045s.m8251o(str12, interfaceC1220a6, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h02), null, c1836h07, 0, 1912);
                        c1836h07.m4553p(true);
                        c1836h07.m4553p(true);
                    }
                    objM4514P8 = new C5086lp(interfaceC1809a132, 15);
                    c1836h06.m4545k0(objM4514P8);
                    c5491y22.m9871N(zBooleanValue2, "确认后，后续插件修改不再询问", (InterfaceC1231l) objM4514P8, c1836h06, 3120);
                    InterfaceC5853o interfaceC5853oM6886p22 = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l5, 1.0f), 0.0f, f11, 0.0f, 0.0f, 13);
                    C3213e1 c3213e1M6892a22 = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(10), C5840b.f23770p, c1836h06, 6);
                    int iHashCode52 = Long.hashCode(c1836h06.f6095T);
                    C3878h c3878hM4546l52 = c1836h06.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c52 = AbstractC5839a.m10543c(c1836h06, interfaceC5853oM6886p22);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y32 = C5601f.f22758b;
                    c1836h06.m4531d0();
                    if (c1836h06.f6094S) {
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h06, c3213e1M6892a22);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h06, c3878hM4546l52);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h06, Integer.valueOf(iHashCode52));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h06);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h06, interfaceC5853oM10543c52);
                    c1845j13 = this.f18223i;
                    boolean zM4534f132 = c1836h06.m4534f(c1845j13);
                    c1845j14 = this.f18224j;
                    boolean zM4534f142 = zM4534f132 | c1836h06.m4534f(c1845j14);
                    interfaceC1809a13 = this.f18225k;
                    boolean zM4534f152 = zM4534f142 | c1836h06.m4534f(interfaceC1809a13);
                    context2 = this.f18226l;
                    boolean zM4538h42 = zM4534f152 | c1836h06.m4538h(context2) | c1836h06.m4538h(c5321st3);
                    interfaceC1809a14 = this.f18227m;
                    boolean zM4534f162 = zM4538h42 | c1836h06.m4534f(interfaceC1809a14);
                    str2 = this.f18228n;
                    boolean zM4534f172 = zM4534f162 | c1836h06.m4534f(str2);
                    c5518yt2 = this.f18229o;
                    zM4538h = zM4534f172 | c1836h06.m4538h(c5518yt2);
                    objM4514P = c1836h06.m4514P();
                    interfaceC1809a15 = this.f18233s;
                    if (zM4538h) {
                        c1823e2 = c1823e;
                        f3 = 1.0f;
                        z11 = true;
                        c5321st = c5321st3;
                        C0491u0 c0491u032 = new C0491u0(c5321st, c1845j13, c1845j14, interfaceC1809a13, context2, interfaceC1809a14, str2, c5518yt2, interfaceC1809a15);
                        c1845j15 = c1845j13;
                        c1845j16 = c1845j14;
                        context3 = context2;
                        interfaceC1809a16 = interfaceC1809a14;
                        str3 = str2;
                        c5518yt3 = c5518yt2;
                        interfaceC1809a17 = interfaceC1809a15;
                        c1836h06.m4545k0(c0491u032);
                        objM4514P = c0491u032;
                        InterfaceC1220a interfaceC1220a42 = (InterfaceC1220a) objM4514P;
                        if (f3 <= 0.0d) {
                        }
                        context4 = context3;
                        c5321st2 = c5321st;
                        c1845j17 = c1845j15;
                        c1845j18 = c1845j16;
                        C1823e c1823e62 = c1823e2;
                        interfaceC1809a18 = interfaceC1809a16;
                        str4 = str3;
                        c5518yt4 = c5518yt3;
                        AbstractC4045s.m8251o("取消", interfaceC1220a42, new C3248q0(f3, z11), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h06), null, c1836h06, 6, 1912);
                        String str122 = !z15 ? "确认删除" : z14 ? "确认创建" : !AbstractC3149m.m6721t0(str8) ? "重试提交" : "确认提交";
                        boolean zM4534f182 = c1836h06.m4534f(interfaceC1809a132) | c1836h06.m4538h(context4) | c1836h06.m4534f(c1845j17) | c1836h06.m4534f(c1845j18);
                        c1845j19 = this.f18230p;
                        boolean zM4534f192 = zM4534f182 | c1836h06.m4534f(c1845j19) | c1836h06.m4534f(interfaceC1809a18) | c1836h06.m4534f(str4) | c1836h06.m4538h(c5518yt4) | c1836h06.m4534f(interfaceC1809a13);
                        interfaceC1809a19 = this.f18231q;
                        boolean zM4534f202 = zM4534f192 | c1836h06.m4534f(interfaceC1809a19);
                        interfaceC1809a110 = this.f18232r;
                        zM4534f = zM4534f202 | c1836h06.m4534f(interfaceC1809a110) | c1836h06.m4538h(c5321st2);
                        objM4514P2 = c1836h06.m4514P();
                        if (zM4534f) {
                            final int i102 = 2;
                            final InterfaceC1809a1 interfaceC1809a1332 = this.f18234t;
                            final InterfaceC1809a1 interfaceC1809a1342 = this.f18235u;
                            final InterfaceC1809a1 interfaceC1809a1352 = this.f18236v;
                            final InterfaceC1809a1 interfaceC1809a1362 = this.f18237w;
                            final InterfaceC1809a1 interfaceC1809a1372 = this.f18238x;
                            final InterfaceC1809a1 interfaceC1809a1382 = this.f18239y;
                            final InterfaceC1809a1 interfaceC1809a1392 = this.f18240z;
                            final InterfaceC1809a1 interfaceC1809a1402 = this.f18216A;
                            final InterfaceC1809a1 interfaceC1809a1412 = this.f18217B;
                            final InterfaceC1809a1 interfaceC1809a1422 = this.f18218C;
                            final InterfaceC1809a1 interfaceC1809a1432 = this.f18219D;
                            c1836h02 = c1836h06;
                            InterfaceC1220a interfaceC1220a52 = new InterfaceC1220a() { // from class: wb.us
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1220a
                                public final Object invoke() throws JSONException {
                                    switch (i102) {
                                        case 0:
                                            C5354tt c5354tt = (C5354tt) c5321st2;
                                            boolean zBooleanValue22 = ((Boolean) interfaceC1809a132.getValue()).booleanValue();
                                            Context context8 = context4;
                                            if (zBooleanValue22) {
                                                C5491y2.m9846v1(context8, interfaceC1809a1332, interfaceC1809a1342, interfaceC1809a1352, interfaceC1809a1362, interfaceC1809a1372, interfaceC1809a1382, interfaceC1809a1392, interfaceC1809a1402, interfaceC1809a1412, interfaceC1809a1422, interfaceC1809a1432, "always_allow");
                                            }
                                            c1845j17.setValue(Boolean.FALSE);
                                            c1845j18.setValue(null);
                                            C5491y2.m9852x1(c5354tt.f20966a, context8, c5354tt.f20967b, interfaceC1809a18, interfaceC1809a17, interfaceC1809a13, interfaceC1809a19, interfaceC1809a110, c1845j19, str4, c5518yt4, c5354tt.f20969d);
                                            break;
                                        case 1:
                                            C5255qt c5255qt2 = (C5255qt) c5321st2;
                                            boolean zBooleanValue3 = ((Boolean) interfaceC1809a132.getValue()).booleanValue();
                                            Context context9 = context4;
                                            if (zBooleanValue3) {
                                                C5491y2.m9846v1(context9, interfaceC1809a1332, interfaceC1809a1342, interfaceC1809a1352, interfaceC1809a1362, interfaceC1809a1372, interfaceC1809a1382, interfaceC1809a1392, interfaceC1809a1402, interfaceC1809a1412, interfaceC1809a1422, interfaceC1809a1432, "always_allow");
                                            }
                                            c1845j17.setValue(Boolean.FALSE);
                                            c1845j18.setValue(null);
                                            C5491y2.m9771D0(c5255qt2.f20302a, context9, interfaceC1809a18, interfaceC1809a17, interfaceC1809a13, interfaceC1809a19, interfaceC1809a110, c1845j19, str4, c5255qt2.f20303b, c5518yt4);
                                            break;
                                        default:
                                            C5321st c5321st32 = (C5321st) c5321st2;
                                            boolean zBooleanValue4 = ((Boolean) interfaceC1809a132.getValue()).booleanValue();
                                            Context context10 = context4;
                                            if (zBooleanValue4) {
                                                C5491y2.m9846v1(context10, interfaceC1809a1332, interfaceC1809a1342, interfaceC1809a1352, interfaceC1809a1362, interfaceC1809a1372, interfaceC1809a1382, interfaceC1809a1392, interfaceC1809a1402, interfaceC1809a1412, interfaceC1809a1422, interfaceC1809a1432, "always_allow");
                                            }
                                            Boolean bool = Boolean.FALSE;
                                            C1845j1 c1845j117 = c1845j17;
                                            c1845j117.setValue(bool);
                                            C1845j1 c1845j118 = c1845j18;
                                            c1845j118.setValue(null);
                                            C5491y2.m9853y0(c5321st32.f20718a, context10, c5321st32.f20719b, interfaceC1809a18, interfaceC1809a17, interfaceC1809a13, interfaceC1809a19, interfaceC1809a110, c1845j117, c1845j19, c1845j118, str4, c5518yt4);
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h02.m4545k0(interfaceC1220a52);
                            objM4514P2 = interfaceC1220a52;
                            InterfaceC1220a interfaceC1220a62 = (InterfaceC1220a) objM4514P2;
                            if (1.0f <= 0.0d) {
                            }
                            C1836h0 c1836h072 = c1836h02;
                            AbstractC4045s.m8251o(str122, interfaceC1220a62, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h02), null, c1836h072, 0, 1912);
                            c1836h072.m4553p(true);
                            c1836h072.m4553p(true);
                        }
                    }
                } else {
                    c1836h06.m4519V();
                }
                break;
            default:
                final C5354tt c5354tt = (C5354tt) this.f18220E;
                boolean z16 = c5354tt.f20969d;
                C1836h0 c1836h08 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h08.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C5850l c5850l6 = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM6904g2 = AbstractC3222h1.m6904g(AbstractC3222h1.m6901d(c5850l6, 1.0f), 0.0f, 520, 1);
                    C3211e c3211e2 = AbstractC3226j.f10300c;
                    C5843e c5843e2 = C5840b.f23773s;
                    C3256t c3256tM6935a4 = AbstractC3253s.m6935a(c3211e2, c5843e2, c1836h08, 0);
                    int iHashCode6 = Long.hashCode(c1836h08.f6095T);
                    C3878h c3878hM4546l6 = c1836h08.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c6 = AbstractC5839a.m10543c(c1836h08, interfaceC5853oM6904g2);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y4 = C5601f.f22758b;
                    c1836h08.m4531d0();
                    if (c1836h08.f6094S) {
                        c1836h08.m4544k(c5660y4);
                    } else {
                        c1836h08.m4551n0();
                    }
                    C5597e c5597e9 = C5601f.f22761e;
                    AbstractC1874r.m4615A(c5597e9, c1836h08, c3256tM6935a4);
                    C5597e c5597e10 = C5601f.f22760d;
                    AbstractC1874r.m4615A(c5597e10, c1836h08, c3878hM4546l6);
                    Integer numValueOf3 = Integer.valueOf(iHashCode6);
                    C5597e c5597e11 = C5601f.f22762f;
                    AbstractC1874r.m4615A(c5597e11, c1836h08, numValueOf3);
                    C5593d c5593d3 = C5601f.f22763g;
                    AbstractC1874r.m4641w(c5593d3, c1836h08);
                    C5597e c5597e12 = C5601f.f22759c;
                    AbstractC1874r.m4615A(c5597e12, c1836h08, interfaceC5853oM10543c6);
                    InterfaceC5853o interfaceC5853oM6901d2 = AbstractC3222h1.m6901d(c5850l6, 1.0f);
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    InterfaceC5853o interfaceC5853oM5441r2 = AbstractC2192n.m5441r(interfaceC5853oM6901d2.mo10549d(new C3248q0(1.0f, false)), AbstractC2192n.m5440q(c1836h08), true, true);
                    C3256t c3256tM6935a5 = AbstractC3253s.m6935a(c3211e2, c5843e2, c1836h08, 0);
                    int iHashCode7 = Long.hashCode(c1836h08.f6095T);
                    C3878h c3878hM4546l7 = c1836h08.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c7 = AbstractC5839a.m10543c(c1836h08, interfaceC5853oM5441r2);
                    c1836h08.m4531d0();
                    if (c1836h08.f6094S) {
                        c1836h08.m4544k(c5660y4);
                    } else {
                        c1836h08.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e9, c1836h08, c3256tM6935a5);
                    AbstractC1874r.m4615A(c5597e10, c1836h08, c3878hM4546l7);
                    AbstractC2091b.m5169p(iHashCode7, c1836h08, c5597e11, c1836h08, c5593d3);
                    AbstractC1874r.m4615A(c5597e12, c1836h08, interfaceC5853oM10543c7);
                    StringBuilder sb3 = new StringBuilder();
                    boolean z17 = c5354tt.f20970e;
                    C1192y c1192y = c5354tt.f20967b;
                    String str13 = c1192y.f4006b;
                    if (z16) {
                        z12 = z16;
                        c5850l2 = c5850l6;
                        sb3.append(AbstractC0255e.m1022k("Agent 将创建插件“", c1192y.f4005a, "”（", str13, "）。创建后默认禁用。"));
                    } else {
                        z12 = z16;
                        c5850l2 = c5850l6;
                        if (z17) {
                            sb3.append("目录 " + str13 + " 已存在。继续会把它作为同名插件更新，并保持禁用。");
                        } else {
                            sb3.append("Agent 将直接修改插件 " + str13 + "，写入后插件会保持禁用。");
                        }
                    }
                    if (c5354tt.f20971f) {
                        sb3.append("\n\n静态检查发现网络、反射、Hook、文件删除或进程执行等高风险代码，请确认代码来源和用途。");
                    }
                    String string2 = sb3.toString();
                    C1858m2 c1858m22 = AbstractC0316d.f944a;
                    AbstractC4045s.m8250n(string2, null, ((C0314b) c1836h08.m4542j(c1858m22)).m1237g(), AbstractC5700d.m10248D(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h08, 24576, 0, 262122);
                    float f12 = 12;
                    C5850l c5850l7 = c5850l2;
                    AbstractC4045s.m8250n("代码差异", AbstractC3208d.m6886p(c5850l2, 0.0f, f12, 0.0f, 0.0f, 13), ((C0314b) c1836h08.m4542j(c1858m22)).m1238h(), AbstractC5700d.m10248D(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h08, 24630, 0, 262120);
                    C5491y2 c5491y23 = C5491y2.f22066n;
                    String str14 = c5354tt.f20968c;
                    if (AbstractC3149m.m6721t0(str14)) {
                        str14 = "无代码变化";
                    }
                    c5491y23.m9875T(str14, c1836h08, 48);
                    c1836h08.m4553p(true);
                    InterfaceC1809a1 interfaceC1809a144 = this.f18222h;
                    boolean zBooleanValue3 = ((Boolean) interfaceC1809a144.getValue()).booleanValue();
                    boolean zM4534f21 = c1836h08.m4534f(interfaceC1809a144);
                    Object objM4514P9 = c1836h08.m4514P();
                    C1823e c1823e7 = C1851l.f6155a;
                    if (zM4534f21 || objM4514P9 == c1823e7) {
                        objM4514P9 = new C5086lp(interfaceC1809a144, 13);
                        c1836h08.m4545k0(objM4514P9);
                    }
                    c5491y23.m9871N(zBooleanValue3, "确认后，后续插件修改不再询问", (InterfaceC1231l) objM4514P9, c1836h08, 3120);
                    InterfaceC5853o interfaceC5853oM6886p3 = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l7, 1.0f), 0.0f, f12, 0.0f, 0.0f, 13);
                    C3213e1 c3213e1M6892a3 = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(10), C5840b.f23770p, c1836h08, 6);
                    int iHashCode8 = Long.hashCode(c1836h08.f6095T);
                    C3878h c3878hM4546l8 = c1836h08.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c8 = AbstractC5839a.m10543c(c1836h08, interfaceC5853oM6886p3);
                    c1836h08.m4531d0();
                    if (c1836h08.f6094S) {
                        c1836h08.m4544k(c5660y4);
                    } else {
                        c1836h08.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e9, c1836h08, c3213e1M6892a3);
                    AbstractC1874r.m4615A(c5597e10, c1836h08, c3878hM4546l8);
                    AbstractC2091b.m5169p(iHashCode8, c1836h08, c5597e11, c1836h08, c5593d3);
                    AbstractC1874r.m4615A(c5597e12, c1836h08, interfaceC5853oM10543c8);
                    C1845j1 c1845j117 = this.f18223i;
                    boolean zM4534f22 = c1836h08.m4534f(c1845j117);
                    C1845j1 c1845j118 = this.f18224j;
                    boolean zM4534f23 = zM4534f22 | c1836h08.m4534f(c1845j118);
                    final InterfaceC1809a1 interfaceC1809a145 = this.f18225k;
                    boolean zM4534f24 = zM4534f23 | c1836h08.m4534f(interfaceC1809a145);
                    InterfaceC1809a1 interfaceC1809a146 = this.f18227m;
                    boolean zM4534f25 = zM4534f24 | c1836h08.m4534f(interfaceC1809a146);
                    String str15 = this.f18228n;
                    boolean zM4534f26 = zM4534f25 | c1836h08.m4534f(str15);
                    Context context8 = this.f18226l;
                    boolean zM4538h5 = zM4534f26 | c1836h08.m4538h(context8);
                    C5518yt c5518yt8 = this.f18229o;
                    boolean zM4538h6 = zM4538h5 | c1836h08.m4538h(c5518yt8) | c1836h08.m4538h(c5354tt);
                    Object objM4514P10 = c1836h08.m4514P();
                    InterfaceC1809a1 interfaceC1809a147 = this.f18233s;
                    if (zM4538h6 || objM4514P10 == c1823e7) {
                        z13 = true;
                        c1823e3 = c1823e7;
                        interfaceC1809a111 = interfaceC1809a144;
                        f10 = 1.0f;
                        c0491u0 = new C0491u0(c5354tt, c1845j117, c1845j118, interfaceC1809a145, interfaceC1809a146, str15, context8, c5518yt8, interfaceC1809a147, 6);
                        c1845j110 = c1845j117;
                        c1845j111 = c1845j118;
                        interfaceC1809a112 = interfaceC1809a146;
                        str5 = str15;
                        context5 = context8;
                        c5518yt5 = c5518yt8;
                        interfaceC1809a113 = interfaceC1809a147;
                        c1836h08.m4545k0(c0491u0);
                    } else {
                        z13 = true;
                        c0491u0 = objM4514P10;
                        interfaceC1809a113 = interfaceC1809a147;
                        c1845j110 = c1845j117;
                        c1845j111 = c1845j118;
                        interfaceC1809a112 = interfaceC1809a146;
                        str5 = str15;
                        context5 = context8;
                        c5518yt5 = c5518yt8;
                        c1823e3 = c1823e7;
                        interfaceC1809a111 = interfaceC1809a144;
                        f10 = 1.0f;
                    }
                    InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) c0491u0;
                    if (f10 <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    C1823e c1823e8 = c1823e3;
                    final Context context9 = context5;
                    final C1845j1 c1845j119 = c1845j111;
                    final InterfaceC1809a1 interfaceC1809a148 = interfaceC1809a112;
                    final String str16 = str5;
                    final C5518yt c5518yt9 = c5518yt5;
                    final C1845j1 c1845j120 = c1845j110;
                    AbstractC4045s.m8251o("取消", interfaceC1220a7, new C3248q0(f10, z13), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h08), null, c1836h08, 6, 1912);
                    String str17 = z12 ? "确认创建" : z17 ? "确认替换" : "确认修改";
                    boolean zM4534f27 = c1836h08.m4534f(interfaceC1809a111) | c1836h08.m4538h(context9) | c1836h08.m4534f(c1845j120) | c1836h08.m4534f(c1845j119);
                    final C1845j1 c1845j121 = this.f18230p;
                    boolean zM4534f28 = zM4534f27 | c1836h08.m4534f(c1845j121) | c1836h08.m4534f(interfaceC1809a148) | c1836h08.m4534f(str16) | c1836h08.m4538h(c5518yt9) | c1836h08.m4534f(interfaceC1809a145);
                    final InterfaceC1809a1 interfaceC1809a149 = this.f18231q;
                    boolean zM4534f29 = zM4534f28 | c1836h08.m4534f(interfaceC1809a149);
                    final InterfaceC1809a1 interfaceC1809a150 = this.f18232r;
                    boolean zM4534f30 = zM4534f29 | c1836h08.m4534f(interfaceC1809a150) | c1836h08.m4538h(c5354tt);
                    Object objM4514P11 = c1836h08.m4514P();
                    if (zM4534f30 || objM4514P11 == c1823e8) {
                        final int i11 = 0;
                        final InterfaceC1809a1 interfaceC1809a151 = this.f18234t;
                        final InterfaceC1809a1 interfaceC1809a152 = this.f18235u;
                        final InterfaceC1809a1 interfaceC1809a153 = this.f18236v;
                        final InterfaceC1809a1 interfaceC1809a154 = this.f18237w;
                        final InterfaceC1809a1 interfaceC1809a155 = this.f18238x;
                        final InterfaceC1809a1 interfaceC1809a156 = this.f18239y;
                        final InterfaceC1809a1 interfaceC1809a157 = this.f18240z;
                        final InterfaceC1809a1 interfaceC1809a158 = this.f18216A;
                        final InterfaceC1809a1 interfaceC1809a159 = this.f18217B;
                        final InterfaceC1809a1 interfaceC1809a160 = this.f18218C;
                        final InterfaceC1809a1 interfaceC1809a161 = this.f18219D;
                        final InterfaceC1809a1 interfaceC1809a162 = interfaceC1809a111;
                        c1836h03 = c1836h08;
                        InterfaceC1220a interfaceC1220a8 = new InterfaceC1220a() { // from class: wb.us
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() throws JSONException {
                                switch (i11) {
                                    case 0:
                                        C5354tt c5354tt2 = (C5354tt) c5354tt;
                                        boolean zBooleanValue22 = ((Boolean) interfaceC1809a162.getValue()).booleanValue();
                                        Context context82 = context9;
                                        if (zBooleanValue22) {
                                            C5491y2.m9846v1(context82, interfaceC1809a151, interfaceC1809a152, interfaceC1809a153, interfaceC1809a154, interfaceC1809a155, interfaceC1809a156, interfaceC1809a157, interfaceC1809a158, interfaceC1809a159, interfaceC1809a160, interfaceC1809a161, "always_allow");
                                        }
                                        c1845j120.setValue(Boolean.FALSE);
                                        c1845j119.setValue(null);
                                        C5491y2.m9852x1(c5354tt2.f20966a, context82, c5354tt2.f20967b, interfaceC1809a148, interfaceC1809a113, interfaceC1809a145, interfaceC1809a149, interfaceC1809a150, c1845j121, str16, c5518yt9, c5354tt2.f20969d);
                                        break;
                                    case 1:
                                        C5255qt c5255qt2 = (C5255qt) c5354tt;
                                        boolean zBooleanValue32 = ((Boolean) interfaceC1809a162.getValue()).booleanValue();
                                        Context context92 = context9;
                                        if (zBooleanValue32) {
                                            C5491y2.m9846v1(context92, interfaceC1809a151, interfaceC1809a152, interfaceC1809a153, interfaceC1809a154, interfaceC1809a155, interfaceC1809a156, interfaceC1809a157, interfaceC1809a158, interfaceC1809a159, interfaceC1809a160, interfaceC1809a161, "always_allow");
                                        }
                                        c1845j120.setValue(Boolean.FALSE);
                                        c1845j119.setValue(null);
                                        C5491y2.m9771D0(c5255qt2.f20302a, context92, interfaceC1809a148, interfaceC1809a113, interfaceC1809a145, interfaceC1809a149, interfaceC1809a150, c1845j121, str16, c5255qt2.f20303b, c5518yt9);
                                        break;
                                    default:
                                        C5321st c5321st32 = (C5321st) c5354tt;
                                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a162.getValue()).booleanValue();
                                        Context context10 = context9;
                                        if (zBooleanValue4) {
                                            C5491y2.m9846v1(context10, interfaceC1809a151, interfaceC1809a152, interfaceC1809a153, interfaceC1809a154, interfaceC1809a155, interfaceC1809a156, interfaceC1809a157, interfaceC1809a158, interfaceC1809a159, interfaceC1809a160, interfaceC1809a161, "always_allow");
                                        }
                                        Boolean bool = Boolean.FALSE;
                                        C1845j1 c1845j1172 = c1845j120;
                                        c1845j1172.setValue(bool);
                                        C1845j1 c1845j1182 = c1845j119;
                                        c1845j1182.setValue(null);
                                        C5491y2.m9853y0(c5321st32.f20718a, context10, c5321st32.f20719b, interfaceC1809a148, interfaceC1809a113, interfaceC1809a145, interfaceC1809a149, interfaceC1809a150, c1845j1172, c1845j121, c1845j1182, str16, c5518yt9);
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h03.m4545k0(interfaceC1220a8);
                        objM4514P11 = interfaceC1220a8;
                    } else {
                        c1836h03 = c1836h08;
                    }
                    InterfaceC1220a interfaceC1220a9 = (InterfaceC1220a) objM4514P11;
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    C1836h0 c1836h09 = c1836h03;
                    AbstractC4045s.m8251o(str17, interfaceC1220a9, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h03), null, c1836h09, 0, 1912);
                    c1836h09.m4553p(true);
                    c1836h09.m4553p(true);
                } else {
                    c1836h08.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5023js(InterfaceC1809a1 interfaceC1809a1, C5354tt c5354tt, C1845j1 c1845j1, C1845j1 c1845j12, C1845j1 c1845j13, C1845j1 c1845j14, String str, Context context, C5518yt c5518yt, C1845j1 c1845j15, C1845j1 c1845j16, C1845j1 c1845j17, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113) {
        this.f18222h = interfaceC1809a1;
        this.f18220E = c5354tt;
        this.f18223i = c1845j1;
        this.f18224j = c1845j12;
        this.f18225k = c1845j13;
        this.f18227m = c1845j14;
        this.f18228n = str;
        this.f18226l = context;
        this.f18229o = c5518yt;
        this.f18230p = c1845j15;
        this.f18231q = c1845j16;
        this.f18232r = c1845j17;
        this.f18233s = interfaceC1809a12;
        this.f18234t = interfaceC1809a13;
        this.f18235u = interfaceC1809a14;
        this.f18236v = interfaceC1809a15;
        this.f18237w = interfaceC1809a16;
        this.f18238x = interfaceC1809a17;
        this.f18239y = interfaceC1809a18;
        this.f18240z = interfaceC1809a19;
        this.f18216A = interfaceC1809a110;
        this.f18217B = interfaceC1809a111;
        this.f18218C = interfaceC1809a112;
        this.f18219D = interfaceC1809a113;
    }

    public /* synthetic */ C5023js(C5255qt c5255qt, InterfaceC1809a1 interfaceC1809a1, C1845j1 c1845j1, C1845j1 c1845j12, C1845j1 c1845j13, C1845j1 c1845j14, String str, Context context, C5518yt c5518yt, C1845j1 c1845j15, C1845j1 c1845j16, C1845j1 c1845j17, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113) {
        this.f18220E = c5255qt;
        this.f18222h = interfaceC1809a1;
        this.f18223i = c1845j1;
        this.f18224j = c1845j12;
        this.f18225k = c1845j13;
        this.f18227m = c1845j14;
        this.f18228n = str;
        this.f18226l = context;
        this.f18229o = c5518yt;
        this.f18230p = c1845j15;
        this.f18231q = c1845j16;
        this.f18232r = c1845j17;
        this.f18233s = interfaceC1809a12;
        this.f18234t = interfaceC1809a13;
        this.f18235u = interfaceC1809a14;
        this.f18236v = interfaceC1809a15;
        this.f18237w = interfaceC1809a16;
        this.f18238x = interfaceC1809a17;
        this.f18239y = interfaceC1809a18;
        this.f18240z = interfaceC1809a19;
        this.f18216A = interfaceC1809a110;
        this.f18217B = interfaceC1809a111;
        this.f18218C = interfaceC1809a112;
        this.f18219D = interfaceC1809a113;
    }
}

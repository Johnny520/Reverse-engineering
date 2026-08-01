package p247qe;

import be.C1116d;
import java.util.List;
import me.AbstractC5166e;
import me.C5164c;
import me.C5168g;
import ne.InterfaceC5590b;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1067w;
import p172l8.C4711r;
import p175le.C4752a;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p217oe.InterfaceC5742d;
import p299ub.AbstractC8611a0;
import p299ub.C8632n;
import p299ub.EnumC8634p;
import p299ub.InterfaceC8626i;
import pe.C6073f;

/* JADX INFO: renamed from: qe.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6421f implements InterfaceC5742d {

    /* JADX INFO: renamed from: b */
    public static final b f20216b = new b(null);

    /* JADX INFO: renamed from: c */
    public static final String f20217c = "address, article, aside, base, basefont, blockquote, body, caption, center, col, colgroup, dd, details, dialog, dir, div, dl, dt, fieldset, figcaption, figure, footer, form, frame, frameset, h1, head, header, hr, html, legend, li, link, main, menu, menuitem, meta, nav, noframes, ol, optgroup, option, p, param, pre, section, source, title, summary, table, tbody, td, tfoot, th, thead, title, tr, track, ul";

    /* JADX INFO: renamed from: d */
    public static final String f20218d = "[a-zA-Z][a-zA-Z0-9-]*";

    /* JADX INFO: renamed from: e */
    public static final String f20219e = "[A-Za-z:_][A-Za-z0-9_.:-]*";

    /* JADX INFO: renamed from: f */
    public static final String f20220f = "\\s*=\\s*(?:[^ \"'=<>`]+|'[^']*'|\"[^\"]*\")";

    /* JADX INFO: renamed from: g */
    public static final String f20221g;

    /* JADX INFO: renamed from: h */
    public static final String f20222h;

    /* JADX INFO: renamed from: i */
    public static final String f20223i;

    /* JADX INFO: renamed from: j */
    public static final List f20224j;

    /* JADX INFO: renamed from: k */
    public static final C8632n f20225k;

    /* JADX INFO: renamed from: qe.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final a f20226r = new a();

        public a() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo27m(C4711r c4711r) {
            c4711r.getClass();
            return "(" + ((C8632n) c4711r.m18795e()).m33214f() + ')';
        }
    }

    static {
        String str = "\\s+[A-Za-z:_][A-Za-z0-9_.:-]*(?:\\s*=\\s*(?:[^ \"'=<>`]+|'[^']*'|\"[^\"]*\"))?";
        f20221g = str;
        String str2 = "<[a-zA-Z][a-zA-Z0-9-]*(?:" + str + ")*\\s*/?>";
        f20222h = str2;
        String str3 = "</[a-zA-Z][a-zA-Z0-9-]*\\s*>";
        f20223i = str3;
        EnumC8634p enumC8634p = EnumC8634p.f28709s;
        List listM20803r = AbstractC5114x.m20803r(new C4711r(new C8632n("<(?:script|pre|style)(?: |>|$)", enumC8634p), new C8632n("</(?:script|style|pre)>", enumC8634p)), new C4711r(new C8632n("<!--"), new C8632n("-->")), new C4711r(new C8632n("<\\?"), new C8632n("\\?>")), new C4711r(new C8632n("<![A-Z]"), new C8632n(">")), new C4711r(new C8632n("<!\\[CDATA\\["), new C8632n("\\]\\]>")), new C4711r(new C8632n("</?(?:" + AbstractC8611a0.m33069N("address, article, aside, base, basefont, blockquote, body, caption, center, col, colgroup, dd, details, dialog, dir, div, dl, dt, fieldset, figcaption, figure, footer, form, frame, frameset, h1, head, header, hr, html, legend, li, link, main, menu, menuitem, meta, nav, noframes, ol, optgroup, option, p, param, pre, section, source, title, summary, table, tbody, td, tfoot, th, thead, title, tr, track, ul", ", ", "|", false, 4, null) + ")(?: |/?>|$)", enumC8634p), null), new C4711r(new C8632n("(?:" + str2 + '|' + str3 + ")(?: |$)"), null));
        f20224j = listM20803r;
        StringBuilder sb2 = new StringBuilder("^(");
        sb2.append(AbstractC5081g0.m20585s0(listM20803r, "|", null, null, 0, null, a.f20226r, 30, null));
        sb2.append(')');
        f20225k = new C8632n(sb2.toString());
    }

    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: a */
    public List mo12784a(C5164c.a aVar, C5168g c5168g, AbstractC5166e.a aVar2) {
        aVar.getClass();
        c5168g.getClass();
        aVar2.getClass();
        int iM25445c = m25445c(aVar, aVar2.m21216a());
        return iM25445c != -1 ? AbstractC5112w.m20789e(new C6073f(aVar2.m21216a(), c5168g, (C8632n) ((C4711r) f20224j.get(iM25445c)).m18796f(), aVar)) : AbstractC5114x.m20800o();
    }

    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: b */
    public boolean mo12785b(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        aVar.getClass();
        interfaceC5590b.getClass();
        int iM25445c = m25445c(aVar, interfaceC5590b);
        return iM25445c >= 0 && iM25445c < 6;
    }

    /* JADX INFO: renamed from: c */
    public final int m25445c(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        InterfaceC8626i interfaceC8626iM33210c;
        InterfaceC5742d.a aVar2 = InterfaceC5742d.f18111a;
        if (!aVar2.m23241a(aVar, interfaceC5590b)) {
            return -1;
        }
        CharSequence charSequenceM21187d = aVar.m21187d();
        int iM23240c = InterfaceC5742d.a.m23240c(aVar2, charSequenceM21187d, 0, 2, null);
        if (iM23240c >= charSequenceM21187d.length() || charSequenceM21187d.charAt(iM23240c) != '<' || (interfaceC8626iM33210c = C8632n.m33210c(f20225k, charSequenceM21187d.subSequence(iM23240c, charSequenceM21187d.length()).toString(), 0, 2, null)) == null) {
            return -1;
        }
        C4752a c4752a = C4752a.f14072a;
        int size = interfaceC8626iM33210c.mo33183c().size();
        List list = f20224j;
        if (!(size == list.size() + 2)) {
            throw new C1116d("There are some excess capturing groups probably!");
        }
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            if (interfaceC8626iM33210c.mo33183c().get(i10 + 2) != null) {
                return i10;
            }
        }
        C4752a c4752a2 = C4752a.f14072a;
        throw new C1116d("Match found but all groups are empty!");
    }

    /* JADX INFO: renamed from: qe.f$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        public b() {
        }
    }
}

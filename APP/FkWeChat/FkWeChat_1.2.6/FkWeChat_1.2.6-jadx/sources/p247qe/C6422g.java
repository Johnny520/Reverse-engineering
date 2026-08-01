package p247qe;

import be.AbstractC1113a;
import be.C1115c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.AbstractC5166e;
import me.C5164c;
import me.C5168g;
import ne.InterfaceC5590b;
import p024b9.AbstractC1043k;
import p080f9.C2363j;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p217oe.InterfaceC5742d;
import p299ub.AbstractC8610a;
import pe.C6074g;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: qe.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6422g implements InterfaceC5742d {

    /* JADX INFO: renamed from: b */
    public static final a f20227b = new a(null);

    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: a */
    public List mo12784a(C5164c.a aVar, C5168g c5168g, AbstractC5166e.a aVar2) {
        AbstractC1113a abstractC1113a;
        aVar.getClass();
        c5168g.getClass();
        aVar2.getClass();
        if (!InterfaceC5742d.f18111a.m23241a(aVar, aVar2.m21216a())) {
            return AbstractC5114x.m20800o();
        }
        List listM25449c = f20227b.m25449c(aVar.m21193j(), aVar.m21191h());
        if (listM25449c == null) {
            return AbstractC5114x.m20800o();
        }
        Iterator it = listM25449c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            C2363j c2363jM25447a = f20227b.m25447a((C2363j) it.next(), 0);
            if (i10 == 0) {
                abstractC1113a = C1115c.f3365o;
            } else if (i10 == 1) {
                abstractC1113a = C1115c.f3366p;
            } else {
                if (i10 != 2) {
                    throw new AssertionError("There are no more than three groups in this regex");
                }
                abstractC1113a = C1115c.f3367q;
            }
            c5168g.m21222b(AbstractC5112w.m20789e(new InterfaceC6627f.a(c2363jM25447a, abstractC1113a)));
            i10 = i11;
        }
        int iM8561p = (((C2363j) AbstractC5081g0.m20587u0(listM25449c)).m8561p() - aVar.m21191h()) + 1;
        C5164c.a aVarM21196m = aVar.m21196m(iM8561p);
        return (aVarM21196m == null || f20227b.m25448b(aVarM21196m)) ? AbstractC5112w.m20789e(new C6074g(aVar2.m21216a(), c5168g.m21225e(), aVar.m21191h() + iM8561p)) : AbstractC5114x.m20800o();
    }

    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: b */
    public boolean mo12785b(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        aVar.getClass();
        interfaceC5590b.getClass();
        return false;
    }

    /* JADX INFO: renamed from: qe.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C2363j m25447a(C2363j c2363j, int i10) {
            c2363j.getClass();
            return new C2363j(c2363j.m8560o() + i10, c2363j.m8561p() + i10 + 1);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m25448b(C5164c.a aVar) {
            aVar.getClass();
            return aVar.m21192i() == -1 || aVar.m21184a() == null;
        }

        /* JADX INFO: renamed from: c */
        public final List m25449c(CharSequence charSequence, int i10) {
            int iM8561p;
            int iM8561p2;
            C2363j c2363jM25450d;
            char cCharAt;
            charSequence.getClass();
            C2363j c2363jM25451e = m25451e(charSequence, InterfaceC5742d.f18111a.m23242b(charSequence, i10));
            if (c2363jM25451e == null || (iM8561p2 = (iM8561p = c2363jM25451e.m8561p()) + 1) >= charSequence.length() || charSequence.charAt(iM8561p2) != ':' || (c2363jM25450d = m25450d(charSequence, m25453g(charSequence, iM8561p + 2))) == null) {
                return null;
            }
            C2363j c2363jM25452f = m25452f(charSequence, m25453g(charSequence, c2363jM25450d.m8561p() + 1));
            ArrayList arrayList = new ArrayList();
            arrayList.add(c2363jM25451e);
            arrayList.add(c2363jM25450d);
            if (c2363jM25452f != null) {
                int iM8561p3 = c2363jM25452f.m8561p();
                while (true) {
                    iM8561p3++;
                    if (iM8561p3 >= charSequence.length() || ((cCharAt = charSequence.charAt(iM8561p3)) != ' ' && cCharAt != '\t')) {
                        break;
                    }
                }
                if (iM8561p3 >= charSequence.length() || charSequence.charAt(iM8561p3) == '\n') {
                    arrayList.add(c2363jM25452f);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: d */
        public final C2363j m25450d(CharSequence charSequence, int i10) {
            char cCharAt;
            int i11;
            char cCharAt2;
            int i12;
            char cCharAt3;
            charSequence.getClass();
            if (i10 >= charSequence.length()) {
                return null;
            }
            if (charSequence.charAt(i10) == '<') {
                int i13 = i10 + 1;
                while (i13 < charSequence.length()) {
                    char cCharAt4 = charSequence.charAt(i13);
                    if (cCharAt4 == '>') {
                        return new C2363j(i10, i13);
                    }
                    if (cCharAt4 == '<' || cCharAt4 == '>' || cCharAt4 == ' ' || cCharAt4 == '\t' || cCharAt4 == '\n') {
                        break;
                    }
                    if (cCharAt4 == '\\' && (i12 = i13 + 1) < charSequence.length() && (cCharAt3 = charSequence.charAt(i12)) != ' ' && cCharAt3 != '\t' && cCharAt3 != '\n') {
                        i13 = i12;
                    }
                    i13++;
                }
                return null;
            }
            int i14 = i10;
            boolean z10 = false;
            while (i14 < charSequence.length() && (cCharAt = charSequence.charAt(i14)) != ' ' && cCharAt != '\t' && cCharAt != '\n' && cCharAt > 27) {
                if (cCharAt != '(') {
                    if (cCharAt == ')') {
                        if (!z10) {
                            break;
                        }
                        z10 = false;
                    } else if (cCharAt == '\\' && (i11 = i14 + 1) < charSequence.length() && (cCharAt2 = charSequence.charAt(i11)) != ' ' && cCharAt2 != '\t' && cCharAt2 != '\n') {
                        i14 = i11;
                    }
                    i14++;
                } else {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    i14++;
                }
            }
            if (i10 == i14) {
                return null;
            }
            return new C2363j(i10, i14 - 1);
        }

        /* JADX INFO: renamed from: e */
        public final C2363j m25451e(CharSequence charSequence, int i10) {
            charSequence.getClass();
            if (i10 < charSequence.length() && charSequence.charAt(i10) == '[') {
                int i11 = i10 + 1;
                boolean z10 = false;
                for (int i12 = 1; i12 < 1000; i12++) {
                    if (i11 >= charSequence.length()) {
                        return null;
                    }
                    char cCharAt = charSequence.charAt(i11);
                    if (cCharAt == '[' || cCharAt == ']') {
                        break;
                    }
                    if (cCharAt == '\\') {
                        i11++;
                        if (i11 >= charSequence.length()) {
                            return null;
                        }
                        cCharAt = charSequence.charAt(i11);
                    }
                    if (!AbstractC8610a.m33055c(cCharAt)) {
                        z10 = true;
                    }
                    i11++;
                }
                if (z10 && i11 < charSequence.length() && charSequence.charAt(i11) == ']') {
                    return new C2363j(i10, i11);
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001f A[PHI: r2
  0x001f: PHI (r2v1 char) = (r2v0 char), (r2v2 char), (r2v4 char) binds: [B:6:0x0011, B:9:0x0016, B:13:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
        /* JADX INFO: renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final p080f9.C2363j m25452f(java.lang.CharSequence r12, int r13) {
            /*
                r11 = this;
                r12.getClass()
                int r0 = r12.length()
                r1 = 0
                if (r13 < r0) goto Lb
                return r1
            Lb:
                char r0 = r12.charAt(r13)
                r2 = 39
                if (r0 != r2) goto L14
                goto L1f
            L14:
                r2 = 34
                if (r0 != r2) goto L19
                goto L1f
            L19:
                r2 = 40
                if (r0 != r2) goto L64
                r2 = 41
            L1f:
                int r0 = r13 + 1
                r3 = 0
                r4 = r3
            L23:
                int r5 = r12.length()
                if (r0 >= r5) goto L64
                char r5 = r12.charAt(r0)
                if (r5 != r2) goto L35
                f9.j r12 = new f9.j
                r12.<init>(r13, r0)
                return r12
            L35:
                r6 = 9
                r7 = 32
                r8 = 10
                r9 = 1
                if (r5 != r8) goto L43
                if (r4 == 0) goto L41
                return r1
            L41:
                r4 = r9
                goto L49
            L43:
                if (r5 == r7) goto L49
                if (r5 != r6) goto L48
                goto L49
            L48:
                r4 = r3
            L49:
                r10 = 92
                if (r5 != r10) goto L62
                int r5 = r0 + 1
                int r10 = r12.length()
                if (r5 >= r10) goto L62
                char r10 = r12.charAt(r5)
                if (r10 == r7) goto L62
                if (r10 != r6) goto L5e
                goto L62
            L5e:
                if (r10 != r8) goto L61
                goto L62
            L61:
                r0 = r5
            L62:
                int r0 = r0 + r9
                goto L23
            L64:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p247qe.C6422g.a.m25452f(java.lang.CharSequence, int):f9.j");
        }

        /* JADX INFO: renamed from: g */
        public final int m25453g(CharSequence charSequence, int i10) {
            char cCharAt;
            char cCharAt2;
            while (i10 < charSequence.length() && ((cCharAt2 = charSequence.charAt(i10)) == ' ' || cCharAt2 == '\t')) {
                i10++;
            }
            if (i10 < charSequence.length() && charSequence.charAt(i10) == '\n') {
                while (true) {
                    i10++;
                    if (i10 >= charSequence.length() || ((cCharAt = charSequence.charAt(i10)) != ' ' && cCharAt != '\t')) {
                        break;
                    }
                }
            }
            return i10;
        }

        public a() {
        }
    }
}

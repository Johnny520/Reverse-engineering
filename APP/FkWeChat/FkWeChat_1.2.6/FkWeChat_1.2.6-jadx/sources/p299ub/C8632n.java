package p299ub;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.C1055q;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5112w;
import sb.AbstractC7291q;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: ub.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8632n implements Serializable {

    /* JADX INFO: renamed from: r */
    public static final a f28702r = new a(null);

    /* JADX INFO: renamed from: q */
    public final Pattern f28703q;

    /* JADX INFO: renamed from: ub.n$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class c extends C1055q implements InterfaceC0184l {

        /* JADX INFO: renamed from: y */
        public static final c f28707y = new c();

        public c() {
            super(1, InterfaceC8626i.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8626i mo27m(InterfaceC8626i interfaceC8626i) {
            interfaceC8626i.getClass();
            return interfaceC8626i.next();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8632n(String str, EnumC8634p enumC8634p) {
        str.getClass();
        enumC8634p.getClass();
        Pattern patternCompile = Pattern.compile(str, f28702r.m33222b(enumC8634p.m33233c()));
        patternCompile.getClass();
        this(patternCompile);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC8626i m33209a(C8632n c8632n, CharSequence charSequence, int i10) {
        return c8632n.m33212b(charSequence, i10);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC8626i m33210c(C8632n c8632n, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c8632n.m33212b(charSequence, i10);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InterfaceC7282h m33211e(C8632n c8632n, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c8632n.m33213d(charSequence, i10);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        String strPattern = this.f28703q.pattern();
        strPattern.getClass();
        return new b(strPattern, this.f28703q.flags());
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC8626i m33212b(CharSequence charSequence, int i10) {
        charSequence.getClass();
        Matcher matcher = this.f28703q.matcher(charSequence);
        matcher.getClass();
        return AbstractC8633o.m33228e(matcher, i10, charSequence);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC7282h m33213d(final CharSequence charSequence, final int i10) {
        charSequence.getClass();
        if (i10 >= 0 && i10 <= charSequence.length()) {
            return AbstractC7291q.m28887o(new InterfaceC0173a() { // from class: ub.m
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return C8632n.m33209a(this.f28699q, charSequence, i10);
                }
            }, c.f28707y);
        }
        C8630l.m33208a("Start index out of bounds: ", i10, ", input length: ", charSequence.length());
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final String m33214f() {
        String strPattern = this.f28703q.pattern();
        strPattern.getClass();
        return strPattern;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC8626i m33215g(CharSequence charSequence, int i10) {
        charSequence.getClass();
        Matcher matcherRegion = this.f28703q.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i10, charSequence.length());
        if (matcherRegion.lookingAt()) {
            return new C8628j(matcherRegion, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC8626i m33216h(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.f28703q.matcher(charSequence);
        matcher.getClass();
        return AbstractC8633o.m33229f(matcher, charSequence);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m33217i(CharSequence charSequence) {
        charSequence.getClass();
        return this.f28703q.matcher(charSequence).matches();
    }

    /* JADX INFO: renamed from: j */
    public final String m33218j(CharSequence charSequence, InterfaceC0184l interfaceC0184l) {
        charSequence.getClass();
        interfaceC0184l.getClass();
        int iIntValue = 0;
        InterfaceC8626i interfaceC8626iM33210c = m33210c(this, charSequence, 0, 2, null);
        if (interfaceC8626iM33210c == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(charSequence, iIntValue, interfaceC8626iM33210c.mo33184d().m8568v().intValue());
            sb2.append((CharSequence) interfaceC0184l.mo27m(interfaceC8626iM33210c));
            iIntValue = interfaceC8626iM33210c.mo33184d().m8567u().intValue() + 1;
            interfaceC8626iM33210c = interfaceC8626iM33210c.next();
            if (iIntValue >= length) {
                break;
            }
        } while (interfaceC8626iM33210c != null);
        if (iIntValue < length) {
            sb2.append(charSequence, iIntValue, length);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: k */
    public final String m33219k(CharSequence charSequence, String str) {
        charSequence.getClass();
        str.getClass();
        String strReplaceAll = this.f28703q.matcher(charSequence).replaceAll(str);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    /* JADX INFO: renamed from: l */
    public final List m33220l(CharSequence charSequence, int i10) {
        charSequence.getClass();
        AbstractC8621f0.m33107N0(i10);
        Matcher matcher = this.f28703q.matcher(charSequence);
        if (i10 == 1 || !matcher.find()) {
            return AbstractC5112w.m20789e(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? AbstractC2368o.m8582i(i10, 10) : 10);
        int i11 = i10 - 1;
        int iEnd = 0;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i11 >= 0 && arrayList.size() == i11) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String string = this.f28703q.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: ub.n$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: s */
        public static final a f28704s = new a(null);
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: q */
        public final String f28705q;

        /* JADX INFO: renamed from: r */
        public final int f28706r;

        public b(String str, int i10) {
            str.getClass();
            this.f28705q = str;
            this.f28706r = i10;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f28705q, this.f28706r);
            patternCompile.getClass();
            return new C8632n(patternCompile);
        }

        /* JADX INFO: renamed from: ub.n$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a {
            public /* synthetic */ a(AbstractC1043k abstractC1043k) {
                this();
            }

            public a() {
            }
        }
    }

    /* JADX INFO: renamed from: ub.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final int m33222b(int i10) {
            return (i10 & 2) != 0 ? i10 | 64 : i10;
        }

        public a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8632n(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this(patternCompile);
    }

    public C8632n(Pattern pattern) {
        pattern.getClass();
        this.f28703q = pattern;
    }
}

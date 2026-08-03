package Yue;

import Yue.InterfaceC5957;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: Yue.ۥۡ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5958 implements InterfaceC5957 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final Matcher f1797;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final CharSequence f1798;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC0907 f14895;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public List<String> f14896;

    /* JADX INFO: renamed from: Yue.ۥۡ۟۟۟$ۥ */
    public static final class C0910 extends AbstractC2986<String> {
        public C0910() {
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return m18726((String) obj);
            }
            return false;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return m18724((String) obj);
            }
            return -1;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return m18725((String) obj);
            }
            return -1;
        }

        @Override // Yue.AbstractC2986, Yue.AbstractC2979
        /* JADX INFO: renamed from: ۥ */
        public int mo41() {
            return C5958.this.m18723().groupCount() + 1;
        }

        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // Yue.AbstractC2986, java.util.List
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public String get(int i) {
            String strGroup = C5958.this.m18723().group(i);
            return strGroup == null ? "" : strGroup;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public /* bridge */ int m18724(String str) {
            return super.indexOf(str);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public /* bridge */ int m18725(String str) {
            return super.lastIndexOf(str);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public /* bridge */ boolean m18726(String str) {
            return super.contains(str);
        }
    }

    public C5958(@InterfaceC6399 Matcher matcher, @InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(matcher, "matcher");
        C5499.m17103(charSequence, "input");
        this.f1797 = matcher;
        this.f1798 = charSequence;
        this.f14895 = new C0911();
    }

    @Override // Yue.InterfaceC5957
    @InterfaceC6399
    public C5458 getRange() {
        return C7082.m22078(m18723());
    }

    @Override // Yue.InterfaceC5957
    @InterfaceC6399
    public String getValue() {
        String strGroup = m18723().group();
        C5499.m17102(strGroup, "matchResult.group()");
        return strGroup;
    }

    @Override // Yue.InterfaceC5957
    @InterfaceC6489
    public InterfaceC5957 next() {
        int iEnd = m18723().end() + (m18723().end() == m18723().start() ? 1 : 0);
        if (iEnd > this.f1798.length()) {
            return null;
        }
        Matcher matcher = this.f1797.pattern().matcher(this.f1798);
        C5499.m17102(matcher, "matcher.pattern().matcher(input)");
        return C7082.m22075(matcher, iEnd, this.f1798);
    }

    @Override // Yue.InterfaceC5957
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC5957.C0909 mo2617() {
        return InterfaceC5957.C0908.m2619(this);
    }

    @Override // Yue.InterfaceC5957
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public List<String> mo2618() {
        if (this.f14896 == null) {
            this.f14896 = new C0910();
        }
        List<String> list = this.f14896;
        C5499.m17100(list);
        return list;
    }

    @Override // Yue.InterfaceC5957
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ */
    public InterfaceC0907 mo18711() {
        return this.f14895;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final MatchResult m18723() {
        return this.f1797;
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۟۟۟$ۥ۟ */
    public static final class C0911 extends AbstractC2979<C5955> implements InterfaceC5956 {

        /* JADX INFO: renamed from: Yue.ۥۡ۟۟۟$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C5959 extends AbstractC5673 implements InterfaceC5124<Integer, C5955> {
            public C5959() {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // Yue.InterfaceC5124
            public /* bridge */ /* synthetic */ C5955 invoke(Integer num) {
                return m18727(num.intValue());
            }

            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final C5955 m18727(int i) {
                return C0911.this.get(i);
            }
        }

        public C0911() {
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof C5955) {
                return m2623((C5955) obj);
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // Yue.InterfaceC0907
        @InterfaceC6489
        public C5955 get(int i) {
            C5458 c5458M22079 = C7082.m22079(C5958.this.m18723(), i);
            if (c5458M22079.mo830().intValue() < 0) {
                return null;
            }
            String strGroup = C5958.this.m18723().group(i);
            C5499.m17102(strGroup, "matchResult.group(index)");
            return new C5955(strGroup, c5458M22079);
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // Yue.AbstractC2979, java.util.Collection, java.lang.Iterable
        @InterfaceC6399
        public Iterator<C5955> iterator() {
            return C7342.m22985(C3888.m10833(C3880.m10736(this)), new C5959()).iterator();
        }

        @Override // Yue.AbstractC2979
        /* JADX INFO: renamed from: ۥ */
        public int mo41() {
            return C5958.this.m18723().groupCount() + 1;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public /* bridge */ boolean m2623(C5955 c5955) {
            return super.contains(c5955);
        }

        @Override // Yue.InterfaceC5956
        @InterfaceC6489
        public C5955 get(@InterfaceC6399 String str) {
            C5499.m17103(str, "name");
            return C6671.f2230.mo17151(C5958.this.m18723(), str);
        }
    }
}

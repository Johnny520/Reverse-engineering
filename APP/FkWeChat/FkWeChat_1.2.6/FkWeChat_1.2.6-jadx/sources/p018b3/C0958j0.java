package p018b3;

import p024b9.AbstractC1043k;
import p030c3.AbstractC1314a;

/* JADX INFO: renamed from: b3.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0958j0 {

    /* JADX INFO: renamed from: e */
    public static final a f2940e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f2941f = 8;

    /* JADX INFO: renamed from: a */
    public String f2942a;

    /* JADX INFO: renamed from: b */
    public C0969p f2943b;

    /* JADX INFO: renamed from: c */
    public int f2944c = -1;

    /* JADX INFO: renamed from: d */
    public int f2945d = -1;

    public C0958j0(String str) {
        this.f2942a = str;
    }

    /* JADX INFO: renamed from: a */
    public final char m3486a(int i10) {
        C0969p c0969p = this.f2943b;
        if (c0969p == null) {
            return this.f2942a.charAt(i10);
        }
        if (i10 < this.f2944c) {
            return this.f2942a.charAt(i10);
        }
        int iM3534e = c0969p.m3534e();
        int i11 = this.f2944c;
        return i10 < iM3534e + i11 ? c0969p.m3533d(i10 - i11) : this.f2942a.charAt(i10 - ((iM3534e - this.f2945d) + i11));
    }

    /* JADX INFO: renamed from: b */
    public final int m3487b() {
        C0969p c0969p = this.f2943b;
        String str = this.f2942a;
        return c0969p == null ? str.length() : (str.length() - (this.f2945d - this.f2944c)) + c0969p.m3534e();
    }

    /* JADX INFO: renamed from: c */
    public final void m3488c(int i10, int i11, String str) {
        if (!(i10 <= i11)) {
            AbstractC1314a.m5291a("start index must be less than or equal to end index: " + i10 + " > " + i11);
        }
        if (!(i10 >= 0)) {
            AbstractC1314a.m5291a("start must be non-negative, but was " + i10);
        }
        C0969p c0969p = this.f2943b;
        if (c0969p != null) {
            int i12 = this.f2944c;
            int i13 = i10 - i12;
            int i14 = i11 - i12;
            if (i13 >= 0 && i14 <= c0969p.m3534e()) {
                c0969p.m3536g(i13, i14, str);
                return;
            }
            this.f2942a = toString();
            this.f2943b = null;
            this.f2944c = -1;
            this.f2945d = -1;
            m3488c(i10, i11, str);
            return;
        }
        int iMax = Math.max(255, str.length() + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i10, 64);
        int iMin2 = Math.min(this.f2942a.length() - i11, 64);
        int i15 = i10 - iMin;
        AbstractC0973r.m3541a(this.f2942a, cArr, 0, i15, i10);
        int i16 = iMax - iMin2;
        int i17 = iMin2 + i11;
        AbstractC0973r.m3541a(this.f2942a, cArr, i16, i11, i17);
        AbstractC0971q.m3540b(str, cArr, iMin);
        this.f2943b = new C0969p(cArr, iMin + str.length(), i16);
        this.f2944c = i15;
        this.f2945d = i17;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public String toString() {
        C0969p c0969p = this.f2943b;
        String str = this.f2942a;
        if (c0969p == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str, 0, this.f2944c);
        c0969p.m3530a(sb2);
        String str2 = this.f2942a;
        sb2.append((CharSequence) str2, this.f2945d, str2.length());
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b3.j0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}

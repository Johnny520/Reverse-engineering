package me;

import be.C1116d;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p175le.C4752a;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: me.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5164c {

    /* JADX INFO: renamed from: a */
    public final CharSequence f15762a;

    /* JADX INFO: renamed from: b */
    public final List f15763b;

    /* JADX INFO: renamed from: c */
    public final a f15764c;

    /* JADX INFO: renamed from: me.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a {

        /* JADX INFO: renamed from: a */
        public final int f15765a;

        /* JADX INFO: renamed from: b */
        public final int f15766b;

        /* JADX INFO: renamed from: c */
        public final int f15767c;

        /* JADX INFO: renamed from: d */
        public final String f15768d;

        public a(int i10, int i11, int i12) {
            this.f15765a = i10;
            this.f15766b = i11;
            this.f15767c = i12;
            String str = (String) C5164c.this.f15763b.get(i10);
            this.f15768d = str;
            C4752a c4752a = C4752a.f14072a;
            if (!(i11 >= -1 && i11 < str.length())) {
                throw new C1116d(_UrlKt.FRAGMENT_ENCODE_SET);
            }
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ a m21183n(a aVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return aVar.m21196m(i10);
        }

        /* JADX INFO: renamed from: a */
        public final Integer m21184a() {
            String str = this.f15768d;
            for (int iMax = Math.max(this.f15766b, 0); iMax < str.length(); iMax++) {
                char cCharAt = str.charAt(iMax);
                if (cCharAt != ' ' && cCharAt != '\t') {
                    return Integer.valueOf(iMax - this.f15766b);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final char m21185b() {
            return C5164c.this.f15762a.charAt(this.f15767c);
        }

        /* JADX INFO: renamed from: c */
        public final String m21186c() {
            return this.f15768d;
        }

        /* JADX INFO: renamed from: d */
        public final CharSequence m21187d() {
            return this.f15768d.substring(m21192i());
        }

        /* JADX INFO: renamed from: e */
        public final String m21188e() {
            if (this.f15765a + 1 < C5164c.this.f15763b.size()) {
                return (String) C5164c.this.f15763b.get(this.f15765a + 1);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && obj.getClass() == a.class && this.f15767c == ((a) obj).f15767c;
        }

        /* JADX INFO: renamed from: f */
        public final Integer m21189f() {
            if (this.f15765a + 1 < C5164c.this.f15763b.size()) {
                return Integer.valueOf(this.f15767c + (this.f15768d.length() - this.f15766b));
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public final int m21190g() {
            return this.f15767c + (this.f15768d.length() - this.f15766b);
        }

        /* JADX INFO: renamed from: h */
        public final int m21191h() {
            return this.f15767c;
        }

        public int hashCode() {
            return this.f15767c;
        }

        /* JADX INFO: renamed from: i */
        public final int m21192i() {
            return this.f15766b;
        }

        /* JADX INFO: renamed from: j */
        public final CharSequence m21193j() {
            return C5164c.this.f15762a;
        }

        /* JADX INFO: renamed from: k */
        public final String m21194k() {
            if (this.f15765a > 0) {
                return (String) C5164c.this.f15763b.get(this.f15765a - 1);
            }
            return null;
        }

        /* JADX INFO: renamed from: l */
        public final a m21195l() {
            Integer numM21189f = m21189f();
            if (numM21189f != null) {
                return m21196m(numM21189f.intValue() - m21191h());
            }
            return null;
        }

        /* JADX INFO: renamed from: m */
        public final a m21196m(int i10) {
            a aVar = this;
            while (i10 != 0) {
                if (aVar.f15766b + i10 < aVar.f15768d.length()) {
                    return C5164c.this.new a(aVar.f15765a, aVar.f15766b + i10, aVar.f15767c + i10);
                }
                if (aVar.m21189f() == null) {
                    return null;
                }
                int length = aVar.f15768d.length() - aVar.f15766b;
                i10 -= length;
                aVar = C5164c.this.new a(aVar.f15765a + 1, -1, aVar.f15767c + length);
            }
            return aVar;
        }

        public String toString() {
            String strSubstring;
            StringBuilder sb2 = new StringBuilder("Position: '");
            int i10 = this.f15766b;
            String str = this.f15768d;
            if (i10 == -1) {
                strSubstring = "\\n" + str;
            } else {
                strSubstring = str.substring(i10);
            }
            sb2.append(strSubstring);
            sb2.append('\'');
            return sb2.toString();
        }
    }

    public C5164c(CharSequence charSequence) {
        charSequence.getClass();
        this.f15762a = charSequence;
        this.f15763b = AbstractC8621f0.m33111R0(charSequence, new char[]{'\n'}, false, 0, 6, null);
        this.f15764c = charSequence.length() > 0 ? a.m21183n(new a(0, -1, -1), 0, 1, null) : null;
    }

    /* JADX INFO: renamed from: c */
    public final a m21182c() {
        return this.f15764c;
    }
}

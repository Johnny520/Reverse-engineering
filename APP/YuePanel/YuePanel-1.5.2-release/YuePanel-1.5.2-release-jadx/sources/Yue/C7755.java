package Yue;

import Yue.C4483;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥۢۡ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7755 extends AbstractC5693 {
    public C7755(String str) {
        this.f14015 = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static C7755 m24627(String str) {
        return new C7755(C4645.m13974(str));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static boolean m24628(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static String m24629(String str) {
        return C7615.m23822(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static String m24630(String str) {
        return str.replaceFirst("^\\s+", "");
    }

    @Override // Yue.AbstractC6381
    public String toString() {
        return mo12982();
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public String mo9885() {
        return "#text";
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public void mo9886(Appendable appendable, int i, C4483.C0414 c0414) throws IOException {
        boolean z;
        boolean z2;
        boolean zM13027 = c0414.m13027();
        AbstractC6381 abstractC6381 = this.f16148;
        C4605 c4605 = abstractC6381 instanceof C4605 ? (C4605) abstractC6381 : null;
        boolean z3 = zM13027 && !C4605.m13680(abstractC6381);
        boolean z4 = c4605 != null && (c4605.m13813().m24550() || c4605.m13813().m24548());
        if (z3) {
            boolean z5 = (z4 && this.f16149 == 0) || (this.f16148 instanceof C4483);
            boolean z6 = z4 && m19914() == null;
            AbstractC6381 abstractC6381M19914 = m19914();
            AbstractC6381 abstractC6381M19922 = m19922();
            boolean zM24632 = m24632();
            if ((((abstractC6381M19914 instanceof C4605) && ((C4605) abstractC6381M19914).m13810(c0414)) || (((abstractC6381M19914 instanceof C7755) && ((C7755) abstractC6381M19914).m24632()) || ((abstractC6381M19922 instanceof C4605) && (((C4605) abstractC6381M19922).m13781() || abstractC6381M19922.m19913("br"))))) && zM24632) {
                return;
            }
            if ((abstractC6381M19922 == null && c4605 != null && c4605.m13813().m24548() && !zM24632) || ((c0414.m13024() && m19932().size() > 0 && !zM24632) || (abstractC6381M19922 != null && abstractC6381M19922.m19913("br")))) {
                m19910(appendable, i, c0414);
            }
            z = z5;
            z2 = z6;
        } else {
            z = false;
            z2 = false;
        }
        C4645.m13969(appendable, m17596(), c0414, false, z3, z, z2);
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo9887(Appendable appendable, int i, C4483.C0414 c0414) throws IOException {
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡ۟()LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: merged with bridge method [inline-methods] */
    public C7755 mo12984() {
        return (C7755) super.mo12984();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public String m24631() {
        return m17596();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public boolean m24632() {
        return C7615.m23815(m17596());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public C7755 m24633(int i) {
        String strM17596 = m17596();
        C8159.m26904(i >= 0, "Split offset must be not be negative");
        C8159.m26904(i < strM17596.length(), "Split offset must not be greater than current text length");
        String strSubstring = strM17596.substring(0, i);
        String strSubstring2 = strM17596.substring(i);
        m24634(strSubstring);
        C7755 c7755 = new C7755(strSubstring2);
        AbstractC6381 abstractC6381 = this.f16148;
        if (abstractC6381 != null) {
            abstractC6381.m19898(m19931() + 1, c7755);
        }
        return c7755;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public C7755 m24634(String str) {
        m17597(str);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ */
    public String mo9889() {
        return C7615.m23822(m24631());
    }
}

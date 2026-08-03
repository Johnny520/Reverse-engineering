package Yue;

import Yue.C4483;
import java.io.IOException;
import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3929 extends AbstractC5693 {
    public C3929(String str) {
        this.f14015 = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static boolean m11192(String str) {
        return str.length() > 1 && (str.startsWith("!") || str.startsWith(TypeDescription.Generic.OfWildcardType.SYMBOL));
    }

    @Override // Yue.AbstractC6381
    public String toString() {
        return mo12982();
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public String mo9885() {
        return "#comment";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo9886(Appendable appendable, int i, C4483.C0414 c0414) throws IOException {
        if (c0414.m13027()) {
            if (m19911()) {
                AbstractC6381 abstractC6381 = this.f16148;
                if (!(abstractC6381 instanceof C4605) || !((C4605) abstractC6381).m13813().m24548()) {
                    if (c0414.m13024()) {
                        m19910(appendable, i, c0414);
                    }
                }
            }
        }
        appendable.append("<!--").append(m11195()).append("-->");
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo9887(Appendable appendable, int i, C4483.C0414 c0414) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public C8566 m11193() {
        String strM11195 = m11195();
        String strSubstring = strM11195.substring(1, strM11195.length() - 1);
        if (m11192(strSubstring)) {
            return null;
        }
        C4483 c4483M21010 = C6617.m20995().m21015(C6616.f16979).m21010("<" + strSubstring + ">", mo13686());
        if (c4483M21010.m12987().m13724() <= 0) {
            return null;
        }
        C4605 c4605M13721 = c4483M21010.m12987().m13721(0);
        C8566 c8566 = new C8566(C6386.m2838(c4483M21010).m21014().m20992(c4605M13721.m13816()), strM11195.startsWith("!"));
        c8566.mo13685().m9187(c4605M13721.mo13685());
        return c8566;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡ۟()LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C3929 mo12984() {
        return (C3929) super.mo12984();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public String m11195() {
        return m17596();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public boolean m11196() {
        return m11192(m11195());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public C3929 m11197(String str) {
        m17597(str);
        return this;
    }
}

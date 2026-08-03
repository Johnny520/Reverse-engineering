package Yue;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣۡۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6617 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f16980 = "http://www.w3.org/1999/xhtml";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f16981 = "http://www.w3.org/XML/1998/namespace";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f16982 = "http://www.w3.org/1998/Math/MathML";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f16983 = "http://www.w3.org/2000/svg";

    /* JADX INFO: renamed from: ۥ */
    public AbstractC7998 f2178;

    /* JADX INFO: renamed from: ۥ۟ */
    public C6614 f2179;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C6616 f16984;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f16985;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6617(AbstractC7998 abstractC7998) {
        this.f16985 = false;
        this.f2178 = abstractC7998;
        this.f16984 = abstractC7998.mo16354();
        this.f2179 = C6614.m20987();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C6617 m20995() {
        return new C6617(new C5321());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static C4483 m20996(String str, String str2) {
        C5321 c5321 = new C5321();
        return c5321.m25208(new StringReader(str), str2, new C6617(c5321));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static C4483 m20997(String str, String str2) {
        C4483 c4483M12981 = C4483.m12981(str2);
        C4605 c4605M12987 = c4483M12981.m12987();
        List<AbstractC6381> listM20998 = m20998(str, c4605M12987, str2);
        AbstractC6381[] abstractC6381Arr = (AbstractC6381[]) listM20998.toArray(new AbstractC6381[0]);
        for (int length = abstractC6381Arr.length - 1; length > 0; length--) {
            abstractC6381Arr[length].m19924();
        }
        for (AbstractC6381 abstractC6381 : abstractC6381Arr) {
            c4605M12987.m13710(abstractC6381);
        }
        return c4483M12981;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static List<AbstractC6381> m20998(String str, C4605 c4605, String str2) {
        C5321 c5321 = new C5321();
        return c5321.mo16358(str, c4605, str2, new C6617(c5321));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static List<AbstractC6381> m20999(String str, C4605 c4605, String str2, C6614 c6614) {
        C5321 c5321 = new C5321();
        C6617 c6617 = new C6617(c5321);
        c6617.f2179 = c6614;
        return c5321.mo16358(str, c4605, str2, c6617);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static List<AbstractC6381> m21000(String str, String str2) {
        C8571 c8571 = new C8571();
        return c8571.m28553(str, str2, new C6617(c8571));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static String m21001(String str, boolean z) {
        C6617 c6617M20995 = m20995();
        c6617M20995.f2178.mo16355(new StringReader(str), "", c6617M20995);
        return new C7865(c6617M20995.f2178).m25026(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static C6617 m21002() {
        return new C6617(new C8571());
    }

    /* JADX INFO: renamed from: ۥ */
    public String m3084() {
        return m21003().mo25203();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public C6614 m3085() {
        return this.f2179;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public AbstractC7998 m21003() {
        return this.f2178;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m21004(String str) {
        return m21003().mo16356(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m21005() {
        return this.f2179.m20990() > 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m21006() {
        return this.f16985;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C6617 m21007() {
        return new C6617(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public List<AbstractC6381> m21008(String str, C4605 c4605, String str2) {
        return this.f2178.mo16358(str, c4605, str2, this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public C4483 m21009(Reader reader, String str) {
        return this.f2178.m25208(reader, str, this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public C4483 m21010(String str, String str2) {
        return this.f2178.m25208(new StringReader(str), str2, this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C6617 m21011(int i) {
        this.f2179 = i > 0 ? C6614.m20988(i) : C6614.m20987();
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public C6617 m21012(boolean z) {
        this.f16985 = z;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public C6617 m21013(AbstractC7998 abstractC7998) {
        this.f2178 = abstractC7998;
        abstractC7998.f3183 = this;
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C6616 m21014() {
        return this.f16984;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public C6617 m21015(C6616 c6616) {
        this.f16984 = c6616;
        return this;
    }

    public C6617(C6617 c6617) {
        this.f16985 = false;
        this.f2178 = c6617.f2178.mo16357();
        this.f2179 = new C6614(c6617.f2179);
        this.f16984 = new C6616(c6617.f16984);
        this.f16985 = c6617.f16985;
    }
}

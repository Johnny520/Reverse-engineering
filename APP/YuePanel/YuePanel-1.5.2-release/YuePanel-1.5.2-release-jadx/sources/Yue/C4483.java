package Yue;

import Yue.AbstractC4662;
import Yue.C4645;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4483 extends C4605 {

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final AbstractC4662 f9412 = new AbstractC4662.C4700(C6468.f16546);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public InterfaceC4103 f9413;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public C0414 f9414;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public C6617 f9415;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public EnumC0415 f9416;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final String f9417;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f9418;

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۧۥ$ۥ */
    public static class C0414 implements Cloneable {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Charset f9420;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public C4645.EnumC0462 f9421;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public C4645.EnumC4646 f9419 = C4645.EnumC4646.base;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final ThreadLocal<CharsetEncoder> f9422 = new ThreadLocal<>();

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public boolean f9423 = true;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public boolean f9424 = false;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public int f9425 = 1;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public int f9426 = 30;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public EnumC4484 f9427 = EnumC4484.html;

        /* JADX INFO: renamed from: Yue.ۥ۠۟ۧۥ$ۥ$ۥ, reason: contains not printable characters */
        public enum EnumC4484 {
            html,
            xml
        }

        public C0414() {
            m13013(C4300.f801);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C0414 m13012(String str) {
            m13013(Charset.forName(str));
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C0414 m13013(Charset charset) {
            this.f9420 = charset;
            this.f9421 = C4645.EnumC0462.m13976(charset.name());
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Charset m13014() {
            return this.f9420;
        }

        /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C0414 clone() {
            try {
                C0414 c0414 = (C0414) super.clone();
                c0414.m13012(this.f9420.name());
                c0414.f9419 = C4645.EnumC4646.valueOf(this.f9419.name());
                return c0414;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public CharsetEncoder m13016() {
            CharsetEncoder charsetEncoder = this.f9422.get();
            return charsetEncoder != null ? charsetEncoder : m13025();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public C0414 m13017(C4645.EnumC4646 enumC4646) {
            this.f9419 = enumC4646;
            return this;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public C4645.EnumC4646 m13018() {
            return this.f9419;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public int m13019() {
            return this.f9425;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public C0414 m13020(int i) {
            C8159.m26903(i >= 0);
            this.f9425 = i;
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public int m13021() {
            return this.f9426;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public C0414 m13022(int i) {
            C8159.m26903(i >= -1);
            this.f9426 = i;
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public C0414 m13023(boolean z) {
            this.f9424 = z;
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public boolean m13024() {
            return this.f9424;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public CharsetEncoder m13025() {
            CharsetEncoder charsetEncoderNewEncoder = this.f9420.newEncoder();
            this.f9422.set(charsetEncoderNewEncoder);
            return charsetEncoderNewEncoder;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public C0414 m13026(boolean z) {
            this.f9423 = z;
            return this;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean m13027() {
            return this.f9423;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public EnumC4484 m13028() {
            return this.f9427;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public C0414 m13029(EnumC4484 enumC4484) {
            this.f9427 = enumC4484;
            if (enumC4484 == EnumC4484.xml) {
                m13017(C4645.EnumC4646.xhtml);
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۧۥ$ۥ۟ */
    public enum EnumC0415 {
        noQuirks,
        quirks,
        limitedQuirks
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4483(String str, String str2) {
        super(C7719.m24546("#root", str, C6616.f16978), str2);
        this.f9414 = new C0414();
        this.f9416 = EnumC0415.noQuirks;
        this.f9418 = false;
        this.f9417 = str2;
        this.f9415 = C6617.m20995();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۦ, reason: contains not printable characters */
    public static C4483 m12981(String str) {
        C8159.m26910(str);
        C4483 c4483 = new C4483(str);
        c4483.f9415 = c4483.m13004();
        C4605 c4605M13712 = c4483.m13712("html");
        c4605M13712.m13712("head");
        c4605M13712.m13712(C5905.f14739);
        return c4483;
    }

    @Override // Yue.C4605, Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public String mo9885() {
        return "#document";
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public String mo12982() {
        return super.m13774();
    }

    @Override // Yue.C4605
    /* JADX INFO: renamed from: ۥ۟۠ۧ۠, reason: contains not printable characters */
    public C4605 mo12986(String str) {
        m12987().mo12986(str);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨ۟, reason: contains not printable characters */
    public C4605 m12987() {
        C4605 c4605M12999 = m12999();
        for (C4605 c4605M13744 = c4605M12999.m13744(); c4605M13744 != null; c4605M13744 = c4605M13744.m13786()) {
            if (c4605M13744.m19913(C5905.f14739) || c4605M13744.m19913("frameset")) {
                return c4605M13744;
            }
        }
        return c4605M12999.m13712(C5905.f14739);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨ۠, reason: contains not printable characters */
    public Charset m12988() {
        return this.f9414.m13014();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۡ, reason: contains not printable characters */
    public void m12989(Charset charset) {
        m13010(true);
        this.f9414.m13013(charset);
        m12995();
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡ۟()LYue/ۥۣۡۢۤ; */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۨۤ()LYue/ۥ۠۠ۥۥ; */
    @Override // Yue.C4605
    /* JADX INFO: renamed from: ۥ۟۠ۨۢ, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C4483 mo9884() {
        C4483 c4483 = (C4483) super.mo9884();
        c4483.f9414 = this.f9414.clone();
        return c4483;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public InterfaceC4103 m12991() {
        InterfaceC4103 interfaceC4103 = this.f9413;
        return interfaceC4103 == null ? C5562.m17331() : interfaceC4103;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۤ, reason: contains not printable characters */
    public C4483 m12992(InterfaceC4103 interfaceC4103) {
        C8159.m26910(interfaceC4103);
        this.f9413 = interfaceC4103;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۥ, reason: contains not printable characters */
    public C4605 m12993(String str) {
        return new C4605(C7719.m24546(str, this.f9415.m3084(), C6616.f16979), mo13686());
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۧ, reason: contains not printable characters */
    public C4486 m12994() {
        for (AbstractC6381 abstractC6381 : this.f9886) {
            if (abstractC6381 instanceof C4486) {
                return (C4486) abstractC6381;
            }
            if (!(abstractC6381 instanceof AbstractC5693)) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۨ, reason: contains not printable characters */
    public final void m12995() {
        if (this.f9418) {
            C0414.EnumC4484 enumC4484M13028 = m13001().m13028();
            if (enumC4484M13028 == C0414.EnumC4484.html) {
                C4605 c4605M13807 = m13807("meta[charset]");
                if (c4605M13807 != null) {
                    c4605M13807.mo13684("charset", m12988().displayName());
                } else {
                    m12998().m13712("meta").mo13684("charset", m12988().displayName());
                }
                m13805("meta[name=charset]").m13863();
                return;
            }
            if (enumC4484M13028 == C0414.EnumC4484.xml) {
                AbstractC6381 abstractC6381 = mo13694().get(0);
                if (!(abstractC6381 instanceof C8566)) {
                    C8566 c8566 = new C8566(C8542.f3549, false);
                    c8566.mo13684("version", "1.0");
                    c8566.mo13684(C5368.f13122, m12988().displayName());
                    m13794(c8566);
                    return;
                }
                C8566 c85662 = (C8566) abstractC6381;
                if (c85662.m28537().equals(C8542.f3549)) {
                    c85662.mo13684(C5368.f13122, m12988().displayName());
                    if (c85662.mo17595("version")) {
                        c85662.mo13684("version", "1.0");
                        return;
                    }
                    return;
                }
                C8566 c85663 = new C8566(C8542.f3549, false);
                c85663.mo13684("version", "1.0");
                c85663.mo13684(C5368.f13122, m12988().displayName());
                m13794(c85663);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public C5063 m12996(String str) {
        for (C4605 c4605 : m13805(str)) {
            if (c4605 instanceof C5063) {
                return (C5063) c4605;
            }
        }
        C8159.m26900("No form elements matched the query '%s' in the document.", str);
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟, reason: contains not printable characters */
    public List<C5063> m12997() {
        return m13805("form").m13842();
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟۟, reason: contains not printable characters */
    public C4605 m12998() {
        C4605 c4605M12999 = m12999();
        for (C4605 c4605M13744 = c4605M12999.m13744(); c4605M13744 != null; c4605M13744 = c4605M13744.m13786()) {
            if (c4605M13744.m19913("head")) {
                return c4605M13744;
            }
        }
        return c4605M12999.m13796("head");
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟۠, reason: contains not printable characters */
    public final C4605 m12999() {
        for (C4605 c4605M13744 = m13744(); c4605M13744 != null; c4605M13744 = c4605M13744.m13786()) {
            if (c4605M13744.m19913("html")) {
                return c4605M13744;
            }
        }
        return m13712("html");
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟ۡ, reason: contains not printable characters */
    public String m13000() {
        return this.f9417;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟ۢ, reason: contains not printable characters */
    public C0414 m13001() {
        return this.f9414;
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡ۟, reason: contains not printable characters */
    public C4483 m13002(C0414 c0414) {
        C8159.m26910(c0414);
        this.f9414 = c0414;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟ۤ, reason: contains not printable characters */
    public C4483 m13003(C6617 c6617) {
        this.f9415 = c6617;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟ۥ, reason: contains not printable characters */
    public C6617 m13004() {
        return this.f9415;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟ۦ, reason: contains not printable characters */
    public EnumC0415 m13005() {
        return this.f9416;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟ۧ, reason: contains not printable characters */
    public C4483 m13006(EnumC0415 enumC0415) {
        this.f9416 = enumC0415;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۥ۠()LYue/ۥۣۡۢۤ; */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟۠ۦۣ()LYue/ۥ۠۠ۥۥ; */
    @Override // Yue.C4605
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۨ, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C4483 mo12985() {
        C4483 c4483 = new C4483(m13813().m24557(), mo13686());
        C3456 c3456 = this.f9887;
        if (c3456 != null) {
            c4483.f9887 = c3456.clone();
        }
        c4483.f9414 = this.f9414.clone();
        return c4483;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠, reason: contains not printable characters */
    public String m13008() {
        C4605 c4605M13806 = m12998().m13806(f9412);
        return c4605M13806 != null ? C7615.m23822(c4605M13806.m13817()).trim() : "";
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠۟, reason: contains not printable characters */
    public void m13009(String str) {
        C8159.m26910(str);
        C4605 c4605M13806 = m12998().m13806(f9412);
        if (c4605M13806 == null) {
            c4605M13806 = m12998().m13712(C6468.f16546);
        }
        c4605M13806.mo12986(str);
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠۠, reason: contains not printable characters */
    public void m13010(boolean z) {
        this.f9418 = z;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۡ, reason: contains not printable characters */
    public boolean m13011() {
        return this.f9418;
    }

    public C4483(String str) {
        this(C6617.f16980, str);
    }
}

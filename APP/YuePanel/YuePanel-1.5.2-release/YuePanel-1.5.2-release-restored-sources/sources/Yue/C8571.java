package Yue;

import Yue.AbstractC7853;
import Yue.C4483;
import Yue.C4645;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢۦۣۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C8571 extends AbstractC7998 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f25434 = 256;

    /* JADX INFO: renamed from: Yue.ۥۢۦۣۡ$ۥ */
    public static /* synthetic */ class C1550 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f3558;

        static {
            int[] iArr = new int[AbstractC7853.EnumC7861.values().length];
            f3558 = iArr;
            try {
                iArr[AbstractC7853.EnumC7861.StartTag.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3558[AbstractC7853.EnumC7861.EndTag.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3558[AbstractC7853.EnumC7861.Comment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3558[AbstractC7853.EnumC7861.Character.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3558[AbstractC7853.EnumC7861.Doctype.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3558[AbstractC7853.EnumC7861.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // Yue.AbstractC7998
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public String mo25203() {
        return "http://www.w3.org/XML/1998/namespace";
    }

    @Override // Yue.AbstractC7998
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public C6616 mo16354() {
        return C6616.f16979;
    }

    @Override // Yue.AbstractC7998
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo16355(Reader reader, String str, C6617 c6617) {
        super.mo16355(reader, str, c6617);
        this.f23780.add(this.f23779);
        this.f23779.m13001().m13029(C4483.C0414.EnumC4484.xml).m13017(C4645.EnumC4646.xhtml).m13026(false);
    }

    @Override // Yue.AbstractC7998
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public List<AbstractC6381> mo16358(String str, C4605 c4605, String str2, C6617 c6617) {
        return m28553(str, str2, c6617);
    }

    @Override // Yue.AbstractC7998
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public boolean mo16359(AbstractC7853 abstractC7853) {
        this.f23782 = abstractC7853;
        switch (C1550.f3558[abstractC7853.f23476.ordinal()]) {
            case 1:
                m28546(abstractC7853.m24925());
                break;
            case 2:
                m28554(abstractC7853.m24924());
                break;
            case 3:
                m28544(abstractC7853.m24922());
                break;
            case 4:
                m28543(abstractC7853.m24921());
                break;
            case 5:
                m28545(abstractC7853.m24923());
                break;
            case 6:
                break;
            default:
                C8159.m26899("Unexpected token type: " + abstractC7853.f23476);
                break;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m28543(AbstractC7853.C7854 c7854) {
        String strM24941 = c7854.m24941();
        m28547(c7854.m24928() ? new C3632(strM24941) : new C7755(strM24941));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m28544(AbstractC7853.C7855 c7855) {
        C8566 c8566M11193;
        C3929 c3929 = new C3929(c7855.m24945());
        if (c7855.f23482 && c3929.m11196() && (c8566M11193 = c3929.m11193()) != null) {
            c3929 = c8566M11193;
        }
        m28547(c3929);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public void m28545(AbstractC7853.C7856 c7856) {
        C4486 c4486 = new C4486(this.f23783.m20992(c7856.m24946()), c7856.m24948(), c7856.m24949());
        c4486.m13053(c7856.m24947());
        m28547(c4486);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m28546(AbstractC7853.C7859 c7859) {
        C7719 c7719M25215 = m25215(c7859.m24968(), this.f23783);
        C3456 c3456 = c7859.f23493;
        if (c3456 != null) {
            c3456.m9194(this.f23783);
        }
        C4605 c4605 = new C4605(c7719M25215, null, this.f23783.m20991(c7859.f23493));
        m4009().m13710(c4605);
        m25213(c4605);
        if (c7859.m24966()) {
            c7719M25215.m24560();
            m25209();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m28547(AbstractC5693 abstractC5693) {
        m4009().m13710(abstractC5693);
        m25207(abstractC5693);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m28548(AbstractC6381 abstractC6381) {
        m4009().m13710(abstractC6381);
        m25207(abstractC6381);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m28549(AbstractC6381 abstractC6381, AbstractC7853 abstractC7853) {
        m4009().m13710(abstractC6381);
        m25207(abstractC6381);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟ۤ()LYue/ۥۢۢۡۧ; */
    @Override // Yue.AbstractC7998
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C8571 mo16357() {
        return new C8571();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public C4483 m28551(Reader reader, String str) {
        return m25208(reader, str, new C6617(this));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public C4483 m28552(String str, String str2) {
        return m25208(new StringReader(str), str2, new C6617(this));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public List<AbstractC6381> m28553(String str, String str2, C6617 c6617) {
        mo16355(new StringReader(str), str2, c6617);
        m25214();
        return this.f23779.m19903();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void m28554(AbstractC7853.C7858 c7858) {
        C4605 c4605;
        String strM20992 = this.f23783.m20992(c7858.f23490);
        int size = this.f23780.size();
        int i = size + (-1) >= 256 ? size - 257 : 0;
        int size2 = this.f23780.size() - 1;
        while (true) {
            if (size2 < i) {
                c4605 = null;
                break;
            }
            c4605 = this.f23780.get(size2);
            if (c4605.mo9885().equals(strM20992)) {
                break;
            } else {
                size2--;
            }
        }
        if (c4605 == null) {
            return;
        }
        for (int size3 = this.f23780.size() - 1; size3 >= 0 && m25209() != c4605; size3--) {
        }
    }
}

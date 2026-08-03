package Yue;

import Yue.AbstractC7853;
import Yue.C7003;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۢۢۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7998 {

    /* JADX INFO: renamed from: ۥ */
    public C6617 f3183;

    /* JADX INFO: renamed from: ۥ۟ */
    public C3787 f3184;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C7865 f23778;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C4483 f23779;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public ArrayList<C4605> f23780;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public String f23781;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public AbstractC7853 f23782;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C6616 f23783;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Map<String, C7719> f23784;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public AbstractC7853.C7859 f23785;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final AbstractC7853.C7858 f23786 = new AbstractC7853.C7858(this);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean f23787;

    /* JADX INFO: renamed from: ۥ */
    public C4605 m4009() {
        int size = this.f23780.size();
        return size > 0 ? this.f23780.get(size - 1) : this.f23779;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m4010(String str) {
        C4605 c4605M4009;
        return this.f23780.size() != 0 && (c4605M4009 = m4009()) != null && c4605M4009.mo13700().equals(str) && c4605M4009.m13813().m24557().equals(C6617.f16980);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m25202(String str, String str2) {
        C4605 c4605M4009;
        return this.f23780.size() != 0 && (c4605M4009 = m4009()) != null && c4605M4009.mo13700().equals(str) && c4605M4009.m13813().m24557().equals(str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String mo25203() {
        return C6617.f16980;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public abstract C6616 mo16354();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m25204(String str) {
        m25205(str, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m25205(String str, Object... objArr) {
        C6614 c6614M3085 = this.f3183.m3085();
        if (c6614M3085.m20989()) {
            c6614M3085.add(new C6613(this.f3184, str, objArr));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo16355(Reader reader, String str, C6617 c6617) {
        C8159.m26912(reader, "input");
        C8159.m26912(str, "baseUri");
        C8159.m26910(c6617);
        C4483 c4483 = new C4483(c6617.m3084(), str);
        this.f23779 = c4483;
        c4483.m13003(c6617);
        this.f3183 = c6617;
        this.f23783 = c6617.m21014();
        this.f3184 = new C3787(reader);
        this.f23787 = c6617.m21006();
        this.f3184.m10438(c6617.m21005() || this.f23787);
        this.f23778 = new C7865(this);
        this.f23780 = new ArrayList<>(32);
        this.f23784 = new HashMap();
        AbstractC7853.C7859 c7859 = new AbstractC7853.C7859(this);
        this.f23785 = c7859;
        this.f23782 = c7859;
        this.f23781 = str;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public boolean mo16356(String str) {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public abstract AbstractC7998 mo16357();

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m25206(AbstractC6381 abstractC6381) {
        m25217(abstractC6381, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m25207(AbstractC6381 abstractC6381) {
        m25217(abstractC6381, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public C4483 m25208(Reader reader, String str, C6617 c6617) {
        mo16355(reader, str, c6617);
        m25214();
        this.f3184.m10394();
        this.f3184 = null;
        this.f23778 = null;
        this.f23780 = null;
        this.f23784 = null;
        return this.f23779;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public abstract List<AbstractC6381> mo16358(String str, C4605 c4605, String str2, C6617 c6617);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final C4605 m25209() {
        C4605 c4605Remove = this.f23780.remove(this.f23780.size() - 1);
        m25206(c4605Remove);
        return c4605Remove;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public abstract boolean mo16359(AbstractC7853 abstractC7853);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean m25210(String str) {
        AbstractC7853 abstractC7853 = this.f23782;
        AbstractC7853.C7858 c7858 = this.f23786;
        return abstractC7853 == c7858 ? mo16359(new AbstractC7853.C7858(this).m24967(str)) : mo16359(c7858.mo24935().m24967(str));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m25211(String str) {
        AbstractC7853.C7859 c7859 = this.f23785;
        return this.f23782 == c7859 ? mo16359(new AbstractC7853.C7859(this).m24967(str)) : mo16359(c7859.mo24935().m24967(str));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean m25212(String str, C3456 c3456) {
        AbstractC7853.C7859 c7859 = this.f23785;
        if (this.f23782 == c7859) {
            return mo16359(new AbstractC7853.C7859(this).m24952(str, c3456));
        }
        c7859.mo24935();
        c7859.m24952(str, c3456);
        return mo16359(c7859);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m25213(C4605 c4605) {
        this.f23780.add(c4605);
        m25207(c4605);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m25214() {
        C7865 c7865 = this.f23778;
        AbstractC7853.EnumC7861 enumC7861 = AbstractC7853.EnumC7861.EOF;
        while (true) {
            AbstractC7853 abstractC7853M25024 = c7865.m25024();
            this.f23782 = abstractC7853M25024;
            mo16359(abstractC7853M25024);
            if (abstractC7853M25024.f23476 == enumC7861) {
                break;
            } else {
                abstractC7853M25024.mo24935();
            }
        }
        while (!this.f23780.isEmpty()) {
            m25209();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C7719 m25215(String str, C6616 c6616) {
        return m25216(str, mo25203(), c6616);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public C7719 m25216(String str, String str2, C6616 c6616) {
        C7719 c7719 = this.f23784.get(str);
        if (c7719 != null && c7719.m24557().equals(str2)) {
            return c7719;
        }
        C7719 c7719M24546 = C7719.m24546(str, str2, c6616);
        this.f23784.put(str, c7719M24546);
        return c7719M24546;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m25217(AbstractC6381 abstractC6381, boolean z) {
        if (this.f23787) {
            AbstractC7853 abstractC7853 = this.f23782;
            int iM24936 = abstractC7853.m24936();
            int iM24926 = abstractC7853.m24926();
            if (abstractC6381 instanceof C4605) {
                C4605 c4605 = (C4605) abstractC6381;
                if (abstractC7853.m24932()) {
                    if (c4605.m13740().m21632()) {
                        return;
                    } else {
                        iM24936 = this.f3184.m10432();
                    }
                } else if (!z ? !(c4605.m13813().m24551() || c4605.m13813().m24556() || (abstractC7853.m24933() && c4605.mo13700().equals(abstractC7853.m24924().f23491))) : !(abstractC7853.m24934() && c4605.mo13700().equals(abstractC7853.m24925().f23491))) {
                }
                iM24926 = iM24936;
            }
            abstractC6381.mo13685().m9215(z ? C7429.f22520 : C7429.f22521, new C7003(new C7003.C1136(iM24936, this.f3184.m10418(iM24936), this.f3184.m10396(iM24936)), new C7003.C1136(iM24926, this.f3184.m10418(iM24926), this.f3184.m10396(iM24926))));
        }
    }
}

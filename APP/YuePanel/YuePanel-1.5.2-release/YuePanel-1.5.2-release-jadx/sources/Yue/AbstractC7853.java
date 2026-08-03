package Yue;

import Yue.C7003;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۢۡۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7853 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f23475 = -1;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final EnumC7861 f23476;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f23477;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f23478;

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥ۟ */
    public static final class C1380 extends C7854 {
        public C1380(String str) {
            m24940(str);
        }

        @Override // Yue.AbstractC7853.C7854
        public String toString() {
            return "<![CDATA[" + m24941() + "]]>";
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥ۟۟, reason: contains not printable characters */
    public static class C7854 extends AbstractC7853 implements Cloneable {

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public String f23479;

        public C7854() {
            super(EnumC7861.Character);
        }

        public String toString() {
            return m24941();
        }

        @Override // Yue.AbstractC7853
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public AbstractC7853 mo24935() {
            super.mo24935();
            this.f23479 = null;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C7854 clone() {
            try {
                return (C7854) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public C7854 m24940(String str) {
            this.f23479 = str;
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public String m24941() {
            return this.f23479;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C7855 extends AbstractC7853 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final StringBuilder f23480;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public String f23481;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public boolean f23482;

        public C7855() {
            super(EnumC7861.Comment);
            this.f23480 = new StringBuilder();
            this.f23482 = false;
        }

        public String toString() {
            return "<!--" + m24945() + "-->";
        }

        @Override // Yue.AbstractC7853
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public AbstractC7853 mo24935() {
            super.mo24935();
            AbstractC7853.m24920(this.f23480);
            this.f23481 = null;
            this.f23482 = false;
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public C7855 m24942(char c) {
            m24944();
            this.f23480.append(c);
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public C7855 m24943(String str) {
            m24944();
            if (this.f23480.length() == 0) {
                this.f23481 = str;
            } else {
                this.f23480.append(str);
            }
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final void m24944() {
            String str = this.f23481;
            if (str != null) {
                this.f23480.append(str);
                this.f23481 = null;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public String m24945() {
            String str = this.f23481;
            return str != null ? str : this.f23480.toString();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C7856 extends AbstractC7853 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final StringBuilder f23483;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public String f23484;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final StringBuilder f23485;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final StringBuilder f23486;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public boolean f23487;

        public C7856() {
            super(EnumC7861.Doctype);
            this.f23483 = new StringBuilder();
            this.f23484 = null;
            this.f23485 = new StringBuilder();
            this.f23486 = new StringBuilder();
            this.f23487 = false;
        }

        public String toString() {
            return "<!doctype " + m24946() + ">";
        }

        @Override // Yue.AbstractC7853
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public AbstractC7853 mo24935() {
            super.mo24935();
            AbstractC7853.m24920(this.f23483);
            this.f23484 = null;
            AbstractC7853.m24920(this.f23485);
            AbstractC7853.m24920(this.f23486);
            this.f23487 = false;
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public String m24946() {
            return this.f23483.toString();
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public String m24947() {
            return this.f23484;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public String m24948() {
            return this.f23485.toString();
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public String m24949() {
            return this.f23486.toString();
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public boolean m24950() {
            return this.f23487;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C7857 extends AbstractC7853 {
        public C7857() {
            super(EnumC7861.EOF);
        }

        public String toString() {
            return "";
        }

        @Override // Yue.AbstractC7853
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public AbstractC7853 mo24935() {
            super.mo24935();
            return this;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C7858 extends AbstractC7860 {
        public C7858(AbstractC7998 abstractC7998) {
            super(EnumC7861.EndTag, abstractC7998);
        }

        @Override // Yue.AbstractC7853.AbstractC7860
        public String toString() {
            return "</" + m24973() + ">";
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C7859 extends AbstractC7860 {
        public C7859(AbstractC7998 abstractC7998) {
            super(EnumC7861.StartTag, abstractC7998);
        }

        @Override // Yue.AbstractC7853.AbstractC7860
        public String toString() {
            String str = m24966() ? "/>" : ">";
            if (!m24965() || this.f23493.size() <= 0) {
                return "<" + m24973() + str;
            }
            return "<" + m24973() + " " + this.f23493.toString() + str;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠ۢ()LYue/ۥۢۡۧ۠; */
        @Override // Yue.AbstractC7853.AbstractC7860, Yue.AbstractC7853
        /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public AbstractC7860 mo24935() {
            super.mo24935();
            this.f23493 = null;
            return this;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public C7859 m24952(String str, C3456 c3456) {
            this.f23490 = str;
            this.f23493 = c3456;
            this.f23491 = C6616.m3082(str);
            return this;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥۣ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC7860 extends AbstractC7853 {

        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public static final int f23488 = 512;

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public static final /* synthetic */ boolean f23489 = false;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public String f23490;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public String f23491;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public boolean f23492;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public C3456 f23493;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public String f23494;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final StringBuilder f23495;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public boolean f23496;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public String f23497;

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public final StringBuilder f23498;

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public boolean f23499;

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public boolean f23500;

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public final AbstractC7998 f23501;

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public final boolean f23502;

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public int f23503;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public int f23504;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public int f23505;

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public int f23506;

        public AbstractC7860(EnumC7861 enumC7861, AbstractC7998 abstractC7998) {
            super(enumC7861);
            this.f23492 = false;
            this.f23495 = new StringBuilder();
            this.f23496 = false;
            this.f23498 = new StringBuilder();
            this.f23499 = false;
            this.f23500 = false;
            this.f23501 = abstractC7998;
            this.f23502 = abstractC7998.f23787;
        }

        public abstract String toString();

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final void m24953(char c, int i, int i2) {
            m24960(i, i2);
            this.f23495.append(c);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public final void m24954(String str, int i, int i2) {
            String strReplace = str.replace((char) 0, (char) 65533);
            m24960(i, i2);
            if (this.f23495.length() == 0) {
                this.f23494 = strReplace;
            } else {
                this.f23495.append(strReplace);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final void m24955(char c, int i, int i2) {
            m24961(i, i2);
            this.f23498.append(c);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public final void m24956(String str, int i, int i2) {
            m24961(i, i2);
            if (this.f23498.length() == 0) {
                this.f23497 = str;
            } else {
                this.f23498.append(str);
            }
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public final void m24957(int[] iArr, int i, int i2) {
            m24961(i, i2);
            for (int i3 : iArr) {
                this.f23498.appendCodePoint(i3);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public final void m24958(char c) {
            m24959(String.valueOf(c));
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public final void m24959(String str) {
            String strReplace = str.replace((char) 0, (char) 65533);
            String str2 = this.f23490;
            if (str2 != null) {
                strReplace = str2.concat(strReplace);
            }
            this.f23490 = strReplace;
            this.f23491 = C6616.m3082(strReplace);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public final void m24960(int i, int i2) {
            this.f23496 = true;
            String str = this.f23494;
            if (str != null) {
                this.f23495.append(str);
                this.f23494 = null;
            }
            if (this.f23502) {
                int i3 = this.f23503;
                if (i3 > -1) {
                    i = i3;
                }
                this.f23503 = i;
                this.f23504 = i2;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public final void m24961(int i, int i2) {
            this.f23499 = true;
            String str = this.f23497;
            if (str != null) {
                this.f23498.append(str);
                this.f23497 = null;
            }
            if (this.f23502) {
                int i3 = this.f23505;
                if (i3 > -1) {
                    i = i3;
                }
                this.f23505 = i;
                this.f23506 = i2;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public final void m24962() {
            if (this.f23496) {
                m24969();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public final boolean m24963(String str) {
            C3456 c3456 = this.f23493;
            return c3456 != null && c3456.m9200(str);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public final boolean m24964(String str) {
            C3456 c3456 = this.f23493;
            return c3456 != null && c3456.m9201(str);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public final boolean m24965() {
            return this.f23493 != null;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public final boolean m24966() {
            return this.f23492;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public final AbstractC7860 m24967(String str) {
            this.f23490 = str;
            this.f23491 = C6616.m3082(str);
            return this;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public final String m24968() {
            String str = this.f23490;
            C8159.m26901(str == null || str.length() == 0);
            return this.f23490;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
        public final void m24969() {
            if (this.f23493 == null) {
                this.f23493 = new C3456();
            }
            if (this.f23496 && this.f23493.size() < 512) {
                String strTrim = (this.f23495.length() > 0 ? this.f23495.toString() : this.f23494).trim();
                if (strTrim.length() > 0) {
                    this.f23493.m9186(strTrim, this.f23499 ? this.f23498.length() > 0 ? this.f23498.toString() : this.f23497 : this.f23500 ? "" : null);
                    m24974(strTrim);
                }
            }
            m24971();
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
        public final String m24970() {
            return this.f23491;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠ۢ()LYue/ۥۢۡۧ۠; */
        @Override // Yue.AbstractC7853
        /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
        public AbstractC7860 mo24935() {
            super.mo24935();
            this.f23490 = null;
            this.f23491 = null;
            this.f23492 = false;
            this.f23493 = null;
            m24971();
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
        public final void m24971() {
            AbstractC7853.m24920(this.f23495);
            this.f23494 = null;
            this.f23496 = false;
            AbstractC7853.m24920(this.f23498);
            this.f23497 = null;
            this.f23500 = false;
            this.f23499 = false;
            if (this.f23502) {
                this.f23506 = -1;
                this.f23505 = -1;
                this.f23504 = -1;
                this.f23503 = -1;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
        public final void m24972() {
            this.f23500 = true;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
        public final String m24973() {
            String str = this.f23490;
            return str != null ? str : "[unset]";
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m24974(String str) {
            if (this.f23502 && m24934()) {
                AbstractC7998 abstractC7998 = m24925().f23501;
                C3787 c3787 = abstractC7998.f3184;
                boolean zM20993 = abstractC7998.f23783.m20993();
                Map map = (Map) this.f23493.m9216(C7429.f2877);
                if (map == null) {
                    map = new HashMap();
                    this.f23493.m9215(C7429.f2877, map);
                }
                if (!zM20993) {
                    str = C6396.m2839(str);
                }
                if (map.containsKey(str)) {
                    return;
                }
                if (!this.f23499) {
                    int i = this.f23504;
                    this.f23506 = i;
                    this.f23505 = i;
                }
                int i2 = this.f23503;
                C7003.C1136 c1136 = new C7003.C1136(i2, c3787.m10418(i2), c3787.m10396(this.f23503));
                int i3 = this.f23504;
                C7003 c7003 = new C7003(c1136, new C7003.C1136(i3, c3787.m10418(i3), c3787.m10396(this.f23504)));
                int i4 = this.f23505;
                C7003.C1136 c11362 = new C7003.C1136(i4, c3787.m10418(i4), c3787.m10396(this.f23505));
                int i5 = this.f23506;
                map.put(str, new C7003.C1135(c7003, new C7003(c11362, new C7003.C1136(i5, c3787.m10418(i5), c3787.m10396(this.f23506)))));
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۧ۠$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public enum EnumC7861 {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static void m24920(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C7854 m24921() {
        return (C7854) this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C7855 m24922() {
        return (C7855) this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final C7856 m24923() {
        return (C7856) this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final C7858 m24924() {
        return (C7858) this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final C7859 m24925() {
        return (C7859) this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int m24926() {
        return this.f23478;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m24927(int i) {
        this.f23478 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m24928() {
        return this instanceof C1380;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m24929() {
        return this.f23476 == EnumC7861.Character;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m24930() {
        return this.f23476 == EnumC7861.Comment;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m24931() {
        return this.f23476 == EnumC7861.Doctype;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final boolean m24932() {
        return this.f23476 == EnumC7861.EOF;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final boolean m24933() {
        return this.f23476 == EnumC7861.EndTag;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m24934() {
        return this.f23476 == EnumC7861.StartTag;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public AbstractC7853 mo24935() {
        this.f23477 = -1;
        this.f23478 = -1;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int m24936() {
        return this.f23477;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m24937(int i) {
        this.f23477 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public String m24938() {
        return getClass().getSimpleName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC7853(EnumC7861 enumC7861) {
        this.f23478 = -1;
        this.f23476 = enumC7861;
    }
}

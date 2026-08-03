package Yue;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4869 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f1196 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f1197 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f11165 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f11166 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f11167 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f11168 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f11169 = 6;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f11170 = 7;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f11171 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f11172 = 9;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f11173 = 10;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f11174 = 11;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f11175 = 12;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f11176 = 13;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f11177 = 14;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f11178 = 15;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f11179 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f11180 = 17;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f11181 = 18;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f11182 = 19;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f11183 = 20;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f11184 = 21;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f11185 = 22;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f11186 = 23;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f11187 = 24;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f11188 = 25;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f11189 = 26;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f11190 = 36;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final InterfaceC7011 f11191 = new C3396(new byte[]{0}, 1);

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final /* synthetic */ boolean f11192 = false;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ۠$ۥ */
    public static class C0516 extends AbstractC4875 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final C0516 f11193 = new C0516(C4869.f11191, 1, 1);

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final /* synthetic */ boolean f11194 = false;

        public C0516(InterfaceC7011 interfaceC7011, int i, int i2) {
            super(interfaceC7011, i, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static C0516 m14968() {
            return f11193;
        }

        @Override // Yue.C4869.AbstractC4873
        public String toString() {
            return this.f1199.getString(this.f1200, mo1777());
        }

        @Override // Yue.C4869.AbstractC4873
        /* JADX INFO: renamed from: ۥ */
        public StringBuilder mo1776(StringBuilder sb) {
            sb.append(C8039.f3212);
            sb.append(this.f1199.getString(this.f1200, mo1777()));
            sb.append(C8039.f3212);
            return sb;
        }

        @Override // Yue.C4869.AbstractC4875
        /* JADX INFO: renamed from: ۥ۟ */
        public /* bridge */ /* synthetic */ int mo1777() {
            return super.mo1777();
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public ByteBuffer m14969() {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f1199.data());
            byteBufferWrap.position(this.f1200);
            byteBufferWrap.limit(this.f1200 + mo1777());
            return byteBufferWrap.asReadOnlyBuffer().slice();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public byte m14970(int i) {
            return this.f1199.get(this.f1200 + i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public byte[] m14971() {
            int iMo1777 = mo1777();
            byte[] bArr = new byte[iMo1777];
            for (int i = 0; i < iMo1777; i++) {
                bArr[i] = this.f1199.get(this.f1200 + i);
            }
            return bArr;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ۠$ۥ۟ */
    public static class C0517 extends RuntimeException {
        public C0517(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ۠$ۥ۟۟, reason: contains not printable characters */
    public static class C4870 extends AbstractC4873 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final C4870 f11195 = new C4870(C4869.f11191, 0, 0);

        public C4870(InterfaceC7011 interfaceC7011, int i, int i2) {
            super(interfaceC7011, i, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static C4870 m14972() {
            return f11195;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4870)) {
                return false;
            }
            C4870 c4870 = (C4870) obj;
            return c4870.f1200 == this.f1200 && c4870.f11197 == this.f11197;
        }

        public int hashCode() {
            return this.f1200 ^ this.f11197;
        }

        @Override // Yue.C4869.AbstractC4873
        public String toString() {
            int i = this.f1200;
            while (this.f1199.get(i) != 0) {
                i++;
            }
            int i2 = this.f1200;
            return this.f1199.getString(i2, i - i2);
        }

        @Override // Yue.C4869.AbstractC4873
        /* JADX INFO: renamed from: ۥ */
        public StringBuilder mo1776(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m14973(byte[] bArr) {
            byte b;
            byte b2;
            int i = this.f1200;
            int i2 = 0;
            do {
                b = this.f1199.get(i);
                b2 = bArr[i2];
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
                if (i2 == bArr.length) {
                    return b - b2;
                }
            } while (b == b2);
            return b - b2;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ۠$ۥ۟۟۟, reason: contains not printable characters */
    public static class C4871 {

        /* JADX INFO: renamed from: ۥ */
        public final C4876 f1198;

        public C4871(C4876 c4876) {
            this.f1198 = c4876;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
            for (int i = 0; i < this.f1198.mo1777(); i++) {
                this.f1198.mo15005(i).m15003(sb);
                if (i != this.f1198.mo1777() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }

        /* JADX INFO: renamed from: ۥ */
        public C4870 m1779(int i) {
            if (i >= m1780()) {
                return C4870.f11195;
            }
            C4876 c4876 = this.f1198;
            int i2 = c4876.f1200 + (i * c4876.f11197);
            C4876 c48762 = this.f1198;
            InterfaceC7011 interfaceC7011 = c48762.f1199;
            return new C4870(interfaceC7011, C4869.m14958(interfaceC7011, i2, c48762.f11197), 1);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int m1780() {
            return this.f1198.mo1777();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ۠$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C4872 extends C4878 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final C4872 f11196 = new C4872(C4869.f11191, 1, 1);

        public C4872(InterfaceC7011 interfaceC7011, int i, int i2) {
            super(interfaceC7011, i, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static C4872 m14974() {
            return f11196;
        }

        @Override // Yue.C4869.C4878, Yue.C4869.AbstractC4873
        /* JADX INFO: renamed from: ۥ */
        public StringBuilder mo1776(StringBuilder sb) {
            sb.append("{ ");
            C4871 c4871M14978 = m14978();
            int iMo1777 = mo1777();
            C4878 c4878M14979 = m14979();
            for (int i = 0; i < iMo1777; i++) {
                sb.append(C8039.f3212);
                sb.append(c4871M14978.m1779(i).toString());
                sb.append("\" : ");
                sb.append(c4878M14979.mo15005(i).toString());
                if (i != iMo1777 - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final int m14975(C4871 c4871, byte[] bArr) {
            int iM1780 = c4871.m1780() - 1;
            int i = 0;
            while (i <= iM1780) {
                int i2 = (i + iM1780) >>> 1;
                int iM14973 = c4871.m1779(i2).m14973(bArr);
                if (iM14973 < 0) {
                    i = i2 + 1;
                } else {
                    if (iM14973 <= 0) {
                        return i2;
                    }
                    iM1780 = i2 - 1;
                }
            }
            return -(i + 1);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public C4874 m14976(String str) {
            return m14977(str.getBytes(StandardCharsets.UTF_8));
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public C4874 m14977(byte[] bArr) {
            C4871 c4871M14978 = m14978();
            int iM1780 = c4871M14978.m1780();
            int iM14975 = m14975(c4871M14978, bArr);
            return (iM14975 < 0 || iM14975 >= iM1780) ? C4874.f11198 : mo15005(iM14975);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public C4871 m14978() {
            int i = this.f1200 - (this.f11197 * 3);
            InterfaceC7011 interfaceC7011 = this.f1199;
            int iM14958 = C4869.m14958(interfaceC7011, i, this.f11197);
            InterfaceC7011 interfaceC70112 = this.f1199;
            int i2 = this.f11197;
            return new C4871(new C4876(interfaceC7011, iM14958, C4869.m14963(interfaceC70112, i + i2, i2), 4));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public C4878 m14979() {
            return new C4878(this.f1199, this.f1200, this.f11197);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ۠$ۥ۟۟۟۠, reason: contains not printable characters */
    public static abstract class AbstractC4873 {

        /* JADX INFO: renamed from: ۥ */
        public InterfaceC7011 f1199;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f1200;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f11197;

        public AbstractC4873(InterfaceC7011 interfaceC7011, int i, int i2) {
            this.f1199 = interfaceC7011;
            this.f1200 = i;
            this.f11197 = i2;
        }

        public String toString() {
            return mo1776(new StringBuilder(128)).toString();
        }

        /* JADX INFO: renamed from: ۥ */
        public abstract StringBuilder mo1776(StringBuilder sb);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ۠$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C4874 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final C4874 f11198 = new C4874(C4869.f11191, 0, 1, 0);

        /* JADX INFO: renamed from: ۥ */
        public InterfaceC7011 f1201;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f1202;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f11199;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f11200;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f11201;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C4874(InterfaceC7011 interfaceC7011, int i, int i2, int i3) {
            this(interfaceC7011, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        public String toString() {
            return m15003(new StringBuilder(128)).toString();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public C0516 m1782() {
            if (!m14990() && !m14999()) {
                return C0516.m14968();
            }
            InterfaceC7011 interfaceC7011 = this.f1201;
            return new C0516(interfaceC7011, C4869.m14958(interfaceC7011, this.f1202, this.f11199), this.f11200);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m14980() {
            return m14991() ? this.f1201.get(this.f1202) != 0 : m14987() != 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public double m14981() {
            int i = this.f11201;
            if (i == 3) {
                return C4869.m14962(this.f1201, this.f1202, this.f11199);
            }
            if (i == 1) {
                return C4869.m14963(this.f1201, this.f1202, this.f11199);
            }
            if (i != 2) {
                if (i == 5) {
                    return Double.parseDouble(m14986());
                }
                if (i == 6) {
                    InterfaceC7011 interfaceC7011 = this.f1201;
                    return C4869.m14963(interfaceC7011, C4869.m14958(interfaceC7011, this.f1202, this.f11199), this.f11200);
                }
                if (i == 7) {
                    InterfaceC7011 interfaceC70112 = this.f1201;
                    return C4869.m14965(interfaceC70112, C4869.m14958(interfaceC70112, this.f1202, this.f11199), this.f11200);
                }
                if (i == 8) {
                    InterfaceC7011 interfaceC70113 = this.f1201;
                    return C4869.m14962(interfaceC70113, C4869.m14958(interfaceC70113, this.f1202, this.f11199), this.f11200);
                }
                if (i == 10) {
                    return m14988().mo1777();
                }
                if (i != 26) {
                    return 0.0d;
                }
            }
            return C4869.m14965(this.f1201, this.f1202, this.f11199);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m14982() {
            int i = this.f11201;
            if (i == 1) {
                return C4869.m14963(this.f1201, this.f1202, this.f11199);
            }
            if (i == 2) {
                return (int) C4869.m14965(this.f1201, this.f1202, this.f11199);
            }
            if (i == 3) {
                return (int) C4869.m14962(this.f1201, this.f1202, this.f11199);
            }
            if (i == 5) {
                return Integer.parseInt(m14986());
            }
            if (i == 6) {
                InterfaceC7011 interfaceC7011 = this.f1201;
                return C4869.m14963(interfaceC7011, C4869.m14958(interfaceC7011, this.f1202, this.f11199), this.f11200);
            }
            if (i == 7) {
                InterfaceC7011 interfaceC70112 = this.f1201;
                return (int) C4869.m14965(interfaceC70112, C4869.m14958(interfaceC70112, this.f1202, this.f11199), this.f11199);
            }
            if (i == 8) {
                InterfaceC7011 interfaceC70113 = this.f1201;
                return (int) C4869.m14962(interfaceC70113, C4869.m14958(interfaceC70113, this.f1202, this.f11199), this.f11200);
            }
            if (i == 10) {
                return m14988().mo1777();
            }
            if (i != 26) {
                return 0;
            }
            return C4869.m14963(this.f1201, this.f1202, this.f11199);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C4870 m14983() {
            if (!m14995()) {
                return C4870.m14972();
            }
            InterfaceC7011 interfaceC7011 = this.f1201;
            return new C4870(interfaceC7011, C4869.m14958(interfaceC7011, this.f1202, this.f11199), this.f11200);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public long m14984() {
            int i = this.f11201;
            if (i == 1) {
                return C4869.m14964(this.f1201, this.f1202, this.f11199);
            }
            if (i == 2) {
                return C4869.m14965(this.f1201, this.f1202, this.f11199);
            }
            if (i == 3) {
                return (long) C4869.m14962(this.f1201, this.f1202, this.f11199);
            }
            if (i == 5) {
                try {
                    return Long.parseLong(m14986());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i == 6) {
                InterfaceC7011 interfaceC7011 = this.f1201;
                return C4869.m14964(interfaceC7011, C4869.m14958(interfaceC7011, this.f1202, this.f11199), this.f11200);
            }
            if (i == 7) {
                InterfaceC7011 interfaceC70112 = this.f1201;
                return C4869.m14965(interfaceC70112, C4869.m14958(interfaceC70112, this.f1202, this.f11199), this.f11199);
            }
            if (i == 8) {
                InterfaceC7011 interfaceC70113 = this.f1201;
                return (long) C4869.m14962(interfaceC70113, C4869.m14958(interfaceC70113, this.f1202, this.f11199), this.f11200);
            }
            if (i == 10) {
                return m14988().mo1777();
            }
            if (i != 26) {
                return 0L;
            }
            return C4869.m14963(this.f1201, this.f1202, this.f11199);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public C4872 m14985() {
            if (!m14996()) {
                return C4872.m14974();
            }
            InterfaceC7011 interfaceC7011 = this.f1201;
            return new C4872(interfaceC7011, C4869.m14958(interfaceC7011, this.f1202, this.f11199), this.f11200);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public String m14986() {
            if (m14999()) {
                int iM14958 = C4869.m14958(this.f1201, this.f1202, this.f11199);
                InterfaceC7011 interfaceC7011 = this.f1201;
                int i = this.f11200;
                return this.f1201.getString(iM14958, (int) C4869.m14965(interfaceC7011, iM14958 - i, i));
            }
            if (!m14995()) {
                return "";
            }
            int iM149582 = C4869.m14958(this.f1201, this.f1202, this.f11200);
            int i2 = iM149582;
            while (this.f1201.get(i2) != 0) {
                i2++;
            }
            return this.f1201.getString(iM149582, i2 - iM149582);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public long m14987() {
            int i = this.f11201;
            if (i == 2) {
                return C4869.m14965(this.f1201, this.f1202, this.f11199);
            }
            if (i == 1) {
                return C4869.m14964(this.f1201, this.f1202, this.f11199);
            }
            if (i == 3) {
                return (long) C4869.m14962(this.f1201, this.f1202, this.f11199);
            }
            if (i == 10) {
                return m14988().mo1777();
            }
            if (i == 26) {
                return C4869.m14963(this.f1201, this.f1202, this.f11199);
            }
            if (i == 5) {
                return Long.parseLong(m14986());
            }
            if (i == 6) {
                InterfaceC7011 interfaceC7011 = this.f1201;
                return C4869.m14964(interfaceC7011, C4869.m14958(interfaceC7011, this.f1202, this.f11199), this.f11200);
            }
            if (i == 7) {
                InterfaceC7011 interfaceC70112 = this.f1201;
                return C4869.m14965(interfaceC70112, C4869.m14958(interfaceC70112, this.f1202, this.f11199), this.f11200);
            }
            if (i != 8) {
                return 0L;
            }
            InterfaceC7011 interfaceC70113 = this.f1201;
            return (long) C4869.m14962(interfaceC70113, C4869.m14958(interfaceC70113, this.f1202, this.f11199), this.f11199);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public C4878 m14988() {
            if (m15002()) {
                InterfaceC7011 interfaceC7011 = this.f1201;
                return new C4878(interfaceC7011, C4869.m14958(interfaceC7011, this.f1202, this.f11199), this.f11200);
            }
            int i = this.f11201;
            if (i == 15) {
                InterfaceC7011 interfaceC70112 = this.f1201;
                return new C4876(interfaceC70112, C4869.m14958(interfaceC70112, this.f1202, this.f11199), this.f11200, 4);
            }
            if (!C4869.m14960(i)) {
                return C4878.m15009();
            }
            InterfaceC7011 interfaceC70113 = this.f1201;
            return new C4876(interfaceC70113, C4869.m14958(interfaceC70113, this.f1202, this.f11199), this.f11200, C4869.m14967(this.f11201));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public int m14989() {
            return this.f11201;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public boolean m14990() {
            return this.f11201 == 25;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public boolean m14991() {
            return this.f11201 == 26;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public boolean m14992() {
            int i = this.f11201;
            return i == 3 || i == 8;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public boolean m14993() {
            int i = this.f11201;
            return i == 1 || i == 6;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public boolean m14994() {
            return m14993() || m15001();
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public boolean m14995() {
            return this.f11201 == 4;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public boolean m14996() {
            return this.f11201 == 9;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean m14997() {
            return this.f11201 == 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public boolean m14998() {
            return m14994() || m14992();
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean m14999() {
            return this.f11201 == 5;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public boolean m15000() {
            return C4869.m14960(this.f11201);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public boolean m15001() {
            int i = this.f11201;
            return i == 2 || i == 7;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public boolean m15002() {
            int i = this.f11201;
            return i == 10 || i == 9;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public StringBuilder m15003(StringBuilder sb) {
            int i = this.f11201;
            if (i != 36) {
                switch (i) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(m14984());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(m14987());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(m14981());
                        return sb;
                    case 4:
                        C4870 c4870M14983 = m14983();
                        sb.append(C8039.f3212);
                        StringBuilder sbMo1776 = c4870M14983.mo1776(sb);
                        sbMo1776.append(C8039.f3212);
                        return sbMo1776;
                    case 5:
                        sb.append(C8039.f3212);
                        sb.append(m14986());
                        sb.append(C8039.f3212);
                        return sb;
                    case 9:
                        return m14985().mo1776(sb);
                    case 10:
                        return m14988().mo1776(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new C0517("not_implemented:" + this.f11201);
                    case 25:
                        return m1782().mo1776(sb);
                    case 26:
                        sb.append(m14980());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(m14988());
            return sb;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C4874(InterfaceC7011 interfaceC7011, int i, int i2, int i3, int i4) {
            this.f1201 = interfaceC7011;
            this.f1202 = i;
            this.f11199 = i2;
            this.f11200 = i3;
            this.f11201 = i4;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ۠$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static abstract class AbstractC4875 extends AbstractC4873 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int f11202;

        public AbstractC4875(InterfaceC7011 interfaceC7011, int i, int i2) {
            super(interfaceC7011, i, i2);
            this.f11202 = C4869.m14963(this.f1199, i - i2, i2);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int mo1777() {
            return this.f11202;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ۠$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C4876 extends C4878 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final C4876 f11203 = new C4876(C4869.f11191, 1, 1, 1);

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final int f11204;

        public C4876(InterfaceC7011 interfaceC7011, int i, int i2, int i3) {
            super(interfaceC7011, i, i2);
            this.f11204 = i3;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static C4876 m15004() {
            return f11203;
        }

        @Override // Yue.C4869.C4878
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C4874 mo15005(int i) {
            if (i >= mo1777()) {
                return C4874.f11198;
            }
            return new C4874(this.f1199, this.f1200 + (i * this.f11197), this.f11197, 1, this.f11204);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int m15006() {
            return this.f11204;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean m15007() {
            return this == f11203;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ۠$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static class C4877 {
        /* JADX INFO: renamed from: ۥ */
        public static int m1783(byte b) {
            return b & 255;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static long m1784(int i) {
            return ((long) i) & C8578.f25466;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static int m15008(short s) {
            return s & C8080.f23970;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢ۠$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static class C4878 extends AbstractC4875 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final C4878 f11205 = new C4878(C4869.f11191, 1, 1);

        public C4878(InterfaceC7011 interfaceC7011, int i, int i2) {
            super(interfaceC7011, i, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static C4878 m15009() {
            return f11205;
        }

        @Override // Yue.C4869.AbstractC4873
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // Yue.C4869.AbstractC4873
        /* JADX INFO: renamed from: ۥ */
        public StringBuilder mo1776(StringBuilder sb) {
            sb.append("[ ");
            int iMo1777 = mo1777();
            for (int i = 0; i < iMo1777; i++) {
                mo15005(i).m15003(sb);
                if (i != iMo1777 - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }

        @Override // Yue.C4869.AbstractC4875
        /* JADX INFO: renamed from: ۥ۟ */
        public /* bridge */ /* synthetic */ int mo1777() {
            return super.mo1777();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public C4874 mo15005(int i) {
            long jMo1777 = mo1777();
            long j = i;
            if (j >= jMo1777) {
                return C4874.f11198;
            }
            return new C4874(this.f1199, this.f1200 + (i * this.f11197), this.f11197, C4877.m1783(this.f1199.get((int) (((long) this.f1200) + (jMo1777 * ((long) this.f11197)) + j))));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean m15010() {
            return this == f11205;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C4874 m14956(InterfaceC7011 interfaceC7011) {
        int iLimit = interfaceC7011.limit();
        byte b = interfaceC7011.get(iLimit - 1);
        int i = iLimit - 2;
        return new C4874(interfaceC7011, i - b, b, C4877.m1783(interfaceC7011.get(i)));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static C4874 m14957(ByteBuffer byteBuffer) {
        return m14956(byteBuffer.hasArray() ? new C3396(byteBuffer.array(), byteBuffer.limit()) : new C3623(byteBuffer));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static int m14958(InterfaceC7011 interfaceC7011, int i, int i2) {
        return (int) (((long) i) - m14965(interfaceC7011, i, i2));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m14959(int i) {
        return i <= 3 || i == 26;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m14960(int i) {
        return (i >= 11 && i <= 15) || i == 36;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean m14961(int i) {
        return (i >= 1 && i <= 4) || i == 26;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static double m14962(InterfaceC7011 interfaceC7011, int i, int i2) {
        if (i2 == 4) {
            return interfaceC7011.getFloat(i);
        }
        if (i2 != 8) {
            return -1.0d;
        }
        return interfaceC7011.getDouble(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static int m14963(InterfaceC7011 interfaceC7011, int i, int i2) {
        return (int) m14964(interfaceC7011, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static long m14964(InterfaceC7011 interfaceC7011, int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = interfaceC7011.get(i);
        } else if (i2 == 2) {
            i3 = interfaceC7011.getShort(i);
        } else {
            if (i2 != 4) {
                if (i2 != 8) {
                    return -1L;
                }
                return interfaceC7011.getLong(i);
            }
            i3 = interfaceC7011.getInt(i);
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static long m14965(InterfaceC7011 interfaceC7011, int i, int i2) {
        if (i2 == 1) {
            return C4877.m1783(interfaceC7011.get(i));
        }
        if (i2 == 2) {
            return C4877.m15008(interfaceC7011.getShort(i));
        }
        if (i2 == 4) {
            return C4877.m1784(interfaceC7011.getInt(i));
        }
        if (i2 != 8) {
            return -1L;
        }
        return interfaceC7011.getLong(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static int m14966(int i, int i2) {
        if (i2 == 0) {
            return i + 10;
        }
        if (i2 == 2) {
            return i + 15;
        }
        if (i2 == 3) {
            return i + 18;
        }
        if (i2 != 4) {
            return 0;
        }
        return i + 21;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static int m14967(int i) {
        return i - 10;
    }
}

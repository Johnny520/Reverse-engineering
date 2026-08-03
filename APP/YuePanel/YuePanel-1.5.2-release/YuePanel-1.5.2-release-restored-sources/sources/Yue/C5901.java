package Yue;

import Yue.C8567;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5901 implements InterfaceC8561, InterfaceC5801 {

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static final char f14633 = 65279;

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static final int f14634 = 1114111;

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static final String f14635 = "http://xmlpull.org/v1/doc/features.html#xml-roundtrip";

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static final String f14636 = "http://xmlpull.org/v1/doc/features.html#names-interned";

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final String f14637 = "http://xmlpull.org/v1/doc/features.html#process-docdecl";

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static final String f14638 = "javax.xml.stream.notations";

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final String f14639 = "javax.xml.stream.entities";

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final String f14640 = "Unexpected end of stream";

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final int f14642 = 16384;

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final int f14643 = 32768;

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final boolean f14645 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static final String f14646 = "http://xmlpull.org/v1/doc/features.html#process-namespaces";

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final int f14647 = 1024;

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static final char f14648 = 1024;

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final String[] f14651;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final int[] f14652;

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final char[] f14653;

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static final int f14654 = 8192;

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static final char[] f14655;

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static final char[] f14656;

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static final char[] f14657;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final char[] f14658;

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static final char[] f14659;

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static /* synthetic */ Class f14660;

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static /* synthetic */ Class f14661;

    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ Class f14662;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean f14664;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f14667;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f14668;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f14669;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f14670;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f14671;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f14672;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f14673;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public char[][] f14674;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int[] f14675;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public String[] f14676;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public String[] f14677;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public String[] f14678;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public int[] f14679;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public String f14683;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public String f14684;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public String f14685;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public C4270 f14686;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public HashMap f14687;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int f14688;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public String[] f14689;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public int[] f14690;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public String[] f14691;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public String[] f14692;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public String[] f14693;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public int f14694;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public String[] f14695;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int[] f14696;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public String[] f14697;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int f14698;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public String[] f14699;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public int[] f14700;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public String[] f14701;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public int f14702;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public String[] f14703;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public char[][] f14704;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public int[] f14705;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public char[][] f14706;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public String[] f14707;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public Reader f14708;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public String f14709;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public int f14710;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public char[] f14711;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public int f14712;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public int f14713;

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public int f14714;

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public int f14715;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public int f14716;

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public int f14717;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public int f14718;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public char[] f14719;

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public int f14720;

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public int f14721;

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public boolean f14722;

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public boolean f14723;

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public boolean f14724;

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public boolean f14725;

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public boolean f14726;

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public boolean f14727;

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public boolean f14728;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public boolean f14729;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public String f14730;

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public String f14731;

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public char[] f14732;

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public char[] f14733;

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public char[] f14734;

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public C4095 f14735;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final String[] f14641 = {"[UNKNOWN]", "START_ELEMENT", "END_ELEMENT", "PROCESSING_INSTRUCTION", "CHARACTERS", "COMMENT", "SPACE", "START_DOCUMENT", "END_DOCUMENT", "ENTITY_REFERENCE", "ATTRIBUTE", "DTD", "CDATA", "NAMESPACE", "NOTATION_DECLARATION", "ENTITY_DECLARATION"};

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final String f14644 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static boolean[] f14649 = new boolean[1024];

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static boolean[] f14650 = new boolean[1024];

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean f14663 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean f14665 = true;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean f14666 = true;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public String f14680 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean f14681 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean f14682 = false;

    static {
        m18317(':');
        for (char c = 'A'; c <= 'Z'; c = (char) (c + 1)) {
            m18317(c);
        }
        m18317('_');
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            m18317(c2);
        }
        for (char c3 = 192; c3 <= 767; c3 = (char) (c3 + 1)) {
            m18317(c3);
        }
        for (char c4 = 880; c4 <= 893; c4 = (char) (c4 + 1)) {
            m18317(c4);
        }
        for (char c5 = 895; c5 < 1024; c5 = (char) (c5 + 1)) {
            m18317(c5);
        }
        m18316(SignatureVisitor.SUPER);
        m18316(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        for (char c6 = '0'; c6 <= '9'; c6 = (char) (c6 + 1)) {
            m18316(c6);
        }
        m18316(C8039.f23889);
        for (char c7 = 768; c7 <= 879; c7 = (char) (c7 + 1)) {
            m18316(c7);
        }
        f14651 = new String[0];
        f14652 = new int[0];
        f14653 = new char[0];
        f14655 = new char[]{'v', 'e', Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL, 'i', 'o', 'n'};
        f14656 = new char[]{'e', 'n', 'c', 'o', Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL, 'i', 'n', 'g'};
        f14657 = new char[]{Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, 'a', 'n', Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL, 'a', 'l', 'o', 'n', 'e'};
        f14658 = new char[]{'y', 'e', Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL};
        f14659 = new char[]{'n', 'o'};
    }

    public C5901() {
        String[] strArr = f14651;
        this.f14695 = strArr;
        this.f14697 = strArr;
        this.f14710 = 95;
        char[] cArr = new char[Runtime.getRuntime().freeMemory() > C4720.f10089 ? 8192 : 256];
        this.f14711 = cArr;
        this.f14712 = (this.f14710 * cArr.length) / 100;
        this.f14719 = new char[Runtime.getRuntime().freeMemory() <= C4720.f10089 ? 64 : 8192];
        this.f14732 = null;
        this.f14733 = new char[1];
        this.f14734 = null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final String m18309(String str) {
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static /* synthetic */ Class m18310(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static String m18311(int i) {
        if (i >= 0) {
            String[] strArr = f14641;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return "[UNKNOWN]";
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static final int m18312(char[] cArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = (cArr[i] << 7) + cArr[(i + i2) - 1];
        if (i2 > 16) {
            i3 = (i3 << 7) + cArr[(i2 / 4) + i];
        }
        return i2 > 8 ? (i3 << 7) + cArr[i + (i2 / 2)] : i3;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static int m18313(int i, char[] cArr, int i2, int i3) {
        if (i2 < i) {
            return i > i3 ? i3 : i;
        }
        if (i3 - i2 > 65) {
            i2 = i3 - 10;
        }
        int i4 = i2 + 1;
        while (true) {
            i4--;
            if (i4 <= i || i3 - i4 > 65 || (cArr[i4] == '<' && i2 - i4 > 10)) {
                break;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static boolean m18314(int i) {
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    private void m18315() {
        this.f14667 = 1;
        this.f14668 = 0;
        this.f14669 = false;
        this.f14670 = false;
        this.f14671 = 7;
        this.f14672 = false;
        this.f14673 = 0;
        this.f14688 = 0;
        this.f14694 = 0;
        this.f14698 = 0;
        this.f14702 = 0;
        this.f14708 = null;
        this.f14709 = null;
        this.f14713 = 0;
        this.f14714 = 0;
        this.f14715 = 0;
        this.f14718 = 0;
        this.f14717 = 0;
        this.f14716 = 0;
        this.f14720 = 0;
        this.f14721 = 0;
        this.f14722 = false;
        this.f14723 = false;
        this.f14724 = false;
        this.f14725 = false;
        this.f14726 = false;
        this.f14727 = false;
        this.f14728 = false;
        m18420();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public static final void m18316(char c) {
        f14650[c] = true;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public static final void m18317(char c) {
        f14649[c] = true;
        m18316(c);
    }

    @Override // Yue.InterfaceC8561
    public void close() throws C8559 {
    }

    public Iterator getAttributes() {
        if (!m18379()) {
            return C4632.f9944;
        }
        int iMo18351 = mo18351();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iMo18351; i++) {
            arrayList.add(new C3455(mo18343(i), mo18339(i), mo18344(i), mo18331(i), mo18353(i)));
        }
        return arrayList.iterator();
    }

    @Override // Yue.InterfaceC8561
    public C6848 getName() {
        if (m18314(this.f14671)) {
            return new C6848(m18309(mo18325()), mo18348(), m18309(getPrefix()));
        }
        throw new IllegalStateException("Current state not START_ELEMENT or END_ELEMENT");
    }

    public Iterator getNamespaces() {
        if (!m18380()) {
            return C4632.f9944;
        }
        return m18381(this.f14673, m18371());
    }

    @Override // Yue.InterfaceC8561
    public String getPrefix() {
        int i = this.f14671;
        return (i == 1 || i == 2) ? this.f14677[this.f14673] : m18431(new int[]{1, 2});
    }

    @Override // Yue.InterfaceC8561
    public Object getProperty(String str) {
        ArrayList arrayList = null;
        if (str.equals("javax.xml.stream.entities")) {
            C4270 c4270 = this.f14686;
            if (c4270 != null) {
                Class clsM18310 = f14660;
                if (clsM18310 == null) {
                    clsM18310 = m18310("com.wutka.dtd.DTDEntity");
                    f14660 = clsM18310;
                }
                Vector vectorM12325 = c4270.m12325(clsM18310);
                Enumeration enumerationElements = vectorM12325.elements();
                arrayList = new ArrayList(vectorM12325.size());
                while (enumerationElements.hasMoreElements()) {
                    InterfaceC4648 interfaceC4648M12373 = C4283.m12373((C4281) enumerationElements.nextElement());
                    if (interfaceC4648M12373 != null) {
                        arrayList.add(interfaceC4648M12373);
                    }
                }
            }
            return arrayList;
        }
        if (!str.equals("javax.xml.stream.notations")) {
            return this.f14735.m11569(str);
        }
        C4270 c42702 = this.f14686;
        if (c42702 != null) {
            Class clsM183102 = f14662;
            if (clsM183102 == null) {
                clsM183102 = m18310("com.wutka.dtd.DTDNotation");
                f14662 = clsM183102;
            }
            Vector vectorM123252 = c42702.m12325(clsM183102);
            Enumeration enumerationElements2 = vectorM123252.elements();
            arrayList = new ArrayList(vectorM123252.size());
            while (enumerationElements2.hasMoreElements()) {
                InterfaceC6402 interfaceC6402M12374 = C4283.m12374((C4288) enumerationElements2.nextElement());
                if (interfaceC6402M12374 != null) {
                    arrayList.add(interfaceC6402M12374);
                }
            }
        }
        return arrayList;
    }

    @Override // Yue.InterfaceC8561
    public String getText() {
        char[] cArr;
        m18357();
        if (this.f14671 == 9) {
            if (this.f14730 == null && (cArr = this.f14732) != null) {
                this.f14730 = new String(cArr);
            }
            return this.f14730;
        }
        if (this.f14722) {
            char[] cArr2 = this.f14719;
            int i = this.f14720;
            this.f14730 = new String(cArr2, i, this.f14721 - i);
        } else {
            char[] cArr3 = this.f14711;
            int i2 = this.f14717;
            this.f14730 = new String(cArr3, i2, this.f14718 - i2);
        }
        return this.f14730;
    }

    public String getValue() {
        return getText();
    }

    @Override // Yue.InterfaceC8561
    public String getVersion() {
        return this.f14680;
    }

    @Override // Yue.InterfaceC8561
    public boolean hasNext() throws C8559 {
        return this.f14671 != 8;
    }

    @Override // Yue.InterfaceC8561
    public int next() throws C8559 {
        this.f14729 = true;
        this.f14720 = 0;
        this.f14721 = 0;
        this.f14722 = false;
        return m18399();
    }

    @Override // Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥ */
    public String mo529() {
        return null;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC6349 mo2574() {
        return new C7013(this.f14695, this.f14697, this.f14694);
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String mo18318(String str) {
        if (!m18314(this.f14671)) {
            m18431(new int[]{1, 2});
        }
        if (str == null || str.length() <= 0) {
            for (int i = this.f14694 - 1; i >= 0; i--) {
                if (this.f14695[i] == null) {
                    return this.f14697[i];
                }
            }
            return null;
        }
        for (int i2 = this.f14694 - 1; i2 >= 0; i2--) {
            if (str.equals(this.f14695[i2])) {
                return this.f14697[i2];
            }
        }
        if (C8542.f3549.equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return C8542.f25376;
        }
        return null;
    }

    @Override // Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public String mo9145() {
        return null;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int mo18319() throws C8559 {
        next();
        while (true) {
            int i = this.f14671;
            if (i != 6 && i != 5 && i != 3 && ((i != 4 || !mo18324()) && (this.f14671 != 12 || !mo18324()))) {
                break;
            }
            next();
        }
        int i2 = this.f14671;
        if (i2 == 1 || i2 == 2) {
            return i2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("expected XMLStreamConstants.START_ELEMENT or XMLStreamConstants.END_ELEMENT not ");
        stringBuffer.append(C4606.m1561(mo18329()));
        throw new C8559(stringBuffer.toString(), mo18330());
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public String mo18320() throws C8559 {
        StringBuffer stringBuffer = new StringBuffer();
        if (mo18329() != 1) {
            throw new C8559("Precondition for readText is getEventType() == START_ELEMENT");
        }
        while (next() != 8) {
            if (mo18328()) {
                throw new C8559("Unexpected Element start");
            }
            if (mo18322() || mo18329() == 9) {
                stringBuffer.append(getText());
            }
            if (mo18326()) {
                return stringBuffer.toString();
            }
        }
        throw new C8559("Unexpected end of Document");
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean mo18321() {
        return this.f14682;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean mo18322() {
        return this.f14671 == 4;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public String mo18323() {
        return this.f14683;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean mo18324() {
        int i = this.f14671;
        if (i != 4 && i != 12) {
            return i == 6;
        }
        if (this.f14722) {
            for (int i2 = this.f14720; i2 < this.f14721; i2++) {
                if (!m18386(this.f14719[i2])) {
                    return false;
                }
            }
            return true;
        }
        for (int i3 = this.f14717; i3 < this.f14718; i3++) {
            if (!m18386(this.f14711[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public String mo18325() {
        int i = this.f14671;
        return (i == 1 || i == 2) ? this.f14665 ? this.f14678[this.f14673] : f14644 : m18431(new int[]{1, 2});
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean mo18326() {
        return this.f14671 == 2;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean mo18327() {
        return this.f14681;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean mo18328() {
        return this.f14671 == 1;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int mo18329() {
        return this.f14671;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public InterfaceC5801 mo18330() {
        return this;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public String mo18331(int i) {
        if (this.f14671 != 1) {
            m18430(1);
        }
        if (i >= 0 && i < this.f14688) {
            return this.f14693[i];
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("attribute position must be 0..");
        stringBuffer.append(this.f14688 - 1);
        stringBuffer.append(" and not ");
        stringBuffer.append(i);
        throw new IndexOutOfBoundsException(stringBuffer.toString());
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public char[] mo18332() {
        m18358();
        if (this.f14671 == 4 && this.f14722) {
            return this.f14719;
        }
        return this.f14711;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public String mo18333(String str, String str2) {
        if (this.f14671 != 1) {
            m18430(1);
        }
        if (str2 == null) {
            throw new IllegalArgumentException("attribute name can not be null");
        }
        int i = 0;
        if (str == null) {
            while (i < this.f14688) {
                if (str2.equals(this.f14689[i])) {
                    return this.f14693[i];
                }
                i++;
            }
            return null;
        }
        while (i < this.f14688) {
            if (str2.equals(this.f14689[i]) && str.equals(this.f14692[i])) {
                return this.f14693[i];
            }
            i++;
        }
        return null;
    }

    @Override // Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public int mo9152() {
        return this.f14668;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean mo18334() {
        return m18314(this.f14671);
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public String mo18335() {
        if (this.f14671 != 3) {
            m18430(3);
        }
        return this.f14684;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int mo18336() {
        int i;
        int i2;
        m18358();
        if (this.f14722) {
            i = this.f14721;
            i2 = this.f14720;
        } else {
            i = this.f14718;
            i2 = this.f14717;
        }
        return i - i2;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public String mo18337(int i) {
        if (!m18314(this.f14671)) {
            m18431(new int[]{1, 2});
        }
        int i2 = this.f14673;
        int iM18375 = m18375(i2);
        int i3 = this.f14679[i2 - 1] + i;
        if (i < iM18375) {
            return this.f14695[i3];
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("position ");
        stringBuffer.append(i);
        stringBuffer.append(" exceeded number of available namespaces ");
        stringBuffer.append(iM18375);
        throw new ArrayIndexOutOfBoundsException(stringBuffer.toString());
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public C6848 mo18338(int i) {
        if (this.f14671 != 1) {
            m18430(1);
        }
        return new C6848(m18309(mo18339(i)), mo18344(i), m18309(mo18343(i)));
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public String mo18339(int i) {
        if (this.f14671 != 1) {
            m18430(1);
        }
        if (!this.f14665) {
            return f14644;
        }
        if (i >= 0 && i < this.f14688) {
            return this.f14692[i];
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("attribute position must be 0..");
        stringBuffer.append(this.f14688 - 1);
        stringBuffer.append(" and not ");
        stringBuffer.append(i);
        throw new IndexOutOfBoundsException(stringBuffer.toString());
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public int mo18340(int i, char[] cArr, int i2, int i3) throws C8559 {
        m18358();
        int iMo18336 = mo18336();
        if (i < 0 || i > iMo18336) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = iMo18336 - i;
        if (i4 < i3) {
            i3 = i4;
        }
        if (i3 > 0) {
            System.arraycopy(mo18332(), mo18349() + i, cArr, i2, i3);
        }
        return i3;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean mo18341() {
        int i = this.f14671;
        return i == 4 || i == 11 || i == 12 || i == 5 || i == 6 || i == 9;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean mo18342(int i) {
        if (this.f14671 != 1) {
            m18430(1);
        }
        if (i >= 0 && i < this.f14688) {
            return true;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("attribute position must be 0..");
        stringBuffer.append(this.f14688 - 1);
        stringBuffer.append(" and not ");
        stringBuffer.append(i);
        throw new IndexOutOfBoundsException(stringBuffer.toString());
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public String mo18343(int i) {
        if (this.f14671 != 1) {
            m18430(1);
        }
        if (!this.f14665) {
            return null;
        }
        if (i >= 0 && i < this.f14688) {
            return this.f14691[i];
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("attribute position must be 0..");
        stringBuffer.append(this.f14688 - 1);
        stringBuffer.append(" and not ");
        stringBuffer.append(i);
        throw new IndexOutOfBoundsException(stringBuffer.toString());
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public String mo18344(int i) {
        if (this.f14671 != 1) {
            m18430(1);
        }
        if (i >= 0 && i < this.f14688) {
            return this.f14689[i];
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("attribute position must be 0..");
        stringBuffer.append(this.f14688 - 1);
        stringBuffer.append(" and not ");
        stringBuffer.append(i);
        throw new IndexOutOfBoundsException(stringBuffer.toString());
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int mo18345() {
        if (!m18314(this.f14671)) {
            m18431(new int[]{1, 2});
        }
        return m18375(this.f14673);
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public String mo18346() {
        if (this.f14671 != 3) {
            m18430(3);
        }
        return this.f14685;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public void mo18347(int i, String str, String str2) throws C8559 {
        String string;
        String string2;
        String string3;
        String string4;
        int iMo18329 = mo18329();
        boolean zEquals = i == iMo18329;
        if (zEquals && str2 != null) {
            if (iMo18329 != 1 && iMo18329 != 2 && iMo18329 != 9) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Using non-null local name argument for require(); ");
                stringBuffer.append(C4606.m1561(iMo18329));
                stringBuffer.append(" event does not have local name");
                throw new C8559(stringBuffer.toString(), mo18330());
            }
            zEquals = str2.equals(mo18348());
        }
        if (zEquals && str != null && (iMo18329 == 1 || iMo18329 == 1)) {
            String strMo18325 = mo18325();
            if (str.length() == 0) {
                zEquals = strMo18325 == null;
            } else {
                zEquals = str.equals(strMo18325);
            }
        }
        if (zEquals) {
            return;
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("expected event ");
        stringBuffer2.append(C4606.m1561(i));
        String string5 = "";
        if (str2 != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(" with name '");
            stringBuffer3.append(str2);
            stringBuffer3.append("'");
            string = stringBuffer3.toString();
        } else {
            string = "";
        }
        stringBuffer2.append(string);
        stringBuffer2.append((str == null || str2 == null) ? "" : " and");
        if (str != null) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(" with namespace '");
            stringBuffer4.append(str);
            stringBuffer4.append("'");
            string2 = stringBuffer4.toString();
        } else {
            string2 = "";
        }
        stringBuffer2.append(string2);
        stringBuffer2.append(" but got");
        if (i != mo18329()) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append(" ");
            stringBuffer5.append(C4606.m1561(mo18329()));
            string3 = stringBuffer5.toString();
        } else {
            string3 = "";
        }
        stringBuffer2.append(string3);
        if (str2 == null || mo18348() == null || str2.equals(getName())) {
            string4 = "";
        } else {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(" name '");
            stringBuffer6.append(mo18348());
            stringBuffer6.append("'");
            string4 = stringBuffer6.toString();
        }
        stringBuffer2.append(string4);
        stringBuffer2.append((str == null || str2 == null || mo18348() == null || str2.equals(getName()) || mo18325() == null || str.equals(mo18325())) ? "" : " and");
        if (str != null && mo18325() != null && !str.equals(mo18325())) {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append(" namespace '");
            stringBuffer7.append(mo18325());
            stringBuffer7.append("'");
            string5 = stringBuffer7.toString();
        }
        stringBuffer2.append(string5);
        stringBuffer2.append(" (position:");
        stringBuffer2.append(m18377());
        stringBuffer2.append(")");
        throw new C8559(stringBuffer2.toString(), mo18330());
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public String mo18348() {
        int i = this.f14671;
        if (i != 1 && i != 2) {
            if (i != 9) {
                return m18431(new int[]{1, 2, 9});
            }
            if (this.f14731 == null) {
                char[] cArr = this.f14711;
                int i2 = this.f14717;
                this.f14731 = m18396(cArr, i2, this.f14718 - i2);
            }
            return this.f14731;
        }
        return this.f14676[this.f14673];
    }

    @Override // Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public int mo9160() {
        return this.f14667;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int mo18349() {
        m18358();
        return this.f14722 ? this.f14720 : this.f14717;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public String mo18350(int i) {
        if (!m18314(this.f14671)) {
            m18431(new int[]{1, 2});
        }
        int i2 = this.f14673;
        int iM18375 = m18375(i2);
        int i3 = this.f14679[i2 - 1] + i;
        if (i < iM18375) {
            return this.f14697[i3];
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("position ");
        stringBuffer.append(i);
        stringBuffer.append(" exceedded number of available namespaces ");
        stringBuffer.append(iM18375);
        throw new ArrayIndexOutOfBoundsException(stringBuffer.toString());
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public int mo18351() {
        if (this.f14671 != 1) {
            m18430(1);
        }
        return this.f14688;
    }

    @Override // Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ */
    public int mo9163() {
        return this.f14718;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public String mo18352() {
        return m18370();
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public String mo18353(int i) {
        if (this.f14671 != 1) {
            m18430(1);
        }
        if (i >= 0 && i < this.f14688) {
            return "CDATA";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("attribute position must be 0..");
        stringBuffer.append(this.f14688 - 1);
        stringBuffer.append(" and not ");
        stringBuffer.append(i);
        throw new IndexOutOfBoundsException(stringBuffer.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public void m18354(String str) throws C8559 {
        HashMap map = this.f14687;
        if (map == null) {
            return;
        }
        C4272 c4272 = (C4272) map.get(str);
        if (str == null || c4272 == null) {
            return;
        }
        for (C4273 c4273 : c4272.m12328()) {
            if (c4273.m12333() != null) {
                int i = this.f14688;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        int i3 = this.f14688 + 1;
                        this.f14688 = i3;
                        m18360(i3);
                        String[] strArr = this.f14691;
                        int i4 = this.f14688;
                        strArr[i4 - 1] = null;
                        this.f14692[i4 - 1] = f14644;
                        this.f14689[i4 - 1] = c4273.m12334();
                        this.f14693[this.f14688 - 1] = c4273.m12333();
                        break;
                    }
                    if (this.f14689[i2].equals(c4273.m12334())) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public void m18355(int i, boolean z) throws C8559 {
        if (i < 32) {
            if (m18386((char) i)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Illegal white space character (code 0x");
            stringBuffer.append(Integer.toHexString(i));
            stringBuffer.append(")");
            throw new C8559(stringBuffer.toString());
        }
        if (i >= 55296) {
            if (i <= 57343) {
                if (z) {
                    return;
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Illegal character (code 0x");
                stringBuffer2.append(Integer.toHexString(i));
                stringBuffer2.append("): surrogate characters are not valid XML characters");
                throw new C8559(stringBuffer2.toString(), mo18330());
            }
            if (i <= 1114111) {
                return;
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Illegal character (code 0x");
            stringBuffer3.append(Integer.toHexString(i));
            stringBuffer3.append("), past max. Unicode character 0x");
            stringBuffer3.append(Integer.toHexString(f14634));
            throw new C8559(stringBuffer3.toString(), mo18330());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public boolean m18356() throws C8559 {
        try {
            BufferedReader bufferedReader = new BufferedReader(this.f14708, 7);
            this.f14708 = bufferedReader;
            bufferedReader.mark(7);
            int i = bufferedReader.read();
            if (i == 65279) {
                bufferedReader.mark(7);
                i = bufferedReader.read();
            }
            if (i == 60 && bufferedReader.read() == 63 && bufferedReader.read() == 120 && bufferedReader.read() == 109 && bufferedReader.read() == 108) {
                bufferedReader.reset();
                return true;
            }
            bufferedReader.reset();
            return false;
        } catch (IOException e) {
            throw new C8559(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public final void m18357() {
        if (mo18341()) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Current state (");
        stringBuffer.append(m18311(this.f14671));
        stringBuffer.append(") does not have textual content");
        throw new IllegalStateException(stringBuffer.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public final void m18358() {
        int i = this.f14671;
        if (i == 4 || i == 12 || i == 5 || i == 6) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("getTextXxx methods cannot be called for ");
        stringBuffer.append(m18311(this.f14671));
        throw new IllegalStateException(stringBuffer.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public void m18359(String str, String str2) throws C8559 {
        m18362();
        char[] charArray = str.toCharArray();
        this.f14703[this.f14702] = m18396(charArray, 0, str.length());
        char[][] cArr = this.f14704;
        int i = this.f14702;
        cArr[i] = charArray;
        this.f14707[i] = str2;
        char[] charArray2 = str2 == null ? f14653 : str2.toCharArray();
        char[][] cArr2 = this.f14706;
        int i2 = this.f14702;
        cArr2[i2] = charArray2;
        if (!this.f14664) {
            int[] iArr = this.f14705;
            char[] cArr3 = this.f14704[i2];
            iArr[i2] = m18312(cArr3, 0, cArr3.length);
        }
        this.f14702++;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public void m18360(int i) {
        String[] strArr = this.f14689;
        int length = strArr != null ? strArr.length : 0;
        if (i >= length) {
            int i2 = i > 7 ? i * 2 : 8;
            boolean z = length > 0;
            String[] strArr2 = new String[i2];
            if (z) {
                System.arraycopy(strArr, 0, strArr2, 0, length);
            }
            this.f14689 = strArr2;
            String[] strArr3 = new String[i2];
            if (z) {
                System.arraycopy(this.f14691, 0, strArr3, 0, length);
            }
            this.f14691 = strArr3;
            String[] strArr4 = new String[i2];
            if (z) {
                System.arraycopy(this.f14692, 0, strArr4, 0, length);
            }
            this.f14692 = strArr4;
            String[] strArr5 = new String[i2];
            if (z) {
                System.arraycopy(this.f14693, 0, strArr5, 0, length);
            }
            this.f14693 = strArr5;
            if (this.f14664) {
                return;
            }
            int[] iArr = new int[i2];
            if (z) {
                System.arraycopy(this.f14690, 0, iArr, 0, length);
            }
            this.f14690 = iArr;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public void m18361() {
        String[] strArr = this.f14676;
        int length = strArr != null ? strArr.length : 0;
        int i = this.f14673;
        if (i + 1 >= length) {
            int i2 = (i >= 7 ? i * 2 : 8) + 2;
            boolean z = length > 0;
            String[] strArr2 = new String[i2];
            if (z) {
                System.arraycopy(strArr, 0, strArr2, 0, length);
            }
            this.f14676 = strArr2;
            String[] strArr3 = new String[i2];
            if (z) {
                System.arraycopy(this.f14677, 0, strArr3, 0, length);
            }
            this.f14677 = strArr3;
            String[] strArr4 = new String[i2];
            if (z) {
                System.arraycopy(this.f14678, 0, strArr4, 0, length);
            }
            this.f14678 = strArr4;
            int[] iArr = new int[i2];
            if (z) {
                System.arraycopy(this.f14679, 0, iArr, 0, length);
            } else {
                iArr[0] = 0;
            }
            this.f14679 = iArr;
            int[] iArr2 = new int[i2];
            if (z) {
                System.arraycopy(this.f14675, 0, iArr2, 0, length);
            }
            this.f14675 = iArr2;
            char[][] cArr = new char[i2][];
            if (z) {
                System.arraycopy(this.f14674, 0, cArr, 0, length);
            }
            this.f14674 = cArr;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public void m18362() {
        char[][] cArr = this.f14706;
        int length = cArr != null ? cArr.length : 0;
        int i = this.f14702;
        if (i >= length) {
            int i2 = i > 7 ? i * 2 : 8;
            String[] strArr = new String[i2];
            char[][] cArr2 = new char[i2][];
            String[] strArr2 = new String[i2];
            char[][] cArr3 = new char[i2][];
            String[] strArr3 = this.f14703;
            if (strArr3 != null) {
                System.arraycopy(strArr3, 0, strArr, 0, i);
                System.arraycopy(this.f14704, 0, cArr2, 0, this.f14702);
                System.arraycopy(this.f14707, 0, strArr2, 0, this.f14702);
                System.arraycopy(this.f14706, 0, cArr3, 0, this.f14702);
            }
            this.f14703 = strArr;
            this.f14704 = cArr2;
            this.f14707 = strArr2;
            this.f14706 = cArr3;
            if (this.f14664) {
                return;
            }
            int[] iArr = new int[i2];
            int[] iArr2 = this.f14705;
            if (iArr2 != null) {
                System.arraycopy(iArr2, 0, iArr, 0, this.f14702);
            }
            this.f14705 = iArr;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public void m18363(int i) {
        String[] strArr = this.f14699;
        if (i >= (strArr != null ? strArr.length : 0)) {
            int i2 = i > 7 ? i * 2 : 8;
            String[] strArr2 = new String[i2];
            String[] strArr3 = new String[i2];
            if (strArr != null) {
                System.arraycopy(strArr, 0, strArr2, 0, this.f14698);
                System.arraycopy(this.f14701, 0, strArr3, 0, this.f14698);
            }
            this.f14699 = strArr2;
            this.f14701 = strArr3;
            if (this.f14664) {
                return;
            }
            int[] iArr = new int[i2];
            int[] iArr2 = this.f14700;
            if (iArr2 != null) {
                System.arraycopy(iArr2, 0, iArr, 0, this.f14698);
            }
            this.f14700 = iArr;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void m18364(int i) {
        String[] strArr = this.f14695;
        if (i >= (strArr != null ? strArr.length : 0)) {
            int i2 = i > 7 ? i * 2 : 8;
            String[] strArr2 = new String[i2];
            String[] strArr3 = new String[i2];
            if (strArr != null) {
                System.arraycopy(strArr, 0, strArr2, 0, this.f14694);
                System.arraycopy(this.f14697, 0, strArr3, 0, this.f14694);
            }
            this.f14695 = strArr2;
            this.f14697 = strArr3;
            if (this.f14664) {
                return;
            }
            int[] iArr = new int[i2];
            int[] iArr2 = this.f14696;
            if (iArr2 != null) {
                System.arraycopy(iArr2, 0, iArr, 0, this.f14694);
            }
            this.f14696 = iArr;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public void m18365(int i) {
        char[] cArr = new char[i > 8192 ? i * 2 : 16384];
        System.arraycopy(this.f14719, 0, cArr, 0, this.f14721);
        this.f14719 = cArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m18366() throws C8559, EOFException {
        boolean z;
        if (this.f14708 == null) {
            throw new C8559("reader must be set before parsing is started");
        }
        int i = this.f14715;
        int i2 = this.f14712;
        if (i > i2) {
            int i3 = this.f14714;
            boolean z2 = true;
            boolean z3 = i3 > i2;
            if (z3) {
                z2 = z3;
            } else {
                if (i3 < this.f14711.length / 2) {
                    z2 = z3;
                    z = true;
                }
                if (!z2) {
                    char[] cArr = this.f14711;
                    System.arraycopy(cArr, i3, cArr, 0, i - i3);
                } else {
                    if (!z) {
                        throw new C8559("internal error in fillBuffer()");
                    }
                    char[] cArr2 = this.f14711;
                    char[] cArr3 = new char[cArr2.length * 2];
                    System.arraycopy(cArr2, i3, cArr3, 0, i - i3);
                    this.f14711 = cArr3;
                    int i4 = this.f14710;
                    if (i4 > 0) {
                        this.f14712 = (i4 * cArr3.length) / 100;
                    }
                }
                int i5 = this.f14715;
                int i6 = this.f14714;
                this.f14715 = i5 - i6;
                this.f14716 -= i6;
                this.f14717 -= i6;
                this.f14718 -= i6;
                this.f14713 += i6;
                this.f14714 = 0;
            }
            z = false;
            if (!z2) {
            }
            int i52 = this.f14715;
            int i62 = this.f14714;
            this.f14715 = i52 - i62;
            this.f14716 -= i62;
            this.f14717 -= i62;
            this.f14718 -= i62;
            this.f14713 += i62;
            this.f14714 = 0;
        }
        char[] cArr4 = this.f14711;
        int length = cArr4.length;
        int i7 = this.f14715;
        int i8 = length - i7;
        if (i8 > 8192) {
            i8 = 8192;
        }
        try {
            int i9 = this.f14708.read(cArr4, i7, i8);
            if (i9 > 0) {
                this.f14715 += i9;
            } else {
                if (i9 == -1) {
                    throw new EOFException("no more data available");
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("error reading input, returned ");
                stringBuffer.append(i9);
                throw new C8559(stringBuffer.toString());
            }
        } catch (IOException e) {
            throw new C8559(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public C4095 m18367() {
        return this.f14735;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public int m18368() {
        return this.f14673;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public boolean m18369(String str) {
        if (str != null) {
            return f14646.equals(str) ? this.f14665 : (f14636.equals(str) || f14637.equals(str) || !f14635.equals(str)) ? false : true;
        }
        throw new IllegalArgumentException("feature name should not be null");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public String m18370() {
        return this.f14709;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public int m18371() {
        return this.f14694 - this.f14679[this.f14673 - 1];
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public final String m18372(int i) {
        return this.f14695[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public final String m18373(int i) {
        return this.f14697[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public String m18374() {
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public int m18375(int i) {
        if (!this.f14665 || i == 0) {
            return 0;
        }
        if (i >= 0) {
            int[] iArr = this.f14679;
            return iArr[i] - iArr[i - 1];
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("namespace count may be 0..");
        stringBuffer.append(this.f14673);
        stringBuffer.append(" not ");
        stringBuffer.append(i);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public Iterator m18376() {
        int[] iArr = this.f14679;
        int i = this.f14673;
        return m18381(i, iArr[i] - iArr[i - 1]);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public String m18377() {
        String string;
        int i = this.f14717;
        int i2 = this.f14716;
        if (i <= i2) {
            int iM18313 = m18313(0, this.f14711, i, i2);
            int i3 = this.f14716;
            str = iM18313 < i3 ? new String(this.f14711, iM18313, i3 - iM18313) : null;
            if (this.f14713 > 0 || iM18313 > 0) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("...");
                stringBuffer.append(str);
                str = stringBuffer.toString();
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(" ");
        if (str != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(" seen ");
            stringBuffer3.append(m18415(str));
            stringBuffer3.append("...");
            string = stringBuffer3.toString();
        } else {
            string = "";
        }
        stringBuffer2.append(string);
        stringBuffer2.append(C4230.f749);
        stringBuffer2.append(mo9160());
        stringBuffer2.append(":");
        stringBuffer2.append(mo9152());
        return stringBuffer2.toString();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public Reader m18378() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public boolean m18379() {
        return mo18351() > 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public boolean m18380() {
        return mo18345() > 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public Iterator m18381(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int i3 = this.f14679[i - 1];
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i4 + i3;
            String strM18372 = m18372(i5);
            if (strM18372 == null) {
                arrayList.add(new C6348(m18373(i5)));
            } else {
                arrayList.add(new C6348(strM18372, m18373(i5)));
            }
        }
        return arrayList.iterator();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public boolean m18382() {
        return this.f14671 == 8;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public boolean m18383() throws C8559 {
        if (this.f14671 == 1) {
            return this.f14672;
        }
        throw new C8559("parser must be on XMLStreamConstants.START_ELEMENT to check for empty element", mo18330());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public boolean m18384(char c) {
        return (c < 1024 && f14650[c]) || (c >= 1024 && c <= 8231) || ((c >= 8234 && c <= 8591) || (c >= 10240 && c <= 65519));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public boolean m18385(char c) {
        return (c < 1024 && f14649[c]) || (c >= 1024 && c <= 8231) || ((c >= 8234 && c <= 8591) || (c >= 10240 && c <= 65519));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public boolean m18386(char c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t';
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public void m18387() {
        int i = this.f14718 - this.f14717;
        int i2 = this.f14721 + i + 1;
        if (i2 >= this.f14719.length) {
            m18365(i2);
        }
        System.arraycopy(this.f14711, this.f14717, this.f14719, this.f14721, i);
        this.f14721 += i;
        this.f14722 = true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public char[] m18388(int i) throws C8559 {
        if (this.f14664) {
            char[] cArr = this.f14711;
            int i2 = this.f14717;
            this.f14731 = m18396(cArr, i2, this.f14718 - i2);
            for (int i3 = this.f14702 - 1; i3 >= 0; i3--) {
                if (this.f14731 == this.f14703[i3]) {
                    if (this.f14729) {
                        this.f14730 = this.f14707[i3];
                    }
                    return this.f14706[i3];
                }
            }
            return null;
        }
        char[] cArr2 = this.f14711;
        int i4 = this.f14717;
        int iM18312 = m18312(cArr2, i4, this.f14718 - i4);
        for (int i5 = this.f14702 - 1; i5 >= 0; i5--) {
            if (iM18312 == this.f14705[i5]) {
                char[] cArr3 = this.f14704[i5];
                if (i == cArr3.length) {
                    for (int i6 = 0; i6 < i; i6++) {
                        if (this.f14711[this.f14717 + i6] != cArr3[i6]) {
                            break;
                        }
                    }
                    if (this.f14729) {
                        this.f14730 = this.f14707[i5];
                    }
                    this.f14731 = this.f14703[i5];
                    return this.f14706[i5];
                }
                continue;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public char m18389() throws C8559, EOFException {
        if (this.f14716 >= this.f14715) {
            m18366();
        }
        char[] cArr = this.f14711;
        int i = this.f14716;
        this.f14716 = i + 1;
        char c = cArr[i];
        if (c == '\n') {
            this.f14667++;
            this.f14668 = 1;
        } else {
            this.f14668++;
        }
        return c;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public boolean m18390() throws C8559 {
        if (mo18326()) {
            return true;
        }
        while (hasNext()) {
            if (mo18326()) {
                return true;
            }
            next();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public boolean m18391(String str) throws C8559 {
        if (str == null) {
            return false;
        }
        while (m18390()) {
            if (str.equals(mo18348())) {
                return true;
            }
            if (!hasNext()) {
                return false;
            }
            next();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public boolean m18392(String str, String str2) throws C8559 {
        if (str != null && str2 != null) {
            while (m18391(str)) {
                if (str2.equals(mo18325())) {
                    return true;
                }
                if (!hasNext()) {
                    return false;
                }
                next();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public boolean m18393() throws C8559 {
        if (mo18328()) {
            return true;
        }
        while (hasNext()) {
            if (mo18328()) {
                return true;
            }
            next();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public boolean m18394(String str) throws C8559 {
        if (str == null) {
            return false;
        }
        while (m18393()) {
            if (str.equals(mo18348())) {
                return true;
            }
            if (!hasNext()) {
                return false;
            }
            next();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public boolean m18395(String str, String str2) throws C8559 {
        if (str != null && str2 != null) {
            while (m18394(str)) {
                if (str2.equals(mo18325())) {
                    return true;
                }
                if (!hasNext()) {
                    return false;
                }
                next();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public String m18396(char[] cArr, int i, int i2) {
        return new String(cArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public String m18397(char[] cArr, int i, int i2) {
        return new String(cArr, i, i2).intern();
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public int m18398() throws C8559 {
        return mo18319();
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public int m18399() throws C8559 {
        char cM18389;
        try {
            this.f14730 = null;
            this.f14714 = this.f14718;
            if (this.f14725) {
                this.f14725 = false;
                int i = this.f14673 - 1;
                this.f14673 = i;
                this.f14694 = this.f14679[i];
            }
            if (this.f14672) {
                this.f14672 = false;
                this.f14725 = true;
                this.f14671 = 2;
                return 2;
            }
            if (this.f14673 <= 0) {
                return this.f14669 ? m18408() : m18410();
            }
            if (this.f14723) {
                this.f14723 = false;
                int iM18411 = m18411();
                this.f14671 = iM18411;
                return iM18411;
            }
            if (this.f14724) {
                this.f14724 = false;
                int iM18406 = m18406();
                this.f14671 = iM18406;
                return iM18406;
            }
            if (this.f14727) {
                this.f14727 = false;
                cM18389 = '<';
            } else if (this.f14726) {
                this.f14726 = false;
                cM18389 = '&';
            } else {
                cM18389 = m18389();
            }
            this.f14717 = this.f14716 - 1;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (cM18389 == '<') {
                    if (z && this.f14729) {
                        this.f14727 = true;
                        this.f14671 = 4;
                        return 4;
                    }
                    char cM183892 = m18389();
                    if (cM183892 == '/') {
                        if (this.f14729 || !z) {
                            int iM184062 = m18406();
                            this.f14671 = iM184062;
                            return iM184062;
                        }
                        this.f14724 = true;
                        this.f14671 = 4;
                        return 4;
                    }
                    if (cM183892 == '!') {
                        char cM183893 = m18389();
                        if (cM183893 == '-') {
                            m18404();
                            if (this.f14729) {
                                this.f14671 = 5;
                                return 5;
                            }
                            if (!this.f14722 && z) {
                                z2 = true;
                            }
                        } else {
                            if (cM183893 != '[') {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("unexpected character in markup ");
                                stringBuffer.append(m18414(cM183893));
                                throw new C8559(stringBuffer.toString(), mo18330());
                            }
                            int i2 = this.f14717;
                            int i3 = this.f14718;
                            m18403();
                            int i4 = this.f14717;
                            int i5 = this.f14718;
                            this.f14717 = i2;
                            this.f14718 = i3;
                            int i6 = i5 - i4;
                            if (i6 > 0) {
                                if (z) {
                                    if (!this.f14722) {
                                        if (i3 > i2) {
                                            m18387();
                                        } else {
                                            this.f14722 = true;
                                            this.f14721 = 0;
                                            this.f14720 = 0;
                                        }
                                    }
                                    int i7 = this.f14721;
                                    if (i7 + i6 >= this.f14719.length) {
                                        m18365(i7 + i6);
                                    }
                                    System.arraycopy(this.f14711, i4, this.f14719, this.f14721, i6);
                                    this.f14721 += i6;
                                } else {
                                    this.f14717 = i4;
                                    this.f14718 = i5;
                                    z2 = true;
                                }
                                z = true;
                            } else if (!this.f14722 && z) {
                                z2 = true;
                            }
                            if (this.f14663) {
                                this.f14671 = 12;
                                return 12;
                            }
                        }
                    } else {
                        if (cM183892 != '?') {
                            if (!m18385(cM183892)) {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append("unexpected character in markup ");
                                stringBuffer2.append(m18414(cM183892));
                                throw new C8559(stringBuffer2.toString(), mo18330());
                            }
                            if (this.f14729 || !z) {
                                int iM184112 = m18411();
                                this.f14671 = iM184112;
                                return iM184112;
                            }
                            this.f14723 = true;
                            this.f14671 = 4;
                            return 4;
                        }
                        m18409();
                        if (this.f14729) {
                            this.f14671 = 3;
                            return 3;
                        }
                        if (!this.f14722 && z) {
                            z2 = true;
                        }
                    }
                } else if (cM18389 != '&') {
                    if (z2) {
                        m18387();
                        z2 = false;
                    }
                    boolean z3 = false;
                    do {
                        if (cM18389 == '\r') {
                            int i8 = this.f14716 - 1;
                            this.f14718 = i8;
                            if (!this.f14722) {
                                if (i8 > this.f14717) {
                                    m18387();
                                } else {
                                    this.f14722 = true;
                                    this.f14721 = 0;
                                    this.f14720 = 0;
                                }
                            }
                            int i9 = this.f14721;
                            if (i9 >= this.f14719.length) {
                                m18365(i9);
                            }
                            char[] cArr = this.f14719;
                            int i10 = this.f14721;
                            this.f14721 = i10 + 1;
                            cArr[i10] = '\n';
                            z3 = true;
                        } else {
                            if (cM18389 == '\n') {
                                if (!z3 && this.f14722) {
                                    int i11 = this.f14721;
                                    if (i11 >= this.f14719.length) {
                                        m18365(i11);
                                    }
                                    char[] cArr2 = this.f14719;
                                    int i12 = this.f14721;
                                    this.f14721 = i12 + 1;
                                    cArr2[i12] = '\n';
                                }
                            } else if (this.f14722) {
                                int i13 = this.f14721;
                                if (i13 >= this.f14719.length) {
                                    m18365(i13);
                                }
                                char[] cArr3 = this.f14719;
                                int i14 = this.f14721;
                                this.f14721 = i14 + 1;
                                cArr3[i14] = cM18389;
                            }
                            z3 = false;
                        }
                        cM18389 = m18389();
                        if (cM18389 == '<') {
                            break;
                        }
                    } while (cM18389 != '&');
                    this.f14718 = this.f14716 - 1;
                    z = true;
                } else {
                    if (this.f14729 && z) {
                        this.f14726 = true;
                        this.f14671 = 4;
                        return 4;
                    }
                    int i15 = this.f14717;
                    int i16 = this.f14718;
                    boolean zM11577 = m18367().m11577();
                    char[] cArrM18407 = m18407(zM11577);
                    if (!zM11577) {
                        this.f14671 = 9;
                        return 9;
                    }
                    this.f14671 = 4;
                    if (cArrM18407 == null) {
                        if (this.f14731 == null) {
                            char[] cArr4 = this.f14711;
                            int i17 = this.f14717;
                            this.f14731 = m18396(cArr4, i17, this.f14718 - i17);
                        }
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("could not resolve entity named '");
                        stringBuffer3.append(m18415(this.f14731));
                        stringBuffer3.append("'");
                        throw new C8559(stringBuffer3.toString(), mo18330());
                    }
                    this.f14717 = i15;
                    this.f14718 = i16;
                    if (!this.f14722) {
                        if (z) {
                            m18387();
                            z2 = false;
                        } else {
                            this.f14722 = true;
                            this.f14721 = 0;
                            this.f14720 = 0;
                        }
                    }
                    for (char c : cArrM18407) {
                        int i18 = this.f14721;
                        if (i18 >= this.f14719.length) {
                            m18365(i18);
                        }
                        char[] cArr5 = this.f14719;
                        int i19 = this.f14721;
                        this.f14721 = i19 + 1;
                        cArr5[i19] = c;
                    }
                    z = true;
                }
                cM18389 = m18389();
            }
        } catch (EOFException e) {
            throw new C8559(f14640, mo18330(), e);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public String m18400() throws C8559 {
        if (mo18329() != 1) {
            throw new C8559("parser must be on START_ELEMENT to read next text", mo18330());
        }
        int next = next();
        if (next != 4) {
            if (next == 2) {
                return "";
            }
            throw new C8559("parser must be on START_ELEMENT or TEXT to read text", mo18330());
        }
        String text = getText();
        if (next() == 2) {
            return text;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("TEXT must be immediately followed by END_ELEMENT and not ");
        stringBuffer.append(C4606.m1561(mo18329()));
        throw new C8559(stringBuffer.toString(), mo18330());
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public int m18401() throws C8559 {
        this.f14729 = true;
        return m18399();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0228 A[PHI: r3
  0x0228: PHI (r3v17 java.lang.String) = (r3v15 java.lang.String), (r3v14 java.lang.String) binds: [B:135:0x0246, B:126:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x025f A[Catch: EOFException -> 0x0029, TryCatch #0 {EOFException -> 0x0029, blocks: (B:3:0x0004, B:5:0x0018, B:8:0x001d, B:9:0x0028, B:12:0x002c, B:18:0x0038, B:19:0x003f, B:21:0x0047, B:26:0x0050, B:47:0x0075, B:48:0x0080, B:51:0x0085, B:52:0x008c, B:53:0x0097, B:54:0x0098, B:55:0x009d, B:61:0x00ae, B:77:0x0152, B:79:0x0158, B:82:0x0161, B:83:0x0165, B:85:0x016b, B:91:0x0179, B:92:0x0197, B:93:0x0198, B:94:0x01a3, B:97:0x01ab, B:100:0x01b1, B:102:0x01b5, B:104:0x01cd, B:107:0x01da, B:116:0x01f5, B:118:0x01fb, B:120:0x0201, B:123:0x0208, B:124:0x0213, B:125:0x0214, B:127:0x021e, B:137:0x024f, B:139:0x025f, B:146:0x026f, B:148:0x0275, B:155:0x029a, B:156:0x02b9, B:154:0x0288, B:151:0x0280, B:142:0x0265, B:157:0x02ba, B:165:0x02f7, B:129:0x022a, B:130:0x0235, B:131:0x0236, B:133:0x0242, B:134:0x0244, B:136:0x0248, B:110:0x01e2, B:111:0x01e9, B:112:0x01ea, B:158:0x02c0, B:159:0x02c7, B:103:0x01c2, B:160:0x02c8, B:162:0x02cc, B:164:0x02f2, B:163:0x02e0, B:171:0x0308, B:173:0x0311, B:175:0x0315, B:176:0x0319, B:177:0x031f, B:179:0x032d, B:181:0x0331, B:182:0x033e, B:183:0x0361, B:185:0x0363, B:187:0x0366, B:189:0x036d, B:190:0x0370, B:196:0x038c, B:198:0x0390, B:200:0x0397, B:201:0x039a, B:202:0x03a5, B:204:0x03a9, B:206:0x03b2, B:207:0x03b6, B:208:0x03bc, B:210:0x03c3, B:213:0x03ca, B:218:0x03de, B:219:0x03e9, B:220:0x03ea, B:221:0x03f5, B:64:0x00c9, B:65:0x00d4, B:68:0x00da, B:70:0x011f, B:72:0x0123, B:69:0x0105, B:73:0x012e, B:75:0x0147), top: B:224:0x0004 }] */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because the return value of "jadx.core.dex.instructions.args.RegisterArg.getSVar()" is null
        	at jadx.core.dex.instructions.args.RegisterArg.sameCodeVar(RegisterArg.java:193)
        	at jadx.core.dex.visitors.PrepareForCodeGen.modifyArith(PrepareForCodeGen.java:242)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:88)
        */
    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public char m18402() throws Yue.C8559 {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "http://www.w3.org/XML/1998/namespace"
            int r2 = r1.f14717     // Catch: java.io.EOFException -> L29
            int r3 = r1.f14713     // Catch: java.io.EOFException -> L29
            int r2 = r2 + r3
            int r4 = r1.f14716     // Catch: java.io.EOFException -> L29
            int r5 = r4 + (-1)
            int r5 = r5 + r3
            char[] r3 = r1.f14711     // Catch: java.io.EOFException -> L29
            r6 = 1
            int r4 = r4 - r6
            char r3 = r3[r4]     // Catch: java.io.EOFException -> L29
            r4 = 58
            if (r3 != r4) goto L2c
            boolean r7 = r1.f14665     // Catch: java.io.EOFException -> L29
            if (r7 != 0) goto L1d
            goto L2c
        L1d:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ     // Catch: java.io.EOFException -> L29
            java.lang.String r2 = "when namespaces processing enabled colon can not be at attribute name start"
            Yue.ۥ۠ۧۧۧ r3 = r16.mo18330()     // Catch: java.io.EOFException -> L29
            r0.<init>(r2, r3)     // Catch: java.io.EOFException -> L29
            throw r0     // Catch: java.io.EOFException -> L29
        L29:
            r0 = move-exception
            goto L3f6
        L2c:
            boolean r7 = r1.f14665     // Catch: java.io.EOFException -> L29
            r8 = 0
            if (r7 == 0) goto L37
            r7 = 120(0x78, float:1.68E-43)
            if (r3 != r7) goto L37
            r3 = r6
            goto L38
        L37:
            r3 = r8
        L38:
            char r7 = r16.m18389()     // Catch: java.io.EOFException -> L29
            r9 = -1
            r10 = r8
            r11 = r9
        L3f:
            boolean r12 = r1.m18384(r7)     // Catch: java.io.EOFException -> L29
            r13 = 4
            r14 = 2
            if (r12 == 0) goto L9d
            boolean r12 = r1.f14665     // Catch: java.io.EOFException -> L29
            if (r12 == 0) goto L98
            if (r3 == 0) goto L81
            r12 = 5
            if (r10 >= r12) goto L81
            int r10 = r10 + 1
            if (r10 != r6) goto L5a
            r12 = 109(0x6d, float:1.53E-43)
            if (r7 == r12) goto L81
        L58:
            r3 = r8
            goto L81
        L5a:
            if (r10 != r14) goto L61
            r12 = 108(0x6c, float:1.51E-43)
            if (r7 == r12) goto L81
            goto L58
        L61:
            r14 = 3
            if (r10 != r14) goto L69
            r12 = 110(0x6e, float:1.54E-43)
            if (r7 == r12) goto L81
            goto L58
        L69:
            if (r10 != r13) goto L70
            r12 = 115(0x73, float:1.61E-43)
            if (r7 == r12) goto L81
            goto L58
        L70:
            if (r10 != r12) goto L81
            if (r7 != r4) goto L75
            goto L81
        L75:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ     // Catch: java.io.EOFException -> L29
            java.lang.String r2 = "after xmlns in attribute name must be colonwhen namespaces are enabled"
            Yue.ۥ۠ۧۧۧ r3 = r16.mo18330()     // Catch: java.io.EOFException -> L29
            r0.<init>(r2, r3)     // Catch: java.io.EOFException -> L29
            throw r0     // Catch: java.io.EOFException -> L29
        L81:
            if (r7 != r4) goto L98
            if (r11 != r9) goto L8c
            int r7 = r1.f14716     // Catch: java.io.EOFException -> L29
            int r7 = r7 - r6
            int r11 = r1.f14713     // Catch: java.io.EOFException -> L29
            int r11 = r11 + r7
            goto L98
        L8c:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ     // Catch: java.io.EOFException -> L29
            java.lang.String r2 = "only one colon is allowed in attribute name when namespaces are enabled"
            Yue.ۥ۠ۧۧۧ r3 = r16.mo18330()     // Catch: java.io.EOFException -> L29
            r0.<init>(r2, r3)     // Catch: java.io.EOFException -> L29
            throw r0     // Catch: java.io.EOFException -> L29
        L98:
            char r7 = r16.m18389()     // Catch: java.io.EOFException -> L29
            goto L3f
        L9d:
            int r4 = r1.f14688     // Catch: java.io.EOFException -> L29
            r1.m18360(r4)     // Catch: java.io.EOFException -> L29
            boolean r4 = r1.f14665     // Catch: java.io.EOFException -> L29
            r12 = 0
            if (r4 == 0) goto L12e
            if (r10 >= r13) goto Laa
            r3 = r8
        Laa:
            if (r3 == 0) goto Ld8
            if (r11 == r9) goto Ld5
            char[] r4 = r1.f14711     // Catch: java.io.EOFException -> L29
            int r5 = r1.f14713     // Catch: java.io.EOFException -> L29
            int r10 = r11 - r5
            int r10 = r10 + r6
            int r13 = r1.f14716     // Catch: java.io.EOFException -> L29
            int r13 = r13 - r14
            int r5 = r11 - r5
            int r13 = r13 - r5
            java.lang.String r4 = r1.m18396(r4, r10, r13)     // Catch: java.io.EOFException -> L29
            java.lang.String r5 = "xmlns"
            boolean r5 = r4.equals(r5)     // Catch: java.io.EOFException -> L29
            if (r5 != 0) goto Lc9
            goto L152
        Lc9:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ     // Catch: java.io.EOFException -> L29
            java.lang.String r2 = "trying to bind reserved NS prefix 'xmlns'"
            Yue.ۥ۠ۧۧۧ r3 = r16.mo18330()     // Catch: java.io.EOFException -> L29
            r0.<init>(r2, r3)     // Catch: java.io.EOFException -> L29
            throw r0     // Catch: java.io.EOFException -> L29
        Ld5:
            r4 = r12
            goto L152
        Ld8:
            if (r11 == r9) goto L105
            java.lang.String[] r4 = r1.f14691     // Catch: java.io.EOFException -> L29
            int r10 = r1.f14688     // Catch: java.io.EOFException -> L29
            char[] r13 = r1.f14711     // Catch: java.io.EOFException -> L29
            int r15 = r1.f14713     // Catch: java.io.EOFException -> L29
            int r15 = r5 - r15
            int r5 = r11 - r5
            java.lang.String r5 = r1.m18396(r13, r15, r5)     // Catch: java.io.EOFException -> L29
            r4[r10] = r5     // Catch: java.io.EOFException -> L29
            java.lang.String[] r4 = r1.f14689     // Catch: java.io.EOFException -> L29
            int r5 = r1.f14688     // Catch: java.io.EOFException -> L29
            char[] r10 = r1.f14711     // Catch: java.io.EOFException -> L29
            int r13 = r1.f14713     // Catch: java.io.EOFException -> L29
            int r15 = r11 - r13
            int r15 = r15 + r6
            int r9 = r1.f14716     // Catch: java.io.EOFException -> L29
            int r9 = r9 - r14
            int r13 = r11 - r13
            int r9 = r9 - r13
            java.lang.String r9 = r1.m18396(r10, r15, r9)     // Catch: java.io.EOFException -> L29
            r4[r5] = r9     // Catch: java.io.EOFException -> L29
            r4 = r9
            goto L11f
        L105:
            java.lang.String[] r4 = r1.f14691     // Catch: java.io.EOFException -> L29
            int r9 = r1.f14688     // Catch: java.io.EOFException -> L29
            r4[r9] = r12     // Catch: java.io.EOFException -> L29
            java.lang.String[] r4 = r1.f14689     // Catch: java.io.EOFException -> L29
            char[] r10 = r1.f14711     // Catch: java.io.EOFException -> L29
            int r13 = r1.f14713     // Catch: java.io.EOFException -> L29
            int r14 = r5 - r13
            int r15 = r1.f14716     // Catch: java.io.EOFException -> L29
            int r15 = r15 - r6
            int r5 = r5 - r13
            int r15 = r15 - r5
            java.lang.String r5 = r1.m18396(r10, r14, r15)     // Catch: java.io.EOFException -> L29
            r4[r9] = r5     // Catch: java.io.EOFException -> L29
            r4 = r5
        L11f:
            boolean r5 = r1.f14664     // Catch: java.io.EOFException -> L29
            if (r5 != 0) goto L152
            int[] r5 = r1.f14690     // Catch: java.io.EOFException -> L29
            int r9 = r1.f14688     // Catch: java.io.EOFException -> L29
            int r10 = r4.hashCode()     // Catch: java.io.EOFException -> L29
            r5[r9] = r10     // Catch: java.io.EOFException -> L29
            goto L152
        L12e:
            java.lang.String[] r4 = r1.f14689     // Catch: java.io.EOFException -> L29
            int r9 = r1.f14688     // Catch: java.io.EOFException -> L29
            char[] r10 = r1.f14711     // Catch: java.io.EOFException -> L29
            int r13 = r1.f14713     // Catch: java.io.EOFException -> L29
            int r14 = r5 - r13
            int r15 = r1.f14716     // Catch: java.io.EOFException -> L29
            int r15 = r15 - r6
            int r5 = r5 - r13
            int r15 = r15 - r5
            java.lang.String r5 = r1.m18396(r10, r14, r15)     // Catch: java.io.EOFException -> L29
            r4[r9] = r5     // Catch: java.io.EOFException -> L29
            boolean r4 = r1.f14664     // Catch: java.io.EOFException -> L29
            if (r4 != 0) goto L151
            int[] r4 = r1.f14690     // Catch: java.io.EOFException -> L29
            int r9 = r1.f14688     // Catch: java.io.EOFException -> L29
            int r10 = r5.hashCode()     // Catch: java.io.EOFException -> L29
            r4[r9] = r10     // Catch: java.io.EOFException -> L29
        L151:
            r4 = r5
        L152:
            boolean r5 = r1.m18386(r7)     // Catch: java.io.EOFException -> L29
            if (r5 == 0) goto L15d
            char r7 = r16.m18389()     // Catch: java.io.EOFException -> L29
            goto L152
        L15d:
            r5 = 61
            if (r7 != r5) goto L3ea
            char r5 = r16.m18389()     // Catch: java.io.EOFException -> L29
        L165:
            boolean r7 = r1.m18386(r5)     // Catch: java.io.EOFException -> L29
            if (r7 == 0) goto L170
            char r5 = r16.m18389()     // Catch: java.io.EOFException -> L29
            goto L165
        L170:
            r7 = 34
            if (r5 == r7) goto L198
            r7 = 39
            if (r5 != r7) goto L179
            goto L198
        L179:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ     // Catch: java.io.EOFException -> L29
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.io.EOFException -> L29
            r2.<init>()     // Catch: java.io.EOFException -> L29
            java.lang.String r3 = "attribute value must start with quotation or apostrophe not "
            r2.append(r3)     // Catch: java.io.EOFException -> L29
            java.lang.String r3 = r1.m18414(r5)     // Catch: java.io.EOFException -> L29
            r2.append(r3)     // Catch: java.io.EOFException -> L29
            java.lang.String r2 = r2.toString()     // Catch: java.io.EOFException -> L29
            Yue.ۥ۠ۧۧۧ r3 = r16.mo18330()     // Catch: java.io.EOFException -> L29
            r0.<init>(r2, r3)     // Catch: java.io.EOFException -> L29
            throw r0     // Catch: java.io.EOFException -> L29
        L198:
            r1.f14722 = r8     // Catch: java.io.EOFException -> L29
            int r7 = r1.f14721     // Catch: java.io.EOFException -> L29
            r1.f14720 = r7     // Catch: java.io.EOFException -> L29
            int r7 = r1.f14716     // Catch: java.io.EOFException -> L29
            r1.f14717 = r7     // Catch: java.io.EOFException -> L29
            r7 = r8
        L1a3:
            char r9 = r16.m18389()     // Catch: java.io.EOFException -> L29
            java.lang.String r10 = "'"
            if (r9 != r5) goto L2fd
            boolean r5 = r1.f14665     // Catch: java.io.EOFException -> L29
            if (r5 == 0) goto L2c8
            if (r3 == 0) goto L2c8
            boolean r3 = r1.f14722     // Catch: java.io.EOFException -> L29
            if (r3 != 0) goto L1c2
            char[] r3 = r1.f14711     // Catch: java.io.EOFException -> L29
            int r5 = r1.f14717     // Catch: java.io.EOFException -> L29
            int r7 = r1.f14716     // Catch: java.io.EOFException -> L29
            int r7 = r7 - r6
            int r7 = r7 - r5
            java.lang.String r3 = r1.m18397(r3, r5, r7)     // Catch: java.io.EOFException -> L29
            goto L1cd
        L1c2:
            char[] r3 = r1.f14719     // Catch: java.io.EOFException -> L29
            int r5 = r1.f14720     // Catch: java.io.EOFException -> L29
            int r7 = r1.f14721     // Catch: java.io.EOFException -> L29
            int r7 = r7 - r5
            java.lang.String r3 = r1.m18397(r3, r5, r7)     // Catch: java.io.EOFException -> L29
        L1cd:
            int r5 = r1.f14694     // Catch: java.io.EOFException -> L29
            r1.m18364(r5)     // Catch: java.io.EOFException -> L29
            boolean r5 = r3.equals(r0)     // Catch: java.io.EOFException -> L29
            java.lang.String r7 = "xml"
            if (r5 == 0) goto L1ea
            boolean r5 = r7.equals(r4)     // Catch: java.io.EOFException -> L29
            if (r5 == 0) goto L1e2
        L1e0:
            r5 = -1
            goto L1f3
        L1e2:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ     // Catch: java.io.EOFException -> L29
            java.lang.String r2 = "trying to bind reserved NS URI  'http://www.w3.org/XML/1998/namespace' to prefix other than 'xml'"
            r0.<init>(r2)     // Catch: java.io.EOFException -> L29
            throw r0     // Catch: java.io.EOFException -> L29
        L1ea:
            java.lang.String r5 = "http://www.w3.org/2000/xmlns/"
            boolean r5 = r3.equals(r5)     // Catch: java.io.EOFException -> L29
            if (r5 != 0) goto L2c0
            goto L1e0
        L1f3:
            if (r11 == r5) goto L236
            int r5 = r3.length()     // Catch: java.io.EOFException -> L29
            if (r5 == 0) goto L22a
            boolean r5 = r4.equals(r7)     // Catch: java.io.EOFException -> L29
            if (r5 == 0) goto L214
            boolean r0 = r3.equals(r0)     // Catch: java.io.EOFException -> L29
            if (r0 == 0) goto L208
            goto L214
        L208:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ     // Catch: java.io.EOFException -> L29
            java.lang.String r2 = "trying to bind reserved NS prefix 'xml' to URI other than its standard value (http://www.w3.org/XML/1998/namespace)"
            Yue.ۥ۠ۧۧۧ r3 = r16.mo18330()     // Catch: java.io.EOFException -> L29
            r0.<init>(r2, r3)     // Catch: java.io.EOFException -> L29
            throw r0     // Catch: java.io.EOFException -> L29
        L214:
            java.lang.String[] r0 = r1.f14695     // Catch: java.io.EOFException -> L29
            int r5 = r1.f14694     // Catch: java.io.EOFException -> L29
            r0[r5] = r4     // Catch: java.io.EOFException -> L29
            boolean r0 = r1.f14664     // Catch: java.io.EOFException -> L29
            if (r0 != 0) goto L228
            int[] r0 = r1.f14696     // Catch: java.io.EOFException -> L29
            int r7 = r4.hashCode()     // Catch: java.io.EOFException -> L29
            r0[r5] = r7     // Catch: java.io.EOFException -> L29
            r13 = r7
            goto L24f
        L228:
            r13 = -1
            goto L24f
        L22a:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ     // Catch: java.io.EOFException -> L29
            java.lang.String r2 = "non-default namespace can not be declared to be empty string (in xml 1.0)"
            Yue.ۥ۠ۧۧۧ r3 = r16.mo18330()     // Catch: java.io.EOFException -> L29
            r0.<init>(r2, r3)     // Catch: java.io.EOFException -> L29
            throw r0     // Catch: java.io.EOFException -> L29
        L236:
            java.lang.String[] r0 = r1.f14695     // Catch: java.io.EOFException -> L29
            int r5 = r1.f14694     // Catch: java.io.EOFException -> L29
            r0[r5] = r12     // Catch: java.io.EOFException -> L29
            int r0 = r3.length()     // Catch: java.io.EOFException -> L29
            if (r0 != 0) goto L244
            java.lang.String r3 = Yue.C5901.f14644     // Catch: java.io.EOFException -> L29
        L244:
            boolean r0 = r1.f14664     // Catch: java.io.EOFException -> L29
            if (r0 != 0) goto L228
            int[] r0 = r1.f14696     // Catch: java.io.EOFException -> L29
            int r5 = r1.f14694     // Catch: java.io.EOFException -> L29
            r13 = -1
            r0[r5] = r13     // Catch: java.io.EOFException -> L29
        L24f:
            java.lang.String[] r0 = r1.f14697     // Catch: java.io.EOFException -> L29
            int r5 = r1.f14694     // Catch: java.io.EOFException -> L29
            r0[r5] = r3     // Catch: java.io.EOFException -> L29
            int[] r0 = r1.f14679     // Catch: java.io.EOFException -> L29
            int r3 = r1.f14673     // Catch: java.io.EOFException -> L29
            int r3 = r3 - r6
            r0 = r0[r3]     // Catch: java.io.EOFException -> L29
            int r5 = r5 - r6
        L25d:
            if (r5 < r0) goto L2ba
            boolean r3 = r1.f14664     // Catch: java.io.EOFException -> L29
            if (r3 != 0) goto L265
            if (r4 != 0) goto L26b
        L265:
            java.lang.String[] r7 = r1.f14695     // Catch: java.io.EOFException -> L29
            r7 = r7[r5]     // Catch: java.io.EOFException -> L29
            if (r7 == r4) goto L283
        L26b:
            if (r3 != 0) goto L280
            if (r4 == 0) goto L280
            int[] r3 = r1.f14696     // Catch: java.io.EOFException -> L29
            r3 = r3[r5]     // Catch: java.io.EOFException -> L29
            if (r3 != r13) goto L280
            java.lang.String[] r3 = r1.f14695     // Catch: java.io.EOFException -> L29
            r3 = r3[r5]     // Catch: java.io.EOFException -> L29
            boolean r3 = r4.equals(r3)     // Catch: java.io.EOFException -> L29
            if (r3 == 0) goto L280
            goto L283
        L280:
            int r5 = r5 + (-1)
            goto L25d
        L283:
            if (r4 != 0) goto L288
            java.lang.String r0 = "default"
            goto L29a
        L288:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.io.EOFException -> L29
            r0.<init>()     // Catch: java.io.EOFException -> L29
            r0.append(r10)     // Catch: java.io.EOFException -> L29
            r0.append(r4)     // Catch: java.io.EOFException -> L29
            r0.append(r10)     // Catch: java.io.EOFException -> L29
            java.lang.String r0 = r0.toString()     // Catch: java.io.EOFException -> L29
        L29a:
            Yue.ۥۢۦۢۢ r2 = new Yue.ۥۢۦۢۢ     // Catch: java.io.EOFException -> L29
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch: java.io.EOFException -> L29
            r3.<init>()     // Catch: java.io.EOFException -> L29
            java.lang.String r4 = "duplicated namespace declaration for "
            r3.append(r4)     // Catch: java.io.EOFException -> L29
            r3.append(r0)     // Catch: java.io.EOFException -> L29
            java.lang.String r0 = " prefix"
            r3.append(r0)     // Catch: java.io.EOFException -> L29
            java.lang.String r0 = r3.toString()     // Catch: java.io.EOFException -> L29
            Yue.ۥ۠ۧۧۧ r3 = r16.mo18330()     // Catch: java.io.EOFException -> L29
            r2.<init>(r0, r3)     // Catch: java.io.EOFException -> L29
            throw r2     // Catch: java.io.EOFException -> L29
        L2ba:
            int r0 = r1.f14694     // Catch: java.io.EOFException -> L29
            int r0 = r0 + r6
            r1.f14694 = r0     // Catch: java.io.EOFException -> L29
            goto L2f7
        L2c0:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ     // Catch: java.io.EOFException -> L29
            java.lang.String r2 = "trying to bind reserved NS URI  'http://www.w3.org/2000/xmlns/'"
            r0.<init>(r2)     // Catch: java.io.EOFException -> L29
            throw r0     // Catch: java.io.EOFException -> L29
        L2c8:
            boolean r0 = r1.f14722     // Catch: java.io.EOFException -> L29
            if (r0 != 0) goto L2e0
            java.lang.String[] r0 = r1.f14693     // Catch: java.io.EOFException -> L29
            int r3 = r1.f14688     // Catch: java.io.EOFException -> L29
            java.lang.String r4 = new java.lang.String     // Catch: java.io.EOFException -> L29
            char[] r5 = r1.f14711     // Catch: java.io.EOFException -> L29
            int r7 = r1.f14717     // Catch: java.io.EOFException -> L29
            int r8 = r1.f14716     // Catch: java.io.EOFException -> L29
            int r8 = r8 - r6
            int r8 = r8 - r7
            r4.<init>(r5, r7, r8)     // Catch: java.io.EOFException -> L29
            r0[r3] = r4     // Catch: java.io.EOFException -> L29
            goto L2f2
        L2e0:
            java.lang.String[] r0 = r1.f14693     // Catch: java.io.EOFException -> L29
            int r3 = r1.f14688     // Catch: java.io.EOFException -> L29
            java.lang.String r4 = new java.lang.String     // Catch: java.io.EOFException -> L29
            char[] r5 = r1.f14719     // Catch: java.io.EOFException -> L29
            int r7 = r1.f14720     // Catch: java.io.EOFException -> L29
            int r8 = r1.f14721     // Catch: java.io.EOFException -> L29
            int r8 = r8 - r7
            r4.<init>(r5, r7, r8)     // Catch: java.io.EOFException -> L29
            r0[r3] = r4     // Catch: java.io.EOFException -> L29
        L2f2:
            int r0 = r1.f14688     // Catch: java.io.EOFException -> L29
            int r0 = r0 + r6
            r1.f14688 = r0     // Catch: java.io.EOFException -> L29
        L2f7:
            int r0 = r1.f14713     // Catch: java.io.EOFException -> L29
            int r2 = r2 - r0
            r1.f14717 = r2     // Catch: java.io.EOFException -> L29
            return r9
        L2fd:
            r13 = -1
            r14 = 60
            if (r9 == r14) goto L3de
            r14 = 38
            r15 = 13
            if (r9 != r14) goto L381
            int r7 = r1.f14716     // Catch: java.io.EOFException -> L29
            int r7 = r7 - r6
            r1.f14718 = r7     // Catch: java.io.EOFException -> L29
            boolean r14 = r1.f14722     // Catch: java.io.EOFException -> L29
            if (r14 != 0) goto L31f
            int r14 = r1.f14717     // Catch: java.io.EOFException -> L29
            if (r7 <= r14) goto L319
            r16.m18387()     // Catch: java.io.EOFException -> L29
            goto L31f
        L319:
            r1.f14722 = r6     // Catch: java.io.EOFException -> L29
            r1.f14721 = r8     // Catch: java.io.EOFException -> L29
            r1.f14720 = r8     // Catch: java.io.EOFException -> L29
        L31f:
            Yue.ۥ۟ۦۧ۟ r7 = r16.m18367()     // Catch: java.io.EOFException -> L29
            boolean r7 = r7.m11577()     // Catch: java.io.EOFException -> L29
            char[] r7 = r1.m18407(r7)     // Catch: java.io.EOFException -> L29
            if (r7 != 0) goto L362
            java.lang.String r0 = r1.f14731     // Catch: java.io.EOFException -> L29
            if (r0 != 0) goto L33e
            char[] r0 = r1.f14711     // Catch: java.io.EOFException -> L29
            int r2 = r1.f14717     // Catch: java.io.EOFException -> L29
            int r3 = r1.f14718     // Catch: java.io.EOFException -> L29
            int r3 = r3 - r2
            java.lang.String r0 = r1.m18396(r0, r2, r3)     // Catch: java.io.EOFException -> L29
            r1.f14731 = r0     // Catch: java.io.EOFException -> L29
        L33e:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ     // Catch: java.io.EOFException -> L29
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.io.EOFException -> L29
            r2.<init>()     // Catch: java.io.EOFException -> L29
            java.lang.String r3 = "could not resolve entity named '"
            r2.append(r3)     // Catch: java.io.EOFException -> L29
            java.lang.String r3 = r1.f14731     // Catch: java.io.EOFException -> L29
            java.lang.String r3 = r1.m18415(r3)     // Catch: java.io.EOFException -> L29
            r2.append(r3)     // Catch: java.io.EOFException -> L29
            r2.append(r10)     // Catch: java.io.EOFException -> L29
            java.lang.String r2 = r2.toString()     // Catch: java.io.EOFException -> L29
            Yue.ۥ۠ۧۧۧ r3 = r16.mo18330()     // Catch: java.io.EOFException -> L29
            r0.<init>(r2, r3)     // Catch: java.io.EOFException -> L29
            throw r0     // Catch: java.io.EOFException -> L29
        L362:
            r10 = r8
        L363:
            int r14 = r7.length     // Catch: java.io.EOFException -> L29
            if (r10 >= r14) goto L3d6
            int r14 = r1.f14721     // Catch: java.io.EOFException -> L29
            char[] r12 = r1.f14719     // Catch: java.io.EOFException -> L29
            int r12 = r12.length     // Catch: java.io.EOFException -> L29
            if (r14 < r12) goto L370
            r1.m18365(r14)     // Catch: java.io.EOFException -> L29
        L370:
            char[] r12 = r1.f14719     // Catch: java.io.EOFException -> L29
            int r14 = r1.f14721     // Catch: java.io.EOFException -> L29
            int r13 = r14 + 1
            r1.f14721 = r13     // Catch: java.io.EOFException -> L29
            char r13 = r7[r10]     // Catch: java.io.EOFException -> L29
            r12[r14] = r13     // Catch: java.io.EOFException -> L29
            int r10 = r10 + 1
            r12 = 0
            r13 = -1
            goto L363
        L381:
            r10 = 9
            r12 = 10
            if (r9 == r10) goto L3a5
            if (r9 == r12) goto L3a5
            if (r9 != r15) goto L38c
            goto L3a5
        L38c:
            boolean r7 = r1.f14722     // Catch: java.io.EOFException -> L29
            if (r7 == 0) goto L3d6
            int r7 = r1.f14721     // Catch: java.io.EOFException -> L29
            char[] r10 = r1.f14719     // Catch: java.io.EOFException -> L29
            int r10 = r10.length     // Catch: java.io.EOFException -> L29
            if (r7 < r10) goto L39a
            r1.m18365(r7)     // Catch: java.io.EOFException -> L29
        L39a:
            char[] r7 = r1.f14719     // Catch: java.io.EOFException -> L29
            int r10 = r1.f14721     // Catch: java.io.EOFException -> L29
            int r12 = r10 + 1
            r1.f14721 = r12     // Catch: java.io.EOFException -> L29
            r7[r10] = r9     // Catch: java.io.EOFException -> L29
            goto L3d6
        L3a5:
            boolean r10 = r1.f14722     // Catch: java.io.EOFException -> L29
            if (r10 != 0) goto L3bc
            int r10 = r1.f14716     // Catch: java.io.EOFException -> L29
            int r10 = r10 - r6
            r1.f14718 = r10     // Catch: java.io.EOFException -> L29
            int r13 = r1.f14717     // Catch: java.io.EOFException -> L29
            if (r10 <= r13) goto L3b6
            r16.m18387()     // Catch: java.io.EOFException -> L29
            goto L3bc
        L3b6:
            r1.f14722 = r6     // Catch: java.io.EOFException -> L29
            r1.f14720 = r8     // Catch: java.io.EOFException -> L29
            r1.f14721 = r8     // Catch: java.io.EOFException -> L29
        L3bc:
            int r10 = r1.f14721     // Catch: java.io.EOFException -> L29
            char[] r13 = r1.f14719     // Catch: java.io.EOFException -> L29
            int r13 = r13.length     // Catch: java.io.EOFException -> L29
            if (r10 < r13) goto L3c6
            r1.m18365(r10)     // Catch: java.io.EOFException -> L29
        L3c6:
            if (r9 != r12) goto L3ca
            if (r7 != 0) goto L3d6
        L3ca:
            char[] r7 = r1.f14719     // Catch: java.io.EOFException -> L29
            int r10 = r1.f14721     // Catch: java.io.EOFException -> L29
            int r12 = r10 + 1
            r1.f14721 = r12     // Catch: java.io.EOFException -> L29
            r12 = 32
            r7[r10] = r12     // Catch: java.io.EOFException -> L29
        L3d6:
            if (r9 != r15) goto L3da
            r7 = r6
            goto L3db
        L3da:
            r7 = r8
        L3db:
            r12 = 0
            goto L1a3
        L3de:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ     // Catch: java.io.EOFException -> L29
            java.lang.String r2 = "markup not allowed inside attribute value - illegal < "
            Yue.ۥ۠ۧۧۧ r3 = r16.mo18330()     // Catch: java.io.EOFException -> L29
            r0.<init>(r2, r3)     // Catch: java.io.EOFException -> L29
            throw r0     // Catch: java.io.EOFException -> L29
        L3ea:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ     // Catch: java.io.EOFException -> L29
            java.lang.String r2 = "expected = after attribute name"
            Yue.ۥ۠ۧۧۧ r3 = r16.mo18330()     // Catch: java.io.EOFException -> L29
            r0.<init>(r2, r3)     // Catch: java.io.EOFException -> L29
            throw r0     // Catch: java.io.EOFException -> L29
        L3f6:
            Yue.ۥۢۦۢۢ r2 = new Yue.ۥۢۦۢۢ
            java.lang.String r3 = "Unexpected end of stream"
            Yue.ۥ۠ۧۧۧ r4 = r16.mo18330()
            r2.<init>(r3, r4, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Yue.C5901.m18402():char");
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public void m18403() throws C8559 {
        try {
            if (m18389() != 'C' || m18389() != 'D' || m18389() != 'A' || m18389() != 'T' || m18389() != 'A' || m18389() != '[') {
                throw new C8559("expected <[CDATA[ for CDATA start", mo18330());
            }
            this.f14717 = this.f14716;
            int i = this.f14667;
            int i2 = this.f14668;
            int i3 = -2;
            int i4 = -1;
            int i5 = 0;
            boolean z = false;
            while (true) {
                int i6 = i4 + 1;
                try {
                    char cM18389 = m18389();
                    if (cM18389 == ']') {
                        i5++;
                    } else {
                        if (cM18389 == '>') {
                            if (i5 >= 2) {
                                break;
                            }
                        } else if (cM18389 == '\r') {
                            this.f14668 = 1;
                            i3 = i4 + 2;
                            if (z) {
                                i5 = 0;
                                cM18389 = '\n';
                            } else {
                                this.f14711[this.f14716 - 1] = '\n';
                                i5 = 0;
                                i4 = i6;
                            }
                        } else if (cM18389 == '\n' && i3 == i6) {
                            this.f14718 = this.f14716 - 1;
                            i5 = 0;
                            i4 = i6;
                            z = true;
                        }
                        i5 = 0;
                    }
                    if (z) {
                        char[] cArr = this.f14711;
                        int i7 = this.f14718;
                        cArr[i7] = cM18389;
                        this.f14718 = i7 + 1;
                    }
                    i4 = i6;
                } catch (EOFException e) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("CDATA section on line ");
                    stringBuffer.append(i);
                    stringBuffer.append(" and column ");
                    stringBuffer.append(i2);
                    stringBuffer.append(" was not closed");
                    throw new C8559(stringBuffer.toString(), mo18330(), e);
                }
            }
            if (z) {
                this.f14718 -= 2;
            } else {
                this.f14718 = this.f14716 - 3;
            }
        } catch (EOFException e2) {
            throw new C8559("Unexpected EOF in directive", mo18330(), e2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public void m18404() throws C8559 {
        try {
            if (m18389() != '-') {
                throw new C8559("expected <!-- for COMMENT start", mo18330());
            }
            this.f14717 = this.f14716;
            int i = this.f14667;
            int i2 = this.f14668;
            int i3 = -2;
            boolean z = false;
            int i4 = -1;
            int i5 = -2;
            while (true) {
                try {
                    char cM18389 = m18389();
                    int i6 = i4 + 1;
                    if (cM18389 == '-') {
                        if (i3 >= i6) {
                            break;
                        } else {
                            i3 = i4 + 2;
                        }
                    } else if (cM18389 == '\r') {
                        this.f14668 = 1;
                        i5 = i4 + 2;
                        if (z) {
                            cM18389 = '\n';
                        } else {
                            this.f14711[this.f14716 - 1] = '\n';
                            i4 = i6;
                        }
                    } else if (cM18389 == '\n' && i5 == i6) {
                        if (z) {
                            i4 = i6;
                        } else {
                            this.f14718 = this.f14716 - 1;
                            i4 = i6;
                            z = true;
                        }
                    }
                    if (z) {
                        char[] cArr = this.f14711;
                        int i7 = this.f14718;
                        cArr[i7] = cM18389;
                        this.f14718 = i7 + 1;
                    }
                    i4 = i6;
                } catch (EOFException e) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("COMMENT started on line ");
                    stringBuffer.append(i);
                    stringBuffer.append(" and column ");
                    stringBuffer.append(i2);
                    stringBuffer.append(" was not closed");
                    throw new C8559(stringBuffer.toString(), mo18330(), e);
                }
            }
            char cM183892 = m18389();
            if (cM183892 != '>') {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("in COMMENT after two dashes (--) next character must be '>' not ");
                stringBuffer2.append(m18414(cM183892));
                throw new C8559(stringBuffer2.toString(), mo18330());
            }
            if (z) {
                this.f14718--;
            } else {
                this.f14718 = this.f14716 - 3;
            }
        } catch (EOFException e2) {
            throw new C8559(f14640, mo18330(), e2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public void m18405() throws C8559 {
        char cM18389;
        this.f14717 = this.f14716 - 3;
        try {
            if (m18389() != 'O' || m18389() != 'C' || m18389() != 'T' || m18389() != 'Y' || m18389() != 'P' || m18389() != 'E') {
                throw new C8559("expected <!DOCTYPE", mo18330());
            }
            char cM18419 = m18419();
            if (!m18385(cM18419)) {
                m18432(cM18419);
            }
            do {
                cM18389 = m18389();
            } while (m18384(cM18389));
            char cM18428 = m18428(cM18389);
            if (cM18428 == 'S' || cM18428 == 'P') {
                if (cM18428 == 'S') {
                    if (m18389() != 'Y' || m18389() != 'S' || m18389() != 'T' || m18389() != 'E' || m18389() != 'M') {
                        throw new C8559("expected keyword SYSTEM", mo18330());
                    }
                } else {
                    if (m18389() != 'U' || m18389() != 'B' || m18389() != 'L' || m18389() != 'I' || m18389() != 'C') {
                        throw new C8559("expected keyword PUBLIC", mo18330());
                    }
                    char cM184192 = m18419();
                    if (cM184192 != '\"' && cM184192 != '\'') {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Public identifier has to be enclosed in quotes, not ");
                        stringBuffer.append(m18414(cM18428));
                        throw new C8559(stringBuffer.toString(), mo18330());
                    }
                    do {
                        cM18428 = m18389();
                    } while (cM18428 != cM184192);
                }
                char cM184193 = m18419();
                if (cM184193 != '\"' && cM184193 != '\'') {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("System identifier has to be enclosed in quotes, not ");
                    stringBuffer2.append(m18414(cM18428));
                    throw new C8559(stringBuffer2.toString(), mo18330());
                }
                while (m18389() != cM184193) {
                }
                cM18428 = m18428(m18389());
            }
            if (cM18428 != '[') {
                int i = this.f14716;
                this.f14718 = i;
                this.f14717 = i;
                char cM184282 = m18428(cM18428);
                if (cM184282 == '>') {
                    return;
                }
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Expected closing '>' after internal DTD subset, not '");
                stringBuffer3.append(m18414(cM184282));
                stringBuffer3.append("'");
                throw new C8559(stringBuffer3.toString(), mo18330());
            }
            this.f14717 = this.f14716;
            int i2 = 1;
            while (true) {
                char cM183892 = m18389();
                if (cM183892 == '\"' || cM183892 == '\'') {
                    while (m18389() != cM183892) {
                    }
                } else if (cM183892 != '>') {
                    if (cM183892 == '[') {
                        i2++;
                    } else if (cM183892 == ']') {
                        i2--;
                    }
                } else if (i2 <= 0) {
                    this.f14718 = this.f14716 - 2;
                    m18416();
                    return;
                }
            }
        } catch (EOFException e) {
            throw new C8559(f14640, mo18330(), e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public int m18406() throws C8559 {
        char cM18389;
        this.f14671 = 2;
        try {
            char cM183892 = m18389();
            if (!m18385(cM183892)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("expected name start and not ");
                stringBuffer.append(m18414(cM183892));
                throw new C8559(stringBuffer.toString(), mo18330());
            }
            int i = this.f14716;
            this.f14717 = i - 3;
            int i2 = (i - 1) + this.f14713;
            do {
                cM18389 = m18389();
            } while (m18384(cM18389));
            int i3 = this.f14716 - 1;
            int i4 = i2 - this.f14713;
            int i5 = i3 - i4;
            char[][] cArr = this.f14674;
            int i6 = this.f14673;
            char[] cArr2 = cArr[i6];
            int i7 = this.f14675[i6];
            if (i7 != i5) {
                String str = new String(cArr2, 0, i7);
                String str2 = new String(this.f14711, i4, i5);
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("end tag name '");
                stringBuffer2.append(str2);
                stringBuffer2.append("' must match start tag name '");
                stringBuffer2.append(str);
                stringBuffer2.append("'");
                throw new C8559(stringBuffer2.toString(), mo18330());
            }
            int i8 = 0;
            while (i8 < i5) {
                int i9 = i4 + 1;
                if (this.f14711[i4] != cArr2[i8]) {
                    String str3 = new String(cArr2, 0, i5);
                    String str4 = new String(this.f14711, (i9 - i8) - 1, i5);
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("end tag name '");
                    stringBuffer3.append(str4);
                    stringBuffer3.append("' must be the same as start tag '");
                    stringBuffer3.append(str3);
                    stringBuffer3.append("'");
                    throw new C8559(stringBuffer3.toString(), mo18330());
                }
                i8++;
                i4 = i9;
            }
            while (m18386(cM18389)) {
                cM18389 = m18389();
            }
            if (cM18389 == '>') {
                this.f14718 = this.f14716;
                this.f14725 = true;
                return 2;
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("expected > to finsh end tag not ");
            stringBuffer4.append(m18414(cM18389));
            throw new C8559(stringBuffer4.toString(), mo18330());
        } catch (EOFException e) {
            throw new C8559(f14640, mo18330(), e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public char[] m18407(boolean z) throws C8559 {
        int i;
        int i2;
        try {
            this.f14731 = null;
            this.f14717 = this.f14716;
            if (m18389() == '#') {
                char cM18389 = m18389();
                if (cM18389 == 'x') {
                    i = 0;
                    do {
                        char cM183892 = m18389();
                        if (cM183892 == ';') {
                            break;
                        }
                        int i3 = i << 4;
                        if (cM183892 >= '0' && cM183892 <= '9') {
                            i2 = cM183892 - 48;
                        } else if (cM183892 >= 'a' && cM183892 <= 'f') {
                            i2 = cM183892 - 87;
                        } else {
                            if (cM183892 < 'A' || cM183892 > 'F') {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("character reference (with hex value) may not contain ");
                                stringBuffer.append(m18414(cM183892));
                                throw new C8559(stringBuffer.toString(), mo18330());
                            }
                            i2 = cM183892 - 55;
                        }
                        i = i3 + i2;
                    } while (i <= 1114111);
                } else {
                    int i4 = 0;
                    while (cM18389 >= '0' && cM18389 <= '9') {
                        i4 = (i4 * 10) + (cM18389 - '0');
                        cM18389 = m18389();
                        if (i4 > 1114111) {
                            break;
                        }
                    }
                    if (cM18389 != ';') {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("character reference (with decimal value) may not contain ");
                        stringBuffer2.append(m18414(cM18389));
                        throw new C8559(stringBuffer2.toString(), mo18330());
                    }
                    i = i4;
                }
                this.f14718 = this.f14716 - 1;
                m18355(i, false);
                if (i <= 65535) {
                    char[] cArr = this.f14733;
                    cArr[0] = (char) i;
                    this.f14732 = cArr;
                    return cArr;
                }
                if (this.f14734 == null) {
                    this.f14734 = new char[2];
                }
                int i5 = i - 65536;
                char[] cArr2 = this.f14734;
                cArr2[0] = (char) ((i5 >> 10) + 55296);
                cArr2[1] = (char) ((i5 & 1023) + C8149.f24171);
                this.f14732 = cArr2;
                return cArr2;
            }
            while (m18389() != ';') {
            }
            int i6 = this.f14716 - 1;
            this.f14718 = i6;
            int i7 = this.f14717;
            int i8 = i6 - i7;
            if (i8 == 2) {
                char[] cArr3 = this.f14711;
                char c = cArr3[i7];
                if (c == 'l' && cArr3[i7 + 1] == 't') {
                    if (!z) {
                        this.f14730 = "<";
                    }
                    char[] cArr4 = this.f14733;
                    cArr4[0] = C8039.f23875;
                    this.f14732 = cArr4;
                    return cArr4;
                }
                if (c == 'g' && cArr3[i7 + 1] == 't') {
                    if (!z) {
                        this.f14730 = ">";
                    }
                    char[] cArr5 = this.f14733;
                    cArr5[0] = C8039.f23876;
                    this.f14732 = cArr5;
                    return cArr5;
                }
            } else if (i8 == 3) {
                char[] cArr6 = this.f14711;
                if (cArr6[i7] == 'a' && cArr6[i7 + 1] == 'm' && cArr6[i7 + 2] == 'p') {
                    if (!z) {
                        this.f14730 = "&";
                    }
                    char[] cArr7 = this.f14733;
                    cArr7[0] = C8039.f23874;
                    this.f14732 = cArr7;
                    return cArr7;
                }
            } else if (i8 == 4) {
                char[] cArr8 = this.f14711;
                char c2 = cArr8[i7];
                if (c2 == 'a' && cArr8[i7 + 1] == 'p' && cArr8[i7 + 2] == 'o' && cArr8[i7 + 3] == 's') {
                    if (!z) {
                        this.f14730 = "'";
                    }
                    char[] cArr9 = this.f14733;
                    cArr9[0] = '\'';
                    this.f14732 = cArr9;
                    return cArr9;
                }
                if (c2 == 'q' && cArr8[i7 + 1] == 'u' && cArr8[i7 + 2] == 'o' && cArr8[i7 + 3] == 't') {
                    if (!z) {
                        this.f14730 = "\"";
                    }
                    char[] cArr10 = this.f14733;
                    cArr10[0] = C8039.f3212;
                    this.f14732 = cArr10;
                    return cArr10;
                }
            }
            char[] cArrM18388 = m18388(i8);
            this.f14732 = cArrM18388;
            return cArrM18388;
        } catch (EOFException e) {
            throw new C8559(f14640, mo18330(), e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public int m18408() throws C8559 {
        if (this.f14671 == 8) {
            throw new C8559("already reached end document", mo18330());
        }
        if (this.f14670) {
            this.f14671 = 8;
            return 8;
        }
        boolean z = false;
        try {
            char cM18389 = this.f14727 ? this.f14711[this.f14716 - 1] : m18389();
            this.f14727 = false;
            this.f14717 = this.f14716 - 1;
            while (true) {
                if (cM18389 == '<') {
                    if (z && this.f14729) {
                        this.f14718 = this.f14716 - 1;
                        this.f14727 = true;
                        this.f14671 = 6;
                        return 6;
                    }
                    char cM183892 = m18389();
                    if (cM183892 == '?') {
                        m18409();
                        if (this.f14729) {
                            this.f14671 = 3;
                            return 3;
                        }
                    } else {
                        if (cM183892 != '!') {
                            if (cM183892 == '/') {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("end tag not allowed in epilog but got ");
                                stringBuffer.append(m18414(cM183892));
                                throw new C8559(stringBuffer.toString(), mo18330());
                            }
                            if (m18385(cM183892)) {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append("start tag not allowed in epilog but got ");
                                stringBuffer2.append(m18414(cM183892));
                                throw new C8559(stringBuffer2.toString(), mo18330());
                            }
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("in epilog expected ignorable content and not ");
                            stringBuffer3.append(m18414(cM183892));
                            throw new C8559(stringBuffer3.toString(), mo18330());
                        }
                        char cM183893 = m18389();
                        if (cM183893 == 'D') {
                            m18405();
                            if (this.f14729) {
                                this.f14671 = 11;
                                return 11;
                            }
                        } else {
                            if (cM183893 != '-') {
                                StringBuffer stringBuffer4 = new StringBuffer();
                                stringBuffer4.append("unexpected markup <!");
                                stringBuffer4.append(m18414(cM183893));
                                throw new C8559(stringBuffer4.toString(), mo18330());
                            }
                            m18404();
                            if (this.f14729) {
                                this.f14671 = 5;
                                return 5;
                            }
                        }
                    }
                } else {
                    if (!m18386(cM18389)) {
                        StringBuffer stringBuffer5 = new StringBuffer();
                        stringBuffer5.append("in epilog non whitespace content is not allowed but got ");
                        stringBuffer5.append(m18414(cM18389));
                        throw new C8559(stringBuffer5.toString(), mo18330());
                    }
                    z = true;
                }
                cM18389 = m18389();
            }
        } catch (EOFException unused) {
            this.f14670 = true;
            if (!this.f14729 || 0 == 0) {
                this.f14671 = 8;
                return 8;
            }
            this.f14718 = this.f14716;
            this.f14671 = 6;
            return 6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r5 = r14.f14716;
        r6 = r14.f14717;
        r7 = true;
        r5 = (r5 - r6) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r5 == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r14.f14684 = new java.lang.String(r14.f14711, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r3 == '?') goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r3 = m18428(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        r5 = r14.f14684.equalsIgnoreCase(Yue.C8542.f3549);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r5 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if ((r14.f14717 + r14.f14713) > 2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (Yue.C8542.f3549.equals(r14.f14684) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r14.f14717 = r14.f14716 - 1;
        m18412(r3);
        r14.f14718 = r14.f14716 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        throw new Yue.C8559("XMLDecl must have xml name in lowercase", mo18330());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        throw new Yue.C8559("processing instruction can not have PITarget with reserved name 'xml'", mo18330());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        r14.f14717 = r14.f14716 - 1;
        r0 = -2;
        r10 = false;
        r9 = -1;
        r8 = r3;
        r3 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        r11 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        if (r8 != '?') goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        r0 = r9 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r8 != '>') goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        if (r11 != r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
    
        if (r10 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        r14.f14718--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a0, code lost:
    
        r14.f14718 = r14.f14716 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        r3 = r14.f14711;
        r4 = r14.f14717;
        r14.f14685 = new java.lang.String(r3, r4, r14.f14718 - r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b4, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        if (r8 != '\r') goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        r14.f14668 = 1;
        r3 = r9 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        if (r10 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        r14.f14711[r14.f14716 - 1] = '\n';
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
    
        r8 = '\n';
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        if (r8 != '\n') goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cd, code lost:
    
        if (r3 != r11) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cf, code lost:
    
        if (r10 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d1, code lost:
    
        r14.f14718 = r14.f14716 - 1;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d8, code lost:
    
        if (r10 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00da, code lost:
    
        r9 = r14.f14711;
        r12 = r14.f14718;
        r9[r12] = r8;
        r14.f14718 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e4, code lost:
    
        r8 = m18389();
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f5, code lost:
    
        throw new Yue.C8559("processing instruction must have PITarget name", mo18330());
     */
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m18409() throws C8559 {
        int i = this.f14667;
        int i2 = this.f14668;
        try {
            this.f14684 = null;
            this.f14685 = null;
            this.f14717 = this.f14716;
            while (true) {
                char cM18389 = m18389();
                if (cM18389 == '?') {
                    break;
                }
                if (!m18384(cM18389)) {
                    if (!m18386(cM18389)) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("unexpected character ");
                        stringBuffer.append(m18414(cM18389));
                        stringBuffer.append(" after processing instruction name; expected a white space or '?>'");
                        throw new C8559(stringBuffer.toString(), mo18330());
                    }
                }
            }
        } catch (EOFException e) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("processing instruction started on line ");
            stringBuffer2.append(i);
            stringBuffer2.append(" and column ");
            stringBuffer2.append(i2);
            stringBuffer2.append(" was not closed");
            throw new C8559(stringBuffer2.toString(), mo18330(), e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public int m18410() throws C8559 {
        try {
            char cM18389 = this.f14727 ? this.f14711[this.f14716 - 1] : m18389();
            if (this.f14671 == 7) {
                if (cM18389 == 65534) {
                    throw new C8559("first character in input was UNICODE noncharacter (0xFFFE)- input requires int swapping", mo18330());
                }
                if (cM18389 == 65279) {
                    cM18389 = m18389();
                }
            }
            boolean z = false;
            this.f14727 = false;
            this.f14717 = this.f14716 - 1;
            while (true) {
                if (cM18389 == '<') {
                    if (z && this.f14729) {
                        this.f14718 = this.f14716 - 1;
                        this.f14727 = true;
                        this.f14671 = 6;
                        return 6;
                    }
                    char cM183892 = m18389();
                    if (cM183892 == '?') {
                        boolean zM18409 = m18409();
                        if (this.f14729) {
                            if (zM18409) {
                                this.f14671 = 7;
                                return 7;
                            }
                            this.f14671 = 3;
                            return 3;
                        }
                    } else {
                        if (cM183892 != '!') {
                            if (cM183892 == '/') {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("expected start tag name and not ");
                                stringBuffer.append(m18414(cM183892));
                                throw new C8559(stringBuffer.toString(), mo18330());
                            }
                            if (m18385(cM183892)) {
                                this.f14669 = true;
                                return m18411();
                            }
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("expected start tag name and not ");
                            stringBuffer2.append(m18414(cM183892));
                            throw new C8559(stringBuffer2.toString(), mo18330());
                        }
                        char cM183893 = m18389();
                        if (cM183893 == 'D') {
                            if (this.f14728) {
                                throw new C8559("only one docdecl allowed in XML document", mo18330());
                            }
                            this.f14728 = true;
                            m18405();
                            if (this.f14729) {
                                this.f14671 = 11;
                                return 11;
                            }
                        } else {
                            if (cM183893 != '-') {
                                StringBuffer stringBuffer3 = new StringBuffer();
                                stringBuffer3.append("unexpected markup <!");
                                stringBuffer3.append(m18414(cM183893));
                                throw new C8559(stringBuffer3.toString(), mo18330());
                            }
                            m18404();
                            if (this.f14729) {
                                this.f14671 = 5;
                                return 5;
                            }
                        }
                    }
                } else {
                    if (!m18386(cM18389)) {
                        StringBuffer stringBuffer4 = new StringBuffer();
                        stringBuffer4.append("only whitespace content allowed before start tag and not ");
                        stringBuffer4.append(m18414(cM18389));
                        throw new C8559(stringBuffer4.toString(), mo18330());
                    }
                    z = true;
                }
                cM18389 = m18389();
            }
        } catch (EOFException e) {
            throw new C8559(f14640, mo18330(), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x018f A[Catch: EOFException -> 0x0034, TryCatch #0 {EOFException -> 0x0034, blocks: (B:3:0x0003, B:5:0x0023, B:8:0x0028, B:9:0x0033, B:13:0x0039, B:15:0x0043, B:17:0x0056, B:20:0x005f, B:23:0x0075, B:26:0x00bc, B:28:0x00c2, B:37:0x00dd, B:40:0x00e7, B:43:0x00ef, B:44:0x00f2, B:45:0x010c, B:46:0x010d, B:47:0x0114, B:49:0x0118, B:51:0x011e, B:53:0x0124, B:57:0x014a, B:54:0x0129, B:55:0x0143, B:56:0x0144, B:59:0x014e, B:63:0x0155, B:65:0x015d, B:67:0x0161, B:75:0x0185, B:77:0x018f, B:78:0x01a5, B:80:0x01af, B:81:0x01c5, B:82:0x01e3, B:69:0x016d, B:71:0x0171, B:73:0x0179, B:83:0x01e4, B:84:0x01e8, B:105:0x0248, B:108:0x025a, B:109:0x0270, B:86:0x01ed, B:90:0x01f4, B:92:0x01f8, B:101:0x021d, B:102:0x0241, B:94:0x0204, B:96:0x0208, B:98:0x0210, B:103:0x0242, B:104:0x0245, B:35:0x00d5, B:111:0x0274, B:112:0x0292, B:113:0x0293, B:118:0x029e, B:119:0x02a9, B:120:0x02aa, B:121:0x02b3, B:122:0x02d1, B:24:0x009d, B:25:0x00af, B:19:0x0059, B:124:0x02d4, B:127:0x02da, B:128:0x02e2, B:129:0x02ed), top: B:132:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01af A[Catch: EOFException -> 0x0034, TryCatch #0 {EOFException -> 0x0034, blocks: (B:3:0x0003, B:5:0x0023, B:8:0x0028, B:9:0x0033, B:13:0x0039, B:15:0x0043, B:17:0x0056, B:20:0x005f, B:23:0x0075, B:26:0x00bc, B:28:0x00c2, B:37:0x00dd, B:40:0x00e7, B:43:0x00ef, B:44:0x00f2, B:45:0x010c, B:46:0x010d, B:47:0x0114, B:49:0x0118, B:51:0x011e, B:53:0x0124, B:57:0x014a, B:54:0x0129, B:55:0x0143, B:56:0x0144, B:59:0x014e, B:63:0x0155, B:65:0x015d, B:67:0x0161, B:75:0x0185, B:77:0x018f, B:78:0x01a5, B:80:0x01af, B:81:0x01c5, B:82:0x01e3, B:69:0x016d, B:71:0x0171, B:73:0x0179, B:83:0x01e4, B:84:0x01e8, B:105:0x0248, B:108:0x025a, B:109:0x0270, B:86:0x01ed, B:90:0x01f4, B:92:0x01f8, B:101:0x021d, B:102:0x0241, B:94:0x0204, B:96:0x0208, B:98:0x0210, B:103:0x0242, B:104:0x0245, B:35:0x00d5, B:111:0x0274, B:112:0x0292, B:113:0x0293, B:118:0x029e, B:119:0x02a9, B:120:0x02aa, B:121:0x02b3, B:122:0x02d1, B:24:0x009d, B:25:0x00af, B:19:0x0059, B:124:0x02d4, B:127:0x02da, B:128:0x02e2, B:129:0x02ed), top: B:132:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0204 A[Catch: EOFException -> 0x0034, TryCatch #0 {EOFException -> 0x0034, blocks: (B:3:0x0003, B:5:0x0023, B:8:0x0028, B:9:0x0033, B:13:0x0039, B:15:0x0043, B:17:0x0056, B:20:0x005f, B:23:0x0075, B:26:0x00bc, B:28:0x00c2, B:37:0x00dd, B:40:0x00e7, B:43:0x00ef, B:44:0x00f2, B:45:0x010c, B:46:0x010d, B:47:0x0114, B:49:0x0118, B:51:0x011e, B:53:0x0124, B:57:0x014a, B:54:0x0129, B:55:0x0143, B:56:0x0144, B:59:0x014e, B:63:0x0155, B:65:0x015d, B:67:0x0161, B:75:0x0185, B:77:0x018f, B:78:0x01a5, B:80:0x01af, B:81:0x01c5, B:82:0x01e3, B:69:0x016d, B:71:0x0171, B:73:0x0179, B:83:0x01e4, B:84:0x01e8, B:105:0x0248, B:108:0x025a, B:109:0x0270, B:86:0x01ed, B:90:0x01f4, B:92:0x01f8, B:101:0x021d, B:102:0x0241, B:94:0x0204, B:96:0x0208, B:98:0x0210, B:103:0x0242, B:104:0x0245, B:35:0x00d5, B:111:0x0274, B:112:0x0292, B:113:0x0293, B:118:0x029e, B:119:0x02a9, B:120:0x02aa, B:121:0x02b3, B:122:0x02d1, B:24:0x009d, B:25:0x00af, B:19:0x0059, B:124:0x02d4, B:127:0x02da, B:128:0x02e2, B:129:0x02ed), top: B:132:0x0003 }] */
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m18411() throws C8559 {
        String strM18396;
        this.f14671 = 1;
        try {
            this.f14673++;
            int i = this.f14716;
            this.f14717 = i - 2;
            this.f14672 = false;
            this.f14688 = 0;
            this.f14698 = 0;
            int i2 = (i - 1) + this.f14713;
            if (this.f14711[i - 1] == ':' && this.f14665) {
                throw new C8559("when namespaces processing enabled colon can not be at element name start", mo18330());
            }
            int i3 = -1;
            while (true) {
                char cM18389 = m18389();
                if (!m18384(cM18389)) {
                    m18361();
                    int i4 = this.f14716 - 1;
                    int i5 = this.f14713;
                    int i6 = i4 - (i2 - i5);
                    char[][] cArr = this.f14674;
                    int i7 = this.f14673;
                    char[] cArr2 = cArr[i7];
                    if (cArr2 == null || cArr2.length < i6) {
                        cArr[i7] = new char[i6 * 2];
                    }
                    System.arraycopy(this.f14711, i2 - i5, cArr[i7], 0, i6);
                    int[] iArr = this.f14675;
                    int i8 = this.f14673;
                    iArr[i8] = i6;
                    String strM183962 = null;
                    if (!this.f14665) {
                        String[] strArr = this.f14676;
                        strM18396 = m18396(this.f14711, i2 - this.f14713, i6);
                        strArr[i8] = strM18396;
                    } else if (i3 != -1) {
                        String[] strArr2 = this.f14677;
                        strM183962 = m18396(this.f14711, i2 - this.f14713, i3 - i2);
                        strArr2[i8] = strM183962;
                        String[] strArr3 = this.f14676;
                        int i9 = this.f14673;
                        char[] cArr3 = this.f14711;
                        int i10 = this.f14713;
                        strM18396 = m18396(cArr3, (i3 + 1) - i10, (this.f14716 - 2) - (i3 - i10));
                        strArr3[i9] = strM18396;
                    } else {
                        this.f14677[i8] = null;
                        String[] strArr4 = this.f14676;
                        strM18396 = m18396(this.f14711, i2 - this.f14713, i6);
                        strArr4[i8] = strM18396;
                    }
                    while (true) {
                        boolean zM18386 = m18386(cM18389);
                        if (zM18386) {
                            do {
                                cM18389 = m18389();
                            } while (m18386(cM18389));
                        }
                        if (cM18389 == '>') {
                            break;
                        }
                        if (cM18389 == '/') {
                            this.f14672 = true;
                            char cM183892 = m18389();
                            if (cM183892 != '>') {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("expected > to end empty tag not ");
                                stringBuffer.append(m18414(cM183892));
                                throw new C8559(stringBuffer.toString(), mo18330());
                            }
                        } else {
                            if (!m18385(cM18389)) {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append("start tag unexpected character ");
                                stringBuffer2.append(m18414(cM18389));
                                throw new C8559(stringBuffer2.toString(), mo18330());
                            }
                            if (!zM18386 && cM18389 != '>') {
                                throw new C8559("expected a white space between attributes", mo18330());
                            }
                            m18402();
                            cM18389 = m18389();
                        }
                    }
                    if (this.f14665) {
                        String strMo18318 = mo18318(strM183962);
                        if (strMo18318 == null) {
                            if (strM183962 != null) {
                                StringBuffer stringBuffer3 = new StringBuffer();
                                stringBuffer3.append("could not determine namespace bound to element prefix ");
                                stringBuffer3.append(strM183962);
                                throw new C8559(stringBuffer3.toString(), mo18330());
                            }
                            strMo18318 = f14644;
                        }
                        this.f14678[this.f14673] = strMo18318;
                        for (int i11 = 0; i11 < this.f14688; i11++) {
                            String str = this.f14691[i11];
                            if (str != null) {
                                String strMo183182 = mo18318(str);
                                if (strMo183182 == null) {
                                    StringBuffer stringBuffer4 = new StringBuffer();
                                    stringBuffer4.append("could not determine namespace bound to attribute prefix ");
                                    stringBuffer4.append(str);
                                    throw new C8559(stringBuffer4.toString(), mo18330());
                                }
                                this.f14692[i11] = strMo183182;
                            } else {
                                this.f14692[i11] = f14644;
                            }
                        }
                        for (int i12 = 1; i12 < this.f14688; i12++) {
                            for (int i13 = 0; i13 < i12; i13++) {
                                String[] strArr5 = this.f14692;
                                if (strArr5[i13] == strArr5[i12]) {
                                    if (this.f14664) {
                                        Object[] objArr = this.f14689;
                                        if (!objArr[i13].equals(objArr[i12])) {
                                        }
                                        String string = this.f14689[i13];
                                        if (this.f14692[i13] != null) {
                                            StringBuffer stringBuffer5 = new StringBuffer();
                                            stringBuffer5.append(this.f14692[i13]);
                                            stringBuffer5.append(":");
                                            stringBuffer5.append(string);
                                            string = stringBuffer5.toString();
                                        }
                                        String string2 = this.f14689[i12];
                                        if (this.f14692[i12] != null) {
                                            StringBuffer stringBuffer6 = new StringBuffer();
                                            stringBuffer6.append(this.f14692[i12]);
                                            stringBuffer6.append(":");
                                            stringBuffer6.append(string2);
                                            string2 = stringBuffer6.toString();
                                        }
                                        StringBuffer stringBuffer7 = new StringBuffer();
                                        stringBuffer7.append("duplicated attributes ");
                                        stringBuffer7.append(string);
                                        stringBuffer7.append(" and ");
                                        stringBuffer7.append(string2);
                                        throw new C8559(stringBuffer7.toString(), mo18330());
                                    }
                                    if (this.f14664) {
                                        continue;
                                    } else {
                                        int[] iArr2 = this.f14690;
                                        if (iArr2[i13] == iArr2[i12]) {
                                            Object[] objArr2 = this.f14689;
                                            if (objArr2[i13].equals(objArr2[i12])) {
                                                String string3 = this.f14689[i13];
                                                if (this.f14692[i13] != null) {
                                                }
                                                String string22 = this.f14689[i12];
                                                if (this.f14692[i12] != null) {
                                                }
                                                StringBuffer stringBuffer72 = new StringBuffer();
                                                stringBuffer72.append("duplicated attributes ");
                                                stringBuffer72.append(string3);
                                                stringBuffer72.append(" and ");
                                                stringBuffer72.append(string22);
                                                throw new C8559(stringBuffer72.toString(), mo18330());
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        for (int i14 = 1; i14 < this.f14688; i14++) {
                            for (int i15 = 0; i15 < i14; i15++) {
                                if (this.f14664) {
                                    Object[] objArr3 = this.f14689;
                                    if (!objArr3[i15].equals(objArr3[i14])) {
                                        if (!this.f14664) {
                                            int[] iArr3 = this.f14690;
                                            if (iArr3[i15] == iArr3[i14]) {
                                                Object[] objArr4 = this.f14689;
                                                if (!objArr4[i15].equals(objArr4[i14])) {
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                String[] strArr6 = this.f14689;
                                String str2 = strArr6[i15];
                                String str3 = strArr6[i14];
                                StringBuffer stringBuffer8 = new StringBuffer();
                                stringBuffer8.append("duplicated attributes ");
                                stringBuffer8.append(str2);
                                stringBuffer8.append(" and ");
                                stringBuffer8.append(str3);
                                throw new C8559(stringBuffer8.toString(), mo18330());
                            }
                        }
                    }
                    this.f14679[this.f14673] = this.f14694;
                    this.f14718 = this.f14716;
                    if (this.f14687 != null) {
                        if (strM183962 != null) {
                            StringBuffer stringBuffer9 = new StringBuffer();
                            stringBuffer9.append(strM183962);
                            stringBuffer9.append(":");
                            stringBuffer9.append(strM18396);
                            m18354(stringBuffer9.toString());
                        } else {
                            m18354(strM18396);
                        }
                    }
                    return 1;
                }
                if (cM18389 == ':' && this.f14665) {
                    if (i3 != -1) {
                        throw new C8559("only one colon is allowed in name of element when namespaces are enabled", mo18330());
                    }
                    i3 = (this.f14716 - 1) + this.f14713;
                }
            }
        } catch (EOFException e) {
            throw new C8559(f14640, mo18330(), e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public void m18412(char c) throws C8559 {
        try {
            char cM18428 = m18428(m18418(m18428(c), f14655));
            if (cM18428 != '=') {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("expected equals sign (=) after version and not ");
                stringBuffer.append(m18414(cM18428));
                throw new C8559(stringBuffer.toString(), mo18330());
            }
            char cM184282 = m18428(m18389());
            if (cM184282 != '\'' && cM184282 != '\"') {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("expected apostrophe (') or quotation mark (\") after version and not ");
                stringBuffer2.append(m18414(cM184282));
                throw new C8559(stringBuffer2.toString(), mo18330());
            }
            int i = this.f14716;
            char cM18389 = m18389();
            while (cM18389 != cM184282) {
                if ((cM18389 < 'a' || cM18389 > 'z') && ((cM18389 < 'A' || cM18389 > 'Z') && ((cM18389 < '0' || cM18389 > '9') && cM18389 != '_' && cM18389 != '.' && cM18389 != ':' && cM18389 != '-'))) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("<?xml version value expected to be in ([a-zA-Z0-9_.:] | '-') not ");
                    stringBuffer3.append(m18414(cM18389));
                    throw new C8559(stringBuffer3.toString(), mo18330());
                }
                cM18389 = m18389();
            }
            m18413(i, this.f14716 - 1);
        } catch (EOFException e) {
            throw new C8559(f14640, mo18330(), e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public void m18413(int i, int i2) throws C8559 {
        char cM18418;
        int i3 = i2 - i;
        if (i3 == 3) {
            try {
                char[] cArr = this.f14711;
                if (cArr[i] == '1' && cArr[i + 1] == '.' && cArr[i + 2] == '0') {
                    this.f14680 = new String(cArr, i, i3);
                    char cM18428 = m18428(m18389());
                    if (cM18428 != '?') {
                        cM18428 = m18428(cM18428);
                        char[] cArr2 = f14656;
                        if (cM18428 == cArr2[0]) {
                            char cM184282 = m18428(m18418(cM18428, cArr2));
                            if (cM184282 != '=') {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("expected equals sign (=) after encoding and not ");
                                stringBuffer.append(m18414(cM184282));
                                throw new C8559(stringBuffer.toString(), mo18330());
                            }
                            char cM184283 = m18428(m18389());
                            if (cM184283 != '\'' && cM184283 != '\"') {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append("expected apostrophe (') or quotation mark (\") after encoding and not ");
                                stringBuffer2.append(m18414(cM184283));
                                throw new C8559(stringBuffer2.toString(), mo18330());
                            }
                            int i4 = this.f14716;
                            char cM18389 = m18389();
                            char c = 'a';
                            if ((cM18389 < 'a' || cM18389 > 'z') && (cM18389 < 'A' || cM18389 > 'Z')) {
                                StringBuffer stringBuffer3 = new StringBuffer();
                                stringBuffer3.append("<?xml encoding name expected to start with [A-Za-z] not ");
                                stringBuffer3.append(m18414(cM18389));
                                throw new C8559(stringBuffer3.toString(), mo18330());
                            }
                            char cM183892 = m18389();
                            while (cM183892 != cM184283) {
                                if ((cM183892 < c || cM183892 > 'z') && ((cM183892 < 'A' || cM183892 > 'Z') && ((cM183892 < '0' || cM183892 > '9') && cM183892 != '.' && cM183892 != '_' && cM183892 != '-'))) {
                                    StringBuffer stringBuffer4 = new StringBuffer();
                                    stringBuffer4.append("<?xml encoding value expected to be in ([A-Za-z0-9._] | '-') not ");
                                    stringBuffer4.append(m18414(cM183892));
                                    throw new C8559(stringBuffer4.toString(), mo18330());
                                }
                                cM183892 = m18389();
                                c = 'a';
                            }
                            this.f14683 = m18396(this.f14711, i4, (this.f14716 - 1) - i4);
                            cM18428 = m18428(m18389());
                        }
                        if (cM18428 != '?') {
                            char cM184284 = m18428(m18418(m18428(cM18428), f14657));
                            if (cM184284 != '=') {
                                StringBuffer stringBuffer5 = new StringBuffer();
                                stringBuffer5.append("expected equals sign (=) after standalone and not ");
                                stringBuffer5.append(m18414(cM184284));
                                throw new C8559(stringBuffer5.toString(), mo18330());
                            }
                            char cM184285 = m18428(m18389());
                            if (cM184285 != '\'' && cM184285 != '\"') {
                                StringBuffer stringBuffer6 = new StringBuffer();
                                stringBuffer6.append("expected apostrophe (') or quotation mark (\") after encoding and not ");
                                stringBuffer6.append(m18414(cM184285));
                                throw new C8559(stringBuffer6.toString(), mo18330());
                            }
                            char cM183893 = m18389();
                            if (cM183893 == 'y') {
                                cM18418 = m18418(cM183893, f14658);
                                this.f14681 = true;
                            } else {
                                if (cM183893 != 'n') {
                                    StringBuffer stringBuffer7 = new StringBuffer();
                                    stringBuffer7.append("expected 'yes' or 'no' after standalone and not ");
                                    stringBuffer7.append(m18414(cM183893));
                                    throw new C8559(stringBuffer7.toString(), mo18330());
                                }
                                cM18418 = m18418(cM183893, f14659);
                                this.f14681 = false;
                            }
                            this.f14682 = true;
                            if (cM18418 != cM184285) {
                                StringBuffer stringBuffer8 = new StringBuffer();
                                stringBuffer8.append("expected ");
                                stringBuffer8.append(cM184285);
                                stringBuffer8.append(" after standalone value not ");
                                stringBuffer8.append(m18414(cM18418));
                                throw new C8559(stringBuffer8.toString(), mo18330());
                            }
                            cM18428 = m18389();
                        }
                    }
                    char cM184286 = m18428(cM18428);
                    if (cM184286 != '?') {
                        StringBuffer stringBuffer9 = new StringBuffer();
                        stringBuffer9.append("expected ?> as last part of <?xml not ");
                        stringBuffer9.append(m18414(cM184286));
                        throw new C8559(stringBuffer9.toString(), mo18330());
                    }
                    char cM183894 = m18389();
                    if (cM183894 == '>') {
                        return;
                    }
                    StringBuffer stringBuffer10 = new StringBuffer();
                    stringBuffer10.append("expected ?> as last part of <?xml not ");
                    stringBuffer10.append(m18414(cM183894));
                    throw new C8559(stringBuffer10.toString(), mo18330());
                }
            } catch (EOFException e) {
                throw new C8559(f14640, mo18330(), e);
            }
        }
        StringBuffer stringBuffer11 = new StringBuffer();
        stringBuffer11.append("only 1.0 is supported as <?xml version not '");
        stringBuffer11.append(m18415(new String(this.f14711, i, i2)));
        stringBuffer11.append("'");
        throw new C8559(stringBuffer11.toString(), mo18330());
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public String m18414(char c) {
        if (c == '\n') {
            return "\\n";
        }
        if (c == '\r') {
            return "\\r";
        }
        if (c == '\t') {
            return "\\t";
        }
        if (c == '\'') {
            return "\\'";
        }
        if (c > 127 || c < ' ') {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\\u");
            stringBuffer.append(Integer.toHexString(c));
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("");
        stringBuffer2.append(c);
        return stringBuffer2.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public String m18415(String str) {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            stringBuffer.append(m18414(str.charAt(i)));
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public void m18416() throws C8559 {
        try {
            char[] cArr = this.f14711;
            int i = this.f14717;
            C4270 c4270M12394 = new C4293(new StringReader(new String(cArr, i, this.f14718 - i))).m12394();
            this.f14686 = c4270M12394;
            Class clsM18310 = f14660;
            if (clsM18310 == null) {
                clsM18310 = m18310("com.wutka.dtd.DTDEntity");
                f14660 = clsM18310;
            }
            Enumeration enumerationElements = c4270M12394.m12325(clsM18310).elements();
            while (enumerationElements.hasMoreElements()) {
                C4281 c4281 = (C4281) enumerationElements.nextElement();
                if (!c4281.m12360()) {
                    m18359(c4281.m12355(), c4281.m12359());
                }
            }
            C4270 c4270 = this.f14686;
            Class clsM183102 = f14661;
            if (clsM183102 == null) {
                clsM183102 = m18310("com.wutka.dtd.DTDAttlist");
                f14661 = clsM183102;
            }
            Enumeration enumerationElements2 = c4270.m12325(clsM183102).elements();
            while (enumerationElements2.hasMoreElements()) {
                C4272 c4272 = (C4272) enumerationElements2.nextElement();
                for (C4273 c4273 : c4272.m12328()) {
                    if (c4273.m12333() != null) {
                        if (this.f14687 == null) {
                            this.f14687 = new HashMap();
                        }
                        this.f14687.put(c4272.m12329(), c4272);
                    }
                }
            }
        } catch (IOException e) {
            throw new C8559(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public void m18417() throws C8559 {
        m18315();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public char m18418(char c, char[] cArr) throws C8559 {
        for (int i = 0; i < cArr.length; i++) {
            if (c != cArr[i]) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("expected ");
                stringBuffer.append(m18414(cArr[i]));
                stringBuffer.append(" in ");
                stringBuffer.append(new String(cArr));
                stringBuffer.append(" and not ");
                stringBuffer.append(m18414(c));
                throw new C8559(stringBuffer.toString(), mo18330());
            }
            try {
                c = m18389();
            } catch (EOFException e) {
                throw new C8559(f14640, mo18330(), e);
            }
        }
        return c;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public char m18419() throws C8559 {
        try {
            char cM18389 = m18389();
            if (m18386(cM18389)) {
                return m18428(cM18389);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("white space is required and not ");
            stringBuffer.append(m18414(cM18389));
            throw new C8559(stringBuffer.toString(), mo18330());
        } catch (EOFException e) {
            throw new C8559(f14640, mo18330(), e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۢ, reason: contains not printable characters */
    public void m18420() {
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public void m18421(C4095 c4095) {
        this.f14735 = c4095;
        Boolean bool = Boolean.TRUE;
        bool.equals(c4095.m11569(AbstractC8553.f25385));
        this.f14663 = bool.equals(c4095.m11569(C4095.f8178));
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۤ, reason: contains not printable characters */
    public void m18422(String str, boolean z) throws C8559 {
        if (str == null) {
            throw new IllegalArgumentException("feature name should not be nulll");
        }
        if (f14646.equals(str)) {
            if (this.f14671 != 7) {
                throw new C8559("namespace processing feature can only be changed before parsing", mo18330());
            }
            this.f14665 = z;
            return;
        }
        if (f14636.equals(str)) {
            if (z) {
                throw new C8559("interning names in this implementation is not supported");
            }
            return;
        }
        if (f14637.equals(str)) {
            if (z) {
                throw new C8559("processing DOCDECL is not supported");
            }
        } else if (f14635.equals(str)) {
            if (!z) {
                throw new C8559("roundtrip feature can not be switched off");
            }
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("unknown feature ");
            stringBuffer.append(str);
            throw new C8559(stringBuffer.toString());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۥ, reason: contains not printable characters */
    public void m18423(InputStream inputStream) throws C8559 {
        try {
            Reader readerM4540 = C8567.m4540(inputStream);
            String strMo4541 = readerM4540 instanceof C8567.AbstractC1549 ? ((C8567.AbstractC1549) readerM4540).mo4541() : null;
            m18425(readerM4540);
            if (strMo4541 != null) {
                this.f14709 = strMo4541;
            }
        } catch (IOException e) {
            throw new C8559(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public void m18424(InputStream inputStream, String str) throws C8559 {
        String string;
        if (inputStream == null) {
            throw new IllegalArgumentException("input stream can not be null");
        }
        try {
            m18425(str != null ? C8567.m28538(inputStream, str) : C8567.m4540(inputStream));
            if (str != null) {
                this.f14709 = str;
            }
        } catch (IOException e) {
            if (str == null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("(for encoding '");
                stringBuffer.append(str);
                stringBuffer.append("')");
                string = stringBuffer.toString();
            } else {
                string = "";
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("could not create reader ");
            stringBuffer2.append(string);
            stringBuffer2.append(": ");
            stringBuffer2.append(e);
            throw new C8559(stringBuffer2.toString(), mo18330(), e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public void m18425(Reader reader) throws C8559 {
        m18315();
        this.f14708 = reader;
        if (m18356()) {
            next();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public void m18426(String str, Object obj) throws C8559 {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("unsupported property: '");
        stringBuffer.append(str);
        stringBuffer.append("'");
        throw new C8559(stringBuffer.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public void m18427() throws C8559 {
        m18401();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public char m18428(char c) throws C8559 {
        while (m18386(c)) {
            try {
                c = m18389();
            } catch (EOFException e) {
                throw new C8559(f14640, mo18330(), e);
            }
        }
        return c;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public InterfaceC8561 m18429() throws C8559 {
        return new C7664(this);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public final String m18430(int i) throws IllegalStateException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Current state (");
        stringBuffer.append(m18311(this.f14671));
        stringBuffer.append(") not ");
        stringBuffer.append(m18311(i));
        throw new IllegalStateException(stringBuffer.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public final String m18431(int[] iArr) throws IllegalStateException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(m18311(iArr[0]));
        int length = iArr.length - 1;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(", ");
            stringBuffer.append(m18311(iArr[i]));
        }
        stringBuffer.append(" or ");
        stringBuffer.append(m18311(iArr[length]));
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Current state (");
        stringBuffer2.append(m18311(this.f14671));
        stringBuffer2.append(") not ");
        stringBuffer2.append(stringBuffer.toString());
        throw new IllegalStateException(stringBuffer2.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public final void m18432(char c) throws C8559 {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("expected name start character and not ");
        stringBuffer.append(m18414(c));
        throw new C8559(stringBuffer.toString(), mo18330());
    }
}

package Yue;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4725 {

    /* JADX INFO: renamed from: ۥ */
    public Reader f1075;

    /* JADX INFO: renamed from: ۥ۟ */
    public char f1076;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f10099 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f10100 = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4725() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m14174(String[] strArr) throws Exception {
        C4725 c4725 = new C4725(new FileReader(strArr[0]));
        while (c4725.m14177()) {
            System.out.println(c4725.m14187());
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m1640() {
        return this.f10100;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public char m1641() {
        return this.f1076;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String m14175(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String m14176(String str) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m14177() throws IOException {
        return this.f1075.ready() && !this.f10100;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public char m14178() throws IOException {
        char c = (char) this.f1075.read();
        this.f1076 = c;
        if (c == '\n') {
            this.f10099++;
        }
        return c;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public char m14179(char c) throws C8559, IOException {
        if (this.f1076 == c) {
            return m14178();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unexpected character '");
        stringBuffer.append(this.f1076);
        stringBuffer.append("' , expected '");
        stringBuffer.append(c);
        stringBuffer.append("' at line ");
        stringBuffer.append(this.f10099);
        throw new C8559(stringBuffer.toString());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m14180(String str) throws C8559, IOException {
        for (int i = 0; i < str.length(); i++) {
            m14179(str.charAt(i));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public InterfaceC3453 m14181() throws C8559, IOException {
        m14179(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        m14179(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        String strM14197 = m14197(']');
        m14179(']');
        C6848 c6848M14191 = m14191();
        m14180("=[");
        String strM141972 = m14197(']');
        m14179(']');
        m14179(']');
        if (strM14197.equals("ATTRIBUTE")) {
            return new C3455(c6848M14191, strM141972);
        }
        if (strM14197.equals("DEFAULT")) {
            return new C6348(strM141972);
        }
        if (strM14197.equals("NAMESPACE")) {
            return new C6348(c6848M14191.m3294(), strM141972);
        }
        throw new C8559("Parser Error expected (ATTRIBUTE||DEFAULT|NAMESPACE");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public List m14182() throws C8559, IOException {
        ArrayList arrayList = new ArrayList();
        while (m1641() == '[') {
            arrayList.add(m14181());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public C4726 m14183() throws C8559, IOException {
        C4726 c4726 = new C4726(12);
        m14179(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        m14197(']');
        m14179(']');
        return c4726;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public C4726 m14184() throws C8559, IOException {
        C4726 c4726 = new C4726(4);
        m14179(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        c4726.m14212(m14197(']'));
        m14179(']');
        return c4726;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public C4726 m14185() throws C8559, IOException {
        C4726 c4726 = new C4726(5);
        m14179(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        c4726.m14212(m14197(']'));
        m14179(']');
        return c4726;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public C4726 m14186() throws C8559, IOException {
        C4726 c4726 = new C4726(11);
        m14179(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        String strM14197 = m14197(']');
        m14179(']');
        c4726.m14212(strM14197);
        return c4726;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public C4726 m14187() throws C8559, IOException {
        C4726 c4726M14196;
        int iM14198 = m14198();
        switch (iM14198) {
            case 1:
                c4726M14196 = m14196();
                break;
            case 2:
                c4726M14196 = m14189();
                break;
            case 3:
                c4726M14196 = m14193();
                break;
            case 4:
                c4726M14196 = m14184();
                break;
            case 5:
                c4726M14196 = m14185();
                break;
            case 6:
                c4726M14196 = m14194();
                break;
            case 7:
                c4726M14196 = m14195();
                break;
            case 8:
                this.f10100 = true;
                c4726M14196 = m14188();
                break;
            case 9:
                c4726M14196 = m14190();
                break;
            case 10:
            default:
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Attempt to read unknown element [");
                stringBuffer.append(iM14198);
                stringBuffer.append("]");
                throw new C8559(stringBuffer.toString());
            case 11:
                c4726M14196 = m14186();
                break;
            case 12:
                c4726M14196 = m14183();
                break;
        }
        m14179(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        m14200();
        return c4726M14196;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C4726 m14188() throws C8559 {
        return new C4726(8);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public C4726 m14189() throws C8559, IOException {
        C4726 c4726 = new C4726(2);
        m14179(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        c4726.m14214(m14191());
        m14179(']');
        return c4726;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public C4726 m14190() throws C8559, IOException {
        C4726 c4726 = new C4726(9);
        m14179(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        c4726.m14212(m14197(']'));
        m14179(']');
        return c4726;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C6848 m14191() throws C8559, IOException {
        m14179(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        C6848 c6848M14192 = m14192(']');
        m14179(']');
        return c6848M14192;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public C6848 m14192(char c) throws C8559, IOException {
        String strM14197;
        if (m1641() == '\'') {
            m14179('\'');
            strM14197 = m14197('\'');
            m14179('\'');
            m14179(':');
        } else {
            strM14197 = "";
        }
        String strM141972 = m14197(c);
        String strM14176 = m14176(strM141972);
        return new C6848(strM14197, m14175(strM141972), strM14176 != null ? strM14176 : "");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C4726 m14193() throws C8559, IOException {
        String strM14197;
        C4726 c4726 = new C4726(3);
        m14179(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        String strM141972 = m14197(']');
        m14179(']');
        if (m1641() == ',') {
            m14180(",[");
            strM14197 = m14197(']');
            m14179(']');
        } else {
            strM14197 = null;
        }
        c4726.m14212(strM141972);
        c4726.m14213(strM14197);
        return c4726;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public C4726 m14194() throws C8559, IOException {
        C4726 c4726 = new C4726(6);
        m14179(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        String strM14197 = m14197(']');
        m14179(']');
        c4726.m14212(strM14197);
        return c4726;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public C4726 m14195() throws C8559, IOException {
        C4726 c4726 = new C4726(7);
        if (m1641() != ';') {
            m14179(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
            m14179(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
            String strM14197 = m14197(']');
            m14179(']');
            m14179(',');
            m14179(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
            String strM141972 = m14197(']');
            m14179(']');
            m14179(']');
            c4726.m14212(strM14197);
            c4726.m14213(strM141972);
        }
        return c4726;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public C4726 m14196() throws C8559, IOException {
        C4726 c4726 = new C4726(1);
        m14179(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        c4726.m14214(m14191());
        if (m1641() == '[') {
            for (Object obj : m14182()) {
                if (obj instanceof InterfaceC6347) {
                    c4726.m1643(obj);
                } else {
                    c4726.m1642(obj);
                }
            }
        }
        m14179(']');
        return c4726;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public String m14197(char c) throws C8559, IOException {
        StringBuffer stringBuffer = new StringBuffer();
        while (m1641() != c) {
            if (m1641() == '[' && c == ']') {
                m14178();
                stringBuffer.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
                if (m1641() != ']') {
                    stringBuffer.append(m14197(']'));
                }
                stringBuffer.append(']');
                m14179(']');
            } else {
                stringBuffer.append(m1641());
                m14178();
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int m14198() throws C8559, IOException {
        m14179(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        int iM1560 = C4606.m1560(m14197(']'));
        m14179(']');
        return iM1560;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m14199(Reader reader) throws IOException {
        this.f1075 = reader;
        m14178();
        m14200();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m14200() throws IOException {
        while (true) {
            char c = this.f1076;
            if (!((c == ' ') | (c == '\n') | (c == '\t')) && !(c == '\r')) {
                return;
            } else {
                m14178();
            }
        }
    }

    public C4725(Reader reader) throws IOException {
        m14199(reader);
    }
}

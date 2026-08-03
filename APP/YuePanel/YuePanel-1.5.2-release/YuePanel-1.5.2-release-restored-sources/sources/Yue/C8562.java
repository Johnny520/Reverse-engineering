package Yue;

import Yue.C8403;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۢۦۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8562 extends C8564 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8562() {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static void m28472(String[] strArr) throws Exception {
        AbstractC8553 abstractC8553M28451 = AbstractC8553.m28451();
        AbstractC8554.m28453();
        InterfaceC8561 interfaceC8561Mo18443 = abstractC8553M28451.mo18443(new FileReader(strArr[0]));
        C8562 c8562 = new C8562(new OutputStreamWriter(new FileOutputStream("out.stream")));
        while (interfaceC8561Mo18443.hasNext()) {
            c8562.mo21812(interfaceC8561Mo18443);
            interfaceC8561Mo18443.next();
        }
        c8562.mo21812(interfaceC8561Mo18443);
        c8562.flush();
    }

    @Override // Yue.C8564, Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo28473(String str) throws C8559 {
        m28522("[[");
        m28522(str);
        m28522("],[utf-8]]");
    }

    @Override // Yue.C8564, Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo28474(String str) throws C8559 {
        m28522("[[DEFAULT][");
        if (!m28512()) {
            throw new C8559("A start element must be written before the default namespace");
        }
        m28522("xmlns]");
        m28522("=[");
        m28522(str);
        m28522("]");
        mo4536("", str);
        m28521(']');
    }

    @Override // Yue.C8564, Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo28475(String str) throws C8559 {
        m28522("[");
        super.m28522(str);
        m28522("]");
    }

    @Override // Yue.C8564, Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo28476(String str, String str2) throws C8559 {
        m28508();
        m28522("[");
        if (str != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");
            stringBuffer.append(str);
            stringBuffer.append("]");
            m28522(stringBuffer.toString());
        }
        if (str2 != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(",[");
            stringBuffer2.append(str2);
            stringBuffer2.append("]");
            m28522(stringBuffer2.toString());
        }
        m28522("]");
    }

    @Override // Yue.C8564, Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void mo28477(String str, String str2) throws C8559 {
        if (!m28512()) {
            throw new C8559("A start element must be written before a namespace");
        }
        if (str == null || "".equals(str) || "xmlns".equals(str)) {
            mo28474(str2);
            return;
        }
        m28522("[[NAMESPACE][");
        m28522(C8403.C1519.f25098);
        m28522(str);
        m28522("]=[");
        m28522(str2);
        m28522("]");
        mo4536(str, str2);
        m28521(']');
    }

    @Override // Yue.C8564, Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void mo28478(String str, String str2, String str3) throws C8559 {
        m28522("[[ATTRIBUTE]");
        mo28489("", str, str2);
        m28522("=");
        mo28488(str3.toCharArray(), 0, str3.length(), true);
        m28522("]");
    }

    @Override // Yue.C8564, Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void mo28479(String str) throws C8559 {
        m28522("[");
        super.mo28479(str);
        m28522("]");
    }

    @Override // Yue.C8564, Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void mo28480(String str) throws C8559 {
        m28522("[");
        if (str != null) {
            m28522(str);
        }
        m28522("]");
    }

    @Override // Yue.C8564, Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void mo28481(String str, String str2) throws C8559 {
        m28522("[[");
        m28522(str2);
        m28522("],[");
        m28522(str);
        m28522("]]");
    }

    @Override // Yue.C8564, Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void mo28482(String str) throws C8559 {
        m28508();
        m28522("[");
        if (str != null) {
            m28522(str);
        }
        m28522("]");
    }

    @Override // Yue.C8564, Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void mo28483() throws C8559 {
        m28522("[[1.0],[utf-8]]");
    }

    @Override // Yue.C7018
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public void mo21812(InterfaceC8561 interfaceC8561) throws C8559 {
        m28490(interfaceC8561.mo18329());
        super.mo21812(interfaceC8561);
        if (m28512()) {
            return;
        }
        m28522(";\n");
    }

    @Override // Yue.C8564
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void mo28484() throws C8559 {
        m28521(']');
    }

    @Override // Yue.C8564
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void mo28485() throws C8559 {
        m28522("];\n");
    }

    @Override // Yue.C8564
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public void mo28486() throws C8559 {
        m28521(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
    }

    @Override // Yue.C8564
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void mo28487() throws C8559 {
        m28521(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
    }

    @Override // Yue.C8564
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public void mo28488(char[] cArr, int i, int i2, boolean z) throws C8559 {
        if (i2 == 0) {
            m28522(C5385.f13236);
            return;
        }
        m28522("[");
        m28524(cArr, i, i2);
        m28522("]");
    }

    @Override // Yue.C8564
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public String mo28489(String str, String str2, String str3) throws C8559 {
        if ("".equals(str2)) {
            m28522("[");
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("['");
            stringBuffer.append(str2);
            stringBuffer.append("':");
            m28522(stringBuffer.toString());
        }
        String strMo28489 = super.mo28489(str, str2, str3);
        m28521(']');
        return strMo28489;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public void m28490(int i) throws C8559 {
        m28508();
        m28521(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        m28522(C4606.m1561(i));
        m28521(']');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8562(Writer writer) {
        super(writer);
    }
}

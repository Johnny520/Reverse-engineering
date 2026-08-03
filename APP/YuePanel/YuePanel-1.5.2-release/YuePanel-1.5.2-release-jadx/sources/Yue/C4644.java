package Yue;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4644 extends AbstractC6344 implements InterfaceC4643 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public List f9960;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4644() {
        m13963();
    }

    @Override // Yue.InterfaceC4643
    public Iterator getNamespaces() {
        List list = this.f9960;
        return list == null ? C4632.f9944 : list.iterator();
    }

    @Override // Yue.AbstractC3516
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("</");
        stringBuffer.append(m19839());
        String string = stringBuffer.toString();
        Iterator namespaces = getNamespaces();
        while (namespaces.hasNext()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(string);
            stringBuffer2.append(" ");
            stringBuffer2.append(namespaces.next().toString());
            string = stringBuffer2.toString();
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(string);
        stringBuffer3.append(">");
        return stringBuffer3.toString();
    }

    @Override // Yue.AbstractC6344, Yue.AbstractC3516
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo9411(Writer writer) throws IOException {
        writer.write("</");
        C6848 name = getName();
        String strM21588 = name.m21588();
        if (strM21588 != null && strM21588.length() > 0) {
            writer.write(strM21588);
            writer.write(58);
        }
        writer.write(name.m3294());
        writer.write(62);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void m13962(InterfaceC6347 interfaceC6347) {
        if (this.f9960 == null) {
            this.f9960 = new ArrayList();
        }
        this.f9960.add(interfaceC6347);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public void m13963() {
        m9418(2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public void m13964() {
        List list = this.f9960;
        if (list != null) {
            list.clear();
        }
    }

    public C4644(C6848 c6848) {
        super(c6848);
        m13963();
    }
}

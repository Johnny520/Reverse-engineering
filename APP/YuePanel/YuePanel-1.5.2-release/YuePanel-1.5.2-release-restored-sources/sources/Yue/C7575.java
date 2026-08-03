package Yue;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7575 extends AbstractC6344 implements InterfaceC7574 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public List f22883;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public List f22884;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public InterfaceC6349 f22885;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7575() {
    }

    @Override // Yue.InterfaceC7574
    public Iterator getAttributes() {
        List list = this.f22883;
        return list == null ? C4632.f9944 : list.iterator();
    }

    @Override // Yue.InterfaceC7574
    public Iterator getNamespaces() {
        List list = this.f22884;
        return list == null ? C4632.f9944 : list.iterator();
    }

    @Override // Yue.AbstractC3516
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<");
        stringBuffer.append(m19839());
        String string = stringBuffer.toString();
        Iterator attributes = getAttributes();
        while (attributes.hasNext()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(string);
            stringBuffer2.append(" ");
            stringBuffer2.append(attributes.next().toString());
            string = stringBuffer2.toString();
        }
        Iterator namespaces = getNamespaces();
        while (namespaces.hasNext()) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(string);
            stringBuffer3.append(" ");
            stringBuffer3.append(namespaces.next().toString());
            string = stringBuffer3.toString();
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(string);
        stringBuffer4.append(">");
        return stringBuffer4.toString();
    }

    @Override // Yue.InterfaceC7574
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC6349 mo3740() {
        return this.f22885;
    }

    @Override // Yue.InterfaceC7574
    /* JADX INFO: renamed from: ۥ۟۟ */
    public String mo23716(String str) {
        InterfaceC6349 interfaceC6349 = this.f22885;
        if (interfaceC6349 == null) {
            return null;
        }
        return interfaceC6349.mo19843(str);
    }

    @Override // Yue.InterfaceC7574
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public InterfaceC3453 mo23717(C6848 c6848) {
        if (c6848 == null) {
            return null;
        }
        Iterator attributes = getAttributes();
        while (attributes.hasNext()) {
            InterfaceC3453 interfaceC3453 = (InterfaceC3453) attributes.next();
            if (interfaceC3453.getName().equals(c6848)) {
                return interfaceC3453;
            }
        }
        return null;
    }

    @Override // Yue.AbstractC6344, Yue.AbstractC3516
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo9411(Writer writer) throws C8559, IOException {
        writer.write(60);
        C6848 name = getName();
        String strM21588 = name.m21588();
        if (strM21588 != null && strM21588.length() > 0) {
            writer.write(strM21588);
            writer.write(58);
        }
        writer.write(name.m3294());
        Iterator namespaces = getNamespaces();
        while (namespaces.hasNext()) {
            writer.write(32);
            ((InterfaceC8543) namespaces.next()).mo9155(writer);
        }
        Iterator attributes = getAttributes();
        while (attributes.hasNext()) {
            writer.write(32);
            ((InterfaceC8543) attributes.next()).mo9155(writer);
        }
        writer.write(62);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void m23718(InterfaceC3453 interfaceC3453) {
        if (this.f22883 == null) {
            this.f22883 = new ArrayList();
        }
        this.f22883.add(interfaceC3453);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public void m23719(InterfaceC6347 interfaceC6347) {
        if (this.f22884 == null) {
            this.f22884 = new ArrayList();
        }
        this.f22884.add(interfaceC6347);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public void m23720() {
        m9418(1);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public void m23721() {
        List list = this.f22883;
        if (list != null) {
            list.clear();
        }
        List list2 = this.f22884;
        if (list2 != null) {
            list2.clear();
        }
        if (this.f22885 != null) {
            this.f22885 = null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public void m23722(List list) {
        this.f22883 = list;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public void m23723(InterfaceC6349 interfaceC6349) {
        this.f22885 = interfaceC6349;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7575(C6848 c6848) {
        super(c6848);
        m23720();
    }

    public C7575(InterfaceC7574 interfaceC7574) {
        super(interfaceC7574.getName());
        m23720();
        m19840(interfaceC7574.getName());
        Iterator attributes = interfaceC7574.getAttributes();
        while (attributes.hasNext()) {
            m23718((InterfaceC3453) attributes.next());
        }
        interfaceC7574.getNamespaces();
        Iterator namespaces = interfaceC7574.getNamespaces();
        while (namespaces.hasNext()) {
            m23719((InterfaceC6347) namespaces.next());
        }
    }
}

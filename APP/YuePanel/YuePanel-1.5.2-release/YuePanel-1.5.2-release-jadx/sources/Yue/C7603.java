package Yue;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;

/* JADX INFO: renamed from: Yue.ۥۢ۠۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7603 extends C7017 {

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public InterfaceC7601 f23013;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7603(InterfaceC8561 interfaceC8561) {
        super(interfaceC8561);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static void m23800(String[] strArr) throws Exception {
        System.setProperty("javax.xml.stream.XMLInputFactory", "com.bea.xml.stream.MXParserFactory");
        AbstractC8553 abstractC8553M28451 = AbstractC8553.m28451();
        C8010 c8010 = new C8010();
        c8010.m25250(1);
        c8010.m25250(2);
        InterfaceC8561 interfaceC8561Mo2576 = abstractC8553M28451.mo2576(abstractC8553M28451.mo18443(new FileReader(strArr[0])), c8010);
        while (interfaceC8561Mo2576.hasNext()) {
            System.out.println(interfaceC8561Mo2576.mo18348());
            interfaceC8561Mo2576.next();
        }
        InterfaceC8561 interfaceC8561Mo25762 = abstractC8553M28451.mo2576(abstractC8553M28451.mo18443(new FileReader(strArr[0])), new C6343(new C6848("banana", "B")));
        C8562 c8562 = new C8562(new OutputStreamWriter(new FileOutputStream("out.stream")));
        while (interfaceC8561Mo25762.hasNext()) {
            c8562.mo21812(interfaceC8561Mo25762);
            interfaceC8561Mo25762.next();
        }
        c8562.flush();
    }

    @Override // Yue.C7017, Yue.InterfaceC8561
    public boolean hasNext() throws C8559 {
        while (super.hasNext()) {
            if (this.f23013.mo2810(m21808())) {
                return true;
            }
            super.next();
        }
        return false;
    }

    @Override // Yue.C7017, Yue.InterfaceC8561
    public int next() throws C8559 {
        if (hasNext()) {
            return super.next();
        }
        throw new IllegalStateException("next() may not be called  when there are no more  items to return");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public void m23801(InterfaceC7601 interfaceC7601) {
        this.f23013 = interfaceC7601;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7603(InterfaceC8561 interfaceC8561, InterfaceC7601 interfaceC7601) {
        super(interfaceC8561);
        m23801(interfaceC7601);
    }
}

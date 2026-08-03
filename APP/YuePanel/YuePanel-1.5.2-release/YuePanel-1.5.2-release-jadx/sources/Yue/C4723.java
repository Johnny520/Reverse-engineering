package Yue;

import java.io.FileReader;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4723 implements InterfaceC8549 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public InterfaceC8549 f10094;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public InterfaceC4704 f10095;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4723(InterfaceC8549 interfaceC8549) throws C8559 {
        this.f10094 = interfaceC8549;
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m1636(String[] strArr) throws Exception {
        System.setProperty("javax.xml.stream.XMLInputFactory", "com.bea.xml.stream.MXParserFactory");
        System.setProperty("javax.xml.stream.XMLEventFactory", "com.bea.xml.stream.EventFactory");
        AbstractC8553 abstractC8553M28451 = AbstractC8553.m28451();
        C8010 c8010 = new C8010();
        c8010.m25250(1);
        c8010.m25250(2);
        InterfaceC8549 interfaceC8549Mo2575 = abstractC8553M28451.mo2575(abstractC8553M28451.mo18437(new FileReader(strArr[0])), c8010);
        while (interfaceC8549Mo2575.hasNext()) {
            System.out.println(interfaceC8549Mo2575.mo14125());
        }
    }

    @Override // Yue.InterfaceC8549
    public void close() throws C8559 {
        this.f10094.close();
    }

    @Override // Yue.InterfaceC8549
    public Object getProperty(String str) {
        return this.f10094.getProperty(str);
    }

    @Override // Yue.InterfaceC8549, java.util.Iterator
    public boolean hasNext() {
        while (this.f10094.hasNext()) {
            try {
                if (this.f10095.mo1620(this.f10094.peek())) {
                    return true;
                }
                this.f10094.mo14125();
            } catch (C8559 unused) {
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            return mo14125();
        } catch (C8559 unused) {
            return null;
        }
    }

    @Override // Yue.InterfaceC8549
    public InterfaceC8543 peek() throws C8559 {
        if (hasNext()) {
            return this.f10094.peek();
        }
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m1637(InterfaceC4704 interfaceC4704) {
        this.f10095 = interfaceC4704;
    }

    @Override // Yue.InterfaceC8549
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public InterfaceC8543 mo14123() throws C8559 {
        while (hasNext()) {
            InterfaceC8543 interfaceC8543Mo14125 = mo14125();
            if (interfaceC8543Mo14125.mo9146() && !((InterfaceC3788) interfaceC8543Mo14125).mo10441()) {
                throw new C8559("Unexpected text");
            }
            if (interfaceC8543Mo14125.mo9149() || interfaceC8543Mo14125.mo9148()) {
                return interfaceC8543Mo14125;
            }
        }
        throw new C8559("Unexpected end of Document");
    }

    @Override // Yue.InterfaceC8549
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public String mo14124() throws C8559 {
        StringBuffer stringBuffer = new StringBuffer();
        if (!mo14125().mo9149()) {
            throw new C8559("Precondition for readText is nextEvent().getTypeEventType() == START_ELEMENT");
        }
        while (hasNext()) {
            InterfaceC8543 interfaceC8543Peek = peek();
            if (interfaceC8543Peek.mo9149()) {
                throw new C8559("Unexpected Element start");
            }
            if (interfaceC8543Peek.mo9146()) {
                stringBuffer.append(((InterfaceC3788) interfaceC8543Peek).getData());
            }
            if (interfaceC8543Peek.mo9148()) {
                return stringBuffer.toString();
            }
            mo14125();
        }
        throw new C8559("Unexpected end of Document");
    }

    @Override // Yue.InterfaceC8549
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public InterfaceC8543 mo14125() throws C8559 {
        if (hasNext()) {
            return this.f10094.mo14125();
        }
        return null;
    }

    public C4723(InterfaceC8549 interfaceC8549, InterfaceC4704 interfaceC4704) throws C8559 {
        this.f10094 = interfaceC8549;
        this.f10095 = interfaceC4704;
    }
}

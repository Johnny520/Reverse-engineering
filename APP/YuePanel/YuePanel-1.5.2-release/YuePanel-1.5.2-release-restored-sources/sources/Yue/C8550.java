package Yue;

import java.io.FileReader;
import java.io.PrintStream;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥۢۦۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8550 implements InterfaceC8549, InterfaceC8546 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C3825 f25378;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f25379;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public InterfaceC8561 f25380;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public InterfaceC8544 f25381;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f25382;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public C4095 f25383;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8550(InterfaceC8561 interfaceC8561) throws C8559 {
        this(interfaceC8561, new C8545());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static void m28427(String[] strArr) throws Exception {
        System.setProperty("javax.xml.stream.XMLInputFactory", "com.bea.xml.stream.MXParserFactory");
        System.setProperty("javax.xml.stream.XMLEventFactory", "com.bea.xml.stream.EventFactory");
        InterfaceC8549 interfaceC8549Mo18437 = AbstractC8553.m28451().mo18437(new FileReader(strArr[0]));
        while (interfaceC8549Mo18437.hasNext()) {
            InterfaceC8543 interfaceC8543Mo14125 = interfaceC8549Mo18437.mo14125();
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");
            stringBuffer.append(C4606.m1561(interfaceC8543Mo14125.mo9150()));
            stringBuffer.append("][");
            stringBuffer.append(interfaceC8543Mo14125);
            stringBuffer.append("]");
            printStream.println(stringBuffer.toString());
        }
    }

    @Override // Yue.InterfaceC8549
    public void close() throws C8559 {
        m28429();
    }

    @Override // Yue.InterfaceC8549
    public Object getProperty(String str) {
        return this.f25383.m11569(str);
    }

    @Override // Yue.InterfaceC8549, java.util.Iterator
    public boolean hasNext() {
        if (!this.f25379) {
            return false;
        }
        if (!this.f25378.isEmpty()) {
            return true;
        }
        if (this.f25380.hasNext()) {
            return true;
        }
        this.f25379 = false;
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
        if (this.f25378.isEmpty() && !mo28426()) {
            return null;
        }
        return (InterfaceC8543) this.f25378.peek();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // Yue.InterfaceC8546
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo28423(InterfaceC8543 interfaceC8543) throws C8559 {
        this.f25378.add(interfaceC8543);
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
        InterfaceC8543 interfaceC8543Mo14125 = mo14125();
        if (!interfaceC8543Mo14125.mo9149()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Precondition for readText is nextEvent().getTypeEventType() == START_ELEMENT (got ");
            stringBuffer2.append(interfaceC8543Mo14125.mo9150());
            stringBuffer2.append(")");
            throw new C8559(stringBuffer2.toString());
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

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public InterfaceC8543 m28428() throws C8559 {
        return (InterfaceC8543) this.f25378.remove();
    }

    @Override // Yue.InterfaceC8549
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public InterfaceC8543 mo14125() throws C8559 {
        if (!m28431() || mo28426()) {
            return m28428();
        }
        throw new NoSuchElementException("Attempt to call nextEvent() on a stream with no more elements");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m28429() {
        this.f25382 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m28430() {
        return !this.f25382;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m28431() {
        return this.f25378.isEmpty();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo28426() throws C8559 {
        if (this.f25382) {
            return false;
        }
        this.f25381.mo3752(this.f25380, this);
        if (this.f25380.hasNext()) {
            this.f25380.next();
        }
        if (this.f25380.mo18329() == 8) {
            this.f25381.mo3752(this.f25380, this);
            this.f25382 = true;
        }
        return !m28431();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m28432(InterfaceC8544 interfaceC8544) {
        if (interfaceC8544 == null) {
            throw new IllegalArgumentException("XMLEvent Allocator may not be null");
        }
        this.f25381 = interfaceC8544;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m28433(C4095 c4095) {
        this.f25383 = c4095;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8550(InterfaceC8561 interfaceC8561, InterfaceC8544 interfaceC8544) throws C8559 {
        this.f25378 = new C3825();
        this.f25379 = true;
        this.f25382 = false;
        if (interfaceC8561 == null) {
            throw new IllegalArgumentException("XMLStreamReader may not be null");
        }
        if (interfaceC8544 == null) {
            throw new IllegalArgumentException("XMLEventAllocator may not be null");
        }
        this.f25380 = interfaceC8561;
        this.f25379 = true;
        this.f25381 = interfaceC8544;
        if (interfaceC8561.mo18329() == 7) {
            InterfaceC8543 interfaceC8543Mo3751 = this.f25381.mo3751(interfaceC8561);
            interfaceC8561.next();
            mo28423(interfaceC8543Mo3751);
        }
    }
}

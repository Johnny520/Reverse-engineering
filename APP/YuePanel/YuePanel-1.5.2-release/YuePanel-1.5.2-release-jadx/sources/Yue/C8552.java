package Yue;

import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۢۦۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8552 implements InterfaceC8551, InterfaceC8546 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public InterfaceC8563 f25384;

    public C8552(InterfaceC8563 interfaceC8563) {
        this.f25384 = interfaceC8563;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m28437(String[] strArr) throws Exception {
        System.setProperty("javax.xml.stream.XMLInputFactory", "com.bea.xml.stream.MXParserFactory");
        System.setProperty("javax.xml.stream.XMLEventFactory", "com.bea.xml.stream.EventFactory");
        C8552 c8552 = new C8552(new C8564(new OutputStreamWriter(System.out)));
        C5901 c5901 = new C5901();
        c5901.m18421(new C4095());
        c5901.m18425(new FileReader(strArr[0]));
        C8550 c8550 = new C8550(c5901);
        while (c8550.hasNext()) {
            InterfaceC8543 interfaceC8543Mo14125 = c8550.mo14125();
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("about to add:[");
            stringBuffer.append(interfaceC8543Mo14125);
            stringBuffer.append("];");
            printStream.println(stringBuffer.toString());
            c8552.mo28423(interfaceC8543Mo14125);
        }
        c8552.flush();
    }

    @Override // Yue.InterfaceC8551
    public void close() throws C8559 {
        this.f25384.close();
    }

    @Override // Yue.InterfaceC8551
    public void flush() throws C8559 {
        this.f25384.flush();
    }

    @Override // Yue.InterfaceC8551
    public String getPrefix(String str) throws C8559 {
        return this.f25384.getPrefix(str);
    }

    @Override // Yue.InterfaceC8551
    /* JADX INFO: renamed from: ۥ */
    public void mo4528(String str, String str2) throws C8559 {
        this.f25384.mo4536(str, str2);
    }

    @Override // Yue.InterfaceC8551
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC6349 mo4529() {
        return this.f25384.mo4537();
    }

    @Override // Yue.InterfaceC8551
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo28434(String str) throws C8559 {
        this.f25384.mo28491(str);
    }

    @Override // Yue.InterfaceC8551, Yue.InterfaceC8546
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo28423(InterfaceC8543 interfaceC8543) throws C8559 {
        switch (interfaceC8543.mo9150()) {
            case 1:
                m28448((InterfaceC7574) interfaceC8543);
                return;
            case 2:
                m28443((InterfaceC4643) interfaceC8543);
                return;
            case 3:
                m28446((InterfaceC6804) interfaceC8543);
                return;
            case 4:
                m28439((InterfaceC3788) interfaceC8543);
                return;
            case 5:
                m28440((InterfaceC3930) interfaceC8543);
                return;
            case 6:
            case 12:
            default:
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to add event[");
                stringBuffer.append(C4606.m1561(interfaceC8543.mo9150()));
                stringBuffer.append("]");
                throw new C8559(stringBuffer.toString());
            case 7:
                m28447((InterfaceC7572) interfaceC8543);
                return;
            case 8:
                m28442((InterfaceC4641) interfaceC8543);
                return;
            case 9:
                m28444((InterfaceC4651) interfaceC8543);
                return;
            case 10:
                m28438((InterfaceC3453) interfaceC8543);
                return;
            case 11:
                m28441((InterfaceC4269) interfaceC8543);
                return;
            case 13:
                m28445((InterfaceC6347) interfaceC8543);
                return;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m28438(InterfaceC3453 interfaceC3453) throws C8559 {
        m28449(interfaceC3453);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m28439(InterfaceC3788 interfaceC3788) throws C8559 {
        if (interfaceC3788.mo10442()) {
            this.f25384.mo28480(interfaceC3788.getData());
        } else {
            this.f25384.mo28502(interfaceC3788.getData());
        }
    }

    @Override // Yue.InterfaceC8551
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo28435(InterfaceC6349 interfaceC6349) throws C8559 {
        this.f25384.mo28492(interfaceC6349);
    }

    @Override // Yue.InterfaceC8551
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo28436(InterfaceC8549 interfaceC8549) throws C8559 {
        while (interfaceC8549.hasNext()) {
            mo28423(interfaceC8549.mo14125());
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m28440(InterfaceC3930 interfaceC3930) throws C8559 {
        this.f25384.mo28482(interfaceC3930.getText());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m28441(InterfaceC4269 interfaceC4269) throws C8559 {
        this.f25384.mo28475(interfaceC4269.mo12323());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m28442(InterfaceC4641 interfaceC4641) throws C8559 {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m28443(InterfaceC4643 interfaceC4643) throws C8559 {
        interfaceC4643.getName().m21588();
        interfaceC4643.getName().m3295();
        interfaceC4643.getName().m3294();
        this.f25384.mo28498();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m28444(InterfaceC4651 interfaceC4651) throws C8559 {
        this.f25384.mo28479(interfaceC4651.getName());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m28445(InterfaceC6347 interfaceC6347) throws C8559 {
        m28450(interfaceC6347);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m28446(InterfaceC6804 interfaceC6804) throws C8559 {
        this.f25384.mo28476(interfaceC6804.getTarget(), interfaceC6804.getData());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m28447(InterfaceC7572 interfaceC7572) throws C8559 {
        String strMo23707 = interfaceC7572.mo23707();
        String version = interfaceC7572.getVersion();
        interfaceC7572.mo23708();
        this.f25384.mo28481(strMo23707, version);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m28448(InterfaceC7574 interfaceC7574) throws C8559 {
        String strM21588 = interfaceC7574.getName().m21588();
        String strM3295 = interfaceC7574.getName().m3295();
        this.f25384.mo28496(strM21588, interfaceC7574.getName().m3294(), strM3295);
        Iterator namespaces = interfaceC7574.getNamespaces();
        while (namespaces.hasNext()) {
            m28450((InterfaceC6347) namespaces.next());
        }
        Iterator attributes = interfaceC7574.getAttributes();
        while (attributes.hasNext()) {
            m28449((InterfaceC3453) attributes.next());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m28449(InterfaceC3453 interfaceC3453) throws C8559 {
        this.f25384.mo28478(interfaceC3453.getName().m3295(), interfaceC3453.getName().m3294(), interfaceC3453.getValue());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m28450(InterfaceC6347 interfaceC6347) throws C8559 {
        if (interfaceC6347.mo19842()) {
            this.f25384.mo28474(interfaceC6347.mo9147());
        } else {
            this.f25384.mo28477(interfaceC6347.getPrefix(), interfaceC6347.mo9147());
        }
    }
}

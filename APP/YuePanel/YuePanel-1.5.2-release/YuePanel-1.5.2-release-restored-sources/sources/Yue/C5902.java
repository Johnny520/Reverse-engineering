package Yue;

import java.io.InputStream;
import java.io.Reader;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import org.xml.sax.InputSource;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5902 extends AbstractC8553 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public C4095 f14736 = new C4095();

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static AbstractC8553 m18433() {
        return AbstractC8553.m28451();
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC8549 mo2575(InterfaceC8549 interfaceC8549, InterfaceC4704 interfaceC4704) throws C8559 {
        return new C4723(interfaceC8549, interfaceC4704);
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC8561 mo2576(InterfaceC8561 interfaceC8561, InterfaceC7601 interfaceC7601) throws C8559 {
        return new C7603(interfaceC8561, interfaceC7601);
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public InterfaceC8549 mo18434(InterfaceC8561 interfaceC8561) throws C8559 {
        return this.f14736.m11567() == null ? new C8550(interfaceC8561) : new C8550(interfaceC8561, this.f14736.m11567().mo23777());
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public InterfaceC8549 mo18435(InputStream inputStream) throws C8559 {
        return mo18434(mo18441(inputStream));
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public InterfaceC8549 mo18436(InputStream inputStream, String str) throws C8559 {
        return mo18434(mo18442(inputStream, str));
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public InterfaceC8549 mo18437(Reader reader) throws C8559 {
        return mo18434(mo18443(reader));
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public InterfaceC8549 mo18438(String str, InputStream inputStream) throws C8559 {
        return mo18435(inputStream);
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public InterfaceC8549 mo18439(String str, Reader reader) throws C8559 {
        return mo18437(reader);
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public InterfaceC8549 mo18440(Source source) throws C8559 {
        return mo18434(mo18446(source));
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public InterfaceC8561 mo18441(InputStream inputStream) throws C8559 {
        C5901 c5901 = new C5901();
        c5901.m18423(inputStream);
        c5901.m18421(this.f14736);
        return c5901;
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public InterfaceC8561 mo18442(InputStream inputStream, String str) throws C8559 {
        C5901 c5901 = new C5901();
        c5901.m18424(inputStream, str);
        c5901.m18421(this.f14736);
        return c5901;
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public InterfaceC8561 mo18443(Reader reader) throws C8559 {
        C5901 c5901 = new C5901();
        c5901.m18425(reader);
        c5901.m18421(this.f14736);
        return c5901;
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public InterfaceC8561 mo18444(String str, InputStream inputStream) throws C8559 {
        return mo18441(inputStream);
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public InterfaceC8561 mo18445(String str, Reader reader) throws C8559 {
        return mo18443(reader);
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public InterfaceC8561 mo18446(Source source) throws C8559 {
        if (!(source instanceof SAXSource)) {
            boolean z = source instanceof DOMSource;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("XMLInputFactory.createXMLStreamReader(");
            stringBuffer.append(source.getClass().getName());
            stringBuffer.append(") not yet implemented");
            throw new UnsupportedOperationException(stringBuffer.toString());
        }
        InputSource inputSource = ((SAXSource) source).getInputSource();
        if (inputSource != null) {
            String systemId = inputSource.getSystemId();
            Reader characterStream = inputSource.getCharacterStream();
            if (characterStream != null) {
                return mo18445(systemId, characterStream);
            }
            InputStream byteStream = inputSource.getByteStream();
            if (byteStream != null) {
                return mo18444(systemId, byteStream);
            }
        }
        throw new C8559("Can only create STaX reader for a SAXSource if Reader or InputStream exposed via getSource(); can not use -- not implemented.");
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public InterfaceC8544 mo18447() {
        return this.f14736.m11567();
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Object mo18448(String str) throws IllegalArgumentException {
        return this.f14736.m11569(str);
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public InterfaceC8556 mo18449() {
        return this.f14736.m11571();
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public InterfaceC8557 mo18450() {
        return this.f14736.m11572();
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean mo18451(String str) {
        return this.f14736.m11576(str);
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void mo18452(InterfaceC8544 interfaceC8544) {
        this.f14736.m11582(interfaceC8544);
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void mo18453(String str, Object obj) throws IllegalArgumentException {
        this.f14736.m11585(str, obj);
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void mo18454(InterfaceC8556 interfaceC8556) {
        this.f14736.m11589(interfaceC8556);
    }

    @Override // Yue.AbstractC8553
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void mo18455(InterfaceC8557 interfaceC8557) {
        this.f14736.m11590(interfaceC8557);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean m18456() {
        return this.f14736.m11573();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m18457(boolean z) {
        this.f14736.m11581(z);
    }
}

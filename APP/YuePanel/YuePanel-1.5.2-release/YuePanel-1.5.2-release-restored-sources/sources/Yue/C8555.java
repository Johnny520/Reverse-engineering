package Yue;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import javax.xml.transform.Result;

/* JADX INFO: renamed from: Yue.ۥۢۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8555 extends AbstractC8554 {

    /* JADX INFO: renamed from: ۥ۟ */
    public C4095 f3554 = new C4095();

    @Override // Yue.AbstractC8554
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC8551 mo4530(OutputStream outputStream) throws C8559 {
        return new C8552(mo28457(outputStream));
    }

    @Override // Yue.AbstractC8554
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC8551 mo4531(OutputStream outputStream, String str) throws C8559 {
        return new C8552(mo28458(outputStream, str));
    }

    @Override // Yue.AbstractC8554
    /* JADX INFO: renamed from: ۥ۟۟ */
    public InterfaceC8551 mo28455(Writer writer) throws C8559 {
        return new C8552(mo28459(writer));
    }

    @Override // Yue.AbstractC8554
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public InterfaceC8551 mo28456(Result result) throws C8559 {
        throw new UnsupportedOperationException();
    }

    @Override // Yue.AbstractC8554
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public InterfaceC8563 mo28457(OutputStream outputStream) throws C8559 {
        return mo28459(new BufferedWriter(new OutputStreamWriter(outputStream), 500));
    }

    @Override // Yue.AbstractC8554
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public InterfaceC8563 mo28458(OutputStream outputStream, String str) throws C8559 {
        try {
            return mo28459(new BufferedWriter(new OutputStreamWriter(outputStream, str), 500));
        } catch (UnsupportedEncodingException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Unsupported encoding ");
            stringBuffer.append(str);
            throw new C8559(stringBuffer.toString(), e);
        }
    }

    @Override // Yue.AbstractC8554
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public InterfaceC8563 mo28459(Writer writer) throws C8559 {
        C8564 c8564 = new C8564(writer);
        c8564.m28518(this.f3554);
        return c8564;
    }

    @Override // Yue.AbstractC8554
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public InterfaceC8563 mo28460(Result result) throws C8559 {
        throw new UnsupportedOperationException();
    }

    @Override // Yue.AbstractC8554
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public Object mo28461(String str) {
        return this.f3554.m11569(str);
    }

    @Override // Yue.AbstractC8554
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo28462(String str) {
        return this.f3554.m11576(str);
    }

    @Override // Yue.AbstractC8554
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo28463(String str, Object obj) {
        this.f3554.m11585(str, obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m28464() {
        return this.f3554.m11575();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m28465(boolean z) {
        this.f3554.m11584(z);
    }
}

package Yue;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: Yue.ۥ۠ۡ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4649 extends AbstractC3516 implements InterfaceC4648 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final String f9978;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final String f9979;

    public C4649(String str, String str2) {
        super(15);
        this.f9978 = str;
        this.f9979 = str2;
    }

    @Override // Yue.InterfaceC4648
    public String getName() {
        return this.f9978;
    }

    @Override // Yue.AbstractC3516, Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥ */
    public String mo529() {
        return null;
    }

    @Override // Yue.AbstractC3516, Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public String mo9145() {
        return null;
    }

    @Override // Yue.InterfaceC4648
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public String mo13989() {
        return this.f9979;
    }

    @Override // Yue.InterfaceC4648
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
    public String mo13990() {
        return null;
    }

    @Override // Yue.InterfaceC4648
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ */
    public String mo13991() {
        return null;
    }

    @Override // Yue.AbstractC3516
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo9411(Writer writer) throws IOException {
        writer.write("<!ENTITY ");
        writer.write(getName());
        writer.write(34);
        writer.write(mo13989());
        writer.write("\">");
    }
}

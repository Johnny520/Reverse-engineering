package Yue;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4283 extends AbstractC3516 implements InterfaceC4269 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public String f8811;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public List f8812;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public List f8813;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4283() {
        m12375();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static InterfaceC4648 m12373(C4281 c4281) {
        return new C4649(c4281.m12355(), c4281.m12359());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static InterfaceC6402 m12374(C4288 c4288) {
        AbstractC4284 abstractC4284M1246 = c4288.m1246();
        return new C6403(c4288.m12383(), abstractC4284M1246 instanceof C4295 ? ((C4295) abstractC4284M1246).m12414() : null, abstractC4284M1246.m1244());
    }

    @Override // Yue.InterfaceC4269
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public List mo12320() {
        return this.f8812;
    }

    @Override // Yue.InterfaceC4269
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public Object mo12321() {
        return null;
    }

    @Override // Yue.InterfaceC4269
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
    public List mo12322() {
        return this.f8813;
    }

    @Override // Yue.InterfaceC4269
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟ */
    public String mo12323() {
        return this.f8811;
    }

    @Override // Yue.AbstractC3516
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo9411(Writer writer) throws IOException {
        writer.write("<!DOCTYPE ");
        String str = this.f8811;
        if (str != null && str.length() > 0) {
            writer.write(91);
            writer.write(this.f8811);
            writer.write(93);
        }
        writer.write(62);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void m12375() {
        m9418(11);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public void m12376(String str) {
        this.f8811 = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public void m12377(List list) {
        this.f8813 = list;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public void m12378(List list) {
        this.f8812 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4283(String str) {
        m12375();
        m12376(str);
    }
}

package Yue;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3516 implements InterfaceC8543, InterfaceC5801 {

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int f5929;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int f5930;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int f5931;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int f5932;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public String f5933;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3516() {
        this.f5929 = -1;
        this.f5930 = -1;
        this.f5931 = -1;
        this.f5932 = 0;
    }

    @Override // Yue.InterfaceC8543
    public boolean isAttribute() {
        return this.f5929 == 10;
    }

    public String toString() {
        StringWriter stringWriter = new StringWriter(64);
        try {
            mo9155(stringWriter);
        } catch (C8559 e) {
            stringWriter.write("[ERROR: ");
            stringWriter.write(e.toString());
            stringWriter.write("]");
        }
        return stringWriter.toString();
    }

    @Override // Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥ */
    public String mo529() {
        return null;
    }

    @Override // Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public String mo9145() {
        return null;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public boolean mo9146() {
        return this.f5929 == 4;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo9148() {
        return this.f5929 == 2;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public boolean mo9149() {
        return this.f5929 == 1;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public int mo9150() {
        return this.f5929;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public InterfaceC5801 mo9151() {
        return this;
    }

    @Override // Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public int mo9152() {
        return this.f5931;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public boolean mo9154() {
        return this.f5929 == 13;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public final void mo9155(Writer writer) throws C8559 {
        try {
            mo9411(writer);
        } catch (IOException e) {
            throw new C8559(e);
        }
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public C6848 mo9156() {
        return null;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public boolean mo9157() {
        return this.f5929 == 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟ۢۥۥ */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ */
    public InterfaceC4643 mo9159() {
        return (InterfaceC4643) this;
    }

    @Override // Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public int mo9160() {
        return this.f5930;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟ۢۥۥ */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public InterfaceC3788 mo9161() {
        return (InterfaceC3788) this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟ۢۥۥ */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ */
    public InterfaceC7574 mo9162() {
        return (InterfaceC7574) this;
    }

    @Override // Yue.InterfaceC5801
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ */
    public int mo9163() {
        return this.f5932;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public boolean mo9164() {
        return this.f5929 == 3;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ */
    public boolean mo9165() {
        return this.f5929 == 8;
    }

    @Override // Yue.InterfaceC8543
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ */
    public boolean mo9166() {
        return this.f5929 == 9;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public abstract void mo9411(Writer writer) throws C8559, IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public String m9412() {
        return this.f5933;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public String m9413() {
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public String m9414() {
        return C4606.m1561(this.f5929);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public void m9415() {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public void m9416(int i) {
        this.f5932 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public void m9417(int i) {
        this.f5931 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public void m9418(int i) {
        this.f5929 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public void m9419(int i) {
        this.f5930 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public void m9420(String str) {
        this.f5933 = str;
    }

    public AbstractC3516(int i) {
        this.f5930 = -1;
        this.f5931 = -1;
        this.f5932 = 0;
        this.f5929 = i;
    }
}

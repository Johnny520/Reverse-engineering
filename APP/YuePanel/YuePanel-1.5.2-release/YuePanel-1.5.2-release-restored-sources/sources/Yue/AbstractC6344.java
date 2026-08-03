package Yue;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: Yue.ۥۡۢ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6344 extends AbstractC3516 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public C6848 f16115;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC6344() {
    }

    public C6848 getName() {
        return this.f16115;
    }

    @Override // Yue.AbstractC3516
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public abstract void mo9411(Writer writer) throws C8559, IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public String m19839() {
        if ("".equals(this.f16115.m3295())) {
            return this.f16115.m3294();
        }
        if (this.f16115.m21588() == null || this.f16115.m21588().equals("")) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("['");
            stringBuffer.append(this.f16115.m3295());
            stringBuffer.append("']:");
            stringBuffer.append(this.f16115.m3294());
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("['");
        stringBuffer2.append(this.f16115.m3295());
        stringBuffer2.append("']:");
        stringBuffer2.append(this.f16115.m21588());
        stringBuffer2.append(":");
        stringBuffer2.append(this.f16115.m3294());
        return stringBuffer2.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public void m19840(C6848 c6848) {
        this.f16115 = c6848;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC6344(C6848 c6848) {
        this.f16115 = c6848;
    }

    public AbstractC6344(String str) {
        this.f16115 = new C6848(str);
    }

    public AbstractC6344(String str, String str2, String str3) {
        this.f16115 = new C6848(str2, str3, str);
    }
}

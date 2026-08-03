package Yue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7673 implements ILoggerFactory {

    /* JADX INFO: renamed from: ۥ */
    public boolean f3003 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public final Map<String, C7672> f3004 = new HashMap();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final LinkedBlockingQueue<C7674> f23085 = new LinkedBlockingQueue<>();

    @Override // org.slf4j.ILoggerFactory
    /* JADX INFO: renamed from: ۥ */
    public synchronized InterfaceC5866 mo2809(String str) {
        C7672 c7672;
        c7672 = this.f3004.get(str);
        if (c7672 == null) {
            c7672 = new C7672(str, this.f23085, this.f3003);
            this.f3004.put(str, c7672);
        }
        return c7672;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m3777() {
        this.f3004.clear();
        this.f23085.clear();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public LinkedBlockingQueue<C7674> m24413() {
        return this.f23085;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public List<String> m24414() {
        return new ArrayList(this.f3004.keySet());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public List<C7672> m24415() {
        return new ArrayList(this.f3004.values());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m24416() {
        this.f3003 = true;
    }
}

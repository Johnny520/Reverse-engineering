package p286t8;

import android.content.Context;
import be.C0285i;
import ca.C0512c;
import java.util.concurrent.ConcurrentHashMap;
import p153k8.C2351o;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p219oh.AbstractC3165h;

/* JADX INFO: renamed from: t8.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4137b {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f13632a = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m8325a(C2351o c2351o, String str) {
        if (!m8326b(str) || c2351o.f7721i || c2351o.m5630q() || c2351o.m5618e()) {
            return false;
        }
        return c2351o.m5627n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m8326b(String str) {
        return AbstractC3156t.m6733W(str, "@chatroom", false) || AbstractC3156t.m6733W(str, "@im.chatroom", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m8327c(Context context, String str, long j3) {
        String string = AbstractC3149m.m6703R0(str).toString();
        boolean zM6782i = AbstractC3165h.m6782i(context, string);
        if (m8326b(string) && j3 > 0 && zM6782i) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C4136a c4136a = new C4136a(string, j3);
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            ConcurrentHashMap concurrentHashMap = f13632a;
            concurrentHashMap.put(c4136a, lValueOf);
            if (concurrentHashMap.size() >= 128) {
                concurrentHashMap.entrySet().removeIf(new C0285i(new C0512c(jCurrentTimeMillis, 12), 26));
            }
        }
    }
}

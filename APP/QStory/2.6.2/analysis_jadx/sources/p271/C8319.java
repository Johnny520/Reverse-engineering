package p271;

import com.google.gson.AbstractC3250;
import com.google.gson.C3252;
import com.google.gson.InterfaceC3246;
import com.google.gson.InterfaceC3248;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.slf4j.Marker;
import p260.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8319 implements InterfaceC3248 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f22950;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22951;

    public /* synthetic */ C8319(Object obj, int i) {
        this.f22951 = i;
        this.f22950 = obj;
    }

    public String toString() {
        switch (this.f22951) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + Marker.ANY_NON_NULL_MARKER + GregorianCalendar.class.getName() + ",adapter=" + ((C8283) this.f22950) + "]";
            default:
                return super.toString();
        }
    }

    @Override // com.google.gson.InterfaceC3248
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3250 mo7334(C3252 c3252, C8245 c8245) {
        int i = this.f22951;
        Object obj = this.f22950;
        switch (i) {
            case 0:
                if (c8245.f22816 == Number.class) {
                    return (C8317) obj;
                }
                return null;
            case 1:
                if (c8245.f22816 == Object.class) {
                    return new C8308(c3252, (InterfaceC3246) obj);
                }
                return null;
            default:
                Class cls = c8245.f22816;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (C8283) obj;
                }
                return null;
        }
    }
}

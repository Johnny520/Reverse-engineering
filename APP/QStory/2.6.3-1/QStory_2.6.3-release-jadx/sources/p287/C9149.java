package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.C4085;
import com.google.gson.InterfaceC4079;
import com.google.gson.InterfaceC4081;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.slf4j.Marker;
import p276.C9075;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9149 implements InterfaceC4081 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f23294;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23295;

    public /* synthetic */ C9149(Object obj, int i) {
        this.f23295 = i;
        this.f23294 = obj;
    }

    public String toString() {
        switch (this.f23295) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + Marker.ANY_NON_NULL_MARKER + GregorianCalendar.class.getName() + ",adapter=" + ((C9113) this.f23294) + "]";
            default:
                return super.toString();
        }
    }

    @Override // com.google.gson.InterfaceC4081
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4083 mo7880(C4085 c4085, C9075 c9075) {
        int i = this.f23295;
        Object obj = this.f23294;
        switch (i) {
            case 0:
                if (c9075.f23160 == Number.class) {
                    return (C9147) obj;
                }
                return null;
            case 1:
                if (c9075.f23160 == Object.class) {
                    return new C9138(c4085, (InterfaceC4079) obj);
                }
                return null;
            default:
                Class cls = c9075.f23160;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (C9113) obj;
                }
                return null;
        }
    }
}

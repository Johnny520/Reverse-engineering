package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.C3253;
import com.google.gson.InterfaceC3247;
import com.google.gson.InterfaceC3249;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.slf4j.Marker;
import p260.C8246;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8320 implements InterfaceC3249 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f22949;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22950;

    public /* synthetic */ C8320(Object obj, int i) {
        this.f22950 = i;
        this.f22949 = obj;
    }

    public String toString() {
        switch (this.f22950) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + Marker.ANY_NON_NULL_MARKER + GregorianCalendar.class.getName() + ",adapter=" + ((C8284) this.f22949) + "]";
            default:
                return super.toString();
        }
    }

    @Override // com.google.gson.InterfaceC3249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3251 mo7321(C3253 c3253, C8246 c8246) {
        int i = this.f22950;
        Object obj = this.f22949;
        switch (i) {
            case 0:
                if (c8246.f22815 == Number.class) {
                    return (C8318) obj;
                }
                return null;
            case 1:
                if (c8246.f22815 == Object.class) {
                    return new C8309(c3253, (InterfaceC3247) obj);
                }
                return null;
            default:
                Class cls = c8246.f22815;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (C8284) obj;
                }
                return null;
        }
    }
}

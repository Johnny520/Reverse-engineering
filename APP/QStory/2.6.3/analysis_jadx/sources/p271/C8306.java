package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.InterfaceC3238;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import p259.C8244;
import p259.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8306 extends AbstractC3251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f22916;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f22917;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22918 = 1;

    public C8306(C8319 c8319, InterfaceC3238 interfaceC3238) {
        this.f22917 = c8319;
        this.f22916 = interfaceC3238;
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        switch (this.f22918) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    c8244.m13773();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((C8319) this.f22917).mo7322(c8244, it.next());
                    }
                    c8244.m13781();
                } else {
                    c8244.m13778();
                }
                break;
            default:
                ((C8279) this.f22916).f22903.mo7322(c8244, obj);
                break;
        }
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        int i = this.f22918;
        Object obj = this.f22916;
        Object obj2 = this.f22917;
        switch (i) {
            case 0:
                if (c8245.m13787() == JsonToken.NULL) {
                    c8245.m13793();
                    return null;
                }
                Collection collection = (Collection) ((InterfaceC3238) obj).mo4482();
                c8245.m13797();
                while (c8245.m13801()) {
                    collection.add(((C8319) obj2).f22946.mo7323(c8245));
                }
                c8245.m13804();
                return collection;
            default:
                Class cls = (Class) obj2;
                Object objMo7323 = ((C8279) obj).f22903.mo7323(c8245);
                if (objMo7323 == null || cls.isInstance(objMo7323)) {
                    return objMo7323;
                }
                throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + objMo7323.getClass().getName() + "; at path " + c8245.m13807(true));
        }
    }

    public C8306(C8279 c8279, Class cls) {
        this.f22916 = c8279;
        this.f22917 = cls;
    }
}

package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.InterfaceC4070;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import p275.C9073;
import p275.C9074;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9135 extends AbstractC4083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f23261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f23262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f23263 = 1;

    public C9135(C9148 c9148, InterfaceC4070 interfaceC4070) {
        this.f23262 = c9148;
        this.f23261 = interfaceC4070;
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        switch (this.f23263) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    c9073.m14332();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((C9148) this.f23262).mo7881(c9073, it.next());
                    }
                    c9073.m14340();
                } else {
                    c9073.m14337();
                }
                break;
            default:
                ((C9108) this.f23261).f23248.mo7881(c9073, obj);
                break;
        }
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        int i = this.f23263;
        Object obj = this.f23261;
        Object obj2 = this.f23262;
        switch (i) {
            case 0:
                if (c9074.m14346() == JsonToken.NULL) {
                    c9074.m14352();
                    return null;
                }
                Collection collection = (Collection) ((InterfaceC4070) obj).mo5042();
                c9074.m14356();
                while (c9074.m14360()) {
                    collection.add(((C9148) obj2).f23291.mo7882(c9074));
                }
                c9074.m14363();
                return collection;
            default:
                Class cls = (Class) obj2;
                Object objMo7882 = ((C9108) obj).f23248.mo7882(c9074);
                if (objMo7882 == null || cls.isInstance(objMo7882)) {
                    return objMo7882;
                }
                throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + objMo7882.getClass().getName() + "; at path " + c9074.m14366(true));
        }
    }

    public C9135(C9108 c9108, Class cls) {
        this.f23261 = c9108;
        this.f23262 = cls;
    }
}

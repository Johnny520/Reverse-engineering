package p271;

import com.google.gson.AbstractC3250;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.InterfaceC3237;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import p259.C8243;
import p259.C8244;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8305 extends AbstractC3250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f22917;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f22918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22919 = 1;

    public C8305(C8318 c8318, InterfaceC3237 interfaceC3237) {
        this.f22918 = c8318;
        this.f22917 = interfaceC3237;
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335(C8243 c8243, Object obj) throws IOException {
        switch (this.f22919) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    c8243.m13756();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((C8318) this.f22918).mo7335(c8243, it.next());
                    }
                    c8243.m13764();
                } else {
                    c8243.m13762();
                }
                break;
            default:
                ((C8278) this.f22917).f22904.mo7335(c8243, obj);
                break;
        }
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) throws IOException {
        int i = this.f22919;
        Object obj = this.f22917;
        Object obj2 = this.f22918;
        switch (i) {
            case 0:
                if (c8244.m13770() == JsonToken.NULL) {
                    c8244.m13775();
                    return null;
                }
                Collection collection = (Collection) ((InterfaceC3237) obj).mo4472();
                c8244.m13779();
                while (c8244.m13784()) {
                    collection.add(((C8318) obj2).f22947.mo7336(c8244));
                }
                c8244.m13786();
                return collection;
            default:
                Class cls = (Class) obj2;
                Object objMo7336 = ((C8278) obj).f22904.mo7336(c8244);
                if (objMo7336 == null || cls.isInstance(objMo7336)) {
                    return objMo7336;
                }
                throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + objMo7336.getClass().getName() + "; at path " + c8244.m13789(true));
        }
    }

    public C8305(C8278 c8278, Class cls) {
        this.f22917 = c8278;
        this.f22918 = cls;
    }
}

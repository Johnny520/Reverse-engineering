package p287;

import androidx.activity.AbstractC0900;
import com.google.gson.AbstractC4083;
import com.google.gson.C4085;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.InterfaceC4070;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;
import p091.C7790;
import p275.C9073;
import p275.C9074;
import p276.C9075;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9148 extends AbstractC4083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f23290;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4083 f23291;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f23292;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f23293 = 1;

    public C9148(C4085 c4085, AbstractC4083 abstractC4083, Type type) {
        this.f23292 = c4085;
        this.f23291 = abstractC4083;
        this.f23290 = type;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        AbstractC4083 abstractC4083Mo7887;
        int i = this.f23293;
        AbstractC4083 abstractC4083 = this.f23291;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                C9148 c9148 = (C9148) abstractC4083;
                if (map == null) {
                    c9073.m14337();
                } else {
                    c9073.m14331();
                    for (Map.Entry entry : map.entrySet()) {
                        c9073.m14342(String.valueOf(entry.getKey()));
                        c9148.mo7881(c9073, entry.getValue());
                    }
                    c9073.m14344();
                }
                break;
            default:
                Type type = (Type) this.f23290;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                if (type2 != type) {
                    AbstractC4083 abstractC4083M7899 = ((C4085) this.f23292).m7899(new C9075(type2));
                    if (abstractC4083M7899 instanceof AbstractC9143) {
                        AbstractC4083 abstractC40832 = abstractC4083;
                        while ((abstractC40832 instanceof AbstractC9123) && (abstractC4083Mo7887 = ((AbstractC9123) abstractC40832).mo7887()) != abstractC40832) {
                            abstractC40832 = abstractC4083Mo7887;
                        }
                        if (abstractC40832 instanceof AbstractC9143) {
                        }
                    } else {
                        abstractC4083 = abstractC4083M7899;
                    }
                }
                abstractC4083.mo7881(c9073, obj);
                break;
        }
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        switch (this.f23293) {
            case 0:
                JsonToken jsonTokenM14346 = c9074.m14346();
                if (jsonTokenM14346 == JsonToken.NULL) {
                    c9074.m14352();
                    return null;
                }
                Map map = (Map) ((InterfaceC4070) this.f23290).mo5042();
                if (jsonTokenM14346 == JsonToken.BEGIN_ARRAY) {
                    c9074.m14356();
                    while (c9074.m14360()) {
                        c9074.m14356();
                        Object objMo7882 = ((C9148) this.f23292).f23291.mo7882(c9074);
                        if (map.put(objMo7882, ((C9148) this.f23291).f23291.mo7882(c9074)) != null) {
                            throw new JsonSyntaxException(AbstractC0900.m713(objMo7882, "duplicate key: "));
                        }
                        c9074.m14363();
                    }
                    c9074.m14363();
                } else {
                    c9074.m14355();
                    while (c9074.m14360()) {
                        C7790.f18986.getClass();
                        int iM14364 = c9074.f23152;
                        if (iM14364 == 0) {
                            iM14364 = c9074.m14364();
                        }
                        if (iM14364 == 13) {
                            c9074.f23152 = 9;
                        } else if (iM14364 == 12) {
                            c9074.f23152 = 8;
                        } else {
                            if (iM14364 != 14) {
                                throw c9074.m14368("a name");
                            }
                            c9074.f23152 = 10;
                        }
                        Object objMo78822 = ((C9148) this.f23292).f23291.mo7882(c9074);
                        if (map.put(objMo78822, ((C9148) this.f23291).f23291.mo7882(c9074)) != null) {
                            throw new JsonSyntaxException(AbstractC0900.m713(objMo78822, "duplicate key: "));
                        }
                    }
                    c9074.m14367();
                }
                return map;
            default:
                return this.f23291.mo7882(c9074);
        }
    }

    public C9148(C9134 c9134, C9148 c9148, C9148 c91482, InterfaceC4070 interfaceC4070) {
        this.f23292 = c9148;
        this.f23291 = c91482;
        this.f23290 = interfaceC4070;
    }
}

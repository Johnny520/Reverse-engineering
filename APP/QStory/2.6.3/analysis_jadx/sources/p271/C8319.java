package p271;

import androidx.activity.AbstractC0053;
import com.google.gson.AbstractC3251;
import com.google.gson.C3253;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.InterfaceC3238;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import p075.C6961;
import p259.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8319 extends AbstractC3251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f22945;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC3251 f22946;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f22947;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22948 = 1;

    public C8319(C3253 c3253, AbstractC3251 abstractC3251, Type type) {
        this.f22947 = c3253;
        this.f22946 = abstractC3251;
        this.f22945 = type;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo7322(p259.C8244 r4, java.lang.Object r5) throws java.io.IOException {
        /*
            r3 = this;
            int r0 = r3.f22948
            com.google.gson.飘花落叶言子楪哲苏兰世 r1 = r3.f22946
            switch(r0) {
                case 0: goto L4a;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r3.f22945
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r5 == 0) goto L1a
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 != 0) goto L15
            boolean r2 = r0 instanceof java.lang.reflect.TypeVariable
            if (r2 == 0) goto L1a
        L15:
            java.lang.Class r2 = r5.getClass()
            goto L1b
        L1a:
            r2 = r0
        L1b:
            if (r2 == r0) goto L46
            java.lang.Object r3 = r3.f22947
            com.google.gson.飘花落叶言子楪苏世哲兰 r3 = (com.google.gson.C3253) r3
            飘花落叶言楪哲世子苏兰.飘花落叶言子楪世苏哲兰 r0 = new 飘花落叶言楪哲世子苏兰.飘花落叶言子楪世苏哲兰
            r0.<init>(r2)
            com.google.gson.飘花落叶言子楪哲苏兰世 r3 = r3.m7340(r0)
            boolean r0 = r3 instanceof p271.AbstractC8314
            if (r0 != 0) goto L2f
            goto L45
        L2f:
            r0 = r1
        L30:
            boolean r2 = r0 instanceof p271.AbstractC8294
            if (r2 == 0) goto L40
            r2 = r0
            飘花落叶言楪哲子苏世兰.飘花落叶言子世楪哲苏兰 r2 = (p271.AbstractC8294) r2
            com.google.gson.飘花落叶言子楪哲苏兰世 r2 = r2.mo7328()
            if (r2 != r0) goto L3e
            goto L40
        L3e:
            r0 = r2
            goto L30
        L40:
            boolean r0 = r0 instanceof p271.AbstractC8314
            if (r0 != 0) goto L45
            goto L46
        L45:
            r1 = r3
        L46:
            r1.mo7322(r4, r5)
            return
        L4a:
            java.util.Map r5 = (java.util.Map) r5
            飘花落叶言楪哲子苏世兰.飘花落叶言子楪哲苏世兰 r1 = (p271.C8319) r1
            if (r5 != 0) goto L54
            r4.m13778()
            goto L81
        L54:
            r4.m13772()
            java.util.Set r3 = r5.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L5f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L7e
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.m13783(r0)
            java.lang.Object r5 = r5.getValue()
            r1.mo7322(r4, r5)
            goto L5f
        L7e:
            r4.m13785()
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p271.C8319.mo7322(飘花落叶言楪哲世子兰苏.飘花落叶言子楪世苏兰哲, java.lang.Object):void");
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        switch (this.f22948) {
            case 0:
                JsonToken jsonTokenM13787 = c8245.m13787();
                if (jsonTokenM13787 == JsonToken.NULL) {
                    c8245.m13793();
                    return null;
                }
                Map map = (Map) ((InterfaceC3238) this.f22945).mo4482();
                if (jsonTokenM13787 == JsonToken.BEGIN_ARRAY) {
                    c8245.m13797();
                    while (c8245.m13801()) {
                        c8245.m13797();
                        Object objMo7323 = ((C8319) this.f22947).f22946.mo7323(c8245);
                        if (map.put(objMo7323, ((C8319) this.f22946).f22946.mo7323(c8245)) != null) {
                            throw new JsonSyntaxException(AbstractC0053.m153(objMo7323, "duplicate key: "));
                        }
                        c8245.m13804();
                    }
                    c8245.m13804();
                } else {
                    c8245.m13796();
                    while (c8245.m13801()) {
                        C6961.f18641.getClass();
                        int iM13805 = c8245.f22807;
                        if (iM13805 == 0) {
                            iM13805 = c8245.m13805();
                        }
                        if (iM13805 == 13) {
                            c8245.f22807 = 9;
                        } else if (iM13805 == 12) {
                            c8245.f22807 = 8;
                        } else {
                            if (iM13805 != 14) {
                                throw c8245.m13809("a name");
                            }
                            c8245.f22807 = 10;
                        }
                        Object objMo73232 = ((C8319) this.f22947).f22946.mo7323(c8245);
                        if (map.put(objMo73232, ((C8319) this.f22946).f22946.mo7323(c8245)) != null) {
                            throw new JsonSyntaxException(AbstractC0053.m153(objMo73232, "duplicate key: "));
                        }
                    }
                    c8245.m13808();
                }
                return map;
            default:
                return this.f22946.mo7323(c8245);
        }
    }

    public C8319(C8305 c8305, C8319 c8319, C8319 c83192, InterfaceC3238 interfaceC3238) {
        this.f22947 = c8319;
        this.f22946 = c83192;
        this.f22945 = interfaceC3238;
    }
}

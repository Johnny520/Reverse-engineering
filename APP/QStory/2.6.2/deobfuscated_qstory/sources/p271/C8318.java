package p271;

import androidx.activity.AbstractC0053;
import com.google.gson.AbstractC3250;
import com.google.gson.C3252;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.InterfaceC3237;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import p075.C6960;
import p259.C8244;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8318 extends AbstractC3250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f22946;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC3250 f22947;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f22948;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22949 = 1;

    public C8318(C3252 c3252, AbstractC3250 abstractC3250, Type type) {
        this.f22948 = c3252;
        this.f22947 = abstractC3250;
        this.f22946 = type;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo7335(p259.C8243 r4, java.lang.Object r5) throws java.io.IOException {
        /*
            r3 = this;
            int r0 = r3.f22949
            com.google.gson.飘花落叶言子楪哲苏兰世 r1 = r3.f22947
            switch(r0) {
                case 0: goto L4a;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r3.f22946
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
            java.lang.Object r3 = r3.f22948
            com.google.gson.飘花落叶言子楪苏世哲兰 r3 = (com.google.gson.C3252) r3
            飘花落叶言楪哲世子苏兰.飘花落叶言子楪世苏哲兰 r0 = new 飘花落叶言楪哲世子苏兰.飘花落叶言子楪世苏哲兰
            r0.<init>(r2)
            com.google.gson.飘花落叶言子楪哲苏兰世 r3 = r3.m7353(r0)
            boolean r0 = r3 instanceof p271.AbstractC8313
            if (r0 != 0) goto L2f
            goto L45
        L2f:
            r0 = r1
        L30:
            boolean r2 = r0 instanceof p271.AbstractC8293
            if (r2 == 0) goto L40
            r2 = r0
            飘花落叶言楪哲子苏世兰.飘花落叶言子世楪哲苏兰 r2 = (p271.AbstractC8293) r2
            com.google.gson.飘花落叶言子楪哲苏兰世 r2 = r2.mo7341()
            if (r2 != r0) goto L3e
            goto L40
        L3e:
            r0 = r2
            goto L30
        L40:
            boolean r0 = r0 instanceof p271.AbstractC8313
            if (r0 != 0) goto L45
            goto L46
        L45:
            r1 = r3
        L46:
            r1.mo7335(r4, r5)
            return
        L4a:
            java.util.Map r5 = (java.util.Map) r5
            飘花落叶言楪哲子苏世兰.飘花落叶言子楪哲苏世兰 r1 = (p271.C8318) r1
            if (r5 != 0) goto L54
            r4.m13762()
            goto L81
        L54:
            r4.m13755()
            java.util.Set r3 = r5.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L5f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L7e
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.m13766(r0)
            java.lang.Object r5 = r5.getValue()
            r1.mo7335(r4, r5)
            goto L5f
        L7e:
            r4.m13768()
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p271.C8318.mo7335(飘花落叶言楪哲世子兰苏.飘花落叶言子楪世苏兰哲, java.lang.Object):void");
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) throws IOException {
        switch (this.f22949) {
            case 0:
                JsonToken jsonTokenM13770 = c8244.m13770();
                if (jsonTokenM13770 == JsonToken.NULL) {
                    c8244.m13775();
                    return null;
                }
                Map map = (Map) ((InterfaceC3237) this.f22946).mo4472();
                if (jsonTokenM13770 == JsonToken.BEGIN_ARRAY) {
                    c8244.m13779();
                    while (c8244.m13784()) {
                        c8244.m13779();
                        Object objMo7336 = ((C8318) this.f22948).f22947.mo7336(c8244);
                        if (map.put(objMo7336, ((C8318) this.f22947).f22947.mo7336(c8244)) != null) {
                            throw new JsonSyntaxException(AbstractC0053.m153(objMo7336, "duplicate key: "));
                        }
                        c8244.m13786();
                    }
                    c8244.m13786();
                } else {
                    c8244.m13778();
                    while (c8244.m13784()) {
                        C6960.f18646.getClass();
                        int iM13787 = c8244.f22808;
                        if (iM13787 == 0) {
                            iM13787 = c8244.m13787();
                        }
                        if (iM13787 == 13) {
                            c8244.f22808 = 9;
                        } else if (iM13787 == 12) {
                            c8244.f22808 = 8;
                        } else {
                            if (iM13787 != 14) {
                                throw c8244.m13791("a name");
                            }
                            c8244.f22808 = 10;
                        }
                        Object objMo73362 = ((C8318) this.f22948).f22947.mo7336(c8244);
                        if (map.put(objMo73362, ((C8318) this.f22947).f22947.mo7336(c8244)) != null) {
                            throw new JsonSyntaxException(AbstractC0053.m153(objMo73362, "duplicate key: "));
                        }
                    }
                    c8244.m13790();
                }
                return map;
            default:
                return this.f22947.mo7336(c8244);
        }
    }

    public C8318(C8304 c8304, C8318 c8318, C8318 c83182, InterfaceC3237 interfaceC3237) {
        this.f22948 = c8318;
        this.f22947 = c83182;
        this.f22946 = interfaceC3237;
    }
}

package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8447 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final byte[] f23384 = InterfaceC2912.m6355("[String");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f23383 = AbstractC2860.m5774("[String");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8447 f23382 = new C8447();

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo6039();
            return;
        }
        if (abstractC2897.m6058(obj, type, j)) {
            abstractC2897.mo6043(f23383, f23384);
        }
        String[] strArr = (String[]) obj;
        abstractC2897.mo6040(strArr.length);
        for (String str : strArr) {
            if (str != null) {
                abstractC2897.mo6017(str);
            } else if (abstractC2897.m6074(JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullStringAsEmpty.mask)) {
                abstractC2897.mo6017("");
            } else {
                abstractC2897.mo5967();
            }
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo6039();
        } else {
            abstractC2897.mo6013((String[]) obj);
        }
    }
}

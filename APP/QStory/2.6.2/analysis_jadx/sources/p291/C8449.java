package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2894;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2848;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.function.Function;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8449 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Function f23364;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8449 f23363 = new C8449(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final byte[] f23362 = InterfaceC2911.m6297("[B");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f23361 = AbstractC2859.m5729("[B");

    public C8449(Function function) {
        this.f23364 = function;
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (abstractC2896.m6014(obj, type)) {
            if (obj == byte[].class) {
                abstractC2896.mo5998(f23361, f23362);
            } else {
                abstractC2896.mo5997(obj.getClass().getName());
            }
        }
        Function function = this.f23364;
        abstractC2896.mo5991((function == null || obj == null) ? (byte[]) obj : (byte[]) function.apply(obj));
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        if (obj == null) {
            abstractC2896.mo5994();
            return;
        }
        Function function = this.f23364;
        byte[] byteArray = function != null ? (byte[]) function.apply(obj) : (byte[]) obj;
        C2894 c2894 = abstractC2896.f9176;
        GZIPOutputStream gZIPOutputStream2 = null;
        "millis".equals(null);
        if ("gzip".equals(null) || "gzip,base64".equals(null)) {
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    gZIPOutputStream = byteArray.length < 512 ? new GZIPOutputStream(byteArrayOutputStream, byteArray.length) : new GZIPOutputStream(byteArrayOutputStream);
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                gZIPOutputStream.write(byteArray);
                gZIPOutputStream.finish();
                byteArray = byteArrayOutputStream.toByteArray();
                AbstractC2848.m5680(gZIPOutputStream);
            } catch (IOException e2) {
                e = e2;
                throw new JSONException("write gzipBytes error", e);
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream2 = gZIPOutputStream;
                AbstractC2848.m5680(gZIPOutputStream2);
                throw th;
            }
        }
        if ("base64".equals(null) || "gzip,base64".equals(null) || (abstractC2896.m6032(j) & JSONWriter$Feature.WriteByteArrayAsBase64.mask) != 0) {
            abstractC2896.mo5943(byteArray);
        } else {
            abstractC2896.mo5915(byteArray);
        }
    }
}

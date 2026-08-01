package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2895;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2849;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.function.Function;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8441 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Function f23355;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8441 f23354 = new C8441(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final byte[] f23353 = InterfaceC2912.m6355("[B");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f23352 = AbstractC2860.m5774("[B");

    public C8441(Function function) {
        this.f23355 = function;
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (abstractC2897.m6059(obj, type)) {
            if (obj == byte[].class) {
                abstractC2897.mo6043(f23352, f23353);
            } else {
                abstractC2897.mo6042(obj.getClass().getName());
            }
        }
        Function function = this.f23355;
        abstractC2897.mo6036((function == null || obj == null) ? (byte[]) obj : (byte[]) function.apply(obj));
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        if (obj == null) {
            abstractC2897.mo6039();
            return;
        }
        Function function = this.f23355;
        byte[] byteArray = function != null ? (byte[]) function.apply(obj) : (byte[]) obj;
        C2895 c2895 = abstractC2897.f9178;
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
                AbstractC2849.m5725(gZIPOutputStream);
            } catch (IOException e2) {
                e = e2;
                throw new JSONException("write gzipBytes error", e);
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream2 = gZIPOutputStream;
                AbstractC2849.m5725(gZIPOutputStream2);
                throw th;
            }
        }
        if ("base64".equals(null) || "gzip,base64".equals(null) || (abstractC2897.m6078(j) & JSONWriter$Feature.WriteByteArrayAsBase64.mask) != 0) {
            abstractC2897.mo5988(byteArray);
        } else {
            abstractC2897.mo5960(byteArray);
        }
    }
}

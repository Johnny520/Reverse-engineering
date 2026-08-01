package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3682;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.function.Function;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9270 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Function f23700;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C9270 f23699 = new C9270(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final byte[] f23698 = InterfaceC3745.m6915("[B");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f23697 = AbstractC3693.m6334("[B");

    public C9270(Function function) {
        this.f23700 = function;
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (abstractC3730.m6619(obj, type)) {
            if (obj == byte[].class) {
                abstractC3730.mo6603(f23697, f23698);
            } else {
                abstractC3730.mo6602(obj.getClass().getName());
            }
        }
        Function function = this.f23700;
        abstractC3730.mo6596((function == null || obj == null) ? (byte[]) obj : (byte[]) function.apply(obj));
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        if (obj == null) {
            abstractC3730.mo6599();
            return;
        }
        Function function = this.f23700;
        byte[] byteArray = function != null ? (byte[]) function.apply(obj) : (byte[]) obj;
        C3728 c3728 = abstractC3730.f9523;
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
                AbstractC3682.m6285(gZIPOutputStream);
            } catch (IOException e2) {
                e = e2;
                throw new JSONException("write gzipBytes error", e);
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream2 = gZIPOutputStream;
                AbstractC3682.m6285(gZIPOutputStream2);
                throw th;
            }
        }
        if ("base64".equals(null) || "gzip,base64".equals(null) || (abstractC3730.m6638(j) & JSONWriter$Feature.WriteByteArrayAsBase64.mask) != 0) {
            abstractC3730.mo6548(byteArray);
        } else {
            abstractC3730.mo6520(byteArray);
        }
    }
}

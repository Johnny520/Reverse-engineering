package p250;

import android.util.Log;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p302.C9226;
import p302.InterfaceC9229;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8916 implements InterfaceC9229 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3806 f22655;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8912 f22656;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f22657;

    public C8916(ArrayList arrayList, C8912 c8912, C3806 c3806) {
        this.f22657 = arrayList;
        this.f22656 = c8912;
        this.f22655 = c3806;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC3821 mo7084(Object obj, int i, int i2, C9226 c9226) {
        byte[] byteArray;
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            bArr = new byte[16384];
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        while (true) {
            int i3 = inputStream.read(bArr);
            if (i3 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i3);
            if (byteArray != null) {
                return null;
            }
            return this.f22656.mo7084(ByteBuffer.wrap(byteArray), i, i2, c9226);
        }
        byteArrayOutputStream.flush();
        byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray != null) {
        }
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo7085(Object obj, C9226 c9226) {
        return !((Boolean) c9226.m14523(AbstractC8915.f22653)).booleanValue() && AbstractC3738.m6857(this.f22657, (InputStream) obj, this.f22655) == ImageHeaderParser$ImageType.GIF;
    }
}

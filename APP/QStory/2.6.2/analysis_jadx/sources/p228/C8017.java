package p228;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p222.AbstractC7983;
import p227.C8007;
import p286.C8396;
import p286.InterfaceC8395;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8017 implements InterfaceC8033, InterfaceC8395 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8017 f22146 = new C8017(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22147;

    public /* synthetic */ C8017(int i) {
        this.f22147 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ByteArrayInputStream m13476(String str) {
        if (!str.startsWith("data:image")) {
            C5919.m11249("Not a valid image data URL.");
            return null;
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            C5919.m11249("Missing comma in data URL.");
            return null;
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        C5919.m11249("Not a base64 image data URL.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Class m13477() {
        switch (this.f22147) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p286.InterfaceC8395
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public boolean mo298(Object obj, File file, C8396 c8396) throws Throwable {
        try {
            AbstractC7983.m13435((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e);
            return false;
        }
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8032 mo316(C8026 c8026) {
        int i = 0;
        int i2 = 1;
        switch (this.f22147) {
            case 0:
                return C8016.f22144;
            case 2:
                return new C8021(new C8017(i2), i);
            case 4:
                return new C8021(new C8017(3), i);
            case 6:
                return new C8016(i2);
            case 11:
                return new C8007(c8026.m13483(Uri.class, AssetFileDescriptor.class), 1);
            case 12:
                return new C8007(c8026.m13483(Uri.class, ParcelFileDescriptor.class), 1);
            case 13:
                return new C8007(c8026.m13483(Uri.class, InputStream.class), 1);
            default:
                return new C8013(c8026.m13483(C8036.class, InputStream.class));
        }
    }
}

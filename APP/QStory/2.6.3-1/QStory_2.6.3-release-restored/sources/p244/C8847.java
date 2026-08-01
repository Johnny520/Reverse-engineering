package p244;

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
import p238.AbstractC8813;
import p243.C8837;
import p302.C9226;
import p302.InterfaceC9225;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8847 implements InterfaceC8863, InterfaceC9225 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8847 f22488 = new C8847(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22489;

    public /* synthetic */ C8847(int i) {
        this.f22489 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ByteArrayInputStream m14063(String str) {
        if (!str.startsWith("data:image")) {
            C6755.m11869("Not a valid image data URL.");
            return null;
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            C6755.m11869("Missing comma in data URL.");
            return null;
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        C6755.m11869("Not a base64 image data URL.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Class m14064() {
        switch (this.f22489) {
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

    @Override // p302.InterfaceC9225
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public boolean mo859(Object obj, File file, C9226 c9226) throws Throwable {
        try {
            AbstractC8813.m14022((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e);
            return false;
        }
    }

    @Override // p244.InterfaceC8863
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8862 mo877(C8856 c8856) {
        int i = 0;
        int i2 = 1;
        switch (this.f22489) {
            case 0:
                return C8846.f22486;
            case 2:
                return new C8851(new C8847(i2), i);
            case 4:
                return new C8851(new C8847(3), i);
            case 6:
                return new C8846(i2);
            case 11:
                return new C8837(c8856.m14070(Uri.class, AssetFileDescriptor.class), 1);
            case 12:
                return new C8837(c8856.m14070(Uri.class, ParcelFileDescriptor.class), 1);
            case 13:
                return new C8837(c8856.m14070(Uri.class, InputStream.class), 1);
            default:
                return new C8843(c8856.m14070(C8866.class, InputStream.class));
        }
    }
}

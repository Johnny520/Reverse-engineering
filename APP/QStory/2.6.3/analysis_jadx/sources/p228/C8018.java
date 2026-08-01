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
import p222.AbstractC7984;
import p227.C8008;
import p286.C8397;
import p286.InterfaceC8396;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8018 implements InterfaceC8034, InterfaceC8396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8018 f22143 = new C8018(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22144;

    public /* synthetic */ C8018(int i) {
        this.f22144 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ByteArrayInputStream m13504(String str) {
        if (!str.startsWith("data:image")) {
            C5925.m11310("Not a valid image data URL.");
            return null;
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            C5925.m11310("Missing comma in data URL.");
            return null;
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        C5925.m11310("Not a base64 image data URL.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Class m13505() {
        switch (this.f22144) {
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

    @Override // p286.InterfaceC8396
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public boolean mo299(Object obj, File file, C8397 c8397) throws Throwable {
        try {
            AbstractC7984.m13463((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e);
            return false;
        }
    }

    @Override // p228.InterfaceC8034
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8033 mo317(C8027 c8027) {
        int i = 0;
        int i2 = 1;
        switch (this.f22144) {
            case 0:
                return C8017.f22141;
            case 2:
                return new C8022(new C8018(i2), i);
            case 4:
                return new C8022(new C8018(3), i);
            case 6:
                return new C8017(i2);
            case 11:
                return new C8008(c8027.m13511(Uri.class, AssetFileDescriptor.class), 1);
            case 12:
                return new C8008(c8027.m13511(Uri.class, ParcelFileDescriptor.class), 1);
            case 13:
                return new C8008(c8027.m13511(Uri.class, InputStream.class), 1);
            default:
                return new C8014(c8027.m13511(C8037.class, InputStream.class));
        }
    }
}

package p228;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2962;
import com.bumptech.glide.load.data.InterfaceC2963;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p231.C8055;
import p231.C8056;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8038 implements InterfaceC2962 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f22196;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Comparable f22197;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f22198;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22199;

    public /* synthetic */ C8038(Comparable comparable, Object obj, int i) {
        this.f22199 = i;
        this.f22197 = comparable;
        this.f22198 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C8038 m13523(Context context, Uri uri, C8056 c8056) {
        return new C8038(uri, new C8055(ComponentCallbacks2C3058.m6767(context).f9773.m6884().m6876(), c8056, ComponentCallbacks2C3058.m6767(context).f9769, context.getContentResolver()), 1);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    public final void cancel() {
        int i = this.f22199;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6430(Priority priority, InterfaceC2963 interfaceC2963) throws Throwable {
        Object objOpen;
        switch (this.f22199) {
            case 0:
                try {
                    C8018 c8018 = (C8018) this.f22198;
                    File file = (File) this.f22197;
                    switch (c8018.f22144) {
                        case 8:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f22196 = objOpen;
                    interfaceC2963.mo6434(objOpen);
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e);
                    }
                    interfaceC2963.mo6435(e);
                    return;
                }
                break;
            default:
                try {
                    InputStream inputStreamM13525 = m13525();
                    this.f22196 = inputStreamM13525;
                    interfaceC2963.mo6434(inputStreamM13525);
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
                    }
                    interfaceC2963.mo6435(e2);
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6431() {
        switch (this.f22199) {
        }
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6432() {
        switch (this.f22199) {
            case 0:
                Object obj = this.f22196;
                if (obj != null) {
                    try {
                        switch (((C8018) this.f22198).f22144) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.f22196;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6433() {
        switch (this.f22199) {
            case 0:
                return ((C8018) this.f22198).m13505();
            default:
                return InputStream.class;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0028: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:41), block:B:10:0x0028 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream m13525() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p228.C8038.m13525():java.io.InputStream");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    private final void m13522() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    private final void m13524() {
    }
}

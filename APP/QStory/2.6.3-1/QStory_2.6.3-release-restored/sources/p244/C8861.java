package p244;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC3794;
import com.bumptech.glide.load.data.InterfaceC3795;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8861 implements InterfaceC3794 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String[] f22525 = {"_data"};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f22526;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f22527;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22528;

    public /* synthetic */ C8861(Object obj, int i, Object obj2) {
        this.f22528 = i;
        this.f22526 = obj;
        this.f22527 = obj2;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    public final void cancel() {
        int i = this.f22528;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6990(Priority priority, InterfaceC3795 interfaceC3795) {
        Object objWrap;
        int i = this.f22528;
        Object obj = this.f22526;
        switch (i) {
            case 0:
                Cursor cursorQuery = ((Context) obj).getContentResolver().query((Uri) this.f22527, f22525, null, null, null);
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    interfaceC3795.mo6994(new File(string));
                    return;
                }
                interfaceC3795.mo6995(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f22527)));
                return;
            case 1:
                byte[] bArr = (byte[]) obj;
                switch (((C8847) this.f22527).f22489) {
                    case 1:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                interfaceC3795.mo6994(objWrap);
                return;
            default:
                try {
                    ByteArrayInputStream byteArrayInputStreamM14063 = C8847.m14063((String) obj);
                    this.f22527 = byteArrayInputStreamM14063;
                    interfaceC3795.mo6994(byteArrayInputStreamM14063);
                    return;
                } catch (IllegalArgumentException e) {
                    interfaceC3795.mo6995(e);
                    return;
                }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6991() {
        switch (this.f22528) {
        }
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6992() {
        switch (this.f22528) {
            case 0:
            case 1:
                break;
            default:
                try {
                    ((ByteArrayInputStream) this.f22527).close();
                } catch (IOException unused) {
                    return;
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6993() {
        switch (this.f22528) {
            case 0:
                return File.class;
            case 1:
                return ((C8847) this.f22527).m14064();
            default:
                return InputStream.class;
        }
    }

    public C8861(String str, C8847 c8847) {
        this.f22528 = 2;
        this.f22526 = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    private final void m14073() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    private final void m14074() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    private final void m14075() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    private final void m14076() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    private final void m14077() {
    }
}

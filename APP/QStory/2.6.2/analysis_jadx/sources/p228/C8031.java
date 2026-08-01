package p228;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2961;
import com.bumptech.glide.load.data.InterfaceC2962;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8031 implements InterfaceC2961 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String[] f22183 = {"_data"};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f22184;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f22185;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22186;

    public /* synthetic */ C8031(Object obj, int i, Object obj2) {
        this.f22186 = i;
        this.f22184 = obj;
        this.f22185 = obj2;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    public final void cancel() {
        int i = this.f22186;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6372(Priority priority, InterfaceC2962 interfaceC2962) {
        Object objWrap;
        int i = this.f22186;
        Object obj = this.f22184;
        switch (i) {
            case 0:
                Cursor cursorQuery = ((Context) obj).getContentResolver().query((Uri) this.f22185, f22183, null, null, null);
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
                    interfaceC2962.mo6376(new File(string));
                    return;
                }
                interfaceC2962.mo6377(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f22185)));
                return;
            case 1:
                byte[] bArr = (byte[]) obj;
                switch (((C8017) this.f22185).f22147) {
                    case 1:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                interfaceC2962.mo6376(objWrap);
                return;
            default:
                try {
                    ByteArrayInputStream byteArrayInputStreamM13476 = C8017.m13476((String) obj);
                    this.f22185 = byteArrayInputStreamM13476;
                    interfaceC2962.mo6376(byteArrayInputStreamM13476);
                    return;
                } catch (IllegalArgumentException e) {
                    interfaceC2962.mo6377(e);
                    return;
                }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6373() {
        switch (this.f22186) {
        }
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6374() {
        switch (this.f22186) {
            case 0:
            case 1:
                break;
            default:
                try {
                    ((ByteArrayInputStream) this.f22185).close();
                } catch (IOException unused) {
                    return;
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6375() {
        switch (this.f22186) {
            case 0:
                return File.class;
            case 1:
                return ((C8017) this.f22185).m13477();
            default:
                return InputStream.class;
        }
    }

    public C8031(String str, C8017 c8017) {
        this.f22186 = 2;
        this.f22184 = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    private final void m13486() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    private final void m13487() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    private final void m13488() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    private final void m13489() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    private final void m13490() {
    }
}

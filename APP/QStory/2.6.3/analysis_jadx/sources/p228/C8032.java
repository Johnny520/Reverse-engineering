package p228;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2962;
import com.bumptech.glide.load.data.InterfaceC2963;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8032 implements InterfaceC2962 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String[] f22180 = {"_data"};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f22181;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f22182;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22183;

    public /* synthetic */ C8032(Object obj, int i, Object obj2) {
        this.f22183 = i;
        this.f22181 = obj;
        this.f22182 = obj2;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    public final void cancel() {
        int i = this.f22183;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6430(Priority priority, InterfaceC2963 interfaceC2963) {
        Object objWrap;
        int i = this.f22183;
        Object obj = this.f22181;
        switch (i) {
            case 0:
                Cursor cursorQuery = ((Context) obj).getContentResolver().query((Uri) this.f22182, f22180, null, null, null);
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
                    interfaceC2963.mo6434(new File(string));
                    return;
                }
                interfaceC2963.mo6435(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f22182)));
                return;
            case 1:
                byte[] bArr = (byte[]) obj;
                switch (((C8018) this.f22182).f22144) {
                    case 1:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                interfaceC2963.mo6434(objWrap);
                return;
            default:
                try {
                    ByteArrayInputStream byteArrayInputStreamM13504 = C8018.m13504((String) obj);
                    this.f22182 = byteArrayInputStreamM13504;
                    interfaceC2963.mo6434(byteArrayInputStreamM13504);
                    return;
                } catch (IllegalArgumentException e) {
                    interfaceC2963.mo6435(e);
                    return;
                }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6431() {
        switch (this.f22183) {
        }
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6432() {
        switch (this.f22183) {
            case 0:
            case 1:
                break;
            default:
                try {
                    ((ByteArrayInputStream) this.f22182).close();
                } catch (IOException unused) {
                    return;
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6433() {
        switch (this.f22183) {
            case 0:
                return File.class;
            case 1:
                return ((C8018) this.f22182).m13505();
            default:
                return InputStream.class;
        }
    }

    public C8032(String str, C8018 c8018) {
        this.f22183 = 2;
        this.f22181 = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    private final void m13514() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    private final void m13515() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    private final void m13516() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    private final void m13517() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    private final void m13518() {
    }
}

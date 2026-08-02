package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tf1 implements f40 {
    public static final String[] k = {"_data"};
    public final /* synthetic */ int h;
    public final Object i;
    public Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ tf1(int i, Object obj, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final Class a() {
        switch (this.h) {
            case 0:
                return File.class;
            case 1:
                return ((z8) this.j).a();
            default:
                return InputStream.class;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void b() {
        switch (this.h) {
            case 0:
            case 1:
                break;
            default:
                try {
                    ((ByteArrayInputStream) this.j).close();
                } catch (IOException unused) {
                    return;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void c(i32 i32Var, e40 e40Var) {
        Object objWrap;
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                Cursor cursorQuery = ((Context) obj).getContentResolver().query((Uri) this.j, k, null, null, null);
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
                    e40Var.h(new File(string));
                    return;
                }
                e40Var.d(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.j)));
                return;
            case 1:
                byte[] bArr = (byte[]) obj;
                switch (((z8) this.j).h) {
                    case AIChatConfig.DefaultContextRounds /* 6 */:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                e40Var.h(objWrap);
                return;
            default:
                try {
                    ByteArrayInputStream byteArrayInputStreamI = z8.i((String) obj);
                    this.j = byteArrayInputStreamI;
                    e40Var.h(byteArrayInputStreamI);
                    return;
                } catch (IllegalArgumentException e) {
                    e40Var.d(e);
                    return;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void cancel() {
        int i = this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final int e() {
        switch (this.h) {
        }
        return 1;
    }

    public tf1(z8 z8Var, String str) {
        this.h = 2;
        this.i = str;
    }

    private final void d() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }
}

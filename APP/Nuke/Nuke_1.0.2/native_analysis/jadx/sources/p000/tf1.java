package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tf1 implements f40 {

    /* JADX INFO: renamed from: k */
    public static final String[] f10722k = {"_data"};

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10723h;

    /* JADX INFO: renamed from: i */
    public final Object f10724i;

    /* JADX INFO: renamed from: j */
    public Object f10725j;

    public /* synthetic */ tf1(int i, Object obj, Object obj2) {
        this.f10723h = i;
        this.f10724i = obj;
        this.f10725j = obj2;
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: a */
    public final Class mo1371a() {
        switch (this.f10723h) {
            case 0:
                return File.class;
            case 1:
                return ((C0953z8) this.f10725j).mo1322a();
            default:
                return InputStream.class;
        }
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: b */
    public final void mo1372b() {
        switch (this.f10723h) {
            case 0:
            case 1:
                break;
            default:
                try {
                    ((ByteArrayInputStream) this.f10725j).close();
                } catch (IOException unused) {
                    return;
                }
                break;
        }
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: c */
    public final void mo1373c(i32 i32Var, e40 e40Var) {
        Object objWrap;
        int i = this.f10723h;
        Object obj = this.f10724i;
        switch (i) {
            case 0:
                Cursor cursorQuery = ((Context) obj).getContentResolver().query((Uri) this.f10725j, f10722k, null, null, null);
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
                    e40Var.mo636h(new File(string));
                    return;
                }
                e40Var.mo635d(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f10725j)));
                return;
            case 1:
                byte[] bArr = (byte[]) obj;
                switch (((C0953z8) this.f10725j).f13781h) {
                    case AIChatConfig.DefaultContextRounds /* 6 */:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                e40Var.mo636h(objWrap);
                return;
            default:
                try {
                    ByteArrayInputStream byteArrayInputStreamM6397i = C0953z8.m6397i((String) obj);
                    this.f10725j = byteArrayInputStreamM6397i;
                    e40Var.mo636h(byteArrayInputStreamM6397i);
                    return;
                } catch (IllegalArgumentException e) {
                    e40Var.mo635d(e);
                    return;
                }
        }
    }

    @Override // p000.f40
    public final void cancel() {
        int i = this.f10723h;
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: e */
    public final int mo1374e() {
        switch (this.f10723h) {
        }
        return 1;
    }

    public tf1(C0953z8 c0953z8, String str) {
        this.f10723h = 2;
        this.f10724i = str;
    }

    /* JADX INFO: renamed from: d */
    private final void m5249d() {
    }

    /* JADX INFO: renamed from: f */
    private final void m5250f() {
    }

    /* JADX INFO: renamed from: g */
    private final void m5251g() {
    }

    /* JADX INFO: renamed from: h */
    private final void m5252h() {
    }

    /* JADX INFO: renamed from: i */
    private final void m5253i() {
    }
}

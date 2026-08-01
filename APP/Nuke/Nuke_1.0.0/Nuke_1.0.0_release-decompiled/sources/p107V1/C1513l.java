package p107V1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.EnumC1928j;
import com.bumptech.glide.load.data.InterfaceC1933c;
import com.bumptech.glide.load.data.InterfaceC1934d;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import me.dartcv.nuke.BuildConfig;

/* JADX INFO: renamed from: V1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1513l implements InterfaceC1934d {

    /* JADX INFO: renamed from: g */
    public static final String[] f5261g = {"_data"};

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5262d;

    /* JADX INFO: renamed from: e */
    public final Object f5263e;

    /* JADX INFO: renamed from: f */
    public final Object f5264f;

    public /* synthetic */ C1513l(int i5, Object obj, Object obj2) {
        this.f5262d = i5;
        this.f5263e = obj;
        this.f5264f = obj2;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: a */
    public final Class mo2222a() {
        switch (this.f5262d) {
            case 0:
                return File.class;
            default:
                return ((C1527z) this.f5264f).m2793b();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: b */
    public final void mo2223b() {
        int i5 = this.f5262d;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: c */
    public final int mo2224c() {
        switch (this.f5262d) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    public final void cancel() {
        int i5 = this.f5262d;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: d */
    public final void mo2225d(EnumC1928j enumC1928j, InterfaceC1933c interfaceC1933c) {
        Object objWrap;
        switch (this.f5262d) {
            case 0:
                Cursor cursorQuery = ((Context) this.f5263e).getContentResolver().query((Uri) this.f5264f, f5261g, null, null, null);
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
                    interfaceC1933c.mo43l(new File(string));
                    return;
                }
                interfaceC1933c.mo36e(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f5264f)));
                return;
            default:
                C1527z c1527z = (C1527z) this.f5264f;
                byte[] bArr = (byte[]) this.f5263e;
                switch (c1527z.f5296d) {
                    case BuildConfig.VERSION_CODE /* 1 */:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                interfaceC1933c.mo43l(objWrap);
                return;
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m2783e() {
    }

    /* JADX INFO: renamed from: f */
    private final void m2784f() {
    }

    /* JADX INFO: renamed from: g */
    private final void m2785g() {
    }

    /* JADX INFO: renamed from: h */
    private final void m2786h() {
    }
}

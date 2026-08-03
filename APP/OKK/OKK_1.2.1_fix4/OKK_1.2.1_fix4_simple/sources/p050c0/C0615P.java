package p050c0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.widget.TextView;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.P */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0615P implements InterfaceC0286l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1896a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f1897b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f1898c;

    public /* synthetic */ C0615P(int r1, String r2, String r3) {
        this.f1896a = r1;
        this.f1897b = r2;
        this.f1898c = r3;
    }

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object r9) {
        boolean r02 = true;
        String r1 = this.f1898c;
        String r2 = this.f1897b;
        switch(this.f1896a) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        AbstractC0307g.m703e(r2, "$sender");
        AbstractC0307g.m703e(r1, "$name");
        TextView r92 = (TextView) ((WeakReference) r9).get();
        if (r92 == null) goto L12;
        if (AbstractC0307g.m699a(r92.getTag(2113929217), r2) == false) goto L10;
        C0688q1 r03 = C0688q1.f2163a;
        C0688q1.m1766a(r92, r2, r1);
    L10:
        r02 = false;
    L12:
        return Boolean.valueOf(r02);
    L13:
        AbstractC0307g.m703e(r2, "$apkPath");
        AbstractC0307g.m703e(r1, "$assetName");
        AbstractC0307g.m703e((String) r9, "it");
        ConcurrentHashMap r93 = AbstractC0626U.f1936a;
        Object r94 = null;
        ZipFile r4 = new ZipFile(r2);     // Catch: Throwable -> L19
        ZipEntry r12 = r4.getEntry("assets/abc_bubble/".concat(r1));     // Catch: Throwable -> L27
        if (r12 != null) goto L21;
        AbstractC0040p.m108m(r4, null);     // Catch: Throwable -> L19
        return null;
    L21:
        InputStream r13 = r4.getInputStream(r12);     // Catch: Throwable -> L27
        Bitmap r22 = BitmapFactory.decodeStream(r13);     // Catch: Throwable -> L32
        if (r22 != null) goto L29;
        AbstractC0040p.m108m(r13, null);     // Catch: Throwable -> L27
        AbstractC0040p.m108m(r4, null);     // Catch: Throwable -> L19
        return null;
    L29:
        boolean r3 = NinePatch.isNinePatchChunk(r22.getNinePatchChunk());     // Catch: Throwable -> L32
        if (r3 == false) goto L34;
        byte[] r5 = r22.getNinePatchChunk();     // Catch: Throwable -> L32
    L35:
        if (r5 != null) goto L39;
        AbstractC0040p.m108m(r13, null);     // Catch: Throwable -> L27
        AbstractC0040p.m108m(r4, null);     // Catch: Throwable -> L19
        return null;
    L39:
        if (r3 == false) goto L41;
        Bitmap r04 = r22;
    L42:
        if (r3 == false) goto L44;
        Rect r23 = new Rect();     // Catch: Throwable -> L32
    L45:
        Object r32 = new C0622S(r04, r5, r23);     // Catch: Throwable -> L32
        AbstractC0040p.m108m(r13, null);     // Catch: Throwable -> L27
        AbstractC0040p.m108m(r4, null);     // Catch: Throwable -> L19
    L59:
        if ((r32 instanceof C0140f) == true) goto L63;
        r94 = r32;
    L63:
        return (C0622S) r94;
    L44:
        r23 = AbstractC0626U.m1531d(r22);     // Catch: Throwable -> L32
        goto L45
    L41:
        r04 = Bitmap.createBitmap(r22, 1, 1, r22.getWidth() - 2, r22.getHeight() - 2);     // Catch: Throwable -> L32
        AbstractC0307g.m700b(r04);     // Catch: Throwable -> L32
        goto L42
    L34:
        r5 = AbstractC0626U.m1529b(r22);     // Catch: Throwable -> L32
    L32:
        th = move-exception;
        throw th;     // Catch: Throwable -> L50
    L50:
        th = move-exception;
        AbstractC0040p.m108m(r13, th);     // Catch: Throwable -> L27
        throw th;     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        throw th;     // Catch: Throwable -> L54
    L54:
        th = move-exception;
        AbstractC0040p.m108m(r4, th);     // Catch: Throwable -> L19
        throw th;     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        r32 = AbstractC0040p.m116u(th);
        goto L59
    }
}

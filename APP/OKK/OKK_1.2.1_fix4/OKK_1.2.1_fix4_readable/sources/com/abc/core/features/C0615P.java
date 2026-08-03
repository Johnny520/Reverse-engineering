package com.abc.core.features;

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

    public /* synthetic */ C0615P(int i2, String str, String str2) {
        this.f1896a = i2;
        this.f1897b = str;
        this.f1898c = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
    @Override // p029P0.InterfaceC0286l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object objM116u;
        ZipFile zipFile;
        ZipEntry entry;
        Bitmap bitmapCreateBitmap;
        boolean z2 = true;
        String str = this.f1898c;
        String str2 = this.f1897b;
        switch (this.f1896a) {
            case 0:
                AbstractC0307g.m703e(str2, "$apkPath");
                AbstractC0307g.m703e(str, "$assetName");
                AbstractC0307g.m703e((String) obj, "it");
                ConcurrentHashMap concurrentHashMap = AbstractC0626U.f1936a;
                try {
                    zipFile = new ZipFile(str2);
                    try {
                        entry = zipFile.getEntry("assets/abc_bubble/".concat(str));
                    } finally {
                    }
                } catch (Throwable th) {
                    objM116u = AbstractC0040p.m116u(th);
                }
                if (entry == null) {
                    AbstractC0040p.m108m(zipFile, null);
                    return null;
                }
                InputStream inputStream = zipFile.getInputStream(entry);
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                    if (bitmapDecodeStream == null) {
                        AbstractC0040p.m108m(inputStream, null);
                        AbstractC0040p.m108m(zipFile, null);
                        return null;
                    }
                    boolean zIsNinePatchChunk = NinePatch.isNinePatchChunk(bitmapDecodeStream.getNinePatchChunk());
                    byte[] ninePatchChunk = zIsNinePatchChunk ? bitmapDecodeStream.getNinePatchChunk() : AbstractC0626U.m1529b(bitmapDecodeStream);
                    if (ninePatchChunk == null) {
                        AbstractC0040p.m108m(inputStream, null);
                        AbstractC0040p.m108m(zipFile, null);
                        return null;
                    }
                    if (zIsNinePatchChunk) {
                        bitmapCreateBitmap = bitmapDecodeStream;
                    } else {
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 1, 1, bitmapDecodeStream.getWidth() - 2, bitmapDecodeStream.getHeight() - 2);
                        AbstractC0307g.m700b(bitmapCreateBitmap);
                    }
                    objM116u = new C0622S(bitmapCreateBitmap, ninePatchChunk, zIsNinePatchChunk ? new Rect() : AbstractC0626U.m1531d(bitmapDecodeStream));
                    AbstractC0040p.m108m(inputStream, null);
                    AbstractC0040p.m108m(zipFile, null);
                    return (C0622S) (objM116u instanceof C0140f ? null : objM116u);
                } finally {
                }
                objM116u = AbstractC0040p.m116u(th);
                return (C0622S) (objM116u instanceof C0140f ? null : objM116u);
            default:
                AbstractC0307g.m703e(str2, "$sender");
                AbstractC0307g.m703e(str, "$name");
                TextView textView = (TextView) ((WeakReference) obj).get();
                if (textView != null) {
                    if (AbstractC0307g.m699a(textView.getTag(2113929217), str2)) {
                        RealNameTailHook realNameTailHook = RealNameTailHook.f2163a;
                        RealNameTailHook.m1766a(textView, str2, str);
                    }
                    z2 = false;
                }
                return Boolean.valueOf(z2);
        }
    }
}

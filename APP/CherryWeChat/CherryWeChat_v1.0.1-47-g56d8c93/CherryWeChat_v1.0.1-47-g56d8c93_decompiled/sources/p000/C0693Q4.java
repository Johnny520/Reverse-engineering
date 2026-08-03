package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.text.Editable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import io.github.cherrywechat.lua.api.CherryMessageAPI;
import io.github.cherrywechat.lua.api.CherryThreadAPI;
import io.github.cherrywechat.lua.api.MessageAPI;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/* JADX INFO: renamed from: Q4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0693Q4 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2232a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2233b;

    public /* synthetic */ C0693Q4(int i, Object obj) {
        this.f2232a = i;
        this.f2233b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01eb, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ac  */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.view.TextureView, android.view.TextureView$SurfaceTextureListener, android.view.View, ry] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v27, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6a() {
        ?? r10;
        ?? r2;
        ?? r1;
        Bitmap bitmapDecodeFile;
        BitmapFactory.Options options;
        int i;
        int i2;
        String strM625r;
        Editable text;
        int i3 = this.f2232a;
        boolean z = true;
        C0829TC c0829tc = C0829TC.f2620a;
        Object obj = this.f2233b;
        switch (i3) {
            case 0:
                return new C2694x(1, (Object[]) obj);
            case 1:
                View view = (View) obj;
                C1442g8 c1442g8 = C1442g8.f5046b;
                c1442g8.getClass();
                Context context = view.getContext();
                AbstractC0295Gu.m625r(-259686607616053L);
                int i4 = 0;
                if (C1442g8.m2759m()) {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                    String strM1173b = AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-261121126692917L), AbstractC0295Gu.m625r(-260670155126837L));
                    if (strM1173b.length() > 0) {
                        int i5 = displayMetrics.widthPixels;
                        int i6 = displayMetrics.heightPixels;
                        try {
                            options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(strM1173b, options);
                            i = options.outWidth;
                        } catch (Throwable unused) {
                        }
                        if (i <= 0 || (i2 = options.outHeight) <= 0) {
                            bitmapDecodeFile = null;
                            if (bitmapDecodeFile == null) {
                                ImageView imageView = new ImageView(context);
                                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                imageView.setImageBitmap(bitmapDecodeFile);
                                imageView.setClickable(false);
                                imageView.setTag(AbstractC0295Gu.m625r(-259755327092789L));
                                r2 = imageView;
                            }
                        } else {
                            options.inSampleSize = C1442g8.m2753f(i, i2, i5, i6);
                            options.inJustDecodeBounds = false;
                            bitmapDecodeFile = BitmapFactory.decodeFile(strM1173b, options);
                            if (bitmapDecodeFile != null) {
                                try {
                                    int attributeInt = new ExifInterface(strM1173b).getAttributeInt(AbstractC0295Gu.m625r(-260562780944437L), 1);
                                    float f = attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? 0.0f : 270.0f : 90.0f : 180.0f;
                                    if (f != 0.0f) {
                                        Matrix matrix = new Matrix();
                                        matrix.postRotate(f);
                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
                                        AbstractC0295Gu.m625r(-260064564738101L);
                                        if (!bitmapCreateBitmap.equals(bitmapDecodeFile)) {
                                            bitmapDecodeFile.recycle();
                                        }
                                        bitmapDecodeFile = bitmapCreateBitmap;
                                        break;
                                    }
                                } catch (Throwable unused2) {
                                }
                            }
                            if (bitmapDecodeFile == null) {
                            }
                        }
                    } else {
                        final String strM2756i = C1442g8.m2756i();
                        if (strM2756i.length() != 0) {
                            final ImageView imageView2 = new ImageView(context);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            imageView2.setClickable(false);
                            imageView2.setTag(AbstractC0295Gu.m625r(-260390982252597L));
                            final int i7 = displayMetrics.widthPixels;
                            final int i8 = displayMetrics.heightPixels;
                            new Thread(new Runnable() { // from class: c8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i9;
                                    String str = strM2756i;
                                    int i10 = i7;
                                    int i11 = i8;
                                    Bitmap bitmapDecodeByteArray = null;
                                    try {
                                        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                                        AbstractC0295Gu.m625r(-256229158942773L);
                                        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                                        httpURLConnection.setConnectTimeout(10000);
                                        httpURLConnection.setReadTimeout(15000);
                                        httpURLConnection.setInstanceFollowRedirects(true);
                                        InputStream inputStream = httpURLConnection.getInputStream();
                                        try {
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
                                            AbstractC1293cr.m2555p(inputStream, byteArrayOutputStream);
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            C1442g8.f5046b.getClass();
                                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                                            options2.inJustDecodeBounds = true;
                                            BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options2);
                                            int i12 = options2.outWidth;
                                            if (i12 > 0 && (i9 = options2.outHeight) > 0) {
                                                options2.inSampleSize = C1442g8.m2753f(i12, i9, i10, i11);
                                                options2.inJustDecodeBounds = false;
                                                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options2);
                                            }
                                        } finally {
                                        }
                                    } catch (Throwable unused3) {
                                    }
                                    if (bitmapDecodeByteArray != null) {
                                        ImageView imageView3 = imageView2;
                                        imageView3.post(new RunnableC2260n3(2, imageView3, bitmapDecodeByteArray));
                                    }
                                }
                            }).start();
                            r10 = imageView2;
                            r2 = r10;
                        }
                    }
                    r2 = 0;
                } else {
                    String str = C1442g8.f5047c;
                    if (str.length() != 0) {
                        ?? textureViewSurfaceTextureListenerC2477ry = new TextureViewSurfaceTextureListenerC2477ry(context);
                        textureViewSurfaceTextureListenerC2477ry.f8710c = false;
                        textureViewSurfaceTextureListenerC2477ry.setSurfaceTextureListener(textureViewSurfaceTextureListenerC2477ry);
                        textureViewSurfaceTextureListenerC2477ry.setKeepScreenOn(true);
                        if (!c1442g8.m2024e() || C1442g8.m2759m() || str.length() <= 0) {
                            z = false;
                            textureViewSurfaceTextureListenerC2477ry.setPlayWithSound(z);
                            textureViewSurfaceTextureListenerC2477ry.setVideoPath(str);
                            textureViewSurfaceTextureListenerC2477ry.setTag(AbstractC0295Gu.m625r(-260476881598517L));
                            r10 = textureViewSurfaceTextureListenerC2477ry;
                            r2 = r10;
                        } else {
                            SharedPreferences sharedPreferences2 = AbstractC0599Nx.f1939a;
                            if (!AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-261486198913077L), false)) {
                            }
                            textureViewSurfaceTextureListenerC2477ry.setPlayWithSound(z);
                            textureViewSurfaceTextureListenerC2477ry.setVideoPath(str);
                            textureViewSurfaceTextureListenerC2477ry.setTag(AbstractC0295Gu.m625r(-260476881598517L));
                            r10 = textureViewSurfaceTextureListenerC2477ry;
                            r2 = r10;
                        }
                    }
                    r2 = 0;
                }
                if (r2 != 0) {
                    if (c1442g8.m2762j()) {
                        SharedPreferences sharedPreferences3 = AbstractC0599Nx.f1939a;
                        if (AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-260790414211125L), false)) {
                            View view2 = view;
                            while (true) {
                                Object parent = view2.getParent();
                                view2 = parent instanceof View ? (View) parent : null;
                                if (view2 == null) {
                                    break;
                                } else if (view2.getClass().getName().equals(AbstractC0295Gu.m625r(-260141874149429L))) {
                                    ViewParent parent2 = view2.getParent();
                                    r1 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : 0;
                                }
                            }
                            if (r1 == 0) {
                                View view3 = view;
                                while (true) {
                                    if (view3 == null) {
                                        r1 = 0;
                                    } else if (view3.getId() == 16908290 && (view3 instanceof ViewGroup)) {
                                        r1 = (ViewGroup) view3;
                                    } else {
                                        Object parent3 = view3.getParent();
                                        view3 = parent3 instanceof View ? (View) parent3 : null;
                                    }
                                }
                            }
                            if (r1 != 0) {
                                view.setAlpha(0.0f);
                                C1442g8.m2755h(view, r1);
                                if (!C1442g8.m2757k(r1)) {
                                    r1.addView(r2, 0, new ViewGroup.LayoutParams(-1, -1));
                                }
                                view.post(new RunnableC1311d8(view, i4));
                            } else {
                                ViewParent parent4 = view.getParent();
                                ?? r9 = parent4 instanceof ViewGroup ? (ViewGroup) parent4 : 0;
                                if (r9 != 0) {
                                    view.setAlpha(0.0f);
                                    C1442g8.m2755h(view, r9);
                                    if (!C1442g8.m2757k(r9)) {
                                        r9.addView(r2, -1, -1);
                                    }
                                    view.post(new RunnableC1311d8(view, i4));
                                }
                            }
                        } else {
                            ViewParent parent5 = view.getParent();
                            ?? r92 = parent5 instanceof ViewGroup ? (ViewGroup) parent5 : 0;
                            if (r92 != 0 && !C1442g8.m2757k(r92)) {
                                r92.addView(r2, -1, -1);
                            }
                        }
                    }
                }
                return c0829tc;
            case 2:
                return CherryMessageAPI.cleanup$lambda$33$lambda$32((CherryMessageAPI.MessageCallback) obj);
            case 3:
                return CherryThreadAPI.cleanupFor$lambda$43((ArrayList) obj);
            case 4:
                C1495ha c1495ha = (C1495ha) obj;
                C0183EA.f539a.getClass();
                c1495ha.f5272i = C0183EA.m381i();
                EditText editText = c1495ha.f5267d;
                if (editText == null || (text = editText.getText()) == null || (strM625r = text.toString()) == null) {
                    strM625r = AbstractC0295Gu.m625r(-83288005802037L);
                }
                c1495ha.m2859e(strM625r);
                return c0829tc;
            case 5:
                return MessageAPI.cleanup$lambda$38$lambda$37((MessageAPI.MessageCallback) obj);
            default:
                C0212Ex c0212Ex = (C0212Ex) obj;
                return Integer.valueOf(AbstractC0585Nj.m1126E(c0212Ex, c0212Ex.f627j));
        }
    }
}

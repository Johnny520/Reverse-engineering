package Yue;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Yue.ۥۡۥ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6795 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f17637 = "PrintHelper";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f17638 = 3500;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean f17639 = true;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean f17640 = true;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f17641 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f17642 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @SuppressLint({"InlinedApi"})
    public static final int f17643 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    @SuppressLint({"InlinedApi"})
    public static final int f17644 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f17645 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f17646 = 2;

    /* JADX INFO: renamed from: ۥ */
    public final Context f2321;

    /* JADX INFO: renamed from: ۥ۟ */
    public BitmapFactory.Options f2322 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Object f17647 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f17648 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f17649 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f17650 = 1;

    /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۥ$ۥ */
    public class AsyncTaskC1082 extends AsyncTask<Void, Void, Throwable> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ CancellationSignal f2323;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ PrintAttributes f2324;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ Bitmap f17651;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ PrintAttributes f17652;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ int f17653;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ParcelFileDescriptor f17654;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f17655;

        public AsyncTaskC1082(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f2323 = cancellationSignal;
            this.f2324 = printAttributes;
            this.f17651 = bitmap;
            this.f17652 = printAttributes2;
            this.f17653 = i;
            this.f17654 = parcelFileDescriptor;
            this.f17655 = writeResultCallback;
        }

        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        /* JADX DEBUG: Method merged with bridge method: doInBackground([Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public Throwable doInBackground(Void... voidArr) {
            RectF rectF;
            try {
                if (this.f2323.isCanceled()) {
                    return null;
                }
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(C6795.this.f2321, this.f2324);
                Bitmap bitmapM3256 = C6795.m3256(this.f17651, this.f2324.getColorMode());
                if (this.f2323.isCanceled()) {
                    return null;
                }
                try {
                    PdfDocument.Page pageStartPage = printedPdfDocument.startPage(1);
                    boolean z = C6795.f17640;
                    if (z) {
                        rectF = new RectF(pageStartPage.getInfo().getContentRect());
                    } else {
                        PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(C6795.this.f2321, this.f17652);
                        PdfDocument.Page pageStartPage2 = printedPdfDocument2.startPage(1);
                        RectF rectF2 = new RectF(pageStartPage2.getInfo().getContentRect());
                        printedPdfDocument2.finishPage(pageStartPage2);
                        printedPdfDocument2.close();
                        rectF = rectF2;
                    }
                    Matrix matrixM21494 = C6795.m21494(bitmapM3256.getWidth(), bitmapM3256.getHeight(), rectF, this.f17653);
                    if (!z) {
                        matrixM21494.postTranslate(rectF.left, rectF.top);
                        pageStartPage.getCanvas().clipRect(rectF);
                    }
                    pageStartPage.getCanvas().drawBitmap(bitmapM3256, matrixM21494, null);
                    printedPdfDocument.finishPage(pageStartPage);
                    if (this.f2323.isCanceled()) {
                        printedPdfDocument.close();
                        ParcelFileDescriptor parcelFileDescriptor = this.f17654;
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (bitmapM3256 != this.f17651) {
                            bitmapM3256.recycle();
                        }
                        return null;
                    }
                    printedPdfDocument.writeTo(new FileOutputStream(this.f17654.getFileDescriptor()));
                    printedPdfDocument.close();
                    ParcelFileDescriptor parcelFileDescriptor2 = this.f17654;
                    if (parcelFileDescriptor2 != null) {
                        try {
                            parcelFileDescriptor2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (bitmapM3256 != this.f17651) {
                        bitmapM3256.recycle();
                    }
                    return null;
                } finally {
                }
            } catch (Throwable th) {
                return th;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onPostExecute(Ljava/lang/Object;)V */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Throwable th) {
            if (this.f2323.isCanceled()) {
                this.f17655.onWriteCancelled();
            } else if (th == null) {
                this.f17655.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                Log.e(C6795.f17637, "Error writing printed content", th);
                this.f17655.onWriteFailed(null);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۥ$ۥ۟ */
    public interface InterfaceC1083 {
        /* JADX INFO: renamed from: ۥ */
        void m3260();
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۥ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(19)
    public class C6796 extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: ۥ */
        public final String f2325;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f2326;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Bitmap f17657;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final InterfaceC1083 f17658;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public PrintAttributes f17659;

        public C6796(String str, int i, Bitmap bitmap, InterfaceC1083 interfaceC1083) {
            this.f2325 = str;
            this.f2326 = i;
            this.f17657 = bitmap;
            this.f17658 = interfaceC1083;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            InterfaceC1083 interfaceC1083 = this.f17658;
            if (interfaceC1083 != null) {
                interfaceC1083.m3260();
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f17659 = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f2325).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            C6795.this.m21509(this.f17659, this.f2326, this.f17657, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۥ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(19)
    public class C6797 extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: ۥ */
        public final String f2327;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Uri f2328;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final InterfaceC1083 f17661;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int f17662;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public PrintAttributes f17663;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public AsyncTask<Uri, Boolean, Bitmap> f17664;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Bitmap f17665 = null;

        /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ */
        public class AsyncTaskC1084 extends AsyncTask<Uri, Boolean, Bitmap> {

            /* JADX INFO: renamed from: ۥ */
            public final /* synthetic */ CancellationSignal f2329;

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ PrintAttributes f2330;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final /* synthetic */ PrintAttributes f17667;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f17668;

            /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ$ۥ, reason: contains not printable characters */
            public class C6798 implements CancellationSignal.OnCancelListener {
                public C6798() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    C6797.this.m3261();
                    AsyncTaskC1084.this.cancel(false);
                }
            }

            public AsyncTaskC1084(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f2329 = cancellationSignal;
                this.f2330 = printAttributes;
                this.f17667 = printAttributes2;
                this.f17668 = layoutResultCallback;
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
                this.f2329.setOnCancelListener(new C6798());
            }

            /* JADX DEBUG: Method merged with bridge method: doInBackground([Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    C6797 c6797 = C6797.this;
                    return C6795.this.m21501(c6797.f2328);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            /* JADX DEBUG: Method merged with bridge method: onCancelled(Ljava/lang/Object;)V */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public void onCancelled(Bitmap bitmap) {
                this.f17668.onLayoutCancelled();
                C6797.this.f17664 = null;
            }

            /* JADX DEBUG: Method merged with bridge method: onPostExecute(Ljava/lang/Object;)V */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public void onPostExecute(Bitmap bitmap) {
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap != null && (!C6795.f17639 || C6795.this.f17650 == 0)) {
                    synchronized (this) {
                        mediaSize = C6797.this.f17663.getMediaSize();
                    }
                    if (mediaSize != null && mediaSize.isPortrait() != C6795.m21495(bitmap)) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                C6797.this.f17665 = bitmap;
                if (bitmap != null) {
                    this.f17668.onLayoutFinished(new PrintDocumentInfo.Builder(C6797.this.f2327).setContentType(1).setPageCount(1).build(), true ^ this.f2330.equals(this.f17667));
                } else {
                    this.f17668.onLayoutFailed(null);
                }
                C6797.this.f17664 = null;
            }
        }

        public C6797(String str, Uri uri, InterfaceC1083 interfaceC1083, int i) {
            this.f2327 = str;
            this.f2328 = uri;
            this.f17661 = interfaceC1083;
            this.f17662 = i;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            m3261();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f17664;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            InterfaceC1083 interfaceC1083 = this.f17661;
            if (interfaceC1083 != null) {
                interfaceC1083.m3260();
            }
            Bitmap bitmap = this.f17665;
            if (bitmap != null) {
                bitmap.recycle();
                this.f17665 = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.f17663 = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f17665 != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f2327).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f17664 = new AsyncTaskC1084(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            C6795.this.m21509(this.f17663, this.f17662, this.f17665, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }

        /* JADX INFO: renamed from: ۥ */
        public void m3261() {
            synchronized (C6795.this.f17647) {
                try {
                    C6795 c6795 = C6795.this;
                    if (c6795.f2322 != null) {
                        c6795.f2322 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C6795(@InterfaceC6391 Context context) {
        this.f2321 = context;
    }

    /* JADX INFO: renamed from: ۥ */
    public static Bitmap m3256(Bitmap bitmap, int i) {
        if (i != 1) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    @InterfaceC7113(19)
    /* JADX INFO: renamed from: ۥ۟ */
    public static PrintAttributes.Builder m3257(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Matrix m21494(int i, int i2, RectF rectF, int i3) {
        Matrix matrix = new Matrix();
        float f = i;
        float fWidth = rectF.width() / f;
        float fMax = i3 == 2 ? Math.max(fWidth, rectF.height() / i2) : Math.min(fWidth, rectF.height() / i2);
        matrix.postScale(fMax, fMax);
        matrix.postTranslate((rectF.width() - (f * fMax)) / 2.0f, (rectF.height() - (i2 * fMax)) / 2.0f);
        return matrix;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m21495(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static boolean m21496() {
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m21497() {
        return this.f17649;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m21498() {
        int i = this.f17650;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m21499() {
        return this.f17648;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Bitmap m21500(Uri uri, BitmapFactory.Options options) throws Throwable {
        Context context;
        if (uri == null || (context = this.f2321) == null) {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException e) {
                        Log.w(f17637, "close fail ", e);
                    }
                }
                return bitmapDecodeStream;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        Log.w(f17637, "close fail ", e2);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Bitmap m21501(Uri uri) throws Throwable {
        BitmapFactory.Options options;
        if (uri == null || this.f2321 == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        m21500(uri, options2);
        int i = options2.outWidth;
        int i2 = options2.outHeight;
        if (i > 0 && i2 > 0) {
            int iMax = Math.max(i, i2);
            int i3 = 1;
            while (iMax > 3500) {
                iMax >>>= 1;
                i3 <<= 1;
            }
            if (i3 > 0 && Math.min(i, i2) / i3 > 0) {
                synchronized (this.f17647) {
                    options = new BitmapFactory.Options();
                    this.f2322 = options;
                    options.inMutable = true;
                    options.inSampleSize = i3;
                }
                try {
                    Bitmap bitmapM21500 = m21500(uri, options);
                    synchronized (this.f17647) {
                        this.f2322 = null;
                    }
                    return bitmapM21500;
                } catch (Throwable th) {
                    synchronized (this.f17647) {
                        this.f2322 = null;
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m21502(@InterfaceC6391 String str, @InterfaceC6391 Bitmap bitmap) {
        m21503(str, bitmap, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m21503(@InterfaceC6391 String str, @InterfaceC6391 Bitmap bitmap, @InterfaceC6490 InterfaceC1083 interfaceC1083) {
        if (bitmap == null) {
            return;
        }
        ((PrintManager) this.f2321.getSystemService("print")).print(str, new C6796(str, this.f17648, bitmap, interfaceC1083), new PrintAttributes.Builder().setMediaSize(m21495(bitmap) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.f17649).build());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m21504(@InterfaceC6391 String str, @InterfaceC6391 Uri uri) throws FileNotFoundException {
        m21505(str, uri, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m21505(@InterfaceC6391 String str, @InterfaceC6391 Uri uri, @InterfaceC6490 InterfaceC1083 interfaceC1083) throws FileNotFoundException {
        C6797 c6797 = new C6797(str, uri, interfaceC1083, this.f17648);
        PrintManager printManager = (PrintManager) this.f2321.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f17649);
        int i = this.f17650;
        if (i == 1 || i == 0) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (i == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, c6797, builder.build());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m21506(int i) {
        this.f17649 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m21507(int i) {
        this.f17650 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m21508(int i) {
        this.f17648 = i;
    }

    @InterfaceC7113(19)
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m21509(PrintAttributes printAttributes, int i, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        new AsyncTaskC1082(cancellationSignal, f17640 ? printAttributes : m3257(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build(), bitmap, printAttributes, i, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }
}

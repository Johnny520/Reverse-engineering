package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4928 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f15720 = "PrintHelper";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f15721 = 3500;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean f15722 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean f15723 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f15724 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f15725 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @android.annotation.SuppressLint({"InlinedApi"})
    public static final int f15726 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    @android.annotation.SuppressLint({"InlinedApi"})
    public static final int f15727 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f15728 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f15729 = 2;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f15730;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.graphics.BitmapFactory.Options f15731;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.lang.Object f15732;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f15733;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f15734;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f15735;

    /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۥ$ۥ, reason: contains not printable characters */
    public class AsyncTaskC4929 extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Throwable> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ android.os.CancellationSignal f15736;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ android.print.PrintAttributes f15737;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ android.graphics.Bitmap f15738;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ android.print.PrintAttributes f15739;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ int f15740;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ android.os.ParcelFileDescriptor f15741;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ android.print.PrintDocumentAdapter.WriteResultCallback f15742;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4928 f15743;

        public AsyncTaskC4929(Yue.C4928 r1, android.os.CancellationSignal r2, android.print.PrintAttributes r3, android.graphics.Bitmap r4, android.print.PrintAttributes r5, int r6, android.os.ParcelFileDescriptor r7, android.print.PrintDocumentAdapter.WriteResultCallback r8) {
                r0 = this;
                r0.f15743 = r1
                r0.f15736 = r2
                r0.f15737 = r3
                r0.f15738 = r4
                r0.f15739 = r5
                r0.f15740 = r6
                r0.f15741 = r7
                r0.f15742 = r8
                r0.<init>()
                return
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ java.lang.Throwable doInBackground(java.lang.Void[] r1) {
                r0 = this;
                java.lang.Void[] r1 = (java.lang.Void[]) r1
                java.lang.Throwable r1 = r0.m19306(r1)
                return r1
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.m19307(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.Throwable m19306(java.lang.Void... r9) {
                r8 = this;
                android.os.CancellationSignal r9 = r8.f15736     // Catch: java.lang.Throwable -> La3
                boolean r9 = r9.isCanceled()     // Catch: java.lang.Throwable -> La3
                r0 = 0
                if (r9 == 0) goto La
                return r0
            La:
                android.print.pdf.PrintedPdfDocument r9 = new android.print.pdf.PrintedPdfDocument     // Catch: java.lang.Throwable -> La3
                Yue.ۥۡۥ۠ۥ r1 = r8.f15743     // Catch: java.lang.Throwable -> La3
                android.content.Context r1 = r1.f15730     // Catch: java.lang.Throwable -> La3
                android.print.PrintAttributes r2 = r8.f15737     // Catch: java.lang.Throwable -> La3
                r9.<init>(r1, r2)     // Catch: java.lang.Throwable -> La3
                android.graphics.Bitmap r1 = r8.f15738     // Catch: java.lang.Throwable -> La3
                android.print.PrintAttributes r2 = r8.f15737     // Catch: java.lang.Throwable -> La3
                int r2 = r2.getColorMode()     // Catch: java.lang.Throwable -> La3
                android.graphics.Bitmap r1 = Yue.C4928.m19288(r1, r2)     // Catch: java.lang.Throwable -> La3
                android.os.CancellationSignal r2 = r8.f15736     // Catch: java.lang.Throwable -> La3
                boolean r2 = r2.isCanceled()     // Catch: java.lang.Throwable -> La3
                if (r2 == 0) goto L2a
                return r0
            L2a:
                r2 = 1
                android.graphics.pdf.PdfDocument$Page r3 = r9.startPage(r2)     // Catch: java.lang.Throwable -> L41
                boolean r4 = Yue.C4928.f15723     // Catch: java.lang.Throwable -> L41
                if (r4 == 0) goto L44
                android.graphics.RectF r2 = new android.graphics.RectF     // Catch: java.lang.Throwable -> L41
                android.graphics.pdf.PdfDocument$PageInfo r5 = r3.getInfo()     // Catch: java.lang.Throwable -> L41
                android.graphics.Rect r5 = r5.getContentRect()     // Catch: java.lang.Throwable -> L41
                r2.<init>(r5)     // Catch: java.lang.Throwable -> L41
                goto L67
            L41:
                r0 = move-exception
                goto Lcd
            L44:
                android.print.pdf.PrintedPdfDocument r5 = new android.print.pdf.PrintedPdfDocument     // Catch: java.lang.Throwable -> L41
                Yue.ۥۡۥ۠ۥ r6 = r8.f15743     // Catch: java.lang.Throwable -> L41
                android.content.Context r6 = r6.f15730     // Catch: java.lang.Throwable -> L41
                android.print.PrintAttributes r7 = r8.f15739     // Catch: java.lang.Throwable -> L41
                r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L41
                android.graphics.pdf.PdfDocument$Page r2 = r5.startPage(r2)     // Catch: java.lang.Throwable -> L41
                android.graphics.RectF r6 = new android.graphics.RectF     // Catch: java.lang.Throwable -> L41
                android.graphics.pdf.PdfDocument$PageInfo r7 = r2.getInfo()     // Catch: java.lang.Throwable -> L41
                android.graphics.Rect r7 = r7.getContentRect()     // Catch: java.lang.Throwable -> L41
                r6.<init>(r7)     // Catch: java.lang.Throwable -> L41
                r5.finishPage(r2)     // Catch: java.lang.Throwable -> L41
                r5.close()     // Catch: java.lang.Throwable -> L41
                r2 = r6
            L67:
                int r5 = r1.getWidth()     // Catch: java.lang.Throwable -> L41
                int r6 = r1.getHeight()     // Catch: java.lang.Throwable -> L41
                int r7 = r8.f15740     // Catch: java.lang.Throwable -> L41
                android.graphics.Matrix r5 = Yue.C4928.m19290(r5, r6, r2, r7)     // Catch: java.lang.Throwable -> L41
                if (r4 == 0) goto L78
                goto L86
            L78:
                float r4 = r2.left     // Catch: java.lang.Throwable -> L41
                float r6 = r2.top     // Catch: java.lang.Throwable -> L41
                r5.postTranslate(r4, r6)     // Catch: java.lang.Throwable -> L41
                android.graphics.Canvas r4 = r3.getCanvas()     // Catch: java.lang.Throwable -> L41
                r4.clipRect(r2)     // Catch: java.lang.Throwable -> L41
            L86:
                android.graphics.Canvas r2 = r3.getCanvas()     // Catch: java.lang.Throwable -> L41
                r2.drawBitmap(r1, r5, r0)     // Catch: java.lang.Throwable -> L41
                r9.finishPage(r3)     // Catch: java.lang.Throwable -> L41
                android.os.CancellationSignal r2 = r8.f15736     // Catch: java.lang.Throwable -> L41
                boolean r2 = r2.isCanceled()     // Catch: java.lang.Throwable -> L41
                if (r2 == 0) goto Lad
                r9.close()     // Catch: java.lang.Throwable -> La3
                android.os.ParcelFileDescriptor r9 = r8.f15741     // Catch: java.lang.Throwable -> La3
                if (r9 == 0) goto La5
                r9.close()     // Catch: java.lang.Throwable -> La3 java.io.IOException -> La5
                goto La5
            La3:
                r9 = move-exception
                goto Ldf
            La5:
                android.graphics.Bitmap r9 = r8.f15738     // Catch: java.lang.Throwable -> La3
                if (r1 == r9) goto Lac
                r1.recycle()     // Catch: java.lang.Throwable -> La3
            Lac:
                return r0
            Lad:
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L41
                android.os.ParcelFileDescriptor r3 = r8.f15741     // Catch: java.lang.Throwable -> L41
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch: java.lang.Throwable -> L41
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L41
                r9.writeTo(r2)     // Catch: java.lang.Throwable -> L41
                r9.close()     // Catch: java.lang.Throwable -> La3
                android.os.ParcelFileDescriptor r9 = r8.f15741     // Catch: java.lang.Throwable -> La3
                if (r9 == 0) goto Lc5
                r9.close()     // Catch: java.lang.Throwable -> La3 java.io.IOException -> Lc5
            Lc5:
                android.graphics.Bitmap r9 = r8.f15738     // Catch: java.lang.Throwable -> La3
                if (r1 == r9) goto Lcc
                r1.recycle()     // Catch: java.lang.Throwable -> La3
            Lcc:
                return r0
            Lcd:
                r9.close()     // Catch: java.lang.Throwable -> La3
                android.os.ParcelFileDescriptor r9 = r8.f15741     // Catch: java.lang.Throwable -> La3
                if (r9 == 0) goto Ld7
                r9.close()     // Catch: java.lang.Throwable -> La3 java.io.IOException -> Ld7
            Ld7:
                android.graphics.Bitmap r9 = r8.f15738     // Catch: java.lang.Throwable -> La3
                if (r1 == r9) goto Lde
                r1.recycle()     // Catch: java.lang.Throwable -> La3
            Lde:
                throw r0     // Catch: java.lang.Throwable -> La3
            Ldf:
                return r9
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m19307(java.lang.Throwable r3) {
                r2 = this;
                android.os.CancellationSignal r0 = r2.f15736
                boolean r0 = r0.isCanceled()
                if (r0 == 0) goto Le
                android.print.PrintDocumentAdapter$WriteResultCallback r3 = r2.f15742
                r3.onWriteCancelled()
                goto L29
            Le:
                if (r3 != 0) goto L1c
                android.print.PrintDocumentAdapter$WriteResultCallback r3 = r2.f15742
                android.print.PageRange r0 = android.print.PageRange.ALL_PAGES
                android.print.PageRange[] r0 = new android.print.PageRange[]{r0}
                r3.onWriteFinished(r0)
                goto L29
            L1c:
                java.lang.String r0 = "PrintHelper"
                java.lang.String r1 = "Error writing printed content"
                android.util.Log.e(r0, r1, r3)
                android.print.PrintDocumentAdapter$WriteResultCallback r3 = r2.f15742
                r0 = 0
                r3.onWriteFailed(r0)
            L29:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۥ$ۥ۟, reason: contains not printable characters */
    public interface InterfaceC4930 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void m19308();
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۥ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(19)
    public class C4931 extends android.print.PrintDocumentAdapter {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f15744;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int f15745;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final android.graphics.Bitmap f15746;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Yue.C4928.InterfaceC4930 f15747;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public android.print.PrintAttributes f15748;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4928 f15749;

        public C4931(Yue.C4928 r1, java.lang.String r2, int r3, android.graphics.Bitmap r4, Yue.C4928.InterfaceC4930 r5) {
                r0 = this;
                r0.f15749 = r1
                r0.<init>()
                r0.f15744 = r2
                r0.f15745 = r3
                r0.f15746 = r4
                r0.f15747 = r5
                return
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
                r1 = this;
                Yue.ۥۡۥ۠ۥ$ۥ۟ r0 = r1.f15747
                if (r0 == 0) goto L7
                r0.m19308()
            L7:
                return
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(android.print.PrintAttributes r1, android.print.PrintAttributes r2, android.os.CancellationSignal r3, android.print.PrintDocumentAdapter.LayoutResultCallback r4, android.os.Bundle r5) {
                r0 = this;
                r0.f15748 = r2
                android.print.PrintDocumentInfo$Builder r3 = new android.print.PrintDocumentInfo$Builder
                java.lang.String r5 = r0.f15744
                r3.<init>(r5)
                r5 = 1
                android.print.PrintDocumentInfo$Builder r3 = r3.setContentType(r5)
                android.print.PrintDocumentInfo$Builder r3 = r3.setPageCount(r5)
                android.print.PrintDocumentInfo r3 = r3.build()
                boolean r1 = r2.equals(r1)
                r1 = r1 ^ r5
                r4.onLayoutFinished(r3, r1)
                return
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(android.print.PageRange[] r8, android.os.ParcelFileDescriptor r9, android.os.CancellationSignal r10, android.print.PrintDocumentAdapter.WriteResultCallback r11) {
                r7 = this;
                Yue.ۥۡۥ۠ۥ r0 = r7.f15749
                android.print.PrintAttributes r1 = r7.f15748
                int r2 = r7.f15745
                android.graphics.Bitmap r3 = r7.f15746
                r4 = r9
                r5 = r10
                r6 = r11
                r0.m19305(r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۥ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(19)
    public class C4932 extends android.print.PrintDocumentAdapter {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f15750;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.net.Uri f15751;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C4928.InterfaceC4930 f15752;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int f15753;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public android.print.PrintAttributes f15754;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public android.os.AsyncTask<android.net.Uri, java.lang.Boolean, android.graphics.Bitmap> f15755;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public android.graphics.Bitmap f15756;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4928 f15757;

        /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ, reason: contains not printable characters */
        public class AsyncTaskC4933 extends android.os.AsyncTask<android.net.Uri, java.lang.Boolean, android.graphics.Bitmap> {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ android.os.CancellationSignal f15758;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public final /* synthetic */ android.print.PrintAttributes f15759;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final /* synthetic */ android.print.PrintAttributes f15760;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public final /* synthetic */ android.print.PrintDocumentAdapter.LayoutResultCallback f15761;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public final /* synthetic */ Yue.C4928.C4932 f15762;

            /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ$ۥ, reason: contains not printable characters */
            public class C4934 implements android.os.CancellationSignal.OnCancelListener {

                /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
                public final /* synthetic */ Yue.C4928.C4932.AsyncTaskC4933 f15763;

                public C4934(Yue.C4928.C4932.AsyncTaskC4933 r1) {
                        r0 = this;
                        r0.f15763 = r1
                        r0.<init>()
                        return
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                        r2 = this;
                        Yue.ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ r0 = r2.f15763
                        Yue.ۥۡۥ۠ۥ$ۥ۟۟۟ r0 = r0.f15762
                        r0.m19309()
                        Yue.ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ r0 = r2.f15763
                        r1 = 0
                        r0.cancel(r1)
                        return
                }
            }

            public AsyncTaskC4933(Yue.C4928.C4932 r1, android.os.CancellationSignal r2, android.print.PrintAttributes r3, android.print.PrintAttributes r4, android.print.PrintDocumentAdapter.LayoutResultCallback r5) {
                    r0 = this;
                    r0.f15762 = r1
                    r0.f15758 = r2
                    r0.f15759 = r3
                    r0.f15760 = r4
                    r0.f15761 = r5
                    r0.<init>()
                    return
            }

            @Override // android.os.AsyncTask
            public /* bridge */ /* synthetic */ android.graphics.Bitmap doInBackground(android.net.Uri[] r1) {
                    r0 = this;
                    android.net.Uri[] r1 = (android.net.Uri[]) r1
                    android.graphics.Bitmap r1 = r0.m19310(r1)
                    return r1
            }

            @Override // android.os.AsyncTask
            public /* bridge */ /* synthetic */ void onCancelled(android.graphics.Bitmap r1) {
                    r0 = this;
                    android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                    r0.m19311(r1)
                    return
            }

            @Override // android.os.AsyncTask
            public /* bridge */ /* synthetic */ void onPostExecute(android.graphics.Bitmap r1) {
                    r0 = this;
                    android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                    r0.m19312(r1)
                    return
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
                    r2 = this;
                    android.os.CancellationSignal r0 = r2.f15758
                    Yue.ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ$ۥ r1 = new Yue.ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ$ۥ
                    r1.<init>(r2)
                    r0.setOnCancelListener(r1)
                    return
            }

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public android.graphics.Bitmap m19310(android.net.Uri... r2) {
                    r1 = this;
                    Yue.ۥۡۥ۠ۥ$ۥ۟۟۟ r2 = r1.f15762     // Catch: java.io.FileNotFoundException -> Lb
                    Yue.ۥۡۥ۠ۥ r0 = r2.f15757     // Catch: java.io.FileNotFoundException -> Lb
                    android.net.Uri r2 = r2.f15751     // Catch: java.io.FileNotFoundException -> Lb
                    android.graphics.Bitmap r2 = r0.m19297(r2)     // Catch: java.io.FileNotFoundException -> Lb
                    return r2
                Lb:
                    r2 = 0
                    return r2
            }

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public void m19311(android.graphics.Bitmap r2) {
                    r1 = this;
                    android.print.PrintDocumentAdapter$LayoutResultCallback r2 = r1.f15761
                    r2.onLayoutCancelled()
                    Yue.ۥۡۥ۠ۥ$ۥ۟۟۟ r2 = r1.f15762
                    r0 = 0
                    r2.f15755 = r0
                    return
            }

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public void m19312(android.graphics.Bitmap r10) {
                    r9 = this;
                    super.onPostExecute(r10)
                    if (r10 == 0) goto L45
                    boolean r0 = Yue.C4928.f15722
                    if (r0 == 0) goto L11
                    Yue.ۥۡۥ۠ۥ$ۥ۟۟۟ r0 = r9.f15762
                    Yue.ۥۡۥ۠ۥ r0 = r0.f15757
                    int r0 = r0.f15735
                    if (r0 != 0) goto L45
                L11:
                    monitor-enter(r9)
                    Yue.ۥۡۥ۠ۥ$ۥ۟۟۟ r0 = r9.f15762     // Catch: java.lang.Throwable -> L42
                    android.print.PrintAttributes r0 = r0.f15754     // Catch: java.lang.Throwable -> L42
                    android.print.PrintAttributes$MediaSize r0 = r0.getMediaSize()     // Catch: java.lang.Throwable -> L42
                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L42
                    if (r0 == 0) goto L45
                    boolean r0 = r0.isPortrait()
                    boolean r1 = Yue.C4928.m19291(r10)
                    if (r0 == r1) goto L45
                    android.graphics.Matrix r7 = new android.graphics.Matrix
                    r7.<init>()
                    r0 = 1119092736(0x42b40000, float:90.0)
                    r7.postRotate(r0)
                    int r5 = r10.getWidth()
                    int r6 = r10.getHeight()
                    r8 = 1
                    r3 = 0
                    r4 = 0
                    r2 = r10
                    android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)
                    goto L45
                L42:
                    r10 = move-exception
                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L42
                    throw r10
                L45:
                    Yue.ۥۡۥ۠ۥ$ۥ۟۟۟ r0 = r9.f15762
                    r0.f15756 = r10
                    r0 = 0
                    if (r10 == 0) goto L71
                    android.print.PrintDocumentInfo$Builder r10 = new android.print.PrintDocumentInfo$Builder
                    Yue.ۥۡۥ۠ۥ$ۥ۟۟۟ r1 = r9.f15762
                    java.lang.String r1 = r1.f15750
                    r10.<init>(r1)
                    r1 = 1
                    android.print.PrintDocumentInfo$Builder r10 = r10.setContentType(r1)
                    android.print.PrintDocumentInfo$Builder r10 = r10.setPageCount(r1)
                    android.print.PrintDocumentInfo r10 = r10.build()
                    android.print.PrintAttributes r2 = r9.f15759
                    android.print.PrintAttributes r3 = r9.f15760
                    boolean r2 = r2.equals(r3)
                    r1 = r1 ^ r2
                    android.print.PrintDocumentAdapter$LayoutResultCallback r2 = r9.f15761
                    r2.onLayoutFinished(r10, r1)
                    goto L76
                L71:
                    android.print.PrintDocumentAdapter$LayoutResultCallback r10 = r9.f15761
                    r10.onLayoutFailed(r0)
                L76:
                    Yue.ۥۡۥ۠ۥ$ۥ۟۟۟ r10 = r9.f15762
                    r10.f15755 = r0
                    return
            }
        }

        public C4932(Yue.C4928 r1, java.lang.String r2, android.net.Uri r3, Yue.C4928.InterfaceC4930 r4, int r5) {
                r0 = this;
                r0.f15757 = r1
                r0.<init>()
                r0.f15750 = r2
                r0.f15751 = r3
                r0.f15752 = r4
                r0.f15753 = r5
                r1 = 0
                r0.f15756 = r1
                return
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
                r2 = this;
                super.onFinish()
                r2.m19309()
                android.os.AsyncTask<android.net.Uri, java.lang.Boolean, android.graphics.Bitmap> r0 = r2.f15755
                if (r0 == 0) goto Le
                r1 = 1
                r0.cancel(r1)
            Le:
                Yue.ۥۡۥ۠ۥ$ۥ۟ r0 = r2.f15752
                if (r0 == 0) goto L15
                r0.m19308()
            L15:
                android.graphics.Bitmap r0 = r2.f15756
                if (r0 == 0) goto L1f
                r0.recycle()
                r0 = 0
                r2.f15756 = r0
            L1f:
                return
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(android.print.PrintAttributes r7, android.print.PrintAttributes r8, android.os.CancellationSignal r9, android.print.PrintDocumentAdapter.LayoutResultCallback r10, android.os.Bundle r11) {
                r6 = this;
                monitor-enter(r6)
                r6.f15754 = r8     // Catch: java.lang.Throwable -> L44
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L44
                boolean r11 = r9.isCanceled()
                if (r11 == 0) goto Le
                r10.onLayoutCancelled()
                return
            Le:
                android.graphics.Bitmap r11 = r6.f15756
                if (r11 == 0) goto L2f
                android.print.PrintDocumentInfo$Builder r9 = new android.print.PrintDocumentInfo$Builder
                java.lang.String r11 = r6.f15750
                r9.<init>(r11)
                r11 = 1
                android.print.PrintDocumentInfo$Builder r9 = r9.setContentType(r11)
                android.print.PrintDocumentInfo$Builder r9 = r9.setPageCount(r11)
                android.print.PrintDocumentInfo r9 = r9.build()
                boolean r7 = r8.equals(r7)
                r7 = r7 ^ r11
                r10.onLayoutFinished(r9, r7)
                return
            L2f:
                Yue.ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ r11 = new Yue.ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ
                r0 = r11
                r1 = r6
                r2 = r9
                r3 = r8
                r4 = r7
                r5 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                r7 = 0
                android.net.Uri[] r7 = new android.net.Uri[r7]
                android.os.AsyncTask r7 = r11.execute(r7)
                r6.f15755 = r7
                return
            L44:
                r7 = move-exception
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L44
                throw r7
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(android.print.PageRange[] r8, android.os.ParcelFileDescriptor r9, android.os.CancellationSignal r10, android.print.PrintDocumentAdapter.WriteResultCallback r11) {
                r7 = this;
                Yue.ۥۡۥ۠ۥ r0 = r7.f15757
                android.print.PrintAttributes r1 = r7.f15754
                int r2 = r7.f15753
                android.graphics.Bitmap r3 = r7.f15756
                r4 = r9
                r5 = r10
                r6 = r11
                r0.m19305(r1, r2, r3, r4, r5, r6)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m19309() {
                r3 = this;
                Yue.ۥۡۥ۠ۥ r0 = r3.f15757
                java.lang.Object r0 = r0.f15732
                monitor-enter(r0)
                Yue.ۥۡۥ۠ۥ r1 = r3.f15757     // Catch: java.lang.Throwable -> Lf
                android.graphics.BitmapFactory$Options r2 = r1.f15731     // Catch: java.lang.Throwable -> Lf
                if (r2 == 0) goto L11
                r2 = 0
                r1.f15731 = r2     // Catch: java.lang.Throwable -> Lf
                goto L11
            Lf:
                r1 = move-exception
                goto L13
            L11:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                return
            L13:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                throw r1
        }
    }

    static {
            r0 = 1
            Yue.C4928.f15722 = r0
            Yue.C4928.f15723 = r0
            return
    }

    public C4928(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f15731 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f15732 = r0
            r0 = 2
            r1.f15733 = r0
            r1.f15734 = r0
            r0 = 1
            r1.f15735 = r0
            r1.f15730 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.graphics.Bitmap m19288(android.graphics.Bitmap r5, int r6) {
            r0 = 1
            if (r6 == r0) goto L4
            return r5
        L4:
            int r6 = r5.getWidth()
            int r0 = r5.getHeight()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r6, r0, r1)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r6)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            android.graphics.ColorMatrix r2 = new android.graphics.ColorMatrix
            r2.<init>()
            r3 = 0
            r2.setSaturation(r3)
            android.graphics.ColorMatrixColorFilter r4 = new android.graphics.ColorMatrixColorFilter
            r4.<init>(r2)
            r1.setColorFilter(r4)
            r0.drawBitmap(r5, r3, r3, r1)
            r5 = 0
            r0.setBitmap(r5)
            return r6
    }

    @Yue.InterfaceC5336(19)
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.print.PrintAttributes.Builder m19289(android.print.PrintAttributes r2) {
            android.print.PrintAttributes$Builder r0 = new android.print.PrintAttributes$Builder
            r0.<init>()
            android.print.PrintAttributes$MediaSize r1 = r2.getMediaSize()
            android.print.PrintAttributes$Builder r0 = r0.setMediaSize(r1)
            android.print.PrintAttributes$Resolution r1 = r2.getResolution()
            android.print.PrintAttributes$Builder r0 = r0.setResolution(r1)
            android.print.PrintAttributes$Margins r1 = r2.getMinMargins()
            android.print.PrintAttributes$Builder r0 = r0.setMinMargins(r1)
            int r1 = r2.getColorMode()
            if (r1 == 0) goto L2a
            int r1 = r2.getColorMode()
            r0.setColorMode(r1)
        L2a:
            int r1 = r2.getDuplexMode()
            if (r1 == 0) goto L37
            int r2 = r2.getDuplexMode()
            r0.setDuplexMode(r2)
        L37:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static android.graphics.Matrix m19290(int r3, int r4, android.graphics.RectF r5, int r6) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            float r1 = r5.width()
            float r3 = (float) r3
            float r1 = r1 / r3
            r2 = 2
            if (r6 != r2) goto L19
            float r6 = r5.height()
            float r2 = (float) r4
            float r6 = r6 / r2
            float r6 = java.lang.Math.max(r1, r6)
            goto L23
        L19:
            float r6 = r5.height()
            float r2 = (float) r4
            float r6 = r6 / r2
            float r6 = java.lang.Math.min(r1, r6)
        L23:
            r0.postScale(r6, r6)
            float r1 = r5.width()
            float r3 = r3 * r6
            float r1 = r1 - r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            float r5 = r5.height()
            float r4 = (float) r4
            float r4 = r4 * r6
            float r5 = r5 - r4
            float r5 = r5 / r3
            r0.postTranslate(r1, r5)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m19291(android.graphics.Bitmap r1) {
            int r0 = r1.getWidth()
            int r1 = r1.getHeight()
            if (r0 > r1) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static boolean m19292() {
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m19293() {
            r1 = this;
            int r0 = r1.f15734
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m19294() {
            r1 = this;
            int r0 = r1.f15735
            if (r0 != 0) goto L5
            r0 = 1
        L5:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m19295() {
            r1 = this;
            int r0 = r1.f15733
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final android.graphics.Bitmap m19296(android.net.Uri r5, android.graphics.BitmapFactory.Options r6) throws java.io.FileNotFoundException {
            r4 = this;
            java.lang.String r0 = "close fail "
            java.lang.String r1 = "PrintHelper"
            if (r5 == 0) goto L31
            android.content.Context r2 = r4.f15730
            if (r2 == 0) goto L31
            r3 = 0
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L25
            java.io.InputStream r5 = r2.openInputStream(r5)     // Catch: java.lang.Throwable -> L25
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r5, r3, r6)     // Catch: java.lang.Throwable -> L22
            if (r5 == 0) goto L21
            r5.close()     // Catch: java.io.IOException -> L1d
            goto L21
        L1d:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
        L21:
            return r6
        L22:
            r6 = move-exception
            r3 = r5
            goto L26
        L25:
            r6 = move-exception
        L26:
            if (r3 == 0) goto L30
            r3.close()     // Catch: java.io.IOException -> L2c
            goto L30
        L2c:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
        L30:
            throw r6
        L31:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "bad argument to loadBitmap"
            r5.<init>(r6)
            throw r5
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public android.graphics.Bitmap m19297(android.net.Uri r8) throws java.io.FileNotFoundException {
            r7 = this;
            if (r8 == 0) goto L5f
            android.content.Context r0 = r7.f15730
            if (r0 == 0) goto L5f
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            r7.m19296(r8, r0)
            int r2 = r0.outWidth
            int r0 = r0.outHeight
            r3 = 0
            if (r2 <= 0) goto L5e
            if (r0 > 0) goto L1b
            goto L5e
        L1b:
            int r4 = java.lang.Math.max(r2, r0)
            r5 = r1
        L20:
            r6 = 3500(0xdac, float:4.905E-42)
            if (r4 <= r6) goto L29
            int r4 = r4 >>> 1
            int r5 = r5 << 1
            goto L20
        L29:
            if (r5 <= 0) goto L5e
            int r0 = java.lang.Math.min(r2, r0)
            int r0 = r0 / r5
            if (r0 > 0) goto L33
            goto L5e
        L33:
            java.lang.Object r0 = r7.f15732
            monitor-enter(r0)
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L5b
            r2.<init>()     // Catch: java.lang.Throwable -> L5b
            r7.f15731 = r2     // Catch: java.lang.Throwable -> L5b
            r2.inMutable = r1     // Catch: java.lang.Throwable -> L5b
            r2.inSampleSize = r5     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            android.graphics.Bitmap r8 = r7.m19296(r8, r2)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r7.f15732
            monitor-enter(r0)
            r7.f15731 = r3     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            return r8
        L4d:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            throw r8
        L50:
            r8 = move-exception
            java.lang.Object r1 = r7.f15732
            monitor-enter(r1)
            r7.f15731 = r3     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            throw r8
        L58:
            r8 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            throw r8
        L5b:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r8
        L5e:
            return r3
        L5f:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bad argument to getScaledBitmap"
            r8.<init>(r0)
            throw r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m19298(@Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 android.graphics.Bitmap r3) {
            r1 = this;
            r0 = 0
            r1.m19299(r2, r3, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m19299(@Yue.InterfaceC4410 java.lang.String r10, @Yue.InterfaceC4410 android.graphics.Bitmap r11, @Yue.InterfaceC4544 Yue.C4928.InterfaceC4930 r12) {
            r9 = this;
            if (r11 != 0) goto L3
            return
        L3:
            android.content.Context r0 = r9.f15730
            java.lang.String r1 = "print"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.print.PrintManager r0 = (android.print.PrintManager) r0
            boolean r1 = m19291(r11)
            if (r1 == 0) goto L16
            android.print.PrintAttributes$MediaSize r1 = android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT
            goto L18
        L16:
            android.print.PrintAttributes$MediaSize r1 = android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE
        L18:
            android.print.PrintAttributes$Builder r2 = new android.print.PrintAttributes$Builder
            r2.<init>()
            android.print.PrintAttributes$Builder r1 = r2.setMediaSize(r1)
            int r2 = r9.f15734
            android.print.PrintAttributes$Builder r1 = r1.setColorMode(r2)
            android.print.PrintAttributes r1 = r1.build()
            Yue.ۥۡۥ۠ۥ$ۥ۟۟ r8 = new Yue.ۥۡۥ۠ۥ$ۥ۟۟
            int r5 = r9.f15733
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r0.print(r10, r8, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m19300(@Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 android.net.Uri r3) throws java.io.FileNotFoundException {
            r1 = this;
            r0 = 0
            r1.m19301(r2, r3, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m19301(@Yue.InterfaceC4410 java.lang.String r8, @Yue.InterfaceC4410 android.net.Uri r9, @Yue.InterfaceC4544 Yue.C4928.InterfaceC4930 r10) throws java.io.FileNotFoundException {
            r7 = this;
            Yue.ۥۡۥ۠ۥ$ۥ۟۟۟ r6 = new Yue.ۥۡۥ۠ۥ$ۥ۟۟۟
            int r5 = r7.f15733
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            android.content.Context r9 = r7.f15730
            java.lang.String r10 = "print"
            java.lang.Object r9 = r9.getSystemService(r10)
            android.print.PrintManager r9 = (android.print.PrintManager) r9
            android.print.PrintAttributes$Builder r10 = new android.print.PrintAttributes$Builder
            r10.<init>()
            int r0 = r7.f15734
            r10.setColorMode(r0)
            int r0 = r7.f15735
            r1 = 1
            if (r0 == r1) goto L31
            if (r0 != 0) goto L28
            goto L31
        L28:
            r1 = 2
            if (r0 != r1) goto L36
            android.print.PrintAttributes$MediaSize r0 = android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT
            r10.setMediaSize(r0)
            goto L36
        L31:
            android.print.PrintAttributes$MediaSize r0 = android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE
            r10.setMediaSize(r0)
        L36:
            android.print.PrintAttributes r10 = r10.build()
            r9.print(r8, r6, r10)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m19302(int r1) {
            r0 = this;
            r0.f15734 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m19303(int r1) {
            r0 = this;
            r0.f15735 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m19304(int r1) {
            r0 = this;
            r0.f15733 = r1
            return
    }

    @Yue.InterfaceC5336(19)
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m19305(android.print.PrintAttributes r12, int r13, android.graphics.Bitmap r14, android.os.ParcelFileDescriptor r15, android.os.CancellationSignal r16, android.print.PrintDocumentAdapter.WriteResultCallback r17) {
            r11 = this;
            boolean r0 = Yue.C4928.f15723
            r1 = 0
            if (r0 == 0) goto L7
            r5 = r12
            goto L19
        L7:
            android.print.PrintAttributes$Builder r0 = m19289(r12)
            android.print.PrintAttributes$Margins r2 = new android.print.PrintAttributes$Margins
            r2.<init>(r1, r1, r1, r1)
            android.print.PrintAttributes$Builder r0 = r0.setMinMargins(r2)
            android.print.PrintAttributes r0 = r0.build()
            r5 = r0
        L19:
            Yue.ۥۡۥ۠ۥ$ۥ r0 = new Yue.ۥۡۥ۠ۥ$ۥ
            r2 = r0
            r3 = r11
            r4 = r16
            r6 = r14
            r7 = r12
            r8 = r13
            r9 = r15
            r10 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r0.execute(r1)
            return
    }
}

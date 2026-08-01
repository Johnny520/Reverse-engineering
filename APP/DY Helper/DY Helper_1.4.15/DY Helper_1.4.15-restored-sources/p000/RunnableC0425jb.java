package p000;

/* JADX INFO: renamed from: jb */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0425jb implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5397;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.view.View f5398;

    public /* synthetic */ RunnableC0425jb(int r1, android.view.View r2, java.lang.Object r3) {
            r0 = this;
            r0.f5397 = r1
            r0.f5398 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC0425jb(android.view.View r2) {
            r1 = this;
            r0 = 29
            r1.f5397 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.qr1.f9091
            r1.<init>()
            r1.f5398 = r2
            return
    }

    public /* synthetic */ RunnableC0425jb(android.view.View r1, int r2) {
            r0 = this;
            r0.f5397 = r2
            r0.f5398 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC0425jb(p000.C0834tg r1, android.view.View r2) {
            r0 = this;
            r1 = 16
            r0.f5397 = r1
            r0.<init>()
            r0.f5398 = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            int r0 = r8.f5397
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 4
            s62 r5 = p000.s62.f9751
            r6 = 0
            r7 = 3
            android.view.View r8 = r8.f5398
            switch(r0) {
                case 0: goto L243;
                case 1: goto L23a;
                case 2: goto L231;
                case 3: goto L228;
                case 4: goto L21e;
                case 5: goto L214;
                case 6: goto L20a;
                case 7: goto L204;
                case 8: goto L1fa;
                case 9: goto L1f6;
                case 10: goto L1f2;
                case 11: goto L1ec;
                case 12: goto L1df;
                case 13: goto L1d9;
                case 14: goto L1d3;
                case 15: goto L1cd;
                case 16: goto L1bd;
                case 17: goto L19c;
                case 18: goto L17f;
                case 19: goto L17b;
                case 20: goto L175;
                case 21: goto L157;
                case 22: goto L151;
                case 23: goto L139;
                case 24: goto L57;
                case 25: goto L53;
                case 26: goto L4f;
                case 27: goto L31;
                case 28: goto L15;
                default: goto Lf;
            }
        Lf:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.qr1.f9091
            p000.qr1.m4943(r8)
            return
        L15:
            p000.a01.m4(r8)     // Catch: java.lang.Throwable -> L19
            goto L1f
        L19:
            r8 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r8)
        L1f:
            java.lang.Throwable r8 = p000.fo1.m2190(r5)
            if (r8 == 0) goto L30
            java.lang.String r8 = r8.getMessage()
            java.lang.String r0 = "附着标题 View 失败: "
            java.lang.String r1 = "rbe3d87ed96de26de"
            p000.AbstractC0602nx.m4143(r0, r8, r1)
        L30:
            return
        L31:
            r8.setVisibility(r4)
            r8.setAlpha(r3)
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            if (r0 == 0) goto L4e
            r0.width = r6
            r0.height = r6
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L4b
            r1 = r0
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r1.setMargins(r6, r6, r6, r6)
        L4b:
            r8.setLayoutParams(r0)
        L4e:
            return
        L4f:
            p000.cp0.m1602(r8)
            return
        L53:
            p000.cp0.m1602(r8)
            return
        L57:
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.xk0.f12197
            boolean r0 = r8 instanceof android.widget.ImageView
            if (r0 == 0) goto L75
            r0 = r8
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L75
            boolean r3 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r3 == 0) goto L75
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            if (r0 == 0) goto L75
            p000.xk0.m6678(r0)
        L75:
            java.lang.Class r0 = r8.getClass()
        L79:
            if (r0 == 0) goto Lc3
            java.lang.Class<android.view.View> r3 = android.view.View.class
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto Lc3
            java.lang.reflect.Field[] r3 = r0.getDeclaredFields()
            τ r3 = p000.h62.m2434(r3)
        L8b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lbe
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.setAccessible(r2)     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r4 = r4.get(r8)     // Catch: java.lang.Throwable -> L8b
            boolean r5 = r4 instanceof android.graphics.Bitmap     // Catch: java.lang.Throwable -> L8b
            if (r5 == 0) goto La8
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch: java.lang.Throwable -> L8b
            p000.xk0.m6678(r4)     // Catch: java.lang.Throwable -> L8b
            goto L8b
        La8:
            boolean r5 = r4 instanceof android.graphics.drawable.Drawable     // Catch: java.lang.Throwable -> L8b
            if (r5 == 0) goto L8b
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4     // Catch: java.lang.Throwable -> L8b
            boolean r5 = r4 instanceof android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Throwable -> L8b
            if (r5 == 0) goto L8b
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4     // Catch: java.lang.Throwable -> L8b
            android.graphics.Bitmap r4 = r4.getBitmap()     // Catch: java.lang.Throwable -> L8b
            if (r4 == 0) goto L8b
            p000.xk0.m6678(r4)     // Catch: java.lang.Throwable -> L8b
            goto L8b
        Lbe:
            java.lang.Class r0 = r0.getSuperclass()
            goto L79
        Lc3:
            int r0 = java.lang.System.identityHashCode(r8)
            java.util.LinkedHashSet r2 = p000.xk0.f12200
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L138
            int r3 = r8.getWidth()
            r4 = 100
            if (r3 <= r4) goto L138
            int r3 = r8.getHeight()
            if (r3 <= r4) goto L138
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L138
            boolean r4 = r8.isLaidOut()     // Catch: java.lang.Throwable -> L138
            if (r4 == 0) goto L10d
            int r1 = r8.getWidth()     // Catch: java.lang.Throwable -> L138
            int r4 = r8.getHeight()     // Catch: java.lang.Throwable -> L138
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r4, r3)     // Catch: java.lang.Throwable -> L138
            android.graphics.Canvas r3 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L138
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L138
            int r4 = r8.getScrollX()     // Catch: java.lang.Throwable -> L138
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L138
            float r4 = -r4
            int r5 = r8.getScrollY()     // Catch: java.lang.Throwable -> L138
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L138
            float r5 = -r5
            r3.translate(r4, r5)     // Catch: java.lang.Throwable -> L138
            r8.draw(r3)     // Catch: java.lang.Throwable -> L138
            goto L112
        L10d:
            java.lang.String r8 = "View needs to be laid out before calling drawToBitmap()"
            p000.C1080.m7279(r8)     // Catch: java.lang.Throwable -> L138
        L112:
            if (r1 == 0) goto L133
            boolean r8 = r1.isRecycled()     // Catch: java.lang.Throwable -> L138
            if (r8 != 0) goto L133
            int r8 = r1.getWidth()     // Catch: java.lang.Throwable -> L138
            r3 = 200(0xc8, float:2.8E-43)
            if (r8 < r3) goto L133
            boolean r8 = p000.xk0.m6679(r1)     // Catch: java.lang.Throwable -> L138
            if (r8 != 0) goto L133
            p000.xk0.m6678(r1)     // Catch: java.lang.Throwable -> L138
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L138
            r2.add(r8)     // Catch: java.lang.Throwable -> L138
            goto L138
        L133:
            if (r1 == 0) goto L138
            r1.recycle()     // Catch: java.lang.Throwable -> L138
        L138:
            return
        L139:
            p000.ri0.m5089(r8)     // Catch: java.lang.Throwable -> L13d
            goto L143
        L13d:
            r8 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r8)
        L143:
            java.lang.Throwable r8 = p000.fo1.m2190(r5)
            if (r8 == 0) goto L150
            java.lang.String r0 = "rbb4637c919e2110c"
            java.lang.String r1 = "注入消息页会话删除按钮失败"
            p000.C0888ux.m5977(r0, r1, r8)
        L150:
            return
        L151:
            android.os.Handler r0 = p000.ah0.f229
            p000.ah0.m137(r8)
            return
        L157:
            r8.setVisibility(r4)
            r8.setAlpha(r3)
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            if (r0 == 0) goto L174
            r0.width = r6
            r0.height = r6
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L171
            r1 = r0
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r1.setMargins(r6, r6, r6, r6)
        L171:
            r8.setLayoutParams(r0)
        L174:
            return
        L175:
            com.example.dyhelper.hook.γ r0 = com.example.dyhelper.hook.C0157.f2411
            r0.m1524(r8)
            return
        L17b:
            p000.C0623oh.m4237(r8)
            return
        L17f:
            tg r0 = p000.AbstractC0871ug.f10771
            java.lang.Integer r1 = p000.C0834tg.m5664(r8)
            if (r1 == 0) goto L198
            int r2 = r1.intValue()
            boolean r2 = p000.C0834tg.m5645(r2)
            if (r2 == 0) goto L198
            int r1 = r1.intValue()
            r0.m5694(r8, r1, r6)
        L198:
            p000.C0834tg.m5667()
            return
        L19c:
            tg r0 = p000.AbstractC0871ug.f10771
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L1b9
            android.os.Handler r0 = p000.AbstractC0871ug.f10780
            jb r1 = new jb
            r2 = 17
            r1.<init>(r8, r2)
            r0.post(r1)
            goto L1bc
        L1b9:
            r0.m5693(r8, r2)
        L1bc:
            return
        L1bd:
            r0 = 2131618538(0x7f0deaea, float:1.886409E38)
            r8.setTag(r0, r1)
            boolean r0 = r8.isAttachedToWindow()
            if (r0 == 0) goto L1cc
            p000.C0834tg.m5652(r8)
        L1cc:
            return
        L1cd:
            tg r0 = p000.AbstractC0871ug.f10771
            p000.C0834tg.m5652(r8)
            return
        L1d3:
            tg r0 = p000.AbstractC0871ug.f10771
            r0.m5696(r8)
            return
        L1d9:
            tg r0 = p000.AbstractC0871ug.f10771
            r0.m5695(r8)
            return
        L1df:
            boolean r0 = r8.isAttachedToWindow()
            if (r0 == 0) goto L1eb
            tg r0 = p000.AbstractC0871ug.f10771
            r1 = 2
            r0.m5694(r8, r1, r6)
        L1eb:
            return
        L1ec:
            tg r0 = p000.AbstractC0871ug.f10771
            r0.m5692(r8)
            return
        L1f2:
            p000.C0792sb.m5407(r8, r7)
            return
        L1f6:
            p000.C0792sb.m5407(r8, r7)
            return
        L1fa:
            boolean r0 = r8.isAttachedToWindow()
            if (r0 == 0) goto L203
            p000.C0792sb.m5415(r8)
        L203:
            return
        L204:
            sb r0 = p000.C0792sb.f9786
            p000.C0792sb.m5406(r8)
            return
        L20a:
            boolean r0 = r8.isAttachedToWindow()
            if (r0 == 0) goto L213
            p000.C0792sb.m5407(r8, r7)
        L213:
            return
        L214:
            boolean r0 = r8.isAttachedToWindow()
            if (r0 == 0) goto L21d
            p000.C0792sb.m5407(r8, r7)
        L21d:
            return
        L21e:
            boolean r0 = r8.isAttachedToWindow()
            if (r0 == 0) goto L227
            p000.C0792sb.m5416(r8)
        L227:
            return
        L228:
            sb r0 = p000.C0792sb.f9786
            p000.C0792sb.m5426(r8)
            p000.C0792sb.m5404()
            return
        L231:
            sb r0 = p000.C0792sb.f9786
            p000.C0792sb.m5426(r8)
            p000.C0792sb.m5404()
            return
        L23a:
            sb r0 = p000.C0792sb.f9786
            p000.C0792sb.m5426(r8)
            p000.C0792sb.m5404()
            return
        L243:
            p000.C0792sb.m5407(r8, r7)
            return
    }
}

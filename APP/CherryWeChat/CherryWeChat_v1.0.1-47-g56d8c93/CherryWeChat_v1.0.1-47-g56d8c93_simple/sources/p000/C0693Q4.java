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
import java.util.ArrayList;

/* JADX INFO: renamed from: Q4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0693Q4 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2232a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2233b;

    public /* synthetic */ C0693Q4(int r1, Object r2) {
        this.f2232a = r1;
        this.f2233b = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final Object mo6a() {
        int r1 = this.f2232a;
        boolean r2 = true;
        C0829TC r3 = C0829TC.f2620a;
        Object r4 = this.f2233b;
        switch(r1) {
            case 0: goto L128;
            case 1: goto L21;
            case 2: goto L20;
            case 3: goto L18;
            case 4: goto L8;
            case 5: goto L7;
            default: goto L4;
        };
    L4:
        C0212Ex r42 = (C0212Ex) r4;
        return Integer.valueOf(AbstractC0585Nj.m1126E(r42, r42.f627j));
    L8:
        C1495ha r43 = (C1495ha) r4;
        C0183EA.f539a.getClass();
        r43.f5272i = C0183EA.m381i();
        EditText r12 = r43.f5267d;
        if (r12 == null) goto L14;
        Editable r13 = r12.getText();
        if (r13 == null) goto L14;
        String r14 = r13.toString();
        if (r14 == null) goto L14;
    L15:
        r43.m2859e(r14);
        return r3;
    L14:
        r14 = AbstractC0295Gu.m625r(-83288005802037L);
        goto L15
    L21:
        View r44 = (View) r4;
        C1442g8 r15 = C1442g8.f5046b;
        r15.getClass();
        Context r5 = r44.getContext();
        AbstractC0295Gu.m625r(-259686607616053L);
        int r7 = 0;
        ?? r9 = 0;
        ?? r92 = 0;
        if (C1442g8.m2759m() == false) goto L59;
        DisplayMetrics r6 = r5.getResources().getDisplayMetrics();
        SharedPreferences r10 = AbstractC0599Nx.f1939a;
        String r102 = AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-261121126692917L), AbstractC0295Gu.m625r(-260670155126837L));
        if (r102.length() <= 0) goto L54;
        int r11 = r6.widthPixels;
        int r62 = r6.heightPixels;
        BitmapFactory.Options r122 = new BitmapFactory.Options();     // Catch: Throwable -> L130
        r122.inJustDecodeBounds = true;     // Catch: Throwable -> L130
        BitmapFactory.decodeFile(r102, r122);     // Catch: Throwable -> L130
        int r132 = r122.outWidth;     // Catch: Throwable -> L130
        if (r132 <= 0) goto L33;
        int r142 = r122.outHeight;     // Catch: Throwable -> L130
        if (r142 <= 0) goto L33;
        r122.inSampleSize = C1442g8.m2753f(r132, r142, r11, r62);     // Catch: Throwable -> L130
        r122.inJustDecodeBounds = false;     // Catch: Throwable -> L130
        Bitmap r133 = BitmapFactory.decodeFile(r102, r122);     // Catch: Throwable -> L130
        if (r133 == null) goto L33;
        int r22 = new ExifInterface(r102).getAttributeInt(AbstractC0295Gu.m625r(-260562780944437L), 1);     // Catch: Throwable -> L129
        if (r22 != 3) goto L37;
        float r23 = 180.0f;
    L45:
        if (r23 == 0.0f) goto L51;
        Matrix r63 = new Matrix();     // Catch: Throwable -> L129
        r63.postRotate(r23);     // Catch: Throwable -> L129
        Bitmap r24 = Bitmap.createBitmap(r133, 0, 0, r133.getWidth(), r133.getHeight(), r63, true);     // Catch: Throwable -> L129
        AbstractC0295Gu.m625r(-260064564738101L);     // Catch: Throwable -> L129
        if (r24.equals(r133) == true) goto L50;
        r133.recycle();     // Catch: Throwable -> L129
    L50:
        r133 = r24;
        goto L51
    L37:
        if (r22 != 6) goto L39;
        r23 = 90.0f;
        goto L45
    L39:
        if (r22 == 8) goto L41;
        r23 = 0.0f;
        goto L45
    L41:
        r23 = 270.0f;
    L51:
        if (r133 != null) goto L53;
    L52:
        ?? r25 = 0;
    L73:
        if (r25 != 0) goto L76;
    L126:
        return r3;
    L76:
        if (r15.m2762j() == false) goto L118;
        SharedPreferences r16 = AbstractC0599Nx.f1939a;
        if (AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-260790414211125L), false) == false) goto L118;
        View r17 = r44;
    L80:
        Object r18 = r17.getParent();
        if ((r18 instanceof View) == false) goto L83;
        r17 = (View) r18;
    L84:
        if (r17 == null) goto L85;
        if (r17.getClass().getName().equals(AbstractC0295Gu.m625r(-260141874149429L)) == false) goto L80;
        ViewParent r19 = r17.getParent();
        if ((r19 instanceof ViewGroup) == false) goto L85;
        ?? r110 = (ViewGroup) r19;
    L91:
        if (r110 != 0) goto L104;
        View r111 = r44;
    L93:
        if (r111 == null) goto L103;
        if (r111.getId() == 16908290) goto L97;
    L99:
        Object r112 = r111.getParent();
        if ((r112 instanceof View) == true) goto L101;
        r111 = null;
        goto L93
    L101:
        r111 = (View) r112;
        goto L93
    L97:
        if ((r111 instanceof ViewGroup) == false) goto L99;
        r110 = (ViewGroup) r111;
        goto L104
    L103:
        r110 = 0;
    L104:
        if (r110 == 0) goto L109;
        r44.setAlpha(0.0f);
        C1442g8.m2755h(r44, r110);
        if (C1442g8.m2757k(r110) == true) goto L108;
        r110.addView(r25, 0, new ViewGroup.LayoutParams(-1, -1));
    L108:
        r44.post(new RunnableC1311d8(r44, r7));
        goto L126
    L109:
        ViewParent r113 = r44.getParent();
        if ((r113 instanceof ViewGroup) == false) goto L112;
        r92 = (ViewGroup) r113;
    L112:
        if (r92 == 0) goto L126;
        r44.setAlpha(0.0f);
        C1442g8.m2755h(r44, r92);
        if (C1442g8.m2757k(r92) == true) goto L117;
        r92.addView(r25, -1, -1);
    L117:
        r44.post(new RunnableC1311d8(r44, r7));
    L85:
        r110 = 0;
        goto L91
    L83:
        r17 = null;
    L118:
        ViewParent r114 = r44.getParent();
        if ((r114 instanceof ViewGroup) == false) goto L121;
        r9 = (ViewGroup) r114;
    L121:
        if (r9 == 0) goto L126;
        if (C1442g8.m2757k(r9) == true) goto L126;
        r9.addView(r25, -1, -1);
        goto L126
    L53:
        ImageView r26 = new ImageView(r5);
        r26.setScaleType(ImageView.ScaleType.CENTER_CROP);
        r26.setImageBitmap(r133);
        r26.setClickable(false);
        r26.setTag(AbstractC0295Gu.m625r(-259755327092789L));
        r25 = r26;
    L33:
        r133 = null;
        goto L51
    L54:
        final String r27 = C1442g8.m2756i();
        if (r27.length() == 0) goto L52;
        final ImageView r103 = new ImageView(r5);
        r103.setScaleType(ImageView.ScaleType.CENTER_CROP);
        r103.setClickable(false);
        r103.setTag(AbstractC0295Gu.m625r(-260390982252597L));
        final int r52 = r6.widthPixels;
        final int r64 = r6.heightPixels;
        new Thread(new RunnableC1249c8(r27, r52, r64, r103)).start();
        ?? r104 = r103;
    L58:
        r25 = r104;
        goto L73
    L59:
        String r65 = C1442g8.f5047c;
        if (r65.length() == 0) goto L52;
        ?? r105 = new TextureViewSurfaceTextureListenerC2477ry(r5);
        r105.f8710c = false;
        r105.setSurfaceTextureListener(r105);
        r105.setKeepScreenOn(true);
        if (r15.m2024e() == true) goto L65;
    L71:
        r2 = false;
    L72:
        r105.setPlayWithSound(r2);
        r105.setVideoPath(r65);
        r105.setTag(AbstractC0295Gu.m625r(-260476881598517L));
        r104 = r105;
        goto L58
    L65:
        if (C1442g8.m2759m() == true) goto L71;
        if (r65.length() <= 0) goto L71;
        SharedPreferences r53 = AbstractC0599Nx.f1939a;
        if (AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-261486198913077L), false) == false) goto L71;
    L7:
        return MessageAPI.m3448e((MessageAPI.MessageCallback) r4);
    L18:
        return CherryThreadAPI.m3206u((ArrayList) r4);
    L20:
        return CherryMessageAPI.m3133o((CherryMessageAPI.MessageCallback) r4);
    L128:
        return new C2694x(1, (Object[]) r4);
    }
}

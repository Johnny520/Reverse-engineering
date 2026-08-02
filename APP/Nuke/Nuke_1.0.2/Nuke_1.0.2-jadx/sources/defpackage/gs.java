package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.List;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gs implements in0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [b5.<init>(java.io.File):void, c10.a(org.luckypray.dexkit.DexKitBridge):void, c20.<clinit>():void, ci0.e(uh1, px, int):void, ds2.<clinit>():void, dt.c(java.lang.Class, java.lang.Object[]):java.lang.Object, gs.j(java.lang.Object):java.lang.Object, he.a(org.luckypray.dexkit.DexKitBridge):void, hs.a(org.luckypray.dexkit.DexKitBridge):void, is.a(org.luckypray.dexkit.DexKitBridge):void, lx0.a(org.luckypray.dexkit.DexKitBridge):void, mx0.a(org.luckypray.dexkit.DexKitBridge):void, nz.a(org.luckypray.dexkit.DexKitBridge):void, s11.u(w80[]):w80, z00.a(org.luckypray.dexkit.DexKitBridge):void] */
    public /* synthetic */ gs(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        Object x92Var;
        Object x92Var2;
        Class cls;
        switch (this.h) {
            case 0:
                dj0 dj0Var = (dj0) obj;
                dj0Var.getClass();
                dj0Var.t = mg.t0(new String[]{"com.tencent.mm.ui.chatting.adapter"});
                yg1 yg1Var = new yg1();
                yg1Var.j0("MicroMsg.ChattingDataAdapterV3", "_onBindViewHolder[");
                a83 a83Var = a83.a;
                dj0Var.u = yg1Var;
                return a83Var;
            case 1:
                dj0 dj0Var2 = (dj0) obj;
                dj0Var2.getClass();
                dj0Var2.t = mg.t0(new String[]{"com.tencent.mm.ui.chatting.component"});
                yg1 yg1Var2 = new yg1();
                yg1Var2.j0("MicroMsg.ChattingUI.FootComponent", "resetFooter customFooter is %s");
                a83 a83Var2 = a83.a;
                dj0Var2.u = yg1Var2;
                return a83Var2;
            case 2:
                return Boolean.valueOf(Modifier.isPublic(((Constructor) obj).getModifiers()));
            case 3:
                cj0 cj0Var = (cj0) obj;
                cj0Var.getClass();
                cj0Var.t = mg.t0(new String[]{"com.tencent.mm.storage"});
                at atVar = new at();
                atVar.d0("MicroMsg.ContactStorage", "FATAL ERROR, invalid contact, empty username");
                a83 a83Var3 = a83.a;
                cj0Var.u = atVar;
                return a83Var3;
            case 4:
                dj0 dj0Var3 = (dj0) obj;
                dj0Var3.getClass();
                dj0Var3.t = mg.t0(new String[]{"com.tencent.mm.storage"});
                yg1 yg1Var3 = new yg1();
                yg1Var3.j0("ConversationStorage", "delChatContact");
                a83 a83Var4 = a83.a;
                dj0Var3.u = yg1Var3;
                return a83Var4;
            case 5:
                dj0 dj0Var4 = (dj0) obj;
                dj0Var4.getClass();
                dj0Var4.t = mg.t0(new String[]{"com.tencent.mm.storage"});
                yg1 yg1Var4 = new yg1();
                yg1Var4.j0("updateUnreadByTalker %s");
                a83 a83Var5 = a83.a;
                dj0Var4.u = yg1Var4;
                return a83Var5;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                dj0 dj0Var5 = (dj0) obj;
                dj0Var5.getClass();
                yg1 yg1Var5 = new yg1();
                yg1Var5.j0("MMKernel.CoreAccount", "getUinFromSharedPreferences get from sp fail");
                a83 a83Var6 = a83.a;
                dj0Var5.u = yg1Var5;
                return a83Var6;
            case 7:
                yg1 yg1Var6 = (yg1) obj;
                yg1Var6.getClass();
                at atVar2 = new at();
                atVar2.d0("MMKernel.CoreStorage", "factory.getSQLs() is null! %s, %s");
                a83 a83Var7 = a83.a;
                yg1Var6.v = atVar2;
                yg1Var6.h0("MicroMsg.db");
                return a83Var7;
            case 8:
                dj0 dj0Var6 = (dj0) obj;
                dj0Var6.getClass();
                dj0Var6.c0(new gs(7));
                return a83.a;
            case 9:
                y10 y10Var = (y10) obj;
                if (y10Var instanceof c20) {
                    return (c20) y10Var;
                }
                return null;
            case 10:
                jg3 jg3Var = (jg3) obj;
                a83 a83Var8 = a83.a;
                jg3Var.getClass();
                x30.d.getClass();
                String strC = pp1.c().c("CustomInputHint/text");
                String str = strC != null ? strC : "";
                if (pv2.s0(str)) {
                    str = null;
                }
                if (str != null) {
                    Object obj2 = jg3Var.a.thisObject;
                    TextView textView = obj2 instanceof TextView ? (TextView) obj2 : null;
                    if (textView != null) {
                        textView.setHint(str);
                    }
                }
                return a83Var8;
            case 11:
                w80 w80Var = (w80) obj;
                w80Var.getClass();
                return w80Var.c;
            case 12:
                jg3 jg3Var2 = (jg3) obj;
                jg3Var2.getClass();
                jg3Var2.b(0);
                return a83.a;
            case 13:
                jg3 jg3Var3 = (jg3) obj;
                a83 a83Var9 = a83.a;
                jg3Var3.getClass();
                Object obj3 = jg3Var3.a.thisObject;
                obj3.getClass();
                String stringExtra = ((Activity) obj3).getIntent().getStringExtra("Contact_User");
                if (stringExtra != null) {
                    String str2 = pv2.s0(stringExtra) ? null : stringExtra;
                    if (str2 != null) {
                        r90.j = str2;
                    }
                }
                return a83Var9;
            case 14:
                List list = (List) obj;
                list.getClass();
                return Boolean.valueOf(list.size() == 4 && AdapterView.class.isAssignableFrom((Class) list.get(0)) && t11.l(list.get(1), View.class) && t11.l(list.get(2), Integer.TYPE) && t11.l(list.get(3), Long.TYPE));
            case 15:
                jg3 jg3Var4 = (jg3) obj;
                a83 a83Var10 = a83.a;
                r90 r90Var = r90.d;
                jg3Var4.getClass();
                try {
                    r90Var.getClass();
                    r90.q(jg3Var4);
                    x92Var = a83Var10;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                Throwable thA = y92.a(x92Var);
                if (thA != null) {
                    r90Var.getClass();
                    hg3.d(r90.h, "Unable to handle contact ID entry click: ".concat(fg1.Q(thA)));
                }
                return a83Var10;
            case 16:
                ((String) obj).getClass();
                return a83.a;
            case 17:
                jg3 jg3Var5 = (jg3) obj;
                a83 a83Var11 = a83.a;
                w90 w90Var = w90.d;
                jg3Var5.getClass();
                try {
                    w90Var.getClass();
                    w90.q(jg3Var5);
                    x92Var2 = a83Var11;
                } catch (Throwable th2) {
                    x92Var2 = new x92(th2);
                }
                Throwable thA2 = y92.a(x92Var2);
                if (thA2 != null) {
                    w90Var.getClass();
                    hg3.d(w90.h, "Unable to display message details: ".concat(fg1.Q(thA2)));
                }
                return a83Var11;
            case 18:
                jg3 jg3Var6 = (jg3) obj;
                jg3Var6.getClass();
                je0 je0Var = je0.d;
                Object result = jg3Var6.a.getResult();
                result.getClass();
                Bitmap bitmap = (Bitmap) result;
                je0Var.getClass();
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.getClass();
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                Path path = new Path();
                path.addRoundRect(new RectF(0.0f, 0.0f, width, height), 100.0f, 100.0f, Path.Direction.CCW);
                canvas.drawPath(path, paint);
                jg3Var6.b(bitmapCreateBitmap);
                return a83.a;
            case 19:
                dj0 dj0Var7 = (dj0) obj;
                dj0Var7.getClass();
                dj0Var7.t = mg.t0(new String[]{"com.tencent.mm.sdk.platformtools"});
                yg1 yg1Var7 = new yg1();
                yg1Var7.j0("getRoundedCornerBitmap bitmap recycle %s");
                yg1Var7.d0(5);
                a83 a83Var12 = a83.a;
                dj0Var7.u = yg1Var7;
                return a83Var12;
            case AIChatConfig.MaxContextRounds /* 20 */:
                d31 d31Var = (d31) obj;
                d31Var.getClass();
                d31Var.c = true;
                return a83.a;
            case 21:
                jg3 jg3Var7 = (jg3) obj;
                jg3Var7.getClass();
                jg3Var7.b(Boolean.TRUE);
                return a83.a;
            case 22:
                jg3 jg3Var8 = (jg3) obj;
                jg3Var8.getClass();
                jg3Var8.b(Boolean.TRUE);
                return a83.a;
            case 23:
                dj0 dj0Var8 = (dj0) obj;
                dj0Var8.getClass();
                yg1 yg1Var8 = new yg1();
                yg1Var8.d0(3);
                yg1Var8.j0("MicroMsg.CgiCheckLoginAsPad", "/cgi-bin/micromsg-bin/checkloginaspad");
                a83 a83Var13 = a83.a;
                dj0Var8.u = yg1Var8;
                return a83Var13;
            case 24:
                a83 a83Var14 = a83.a;
                dj0 dj0Var9 = (dj0) obj;
                dj0Var9.getClass();
                dj0Var9.t = mg.t0(new String[]{"com.tencent.mm.ui"});
                yg1 yg1Var9 = new yg1();
                yg1.c0(yg1Var9, 9);
                yg1Var9.d0(0);
                yg1Var9.j0("royole", "tecno", "ro.os_foldable_screen_support");
                cls = Boolean.class;
                Class<Boolean> clsA = p40.A(d72.a(cls));
                yg1Var9.f0(clsA != null ? clsA : Boolean.class);
                dj0Var9.u = yg1Var9;
                return a83Var14;
            case 25:
                synchronized (ds2.c) {
                    List list2 = ds2.i;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((in0) list2.get(i)).j(obj);
                    }
                }
                return a83.a;
            case 26:
                Context context = (Context) obj;
                context.getClass();
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return imageView;
            case 27:
                at atVar3 = (at) obj;
                atVar3.getClass();
                atVar3.c0("MicroMsg.ConfigStorageLogic", "get userinfo fail");
                return a83.a;
            case 28:
                cj0 cj0Var2 = (cj0) obj;
                cj0Var2.getClass();
                cj0Var2.c0(new gs(27));
                return a83.a;
            default:
                cj0 cj0Var3 = (cj0) obj;
                cj0Var3.getClass();
                at atVar4 = new at();
                atVar4.d0("MicroMsg.ImgUpload.MsgImgFeatureService", "computePHash fileNotExist:");
                a83 a83Var15 = a83.a;
                cj0Var3.u = atVar4;
                return a83Var15;
        }
    }
}

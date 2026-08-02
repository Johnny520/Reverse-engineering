package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: gs */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0251gs implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3685h;

    public /* synthetic */ C0251gs(int i) {
        this.f3685h = i;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        Object x92Var;
        Object x92Var2;
        Class cls;
        switch (this.f3685h) {
            case 0:
                dj0 dj0Var = (dj0) obj;
                dj0Var.getClass();
                dj0Var.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.ui.chatting.adapter"});
                yg1 yg1Var = new yg1();
                yg1Var.m6277j0("MicroMsg.ChattingDataAdapterV3", "_onBindViewHolder[");
                a83 a83Var = a83.f116a;
                dj0Var.f2078u = yg1Var;
                return a83Var;
            case 1:
                dj0 dj0Var2 = (dj0) obj;
                dj0Var2.getClass();
                dj0Var2.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.ui.chatting.component"});
                yg1 yg1Var2 = new yg1();
                yg1Var2.m6277j0("MicroMsg.ChattingUI.FootComponent", "resetFooter customFooter is %s");
                a83 a83Var2 = a83.f116a;
                dj0Var2.f2078u = yg1Var2;
                return a83Var2;
            case 2:
                return Boolean.valueOf(Modifier.isPublic(((Constructor) obj).getModifiers()));
            case 3:
                cj0 cj0Var = (cj0) obj;
                cj0Var.getClass();
                cj0Var.f1584t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.storage"});
                C0030at c0030at = new C0030at();
                c0030at.m272d0("MicroMsg.ContactStorage", "FATAL ERROR, invalid contact, empty username");
                a83 a83Var3 = a83.f116a;
                cj0Var.f1585u = c0030at;
                return a83Var3;
            case 4:
                dj0 dj0Var3 = (dj0) obj;
                dj0Var3.getClass();
                dj0Var3.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.storage"});
                yg1 yg1Var3 = new yg1();
                yg1Var3.m6277j0("ConversationStorage", "delChatContact");
                a83 a83Var4 = a83.f116a;
                dj0Var3.f2078u = yg1Var3;
                return a83Var4;
            case 5:
                dj0 dj0Var4 = (dj0) obj;
                dj0Var4.getClass();
                dj0Var4.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.storage"});
                yg1 yg1Var4 = new yg1();
                yg1Var4.m6277j0("updateUnreadByTalker %s");
                a83 a83Var5 = a83.f116a;
                dj0Var4.f2078u = yg1Var4;
                return a83Var5;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                dj0 dj0Var5 = (dj0) obj;
                dj0Var5.getClass();
                yg1 yg1Var5 = new yg1();
                yg1Var5.m6277j0("MMKernel.CoreAccount", "getUinFromSharedPreferences get from sp fail");
                a83 a83Var6 = a83.f116a;
                dj0Var5.f2078u = yg1Var5;
                return a83Var6;
            case 7:
                yg1 yg1Var6 = (yg1) obj;
                yg1Var6.getClass();
                C0030at c0030at2 = new C0030at();
                c0030at2.m272d0("MMKernel.CoreStorage", "factory.getSQLs() is null! %s, %s");
                a83 a83Var7 = a83.f116a;
                yg1Var6.f13447v = c0030at2;
                yg1Var6.m6275h0("MicroMsg.db");
                return a83Var7;
            case 8:
                dj0 dj0Var6 = (dj0) obj;
                dj0Var6.getClass();
                dj0Var6.m1030c0(new C0251gs(7));
                return a83.f116a;
            case 9:
                y10 y10Var = (y10) obj;
                if (y10Var instanceof c20) {
                    return (c20) y10Var;
                }
                return null;
            case 10:
                jg3 jg3Var = (jg3) obj;
                a83 a83Var8 = a83.f116a;
                jg3Var.getClass();
                x30.f12787d.getClass();
                String strM3606c = pp1.m3931c().m3606c("CustomInputHint/text");
                String str = strM3606c != null ? strM3606c : "";
                if (pv2.m4006s0(str)) {
                    str = null;
                }
                if (str != null) {
                    Object obj2 = jg3Var.f5028a.thisObject;
                    TextView textView = obj2 instanceof TextView ? (TextView) obj2 : null;
                    if (textView != null) {
                        textView.setHint(str);
                    }
                }
                return a83Var8;
            case 11:
                w80 w80Var = (w80) obj;
                w80Var.getClass();
                return w80Var.f12395c;
            case 12:
                jg3 jg3Var2 = (jg3) obj;
                jg3Var2.getClass();
                jg3Var2.m2497b(0);
                return a83.f116a;
            case 13:
                jg3 jg3Var3 = (jg3) obj;
                a83 a83Var9 = a83.f116a;
                jg3Var3.getClass();
                Object obj3 = jg3Var3.f5028a.thisObject;
                obj3.getClass();
                String stringExtra = ((Activity) obj3).getIntent().getStringExtra("Contact_User");
                if (stringExtra != null) {
                    String str2 = pv2.m4006s0(stringExtra) ? null : stringExtra;
                    if (str2 != null) {
                        r90.f9449j = str2;
                    }
                }
                return a83Var9;
            case 14:
                List list = (List) obj;
                list.getClass();
                return Boolean.valueOf(list.size() == 4 && AdapterView.class.isAssignableFrom((Class) list.get(0)) && t11.m5086l(list.get(1), View.class) && t11.m5086l(list.get(2), Integer.TYPE) && t11.m5086l(list.get(3), Long.TYPE));
            case 15:
                jg3 jg3Var4 = (jg3) obj;
                a83 a83Var10 = a83.f116a;
                r90 r90Var = r90.f9443d;
                jg3Var4.getClass();
                try {
                    r90Var.getClass();
                    r90.m4414q(jg3Var4);
                    x92Var = a83Var10;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                Throwable thM6237a = y92.m6237a(x92Var);
                if (thM6237a != null) {
                    r90Var.getClass();
                    hg3.m2166d(r90.f9447h, "Unable to handle contact ID entry click: ".concat(fg1.m1624Q(thM6237a)));
                }
                return a83Var10;
            case 16:
                ((String) obj).getClass();
                return a83.f116a;
            case 17:
                jg3 jg3Var5 = (jg3) obj;
                a83 a83Var11 = a83.f116a;
                w90 w90Var = w90.f12410d;
                jg3Var5.getClass();
                try {
                    w90Var.getClass();
                    w90.m5861q(jg3Var5);
                    x92Var2 = a83Var11;
                } catch (Throwable th2) {
                    x92Var2 = new x92(th2);
                }
                Throwable thM6237a2 = y92.m6237a(x92Var2);
                if (thM6237a2 != null) {
                    w90Var.getClass();
                    hg3.m2166d(w90.f12414h, "Unable to display message details: ".concat(fg1.m1624Q(thM6237a2)));
                }
                return a83Var11;
            case 18:
                jg3 jg3Var6 = (jg3) obj;
                jg3Var6.getClass();
                je0 je0Var = je0.f4991d;
                Object result = jg3Var6.f5028a.getResult();
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
                jg3Var6.m2497b(bitmapCreateBitmap);
                return a83.f116a;
            case 19:
                dj0 dj0Var7 = (dj0) obj;
                dj0Var7.getClass();
                dj0Var7.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.sdk.platformtools"});
                yg1 yg1Var7 = new yg1();
                yg1Var7.m6277j0("getRoundedCornerBitmap bitmap recycle %s");
                yg1Var7.m6271d0(5);
                a83 a83Var12 = a83.f116a;
                dj0Var7.f2078u = yg1Var7;
                return a83Var12;
            case AIChatConfig.MaxContextRounds /* 20 */:
                d31 d31Var = (d31) obj;
                d31Var.getClass();
                d31Var.f1849c = true;
                return a83.f116a;
            case 21:
                jg3 jg3Var7 = (jg3) obj;
                jg3Var7.getClass();
                jg3Var7.m2497b(Boolean.TRUE);
                return a83.f116a;
            case 22:
                jg3 jg3Var8 = (jg3) obj;
                jg3Var8.getClass();
                jg3Var8.m2497b(Boolean.TRUE);
                return a83.f116a;
            case 23:
                dj0 dj0Var8 = (dj0) obj;
                dj0Var8.getClass();
                yg1 yg1Var8 = new yg1();
                yg1Var8.m6271d0(3);
                yg1Var8.m6277j0("MicroMsg.CgiCheckLoginAsPad", "/cgi-bin/micromsg-bin/checkloginaspad");
                a83 a83Var13 = a83.f116a;
                dj0Var8.f2078u = yg1Var8;
                return a83Var13;
            case 24:
                a83 a83Var14 = a83.f116a;
                dj0 dj0Var9 = (dj0) obj;
                dj0Var9.getClass();
                dj0Var9.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.ui"});
                yg1 yg1Var9 = new yg1();
                yg1.m6269c0(yg1Var9, 9);
                yg1Var9.m6271d0(0);
                yg1Var9.m6277j0("royole", "tecno", "ro.os_foldable_screen_support");
                cls = Boolean.class;
                Class<Boolean> clsM3691A = p40.m3691A(d72.m967a(cls));
                yg1Var9.m6273f0(clsM3691A != null ? clsM3691A : Boolean.class);
                dj0Var9.f2078u = yg1Var9;
                return a83Var14;
            case 25:
                synchronized (ds2.f2181c) {
                    List list2 = ds2.f2187i;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((in0) list2.get(i)).mo5j(obj);
                    }
                }
                return a83.f116a;
            case 26:
                Context context = (Context) obj;
                context.getClass();
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return imageView;
            case 27:
                C0030at c0030at3 = (C0030at) obj;
                c0030at3.getClass();
                c0030at3.m271c0("MicroMsg.ConfigStorageLogic", "get userinfo fail");
                return a83.f116a;
            case 28:
                cj0 cj0Var2 = (cj0) obj;
                cj0Var2.getClass();
                cj0Var2.m845c0(new C0251gs(27));
                return a83.f116a;
            default:
                cj0 cj0Var3 = (cj0) obj;
                cj0Var3.getClass();
                C0030at c0030at4 = new C0030at();
                c0030at4.m272d0("MicroMsg.ImgUpload.MsgImgFeatureService", "computePHash fileNotExist:");
                a83 a83Var15 = a83.f116a;
                cj0Var3.f1585u = c0030at4;
                return a83Var15;
        }
    }
}

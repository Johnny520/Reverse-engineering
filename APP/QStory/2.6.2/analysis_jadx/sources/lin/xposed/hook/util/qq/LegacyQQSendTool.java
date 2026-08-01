package lin.xposed.hook.util.qq;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.bumptech.glide.AbstractC3056;
import io.ktor.client.plugins.AbstractC3932;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.UUID;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p000.AbstractC6087;
import p010.AbstractC6157;
import p032.AbstractC6314;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p035.AbstractC6340;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class LegacyQQSendTool {
    static String TAG = AbstractC3056.m6668(-3937658684579251623L);

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class MsgBuilder {
        public static Object builderPic(Object obj, String str) {
            try {
                Object objInvoke = AbstractC6314.m11815(AbstractC6318.m11838(AbstractC3056.m6668(-3937642196199802279L)), AbstractC6318.m11838(AbstractC3056.m6668(-3937588625072719271L)), null, new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937566175278663079L)), AbstractC6318.m11838(AbstractC3056.m6668(-3937591309427279271L)), String.class}).invoke(null, QQSessionUtils.LegacyQQ.getAppInterface(), obj, str);
                AbstractC6317.m11837(objInvoke, AbstractC3056.m6668(-3937641959976600999L), AbstractC8189.m13681(new File(str)));
                AbstractC6317.m11837(objInvoke, AbstractC3056.m6668(-3937642011516208551L), AbstractC8189.m13681(new File(str)) + AbstractC3056.m6668(-3937561197411567015L));
                AbstractC6317.m11837(objInvoke, AbstractC3056.m6668(-3937641998631306663L), UUID.randomUUID().toString());
                AbstractC6314.m11818(Void.TYPE, AbstractC3056.m6668(-3937641904142026151L), objInvoke);
                return objInvoke;
            } catch (Exception e) {
                C5919.m11252(e);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String checkAndGetCastPic(String str) {
            File file = new File(str);
            if (file.exists() && file.length() > 128) {
                try {
                    byte[] bArr = new byte[4];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                    if (bArr[0] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70) {
                        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
                        String str2 = AbstractC3932.m8321(AbstractC3056.m6668(-3937590274340160935L)) + AbstractC3056.m6668(-3937561854541563303L) + AbstractC8189.m13681(file);
                        bitmapDecodeFile.compress(Bitmap.CompressFormat.PNG, 100, new BufferedOutputStream(new FileOutputStream(str2)));
                        if (new File(str2).length() > 128) {
                            return str2;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return str;
        }
    }

    public static void sendByPicPath(Object obj, String str) {
        sendPic(obj, MsgBuilder.builderPic(obj, MsgBuilder.checkAndGetCastPic(str)));
    }

    public static void sendPic(Object obj, Object obj2) {
        Method methodM11815 = AbstractC6314.m11815(AbstractC6318.m11838(AbstractC3056.m6668(-3937642196199802279L)), Void.TYPE, null, new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937566175278663079L)), AbstractC6318.m11838(AbstractC3056.m6668(-3937591309427279271L)), AbstractC6318.m11838(AbstractC3056.m6668(-3937641560544642471L)), Integer.TYPE});
        if (methodM11815 == null) {
            AbstractC6157.m11575(new NullPointerException(AbstractC3056.m6668(-3937641457465427367L)));
        }
        try {
            methodM11815.invoke(null, QQSessionUtils.LegacyQQ.getAppInterface(), obj, obj2, 0);
        } catch (Exception e) {
            AbstractC6157.m11573(e, TAG);
        }
    }

    public static void sendTextMsg(Object obj, String str, ArrayList arrayList) {
        try {
            AbstractC6314.m11822(AbstractC3056.m6668(-3937642196199802279L), null, Void.TYPE, new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937566175278663079L)), Context.class, AbstractC6318.m11838(AbstractC3056.m6668(-3937591309427279271L)), String.class, ArrayList.class}).invoke(null, QQSessionUtils.LegacyQQ.getAppInterface(), AbstractC6340.f17460, obj, str, arrayList);
        } catch (Exception e) {
            AbstractC6157.m11573(e, TAG);
        }
    }

    public static void sendVoice(Object obj, String str) {
        try {
            if (!str.contains(AbstractC3056.m6668(-3937658929392387495L) + QQEnvTool.getCurrentUin())) {
                String str2 = Environment.getExternalStorageDirectory() + AbstractC3056.m6668(-3937618457915557287L) + QQEnvTool.getCurrentUin() + AbstractC3056.m6668(-3937618307591701927L) + new File(str).getName();
                AbstractC0455.m1170(str, str2);
                str = str2;
            }
            AbstractC6314.m11815(AbstractC6318.m11838(AbstractC3056.m6668(-3937642196199802279L)), Long.TYPE, null, new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937566175278663079L)), AbstractC6318.m11838(AbstractC3056.m6668(-3937591309427279271L)), String.class}).invoke(null, QQSessionUtils.LegacyQQ.getAppInterface(), obj, str);
        } catch (Exception e) {
            AbstractC6157.m11573(e, TAG);
        }
    }

    public static void setPicText(Object obj, String str) {
        try {
            Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937641839717516711L));
            Object objM11831 = AbstractC6317.m11831(clsM11838, AbstractC3056.m6668(-3937641728048367015L), obj);
            if (objM11831 == null) {
                AbstractC6317.m11837(obj, AbstractC3056.m6668(-3937641728048367015L), AbstractC6087.m11392(clsM11838, new Object[0]));
                objM11831 = AbstractC6317.m11831(clsM11838, AbstractC3056.m6668(-3937641728048367015L), obj);
            }
            AbstractC6317.m11837(objM11831, AbstractC3056.m6668(-3937641680803726759L), str);
        } catch (Exception e) {
            C5919.m11252(e);
        }
    }

    public static void sendReplyMsg(Object obj, Object obj2) {
    }
}

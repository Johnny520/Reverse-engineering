package lin.xposed.hook.util.qq;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import com.alibaba.fastjson2.AbstractC2905;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3065;
import io.ktor.client.plugins.AbstractC3933;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.reflect.jvm.internal.AbstractC5062;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p010.AbstractC6188;
import p033.AbstractC6333;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p036.AbstractC6358;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class LegacyQQSendTool {
    static String TAG = AbstractC8405.m13972(924);

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class MsgBuilder {
        public static Object builderPic(Object obj, String str) {
            try {
                Object objInvoke = AbstractC6333.m11843(AbstractC6337.m11866(AbstractC8405.m13972(915)), AbstractC6337.m11866(AbstractC8405.m13972(Opcodes.OR_INT_LIT16)), null, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(122)), AbstractC6337.m11866(AbstractC8405.m13972(346)), String.class}).invoke(null, QQSessionUtils.LegacyQQ.getAppInterface(), obj, str);
                AbstractC6336.m11865(objInvoke, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵呜~喵呜喵喵呜呜呜呜"), AbstractC3065.m6824(new File(str)));
                AbstractC6336.m11865(objInvoke, AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵喵呜呜~喵喵喵喵呜呜喵喵"), AbstractC3065.m6824(new File(str)) + AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜呜呜"));
                AbstractC6336.m11865(objInvoke, AbstractC8405.m13972(916), UUID.randomUUID().toString());
                AbstractC6333.m11846(Void.TYPE, AbstractC8405.m13972(917), objInvoke);
                return objInvoke;
            } catch (Exception e) {
                C5925.m11313(e);
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
                        String str2 = AbstractC3933.m8311(AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜喵呜")) + AbstractC8405.m13973("喵呜喵呜呜呜喵喵") + AbstractC3065.m6824(file);
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
        Method methodM11843 = AbstractC6333.m11843(AbstractC6337.m11866(AbstractC8405.m13972(915)), Void.TYPE, null, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(122)), AbstractC6337.m11866(AbstractC8405.m13972(346)), AbstractC6337.m11866(AbstractC8405.m13972(921)), Integer.TYPE});
        if (methodM11843 == null) {
            AbstractC6188.m11606(new NullPointerException(AbstractC8405.m13972(922)));
        }
        try {
            methodM11843.invoke(null, QQSessionUtils.LegacyQQ.getAppInterface(), obj, obj2, 0);
        } catch (Exception e) {
            AbstractC6188.m11604(e, TAG);
        }
    }

    public static void sendTextMsg(Object obj, String str, ArrayList arrayList) {
        try {
            AbstractC6333.m11850(AbstractC8405.m13972(915), null, Void.TYPE, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(122)), Context.class, AbstractC6337.m11866(AbstractC8405.m13972(346)), String.class, ArrayList.class}).invoke(null, QQSessionUtils.LegacyQQ.getAppInterface(), AbstractC6358.f17507, obj, str, arrayList);
        } catch (Exception e) {
            AbstractC6188.m11604(e, TAG);
        }
    }

    public static void sendVoice(Object obj, String str) {
        try {
            if (!str.contains(AbstractC8405.m13972(923) + QQEnvTool.getCurrentUin())) {
                String str2 = Environment.getExternalStorageDirectory() + AbstractC8405.m13972(597) + QQEnvTool.getCurrentUin() + AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜呜喵喵~喵呜喵喵呜喵呜喵") + new File(str).getName();
                AbstractC5062.m10050(str, str2);
                str = str2;
            }
            AbstractC6333.m11843(AbstractC6337.m11866(AbstractC8405.m13972(915)), Long.TYPE, null, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(122)), AbstractC6337.m11866(AbstractC8405.m13972(346)), String.class}).invoke(null, QQSessionUtils.LegacyQQ.getAppInterface(), obj, str);
        } catch (Exception e) {
            AbstractC6188.m11604(e, TAG);
        }
    }

    public static void setPicText(Object obj, String str) {
        try {
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(918));
            Object objM11859 = AbstractC6336.m11859(clsM11866, AbstractC8405.m13972(919), obj);
            if (objM11859 == null) {
                AbstractC6336.m11865(obj, AbstractC8405.m13972(919), AbstractC2905.m6286(clsM11866, new Object[0]));
                objM11859 = AbstractC6336.m11859(clsM11866, AbstractC8405.m13972(919), obj);
            }
            AbstractC6336.m11865(objM11859, AbstractC8405.m13972(920), str);
        } catch (Exception e) {
            C5925.m11313(e);
        }
    }

    public static void sendReplyMsg(Object obj, Object obj2) {
    }
}

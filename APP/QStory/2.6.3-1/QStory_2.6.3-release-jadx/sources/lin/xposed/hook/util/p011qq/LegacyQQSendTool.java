package lin.xposed.hook.util.p011qq;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import com.alibaba.fastjson2.AbstractC3738;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3897;
import io.ktor.client.plugins.AbstractC4765;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.reflect.jvm.internal.AbstractC5894;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import p026.AbstractC7017;
import p049.AbstractC7162;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p052.AbstractC7187;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class LegacyQQSendTool {
    static String TAG = AbstractC9234.m14531(924);

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class MsgBuilder {
        public static Object builderPic(Object obj, String str) {
            try {
                Object objInvoke = AbstractC7162.m12402(AbstractC7166.m12425(AbstractC9234.m14531(915)), AbstractC7166.m12425(AbstractC9234.m14531(Opcodes.OR_INT_LIT16)), null, new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(122)), AbstractC7166.m12425(AbstractC9234.m14531(346)), String.class}).invoke(null, QQSessionUtils.LegacyQQ.getAppInterface(), obj, str);
                AbstractC7165.m12424(objInvoke, AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵呜~喵呜喵喵呜呜呜呜"), AbstractC3897.m7384(new File(str)));
                AbstractC7165.m12424(objInvoke, AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵喵呜呜~喵喵喵喵呜呜喵喵"), AbstractC3897.m7384(new File(str)) + AbstractC9234.m14532("喵呜喵呜呜呜喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜呜呜"));
                AbstractC7165.m12424(objInvoke, AbstractC9234.m14531(916), UUID.randomUUID().toString());
                AbstractC7162.m12405(Void.TYPE, AbstractC9234.m14531(917), objInvoke);
                return objInvoke;
            } catch (Exception e) {
                C6755.m11872(e);
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
                        String str2 = AbstractC4765.m8870(AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜喵呜")) + AbstractC9234.m14532("喵呜喵呜呜呜喵喵") + AbstractC3897.m7384(file);
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
        Method methodM12402 = AbstractC7162.m12402(AbstractC7166.m12425(AbstractC9234.m14531(915)), Void.TYPE, null, new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(122)), AbstractC7166.m12425(AbstractC9234.m14531(346)), AbstractC7166.m12425(AbstractC9234.m14531(921)), Integer.TYPE});
        if (methodM12402 == null) {
            AbstractC7017.m12165(new NullPointerException(AbstractC9234.m14531(922)));
        }
        try {
            methodM12402.invoke(null, QQSessionUtils.LegacyQQ.getAppInterface(), obj, obj2, 0);
        } catch (Exception e) {
            AbstractC7017.m12163(e, TAG);
        }
    }

    public static void sendTextMsg(Object obj, String str, ArrayList arrayList) {
        try {
            AbstractC7162.m12409(AbstractC9234.m14531(915), null, Void.TYPE, new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(122)), Context.class, AbstractC7166.m12425(AbstractC9234.m14531(346)), String.class, ArrayList.class}).invoke(null, QQSessionUtils.LegacyQQ.getAppInterface(), AbstractC7187.f17852, obj, str, arrayList);
        } catch (Exception e) {
            AbstractC7017.m12163(e, TAG);
        }
    }

    public static void sendVoice(Object obj, String str) {
        try {
            if (!str.contains(AbstractC9234.m14531(923) + QQEnvTool.getCurrentUin())) {
                String str2 = Environment.getExternalStorageDirectory() + AbstractC9234.m14531(597) + QQEnvTool.getCurrentUin() + AbstractC9234.m14532("喵呜喵呜呜呜喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜呜喵喵~喵呜喵喵呜喵呜喵") + new File(str).getName();
                AbstractC5894.m10609(str, str2);
                str = str2;
            }
            AbstractC7162.m12402(AbstractC7166.m12425(AbstractC9234.m14531(915)), Long.TYPE, null, new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(122)), AbstractC7166.m12425(AbstractC9234.m14531(346)), String.class}).invoke(null, QQSessionUtils.LegacyQQ.getAppInterface(), obj, str);
        } catch (Exception e) {
            AbstractC7017.m12163(e, TAG);
        }
    }

    public static void setPicText(Object obj, String str) {
        try {
            Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(918));
            Object objM12418 = AbstractC7165.m12418(clsM12425, AbstractC9234.m14531(919), obj);
            if (objM12418 == null) {
                AbstractC7165.m12424(obj, AbstractC9234.m14531(919), AbstractC3738.m6846(clsM12425, new Object[0]));
                objM12418 = AbstractC7165.m12418(clsM12425, AbstractC9234.m14531(919), obj);
            }
            AbstractC7165.m12424(objM12418, AbstractC9234.m14531(920), str);
        } catch (Exception e) {
            C6755.m11872(e);
        }
    }

    public static void sendReplyMsg(Object obj, Object obj2) {
    }
}

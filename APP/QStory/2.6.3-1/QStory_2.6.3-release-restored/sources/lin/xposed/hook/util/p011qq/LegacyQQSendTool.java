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
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class LegacyQQSendTool {
    static String TAG = "QQSendUtils";

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class MsgBuilder {
        public static Object builderPic(Object obj, String str) {
            try {
                Object objInvoke = AbstractC7162.m12402(AbstractC7166.m12425("com.tencent.mobileqq.activity.ChatActivityFacade"), AbstractC7166.m12425("com.tencent.mobileqq.data.ChatMessage"), null, new Class[]{AbstractC7166.m12425("com.tencent.mobileqq.app.QQAppInterface"), AbstractC7166.m12425("com.tencent.mobileqq.activity.aio.SessionInfo"), String.class}).invoke(null, QQSessionUtils.LegacyQQ.getAppInterface(), obj, str);
                AbstractC7165.m12424(objInvoke, "md5", AbstractC3897.m7384(new File(str)));
                AbstractC7165.m12424(objInvoke, "uuid", AbstractC3897.m7384(new File(str)) + ".jpg");
                AbstractC7165.m12424(objInvoke, "localUUID", UUID.randomUUID().toString());
                AbstractC7162.m12405(Void.TYPE, "prewrite", objInvoke);
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
                        String str2 = AbstractC4765.m8870("img") + "/" + AbstractC3897.m7384(file);
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
        Method methodM12402 = AbstractC7162.m12402(AbstractC7166.m12425("com.tencent.mobileqq.activity.ChatActivityFacade"), Void.TYPE, null, new Class[]{AbstractC7166.m12425("com.tencent.mobileqq.app.QQAppInterface"), AbstractC7166.m12425("com.tencent.mobileqq.activity.aio.SessionInfo"), AbstractC7166.m12425("com.tencent.mobileqq.data.MessageForPic"), Integer.TYPE});
        if (methodM12402 == null) {
            AbstractC7017.m12165(new NullPointerException("find sendPic method == null"));
        }
        try {
            methodM12402.invoke(null, QQSessionUtils.LegacyQQ.getAppInterface(), obj, obj2, 0);
        } catch (Exception e) {
            AbstractC7017.m12163(e, TAG);
        }
    }

    public static void sendTextMsg(Object obj, String str, ArrayList arrayList) {
        try {
            AbstractC7162.m12409("com.tencent.mobileqq.activity.ChatActivityFacade", null, Void.TYPE, new Class[]{AbstractC7166.m12425("com.tencent.mobileqq.app.QQAppInterface"), Context.class, AbstractC7166.m12425("com.tencent.mobileqq.activity.aio.SessionInfo"), String.class, ArrayList.class}).invoke(null, QQSessionUtils.LegacyQQ.getAppInterface(), AbstractC7187.f17852, obj, str, arrayList);
        } catch (Exception e) {
            AbstractC7017.m12163(e, TAG);
        }
    }

    public static void sendVoice(Object obj, String str) {
        try {
            if (!str.contains("com.tencent.mobileqq/Tencent/MobileQQ/" + QQEnvTool.getCurrentUin())) {
                String str2 = Environment.getExternalStorageDirectory() + "/Android/data/com.tencent.mobileqq/Tencent/MobileQQ/" + QQEnvTool.getCurrentUin() + "/ptt/" + new File(str).getName();
                AbstractC5894.m10609(str, str2);
                str = str2;
            }
            AbstractC7162.m12402(AbstractC7166.m12425("com.tencent.mobileqq.activity.ChatActivityFacade"), Long.TYPE, null, new Class[]{AbstractC7166.m12425("com.tencent.mobileqq.app.QQAppInterface"), AbstractC7166.m12425("com.tencent.mobileqq.activity.aio.SessionInfo"), String.class}).invoke(null, QQSessionUtils.LegacyQQ.getAppInterface(), obj, str);
        } catch (Exception e) {
            AbstractC7017.m12163(e, TAG);
        }
    }

    public static void setPicText(Object obj, String str) {
        try {
            Class clsM12425 = AbstractC7166.m12425("com.tencent.mobileqq.data.PicMessageExtraData");
            Object objM12418 = AbstractC7165.m12418(clsM12425, "picExtraData", obj);
            if (objM12418 == null) {
                AbstractC7165.m12424(obj, "picExtraData", AbstractC3738.m6846(clsM12425, new Object[0]));
                objM12418 = AbstractC7165.m12418(clsM12425, "picExtraData", obj);
            }
            AbstractC7165.m12424(objM12418, "textSummary", str);
        } catch (Exception e) {
            C6755.m11872(e);
        }
    }

    public static void sendReplyMsg(Object obj, Object obj2) {
    }
}

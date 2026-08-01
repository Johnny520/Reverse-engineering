package lin.xposed.hook.util.qq;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Stack;
import p000.AbstractC6087;
import p010.AbstractC6157;
import p032.AbstractC6314;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p035.AbstractC6340;
import p037.C6362;
import p053.AbstractC6560;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class QQSessionUtils {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    /* JADX INFO: loaded from: classes.dex */
    public static class LegacyQQ {
        public static Parcelable createSessionInfo(String str, int i) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            parcelObtain.writeString(null);
            parcelObtain.writeString(null);
            parcelObtain.writeString(null);
            parcelObtain.writeInt(3999);
            parcelObtain.writeBundle(null);
            parcelObtain.setDataPosition(0);
            try {
                try {
                    Constructor declaredConstructor = AbstractC6318.m11838("com.tencent.mobileqq.activity.aio.SessionInfo").getDeclaredConstructor(Parcel.class);
                    declaredConstructor.setAccessible(true);
                    return (Parcelable) declaredConstructor.newInstance(parcelObtain);
                } catch (ReflectiveOperationException e) {
                    throw new RuntimeException(e);
                }
            } finally {
                parcelObtain.recycle();
            }
        }

        public static Object getAppInterface() {
            return C6362.f17489;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class QSContact {
        public int chatType;
        public String peerUid;

        public QSContact(int i, String str) {
            this.chatType = i;
            this.peerUid = str;
        }
    }

    public static QSContact AIOContactToQSContact(Object obj) {
        int i = AbstractC6340.f17461;
        Class cls = Integer.TYPE;
        if (i >= 9898) {
            String str = (String) AbstractC6317.m11831(String.class, "e", obj);
            int iIntValue = ((Integer) AbstractC6317.m11831(cls, "d", obj)).intValue();
            return new QSContact(iIntValue, str);
        }
        if (i >= 8496) {
            String str2 = (String) AbstractC6317.m11831(String.class, "f", obj);
            int iIntValue2 = ((Integer) AbstractC6317.m11831(cls, "e", obj)).intValue();
            return new QSContact(iIntValue2, str2);
        }
        String str3 = (String) AbstractC6317.m11831(String.class, "f", obj);
        int iIntValue3 = ((Integer) AbstractC6317.m11831(cls, "e", obj)).intValue();
        return new QSContact(iIntValue3, str3);
    }

    public static Object getContactFromAIOContact(Object obj) {
        int i = AbstractC6340.f17461;
        Class cls = Integer.TYPE;
        if (i >= 9898) {
            String str = (String) AbstractC6317.m11831(String.class, "e", obj);
            int iIntValue = ((Integer) AbstractC6317.m11831(cls, "d", obj)).intValue();
            String str2 = (String) AbstractC6317.m11831(String.class, "f", obj);
            return QQNT.getContact(iIntValue, str, str2);
        }
        if (i >= 8496) {
            String str3 = (String) AbstractC6317.m11831(String.class, "f", obj);
            int iIntValue2 = ((Integer) AbstractC6317.m11831(cls, "e", obj)).intValue();
            String str4 = (String) AbstractC6317.m11831(String.class, "i", obj);
            return QQNT.getContact(iIntValue2, str3, str4);
        }
        String str5 = (String) AbstractC6317.m11831(String.class, "f", obj);
        int iIntValue3 = ((Integer) AbstractC6317.m11831(cls, "e", obj)).intValue();
        String str6 = (String) AbstractC6317.m11831(String.class, "g", obj);
        return QQNT.getContact(iIntValue3, str5, str6);
    }

    public static Object getCurrentContact() {
        Object obj = C6362.f17491;
        return AbstractC6560.m12011() ? getContactFromAIOContact(obj) : obj;
    }

    public static Object getCurrentSessionInfo() {
        Stack stack = C6362.f17492;
        return AbstractC6560.m12011() ? C6362.f17491 : C6362.f17490;
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class QQNT {
        public static Object getAIOContact(int i, String str, String str2, String str3) {
            try {
                Class<?> aIOContactClass = CommonQQMethodTools.getAIOContactClass();
                Class[] clsArr = {Integer.TYPE, String.class, String.class, String.class};
                Integer numValueOf = Integer.valueOf(i);
                if (i != 2 && i != 4 && isNumericUin(str)) {
                    str = QQEnvTool.getUidFromUin(str);
                }
                return AbstractC6087.m11389(new Object[]{numValueOf, str, str2, str3}, clsArr, aIOContactClass);
            } catch (Exception e) {
                C5919.m11252(e);
                return null;
            }
        }

        public static Object getContact(int i, String str, String str2) {
            Class clsM11838 = AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.Contact");
            if (i != 2 && i != 4) {
                try {
                    if (isNumericUin(str)) {
                        str = QQEnvTool.getUidFromUin(str);
                    }
                } catch (Exception e) {
                    C5919.m11252(e);
                    return null;
                }
            }
            return AbstractC6087.m11389(new Object[]{Integer.valueOf(i), str, str2}, new Class[]{Integer.TYPE, String.class, String.class}, clsM11838);
        }

        public static Object getFriendContact(String str) {
            return getContact(1, str);
        }

        public static String getFriendNickName(String str, String str2) {
            Class clsM11838 = AbstractC6318.m11838("com.qwallet.temp.IContactUtils");
            Object qRouteApi = QQEnvTool.getQRouteApi(clsM11838);
            C6316 c6316M11826 = C6316.m11826(clsM11838);
            String strM6668 = "getFriendNickName";
            C1245 c1245 = c6316M11826.f17409;
            c1245.f3617 = strM6668;
            c1245.f3618 = new Class[]{String.class, String.class};
            c1245.f3616 = String.class;
            return (String) c6316M11826.m11828(qRouteApi, str, str2);
        }

        public static Object getGroupContact(String str) {
            return getContact(2, str);
        }

        private static boolean isNumericUin(String str) {
            char cCharAt;
            if (str == null || str.isEmpty() || str.length() > 10) {
                return false;
            }
            int length = str.length();
            do {
                length--;
                if (length < 0) {
                    return true;
                }
                cCharAt = str.charAt(length);
                if (cCharAt < '0') {
                    break;
                }
            } while (cCharAt <= '9');
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object lambda$prepareTroopMemberStrangerTempChat$0(Object obj, Method method, Object[] objArr) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            String str = (String) objArr[1];
            if (iIntValue == 0) {
                return null;
            }
            AbstractC6157.m11573(str, "prepareTroopMemberStrangerTempChat");
            return null;
        }

        public static void prepareTroopMemberStrangerTempChat(String str, String str2) {
            try {
                Object msgServiceOfKernel = QQServiceTool.getMsgServiceOfKernel();
                Class clsM11838 = AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.TempChatPrepareInfo");
                AbstractC6314.m11819(msgServiceOfKernel, "prepareTempChat", Void.TYPE, new Class[]{AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.TempChatPrepareInfo"), AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.IOperateCallback")}, AbstractC6087.m11389(new Object[]{100, str2, "", str, new byte[0], QQEnvTool.getUidFromUin(QQEnvTool.getCurrentUin()), "", AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.TempChatGameSession").newInstance()}, new Class[]{Integer.TYPE, String.class, String.class, String.class, byte[].class, String.class, String.class, AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.TempChatGameSession")}, clsM11838), Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.IOperateCallback")}, new C5556(1)));
            } catch (Exception e) {
                C5919.m11252(e);
            }
        }

        public static Object getContact(int i, String str) {
            return getContact(i, str, "");
        }
    }
}

package lin.xposed.hook.util.qq;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C1245;
import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Stack;
import p010.AbstractC6188;
import p033.AbstractC6333;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p036.AbstractC6358;
import p038.C6379;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQSessionUtils {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
                    Constructor declaredConstructor = AbstractC6337.m11866(AbstractC8405.m13972(346)).getDeclaredConstructor(Parcel.class);
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
            return C6379.f17535;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class QSContact {
        public int chatType;
        public String peerUid;

        public QSContact(int i, String str) {
            this.chatType = i;
            this.peerUid = str;
        }
    }

    public static QSContact AIOContactToQSContact(Object obj) {
        int i = AbstractC6358.f17508;
        Class cls = Integer.TYPE;
        if (i >= 9898) {
            String str = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜喵呜呜喵"), obj);
            int iIntValue = ((Integer) AbstractC6336.m11859(cls, AbstractC8405.m13973("喵喵喵呜喵呜呜呜"), obj)).intValue();
            return new QSContact(iIntValue, str);
        }
        if (i >= 8496) {
            String str2 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜喵呜喵呜"), obj);
            int iIntValue2 = ((Integer) AbstractC6336.m11859(cls, AbstractC8405.m13973("喵喵喵呜喵呜呜喵"), obj)).intValue();
            return new QSContact(iIntValue2, str2);
        }
        String str3 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜喵呜喵呜"), obj);
        int iIntValue3 = ((Integer) AbstractC6336.m11859(cls, AbstractC8405.m13973("喵喵喵呜喵呜呜喵"), obj)).intValue();
        return new QSContact(iIntValue3, str3);
    }

    public static Object getContactFromAIOContact(Object obj) {
        int i = AbstractC6358.f17508;
        Class cls = Integer.TYPE;
        if (i >= 9898) {
            String str = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜喵呜呜喵"), obj);
            int iIntValue = ((Integer) AbstractC6336.m11859(cls, AbstractC8405.m13973("喵喵喵呜喵呜呜呜"), obj)).intValue();
            String str2 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜喵呜喵呜"), obj);
            return QQNT.getContact(iIntValue, str, str2);
        }
        if (i >= 8496) {
            String str3 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜喵呜喵呜"), obj);
            int iIntValue2 = ((Integer) AbstractC6336.m11859(cls, AbstractC8405.m13973("喵喵喵呜喵呜呜喵"), obj)).intValue();
            String str4 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜呜喵呜喵"), obj);
            return QQNT.getContact(iIntValue2, str3, str4);
        }
        String str5 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜喵呜喵呜"), obj);
        int iIntValue3 = ((Integer) AbstractC6336.m11859(cls, AbstractC8405.m13973("喵喵喵呜喵呜呜喵"), obj)).intValue();
        String str6 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜喵呜喵喵"), obj);
        return QQNT.getContact(iIntValue3, str5, str6);
    }

    public static Object getCurrentContact() {
        Object obj = C6379.f17537;
        return AbstractC3056.m6696() ? getContactFromAIOContact(obj) : obj;
    }

    public static Object getCurrentSessionInfo() {
        Stack stack = C6379.f17538;
        return AbstractC3056.m6696() ? C6379.f17537 : C6379.f17536;
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class QQNT {
        public static Object getAIOContact(int i, String str, String str2, String str3) {
            try {
                Class<?> aIOContactClass = CommonQQMethodTools.getAIOContactClass();
                Class[] clsArr = {Integer.TYPE, String.class, String.class, String.class};
                Integer numValueOf = Integer.valueOf(i);
                if (i != 2 && i != 4 && isNumericUin(str)) {
                    str = QQEnvTool.getUidFromUin(str);
                }
                return AbstractC2905.m6285(new Object[]{numValueOf, str, str2, str3}, clsArr, aIOContactClass);
            } catch (Exception e) {
                C5925.m11313(e);
                return null;
            }
        }

        public static Object getContact(int i, String str, String str2) {
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(133));
            if (i != 2 && i != 4) {
                try {
                    if (isNumericUin(str)) {
                        str = QQEnvTool.getUidFromUin(str);
                    }
                } catch (Exception e) {
                    C5925.m11313(e);
                    return null;
                }
            }
            return AbstractC2905.m6285(new Object[]{Integer.valueOf(i), str, str2}, new Class[]{Integer.TYPE, String.class, String.class}, clsM11866);
        }

        public static Object getFriendContact(String str) {
            return getContact(1, str);
        }

        public static String getFriendNickName(String str, String str2) {
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(1018));
            Object qRouteApi = QQEnvTool.getQRouteApi(clsM11866);
            C6335 c6335M11854 = C6335.m11854(clsM11866);
            String strM13972 = AbstractC8405.m13972(903);
            C1245 c1245 = c6335M11854.f17458;
            c1245.f3618 = strM13972;
            c1245.f3619 = new Class[]{String.class, String.class};
            c1245.f3617 = String.class;
            return (String) c6335M11854.m11856(qRouteApi, str, str2);
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
            AbstractC6188.m11604(str, AbstractC8405.m13972(1019));
            return null;
        }

        public static void prepareTroopMemberStrangerTempChat(String str, String str2) {
            try {
                Object msgServiceOfKernel = QQServiceTool.getMsgServiceOfKernel();
                Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(1015));
                AbstractC6333.m11847(msgServiceOfKernel, AbstractC8405.m13972(1017), Void.TYPE, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(1015)), AbstractC6337.m11866(AbstractC8405.m13972(136))}, AbstractC2905.m6285(new Object[]{100, str2, "", str, new byte[0], QQEnvTool.getUidFromUin(QQEnvTool.getCurrentUin()), "", AbstractC6337.m11866(AbstractC8405.m13972(1016)).newInstance()}, new Class[]{Integer.TYPE, String.class, String.class, String.class, byte[].class, String.class, String.class, AbstractC6337.m11866(AbstractC8405.m13972(1016))}, clsM11866), Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(136))}, new C5557(1)));
            } catch (Exception e) {
                C5925.m11313(e);
            }
        }

        public static Object getContact(int i, String str) {
            return getContact(i, str, "");
        }
    }
}

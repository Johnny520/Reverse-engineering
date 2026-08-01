package lin.xposed.hook.util.p011qq;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C2080;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3888;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Stack;
import p026.AbstractC7017;
import p049.AbstractC7162;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p052.AbstractC7187;
import p054.C7208;
import top.suzhelan.qstory.hook.item.C6755;

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
                    Constructor declaredConstructor = AbstractC7166.m12425("com.tencent.mobileqq.activity.aio.SessionInfo").getDeclaredConstructor(Parcel.class);
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
            return C7208.f17880;
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
        int i = AbstractC7187.f17853;
        Class cls = Integer.TYPE;
        if (i >= 9898) {
            String str = (String) AbstractC7165.m12418(String.class, "e", obj);
            int iIntValue = ((Integer) AbstractC7165.m12418(cls, "d", obj)).intValue();
            return new QSContact(iIntValue, str);
        }
        if (i >= 8496) {
            String str2 = (String) AbstractC7165.m12418(String.class, "f", obj);
            int iIntValue2 = ((Integer) AbstractC7165.m12418(cls, "e", obj)).intValue();
            return new QSContact(iIntValue2, str2);
        }
        String str3 = (String) AbstractC7165.m12418(String.class, "f", obj);
        int iIntValue3 = ((Integer) AbstractC7165.m12418(cls, "e", obj)).intValue();
        return new QSContact(iIntValue3, str3);
    }

    public static Object getContactFromAIOContact(Object obj) {
        int i = AbstractC7187.f17853;
        Class cls = Integer.TYPE;
        if (i >= 9898) {
            String str = (String) AbstractC7165.m12418(String.class, "e", obj);
            int iIntValue = ((Integer) AbstractC7165.m12418(cls, "d", obj)).intValue();
            String str2 = (String) AbstractC7165.m12418(String.class, "f", obj);
            return QQNT.getContact(iIntValue, str, str2);
        }
        if (i >= 8496) {
            String str3 = (String) AbstractC7165.m12418(String.class, "f", obj);
            int iIntValue2 = ((Integer) AbstractC7165.m12418(cls, "e", obj)).intValue();
            String str4 = (String) AbstractC7165.m12418(String.class, "i", obj);
            return QQNT.getContact(iIntValue2, str3, str4);
        }
        String str5 = (String) AbstractC7165.m12418(String.class, "f", obj);
        int iIntValue3 = ((Integer) AbstractC7165.m12418(cls, "e", obj)).intValue();
        String str6 = (String) AbstractC7165.m12418(String.class, "g", obj);
        return QQNT.getContact(iIntValue3, str5, str6);
    }

    public static Object getCurrentContact() {
        Object obj = C7208.f17882;
        return AbstractC3888.m7256() ? getContactFromAIOContact(obj) : obj;
    }

    public static Object getCurrentSessionInfo() {
        Stack stack = C7208.f17883;
        return AbstractC3888.m7256() ? C7208.f17882 : C7208.f17881;
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
                return AbstractC3738.m6845(new Object[]{numValueOf, str, str2, str3}, clsArr, aIOContactClass);
            } catch (Exception e) {
                C6755.m11872(e);
                return null;
            }
        }

        public static Object getContact(int i, String str, String str2) {
            Class clsM12425 = AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.Contact");
            if (i != 2 && i != 4) {
                try {
                    if (isNumericUin(str)) {
                        str = QQEnvTool.getUidFromUin(str);
                    }
                } catch (Exception e) {
                    C6755.m11872(e);
                    return null;
                }
            }
            return AbstractC3738.m6845(new Object[]{Integer.valueOf(i), str, str2}, new Class[]{Integer.TYPE, String.class, String.class}, clsM12425);
        }

        public static Object getFriendContact(String str) {
            return getContact(1, str);
        }

        public static String getFriendNickName(String str, String str2) {
            Class clsM12425 = AbstractC7166.m12425("com.qwallet.temp.IContactUtils");
            Object qRouteApi = QQEnvTool.getQRouteApi(clsM12425);
            C7164 c7164M12413 = C7164.m12413(clsM12425);
            String strM14531 = "getFriendNickName";
            C2080 c2080 = c7164M12413.f17803;
            c2080.f3963 = strM14531;
            c2080.f3964 = new Class[]{String.class, String.class};
            c2080.f3962 = String.class;
            return (String) c7164M12413.m12415(qRouteApi, str, str2);
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
            AbstractC7017.m12163(str, "prepareTroopMemberStrangerTempChat");
            return null;
        }

        public static void prepareTroopMemberStrangerTempChat(String str, String str2) {
            try {
                Object msgServiceOfKernel = QQServiceTool.getMsgServiceOfKernel();
                Class clsM12425 = AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.TempChatPrepareInfo");
                AbstractC7162.m12406(msgServiceOfKernel, "prepareTempChat", Void.TYPE, new Class[]{AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.TempChatPrepareInfo"), AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.IOperateCallback")}, AbstractC3738.m6845(new Object[]{100, str2, "", str, new byte[0], QQEnvTool.getUidFromUin(QQEnvTool.getCurrentUin()), "", AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.TempChatGameSession").newInstance()}, new Class[]{Integer.TYPE, String.class, String.class, String.class, byte[].class, String.class, String.class, AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.TempChatGameSession")}, clsM12425), Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.IOperateCallback")}, new C6388(1)));
            } catch (Exception e) {
                C6755.m11872(e);
            }
        }

        public static Object getContact(int i, String str) {
            return getContact(i, str, "");
        }
    }
}

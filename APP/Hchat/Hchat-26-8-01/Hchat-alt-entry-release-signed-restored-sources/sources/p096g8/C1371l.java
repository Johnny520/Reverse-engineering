package p096g8;

import gg.AbstractC1416l;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p009a9.C0031h;
import p089g1.C1275d;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.utils.KavaReflector;
import p125i8.C2005i;
import p183m8.C2815c;
import p218og.AbstractC3149m;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: g8.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1371l {

    /* JADX INFO: renamed from: a */
    public final DexFinder f4556a;

    /* JADX INFO: renamed from: b */
    public final C2815c f4557b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1371l(DexFinder dexFinder, C2815c c2815c, C1275d c1275d) {
        this.f4556a = dexFinder;
        this.f4557b = c2815c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m3740a(Class cls) {
        return AbstractC1416l.m3825a(cls, Integer.TYPE) || AbstractC1416l.m3825a(cls, Integer.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3741b(String str) {
        C2005i.m4939f("[WeChatVerifyUserApi] ".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r18v1, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3742c(String str, String str2, int i9, int i10) {
        int length;
        Object[] objArr;
        String string = AbstractC3149m.m6703R0(str).toString();
        String strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
        String str3 = string == null ? HttpUrl.FRAGMENT_ENCODE_SET : string;
        char c10 = 0;
        if (AbstractC3149m.m6721t0(str3)) {
            m3741b("通过好友申请失败: wxid为空");
            return false;
        }
        Class<?> cls = this.f4556a.verifyUserClass;
        if (cls == null) {
            m3741b("通过好友申请失败: verifyUserClass为空");
            return false;
        }
        String str4 = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        char c11 = 3;
        List<Constructor<?>> listDeclaredConstructors = KavaReflector.declaredConstructors(cls);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listDeclaredConstructors) {
            char c12 = c10;
            Class<?>[] parameterTypes = ((Constructor) obj).getParameterTypes();
            char c13 = c11;
            if (parameterTypes.length == 4) {
                if (m3740a(parameterTypes[c12]) && AbstractC1416l.m3825a(parameterTypes[1], String.class) && AbstractC1416l.m3825a(parameterTypes[2], String.class) && m3740a(parameterTypes[c13])) {
                    arrayList.add(obj);
                }
            } else if (parameterTypes.length == 6) {
                if (!m3740a(parameterTypes[c12]) || !AbstractC1416l.m3825a(parameterTypes[1], String.class) || !AbstractC1416l.m3825a(parameterTypes[2], String.class) || !m3740a(parameterTypes[c13]) || !AbstractC1416l.m3825a(parameterTypes[4], String.class) || !m3740a(parameterTypes[5])) {
                }
            } else if (parameterTypes.length != 8 || !m3740a(parameterTypes[c12]) || !AbstractC1416l.m3825a(parameterTypes[1], String.class) || !AbstractC1416l.m3825a(parameterTypes[2], String.class) || !m3740a(parameterTypes[c13]) || !AbstractC1416l.m3825a(parameterTypes[4], String.class) || !m3740a(parameterTypes[5]) || !List.class.isAssignableFrom(parameterTypes[6])) {
            }
            c10 = c12;
            c11 = c13;
        }
        boolean z9 = c10;
        char c14 = c11;
        Iterator it = AbstractC4166m.m8402K1(arrayList, new C0031h(18)).iterator();
        Object objNewInstance = null;
        String str5 = null;
        while (true) {
            if (it.hasNext()) {
                Constructor constructor = (Constructor) it.next();
                try {
                    length = constructor.getParameterTypes().length;
                } catch (Throwable th2) {
                    str5 = constructor.getParameterTypes().length + ": " + th2.getMessage();
                }
                if (length == 4) {
                    objArr = new Object[4];
                    objArr[z9 ? 1 : 0] = 3;
                    objArr[1] = str3;
                    objArr[2] = str4;
                    objArr[c14] = Integer.valueOf(i9);
                } else if (length == 6) {
                    objArr = new Object[6];
                    objArr[z9 ? 1 : 0] = 3;
                    objArr[1] = str3;
                    objArr[2] = str4;
                    objArr[c14] = Integer.valueOf(i9);
                    objArr[4] = HttpUrl.FRAGMENT_ENCODE_SET;
                    objArr[5] = Integer.valueOf(i10);
                } else if (length == 8) {
                    objArr = new Object[8];
                    objArr[z9 ? 1 : 0] = 3;
                    objArr[1] = str3;
                    objArr[2] = str4;
                    objArr[c14] = Integer.valueOf(i9);
                    objArr[4] = HttpUrl.FRAGMENT_ENCODE_SET;
                    objArr[5] = Integer.valueOf(i10);
                    objArr[6] = Collections.EMPTY_LIST;
                    objArr[7] = objNewInstance;
                }
                objNewInstance = KavaReflector.newInstance(constructor, Arrays.copyOf(objArr, objArr.length));
                break;
            }
            if (str5 != null) {
                strConcat = ", last=".concat(str5);
            }
            m3741b("通过好友申请失败: 无合适构造".concat(strConcat));
        }
        if (objNewInstance == null) {
            return z9;
        }
        boolean z10 = this.f4557b.m6216j(objNewInstance) ? true : z9 ? 1 : 0;
        if (!z10) {
            m3741b("通过好友申请失败: 发包失败 request=".concat(objNewInstance.getClass().getName()));
        }
        return z10;
    }
}

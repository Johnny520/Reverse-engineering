package yyds;

import android.app.Dialog;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yyds.ᲈᲈᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2809 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f13695;

    public /* synthetic */ C2809(int i) {
        this.f13695 = i;
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        String genericString;
        switch (this.f13695) {
            case 0:
                return Boolean.valueOf(((Member) obj2).isSynthetic() != ((Boolean) obj).booleanValue());
            case 1:
                String str = (String) obj;
                Member member = (Member) obj2;
                if (member instanceof Method) {
                    genericString = ((Method) member).toGenericString();
                } else if (member instanceof Constructor) {
                    genericString = ((Constructor) member).toGenericString();
                } else {
                    if (!(member instanceof Field)) {
                        C0188.m791(member, "Unsupported member type: ");
                        return null;
                    }
                    genericString = ((Field) member).toGenericString();
                }
                return Boolean.valueOf(AbstractC1544.m3188(genericString, str));
            case 2:
                return Boolean.valueOf(((Method) obj2).isBridge() != ((Boolean) obj).booleanValue());
            case 3:
                return Boolean.valueOf(((Method) obj2).isDefault() == ((Boolean) obj).booleanValue());
            case 4:
                return Boolean.valueOf(((Method) obj2).isDefault() != ((Boolean) obj).booleanValue());
            case 5:
                return Boolean.valueOf(((Field) obj2).isEnumConstant() == ((Boolean) obj).booleanValue());
            case 6:
                return Boolean.valueOf(((Field) obj2).isEnumConstant() != ((Boolean) obj).booleanValue());
            case 7:
                InterfaceC2247 interfaceC2247 = (InterfaceC2247) obj2;
                if (!(interfaceC2247 instanceof C1820)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC2247 : Integer.valueOf(iIntValue + 1);
            case 8:
                C1820 c1820 = (C1820) obj;
                InterfaceC2247 interfaceC22472 = (InterfaceC2247) obj2;
                if (c1820 != null) {
                    return c1820;
                }
                if (interfaceC22472 instanceof C1820) {
                    return (C1820) interfaceC22472;
                }
                return null;
            case 9:
                C2428 c2428 = (C2428) obj;
                InterfaceC2247 interfaceC22473 = (InterfaceC2247) obj2;
                if (interfaceC22473 instanceof C1820) {
                    C1820 c18202 = (C1820) interfaceC22473;
                    InterfaceC2213 interfaceC2213 = c2428.f11978;
                    ThreadLocal threadLocal = c18202.f9146;
                    Object obj3 = threadLocal.get();
                    threadLocal.set(c18202.f9145);
                    Object[] objArr = c2428.f11979;
                    int i = c2428.f11981;
                    objArr[i] = obj3;
                    C1820[] c1820Arr = c2428.f11980;
                    c2428.f11981 = i + 1;
                    c1820Arr[i] = c18202;
                }
                return c2428;
            default:
                AbstractC2328.m4341(-984616530510702L);
                ((Dialog) obj2).dismiss();
                return C2746.f13459;
        }
    }
}

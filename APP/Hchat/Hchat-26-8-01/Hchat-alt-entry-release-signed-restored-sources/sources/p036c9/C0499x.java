package p036c9;

import android.content.SharedPreferences;
import android.text.TextUtils;
import bsh.org.objectweb.asm.Opcodes;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import p014b.C0126e;
import p020b5.C0184c;
import p080fb.C1103b;
import p085fg.InterfaceC1231l;
import p096g8.C1368i;
import p099h.AbstractC1441a0;
import p099h.AbstractC1468k;
import p099h.AbstractC1473m0;
import p099h.C1453e0;
import p099h.C1457f1;
import p099h.C1463h1;
import p099h.C1471l0;
import p099h.C1483r0;
import p099h.C1485s0;
import p099h.C1486t;
import p099h.C1487t0;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p106h8.C1624a;
import p116i.AbstractC1742d;
import p116i.C1768l1;
import p116i.C1771m1;
import p117i0.C1815c;
import p117i0.C1872q0;
import p117i0.InterfaceC1809a1;
import p129ig.AbstractC2043a;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;
import p332wb.AbstractC4855en;
import p332wb.C5100m6;
import p332wb.C5290rv;
import p332wb.C5319sr;

/* JADX INFO: renamed from: c9.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0499x implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1524g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f1525h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1526i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1527j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0499x(C1103b c1103b, boolean z9, File file) {
        this.f1524g = 1;
        this.f1526i = c1103b;
        this.f1525h = z9;
        this.f1527j = file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r12v6, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r18v1, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x032a  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) throws InterruptedException {
        char c10;
        AtomicBoolean atomicBoolean;
        int i9;
        Object obj2;
        C0126e c0126eM3711R;
        int i10;
        Object objInvokeOrThrow;
        int i11 = this.f1524g;
        Object obj3 = null;
        char c11 = 2;
        C3967n c3967n = C3967n.f12976a;
        int i12 = 3;
        int i13 = 5;
        boolean z9 = this.f1525h;
        Object obj4 = this.f1527j;
        Object obj5 = this.f1526i;
        switch (i11) {
            case 0:
                List<String> list = (List) obj5;
                String str = (String) obj4;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) obj;
                atomicBoolean2.getClass();
                C1624a c1624aConversations = WeChatApis.conversations();
                int i14 = 0;
                for (String str2 : list) {
                    if (atomicBoolean2.get()) {
                        c10 = c11;
                        atomicBoolean = atomicBoolean2;
                        i9 = i12;
                        obj2 = obj3;
                    } else if (c1624aConversations != null) {
                        C1368i c1368i = c1624aConversations.f5318b;
                        DexFinder dexFinder = c1624aConversations.f5320d;
                        String strTrim = str2 != null ? str2.trim() : HttpUrl.FRAGMENT_ENCODE_SET;
                        if (TextUtils.isEmpty(strTrim)) {
                            c10 = c11;
                            atomicBoolean = atomicBoolean2;
                            i9 = i12;
                            obj2 = obj3;
                        } else if (C1368i.m3686I(strTrim)) {
                            int i15 = z;
                            Method method = dexFinder.chatroomMuteServiceGetterMethod;
                            Method method2 = dexFinder.chatroomMuteBuildMethod;
                            Method method3 = dexFinder.chatroomMuteSubmitMethod;
                            if (method == null || method2 == null || method3 == null) {
                                atomicBoolean = atomicBoolean2;
                                i10 = 3;
                                c1624aConversations.m4146f("群聊免打扰API尚未就绪: talker=" + strTrim);
                            } else {
                                atomicBoolean = atomicBoolean2;
                                try {
                                    Object objInvokeOrThrow2 = KavaReflector.invokeOrThrow(method, AbstractC2043a.m4995A(dexFinder, method.getDeclaringClass()), strTrim);
                                    if (objInvokeOrThrow2 == null || !method2.getDeclaringClass().isInstance(objInvokeOrThrow2)) {
                                        i10 = 3;
                                        c1624aConversations.m4146f("群聊免打扰RoomSDK实例为空: talker=" + strTrim);
                                    } else {
                                        int i16 = !z9 ? 1 : 0;
                                        i10 = 3;
                                        if (method2.getParameterTypes().length == 3) {
                                            try {
                                                objInvokeOrThrow = KavaReflector.invokeOrThrow(method2, objInvokeOrThrow2, strTrim, Integer.valueOf(i16), Integer.valueOf(i15));
                                            } catch (Throwable th2) {
                                                th = th2;
                                                c1624aConversations.m4146f("群聊免打扰设置失败: " + th.getMessage() + " talker=" + strTrim + " enabled=" + z9);
                                            }
                                        } else {
                                            objInvokeOrThrow = KavaReflector.invokeOrThrow(method2, objInvokeOrThrow2, strTrim, Integer.valueOf(i16));
                                        }
                                        if (objInvokeOrThrow != null && method3.getDeclaringClass().isInstance(objInvokeOrThrow)) {
                                            KavaReflector.invokeOrThrow(method3, objInvokeOrThrow, new Object[i15]);
                                            i9 = 3;
                                            obj2 = null;
                                            c10 = 2;
                                            i14++;
                                        }
                                        c1624aConversations.m4146f("群聊免打扰操作对象为空: talker=" + strTrim);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    i10 = 3;
                                }
                            }
                            i9 = i10;
                            obj2 = null;
                            c10 = 2;
                        } else {
                            atomicBoolean = atomicBoolean2;
                            i9 = i12;
                            Method method4 = z9 ? dexFinder.contactMuteEnableMethod : dexFinder.contactMuteDisableMethod;
                            Object obj6 = (TextUtils.isEmpty(strTrim) || (c0126eM3711R = c1368i.m3711R(strTrim.trim())) == null) ? null : c0126eM3711R.f333i;
                            if (method4 == null) {
                                c1624aConversations.m4146f("私聊免打扰API尚未就绪: muteMethod=null talker=" + strTrim + " enabled=" + z9);
                            } else if (obj6 == null) {
                                c1624aConversations.m4146f("私聊免打扰API尚未就绪: contact=null talker=" + strTrim + " enabled=" + z9);
                            } else {
                                Class<?>[] parameterTypes = method4.getParameterTypes();
                                c10 = 2;
                                if (parameterTypes.length == 2 && parameterTypes[0].isInstance(obj6)) {
                                    try {
                                        obj2 = null;
                                        try {
                                            KavaReflector.invokeOrThrow(method4, null, obj6, Boolean.TRUE);
                                            i14++;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            c1624aConversations.m4146f("私聊免打扰设置失败: " + th.getMessage() + " talker=" + strTrim + " enabled=" + z9);
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj2 = null;
                                    }
                                } else {
                                    obj2 = null;
                                    c1624aConversations.m4146f("私聊免打扰API尚未就绪: typeMismatch method=" + method4.toGenericString() + " contact=" + obj6.getClass().getName() + " talker=" + strTrim + " enabled=" + z9);
                                }
                            }
                            obj2 = null;
                            c10 = 2;
                        }
                        if (!atomicBoolean.get()) {
                            Thread.sleep(300L);
                        }
                        break;
                    }
                    obj3 = obj2;
                    c11 = c10;
                    i12 = i9;
                    z = false;
                    atomicBoolean2 = atomicBoolean;
                }
                return new C0502y(str, i14, list.size(), false);
            case 1:
                File file = (File) obj4;
                File file2 = (File) obj;
                file2.getClass();
                ((C1103b) obj5).m2828d();
                return Boolean.valueOf(z9 || file2.equals(file));
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) obj5;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) obj4;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                if (z9) {
                    AbstractC4855en.m9269m(interfaceC1809a1, bool, sharedPreferences, "glass_nav", zBooleanValue);
                }
                return c3967n;
            case 3:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) obj5;
                C1486t c1486t = (C1486t) obj;
                c1486t.getClass();
                int iIntValue = ((Number) interfaceC1231l.invoke(c1486t.mo4002b())).intValue();
                int iIntValue2 = ((Number) interfaceC1231l.invoke(obj4)).intValue();
                if (!z9 && iIntValue == iIntValue2) {
                    C1483r0 c1483r0M3996a = AbstractC1473m0.m3996a(AbstractC1742d.m4380p(120, 6, null), 2);
                    C1485s0 c1485s0M3997b = AbstractC1473m0.m3997b(AbstractC1742d.m4380p(90, 6, null), 2);
                    int i17 = AbstractC1468k.f4882b;
                    return new C1453e0(c1483r0M3996a, c1485s0M3997b);
                }
                boolean z10 = iIntValue2 >= iIntValue;
                C1768l1 c1768l1M4380p = AbstractC1742d.m4380p(240, 6, null);
                C5100m6 c5100m6 = new C5100m6(4, z10);
                C1771m1 c1771m1 = AbstractC1473m0.f4891a;
                C1483r0 c1483r0M4000a = new C1483r0(new C1463h1((C1487t0) null, new C1457f1(new C1471l0(c5100m6, 0), c1768l1M4380p), (AbstractC1441a0) null, (AbstractC1441a0) null, (LinkedHashMap) null, 125)).m4000a(AbstractC1473m0.m3996a(AbstractC1742d.m4380p(Opcodes.IF_ICMPNE, 6, null), 2));
                C1485s0 c1485s0M4001a = new C1485s0(new C1463h1((C1487t0) null, new C1457f1(new C1471l0(new C5100m6(5, z10), 1), AbstractC1742d.m4380p(220, 6, null)), (AbstractC1441a0) null, (AbstractC1441a0) (0 == true ? 1 : 0), (LinkedHashMap) null, 125)).m4001a(AbstractC1473m0.m3997b(AbstractC1742d.m4380p(140, 6, null), 2));
                int i18 = AbstractC1468k.f4882b;
                return new C1453e0(c1483r0M4000a, c1485s0M4001a);
            default:
                ArrayList arrayList = (ArrayList) obj5;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                c3623h.f11683a.m352b(arrayList.size(), new C0184c(new C1872q0(new C5319sr(14), i13, arrayList), new C1815c(arrayList, i12), new C3874d(802480018, new C5290rv((InterfaceC1809a1) obj4, arrayList, z9), true)));
                return c3967n;
        }
    }

    public /* synthetic */ C0499x(int i9, Object obj, Object obj2, boolean z9) {
        this.f1524g = i9;
        this.f1526i = obj;
        this.f1527j = obj2;
        this.f1525h = z9;
    }

    public /* synthetic */ C0499x(boolean z9, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1) {
        this.f1524g = 2;
        this.f1525h = z9;
        this.f1526i = sharedPreferences;
        this.f1527j = interfaceC1809a1;
    }
}

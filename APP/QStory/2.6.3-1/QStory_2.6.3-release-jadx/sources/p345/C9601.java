package p345;

import androidx.compose.foundation.lazy.C1597;
import com.alibaba.fastjson2.AbstractC3738;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import p026.AbstractC7017;
import p049.AbstractC7166;
import p049.C7164;
import p104.AbstractC8005;
import p104.C7981;
import p104.C7986;
import p105.C8009;
import p303.AbstractC9234;
import p336.AbstractC9513;
import p336.C9514;
import p336.C9515;
import p341.C9569;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9601 implements InterfaceC9598 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7981 f25057;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f25058;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f25059;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f25060;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9601 f25061;

    static {
        AbstractC9234.m14531(2490);
        AbstractC9234.m14531(2491);
        AbstractC9234.m14531(2492);
        AbstractC9234.m14531(2489);
        f25061 = new C9601();
        f25060 = AbstractC9234.m14531(2493);
        f25059 = AbstractC9234.m14531(2494);
        f25058 = AbstractC9234.m14531(2495);
        f25057 = AbstractC9594.m15026(new C8009(17));
    }

    @Override // p345.InterfaceC9598
    public final String getId() {
        return f25060;
    }

    @Override // p345.InterfaceC9598
    public final String getTitle() {
        return f25059;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo15010(C7981 c7981, AbstractC8005 abstractC8005) {
        String lowerCase;
        C9515 c9515;
        C7986 c7986M15025;
        C7981 c79812;
        C7981 c7981M15013 = AbstractC9594.m15013(AbstractC9234.m14531(2486), c7981);
        if (c7981M15013 == null) {
            c7981M15013 = AbstractC9594.m15018();
        }
        String strM15021 = AbstractC9594.m15021(AbstractC9234.m14531(2433), c7981M15013);
        String strM14532 = null;
        String string = strM15021 != null ? AbstractC5976.m10714(strM15021).toString() : null;
        String strM150212 = AbstractC9594.m15021(AbstractC9234.m14531(2487), c7981M15013);
        String string2 = strM150212 != null ? AbstractC5976.m10714(strM150212).toString() : null;
        Integer num = new Integer(AbstractC9594.m15014(AbstractC9234.m14531(2488), c7981M15013));
        if (num.intValue() <= 0) {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : 20;
        if (string == null || AbstractC5976.m10731(string) || string2 == null || AbstractC5976.m10731(string2)) {
            return AbstractC3738.m6891(AbstractC9234.m14531(2489), abstractC8005, true);
        }
        C9569 c9569 = C9569.f24978;
        AbstractC9234.m14531(125);
        AbstractC9234.m14531(2600);
        C9569.f24978.getClass();
        String string3 = AbstractC5976.m10714(string).toString();
        if (string3 != null) {
            lowerCase = string3.toLowerCase(Locale.ROOT);
            AbstractC9234.m14531(1322);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        if (AbstractC5227.m9466(lowerCase, AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵喵呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵喵喵"))) {
            strM14532 = AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵喵呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵喵喵");
        } else if (AbstractC5227.m9466(lowerCase, AbstractC9234.m14532("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜"))) {
            strM14532 = AbstractC9234.m14532("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜");
        }
        if (strM14532 == null) {
            c79812 = AbstractC9594.m15018();
        } else {
            String string4 = AbstractC5976.m10714(string2).toString();
            if (AbstractC5976.m10731(string4)) {
                c79812 = AbstractC9594.m15018();
            } else {
                char c = strM14532.equals(AbstractC9234.m14532("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜")) ? (char) 2 : (char) 1;
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜");
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                C9514 c9514 = new C9514(ref$ObjectRef, countDownLatch, 0);
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜");
                AbstractC9234.m14531(1411);
                try {
                    Object objM14964 = AbstractC9513.m14964();
                    if (objM14964 == null) {
                        c9514.m14967(-1, AbstractC9234.m14531(2798), new ArrayList());
                    } else {
                        Object friendContact = c == 1 ? QQSessionUtils.QQNT.getFriendContact(string4) : QQSessionUtils.QQNT.getGroupContact(string4);
                        friendContact.getClass();
                        Object objM14965 = AbstractC9513.m14965(iIntValue, friendContact);
                        Object objM14966 = AbstractC9513.m14966(c9514);
                        C7164 c7164M12413 = C7164.m12413(objM14964.getClass());
                        c7164M12413.f17803.f3963 = AbstractC9234.m14531(2799);
                        c7164M12413.f17803.f3964 = new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(2800)), AbstractC7166.m12425(AbstractC9234.m14531(2801))};
                        c7164M12413.m12415(objM14964, objM14965, objM14966);
                    }
                } catch (Exception e) {
                    String str = AbstractC9234.m14531(2810) + e.getMessage();
                    String str2 = AbstractC7017.f17361;
                    AbstractC7017.m12164(str, e.toString(), e, true);
                    c9514.m14967(-1, AbstractC9234.m14531(2804) + e.getMessage(), new ArrayList());
                }
                try {
                    if (countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                        c9515 = (C9515) ref$ObjectRef.element;
                        if (c9515 == null) {
                            c9515 = new C9515(-1, AbstractC9234.m14531(2807), new ArrayList());
                        }
                    } else {
                        String strConcat = AbstractC9234.m14531(2805).concat(string4);
                        RuntimeException runtimeException = new RuntimeException(AbstractC9234.m14532("喵喵呜喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜"));
                        String str3 = AbstractC7017.f17361;
                        AbstractC7017.m12164(strConcat, runtimeException.toString(), runtimeException, true);
                        c9515 = new C9515(-2, AbstractC9234.m14531(2806), new ArrayList());
                    }
                } catch (InterruptedException e2) {
                    String str4 = AbstractC9234.m14531(2808) + e2.getMessage();
                    String str5 = AbstractC7017.f17361;
                    AbstractC7017.m12164(str4, e2.toString(), e2, true);
                    Thread.currentThread().interrupt();
                    c9515 = new C9515(-3, AbstractC9234.m14531(2809), new ArrayList());
                }
                int i = c9515.f24841;
                if (i != 0) {
                    AbstractC7017.m12163(AbstractC9234.m14531(2604) + strM14532 + AbstractC9234.m14531(2605) + string4 + AbstractC9234.m14531(2606) + i + AbstractC9234.m14532("喵呜喵呜喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵喵~喵喵喵呜呜喵呜喵~喵呜喵呜呜喵喵喵") + c9515.f24840, AbstractC9234.m14531(2603));
                    AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
                    C9603 c9603 = new C9603();
                    AbstractC9234.m14531(2337);
                    c7986M15025 = new C7986(c9603.f25063);
                } else {
                    c7986M15025 = AbstractC9594.m15025(new C1597(c9515, strM14532, string4, 9));
                }
                AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
                C9595 c9595 = new C9595();
                AbstractC9234.m14531(2295);
                c9595.m15027(Integer.valueOf(c7986M15025.f19469.size()), AbstractC9234.m14531(2608));
                c9595.m15027(c7986M15025, AbstractC9234.m14531(2609));
                c79812 = new C7981(c9595.f25048);
            }
        }
        return AbstractC3738.m6891(AbstractC9594.m15023(c79812), abstractC8005, false);
    }

    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7981 mo15011() {
        return f25057;
    }

    @Override // p345.InterfaceC9598
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo15012() {
        return f25058;
    }
}

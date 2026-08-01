package p329;

import androidx.compose.foundation.lazy.C0756;
import com.alibaba.fastjson2.AbstractC2905;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5144;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p010.AbstractC6188;
import p033.AbstractC6337;
import p033.C6335;
import p088.AbstractC7176;
import p088.C7152;
import p088.C7157;
import p089.C7180;
import p287.AbstractC8405;
import p320.AbstractC8684;
import p320.C8685;
import p320.C8686;
import p325.C8740;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8772 implements InterfaceC8769 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7152 f24712;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f24713;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f24714;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f24715;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8772 f24716;

    static {
        AbstractC8405.m13972(2490);
        AbstractC8405.m13972(2491);
        AbstractC8405.m13972(2492);
        AbstractC8405.m13972(2489);
        f24716 = new C8772();
        f24715 = AbstractC8405.m13972(2493);
        f24714 = AbstractC8405.m13972(2494);
        f24713 = AbstractC8405.m13972(2495);
        f24712 = AbstractC8765.m14467(new C7180(17));
    }

    @Override // p329.InterfaceC8769
    public final String getId() {
        return f24715;
    }

    @Override // p329.InterfaceC8769
    public final String getTitle() {
        return f24714;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo14451(C7152 c7152, AbstractC7176 abstractC7176) {
        String lowerCase;
        C8686 c8686;
        C7157 c7157M14466;
        C7152 c71522;
        C7152 c7152M14454 = AbstractC8765.m14454(AbstractC8405.m13972(2486), c7152);
        if (c7152M14454 == null) {
            c7152M14454 = AbstractC8765.m14459();
        }
        String strM14462 = AbstractC8765.m14462(AbstractC8405.m13972(2433), c7152M14454);
        String strM13973 = null;
        String string = strM14462 != null ? AbstractC5144.m10155(strM14462).toString() : null;
        String strM144622 = AbstractC8765.m14462(AbstractC8405.m13972(2487), c7152M14454);
        String string2 = strM144622 != null ? AbstractC5144.m10155(strM144622).toString() : null;
        Integer num = new Integer(AbstractC8765.m14455(AbstractC8405.m13972(2488), c7152M14454));
        if (num.intValue() <= 0) {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : 20;
        if (string == null || AbstractC5144.m10172(string) || string2 == null || AbstractC5144.m10172(string2)) {
            return AbstractC2905.m6331(AbstractC8405.m13972(2489), abstractC7176, true);
        }
        C8740 c8740 = C8740.f24633;
        AbstractC8405.m13972(125);
        AbstractC8405.m13972(2600);
        C8740.f24633.getClass();
        String string3 = AbstractC5144.m10155(string).toString();
        if (string3 != null) {
            lowerCase = string3.toLowerCase(Locale.ROOT);
            AbstractC8405.m13972(1322);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        if (AbstractC4395.m8907(lowerCase, AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵喵呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵喵喵"))) {
            strM13973 = AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵喵呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵喵喵");
        } else if (AbstractC4395.m8907(lowerCase, AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜"))) {
            strM13973 = AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜");
        }
        if (strM13973 == null) {
            c71522 = AbstractC8765.m14459();
        } else {
            String string4 = AbstractC5144.m10155(string2).toString();
            if (AbstractC5144.m10172(string4)) {
                c71522 = AbstractC8765.m14459();
            } else {
                char c = strM13973.equals(AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜")) ? (char) 2 : (char) 1;
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜");
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                C8685 c8685 = new C8685(ref$ObjectRef, countDownLatch, 0);
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜");
                AbstractC8405.m13972(1411);
                try {
                    Object objM14405 = AbstractC8684.m14405();
                    if (objM14405 == null) {
                        c8685.m14408(-1, AbstractC8405.m13972(2798), new ArrayList());
                    } else {
                        Object friendContact = c == 1 ? QQSessionUtils.QQNT.getFriendContact(string4) : QQSessionUtils.QQNT.getGroupContact(string4);
                        friendContact.getClass();
                        Object objM14406 = AbstractC8684.m14406(iIntValue, friendContact);
                        Object objM14407 = AbstractC8684.m14407(c8685);
                        C6335 c6335M11854 = C6335.m11854(objM14405.getClass());
                        c6335M11854.f17458.f3618 = AbstractC8405.m13972(2799);
                        c6335M11854.f17458.f3619 = new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(2800)), AbstractC6337.m11866(AbstractC8405.m13972(2801))};
                        c6335M11854.m11856(objM14405, objM14406, objM14407);
                    }
                } catch (Exception e) {
                    String str = AbstractC8405.m13972(2810) + e.getMessage();
                    String str2 = AbstractC6188.f17016;
                    AbstractC6188.m11605(str, e.toString(), e, true);
                    c8685.m14408(-1, AbstractC8405.m13972(2804) + e.getMessage(), new ArrayList());
                }
                try {
                    if (countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                        c8686 = (C8686) ref$ObjectRef.element;
                        if (c8686 == null) {
                            c8686 = new C8686(-1, AbstractC8405.m13972(2807), new ArrayList());
                        }
                    } else {
                        String strConcat = AbstractC8405.m13972(2805).concat(string4);
                        RuntimeException runtimeException = new RuntimeException(AbstractC8405.m13973("喵喵呜喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜"));
                        String str3 = AbstractC6188.f17016;
                        AbstractC6188.m11605(strConcat, runtimeException.toString(), runtimeException, true);
                        c8686 = new C8686(-2, AbstractC8405.m13972(2806), new ArrayList());
                    }
                } catch (InterruptedException e2) {
                    String str4 = AbstractC8405.m13972(2808) + e2.getMessage();
                    String str5 = AbstractC6188.f17016;
                    AbstractC6188.m11605(str4, e2.toString(), e2, true);
                    Thread.currentThread().interrupt();
                    c8686 = new C8686(-3, AbstractC8405.m13972(2809), new ArrayList());
                }
                int i = c8686.f24496;
                if (i != 0) {
                    AbstractC6188.m11604(AbstractC8405.m13972(2604) + strM13973 + AbstractC8405.m13972(2605) + string4 + AbstractC8405.m13972(2606) + i + AbstractC8405.m13973("喵呜喵呜喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵喵~喵喵喵呜呜喵呜喵~喵呜喵呜呜喵喵喵") + c8686.f24495, AbstractC8405.m13972(2603));
                    AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
                    C8774 c8774 = new C8774();
                    AbstractC8405.m13972(2337);
                    c7157M14466 = new C7157(c8774.f24718);
                } else {
                    c7157M14466 = AbstractC8765.m14466(new C0756(c8686, strM13973, string4, 9));
                }
                AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
                C8766 c8766 = new C8766();
                AbstractC8405.m13972(2295);
                c8766.m14468(Integer.valueOf(c7157M14466.f19124.size()), AbstractC8405.m13972(2608));
                c8766.m14468(c7157M14466, AbstractC8405.m13972(2609));
                c71522 = new C7152(c8766.f24703);
            }
        }
        return AbstractC2905.m6331(AbstractC8765.m14464(c71522), abstractC7176, false);
    }

    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C7152 mo14452() {
        return f24712;
    }

    @Override // p329.InterfaceC8769
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo14453() {
        return f24713;
    }
}

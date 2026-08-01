package p323;

import android.view.View;
import com.bumptech.glide.AbstractC3066;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.InterfaceC3750;
import java.io.File;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.reflect.jvm.internal.impl.types.C4875;
import p257.C8208;
import p257.C8212;
import p257.C8240;
import p257.RunnableC8215;
import p287.AbstractC8405;
import p321.C8688;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8730 implements InterfaceC3750 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Object f24611;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f24612;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Serializable f24613;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24614;

    public /* synthetic */ C8730(int i, Serializable serializable, Object obj, Object obj2) {
        this.f24614 = i;
        this.f24613 = serializable;
        this.f24612 = obj;
        this.f24611 = obj2;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3750
    public final boolean onClick(AbstractC3738 abstractC3738, View view) {
        int i = this.f24614;
        Object obj = this.f24611;
        Object obj2 = this.f24612;
        Serializable serializable = this.f24613;
        switch (i) {
            case 0:
                C8688.f24506.getClass();
                AbstractC5062.m10052(new File(C8688.m14410(), (String) serializable));
                ((C8240) obj2).m13764();
                C8212.m13737(AbstractC8405.m13972(2741)).m13740();
                ((C8710) obj).invoke();
                return false;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) serializable;
                C4875 c4875 = (C4875) obj2;
                Map map = (Map) obj;
                C8208 c8208 = (C8208) abstractC3738;
                if (linkedHashSet.isEmpty()) {
                    C8212.m13737(AbstractC8405.m13972(2756)).m13741();
                } else {
                    if (c4875.f14179.get() <= 0) {
                        AtomicInteger atomicInteger = new AtomicInteger(0);
                        for (String str : map.keySet()) {
                            AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵呜~喵呜喵喵呜呜呜呜");
                            str.getClass();
                            String str2 = (String) c4875.f14178.get(str);
                            if (str2 == null || str2.length() == 0) {
                                atomicInteger.incrementAndGet();
                            } else {
                                List<String> listM8797 = AbstractC4344.m8797(linkedHashSet);
                                File file = new File(str2);
                                String strM6854 = AbstractC3066.m6854(str2);
                                String name = file.getName();
                                AbstractC8405.m13972(1820);
                                name.getClass();
                                Locale locale = Locale.getDefault();
                                AbstractC8405.m13972(1277);
                                locale.getClass();
                                String upperCase = name.toUpperCase(locale);
                                AbstractC8405.m13972(1278);
                                upperCase.getClass();
                                String strConcat = upperCase.concat(strM6854);
                                for (String str3 : listM8797) {
                                    StringBuilder sb = new StringBuilder();
                                    C8688.f24506.getClass();
                                    sb.append(C8688.m14410());
                                    sb.append('/');
                                    sb.append(str3);
                                    sb.append('/');
                                    sb.append(strConcat);
                                    AbstractC5062.m10050(str2, sb.toString());
                                }
                            }
                        }
                        if (atomicInteger.get() > 0) {
                            C8212.m13737(atomicInteger.get() + AbstractC8405.m13972(2758)).m13741();
                        } else {
                            C8212.m13737(AbstractC8405.m13972(2759) + linkedHashSet.size() + AbstractC8405.m13972(2760)).m13740();
                        }
                        c8208.m13730();
                        return false;
                    }
                    C8212 c8212M13737 = C8212.m13737(AbstractC8405.m13972(2757));
                    c8212M13737.f22650 = BaseDialog$BOOLEAN.FALSE;
                    if (c8212M13737.f22653 != null) {
                        AbstractC3738.m8030(new RunnableC8215(c8212M13737, 0));
                    }
                    c8212M13737.f11583.mo9894();
                    c8212M13737.f22657 = R.mipmap.ico_dialogx_warning;
                    if (c8212M13737.f22653 != null) {
                        AbstractC3738.m8030(new RunnableC8215(c8212M13737, 0));
                    }
                }
                return true;
        }
    }
}

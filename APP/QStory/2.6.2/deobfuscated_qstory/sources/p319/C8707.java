package p319;

import android.view.View;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.InterfaceC3749;
import java.io.File;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import p251.AbstractC8174;
import p257.C8207;
import p257.C8211;
import p257.C8239;
import p257.RunnableC8214;
import p324.C8738;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8707 implements InterfaceC3749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Object f24561;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f24562;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Serializable f24563;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24564;

    public /* synthetic */ C8707(int i, Serializable serializable, Object obj, Object obj2) {
        this.f24564 = i;
        this.f24563 = serializable;
        this.f24562 = obj;
        this.f24561 = obj2;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3749
    public final boolean onClick(AbstractC3737 abstractC3737, View view) {
        int i = this.f24564;
        Object obj = this.f24561;
        Object obj2 = this.f24562;
        Serializable serializable = this.f24563;
        switch (i) {
            case 0:
                C8738.f24639.getClass();
                AbstractC0455.m1161(new File(C8738.m14405(), (String) serializable));
                ((C8239) obj2).m13747();
                C8211.m13720("\u5220\u9664\u6210\u529f").m13723();
                ((C8687) obj).invoke();
                return false;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) serializable;
                C4874 c4874 = (C4874) obj2;
                Map map = (Map) obj;
                C8207 c8207 = (C8207) abstractC3737;
                if (linkedHashSet.isEmpty()) {
                    C8211.m13720("\u8bf7\u9009\u62e9\u81f3\u5c11\u4e00\u4e2a\u4fdd\u5b58\u76ee\u5f55").m13724();
                } else {
                    if (c4874.f14175.get() <= 0) {
                        AtomicInteger atomicInteger = new AtomicInteger(0);
                        for (String str : map.keySet()) {
                            "md5";
                            str.getClass();
                            String str2 = (String) c4874.f14174.get(str);
                            if (str2 == null || str2.length() == 0) {
                                atomicInteger.incrementAndGet();
                            } else {
                                List<String> listM8804 = AbstractC4343.m8804(linkedHashSet);
                                File file = new File(str2);
                                String strM13614 = AbstractC8174.m13614(str2);
                                String name = file.getName();
                                "getName(...)";
                                name.getClass();
                                Locale locale = Locale.getDefault();
                                "getDefault(...)";
                                locale.getClass();
                                String upperCase = name.toUpperCase(locale);
                                "toUpperCase(...)";
                                upperCase.getClass();
                                String strConcat = upperCase.concat(strM13614);
                                for (String str3 : listM8804) {
                                    StringBuilder sb = new StringBuilder();
                                    C8738.f24639.getClass();
                                    sb.append(C8738.m14405());
                                    sb.append('/');
                                    sb.append(str3);
                                    sb.append('/');
                                    sb.append(strConcat);
                                    AbstractC0455.m1170(str2, sb.toString());
                                }
                            }
                        }
                        if (atomicInteger.get() > 0) {
                            C8211.m13720(atomicInteger.get() + " \u5f20\u56fe\u7247\u4fdd\u5b58\u5931\u8d25").m13724();
                        } else {
                            C8211.m13720("\u5df2\u4fdd\u5b58\u5230 " + linkedHashSet.size() + " \u4e2a\u6587\u4ef6\u5939").m13723();
                        }
                        c8207.m13713();
                        return false;
                    }
                    C8211 c8211M13720 = C8211.m13720("\u56fe\u7247\u8fd8\u6ca1\u52a0\u8f7d\u8bf7\u7a0d\u540e");
                    c8211M13720.f22651 = BaseDialog$BOOLEAN.FALSE;
                    if (c8211M13720.f22654 != null) {
                        AbstractC3737.m8043(new RunnableC8214(c8211M13720, 0));
                    }
                    c8211M13720.f11578.mo11879();
                    c8211M13720.f22658 = R.mipmap.ico_dialogx_warning;
                    if (c8211M13720.f22654 != null) {
                        AbstractC3737.m8043(new RunnableC8214(c8211M13720, 0));
                    }
                }
                return true;
        }
    }
}

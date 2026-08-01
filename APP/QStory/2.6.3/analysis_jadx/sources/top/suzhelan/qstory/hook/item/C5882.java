package top.suzhelan.qstory.hook.item;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.compose.runtime.internal.C1245;
import bsh.C2633;
import com.bumptech.glide.C3070;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import kotlin.text.Regex;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p026.C6313;
import p027.InterfaceC6317;
import p033.AbstractC6337;
import p033.C6335;
import p036.AbstractC6358;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰楪苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5882 extends AbstractC6311 implements InterfaceC6317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f16058 = AbstractC8405.m13972(1893);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Method f16059;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m11284(String str, String str2) {
        if (!new Regex(AbstractC8405.m13972(1900)).matches(str)) {
            int iM10169 = AbstractC5144.m10169(0, 6, str, AbstractC8405.m13973("喵呜喵呜呜呜喵呜"));
            if (iM10169 != -1) {
                String strSubstring = str.substring(iM10169);
                AbstractC8405.m13972(1901);
                if (strSubstring.equalsIgnoreCase(AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵呜呜"))) {
                    String strSubstring2 = str.substring(0, iM10169);
                    AbstractC8405.m13972(1901);
                    AbstractC8405.m13972(593);
                    ApplicationInfo applicationInfo = null;
                    try {
                        PackageInfo packageArchiveInfo = AbstractC6358.f17507.getPackageManager().getPackageArchiveInfo(str2, 1);
                        if (packageArchiveInfo != null) {
                            applicationInfo = packageArchiveInfo.applicationInfo;
                        }
                    } catch (Exception unused) {
                    }
                    if (applicationInfo != null && (strSubstring2.equals(applicationInfo.packageName) || strSubstring2.equals(applicationInfo.name) || strSubstring2.equals(applicationInfo.loadLabel(AbstractC6358.f17507.getPackageManager()).toString()))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static String m11285(String str) {
        try {
            PackageManager packageManager = AbstractC6358.f17507.getPackageManager();
            PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 1);
            packageArchiveInfo.getClass();
            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
            applicationInfo.getClass();
            applicationInfo.sourceDir = str;
            applicationInfo.publicSourceDir = str;
            String strM10137 = AbstractC5139.m10137(AbstractC8405.m13972(1902), AbstractC8405.m13973("喵呜喵呜喵呜呜喵~喵喵喵呜呜喵呜呜"), applicationInfo.loadLabel(packageManager).toString());
            String strM13973 = AbstractC8405.m13973("喵呜喵呜喵呜呜喵~喵喵喵喵喵呜喵呜");
            String str2 = applicationInfo.packageName;
            AbstractC8405.m13972(1903);
            str2.getClass();
            String strM101372 = AbstractC5139.m10137(strM10137, strM13973, str2);
            String strM139732 = AbstractC8405.m13973("喵呜喵呜喵呜呜喵~喵喵喵喵喵喵呜呜");
            String str3 = packageArchiveInfo.versionName;
            if (str3 == null) {
                str3 = "";
            }
            return AbstractC5139.m10137(AbstractC5139.m10137(strM101372, strM139732, str3), AbstractC8405.m13973("喵呜喵呜喵呜呜喵~喵喵喵呜喵呜呜喵"), String.valueOf(packageArchiveInfo.versionCode));
        } catch (Exception unused) {
            return AbstractC8405.m13972(1904);
        }
    }

    @Override // p026.AbstractC6314
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        Method method = this.f16059;
        if (method == null) {
            C2633.m5339(AbstractC8405.m13972(1895));
            return;
        }
        XposedBridge.hookMethod(method, new C6313(this, 25, new C5925(this, 2)));
        Class clsM11866 = AbstractC6337.m11866(AbstractC6358.f17508 >= 13350 ? AbstractC8405.m13972(1896) : AbstractC8405.m13972(1897));
        C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(1898));
        C1245 c1245 = c6335M11853.f17458;
        c1245.f3617 = Void.TYPE;
        c1245.f3619 = new Class[]{Long.TYPE, clsM11866};
        Method methodM11855 = c6335M11853.m11855();
        XposedBridge.hookMethod(methodM11855, new C6313(this, 25, new C5925(this, 3)));
        XposedBridge.hookMethod(this.f16059, new C6313(this, 20, new C5925(4)));
        XposedBridge.hookMethod(methodM11855, new C6313(this, 20, new C5925(5)));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1894);
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        this.f16059 = c3070.m6889(this.f16058);
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        c3070.m6887(C3070.m6886(AbstractC8405.m13972(1899))[0], this.f16058);
    }
}

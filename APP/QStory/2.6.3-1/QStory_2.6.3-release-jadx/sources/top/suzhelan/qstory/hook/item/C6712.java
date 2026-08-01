package top.suzhelan.qstory.hook.item;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.compose.runtime.internal.C2080;
import bsh.C3466;
import com.bumptech.glide.C3902;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import kotlin.text.Regex;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p042.C7142;
import p043.InterfaceC7146;
import p049.AbstractC7166;
import p049.C7164;
import p052.AbstractC7187;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰楪苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6712 extends AbstractC7140 implements InterfaceC7146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f16403 = AbstractC9234.m14531(1893);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Method f16404;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m11843(String str, String str2) {
        if (!new Regex(AbstractC9234.m14531(1900)).matches(str)) {
            int iM10728 = AbstractC5976.m10728(0, 6, str, AbstractC9234.m14532("喵呜喵呜呜呜喵呜"));
            if (iM10728 != -1) {
                String strSubstring = str.substring(iM10728);
                AbstractC9234.m14531(1901);
                if (strSubstring.equalsIgnoreCase(AbstractC9234.m14532("喵呜喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵呜呜"))) {
                    String strSubstring2 = str.substring(0, iM10728);
                    AbstractC9234.m14531(1901);
                    AbstractC9234.m14531(593);
                    ApplicationInfo applicationInfo = null;
                    try {
                        PackageInfo packageArchiveInfo = AbstractC7187.f17852.getPackageManager().getPackageArchiveInfo(str2, 1);
                        if (packageArchiveInfo != null) {
                            applicationInfo = packageArchiveInfo.applicationInfo;
                        }
                    } catch (Exception unused) {
                    }
                    if (applicationInfo != null && (strSubstring2.equals(applicationInfo.packageName) || strSubstring2.equals(applicationInfo.name) || strSubstring2.equals(applicationInfo.loadLabel(AbstractC7187.f17852.getPackageManager()).toString()))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static String m11844(String str) {
        try {
            PackageManager packageManager = AbstractC7187.f17852.getPackageManager();
            PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 1);
            packageArchiveInfo.getClass();
            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
            applicationInfo.getClass();
            applicationInfo.sourceDir = str;
            applicationInfo.publicSourceDir = str;
            String strM10696 = AbstractC5971.m10696(AbstractC9234.m14531(1902), AbstractC9234.m14532("喵呜喵呜喵呜呜喵~喵喵喵呜呜喵呜呜"), applicationInfo.loadLabel(packageManager).toString());
            String strM14532 = AbstractC9234.m14532("喵呜喵呜喵呜呜喵~喵喵喵喵喵呜喵呜");
            String str2 = applicationInfo.packageName;
            AbstractC9234.m14531(1903);
            str2.getClass();
            String strM106962 = AbstractC5971.m10696(strM10696, strM14532, str2);
            String strM145322 = AbstractC9234.m14532("喵呜喵呜喵呜呜喵~喵喵喵喵喵喵呜呜");
            String str3 = packageArchiveInfo.versionName;
            if (str3 == null) {
                str3 = "";
            }
            return AbstractC5971.m10696(AbstractC5971.m10696(strM106962, strM145322, str3), AbstractC9234.m14532("喵呜喵呜喵呜呜喵~喵喵喵呜喵呜呜喵"), String.valueOf(packageArchiveInfo.versionCode));
        } catch (Exception unused) {
            return AbstractC9234.m14531(1904);
        }
    }

    @Override // p042.AbstractC7143
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        Method method = this.f16404;
        if (method == null) {
            C3466.m5899(AbstractC9234.m14531(1895));
            return;
        }
        XposedBridge.hookMethod(method, new C7142(this, 25, new C6755(this, 2)));
        Class clsM12425 = AbstractC7166.m12425(AbstractC7187.f17853 >= 13350 ? AbstractC9234.m14531(1896) : AbstractC9234.m14531(1897));
        C7164 c7164M12412 = C7164.m12412(AbstractC9234.m14531(1898));
        C2080 c2080 = c7164M12412.f17803;
        c2080.f3962 = Void.TYPE;
        c2080.f3964 = new Class[]{Long.TYPE, clsM12425};
        Method methodM12414 = c7164M12412.m12414();
        XposedBridge.hookMethod(methodM12414, new C7142(this, 25, new C6755(this, 3)));
        XposedBridge.hookMethod(this.f16404, new C7142(this, 20, new C6755(4)));
        XposedBridge.hookMethod(methodM12414, new C7142(this, 20, new C6755(5)));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1894);
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
        AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        this.f16404 = c3902.m7449(this.f16403);
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
        AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        c3902.m7447(C3902.m7446(AbstractC9234.m14531(1899))[0], this.f16403);
    }
}

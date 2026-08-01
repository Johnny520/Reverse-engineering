package top.suzhelan.qstory.hook.item;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.compose.runtime.internal.C1245;
import bsh.C2632;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import kotlin.text.Regex;
import net.bytebuddy.description.method.MethodDescription;
import p009.InterfaceC6152;
import p026.AbstractC6293;
import p026.C6295;
import p032.AbstractC6318;
import p032.C6316;
import p035.AbstractC6340;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲兰楪苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5877 extends AbstractC6293 implements InterfaceC6152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f16049 = AbstractC3056.m6668(-3937749381403641255L);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Method f16050;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m11223(String str, String str2) {
        if (!new Regex(AbstractC3056.m6668(-3937748088618485159L)).matches(str)) {
            int iM10166 = AbstractC5143.m10166(0, 6, str, AbstractC3056.m6668(-3937562159484241319L));
            if (iM10166 != -1) {
                String strSubstring = str.substring(iM10166);
                AbstractC3056.m6668(-3937748054258746791L);
                if (strSubstring.equalsIgnoreCase(AbstractC3056.m6668(-3937747981244302759L))) {
                    String strSubstring2 = str.substring(0, iM10166);
                    AbstractC3056.m6668(-3937748054258746791L);
                    AbstractC3056.m6668(-3937618775743137191L);
                    ApplicationInfo applicationInfo = null;
                    try {
                        PackageInfo packageArchiveInfo = AbstractC6340.f17460.getPackageManager().getPackageArchiveInfo(str2, 1);
                        if (packageArchiveInfo != null) {
                            applicationInfo = packageArchiveInfo.applicationInfo;
                        }
                    } catch (Exception unused) {
                    }
                    if (applicationInfo != null && (strSubstring2.equals(applicationInfo.packageName) || strSubstring2.equals(applicationInfo.name) || strSubstring2.equals(applicationInfo.loadLabel(AbstractC6340.f17460.getPackageManager()).toString()))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static String m11224(String str) {
        try {
            PackageManager packageManager = AbstractC6340.f17460.getPackageManager();
            PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 1);
            packageArchiveInfo.getClass();
            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
            applicationInfo.getClass();
            applicationInfo.sourceDir = str;
            applicationInfo.publicSourceDir = str;
            String strM10128 = AbstractC5138.m10128(AbstractC3056.m6668(-3937747968359400871L), AbstractC3056.m6668(-3937747908229858727L), applicationInfo.loadLabel(packageManager).toString());
            String strM6668 = AbstractC3056.m6668(-3937747921114760615L);
            String str2 = applicationInfo.packageName;
            AbstractC3056.m6668(-3937747899639924135L);
            str2.getClass();
            String strM101282 = AbstractC5138.m10128(strM10128, strM6668, str2);
            String strM66682 = AbstractC3056.m6668(-3937747848100316583L);
            String strM66683 = packageArchiveInfo.versionName;
            if (strM66683 == null) {
                strM66683 = AbstractC3056.m6668(-3937561979095614887L);
            }
            return AbstractC5138.m10128(AbstractC5138.m10128(strM101282, strM66682, strM66683), AbstractC3056.m6668(-3937747826625480103L), String.valueOf(packageArchiveInfo.versionCode));
        } catch (Exception unused) {
            return AbstractC3056.m6668(-3937747736431166887L);
        }
    }

    @Override // p026.AbstractC6296
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        Method method = this.f16050;
        if (method == null) {
            C2632.m5294(AbstractC3056.m6668(-3937749033511290279L));
            return;
        }
        XposedBridge.hookMethod(method, new C6295(this, 25, new C5919(this, 2)));
        Class clsM11838 = AbstractC6318.m11838(AbstractC6340.f17461 >= 13350 ? AbstractC3056.m6668(-3937748913252205991L) : AbstractC3056.m6668(-3937748801583056295L));
        C6316 c6316M11825 = C6316.m11825(AbstractC3056.m6668(-3937748488050443687L));
        C1245 c1245 = c6316M11825.f17409;
        c1245.f3616 = Void.TYPE;
        c1245.f3618 = new Class[]{Long.TYPE, clsM11838};
        Method methodM11827 = c6316M11825.m11827();
        XposedBridge.hookMethod(methodM11827, new C6295(this, 25, new C5919(this, 3)));
        XposedBridge.hookMethod(this.f16050, new C6295(this, 20, new C5919(4)));
        XposedBridge.hookMethod(methodM11827, new C6295(this, 20, new C5919(5)));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937749364223772071L);
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
        AbstractC3056.m6668(-3937729770582967719L);
        this.f16050 = c3069.m6902(this.f16049);
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) {
        AbstractC3056.m6668(-3937729770582967719L);
        c3069.m6900(C3069.m6899(AbstractC3056.m6668(-3937748230352405927L))[0], this.f16049);
    }
}

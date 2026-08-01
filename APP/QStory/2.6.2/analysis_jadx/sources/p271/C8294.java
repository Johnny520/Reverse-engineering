package p271;

import androidx.profileinstaller.AbstractC2442;
import com.google.gson.AbstractC3250;
import com.google.gson.C3243;
import com.google.gson.C3252;
import com.google.gson.InterfaceC3245;
import com.google.gson.InterfaceC3248;
import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter$FilterResult;
import com.google.gson.internal.AbstractC3220;
import com.google.gson.internal.AbstractC3232;
import com.google.gson.internal.C3221;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import p175.AbstractC7738;
import p232.C8064;
import p260.C8245;
import p269.AbstractC8267;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8294 implements InterfaceC3248 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final List f22906;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C8323 f22907;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC3245 f22908;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3221 f22909;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8064 f22910;

    public C8294(C8064 c8064, InterfaceC3245 interfaceC3245, C3221 c3221, C8323 c8323, List list) {
        this.f22910 = c8064;
        this.f22908 = interfaceC3245;
        this.f22909 = c3221;
        this.f22907 = c8323;
        this.f22906 = list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m13821(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + AbstractC8267.m13817(field) + " and " + AbstractC8267.m13817(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13822(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!AbstractC3232.f10886.mo7338(obj, accessibleObject)) {
            throw new JsonIOException(AbstractC8267.m13816(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m13823(Field field, boolean z) {
        boolean z2;
        C3221 c3221 = this.f22909;
        c3221.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || c3221.m7333(field.getType(), z)) {
            z2 = true;
        } else {
            List list = z ? c3221.f10869 : c3221.f10868;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw AbstractC2442.m4568(it);
                }
            }
            z2 = false;
        }
        return !z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019d  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p271.C8311 m13824(com.google.gson.C3252 r29, p260.C8245 r30, java.lang.Class r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p271.C8294.m13824(com.google.gson.飘花落叶言子楪苏世哲兰, 飘花落叶言楪哲世子苏兰.飘花落叶言子楪世苏哲兰, java.lang.Class, boolean, boolean):飘花落叶言楪哲子苏世兰.飘花落叶言子楪兰哲苏世");
    }

    @Override // com.google.gson.InterfaceC3248
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3250 mo7334(C3252 c3252, C8245 c8245) {
        Class cls = c8245.f22816;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        AbstractC7738 abstractC7738 = AbstractC8267.f22885;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new C3243(2);
        }
        ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResultM7321 = AbstractC3220.m7321(this.f22906);
        if (reflectionAccessFilter$FilterResultM7321 != ReflectionAccessFilter$FilterResult.BLOCK_ALL) {
            boolean z = reflectionAccessFilter$FilterResultM7321 == ReflectionAccessFilter$FilterResult.BLOCK_INACCESSIBLE;
            return AbstractC8267.f22885.mo13060(cls) ? new C8295(cls, m13824(c3252, c8245, cls, z, true), z) : new C8310(this.f22910.m13520(c8245, true), m13824(c3252, c8245, cls, z, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + cls + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}

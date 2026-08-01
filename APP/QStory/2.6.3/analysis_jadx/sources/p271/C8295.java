package p271;

import androidx.profileinstaller.AbstractC2442;
import com.google.gson.AbstractC3251;
import com.google.gson.C3244;
import com.google.gson.C3253;
import com.google.gson.InterfaceC3246;
import com.google.gson.InterfaceC3249;
import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter$FilterResult;
import com.google.gson.internal.AbstractC3221;
import com.google.gson.internal.AbstractC3233;
import com.google.gson.internal.C3222;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import p175.AbstractC7739;
import p232.C8065;
import p260.C8246;
import p269.AbstractC8268;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8295 implements InterfaceC3249 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final List f22905;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C8324 f22906;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC3246 f22907;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3222 f22908;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8065 f22909;

    public C8295(C8065 c8065, InterfaceC3246 interfaceC3246, C3222 c3222, C8324 c8324, List list) {
        this.f22909 = c8065;
        this.f22907 = interfaceC3246;
        this.f22908 = c3222;
        this.f22906 = c8324;
        this.f22905 = list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m13838(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + AbstractC8268.m13834(field) + " and " + AbstractC8268.m13834(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13839(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!AbstractC3233.f10891.mo7325(obj, accessibleObject)) {
            throw new JsonIOException(AbstractC8268.m13833(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m13840(Field field, boolean z) {
        boolean z2;
        C3222 c3222 = this.f22908;
        c3222.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || c3222.m7320(field.getType(), z)) {
            z2 = true;
        } else {
            List list = z ? c3222.f10874 : c3222.f10873;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw AbstractC2442.m4578(it);
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
    public final p271.C8312 m13841(com.google.gson.C3253 r29, p260.C8246 r30, java.lang.Class r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p271.C8295.m13841(com.google.gson.飘花落叶言子楪苏世哲兰, 飘花落叶言楪哲世子苏兰.飘花落叶言子楪世苏哲兰, java.lang.Class, boolean, boolean):飘花落叶言楪哲子苏世兰.飘花落叶言子楪兰哲苏世");
    }

    @Override // com.google.gson.InterfaceC3249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3251 mo7321(C3253 c3253, C8246 c8246) {
        Class cls = c8246.f22815;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        AbstractC7739 abstractC7739 = AbstractC8268.f22884;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new C3244(2);
        }
        ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResultM7308 = AbstractC3221.m7308(this.f22905);
        if (reflectionAccessFilter$FilterResultM7308 != ReflectionAccessFilter$FilterResult.BLOCK_ALL) {
            boolean z = reflectionAccessFilter$FilterResultM7308 == ReflectionAccessFilter$FilterResult.BLOCK_INACCESSIBLE;
            return AbstractC8268.f22884.mo13089(cls) ? new C8296(cls, m13841(c3253, c8246, cls, z, true), z) : new C8311(this.f22909.m13549(c8246, true), m13841(c3253, c8246, cls, z, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + cls + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}

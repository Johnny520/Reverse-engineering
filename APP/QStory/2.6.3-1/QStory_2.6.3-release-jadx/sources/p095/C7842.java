package p095;

import androidx.compose.runtime.C2157;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5630;
import kotlin.reflect.jvm.internal.impl.storage.C5669;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5741;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7387;
import p082.C7706;
import p117.AbstractC8087;
import p117.C8077;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7842 extends AbstractC8087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C7839 f19181;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5679 f19182;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5669 f19183;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5669 f19184;

    public C7842(C7839 c7839, C5677 c5677) {
        int i = 0;
        if (c5677 == null) {
            m12910(0);
            throw null;
        }
        this.f19181 = c7839;
        this.f19184 = c5677.m10138(new C7841(this, i));
        this.f19183 = c5677.m10138(new C7841(this, 1));
        this.f19182 = new C5679(c5677, new C2157(this, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m12910(int i) {
        String str;
        int i2;
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 4:
            case 5:
            case 8:
            case 10:
                objArr[0] = "name";
                break;
            case 2:
            case 6:
                objArr[0] = "location";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                break;
            case 11:
                objArr[0] = "fromSupertypes";
                break;
            case 13:
                objArr[0] = "kindFilter";
                break;
            case 14:
                objArr[0] = "nameFilter";
                break;
            case 20:
                objArr[0] = "p";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 3) {
            objArr[1] = "getContributedVariables";
        } else if (i == 7) {
            objArr[1] = "getContributedFunctions";
        } else if (i == 9) {
            objArr[1] = "getSupertypeScope";
        } else if (i != 12) {
            switch (i) {
                case 15:
                    objArr[1] = "getContributedDescriptors";
                    break;
                case 16:
                    objArr[1] = "computeAllDeclarations";
                    break;
                case 17:
                    objArr[1] = "getFunctionNames";
                    break;
                case 18:
                    objArr[1] = "getClassifierNames";
                    break;
                case 19:
                    objArr[1] = "getVariableNames";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
            }
        } else {
            objArr[1] = "resolveFakeOverrides";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "getContributedVariables";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 4:
                objArr[2] = "computeProperties";
                break;
            case 5:
            case 6:
                objArr[2] = "getContributedFunctions";
                break;
            case 8:
                objArr[2] = "computeFunctions";
                break;
            case 10:
            case 11:
                objArr[2] = "resolveFakeOverrides";
                break;
            case 13:
            case 14:
                objArr[2] = "getContributedDescriptors";
                break;
            case 20:
                objArr[2] = "printScopeStructure";
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9724(C5523 c5523, NoLookupLocation noLookupLocation) {
        if (c5523 == null) {
            m12910(5);
            throw null;
        }
        if (noLookupLocation != null) {
            return (Collection) this.f19184.invoke(c5523);
        }
        m12910(6);
        throw null;
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9725() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        m12910(18);
        throw null;
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9726(C5523 c5523, NoLookupLocation noLookupLocation) {
        if (c5523 == null) {
            m12910(1);
            throw null;
        }
        if (noLookupLocation != null) {
            return (Collection) this.f19183.invoke(c5523);
        }
        m12910(2);
        throw null;
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo9727() {
        Set set = (Set) this.f19181.f19177.invoke();
        if (set != null) {
            return set;
        }
        m12910(17);
        throw null;
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9728(C8077 c8077, InterfaceC7387 interfaceC7387) {
        if (c8077 == null) {
            m12910(13);
            throw null;
        }
        Collection collection = (Collection) this.f19182.invoke();
        if (collection != null) {
            return collection;
        }
        m12910(15);
        throw null;
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9731() {
        Set set = (Set) this.f19181.f19177.invoke();
        if (set != null) {
            return set;
        }
        m12910(19);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC8083 m12911() {
        InterfaceC8083 interfaceC8083Mo10283 = ((AbstractC5714) ((AbstractC5741) this.f19181.mo9560()).mo10053().iterator().next()).mo10283();
        if (interfaceC8083Mo10283 != null) {
            return interfaceC8083Mo10283;
        }
        m12910(9);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final LinkedHashSet m12912(C5523 c5523, Collection collection) {
        if (c5523 == null) {
            m12910(10);
            throw null;
        }
        if (collection == null) {
            m12910(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C7706.f18665.m12712(c5523, collection, Collections.EMPTY_SET, this.f19181, new C5630(linkedHashSet, 1));
        return linkedHashSet;
    }
}

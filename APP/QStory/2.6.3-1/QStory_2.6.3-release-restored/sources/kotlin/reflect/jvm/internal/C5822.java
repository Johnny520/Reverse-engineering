package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0900;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3898;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.CallableReference;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5923;
import kotlin.reflect.InterfaceC5927;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.p009km.AbstractC5377;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;
import kotlin.reflect.jvm.internal.impl.p009km.C5369;
import kotlin.reflect.jvm.internal.impl.p009km.C5370;
import kotlin.reflect.jvm.internal.impl.p009km.internal.AbstractC5340;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5346;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5348;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5352;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5353;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5628;
import kotlin.text.AbstractC5971;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;
import p050.AbstractC7176;
import p068.InterfaceC7372;
import p088.C7752;
import p093.C7799;
import p117.C8082;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5822 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5825 f14743;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5824 f14744;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14745;

    public C5822(C5824 c5824, C5825 c5825) {
        this.f14745 = 0;
        this.f14744 = c5824;
        this.f14743 = c5825;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0169  */
    @Override // p068.InterfaceC7372
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() throws ClassNotFoundException {
        String str;
        InterfaceC5927 c5830;
        int i = this.f14745;
        C5824 c5824 = this.f14744;
        C5825 c5825 = this.f14743;
        switch (i) {
            case 0:
                Class cls = c5824.f14749;
                if (!AbstractC5905.f14965) {
                    C5906 c5906 = c5825.f14753;
                    InterfaceC5920 interfaceC5920 = C5825.f14751[1];
                    Object objInvoke = c5906.invoke();
                    objInvoke.getClass();
                    InterfaceC8083 interfaceC8083 = (InterfaceC8083) objInvoke;
                    Iterable<InterfaceC8083> iterableM12487 = interfaceC8083 instanceof C5628 ? AbstractC7176.m12487(interfaceC8083) : interfaceC8083 instanceof C8082 ? AbstractC5179.m9405(((C8082) interfaceC8083).f19678) : EmptyList.INSTANCE;
                    ArrayList arrayList = new ArrayList(AbstractC5177.m9381(iterableM12487, 10));
                    for (InterfaceC8083 interfaceC80832 : iterableM12487) {
                        interfaceC80832.getClass();
                        C5628 c5628 = (C5628) interfaceC80832;
                        arrayList.add(AbstractC5340.m9660(c5628.f14323, c5628.f14322.f14406, false, 6));
                    }
                    return arrayList;
                }
                Metadata metadata = (Metadata) cls.getAnnotation(Metadata.class);
                AbstractC5894 abstractC5894M8861 = metadata != null ? AbstractC4765.m8861(metadata) : null;
                if (abstractC5894M8861 instanceof C5346) {
                    return AbstractC7176.m12487(((C5346) abstractC5894M8861).f13503);
                }
                if (abstractC5894M8861 instanceof C5352) {
                    return AbstractC7176.m12487(((C5352) abstractC5894M8861).f13514);
                }
                if (!(abstractC5894M8861 instanceof C5353)) {
                    return EmptyList.INSTANCE;
                }
                List list = ((C5353) abstractC5894M8861).f13515;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Class<?> clsLoadClass = cls.getClassLoader().loadClass(AbstractC5971.m10688((String) it.next(), '/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                    clsLoadClass.getClass();
                    InterfaceC5923 interfaceC5923 = (InterfaceC5923) AbstractC5847.f14794.m10547(clsLoadClass);
                    interfaceC5923.getClass();
                    AbstractC5176.m9363((List) ((C5825) ((C5824) interfaceC5923).f14750.getValue()).f14755.getValue(), arrayList2);
                }
                return arrayList2;
            case 1:
                C5906 c59062 = c5825.f14754;
                InterfaceC5920 interfaceC59202 = C5825.f14751[0];
                C7799 c7799 = (C7799) c59062.invoke();
                if (c7799 != null) {
                    C7752 c7752 = c7799.f19005;
                    str = c7752.f18813;
                    if (c7752.f18818 != KotlinClassHeader$Kind.MULTIFILE_CLASS_PART) {
                        str = null;
                    }
                }
                if (str == null || str.length() <= 0) {
                    return null;
                }
                ClassLoader classLoader = c5824.f14749.getClassLoader();
                String strReplace = str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                strReplace.getClass();
                return classLoader.loadClass(strReplace);
            default:
                if (AbstractC5905.f14967) {
                    C5832 c5832 = new C5832(c5824, 1);
                    C5906 c59063 = c5825.f14753;
                    InterfaceC5920 interfaceC59203 = C5825.f14751[1];
                    Object objInvoke2 = c59063.invoke();
                    objInvoke2.getClass();
                    Collection<InterfaceC5331> collectionM7420 = AbstractC3898.m7420((InterfaceC8083) objInvoke2, null, 3);
                    ArrayList arrayList3 = new ArrayList();
                    for (InterfaceC5331 interfaceC5331 : collectionM7420) {
                        AbstractC5856 abstractC5856 = interfaceC5331 instanceof InterfaceC5312 ? (AbstractC5856) interfaceC5331.mo9586(c5832, C6008.f15084) : null;
                        if (abstractC5856 != null) {
                            arrayList3.add(abstractC5856);
                        }
                    }
                    return AbstractC5176.m9356(arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                for (C5369 c5369 : (List) c5825.f14755.getValue()) {
                    for (C5368 c5368 : c5369.f13575) {
                        c5368.getClass();
                        String str2 = c5368.f13562;
                        byte b = !c5368.f13567.isEmpty() ? (byte) -1 : c5368.f13558 != null ? (byte) 1 : (byte) 0;
                        String strM8863 = AbstractC4765.m8863(c5368, c5824);
                        if (strM8863 == null) {
                            throw new KotlinReflectionInternalError(AbstractC0900.m717("No field or getter signature for property: ", str2));
                        }
                        Object obj = CallableReference.NO_RECEIVER;
                        if (!AbstractC5377.f13617.m1137(c5368, AbstractC5377.f13608[36])) {
                            c5830 = b != -1 ? b != 0 ? b != 1 ? null : new C5815(c5824, strM8863, obj, c5368) : new C5797(c5824, strM8863, obj, c5368) : new C5816(c5824, strM8863, obj, c5368);
                        } else if (b == -1) {
                            c5830 = new C5830(c5824, strM8863, obj, c5368);
                        } else if (b == 0) {
                            c5830 = new C5829(c5824, strM8863, obj, c5368);
                        } else if (b == 1) {
                            c5830 = new C5827(c5824, strM8863, obj, c5368);
                        }
                        if (c5830 == null) {
                            StringBuilder sbM12141 = AbstractC7012.m12141("Unsupported property: name=", str2, " signature=", strM8863, " container=");
                            sbM12141.append(c5824);
                            throw new KotlinReflectionInternalError(sbM12141.toString());
                        }
                        arrayList4.add(c5830);
                    }
                    for (C5370 c5370 : c5369.f13576) {
                        c5370.getClass();
                        C5348 c5348 = AbstractC3888.m7274(c5370).f19293;
                        if (c5348 == null) {
                            C5043.m9153(c5370.f13581, "No signature for function: ");
                            return null;
                        }
                        arrayList4.add(new C5808(c5824, c5348.toString(), CallableReference.NO_RECEIVER, c5370));
                    }
                }
                return AbstractC5176.m9356(arrayList4);
        }
    }

    public /* synthetic */ C5822(C5825 c5825, C5824 c5824, int i) {
        this.f14745 = i;
        this.f14743 = c5825;
        this.f14744 = c5824;
    }
}

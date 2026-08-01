package p084;

import androidx.compose.animation.core.C0325;
import com.bumptech.glide.AbstractC3057;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4430;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4615;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC4570;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4578;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import p049.AbstractC6527;
import p081.InterfaceC7028;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲子兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7045 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4691 f18920 = C4691.m9330("message");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4691 f18919 = C4691.m9330("allowedTargets");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4691 f18918 = C4691.m9330("value");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Map f18917 = AbstractC4339.m8774(new Pair(AbstractC6527.f17886, AbstractC4615.f13483), new Pair(AbstractC6527.f17888, AbstractC4615.f13482), new Pair(AbstractC6527.f17889, AbstractC4615.f13480));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC4570 m12375(C0325 c0325, C4430 c4430, boolean z) {
        c4430.getClass();
        c0325.getClass();
        C4688 c4688M8977 = AbstractC4431.m8977(AbstractC3057.m6756(AbstractC3057.m6759(c4430.f13051)));
        C4687 c4687 = AbstractC4615.f13483;
        c4687.getClass();
        if (c4688M8977.equals(new C4688(c4687.m9320(), c4687.f13696.m9318()))) {
            return new C7051(c4430, c0325);
        }
        C4687 c46872 = AbstractC4615.f13482;
        c46872.getClass();
        if (c4688M8977.equals(new C4688(c46872.m9320(), c46872.f13696.m9318()))) {
            return new C7050(c4430, c0325);
        }
        C4687 c46873 = AbstractC4615.f13480;
        c46873.getClass();
        if (c4688M8977.equals(new C4688(c46873.m9320(), c46873.f13696.m9318()))) {
            return new C7046(c0325, c4430, AbstractC6527.f17889);
        }
        C4687 c46874 = AbstractC4615.f13481;
        c46874.getClass();
        if (c4688M8977.equals(new C4688(c46874.m9320(), c46874.f13696.m9318()))) {
            return null;
        }
        return new C4578(c0325, c4430, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC4570 m12376(C4687 c4687, InterfaceC7028 interfaceC7028, C0325 c0325) {
        C4430 c4430Mo8972;
        c4687.getClass();
        interfaceC7028.getClass();
        c0325.getClass();
        if (c4687.equals(AbstractC6527.f17893)) {
            C4687 c46872 = AbstractC4615.f13481;
            c46872.getClass();
            C4430 c4430Mo89722 = interfaceC7028.mo8972(c46872);
            if (c4430Mo89722 != null) {
                return new C7049(c4430Mo89722, c0325);
            }
        }
        C4687 c46873 = (C4687) f18917.get(c4687);
        if (c46873 == null || (c4430Mo8972 = interfaceC7028.mo8972(c46873)) == null) {
            return null;
        }
        return m12375(c0325, c4430Mo8972, false);
    }
}

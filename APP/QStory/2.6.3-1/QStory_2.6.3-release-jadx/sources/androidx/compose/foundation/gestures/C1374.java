package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C1191;
import androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2;
import androidx.compose.runtime.AbstractC2182;
import kotlin.C6008;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1374 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1896;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1897;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1898;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1899;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1900;

    public /* synthetic */ C1374(Ref$FloatRef ref$FloatRef, C1395 c1395, InterfaceC1398 interfaceC1398, C1396 c1396) {
        this.f1900 = 2;
        this.f1898 = ref$FloatRef;
        this.f1899 = c1395;
        this.f1896 = interfaceC1398;
        this.f1897 = c1396;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    @Override // p068.InterfaceC7387
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.f1900;
        Object obj2 = this.f1897;
        Object obj3 = this.f1896;
        Object obj4 = this.f1899;
        Object obj5 = this.f1898;
        switch (i) {
            case 0:
                return ContentInViewNode$launchAnimation$2.C00361.invokeSuspend$lambda$0((C1365) obj5, (C1328) obj4, (InterfaceC6284) obj2, (InterfaceC1398) obj3, ((Float) obj).floatValue());
            case 1:
                return DefaultFlingBehavior$performFling$2.invokeSuspend$lambda$0((Ref$FloatRef) obj5, (InterfaceC1348) obj4, (Ref$FloatRef) obj2, (C1367) obj3, (C1191) obj);
            default:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj5;
                C1395 c1395 = (C1395) obj4;
                InterfaceC1398 interfaceC1398 = (InterfaceC1398) obj3;
                C1396 c1396 = (C1396) obj2;
                C1191 c1191 = (C1191) obj;
                float fFloatValue = ((Number) ((AbstractC2182) c1191.f1528).getValue()).floatValue() - ref$FloatRef.element;
                if (AbstractC1362.m1857(fFloatValue)) {
                    if (((Boolean) c1396.invoke(Float.valueOf(ref$FloatRef.element))).booleanValue()) {
                        c1191.m1606();
                    }
                } else if (AbstractC1362.m1857(fFloatValue - c1395.m1909(interfaceC1398, fFloatValue))) {
                    ref$FloatRef.element += fFloatValue;
                    if (((Boolean) c1396.invoke(Float.valueOf(ref$FloatRef.element))).booleanValue()) {
                    }
                } else {
                    c1191.m1606();
                }
                return C6008.f15084;
        }
    }

    public /* synthetic */ C1374(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1900 = i;
        this.f1898 = obj;
        this.f1899 = obj2;
        this.f1897 = obj3;
        this.f1896 = obj4;
    }
}

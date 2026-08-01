package androidx.compose.runtime.tooling;

import androidx.compose.runtime.C1369;
import androidx.compose.runtime.composer.gapbuffer.AbstractC1229;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import io.ktor.util.C4211;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4749;

/* JADX INFO: renamed from: androidx.compose.runtime.tooling.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1295 implements InterfaceC4644 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f3783;

    public AbstractC1295(int i) {
        switch (i) {
            case 1:
                this.f3783 = new ArrayList();
                break;
            default:
                this.f3783 = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract void mo2301(String[] strArr);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m2302(int i, Object obj, AbstractC1229 abstractC1229, Object obj2) {
        if (AbstractC4395.m8907(obj, C1369.f3974)) {
            m2303(i, abstractC1229, null);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo982() {
        mo2301((String[]) this.f3783.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m2303(int i, AbstractC1229 abstractC1229, Object obj) {
        this.f3783.add(new C1294(i, null, null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean m2304(int i, AbstractC1229 abstractC1229, Object obj) {
        ArrayList arrayList = abstractC1229.f3533;
        if (arrayList == null) {
            m2303(i, abstractC1229, null);
            return true;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof C1230)) {
                if (!(obj2 instanceof AbstractC1229)) {
                    C4211.m8592(obj2, "Unexpected child source info ");
                    break;
                }
                if (m2304(i, (AbstractC1229) obj2, obj)) {
                    m2303(0, abstractC1229, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                m2303(0, abstractC1229, obj2);
                return true;
            }
            i2++;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public InterfaceC4643 mo985(C4688 c4688) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public void mo986(Object obj) {
        if (obj instanceof String) {
            this.f3783.add((String) obj);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public void mo983(C4749 c4749) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4644
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo987(C4688 c4688, C4691 c4691) {
    }
}

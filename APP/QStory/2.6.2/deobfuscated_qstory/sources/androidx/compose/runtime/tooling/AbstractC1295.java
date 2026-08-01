package androidx.compose.runtime.tooling;

import androidx.compose.runtime.C1369;
import androidx.compose.runtime.composer.gapbuffer.AbstractC1229;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import io.ktor.util.C4210;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4748;

/* JADX INFO: renamed from: androidx.compose.runtime.tooling.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1295 implements InterfaceC4643 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f3782;

    public AbstractC1295(int i) {
        switch (i) {
            case 1:
                this.f3782 = new ArrayList();
                break;
            default:
                this.f3782 = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract void mo2291(String[] strArr);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m2292(int i, Object obj, AbstractC1229 abstractC1229, Object obj2) {
        if (AbstractC4394.m8917(obj, C1369.f3973)) {
            m2293(i, abstractC1229, null);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo980() {
        mo2291((String[]) this.f3782.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m2293(int i, AbstractC1229 abstractC1229, Object obj) {
        this.f3782.add(new C1294(i, null, null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean m2294(int i, AbstractC1229 abstractC1229, Object obj) {
        ArrayList arrayList = abstractC1229.f3532;
        if (arrayList == null) {
            m2293(i, abstractC1229, null);
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
                    C4210.m8602(obj2, "Unexpected child source info ");
                    break;
                }
                if (m2294(i, (AbstractC1229) obj2, obj)) {
                    m2293(0, abstractC1229, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                m2293(0, abstractC1229, obj2);
                return true;
            }
            i2++;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo984(Object obj) {
        if (obj instanceof String) {
            this.f3782.add((String) obj);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC4642 mo986(C4687 c4687) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo981(C4748 c4748) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public void mo985(C4687 c4687, C4690 c4690) {
    }
}

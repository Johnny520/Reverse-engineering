package androidx.compose.runtime.tooling;

import androidx.compose.runtime.C2204;
import androidx.compose.runtime.composer.gapbuffer.AbstractC2064;
import androidx.compose.runtime.composer.gapbuffer.C2065;
import io.ktor.util.C5043;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5475;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5581;

/* JADX INFO: renamed from: androidx.compose.runtime.tooling.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2130 implements InterfaceC5476 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f4128;

    public AbstractC2130(int i) {
        switch (i) {
            case 1:
                this.f4128 = new ArrayList();
                break;
            default:
                this.f4128 = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract void mo2861(String[] strArr);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m2862(int i, Object obj, AbstractC2064 abstractC2064, Object obj2) {
        if (AbstractC5227.m9466(obj, C2204.f4319)) {
            m2863(i, abstractC2064, null);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo1542() {
        mo2861((String[]) this.f4128.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m2863(int i, AbstractC2064 abstractC2064, Object obj) {
        this.f4128.add(new C2129(i, null, null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean m2864(int i, AbstractC2064 abstractC2064, Object obj) {
        ArrayList arrayList = abstractC2064.f3878;
        if (arrayList == null) {
            m2863(i, abstractC2064, null);
            return true;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof C2065)) {
                if (!(obj2 instanceof AbstractC2064)) {
                    C5043.m9151(obj2, "Unexpected child source info ");
                    break;
                }
                if (m2864(i, (AbstractC2064) obj2, obj)) {
                    m2863(0, abstractC2064, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                m2863(0, abstractC2064, obj2);
                return true;
            }
            i2++;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public InterfaceC5475 mo1545(C5520 c5520) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public void mo1546(Object obj) {
        if (obj instanceof String) {
            this.f4128.add((String) obj);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public void mo1543(C5581 c5581) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC5476
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo1547(C5520 c5520, C5523 c5523) {
    }
}

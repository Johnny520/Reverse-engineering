package kotlinx.serialization.json.internal;

import io.ktor.util.C5043;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC5227;
import p104.AbstractC7977;
import p104.AbstractC8005;
import p104.C7979;
import p104.C7981;
import p104.C7984;
import p104.C7986;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6334 extends C6331 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f15563;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public String f15564;

    @Override // kotlinx.serialization.json.internal.C6331
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo11287(String str, AbstractC8005 abstractC8005) {
        str.getClass();
        abstractC8005.getClass();
        if (!this.f15563) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f15552;
            String str2 = this.f15564;
            if (str2 == null) {
                AbstractC5227.m9467("tag");
                throw null;
            }
            linkedHashMap.put(str2, abstractC8005);
            this.f15563 = true;
            return;
        }
        if (abstractC8005 instanceof AbstractC7977) {
            this.f15564 = ((AbstractC7977) abstractC8005).mo12982();
            this.f15563 = false;
        } else {
            if (abstractC8005 instanceof C7981) {
                throw AbstractC6339.m11302(C7979.f19456);
            }
            if (abstractC8005 instanceof C7986) {
                throw AbstractC6339.m11302(C7984.f19464);
            }
            C5043.m9170();
        }
    }

    @Override // kotlinx.serialization.json.internal.C6331
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final AbstractC8005 mo11290() {
        return new C7981((LinkedHashMap) this.f15552);
    }
}

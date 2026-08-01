package p088;

import java.util.List;
import kotlin.collections.EmptyList;
import p087.C7078;
import p087.C7135;
import p091.C7198;
import p091.InterfaceC7191;
import p253.AbstractC8190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7151 implements InterfaceC7191 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C7078 f19115;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7151 f19114 = new C7151();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f19113 = "kotlinx.serialization.json.JsonObject";

    public C7151() {
        C7135 c7135 = C7135.f19089;
        C7171 c7171 = C7171.f19139;
        InterfaceC7191 descriptor = c7135.getDescriptor();
        InterfaceC7191 descriptor2 = c7171.getDescriptor();
        descriptor.getClass();
        descriptor2.getClass();
        this.f19115 = new C7078("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
    }

    @Override // p091.InterfaceC7191
    public final List getAnnotations() {
        this.f19115.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p091.InterfaceC7191
    public final AbstractC8190 getKind() {
        this.f19115.getClass();
        return C7198.f19208;
    }

    @Override // p091.InterfaceC7191
    public final boolean isInline() {
        this.f19115.getClass();
        return false;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12379(int i) {
        this.f19115.getClass();
        return String.valueOf(i);
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12380() {
        this.f19115.getClass();
        return 2;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12381(String str) {
        str.getClass();
        return this.f19115.mo12381(str);
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo12410() {
        this.f19115.getClass();
        return false;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12382() {
        return f19113;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC7191 mo12383(int i) {
        return this.f19115.mo12383(i);
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12384(int i) {
        return this.f19115.mo12384(i);
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12385(int i) {
        this.f19115.mo12385(i);
        return false;
    }
}

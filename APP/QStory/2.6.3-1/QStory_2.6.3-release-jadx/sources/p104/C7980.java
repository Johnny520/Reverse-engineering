package p104;

import java.util.List;
import kotlin.collections.EmptyList;
import p103.C7907;
import p103.C7964;
import p107.C8027;
import p107.InterfaceC8020;
import p269.AbstractC9019;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7980 implements InterfaceC8020 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C7907 f19460;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7980 f19459 = new C7980();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f19458 = "kotlinx.serialization.json.JsonObject";

    public C7980() {
        C7964 c7964 = C7964.f19434;
        C8000 c8000 = C8000.f19484;
        InterfaceC8020 descriptor = c7964.getDescriptor();
        InterfaceC8020 descriptor2 = c8000.getDescriptor();
        descriptor.getClass();
        descriptor2.getClass();
        this.f19460 = new C7907("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
    }

    @Override // p107.InterfaceC8020
    public final List getAnnotations() {
        this.f19460.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p107.InterfaceC8020
    public final AbstractC9019 getKind() {
        this.f19460.getClass();
        return C8027.f19553;
    }

    @Override // p107.InterfaceC8020
    public final boolean isInline() {
        this.f19460.getClass();
        return false;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12938(int i) {
        this.f19460.getClass();
        return String.valueOf(i);
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12939() {
        this.f19460.getClass();
        return 2;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12940(String str) {
        str.getClass();
        return this.f19460.mo12940(str);
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo12969() {
        this.f19460.getClass();
        return false;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12941() {
        return f19458;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC8020 mo12942(int i) {
        return this.f19460.mo12942(i);
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12943(int i) {
        return this.f19460.mo12943(i);
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12944(int i) {
        this.f19460.mo12944(i);
        return false;
    }
}

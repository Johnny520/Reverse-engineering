package p103;

import androidx.activity.AbstractC0900;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5971;
import p107.C8027;
import p107.InterfaceC8020;
import p269.AbstractC9019;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7907 implements InterfaceC8020 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8020 f19333;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8020 f19334;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f19335;

    public C7907(String str, InterfaceC8020 interfaceC8020, InterfaceC8020 interfaceC80202) {
        this.f19335 = str;
        this.f19334 = interfaceC8020;
        this.f19333 = interfaceC80202;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7907)) {
            return false;
        }
        C7907 c7907 = (C7907) obj;
        return this.f19335.equals(c7907.f19335) && this.f19334.equals(c7907.f19334) && this.f19333.equals(c7907.f19333);
    }

    @Override // p107.InterfaceC8020
    public final AbstractC9019 getKind() {
        return C8027.f19553;
    }

    public final int hashCode() {
        return this.f19333.hashCode() + ((this.f19334.hashCode() + (this.f19335.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return this.f19335 + '(' + this.f19334 + ", " + this.f19333 + ')';
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12938(int i) {
        return String.valueOf(i);
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12939() {
        return 2;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12940(String str) {
        str.getClass();
        Integer numM10699 = AbstractC5971.m10699(str);
        if (numM10699 != null) {
            return numM10699.intValue();
        }
        C6755.m11869(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12941() {
        return this.f19335;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC8020 mo12942(int i) {
        if (i < 0) {
            C6755.m11873(AbstractC0900.m711(AbstractC0900.m710(i, "Illegal index ", ", "), this.f19335, " expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.f19334;
        }
        if (i2 == 1) {
            return this.f19333;
        }
        C6755.m11870("Unreached");
        return null;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12943(int i) {
        if (i >= 0) {
            return EmptyList.INSTANCE;
        }
        C6755.m11873(AbstractC0900.m711(AbstractC0900.m710(i, "Illegal index ", ", "), this.f19335, " expects only non-negative indices"));
        return null;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12944(int i) {
        if (i >= 0) {
            return false;
        }
        C6755.m11873(AbstractC0900.m711(AbstractC0900.m710(i, "Illegal index ", ", "), this.f19335, " expects only non-negative indices"));
        return false;
    }
}

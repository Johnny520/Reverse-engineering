package androidx.collection;

import bsh.C3466;
import java.util.Iterator;
import p070.InterfaceC7396;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1108 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1286;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f1287;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f1288;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f1289;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f1290;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1108(C1104 c1104, int i) {
        this(c1104.f1339);
        this.f1287 = i;
        switch (i) {
            case 1:
                this.f1286 = c1104;
                this(c1104.f1339);
                break;
            default:
                this.f1286 = c1104;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1288 < this.f1290;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM1422;
        if (!hasNext()) {
            C3466.m5896();
            return null;
        }
        int i = this.f1288;
        int i2 = this.f1287;
        Object obj = this.f1286;
        switch (i2) {
            case 0:
                objM1422 = ((C1104) obj).m1422(i);
                break;
            case 1:
                objM1422 = ((C1104) obj).m1431(i);
                break;
            default:
                objM1422 = ((C1122) obj).f1325[i];
                break;
        }
        this.f1288++;
        this.f1289 = true;
        return objM1422;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1289) {
            C6755.m11870("Call next() before removing an element.");
            return;
        }
        int i = this.f1288 - 1;
        this.f1288 = i;
        int i2 = this.f1287;
        Object obj = this.f1286;
        switch (i2) {
            case 0:
                ((C1104) obj).mo1428(i);
                break;
            case 1:
                ((C1104) obj).mo1428(i);
                break;
            default:
                ((C1122) obj).m1397(i);
                break;
        }
        this.f1290--;
        this.f1289 = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1108(C1122 c1122) {
        this(c1122.f1326);
        this.f1287 = 2;
        this.f1286 = c1122;
    }

    public C1108(int i) {
        this.f1290 = i;
    }
}

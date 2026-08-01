package io.ktor.websocket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import p102.C7890;
import p102.InterfaceC7889;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5102 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f13160;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f13161;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f13162 = 2;

    public C5102(String str) {
        str.getClass();
        this.f13160 = str;
        this.f13161 = new ArrayList(0);
        InterfaceC7889.f19305.getClass();
        List listM12937 = C7890.m12937();
        new ArrayList();
        Iterator it = listM12937.iterator();
        while (it.hasNext()) {
            ((InterfaceC7889) it.next()).getClass();
        }
    }

    public String toString() {
        int i = this.f13162;
        String str = this.f13160;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(' ');
                ArrayList arrayList = this.f13161;
                sb.append(arrayList.isEmpty() ? "" : ", ".concat(AbstractC5176.m9369(arrayList, ",", null, null, null, 62)));
                return sb.toString();
            case 1:
            default:
                return super.toString();
            case 2:
                return str;
        }
    }

    public C5102(ArrayList arrayList, String str) {
        this.f13161 = arrayList;
        this.f13160 = str;
    }

    public C5102(String str, ArrayList arrayList) {
        str.getClass();
        this.f13160 = str;
        this.f13161 = arrayList;
    }
}

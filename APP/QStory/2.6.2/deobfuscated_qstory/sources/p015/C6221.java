package p015;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC4344;
import kotlin.text.AbstractC5143;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p004.AbstractC6098;
import p253.AbstractC8189;
import p305.C8625;
import p305.C8648;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6221 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f17109;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Serializable f17110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Serializable f17111;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f17112;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f17113;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17114;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Object f17115;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Object f17116;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Object f17117;

    public C6221(int i) {
        this.f17114 = i;
        switch (i) {
            case 1:
                break;
            default:
                this.f17111 = "";
                this.f17110 = "";
                this.f17113 = -1;
                this.f17115 = AbstractC8189.m13657("");
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static ArrayList m11660(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iM10151 = AbstractC5143.m10151(str, '&', i, 4);
            if (iM10151 == -1) {
                iM10151 = str.length();
            }
            int iM101512 = AbstractC5143.m10151(str, SignatureVisitor.INSTANCEOF, i, 4);
            if (iM101512 == -1 || iM101512 > iM10151) {
                arrayList.add(str.substring(i, iM10151));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iM101512));
                arrayList.add(str.substring(iM101512 + 1, iM10151));
            }
            i = iM10151 + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p015.C6221.toString():java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世[]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m11661() {
        this.f17112 = new C8648();
        this.f17111 = new int[10][];
        this.f17110 = new C8648[10];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int m11662() {
        int i = this.f17113;
        if (i != -1) {
            return i;
        }
        String str = (String) this.f17112;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8625 m11663() {
        if (this.f17113 == 0) {
            return null;
        }
        return new C8625(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C6222 m11664() {
        ArrayList arrayList;
        String str = (String) this.f17112;
        if (str == null) {
            C5919.m11250("scheme == null");
            return null;
        }
        String strM11452 = AbstractC6098.m11452(0, 0, (String) this.f17111, 7);
        String strM114522 = AbstractC6098.m11452(0, 0, (String) this.f17110, 7);
        String str2 = (String) this.f17109;
        if (str2 == null) {
            C5919.m11250("host == null");
            return null;
        }
        int iM11662 = m11662();
        ArrayList arrayList2 = (ArrayList) this.f17115;
        ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(AbstractC6098.m11452(0, 0, (String) it.next(), 7));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.f17117;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(AbstractC4344.m8832(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? AbstractC6098.m11452(0, 0, str3, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f17116;
        return new C6222(str, strM11452, strM114522, str2, iM11662, arrayList3, arrayList, str4 != null ? AbstractC6098.m11452(0, 0, str4, 7) : null, toString());
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, java.lang.Object, 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m11665(int[] iArr, C8648 c8648) {
        int i = this.f17113;
        if (i == 0 || iArr.length == 0) {
            this.f17112 = c8648;
        }
        int[][] iArr2 = (int[][]) this.f17111;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            ?? r3 = new int[i2][];
            System.arraycopy(iArr2, 0, r3, 0, i);
            this.f17111 = r3;
            ?? r1 = new C8648[i2];
            System.arraycopy((C8648[]) this.f17110, 0, r1, 0, i);
            this.f17110 = r1;
        }
        int[][] iArr3 = (int[][]) this.f17111;
        int i3 = this.f17113;
        iArr3[i3] = iArr;
        ((C8648[]) this.f17110)[i3] = c8648;
        this.f17113 = i3 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m11666(String str, String str2) {
        str.getClass();
        if (((ArrayList) this.f17117) == null) {
            this.f17117 = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) this.f17117;
        arrayList.getClass();
        arrayList.add(AbstractC6098.m11455(0, 0, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList2 = (ArrayList) this.f17117;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? AbstractC6098.m11455(0, 0, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m11667(p015.C6222 r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p015.C6221.m11667(飘花落叶言世兰楪子苏哲.飘花落叶言子楪哲兰苏世, java.lang.String):void");
    }

    public C6221(C8648 c8648) {
        this.f17114 = 1;
        m11661();
        m11665(StateSet.WILD_CARD, c8648);
    }
}

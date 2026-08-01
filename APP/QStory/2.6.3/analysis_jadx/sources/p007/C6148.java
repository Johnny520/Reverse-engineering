package p007;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC4345;
import kotlin.text.AbstractC5144;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p003.AbstractC6089;
import p034.AbstractC6347;
import p305.C8617;
import p305.C8640;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6148 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f16870;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Serializable f16871;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Serializable f16872;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f16873;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f16874;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16875;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Object f16876;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Object f16877;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Object f16878;

    public C6148(int i) {
        this.f16875 = i;
        switch (i) {
            case 1:
                break;
            default:
                this.f16872 = "";
                this.f16871 = "";
                this.f16874 = -1;
                this.f16876 = AbstractC6347.m11916("");
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static ArrayList m11531(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iM10171 = AbstractC5144.m10171(str, '&', i, 4);
            if (iM10171 == -1) {
                iM10171 = str.length();
            }
            int iM101712 = AbstractC5144.m10171(str, SignatureVisitor.INSTANCEOF, i, 4);
            if (iM101712 == -1 || iM101712 > iM10171) {
                arrayList.add(str.substring(i, iM10171));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iM101712));
                arrayList.add(str.substring(iM101712 + 1, iM10171));
            }
            i = iM10171 + 1;
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
        throw new UnsupportedOperationException("Method not decompiled: p007.C6148.toString():java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世[]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m11532() {
        this.f16873 = new C8640();
        this.f16872 = new int[10][];
        this.f16871 = new C8640[10];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int m11533() {
        int i = this.f16874;
        if (i != -1) {
            return i;
        }
        String str = (String) this.f16873;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8617 m11534() {
        if (this.f16874 == 0) {
            return null;
        }
        return new C8617(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C6149 m11535() {
        ArrayList arrayList;
        String str = (String) this.f16873;
        if (str == null) {
            C5925.m11311("scheme == null");
            return null;
        }
        String strM11445 = AbstractC6089.m11445(0, 0, (String) this.f16872, 7);
        String strM114452 = AbstractC6089.m11445(0, 0, (String) this.f16871, 7);
        String str2 = (String) this.f16870;
        if (str2 == null) {
            C5925.m11311("host == null");
            return null;
        }
        int iM11533 = m11533();
        ArrayList arrayList2 = (ArrayList) this.f16876;
        ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(AbstractC6089.m11445(0, 0, (String) it.next(), 7));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.f16878;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(AbstractC4345.m8822(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? AbstractC6089.m11445(0, 0, str3, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f16877;
        return new C6149(str, strM11445, strM114452, str2, iM11533, arrayList3, arrayList, str4 != null ? AbstractC6089.m11445(0, 0, str4, 7) : null, toString());
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, java.lang.Object, 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲苏兰世[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m11536(int[] iArr, C8640 c8640) {
        int i = this.f16874;
        if (i == 0 || iArr.length == 0) {
            this.f16873 = c8640;
        }
        int[][] iArr2 = (int[][]) this.f16872;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            ?? r3 = new int[i2][];
            System.arraycopy(iArr2, 0, r3, 0, i);
            this.f16872 = r3;
            ?? r1 = new C8640[i2];
            System.arraycopy((C8640[]) this.f16871, 0, r1, 0, i);
            this.f16871 = r1;
        }
        int[][] iArr3 = (int[][]) this.f16872;
        int i3 = this.f16874;
        iArr3[i3] = iArr;
        ((C8640[]) this.f16871)[i3] = c8640;
        this.f16874 = i3 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m11537(String str, String str2) {
        str.getClass();
        if (((ArrayList) this.f16878) == null) {
            this.f16878 = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) this.f16878;
        arrayList.getClass();
        arrayList.add(AbstractC6089.m11448(0, 0, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList2 = (ArrayList) this.f16878;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? AbstractC6089.m11448(0, 0, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m11538(p007.C6149 r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007.C6148.m11538(飘花落叶言世兰子哲苏楪.飘花落叶言子楪哲兰苏世, java.lang.String):void");
    }

    public C6148(C8640 c8640) {
        this.f16875 = 1;
        m11532();
        m11536(StateSet.WILD_CARD, c8640);
    }
}

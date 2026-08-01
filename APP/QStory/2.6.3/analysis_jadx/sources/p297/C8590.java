package p297;

import androidx.compose.animation.core.C0318;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.util.AbstractC2867;
import com.android.dx.cf.attrib.AttCode;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.pool.TypePool;
import p144.C7547;
import p283.C8382;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8590 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f23962;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f23963;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f23964;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8594 f23965 = new C8594(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f23966;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Function f23967;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int[] f23968;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f23969;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C8587 f23970;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C8587 f23971;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C0318 f23972;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C0318 f23973;

    public C8590(Function function) {
        this.f23967 = function;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8587 m14211(int i, String str, String str2) {
        C8587 c8587 = new C8587(this.f23965, str, str2, i);
        if (this.f23970 == null) {
            this.f23970 = c8587;
        } else {
            this.f23971.f23934 = c8587;
        }
        this.f23971 = c8587;
        return c8587;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14212(String str, String str2) {
        C0318 c0318 = new C0318();
        C8594 c8594 = this.f23965;
        c0318.f1072 = c8594.m14228(str);
        c0318.f1070 = c8594.m14228(str2);
        if (this.f23972 == null) {
            this.f23972 = c0318;
        } else {
            this.f23973.f1071 = c0318;
        }
        this.f23973 = c0318;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14213(String str, String str2, String[] strArr) {
        this.f23966 = 52;
        this.f23964 = 49;
        C8594 c8594 = this.f23965;
        c8594.f24057 = str;
        this.f23963 = c8594.m14227(7, str).f23133;
        this.f23962 = str2 == null ? 0 : c8594.m14227(7, str2).f23133;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        int length = strArr.length;
        this.f23969 = length;
        this.f23968 = new int[length];
        for (int i = 0; i < this.f23969; i++) {
            this.f23968[i] = c8594.m14227(7, strArr[i]).f23133;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] m14214() {
        int i;
        int i2 = (this.f23969 * 2) + 24;
        int i3 = 0;
        for (C0318 c0318 = this.f23972; c0318 != null; c0318 = (C0318) c0318.f1071) {
            i3++;
            i2 += 8;
        }
        C8587 c8587 = this.f23970;
        int i4 = 0;
        while (true) {
            int i5 = 8;
            if (c8587 == null) {
                C8594 c8594 = this.f23965;
                int i6 = i2 + c8594.f24053.f23199;
                int i7 = c8594.f24054;
                if (i7 > 65535) {
                    C7547.m12766(i7, c8594.f24057, ", constantPoolCount ", "Class too large: ");
                    return null;
                }
                C8382 c8382 = new C8382(i6);
                c8382.m13940(-889275714);
                c8382.m13940(this.f23966);
                c8382.m13939(i7);
                C8382 c83822 = c8594.f24053;
                c8382.m13933(c83822.f23200, c83822.f23199);
                c8382.m13939(this.f23964);
                c8382.m13939(this.f23963);
                c8382.m13939(this.f23962);
                c8382.m13939(this.f23969);
                for (int i8 = 0; i8 < this.f23969; i8++) {
                    c8382.m13939(this.f23968[i8]);
                }
                c8382.m13939(i3);
                for (C0318 c03182 = this.f23972; c03182 != null; c03182 = (C0318) c03182.f1071) {
                    c8382.m13939(1);
                    c8382.m13939(c03182.f1072);
                    c8382.m13939(c03182.f1070);
                    c8382.m13939(0);
                }
                c8382.m13939(i4);
                boolean z = false;
                for (C8587 c85872 = this.f23970; c85872 != null; c85872 = c85872.f23934) {
                    z |= c85872.f23939;
                    C8594 c85942 = c85872.f23933;
                    c8382.m13939(c85872.f23932);
                    c8382.m13939(c85872.f23931);
                    c8382.m13939(c85872.f23929);
                    C8382 c83823 = c85872.f23947;
                    c8382.m13939(c83823.f23199 > 0 ? 1 : 0);
                    int i9 = c83823.f23199;
                    if (i9 > 0) {
                        int i10 = i9 + 12;
                        C8382 c83824 = c85872.f23945;
                        if (c83824 != null) {
                            i10 += c83824.f23199 + 8;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        c8382.m13939(c85942.m14228(AttCode.ATTRIBUTE_NAME));
                        c8382.m13940(i10);
                        c8382.m13939(c85872.f23942);
                        c8382.m13939(c85872.f23946);
                        c8382.m13940(c83823.f23199);
                        c8382.m13933(c83823.f23200, c83823.f23199);
                        c8382.m13939(0);
                        c8382.m13939(i);
                        if (c85872.f23945 != null) {
                            c8382.m13939(c85942.m14228("StackMapTable"));
                            c8382.m13940(c85872.f23945.f23199 + 2);
                            c8382.m13939(c85872.f23944);
                            C8382 c83825 = c85872.f23945;
                            c8382.m13933(c83825.f23200, c83825.f23199);
                        }
                    }
                }
                c8382.m13939(0);
                if (!z) {
                    return c8382.f23200;
                }
                C5554.m10882();
                return null;
            }
            i4++;
            C8594 c85943 = c8587.f23933;
            C8382 c83826 = c8587.f23947;
            int i11 = c83826.f23199;
            if (i11 > 0) {
                if (i11 > 65535) {
                    throw new JSONException("Method too large: " + c85943.f24057 + "." + c8587.f23930 + " " + c8587.f23943 + ", length " + c83826.f23199);
                }
                c85943.m14228(AttCode.ATTRIBUTE_NAME);
                int i12 = c83826.f23199 + 26;
                if (c8587.f23945 != null) {
                    c85943.m14228("StackMapTable");
                    i5 = c8587.f23945.f23199 + 8 + i12;
                } else {
                    i5 = i12;
                }
            }
            i2 += i5;
            c8587 = c8587.f23934;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class m14215(String str) {
        str.getClass();
        switch (str) {
            case "java/util/List":
                return List.class;
            case "java/util/ArrayList":
                return ArrayList.class;
            case "java/lang/Object":
                return Object.class;
            default:
                String strReplace = str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                Function function = this.f23967;
                Class cls = function != null ? (Class) function.apply(strReplace) : null;
                return cls == null ? AbstractC2867.m5929(strReplace) : cls;
        }
    }
}

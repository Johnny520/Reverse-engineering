package p313;

import androidx.compose.animation.core.C1164;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.android.p002dx.p003cf.attrib.AttCode;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.pool.TypePool;
import p160.C8376;
import p299.C9211;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9419 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f24307;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f24308;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f24309;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9423 f24310 = new C9423(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f24311;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Function f24312;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int[] f24313;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f24314;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C9416 f24315;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C9416 f24316;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C1164 f24317;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C1164 f24318;

    public C9419(Function function) {
        this.f24312 = function;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C9416 m14770(int i, String str, String str2) {
        C9416 c9416 = new C9416(this.f24310, str, str2, i);
        if (this.f24315 == null) {
            this.f24315 = c9416;
        } else {
            this.f24316.f24279 = c9416;
        }
        this.f24316 = c9416;
        return c9416;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14771(String str, String str2) {
        C1164 c1164 = new C1164();
        C9423 c9423 = this.f24310;
        c1164.f1417 = c9423.m14787(str);
        c1164.f1415 = c9423.m14787(str2);
        if (this.f24317 == null) {
            this.f24317 = c1164;
        } else {
            this.f24318.f1416 = c1164;
        }
        this.f24318 = c1164;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14772(String str, String str2, String[] strArr) {
        this.f24311 = 52;
        this.f24309 = 49;
        C9423 c9423 = this.f24310;
        c9423.f24402 = str;
        this.f24308 = c9423.m14786(7, str).f23478;
        this.f24307 = str2 == null ? 0 : c9423.m14786(7, str2).f23478;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        int length = strArr.length;
        this.f24314 = length;
        this.f24313 = new int[length];
        for (int i = 0; i < this.f24314; i++) {
            this.f24313[i] = c9423.m14786(7, strArr[i]).f23478;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] m14773() {
        int i;
        int i2 = (this.f24314 * 2) + 24;
        int i3 = 0;
        for (C1164 c1164 = this.f24317; c1164 != null; c1164 = (C1164) c1164.f1416) {
            i3++;
            i2 += 8;
        }
        C9416 c9416 = this.f24315;
        int i4 = 0;
        while (true) {
            int i5 = 8;
            if (c9416 == null) {
                C9423 c9423 = this.f24310;
                int i6 = i2 + c9423.f24398.f23544;
                int i7 = c9423.f24399;
                if (i7 > 65535) {
                    C8376.m13325(i7, c9423.f24402, ", constantPoolCount ", "Class too large: ");
                    return null;
                }
                C9211 c9211 = new C9211(i6);
                c9211.m14499(-889275714);
                c9211.m14499(this.f24311);
                c9211.m14498(i7);
                C9211 c92112 = c9423.f24398;
                c9211.m14492(c92112.f23545, c92112.f23544);
                c9211.m14498(this.f24309);
                c9211.m14498(this.f24308);
                c9211.m14498(this.f24307);
                c9211.m14498(this.f24314);
                for (int i8 = 0; i8 < this.f24314; i8++) {
                    c9211.m14498(this.f24313[i8]);
                }
                c9211.m14498(i3);
                for (C1164 c11642 = this.f24317; c11642 != null; c11642 = (C1164) c11642.f1416) {
                    c9211.m14498(1);
                    c9211.m14498(c11642.f1417);
                    c9211.m14498(c11642.f1415);
                    c9211.m14498(0);
                }
                c9211.m14498(i4);
                boolean z = false;
                for (C9416 c94162 = this.f24315; c94162 != null; c94162 = c94162.f24279) {
                    z |= c94162.f24284;
                    C9423 c94232 = c94162.f24278;
                    c9211.m14498(c94162.f24277);
                    c9211.m14498(c94162.f24276);
                    c9211.m14498(c94162.f24274);
                    C9211 c92113 = c94162.f24292;
                    c9211.m14498(c92113.f23544 > 0 ? 1 : 0);
                    int i9 = c92113.f23544;
                    if (i9 > 0) {
                        int i10 = i9 + 12;
                        C9211 c92114 = c94162.f24290;
                        if (c92114 != null) {
                            i10 += c92114.f23544 + 8;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        c9211.m14498(c94232.m14787(AttCode.ATTRIBUTE_NAME));
                        c9211.m14499(i10);
                        c9211.m14498(c94162.f24287);
                        c9211.m14498(c94162.f24291);
                        c9211.m14499(c92113.f23544);
                        c9211.m14492(c92113.f23545, c92113.f23544);
                        c9211.m14498(0);
                        c9211.m14498(i);
                        if (c94162.f24290 != null) {
                            c9211.m14498(c94232.m14787("StackMapTable"));
                            c9211.m14499(c94162.f24290.f23544 + 2);
                            c9211.m14498(c94162.f24289);
                            C9211 c92115 = c94162.f24290;
                            c9211.m14492(c92115.f23545, c92115.f23544);
                        }
                    }
                }
                c9211.m14498(0);
                if (!z) {
                    return c9211.f23545;
                }
                C6385.m11441();
                return null;
            }
            i4++;
            C9423 c94233 = c9416.f24278;
            C9211 c92116 = c9416.f24292;
            int i11 = c92116.f23544;
            if (i11 > 0) {
                if (i11 > 65535) {
                    throw new JSONException("Method too large: " + c94233.f24402 + "." + c9416.f24275 + " " + c9416.f24288 + ", length " + c92116.f23544);
                }
                c94233.m14787(AttCode.ATTRIBUTE_NAME);
                int i12 = c92116.f23544 + 26;
                if (c9416.f24290 != null) {
                    c94233.m14787("StackMapTable");
                    i5 = c9416.f24290.f23544 + 8 + i12;
                } else {
                    i5 = i12;
                }
            }
            i2 += i5;
            c9416 = c9416.f24279;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class m14774(String str) {
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
                Function function = this.f24312;
                Class cls = function != null ? (Class) function.apply(strReplace) : null;
                return cls == null ? AbstractC3700.m6489(strReplace) : cls;
        }
    }
}

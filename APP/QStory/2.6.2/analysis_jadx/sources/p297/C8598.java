package p297;

import androidx.compose.animation.core.C0318;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.util.AbstractC2866;
import com.android.dx.cf.attrib.AttCode;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.pool.TypePool;
import p144.C7546;
import p283.C8381;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8598 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f23971;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f23972;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f23973;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8602 f23974 = new C8602(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f23975;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Function f23976;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int[] f23977;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f23978;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C8595 f23979;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C8595 f23980;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C0318 f23981;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C0318 f23982;

    public C8598(Function function) {
        this.f23976 = function;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8595 m14192(int i, String str, String str2) {
        C8595 c8595 = new C8595(this.f23974, str, str2, i);
        if (this.f23979 == null) {
            this.f23979 = c8595;
        } else {
            this.f23980.f23943 = c8595;
        }
        this.f23980 = c8595;
        return c8595;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14193(String str, String str2) {
        C0318 c0318 = new C0318();
        C8602 c8602 = this.f23974;
        c0318.f1072 = c8602.m14209(str);
        c0318.f1070 = c8602.m14209(str2);
        if (this.f23981 == null) {
            this.f23981 = c0318;
        } else {
            this.f23982.f1071 = c0318;
        }
        this.f23982 = c0318;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14194(String str, String str2, String[] strArr) {
        this.f23975 = 52;
        this.f23973 = 49;
        C8602 c8602 = this.f23974;
        c8602.f24066 = str;
        this.f23972 = c8602.m14208(7, str).f23134;
        this.f23971 = str2 == null ? 0 : c8602.m14208(7, str2).f23134;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        int length = strArr.length;
        this.f23978 = length;
        this.f23977 = new int[length];
        for (int i = 0; i < this.f23978; i++) {
            this.f23977[i] = c8602.m14208(7, strArr[i]).f23134;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] m14195() {
        int i;
        int i2 = (this.f23978 * 2) + 24;
        int i3 = 0;
        for (C0318 c0318 = this.f23981; c0318 != null; c0318 = (C0318) c0318.f1071) {
            i3++;
            i2 += 8;
        }
        C8595 c8595 = this.f23979;
        int i4 = 0;
        while (true) {
            int i5 = 8;
            if (c8595 == null) {
                C8602 c8602 = this.f23974;
                int i6 = i2 + c8602.f24062.f23200;
                int i7 = c8602.f24063;
                if (i7 > 65535) {
                    C7546.m12737(i7, c8602.f24066, ", constantPoolCount ", "Class too large: ");
                    return null;
                }
                C8381 c8381 = new C8381(i6);
                c8381.m13923(-889275714);
                c8381.m13923(this.f23975);
                c8381.m13922(i7);
                C8381 c83812 = c8602.f24062;
                c8381.m13916(c83812.f23201, c83812.f23200);
                c8381.m13922(this.f23973);
                c8381.m13922(this.f23972);
                c8381.m13922(this.f23971);
                c8381.m13922(this.f23978);
                for (int i8 = 0; i8 < this.f23978; i8++) {
                    c8381.m13922(this.f23977[i8]);
                }
                c8381.m13922(i3);
                for (C0318 c03182 = this.f23981; c03182 != null; c03182 = (C0318) c03182.f1071) {
                    c8381.m13922(1);
                    c8381.m13922(c03182.f1072);
                    c8381.m13922(c03182.f1070);
                    c8381.m13922(0);
                }
                c8381.m13922(i4);
                boolean z = false;
                for (C8595 c85952 = this.f23979; c85952 != null; c85952 = c85952.f23943) {
                    z |= c85952.f23948;
                    C8602 c86022 = c85952.f23942;
                    c8381.m13922(c85952.f23941);
                    c8381.m13922(c85952.f23940);
                    c8381.m13922(c85952.f23938);
                    C8381 c83813 = c85952.f23956;
                    c8381.m13922(c83813.f23200 > 0 ? 1 : 0);
                    int i9 = c83813.f23200;
                    if (i9 > 0) {
                        int i10 = i9 + 12;
                        C8381 c83814 = c85952.f23954;
                        if (c83814 != null) {
                            i10 += c83814.f23200 + 8;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        c8381.m13922(c86022.m14209(AttCode.ATTRIBUTE_NAME));
                        c8381.m13923(i10);
                        c8381.m13922(c85952.f23951);
                        c8381.m13922(c85952.f23955);
                        c8381.m13923(c83813.f23200);
                        c8381.m13916(c83813.f23201, c83813.f23200);
                        c8381.m13922(0);
                        c8381.m13922(i);
                        if (c85952.f23954 != null) {
                            c8381.m13922(c86022.m14209("StackMapTable"));
                            c8381.m13923(c85952.f23954.f23200 + 2);
                            c8381.m13922(c85952.f23953);
                            C8381 c83815 = c85952.f23954;
                            c8381.m13916(c83815.f23201, c83815.f23200);
                        }
                    }
                }
                c8381.m13922(0);
                if (!z) {
                    return c8381.f23201;
                }
                C5553.m10825();
                return null;
            }
            i4++;
            C8602 c86023 = c8595.f23942;
            C8381 c83816 = c8595.f23956;
            int i11 = c83816.f23200;
            if (i11 > 0) {
                if (i11 > 65535) {
                    throw new JSONException("Method too large: " + c86023.f24066 + "." + c8595.f23939 + " " + c8595.f23952 + ", length " + c83816.f23200);
                }
                c86023.m14209(AttCode.ATTRIBUTE_NAME);
                int i12 = c83816.f23200 + 26;
                if (c8595.f23954 != null) {
                    c86023.m14209("StackMapTable");
                    i5 = c8595.f23954.f23200 + 8 + i12;
                } else {
                    i5 = i12;
                }
            }
            i2 += i5;
            c8595 = c8595.f23943;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class m14196(String str) {
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
                Function function = this.f23976;
                Class cls = function != null ? (Class) function.apply(strReplace) : null;
                return cls == null ? AbstractC2866.m5884(strReplace) : cls;
        }
    }
}

package p209;

import com.android.dx.io.Opcodes;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7918 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int f21938 = 66305;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f21939;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m13414(int i) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i2 = i & Opcodes.CONST_METHOD_TYPE;
        String str = "Invalid";
        sb.append((Object) (i2 == 1 ? "Strategy.Simple" : i2 == 2 ? "Strategy.HighQuality" : i2 == 3 ? "Strategy.Balanced" : i2 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i3 = (i >> 8) & Opcodes.CONST_METHOD_TYPE;
        sb.append((Object) (i3 == 1 ? "Strictness.None" : i3 == 2 ? "Strictness.Loose" : i3 == 3 ? "Strictness.Normal" : i3 == 4 ? "Strictness.Strict" : i3 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i4 = (i >> 16) & Opcodes.CONST_METHOD_TYPE;
        if (i4 == 1) {
            str = "WordBreak.None";
        } else if (i4 == 2) {
            str = "WordBreak.Phrase";
        } else if (i4 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7918) {
            return this.f21939 == ((C7918) obj).f21939;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21939);
    }

    public final String toString() {
        return m13414(this.f21939);
    }
}

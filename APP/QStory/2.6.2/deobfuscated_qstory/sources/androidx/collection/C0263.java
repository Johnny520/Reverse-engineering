package androidx.collection;

import java.util.Arrays;
import kotlin.collections.AbstractC4346;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p007.AbstractC6136;
import p187.AbstractC7771;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0263 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public /* synthetic */ int f948;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public /* synthetic */ long[] f949;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public /* synthetic */ Object[] f950;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public /* synthetic */ boolean f951;

    public C0263(int i) {
        if (i == 0) {
            this.f949 = AbstractC7771.f21083;
            this.f950 = AbstractC7771.f21082;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f949 = new long[i5];
        this.f950 = new Object[i5];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        C0263 c0263 = (C0263) objClone;
        c0263.f949 = (long[]) this.f949.clone();
        c0263.f950 = (Object[]) this.f950.clone();
        return c0263;
    }

    public final String toString() {
        if (m827() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f948 * 28);
        sb.append('{');
        int i = this.f948;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m823(i2));
            sb.append(SignatureVisitor.INSTANCEOF);
            Object objM828 = m828(i2);
            if (objM828 != sb) {
                sb.append(objM828);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m821(long j) {
        int iM13095 = AbstractC7771.m13095(this.f949, this.f948, j);
        if (iM13095 >= 0) {
            Object[] objArr = this.f950;
            Object obj = objArr[iM13095];
            Object obj2 = AbstractC0267.f962;
            if (obj != obj2) {
                objArr[iM13095] = obj2;
                this.f951 = true;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m822(Object obj, long j) {
        Object obj2 = AbstractC0267.f962;
        int iM13095 = AbstractC7771.m13095(this.f949, this.f948, j);
        if (iM13095 >= 0) {
            this.f950[iM13095] = obj;
            return;
        }
        int i = ~iM13095;
        int i2 = this.f948;
        if (i < i2) {
            Object[] objArr = this.f950;
            if (objArr[i] == obj2) {
                this.f949[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f951) {
            long[] jArr = this.f949;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f950;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f951 = false;
                this.f948 = i3;
                i = ~AbstractC7771.m13095(this.f949, i3, j);
            }
        }
        int i5 = this.f948;
        if (i5 >= this.f949.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.f949 = Arrays.copyOf(this.f949, i9);
            this.f950 = Arrays.copyOf(this.f950, i9);
        }
        int i10 = this.f948;
        if (i10 - i != 0) {
            long[] jArr2 = this.f949;
            int i11 = i + 1;
            AbstractC4346.m8835(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.f950;
            AbstractC4346.m8839(i11, i, objArr3, this.f948, objArr3);
        }
        this.f949[i] = j;
        this.f950[i] = obj;
        this.f948++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long m823(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f948)) {
            C5919.m11249(AbstractC6136.m11556(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.f951) {
            long[] jArr = this.f949;
            Object[] objArr = this.f950;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC0267.f962) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f951 = false;
            this.f948 = i3;
        }
        return this.f949[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m824(long j) {
        if (this.f951) {
            int i = this.f948;
            long[] jArr = this.f949;
            Object[] objArr = this.f950;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC0267.f962) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f951 = false;
            this.f948 = i2;
        }
        return AbstractC7771.m13095(this.f949, this.f948, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m825(long j) {
        Object obj;
        int iM13095 = AbstractC7771.m13095(this.f949, this.f948, j);
        if (iM13095 < 0 || (obj = this.f950[iM13095]) == AbstractC0267.f962) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m826() {
        int i = this.f948;
        Object[] objArr = this.f950;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f948 = 0;
        this.f951 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m827() {
        if (this.f951) {
            int i = this.f948;
            long[] jArr = this.f949;
            Object[] objArr = this.f950;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC0267.f962) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f951 = false;
            this.f948 = i2;
        }
        return this.f948;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Object m828(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f948)) {
            C5919.m11249(AbstractC6136.m11556(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.f951) {
            long[] jArr = this.f949;
            Object[] objArr = this.f950;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC0267.f962) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f951 = false;
            this.f948 = i3;
        }
        return this.f950[i];
    }

    public /* synthetic */ C0263(Object obj) {
        this(10);
    }
}

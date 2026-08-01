package androidx.compose.runtime.snapshots;

import androidx.collection.C1082;
import androidx.collection.C1083;
import androidx.collection.C1099;
import androidx.compose.runtime.C2148;
import androidx.compose.runtime.C2196;
import androidx.compose.runtime.C2197;
import androidx.compose.runtime.collection.C2059;
import com.bumptech.glide.AbstractC3887;
import java.util.HashMap;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2113 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C1099 f4075;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f4076;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7387 f4077;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f4081;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f4084;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f4074 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1083 f4073 = AbstractC3887.m7223();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1083 f4072 = new C1083();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1082 f4080 = new C1082();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2059 f4079 = new C2059(0, new C2197[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C2148 f4083 = new C2148(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C1083 f4082 = AbstractC3887.m7223();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final HashMap f4078 = new HashMap();

    public C2113(InterfaceC7387 interfaceC7387) {
        this.f4077 = interfaceC7387;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2813(InterfaceC7387 interfaceC7387) {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        long j3;
        C1083 c1083 = this.f4072;
        long[] jArr3 = c1083.f1226;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j4 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = c1083.f1225[i6];
                        j2 = j5;
                        C1099 c1099 = (C1099) c1083.f1224[i6];
                        Boolean bool = (Boolean) interfaceC7387.invoke(obj);
                        if (bool.booleanValue()) {
                            Object[] objArr = c1099.f1262;
                            int[] iArr = c1099.f1261;
                            long[] jArr4 = c1099.f1263;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                m2814(obj, obj2);
                                            } else {
                                                j3 = j6;
                                            }
                                            j6 = j3 >> i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                        if (i8 == length2) {
                                            break;
                                        }
                                        i8++;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j4;
                            }
                            if (bool.booleanValue()) {
                                c1083.m1319(i6);
                            }
                            i = 8;
                        }
                    } else {
                        jArr2 = jArr3;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j4 = j >> i;
                    c2 = c;
                    j5 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2814(Object obj, Object obj2) {
        C1083 c1083 = this.f4073;
        AbstractC3887.m7202(c1083, obj2, obj);
        if (!(obj2 instanceof C2197) || c1083.m1312(obj2)) {
            return;
        }
        AbstractC3887.m7196(this.f4082, obj2);
        this.f4078.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2815(Object obj, int i, Object obj2, C1099 c1099) {
        int i2;
        if (this.f4081 > 0) {
            return;
        }
        int iM1365 = c1099.m1365(obj);
        if (iM1365 < 0) {
            iM1365 = ~iM1365;
            i2 = -1;
        } else {
            i2 = c1099.f1261[iM1365];
        }
        c1099.f1262[iM1365] = obj;
        c1099.f1261[iM1365] = i;
        if ((obj instanceof C2197) && i2 != i) {
            C2196 c2196M3002 = ((C2197) obj).m3002();
            this.f4078.put(obj, c2196M3002.f4281);
            C1099 c10992 = c2196M3002.f4282;
            C1083 c1083 = this.f4082;
            AbstractC3887.m7196(c1083, obj);
            Object[] objArr = c10992.f1262;
            long[] jArr = c10992.f1263;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                InterfaceC2092 interfaceC2092 = (InterfaceC2092) objArr[(i3 << 3) + i5];
                                if (interfaceC2092 instanceof AbstractC2091) {
                                    ((AbstractC2091) interfaceC2092).m2759(2);
                                }
                                AbstractC3887.m7208(c1083, interfaceC2092, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof AbstractC2091) {
                ((AbstractC2091) obj).m2759(2);
            }
            AbstractC3887.m7208(this.f4073, obj, obj2);
        }
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m2816(java.util.Set r46) {
        /*
            Method dump skipped, instruction units count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C2113.m2816(java.util.Set):boolean");
    }
}

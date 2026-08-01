package p000;

import android.os.Bundle;
import com.p001mr.elaris.HookEntry;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: m6 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0328m6 implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f555a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f556b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0328m6(String str, String str2) {
        this.f555a = str;
        this.f556b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Bundle bundle;
        byte[] byteArray;
        int i;
        byte[] bArrCopyOfRange;
        long jM953f0;
        String strM949d0;
        String string;
        if ("onReceive".equals(method.getName())) {
            int i2 = 0;
            boolean z = objArr != null && objArr.length > 1 && Boolean.TRUE.equals(objArr[1]);
            if (objArr == null || objArr.length <= 2) {
                bundle = null;
                StringBuilder sb = new StringBuilder("group action response type=设置头衔 groupUin=");
                sb.append(this.f555a);
                sb.append(" targetUin=");
                sb.append(this.f556b);
                sb.append(" success=");
                sb.append(z);
                sb.append(" ");
                if (bundle != null) {
                    string = "bundle=null";
                } else {
                    try {
                        byteArray = bundle.getByteArray("data");
                    } catch (Throwable unused) {
                        byteArray = null;
                    }
                    char c = 3;
                    long jM953f02 = AbstractC0451s6.m953f0(3, byteArray);
                    String strM949d02 = AbstractC0451s6.m949d0(5, byteArray);
                    if (byteArray != null) {
                        int[] iArr = new int[1];
                        iArr[0] = 0;
                        while (iArr[i2] < byteArray.length) {
                            long jM957h0 = AbstractC0451s6.m957h0(byteArray, iArr, -1L);
                            if (jM957h0 < 0) {
                                break;
                            }
                            char c2 = c;
                            i = i2;
                            int i3 = (int) (jM957h0 & 7);
                            if (((int) (jM957h0 >>> c2)) == 4 && i3 == 2) {
                                long jM957h02 = AbstractC0451s6.m957h0(byteArray, iArr, -1L);
                                if (jM957h02 >= 0) {
                                    int length = byteArray.length;
                                    int i4 = iArr[i];
                                    if (jM957h02 > length - i4) {
                                        break;
                                    }
                                    int i5 = (int) jM957h02;
                                    bArrCopyOfRange = Arrays.copyOfRange(byteArray, i4, i4 + i5);
                                    iArr[i] = iArr[i] + i5;
                                    jM953f0 = AbstractC0451s6.m953f0(1, bArrCopyOfRange);
                                    strM949d0 = AbstractC0451s6.m949d0(2, bArrCopyOfRange);
                                    StringBuilder sb2 = new StringBuilder("dataLen=");
                                    sb2.append(byteArray == null ? i : byteArray.length);
                                    if (jM953f02 != Long.MIN_VALUE) {
                                        sb2.append(" result=");
                                        sb2.append(jM953f02);
                                    }
                                    if (strM949d02.length() > 0) {
                                        sb2.append(" err=");
                                        sb2.append(AbstractC0451s6.m967m0(strM949d02));
                                    }
                                    if (bArrCopyOfRange != null) {
                                        sb2.append(" bodyLen=");
                                        sb2.append(bArrCopyOfRange.length);
                                    }
                                    if (jM953f0 != Long.MIN_VALUE) {
                                        sb2.append(" rspGroup=");
                                        sb2.append(jM953f0);
                                    }
                                    if (strM949d0.length() > 0) {
                                        sb2.append(" bodyErr=");
                                        sb2.append(AbstractC0451s6.m967m0(strM949d0));
                                    }
                                    string = sb2.toString();
                                }
                            } else {
                                if (!AbstractC0451s6.m981t0(byteArray, iArr, i3)) {
                                    break;
                                }
                                c = c2;
                                i2 = i;
                            }
                        }
                        i = i2;
                        bArrCopyOfRange = null;
                        jM953f0 = AbstractC0451s6.m953f0(1, bArrCopyOfRange);
                        strM949d0 = AbstractC0451s6.m949d0(2, bArrCopyOfRange);
                        StringBuilder sb22 = new StringBuilder("dataLen=");
                        sb22.append(byteArray == null ? i : byteArray.length);
                        if (jM953f02 != Long.MIN_VALUE) {
                        }
                        if (strM949d02.length() > 0) {
                        }
                        if (bArrCopyOfRange != null) {
                        }
                        if (jM953f0 != Long.MIN_VALUE) {
                        }
                        if (strM949d0.length() > 0) {
                        }
                        string = sb22.toString();
                    } else {
                        i = i2;
                        bArrCopyOfRange = null;
                        jM953f0 = AbstractC0451s6.m953f0(1, bArrCopyOfRange);
                        strM949d0 = AbstractC0451s6.m949d0(2, bArrCopyOfRange);
                        StringBuilder sb222 = new StringBuilder("dataLen=");
                        sb222.append(byteArray == null ? i : byteArray.length);
                        if (jM953f02 != Long.MIN_VALUE) {
                        }
                        if (strM949d02.length() > 0) {
                        }
                        if (bArrCopyOfRange != null) {
                        }
                        if (jM953f0 != Long.MIN_VALUE) {
                        }
                        if (strM949d0.length() > 0) {
                        }
                        string = sb222.toString();
                    }
                }
                sb.append(string);
                HookEntry.log(sb.toString());
            } else {
                Object obj2 = objArr[2];
                if (obj2 instanceof Bundle) {
                    bundle = (Bundle) obj2;
                }
                StringBuilder sb3 = new StringBuilder("group action response type=设置头衔 groupUin=");
                sb3.append(this.f555a);
                sb3.append(" targetUin=");
                sb3.append(this.f556b);
                sb3.append(" success=");
                sb3.append(z);
                sb3.append(" ");
                if (bundle != null) {
                }
                sb3.append(string);
                HookEntry.log(sb3.toString());
            }
        }
        return null;
    }
}

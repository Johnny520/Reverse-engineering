package kotlin.text;

import java.io.IOException;
import kotlin.C6008;
import net.bytebuddy.pool.TypePool;
import okhttp3.internal.http2.ErrorCode;
import p035.C7106;
import p068.InterfaceC7372;
import p103.C7937;
import p107.C8027;
import p107.InterfaceC8020;
import p267.AbstractC9004;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5981 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f15045;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f15046;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15047;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15048 = 2;

    public /* synthetic */ C5981(int i, String str, C7937 c7937) {
        this.f15046 = i;
        this.f15047 = str;
        this.f15045 = c7937;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f15048;
        Object obj = this.f15045;
        Object obj2 = this.f15047;
        int i2 = this.f15046;
        switch (i) {
            case 0:
                return ((Regex) obj2).find((CharSequence) obj, i2);
            case 1:
                C7106 c7106 = (C7106) obj2;
                ErrorCode errorCode = (ErrorCode) obj;
                try {
                    errorCode.getClass();
                    c7106.f17645.m12359(i2, errorCode);
                    break;
                } catch (IOException e) {
                    ErrorCode errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    c7106.m12366(errorCode2, errorCode2, e);
                }
                return C6008.f15084;
            default:
                String str = (String) obj2;
                C7937 c7937 = (C7937) obj;
                InterfaceC8020[] interfaceC8020Arr = new InterfaceC8020[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    interfaceC8020Arr[i3] = AbstractC9004.m14208(str + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + c7937.f19412[i3], C8027.f19552, new InterfaceC8020[0]);
                }
                return interfaceC8020Arr;
        }
    }

    public /* synthetic */ C5981(Regex regex, CharSequence charSequence, int i) {
        this.f15047 = regex;
        this.f15045 = charSequence;
        this.f15046 = i;
    }

    public /* synthetic */ C5981(C7106 c7106, int i, ErrorCode errorCode) {
        this.f15047 = c7106;
        this.f15046 = i;
        this.f15045 = errorCode;
    }
}

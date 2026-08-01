package kotlin.text;

import java.io.IOException;
import kotlin.C5175;
import kotlin.reflect.jvm.internal.AbstractC5061;
import net.bytebuddy.pool.TypePool;
import okhttp3.internal.http2.ErrorCode;
import p022.C6281;
import p052.InterfaceC6542;
import p087.C7107;
import p091.C7197;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5148 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f14700;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f14701;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f14702;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14703 = 2;

    public /* synthetic */ C5148(int i, String str, C7107 c7107) {
        this.f14701 = i;
        this.f14702 = str;
        this.f14700 = c7107;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14703;
        Object obj = this.f14700;
        Object obj2 = this.f14702;
        int i2 = this.f14701;
        switch (i) {
            case 0:
                return ((Regex) obj2).find((CharSequence) obj, i2);
            case 1:
                C6281 c6281 = (C6281) obj2;
                ErrorCode errorCode = (ErrorCode) obj;
                try {
                    errorCode.getClass();
                    c6281.f17318.m11783(i2, errorCode);
                    break;
                } catch (IOException e) {
                    ErrorCode errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    c6281.m11790(errorCode2, errorCode2, e);
                }
                return C5175.f14739;
            default:
                String str = (String) obj2;
                C7107 c7107 = (C7107) obj;
                InterfaceC7190[] interfaceC7190Arr = new InterfaceC7190[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    interfaceC7190Arr[i3] = AbstractC5061.m10032(str + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + c7107.f19072[i3], C7197.f19214, new InterfaceC7190[0]);
                }
                return interfaceC7190Arr;
        }
    }

    public /* synthetic */ C5148(Regex regex, CharSequence charSequence, int i) {
        this.f14702 = regex;
        this.f14700 = charSequence;
        this.f14701 = i;
    }

    public /* synthetic */ C5148(C6281 c6281, int i, ErrorCode errorCode) {
        this.f14702 = c6281;
        this.f14701 = i;
        this.f14700 = errorCode;
    }
}

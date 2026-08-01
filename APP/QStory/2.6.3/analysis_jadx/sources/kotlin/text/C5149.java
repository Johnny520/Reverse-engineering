package kotlin.text;

import java.io.IOException;
import kotlin.C5176;
import net.bytebuddy.pool.TypePool;
import okhttp3.internal.http2.ErrorCode;
import p019.C6277;
import p052.InterfaceC6543;
import p087.C7108;
import p091.C7198;
import p091.InterfaceC7191;
import p251.AbstractC8175;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5149 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f14700;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f14701;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f14702;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14703 = 2;

    public /* synthetic */ C5149(int i, String str, C7108 c7108) {
        this.f14701 = i;
        this.f14702 = str;
        this.f14700 = c7108;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14703;
        Object obj = this.f14700;
        Object obj2 = this.f14702;
        int i2 = this.f14701;
        switch (i) {
            case 0:
                return ((Regex) obj2).find((CharSequence) obj, i2);
            case 1:
                C6277 c6277 = (C6277) obj2;
                ErrorCode errorCode = (ErrorCode) obj;
                try {
                    errorCode.getClass();
                    c6277.f17300.m11800(i2, errorCode);
                    break;
                } catch (IOException e) {
                    ErrorCode errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    c6277.m11807(errorCode2, errorCode2, e);
                }
                return C5176.f14739;
            default:
                String str = (String) obj2;
                C7108 c7108 = (C7108) obj;
                InterfaceC7191[] interfaceC7191Arr = new InterfaceC7191[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    interfaceC7191Arr[i3] = AbstractC8175.m13649(str + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + c7108.f19067[i3], C7198.f19207, new InterfaceC7191[0]);
                }
                return interfaceC7191Arr;
        }
    }

    public /* synthetic */ C5149(Regex regex, CharSequence charSequence, int i) {
        this.f14702 = regex;
        this.f14700 = charSequence;
        this.f14701 = i;
    }

    public /* synthetic */ C5149(C6277 c6277, int i, ErrorCode errorCode) {
        this.f14702 = c6277;
        this.f14701 = i;
        this.f14700 = errorCode;
    }
}

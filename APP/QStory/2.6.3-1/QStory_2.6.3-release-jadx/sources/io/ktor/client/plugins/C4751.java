package io.ktor.client.plugins;

import androidx.compose.foundation.C1868;
import io.ktor.http.content.AbstractC4826;
import io.ktor.util.C5041;
import io.ktor.util.pipeline.AbstractC5026;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import p034.AbstractC7082;
import p252.AbstractC8938;
import p252.AbstractC8944;
import p252.C8926;
import p252.C8945;
import p252.C8954;
import p252.InterfaceC8941;
import p257.C8969;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4751 extends AbstractC4826 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f12473;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f12474;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f12475;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f12476 = 2;

    public C4751(AbstractC5026 abstractC5026, C8954 c8954, Object obj) {
        this.f12473 = obj;
        C8945 c8945 = ((C8969) abstractC5026.f13009).f22803;
        String[] strArr = AbstractC8944.f22758;
        String strM2973 = c8945.m2973("Content-Length");
        this.f12475 = strM2973 != null ? Long.valueOf(Long.parseLong(strM2973)) : null;
        if (c8954 == null) {
            C8954 c89542 = AbstractC8938.f22744;
            c8954 = AbstractC8938.f22740;
        }
        this.f12474 = c8954;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo8838(C5041 c5041, ArrayList arrayList) {
        switch (this.f12476) {
            case 2:
                c5041.getClass();
                ((AbstractC4826) this.f12475).mo8838(c5041, arrayList);
                break;
            default:
                super.mo8838(c5041, arrayList);
                break;
        }
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public C8926 mo8839() {
        switch (this.f12476) {
            case 2:
                return ((AbstractC4826) this.f12475).mo8839();
            default:
                return super.mo8839();
        }
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo8840(C5041 c5041) {
        switch (this.f12476) {
            case 2:
                c5041.getClass();
                return ((AbstractC4826) this.f12475).mo8840(c5041);
            default:
                return super.mo8840(c5041);
        }
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC8941 mo8841() {
        switch (this.f12476) {
            case 2:
                return (InterfaceC8941) ((InterfaceC6016) this.f12473).getValue();
            default:
                return super.mo8841();
        }
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8954 mo8842() {
        switch (this.f12476) {
            case 0:
                return (C8954) this.f12474;
            case 1:
                return (C8954) this.f12474;
            default:
                return ((AbstractC4826) this.f12475).mo8842();
        }
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8843() {
        switch (this.f12476) {
            case 0:
                return (Long) this.f12475;
            case 1:
                return (Long) this.f12475;
            default:
                return ((AbstractC4826) this.f12475).mo8843();
        }
    }

    @Override // io.ktor.http.content.AbstractC4826
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC5084 mo8845() {
        int i = this.f12476;
        Object obj = this.f12473;
        switch (i) {
            case 0:
                return (InterfaceC5084) obj;
            case 1:
                return AbstractC7082.m12297((InputStream) obj);
            default:
                return ((AbstractC4826) this.f12475).mo8845();
        }
    }

    public C4751(AbstractC4826 abstractC4826, String str) {
        abstractC4826.getClass();
        this.f12475 = abstractC4826;
        this.f12474 = str;
        this.f12473 = AbstractC6019.m10774(LazyThreadSafetyMode.NONE, new C1868(this, 12));
    }

    public C4751(C8969 c8969, C8954 c8954, Object obj) {
        this.f12473 = obj;
        C8945 c8945 = c8969.f22803;
        String[] strArr = AbstractC8944.f22758;
        String strM2973 = c8945.m2973("Content-Length");
        this.f12475 = strM2973 != null ? Long.valueOf(Long.parseLong(strM2973)) : null;
        if (c8954 == null) {
            C8954 c89542 = AbstractC8938.f22744;
            c8954 = AbstractC8938.f22740;
        }
        this.f12474 = c8954;
    }
}

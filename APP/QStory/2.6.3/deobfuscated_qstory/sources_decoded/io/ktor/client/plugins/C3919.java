package io.ktor.client.plugins;

import androidx.compose.foundation.C1030;
import io.ktor.http.content.AbstractC3994;
import io.ktor.util.C4209;
import io.ktor.util.pipeline.AbstractC4194;
import io.ktor.utils.io.InterfaceC4252;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import p018.AbstractC6253;
import p236.AbstractC8109;
import p236.AbstractC8115;
import p236.C8097;
import p236.C8116;
import p236.C8125;
import p236.InterfaceC8112;
import p241.C8140;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3919 extends AbstractC3994 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f12128;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f12129;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f12130;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f12131 = 2;

    public C3919(AbstractC4194 abstractC4194, C8125 c8125, Object obj) {
        this.f12128 = obj;
        C8116 c8116 = ((C8140) abstractC4194.f12664).f22458;
        String[] strArr = AbstractC8115.f22413;
        String strM2413 = c8116.m2413("Content-Length");
        this.f12130 = strM2413 != null ? Long.valueOf(Long.parseLong(strM2413)) : null;
        if (c8125 == null) {
            C8125 c81252 = AbstractC8109.f22399;
            c8125 = AbstractC8109.f22395;
        }
        this.f12129 = c8125;
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo8279(C4209 c4209, ArrayList arrayList) {
        switch (this.f12131) {
            case 2:
                c4209.getClass();
                ((AbstractC3994) this.f12130).mo8279(c4209, arrayList);
                break;
            default:
                super.mo8279(c4209, arrayList);
                break;
        }
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public C8097 mo8280() {
        switch (this.f12131) {
            case 2:
                return ((AbstractC3994) this.f12130).mo8280();
            default:
                return super.mo8280();
        }
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo8281(C4209 c4209) {
        switch (this.f12131) {
            case 2:
                c4209.getClass();
                return ((AbstractC3994) this.f12130).mo8281(c4209);
            default:
                return super.mo8281(c4209);
        }
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC8112 mo8282() {
        switch (this.f12131) {
            case 2:
                return (InterfaceC8112) ((InterfaceC5184) this.f12128).getValue();
            default:
                return super.mo8282();
        }
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8125 mo8283() {
        switch (this.f12131) {
            case 0:
                return (C8125) this.f12129;
            case 1:
                return (C8125) this.f12129;
            default:
                return ((AbstractC3994) this.f12130).mo8283();
        }
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8284() {
        switch (this.f12131) {
            case 0:
                return (Long) this.f12130;
            case 1:
                return (Long) this.f12130;
            default:
                return ((AbstractC3994) this.f12130).mo8284();
        }
    }

    @Override // io.ktor.http.content.AbstractC3994
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC4252 mo8286() {
        int i = this.f12131;
        Object obj = this.f12128;
        switch (i) {
            case 0:
                return (InterfaceC4252) obj;
            case 1:
                return AbstractC6253.m11738((InputStream) obj);
            default:
                return ((AbstractC3994) this.f12130).mo8286();
        }
    }

    public C3919(AbstractC3994 abstractC3994, String str) {
        abstractC3994.getClass();
        this.f12130 = abstractC3994;
        this.f12129 = str;
        this.f12128 = AbstractC5187.m10215(LazyThreadSafetyMode.NONE, new C1030(this, 12));
    }

    public C3919(C8140 c8140, C8125 c8125, Object obj) {
        this.f12128 = obj;
        C8116 c8116 = c8140.f22458;
        String[] strArr = AbstractC8115.f22413;
        String strM2413 = c8116.m2413("Content-Length");
        this.f12130 = strM2413 != null ? Long.valueOf(Long.parseLong(strM2413)) : null;
        if (c8125 == null) {
            C8125 c81252 = AbstractC8109.f22399;
            c8125 = AbstractC8109.f22395;
        }
        this.f12129 = c8125;
    }
}

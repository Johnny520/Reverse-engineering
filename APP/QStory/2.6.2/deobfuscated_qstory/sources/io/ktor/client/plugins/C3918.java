package io.ktor.client.plugins;

import androidx.compose.foundation.C1030;
import io.ktor.http.content.AbstractC3993;
import io.ktor.util.C4208;
import io.ktor.util.pipeline.AbstractC4193;
import io.ktor.utils.io.InterfaceC4251;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import p175.AbstractC7738;
import p236.AbstractC8108;
import p236.AbstractC8114;
import p236.C8096;
import p236.C8115;
import p236.C8124;
import p236.InterfaceC8111;
import p241.C8139;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3918 extends AbstractC3993 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f12123;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f12124;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f12125;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f12126 = 2;

    public C3918(AbstractC4193 abstractC4193, C8124 c8124, Object obj) {
        this.f12123 = obj;
        C8115 c8115 = ((C8139) abstractC4193.f12660).f22460;
        String[] strArr = AbstractC8114.f22415;
        String strM2403 = c8115.m2403("Content-Length");
        this.f12125 = strM2403 != null ? Long.valueOf(Long.parseLong(strM2403)) : null;
        if (c8124 == null) {
            C8124 c81242 = AbstractC8108.f22401;
            c8124 = AbstractC8108.f22397;
        }
        this.f12124 = c8124;
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo8289(C4208 c4208, ArrayList arrayList) {
        switch (this.f12126) {
            case 2:
                c4208.getClass();
                ((AbstractC3993) this.f12125).mo8289(c4208, arrayList);
                break;
            default:
                super.mo8289(c4208, arrayList);
                break;
        }
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public C8096 mo8290() {
        switch (this.f12126) {
            case 2:
                return ((AbstractC3993) this.f12125).mo8290();
            default:
                return super.mo8290();
        }
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo8291(C4208 c4208) {
        switch (this.f12126) {
            case 2:
                c4208.getClass();
                return ((AbstractC3993) this.f12125).mo8291(c4208);
            default:
                return super.mo8291(c4208);
        }
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC8111 mo8292() {
        switch (this.f12126) {
            case 2:
                return (InterfaceC8111) ((InterfaceC5183) this.f12123).getValue();
            default:
                return super.mo8292();
        }
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8124 mo8293() {
        switch (this.f12126) {
            case 0:
                return (C8124) this.f12124;
            case 1:
                return (C8124) this.f12124;
            default:
                return ((AbstractC3993) this.f12125).mo8293();
        }
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8294() {
        switch (this.f12126) {
            case 0:
                return (Long) this.f12125;
            case 1:
                return (Long) this.f12125;
            default:
                return ((AbstractC3993) this.f12125).mo8294();
        }
    }

    @Override // io.ktor.http.content.AbstractC3993
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC4251 mo8296() {
        int i = this.f12126;
        Object obj = this.f12123;
        switch (i) {
            case 0:
                return (InterfaceC4251) obj;
            case 1:
                return AbstractC7738.m13021((InputStream) obj);
            default:
                return ((AbstractC3993) this.f12125).mo8296();
        }
    }

    public C3918(AbstractC3993 abstractC3993, String str) {
        abstractC3993.getClass();
        this.f12125 = abstractC3993;
        this.f12124 = str;
        this.f12123 = AbstractC5186.m10211(LazyThreadSafetyMode.NONE, new C1030(this, 12));
    }

    public C3918(C8139 c8139, C8124 c8124, Object obj) {
        this.f12123 = obj;
        C8115 c8115 = c8139.f22460;
        String[] strArr = AbstractC8114.f22415;
        String strM2403 = c8115.m2403("Content-Length");
        this.f12125 = strM2403 != null ? Long.valueOf(Long.parseLong(strM2403)) : null;
        if (c8124 == null) {
            C8124 c81242 = AbstractC8108.f22401;
            c8124 = AbstractC8108.f22397;
        }
        this.f12124 = c8124;
    }
}

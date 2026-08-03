package p182m7;

import android.R;
import be.AbstractC0283h;
import com.alibaba.fastjson2.writer.C0640b;
import java.util.Iterator;
import java.util.List;
import p314v7.EnumC4505k0;
import p379z7.C6111g;
import p379z7.C6112h;

/* JADX INFO: renamed from: m7.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2788a extends C2793f {

    /* JADX INFO: renamed from: n */
    public int f9035n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public final Integer m6159V(int i9) {
        C2790c c2790cM6199X;
        C2797j c2797jM6191O = m6191O("manifest");
        if (c2797jM6191O == null || (c2790cM6199X = c2797jM6191O.m6199X(i9)) == null || c2790cM6199X.m8936T() != EnumC4505k0.f14867n) {
            return null;
        }
        return Integer.valueOf(c2790cM6199X.mo8928O());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public final String m6160W(int i9) {
        C2790c c2790cM6199X;
        C2797j c2797jM6191O = m6191O("manifest");
        if (c2797jM6191O == null || (c2790cM6199X = c2797jM6191O.m6199X(i9)) == null || c2790cM6199X.m8936T() != EnumC4505k0.f14874u) {
            return null;
        }
        return c2790cM6199X.m8935S();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public final String m6161X() {
        C2790c c2790cM6198W;
        C2797j c2797jM6191O = m6191O("manifest");
        if (c2797jM6191O == null || (c2790cM6198W = c2797jM6191O.m6198W("package")) == null || c2790cM6198W.m8936T() != EnumC4505k0.f14874u) {
            return null;
        }
        return c2790cM6198W.m8935S();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final int m6162Y() {
        C2790c c2790cM6199X;
        if (this.f9035n == 0) {
            C2797j c2797jM6191O = m6191O("manifest");
            C2797j c2797jM6191O2 = c2797jM6191O == null ? null : c2797jM6191O.m6191O("application");
            int iMo8928O = 0;
            if (c2797jM6191O2 != null && (c2790cM6199X = c2797jM6191O2.m6199X(R.attr.icon)) != null && c2790cM6199X.m8936T() == EnumC4505k0.f14862i) {
                iMo8928O = c2790cM6199X.mo8928O();
            }
            this.f9035n = (iMo8928O >> 24) & 255;
        }
        return this.f9035n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public final Boolean m6163Z() {
        C2790c c2790cM6198W;
        C2797j c2797jM6191O = m6191O("manifest");
        if (c2797jM6191O == null || (c2790cM6198W = c2797jM6191O.m6198W("coreApp")) == null || c2790cM6198W.m8936T() != EnumC4505k0.f14869p) {
            return null;
        }
        return Boolean.valueOf(c2790cM6198W.mo8928O() != 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2796i, p182m7.AbstractC2804q
    public final String toString() {
        m6194S();
        if (this.f9052l == null) {
            this.f9052l = new C2805r(this);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C2788a.class.getSimpleName());
        sb2.append("{package=");
        sb2.append(m6161X());
        sb2.append(", versionCode=");
        sb2.append(m6159V(R.attr.versionCode));
        sb2.append(", versionName=");
        sb2.append(m6160W(R.attr.versionName));
        sb2.append(", compileSdkVersion=");
        sb2.append(m6159V(R.attr.compileSdkVersion));
        sb2.append(", compileSdkVersionCodename=");
        sb2.append(m6160W(R.attr.compileSdkVersionCodename));
        Iterator itM6192P = m6192P("manifest", "uses-permission");
        List<String> listM1150b0 = AbstractC0283h.m1150b0(!itM6192P.hasNext() ? C6112h.f24664g : new C6111g(itM6192P, new C0640b(29)));
        sb2.append(", PERMISSIONS[");
        boolean z9 = false;
        for (String str : listM1150b0) {
            if (z9) {
                sb2.append(", ");
            }
            sb2.append(str);
            z9 = true;
        }
        sb2.append("]}");
        return sb2.toString();
    }
}

package p285t7;

import p166l7.C2518f;
import p166l7.C2524l;
import p257r7.C3734x;

/* JADX INFO: renamed from: t7.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4134a extends C2524l {

    /* JADX INFO: renamed from: t */
    public String f13623t;

    /* JADX INFO: renamed from: u */
    public int f13624u;

    /* JADX INFO: renamed from: v */
    public int f13625v;

    /* JADX INFO: renamed from: w */
    public boolean f13626w;

    /* JADX INFO: renamed from: x */
    public boolean f13627x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public final String m8317b0() {
        C2518f c2518fM5930Z;
        String strMo5914V;
        if (this.f13623t == null) {
            this.f13623t = m8320e0("NAME");
        }
        if (this.f13623t == null && (c2518fM5930Z = m5930Z()) != null && (strMo5914V = c2518fM5930Z.mo5914V()) != null && !strMo5914V.trim().isEmpty()) {
            this.f13623t = strMo5914V;
        }
        return this.f13623t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public final int m8318c0() {
        String strM8320e0;
        if (this.f13624u == 0 && m8319d0() && (strM8320e0 = m8320e0("VERSION_CODE")) != null) {
            try {
                this.f13624u = Integer.parseInt(strM8320e0);
            } catch (NumberFormatException unused) {
            }
        }
        return this.f13624u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public final boolean m8319d0() {
        if (!this.f13627x) {
            boolean z9 = true;
            this.f13627x = true;
            String strM8320e0 = m8320e0("VERSION_CODE");
            if (strM8320e0 != null) {
                try {
                    if (Integer.parseInt(strM8320e0) == 0) {
                        z9 = false;
                    }
                    this.f13626w = z9;
                } catch (NumberFormatException unused) {
                }
            }
        }
        return this.f13626w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public final String m8320e0(String str) {
        C3734x c3734x;
        if (!str.endsWith(":")) {
            str = str.concat(":");
        }
        String strConcat = !str.endsWith(":") ? str.concat(":") : str;
        for (int i9 = 0; i9 < 10 && (c3734x = (C3734x) this.f8154o.m8600V(i9)) != null; i9++) {
            String str2 = c3734x.f12101m;
            if (str2 != null && str2.trim().startsWith(strConcat)) {
                break;
            }
        }
        c3734x = null;
        if (c3734x == null) {
            return null;
        }
        return c3734x.f12101m.trim().substring(str.length()).trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.C2524l, p166l7.AbstractC2513a
    public final String toString() {
        if (this.f8138m.m7051Q() != 3) {
            return super.toString();
        }
        if (!this.f13626w) {
            return "Unoptimized: ".concat(super.toString());
        }
        return m8317b0() + '-' + m8318c0();
    }
}

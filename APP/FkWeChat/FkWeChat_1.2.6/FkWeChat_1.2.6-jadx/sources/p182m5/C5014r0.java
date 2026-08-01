package p182m5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import okhttp3.internal.url._UrlKt;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.r0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5014r0 {

    /* JADX INFO: renamed from: a */
    public final HashMap f15284a = new HashMap(50);

    /* JADX INFO: renamed from: m5.r0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final String f15285a;

        /* JADX INFO: renamed from: b */
        public int f15286b;

        /* JADX INFO: renamed from: c */
        public int f15287c;

        /* JADX INFO: renamed from: d */
        public int f15288d;

        /* JADX INFO: renamed from: e */
        public int f15289e;

        public a(AbstractC4982b0 abstractC4982b0, String str) {
            int iMo20111h = abstractC4982b0.mo20111h();
            this.f15285a = str;
            this.f15286b = 1;
            this.f15287c = iMo20111h;
            this.f15288d = iMo20111h;
            this.f15289e = iMo20111h;
        }

        /* JADX INFO: renamed from: b */
        public void m20289b(AbstractC4982b0 abstractC4982b0) {
            int iMo20111h = abstractC4982b0.mo20111h();
            this.f15286b++;
            this.f15287c += iMo20111h;
            if (iMo20111h > this.f15288d) {
                this.f15288d = iMo20111h;
            }
            if (iMo20111h < this.f15289e) {
                this.f15289e = iMo20111h;
            }
        }

        /* JADX INFO: renamed from: c */
        public String m20290c() {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder("  ");
            sb3.append(this.f15285a);
            sb3.append(": ");
            sb3.append(this.f15286b);
            sb3.append(" item");
            sb3.append(this.f15286b == 1 ? _UrlKt.FRAGMENT_ENCODE_SET : "s");
            sb3.append("; ");
            sb3.append(this.f15287c);
            sb3.append(" bytes total\n");
            sb2.append(sb3.toString());
            if (this.f15289e == this.f15288d) {
                sb2.append("    " + this.f15289e + " bytes/item\n");
            } else {
                sb2.append("    " + this.f15289e + ".." + this.f15288d + " bytes/item; average " + (this.f15287c / this.f15286b) + "\n");
            }
            return sb2.toString();
        }

        /* JADX INFO: renamed from: d */
        public void m20291d(InterfaceC8819a interfaceC8819a) {
            interfaceC8819a.mo33823a(m20290c());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m20285a(AbstractC4982b0 abstractC4982b0) {
        String strM20110g = abstractC4982b0.m20110g();
        a aVar = (a) this.f15284a.get(strM20110g);
        if (aVar == null) {
            this.f15284a.put(strM20110g, new a(abstractC4982b0, strM20110g));
        } else {
            aVar.m20289b(abstractC4982b0);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m20286b(AbstractC5012q0 abstractC5012q0) {
        Iterator it = abstractC5012q0.mo20137g().iterator();
        while (it.hasNext()) {
            m20285a((AbstractC4982b0) it.next());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m20287c(InterfaceC8819a interfaceC8819a) {
        if (this.f15284a.size() == 0) {
            return;
        }
        interfaceC8819a.mo33825d(0, "\nstatistics:\n");
        TreeMap treeMap = new TreeMap();
        for (a aVar : this.f15284a.values()) {
            treeMap.put(aVar.f15285a, aVar);
        }
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            ((a) it.next()).m20291d(interfaceC8819a);
        }
    }
}

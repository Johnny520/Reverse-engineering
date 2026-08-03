package p099h;

import android.content.SharedPreferences;
import java.util.Map;
import p069f.C0943k0;
import p117i0.InterfaceC1809a1;
import p117i0.InterfaceC1898z;
import p218og.AbstractC3149m;
import p307v0.C4364d;
import p307v0.C4369i;
import p322w0.C4665p;

/* JADX INFO: renamed from: h.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1455f implements InterfaceC1898z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4829a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4830b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4831c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f4832d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1455f(Object obj, Object obj2, Object obj3, int i9) {
        this.f4829a = i9;
        this.f4831c = obj;
        this.f4830b = obj2;
        this.f4832d = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1898z
    /* JADX INFO: renamed from: a */
    public final void mo725a() {
        switch (this.f4829a) {
            case 0:
                C4665p c4665p = (C4665p) this.f4831c;
                Object obj = this.f4830b;
                c4665p.remove(obj);
                ((C1486t) this.f4832d).f4937c.m2324k(obj);
                break;
            case 1:
                C4364d c4364d = (C4364d) this.f4831c;
                C0943k0 c0943k0 = c4364d.f14569h;
                Object obj2 = this.f4830b;
                Object objM2324k = c0943k0.m2324k(obj2);
                C4369i c4369i = (C4369i) this.f4832d;
                if (objM2324k == c4369i) {
                    Map map = c4364d.f14568g;
                    Map mapMo8038c = c4369i.mo8038c();
                    if (!mapMo8038c.isEmpty()) {
                        map.put(obj2, mapMo8038c);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
            default:
                SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f4831c).edit();
                String str = (String) ((InterfaceC1809a1) this.f4830b).getValue();
                if (AbstractC3149m.m6721t0(str)) {
                    str = "[已删除]";
                }
                SharedPreferences.Editor editorPutString = editorEdit.putString("sns_custom_mark_text", str);
                String str2 = (String) ((InterfaceC1809a1) this.f4832d).getValue();
                editorPutString.putString("sns_comment_custom_mark_text", AbstractC3149m.m6721t0(str2) ? "[已删除]" : str2).apply();
                break;
        }
    }
}

package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yk0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f7653a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [e31.c():void, zk0.<init>(bl0):void] */
    public /* synthetic */ yk0(Object obj) {
        this.f7653a = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m5286a() {
        InterfaceC0904ww interfaceC0904ww = (InterfaceC0904ww) this.f7653a;
        synchronized (t21.f5893c) {
            List list = t21.f5898h;
            list.getClass();
            ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(list));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && p30.m3002l(obj, interfaceC0904ww)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            t21.f5898h = arrayList;
        }
    }
}

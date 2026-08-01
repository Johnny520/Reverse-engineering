package p293;

import java.lang.reflect.Method;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8572 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Method f23915;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23916;

    public /* synthetic */ C8572(Method method, int i) {
        this.f23916 = i;
        this.f23915 = method;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        androidx.collection.C0276.m842("createInstance error", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        androidx.collection.C0276.m842("createInstance error", r1);
     */
    @Override // java.util.function.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object apply(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.f23916
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            java.lang.reflect.Method r1 = r1.f23915     // Catch: java.lang.Exception -> Ld
            r0 = 0
            java.lang.Object r1 = r1.invoke(r2, r0)     // Catch: java.lang.Exception -> Ld
            goto L14
        Ld:
            r1 = move-exception
            java.lang.String r2 = "createInstance error"
            androidx.collection.C0276.m842(r2, r1)
            r1 = 0
        L14:
            return r1
        L15:
            java.lang.reflect.Method r1 = r1.f23915     // Catch: java.lang.Exception -> L21
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L21
            r0 = 0
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L21
            goto L28
        L21:
            r1 = move-exception
            java.lang.String r2 = "createInstance error"
            androidx.collection.C0276.m842(r2, r1)
            r1 = 0
        L28:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p293.C8572.apply(java.lang.Object):java.lang.Object");
    }
}

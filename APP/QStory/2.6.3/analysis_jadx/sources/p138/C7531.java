package p138;

import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7531 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f20408;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ClassLoader f20409;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f20410;

    public /* synthetic */ C7531(String str, int i, ClassLoader classLoader) {
        this.f20410 = i;
        this.f20408 = str;
        this.f20409 = classLoader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        java.lang.System.err.println("[BeanShell] GetLoaderByDex: " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        java.lang.System.err.println("[BeanShell] GetLoaderByJar: " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        java.lang.System.err.println("[BeanShell] GetLoaderByAar: " + r3);
     */
    @Override // java.util.function.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object apply(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f20410
            r1 = 0
            java.lang.ClassLoader r2 = r3.f20409
            java.lang.String r3 = r3.f20408
            java.lang.String r4 = (java.lang.String) r4
            switch(r0) {
                case 0: goto L53;
                case 1: goto L26;
                default: goto Lc;
            }
        Lc:
            dalvik.system.InMemoryDexClassLoader r1 = p316.C8667.m14390(r2, r3)     // Catch: java.lang.Exception -> L11
            goto L25
        L11:
            r3 = move-exception
            java.io.PrintStream r4 = java.lang.System.err
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[BeanShell] GetLoaderByAar: "
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.println(r3)
        L25:
            return r1
        L26:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L3e
            r4.<init>(r3)     // Catch: java.lang.Exception -> L3e
            java.nio.file.Path r3 = r4.toPath()     // Catch: java.lang.Exception -> L3e
            byte[] r3 = java.nio.file.Files.readAllBytes(r3)     // Catch: java.lang.Exception -> L3e
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)     // Catch: java.lang.Exception -> L3e
            dalvik.system.InMemoryDexClassLoader r4 = new dalvik.system.InMemoryDexClassLoader     // Catch: java.lang.Exception -> L3e
            r4.<init>(r3, r2)     // Catch: java.lang.Exception -> L3e
            r1 = r4
            goto L52
        L3e:
            r3 = move-exception
            java.io.PrintStream r4 = java.lang.System.err
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[BeanShell] GetLoaderByDex: "
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.println(r3)
        L52:
            return r1
        L53:
            dalvik.system.InMemoryDexClassLoader r1 = p316.C8667.m14388(r2, r3)     // Catch: java.lang.Exception -> L58
            goto L6c
        L58:
            r3 = move-exception
            java.io.PrintStream r4 = java.lang.System.err
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[BeanShell] GetLoaderByJar: "
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.println(r3)
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p138.C7531.apply(java.lang.Object):java.lang.Object");
    }
}

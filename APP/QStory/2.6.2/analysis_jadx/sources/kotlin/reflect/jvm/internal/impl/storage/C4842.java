package kotlin.reflect.jvm.internal.impl.storage;

import androidx.appcompat.app.C0064;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4842 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6542 f14114;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public volatile Object f14115;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4844 f14116;

    public C4842(C4844 c4844, InterfaceC6542 interfaceC6542) {
        if (c4844 == null) {
            m9584(0);
            throw null;
        }
        this.f14115 = LockBasedStorageManager$NotValue.NOT_COMPUTED;
        this.f14116 = c4844;
        this.f14114 = interfaceC6542;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m9584(int i) {
        String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i == 2 || i == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 2) {
            objArr[1] = "recursionDetected";
        } else if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i != 2 && i != 3) {
            objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:14:0x0024, B:16:0x0028, B:18:0x0035, B:19:0x0038, B:21:0x003c, B:23:0x0045, B:24:0x0048, B:28:0x0057, B:30:0x005d, B:32:0x0063, B:33:0x006a, B:34:0x0071, B:35:0x0072, B:36:0x0078, B:25:0x004a), top: B:39:0x0011, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:14:0x0024, B:16:0x0028, B:18:0x0035, B:19:0x0038, B:21:0x003c, B:23:0x0045, B:24:0x0048, B:28:0x0057, B:30:0x005d, B:32:0x0063, B:33:0x006a, B:34:0x0071, B:35:0x0072, B:36:0x0078, B:25:0x004a), top: B:39:0x0011, inners: #1 }] */
    @Override // p052.InterfaceC6542
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f14115
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue
            if (r1 != 0) goto La
            p103.AbstractC7274.m12467(r0)
            return r0
        La:
            kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪苏兰世哲 r0 = r4.f14116
            kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪哲世苏兰 r0 = r0.f14123
            r0.lock()
            java.lang.Object r0 = r4.f14115     // Catch: java.lang.Throwable -> L22
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L24
            p103.AbstractC7274.m12467(r0)     // Catch: java.lang.Throwable -> L22
        L1a:
            kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪苏兰世哲 r4 = r4.f14116
            kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪哲世苏兰 r4 = r4.f14123
            r4.unlock()
            return r0
        L22:
            r0 = move-exception
            goto L79
        L24:
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue.COMPUTING     // Catch: java.lang.Throwable -> L22
            if (r0 != r1) goto L38
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L22
            r4.f14115 = r2     // Catch: java.lang.Throwable -> L22
            r2 = 1
            androidx.appcompat.app.飘花落叶言子世兰苏哲楪 r2 = r4.mo9581(r2)     // Catch: java.lang.Throwable -> L22
            boolean r3 = r2.f138     // Catch: java.lang.Throwable -> L22
            if (r3 != 0) goto L38
            java.lang.Object r0 = r2.f139     // Catch: java.lang.Throwable -> L22
            goto L1a
        L38:
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L22
            if (r0 != r2) goto L48
            r0 = 0
            androidx.appcompat.app.飘花落叶言子世兰苏哲楪 r0 = r4.mo9581(r0)     // Catch: java.lang.Throwable -> L22
            boolean r2 = r0.f138     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L48
            java.lang.Object r0 = r0.f139     // Catch: java.lang.Throwable -> L22
            goto L1a
        L48:
            r4.f14115 = r1     // Catch: java.lang.Throwable -> L22
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r0 = r4.f14114     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L56
            r4.mo9582(r0)     // Catch: java.lang.Throwable -> L56
            r4.f14115 = r0     // Catch: java.lang.Throwable -> L56
            goto L1a
        L56:
            r0 = move-exception
            boolean r1 = p103.AbstractC7274.m12468(r0)     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L72
            java.lang.Object r1 = r4.f14115     // Catch: java.lang.Throwable -> L22
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue.COMPUTING     // Catch: java.lang.Throwable -> L22
            if (r1 != r2) goto L6a
            飘花落叶言世苏楪兰子哲.飘花落叶言子楪苏哲兰世 r1 = new 飘花落叶言世苏楪兰子哲.飘花落叶言子楪苏哲兰世     // Catch: java.lang.Throwable -> L22
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L22
            r4.f14115 = r1     // Catch: java.lang.Throwable -> L22
        L6a:
            kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪苏兰世哲 r1 = r4.f14116     // Catch: java.lang.Throwable -> L22
            kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪世苏哲兰 r1 = r1.f14122     // Catch: java.lang.Throwable -> L22
            r1.getClass()     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L72:
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue.NOT_COMPUTED     // Catch: java.lang.Throwable -> L22
            r4.f14115 = r1     // Catch: java.lang.Throwable -> L22
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L79:
            kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪苏兰世哲 r4 = r4.f14116
            kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪哲世苏兰 r4 = r4.f14123
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.C4842.invoke():java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public C0064 mo9581(boolean z) {
        C0064 c0064Mo9583 = this.f14116.mo9583(null, "in a lazy value");
        if (c0064Mo9583 != null) {
            return c0064Mo9583;
        }
        m9584(2);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m9585() {
        return (this.f14115 == LockBasedStorageManager$NotValue.NOT_COMPUTED || this.f14115 == LockBasedStorageManager$NotValue.COMPUTING) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo9582(Object obj) {
    }
}

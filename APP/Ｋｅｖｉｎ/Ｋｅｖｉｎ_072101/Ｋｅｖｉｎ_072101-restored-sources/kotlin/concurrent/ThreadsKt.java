package kotlin.concurrent;

/* JADX INFO: compiled from: Thread.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u001a3\u0010\u000e\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\fH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, m115d2 = {"thread", "Ljava/lang/Thread;", "start", "", "isDaemon", "contextClassLoader", "Ljava/lang/ClassLoader;", "name", "", "priority", "", "block", "Lkotlin/Function0;", "", "getOrSet", "T", "", "Ljava/lang/ThreadLocal;", "default", "(Ljava/lang/ThreadLocal;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlin-stdlib"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class ThreadsKt {
    private static final <T> T getOrSet(java.lang.ThreadLocal<T> r3, kotlin.jvm.functions.Function0<? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "default"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Object r0 = r3.get()
            if (r0 != 0) goto L19
            java.lang.Object r0 = r4.invoke()
            r1 = r0
            r2 = 0
            r3.set(r1)
        L19:
            return r0
    }

    public static final java.lang.Thread thread(boolean r2, boolean r3, java.lang.ClassLoader r4, java.lang.String r5, int r6, kotlin.jvm.functions.Function0<kotlin.Unit> r7) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.concurrent.ThreadsKt$thread$thread$1 r0 = new kotlin.concurrent.ThreadsKt$thread$thread$1
            r0.<init>(r7)
            if (r3 == 0) goto L10
            r1 = 1
            r0.setDaemon(r1)
        L10:
            if (r6 <= 0) goto L15
            r0.setPriority(r6)
        L15:
            if (r5 == 0) goto L1a
            r0.setName(r5)
        L1a:
            if (r4 == 0) goto L1f
            r0.setContextClassLoader(r4)
        L1f:
            if (r2 == 0) goto L24
            r0.start()
        L24:
            r1 = r0
            java.lang.Thread r1 = (java.lang.Thread) r1
            return r1
    }

    public static /* synthetic */ java.lang.Thread thread$default(boolean r6, boolean r7, java.lang.ClassLoader r8, java.lang.String r9, int r10, kotlin.jvm.functions.Function0 r11, int r12, java.lang.Object r13) {
            r13 = r12 & 1
            if (r13 == 0) goto L7
            r6 = 1
            r0 = r6
            goto L8
        L7:
            r0 = r6
        L8:
            r6 = r12 & 2
            if (r6 == 0) goto Lf
            r7 = 0
            r1 = r7
            goto L10
        Lf:
            r1 = r7
        L10:
            r6 = r12 & 4
            r7 = 0
            if (r6 == 0) goto L17
            r2 = r7
            goto L18
        L17:
            r2 = r8
        L18:
            r6 = r12 & 8
            if (r6 == 0) goto L1e
            r3 = r7
            goto L1f
        L1e:
            r3 = r9
        L1f:
            r6 = r12 & 16
            if (r6 == 0) goto L26
            r10 = -1
            r4 = r10
            goto L27
        L26:
            r4 = r10
        L27:
            r5 = r11
            java.lang.Thread r6 = thread(r0, r1, r2, r3, r4, r5)
            return r6
    }
}

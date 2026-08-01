package androidx.core.content;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentResolverCompat {

    static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.database.Cursor query(android.content.ContentResolver r1, android.net.Uri r2, java.lang.String[] r3, java.lang.String r4, java.lang.String[] r5, java.lang.String r6, android.os.CancellationSignal r7) {
                android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6, r7)
                return r0
        }
    }

    private ContentResolverCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.database.Cursor query(android.content.ContentResolver r8, android.net.Uri r9, java.lang.String[] r10, java.lang.String r11, java.lang.String[] r12, java.lang.String r13, androidx.core.os.CancellationSignal r14) {
            if (r14 == 0) goto La
            java.lang.Object r0 = r14.getCancellationSignalObject()     // Catch: java.lang.Exception -> L8
            goto Lb
        L8:
            r0 = move-exception
            goto L19
        La:
            r0 = 0
        Lb:
            r7 = r0
            android.os.CancellationSignal r7 = (android.os.CancellationSignal) r7     // Catch: java.lang.Exception -> L8
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            android.database.Cursor r0 = androidx.core.content.ContentResolverCompat.Api16Impl.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L8
            return r0
        L19:
            boolean r1 = r0 instanceof android.os.OperationCanceledException
            if (r1 == 0) goto L23
            androidx.core.os.OperationCanceledException r1 = new androidx.core.os.OperationCanceledException
            r1.<init>()
            throw r1
        L23:
            throw r0
    }
}

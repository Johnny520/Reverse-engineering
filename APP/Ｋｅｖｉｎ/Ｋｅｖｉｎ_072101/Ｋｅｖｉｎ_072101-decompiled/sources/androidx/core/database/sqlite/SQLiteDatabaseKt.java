package androidx.core.database.sqlite;

/* JADX INFO: compiled from: SQLiteDatabase.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b¢\u0006\u0002\u0010\b¨\u0006\t"}, m115d2 = {"transaction", "T", "Landroid/database/sqlite/SQLiteDatabase;", "exclusive", "", "body", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/database/sqlite/SQLiteDatabase;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core-ktx_release"}, m116k = 2, m117mv = {1, 8, 0}, m119xi = 48)
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(android.database.sqlite.SQLiteDatabase r3, boolean r4, kotlin.jvm.functions.Function1<? super android.database.sqlite.SQLiteDatabase, ? extends T> r5) {
            r0 = 0
            if (r4 == 0) goto L7
            r3.beginTransaction()
            goto La
        L7:
            r3.beginTransactionNonExclusive()
        La:
            r1 = 1
            java.lang.Object r2 = r5.invoke(r3)     // Catch: java.lang.Throwable -> L1f
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L1f
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r3.endTransaction()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            r1 = r2
            return r2
        L1f:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r3.endTransaction()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r2
    }

    public static /* synthetic */ java.lang.Object transaction$default(android.database.sqlite.SQLiteDatabase r1, boolean r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L5
            r2 = 1
        L5:
            r4 = 0
            if (r2 == 0) goto Lc
            r1.beginTransaction()
            goto Lf
        Lc:
            r1.beginTransactionNonExclusive()
        Lf:
            java.lang.Object r0 = r3.invoke(r1)     // Catch: java.lang.Throwable -> L23
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L23
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            r1.endTransaction()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            r5 = r0
            return r0
        L23:
            r0 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            r1.endTransaction()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            throw r0
    }
}

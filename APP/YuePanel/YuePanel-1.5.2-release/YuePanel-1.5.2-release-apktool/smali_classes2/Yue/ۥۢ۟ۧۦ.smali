.class public final LYue/ۥۢ۟ۧۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStackTraceRecovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n37#2:225\n36#2,3:226\n12701#3,2:229\n1620#3,6:233\n12701#3,2:239\n1620#3,6:242\n26#4:231\n26#4:232\n1#5:241\n*S KotlinDebug\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n110#1:225\n110#1:226,3\n135#1:229,2\n145#1:233,6\n176#1:239,2\n202#1:242,6\n137#1:231\n139#1:232\n*E\n"
.end annotation


# static fields
.field public static final ۥ:Ljava/lang/String; = "kotlin.coroutines.jvm.internal.BaseContinuationImpl"
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:Ljava/lang/String; = "kotlinx.coroutines.internal.StackTraceRecoveryKt"
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟:Ljava/lang/String;

.field public static final ۥ۟۟۟:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    :try_start_0
    sget-object v0, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    const-class v0, LYue/ۥ۟ۢۥۢ;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {v0}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, LYue/ۥۡۦۧۤ;->ۥ۟۟۟۟(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "kotlin.coroutines.jvm.internal.BaseContinuationImpl"

    :goto_1
    check-cast v0, Ljava/lang/String;

    sput-object v0, LYue/ۥۢ۟ۧۦ;->ۥ۟۟:Ljava/lang/String;

    :try_start_1
    sget-object v0, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    const-class v0, LYue/ۥۢ۟ۧۦ;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    sget-object v1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {v0}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    invoke-static {v0}, LYue/ۥۡۦۧۤ;->ۥ۟۟۟۟(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_3

    :cond_1
    const-string v0, "kotlinx.coroutines.internal.StackTraceRecoveryKt"

    :goto_3
    check-cast v0, Ljava/lang/String;

    sput-object v0, LYue/ۥۢ۟ۧۦ;->ۥ۟۟۟:Ljava/lang/String;

    return-void
.end method

.method public static synthetic ۥ()V
    .locals 0

    return-void
.end method

.method public static synthetic ۥ۟()V
    .locals 0

    return-void
.end method

.method public static final synthetic ۥ۟۟(Ljava/lang/Throwable;LYue/ۥ۟ۧۧۨ;)Ljava/lang/Throwable;
    .locals 0

    invoke-static {p0, p1}, LYue/ۥۢ۟ۧۦ;->ۥ۟۟۠(Ljava/lang/Throwable;LYue/ۥ۟ۧۧۨ;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟(Ljava/lang/String;)Ljava/lang/StackTraceElement;
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StackTraceElement;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u0008\u0008\u0008("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "\u0008"

    const/4 v2, -0x1

    invoke-direct {v0, p0, v1, v1, v2}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public static final ۥ۟۟۟۟(Ljava/lang/Throwable;)LYue/ۥۣۡۦ۠;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;)",
            "LYue/\u06e5\u06e1\u06e3\u06e6\u06e0<",
            "TE;[",
            "Ljava/lang/StackTraceElement;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v2, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    array-length v3, v2

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    invoke-static {v5}, LYue/ۥۢ۟ۧۦ;->ۥ۟۟۟ۥ(Ljava/lang/StackTraceElement;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v0, v2}, LYue/ۥۢۢۢۡ;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)LYue/ۥۣۡۦ۠;

    move-result-object p0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    new-array v0, v1, [Ljava/lang/StackTraceElement;

    invoke-static {p0, v0}, LYue/ۥۢۢۢۡ;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)LYue/ۥۣۡۦ۠;

    move-result-object p0

    goto :goto_1

    :cond_2
    new-array v0, v1, [Ljava/lang/StackTraceElement;

    invoke-static {p0, v0}, LYue/ۥۢۢۢۡ;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)LYue/ۥۣۡۦ۠;

    move-result-object p0

    :goto_1
    return-object p0
.end method

.method public static final ۥ۟۟۟۠(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;TE;",
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/StackTraceElement;",
            ">;)TE;"
        }
    .end annotation

    const-string v0, "Coroutine boundary"

    invoke-static {v0}, LYue/ۥۢ۟ۧۦ;->ۥ۟۟۟(Ljava/lang/String;)Ljava/lang/StackTraceElement;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    sget-object v0, LYue/ۥۢ۟ۧۦ;->ۥ۟۟:Ljava/lang/String;

    invoke-static {p0, v0}, LYue/ۥۢ۟ۧۦ;->ۥۣ۟۟۟([Ljava/lang/StackTraceElement;Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    new-array p0, v2, [Ljava/lang/StackTraceElement;

    invoke-interface {p2, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    check-cast p0, [Ljava/lang/StackTraceElement;

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    add-int/2addr v1, v0

    new-array v1, v1, [Ljava/lang/StackTraceElement;

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, p0, v3

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    add-int/lit8 p2, v2, 0x1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/StackTraceElement;

    add-int/2addr v2, v0

    aput-object v3, v1, v2

    move v2, p2

    goto :goto_1

    :cond_3
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-object p1
.end method

.method public static final ۥ۟۟۟ۡ(LYue/ۥ۟ۧۧۨ;)Ljava/util/ArrayDeque;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e8;",
            ")",
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/StackTraceElement;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    invoke-interface {p0}, LYue/ۥ۟ۧۧۨ;->getStackTraceElement()Ljava/lang/StackTraceElement;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :cond_0
    :goto_0
    invoke-interface {p0}, LYue/ۥ۟ۧۧۨ;->getCallerFrame()LYue/ۥ۟ۧۧۨ;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v0

    :cond_1
    invoke-interface {p0}, LYue/ۥ۟ۧۧۨ;->getStackTraceElement()Ljava/lang/StackTraceElement;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public static final ۥ۟۟۟ۢ(Ljava/lang/StackTraceElement;Ljava/lang/StackTraceElement;)Z
    .locals 2

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥۣ۟۟۟([Ljava/lang/StackTraceElement;Ljava/lang/String;)I
    .locals 3

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_1
    return v1
.end method

.method public static final ۥ۟۟۟ۤ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 0
    .param p0    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-void
.end method

.method public static final ۥ۟۟۟ۥ(Ljava/lang/StackTraceElement;)Z
    .locals 4
    .param p0    # Ljava/lang/StackTraceElement;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "\u0008\u0008\u0008"

    const/4 v3, 0x0

    invoke-static {p0, v2, v3, v0, v1}, LYue/ۥۢ۠ۢۤ;->ۥۣ۟۠ۤ(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۦ([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/StackTraceElement;",
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/StackTraceElement;",
            ">;)V"
        }
    .end annotation

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p0, v1

    invoke-static {v2}, LYue/ۥۢ۟ۧۦ;->ۥ۟۟۟ۥ(Ljava/lang/StackTraceElement;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_1
    add-int/lit8 v1, v1, 0x1

    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    if-gt v1, v0, :cond_3

    :goto_2
    aget-object v2, p0, v0

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/StackTraceElement;

    invoke-static {v2, v3}, LYue/ۥۢ۟ۧۦ;->ۥ۟۟۟ۢ(Ljava/lang/StackTraceElement;Ljava/lang/StackTraceElement;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    :cond_2
    aget-object v2, p0, v0

    invoke-virtual {p1, v2}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    if-eq v0, v1, :cond_3

    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public static final ۥ۟۟۟ۧ(Ljava/lang/Throwable;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    throw p0
.end method

.method public static final ۥ۟۟۟ۨ(Ljava/lang/Throwable;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    throw p0
.end method

.method public static final ۥ۟۟۠(Ljava/lang/Throwable;LYue/ۥ۟ۧۧۨ;)Ljava/lang/Throwable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e8;",
            ")TE;"
        }
    .end annotation

    invoke-static {p0}, LYue/ۥۢ۟ۧۦ;->ۥ۟۟۟۟(Ljava/lang/Throwable;)LYue/ۥۣۡۦ۠;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۣۡۦ۠;->ۥ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    invoke-virtual {v0}, LYue/ۥۣۡۦ۠;->ۥ۟()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/StackTraceElement;

    invoke-static {v1}, LYue/ۥۢ۟ۧۦ;->ۥ۟۟۠ۢ(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, LYue/ۥۢ۟ۧۦ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۧۨ;)Ljava/util/ArrayDeque;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    return-object p0

    :cond_1
    if-eq v1, p0, :cond_2

    invoke-static {v0, p1}, LYue/ۥۢ۟ۧۦ;->ۥ۟۟۟ۦ([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V

    :cond_2
    invoke-static {v1, v2, p1}, LYue/ۥۢ۟ۧۦ;->ۥ۟۟۟۠(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠۟(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0
    .param p0    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;)TE;"
        }
    .end annotation

    return-object p0
.end method

.method public static final ۥ۟۟۠۠(Ljava/lang/Throwable;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Throwable;
    .locals 0
    .param p0    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "*>;)TE;"
        }
    .end annotation

    return-object p0
.end method

.method public static final ۥ۟۟۠ۡ(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;)TE;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    array-length v1, v0

    sget-object v2, LYue/ۥۢ۟ۧۦ;->ۥ۟۟۟:Ljava/lang/String;

    invoke-static {v0, v2}, LYue/ۥۢ۟ۧۦ;->ۥۣ۟۟۟([Ljava/lang/StackTraceElement;Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    sget-object v4, LYue/ۥۢ۟ۧۦ;->ۥ۟۟:Ljava/lang/String;

    invoke-static {v0, v4}, LYue/ۥۢ۟ۧۦ;->ۥۣ۟۟۟([Ljava/lang/StackTraceElement;Ljava/lang/String;)I

    move-result v4

    const/4 v5, -0x1

    const/4 v6, 0x0

    if-ne v4, v5, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    sub-int v4, v1, v4

    :goto_0
    sub-int/2addr v1, v2

    sub-int/2addr v1, v4

    new-array v2, v1, [Ljava/lang/StackTraceElement;

    :goto_1
    if-ge v6, v1, :cond_2

    if-nez v6, :cond_1

    const-string v4, "Coroutine boundary"

    invoke-static {v4}, LYue/ۥۢ۟ۧۦ;->ۥ۟۟۟(Ljava/lang/String;)Ljava/lang/StackTraceElement;

    move-result-object v4

    goto :goto_2

    :cond_1
    add-int v4, v3, v6

    add-int/lit8 v4, v4, -0x1

    aget-object v4, v0, v4

    :goto_2
    aput-object v4, v2, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v2}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-object p0
.end method

.method public static final ۥ۟۟۠ۢ(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;)TE;"
        }
    .end annotation

    invoke-static {p0}, LYue/ۥ۠ۡۢۥ;->ۥ۟۟۟ۢ(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    instance-of v2, p0, LYue/ۥ۟ۧۦۤ;

    if-nez v2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    return-object v1

    :cond_1
    return-object v0
.end method

.method public static final ۥۣ۟۟۠(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0
    .param p0    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;)TE;"
        }
    .end annotation

    return-object p0
.end method

.method public static final ۥ۟۟۠ۤ(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 5
    .param p0    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;)TE;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    invoke-static {v4}, LYue/ۥۢ۟ۧۦ;->ۥ۟۟۟ۥ(Ljava/lang/StackTraceElement;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-object v0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-object p0
.end method

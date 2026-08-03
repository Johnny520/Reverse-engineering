.class public final LYue/ۥۢ۠ۤ۟;
.super LYue/ۥۡۨۨۡ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢ۠۟ۡ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e1\u06e8\u06e8\u06e1<",
        "Ljava/lang/Integer;",
        ">;",
        "LYue/\u06e5\u06e2\u06e0\u06df\u06e1<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n+ 2 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,135:1\n20#2:136\n20#2:137\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n*L\n129#1:136\n131#1:137\n*E\n"
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 3

    const v0, 0x7fffffff

    sget-object v1, LYue/ۥۣۣ۟;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟;

    const/4 v2, 0x1

    invoke-direct {p0, v2, v0, v1}, LYue/ۥۡۨۨۡ;-><init>(IILYue/ۥۣۣ۟;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۡۨۨۡ;->ۥ۟۟۠ۤ(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤ۟;->ۥ۟۟ۤ()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۤ()Ljava/lang/Integer;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, LYue/ۥۡۨۨۡ;->ۥ۟۟ۢۦ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final ۥ۟۟ۤ۟(I)Z
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, LYue/ۥۡۨۨۡ;->ۥ۟۟ۢۦ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    add-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۡۨۨۡ;->ۥ۟۟۠ۤ(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

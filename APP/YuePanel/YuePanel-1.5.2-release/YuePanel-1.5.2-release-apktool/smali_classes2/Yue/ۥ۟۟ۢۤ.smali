.class public abstract LYue/ۥ۟۟ۢۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "LYue/\u06e5\u06df\u06df\u06e2\u06e6<",
        "*>;>",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 2 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,135:1\n20#2:136\n20#2:137\n20#2:139\n1#3:138\n13536#4,2:140\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n*L\n33#1:136\n48#1:137\n79#1:139\n98#1:140,2\n*E\n"
.end annotation


# instance fields
.field public ۥۣ۟۟۠:[LYue/ۥ۟۟ۢۦ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TS;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:I

.field public ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:LYue/ۥۢ۠ۤ۟;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic ۥ۟۟۟(LYue/ۥ۟۟ۢۤ;)I
    .locals 0

    iget p0, p0, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۠ۤ:I

    return p0
.end method

.method public static final synthetic ۥ۟۟۟۠(LYue/ۥ۟۟ۢۤ;)[LYue/ۥ۟۟ۢۦ;
    .locals 0

    iget-object p0, p0, LYue/ۥ۟۟ۢۤ;->ۥۣ۟۟۠:[LYue/ۥ۟۟ۢۦ;

    return-object p0
.end method

.method public static synthetic ۥ۟۟۠۟()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final ۥ۟۟۟ۡ()LYue/ۥ۟۟ۢۦ;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TS;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥ۟۟ۢۤ;->ۥۣ۟۟۠:[LYue/ۥ۟۟ۢۦ;

    const/4 v1, 0x2

    if-nez v0, :cond_0

    invoke-virtual {p0, v1}, LYue/ۥ۟۟ۢۤ;->ۥۣ۟۟۟(I)[LYue/ۥ۟۟ۢۦ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۟۟ۢۤ;->ۥۣ۟۟۠:[LYue/ۥ۟۟ۢۦ;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget v2, p0, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۠ۤ:I

    array-length v3, v0

    if-lt v2, v3, :cond_1

    array-length v2, v0

    mul-int/2addr v2, v1

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(this, newSize)"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, [LYue/ۥ۟۟ۢۦ;

    iput-object v1, p0, LYue/ۥ۟۟ۢۤ;->ۥۣ۟۟۠:[LYue/ۥ۟۟ۢۦ;

    check-cast v0, [LYue/ۥ۟۟ۢۦ;

    :cond_1
    :goto_0
    iget v1, p0, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۠ۥ:I

    :cond_2
    aget-object v2, v0, v1

    if-nez v2, :cond_3

    invoke-virtual {p0}, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۟ۢ()LYue/ۥ۟۟ۢۦ;

    move-result-object v2

    aput-object v2, v0, v1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    array-length v3, v0

    if-lt v1, v3, :cond_4

    const/4 v1, 0x0

    :cond_4
    invoke-virtual {v2, p0}, LYue/ۥ۟۟ۢۦ;->ۥ(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iput v1, p0, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۠ۥ:I

    iget v0, p0, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۠ۤ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۠ۤ:I

    iget-object v0, p0, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۠ۦ:LYue/ۥۢ۠ۤ۟;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz v0, :cond_5

    invoke-virtual {v0, v1}, LYue/ۥۢ۠ۤ۟;->ۥ۟۟ۤ۟(I)Z

    :cond_5
    return-object v2

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public abstract ۥ۟۟۟ۢ()LYue/ۥ۟۟ۢۦ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TS;"
        }
    .end annotation
.end method

.method public abstract ۥۣ۟۟۟(I)[LYue/ۥ۟۟ۢۦ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[TS;"
        }
    .end annotation
.end method

.method public final ۥ۟۟۟ۤ(LYue/ۥۣ۠ۡ۟;)V
    .locals 4
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TS;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0}, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۟(LYue/ۥ۟۟ۢۤ;)I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۟۠(LYue/ۥ۟۟ۢۤ;)[LYue/ۥ۟۟ۢۦ;

    move-result-object v0

    if-eqz v0, :cond_2

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    if-eqz v3, :cond_1

    invoke-interface {p1, v3}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ۥ۟۟۟ۥ(LYue/ۥ۟۟ۢۦ;)V
    .locals 6
    .param p1    # LYue/ۥ۟۟ۢۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget v0, p0, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۠ۤ:I

    const/4 v1, -0x1

    add-int/2addr v0, v1

    iput v0, p0, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۠ۤ:I

    iget-object v2, p0, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۠ۦ:LYue/ۥۢ۠ۤ۟;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    iput v3, p0, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    invoke-virtual {p1, p0}, LYue/ۥ۟۟ۢۦ;->ۥ۟(Ljava/lang/Object;)[LYue/ۥ۟ۧۤۢ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    array-length v0, p1

    :goto_1
    if-ge v3, v0, :cond_2

    aget-object v4, p1, v3

    if-eqz v4, :cond_1

    sget-object v5, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    sget-object v5, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-static {v5}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v2, v1}, LYue/ۥۢ۠ۤ۟;->ۥ۟۟ۤ۟(I)Z

    :cond_3
    return-void

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public final ۥ۟۟۟ۧ()I
    .locals 1

    iget v0, p0, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۠ۤ:I

    return v0
.end method

.method public final ۥ۟۟۠()[LYue/ۥ۟۟ۢۦ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[TS;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟ۢۤ;->ۥۣ۟۟۠:[LYue/ۥ۟۟ۢۦ;

    return-object v0
.end method

.method public final ۥ۟۟۠ۥ()LYue/ۥۢ۠۟ۡ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e2\u06e0\u06df\u06e1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۠ۦ:LYue/ۥۢ۠ۤ۟;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥۢ۠ۤ۟;

    iget v1, p0, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۠ۤ:I

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۤ۟;-><init>(I)V

    iput-object v0, p0, LYue/ۥ۟۟ۢۤ;->ۥ۟۟۠ۦ:LYue/ۥۢ۠ۤ۟;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

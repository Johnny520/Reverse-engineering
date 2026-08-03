.class public final LYue/ۥۣ۟ۦ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nCacheControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheControl.kt\nokhttp3/CacheControl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۦ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCacheControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheControl.kt\nokhttp3/CacheControl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"
.end annotation


# instance fields
.field public ۥ:Z

.field public ۥ۟:Z

.field public ۥ۟۟:I

.field public ۥ۟۟۟:I

.field public ۥ۟۟۟۟:I

.field public ۥ۟۟۟۠:Z

.field public ۥ۟۟۟ۡ:Z

.field public ۥ۟۟۟ۢ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟:I

    iput v0, p0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟۟:I

    iput v0, p0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟۟۟:I

    return-void
.end method


# virtual methods
.method public final ۥ()LYue/ۥۣ۟ۦ۟;
    .locals 17
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    move-object/from16 v0, p0

    new-instance v16, LYue/ۥۣ۟ۦ۟;

    iget-boolean v2, v0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ:Z

    iget-boolean v3, v0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟:Z

    iget v4, v0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟:I

    iget v9, v0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟۟:I

    iget v10, v0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟۟۟:I

    iget-boolean v11, v0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟۟۠:Z

    iget-boolean v12, v0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟۟ۡ:Z

    iget-boolean v13, v0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟۟ۢ:Z

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v1, v16

    invoke-direct/range {v1 .. v15}, LYue/ۥۣ۟ۦ۟;-><init>(ZZIIZZZIIZZZLjava/lang/String;LYue/ۥ۟ۨۥۢ;)V

    return-object v16
.end method

.method public final ۥ۟(J)I
    .locals 2

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    const p1, 0x7fffffff

    goto :goto_0

    :cond_0
    long-to-int p1, p1

    :goto_0
    return p1
.end method

.method public final ۥ۟۟()LYue/ۥۣ۟ۦ۟$ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟۟ۢ:Z

    return-object p0
.end method

.method public final ۥ۟۟۟(ILjava/util/concurrent/TimeUnit;)LYue/ۥۣ۟ۦ۟$ۥ;
    .locals 2
    .param p2    # Ljava/util/concurrent/TimeUnit;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "timeUnit"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p1, :cond_0

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟(J)I

    move-result p1

    iput p1, p0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟:I

    return-object p0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "maxAge < 0: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ۥ۟۟۟۟(ILjava/util/concurrent/TimeUnit;)LYue/ۥۣ۟ۦ۟$ۥ;
    .locals 2
    .param p2    # Ljava/util/concurrent/TimeUnit;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "timeUnit"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p1, :cond_0

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟(J)I

    move-result p1

    iput p1, p0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟۟:I

    return-object p0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "maxStale < 0: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ۥ۟۟۟۠(ILjava/util/concurrent/TimeUnit;)LYue/ۥۣ۟ۦ۟$ۥ;
    .locals 2
    .param p2    # Ljava/util/concurrent/TimeUnit;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "timeUnit"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p1, :cond_0

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟(J)I

    move-result p1

    iput p1, p0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟۟۟:I

    return-object p0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "minFresh < 0: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ۥ۟۟۟ۡ()LYue/ۥۣ۟ۦ۟$ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ:Z

    return-object p0
.end method

.method public final ۥ۟۟۟ۢ()LYue/ۥۣ۟ۦ۟$ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟:Z

    return-object p0
.end method

.method public final ۥۣ۟۟۟()LYue/ۥۣ۟ۦ۟$ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟۟ۡ:Z

    return-object p0
.end method

.method public final ۥ۟۟۟ۤ()LYue/ۥۣ۟ۦ۟$ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۟ۦ۟$ۥ;->ۥ۟۟۟۠:Z

    return-object p0
.end method

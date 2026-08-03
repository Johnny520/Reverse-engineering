.class public LYue/ۥۡۦۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"
.end annotation


# instance fields
.field public ۥ:LYue/ۥۡۦۤۧ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟:LYue/ۥۡۥۣۧ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟:I

.field public ۥ۟۟۟:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۟۟:LYue/ۥ۠ۤۡ۠;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۟۠:LYue/ۥ۠ۤۢۢ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۟ۡ:LYue/ۥۡۦۧ۟;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۟ۢ:LYue/ۥۡۦۧ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥۣ۟۟۟:LYue/ۥۡۦۧ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۟ۤ:LYue/ۥۡۦۧ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۟ۥ:J

.field public ۥ۟۟۟ۦ:J

.field public ۥ۟۟۟ۧ:LYue/ۥۣ۠ۡ۟;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟:I

    .line 3
    new-instance v0, LYue/ۥ۠ۤۢۢ$ۥ;

    invoke-direct {v0}, LYue/ۥ۠ۤۢۢ$ۥ;-><init>()V

    iput-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۢۢ$ۥ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۦۧ;)V
    .locals 2
    .param p1    # LYue/ۥۡۦۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "response"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 5
    iput v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟:I

    .line 6
    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۧۡ()LYue/ۥۡۦۤۧ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ:LYue/ۥۡۦۤۧ;

    .line 7
    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۧ۟()LYue/ۥۡۥۣۧ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟:LYue/ۥۡۥۣۧ;

    .line 8
    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۢۥ()I

    move-result v0

    iput v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟:I

    .line 9
    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۤۨ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۢۨ()LYue/ۥ۠ۤۡ۠;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۡ۠;

    .line 11
    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۤۢ()LYue/ۥ۠ۤۢۢ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠ۤۢۢ;->ۥۣ۟۟۟()LYue/ۥ۠ۤۢۢ$ۥ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۢۢ$ۥ;

    .line 12
    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۡۡ()LYue/ۥۡۦۧ۟;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۡ:LYue/ۥۡۦۧ۟;

    .line 13
    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۥ۟()LYue/ۥۡۦۧ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۢ:LYue/ۥۡۦۧ;

    .line 14
    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۡۧ()LYue/ۥۡۦۧ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥۣ۟۟۟:LYue/ۥۡۦۧ;

    .line 15
    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۦ()LYue/ۥۡۦۧ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۤ:LYue/ۥۡۦۧ;

    .line 16
    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۧۢ()J

    move-result-wide v0

    iput-wide v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۥ:J

    .line 17
    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۧ۠()J

    move-result-wide v0

    iput-wide v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۦ:J

    .line 18
    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۢۧ()LYue/ۥۣ۠ۡ۟;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۧ:LYue/ۥۣ۠ۡ۟;

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۦۧ$ۥ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۢۢ$ۥ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۤۢۢ$ۥ;->ۥ۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠ۤۢۢ$ۥ;

    return-object p0
.end method

.method public ۥ۟(LYue/ۥۡۦۧ۟;)LYue/ۥۡۦۧ$ۥ;
    .locals 0
    .param p1    # LYue/ۥۡۦۧ۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۡ:LYue/ۥۡۦۧ۟;

    return-object p0
.end method

.method public ۥ۟۟()LYue/ۥۡۦۧ;
    .locals 18
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    move-object/from16 v0, p0

    iget v5, v0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟:I

    if-ltz v5, :cond_3

    iget-object v2, v0, LYue/ۥۡۦۧ$ۥ;->ۥ:LYue/ۥۡۦۤۧ;

    if-eqz v2, :cond_2

    iget-object v3, v0, LYue/ۥۡۦۧ$ۥ;->ۥ۟:LYue/ۥۡۥۣۧ;

    if-eqz v3, :cond_1

    iget-object v4, v0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟:Ljava/lang/String;

    if-eqz v4, :cond_0

    iget-object v6, v0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۡ۠;

    iget-object v1, v0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۢۢ$ۥ;

    invoke-virtual {v1}, LYue/ۥ۠ۤۢۢ$ۥ;->ۥۣ۟۟۟()LYue/ۥ۠ۤۢۢ;

    move-result-object v7

    iget-object v8, v0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۡ:LYue/ۥۡۦۧ۟;

    iget-object v9, v0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۢ:LYue/ۥۡۦۧ;

    iget-object v10, v0, LYue/ۥۡۦۧ$ۥ;->ۥۣ۟۟۟:LYue/ۥۡۦۧ;

    iget-object v11, v0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۤ:LYue/ۥۡۦۧ;

    iget-wide v12, v0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۥ:J

    iget-wide v14, v0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۦ:J

    iget-object v1, v0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۧ:LYue/ۥۣ۠ۡ۟;

    new-instance v17, LYue/ۥۡۦۧ;

    move-object/from16 v16, v1

    move-object/from16 v1, v17

    invoke-direct/range {v1 .. v16}, LYue/ۥۡۦۧ;-><init>(LYue/ۥۡۦۤۧ;LYue/ۥۡۥۣۧ;Ljava/lang/String;ILYue/ۥ۠ۤۡ۠;LYue/ۥ۠ۤۢۢ;LYue/ۥۡۦۧ۟;LYue/ۥۡۦۧ;LYue/ۥۡۦۧ;LYue/ۥۡۦۧ;JJLYue/ۥۣ۠ۡ۟;)V

    return-object v17

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "message == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "protocol == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "request == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "code < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public ۥ۟۟۟(LYue/ۥۡۦۧ;)LYue/ۥۡۦۧ$ۥ;
    .locals 1
    .param p1    # LYue/ۥۡۦۧ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "cacheResponse"

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟۠(Ljava/lang/String;LYue/ۥۡۦۧ;)V

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥۣ۟۟۟:LYue/ۥۡۦۧ;

    return-object p0
.end method

.method public final ۥ۟۟۟۟(LYue/ۥۡۦۧ;)V
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۡۡ()LYue/ۥۡۦۧ۟;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "priorResponse.body != null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۥ۟۟۟۠(Ljava/lang/String;LYue/ۥۡۦۧ;)V
    .locals 1

    if-eqz p2, :cond_4

    invoke-virtual {p2}, LYue/ۥۡۦۧ;->ۥ۟۟ۡۡ()LYue/ۥۡۦۧ۟;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {p2}, LYue/ۥۡۦۧ;->ۥ۟۟ۥ۟()LYue/ۥۡۦۧ;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p2}, LYue/ۥۡۦۧ;->ۥ۟۟ۡۧ()LYue/ۥۡۦۧ;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, LYue/ۥۡۦۧ;->ۥ۟۟ۦ()LYue/ۥۡۦۧ;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".priorResponse != null"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".cacheResponse != null"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".networkResponse != null"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".body != null"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    :goto_0
    return-void
.end method

.method public ۥ۟۟۟ۡ(I)LYue/ۥۡۦۧ$ۥ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iput p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟:I

    return-object p0
.end method

.method public final ۥ۟۟۟ۢ()LYue/ۥۡۦۧ۟;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۡ:LYue/ۥۡۦۧ۟;

    return-object v0
.end method

.method public final ۥۣ۟۟۟()LYue/ۥۡۦۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥۣ۟۟۟:LYue/ۥۡۦۧ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۤ()I
    .locals 1

    iget v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟:I

    return v0
.end method

.method public final ۥ۟۟۟ۥ()LYue/ۥۣ۠ۡ۟;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۧ:LYue/ۥۣ۠ۡ۟;

    return-object v0
.end method

.method public final ۥ۟۟۟ۦ()LYue/ۥ۠ۤۡ۠;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۡ۠;

    return-object v0
.end method

.method public final ۥ۟۟۟ۧ()LYue/ۥ۠ۤۢۢ$ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۢۢ$ۥ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۨ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟۟۠()LYue/ۥۡۦۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۢ:LYue/ۥۡۦۧ;

    return-object v0
.end method

.method public final ۥ۟۟۠۟()LYue/ۥۡۦۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۤ:LYue/ۥۡۦۧ;

    return-object v0
.end method

.method public final ۥ۟۟۠۠()LYue/ۥۡۥۣۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟:LYue/ۥۡۥۣۧ;

    return-object v0
.end method

.method public final ۥ۟۟۠ۡ()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۦ:J

    return-wide v0
.end method

.method public final ۥ۟۟۠ۢ()LYue/ۥۡۦۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ:LYue/ۥۡۦۤۧ;

    return-object v0
.end method

.method public final ۥۣ۟۟۠()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۥ:J

    return-wide v0
.end method

.method public ۥ۟۟۠ۤ(LYue/ۥ۠ۤۡ۠;)LYue/ۥۡۦۧ$ۥ;
    .locals 0
    .param p1    # LYue/ۥ۠ۤۡ۠;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۡ۠;

    return-object p0
.end method

.method public ۥ۟۟۠ۥ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۦۧ$ۥ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۢۢ$ۥ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۤۢۢ$ۥ;->ۥ۟۟۟ۧ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠ۤۢۢ$ۥ;

    return-object p0
.end method

.method public ۥ۟۟۠ۦ(LYue/ۥ۠ۤۢۢ;)LYue/ۥۡۦۧ$ۥ;
    .locals 1
    .param p1    # LYue/ۥ۠ۤۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "headers"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥ۠ۤۢۢ;->ۥۣ۟۟۟()LYue/ۥ۠ۤۢۢ$ۥ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۢۢ$ۥ;

    return-object p0
.end method

.method public final ۥ۟۟۠ۧ(LYue/ۥۣ۠ۡ۟;)V
    .locals 1
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "deferredTrailers"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۧ:LYue/ۥۣ۠ۡ۟;

    return-void
.end method

.method public ۥ۟۟۠ۨ(Ljava/lang/String;)LYue/ۥۡۦۧ$ۥ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟:Ljava/lang/String;

    return-object p0
.end method

.method public ۥ۟۟ۡ(LYue/ۥۡۦۧ;)LYue/ۥۡۦۧ$ۥ;
    .locals 1
    .param p1    # LYue/ۥۡۦۧ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "networkResponse"

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟۠(Ljava/lang/String;LYue/ۥۡۦۧ;)V

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۢ:LYue/ۥۡۦۧ;

    return-object p0
.end method

.method public ۥ۟۟ۡ۟(LYue/ۥۡۦۧ;)LYue/ۥۡۦۧ$ۥ;
    .locals 0
    .param p1    # LYue/ۥۡۦۧ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟۟(LYue/ۥۡۦۧ;)V

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۤ:LYue/ۥۡۦۧ;

    return-object p0
.end method

.method public ۥ۟۟ۡ۠(LYue/ۥۡۥۣۧ;)LYue/ۥۡۦۧ$ۥ;
    .locals 1
    .param p1    # LYue/ۥۡۥۣۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "protocol"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟:LYue/ۥۡۥۣۧ;

    return-object p0
.end method

.method public ۥ۟۟ۡۡ(J)LYue/ۥۡۦۧ$ۥ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iput-wide p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۦ:J

    return-object p0
.end method

.method public ۥ۟۟ۡۢ(Ljava/lang/String;)LYue/ۥۡۦۧ$ۥ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۢۢ$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۢۢ$ۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;)LYue/ۥ۠ۤۢۢ$ۥ;

    return-object p0
.end method

.method public ۥۣ۟۟ۡ(LYue/ۥۡۦۤۧ;)LYue/ۥۡۦۧ$ۥ;
    .locals 1
    .param p1    # LYue/ۥۡۦۤۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ:LYue/ۥۡۦۤۧ;

    return-object p0
.end method

.method public ۥ۟۟ۡۤ(J)LYue/ۥۡۦۧ$ۥ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iput-wide p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۥ:J

    return-object p0
.end method

.method public final ۥ۟۟ۡۥ(LYue/ۥۡۦۧ۟;)V
    .locals 0
    .param p1    # LYue/ۥۡۦۧ۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۡ:LYue/ۥۡۦۧ۟;

    return-void
.end method

.method public final ۥ۟۟ۡۦ(LYue/ۥۡۦۧ;)V
    .locals 0
    .param p1    # LYue/ۥۡۦۧ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥۣ۟۟۟:LYue/ۥۡۦۧ;

    return-void
.end method

.method public final ۥ۟۟ۡۧ(I)V
    .locals 0

    iput p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟:I

    return-void
.end method

.method public final ۥ۟۟ۡۨ(LYue/ۥۣ۠ۡ۟;)V
    .locals 0
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۧ:LYue/ۥۣ۠ۡ۟;

    return-void
.end method

.method public final ۥ۟۟ۢ(LYue/ۥ۠ۤۡ۠;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۤۡ۠;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۡ۠;

    return-void
.end method

.method public final ۥ۟۟ۢ۟(LYue/ۥ۠ۤۢۢ$ۥ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۤۢۢ$ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۢۢ$ۥ;

    return-void
.end method

.method public final ۥ۟۟ۢ۠(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟:Ljava/lang/String;

    return-void
.end method

.method public final ۥ۟۟ۢۡ(LYue/ۥۡۦۧ;)V
    .locals 0
    .param p1    # LYue/ۥۡۦۧ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۢ:LYue/ۥۡۦۧ;

    return-void
.end method

.method public final ۥ۟۟ۢۢ(LYue/ۥۡۦۧ;)V
    .locals 0
    .param p1    # LYue/ۥۡۦۧ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۤ:LYue/ۥۡۦۧ;

    return-void
.end method

.method public final ۥۣ۟۟ۢ(LYue/ۥۡۥۣۧ;)V
    .locals 0
    .param p1    # LYue/ۥۡۥۣۧ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟:LYue/ۥۡۥۣۧ;

    return-void
.end method

.method public final ۥ۟۟ۢۤ(J)V
    .locals 0

    iput-wide p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۦ:J

    return-void
.end method

.method public final ۥ۟۟ۢۥ(LYue/ۥۡۦۤۧ;)V
    .locals 0
    .param p1    # LYue/ۥۡۦۤۧ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ:LYue/ۥۡۦۤۧ;

    return-void
.end method

.method public final ۥ۟۟ۢۦ(J)V
    .locals 0

    iput-wide p1, p0, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۥ:J

    return-void
.end method

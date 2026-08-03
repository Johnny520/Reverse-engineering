.class public final LYue/ۥۣ۠ۡ۟$ۥ;
.super LYue/ۥ۠ۢۧ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$RequestBodySink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠ۡ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$RequestBodySink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"
.end annotation


# instance fields
.field public final ۥ۟۟۠ۤ:J

.field public ۥ۟۟۠ۥ:Z

.field public ۥ۟۟۠ۦ:J

.field public ۥ۟۟۠ۧ:Z

.field public final synthetic ۥ۟۟۠ۨ:LYue/ۥۣ۠ۡ۟;


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۡ۟;LYue/ۥۣۢ۟ۡ;J)V
    .locals 1
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06df\u06e1\u06e3;",
            "J)V"
        }
    .end annotation

    const-string v0, "delegate"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۠ۨ:LYue/ۥۣ۠ۡ۟;

    invoke-direct {p0, p2}, LYue/ۥ۠ۢۧ;-><init>(LYue/ۥۣۢ۟ۡ;)V

    iput-wide p3, p0, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۠ۤ:J

    return-void
.end method

.method private final ۥ۟۟۟(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/io/IOException;",
            ">(TE;)TE;"
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۠ۥ:Z

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۠ۥ:Z

    iget-object v1, p0, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۠ۨ:LYue/ۥۣ۠ۡ۟;

    iget-wide v2, p0, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۠ۦ:J

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v6, p1

    invoke-virtual/range {v1 .. v6}, LYue/ۥۣ۠ۡ۟;->ۥ(JZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public close()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۠ۧ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۠ۧ:Z

    iget-wide v0, p0, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۠ۤ:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_2

    iget-wide v2, p0, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۠ۦ:J

    cmp-long v0, v2, v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "unexpected end of stream"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    :try_start_0
    invoke-super {p0}, LYue/ۥ۠ۢۧ;->close()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۟(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۟(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :try_start_0
    invoke-super {p0}, LYue/ۥ۠ۢۧ;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-direct {p0, v0}, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۟(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V
    .locals 4
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۠ۧ:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_2

    iget-wide v0, p0, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۠ۤ:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iget-wide v2, p0, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۠ۦ:J

    add-long/2addr v2, p2

    cmp-long v0, v2, v0

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "expected "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۠ۤ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " bytes but received "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۠ۦ:J

    add-long/2addr v1, p2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    :try_start_0
    invoke-super {p0, p1, p2, p3}, LYue/ۥ۠ۢۧ;->ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V

    iget-wide v0, p0, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۠ۦ:J

    add-long/2addr v0, p2

    iput-wide v0, p0, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۠ۦ:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-direct {p0, p1}, LYue/ۥۣ۠ۡ۟$ۥ;->ۥ۟۟۟(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

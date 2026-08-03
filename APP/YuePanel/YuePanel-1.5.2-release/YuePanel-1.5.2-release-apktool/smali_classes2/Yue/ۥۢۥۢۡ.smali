.class public final LYue/ۥۢۥۢۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nWebSocketWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketWriter.kt\nokhttp3/internal/ws/WebSocketWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWebSocketWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketWriter.kt\nokhttp3/internal/ws/WebSocketWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Z

.field public final ۥ۟۟۠ۤ:LYue/ۥۣۣ۟۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:Ljava/util/Random;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۦ:Z

.field public final ۥ۟۟۠ۧ:Z

.field public final ۥ۟۟۠ۨ:J

.field public final ۥ۟۟ۡ:LYue/ۥۣ۟ۢۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟ۡ۠:Z

.field public ۥ۟۟ۡۡ:LYue/ۥۡۡ۟۟;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟ۡۢ:[B
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥۣ۟۟ۡ:LYue/ۥۣ۟ۢۨ$ۥ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLYue/ۥۣۣ۟۟;Ljava/util/Random;ZZJ)V
    .locals 1
    .param p2    # LYue/ۥۣۣ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/util/Random;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LYue/ۥۢۥۢۡ;->ۥۣ۟۟۠:Z

    iput-object p2, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟۟;

    iput-object p3, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟۠ۥ:Ljava/util/Random;

    iput-boolean p4, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟۠ۦ:Z

    iput-boolean p5, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟۠ۧ:Z

    iput-wide p6, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟۠ۨ:J

    new-instance p3, LYue/ۥۣ۟ۢۨ;

    invoke-direct {p3}, LYue/ۥۣ۟ۢۨ;-><init>()V

    iput-object p3, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ:LYue/ۥۣ۟ۢۨ;

    invoke-interface {p2}, LYue/ۥۣۣ۟۟;->ۥ۟۟۟ۡ()LYue/ۥۣ۟ۢۨ;

    move-result-object p2

    iput-object p2, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 p3, 0x4

    new-array p3, p3, [B

    goto :goto_0

    :cond_0
    move-object p3, p2

    :goto_0
    iput-object p3, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡۢ:[B

    if-eqz p1, :cond_1

    new-instance p2, LYue/ۥۣ۟ۢۨ$ۥ;

    invoke-direct {p2}, LYue/ۥۣ۟ۢۨ$ۥ;-><init>()V

    :cond_1
    iput-object p2, p0, LYue/ۥۢۥۢۡ;->ۥۣ۟۟ۡ:LYue/ۥۣ۟ۢۨ$ۥ;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡۡ:LYue/ۥۡۡ۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥۡۡ۟۟;->close()V

    :cond_0
    return-void
.end method

.method public final ۥ۟()Ljava/util/Random;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟۠ۥ:Ljava/util/Random;

    return-object v0
.end method

.method public final ۥ۟۟()LYue/ۥۣۣ۟۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟۟;

    return-object v0
.end method

.method public final ۥ۟۟۟(ILYue/ۥۣ۟ۥۤ;)V
    .locals 1
    .param p2    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LYue/ۥۣ۟ۥۤ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۥۤ;

    if-nez p1, :cond_0

    if-eqz p2, :cond_3

    :cond_0
    if-eqz p1, :cond_1

    sget-object v0, LYue/ۥۢۥۡۨ;->ۥ:LYue/ۥۢۥۡۨ;

    invoke-virtual {v0, p1}, LYue/ۥۢۥۡۨ;->ۥ۟۟۟(I)V

    :cond_1
    new-instance v0, LYue/ۥۣ۟ۢۨ;

    invoke-direct {v0}, LYue/ۥۣ۟ۢۨ;-><init>()V

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۠۟ۢ(I)LYue/ۥۣ۟ۢۨ;

    if-eqz p2, :cond_2

    invoke-virtual {v0, p2}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۢ(LYue/ۥۣ۟ۥۤ;)LYue/ۥۣ۟ۢۨ;

    :cond_2
    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۤ۠()LYue/ۥۣ۟ۥۤ;

    move-result-object v0

    :cond_3
    const/16 p1, 0x8

    const/4 p2, 0x1

    :try_start_0
    invoke-virtual {p0, p1, v0}, LYue/ۥۢۥۢۡ;->ۥ۟۟۟۟(ILYue/ۥۣ۟ۥۤ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean p2, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۠:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean p2, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۠:Z

    throw p1
.end method

.method public final ۥ۟۟۟۟(ILYue/ۥۣ۟ۥۤ;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۠:Z

    if-nez v0, :cond_3

    invoke-virtual {p2}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v0

    int-to-long v1, v0

    const-wide/16 v3, 0x7d

    cmp-long v1, v1, v3

    if-gtz v1, :cond_2

    or-int/lit16 p1, p1, 0x80

    iget-object v1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v1, p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۧ(I)LYue/ۥۣ۟ۢۨ;

    iget-boolean p1, p0, LYue/ۥۢۥۢۡ;->ۥۣ۟۟۠:Z

    if-eqz p1, :cond_0

    or-int/lit16 p1, v0, 0x80

    iget-object v1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v1, p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۧ(I)LYue/ۥۣ۟ۢۨ;

    iget-object p1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟۠ۥ:Ljava/util/Random;

    iget-object v1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡۢ:[B

    invoke-static {v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Ljava/util/Random;->nextBytes([B)V

    iget-object p1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;

    iget-object v1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡۢ:[B

    invoke-virtual {p1, v1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۥ([B)LYue/ۥۣ۟ۢۨ;

    if-lez v0, :cond_1

    iget-object p1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    iget-object p1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {p1, p2}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۢ(LYue/ۥۣ۟ۥۤ;)LYue/ۥۣ۟ۢۨ;

    iget-object p1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;

    iget-object p2, p0, LYue/ۥۢۥۢۡ;->ۥۣ۟۟ۡ:LYue/ۥۣ۟ۢۨ$ۥ;

    invoke-static {p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۥۢ(LYue/ۥۣ۟ۢۨ$ۥ;)LYue/ۥۣ۟ۢۨ$ۥ;

    iget-object p1, p0, LYue/ۥۢۥۢۡ;->ۥۣ۟۟ۡ:LYue/ۥۣ۟ۢۨ$ۥ;

    invoke-virtual {p1, v0, v1}, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۟ۢ(J)I

    sget-object p1, LYue/ۥۢۥۡۨ;->ۥ:LYue/ۥۢۥۡۨ;

    iget-object p2, p0, LYue/ۥۢۥۢۡ;->ۥۣ۟۟ۡ:LYue/ۥۣ۟ۢۨ$ۥ;

    iget-object v0, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡۢ:[B

    invoke-virtual {p1, p2, v0}, LYue/ۥۢۥۡۨ;->ۥ۟۟(LYue/ۥۣ۟ۢۨ$ۥ;[B)V

    iget-object p1, p0, LYue/ۥۢۥۢۡ;->ۥۣ۟۟ۡ:LYue/ۥۣ۟ۢۨ$ۥ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ$ۥ;->close()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {p1, v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۧ(I)LYue/ۥۣ۟ۢۨ;

    iget-object p1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {p1, p2}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۢ(LYue/ۥۣ۟ۥۤ;)LYue/ۥۣ۟ۢۨ;

    :cond_1
    :goto_0
    iget-object p1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟۟;

    invoke-interface {p1}, LYue/ۥۣۣ۟۟;->flush()V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Payload size must be less than or equal to 125"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۟ۢ(ILYue/ۥۣ۟ۥۤ;)V
    .locals 5
    .param p2    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۠:Z

    if-nez v0, :cond_6

    iget-object v0, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0, p2}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۢ(LYue/ۥۣ۟ۥۤ;)LYue/ۥۣ۟ۢۨ;

    or-int/lit16 v0, p1, 0x80

    iget-boolean v1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟۠ۦ:Z

    if-eqz v1, :cond_1

    invoke-virtual {p2}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result p2

    int-to-long v1, p2

    iget-wide v3, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟۠ۨ:J

    cmp-long p2, v1, v3

    if-ltz p2, :cond_1

    iget-object p2, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡۡ:LYue/ۥۡۡ۟۟;

    if-nez p2, :cond_0

    new-instance p2, LYue/ۥۡۡ۟۟;

    iget-boolean v0, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟۠ۧ:Z

    invoke-direct {p2, v0}, LYue/ۥۡۡ۟۟;-><init>(Z)V

    iput-object p2, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡۡ:LYue/ۥۡۡ۟۟;

    :cond_0
    iget-object v0, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {p2, v0}, LYue/ۥۡۡ۟۟;->ۥ۟(LYue/ۥۣ۟ۢۨ;)V

    or-int/lit16 v0, p1, 0xc0

    :cond_1
    iget-object p1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide p1

    iget-object v1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v1, v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۧ(I)LYue/ۥۣ۟ۢۨ;

    iget-boolean v0, p0, LYue/ۥۢۥۢۡ;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_2

    const/16 v0, 0x80

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    const-wide/16 v1, 0x7d

    cmp-long v1, p1, v1

    if-gtz v1, :cond_3

    long-to-int v1, p1

    or-int/2addr v0, v1

    iget-object v1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v1, v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۧ(I)LYue/ۥۣ۟ۢۨ;

    goto :goto_1

    :cond_3
    const-wide/32 v1, 0xffff

    cmp-long v1, p1, v1

    if-gtz v1, :cond_4

    or-int/lit8 v0, v0, 0x7e

    iget-object v1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v1, v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۧ(I)LYue/ۥۣ۟ۢۨ;

    iget-object v0, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;

    long-to-int v1, p1

    invoke-virtual {v0, v1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۠۟ۢ(I)LYue/ۥۣ۟ۢۨ;

    goto :goto_1

    :cond_4
    or-int/lit8 v0, v0, 0x7f

    iget-object v1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v1, v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۧ(I)LYue/ۥۣ۟ۢۨ;

    iget-object v0, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۟ۢۨ;->ۥ۟۠۟۠(J)LYue/ۥۣ۟ۢۨ;

    :goto_1
    iget-boolean v0, p0, LYue/ۥۢۥۢۡ;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟۠ۥ:Ljava/util/Random;

    iget-object v1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡۢ:[B

    invoke-static {v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextBytes([B)V

    iget-object v0, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;

    iget-object v1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡۢ:[B

    invoke-virtual {v0, v1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۥ([B)LYue/ۥۣ۟ۢۨ;

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_5

    iget-object v2, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ:LYue/ۥۣ۟ۢۨ;

    iget-object v3, p0, LYue/ۥۢۥۢۡ;->ۥۣ۟۟ۡ:LYue/ۥۣ۟ۢۨ$ۥ;

    invoke-static {v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۥۢ(LYue/ۥۣ۟ۢۨ$ۥ;)LYue/ۥۣ۟ۢۨ$ۥ;

    iget-object v2, p0, LYue/ۥۢۥۢۡ;->ۥۣ۟۟ۡ:LYue/ۥۣ۟ۢۨ$ۥ;

    invoke-virtual {v2, v0, v1}, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۟ۢ(J)I

    sget-object v0, LYue/ۥۢۥۡۨ;->ۥ:LYue/ۥۢۥۡۨ;

    iget-object v1, p0, LYue/ۥۢۥۢۡ;->ۥۣ۟۟ۡ:LYue/ۥۣ۟ۢۨ$ۥ;

    iget-object v2, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡۢ:[B

    invoke-virtual {v0, v1, v2}, LYue/ۥۢۥۡۨ;->ۥ۟۟(LYue/ۥۣ۟ۢۨ$ۥ;[B)V

    iget-object v0, p0, LYue/ۥۢۥۢۡ;->ۥۣ۟۟ۡ:LYue/ۥۣ۟ۢۨ$ۥ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ$ۥ;->close()V

    :cond_5
    iget-object v0, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ۟:LYue/ۥۣ۟ۢۨ;

    iget-object v1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟ۡ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0, v1, p1, p2}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V

    iget-object p1, p0, LYue/ۥۢۥۢۡ;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟۟;

    invoke-interface {p1}, LYue/ۥۣۣ۟۟;->ۥ۟۟۠ۢ()LYue/ۥۣۣ۟۟;

    return-void

    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۟ۤ(LYue/ۥۣ۟ۥۤ;)V
    .locals 1
    .param p1    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x9

    invoke-virtual {p0, v0, p1}, LYue/ۥۢۥۢۡ;->ۥ۟۟۟۟(ILYue/ۥۣ۟ۥۤ;)V

    return-void
.end method

.method public final ۥ۟۟۟ۨ(LYue/ۥۣ۟ۥۤ;)V
    .locals 1
    .param p1    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xa

    invoke-virtual {p0, v0, p1}, LYue/ۥۢۥۢۡ;->ۥ۟۟۟۟(ILYue/ۥۣ۟ۥۤ;)V

    return-void
.end method

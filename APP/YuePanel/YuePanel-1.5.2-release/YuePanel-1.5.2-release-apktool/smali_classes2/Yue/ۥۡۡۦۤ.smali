.class public final LYue/ۥۡۡۦۤ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۡۦۤ$ۥ;,
        LYue/ۥۡۡۦۤ$ۥ۟;,
        LYue/ۥۡۡۦۤ$ۥ۟۟;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"
.end annotation


# static fields
.field public static final ۥ۟۟ۡ۠:LYue/ۥۡۡۦۤ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟ۡۡ:LYue/ۥۣۡۤۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:LYue/ۥۣ۟ۥۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۦ:LYue/ۥۣ۟ۥۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۧ:I

.field public ۥ۟۟۠ۨ:Z

.field public ۥ۟۟ۡ:Z

.field public ۥ۟۟ۡ۟:LYue/ۥۡۡۦۤ$ۥ۟۟;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LYue/ۥۡۡۦۤ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۡۡۦۤ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۡۡۦۤ;->ۥ۟۟ۡ۠:LYue/ۥۡۡۦۤ$ۥ;

    sget-object v0, LYue/ۥۣۡۤۥ;->ۥ۟۟۠ۦ:LYue/ۥۣۡۤۥ$ۥ;

    sget-object v1, LYue/ۥۣ۟ۥۤ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۥۤ$ۥ;

    const-string v2, "\r\n"

    invoke-virtual {v1, v2}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;)LYue/ۥۣ۟ۥۤ;

    move-result-object v2

    const-string v3, "--"

    invoke-virtual {v1, v3}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;)LYue/ۥۣ۟ۥۤ;

    move-result-object v3

    const-string v4, " "

    invoke-virtual {v1, v4}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;)LYue/ۥۣ۟ۥۤ;

    move-result-object v4

    const-string v5, "\t"

    invoke-virtual {v1, v5}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;)LYue/ۥۣ۟ۥۤ;

    move-result-object v1

    filled-new-array {v2, v3, v4, v1}, [LYue/ۥۣ۟ۥۤ;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۣۡۤۥ$ۥ;->ۥ۟۟۟([LYue/ۥۣ۟ۥۤ;)LYue/ۥۣۡۤۥ;

    move-result-object v0

    sput-object v0, LYue/ۥۡۡۦۤ;->ۥ۟۟ۡۡ:LYue/ۥۣۡۤۥ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۣ۟۠;Ljava/lang/String;)V
    .locals 1
    .param p1    # LYue/ۥۣۣ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
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

    const-string v0, "boundary"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥۡۡۦۤ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    .line 3
    iput-object p2, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    .line 4
    new-instance p1, LYue/ۥۣ۟ۢۨ;

    invoke-direct {p1}, LYue/ۥۣ۟ۢۨ;-><init>()V

    .line 5
    const-string v0, "--"

    invoke-virtual {p1, v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۠۠(Ljava/lang/String;)LYue/ۥۣ۟ۢۨ;

    move-result-object p1

    .line 6
    invoke-virtual {p1, p2}, LYue/ۥۣ۟ۢۨ;->ۥ۟۠۠(Ljava/lang/String;)LYue/ۥۣ۟ۢۨ;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۤ۠()LYue/ۥۣ۟ۥۤ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۥۤ;

    .line 8
    new-instance p1, LYue/ۥۣ۟ۢۨ;

    invoke-direct {p1}, LYue/ۥۣ۟ۢۨ;-><init>()V

    .line 9
    const-string v0, "\r\n--"

    invoke-virtual {p1, v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۠۠(Ljava/lang/String;)LYue/ۥۣ۟ۢۨ;

    move-result-object p1

    .line 10
    invoke-virtual {p1, p2}, LYue/ۥۣ۟ۢۨ;->ۥ۟۠۠(Ljava/lang/String;)LYue/ۥۣ۟ۢۨ;

    move-result-object p1

    .line 11
    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۤ۠()LYue/ۥۣ۟ۥۤ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۥۤ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۦۧ۟;)V
    .locals 2
    .param p1    # LYue/ۥۡۦۧ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p1}, LYue/ۥۡۦۧ۟;->ۥ۟۟ۢ()LYue/ۥۣۣ۟۠;

    move-result-object v0

    .line 13
    invoke-virtual {p1}, LYue/ۥۡۦۧ۟;->ۥ۟۟۠()LYue/ۥۡ۠ۥۨ;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v1, "boundary"

    invoke-virtual {p1, v1}, LYue/ۥۡ۠ۥۨ;->ۥۣ۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 14
    invoke-direct {p0, v0, p1}, LYue/ۥۡۡۦۤ;-><init>(LYue/ۥۣۣ۟۠;Ljava/lang/String;)V

    return-void

    .line 15
    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "expected the Content-Type to have a boundary parameter"

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic ۥ۟(LYue/ۥۡۡۦۤ;J)J
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۡۦۤ;->ۥ۟۟۟ۨ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic ۥ۟۟()LYue/ۥۣۡۤۥ;
    .locals 1

    sget-object v0, LYue/ۥۡۡۦۤ;->ۥ۟۟ۡۡ:LYue/ۥۣۡۤۥ;

    return-object v0
.end method

.method public static final synthetic ۥ۟۟۟(LYue/ۥۡۡۦۤ;)LYue/ۥۡۡۦۤ$ۥ۟۟;
    .locals 0

    iget-object p0, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟ۡ۟:LYue/ۥۡۡۦۤ$ۥ۟۟;

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟۟(LYue/ۥۡۡۦۤ;)LYue/ۥۣۣ۟۠;
    .locals 0

    iget-object p0, p0, LYue/ۥۡۡۦۤ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟ۢ(LYue/ۥۡۡۦۤ;LYue/ۥۡۡۦۤ$ۥ۟۟;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟ۡ۟:LYue/ۥۡۡۦۤ$ۥ۟۟;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟۠ۨ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟۠ۨ:Z

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟ۡ۟:LYue/ۥۡۡۦۤ$ۥ۟۟;

    iget-object v0, p0, LYue/ۥۡۡۦۤ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {v0}, LYue/ۥۣۢ۟ۦ;->close()V

    return-void
.end method

.method public final ۥ۟۟۟ۤ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "boundary"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟۟۟ۨ(J)J
    .locals 4

    iget-object v0, p0, LYue/ۥۡۡۦۤ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    iget-object v1, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۥۤ;

    invoke-virtual {v1}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {v0, v1, v2}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۦۥ(J)V

    iget-object v0, p0, LYue/ۥۡۡۦۤ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {v0}, LYue/ۥۣۣ۟۠;->ۥ۟۟۟ۡ()LYue/ۥۣ۟ۢۨ;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۥۤ;

    invoke-virtual {v0, v1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۥۥ(LYue/ۥۣ۟ۥۤ;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    iget-object v0, p0, LYue/ۥۡۡۦۤ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {v0}, LYue/ۥۣۣ۟۠;->ۥ۟۟۟ۡ()LYue/ۥۣ۟ۢۨ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    iget-object v2, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۥۤ;

    invoke-virtual {v2}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public final ۥ۟۟۠()LYue/ۥۡۡۦۤ$ۥ۟;
    .locals 7
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟۠ۨ:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_9

    iget-boolean v0, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟ۡ:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    return-object v2

    :cond_0
    iget v0, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟۠ۧ:I

    const-wide/16 v3, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥۡۡۦۤ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    iget-object v5, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۥۤ;

    invoke-interface {v0, v3, v4, v5}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۤ۟(JLYue/ۥۣ۟ۥۤ;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۡۡۦۤ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    iget-object v3, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟۠ۥ:LYue/ۥۣ۟ۥۤ;

    invoke-virtual {v3}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v3

    int-to-long v3, v3

    invoke-interface {v0, v3, v4}, LYue/ۥۣۣ۟۠;->skip(J)V

    goto :goto_1

    :cond_1
    :goto_0
    const-wide/16 v5, 0x2000

    invoke-virtual {p0, v5, v6}, LYue/ۥۡۡۦۤ;->ۥ۟۟۟ۨ(J)J

    move-result-wide v5

    cmp-long v0, v5, v3

    if-eqz v0, :cond_2

    iget-object v0, p0, LYue/ۥۡۡۦۤ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-interface {v0, v5, v6}, LYue/ۥۣۣ۟۠;->skip(J)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LYue/ۥۡۡۦۤ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    iget-object v3, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۥۤ;

    invoke-virtual {v3}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v3

    int-to-long v3, v3

    invoke-interface {v0, v3, v4}, LYue/ۥۣۣ۟۠;->skip(J)V

    :goto_1
    const/4 v0, 0x0

    :goto_2
    iget-object v3, p0, LYue/ۥۡۡۦۤ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    sget-object v4, LYue/ۥۡۡۦۤ;->ۥ۟۟ۡۡ:LYue/ۥۣۡۤۥ;

    invoke-interface {v3, v4}, LYue/ۥۣۣ۟۠;->ۥۣ۟۟ۦ(LYue/ۥۣۡۤۥ;)I

    move-result v3

    const/4 v4, -0x1

    const-string v5, "unexpected characters after boundary"

    if-eq v3, v4, :cond_8

    if-eqz v3, :cond_7

    if-eq v3, v1, :cond_4

    const/4 v4, 0x2

    if-eq v3, v4, :cond_3

    const/4 v4, 0x3

    if-eq v3, v4, :cond_3

    goto :goto_2

    :cond_3
    move v0, v1

    goto :goto_2

    :cond_4
    if-nez v0, :cond_6

    iget v0, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟۠ۧ:I

    if-eqz v0, :cond_5

    iput-boolean v1, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟ۡ:Z

    return-object v2

    :cond_5
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "expected at least 1 part"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/net/ProtocolException;

    invoke-direct {v0, v5}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    iget v0, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟۠ۧ:I

    add-int/2addr v0, v1

    iput v0, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟۠ۧ:I

    new-instance v0, LYue/ۥۣ۠ۤۢ;

    iget-object v1, p0, LYue/ۥۡۡۦۤ;->ۥۣ۟۟۠:LYue/ۥۣۣ۟۠;

    invoke-direct {v0, v1}, LYue/ۥۣ۠ۤۢ;-><init>(LYue/ۥۣۣ۟۠;)V

    invoke-virtual {v0}, LYue/ۥۣ۠ۤۢ;->ۥ۟()LYue/ۥ۠ۤۢۢ;

    move-result-object v0

    new-instance v1, LYue/ۥۡۡۦۤ$ۥ۟۟;

    invoke-direct {v1, p0}, LYue/ۥۡۡۦۤ$ۥ۟۟;-><init>(LYue/ۥۡۡۦۤ;)V

    iput-object v1, p0, LYue/ۥۡۡۦۤ;->ۥ۟۟ۡ۟:LYue/ۥۡۡۦۤ$ۥ۟۟;

    new-instance v2, LYue/ۥۡۡۦۤ$ۥ۟;

    invoke-static {v1}, LYue/ۥۣۡۡ;->ۥ۟۟۟۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۣ۟۠;

    move-result-object v1

    invoke-direct {v2, v0, v1}, LYue/ۥۡۡۦۤ$ۥ۟;-><init>(LYue/ۥ۠ۤۢۢ;LYue/ۥۣۣ۟۠;)V

    return-object v2

    :cond_8
    new-instance v0, Ljava/net/ProtocolException;

    invoke-direct {v0, v5}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.class public final LYue/ۥ۠ۤۧۤ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۠;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۤۧۤ$ۥ;,
        LYue/ۥ۠ۤۧۤ$ۥ۟;,
        LYue/ۥ۠ۤۧۤ$ۥ۟۟;,
        LYue/ۥ۠ۤۧۤ$ۥ۟۟۟;,
        LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۟;,
        LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۠;,
        LYue/ۥ۠ۤۧۤ$ۥ۟۟۟ۡ;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"
.end annotation


# static fields
.field public static final ۥ۟۟۟ۤ:LYue/ۥ۠ۤۧۤ$ۥ۟۟۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۥ:J = -0x1L

.field public static final ۥ۟۟۟ۦ:I = 0x0

.field public static final ۥ۟۟۟ۧ:I = 0x1

.field public static final ۥ۟۟۟ۨ:I = 0x2

.field public static final ۥ۟۟۠:I = 0x3

.field public static final ۥ۟۟۠۟:I = 0x4

.field public static final ۥ۟۟۠۠:I = 0x5

.field public static final ۥ۟۟۠ۡ:I = 0x6


# instance fields
.field public final ۥ۟۟:LYue/ۥۣۡۢۨ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۟:LYue/ۥۡۦ۠ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۟۟:LYue/ۥۣۣ۟۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۟۠:LYue/ۥۣۣ۟۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۟ۡ:I

.field public final ۥ۟۟۟ۢ:LYue/ۥۣ۠ۤۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥۣ۟۟۟:LYue/ۥ۠ۤۢۢ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۤ:LYue/ۥ۠ۤۧۤ$ۥ۟۟۟;

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۡۢۨ;LYue/ۥۡۦ۠ۥ;LYue/ۥۣۣ۟۠;LYue/ۥۣۣ۟۟;)V
    .locals 1
    .param p1    # LYue/ۥۣۡۢۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡۦ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣۣ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣۣ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "connection"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sink"

    invoke-static {p4, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟:LYue/ۥۣۡۢۨ;

    iput-object p2, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟:LYue/ۥۡۦ۠ۥ;

    iput-object p3, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟۟:LYue/ۥۣۣ۟۠;

    iput-object p4, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟۠:LYue/ۥۣۣ۟۟;

    new-instance p1, LYue/ۥۣ۠ۤۢ;

    invoke-direct {p1, p3}, LYue/ۥۣ۠ۤۢ;-><init>(LYue/ۥۣۣ۟۠;)V

    iput-object p1, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۢ:LYue/ۥۣ۠ۤۢ;

    return-void
.end method

.method public static final synthetic ۥ۟۟۟ۤ(LYue/ۥ۠ۤۧۤ;LYue/ۥ۠ۢۧ۠;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۠ۢ(LYue/ۥ۠ۢۧ۠;)V

    return-void
.end method

.method public static final synthetic ۥ۟۟۟ۥ(LYue/ۥ۠ۤۧۤ;)LYue/ۥۣۡۢۨ;
    .locals 0

    iget-object p0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟:LYue/ۥۣۡۢۨ;

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟ۦ(LYue/ۥ۠ۤۧۤ;)LYue/ۥۣ۠ۤۢ;
    .locals 0

    iget-object p0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۢ:LYue/ۥۣ۠ۤۢ;

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟ۧ(LYue/ۥ۠ۤۧۤ;)LYue/ۥۣۣ۟۟;
    .locals 0

    iget-object p0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟۠:LYue/ۥۣۣ۟۟;

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟ۨ(LYue/ۥ۠ۤۧۤ;)LYue/ۥۣۣ۟۠;
    .locals 0

    iget-object p0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟۟:LYue/ۥۣۣ۟۠;

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۠(LYue/ۥ۠ۤۧۤ;)I
    .locals 0

    iget p0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    return p0
.end method

.method public static final synthetic ۥ۟۟۠۟(LYue/ۥ۠ۤۧۤ;)LYue/ۥ۠ۤۢۢ;
    .locals 0

    iget-object p0, p0, LYue/ۥ۠ۤۧۤ;->ۥۣ۟۟۟:LYue/ۥ۠ۤۢۢ;

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۠۠(LYue/ۥ۠ۤۧۤ;I)V
    .locals 0

    iput p1, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    return-void
.end method

.method public static final synthetic ۥ۟۟۠ۡ(LYue/ۥ۠ۤۧۤ;LYue/ۥ۠ۤۢۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۤۧۤ;->ۥۣ۟۟۟:LYue/ۥ۠ۤۢۢ;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟۠()LYue/ۥۡۦ۠ۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۦ۠ۥ;->ۥۣ۟۟۟()V

    return-void
.end method

.method public ۥ(LYue/ۥۡۦۧ;)J
    .locals 2
    .param p1    # LYue/ۥۡۦۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "response"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥ۠ۤۨۡ;->ۥ۟۟(LYue/ۥۡۦۧ;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۠ۤ(LYue/ۥۡۦۧ;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, -0x1

    goto :goto_0

    :cond_1
    invoke-static {p1}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۡ۟(LYue/ۥۡۦۧ;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public ۥ۟(LYue/ۥۡۦۤۧ;J)LYue/ۥۣۢ۟ۡ;
    .locals 2
    .param p1    # LYue/ۥۡۦۤۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥۡۦۤۧ;->ۥ۟۟۟۠()LYue/ۥۡۦۥ;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LYue/ۥۡۦۤۧ;->ۥ۟۟۟۠()LYue/ۥۡۦۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۦۥ;->ۥ۟۟۠۟()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Duplex connections are not supported for HTTP/1"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, LYue/ۥ۠ۤۧۤ;->ۥۣ۟۟۠(LYue/ۥۡۦۤۧ;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۠ۦ()LYue/ۥۣۢ۟ۡ;

    move-result-object p1

    goto :goto_1

    :cond_2
    const-wide/16 v0, -0x1

    cmp-long p1, p2, v0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟ۡ()LYue/ۥۣۢ۟ۡ;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {v0}, LYue/ۥۣۣ۟۟;->flush()V

    return-void
.end method

.method public ۥ۟۟۟(LYue/ۥۡۦۤۧ;)V
    .locals 3
    .param p1    # LYue/ۥۡۦۤۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "request"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۦۥ۠;->ۥ:LYue/ۥۡۦۥ۠;

    invoke-virtual {p0}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟۠()LYue/ۥۡۦ۠ۥ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۡۦ۠ۥ;->ۥ۟()LYue/ۥۣۡۧ۠;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۣۡۧ۠;->ۥ۟۟۟۟()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    const-string v2, "connection.route().proxy.type()"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, LYue/ۥۡۦۥ۠;->ۥ(LYue/ۥۡۦۤۧ;Ljava/net/Proxy$Type;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LYue/ۥۡۦۤۧ;->ۥ۟۟۟ۤ()LYue/ۥ۠ۤۢۢ;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟ۡۡ(LYue/ۥ۠ۤۢۢ;Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۟۟(Z)LYue/ۥۡۦۧ$ۥ;
    .locals 4
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    const/4 v1, 0x1

    const/4 v2, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "state: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    :try_start_0
    sget-object v0, LYue/ۥۢ۠۠۟;->ۥ۟۟۟:LYue/ۥۢ۠۠۟$ۥ;

    iget-object v1, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۢ:LYue/ۥۣ۠ۤۢ;

    invoke-virtual {v1}, LYue/ۥۣ۠ۤۢ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۢ۠۠۟$ۥ;->ۥ۟(Ljava/lang/String;)LYue/ۥۢ۠۠۟;

    move-result-object v0

    new-instance v1, LYue/ۥۡۦۧ$ۥ;

    invoke-direct {v1}, LYue/ۥۡۦۧ$ۥ;-><init>()V

    iget-object v3, v0, LYue/ۥۢ۠۠۟;->ۥ:LYue/ۥۡۥۣۧ;

    invoke-virtual {v1, v3}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟ۡ۠(LYue/ۥۡۥۣۧ;)LYue/ۥۡۦۧ$ۥ;

    move-result-object v1

    iget v3, v0, LYue/ۥۢ۠۠۟;->ۥ۟:I

    invoke-virtual {v1, v3}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۡ(I)LYue/ۥۡۦۧ$ۥ;

    move-result-object v1

    iget-object v3, v0, LYue/ۥۢ۠۠۟;->ۥ۟۟:Ljava/lang/String;

    invoke-virtual {v1, v3}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۠ۨ(Ljava/lang/String;)LYue/ۥۡۦۧ$ۥ;

    move-result-object v1

    iget-object v3, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۢ:LYue/ۥۣ۠ۤۢ;

    invoke-virtual {v3}, LYue/ۥۣ۠ۤۢ;->ۥ۟()LYue/ۥ۠ۤۢۢ;

    move-result-object v3

    invoke-virtual {v1, v3}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۠ۦ(LYue/ۥ۠ۤۢۢ;)LYue/ۥۡۦۧ$ۥ;

    move-result-object v1

    const/16 v3, 0x64

    if-eqz p1, :cond_2

    iget p1, v0, LYue/ۥۢ۠۠۟;->ۥ۟:I

    if-ne p1, v3, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_2
    iget p1, v0, LYue/ۥۢ۠۠۟;->ۥ۟:I

    if-ne p1, v3, :cond_3

    iput v2, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    goto :goto_1

    :cond_3
    const/16 v0, 0x66

    if-gt v0, p1, :cond_4

    const/16 v0, 0xc8

    if-ge p1, v0, :cond_4

    iput v2, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    goto :goto_1

    :cond_4
    const/4 p1, 0x4

    iput p1, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-object v1

    :goto_2
    invoke-virtual {p0}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟۠()LYue/ۥۡۦ۠ۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۦ۠ۥ;->ۥ۟()LYue/ۥۣۡۧ۠;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۣۡۧ۠;->ۥ۟۟۟()LYue/ۥ۟۠ۢ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۟۠ۢ;->ۥ۟۟۠ۦ()LYue/ۥ۠ۤۨۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠ۤۨۥ;->ۥۣ۟۟()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unexpected end of stream on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public ۥ۟۟۟۠()LYue/ۥۡۦ۠ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟:LYue/ۥۡۦ۠ۥ;

    return-object v0
.end method

.method public ۥ۟۟۟ۡ()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {v0}, LYue/ۥۣۣ۟۟;->flush()V

    return-void
.end method

.method public ۥ۟۟۟ۢ()LYue/ۥ۠ۤۢۢ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۤۧۤ;->ۥۣ۟۟۟:LYue/ۥ۠ۤۢۢ;

    if-nez v0, :cond_0

    sget-object v0, LYue/ۥۣۢۥ۟;->ۥ۟:LYue/ۥ۠ۤۢۢ;

    :cond_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "too early; can\'t read the trailers yet"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥۣ۟۟۟(LYue/ۥۡۦۧ;)LYue/ۥۣۢ۟ۦ;
    .locals 4
    .param p1    # LYue/ۥۡۦۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥ۠ۤۨۡ;->ۥ۟۟(LYue/ۥۡۦۧ;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۠ۨ(J)LYue/ۥۣۢ۟ۦ;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۠ۤ(LYue/ۥۡۦۧ;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LYue/ۥۡۦۧ;->ۥ۟۟ۧۡ()LYue/ۥۡۦۤۧ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۡۦۤۧ;->ۥ۟۟۠۠()LYue/ۥ۠ۤۨۥ;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۠ۧ(LYue/ۥ۠ۤۨۥ;)LYue/ۥۣۢ۟ۦ;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۡ۟(LYue/ۥۡۦۧ;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-eqz p1, :cond_2

    invoke-virtual {p0, v0, v1}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۠ۨ(J)LYue/ۥۣۢ۟ۦ;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟ۡ۟()LYue/ۥۣۢ۟ۦ;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final ۥ۟۟۠ۢ(LYue/ۥ۠ۢۧ۠;)V
    .locals 2

    invoke-virtual {p1}, LYue/ۥ۠ۢۧ۠;->ۥ۟۟۟ۧ()LYue/ۥۢۡۤۧ;

    move-result-object v0

    sget-object v1, LYue/ۥۢۡۤۧ;->ۥ۟۟۟۟:LYue/ۥۢۡۤۧ;

    invoke-virtual {p1, v1}, LYue/ۥ۠ۢۧ۠;->ۥ۟۟۟ۨ(LYue/ۥۢۡۤۧ;)LYue/ۥ۠ۢۧ۠;

    invoke-virtual {v0}, LYue/ۥۢۡۤۧ;->ۥ۟()LYue/ۥۢۡۤۧ;

    invoke-virtual {v0}, LYue/ۥۢۡۤۧ;->ۥ۟۟()LYue/ۥۢۡۤۧ;

    return-void
.end method

.method public final ۥۣ۟۟۠(LYue/ۥۡۦۤۧ;)Z
    .locals 2

    const-string v0, "Transfer-Encoding"

    invoke-virtual {p1, v0}, LYue/ۥۡۦۤۧ;->ۥۣ۟۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    const-string v1, "chunked"

    invoke-static {v1, p1, v0}, LYue/ۥۢ۠ۢۤ;->ۥ۟۠ۡۢ(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public final ۥ۟۟۠ۤ(LYue/ۥۡۦۧ;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "Transfer-Encoding"

    invoke-static {p1, v2, v0, v1, v0}, LYue/ۥۡۦۧ;->ۥۣ۟۟ۤ(LYue/ۥۡۦۧ;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    const-string v1, "chunked"

    invoke-static {v1, p1, v0}, LYue/ۥۢ۠ۢۤ;->ۥ۟۠ۡۢ(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public final ۥ۟۟۠ۥ()Z
    .locals 2

    iget v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟۠ۦ()LYue/ۥۣۢ۟ۡ;
    .locals 2

    iget v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    iput v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    new-instance v0, LYue/ۥ۠ۤۧۤ$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥ۠ۤۧۤ$ۥ۟;-><init>(LYue/ۥ۠ۤۧۤ;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ۥ۟۟۠ۧ(LYue/ۥ۠ۤۨۥ;)LYue/ۥۣۢ۟ۦ;
    .locals 2

    iget v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    iput v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    new-instance v0, LYue/ۥ۠ۤۧۤ$ۥ۟۟;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۤۧۤ$ۥ۟۟;-><init>(LYue/ۥ۠ۤۧۤ;LYue/ۥ۠ۤۨۥ;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "state: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟۠ۨ(J)LYue/ۥۣۢ۟ۦ;
    .locals 2

    iget v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    iput v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    new-instance v0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۟;

    invoke-direct {v0, p0, p1, p2}, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۟;-><init>(LYue/ۥ۠ۤۧۤ;J)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "state: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ۥ۟۟ۡ()LYue/ۥۣۢ۟ۡ;
    .locals 2

    iget v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    iput v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    new-instance v0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۠;

    invoke-direct {v0, p0}, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟۠;-><init>(LYue/ۥ۠ۤۧۤ;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ۥ۟۟ۡ۟()LYue/ۥۣۢ۟ۦ;
    .locals 2

    iget v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    iput v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    invoke-virtual {p0}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟۠()LYue/ۥۡۦ۠ۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۦ۠ۥ;->ۥۣ۟۟ۡ()V

    new-instance v0, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟ۡ;

    invoke-direct {v0, p0}, LYue/ۥ۠ۤۧۤ$ۥ۟۟۟ۡ;-><init>(LYue/ۥ۠ۤۧۤ;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ۥ۟۟ۡ۠(LYue/ۥۡۦۧ;)V
    .locals 4
    .param p1    # LYue/ۥۡۦۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "response"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۡ۟(LYue/ۥۡۦۧ;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, v0, v1}, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۠ۨ(J)LYue/ۥۣۢ۟ۦ;

    move-result-object p1

    const v0, 0x7fffffff

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, v0, v1}, LYue/ۥۣۢۥ۟;->ۥۣ۟۟۠(LYue/ۥۣۢ۟ۦ;ILjava/util/concurrent/TimeUnit;)Z

    invoke-interface {p1}, LYue/ۥۣۢ۟ۦ;->close()V

    return-void
.end method

.method public final ۥ۟۟ۡۡ(LYue/ۥ۠ۤۢۢ;Ljava/lang/String;)V
    .locals 4
    .param p1    # LYue/ۥ۠ۤۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "headers"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestLine"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {v0, p2}, LYue/ۥۣۣ۟۟;->ۥۣ۟۟ۡ(Ljava/lang/String;)LYue/ۥۣۣ۟۟;

    move-result-object p2

    const-string v0, "\r\n"

    invoke-interface {p2, v0}, LYue/ۥۣۣ۟۟;->ۥۣ۟۟ۡ(Ljava/lang/String;)LYue/ۥۣۣ۟۟;

    invoke-virtual {p1}, LYue/ۥ۠ۤۢۢ;->size()I

    move-result p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    iget-object v2, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-virtual {p1, v1}, LYue/ۥ۠ۤۢۢ;->ۥ۟۟۟۠(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, LYue/ۥۣۣ۟۟;->ۥۣ۟۟ۡ(Ljava/lang/String;)LYue/ۥۣۣ۟۟;

    move-result-object v2

    const-string v3, ": "

    invoke-interface {v2, v3}, LYue/ۥۣۣ۟۟;->ۥۣ۟۟ۡ(Ljava/lang/String;)LYue/ۥۣۣ۟۟;

    move-result-object v2

    invoke-virtual {p1, v1}, LYue/ۥ۠ۤۢۢ;->ۥ۟۟۟ۧ(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, LYue/ۥۣۣ۟۟;->ۥۣ۟۟ۡ(Ljava/lang/String;)LYue/ۥۣۣ۟۟;

    move-result-object v2

    invoke-interface {v2, v0}, LYue/ۥۣۣ۟۟;->ۥۣ۟۟ۡ(Ljava/lang/String;)LYue/ۥۣۣ۟۟;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟۠:LYue/ۥۣۣ۟۟;

    invoke-interface {p1, v0}, LYue/ۥۣۣ۟۟;->ۥۣ۟۟ۡ(Ljava/lang/String;)LYue/ۥۣۣ۟۟;

    const/4 p1, 0x1

    iput p1, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "state: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, LYue/ۥ۠ۤۧۤ;->ۥ۟۟۟ۡ:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

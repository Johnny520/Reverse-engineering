.class public final LYue/ۥ۠ۤۧۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۠;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۤۧۧ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۟:LYue/ۥ۠ۤۧۧ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۤ:Ljava/lang/String; = "connection"
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۥ:Ljava/lang/String; = "host"
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۦ:Ljava/lang/String; = "keep-alive"
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۧ:Ljava/lang/String; = "proxy-connection"
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۨ:Ljava/lang/String; = "transfer-encoding"
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠:Ljava/lang/String; = "te"
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠۟:Ljava/lang/String; = "encoding"
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠۠:Ljava/lang/String; = "upgrade"
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠ۡ:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final ۥ۟۟۠ۢ:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final ۥ۟۟:LYue/ۥۡۦ۠ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۟:LYue/ۥۡۦ۠ۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public volatile ۥ۟۟۟۠:LYue/ۥ۠ۤۨ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۟ۡ:LYue/ۥۡۥۣۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public volatile ۥ۟۟۟ۢ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, LYue/ۥ۠ۤۧۧ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۠ۤۧۧ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥ۠ۤۧۧ;->ۥۣ۟۟۟:LYue/ۥ۠ۤۧۧ$ۥ;

    const-string v12, ":scheme"

    const-string v13, ":authority"

    const-string v2, "connection"

    const-string v3, "host"

    const-string v4, "keep-alive"

    const-string v5, "proxy-connection"

    const-string v6, "te"

    const-string v7, "transfer-encoding"

    const-string v8, "encoding"

    const-string v9, "upgrade"

    const-string v10, ":method"

    const-string v11, ":path"

    filled-new-array/range {v2 .. v13}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۡۡ([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۠ۡ:Ljava/util/List;

    const-string v7, "encoding"

    const-string v8, "upgrade"

    const-string v1, "connection"

    const-string v2, "host"

    const-string v3, "keep-alive"

    const-string v4, "proxy-connection"

    const-string v5, "te"

    const-string v6, "transfer-encoding"

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۡۡ([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۠ۢ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۡۢۨ;LYue/ۥۡۦ۠ۥ;LYue/ۥۡۦ۠ۧ;LYue/ۥ۠ۤۧۦ;)V
    .locals 1
    .param p1    # LYue/ۥۣۡۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡۦ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۡۦ۠ۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥ۠ۤۧۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "client"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connection"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chain"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "http2Connection"

    invoke-static {p4, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟:LYue/ۥۡۦ۠ۥ;

    iput-object p3, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟:LYue/ۥۡۦ۠ۧ;

    iput-object p4, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {p1}, LYue/ۥۣۡۢۨ;->ۥ۟۟ۤ۟()Ljava/util/List;

    move-result-object p1

    sget-object p2, LYue/ۥۡۥۣۧ;->ۥ۟۟ۡ:LYue/ۥۡۥۣۧ;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, LYue/ۥۡۥۣۧ;->ۥ۟۟۠ۨ:LYue/ۥۡۥۣۧ;

    :goto_0
    iput-object p2, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟ۡ:LYue/ۥۡۥۣۧ;

    return-void
.end method

.method public static final synthetic ۥ۟۟۟ۤ()Ljava/util/List;
    .locals 1

    sget-object v0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۠ۡ:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic ۥ۟۟۟ۥ()Ljava/util/List;
    .locals 1

    sget-object v0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۠ۢ:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public cancel()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟ۢ:Z

    iget-object v0, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۨ;

    if-eqz v0, :cond_0

    sget-object v1, LYue/ۥ۠ۡ۠ۢ;->ۥ۟۟ۡۢ:LYue/ۥ۠ۡ۠ۢ;

    invoke-virtual {v0, v1}, LYue/ۥ۠ۤۨ;->ۥ۟۟۟۠(LYue/ۥ۠ۡ۠ۢ;)V

    :cond_0
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
    invoke-static {p1}, LYue/ۥۣۢۥ۟;->ۥ۟۟ۡ۟(LYue/ۥۡۦۧ;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public ۥ۟(LYue/ۥۡۦۤۧ;J)LYue/ۥۣۢ۟ۡ;
    .locals 0
    .param p1    # LYue/ۥۡۦۤۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string p2, "request"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۨ;

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1}, LYue/ۥ۠ۤۨ;->ۥ۟۟۠()LYue/ۥۣۢ۟ۡ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۨ;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟۠()LYue/ۥۣۢ۟ۡ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥۣۢ۟ۡ;->close()V

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

    iget-object v0, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۨ;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LYue/ۥۡۦۤۧ;->ۥ۟۟۟۠()LYue/ۥۡۦۥ;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    sget-object v1, LYue/ۥ۠ۤۧۧ;->ۥۣ۟۟۟:LYue/ۥ۠ۤۧۧ$ۥ;

    invoke-virtual {v1, p1}, LYue/ۥ۠ۤۧۧ$ۥ;->ۥ(LYue/ۥۡۦۤۧ;)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v1, p1, v0}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۧۦ(Ljava/util/List;Z)LYue/ۥ۠ۤۨ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۨ;

    iget-boolean p1, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟ۢ:Z

    if-nez p1, :cond_2

    iget-object p1, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۨ;

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1}, LYue/ۥ۠ۤۨ;->ۥ۟۟۠ۧ()LYue/ۥۢۡۤۧ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟:LYue/ۥۡۦ۠ۧ;

    invoke-virtual {v0}, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۠()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۤ(JLjava/util/concurrent/TimeUnit;)LYue/ۥۢۡۤۧ;

    iget-object p1, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۨ;

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1}, LYue/ۥ۠ۤۨ;->ۥ۟۟ۢ۟()LYue/ۥۢۡۤۧ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟:LYue/ۥۡۦ۠ۧ;

    invoke-virtual {v0}, LYue/ۥۡۦ۠ۧ;->ۥ۟۟۠۠()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1, v2}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۤ(JLjava/util/concurrent/TimeUnit;)LYue/ۥۢۡۤۧ;

    return-void

    :cond_2
    iget-object p1, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۨ;

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    sget-object v0, LYue/ۥ۠ۡ۠ۢ;->ۥ۟۟ۡۢ:LYue/ۥ۠ۡ۠ۢ;

    invoke-virtual {p1, v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟۟۠(LYue/ۥ۠ۡ۠ۢ;)V

    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟۟(Z)LYue/ۥۡۦۧ$ۥ;
    .locals 3
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۨ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟ۡۦ()LYue/ۥ۠ۤۢۢ;

    move-result-object v0

    sget-object v1, LYue/ۥ۠ۤۧۧ;->ۥۣ۟۟۟:LYue/ۥ۠ۤۧۧ$ۥ;

    iget-object v2, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟ۡ:LYue/ۥۡۥۣۧ;

    invoke-virtual {v1, v0, v2}, LYue/ۥ۠ۤۧۧ$ۥ;->ۥ۟(LYue/ۥ۠ۤۢۢ;LYue/ۥۡۥۣۧ;)LYue/ۥۡۦۧ$ۥ;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {v0}, LYue/ۥۡۦۧ$ۥ;->ۥ۟۟۟ۤ()I

    move-result p1

    const/16 v1, 0x64

    if-ne p1, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "stream wasn\'t created"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟۠()LYue/ۥۡۦ۠ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟:LYue/ۥۡۦ۠ۥ;

    return-object v0
.end method

.method public ۥ۟۟۟ۡ()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۧۦ;->flush()V

    return-void
.end method

.method public ۥ۟۟۟ۢ()LYue/ۥ۠ۤۢۢ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۨ;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟ۡۧ()LYue/ۥ۠ۤۢۢ;

    move-result-object v0

    return-object v0
.end method

.method public ۥۣ۟۟۟(LYue/ۥۡۦۧ;)LYue/ۥۣۢ۟ۦ;
    .locals 1
    .param p1    # LYue/ۥۡۦۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LYue/ۥ۠ۤۧۧ;->ۥ۟۟۟۠:LYue/ۥ۠ۤۨ;

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1}, LYue/ۥ۠ۤۨ;->ۥ۟۟۠ۡ()LYue/ۥ۠ۤۨ$ۥ۟۟;

    move-result-object p1

    return-object p1
.end method

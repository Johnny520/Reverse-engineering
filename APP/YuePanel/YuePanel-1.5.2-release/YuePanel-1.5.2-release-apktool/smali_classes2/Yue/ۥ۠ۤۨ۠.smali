.class public LYue/ۥ۠ۤۨ۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۦۧۤ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;,
        LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;,
        LYue/ۥ۠ۤۨ۠$ۥ۟۟;,
        LYue/ۥ۠ۤۨ۠$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟:Ljava/lang/String; = "Content-Encoding"

.field public static final ۥ۟۟۟:Ljava/lang/String; = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36"

.field public static final ۥ۟۟۟۟:Ljava/lang/String; = "User-Agent"

.field public static final ۥ۟۟۟۠:Ljava/lang/String; = "Content-Type"

.field public static final ۥ۟۟۟ۡ:Ljava/lang/String; = "multipart/form-data"

.field public static final ۥ۟۟۟ۢ:Ljava/lang/String; = "application/x-www-form-urlencoded"

.field public static final ۥۣ۟۟۟:I = 0x133

.field public static final ۥ۟۟۟ۤ:Ljava/lang/String; = "application/octet-stream"

.field public static final ۥ۟۟۟ۥ:Ljava/nio/charset/Charset;


# instance fields
.field public ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

.field public ۥ۟:LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "ISO-8859-1"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۤۨ۠;->ۥ۟۟۟ۥ:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-direct {v0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;-><init>()V

    iput-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    return-void
.end method

.method public constructor <init>(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-direct {v0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;-><init>(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;)V

    iput-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    return-void
.end method

.method public constructor <init>(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    .line 8
    iput-object p2, p0, LYue/ۥ۠ۤۨ۠;->ۥ۟:LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;LYue/ۥ۠ۤۨ۠$ۥ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LYue/ۥ۠ۤۨ۠;-><init>(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;)V

    return-void
.end method

.method public static synthetic ۥ۟۟ۢۡ()Ljava/nio/charset/Charset;
    .locals 1

    sget-object v0, LYue/ۥ۠ۤۨ۠;->ۥ۟۟۟ۥ:Ljava/nio/charset/Charset;

    return-object v0
.end method

.method public static synthetic ۥ۟۟ۢۢ(LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;)Z
    .locals 0

    invoke-static {p0}, LYue/ۥ۠ۤۨ۠;->ۥ۟۟ۢۧ(LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥۣ۟۟ۢ(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LYue/ۥ۠ۤۨ۠;->ۥ۟۟ۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟ۢۤ(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ;
    .locals 1

    new-instance v0, LYue/ۥ۠ۤۨ۠;

    invoke-direct {v0}, LYue/ۥ۠ۤۨ۠;-><init>()V

    invoke-interface {v0, p0}, LYue/ۥ۟ۦۧۤ;->ۥ۟۟۠ۦ(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ;

    return-object v0
.end method

.method public static ۥ۟۟ۢۥ(Ljava/net/URL;)LYue/ۥ۟ۦۧۤ;
    .locals 1

    new-instance v0, LYue/ۥ۠ۤۨ۠;

    invoke-direct {v0}, LYue/ۥ۠ۤۨ۠;-><init>()V

    invoke-interface {v0, p0}, LYue/ۥ۟ۦۧۤ;->ۥ۟۟۠ۢ(Ljava/net/URL;)LYue/ۥ۟ۦۧۤ;

    return-object v0
.end method

.method public static ۥ۟۟ۢۦ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "\""

    const-string v1, "%22"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟ۢۧ(LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;)Z
    .locals 1

    invoke-interface {p0}, LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;->data()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۟ۦۧۤ$ۥ۟;

    invoke-interface {v0}, LYue/ۥ۟ۦۧۤ$ۥ۟;->ۥ۟۟۟۠()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public get()LYue/ۥ۠۟ۧۥ;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    sget-object v1, LYue/ۥ۟ۦۧۤ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۦۧۤ$ۥ۟۟;

    invoke-virtual {v0, v1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۟۠(LYue/ۥ۟ۦۧۤ$ۥ۟۟;)LYue/ۥ۟ۦۧۤ$ۥ;

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠;->ۥ۟۟۠()LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ۟:LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;

    invoke-static {v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ۟:LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;

    invoke-interface {v0}, LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;->ۥ۟۟ۢۢ()LYue/ۥ۠۟ۧۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ;
    .locals 2

    const-string v0, "userAgent"

    invoke-static {p1, v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠۠(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    const-string v1, "User-Agent"

    invoke-virtual {v0, v1, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    return-object p0
.end method

.method public ۥ۟()LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    return-object v0
.end method

.method public ۥ۟۟(LYue/ۥۣۡۧۦ;)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۤۢ(LYue/ۥۣۡۧۦ;)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    return-object p0
.end method

.method public ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    return-object p0
.end method

.method public ۥ۟۟۟۟(Z)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۟۟(Z)LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;

    return-object p0
.end method

.method public ۥ۟۟۟۠(LYue/ۥ۟ۦۧۤ$ۥ۟۟;)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۟۠(LYue/ۥ۟ۦۧۤ$ۥ۟۟;)LYue/ۥ۟ۦۧۤ$ۥ;

    return-object p0
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۟ۡ(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;

    return-object p0
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥۡۦۤۨ;)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۟ۢ(LYue/ۥۡۦۤۨ;)LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;

    return-object p0
.end method

.method public ۥۣ۟۟۟(Ljava/lang/String;I)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥۣ۟۟ۤ(Ljava/lang/String;I)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    return-object p0
.end method

.method public ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    return-object p0
.end method

.method public ۥ۟۟۟ۥ(I)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۤۥ(I)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    return-object p0
.end method

.method public ۥ۟۟۟ۦ(I)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۟ۦ(I)LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;

    return-object p0
.end method

.method public ۥ۟۟۟ۧ(Z)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۟ۧ(Z)LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;

    return-object p0
.end method

.method public ۥ۟۟۟ۨ(Ljavax/net/ssl/SSLSocketFactory;)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۟ۨ(Ljavax/net/ssl/SSLSocketFactory;)V

    return-object p0
.end method

.method public ۥ۟۟۠()LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-static {v0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;->ۥۣ۟۟ۨ(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟۟;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ۟:LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;

    return-object v0
.end method

.method public ۥ۟۟۠۟(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۠۟(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;

    return-object p0
.end method

.method public ۥ۟۟۠۠(Ljava/net/Proxy;)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۤۤ(Ljava/net/Proxy;)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    return-object p0
.end method

.method public ۥ۟۟۠ۡ(Z)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۠ۡ(Z)LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;

    return-object p0
.end method

.method public ۥ۟۟۠ۢ(Ljava/net/URL;)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۠ۢ(Ljava/net/URL;)LYue/ۥ۟ۦۧۤ$ۥ;

    return-object p0
.end method

.method public ۥۣ۟۟۠(Ljava/util/Collection;)LYue/ۥ۟ۦۧۤ;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e4$\u06e5\u06df;",
            ">;)",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e4;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۟ۦۧۤ$ۥ۟;

    iget-object v1, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-virtual {v1, v0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۤۡ(LYue/ۥ۟ۦۧۤ$ۥ۟;)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public ۥ۟۟۠ۤ(Ljava/util/Map;)LYue/ۥ۟ۦۧۤ;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e4;"
        }
    .end annotation

    const-string v0, "headers"

    invoke-static {p1, v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public ۥ۟۟۠ۥ(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-static {p1, p2, p3}, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)LYue/ۥ۠ۤۨ۠$ۥ۟۟;

    move-result-object p1

    invoke-virtual {p1, p4}, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ۟۟۟(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ۟;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۤۡ(LYue/ۥ۟ۦۧۤ$ۥ۟;)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    return-object p0
.end method

.method public ۥ۟۟۠ۦ(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ;
    .locals 3

    const-string v0, "url"

    invoke-static {p1, v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۠ۢ(Ljava/net/URL;)LYue/ۥ۟ۦۧۤ$ۥ;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The supplied URL, \'%s\', is malformed. Make sure it is an absolute URL, and starts with \'http://\' or \'https://\'. See https://jsoup.org/cookbook/extracting-data/working-with-urls"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public ۥ۟۟۠ۧ()LYue/ۥ۟ۦۧۤ;
    .locals 2

    new-instance v0, LYue/ۥ۠ۤۨ۠;

    iget-object v1, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-direct {v0, v1}, LYue/ۥ۠ۤۨ۠;-><init>(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;)V

    return-object v0
.end method

.method public ۥ۟۟۠ۨ()LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ۟:LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You must execute the request before getting a response."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟ۡ(Ljava/net/CookieStore;)LYue/ۥ۟ۦۧۤ;
    .locals 3

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    new-instance v1, Ljava/net/CookieManager;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Ljava/net/CookieManager;-><init>(Ljava/net/CookieStore;Ljava/net/CookiePolicy;)V

    invoke-static {v0, v1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥۣ۟۟ۦ(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;Ljava/net/CookieManager;)Ljava/net/CookieManager;

    return-object p0
.end method

.method public ۥ۟۟ۡ۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-static {p1, p2}, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠ۤۨ۠$ۥ۟۟;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۤۡ(LYue/ۥ۟ۦۧۤ$ۥ۟;)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    return-object p0
.end method

.method public ۥ۟۟ۡ۠()Ljava/net/CookieStore;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-static {v0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥۣ۟۟ۥ(LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;)Ljava/net/CookieManager;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/CookieManager;->getCookieStore()Ljava/net/CookieStore;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۡۡ(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ;
    .locals 2

    const-string v0, "referrer"

    invoke-static {p1, v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠۠(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    const-string v1, "Referer"

    invoke-virtual {v0, v1, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    return-object p0
.end method

.method public ۥ۟۟ۡۢ(Ljava/util/Map;)LYue/ۥ۟ۦۧۤ;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e4;"
        }
    .end annotation

    const-string v0, "cookies"

    invoke-static {p1, v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public ۥۣ۟۟ۡ(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)LYue/ۥ۟ۦۧۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-static {p1, p2, p3}, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)LYue/ۥ۠ۤۨ۠$ۥ۟۟;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۤۡ(LYue/ۥ۟ۦۧۤ$ۥ۟;)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    return-object p0
.end method

.method public ۥ۟۟ۡۤ()LYue/ۥ۠۟ۧۥ;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    sget-object v1, LYue/ۥ۟ۦۧۤ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۦۧۤ$ۥ۟۟;

    invoke-virtual {v0, v1}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟۟۠(LYue/ۥ۟ۦۧۤ$ۥ۟۟;)LYue/ۥ۟ۦۧۤ$ۥ;

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠;->ۥ۟۟۠()LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ۟:LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;

    invoke-static {v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    iget-object v0, p0, LYue/ۥ۠ۤۨ۠;->ۥ۟:LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;

    invoke-interface {v0}, LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;->ۥ۟۟ۢۢ()LYue/ۥ۠۟ۧۥ;

    move-result-object v0

    return-object v0
.end method

.method public varargs ۥ۟۟ۡۥ([Ljava/lang/String;)LYue/ۥ۟ۦۧۤ;
    .locals 4

    const-string v0, "keyvals"

    invoke-static {p1, v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠۠(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    rem-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v2, "Must supply an even number of key value pairs"

    invoke-static {v0, v2}, LYue/ۥۣۢۥ۠;->ۥۣ۟۟۟(ZLjava/lang/String;)V

    :goto_1
    array-length v0, p1

    if-ge v1, v0, :cond_1

    aget-object v0, p1, v1

    add-int/lit8 v2, v1, 0x1

    aget-object v2, p1, v2

    const-string v3, "Data key must not be empty"

    invoke-static {v0, v3}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "Data value must not be null"

    invoke-static {v2, v3}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-static {v0, v2}, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠ۤۨ۠$ۥ۟۟;

    move-result-object v0

    invoke-virtual {v3, v0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۤۡ(LYue/ۥ۟ۦۧۤ$ۥ۟;)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    add-int/lit8 v1, v1, 0x2

    goto :goto_1

    :cond_1
    return-object p0
.end method

.method public ۥ۟۟ۡۧ(LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;)LYue/ۥ۟ۦۧۤ;
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۤۨ۠;->ۥ۟:LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟;

    return-object p0
.end method

.method public ۥ۟۟ۡۨ(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ۟;
    .locals 3

    const-string v0, "key"

    invoke-static {p1, v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۟ۨ(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۠ۤۨ۠;->ۥ۟()LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;->data()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۟ۦۧۤ$ۥ۟;

    invoke-interface {v1}, LYue/ۥ۟ۦۧۤ$ۥ۟;->key()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟ۢ(Ljava/util/Map;)LYue/ۥ۟ۦۧۤ;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e4;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v2, v0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟;->ۥ(Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠ۤۨ۠$ۥ۟۟;

    move-result-object v0

    invoke-virtual {v1, v0}, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;->ۥ۟۟ۤۡ(LYue/ۥ۟ۦۧۤ$ۥ۟;)LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public ۥ۟۟ۢ۟(LYue/ۥ۟ۦۧۤ$ۥ۟۟۟;)LYue/ۥ۟ۦۧۤ;
    .locals 0

    check-cast p1, LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    iput-object p1, p0, LYue/ۥ۠ۤۨ۠;->ۥ:LYue/ۥ۠ۤۨ۠$ۥ۟۟۟;

    return-object p0
.end method

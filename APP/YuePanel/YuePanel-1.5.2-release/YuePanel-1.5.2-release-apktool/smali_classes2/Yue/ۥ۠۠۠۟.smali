.class public abstract LYue/ۥ۠۠۠۟;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public ۥ:LYue/ۥۡۧ۟ۨ;

.field public ۥ۟:LYue/ۥۣۣۡۢ;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۠۠۠۟;->ۥ:LYue/ۥۡۧ۟ۨ;

    iput-object v0, p0, LYue/ۥ۠۠۠۟;->ۥ۟:LYue/ۥۣۣۡۢ;

    return-void
.end method

.method public static ۥ۟۟۠ۢ(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 4

    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/16 v1, 0x30

    :goto_0
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    const/16 v3, 0xd

    if-ne v1, v3, :cond_0

    const/16 v1, 0xa

    if-ne v2, v1, :cond_0

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result p0

    add-int/lit8 p0, p0, -0x2

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-object v0

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v1

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    sub-int/2addr v1, v0

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۥۣ۟۟۠(Ljava/nio/ByteBuffer;)Ljava/lang/String;
    .locals 2

    invoke-static {p0}, LYue/ۥ۠۠۠۟;->ۥ۟۟۠ۢ(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    move-result p0

    invoke-static {v0, v1, p0}, LYue/ۥ۟ۤۤ۟;->ۥ۟۟۟۟([BII)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static ۥ۟۟ۡ(Ljava/nio/ByteBuffer;LYue/ۥۡۧ۟ۨ;)LYue/ۥ۠ۤۡۡ;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۧ;
        }
    .end annotation

    invoke-static {p0}, LYue/ۥ۠۠۠۟;->ۥۣ۟۟۠(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v1, " "

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    array-length v3, v1

    if-ne v3, v2, :cond_5

    sget-object v2, LYue/ۥۡۧ۟ۨ;->ۥۣ۟۟۠:LYue/ۥۡۧ۟ۨ;

    if-ne p1, v2, :cond_0

    invoke-static {v1, v0}, LYue/ۥ۠۠۠۟;->ۥ۟۟ۡ۟([Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠ۤۡۡ;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {v1, v0}, LYue/ۥ۠۠۠۟;->ۥ۟۟ۡ۠([Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠ۤۡۡ;

    move-result-object p1

    :goto_0
    invoke-static {p0}, LYue/ۥ۠۠۠۟;->ۥۣ۟۟۠(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_3

    const-string v1, ":"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    if-ne v1, v2, :cond_2

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {p1, v2}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟۟۠(Ljava/lang/String;)Z

    move-result v2

    const-string v3, ""

    const-string v4, "^ +"

    const/4 v5, 0x1

    if-eqz v2, :cond_1

    aget-object v2, v0, v1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v1, v0, v1

    invoke-interface {p1, v1}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "; "

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v0, v0, v5

    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, LYue/ۥ۠ۤۡۡ;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    aget-object v1, v0, v1

    aget-object v0, v0, v5

    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LYue/ۥ۠ۤۡۡ;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    invoke-static {p0}, LYue/ۥ۠۠۠۟;->ۥۣ۟۟۠(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    new-instance p0, LYue/ۥ۠ۥۧۧ;

    const-string p1, "not an http header"

    invoke-direct {p0, p1}, LYue/ۥ۠ۥۧۧ;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    if-eqz v0, :cond_4

    return-object p1

    :cond_4
    new-instance p0, LYue/ۥ۠ۥۡۢ;

    invoke-direct {p0}, LYue/ۥ۠ۥۡۢ;-><init>()V

    throw p0

    :cond_5
    new-instance p0, LYue/ۥ۠ۥۧۧ;

    invoke-direct {p0}, LYue/ۥ۠ۥۧۧ;-><init>()V

    throw p0

    :cond_6
    new-instance p1, LYue/ۥ۠ۥۡۢ;

    invoke-virtual {p0}, Ljava/nio/Buffer;->capacity()I

    move-result p0

    add-int/lit16 p0, p0, 0x80

    invoke-direct {p1, p0}, LYue/ۥ۠ۥۡۢ;-><init>(I)V

    throw p1
.end method

.method public static ۥ۟۟ۡ۟([Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠ۤۡۡ;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۧ;
        }
    .end annotation

    const/4 v0, 0x1

    aget-object v1, p0, v0

    const-string v2, "101"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "HTTP/1.1"

    const/4 v2, 0x0

    aget-object v3, p0, v2

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p1, LYue/ۥۣ۠ۤۡ;

    invoke-direct {p1}, LYue/ۥۣ۠ۤۡ;-><init>()V

    aget-object v0, p0, v0

    invoke-static {v0}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    move-result v0

    invoke-interface {p1, v0}, LYue/ۥۣۡۨۢ;->ۥ۟۟۟ۡ(S)V

    const/4 v0, 0x2

    aget-object p0, p0, v0

    invoke-interface {p1, p0}, LYue/ۥۣۡۨۢ;->ۥۣ۟۟۟(Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance v0, LYue/ۥ۠ۥۧۧ;

    aget-object p0, p0, v2

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "Invalid status line received: %s Status line: %s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, LYue/ۥ۠ۥۧۧ;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v1, LYue/ۥ۠ۥۧۧ;

    aget-object p0, p0, v0

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "Invalid status code received: %s Status line: %s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, LYue/ۥ۠ۥۧۧ;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static ۥ۟۟ۡ۠([Ljava/lang/String;Ljava/lang/String;)LYue/ۥ۠ۤۡۡ;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۧ;
        }
    .end annotation

    const/4 v0, 0x0

    aget-object v1, p0, v0

    const-string v2, "GET"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "HTTP/1.1"

    const/4 v1, 0x2

    aget-object v2, p0, v1

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, LYue/ۥ۠ۤۡۢ;

    invoke-direct {p1}, LYue/ۥ۠ۤۡۢ;-><init>()V

    const/4 v0, 0x1

    aget-object p0, p0, v0

    invoke-interface {p1, p0}, LYue/ۥ۟ۤۨۢ;->ۥ۟۟۟ۢ(Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance v0, LYue/ۥ۠ۥۧۧ;

    aget-object p0, p0, v1

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "Invalid status line received: %s Status line: %s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, LYue/ۥ۠ۥۧۧ;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v1, LYue/ۥ۠ۥۧۧ;

    aget-object p0, p0, v0

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "Invalid request method received: %s Status line: %s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, LYue/ۥ۠ۥۧۧ;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ۥ(LYue/ۥ۟ۤۨۡ;LYue/ۥۣۡۨۡ;)LYue/ۥ۠ۤۡۤ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۧ;
        }
    .end annotation
.end method

.method public abstract ۥ۟(LYue/ۥ۟ۤۨۡ;)LYue/ۥ۠ۤۡۤ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۧ;
        }
    .end annotation
.end method

.method public ۥ۟۟(LYue/ۥ۠ۤۡۥ;)Z
    .locals 2

    const-string v0, "Upgrade"

    invoke-interface {p1, v0}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "websocket"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Connection"

    invoke-interface {p1, v0}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "upgrade"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟۟۟(I)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۤ;
        }
    .end annotation

    if-ltz p1, :cond_0

    return p1

    :cond_0
    new-instance p1, LYue/ۥ۠ۥۧۤ;

    const/16 v0, 0x3ea

    const-string v1, "Negative count"

    invoke-direct {p1, v0, v1}, LYue/ۥ۠ۥۧۤ;-><init>(ILjava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟۟(LYue/ۥۣۣۡۢ;Ljava/nio/ByteBuffer;Z)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e2;",
            "Ljava/nio/ByteBuffer;",
            "Z)",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e0;",
            ">;"
        }
    .end annotation

    sget-object v0, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۥ:LYue/ۥۣۣۡۢ;

    if-eq p1, v0, :cond_1

    sget-object v1, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۤ:LYue/ۥۣۣۡۢ;

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Only Opcode.BINARY or  Opcode.TEXT are allowed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v1, p0, LYue/ۥ۠۠۠۟;->ۥ۟:LYue/ۥۣۣۡۢ;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    new-instance v0, LYue/ۥ۟ۧۥۡ;

    invoke-direct {v0}, LYue/ۥ۟ۧۥۡ;-><init>()V

    goto :goto_1

    :cond_2
    iput-object p1, p0, LYue/ۥ۠۠۠۟;->ۥ۟:LYue/ۥۣۣۡۢ;

    if-ne p1, v0, :cond_3

    new-instance v0, LYue/ۥ۟ۢۧ;

    invoke-direct {v0}, LYue/ۥ۟ۢۧ;-><init>()V

    goto :goto_1

    :cond_3
    sget-object v0, LYue/ۥۣۣۡۢ;->ۥ۟۟۠ۤ:LYue/ۥۣۣۡۢ;

    if-ne p1, v0, :cond_4

    new-instance v0, LYue/ۥۢۡ۠ۢ;

    invoke-direct {v0}, LYue/ۥۢۡ۠ۢ;-><init>()V

    goto :goto_1

    :cond_4
    move-object v0, v2

    :goto_1
    invoke-virtual {v0, p2}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۦ(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0, p3}, LYue/ۥۣ۠۠ۡ;->ۥ۟۟۟ۥ(Z)V

    :try_start_0
    invoke-virtual {v0}, LYue/ۥ۟ۨۢۤ;->ۥ۟۟۟ۤ()V
    :try_end_0
    .catch LYue/ۥ۠ۥۧۤ; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p3, :cond_5

    iput-object v2, p0, LYue/ۥ۠۠۠۟;->ۥ۟:LYue/ۥۣۣۡۢ;

    goto :goto_2

    :cond_5
    iput-object p1, p0, LYue/ۥ۠۠۠۟;->ۥ۟:LYue/ۥۣۣۡۢ;

    :goto_2
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public abstract ۥ۟۟۟۠()LYue/ۥ۠۠۠۟;
.end method

.method public abstract ۥ۟۟۟ۡ(LYue/ۥۣ۠۠۠;)Ljava/nio/ByteBuffer;
.end method

.method public abstract ۥ۟۟۟ۢ(Ljava/lang/String;Z)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e0;",
            ">;"
        }
    .end annotation
.end method

.method public abstract ۥۣ۟۟۟(Ljava/nio/ByteBuffer;Z)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            "Z)",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e0;",
            ">;"
        }
    .end annotation
.end method

.method public ۥ۟۟۟ۤ(LYue/ۥ۠ۤۡۥ;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e4\u06e1\u06e5;",
            ")",
            "Ljava/util/List<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LYue/ۥ۠۠۠۟;->ۥ۟۟۟ۧ(LYue/ۥ۠ۤۡۥ;Z)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۥ(LYue/ۥ۠ۤۡۥ;LYue/ۥۡۧ۟ۨ;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e4\u06e1\u06e5;",
            "LYue/\u06e5\u06e1\u06e7\u06df\u06e8;",
            ")",
            "Ljava/util/List<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥ۠۠۠۟;->ۥ۟۟۟ۤ(LYue/ۥ۠ۤۡۥ;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥ۠ۤۡۥ;LYue/ۥۡۧ۟ۨ;Z)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e4\u06e1\u06e5;",
            "LYue/\u06e5\u06e1\u06e7\u06df\u06e8;",
            "Z)",
            "Ljava/util/List<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1, p3}, LYue/ۥ۠۠۠۟;->ۥ۟۟۟ۧ(LYue/ۥ۠ۤۡۥ;Z)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۧ(LYue/ۥ۠ۤۡۥ;Z)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e4\u06e1\u06e5;",
            "Z)",
            "Ljava/util/List<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    instance-of v1, p1, LYue/ۥ۟ۤۨۡ;

    if-eqz v1, :cond_0

    const-string v1, "GET "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v1, p1

    check-cast v1, LYue/ۥ۟ۤۨۡ;

    invoke-interface {v1}, LYue/ۥ۟ۤۨۡ;->ۥ۟()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " HTTP/1.1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    instance-of v1, p1, LYue/ۥۣۡۨۡ;

    if-eqz v1, :cond_5

    const-string v1, "HTTP/1.1 101 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v1, p1

    check-cast v1, LYue/ۥۣۡۨۡ;

    invoke-interface {v1}, LYue/ۥۣۡۨۡ;->ۥ۟۟۟()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {p1, v3}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۤۤ۟;->ۥ(Ljava/lang/String;)[B

    move-result-object v0

    if-eqz p2, :cond_2

    invoke-interface {p1}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟۟۟()[B

    move-result-object p1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    if-nez p1, :cond_3

    const/4 p2, 0x0

    goto :goto_3

    :cond_3
    array-length p2, p1

    :goto_3
    array-length v1, v0

    add-int/2addr p2, v1

    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    if-eqz p1, :cond_4

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    :cond_4
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "unknown role"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract ۥ۟۟۟ۨ()LYue/ۥ۟ۤۨۧ;
.end method

.method public ۥ۟۟۠()LYue/ۥۡۧ۟ۨ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠۠۟;->ۥ:LYue/ۥۡۧ۟ۨ;

    return-object v0
.end method

.method public abstract ۥ۟۟۠۟(LYue/ۥ۟ۤۨۢ;)LYue/ۥ۟ۤۨۢ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۧ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۠۠(LYue/ۥ۟ۤۨۡ;LYue/ۥۣۡۨۢ;)LYue/ۥ۠ۤۡۡ;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۧ;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۠ۡ(LYue/ۥۢۥۡۥ;LYue/ۥۣ۠۠۠;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۤ;
        }
    .end annotation
.end method

.method public ۥ۟۟۠ۤ(LYue/ۥ۠ۤۡۥ;)I
    .locals 2

    const-string v0, "Sec-WebSocket-Version"

    invoke-interface {p1, v0}, LYue/ۥ۠ۤۡۥ;->ۥ۟۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, -0x1

    if-lez v0, :cond_0

    :try_start_0
    new-instance v0, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    :cond_0
    return v1
.end method

.method public abstract ۥ۟۟۠ۥ()V
.end method

.method public ۥ۟۟۠ۦ(LYue/ۥۡۧ۟ۨ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠۠۠۟;->ۥ:LYue/ۥۡۧ۟ۨ;

    return-void
.end method

.method public abstract ۥ۟۟۠ۧ(Ljava/nio/ByteBuffer;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            ")",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e0;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۤ;
        }
    .end annotation
.end method

.method public ۥ۟۟۠ۨ(Ljava/nio/ByteBuffer;)LYue/ۥ۠ۤۡۥ;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            LYue/ۥ۠ۥۧۧ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠۠۠۟;->ۥ:LYue/ۥۡۧ۟ۨ;

    invoke-static {p1, v0}, LYue/ۥ۠۠۠۟;->ۥ۟۟ۡ(Ljava/nio/ByteBuffer;LYue/ۥۡۧ۟ۨ;)LYue/ۥ۠ۤۡۡ;

    move-result-object p1

    return-object p1
.end method

.class public final L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰哲楪;
.super Ljava/io/Reader;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪兰世苏哲:Ljava/io/InputStreamReader;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/nio/charset/Charset;

.field public 飘花落叶言子楪哲兰苏世:Z

.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏世哲兰;


# direct methods
.method public constructor <init>(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏世哲兰;Ljava/nio/charset/Charset;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏世哲兰;

    .line 11
    .line 12
    iput-object p2, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰世苏:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰苏世:Z

    .line 3
    .line 4
    iget-object v0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰世苏哲:Ljava/io/InputStreamReader;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object p0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏世哲兰;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final read([CII)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰苏世:Z

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰世苏哲:Ljava/io/InputStreamReader;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/io/InputStreamReader;

    .line 13
    .line 14
    iget-object v1, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏世哲兰;

    .line 15
    .line 16
    invoke-interface {v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏世哲兰;->飘花落叶言子哲苏世兰楪()Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v3, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰世苏:Ljava/nio/charset/Charset;

    .line 21
    .line 22
    invoke-static {v1, v3}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏世哲兰;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {v0, v2, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰世苏哲:Ljava/io/InputStreamReader;

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Reader;->read([CII)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :cond_1
    const-string p0, "Stream closed"

    .line 37
    .line 38
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return p0
.end method

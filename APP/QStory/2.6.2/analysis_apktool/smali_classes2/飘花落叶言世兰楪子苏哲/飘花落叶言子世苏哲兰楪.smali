.class public final L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲兰楪;
.super Ljava/io/Reader;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪兰世苏哲:Ljava/io/InputStreamReader;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/nio/charset/Charset;

.field public 飘花落叶言子楪哲兰苏世:Z

.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏世兰哲;


# direct methods
.method public constructor <init>(L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏世兰哲;Ljava/nio/charset/Charset;)V
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
    iput-object p1, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏世兰哲;

    .line 11
    .line 12
    iput-object p2, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Ljava/nio/charset/Charset;

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
    iput-boolean v0, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰苏世:Z

    .line 3
    .line 4
    iget-object v0, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰世苏哲:Ljava/io/InputStreamReader;

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
    iget-object p0, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏世兰哲;

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
    iget-boolean v0, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰苏世:Z

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰世苏哲:Ljava/io/InputStreamReader;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/io/InputStreamReader;

    .line 13
    .line 14
    iget-object v1, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏世兰哲;

    .line 15
    .line 16
    invoke-interface {v1}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏楪兰世哲()Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v3, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Ljava/nio/charset/Charset;

    .line 21
    .line 22
    invoke-static {v1, v3}, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏世兰哲;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {v0, v2, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰世苏哲:Ljava/io/InputStreamReader;

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
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return p0
.end method

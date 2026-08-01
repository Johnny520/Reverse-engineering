.class public final L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰苏哲;
.super Ljava/io/OutputStream;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;


# direct methods
.method public constructor <init>(L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;)V
    .locals 0

    .line 1
    iput-object p1, p0, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final flush()V
    .locals 0

    .line 1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, ".outputStream()"

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final write(I)V
    .locals 0

    .line 10
    iget-object p0, p0, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;

    invoke-virtual {p0, p1}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏兰楪哲(I)V

    return-void
.end method

.method public final write([BII)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->write([BII)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

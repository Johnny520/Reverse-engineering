.class public abstract L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;


# direct methods
.method public constructor <init>(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x28

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/16 p0, 0x29

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()L飘花落叶言世兰哲苏子楪/飘花落叶言子世楪苏兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    invoke-interface {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲兰苏()L飘花落叶言世兰哲苏子楪/飘花落叶言子世楪苏兰哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

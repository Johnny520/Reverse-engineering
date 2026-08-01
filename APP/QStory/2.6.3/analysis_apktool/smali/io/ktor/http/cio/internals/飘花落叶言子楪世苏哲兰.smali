.class public final Lio/ktor/http/cio/internals/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:[Lio/ktor/http/cio/internals/飘花落叶言子楪世苏哲兰;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/List;

.field public final 飘花落叶言子楪世苏哲兰:C


# direct methods
.method public constructor <init>(CLjava/util/List;Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-char p1, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:C

    .line 8
    .line 9
    iput-object p2, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 10
    .line 11
    iput-object p3, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/16 p1, 0x100

    .line 14
    .line 15
    new-array p2, p1, [Lio/ktor/http/cio/internals/飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    move v0, p3

    .line 19
    :goto_0
    if-ge v0, p1, :cond_4

    .line 20
    .line 21
    iget-object v1, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v2, 0x0

    .line 28
    move v3, p3

    .line 29
    move-object v4, v2

    .line 30
    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    move-object v6, v5

    .line 41
    check-cast v6, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏哲兰;

    .line 42
    .line 43
    iget-char v6, v6, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:C

    .line 44
    .line 45
    if-ne v6, v0, :cond_0

    .line 46
    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    const/4 v3, 0x1

    .line 51
    move-object v4, v5

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    if-nez v3, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    move-object v2, v4

    .line 57
    :goto_2
    aput-object v2, p2, v0

    .line 58
    .line 59
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_4
    iput-object p2, p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:[Lio/ktor/http/cio/internals/飘花落叶言子楪世苏哲兰;

    .line 63
    .line 64
    return-void
.end method

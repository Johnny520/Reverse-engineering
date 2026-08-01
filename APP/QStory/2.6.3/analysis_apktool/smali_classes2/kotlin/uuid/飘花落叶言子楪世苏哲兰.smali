.class public final Lkotlin/uuid/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public static 飘花落叶言子楪世苏哲兰(JJ)Lkotlin/uuid/Uuid;
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p0, v0

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    cmp-long v0, p2, v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lkotlin/uuid/Uuid;->access$getNIL$cp()Lkotlin/uuid/Uuid;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance v0, Lkotlin/uuid/Uuid;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    move-wide v1, p0

    .line 20
    move-wide v3, p2

    .line 21
    invoke-direct/range {v0 .. v5}, Lkotlin/uuid/Uuid;-><init>(JJLkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

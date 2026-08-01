.class public final Lkotlinx/coroutines/飘花落叶言子世兰楪苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlinx/coroutines/飘花落叶言子苏楪兰哲世;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lkotlinx/coroutines/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Empty{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean p0, p0, Lkotlinx/coroutines/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:Z

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const-string p0, "Active"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "New"

    .line 16
    .line 17
    :goto_0
    const/16 v1, 0x7d

    .line 18
    .line 19
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世兰哲()Lkotlinx/coroutines/飘花落叶言子苏兰世哲楪;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lkotlinx/coroutines/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:Z

    .line 2
    .line 3
    return p0
.end method

.class final Landroidx/compose/ui/focus/飘花落叶言子楪兰苏世哲;
.super Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u54f2\u696a\u82cf;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0082\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/focus/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u4e16\u54f2;",
        "Landroidx/compose/ui/node/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u54f2\u696a\u82cf;",
        "Landroidx/compose/ui/focus/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u54f2\u4e16\u82cf;",
        "ui"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/focus/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/focus/飘花落叶言子楪兰苏世哲;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Landroidx/compose/ui/focus/飘花落叶言子楪兰苏世哲;

    .line 12
    .line 13
    iget-object p0, p0, Landroidx/compose/ui/focus/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 14
    .line 15
    iget-object p1, p1, Landroidx/compose/ui/focus/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/focus/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "FocusRequesterElement(focusRequester="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Landroidx/compose/ui/focus/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;)V
    .locals 1

    .line 1
    check-cast p1, Landroidx/compose/ui/focus/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/compose/ui/focus/飘花落叶言子楪兰哲世苏;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Landroidx/compose/ui/focus/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 11
    .line 12
    iput-object p0, p1, Landroidx/compose/ui/focus/飘花落叶言子楪兰哲世苏;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 13
    .line 14
    iget-object p0, p0, Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/focus/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroidx/compose/ui/focus/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 7
    .line 8
    iput-object p0, v0, Landroidx/compose/ui/focus/飘花落叶言子楪兰哲世苏;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 9
    .line 10
    return-object v0
.end method

.class public final Landroidx/compose/ui/semantics/飘花落叶言子楪世苏兰哲;
.super Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u54f2\u696a\u82cf;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/semantics/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "Landroidx/compose/ui/node/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u54f2\u696a\u82cf;",
        "Landroidx/compose/ui/semantics/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
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
.field public final 飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

.field public final 飘花落叶言子楪哲苏兰世:Z


# direct methods
.method public constructor <init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Landroidx/compose/ui/semantics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Z

    .line 5
    .line 6
    iput-object p1, p0, Landroidx/compose/ui/semantics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Landroidx/compose/ui/semantics/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Landroidx/compose/ui/semantics/飘花落叶言子楪世苏兰哲;

    .line 10
    .line 11
    iget-boolean v0, p1, Landroidx/compose/ui/semantics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Z

    .line 12
    .line 13
    iget-boolean v1, p0, Landroidx/compose/ui/semantics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Z

    .line 14
    .line 15
    if-eq v1, v0, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object p0, p0, Landroidx/compose/ui/semantics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 19
    .line 20
    iget-object p1, p1, Landroidx/compose/ui/semantics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 21
    .line 22
    if-eq p0, p1, :cond_3

    .line 23
    .line 24
    :goto_0
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 27
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/semantics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Landroidx/compose/ui/semantics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;)V
    .locals 1

    .line 1
    check-cast p1, Landroidx/compose/ui/semantics/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    iget-boolean v0, p0, Landroidx/compose/ui/semantics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Z

    .line 4
    .line 5
    iput-boolean v0, p1, Landroidx/compose/ui/semantics/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪兰哲苏:Z

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/compose/ui/semantics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 8
    .line 9
    iput-object p0, p1, Landroidx/compose/ui/semantics/飘花落叶言子楪世哲兰苏;->飘花落叶言子世苏楪哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 10
    .line 11
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/semantics/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, Landroidx/compose/ui/semantics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Z

    .line 7
    .line 8
    iput-boolean v1, v0, Landroidx/compose/ui/semantics/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪兰哲苏:Z

    .line 9
    .line 10
    iget-object p0, p0, Landroidx/compose/ui/semantics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 11
    .line 12
    iput-object p0, v0, Landroidx/compose/ui/semantics/飘花落叶言子楪世哲兰苏;->飘花落叶言子世苏楪哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 13
    .line 14
    return-object v0
.end method

.class final Landroidx/compose/foundation/layout/飘花落叶言子苏世兰楪哲;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u5170\u696a\u54f2;",
        "Landroidx/compose/ui/node/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u54f2\u696a\u82cf;",
        "Landroidx/compose/foundation/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u5170\u54f2\u696a;",
        "foundation-layout"
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
.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# direct methods
.method public constructor <init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/layout/飘花落叶言子苏世兰楪哲;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Landroidx/compose/foundation/layout/飘花落叶言子苏世兰楪哲;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 p1, 0x0

    .line 13
    :goto_0
    if-nez p1, :cond_2

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_2
    iget-object p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 17
    .line 18
    iget-object p1, p1, Landroidx/compose/foundation/layout/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 19
    .line 20
    if-ne p0, p1, :cond_3

    .line 21
    .line 22
    return v0

    .line 23
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit8 p0, p0, 0x1f

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/2addr v0, p0

    .line 15
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "OffsetPxModifier(offset="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, ", rtlAware=true)"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
    .locals 3

    .line 1
    check-cast p1, Landroidx/compose/foundation/layout/飘花落叶言子苏世兰哲楪;

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/compose/foundation/layout/飘花落叶言子苏世兰哲楪;->飘花落叶言子世楪兰哲苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, p0, :cond_0

    .line 9
    .line 10
    iget-boolean v0, p1, Landroidx/compose/foundation/layout/飘花落叶言子苏世兰哲楪;->飘花落叶言子世苏楪哲兰:Z

    .line 11
    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v2, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏世兰哲楪:Landroidx/compose/ui/node/飘花落叶言子世楪哲苏兰;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v0, v2}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪(Z)V

    .line 22
    .line 23
    .line 24
    :cond_1
    iput-object p0, p1, Landroidx/compose/foundation/layout/飘花落叶言子苏世兰哲楪;->飘花落叶言子世楪兰哲苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 25
    .line 26
    iput-boolean v1, p1, Landroidx/compose/foundation/layout/飘花落叶言子苏世兰哲楪;->飘花落叶言子世苏楪哲兰:Z

    .line 27
    .line 28
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/foundation/layout/飘花落叶言子苏世兰哲楪;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 7
    .line 8
    iput-object p0, v0, Landroidx/compose/foundation/layout/飘花落叶言子苏世兰哲楪;->飘花落叶言子世楪兰哲苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    iput-boolean p0, v0, Landroidx/compose/foundation/layout/飘花落叶言子苏世兰哲楪;->飘花落叶言子世苏楪哲兰:Z

    .line 12
    .line 13
    return-object v0
.end method

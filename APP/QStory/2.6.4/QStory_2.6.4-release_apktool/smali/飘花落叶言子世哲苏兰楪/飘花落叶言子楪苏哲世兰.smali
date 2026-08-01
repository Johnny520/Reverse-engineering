.class public final L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰哲苏;
.implements L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰哲苏;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

.field public 飘花落叶言子楪哲兰苏世:L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰苏哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏世哲兰;


# direct methods
.method public constructor <init>(L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏世哲兰;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏世哲兰;

    .line 5
    .line 6
    const-string v0, "androidx.savedstate.SavedStateRegistry"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    instance-of v2, v1, Landroid/os/Bundle;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    check-cast v1, Landroid/os/Bundle;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v1}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏(Landroid/os/Bundle;)L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰苏哲;

    .line 23
    .line 24
    .line 25
    :cond_1
    new-instance v1, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世苏兰哲;

    .line 26
    .line 27
    const/4 v2, 0x5

    .line 28
    invoke-direct {v1, p0, v2}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0, v1}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰苏哲;

    .line 32
    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;
    .locals 2

    .line 1
    iget-object v0, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;-><init>(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Z)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final getSavedStateRegistry()L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏(Landroid/os/Bundle;)L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰苏哲;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    iget-object p0, p0, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)L飘花落叶言子世哲苏兰楪/飘花落叶言子楪世兰苏哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Landroid/os/Bundle;)L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰苏哲;
    .locals 3

    .line 1
    iget-object v0, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, L飘花落叶言子兰世苏楪哲/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    new-instance v1, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    invoke-direct {v1, p0, v2}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, L飘花落叶言子兰世苏楪哲/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰哲苏;L飘花落叶言世兰苏楪哲子/飘花落叶言子楪世苏兰哲;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰苏哲;

    .line 18
    .line 19
    invoke-direct {v1, v0}, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰苏哲;-><init>(L飘花落叶言子兰世苏楪哲/飘花落叶言子楪世苏兰哲;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰苏哲;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_0
    return-object v0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-virtual {p0}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, L飘花落叶言子世哲苏兰楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

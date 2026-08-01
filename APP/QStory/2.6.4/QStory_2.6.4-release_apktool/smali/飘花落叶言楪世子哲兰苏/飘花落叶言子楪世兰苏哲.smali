.class public final L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/List;


# direct methods
.method public varargs constructor <init>([L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "MultiTransformation must contain at least one Transformation"

    .line 15
    .line 16
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世兰苏哲;

    .line 6
    .line 7
    iget-object p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 8
    .line 9
    iget-object p1, p1, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p0, p1}, Ljava/util/Collection;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Landroid/content/Context;Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;II)Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;
    .locals 3

    .line 1
    iget-object p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    move-object v0, p2

    .line 8
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;

    .line 19
    .line 20
    invoke-interface {v1, p1, v0, p3, p4}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;II)Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    invoke-interface {v0}, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;->recycle()V

    .line 39
    .line 40
    .line 41
    :cond_0
    move-object v0, v1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/security/MessageDigest;)V
    .locals 1

    .line 1
    iget-object p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;

    .line 18
    .line 19
    invoke-interface {v0, p1}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/security/MessageDigest;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

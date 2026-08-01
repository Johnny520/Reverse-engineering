.class public final Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪苏世兰哲;


# instance fields
.field public 飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

.field public 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世兰苏哲;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世兰苏哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世兰苏哲;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    iget v0, p0, Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 9
    .line 10
    iget v2, p1, Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 17
    .line 18
    if-ne p0, p1, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object p0, p0, Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :goto_0
    add-int/2addr v0, p0

    .line 16
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Key{size="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "array="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 p0, 0x7d

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/compose/runtime/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪兰世苏(Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪苏世兰哲;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

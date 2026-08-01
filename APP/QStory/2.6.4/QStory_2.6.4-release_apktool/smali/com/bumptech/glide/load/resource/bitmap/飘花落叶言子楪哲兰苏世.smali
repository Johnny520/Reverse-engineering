.class public final Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Z

.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;


# direct methods
.method public constructor <init>(L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪哲兰苏世;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;

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

.method public final 飘花落叶言子楪世苏兰哲(Landroid/content/Context;Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;II)Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;)Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-interface {p2}, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    invoke-static {v0, v1, p3, p4}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰(Lcom/bumptech/glide/load/engine/bitmap_recycle/飘花落叶言子楪世苏哲兰;Landroid/graphics/drawable/Drawable;II)Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪世哲兰苏;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-boolean p0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:Z

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_0
    const-string p0, "Unable to convert "

    .line 25
    .line 26
    const-string p1, " to a Bitmap"

    .line 27
    .line 28
    invoke-static {v1, p0, p1}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0

    .line 33
    :cond_1
    iget-object p0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;

    .line 34
    .line 35
    invoke-interface {p0, p1, v0, p3, p4}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;II)Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    if-eqz p3, :cond_2

    .line 44
    .line 45
    invoke-interface {p0}, Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;->recycle()V

    .line 46
    .line 47
    .line 48
    return-object p2

    .line 49
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance p2, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪世哲兰苏;

    .line 54
    .line 55
    invoke-direct {p2, p1, p0}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪世哲兰苏;-><init>(Landroid/content/res/Resources;Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;)V

    .line 56
    .line 57
    .line 58
    return-object p2
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/security/MessageDigest;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    invoke-interface {p0, p1}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/security/MessageDigest;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

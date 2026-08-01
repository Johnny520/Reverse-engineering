.class public final Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言楪子兰哲苏世/飘花落叶言子楪苏哲世兰;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;IIL飘花落叶言楪子兰哲苏世/飘花落叶言子楪苏世兰哲;)Lcom/bumptech/glide/load/engine/飘花落叶言子世楪苏兰哲;
    .locals 0

    .line 1
    iget p0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance p0, L飘花落叶言楪世苏哲兰子/飘花落叶言子楪世哲苏兰;

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    invoke-direct {p0, p1, p2}, L飘花落叶言楪世苏哲兰子/飘花落叶言子楪世哲苏兰;-><init>(Landroid/graphics/drawable/Drawable;I)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    :goto_0
    return-object p0

    .line 19
    :pswitch_0
    check-cast p1, Ljava/io/File;

    .line 20
    .line 21
    new-instance p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪哲兰苏;

    .line 22
    .line 23
    invoke-direct {p0, p1}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪哲兰苏;-><init>(Ljava/io/File;)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 28
    .line 29
    new-instance p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪哲兰苏;

    .line 30
    .line 31
    const/4 p2, 0x0

    .line 32
    invoke-direct {p0, p1, p2}, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪哲兰苏;-><init>(Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;L飘花落叶言楪子兰哲苏世/飘花落叶言子楪苏世兰哲;)Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/bumptech/glide/load/resource/bitmap/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    :goto_0
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :pswitch_0
    check-cast p1, Ljava/io/File;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

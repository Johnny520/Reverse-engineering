.class public final Lcom/bumptech/glide/load/data/飘花落叶言子楪世苏哲兰;
.super Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世苏兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:I


# direct methods
.method public synthetic constructor <init>(Landroid/content/ContentResolver;Landroid/net/Uri;ZI)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/bumptech/glide/load/data/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世苏兰;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget p1, p0, Lcom/bumptech/glide/load/data/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "FileDescriptor is null for: "

    .line 5
    .line 6
    const-string v2, "r"

    .line 7
    .line 8
    const/16 v3, 0x11

    .line 9
    .line 10
    const/16 v4, 0x1e

    .line 11
    .line 12
    iget-boolean v5, p0, Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Z

    .line 13
    .line 14
    iget-object p0, p0, Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Landroid/content/ContentResolver;

    .line 15
    .line 16
    packed-switch p1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    if-eqz v5, :cond_0

    .line 20
    .line 21
    invoke-static {p2}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世哲楪兰(Landroid/net/Uri;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 28
    .line 29
    if-lt p1, v4, :cond_0

    .line 30
    .line 31
    invoke-static {}, Landroidx/core/view/飘花落叶言子哲兰楪世苏;->飘花落叶言子世楪兰哲苏()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-lt p1, v3, :cond_0

    .line 36
    .line 37
    invoke-static {p0, p2}, Landroidx/core/os/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/content/res/AssetFileDescriptor;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p0, p2, v2}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :goto_0
    if-eqz p0, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-static {p2, v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    return-object v0

    .line 57
    :pswitch_0
    if-eqz v5, :cond_2

    .line 58
    .line 59
    invoke-static {p2}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世哲楪兰(Landroid/net/Uri;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 66
    .line 67
    if-lt p1, v4, :cond_2

    .line 68
    .line 69
    invoke-static {}, Landroidx/core/view/飘花落叶言子哲兰楪世苏;->飘花落叶言子世楪兰哲苏()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-lt p1, v3, :cond_2

    .line 74
    .line 75
    invoke-static {p0, p2}, Landroidx/core/os/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/content/res/AssetFileDescriptor;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    invoke-virtual {p0, p2, v2}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    :goto_2
    if-eqz p0, :cond_3

    .line 85
    .line 86
    move-object v0, p0

    .line 87
    goto :goto_3

    .line 88
    :cond_3
    invoke-static {p2, v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :goto_3
    return-object v0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget p0, p0, Lcom/bumptech/glide/load/data/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    check-cast p1, Landroid/content/res/AssetFileDescriptor;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->close()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/lang/Class;
    .locals 0

    .line 1
    iget p0, p0, Lcom/bumptech/glide/load/data/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-class p0, Landroid/os/ParcelFileDescriptor;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-class p0, Landroid/content/res/AssetFileDescriptor;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

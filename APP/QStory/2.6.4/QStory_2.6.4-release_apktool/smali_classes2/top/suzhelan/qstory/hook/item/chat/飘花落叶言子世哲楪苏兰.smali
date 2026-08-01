.class public final synthetic Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲楪苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Runnable;


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    new-instance p0, Ljava/io/File;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5"

    .line 16
    .line 17
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲世苏兰()Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 48
    .line 49
    invoke-static {v0, v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)V

    .line 50
    .line 51
    .line 52
    const/16 v0, 0x91b

    .line 53
    .line 54
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    sget-object v0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {v0, p0}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子世苏哲楪兰(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/BitmapDrawable;

    .line 68
    .line 69
    .line 70
    return-void
.end method

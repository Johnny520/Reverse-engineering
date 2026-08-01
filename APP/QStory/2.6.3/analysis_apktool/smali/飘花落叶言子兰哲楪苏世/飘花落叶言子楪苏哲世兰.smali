.class public abstract L飘花落叶言子兰哲楪苏世/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public static 飘花落叶言子楪世苏兰哲()L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏哲兰世;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Landroidx/window/sidecar/SidecarProvider;->getApiVersion()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    sget-object v1, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏世哲:L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏哲兰世;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子世苏楪哲兰(Ljava/lang/String;)L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏哲兰世;

    .line 14
    .line 15
    .line 16
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    return-object v0

    .line 18
    :catch_0
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroid/content/Context;)Landroidx/window/sidecar/SidecarInterface;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Landroidx/window/sidecar/SidecarProvider;->getSidecarImpl(Landroid/content/Context;)Landroidx/window/sidecar/SidecarInterface;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

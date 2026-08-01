.class public final L飘花落叶言子哲苏兰楪世/飘花落叶言子楪哲世苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Runnable;


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    :try_start_0
    const-string p0, "EmojiCompat.EmojiCompatInitializer.run"

    .line 2
    .line 3
    sget-object v0, Landroidx/core/os/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-static {}, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏哲世兰;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    sget-object v0, Landroidx/core/os/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Method;

    .line 27
    .line 28
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 29
    .line 30
    .line 31
    throw p0
.end method

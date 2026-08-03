.class public final La/Vc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/Oe;


# virtual methods
.method public final a(Landroid/app/Activity;Landroid/view/View;Ljava/lang/Class;)La/Ne$a;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Landroid/view/View;",
            "Ljava/lang/Class<",
            "*>;)",
            "La/Ne$a;"
        }
    .end annotation

    const-string p2, "getCurrentTab"

    sget-object v0, La/Ne$a;->c:La/Ne$a;

    if-nez p3, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p3, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    :try_start_0
    const-string v1, "getCurrentTabIndex"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p3, v1, v3}, La/A1;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v3, La/Ne$a;->b:La/Ne$a;

    sget-object v4, La/Ne$a;->a:La/Ne$a;

    const/4 v5, 0x0

    if-eqz v1, :cond_6

    :try_start_1
    invoke-virtual {v1, v5, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/Integer;

    if-eqz p2, :cond_2

    move-object v5, p1

    check-cast v5, Ljava/lang/Integer;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_2
    :goto_0
    if-nez v5, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-nez p1, :cond_4

    :goto_1
    move-object v3, v4

    goto :goto_5

    :cond_4
    :goto_2
    if-eqz v5, :cond_5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-lez p1, :cond_5

    goto :goto_5

    :cond_5
    move-object v3, v0

    goto :goto_5

    :cond_6
    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p3, p2, v1}, La/A1;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object p3

    if-eqz p3, :cond_5

    new-array p3, v2, [Ljava/lang/Object;

    invoke-static {p1, p2, p3}, La/A1;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/Integer;

    if-eqz p2, :cond_7

    move-object v5, p1

    check-cast v5, Ljava/lang/Integer;

    :cond_7
    if-nez v5, :cond_8

    goto :goto_3

    :cond_8
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-nez p1, :cond_9

    goto :goto_1

    :cond_9
    :goto_3
    if-eqz v5, :cond_5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-lez p1, :cond_5

    goto :goto_5

    :goto_4
    invoke-static {p1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v3

    :goto_5
    instance-of p1, v3, La/wd$a;

    if-eqz p1, :cond_a

    goto :goto_6

    :cond_a
    move-object v0, v3

    :goto_6
    check-cast v0, La/Ne$a;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    const-string v0, "reflection"

    return-object v0
.end method

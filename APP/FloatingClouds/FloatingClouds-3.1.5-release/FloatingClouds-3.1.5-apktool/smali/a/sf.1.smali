.class public final La/sf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/Oe;


# virtual methods
.method public final a(Landroid/app/Activity;Landroid/view/View;Ljava/lang/Class;)La/Ne$a;
    .locals 1
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

    sget-object p3, La/Ne$a;->c:La/Ne$a;

    if-nez p2, :cond_0

    return-object p3

    :cond_0
    :try_start_0
    sget-object v0, La/qf;->a:La/qf;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p2}, La/qf;->a(Landroid/app/Activity;Landroid/view/View;)Landroid/widget/TextView;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object p1

    :goto_0
    instance-of p2, p1, La/wd$a;

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    :cond_1
    check-cast p1, Landroid/widget/TextView;

    if-nez p1, :cond_2

    return-object p3

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    sget-object p2, La/qf;->a:La/qf;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, La/qf;->b:Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    sget-object p3, La/Ne$a;->a:La/Ne$a;

    goto :goto_1

    :cond_5
    invoke-static {p1}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_6

    sget-object p3, La/Ne$a;->b:La/Ne$a;

    :cond_6
    :goto_1
    return-object p3
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    const-string v0, "titleText"

    return-object v0
.end method

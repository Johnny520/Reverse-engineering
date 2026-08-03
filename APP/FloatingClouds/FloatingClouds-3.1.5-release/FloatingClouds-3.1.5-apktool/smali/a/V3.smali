.class public final La/V3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/rf;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, La/V3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Landroid/view/View;)Landroid/widget/TextView;
    .locals 7

    const/4 v0, 0x0

    const-string v1, "rootView"

    iget v2, p0, La/V3;->a:I

    invoke-static {p2, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    packed-switch v2, :pswitch_data_0

    sget-object v0, La/qf;->a:La/qf;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, La/qf;->b(Landroid/app/Activity;)I

    move-result p1

    new-instance v0, La/U3;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, La/U3;-><init>(II)V

    invoke-static {p2, v0}, La/n9;->q(Landroid/view/View;La/D7;)Landroid/widget/TextView;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/16 v1, 0x50

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int v1, v1

    const/16 v2, 0x10

    int-to-float v2, v2

    mul-float/2addr v2, p1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, La/Fc;

    invoke-direct {v3, v2, v1, p1}, La/Fc;-><init>(FILjava/util/ArrayList;)V

    invoke-static {p2, v3}, La/n9;->k(Landroid/view/View;La/Fc;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_2

    :cond_1
    move-object p2, p1

    check-cast p2, Landroid/widget/TextView;

    const/4 v3, 0x2

    new-array v1, v3, [I

    :try_start_0
    invoke-virtual {p2, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    sget-object p2, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    invoke-static {p2}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object p2

    :goto_0
    sget-object v4, La/Wf;->a:La/Wf;

    instance-of p2, p2, La/wd$a;

    aget p2, v1, v0

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/TextView;

    new-array v5, v3, [I

    :try_start_1
    invoke-virtual {v4, v5}, Landroid/view/View;->getLocationOnScreen([I)V

    sget-object v4, La/Wf;->a:La/Wf;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v4

    invoke-static {v4}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v4

    :goto_1
    sget-object v6, La/Wf;->a:La/Wf;

    instance-of v4, v4, La/wd$a;

    aget v4, v5, v0

    if-le p2, v4, :cond_3

    move-object p1, v1

    move p2, v4

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    :goto_2
    check-cast p1, Landroid/widget/TextView;

    return-object p1

    :pswitch_1
    sget-object v1, La/qf;->a:La/qf;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, La/qf;->b(Landroid/app/Activity;)I

    move-result p1

    new-instance v1, La/U3;

    invoke-direct {v1, p1, v0}, La/U3;-><init>(II)V

    invoke-static {p2, v1}, La/n9;->q(Landroid/view/View;La/D7;)Landroid/widget/TextView;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

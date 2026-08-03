.class public final La/y2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/Oe;


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "WeChat"

    const-string v5, "Contacts"

    const-string v0, "\u5fae\u4fe1"

    const-string v1, "\u901a\u8baf\u5f55"

    const-string v2, "\u53d1\u73b0"

    const-string v3, "\u6211"

    const-string v6, "Discover"

    const-string v7, "Me"

    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/n9;->z([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, La/y2;->a:Ljava/util/Set;

    const-string v0, "Weixin"

    const-string v1, "\u5fae\u4fe1"

    const-string v2, "WeChat"

    filled-new-array {v1, v2, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/n9;->z([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, La/y2;->b:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Landroid/view/View;Ljava/lang/Class;)La/Ne$a;
    .locals 3
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

    sget-object p1, La/Ne$a;->c:La/Ne$a;

    if-nez p2, :cond_0

    return-object p1

    :cond_0
    :try_start_0
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p3

    invoke-static {p3}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object p3

    :goto_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    instance-of v1, p3, La/wd$a;

    if-eqz v1, :cond_1

    move-object p3, v0

    :cond_1
    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    if-gtz p3, :cond_2

    return-object p1

    :cond_2
    int-to-float v0, p3

    const v1, 0x3f4ccccd    # 0.8f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    add-int/lit16 p3, p3, -0xc8

    if-ge v0, p3, :cond_3

    move v0, p3

    :cond_3
    new-instance p3, La/x2;

    const/4 v1, 0x0

    invoke-direct {p3, p0, v0, v1}, La/x2;-><init>(Ljava/lang/Object;II)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p2, p3, v0}, La/w1;->m(Landroid/view/View;La/x2;Ljava/util/ArrayList;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v1, p3

    check-cast v1, Landroid/view/View;

    :goto_1
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/view/View;->isSelected()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {v1}, Landroid/view/View;->isActivated()Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v2, v1, Landroid/view/View;

    if-eqz v2, :cond_6

    check-cast v1, Landroid/view/View;

    goto :goto_1

    :cond_6
    move-object v1, v0

    goto :goto_1

    :cond_7
    move-object p3, v0

    :cond_8
    :goto_2
    check-cast p3, Landroid/view/View;

    if-eqz p3, :cond_a

    instance-of p2, p3, Landroid/widget/TextView;

    if-eqz p2, :cond_9

    check-cast p3, Landroid/widget/TextView;

    goto :goto_3

    :cond_9
    move-object p3, v0

    :goto_3
    if-eqz p3, :cond_a

    invoke-virtual {p3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    if-eqz p2, :cond_a

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_a
    if-nez v0, :cond_b

    goto :goto_4

    :cond_b
    iget-object p1, p0, La/y2;->b:Ljava/util/Set;

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    sget-object p1, La/Ne$a;->a:La/Ne$a;

    goto :goto_4

    :cond_c
    sget-object p1, La/Ne$a;->b:La/Ne$a;

    :goto_4
    return-object p1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    const-string v0, "bottomTab"

    return-object v0
.end method

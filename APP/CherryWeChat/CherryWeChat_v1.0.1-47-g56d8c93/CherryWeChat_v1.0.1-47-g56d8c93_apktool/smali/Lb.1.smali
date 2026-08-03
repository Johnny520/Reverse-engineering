.class public final synthetic LLb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic a:Z


# direct methods
.method public synthetic constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LLb;->a:Z

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    check-cast p1, LhG;

    const-wide v0, -0x1427fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LNb;->b:LNb;

    invoke-virtual {v0}, LZk;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    new-instance v0, Lvx;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    instance-of v1, p1, Ljava/lang/Class;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast p1, Ljava/lang/Class;

    iput-object p1, v0, Lvx;->b:Ljava/io/Serializable;

    goto :goto_1

    :cond_0
    iput-object p1, v0, Lvx;->c:Ljava/lang/Object;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v2

    :goto_0
    iput-object p1, v0, Lvx;->b:Ljava/io/Serializable;

    :goto_1
    const-wide v3, -0x1433fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvx;->e(Ljava/lang/String;)V

    invoke-virtual {v0}, Lvx;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/ListView;

    if-nez p1, :cond_2

    goto/16 :goto_4

    :cond_2
    const v0, 0x550a021e

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    const-class v3, Ljava/lang/Object;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_4

    :cond_3
    invoke-virtual {p1, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v3, -0x14e7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v3, -0x1488fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, LNx;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v3, LGb;->g:Lm6;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v3, -0x1c381fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, LfA;->values()[LfA;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_2
    if-ge v6, v4, :cond_5

    aget-object v7, v3, v6

    iget-object v8, v7, LfA;->a:Ljava/lang/String;

    invoke-virtual {v8, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move-object v2, v7

    goto :goto_3

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    if-nez v2, :cond_6

    sget-object v2, LfA;->b:LfA;

    :cond_6
    new-instance v1, LGb;

    invoke-direct {v1, v0}, LGb;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, LGb;->setTabStyle(LfA;)V

    new-instance v0, LR9;

    iget-boolean v2, p0, LLb;->a:Z

    invoke-direct {v0, v1, p1, v2}, LR9;-><init>(LGb;Landroid/widget/ListView;Z)V

    invoke-virtual {v1, v0}, LGb;->setOnTabSelectedListener(Lfj;)V

    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->a()Ljava/lang/String;

    move-result-object v0

    const-wide v2, -0x148efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    sget-object v0, LXA;->a:Ljava/util/HashMap;

    const-wide v2, -0x1490fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lhw;->a(ILjava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, LGb;->setSelectedColor(I)V

    const-wide v2, -0x14befffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lhw;->a(ILjava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, LGb;->setUnselectedColor(I)V

    :cond_7
    invoke-virtual {p1, v1}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    :cond_8
    :goto_4
    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method

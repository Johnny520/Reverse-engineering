.class public abstract LZk;
.super Lx5;
.source ""


# instance fields
.field public final a:LZz;


# direct methods
.method public constructor <init>(LZz;)V
    .locals 2

    const-wide v0, -0x2b7ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZk;->a:LZz;

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LZk;->a:LZz;

    iget-object v0, v0, LZz;->f:Lvx;

    if-eqz v0, :cond_0

    sget-object v1, LNx;->a:Landroid/content/SharedPreferences;

    iget-object v1, v0, Lvx;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Lvx;->b:Ljava/io/Serializable;

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, LNx;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 6

    const-wide v0, -0x2b06fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, LaA;

    invoke-direct {v1, p1}, LaA;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, LZk;->a:LZz;

    iget-object v3, v2, LZz;->b:Ljava/lang/String;

    invoke-virtual {v1, v3}, LaA;->setKey(Ljava/lang/String;)V

    iget-object v3, v2, LZz;->d:Ljava/lang/String;

    invoke-virtual {v1, v3}, LaA;->setTitle(Ljava/lang/String;)V

    iget-object v3, v2, LZz;->e:Ljava/lang/String;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v1, v3}, LaA;->setSummary(Ljava/lang/String;)V

    :cond_1
    sget-object v3, LNx;->a:Landroid/content/SharedPreferences;

    iget-object v3, v2, LZz;->b:Ljava/lang/String;

    iget-boolean v5, v2, LZz;->c:Z

    invoke-static {v3, v5}, LNx;->a(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v1, v3}, LaA;->setChecked(Z)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v2, LZz;->f:Lvx;

    if-eqz v1, :cond_6

    new-instance v3, LyA;

    invoke-direct {v3, p1}, LyA;-><init>(Landroid/content/Context;)V

    iget-object p1, v1, Lvx;->c:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v3, p1}, LyA;->setTitle(Ljava/lang/String;)V

    iget-object p1, v1, Lvx;->d:Ljava/io/Serializable;

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_2

    move-object v4, p1

    :cond_2
    if-eqz v4, :cond_3

    invoke-virtual {v3, v4}, LyA;->setSummary(Ljava/lang/String;)V

    :cond_3
    iget-boolean p1, v2, LZz;->g:Z

    if-eqz p1, :cond_4

    invoke-virtual {v3}, LyA;->a()V

    goto :goto_1

    :cond_4
    iget-object p1, v1, Lvx;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v2, v1, Lvx;->b:Ljava/io/Serializable;

    check-cast v2, Ljava/lang/String;

    invoke-static {p1, v2}, LNx;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, LyA;->setValue(Ljava/lang/String;)V

    :goto_1
    iget-object p1, v1, Lvx;->e:Ljava/lang/Object;

    check-cast p1, Landroid/view/View$OnClickListener;

    if-nez p1, :cond_5

    new-instance p1, Lp0;

    const/4 v2, 0x2

    invoke-direct {p1, v2, v1}, Lp0;-><init>(ILjava/lang/Object;)V

    :cond_5
    invoke-virtual {v3, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    return-object v0
.end method

.method public final e()Z
    .locals 2

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    iget-object v0, p0, LZk;->a:LZz;

    iget-object v1, v0, LZz;->b:Ljava/lang/String;

    iget-boolean v0, v0, LZz;->c:Z

    invoke-static {v1, v0}, LNx;->a(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

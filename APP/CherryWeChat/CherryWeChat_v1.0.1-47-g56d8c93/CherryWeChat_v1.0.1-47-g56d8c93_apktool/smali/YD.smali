.class public final LYD;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:LXD;

.field public final b:LWD;


# direct methods
.method public constructor <init>(LXD;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYD;->a:LXD;

    new-instance p1, LWD;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p1, LWD;->a:I

    iput-object p1, p0, LYD;->b:LWD;

    return-void
.end method


# virtual methods
.method public final a(IIII)Landroid/view/View;
    .locals 9

    iget-object v0, p0, LYD;->a:LXD;

    invoke-interface {v0}, LXD;->d()I

    move-result v1

    invoke-interface {v0}, LXD;->a()I

    move-result v2

    if-le p2, p1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, -0x1

    :goto_0
    const/4 v4, 0x0

    :goto_1
    if-eq p1, p2, :cond_3

    invoke-interface {v0, p1}, LXD;->c(I)Landroid/view/View;

    move-result-object v5

    invoke-interface {v0, v5}, LXD;->b(Landroid/view/View;)I

    move-result v6

    invoke-interface {v0, v5}, LXD;->e(Landroid/view/View;)I

    move-result v7

    iget-object v8, p0, LYD;->b:LWD;

    iput v1, v8, LWD;->b:I

    iput v2, v8, LWD;->c:I

    iput v6, v8, LWD;->d:I

    iput v7, v8, LWD;->e:I

    if-eqz p3, :cond_1

    iput p3, v8, LWD;->a:I

    invoke-virtual {v8}, LWD;->a()Z

    move-result v6

    if-eqz v6, :cond_1

    return-object v5

    :cond_1
    if-eqz p4, :cond_2

    iput p4, v8, LWD;->a:I

    invoke-virtual {v8}, LWD;->a()Z

    move-result v6

    if-eqz v6, :cond_2

    move-object v4, v5

    :cond_2
    add-int/2addr p1, v3

    goto :goto_1

    :cond_3
    return-object v4
.end method

.method public final b(Landroid/view/View;)Z
    .locals 4

    iget-object v0, p0, LYD;->a:LXD;

    invoke-interface {v0}, LXD;->d()I

    move-result v1

    invoke-interface {v0}, LXD;->a()I

    move-result v2

    invoke-interface {v0, p1}, LXD;->b(Landroid/view/View;)I

    move-result v3

    invoke-interface {v0, p1}, LXD;->e(Landroid/view/View;)I

    move-result p1

    iget-object v0, p0, LYD;->b:LWD;

    iput v1, v0, LWD;->b:I

    iput v2, v0, LWD;->c:I

    iput v3, v0, LWD;->d:I

    iput p1, v0, LWD;->e:I

    const/16 p1, 0x6003

    iput p1, v0, LWD;->a:I

    invoke-virtual {v0}, LWD;->a()Z

    move-result p1

    return p1
.end method

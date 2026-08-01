.class public final Lj4;
.super Ljl;


# instance fields
.field public final synthetic j:Ls4;

.field public final synthetic k:Lv4;


# direct methods
.method public constructor <init>(Lv4;Lv4;Ls4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj4;->k:Lv4;

    .line 2
    .line 3
    iput-object p3, p0, Lj4;->j:Ls4;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Ljl;-><init>(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b()Lr30;
    .locals 1

    .line 1
    iget-object v0, p0, Lj4;->j:Ls4;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lj4;->k:Lv4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv4;->getInternalPopup()Lu4;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Lu4;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, v0, Lv4;->f:Lu4;

    .line 14
    .line 15
    invoke-static {v0}, Lm4;->b(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-static {v0}, Lm4;->a(Landroid/view/View;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-interface {v1, v2, v0}, Lu4;->e(II)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 v0, 0x1

    .line 27
    return v0
.end method

.class public final Landroidx/lifecycle/SavedStateHandleController;
.super Ljava/lang/Object;

# interfaces
.implements Lmq;


# instance fields
.field public a:Z


# virtual methods
.method public final b(Loq;Liq;)V
    .locals 1

    .line 1
    sget-object v0, Liq;->ON_DESTROY:Liq;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    iput-boolean p2, p0, Landroidx/lifecycle/SavedStateHandleController;->a:Z

    .line 7
    .line 8
    invoke-interface {p1}, Loq;->e()Landroidx/lifecycle/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p0}, Landroidx/lifecycle/a;->f(Lnq;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

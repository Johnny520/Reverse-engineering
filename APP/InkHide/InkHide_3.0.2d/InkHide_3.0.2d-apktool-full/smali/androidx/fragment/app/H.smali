.class public final Landroidx/fragment/app/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/i;
.implements LM/f;
.implements Landroidx/lifecycle/Q;


# instance fields
.field public final b:Landroidx/lifecycle/P;

.field public c:Landroidx/lifecycle/u;

.field public d:LM/e;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/l;Landroidx/lifecycle/P;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Landroidx/fragment/app/H;->c:Landroidx/lifecycle/u;

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/fragment/app/H;->d:LM/e;

    .line 8
    .line 9
    iput-object p2, p0, Landroidx/fragment/app/H;->b:Landroidx/lifecycle/P;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b()LM/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/H;->e()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/H;->d:LM/e;

    .line 5
    .line 6
    iget-object v0, v0, LM/e;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LM/d;

    .line 9
    .line 10
    return-object v0
.end method

.method public final c()Landroidx/lifecycle/u;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/H;->e()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/H;->c:Landroidx/lifecycle/u;

    .line 5
    .line 6
    return-object v0
.end method

.method public final d(Landroidx/lifecycle/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/H;->c:Landroidx/lifecycle/u;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/H;->c:Landroidx/lifecycle/u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/u;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroidx/lifecycle/u;-><init>(Landroidx/lifecycle/s;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/fragment/app/H;->c:Landroidx/lifecycle/u;

    .line 11
    .line 12
    new-instance v0, LM/e;

    .line 13
    .line 14
    invoke-direct {v0, p0}, LM/e;-><init>(LM/f;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/fragment/app/H;->d:LM/e;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final getViewModelStore()Landroidx/lifecycle/P;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/H;->e()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/H;->b:Landroidx/lifecycle/P;

    .line 5
    .line 6
    return-object v0
.end method

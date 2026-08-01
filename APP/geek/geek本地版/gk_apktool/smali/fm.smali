.class public final Lfm;
.super Ljava/lang/Object;

# interfaces
.implements Llo;
.implements Lu10;
.implements Lsa0;


# instance fields
.field public final a:Lra0;

.field public b:Landroidx/lifecycle/a;

.field public c:Lgm;


# direct methods
.method public constructor <init>(Lra0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lfm;->b:Landroidx/lifecycle/a;

    .line 6
    .line 7
    iput-object v0, p0, Lfm;->c:Lgm;

    .line 8
    .line 9
    iput-object p1, p0, Lfm;->a:Lra0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b()La3;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lfm;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lfm;->c:Lgm;

    .line 5
    .line 6
    iget-object v0, v0, Lgm;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La3;

    .line 9
    .line 10
    return-object v0
.end method

.method public final c(Liq;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfm;->b:Landroidx/lifecycle/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/a;->d(Liq;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()Lra0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lfm;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lfm;->a:Lra0;

    .line 5
    .line 6
    return-object v0
.end method

.method public final e()Landroidx/lifecycle/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lfm;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lfm;->b:Landroidx/lifecycle/a;

    .line 5
    .line 6
    return-object v0
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lfm;->b:Landroidx/lifecycle/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/a;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroidx/lifecycle/a;-><init>(Loq;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lfm;->b:Landroidx/lifecycle/a;

    .line 11
    .line 12
    new-instance v0, Lgm;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lgm;-><init>(Lu10;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lfm;->c:Lgm;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

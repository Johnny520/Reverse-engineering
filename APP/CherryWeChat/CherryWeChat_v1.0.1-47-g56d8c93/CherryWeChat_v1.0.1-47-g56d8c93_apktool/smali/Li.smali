.class public final LLi;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lqk;
.implements Lix;
.implements LyE;


# instance fields
.field public final a:Lhi;

.field public final b:LxE;

.field public final c:LN2;

.field public d:Lao;

.field public e:Lwy;


# direct methods
.method public constructor <init>(Lhi;LxE;LN2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LLi;->d:Lao;

    iput-object v0, p0, LLi;->e:Lwy;

    iput-object p1, p0, LLi;->a:Lhi;

    iput-object p2, p0, LLi;->b:LxE;

    iput-object p3, p0, LLi;->c:LN2;

    return-void
.end method


# virtual methods
.method public final a(LOn;)V
    .locals 1

    iget-object v0, p0, LLi;->d:Lao;

    invoke-virtual {v0, p1}, Lao;->e(LOn;)V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, LLi;->d:Lao;

    if-nez v0, :cond_0

    new-instance v0, Lao;

    invoke-direct {v0, p0}, Lao;-><init>(LYn;)V

    iput-object v0, p0, LLi;->d:Lao;

    new-instance v0, Lwy;

    invoke-direct {v0, p0}, Lwy;-><init>(Lix;)V

    iput-object v0, p0, LLi;->e:Lwy;

    invoke-virtual {v0}, Lwy;->c()V

    iget-object v0, p0, LLi;->c:LN2;

    invoke-virtual {v0}, LN2;->run()V

    :cond_0
    return-void
.end method

.method public final getDefaultViewModelCreationExtras()Llc;
    .locals 4

    iget-object v0, p0, LLi;->a:Lhi;

    invoke-virtual {v0}, Lhi;->y()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_1

    instance-of v2, v1, Landroid/app/Application;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/app/Application;

    goto :goto_1

    :cond_0
    check-cast v1, Landroid/content/ContextWrapper;

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_1
    new-instance v2, Lts;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lts;-><init>(I)V

    if-eqz v1, :cond_2

    sget-object v3, Lgf;->m:Lgf;

    invoke-virtual {v2, v3, v1}, Lts;->a(Lkc;Ljava/lang/Object;)V

    :cond_2
    sget-object v1, LOj;->h:Lhw;

    invoke-virtual {v2, v1, v0}, Lts;->a(Lkc;Ljava/lang/Object;)V

    sget-object v1, LOj;->i:Lhw;

    invoke-virtual {v2, v1, p0}, Lts;->a(Lkc;Ljava/lang/Object;)V

    iget-object v0, v0, Lhi;->f:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    sget-object v1, LOj;->j:Lhw;

    invoke-virtual {v2, v1, v0}, Lts;->a(Lkc;Ljava/lang/Object;)V

    :cond_3
    return-object v2
.end method

.method public final getLifecycle()LRn;
    .locals 1

    invoke-virtual {p0}, LLi;->b()V

    iget-object v0, p0, LLi;->d:Lao;

    return-object v0
.end method

.method public final getSavedStateRegistry()Lhx;
    .locals 1

    invoke-virtual {p0}, LLi;->b()V

    iget-object v0, p0, LLi;->e:Lwy;

    iget-object v0, v0, Lwy;->d:Ljava/lang/Object;

    check-cast v0, Lhx;

    return-object v0
.end method

.method public final getViewModelStore()LxE;
    .locals 1

    invoke-virtual {p0}, LLi;->b()V

    iget-object v0, p0, LLi;->b:LxE;

    return-object v0
.end method

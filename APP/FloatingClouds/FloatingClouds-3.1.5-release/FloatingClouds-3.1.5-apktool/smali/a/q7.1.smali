.class public final La/q7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/c;
.implements La/Ld;
.implements La/Gg;


# instance fields
.field public final a:Landroidx/fragment/app/b;

.field public final b:La/Fg;

.field public final c:La/M2;

.field public d:Landroidx/lifecycle/h;

.field public e:La/Kd;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/b;La/Fg;La/M2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/q7;->d:Landroidx/lifecycle/h;

    iput-object v0, p0, La/q7;->e:La/Kd;

    iput-object p1, p0, La/q7;->a:Landroidx/fragment/app/b;

    iput-object p2, p0, La/q7;->b:La/Fg;

    iput-object p3, p0, La/q7;->c:La/M2;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/e$a;)V
    .locals 1

    iget-object v0, p0, La/q7;->d:Landroidx/lifecycle/h;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, La/q7;->d:Landroidx/lifecycle/h;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/h;

    invoke-direct {v0, p0}, Landroidx/lifecycle/h;-><init>(La/y9;)V

    iput-object v0, p0, La/q7;->d:Landroidx/lifecycle/h;

    new-instance v0, La/Kd;

    invoke-direct {v0, p0}, La/Kd;-><init>(La/Ld;)V

    iput-object v0, p0, La/q7;->e:La/Kd;

    invoke-virtual {v0}, La/Kd;->a()V

    iget-object v0, p0, La/q7;->c:La/M2;

    invoke-virtual {v0}, La/M2;->run()V

    :cond_0
    return-void
.end method

.method public final getDefaultViewModelCreationExtras()La/A4;
    .locals 5

    iget-object v0, p0, La/q7;->a:Landroidx/fragment/app/b;

    invoke-virtual {v0}, Landroidx/fragment/app/b;->A()Landroid/content/Context;

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
    new-instance v2, La/Ab;

    invoke-direct {v2}, La/Ab;-><init>()V

    iget-object v3, v2, La/A4;->a:Ljava/util/LinkedHashMap;

    if-eqz v1, :cond_2

    sget-object v4, Landroidx/lifecycle/p;->a:Landroidx/lifecycle/p;

    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object v1, Landroidx/lifecycle/n;->a:Landroidx/lifecycle/n$b;

    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Landroidx/lifecycle/n;->b:Landroidx/lifecycle/n$c;

    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Landroidx/fragment/app/b;->f:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    sget-object v1, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/n$a;

    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v2
.end method

.method public final getLifecycle()Landroidx/lifecycle/e;
    .locals 1

    invoke-virtual {p0}, La/q7;->b()V

    iget-object v0, p0, La/q7;->d:Landroidx/lifecycle/h;

    return-object v0
.end method

.method public final getSavedStateRegistry()Landroidx/savedstate/a;
    .locals 1

    invoke-virtual {p0}, La/q7;->b()V

    iget-object v0, p0, La/q7;->e:La/Kd;

    iget-object v0, v0, La/Kd;->b:Landroidx/savedstate/a;

    return-object v0
.end method

.method public final getViewModelStore()La/Fg;
    .locals 1

    invoke-virtual {p0}, La/q7;->b()V

    iget-object v0, p0, La/q7;->b:La/Fg;

    return-object v0
.end method

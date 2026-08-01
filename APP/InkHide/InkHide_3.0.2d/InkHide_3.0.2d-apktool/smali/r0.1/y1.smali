.class public final synthetic Lr0/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lr0/y1;->a:Z

    iput-object p1, p0, Lr0/y1;->b:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lr0/y1;->b:Landroid/app/Activity;

    .line 2
    .line 3
    iget-boolean v1, p0, Lr0/y1;->a:Z

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    new-instance v2, Li/q1;

    .line 8
    .line 9
    invoke-direct {v2, v0}, Li/q1;-><init>(Landroid/app/Activity;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, v2, Li/q1;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v2, v2, Li/q1;->a:Landroid/view/View;

    .line 24
    .line 25
    check-cast v2, Lt0/e;

    .line 26
    .line 27
    invoke-virtual {v2}, Lt0/c;->g()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    new-instance v2, Ls0/J;

    .line 32
    .line 33
    invoke-direct {v2, v0}, Ls0/J;-><init>(Landroid/content/Context;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lt0/c;->g()V

    .line 37
    .line 38
    .line 39
    :goto_0
    if-eqz v1, :cond_2

    .line 40
    .line 41
    const-string v1, "list"

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const-string v1, "panel"

    .line 45
    .line 46
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v2, "search command ui opened"

    .line 55
    .line 56
    filled-new-array {v2, v1, v0}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

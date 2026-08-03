.class public final Lcom/gyf/immersionbar/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Landroid/app/Activity;

.field public b:Landroid/view/Window;

.field public c:Landroid/view/ViewGroup;

.field public d:Landroid/view/ViewGroup;

.field public e:Lcom/gyf/immersionbar/a;

.field public final f:Z

.field public final g:Z

.field public h:Lo5;

.field public i:Ln5;

.field public j:I

.field public k:I

.field public l:Z


# direct methods
.method public constructor <init>(LKd;)V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 35
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->f:Z

    .line 36
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->g:Z

    .line 37
    iput v0, p0, Lcom/gyf/immersionbar/a;->j:I

    .line 38
    iput v0, p0, Lcom/gyf/immersionbar/a;->k:I

    .line 39
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 40
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->l:Z

    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->g:Z

    .line 42
    iget-object v0, p1, Lhi;->s:Lji;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 43
    :cond_0
    iget-object v0, v0, Lji;->l:Lc3;

    .line 44
    :goto_0
    iput-object v0, p0, Lcom/gyf/immersionbar/a;->a:Landroid/app/Activity;

    .line 45
    iget-object p1, p1, LKd;->c0:Landroid/app/Dialog;

    .line 46
    invoke-virtual {p0}, Lcom/gyf/immersionbar/a;->b()V

    .line 47
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/gyf/immersionbar/a;->e(Landroid/view/Window;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->f:Z

    .line 3
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->g:Z

    .line 4
    iput v0, p0, Lcom/gyf/immersionbar/a;->j:I

    .line 5
    iput v0, p0, Lcom/gyf/immersionbar/a;->k:I

    .line 6
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 7
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->l:Z

    .line 8
    iput-object p1, p0, Lcom/gyf/immersionbar/a;->a:Landroid/app/Activity;

    .line 9
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/gyf/immersionbar/a;->e(Landroid/view/Window;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/DialogFragment;)V
    .locals 2

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 49
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->f:Z

    .line 50
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->g:Z

    .line 51
    iput v0, p0, Lcom/gyf/immersionbar/a;->j:I

    .line 52
    iput v0, p0, Lcom/gyf/immersionbar/a;->k:I

    .line 53
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 54
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->l:Z

    const/4 v0, 0x1

    .line 55
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->g:Z

    .line 56
    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iput-object v0, p0, Lcom/gyf/immersionbar/a;->a:Landroid/app/Activity;

    .line 57
    invoke-virtual {p1}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    .line 58
    invoke-virtual {p0}, Lcom/gyf/immersionbar/a;->b()V

    .line 59
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/gyf/immersionbar/a;->e(Landroid/view/Window;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Fragment;)V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->f:Z

    .line 25
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->g:Z

    .line 26
    iput v0, p0, Lcom/gyf/immersionbar/a;->j:I

    .line 27
    iput v0, p0, Lcom/gyf/immersionbar/a;->k:I

    .line 28
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 29
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->l:Z

    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->f:Z

    .line 31
    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    iput-object p1, p0, Lcom/gyf/immersionbar/a;->a:Landroid/app/Activity;

    .line 32
    invoke-virtual {p0}, Lcom/gyf/immersionbar/a;->b()V

    .line 33
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/gyf/immersionbar/a;->e(Landroid/view/Window;)V

    return-void
.end method

.method public constructor <init>(Lhi;)V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->f:Z

    .line 12
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->g:Z

    .line 13
    iput v0, p0, Lcom/gyf/immersionbar/a;->j:I

    .line 14
    iput v0, p0, Lcom/gyf/immersionbar/a;->k:I

    .line 15
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 16
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->l:Z

    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lcom/gyf/immersionbar/a;->f:Z

    .line 18
    iget-object p1, p1, Lhi;->s:Lji;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 19
    :cond_0
    iget-object p1, p1, Lji;->l:Lc3;

    .line 20
    :goto_0
    iput-object p1, p0, Lcom/gyf/immersionbar/a;->a:Landroid/app/Activity;

    .line 21
    invoke-virtual {p0}, Lcom/gyf/immersionbar/a;->b()V

    .line 22
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/gyf/immersionbar/a;->e(Landroid/view/Window;)V

    return-void
.end method

.method public static a(Landroid/view/View;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    instance-of v1, p0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_3

    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    move v3, v0

    :goto_0
    if-ge v3, v1, :cond_3

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v4

    if-eqz v4, :cond_2

    return v2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return v0
.end method

.method public static i(Landroid/app/Activity;)Lcom/gyf/immersionbar/a;
    .locals 9

    sget-object v0, Liw;->a:Ljw;

    iget-object v1, v0, Ljw;->b:Landroid/os/Handler;

    if-eqz p0, :cond_b

    iget-object v2, v0, Ljw;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ".tag.notOnly."

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    instance-of v4, p0, Lki;

    const/4 v5, 0x1

    if-eqz v4, :cond_5

    move-object v4, p0

    check-cast v4, Lki;

    invoke-virtual {v4}, Lki;->getSupportFragmentManager()Lzi;

    move-result-object v4

    iget-object v0, v0, Ljw;->d:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Lzi;->C(Ljava/lang/String;)Lhi;

    move-result-object v6

    check-cast v6, LNz;

    if-nez v6, :cond_3

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LNz;

    if-nez v6, :cond_3

    iget-object v6, v4, Lzi;->c:Lqs;

    invoke-virtual {v6}, Lqs;->t()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lhi;

    instance-of v8, v7, LNz;

    if-eqz v8, :cond_0

    iget-object v8, v7, Lhi;->x:Ljava/lang/String;

    if-nez v8, :cond_1

    new-instance v8, Lh5;

    invoke-direct {v8, v4}, Lh5;-><init>(Lzi;)V

    invoke-virtual {v8, v7}, Lh5;->g(Lhi;)V

    invoke-virtual {v8, v5}, Lh5;->d(Z)I

    goto :goto_0

    :cond_1
    invoke-virtual {v8, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_0

    new-instance v8, Lh5;

    invoke-direct {v8, v4}, Lh5;-><init>(Lzi;)V

    invoke-virtual {v8, v7}, Lh5;->g(Lhi;)V

    invoke-virtual {v8, v5}, Lh5;->d(Z)I

    goto :goto_0

    :cond_2
    new-instance v6, LNz;

    invoke-direct {v6}, LNz;-><init>()V

    invoke-virtual {v0, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lh5;

    invoke-direct {v0, v4}, Lh5;-><init>(Lzi;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v6, v3, v5}, Lh5;->e(ILhi;Ljava/lang/String;I)V

    invoke-virtual {v0, v5}, Lh5;->d(Z)I

    const/4 v0, 0x2

    invoke-virtual {v1, v0, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    :cond_3
    iget-object v0, v6, LNz;->T:LK0;

    if-nez v0, :cond_4

    new-instance v0, LK0;

    invoke-direct {v0, p0}, LK0;-><init>(Landroid/app/Activity;)V

    iput-object v0, v6, LNz;->T:LK0;

    :cond_4
    iget-object p0, v6, LNz;->T:LK0;

    iget-object p0, p0, LK0;->b:Ljava/lang/Object;

    check-cast p0, Lcom/gyf/immersionbar/a;

    return-object p0

    :cond_5
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v4

    iget-object v0, v0, Ljw;->c:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v6

    check-cast v6, LYv;

    if-nez v6, :cond_9

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LYv;

    if-nez v6, :cond_9

    invoke-virtual {v4}, Landroid/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/app/Fragment;

    instance-of v8, v7, LYv;

    if-eqz v8, :cond_6

    invoke-virtual {v7}, Landroid/app/Fragment;->getTag()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_7

    invoke-virtual {v4}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v7

    invoke-virtual {v7}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_1

    :cond_7
    invoke-virtual {v8, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-virtual {v4}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v7

    invoke-virtual {v7}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_1

    :cond_8
    new-instance v6, LYv;

    invoke-direct {v6}, Landroid/app/Fragment;-><init>()V

    invoke-virtual {v0, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, v6, v3}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    invoke-virtual {v1, v5, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    :cond_9
    iget-object v0, v6, LYv;->a:LK0;

    if-nez v0, :cond_a

    new-instance v0, LK0;

    invoke-direct {v0, p0}, LK0;-><init>(Landroid/app/Activity;)V

    iput-object v0, v6, LYv;->a:LK0;

    :cond_a
    iget-object p0, v6, LYv;->a:LK0;

    iget-object p0, p0, LK0;->b:Ljava/lang/Object;

    check-cast p0, Lcom/gyf/immersionbar/a;

    return-object p0

    :cond_b
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "activity is null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/gyf/immersionbar/a;->e:Lcom/gyf/immersionbar/a;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/gyf/immersionbar/a;->a:Landroid/app/Activity;

    invoke-static {v0}, Lcom/gyf/immersionbar/a;->i(Landroid/app/Activity;)Lcom/gyf/immersionbar/a;

    move-result-object v0

    iput-object v0, p0, Lcom/gyf/immersionbar/a;->e:Lcom/gyf/immersionbar/a;

    :cond_0
    iget-object v0, p0, Lcom/gyf/immersionbar/a;->e:Lcom/gyf/immersionbar/a;

    if-eqz v0, :cond_1

    iget-boolean v1, v0, Lcom/gyf/immersionbar/a;->l:Z

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/gyf/immersionbar/a;->d()V

    :cond_1
    return-void
.end method

.method public final c()V
    .locals 2

    invoke-static {}, Lcom/gyf/immersionbar/OSUtils;->isEMUI3_x()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/gyf/immersionbar/a;->c:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/gyf/immersionbar/a;->a(Landroid/view/View;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1, v1, v1}, Lcom/gyf/immersionbar/a;->g(III)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, v1, v1, v1}, Lcom/gyf/immersionbar/a;->g(III)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/gyf/immersionbar/a;->f()V

    :goto_0
    iget-object v0, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    iget-boolean v0, v0, Lo5;->c:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/gyf/immersionbar/a;->i:Ln5;

    iget v0, v0, Ln5;->a:I

    :cond_2
    return-void
.end method

.method public final d()V
    .locals 14

    iget-object v0, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    iget-boolean v0, v0, Lo5;->g:Z

    if-eqz v0, :cond_1e

    iget-object v0, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/high16 v1, -0x1000000

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lza;->b(IIF)I

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v1, v2}, Lza;->b(IIF)I

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v3, p0, Lcom/gyf/immersionbar/a;->l:Z

    iget-boolean v4, p0, Lcom/gyf/immersionbar/a;->f:Z

    if-eqz v3, :cond_0

    if-eqz v4, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/gyf/immersionbar/a;->h()V

    :cond_1
    iget-object v3, p0, Lcom/gyf/immersionbar/a;->e:Lcom/gyf/immersionbar/a;

    if-eqz v3, :cond_2

    if-eqz v4, :cond_2

    iget-object v5, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    iput-object v5, v3, Lcom/gyf/immersionbar/a;->h:Lo5;

    :cond_2
    invoke-static {}, Lcom/gyf/immersionbar/OSUtils;->isEMUI3_x()Z

    move-result v3

    const/4 v5, 0x1

    iget-object v6, p0, Lcom/gyf/immersionbar/a;->a:Landroid/app/Activity;

    const/high16 v7, 0x8000000

    const/high16 v8, 0x4000000

    const/16 v9, 0x1e

    if-nez v3, :cond_a

    iget-boolean v3, p0, Lcom/gyf/immersionbar/a;->l:Z

    if-nez v3, :cond_3

    :try_start_0
    iget-object v3, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    iput v5, v3, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    iget-object v10, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    invoke-virtual {v10, v3}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    iget-boolean v3, p0, Lcom/gyf/immersionbar/a;->l:Z

    if-nez v3, :cond_4

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    iget-object v10, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    invoke-virtual {v10}, Landroid/view/Window;->getNavigationBarColor()I

    move-result v10

    iput v10, v3, Lo5;->a:I

    :cond_4
    iget-object v3, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    invoke-virtual {v3, v8}, Landroid/view/Window;->clearFlags(I)V

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->i:Ln5;

    iget-boolean v3, v3, Ln5;->c:Z

    if-eqz v3, :cond_5

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    invoke-virtual {v3, v7}, Landroid/view/Window;->clearFlags(I)V

    :cond_5
    iget-object v3, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    const/high16 v7, -0x80000000

    invoke-virtual {v3, v7}, Landroid/view/Window;->addFlags(I)V

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1d

    if-lt v3, v7, :cond_6

    iget-object v8, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    invoke-static {v8}, LQ;->r(Landroid/view/Window;)V

    :cond_6
    iget-object v8, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    iget-object v10, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v10, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v10, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1, v2}, Lza;->b(IIF)I

    move-result v10

    invoke-virtual {v8, v10}, Landroid/view/Window;->setStatusBarColor(I)V

    iget-object v8, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    iget-boolean v10, v8, Lo5;->d:Z

    if-eqz v10, :cond_8

    if-lt v3, v7, :cond_7

    iget-object v7, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    invoke-static {v7}, LQ;->B(Landroid/view/Window;)V

    :cond_7
    iget-object v7, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    iget-object v8, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v1, v2}, Lza;->b(IIF)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/view/Window;->setNavigationBarColor(I)V

    goto :goto_0

    :cond_8
    iget-object v7, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    iget v8, v8, Lo5;->a:I

    invoke-virtual {v7, v8}, Landroid/view/Window;->setNavigationBarColor(I)V

    :goto_0
    iget-object v7, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-lt v3, v9, :cond_9

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->d:Landroid/view/ViewGroup;

    invoke-static {v3}, LS;->k(Landroid/view/ViewGroup;)Landroid/view/WindowInsetsController;

    move-result-object v3

    iget-object v7, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, LIF;->d(Landroid/view/WindowInsetsController;)V

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->d:Landroid/view/ViewGroup;

    invoke-static {v3}, LS;->k(Landroid/view/ViewGroup;)Landroid/view/WindowInsetsController;

    move-result-object v3

    iget-object v7, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, LIF;->f(Landroid/view/WindowInsetsController;)V

    :cond_9
    const/16 v3, 0x500

    goto/16 :goto_4

    :cond_a
    iget-object v3, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    invoke-virtual {v3, v8}, Landroid/view/Window;->addFlags(I)V

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->c:Landroid/view/ViewGroup;

    const v8, 0x550a0128

    invoke-virtual {v3, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const/4 v10, -0x1

    if-nez v3, :cond_b

    new-instance v3, Landroid/view/View;

    invoke-direct {v3, v6}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v11, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v12, p0, Lcom/gyf/immersionbar/a;->i:Ln5;

    iget v12, v12, Ln5;->a:I

    invoke-direct {v11, v10, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v12, 0x30

    iput v12, v11, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v3, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v3, v8}, Landroid/view/View;->setId(I)V

    iget-object v8, p0, Lcom/gyf/immersionbar/a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v8, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_b
    iget-object v8, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1, v2}, Lza;->b(IIF)I

    move-result v8

    invoke-virtual {v3, v8}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->i:Ln5;

    iget-boolean v3, v3, Ln5;->c:Z

    if-nez v3, :cond_c

    invoke-static {}, Lcom/gyf/immersionbar/OSUtils;->isEMUI3_x()Z

    move-result v3

    if-eqz v3, :cond_13

    :cond_c
    iget-object v3, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    iget-boolean v8, v3, Lo5;->d:Z

    if-eqz v8, :cond_d

    iget-boolean v3, v3, Lo5;->e:Z

    if-eqz v3, :cond_d

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    invoke-virtual {v3, v7}, Landroid/view/Window;->addFlags(I)V

    goto :goto_1

    :cond_d
    iget-object v3, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    invoke-virtual {v3, v7}, Landroid/view/Window;->clearFlags(I)V

    :goto_1
    iget v3, p0, Lcom/gyf/immersionbar/a;->j:I

    if-nez v3, :cond_e

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->i:Ln5;

    iget v3, v3, Ln5;->d:I

    iput v3, p0, Lcom/gyf/immersionbar/a;->j:I

    :cond_e
    iget v3, p0, Lcom/gyf/immersionbar/a;->k:I

    if-nez v3, :cond_f

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->i:Ln5;

    iget v3, v3, Ln5;->e:I

    iput v3, p0, Lcom/gyf/immersionbar/a;->k:I

    :cond_f
    iget-object v3, p0, Lcom/gyf/immersionbar/a;->c:Landroid/view/ViewGroup;

    const v7, 0x550a0127

    invoke-virtual {v3, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_10

    new-instance v3, Landroid/view/View;

    invoke-direct {v3, v6}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v7}, Landroid/view/View;->setId(I)V

    iget-object v7, p0, Lcom/gyf/immersionbar/a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v7, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_10
    iget-object v7, p0, Lcom/gyf/immersionbar/a;->i:Ln5;

    invoke-virtual {v7}, Ln5;->c()Z

    move-result v7

    if-eqz v7, :cond_11

    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v8, p0, Lcom/gyf/immersionbar/a;->i:Ln5;

    iget v8, v8, Ln5;->d:I

    invoke-direct {v7, v10, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v8, 0x50

    iput v8, v7, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    goto :goto_2

    :cond_11
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v8, p0, Lcom/gyf/immersionbar/a;->i:Ln5;

    iget v8, v8, Ln5;->e:I

    invoke-direct {v7, v8, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v8, 0x800005

    iput v8, v7, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    :goto_2
    invoke-virtual {v3, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v7, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v1, v2}, Lza;->b(IIF)I

    move-result v7

    invoke-virtual {v3, v7}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v7, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    iget-boolean v8, v7, Lo5;->d:Z

    if-eqz v8, :cond_12

    iget-boolean v7, v7, Lo5;->e:Z

    if-eqz v7, :cond_12

    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_12
    const/16 v7, 0x8

    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    :cond_13
    :goto_3
    const/16 v3, 0x100

    :goto_4
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v7, v9, :cond_14

    goto :goto_5

    :cond_14
    iget-object v8, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    or-int/lit16 v3, v3, 0x1000

    :goto_5
    iget-object v8, p0, Lcom/gyf/immersionbar/a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v8, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    invoke-static {}, Lcom/gyf/immersionbar/OSUtils;->isMIUI6Later()Z

    move-result v3

    if-eqz v3, :cond_15

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    iget-object v8, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v8, "EXTRA_FLAG_STATUS_BAR_DARK_MODE"

    invoke-static {v3, v8, v0}, Lcom/gyf/immersionbar/SpecialBarFontUtils;->setMIUIBarDark(Landroid/view/Window;Ljava/lang/String;Z)V

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    iget-boolean v3, v3, Lo5;->d:Z

    if-eqz v3, :cond_15

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    const-string v8, "EXTRA_FLAG_NAVIGATION_BAR_DARK_MODE"

    invoke-static {v3, v8, v0}, Lcom/gyf/immersionbar/SpecialBarFontUtils;->setMIUIBarDark(Landroid/view/Window;Ljava/lang/String;Z)V

    :cond_15
    invoke-static {}, Lcom/gyf/immersionbar/OSUtils;->isFlymeOS4Later()Z

    move-result v3

    if-eqz v3, :cond_16

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v0}, Lcom/gyf/immersionbar/SpecialBarFontUtils;->setStatusBarDarkIcon(Landroid/app/Activity;Z)V

    :cond_16
    if-lt v7, v9, :cond_17

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->d:Landroid/view/ViewGroup;

    invoke-static {v3}, LS;->k(Landroid/view/ViewGroup;)Landroid/view/WindowInsetsController;

    move-result-object v3

    if-eqz v3, :cond_17

    iget-object v6, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LS;->u()I

    move-result v6

    invoke-static {v3, v6}, LS;->s(Landroid/view/WindowInsetsController;I)V

    invoke-static {}, LS;->y()I

    move-result v6

    invoke-static {v3, v6}, LS;->s(Landroid/view/WindowInsetsController;I)V

    invoke-static {v3}, LS;->r(Landroid/view/WindowInsetsController;)V

    :cond_17
    iget-object v3, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/gyf/immersionbar/a;->c()V

    if-nez v4, :cond_18

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_6

    :cond_18
    iget-object v3, p0, Lcom/gyf/immersionbar/a;->e:Lcom/gyf/immersionbar/a;

    if-eqz v3, :cond_19

    iget-object v3, v3, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_19
    :goto_6
    iget-object v3, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    iget-object v3, v3, Lo5;->b:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    move-result v3

    if-eqz v3, :cond_1d

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    iget-object v3, v3, Lo5;->b:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1a
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    iget-object v7, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget-object v8, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    move-object v13, v8

    move-object v8, v7

    move-object v7, v13

    goto :goto_8

    :cond_1b
    if-eqz v6, :cond_1a

    iget-object v4, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpl-float v4, v4, v2

    if-nez v4, :cond_1c

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v8, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v7, v2}, Lza;->b(IIF)I

    move-result v4

    invoke-virtual {v6, v4}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_7

    :cond_1c
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v8, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v7, v2}, Lza;->b(IIF)I

    move-result v4

    invoke-virtual {v6, v4}, Landroid/view/View;->setBackgroundColor(I)V

    goto/16 :goto_7

    :cond_1d
    iput-boolean v5, p0, Lcom/gyf/immersionbar/a;->l:Z

    :cond_1e
    return-void
.end method

.method public final e(Landroid/view/Window;)V
    .locals 1

    iput-object p1, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    new-instance p1, Lo5;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x1000000

    iput v0, p1, Lo5;->a:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p1, Lo5;->b:Ljava/util/HashMap;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lo5;->c:Z

    iput-boolean v0, p1, Lo5;->d:Z

    iput-boolean v0, p1, Lo5;->e:Z

    iput-boolean v0, p1, Lo5;->f:Z

    iput-boolean v0, p1, Lo5;->g:Z

    iput-object p1, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    iget-object p1, p0, Lcom/gyf/immersionbar/a;->b:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/gyf/immersionbar/a;->c:Landroid/view/ViewGroup;

    const v0, 0x1020002

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/gyf/immersionbar/a;->d:Landroid/view/ViewGroup;

    return-void
.end method

.method public final f()V
    .locals 4

    iget-object v0, p0, Lcom/gyf/immersionbar/a;->c:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/gyf/immersionbar/a;->a(Landroid/view/View;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1, v1, v1}, Lcom/gyf/immersionbar/a;->g(III)V

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/gyf/immersionbar/a;->i:Ln5;

    iget-boolean v2, v0, Ln5;->c:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    iget-boolean v3, v2, Lo5;->d:Z

    if-eqz v3, :cond_2

    iget-boolean v2, v2, Lo5;->e:Z

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Ln5;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/gyf/immersionbar/a;->i:Ln5;

    iget v0, v0, Ln5;->d:I

    move v2, v0

    move v0, v1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/gyf/immersionbar/a;->i:Ln5;

    iget v0, v0, Ln5;->e:I

    move v2, v1

    :goto_0
    iget-object v3, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/gyf/immersionbar/a;->i:Ln5;

    invoke-virtual {v3}, Ln5;->c()Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v0, p0, Lcom/gyf/immersionbar/a;->i:Ln5;

    iget v0, v0, Ln5;->e:I

    goto :goto_1

    :cond_2
    move v0, v1

    move v2, v0

    :cond_3
    :goto_1
    invoke-virtual {p0, v1, v0, v2}, Lcom/gyf/immersionbar/a;->g(III)V

    :goto_2
    iget-boolean v0, p0, Lcom/gyf/immersionbar/a;->f:Z

    if-nez v0, :cond_8

    invoke-static {}, Lcom/gyf/immersionbar/OSUtils;->isEMUI3_x()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/gyf/immersionbar/a;->c:Landroid/view/ViewGroup;

    const v1, 0x550a0127

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/gyf/immersionbar/a;->h:Lo5;

    iget-boolean v2, v1, Lo5;->d:Z

    if-eqz v2, :cond_6

    iget-boolean v1, v1, Lo5;->e:Z

    if-eqz v1, :cond_6

    if-eqz v0, :cond_8

    sget v0, LYe;->d:I

    sget-object v0, LXe;->a:LYe;

    iget-object v1, v0, LYe;->a:Ljava/util/ArrayList;

    if-nez v1, :cond_4

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, LYe;->a:Ljava/util/ArrayList;

    :cond_4
    iget-object v1, v0, LYe;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, v0, LYe;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    iget-object v1, p0, Lcom/gyf/immersionbar/a;->a:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    iput-object v1, v0, LYe;->b:Landroid/app/Application;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    if-eqz v1, :cond_8

    iget-object v1, v0, LYe;->c:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_8

    const-string v1, "navigationbar_is_min"

    invoke-static {v1}, Landroid/provider/Settings$System;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_8

    iget-object v2, v0, LYe;->b:Landroid/app/Application;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3, v0}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, LYe;->c:Ljava/lang/Boolean;

    return-void

    :cond_6
    sget v1, LYe;->d:I

    sget-object v1, LXe;->a:LYe;

    iget-object v1, v1, LYe;->a:Ljava/util/ArrayList;

    if-nez v1, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_3
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_8
    return-void
.end method

.method public final g(III)V
    .locals 2

    iget-object v0, p0, Lcom/gyf/immersionbar/a;->d:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2, p3}, Landroid/view/View;->setPadding(IIII)V

    :cond_0
    return-void
.end method

.method public final h()V
    .locals 2

    new-instance v0, Ln5;

    iget-object v1, p0, Lcom/gyf/immersionbar/a;->a:Landroid/app/Activity;

    invoke-direct {v0, v1}, Ln5;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/gyf/immersionbar/a;->i:Ln5;

    return-void
.end method

.method public final run()V
    .locals 0

    invoke-virtual {p0}, Lcom/gyf/immersionbar/a;->f()V

    return-void
.end method

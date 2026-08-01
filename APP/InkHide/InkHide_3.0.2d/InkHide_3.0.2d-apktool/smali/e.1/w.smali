.class public abstract Le/w;
.super Landroid/app/Dialog;
.source "SourceFile"

# interfaces
.implements Le/j;
.implements Landroidx/lifecycle/s;


# instance fields
.field public b:Landroidx/lifecycle/u;

.field public final c:Landroidx/activity/i;

.field public d:Le/u;

.field public final e:Le/v;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const v1, 0x7f040068

    .line 3
    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    new-instance v2, Landroid/util/TypedValue;

    .line 8
    .line 9
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3, v1, v2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 17
    .line 18
    .line 19
    iget v2, v2, Landroid/util/TypedValue;->resourceId:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, p2

    .line 23
    :goto_0
    const-string v3, "context"

    .line 24
    .line 25
    invoke-static {p1, v3}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 29
    .line 30
    .line 31
    new-instance v2, Landroidx/activity/i;

    .line 32
    .line 33
    new-instance v3, Landroidx/activity/b;

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    invoke-direct {v3, v4, p0}, Landroidx/activity/b;-><init>(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v2, v3}, Landroidx/activity/i;-><init>(Ljava/lang/Runnable;)V

    .line 40
    .line 41
    .line 42
    iput-object v2, p0, Le/w;->c:Landroidx/activity/i;

    .line 43
    .line 44
    new-instance v2, Le/v;

    .line 45
    .line 46
    invoke-direct {v2, p0}, Le/v;-><init>(Le/w;)V

    .line 47
    .line 48
    .line 49
    iput-object v2, p0, Le/w;->e:Le/v;

    .line 50
    .line 51
    invoke-virtual {p0}, Le/w;->d()Le/k;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-nez p2, :cond_1

    .line 56
    .line 57
    new-instance p2, Landroid/util/TypedValue;

    .line 58
    .line 59
    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1, v1, p2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 67
    .line 68
    .line 69
    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    .line 70
    .line 71
    :cond_1
    move-object p1, v2

    .line 72
    check-cast p1, Le/u;

    .line 73
    .line 74
    iput p2, p1, Le/u;->N:I

    .line 75
    .line 76
    invoke-virtual {v2}, Le/k;->c()V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public static a(Le/w;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Le/w;->d()Le/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Le/u;

    .line 6
    .line 7
    invoke-virtual {v0}, Le/u;->u()V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Le/u;->u:Landroid/view/ViewGroup;

    .line 11
    .line 12
    const v2, 0x1020002

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroid/view/ViewGroup;

    .line 20
    .line 21
    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, v0, Le/u;->g:Le/p;

    .line 25
    .line 26
    iget-object p2, v0, Le/u;->f:Landroid/view/Window;

    .line 27
    .line 28
    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p1, p2}, Le/p;->a(Landroid/view/Window$Callback;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final c()Landroidx/lifecycle/u;
    .locals 1

    .line 1
    iget-object v0, p0, Le/w;->b:Landroidx/lifecycle/u;

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
    iput-object v0, p0, Le/w;->b:Landroidx/lifecycle/u;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method public final d()Le/k;
    .locals 3

    .line 1
    iget-object v0, p0, Le/w;->d:Le/u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Le/k;->b:Ll/c;

    .line 6
    .line 7
    new-instance v0, Le/u;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v0, v1, v2, p0, p0}, Le/u;-><init>(Landroid/content/Context;Landroid/view/Window;Le/j;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Le/w;->d:Le/u;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Le/w;->d:Le/u;

    .line 23
    .line 24
    return-object v0
.end method

.method public final dismiss()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le/w;->d()Le/k;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Le/k;->d()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Le/w;->e:Le/v;

    .line 10
    .line 11
    invoke-static {v1, v0, p0, p1}, Lb1/h;->r(Ly/j;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Le/w;->b:Landroidx/lifecycle/u;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Landroidx/lifecycle/u;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Landroidx/lifecycle/u;-><init>(Landroidx/lifecycle/s;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Le/w;->b:Landroidx/lifecycle/u;

    .line 14
    .line 15
    :cond_0
    sget-object v0, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/w;->b:Landroidx/lifecycle/u;

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
    iput-object v0, p0, Le/w;->b:Landroidx/lifecycle/u;

    .line 11
    .line 12
    :cond_0
    sget-object v1, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Le/w;->b:Landroidx/lifecycle/u;

    .line 19
    .line 20
    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/w;->d()Le/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Le/u;

    .line 6
    .line 7
    invoke-virtual {v0}, Le/u;->u()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Le/u;->f:Landroid/view/Window;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final g(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final invalidateOptionsMenu()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/w;->d()Le/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Le/k;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onBackPressed()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/w;->c:Landroidx/activity/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/i;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/w;->d()Le/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Le/k;->a()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Le/w;->e(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Le/w;->d()Le/k;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Le/k;->c()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Le/w;->b:Landroidx/lifecycle/u;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Landroidx/lifecycle/u;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Landroidx/lifecycle/u;-><init>(Landroidx/lifecycle/s;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Le/w;->b:Landroidx/lifecycle/u;

    .line 14
    .line 15
    :cond_0
    sget-object v1, Landroidx/lifecycle/m;->ON_RESUME:Landroidx/lifecycle/m;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onStop()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/w;->f()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le/w;->d()Le/k;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Le/u;

    .line 9
    .line 10
    invoke-virtual {v0}, Le/u;->y()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Le/u;->i:Le/E;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Le/E;->J:Z

    .line 19
    .line 20
    iget-object v0, v0, Le/E;->I:Lg/k;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Lg/k;->a()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/w;->d()Le/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/k;->i(I)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;)V
    .locals 1

    .line 2
    invoke-virtual {p0}, Le/w;->d()Le/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/k;->j(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Le/w;->d()Le/k;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le/k;->k(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTitle(I)V
    .locals 2

    .line 3
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    .line 4
    invoke-virtual {p0}, Le/w;->d()Le/k;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/k;->l(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 2
    invoke-virtual {p0}, Le/w;->d()Le/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/k;->l(Ljava/lang/CharSequence;)V

    return-void
.end method

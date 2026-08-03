.class public LKd;
.super Lhi;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final T:LHd;

.field public final U:LId;

.field public V:I

.field public W:I

.field public X:Z

.field public Y:Z

.field public Z:I

.field public a0:Z

.field public final b0:LD2;

.field public c0:Landroid/app/Dialog;

.field public d0:Z

.field public e0:Z

.field public f0:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lhi;-><init>()V

    new-instance v0, LK0;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p0}, LK0;-><init>(ILjava/lang/Object;)V

    new-instance v0, LHd;

    invoke-direct {v0, p0}, LHd;-><init>(LKd;)V

    iput-object v0, p0, LKd;->T:LHd;

    new-instance v0, LId;

    invoke-direct {v0, p0}, LId;-><init>(LKd;)V

    iput-object v0, p0, LKd;->U:LId;

    const/4 v0, 0x0

    iput v0, p0, LKd;->V:I

    iput v0, p0, LKd;->W:I

    const/4 v1, 0x1

    iput-boolean v1, p0, LKd;->X:Z

    iput-boolean v1, p0, LKd;->Y:Z

    const/4 v1, -0x1

    iput v1, p0, LKd;->Z:I

    new-instance v1, LD2;

    const/16 v2, 0x11

    invoke-direct {v1, v2, p0}, LD2;-><init>(ILjava/lang/Object;)V

    iput-object v1, p0, LKd;->b0:LD2;

    iput-boolean v0, p0, LKd;->f0:Z

    return-void
.end method


# virtual methods
.method public C()Landroid/app/Dialog;
    .locals 3

    const/4 v0, 0x3

    invoke-static {v0}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lhi;->toString()Ljava/lang/String;

    :cond_0
    new-instance v0, LUa;

    invoke-virtual {p0}, Lhi;->y()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, LKd;->W:I

    invoke-direct {v0, v1, v2}, LUa;-><init>(Landroid/content/Context;I)V

    return-object v0
.end method

.method public final a()LTB;
    .locals 2

    new-instance v0, Lei;

    invoke-direct {v0, p0}, Lei;-><init>(Lhi;)V

    new-instance v1, LJd;

    invoke-direct {v1, p0, v0}, LJd;-><init>(LKd;Lei;)V

    return-object v1
.end method

.method public final l()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhi;->C:Z

    return-void
.end method

.method public final m(Landroid/content/Context;)V
    .locals 4

    invoke-super {p0, p1}, Lhi;->m(Landroid/content/Context;)V

    iget-object p1, p0, Lhi;->O:Lus;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "observeForever"

    invoke-static {v0}, Lus;->a(Ljava/lang/String;)V

    new-instance v0, LMo;

    iget-object v1, p0, LKd;->b0:LD2;

    invoke-direct {v0, p1, v1}, LMo;-><init>(Lus;LD2;)V

    iget-object p1, p1, Lus;->b:LXw;

    invoke-virtual {p1, v1}, LXw;->a(Ljava/lang/Object;)LUw;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    iget-object p1, v2, LUw;->b:Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance v2, LUw;

    invoke-direct {v2, v1, v0}, LUw;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v1, p1, LXw;->d:I

    add-int/2addr v1, v3

    iput v1, p1, LXw;->d:I

    iget-object v1, p1, LXw;->b:LUw;

    if-nez v1, :cond_1

    iput-object v2, p1, LXw;->a:LUw;

    iput-object v2, p1, LXw;->b:LUw;

    goto :goto_0

    :cond_1
    iput-object v2, v1, LUw;->c:LUw;

    iput-object v1, v2, LUw;->d:LUw;

    iput-object v2, p1, LXw;->b:LUw;

    :goto_0
    const/4 p1, 0x0

    :goto_1
    check-cast p1, LMo;

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v3}, LMo;->a(Z)V

    :goto_2
    const/4 p1, 0x0

    iput-boolean p1, p0, LKd;->e0:Z

    return-void
.end method

.method public n(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lhi;->n(Landroid/os/Bundle;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iget v0, p0, Lhi;->w:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, LKd;->Y:Z

    if-eqz p1, :cond_1

    const-string v0, "android:style"

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LKd;->V:I

    const-string v0, "android:theme"

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LKd;->W:I

    const-string v0, "android:cancelable"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, LKd;->X:Z

    const-string v0, "android:showsDialog"

    iget-boolean v1, p0, LKd;->Y:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, LKd;->Y:Z

    const-string v0, "android:backStackId"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, LKd;->Z:I

    :cond_1
    return-void
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    iget-boolean p1, p0, LKd;->d0:Z

    if-nez p1, :cond_5

    const/4 p1, 0x3

    invoke-static {p1}, Lzi;->G(I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lhi;->toString()Ljava/lang/String;

    :cond_0
    iget-boolean p1, p0, LKd;->e0:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, LKd;->e0:Z

    iget-object v0, p0, LKd;->c0:Landroid/app/Dialog;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v0, p0, LKd;->c0:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_2
    iput-boolean p1, p0, LKd;->d0:Z

    iget v0, p0, LKd;->Z:I

    if-ltz v0, :cond_4

    invoke-virtual {p0}, Lhi;->f()Lzi;

    move-result-object v0

    iget v1, p0, LKd;->Z:I

    if-ltz v1, :cond_3

    new-instance v2, Lyi;

    invoke-direct {v2, v0, v1}, Lyi;-><init>(Lzi;I)V

    invoke-virtual {v0, v2, p1}, Lzi;->w(Lxi;Z)V

    const/4 p1, -0x1

    iput p1, p0, LKd;->Z:I

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Bad id: "

    invoke-static {v1, v0}, Lph;->i(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-virtual {p0}, Lhi;->f()Lzi;

    move-result-object v0

    new-instance v1, Lh5;

    invoke-direct {v1, v0}, Lh5;-><init>(Lzi;)V

    iput-boolean p1, v1, Lh5;->o:Z

    invoke-virtual {v1, p0}, Lh5;->g(Lhi;)V

    invoke-virtual {v1, p1}, Lh5;->d(Z)I

    :cond_5
    :goto_0
    return-void
.end method

.method public final p()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhi;->C:Z

    iget-object v1, p0, LKd;->c0:Landroid/app/Dialog;

    if-eqz v1, :cond_1

    iput-boolean v0, p0, LKd;->d0:Z

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, p0, LKd;->c0:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    iget-boolean v1, p0, LKd;->e0:Z

    if-nez v1, :cond_0

    iget-object v1, p0, LKd;->c0:Landroid/app/Dialog;

    invoke-virtual {p0, v1}, LKd;->onDismiss(Landroid/content/DialogInterface;)V

    :cond_0
    iput-object v0, p0, LKd;->c0:Landroid/app/Dialog;

    const/4 v0, 0x0

    iput-boolean v0, p0, LKd;->f0:Z

    :cond_1
    return-void
.end method

.method public final q()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhi;->C:Z

    iget-boolean v1, p0, LKd;->e0:Z

    if-nez v1, :cond_0

    iput-boolean v0, p0, LKd;->e0:Z

    :cond_0
    iget-object v0, p0, Lhi;->O:Lus;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "removeObserver"

    invoke-static {v1}, Lus;->a(Ljava/lang/String;)V

    iget-object v0, v0, Lus;->b:LXw;

    iget-object v1, p0, LKd;->b0:LD2;

    invoke-virtual {v0, v1}, LXw;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LMo;

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LMo;->a(Z)V

    return-void
.end method

.method public final r(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 6

    invoke-super {p0, p1}, Lhi;->r(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-boolean v0, p0, LKd;->Y:Z

    const/4 v1, 0x2

    if-eqz v0, :cond_8

    iget-boolean v2, p0, LKd;->a0:Z

    if-eqz v2, :cond_0

    goto/16 :goto_5

    :cond_0
    if-nez v0, :cond_1

    goto :goto_4

    :cond_1
    iget-boolean v0, p0, LKd;->f0:Z

    if-nez v0, :cond_6

    const/4 v0, 0x0

    const/4 v2, 0x1

    :try_start_0
    iput-boolean v2, p0, LKd;->a0:Z

    invoke-virtual {p0}, LKd;->C()Landroid/app/Dialog;

    move-result-object v3

    iput-object v3, p0, LKd;->c0:Landroid/app/Dialog;

    iget-boolean v4, p0, LKd;->Y:Z

    if-eqz v4, :cond_5

    iget v4, p0, LKd;->V:I

    if-eq v4, v2, :cond_3

    if-eq v4, v1, :cond_3

    const/4 v5, 0x3

    if-eq v4, v5, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v4

    if-eqz v4, :cond_3

    const/16 v5, 0x18

    invoke-virtual {v4, v5}, Landroid/view/Window;->addFlags(I)V

    :cond_3
    invoke-virtual {v3, v2}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    :goto_0
    invoke-virtual {p0}, Lhi;->d()Landroid/content/Context;

    move-result-object v3

    if-eqz v3, :cond_4

    iget-object v4, p0, LKd;->c0:Landroid/app/Dialog;

    check-cast v3, Landroid/app/Activity;

    invoke-virtual {v4, v3}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_4
    :goto_1
    iget-object v3, p0, LKd;->c0:Landroid/app/Dialog;

    iget-boolean v4, p0, LKd;->X:Z

    invoke-virtual {v3, v4}, Landroid/app/Dialog;->setCancelable(Z)V

    iget-object v3, p0, LKd;->c0:Landroid/app/Dialog;

    iget-object v4, p0, LKd;->T:LHd;

    invoke-virtual {v3, v4}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    iget-object v3, p0, LKd;->c0:Landroid/app/Dialog;

    iget-object v4, p0, LKd;->U:LId;

    invoke-virtual {v3, v4}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iput-boolean v2, p0, LKd;->f0:Z

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    iput-object v2, p0, LKd;->c0:Landroid/app/Dialog;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    iput-boolean v0, p0, LKd;->a0:Z

    goto :goto_4

    :goto_3
    iput-boolean v0, p0, LKd;->a0:Z

    throw p1

    :cond_6
    :goto_4
    invoke-static {v1}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lhi;->toString()Ljava/lang/String;

    :cond_7
    iget-object v0, p0, LKd;->c0:Landroid/app/Dialog;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    return-object p1

    :cond_8
    :goto_5
    invoke-static {v1}, Lzi;->G(I)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lhi;->toString()Ljava/lang/String;

    :cond_9
    return-object p1
.end method

.method public t(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, LKd;->c0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android:dialogShowing"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "android:savedDialogState"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    iget v0, p0, LKd;->V:I

    if-eqz v0, :cond_1

    const-string v1, "android:style"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    iget v0, p0, LKd;->W:I

    if-eqz v0, :cond_2

    const-string v1, "android:theme"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_2
    iget-boolean v0, p0, LKd;->X:Z

    if-nez v0, :cond_3

    const-string v1, "android:cancelable"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_3
    iget-boolean v0, p0, LKd;->Y:Z

    if-nez v0, :cond_4

    const-string v1, "android:showsDialog"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_4
    iget v0, p0, LKd;->Z:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    const-string v1, "android:backStackId"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_5
    return-void
.end method

.method public u()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhi;->C:Z

    iget-object v0, p0, LKd;->c0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p0, LKd;->d0:Z

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iget-object v0, p0, LKd;->c0:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x550a025f

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const v1, 0x550a0262

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const v1, 0x550a0261

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public v()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhi;->C:Z

    iget-object v0, p0, LKd;->c0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->hide()V

    :cond_0
    return-void
.end method

.method public final w(Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhi;->C:Z

    iget-object v0, p0, LKd;->c0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    const-string v0, "android:savedDialogState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LKd;->c0:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final x(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lhi;->x(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object p1, p0, Lhi;->E:Landroid/view/View;

    if-nez p1, :cond_0

    iget-object p1, p0, LKd;->c0:Landroid/app/Dialog;

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    const-string p1, "android:savedDialogState"

    invoke-virtual {p3, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, LKd;->c0:Landroid/app/Dialog;

    invoke-virtual {p2, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

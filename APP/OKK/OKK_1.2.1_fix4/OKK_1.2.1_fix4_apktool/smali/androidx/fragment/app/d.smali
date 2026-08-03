.class public Landroidx/fragment/app/d;
.super Landroidx/fragment/app/e;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final k:Landroidx/fragment/app/c;

.field public l:I

.field public m:Z

.field public n:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/fragment/app/e;-><init>()V

    new-instance v0, LA0/E;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p0}, LA0/E;-><init>(ILjava/lang/Object;)V

    new-instance v0, Landroidx/fragment/app/b;

    invoke-direct {v0, p0}, Landroidx/fragment/app/b;-><init>(Landroidx/fragment/app/d;)V

    new-instance v0, Landroidx/fragment/app/c;

    invoke-direct {v0, p0}, Landroidx/fragment/app/c;-><init>(Landroidx/fragment/app/d;)V

    iput-object v0, p0, Landroidx/fragment/app/d;->k:Landroidx/fragment/app/c;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/d;->l:I

    new-instance v0, Lx0/e;

    const/16 v1, 0x18

    invoke-direct {v0, v1, p0}, Lx0/e;-><init>(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final i(ZZ)V
    .locals 3

    iget-boolean p2, p0, Landroidx/fragment/app/d;->n:Z

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x1

    iput-boolean p2, p0, Landroidx/fragment/app/d;->n:Z

    iput-boolean p2, p0, Landroidx/fragment/app/d;->m:Z

    iget v0, p0, Landroidx/fragment/app/d;->l:I

    if-ltz v0, :cond_4

    invoke-virtual {p0}, Landroidx/fragment/app/e;->f()Landroidx/fragment/app/i;

    move-result-object p2

    iget v0, p0, Landroidx/fragment/app/d;->l:I

    if-ltz v0, :cond_3

    if-eqz p1, :cond_2

    iget-object v0, p2, Landroidx/fragment/app/i;->a:Ljava/util/ArrayList;

    monitor-enter v0

    if-eqz p1, :cond_1

    :try_start_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, -0x1

    iput p1, p0, Landroidx/fragment/app/d;->l:I

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Activity has been destroyed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FragmentManager has not been attached to a host."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Bad id: "

    invoke-static {p2, v0}, LS/d;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/e;->f()Landroidx/fragment/app/i;

    move-result-object v0

    new-instance v1, Landroidx/fragment/app/a;

    invoke-direct {v1, v0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/i;)V

    new-instance v0, Landroidx/fragment/app/j;

    const/4 v2, 0x3

    invoke-direct {v0, v2, p0}, Landroidx/fragment/app/j;-><init>(ILandroidx/fragment/app/e;)V

    invoke-virtual {v1, v0}, Landroidx/fragment/app/a;->a(Landroidx/fragment/app/j;)V

    if-eqz p1, :cond_5

    invoke-virtual {v1, p2}, Landroidx/fragment/app/a;->b(Z)I

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Landroidx/fragment/app/a;->b(Z)I

    :goto_1
    return-void
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-boolean p1, p0, Landroidx/fragment/app/d;->m:Z

    if-nez p1, :cond_1

    const-string p1, "FragmentManager"

    const/4 v0, 0x3

    invoke-static {p1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/e;->toString()Ljava/lang/String;

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {p0, p1, p1}, Landroidx/fragment/app/d;->i(ZZ)V

    :cond_1
    return-void
.end method

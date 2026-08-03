.class public final synthetic Lf0/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic a:LQ0/m;

.field public final synthetic b:Lf0/V;

.field public final synthetic c:Landroid/app/Dialog;

.field public final synthetic d:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(LQ0/m;Lf0/V;Landroid/app/Dialog;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/B;->a:LQ0/m;

    iput-object p2, p0, Lf0/B;->b:Lf0/V;

    iput-object p3, p0, Lf0/B;->c:Landroid/app/Dialog;

    iput-object p4, p0, Lf0/B;->d:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 4

    iget-object p1, p0, Lf0/B;->a:LQ0/m;

    const-string v0, "$backInvoked"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this_runCatching"

    iget-object v1, p0, Lf0/B;->b:Lf0/V;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf0/B;->c:Landroid/app/Dialog;

    const-string v1, "$dialog"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lf0/B;->d:Landroid/app/Activity;

    const-string v2, "$host"

    invoke-static {v1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-lt v2, v3, :cond_0

    iget-object v2, p1, LQ0/m;->a:Ljava/lang/Object;

    if-eqz v2, :cond_0

    :try_start_0
    invoke-static {v0}, LE/d;->e(Landroid/app/Dialog;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object v2

    iget-object p1, p1, LQ0/m;->a:Ljava/lang/Object;

    invoke-static {p1}, LE/d;->d(Ljava/lang/Object;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    invoke-static {v2, p1}, LE/d;->g(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_0
    :goto_0
    sget-object p1, Lf0/V;->o:Landroid/app/Dialog;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    sput-object p1, Lf0/V;->o:Landroid/app/Dialog;

    :cond_1
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const-string v2, ".module.MainActivity"

    invoke-static {p1, v2, v0}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    :cond_2
    return-void
.end method

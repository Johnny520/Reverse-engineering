.class public final La/Q0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/P$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/Q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final a:La/P$a;

.field public final synthetic b:La/Q0;


# direct methods
.method public constructor <init>(La/Q0;La/P$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/Q0$d;->b:La/Q0;

    iput-object p2, p0, La/Q0$d;->a:La/P$a;

    return-void
.end method


# virtual methods
.method public final a(La/P;Landroidx/appcompat/view/menu/f;)Z
    .locals 1

    iget-object v0, p0, La/Q0$d;->a:La/P$a;

    invoke-interface {v0, p1, p2}, La/P$a;->a(La/P;Landroidx/appcompat/view/menu/f;)Z

    move-result p1

    return p1
.end method

.method public final b(La/P;)V
    .locals 2

    iget-object v0, p0, La/Q0$d;->a:La/P$a;

    invoke-interface {v0, p1}, La/P$a;->b(La/P;)V

    iget-object p1, p0, La/Q0$d;->b:La/Q0;

    iget-object v0, p1, La/Q0;->w:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object v0, p1, La/Q0;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p1, La/Q0;->x:La/T0;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object v0, p1, La/Q0;->v:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_2

    iget-object v0, p1, La/Q0;->y:La/Jg;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, La/Jg;->b()V

    :cond_1
    iget-object v0, p1, La/Q0;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, La/ug;->a(Landroid/view/View;)La/Jg;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La/Jg;->a(F)V

    iput-object v0, p1, La/Q0;->y:La/Jg;

    new-instance v1, La/Q0$d$a;

    invoke-direct {v1, p0}, La/Q0$d$a;-><init>(La/Q0$d;)V

    invoke-virtual {v0, v1}, La/Jg;->d(La/Lg;)V

    :cond_2
    iget-object v0, p1, La/Q0;->n:Ljava/lang/Object;

    if-eqz v0, :cond_3

    iget-object v1, p1, La/Q0;->u:La/P;

    invoke-interface {v0, v1}, La/I0;->onSupportActionModeFinished(La/P;)V

    :cond_3
    const/4 v0, 0x0

    iput-object v0, p1, La/Q0;->u:La/P;

    iget-object v0, p1, La/Q0;->B:Landroid/view/ViewGroup;

    sget-object v1, La/ug;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, La/ug$c;->c(Landroid/view/View;)V

    invoke-virtual {p1}, La/Q0;->Y()V

    return-void
.end method

.method public final c(La/P;Landroidx/appcompat/view/menu/f;)Z
    .locals 2

    iget-object v0, p0, La/Q0$d;->b:La/Q0;

    iget-object v0, v0, La/Q0;->B:Landroid/view/ViewGroup;

    sget-object v1, La/ug;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, La/ug$c;->c(Landroid/view/View;)V

    iget-object v0, p0, La/Q0$d;->a:La/P$a;

    invoke-interface {v0, p1, p2}, La/P$a;->c(La/P;Landroidx/appcompat/view/menu/f;)Z

    move-result p1

    return p1
.end method

.method public final d(La/P;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, La/Q0$d;->a:La/P$a;

    invoke-interface {v0, p1, p2}, La/P$a;->d(La/P;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

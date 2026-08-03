.class public final LA/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    .locals 0

    const/4 p3, 0x3

    iput p3, p0, LA/a;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/a;->c:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LA/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg/i;Lg/f;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LA/a;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/a;->c:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, LA/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LA/a;->a:I

    iput-object p1, p0, LA/a;->b:Ljava/lang/Object;

    iput-object p2, p0, LA/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LA/a;->b:Ljava/lang/Object;

    iget-object v1, p0, LA/a;->c:Ljava/lang/Object;

    iget v2, p0, LA/a;->a:I

    packed-switch v2, :pswitch_data_0

    check-cast v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    iget-object v1, v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:LL/e;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LL/e;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LD/Q;->a:Ljava/lang/reflect/Field;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :pswitch_0
    check-cast v1, Lg/i;

    iget-object v2, v1, Lg/i;->c:Lf/j;

    if-eqz v2, :cond_1

    iget-object v3, v2, Lf/j;->e:Lf/h;

    if-eqz v3, :cond_1

    invoke-interface {v3, v2}, Lf/h;->l(Lf/j;)V

    :cond_1
    iget-object v2, v1, Lg/i;->g:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    if-eqz v2, :cond_4

    check-cast v0, Lg/f;

    invoke-virtual {v0}, Lf/n;->b()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    iget-object v2, v0, Lf/n;->f:Landroid/view/View;

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v2, v2}, Lf/n;->d(IIZZ)V

    :goto_0
    iput-object v0, v1, Lg/i;->r:Lg/f;

    :cond_4
    :goto_1
    const/4 v0, 0x0

    iput-object v0, v1, Lg/i;->t:LA/a;

    return-void

    :pswitch_1
    check-cast v0, LC/a;

    invoke-interface {v0, v1}, LC/a;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_2
    check-cast v0, LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, Lu/b;

    if-eqz v0, :cond_5

    check-cast v1, Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Lu/b;->g(Landroid/graphics/Typeface;)V

    :cond_5
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

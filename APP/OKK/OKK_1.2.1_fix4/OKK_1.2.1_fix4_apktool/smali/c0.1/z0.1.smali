.class public final synthetic Lc0/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    iput p3, p0, Lc0/z0;->a:I

    iput-object p1, p0, Lc0/z0;->c:Ljava/lang/Object;

    iput p2, p0, Lc0/z0;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Lc0/z0;->b:I

    iget-object v1, p0, Lc0/z0;->c:Ljava/lang/Object;

    iget v2, p0, Lc0/z0;->a:I

    packed-switch v2, :pswitch_data_0

    check-cast v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-object v2, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->t(Landroid/view/View;IZ)V

    :cond_0
    return-void

    :pswitch_0
    check-cast v1, Lu/b;

    invoke-virtual {v1, v0}, Lu/b;->f(I)V

    return-void

    :pswitch_1
    check-cast v1, Landroid/widget/TextView;

    const-string v2, "$nickname"

    invoke-static {v1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lc0/N0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {v1, v0}, Lc0/N0;->a(Landroid/widget/TextView;I)V

    return-void

    :pswitch_2
    const-string v2, "$v"

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

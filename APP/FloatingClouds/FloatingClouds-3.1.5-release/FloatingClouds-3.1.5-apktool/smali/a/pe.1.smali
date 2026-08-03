.class public final synthetic La/pe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/fragment/app/f;

.field public final synthetic c:Landroidx/fragment/app/f$b;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/f;Landroidx/fragment/app/f$b;I)V
    .locals 0

    iput p3, p0, La/pe;->a:I

    iput-object p1, p0, La/pe;->b:Landroidx/fragment/app/f;

    iput-object p2, p0, La/pe;->c:Landroidx/fragment/app/f$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, La/pe;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/pe;->b:Landroidx/fragment/app/f;

    const-string v1, "this$0"

    invoke-static {v0, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, La/pe;->c:Landroidx/fragment/app/f$b;

    iget-object v2, v0, Landroidx/fragment/app/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, v0, Landroidx/fragment/app/f;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    iget-object v0, p0, La/pe;->b:Landroidx/fragment/app/f;

    const-string v1, "this$0"

    invoke-static {v0, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, La/pe;->c:Landroidx/fragment/app/f$b;

    iget-object v2, v0, Landroidx/fragment/app/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v1, Landroidx/fragment/app/f$c;->a:Landroidx/fragment/app/f$c$b;

    iget-object v1, v1, Landroidx/fragment/app/f$c;->c:Landroidx/fragment/app/b;

    iget-object v1, v1, Landroidx/fragment/app/b;->G:Landroid/view/View;

    const-string v3, "operation.fragment.mView"

    invoke-static {v1, v3}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Landroidx/fragment/app/f;->a:Landroid/view/ViewGroup;

    invoke-virtual {v2, v1, v0}, Landroidx/fragment/app/f$c$b;->a(Landroid/view/View;Landroid/view/ViewGroup;)V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

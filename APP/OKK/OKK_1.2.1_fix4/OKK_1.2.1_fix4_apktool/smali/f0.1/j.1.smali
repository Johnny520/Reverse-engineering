.class public final synthetic Lf0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LP0/a;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;LP0/a;I)V
    .locals 0

    iput p3, p0, Lf0/j;->a:I

    iput-object p1, p0, Lf0/j;->c:Ljava/lang/Object;

    iput-object p2, p0, Lf0/j;->b:LP0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    iget p1, p0, Lf0/j;->a:I

    packed-switch p1, :pswitch_data_0

    const-string p1, "$item"

    iget-object v0, p0, Lf0/j;->c:Ljava/lang/Object;

    check-cast v0, Lf0/H;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "$onToggle"

    iget-object v1, p0, Lf0/j;->b:LP0/a;

    invoke-static {v1, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lc0/h1;->a:Lc0/h1;

    const/4 v2, 0x1

    iget-object v0, v0, Lf0/H;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, p2, v2}, Lc0/h1;->g(Ljava/lang/String;ZZ)V

    invoke-interface {v1}, LP0/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_0
    const-string p1, "$this_apply"

    iget-object v0, p0, Lf0/j;->c:Ljava/lang/Object;

    check-cast v0, Landroid/widget/Switch;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "$refresh"

    iget-object v1, p0, Lf0/j;->b:LP0/a;

    invoke-static {v1, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/abc/core/hooks/ModuleLog;->INSTANCE:Lcom/abc/core/hooks/ModuleLog;

    invoke-virtual {p1, p2}, Lcom/abc/core/hooks/ModuleLog;->setEnabled(Z)V

    new-instance p1, Lf0/l;

    const/4 p2, 0x1

    invoke-direct {p1, v1, p2}, Lf0/l;-><init>(LP0/a;I)V

    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

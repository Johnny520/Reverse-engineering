.class public final synthetic Lc0/D1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc0/D1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    sget-object v0, LD0/l;->a:LD0/l;

    iget v1, p0, Lc0/D1;->a:I

    packed-switch v1, :pswitch_data_0

    sget-object v1, Lcom/abc/core/hooks/ModuleLog;->INSTANCE:Lcom/abc/core/hooks/ModuleLog;

    sget-object v2, Lc0/h1;->a:Lc0/h1;

    const-string v2, "module_log_enabled"

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/abc/core/hooks/ModuleLog;->setEnabled(Z)V

    return-object v0

    :pswitch_0
    sget-object v1, Lf0/V;->a:Lf0/V;

    return-object v0

    :pswitch_1
    sget-object v1, Lc0/G1;->e:Landroid/os/Handler;

    new-instance v2, Lc0/z;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lc0/z;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

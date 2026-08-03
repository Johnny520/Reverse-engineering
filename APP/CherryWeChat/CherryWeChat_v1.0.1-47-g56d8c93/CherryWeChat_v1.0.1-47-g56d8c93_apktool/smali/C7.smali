.class public final synthetic LC7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    .line 2
    iput p2, p0, LC7;->a:I

    iput-object p1, p0, LC7;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lha;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p3, p0, LC7;->a:I

    iput-object p2, p0, LC7;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget p1, p0, LC7;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, LC7;->b:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->onBackPressed()V

    sget-object v0, Lds;->a:Lds;

    const-wide v1, -0x28d1fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    sget-object v1, LY4;->a:LY4;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, LY4;->b(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x3ef

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    invoke-static {v0, p1, v1}, Lds;->d(Lds;Landroid/content/Context;I)V

    return-void

    :pswitch_0
    const-wide v0, -0x4a46fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    const-wide v0, -0x4a4bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LSo;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LSo;-><init>(I)V

    const/4 v2, 0x1

    iget-object v3, p0, LC7;->b:Landroid/app/Activity;

    invoke-static {v3, p1, v0, v1, v2}, Lgf;->S(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Z)V

    return-void

    :pswitch_1
    const-wide v0, -0x4a46fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    const-wide v0, -0x4a4bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LSo;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LSo;-><init>(I)V

    const/4 v2, 0x1

    iget-object v3, p0, LC7;->b:Landroid/app/Activity;

    invoke-static {v3, p1, v0, v1, v2}, Lgf;->S(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Z)V

    return-void

    :pswitch_2
    iget-object p1, p0, LC7;->b:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->onBackPressed()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

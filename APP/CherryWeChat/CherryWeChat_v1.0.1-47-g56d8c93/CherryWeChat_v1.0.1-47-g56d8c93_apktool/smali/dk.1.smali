.class public final synthetic Ldk;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lhk;

.field public final synthetic c:LEC;


# direct methods
.method public synthetic constructor <init>(LEC;Lhk;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Ldk;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldk;->c:LEC;

    iput-object p2, p0, Ldk;->b:Lhk;

    return-void
.end method

.method public synthetic constructor <init>(Lhk;LEC;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ldk;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldk;->b:Lhk;

    iput-object p2, p0, Ldk;->c:LEC;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    iget p1, p0, Ldk;->a:I

    iget-object p2, p0, Ldk;->b:Lhk;

    packed-switch p1, :pswitch_data_0

    sget-object v5, LCC;->d:LCC;

    const/4 v6, 0x0

    const v7, 0x3bffff

    iget-object v0, p0, Ldk;->c:LEC;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, LEC;->a(LEC;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LCC;ZI)LEC;

    move-result-object p1

    sget v0, Lhk;->g:I

    invoke-virtual {p2, p1}, Lhk;->b(LEC;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Ldk;->c:LEC;

    const/4 v1, 0x0

    :try_start_0
    sget-object v0, LEA;->a:LEA;

    iget-object p1, p1, LEC;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, LEA;->k(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v2, -0x40b0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    new-instance p1, LN2;

    const/16 v0, 0xe

    invoke-direct {p1, v0, p2}, LN2;-><init>(ILjava/lang/Object;)V

    const-wide/16 v2, 0x64

    invoke-static {p1, v2, v3}, LbA;->b(Ljava/lang/Runnable;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x40b7fffff835L

    invoke-static {v2, v3, v0, p1}, LEy;->c(JLjava/lang/StringBuilder;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

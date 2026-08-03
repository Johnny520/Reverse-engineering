.class public final synthetic LNC;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LQC;


# direct methods
.method public synthetic constructor <init>(LQC;I)V
    .locals 0

    iput p2, p0, LNC;->a:I

    iput-object p1, p0, LNC;->b:LQC;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, LNC;->a:I

    const/4 v1, 0x3

    const/4 v2, 0x0

    sget-object v3, LTC;->a:LTC;

    iget-object v4, p0, LNC;->b:LQC;

    check-cast p1, Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v4}, LQC;->f()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x1b9b6fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-object v3

    :pswitch_0
    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, LEA;->j(Ljava/lang/String;)V

    invoke-virtual {v4}, LQC;->f()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v4, p1}, LQC;->g(Landroid/app/Activity;)V

    return-object v3

    :pswitch_1
    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    invoke-static {v0}, LPj;->a(Lac;)LCb;

    move-result-object v0

    new-instance v5, Lfk;

    const/4 v6, 0x5

    invoke-direct {v5, v4, p1, v2, v6}, Lfk;-><init>(LQC;Ljava/lang/Object;LEb;I)V

    invoke-static {v0, v5, v1}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    return-object v3

    :pswitch_2
    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, LEA;->j(Ljava/lang/String;)V

    sget-object p1, Lhe;->a:Lhd;

    sget-object p1, LZp;->a:Lnk;

    invoke-static {p1}, LPj;->a(Lac;)LCb;

    move-result-object p1

    new-instance v0, LOC;

    const/4 v5, 0x0

    invoke-direct {v0, v4, v2, v5}, LOC;-><init>(LQC;LEb;I)V

    invoke-static {p1, v0, v1}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

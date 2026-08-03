.class public final synthetic Lg;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p5, p0, Lg;->a:I

    iput-object p1, p0, Lg;->b:Ljava/lang/Object;

    iput-object p2, p0, Lg;->c:Ljava/lang/Object;

    iput-object p3, p0, Lg;->d:Ljava/lang/Object;

    iput-object p4, p0, Lg;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 13

    iget p1, p0, Lg;->a:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lg;->e:Ljava/lang/Object;

    iget-object v3, p0, Lg;->d:Ljava/lang/Object;

    iget-object v4, p0, Lg;->c:Ljava/lang/Object;

    iget-object v5, p0, Lg;->b:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    move-object v7, v5

    check-cast v7, Landroid/widget/TextView;

    move-object v8, v4

    check-cast v8, LHv;

    move-object v9, v3

    check-cast v9, Landroid/app/AlertDialog;

    move-object v10, v2

    check-cast v10, Landroid/content/Context;

    new-instance p1, Ljava/lang/Thread;

    new-instance v6, LNk;

    const/4 v11, 0x2

    invoke-direct/range {v6 .. v11}, LNk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-direct {p1, v6}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void

    :pswitch_0
    check-cast v5, LOg;

    check-cast v4, LEC;

    check-cast v3, LDA;

    check-cast v2, Lqe;

    sget-object p1, LEA;->a:LEA;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->h()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v2, -0x58c3fffff835L

    invoke-static {v2, v3, p1, v1}, LEy;->k(JLandroid/content/Context;I)V

    goto :goto_0

    :cond_0
    new-instance p1, Loe;

    invoke-direct {p1, v2, v1}, Loe;-><init>(Lqe;I)V

    invoke-static {p1}, LbA;->a(Ljava/lang/Runnable;)V

    sget-object p1, Lhe;->a:Lhd;

    sget-object p1, LVc;->b:LVc;

    invoke-static {p1}, LPj;->a(Lac;)LCb;

    move-result-object p1

    new-instance v0, LW4;

    const/4 v1, 0x0

    move-object v12, v4

    move-object v4, v3

    move-object v3, v5

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, LW4;-><init>(LEb;Lqe;LOg;LDA;LEC;)V

    const/4 v1, 0x3

    invoke-static {p1, v0, v1}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    :goto_0
    return-void

    :pswitch_1
    check-cast v5, LOg;

    check-cast v4, LEC;

    check-cast v3, LDA;

    check-cast v2, Ljava/io/File;

    sget-object p1, LEA;->a:LEA;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v6, v3, LDA;->a:Ljava/lang/String;

    invoke-virtual {p1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v2, -0x5808fffff835L

    invoke-static {v2, v3, p1, v1}, LEy;->k(JLandroid/content/Context;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v6, -0x5814fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    const-wide v6, -0x5824fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v8, -0x582bfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v4, LEC;->c:Ljava/lang/String;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x20

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v4, v3, LDA;->b:Ljava/lang/String;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v8, -0x5836fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v7, LMb;

    invoke-direct {v7, v2, v5, v3, v0}, LMb;-><init>(Ljava/lang/Object;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;I)V

    invoke-static {p1, v6, v4, v7, v1}, Lgf;->S(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Z)V

    :goto_1
    return-void

    :pswitch_2
    check-cast v5, Landroid/widget/EditText;

    check-cast v4, Ljava/lang/String;

    check-cast v3, Landroid/content/Context;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v5, p1}, Landroid/widget/EditText;->setSelection(I)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x2ff87fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v4, -0x2ff8cfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    :pswitch_3
    check-cast v5, LFv;

    check-cast v4, Landroid/widget/LinearLayout;

    check-cast v3, Ljava/util/List;

    check-cast v2, Lm;

    iget-boolean p1, v5, LFv;->a:Z

    xor-int/2addr p1, v0

    iput-boolean p1, v5, LFv;->a:Z

    invoke-static {v4, v5, v3, v2}, Lm;->l(Landroid/widget/LinearLayout;LFv;Ljava/util/List;Lm;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

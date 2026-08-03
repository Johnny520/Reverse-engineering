.class public final synthetic LMb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Landroid/view/KeyEvent$Callback;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, LMb;->a:I

    iput-object p1, p0, LMb;->b:Ljava/lang/Object;

    iput-object p2, p0, LMb;->c:Landroid/view/KeyEvent$Callback;

    iput-object p3, p0, LMb;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 12

    iget v0, p0, LMb;->a:I

    const/4 v1, 0x0

    iget-object v2, p0, LMb;->d:Ljava/lang/Object;

    iget-object v3, p0, LMb;->c:Landroid/view/KeyEvent$Callback;

    iget-object v4, p0, LMb;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    move-object v9, v4

    check-cast v9, LSA;

    move-object v8, v3

    check-cast v8, Landroid/app/Activity;

    move-object v6, v2

    check-cast v6, Ljava/lang/String;

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    if-nez p2, :cond_0

    const-wide p1, -0x1bdf8fffff835L

    :goto_0
    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    move-object v7, p1

    goto :goto_1

    :cond_0
    const-wide p1, -0x1bdfffffff835L

    goto :goto_0

    :goto_1
    iget-object p1, v9, LSA;->g:Landroid/widget/TextView;

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    sget-object p1, Lhe;->a:Lhd;

    sget-object p1, LZp;->a:Lnk;

    invoke-static {p1}, LPj;->a(Lac;)LCb;

    move-result-object p1

    new-instance v5, LW4;

    const/4 v10, 0x0

    const/4 v11, 0x3

    invoke-direct/range {v5 .. v11}, LW4;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    const/4 p2, 0x3

    invoke-static {p1, v5, p2}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    :goto_2
    return-void

    :pswitch_0
    check-cast v4, LEC;

    check-cast v3, Landroid/widget/TextView;

    check-cast v2, LOg;

    :try_start_0
    new-instance p1, Ljava/io/File;

    sget-object p2, LEA;->a:LEA;

    iget-object v0, v4, LEC;->a:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, LEA;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {p1}, Lwh;->b0(Ljava/io/File;)Z

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v4, -0x58dffffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    iget-object p1, v2, LOg;->a:Lca;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/g;->notifyDataSetChanged()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x58e5fffff835L

    invoke-static {v2, v3, v0, p1}, LEy;->c(JLjava/lang/StringBuilder;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_2
    :goto_3
    return-void

    :pswitch_1
    check-cast v4, Ljava/io/File;

    check-cast v3, LOg;

    check-cast v2, LDA;

    :try_start_1
    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p2

    goto :goto_4

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_7

    :cond_3
    const/4 p2, 0x0

    :goto_4
    if-eqz p2, :cond_5

    array-length v0, p2

    move v5, v1

    :goto_5
    if-ge v5, v0, :cond_5

    aget-object v6, p2, v5

    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v2, LDA;->a:Ljava/lang/String;

    invoke-static {v6, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v4, -0x4701fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_6

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_5
    if-eqz p1, :cond_6

    invoke-static {p1}, Lwh;->b0(Ljava/io/File;)Z

    :cond_6
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v4, -0x4709fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_6
    iget-object p1, v3, LOg;->a:Lca;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/g;->notifyDataSetChanged()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_8

    :goto_7
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x470ffffff835L

    invoke-static {v2, v3, v0, p1}, LEy;->c(JLjava/lang/StringBuilder;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_8
    return-void

    :pswitch_2
    check-cast v4, [Ljava/lang/String;

    check-cast v3, Landroid/view/View;

    check-cast v2, Landroid/content/Context;

    aget-object p2, v4, p2

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v4, -0x150cfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, LNx;->e(Ljava/lang/String;Ljava/lang/String;)V

    instance-of v0, v3, LyA;

    if-eqz v0, :cond_7

    check-cast v3, LyA;

    invoke-virtual {v3, p2}, LyA;->setValue(Ljava/lang/String;)V

    :cond_7
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    const-wide v3, -0x152dfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

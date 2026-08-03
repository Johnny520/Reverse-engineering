.class public final synthetic La/da;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/ra;


# direct methods
.method public synthetic constructor <init>(La/ra;I)V
    .locals 0

    iput p2, p0, La/da;->a:I

    iput-object p1, p0, La/da;->b:La/ra;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 14

    iget v0, p0, La/da;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, La/m0;->a:La/m0;

    iget-object v1, p0, La/da;->b:La/ra;

    iget-object v1, v1, La/ra;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-boolean v0, La/m0;->c:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, La/m0;->c(Landroid/app/Activity;)V

    :goto_0
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_0
    iget-object v0, p0, La/da;->b:La/ra;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, v0, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v2, "\u91cd\u542f\u5fae\u4fe1"

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-string v2, "\u5c06\u5173\u95ed\u5e76\u91cd\u65b0\u542f\u52a8\u5fae\u4fe1\u3002"

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    new-instance v2, La/pa;

    const/4 v3, 0x4

    invoke-direct {v2, v0, v3}, La/pa;-><init>(La/ra;I)V

    const-string v3, "\u7acb\u5373\u91cd\u542f"

    invoke-virtual {v1, v3, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-string v2, "\u53d6\u6d88"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    invoke-virtual {v0, v1}, La/ra;->o(Landroid/app/AlertDialog;)V

    :cond_1
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, La/da;->b:La/ra;

    iget-object v2, v1, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v2, "\u786e\u8ba4\u6e05\u7a7a"

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v2, "\u5c06\u6e05\u7a7a\u5168\u90e8\u5f00\u5173\u9009\u9879\u3001\u914d\u7f6e\u540d\u5355\u3001\u5df2\u9690\u85cf\u670b\u53cb\u5708\u3001\u62e6\u622a\u8bb0\u5f55\u4e0e\u89e3\u6790\u7f13\u5b58\uff0c\u968f\u540e\u91cd\u542f\u5fae\u4fe1\u3002\n\n\u6ce8\u610f\uff1a\u4ec5\u91cd\u542f\u4e3b\u8fdb\u7a0b\uff0c\u5fae\u4fe1\u540e\u53f0\u8fdb\u7a0b\u53ef\u80fd\u6b8b\u7559\u65e7\u914d\u7f6e\uff0c\u5efa\u8bae\u91cd\u542f\u540e\u624b\u52a8\u7ed3\u675f\u5fae\u4fe1\u5168\u90e8\u540e\u53f0\u8fdb\u7a0b\u6216\u91cd\u542f\u624b\u673a\u3002"

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v2, La/pa;

    const/4 v3, 0x5

    invoke-direct {v2, v1, v3}, La/pa;-><init>(La/ra;I)V

    const-string v3, "\u786e\u8ba4\u6e05\u7a7a\u5e76\u91cd\u542f"

    invoke-virtual {v0, v3, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v2, "\u53d6\u6d88"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    invoke-virtual {v1, v0}, La/ra;->o(Landroid/app/AlertDialog;)V

    :cond_2
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_2
    iget-object v0, p0, La/da;->b:La/ra;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La/w1;->g:Ljava/lang/ClassLoader;

    if-nez v1, :cond_3

    const-string v1, "[SimulateHotUpdate] ClassLoader not ready"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->e([Ljava/lang/Object;)V

    iget-object v0, v0, La/ra;->a:Landroid/app/Activity;

    const-string v1, "ClassLoader \u672a\u5c31\u7eea"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_1

    :cond_3
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, La/P0;

    const/16 v4, 0xa

    invoke-direct {v3, v0, v4, v1}, La/P0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    :goto_1
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_3
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, La/da;->b:La/ra;

    iget-object v2, v1, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v2, "\u786e\u8ba4\u6e05\u96f6"

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v2, "\u6e05\u96f6\u70ed\u66f4\u65b0\u62e6\u622a\u7edf\u8ba1\u6570\u636e\uff1f"

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v2, La/pa;

    const/4 v3, 0x3

    invoke-direct {v2, v1, v3}, La/pa;-><init>(La/ra;I)V

    const-string v3, "\u786e\u8ba4"

    invoke-virtual {v0, v3, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v2, "\u53d6\u6d88"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    invoke-virtual {v1, v0}, La/ra;->o(Landroid/app/AlertDialog;)V

    :cond_4
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_4
    iget-object v0, p0, La/da;->b:La/ra;

    invoke-virtual {v0}, La/ra;->m()V

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_5
    iget-object v0, p0, La/da;->b:La/ra;

    invoke-virtual {v0}, La/ra;->e()V

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_6
    iget-object v0, p0, La/da;->b:La/ra;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, v0, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v2, "\u9690\u85cf\u670b\u53cb\u5708\u6559\u7a0b"

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-string v2, "1. \u5f00\u542f\u300c\u9690\u85cf\u6211\u7684\u670b\u53cb\u5708\u300d\n2. \u8fdb\u5165\u81ea\u5df1\u670b\u53cb\u5708\u76f8\u518c\n3. \u957f\u6309\u4efb\u610f\u670b\u53cb\u5708\u9876\u90e8\u300c\u8be6\u60c5\u300d2\u79d2\n4. \u70b9\u51fb\u300c\u52a0\u5165\u9690\u85cf\u300d\u6216\u300c\u590d\u5236\u300dsnsId"

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-string v2, "\u77e5\u9053\u4e86"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    invoke-virtual {v0, v1}, La/ra;->o(Landroid/app/AlertDialog;)V

    :cond_5
    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_7
    iget-object v0, p0, La/da;->b:La/ra;

    invoke-virtual {v0}, La/ra;->f()V

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_8
    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    new-instance v1, La/ra$b;

    new-instance v0, La/fa;

    iget-object v2, p0, La/da;->b:La/ra;

    const/4 v3, 0x5

    invoke-direct {v0, v2, v3}, La/fa;-><init>(La/ra;I)V

    const-string v3, "\u57fa\u7840\u8bbe\u7f6e"

    const-string v4, "\u603b\u5f00\u5173\u3001\u914d\u7f6e\u540d\u5355"

    invoke-direct {v1, v3, v4, v0}, La/ra$b;-><init>(Ljava/lang/String;Ljava/lang/String;La/H7;)V

    move-object v0, v2

    new-instance v2, La/ra$b;

    new-instance v3, La/fa;

    const/4 v4, 0x7

    invoke-direct {v3, v0, v4}, La/fa;-><init>(La/ra;I)V

    const-string v4, "\u5217\u8868\u9690\u85cf"

    const-string v5, "\u4f1a\u8bdd\u3001\u901a\u8baf\u5f55\u3001\u6807\u7b7e"

    invoke-direct {v2, v4, v5, v3}, La/ra$b;-><init>(Ljava/lang/String;Ljava/lang/String;La/H7;)V

    new-instance v3, La/ra$b;

    new-instance v4, La/fa;

    const/16 v5, 0x8

    invoke-direct {v4, v0, v5}, La/fa;-><init>(La/ra;I)V

    const-string v5, "\u641c\u7d22"

    const-string v6, "\u4e3b\u9875\u641c\u7d22\u8fc7\u6ee4"

    invoke-direct {v3, v5, v6, v4}, La/ra$b;-><init>(Ljava/lang/String;Ljava/lang/String;La/H7;)V

    new-instance v4, La/ra$b;

    new-instance v5, La/fa;

    const/16 v6, 0x9

    invoke-direct {v5, v0, v6}, La/fa;-><init>(La/ra;I)V

    const-string v6, "\u8bbf\u95ee\u62e6\u622a"

    const-string v7, "\u804a\u5929\u3001\u8d44\u6599\u9875"

    invoke-direct {v4, v6, v7, v5}, La/ra$b;-><init>(Ljava/lang/String;Ljava/lang/String;La/H7;)V

    new-instance v5, La/ra$b;

    new-instance v6, La/fa;

    const/16 v7, 0xa

    invoke-direct {v6, v0, v7}, La/fa;-><init>(La/ra;I)V

    const-string v7, "\u793e\u4ea4\u9690\u85cf"

    const-string v8, "\u670b\u53cb\u5708\u3001\u53d1\u73b0\u9875\u3001\u8f6c\u53d1"

    invoke-direct {v5, v7, v8, v6}, La/ra$b;-><init>(Ljava/lang/String;Ljava/lang/String;La/H7;)V

    new-instance v6, La/ra$b;

    new-instance v7, La/fa;

    const/4 v8, 0x0

    invoke-direct {v7, v0, v8}, La/fa;-><init>(La/ra;I)V

    const-string v8, "\u6d88\u606f\u4e0e\u901a\u77e5"

    const-string v9, "\u514d\u6253\u6270\u3001\u9707\u52a8\u3001\u52a0\u7c97\u3001\u5706\u70b9"

    invoke-direct {v6, v8, v9, v7}, La/ra$b;-><init>(Ljava/lang/String;Ljava/lang/String;La/H7;)V

    new-instance v7, La/ra$b;

    new-instance v8, La/fa;

    const/4 v9, 0x1

    invoke-direct {v8, v0, v9}, La/fa;-><init>(La/ra;I)V

    const-string v9, "\u4e34\u65f6\u89e3\u9664\u4e0e\u6062\u590d"

    const-string v10, "\u591a\u51fb\u3001\u957f\u6309\u3001\u6062\u590d\u9690\u85cf"

    invoke-direct {v7, v9, v10, v8}, La/ra$b;-><init>(Ljava/lang/String;Ljava/lang/String;La/H7;)V

    new-instance v8, La/ra$b;

    new-instance v9, La/fa;

    const/4 v10, 0x2

    invoke-direct {v9, v0, v10}, La/fa;-><init>(La/ra;I)V

    const-string v10, "\u6dfb\u52a0\u5bc6\u53cb"

    const-string v11, "\u957f\u6309\u6dfb\u52a0\u83dc\u5355"

    invoke-direct {v8, v10, v11, v9}, La/ra$b;-><init>(Ljava/lang/String;Ljava/lang/String;La/H7;)V

    new-instance v9, La/ra$b;

    new-instance v10, La/fa;

    const/4 v11, 0x3

    invoke-direct {v10, v0, v11}, La/fa;-><init>(La/ra;I)V

    const-string v11, "\u63d0\u793a\u81ea\u5b9a\u4e49"

    const-string v12, "\u64cd\u4f5c\u63d0\u793a\u5f00\u5173\u4e0e\u6587\u5b57"

    invoke-direct {v9, v11, v12, v10}, La/ra$b;-><init>(Ljava/lang/String;Ljava/lang/String;La/H7;)V

    new-instance v10, La/ra$b;

    new-instance v11, La/fa;

    const/4 v12, 0x4

    invoke-direct {v11, v0, v12}, La/fa;-><init>(La/ra;I)V

    const-string v12, "\u6307\u4ee4\u4e0e\u9002\u914d"

    const-string v13, "\u641c\u7d22\u6307\u4ee4\u3001DexKit"

    invoke-direct {v10, v12, v13, v11}, La/ra$b;-><init>(Ljava/lang/String;Ljava/lang/String;La/H7;)V

    new-instance v11, La/ra$b;

    new-instance v12, La/fa;

    const/4 v13, 0x6

    invoke-direct {v12, v0, v13}, La/fa;-><init>(La/ra;I)V

    const-string v0, "\u5f00\u53d1\u8005"

    const-string v13, "\u6570\u636e\u5e93\u3001\u91cd\u542f"

    invoke-direct {v11, v0, v13, v12}, La/ra$b;-><init>(Ljava/lang/String;Ljava/lang/String;La/H7;)V

    filled-new-array/range {v1 .. v11}, [La/ra$b;

    move-result-object v0

    invoke-static {v0}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

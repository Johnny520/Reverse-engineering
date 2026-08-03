.class public final synthetic La/fa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/H7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/ra;


# direct methods
.method public synthetic constructor <init>(La/ra;I)V
    .locals 0

    iput p2, p0, La/fa;->a:I

    iput-object p1, p0, La/fa;->b:La/ra;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    const/16 v6, 0xa

    const/16 v9, 0x9

    const/16 v10, 0x8

    const/4 v11, 0x7

    const/4 v12, 0x6

    const/4 v13, 0x5

    const/4 v14, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x4

    iget-object v2, v0, La/fa;->b:La/ra;

    const-string v3, "o"

    const-string v4, "p"

    iget v5, v0, La/fa;->a:I

    packed-switch v5, :pswitch_data_0

    move-object/from16 v5, p1

    check-cast v5, Landroid/widget/LinearLayout;

    move-object/from16 v1, p2

    check-cast v1, La/jc;

    invoke-static {v5, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v3, v1, La/jc;->f:Z

    new-instance v4, La/ka;

    invoke-direct {v4, v1, v2, v7}, La/ka;-><init>(La/jc;La/ra;I)V

    const-string v7, "\u9690\u85cf\u670b\u53cb\u5708\u5165\u53e3"

    const-string v15, "\u9690\u85cf\u5bc6\u53cb\u8d44\u6599\u9875\u670b\u53cb\u5708\u5165\u53e3\u53ca\u65f6\u95f4\u7ebf\u4e2d\u5bc6\u53cb\u52a8\u6001"

    invoke-virtual {v2, v7, v15, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v1, La/jc;->g:Z

    new-instance v4, La/ka;

    invoke-direct {v4, v1, v2, v14}, La/ka;-><init>(La/jc;La/ra;I)V

    const-string v7, "\u9690\u85cf\u53d1\u73b0\u9875\u670b\u53cb\u5708\u5165\u53e3"

    const-string v15, "\u9690\u85cf\u53d1\u73b0\u9875\u4e2d\u7684\u670b\u53cb\u5708\u5165\u53e3"

    invoke-virtual {v2, v7, v15, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v1, La/jc;->h:Z

    new-instance v4, La/ka;

    invoke-direct {v4, v1, v2, v8}, La/ka;-><init>(La/jc;La/ra;I)V

    const-string v7, "\u9690\u85cf\u53d1\u73b0\u9875\u5165\u53e3"

    const-string v8, "\u9690\u85cf\u89c6\u9891\u53f7/\u770b\u4e00\u770b/\u5c0f\u7a0b\u5e8f\u5165\u53e3"

    invoke-virtual {v2, v7, v8, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v1, La/jc;->i:Z

    new-instance v4, La/ka;

    invoke-direct {v4, v1, v2, v13}, La/ka;-><init>(La/jc;La/ra;I)V

    const-string v7, "\u9690\u85cf\u6700\u8fd1\u8f6c\u53d1"

    const-string v8, "\u6700\u8fd1\u8f6c\u53d1\u5217\u8868\u4e0d\u663e\u793a\u5bc6\u53cb"

    invoke-virtual {v2, v7, v8, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v1, La/jc;->j:Z

    new-instance v4, La/ka;

    invoke-direct {v4, v1, v2, v12}, La/ka;-><init>(La/jc;La/ra;I)V

    const-string v7, "\u9690\u85cf\u6211\u7684\u670b\u53cb\u5708"

    const-string v8, "\u6309\u9700\u9690\u85cf\u81ea\u5df1\u7684\u670b\u53cb\u5708"

    invoke-virtual {v2, v7, v8, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v1, La/jc;->k:Z

    new-instance v4, La/ka;

    invoke-direct {v4, v1, v2, v11}, La/ka;-><init>(La/jc;La/ra;I)V

    const-string v7, "\u9690\u85cf\u63d0\u793a\u5f39\u7a97"

    const-string v8, "\u957f\u6309\u81ea\u5df1\u670b\u53cb\u5708\u65f6\u5f39\u51fa\u63d0\u793a\u6846"

    invoke-virtual {v2, v7, v8, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v1, La/jc;->l:Z

    new-instance v4, La/ka;

    invoke-direct {v4, v1, v2, v10}, La/ka;-><init>(La/jc;La/ra;I)V

    const-string v7, "\u9690\u85cf\u670b\u53cb\u5708\u4e92\u52a8"

    const-string v8, "\u9690\u85cf\u5bc6\u53cb\u7684\u70b9\u8d5e/\u8bc4\u8bba"

    invoke-virtual {v2, v7, v8, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v1, La/jc;->m:Z

    new-instance v4, La/ka;

    invoke-direct {v4, v1, v2, v9}, La/ka;-><init>(La/jc;La/ra;I)V

    const-string v7, "\u9690\u85cf\u5206\u7ec4\u56fe\u6807"

    const-string v8, "\u9690\u85cf\u5bc6\u53cb\u670b\u53cb\u5708\u7684\u5206\u7ec4\u56fe\u6807"

    invoke-virtual {v2, v7, v8, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v1, La/jc;->E:Z

    new-instance v4, La/ka;

    invoke-direct {v4, v1, v2, v6}, La/ka;-><init>(La/jc;La/ra;I)V

    const-string v6, "\u9690\u85cf\u72b6\u6001\u9875\u5bc6\u53cb"

    const-string v7, "\u72b6\u6001\u9875\u4e0d\u663e\u793a\u5bc6\u53cb\u5185\u5bb9"

    invoke-virtual {v2, v6, v7, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, La/da;

    invoke-direct {v3, v2, v14}, La/da;-><init>(La/ra;I)V

    const-string v4, "\u7ba1\u7406\u5df2\u9690\u85cf\u7684\u670b\u53cb\u5708"

    invoke-virtual {v2, v4, v3}, La/ra;->a(Ljava/lang/String;La/s7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, La/da;

    const/4 v4, 0x2

    invoke-direct {v3, v2, v4}, La/da;-><init>(La/ra;I)V

    const-string v4, "\u9690\u85cf\u670b\u53cb\u5708\u6559\u7a0b"

    invoke-virtual {v2, v4, v3}, La/ra;->a(Ljava/lang/String;La/s7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v1, La/jc;->d:Z

    new-instance v4, La/ka;

    const/4 v6, 0x1

    invoke-direct {v4, v1, v2, v6}, La/ka;-><init>(La/jc;La/ra;I)V

    const-string v6, "\u9690\u85cf\u5b58\u50a8\u7a7a\u95f4\u804a\u5929\u8bb0\u5f55"

    const-string v7, "\u5b58\u50a8\u7a7a\u95f4\u9875\u9762\u9690\u85cf\u804a\u5929\u8bb0\u5f55\u6574\u6761\u76ee\u5f55"

    invoke-virtual {v2, v6, v7, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v1, La/jc;->e:Z

    new-instance v4, La/ka;

    const/4 v6, 0x2

    invoke-direct {v4, v1, v2, v6}, La/ka;-><init>(La/jc;La/ra;I)V

    const-string v1, "\u9690\u85cf\u5b58\u50a8\u7a7a\u95f4\u7f13\u5b58"

    const-string v6, "\u5b58\u50a8\u7a7a\u95f4\u9875\u9762\u4e0d\u663e\u793a\u7f13\u5b58\u6761\u76ee"

    invoke-virtual {v2, v1, v6, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v1, La/Wf;->a:La/Wf;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroid/widget/LinearLayout;

    move-object/from16 v5, p2

    check-cast v5, La/jc;

    invoke-static {v1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v3, v5, La/jc;->s:Z

    new-instance v4, La/ha;

    const/16 v6, 0xd

    invoke-direct {v4, v5, v2, v6}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v6, "\u7981\u6b62\u8fdb\u5165\u804a\u5929"

    const-string v8, "\u7981\u6b62\u8fdb\u5165\u5bc6\u53cb\u804a\u5929\u754c\u9762"

    invoke-virtual {v2, v6, v8, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/Switch;

    iget-object v4, v2, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v3, v4}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    iget-boolean v4, v5, La/jc;->t:Z

    if-eqz v4, :cond_0

    invoke-static {}, La/x8;->a()Z

    move-result v4

    if-nez v4, :cond_0

    const/4 v7, 0x1

    :cond_0
    invoke-virtual {v3, v7}, Landroid/widget/Switch;->setChecked(Z)V

    iput-object v3, v2, La/ra;->h:Landroid/widget/Switch;

    new-instance v4, La/ha;

    invoke-direct {v4, v2, v5}, La/ha;-><init>(La/ra;La/jc;)V

    const-string v5, "\u7981\u6b62\u67e5\u770b\u8d44\u6599"

    const-string v6, "\u7981\u6b62\u8fdb\u5165\u8054\u7cfb\u4eba\u8d44\u6599\u9875"

    invoke-virtual {v2, v5, v6, v3, v4}, La/ra;->p(Ljava/lang/String;Ljava/lang/String;Landroid/widget/Switch;La/D7;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v1, La/Wf;->a:La/Wf;

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Landroid/widget/LinearLayout;

    move-object/from16 v5, p2

    check-cast v5, La/jc;

    invoke-static {v1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v3, v5, La/jc;->a:Z

    new-instance v4, La/ha;

    const/16 v6, 0x13

    invoke-direct {v4, v5, v2, v6}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v5, "\u9690\u85cf\u4e3b\u9875\u641c\u7d22"

    const-string v6, "\u4e3b\u9875\u641c\u7d22\u4e0d\u663e\u793a\u5bc6\u53cb\u7ed3\u679c"

    invoke-virtual {v2, v5, v6, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v1, La/Wf;->a:La/Wf;

    return-object v1

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Landroid/widget/LinearLayout;

    move-object/from16 v5, p2

    check-cast v5, La/jc;

    invoke-static {v1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v3, v5, La/jc;->q:Z

    new-instance v4, La/ha;

    const/16 v6, 0xf

    invoke-direct {v4, v5, v2, v6}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v6, "\u4e0d\u663e\u793a\u8be5\u804a\u5929"

    const-string v7, "\u5fae\u4fe1\u539f\u751f\u673a\u5236\uff0c\u72ec\u7acb\u4e8e\u603b\u5f00\u5173"

    invoke-virtual {v2, v6, v7, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v5, La/jc;->n:Z

    new-instance v4, La/ha;

    const/16 v6, 0x10

    invoke-direct {v4, v5, v2, v6}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v6, "\u4e3b\u9875\u4f1a\u8bdd\u9690\u85cf"

    const-string v7, "\u9690\u85cf\u4e3b\u9875\u4f1a\u8bdd\u4e2d\u7684\u5bc6\u53cb"

    invoke-virtual {v2, v6, v7, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v5, La/jc;->o:Z

    new-instance v4, La/ha;

    const/16 v6, 0x11

    invoke-direct {v4, v5, v2, v6}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v6, "\u901a\u8baf\u5f55\u9690\u85cf"

    const-string v7, "\u9690\u85cf\u901a\u8baf\u5f55\u5217\u8868\u4e2d\u7684\u5bc6\u53cb"

    invoke-virtual {v2, v6, v7, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v5, La/jc;->p:Z

    new-instance v4, La/ha;

    const/16 v6, 0x12

    invoke-direct {v4, v5, v2, v6}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v5, "\u6807\u7b7e\u5185\u9690\u85cf"

    const-string v6, "\u9690\u85cf\u6807\u7b7e\u6210\u5458\u53ca\u8c01\u53ef\u4ee5\u770b\u9009\u62e9\u5668\u4e2d\u7684\u5bc6\u53cb"

    invoke-virtual {v2, v5, v6, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v1, La/Wf;->a:La/Wf;

    return-object v1

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Landroid/widget/LinearLayout;

    move-object/from16 v5, p2

    check-cast v5, La/jc;

    invoke-static {v1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v3, v5, La/jc;->c:Z

    new-instance v4, La/ka;

    const/16 v6, 0xb

    invoke-direct {v4, v5, v2, v6}, La/ka;-><init>(La/jc;La/ra;I)V

    const-string v5, "\u6570\u636e\u5e93"

    const-string v6, "\u7f13\u5b58\u5fae\u4fe1\u6570\u636e\u5e93\uff08\u5f00\u53d1\u8005\u7528\uff09"

    invoke-virtual {v2, v5, v6, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, La/da;

    invoke-direct {v3, v2, v8}, La/da;-><init>(La/ra;I)V

    const-string v4, "\u7248\u672c\u8be6\u60c5"

    invoke-virtual {v2, v4, v3}, La/ra;->a(Ljava/lang/String;La/s7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, La/da;

    invoke-direct {v3, v2, v13}, La/da;-><init>(La/ra;I)V

    const-string v4, "\u6e05\u96f6\u62e6\u622a\u8bb0\u5f55"

    invoke-virtual {v2, v4, v3}, La/ra;->a(Ljava/lang/String;La/s7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, La/da;

    invoke-direct {v3, v2, v12}, La/da;-><init>(La/ra;I)V

    const-string v4, "\u6a21\u62df\u70ed\u66f4\u65b0"

    invoke-virtual {v2, v4, v3}, La/ra;->a(Ljava/lang/String;La/s7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, La/da;

    invoke-direct {v3, v2, v11}, La/da;-><init>(La/ra;I)V

    new-instance v4, Landroid/widget/TextView;

    iget-object v5, v2, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v5, "\u6e05\u7a7a\u6240\u6709\u914d\u7f6e"

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41600000    # 14.0f

    const/4 v6, 0x2

    invoke-virtual {v4, v6, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v5, v2, La/ra;->b:La/ra$a;

    iget v6, v5, La/ra$a;->h:I

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v6, 0x11

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setGravity(I)V

    const/16 v6, 0xe

    invoke-virtual {v2, v6}, La/ra;->b(I)I

    move-result v9

    invoke-virtual {v2, v6}, La/ra;->b(I)I

    move-result v11

    invoke-virtual {v2, v6}, La/ra;->b(I)I

    move-result v12

    invoke-virtual {v2, v6}, La/ra;->b(I)I

    move-result v6

    invoke-virtual {v4, v9, v11, v12, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget v5, v5, La/ra$a;->h:I

    const/4 v9, 0x1

    invoke-virtual {v6, v9, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    const/16 v5, 0xc

    invoke-virtual {v2, v5}, La/ra;->b(I)I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v6, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v6, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-virtual {v4, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, -0x1

    const/4 v9, -0x2

    invoke-direct {v5, v6, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v8}, La/ra;->b(I)I

    move-result v6

    invoke-virtual {v2, v8}, La/ra;->b(I)I

    move-result v9

    invoke-virtual {v5, v7, v6, v7, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, La/h3;

    invoke-direct {v5, v8, v3}, La/h3;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, La/da;

    invoke-direct {v3, v2, v10}, La/da;-><init>(La/ra;I)V

    const-string v4, "\u91cd\u542f\u5fae\u4fe1"

    invoke-virtual {v2, v4, v3}, La/ra;->a(Ljava/lang/String;La/s7;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v1, La/Wf;->a:La/Wf;

    return-object v1

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, Landroid/widget/LinearLayout;

    move-object/from16 v5, p2

    check-cast v5, La/jc;

    invoke-static {v1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v3, v5, La/jc;->L:Z

    new-instance v4, La/ha;

    invoke-direct {v4, v5, v2, v7}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v5, "\u542f\u7528\u6a21\u5757"

    const-string v6, "\u5173\u95ed\u540e\u6240\u6709\u529f\u80fd\u5747\u4e0d\u751f\u6548"

    invoke-virtual {v2, v5, v6, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, La/da;

    const/4 v6, 0x1

    invoke-direct {v3, v2, v6}, La/da;-><init>(La/ra;I)V

    const-string v4, "\u914d\u7f6e\u540d\u5355"

    invoke-virtual {v2, v4, v3}, La/ra;->a(Ljava/lang/String;La/s7;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v1, La/Wf;->a:La/Wf;

    return-object v1

    :pswitch_5
    move-object/from16 v1, p1

    check-cast v1, Landroid/widget/LinearLayout;

    move-object/from16 v5, p2

    check-cast v5, La/jc;

    invoke-static {v1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Landroid/widget/Switch;

    iget-object v4, v2, La/ra;->a:Landroid/app/Activity;

    invoke-direct {v3, v4}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x1

    invoke-virtual {v3, v6}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-virtual {v3, v7}, Landroid/view/View;->setEnabled(Z)V

    sget-object v4, La/Wf;->a:La/Wf;

    new-instance v4, La/O8;

    const/16 v6, 0xe

    invoke-direct {v4, v6}, La/O8;-><init>(I)V

    const-string v6, "\u6253\u5f00\u8bbe\u7f6e\u6307\u4ee4"

    const-string v7, "\u56fa\u5b9a\u5f00\u542f\uff1a\u603b\u5f00\u5173\u5173\u95ed\u540e\u4ecd\u53ef\u901a\u8fc7\u6307\u4ee4\u8fdb\u5165\u8bbe\u7f6e\uff08\u4ec5\u53ef\u81ea\u5b9a\u4e49\u6307\u4ee4\u5185\u5bb9\uff09"

    invoke-virtual {v2, v6, v7, v3, v4}, La/ra;->p(Ljava/lang/String;Ljava/lang/String;Landroid/widget/Switch;La/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v3, v5, La/jc;->P:Ljava/lang/String;

    new-instance v4, La/ka;

    const/16 v6, 0xf

    invoke-direct {v4, v5, v2, v6}, La/ka;-><init>(La/jc;La/ra;I)V

    const-string v6, "\u6253\u5f00\u8bbe\u7f6e\u6307\u4ee4\u5185\u5bb9"

    const/4 v7, 0x1

    invoke-virtual {v2, v6, v3, v7, v4}, La/ra;->d(Ljava/lang/String;Ljava/lang/String;ILa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v3, v5, La/jc;->Q:Ljava/lang/String;

    new-instance v4, La/ka;

    const/16 v6, 0x10

    invoke-direct {v4, v5, v2, v6}, La/ka;-><init>(La/jc;La/ra;I)V

    const-string v5, "\u4e34\u65f6\u89e3\u9664\u6307\u4ee4"

    invoke-virtual {v2, v5, v3, v7, v4}, La/ra;->d(Ljava/lang/String;Ljava/lang/String;ILa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {}, La/a5;->f()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "DexKit \u7f13\u5b58\u5df2\u5c31\u7eea"

    goto :goto_0

    :cond_1
    const-string v3, "DexKit \u626b\u63cf\u5fae\u4fe1\u7c7b\u540d"

    :goto_0
    new-instance v4, La/da;

    invoke-direct {v4, v2, v9}, La/da;-><init>(La/ra;I)V

    invoke-virtual {v2, v3, v4}, La/ra;->a(Ljava/lang/String;La/s7;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v1, La/Wf;->a:La/Wf;

    return-object v1

    :pswitch_6
    move-object/from16 v1, p1

    check-cast v1, Landroid/widget/LinearLayout;

    move-object/from16 v5, p2

    check-cast v5, La/jc;

    invoke-static {v1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v3, v5, La/jc;->R:Z

    new-instance v4, La/ha;

    const/4 v6, 0x1

    invoke-direct {v4, v5, v2, v6}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v7, "\u64cd\u4f5c\u63d0\u793a"

    const-string v9, "\u5173\u95ed\u540e\u6240\u6709\u64cd\u4f5c\u5747\u4e0d\u5f39\u63d0\u793a\uff08\u9ed8\u8ba4\u5173\u95ed\uff09"

    invoke-virtual {v2, v7, v9, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v3, v5, La/jc;->S:Ljava/lang/String;

    new-instance v4, La/ha;

    const/4 v7, 0x2

    invoke-direct {v4, v5, v2, v7}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v7, "\u4e34\u65f6\u89e3\u9664\u63d0\u793a\u6587\u5b57"

    invoke-virtual {v2, v7, v3, v6, v4}, La/ra;->d(Ljava/lang/String;Ljava/lang/String;ILa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v3, v5, La/jc;->T:Ljava/lang/String;

    new-instance v4, La/ha;

    invoke-direct {v4, v5, v2, v14}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v7, "\u52a0\u5165\u5bc6\u53cb\u63d0\u793a\u6587\u5b57"

    invoke-virtual {v2, v7, v3, v6, v4}, La/ra;->d(Ljava/lang/String;Ljava/lang/String;ILa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v3, v5, La/jc;->U:Ljava/lang/String;

    new-instance v4, La/ha;

    invoke-direct {v4, v5, v2, v8}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v7, "\u53d6\u6d88\u5bc6\u53cb\u63d0\u793a\u6587\u5b57"

    invoke-virtual {v2, v7, v3, v6, v4}, La/ra;->d(Ljava/lang/String;Ljava/lang/String;ILa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v3, v5, La/jc;->V:Ljava/lang/String;

    new-instance v4, La/ha;

    invoke-direct {v4, v5, v2, v13}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v5, "\u670b\u53cb\u5708\u9690\u85cf\u63d0\u793a\u6587\u5b57"

    invoke-virtual {v2, v5, v3, v6, v4}, La/ra;->d(Ljava/lang/String;Ljava/lang/String;ILa/D7;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v1, La/Wf;->a:La/Wf;

    return-object v1

    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, Landroid/widget/LinearLayout;

    move-object/from16 v5, p2

    check-cast v5, La/jc;

    invoke-static {v1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v3, v5, La/jc;->A:Z

    new-instance v4, La/ka;

    const/16 v6, 0xc

    invoke-direct {v4, v5, v2, v6}, La/ka;-><init>(La/jc;La/ra;I)V

    const-string v6, "\u4f1a\u8bdd\u5217\u8868\u957f\u6309\u6dfb\u52a0"

    const-string v7, "\u4e3b\u9875\u4f1a\u8bdd\u5217\u8868\u957f\u6309\u5f39\u51fa\u52a0\u5165\u5bc6\u53cb\u83dc\u5355"

    invoke-virtual {v2, v6, v7, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v5, La/jc;->B:Z

    new-instance v4, La/ka;

    const/16 v6, 0xd

    invoke-direct {v4, v5, v2, v6}, La/ka;-><init>(La/jc;La/ra;I)V

    const-string v6, "\u901a\u8baf\u5f55\u957f\u6309\u6dfb\u52a0"

    const-string v7, "\u901a\u8baf\u5f55\u5217\u8868\u957f\u6309\u5f39\u51fa\u52a0\u5165\u5bc6\u53cb\u83dc\u5355"

    invoke-virtual {v2, v6, v7, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v3, v5, La/jc;->C:Ljava/lang/String;

    new-instance v4, La/ka;

    const/16 v6, 0xe

    invoke-direct {v4, v5, v2, v6}, La/ka;-><init>(La/jc;La/ra;I)V

    const-string v5, "\u83dc\u5355\u663e\u793a\u6587\u5b57"

    const/4 v6, 0x1

    invoke-virtual {v2, v5, v3, v6, v4}, La/ra;->d(Ljava/lang/String;Ljava/lang/String;ILa/D7;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v1, La/Wf;->a:La/Wf;

    return-object v1

    :pswitch_8
    move-object/from16 v1, p1

    check-cast v1, Landroid/widget/LinearLayout;

    move-object/from16 v5, p2

    check-cast v5, La/jc;

    invoke-static {v1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v3, v5, La/jc;->u:Z

    new-instance v4, La/ha;

    invoke-direct {v4, v5, v2, v12}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v7, "\u591a\u51fb\u6807\u9898\u89e3\u9664"

    const-string v8, "\u591a\u51fb\u5fae\u4fe1\u6807\u9898\u4e34\u65f6\u89e3\u9664\u9690\u85cf"

    invoke-virtual {v2, v7, v8, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget v3, v5, La/jc;->v:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, La/ha;

    invoke-direct {v4, v5, v2, v11}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v7, "\u591a\u51fb\u6b21\u6570"

    const/4 v8, 0x2

    invoke-virtual {v2, v7, v3, v8, v4}, La/ra;->d(Ljava/lang/String;Ljava/lang/String;ILa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget v3, v5, La/jc;->w:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, La/ha;

    invoke-direct {v4, v5, v2, v10}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v7, "\u591a\u51fb\u95f4\u9694\uff08\u6beb\u79d2\uff09"

    invoke-virtual {v2, v7, v3, v8, v4}, La/ra;->d(Ljava/lang/String;Ljava/lang/String;ILa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v5, La/jc;->x:Z

    new-instance v4, La/ha;

    invoke-direct {v4, v5, v2, v9}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v7, "\u957f\u6309\u6807\u9898\u89e3\u9664"

    const-string v8, "\u957f\u6309\u5fae\u4fe1\u6807\u9898\u4e34\u65f6\u89e3\u9664"

    invoke-virtual {v2, v7, v8, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget v3, v5, La/jc;->y:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, La/ha;

    invoke-direct {v4, v5, v2, v6}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v6, "\u957f\u6309\u89e6\u53d1\u65f6\u957f\uff08\u6beb\u79d2\uff09"

    const/4 v7, 0x2

    invoke-virtual {v2, v6, v3, v7, v4}, La/ra;->d(Ljava/lang/String;Ljava/lang/String;ILa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v5, La/jc;->N:Z

    new-instance v4, La/ha;

    const/16 v6, 0xb

    invoke-direct {v4, v5, v2, v6}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v6, "\u79bb\u5f00\u5bf9\u8bdd\u9690\u85cf"

    const-string v7, "\u8fdb\u5165\u5bc6\u53cb\u5bf9\u8bdd\u540e\u8fd4\u56de\u5373\u6062\u590d\u9690\u85cf"

    invoke-virtual {v2, v6, v7, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v5, La/jc;->O:Z

    new-instance v4, La/ha;

    const/16 v6, 0xc

    invoke-direct {v4, v5, v2, v6}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v5, "\u79bb\u5f00\u5fae\u4fe1\u9690\u85cf"

    const-string v6, "\u6309HOME\u79bb\u5f00\u5fae\u4fe1\u540e\u6062\u590d\u9690\u85cf"

    invoke-virtual {v2, v5, v6, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v1, La/Wf;->a:La/Wf;

    return-object v1

    :pswitch_9
    move-object/from16 v1, p1

    check-cast v1, Landroid/widget/LinearLayout;

    move-object/from16 v2, p2

    check-cast v2, La/jc;

    invoke-static {v1, v4}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v0, La/fa;->b:La/ra;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v3, v2, La/jc;->r:Z

    new-instance v4, La/ha;

    const/16 v5, 0x14

    invoke-direct {v4, v2, v9, v5}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v5, "\u9690\u85cf\u5bc6\u53cb\u6d88\u606f\u901a\u77e5"

    const-string v6, "\u5bc6\u53cb\u88ab\u9690\u85cf\u540e\u81ea\u52a8\u8bbe\u7f6e\u514d\u6253\u6270"

    invoke-virtual {v9, v5, v6, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v2, La/jc;->D:Z

    new-instance v4, La/ha;

    const/16 v5, 0x16

    invoke-direct {v4, v2, v9, v5}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v5, "\u963b\u6b62\u7535\u8bdd\u8bf7\u6c42"

    const-string v6, "\u62d2\u7edd\u5bc6\u53cb\u7684\u7535\u8bdd\u8054\u7cfb"

    invoke-virtual {v9, v5, v6, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v2, La/jc;->J:Z

    new-instance v4, La/ha;

    const/16 v5, 0x17

    invoke-direct {v4, v2, v9, v5}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v5, "\u5bc6\u53cb\u6d88\u606f\u9707\u52a8"

    const-string v6, "\u9690\u85cf\u72b6\u6001\u4e0b\u6536\u5230\u5bc6\u53cb\u6d88\u606f\u65f6\u9707\u52a8\u63d0\u793a"

    invoke-virtual {v9, v5, v6, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget v12, v2, La/jc;->K:I

    new-instance v13, La/ha;

    const/16 v3, 0x18

    invoke-direct {v13, v2, v9, v3}, La/ha;-><init>(La/jc;La/ra;I)V

    new-instance v14, La/A3;

    invoke-direct {v14, v8, v2}, La/A3;-><init>(ILjava/lang/Object;)V

    const-string v10, "\u9707\u52a8\u5f3a\u5ea6"

    const-string v11, "0=\u6781\u8f7b\uff0c100=\u8f83\u5f3a\uff0c\u9ed8\u8ba460"

    invoke-virtual/range {v9 .. v14}, La/ra;->j(Ljava/lang/String;Ljava/lang/String;ILa/D7;La/A3;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v2, La/jc;->F:Z

    new-instance v4, La/ha;

    const/16 v5, 0x19

    invoke-direct {v4, v2, v9, v5}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v5, "\u5e95\u680f\u5b57\u4f53\u52a0\u7c97"

    const-string v6, "\u6536\u5230\u5bc6\u53cb\u6d88\u606f\u65f6\u5e95\u90e8\u5bfc\u822a\u680f\u6587\u5b57\u52a0\u7c97\uff08\u5b9e\u9a8c\u529f\u80fd\uff1a\u6f8e\u6e43 OS \u4e0a\u6682\u65f6\u4e0d\u7a33\u5b9a\uff09"

    invoke-virtual {v9, v5, v6, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget v12, v2, La/jc;->G:I

    new-instance v13, La/ha;

    const/16 v3, 0x1a

    invoke-direct {v13, v2, v9, v3}, La/ha;-><init>(La/jc;La/ra;I)V

    const/4 v14, 0x0

    const-string v10, "\u52a0\u7c97\u5f3a\u5ea6"

    const-string v11, "0=\u6781\u7ec6\uff0c100=\u8f83\u7c97\uff0c\u9ed8\u8ba450"

    invoke-virtual/range {v9 .. v14}, La/ra;->j(Ljava/lang/String;Ljava/lang/String;ILa/D7;La/A3;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v2, La/jc;->H:Z

    new-instance v4, La/ha;

    const/16 v5, 0x1b

    invoke-direct {v4, v2, v9, v5}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v5, "\u5706\u70b9\u63d0\u793a"

    const-string v6, "\u6709\u5bc6\u53cb\u672a\u8bfb\u6d88\u606f\u65f6\u641c\u7d22\u6846\u65c1\u663e\u793a\u7ea2\u70b9\uff08\u5b9e\u9a8c\u529f\u80fd\uff1a\u6f8e\u6e43 OS \u4e0a\u6682\u65f6\u4e0d\u7a33\u5b9a\uff09"

    invoke-virtual {v9, v5, v6, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget v12, v2, La/jc;->I:I

    new-instance v13, La/ha;

    const/16 v3, 0x1c

    invoke-direct {v13, v2, v9, v3}, La/ha;-><init>(La/jc;La/ra;I)V

    const/4 v14, 0x0

    const-string v10, "\u5706\u70b9\u5927\u5c0f"

    const-string v11, "20%=\u6781\u5c0f\uff0c200%=\u8f83\u5927\uff0c\u9ed8\u8ba4100%"

    invoke-virtual/range {v9 .. v14}, La/ra;->j(Ljava/lang/String;Ljava/lang/String;ILa/D7;La/A3;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v2, La/jc;->z:Z

    new-instance v4, La/ha;

    const/16 v5, 0x1d

    invoke-direct {v4, v2, v9, v5}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v5, "\u62e6\u622a\u626b\u7801\u767b\u5f55"

    const-string v6, "\u62e6\u622a\u626b\u7801\u767b\u5f55\u786e\u8ba4\u5f39\u7a97"

    invoke-virtual {v9, v5, v6, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-boolean v3, v2, La/jc;->M:Z

    new-instance v4, La/ha;

    const/16 v5, 0x15

    invoke-direct {v4, v2, v9, v5}, La/ha;-><init>(La/jc;La/ra;I)V

    const-string v2, "\u5c4f\u853d\u5fae\u4fe1\u70ed\u66f4\u65b0"

    const-string v5, "\u963b\u6b62Tinker\u70ed\u8865\u4e01"

    invoke-virtual {v9, v2, v5, v3, v4}, La/ra;->q(Ljava/lang/String;Ljava/lang/String;ZLa/D7;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v1, La/Wf;->a:La/Wf;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
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

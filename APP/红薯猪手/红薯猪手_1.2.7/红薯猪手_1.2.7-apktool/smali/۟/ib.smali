.class public final synthetic L۟/ib;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥ:I

.field public final synthetic ۥ۟:Ljava/lang/Object;

.field public final synthetic ۥ۟۟:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p3, p0, L۟/ib;->ۥ:I

    iput-object p1, p0, L۟/ib;->ۥ۟:Ljava/lang/Object;

    iput-object p2, p0, L۟/ib;->ۥ۟۟:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, L۟/ib;->ۥ:I

    const/4 v2, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x4

    const/4 v7, 0x2

    const/16 v8, 0x8

    const/4 v9, 0x1

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_9

    :pswitch_0
    iget-object v1, v0, L۟/ib;->ۥ۟:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Ljava/lang/String;

    iget-object v1, v0, L۟/ib;->ۥ۟۟:Ljava/lang/Object;

    check-cast v1, Lorg/json/JSONObject;

    sget-object v3, L۟/f6;->ۥ۟ۨ:Ljava/util/ArrayList;

    const/4 v3, 0x5

    new-array v3, v3, [B

    .line 1
    fill-array-data v3, :array_0

    new-array v4, v2, [B

    fill-array-data v4, :array_1

    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v3, L۟/k8;->ۥۣ۟:L۟/k;

    invoke-static {}, L۟/k8$a;->ۥ()Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;

    move-result-object v3

    invoke-virtual {v3}, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;->ۥ۟ۧ()L۟/yb;

    move-result-object v3

    new-instance v4, L۟/j3;

    invoke-static {v10}, L۟/h4;->ۥ۟(Ljava/lang/Object;)V

    new-array v5, v2, [B

    fill-array-data v5, :array_2

    new-array v7, v2, [B

    fill-array-data v7, :array_3

    invoke-static {v5, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const/16 v5, 0xe

    new-array v7, v5, [B

    fill-array-data v7, :array_4

    new-array v9, v2, [B

    fill-array-data v9, :array_5

    invoke-static {v7, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v11}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v7, v8, [B

    fill-array-data v7, :array_6

    new-array v9, v2, [B

    fill-array-data v9, :array_7

    invoke-static {v7, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    new-array v7, v5, [B

    fill-array-data v7, :array_8

    new-array v9, v2, [B

    fill-array-data v9, :array_9

    invoke-static {v7, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v12}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v7, v2, [B

    fill-array-data v7, :array_a

    new-array v9, v2, [B

    fill-array-data v9, :array_b

    invoke-static {v7, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    new-array v7, v5, [B

    fill-array-data v7, :array_c

    new-array v9, v2, [B

    fill-array-data v9, :array_d

    invoke-static {v7, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v13}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v6, v6, [B

    fill-array-data v6, :array_e

    new-array v7, v2, [B

    fill-array-data v7, :array_f

    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    new-array v6, v5, [B

    fill-array-data v6, :array_10

    new-array v7, v2, [B

    fill-array-data v7, :array_11

    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v14}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v6, v8, [B

    fill-array-data v6, :array_12

    new-array v7, v2, [B

    fill-array-data v7, :array_13

    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    new-array v6, v5, [B

    fill-array-data v6, :array_14

    new-array v7, v2, [B

    fill-array-data v7, :array_15

    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v15}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    const/16 v6, 0xb

    new-array v6, v6, [B

    fill-array-data v6, :array_16

    new-array v7, v2, [B

    fill-array-data v7, :array_17

    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v5, v5, [B

    fill-array-data v5, :array_18

    new-array v2, v2, [B

    fill-array-data v2, :array_19

    invoke-static {v5, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    const-string v17, ""

    move-object v9, v4

    move-object/from16 v16, v1

    invoke-direct/range {v9 .. v19}, L۟/j3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    invoke-interface {v3, v4}, L۟/yb;->ۥ۟(L۟/j3;)J

    return-void

    .line 2
    :pswitch_1
    iget-object v1, v0, L۟/ib;->ۥ۟:Ljava/lang/Object;

    check-cast v1, Landroid/widget/FrameLayout;

    iget-object v3, v0, L۟/ib;->ۥ۟۟:Ljava/lang/Object;

    check-cast v3, Landroid/app/Activity;

    new-array v4, v6, [B

    .line 3
    fill-array-data v4, :array_1a

    new-array v2, v2, [B

    fill-array-data v2, :array_1b

    invoke-static {v4, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v2, L۟/v8;

    new-instance v4, L۟/l2;

    invoke-direct {v4, v3}, L۟/l2;-><init>(Landroid/app/Activity;)V

    invoke-direct {v2, v3, v4}, L۟/v8;-><init>(Landroid/app/Activity;L۟/f3;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    .line 4
    :pswitch_2
    iget-object v1, v0, L۟/ib;->ۥ۟:Ljava/lang/Object;

    check-cast v1, L۟/h2;

    iget-object v3, v0, L۟/ib;->ۥ۟۟:Ljava/lang/Object;

    check-cast v3, Landroid/app/Activity;

    new-array v4, v2, [B

    .line 5
    fill-array-data v4, :array_1c

    new-array v5, v2, [B

    fill-array-data v5, :array_1d

    invoke-static {v4, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v4, v8, [B

    fill-array-data v4, :array_1e

    new-array v2, v2, [B

    fill-array-data v2, :array_1f

    invoke-static {v4, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v1, v3}, L۟/h2;->ۥ۟۟(L۟/h2;Landroid/app/Activity;)V

    return-void

    .line 6
    :pswitch_3
    iget-object v1, v0, L۟/ib;->ۥ۟:Ljava/lang/Object;

    check-cast v1, Landroid/widget/LinearLayout;

    iget-object v4, v0, L۟/ib;->ۥ۟۟:Ljava/lang/Object;

    check-cast v4, L۟/z1;

    sget-object v5, L۟/z1;->ۥ۟:Ljava/lang/String;

    const/16 v5, 0xd

    new-array v5, v5, [B

    .line 7
    fill-array-data v5, :array_20

    new-array v6, v2, [B

    fill-array-data v6, :array_21

    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v5, v2, [B

    fill-array-data v5, :array_22

    new-array v6, v2, [B

    fill-array-data v6, :array_23

    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v1}, L۟/z1;->ۥ۟ۡ(Landroid/widget/LinearLayout;)Landroid/widget/TextView;

    move-result-object v4

    const/16 v5, 0x12

    new-array v5, v5, [B

    fill-array-data v5, :array_24

    new-array v6, v2, [B

    fill-array-data v6, :array_25

    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v5, L۟/y1;

    invoke-direct {v5, v1, v3}, L۟/y1;-><init>(Landroid/widget/LinearLayout;I)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1, v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    invoke-static {v1}, L۟/z1;->ۥ۟ۡ(Landroid/widget/LinearLayout;)Landroid/widget/TextView;

    move-result-object v3

    const/16 v4, 0xc

    new-array v4, v4, [B

    fill-array-data v4, :array_26

    new-array v2, v2, [B

    fill-array-data v2, :array_27

    invoke-static {v4, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x41800000    # 16.0f

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextSize(F)V

    sget-object v2, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v2, L۟/y1;

    invoke-direct {v2, v1, v9}, L۟/y1;-><init>(Landroid/widget/LinearLayout;I)V

    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    sub-int/2addr v2, v9

    invoke-virtual {v1, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void

    .line 8
    :pswitch_4
    iget-object v1, v0, L۟/ib;->ۥ۟:Ljava/lang/Object;

    check-cast v1, L۟/c5;

    iget-object v2, v0, L۟/ib;->ۥ۟۟:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    sget v3, L۟/c5;->ۥۡۧ:I

    const-string v3, "this$0"

    .line 9
    invoke-static {v3, v1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "$addr"

    invoke-static {v3, v2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, v1, L۟/c5;->ۥۡۦ:Landroid/webkit/WebView;

    if-eqz v1, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "javascript:searchAddr(\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\')"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v1, "mWebView"

    invoke-static {v1}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    throw v4

    .line 10
    :pswitch_5
    iget-object v1, v0, L۟/ib;->ۥ۟:Ljava/lang/Object;

    check-cast v1, Lcom/skyhand/redbookhelper/MainActivity;

    iget-object v4, v0, L۟/ib;->ۥ۟۟:Ljava/lang/Object;

    check-cast v4, L۟/o5;

    new-array v6, v2, [B

    .line 11
    fill-array-data v6, :array_28

    new-array v2, v2, [B

    fill-array-data v2, :array_29

    invoke-static {v6, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v2, Lcom/skyhand/redbookhelper/MainActivity;->ۥۣ۟:L۟/kb;

    .line 12
    iget-object v2, v4, L۟/o5;->ۥ۟۠:Ljava/lang/Boolean;

    .line 13
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v6}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 14
    iget-object v2, v1, Lcom/skyhand/redbookhelper/MainActivity;->ۥ۟۟:L۟/kb;

    invoke-virtual {v2}, L۟/kb;->ۥ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 15
    new-instance v6, L۟/xa;

    invoke-direct {v6, v9}, L۟/xa;-><init>(I)V

    invoke-virtual {v2, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f01000e

    invoke-virtual {v1, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    const v2, 0x7f01000d

    invoke-virtual {v1, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    new-instance v6, L۟/xa;

    invoke-direct {v6, v7}, L۟/xa;-><init>(I)V

    invoke-virtual {v2, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    :cond_1
    iget-object v2, v4, L۟/o5;->ۥ۟۟:Ljava/lang/String;

    .line 17
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const v2, 0x7f010009

    invoke-virtual {v1, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    sget v6, L۟/o;->ۥ:I

    .line 18
    iget-object v6, v4, L۟/o5;->ۥ۟۟:Ljava/lang/String;

    .line 19
    invoke-static {v6}, L۟/h4;->ۥ۟(Ljava/lang/Object;)V

    invoke-static {v6}, L۟/o;->ۥ۠۠(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v6

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v2, 0x7f010004

    invoke-virtual {v1, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 20
    :cond_2
    iget-object v2, v4, L۟/o5;->ۥ۟:L۟/o1;

    if-eqz v2, :cond_4

    .line 21
    iget-object v2, v2, L۟/o1;->ۥ۟ۧ:Ljava/lang/String;

    if-eqz v2, :cond_4

    .line 22
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_3

    move v2, v9

    goto :goto_0

    :cond_3
    move v2, v3

    :goto_0
    if-ne v2, v9, :cond_4

    move v2, v9

    goto :goto_1

    :cond_4
    move v2, v3

    :goto_1
    if-eqz v2, :cond_5

    const v2, 0x7f010007

    invoke-virtual {v1, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    new-instance v6, L۟/j5;

    invoke-direct {v6, v4, v3}, L۟/j5;-><init>(L۟/o5;I)V

    invoke-virtual {v2, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f010008

    invoke-virtual {v1, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    new-instance v6, L۟/j5;

    invoke-direct {v6, v4, v9}, L۟/j5;-><init>(L۟/o5;I)V

    invoke-virtual {v2, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    :cond_5
    iget-object v2, v4, L۟/o5;->ۥ۟:L۟/o1;

    if-eqz v2, :cond_7

    .line 24
    iget-object v2, v2, L۟/o1;->ۥ۟ۡ:Ljava/lang/String;

    if-eqz v2, :cond_7

    .line 25
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    move v2, v9

    goto :goto_2

    :cond_6
    move v2, v3

    :goto_2
    if-ne v2, v9, :cond_7

    goto :goto_3

    :cond_7
    move v9, v3

    :goto_3
    if-eqz v9, :cond_8

    const v2, 0x7f01000b

    invoke-virtual {v1, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v6, 0x7f01000a

    invoke-virtual {v1, v6}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    new-instance v3, L۟/j5;

    invoke-direct {v3, v4, v7}, L۟/j5;-><init>(L۟/o5;I)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v2, L۟/j5;

    invoke-direct {v2, v4, v5}, L۟/j5;-><init>(L۟/o5;I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_8
    return-void

    .line 26
    :pswitch_6
    iget-object v1, v0, L۟/ib;->ۥ۟:Ljava/lang/Object;

    check-cast v1, L۟/g3;

    iget-object v8, v0, L۟/ib;->ۥ۟۟:Ljava/lang/Object;

    check-cast v8, Lcom/skyhand/redbookhelper/MainActivity;

    sget-object v10, Lcom/skyhand/redbookhelper/MainActivity;->ۥۣ۟:L۟/kb;

    const/16 v10, 0x9

    new-array v11, v10, [B

    .line 27
    fill-array-data v11, :array_2a

    new-array v12, v2, [B

    fill-array-data v12, :array_2b

    invoke-static {v11, v12}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v11, v2, [B

    fill-array-data v11, :array_2c

    new-array v12, v2, [B

    fill-array-data v12, :array_2d

    invoke-static {v11, v12}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v8}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide/16 v11, 0x1f4

    invoke-static {v11, v12}, Ljava/lang/Thread;->sleep(J)V

    sget-object v11, L۟/h2;->ۥ۟:L۟/h2$a;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, L۟/h2$a;->ۥ۟()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, L۟/jb;->ۥ۟۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "adapter-26.json"

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v4, v2}, L۟/u6;->ۥ(Ljava/lang/String;L۟/g3;I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v12

    if-lez v12, :cond_9

    move v12, v9

    goto :goto_4

    :cond_9
    move v12, v3

    :goto_4
    if-eqz v12, :cond_a

    sget-object v12, L۟/a;->ۥ:Ljava/lang/String;

    const/16 v12, 0x10

    new-array v12, v12, [B

    fill-array-data v12, :array_2e

    new-array v13, v2, [B

    fill-array-data v13, :array_2f

    invoke-static {v12, v13}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, L۟/a;->ۥ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, L۟/jb;->ۥ۟۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    :cond_a
    new-array v12, v9, [B

    aput-byte v7, v12, v3

    new-array v13, v2, [B

    fill-array-data v13, :array_30

    invoke-static {v12, v13}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, L۟/ta;->ۥۡ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_10

    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, v11}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-array v11, v6, [B

    fill-array-data v11, :array_31

    new-array v12, v2, [B

    fill-array-data v12, :array_32

    invoke-static {v11, v12}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v11}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    if-eqz v11, :cond_b

    new-array v4, v9, [B

    const/16 v12, 0x5b

    aput-byte v12, v4, v3

    new-array v12, v2, [B

    fill-array-data v12, :array_33

    invoke-static {v4, v12}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_b
    if-nez v4, :cond_c

    goto :goto_5

    :cond_c
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v6, :cond_d

    new-array v3, v7, [B

    fill-array-data v3, :array_34

    new-array v2, v2, [B

    fill-array-data v2, :array_35

    invoke-static {v3, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    goto :goto_7

    :cond_d
    :goto_5
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v8}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v7

    new-array v8, v10, [B

    fill-array-data v8, :array_36

    new-array v10, v2, [B

    fill-array-data v10, :array_37

    invoke-static {v8, v10}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_e
    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    new-array v10, v6, [B

    fill-array-data v10, :array_38

    new-array v11, v2, [B

    fill-array-data v11, :array_39

    invoke-static {v10, v11}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v10}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_e

    invoke-static {v8}, L۟/h4;->ۥ۟(Ljava/lang/Object;)V

    new-array v10, v9, [B

    const/16 v11, 0x1d

    aput-byte v11, v10, v3

    new-array v11, v2, [B

    fill-array-data v11, :array_3a

    invoke-static {v10, v11}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v10

    const-string v11, ""

    invoke-static {v8, v10, v11}, L۟/ta;->ۥ۠ۨ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_f
    new-array v3, v5, [B

    fill-array-data v3, :array_3b

    new-array v2, v2, [B

    fill-array-data v2, :array_3c

    invoke-static {v3, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x3e

    move-object v3, v4

    move-object v4, v2

    invoke-static/range {v3 .. v8}, L۟/o0;->ۥ۠ۥ(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L۟/c$a;I)Ljava/lang/String;

    move-result-object v2

    :goto_7
    invoke-interface {v1, v2}, L۟/g3;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_10
    invoke-virtual {v8, v1}, Lcom/skyhand/redbookhelper/MainActivity;->ۥ۟(L۟/g3;)V

    :goto_8
    return-void

    .line 28
    :pswitch_7
    iget-object v1, v0, L۟/ib;->ۥ۟:Ljava/lang/Object;

    check-cast v1, L۟/gb;

    iget-object v3, v0, L۟/ib;->ۥ۟۟:Ljava/lang/Object;

    check-cast v3, Ljava/lang/CharSequence;

    const/16 v4, 0x14

    new-array v4, v4, [B

    .line 29
    fill-array-data v4, :array_3d

    new-array v2, v2, [B

    fill-array-data v2, :array_3e

    invoke-static {v4, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    iget-object v2, v1, L۟/gb;->ۥ۠ۦ:Landroid/widget/Button;

    .line 31
    invoke-virtual {v2, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 32
    iget-object v2, v1, L۟/gb;->ۥ۠ۥ:Landroid/widget/Button;

    .line 33
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_11

    .line 34
    iget-object v2, v1, L۟/gb;->ۥ۠ۥ:Landroid/widget/Button;

    .line 35
    invoke-virtual {v2, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 36
    :cond_11
    iget-object v1, v1, L۟/gb;->ۥ۠ۦ:Landroid/widget/Button;

    .line 37
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 38
    :goto_9
    iget-object v1, v0, L۟/ib;->ۥ۟:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v4, v0, L۟/ib;->ۥ۟۟:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    sget-object v6, L۟/w1;->ۥ:Ljava/lang/String;

    new-array v6, v8, [B

    .line 39
    fill-array-data v6, :array_3f

    new-array v7, v2, [B

    fill-array-data v7, :array_40

    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v6, v8, [B

    fill-array-data v6, :array_41

    new-array v7, v2, [B

    fill-array-data v7, :array_42

    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v5, v5, [B

    fill-array-data v5, :array_43

    new-array v6, v2, [B

    fill-array-data v6, :array_44

    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_15

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    new-array v7, v9, [B

    const/16 v8, 0x67

    aput-byte v8, v7, v3

    new-array v8, v2, [B

    fill-array-data v8, :array_45

    invoke-static {v7, v8}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, L۟/va;->ۥۡ۟(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_13

    new-array v7, v9, [B

    const/16 v8, -0x31

    aput-byte v8, v7, v3

    new-array v8, v2, [B

    fill-array-data v8, :array_46

    invoke-static {v7, v8}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v7

    .line 40
    invoke-static {v6, v7, v3, v3, v2}, L۟/va;->ۥۡۢ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v7

    const/4 v8, -0x1

    if-ne v7, v8, :cond_12

    goto :goto_b

    :cond_12
    invoke-virtual {v6, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v7, "substring(...)"

    invoke-static {v7, v6}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    :cond_13
    :goto_b
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_14
    sget-object v2, L۟/w1;->ۥ:Ljava/lang/String;

    invoke-static {v1, v5}, L۟/w1;->ۥ۟۠(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_c

    :cond_15
    sget-object v2, L۟/w1;->ۥ:Ljava/lang/String;

    invoke-static {v1, v4}, L۟/w1;->ۥ۟۠(Ljava/lang/String;Ljava/util/List;)V

    :goto_c
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :array_0
    .array-data 1
        -0x7at
        -0x31t
        -0x70t
        0x45t
        0x1dt
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x5et
        -0x5bt
        -0x1dt
        0x2at
        0x73t
        0x6bt
    .end array-data

    nop

    :array_2
    .array-data 1
        0x68t
        -0x1at
        -0x13t
        0x79t
        0x67t
        0x64t
    .end array-data

    nop

    :array_3
    .array-data 1
        0x1at
        -0x7dt
        -0x77t
        0x26t
        0xet
        0x0t
    .end array-data

    nop

    :array_4
    .array-data 1
        -0x2ct
        -0x6dt
        -0x5ct
        -0x64t
        0x3dt
        -0x4ct
        -0x2et
        -0x73t
        -0x49t
        -0x19t
        0x67t
        -0x18t
        -0x6bt
        -0x36t
    .end array-data

    nop

    :array_5
    .array-data 1
        -0x45t
        -0x1dt
        -0x30t
        -0x31t
        0x49t
        -0x3at
    .end array-data

    nop

    :array_6
    .array-data 1
        -0x57t
        0x2bt
        0x38t
        -0x2et
        0x10t
        0x5bt
        -0x56t
        0x27t
    .end array-data

    :array_7
    .array-data 1
        -0x39t
        0x42t
        0x5bt
        -0x47t
        0x7et
        0x3at
    .end array-data

    nop

    :array_8
    .array-data 1
        0x20t
        -0x7ct
        0x6bt
        0x33t
        -0x37t
        -0x26t
        0x26t
        -0x66t
        0x78t
        0x48t
        -0x6dt
        -0x7at
        0x61t
        -0x23t
    .end array-data

    nop

    :array_9
    .array-data 1
        0x4ft
        -0xct
        0x1ft
        0x60t
        -0x43t
        -0x58t
    .end array-data

    nop

    :array_a
    .array-data 1
        0xat
        0x3ft
        0x67t
        0x4ct
        -0x3ct
        -0x5at
    .end array-data

    nop

    :array_b
    .array-data 1
        0x63t
        0x52t
        0x6t
        0x2bt
        -0x5ft
        -0x2bt
    .end array-data

    nop

    :array_c
    .array-data 1
        0x3at
        -0x12t
        -0x7ft
        -0x30t
        -0x6bt
        -0x7bt
        0x3ct
        -0x10t
        -0x6et
        -0x55t
        -0x31t
        -0x27t
        0x7bt
        -0x49t
    .end array-data

    nop

    :array_d
    .array-data 1
        0x55t
        -0x62t
        -0xbt
        -0x7dt
        -0x1ft
        -0x9t
    .end array-data

    nop

    :array_e
    .array-data 1
        -0x73t
        -0x59t
        0x5et
        0x59t
    .end array-data

    :array_f
    .array-data 1
        -0x17t
        -0x3et
        0x2dt
        0x3at
        -0x3ct
        0x44t
    .end array-data

    nop

    :array_10
    .array-data 1
        -0x59t
        -0x77t
        0x58t
        -0x7ct
        0x6ct
        -0x55t
        -0x5ft
        -0x69t
        0x4bt
        -0x1t
        0x36t
        -0x9t
        -0x1at
        -0x30t
    .end array-data

    nop

    :array_11
    .array-data 1
        -0x38t
        -0x7t
        0x2ct
        -0x29t
        0x18t
        -0x27t
    .end array-data

    nop

    :array_12
    .array-data 1
        -0x75t
        0x68t
        -0x80t
        -0x3ft
        0x5et
        0x56t
        -0x78t
        0x69t
    .end array-data

    :array_13
    .array-data 1
        -0x19t
        0x7t
        -0x1dt
        -0x60t
        0x2at
        0x3ft
    .end array-data

    nop

    :array_14
    .array-data 1
        0x69t
        -0x5dt
        0x23t
        0x42t
        0x0t
        0x67t
        0x6ft
        -0x43t
        0x30t
        0x39t
        0x5at
        0x3bt
        0x28t
        -0x6t
    .end array-data

    nop

    :array_15
    .array-data 1
        0x6t
        -0x2dt
        0x57t
        0x11t
        0x74t
        0x15t
    .end array-data

    nop

    :array_16
    .array-data 1
        0x13t
        0x9t
        0x1bt
        0xdt
        -0x31t
        -0x58t
        0x1bt
        0xdt
        0x2dt
        0xet
        -0x32t
    .end array-data

    :array_17
    .array-data 1
        0x7at
        0x79t
        0x44t
        0x61t
        -0x60t
        -0x35t
    .end array-data

    nop

    :array_18
    .array-data 1
        -0x77t
        -0x71t
        -0x33t
        -0x41t
        -0x6ft
        -0x6t
        -0x71t
        -0x6ft
        -0x22t
        -0x3ct
        -0x35t
        -0x5at
        -0x38t
        -0x2at
    .end array-data

    nop

    :array_19
    .array-data 1
        -0x1at
        -0x1t
        -0x47t
        -0x14t
        -0x1bt
        -0x78t
    .end array-data

    nop

    :array_1a
    .array-data 1
        -0x70t
        0x54t
        0x6ct
        0x47t
    .end array-data

    :array_1b
    .array-data 1
        -0x4ct
        0x35t
        0xft
        0x33t
        -0x11t
        -0x47t
    .end array-data

    nop

    :array_1c
    .array-data 1
        0x7bt
        -0x4ct
        -0x28t
        -0x77t
        0x61t
        0x3et
    .end array-data

    nop

    :array_1d
    .array-data 1
        0xft
        -0x24t
        -0x4ft
        -0x6t
        0x45t
        0xet
    .end array-data

    nop

    :array_1e
    .array-data 1
        -0xct
        0x1t
        -0x80t
        -0x32t
        0x33t
        0x2at
        -0x58t
        0x16t
    .end array-data

    :array_1f
    .array-data 1
        -0x30t
        0x62t
        -0x11t
        -0x60t
        0x47t
        0x4ft
    .end array-data

    nop

    :array_20
    .array-data 1
        -0x35t
        0x3bt
        0x4ct
        0x1at
        0x67t
        -0x48t
        -0x63t
        0x1bt
        0x44t
        0xdt
        0x6dt
        -0x54t
        -0x65t
    .end array-data

    nop

    :array_21
    .array-data 1
        -0x11t
        0x57t
        0x25t
        0x74t
        0x2t
        -0x27t
    .end array-data

    nop

    :array_22
    .array-data 1
        -0x5ft
        -0x5dt
        -0x6at
        0x73t
        -0xet
        -0x50t
    .end array-data

    nop

    :array_23
    .array-data 1
        -0x2bt
        -0x35t
        -0x1t
        0x0t
        -0x2at
        -0x80t
    .end array-data

    nop

    :array_24
    .array-data 1
        0x4bt
        -0x50t
        -0x1t
        0x1t
        0x2at
        0xdt
        0x44t
        -0x76t
        -0x18t
        0xet
        0x35t
        0x14t
        0x46t
        -0x70t
        -0x3at
        0xdt
        0x32t
        0x11t
    .end array-data

    nop

    :array_25
    .array-data 1
        -0x5dt
        0x1et
        0x40t
        -0x18t
        -0x43t
        -0x5dt
    .end array-data

    nop

    :array_26
    .array-data 1
        -0x1bt
        0x6bt
        0x6t
        0x18t
        0x10t
        -0x52t
        -0x1bt
        0x5dt
        0xet
        0x16t
        0xft
        -0x76t
    .end array-data

    :array_27
    .array-data 1
        0x2t
        -0x2ft
        -0x5ct
        -0x10t
        -0x7at
        0x1t
    .end array-data

    nop

    :array_28
    .array-data 1
        0x24t
        -0x6bt
        -0x79t
        0x37t
        -0x26t
        0x69t
    .end array-data

    nop

    :array_29
    .array-data 1
        0x50t
        -0x3t
        -0x12t
        0x44t
        -0x2t
        0x59t
    .end array-data

    nop

    :array_2a
    .array-data 1
        -0x1t
        -0x2et
        -0x1t
        0x75t
        0x64t
        0x4bt
        -0x46t
        -0x2et
        -0xbt
    .end array-data

    nop

    :array_2b
    .array-data 1
        -0x25t
        -0x4ft
        -0x62t
        0x19t
        0x8t
        0x29t
    .end array-data

    nop

    :array_2c
    .array-data 1
        -0x49t
        -0x7bt
        -0x5at
        -0x28t
        -0x2at
        0x4ct
    .end array-data

    nop

    :array_2d
    .array-data 1
        -0x3dt
        -0x13t
        -0x31t
        -0x55t
        -0xet
        0x7ct
    .end array-data

    nop

    :array_2e
    .array-data 1
        -0x5ct
        0x6ct
        -0x2ct
        0x44t
        -0x23t
        0x4t
        -0x49t
        0x38t
        -0x79t
        0x2t
        -0x61t
        0x57t
        -0xdt
        0x3et
        -0x7dt
        0x2t
    .end array-data

    :array_2f
    .array-data 1
        -0x3bt
        0x8t
        -0x4bt
        0x34t
        -0x57t
        0x61t
    .end array-data

    nop

    :array_30
    .array-data 1
        0x79t
        0x38t
        0xat
        -0xet
        -0xbt
        -0x2ct
    .end array-data

    nop

    :array_31
    .array-data 1
        0x28t
        -0x2t
        0x29t
        0x53t
    .end array-data

    :array_32
    .array-data 1
        0x41t
        -0x70t
        0x4ft
        0x3ct
        -0x45t
        -0x25t
    .end array-data

    nop

    :array_33
    .array-data 1
        0x28t
        0x1ct
        0x3et
        -0x55t
        -0x4t
        0x64t
    .end array-data

    nop

    :array_34
    .array-data 1
        -0x6at
        0x4at
    .end array-data

    nop

    :array_35
    .array-data 1
        -0x45t
        0x7bt
        0x60t
        -0x3et
        -0x28t
        -0x5t
    .end array-data

    nop

    :array_36
    .array-data 1
        0x40t
        0x74t
        0x3et
        0x49t
        0x27t
        -0x4ft
        0x5t
        0x3ft
        0x6et
    .end array-data

    nop

    :array_37
    .array-data 1
        0x2bt
        0x11t
        0x47t
        0x3at
        0xft
        -0x61t
    .end array-data

    nop

    :array_38
    .array-data 1
        -0x72t
        0x5at
        -0x12t
        0x26t
    .end array-data

    :array_39
    .array-data 1
        -0x19t
        0x34t
        -0x78t
        0x49t
        -0x5ct
        0x5t
    .end array-data

    nop

    :array_3a
    .array-data 1
        0x7ct
        0x48t
        -0x2dt
        0x22t
        -0x39t
        0x6bt
    .end array-data

    nop

    :array_3b
    .array-data 1
        -0x1t
        -0x74t
        0x6et
    .end array-data

    :array_3c
    .array-data 1
        0x1ct
        0xct
        -0x11t
        0x79t
        0x36t
        -0x7t
    .end array-data

    nop

    :array_3d
    .array-data 1
        -0x4et
        -0x2et
        -0x42t
        -0x7t
        -0x58t
        -0x2t
        -0x1bt
        -0x32t
        -0x47t
        -0x19t
        -0x67t
        -0x2ct
        -0x1et
        -0x2et
        -0x47t
        -0x2t
        -0x71t
        -0x38t
        -0x5t
        -0x3dt
    .end array-data

    :array_3e
    .array-data 1
        -0x6at
        -0x5at
        -0x2at
        -0x70t
        -0x25t
        -0x5ft
    .end array-data

    nop

    :array_3f
    .array-data 1
        -0x6t
        0x8t
        -0x49t
        -0x2t
        0x7ft
        -0x67t
        -0x4dt
        0x8t
    .end array-data

    :array_40
    .array-data 1
        -0x22t
        0x6dt
        -0x31t
        -0x76t
        0x31t
        -0x8t
    .end array-data

    nop

    :array_41
    .array-data 1
        -0x51t
        -0x79t
        -0x7bt
        -0x58t
        0x6bt
        0x6dt
        -0x8t
        -0x7at
    .end array-data

    :array_42
    .array-data 1
        -0x75t
        -0xet
        -0x9t
        -0x3ct
        0x27t
        0x4t
    .end array-data

    nop

    :array_43
    .array-data 1
        0x46t
        -0x34t
        0x48t
    .end array-data

    :array_44
    .array-data 1
        0x2bt
        -0x44t
        0x7ct
        0x3ft
        -0x6bt
        0x61t
    .end array-data

    nop

    :array_45
    .array-data 1
        0x58t
        -0x3ft
        -0x7et
        -0x8t
        0x62t
        -0x18t
    .end array-data

    nop

    :array_46
    .array-data 1
        -0x10t
        -0x5t
        0x8t
        0x5t
        -0x64t
        -0x78t
    .end array-data
.end method

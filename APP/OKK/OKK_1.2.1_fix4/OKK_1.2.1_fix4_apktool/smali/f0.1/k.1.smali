.class public final synthetic Lf0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    iput p2, p0, Lf0/k;->a:I

    iput-object p1, p0, Lf0/k;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    move-object/from16 v0, p0

    const/16 v3, 0x10

    const/16 v4, 0x28

    const/16 v5, 0xc

    const/high16 v6, 0x41300000    # 11.0f

    const/4 v7, 0x1

    const/4 v8, 0x2

    const/4 v9, 0x6

    const/4 v10, 0x4

    const/4 v12, -0x1

    const/16 v13, 0x2c

    const/4 v14, 0x0

    const-string v15, "p"

    const-string v1, "$act"

    iget v2, v0, Lf0/k;->a:I

    packed-switch v2, :pswitch_data_0

    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/LinearLayout;

    iget-object v3, v0, Lf0/k;->b:Landroid/app/Activity;

    invoke-static {v3, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v15}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v16, Lf0/V;->a:Lf0/V;

    const/16 v21, 0x0

    const/16 v23, 0x60

    const-string v18, "\u70b9\u51fb\u6c14\u6ce1\u624d\u663e\u793a"

    const-string v19, "\u9ed8\u8ba4\u9690\u85cf\uff0c\u70b9\u51fb\u804a\u5929\u6c14\u6ce1\u540e\u624d\u5c55\u5f00\u65f6\u95f4"

    const-string v20, "detail_click_show"

    const/16 v22, 0x0

    move-object/from16 v17, v3

    invoke-static/range {v16 .. v23}, Lf0/V;->o(Lf0/V;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLP0/a;I)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v1, "${time} ${relativeTime}"

    const-string v4, "\u6587\u672c\u683c\u5f0f"

    const-string v5, "detail_template"

    invoke-static {v3, v4, v5, v1}, Lf0/V;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;

    move-result-object v1

    iget-object v4, v1, Lf0/I;->a:Landroid/view/View;

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v4, "${msgId}"

    const-string v5, "${msgSvrId}"

    const-string v7, "${time}"

    const-string v15, "${relativeTime}"

    const-string v11, "${type}"

    filled-new-array {v7, v15, v11, v4, v5}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v21

    const/16 v22, 0x3

    const/16 v23, 0x0

    iget-object v4, v1, Lf0/I;->b:Landroid/widget/EditText;

    move-object/from16 v18, v3

    move-object/from16 v19, v2

    move-object/from16 v20, v4

    invoke-static/range {v18 .. v23}, Lf0/V;->b(Landroid/app/Activity;Landroid/widget/LinearLayout;Landroid/widget/EditText;Ljava/util/List;ILP0/a;)V

    sget v4, Lf0/V;->h:I

    const-string v5, "\u53d8\u91cf\u8bf4\u660e\uff1a${time} \u7cbe\u786e\u65f6\u95f4 \u00b7 ${relativeTime} \u76f8\u5bf9\u65f6\u95f4 \u00b7 ${type} \u6d88\u606f\u7c7b\u578b \u00b7 ${msgId} \u6d88\u606fID \u00b7 ${msgSvrId} \u670d\u52a1\u5668ID"

    invoke-static {v3, v5, v6, v4, v14}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v4

    invoke-static {v3, v10}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    invoke-static {v3, v9}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    invoke-static {v3, v10}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v7

    invoke-static {v3, v8}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v4, v5, v6, v7, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setSingleLine(Z)V

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v4, "MM-dd HH:mm:ss"

    const-string v5, "\u65f6\u95f4\u683c\u5f0f"

    const-string v6, "detail_time_pattern"

    invoke-static {v3, v5, v6, v4}, Lf0/V;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;

    move-result-object v4

    const-string v5, "12"

    const-string v6, "\u5b57\u4f53\u5927\u5c0f"

    const-string v7, "detail_text_size"

    invoke-static {v3, v6, v7, v5}, Lf0/V;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;

    move-result-object v5

    const-string v6, "#E6000000"

    const-string v7, "\u65e5\u95f4\u6587\u5b57\u989c\u8272"

    const-string v8, "detail_text_color_light"

    invoke-static {v3, v7, v8, v6}, Lf0/V;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;

    move-result-object v6

    const-string v7, "#CCFFFFFF"

    const-string v8, "\u591c\u95f4\u6587\u5b57\u989c\u8272"

    const-string v9, "detail_text_color_dark"

    invoke-static {v3, v8, v9, v7}, Lf0/V;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;

    move-result-object v7

    iget-object v8, v4, Lf0/I;->a:Landroid/view/View;

    invoke-virtual {v2, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v8, v5, Lf0/I;->a:Landroid/view/View;

    invoke-virtual {v2, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v8, v6, Lf0/I;->a:Landroid/view/View;

    invoke-virtual {v2, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v8, v7, Lf0/I;->a:Landroid/view/View;

    invoke-virtual {v2, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v8, Lf0/t;

    move-object/from16 v16, v8

    move-object/from16 v17, v1

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    move-object/from16 v21, v7

    move-object/from16 v22, v3

    invoke-direct/range {v16 .. v22}, Lf0/t;-><init>(Lf0/I;Lf0/I;Lf0/I;Lf0/I;Lf0/I;Landroid/app/Activity;)V

    const-string v1, "\u4fdd\u5b58\u683c\u5f0f\u8bbe\u7f6e"

    invoke-static {v3, v1, v8}, Lf0/V;->r(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v3, v13}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    invoke-direct {v4, v12, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0x8

    invoke-static {v3, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    iput v3, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {v2, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v1, LD0/l;->a:LD0/l;

    return-object v1

    :pswitch_0
    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/LinearLayout;

    iget-object v3, v0, Lf0/k;->b:Landroid/app/Activity;

    invoke-static {v3, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v15}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v16, Lf0/V;->a:Lf0/V;

    const-string v1, "\u4eca\u65e5\u5df2\u53d1${totalMsg}\u6761"

    const-string v11, "\u8f93\u5165\u63d0\u793a"

    const-string v12, "input_stats_template"

    invoke-static {v3, v11, v12, v1}, Lf0/V;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;

    move-result-object v1

    iget-object v11, v1, Lf0/I;->a:Landroid/view/View;

    invoke-virtual {v2, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v21, 0x1

    const/16 v23, 0x60

    const-string v18, "\u7edf\u8ba1\u53d1\u9001\u6570\u91cf"

    const-string v19, "\u5c06\u53d1\u51fa\u7684\u6d88\u606f\u8ba1\u5165\u5f53\u65e5\u7edf\u8ba1"

    const-string v20, "input_stats_count_send"

    const/16 v22, 0x0

    move-object/from16 v17, v3

    invoke-static/range {v16 .. v23}, Lf0/V;->o(Lf0/V;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLP0/a;I)Landroid/widget/LinearLayout;

    move-result-object v11

    invoke-virtual {v2, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v20, "${redBagMsg}"

    const-string v21, "${fileMsg}"

    const-string v15, "${totalMsg}"

    const-string v16, "${textMsg}"

    const-string v17, "${textWord}"

    const-string v18, "${emojiMsg}"

    const-string v19, "${transferMsg}"

    filled-new-array/range {v15 .. v21}, [Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    new-instance v11, Lf0/r;

    invoke-direct {v11, v1, v3, v14}, Lf0/r;-><init>(Lf0/I;Landroid/app/Activity;I)V

    iget-object v12, v1, Lf0/I;->b:Landroid/widget/EditText;

    const/16 v19, 0x3

    move-object v15, v3

    move-object/from16 v16, v2

    move-object/from16 v17, v12

    move-object/from16 v20, v11

    invoke-static/range {v15 .. v20}, Lf0/V;->b(Landroid/app/Activity;Landroid/widget/LinearLayout;Landroid/widget/EditText;Ljava/util/List;ILP0/a;)V

    sget v11, Lf0/V;->h:I

    const-string v12, "\u53d8\u91cf\u8bf4\u660e\uff1a${totalMsg} \u603b\u6761\u6570 \u00b7 ${textMsg} \u6587\u5b57 \u00b7 ${textWord} \u5b57\u6570 \u00b7 ${emojiMsg} \u8868\u60c5 \u00b7 ${transferMsg} \u8f6c\u8d26 \u00b7 ${redBagMsg} \u7ea2\u5305 \u00b7 ${fileMsg} \u6587\u4ef6"

    invoke-static {v3, v12, v6, v11, v14}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v6

    invoke-static {v3, v10}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v11

    invoke-static {v3, v9}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v9

    invoke-static {v3, v10}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v10

    invoke-static {v3, v8}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v6, v11, v9, v10, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v6, v14}, Landroid/widget/TextView;->setSingleLine(Z)V

    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v6, Landroid/widget/LinearLayout;

    invoke-direct {v6, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v6, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-static {v3, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v6, v14, v5, v14, v14}, Landroid/view/View;->setPadding(IIII)V

    new-instance v5, Lf0/s;

    invoke-direct {v5, v14, v1}, Lf0/s;-><init>(ILjava/lang/Object;)V

    const-string v8, "\u91cd\u7f6e"

    invoke-static {v3, v8, v5}, Lf0/V;->u(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v5

    new-instance v8, Lf0/r;

    invoke-direct {v8, v1, v3, v7}, Lf0/r;-><init>(Lf0/I;Landroid/app/Activity;I)V

    const-string v1, "\u4fdd\u5b58"

    invoke-static {v3, v1, v8}, Lf0/V;->r(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v3, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct {v7, v14, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const/16 v8, 0x8

    invoke-static {v3, v8}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v6, v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v3, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    invoke-direct {v5, v14, v3, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v6, v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v1, LD0/l;->a:LD0/l;

    return-object v1

    :pswitch_1
    iget-object v2, v0, Lf0/k;->b:Landroid/app/Activity;

    move-object/from16 v3, p1

    check-cast v3, Landroid/widget/LinearLayout;

    invoke-static {v2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v15}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    sget-object v1, Lc0/L1;->a:Lc0/L1;

    const-wide/16 v5, 0x0

    sput-wide v5, Lc0/L1;->b:J

    sget-object v5, Lc0/h1;->a:Lc0/h1;

    const-string v6, "virtual_location_enabled"

    invoke-static {v6, v14}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v15

    const-string v6, "virtual_location_latitude"

    const-string v10, ""

    invoke-static {v6, v10}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, LW0/p;->y0(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v11

    const-string v13, "virtual_location_longitude"

    invoke-static {v13, v10}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, LW0/p;->y0(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v10

    if-eqz v11, :cond_0

    if-eqz v10, :cond_0

    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    move-object/from16 p1, v13

    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v12

    invoke-static {v7, v8, v12, v13}, Lc0/L1;->d(DD)Z

    move-result v7

    if-nez v7, :cond_1

    if-eqz v15, :cond_1

    new-instance v1, LD0/e;

    invoke-direct {v1, v11, v10}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    move-object/from16 v5, p1

    goto/16 :goto_3

    :cond_0
    move-object/from16 p1, v13

    :cond_1
    if-eqz v11, :cond_2

    if-eqz v10, :cond_2

    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v12

    invoke-static {v7, v8, v12, v13}, Lc0/L1;->d(DD)Z

    move-result v7

    if-nez v7, :cond_2

    new-instance v1, LD0/e;

    invoke-direct {v1, v11, v10}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v2}, Lc0/L1;->b(Landroid/content/Context;)LD0/e;

    move-result-object v1

    iget-object v7, v1, LD0/e;->a:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    iget-object v1, v1, LD0/e;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v12

    if-eqz v11, :cond_4

    if-eqz v10, :cond_4

    move-object v1, v5

    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    invoke-static {v4, v5, v10, v11}, Lc0/L1;->d(DD)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    move-object/from16 v5, p1

    goto :goto_2

    :cond_4
    move-object v1, v5

    :goto_1
    invoke-static {v7, v8}, Lc0/L1;->c(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v6, v4, v14}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v12, v13}, Lc0/L1;->c(D)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v5, p1

    invoke-virtual {v1, v5, v4, v14}, Lc0/h1;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v21, 0x0

    move-wide/from16 v16, v7

    move-wide/from16 v18, v12

    move-object/from16 v20, v2

    invoke-static/range {v15 .. v21}, Lc0/L1;->i(ZDDLandroid/content/Context;Z)V

    :goto_2
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    new-instance v7, LD0/e;

    invoke-direct {v7, v1, v4}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v1, v7

    :goto_3
    iget-object v4, v1, LD0/e;->a:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    iget-object v1, v1, LD0/e;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    invoke-static {v7, v8}, Lc0/L1;->c(D)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\u7eac\u5ea6"

    invoke-static {v2, v4, v6, v1}, Lf0/V;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;

    move-result-object v1

    invoke-static {v10, v11}, Lc0/L1;->c(D)Ljava/lang/String;

    move-result-object v4

    const-string v6, "\u7ecf\u5ea6"

    invoke-static {v2, v6, v5, v4}, Lf0/V;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;

    move-result-object v4

    iget-object v5, v1, Lf0/I;->a:Landroid/view/View;

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v5, v4, Lf0/I;->a:Landroid/view/View;

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Lf0/v;

    invoke-direct {v5, v2, v1, v4, v14}, Lf0/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string v6, "\u586b\u5165\u5f53\u524d\u771f\u5b9e\u4f4d\u7f6e"

    invoke-static {v2, v6, v5}, Lf0/V;->u(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v5

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v7, 0x28

    invoke-static {v2, v7}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    const/4 v10, -0x1

    invoke-direct {v6, v10, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v2, v9}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    iput v8, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v3, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Lf0/v;

    const/4 v6, 0x1

    invoke-direct {v5, v2, v1, v4, v6}, Lf0/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string v6, "\u5728\u5fae\u4fe1\u5730\u56fe\u4e2d\u9009\u70b9"

    invoke-static {v2, v6, v5}, Lf0/V;->u(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v5

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v2, v7}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v7

    invoke-direct {v6, v10, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v2, v9}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v7

    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v3, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Lf0/v;

    const/4 v6, 0x2

    invoke-direct {v5, v2, v1, v4, v6}, Lf0/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string v1, "\u4fdd\u5b58\u4fee\u6539\u540e\u7684\u5750\u6807"

    invoke-static {v2, v1, v5}, Lf0/V;->r(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v5, 0x2c

    invoke-static {v2, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    invoke-direct {v4, v10, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v2, v9}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    iput v2, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {v3, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v1, LD0/l;->a:LD0/l;

    return-object v1

    :pswitch_2
    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/LinearLayout;

    iget-object v11, v0, Lf0/k;->b:Landroid/app/Activity;

    invoke-static {v11, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v15}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    const/4 v8, 0x1

    const/16 v10, 0x60

    const-string v5, "\u663e\u793a\u64a4\u56de\u63d0\u793a"

    const-string v6, "\u5728\u804a\u5929\u4e2d\u8ffd\u52a0\u7cfb\u7edf\u64a4\u56de\u63d0\u793a\u6587\u6848"

    const-string v7, "revoke_notice_enabled"

    const/4 v9, 0x0

    move-object v3, v1

    move-object v4, v11

    invoke-static/range {v3 .. v10}, Lf0/V;->o(Lf0/V;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLP0/a;I)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 v8, 0x0

    const-string v5, "\u4fdd\u7559\u81ea\u5df1\u64a4\u56de"

    const-string v6, "\u81ea\u5df1\u64a4\u56de\u7684\u6d88\u606f\u4e5f\u540c\u6837\u62e6\u622a\u4fdd\u5b58"

    const-string v7, "anti_revoke_keep_self"

    move-object v3, v1

    invoke-static/range {v3 .. v10}, Lf0/V;->o(Lf0/V;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLP0/a;I)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v1, "{name}\u64a4\u56de\u4e86\u4e00\u6761\u6d88\u606f"

    const-string v3, "\u64a4\u56de\u63d0\u793a\u6a21\u677f"

    const-string v4, "anti_revoke_notice_text"

    invoke-static {v11, v3, v4, v1}, Lf0/V;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;

    move-result-object v1

    iget-object v3, v1, Lf0/I;->a:Landroid/view/View;

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Lf0/r;

    const/4 v4, 0x3

    invoke-direct {v3, v1, v11, v4}, Lf0/r;-><init>(Lf0/I;Landroid/app/Activity;I)V

    const-string v1, "\u4fdd\u5b58\u63d0\u793a\u6a21\u677f"

    invoke-static {v11, v1, v3}, Lf0/V;->r(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v4, 0x2c

    invoke-static {v11, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    const/4 v5, -0x1

    invoke-direct {v3, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0x8

    invoke-static {v11, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v1, LD0/l;->a:LD0/l;

    return-object v1

    :pswitch_3
    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/LinearLayout;

    iget-object v3, v0, Lf0/k;->b:Landroid/app/Activity;

    invoke-static {v3, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v15}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    const-string v1, "#9E9E9E"

    const-string v4, "\u6587\u5b57\u989c\u8272 (Hex)"

    const-string v5, "real_name_tail_color"

    invoke-static {v3, v4, v5, v1}, Lf0/V;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;

    move-result-object v1

    iget-object v4, v1, Lf0/I;->a:Landroid/view/View;

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Lf0/r;

    const/4 v5, 0x2

    invoke-direct {v4, v1, v3, v5}, Lf0/r;-><init>(Lf0/I;Landroid/app/Activity;I)V

    const-string v1, "\u4fdd\u5b58\u5b9e\u540d\u989c\u8272"

    invoke-static {v3, v1, v4}, Lf0/V;->r(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v5, 0x2c

    invoke-static {v3, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    const/4 v6, -0x1

    invoke-direct {v4, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0x8

    invoke-static {v3, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    iput v3, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {v2, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v1, LD0/l;->a:LD0/l;

    return-object v1

    :pswitch_4
    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/LinearLayout;

    iget-object v4, v0, Lf0/k;->b:Landroid/app/Activity;

    invoke-static {v4, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v15}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    sget-object v1, Lc0/B1;->a:Lc0/B1;

    const/4 v6, 0x1

    invoke-static {v6}, Lc0/B1;->g(Z)V

    sget-object v6, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v4}, Lc0/G1;->x(Landroid/app/Activity;)V

    invoke-static {v14}, Lc0/B1;->g(Z)V

    sget-object v6, Lc0/B1;->f:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_5

    new-instance v6, Ljava/io/File;

    invoke-static {v14}, Lc0/B1;->g(Z)V

    sget-object v7, Lc0/B1;->f:Ljava/lang/String;

    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->isFile()Z

    move-result v6

    if-eqz v6, :cond_5

    const/4 v6, 0x1

    goto :goto_4

    :cond_5
    move v6, v14

    :goto_4
    if-eqz v6, :cond_6

    const-string v7, "\u66f4\u6362\u58c1\u7eb8\u56fe\u7247"

    goto :goto_5

    :cond_6
    const-string v7, "\u9009\u62e9\u58c1\u7eb8\u56fe\u7247"

    :goto_5
    new-instance v8, Ld0/c;

    const/16 v11, 0xf

    invoke-direct {v8, v4, v11}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    invoke-static {v4, v7, v8}, Lf0/V;->r(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v7

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v11, 0x2c

    invoke-static {v4, v11}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v11

    const/4 v12, -0x1

    invoke-direct {v8, v12, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v4, v9}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v11

    iput v11, v8, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v2, v7, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    if-eqz v6, :cond_7

    const-string v6, "\u6e05\u9664\u58c1\u7eb8\uff08\u6062\u590d\u9ed8\u8ba4\uff09"

    goto :goto_6

    :cond_7
    const-string v6, "\u6e05\u9664\u58c1\u7eb8\uff08\u5f53\u524d\u65e0\u58c1\u7eb8\uff09"

    :goto_6
    new-instance v7, Ld0/c;

    invoke-direct {v7, v4, v3}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    invoke-static {v4, v6, v7}, Lf0/V;->u(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v3

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v7, 0x28

    invoke-static {v4, v7}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v7

    const/4 v8, -0x1

    invoke-direct {v6, v8, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v4, v9}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v7

    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v2, v3, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v1}, Lc0/B1;->a()F

    move-result v1

    const/16 v3, 0x64

    int-to-float v3, v3

    mul-float/2addr v3, v1

    float-to-int v3, v3

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "\u4e0d\u900f\u660e\u5ea6 "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "%"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    sget v6, Lf0/V;->g:I

    const/high16 v7, 0x41600000    # 14.0f

    const/4 v8, 0x1

    invoke-static {v4, v3, v7, v6, v8}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v3

    invoke-static {v4, v10}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    invoke-static {v4, v9}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v7

    invoke-static {v4, v10}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v3, v6, v7, v14, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v6, Landroid/widget/SeekBar;

    invoke-direct {v6, v4}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    const/16 v7, 0x55

    invoke-virtual {v6, v7}, Landroid/widget/ProgressBar;->setMax(I)V

    invoke-static {v1}, Lc0/B1;->c(F)F

    move-result v1

    const/high16 v8, 0x42c80000    # 100.0f

    mul-float/2addr v1, v8

    invoke-static {v1}, LA0/p;->P(F)I

    move-result v1

    const/4 v8, 0x1

    invoke-static {v1, v8, v7}, LA0/p;->p(III)I

    move-result v1

    invoke-virtual {v6, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    new-instance v1, Lf0/U;

    invoke-direct {v1, v3, v6}, Lf0/U;-><init>(Landroid/widget/TextView;Landroid/widget/SeekBar;)V

    invoke-virtual {v6, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Ld0/c;

    const/16 v3, 0x11

    invoke-direct {v1, v4, v3}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    const-string v3, "\u5e94\u7528\u58c1\u7eb8"

    invoke-static {v4, v3, v1}, Lf0/V;->r(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v6, 0x2e

    invoke-static {v4, v6}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    const/4 v7, -0x1

    invoke-direct {v3, v7, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v4, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v1, LD0/l;->a:LD0/l;

    return-object v1

    :pswitch_5
    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/LinearLayout;

    iget-object v3, v0, Lf0/k;->b:Landroid/app/Activity;

    invoke-static {v3, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v15}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    sget-object v1, Lc0/h1;->a:Lc0/h1;

    const-string v1, "round_avatar_radius"

    const-string v4, "0.50"

    invoke-static {v1, v4}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LW0/p;->z0(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    const/high16 v4, 0x3f000000    # 0.5f

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_7

    :cond_8
    move v1, v4

    :goto_7
    invoke-static {v1}, Lf0/V;->e(F)Ljava/lang/String;

    move-result-object v5

    sget v6, Lf0/V;->g:I

    const/high16 v7, 0x41700000    # 15.0f

    const/4 v8, 0x1

    invoke-static {v3, v5, v7, v6, v8}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v5

    invoke-static {v3, v10}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    invoke-static {v3, v9}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v7

    invoke-static {v3, v10}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v5, v6, v7, v14, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v6, Landroid/widget/SeekBar;

    invoke-direct {v6, v3}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    const/16 v7, 0x2d

    invoke-virtual {v6, v7}, Landroid/widget/ProgressBar;->setMax(I)V

    sget-object v8, Lc0/v1;->b:Lc0/x1;

    const v8, 0x3d4ccccd    # 0.05f

    invoke-static {v1, v8, v4}, LA0/p;->o(FFF)F

    move-result v1

    sub-float/2addr v1, v8

    const/high16 v8, 0x42c80000    # 100.0f

    mul-float/2addr v1, v8

    add-float/2addr v1, v4

    float-to-int v1, v1

    invoke-static {v1, v14, v7}, LA0/p;->p(III)I

    move-result v1

    invoke-virtual {v6, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    new-instance v1, Lf0/T;

    invoke-direct {v1, v5}, Lf0/T;-><init>(Landroid/widget/TextView;)V

    invoke-virtual {v6, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Lc0/x0;

    const/4 v4, 0x1

    invoke-direct {v1, v6, v5, v4}, Lc0/x0;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string v4, "\u63a8\u8350\u65b9\u5706 0.36"

    invoke-static {v3, v4, v1}, Lf0/V;->u(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v5, 0x28

    invoke-static {v3, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    const/4 v7, -0x1

    invoke-direct {v4, v7, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0x8

    invoke-static {v3, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    iput v8, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {v2, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Lc0/x0;

    const/4 v4, 0x2

    invoke-direct {v1, v6, v3, v4}, Lc0/x0;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string v4, "\u4fdd\u5b58\u5934\u50cf\u5706\u5ea6"

    invoke-static {v3, v4, v1}, Lf0/V;->r(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v6, 0x2c

    invoke-static {v3, v6}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    invoke-direct {v4, v7, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v3, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    iput v3, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {v2, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v1, LD0/l;->a:LD0/l;

    return-object v1

    :pswitch_6
    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/LinearLayout;

    iget-object v11, v0, Lf0/k;->b:Landroid/app/Activity;

    invoke-static {v11, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v15}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    const/4 v8, 0x1

    const/16 v10, 0x60

    const-string v5, "\u663e\u793a\u5e95\u680f\u6807\u9898"

    const-string v6, "\u5173\u95ed\u540e\u4ec5\u4fdd\u7559\u56fe\u6807\u683c"

    const-string v7, "bottom_tab_floating_labels"

    const/4 v9, 0x0

    move-object v3, v1

    move-object v4, v11

    invoke-static/range {v3 .. v10}, Lf0/V;->o(Lf0/V;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLP0/a;I)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v5, "\u663e\u793a\u672a\u8bfb\u89d2\u6807"

    const-string v6, "\u5f00\u542f\u6570\u5b57/\u7ea2\u70b9\u672a\u8bfb\u63d0\u9192"

    const-string v7, "bottom_tab_floating_badge"

    move-object v3, v1

    invoke-static/range {v3 .. v10}, Lf0/V;->o(Lf0/V;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLP0/a;I)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v1, "\u5fae\u4fe1"

    const-string v3, "\u7b2c 1 \u683c\u6807\u9898"

    const-string v4, "bottom_tab_title_chats"

    invoke-static {v11, v3, v4, v1}, Lf0/V;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;

    move-result-object v4

    const-string v1, "\u901a\u8baf\u5f55"

    const-string v3, "\u7b2c 2 \u683c\u6807\u9898"

    const-string v5, "bottom_tab_title_contacts"

    invoke-static {v11, v3, v5, v1}, Lf0/V;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;

    move-result-object v5

    const-string v1, "\u53d1\u73b0"

    const-string v3, "\u7b2c 3 \u683c\u6807\u9898"

    const-string v6, "bottom_tab_title_discover"

    invoke-static {v11, v3, v6, v1}, Lf0/V;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;

    move-result-object v6

    const-string v1, "\u6211"

    const-string v3, "\u7b2c 4 \u683c\u6807\u9898"

    const-string v7, "bottom_tab_title_me"

    invoke-static {v11, v3, v7, v1}, Lf0/V;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;

    move-result-object v7

    iget-object v1, v4, Lf0/I;->a:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v1, v5, Lf0/I;->a:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v1, v6, Lf0/I;->a:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v1, v7, Lf0/I;->a:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Lf0/u;

    move-object v3, v1

    move-object v8, v11

    invoke-direct/range {v3 .. v8}, Lf0/u;-><init>(Lf0/I;Lf0/I;Lf0/I;Lf0/I;Landroid/app/Activity;)V

    const-string v3, "\u4fdd\u5b58\u5e95\u680f\u6807\u9898"

    invoke-static {v11, v3, v1}, Lf0/V;->r(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v4, 0x2c

    invoke-static {v11, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    const/4 v5, -0x1

    invoke-direct {v3, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0x8

    invoke-static {v11, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v1, LD0/l;->a:LD0/l;

    return-object v1

    :pswitch_7
    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/LinearLayout;

    iget-object v11, v0, Lf0/k;->b:Landroid/app/Activity;

    invoke-static {v11, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v15}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    const/4 v8, 0x1

    const/16 v10, 0x60

    const-string v5, "\u540c\u6b65\u6700\u8fd1\u804a\u5929\u6d88\u606f"

    const-string v6, "\u81ea\u52a8\u52fe\u9009\u540c\u6b65\u9009\u9879"

    const-string v7, "auto_login_win_sync_msg"

    const/4 v9, 0x0

    move-object v3, v1

    move-object v4, v11

    invoke-static/range {v3 .. v10}, Lf0/V;->o(Lf0/V;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLP0/a;I)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v5, "\u663e\u793a\u767b\u5f55\u8bbe\u5907\u540d\u79f0"

    const-string v6, "\u52fe\u9009\u663e\u793a\u8bbe\u5907\u540d"

    const-string v7, "auto_login_win_show_device"

    move-object v3, v1

    invoke-static/range {v3 .. v10}, Lf0/V;->o(Lf0/V;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLP0/a;I)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v5, "\u81ea\u52a8\u70b9\u51fb\u767b\u5f55\u6309\u94ae"

    const-string v6, "\u9875\u9762\u8f7d\u5165\u540e\u81ea\u52a8\u70b9\u51fb\u767b\u5f55"

    const-string v7, "auto_login_win_auto_click"

    move-object v3, v1

    invoke-static/range {v3 .. v10}, Lf0/V;->o(Lf0/V;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLP0/a;I)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v1, LD0/l;->a:LD0/l;

    return-object v1

    :pswitch_8
    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/LinearLayout;

    iget-object v4, v0, Lf0/k;->b:Landroid/app/Activity;

    invoke-static {v4, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v15}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v24, Lf0/V;->a:Lf0/V;

    const/16 v29, 0x0

    const/16 v31, 0x60

    const-string v26, "\u542f\u7528\u4e0b\u8f7d\u91cd\u5b9a\u5411"

    const-string v27, "\u5fae\u4fe1\u63a5\u6536\u7684\u804a\u5929\u6587\u4ef6\u4fdd\u5b58\u5230\u81ea\u5b9a\u4e49\u76ee\u5f55"

    const-string v28, "download_redirect_enabled"

    const/16 v30, 0x0

    move-object/from16 v25, v4

    invoke-static/range {v24 .. v31}, Lf0/V;->o(Lf0/V;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLP0/a;I)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v1, "\u4fdd\u5b58\u76ee\u5f55"

    invoke-static {v2, v4, v1}, Lf0/V;->v(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    sget-object v1, Lc0/e0;->a:Lc0/e0;

    invoke-static {}, Lc0/e0;->c()Ljava/lang/String;

    move-result-object v1

    sget v7, Lf0/V;->h:I

    invoke-static {v4, v1, v6, v7, v14}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v4, v3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    invoke-static {v4, v3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    const/16 v7, 0x8

    invoke-static {v4, v7}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v1, v6, v14, v3, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setSingleLine(Z)V

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Ld0/c;

    const/16 v3, 0xd

    invoke-direct {v1, v4, v3}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    const-string v3, "\u9009\u62e9\u4fdd\u5b58\u76ee\u5f55"

    invoke-static {v4, v3, v1}, Lf0/V;->r(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v6, 0x2c

    invoke-static {v4, v6}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v7

    const/4 v8, -0x1

    invoke-direct {v3, v8, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v4, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    iput v5, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Ld0/c;

    const/16 v3, 0xe

    invoke-direct {v1, v4, v3}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    const-string v3, "\u6062\u590d\u9ed8\u8ba4\u76ee\u5f55"

    invoke-static {v4, v3, v1}, Lf0/V;->u(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v4, v6}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    invoke-direct {v3, v8, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0x8

    invoke-static {v4, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    iput v6, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget v1, Lf0/V;->h:I

    const-string v3, "\u63d0\u793a\uff1a\u9009\u62e9\u540e\u65b0\u4e0b\u8f7d\u7684\u804a\u5929\u6587\u4ef6\u5c06\u4fdd\u5b58\u5230\u8be5\u76ee\u5f55\u3002\u9ed8\u8ba4\u76ee\u5f55\u4e3a AChat/download\u3002"

    const/high16 v6, 0x41400000    # 12.0f

    invoke-static {v4, v3, v6, v1, v14}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v4, v10}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v4, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    invoke-static {v4, v10}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v7

    invoke-static {v4, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v1, v3, v6, v7, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v1, LD0/l;->a:LD0/l;

    return-object v1

    :pswitch_9
    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/LinearLayout;

    iget-object v4, v0, Lf0/k;->b:Landroid/app/Activity;

    invoke-static {v4, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v15}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v24, Lf0/V;->a:Lf0/V;

    const/16 v29, 0x0

    const/16 v31, 0x60

    const-string v26, "\u542f\u7528\u81ea\u5b9a\u4e49\u6c14\u6ce1"

    const-string v27, "\u66ff\u6362\u5fae\u4fe1\u9ed8\u8ba4\u5bf9\u8bdd\u6c14\u6ce1\u80cc\u666f"

    const-string v28, "bubble_enabled"

    const/16 v30, 0x0

    move-object/from16 v25, v4

    invoke-static/range {v24 .. v31}, Lf0/V;->o(Lf0/V;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLP0/a;I)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v1, Lc0/h1;->a:Lc0/h1;

    const-string v1, "bubble_path_left"

    const-string v7, "/storage/emulated/0/Android/media/com.tencent.mm/OKK/left.9.png"

    invoke-static {v1, v7}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "bubble_path_right"

    const-string v8, "/storage/emulated/0/Android/media/com.tencent.mm/OKK/right.9.png"

    invoke-static {v7, v8}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "\u5de6\u4fa7\u6c14\u6ce1 (\u63a5\u6536)"

    invoke-static {v2, v4, v8}, Lf0/V;->v(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    sget v8, Lf0/V;->h:I

    invoke-static {v4, v1, v6, v8, v14}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v4, v3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    invoke-static {v4, v3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v9

    const/16 v11, 0x8

    invoke-static {v4, v11}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v12

    invoke-virtual {v1, v8, v14, v9, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setSingleLine(Z)V

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Ld0/c;

    const/16 v8, 0x12

    invoke-direct {v1, v4, v8}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    const-string v8, "\u9009\u62e9\u5de6\u4fa7\u6c14\u6ce1 (.9.png)"

    invoke-static {v4, v8, v1}, Lf0/V;->r(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v9, 0x2c

    invoke-static {v4, v9}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v11

    const/4 v9, -0x1

    invoke-direct {v8, v9, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v4, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    iput v5, v8, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v2, v1, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const-string v1, "\u53f3\u4fa7\u6c14\u6ce1 (\u53d1\u9001)"

    invoke-static {v2, v4, v1}, Lf0/V;->v(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    sget v1, Lf0/V;->h:I

    invoke-static {v4, v7, v6, v1, v14}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v4, v3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    invoke-static {v4, v3}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    const/16 v6, 0x8

    invoke-static {v4, v6}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {v1, v5, v14, v3, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setSingleLine(Z)V

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Ld0/c;

    const/16 v3, 0x13

    invoke-direct {v1, v4, v3}, Ld0/c;-><init>(Landroid/app/Activity;I)V

    const-string v3, "\u9009\u62e9\u53f3\u4fa7\u6c14\u6ce1 (.9.png)"

    invoke-static {v4, v3, v1}, Lf0/V;->r(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v5, 0x2c

    invoke-static {v4, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    const/4 v6, -0x1

    invoke-direct {v3, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0x8

    invoke-static {v4, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    iput v6, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget v1, Lf0/V;->h:I

    const-string v3, "\u63d0\u793a\uff1a\u9009\u62e9\u672c\u5730\u7684 .9.png \u6c14\u6ce1\u6587\u4ef6\u5c06\u81ea\u52a8\u590d\u5236\u5230\u6a21\u5757\u76ee\u5f55\u5e76\u751f\u6548\u3002\u5efa\u8bae\u5148\u5728\u5176\u4ed6\u8f6f\u4ef6\u505a\u597d 9patch \u5904\u7406\u3002"

    const/high16 v6, 0x41400000    # 12.0f

    invoke-static {v4, v3, v6, v1, v14}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v4, v10}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v4, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    invoke-static {v4, v10}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v7

    invoke-static {v4, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v1, v3, v6, v7, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v1, LD0/l;->a:LD0/l;

    return-object v1

    :pswitch_a
    move-object/from16 v2, p1

    check-cast v2, Landroid/widget/LinearLayout;

    iget-object v11, v0, Lf0/k;->b:Landroid/app/Activity;

    invoke-static {v11, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v15}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lf0/V;->a:Lf0/V;

    const/4 v8, 0x1

    const/16 v10, 0x60

    const-string v5, "\u663e\u793a\u666e\u901a\u6210\u5458\u5fbd\u7ae0"

    const-string v6, "\u5173\u95ed\u540e\u4ec5\u663e\u793a\u7fa4\u4e3b\u4e0e\u7ba1\u7406\u5458"

    const-string v7, "member_title_show_member"

    const/4 v9, 0x0

    move-object v4, v11

    invoke-static/range {v3 .. v10}, Lf0/V;->o(Lf0/V;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLP0/a;I)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v1, "\u7fa4\u4e3b"

    const-string v3, "\u7fa4\u4e3b\u5934\u8854\u6587\u6848"

    const-string v4, "member_title_owner"

    invoke-static {v11, v3, v4, v1}, Lf0/V;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;

    move-result-object v1

    const-string v3, "\u7ba1\u7406\u5458"

    const-string v4, "\u7ba1\u7406\u5458\u5934\u8854\u6587\u6848"

    const-string v5, "member_title_admin"

    invoke-static {v11, v4, v5, v3}, Lf0/V;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;

    move-result-object v3

    const-string v4, "\u6210\u5458"

    const-string v5, "\u6210\u5458\u5934\u8854\u6587\u6848"

    const-string v6, "member_title_member"

    invoke-static {v11, v5, v6, v4}, Lf0/V;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf0/I;

    move-result-object v4

    iget-object v5, v1, Lf0/I;->a:Landroid/view/View;

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v5, v3, Lf0/I;->a:Landroid/view/View;

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v5, v4, Lf0/I;->a:Landroid/view/View;

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Ld0/e;

    invoke-direct {v5, v1, v3, v4, v11}, Ld0/e;-><init>(Lf0/I;Lf0/I;Lf0/I;Landroid/app/Activity;)V

    const-string v1, "\u4fdd\u5b58\u5934\u8854\u6587\u6848"

    invoke-static {v11, v1, v5}, Lf0/V;->r(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v4, 0x2c

    invoke-static {v11, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    const/4 v5, -0x1

    invoke-direct {v3, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0x8

    invoke-static {v11, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v1, LD0/l;->a:LD0/l;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
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

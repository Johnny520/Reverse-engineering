.class public final synthetic Lf0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/a;


# instance fields
.field public final synthetic a:Lf0/V;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Landroid/widget/LinearLayout;

.field public final synthetic d:LQ0/m;

.field public final synthetic e:LQ0/m;

.field public final synthetic f:LQ0/m;

.field public final synthetic g:Landroid/widget/LinearLayout;

.field public final synthetic h:Landroid/widget/ScrollView;

.field public final synthetic i:Landroid/widget/LinearLayout;

.field public final synthetic j:Landroid/widget/FrameLayout;

.field public final synthetic k:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(Lf0/V;Landroid/app/Activity;Landroid/widget/LinearLayout;LQ0/m;LQ0/m;LQ0/m;Landroid/widget/LinearLayout;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/FrameLayout;Landroid/app/Dialog;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/y;->a:Lf0/V;

    iput-object p2, p0, Lf0/y;->b:Landroid/app/Activity;

    iput-object p3, p0, Lf0/y;->c:Landroid/widget/LinearLayout;

    iput-object p4, p0, Lf0/y;->d:LQ0/m;

    iput-object p5, p0, Lf0/y;->e:LQ0/m;

    iput-object p6, p0, Lf0/y;->f:LQ0/m;

    iput-object p7, p0, Lf0/y;->g:Landroid/widget/LinearLayout;

    iput-object p8, p0, Lf0/y;->h:Landroid/widget/ScrollView;

    iput-object p9, p0, Lf0/y;->i:Landroid/widget/LinearLayout;

    iput-object p10, p0, Lf0/y;->j:Landroid/widget/FrameLayout;

    iput-object p11, p0, Lf0/y;->k:Landroid/app/Dialog;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 54

    move-object/from16 v1, p0

    const/4 v8, 0x2

    const/4 v10, 0x1

    iget-object v15, v1, Lf0/y;->a:Lf0/V;

    iget-object v14, v1, Lf0/y;->b:Landroid/app/Activity;

    iget-object v13, v1, Lf0/y;->c:Landroid/widget/LinearLayout;

    iget-object v12, v1, Lf0/y;->d:LQ0/m;

    iget-object v11, v1, Lf0/y;->e:LQ0/m;

    iget-object v3, v1, Lf0/y;->f:LQ0/m;

    iget-object v4, v1, Lf0/y;->g:Landroid/widget/LinearLayout;

    iget-object v2, v1, Lf0/y;->h:Landroid/widget/ScrollView;

    iget-object v0, v1, Lf0/y;->i:Landroid/widget/LinearLayout;

    iget-object v7, v1, Lf0/y;->j:Landroid/widget/FrameLayout;

    iget-object v5, v1, Lf0/y;->k:Landroid/app/Dialog;

    const-string v6, "$this_runCatching"

    invoke-static {v15, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "$host"

    invoke-static {v14, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "$body"

    invoke-static {v13, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "$currentTab"

    invoke-static {v12, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "$pendingDetailKey"

    invoke-static {v11, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "$render"

    invoke-static {v3, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "$navBar"

    invoke-static {v4, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "$scroll"

    invoke-static {v2, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "$root"

    invoke-static {v0, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "$navWrap"

    invoke-static {v7, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "$dialog"

    invoke-static {v5, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v14}, Lf0/V;->p(Landroid/content/Context;)Lf0/J;

    move-result-object v6

    invoke-static {v6}, Lf0/V;->d(Lf0/J;)V

    move-object v6, v11

    move-object v11, v0

    move-object v9, v12

    move-object v12, v7

    move-object v7, v13

    move-object v13, v15

    move-object/from16 v24, v14

    move-object v14, v4

    move-object/from16 v25, v15

    move-object/from16 v15, v24

    move-object/from16 v16, v5

    invoke-static/range {v11 .. v16}, Lf0/V;->x(Landroid/widget/LinearLayout;Landroid/widget/FrameLayout;Lf0/V;Landroid/widget/LinearLayout;Landroid/app/Activity;Landroid/app/Dialog;)V

    invoke-virtual {v7}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v0, v9, LQ0/m;->a:Ljava/lang/Object;

    check-cast v0, Lf0/Q;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_2

    if-eq v0, v10, :cond_1

    if-ne v0, v8, :cond_0

    new-instance v0, LD0/e;

    const-string v5, "\u5173\u4e8e"

    const-string v11, "\u6a21\u5757\u7248\u672c\u4fe1\u606f \u00b7 \u76ae\u80a4\u4e3b\u9898\u4e0e\u9ad8\u7ea7\u8bbe\u7f6e"

    invoke-direct {v0, v5, v11}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, LD0/c;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, LD0/e;

    const-string v5, "\u6a21\u5757\u8bca\u65ad"

    const-string v11, "\u5fae\u4fe1\u7248\u672c\u4e0e\u6a21\u5757 Hook \u8fd0\u884c\u72b6\u6001\u603b\u89c8"

    invoke-direct {v0, v5, v11}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    new-instance v0, LD0/e;

    const-string v5, "\u529f\u80fd\u8bbe\u7f6e"

    const-string v11, "\u5373\u5f00\u5173\u5373\u751f\u6548 \u00b7 \u590d\u6742\u7684\u9879\u76ee\u53ef\u70b9\u51fb\u53f3\u4fa7 \u2699 \u8fdb\u884c\u914d\u7f6e"

    invoke-direct {v0, v5, v11}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    iget-object v5, v0, LD0/e;->a:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v0, v0, LD0/e;->b:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, Ljava/lang/String;

    new-instance v12, Landroid/widget/LinearLayout;

    move-object/from16 v15, v24

    invoke-direct {v12, v15}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v14, 0x10

    invoke-virtual {v12, v14}, Landroid/widget/LinearLayout;->setGravity(I)V

    sget-object v0, Lf0/V;->a:Lf0/V;

    const/4 v13, 0x4

    invoke-static {v15, v13}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v0

    const/4 v14, 0x6

    invoke-static {v15, v14}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    invoke-static {v15, v13}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v14

    const/16 v13, 0xe

    invoke-static {v15, v13}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v10

    invoke-virtual {v12, v0, v8, v14, v10}, Landroid/view/View;->setPadding(IIII)V

    const/16 v8, 0x2c

    invoke-static {v15, v8}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v10

    const/16 v14, 0xc

    invoke-static {v15, v14}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v15}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v14

    :try_start_0
    const-string v0, "com.abc.module"

    invoke-virtual {v14, v0}, Landroid/content/pm/PackageManager;->getApplicationIcon(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    sget-object v0, Lf0/P;->a:Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v21

    if-eqz v21, :cond_3

    goto :goto_1

    :cond_3
    const/4 v8, 0x0

    :try_start_1
    invoke-virtual {v14, v0, v8}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    iput-object v0, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    iput-object v0, v1, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    invoke-virtual {v1, v14}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :cond_6
    :goto_1
    const/4 v0, 0x0

    :goto_2
    new-instance v1, Landroid/widget/ImageView;

    invoke-direct {v1, v15}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    new-instance v8, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v8, v10, v10}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v8, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    if-eqz v0, :cond_7

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v8, 0x1

    invoke-virtual {v1, v8}, Landroid/view/View;->setClipToOutline(Z)V

    new-instance v0, Lf0/S;

    invoke-direct {v0, v13, v8}, Lf0/S;-><init>(II)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    goto :goto_3

    :cond_7
    sget v0, Lf0/V;->k:I

    invoke-static {v1, v13, v0}, Lf0/V;->c(Landroid/view/View;II)V

    :goto_3
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v8, 0x2c

    invoke-static {v15, v8}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v10

    invoke-static {v15, v8}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v13

    invoke-direct {v0, v10, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v8, 0xc

    invoke-static {v15, v8}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v10

    invoke-virtual {v0, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v12, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, v15}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v8, Lf0/V;->f:I

    const/high16 v10, 0x41980000    # 19.0f

    invoke-static {v15, v5, v10, v8, v1}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v5, Lf0/V;->h:I

    const/high16 v8, 0x41400000    # 12.0f

    const/4 v10, 0x0

    invoke-static {v15, v11, v8, v5, v10}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    const v1, 0x3f666666    # 0.9f

    invoke-virtual {v5, v1}, Landroid/view/View;->setAlpha(F)V

    const/4 v11, 0x2

    invoke-static {v15, v11}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v5, v10, v13, v10, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v14, -0x2

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-direct {v5, v10, v14, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v12, v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v7, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, v6, LQ0/m;->a:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    iget-object v0, v9, LQ0/m;->a:Ljava/lang/Object;

    check-cast v0, Lf0/Q;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const-string v22, "render"

    if-eqz v0, :cond_24

    const-string v6, "\u672a\u68c0\u6d4b"

    const/4 v12, 0x1

    if-eq v0, v12, :cond_10

    const/4 v13, 0x2

    if-ne v0, v13, :cond_f

    iget-object v0, v3, LQ0/m;->a:Ljava/lang/Object;

    if-eqz v0, :cond_e

    move-object v8, v0

    check-cast v8, LP0/a;

    sget-object v0, Lc0/h1;->a:Lc0/h1;

    const-string v0, "night_mode_follow"

    invoke-static {v0, v12}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v19

    invoke-static {v15}, Lf0/V;->k(Landroid/content/Context;)Z

    move-result v11

    const-string v12, "\u5916\u89c2\u914d\u8272"

    invoke-static {v7, v15, v12}, Lf0/V;->v(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    if-eqz v11, :cond_8

    const-string v11, "\u5f53\u524d\u5fae\u4fe1\uff1a\u6df1\u8272\u4e3b\u9898"

    :goto_4
    move-object/from16 v17, v11

    goto :goto_5

    :cond_8
    const-string v11, "\u5f53\u524d\u5fae\u4fe1\uff1a\u6d45\u8272\u4e3b\u9898"

    goto :goto_4

    :goto_5
    new-instance v13, Lf0/D;

    const/4 v11, 0x0

    invoke-direct {v13, v15, v8, v11}, Lf0/D;-><init>(Landroid/app/Activity;LP0/a;I)V

    const-string v18, "night_mode_follow"

    const/16 v20, 0x20

    const-string v21, "\u8ddf\u968f\u5fae\u4fe1\u6df1\u8272"

    const/16 v22, 0x1

    move-object/from16 v11, v25

    const/high16 v10, 0x41700000    # 15.0f

    move-object v12, v15

    move-object/from16 v26, v13

    const/high16 v10, 0x3f800000    # 1.0f

    move-object/from16 v13, v21

    const/16 v1, 0x10

    move-object/from16 v14, v17

    move-object/from16 v27, v15

    move-object/from16 v15, v18

    move/from16 v16, v22

    move-object/from16 v17, v26

    move/from16 v18, v20

    invoke-static/range {v11 .. v18}, Lf0/V;->o(Lf0/V;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLP0/a;I)Landroid/widget/LinearLayout;

    move-result-object v11

    if-eqz v19, :cond_9

    const-string v12, "\u5df2\u8ddf\u968f\u5fae\u4fe1\u8bbe\u7f6e\uff08\u5173\u95ed\u4e0a\u65b9\u8ddf\u8eab\u540e\u53ef\u624b\u52a8\u5207\u6362\uff09"

    :goto_6
    move-object/from16 v18, v12

    const/4 v12, 0x1

    goto :goto_7

    :cond_9
    const-string v12, "\u624b\u52a8\u5207\u6362 OKK \u754c\u9762\u6df1\u6d45\u914d\u8272"

    goto :goto_6

    :goto_7
    invoke-static {v0, v12}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static/range {v27 .. v27}, Lf0/V;->k(Landroid/content/Context;)Z

    move-result v0

    move/from16 v20, v0

    const/4 v13, 0x0

    goto :goto_8

    :cond_a
    const-string v0, "night_mode"

    const/4 v13, 0x0

    invoke-static {v0, v13}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v0

    move/from16 v20, v0

    :goto_8
    xor-int/lit8 v21, v19, 0x1

    new-instance v0, Lf0/E;

    invoke-direct {v0, v8, v13}, Lf0/E;-><init>(LP0/a;I)V

    const-string v17, "\u591c\u95f4\u6a21\u5f0f"

    const-string v19, "night_mode"

    move-object/from16 v16, v27

    move-object/from16 v22, v0

    invoke-static/range {v16 .. v22}, Lf0/V;->n(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/a;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v12, 0x2

    new-array v13, v12, [Landroid/view/View;

    const/4 v14, 0x0

    aput-object v11, v13, v14

    const/4 v11, 0x1

    aput-object v0, v13, v11

    move-object/from16 v15, v27

    invoke-static {v7, v15, v13}, Lf0/V;->j(Landroid/widget/LinearLayout;Landroid/content/Context;[Landroid/view/View;)V

    const-string v0, "\u7cfb\u7edf\u5165\u53e3"

    invoke-static {v7, v15, v0}, Lf0/V;->v(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lc0/D1;

    invoke-direct {v0, v12}, Lc0/D1;-><init>(I)V

    const-string v16, "module_log_enabled"

    const/16 v18, 0x20

    const-string v13, "\u6a21\u5757\u65e5\u5fd7\u8f93\u51fa"

    const-string v14, "\u5f00\u542f\u540e\u8bb0\u5f55 Hook \u8be6\u7ec6\u884c\u4e3a\u65e5\u5fd7"

    const/16 v17, 0x0

    move-object/from16 v11, v25

    move-object v12, v15

    move-object v10, v15

    move-object/from16 v15, v16

    move/from16 v16, v17

    move-object/from16 v17, v0

    invoke-static/range {v11 .. v18}, Lf0/V;->o(Lf0/V;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLP0/a;I)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v11, 0x1

    new-array v12, v11, [Landroid/view/View;

    const/4 v11, 0x0

    aput-object v0, v12, v11

    invoke-static {v7, v10, v12}, Lf0/V;->j(Landroid/widget/LinearLayout;Landroid/content/Context;[Landroid/view/View;)V

    const-string v0, "\u6a21\u5757\u4fe1\u606f"

    invoke-static {v7, v10, v0}, Lf0/V;->v(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    :try_start_2
    invoke-static {v10}, LU/S;->d0(Landroid/content/Context;)Lb0/s;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_9

    :catchall_2
    move-exception v0

    move-object v11, v0

    invoke-static {v11}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_9
    instance-of v11, v0, LD0/f;

    if-eqz v11, :cond_b

    const/4 v0, 0x0

    :cond_b
    check-cast v0, Lb0/s;

    const-string v11, "\u6a21\u5757\u540d\u79f0"

    const-string v12, "OKK (OKK)"

    invoke-static {v10, v11, v12}, Lf0/V;->m(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v11

    const-string v12, "\u8f6f\u4ef6\u7248\u672c"

    const-string v13, "v1.2.1 (Build 12)"

    invoke-static {v10, v12, v13}, Lf0/V;->m(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v12

    const-string v13, "\u76ee\u6807\u4f5c\u7528\u57df"

    const-string v14, "com.tencent.mm"

    invoke-static {v10, v13, v14}, Lf0/V;->m(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v13

    const-string v14, "\u9002\u914d\u7248\u672c\u8303\u56f4"

    const-string v15, "\u5fae\u4fe1 8.0.69\u20138.0.76\uff08\u56fd\u670d / Play\uff09"

    invoke-static {v10, v14, v15}, Lf0/V;->m(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v14

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lb0/s;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_c

    goto :goto_a

    :cond_c
    move-object v6, v0

    :cond_d
    :goto_a
    const-string v0, "\u5f53\u524d\u8fd0\u884c\u5fae\u4fe1"

    invoke-static {v10, v0, v6}, Lf0/V;->m(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v0

    const-string v6, "\u914d\u7f6e\u6587\u4ef6\u8def\u5f84"

    const-string v15, "/storage/emulated/0/Android/media/com.tencent.mm/OKK/"

    invoke-static {v10, v6, v15}, Lf0/V;->m(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v6

    const/4 v15, 0x6

    new-array v15, v15, [Landroid/view/View;

    const/4 v1, 0x0

    aput-object v11, v15, v1

    const/4 v11, 0x1

    aput-object v12, v15, v11

    const/4 v11, 0x2

    aput-object v13, v15, v11

    const/4 v11, 0x3

    aput-object v14, v15, v11

    const/4 v11, 0x4

    aput-object v0, v15, v11

    const/4 v11, 0x5

    aput-object v6, v15, v11

    invoke-static {v7, v10, v15}, Lf0/V;->j(Landroid/widget/LinearLayout;Landroid/content/Context;[Landroid/view/View;)V

    const-string v0, "\u91cd\u7f6e"

    invoke-static {v7, v10, v0}, Lf0/V;->v(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v6, 0x34

    invoke-static {v10, v6}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v0, v6}, Landroid/view/View;->setMinimumHeight(I)V

    invoke-static {v10, v1}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    const/16 v11, 0xa

    invoke-static {v10, v11}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v12

    invoke-static {v10, v1}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v1

    invoke-static {v10, v11}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v0, v6, v12, v1, v13}, Landroid/view/View;->setPadding(IIII)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusable(Z)V

    new-instance v1, Lf0/F;

    invoke-direct {v1, v10, v8}, Lf0/F;-><init>(Landroid/app/Activity;LP0/a;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v6, "\u91cd\u7f6e\u6240\u6709\u529f\u80fd"

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v6, 0x41680000    # 14.5f

    const/4 v8, 0x2

    invoke-virtual {v1, v8, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    const v6, -0x1ac6cb

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v6, "sans-serif-medium"

    const/4 v8, 0x0

    invoke-static {v6, v8}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v12, -0x2

    invoke-direct {v6, v8, v12, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v6, "\u5c06\u6240\u6709\u8bbe\u7f6e\u6062\u590d\u4e3a\u9ed8\u8ba4 >"

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v6, 0x41480000    # 12.5f

    const/4 v8, 0x2

    invoke-virtual {v1, v8, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    sget v6, Lf0/V;->h:I

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 v1, 0x1

    new-array v6, v1, [Landroid/view/View;

    const/4 v1, 0x0

    aput-object v0, v6, v1

    invoke-static {v7, v10, v6}, Lf0/V;->j(Landroid/widget/LinearLayout;Landroid/content/Context;[Landroid/view/View;)V

    move-object v1, v2

    move-object/from16 v23, v3

    move-object/from16 v29, v4

    move-object v2, v5

    move-object/from16 v28, v9

    goto/16 :goto_22

    :cond_e
    invoke-static/range {v22 .. v22}, LQ0/g;->g(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1

    :cond_f
    new-instance v0, LD0/c;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_10
    move v12, v14

    move-object v10, v15

    iget-object v0, v3, LQ0/m;->a:Ljava/lang/Object;

    if-eqz v0, :cond_23

    move-object v1, v0

    check-cast v1, LP0/a;

    :try_start_3
    invoke-static {v10}, LU/S;->d0(Landroid/content/Context;)Lb0/s;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_b

    :catchall_3
    move-exception v0

    move-object v13, v0

    invoke-static {v13}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_b
    instance-of v13, v0, LD0/f;

    if-eqz v13, :cond_11

    const/4 v0, 0x0

    :cond_11
    move-object v13, v0

    check-cast v13, Lb0/s;

    :try_start_4
    sget-object v0, LU/S;->g:Lb0/a;

    if-nez v0, :cond_12

    invoke-static {}, LU/S;->L()Lb0/a;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_c

    :catchall_4
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :cond_12
    :goto_c
    instance-of v14, v0, LD0/f;

    if-eqz v14, :cond_13

    const/4 v0, 0x0

    :cond_13
    move-object v14, v0

    check-cast v14, Lb0/a;

    :try_start_5
    sget-object v0, Le0/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {}, Le0/c;->i()Ljava/lang/String;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_d

    :catchall_5
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_d
    instance-of v15, v0, LD0/f;

    if-eqz v15, :cond_14

    const-string v0, "\u672a\u77e5"

    :cond_14
    move-object v15, v0

    check-cast v15, Ljava/lang/String;

    :try_start_6
    sget-object v0, Le0/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {}, Le0/c;->h()Ljava/util/List;

    move-result-object v0

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v8, v12

    check-cast v8, Le0/a;

    iget-object v8, v8, Le0/a;->b:Le0/b;

    move-object/from16 v21, v0

    sget-object v0, Le0/b;->c:Le0/b;

    if-ne v8, v0, :cond_15

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_15
    move-object/from16 v0, v21

    const/high16 v8, 0x41400000    # 12.0f

    const/4 v12, -0x2

    goto :goto_e

    :catchall_6
    move-exception v0

    goto :goto_10

    :cond_16
    new-instance v0, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v11, v8}, LE0/n;->k0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v0, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_17

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Le0/a;

    iget-object v11, v11, Le0/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_f

    :goto_10
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :cond_17
    sget-object v8, LE0/u;->a:LE0/u;

    instance-of v11, v0, LD0/f;

    if-eqz v11, :cond_18

    move-object v0, v8

    :cond_18
    move-object v11, v0

    check-cast v11, Ljava/util/List;

    :try_start_7
    sget-object v0, Le0/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {}, Le0/c;->a()Ljava/util/List;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    goto :goto_11

    :catchall_7
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_11
    instance-of v12, v0, LD0/f;

    if-eqz v12, :cond_19

    goto :goto_12

    :cond_19
    move-object v8, v0

    :goto_12
    check-cast v8, Ljava/util/List;

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v12, 0x0

    invoke-virtual {v0, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v12, 0x10

    invoke-virtual {v0, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    move-object/from16 v21, v6

    invoke-static {v10, v12}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    move-object/from16 v29, v4

    move-object/from16 v28, v9

    const/16 v9, 0xe

    invoke-static {v10, v9}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    move-object/from16 v30, v2

    invoke-static {v10, v12}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-static {v10, v9}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v12

    invoke-virtual {v0, v6, v4, v2, v12}, Landroid/view/View;->setPadding(IIII)V

    sget v2, Lf0/V;->d:I

    const/16 v4, 0x10

    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    invoke-static {v2, v6}, Lf0/V;->t(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const-string v2, "#2E7D32"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    const-string v4, "\u25cf"

    const/high16 v6, 0x41900000    # 18.0f

    const/4 v9, 0x1

    invoke-static {v10, v4, v6, v2, v9}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v2

    const/16 v4, 0x11

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v6, 0x1c

    invoke-static {v10, v6}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v12

    invoke-static {v10, v6}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    invoke-direct {v4, v12, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v4, Lf0/V;->g:I

    const-string v6, "\u6a21\u5757\u5df2\u6fc0\u6d3b\u8fd0\u884c"

    const/high16 v12, 0x41700000    # 15.0f

    invoke-static {v10, v6, v12, v4, v9}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    if-eqz v13, :cond_1a

    invoke-virtual {v13}, Lb0/s;->a()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1b

    :cond_1a
    const-string v4, "\u5fae\u4fe1"

    :cond_1b
    const-string v6, "LSPosed \u00b7 "

    const-string v9, " \u00b7 v1.2.1"

    invoke-static {v6, v4, v9}, LS/d;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v6, Lf0/V;->h:I

    const/high16 v9, 0x41400000    # 12.0f

    const/4 v12, 0x0

    invoke-static {v10, v4, v9, v6, v12}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, -0x2

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct {v4, v12, v6, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const/16 v9, 0x8

    invoke-static {v10, v9}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v12

    invoke-virtual {v4, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v0, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v2, v4, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0xc

    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    iput v6, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v7, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const-string v0, "\u9002\u914d\u68c0\u6d4b\u603b\u7ed3"

    invoke-static {v7, v10, v0}, Lf0/V;->v(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    if-eqz v13, :cond_1d

    invoke-virtual {v13}, Lb0/s;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1c

    goto :goto_13

    :cond_1c
    move-object v6, v0

    goto :goto_14

    :cond_1d
    :goto_13
    move-object/from16 v6, v21

    :goto_14
    const-string v0, "\u5f53\u524d\u5fae\u4fe1"

    invoke-static {v10, v0, v6}, Lf0/V;->m(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-eqz v14, :cond_1e

    invoke-virtual {v14}, Lb0/a;->e()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1f

    :cond_1e
    const-string v2, "\u672a\u751f\u6210\u62a5\u544a"

    :cond_1f
    const-string v4, "\u63a2\u9488\u6c47\u603b"

    invoke-static {v10, v4, v2}, Lf0/V;->m(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_20

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_20

    const-string v4, "\u65e0"

    goto :goto_15

    :cond_20
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v11}, Ljava/util/Collection;->size()I

    move-result v6

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v9

    add-int/2addr v9, v6

    invoke-direct {v4, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const/16 v34, 0x0

    const/16 v36, 0x3e

    const-string v32, ", "

    const/16 v33, 0x0

    const/16 v35, 0x0

    move-object/from16 v31, v4

    invoke-static/range {v31 .. v36}, LE0/l;->r0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LP0/l;I)Ljava/lang/String;

    move-result-object v4

    :goto_15
    const-string v6, "\u672a\u6309\u9884\u671f\u52a0\u8f7d"

    invoke-static {v10, v6, v4}, Lf0/V;->m(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/widget/LinearLayout;

    move-result-object v4

    const/4 v6, 0x3

    new-array v6, v6, [Landroid/view/View;

    const/4 v8, 0x0

    aput-object v0, v6, v8

    const/4 v8, 0x1

    aput-object v2, v6, v8

    const/4 v2, 0x2

    aput-object v4, v6, v2

    invoke-static {v7, v10, v6}, Lf0/V;->j(Landroid/widget/LinearLayout;Landroid/content/Context;[Landroid/view/View;)V

    new-instance v0, Lf0/D;

    invoke-direct {v0, v10, v1, v8}, Lf0/D;-><init>(Landroid/app/Activity;LP0/a;I)V

    const-string v2, "\u91cd\u65b0\u68c0\u67e5\u9002\u914d\u70b9"

    invoke-static {v10, v2, v0}, Lf0/V;->r(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v4, 0x2e

    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    const/4 v4, -0x1

    invoke-direct {v2, v4, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v4, 0x4

    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    iput v6, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    const/16 v4, 0xc

    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    iput v6, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v7, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const-string v0, "\u6a21\u5757\u8fd0\u884c\u65e5\u5fd7"

    invoke-static {v7, v10, v0}, Lf0/V;->v(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v2, Lf0/V;->d:I

    const/16 v4, 0x10

    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    invoke-static {v2, v6}, Lf0/V;->t(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v2, 0xe

    invoke-static {v10, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    const/16 v8, 0xc

    invoke-static {v10, v8}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v9

    invoke-static {v10, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-static {v10, v8}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v11

    invoke-virtual {v0, v6, v9, v2, v11}, Landroid/view/View;->setPadding(IIII)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x0

    invoke-virtual {v2, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    sget v4, Lf0/V;->j:I

    const-string v8, "\u65e5\u5fd7\u63a7\u5236\u53f0"

    const/high16 v9, 0x41600000    # 14.0f

    const/4 v11, 0x1

    invoke-static {v10, v8, v9, v4, v11}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v4

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v9, -0x2

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-direct {v8, v6, v9, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v2, v4, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Lf0/E;

    invoke-direct {v4, v1, v11}, Lf0/E;-><init>(LP0/a;I)V

    const-string v6, "\u00d7"

    invoke-static {v10, v6, v4}, Lf0/V;->q(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Lf0/E;

    const/4 v6, 0x2

    invoke-direct {v4, v1, v6}, Lf0/E;-><init>(LP0/a;I)V

    const-string v6, "\u21bb"

    invoke-static {v10, v6, v4}, Lf0/V;->q(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/Switch;

    invoke-direct {v4, v10}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    sget-object v6, Lcom/abc/core/hooks/ModuleLog;->INSTANCE:Lcom/abc/core/hooks/ModuleLog;

    invoke-virtual {v6}, Lcom/abc/core/hooks/ModuleLog;->isEnabled()Z

    move-result v8

    invoke-virtual {v4, v8}, Landroid/widget/Switch;->setChecked(Z)V

    new-instance v8, Lf0/j;

    const/4 v9, 0x0

    invoke-direct {v8, v4, v1, v9}, Lf0/j;-><init>(Ljava/lang/Object;LP0/a;I)V

    invoke-virtual {v4, v8}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x2

    const/4 v8, -0x1

    invoke-direct {v1, v8, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0x8

    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    iput v8, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v0, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Landroid/widget/ScrollView;

    invoke-direct {v1, v10}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v9}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->setOverScrollMode(I)V

    sget-boolean v2, Lf0/V;->n:Z

    if-eqz v2, :cond_21

    const-string v2, "#1AFFFFFF"

    :goto_16
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    const/16 v4, 0xc

    goto :goto_17

    :cond_21
    const-string v2, "#0A000000"

    goto :goto_16

    :goto_17
    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    invoke-static {v2, v8}, Lf0/V;->t(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v2, 0xa

    invoke-static {v10, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    const/16 v8, 0x8

    invoke-static {v10, v8}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v9

    invoke-static {v10, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v11

    invoke-static {v10, v8}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v4, v9, v11, v2}, Landroid/view/View;->setPadding(IIII)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/16 v4, 0x190

    invoke-virtual {v6, v4}, Lcom/abc/core/hooks/ModuleLog;->text(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v4, 0x41380000    # 11.5f

    const/4 v6, 0x2

    invoke-virtual {v2, v6, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    sget v4, Lf0/V;->h:I

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v4, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-static {v10, v6}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    int-to-float v4, v4

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-virtual {v2, v4, v6}, Landroid/widget/TextView;->setLineSpacing(FF)V

    invoke-virtual {v1, v2}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v4, 0x104

    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    const/4 v6, -0x1

    invoke-direct {v2, v6, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v6, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0xc

    invoke-static {v10, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v7, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Ld0/e;

    invoke-direct {v0, v10, v13, v14, v15}, Ld0/e;-><init>(Landroid/app/Activity;Lb0/s;Lb0/a;Ljava/lang/String;)V

    const-string v1, "\u590d\u5236\u5b8c\u6574\u8bca\u65ad\u4fe1\u606f"

    invoke-static {v10, v1, v0}, Lf0/V;->u(Landroid/content/Context;Ljava/lang/String;LP0/a;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v4, 0x2c

    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v4

    invoke-direct {v1, v6, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v10, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v7, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v23, v3

    move-object v2, v5

    :cond_22
    move-object/from16 v1, v30

    goto/16 :goto_22

    :cond_23
    invoke-static/range {v22 .. v22}, LQ0/g;->g(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1

    :cond_24
    move-object/from16 v30, v2

    move-object/from16 v29, v4

    move-object/from16 v28, v9

    move-object v10, v15

    const/4 v1, 0x0

    iput-object v1, v6, LQ0/m;->a:Ljava/lang/Object;

    iget-object v0, v3, LQ0/m;->a:Ljava/lang/Object;

    if-eqz v0, :cond_38

    check-cast v0, LP0/a;

    new-instance v0, Lf0/H;

    new-instance v1, Lf0/C;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lf0/C;-><init>(I)V

    const-string v33, "\u62e6\u622a\u64a4\u56de\u6307\u4ee4\uff0c\u4fdd\u7559\u539f\u6d88\u606f"

    const-string v34, "anti_revoke"

    const-string v32, "\u9632\u64a4\u56de"

    const/16 v35, 0x1

    const/16 v36, 0x1

    move-object/from16 v31, v0

    move-object/from16 v37, v1

    invoke-direct/range {v31 .. v37}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v32, Lf0/H;

    const/16 v42, 0x0

    const/16 v43, 0x0

    const-string v38, "\u6ed1\u52a8\u624b\u52bf\u5f15\u7528"

    const-string v39, "\u6d88\u606f\u5de6\u6ed1\u5feb\u901f\u5f15\u7528\u56de\u590d"

    const-string v40, "swipe_quote"

    const/16 v41, 0x1

    move-object/from16 v37, v32

    invoke-direct/range {v37 .. v43}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v33, Lf0/H;

    const/16 v49, 0x0

    const/16 v50, 0x0

    const-string v45, "\u5220\u9664\u952e\u6e05\u5f15\u7528"

    const-string v46, "\u8f93\u5165\u6846\u4e3a\u7a7a\u65f6\u6309\u5220\u9664\u952e\u53d6\u6d88\u5f15\u7528"

    const-string v47, "quote_delete_clear"

    const/16 v48, 0x0

    move-object/from16 v44, v33

    invoke-direct/range {v44 .. v50}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v1, Lf0/H;

    const/16 v39, 0x0

    const/16 v40, 0x0

    const-string v35, "\u957f\u6309\u4fee\u6539\u6d88\u606f"

    const-string v36, "\u4ec5\u4fee\u6539\u672c\u5730\u663e\u793a\u6587\u672c\uff0c\u5bf9\u65b9\u4e0d\u53ef\u89c1"

    const-string v37, "edit_message"

    const/16 v38, 0x0

    move-object/from16 v34, v1

    invoke-direct/range {v34 .. v40}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v35, Lf0/H;

    new-instance v2, Lf0/C;

    const/4 v4, 0x3

    invoke-direct {v2, v4}, Lf0/C;-><init>(I)V

    const-string v43, "\u7fa4\u6635\u79f0\u65c1\u663e\u793a\u7fa4\u4e3b/\u7ba1\u7406\u5458/\u6210\u5458\u5fbd\u7ae0"

    const-string v44, "member_title"

    const-string v42, "\u7fa4\u5458\u5934\u8854"

    const/16 v45, 0x0

    const/16 v46, 0x1

    move-object/from16 v41, v35

    move-object/from16 v47, v2

    invoke-direct/range {v41 .. v47}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v36, Lf0/H;

    new-instance v2, Lf0/C;

    const/4 v4, 0x4

    invoke-direct {v2, v4}, Lf0/C;-><init>(I)V

    const-string v49, "\u7fa4\u804a/\u4e2a\u4eba\u804a\u5929\u754c\u9762\u8865\u5145\u663e\u793a\u5b9e\u540d"

    const-string v50, "real_name_tail"

    const-string v48, "\u5b9e\u540d\u4fe1\u606f"

    const/16 v51, 0x0

    const/16 v52, 0x1

    move-object/from16 v47, v36

    move-object/from16 v53, v2

    invoke-direct/range {v47 .. v53}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v2, Lf0/H;

    new-instance v4, Lf0/C;

    const/4 v6, 0x5

    invoke-direct {v4, v6}, Lf0/C;-><init>(I)V

    const-string v39, "\u6d88\u606f\u65c1\u663e\u793a\u7cbe\u7ec6\u53d1\u9001\u65f6\u95f4"

    const-string v40, "detail_enabled"

    const-string v38, "\u6d88\u606f\u5e95\u90e8\u65f6\u95f4"

    const/16 v41, 0x1

    const/16 v42, 0x1

    move-object/from16 v37, v2

    move-object/from16 v43, v4

    invoke-direct/range {v37 .. v43}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v38, Lf0/H;

    new-instance v4, Lf0/C;

    const/4 v6, 0x6

    invoke-direct {v4, v6}, Lf0/C;-><init>(I)V

    const-string v45, "\u8f93\u5165\u6846\u5b9e\u65f6\u7edf\u8ba1\u5f53\u65e5\u5df2\u53d1\u6d88\u606f\u6570"

    const-string v46, "input_stats_enabled"

    const-string v44, "\u8f93\u5165\u6846\u7edf\u8ba1"

    const/16 v47, 0x1

    const/16 v48, 0x1

    move-object/from16 v43, v38

    move-object/from16 v49, v4

    invoke-direct/range {v43 .. v49}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    move-object/from16 v31, v0

    move-object/from16 v34, v1

    move-object/from16 v37, v2

    filled-new-array/range {v31 .. v38}, [Lf0/H;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lf0/H;

    const/16 v36, 0x0

    const/16 v37, 0x0

    const-string v32, "\u670b\u53cb\u5708\u9632\u5220\u9664"

    const-string v33, "\u597d\u53cb\u52a8\u6001\u5220\u9664\u540e\u672c\u5730\u4ecd\u53ef\u89c1"

    const-string v34, "anti_moments_delete"

    const/16 v35, 0x1

    move-object/from16 v31, v1

    invoke-direct/range {v31 .. v37}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v2, Lf0/H;

    const/16 v43, 0x0

    const/16 v44, 0x0

    const-string v39, "\u670b\u53cb\u5708\u8bc4\u8bba\u9632\u64a4\u56de"

    const-string v40, "\u5bf9\u65b9\u5220\u9664\u8bc4\u8bba\u540e\u672c\u5730\u4fdd\u7559"

    const-string v41, "anti_moments_comment_revoke"

    const/16 v42, 0x1

    move-object/from16 v38, v2

    invoke-direct/range {v38 .. v44}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v4, Lf0/H;

    const/16 v36, 0x0

    const/16 v37, 0x0

    const-string v32, "\u53bb\u9664\u670b\u53cb\u5708\u5e7f\u544a"

    const-string v33, "\u81ea\u52a8\u62e6\u622a\u670b\u53cb\u5708 ADInfo \u5e7f\u544a"

    const-string v34, "remove_moments_ads"

    const/16 v35, 0x0

    move-object/from16 v31, v4

    invoke-direct/range {v31 .. v37}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    filled-new-array {v1, v2, v4}, [Lf0/H;

    move-result-object v1

    invoke-static {v1}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lf0/H;

    new-instance v4, Lf0/C;

    const/4 v6, 0x7

    invoke-direct {v4, v6}, Lf0/C;-><init>(I)V

    const-string v33, "\u4f7f\u7528\u81ea\u5b9a\u4e49 9.png \u6c14\u6ce1\u76ae\u80a4"

    const-string v34, "bubble_enabled"

    const-string v32, "\u6c14\u6ce1\u76ae\u80a4"

    const/16 v35, 0x0

    const/16 v36, 0x1

    move-object/from16 v31, v2

    move-object/from16 v37, v4

    invoke-direct/range {v31 .. v37}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v4, Lf0/H;

    new-instance v6, Lf0/C;

    const/16 v8, 0x8

    invoke-direct {v6, v8}, Lf0/C;-><init>(I)V

    const-string v39, "\u81ea\u5b9a\u4e49\u5934\u50cf\u5706\u89d2\u5ea6\uff08\u65b9\u5706/\u5168\u5706\uff09"

    const-string v40, "round_avatar_enabled"

    const-string v38, "\u5706\u5f62\u5934\u50cf"

    const/16 v41, 0x0

    const/16 v42, 0x1

    move-object/from16 v37, v4

    move-object/from16 v43, v6

    invoke-direct/range {v37 .. v43}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v6, Lf0/H;

    new-instance v8, Lf0/C;

    const/16 v9, 0x9

    invoke-direct {v8, v9}, Lf0/C;-><init>(I)V

    const-string v33, "\u4e3b\u754c\u9762/\u8bbe\u7f6e\u80cc\u666f\u58c1\u7eb8\u4e0e\u900f\u660e\u5ea6"

    const-string v34, "theme_wallpaper_enabled"

    const-string v32, "\u4e3b\u9898\u58c1\u7eb8"

    const/16 v35, 0x0

    const/16 v36, 0x1

    move-object/from16 v31, v6

    move-object/from16 v37, v8

    invoke-direct/range {v31 .. v37}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v8, Lf0/H;

    const/16 v42, 0x0

    const/16 v43, 0x0

    const-string v38, "\u4fa7\u8fb9\u680f"

    const-string v39, "\u4f1a\u8bdd\u9996\u9875\u5de6\u4e0a\u89d2\u663e\u793a\u5165\u53e3\uff0c\u6253\u5f00\u5feb\u6377\u4fa7\u8fb9\u680f"

    const-string v40, "home_avatar_entry"

    const/16 v41, 0x1

    move-object/from16 v37, v8

    invoke-direct/range {v37 .. v43}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    filled-new-array {v2, v4, v6, v8}, [Lf0/H;

    move-result-object v2

    invoke-static {v2}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v4, Lf0/H;

    new-instance v6, Lf0/C;

    const/16 v8, 0xa

    invoke-direct {v6, v8}, Lf0/C;-><init>(I)V

    const-string v33, "\u6539\u5199\u817e\u8baf\u5b9a\u4f4d\u670d\u52a1\u7ecf\u7eac\u5ea6"

    const-string v34, "virtual_location_enabled"

    const-string v32, "\u865a\u62df\u5b9a\u4f4d"

    const/16 v35, 0x0

    const/16 v36, 0x1

    move-object/from16 v31, v4

    move-object/from16 v37, v6

    invoke-direct/range {v31 .. v37}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v6, Lf0/H;

    new-instance v8, Lf0/C;

    const/16 v9, 0xb

    invoke-direct {v8, v9}, Lf0/C;-><init>(I)V

    const-string v39, "\u767b\u5f55\u786e\u8ba4\u9875\u81ea\u52a8\u52fe\u9009\u5e76\u63d0\u4ea4"

    const-string v40, "auto_login_win_enabled"

    const-string v38, "PC \u81ea\u52a8\u767b\u5f55"

    const/16 v41, 0x0

    const/16 v42, 0x1

    move-object/from16 v37, v6

    move-object/from16 v43, v8

    invoke-direct/range {v37 .. v43}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v8, Lf0/H;

    const/16 v36, 0x0

    const/16 v37, 0x0

    const-string v32, "\u5c4f\u853d\u70ed\u66f4\u65b0"

    const-string v33, "\u7981\u7528 Tinker \u8865\u4e01\u70ed\u66f4\u65b0"

    const-string v34, "disable_hot_update"

    const/16 v35, 0x0

    move-object/from16 v31, v8

    invoke-direct/range {v31 .. v37}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v9, Lf0/H;

    new-instance v11, Lf0/C;

    const/4 v12, 0x1

    invoke-direct {v11, v12}, Lf0/C;-><init>(I)V

    const-string v40, "\u5fae\u4fe1\u63a5\u6536\u7684\u804a\u5929\u6587\u4ef6\u4fdd\u5b58\u5230\u81ea\u5b9a\u4e49\u76ee\u5f55"

    const-string v41, "download_redirect_enabled"

    const-string v39, "\u4e0b\u8f7d\u91cd\u5b9a\u5411"

    const/16 v42, 0x0

    const/16 v43, 0x1

    move-object/from16 v38, v9

    move-object/from16 v44, v11

    invoke-direct/range {v38 .. v44}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    filled-new-array {v4, v6, v8, v9}, [Lf0/H;

    move-result-object v4

    invoke-static {v4}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    new-instance v6, Lf0/H;

    const/16 v36, 0x0

    const/16 v37, 0x0

    const-string v32, "\u9690\u85cf\u5e95\u680f\u6807\u9898"

    const-string v33, "\u5e95\u680f\u6807\u7b7e\u9690\u85cf\u6587\u5b57\u4ec5\u4fdd\u7559\u56fe\u6807"

    const-string v34, "bottom_tab_hide_title"

    const/16 v35, 0x0

    move-object/from16 v31, v6

    invoke-direct/range {v31 .. v37}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v8, Lf0/H;

    new-instance v9, Lf0/C;

    const/4 v11, 0x2

    invoke-direct {v9, v11}, Lf0/C;-><init>(I)V

    const-string v40, "\u5706\u89d2\u80f6\u56ca\u5e95\u680f\u4e0e\u56db\u4e2a\u81ea\u5b9a\u4e49\u6807\u9898"

    const-string v41, "bottom_tab_floating"

    const-string v39, "\u60ac\u6d6e\u5e95\u680f"

    const/16 v42, 0x0

    const/16 v43, 0x1

    move-object/from16 v38, v8

    move-object/from16 v44, v9

    invoke-direct/range {v38 .. v44}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v9, Lf0/H;

    const/16 v36, 0x0

    const/16 v37, 0x0

    const-string v32, "\u6298\u53e0\u7f6e\u9876\u56fa\u5b9a"

    const-string v33, "\u56fa\u5b9a\u9996\u9875\u6298\u53e0\u7f6e\u9876\u804a\u5929\u5217\u8868\u9879"

    const-string v34, "fold_banner_fixed"

    const/16 v35, 0x0

    move-object/from16 v31, v9

    invoke-direct/range {v31 .. v37}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v11, Lf0/H;

    const/16 v43, 0x0

    const/16 v44, 0x0

    const-string v39, "\u5c4f\u853d\u9996\u9875\u5206\u5272\u7ebf"

    const-string v40, "\u9690\u85cf\u4f1a\u8bdd\u884c\u4e4b\u95f4\u7684\u7ec6\u5206\u5272\u7ebf"

    const-string v41, "hide_home_divider"

    const/16 v42, 0x0

    move-object/from16 v38, v11

    invoke-direct/range {v38 .. v44}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    new-instance v12, Lf0/H;

    const/16 v36, 0x0

    const/16 v37, 0x0

    const-string v32, "\u8d44\u6599\u9875\u663e\u793a ID"

    const-string v33, "\u8054\u7cfb\u4eba\u4e0e\u7fa4\u8d44\u6599\u9875\u8865\u5145\u663e\u793a wxid"

    const-string v34, "profile_id"

    const/16 v35, 0x0

    move-object/from16 v31, v12

    invoke-direct/range {v31 .. v37}, Lf0/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLP0/p;)V

    filled-new-array {v6, v8, v9, v11, v12}, [Lf0/H;

    move-result-object v6

    invoke-static {v6}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    sget-object v8, Lf0/G;->d:Lf0/G;

    new-instance v9, LD0/e;

    invoke-direct {v9, v8, v0}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lf0/G;->e:Lf0/G;

    new-instance v8, LD0/e;

    invoke-direct {v8, v0, v1}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lf0/G;->f:Lf0/G;

    new-instance v1, LD0/e;

    invoke-direct {v1, v0, v2}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lf0/G;->g:Lf0/G;

    new-instance v2, LD0/e;

    invoke-direct {v2, v0, v4}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lf0/G;->h:Lf0/G;

    new-instance v4, LD0/e;

    invoke-direct {v4, v0, v6}, LD0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v9, v8, v1, v2, v4}, [LD0/e;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_18
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_32

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD0/e;

    iget-object v9, v0, LD0/e;->a:Ljava/lang/Object;

    check-cast v9, Lf0/G;

    iget-object v0, v0, LD0/e;->b:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, Ljava/util/List;

    instance-of v0, v11, Ljava/util/Collection;

    if-eqz v0, :cond_25

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_25

    const/4 v12, 0x0

    goto :goto_1a

    :cond_25
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v12, 0x0

    :cond_26
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_28

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lf0/H;

    sget-object v14, Lc0/h1;->a:Lc0/h1;

    iget-object v14, v13, Lf0/H;->c:Ljava/lang/String;

    iget-boolean v13, v13, Lf0/H;->d:Z

    invoke-static {v14, v13}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v13

    if-eqz v13, :cond_26

    const/4 v13, 0x1

    add-int/2addr v12, v13

    if-ltz v12, :cond_27

    goto :goto_19

    :cond_27
    invoke-static {}, LE0/m;->i0()V

    const/4 v1, 0x0

    throw v1

    :cond_28
    :goto_1a
    iget-object v13, v9, Lf0/G;->a:Ljava/lang/String;

    iget-object v0, v9, Lf0/G;->c:Ljava/lang/String;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v14

    new-instance v15, Landroid/widget/LinearLayout;

    invoke-direct {v15, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    move-object/from16 v20, v4

    const/4 v4, 0x0

    invoke-virtual {v15, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v4, 0x10

    invoke-virtual {v15, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    move-object/from16 v23, v3

    const/4 v4, 0x4

    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v3

    move-object/from16 v31, v6

    move-object/from16 v22, v8

    const/16 v8, 0x8

    invoke-static {v10, v8}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    move-object/from16 v32, v5

    const/4 v4, 0x6

    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v15, v3, v6, v8, v5}, Landroid/view/View;->setPadding(IIII)V

    :try_start_8
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    goto :goto_1b

    :catchall_8
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1b
    sget v3, Lf0/V;->j:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    instance-of v4, v0, LD0/f;

    if-eqz v4, :cond_29

    move-object v0, v3

    :cond_29
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v4, v9, Lf0/G;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v4, 0x41500000    # 13.0f

    const/4 v5, 0x2

    invoke-virtual {v3, v5, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    const/16 v4, 0x11

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setGravity(I)V

    const/16 v4, 0x8

    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    invoke-static {v5, v0}, Lf0/V;->i(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v5, 0x18

    invoke-static {v10, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v6

    invoke-static {v10, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    invoke-direct {v0, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v15, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget v0, Lf0/V;->f:I

    const/high16 v3, 0x41600000    # 14.0f

    const/4 v4, 0x1

    invoke-static {v10, v13, v3, v0, v4}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, -0x2

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct {v5, v4, v6, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v15, v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " / "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " \u5df2\u5f00\u542f"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-lez v12, :cond_2a

    sget v4, Lf0/V;->j:I

    :goto_1c
    const/high16 v5, 0x41400000    # 12.0f

    const/4 v6, 0x0

    goto :goto_1d

    :cond_2a
    sget v4, Lf0/V;->h:I

    goto :goto_1c

    :goto_1d
    invoke-static {v10, v0, v5, v4, v6}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    invoke-virtual {v15, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v7, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-interface {v2, v9, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v5, Lf0/V;->d:I

    const/16 v6, 0x10

    invoke-static {v10, v6}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    invoke-static {v5, v8}, Lf0/V;->t(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move-object/from16 v8, v22

    move-object/from16 v6, v31

    const/4 v11, 0x0

    :goto_1e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_31

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    add-int/lit8 v13, v11, 0x1

    if-ltz v11, :cond_30

    check-cast v12, Lf0/H;

    if-lez v11, :cond_2b

    new-instance v11, Landroid/view/View;

    invoke-direct {v11, v10}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    sget v14, Lf0/V;->l:I

    invoke-virtual {v11, v14}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v15, -0x1

    invoke-direct {v14, v15, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0x10

    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v15

    invoke-virtual {v14, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v15

    invoke-virtual {v14, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v0, v11, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2b
    new-instance v4, Lf0/v;

    const/4 v11, 0x3

    invoke-direct {v4, v9, v1, v2, v11}, Lf0/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sget-object v14, Lc0/h1;->a:Lc0/h1;

    iget-object v14, v12, Lf0/H;->c:Ljava/lang/String;

    iget-boolean v15, v12, Lf0/H;->d:Z

    invoke-static {v14, v15}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v14

    new-instance v15, Landroid/widget/Switch;

    invoke-direct {v15, v10}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    invoke-virtual {v15, v14}, Landroid/widget/Switch;->setChecked(Z)V

    new-instance v14, Lf0/j;

    const/4 v3, 0x1

    invoke-direct {v14, v12, v4, v3}, Lf0/j;-><init>(Ljava/lang/Object;LP0/a;I)V

    invoke-virtual {v15, v14}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v14, 0x0

    invoke-virtual {v3, v14}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v14, 0x10

    invoke-virtual {v3, v14}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v11, 0x3a

    invoke-static {v10, v11}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v11

    invoke-virtual {v3, v11}, Landroid/view/View;->setMinimumHeight(I)V

    invoke-static {v10, v14}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v11

    move-object/from16 v33, v1

    const/16 v14, 0xa

    invoke-static {v10, v14}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v1

    move-object/from16 v34, v2

    move-object/from16 v19, v5

    const/16 v2, 0xc

    invoke-static {v10, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    invoke-static {v10, v14}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v3, v11, v1, v5, v2}, Landroid/view/View;->setPadding(IIII)V

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v5, Lf0/V;->g:I

    iget-object v11, v12, Lf0/H;->a:Ljava/lang/String;

    const/high16 v14, 0x41700000    # 15.0f

    invoke-static {v10, v11, v14, v5, v2}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v5, v12, Lf0/H;->b:Ljava/lang/String;

    invoke-static {v5}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v5

    xor-int/2addr v5, v2

    if-eqz v5, :cond_2c

    sget v2, Lf0/V;->h:I

    iget-object v5, v12, Lf0/H;->b:Ljava/lang/String;

    const/high16 v11, 0x41400000    # 12.0f

    const/4 v14, 0x0

    invoke-static {v10, v5, v11, v2, v14}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v2

    const/4 v5, 0x2

    invoke-static {v10, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v11

    invoke-virtual {v2, v14, v11, v14, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setMaxLines(I)V

    const v5, 0x3f666666    # 0.9f

    invoke-virtual {v2, v5}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_1f

    :cond_2c
    const v5, 0x3f666666    # 0.9f

    const/4 v14, 0x0

    :goto_1f
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v11, -0x2

    invoke-direct {v2, v14, v11, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const/16 v5, 0x8

    invoke-static {v10, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v11

    invoke-virtual {v2, v11}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v3, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-boolean v1, v12, Lf0/H;->e:Z

    if-eqz v1, :cond_2d

    iget-object v1, v12, Lf0/H;->f:LP0/p;

    if-eqz v1, :cond_2d

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, v10}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v2, "\u2699"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x41880000    # 17.0f

    const/4 v5, 0x2

    invoke-virtual {v1, v5, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    sget v2, Lf0/V;->j:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v2, 0x11

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    const/16 v2, 0x8

    invoke-static {v10, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    const/4 v11, 0x6

    invoke-static {v10, v11}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v14

    move-object/from16 v17, v8

    invoke-static {v10, v2}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v8

    invoke-static {v10, v11}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v5, v14, v8, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setFocusable(Z)V

    new-instance v5, Lf0/m;

    const/4 v8, 0x0

    invoke-direct {v5, v12, v10, v4, v8}, Lf0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_20

    :cond_2d
    move-object/from16 v17, v8

    const/4 v2, 0x1

    const/4 v8, 0x0

    const/4 v11, 0x6

    :goto_20
    invoke-virtual {v3, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v3, v2}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v3, v2}, Landroid/view/View;->setFocusable(Z)V

    new-instance v1, Lf0/n;

    invoke-direct {v1, v15, v8}, Lf0/n;-><init>(Landroid/widget/Switch;I)V

    invoke-virtual {v3, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    if-nez v6, :cond_2e

    if-eqz v32, :cond_2e

    iget-object v1, v12, Lf0/H;->c:Ljava/lang/String;

    move-object/from16 v2, v32

    invoke-static {v1, v2}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2f

    move-object v6, v3

    move-object v8, v12

    goto :goto_21

    :cond_2e
    move-object/from16 v2, v32

    :cond_2f
    move-object/from16 v8, v17

    :goto_21
    move-object/from16 v32, v2

    move v11, v13

    move-object/from16 v5, v19

    move-object/from16 v1, v33

    move-object/from16 v2, v34

    const/high16 v3, 0x41600000    # 14.0f

    const/4 v4, 0x1

    goto/16 :goto_1e

    :cond_30
    invoke-static {}, LE0/m;->j0()V

    const/4 v1, 0x0

    throw v1

    :cond_31
    move-object/from16 v33, v1

    move-object/from16 v34, v2

    move-object/from16 v17, v8

    move-object/from16 v2, v32

    const/4 v11, 0x6

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, -0x2

    const/4 v4, -0x1

    invoke-direct {v1, v4, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0xe

    invoke-static {v10, v4}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v5

    iput v5, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v7, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    move-object v5, v2

    move-object/from16 v4, v20

    move-object/from16 v3, v23

    move-object/from16 v1, v33

    move-object/from16 v2, v34

    goto/16 :goto_18

    :cond_32
    move-object/from16 v23, v3

    move-object v2, v5

    move-object/from16 v31, v6

    move-object/from16 v22, v8

    if-eqz v31, :cond_22

    if-eqz v22, :cond_22

    new-instance v0, Lc0/B;

    const/16 v21, 0x3

    move-object/from16 v16, v0

    move-object/from16 v17, v31

    move-object/from16 v18, v30

    move-object/from16 v19, v22

    move-object/from16 v20, v10

    invoke-direct/range {v16 .. v21}, Lc0/B;-><init>(Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_22
    invoke-virtual/range {v29 .. v29}, Landroid/view/ViewGroup;->removeAllViews()V

    sget-object v0, Lf0/Q;->g:LK0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, LE0/c;

    invoke-direct {v3, v0}, LE0/c;-><init>(LE0/f;)V

    :goto_23
    invoke-virtual {v3}, LE0/c;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_36

    invoke-virtual {v3}, LE0/c;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/Q;

    move-object/from16 v4, v28

    iget-object v5, v4, LQ0/m;->a:Ljava/lang/Object;

    if-ne v5, v0, :cond_33

    const/4 v13, 0x1

    goto :goto_24

    :cond_33
    const/4 v13, 0x0

    :goto_24
    if-eqz v13, :cond_34

    sget v5, Lf0/V;->j:I

    goto :goto_25

    :cond_34
    sget v5, Lf0/V;->m:I

    :goto_25
    new-instance v6, Landroid/widget/FrameLayout;

    invoke-direct {v6, v10}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setFocusable(Z)V

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    new-instance v7, Lf0/m;

    move-object/from16 v8, v23

    const/4 v9, 0x2

    invoke-direct {v7, v4, v0, v8, v9}, Lf0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v7, Landroid/widget/LinearLayout;

    invoke-direct {v7, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v11, 0x0

    invoke-virtual {v7, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v12, 0x11

    invoke-virtual {v7, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    if-eqz v13, :cond_35

    sget v12, Lf0/V;->k:I

    const/16 v14, 0x12

    invoke-static {v10, v14}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v14

    invoke-static {v12, v14}, Lf0/V;->t(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v12

    goto :goto_26

    :cond_35
    new-instance v12, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v12, v11}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    :goto_26
    invoke-virtual {v7, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v12, v0, Lf0/Q;->b:Ljava/lang/String;

    const/high16 v14, 0x41700000    # 15.0f

    const/4 v15, 0x1

    invoke-static {v10, v12, v14, v5, v15}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v12

    const/16 v9, 0x11

    invoke-virtual {v12, v9}, Landroid/widget/TextView;->setGravity(I)V

    invoke-virtual {v12, v11}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    invoke-virtual {v7, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, v0, Lf0/Q;->a:Ljava/lang/String;

    const/high16 v12, 0x41500000    # 13.0f

    invoke-static {v10, v0, v12, v5, v13}, Lf0/V;->A(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setGravity(I)V

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    const/4 v5, 0x4

    invoke-static {v10, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v13

    invoke-virtual {v0, v13, v11, v11, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v13, 0x56

    invoke-static {v10, v13}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v13

    const/16 v5, 0x2e

    invoke-static {v10, v5}, Lf0/V;->g(Landroid/content/Context;I)I

    move-result v12

    invoke-direct {v0, v13, v12, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v6, v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v12, -0x1

    invoke-direct {v0, v11, v12, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    move-object/from16 v13, v29

    invoke-virtual {v13, v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    move-object/from16 v28, v4

    move-object/from16 v23, v8

    goto/16 :goto_23

    :cond_36
    if-nez v2, :cond_37

    new-instance v0, LA0/d;

    const/16 v2, 0xa

    invoke-direct {v0, v2, v1}, LA0/d;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_37
    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :cond_38
    invoke-static/range {v22 .. v22}, LQ0/g;->g(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1
.end method

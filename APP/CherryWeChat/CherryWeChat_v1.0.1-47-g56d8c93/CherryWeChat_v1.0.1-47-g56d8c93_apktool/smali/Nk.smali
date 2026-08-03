.class public final synthetic LNk;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;Landroid/widget/ImageView;Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LNk;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNk;->b:Ljava/lang/Object;

    iput-object p2, p0, LNk;->e:Ljava/lang/Object;

    iput-object p3, p0, LNk;->c:Ljava/lang/Object;

    iput-object p4, p0, LNk;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, LNk;->a:I

    iput-object p1, p0, LNk;->b:Ljava/lang/Object;

    iput-object p2, p0, LNk;->c:Ljava/lang/Object;

    iput-object p3, p0, LNk;->d:Ljava/lang/Object;

    iput-object p4, p0, LNk;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

    move-object/from16 v1, p0

    iget v0, v1, LNk;->a:I

    const/16 v2, 0x11

    const/4 v3, 0x0

    const/4 v4, 0x1

    iget-object v5, v1, LNk;->e:Ljava/lang/Object;

    iget-object v6, v1, LNk;->d:Ljava/lang/Object;

    iget-object v7, v1, LNk;->c:Ljava/lang/Object;

    iget-object v8, v1, LNk;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v8, Landroid/view/Window;

    check-cast v7, Landroid/view/Window$Callback;

    check-cast v6, Ljava/lang/Runnable;

    check-cast v5, Lio/sentry/android/core/I;

    invoke-virtual {v8}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v8, v7}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    new-instance v2, Lio/sentry/android/core/internal/util/h;

    invoke-direct {v2, v0, v6}, Lio/sentry/android/core/internal/util/h;-><init>(Landroid/view/View;Ljava/lang/Runnable;)V

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    :cond_0
    return-void

    :pswitch_0
    check-cast v8, Landroid/widget/TextView;

    check-cast v7, LHv;

    check-cast v6, Landroid/app/AlertDialog;

    check-cast v5, Landroid/content/Context;

    sget-object v0, LcG;->a:Ljava/util/LinkedHashMap;

    sget-object v0, LgG;->c:Ljava/lang/ClassLoader;

    new-instance v9, Lorg/luckypray/dexkit/DexKitBridge;

    invoke-direct {v9, v0}, Lorg/luckypray/dexkit/DexKitBridge;-><init>(Ljava/lang/ClassLoader;)V

    sget-object v0, LcG;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LbG;

    :try_start_0
    iget-object v11, v10, LbG;->c:Lkotlin/jvm/functions/Function2;

    sget-object v12, LgG;->c:Ljava/lang/ClassLoader;

    invoke-interface {v11, v9, v12}, Lkotlin/jvm/functions/Function2;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    const-wide v11, -0x20f6efffff835L

    :try_start_1
    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    iget-object v11, v10, LbG;->b:Ljava/lang/String;

    const-wide v11, -0x20f73fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-object v11, v3

    :goto_1
    if-eqz v11, :cond_4

    iput-object v11, v10, LbG;->a:Ljava/lang/Object;

    invoke-static {}, LcG;->d()Landroid/content/SharedPreferences;

    move-result-object v12

    invoke-interface {v12}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v12

    instance-of v13, v11, Ljava/lang/reflect/Method;

    if-eqz v13, :cond_1

    new-instance v13, LDd;

    check-cast v11, Ljava/lang/reflect/Method;

    invoke-direct {v13, v11}, LDd;-><init>(Ljava/lang/reflect/Method;)V

    invoke-virtual {v13}, LDd;->toString()Ljava/lang/String;

    move-result-object v11

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_1
    instance-of v13, v11, Ljava/lang/Class;

    if-eqz v13, :cond_2

    check-cast v11, Ljava/lang/Class;

    invoke-static {v11}, LFd;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, LFd;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    goto :goto_2

    :cond_2
    instance-of v13, v11, Ljava/lang/String;

    if-eqz v13, :cond_3

    check-cast v11, Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object v11, v3

    :goto_2
    iget-object v10, v10, LbG;->b:Ljava/lang/String;

    invoke-interface {v12, v10, v11}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v12}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_3

    :cond_4
    new-instance v11, Ln3;

    invoke-direct {v11, v2, v8, v10}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v11}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_3
    iget v10, v7, LHv;->a:I

    add-int/2addr v10, v4

    iput v10, v7, LHv;->a:I

    new-instance v10, Ln3;

    const/16 v11, 0x12

    invoke-direct {v10, v11, v8, v7}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v10}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_0

    :goto_4
    new-instance v2, Lr8;

    const/4 v3, 0x6

    invoke-direct {v2, v8, v0, v6, v3}, Lr8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_5

    :cond_5
    invoke-static {}, LcG;->d()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-wide v2, -0x20f79fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x73

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {v9}, Lorg/luckypray/dexkit/DexKitBridge;->close()V

    new-instance v0, Lr8;

    invoke-direct {v0, v8, v6, v5}, Lr8;-><init>(Landroid/widget/TextView;Landroid/app/AlertDialog;Landroid/content/Context;)V

    invoke-virtual {v8, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_5
    return-void

    :pswitch_1
    check-cast v7, Lio/github/cherrywechat/lua/loader/LoadedScript;

    check-cast v6, Ljava/lang/String;

    check-cast v5, Lfj;

    invoke-static {v8, v7, v6, v5}, Lio/github/cherrywechat/lua/loader/ScriptManager;->d(Ljava/lang/Object;Lio/github/cherrywechat/lua/loader/LoadedScript;Ljava/lang/String;Lfj;)V

    return-void

    :pswitch_2
    check-cast v8, Landroid/view/ViewGroup;

    check-cast v5, Landroid/widget/ImageView;

    check-cast v7, Landroid/view/ViewGroup;

    check-cast v6, Landroid/view/ViewGroup;

    invoke-static {v8}, Lgf;->o(Landroid/view/ViewGroup;)V

    const v0, 0x1020014

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    const-wide v10, -0x26b5fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    sget-object v11, LXA;->a:Ljava/util/HashMap;

    const-wide v11, -0x26b8fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    const-wide v12, -0x254dfffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lhw;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v9, v10, v11}, LBz;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-wide v9, -0x2550fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    const/high16 v10, -0x1000000

    invoke-static {v10, v9}, Lhw;->a(ILjava/lang/String;)I

    move-result v9

    if-eqz v9, :cond_6

    const-wide v11, -0x256bfffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-static {v10, v9}, Lhw;->a(ILjava/lang/String;)I

    move-result v9

    invoke-static {v0, v9}, Lgf;->O(Landroid/widget/TextView;I)V

    :cond_6
    new-instance v9, Le5;

    const/4 v11, 0x3

    invoke-direct {v9, v11, v0}, Le5;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-virtual {v8}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v9

    new-instance v12, LLk;

    invoke-direct {v12, v7, v0, v5, v8}, LLk;-><init>(Landroid/view/ViewGroup;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/view/ViewGroup;)V

    invoke-virtual {v9, v12}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    const/16 v0, 0x22

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    const/16 v8, 0x38

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    iput v8, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    const-wide v8, -0x39edfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    const v8, 0x550a022b

    invoke-virtual {v7, v8, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {v7, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const-class v5, Ljava/lang/Object;

    invoke-virtual {v7, v8, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const/4 v9, 0x0

    invoke-virtual {v7, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    const-wide v12, -0x398dfffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v7, Landroid/widget/LinearLayout;

    if-eqz v7, :cond_7

    invoke-virtual {v7, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v7, v8, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_7
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    move v5, v9

    :goto_6
    const/4 v8, 0x2

    if-ge v5, v3, :cond_f

    invoke-virtual {v7, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    const-wide v13, -0x384efffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    check-cast v12, Landroid/view/ViewGroup;

    invoke-static {v12}, Lgf;->r(Landroid/view/View;)V

    sget v13, LTB;->j:I

    invoke-virtual {v12, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/TextView;

    const/16 v13, 0x8

    invoke-virtual {v12, v13}, Landroid/view/View;->setVisibility(I)V

    new-instance v14, Landroid/widget/TextView;

    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-direct {v14, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/high16 v15, 0x41400000    # 12.0f

    invoke-virtual {v14, v4, v15}, Landroid/widget/TextView;->setTextSize(IF)V

    sget v11, LTB;->g:I

    invoke-virtual {v14, v11}, Landroid/view/View;->setId(I)V

    if-nez v5, :cond_8

    sget-object v11, LXA;->a:Ljava/util/HashMap;

    const-wide v16, -0x380afffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lhw;->a(ILjava/lang/String;)I

    move-result v11

    goto :goto_7

    :cond_8
    sget-object v11, LXA;->a:Ljava/util/HashMap;

    const-wide v16, -0x3827fffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    const v13, -0x777778

    invoke-static {v13, v11}, Lhw;->a(ILjava/lang/String;)I

    move-result v11

    :goto_7
    invoke-static {v14, v11}, Lgf;->O(Landroid/widget/TextView;I)V

    if-eqz v5, :cond_b

    if-eq v5, v4, :cond_a

    if-eq v5, v8, :cond_9

    sget-object v11, LXA;->a:Ljava/util/HashMap;

    const-wide v17, -0x3893fffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    const-wide v17, -0x38a4fffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-static {v11, v13}, Lhw;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    goto :goto_8

    :cond_9
    sget-object v11, LXA;->a:Ljava/util/HashMap;

    const-wide v17, -0x38f8fffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    const-wide v17, -0x3890fffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-static {v11, v13}, Lhw;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    goto :goto_8

    :cond_a
    sget-object v11, LXA;->a:Ljava/util/HashMap;

    const-wide v17, -0x38defffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    const-wide v17, -0x38f4fffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-static {v11, v13}, Lhw;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    goto :goto_8

    :cond_b
    sget-object v11, LXA;->a:Ljava/util/HashMap;

    const-wide v17, -0x38c6fffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    const-wide v17, -0x38dbfffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-static {v11, v13}, Lhw;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    :goto_8
    invoke-virtual {v14, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v12}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v11

    const-wide v17, -0x38a6fffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    check-cast v11, Landroid/view/ViewGroup;

    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    invoke-virtual {v11, v14, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v12}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v11

    const-wide v12, -0x2762fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v11, Landroid/view/ViewGroup;

    invoke-virtual {v11, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    const-wide v12, -0x271efffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v11, Landroid/view/ViewGroup;

    invoke-virtual {v11, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v11, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    const-wide v17, -0x27dafffff835L

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    check-cast v12, Landroid/widget/TextView;

    invoke-virtual {v12, v13}, Landroid/view/View;->setAlpha(F)V

    new-instance v13, Landroid/widget/TextView;

    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v13, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v13, v4, v15}, Landroid/widget/TextView;->setTextSize(IF)V

    sget-object v8, LXA;->a:Ljava/util/HashMap;

    const-wide v18, -0x2797fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-static {v10, v8}, Lhw;->a(ILjava/lang/String;)I

    move-result v8

    invoke-virtual {v13, v8}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v13, v2}, Landroid/widget/TextView;->setGravity(I)V

    const/16 v8, 0x8

    invoke-virtual {v13, v8}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v13, v4}, Landroid/widget/TextView;->setSingleLine(Z)V

    invoke-virtual {v13, v9}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    const-wide v18, -0x27b5fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v13, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    invoke-virtual {v11, v13, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v8, LPk;

    invoke-direct {v8, v13, v12}, LPk;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;)V

    invoke-virtual {v12, v8}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const/4 v8, 0x2

    invoke-virtual {v11, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v8, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const-wide v18, -0x2658fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    const/high16 v15, -0x10000

    invoke-static {v15, v13}, Lhw;->a(ILjava/lang/String;)I

    move-result v13

    invoke-virtual {v8, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v12, v8}, Lgf;->N(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    const-wide v12, -0x2677fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    if-eqz v5, :cond_e

    if-eq v5, v4, :cond_d

    const/4 v12, 0x2

    if-eq v5, v12, :cond_c

    const-wide v12, -0x268efffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v12

    goto :goto_9

    :cond_c
    const-wide v12, -0x26e2fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v12

    goto :goto_9

    :cond_d
    const-wide v12, -0x2636fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v12

    goto :goto_9

    :cond_e
    const-wide v12, -0x2607fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v12

    :goto_9
    invoke-static {v8, v12}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v8

    invoke-virtual {v14, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    new-instance v12, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v0}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-direct {v12, v13, v14}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v13, 0xd

    invoke-virtual {v12, v13}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v11, v8, v9, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    add-int/lit8 v5, v5, 0x1

    const/4 v11, 0x3

    goto/16 :goto_6

    :cond_f
    invoke-virtual {v6, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    const-wide v2, -0x2590fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v0}, Lgf;->o(Landroid/view/ViewGroup;)V

    const/4 v8, 0x2

    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    const-wide v2, -0x244cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v0}, Lgf;->o(Landroid/view/ViewGroup;)V

    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-wide v7, -0x2408fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2}, Lgf;->o(Landroid/view/ViewGroup;)V

    sget-object v0, LXA;->a:Ljava/util/HashMap;

    const-wide v2, -0x3b97fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v2, -0x1

    if-eqz v0, :cond_10

    invoke-virtual {v6, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    const-wide v7, -0x3bb9fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Landroid/view/ViewGroup;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const-wide v7, -0x3a75fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v5, v0}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v0

    new-instance v5, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v5, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0, v9, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_10
    const-wide v7, -0x3a05fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual {v6, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    const-wide v4, -0x3a22fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Landroid/view/ViewGroup;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-wide v7, -0x3adefffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v4, v0}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v0

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v4, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0, v9, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_11
    const-wide v3, -0x3aeefffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_12

    const/4 v8, 0x2

    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    const-wide v4, -0x3a8dfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Landroid/view/ViewGroup;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-wide v7, -0x3949fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v4, v0}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v0

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v4, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0, v9, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_12
    const-wide v3, -0x3959fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_13

    const/4 v3, 0x3

    invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    const-wide v4, -0x3971fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Landroid/view/ViewGroup;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-wide v5, -0x392dfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v4, v0}, Lgf;->t(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)Landroid/widget/ImageView;

    move-result-object v0

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v4, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0, v9, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_13
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

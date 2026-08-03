.class public final LX7;
.super Landroid/widget/HorizontalScrollView;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static final f:LU7;

.field public static final g:LU7;

.field public static final h:LU7;

.field public static final i:LU7;

.field public static final j:LU7;

.field public static final k:LU7;

.field public static final l:LU7;

.field public static final m:LU7;

.field public static final n:LU7;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Landroid/widget/AdapterView$OnItemClickListener;

.field public final c:Ljava/util/ArrayList;

.field public d:LW7;

.field public final e:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, LU7;

    const-wide v1, -0x1c406fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x1c40bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const/4 v5, -0x1

    const-wide/16 v6, -0x1

    const v2, 0x55080106

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v7}, LU7;-><init>(Ljava/lang/String;ILjava/lang/String;IIJ)V

    sput-object v0, LX7;->f:LU7;

    new-instance v1, LU7;

    const-wide v2, -0x1c42cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x1c42ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const v3, 0x55080105

    const/4 v5, 0x1

    invoke-direct/range {v1 .. v8}, LU7;-><init>(Ljava/lang/String;ILjava/lang/String;IIJ)V

    sput-object v1, LX7;->g:LU7;

    new-instance v2, LU7;

    const-wide v0, -0x1c4cefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v0, -0x1c4d1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x1

    const-wide/16 v8, 0x0

    const v4, 0x550800ff

    const/4 v6, 0x2

    invoke-direct/range {v2 .. v9}, LU7;-><init>(Ljava/lang/String;ILjava/lang/String;IIJ)V

    sput-object v2, LX7;->h:LU7;

    new-instance v3, LU7;

    const-wide v0, -0x1c4f3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v0, -0x1c4f8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x2

    const-wide/16 v9, 0x0

    const v5, 0x55080108

    const/4 v7, 0x3

    invoke-direct/range {v3 .. v10}, LU7;-><init>(Ljava/lang/String;ILjava/lang/String;IIJ)V

    sput-object v3, LX7;->i:LU7;

    new-instance v4, LU7;

    const-wide v0, -0x1c49dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v0, -0x1c4a0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x3

    const-wide/16 v10, 0x0

    const v6, 0x55080103

    const/4 v8, 0x4

    invoke-direct/range {v4 .. v11}, LU7;-><init>(Ljava/lang/String;ILjava/lang/String;IIJ)V

    sput-object v4, LX7;->j:LU7;

    new-instance v5, LU7;

    const-wide v0, -0x1c344fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const-wide v0, -0x1c347fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x4

    const-wide/16 v11, 0x0

    const v7, 0x55080104

    const/4 v9, 0x5

    invoke-direct/range {v5 .. v12}, LU7;-><init>(Ljava/lang/String;ILjava/lang/String;IIJ)V

    sput-object v5, LX7;->k:LU7;

    new-instance v6, LU7;

    const-wide v0, -0x1c36dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    const-wide v0, -0x1c370fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x6

    const-wide/16 v12, 0x0

    const v8, 0x55080107

    const/4 v10, 0x6

    invoke-direct/range {v6 .. v13}, LU7;-><init>(Ljava/lang/String;ILjava/lang/String;IIJ)V

    sput-object v6, LX7;->l:LU7;

    new-instance v7, LU7;

    const-wide v0, -0x1c314fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    const-wide v0, -0x1c319fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    const/4 v12, 0x2

    const-wide/16 v13, 0x1

    const v9, 0x55080101

    const/4 v11, 0x7

    invoke-direct/range {v7 .. v14}, LU7;-><init>(Ljava/lang/String;ILjava/lang/String;IIJ)V

    sput-object v7, LX7;->m:LU7;

    new-instance v8, LU7;

    const-wide v0, -0x1c338fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    const-wide v0, -0x1c33bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x0

    const-wide/16 v14, 0x1

    const v10, 0x55080102

    const/16 v12, 0x8

    invoke-direct/range {v8 .. v15}, LU7;-><init>(Ljava/lang/String;ILjava/lang/String;IIJ)V

    sput-object v8, LX7;->n:LU7;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-wide v3, -0x1c7dbfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1c7e3fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-direct/range {p0 .. p1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    iput-object v2, v0, LX7;->a:Landroid/view/View;

    const-wide v3, -0x1c7eefffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x20f04fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    new-instance v4, Lqs;

    sget v5, LgG;->a:I

    invoke-static {v3}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const/16 v5, 0xb

    invoke-direct {v4, v5, v3}, Lqs;-><init>(ILjava/lang/Class;)V

    const-class v3, Landroid/util/AttributeSet;

    const-class v6, Landroid/content/Context;

    filled-new-array {v6, v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4, v3}, Lqs;->x([Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const/4 v7, 0x0

    filled-new-array {v3, v7}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4, v3}, Lqs;->w([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Lvx;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v2, v4, Lvx;->c:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    iput-object v8, v4, Lvx;->b:Ljava/io/Serializable;

    const-wide v8, -0x1c797fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Lvx;->e(Ljava/lang/String;)V

    invoke-virtual {v4}, Lvx;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v8

    const-wide v9, -0x1c641fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    array-length v9, v8

    const/4 v10, 0x0

    move v11, v10

    :goto_0
    if-ge v11, v9, :cond_1

    aget-object v12, v8, v11

    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v13

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v13, v14}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v13

    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v13

    if-nez v13, :cond_0

    invoke-virtual {v12, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    const/4 v13, 0x4

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v12, v4, v13}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_1
    sget v8, LgG;->a:I

    const-wide v8, -0x1c650fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v8

    const-wide v11, -0x1c679fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    array-length v9, v8

    move v11, v10

    :goto_1
    if-ge v11, v9, :cond_5

    aget-object v12, v8, v11

    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Class;->isInterface()Z

    move-result v14

    if-eqz v14, :cond_3

    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v14

    const-wide v15, -0x1c608fffff835L

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    const-wide v15, -0x1c615fffff835L

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15, v10}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v14

    if-nez v14, :cond_3

    new-instance v14, Lvx;

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    instance-of v15, v4, Ljava/lang/Class;

    if-eqz v15, :cond_2

    move-object v15, v4

    check-cast v15, Ljava/lang/Class;

    iput-object v15, v14, Lvx;->b:Ljava/io/Serializable;

    goto :goto_2

    :cond_2
    iput-object v4, v14, Lvx;->c:Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v15

    iput-object v15, v14, Lvx;->b:Ljava/io/Serializable;

    :goto_2
    iput-object v13, v14, Lvx;->d:Ljava/io/Serializable;

    invoke-virtual {v14}, Lvx;->a()Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v12, v3, v13}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v13}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v14

    const-class v15, Landroid/widget/BaseAdapter;

    invoke-static {v14, v15}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    const-wide v14, -0x20f7efffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    new-instance v14, Lqs;

    invoke-direct {v14, v5, v13}, Lqs;-><init>(ILjava/lang/Class;)V

    const-wide v15, -0x1c61dfffff835L

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    const-class v15, Ljava/util/Map;

    const-class v5, Ljava/util/ArrayList;

    const-class v7, Ljava/util/List;

    filled-new-array {v13, v6, v7, v15, v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v14, v5}, Lqs;->x([Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    filled-new-array {v3, v5, v7, v13, v15}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v14, v5}, Lqs;->w([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v12, v3, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_4
    :goto_3
    add-int/lit8 v11, v11, 0x1

    const/16 v5, 0xb

    const/4 v7, 0x0

    goto/16 :goto_1

    :cond_5
    new-instance v2, Lvx;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    instance-of v4, v3, Ljava/lang/Class;

    if-eqz v4, :cond_6

    move-object v4, v3

    check-cast v4, Ljava/lang/Class;

    iput-object v4, v2, Lvx;->b:Ljava/io/Serializable;

    goto :goto_5

    :cond_6
    iput-object v3, v2, Lvx;->c:Ljava/lang/Object;

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    goto :goto_4

    :cond_7
    const/4 v4, 0x0

    :goto_4
    iput-object v4, v2, Lvx;->b:Ljava/io/Serializable;

    :goto_5
    const-class v4, Landroid/content/SharedPreferences;

    iput-object v4, v2, Lvx;->d:Ljava/io/Serializable;

    sget-object v4, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v4, :cond_8

    goto :goto_6

    :cond_8
    sget-object v4, Lgf;->p:Landroid/app/Application;

    if-eqz v4, :cond_9

    goto :goto_6

    :cond_9
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v4

    const-wide v5, -0x2f91cfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    :goto_6
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const-wide v5, -0x2f9d7fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    const-wide v5, -0x1c6c6fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4, v10}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    invoke-virtual {v2, v4}, Lvx;->d(Ljava/lang/Object;)V

    const-wide v4, -0x1c6d3fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Landroid/view/View;

    new-instance v2, Lvx;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v3, v2, Lvx;->c:Ljava/lang/Object;

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    goto :goto_7

    :cond_a
    const/4 v7, 0x0

    :goto_7
    iput-object v7, v2, Lvx;->b:Ljava/io/Serializable;

    const-class v3, Landroid/widget/AdapterView$OnItemClickListener;

    iput-object v3, v2, Lvx;->d:Ljava/io/Serializable;

    invoke-virtual {v2}, Lvx;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/AdapterView$OnItemClickListener;

    iput-object v2, v0, LX7;->b:Landroid/widget/AdapterView$OnItemClickListener;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, LX7;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    iput-object v2, v0, LX7;->e:Landroid/widget/LinearLayout;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v3, 0x1e

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    const/4 v4, -0x1

    invoke-direct {v1, v4, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0x10

    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v0, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0}, LX7;->c()V

    invoke-virtual {v0}, LX7;->b()V

    sput-object v0, LTB;->e:LX7;

    return-void
.end method

.method public static final synthetic a(LX7;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, LX7;->getCurrentWxId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final getAllAppPanelData()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "LU7;",
            ">;"
        }
    .end annotation

    invoke-static {}, LGu;->l()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method private final getAppPanelListener()Ljava/lang/Object;
    .locals 5

    new-instance v0, Lvx;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, LX7;->a:Landroid/view/View;

    const/4 v2, 0x0

    iput-object v1, v0, Lvx;->c:Ljava/lang/Object;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    iput-object v1, v0, Lvx;->b:Ljava/io/Serializable;

    const-wide v3, -0x1c5f1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvx;->e(Ljava/lang/String;)V

    invoke-virtual {v0}, Lvx;->a()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lvx;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    instance-of v3, v0, Ljava/lang/Class;

    if-eqz v3, :cond_1

    check-cast v0, Ljava/lang/Class;

    iput-object v0, v1, Lvx;->b:Ljava/io/Serializable;

    goto :goto_1

    :cond_1
    iput-object v0, v1, Lvx;->c:Ljava/lang/Object;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    :cond_2
    iput-object v2, v1, Lvx;->b:Ljava/io/Serializable;

    :goto_1
    const-wide v2, -0x1c59bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v2, -0x20df5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    sget v3, LgG;->a:I

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v2, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x1c445fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, LiG;->f(Ljava/lang/String;)V

    invoke-virtual {v2}, LiG;->e()Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    const/4 v2, 0x0

    aget-object v0, v0, v2

    iput-object v0, v1, Lvx;->d:Ljava/io/Serializable;

    invoke-virtual {v1}, Lvx;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final getCurrentWxId()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LX7;->a:Landroid/view/View;

    const v1, 0x550a021b

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final getItemBgColor()I
    .locals 3

    sget-object v0, LXA;->a:Ljava/util/HashMap;

    const-wide v0, -0x1c54bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lhw;->a(ILjava/lang/String;)I

    move-result v0

    invoke-static {}, Lhw;->h()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v0, :cond_0

    sget-object v1, LEA;->a:LEA;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->b()LCA;

    move-result-object v1

    iget-boolean v1, v1, LCA;->j:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, LEA;->a:LEA;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->a()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x1c564fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, -0xe5e5e6

    return v0

    :cond_1
    const/high16 v0, 0x10000000

    return v0

    :cond_2
    if-eqz v0, :cond_3

    :goto_0
    return v0

    :cond_3
    const/4 v0, -0x1

    return v0
.end method


# virtual methods
.method public final b()V
    .locals 7

    iget-object v0, p0, LX7;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v1, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v2, -0x2fb13fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x2fb2ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x1c68afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3}, Ltz;->X(I)V

    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    move v5, v3

    :cond_1
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->start()I

    move-result v6

    invoke-virtual {v1, v5, v6}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->end()I

    move-result v5

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1, v5, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v1, v4

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v2}, Ljava/util/ListIterator;->nextIndex()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v2, v1}, Lra;->o0(ILjava/util/List;)Ljava/util/List;

    move-result-object v1

    goto :goto_2

    :cond_3
    sget-object v1, LKf;->a:LKf;

    :goto_2
    new-array v2, v3, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, LX7;->d:LW7;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :cond_4
    return-void
.end method

.method public final c()V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, LX7;->e:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_0
    sget-object v2, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v3, -0x2fb71fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x2fb01fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x1c739fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4}, Ltz;->X(I)V

    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    move v6, v4

    :cond_2
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->start()I

    move-result v7

    invoke-virtual {v2, v6, v7}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->end()I

    move-result v6

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    move-result v7

    if-nez v7, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, v6, v3}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v2, v5

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v2, v3}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v3}, Ljava/util/ListIterator;->nextIndex()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v3, v2}, Lra;->o0(ILjava/util/List;)Ljava/util/List;

    move-result-object v2

    goto :goto_2

    :cond_4
    sget-object v2, LKf;->a:LKf;

    :goto_2
    new-array v3, v4, [Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    array-length v3, v2

    const/16 v5, 0x8

    if-nez v3, :cond_5

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_5
    array-length v3, v2

    move v6, v4

    :goto_3
    if-ge v6, v3, :cond_a

    aget-object v7, v2, v6

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    packed-switch v7, :pswitch_data_0

    sget-object v7, LX7;->n:LU7;

    goto :goto_4

    :pswitch_0
    sget-object v7, LX7;->m:LU7;

    goto :goto_4

    :pswitch_1
    sget-object v7, LX7;->l:LU7;

    goto :goto_4

    :pswitch_2
    sget-object v7, LX7;->k:LU7;

    goto :goto_4

    :pswitch_3
    sget-object v7, LX7;->j:LU7;

    goto :goto_4

    :pswitch_4
    sget-object v7, LX7;->i:LU7;

    goto :goto_4

    :pswitch_5
    sget-object v7, LX7;->h:LU7;

    goto :goto_4

    :pswitch_6
    sget-object v7, LX7;->g:LU7;

    goto :goto_4

    :pswitch_7
    sget-object v7, LX7;->f:LU7;

    :goto_4
    const/16 v8, 0xf

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v9, 0x19

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    new-instance v10, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-direct {v10, v11}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v10, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v11}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v11}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-virtual {v10, v12, v4, v11, v4}, Landroid/view/View;->setPadding(IIII)V

    const/16 v11, 0x1e

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v11}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-virtual {v10, v11}, Landroid/view/View;->setMinimumHeight(I)V

    new-instance v11, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v11}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-direct {v0}, LX7;->getItemBgColor()I

    move-result v12

    invoke-virtual {v11, v12}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v12, 0x41200000    # 10.0f

    invoke-virtual {v11, v12}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v10, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x2

    invoke-direct {v11, v12, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v13, 0x5

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    const/4 v15, 0x3

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v12

    invoke-static {v15}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-virtual {v11, v14, v5, v12, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {v10, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Landroid/widget/ImageView;

    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-direct {v5, v11}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget-object v11, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v5, v11}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    sget-object v11, LXA;->a:Ljava/util/HashMap;

    iget-object v11, v7, LU7;->c:Ljava/lang/String;

    invoke-static {v11}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v11

    if-eqz v11, :cond_6

    invoke-virtual {v5, v11}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-static {v9}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-direct {v8, v11, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    goto :goto_5

    :cond_6
    iget v9, v7, LU7;->b:I

    invoke-virtual {v5, v9}, Landroid/widget/ImageView;->setImageResource(I)V

    const-wide v11, -0x1c68ffffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-static {v4, v9}, Lhw;->a(ILjava/lang/String;)I

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v5, v9}, Landroid/widget/ImageView;->setColorFilter(I)V

    :cond_7
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v11

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-direct {v9, v11, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object v8, v9

    :goto_5
    const/16 v9, 0x10

    iput v9, v8, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-virtual {v10, v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v5, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v11, -0x1c6a5fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-static {v4, v8}, Lhw;->a(ILjava/lang/String;)I

    move-result v8

    if-eqz v8, :cond_8

    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_7

    :cond_8
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    const-wide v11, -0x1c6bbfffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v8}, Lhw;->f(Landroid/content/Context;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/4 v8, -0x1

    goto :goto_6

    :cond_9
    const/high16 v8, -0x1000000

    :goto_6
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_7
    iget-object v8, v7, LU7;->a:Ljava/lang/String;

    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v11, -0x2

    invoke-direct {v8, v11, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v9, v8, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-virtual {v8, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v10, v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v10, v7}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v10, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/lit8 v6, v6, 0x1

    const/16 v5, 0x8

    goto/16 :goto_3

    :cond_a
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
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 11

    const-wide v0, -0x1c566fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    const-wide v0, -0x1c568fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, LU7;

    iget v0, p1, LU7;->d:I

    sget-object v1, LX7;->m:LU7;

    iget v1, v1, LU7;->d:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2

    sget-object p1, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v0, -0x2e8eafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LbG;

    if-eqz p1, :cond_0

    iget-object p1, p1, LbG;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    instance-of v0, p1, Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/reflect/Method;

    goto :goto_1

    :cond_1
    move-object p1, v2

    :goto_1
    invoke-direct {p0}, LX7;->getAppPanelListener()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    sget-object v1, LX7;->n:LU7;

    iget v1, v1, LU7;->d:I

    if-ne v0, v1, :cond_9

    sget-object p1, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v0, -0x2e887fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LbG;

    if-eqz v3, :cond_3

    iget-object v3, v3, LbG;->a:Ljava/lang/Object;

    goto :goto_2

    :cond_3
    move-object v3, v2

    :goto_2
    instance-of v4, v3, Ljava/lang/reflect/Method;

    if-eqz v4, :cond_4

    check-cast v3, Ljava/lang/reflect/Method;

    goto :goto_3

    :cond_4
    move-object v3, v2

    :goto_3
    invoke-direct {p0}, LX7;->getAppPanelListener()Ljava/lang/Object;

    move-result-object v4

    new-instance v5, Lvx;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    instance-of v6, v4, Ljava/lang/Class;

    if-eqz v6, :cond_5

    check-cast v4, Ljava/lang/Class;

    iput-object v4, v5, Lvx;->b:Ljava/io/Serializable;

    goto :goto_5

    :cond_5
    iput-object v4, v5, Lvx;->c:Ljava/lang/Object;

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    goto :goto_4

    :cond_6
    move-object v4, v2

    :goto_4
    iput-object v4, v5, Lvx;->b:Ljava/io/Serializable;

    :goto_5
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LbG;

    if-eqz p1, :cond_7

    iget-object p1, p1, LbG;->a:Ljava/lang/Object;

    goto :goto_6

    :cond_7
    move-object p1, v2

    :goto_6
    instance-of v0, p1, Ljava/lang/reflect/Method;

    if-eqz v0, :cond_8

    check-cast p1, Ljava/lang/reflect/Method;

    goto :goto_7

    :cond_8
    move-object p1, v2

    :goto_7
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, v5, Lvx;->d:Ljava/io/Serializable;

    invoke-virtual {v5}, Lvx;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_9
    sget-object v1, LX7;->f:LU7;

    iget v1, v1, LU7;->d:I

    const/4 v3, 0x0

    if-ne v0, v1, :cond_a

    new-instance p1, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v1, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v1, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v5, -0x1c459fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const v6, 0x550603f9

    invoke-virtual {v5, v6}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v5, 0x41900000    # 18.0f

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v4, v2, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0x11

    iput v5, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v1, v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v0, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const v4, 0x550800fe

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x550603f7

    invoke-virtual {v4, v5}, Landroid/content/Context;->getColor(I)I

    move-result v4

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v4, v5}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    new-instance v4, Lh;

    const/4 v5, 0x2

    invoke-direct {v4, v5, p0}, Lh;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v5, 0x1e

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-direct {v4, v6, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0x15

    iput v5, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    const/16 v5, 0x14

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    iput v5, v4, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    invoke-virtual {v1, v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v0, v4, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0xa

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-virtual {v0, v3, v6, v3, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {p1, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, LIv;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Landroid/widget/ListView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v1, v6}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v3}, Landroid/widget/ListView;->setDividerHeight(I)V

    new-instance v3, LW7;

    invoke-direct {v3, p0, v1, v0}, LW7;-><init>(LX7;Landroid/widget/ListView;LIv;)V

    iput-object v3, p0, LX7;->d:LW7;

    invoke-virtual {v1, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const-wide v7, -0x1c45efffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    const-wide v7, -0x2f94dfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    new-instance v7, Landroid/util/DisplayMetrics;

    invoke-direct {v7}, Landroid/util/DisplayMetrics;-><init>()V

    const-wide v8, -0x2f955fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    const-wide v8, -0x2f95cfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Landroid/view/WindowManager;

    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v6

    invoke-virtual {v6, v7}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget v6, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    div-int/lit8 v6, v6, 0x2

    invoke-direct {v3, v4, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v5}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {p1, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance v1, LT7;

    const/4 v3, 0x0

    invoke-direct {v1, v3, p0}, LT7;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Landroid/app/AlertDialog$Builder;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    iput-object p1, v0, LIv;->a:Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    iget-object p1, v0, LIv;->a:Ljava/lang/Object;

    check-cast p1, Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_11

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {p1}, Landroid/view/Window;->getContext()Landroid/content/Context;

    move-result-object v1

    const v3, 0x55060040

    invoke-virtual {v1, v3}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v1, 0x10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1}, Landroid/view/Window;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-double v0, v0

    const-wide v3, 0x3feb333333333333L    # 0.85

    mul-double/2addr v0, v3

    double-to-int v0, v0

    invoke-virtual {p1, v0, v2}, Landroid/view/Window;->setLayout(II)V

    return-void

    :cond_a
    invoke-direct {p0}, LX7;->getCurrentWxId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_b

    goto/16 :goto_9

    :cond_b
    const-wide v4, -0x1c5ccfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, p0, LX7;->b:Landroid/widget/AdapterView$OnItemClickListener;

    sget-object v5, LX7;->j:LU7;

    sget-object v6, LX7;->l:LU7;

    sget-object v7, LX7;->k:LU7;

    sget-object v8, LX7;->i:LU7;

    if-eqz v2, :cond_d

    iget v1, v8, LU7;->d:I

    if-eq v0, v1, :cond_c

    iget v1, v7, LU7;->d:I

    if-eq v0, v1, :cond_c

    iget v1, v6, LU7;->d:I

    if-eq v0, v1, :cond_c

    iget v1, v5, LU7;->d:I

    if-ne v0, v1, :cond_10

    :cond_c
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, -0x1c5d7fffff835L

    invoke-static {v0, v1, p1, v3}, LEy;->k(JLandroid/content/Context;I)V

    return-void

    :cond_d
    const-wide v9, -0x1c5e2fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_10

    iget v1, v8, LU7;->d:I

    if-eq v0, v1, :cond_f

    iget v1, v7, LU7;->d:I

    if-eq v0, v1, :cond_f

    iget v1, v6, LU7;->d:I

    if-eq v0, v1, :cond_f

    sget-object v1, LX7;->h:LU7;

    iget v1, v1, LU7;->d:I

    if-ne v0, v1, :cond_e

    goto :goto_8

    :cond_e
    iget v1, v5, LU7;->d:I

    if-ne v0, v1, :cond_10

    if-eqz v4, :cond_11

    const/4 v7, 0x1

    iget-wide v8, p1, LU7;->f:J

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-interface/range {v4 .. v9}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void

    :cond_f
    :goto_8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, -0x1c5e6fffff835L

    invoke-static {v0, v1, p1, v3}, LEy;->k(JLandroid/content/Context;I)V

    return-void

    :cond_10
    if-eqz v4, :cond_11

    iget v7, p1, LU7;->e:I

    iget-wide v8, p1, LU7;->f:J

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-interface/range {v4 .. v9}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    :cond_11
    :goto_9
    return-void
.end method

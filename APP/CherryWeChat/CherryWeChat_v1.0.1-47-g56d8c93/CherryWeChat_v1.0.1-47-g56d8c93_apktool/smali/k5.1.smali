.class public final Lk5;
.super LVk;
.source ""


# static fields
.field public static final b:Lk5;

.field public static final c:Lk5;

.field public static final d:Lk5;

.field public static final e:Lk5;

.field public static final f:Lk5;

.field public static final g:Lk5;

.field public static final h:Lk5;

.field public static final i:Lk5;

.field public static final j:Lk5;

.field public static final k:Lk5;

.field public static final l:Lk5;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lk5;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk5;-><init>(I)V

    sput-object v0, Lk5;->b:Lk5;

    new-instance v0, Lk5;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lk5;-><init>(I)V

    sput-object v0, Lk5;->c:Lk5;

    new-instance v0, Lk5;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lk5;-><init>(I)V

    sput-object v0, Lk5;->d:Lk5;

    new-instance v0, Lk5;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lk5;-><init>(I)V

    sput-object v0, Lk5;->e:Lk5;

    new-instance v0, Lk5;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lk5;-><init>(I)V

    sput-object v0, Lk5;->f:Lk5;

    new-instance v0, Lk5;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lk5;-><init>(I)V

    sput-object v0, Lk5;->g:Lk5;

    new-instance v0, Lk5;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lk5;-><init>(I)V

    sput-object v0, Lk5;->h:Lk5;

    new-instance v0, Lk5;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lk5;-><init>(I)V

    sput-object v0, Lk5;->i:Lk5;

    new-instance v0, Lk5;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lk5;-><init>(I)V

    sput-object v0, Lk5;->j:Lk5;

    new-instance v0, Lk5;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lk5;-><init>(I)V

    sput-object v0, Lk5;->k:Lk5;

    new-instance v0, Lk5;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lk5;-><init>(I)V

    sput-object v0, Lk5;->l:Lk5;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lk5;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Landroid/view/ViewGroup;)V
    .locals 6

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_0

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2}, Lk5;->c(Landroid/view/ViewGroup;)V

    goto :goto_1

    :cond_0
    instance-of v3, v2, Landroid/widget/ImageView;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_1

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-ne v3, v5, :cond_1

    invoke-virtual {v2}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v3

    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    if-ne v3, v4, :cond_1

    const/4 p0, 0x0

    invoke-virtual {v2, p0}, Landroid/view/View;->setAlpha(F)V

    return-void

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static d(Landroid/app/Activity;)Z
    .locals 16

    const-wide v0, -0x1d355fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v0, -0x1d317fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v0, -0x1d3c6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v0, -0x1d388fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v0, -0x1d3b9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const-wide v0, -0x1d269fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    const-wide v0, -0x1d21bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    const-wide v0, -0x1d2d0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    const-wide v0, -0x1d286fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    const-wide v0, -0x1d2b9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v11

    const-wide v0, -0x1d168fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    const-wide v0, -0x1d10bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    const-wide v0, -0x1d135fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v14

    const-wide v0, -0x1d1f3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v15

    filled-new-array/range {v2 .. v15}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lsa;->b0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 29

    move-object/from16 v0, p0

    iget v1, v0, Lk5;->a:I

    const/16 v2, 0xa

    const/16 v3, 0x9

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/16 v8, 0x12

    const/16 v9, 0x16

    const/4 v10, 0x1

    const/16 v11, 0x8

    const/4 v12, 0x5

    const-wide v17, -0x20f0afffff835L

    const-wide v19, -0x20f04fffff835L

    const/16 v13, 0x11

    const/16 v14, 0x1d

    const-wide v21, -0x20f11fffff835L

    const/16 v15, 0x1c

    const/16 v16, 0x0

    const/16 v5, 0x15

    const/4 v6, 0x0

    const-wide v23, -0x20df5fffff835L

    const/16 v7, 0xb

    packed-switch v1, :pswitch_data_0

    new-instance v1, LiG;

    const-class v5, Landroid/widget/TextView;

    invoke-direct {v1, v5}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v6, -0x9921fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, LiG;->f(Ljava/lang/String;)V

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4}, LiG;->g([Ljava/lang/Object;)V

    new-instance v4, LMx;

    invoke-direct {v4, v3}, LMx;-><init>(I)V

    invoke-virtual {v1, v4}, LiG;->b(Lfj;)V

    new-instance v1, LiG;

    invoke-direct {v1, v5}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x992efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, LiG;->f(Ljava/lang/String;)V

    const-class v3, Landroid/content/res/ColorStateList;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, LiG;->g([Ljava/lang/Object;)V

    new-instance v3, LMx;

    invoke-direct {v3, v2}, LMx;-><init>(I)V

    invoke-virtual {v1, v3}, LiG;->b(Lfj;)V

    return-void

    :pswitch_0
    const-wide v1, -0x1ab8cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    sget v3, LgG;->a:I

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x1abb1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, LMx;

    invoke-direct {v1, v12}, LMx;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->b(Lfj;)V

    const-wide v1, -0x1abbafffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    new-instance v1, LMx;

    const/4 v3, 0x6

    invoke-direct {v1, v3}, LMx;-><init>(I)V

    const-wide v3, -0x20c55fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    iput-object v1, v2, LiG;->f:Lfj;

    new-instance v1, LMx;

    const/4 v3, 0x7

    invoke-direct {v1, v3}, LMx;-><init>(I)V

    const-wide v3, -0x20db1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    iput-object v1, v2, LiG;->d:Lfj;

    new-instance v1, LMx;

    invoke-direct {v1, v11}, LMx;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->b(Lfj;)V

    return-void

    :pswitch_1
    const-wide v1, -0x1db0dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    sget v3, LgG;->a:I

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x1db3cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, LTp;

    invoke-direct {v1, v15}, LTp;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->a(Lfj;)V

    sget v1, LgG;->a:I

    const/16 v2, 0xba4

    if-lt v1, v2, :cond_2

    const-wide v1, -0x1dbcafffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x1db8efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, LTp;

    invoke-direct {v1, v14}, LTp;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->a(Lfj;)V

    sget-object v1, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v2, -0x214c9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LbG;

    if-eqz v1, :cond_0

    iget-object v1, v1, LbG;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object/from16 v1, v16

    :goto_0
    instance-of v2, v1, Ljava/lang/Class;

    if-eqz v2, :cond_1

    move-object/from16 v16, v1

    check-cast v16, Ljava/lang/Class;

    :cond_1
    move-object/from16 v1, v16

    new-instance v2, LiG;

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    new-instance v1, LMx;

    invoke-direct {v1, v6}, LMx;-><init>(I)V

    const-wide v3, -0x20c69fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    iput-object v1, v2, LiG;->g:Lfj;

    new-instance v1, LMx;

    invoke-direct {v1, v10}, LMx;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->a(Lfj;)V

    :cond_2
    return-void

    :pswitch_2
    sget-object v1, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v2, -0x21585fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LbG;

    if-eqz v4, :cond_3

    iget-object v4, v4, LbG;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_3
    move-object/from16 v4, v16

    :goto_1
    instance-of v5, v4, Ljava/lang/Class;

    if-eqz v5, :cond_4

    check-cast v4, Ljava/lang/Class;

    goto :goto_2

    :cond_4
    move-object/from16 v4, v16

    :goto_2
    new-instance v5, LiG;

    invoke-direct {v5, v4}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v6, -0x1aff2fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, LiG;->f(Ljava/lang/String;)V

    new-instance v4, LTp;

    const/16 v6, 0x10

    invoke-direct {v4, v6}, LTp;-><init>(I)V

    invoke-virtual {v5, v4}, LiG;->b(Lfj;)V

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LbG;

    if-eqz v1, :cond_5

    iget-object v1, v1, LbG;->a:Ljava/lang/Object;

    goto :goto_3

    :cond_5
    move-object/from16 v1, v16

    :goto_3
    instance-of v2, v1, Ljava/lang/Class;

    if-eqz v2, :cond_6

    move-object/from16 v16, v1

    check-cast v16, Ljava/lang/Class;

    :cond_6
    move-object/from16 v1, v16

    new-instance v2, LiG;

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x1af88fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, LTp;

    invoke-direct {v1, v13}, LTp;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->b(Lfj;)V

    return-void

    :pswitch_3
    const-wide v1, -0x1a006fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LTp;

    invoke-direct {v2, v6}, LTp;-><init>(I)V

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v19 .. v20}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, Lqs;

    sget v4, LgG;->a:I

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v3, v7, v1}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v3, v2}, Lqs;->f(Lfj;)V

    return-void

    :pswitch_4
    const-wide v1, -0x1d4c1fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    sget v3, LgG;->a:I

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x1d4defffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, LOb;

    invoke-direct {v1, v15}, LOb;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->a(Lfj;)V

    const-wide v1, -0x1d4e7fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x1d484fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, LOb;

    invoke-direct {v1, v14}, LOb;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->b(Lfj;)V

    const-wide v1, -0x1d492fffff835L

    :try_start_0
    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x1d4b7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v1}, LiG;->h(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    :pswitch_5
    const-wide v3, -0x2506fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, LiG;

    sget v4, LgG;->a:I

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v3, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v10, -0x2523fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, LOb;

    invoke-direct {v1, v5}, LOb;-><init>(I)V

    invoke-virtual {v3, v1}, LiG;->a(Lfj;)V

    const-wide v3, -0x2537fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, LiG;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v3, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v10, -0x25d4fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, LOb;

    invoke-direct {v1, v9}, LOb;-><init>(I)V

    invoke-virtual {v3, v1}, LiG;->a(Lfj;)V

    sget-object v1, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v3, -0x217a2fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LbG;

    if-eqz v3, :cond_7

    iget-object v3, v3, LbG;->a:Ljava/lang/Object;

    goto :goto_4

    :cond_7
    move-object/from16 v3, v16

    :goto_4
    instance-of v4, v3, Ljava/lang/reflect/Method;

    if-eqz v4, :cond_8

    check-cast v3, Ljava/lang/reflect/Method;

    goto :goto_5

    :cond_8
    move-object/from16 v3, v16

    :goto_5
    new-instance v4, LOb;

    invoke-direct {v4, v8}, LOb;-><init>(I)V

    const-wide v10, -0x20d95fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    const-wide v14, -0x20d9cfffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    new-instance v6, LiG;

    invoke-direct {v6, v3}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v6, v4}, LiG;->a(Lfj;)V

    const-wide v3, -0x217b9fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LbG;

    if-eqz v3, :cond_9

    iget-object v3, v3, LbG;->a:Ljava/lang/Object;

    goto :goto_6

    :cond_9
    move-object/from16 v3, v16

    :goto_6
    instance-of v4, v3, Ljava/lang/reflect/Method;

    if-eqz v4, :cond_a

    check-cast v3, Ljava/lang/reflect/Method;

    goto :goto_7

    :cond_a
    move-object/from16 v3, v16

    :goto_7
    new-instance v4, LOb;

    const/16 v6, 0x13

    invoke-direct {v4, v6}, LOb;-><init>(I)V

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    new-instance v6, LiG;

    invoke-direct {v6, v3}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v6, v4}, LiG;->a(Lfj;)V

    const-wide v3, -0x2ebcfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v4, LiG;

    invoke-static {v3}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v4, v3}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v26, -0x2d58fffff835L

    invoke-static/range {v26 .. v27}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, LiG;->f(Ljava/lang/String;)V

    new-instance v3, LTp;

    const/16 v6, 0xc

    invoke-direct {v3, v6}, LTp;-><init>(I)V

    invoke-virtual {v4, v3}, LiG;->a(Lfj;)V

    const-wide v3, -0x2e86efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LbG;

    if-eqz v3, :cond_b

    iget-object v3, v3, LbG;->a:Ljava/lang/Object;

    goto :goto_8

    :cond_b
    move-object/from16 v3, v16

    :goto_8
    instance-of v4, v3, Ljava/lang/reflect/Method;

    if-eqz v4, :cond_c

    check-cast v3, Ljava/lang/reflect/Method;

    goto :goto_9

    :cond_c
    move-object/from16 v3, v16

    :goto_9
    new-instance v4, LTp;

    const/16 v6, 0xd

    invoke-direct {v4, v6}, LTp;-><init>(I)V

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    new-instance v6, LiG;

    invoke-direct {v6, v3}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v6, v4}, LiG;->a(Lfj;)V

    const-wide v3, -0x2e804fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LbG;

    if-eqz v3, :cond_d

    iget-object v3, v3, LbG;->a:Ljava/lang/Object;

    goto :goto_a

    :cond_d
    move-object/from16 v3, v16

    :goto_a
    instance-of v4, v3, Ljava/lang/reflect/Method;

    if-eqz v4, :cond_e

    check-cast v3, Ljava/lang/reflect/Method;

    goto :goto_b

    :cond_e
    move-object/from16 v3, v16

    :goto_b
    new-instance v4, LTp;

    invoke-direct {v4, v2}, LTp;-><init>(I)V

    const-wide v26, -0x20d85fffff835L

    invoke-static/range {v26 .. v27}, LGu;->r(J)Ljava/lang/String;

    const-wide v26, -0x20d8cfffff835L

    invoke-static/range {v26 .. v27}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-direct {v2, v3}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v4}, LiG;->b(Lfj;)V

    const-wide v2, -0x2d61fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, LiG;

    invoke-static {v2}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v3, v2}, LiG;-><init>(Ljava/lang/Object;)V

    const-class v2, Landroid/view/View;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, LiG;->g([Ljava/lang/Object;)V

    new-instance v4, LTp;

    invoke-direct {v4, v7}, LTp;-><init>(I)V

    invoke-virtual {v3, v4}, LiG;->a(Lfj;)V

    const-wide v3, -0xdbbfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v4, LiG;

    invoke-static {v3}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v4, v3}, LiG;-><init>(Ljava/lang/Object;)V

    const-class v3, Landroid/os/Bundle;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4, v3}, LiG;->g([Ljava/lang/Object;)V

    new-instance v3, LF7;

    invoke-direct {v3, v13}, LF7;-><init>(I)V

    invoke-virtual {v4, v3}, LiG;->a(Lfj;)V

    const-wide v3, -0x215cbfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LbG;

    if-eqz v3, :cond_f

    iget-object v3, v3, LbG;->a:Ljava/lang/Object;

    goto :goto_c

    :cond_f
    move-object/from16 v3, v16

    :goto_c
    instance-of v4, v3, Ljava/lang/Class;

    if-eqz v4, :cond_10

    check-cast v3, Ljava/lang/Class;

    goto :goto_d

    :cond_10
    move-object/from16 v3, v16

    :goto_d
    new-instance v4, LiG;

    invoke-direct {v4, v3}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v26, -0xc73fffff835L

    invoke-static/range {v26 .. v27}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v2}, LiG;->g([Ljava/lang/Object;)V

    new-instance v2, LF7;

    invoke-direct {v2, v8}, LF7;-><init>(I)V

    invoke-virtual {v4, v2}, LiG;->a(Lfj;)V

    const-wide v2, -0xc1dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LF7;

    const/16 v6, 0x13

    invoke-direct {v3, v6}, LF7;-><init>(I)V

    invoke-static {v2, v3}, LTB;->p(Ljava/lang/String;Lfj;)V

    const-wide v2, -0x2162ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LbG;

    if-eqz v2, :cond_11

    iget-object v2, v2, LbG;->a:Ljava/lang/Object;

    goto :goto_e

    :cond_11
    move-object/from16 v2, v16

    :goto_e
    instance-of v3, v2, Ljava/lang/reflect/Method;

    if-eqz v3, :cond_12

    check-cast v2, Ljava/lang/reflect/Method;

    goto :goto_f

    :cond_12
    move-object/from16 v2, v16

    :goto_f
    new-instance v3, LF7;

    const/16 v4, 0x14

    invoke-direct {v3, v4}, LF7;-><init>(I)V

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    new-instance v4, LiG;

    invoke-direct {v4, v2}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, LiG;->a(Lfj;)V

    const-wide v2, -0x216ccfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LbG;

    if-eqz v2, :cond_13

    iget-object v2, v2, LbG;->a:Ljava/lang/Object;

    goto :goto_10

    :cond_13
    move-object/from16 v2, v16

    :goto_10
    instance-of v3, v2, Ljava/lang/Class;

    if-eqz v3, :cond_14

    check-cast v2, Ljava/lang/Class;

    goto :goto_11

    :cond_14
    move-object/from16 v2, v16

    :goto_11
    new-instance v3, LF7;

    invoke-direct {v3, v5}, LF7;-><init>(I)V

    const-wide v4, -0x20f1afffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v10, -0x20f21fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    const-wide v14, -0x20f7efffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    new-instance v6, Lqs;

    invoke-direct {v6, v7, v2}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v6, v3}, Lqs;->f(Lfj;)V

    const-wide v2, -0x216e2fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LbG;

    if-eqz v1, :cond_15

    iget-object v1, v1, LbG;->a:Ljava/lang/Object;

    goto :goto_12

    :cond_15
    move-object/from16 v1, v16

    :goto_12
    instance-of v2, v1, Ljava/lang/Class;

    if-eqz v2, :cond_16

    move-object/from16 v16, v1

    check-cast v16, Ljava/lang/Class;

    :cond_16
    move-object/from16 v1, v16

    new-instance v2, LF7;

    invoke-direct {v2, v9}, LF7;-><init>(I)V

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, Lqs;

    invoke-direct {v3, v7, v1}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v3, v2}, Lqs;->f(Lfj;)V

    const-wide v1, -0x3bf1fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x3b8efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, LOb;

    const/16 v4, 0x14

    invoke-direct {v1, v4}, LOb;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->a(Lfj;)V

    const-wide v1, -0x393dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x39e7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, LOb;

    invoke-direct {v1, v13}, LOb;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->a(Lfj;)V

    const-wide v1, -0x25ddfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LOb;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, LOb;-><init>(I)V

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v19 .. v20}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, Lqs;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v3, v7, v1}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v3, v2}, Lqs;->f(Lfj;)V

    return-void

    :pswitch_6
    new-instance v1, LiG;

    const-class v2, Landroid/widget/HeaderViewListAdapter;

    invoke-direct {v1, v2}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v2, -0x334cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LiG;->f(Ljava/lang/String;)V

    new-instance v2, LOb;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, LOb;-><init>(I)V

    invoke-virtual {v1, v2}, LiG;->a(Lfj;)V

    const-wide v1, -0x3354fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    sget v3, LgG;->a:I

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x3308fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, LOb;

    const/4 v3, 0x4

    invoke-direct {v1, v3}, LOb;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->a(Lfj;)V

    const-wide v1, -0x3479fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-class v1, Landroid/os/Bundle;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->g([Ljava/lang/Object;)V

    new-instance v1, LOb;

    invoke-direct {v1, v12}, LOb;-><init>(I)V

    const-wide v3, -0x20c55fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    iput-object v1, v2, LiG;->f:Lfj;

    new-instance v1, LOb;

    const/4 v3, 0x6

    invoke-direct {v1, v3}, LOb;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->a(Lfj;)V

    const-wide v1, -0x349afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LOb;

    invoke-direct {v2, v11}, LOb;-><init>(I)V

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v19 .. v20}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, Lqs;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v3, v7, v1}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v3, v2}, Lqs;->f(Lfj;)V

    const-wide v1, -0x341ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x34d3fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, LF7;

    invoke-direct {v1, v15}, LF7;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->a(Lfj;)V

    const-wide v1, -0x34e6fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LOb;

    invoke-direct {v2, v10}, LOb;-><init>(I)V

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v19 .. v20}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, Lqs;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v3, v7, v1}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v3, v2}, Lqs;->f(Lfj;)V

    const-wide v1, -0x3317fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    new-instance v1, Lx8;

    const/16 v3, 0x20

    const/4 v4, 0x2

    invoke-direct {v1, v3, v4}, Lx8;-><init>(II)V

    const-wide v3, -0x20db1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    iput-object v1, v2, LiG;->d:Lfj;

    new-instance v1, LOb;

    invoke-direct {v1, v6}, LOb;-><init>(I)V

    const-wide v3, -0x20c69fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    iput-object v1, v2, LiG;->g:Lfj;

    new-instance v1, LMx;

    invoke-direct {v1, v5}, LMx;-><init>(I)V

    iput-object v1, v2, LiG;->h:Lfj;

    invoke-virtual {v2}, LiG;->j()V

    const-wide v1, -0x33d0fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x3392fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, LMx;

    invoke-direct {v1, v5}, LMx;-><init>(I)V

    iput-object v1, v2, LiG;->h:Lfj;

    invoke-virtual {v2}, LiG;->j()V

    const-wide v1, -0x3399fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x324cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, LMx;

    invoke-direct {v1, v5}, LMx;-><init>(I)V

    iput-object v1, v2, LiG;->h:Lfj;

    invoke-virtual {v2}, LiG;->j()V

    const-wide v1, -0x3253fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LOb;

    const/4 v4, 0x2

    invoke-direct {v2, v4}, LOb;-><init>(I)V

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v19 .. v20}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, Lqs;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v3, v7, v1}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v3, v2}, Lqs;->f(Lfj;)V

    const-wide v1, -0x3205fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LF7;

    invoke-direct {v2, v14}, LF7;-><init>(I)V

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v19 .. v20}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, Lqs;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v3, v7, v1}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v3, v2}, Lqs;->f(Lfj;)V

    const-wide v1, -0x32d0fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0x3284fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, LOb;

    const/4 v3, 0x7

    invoke-direct {v1, v3}, LOb;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->a(Lfj;)V

    return-void

    :pswitch_7
    const-wide v1, -0x874bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    sget v8, LgG;->a:I

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v26, -0x8779fffff835L

    invoke-static/range {v26 .. v27}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, Lb;

    const/16 v8, 0x13

    invoke-direct {v1, v8}, Lb;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->a(Lfj;)V

    sget-object v1, Lg8;->b:Lg8;

    invoke-virtual {v1}, LZk;->e()Z

    move-result v1

    if-eqz v1, :cond_17

    sget-object v1, Lg8;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_17

    goto/16 :goto_15

    :cond_17
    sget-object v1, LEA;->a:LEA;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LEA;->b()LCA;

    move-result-object v1

    iget-boolean v1, v1, LCA;->i:Z

    if-eqz v1, :cond_18

    const-wide v1, -0x8709fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lb;

    const/16 v8, 0x14

    invoke-direct {v2, v8}, Lb;-><init>(I)V

    invoke-static {v1, v2}, LTB;->p(Ljava/lang/String;Lfj;)V

    const-wide v1, -0x872efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lb;

    invoke-direct {v2, v5}, Lb;-><init>(I)V

    invoke-static {v1, v2}, LTB;->p(Ljava/lang/String;Lfj;)V

    goto :goto_15

    :cond_18
    sget-object v1, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v25, -0x21403fffff835L

    invoke-static/range {v25 .. v26}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LbG;

    if-eqz v1, :cond_19

    iget-object v1, v1, LbG;->a:Ljava/lang/Object;

    goto :goto_13

    :cond_19
    move-object/from16 v1, v16

    :goto_13
    instance-of v2, v1, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_1a

    check-cast v1, Ljava/lang/reflect/Method;

    goto :goto_14

    :cond_1a
    move-object/from16 v1, v16

    :goto_14
    new-instance v2, LiG;

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    new-instance v1, Lb;

    invoke-direct {v1, v9}, Lb;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->a(Lfj;)V

    const-wide v1, -0x87ddfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lb;

    const/16 v5, 0x17

    invoke-direct {v2, v5}, Lb;-><init>(I)V

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v19 .. v20}, LGu;->r(J)Ljava/lang/String;

    new-instance v5, Lqs;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v5, v7, v1}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v5, v2}, Lqs;->f(Lfj;)V

    :goto_15
    invoke-static {}, LcG;->c()Ljava/lang/reflect/Method;

    move-result-object v1

    new-instance v2, Lb;

    const/16 v5, 0x18

    invoke-direct {v2, v5}, Lb;-><init>(I)V

    const-wide v8, -0x20d95fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    const-wide v25, -0x20d9cfffff835L

    invoke-static/range {v25 .. v26}, LGu;->r(J)Ljava/lang/String;

    new-instance v5, LiG;

    invoke-direct {v5, v1}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v5, v2}, LiG;->a(Lfj;)V

    const-wide v1, -0x8eeefffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    new-instance v2, LiG;

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v27, -0x8ebcfffff835L

    invoke-static/range {v27 .. v28}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    filled-new-array {v4, v4}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->g([Ljava/lang/Object;)V

    new-instance v1, Lb;

    const/16 v4, 0x19

    invoke-direct {v1, v4}, Lb;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->b(Lfj;)V

    sget-object v1, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v4, -0x21691fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LbG;

    if-eqz v2, :cond_1b

    iget-object v2, v2, LbG;->a:Ljava/lang/Object;

    goto :goto_16

    :cond_1b
    move-object/from16 v2, v16

    :goto_16
    instance-of v4, v2, Ljava/lang/reflect/Method;

    if-eqz v4, :cond_1c

    check-cast v2, Ljava/lang/reflect/Method;

    goto :goto_17

    :cond_1c
    move-object/from16 v2, v16

    :goto_17
    const-wide v4, -0x216b1fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LbG;

    if-eqz v1, :cond_1d

    iget-object v1, v1, LbG;->a:Ljava/lang/Object;

    goto :goto_18

    :cond_1d
    move-object/from16 v1, v16

    :goto_18
    instance-of v4, v1, Ljava/lang/reflect/Method;

    if-eqz v4, :cond_1e

    check-cast v1, Ljava/lang/reflect/Method;

    goto :goto_19

    :cond_1e
    move-object/from16 v1, v16

    :goto_19
    filled-new-array {v2, v1}, [Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-static {v1}, Lsa;->b0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    new-instance v4, LF7;

    invoke-direct {v4, v11}, LF7;-><init>(I)V

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v25 .. v26}, LGu;->r(J)Ljava/lang/String;

    new-instance v5, LiG;

    invoke-direct {v5, v2}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v5, v4}, LiG;->a(Lfj;)V

    goto :goto_1a

    :cond_1f
    :try_start_1
    sget-object v1, LgG;->c:Ljava/lang/ClassLoader;

    const-wide v4, -0xa597fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1b

    :catchall_0
    sget-object v1, LgG;->c:Ljava/lang/ClassLoader;

    const-wide v4, -0xa452fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    :goto_1b
    new-instance v2, LiG;

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v4, -0xa411fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, LiG;->f(Ljava/lang/String;)V

    new-instance v4, LF7;

    const/4 v5, 0x4

    invoke-direct {v4, v5}, LF7;-><init>(I)V

    invoke-virtual {v2, v4}, LiG;->b(Lfj;)V

    new-instance v2, LiG;

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v4, -0xa41afffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, LiG;->f(Ljava/lang/String;)V

    new-instance v4, LF7;

    invoke-direct {v4, v12}, LF7;-><init>(I)V

    invoke-virtual {v2, v4}, LiG;->a(Lfj;)V

    new-instance v2, LiG;

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v4, -0xa423fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, LiG;->f(Ljava/lang/String;)V

    new-instance v4, LI7;

    invoke-direct {v4, v6, v1}, LI7;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v2, v4}, LiG;->a(Lfj;)V

    new-instance v1, Lb;

    invoke-direct {v1, v15}, Lb;-><init>(I)V

    const-wide v4, -0x20f1afffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x20f21fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v4, -0x20f7efffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, Lqs;

    const-class v4, Landroid/widget/EditText;

    invoke-direct {v2, v7, v4}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v2, v1}, Lqs;->f(Lfj;)V

    const-wide v1, -0xb2c7fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lb;

    invoke-direct {v2, v14}, Lb;-><init>(I)V

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v19 .. v20}, LGu;->r(J)Ljava/lang/String;

    new-instance v4, Lqs;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v4, v7, v1}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v4, v2}, Lqs;->f(Lfj;)V

    const-wide v1, -0xad6afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LF7;

    invoke-direct {v2, v3}, LF7;-><init>(I)V

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v19 .. v20}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, Lqs;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v3, v7, v1}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v3, v2}, Lqs;->f(Lfj;)V

    sget-object v1, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v2, -0x2e9b9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LbG;

    if-eqz v2, :cond_20

    iget-object v2, v2, LbG;->a:Ljava/lang/Object;

    goto :goto_1c

    :cond_20
    move-object/from16 v2, v16

    :goto_1c
    instance-of v3, v2, Ljava/lang/reflect/Method;

    if-eqz v3, :cond_21

    check-cast v2, Ljava/lang/reflect/Method;

    goto :goto_1d

    :cond_21
    move-object/from16 v2, v16

    :goto_1d
    new-instance v3, LF7;

    invoke-direct {v3, v10}, LF7;-><init>(I)V

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v25 .. v26}, LGu;->r(J)Ljava/lang/String;

    new-instance v4, LiG;

    invoke-direct {v4, v2}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, LiG;->a(Lfj;)V

    const-wide v2, -0x21593fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LbG;

    if-eqz v1, :cond_22

    iget-object v1, v1, LbG;->a:Ljava/lang/Object;

    goto :goto_1e

    :cond_22
    move-object/from16 v1, v16

    :goto_1e
    instance-of v2, v1, Ljava/lang/Class;

    if-eqz v2, :cond_23

    move-object/from16 v16, v1

    check-cast v16, Ljava/lang/Class;

    :cond_23
    move-object/from16 v1, v16

    new-instance v2, LiG;

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0xb058fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, LF7;

    invoke-direct {v1, v6}, LF7;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->a(Lfj;)V

    const-wide v1, -0xa7eafffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LF7;

    const/4 v4, 0x2

    invoke-direct {v2, v4}, LF7;-><init>(I)V

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v19 .. v20}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, Lqs;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v3, v7, v1}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v3, v2}, Lqs;->f(Lfj;)V

    const-wide v1, -0xa795fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LF7;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, LF7;-><init>(I)V

    invoke-static/range {v17 .. v18}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    invoke-static/range {v19 .. v20}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, Lqs;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v3, v7, v1}, Lqs;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v3, v2}, Lqs;->f(Lfj;)V

    const-wide v1, -0xa646fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0xa672fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v1}, LiG;->h(Ljava/lang/Object;)V

    sget-object v1, LbF;->a:LbF;

    new-instance v1, LH7;

    invoke-direct {v1, v6}, LH7;-><init>(I)V

    const-wide v2, -0x1a9c2fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v2, LbF;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_8
    const-wide v1, -0x1a2fcfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x1a29bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x1a2befffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x1a152fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0x1a166fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v1, v2, v3, v4, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lsa;->b0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-wide v3, -0x1a171fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    new-instance v4, LiG;

    sget v5, LgG;->a:I

    invoke-static {v3}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v4, v3}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, LiG;->f(Ljava/lang/String;)V

    new-instance v2, Lb;

    invoke-direct {v2, v8}, Lb;-><init>(I)V

    invoke-virtual {v4, v2}, LiG;->b(Lfj;)V

    goto :goto_1f

    :cond_24
    return-void

    :pswitch_9
    new-instance v1, LiG;

    const-class v2, Landroid/view/View;

    invoke-direct {v1, v2}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v2, -0x9ab6fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LiG;->f(Ljava/lang/String;)V

    new-instance v2, Lb;

    invoke-direct {v2, v13}, Lb;-><init>(I)V

    invoke-virtual {v1, v2}, LiG;->b(Lfj;)V

    return-void

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

.method public final b()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lk5;->a:I

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x9910fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-wide v0, -0x1ab81fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    const-wide v0, -0x1db79fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    const-wide v0, -0x1afe2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_3
    const-wide v0, -0x1a076fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_4
    const-wide v0, -0x1d432fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_5
    const-wide v0, -0x3be6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_6
    const-wide v0, -0x3466fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_7
    const-wide v0, -0xa7e1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_8
    const-wide v0, -0x1a2edfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_9
    const-wide v0, -0x9aa4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

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

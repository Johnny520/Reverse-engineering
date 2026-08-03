.class public LYue/ۥۣ۟ۡۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۟ۡۧ$ۥ۟۟۟۟;,
        LYue/ۥۣ۟ۡۧ$ۥ۟۟۟;,
        LYue/ۥۣ۟ۡۧ$ۥ۟۟;,
        LYue/ۥۣ۟ۡۧ$ۥ۟۟۟۠;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۨ:I = -0x1

.field public static final ۥ۟۟۠:I = 0x1

.field public static final ۥ۟۟۠۟:I = 0x2

.field public static final ۥ۟۟۠۠:I = 0x3


# instance fields
.field public final ۥ:Landroid/widget/TextView;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public ۥ۟:LYue/ۥۢۡۥۤ;

.field public ۥ۟۟:LYue/ۥۢۡۥۤ;

.field public ۥ۟۟۟:LYue/ۥۢۡۥۤ;

.field public ۥ۟۟۟۟:LYue/ۥۢۡۥۤ;

.field public ۥ۟۟۟۠:LYue/ۥۢۡۥۤ;

.field public ۥ۟۟۟ۡ:LYue/ۥۢۡۥۤ;

.field public ۥ۟۟۟ۢ:LYue/ۥۢۡۥۤ;

.field public final ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public ۥ۟۟۟ۤ:I

.field public ۥ۟۟۟ۥ:I

.field public ۥ۟۟۟ۦ:Landroid/graphics/Typeface;

.field public ۥ۟۟۟ۧ:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۤ:I

    const/4 v0, -0x1

    iput v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۥ:I

    iput-object p1, p0, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    new-instance v0, LYue/ۥ۟ۡۤ۟;

    invoke-direct {v0, p1}, LYue/ۥ۟ۡۤ۟;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    return-void
.end method

.method public static ۥ۟۟۟(Landroid/content/Context;LYue/ۥۣ۟ۡۡ;I)LYue/ۥۢۡۥۤ;
    .locals 0

    invoke-virtual {p1, p0, p2}, LYue/ۥۣ۟ۡۡ;->ۥ۟۟۟۠(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance p1, LYue/ۥۢۡۥۤ;

    invoke-direct {p1}, LYue/ۥۢۡۥۤ;-><init>()V

    const/4 p2, 0x1

    iput-boolean p2, p1, LYue/ۥۢۡۥۤ;->ۥ۟۟۟:Z

    iput-object p0, p1, LYue/ۥۢۡۥۤ;->ۥ:Landroid/content/res/ColorStateList;

    return-object p1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final ۥ(Landroid/graphics/drawable/Drawable;LYue/ۥۢۡۥۤ;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-static {p1, p2, v0}, LYue/ۥۣ۟ۡۡ;->ۥ۟۟۟ۤ(Landroid/graphics/drawable/Drawable;LYue/ۥۢۡۥۤ;[I)V

    :cond_0
    return-void
.end method

.method public ۥ۟()V
    .locals 5

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟:LYue/ۥۢۡۥۤ;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟:LYue/ۥۢۡۥۤ;

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟:LYue/ۥۢۡۥۤ;

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟۟:LYue/ۥۢۡۥۤ;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v3, v0, v2

    iget-object v4, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟:LYue/ۥۢۡۥۤ;

    invoke-virtual {p0, v3, v4}, LYue/ۥۣ۟ۡۧ;->ۥ(Landroid/graphics/drawable/Drawable;LYue/ۥۢۡۥۤ;)V

    const/4 v3, 0x1

    aget-object v3, v0, v3

    iget-object v4, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟:LYue/ۥۢۡۥۤ;

    invoke-virtual {p0, v3, v4}, LYue/ۥۣ۟ۡۧ;->ۥ(Landroid/graphics/drawable/Drawable;LYue/ۥۢۡۥۤ;)V

    aget-object v3, v0, v1

    iget-object v4, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟:LYue/ۥۢۡۥۤ;

    invoke-virtual {p0, v3, v4}, LYue/ۥۣ۟ۡۧ;->ۥ(Landroid/graphics/drawable/Drawable;LYue/ۥۢۡۥۤ;)V

    const/4 v3, 0x3

    aget-object v0, v0, v3

    iget-object v3, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟۟:LYue/ۥۢۡۥۤ;

    invoke-virtual {p0, v0, v3}, LYue/ۥۣ۟ۡۧ;->ۥ(Landroid/graphics/drawable/Drawable;LYue/ۥۢۡۥۤ;)V

    :cond_1
    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟۠:LYue/ۥۢۡۥۤ;

    if-nez v0, :cond_2

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۡ:LYue/ۥۢۡۥۤ;

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v2, v0, v2

    iget-object v3, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟۠:LYue/ۥۢۡۥۤ;

    invoke-virtual {p0, v2, v3}, LYue/ۥۣ۟ۡۧ;->ۥ(Landroid/graphics/drawable/Drawable;LYue/ۥۢۡۥۤ;)V

    aget-object v0, v0, v1

    iget-object v1, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۡ:LYue/ۥۢۡۥۤ;

    invoke-virtual {p0, v0, v1}, LYue/ۥۣ۟ۡۧ;->ۥ(Landroid/graphics/drawable/Drawable;LYue/ۥۢۡۥۤ;)V

    :cond_3
    return-void
.end method

.method public ۥ۟۟()V
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    invoke-virtual {v0}, LYue/ۥ۟ۡۤ۟;->ۥ()V

    return-void
.end method

.method public ۥ۟۟۟۟()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    invoke-virtual {v0}, LYue/ۥ۟ۡۤ۟;->ۥ۟۟۟۠()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟۠()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    invoke-virtual {v0}, LYue/ۥ۟ۡۤ۟;->ۥ۟۟۟ۡ()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۡ()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    invoke-virtual {v0}, LYue/ۥ۟ۡۤ۟;->ۥ۟۟۟ۢ()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۢ()[I
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    invoke-virtual {v0}, LYue/ۥ۟ۡۤ۟;->ۥۣ۟۟۟()[I

    move-result-object v0

    return-object v0
.end method

.method public ۥۣ۟۟۟()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    invoke-virtual {v0}, LYue/ۥ۟ۡۤ۟;->ۥ۟۟۟ۤ()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۤ()Landroid/content/res/ColorStateList;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۢ:LYue/ۥۢۡۥۤ;

    if-eqz v0, :cond_0

    iget-object v0, v0, LYue/ۥۢۡۥۤ;->ۥ:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public ۥ۟۟۟ۥ()Landroid/graphics/PorterDuff$Mode;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۢ:LYue/ۥۢۡۥۤ;

    if-eqz v0, :cond_0

    iget-object v0, v0, LYue/ۥۢۡۥۤ;->ۥ۟:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public ۥ۟۟۟ۦ()Z
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    invoke-virtual {v0}, LYue/ۥ۟ۡۤ۟;->ۥ۟۟۟ۨ()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۧ(Landroid/util/AttributeSet;I)V
    .locals 16
    .param p1    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move/from16 v9, p2

    iget-object v0, v7, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {}, LYue/ۥۣ۟ۡۡ;->ۥ۟()LYue/ۥۣ۟ۡۡ;

    move-result-object v11

    sget-object v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۤۥ:[I

    const/4 v12, 0x0

    invoke-static {v10, v8, v0, v9, v12}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۥ(Landroid/content/Context;Landroid/util/AttributeSet;[III)LYue/ۥۢۡۥۦ;

    move-result-object v13

    iget-object v0, v7, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۤۥ:[I

    invoke-virtual {v13}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡ۠()Landroid/content/res/TypedArray;

    move-result-object v4

    const/4 v6, 0x0

    move-object/from16 v3, p1

    move/from16 v5, p2

    invoke-static/range {v0 .. v6}, LYue/ۥۢۤۤۦ;->ۥ۟۠۠ۨ(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۤۦ:I

    const/4 v14, -0x1

    invoke-virtual {v13, v0, v14}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result v0

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۥ:I

    invoke-virtual {v13, v1}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۥ:I

    invoke-virtual {v13, v1, v12}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result v1

    invoke-static {v10, v11, v1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟(Landroid/content/Context;LYue/ۥۣ۟ۡۡ;I)LYue/ۥۢۡۥۤ;

    move-result-object v1

    iput-object v1, v7, LYue/ۥۣ۟ۡۧ;->ۥ۟:LYue/ۥۢۡۥۤ;

    :cond_0
    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۤۧ:I

    invoke-virtual {v13, v1}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v1

    if-eqz v1, :cond_1

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۤۧ:I

    invoke-virtual {v13, v1, v12}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result v1

    invoke-static {v10, v11, v1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟(Landroid/content/Context;LYue/ۥۣ۟ۡۡ;I)LYue/ۥۢۡۥۤ;

    move-result-object v1

    iput-object v1, v7, LYue/ۥۣ۟ۡۧ;->ۥ۟۟:LYue/ۥۢۡۥۤ;

    :cond_1
    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۥ۟:I

    invoke-virtual {v13, v1}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v1

    if-eqz v1, :cond_2

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۥ۟:I

    invoke-virtual {v13, v1, v12}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result v1

    invoke-static {v10, v11, v1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟(Landroid/content/Context;LYue/ۥۣ۟ۡۡ;I)LYue/ۥۢۡۥۤ;

    move-result-object v1

    iput-object v1, v7, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟:LYue/ۥۢۡۥۤ;

    :cond_2
    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۤۨ:I

    invoke-virtual {v13, v1}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v1

    if-eqz v1, :cond_3

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۤۨ:I

    invoke-virtual {v13, v1, v12}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result v1

    invoke-static {v10, v11, v1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟(Landroid/content/Context;LYue/ۥۣ۟ۡۡ;I)LYue/ۥۢۡۥۤ;

    move-result-object v1

    iput-object v1, v7, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟۟:LYue/ۥۢۡۥۤ;

    :cond_3
    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۥ۠:I

    invoke-virtual {v13, v1}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v1

    if-eqz v1, :cond_4

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۥ۠:I

    invoke-virtual {v13, v1, v12}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result v1

    invoke-static {v10, v11, v1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟(Landroid/content/Context;LYue/ۥۣ۟ۡۡ;I)LYue/ۥۢۡۥۤ;

    move-result-object v1

    iput-object v1, v7, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟۠:LYue/ۥۢۡۥۤ;

    :cond_4
    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۥۡ:I

    invoke-virtual {v13, v1}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v1

    if-eqz v1, :cond_5

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۥۡ:I

    invoke-virtual {v13, v1, v12}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result v1

    invoke-static {v10, v11, v1}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟(Landroid/content/Context;LYue/ۥۣ۟ۡۡ;I)LYue/ۥۢۡۥۤ;

    move-result-object v1

    iput-object v1, v7, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۡ:LYue/ۥۢۡۥۤ;

    :cond_5
    invoke-virtual {v13}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۧ()V

    iget-object v1, v7, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v1

    instance-of v1, v1, Landroid/text/method/PasswordTransformationMethod;

    const/4 v2, 0x1

    const/4 v13, 0x0

    if-eq v0, v14, :cond_9

    sget-object v3, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۡۤ:[I

    invoke-static {v10, v0, v3}, LYue/ۥۢۡۥۦ;->ۥۣ۟۟ۡ(Landroid/content/Context;I[I)LYue/ۥۢۡۥۦ;

    move-result-object v0

    if-nez v1, :cond_6

    sget v3, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۨ:I

    invoke-virtual {v0, v3}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v3

    if-eqz v3, :cond_6

    sget v3, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۨ:I

    invoke-virtual {v0, v3, v12}, LYue/ۥۢۡۥۦ;->ۥ(IZ)Z

    move-result v3

    move v4, v2

    goto :goto_0

    :cond_6
    move v3, v12

    move v4, v3

    :goto_0
    invoke-virtual {v7, v10, v0}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟ۡۡ(Landroid/content/Context;LYue/ۥۢۡۥۦ;)V

    sget v5, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣ۟ۢ:I

    invoke-virtual {v0, v5}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v5

    if-eqz v5, :cond_7

    sget v5, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣ۟ۢ:I

    invoke-virtual {v0, v5}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۦ(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_7
    move-object v5, v13

    :goto_1
    sget v6, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۧ:I

    invoke-virtual {v0, v6}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v6

    if-eqz v6, :cond_8

    sget v6, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۧ:I

    invoke-virtual {v0, v6}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۦ(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_8
    move-object v6, v13

    :goto_2
    invoke-virtual {v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۧ()V

    goto :goto_3

    :cond_9
    move v3, v12

    move v4, v3

    move-object v5, v13

    move-object v6, v5

    :goto_3
    sget-object v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۡۤ:[I

    invoke-static {v10, v8, v0, v9, v12}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۥ(Landroid/content/Context;Landroid/util/AttributeSet;[III)LYue/ۥۢۡۥۦ;

    move-result-object v0

    if-nez v1, :cond_a

    sget v15, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۨ:I

    invoke-virtual {v0, v15}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v15

    if-eqz v15, :cond_a

    sget v3, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۨ:I

    invoke-virtual {v0, v3, v12}, LYue/ۥۢۡۥۦ;->ۥ(IZ)Z

    move-result v3

    goto :goto_4

    :cond_a
    move v2, v4

    :goto_4
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    sget v15, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣ۟ۢ:I

    invoke-virtual {v0, v15}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v15

    if-eqz v15, :cond_b

    sget v5, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣ۟ۢ:I

    invoke-virtual {v0, v5}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۦ(I)Ljava/lang/String;

    move-result-object v5

    :cond_b
    sget v15, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۧ:I

    invoke-virtual {v0, v15}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v15

    if-eqz v15, :cond_c

    sget v6, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۧ:I

    invoke-virtual {v0, v6}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۦ(I)Ljava/lang/String;

    move-result-object v6

    :cond_c
    const/16 v15, 0x1c

    if-lt v4, v15, :cond_d

    sget v4, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۡۥ:I

    invoke-virtual {v0, v4}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v4

    if-eqz v4, :cond_d

    sget v4, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۡۥ:I

    invoke-virtual {v0, v4, v14}, LYue/ۥۢۡۥۦ;->ۥ۟۟۟ۡ(II)I

    move-result v4

    if-nez v4, :cond_d

    iget-object v4, v7, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    const/4 v15, 0x0

    invoke-virtual {v4, v12, v15}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_d
    invoke-virtual {v7, v10, v0}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟ۡۡ(Landroid/content/Context;LYue/ۥۢۡۥۦ;)V

    invoke-virtual {v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۧ()V

    if-nez v1, :cond_e

    if-eqz v2, :cond_e

    invoke-virtual {v7, v3}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۢ(Z)V

    :cond_e
    iget-object v0, v7, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۦ:Landroid/graphics/Typeface;

    if-eqz v0, :cond_10

    iget v1, v7, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۥ:I

    if-ne v1, v14, :cond_f

    iget-object v1, v7, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    iget v2, v7, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۤ:I

    invoke-virtual {v1, v0, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_5

    :cond_f
    iget-object v1, v7, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_10
    :goto_5
    if-eqz v6, :cond_11

    iget-object v0, v7, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-static {v0, v6}, LYue/ۥۣ۟ۡۧ$ۥ۟۟۟۟;->ۥ۟۟۟(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_11
    if-eqz v5, :cond_12

    iget-object v0, v7, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-static {v5}, LYue/ۥۣ۟ۡۧ$ۥ۟۟۟;->ۥ(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥۣ۟ۡۧ$ۥ۟۟۟;->ۥ۟(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    :cond_12
    iget-object v0, v7, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    invoke-virtual {v0, v8, v9}, LYue/ۥ۟ۡۤ۟;->ۥ۟۟۠(Landroid/util/AttributeSet;I)V

    sget-boolean v0, LYue/ۥۢۤۧۨ;->ۥ۟۟۟:Z

    const/high16 v9, -0x40800000    # -1.0f

    if-eqz v0, :cond_14

    iget-object v0, v7, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    invoke-virtual {v0}, LYue/ۥ۟ۡۤ۟;->ۥ۟۟۟ۤ()I

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, v7, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    invoke-virtual {v0}, LYue/ۥ۟ۡۤ۟;->ۥۣ۟۟۟()[I

    move-result-object v0

    array-length v1, v0

    if-lez v1, :cond_14

    iget-object v1, v7, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-static {v1}, LYue/ۥۣ۟ۡۧ$ۥ۟۟۟۟;->ۥ(Landroid/widget/TextView;)I

    move-result v1

    int-to-float v1, v1

    cmpl-float v1, v1, v9

    if-eqz v1, :cond_13

    iget-object v0, v7, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    iget-object v1, v7, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    invoke-virtual {v1}, LYue/ۥ۟ۡۤ۟;->ۥ۟۟۟ۡ()I

    move-result v1

    iget-object v2, v7, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    invoke-virtual {v2}, LYue/ۥ۟ۡۤ۟;->ۥ۟۟۟۠()I

    move-result v2

    iget-object v3, v7, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    invoke-virtual {v3}, LYue/ۥ۟ۡۤ۟;->ۥ۟۟۟ۢ()I

    move-result v3

    invoke-static {v0, v1, v2, v3, v12}, LYue/ۥۣ۟ۡۧ$ۥ۟۟۟۟;->ۥ۟(Landroid/widget/TextView;IIII)V

    goto :goto_6

    :cond_13
    iget-object v1, v7, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-static {v1, v0, v12}, LYue/ۥۣ۟ۡۧ$ۥ۟۟۟۟;->ۥ۟۟(Landroid/widget/TextView;[II)V

    :cond_14
    :goto_6
    sget-object v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۥۢ:[I

    invoke-static {v10, v8, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۤ(Landroid/content/Context;Landroid/util/AttributeSet;[I)LYue/ۥۢۡۥۦ;

    move-result-object v8

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۦ۠:I

    invoke-virtual {v8, v0, v14}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result v0

    if-eq v0, v14, :cond_15

    invoke-virtual {v11, v10, v0}, LYue/ۥۣ۟ۡۡ;->ۥ۟۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v1, v0

    goto :goto_7

    :cond_15
    move-object v1, v13

    :goto_7
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۦۥ:I

    invoke-virtual {v8, v0, v14}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result v0

    if-eq v0, v14, :cond_16

    invoke-virtual {v11, v10, v0}, LYue/ۥۣ۟ۡۡ;->ۥ۟۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v2, v0

    goto :goto_8

    :cond_16
    move-object v2, v13

    :goto_8
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۦۡ:I

    invoke-virtual {v8, v0, v14}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result v0

    if-eq v0, v14, :cond_17

    invoke-virtual {v11, v10, v0}, LYue/ۥۣ۟ۡۡ;->ۥ۟۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v3, v0

    goto :goto_9

    :cond_17
    move-object v3, v13

    :goto_9
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۦ:I

    invoke-virtual {v8, v0, v14}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result v0

    if-eq v0, v14, :cond_18

    invoke-virtual {v11, v10, v0}, LYue/ۥۣ۟ۡۡ;->ۥ۟۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v4, v0

    goto :goto_a

    :cond_18
    move-object v4, v13

    :goto_a
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۦۢ:I

    invoke-virtual {v8, v0, v14}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result v0

    if-eq v0, v14, :cond_19

    invoke-virtual {v11, v10, v0}, LYue/ۥۣ۟ۡۡ;->ۥ۟۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v5, v0

    goto :goto_b

    :cond_19
    move-object v5, v13

    :goto_b
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۦ۟:I

    invoke-virtual {v8, v0, v14}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result v0

    if-eq v0, v14, :cond_1a

    invoke-virtual {v11, v10, v0}, LYue/ۥۣ۟ۡۡ;->ۥ۟۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v6, v0

    goto :goto_c

    :cond_1a
    move-object v6, v13

    :goto_c
    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۨ(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۦۣ:I

    invoke-virtual {v8, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v0

    if-eqz v0, :cond_1b

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۦۣ:I

    invoke-virtual {v8, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟۟(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iget-object v1, v7, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-static {v1, v0}, LYue/ۥۢۡۡ۟;->ۥ۟۟۠ۢ(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    :cond_1b
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۦۤ:I

    invoke-virtual {v8, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v0

    if-eqz v0, :cond_1c

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۦۤ:I

    invoke-virtual {v8, v0, v14}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠(II)I

    move-result v0

    invoke-static {v0, v13}, LYue/ۥ۠۠ۡۥ;->ۥ۟۟۟۟(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iget-object v1, v7, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-static {v1, v0}, LYue/ۥۢۡۡ۟;->ۥۣ۟۟۠(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    :cond_1c
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۦۧ:I

    invoke-virtual {v8, v0, v14}, LYue/ۥۢۡۥۦ;->ۥ۟۟۟ۡ(II)I

    move-result v0

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۧ۟:I

    invoke-virtual {v8, v1, v14}, LYue/ۥۢۡۥۦ;->ۥ۟۟۟ۡ(II)I

    move-result v1

    sget v2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۧ۠:I

    invoke-virtual {v8, v2}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v2

    if-eqz v2, :cond_1e

    sget v2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۧ۠:I

    invoke-virtual {v8, v2}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۦ(I)Landroid/util/TypedValue;

    move-result-object v2

    if-eqz v2, :cond_1d

    iget v3, v2, Landroid/util/TypedValue;->type:I

    const/4 v4, 0x5

    if-ne v3, v4, :cond_1d

    iget v3, v2, Landroid/util/TypedValue;->data:I

    invoke-static {v3}, LYue/ۥۣۢۢۧ;->ۥ۟۟(I)I

    move-result v3

    iget v2, v2, Landroid/util/TypedValue;->data:I

    invoke-static {v2}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v2

    goto :goto_e

    :cond_1d
    sget v2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۧ۠:I

    invoke-virtual {v8, v2, v14}, LYue/ۥۢۡۥۦ;->ۥ۟۟۟ۡ(II)I

    move-result v2

    int-to-float v2, v2

    :goto_d
    move v3, v14

    goto :goto_e

    :cond_1e
    move v2, v9

    goto :goto_d

    :goto_e
    invoke-virtual {v8}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۧ()V

    if-eq v0, v14, :cond_1f

    iget-object v4, v7, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-static {v4, v0}, LYue/ۥۢۡۡ۟;->ۥ۟۟۠ۨ(Landroid/widget/TextView;I)V

    :cond_1f
    if-eq v1, v14, :cond_20

    iget-object v0, v7, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-static {v0, v1}, LYue/ۥۢۡۡ۟;->ۥ۟۟ۡ(Landroid/widget/TextView;I)V

    :cond_20
    cmpl-float v0, v2, v9

    if-eqz v0, :cond_22

    if-ne v3, v14, :cond_21

    iget-object v0, v7, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    float-to-int v1, v2

    invoke-static {v0, v1}, LYue/ۥۢۡۡ۟;->ۥ۟۟ۡ۟(Landroid/widget/TextView;I)V

    goto :goto_f

    :cond_21
    iget-object v0, v7, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-static {v0, v3, v2}, LYue/ۥۢۡۡ۟;->ۥ۟۟ۡ۠(Landroid/widget/TextView;IF)V

    :cond_22
    :goto_f
    return-void
.end method

.method public ۥ۟۟۟ۨ(Ljava/lang/ref/WeakReference;Landroid/graphics/Typeface;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;",
            "Landroid/graphics/Typeface;",
            ")V"
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۧ:Z

    if-eqz v0, :cond_1

    iput-object p2, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۦ:Landroid/graphics/Typeface;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۤ:I

    new-instance v1, LYue/ۥۣ۟ۡۧ$ۥ۟;

    invoke-direct {v1, p0, p1, p2, v0}, LYue/ۥۣ۟ۡۧ$ۥ۟;-><init>(LYue/ۥۣ۟ۡۧ;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    iget v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۤ:I

    invoke-virtual {p1, p2, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public ۥ۟۟۠(ZIIII)V
    .locals 0
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    sget-boolean p1, LYue/ۥۢۤۧۨ;->ۥ۟۟۟:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟()V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۠۟()V
    .locals 0

    invoke-virtual {p0}, LYue/ۥۣ۟ۡۧ;->ۥ۟()V

    return-void
.end method

.method public ۥ۟۟۠۠(Landroid/content/Context;I)V
    .locals 3

    sget-object v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۡۤ:[I

    invoke-static {p1, p2, v0}, LYue/ۥۢۡۥۦ;->ۥۣ۟۟ۡ(Landroid/content/Context;I[I)LYue/ۥۢۡۥۦ;

    move-result-object p2

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۨ:I

    invoke-virtual {p2, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۨ:I

    invoke-virtual {p2, v0, v1}, LYue/ۥۢۡۥۦ;->ۥ(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۠ۢ(Z)V

    :cond_0
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۡۥ:I

    invoke-virtual {p2, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۡۥ:I

    const/4 v2, -0x1

    invoke-virtual {p2, v0, v2}, LYue/ۥۢۡۥۦ;->ۥ۟۟۟ۡ(II)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_1
    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟ۡۡ(Landroid/content/Context;LYue/ۥۢۡۥۦ;)V

    sget p1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۧ:I

    invoke-virtual {p2, p1}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result p1

    if-eqz p1, :cond_2

    sget p1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۧ:I

    invoke-virtual {p2, p1}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۦ(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-static {v0, p1}, LYue/ۥۣ۟ۡۧ$ۥ۟۟۟۟;->ۥ۟۟۟(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_2
    invoke-virtual {p2}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۧ()V

    iget-object p1, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۦ:Landroid/graphics/Typeface;

    if-eqz p1, :cond_3

    iget-object p2, p0, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    iget v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۤ:I

    invoke-virtual {p2, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_3
    return-void
.end method

.method public ۥ۟۟۠ۡ(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V
    .locals 2
    .param p1    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/inputmethod/InputConnection;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Landroid/view/inputmethod/EditorInfo;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p3, p1}, LYue/ۥ۠۠ۤۨ;->ۥ۟۟۟ۥ(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۠ۢ(Z)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    return-void
.end method

.method public ۥۣ۟۟۠(IIII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    invoke-virtual {v0, p1, p2, p3, p4}, LYue/ۥ۟ۡۤ۟;->ۥ۟۟۠۟(IIII)V

    return-void
.end method

.method public ۥ۟۟۠ۤ([II)V
    .locals 1
    .param p1    # [I
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۟ۡۤ۟;->ۥ۟۟۠۠([II)V

    return-void
.end method

.method public ۥ۟۟۠ۥ(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۤ۟;->ۥ۟۟۠ۡ(I)V

    return-void
.end method

.method public ۥ۟۟۠ۦ(Landroid/content/res/ColorStateList;)V
    .locals 1
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۢ:LYue/ۥۢۡۥۤ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥۢۡۥۤ;

    invoke-direct {v0}, LYue/ۥۢۡۥۤ;-><init>()V

    iput-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۢ:LYue/ۥۢۡۥۤ;

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۢ:LYue/ۥۢۡۥۤ;

    iput-object p1, v0, LYue/ۥۢۡۥۤ;->ۥ:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, LYue/ۥۢۡۥۤ;->ۥ۟۟۟:Z

    invoke-virtual {p0}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟ۡ()V

    return-void
.end method

.method public ۥ۟۟۠ۧ(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1
    .param p1    # Landroid/graphics/PorterDuff$Mode;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۢ:LYue/ۥۢۡۥۤ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥۢۡۥۤ;

    invoke-direct {v0}, LYue/ۥۢۡۥۤ;-><init>()V

    iput-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۢ:LYue/ۥۢۡۥۤ;

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۢ:LYue/ۥۢۡۥۤ;

    iput-object p1, v0, LYue/ۥۢۡۥۤ;->ۥ۟:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, LYue/ۥۢۡۥۤ;->ۥ۟۟:Z

    invoke-virtual {p0}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟ۡ()V

    return-void
.end method

.method public final ۥ۟۟۠ۨ(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-nez p5, :cond_a

    if-eqz p6, :cond_0

    goto :goto_7

    :cond_0
    if-nez p1, :cond_1

    if-nez p2, :cond_1

    if-nez p3, :cond_1

    if-eqz p4, :cond_f

    :cond_1
    iget-object p5, p0, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {p5}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object p5

    aget-object p6, p5, v2

    if-nez p6, :cond_7

    aget-object v4, p5, v3

    if-eqz v4, :cond_2

    goto :goto_4

    :cond_2
    iget-object p5, p0, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {p5}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object p5

    iget-object p6, p0, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    aget-object p1, p5, v2

    :goto_0
    if-eqz p2, :cond_4

    goto :goto_1

    :cond_4
    aget-object p2, p5, v1

    :goto_1
    if-eqz p3, :cond_5

    goto :goto_2

    :cond_5
    aget-object p3, p5, v3

    :goto_2
    if-eqz p4, :cond_6

    goto :goto_3

    :cond_6
    aget-object p4, p5, v0

    :goto_3
    invoke-virtual {p6, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_c

    :cond_7
    :goto_4
    if-eqz p2, :cond_8

    goto :goto_5

    :cond_8
    aget-object p2, p5, v1

    :goto_5
    if-eqz p4, :cond_9

    goto :goto_6

    :cond_9
    aget-object p4, p5, v0

    :goto_6
    iget-object p1, p0, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    aget-object p3, p5, v3

    invoke-virtual {p1, p6, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_a
    :goto_7
    iget-object p1, p0, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p5, :cond_b

    goto :goto_8

    :cond_b
    aget-object p5, p1, v2

    :goto_8
    if-eqz p2, :cond_c

    goto :goto_9

    :cond_c
    aget-object p2, p1, v1

    :goto_9
    if-eqz p6, :cond_d

    goto :goto_a

    :cond_d
    aget-object p6, p1, v3

    :goto_a
    iget-object p3, p0, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    if-eqz p4, :cond_e

    goto :goto_b

    :cond_e
    aget-object p4, p1, v0

    :goto_b
    invoke-virtual {p3, p5, p2, p6, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_f
    :goto_c
    return-void
.end method

.method public final ۥ۟۟ۡ()V
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۢ:LYue/ۥۢۡۥۤ;

    iput-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟:LYue/ۥۢۡۥۤ;

    iput-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟:LYue/ۥۢۡۥۤ;

    iput-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟:LYue/ۥۢۡۥۤ;

    iput-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟۟:LYue/ۥۢۡۥۤ;

    iput-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟۠:LYue/ۥۢۡۥۤ;

    iput-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۡ:LYue/ۥۢۡۥۤ;

    return-void
.end method

.method public ۥ۟۟ۡ۟(IF)V
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    sget-boolean v0, LYue/ۥۢۤۧۨ;->ۥ۟۟۟:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۦ()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟ۡۧ;->ۥ۟۟ۡ۠(IF)V

    :cond_0
    return-void
.end method

.method public final ۥ۟۟ۡ۠(IF)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۡۧ;->ۥۣ۟۟۟:LYue/ۥ۟ۡۤ۟;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۟ۡۤ۟;->ۥۣ۟۟۠(IF)V

    return-void
.end method

.method public final ۥ۟۟ۡۡ(Landroid/content/Context;LYue/ۥۢۡۥۦ;)V
    .locals 10

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۡۧ:I

    iget v1, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۤ:I

    invoke-virtual {p2, v0, v1}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠(II)I

    move-result v0

    iput v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۤ:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x2

    const/4 v2, -0x1

    const/16 v3, 0x1c

    if-lt v0, v3, :cond_0

    sget v4, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۥ:I

    invoke-virtual {p2, v4, v2}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠(II)I

    move-result v4

    iput v4, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۥ:I

    if-eq v4, v2, :cond_0

    iget v4, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۤ:I

    and-int/2addr v4, v1

    iput v4, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۤ:I

    :cond_0
    sget v4, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۤ:I

    invoke-virtual {p2, v4}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v4, :cond_6

    sget v4, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۦ:I

    invoke-virtual {p2, v4}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    sget p1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۡۦ:I

    invoke-virtual {p2, p1}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result p1

    if-eqz p1, :cond_5

    iput-boolean v6, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۧ:Z

    sget p1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۡۦ:I

    invoke-virtual {p2, p1, v5}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠(II)I

    move-result p1

    if-eq p1, v5, :cond_4

    if-eq p1, v1, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    iput-object p1, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۦ:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۦ:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۦ:Landroid/graphics/Typeface;

    :cond_5
    :goto_0
    return-void

    :cond_6
    :goto_1
    const/4 v4, 0x0

    iput-object v4, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۦ:Landroid/graphics/Typeface;

    sget v4, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۦ:I

    invoke-virtual {p2, v4}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۡ(I)Z

    move-result v4

    if-eqz v4, :cond_7

    sget v4, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۦ:I

    goto :goto_2

    :cond_7
    sget v4, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۤ:I

    :goto_2
    iget v7, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۥ:I

    iget v8, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۤ:I

    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    move-result p1

    if-nez p1, :cond_c

    new-instance p1, Ljava/lang/ref/WeakReference;

    iget-object v9, p0, LYue/ۥۣ۟ۡۧ;->ۥ:Landroid/widget/TextView;

    invoke-direct {p1, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v9, LYue/ۥۣ۟ۡۧ$ۥ;

    invoke-direct {v9, p0, v7, v8, p1}, LYue/ۥۣ۟ۡۧ$ۥ;-><init>(LYue/ۥۣ۟ۡۧ;IILjava/lang/ref/WeakReference;)V

    :try_start_0
    iget p1, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۤ:I

    invoke-virtual {p2, v4, p1, v9}, LYue/ۥۢۡۥۦ;->ۥ۟۟۟ۥ(IILYue/ۥۡۦۦۣ$ۥ۟۟۟۠;)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_a

    if-lt v0, v3, :cond_9

    iget v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۥ:I

    if-eq v0, v2, :cond_9

    invoke-static {p1, v6}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۥ:I

    iget v7, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۤ:I

    and-int/2addr v7, v1

    if-eqz v7, :cond_8

    move v7, v5

    goto :goto_3

    :cond_8
    move v7, v6

    :goto_3
    invoke-static {p1, v0, v7}, LYue/ۥۣ۟ۡۧ$ۥ۟۟۟۠;->ۥ(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۦ:Landroid/graphics/Typeface;

    goto :goto_4

    :cond_9
    iput-object p1, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۦ:Landroid/graphics/Typeface;

    :cond_a
    :goto_4
    iget-object p1, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۦ:Landroid/graphics/Typeface;

    if-nez p1, :cond_b

    move p1, v5

    goto :goto_5

    :cond_b
    move p1, v6

    :goto_5
    iput-boolean p1, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۧ:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_c
    iget-object p1, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۦ:Landroid/graphics/Typeface;

    if-nez p1, :cond_f

    invoke-virtual {p2, v4}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۦ(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_f

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v3, :cond_e

    iget p2, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۥ:I

    if-eq p2, v2, :cond_e

    invoke-static {p1, v6}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۥ:I

    iget v0, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۤ:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_d

    goto :goto_6

    :cond_d
    move v5, v6

    :goto_6
    invoke-static {p1, p2, v5}, LYue/ۥۣ۟ۡۧ$ۥ۟۟۟۠;->ۥ(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۦ:Landroid/graphics/Typeface;

    goto :goto_7

    :cond_e
    iget p2, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۤ:I

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣ۟ۡۧ;->ۥ۟۟۟ۦ:Landroid/graphics/Typeface;

    :cond_f
    :goto_7
    return-void
.end method

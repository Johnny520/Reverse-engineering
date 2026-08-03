.class public Landroidx/appcompat/widget/ۥ۟۟۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۨۤۨ;


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۢ:Ljava/lang/String; = "ToolbarWidgetWrapper"

.field public static final ۥۣ۟۟۠:I = 0x3

.field public static final ۥ۟۟۠ۤ:J = 0xc8L


# instance fields
.field public ۥ:Landroidx/appcompat/widget/Toolbar;

.field public ۥ۟:I

.field public ۥ۟۟:Landroid/view/View;

.field public ۥ۟۟۟:Landroid/widget/Spinner;

.field public ۥ۟۟۟۟:Landroid/view/View;

.field public ۥ۟۟۟۠:Landroid/graphics/drawable/Drawable;

.field public ۥ۟۟۟ۡ:Landroid/graphics/drawable/Drawable;

.field public ۥ۟۟۟ۢ:Landroid/graphics/drawable/Drawable;

.field public ۥۣ۟۟۟:Z

.field public ۥ۟۟۟ۤ:Ljava/lang/CharSequence;

.field public ۥ۟۟۟ۥ:Ljava/lang/CharSequence;

.field public ۥ۟۟۟ۦ:Ljava/lang/CharSequence;

.field public ۥ۟۟۟ۧ:Landroid/view/Window$Callback;

.field public ۥ۟۟۟ۨ:Z

.field public ۥ۟۟۠:Landroidx/appcompat/widget/ۥ;

.field public ۥ۟۟۠۟:I

.field public ۥ۟۟۠۠:I

.field public ۥ۟۟۠ۡ:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;Z)V
    .locals 2

    .line 1
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۥ;->ۥ۟:I

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۥ:I

    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;-><init>(Landroidx/appcompat/widget/Toolbar;ZII)V

    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;ZII)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p4, 0x0

    .line 3
    iput p4, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠۟:I

    .line 4
    iput p4, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠۠:I

    .line 5
    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    .line 6
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ:Ljava/lang/CharSequence;

    .line 7
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۥ:Ljava/lang/CharSequence;

    .line 8
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, p4

    :goto_0
    iput-boolean v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥۣ۟۟۟:Z

    .line 9
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۢ:Landroid/graphics/drawable/Drawable;

    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ:[I

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟۟۠:I

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, p4}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۥ(Landroid/content/Context;Landroid/util/AttributeSet;[III)LYue/ۥۢۡۥۦ;

    move-result-object p1

    .line 11
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟۠۠:I

    invoke-virtual {p1, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟۟ۢ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠ۡ:Landroid/graphics/drawable/Drawable;

    if-eqz p2, :cond_c

    .line 12
    sget p2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۡۡ:I

    invoke-virtual {p1, p2}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۧ(I)Ljava/lang/CharSequence;

    move-result-object p2

    .line 13
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 14
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->setTitle(Ljava/lang/CharSequence;)V

    .line 15
    :cond_1
    sget p2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۡ۟:I

    invoke-virtual {p1, p2}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۧ(I)Ljava/lang/CharSequence;

    move-result-object p2

    .line 16
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 17
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠ۢ(Ljava/lang/CharSequence;)V

    .line 18
    :cond_2
    sget p2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟۠ۥ:I

    invoke-virtual {p1, p2}, LYue/ۥۢۡۥۦ;->ۥ۟۟۟ۢ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 19
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۨ(Landroid/graphics/drawable/Drawable;)V

    .line 20
    :cond_3
    sget p2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟۠ۢ:I

    invoke-virtual {p1, p2}, LYue/ۥۢۡۥۦ;->ۥ۟۟۟ۢ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 21
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 22
    :cond_4
    iget-object p2, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۢ:Landroid/graphics/drawable/Drawable;

    if-nez p2, :cond_5

    iget-object p2, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠ۡ:Landroid/graphics/drawable/Drawable;

    if-eqz p2, :cond_5

    .line 23
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟ۢۤ(Landroid/graphics/drawable/Drawable;)V

    .line 24
    :cond_5
    sget p2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۦ:I

    invoke-virtual {p1, p2, p4}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠(II)I

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠۠(I)V

    .line 25
    sget p2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۥ:I

    invoke-virtual {p1, p2, p4}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result p2

    if-eqz p2, :cond_6

    .line 26
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p2, v1, p4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟ۢ۠(Landroid/view/View;)V

    .line 27
    iget p2, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟:I

    or-int/lit8 p2, p2, 0x10

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠۠(I)V

    .line 28
    :cond_6
    sget p2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟۠:I

    invoke-virtual {p1, p2, p4}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠۠(II)I

    move-result p2

    if-lez p2, :cond_7

    .line 29
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 30
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 31
    iget-object p2, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 32
    :cond_7
    sget p2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥۣ۟۟۟:I

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟۟۠(II)I

    move-result p2

    .line 33
    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟۟۟:I

    invoke-virtual {p1, v1, v0}, LYue/ۥۢۡۥۦ;->ۥ۟۟۟۠(II)I

    move-result v0

    if-gez p2, :cond_8

    if-ltz v0, :cond_9

    .line 34
    :cond_8
    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-static {p2, p4}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 35
    invoke-static {v0, p4}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 36
    invoke-virtual {v1, p2, v0}, Landroidx/appcompat/widget/Toolbar;->setContentInsetsRelative(II)V

    .line 37
    :cond_9
    sget p2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۡۢ:I

    invoke-virtual {p1, p2, p4}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result p2

    if-eqz p2, :cond_a

    .line 38
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Landroidx/appcompat/widget/Toolbar;->setTitleTextAppearance(Landroid/content/Context;I)V

    .line 39
    :cond_a
    sget p2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟ۡ۠:I

    invoke-virtual {p1, p2, p4}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result p2

    if-eqz p2, :cond_b

    .line 40
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Landroidx/appcompat/widget/Toolbar;->setSubtitleTextAppearance(Landroid/content/Context;I)V

    .line 41
    :cond_b
    sget p2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟۠ۧ:I

    invoke-virtual {p1, p2, p4}, LYue/ۥۢۡۥۦ;->ۥ۟۟۠ۤ(II)I

    move-result p2

    if-eqz p2, :cond_d

    .line 42
    iget-object p4, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p4, p2}, Landroidx/appcompat/widget/Toolbar;->setPopupTheme(I)V

    goto :goto_1

    .line 43
    :cond_c
    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟ۢۦ()I

    move-result p2

    iput p2, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟:I

    .line 44
    :cond_d
    :goto_1
    invoke-virtual {p1}, LYue/ۥۢۡۥۦ;->ۥ۟۟ۡۧ()V

    .line 45
    invoke-virtual {p0, p3}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ(I)V

    .line 46
    iget-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۦ:Ljava/lang/CharSequence;

    .line 47
    iget-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    new-instance p2, Landroidx/appcompat/widget/ۥ۟۟۟ۡ$ۥ;

    invoke-direct {p2, p0}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ$ۥ;-><init>(Landroidx/appcompat/widget/ۥ۟۟۟ۡ;)V

    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public collapseActionView()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->collapseActionView()V

    return-void
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    return v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getVisibility()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    return v0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setIcon(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, LYue/ۥۣ۟ۡ۠;->ۥ۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->setIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 2
    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟۠:Landroid/graphics/drawable/Drawable;

    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥۣ۟۟۠()V

    return-void
.end method

.method public setLogo(I)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, LYue/ۥۣ۟ۡ۠;->ۥ۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۨ(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥۣ۟۟۟:Z

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟ۢۨ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setVisibility(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public setWindowCallback(Landroid/view/Window$Callback;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۧ:Landroid/view/Window$Callback;

    return-void
.end method

.method public setWindowTitle(Ljava/lang/CharSequence;)V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥۣ۟۟۟:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟ۢۨ(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public ۥ(Landroid/view/Menu;Landroidx/appcompat/view/menu/ۥ۟۟۟ۤ$ۥ;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠:Landroidx/appcompat/widget/ۥ;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/appcompat/widget/ۥ;

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/ۥ;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠:Landroidx/appcompat/widget/ۥ;

    sget v1, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/view/menu/ۥ;->ۥ۟۟۟ۢ(I)V

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠:Landroidx/appcompat/widget/ۥ;

    invoke-virtual {v0, p2}, Landroidx/appcompat/view/menu/ۥ;->setCallback(Landroidx/appcompat/view/menu/ۥ۟۟۟ۤ$ۥ;)V

    iget-object p2, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    check-cast p1, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠:Landroidx/appcompat/widget/ۥ;

    invoke-virtual {p2, p1, v0}, Landroidx/appcompat/widget/Toolbar;->setMenu(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroidx/appcompat/widget/ۥ;)V

    return-void
.end method

.method public ۥ۟()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->isOverflowMenuShowing()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۨ:Z

    return-void
.end method

.method public ۥ۟۟۟()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟۠:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟۟()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->canShowOverflowMenu()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟۠()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟ۡ()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->isOverflowMenuShowPending()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۢ()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->hideOverflowMenu()Z

    move-result v0

    return v0
.end method

.method public ۥۣ۟۟۟()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->showOverflowMenu()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۤ(I)V
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠۠:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠۠:I

    iget-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠۠:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟ۢ۟(I)V

    :cond_1
    return-void
.end method

.method public ۥ۟۟۟ۥ()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->dismissPopupMenus()V

    return-void
.end method

.method public ۥ۟۟۟ۦ()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟۟:Landroid/view/View;

    return-object v0
.end method

.method public ۥ۟۟۟ۧ(Landroidx/appcompat/widget/ۥ۟۟۟۟;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/View;

    if-eqz p1, :cond_1

    iget v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠۟:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar$ۥ۟۟۟ۡ;

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    const v1, 0x800053

    iput v1, v0, Landroidx/appcompat/app/ۥ$ۥ۟;->ۥ:I

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ۥ۟۟۟۟;->setAllowCollapse(Z)V

    :cond_1
    return-void
.end method

.method public ۥ۟۟۟ۨ(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥۣ۟۟۠()V

    return-void
.end method

.method public ۥ۟۟۠()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->hasExpandedActionView()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠۟()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->isTitleTruncated()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠۠(I)V
    .locals 3

    iget v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟:I

    xor-int/2addr v0, p1

    iput p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟:I

    if-eqz v0, :cond_6

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    and-int/lit8 v1, p1, 0x4

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥۣ۟۟()V

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥۣ۟۟۟()V

    :cond_1
    and-int/lit8 v1, v0, 0x3

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥۣ۟۟۠()V

    :cond_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_4

    and-int/lit8 v1, p1, 0x8

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    iget-object v2, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    iget-object v2, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۥ:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_3
    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    :cond_4
    :goto_0
    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_6

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟۟:Landroid/view/View;

    if-eqz v0, :cond_6

    and-int/lit8 p1, p1, 0x10

    if-eqz p1, :cond_5

    iget-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_1

    :cond_5
    iget-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public ۥ۟۟۠ۡ(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۦ:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥۣ۟۟()V

    return-void
.end method

.method public ۥ۟۟۠ۢ(Ljava/lang/CharSequence;)V
    .locals 1

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۥ:Ljava/lang/CharSequence;

    iget v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public ۥۣ۟۟۠(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠ۡ:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠ۡ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥۣ۟۟۟()V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۠ۤ(Landroid/util/SparseArray;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    return-void
.end method

.method public ۥ۟۟۠ۥ(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/widget/Spinner;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/AdapterView;->setSelection(I)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Can\'t set dropdown selected position without an adapter"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۠ۦ()Landroid/view/Menu;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۠ۧ()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۠ۨ()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠۟:I

    return v0
.end method

.method public ۥ۟۟ۡ(I)V
    .locals 2

    const-wide/16 v0, 0xc8

    invoke-virtual {p0, p1, v0, v1}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟ۡ۟(IJ)LYue/ۥۢۤۦۦ;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥۢۤۦۦ;->ۥ۟۟۠ۨ()V

    :cond_0
    return-void
.end method

.method public ۥ۟۟ۡ۟(IJ)LYue/ۥۢۤۦۦ;
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-static {v0}, LYue/ۥۢۤۤۦ;->ۥ۟۟۟ۡ(Landroid/view/View;)LYue/ۥۢۤۦۦ;

    move-result-object v0

    if-nez p1, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, LYue/ۥۢۤۦۦ;->ۥ۟(F)LYue/ۥۢۤۦۦ;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, LYue/ۥۢۤۦۦ;->ۥ۟۟۠ۢ(J)LYue/ۥۢۤۦۦ;

    move-result-object p2

    new-instance p3, Landroidx/appcompat/widget/ۥ۟۟۟ۡ$ۥ۟;

    invoke-direct {p3, p0, p1}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ$ۥ۟;-><init>(Landroidx/appcompat/widget/ۥ۟۟۟ۡ;I)V

    invoke-virtual {p2, p3}, LYue/ۥۢۤۦۦ;->ۥ۟۟۠ۤ(LYue/ۥۢۤۦۨ;)LYue/ۥۢۤۦۦ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡ۠(I)V
    .locals 4

    iget v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠۟:I

    if-eq p1, v0, :cond_5

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/View;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v3, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/View;

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/widget/Spinner;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v3, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/widget/Spinner;

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_2
    :goto_0
    iput p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠۟:I

    if-eqz p1, :cond_5

    const/4 v0, 0x0

    if-eq p1, v2, :cond_4

    if-ne p1, v1, :cond_3

    iget-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/View;

    if-eqz p1, :cond_5

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    iget-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/Toolbar$ۥ۟۟۟ۡ;

    const/4 v0, -0x2

    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    const v0, 0x800053

    iput v0, p1, Landroidx/appcompat/app/ۥ$ۥ۟;->ۥ:I

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid navigation mode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟ۢۧ()V

    iget-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/widget/Spinner;

    invoke-virtual {p1, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    :cond_5
    :goto_1
    return-void
.end method

.method public ۥ۟۟ۡۡ(I)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, LYue/ۥۣ۟ۡ۠;->ۥ۟(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟ۢۤ(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public ۥ۟۟ۡۢ(Landroidx/appcompat/view/menu/ۥ۟۟۟ۤ$ۥ;Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/widget/Toolbar;->setMenuCallbacks(Landroidx/appcompat/view/menu/ۥ۟۟۟ۤ$ۥ;Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ;)V

    return-void
.end method

.method public ۥۣ۟۟ۡ()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    return-object v0
.end method

.method public ۥ۟۟ۡۤ(Z)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟ۡۥ(Landroid/widget/SpinnerAdapter;Landroid/widget/AdapterView$OnItemSelectedListener;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟ۢۧ()V

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/widget/Spinner;

    invoke-virtual {v0, p1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    iget-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/widget/Spinner;

    invoke-virtual {p1, p2}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method public ۥ۟۟ۡۦ(Landroid/util/SparseArray;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    return-void
.end method

.method public ۥ۟۟ۡۧ()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۡۨ()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟:I

    return v0
.end method

.method public ۥ۟۟ۢ()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/widget/Spinner;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۢ۟(I)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠ۡ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۥ۟۟ۢ۠(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟۟:Landroid/view/View;

    if-eqz v0, :cond_0

    iget v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟:I

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟۟:Landroid/view/View;

    if-eqz p1, :cond_1

    iget v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public ۥ۟۟ۢۡ()V
    .locals 2

    const-string v0, "ToolbarWidgetWrapper"

    const-string v1, "Progress display unsupported"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public ۥ۟۟ۢۢ()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/widget/Spinner;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getCount()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥۣ۟۟ۢ()V
    .locals 2

    const-string v0, "ToolbarWidgetWrapper"

    const-string v1, "Progress display unsupported"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public ۥ۟۟ۢۤ(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۢ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥۣ۟۟۟()V

    return-void
.end method

.method public ۥ۟۟ۢۥ(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setCollapsible(Z)V

    return-void
.end method

.method public final ۥ۟۟ۢۦ()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠ۡ:Landroid/graphics/drawable/Drawable;

    const/16 v0, 0xf

    goto :goto_0

    :cond_0
    const/16 v0, 0xb

    :goto_0
    return v0
.end method

.method public final ۥ۟۟ۢۧ()V
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/widget/Spinner;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥۣ۟ۡۤ;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    sget v3, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟۟ۧ:I

    invoke-direct {v0, v1, v2, v3}, LYue/ۥۣ۟ۡۤ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/widget/Spinner;

    new-instance v0, Landroidx/appcompat/widget/Toolbar$ۥ۟۟۟ۡ;

    const v1, 0x800013

    const/4 v2, -0x2

    invoke-direct {v0, v2, v2, v1}, Landroidx/appcompat/widget/Toolbar$ۥ۟۟۟ۡ;-><init>(III)V

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/widget/Spinner;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public final ۥ۟۟ۢۨ(Ljava/lang/CharSequence;)V
    .locals 1

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ:Ljava/lang/CharSequence;

    iget v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-boolean v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥۣ۟۟۟:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p1}, LYue/ۥۢۤۤۦ;->ۥ۟۠ۡۢ(Landroid/view/View;Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final ۥۣ۟۟()V
    .locals 2

    iget v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۦ:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    iget v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠۠:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۦ:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۥۣ۟۟۟()V
    .locals 2

    iget v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۢ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۠ۡ:Landroid/graphics/drawable/Drawable;

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    :goto_1
    return-void
.end method

.method public final ۥۣ۟۟۠()V
    .locals 2

    iget v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟:I

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_2

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟۠:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟۟۠:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/Toolbar;->setLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

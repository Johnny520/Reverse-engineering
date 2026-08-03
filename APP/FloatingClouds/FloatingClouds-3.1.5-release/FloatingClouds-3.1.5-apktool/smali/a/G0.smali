.class public final La/G0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:La/Y0;

.field public c:I

.field public d:La/mf;

.field public e:La/mf;

.field public f:La/mf;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, La/G0;->c:I

    iput-object p1, p0, La/G0;->a:Landroid/view/View;

    invoke-static {}, La/Y0;->a()La/Y0;

    move-result-object p1

    iput-object p1, p0, La/G0;->b:La/Y0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, La/G0;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v2, p0, La/G0;->d:La/mf;

    if-eqz v2, :cond_4

    iget-object v2, p0, La/G0;->f:La/mf;

    if-nez v2, :cond_0

    new-instance v2, La/mf;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, La/G0;->f:La/mf;

    :cond_0
    iget-object v2, p0, La/G0;->f:La/mf;

    const/4 v3, 0x0

    iput-object v3, v2, La/mf;->a:Landroid/content/res/ColorStateList;

    const/4 v4, 0x0

    iput-boolean v4, v2, La/mf;->d:Z

    iput-object v3, v2, La/mf;->b:Landroid/graphics/PorterDuff$Mode;

    iput-boolean v4, v2, La/mf;->c:Z

    sget-object v3, La/ug;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, La/ug$d;->g(Landroid/view/View;)Landroid/content/res/ColorStateList;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    iput-boolean v4, v2, La/mf;->d:Z

    iput-object v3, v2, La/mf;->a:Landroid/content/res/ColorStateList;

    :cond_1
    invoke-static {v0}, La/ug$d;->h(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v3

    if-eqz v3, :cond_2

    iput-boolean v4, v2, La/mf;->c:Z

    iput-object v3, v2, La/mf;->b:Landroid/graphics/PorterDuff$Mode;

    :cond_2
    iget-boolean v3, v2, La/mf;->d:Z

    if-nez v3, :cond_3

    iget-boolean v3, v2, La/mf;->c:Z

    if-eqz v3, :cond_4

    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-static {v1, v2, v0}, La/Y0;->e(Landroid/graphics/drawable/Drawable;La/mf;[I)V

    return-void

    :cond_4
    iget-object v2, p0, La/G0;->e:La/mf;

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-static {v1, v2, v0}, La/Y0;->e(Landroid/graphics/drawable/Drawable;La/mf;[I)V

    return-void

    :cond_5
    iget-object v2, p0, La/G0;->d:La/mf;

    if-eqz v2, :cond_6

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-static {v1, v2, v0}, La/Y0;->e(Landroid/graphics/drawable/Drawable;La/mf;[I)V

    :cond_6
    return-void
.end method

.method public final b()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, La/G0;->e:La/mf;

    if-eqz v0, :cond_0

    iget-object v0, v0, La/mf;->a:Landroid/content/res/ColorStateList;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, La/G0;->e:La/mf;

    if-eqz v0, :cond_0

    iget-object v0, v0, La/mf;->b:Landroid/graphics/PorterDuff$Mode;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final d(Landroid/util/AttributeSet;I)V
    .locals 9

    iget-object v0, p0, La/G0;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Landroidx/appcompat/R$styleable;->ViewBackgroundHelper:[I

    invoke-static {v1, p1, v2, p2}, La/of;->e(Landroid/content/Context;Landroid/util/AttributeSet;[II)La/of;

    move-result-object v1

    iget-object v2, v1, La/of;->b:Landroid/content/res/TypedArray;

    iget-object v3, p0, La/G0;->a:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    sget-object v5, Landroidx/appcompat/R$styleable;->ViewBackgroundHelper:[I

    iget-object v7, v1, La/of;->b:Landroid/content/res/TypedArray;

    move-object v6, p1

    move v8, p2

    invoke-static/range {v3 .. v8}, La/ug;->i(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    :try_start_0
    sget p1, Landroidx/appcompat/R$styleable;->ViewBackgroundHelper_android_background:I

    invoke-virtual {v2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p1

    const/4 p2, -0x1

    if-eqz p1, :cond_0

    sget p1, Landroidx/appcompat/R$styleable;->ViewBackgroundHelper_android_background:I

    invoke-virtual {v2, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    iput p1, p0, La/G0;->c:I

    iget-object p1, p0, La/G0;->b:La/Y0;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    iget v4, p0, La/G0;->c:I

    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v5, p1, La/Y0;->a:La/pd;

    invoke-virtual {v5, v3, v4}, La/pd;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit p1

    if-eqz v3, :cond_0

    invoke-virtual {p0, v3}, La/G0;->g(Landroid/content/res/ColorStateList;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object p2, v0

    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw p2

    :cond_0
    :goto_0
    sget p1, Landroidx/appcompat/R$styleable;->ViewBackgroundHelper_backgroundTint:I

    invoke-virtual {v2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p1

    if-eqz p1, :cond_1

    sget p1, Landroidx/appcompat/R$styleable;->ViewBackgroundHelper_backgroundTint:I

    invoke-virtual {v1, p1}, La/of;->a(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {v0, p1}, La/ug$d;->q(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    :cond_1
    sget p1, Landroidx/appcompat/R$styleable;->ViewBackgroundHelper_backgroundTintMode:I

    invoke-virtual {v2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p1

    if-eqz p1, :cond_2

    sget p1, Landroidx/appcompat/R$styleable;->ViewBackgroundHelper_backgroundTintMode:I

    invoke-virtual {v2, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    const/4 p2, 0x0

    invoke-static {p1, p2}, La/x5;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    invoke-static {v0, p1}, La/ug$d;->r(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_2
    invoke-virtual {v1}, La/of;->f()V

    return-void

    :goto_1
    invoke-virtual {v1}, La/of;->f()V

    throw p1
.end method

.method public final e()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, La/G0;->c:I

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, La/G0;->g(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, La/G0;->a()V

    return-void
.end method

.method public final f(I)V
    .locals 3

    iput p1, p0, La/G0;->c:I

    iget-object v0, p0, La/G0;->b:La/Y0;

    if-eqz v0, :cond_0

    iget-object v1, p0, La/G0;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, La/Y0;->a:La/pd;

    invoke-virtual {v2, v1, p1}, La/pd;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, La/G0;->g(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, La/G0;->a()V

    return-void
.end method

.method public final g(Landroid/content/res/ColorStateList;)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, La/G0;->d:La/mf;

    if-nez v0, :cond_0

    new-instance v0, La/mf;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/G0;->d:La/mf;

    :cond_0
    iget-object v0, p0, La/G0;->d:La/mf;

    iput-object p1, v0, La/mf;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, La/mf;->d:Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, La/G0;->d:La/mf;

    :goto_0
    invoke-virtual {p0}, La/G0;->a()V

    return-void
.end method

.method public final h(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, La/G0;->e:La/mf;

    if-nez v0, :cond_0

    new-instance v0, La/mf;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/G0;->e:La/mf;

    :cond_0
    iget-object v0, p0, La/G0;->e:La/mf;

    iput-object p1, v0, La/mf;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, La/mf;->d:Z

    invoke-virtual {p0}, La/G0;->a()V

    return-void
.end method

.method public final i(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, La/G0;->e:La/mf;

    if-nez v0, :cond_0

    new-instance v0, La/mf;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/G0;->e:La/mf;

    :cond_0
    iget-object v0, p0, La/G0;->e:La/mf;

    iput-object p1, v0, La/mf;->b:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v0, La/mf;->c:Z

    invoke-virtual {p0}, La/G0;->a()V

    return-void
.end method

.class public final LQx;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:LTB;

.field public b:LTB;

.field public c:LTB;

.field public d:LTB;

.field public e:LXb;

.field public f:LXb;

.field public g:LXb;

.field public h:LXb;

.field public i:Lgf;

.field public j:Lgf;

.field public k:Lgf;

.field public l:Lgf;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LPw;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LQx;->a:LTB;

    new-instance v0, LPw;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LQx;->b:LTB;

    new-instance v0, LPw;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LQx;->c:LTB;

    new-instance v0, LPw;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LQx;->d:LTB;

    new-instance v0, Lr;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr;-><init>(F)V

    iput-object v0, p0, LQx;->e:LXb;

    new-instance v0, Lr;

    invoke-direct {v0, v1}, Lr;-><init>(F)V

    iput-object v0, p0, LQx;->f:LXb;

    new-instance v0, Lr;

    invoke-direct {v0, v1}, Lr;-><init>(F)V

    iput-object v0, p0, LQx;->g:LXb;

    new-instance v0, Lr;

    invoke-direct {v0, v1}, Lr;-><init>(F)V

    iput-object v0, p0, LQx;->h:LXb;

    new-instance v0, Lgf;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    iput-object v0, p0, LQx;->i:Lgf;

    new-instance v0, Lgf;

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    iput-object v0, p0, LQx;->j:Lgf;

    new-instance v0, Lgf;

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    iput-object v0, p0, LQx;->k:Lgf;

    new-instance v0, Lgf;

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    iput-object v0, p0, LQx;->l:Lgf;

    return-void
.end method

.method public static a(Landroid/content/Context;IILr;)LPx;
    .locals 6

    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-direct {v0, p0, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    const/4 p0, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    invoke-virtual {p1, p2, p0}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_0
    sget-object p1, LVu;->y:[I

    invoke-virtual {v0, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    :try_start_0
    invoke-virtual {p1, p2, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    const/4 v0, 0x3

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    const/4 v2, 0x2

    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    invoke-virtual {p1, p0, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p0

    const/4 p2, 0x5

    invoke-static {p1, p2, p3}, LQx;->c(Landroid/content/res/TypedArray;ILXb;)LXb;

    move-result-object p2

    const/16 p3, 0x8

    invoke-static {p1, p3, p2}, LQx;->c(Landroid/content/res/TypedArray;ILXb;)LXb;

    move-result-object p3

    const/16 v3, 0x9

    invoke-static {p1, v3, p2}, LQx;->c(Landroid/content/res/TypedArray;ILXb;)LXb;

    move-result-object v3

    const/4 v4, 0x7

    invoke-static {p1, v4, p2}, LQx;->c(Landroid/content/res/TypedArray;ILXb;)LXb;

    move-result-object v4

    const/4 v5, 0x6

    invoke-static {p1, v5, p2}, LQx;->c(Landroid/content/res/TypedArray;ILXb;)LXb;

    move-result-object p2

    new-instance v5, LPx;

    invoke-direct {v5}, LPx;-><init>()V

    invoke-static {v0}, LfG;->L(I)LTB;

    move-result-object v0

    iput-object v0, v5, LPx;->a:LTB;

    iput-object p3, v5, LPx;->e:LXb;

    invoke-static {v1}, LfG;->L(I)LTB;

    move-result-object p3

    iput-object p3, v5, LPx;->b:LTB;

    iput-object v3, v5, LPx;->f:LXb;

    invoke-static {v2}, LfG;->L(I)LTB;

    move-result-object p3

    iput-object p3, v5, LPx;->c:LTB;

    iput-object v4, v5, LPx;->g:LXb;

    invoke-static {p0}, LfG;->L(I)LTB;

    move-result-object p0

    iput-object p0, v5, LPx;->d:LTB;

    iput-object p2, v5, LPx;->h:LXb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-object v5

    :catchall_0
    move-exception p0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p0
.end method

.method public static b(Landroid/content/Context;Landroid/util/AttributeSet;II)LPx;
    .locals 3

    new-instance v0, Lr;

    const/4 v1, 0x0

    int-to-float v2, v1

    invoke-direct {v0, v2}, Lr;-><init>(F)V

    sget-object v2, LVu;->r:[I

    invoke-virtual {p0, p1, v2, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    const/4 p3, 0x1

    invoke-virtual {p1, p3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-static {p0, p2, p3, v0}, LQx;->a(Landroid/content/Context;IILr;)LPx;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/res/TypedArray;ILXb;)LXb;
    .locals 2

    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p1, Landroid/util/TypedValue;->type:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    new-instance p2, Lr;

    iget p1, p1, Landroid/util/TypedValue;->data:I

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result p0

    int-to-float p0, p0

    invoke-direct {p2, p0}, Lr;-><init>(F)V

    return-object p2

    :cond_1
    const/4 p0, 0x6

    if-ne v0, p0, :cond_2

    new-instance p0, LRv;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2, p2}, Landroid/util/TypedValue;->getFraction(FF)F

    move-result p1

    invoke-direct {p0, p1}, LRv;-><init>(F)V

    return-object p0

    :cond_2
    :goto_0
    return-object p2
.end method


# virtual methods
.method public final d()Z
    .locals 1

    iget-object v0, p0, LQx;->b:LTB;

    instance-of v0, v0, LPw;

    if-eqz v0, :cond_0

    iget-object v0, p0, LQx;->a:LTB;

    instance-of v0, v0, LPw;

    if-eqz v0, :cond_0

    iget-object v0, p0, LQx;->c:LTB;

    instance-of v0, v0, LPw;

    if-eqz v0, :cond_0

    iget-object v0, p0, LQx;->d:LTB;

    instance-of v0, v0, LPw;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e(Landroid/graphics/RectF;)Z
    .locals 5

    iget-object v0, p0, LQx;->l:Lgf;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lgf;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LQx;->j:Lgf;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LQx;->i:Lgf;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LQx;->k:Lgf;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v1, p0, LQx;->e:LXb;

    invoke-interface {v1, p1}, LXb;->a(Landroid/graphics/RectF;)F

    move-result v1

    iget-object v4, p0, LQx;->f:LXb;

    invoke-interface {v4, p1}, LXb;->a(Landroid/graphics/RectF;)F

    move-result v4

    cmpl-float v4, v4, v1

    if-nez v4, :cond_1

    iget-object v4, p0, LQx;->h:LXb;

    invoke-interface {v4, p1}, LXb;->a(Landroid/graphics/RectF;)F

    move-result v4

    cmpl-float v4, v4, v1

    if-nez v4, :cond_1

    iget-object v4, p0, LQx;->g:LXb;

    invoke-interface {v4, p1}, LXb;->a(Landroid/graphics/RectF;)F

    move-result p1

    cmpl-float p1, p1, v1

    if-nez p1, :cond_1

    move p1, v3

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LQx;->d()Z

    move-result p1

    if-eqz p1, :cond_2

    return v3

    :cond_2
    return v2
.end method

.method public final f()LPx;
    .locals 2

    new-instance v0, LPx;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, LQx;->a:LTB;

    iput-object v1, v0, LPx;->a:LTB;

    iget-object v1, p0, LQx;->b:LTB;

    iput-object v1, v0, LPx;->b:LTB;

    iget-object v1, p0, LQx;->c:LTB;

    iput-object v1, v0, LPx;->c:LTB;

    iget-object v1, p0, LQx;->d:LTB;

    iput-object v1, v0, LPx;->d:LTB;

    iget-object v1, p0, LQx;->e:LXb;

    iput-object v1, v0, LPx;->e:LXb;

    iget-object v1, p0, LQx;->f:LXb;

    iput-object v1, v0, LPx;->f:LXb;

    iget-object v1, p0, LQx;->g:LXb;

    iput-object v1, v0, LPx;->g:LXb;

    iget-object v1, p0, LQx;->h:LXb;

    iput-object v1, v0, LPx;->h:LXb;

    iget-object v1, p0, LQx;->i:Lgf;

    iput-object v1, v0, LPx;->i:Lgf;

    iget-object v1, p0, LQx;->j:Lgf;

    iput-object v1, v0, LPx;->j:Lgf;

    iget-object v1, p0, LQx;->k:Lgf;

    iput-object v1, v0, LPx;->k:Lgf;

    iget-object v1, p0, LQx;->l:Lgf;

    iput-object v1, v0, LPx;->l:Lgf;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LQx;->e:LXb;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LQx;->f:LXb;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LQx;->g:LXb;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LQx;->h:LXb;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

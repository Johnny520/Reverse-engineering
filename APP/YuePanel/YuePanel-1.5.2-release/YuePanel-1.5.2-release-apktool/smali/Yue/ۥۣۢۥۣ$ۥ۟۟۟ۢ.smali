.class public LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۢۥۣ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e2"
.end annotation


# instance fields
.field public ۥ:I

.field public ۥ۟:LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

.field public ۥ۟۟:Landroid/content/res/ColorStateList;

.field public ۥ۟۟۟:Landroid/graphics/PorterDuff$Mode;

.field public ۥ۟۟۟۟:Z

.field public ۥ۟۟۟۠:Landroid/graphics/Bitmap;

.field public ۥ۟۟۟ۡ:[I

.field public ۥ۟۟۟ۢ:Landroid/content/res/ColorStateList;

.field public ۥۣ۟۟۟:Landroid/graphics/PorterDuff$Mode;

.field public ۥ۟۟۟ۤ:I

.field public ۥ۟۟۟ۥ:Z

.field public ۥ۟۟۟ۦ:Z

.field public ۥ۟۟۟ۧ:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟:Landroid/content/res/ColorStateList;

    .line 15
    sget-object v0, LYue/ۥۣۢۥۣ;->ۥۣ۟۟ۡ:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟:Landroid/graphics/PorterDuff$Mode;

    .line 16
    new-instance v0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

    invoke-direct {v0}, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;-><init>()V

    iput-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟:LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟:Landroid/content/res/ColorStateList;

    .line 3
    sget-object v0, LYue/ۥۣۢۥۣ;->ۥۣ۟۟ۡ:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_2

    .line 4
    iget v0, p1, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ:I

    iput v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ:I

    .line 5
    new-instance v0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

    iget-object v1, p1, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟:LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

    invoke-direct {v0, v1}, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;-><init>(LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;)V

    iput-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟:LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

    .line 6
    iget-object v1, p1, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟:LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

    iget-object v1, v1, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;->ۥ۟۟۟۟:Landroid/graphics/Paint;

    if-eqz v1, :cond_0

    .line 7
    new-instance v1, Landroid/graphics/Paint;

    iget-object v2, p1, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟:LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

    iget-object v2, v2, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;->ۥ۟۟۟۟:Landroid/graphics/Paint;

    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v1, v0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;->ۥ۟۟۟۟:Landroid/graphics/Paint;

    .line 8
    :cond_0
    iget-object v0, p1, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟:LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

    iget-object v0, v0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/graphics/Paint;

    if-eqz v0, :cond_1

    .line 9
    iget-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟:LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

    new-instance v1, Landroid/graphics/Paint;

    iget-object v2, p1, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟:LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

    iget-object v2, v2, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/graphics/Paint;

    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v1, v0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;->ۥ۟۟۟:Landroid/graphics/Paint;

    .line 10
    :cond_1
    iget-object v0, p1, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟:Landroid/content/res/ColorStateList;

    iput-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟:Landroid/content/res/ColorStateList;

    .line 11
    iget-object v0, p1, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟:Landroid/graphics/PorterDuff$Mode;

    .line 12
    iget-boolean p1, p1, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟۟:Z

    iput-boolean p1, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟۟:Z

    :cond_2
    return-void
.end method


# virtual methods
.method public getChangingConfigurations()I
    .locals 1

    iget v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ:I

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 1
    new-instance v0, LYue/ۥۣۢۥۣ;

    invoke-direct {v0, p0}, LYue/ۥۣۢۥۣ;-><init>(LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;)V

    return-object v0
.end method

.method public newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .line 2
    new-instance p1, LYue/ۥۣۢۥۣ;

    invoke-direct {p1, p0}, LYue/ۥۣۢۥۣ;-><init>(LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;)V

    return-object p1
.end method

.method public ۥ(II)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟۠:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟۠:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public ۥ۟()Z
    .locals 2

    iget-boolean v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۢ:Landroid/content/res/ColorStateList;

    iget-object v1, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟:Landroid/content/res/ColorStateList;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥۣ۟۟۟:Landroid/graphics/PorterDuff$Mode;

    iget-object v1, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟:Landroid/graphics/PorterDuff$Mode;

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۥ:Z

    iget-boolean v1, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟۟:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۤ:I

    iget-object v1, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟:LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

    invoke-virtual {v1}, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;->getRootAlpha()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟(II)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟۠:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ(II)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟۠:Landroid/graphics/Bitmap;

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Z

    :cond_1
    return-void
.end method

.method public ۥ۟۟۟(Landroid/graphics/Canvas;Landroid/graphics/ColorFilter;Landroid/graphics/Rect;)V
    .locals 2

    invoke-virtual {p0, p2}, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟۟(Landroid/graphics/ColorFilter;)Landroid/graphics/Paint;

    move-result-object p2

    iget-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟۠:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p3, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public ۥ۟۟۟۟(Landroid/graphics/ColorFilter;)Landroid/graphics/Paint;
    .locals 2

    invoke-virtual {p0}, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟۠()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroid/graphics/Paint;

    if-nez v0, :cond_1

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    :cond_1
    iget-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroid/graphics/Paint;

    iget-object v1, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟:LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

    invoke-virtual {v1}, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;->getRootAlpha()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    iget-object p1, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroid/graphics/Paint;

    return-object p1
.end method

.method public ۥ۟۟۟۠()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟:LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

    invoke-virtual {v0}, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;->getRootAlpha()I

    move-result v0

    const/16 v1, 0xff

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟ۡ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟:LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

    invoke-virtual {v0}, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;->ۥ۟۟۟۠()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۢ([I)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟:LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ([I)Z

    move-result p1

    iget-boolean v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Z

    or-int/2addr v0, p1

    iput-boolean v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Z

    return p1
.end method

.method public ۥۣ۟۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟:Landroid/content/res/ColorStateList;

    iput-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۢ:Landroid/content/res/ColorStateList;

    iget-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥۣ۟۟۟:Landroid/graphics/PorterDuff$Mode;

    iget-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟:LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

    invoke-virtual {v0}, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;->getRootAlpha()I

    move-result v0

    iput v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۤ:I

    iget-boolean v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟۟:Z

    iput-boolean v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۥ:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Z

    return-void
.end method

.method public ۥ۟۟۟ۤ(II)V
    .locals 3

    iget-object v0, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟۠:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟۟۟۠:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iget-object v1, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۢ;->ۥ۟:LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, p1, p2, v2}, LYue/ۥۣۢۥۣ$ۥ۟۟۟ۡ;->ۥ۟(Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V

    return-void
.end method

.class public LYue/ۥۣۢۥۤ;
.super LYue/ۥۡۦۦۨ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation


# static fields
.field public static ۥ۟۟:Z = false

.field public static final ۥ۟۟۟:I = 0x14


# instance fields
.field public final ۥ۟:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/Resources;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/content/res/Resources;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0, p2}, LYue/ۥۡۦۦۨ;-><init>(Landroid/content/res/Resources;)V

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, LYue/ۥۣۢۥۤ;->ۥ۟:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static ۥ۟۟۟ۤ()Z
    .locals 1

    sget-boolean v0, LYue/ۥۣۢۥۤ;->ۥ۟۟:Z

    return v0
.end method

.method public static ۥ۟۟۟ۥ(Z)V
    .locals 0

    sput-boolean p0, LYue/ۥۣۢۥۤ;->ۥ۟۟:Z

    return-void
.end method

.method public static ۥ۟۟۟ۦ()Z
    .locals 1

    invoke-static {}, LYue/ۥۣۢۥۤ;->ۥ۟۟۟ۤ()Z

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public bridge synthetic getAnimation(I)Landroid/content/res/XmlResourceParser;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getAnimation(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getBoolean(I)Z
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getBoolean(I)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic getColor(I)I
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getColor(I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getColorStateList(I)Landroid/content/res/ColorStateList;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getConfiguration()Landroid/content/res/Configuration;
    .locals 1

    invoke-super {p0}, LYue/ۥۡۦۦۨ;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDimension(I)F
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getDimension(I)F

    move-result p1

    return p1
.end method

.method public bridge synthetic getDimensionPixelOffset(I)I
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getDimensionPixelOffset(I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getDimensionPixelSize(I)I
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getDimensionPixelSize(I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getDisplayMetrics()Landroid/util/DisplayMetrics;
    .locals 1

    invoke-super {p0}, LYue/ۥۡۦۦۨ;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    return-object v0
.end method

.method public getDrawable(I)Landroid/graphics/drawable/Drawable;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, LYue/ۥۣۢۥۤ;->ۥ۟:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, LYue/ۥۡۦۦۢ;->ۥ۟۟۟ۢ()LYue/ۥۡۦۦۢ;

    move-result-object v1

    invoke-virtual {v1, v0, p0, p1}, LYue/ۥۡۦۦۢ;->ۥۣ۟۟۠(Landroid/content/Context;LYue/ۥۣۢۥۤ;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥۡۦۦۨ;->ۥ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x15
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, LYue/ۥۡۦۦۨ;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getDrawableForDensity(II)Landroid/graphics/drawable/Drawable;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, LYue/ۥۡۦۦۨ;->getDrawableForDensity(II)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getDrawableForDensity(IILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x15
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000,
            0x1000
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    .line 2
    invoke-super {p0, p1, p2, p3}, LYue/ۥۡۦۦۨ;->getDrawableForDensity(IILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getFraction(III)F
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000,
            0x1000
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    invoke-super {p0, p1, p2, p3}, LYue/ۥۡۦۦۨ;->getFraction(III)F

    move-result p1

    return p1
.end method

.method public bridge synthetic getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000,
            0x1000
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    invoke-super {p0, p1, p2, p3}, LYue/ۥۡۦۦۨ;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getIntArray(I)[I
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getIntArray(I)[I

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getInteger(I)I
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getInteger(I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getLayout(I)Landroid/content/res/XmlResourceParser;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getLayout(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getMovie(I)Landroid/graphics/Movie;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getMovie(I)Landroid/graphics/Movie;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getQuantityString(II)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, LYue/ۥۡۦۦۨ;->getQuantityString(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000,
            0x1000
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    .line 2
    invoke-super {p0, p1, p2, p3}, LYue/ۥۡۦۦۨ;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getQuantityText(II)Ljava/lang/CharSequence;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1, p2}, LYue/ۥۡۦۦۨ;->getQuantityText(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getResourceEntryName(I)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getResourceName(I)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getResourcePackageName(I)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getResourceTypeName(I)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getString(I)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getString(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    .line 2
    invoke-super {p0, p1, p2}, LYue/ۥۡۦۦۨ;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getStringArray(I)[Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getStringArray(I)[Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getText(I)Ljava/lang/CharSequence;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getText(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    .line 2
    invoke-super {p0, p1, p2}, LYue/ۥۡۦۦۨ;->getText(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getTextArray(I)[Ljava/lang/CharSequence;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getTextArray(I)[Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getValue(ILandroid/util/TypedValue;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000,
            0x1000
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1, p2, p3}, LYue/ۥۡۦۦۨ;->getValue(ILandroid/util/TypedValue;Z)V

    return-void
.end method

.method public bridge synthetic getXml(I)Landroid/content/res/XmlResourceParser;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic obtainTypedArray(I)Landroid/content/res/TypedArray;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic openRawResource(I)Ljava/io/InputStream;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->openRawResource(I)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟(Ljava/lang/String;Landroid/util/TypedValue;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000,
            0x1000
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1, p2, p3}, LYue/ۥۡۦۦۨ;->ۥ۟(Ljava/lang/String;Landroid/util/TypedValue;Z)V

    return-void
.end method

.method public bridge synthetic ۥ۟۟(IILandroid/util/TypedValue;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000,
            0x1000,
            0x1000
        }
        names = {
            null,
            null,
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1, p2, p3, p4}, LYue/ۥۡۦۦۨ;->ۥ۟۟(IILandroid/util/TypedValue;Z)V

    return-void
.end method

.method public bridge synthetic ۥ۟۟۟(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    invoke-super {p0, p1, p2}, LYue/ۥۡۦۦۨ;->ۥ۟۟۟(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟۟۟(ILandroid/util/TypedValue;)Ljava/io/InputStream;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1, p2}, LYue/ۥۡۦۦۨ;->ۥ۟۟۟۟(ILandroid/util/TypedValue;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟۟۠(I)Landroid/content/res/AssetFileDescriptor;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/res/Resources$NotFoundException;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۦۦۨ;->ۥ۟۟۟۠(I)Landroid/content/res/AssetFileDescriptor;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟۟ۡ(Ljava/lang/String;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000,
            0x1000
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    invoke-super {p0, p1, p2, p3}, LYue/ۥۡۦۦۨ;->ۥ۟۟۟ۡ(Ljava/lang/String;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    return-void
.end method

.method public bridge synthetic ۥ۟۟۟ۢ(Landroid/content/res/XmlResourceParser;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    invoke-super {p0, p1, p2}, LYue/ۥۡۦۦۨ;->ۥ۟۟۟ۢ(Landroid/content/res/XmlResourceParser;Landroid/os/Bundle;)V

    return-void
.end method

.method public bridge synthetic ۥۣ۟۟۟(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    invoke-super {p0, p1, p2}, LYue/ۥۡۦۦۨ;->ۥۣ۟۟۟(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    return-void
.end method

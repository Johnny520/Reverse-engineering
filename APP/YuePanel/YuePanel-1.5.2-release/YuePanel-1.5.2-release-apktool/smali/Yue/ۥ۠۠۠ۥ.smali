.class public final LYue/ۥ۠۠۠ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠۠۠ۥ$ۥ;,
        LYue/ۥ۠۠۠ۥ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ:Ljava/lang/String; = "DrawableCompat"

.field public static ۥ۟:Ljava/lang/reflect/Method;

.field public static ۥ۟۟:Z

.field public static ۥ۟۟۟:Ljava/lang/reflect/Method;

.field public static ۥ۟۟۟۟:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources$Theme;)V
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/content/res/Resources$Theme;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥ۠۠۠ۥ$ۥ;->ۥ(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public static ۥ۟(Landroid/graphics/drawable/Drawable;)Z
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥ۠۠۠ۥ$ۥ;->ۥ۟(Landroid/graphics/drawable/Drawable;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    return-void
.end method

.method public static ۥ۟۟۟(Landroid/graphics/drawable/Drawable;)I
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getAlpha()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟۟(Landroid/graphics/drawable/Drawable;)Landroid/graphics/ColorFilter;
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-static {p0}, LYue/ۥ۠۠۠ۥ$ۥ;->ۥ۟۟(Landroid/graphics/drawable/Drawable;)Landroid/graphics/ColorFilter;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۠(Landroid/graphics/drawable/Drawable;)I
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥ۠۠۠ۥ$ۥ۟;->ۥ(Landroid/graphics/drawable/Drawable;)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۡ(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/content/res/Resources;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Lorg/xmlpull/v1/XmlPullParser;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # Landroid/content/res/Resources$Theme;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥ۠۠۠ۥ$ۥ;->ۥ۟۟۟(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public static ۥ۟۟۟ۢ(Landroid/graphics/drawable/Drawable;)Z
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isAutoMirrored()Z

    move-result p0

    return p0
.end method

.method public static ۥۣ۟۟۟(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    return-void
.end method

.method public static ۥ۟۟۟ۤ(Landroid/graphics/drawable/Drawable;Z)V
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    return-void
.end method

.method public static ۥ۟۟۟ۥ(Landroid/graphics/drawable/Drawable;FF)V
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p1, p2}, LYue/ۥ۠۠۠ۥ$ۥ;->ۥ۟۟۟۟(Landroid/graphics/drawable/Drawable;FF)V

    return-void
.end method

.method public static ۥ۟۟۟ۦ(Landroid/graphics/drawable/Drawable;IIII)V
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥ۠۠۠ۥ$ۥ;->ۥ۟۟۟۠(Landroid/graphics/drawable/Drawable;IIII)V

    return-void
.end method

.method public static ۥ۟۟۟ۧ(Landroid/graphics/drawable/Drawable;I)Z
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥ۠۠۠ۥ$ۥ۟;->ۥ۟(Landroid/graphics/drawable/Drawable;I)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۨ(Landroid/graphics/drawable/Drawable;I)V
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥ۠۠۠ۥ$ۥ;->ۥ۟۟۟ۡ(Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public static ۥ۟۟۠(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥ۠۠۠ۥ$ۥ;->ۥ۟۟۟ۢ(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static ۥ۟۟۠۟(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/PorterDuff$Mode;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥ۠۠۠ۥ$ۥ;->ۥۣ۟۟۟(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public static ۥ۟۟۠۠(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/graphics/drawable/Drawable;",
            ">(",
            "Landroid/graphics/drawable/Drawable;",
            ")TT;"
        }
    .end annotation

    instance-of v0, p0, LYue/ۥۢۦ۠۟;

    if-eqz v0, :cond_0

    check-cast p0, LYue/ۥۢۦ۠۟;

    invoke-interface {p0}, LYue/ۥۢۦ۠۟;->ۥ۟()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static ۥ۟۟۠ۡ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 0
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    return-object p0
.end method

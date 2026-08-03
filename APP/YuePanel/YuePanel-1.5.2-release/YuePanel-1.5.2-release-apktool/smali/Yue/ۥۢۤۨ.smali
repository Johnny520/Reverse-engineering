.class public LYue/ۥۢۤۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:LYue/ۥۢۤۨۡ;

.field public static final ۥ۟:Ljava/lang/String; = "ViewUtils"

.field public static final ۥ۟۟:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, LYue/ۥۢۥ۟;

    invoke-direct {v0}, LYue/ۥۢۥ۟;-><init>()V

    sput-object v0, LYue/ۥۢۤۨ;->ۥ:LYue/ۥۢۤۨۡ;

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۢۥ;

    invoke-direct {v0}, LYue/ۥۢۥ;-><init>()V

    sput-object v0, LYue/ۥۢۤۨ;->ۥ:LYue/ۥۢۤۨۡ;

    :goto_0
    new-instance v0, LYue/ۥۢۤۨ$ۥ;

    const-class v1, Ljava/lang/Float;

    const-string v2, "translationAlpha"

    invoke-direct {v0, v1, v2}, LYue/ۥۢۤۨ$ۥ;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, LYue/ۥۢۤۨ;->ۥ۟۟:Landroid/util/Property;

    new-instance v0, LYue/ۥۢۤۨ$ۥ۟;

    const-class v1, Landroid/graphics/Rect;

    const-string v2, "clipBounds"

    invoke-direct {v0, v1, v2}, LYue/ۥۢۤۨ$ۥ۟;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, LYue/ۥۢۤۨ;->ۥ۟۟۟:Landroid/util/Property;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/view/View;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget-object v0, LYue/ۥۢۤۨ;->ۥ:LYue/ۥۢۤۨۡ;

    invoke-virtual {v0, p0}, LYue/ۥۢۤۨۡ;->ۥ(Landroid/view/View;)V

    return-void
.end method

.method public static ۥ۟(Landroid/view/View;)F
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget-object v0, LYue/ۥۢۤۨ;->ۥ:LYue/ۥۢۤۨۡ;

    invoke-virtual {v0, p0}, LYue/ۥۢۤۨۡ;->ۥ۟۟(Landroid/view/View;)F

    move-result p0

    return p0
.end method

.method public static ۥ۟۟(Landroid/view/View;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget-object v0, LYue/ۥۢۤۨ;->ۥ:LYue/ۥۢۤۨۡ;

    invoke-virtual {v0, p0}, LYue/ۥۢۤۨۡ;->ۥ۟۟۟(Landroid/view/View;)V

    return-void
.end method

.method public static ۥ۟۟۟(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Matrix;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    sget-object v0, LYue/ۥۢۤۨ;->ۥ:LYue/ۥۢۤۨۡ;

    invoke-virtual {v0, p0, p1}, LYue/ۥۢۤۨۡ;->ۥ۟۟۟۟(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public static ۥ۟۟۟۟(Landroid/view/View;IIII)V
    .locals 6
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget-object v0, LYue/ۥۢۤۨ;->ۥ:LYue/ۥۢۤۨۡ;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, LYue/ۥۢۤۨۡ;->ۥ۟۟۟۠(Landroid/view/View;IIII)V

    return-void
.end method

.method public static ۥ۟۟۟۠(Landroid/view/View;F)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget-object v0, LYue/ۥۢۤۨ;->ۥ:LYue/ۥۢۤۨۡ;

    invoke-virtual {v0, p0, p1}, LYue/ۥۢۤۨۡ;->ۥ۟۟۟ۡ(Landroid/view/View;F)V

    return-void
.end method

.method public static ۥ۟۟۟ۡ(Landroid/view/View;I)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget-object v0, LYue/ۥۢۤۨ;->ۥ:LYue/ۥۢۤۨۡ;

    invoke-virtual {v0, p0, p1}, LYue/ۥۢۤۨۡ;->ۥ۟۟۟ۢ(Landroid/view/View;I)V

    return-void
.end method

.method public static ۥ۟۟۟ۢ(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Matrix;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget-object v0, LYue/ۥۢۤۨ;->ۥ:LYue/ۥۢۤۨۡ;

    invoke-virtual {v0, p0, p1}, LYue/ۥۢۤۨۡ;->ۥۣ۟۟۟(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public static ۥۣ۟۟۟(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Matrix;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget-object v0, LYue/ۥۢۤۨ;->ۥ:LYue/ۥۢۤۨۡ;

    invoke-virtual {v0, p0, p1}, LYue/ۥۢۤۨۡ;->ۥ۟۟۟ۤ(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

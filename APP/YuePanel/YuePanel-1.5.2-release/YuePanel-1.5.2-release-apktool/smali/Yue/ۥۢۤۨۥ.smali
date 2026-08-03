.class public LYue/ۥۢۤۨۥ;
.super LYue/ۥۢۤۨۡ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۤۨۥ$ۥ;
    }
.end annotation


# static fields
.field public static ۥۣ۟۟۟:Z = true

.field public static ۥ۟۟۟ۤ:Z = true

.field public static ۥ۟۟۟ۥ:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۢۤۨۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۟(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-boolean v0, LYue/ۥۢۤۨۥ;->ۥۣ۟۟۟:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, LYue/ۥۢۤۨۥ$ۥ;->ۥ(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, LYue/ۥۢۤۨۥ;->ۥۣ۟۟۟:Z

    :cond_0
    :goto_0
    return-void
.end method

.method public ۥۣ۟۟۟(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-boolean v0, LYue/ۥۢۤۨۥ;->ۥ۟۟۟ۤ:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, LYue/ۥۢۤۨۥ$ۥ;->ۥ۟(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, LYue/ۥۢۤۨۥ;->ۥ۟۟۟ۤ:Z

    :cond_0
    :goto_0
    return-void
.end method

.method public ۥ۟۟۟ۤ(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-boolean v0, LYue/ۥۢۤۨۥ;->ۥ۟۟۟ۥ:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, LYue/ۥۢۤۨۥ$ۥ;->ۥ۟۟(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, LYue/ۥۢۤۨۥ;->ۥ۟۟۟ۥ:Z

    :cond_0
    :goto_0
    return-void
.end method

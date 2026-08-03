.class public LYue/ۥۢۥ;
.super LYue/ۥۢۤۨۧ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x17
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۥ$ۥ;
    }
.end annotation


# static fields
.field public static ۥ۟۟۟ۧ:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۢۤۨۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۢ(Landroid/view/View;I)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_0

    invoke-super {p0, p1, p2}, LYue/ۥۢۤۨۡ;->ۥ۟۟۟ۢ(Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    sget-boolean v0, LYue/ۥۢۥ;->ۥ۟۟۟ۧ:Z

    if-eqz v0, :cond_1

    :try_start_0
    invoke-static {p1, p2}, LYue/ۥۢۥ$ۥ;->ۥ(Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, LYue/ۥۢۥ;->ۥ۟۟۟ۧ:Z

    :cond_1
    :goto_0
    return-void
.end method

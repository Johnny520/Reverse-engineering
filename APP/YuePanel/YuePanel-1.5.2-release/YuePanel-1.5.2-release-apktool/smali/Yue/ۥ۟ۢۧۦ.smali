.class public LYue/ۥ۟ۢۧۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۢۧۦ$ۥ;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(ILYue/ۥ۟ۢۧۧ;)Landroid/graphics/ColorFilter;
    .locals 3
    .param p1    # LYue/ۥ۟ۢۧۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1

    invoke-static {p1}, LYue/ۥ۟ۢۧۨ$ۥ۟;->ۥ(LYue/ۥ۟ۢۧۧ;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p0, p1}, LYue/ۥ۟ۢۧۦ$ۥ;->ۥ(ILjava/lang/Object;)Landroid/graphics/ColorFilter;

    move-result-object v2

    :cond_0
    return-object v2

    :cond_1
    invoke-static {p1}, LYue/ۥ۟ۢۧۨ;->ۥ(LYue/ۥ۟ۢۧۧ;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v2, p0, p1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    :cond_2
    return-object v2
.end method

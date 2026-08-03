.class public final LYue/ۥۢ۟ۡۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢ۟ۡۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(LYue/ۥۢ۟ۡۥ;)Landroid/util/SizeF;
    .locals 2
    .param p0    # LYue/ۥۢ۟ۡۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {p0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Landroid/util/SizeF;

    invoke-virtual {p0}, LYue/ۥۢ۟ۡۥ;->ۥ۟()F

    move-result v1

    invoke-virtual {p0}, LYue/ۥۢ۟ۡۥ;->ۥ()F

    move-result p0

    invoke-direct {v0, v1, p0}, Landroid/util/SizeF;-><init>(FF)V

    return-object v0
.end method

.method public static ۥ۟(Landroid/util/SizeF;)LYue/ۥۢ۟ۡۥ;
    .locals 2
    .param p0    # Landroid/util/SizeF;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {p0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LYue/ۥۢ۟ۡۥ;

    invoke-virtual {p0}, Landroid/util/SizeF;->getWidth()F

    move-result v1

    invoke-virtual {p0}, Landroid/util/SizeF;->getHeight()F

    move-result p0

    invoke-direct {v0, v1, p0}, LYue/ۥۢ۟ۡۥ;-><init>(FF)V

    return-object v0
.end method

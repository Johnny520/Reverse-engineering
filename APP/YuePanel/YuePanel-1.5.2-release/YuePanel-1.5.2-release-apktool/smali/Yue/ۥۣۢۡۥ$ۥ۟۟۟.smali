.class public LYue/ۥۣۢۡۥ$ۥ۟۟۟;
.super LYue/ۥۣۢۡۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۢۡۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۣۢۡۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۡ(Landroid/view/View;FJLYue/ۥ۠ۦۥۡ;)Z
    .locals 0

    iget-boolean p1, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۢ:Z

    return p1
.end method

.method public ۥ۟۟۟ۥ(Landroid/view/View;LYue/ۥ۠ۦۥۡ;FJDD)Z
    .locals 6

    move-object v0, p0

    move v1, p3

    move-wide v2, p4

    move-object v4, p1

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, LYue/ۥۣۢۡۥ;->ۥ۟(FJLandroid/view/View;LYue/ۥ۠ۦۥۡ;)F

    move-result p2

    invoke-static {p8, p9, p6, p7}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p3

    double-to-float p3, p3

    add-float/2addr p2, p3

    invoke-virtual {p1, p2}, Landroid/view/View;->setRotation(F)V

    iget-boolean p1, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۢ:Z

    return p1
.end method

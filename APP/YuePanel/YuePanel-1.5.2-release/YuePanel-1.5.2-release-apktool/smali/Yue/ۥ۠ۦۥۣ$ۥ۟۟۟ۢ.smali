.class public LYue/ۥ۠ۦۥۣ$ۥ۟۟۟ۢ;
.super LYue/ۥ۠ۦۥۣ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۦۥۣ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e2"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۦۥۣ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۡ(Landroid/view/View;F)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟۟ۥ(Landroid/view/View;FDD)V
    .locals 0

    invoke-virtual {p0, p2}, LYue/ۥ۠ۦۥۣ;->ۥ(F)F

    move-result p2

    invoke-static {p5, p6, p3, p4}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p3

    double-to-float p3, p3

    add-float/2addr p2, p3

    invoke-virtual {p1, p2}, Landroid/view/View;->setRotation(F)V

    return-void
.end method

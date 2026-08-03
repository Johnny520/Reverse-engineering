.class public LYue/ۥۣۢۡۥ$ۥ۟۟;
.super LYue/ۥۣۢۡۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۢۡۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۣۢۡۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۡ(Landroid/view/View;FJLYue/ۥ۠ۦۥۡ;)Z
    .locals 6

    move-object v0, p0

    move v1, p2

    move-wide v2, p3

    move-object v4, p1

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, LYue/ۥۣۢۡۥ;->ۥ۟(FJLandroid/view/View;LYue/ۥ۠ۦۥۡ;)F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setElevation(F)V

    iget-boolean p1, p0, LYue/ۥۣۢۡۥ;->ۥ۟۟۟ۢ:Z

    return p1
.end method

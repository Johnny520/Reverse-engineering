.class public final LYue/ۥۣ۠۠ۤ$ۥ۟۟۟ۨ;
.super LYue/ۥۣ۠۠ۤ$ۥ۟۟۠ۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LYue/ۥۣ۠۠ۤ$ۥ۟۟۠ۢ;-><init>(Ljava/lang/String;LYue/ۥۣ۠۠ۤ$ۥ۟۟۟ۡ;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic getValue(Ljava/lang/Object;)F
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LYue/ۥۣ۠۠ۤ$ۥ۟۟۟ۨ;->ۥ(Landroid/view/View;)F

    move-result p1

    return p1
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;F)V
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۠۠ۤ$ۥ۟۟۟ۨ;->ۥ۟(Landroid/view/View;F)V

    return-void
.end method

.method public ۥ(Landroid/view/View;)F
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->getRotationY()F

    move-result p1

    return p1
.end method

.method public ۥ۟(Landroid/view/View;F)V
    .locals 0

    invoke-virtual {p1, p2}, Landroid/view/View;->setRotationY(F)V

    return-void
.end method

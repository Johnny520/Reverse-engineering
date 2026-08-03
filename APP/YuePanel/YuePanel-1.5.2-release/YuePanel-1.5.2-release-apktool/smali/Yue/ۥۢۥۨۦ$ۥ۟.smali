.class public LYue/ۥۢۥۨۦ$ۥ۟;
.super LYue/ۥۢۥۨۦ$ۥ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x17
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۨۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/Window;LYue/ۥۢ۟ۢۦ;)V
    .locals 0
    .param p1    # Landroid/view/Window;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢ۟ۢۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0, p1, p2}, LYue/ۥۢۥۨۦ$ۥ;-><init>(Landroid/view/Window;LYue/ۥۢ۟ۢۦ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۨۦ$ۥ;->ۥ:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥۣ۟۟۟(Z)V
    .locals 1

    const/16 v0, 0x2000

    if-eqz p1, :cond_0

    const/high16 p1, 0x4000000

    invoke-virtual {p0, p1}, LYue/ۥۢۥۨۦ$ۥ;->ۥ۟۟۠۠(I)V

    const/high16 p1, -0x80000000

    invoke-virtual {p0, p1}, LYue/ۥۢۥۨۦ$ۥ;->ۥ۟۟۟ۨ(I)V

    invoke-virtual {p0, v0}, LYue/ۥۢۥۨۦ$ۥ;->ۥ۟۟۟ۧ(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, LYue/ۥۢۥۨۦ$ۥ;->ۥ۟۟۠۟(I)V

    :goto_0
    return-void
.end method

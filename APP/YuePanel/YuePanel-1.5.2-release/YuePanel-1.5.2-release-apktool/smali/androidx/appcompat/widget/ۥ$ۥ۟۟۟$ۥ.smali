.class public Landroidx/appcompat/widget/ۥ$ۥ۟۟۟$ۥ;
.super LYue/ۥ۠ۢۦۨ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/ۥ$ۥ۟۟۟;-><init>(Landroidx/appcompat/widget/ۥ;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ۟۟ۡۡ:Landroidx/appcompat/widget/ۥ;

.field public final synthetic ۥ۟۟ۡۢ:Landroidx/appcompat/widget/ۥ$ۥ۟۟۟;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ۥ$ۥ۟۟۟;Landroid/view/View;Landroidx/appcompat/widget/ۥ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x0,
            0x1010
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟۟$ۥ;->ۥ۟۟ۡۢ:Landroidx/appcompat/widget/ۥ$ۥ۟۟۟;

    iput-object p3, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟۟$ۥ;->ۥ۟۟ۡۡ:Landroidx/appcompat/widget/ۥ;

    invoke-direct {p0, p2}, LYue/ۥ۠ۢۦۨ;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public ۥ۟()LYue/ۥۢ۟۠ۤ;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟۟$ۥ;->ۥ۟۟ۡۢ:Landroidx/appcompat/widget/ۥ$ۥ۟۟۟;

    iget-object v0, v0, Landroidx/appcompat/widget/ۥ$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/widget/ۥ;

    iget-object v0, v0, Landroidx/appcompat/widget/ۥ;->ۥ۟۟ۢۥ:Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۟;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ۟۟۟۟()LYue/ۥۡ۠ۦۧ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟۟$ۥ;->ۥ۟۟ۡۢ:Landroidx/appcompat/widget/ۥ$ۥ۟۟۟;

    iget-object v0, v0, Landroidx/appcompat/widget/ۥ$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/widget/ۥ;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ۥ;->ۥ۟۟ۡۤ()Z

    const/4 v0, 0x1

    return v0
.end method

.method public ۥ۟۟۟()Z
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟۟$ۥ;->ۥ۟۟ۡۢ:Landroidx/appcompat/widget/ۥ$ۥ۟۟۟;

    iget-object v0, v0, Landroidx/appcompat/widget/ۥ$ۥ۟۟۟;->ۥۣ۟۟۠:Landroidx/appcompat/widget/ۥ;

    iget-object v1, v0, Landroidx/appcompat/widget/ۥ;->ۥ۟۟ۢۧ:Landroidx/appcompat/widget/ۥ$ۥ۟۟;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Landroidx/appcompat/widget/ۥ;->ۥۣ۟۟۠()Z

    const/4 v0, 0x1

    return v0
.end method

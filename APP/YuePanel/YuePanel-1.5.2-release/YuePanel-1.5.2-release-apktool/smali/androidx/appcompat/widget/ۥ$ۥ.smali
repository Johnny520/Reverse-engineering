.class public Landroidx/appcompat/widget/ۥ$ۥ;
.super Landroidx/appcompat/view/menu/ۥۣ۟۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5"
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۟ۨ:Landroidx/appcompat/widget/ۥ;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ۥ;Landroid/content/Context;Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;Landroid/view/View;)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x0,
            0x0,
            0x0
        }
        names = {
            null,
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ$ۥ;->ۥ۟۟۟ۨ:Landroidx/appcompat/widget/ۥ;

    const/4 v4, 0x0

    sget v5, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟ۡۥ:I

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    invoke-direct/range {v0 .. v5}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;-><init>(Landroid/content/Context;Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroid/view/View;ZI)V

    invoke-virtual {p3}, Landroidx/appcompat/view/menu/ۥ۟۟۟ۧ;->getItem()Landroid/view/MenuItem;

    move-result-object p2

    check-cast p2, Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

    invoke-virtual {p2}, Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;->ۥ۟۟۠()Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p1, Landroidx/appcompat/widget/ۥ;->ۥ۟۟ۡۢ:Landroidx/appcompat/widget/ۥ$ۥ۟۟۟;

    if-nez p2, :cond_0

    invoke-static {p1}, Landroidx/appcompat/widget/ۥ;->ۥ۟۟۟ۦ(Landroidx/appcompat/widget/ۥ;)Landroidx/appcompat/view/menu/ۥ۟۟۟ۥ;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    :cond_0
    invoke-virtual {p0, p2}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ۟۟۟ۢ(Landroid/view/View;)V

    :cond_1
    iget-object p1, p1, Landroidx/appcompat/widget/ۥ;->ۥۣ۟۟:Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۠;

    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ(Landroidx/appcompat/view/menu/ۥ۟۟۟ۤ$ۥ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۡ()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ;->ۥ۟۟۟ۨ:Landroidx/appcompat/widget/ۥ;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/ۥ;->ۥ۟۟ۢۦ:Landroidx/appcompat/widget/ۥ$ۥ;

    const/4 v1, 0x0

    iput v1, v0, Landroidx/appcompat/widget/ۥ;->ۥۣ۟۟۟:I

    invoke-super {p0}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ۟۟۟ۡ()V

    return-void
.end method

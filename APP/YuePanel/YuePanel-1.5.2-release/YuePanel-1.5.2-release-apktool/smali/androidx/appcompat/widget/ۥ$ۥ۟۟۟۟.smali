.class public Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۟;
.super Landroidx/appcompat/view/menu/ۥۣ۟۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۟ۨ:Landroidx/appcompat/widget/ۥ;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ۥ;Landroid/content/Context;Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroid/view/View;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            null,
            null,
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۟;->ۥ۟۟۟ۨ:Landroidx/appcompat/widget/ۥ;

    sget v5, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟ۡۥ:I

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move v4, p5

    invoke-direct/range {v0 .. v5}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;-><init>(Landroid/content/Context;Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroid/view/View;ZI)V

    const p2, 0x800005

    invoke-virtual {p0, p2}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ۟۟۟ۤ(I)V

    iget-object p1, p1, Landroidx/appcompat/widget/ۥ;->ۥۣ۟۟:Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۠;

    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ(Landroidx/appcompat/view/menu/ۥ۟۟۟ۤ$ۥ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۡ()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۟;->ۥ۟۟۟ۨ:Landroidx/appcompat/widget/ۥ;

    invoke-static {v0}, Landroidx/appcompat/widget/ۥ;->ۥ۟۟۟ۤ(Landroidx/appcompat/widget/ۥ;)Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۟;->ۥ۟۟۟ۨ:Landroidx/appcompat/widget/ۥ;

    invoke-static {v0}, Landroidx/appcompat/widget/ۥ;->ۥ۟۟۟ۥ(Landroidx/appcompat/widget/ۥ;)Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->close()V

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۟;->ۥ۟۟۟ۨ:Landroidx/appcompat/widget/ۥ;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/ۥ;->ۥ۟۟ۢۥ:Landroidx/appcompat/widget/ۥ$ۥ۟۟۟۟;

    invoke-super {p0}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ۟۟۟ۡ()V

    return-void
.end method

.class public Landroidx/appcompat/widget/ۥ$ۥ۟;
.super Landroidx/appcompat/view/menu/ActionMenuItemView$ۥ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/appcompat/widget/ۥ;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ۥ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ$ۥ۟;->ۥ:Landroidx/appcompat/widget/ۥ;

    invoke-direct {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView$ۥ۟;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ()LYue/ۥۢ۟۠ۤ;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ۥ$ۥ۟;->ۥ:Landroidx/appcompat/widget/ۥ;

    iget-object v0, v0, Landroidx/appcompat/widget/ۥ;->ۥ۟۟ۢۦ:Landroidx/appcompat/widget/ۥ$ۥ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ۟۟۟۟()LYue/ۥۡ۠ۦۧ;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

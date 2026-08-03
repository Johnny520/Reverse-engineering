.class public Landroidx/appcompat/widget/ۥ۟۟۟ۡ$ۥ۟;
.super LYue/ۥۢۤۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ۟۟ۡ۟(IJ)LYue/ۥۢۤۦۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public ۥ:Z

.field public final synthetic ۥ۟:I

.field public final synthetic ۥ۟۟:Landroidx/appcompat/widget/ۥ۟۟۟ۡ;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ۥ۟۟۟ۡ;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ$ۥ۟;->ۥ۟۟:Landroidx/appcompat/widget/ۥ۟۟۟ۡ;

    iput p2, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ$ۥ۟;->ۥ۟:I

    invoke-direct {p0}, LYue/ۥۢۤۧ;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ$ۥ۟;->ۥ:Z

    return-void
.end method


# virtual methods
.method public ۥ(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ$ۥ۟;->ۥ:Z

    return-void
.end method

.method public ۥ۟(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ$ۥ۟;->ۥ:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ$ۥ۟;->ۥ۟۟:Landroidx/appcompat/widget/ۥ۟۟۟ۡ;

    iget-object p1, p1, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    iget v0, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ$ۥ۟;->ۥ۟:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟ۡ$ۥ۟;->ۥ۟۟:Landroidx/appcompat/widget/ۥ۟۟۟ۡ;

    iget-object p1, p1, Landroidx/appcompat/widget/ۥ۟۟۟ۡ;->ۥ:Landroidx/appcompat/widget/Toolbar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

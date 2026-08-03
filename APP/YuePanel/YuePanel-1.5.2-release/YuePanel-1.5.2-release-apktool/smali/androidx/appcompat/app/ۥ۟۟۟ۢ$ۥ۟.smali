.class public Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟;
.super LYue/ۥۢۤۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ۥ۟۟۟ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/ۥ۟۟۟ۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    invoke-direct {p0}, LYue/ۥۢۤۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۦ:LYue/ۥۢۤۦۧ;

    iget-object p1, p1, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method

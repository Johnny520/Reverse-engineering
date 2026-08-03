.class public LYue/ۥۣ۟ۡۤ$ۥ;
.super LYue/ۥ۠ۢۦۨ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۡۤ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILandroid/content/res/Resources$Theme;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ۟۟ۡۡ:LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;

.field public final synthetic ۥ۟۟ۡۢ:LYue/ۥۣ۟ۡۤ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۡۤ;Landroid/view/View;LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;)V
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

    iput-object p1, p0, LYue/ۥۣ۟ۡۤ$ۥ;->ۥ۟۟ۡۢ:LYue/ۥۣ۟ۡۤ;

    iput-object p3, p0, LYue/ۥۣ۟ۡۤ$ۥ;->ۥ۟۟ۡۡ:LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;

    invoke-direct {p0, p2}, LYue/ۥ۠ۢۦۨ;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public ۥ۟()LYue/ۥۢ۟۠ۤ;
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۡۤ$ۥ;->ۥ۟۟ۡۡ:LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;

    return-object v0
.end method

.method public ۥ۟۟()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۡۤ$ۥ;->ۥ۟۟ۡۢ:LYue/ۥۣ۟ۡۤ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۤ;->getInternalPopup()LYue/ۥۣ۟ۡۤ$ۥ۟۟۟ۢ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟ۢ;->ۥ()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۣ۟ۡۤ$ۥ;->ۥ۟۟ۡۢ:LYue/ۥۣ۟ۡۤ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۤ;->ۥ۟()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

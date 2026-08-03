.class public Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ;


# direct methods
.method public constructor <init>(Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ$ۥ;->ۥۣ۟۟۠:Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ$ۥ;->ۥۣ۟۟۠:Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ;->ۥ()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ$ۥ;->ۥۣ۟۟۠:Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ;->ۥ۟۟ۡ۠:LYue/ۥۡ۠ۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۧۢۤ;->ۥ۟۟ۡۨ()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ$ۥ;->ۥۣ۟۟۠:Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ;->ۥ۟۟ۡۥ:Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ$ۥ;->ۥۣ۟۟۠:Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ;->ۥ۟۟ۡ۠:LYue/ۥۡ۠ۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۧۢۤ;->show()V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ$ۥ;->ۥۣ۟۟۠:Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟ۦ;->dismiss()V

    :cond_2
    :goto_1
    return-void
.end method

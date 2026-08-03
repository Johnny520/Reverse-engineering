.class public LYue/ۥۡ۠ۦۥ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnActionExpandListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡ۠ۦۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Landroid/view/MenuItem$OnActionExpandListener;

.field public final synthetic ۥ۟:LYue/ۥۡ۠ۦۥ;


# direct methods
.method public constructor <init>(LYue/ۥۡ۠ۦۥ;Landroid/view/MenuItem$OnActionExpandListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x0
        }
        names = {
            null,
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡ۠ۦۥ$ۥ۟۟;->ۥ۟:LYue/ۥۡ۠ۦۥ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LYue/ۥۡ۠ۦۥ$ۥ۟۟;->ۥ:Landroid/view/MenuItem$OnActionExpandListener;

    return-void
.end method


# virtual methods
.method public onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
    .locals 2

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ$ۥ۟۟;->ۥ:Landroid/view/MenuItem$OnActionExpandListener;

    iget-object v1, p0, LYue/ۥۡ۠ۦۥ$ۥ۟۟;->ۥ۟:LYue/ۥۡ۠ۦۥ;

    invoke-virtual {v1, p1}, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟۟(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionCollapse(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onMenuItemActionExpand(Landroid/view/MenuItem;)Z
    .locals 2

    iget-object v0, p0, LYue/ۥۡ۠ۦۥ$ۥ۟۟;->ۥ:Landroid/view/MenuItem$OnActionExpandListener;

    iget-object v1, p0, LYue/ۥۡ۠ۦۥ$ۥ۟۟;->ۥ۟:LYue/ۥۡ۠ۦۥ;

    invoke-virtual {v1, p1}, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟۟(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

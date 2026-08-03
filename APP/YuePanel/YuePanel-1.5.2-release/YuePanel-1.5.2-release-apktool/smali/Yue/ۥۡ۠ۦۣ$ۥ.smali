.class public LYue/ۥۡ۠ۦۣ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnActionExpandListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡ۠ۦۣ;->ۥۣ۟۟۠(Landroid/view/MenuItem;LYue/ۥۡ۠ۦۣ$ۥ۟۟;)Landroid/view/MenuItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۡ۠ۦۣ$ۥ۟۟;


# direct methods
.method public constructor <init>(LYue/ۥۡ۠ۦۣ$ۥ۟۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡ۠ۦۣ$ۥ;->ۥ:LYue/ۥۡ۠ۦۣ$ۥ۟۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۣ$ۥ;->ۥ:LYue/ۥۡ۠ۦۣ$ۥ۟۟;

    invoke-interface {v0, p1}, LYue/ۥۡ۠ۦۣ$ۥ۟۟;->onMenuItemActionCollapse(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onMenuItemActionExpand(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۠ۦۣ$ۥ;->ۥ:LYue/ۥۡ۠ۦۣ$ۥ۟۟;

    invoke-interface {v0, p1}, LYue/ۥۡ۠ۦۣ$ۥ۟۟;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

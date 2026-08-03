.class public final LYue/ۥ۠۠ۦۦ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/method/KeyListener;


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x13
.end annotation

.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠۠ۦۦ$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ:Landroid/text/method/KeyListener;

.field public final ۥ۟:LYue/ۥ۠۠ۦۦ$ۥ;


# direct methods
.method public constructor <init>(Landroid/text/method/KeyListener;)V
    .locals 1

    .line 1
    new-instance v0, LYue/ۥ۠۠ۦۦ$ۥ;

    invoke-direct {v0}, LYue/ۥ۠۠ۦۦ$ۥ;-><init>()V

    invoke-direct {p0, p1, v0}, LYue/ۥ۠۠ۦۦ;-><init>(Landroid/text/method/KeyListener;LYue/ۥ۠۠ۦۦ$ۥ;)V

    return-void
.end method

.method public constructor <init>(Landroid/text/method/KeyListener;LYue/ۥ۠۠ۦۦ$ۥ;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LYue/ۥ۠۠ۦۦ;->ۥ:Landroid/text/method/KeyListener;

    .line 4
    iput-object p2, p0, LYue/ۥ۠۠ۦۦ;->ۥ۟:LYue/ۥ۠۠ۦۦ$ۥ;

    return-void
.end method


# virtual methods
.method public clearMetaKeyState(Landroid/view/View;Landroid/text/Editable;I)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۦۦ;->ۥ:Landroid/text/method/KeyListener;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/method/KeyListener;->clearMetaKeyState(Landroid/view/View;Landroid/text/Editable;I)V

    return-void
.end method

.method public getInputType()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۦۦ;->ۥ:Landroid/text/method/KeyListener;

    invoke-interface {v0}, Landroid/text/method/KeyListener;->getInputType()I

    move-result v0

    return v0
.end method

.method public onKeyDown(Landroid/view/View;Landroid/text/Editable;ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۦۦ;->ۥ۟:LYue/ۥ۠۠ۦۦ$ۥ;

    invoke-virtual {v0, p2, p3, p4}, LYue/ۥ۠۠ۦۦ$ۥ;->ۥ(Landroid/text/Editable;ILandroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥ۠۠ۦۦ;->ۥ:Landroid/text/method/KeyListener;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/text/method/KeyListener;->onKeyDown(Landroid/view/View;Landroid/text/Editable;ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public onKeyOther(Landroid/view/View;Landroid/text/Editable;Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۦۦ;->ۥ:Landroid/text/method/KeyListener;

    invoke-interface {v0, p1, p2, p3}, Landroid/text/method/KeyListener;->onKeyOther(Landroid/view/View;Landroid/text/Editable;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public onKeyUp(Landroid/view/View;Landroid/text/Editable;ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠۠ۦۦ;->ۥ:Landroid/text/method/KeyListener;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/text/method/KeyListener;->onKeyUp(Landroid/view/View;Landroid/text/Editable;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

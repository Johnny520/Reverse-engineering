.class public LYue/ۥ۠ۡۥۥ$ۥ۟۟;
.super LYue/ۥ۟۟ۦۡ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡۥۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public final synthetic ۥ۟۟:LYue/ۥ۠ۡۥۥ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۡۥۥ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۡۥۥ$ۥ۟۟;->ۥ۟۟:LYue/ۥ۠ۡۥۥ;

    invoke-direct {p0}, LYue/ۥ۟۟ۦۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟(I)LYue/ۥ۟۟ۥۧ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡۥۥ$ۥ۟۟;->ۥ۟۟:LYue/ۥ۠ۡۥۥ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۡۥۥ;->obtainAccessibilityNodeInfo(I)LYue/ۥ۟۟ۥۧ;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۟ۧ۟(LYue/ۥ۟۟ۥۧ;)LYue/ۥ۟۟ۥۧ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟(I)LYue/ۥ۟۟ۥۧ;
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۡۥۥ$ۥ۟۟;->ۥ۟۟:LYue/ۥ۠ۡۥۥ;

    iget p1, p1, LYue/ۥ۠ۡۥۥ;->mAccessibilityFocusedVirtualViewId:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, LYue/ۥ۠ۡۥۥ$ۥ۟۟;->ۥ۟۟:LYue/ۥ۠ۡۥۥ;

    iget p1, p1, LYue/ۥ۠ۡۥۥ;->mKeyboardFocusedVirtualViewId:I

    :goto_0
    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۥۥ$ۥ۟۟;->ۥ۟(I)LYue/ۥ۟۟ۥۧ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟۠(IILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡۥۥ$ۥ۟۟;->ۥ۟۟:LYue/ۥ۠ۡۥۥ;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥ۠ۡۥۥ;->performAction(IILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.class public LYue/ۥۢۥۣۢ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x17
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۣۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/view/Window$Callback;Landroid/view/SearchEvent;)Z
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->onSearchRequested(Landroid/view/SearchEvent;)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟(Landroid/view/Window$Callback;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-interface {p0, p1, p2}, Landroid/view/Window$Callback;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p0

    return-object p0
.end method

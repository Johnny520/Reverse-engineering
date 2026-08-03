.class public LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟۟ۦۤ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;


# direct methods
.method public constructor <init>(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public perform(Landroid/view/View;LYue/ۥ۟۟ۦۤ$ۥ;)Z
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟۟ۦۤ$ۥ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    check-cast p1, LYue/ۥۢۤۦۢ;

    iget-object p2, p0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ۟;->ۥ:LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;

    invoke-virtual {p1}, LYue/ۥۢۤۦۢ;->getCurrentItem()I

    move-result p1

    const/4 v0, 0x1

    sub-int/2addr p1, v0

    invoke-virtual {p2, p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;->ۥ۟۟۠ۥ(I)V

    return v0
.end method

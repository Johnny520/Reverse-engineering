.class public LYue/ۥۣۢۢۨ$ۥ;
.super LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۢۢۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public ۥ۟۟۟ۤ:LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;)V
    .locals 0
    .param p1    # LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥ۠ۢۦۢ$ۥ۟۟۟;-><init>()V

    iput-object p1, p0, LYue/ۥۣۢۢۨ$ۥ;->ۥ۟۟۟ۤ:LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;

    return-void
.end method


# virtual methods
.method public ۥ(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢۢۨ$ۥ;->ۥ۟۟۟ۤ:LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;->onFontRetrievalFailed(I)V

    :cond_0
    return-void
.end method

.method public ۥ۟(Landroid/graphics/Typeface;)V
    .locals 1
    .param p1    # Landroid/graphics/Typeface;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۣۢۢۨ$ۥ;->ۥ۟۟۟ۤ:LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;->onFontRetrieved(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method

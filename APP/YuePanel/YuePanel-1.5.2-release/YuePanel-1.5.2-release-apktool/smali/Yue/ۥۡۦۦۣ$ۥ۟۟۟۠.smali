.class public abstract LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۦۣ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u06e5\u06df\u06df\u06df\u06e0"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getHandler(Landroid/os/Handler;)Landroid/os/Handler;
    .locals 1
    .param p0    # Landroid/os/Handler;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    if-nez p0, :cond_0

    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    :cond_0
    return-object p0
.end method

.method public static synthetic ۥ(LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;->ۥ۟۟۟(Landroid/graphics/Typeface;)V

    return-void
.end method

.method public static synthetic ۥ۟(LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;I)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;->ۥ۟۟(I)V

    return-void
.end method


# virtual methods
.method public final callbackFailAsync(ILandroid/os/Handler;)V
    .locals 1
    .param p2    # Landroid/os/Handler;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-static {p2}, LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;->getHandler(Landroid/os/Handler;)Landroid/os/Handler;

    move-result-object p2

    new-instance v0, LYue/ۥۡۦۦۥ;

    invoke-direct {v0, p0, p1}, LYue/ۥۡۦۦۥ;-><init>(LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;I)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final callbackSuccessAsync(Landroid/graphics/Typeface;Landroid/os/Handler;)V
    .locals 1
    .param p1    # Landroid/graphics/Typeface;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/os/Handler;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-static {p2}, LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;->getHandler(Landroid/os/Handler;)Landroid/os/Handler;

    move-result-object p2

    new-instance v0, LYue/ۥۡۦۦۤ;

    invoke-direct {v0, p0, p1}, LYue/ۥۡۦۦۤ;-><init>(LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;Landroid/graphics/Typeface;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public abstract onFontRetrievalFailed(I)V
.end method

.method public abstract onFontRetrieved(Landroid/graphics/Typeface;)V
    .param p1    # Landroid/graphics/Typeface;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
.end method

.method public final synthetic ۥ۟۟(I)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;->onFontRetrievalFailed(I)V

    return-void
.end method

.method public final synthetic ۥ۟۟۟(Landroid/graphics/Typeface;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۡۦۦۣ$ۥ۟۟۟۠;->onFontRetrieved(Landroid/graphics/Typeface;)V

    return-void
.end method

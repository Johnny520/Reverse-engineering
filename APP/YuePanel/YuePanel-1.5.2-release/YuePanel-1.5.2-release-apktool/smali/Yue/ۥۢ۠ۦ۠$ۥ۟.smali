.class public LYue/ۥۢ۠ۦ۠$ۥ۟;
.super Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢ۠ۦ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/ref/Reference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/Reference<",
            "LYue/\u06e5\u06e2\u06e0\u06e6\u06e0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۢ۠ۦ۠;)V
    .locals 1

    invoke-direct {p0}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LYue/ۥۢ۠ۦ۠$ۥ۟;->ۥ:Ljava/lang/ref/Reference;

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥۢ۠ۦ۠$ۥ۟;->ۥ:Ljava/lang/ref/Reference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۢ۠ۦ۠;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥۢ۠ۦ۠;->onEmojiCompatInitializedForSwitchText()V

    :cond_0
    return-void
.end method

.method public ۥ۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۦ۠$ۥ۟;->ۥ:Ljava/lang/ref/Reference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢ۠ۦ۠;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥۢ۠ۦ۠;->onEmojiCompatInitializedForSwitchText()V

    :cond_0
    return-void
.end method

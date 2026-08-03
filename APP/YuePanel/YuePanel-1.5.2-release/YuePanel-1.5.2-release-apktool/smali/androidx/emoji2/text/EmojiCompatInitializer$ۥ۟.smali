.class public Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x13
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/EmojiCompatInitializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟;->ۥ:Landroid/content/Context;

    return-void
.end method

.method public static synthetic ۥ۟(Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟;Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟;->ۥ۟۟۟(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;Ljava/util/concurrent/ThreadPoolExecutor;)V

    return-void
.end method


# virtual methods
.method public ۥ(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;)V
    .locals 2
    .param p1    # Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const-string v0, "EmojiCompatInitializer"

    invoke-static {v0}, LYue/ۥ۟ۦۥۥ;->ۥ۟۟(Ljava/lang/String;)Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    new-instance v1, LYue/ۥ۠۠ۦ;

    invoke-direct {v1, p0, p1, v0}, LYue/ۥ۠۠ۦ;-><init>(Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟;Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;Ljava/util/concurrent/ThreadPoolExecutor;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public ۥ۟۟(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 2
    .param p1    # Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/ThreadPoolExecutor;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۢۦ۟ۨ;
    .end annotation

    :try_start_0
    iget-object v0, p0, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟;->ۥ:Landroid/content/Context;

    invoke-static {v0}, Landroidx/emoji2/text/ۥ;->ۥ(Landroid/content/Context;)Landroidx/emoji2/text/ۥ۟۟۟۟;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Landroidx/emoji2/text/ۥ۟۟۟۟;->ۥ۟۟۟ۧ(Ljava/util/concurrent/Executor;)Landroidx/emoji2/text/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ()Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;

    move-result-object v0

    new-instance v1, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟$ۥ;

    invoke-direct {v1, p0, p1, p2}, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟$ۥ;-><init>(Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟;Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;Ljava/util/concurrent/ThreadPoolExecutor;)V

    invoke-interface {v0, v1}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;->ۥ(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "EmojiCompat font provider not available on this device."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {p1, v0}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;->ۥ(Ljava/lang/Throwable;)V

    invoke-virtual {p2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    :goto_1
    return-void
.end method

.method public final synthetic ۥ۟۟۟(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟;->ۥ۟۟(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;Ljava/util/concurrent/ThreadPoolExecutor;)V

    return-void
.end method

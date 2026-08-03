.class public Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟$ۥ;
.super Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟;->ۥ۟۟(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;Ljava/util/concurrent/ThreadPoolExecutor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;

.field public final synthetic ۥ۟:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final synthetic ۥ۟۟:Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟;Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 0

    iput-object p1, p0, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟$ۥ;->ۥ۟۟:Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟;

    iput-object p2, p0, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟$ۥ;->ۥ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;

    iput-object p3, p0, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟$ۥ;->ۥ۟:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-direct {p0}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    :try_start_0
    iget-object v0, p0, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟$ۥ;->ۥ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;

    invoke-virtual {v0, p1}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;->ۥ(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟$ۥ;->ۥ۟:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {p1}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟$ۥ;->ۥ۟:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    throw p1
.end method

.method public ۥ۟(Landroidx/emoji2/text/ۥ۟۟۟۠;)V
    .locals 1
    .param p1    # Landroidx/emoji2/text/ۥ۟۟۟۠;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    :try_start_0
    iget-object v0, p0, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟$ۥ;->ۥ:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;

    invoke-virtual {v0, p1}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۥ;->ۥ۟(Landroidx/emoji2/text/ۥ۟۟۟۠;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟$ۥ;->ۥ۟:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {p1}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟$ۥ;->ۥ۟:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    throw p1
.end method

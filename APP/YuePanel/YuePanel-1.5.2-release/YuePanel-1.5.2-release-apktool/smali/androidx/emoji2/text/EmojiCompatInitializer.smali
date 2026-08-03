.class public Landroidx/emoji2/text/EmojiCompatInitializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۥۢ۠;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/emoji2/text/EmojiCompatInitializer$ۥ;,
        Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟۟;,
        Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e5\u06e2\u06e0<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ:J = 0x1f4L

.field public static final ۥ۟:Ljava/lang/String; = "EmojiCompatInitializer"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic create(Landroid/content/Context;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/emoji2/text/EmojiCompatInitializer;->ۥ(Landroid/content/Context;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public dependencies()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "LYue/\u06e5\u06e0\u06e5\u06e2\u06e0<",
            "*>;>;>;"
        }
    .end annotation

    const-class v0, Landroidx/lifecycle/ProcessLifecycleInitializer;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(Landroid/content/Context;)Ljava/lang/Boolean;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ;

    invoke-direct {v0, p1}, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Landroidx/emoji2/text/ۥ۟۟;->ۥ۟۟۠۟(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;)Landroidx/emoji2/text/ۥ۟۟;

    invoke-virtual {p0, p1}, Landroidx/emoji2/text/EmojiCompatInitializer;->ۥ۟(Landroid/content/Context;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public ۥ۟(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x13
    .end annotation

    invoke-static {p1}, LYue/ۥ۟ۡۥۢ;->ۥ۟۟۟۟(Landroid/content/Context;)LYue/ۥ۟ۡۥۢ;

    move-result-object p1

    const-class v0, Landroidx/lifecycle/ProcessLifecycleInitializer;

    invoke-virtual {p1, v0}, LYue/ۥ۟ۡۥۢ;->ۥ۟۟۟۠(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/LifecycleOwner;

    invoke-interface {p1}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object p1

    new-instance v0, Landroidx/emoji2/text/EmojiCompatInitializer$1;

    invoke-direct {v0, p0, p1}, Landroidx/emoji2/text/EmojiCompatInitializer$1;-><init>(Landroidx/emoji2/text/EmojiCompatInitializer;Landroidx/lifecycle/Lifecycle;)V

    invoke-virtual {p1, v0}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    return-void
.end method

.method public ۥ۟۟()V
    .locals 4
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x13
    .end annotation

    invoke-static {}, LYue/ۥ۟ۦۥۥ;->ۥ۟۟۟۟()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟۟;

    invoke-direct {v1}, Landroidx/emoji2/text/EmojiCompatInitializer$ۥ۟۟;-><init>()V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

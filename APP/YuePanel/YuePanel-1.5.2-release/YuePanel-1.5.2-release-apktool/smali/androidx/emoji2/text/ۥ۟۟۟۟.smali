.class public Landroidx/emoji2/text/ۥ۟۟۟۟;
.super Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟۟;,
        Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟;,
        Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟۟۟;,
        Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۥ:Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟;

    invoke-direct {v0}, Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟;-><init>()V

    sput-object v0, Landroidx/emoji2/text/ۥ۟۟۟۟;->ۥ۟۟۟ۥ:Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LYue/ۥ۠ۢۥۧ;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۢۥۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    new-instance v0, Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟۟;

    sget-object v1, Landroidx/emoji2/text/ۥ۟۟۟۟;->ۥ۟۟۟ۥ:Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟;

    invoke-direct {v0, p1, p2, v1}, Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟۟;-><init>(Landroid/content/Context;LYue/ۥ۠ۢۥۧ;Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟;)V

    invoke-direct {p0, v0}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;-><init>(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LYue/ۥ۠ۢۥۧ;Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۢۥۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .line 2
    new-instance v0, Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟۟;

    invoke-direct {v0, p1, p2, p3}, Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟۟;-><init>(Landroid/content/Context;LYue/ۥ۠ۢۥۧ;Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟;)V

    invoke-direct {p0, v0}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;-><init>(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۦ(Landroid/os/Handler;)Landroidx/emoji2/text/ۥ۟۟۟۟;
    .locals 0
    .param p1    # Landroid/os/Handler;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, LYue/ۥ۟ۦۥۥ;->ۥ۟(Landroid/os/Handler;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/emoji2/text/ۥ۟۟۟۟;->ۥ۟۟۟ۧ(Ljava/util/concurrent/Executor;)Landroidx/emoji2/text/ۥ۟۟۟۟;

    return-object p0
.end method

.method public ۥ۟۟۟ۧ(Ljava/util/concurrent/Executor;)Landroidx/emoji2/text/ۥ۟۟۟۟;
    .locals 1
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ()Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;

    move-result-object v0

    check-cast v0, Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟۟;

    invoke-virtual {v0, p1}, Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟۟;->ۥ۟۟۟ۡ(Ljava/util/concurrent/Executor;)V

    return-object p0
.end method

.method public ۥ۟۟۟ۨ(Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟۟۟;)Landroidx/emoji2/text/ۥ۟۟۟۟;
    .locals 1
    .param p1    # Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;->ۥ()Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۤ;

    move-result-object v0

    check-cast v0, Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟۟;

    invoke-virtual {v0, p1}, Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟۟;->ۥ۟۟۟ۢ(Landroidx/emoji2/text/ۥ۟۟۟۟$ۥ۟۟۟;)V

    return-object p0
.end method

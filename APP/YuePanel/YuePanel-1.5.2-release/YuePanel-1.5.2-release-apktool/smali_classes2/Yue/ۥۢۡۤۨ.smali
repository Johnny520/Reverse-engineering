.class public final LYue/ۥۢۡۤۨ;
.super Ljava/util/concurrent/CancellationException;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۧۦۤ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/CancellationException;",
        "LYue/\u06e5\u06df\u06e7\u06e6\u06e4<",
        "LYue/\u06e5\u06e2\u06e1\u06e4\u06e8;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nkotlinx/coroutines/TimeoutCancellationException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"
.end annotation


# instance fields
.field public final transient ۥۣ۟۟۠:LYue/ۥ۠ۦ۟ۡ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0}, LYue/ۥۢۡۤۨ;-><init>(Ljava/lang/String;LYue/ۥ۠ۦ۟ۡ;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LYue/ۥ۠ۦ۟ۡ;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p2, p0, LYue/ۥۢۡۤۨ;->ۥۣ۟۟۠:LYue/ۥ۠ۦ۟ۡ;

    return-void
.end method


# virtual methods
.method public bridge synthetic ۥ()Ljava/lang/Throwable;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۡۤۨ;->ۥ۟()LYue/ۥۢۡۤۨ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟()LYue/ۥۢۡۤۨ;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۢۡۤۨ;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    iget-object v2, p0, LYue/ۥۢۡۤۨ;->ۥۣ۟۟۠:LYue/ۥ۠ۦ۟ۡ;

    invoke-direct {v0, v1, v2}, LYue/ۥۢۡۤۨ;-><init>(Ljava/lang/String;LYue/ۥ۠ۦ۟ۡ;)V

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-object v0
.end method

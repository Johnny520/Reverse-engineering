.class public final LYue/ۥ۟۟۠ۡ;
.super Ljava/util/concurrent/CancellationException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFlowExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExceptions.kt\nkotlinx/coroutines/flow/internal/AbortFlowException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,30:1\n26#2:31\n*S KotlinDebug\n*F\n+ 1 FlowExceptions.kt\nkotlinx/coroutines/flow/internal/AbortFlowException\n*L\n17#1:31\n*E\n"
.end annotation


# instance fields
.field public final transient ۥۣ۟۟۠:LYue/ۥۣۣ۠ۢ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣۣ۠ۢ;)V
    .locals 1
    .param p1    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "Flow was aborted, no more elements needed"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۟۟۠ۡ;->ۥۣ۟۟۠:LYue/ۥۣۣ۠ۢ;

    return-void
.end method


# virtual methods
.method public fillInStackTrace()Ljava/lang/Throwable;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/StackTraceElement;

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-object p0
.end method

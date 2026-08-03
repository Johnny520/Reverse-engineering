.class public final LYue/ۥۢۡۡۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/ThreadLocalEventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,550:1\n1#2:551\n*E\n"
.end annotation


# static fields
.field public static final ۥ:LYue/ۥۢۡۡۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:Ljava/lang/ThreadLocal;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "LYue/\u06e5\u06e0\u06e1\u06e1\u06e0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۢۡۡۨ;

    invoke-direct {v0}, LYue/ۥۢۡۡۨ;-><init>()V

    sput-object v0, LYue/ۥۢۡۡۨ;->ۥ:LYue/ۥۢۡۡۨ;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, LYue/ۥۢۡۡۨ;->ۥ۟:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()LYue/ۥ۠ۡۡ۠;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    sget-object v0, LYue/ۥۢۡۡۨ;->ۥ۟:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۡۡ۠;

    return-object v0
.end method

.method public final ۥ۟()LYue/ۥ۠ۡۡ۠;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۢۡۡۨ;->ۥ۟:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۠ۡۡ۠;

    if-nez v1, :cond_0

    invoke-static {}, LYue/ۥۣ۠ۡۡ;->ۥ()LYue/ۥ۠ۡۡ۠;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public final ۥ۟۟()V
    .locals 2

    sget-object v0, LYue/ۥۢۡۡۨ;->ۥ۟:Ljava/lang/ThreadLocal;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۥ۟۟۟(LYue/ۥ۠ۡۡ۠;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۡۡ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    sget-object v0, LYue/ۥۢۡۡۨ;->ۥ۟:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method

.class public final LYue/ۥ۠ۢۥ۠$ۥ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣ۠ۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۥ۠$ۥ۟;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt$launchSharingDeferred$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,426:1\n1#2:427\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e6\u06e2\u06e5$\u06e5\u06df\u06df\u06df\u06e2<",
            "LYue/\u06e5\u06e1\u06e1\u06e7\u06e6<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۟ۧۧۥ;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥ۟ۦۢۧ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e6\u06e2\u06e7<",
            "LYue/\u06e5\u06e2\u06e0\u06df\u06e1<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۦۢۧ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e6\u06e2\u06e5$\u06e5\u06df\u06df\u06df\u06e2<",
            "LYue/\u06e5\u06e1\u06e1\u06e7\u06e6<",
            "TT;>;>;",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            "LYue/\u06e5\u06df\u06e6\u06e2\u06e7<",
            "LYue/\u06e5\u06e2\u06e0\u06df\u06e1<",
            "TT;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۢۥ۠$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    iput-object p2, p0, LYue/ۥ۠ۢۥ۠$ۥ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۧۥ;

    iput-object p3, p0, LYue/ۥ۠ۢۥ۠$ۥ۟$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۦۢۧ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 3
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, LYue/ۥ۠ۢۥ۠$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    iget-object p2, p2, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p2, LYue/ۥۡۡۧۦ;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, LYue/ۥۡۡۧۦ;->setValue(Ljava/lang/Object;)V

    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    iget-object p2, p0, LYue/ۥ۠ۢۥ۠$ۥ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۧۥ;

    iget-object v0, p0, LYue/ۥ۠ۢۥ۠$ۥ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    iget-object v1, p0, LYue/ۥ۠ۢۥ۠$ۥ۟$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۦۢۧ;

    invoke-static {p1}, LYue/ۥۣۢ۠۟;->ۥ(Ljava/lang/Object;)LYue/ۥۡۡۧۦ;

    move-result-object p1

    new-instance v2, LYue/ۥۡۦ۠۠;

    invoke-interface {p2}, LYue/ۥ۟ۧۧۥ;->getCoroutineContext()LYue/ۥ۟ۧۦۥ;

    move-result-object p2

    invoke-static {p2}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟ۡ۠(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۠ۦ۟ۡ;

    move-result-object p2

    invoke-direct {v2, p1, p2}, LYue/ۥۡۦ۠۠;-><init>(LYue/ۥۢ۠۟ۡ;LYue/ۥ۠ۦ۟ۡ;)V

    invoke-interface {v1, v2}, LYue/ۥ۟ۦۢۧ;->ۥ۟۟ۥۡ(Ljava/lang/Object;)Z

    iput-object p1, v0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    :cond_1
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

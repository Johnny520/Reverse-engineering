.class public final LYue/ۥ۠ۥۧ$ۥ;
.super LYue/ۥۢ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2"
    f = "Interruptible.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۥۧ;->ۥ۟(LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠۠ۨ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e2\u06e0\u06e6;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
        "-TT;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:I

.field public synthetic ۥ۟۟۠ۤ:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۣ۠۠ۨ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۠۠ۨ;LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e0\u06e5\u06e7$\u06e5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۥۧ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣ۠۠ۨ;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, LYue/ۥۢ۠ۦ;-><init>(ILYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "*>;)",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۥۧ$ۥ;

    iget-object v1, p0, LYue/ۥ۠ۥۧ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣ۠۠ۨ;

    invoke-direct {v0, v1, p2}, LYue/ۥ۠ۥۧ$ۥ;-><init>(LYue/ۥۣ۠۠ۨ;LYue/ۥ۟ۧۤۢ;)V

    iput-object p1, v0, LYue/ۥ۠ۥۧ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p1    # LYue/ۥ۟ۧۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۥۧ$ۥ;->create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    check-cast p1, LYue/ۥ۠ۥۧ$ۥ;

    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {p1, p2}, LYue/ۥ۠ۥۧ$ۥ;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LYue/ۥ۟ۧۧۥ;

    check-cast p2, LYue/ۥ۟ۧۤۢ;

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۥۧ$ۥ;->invoke(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    iget v0, p0, LYue/ۥ۠ۥۧ$ۥ;->ۥۣ۟۟۠:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥ۠ۥۧ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥ۟ۧۧۥ;

    invoke-interface {p1}, LYue/ۥ۟ۧۧۥ;->getCoroutineContext()LYue/ۥ۟ۧۦۥ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۠ۥۧ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣ۠۠ۨ;

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ;->ۥ(LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠۠ۨ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

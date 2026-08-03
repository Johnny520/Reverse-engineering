.class public final LYue/ۥۡۦۧۨ;
.super LYue/ۥ۠ۦ۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e0\u06e6\u06e0;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/ResumeAwaitOnCompletion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1479:1\n1#2:1480\n*E\n"
.end annotation


# instance fields
.field public final ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e3\u06e8\u06e0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۨ۠;)V
    .locals 0
    .param p1    # LYue/ۥۣ۟ۨ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06e0<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LYue/ۥ۠ۦ۠;-><init>()V

    iput-object p1, p0, LYue/ۥۡۦۧۨ;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۠;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LYue/ۥۡۦۧۨ;->ۥ۟۟ۦۤ(Ljava/lang/Throwable;)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public ۥ۟۟ۦۤ(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠;->ۥ۟۟ۦۥ()LYue/ۥ۠ۦ۠۟;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۦۣ()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LYue/ۥ۟ۦۣۢ;

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۦۧۨ;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۠;

    sget-object v1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    check-cast p1, LYue/ۥ۟ۦۣۢ;

    iget-object p1, p1, LYue/ۥ۟ۦۣۢ;->ۥ:Ljava/lang/Throwable;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۡۦۧۨ;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۠;

    sget-object v1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {p1}, LYue/ۥ۠ۦ۠۠;->ۥ۟۟۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

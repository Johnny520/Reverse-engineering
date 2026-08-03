.class public final LYue/ۥۣۡۨۨ;
.super LYue/ۥ۟۟ۢۦ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e2\u06e6<",
        "LYue/\u06e5\u06e1\u06e8\u06e8\u06e1<",
        "*>;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,733:1\n1#2:734\n*E\n"
.end annotation


# instance fields
.field public ۥ:J
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public ۥ۟:LYue/ۥ۟ۧۤۢ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LYue/ۥ۟۟ۢۦ;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LYue/ۥۣۡۨۨ;->ۥ:J

    return-void
.end method


# virtual methods
.method public bridge synthetic ۥ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LYue/ۥۡۨۨۡ;

    invoke-virtual {p0, p1}, LYue/ۥۣۡۨۨ;->ۥ۟۟(LYue/ۥۡۨۨۡ;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic ۥ۟(Ljava/lang/Object;)[LYue/ۥ۟ۧۤۢ;
    .locals 0

    check-cast p1, LYue/ۥۡۨۨۡ;

    invoke-virtual {p0, p1}, LYue/ۥۣۡۨۨ;->ۥ۟۟۟(LYue/ۥۡۨۨۡ;)[LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟(LYue/ۥۡۨۨۡ;)Z
    .locals 4
    .param p1    # LYue/ۥۡۨۨۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8\u06e8\u06e1<",
            "*>;)Z"
        }
    .end annotation

    iget-wide v0, p0, LYue/ۥۣۡۨۨ;->ۥ:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, LYue/ۥۡۨۨۡ;->ۥۣ۟۟ۨ()J

    move-result-wide v0

    iput-wide v0, p0, LYue/ۥۣۡۨۨ;->ۥ:J

    const/4 p1, 0x1

    return p1
.end method

.method public ۥ۟۟۟(LYue/ۥۡۨۨۡ;)[LYue/ۥ۟ۧۤۢ;
    .locals 4
    .param p1    # LYue/ۥۡۨۨۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8\u06e8\u06e1<",
            "*>;)[",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    iget-wide v0, p0, LYue/ۥۣۡۨۨ;->ۥ:J

    const-wide/16 v2, -0x1

    iput-wide v2, p0, LYue/ۥۣۡۨۨ;->ۥ:J

    const/4 v2, 0x0

    iput-object v2, p0, LYue/ۥۣۡۨۨ;->ۥ۟:LYue/ۥ۟ۧۤۢ;

    invoke-virtual {p1, v0, v1}, LYue/ۥۡۨۨۡ;->ۥۣ۟۟ۧ(J)[LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    return-object p1
.end method

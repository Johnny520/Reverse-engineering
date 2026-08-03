.class public final LYue/ۥ۟ۨۤ۟$ۥ۟۟۟ۡ;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۨۤ۟;->ۥ۟۟۟ۥ()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "LYue/\u06e5\u06df\u06e8\u06e4\u06df$\u06e5<",
        "*>;",
        "LYue/\u06e5\u06df\u06e8\u06e4\u06e5;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,603:1\n1#2:604\n256#3:605\n*E\n"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥ۟ۨۤ۟$ۥ;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۨۤ۟$ۥ۟۟۟ۡ;->ۥ۟۟(LYue/ۥ۟ۨۤ۟$ۥ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(LYue/ۥ۟ۨۤ۟$ۥ;)Ljava/lang/Object;
    .locals 2
    .param p1    # LYue/ۥ۟ۨۤ۟$ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e8\u06e4\u06df$\u06e5<",
            "*>;)",
            "LYue/\u06e5\u06df\u06e8\u06e4\u06e5;"
        }
    .end annotation

    sget-object v0, LYue/ۥ۟ۨۤ۟;->ۥ:LYue/ۥ۟ۨۤ۟;

    invoke-static {v0, p1}, LYue/ۥ۟ۨۤ۟;->ۥ۟(LYue/ۥ۟ۨۤ۟;LYue/ۥ۟ۨۤ۟$ۥ;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, LYue/ۥ۟ۨۤ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۨۥ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۨۥ;->ۥ۟۟()LYue/ۥ۟ۧۦۥ;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, LYue/ۥ۟ۨۤۥ;

    iget-object p1, p1, LYue/ۥ۟ۨۤ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۨۥ;

    invoke-direct {v1, p1, v0}, LYue/ۥ۟ۨۤۥ;-><init>(LYue/ۥۣ۟ۨۥ;LYue/ۥ۟ۧۦۥ;)V

    :cond_1
    :goto_0
    return-object v1
.end method

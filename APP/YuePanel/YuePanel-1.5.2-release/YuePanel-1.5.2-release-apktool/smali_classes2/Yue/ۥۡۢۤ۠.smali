.class public final LYue/ۥۡۢۤ۠;
.super LYue/ۥ۟۟۠ۨ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۦ۟ۡ;


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥۡۢۤ۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠ۤ:Ljava/lang/String; = "NonCancellable can be used only as an argument for \'withContext\', direct usages of its API are prohibited"
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۡۢۤ۠;

    invoke-direct {v0}, LYue/ۥۡۢۤ۠;-><init>()V

    sput-object v0, LYue/ۥۡۢۤ۠;->ۥۣ۟۟۠:LYue/ۥۡۢۤ۠;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-direct {p0, v0}, LYue/ۥ۟۟۠ۨ;-><init>(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)V

    return-void
.end method

.method public static synthetic ۥ۟۟ۧ۟()V
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "NonCancellable can be used only as an argument for \'withContext\', direct usages of its API are prohibited"
    .end annotation

    return-void
.end method

.method public static synthetic ۥ۟۟ۧ۠()V
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "NonCancellable can be used only as an argument for \'withContext\', direct usages of its API are prohibited"
    .end annotation

    return-void
.end method

.method public static synthetic ۥ۟۟ۧۡ()V
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "NonCancellable can be used only as an argument for \'withContext\', direct usages of its API are prohibited"
    .end annotation

    return-void
.end method

.method public static synthetic ۥ۟۟ۧۢ()V
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "NonCancellable can be used only as an argument for \'withContext\', direct usages of its API are prohibited"
    .end annotation

    return-void
.end method

.method public static synthetic ۥۣ۟۟ۧ()V
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "NonCancellable can be used only as an argument for \'withContext\', direct usages of its API are prohibited"
    .end annotation

    return-void
.end method


# virtual methods
.method public synthetic cancel()V
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    invoke-static {p0}, LYue/ۥ۠ۦ۟ۡ$ۥ;->ۥ(LYue/ۥ۠ۦ۟ۡ;)V

    return-void
.end method

.method public isCancelled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public start()Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "NonCancellable can be used only as an argument for \'withContext\', direct usages of its API are prohibited"
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "NonCancellable"

    return-object v0
.end method

.method public synthetic ۥ۟۟(Ljava/lang/Throwable;)Z
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public ۥ۟۟۟()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V
    .locals 0
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "NonCancellable can be used only as an argument for \'withContext\', direct usages of its API are prohibited"
    .end annotation

    return-void
.end method

.method public ۥ۟۟۟ۢ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟۟ۨ(LYue/ۥ۠ۦ۟ۡ;)LYue/ۥ۠ۦ۟ۡ;
    .locals 0
    .param p1    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Operator \'+\' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`."
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۠ۦ۟ۡ$ۥ;->ۥۣ۟۟۟(LYue/ۥ۠ۦ۟ۡ;LYue/ۥ۠ۦ۟ۡ;)LYue/ۥ۠ۦ۟ۡ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠ۨ()LYue/ۥۡۨۢ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "LYue/\u06e5\u06e0\u06e6\u06df\u06e1;",
            ">;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۡۨۢۤ;->ۥ۟۟۟ۡ()LYue/ۥۡۨۢ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۡۡ(LYue/ۥۣ۠ۡ۟;)LYue/ۥۣۣ۠۟;
    .locals 0
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "NonCancellable can be used only as an argument for \'withContext\', direct usages of its API are prohibited"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "LYue/\u06e5\u06e0\u06df\u06e3\u06e3;"
        }
    .end annotation

    sget-object p1, LYue/ۥۡۢۤۡ;->ۥۣ۟۟۠:LYue/ۥۡۢۤۡ;

    return-object p1
.end method

.method public ۥ۟۟ۢۥ()Ljava/util/concurrent/CancellationException;
    .locals 2
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "NonCancellable can be used only as an argument for \'withContext\', direct usages of its API are prohibited"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job is always active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟ۤۢ(ZZLYue/ۥۣ۠ۡ۟;)LYue/ۥۣۣ۠۟;
    .locals 0
    .param p3    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "NonCancellable can be used only as an argument for \'withContext\', direct usages of its API are prohibited"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "LYue/\u06e5\u06e0\u06df\u06e3\u06e3;"
        }
    .end annotation

    sget-object p1, LYue/ۥۡۢۤۡ;->ۥۣ۟۟۠:LYue/ۥۡۢۤۡ;

    return-object p1
.end method

.method public ۥ۟۟ۤۨ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "NonCancellable can be used only as an argument for \'withContext\', direct usages of its API are prohibited"
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "This job is always active"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟ۥ۟()LYue/ۥۡۧۨۦ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This job is always active"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟ۥۢ(LYue/ۥ۟ۤۦ۟;)LYue/ۥ۟ۤۥۨ;
    .locals 0
    .param p1    # LYue/ۥ۟ۤۦ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥۣ۟۟۠:LYue/ۥ۠;
        message = "NonCancellable can be used only as an argument for \'withContext\', direct usages of its API are prohibited"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object p1, LYue/ۥۡۢۤۡ;->ۥۣ۟۟۠:LYue/ۥۡۢۤۡ;

    return-object p1
.end method

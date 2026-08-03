.class public interface abstract LYue/ۥ۠ۦ۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۧۦۥ$ۥ۟;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۦ۟ۡ$ۥ۟;,
        LYue/ۥ۠ۦ۟ۡ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LYue/ۥ۠ۦ۟ۡ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    sput-object v0, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    return-void
.end method


# virtual methods
.method public abstract synthetic cancel()V
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation
.end method

.method public abstract isCancelled()Z
.end method

.method public abstract start()Z
.end method

.method public abstract synthetic ۥ۟۟(Ljava/lang/Throwable;)Z
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation
.end method

.method public abstract ۥ۟۟۟()Z
.end method

.method public abstract ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
.end method

.method public abstract ۥ۟۟۟ۢ()Z
.end method

.method public abstract ۥ۟۟۟ۨ(LYue/ۥ۠ۦ۟ۡ;)LYue/ۥ۠ۦ۟ۡ;
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
.end method

.method public abstract ۥ۟۟۠ۨ()LYue/ۥۡۨۢ;
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
.end method

.method public abstract ۥ۟۟ۡۡ(LYue/ۥۣ۠ۡ۟;)LYue/ۥۣۣ۠۟;
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
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
.end method

.method public abstract ۥ۟۟ۢۥ()Ljava/util/concurrent/CancellationException;
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end method

.method public abstract ۥ۟۟ۤۢ(ZZLYue/ۥۣ۠ۡ۟;)LYue/ۥۣۣ۠۟;
    .param p3    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۦۧ;
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
.end method

.method public abstract ۥ۟۟ۤۨ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
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
.end method

.method public abstract ۥ۟۟ۥ۟()LYue/ۥۡۧۨۦ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end method

.method public abstract ۥ۟۟ۥۢ(LYue/ۥ۟ۤۦ۟;)LYue/ۥ۟ۤۥۨ;
    .param p1    # LYue/ۥ۟ۤۦ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end method

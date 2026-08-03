.class public LYue/ۥ۠ۡۡۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۨۡۥ;


# instance fields
.field public ۥۣ۟۟۠:Ljava/lang/String;

.field public ۥ۟۟۠ۤ:LYue/ۥۢ۠ۤۢ;

.field public ۥ۟۟۠ۥ:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "LYue/\u06e5\u06e2\u06e0\u06e4\u06e4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۢ۠ۤۢ;Ljava/util/Queue;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06e0\u06e4\u06e2;",
            "Ljava/util/Queue<",
            "LYue/\u06e5\u06e2\u06e0\u06e4\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۡۡۨ;->ۥ۟۟۠ۤ:LYue/ۥۢ۠ۤۢ;

    invoke-virtual {p1}, LYue/ۥۢ۠ۤۢ;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۡۡۨ;->ۥۣ۟۟۠:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥ۠ۡۡۨ;->ۥ۟۟۠ۥ:Ljava/util/Queue;

    return-void
.end method


# virtual methods
.method public debug(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟ۡ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, v1}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public debug(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 2
    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۨ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, p2}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public error(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, v1}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public error(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 2
    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, p2}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡۡۨ;->ۥۣ۟۟۠:Ljava/lang/String;

    return-object v0
.end method

.method public info(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, v1}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public info(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 2
    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, p2}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public isDebugEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isErrorEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isInfoEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isWarnEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public warn(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, v1}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public warn(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 2
    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, p2}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V
    .locals 1

    sget-object p1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, v0}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟۟(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۨ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v4, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟۟۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    sget-object p1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public varargs ۥ۟۟۟ۢ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥۣ۟۟۟(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟ۡ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟۟ۦ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟ۡ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟۟ۧ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۨ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public varargs ۥ۟۟۟ۨ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟ۡ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟۠۟(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟۠۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۨ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟۠ۡ(LYue/ۥ۠ۨۨۢ;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public ۥ۟۟۠ۢ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۥۣ۟۟۠(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public varargs ۥ۟۟۠ۤ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public varargs ۥ۟۟۠ۥ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟۠ۦ(LYue/ۥ۠ۨۨۢ;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public ۥ۟۟۠ۧ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟ۡ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v4, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟۠ۨ(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۨ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟ۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v4, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟ۡ۟(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p3, p4}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 3

    new-instance v0, LYue/ۥۢ۠ۤۤ;

    invoke-direct {v0}, LYue/ۥۢ۠ۤۤ;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LYue/ۥۢ۠ۤۤ;->ۥ۟۟۠۠(J)V

    invoke-virtual {v0, p1}, LYue/ۥۢ۠ۤۤ;->ۥ۟۟۟ۤ(LYue/ۥ۠ۧ۟ۦ;)V

    iget-object p1, p0, LYue/ۥ۠ۡۡۨ;->ۥ۟۟۠ۤ:LYue/ۥۢ۠ۤۢ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۠ۤۤ;->ۥ۟۟۟ۥ(LYue/ۥۢ۠ۤۢ;)V

    iget-object p1, p0, LYue/ۥ۠ۡۡۨ;->ۥۣ۟۟۠:Ljava/lang/String;

    invoke-virtual {v0, p1}, LYue/ۥۢ۠ۤۤ;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, LYue/ۥۢ۠ۤۤ;->ۥ۟۟۟ۧ(LYue/ۥ۠ۨۨۢ;)V

    invoke-virtual {v0, p3}, LYue/ۥۢ۠ۤۤ;->ۥ۟۟۟ۨ(Ljava/lang/String;)V

    invoke-virtual {v0, p4}, LYue/ۥۢ۠ۤۤ;->ۥۣ۟۟۟([Ljava/lang/Object;)V

    invoke-virtual {v0, p5}, LYue/ۥۢ۠ۤۤ;->ۥ۟۟۠۟(Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥۢ۠ۤۤ;->ۥ۟۟۠(Ljava/lang/String;)V

    iget-object p1, p0, LYue/ۥ۠ۡۡۨ;->ۥ۟۟۠ۥ:Ljava/util/Queue;

    invoke-interface {p1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۥ۟۟ۡۡ(LYue/ۥ۠ۨۨۢ;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public ۥ۟۟ۡۢ(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public varargs ۥۣ۟۟ۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟ۡ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟ۡۤ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public varargs ۥ۟۟ۡۥ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۨ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟ۡۦ(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟ۡ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, p2}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 6

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟ۡۨ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۨ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p3, p4}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public varargs ۥ۟۟ۢ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟ۡ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟ۢ۟(Ljava/lang/String;)V
    .locals 2

    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟ۡ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, v1}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟ۢ۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public varargs ۥ۟۟ۢۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۨ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public varargs ۥ۟۟ۢۢ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥۣ۟۟ۢ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    sget-object v0, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡۧ(LYue/ۥ۠ۧ۟ۦ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟ۢۤ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۨ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v4, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟ۢۥ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟ۡ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟ۢۦ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p3, p4}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟ۢۧ(LYue/ۥ۠ۨۨۢ;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public varargs ۥ۟۟ۢۨ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥۣ۟۟۟(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟ۡ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p3, p4}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥۣ۟۟۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۧ۟ۦ;

    filled-new-array {p3, p4}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥۣ۟۟ۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 6

    sget-object v1, LYue/ۥ۠ۧ۟ۦ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۧ۟ۦ;

    const/4 v4, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۡۨ;->ۥ۟۟ۡ۠(LYue/ۥ۠ۧ۟ۦ;LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥۣ۟۟ۢ(LYue/ۥ۠ۨۨۢ;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.class public LYue/ۥۢ۠ۤۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۨۡۥ;


# instance fields
.field public final ۥۣ۟۟۠:Ljava/lang/String;

.field public volatile ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

.field public ۥ۟۟۠ۥ:Ljava/lang/Boolean;

.field public ۥ۟۟۠ۦ:Ljava/lang/reflect/Method;

.field public ۥ۟۟۠ۧ:LYue/ۥ۠ۡۡۨ;

.field public ۥ۟۟۠ۨ:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "LYue/\u06e5\u06e2\u06e0\u06e4\u06e4;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟ۡ:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Queue;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Queue<",
            "LYue/\u06e5\u06e2\u06e0\u06e4\u06e4;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢ۠ۤۢ;->ۥۣ۟۟۠:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۨ:Ljava/util/Queue;

    iput-boolean p3, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ:Z

    return-void
.end method


# virtual methods
.method public debug(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥ۠ۨۡۥ;->debug(Ljava/lang/String;)V

    return-void
.end method

.method public debug(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 2
    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->debug(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LYue/ۥۢ۠ۤۢ;

    iget-object v2, p0, LYue/ۥۢ۠ۤۢ;->ۥۣ۟۟۠:Ljava/lang/String;

    iget-object p1, p1, LYue/ۥۢ۠ۤۢ;->ۥۣ۟۟۠:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public error(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥ۠ۨۡۥ;->error(Ljava/lang/String;)V

    return-void
.end method

.method public error(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 2
    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۤۢ;->ۥۣ۟۟۠:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۤۢ;->ۥۣ۟۟۠:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public info(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥ۠ۨۡۥ;->info(Ljava/lang/String;)V

    return-void
.end method

.method public info(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 2
    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->info(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public isDebugEnabled()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۠ۨۡۥ;->isDebugEnabled()Z

    move-result v0

    return v0
.end method

.method public isErrorEnabled()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۠ۨۡۥ;->isErrorEnabled()Z

    move-result v0

    return v0
.end method

.method public isInfoEnabled()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۠ۨۡۥ;->isInfoEnabled()Z

    move-result v0

    return v0
.end method

.method public isWarnEnabled()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۠ۨۡۥ;->isWarnEnabled()Z

    move-result v0

    return v0
.end method

.method public warn(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥ۠ۨۡۥ;->warn(Ljava/lang/String;)V

    return-void
.end method

.method public warn(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 2
    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۟(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟۟(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟۟۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public varargs ۥ۟۟۟ۢ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۢ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public ۥۣ۟۟۟(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥۣ۟۟۟(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۟ۦ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۟ۧ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۧ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V

    return-void
.end method

.method public varargs ۥ۟۟۟ۨ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۨ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۠۟(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۠۟(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۠۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۠۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۠ۡ(LYue/ۥ۠ۨۨۢ;)Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۠ۡ(LYue/ۥ۠ۨۨۢ;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۠ۢ()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۠ۢ()Z

    move-result v0

    return v0
.end method

.method public ۥۣ۟۟۠(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥۣ۟۟۠(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public varargs ۥ۟۟۠ۤ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۠ۤ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public varargs ۥ۟۟۠ۥ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۠ۥ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۠ۦ(LYue/ۥ۠ۨۨۢ;)Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۠ۦ(LYue/ۥ۠ۨۨۢ;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۠ۧ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۠ۧ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟۠ۨ(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۠ۨ(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟ۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟ۡ۟(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۡ۟(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

    return-object v0

    :cond_0
    iget-boolean v0, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ:Z

    if-eqz v0, :cond_1

    sget-object v0, LYue/ۥۡۢ۟ۧ;->ۥ۟۟۠ۧ:LYue/ۥۡۢ۟ۧ;

    return-object v0

    :cond_1
    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡۧ()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۡۡ(LYue/ۥ۠ۨۨۢ;)Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۡۡ(LYue/ۥ۠ۨۨۢ;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟ۡۢ(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۡۢ(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public varargs ۥۣ۟۟ۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥۣ۟۟ۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟ۡۤ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۡۤ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V

    return-void
.end method

.method public varargs ۥ۟۟ۡۥ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۡۥ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟ۡۦ(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۡۦ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final ۥ۟۟ۡۧ()LYue/ۥ۠ۨۡۥ;
    .locals 2

    iget-object v0, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۡۡۨ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۠ۡۡۨ;

    iget-object v1, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۨ:Ljava/util/Queue;

    invoke-direct {v0, p0, v1}, LYue/ۥ۠ۡۡۨ;-><init>(LYue/ۥۢ۠ۤۢ;Ljava/util/Queue;)V

    iput-object v0, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۡۡۨ;

    :cond_0
    iget-object v0, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۡۡۨ;

    return-object v0
.end method

.method public ۥ۟۟ۡۨ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۡۨ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public varargs ۥ۟۟ۢ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟ۢ۟(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟ۢ۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public varargs ۥ۟۟ۢۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public varargs ۥ۟۟ۢۢ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢۢ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public ۥۣ۟۟ۢ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥۣ۟۟ۢ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟ۢۤ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢۤ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟ۢۥ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢۥ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟ۢۦ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢۦ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟ۢۧ(LYue/ۥ۠ۨۨۢ;)Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢۧ(LYue/ۥ۠ۨۨۢ;)Z

    move-result p1

    return p1
.end method

.method public varargs ۥ۟۟ۢۨ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢۨ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public ۥۣ۟۟()Z
    .locals 3

    iget-object v0, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۥ:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    :try_start_0
    iget-object v0, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "log"

    const-class v2, LYue/ۥ۠ۨۡۨ;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۦ:Ljava/lang/reflect/Method;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۥ:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۥ:Ljava/lang/Boolean;

    :goto_0
    iget-object v0, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۥ:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public ۥۣ۟۟۟(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, LYue/ۥ۠ۨۡۥ;->ۥۣ۟۟۟(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥۣ۟۟۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, LYue/ۥ۠ۨۡۥ;->ۥۣ۟۟۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥۣ۟۟ۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥۣ۟۟ۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥۣ۟۟ۢ(LYue/ۥ۠ۨۨۢ;)Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥ۟۟ۡ۠()LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥ۠ۨۡۥ;->ۥۣ۟۟ۢ(LYue/ۥ۠ۨۨۢ;)Z

    move-result p1

    return p1
.end method

.method public ۥۣۣ۟۟()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

    instance-of v0, v0, LYue/ۥۡۢ۟ۧ;

    return v0
.end method

.method public ۥۣ۟۟ۤ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥۣ۟۟ۥ(LYue/ۥ۠ۨۡۨ;)V
    .locals 2

    invoke-virtual {p0}, LYue/ۥۢ۠ۤۢ;->ۥۣ۟۟()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۦ:Ljava/lang/reflect/Method;

    iget-object v1, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public ۥۣ۟۟ۦ(LYue/ۥ۠ۨۡۥ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢ۠ۤۢ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۨۡۥ;

    return-void
.end method

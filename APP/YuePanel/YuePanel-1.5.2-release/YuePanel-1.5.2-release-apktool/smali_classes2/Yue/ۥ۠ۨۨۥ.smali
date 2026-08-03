.class public abstract LYue/ۥ۠ۨۨۥ;
.super LYue/ۥۡۢ۠ۡ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۨۡۥ;


# static fields
.field public static final ۥ۟۟۠ۥ:J = 0x7d83b1554e5d279bL


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۡۢ۠ۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic getName()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, LYue/ۥۡۢ۠ۡ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥ۠ۨۨۥ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V
    .locals 0

    invoke-interface {p0, p2}, LYue/ۥ۠ۨۡۥ;->warn(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-interface {p0, p2, p3}, LYue/ۥ۠ۨۡۥ;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟۟۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V
    .locals 0

    invoke-interface {p0, p2}, LYue/ۥ۠ۨۡۥ;->info(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public varargs ۥ۟۟۟ۢ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۠ۥ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public ۥۣ۟۟۟(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۟ۧ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V
    .locals 0

    invoke-interface {p0, p2}, LYue/ۥ۠ۨۡۥ;->debug(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۠۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۠ۨ(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۠ۡ(LYue/ۥ۠ۨۨۢ;)Z
    .locals 0

    invoke-interface {p0}, LYue/ۥ۠ۨۡۥ;->isInfoEnabled()Z

    move-result p1

    return p1
.end method

.method public varargs ۥ۟۟۠ۤ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢۢ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۠ۦ(LYue/ۥ۠ۨۨۢ;)Z
    .locals 0

    invoke-interface {p0}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۠ۢ()Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۠ۧ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-interface {p0, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۡۦ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟ۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-interface {p0, p2, p3}, LYue/ۥ۠ۨۡۥ;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟ۡ۟(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p2, p3, p4}, LYue/ۥ۠ۨۡۥ;->ۥۣ۟۟ۢ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟ۡۡ(LYue/ۥ۠ۨۨۢ;)Z
    .locals 0

    invoke-interface {p0}, LYue/ۥ۠ۨۡۥ;->isDebugEnabled()Z

    move-result p1

    return p1
.end method

.method public varargs ۥۣ۟۟ۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟ۡۤ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V
    .locals 0

    invoke-interface {p0, p2}, LYue/ۥ۠ۨۡۥ;->error(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟ۡۨ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p2, p3, p4}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟ۢ۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۡۢ(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public varargs ۥ۟۟ۢۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۡۥ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟ۢۤ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-interface {p0, p2, p3}, LYue/ۥ۠ۨۡۥ;->debug(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟ۢۥ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;)V
    .locals 0

    invoke-interface {p0, p2}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟ۢ۟(Ljava/lang/String;)V

    return-void
.end method

.method public ۥ۟۟ۢۦ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p2, p3, p4}, LYue/ۥ۠ۨۡۥ;->ۥۣ۟۟۠(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟ۢۧ(LYue/ۥ۠ۨۨۢ;)Z
    .locals 0

    invoke-interface {p0}, LYue/ۥ۠ۨۡۥ;->isErrorEnabled()Z

    move-result p1

    return p1
.end method

.method public varargs ۥ۟۟ۢۨ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p2, p3}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۨ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public ۥۣ۟۟۟(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p2, p3, p4}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥۣ۟۟۠(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p2, p3, p4}, LYue/ۥ۠ۨۡۥ;->ۥ۟۟۠۟(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥۣ۟۟ۡ(LYue/ۥ۠ۨۨۢ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-interface {p0, p2, p3}, LYue/ۥ۠ۨۡۥ;->info(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥۣ۟۟ۢ(LYue/ۥ۠ۨۨۢ;)Z
    .locals 0

    invoke-interface {p0}, LYue/ۥ۠ۨۡۥ;->isWarnEnabled()Z

    move-result p1

    return p1
.end method

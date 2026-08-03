.class public final LDx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LCx;
.implements LB6;


# instance fields
.field public final a:LCx;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/Set;


# direct methods
.method public constructor <init>(LCx;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDx;->a:LCx;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, LCx;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LDx;->b:Ljava/lang/String;

    invoke-static {p1}, Lcr;->c(LCx;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LDx;->c:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, LDx;->a:LCx;

    invoke-interface {v0, p1}, LCx;->a(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LDx;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()LfG;
    .locals 1

    iget-object v0, p0, LDx;->a:LCx;

    invoke-interface {v0}, LCx;->c()LfG;

    move-result-object v0

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, LDx;->a:LCx;

    invoke-interface {v0}, LCx;->d()I

    move-result v0

    return v0
.end method

.method public final e(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LDx;->a:LCx;

    invoke-interface {v0, p1}, LCx;->e(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LDx;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LDx;

    iget-object p1, p1, LDx;->a:LCx;

    iget-object v1, p0, LDx;->a:LCx;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, LDx;->a:LCx;

    invoke-interface {v0}, LCx;->f()Z

    move-result v0

    return v0
.end method

.method public final g()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LDx;->c:Ljava/util/Set;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, LDx;->a:LCx;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public final i(I)Ljava/util/List;
    .locals 1

    iget-object v0, p0, LDx;->a:LCx;

    invoke-interface {v0, p1}, LCx;->i(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final j(I)LCx;
    .locals 1

    iget-object v0, p0, LDx;->a:LCx;

    invoke-interface {v0, p1}, LCx;->j(I)LCx;

    move-result-object p1

    return-object p1
.end method

.method public final k(I)Z
    .locals 1

    iget-object v0, p0, LDx;->a:LCx;

    invoke-interface {v0, p1}, LCx;->k(I)Z

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LDx;->a:LCx;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

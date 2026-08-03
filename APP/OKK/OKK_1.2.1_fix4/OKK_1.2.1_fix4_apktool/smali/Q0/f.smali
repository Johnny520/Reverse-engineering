.class public abstract LQ0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ0/e;
.implements Ljava/io/Serializable;
.implements LD0/a;


# instance fields
.field public transient a:LQ0/f;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Class;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Z

.field public final g:I

.field public final h:I


# direct methods
.method public constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, LQ0/f;->b:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, LQ0/f;->c:Ljava/lang/Class;

    .line 5
    iput-object p4, p0, LQ0/f;->d:Ljava/lang/String;

    .line 6
    iput-object p5, p0, LQ0/f;->e:Ljava/lang/String;

    .line 7
    iput-boolean v0, p0, LQ0/f;->f:Z

    .line 8
    iput p1, p0, LQ0/f;->g:I

    const/4 p1, 0x0

    .line 9
    iput p1, p0, LQ0/f;->h:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    sget-object v2, LQ0/a;->a:LQ0/a;

    const/4 v1, 0x1

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, LQ0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()LQ0/f;
    .locals 1

    sget-object v0, LQ0/n;->a:LQ0/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final c()LQ0/b;
    .locals 2

    iget-object v0, p0, LQ0/f;->c:Ljava/lang/Class;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    iget-boolean v1, p0, LQ0/f;->f:Z

    if-eqz v1, :cond_1

    sget-object v1, LQ0/n;->a:LQ0/o;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, LQ0/i;

    invoke-direct {v1, v0}, LQ0/i;-><init>(Ljava/lang/Class;)V

    :goto_0
    move-object v0, v1

    goto :goto_1

    :cond_1
    sget-object v1, LQ0/n;->a:LQ0/o;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, LQ0/c;

    invoke-direct {v1, v0}, LQ0/c;-><init>(Ljava/lang/Class;)V

    goto :goto_0

    :goto_1
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LQ0/f;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, LQ0/f;

    iget-object v1, p1, LQ0/f;->d:Ljava/lang/String;

    iget-object v3, p0, LQ0/f;->d:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LQ0/f;->e:Ljava/lang/String;

    iget-object v3, p1, LQ0/f;->e:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, LQ0/f;->h:I

    iget v3, p1, LQ0/f;->h:I

    if-ne v1, v3, :cond_1

    iget v1, p0, LQ0/f;->g:I

    iget v3, p1, LQ0/f;->g:I

    if-ne v1, v3, :cond_1

    iget-object v1, p0, LQ0/f;->b:Ljava/lang/Object;

    iget-object v3, p1, LQ0/f;->b:Ljava/lang/Object;

    invoke-static {v1, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LQ0/f;->c()LQ0/b;

    move-result-object v1

    invoke-virtual {p1}, LQ0/f;->c()LQ0/b;

    move-result-object p1

    invoke-static {v1, p1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    instance-of v0, p1, LQ0/f;

    if-eqz v0, :cond_4

    iget-object v0, p0, LQ0/f;->a:LQ0/f;

    if-nez v0, :cond_3

    invoke-virtual {p0}, LQ0/f;->a()LQ0/f;

    iput-object p0, p0, LQ0/f;->a:LQ0/f;

    move-object v0, p0

    :cond_3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    return v2
.end method

.method public final getArity()I
    .locals 1

    iget v0, p0, LQ0/f;->g:I

    return v0
.end method

.method public final hashCode()I
    .locals 2

    invoke-virtual {p0}, LQ0/f;->c()LQ0/b;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LQ0/f;->c()LQ0/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    :goto_0
    iget-object v1, p0, LQ0/f;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LQ0/f;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LQ0/f;->a:LQ0/f;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LQ0/f;->a()LQ0/f;

    iput-object p0, p0, LQ0/f;->a:LQ0/f;

    move-object v0, p0

    :cond_0
    if-eq v0, p0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, "<init>"

    iget-object v1, p0, LQ0/f;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "constructor (Kotlin reflection is not available)"

    goto :goto_0

    :cond_2
    const-string v0, "function "

    const-string v2, " (Kotlin reflection is not available)"

    invoke-static {v0, v1, v2}, LS/d;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

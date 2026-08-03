.class public final Lc/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Lc/j;

.field final b:Lc/j;

.field final c:Ljava/lang/String;

.field final d:Lc/k;

.field final e:Lk/q;


# direct methods
.method constructor <init>(Lc/j;Lc/j;Ljava/lang/String;Lc/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    iput-object p1, p0, Lc/i;->a:Lc/j;

    iput-object p2, p0, Lc/i;->b:Lc/j;

    iput-object p3, p0, Lc/i;->c:Ljava/lang/String;

    iput-object p4, p0, Lc/i;->d:Lc/k;

    new-instance p2, Lk/r;

    new-instance p4, Lk/t;

    invoke-direct {p4, p3}, Lk/t;-><init>(Ljava/lang/String;)V

    new-instance p3, Lk/t;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lc/i;->a(Z)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, v0}, Lk/t;-><init>(Ljava/lang/String;)V

    invoke-direct {p2, p4, p3}, Lk/r;-><init>(Lk/t;Lk/t;)V

    new-instance p3, Lk/q;

    iget-object p1, p1, Lc/j;->c:Lk/u;

    invoke-direct {p3, p1, p2}, Lk/q;-><init>(Lk/u;Lk/r;)V

    iput-object p3, p0, Lc/i;->e:Lk/q;

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method final a(Z)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc/i;->a:Lc/j;

    iget-object p1, p1, Lc/j;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object p1, p0, Lc/i;->d:Lc/k;

    iget-object p1, p1, Lc/k;->a:[Lc/j;

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    iget-object v3, v3, Lc/j;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lc/i;->b:Lc/j;

    iget-object p1, p1, Lc/j;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lc/i;

    if-eqz v0, :cond_0

    check-cast p1, Lc/i;

    iget-object v0, p1, Lc/i;->a:Lc/j;

    iget-object v1, p0, Lc/i;->a:Lc/j;

    invoke-virtual {v0, v1}, Lc/j;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lc/i;->c:Ljava/lang/String;

    iget-object v1, p0, Lc/i;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lc/i;->d:Lc/k;

    iget-object v1, p0, Lc/i;->d:Lc/k;

    invoke-virtual {v0, v1}, Lc/k;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lc/i;->b:Lc/j;

    iget-object v0, p0, Lc/i;->b:Lc/j;

    invoke-virtual {p1, v0}, Lc/j;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lc/i;->a:Lc/j;

    invoke-virtual {v0}, Lc/j;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lc/i;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lc/i;->d:Lc/k;

    invoke-virtual {v0}, Lc/k;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lc/i;->b:Lc/j;

    invoke-virtual {v0}, Lc/j;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lc/i;->a:Lc/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/i;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/i;->d:Lc/k;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

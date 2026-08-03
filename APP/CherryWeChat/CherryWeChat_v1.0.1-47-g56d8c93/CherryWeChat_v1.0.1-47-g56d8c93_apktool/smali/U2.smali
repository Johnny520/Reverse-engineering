.class public final LU2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/Integer;

.field public final e:LT2;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Z)V
    .locals 6

    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move v1, p2

    .line 1
    invoke-direct/range {v0 .. v5}, LU2;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;LT2;)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;LT2;)V
    .locals 2

    const-wide v0, -0x1679dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, LU2;->a:Z

    .line 4
    iput-object p2, p0, LU2;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, LU2;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, LU2;->d:Ljava/lang/Integer;

    .line 7
    iput-object p5, p0, LU2;->e:LT2;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LU2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LU2;

    iget-boolean v1, p0, LU2;->a:Z

    iget-boolean v3, p1, LU2;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LU2;->b:Ljava/lang/String;

    iget-object v3, p1, LU2;->b:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LU2;->c:Ljava/lang/String;

    iget-object v3, p1, LU2;->c:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LU2;->d:Ljava/lang/Integer;

    iget-object v3, p1, LU2;->d:Ljava/lang/Integer;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LU2;->e:LT2;

    iget-object p1, p1, LU2;->e:LT2;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-boolean v0, p0, LU2;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, LU2;->b:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, LU2;->c:Ljava/lang/String;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, LU2;->d:Ljava/lang/Integer;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, LU2;->e:LT2;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, LT2;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x167adfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LU2;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-wide v1, -0x16643fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LU2;->b:Ljava/lang/String;

    const-wide v2, -0x1664efffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, LU2;->c:Ljava/lang/String;

    const-wide v2, -0x16656fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, LU2;->d:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-wide v1, -0x16663fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LU2;->e:LT2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

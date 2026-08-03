.class public final Lg/G;
.super Lg/r;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field private final b:Lk/t;

.field private c:Lg/F;


# direct methods
.method public constructor <init>(Lk/t;)V
    .locals 1

    invoke-direct {p0}, Lg/r;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lg/G;->b:Lk/t;

    const/4 p1, 0x0

    iput-object p1, p0, Lg/G;->c:Lg/F;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "value == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lg/k;)V
    .locals 2

    iget-object v0, p0, Lg/G;->c:Lg/F;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lg/k;->o()Lg/B;

    move-result-object p1

    new-instance v0, Lg/F;

    iget-object v1, p0, Lg/G;->b:Lk/t;

    invoke-direct {v0, v1}, Lg/F;-><init>(Lk/t;)V

    iput-object v0, p0, Lg/G;->c:Lg/F;

    invoke-virtual {p1, v0}, Lg/B;->o(Lg/C;)V

    :cond_0
    return-void
.end method

.method public final b()Lg/t;
    .locals 1

    sget-object v0, Lg/t;->e:Lg/t;

    return-object v0
.end method

.method public final c()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lg/G;

    iget-object v0, p0, Lg/G;->b:Lk/t;

    iget-object p1, p1, Lg/G;->b:Lk/t;

    invoke-virtual {v0, p1}, Lk/a;->b(Lk/a;)I

    move-result p1

    return p1
.end method

.method public final d(Lg/k;Ln/d;)V
    .locals 6

    iget-object p1, p0, Lg/G;->c:Lg/F;

    invoke-virtual {p1}, Lg/C;->f()I

    move-result p1

    invoke-virtual {p2}, Ln/d;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lg/r;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg/G;->b:Lk/t;

    invoke-virtual {v1}, Lk/t;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x62

    const/4 v4, 0x0

    if-gt v2, v3, :cond_0

    const-string v2, ""

    goto :goto_0

    :cond_0
    const/16 v2, 0x5f

    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "..."

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "\""

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x22

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v4, v0}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {p1}, La/b;->s(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "  string_data_off: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {p2, v1, v0}, Ln/d;->b(ILjava/lang/String;)V

    :cond_1
    invoke-virtual {p2, p1}, Ln/d;->q(I)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lg/G;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lg/G;

    iget-object v0, p0, Lg/G;->b:Lk/t;

    iget-object p1, p1, Lg/G;->b:Lk/t;

    invoke-virtual {v0, p1}, Lk/t;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lg/G;->b:Lk/t;

    invoke-virtual {v0}, Lk/t;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()Lk/t;
    .locals 1

    iget-object v0, p0, Lg/G;->b:Lk/t;

    return-object v0
.end method

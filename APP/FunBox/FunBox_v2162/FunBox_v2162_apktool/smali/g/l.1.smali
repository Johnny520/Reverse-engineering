.class public final Lg/l;
.super Lg/C;
.source "SourceFile"


# instance fields
.field private final e:Lk/c;

.field private f:[B


# direct methods
.method public constructor <init>(Lk/c;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, Lg/C;-><init>(II)V

    iput-object p1, p0, Lg/l;->e:Lk/c;

    const/4 p1, 0x0

    iput-object p1, p0, Lg/l;->f:[B

    return-void
.end method


# virtual methods
.method public final a(Lg/k;)V
    .locals 1

    iget-object v0, p0, Lg/l;->e:Lk/c;

    invoke-static {p1, v0}, Lg/L;->a(Lg/k;Lk/a;)V

    return-void
.end method

.method public final b()Lg/t;
    .locals 1

    sget-object v0, Lg/t;->p:Lg/t;

    return-object v0
.end method

.method protected final e(Lg/C;)I
    .locals 1

    check-cast p1, Lg/l;

    iget-object v0, p0, Lg/l;->e:Lk/c;

    iget-object p1, p1, Lg/l;->e:Lk/c;

    invoke-virtual {v0, p1}, Lk/a;->b(Lk/a;)I

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lg/l;->e:Lk/c;

    invoke-virtual {v0}, Lk/c;->hashCode()I

    move-result v0

    return v0
.end method

.method protected final j(Lg/E;I)V
    .locals 2

    new-instance p2, Ln/d;

    invoke-direct {p2}, Ln/d;-><init>()V

    new-instance v0, Lg/L;

    invoke-virtual {p1}, Lg/E;->d()Lg/k;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lg/L;-><init>(Lg/k;Ln/d;)V

    iget-object p1, p0, Lg/l;->e:Lk/c;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lg/L;->c(Lk/c;Z)V

    invoke-virtual {p2}, Ln/d;->m()[B

    move-result-object p1

    iput-object p1, p0, Lg/l;->f:[B

    array-length p1, p1

    invoke-virtual {p0, p1}, Lg/C;->k(I)V

    return-void
.end method

.method protected final l(Lg/k;Ln/d;)V
    .locals 2

    invoke-virtual {p2}, Ln/d;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lg/C;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " encoded array"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Ln/d;->b(ILjava/lang/String;)V

    new-instance v0, Lg/L;

    invoke-direct {v0, p1, p2}, Lg/L;-><init>(Lg/k;Ln/d;)V

    iget-object p1, p0, Lg/l;->e:Lk/c;

    const/4 p2, 0x1

    invoke-virtual {v0, p1, p2}, Lg/L;->c(Lk/c;Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lg/l;->f:[B

    invoke-virtual {p2, p1}, Ln/d;->o([B)V

    :goto_0
    return-void
.end method

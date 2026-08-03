.class public final Lg/n;
.super Lg/m;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field private final b:Lk/q;

.field private final c:Lg/g;


# direct methods
.method public constructor <init>(Lk/q;ILe/i;Ll/b;)V
    .locals 1

    invoke-direct {p0, p2}, Lg/m;-><init>(I)V

    if-eqz p1, :cond_2

    iput-object p1, p0, Lg/n;->b:Lk/q;

    if-nez p3, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lg/n;->c:Lg/g;

    goto :goto_1

    :cond_0
    and-int/lit8 p2, p2, 0x8

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    new-instance v0, Lg/g;

    invoke-direct {v0, p1, p3, p2, p4}, Lg/g;-><init>(Lk/q;Le/i;ZLl/b;)V

    iput-object v0, p0, Lg/n;->c:Lg/g;

    :goto_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "method == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg/n;->b:Lk/q;

    invoke-virtual {v0}, Lk/p;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lg/k;Ln/d;II)I
    .locals 7

    invoke-virtual {p1}, Lg/k;->m()Lg/z;

    move-result-object p1

    iget-object v0, p0, Lg/n;->b:Lk/q;

    invoke-virtual {p1, v0}, Lg/z;->q(Lk/d;)I

    move-result p1

    sub-int p3, p1, p3

    invoke-virtual {p0}, Lg/m;->e()I

    move-result v1

    const/4 v2, 0x0

    iget-object v3, p0, Lg/n;->c:Lg/g;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lg/C;->f()I

    move-result v3

    :goto_0
    const/4 v4, 0x1

    if-eqz v3, :cond_1

    move v5, v4

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    and-int/lit16 v6, v1, 0x500

    if-nez v6, :cond_2

    goto :goto_2

    :cond_2
    move v4, v2

    :goto_2
    if-ne v5, v4, :cond_4

    invoke-virtual {p2}, Ln/d;->d()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {v0}, Lk/p;->a()Ljava/lang/String;

    move-result-object v0

    filled-new-array {p4, v0}, [Ljava/lang/Object;

    move-result-object p4

    const-string v0, "  [%x] %s"

    invoke-static {v0, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, v2, p4}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {p3}, La/b;->u(I)I

    move-result p4

    invoke-static {p1}, La/b;->s(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "    method_idx:   "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p4, v0}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v1}, La/b;->u(I)I

    move-result p4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "    access_flags: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, La/b;->m(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p4, v0}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v3}, La/b;->u(I)I

    move-result p4

    invoke-static {v3}, La/b;->s(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "    code_off:     "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p4, v0}, Ln/d;->b(ILjava/lang/String;)V

    :cond_3
    invoke-virtual {p2, p3}, Ln/d;->t(I)I

    invoke-virtual {p2, v1}, Ln/d;->t(I)I

    invoke-virtual {p2, v3}, Ln/d;->t(I)I

    return p1

    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "code vs. access_flags mismatch"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lg/n;

    iget-object v0, p0, Lg/n;->b:Lk/q;

    iget-object p1, p1, Lg/n;->b:Lk/q;

    invoke-virtual {v0, p1}, Lk/a;->b(Lk/a;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lg/n;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lg/n;

    iget-object v0, p0, Lg/n;->b:Lk/q;

    iget-object p1, p1, Lg/n;->b:Lk/q;

    invoke-virtual {v0, p1}, Lk/a;->b(Lk/a;)I

    move-result p1

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final f(Lg/k;)V
    .locals 2

    invoke-virtual {p1}, Lg/k;->m()Lg/z;

    move-result-object v0

    invoke-virtual {p1}, Lg/k;->s()Lg/B;

    move-result-object p1

    iget-object v1, p0, Lg/n;->b:Lk/q;

    invoke-virtual {v0, v1}, Lg/z;->r(Lk/d;)V

    iget-object v0, p0, Lg/n;->c:Lg/g;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Lg/B;->o(Lg/C;)V

    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-class v1, Lg/n;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lg/m;->e()I

    move-result v1

    invoke-static {v1}, La/b;->q(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lg/n;->b:Lk/q;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lg/n;->c:Lg/g;

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_0
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

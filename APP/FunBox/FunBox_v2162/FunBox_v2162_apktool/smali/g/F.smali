.class public final Lg/F;
.super Lg/C;
.source "SourceFile"


# instance fields
.field private final e:Lk/t;


# direct methods
.method public constructor <init>(Lk/t;)V
    .locals 2

    invoke-virtual {p1}, Lk/t;->i()I

    move-result v0

    invoke-static {v0}, La/b;->u(I)I

    move-result v0

    invoke-virtual {p1}, Lk/t;->j()I

    move-result v1

    add-int/2addr v1, v0

    const/4 v0, 0x1

    add-int/2addr v1, v0

    invoke-direct {p0, v0, v1}, Lg/C;-><init>(II)V

    iput-object p1, p0, Lg/F;->e:Lk/t;

    return-void
.end method


# virtual methods
.method public final a(Lg/k;)V
    .locals 0

    return-void
.end method

.method public final b()Lg/t;
    .locals 1

    sget-object v0, Lg/t;->n:Lg/t;

    return-object v0
.end method

.method protected final e(Lg/C;)I
    .locals 1

    check-cast p1, Lg/F;

    iget-object v0, p0, Lg/F;->e:Lk/t;

    iget-object p1, p1, Lg/F;->e:Lk/t;

    invoke-virtual {v0, p1}, Lk/a;->b(Lk/a;)I

    move-result p1

    return p1
.end method

.method public final l(Lg/k;Ln/d;)V
    .locals 5

    iget-object p1, p0, Lg/F;->e:Lk/t;

    invoke-virtual {p1}, Lk/t;->g()Ln/b;

    move-result-object v0

    invoke-virtual {p1}, Lk/t;->i()I

    move-result v1

    invoke-virtual {p2}, Ln/d;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1}, La/b;->u(I)I

    move-result v2

    invoke-static {v1}, La/b;->s(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "utf16_size: "

    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v2, v3}, Ln/d;->b(ILjava/lang/String;)V

    invoke-virtual {v0}, Ln/b;->b()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p1}, Lk/t;->k()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v2, p1}, Ln/d;->b(ILjava/lang/String;)V

    :cond_0
    invoke-virtual {p2, v1}, Ln/d;->t(I)I

    invoke-virtual {p2, v0}, Ln/d;->n(Ln/b;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Ln/d;->p(I)V

    return-void
.end method

.class public final Lg/j;
.super Lg/C;
.source "SourceFile"


# instance fields
.field private final e:Le/i;

.field private f:[B

.field private final g:Z

.field private final h:Lk/q;


# direct methods
.method public constructor <init>(Le/i;ZLk/q;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, Lg/C;-><init>(II)V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lg/j;->e:Le/i;

    iput-boolean p2, p0, Lg/j;->g:Z

    iput-object p3, p0, Lg/j;->h:Lk/q;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "code == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private n(Lg/k;Ljava/lang/String;Ln/d;Z)[B
    .locals 9

    iget-object v0, p0, Lg/j;->e:Le/i;

    invoke-virtual {v0}, Le/i;->h()Le/z;

    move-result-object v2

    invoke-virtual {v0}, Le/i;->g()Le/t;

    move-result-object v3

    invoke-virtual {v0}, Le/i;->f()Le/k;

    move-result-object v0

    invoke-virtual {v0}, Le/k;->F()I

    move-result v5

    invoke-virtual {v0}, Le/k;->H()I

    move-result v6

    new-instance v0, Lg/i;

    iget-boolean v7, p0, Lg/j;->g:Z

    iget-object v8, p0, Lg/j;->h:Lk/q;

    move-object v1, v0

    move-object v4, p1

    invoke-direct/range {v1 .. v8}, Lg/i;-><init>(Le/z;Le/t;Lg/k;IIZLk/q;)V

    if-nez p3, :cond_0

    invoke-virtual {v0}, Lg/i;->c()[B

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p2, p3, p4}, Lg/i;->e(Ljava/lang/String;Ln/d;Z)[B

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final a(Lg/k;)V
    .locals 0

    return-void
.end method

.method public final b()Lg/t;
    .locals 1

    sget-object v0, Lg/t;->o:Lg/t;

    return-object v0
.end method

.method protected final j(Lg/E;I)V
    .locals 1

    :try_start_0
    invoke-virtual {p1}, Lg/E;->d()Lg/k;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p2, v0}, Lg/j;->n(Lg/k;Ljava/lang/String;Ln/d;Z)[B

    move-result-object p1

    iput-object p1, p0, Lg/j;->f:[B

    array-length p1, p1

    invoke-virtual {p0, p1}, Lg/C;->k(I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "...while placing debug info for "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lg/j;->h:Lk/q;

    invoke-virtual {v0}, Lk/p;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lb/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lb/a;

    move-result-object p1

    throw p1
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

    const-string v1, " debug info"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ln/d;->c(Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, p2, v1}, Lg/j;->n(Lg/k;Ljava/lang/String;Ln/d;Z)[B

    :cond_0
    iget-object p1, p0, Lg/j;->f:[B

    invoke-virtual {p2, p1}, Ln/d;->o([B)V

    return-void
.end method

.method public final m(Lg/k;Ln/d;)V
    .locals 2

    const-string v0, "    "

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, p2, v1}, Lg/j;->n(Lg/k;Ljava/lang/String;Ln/d;Z)[B

    return-void
.end method

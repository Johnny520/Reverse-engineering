.class public final Lm/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ln/g;

.field private b:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ln/g;

    invoke-direct {v0, p1}, Ln/g;-><init>(I)V

    iput-object v0, p0, Lm/a;->a:Ln/g;

    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 3

    iget-object v0, p0, Lm/a;->a:Ln/g;

    invoke-virtual {v0}, Ln/g;->o()I

    move-result v1

    if-lt p1, v1, :cond_0

    invoke-virtual {v0}, Ln/g;->o()I

    move-result v1

    sub-int v1, p1, v1

    :goto_0
    if-ltz v1, :cond_0

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Ln/g;->j(I)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, Ln/g;->m(II)V

    iget p1, p0, Lm/a;->b:I

    add-int/lit8 p2, p2, 0x1

    if-ge p1, p2, :cond_1

    iput p2, p0, Lm/a;->b:I

    :cond_1
    return-void
.end method

.method public final b(Lj/m;)Lj/m;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lm/a;->a:Ln/g;

    invoke-virtual {p1}, Lj/m;->i()I

    move-result v1

    invoke-virtual {v0, v1}, Ln/g;->l(I)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p1, v0}, Lj/m;->r(I)Lj/m;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "no mapping specified for register"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

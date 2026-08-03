.class public final Lk/c;
.super Lk/a;
.source "SourceFile"


# instance fields
.field private final a:Lk/b;


# direct methods
.method public constructor <init>(Lk/b;)V
    .locals 0

    invoke-direct {p0}, Lk/a;-><init>()V

    invoke-virtual {p1}, Ln/j;->i()V

    iput-object p1, p0, Lk/c;->a:Lk/b;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lk/c;->a:Lk/b;

    const-string v1, "{"

    const-string v2, "}"

    invoke-virtual {v0, v1, v2}, Ln/e;->C(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final e(Lk/a;)I
    .locals 1

    check-cast p1, Lk/c;

    iget-object p1, p1, Lk/c;->a:Lk/b;

    iget-object v0, p0, Lk/c;->a:Lk/b;

    invoke-virtual {v0, p1}, Lk/b;->F(Lk/b;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lk/c;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lk/c;

    iget-object p1, p1, Lk/c;->a:Lk/b;

    iget-object v0, p0, Lk/c;->a:Lk/b;

    invoke-virtual {v0, p1}, Ln/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    const-string v0, "array"

    return-object v0
.end method

.method public final g()Lk/b;
    .locals 1

    iget-object v0, p0, Lk/c;->a:Lk/b;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lk/c;->a:Lk/b;

    invoke-virtual {v0}, Ln/e;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk/c;->a:Lk/b;

    invoke-virtual {v0}, Ln/e;->D()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

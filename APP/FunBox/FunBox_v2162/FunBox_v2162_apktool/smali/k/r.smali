.class public final Lk/r;
.super Lk/a;
.source "SourceFile"


# instance fields
.field private final a:Lk/t;

.field private final b:Lk/t;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk/r;

    new-instance v1, Lk/t;

    const-string v2, "TYPE"

    invoke-direct {v1, v2}, Lk/t;-><init>(Ljava/lang/String;)V

    new-instance v2, Lk/t;

    const-string v3, "Ljava/lang/Class;"

    invoke-direct {v2, v3}, Lk/t;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lk/r;-><init>(Lk/t;Lk/t;)V

    return-void
.end method

.method public constructor <init>(Lk/t;Lk/t;)V
    .locals 0

    invoke-direct {p0}, Lk/a;-><init>()V

    iput-object p1, p0, Lk/r;->a:Lk/t;

    iput-object p2, p0, Lk/r;->b:Lk/t;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lk/r;->a:Lk/t;

    invoke-virtual {v1}, Lk/t;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/r;->b:Lk/t;

    invoke-virtual {v1}, Lk/t;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final e(Lk/a;)I
    .locals 2

    check-cast p1, Lk/r;

    iget-object v0, p1, Lk/r;->a:Lk/t;

    iget-object v1, p0, Lk/r;->a:Lk/t;

    invoke-virtual {v1, v0}, Lk/a;->b(Lk/a;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    iget-object v0, p0, Lk/r;->b:Lk/t;

    iget-object p1, p1, Lk/r;->b:Lk/t;

    invoke-virtual {v0, p1}, Lk/a;->b(Lk/a;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lk/r;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lk/r;

    iget-object v0, p1, Lk/r;->a:Lk/t;

    iget-object v2, p0, Lk/r;->a:Lk/t;

    invoke-virtual {v2, v0}, Lk/t;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lk/r;->b:Lk/t;

    iget-object p1, p1, Lk/r;->b:Lk/t;

    invoke-virtual {v0, p1}, Lk/t;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    const-string v0, "nat"

    return-object v0
.end method

.method public final g()Lk/t;
    .locals 1

    iget-object v0, p0, Lk/r;->b:Lk/t;

    return-object v0
.end method

.method public final h()Lk/t;
    .locals 1

    iget-object v0, p0, Lk/r;->a:Lk/t;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lk/r;->a:Lk/t;

    invoke-virtual {v0}, Lk/t;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lk/r;->b:Lk/t;

    invoke-virtual {v1}, Lk/t;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "nat{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lk/r;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

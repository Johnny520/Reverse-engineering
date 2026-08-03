.class public abstract Lpj;
.super LF6;
.source ""

# interfaces
.implements Loj;
.implements LKm;
.implements Lkotlin/Function;


# instance fields
.field public final g:I

.field public final h:I


# direct methods
.method public constructor <init>(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p2

    move-object v1, p3

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v5}, LF6;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V

    iput p1, v0, Lpj;->g:I

    const/4 p1, 0x0

    iput p1, v0, Lpj;->h:I

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Lpj;->g:I

    return v0
.end method

.method public final c()LKm;
    .locals 1

    sget-object v0, LJv;->a:LKv;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lpj;

    if-eqz v0, :cond_1

    check-cast p1, Lpj;

    iget-object v0, p0, LF6;->d:Ljava/lang/String;

    iget-object v1, p1, LF6;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LF6;->e:Ljava/lang/String;

    iget-object v1, p1, LF6;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, p0, Lpj;->h:I

    iget v1, p1, Lpj;->h:I

    if-ne v0, v1, :cond_3

    iget v0, p0, Lpj;->g:I

    iget v1, p1, Lpj;->g:I

    if-ne v0, v1, :cond_3

    iget-object v0, p0, LF6;->b:Ljava/lang/Object;

    iget-object v1, p1, LF6;->b:Ljava/lang/Object;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LF6;->e()Ly9;

    move-result-object v0

    invoke-virtual {p1}, LF6;->e()Ly9;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    instance-of v0, p1, Lpj;

    if-eqz v0, :cond_3

    iget-object v0, p0, LF6;->a:LKm;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lpj;->c()LKm;

    iput-object p0, p0, LF6;->a:LKm;

    move-object v0, p0

    :cond_2
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    invoke-virtual {p0}, LF6;->e()Ly9;

    invoke-virtual {p0}, LF6;->e()Ly9;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, LF6;->d:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v1, p0, LF6;->e:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LF6;->a:LKm;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lpj;->c()LKm;

    iput-object p0, p0, LF6;->a:LKm;

    move-object v0, p0

    :cond_0
    if-eq v0, p0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, "<init>"

    iget-object v1, p0, LF6;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "constructor (Kotlin reflection is not available)"

    return-object v0

    :cond_2
    const-string v0, "function "

    const-string v2, " (Kotlin reflection is not available)"

    invoke-static {v0, v1, v2}, Lph;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

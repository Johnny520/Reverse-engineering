.class final Lj/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ll/d;


# direct methods
.method static bridge synthetic a(Lj/l;)I
    .locals 0

    iget p0, p0, Lj/l;->a:I

    return p0
.end method

.method static bridge synthetic b(Lj/l;)Ll/d;
    .locals 0

    iget-object p0, p0, Lj/l;->b:Ll/d;

    return-object p0
.end method


# virtual methods
.method public final c(ILl/d;)V
    .locals 0

    iput p1, p0, Lj/l;->a:I

    iput-object p2, p0, Lj/l;->b:Ll/d;

    return-void
.end method

.method public final d()Lj/m;
    .locals 3

    new-instance v0, Lj/m;

    iget v1, p0, Lj/l;->a:I

    iget-object v2, p0, Lj/l;->b:Ll/d;

    invoke-direct {v0, v1, v2}, Lj/m;-><init>(ILl/d;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lj/m;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lj/m;

    iget v0, p0, Lj/l;->a:I

    iget-object v1, p0, Lj/l;->b:Ll/d;

    invoke-static {p1, v0, v1}, Lj/m;->b(Lj/m;ILl/d;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lj/l;->a:I

    iget-object v1, p0, Lj/l;->b:Ll/d;

    invoke-static {v0, v1}, Lj/m;->e(ILl/d;)I

    move-result v0

    return v0
.end method

.class public final Le/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Le/c;


# direct methods
.method public constructor <init>(IILe/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_2

    if-le p2, p1, :cond_1

    invoke-virtual {p3}, Ln/j;->f()Z

    move-result v0

    if-nez v0, :cond_0

    iput p1, p0, Le/d;->a:I

    iput p2, p0, Le/d;->b:I

    iput-object p3, p0, Le/d;->c:Le/c;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "handlers.isMutable()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "end <= start"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "start < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Le/d;)I
    .locals 4

    iget v0, p1, Le/d;->a:I

    const/4 v1, -0x1

    iget v2, p0, Le/d;->a:I

    if-ge v2, v0, :cond_0

    return v1

    :cond_0
    const/4 v3, 0x1

    if-le v2, v0, :cond_1

    return v3

    :cond_1
    iget v0, p0, Le/d;->b:I

    iget v2, p1, Le/d;->b:I

    if-ge v0, v2, :cond_2

    return v1

    :cond_2
    if-le v0, v2, :cond_3

    return v3

    :cond_3
    iget-object v0, p0, Le/d;->c:Le/c;

    iget-object p1, p1, Le/d;->c:Le/c;

    invoke-virtual {v0, p1}, Le/c;->F(Le/c;)I

    move-result p1

    return p1
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Le/d;->b:I

    return v0
.end method

.method public final c()Le/c;
    .locals 1

    iget-object v0, p0, Le/d;->c:Le/c;

    return-object v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Le/d;

    invoke-virtual {p0, p1}, Le/d;->a(Le/d;)I

    move-result p1

    return p1
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Le/d;->a:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Le/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Le/d;

    invoke-virtual {p0, p1}, Le/d;->a(Le/d;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Le/d;->a:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Le/d;->b:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Le/d;->c:Le/c;

    invoke-virtual {v1}, Ln/e;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.class public final Lg4/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lg4/j;

.field public final b:Ljava/lang/String;

.field public final c:Lv4/m;


# direct methods
.method public constructor <init>(Lg4/j;Lg4/j;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lg4/f;->a:Lg4/j;

    .line 7
    .line 8
    iput-object p3, p0, Lg4/f;->b:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v0, Lv4/z;

    .line 11
    .line 12
    new-instance v1, Lv4/c0;

    .line 13
    .line 14
    invoke-direct {v1, p3}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance p3, Lv4/c0;

    .line 18
    .line 19
    iget-object p2, p2, Lg4/j;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-direct {p3, p2}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1, p3}, Lv4/z;-><init>(Lv4/c0;Lv4/c0;)V

    .line 25
    .line 26
    .line 27
    new-instance p2, Lv4/m;

    .line 28
    .line 29
    iget-object p1, p1, Lg4/j;->c:Lv4/d0;

    .line 30
    .line 31
    invoke-direct {p2, p1, v0}, Lv4/w;-><init>(Lv4/d0;Lv4/z;)V

    .line 32
    .line 33
    .line 34
    iput-object p2, p0, Lg4/f;->c:Lv4/m;

    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const/4 p1, 0x0

    .line 38
    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lg4/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lg4/f;

    .line 6
    .line 7
    iget-object v0, p1, Lg4/f;->a:Lg4/j;

    .line 8
    .line 9
    iget-object v1, p0, Lg4/f;->a:Lg4/j;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lg4/j;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Lg4/f;->b:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v0, p0, Lg4/f;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/f;->a:Lg4/j;

    .line 2
    .line 3
    iget-object v0, v0, Lg4/j;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lg4/f;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    mul-int/lit8 v1, v1, 0x25

    .line 16
    .line 17
    add-int/2addr v1, v0

    .line 18
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lg4/f;->a:Lg4/j;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "."

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lg4/f;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.class public Lb5/f;
.super Lb5/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final h:Ljava/lang/String;


# direct methods
.method public constructor <init>(La5/a;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lb5/j;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lb5/f;->h:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lb5/j;)I
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lb5/j;->a(Lb5/j;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    instance-of v1, p1, Lb5/f;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast p1, Lb5/f;

    .line 12
    .line 13
    iget-object p1, p1, Lb5/f;->h:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v0, p0, Lb5/f;->h:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_0
    return v0
.end method

.method public b()D
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c(Le5/a;)Z
    .locals 2

    .line 1
    const/16 v0, 0x3a

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lq5/a;->write(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/f;->h:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lq5/a;->write(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lb5/f;->d()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    int-to-long v0, v0

    .line 16
    invoke-virtual {p1, v0, v1}, Le5/a;->C(J)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lb5/j;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lb5/f;->a(Lb5/j;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lb5/j;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lb5/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lb5/j;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lb5/f;->a(Lb5/j;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lb5/j;->g:I

    .line 2
    .line 3
    return v0
.end method

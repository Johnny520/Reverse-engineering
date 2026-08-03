.class public final Ly2/u;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z


# direct methods
.method public constructor <init>(ZLy2/d0;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Ly2/u;->a:Z

    .line 5
    .line 6
    iput-boolean p3, p0, Ly2/u;->b:Z

    .line 7
    .line 8
    iput-boolean p4, p0, Ly2/u;->c:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Ly2/u;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Ly2/u;

    .line 10
    .line 11
    iget-boolean v0, p1, Ly2/u;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p0, Ly2/u;->a:Z

    .line 14
    .line 15
    if-eq v1, v0, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-boolean v0, p0, Ly2/u;->b:Z

    .line 19
    .line 20
    iget-boolean v1, p1, Ly2/u;->b:Z

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-boolean v0, p0, Ly2/u;->c:Z

    .line 26
    .line 27
    iget-boolean p1, p1, Ly2/u;->c:Z

    .line 28
    .line 29
    if-eq v0, p1, :cond_4

    .line 30
    .line 31
    :goto_0
    const/4 p1, 0x0

    .line 32
    return p1

    .line 33
    :cond_4
    :goto_1
    const/4 p1, 0x1

    .line 34
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Ly2/u;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sget-object v2, Ly2/d0;->g:Ly2/d0;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    add-int/2addr v2, v0

    .line 22
    mul-int/2addr v2, v1

    .line 23
    iget-boolean v0, p0, Ly2/u;->b:Z

    .line 24
    .line 25
    invoke-static {v2, v1, v0}, Leh/a;->h(IIZ)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-boolean v2, p0, Ly2/u;->c:Z

    .line 30
    .line 31
    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    add-int/2addr v2, v0

    .line 36
    mul-int/2addr v2, v1

    .line 37
    add-int/lit8 v2, v2, 0x2

    .line 38
    .line 39
    mul-int/2addr v2, v1

    .line 40
    return v2
.end method

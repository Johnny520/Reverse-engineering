.class public final Lia/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lia/b;->a:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p2, p0, Lia/b;->b:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p3, p0, Lia/b;->c:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p4, p0, Lia/b;->d:Ljava/lang/String;

    .line 20
    .line 21
    iput-wide p5, p0, Lia/b;->e:J

    .line 22
    .line 23
    return-void
.end method

.method public static a(Lia/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)Lia/b;
    .locals 2

    .line 1
    move-object v0, p1

    .line 2
    iget-object p1, p0, Lia/b;->a:Ljava/lang/String;

    .line 3
    .line 4
    and-int/lit8 v1, p6, 0x2

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lia/b;->b:Ljava/lang/String;

    .line 9
    .line 10
    :cond_0
    and-int/lit8 v1, p6, 0x4

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-object p2, p0, Lia/b;->c:Ljava/lang/String;

    .line 15
    .line 16
    :cond_1
    and-int/lit8 v1, p6, 0x8

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    iget-object p3, p0, Lia/b;->d:Ljava/lang/String;

    .line 21
    .line 22
    :cond_2
    and-int/lit8 p6, p6, 0x10

    .line 23
    .line 24
    if-eqz p6, :cond_3

    .line 25
    .line 26
    iget-wide p4, p0, Lia/b;->e:J

    .line 27
    .line 28
    :cond_3
    move-wide p5, p4

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance p0, Lia/b;

    .line 42
    .line 43
    move-object p4, p3

    .line 44
    move-object p3, p2

    .line 45
    move-object p2, v0

    .line 46
    invoke-direct/range {p0 .. p6}, Lia/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 47
    .line 48
    .line 49
    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lia/b;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lia/b;

    .line 10
    .line 11
    iget-object v0, p0, Lia/b;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, Lia/b;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, Lia/b;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, Lia/b;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, Lia/b;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, Lia/b;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-object v0, p0, Lia/b;->d:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v1, p1, Lia/b;->d:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-wide v0, p0, Lia/b;->e:J

    .line 56
    .line 57
    iget-wide v2, p1, Lia/b;->e:J

    .line 58
    .line 59
    cmp-long p1, v0, v2

    .line 60
    .line 61
    if-eqz p1, :cond_6

    .line 62
    .line 63
    :goto_0
    const/4 p1, 0x0

    .line 64
    return p1

    .line 65
    :cond_6
    :goto_1
    const/4 p1, 0x1

    .line 66
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lia/b;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, Lia/b;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lia/b;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lia/b;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v1, p0, Lia/b;->e:J

    .line 29
    .line 30
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-int/2addr v1, v0

    .line 35
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", authorWxId="

    .line 2
    .line 3
    const-string v1, ", authorDisplayName="

    .line 4
    .line 5
    const-string v2, "FakeSnsComment(id="

    .line 6
    .line 7
    iget-object v3, p0, Lia/b;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lia/b;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", content="

    .line 16
    .line 17
    const-string v2, ", createTimeMillis="

    .line 18
    .line 19
    iget-object v3, p0, Lia/b;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, Lia/b;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ")"

    .line 27
    .line 28
    iget-wide v2, p0, Lia/b;->e:J

    .line 29
    .line 30
    invoke-static {v0, v2, v3, v1}, Leh/a;->p(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
.end method

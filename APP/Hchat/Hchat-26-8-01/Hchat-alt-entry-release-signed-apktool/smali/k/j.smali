.class public final Lk/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk/l1;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lu2/c;

.field public final c:J

.field public final d:Lp/x0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lu2/c;JLp/x0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk/j;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lk/j;->b:Lu2/c;

    .line 7
    .line 8
    iput-wide p3, p0, Lk/j;->c:J

    .line 9
    .line 10
    iput-object p5, p0, Lk/j;->d:Lp/x0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Lk/k1;
    .locals 6

    .line 1
    new-instance v0, Lk/i;

    .line 2
    .line 3
    iget-wide v3, p0, Lk/j;->c:J

    .line 4
    .line 5
    iget-object v5, p0, Lk/j;->d:Lp/x0;

    .line 6
    .line 7
    iget-object v1, p0, Lk/j;->a:Landroid/content/Context;

    .line 8
    .line 9
    iget-object v2, p0, Lk/j;->b:Lu2/c;

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lk/i;-><init>(Landroid/content/Context;Lu2/c;JLp/x0;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v1, 0x0

    .line 13
    :goto_0
    const-class v2, Lk/j;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    return v2

    .line 23
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast p1, Lk/j;

    .line 27
    .line 28
    iget-object v1, p0, Lk/j;->a:Landroid/content/Context;

    .line 29
    .line 30
    iget-object v3, p1, Lk/j;->a:Landroid/content/Context;

    .line 31
    .line 32
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    return v2

    .line 39
    :cond_3
    iget-object v1, p0, Lk/j;->b:Lu2/c;

    .line 40
    .line 41
    iget-object v3, p1, Lk/j;->b:Lu2/c;

    .line 42
    .line 43
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_4

    .line 48
    .line 49
    return v2

    .line 50
    :cond_4
    iget-wide v3, p0, Lk/j;->c:J

    .line 51
    .line 52
    iget-wide v5, p1, Lk/j;->c:J

    .line 53
    .line 54
    invoke-static {v3, v4, v5, v6}, Lf1/w;->c(JJ)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_5

    .line 59
    .line 60
    return v2

    .line 61
    :cond_5
    iget-object v1, p0, Lk/j;->d:Lp/x0;

    .line 62
    .line 63
    iget-object p1, p1, Lk/j;->d:Lp/x0;

    .line 64
    .line 65
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-nez p1, :cond_6

    .line 70
    .line 71
    return v2

    .line 72
    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lk/j;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, Lk/j;->b:Lu2/c;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    sget v0, Lf1/w;->h:I

    .line 19
    .line 20
    iget-wide v3, p0, Lk/j;->c:J

    .line 21
    .line 22
    invoke-static {v2, v1, v3, v4}, Leh/a;->f(IIJ)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p0, Lk/j;->d:Lp/x0;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    add-int/2addr v1, v0

    .line 33
    return v1
.end method

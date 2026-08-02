.class public final Lch;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final Companion:Lbh;

.field public static final g:[Lj71;


# instance fields
.field public final a:J

.field public final b:I

.field public final c:Z

.field public final d:Ljava/util/Set;

.field public final e:Ljava/util/Set;

.field public final f:Lfh;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lbh;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lch;->Companion:Lbh;

    .line 7
    .line 8
    new-instance v0, Lc0;

    .line 9
    .line 10
    const/4 v1, 0x6

    .line 11
    invoke-direct {v0, v1}, Lc0;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sget-object v2, Li91;->h:Li91;

    .line 15
    .line 16
    invoke-static {v2, v0}, Lp7;->B(Li91;Lxm0;)Lj71;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v3, Lc0;

    .line 21
    .line 22
    const/4 v4, 0x7

    .line 23
    invoke-direct {v3, v4}, Lc0;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, Lp7;->B(Li91;Lxm0;)Lj71;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    new-array v1, v1, [Lj71;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x0

    .line 34
    aput-object v4, v1, v3

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    aput-object v4, v1, v3

    .line 38
    .line 39
    const/4 v3, 0x2

    .line 40
    aput-object v4, v1, v3

    .line 41
    .line 42
    const/4 v3, 0x3

    .line 43
    aput-object v0, v1, v3

    .line 44
    .line 45
    const/4 v0, 0x4

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    const/4 v0, 0x5

    .line 49
    aput-object v4, v1, v0

    .line 50
    .line 51
    sput-object v1, Lch;->g:[Lj71;

    .line 52
    .line 53
    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 8

    .line 74
    new-instance v7, Lfh;

    invoke-direct {v7}, Lfh;-><init>()V

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 75
    sget-object v5, Lfe0;->h:Lfe0;

    move-object v6, v5

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lch;-><init>(JIZLjava/util/Set;Ljava/util/Set;Lfh;)V

    return-void
.end method

.method public synthetic constructor <init>(IJIZLjava/util/Set;Ljava/util/Set;Lfh;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p1, 0x1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-wide/16 p2, 0x0

    .line 9
    .line 10
    :cond_0
    iput-wide p2, p0, Lch;->a:J

    .line 11
    .line 12
    and-int/lit8 p2, p1, 0x2

    .line 13
    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    iput p2, p0, Lch;->b:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iput p4, p0, Lch;->b:I

    .line 21
    .line 22
    :goto_0
    and-int/lit8 p2, p1, 0x4

    .line 23
    .line 24
    if-nez p2, :cond_2

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    iput-boolean p2, p0, Lch;->c:Z

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    iput-boolean p5, p0, Lch;->c:Z

    .line 31
    .line 32
    :goto_1
    and-int/lit8 p2, p1, 0x8

    .line 33
    .line 34
    sget-object p3, Lfe0;->h:Lfe0;

    .line 35
    .line 36
    if-nez p2, :cond_3

    .line 37
    .line 38
    iput-object p3, p0, Lch;->d:Ljava/util/Set;

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_3
    iput-object p6, p0, Lch;->d:Ljava/util/Set;

    .line 42
    .line 43
    :goto_2
    and-int/lit8 p2, p1, 0x10

    .line 44
    .line 45
    if-nez p2, :cond_4

    .line 46
    .line 47
    iput-object p3, p0, Lch;->e:Ljava/util/Set;

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_4
    iput-object p7, p0, Lch;->e:Ljava/util/Set;

    .line 51
    .line 52
    :goto_3
    and-int/lit8 p1, p1, 0x20

    .line 53
    .line 54
    if-nez p1, :cond_5

    .line 55
    .line 56
    new-instance p1, Lfh;

    .line 57
    .line 58
    invoke-direct {p1}, Lfh;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lch;->f:Lfh;

    .line 62
    .line 63
    return-void

    .line 64
    :cond_5
    iput-object p8, p0, Lch;->f:Lfh;

    .line 65
    .line 66
    return-void
.end method

.method public constructor <init>(JIZLjava/util/Set;Ljava/util/Set;Lfh;)V
    .locals 0

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-wide p1, p0, Lch;->a:J

    .line 69
    iput p3, p0, Lch;->b:I

    .line 70
    iput-boolean p4, p0, Lch;->c:Z

    .line 71
    iput-object p5, p0, Lch;->d:Ljava/util/Set;

    .line 72
    iput-object p6, p0, Lch;->e:Ljava/util/Set;

    .line 73
    iput-object p7, p0, Lch;->f:Lfh;

    return-void
.end method


# virtual methods
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
    instance-of v1, p1, Lch;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lch;

    .line 12
    .line 13
    iget-wide v3, p0, Lch;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, Lch;->a:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget v1, p0, Lch;->b:I

    .line 23
    .line 24
    iget v3, p1, Lch;->b:I

    .line 25
    .line 26
    if-eq v1, v3, :cond_3

    .line 27
    .line 28
    return v2

    .line 29
    :cond_3
    iget-boolean v1, p0, Lch;->c:Z

    .line 30
    .line 31
    iget-boolean v3, p1, Lch;->c:Z

    .line 32
    .line 33
    if-eq v1, v3, :cond_4

    .line 34
    .line 35
    return v2

    .line 36
    :cond_4
    iget-object v1, p0, Lch;->d:Ljava/util/Set;

    .line 37
    .line 38
    iget-object v3, p1, Lch;->d:Ljava/util/Set;

    .line 39
    .line 40
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_5

    .line 45
    .line 46
    return v2

    .line 47
    :cond_5
    iget-object v1, p0, Lch;->e:Ljava/util/Set;

    .line 48
    .line 49
    iget-object v3, p1, Lch;->e:Ljava/util/Set;

    .line 50
    .line 51
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_6

    .line 56
    .line 57
    return v2

    .line 58
    :cond_6
    iget-object p0, p0, Lch;->f:Lfh;

    .line 59
    .line 60
    iget-object p1, p1, Lch;->f:Lfh;

    .line 61
    .line 62
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_7

    .line 67
    .line 68
    return v2

    .line 69
    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, Lch;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

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
    iget v2, p0, Lch;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lvi0;->d(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lch;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lhk1;->d(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lch;->d:Ljava/util/Set;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object v0, p0, Lch;->e:Ljava/util/Set;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    add-int/2addr v0, v2

    .line 37
    mul-int/2addr v0, v1

    .line 38
    iget-object p0, p0, Lch;->f:Lfh;

    .line 39
    .line 40
    invoke-virtual {p0}, Lfh;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    add-int/2addr p0, v0

    .line 45
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AutoReceiveRedPacketConf(waitTime="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Lch;->a:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", receiveMode="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lch;->b:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", useWhitelist="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-boolean v1, p0, Lch;->c:Z

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", whitelist="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lch;->d:Ljava/util/Set;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", blacklist="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lch;->e:Ljava/util/Set;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", autoReplyConf="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, Lch;->f:Lfh;

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p0, ")"

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method

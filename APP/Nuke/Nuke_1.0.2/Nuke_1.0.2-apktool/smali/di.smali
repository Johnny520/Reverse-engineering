.class public final Ldi;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final Companion:Lci;

.field public static final f:[Lj71;


# instance fields
.field public final a:J

.field public final b:Z

.field public final c:Ljava/util/Set;

.field public final d:Ljava/util/Set;

.field public final e:Lgi;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lci;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldi;->Companion:Lci;

    .line 7
    .line 8
    new-instance v0, Lc0;

    .line 9
    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lc0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Li91;->h:Li91;

    .line 16
    .line 17
    invoke-static {v1, v0}, Lp7;->B(Li91;Lxm0;)Lj71;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v2, Lc0;

    .line 22
    .line 23
    const/16 v3, 0xa

    .line 24
    .line 25
    invoke-direct {v2, v3}, Lc0;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v2}, Lp7;->B(Li91;Lxm0;)Lj71;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x5

    .line 33
    new-array v2, v2, [Lj71;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    aput-object v4, v2, v3

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    aput-object v4, v2, v3

    .line 41
    .line 42
    const/4 v3, 0x2

    .line 43
    aput-object v0, v2, v3

    .line 44
    .line 45
    const/4 v0, 0x3

    .line 46
    aput-object v1, v2, v0

    .line 47
    .line 48
    const/4 v0, 0x4

    .line 49
    aput-object v4, v2, v0

    .line 50
    .line 51
    sput-object v2, Ldi;->f:[Lj71;

    .line 52
    .line 53
    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 7

    .line 63
    new-instance v6, Lgi;

    invoke-direct {v6}, Lgi;-><init>()V

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    .line 64
    sget-object v4, Lfe0;->h:Lfe0;

    move-object v5, v4

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Ldi;-><init>(JZLjava/util/Set;Ljava/util/Set;Lgi;)V

    return-void
.end method

.method public synthetic constructor <init>(IJZLjava/util/Set;Ljava/util/Set;Lgi;)V
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
    iput-wide p2, p0, Ldi;->a:J

    .line 11
    .line 12
    and-int/lit8 p2, p1, 0x2

    .line 13
    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    iput-boolean p2, p0, Ldi;->b:Z

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iput-boolean p4, p0, Ldi;->b:Z

    .line 21
    .line 22
    :goto_0
    and-int/lit8 p2, p1, 0x4

    .line 23
    .line 24
    sget-object p3, Lfe0;->h:Lfe0;

    .line 25
    .line 26
    if-nez p2, :cond_2

    .line 27
    .line 28
    iput-object p3, p0, Ldi;->c:Ljava/util/Set;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    iput-object p5, p0, Ldi;->c:Ljava/util/Set;

    .line 32
    .line 33
    :goto_1
    and-int/lit8 p2, p1, 0x8

    .line 34
    .line 35
    if-nez p2, :cond_3

    .line 36
    .line 37
    iput-object p3, p0, Ldi;->d:Ljava/util/Set;

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    iput-object p6, p0, Ldi;->d:Ljava/util/Set;

    .line 41
    .line 42
    :goto_2
    and-int/lit8 p1, p1, 0x10

    .line 43
    .line 44
    if-nez p1, :cond_4

    .line 45
    .line 46
    new-instance p1, Lgi;

    .line 47
    .line 48
    invoke-direct {p1}, Lgi;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Ldi;->e:Lgi;

    .line 52
    .line 53
    return-void

    .line 54
    :cond_4
    iput-object p7, p0, Ldi;->e:Lgi;

    .line 55
    .line 56
    return-void
.end method

.method public constructor <init>(JZLjava/util/Set;Ljava/util/Set;Lgi;)V
    .locals 0

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-wide p1, p0, Ldi;->a:J

    .line 59
    iput-boolean p3, p0, Ldi;->b:Z

    .line 60
    iput-object p4, p0, Ldi;->c:Ljava/util/Set;

    .line 61
    iput-object p5, p0, Ldi;->d:Ljava/util/Set;

    .line 62
    iput-object p6, p0, Ldi;->e:Lgi;

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
    instance-of v1, p1, Ldi;

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
    check-cast p1, Ldi;

    .line 12
    .line 13
    iget-wide v3, p0, Ldi;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, Ldi;->a:J

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
    iget-boolean v1, p0, Ldi;->b:Z

    .line 23
    .line 24
    iget-boolean v3, p1, Ldi;->b:Z

    .line 25
    .line 26
    if-eq v1, v3, :cond_3

    .line 27
    .line 28
    return v2

    .line 29
    :cond_3
    iget-object v1, p0, Ldi;->c:Ljava/util/Set;

    .line 30
    .line 31
    iget-object v3, p1, Ldi;->c:Ljava/util/Set;

    .line 32
    .line 33
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    iget-object v1, p0, Ldi;->d:Ljava/util/Set;

    .line 41
    .line 42
    iget-object v3, p1, Ldi;->d:Ljava/util/Set;

    .line 43
    .line 44
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_5

    .line 49
    .line 50
    return v2

    .line 51
    :cond_5
    iget-object p0, p0, Ldi;->e:Lgi;

    .line 52
    .line 53
    iget-object p1, p1, Ldi;->e:Lgi;

    .line 54
    .line 55
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_6

    .line 60
    .line 61
    return v2

    .line 62
    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, Ldi;->a:J

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
    iget-boolean v2, p0, Ldi;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lhk1;->d(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Ldi;->c:Ljava/util/Set;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-object v0, p0, Ldi;->d:Ljava/util/Set;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/2addr v0, v2

    .line 31
    mul-int/2addr v0, v1

    .line 32
    iget-object p0, p0, Ldi;->e:Lgi;

    .line 33
    .line 34
    invoke-virtual {p0}, Lgi;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    add-int/2addr p0, v0

    .line 39
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AutoReceiveTransferMoneyConf(waitTime="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Ldi;->a:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", useWhitelist="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Ldi;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", whitelist="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Ldi;->c:Ljava/util/Set;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", blacklist="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Ldi;->d:Ljava/util/Set;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", autoReplyConf="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Ldi;->e:Lgi;

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, ")"

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

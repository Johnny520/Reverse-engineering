.class public final Lux$α;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lux;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u03b1"
.end annotation


# static fields
.field public static final η:I


# instance fields
.field private final α:J

.field private final β:Ljava/lang/String;

.field private final γ:Ljava/lang/String;

.field private final δ:Ljava/lang/String;

.field private final ε:Ljava/lang/String;

.field private final ζ:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-wide p1, p0, Lux$α;->α:J

    .line 20
    .line 21
    iput-object p3, p0, Lux$α;->β:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p4, p0, Lux$α;->γ:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p5, p0, Lux$α;->δ:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p6, p0, Lux$α;->ε:Ljava/lang/String;

    .line 28
    .line 29
    iput-object p7, p0, Lux$α;->ζ:Ljava/lang/String;

    .line 30
    .line 31
    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILzq;)V
    .locals 9

    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_0

    .line 32
    const-string v0, ""

    move-object v8, v0

    :goto_0
    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    goto :goto_1

    :cond_0
    move-object/from16 v8, p7

    goto :goto_0

    .line 33
    :goto_1
    invoke-direct/range {v1 .. v8}, Lux$α;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic θ(Lux$α;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lux$α;
    .locals 8

    .line 1
    and-int/lit8 v0, p8, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide p1, p0, Lux$α;->α:J

    .line 6
    .line 7
    :cond_0
    move-wide v1, p1

    .line 8
    and-int/lit8 p1, p8, 0x2

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p3, p0, Lux$α;->β:Ljava/lang/String;

    .line 13
    .line 14
    :cond_1
    move-object v3, p3

    .line 15
    and-int/lit8 p1, p8, 0x4

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    iget-object p4, p0, Lux$α;->γ:Ljava/lang/String;

    .line 20
    .line 21
    :cond_2
    move-object v4, p4

    .line 22
    and-int/lit8 p1, p8, 0x8

    .line 23
    .line 24
    if-eqz p1, :cond_3

    .line 25
    .line 26
    iget-object p5, p0, Lux$α;->δ:Ljava/lang/String;

    .line 27
    .line 28
    :cond_3
    move-object v5, p5

    .line 29
    and-int/lit8 p1, p8, 0x10

    .line 30
    .line 31
    if-eqz p1, :cond_4

    .line 32
    .line 33
    iget-object p6, p0, Lux$α;->ε:Ljava/lang/String;

    .line 34
    .line 35
    :cond_4
    move-object v6, p6

    .line 36
    and-int/lit8 p1, p8, 0x20

    .line 37
    .line 38
    if-eqz p1, :cond_5

    .line 39
    .line 40
    iget-object p7, p0, Lux$α;->ζ:Ljava/lang/String;

    .line 41
    .line 42
    :cond_5
    move-object v0, p0

    .line 43
    move-object v7, p7

    .line 44
    invoke-virtual/range {v0 .. v7}, Lux$α;->η(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lux$α;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
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
    instance-of v1, p1, Lux$α;

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
    check-cast p1, Lux$α;

    .line 12
    .line 13
    iget-wide v3, p0, Lux$α;->α:J

    .line 14
    .line 15
    iget-wide v5, p1, Lux$α;->α:J

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
    iget-object v1, p0, Lux$α;->β:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, p1, Lux$α;->β:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-object v1, p0, Lux$α;->γ:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v3, p1, Lux$α;->γ:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_4

    .line 42
    .line 43
    return v2

    .line 44
    :cond_4
    iget-object v1, p0, Lux$α;->δ:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v3, p1, Lux$α;->δ:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_5

    .line 53
    .line 54
    return v2

    .line 55
    :cond_5
    iget-object v1, p0, Lux$α;->ε:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v3, p1, Lux$α;->ε:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_6

    .line 64
    .line 65
    return v2

    .line 66
    :cond_6
    iget-object p0, p0, Lux$α;->ζ:Ljava/lang/String;

    .line 67
    .line 68
    iget-object p1, p1, Lux$α;->ζ:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-nez p0, :cond_7

    .line 75
    .line 76
    return v2

    .line 77
    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, Lux$α;->α:J

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
    iget-object v2, p0, Lux$α;->β:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lux$α;->γ:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lux$α;->δ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lux$α;->ε:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object p0, p0, Lux$α;->ζ:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v0

    .line 41
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-wide v0, p0, Lux$α;->α:J

    .line 2
    .line 3
    iget-object v2, p0, Lux$α;->β:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v3, p0, Lux$α;->γ:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v4, p0, Lux$α;->δ:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v5, p0, Lux$α;->ε:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p0, p0, Lux$α;->ζ:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v6, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v7, "Entry(timeMillis="

    .line 16
    .line 17
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, ", threadName="

    .line 24
    .line 25
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v0, ", level="

    .line 32
    .line 33
    const-string v1, ", tag="

    .line 34
    .line 35
    invoke-static {v6, v0, v3, v1, v4}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v0, ", message="

    .line 39
    .line 40
    const-string v1, ", throwableText="

    .line 41
    .line 42
    invoke-static {v6, v0, v5, v1, p0}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string p0, ")"

    .line 46
    .line 47
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public final α()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lux$α;->α:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final β()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lux$α;->β:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final γ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lux$α;->γ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final δ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lux$α;->δ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ε()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lux$α;->ε:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ζ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lux$α;->ζ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final η(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lux$α;
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p0, Lux$α;

    .line 17
    .line 18
    invoke-direct/range {p0 .. p7}, Lux$α;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public final ι()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lux$α;->γ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final κ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lux$α;->ε:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final λ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lux$α;->δ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final μ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lux$α;->β:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ν()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lux$α;->ζ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ξ()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lux$α;->α:J

    .line 2
    .line 3
    return-wide v0
.end method

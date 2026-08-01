.class public final Lnd2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:J

.field public final γ:Ljava/lang/String;

.field public final δ:Ljava/lang/String;

.field public final ε:J

.field public final ζ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnd2;->α:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lnd2;->β:J

    .line 7
    .line 8
    iput-object p4, p0, Lnd2;->γ:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, Lnd2;->δ:Ljava/lang/String;

    .line 11
    .line 12
    iput-wide p6, p0, Lnd2;->ε:J

    .line 13
    .line 14
    iput-object p8, p0, Lnd2;->ζ:Ljava/lang/String;

    .line 15
    .line 16
    return-void
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
    instance-of v0, p1, Lnd2;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lnd2;

    .line 10
    .line 11
    iget-object v0, p0, Lnd2;->α:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, Lnd2;->α:Ljava/lang/String;

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
    iget-wide v0, p0, Lnd2;->β:J

    .line 23
    .line 24
    iget-wide v2, p1, Lnd2;->β:J

    .line 25
    .line 26
    cmp-long v0, v0, v2

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget-object v0, p0, Lnd2;->γ:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v1, p1, Lnd2;->γ:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    iget-object v0, p0, Lnd2;->δ:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v1, p1, Lnd2;->δ:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_5
    iget-wide v0, p0, Lnd2;->ε:J

    .line 54
    .line 55
    iget-wide v2, p1, Lnd2;->ε:J

    .line 56
    .line 57
    cmp-long v0, v0, v2

    .line 58
    .line 59
    if-eqz v0, :cond_6

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_6
    iget-object p0, p0, Lnd2;->ζ:Ljava/lang/String;

    .line 63
    .line 64
    iget-object p1, p1, Lnd2;->ζ:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_7

    .line 71
    .line 72
    :goto_0
    const/4 p0, 0x0

    .line 73
    return p0

    .line 74
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 75
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lnd2;->α:Ljava/lang/String;

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
    iget-wide v2, p0, Lnd2;->β:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lnd2;->γ:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lnd2;->δ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v2, p0, Lnd2;->ε:J

    .line 29
    .line 30
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const-wide/16 v2, 0x3c

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object p0, p0, Lnd2;->ζ:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    add-int/2addr p0, v0

    .line 47
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "XhsDexKitMeta(hostPackageName="

    .line 2
    .line 3
    const-string v1, ", hostVersionCode="

    .line 4
    .line 5
    iget-object v2, p0, Lnd2;->α:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v3, p0, Lnd2;->β:J

    .line 8
    .line 9
    invoke-static {v0, v2, v3, v4, v1}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", hostVersionName="

    .line 14
    .line 15
    const-string v2, ", hostApkPath="

    .line 16
    .line 17
    iget-object v3, p0, Lnd2;->γ:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v4, p0, Lnd2;->δ:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0, v1, v3, v2, v4}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, ", hostLastUpdateTime="

    .line 25
    .line 26
    const-string v2, ", moduleVersionCode=60, moduleVersionName="

    .line 27
    .line 28
    iget-wide v3, p0, Lnd2;->ε:J

    .line 29
    .line 30
    invoke-static {v0, v1, v3, v4, v2}, Lnx;->Β(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v1, ")"

    .line 34
    .line 35
    iget-object p0, p0, Lnd2;->ζ:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, p0, v1}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

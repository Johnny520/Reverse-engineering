.class public final Lpx;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:J

.field public final γ:Ljava/lang/String;

.field public final δ:Ljava/lang/String;

.field public final ε:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpx;->α:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lpx;->β:J

    .line 7
    .line 8
    iput-object p4, p0, Lpx;->γ:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, Lpx;->δ:Ljava/lang/String;

    .line 11
    .line 12
    iput-wide p6, p0, Lpx;->ε:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    if-eqz p1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const/4 v0, 0x0

    .line 12
    :goto_0
    const-class v1, Lpx;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p1, Lpx;

    .line 25
    .line 26
    iget-object v0, p0, Lpx;->α:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, p1, Lpx;->α:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    iget-wide v0, p0, Lpx;->β:J

    .line 38
    .line 39
    iget-wide v2, p1, Lpx;->β:J

    .line 40
    .line 41
    cmp-long v0, v0, v2

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_4
    iget-object p0, p0, Lpx;->γ:Ljava/lang/String;

    .line 47
    .line 48
    iget-object p1, p1, Lpx;->γ:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-nez p0, :cond_5

    .line 55
    .line 56
    :goto_1
    const/4 p0, 0x0

    .line 57
    return p0

    .line 58
    :cond_5
    :goto_2
    const/4 p0, 0x1

    .line 59
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lpx;->α:Ljava/lang/String;

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
    iget-wide v2, p0, Lpx;->β:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object p0, p0, Lpx;->γ:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, p0}, La12;->β(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    const-wide/16 v2, 0x3c

    .line 23
    .line 24
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/2addr v0, p0

    .line 29
    mul-int/2addr v0, v1

    .line 30
    const p0, 0x563e05bb

    .line 31
    .line 32
    .line 33
    add-int/2addr v0, p0

    .line 34
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "DyDexKitMeta(hostPackageName="

    .line 2
    .line 3
    const-string v1, ", hostVersionCode="

    .line 4
    .line 5
    iget-object v2, p0, Lpx;->α:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v3, p0, Lpx;->β:J

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
    const-string v2, ", hostSourceDir="

    .line 16
    .line 17
    iget-object v3, p0, Lpx;->γ:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v4, p0, Lpx;->δ:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0, v1, v3, v2, v4}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, ", hostLastUpdateTime="

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-wide v1, p0, Lpx;->ε:J

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, ", moduleVersionCode=60, moduleVersionName=1.4.15)"

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

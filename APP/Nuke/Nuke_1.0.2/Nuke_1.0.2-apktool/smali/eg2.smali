.class public final Leg2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of p0, p1, Leg2;

    .line 6
    .line 7
    if-nez p0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/16 p0, 0x200

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/16 v0, 0x1f

    .line 8
    .line 9
    mul-int/2addr p0, v0

    .line 10
    const/high16 v1, 0x200000

    .line 11
    .line 12
    invoke-static {v1, p0, v0}, Lvi0;->d(III)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    const/high16 v1, 0x1000000

    .line 17
    .line 18
    const/16 v2, 0x745f

    .line 19
    .line 20
    invoke-static {v1, p0, v2}, Lvi0;->d(III)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-static {p0, v0, v1}, Lhk1;->d(IIZ)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    add-int/2addr v0, p0

    .line 34
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "ScriptEngineOptions(maxFileCount=512, maxFileBytes=2097152, maxTotalScriptBytes=16777216, memoryLimitBytes=null, maxStackSizeBytes=null, callActivateOnStart=true, callDeactivateOnStop=true)"

    .line 2
    .line 3
    return-object p0
.end method

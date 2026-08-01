.class public final Loo;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:Z

.field public β:Z

.field public γ:Ljava/lang/Object;

.field public δ:Ljava/io/Serializable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Loo;->α:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public α()Lpo;
    .locals 4

    .line 1
    new-instance v0, Lpo;

    .line 2
    .line 3
    iget-boolean v1, p0, Loo;->α:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Loo;->β:Z

    .line 6
    .line 7
    iget-object v3, p0, Loo;->γ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, [Ljava/lang/String;

    .line 10
    .line 11
    iget-object p0, p0, Loo;->δ:Ljava/io/Serializable;

    .line 12
    .line 13
    check-cast p0, [Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3, p0}, Lpo;-><init>(ZZ[Ljava/lang/String;[Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public varargs β([Luf;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Loo;->α:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    array-length v1, p1

    .line 8
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    array-length v1, p1

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_0
    if-ge v3, v1, :cond_0

    .line 15
    .line 16
    aget-object v4, p1, v3

    .line 17
    .line 18
    iget-object v4, v4, Luf;->α:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-array p1, v2, [Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, [Ljava/lang/String;

    .line 33
    .line 34
    array-length v0, p1

    .line 35
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, [Ljava/lang/String;

    .line 40
    .line 41
    iget-boolean v0, p0, Loo;->α:Z

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    array-length v0, p1

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    array-length v0, p1

    .line 49
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, [Ljava/lang/String;

    .line 54
    .line 55
    iput-object p1, p0, Loo;->γ:Ljava/lang/Object;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const-string p0, "At least one cipher suite is required"

    .line 59
    .line 60
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    const-string p0, "no cipher suites for cleartext connections"

    .line 65
    .line 66
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    return-void

    .line 70
    :cond_3
    const-string p0, "no cipher suites for cleartext connections"

    .line 71
    .line 72
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public varargs γ([Lq42;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Loo;->α:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    array-length v1, p1

    .line 8
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    array-length v1, p1

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_0
    if-ge v3, v1, :cond_0

    .line 15
    .line 16
    aget-object v4, p1, v3

    .line 17
    .line 18
    iget-object v4, v4, Lq42;->ε:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-array p1, v2, [Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, [Ljava/lang/String;

    .line 33
    .line 34
    array-length v0, p1

    .line 35
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, [Ljava/lang/String;

    .line 40
    .line 41
    iget-boolean v0, p0, Loo;->α:Z

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    array-length v0, p1

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    array-length v0, p1

    .line 49
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, [Ljava/lang/String;

    .line 54
    .line 55
    iput-object p1, p0, Loo;->δ:Ljava/io/Serializable;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const-string p0, "At least one TLS version is required"

    .line 59
    .line 60
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    const-string p0, "no TLS versions for cleartext connections"

    .line 65
    .line 66
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    return-void

    .line 70
    :cond_3
    const-string p0, "no TLS versions for cleartext connections"

    .line 71
    .line 72
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

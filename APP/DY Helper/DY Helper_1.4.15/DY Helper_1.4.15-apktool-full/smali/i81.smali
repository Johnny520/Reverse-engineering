.class public abstract Li81;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static volatile α:Z


# direct methods
.method public static Α(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "\u8be5\u529f\u80fd\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528\uff0c\u8bf7\u5148\u5b8c\u6210\u5185\u6d4b\u9a8c\u8bc1"

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final Β(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p0, Leo1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p0, Leo1;

    .line 7
    .line 8
    iget-object p0, p0, Leo1;->ε:Ljava/lang/Throwable;

    .line 9
    .line 10
    throw p0
.end method

.method public static Γ(Ljava/lang/Object;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    instance-of v0, p0, Lorg/json/JSONObject;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lorg/json/JSONObject;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/util/Map;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    :try_start_0
    check-cast p0, Ljava/util/Map;

    .line 14
    .line 15
    new-instance v0, Lorg/json/JSONObject;

    .line 16
    .line 17
    invoke-static {p0}, Li81;->Δ(Ljava/util/Map;)Lzw0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    new-instance v0, Leo1;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    instance-of p0, v0, Leo1;

    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object v1, v0

    .line 37
    :goto_1
    check-cast v1, Lorg/json/JSONObject;

    .line 38
    .line 39
    goto :goto_4

    .line 40
    :cond_2
    instance-of v0, p0, Ljava/lang/String;

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    :try_start_1
    check-cast p0, Ljava/lang/String;

    .line 45
    .line 46
    new-instance v0, Lorg/json/JSONObject;

    .line 47
    .line 48
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :catchall_1
    move-exception p0

    .line 53
    new-instance v0, Leo1;

    .line 54
    .line 55
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :goto_2
    instance-of p0, v0, Leo1;

    .line 59
    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    move-object v1, v0

    .line 64
    :goto_3
    check-cast v1, Lorg/json/JSONObject;

    .line 65
    .line 66
    :cond_4
    :goto_4
    return-object v1
.end method

.method public static Δ(Ljava/util/Map;)Lzw0;
    .locals 3

    .line 1
    new-instance v0, Lzw0;

    .line 2
    .line 3
    invoke-direct {v0}, Lzw0;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/Map$Entry;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v0, v2, v1}, Lzw0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v0}, Lzw0;->β()Lzw0;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public static final α([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    add-int/lit8 v0, v0, 0x2

    .line 3
    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x6

    .line 8
    invoke-static {p0, v0, v1, p1, v2}, Lg7;->Π([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 9
    .line 10
    .line 11
    add-int/lit8 v1, p1, 0x2

    .line 12
    .line 13
    array-length v2, p0

    .line 14
    invoke-static {p0, v0, v1, p1, v2}, Lg7;->Ξ([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 15
    .line 16
    .line 17
    aput-object p2, v0, p1

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    aput-object p3, v0, p1

    .line 22
    .line 23
    return-object v0
.end method

.method public static final β(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    add-int/lit8 v0, v0, -0x2

    .line 3
    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x6

    .line 8
    invoke-static {p1, v0, v1, p0, v2}, Lg7;->Π([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 9
    .line 10
    .line 11
    add-int/lit8 v1, p0, 0x2

    .line 12
    .line 13
    array-length v2, p1

    .line 14
    invoke-static {p1, v0, p0, v1, v2}, Lg7;->Ξ([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static final γ(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    add-int/lit8 v0, v0, -0x1

    .line 3
    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x6

    .line 8
    invoke-static {p1, v0, v1, p0, v2}, Lg7;->Π([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 9
    .line 10
    .line 11
    add-int/lit8 v1, p0, 0x1

    .line 12
    .line 13
    array-length v2, p1

    .line 14
    invoke-static {p1, v0, p0, v1, v2}, Lg7;->Ξ([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static final δ(Lb21;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lb21;->ζ(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-eqz v1, :cond_1

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    iget-object v2, p0, Lb21;->γ:[Ljava/lang/Object;

    .line 15
    .line 16
    aget-object v2, v2, v0

    .line 17
    .line 18
    :goto_1
    if-nez v2, :cond_2

    .line 19
    .line 20
    goto :goto_3

    .line 21
    :cond_2
    instance-of v3, v2, Lc21;

    .line 22
    .line 23
    if-eqz v3, :cond_3

    .line 24
    .line 25
    move-object v3, v2

    .line 26
    check-cast v3, Lc21;

    .line 27
    .line 28
    invoke-virtual {v3, p2}, Lc21;->α(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_3
    if-eq v2, p2, :cond_4

    .line 33
    .line 34
    new-instance v3, Lc21;

    .line 35
    .line 36
    invoke-direct {v3}, Lc21;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v2}, Lc21;->α(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, p2}, Lc21;->α(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-object p2, v3

    .line 46
    goto :goto_3

    .line 47
    :cond_4
    :goto_2
    move-object p2, v2

    .line 48
    :goto_3
    if-eqz v1, :cond_5

    .line 49
    .line 50
    not-int v0, v0

    .line 51
    iget-object v1, p0, Lb21;->β:[Ljava/lang/Object;

    .line 52
    .line 53
    aput-object p1, v1, v0

    .line 54
    .line 55
    iget-object p0, p0, Lb21;->γ:[Ljava/lang/Object;

    .line 56
    .line 57
    aput-object p2, p0, v0

    .line 58
    .line 59
    return-void

    .line 60
    :cond_5
    iget-object p0, p0, Lb21;->γ:[Ljava/lang/Object;

    .line 61
    .line 62
    aput-object p2, p0, v0

    .line 63
    .line 64
    return-void
.end method

.method public static ε(Ljava/lang/StringBuilder;Ljava/lang/Object;La80;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-interface {p2, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/CharSequence;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    if-nez p1, :cond_1

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    instance-of p2, p1, Ljava/lang/CharSequence;

    .line 18
    .line 19
    :goto_0
    if-eqz p2, :cond_2

    .line 20
    .line 21
    check-cast p1, Ljava/lang/CharSequence;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_2
    instance-of p2, p1, Ljava/lang/Character;

    .line 28
    .line 29
    if-eqz p2, :cond_3

    .line 30
    .line 31
    check-cast p1, Ljava/lang/Character;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static final ζ(J[J)I
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    add-int/lit8 v0, v0, -0x1

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-gt v1, v0, :cond_2

    .line 6
    .line 7
    add-int v2, v1, v0

    .line 8
    .line 9
    ushr-int/lit8 v2, v2, 0x1

    .line 10
    .line 11
    aget-wide v3, p2, v2

    .line 12
    .line 13
    cmp-long v3, p0, v3

    .line 14
    .line 15
    if-lez v3, :cond_0

    .line 16
    .line 17
    add-int/lit8 v1, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-gez v3, :cond_1

    .line 21
    .line 22
    add-int/lit8 v0, v2, -0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return v2

    .line 26
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    neg-int p0, v1

    .line 29
    return p0
.end method

.method public static η(Lorg/json/JSONObject;Z)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p0}, Li81;->ο(ILjava/lang/Object;)Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const-string v2, "code"

    .line 7
    .line 8
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const/4 v4, -0x1

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const-string v2, "status_code"

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :cond_1
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    const/4 v3, 0x1

    .line 40
    if-ne p0, v3, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :cond_2
    if-eqz p1, :cond_3

    .line 48
    .line 49
    return v0

    .line 50
    :cond_3
    return v4
.end method

.method public static θ(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p0}, Li81;->ο(ILjava/lang/Object;)Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const-string v1, "message"

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "msg"

    .line 13
    .line 14
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-string v3, "status_msg"

    .line 19
    .line 20
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const-string v3, "status_message"

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    :goto_0
    filled-new-array {v1, v2, p0, v0}, [Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance v0, Lf71;

    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    invoke-direct {v0, v1}, Lf71;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0, v0}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Ljava/lang/String;

    .line 58
    .line 59
    return-object p0
.end method

.method public static ι()Lb21;
    .locals 1

    .line 1
    sget-object v0, Ltq1;->α:[J

    .line 2
    .line 3
    new-instance v0, Lb21;

    .line 4
    .line 5
    invoke-direct {v0}, Lb21;-><init>()V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static final κ(Ljava/lang/Throwable;)Leo1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Leo1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static λ(Landroid/app/Activity;Lky1;)Lrf1;
    .locals 3

    .line 1
    sget-object v0, Lry1;->Α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    sget-object p0, Lxn0;->χ:Lxn0;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-wide v1, p1, Lky1;->β:J

    .line 34
    .line 35
    invoke-virtual {p0, v0, v1, v2}, Lxn0;->Θ(Ljava/lang/ClassLoader;J)Lrf1;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object p1, p0, Lrf1;->α:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lgg1;

    .line 42
    .line 43
    invoke-virtual {p0}, Lrf1;->α()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    if-nez p1, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    iget v0, p1, Lgg1;->α:I

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    iget-object p1, p1, Lgg1;->β:Ljava/lang/String;

    .line 60
    .line 61
    if-nez p1, :cond_3

    .line 62
    .line 63
    const-string p1, ""

    .line 64
    .line 65
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v2, "\u4efb\u52a1\u5217\u8868\u4e1a\u52a1\u5931\u8d25 "

    .line 68
    .line 69
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v0, ": "

    .line 76
    .line 77
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    new-instance p1, Lrf1;

    .line 91
    .line 92
    const/4 v0, 0x0

    .line 93
    const/4 v1, 0x1

    .line 94
    invoke-direct {p1, v0, p0, v1}, Lrf1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;I)V

    .line 95
    .line 96
    .line 97
    return-object p1

    .line 98
    :cond_4
    :goto_1
    return-object p0
.end method

.method public static μ(Ljava/lang/ClassLoader;Lvc1;)Ljava/lang/Object;
    .locals 6

    .line 1
    :try_start_0
    const-string v0, "GET"

    .line 2
    .line 3
    const-string v1, "https://vassets-backend.douyin.com/gameplay/farm/get_farm_info"

    .line 4
    .line 5
    sget-object v2, Lkz;->ε:Lkz;

    .line 6
    .line 7
    invoke-static {p0, p1, v0, v1, v2}, Li81;->ω(Ljava/lang/ClassLoader;Lvc1;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lza1;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object p1, p0, Lza1;->γ:Lorg/json/JSONObject;

    .line 12
    .line 13
    invoke-static {p1}, Lxn0;->й(Lorg/json/JSONObject;)Lzd1;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    new-instance v0, Lab1;

    .line 18
    .line 19
    iget v1, p0, Lza1;->α:I

    .line 20
    .line 21
    iget-object v2, p0, Lza1;->β:Ljava/lang/Integer;

    .line 22
    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    :goto_0
    invoke-static {p1, p0}, Li81;->η(Lorg/json/JSONObject;Z)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-static {p1}, Li81;->θ(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-direct/range {v0 .. v5}, Lab1;-><init>(ILjava/lang/Integer;ILjava/lang/String;Lzd1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    move-object p0, v0

    .line 42
    new-instance p1, Leo1;

    .line 43
    .line 44
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    return-object p1
.end method

.method public static ν(Lce0;Ljava/lang/Object;)Lgk1;
    .locals 11

    .line 1
    iget-object v0, p0, Lce0;->κ:Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_9

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_0
    iget-object v2, p0, Lce0;->η:Ljava/lang/reflect/Field;

    .line 19
    .line 20
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    instance-of v3, v2, Ljava/util/List;

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    check-cast v2, Ljava/util/List;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v2, v1

    .line 32
    :goto_0
    if-nez v2, :cond_2

    .line 33
    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :cond_2
    invoke-static {v2}, Lvd0;->ε(Ljava/util/List;)Ltd0;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget-boolean v4, v3, Ltd0;->β:Z

    .line 41
    .line 42
    if-nez v4, :cond_3

    .line 43
    .line 44
    goto/16 :goto_3

    .line 45
    .line 46
    :cond_3
    iget-object v4, v3, Ltd0;->α:Ljava/util/ArrayList;

    .line 47
    .line 48
    iget-boolean v3, v3, Ltd0;->γ:Z

    .line 49
    .line 50
    if-nez v3, :cond_4

    .line 51
    .line 52
    goto/16 :goto_3

    .line 53
    .line 54
    :cond_4
    iget-object v3, p0, Lce0;->θ:Ljava/lang/reflect/Field;

    .line 55
    .line 56
    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v5, Ljava/util/ArrayList;

    .line 68
    .line 69
    array-length v6, v3

    .line 70
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 71
    .line 72
    .line 73
    array-length v6, v3

    .line 74
    const/4 v7, 0x0

    .line 75
    move v8, v7

    .line 76
    :goto_1
    if-ge v8, v6, :cond_8

    .line 77
    .line 78
    aget-object v9, v3, v8

    .line 79
    .line 80
    const-class v10, Ljava/util/List;

    .line 81
    .line 82
    invoke-virtual {v10, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-eqz v10, :cond_5

    .line 87
    .line 88
    new-instance v9, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v9, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 95
    .line 96
    invoke-static {v9, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    if-eqz v10, :cond_6

    .line 101
    .line 102
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    goto :goto_2

    .line 107
    :cond_6
    iget-object v10, p0, Lce0;->ι:Ljava/lang/reflect/Field;

    .line 108
    .line 109
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    invoke-static {v9, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-eqz v10, :cond_7

    .line 118
    .line 119
    move-object v9, v1

    .line 120
    :goto_2
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    add-int/lit8 v8, v8, 0x1

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_7
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    const-string p1, "\u5feb\u6377\u5206\u4eab\u72b6\u6001\u6784\u9020\u53c2\u6570\u7ed3\u6784\u5df2\u53d8\u5316: "

    .line 131
    .line 132
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const/4 p0, 0x0

    .line 140
    return-object p0

    .line 141
    :cond_8
    new-array p0, v7, [Ljava/io/Serializable;

    .line 142
    .line 143
    invoke-virtual {v5, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    check-cast p0, [Ljava/io/Serializable;

    .line 148
    .line 149
    array-length p1, p0

    .line 150
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    new-instance p1, Lgk1;

    .line 159
    .line 160
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    invoke-direct {p1, v0, v1, p0}, Lgk1;-><init>(IILjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    return-object p1

    .line 175
    :cond_9
    :goto_3
    return-object v1
.end method

.method public static final ξ(ILjava/lang/Object;)Ljava/lang/Boolean;
    .locals 4

    .line 1
    if-eqz p1, :cond_9

    .line 2
    .line 3
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 4
    .line 5
    if-eq p1, v0, :cond_9

    .line 6
    .line 7
    const/4 v0, 0x5

    .line 8
    if-le p0, v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_1

    .line 11
    .line 12
    :cond_0
    instance-of v0, p1, Lorg/json/JSONObject;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_8

    .line 16
    .line 17
    move-object v0, p1

    .line 18
    check-cast v0, Lorg/json/JSONObject;

    .line 19
    .line 20
    const-string v2, "success"

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    instance-of v3, v2, Ljava/lang/Boolean;

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    check-cast v2, Ljava/lang/Boolean;

    .line 31
    .line 32
    return-object v2

    .line 33
    :cond_1
    instance-of v3, v2, Ljava/lang/Number;

    .line 34
    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    check-cast v2, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_3
    instance-of v1, v2, Ljava/lang/String;

    .line 52
    .line 53
    if-eqz v1, :cond_7

    .line 54
    .line 55
    const-string p0, "1"

    .line 56
    .line 57
    invoke-virtual {v2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-nez p0, :cond_6

    .line 62
    .line 63
    move-object p0, v2

    .line 64
    check-cast p0, Ljava/lang/String;

    .line 65
    .line 66
    const-string p1, "true"

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_4

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    const-string p1, "0"

    .line 76
    .line 77
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-nez p1, :cond_5

    .line 82
    .line 83
    const-string p1, "false"

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-eqz p0, :cond_9

    .line 90
    .line 91
    :cond_5
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_6
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_7
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Lus1;->τ(Ljava/util/Iterator;)Lss1;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    new-instance v1, Lya1;

    .line 109
    .line 110
    const/4 v2, 0x0

    .line 111
    invoke-direct {v1, p0, v2, p1}, Lya1;-><init>(IILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0, v1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    check-cast p0, Ljava/lang/Boolean;

    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_8
    instance-of v0, p1, Lorg/json/JSONArray;

    .line 126
    .line 127
    if-eqz v0, :cond_9

    .line 128
    .line 129
    move-object v0, p1

    .line 130
    check-cast v0, Lorg/json/JSONArray;

    .line 131
    .line 132
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    invoke-static {v1, v0}, Lj81;->Σ(II)Lxm0;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v0}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    new-instance v1, Lya1;

    .line 145
    .line 146
    const/4 v2, 0x1

    .line 147
    invoke-direct {v1, p0, v2, p1}, Lya1;-><init>(IILjava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v0, v1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    check-cast p0, Ljava/lang/Boolean;

    .line 159
    .line 160
    return-object p0

    .line 161
    :cond_9
    :goto_1
    const/4 p0, 0x0

    .line 162
    return-object p0
.end method

.method public static final ο(ILjava/lang/Object;)Lorg/json/JSONObject;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 5
    .line 6
    if-eq p1, v1, :cond_5

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    if-le p0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    instance-of v1, p1, Lorg/json/JSONObject;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, Lorg/json/JSONObject;

    .line 18
    .line 19
    const-string v1, "base_resp"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lus1;->τ(Ljava/util/Iterator;)Lss1;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Lya1;

    .line 39
    .line 40
    const/4 v2, 0x2

    .line 41
    invoke-direct {v1, p0, v2, p1}, Lya1;-><init>(IILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Lorg/json/JSONObject;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_1
    return-object v1

    .line 56
    :cond_2
    instance-of v1, p1, Lorg/json/JSONArray;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    move-object v0, p1

    .line 61
    check-cast v0, Lorg/json/JSONArray;

    .line 62
    .line 63
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/4 v1, 0x0

    .line 68
    invoke-static {v1, v0}, Lj81;->Σ(II)Lxm0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    new-instance v1, Lya1;

    .line 77
    .line 78
    const/4 v2, 0x3

    .line 79
    invoke-direct {v1, p0, v2, p1}, Lya1;-><init>(IILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, Lorg/json/JSONObject;

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_3
    instance-of v1, p1, Ljava/lang/String;

    .line 94
    .line 95
    if-eqz v1, :cond_5

    .line 96
    .line 97
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 98
    .line 99
    check-cast p1, Ljava/lang/String;

    .line 100
    .line 101
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :catchall_0
    move-exception p1

    .line 106
    new-instance v1, Leo1;

    .line 107
    .line 108
    invoke-direct {v1, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    :goto_0
    instance-of p1, v1, Leo1;

    .line 112
    .line 113
    if-eqz p1, :cond_4

    .line 114
    .line 115
    move-object v1, v0

    .line 116
    :cond_4
    check-cast v1, Lorg/json/JSONObject;

    .line 117
    .line 118
    if-eqz v1, :cond_5

    .line 119
    .line 120
    add-int/lit8 p0, p0, 0x1

    .line 121
    .line 122
    invoke-static {p0, v1}, Li81;->ο(ILjava/lang/Object;)Lorg/json/JSONObject;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    :cond_5
    :goto_1
    return-object v0
.end method

.method public static final π(Ljava/lang/Object;ILjava/util/Set;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_a

    .line 3
    .line 4
    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 5
    .line 6
    if-eq p0, v1, :cond_a

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    if-le p1, v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    instance-of v1, p0, Lorg/json/JSONObject;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v1, :cond_5

    .line 17
    .line 18
    move-object v1, p2

    .line 19
    check-cast v1, Ljava/lang/Iterable;

    .line 20
    .line 21
    check-cast p0, Lorg/json/JSONObject;

    .line 22
    .line 23
    instance-of v3, v1, Ljava/util/Collection;

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    move-object v3, v1

    .line 28
    check-cast v3, Ljava/util/Collection;

    .line 29
    .line 30
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {v1}, Lus1;->τ(Ljava/util/Iterator;)Lss1;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-interface {v1}, Lss1;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_a

    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    add-int/lit8 v4, p1, 0x1

    .line 92
    .line 93
    invoke-static {v3, v4, p2}, Li81;->π(Ljava/lang/Object;ILjava/util/Set;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_4

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    instance-of v1, p0, Lorg/json/JSONArray;

    .line 101
    .line 102
    if-eqz v1, :cond_8

    .line 103
    .line 104
    check-cast p0, Lorg/json/JSONArray;

    .line 105
    .line 106
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    invoke-static {v0, v1}, Lj81;->Σ(II)Lxm0;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    instance-of v3, v1, Ljava/util/Collection;

    .line 115
    .line 116
    if-eqz v3, :cond_6

    .line 117
    .line 118
    move-object v3, v1

    .line 119
    check-cast v3, Ljava/util/Collection;

    .line 120
    .line 121
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_6

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_6
    invoke-virtual {v1}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    :cond_7
    move-object v3, v1

    .line 133
    check-cast v3, Lwm0;

    .line 134
    .line 135
    iget-boolean v4, v3, Lwm0;->η:Z

    .line 136
    .line 137
    if-eqz v4, :cond_a

    .line 138
    .line 139
    invoke-virtual {v3}, Lwm0;->nextInt()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    invoke-virtual {p0, v3}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    add-int/lit8 v4, p1, 0x1

    .line 148
    .line 149
    invoke-static {v3, v4, p2}, Li81;->π(Ljava/lang/Object;ILjava/util/Set;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_7

    .line 154
    .line 155
    :goto_1
    return v2

    .line 156
    :cond_8
    instance-of v1, p0, Ljava/lang/String;

    .line 157
    .line 158
    if-eqz v1, :cond_a

    .line 159
    .line 160
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 161
    .line 162
    check-cast p0, Ljava/lang/String;

    .line 163
    .line 164
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :catchall_0
    move-exception p0

    .line 169
    new-instance v1, Leo1;

    .line 170
    .line 171
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    :goto_2
    instance-of p0, v1, Leo1;

    .line 175
    .line 176
    if-eqz p0, :cond_9

    .line 177
    .line 178
    const/4 v1, 0x0

    .line 179
    :cond_9
    check-cast v1, Lorg/json/JSONObject;

    .line 180
    .line 181
    if-eqz v1, :cond_a

    .line 182
    .line 183
    add-int/2addr p1, v2

    .line 184
    invoke-static {v1, p1, p2}, Li81;->π(Ljava/lang/Object;ILjava/util/Set;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    :cond_a
    :goto_3
    return v0
.end method

.method public static final ρ(II)I
    .locals 0

    .line 1
    shr-int/2addr p0, p1

    .line 2
    and-int/lit8 p0, p0, 0x1f

    .line 3
    .line 4
    return p0
.end method

.method public static final σ(II)I
    .locals 0

    .line 1
    shr-int/2addr p0, p1

    .line 2
    and-int/lit8 p0, p0, 0x1f

    .line 3
    .line 4
    return p0
.end method

.method public static τ(Landroid/content/Context;)Z
    .locals 3

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lui1;->Α()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Lui1;->π(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {}, Lui1;->κ()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v1, Lx9;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    sget-object v1, Lx9;->θ:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    :cond_1
    sget-boolean v0, Li81;->α:Z

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const/4 v0, 0x1

    .line 60
    sput-boolean v0, Li81;->α:Z

    .line 61
    .line 62
    new-instance v0, Ljava/lang/Thread;

    .line 63
    .line 64
    new-instance v1, Lr4;

    .line 65
    .line 66
    const/4 v2, 0x3

    .line 67
    invoke-direct {v1, p0, v2}, Lr4;-><init>(Landroid/content/Context;I)V

    .line 68
    .line 69
    .line 70
    const-string p0, "DY-Settings-BetaWarmup"

    .line 71
    .line 72
    invoke-direct {v0, v1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 76
    .line 77
    .line 78
    :cond_3
    :goto_0
    invoke-static {}, Lx9;->κ()Z

    .line 79
    .line 80
    .line 81
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    return p0

    .line 83
    :catchall_0
    move-exception p0

    .line 84
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    const-string v0, "\u68c0\u67e5\u5185\u6d4b\u72b6\u6001\u5931\u8d25: "

    .line 89
    .line 90
    invoke-static {v0, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    const/4 v0, 0x4

    .line 95
    const-string v1, "DYHelper"

    .line 96
    .line 97
    const/4 v2, 0x0

    .line 98
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    const/4 p0, 0x0

    .line 102
    return p0
.end method

.method public static υ(Lza1;)Lkc1;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lza1;->γ:Lorg/json/JSONObject;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v2, v1}, Li81;->ξ(ILjava/lang/Object;)Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    move-result-object v8

    .line 10
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-static {v8, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    const-string v15, "item_list"

    .line 19
    .line 20
    const-string v16, "saved_time"

    .line 21
    .line 22
    const-string v9, "decorate"

    .line 23
    .line 24
    const-string v10, "decorate_list"

    .line 25
    .line 26
    const-string v11, "bag_info"

    .line 27
    .line 28
    const-string v12, "camp_exp"

    .line 29
    .line 30
    const-string v13, "currency_info"

    .line 31
    .line 32
    const-string v14, "changed_item_list"

    .line 33
    .line 34
    filled-new-array/range {v9 .. v16}, [Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v3}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v1, v2, v3}, Li81;->π(Ljava/lang/Object;ILjava/util/Set;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    :cond_0
    const/4 v2, 0x1

    .line 49
    :cond_1
    new-instance v3, Lkc1;

    .line 50
    .line 51
    iget v4, v0, Lza1;->α:I

    .line 52
    .line 53
    iget-object v5, v0, Lza1;->β:Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-static {v1, v2}, Li81;->η(Lorg/json/JSONObject;Z)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    invoke-static {v1}, Li81;->θ(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-direct/range {v3 .. v8}, Lkc1;-><init>(ILjava/lang/Integer;ILjava/lang/String;Ljava/lang/Boolean;)V

    .line 64
    .line 65
    .line 66
    return-object v3
.end method

.method public static final φ(Ljava/io/Reader;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x2000

    .line 7
    .line 8
    new-array v1, v1, [C

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/io/Reader;->read([C)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    :goto_0
    if-ltz v2, :cond_0

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/Writer;->write([CII)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Ljava/io/Reader;->read([C)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    return-object p0
.end method

.method public static final χ(Lb21;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    instance-of v2, v0, Lc21;

    .line 10
    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    check-cast v0, Lc21;

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Lc21;->λ(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lc21;->η()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lb21;->λ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_1
    return p2

    .line 31
    :cond_2
    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_3

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lb21;->λ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    return p0

    .line 42
    :cond_3
    return v1
.end method

.method public static final ψ(Lb21;Ljava/lang/Object;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lb21;->α:[J

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    add-int/lit8 v1, v1, -0x2

    .line 5
    .line 6
    if-ltz v1, :cond_5

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    :goto_0
    aget-wide v4, v0, v3

    .line 11
    .line 12
    not-long v6, v4

    .line 13
    const/4 v8, 0x7

    .line 14
    shl-long/2addr v6, v8

    .line 15
    and-long/2addr v6, v4

    .line 16
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr v6, v8

    .line 22
    cmp-long v6, v6, v8

    .line 23
    .line 24
    if-eqz v6, :cond_4

    .line 25
    .line 26
    sub-int v6, v3, v1

    .line 27
    .line 28
    not-int v6, v6

    .line 29
    ushr-int/lit8 v6, v6, 0x1f

    .line 30
    .line 31
    const/16 v7, 0x8

    .line 32
    .line 33
    rsub-int/lit8 v6, v6, 0x8

    .line 34
    .line 35
    move v8, v2

    .line 36
    :goto_1
    if-ge v8, v6, :cond_3

    .line 37
    .line 38
    const-wide/16 v9, 0xff

    .line 39
    .line 40
    and-long/2addr v9, v4

    .line 41
    const-wide/16 v11, 0x80

    .line 42
    .line 43
    cmp-long v9, v9, v11

    .line 44
    .line 45
    if-gez v9, :cond_2

    .line 46
    .line 47
    shl-int/lit8 v9, v3, 0x3

    .line 48
    .line 49
    add-int/2addr v9, v8

    .line 50
    iget-object v10, p0, Lb21;->β:[Ljava/lang/Object;

    .line 51
    .line 52
    aget-object v10, v10, v9

    .line 53
    .line 54
    iget-object v10, p0, Lb21;->γ:[Ljava/lang/Object;

    .line 55
    .line 56
    aget-object v10, v10, v9

    .line 57
    .line 58
    instance-of v11, v10, Lc21;

    .line 59
    .line 60
    if-eqz v11, :cond_0

    .line 61
    .line 62
    check-cast v10, Lc21;

    .line 63
    .line 64
    invoke-virtual {v10, p1}, Lc21;->λ(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    invoke-virtual {v10}, Lc21;->η()Z

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    goto :goto_2

    .line 72
    :cond_0
    if-ne v10, p1, :cond_1

    .line 73
    .line 74
    const/4 v10, 0x1

    .line 75
    goto :goto_2

    .line 76
    :cond_1
    move v10, v2

    .line 77
    :goto_2
    if-eqz v10, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0, v9}, Lb21;->μ(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :cond_2
    shr-long/2addr v4, v7

    .line 83
    add-int/lit8 v8, v8, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    if-ne v6, v7, :cond_5

    .line 87
    .line 88
    :cond_4
    if-eq v3, v1, :cond_5

    .line 89
    .line 90
    add-int/lit8 v3, v3, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    return-void
.end method

.method public static ω(Ljava/lang/ClassLoader;Lvc1;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lza1;
    .locals 9

    .line 1
    iget-object v0, p1, Lvc1;->α:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Lvc1;->β:Luc1;

    .line 4
    .line 5
    iget-object v7, p1, Lvc1;->γ:Ljava/util/Map;

    .line 6
    .line 7
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_f

    .line 12
    .line 13
    const-string v0, "Agw-Js-Conv"

    .line 14
    .line 15
    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/CharSequence;

    .line 20
    .line 21
    if-eqz v0, :cond_e

    .line 22
    .line 23
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_e

    .line 28
    .line 29
    sget-object v0, Luc1;->θ:Luc1;

    .line 30
    .line 31
    if-ne v1, v0, :cond_1

    .line 32
    .line 33
    const-string v0, "X-Hamlet-Is-Unity"

    .line 34
    .line 35
    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/lang/CharSequence;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    const-string p0, "sec_pet_id \u9274\u6743\u7f3a\u5c11 X-Hamlet-Is-Unity \u8bf7\u6c42\u5934"

    .line 51
    .line 52
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_1
    :goto_1
    iget v0, v1, Luc1;->ε:I

    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v2, Ll91;

    .line 64
    .line 65
    const-string v3, "client_type"

    .line 66
    .line 67
    invoke-direct {v2, v3, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, v1, Luc1;->ζ:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v1, p1, Lvc1;->α:Ljava/lang/String;

    .line 73
    .line 74
    new-instance v3, Ll91;

    .line 75
    .line 76
    invoke-direct {v3, v0, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    filled-new-array {v2, v3}, [Ll91;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Lex0;->Ι([Ll91;)Ljava/util/LinkedHashMap;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 88
    .line 89
    invoke-direct {v0, p4}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v6}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 93
    .line 94
    .line 95
    sget-object p4, Lbd1;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 96
    .line 97
    invoke-virtual {p1}, Lvc1;->β()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {p4, v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    :try_start_0
    const-string v1, "GET"

    .line 105
    .line 106
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    sget-object v8, Lkz;->ε:Lkz;

    .line 111
    .line 112
    if-eqz v1, :cond_2

    .line 113
    .line 114
    move-object v5, v8

    .line 115
    :goto_2
    move-object v2, p0

    .line 116
    move-object v3, p2

    .line 117
    move-object v4, p3

    .line 118
    goto :goto_3

    .line 119
    :cond_2
    move-object v5, v0

    .line 120
    goto :goto_2

    .line 121
    :goto_3
    :try_start_1
    invoke-static/range {v2 .. v7}, Lxn0;->х(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lrf1;

    .line 122
    .line 123
    .line 124
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    invoke-virtual {p1}, Lvc1;->β()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-virtual {p4, p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Lrf1;->α()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-nez p1, :cond_4

    .line 137
    .line 138
    iget-object p0, p0, Lrf1;->β:Ljava/lang/Throwable;

    .line 139
    .line 140
    if-nez p0, :cond_3

    .line 141
    .line 142
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 143
    .line 144
    const-string p1, "\u8425\u5730\u5bbf\u4e3b\u8bf7\u6c42\u5931\u8d25"

    .line 145
    .line 146
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    :cond_3
    throw p0

    .line 150
    :cond_4
    iget-object p0, p0, Lrf1;->α:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast p0, Ljava/util/Map;

    .line 153
    .line 154
    if-eqz p0, :cond_d

    .line 155
    .line 156
    const-string p1, "data"

    .line 157
    .line 158
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    instance-of p2, p1, Ljava/util/Map;

    .line 163
    .line 164
    const/4 p3, 0x0

    .line 165
    if-eqz p2, :cond_5

    .line 166
    .line 167
    check-cast p1, Ljava/util/Map;

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_5
    move-object p1, p3

    .line 171
    :goto_4
    if-eqz p1, :cond_6

    .line 172
    .line 173
    invoke-static {p1}, Li81;->Δ(Ljava/util/Map;)Lzw0;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    goto :goto_5

    .line 178
    :cond_6
    move-object p1, p3

    .line 179
    :goto_5
    if-nez p1, :cond_7

    .line 180
    .line 181
    goto :goto_6

    .line 182
    :cond_7
    move-object v8, p1

    .line 183
    :goto_6
    const-string p1, "response"

    .line 184
    .line 185
    invoke-interface {v8, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-static {p1}, Li81;->Γ(Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    if-nez p1, :cond_8

    .line 194
    .line 195
    const-string p1, "rawResponse"

    .line 196
    .line 197
    invoke-interface {v8, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-static {p1}, Li81;->Γ(Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    if-nez p1, :cond_8

    .line 206
    .line 207
    new-instance p1, Lorg/json/JSONObject;

    .line 208
    .line 209
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 210
    .line 211
    .line 212
    :cond_8
    new-instance p2, Lza1;

    .line 213
    .line 214
    const-string p4, "code"

    .line 215
    .line 216
    invoke-interface {p0, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    instance-of p4, p0, Ljava/lang/Number;

    .line 221
    .line 222
    if-eqz p4, :cond_9

    .line 223
    .line 224
    check-cast p0, Ljava/lang/Number;

    .line 225
    .line 226
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 227
    .line 228
    .line 229
    move-result p0

    .line 230
    goto :goto_7

    .line 231
    :cond_9
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    const/16 p4, 0xa

    .line 236
    .line 237
    invoke-static {p0, p4}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    if-eqz p0, :cond_a

    .line 242
    .line 243
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 244
    .line 245
    .line 246
    move-result p0

    .line 247
    goto :goto_7

    .line 248
    :cond_a
    const/4 p0, -0x1

    .line 249
    :goto_7
    const-string p4, "httpCode"

    .line 250
    .line 251
    invoke-interface {v8, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p4

    .line 255
    instance-of v0, p4, Ljava/lang/Number;

    .line 256
    .line 257
    if-eqz v0, :cond_b

    .line 258
    .line 259
    check-cast p4, Ljava/lang/Number;

    .line 260
    .line 261
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 262
    .line 263
    .line 264
    move-result p3

    .line 265
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 266
    .line 267
    .line 268
    move-result-object p3

    .line 269
    goto :goto_8

    .line 270
    :cond_b
    if-nez p4, :cond_c

    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_c
    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p3

    .line 277
    invoke-static {p3}, Lx02;->Π(Ljava/lang/String;)Ljava/lang/Integer;

    .line 278
    .line 279
    .line 280
    move-result-object p3

    .line 281
    :goto_8
    invoke-direct {p2, p0, p3, p1}, Lza1;-><init>(ILjava/lang/Integer;Lorg/json/JSONObject;)V

    .line 282
    .line 283
    .line 284
    return-object p2

    .line 285
    :cond_d
    const-string p0, "\u8425\u5730 Bridge \u7ed3\u679c\u4e3a\u7a7a"

    .line 286
    .line 287
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    goto/16 :goto_0

    .line 291
    .line 292
    :catchall_0
    move-exception v0

    .line 293
    move-object p0, v0

    .line 294
    invoke-virtual {p1}, Lvc1;->β()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p2

    .line 298
    invoke-virtual {p4, p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    throw p0

    .line 302
    :cond_e
    const-string p0, "\u7f3a\u5c11 Agw-Js-Conv \u8bf7\u6c42\u5934"

    .line 303
    .line 304
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    goto/16 :goto_0

    .line 308
    .line 309
    :cond_f
    const-string p0, "\u7f3a\u5c11\u5bbf\u4e3b\u8425\u5730\u8eab\u4efd"

    .line 310
    .line 311
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    goto/16 :goto_0
.end method

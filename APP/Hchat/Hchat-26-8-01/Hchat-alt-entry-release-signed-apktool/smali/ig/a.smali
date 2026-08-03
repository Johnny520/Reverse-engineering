.class public abstract Lig/a;
.super Ljava/lang/Object;


# direct methods
.method public static final A(Lh/Hchat/dexkit/DexFinder;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    iget-object v1, p0, Lh/Hchat/dexkit/DexFinder;->serviceGetterMethod:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    if-eqz v1, :cond_4

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    :try_start_0
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v1, v0, v2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    move-object v0, v1

    .line 35
    :catchall_0
    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_3
    iget-object p0, p0, Lh/Hchat/dexkit/DexFinder;->serviceGetterMethod:Ljava/lang/reflect/Method;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v0, Ljava/util/HashSet;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {p0, p1, p1, v0}, Lig/a;->t(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_4
    :goto_1
    return-object v0
.end method

.method public static final B(Ln2/s;I)Li2/g;
    .locals 4

    .line 1
    iget-object v0, p0, Ln2/s;->a:Li2/g;

    .line 2
    .line 3
    iget-object v1, p0, Ln2/s;->a:Li2/g;

    .line 4
    .line 5
    iget-wide v2, p0, Ln2/s;->b:J

    .line 6
    .line 7
    invoke-static {v2, v3}, Li2/m0;->e(J)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {v2, v3}, Li2/m0;->e(J)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    add-int v3, v2, p1

    .line 16
    .line 17
    xor-int/2addr v2, v3

    .line 18
    xor-int/2addr p1, v3

    .line 19
    and-int/2addr p1, v2

    .line 20
    if-gez p1, :cond_0

    .line 21
    .line 22
    iget-object p1, v1, Li2/g;->h:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    :cond_0
    iget-object p1, v1, Li2/g;->h:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-static {v3, p1}, Ljava/lang/Math;->min(II)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v0, p0, p1}, Li2/g;->b(II)Li2/g;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static final C(Ln2/s;I)Li2/g;
    .locals 4

    .line 1
    iget-object v0, p0, Ln2/s;->a:Li2/g;

    .line 2
    .line 3
    iget-wide v1, p0, Ln2/s;->b:J

    .line 4
    .line 5
    invoke-static {v1, v2}, Li2/m0;->f(J)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    sub-int v3, p0, p1

    .line 10
    .line 11
    xor-int/2addr p1, p0

    .line 12
    xor-int/2addr p0, v3

    .line 13
    and-int/2addr p0, p1

    .line 14
    const/4 p1, 0x0

    .line 15
    if-gez p0, :cond_0

    .line 16
    .line 17
    move v3, p1

    .line 18
    :cond_0
    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {v1, v2}, Li2/m0;->f(J)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {v0, p0, p1}, Li2/g;->b(II)Li2/g;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public static D(BBBB[CI)V
    .locals 2

    .line 1
    invoke-static {p1}, Lig/a;->I(B)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    shl-int/lit8 v0, p0, 0x1c

    .line 8
    .line 9
    add-int/lit8 v1, p1, 0x70

    .line 10
    .line 11
    add-int/2addr v1, v0

    .line 12
    shr-int/lit8 v0, v1, 0x1e

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-static {p2}, Lig/a;->I(B)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-static {p3}, Lig/a;->I(B)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    and-int/lit8 p0, p0, 0x7

    .line 29
    .line 30
    shl-int/lit8 p0, p0, 0x12

    .line 31
    .line 32
    and-int/lit8 p1, p1, 0x3f

    .line 33
    .line 34
    shl-int/lit8 p1, p1, 0xc

    .line 35
    .line 36
    or-int/2addr p0, p1

    .line 37
    and-int/lit8 p1, p2, 0x3f

    .line 38
    .line 39
    shl-int/lit8 p1, p1, 0x6

    .line 40
    .line 41
    or-int/2addr p0, p1

    .line 42
    and-int/lit8 p1, p3, 0x3f

    .line 43
    .line 44
    or-int/2addr p0, p1

    .line 45
    ushr-int/lit8 p1, p0, 0xa

    .line 46
    .line 47
    const p2, 0xd7c0

    .line 48
    .line 49
    .line 50
    add-int/2addr p1, p2

    .line 51
    int-to-char p1, p1

    .line 52
    aput-char p1, p4, p5

    .line 53
    .line 54
    add-int/lit8 p5, p5, 0x1

    .line 55
    .line 56
    and-int/lit16 p0, p0, 0x3ff

    .line 57
    .line 58
    const p1, 0xdc00

    .line 59
    .line 60
    .line 61
    add-int/2addr p0, p1

    .line 62
    int-to-char p0, p0

    .line 63
    aput-char p0, p4, p5

    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    const-string p0, "Invalid UTF-8"

    .line 67
    .line 68
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public static E(BBB[CI)V
    .locals 2

    .line 1
    invoke-static {p1}, Lig/a;->I(B)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    const/16 v0, -0x20

    .line 8
    .line 9
    const/16 v1, -0x60

    .line 10
    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    if-lt p1, v1, :cond_2

    .line 14
    .line 15
    :cond_0
    const/16 v0, -0x13

    .line 16
    .line 17
    if-ne p0, v0, :cond_1

    .line 18
    .line 19
    if-ge p1, v1, :cond_2

    .line 20
    .line 21
    :cond_1
    invoke-static {p2}, Lig/a;->I(B)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    and-int/lit8 p0, p0, 0xf

    .line 28
    .line 29
    shl-int/lit8 p0, p0, 0xc

    .line 30
    .line 31
    and-int/lit8 p1, p1, 0x3f

    .line 32
    .line 33
    shl-int/lit8 p1, p1, 0x6

    .line 34
    .line 35
    or-int/2addr p0, p1

    .line 36
    and-int/lit8 p1, p2, 0x3f

    .line 37
    .line 38
    or-int/2addr p0, p1

    .line 39
    int-to-char p0, p0

    .line 40
    aput-char p0, p3, p4

    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    const-string p0, "Invalid UTF-8"

    .line 44
    .line 45
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static F(BB[CI)V
    .locals 1

    .line 1
    const/16 v0, -0x3e

    .line 2
    .line 3
    if-lt p0, v0, :cond_1

    .line 4
    .line 5
    invoke-static {p1}, Lig/a;->I(B)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    and-int/lit8 p0, p0, 0x1f

    .line 12
    .line 13
    shl-int/lit8 p0, p0, 0x6

    .line 14
    .line 15
    and-int/lit8 p1, p1, 0x3f

    .line 16
    .line 17
    or-int/2addr p0, p1

    .line 18
    int-to-char p0, p0

    .line 19
    aput-char p0, p2, p3

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "Invalid UTF-8: Illegal trailing byte in 2 bytes utf"

    .line 23
    .line 24
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    const-string p0, "Invalid UTF-8: Illegal leading byte in 2 bytes utf"

    .line 29
    .line 30
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static G(Lfb/v;)Luf/g;
    .locals 3

    .line 1
    iget-object v0, p0, Lfb/v;->c:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object p0, p0, Lfb/v;->k:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "anthropic"

    .line 14
    .line 15
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    new-instance p0, Luf/g;

    .line 22
    .line 23
    invoke-direct {p0}, Luf/g;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "anthropic-version"

    .line 27
    .line 28
    const-string v2, "2023-06-01"

    .line 29
    .line 30
    invoke-virtual {p0, v1, v2}, Luf/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    const-string v1, "x-api-key"

    .line 40
    .line 41
    invoke-virtual {p0, v1, v0}, Luf/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {p0}, Luf/g;->c()Luf/g;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_1
    const-string v1, "gemini"

    .line 50
    .line 51
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_3

    .line 56
    .line 57
    new-instance p0, Luf/g;

    .line 58
    .line 59
    invoke-direct {p0}, Luf/g;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_2

    .line 67
    .line 68
    const-string v1, "x-goog-api-key"

    .line 69
    .line 70
    invoke-virtual {p0, v1, v0}, Luf/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :cond_2
    invoke-virtual {p0}, Luf/g;->c()Luf/g;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :cond_3
    new-instance p0, Luf/g;

    .line 79
    .line 80
    invoke-direct {p0}, Luf/g;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_4

    .line 88
    .line 89
    const-string v1, "Bearer "

    .line 90
    .line 91
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-string v1, "Authorization"

    .line 96
    .line 97
    invoke-virtual {p0, v1, v0}, Luf/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    :cond_4
    invoke-virtual {p0}, Luf/g;->c()Luf/g;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0
.end method

.method public static H(Ljava/lang/String;)Lfb/w0;
    .locals 7

    .line 1
    const-string v0, "data:"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    const-string v0, "http://"

    .line 13
    .line 14
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const-string v0, "https://"

    .line 21
    .line 22
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, v1

    .line 30
    :cond_1
    :goto_0
    if-eqz v2, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move-object p0, v3

    .line 34
    :goto_1
    if-eqz p0, :cond_5

    .line 35
    .line 36
    new-instance v0, Lfb/w0;

    .line 37
    .line 38
    const-string v2, ""

    .line 39
    .line 40
    invoke-direct {v0, v2, p0, v1}, Lfb/w0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_3
    const-string v0, ","

    .line 45
    .line 46
    const/4 v4, 0x6

    .line 47
    invoke-static {p0, v0, v1, v1, v4}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v4, 0x5

    .line 52
    if-le v0, v4, :cond_5

    .line 53
    .line 54
    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    const-string v6, ";base64"

    .line 59
    .line 60
    invoke-static {v5, v6, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_4

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    new-instance v3, Lfb/w0;

    .line 72
    .line 73
    invoke-static {v1, v6}, Log/m;->B0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    add-int/2addr v0, v2

    .line 78
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-direct {v3, v1, p0, v2}, Lfb/w0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 83
    .line 84
    .line 85
    :cond_5
    :goto_2
    return-object v3
.end method

.method public static I(B)Z
    .locals 1

    .line 1
    const/16 v0, -0x41

    .line 2
    .line 3
    if-le p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static J(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-static {v1, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    array-length p1, p0

    .line 42
    const/4 v1, 0x1

    .line 43
    if-ne p1, v1, :cond_1

    .line 44
    .line 45
    const-class p1, Ljava/util/List;

    .line 46
    .line 47
    aget-object p0, p0, v0

    .line 48
    .line 49
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    return v1

    .line 56
    :cond_1
    :goto_0
    return v0
.end method

.method public static K(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p0

    .line 8
    new-instance v0, Lsf/f;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 21
    .line 22
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 23
    .line 24
    .line 25
    :goto_1
    check-cast v0, Lorg/json/JSONObject;

    .line 26
    .line 27
    return-object v0
.end method

.method public static L(Ljava/io/File;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->createNewFile()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    :goto_0
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :cond_2
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public static M(Lfb/v;)Ljava/lang/String;
    .locals 11

    .line 1
    iget-object v0, p0, Lfb/v;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lfb/v;->k:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lfb/v;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0, v1, p0}, Lfb/w;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v0, "anthropic"

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v3, 0x0

    .line 31
    const-string v4, "1000"

    .line 32
    .line 33
    const/16 v5, 0x2f

    .line 34
    .line 35
    const-string v6, ""

    .line 36
    .line 37
    const/4 v7, 0x1

    .line 38
    if-eqz v0, :cond_9

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object v6, v0

    .line 48
    :goto_0
    new-array v0, v7, [C

    .line 49
    .line 50
    aput-char v5, v0, v3

    .line 51
    .line 52
    const/4 v1, 0x6

    .line 53
    invoke-static {v6, v0, v1}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v1, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_3

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    move-object v6, v5

    .line 77
    check-cast v6, Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-nez v6, :cond_2

    .line 84
    .line 85
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    :cond_4
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_5

    .line 102
    .line 103
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    check-cast v5, Ljava/lang/String;

    .line 108
    .line 109
    const-string v6, "messages"

    .line 110
    .line 111
    invoke-static {v5, v6}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_4

    .line 116
    .line 117
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    goto :goto_2

    .line 122
    :cond_5
    const/4 v0, -0x1

    .line 123
    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    if-ltz v0, :cond_6

    .line 128
    .line 129
    move v3, v7

    .line 130
    :cond_6
    if-eqz v3, :cond_7

    .line 131
    .line 132
    move-object v2, v5

    .line 133
    :cond_7
    if-eqz v2, :cond_8

    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    invoke-static {v0, v1}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    :cond_8
    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    const-string v0, "models"

    .line 148
    .line 149
    invoke-static {v1, v0}, Ltf/m;->G1(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    const/4 v9, 0x0

    .line 154
    const/16 v10, 0x3e

    .line 155
    .line 156
    const-string v6, "/"

    .line 157
    .line 158
    const/4 v7, 0x0

    .line 159
    const/4 v8, 0x0

    .line 160
    invoke-static/range {v5 .. v10}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    const-string v1, "/"

    .line 165
    .line 166
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {p0, v0}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->clearQuery()Landroid/net/Uri$Builder;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    const-string v0, "limit"

    .line 179
    .line 180
    invoke-virtual {p0, v0, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0

    .line 193
    :cond_9
    const-string v0, "gemini"

    .line 194
    .line 195
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_b

    .line 200
    .line 201
    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {p0}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    if-nez p0, :cond_a

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_a
    move-object v6, p0

    .line 213
    :goto_3
    new-array p0, v7, [C

    .line 214
    .line 215
    aput-char v5, p0, v3

    .line 216
    .line 217
    invoke-static {v6, p0}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    new-instance v1, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    const-string p0, "/models"

    .line 230
    .line 231
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    invoke-virtual {v0, p0}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->clearQuery()Landroid/net/Uri$Builder;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    const-string v0, "pageSize"

    .line 247
    .line 248
    invoke-virtual {p0, v0, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    return-object p0

    .line 261
    :cond_b
    :goto_4
    return-object v2
.end method

.method public static final N(JF)J
    .locals 1

    .line 1
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    cmpl-float v0, p2, v0

    .line 10
    .line 11
    if-ltz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p0, p1}, Lf1/w;->d(J)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    mul-float/2addr v0, p2

    .line 19
    invoke-static {p0, p1, v0}, Lf1/w;->b(JF)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    :cond_1
    :goto_0
    return-wide p0
.end method

.method public static O(Ll0/k;ILl0/k;ZZZ)Ljava/util/List;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p1}, Ll0/k;->u(I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    add-int v4, v1, v3

    .line 12
    .line 13
    invoke-virtual/range {p0 .. p1}, Ll0/k;->f(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    invoke-virtual {v0, v4}, Ll0/k;->f(I)I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    sub-int v7, v6, v5

    .line 22
    .line 23
    const/4 v9, 0x1

    .line 24
    if-ltz v1, :cond_0

    .line 25
    .line 26
    iget-object v10, v0, Ll0/k;->b:[I

    .line 27
    .line 28
    invoke-virtual/range {p0 .. p1}, Ll0/k;->r(I)I

    .line 29
    .line 30
    .line 31
    move-result v11

    .line 32
    mul-int/lit8 v11, v11, 0x5

    .line 33
    .line 34
    add-int/2addr v11, v9

    .line 35
    aget v10, v10, v11

    .line 36
    .line 37
    const/high16 v11, 0xc000000

    .line 38
    .line 39
    and-int/2addr v10, v11

    .line 40
    if-eqz v10, :cond_0

    .line 41
    .line 42
    move v10, v9

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v10, 0x0

    .line 45
    :goto_0
    invoke-virtual {v2, v3}, Ll0/k;->w(I)V

    .line 46
    .line 47
    .line 48
    iget v11, v2, Ll0/k;->t:I

    .line 49
    .line 50
    invoke-virtual {v2, v7, v11}, Ll0/k;->x(II)V

    .line 51
    .line 52
    .line 53
    iget v11, v0, Ll0/k;->g:I

    .line 54
    .line 55
    if-ge v11, v4, :cond_1

    .line 56
    .line 57
    invoke-virtual {v0, v4}, Ll0/k;->B(I)V

    .line 58
    .line 59
    .line 60
    :cond_1
    iget v11, v0, Ll0/k;->k:I

    .line 61
    .line 62
    if-ge v11, v6, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0, v6, v4}, Ll0/k;->C(II)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iget-object v6, v2, Ll0/k;->b:[I

    .line 68
    .line 69
    iget v11, v2, Ll0/k;->t:I

    .line 70
    .line 71
    iget-object v12, v0, Ll0/k;->b:[I

    .line 72
    .line 73
    mul-int/lit8 v13, v11, 0x5

    .line 74
    .line 75
    mul-int/lit8 v14, v1, 0x5

    .line 76
    .line 77
    mul-int/lit8 v15, v4, 0x5

    .line 78
    .line 79
    invoke-static {v12, v6, v13, v14, v15}, Ltf/l;->p0([I[IIII)V

    .line 80
    .line 81
    .line 82
    iget-object v12, v2, Ll0/k;->c:[Ljava/lang/Object;

    .line 83
    .line 84
    iget v14, v2, Ll0/k;->i:I

    .line 85
    .line 86
    iget-object v15, v0, Ll0/k;->c:[Ljava/lang/Object;

    .line 87
    .line 88
    invoke-static {v15, v5, v12, v14, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 89
    .line 90
    .line 91
    iget v15, v2, Ll0/k;->v:I

    .line 92
    .line 93
    add-int/lit8 v16, v13, 0x2

    .line 94
    .line 95
    aput v15, v6, v16

    .line 96
    .line 97
    sub-int v16, v11, v1

    .line 98
    .line 99
    add-int v8, v11, v3

    .line 100
    .line 101
    invoke-virtual {v2, v6, v11}, Ll0/k;->g([II)I

    .line 102
    .line 103
    .line 104
    move-result v18

    .line 105
    sub-int v18, v14, v18

    .line 106
    .line 107
    move/from16 v19, v9

    .line 108
    .line 109
    iget v9, v2, Ll0/k;->m:I

    .line 110
    .line 111
    move/from16 v20, v9

    .line 112
    .line 113
    iget v9, v2, Ll0/k;->l:I

    .line 114
    .line 115
    array-length v12, v12

    .line 116
    move/from16 v21, v10

    .line 117
    .line 118
    move/from16 v10, v20

    .line 119
    .line 120
    move/from16 v20, v13

    .line 121
    .line 122
    move v13, v11

    .line 123
    :goto_1
    if-ge v13, v8, :cond_6

    .line 124
    .line 125
    if-eq v13, v11, :cond_3

    .line 126
    .line 127
    mul-int/lit8 v22, v13, 0x5

    .line 128
    .line 129
    add-int/lit8 v22, v22, 0x2

    .line 130
    .line 131
    aget v23, v6, v22

    .line 132
    .line 133
    add-int v23, v23, v16

    .line 134
    .line 135
    aput v23, v6, v22

    .line 136
    .line 137
    :cond_3
    invoke-virtual {v2, v6, v13}, Ll0/k;->g([II)I

    .line 138
    .line 139
    .line 140
    move-result v22

    .line 141
    move-object/from16 v23, v6

    .line 142
    .line 143
    add-int v6, v22, v18

    .line 144
    .line 145
    if-ge v10, v13, :cond_4

    .line 146
    .line 147
    move/from16 v22, v11

    .line 148
    .line 149
    const/4 v11, 0x0

    .line 150
    goto :goto_2

    .line 151
    :cond_4
    move/from16 v22, v11

    .line 152
    .line 153
    iget v11, v2, Ll0/k;->k:I

    .line 154
    .line 155
    :goto_2
    invoke-static {v6, v11, v9, v12}, Ll0/k;->i(IIII)I

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    mul-int/lit8 v11, v13, 0x5

    .line 160
    .line 161
    add-int/lit8 v11, v11, 0x4

    .line 162
    .line 163
    aput v6, v23, v11

    .line 164
    .line 165
    if-ne v13, v10, :cond_5

    .line 166
    .line 167
    add-int/lit8 v10, v10, 0x1

    .line 168
    .line 169
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 170
    .line 171
    move/from16 v11, v22

    .line 172
    .line 173
    move-object/from16 v6, v23

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_6
    move-object/from16 v23, v6

    .line 177
    .line 178
    iput v10, v2, Ll0/k;->m:I

    .line 179
    .line 180
    iget-object v6, v0, Ll0/k;->d:Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-virtual {v0}, Ll0/k;->p()I

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    invoke-static {v6, v1, v9}, Ll0/j;->a(Ljava/util/ArrayList;II)I

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    iget-object v9, v0, Ll0/k;->d:Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-virtual {v0}, Ll0/k;->p()I

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    invoke-static {v9, v4, v10}, Ll0/j;->a(Ljava/util/ArrayList;II)I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-ge v6, v4, :cond_8

    .line 201
    .line 202
    iget-object v9, v0, Ll0/k;->d:Ljava/util/ArrayList;

    .line 203
    .line 204
    new-instance v10, Ljava/util/ArrayList;

    .line 205
    .line 206
    sub-int v11, v4, v6

    .line 207
    .line 208
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 209
    .line 210
    .line 211
    move v11, v6

    .line 212
    :goto_3
    if-ge v11, v4, :cond_7

    .line 213
    .line 214
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    check-cast v12, Ll0/b;

    .line 219
    .line 220
    iget v13, v12, Ll0/b;->a:I

    .line 221
    .line 222
    add-int v13, v13, v16

    .line 223
    .line 224
    iput v13, v12, Ll0/b;->a:I

    .line 225
    .line 226
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    add-int/lit8 v11, v11, 0x1

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_7
    iget-object v11, v2, Ll0/k;->d:Ljava/util/ArrayList;

    .line 233
    .line 234
    iget v12, v2, Ll0/k;->t:I

    .line 235
    .line 236
    invoke-virtual {v2}, Ll0/k;->p()I

    .line 237
    .line 238
    .line 239
    move-result v13

    .line 240
    invoke-static {v11, v12, v13}, Ll0/j;->a(Ljava/util/ArrayList;II)I

    .line 241
    .line 242
    .line 243
    move-result v11

    .line 244
    iget-object v12, v2, Ll0/k;->d:Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-virtual {v12, v11, v10}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 247
    .line 248
    .line 249
    invoke-virtual {v9, v6, v4}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 254
    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_8
    sget-object v10, Ltf/t;->g:Ltf/t;

    .line 258
    .line 259
    :goto_4
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-nez v4, :cond_9

    .line 264
    .line 265
    iget-object v4, v0, Ll0/k;->e:Ljava/util/HashMap;

    .line 266
    .line 267
    iget-object v6, v2, Ll0/k;->e:Ljava/util/HashMap;

    .line 268
    .line 269
    if-eqz v4, :cond_9

    .line 270
    .line 271
    if-eqz v6, :cond_9

    .line 272
    .line 273
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 274
    .line 275
    .line 276
    move-result v6

    .line 277
    const/4 v9, 0x0

    .line 278
    :goto_5
    if-ge v9, v6, :cond_9

    .line 279
    .line 280
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    check-cast v11, Ll0/b;

    .line 285
    .line 286
    invoke-virtual {v4, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    check-cast v11, Ll0/c;

    .line 291
    .line 292
    add-int/lit8 v9, v9, 0x1

    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_9
    iget v4, v2, Ll0/k;->v:I

    .line 296
    .line 297
    invoke-virtual {v2, v15}, Ll0/k;->O(I)Ll0/c;

    .line 298
    .line 299
    .line 300
    iget-object v4, v0, Ll0/k;->b:[I

    .line 301
    .line 302
    invoke-virtual {v0, v4, v1}, Ll0/k;->E([II)I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-nez p5, :cond_a

    .line 307
    .line 308
    const/16 v17, 0x0

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_a
    if-eqz p3, :cond_e

    .line 312
    .line 313
    if-ltz v4, :cond_b

    .line 314
    .line 315
    move/from16 v17, v19

    .line 316
    .line 317
    goto :goto_6

    .line 318
    :cond_b
    const/16 v17, 0x0

    .line 319
    .line 320
    :goto_6
    if-eqz v17, :cond_c

    .line 321
    .line 322
    invoke-virtual {v0}, Ll0/k;->P()V

    .line 323
    .line 324
    .line 325
    iget v3, v0, Ll0/k;->t:I

    .line 326
    .line 327
    sub-int/2addr v4, v3

    .line 328
    invoke-virtual {v0, v4}, Ll0/k;->a(I)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0}, Ll0/k;->P()V

    .line 332
    .line 333
    .line 334
    :cond_c
    iget v3, v0, Ll0/k;->t:I

    .line 335
    .line 336
    sub-int/2addr v1, v3

    .line 337
    invoke-virtual {v0, v1}, Ll0/k;->a(I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0}, Ll0/k;->H()Z

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    if-eqz v17, :cond_d

    .line 345
    .line 346
    invoke-virtual {v0}, Ll0/k;->M()V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, Ll0/k;->j()V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0}, Ll0/k;->M()V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0}, Ll0/k;->j()V

    .line 356
    .line 357
    .line 358
    :cond_d
    move/from16 v17, v1

    .line 359
    .line 360
    goto :goto_7

    .line 361
    :cond_e
    invoke-virtual {v0, v1, v3}, Ll0/k;->I(II)Z

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    add-int/lit8 v1, v1, -0x1

    .line 366
    .line 367
    invoke-virtual {v0, v5, v7, v1}, Ll0/k;->J(III)V

    .line 368
    .line 369
    .line 370
    move/from16 v17, v3

    .line 371
    .line 372
    :goto_7
    if-eqz v17, :cond_f

    .line 373
    .line 374
    const-string v0, "Unexpectedly removed anchors"

    .line 375
    .line 376
    invoke-static {v0}, Li0/m;->a(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    :cond_f
    iget v0, v2, Ll0/k;->o:I

    .line 380
    .line 381
    add-int/lit8 v13, v20, 0x1

    .line 382
    .line 383
    aget v1, v23, v13

    .line 384
    .line 385
    const/high16 v3, 0x40000000    # 2.0f

    .line 386
    .line 387
    and-int/2addr v3, v1

    .line 388
    if-eqz v3, :cond_10

    .line 389
    .line 390
    move/from16 v9, v19

    .line 391
    .line 392
    goto :goto_8

    .line 393
    :cond_10
    const v3, 0x3ffffff

    .line 394
    .line 395
    .line 396
    and-int v9, v1, v3

    .line 397
    .line 398
    :goto_8
    add-int/2addr v0, v9

    .line 399
    iput v0, v2, Ll0/k;->o:I

    .line 400
    .line 401
    if-eqz p4, :cond_11

    .line 402
    .line 403
    iput v8, v2, Ll0/k;->t:I

    .line 404
    .line 405
    add-int/2addr v14, v7

    .line 406
    iput v14, v2, Ll0/k;->i:I

    .line 407
    .line 408
    :cond_11
    if-eqz v21, :cond_12

    .line 409
    .line 410
    invoke-virtual {v2, v15}, Ll0/k;->T(I)V

    .line 411
    .line 412
    .line 413
    :cond_12
    return-object v10
.end method

.method public static P(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    if-eqz p1, :cond_1

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public static Q(Lorg/json/JSONObject;[BII)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    if-ge v1, p2, :cond_f

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    if-ge p3, v2, :cond_f

    .line 8
    .line 9
    invoke-static {p1, v1, p2}, Lig/a;->V([BII)Lwa/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, v1, Lwa/a;->b:I

    .line 14
    .line 15
    iget-wide v3, v1, Lwa/a;->a:J

    .line 16
    .line 17
    const-wide/16 v5, 0x0

    .line 18
    .line 19
    cmp-long v1, v3, v5

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto/16 :goto_8

    .line 24
    .line 25
    :cond_0
    const/4 v1, 0x3

    .line 26
    ushr-long v7, v3, v1

    .line 27
    .line 28
    long-to-int v1, v7

    .line 29
    const-wide/16 v7, 0x7

    .line 30
    .line 31
    and-long/2addr v3, v7

    .line 32
    long-to-int v3, v3

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    invoke-static {p1, v2, p2}, Lig/a;->V([BII)Lwa/a;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget v3, v2, Lwa/a;->b:I

    .line 40
    .line 41
    iget-wide v4, v2, Lwa/a;->a:J

    .line 42
    .line 43
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_1
    const/4 v4, 0x1

    .line 50
    if-ne v3, v4, :cond_4

    .line 51
    .line 52
    add-int/lit8 v3, v2, 0x8

    .line 53
    .line 54
    if-le v3, p2, :cond_2

    .line 55
    .line 56
    goto/16 :goto_8

    .line 57
    .line 58
    :cond_2
    move v4, v0

    .line 59
    :goto_1
    const/16 v7, 0x8

    .line 60
    .line 61
    if-ge v4, v7, :cond_3

    .line 62
    .line 63
    add-int v7, v2, v4

    .line 64
    .line 65
    aget-byte v7, p1, v7

    .line 66
    .line 67
    and-int/lit16 v7, v7, 0xff

    .line 68
    .line 69
    int-to-long v7, v7

    .line 70
    mul-int/lit8 v9, v4, 0x8

    .line 71
    .line 72
    shl-long/2addr v7, v9

    .line 73
    or-long/2addr v5, v7

    .line 74
    add-int/lit8 v4, v4, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    goto/16 :goto_5

    .line 82
    .line 83
    :cond_4
    const/4 v4, 0x2

    .line 84
    if-ne v3, v4, :cond_a

    .line 85
    .line 86
    invoke-static {p1, v2, p2}, Lig/a;->V([BII)Lwa/a;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    iget v3, v2, Lwa/a;->b:I

    .line 91
    .line 92
    iget-wide v4, v2, Lwa/a;->a:J

    .line 93
    .line 94
    long-to-int v2, v4

    .line 95
    if-ltz v2, :cond_f

    .line 96
    .line 97
    add-int v4, v3, v2

    .line 98
    .line 99
    if-le v4, p2, :cond_5

    .line 100
    .line 101
    goto/16 :goto_8

    .line 102
    .line 103
    :cond_5
    new-array v5, v2, [B

    .line 104
    .line 105
    invoke-static {p1, v3, v5, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 106
    .line 107
    .line 108
    add-int/lit8 v2, p3, 0x1

    .line 109
    .line 110
    const/16 v3, 0xc

    .line 111
    .line 112
    const/4 v6, 0x0

    .line 113
    if-ge v2, v3, :cond_6

    .line 114
    .line 115
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    .line 116
    .line 117
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 118
    .line 119
    .line 120
    array-length v7, v5

    .line 121
    invoke-static {v3, v5, v7, v2}, Lig/a;->Q(Lorg/json/JSONObject;[BII)V

    .line 122
    .line 123
    .line 124
    invoke-static {v3}, Lig/a;->q(Lorg/json/JSONObject;)[B

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-static {v2, v5}, Ljava/util/Arrays;->equals([B[B)Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eqz v2, :cond_6

    .line 133
    .line 134
    new-instance v2, Lm/a;

    .line 135
    .line 136
    const/16 v7, 0x1b

    .line 137
    .line 138
    invoke-direct {v2, v3, v7}, Lm/a;-><init>(Ljava/lang/Object;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    .line 141
    move-object v6, v2

    .line 142
    :catchall_0
    :cond_6
    if-eqz v6, :cond_7

    .line 143
    .line 144
    iget-object v2, v6, Lm/a;->h:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v2, Lorg/json/JSONObject;

    .line 147
    .line 148
    invoke-virtual {v2}, Lorg/json/JSONObject;->length()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-lez v3, :cond_7

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_7
    :try_start_1
    new-instance v2, Ljava/lang/String;

    .line 156
    .line 157
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 158
    .line 159
    invoke-direct {v2, v5, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-static {v3, v5}, Ljava/util/Arrays;->equals([B[B)Z

    .line 167
    .line 168
    .line 169
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 170
    if-eqz v3, :cond_8

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :catchall_1
    :cond_8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    const-string v3, "hex->"

    .line 176
    .line 177
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    new-instance v3, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    array-length v6, v5

    .line 186
    const/4 v7, 0x0

    .line 187
    :goto_2
    if-ge v7, v6, :cond_9

    .line 188
    .line 189
    aget-byte v8, v5, v7

    .line 190
    .line 191
    and-int/lit16 v8, v8, 0xff

    .line 192
    .line 193
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    const-string v9, "%02X"

    .line 202
    .line 203
    invoke-static {v9, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    add-int/lit8 v7, v7, 0x1

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_9
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    :goto_3
    move v3, v4

    .line 225
    goto :goto_5

    .line 226
    :cond_a
    const/4 v4, 0x5

    .line 227
    if-ne v3, v4, :cond_f

    .line 228
    .line 229
    add-int/lit8 v3, v2, 0x4

    .line 230
    .line 231
    if-le v3, p2, :cond_b

    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_b
    move v4, v0

    .line 235
    move v5, v4

    .line 236
    :goto_4
    const/4 v6, 0x4

    .line 237
    if-ge v4, v6, :cond_c

    .line 238
    .line 239
    add-int v6, v2, v4

    .line 240
    .line 241
    aget-byte v6, p1, v6

    .line 242
    .line 243
    and-int/lit16 v6, v6, 0xff

    .line 244
    .line 245
    mul-int/lit8 v7, v4, 0x8

    .line 246
    .line 247
    shl-int/2addr v6, v7

    .line 248
    or-int/2addr v5, v6

    .line 249
    add-int/lit8 v4, v4, 0x1

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_c
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    :goto_5
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    if-nez v4, :cond_d

    .line 265
    .line 266
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 267
    .line 268
    .line 269
    goto :goto_7

    .line 270
    :cond_d
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    instance-of v5, v4, Lorg/json/JSONArray;

    .line 275
    .line 276
    if-eqz v5, :cond_e

    .line 277
    .line 278
    check-cast v4, Lorg/json/JSONArray;

    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_e
    new-instance v5, Lorg/json/JSONArray;

    .line 282
    .line 283
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v5, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 290
    .line 291
    .line 292
    move-object v4, v5

    .line 293
    :goto_6
    invoke-virtual {v4, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 294
    .line 295
    .line 296
    :goto_7
    move v1, v3

    .line 297
    goto/16 :goto_0

    .line 298
    .line 299
    :cond_f
    :goto_8
    return-void
.end method

.method public static final R(JJ)J
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p0, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    shr-long v2, p2, v0

    .line 11
    .line 12
    long-to-int v2, v2

    .line 13
    int-to-float v2, v2

    .line 14
    add-float/2addr v1, v2

    .line 15
    const-wide v2, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr p0, v2

    .line 21
    long-to-int p0, p0

    .line 22
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    and-long p1, p2, v2

    .line 27
    .line 28
    long-to-int p1, p1

    .line 29
    int-to-float p1, p1

    .line 30
    add-float/2addr p0, p1

    .line 31
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    int-to-long p1, p1

    .line 36
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    int-to-long v4, p0

    .line 41
    shl-long p0, p1, v0

    .line 42
    .line 43
    and-long p2, v4, v2

    .line 44
    .line 45
    or-long/2addr p0, p2

    .line 46
    return-wide p0
.end method

.method public static final S(Landroid/view/ViewStructure;Lx1/f0;Landroid/view/autofill/AutofillId;Ljava/lang/String;Lg2/b;)V
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lf2/u;->a:Lf2/x;

    .line 6
    .line 7
    sget-object v2, Lf2/l;->a:Lf2/x;

    .line 8
    .line 9
    invoke-virtual {v1}, Lx1/f0;->w()Lf2/m;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v8, 0x2

    .line 14
    const/16 v11, 0x8

    .line 15
    .line 16
    const/4 v14, 0x1

    .line 17
    if-eqz v2, :cond_14

    .line 18
    .line 19
    iget-object v2, v2, Lf2/m;->g:Lf/k0;

    .line 20
    .line 21
    if-eqz v2, :cond_14

    .line 22
    .line 23
    iget-object v15, v2, Lf/k0;->b:[Ljava/lang/Object;

    .line 24
    .line 25
    const-wide/16 v16, 0x80

    .line 26
    .line 27
    iget-object v3, v2, Lf/k0;->c:[Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v2, v2, Lf/k0;->a:[J

    .line 30
    .line 31
    array-length v4, v2

    .line 32
    sub-int/2addr v4, v8

    .line 33
    move/from16 v31, v8

    .line 34
    .line 35
    if-ltz v4, :cond_12

    .line 36
    .line 37
    move/from16 v28, v14

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const-wide/16 v18, 0xff

    .line 42
    .line 43
    const/16 v20, 0x0

    .line 44
    .line 45
    const/16 v21, 0x0

    .line 46
    .line 47
    const/16 v22, 0x0

    .line 48
    .line 49
    const/16 v23, 0x0

    .line 50
    .line 51
    const/16 v24, 0x0

    .line 52
    .line 53
    const/16 v25, 0x0

    .line 54
    .line 55
    const/16 v26, 0x0

    .line 56
    .line 57
    const/16 v27, 0x0

    .line 58
    .line 59
    const/16 v29, 0x0

    .line 60
    .line 61
    const/16 v30, 0x7

    .line 62
    .line 63
    :goto_0
    aget-wide v7, v2, v5

    .line 64
    .line 65
    const-wide v32, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    not-long v9, v7

    .line 71
    shl-long v9, v9, v30

    .line 72
    .line 73
    and-long/2addr v9, v7

    .line 74
    and-long v9, v9, v32

    .line 75
    .line 76
    cmp-long v9, v9, v32

    .line 77
    .line 78
    if-eqz v9, :cond_11

    .line 79
    .line 80
    sub-int v9, v5, v4

    .line 81
    .line 82
    not-int v9, v9

    .line 83
    ushr-int/lit8 v9, v9, 0x1f

    .line 84
    .line 85
    rsub-int/lit8 v9, v9, 0x8

    .line 86
    .line 87
    const/4 v10, 0x0

    .line 88
    :goto_1
    if-ge v10, v9, :cond_10

    .line 89
    .line 90
    and-long v34, v7, v18

    .line 91
    .line 92
    cmp-long v34, v34, v16

    .line 93
    .line 94
    if-gez v34, :cond_f

    .line 95
    .line 96
    shl-int/lit8 v34, v5, 0x3

    .line 97
    .line 98
    add-int v34, v34, v10

    .line 99
    .line 100
    aget-object v35, v15, v34

    .line 101
    .line 102
    aget-object v34, v3, v34

    .line 103
    .line 104
    move-object/from16 v12, v35

    .line 105
    .line 106
    check-cast v12, Lf2/x;

    .line 107
    .line 108
    sget-object v13, Lf2/u;->r:Lf2/x;

    .line 109
    .line 110
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v13

    .line 114
    if-eqz v13, :cond_0

    .line 115
    .line 116
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-object/from16 v6, v34

    .line 120
    .line 121
    check-cast v6, Lz0/d;

    .line 122
    .line 123
    goto/16 :goto_2

    .line 124
    .line 125
    :cond_0
    sget-object v13, Lf2/u;->a:Lf2/x;

    .line 126
    .line 127
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v13

    .line 131
    if-eqz v13, :cond_1

    .line 132
    .line 133
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    check-cast v34, Ljava/util/List;

    .line 137
    .line 138
    invoke-static/range {v34 .. v34}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v12

    .line 142
    check-cast v12, Ljava/lang/String;

    .line 143
    .line 144
    if-eqz v12, :cond_f

    .line 145
    .line 146
    invoke-virtual {v0, v12}, Landroid/view/ViewStructure;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_2

    .line 150
    .line 151
    :cond_1
    sget-object v13, Lf2/u;->q:Lf2/x;

    .line 152
    .line 153
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    if-eqz v13, :cond_2

    .line 158
    .line 159
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-object/from16 v24, v34

    .line 163
    .line 164
    check-cast v24, Lz0/m;

    .line 165
    .line 166
    goto/16 :goto_2

    .line 167
    .line 168
    :cond_2
    sget-object v13, Lf2/u;->s:Lf2/x;

    .line 169
    .line 170
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v13

    .line 174
    if-eqz v13, :cond_3

    .line 175
    .line 176
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-object/from16 v23, v34

    .line 180
    .line 181
    check-cast v23, Lz0/f;

    .line 182
    .line 183
    goto/16 :goto_2

    .line 184
    .line 185
    :cond_3
    sget-object v13, Lf2/u;->F:Lf2/x;

    .line 186
    .line 187
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v13

    .line 191
    if-eqz v13, :cond_4

    .line 192
    .line 193
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-object/from16 v22, v34

    .line 197
    .line 198
    check-cast v22, Li2/g;

    .line 199
    .line 200
    goto/16 :goto_2

    .line 201
    .line 202
    :cond_4
    sget-object v13, Lf2/u;->l:Lf2/x;

    .line 203
    .line 204
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    if-eqz v13, :cond_5

    .line 209
    .line 210
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    check-cast v34, Ljava/lang/Boolean;

    .line 214
    .line 215
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Boolean;->booleanValue()Z

    .line 216
    .line 217
    .line 218
    move-result v12

    .line 219
    invoke-virtual {v0, v12}, Landroid/view/ViewStructure;->setFocused(Z)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_2

    .line 223
    .line 224
    :cond_5
    sget-object v13, Lf2/u;->O:Lf2/x;

    .line 225
    .line 226
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v13

    .line 230
    if-eqz v13, :cond_6

    .line 231
    .line 232
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    move-object/from16 v29, v34

    .line 236
    .line 237
    check-cast v29, Ljava/lang/Integer;

    .line 238
    .line 239
    goto/16 :goto_2

    .line 240
    .line 241
    :cond_6
    sget-object v13, Lf2/u;->K:Lf2/x;

    .line 242
    .line 243
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v13

    .line 247
    if-eqz v13, :cond_7

    .line 248
    .line 249
    move/from16 v27, v14

    .line 250
    .line 251
    goto/16 :goto_2

    .line 252
    .line 253
    :cond_7
    sget-object v13, Lf2/u;->n:Lf2/x;

    .line 254
    .line 255
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v13

    .line 259
    if-eqz v13, :cond_8

    .line 260
    .line 261
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    check-cast v34, Ljava/lang/Boolean;

    .line 265
    .line 266
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Boolean;->booleanValue()Z

    .line 267
    .line 268
    .line 269
    move-result v28

    .line 270
    goto :goto_2

    .line 271
    :cond_8
    sget-object v13, Lf2/u;->y:Lf2/x;

    .line 272
    .line 273
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v13

    .line 277
    if-eqz v13, :cond_9

    .line 278
    .line 279
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-object/from16 v26, v34

    .line 283
    .line 284
    check-cast v26, Lf2/i;

    .line 285
    .line 286
    goto :goto_2

    .line 287
    :cond_9
    sget-object v13, Lf2/u;->I:Lf2/x;

    .line 288
    .line 289
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v13

    .line 293
    if-eqz v13, :cond_a

    .line 294
    .line 295
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    move-object/from16 v25, v34

    .line 299
    .line 300
    check-cast v25, Ljava/lang/Boolean;

    .line 301
    .line 302
    goto :goto_2

    .line 303
    :cond_a
    sget-object v13, Lf2/u;->J:Lf2/x;

    .line 304
    .line 305
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v13

    .line 309
    if-eqz v13, :cond_b

    .line 310
    .line 311
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    move-object/from16 v21, v34

    .line 315
    .line 316
    check-cast v21, Lh2/a;

    .line 317
    .line 318
    goto :goto_2

    .line 319
    :cond_b
    sget-object v13, Lf2/l;->b:Lf2/x;

    .line 320
    .line 321
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v13

    .line 325
    if-eqz v13, :cond_c

    .line 326
    .line 327
    invoke-virtual {v0, v14}, Landroid/view/ViewStructure;->setClickable(Z)V

    .line 328
    .line 329
    .line 330
    goto :goto_2

    .line 331
    :cond_c
    sget-object v13, Lf2/l;->c:Lf2/x;

    .line 332
    .line 333
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v13

    .line 337
    if-eqz v13, :cond_d

    .line 338
    .line 339
    invoke-virtual {v0, v14}, Landroid/view/ViewStructure;->setLongClickable(Z)V

    .line 340
    .line 341
    .line 342
    goto :goto_2

    .line 343
    :cond_d
    sget-object v13, Lf2/l;->w:Lf2/x;

    .line 344
    .line 345
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v13

    .line 349
    if-eqz v13, :cond_e

    .line 350
    .line 351
    invoke-virtual {v0, v14}, Landroid/view/ViewStructure;->setFocusable(Z)V

    .line 352
    .line 353
    .line 354
    goto :goto_2

    .line 355
    :cond_e
    sget-object v13, Lf2/l;->k:Lf2/x;

    .line 356
    .line 357
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v12

    .line 361
    if-eqz v12, :cond_f

    .line 362
    .line 363
    move/from16 v20, v14

    .line 364
    .line 365
    :cond_f
    :goto_2
    shr-long/2addr v7, v11

    .line 366
    add-int/lit8 v10, v10, 0x1

    .line 367
    .line 368
    goto/16 :goto_1

    .line 369
    .line 370
    :cond_10
    if-ne v9, v11, :cond_13

    .line 371
    .line 372
    :cond_11
    if-eq v5, v4, :cond_13

    .line 373
    .line 374
    add-int/lit8 v5, v5, 0x1

    .line 375
    .line 376
    goto/16 :goto_0

    .line 377
    .line 378
    :cond_12
    const-wide/16 v18, 0xff

    .line 379
    .line 380
    const/16 v30, 0x7

    .line 381
    .line 382
    const-wide v32, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    move/from16 v28, v14

    .line 388
    .line 389
    const/4 v6, 0x0

    .line 390
    const/16 v20, 0x0

    .line 391
    .line 392
    const/16 v21, 0x0

    .line 393
    .line 394
    const/16 v22, 0x0

    .line 395
    .line 396
    const/16 v23, 0x0

    .line 397
    .line 398
    const/16 v24, 0x0

    .line 399
    .line 400
    const/16 v25, 0x0

    .line 401
    .line 402
    const/16 v26, 0x0

    .line 403
    .line 404
    const/16 v27, 0x0

    .line 405
    .line 406
    const/16 v29, 0x0

    .line 407
    .line 408
    :cond_13
    move-object/from16 v2, v21

    .line 409
    .line 410
    move-object/from16 v3, v22

    .line 411
    .line 412
    move-object/from16 v4, v23

    .line 413
    .line 414
    move-object/from16 v5, v26

    .line 415
    .line 416
    goto :goto_3

    .line 417
    :cond_14
    move/from16 v31, v8

    .line 418
    .line 419
    const-wide/16 v16, 0x80

    .line 420
    .line 421
    const-wide/16 v18, 0xff

    .line 422
    .line 423
    const/16 v30, 0x7

    .line 424
    .line 425
    const-wide v32, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    move/from16 v28, v14

    .line 431
    .line 432
    const/4 v2, 0x0

    .line 433
    const/4 v3, 0x0

    .line 434
    const/4 v4, 0x0

    .line 435
    const/4 v5, 0x0

    .line 436
    const/4 v6, 0x0

    .line 437
    const/16 v20, 0x0

    .line 438
    .line 439
    const/16 v24, 0x0

    .line 440
    .line 441
    const/16 v25, 0x0

    .line 442
    .line 443
    const/16 v27, 0x0

    .line 444
    .line 445
    const/16 v29, 0x0

    .line 446
    .line 447
    :goto_3
    invoke-virtual {v1}, Lx1/f0;->w()Lf2/m;

    .line 448
    .line 449
    .line 450
    move-result-object v7

    .line 451
    if-eqz v7, :cond_18

    .line 452
    .line 453
    iget-boolean v8, v7, Lf2/m;->i:Z

    .line 454
    .line 455
    if-eqz v8, :cond_18

    .line 456
    .line 457
    iget-boolean v8, v7, Lf2/m;->j:Z

    .line 458
    .line 459
    if-eqz v8, :cond_15

    .line 460
    .line 461
    goto :goto_5

    .line 462
    :cond_15
    invoke-virtual {v7}, Lf2/m;->c()Lf2/m;

    .line 463
    .line 464
    .line 465
    move-result-object v7

    .line 466
    new-instance v8, Lf/f0;

    .line 467
    .line 468
    invoke-virtual {v1}, Lx1/f0;->n()Ljava/util/List;

    .line 469
    .line 470
    .line 471
    move-result-object v9

    .line 472
    check-cast v9, Lf/d0;

    .line 473
    .line 474
    iget-object v9, v9, Lf/d0;->h:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v9, Lj0/b;

    .line 477
    .line 478
    iget v9, v9, Lj0/b;->i:I

    .line 479
    .line 480
    invoke-direct {v8, v9}, Lf/f0;-><init>(I)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v1}, Lx1/f0;->n()Ljava/util/List;

    .line 484
    .line 485
    .line 486
    move-result-object v9

    .line 487
    invoke-virtual {v8, v9}, Lf/f0;->c(Ljava/util/List;)V

    .line 488
    .line 489
    .line 490
    :cond_16
    :goto_4
    invoke-virtual {v8}, Lf/f0;->i()Z

    .line 491
    .line 492
    .line 493
    move-result v9

    .line 494
    if-eqz v9, :cond_18

    .line 495
    .line 496
    iget v9, v8, Lf/f0;->b:I

    .line 497
    .line 498
    sub-int/2addr v9, v14

    .line 499
    invoke-virtual {v8, v9}, Lf/f0;->k(I)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v9

    .line 503
    check-cast v9, Lx1/f0;

    .line 504
    .line 505
    invoke-virtual {v9}, Lx1/f0;->w()Lf2/m;

    .line 506
    .line 507
    .line 508
    move-result-object v10

    .line 509
    if-eqz v10, :cond_16

    .line 510
    .line 511
    iget-boolean v12, v10, Lf2/m;->i:Z

    .line 512
    .line 513
    if-eqz v12, :cond_17

    .line 514
    .line 515
    goto :goto_4

    .line 516
    :cond_17
    invoke-virtual {v7, v10}, Lf2/m;->e(Lf2/m;)V

    .line 517
    .line 518
    .line 519
    iget-boolean v10, v10, Lf2/m;->j:Z

    .line 520
    .line 521
    if-nez v10, :cond_16

    .line 522
    .line 523
    invoke-virtual {v9}, Lx1/f0;->n()Ljava/util/List;

    .line 524
    .line 525
    .line 526
    move-result-object v9

    .line 527
    invoke-virtual {v8, v9}, Lf/f0;->c(Ljava/util/List;)V

    .line 528
    .line 529
    .line 530
    goto :goto_4

    .line 531
    :cond_18
    :goto_5
    if-eqz v7, :cond_1e

    .line 532
    .line 533
    iget-object v7, v7, Lf2/m;->g:Lf/k0;

    .line 534
    .line 535
    if-eqz v7, :cond_1e

    .line 536
    .line 537
    iget-object v8, v7, Lf/k0;->b:[Ljava/lang/Object;

    .line 538
    .line 539
    iget-object v9, v7, Lf/k0;->c:[Ljava/lang/Object;

    .line 540
    .line 541
    iget-object v7, v7, Lf/k0;->a:[J

    .line 542
    .line 543
    array-length v10, v7

    .line 544
    add-int/lit8 v10, v10, -0x2

    .line 545
    .line 546
    move/from16 v21, v14

    .line 547
    .line 548
    if-ltz v10, :cond_1f

    .line 549
    .line 550
    const/4 v12, 0x0

    .line 551
    const/4 v13, 0x0

    .line 552
    :goto_6
    aget-wide v14, v7, v12

    .line 553
    .line 554
    move/from16 v22, v11

    .line 555
    .line 556
    move/from16 v23, v12

    .line 557
    .line 558
    not-long v11, v14

    .line 559
    shl-long v11, v11, v30

    .line 560
    .line 561
    and-long/2addr v11, v14

    .line 562
    and-long v11, v11, v32

    .line 563
    .line 564
    cmp-long v11, v11, v32

    .line 565
    .line 566
    if-eqz v11, :cond_1d

    .line 567
    .line 568
    sub-int v12, v23, v10

    .line 569
    .line 570
    not-int v11, v12

    .line 571
    ushr-int/lit8 v11, v11, 0x1f

    .line 572
    .line 573
    rsub-int/lit8 v11, v11, 0x8

    .line 574
    .line 575
    const/4 v12, 0x0

    .line 576
    :goto_7
    if-ge v12, v11, :cond_1c

    .line 577
    .line 578
    and-long v36, v14, v18

    .line 579
    .line 580
    cmp-long v26, v36, v16

    .line 581
    .line 582
    if-gez v26, :cond_1a

    .line 583
    .line 584
    shl-int/lit8 v26, v23, 0x3

    .line 585
    .line 586
    add-int v26, v26, v12

    .line 587
    .line 588
    aget-object v34, v8, v26

    .line 589
    .line 590
    aget-object v26, v9, v26

    .line 591
    .line 592
    move-object/from16 v36, v7

    .line 593
    .line 594
    move-object/from16 v7, v34

    .line 595
    .line 596
    check-cast v7, Lf2/x;

    .line 597
    .line 598
    move-object/from16 v34, v8

    .line 599
    .line 600
    sget-object v8, Lf2/u;->j:Lf2/x;

    .line 601
    .line 602
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    move-result v8

    .line 606
    if-eqz v8, :cond_19

    .line 607
    .line 608
    const/4 v8, 0x0

    .line 609
    invoke-virtual {v0, v8}, Landroid/view/ViewStructure;->setEnabled(Z)V

    .line 610
    .line 611
    .line 612
    goto :goto_8

    .line 613
    :cond_19
    sget-object v8, Lf2/u;->B:Lf2/x;

    .line 614
    .line 615
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    move-result v7

    .line 619
    if-eqz v7, :cond_1b

    .line 620
    .line 621
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    move-object/from16 v13, v26

    .line 625
    .line 626
    check-cast v13, Ljava/util/List;

    .line 627
    .line 628
    goto :goto_8

    .line 629
    :cond_1a
    move-object/from16 v36, v7

    .line 630
    .line 631
    move-object/from16 v34, v8

    .line 632
    .line 633
    :cond_1b
    :goto_8
    shr-long v14, v14, v22

    .line 634
    .line 635
    add-int/lit8 v12, v12, 0x1

    .line 636
    .line 637
    move-object/from16 v8, v34

    .line 638
    .line 639
    move-object/from16 v7, v36

    .line 640
    .line 641
    goto :goto_7

    .line 642
    :cond_1c
    move-object/from16 v36, v7

    .line 643
    .line 644
    move-object/from16 v34, v8

    .line 645
    .line 646
    move/from16 v7, v22

    .line 647
    .line 648
    if-ne v11, v7, :cond_20

    .line 649
    .line 650
    :goto_9
    move/from16 v8, v23

    .line 651
    .line 652
    goto :goto_a

    .line 653
    :cond_1d
    move-object/from16 v36, v7

    .line 654
    .line 655
    move-object/from16 v34, v8

    .line 656
    .line 657
    move/from16 v7, v22

    .line 658
    .line 659
    goto :goto_9

    .line 660
    :goto_a
    if-eq v8, v10, :cond_20

    .line 661
    .line 662
    add-int/lit8 v12, v8, 0x1

    .line 663
    .line 664
    move v11, v7

    .line 665
    move-object/from16 v8, v34

    .line 666
    .line 667
    move-object/from16 v7, v36

    .line 668
    .line 669
    goto :goto_6

    .line 670
    :cond_1e
    move/from16 v21, v14

    .line 671
    .line 672
    :cond_1f
    const/4 v13, 0x0

    .line 673
    :cond_20
    iget v7, v1, Lx1/f0;->h:I

    .line 674
    .line 675
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 676
    .line 677
    .line 678
    move-result-object v7

    .line 679
    invoke-virtual {v1}, Lx1/f0;->u()Lx1/f0;

    .line 680
    .line 681
    .line 682
    move-result-object v8

    .line 683
    if-nez v8, :cond_21

    .line 684
    .line 685
    const/4 v7, 0x0

    .line 686
    :cond_21
    if-eqz v7, :cond_22

    .line 687
    .line 688
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 689
    .line 690
    .line 691
    move-result v7

    .line 692
    :goto_b
    move-object/from16 v8, p2

    .line 693
    .line 694
    goto :goto_c

    .line 695
    :cond_22
    const/4 v7, -0x1

    .line 696
    goto :goto_b

    .line 697
    :goto_c
    invoke-virtual {v0, v8, v7}, Landroid/view/ViewStructure;->setAutofillId(Landroid/view/autofill/AutofillId;I)V

    .line 698
    .line 699
    .line 700
    move-object/from16 v8, p3

    .line 701
    .line 702
    const/4 v9, 0x0

    .line 703
    invoke-virtual {v0, v7, v8, v9, v9}, Landroid/view/ViewStructure;->setId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 704
    .line 705
    .line 706
    if-eqz v6, :cond_23

    .line 707
    .line 708
    iget v6, v6, Lz0/d;->a:I

    .line 709
    .line 710
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 711
    .line 712
    .line 713
    move-result-object v12

    .line 714
    goto :goto_d

    .line 715
    :cond_23
    if-eqz v20, :cond_24

    .line 716
    .line 717
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 718
    .line 719
    .line 720
    move-result-object v12

    .line 721
    goto :goto_d

    .line 722
    :cond_24
    if-eqz v2, :cond_25

    .line 723
    .line 724
    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 725
    .line 726
    .line 727
    move-result-object v12

    .line 728
    goto :goto_d

    .line 729
    :cond_25
    move-object v12, v9

    .line 730
    :goto_d
    if-eqz v12, :cond_26

    .line 731
    .line 732
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 733
    .line 734
    .line 735
    move-result v6

    .line 736
    invoke-virtual {v0, v6}, Landroid/view/ViewStructure;->setAutofillType(I)V

    .line 737
    .line 738
    .line 739
    :cond_26
    if-eqz v3, :cond_29

    .line 740
    .line 741
    iget-object v3, v3, Li2/g;->h:Ljava/lang/String;

    .line 742
    .line 743
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 744
    .line 745
    .line 746
    move-result v6

    .line 747
    const/16 v7, 0x1388

    .line 748
    .line 749
    if-ge v6, v7, :cond_27

    .line 750
    .line 751
    goto :goto_e

    .line 752
    :cond_27
    const/16 v6, 0x1387

    .line 753
    .line 754
    invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C

    .line 755
    .line 756
    .line 757
    move-result v8

    .line 758
    invoke-static {v8}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 759
    .line 760
    .line 761
    move-result v8

    .line 762
    if-eqz v8, :cond_28

    .line 763
    .line 764
    invoke-virtual {v3, v7}, Ljava/lang/String;->charAt(I)C

    .line 765
    .line 766
    .line 767
    move-result v8

    .line 768
    invoke-static {v8}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 769
    .line 770
    .line 771
    move-result v8

    .line 772
    if-eqz v8, :cond_28

    .line 773
    .line 774
    invoke-static {v6, v3}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v3

    .line 778
    goto :goto_e

    .line 779
    :cond_28
    invoke-static {v7, v3}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v3

    .line 783
    :goto_e
    invoke-static {v3}, Landroid/view/autofill/AutofillValue;->forText(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    .line 784
    .line 785
    .line 786
    move-result-object v3

    .line 787
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setAutofillValue(Landroid/view/autofill/AutofillValue;)V

    .line 788
    .line 789
    .line 790
    :cond_29
    if-eqz v4, :cond_2a

    .line 791
    .line 792
    iget-object v3, v4, Lz0/f;->a:Landroid/view/autofill/AutofillValue;

    .line 793
    .line 794
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setAutofillValue(Landroid/view/autofill/AutofillValue;)V

    .line 795
    .line 796
    .line 797
    :cond_2a
    if-eqz v24, :cond_2b

    .line 798
    .line 799
    invoke-static/range {v24 .. v24}, Lg4/a;->t(Lz0/m;)[Ljava/lang/String;

    .line 800
    .line 801
    .line 802
    move-result-object v3

    .line 803
    if-eqz v3, :cond_2b

    .line 804
    .line 805
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setAutofillHints([Ljava/lang/String;)V

    .line 806
    .line 807
    .line 808
    :cond_2b
    move-object/from16 v3, p4

    .line 809
    .line 810
    iget-object v3, v3, Lg2/b;->b:Lac/k;

    .line 811
    .line 812
    iget v4, v1, Lx1/f0;->h:I

    .line 813
    .line 814
    new-instance v6, Lz0/n;

    .line 815
    .line 816
    invoke-direct {v6, v0}, Lz0/n;-><init>(Landroid/view/ViewStructure;)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v3, v4, v6}, Lac/k;->P(ILfg/r;)V

    .line 820
    .line 821
    .line 822
    if-eqz v25, :cond_2c

    .line 823
    .line 824
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Boolean;->booleanValue()Z

    .line 825
    .line 826
    .line 827
    move-result v3

    .line 828
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setSelected(Z)V

    .line 829
    .line 830
    .line 831
    :cond_2c
    const/4 v8, 0x4

    .line 832
    if-eqz v2, :cond_2e

    .line 833
    .line 834
    move/from16 v3, v21

    .line 835
    .line 836
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setCheckable(Z)V

    .line 837
    .line 838
    .line 839
    sget-object v3, Lh2/a;->g:Lh2/a;

    .line 840
    .line 841
    if-ne v2, v3, :cond_2d

    .line 842
    .line 843
    const/4 v2, 0x1

    .line 844
    goto :goto_f

    .line 845
    :cond_2d
    const/4 v2, 0x0

    .line 846
    :goto_f
    invoke-virtual {v0, v2}, Landroid/view/ViewStructure;->setChecked(Z)V

    .line 847
    .line 848
    .line 849
    goto :goto_11

    .line 850
    :cond_2e
    if-eqz v25, :cond_31

    .line 851
    .line 852
    if-nez v5, :cond_30

    .line 853
    .line 854
    :cond_2f
    const/4 v3, 0x1

    .line 855
    goto :goto_10

    .line 856
    :cond_30
    iget v2, v5, Lf2/i;->a:I

    .line 857
    .line 858
    if-ne v2, v8, :cond_2f

    .line 859
    .line 860
    goto :goto_11

    .line 861
    :goto_10
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setCheckable(Z)V

    .line 862
    .line 863
    .line 864
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Boolean;->booleanValue()Z

    .line 865
    .line 866
    .line 867
    move-result v2

    .line 868
    invoke-virtual {v0, v2}, Landroid/view/ViewStructure;->setChecked(Z)V

    .line 869
    .line 870
    .line 871
    :cond_31
    :goto_11
    sget-object v2, Lz0/m;->a:Lz0/l;

    .line 872
    .line 873
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 874
    .line 875
    .line 876
    sget-object v2, Lz0/l;->b:Lz0/e;

    .line 877
    .line 878
    invoke-static {v2}, Lg4/a;->t(Lz0/m;)[Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object v2

    .line 882
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    array-length v3, v2

    .line 886
    if-eqz v3, :cond_3e

    .line 887
    .line 888
    const/16 v35, 0x0

    .line 889
    .line 890
    aget-object v2, v2, v35

    .line 891
    .line 892
    if-eqz v24, :cond_33

    .line 893
    .line 894
    invoke-static/range {v24 .. v24}, Lg4/a;->t(Lz0/m;)[Ljava/lang/String;

    .line 895
    .line 896
    .line 897
    move-result-object v3

    .line 898
    if-eqz v3, :cond_33

    .line 899
    .line 900
    invoke-static {v3, v2}, Ltf/l;->m0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    move-result v2

    .line 904
    const/4 v3, 0x1

    .line 905
    if-ne v2, v3, :cond_32

    .line 906
    .line 907
    move v2, v3

    .line 908
    goto :goto_13

    .line 909
    :cond_32
    :goto_12
    move/from16 v2, v35

    .line 910
    .line 911
    goto :goto_13

    .line 912
    :cond_33
    const/4 v3, 0x1

    .line 913
    goto :goto_12

    .line 914
    :goto_13
    if-nez v27, :cond_35

    .line 915
    .line 916
    if-eqz v2, :cond_34

    .line 917
    .line 918
    goto :goto_14

    .line 919
    :cond_34
    move/from16 v2, v35

    .line 920
    .line 921
    goto :goto_15

    .line 922
    :cond_35
    :goto_14
    move v2, v3

    .line 923
    :goto_15
    if-nez v2, :cond_37

    .line 924
    .line 925
    if-eqz v28, :cond_36

    .line 926
    .line 927
    goto :goto_16

    .line 928
    :cond_36
    move/from16 v14, v35

    .line 929
    .line 930
    goto :goto_17

    .line 931
    :cond_37
    :goto_16
    move v14, v3

    .line 932
    :goto_17
    invoke-virtual {v0, v14}, Landroid/view/ViewStructure;->setDataIsSensitive(Z)V

    .line 933
    .line 934
    .line 935
    iget-object v3, v1, Lx1/f0;->L:Lx1/b1;

    .line 936
    .line 937
    iget-object v3, v3, Lx1/b1;->d:Lx1/i1;

    .line 938
    .line 939
    invoke-virtual {v3}, Lx1/i1;->z1()Z

    .line 940
    .line 941
    .line 942
    move-result v3

    .line 943
    if-eqz v3, :cond_38

    .line 944
    .line 945
    goto :goto_18

    .line 946
    :cond_38
    move/from16 v8, v35

    .line 947
    .line 948
    :goto_18
    invoke-virtual {v0, v8}, Landroid/view/ViewStructure;->setVisibility(I)V

    .line 949
    .line 950
    .line 951
    if-eqz v13, :cond_3a

    .line 952
    .line 953
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 954
    .line 955
    .line 956
    move-result v3

    .line 957
    const-string v4, ""

    .line 958
    .line 959
    move/from16 v6, v35

    .line 960
    .line 961
    :goto_19
    if-ge v6, v3, :cond_39

    .line 962
    .line 963
    invoke-interface {v13, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v7

    .line 967
    check-cast v7, Li2/g;

    .line 968
    .line 969
    new-instance v8, Ljava/lang/StringBuilder;

    .line 970
    .line 971
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 975
    .line 976
    .line 977
    iget-object v4, v7, Li2/g;->h:Ljava/lang/String;

    .line 978
    .line 979
    const/16 v7, 0xa

    .line 980
    .line 981
    invoke-static {v8, v4, v7}, Leh/a;->q(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 982
    .line 983
    .line 984
    move-result-object v4

    .line 985
    add-int/lit8 v6, v6, 0x1

    .line 986
    .line 987
    goto :goto_19

    .line 988
    :cond_39
    invoke-virtual {v0, v4}, Landroid/view/ViewStructure;->setText(Ljava/lang/CharSequence;)V

    .line 989
    .line 990
    .line 991
    const-string v3, "android.widget.TextView"

    .line 992
    .line 993
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 994
    .line 995
    .line 996
    :cond_3a
    invoke-virtual {v1}, Lx1/f0;->n()Ljava/util/List;

    .line 997
    .line 998
    .line 999
    move-result-object v1

    .line 1000
    check-cast v1, Lf/d0;

    .line 1001
    .line 1002
    invoke-virtual {v1}, Lf/d0;->isEmpty()Z

    .line 1003
    .line 1004
    .line 1005
    move-result v1

    .line 1006
    if-eqz v1, :cond_3b

    .line 1007
    .line 1008
    if-eqz v5, :cond_3b

    .line 1009
    .line 1010
    iget v1, v5, Lf2/i;->a:I

    .line 1011
    .line 1012
    invoke-static {v1}, Ly1/g0;->v(I)Ljava/lang/String;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v1

    .line 1016
    if-eqz v1, :cond_3b

    .line 1017
    .line 1018
    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 1019
    .line 1020
    .line 1021
    :cond_3b
    if-eqz v20, :cond_3d

    .line 1022
    .line 1023
    const-string v1, "android.widget.EditText"

    .line 1024
    .line 1025
    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 1026
    .line 1027
    .line 1028
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1029
    .line 1030
    const/16 v3, 0x1c

    .line 1031
    .line 1032
    if-lt v1, v3, :cond_3c

    .line 1033
    .line 1034
    if-eqz v29, :cond_3c

    .line 1035
    .line 1036
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Number;->intValue()I

    .line 1037
    .line 1038
    .line 1039
    move-result v1

    .line 1040
    invoke-static {v0, v1}, Lh3/c;->i(Landroid/view/ViewStructure;I)V

    .line 1041
    .line 1042
    .line 1043
    :cond_3c
    if-eqz v2, :cond_3d

    .line 1044
    .line 1045
    const/16 v1, 0x81

    .line 1046
    .line 1047
    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setInputType(I)V

    .line 1048
    .line 1049
    .line 1050
    :cond_3d
    return-void

    .line 1051
    :cond_3e
    const-string v0, "Array is empty."

    .line 1052
    .line 1053
    invoke-static {v0}, Lj8/o;->l(Ljava/lang/String;)V

    .line 1054
    .line 1055
    .line 1056
    return-void
.end method

.method public static T(Lfb/v;Lorg/json/JSONObject;ZZ)Lfb/x0;
    .locals 51

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v3, p2

    .line 6
    .line 7
    iget-object v0, v1, Lfb/v;->k:Ljava/lang/String;

    .line 8
    .line 9
    const-string v4, "deepseek"

    .line 10
    .line 11
    invoke-static {v0, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const-string v5, "image_url"

    .line 16
    .line 17
    const-string v6, "type"

    .line 18
    .line 19
    const-string v7, "content"

    .line 20
    .line 21
    const-string v9, "messages"

    .line 22
    .line 23
    if-eqz v4, :cond_5

    .line 24
    .line 25
    invoke-virtual {v2, v9}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    if-eqz v4, :cond_5

    .line 30
    .line 31
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 32
    .line 33
    .line 34
    move-result v11

    .line 35
    const/4 v12, 0x0

    .line 36
    :goto_0
    if-lt v12, v11, :cond_0

    .line 37
    .line 38
    goto :goto_4

    .line 39
    :cond_0
    invoke-virtual {v4, v12}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    move-result-object v13

    .line 43
    if-eqz v13, :cond_4

    .line 44
    .line 45
    invoke-virtual {v13, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 46
    .line 47
    .line 48
    move-result-object v13

    .line 49
    if-eqz v13, :cond_4

    .line 50
    .line 51
    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    .line 52
    .line 53
    .line 54
    move-result v14

    .line 55
    const/4 v15, 0x0

    .line 56
    :goto_1
    if-lt v15, v14, :cond_1

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_1
    invoke-virtual {v13, v15}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    if-eqz v8, :cond_2

    .line 64
    .line 65
    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    const/4 v8, 0x0

    .line 71
    :goto_2
    invoke-static {v8, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    if-nez v8, :cond_3

    .line 76
    .line 77
    add-int/lit8 v15, v15, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    const-string v0, "DeepSeek \u539f\u751f Chat Completions \u4e0d\u652f\u6301\u56fe\u7247\u8f93\u5165"

    .line 81
    .line 82
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    return-object v0

    .line 87
    :cond_4
    :goto_3
    add-int/lit8 v12, v12, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    :goto_4
    const-string v4, "anthropic"

    .line 91
    .line 92
    invoke-static {v0, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    const-string v11, "hchat_cache_control"

    .line 97
    .line 98
    const-string v12, "data"

    .line 99
    .line 100
    const-string v13, "user"

    .line 101
    .line 102
    const-string v14, "{}"

    .line 103
    .line 104
    const-string v15, "arguments"

    .line 105
    .line 106
    const-string v10, "url"

    .line 107
    .line 108
    move/from16 v16, v8

    .line 109
    .line 110
    const-string v8, "tool_call_id"

    .line 111
    .line 112
    move-object/from16 v17, v13

    .line 113
    .line 114
    const-string v13, "tool"

    .line 115
    .line 116
    move-object/from16 v18, v11

    .line 117
    .line 118
    const-string v11, "developer"

    .line 119
    .line 120
    move-object/from16 v19, v12

    .line 121
    .line 122
    const-string v12, "role"

    .line 123
    .line 124
    move-object/from16 v20, v10

    .line 125
    .line 126
    const-string v10, "object"

    .line 127
    .line 128
    move-object/from16 v21, v5

    .line 129
    .line 130
    const-string v5, "parameters"

    .line 131
    .line 132
    move-object/from16 v22, v14

    .line 133
    .line 134
    const-string v14, "stream"

    .line 135
    .line 136
    move-object/from16 v23, v11

    .line 137
    .line 138
    move-object/from16 v24, v12

    .line 139
    .line 140
    const-string v11, "text"

    .line 141
    .line 142
    const-string v12, "name"

    .line 143
    .line 144
    move-object/from16 v27, v15

    .line 145
    .line 146
    const-string v15, "assistant"

    .line 147
    .line 148
    move-object/from16 v28, v15

    .line 149
    .line 150
    const-string v15, "model"

    .line 151
    .line 152
    move-object/from16 v29, v8

    .line 153
    .line 154
    const-string v8, "temperature"

    .line 155
    .line 156
    move-object/from16 v30, v13

    .line 157
    .line 158
    const-string v13, "system"

    .line 159
    .line 160
    const-string v31, ""

    .line 161
    .line 162
    move-object/from16 v32, v10

    .line 163
    .line 164
    const-string v10, "tools"

    .line 165
    .line 166
    move-object/from16 v33, v5

    .line 167
    .line 168
    const-string v5, "function"

    .line 169
    .line 170
    move-object/from16 v34, v12

    .line 171
    .line 172
    const-string v12, "description"

    .line 173
    .line 174
    move-object/from16 v35, v12

    .line 175
    .line 176
    const-string v12, "id"

    .line 177
    .line 178
    move-object/from16 v36, v12

    .line 179
    .line 180
    const-string v12, "tool_calls"

    .line 181
    .line 182
    if-eqz v16, :cond_35

    .line 183
    .line 184
    invoke-virtual {v2, v9}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 185
    .line 186
    .line 187
    move-result-object v16

    .line 188
    if-eqz v16, :cond_6

    .line 189
    .line 190
    :goto_5
    move-object/from16 v37, v16

    .line 191
    .line 192
    move-object/from16 v16, v12

    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_6
    new-instance v16, Lorg/json/JSONArray;

    .line 196
    .line 197
    invoke-direct/range {v16 .. v16}, Lorg/json/JSONArray;-><init>()V

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :goto_6
    new-instance v12, Lorg/json/JSONArray;

    .line 202
    .line 203
    invoke-direct {v12}, Lorg/json/JSONArray;-><init>()V

    .line 204
    .line 205
    .line 206
    move-object/from16 v38, v5

    .line 207
    .line 208
    new-instance v5, Lorg/json/JSONArray;

    .line 209
    .line 210
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 211
    .line 212
    .line 213
    const/16 v39, 0x1

    .line 214
    .line 215
    move-object/from16 v40, v10

    .line 216
    .line 217
    if-eqz p3, :cond_a

    .line 218
    .line 219
    iget-object v10, v1, Lfb/v;->j:Ljava/lang/String;

    .line 220
    .line 221
    invoke-static {v0, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-nez v4, :cond_7

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_7
    const-string v4, "off"

    .line 229
    .line 230
    invoke-static {v10, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    if-eqz v4, :cond_8

    .line 235
    .line 236
    :goto_7
    const/4 v0, 0x0

    .line 237
    goto :goto_8

    .line 238
    :cond_8
    const-string v4, "force"

    .line 239
    .line 240
    invoke-static {v10, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    if-eqz v4, :cond_9

    .line 245
    .line 246
    move/from16 v0, v39

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_9
    iget-object v4, v1, Lfb/v;->a:Ljava/lang/String;

    .line 250
    .line 251
    iget-object v10, v1, Lfb/v;->b:Ljava/lang/String;

    .line 252
    .line 253
    invoke-static {v4, v0, v10}, Lfb/w;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    const-string v4, "api.anthropic.com"

    .line 266
    .line 267
    invoke-static {v0, v4}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    :goto_8
    if-eqz v0, :cond_a

    .line 272
    .line 273
    move/from16 v4, v39

    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_a
    const/4 v4, 0x0

    .line 277
    :goto_9
    invoke-virtual/range {v37 .. v37}, Lorg/json/JSONArray;->length()I

    .line 278
    .line 279
    .line 280
    move-result v10

    .line 281
    const/4 v1, 0x0

    .line 282
    :goto_a
    const-string v0, "ephemeral"

    .line 283
    .line 284
    move/from16 p3, v4

    .line 285
    .line 286
    const-string v4, "cache_control"

    .line 287
    .line 288
    if-lt v1, v10, :cond_19

    .line 289
    .line 290
    if-eqz p3, :cond_f

    .line 291
    .line 292
    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    add-int/lit8 v1, v1, -0x1

    .line 297
    .line 298
    :goto_b
    const/4 v10, -0x1

    .line 299
    if-lt v10, v1, :cond_b

    .line 300
    .line 301
    goto :goto_e

    .line 302
    :cond_b
    invoke-virtual {v12, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 303
    .line 304
    .line 305
    move-result-object v10

    .line 306
    if-eqz v10, :cond_e

    .line 307
    .line 308
    invoke-virtual {v10, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 309
    .line 310
    .line 311
    move-result-object v10

    .line 312
    if-eqz v10, :cond_e

    .line 313
    .line 314
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    .line 315
    .line 316
    .line 317
    move-result v17

    .line 318
    add-int/lit8 v17, v17, -0x1

    .line 319
    .line 320
    move/from16 v18, v1

    .line 321
    .line 322
    move-object/from16 v37, v7

    .line 323
    .line 324
    move/from16 v1, v17

    .line 325
    .line 326
    :goto_c
    const/4 v7, -0x1

    .line 327
    if-lt v7, v1, :cond_c

    .line 328
    .line 329
    goto :goto_d

    .line 330
    :cond_c
    invoke-virtual {v10, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    if-eqz v7, :cond_d

    .line 335
    .line 336
    new-instance v1, Lorg/json/JSONObject;

    .line 337
    .line 338
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v1, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-virtual {v7, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 346
    .line 347
    .line 348
    goto :goto_e

    .line 349
    :cond_d
    add-int/lit8 v1, v1, -0x1

    .line 350
    .line 351
    goto :goto_c

    .line 352
    :cond_e
    move/from16 v18, v1

    .line 353
    .line 354
    move-object/from16 v37, v7

    .line 355
    .line 356
    :goto_d
    add-int/lit8 v1, v18, -0x1

    .line 357
    .line 358
    move-object/from16 v7, v37

    .line 359
    .line 360
    goto :goto_b

    .line 361
    :cond_f
    :goto_e
    new-instance v0, Lorg/json/JSONObject;

    .line 362
    .line 363
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-virtual {v0, v15, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 371
    .line 372
    .line 373
    const-string v1, "max_tokens"

    .line 374
    .line 375
    const/16 v4, 0x4000

    .line 376
    .line 377
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 378
    .line 379
    .line 380
    move-object/from16 v41, v6

    .line 381
    .line 382
    const-wide v6, 0x3fc999999999999aL    # 0.2

    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    invoke-virtual {v2, v8, v6, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 388
    .line 389
    .line 390
    move-result-wide v6

    .line 391
    invoke-virtual {v0, v8, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0, v14, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    if-lez v1, :cond_15

    .line 402
    .line 403
    if-eqz p3, :cond_10

    .line 404
    .line 405
    goto :goto_10

    .line 406
    :cond_10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 407
    .line 408
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 412
    .line 413
    .line 414
    move-result v3

    .line 415
    const/4 v4, 0x0

    .line 416
    :goto_f
    if-lt v4, v3, :cond_11

    .line 417
    .line 418
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v5

    .line 422
    :goto_10
    invoke-virtual {v0, v13, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 423
    .line 424
    .line 425
    goto :goto_12

    .line 426
    :cond_11
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 427
    .line 428
    .line 429
    move-result v6

    .line 430
    if-lez v6, :cond_12

    .line 431
    .line 432
    const-string v6, "\n\n"

    .line 433
    .line 434
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    :cond_12
    invoke-virtual {v5, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 438
    .line 439
    .line 440
    move-result-object v6

    .line 441
    if-eqz v6, :cond_13

    .line 442
    .line 443
    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v6

    .line 447
    goto :goto_11

    .line 448
    :cond_13
    const/4 v6, 0x0

    .line 449
    :goto_11
    if-nez v6, :cond_14

    .line 450
    .line 451
    move-object/from16 v6, v31

    .line 452
    .line 453
    :cond_14
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    add-int/lit8 v4, v4, 0x1

    .line 457
    .line 458
    goto :goto_f

    .line 459
    :cond_15
    :goto_12
    invoke-virtual {v0, v9, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 460
    .line 461
    .line 462
    move-object/from16 v6, v40

    .line 463
    .line 464
    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    if-eqz v1, :cond_64

    .line 469
    .line 470
    new-instance v2, Lorg/json/JSONArray;

    .line 471
    .line 472
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 476
    .line 477
    .line 478
    move-result v3

    .line 479
    const/4 v4, 0x0

    .line 480
    :goto_13
    if-lt v4, v3, :cond_16

    .line 481
    .line 482
    invoke-virtual {v0, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 483
    .line 484
    .line 485
    new-instance v1, Lorg/json/JSONObject;

    .line 486
    .line 487
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 488
    .line 489
    .line 490
    const-string v2, "auto"

    .line 491
    .line 492
    move-object/from16 v7, v41

    .line 493
    .line 494
    invoke-virtual {v1, v7, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    const-string v2, "disable_parallel_tool_use"

    .line 499
    .line 500
    const/4 v3, 0x0

    .line 501
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    const-string v2, "tool_choice"

    .line 506
    .line 507
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 508
    .line 509
    .line 510
    goto/16 :goto_51

    .line 511
    .line 512
    :cond_16
    move-object/from16 v7, v41

    .line 513
    .line 514
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 515
    .line 516
    .line 517
    move-result-object v5

    .line 518
    move-object/from16 v8, v38

    .line 519
    .line 520
    if-eqz v5, :cond_18

    .line 521
    .line 522
    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 523
    .line 524
    .line 525
    move-result-object v5

    .line 526
    if-eqz v5, :cond_18

    .line 527
    .line 528
    new-instance v9, Lorg/json/JSONObject;

    .line 529
    .line 530
    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 531
    .line 532
    .line 533
    move-object/from16 v10, v34

    .line 534
    .line 535
    invoke-virtual {v5, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v11

    .line 539
    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 540
    .line 541
    .line 542
    move-object/from16 v11, v35

    .line 543
    .line 544
    invoke-virtual {v5, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v12

    .line 548
    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 549
    .line 550
    .line 551
    move-object/from16 v12, v33

    .line 552
    .line 553
    invoke-virtual {v5, v12}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 554
    .line 555
    .line 556
    move-result-object v5

    .line 557
    if-eqz v5, :cond_17

    .line 558
    .line 559
    move-object/from16 v13, v32

    .line 560
    .line 561
    goto :goto_14

    .line 562
    :cond_17
    new-instance v5, Lorg/json/JSONObject;

    .line 563
    .line 564
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 565
    .line 566
    .line 567
    move-object/from16 v13, v32

    .line 568
    .line 569
    invoke-virtual {v5, v7, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 570
    .line 571
    .line 572
    move-result-object v5

    .line 573
    :goto_14
    const-string v14, "input_schema"

    .line 574
    .line 575
    invoke-virtual {v9, v14, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v2, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 579
    .line 580
    .line 581
    goto :goto_15

    .line 582
    :cond_18
    move-object/from16 v13, v32

    .line 583
    .line 584
    move-object/from16 v12, v33

    .line 585
    .line 586
    move-object/from16 v10, v34

    .line 587
    .line 588
    move-object/from16 v11, v35

    .line 589
    .line 590
    :goto_15
    add-int/lit8 v4, v4, 0x1

    .line 591
    .line 592
    move-object/from16 v41, v7

    .line 593
    .line 594
    move-object/from16 v38, v8

    .line 595
    .line 596
    move-object/from16 v34, v10

    .line 597
    .line 598
    move-object/from16 v35, v11

    .line 599
    .line 600
    move-object/from16 v33, v12

    .line 601
    .line 602
    move-object/from16 v32, v13

    .line 603
    .line 604
    goto :goto_13

    .line 605
    :cond_19
    move-object/from16 v50, v7

    .line 606
    .line 607
    move-object v7, v6

    .line 608
    move-object/from16 v6, v40

    .line 609
    .line 610
    move-object/from16 v40, v35

    .line 611
    .line 612
    move-object/from16 v35, v32

    .line 613
    .line 614
    move/from16 v32, v10

    .line 615
    .line 616
    move-object/from16 v10, v37

    .line 617
    .line 618
    move-object/from16 v37, v50

    .line 619
    .line 620
    move-object/from16 v50, v34

    .line 621
    .line 622
    move-object/from16 v34, v14

    .line 623
    .line 624
    move-object/from16 v14, v50

    .line 625
    .line 626
    move-object/from16 v50, v33

    .line 627
    .line 628
    move-object/from16 v33, v15

    .line 629
    .line 630
    move-object/from16 v15, v38

    .line 631
    .line 632
    move-object/from16 v38, v50

    .line 633
    .line 634
    invoke-virtual {v10, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 635
    .line 636
    .line 637
    move-result-object v3

    .line 638
    move/from16 v41, v1

    .line 639
    .line 640
    if-eqz v3, :cond_34

    .line 641
    .line 642
    move-object/from16 v1, v24

    .line 643
    .line 644
    move-object/from16 v24, v10

    .line 645
    .line 646
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v10

    .line 650
    invoke-static {v10, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move-result v42

    .line 654
    if-nez v42, :cond_31

    .line 655
    .line 656
    move-object/from16 v42, v13

    .line 657
    .line 658
    move-object/from16 v13, v23

    .line 659
    .line 660
    invoke-static {v10, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    move-result v23

    .line 664
    if-eqz v23, :cond_1a

    .line 665
    .line 666
    move-object/from16 v23, v13

    .line 667
    .line 668
    :goto_16
    move-object/from16 v43, v1

    .line 669
    .line 670
    move-object/from16 v46, v15

    .line 671
    .line 672
    move-object/from16 v49, v16

    .line 673
    .line 674
    move-object/from16 v13, v19

    .line 675
    .line 676
    move-object/from16 v48, v27

    .line 677
    .line 678
    move-object/from16 v10, v28

    .line 679
    .line 680
    move-object/from16 v44, v29

    .line 681
    .line 682
    move-object/from16 v15, v36

    .line 683
    .line 684
    move-object/from16 v29, v6

    .line 685
    .line 686
    move-object/from16 v16, v12

    .line 687
    .line 688
    move-object/from16 v6, v37

    .line 689
    .line 690
    move-object/from16 v37, v8

    .line 691
    .line 692
    move-object/from16 v8, v20

    .line 693
    .line 694
    move-object/from16 v20, v22

    .line 695
    .line 696
    goto/16 :goto_2c

    .line 697
    .line 698
    :cond_1a
    move-object/from16 v23, v13

    .line 699
    .line 700
    move-object/from16 v13, v30

    .line 701
    .line 702
    invoke-static {v10, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 703
    .line 704
    .line 705
    move-result v0

    .line 706
    if-eqz v0, :cond_1e

    .line 707
    .line 708
    new-instance v4, Lorg/json/JSONArray;

    .line 709
    .line 710
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 711
    .line 712
    .line 713
    const-string v0, "tool_result"

    .line 714
    .line 715
    move-object/from16 v30, v13

    .line 716
    .line 717
    invoke-static {v7, v0}, Lwb/en;->k(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 718
    .line 719
    .line 720
    move-result-object v13

    .line 721
    const-string v0, "tool_use_id"

    .line 722
    .line 723
    move-object/from16 v43, v1

    .line 724
    .line 725
    move-object/from16 v1, v29

    .line 726
    .line 727
    move-object/from16 v29, v6

    .line 728
    .line 729
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v6

    .line 733
    invoke-virtual {v13, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 734
    .line 735
    .line 736
    move-object/from16 v6, v37

    .line 737
    .line 738
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    invoke-static {v0}, Lig/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    invoke-virtual {v13, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    move-object/from16 v37, v0

    .line 754
    .line 755
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 756
    .line 757
    move-object/from16 v44, v1

    .line 758
    .line 759
    :try_start_1
    invoke-static/range {v37 .. v37}, Lig/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v1

    .line 763
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 764
    .line 765
    .line 766
    const-string v1, "isError"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 767
    .line 768
    move-object/from16 v37, v8

    .line 769
    .line 770
    const/4 v8, 0x0

    .line 771
    :try_start_2
    invoke-virtual {v0, v1, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 772
    .line 773
    .line 774
    move-result v1

    .line 775
    if-nez v1, :cond_1c

    .line 776
    .line 777
    const-string v1, "error"

    .line 778
    .line 779
    invoke-virtual {v0, v1, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 780
    .line 781
    .line 782
    move-result v0

    .line 783
    if-eqz v0, :cond_1b

    .line 784
    .line 785
    goto :goto_17

    .line 786
    :cond_1b
    const/4 v0, 0x0

    .line 787
    goto :goto_18

    .line 788
    :catchall_0
    move-exception v0

    .line 789
    goto :goto_1a

    .line 790
    :cond_1c
    :goto_17
    move/from16 v0, v39

    .line 791
    .line 792
    :goto_18
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 793
    .line 794
    .line 795
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 796
    goto :goto_1b

    .line 797
    :catchall_1
    move-exception v0

    .line 798
    :goto_19
    move-object/from16 v37, v8

    .line 799
    .line 800
    goto :goto_1a

    .line 801
    :catchall_2
    move-exception v0

    .line 802
    move-object/from16 v44, v1

    .line 803
    .line 804
    goto :goto_19

    .line 805
    :goto_1a
    new-instance v1, Lsf/f;

    .line 806
    .line 807
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 808
    .line 809
    .line 810
    move-object v0, v1

    .line 811
    :goto_1b
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 812
    .line 813
    instance-of v8, v0, Lsf/f;

    .line 814
    .line 815
    if-eqz v8, :cond_1d

    .line 816
    .line 817
    move-object v0, v1

    .line 818
    :cond_1d
    check-cast v0, Ljava/lang/Boolean;

    .line 819
    .line 820
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 821
    .line 822
    .line 823
    move-result v0

    .line 824
    const-string v1, "is_error"

    .line 825
    .line 826
    invoke-virtual {v13, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 827
    .line 828
    .line 829
    invoke-virtual {v4, v13}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    :goto_1c
    move-object/from16 v4, v28

    .line 834
    .line 835
    goto :goto_1f

    .line 836
    :cond_1e
    move-object/from16 v43, v1

    .line 837
    .line 838
    move-object/from16 v30, v13

    .line 839
    .line 840
    move-object/from16 v44, v29

    .line 841
    .line 842
    move-object/from16 v29, v6

    .line 843
    .line 844
    move-object/from16 v6, v37

    .line 845
    .line 846
    move-object/from16 v37, v8

    .line 847
    .line 848
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    instance-of v1, v0, Lorg/json/JSONArray;

    .line 853
    .line 854
    if-nez v1, :cond_20

    .line 855
    .line 856
    invoke-static {v0}, Lig/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    new-instance v1, Lorg/json/JSONArray;

    .line 861
    .line 862
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 863
    .line 864
    .line 865
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 866
    .line 867
    .line 868
    move-result v4

    .line 869
    if-nez v4, :cond_1f

    .line 870
    .line 871
    new-instance v4, Lorg/json/JSONObject;

    .line 872
    .line 873
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v4, v7, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 877
    .line 878
    .line 879
    move-result-object v4

    .line 880
    invoke-virtual {v4, v11, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 881
    .line 882
    .line 883
    move-result-object v0

    .line 884
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 885
    .line 886
    .line 887
    :cond_1f
    :goto_1d
    move-object v0, v1

    .line 888
    goto :goto_1c

    .line 889
    :cond_20
    new-instance v1, Lorg/json/JSONArray;

    .line 890
    .line 891
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 892
    .line 893
    .line 894
    move-object v8, v0

    .line 895
    check-cast v8, Lorg/json/JSONArray;

    .line 896
    .line 897
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    .line 898
    .line 899
    .line 900
    move-result v13

    .line 901
    const/4 v0, 0x0

    .line 902
    :goto_1e
    if-lt v0, v13, :cond_27

    .line 903
    .line 904
    goto :goto_1d

    .line 905
    :goto_1f
    invoke-static {v10, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 906
    .line 907
    .line 908
    move-result v1

    .line 909
    if-eqz v1, :cond_22

    .line 910
    .line 911
    move-object/from16 v1, v16

    .line 912
    .line 913
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 914
    .line 915
    .line 916
    move-result-object v3

    .line 917
    if-eqz v3, :cond_21

    .line 918
    .line 919
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 920
    .line 921
    .line 922
    move-result v8

    .line 923
    const/4 v13, 0x0

    .line 924
    :goto_20
    if-lt v13, v8, :cond_23

    .line 925
    .line 926
    :cond_21
    move-object/from16 v16, v1

    .line 927
    .line 928
    :cond_22
    move-object/from16 v46, v15

    .line 929
    .line 930
    move-object/from16 v13, v27

    .line 931
    .line 932
    move-object/from16 v15, v36

    .line 933
    .line 934
    goto/16 :goto_23

    .line 935
    .line 936
    :cond_23
    move-object/from16 v16, v1

    .line 937
    .line 938
    invoke-virtual {v3, v13}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 939
    .line 940
    .line 941
    move-result-object v1

    .line 942
    move-object/from16 v28, v3

    .line 943
    .line 944
    if-eqz v1, :cond_25

    .line 945
    .line 946
    invoke-virtual {v1, v15}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 947
    .line 948
    .line 949
    move-result-object v3

    .line 950
    move/from16 v45, v8

    .line 951
    .line 952
    if-eqz v3, :cond_24

    .line 953
    .line 954
    new-instance v8, Ljava/lang/StringBuilder;

    .line 955
    .line 956
    move-object/from16 v46, v15

    .line 957
    .line 958
    const-string v15, "toolu_"

    .line 959
    .line 960
    invoke-direct {v8, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 961
    .line 962
    .line 963
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 964
    .line 965
    .line 966
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v8

    .line 970
    move-object/from16 v15, v36

    .line 971
    .line 972
    invoke-virtual {v1, v15, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 973
    .line 974
    .line 975
    move-result-object v1

    .line 976
    invoke-virtual {v3, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v8

    .line 980
    move/from16 v36, v13

    .line 981
    .line 982
    const-string v13, "tool_use"

    .line 983
    .line 984
    invoke-static {v7, v13, v15, v1}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 985
    .line 986
    .line 987
    move-result-object v1

    .line 988
    invoke-virtual {v1, v14, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 989
    .line 990
    .line 991
    move-object/from16 v8, v22

    .line 992
    .line 993
    move-object/from16 v13, v27

    .line 994
    .line 995
    invoke-virtual {v3, v13, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v3

    .line 999
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1000
    .line 1001
    .line 1002
    invoke-static {v3}, Lig/a;->K(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v3

    .line 1006
    const-string v8, "input"

    .line 1007
    .line 1008
    invoke-virtual {v1, v8, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1012
    .line 1013
    .line 1014
    goto :goto_22

    .line 1015
    :cond_24
    :goto_21
    move-object/from16 v46, v15

    .line 1016
    .line 1017
    move-object/from16 v15, v36

    .line 1018
    .line 1019
    move/from16 v36, v13

    .line 1020
    .line 1021
    move-object/from16 v13, v27

    .line 1022
    .line 1023
    goto :goto_22

    .line 1024
    :cond_25
    move/from16 v45, v8

    .line 1025
    .line 1026
    goto :goto_21

    .line 1027
    :goto_22
    add-int/lit8 v1, v36, 0x1

    .line 1028
    .line 1029
    move-object/from16 v27, v13

    .line 1030
    .line 1031
    move-object/from16 v36, v15

    .line 1032
    .line 1033
    move-object/from16 v3, v28

    .line 1034
    .line 1035
    move/from16 v8, v45

    .line 1036
    .line 1037
    move-object/from16 v15, v46

    .line 1038
    .line 1039
    move v13, v1

    .line 1040
    move-object/from16 v1, v16

    .line 1041
    .line 1042
    goto :goto_20

    .line 1043
    :goto_23
    invoke-static {v10, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1044
    .line 1045
    .line 1046
    move-result v1

    .line 1047
    if-eqz v1, :cond_26

    .line 1048
    .line 1049
    move-object v1, v4

    .line 1050
    goto :goto_24

    .line 1051
    :cond_26
    move-object/from16 v1, v17

    .line 1052
    .line 1053
    :goto_24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1054
    .line 1055
    .line 1056
    invoke-static {v12, v1, v0}, Lig/a;->e(Lorg/json/JSONArray;Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 1057
    .line 1058
    .line 1059
    move-object v10, v4

    .line 1060
    move-object/from16 v48, v13

    .line 1061
    .line 1062
    move-object/from16 v49, v16

    .line 1063
    .line 1064
    move-object/from16 v13, v18

    .line 1065
    .line 1066
    move-object/from16 v8, v20

    .line 1067
    .line 1068
    move-object/from16 v20, v22

    .line 1069
    .line 1070
    move-object/from16 v16, v12

    .line 1071
    .line 1072
    :goto_25
    const/4 v12, 0x0

    .line 1073
    goto/16 :goto_2d

    .line 1074
    .line 1075
    :cond_27
    move-object/from16 v46, v27

    .line 1076
    .line 1077
    move-object/from16 v27, v10

    .line 1078
    .line 1079
    move-object/from16 v10, v22

    .line 1080
    .line 1081
    move/from16 v22, v13

    .line 1082
    .line 1083
    move-object/from16 v13, v16

    .line 1084
    .line 1085
    move-object/from16 v16, v12

    .line 1086
    .line 1087
    move-object/from16 v12, v46

    .line 1088
    .line 1089
    move-object/from16 v46, v15

    .line 1090
    .line 1091
    move-object/from16 v15, v36

    .line 1092
    .line 1093
    invoke-virtual {v8, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v4

    .line 1097
    move/from16 v36, v0

    .line 1098
    .line 1099
    if-eqz v4, :cond_29

    .line 1100
    .line 1101
    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    invoke-static {v0, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1106
    .line 1107
    .line 1108
    move-result v45

    .line 1109
    if-eqz v45, :cond_2a

    .line 1110
    .line 1111
    invoke-virtual {v4, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0

    .line 1115
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1116
    .line 1117
    .line 1118
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1119
    .line 1120
    .line 1121
    move-result v4

    .line 1122
    if-nez v4, :cond_28

    .line 1123
    .line 1124
    goto :goto_26

    .line 1125
    :cond_28
    const/4 v0, 0x0

    .line 1126
    :goto_26
    if-eqz v0, :cond_29

    .line 1127
    .line 1128
    new-instance v4, Lorg/json/JSONObject;

    .line 1129
    .line 1130
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {v4, v7, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v4

    .line 1137
    invoke-virtual {v4, v11, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0

    .line 1141
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1142
    .line 1143
    .line 1144
    :cond_29
    move-object/from16 v45, v8

    .line 1145
    .line 1146
    :goto_27
    move-object/from16 v48, v12

    .line 1147
    .line 1148
    move-object/from16 v49, v13

    .line 1149
    .line 1150
    move-object/from16 v13, v19

    .line 1151
    .line 1152
    move-object/from16 v4, v20

    .line 1153
    .line 1154
    move-object/from16 v20, v10

    .line 1155
    .line 1156
    goto/16 :goto_2b

    .line 1157
    .line 1158
    :cond_2a
    move-object/from16 v45, v8

    .line 1159
    .line 1160
    move-object/from16 v8, v21

    .line 1161
    .line 1162
    invoke-static {v0, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1163
    .line 1164
    .line 1165
    move-result v0

    .line 1166
    if-eqz v0, :cond_30

    .line 1167
    .line 1168
    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    move-object/from16 v4, v20

    .line 1173
    .line 1174
    if-eqz v0, :cond_2b

    .line 1175
    .line 1176
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v0

    .line 1180
    goto :goto_28

    .line 1181
    :cond_2b
    const/4 v0, 0x0

    .line 1182
    :goto_28
    if-nez v0, :cond_2c

    .line 1183
    .line 1184
    move-object/from16 v0, v31

    .line 1185
    .line 1186
    :cond_2c
    invoke-static {v0}, Lig/a;->H(Ljava/lang/String;)Lfb/w0;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v0

    .line 1190
    move-object/from16 v21, v8

    .line 1191
    .line 1192
    if-eqz v0, :cond_2f

    .line 1193
    .line 1194
    iget-object v8, v0, Lfb/w0;->c:Ljava/lang/String;

    .line 1195
    .line 1196
    move-object/from16 v20, v10

    .line 1197
    .line 1198
    iget-boolean v10, v0, Lfb/w0;->a:Z

    .line 1199
    .line 1200
    move/from16 v47, v10

    .line 1201
    .line 1202
    const-string v10, "image"

    .line 1203
    .line 1204
    invoke-static {v7, v10}, Lwb/en;->k(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v10

    .line 1208
    move-object/from16 v48, v12

    .line 1209
    .line 1210
    new-instance v12, Lorg/json/JSONObject;

    .line 1211
    .line 1212
    invoke-direct {v12}, Lorg/json/JSONObject;-><init>()V

    .line 1213
    .line 1214
    .line 1215
    if-eqz v47, :cond_2d

    .line 1216
    .line 1217
    const-string v49, "base64"

    .line 1218
    .line 1219
    move-object/from16 v50, v49

    .line 1220
    .line 1221
    move-object/from16 v49, v13

    .line 1222
    .line 1223
    move-object/from16 v13, v50

    .line 1224
    .line 1225
    goto :goto_29

    .line 1226
    :cond_2d
    move-object/from16 v49, v13

    .line 1227
    .line 1228
    move-object v13, v4

    .line 1229
    :goto_29
    invoke-virtual {v12, v7, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1230
    .line 1231
    .line 1232
    if-eqz v47, :cond_2e

    .line 1233
    .line 1234
    const-string v13, "media_type"

    .line 1235
    .line 1236
    iget-object v0, v0, Lfb/w0;->b:Ljava/lang/String;

    .line 1237
    .line 1238
    invoke-virtual {v12, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1239
    .line 1240
    .line 1241
    move-object/from16 v13, v19

    .line 1242
    .line 1243
    invoke-virtual {v12, v13, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1244
    .line 1245
    .line 1246
    goto :goto_2a

    .line 1247
    :cond_2e
    move-object/from16 v13, v19

    .line 1248
    .line 1249
    invoke-virtual {v12, v4, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1250
    .line 1251
    .line 1252
    :goto_2a
    const-string v0, "source"

    .line 1253
    .line 1254
    invoke-virtual {v10, v0, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual {v1, v10}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1258
    .line 1259
    .line 1260
    goto :goto_2b

    .line 1261
    :cond_2f
    move-object/from16 v20, v10

    .line 1262
    .line 1263
    move-object/from16 v48, v12

    .line 1264
    .line 1265
    move-object/from16 v49, v13

    .line 1266
    .line 1267
    move-object/from16 v13, v19

    .line 1268
    .line 1269
    goto :goto_2b

    .line 1270
    :cond_30
    move-object/from16 v21, v8

    .line 1271
    .line 1272
    goto :goto_27

    .line 1273
    :goto_2b
    add-int/lit8 v0, v36, 0x1

    .line 1274
    .line 1275
    move-object/from16 v19, v13

    .line 1276
    .line 1277
    move-object/from16 v36, v15

    .line 1278
    .line 1279
    move-object/from16 v12, v16

    .line 1280
    .line 1281
    move/from16 v13, v22

    .line 1282
    .line 1283
    move-object/from16 v10, v27

    .line 1284
    .line 1285
    move-object/from16 v8, v45

    .line 1286
    .line 1287
    move-object/from16 v15, v46

    .line 1288
    .line 1289
    move-object/from16 v27, v48

    .line 1290
    .line 1291
    move-object/from16 v16, v49

    .line 1292
    .line 1293
    move-object/from16 v22, v20

    .line 1294
    .line 1295
    move-object/from16 v20, v4

    .line 1296
    .line 1297
    goto/16 :goto_1e

    .line 1298
    .line 1299
    :cond_31
    move-object/from16 v42, v13

    .line 1300
    .line 1301
    goto/16 :goto_16

    .line 1302
    .line 1303
    :goto_2c
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v1

    .line 1307
    invoke-static {v1}, Lig/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v1

    .line 1311
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1312
    .line 1313
    .line 1314
    move-result v12

    .line 1315
    if-nez v12, :cond_33

    .line 1316
    .line 1317
    invoke-static {v7, v11, v11, v1}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v1

    .line 1321
    move-object/from16 v19, v13

    .line 1322
    .line 1323
    move-object/from16 v13, v18

    .line 1324
    .line 1325
    const/4 v12, 0x0

    .line 1326
    invoke-virtual {v3, v13, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 1327
    .line 1328
    .line 1329
    move-result v3

    .line 1330
    if-eqz v3, :cond_32

    .line 1331
    .line 1332
    if-eqz p3, :cond_32

    .line 1333
    .line 1334
    new-instance v3, Lorg/json/JSONObject;

    .line 1335
    .line 1336
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v3, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v0

    .line 1343
    invoke-virtual {v1, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1344
    .line 1345
    .line 1346
    :cond_32
    invoke-virtual {v5, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1347
    .line 1348
    .line 1349
    goto :goto_2d

    .line 1350
    :cond_33
    move-object/from16 v19, v13

    .line 1351
    .line 1352
    move-object/from16 v13, v18

    .line 1353
    .line 1354
    goto/16 :goto_25

    .line 1355
    .line 1356
    :cond_34
    move-object/from16 v42, v13

    .line 1357
    .line 1358
    move-object/from16 v46, v15

    .line 1359
    .line 1360
    move-object/from16 v49, v16

    .line 1361
    .line 1362
    move-object/from16 v13, v18

    .line 1363
    .line 1364
    move-object/from16 v43, v24

    .line 1365
    .line 1366
    move-object/from16 v48, v27

    .line 1367
    .line 1368
    move-object/from16 v44, v29

    .line 1369
    .line 1370
    move-object/from16 v15, v36

    .line 1371
    .line 1372
    move-object/from16 v29, v6

    .line 1373
    .line 1374
    move-object/from16 v24, v10

    .line 1375
    .line 1376
    move-object/from16 v16, v12

    .line 1377
    .line 1378
    move-object/from16 v10, v28

    .line 1379
    .line 1380
    move-object/from16 v6, v37

    .line 1381
    .line 1382
    const/4 v12, 0x0

    .line 1383
    move-object/from16 v37, v8

    .line 1384
    .line 1385
    move-object/from16 v8, v20

    .line 1386
    .line 1387
    move-object/from16 v20, v22

    .line 1388
    .line 1389
    :goto_2d
    add-int/lit8 v1, v41, 0x1

    .line 1390
    .line 1391
    move-object v3, v7

    .line 1392
    move-object v7, v6

    .line 1393
    move-object v6, v3

    .line 1394
    move-object/from16 v3, v34

    .line 1395
    .line 1396
    move-object/from16 v34, v14

    .line 1397
    .line 1398
    move-object v14, v3

    .line 1399
    move/from16 v3, p2

    .line 1400
    .line 1401
    move/from16 v4, p3

    .line 1402
    .line 1403
    move-object/from16 v28, v10

    .line 1404
    .line 1405
    move-object/from16 v18, v13

    .line 1406
    .line 1407
    move-object/from16 v36, v15

    .line 1408
    .line 1409
    move-object/from16 v12, v16

    .line 1410
    .line 1411
    move-object/from16 v22, v20

    .line 1412
    .line 1413
    move/from16 v10, v32

    .line 1414
    .line 1415
    move-object/from16 v15, v33

    .line 1416
    .line 1417
    move-object/from16 v32, v35

    .line 1418
    .line 1419
    move-object/from16 v33, v38

    .line 1420
    .line 1421
    move-object/from16 v35, v40

    .line 1422
    .line 1423
    move-object/from16 v13, v42

    .line 1424
    .line 1425
    move-object/from16 v38, v46

    .line 1426
    .line 1427
    move-object/from16 v27, v48

    .line 1428
    .line 1429
    move-object/from16 v16, v49

    .line 1430
    .line 1431
    move-object/from16 v20, v8

    .line 1432
    .line 1433
    move-object/from16 v40, v29

    .line 1434
    .line 1435
    move-object/from16 v8, v37

    .line 1436
    .line 1437
    move-object/from16 v29, v44

    .line 1438
    .line 1439
    move-object/from16 v37, v24

    .line 1440
    .line 1441
    move-object/from16 v24, v43

    .line 1442
    .line 1443
    goto/16 :goto_a

    .line 1444
    .line 1445
    :cond_35
    move-object/from16 v37, v7

    .line 1446
    .line 1447
    move-object v7, v6

    .line 1448
    move-object/from16 v6, v37

    .line 1449
    .line 1450
    move-object/from16 v37, v34

    .line 1451
    .line 1452
    move-object/from16 v34, v14

    .line 1453
    .line 1454
    move-object/from16 v14, v37

    .line 1455
    .line 1456
    move-object/from16 v46, v5

    .line 1457
    .line 1458
    move-object/from16 v37, v8

    .line 1459
    .line 1460
    move-object/from16 v49, v12

    .line 1461
    .line 1462
    move-object/from16 v42, v13

    .line 1463
    .line 1464
    move-object/from16 v13, v18

    .line 1465
    .line 1466
    move-object/from16 v8, v20

    .line 1467
    .line 1468
    move-object/from16 v20, v22

    .line 1469
    .line 1470
    move-object/from16 v43, v24

    .line 1471
    .line 1472
    move-object/from16 v48, v27

    .line 1473
    .line 1474
    move-object/from16 v44, v29

    .line 1475
    .line 1476
    move-object/from16 v38, v33

    .line 1477
    .line 1478
    move-object/from16 v40, v35

    .line 1479
    .line 1480
    const/4 v12, 0x0

    .line 1481
    move-object/from16 v29, v10

    .line 1482
    .line 1483
    move-object/from16 v33, v15

    .line 1484
    .line 1485
    move-object/from16 v10, v28

    .line 1486
    .line 1487
    move-object/from16 v35, v32

    .line 1488
    .line 1489
    move-object/from16 v15, v36

    .line 1490
    .line 1491
    const-string v1, "gemini"

    .line 1492
    .line 1493
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1494
    .line 1495
    .line 1496
    move-result v0

    .line 1497
    const-string v1, "provider_metadata"

    .line 1498
    .line 1499
    if-eqz v0, :cond_5b

    .line 1500
    .line 1501
    invoke-virtual {v2, v9}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v0

    .line 1505
    if-eqz v0, :cond_36

    .line 1506
    .line 1507
    :goto_2e
    move-object v3, v0

    .line 1508
    goto :goto_2f

    .line 1509
    :cond_36
    new-instance v0, Lorg/json/JSONArray;

    .line 1510
    .line 1511
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 1512
    .line 1513
    .line 1514
    goto :goto_2e

    .line 1515
    :goto_2f
    new-instance v4, Lorg/json/JSONArray;

    .line 1516
    .line 1517
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 1518
    .line 1519
    .line 1520
    new-instance v5, Lorg/json/JSONArray;

    .line 1521
    .line 1522
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 1523
    .line 1524
    .line 1525
    new-instance v9, Ljava/util/HashMap;

    .line 1526
    .line 1527
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 1528
    .line 1529
    .line 1530
    new-instance v13, Ljava/util/HashMap;

    .line 1531
    .line 1532
    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 1533
    .line 1534
    .line 1535
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 1536
    .line 1537
    .line 1538
    move-result v12

    .line 1539
    move-object/from16 v16, v8

    .line 1540
    .line 1541
    const/4 v8, 0x0

    .line 1542
    :goto_30
    if-lt v8, v12, :cond_3d

    .line 1543
    .line 1544
    new-instance v0, Lorg/json/JSONObject;

    .line 1545
    .line 1546
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 1547
    .line 1548
    .line 1549
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 1550
    .line 1551
    .line 1552
    move-result v1

    .line 1553
    if-lez v1, :cond_37

    .line 1554
    .line 1555
    new-instance v1, Lorg/json/JSONObject;

    .line 1556
    .line 1557
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 1558
    .line 1559
    .line 1560
    const-string v3, "parts"

    .line 1561
    .line 1562
    invoke-virtual {v1, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v1

    .line 1566
    const-string v3, "systemInstruction"

    .line 1567
    .line 1568
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1569
    .line 1570
    .line 1571
    :cond_37
    const-string v1, "contents"

    .line 1572
    .line 1573
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1574
    .line 1575
    .line 1576
    new-instance v1, Lorg/json/JSONObject;

    .line 1577
    .line 1578
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 1579
    .line 1580
    .line 1581
    move-object/from16 v5, v37

    .line 1582
    .line 1583
    const-wide v3, 0x3fc999999999999aL    # 0.2

    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    invoke-virtual {v2, v5, v3, v4}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 1589
    .line 1590
    .line 1591
    move-result-wide v3

    .line 1592
    invoke-virtual {v1, v5, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 1593
    .line 1594
    .line 1595
    const-string v3, "response_format"

    .line 1596
    .line 1597
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 1598
    .line 1599
    .line 1600
    move-result v3

    .line 1601
    if-eqz v3, :cond_38

    .line 1602
    .line 1603
    const-string v3, "responseMimeType"

    .line 1604
    .line 1605
    const-string v4, "application/json"

    .line 1606
    .line 1607
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1608
    .line 1609
    .line 1610
    :cond_38
    const-string v3, "generationConfig"

    .line 1611
    .line 1612
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1613
    .line 1614
    .line 1615
    move-object/from16 v1, v29

    .line 1616
    .line 1617
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v2

    .line 1621
    if-eqz v2, :cond_39

    .line 1622
    .line 1623
    new-instance v3, Lorg/json/JSONArray;

    .line 1624
    .line 1625
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 1626
    .line 1627
    .line 1628
    new-instance v4, Lorg/json/JSONObject;

    .line 1629
    .line 1630
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 1631
    .line 1632
    .line 1633
    new-instance v5, Lorg/json/JSONArray;

    .line 1634
    .line 1635
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 1636
    .line 1637
    .line 1638
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 1639
    .line 1640
    .line 1641
    move-result v6

    .line 1642
    const/4 v10, 0x0

    .line 1643
    :goto_31
    if-lt v10, v6, :cond_3a

    .line 1644
    .line 1645
    const-string v2, "functionDeclarations"

    .line 1646
    .line 1647
    invoke-virtual {v4, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v2

    .line 1651
    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v2

    .line 1655
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1656
    .line 1657
    .line 1658
    new-instance v1, Lorg/json/JSONObject;

    .line 1659
    .line 1660
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 1661
    .line 1662
    .line 1663
    new-instance v2, Lorg/json/JSONObject;

    .line 1664
    .line 1665
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 1666
    .line 1667
    .line 1668
    const-string v3, "mode"

    .line 1669
    .line 1670
    const-string v4, "AUTO"

    .line 1671
    .line 1672
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v2

    .line 1676
    const-string v3, "functionCallingConfig"

    .line 1677
    .line 1678
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v1

    .line 1682
    const-string v2, "toolConfig"

    .line 1683
    .line 1684
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1685
    .line 1686
    .line 1687
    :cond_39
    move-object/from16 p2, v0

    .line 1688
    .line 1689
    goto :goto_35

    .line 1690
    :cond_3a
    invoke-virtual {v2, v10}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v8

    .line 1694
    move-object/from16 v9, v46

    .line 1695
    .line 1696
    if-eqz v8, :cond_3c

    .line 1697
    .line 1698
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v8

    .line 1702
    if-eqz v8, :cond_3c

    .line 1703
    .line 1704
    new-instance v11, Lorg/json/JSONObject;

    .line 1705
    .line 1706
    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 1707
    .line 1708
    .line 1709
    invoke-virtual {v8, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v12

    .line 1713
    invoke-virtual {v11, v14, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1714
    .line 1715
    .line 1716
    move-object/from16 v12, v40

    .line 1717
    .line 1718
    invoke-virtual {v8, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v13

    .line 1722
    invoke-virtual {v11, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1723
    .line 1724
    .line 1725
    move-object/from16 v13, v38

    .line 1726
    .line 1727
    invoke-virtual {v8, v13}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v8

    .line 1731
    if-eqz v8, :cond_3b

    .line 1732
    .line 1733
    move-object/from16 v15, v35

    .line 1734
    .line 1735
    :goto_32
    move-object/from16 p2, v0

    .line 1736
    .line 1737
    goto :goto_33

    .line 1738
    :cond_3b
    new-instance v8, Lorg/json/JSONObject;

    .line 1739
    .line 1740
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 1741
    .line 1742
    .line 1743
    move-object/from16 v15, v35

    .line 1744
    .line 1745
    invoke-virtual {v8, v7, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v8

    .line 1749
    goto :goto_32

    .line 1750
    :goto_33
    const-string v0, "parametersJsonSchema"

    .line 1751
    .line 1752
    invoke-virtual {v11, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1753
    .line 1754
    .line 1755
    invoke-virtual {v5, v11}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1756
    .line 1757
    .line 1758
    goto :goto_34

    .line 1759
    :cond_3c
    move-object/from16 p2, v0

    .line 1760
    .line 1761
    move-object/from16 v15, v35

    .line 1762
    .line 1763
    move-object/from16 v13, v38

    .line 1764
    .line 1765
    move-object/from16 v12, v40

    .line 1766
    .line 1767
    :goto_34
    add-int/lit8 v10, v10, 0x1

    .line 1768
    .line 1769
    move-object/from16 v0, p2

    .line 1770
    .line 1771
    move-object/from16 v46, v9

    .line 1772
    .line 1773
    move-object/from16 v40, v12

    .line 1774
    .line 1775
    move-object/from16 v38, v13

    .line 1776
    .line 1777
    move-object/from16 v35, v15

    .line 1778
    .line 1779
    goto/16 :goto_31

    .line 1780
    .line 1781
    :goto_35
    move-object/from16 v0, p2

    .line 1782
    .line 1783
    goto/16 :goto_51

    .line 1784
    .line 1785
    :cond_3d
    move-object/from16 v32, v35

    .line 1786
    .line 1787
    move-object/from16 v35, v40

    .line 1788
    .line 1789
    move-object/from16 v2, v46

    .line 1790
    .line 1791
    const-wide v25, 0x3fc999999999999aL    # 0.2

    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    invoke-virtual {v3, v8}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v0

    .line 1800
    if-eqz v0, :cond_5a

    .line 1801
    .line 1802
    move-object/from16 p3, v3

    .line 1803
    .line 1804
    move/from16 v18, v8

    .line 1805
    .line 1806
    move-object/from16 v3, v43

    .line 1807
    .line 1808
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v8

    .line 1812
    move-object/from16 v24, v3

    .line 1813
    .line 1814
    move-object/from16 v3, v42

    .line 1815
    .line 1816
    invoke-static {v8, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1817
    .line 1818
    .line 1819
    move-result v22

    .line 1820
    if-nez v22, :cond_3e

    .line 1821
    .line 1822
    move-object/from16 v3, v23

    .line 1823
    .line 1824
    invoke-static {v8, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1825
    .line 1826
    .line 1827
    move-result v22

    .line 1828
    if-eqz v22, :cond_3f

    .line 1829
    .line 1830
    move-object/from16 v23, v3

    .line 1831
    .line 1832
    :cond_3e
    move-object/from16 v46, v2

    .line 1833
    .line 1834
    move-object/from16 v28, v4

    .line 1835
    .line 1836
    move-object/from16 v27, v5

    .line 1837
    .line 1838
    move-object/from16 v41, v7

    .line 1839
    .line 1840
    move-object/from16 p2, v9

    .line 1841
    .line 1842
    move/from16 v22, v12

    .line 1843
    .line 1844
    move-object v9, v13

    .line 1845
    move-object/from16 v13, v16

    .line 1846
    .line 1847
    move-object/from16 v7, v19

    .line 1848
    .line 1849
    move-object/from16 v12, v49

    .line 1850
    .line 1851
    goto/16 :goto_48

    .line 1852
    .line 1853
    :cond_3f
    move-object/from16 v23, v3

    .line 1854
    .line 1855
    move-object/from16 v3, v30

    .line 1856
    .line 1857
    invoke-static {v8, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1858
    .line 1859
    .line 1860
    move-result v22

    .line 1861
    if-eqz v22, :cond_45

    .line 1862
    .line 1863
    move-object/from16 v30, v3

    .line 1864
    .line 1865
    new-instance v3, Lorg/json/JSONArray;

    .line 1866
    .line 1867
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 1868
    .line 1869
    .line 1870
    move/from16 v22, v12

    .line 1871
    .line 1872
    new-instance v12, Lorg/json/JSONObject;

    .line 1873
    .line 1874
    invoke-direct {v12}, Lorg/json/JSONObject;-><init>()V

    .line 1875
    .line 1876
    .line 1877
    move-object/from16 v27, v5

    .line 1878
    .line 1879
    new-instance v5, Lorg/json/JSONObject;

    .line 1880
    .line 1881
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 1882
    .line 1883
    .line 1884
    move-object/from16 v28, v4

    .line 1885
    .line 1886
    move-object/from16 v41, v7

    .line 1887
    .line 1888
    move-object/from16 v7, v44

    .line 1889
    .line 1890
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v4

    .line 1894
    invoke-virtual {v13, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v34

    .line 1898
    check-cast v34, Ljava/lang/String;

    .line 1899
    .line 1900
    if-eqz v34, :cond_41

    .line 1901
    .line 1902
    invoke-static/range {v34 .. v34}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1903
    .line 1904
    .line 1905
    move-result v36

    .line 1906
    move-object/from16 v44, v7

    .line 1907
    .line 1908
    if-nez v36, :cond_40

    .line 1909
    .line 1910
    move-object/from16 v7, v34

    .line 1911
    .line 1912
    goto :goto_36

    .line 1913
    :cond_40
    const/4 v7, 0x0

    .line 1914
    :goto_36
    if-eqz v7, :cond_42

    .line 1915
    .line 1916
    invoke-virtual {v5, v15, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1917
    .line 1918
    .line 1919
    goto :goto_37

    .line 1920
    :cond_41
    move-object/from16 v44, v7

    .line 1921
    .line 1922
    :cond_42
    :goto_37
    invoke-virtual {v9, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v4

    .line 1926
    check-cast v4, Ljava/lang/String;

    .line 1927
    .line 1928
    if-nez v4, :cond_43

    .line 1929
    .line 1930
    move-object/from16 v4, v31

    .line 1931
    .line 1932
    :cond_43
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1933
    .line 1934
    .line 1935
    move-result v7

    .line 1936
    if-eqz v7, :cond_44

    .line 1937
    .line 1938
    move-object/from16 v4, v30

    .line 1939
    .line 1940
    :cond_44
    invoke-virtual {v5, v14, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1941
    .line 1942
    .line 1943
    new-instance v4, Lorg/json/JSONObject;

    .line 1944
    .line 1945
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 1946
    .line 1947
    .line 1948
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 1949
    .line 1950
    .line 1951
    move-result-object v7

    .line 1952
    invoke-static {v7}, Lig/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 1953
    .line 1954
    .line 1955
    move-result-object v7

    .line 1956
    move-object/from16 p2, v13

    .line 1957
    .line 1958
    const-string v13, "result"

    .line 1959
    .line 1960
    invoke-virtual {v4, v13, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1961
    .line 1962
    .line 1963
    move-result-object v4

    .line 1964
    const-string v7, "response"

    .line 1965
    .line 1966
    invoke-virtual {v5, v7, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1967
    .line 1968
    .line 1969
    const-string v4, "functionResponse"

    .line 1970
    .line 1971
    invoke-virtual {v12, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v4

    .line 1975
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v3

    .line 1979
    goto :goto_39

    .line 1980
    :cond_45
    move-object/from16 v30, v3

    .line 1981
    .line 1982
    move-object/from16 v28, v4

    .line 1983
    .line 1984
    move-object/from16 v27, v5

    .line 1985
    .line 1986
    move-object/from16 v41, v7

    .line 1987
    .line 1988
    move/from16 v22, v12

    .line 1989
    .line 1990
    move-object/from16 p2, v13

    .line 1991
    .line 1992
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 1993
    .line 1994
    .line 1995
    move-result-object v3

    .line 1996
    instance-of v4, v3, Lorg/json/JSONArray;

    .line 1997
    .line 1998
    if-nez v4, :cond_46

    .line 1999
    .line 2000
    new-instance v4, Lorg/json/JSONArray;

    .line 2001
    .line 2002
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 2003
    .line 2004
    .line 2005
    new-instance v5, Lorg/json/JSONObject;

    .line 2006
    .line 2007
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 2008
    .line 2009
    .line 2010
    invoke-static {v3}, Lig/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v3

    .line 2014
    invoke-virtual {v5, v11, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2015
    .line 2016
    .line 2017
    move-result-object v3

    .line 2018
    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 2019
    .line 2020
    .line 2021
    move-result-object v3

    .line 2022
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2023
    .line 2024
    .line 2025
    goto :goto_39

    .line 2026
    :cond_46
    new-instance v4, Lorg/json/JSONArray;

    .line 2027
    .line 2028
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 2029
    .line 2030
    .line 2031
    check-cast v3, Lorg/json/JSONArray;

    .line 2032
    .line 2033
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 2034
    .line 2035
    .line 2036
    move-result v5

    .line 2037
    const/4 v7, 0x0

    .line 2038
    :goto_38
    if-lt v7, v5, :cond_52

    .line 2039
    .line 2040
    move-object v3, v4

    .line 2041
    :goto_39
    invoke-static {v8, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2042
    .line 2043
    .line 2044
    move-result v4

    .line 2045
    if-eqz v4, :cond_50

    .line 2046
    .line 2047
    move-object/from16 v12, v49

    .line 2048
    .line 2049
    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 2050
    .line 2051
    .line 2052
    move-result-object v4

    .line 2053
    if-eqz v4, :cond_47

    .line 2054
    .line 2055
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 2056
    .line 2057
    .line 2058
    move-result v5

    .line 2059
    const/4 v7, 0x0

    .line 2060
    :goto_3a
    if-lt v7, v5, :cond_48

    .line 2061
    .line 2062
    :cond_47
    move-object v7, v9

    .line 2063
    move-object/from16 v9, p2

    .line 2064
    .line 2065
    move-object/from16 p2, v7

    .line 2066
    .line 2067
    move-object/from16 v46, v2

    .line 2068
    .line 2069
    move-object/from16 v7, v48

    .line 2070
    .line 2071
    goto/16 :goto_42

    .line 2072
    .line 2073
    :cond_48
    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 2074
    .line 2075
    .line 2076
    move-result-object v0

    .line 2077
    if-eqz v0, :cond_4f

    .line 2078
    .line 2079
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 2080
    .line 2081
    .line 2082
    move-result-object v13

    .line 2083
    if-eqz v13, :cond_4f

    .line 2084
    .line 2085
    move-object/from16 v46, v2

    .line 2086
    .line 2087
    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2088
    .line 2089
    .line 2090
    move-result-object v2

    .line 2091
    move-object/from16 v34, v4

    .line 2092
    .line 2093
    invoke-virtual {v13, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2094
    .line 2095
    .line 2096
    move-result-object v4

    .line 2097
    invoke-virtual {v9, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2098
    .line 2099
    .line 2100
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2101
    .line 2102
    .line 2103
    move-result-object v0

    .line 2104
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2105
    .line 2106
    .line 2107
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2108
    .line 2109
    .line 2110
    move-result v36

    .line 2111
    if-nez v36, :cond_49

    .line 2112
    .line 2113
    goto :goto_3b

    .line 2114
    :cond_49
    const/4 v0, 0x0

    .line 2115
    :goto_3b
    if-eqz v0, :cond_4b

    .line 2116
    .line 2117
    move/from16 v36, v5

    .line 2118
    .line 2119
    :try_start_3
    new-instance v5, Lorg/json/JSONObject;

    .line 2120
    .line 2121
    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2122
    .line 2123
    .line 2124
    const-string v0, "part"

    .line 2125
    .line 2126
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 2127
    .line 2128
    .line 2129
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 2130
    goto :goto_3c

    .line 2131
    :catchall_3
    move-exception v0

    .line 2132
    new-instance v5, Lsf/f;

    .line 2133
    .line 2134
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 2135
    .line 2136
    .line 2137
    move-object v0, v5

    .line 2138
    :goto_3c
    nop

    .line 2139
    instance-of v5, v0, Lsf/f;

    .line 2140
    .line 2141
    if-eqz v5, :cond_4a

    .line 2142
    .line 2143
    const/4 v0, 0x0

    .line 2144
    :cond_4a
    check-cast v0, Lorg/json/JSONObject;

    .line 2145
    .line 2146
    goto :goto_3d

    .line 2147
    :cond_4b
    move/from16 v36, v5

    .line 2148
    .line 2149
    const/4 v0, 0x0

    .line 2150
    :goto_3d
    const-string v5, "functionCall"

    .line 2151
    .line 2152
    move/from16 v39, v7

    .line 2153
    .line 2154
    if-eqz v0, :cond_4c

    .line 2155
    .line 2156
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 2157
    .line 2158
    .line 2159
    move-result-object v7

    .line 2160
    if-eqz v7, :cond_4c

    .line 2161
    .line 2162
    invoke-virtual {v7, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2163
    .line 2164
    .line 2165
    move-result-object v7

    .line 2166
    goto :goto_3e

    .line 2167
    :cond_4c
    const/4 v7, 0x0

    .line 2168
    :goto_3e
    if-nez v7, :cond_4d

    .line 2169
    .line 2170
    move-object v7, v9

    .line 2171
    move-object/from16 v9, p2

    .line 2172
    .line 2173
    move-object/from16 p2, v7

    .line 2174
    .line 2175
    move-object/from16 v7, v31

    .line 2176
    .line 2177
    goto :goto_3f

    .line 2178
    :cond_4d
    move-object/from16 v50, v9

    .line 2179
    .line 2180
    move-object/from16 v9, p2

    .line 2181
    .line 2182
    move-object/from16 p2, v50

    .line 2183
    .line 2184
    :goto_3f
    invoke-virtual {v9, v2, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2185
    .line 2186
    .line 2187
    if-eqz v0, :cond_4e

    .line 2188
    .line 2189
    move-object/from16 v7, v48

    .line 2190
    .line 2191
    goto :goto_40

    .line 2192
    :cond_4e
    new-instance v0, Lorg/json/JSONObject;

    .line 2193
    .line 2194
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2195
    .line 2196
    .line 2197
    invoke-static {v14, v4}, Lwb/en;->k(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 2198
    .line 2199
    .line 2200
    move-result-object v2

    .line 2201
    move-object/from16 v4, v20

    .line 2202
    .line 2203
    move-object/from16 v7, v48

    .line 2204
    .line 2205
    invoke-virtual {v13, v7, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2206
    .line 2207
    .line 2208
    move-result-object v13

    .line 2209
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2210
    .line 2211
    .line 2212
    invoke-static {v13}, Lig/a;->K(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 2213
    .line 2214
    .line 2215
    move-result-object v13

    .line 2216
    const-string v4, "args"

    .line 2217
    .line 2218
    invoke-virtual {v2, v4, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2219
    .line 2220
    .line 2221
    invoke-virtual {v0, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v0

    .line 2225
    :goto_40
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 2226
    .line 2227
    .line 2228
    goto :goto_41

    .line 2229
    :cond_4f
    move-object/from16 v34, v9

    .line 2230
    .line 2231
    move-object/from16 v9, p2

    .line 2232
    .line 2233
    move-object/from16 p2, v34

    .line 2234
    .line 2235
    move-object/from16 v46, v2

    .line 2236
    .line 2237
    move-object/from16 v34, v4

    .line 2238
    .line 2239
    move/from16 v36, v5

    .line 2240
    .line 2241
    move/from16 v39, v7

    .line 2242
    .line 2243
    move-object/from16 v7, v48

    .line 2244
    .line 2245
    :goto_41
    add-int/lit8 v0, v39, 0x1

    .line 2246
    .line 2247
    move-object v2, v9

    .line 2248
    move-object/from16 v9, p2

    .line 2249
    .line 2250
    move-object/from16 p2, v2

    .line 2251
    .line 2252
    move-object/from16 v48, v7

    .line 2253
    .line 2254
    move-object/from16 v4, v34

    .line 2255
    .line 2256
    move/from16 v5, v36

    .line 2257
    .line 2258
    move-object/from16 v2, v46

    .line 2259
    .line 2260
    move v7, v0

    .line 2261
    goto/16 :goto_3a

    .line 2262
    .line 2263
    :cond_50
    move-object v7, v9

    .line 2264
    move-object/from16 v9, p2

    .line 2265
    .line 2266
    move-object/from16 p2, v7

    .line 2267
    .line 2268
    move-object/from16 v46, v2

    .line 2269
    .line 2270
    move-object/from16 v7, v48

    .line 2271
    .line 2272
    move-object/from16 v12, v49

    .line 2273
    .line 2274
    :goto_42
    invoke-static {v8, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2275
    .line 2276
    .line 2277
    move-result v0

    .line 2278
    if-eqz v0, :cond_51

    .line 2279
    .line 2280
    move-object/from16 v0, v33

    .line 2281
    .line 2282
    goto :goto_43

    .line 2283
    :cond_51
    move-object/from16 v0, v17

    .line 2284
    .line 2285
    :goto_43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2286
    .line 2287
    .line 2288
    move-object/from16 v2, v28

    .line 2289
    .line 2290
    invoke-static {v2, v0, v3}, Lig/a;->e(Lorg/json/JSONArray;Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 2291
    .line 2292
    .line 2293
    move-object/from16 v48, v7

    .line 2294
    .line 2295
    move-object/from16 v13, v16

    .line 2296
    .line 2297
    move-object/from16 v7, v19

    .line 2298
    .line 2299
    move-object/from16 v2, v27

    .line 2300
    .line 2301
    goto/16 :goto_49

    .line 2302
    .line 2303
    :cond_52
    move-object v12, v9

    .line 2304
    move-object/from16 v9, p2

    .line 2305
    .line 2306
    move-object/from16 p2, v12

    .line 2307
    .line 2308
    move-object/from16 v46, v2

    .line 2309
    .line 2310
    move-object/from16 v2, v28

    .line 2311
    .line 2312
    move-object/from16 v12, v49

    .line 2313
    .line 2314
    invoke-virtual {v3, v7}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 2315
    .line 2316
    .line 2317
    move-result-object v13

    .line 2318
    move-object/from16 v34, v3

    .line 2319
    .line 2320
    if-eqz v13, :cond_53

    .line 2321
    .line 2322
    move-object/from16 v2, v41

    .line 2323
    .line 2324
    invoke-virtual {v13, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2325
    .line 2326
    .line 2327
    move-result-object v3

    .line 2328
    invoke-static {v3, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2329
    .line 2330
    .line 2331
    move-result v36

    .line 2332
    if-eqz v36, :cond_54

    .line 2333
    .line 2334
    new-instance v3, Lorg/json/JSONObject;

    .line 2335
    .line 2336
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 2337
    .line 2338
    .line 2339
    invoke-virtual {v13, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2340
    .line 2341
    .line 2342
    move-result-object v13

    .line 2343
    invoke-virtual {v3, v11, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2344
    .line 2345
    .line 2346
    move-result-object v3

    .line 2347
    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 2348
    .line 2349
    .line 2350
    move-object/from16 v41, v2

    .line 2351
    .line 2352
    :cond_53
    :goto_44
    move/from16 v36, v7

    .line 2353
    .line 2354
    move-object/from16 v39, v8

    .line 2355
    .line 2356
    move-object/from16 v13, v16

    .line 2357
    .line 2358
    move-object/from16 v7, v19

    .line 2359
    .line 2360
    move/from16 v16, v5

    .line 2361
    .line 2362
    goto/16 :goto_47

    .line 2363
    .line 2364
    :cond_54
    move-object/from16 v41, v2

    .line 2365
    .line 2366
    move-object/from16 v2, v21

    .line 2367
    .line 2368
    invoke-static {v3, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2369
    .line 2370
    .line 2371
    move-result v3

    .line 2372
    if-eqz v3, :cond_59

    .line 2373
    .line 2374
    invoke-virtual {v13, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 2375
    .line 2376
    .line 2377
    move-result-object v3

    .line 2378
    move-object/from16 v13, v16

    .line 2379
    .line 2380
    if-eqz v3, :cond_55

    .line 2381
    .line 2382
    invoke-virtual {v3, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2383
    .line 2384
    .line 2385
    move-result-object v3

    .line 2386
    goto :goto_45

    .line 2387
    :cond_55
    const/4 v3, 0x0

    .line 2388
    :goto_45
    if-nez v3, :cond_56

    .line 2389
    .line 2390
    move-object/from16 v3, v31

    .line 2391
    .line 2392
    :cond_56
    invoke-static {v3}, Lig/a;->H(Ljava/lang/String;)Lfb/w0;

    .line 2393
    .line 2394
    .line 2395
    move-result-object v3

    .line 2396
    move-object/from16 v21, v2

    .line 2397
    .line 2398
    if-eqz v3, :cond_58

    .line 2399
    .line 2400
    iget-boolean v2, v3, Lfb/w0;->a:Z

    .line 2401
    .line 2402
    if-eqz v2, :cond_57

    .line 2403
    .line 2404
    goto :goto_46

    .line 2405
    :cond_57
    const/4 v3, 0x0

    .line 2406
    :goto_46
    if-eqz v3, :cond_58

    .line 2407
    .line 2408
    new-instance v2, Lorg/json/JSONObject;

    .line 2409
    .line 2410
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 2411
    .line 2412
    .line 2413
    move/from16 v16, v5

    .line 2414
    .line 2415
    new-instance v5, Lorg/json/JSONObject;

    .line 2416
    .line 2417
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 2418
    .line 2419
    .line 2420
    move/from16 v36, v7

    .line 2421
    .line 2422
    const-string v7, "mimeType"

    .line 2423
    .line 2424
    move-object/from16 v39, v8

    .line 2425
    .line 2426
    iget-object v8, v3, Lfb/w0;->b:Ljava/lang/String;

    .line 2427
    .line 2428
    invoke-virtual {v5, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2429
    .line 2430
    .line 2431
    iget-object v3, v3, Lfb/w0;->c:Ljava/lang/String;

    .line 2432
    .line 2433
    move-object/from16 v7, v19

    .line 2434
    .line 2435
    invoke-virtual {v5, v7, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2436
    .line 2437
    .line 2438
    const-string v3, "inlineData"

    .line 2439
    .line 2440
    invoke-virtual {v2, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2441
    .line 2442
    .line 2443
    move-result-object v2

    .line 2444
    invoke-virtual {v4, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 2445
    .line 2446
    .line 2447
    goto :goto_47

    .line 2448
    :cond_58
    move/from16 v16, v5

    .line 2449
    .line 2450
    move/from16 v36, v7

    .line 2451
    .line 2452
    move-object/from16 v39, v8

    .line 2453
    .line 2454
    move-object/from16 v7, v19

    .line 2455
    .line 2456
    goto :goto_47

    .line 2457
    :cond_59
    move-object/from16 v21, v2

    .line 2458
    .line 2459
    goto :goto_44

    .line 2460
    :goto_47
    add-int/lit8 v2, v36, 0x1

    .line 2461
    .line 2462
    move-object v3, v9

    .line 2463
    move-object/from16 v9, p2

    .line 2464
    .line 2465
    move-object/from16 p2, v3

    .line 2466
    .line 2467
    move-object/from16 v19, v7

    .line 2468
    .line 2469
    move-object/from16 v49, v12

    .line 2470
    .line 2471
    move/from16 v5, v16

    .line 2472
    .line 2473
    move-object/from16 v3, v34

    .line 2474
    .line 2475
    move-object/from16 v8, v39

    .line 2476
    .line 2477
    move v7, v2

    .line 2478
    move-object/from16 v16, v13

    .line 2479
    .line 2480
    move-object/from16 v2, v46

    .line 2481
    .line 2482
    goto/16 :goto_38

    .line 2483
    .line 2484
    :goto_48
    new-instance v2, Lorg/json/JSONObject;

    .line 2485
    .line 2486
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 2487
    .line 2488
    .line 2489
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 2490
    .line 2491
    .line 2492
    move-result-object v0

    .line 2493
    invoke-static {v0}, Lig/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 2494
    .line 2495
    .line 2496
    move-result-object v0

    .line 2497
    invoke-virtual {v2, v11, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2498
    .line 2499
    .line 2500
    move-result-object v0

    .line 2501
    move-object/from16 v2, v27

    .line 2502
    .line 2503
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 2504
    .line 2505
    .line 2506
    goto :goto_49

    .line 2507
    :cond_5a
    move-object/from16 v46, v2

    .line 2508
    .line 2509
    move-object/from16 p3, v3

    .line 2510
    .line 2511
    move-object/from16 v28, v4

    .line 2512
    .line 2513
    move-object v2, v5

    .line 2514
    move-object/from16 v41, v7

    .line 2515
    .line 2516
    move/from16 v18, v8

    .line 2517
    .line 2518
    move-object/from16 p2, v9

    .line 2519
    .line 2520
    move/from16 v22, v12

    .line 2521
    .line 2522
    move-object v9, v13

    .line 2523
    move-object/from16 v13, v16

    .line 2524
    .line 2525
    move-object/from16 v7, v19

    .line 2526
    .line 2527
    move-object/from16 v24, v43

    .line 2528
    .line 2529
    move-object/from16 v12, v49

    .line 2530
    .line 2531
    :goto_49
    add-int/lit8 v8, v18, 0x1

    .line 2532
    .line 2533
    move-object/from16 v3, p3

    .line 2534
    .line 2535
    move-object v5, v2

    .line 2536
    move-object/from16 v19, v7

    .line 2537
    .line 2538
    move-object/from16 v49, v12

    .line 2539
    .line 2540
    move-object/from16 v16, v13

    .line 2541
    .line 2542
    move/from16 v12, v22

    .line 2543
    .line 2544
    move-object/from16 v43, v24

    .line 2545
    .line 2546
    move-object/from16 v4, v28

    .line 2547
    .line 2548
    move-object/from16 v40, v35

    .line 2549
    .line 2550
    move-object/from16 v7, v41

    .line 2551
    .line 2552
    move-object/from16 v2, p1

    .line 2553
    .line 2554
    move-object v13, v9

    .line 2555
    move-object/from16 v35, v32

    .line 2556
    .line 2557
    move-object/from16 v9, p2

    .line 2558
    .line 2559
    goto/16 :goto_30

    .line 2560
    .line 2561
    :cond_5b
    move-object/from16 v12, v49

    .line 2562
    .line 2563
    new-instance v0, Lorg/json/JSONObject;

    .line 2564
    .line 2565
    invoke-virtual/range {p1 .. p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 2566
    .line 2567
    .line 2568
    move-result-object v2

    .line 2569
    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2570
    .line 2571
    .line 2572
    move/from16 v3, p2

    .line 2573
    .line 2574
    move-object/from16 v2, v34

    .line 2575
    .line 2576
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 2577
    .line 2578
    .line 2579
    move-result-object v2

    .line 2580
    invoke-virtual {v2, v9}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 2581
    .line 2582
    .line 2583
    move-result-object v3

    .line 2584
    if-eqz v3, :cond_63

    .line 2585
    .line 2586
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 2587
    .line 2588
    .line 2589
    move-result v4

    .line 2590
    const/4 v5, 0x0

    .line 2591
    :goto_4a
    if-lt v5, v4, :cond_5c

    .line 2592
    .line 2593
    goto :goto_50

    .line 2594
    :cond_5c
    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 2595
    .line 2596
    .line 2597
    move-result-object v0

    .line 2598
    if-eqz v0, :cond_62

    .line 2599
    .line 2600
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 2601
    .line 2602
    .line 2603
    const-string v6, "reasoning_content"

    .line 2604
    .line 2605
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 2606
    .line 2607
    .line 2608
    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 2609
    .line 2610
    .line 2611
    move-result-object v6

    .line 2612
    if-eqz v6, :cond_62

    .line 2613
    .line 2614
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    .line 2615
    .line 2616
    .line 2617
    move-result v7

    .line 2618
    const/4 v8, 0x0

    .line 2619
    :goto_4b
    if-lt v8, v7, :cond_5d

    .line 2620
    .line 2621
    goto :goto_4f

    .line 2622
    :cond_5d
    invoke-virtual {v6, v8}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 2623
    .line 2624
    .line 2625
    move-result-object v9

    .line 2626
    if-eqz v9, :cond_61

    .line 2627
    .line 2628
    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 2629
    .line 2630
    .line 2631
    move-result-object v0

    .line 2632
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2633
    .line 2634
    .line 2635
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2636
    .line 2637
    .line 2638
    move-result v10

    .line 2639
    if-nez v10, :cond_5e

    .line 2640
    .line 2641
    goto :goto_4c

    .line 2642
    :cond_5e
    const/4 v0, 0x0

    .line 2643
    :goto_4c
    if-eqz v0, :cond_60

    .line 2644
    .line 2645
    :try_start_4
    new-instance v10, Lorg/json/JSONObject;

    .line 2646
    .line 2647
    invoke-direct {v10, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 2648
    .line 2649
    .line 2650
    goto :goto_4d

    .line 2651
    :catchall_4
    move-exception v0

    .line 2652
    new-instance v10, Lsf/f;

    .line 2653
    .line 2654
    invoke-direct {v10, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 2655
    .line 2656
    .line 2657
    :goto_4d
    instance-of v0, v10, Lsf/f;

    .line 2658
    .line 2659
    if-eqz v0, :cond_5f

    .line 2660
    .line 2661
    const/4 v10, 0x0

    .line 2662
    :cond_5f
    check-cast v10, Lorg/json/JSONObject;

    .line 2663
    .line 2664
    goto :goto_4e

    .line 2665
    :cond_60
    const/4 v10, 0x0

    .line 2666
    :goto_4e
    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 2667
    .line 2668
    .line 2669
    if-eqz v10, :cond_61

    .line 2670
    .line 2671
    const-string v0, "extra_content"

    .line 2672
    .line 2673
    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 2674
    .line 2675
    .line 2676
    move-result-object v10

    .line 2677
    if-eqz v10, :cond_61

    .line 2678
    .line 2679
    invoke-virtual {v9, v0, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2680
    .line 2681
    .line 2682
    :cond_61
    add-int/lit8 v8, v8, 0x1

    .line 2683
    .line 2684
    goto :goto_4b

    .line 2685
    :cond_62
    :goto_4f
    add-int/lit8 v5, v5, 0x1

    .line 2686
    .line 2687
    goto :goto_4a

    .line 2688
    :cond_63
    :goto_50
    move-object v0, v2

    .line 2689
    :cond_64
    :goto_51
    new-instance v1, Lfb/x0;

    .line 2690
    .line 2691
    invoke-static/range {p0 .. p0}, Lig/a;->G(Lfb/v;)Luf/g;

    .line 2692
    .line 2693
    .line 2694
    move-result-object v2

    .line 2695
    invoke-direct {v1, v0, v2}, Lfb/x0;-><init>(Lorg/json/JSONObject;Luf/g;)V

    .line 2696
    .line 2697
    .line 2698
    return-object v1
.end method

.method public static U(Ljava/io/File;[BI)V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/RandomAccessFile;

    .line 2
    .line 3
    const-string v1, "rw"

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    :goto_0
    if-ge p0, p2, :cond_1

    .line 10
    .line 11
    sub-int v1, p2, p0

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v0, p1, p0, v1}, Ljava/io/RandomAccessFile;->read([BII)I

    .line 14
    .line 15
    .line 16
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-gez v1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    add-int/2addr p0, v1

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    invoke-static {v0}, Lig/a;->j(Ljava/io/Closeable;)V

    .line 24
    .line 25
    .line 26
    throw p0

    .line 27
    :cond_1
    :goto_1
    invoke-static {v0}, Lig/a;->j(Ljava/io/Closeable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static V([BII)Lwa/a;
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    if-ge p1, p2, :cond_1

    .line 5
    .line 6
    const/16 v3, 0x40

    .line 7
    .line 8
    if-ge v2, v3, :cond_1

    .line 9
    .line 10
    add-int/lit8 v3, p1, 0x1

    .line 11
    .line 12
    aget-byte p1, p0, p1

    .line 13
    .line 14
    and-int/lit8 v4, p1, 0x7f

    .line 15
    .line 16
    int-to-long v4, v4

    .line 17
    shl-long/2addr v4, v2

    .line 18
    or-long/2addr v0, v4

    .line 19
    and-int/lit16 p1, p1, 0x80

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    new-instance p0, Lwa/a;

    .line 24
    .line 25
    invoke-direct {p0, v0, v1, v3}, Lwa/a;-><init>(JI)V

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    add-int/lit8 v2, v2, 0x7

    .line 30
    .line 31
    move p1, v3

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const-string p0, "bad varint"

    .line 34
    .line 35
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public static final W(J)J
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p0, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const-wide v2, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr p0, v2

    .line 20
    long-to-int p0, p0

    .line 21
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    int-to-long v4, v1

    .line 30
    shl-long v0, v4, v0

    .line 31
    .line 32
    int-to-long p0, p0

    .line 33
    and-long/2addr p0, v2

    .line 34
    or-long/2addr p0, v0

    .line 35
    return-wide p0
.end method

.method public static X(F)I
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const-string p0, "Cannot round NaN value."

    .line 13
    .line 14
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public static Y(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "[^A-Za-z0-9_-]"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v1, "_"

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const/16 v0, 0x60

    .line 24
    .line 25
    invoke-static {v0, p1}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v1, 0x0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_0
    :try_start_0
    invoke-static {p0, p2}, Lig/a;->l(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    .line 39
    .line 40
    .line 41
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p2

    .line 44
    new-instance v0, Lsf/f;

    .line 45
    .line 46
    invoke-direct {v0, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object p2, v0

    .line 50
    :goto_0
    nop

    .line 51
    instance-of v0, p2, Lsf/f;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    move-object p2, v1

    .line 56
    :cond_1
    check-cast p2, Landroid/graphics/Bitmap;

    .line 57
    .line 58
    if-eqz p2, :cond_6

    .line 59
    .line 60
    new-instance v0, Ljava/io/File;

    .line 61
    .line 62
    invoke-static {p0}, Lub/b;->d(Landroid/content/Context;)Ljava/io/File;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const-string v2, "FloatingShortcut/icons"

    .line 67
    .line 68
    invoke-direct {v0, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 72
    .line 73
    .line 74
    new-instance p0, Ljava/io/File;

    .line 75
    .line 76
    const-string v2, ".png"

    .line 77
    .line 78
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-direct {p0, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    new-instance v2, Ljava/io/File;

    .line 86
    .line 87
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 88
    .line 89
    .line 90
    move-result-wide v3

    .line 91
    const-string v5, "."

    .line 92
    .line 93
    const-string v6, "-"

    .line 94
    .line 95
    invoke-static {v5, p1, v6, v3, v4}, Leh/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    const-string v3, ".tmp"

    .line 100
    .line 101
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-direct {v2, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :try_start_1
    new-instance p1, Ljava/io/FileOutputStream;

    .line 112
    .line 113
    invoke-direct {p1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 114
    .line 115
    .line 116
    :try_start_2
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 117
    .line 118
    const/16 v3, 0x64

    .line 119
    .line 120
    invoke-virtual {p2, v0, v3, p1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_5

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 131
    .line 132
    .line 133
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_3

    .line 141
    .line 142
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-eqz p1, :cond_2

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 150
    .line 151
    const-string p1, "\u65e0\u6cd5\u66ff\u6362\u65e7\u56fe\u6807"

    .line 152
    .line 153
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw p0

    .line 157
    :cond_3
    :goto_1
    invoke-virtual {v2, p0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-nez p1, :cond_4

    .line 162
    .line 163
    invoke-static {v2, p0}, Ldg/l;->a0(Ljava/io/File;Ljava/io/File;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 167
    .line 168
    .line 169
    :cond_4
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 173
    :goto_2
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->recycle()V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :catchall_1
    move-exception p0

    .line 178
    goto :goto_3

    .line 179
    :cond_5
    :try_start_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 180
    .line 181
    const-string v0, "Check failed."

    .line 182
    .line 183
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 187
    :goto_3
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 188
    :catchall_2
    move-exception v0

    .line 189
    :try_start_6
    invoke-static {p1, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 193
    :catchall_3
    :try_start_7
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :goto_4
    return-object v1

    .line 198
    :catchall_4
    move-exception p0

    .line 199
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->recycle()V

    .line 200
    .line 201
    .line 202
    throw p0

    .line 203
    :cond_6
    :goto_5
    return-object v1
.end method

.method public static Z([B)Lorg/json/JSONObject;
    .locals 5

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    :try_start_0
    new-array p0, v1, [B

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    array-length v2, p0

    .line 13
    const/4 v3, 0x4

    .line 14
    if-lt v2, v3, :cond_1

    .line 15
    .line 16
    aget-byte v2, p0, v1

    .line 17
    .line 18
    and-int/lit16 v2, v2, 0xff

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v2, v1

    .line 25
    :goto_0
    if-nez v2, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    array-length v2, p0

    .line 29
    sub-int/2addr v2, v3

    .line 30
    new-array v4, v2, [B

    .line 31
    .line 32
    invoke-static {p0, v3, v4, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    .line 35
    move-object p0, v4

    .line 36
    :goto_1
    array-length v2, p0

    .line 37
    invoke-static {v0, p0, v2, v1}, Lig/a;->Q(Lorg/json/JSONObject;[BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    :catchall_0
    return-object v0
.end method

.method public static final a(ZLs0/d;Lsh/y;Lsh/g0;Lfg/a;Lfg/a;FLs0/d;Li0/h0;I)V
    .locals 46

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move-object/from16 v10, p4

    .line 8
    .line 9
    move-object/from16 v11, p5

    .line 10
    .line 11
    move-object/from16 v15, p8

    .line 12
    .line 13
    move/from16 v12, p9

    .line 14
    .line 15
    const v0, -0xd6a8295

    .line 16
    .line 17
    .line 18
    invoke-virtual {v15, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 19
    .line 20
    .line 21
    and-int/lit8 v0, v12, 0x6

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v15, v1}, Li0/h0;->g(Z)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x2

    .line 34
    :goto_0
    or-int/2addr v0, v12

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v0, v12

    .line 37
    :goto_1
    and-int/lit8 v2, v12, 0x30

    .line 38
    .line 39
    if-nez v2, :cond_3

    .line 40
    .line 41
    invoke-virtual {v15, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    const/16 v2, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v2, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v0, v2

    .line 53
    :cond_3
    and-int/lit16 v2, v12, 0x180

    .line 54
    .line 55
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 56
    .line 57
    if-nez v2, :cond_5

    .line 58
    .line 59
    invoke-virtual {v15, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    const/16 v2, 0x100

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v2, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr v0, v2

    .line 71
    :cond_5
    and-int/lit16 v2, v12, 0xc00

    .line 72
    .line 73
    if-nez v2, :cond_7

    .line 74
    .line 75
    invoke-virtual {v15, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_6

    .line 80
    .line 81
    const/16 v2, 0x800

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_6
    const/16 v2, 0x400

    .line 85
    .line 86
    :goto_4
    or-int/2addr v0, v2

    .line 87
    :cond_7
    and-int/lit16 v2, v12, 0x6000

    .line 88
    .line 89
    if-nez v2, :cond_9

    .line 90
    .line 91
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    invoke-virtual {v15, v2}, Li0/h0;->d(I)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_8

    .line 100
    .line 101
    const/16 v2, 0x4000

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_8
    const/16 v2, 0x2000

    .line 105
    .line 106
    :goto_5
    or-int/2addr v0, v2

    .line 107
    :cond_9
    const/high16 v2, 0x30000

    .line 108
    .line 109
    and-int/2addr v2, v12

    .line 110
    const/4 v5, 0x1

    .line 111
    if-nez v2, :cond_b

    .line 112
    .line 113
    invoke-virtual {v15, v5}, Li0/h0;->g(Z)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_a

    .line 118
    .line 119
    const/high16 v2, 0x20000

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_a
    const/high16 v2, 0x10000

    .line 123
    .line 124
    :goto_6
    or-int/2addr v0, v2

    .line 125
    :cond_b
    const/high16 v2, 0x180000

    .line 126
    .line 127
    and-int/2addr v2, v12

    .line 128
    if-nez v2, :cond_d

    .line 129
    .line 130
    invoke-virtual {v15, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_c

    .line 135
    .line 136
    const/high16 v2, 0x100000

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_c
    const/high16 v2, 0x80000

    .line 140
    .line 141
    :goto_7
    or-int/2addr v0, v2

    .line 142
    :cond_d
    const/high16 v2, 0xc00000

    .line 143
    .line 144
    and-int/2addr v2, v12

    .line 145
    if-nez v2, :cond_f

    .line 146
    .line 147
    invoke-virtual {v15, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_e

    .line 152
    .line 153
    const/high16 v2, 0x800000

    .line 154
    .line 155
    goto :goto_8

    .line 156
    :cond_e
    const/high16 v2, 0x400000

    .line 157
    .line 158
    :goto_8
    or-int/2addr v0, v2

    .line 159
    :cond_f
    const/high16 v2, 0x6000000

    .line 160
    .line 161
    and-int/2addr v2, v12

    .line 162
    const/4 v6, 0x0

    .line 163
    if-nez v2, :cond_11

    .line 164
    .line 165
    invoke-virtual {v15, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_10

    .line 170
    .line 171
    const/high16 v2, 0x4000000

    .line 172
    .line 173
    goto :goto_9

    .line 174
    :cond_10
    const/high16 v2, 0x2000000

    .line 175
    .line 176
    :goto_9
    or-int/2addr v0, v2

    .line 177
    :cond_11
    const/high16 v2, 0x30000000

    .line 178
    .line 179
    and-int/2addr v2, v12

    .line 180
    if-nez v2, :cond_13

    .line 181
    .line 182
    move/from16 v2, p6

    .line 183
    .line 184
    invoke-virtual {v15, v2}, Li0/h0;->c(F)Z

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    if-eqz v7, :cond_12

    .line 189
    .line 190
    const/high16 v7, 0x20000000

    .line 191
    .line 192
    goto :goto_a

    .line 193
    :cond_12
    const/high16 v7, 0x10000000

    .line 194
    .line 195
    :goto_a
    or-int/2addr v0, v7

    .line 196
    :goto_b
    move/from16 v16, v0

    .line 197
    .line 198
    goto :goto_c

    .line 199
    :cond_13
    move/from16 v2, p6

    .line 200
    .line 201
    goto :goto_b

    .line 202
    :goto_c
    const v0, 0x12492493

    .line 203
    .line 204
    .line 205
    and-int v0, v16, v0

    .line 206
    .line 207
    const v7, 0x12492492

    .line 208
    .line 209
    .line 210
    const/16 v17, 0x2

    .line 211
    .line 212
    if-ne v0, v7, :cond_14

    .line 213
    .line 214
    const/4 v0, 0x0

    .line 215
    goto :goto_d

    .line 216
    :cond_14
    move v0, v5

    .line 217
    :goto_d
    and-int/lit8 v7, v16, 0x1

    .line 218
    .line 219
    invoke-virtual {v15, v7, v0}, Li0/h0;->S(IZ)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_5c

    .line 224
    .line 225
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    const v7, 0x3c23d70a    # 0.01f

    .line 230
    .line 231
    .line 232
    const/4 v14, 0x0

    .line 233
    sget-object v13, Li0/l;->a:Li0/e;

    .line 234
    .line 235
    if-ne v0, v13, :cond_15

    .line 236
    .line 237
    invoke-static {v14, v7}, Li/d;->a(FF)Li/c;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v15, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :cond_15
    check-cast v0, Li/c;

    .line 245
    .line 246
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    if-ne v3, v13, :cond_16

    .line 251
    .line 252
    invoke-static {v14, v7}, Li/d;->a(FF)Li/c;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-virtual {v15, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    :cond_16
    check-cast v3, Li/c;

    .line 260
    .line 261
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    if-ne v5, v13, :cond_17

    .line 266
    .line 267
    invoke-static {v14, v7}, Li/d;->a(FF)Li/c;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    invoke-virtual {v15, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    :cond_17
    check-cast v5, Li/c;

    .line 275
    .line 276
    invoke-static {v10, v15}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 277
    .line 278
    .line 279
    move-result-object v20

    .line 280
    move-object v7, v6

    .line 281
    invoke-static {v11, v15}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v7

    .line 289
    if-ne v7, v13, :cond_18

    .line 290
    .line 291
    invoke-static {v15}, Li0/r;->n(Li0/h0;)Lqg/t;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    invoke-virtual {v15, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    :cond_18
    move-object/from16 v22, v7

    .line 299
    .line 300
    check-cast v22, Lqg/t;

    .line 301
    .line 302
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    if-ne v7, v13, :cond_19

    .line 307
    .line 308
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 309
    .line 310
    invoke-static {v7}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 311
    .line 312
    .line 313
    move-result-object v7

    .line 314
    invoke-virtual {v15, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    :cond_19
    check-cast v7, Li0/a1;

    .line 318
    .line 319
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 320
    .line 321
    .line 322
    move-result-object v14

    .line 323
    and-int/lit8 v1, v16, 0xe

    .line 324
    .line 325
    const/4 v2, 0x4

    .line 326
    if-ne v1, v2, :cond_1a

    .line 327
    .line 328
    const/4 v1, 0x1

    .line 329
    goto :goto_e

    .line 330
    :cond_1a
    const/4 v1, 0x0

    .line 331
    :goto_e
    invoke-virtual {v15, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    or-int/2addr v1, v2

    .line 336
    invoke-virtual {v15, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    or-int/2addr v1, v2

    .line 341
    invoke-virtual {v15, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    or-int/2addr v1, v2

    .line 346
    invoke-virtual {v15, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    or-int/2addr v1, v2

    .line 351
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    if-nez v1, :cond_1b

    .line 356
    .line 357
    if-ne v2, v13, :cond_1c

    .line 358
    .line 359
    :cond_1b
    move-object v1, v4

    .line 360
    move-object v4, v0

    .line 361
    goto :goto_f

    .line 362
    :cond_1c
    move-object/from16 v19, v0

    .line 363
    .line 364
    move-object/from16 v23, v3

    .line 365
    .line 366
    move-object v8, v4

    .line 367
    move-object/from16 v24, v5

    .line 368
    .line 369
    move-object/from16 v25, v7

    .line 370
    .line 371
    const/16 v9, 0x20

    .line 372
    .line 373
    goto :goto_10

    .line 374
    :goto_f
    new-instance v0, Lxh/p;

    .line 375
    .line 376
    move-object v2, v7

    .line 377
    const/4 v7, 0x0

    .line 378
    const/16 v9, 0x20

    .line 379
    .line 380
    move-object v8, v1

    .line 381
    move/from16 v1, p0

    .line 382
    .line 383
    invoke-direct/range {v0 .. v7}, Lxh/p;-><init>(ZLi0/a1;Li/c;Li/c;Li/c;Li0/a1;Lwf/c;)V

    .line 384
    .line 385
    .line 386
    move-object/from16 v25, v2

    .line 387
    .line 388
    move-object/from16 v23, v3

    .line 389
    .line 390
    move-object/from16 v19, v4

    .line 391
    .line 392
    move-object/from16 v24, v5

    .line 393
    .line 394
    invoke-virtual {v15, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    move-object v2, v0

    .line 398
    :goto_10
    check-cast v2, Lfg/p;

    .line 399
    .line 400
    invoke-static {v2, v15, v14}, Li0/r;->f(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    if-nez p0, :cond_1d

    .line 404
    .line 405
    invoke-interface/range {v25 .. v25}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    check-cast v0, Ljava/lang/Boolean;

    .line 410
    .line 411
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    if-nez v0, :cond_1d

    .line 416
    .line 417
    invoke-virtual {v15}, Li0/h0;->t()Li0/r1;

    .line 418
    .line 419
    .line 420
    move-result-object v13

    .line 421
    if-eqz v13, :cond_5d

    .line 422
    .line 423
    new-instance v0, Lxh/j;

    .line 424
    .line 425
    const/4 v10, 0x0

    .line 426
    move/from16 v1, p0

    .line 427
    .line 428
    move-object/from16 v2, p1

    .line 429
    .line 430
    move-object/from16 v3, p2

    .line 431
    .line 432
    move-object/from16 v4, p3

    .line 433
    .line 434
    move-object/from16 v5, p4

    .line 435
    .line 436
    move/from16 v7, p6

    .line 437
    .line 438
    move-object/from16 v8, p7

    .line 439
    .line 440
    move-object v6, v11

    .line 441
    move v9, v12

    .line 442
    invoke-direct/range {v0 .. v10}, Lxh/j;-><init>(ZLs0/d;Lsh/y;Lsh/g0;Lfg/a;Lfg/a;FLs0/d;II)V

    .line 443
    .line 444
    .line 445
    iput-object v0, v13, Li0/r1;->d:Lfg/p;

    .line 446
    .line 447
    return-void

    .line 448
    :cond_1d
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    sget-object v1, Lu2/k;->e:Lu2/k;

    .line 453
    .line 454
    if-ne v0, v13, :cond_1e

    .line 455
    .line 456
    invoke-static {v1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    invoke-virtual {v15, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    :cond_1e
    move-object v12, v0

    .line 464
    check-cast v12, Li0/a1;

    .line 465
    .line 466
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    if-ne v0, v13, :cond_1f

    .line 471
    .line 472
    new-instance v0, Lwb/lp;

    .line 473
    .line 474
    const/16 v2, 0x1d

    .line 475
    .line 476
    invoke-direct {v0, v12, v2}, Lwb/lp;-><init>(Li0/a1;I)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v15, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    :cond_1f
    check-cast v0, Lfg/l;

    .line 483
    .line 484
    invoke-static {v8, v0}, Lv1/w;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    invoke-static {v15, v0}, Lp/d;->c(Li0/h0;Ly0/o;)V

    .line 489
    .line 490
    .line 491
    invoke-interface {v12}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    check-cast v0, Lu2/k;

    .line 496
    .line 497
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    if-eqz v0, :cond_20

    .line 502
    .line 503
    invoke-virtual {v15}, Li0/h0;->t()Li0/r1;

    .line 504
    .line 505
    .line 506
    move-result-object v11

    .line 507
    if-eqz v11, :cond_5d

    .line 508
    .line 509
    new-instance v0, Lxh/j;

    .line 510
    .line 511
    const/4 v10, 0x1

    .line 512
    move/from16 v1, p0

    .line 513
    .line 514
    move-object/from16 v2, p1

    .line 515
    .line 516
    move-object/from16 v3, p2

    .line 517
    .line 518
    move-object/from16 v4, p3

    .line 519
    .line 520
    move-object/from16 v5, p4

    .line 521
    .line 522
    move-object/from16 v6, p5

    .line 523
    .line 524
    move/from16 v7, p6

    .line 525
    .line 526
    move-object/from16 v8, p7

    .line 527
    .line 528
    move/from16 v9, p9

    .line 529
    .line 530
    invoke-direct/range {v0 .. v10}, Lxh/j;-><init>(ZLs0/d;Lsh/y;Lsh/g0;Lfg/a;Lfg/a;FLs0/d;II)V

    .line 531
    .line 532
    .line 533
    iput-object v0, v11, Li0/r1;->d:Lfg/p;

    .line 534
    .line 535
    return-void

    .line 536
    :cond_20
    move-object/from16 v3, p2

    .line 537
    .line 538
    move-object/from16 v4, p3

    .line 539
    .line 540
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    const-wide/16 v10, 0x0

    .line 545
    .line 546
    if-ne v0, v13, :cond_21

    .line 547
    .line 548
    new-instance v0, Lu2/l;

    .line 549
    .line 550
    invoke-direct {v0, v10, v11}, Lu2/l;-><init>(J)V

    .line 551
    .line 552
    .line 553
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-virtual {v15, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    :cond_21
    move-object v8, v0

    .line 561
    check-cast v8, Li0/a1;

    .line 562
    .line 563
    invoke-interface {v12}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    move-object v1, v0

    .line 568
    check-cast v1, Lu2/k;

    .line 569
    .line 570
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    check-cast v0, Lu2/l;

    .line 575
    .line 576
    iget-wide v5, v0, Lu2/l;->a:J

    .line 577
    .line 578
    shr-int/lit8 v0, v16, 0xc

    .line 579
    .line 580
    and-int/lit8 v0, v0, 0xe

    .line 581
    .line 582
    shr-int/lit8 v2, v16, 0x6

    .line 583
    .line 584
    and-int/lit8 v2, v2, 0x70

    .line 585
    .line 586
    or-int v14, v0, v2

    .line 587
    .line 588
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    iget v0, v1, Lu2/k;->b:I

    .line 595
    .line 596
    iget v2, v1, Lu2/k;->c:I

    .line 597
    .line 598
    iget v7, v1, Lu2/k;->a:I

    .line 599
    .line 600
    sget-object v10, Ly1/h1;->h:Li0/m2;

    .line 601
    .line 602
    invoke-virtual {v15, v10}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v10

    .line 606
    check-cast v10, Lu2/c;

    .line 607
    .line 608
    sget-object v11, Ly1/h1;->u:Li0/m2;

    .line 609
    .line 610
    invoke-virtual {v15, v11}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v11

    .line 614
    check-cast v11, Ly1/o2;

    .line 615
    .line 616
    sget-object v9, Ly1/h1;->n:Li0/m2;

    .line 617
    .line 618
    invoke-virtual {v15, v9}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v9

    .line 622
    check-cast v9, Lu2/m;

    .line 623
    .line 624
    sget-object v27, Lp/s1;->v:Ljava/util/WeakHashMap;

    .line 625
    .line 626
    move/from16 v27, v0

    .line 627
    .line 628
    invoke-static {v15}, Lp/c;->e(Li0/h0;)Lp/s1;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    iget-object v0, v0, Lp/s1;->b:Lp/b;

    .line 633
    .line 634
    move/from16 v28, v2

    .line 635
    .line 636
    invoke-static {v15}, Lp/c;->e(Li0/h0;)Lp/s1;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    iget-object v2, v2, Lp/s1;->f:Lp/b;

    .line 641
    .line 642
    move/from16 v29, v7

    .line 643
    .line 644
    invoke-static {v15}, Lp/c;->e(Li0/h0;)Lp/s1;

    .line 645
    .line 646
    .line 647
    move-result-object v7

    .line 648
    iget-object v7, v7, Lp/s1;->e:Lp/b;

    .line 649
    .line 650
    move-object/from16 v30, v8

    .line 651
    .line 652
    invoke-static {v15}, Lp/c;->e(Li0/h0;)Lp/s1;

    .line 653
    .line 654
    .line 655
    move-result-object v8

    .line 656
    iget-object v8, v8, Lp/s1;->a:Lp/b;

    .line 657
    .line 658
    move-object/from16 v31, v11

    .line 659
    .line 660
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 661
    .line 662
    .line 663
    move-result v11

    .line 664
    invoke-virtual {v15, v11}, Li0/h0;->d(I)Z

    .line 665
    .line 666
    .line 667
    move-result v11

    .line 668
    invoke-virtual {v15, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result v32

    .line 672
    or-int v11, v11, v32

    .line 673
    .line 674
    and-int/lit8 v32, v14, 0x70

    .line 675
    .line 676
    move/from16 v33, v11

    .line 677
    .line 678
    xor-int/lit8 v11, v32, 0x30

    .line 679
    .line 680
    move-object/from16 v32, v12

    .line 681
    .line 682
    const/16 v12, 0x20

    .line 683
    .line 684
    if-le v11, v12, :cond_23

    .line 685
    .line 686
    invoke-virtual {v15, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    move-result v26

    .line 690
    if-nez v26, :cond_22

    .line 691
    .line 692
    goto :goto_11

    .line 693
    :cond_22
    move/from16 v34, v14

    .line 694
    .line 695
    goto :goto_12

    .line 696
    :cond_23
    :goto_11
    move/from16 v34, v14

    .line 697
    .line 698
    and-int/lit8 v14, v34, 0x30

    .line 699
    .line 700
    if-ne v14, v12, :cond_24

    .line 701
    .line 702
    :goto_12
    const/4 v12, 0x1

    .line 703
    goto :goto_13

    .line 704
    :cond_24
    const/4 v12, 0x0

    .line 705
    :goto_13
    or-int v12, v33, v12

    .line 706
    .line 707
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v14

    .line 711
    if-nez v12, :cond_26

    .line 712
    .line 713
    if-ne v14, v13, :cond_25

    .line 714
    .line 715
    goto :goto_14

    .line 716
    :cond_25
    move-wide/from16 v35, v5

    .line 717
    .line 718
    move/from16 v33, v11

    .line 719
    .line 720
    goto :goto_15

    .line 721
    :cond_26
    :goto_14
    new-instance v14, Lu2/k;

    .line 722
    .line 723
    invoke-virtual {v3}, Lsh/y;->b()Lp/z0;

    .line 724
    .line 725
    .line 726
    move-result-object v12

    .line 727
    invoke-virtual {v12, v9}, Lp/z0;->d(Lu2/m;)F

    .line 728
    .line 729
    .line 730
    move-result v12

    .line 731
    invoke-interface {v10, v12}, Lu2/c;->G0(F)I

    .line 732
    .line 733
    .line 734
    move-result v12

    .line 735
    invoke-virtual/range {p2 .. p2}, Lsh/y;->b()Lp/z0;

    .line 736
    .line 737
    .line 738
    move-result-object v3

    .line 739
    iget v3, v3, Lp/z0;->b:F

    .line 740
    .line 741
    invoke-interface {v10, v3}, Lu2/c;->G0(F)I

    .line 742
    .line 743
    .line 744
    move-result v3

    .line 745
    move/from16 v33, v11

    .line 746
    .line 747
    invoke-virtual/range {p2 .. p2}, Lsh/y;->b()Lp/z0;

    .line 748
    .line 749
    .line 750
    move-result-object v11

    .line 751
    invoke-virtual {v11, v9}, Lp/z0;->b(Lu2/m;)F

    .line 752
    .line 753
    .line 754
    move-result v11

    .line 755
    invoke-interface {v10, v11}, Lu2/c;->G0(F)I

    .line 756
    .line 757
    .line 758
    move-result v11

    .line 759
    move-wide/from16 v35, v5

    .line 760
    .line 761
    invoke-virtual/range {p2 .. p2}, Lsh/y;->b()Lp/z0;

    .line 762
    .line 763
    .line 764
    move-result-object v5

    .line 765
    iget v5, v5, Lp/z0;->d:F

    .line 766
    .line 767
    invoke-interface {v10, v5}, Lu2/c;->G0(F)I

    .line 768
    .line 769
    .line 770
    move-result v5

    .line 771
    invoke-direct {v14, v12, v3, v11, v5}, Lu2/k;-><init>(IIII)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v15, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 775
    .line 776
    .line 777
    :goto_15
    move-object v6, v14

    .line 778
    check-cast v6, Lu2/k;

    .line 779
    .line 780
    move-object/from16 v11, v31

    .line 781
    .line 782
    check-cast v11, Ly1/v1;

    .line 783
    .line 784
    iget-object v3, v11, Ly1/v1;->b:Li0/j1;

    .line 785
    .line 786
    if-nez v3, :cond_29

    .line 787
    .line 788
    iget-object v3, v11, Ly1/v1;->a:Lfg/a;

    .line 789
    .line 790
    if-eqz v3, :cond_27

    .line 791
    .line 792
    invoke-interface {v3}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v3

    .line 796
    check-cast v3, Ly1/j1;

    .line 797
    .line 798
    if-nez v3, :cond_28

    .line 799
    .line 800
    :cond_27
    sget-object v3, Ly1/j1;->c:Ly1/j1;

    .line 801
    .line 802
    :cond_28
    invoke-static {v3}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 803
    .line 804
    .line 805
    move-result-object v3

    .line 806
    iput-object v3, v11, Ly1/v1;->b:Li0/j1;

    .line 807
    .line 808
    const/4 v3, 0x0

    .line 809
    iput-object v3, v11, Ly1/v1;->a:Lfg/a;

    .line 810
    .line 811
    :cond_29
    iget-object v3, v11, Ly1/v1;->b:Li0/j1;

    .line 812
    .line 813
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    invoke-virtual {v3}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    move-result-object v3

    .line 820
    check-cast v3, Ly1/j1;

    .line 821
    .line 822
    iget-wide v11, v3, Ly1/j1;->a:J

    .line 823
    .line 824
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 825
    .line 826
    .line 827
    move-result v3

    .line 828
    invoke-virtual {v15, v3}, Li0/h0;->d(I)Z

    .line 829
    .line 830
    .line 831
    move-result v3

    .line 832
    invoke-virtual {v15, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 833
    .line 834
    .line 835
    move-result v5

    .line 836
    or-int/2addr v3, v5

    .line 837
    invoke-virtual {v15, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    move-result v5

    .line 841
    or-int/2addr v3, v5

    .line 842
    invoke-virtual {v15, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 843
    .line 844
    .line 845
    move-result v5

    .line 846
    or-int/2addr v3, v5

    .line 847
    invoke-virtual {v15, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 848
    .line 849
    .line 850
    move-result v5

    .line 851
    or-int/2addr v3, v5

    .line 852
    invoke-virtual {v15, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 853
    .line 854
    .line 855
    move-result v5

    .line 856
    or-int/2addr v3, v5

    .line 857
    invoke-virtual {v15, v11, v12}, Li0/h0;->e(J)Z

    .line 858
    .line 859
    .line 860
    move-result v5

    .line 861
    or-int/2addr v3, v5

    .line 862
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v5

    .line 866
    const-wide v37, 0xffffffffL

    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    if-nez v3, :cond_2b

    .line 872
    .line 873
    if-ne v5, v13, :cond_2a

    .line 874
    .line 875
    goto :goto_16

    .line 876
    :cond_2a
    move-object v0, v9

    .line 877
    goto :goto_17

    .line 878
    :cond_2b
    :goto_16
    new-instance v5, Lu2/k;

    .line 879
    .line 880
    invoke-virtual {v0}, Lp/b;->e()Lb3/a;

    .line 881
    .line 882
    .line 883
    move-result-object v3

    .line 884
    iget v3, v3, Lb3/a;->a:I

    .line 885
    .line 886
    invoke-virtual {v2}, Lp/b;->e()Lb3/a;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    iget v2, v2, Lb3/a;->b:I

    .line 891
    .line 892
    move-object v10, v7

    .line 893
    move-object v14, v8

    .line 894
    const/16 v26, 0x20

    .line 895
    .line 896
    shr-long v7, v11, v26

    .line 897
    .line 898
    long-to-int v7, v7

    .line 899
    invoke-virtual {v0}, Lp/b;->e()Lb3/a;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    iget v0, v0, Lb3/a;->c:I

    .line 904
    .line 905
    sub-int/2addr v7, v0

    .line 906
    move-object v0, v9

    .line 907
    and-long v8, v11, v37

    .line 908
    .line 909
    long-to-int v8, v8

    .line 910
    invoke-virtual {v10}, Lp/b;->e()Lb3/a;

    .line 911
    .line 912
    .line 913
    move-result-object v9

    .line 914
    iget v9, v9, Lb3/a;->d:I

    .line 915
    .line 916
    sub-int/2addr v8, v9

    .line 917
    invoke-virtual {v14}, Lp/b;->e()Lb3/a;

    .line 918
    .line 919
    .line 920
    move-result-object v9

    .line 921
    iget v9, v9, Lb3/a;->d:I

    .line 922
    .line 923
    sub-int/2addr v8, v9

    .line 924
    invoke-direct {v5, v3, v2, v7, v8}, Lu2/k;-><init>(IIII)V

    .line 925
    .line 926
    .line 927
    invoke-virtual {v15, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 928
    .line 929
    .line 930
    :goto_17
    move-object v2, v5

    .line 931
    check-cast v2, Lu2/k;

    .line 932
    .line 933
    and-int/lit8 v3, v34, 0xe

    .line 934
    .line 935
    xor-int/lit8 v8, v3, 0x6

    .line 936
    .line 937
    const/4 v3, 0x4

    .line 938
    if-le v8, v3, :cond_2c

    .line 939
    .line 940
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 941
    .line 942
    .line 943
    move-result v5

    .line 944
    invoke-virtual {v15, v5}, Li0/h0;->d(I)Z

    .line 945
    .line 946
    .line 947
    move-result v5

    .line 948
    if-nez v5, :cond_2d

    .line 949
    .line 950
    :cond_2c
    and-int/lit8 v5, v34, 0x6

    .line 951
    .line 952
    if-ne v5, v3, :cond_2e

    .line 953
    .line 954
    :cond_2d
    const/4 v5, 0x1

    .line 955
    goto :goto_18

    .line 956
    :cond_2e
    const/4 v5, 0x0

    .line 957
    :goto_18
    invoke-virtual {v15, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 958
    .line 959
    .line 960
    move-result v3

    .line 961
    or-int/2addr v3, v5

    .line 962
    invoke-virtual {v15, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 963
    .line 964
    .line 965
    move-result v5

    .line 966
    or-int/2addr v3, v5

    .line 967
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 968
    .line 969
    .line 970
    move-result v5

    .line 971
    invoke-virtual {v15, v5}, Li0/h0;->d(I)Z

    .line 972
    .line 973
    .line 974
    move-result v5

    .line 975
    or-int/2addr v3, v5

    .line 976
    invoke-virtual {v15, v11, v12}, Li0/h0;->e(J)Z

    .line 977
    .line 978
    .line 979
    move-result v5

    .line 980
    or-int/2addr v3, v5

    .line 981
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v5

    .line 985
    const/4 v9, 0x3

    .line 986
    const/4 v10, 0x5

    .line 987
    if-nez v3, :cond_30

    .line 988
    .line 989
    if-ne v5, v13, :cond_2f

    .line 990
    .line 991
    goto :goto_19

    .line 992
    :cond_2f
    move-wide/from16 v39, v11

    .line 993
    .line 994
    goto :goto_1c

    .line 995
    :cond_30
    :goto_19
    invoke-static {v4, v0}, Lsh/s;->s(Lsh/g0;Lu2/m;)Lsh/g0;

    .line 996
    .line 997
    .line 998
    move-result-object v3

    .line 999
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 1000
    .line 1001
    .line 1002
    move-result v3

    .line 1003
    const/4 v5, 0x1

    .line 1004
    if-eq v3, v5, :cond_31

    .line 1005
    .line 1006
    if-eq v3, v9, :cond_31

    .line 1007
    .line 1008
    if-eq v3, v10, :cond_31

    .line 1009
    .line 1010
    iget v3, v6, Lu2/k;->a:I

    .line 1011
    .line 1012
    add-int v7, v29, v3

    .line 1013
    .line 1014
    goto :goto_1a

    .line 1015
    :cond_31
    iget v3, v6, Lu2/k;->c:I

    .line 1016
    .line 1017
    sub-int v7, v28, v3

    .line 1018
    .line 1019
    :goto_1a
    invoke-static {v4, v0}, Lsh/s;->s(Lsh/g0;Lu2/m;)Lsh/g0;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v3

    .line 1023
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 1024
    .line 1025
    .line 1026
    move-result v3

    .line 1027
    const/4 v5, 0x4

    .line 1028
    if-eq v3, v5, :cond_32

    .line 1029
    .line 1030
    if-eq v3, v10, :cond_32

    .line 1031
    .line 1032
    iget v3, v1, Lu2/k;->d:I

    .line 1033
    .line 1034
    iget v5, v6, Lu2/k;->d:I

    .line 1035
    .line 1036
    add-int/2addr v3, v5

    .line 1037
    goto :goto_1b

    .line 1038
    :cond_32
    iget v3, v6, Lu2/k;->d:I

    .line 1039
    .line 1040
    sub-int v3, v27, v3

    .line 1041
    .line 1042
    :goto_1b
    int-to-float v5, v7

    .line 1043
    move-wide/from16 v39, v11

    .line 1044
    .line 1045
    const/16 v26, 0x20

    .line 1046
    .line 1047
    shr-long v10, v39, v26

    .line 1048
    .line 1049
    long-to-int v7, v10

    .line 1050
    int-to-float v7, v7

    .line 1051
    div-float/2addr v5, v7

    .line 1052
    int-to-float v3, v3

    .line 1053
    and-long v10, v39, v37

    .line 1054
    .line 1055
    long-to-int v7, v10

    .line 1056
    int-to-float v7, v7

    .line 1057
    div-float/2addr v3, v7

    .line 1058
    invoke-static {v5, v3}, Lsh/s;->t(FF)J

    .line 1059
    .line 1060
    .line 1061
    move-result-wide v10

    .line 1062
    new-instance v5, Lf1/u0;

    .line 1063
    .line 1064
    invoke-direct {v5, v10, v11}, Lf1/u0;-><init>(J)V

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v15, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1068
    .line 1069
    .line 1070
    :goto_1c
    check-cast v5, Lf1/u0;

    .line 1071
    .line 1072
    iget-wide v10, v5, Lf1/u0;->a:J

    .line 1073
    .line 1074
    move-wide/from16 v41, v10

    .line 1075
    .line 1076
    move-wide/from16 v9, v35

    .line 1077
    .line 1078
    invoke-virtual {v15, v9, v10}, Li0/h0;->e(J)Z

    .line 1079
    .line 1080
    .line 1081
    move-result v3

    .line 1082
    invoke-virtual {v15, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1083
    .line 1084
    .line 1085
    move-result v5

    .line 1086
    or-int/2addr v3, v5

    .line 1087
    invoke-virtual {v15, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1088
    .line 1089
    .line 1090
    move-result v5

    .line 1091
    or-int/2addr v3, v5

    .line 1092
    const/4 v5, 0x4

    .line 1093
    if-le v8, v5, :cond_33

    .line 1094
    .line 1095
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 1096
    .line 1097
    .line 1098
    move-result v7

    .line 1099
    invoke-virtual {v15, v7}, Li0/h0;->d(I)Z

    .line 1100
    .line 1101
    .line 1102
    move-result v7

    .line 1103
    if-nez v7, :cond_34

    .line 1104
    .line 1105
    :cond_33
    and-int/lit8 v7, v34, 0x6

    .line 1106
    .line 1107
    if-ne v7, v5, :cond_35

    .line 1108
    .line 1109
    :cond_34
    const/4 v5, 0x1

    .line 1110
    goto :goto_1d

    .line 1111
    :cond_35
    const/4 v5, 0x0

    .line 1112
    :goto_1d
    or-int/2addr v3, v5

    .line 1113
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1114
    .line 1115
    .line 1116
    move-result v5

    .line 1117
    invoke-virtual {v15, v5}, Li0/h0;->d(I)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v5

    .line 1121
    or-int/2addr v3, v5

    .line 1122
    invoke-virtual {v15, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1123
    .line 1124
    .line 1125
    move-result v5

    .line 1126
    or-int/2addr v3, v5

    .line 1127
    move/from16 v11, v33

    .line 1128
    .line 1129
    const/16 v5, 0x20

    .line 1130
    .line 1131
    move-object/from16 v7, p2

    .line 1132
    .line 1133
    if-le v11, v5, :cond_36

    .line 1134
    .line 1135
    invoke-virtual {v15, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1136
    .line 1137
    .line 1138
    move-result v21

    .line 1139
    if-nez v21, :cond_37

    .line 1140
    .line 1141
    :cond_36
    and-int/lit8 v12, v34, 0x30

    .line 1142
    .line 1143
    if-ne v12, v5, :cond_38

    .line 1144
    .line 1145
    :cond_37
    const/4 v5, 0x1

    .line 1146
    goto :goto_1e

    .line 1147
    :cond_38
    const/4 v5, 0x0

    .line 1148
    :goto_1e
    or-int/2addr v3, v5

    .line 1149
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v5

    .line 1153
    if-nez v3, :cond_39

    .line 1154
    .line 1155
    if-ne v5, v13, :cond_3a

    .line 1156
    .line 1157
    :cond_39
    const-wide/16 v14, 0x0

    .line 1158
    .line 1159
    goto :goto_1f

    .line 1160
    :cond_3a
    move-object v7, v5

    .line 1161
    move-object v14, v6

    .line 1162
    move-wide v5, v9

    .line 1163
    goto :goto_21

    .line 1164
    :goto_1f
    invoke-static {v9, v10, v14, v15}, Lu2/l;->a(JJ)Z

    .line 1165
    .line 1166
    .line 1167
    move-result v3

    .line 1168
    if-eqz v3, :cond_3b

    .line 1169
    .line 1170
    move-object v14, v6

    .line 1171
    move-wide v5, v9

    .line 1172
    const-wide/16 v9, 0x0

    .line 1173
    .line 1174
    goto :goto_20

    .line 1175
    :cond_3b
    move-object v3, v0

    .line 1176
    move-object v0, v7

    .line 1177
    move-object v7, v4

    .line 1178
    move-wide v4, v9

    .line 1179
    invoke-virtual/range {v0 .. v7}, Lsh/y;->a(Lu2/k;Lu2/k;Lu2/m;JLu2/k;Lsh/g0;)J

    .line 1180
    .line 1181
    .line 1182
    move-result-wide v9

    .line 1183
    move-object v0, v3

    .line 1184
    move-object v14, v6

    .line 1185
    move-wide v5, v4

    .line 1186
    move-object v4, v7

    .line 1187
    :goto_20
    new-instance v7, Lu2/j;

    .line 1188
    .line 1189
    invoke-direct {v7, v9, v10}, Lu2/j;-><init>(J)V

    .line 1190
    .line 1191
    .line 1192
    move-object/from16 v15, p8

    .line 1193
    .line 1194
    invoke-virtual {v15, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1195
    .line 1196
    .line 1197
    :goto_21
    check-cast v7, Lu2/j;

    .line 1198
    .line 1199
    iget-wide v9, v7, Lu2/j;->a:J

    .line 1200
    .line 1201
    invoke-virtual {v15, v5, v6}, Li0/h0;->e(J)Z

    .line 1202
    .line 1203
    .line 1204
    move-result v7

    .line 1205
    invoke-virtual {v15, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1206
    .line 1207
    .line 1208
    move-result v31

    .line 1209
    or-int v7, v7, v31

    .line 1210
    .line 1211
    invoke-virtual {v15, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v31

    .line 1215
    or-int v7, v7, v31

    .line 1216
    .line 1217
    const/4 v12, 0x4

    .line 1218
    if-le v8, v12, :cond_3d

    .line 1219
    .line 1220
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 1221
    .line 1222
    .line 1223
    move-result v12

    .line 1224
    invoke-virtual {v15, v12}, Li0/h0;->d(I)Z

    .line 1225
    .line 1226
    .line 1227
    move-result v12

    .line 1228
    if-nez v12, :cond_3c

    .line 1229
    .line 1230
    goto :goto_22

    .line 1231
    :cond_3c
    move/from16 v33, v7

    .line 1232
    .line 1233
    goto :goto_23

    .line 1234
    :cond_3d
    :goto_22
    and-int/lit8 v12, v34, 0x6

    .line 1235
    .line 1236
    move/from16 v33, v7

    .line 1237
    .line 1238
    const/4 v7, 0x4

    .line 1239
    if-ne v12, v7, :cond_3e

    .line 1240
    .line 1241
    :goto_23
    const/4 v7, 0x1

    .line 1242
    goto :goto_24

    .line 1243
    :cond_3e
    const/4 v7, 0x0

    .line 1244
    :goto_24
    or-int v7, v33, v7

    .line 1245
    .line 1246
    invoke-virtual {v15, v9, v10}, Li0/h0;->e(J)Z

    .line 1247
    .line 1248
    .line 1249
    move-result v12

    .line 1250
    or-int/2addr v7, v12

    .line 1251
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1252
    .line 1253
    .line 1254
    move-result v12

    .line 1255
    invoke-virtual {v15, v12}, Li0/h0;->d(I)Z

    .line 1256
    .line 1257
    .line 1258
    move-result v12

    .line 1259
    or-int/2addr v7, v12

    .line 1260
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v12

    .line 1264
    if-nez v7, :cond_3f

    .line 1265
    .line 1266
    if-ne v12, v13, :cond_40

    .line 1267
    .line 1268
    :cond_3f
    move-object v7, v13

    .line 1269
    const-wide/16 v12, 0x0

    .line 1270
    .line 1271
    goto :goto_25

    .line 1272
    :cond_40
    move-object/from16 v21, v0

    .line 1273
    .line 1274
    move-wide/from16 v35, v9

    .line 1275
    .line 1276
    move-object v7, v13

    .line 1277
    move-object v13, v1

    .line 1278
    goto/16 :goto_2c

    .line 1279
    .line 1280
    :goto_25
    invoke-static {v5, v6, v12, v13}, Lu2/l;->a(JJ)Z

    .line 1281
    .line 1282
    .line 1283
    move-result v33

    .line 1284
    if-eqz v33, :cond_42

    .line 1285
    .line 1286
    invoke-static {v4, v0}, Lsh/s;->s(Lsh/g0;Lu2/m;)Lsh/g0;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v12

    .line 1290
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 1291
    .line 1292
    .line 1293
    move-result v12

    .line 1294
    const/4 v13, 0x1

    .line 1295
    if-eq v12, v13, :cond_41

    .line 1296
    .line 1297
    const/4 v13, 0x3

    .line 1298
    if-eq v12, v13, :cond_41

    .line 1299
    .line 1300
    const/4 v13, 0x5

    .line 1301
    if-eq v12, v13, :cond_41

    .line 1302
    .line 1303
    const/4 v12, 0x0

    .line 1304
    goto :goto_26

    .line 1305
    :cond_41
    const/4 v12, 0x1

    .line 1306
    :goto_26
    new-instance v13, Lsh/f0;

    .line 1307
    .line 1308
    move-object/from16 v21, v0

    .line 1309
    .line 1310
    const/4 v0, 0x0

    .line 1311
    invoke-direct {v13, v0, v0, v12}, Lsh/f0;-><init>(ZZZ)V

    .line 1312
    .line 1313
    .line 1314
    move-wide/from16 v35, v9

    .line 1315
    .line 1316
    move-object v12, v13

    .line 1317
    move-object v13, v1

    .line 1318
    goto :goto_2b

    .line 1319
    :cond_42
    move-object/from16 v21, v0

    .line 1320
    .line 1321
    const/4 v0, 0x0

    .line 1322
    and-long v12, v9, v37

    .line 1323
    .line 1324
    long-to-int v12, v12

    .line 1325
    move-object v13, v1

    .line 1326
    and-long v0, v5, v37

    .line 1327
    .line 1328
    long-to-int v0, v0

    .line 1329
    div-int/lit8 v0, v0, 0x2

    .line 1330
    .line 1331
    add-int/2addr v0, v12

    .line 1332
    invoke-virtual {v13}, Lu2/k;->a()I

    .line 1333
    .line 1334
    .line 1335
    move-result v1

    .line 1336
    div-int/lit8 v1, v1, 0x2

    .line 1337
    .line 1338
    add-int v1, v1, v27

    .line 1339
    .line 1340
    if-le v0, v1, :cond_43

    .line 1341
    .line 1342
    const/4 v12, 0x1

    .line 1343
    goto :goto_27

    .line 1344
    :cond_43
    const/4 v12, 0x0

    .line 1345
    :goto_27
    if-ge v0, v1, :cond_44

    .line 1346
    .line 1347
    const/4 v0, 0x1

    .line 1348
    :goto_28
    move-wide/from16 v35, v9

    .line 1349
    .line 1350
    const/16 v26, 0x20

    .line 1351
    .line 1352
    goto :goto_29

    .line 1353
    :cond_44
    const/4 v0, 0x0

    .line 1354
    goto :goto_28

    .line 1355
    :goto_29
    shr-long v9, v35, v26

    .line 1356
    .line 1357
    long-to-int v1, v9

    .line 1358
    sub-int v9, v1, v29

    .line 1359
    .line 1360
    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    .line 1361
    .line 1362
    .line 1363
    move-result v9

    .line 1364
    shr-long v3, v5, v26

    .line 1365
    .line 1366
    long-to-int v3, v3

    .line 1367
    add-int/2addr v1, v3

    .line 1368
    sub-int v1, v1, v28

    .line 1369
    .line 1370
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 1371
    .line 1372
    .line 1373
    move-result v1

    .line 1374
    if-ge v1, v9, :cond_45

    .line 1375
    .line 1376
    const/4 v1, 0x1

    .line 1377
    goto :goto_2a

    .line 1378
    :cond_45
    const/4 v1, 0x0

    .line 1379
    :goto_2a
    new-instance v3, Lsh/f0;

    .line 1380
    .line 1381
    invoke-direct {v3, v12, v0, v1}, Lsh/f0;-><init>(ZZZ)V

    .line 1382
    .line 1383
    .line 1384
    move-object v12, v3

    .line 1385
    :goto_2b
    invoke-virtual {v15, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1386
    .line 1387
    .line 1388
    :goto_2c
    check-cast v12, Lsh/f0;

    .line 1389
    .line 1390
    invoke-virtual {v15, v5, v6}, Li0/h0;->e(J)Z

    .line 1391
    .line 1392
    .line 1393
    move-result v0

    .line 1394
    const/4 v3, 0x4

    .line 1395
    if-le v8, v3, :cond_46

    .line 1396
    .line 1397
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    .line 1398
    .line 1399
    .line 1400
    move-result v1

    .line 1401
    invoke-virtual {v15, v1}, Li0/h0;->d(I)Z

    .line 1402
    .line 1403
    .line 1404
    move-result v1

    .line 1405
    if-nez v1, :cond_47

    .line 1406
    .line 1407
    :cond_46
    and-int/lit8 v1, v34, 0x6

    .line 1408
    .line 1409
    if-ne v1, v3, :cond_48

    .line 1410
    .line 1411
    :cond_47
    const/4 v1, 0x1

    .line 1412
    goto :goto_2d

    .line 1413
    :cond_48
    const/4 v1, 0x0

    .line 1414
    :goto_2d
    or-int/2addr v0, v1

    .line 1415
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Enum;->ordinal()I

    .line 1416
    .line 1417
    .line 1418
    move-result v1

    .line 1419
    invoke-virtual {v15, v1}, Li0/h0;->d(I)Z

    .line 1420
    .line 1421
    .line 1422
    move-result v1

    .line 1423
    or-int/2addr v0, v1

    .line 1424
    invoke-virtual {v15, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1425
    .line 1426
    .line 1427
    move-result v1

    .line 1428
    or-int/2addr v0, v1

    .line 1429
    move-object v1, v13

    .line 1430
    invoke-virtual {v15, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1431
    .line 1432
    .line 1433
    move-result v1

    .line 1434
    or-int/2addr v0, v1

    .line 1435
    invoke-virtual {v15, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1436
    .line 1437
    .line 1438
    move-result v1

    .line 1439
    or-int/2addr v0, v1

    .line 1440
    const/16 v9, 0x20

    .line 1441
    .line 1442
    move-object/from16 v3, p2

    .line 1443
    .line 1444
    if-le v11, v9, :cond_49

    .line 1445
    .line 1446
    invoke-virtual {v15, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1447
    .line 1448
    .line 1449
    move-result v1

    .line 1450
    if-nez v1, :cond_4a

    .line 1451
    .line 1452
    :cond_49
    and-int/lit8 v1, v34, 0x30

    .line 1453
    .line 1454
    if-ne v1, v9, :cond_4b

    .line 1455
    .line 1456
    :cond_4a
    const/4 v1, 0x1

    .line 1457
    goto :goto_2e

    .line 1458
    :cond_4b
    const/4 v1, 0x0

    .line 1459
    :goto_2e
    or-int/2addr v0, v1

    .line 1460
    move-wide/from16 v8, v35

    .line 1461
    .line 1462
    invoke-virtual {v15, v8, v9}, Li0/h0;->e(J)Z

    .line 1463
    .line 1464
    .line 1465
    move-result v1

    .line 1466
    or-int/2addr v0, v1

    .line 1467
    invoke-virtual {v15, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1468
    .line 1469
    .line 1470
    move-result v1

    .line 1471
    or-int/2addr v0, v1

    .line 1472
    move-wide/from16 v10, v39

    .line 1473
    .line 1474
    invoke-virtual {v15, v10, v11}, Li0/h0;->e(J)Z

    .line 1475
    .line 1476
    .line 1477
    move-result v1

    .line 1478
    or-int/2addr v0, v1

    .line 1479
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v1

    .line 1483
    if-nez v0, :cond_4c

    .line 1484
    .line 1485
    if-ne v1, v7, :cond_53

    .line 1486
    .line 1487
    :cond_4c
    const-wide/16 v0, 0x0

    .line 1488
    .line 1489
    invoke-static {v5, v6, v0, v1}, Lu2/l;->a(JJ)Z

    .line 1490
    .line 1491
    .line 1492
    move-result v4

    .line 1493
    if-eqz v4, :cond_4d

    .line 1494
    .line 1495
    move-wide/from16 v10, v41

    .line 1496
    .line 1497
    goto :goto_35

    .line 1498
    :cond_4d
    iget-boolean v0, v12, Lsh/f0;->a:Z

    .line 1499
    .line 1500
    iget-boolean v1, v12, Lsh/f0;->b:Z

    .line 1501
    .line 1502
    iget-boolean v4, v12, Lsh/f0;->c:Z

    .line 1503
    .line 1504
    if-eqz v4, :cond_4e

    .line 1505
    .line 1506
    move v4, v0

    .line 1507
    move v13, v1

    .line 1508
    const/16 v26, 0x20

    .line 1509
    .line 1510
    shr-long v0, v8, v26

    .line 1511
    .line 1512
    long-to-int v0, v0

    .line 1513
    move/from16 v17, v0

    .line 1514
    .line 1515
    shr-long v0, v5, v26

    .line 1516
    .line 1517
    long-to-int v0, v0

    .line 1518
    add-int v0, v17, v0

    .line 1519
    .line 1520
    :goto_2f
    int-to-float v0, v0

    .line 1521
    goto :goto_30

    .line 1522
    :cond_4e
    move v4, v0

    .line 1523
    move v13, v1

    .line 1524
    const/16 v26, 0x20

    .line 1525
    .line 1526
    shr-long v0, v8, v26

    .line 1527
    .line 1528
    long-to-int v0, v0

    .line 1529
    goto :goto_2f

    .line 1530
    :goto_30
    if-nez v4, :cond_4f

    .line 1531
    .line 1532
    if-nez v13, :cond_4f

    .line 1533
    .line 1534
    const/4 v1, 0x1

    .line 1535
    goto :goto_31

    .line 1536
    :cond_4f
    const/4 v1, 0x0

    .line 1537
    :goto_31
    and-long v8, v8, v37

    .line 1538
    .line 1539
    long-to-int v8, v8

    .line 1540
    if-eqz v1, :cond_50

    .line 1541
    .line 1542
    int-to-float v1, v8

    .line 1543
    and-long v4, v5, v37

    .line 1544
    .line 1545
    long-to-int v4, v4

    .line 1546
    int-to-float v4, v4

    .line 1547
    const/high16 v5, 0x40000000    # 2.0f

    .line 1548
    .line 1549
    div-float/2addr v4, v5

    .line 1550
    add-float/2addr v4, v1

    .line 1551
    :goto_32
    const/16 v26, 0x20

    .line 1552
    .line 1553
    goto :goto_34

    .line 1554
    :cond_50
    if-eqz v4, :cond_52

    .line 1555
    .line 1556
    :cond_51
    :goto_33
    int-to-float v4, v8

    .line 1557
    goto :goto_32

    .line 1558
    :cond_52
    if-eqz v13, :cond_51

    .line 1559
    .line 1560
    and-long v4, v5, v37

    .line 1561
    .line 1562
    long-to-int v1, v4

    .line 1563
    add-int/2addr v8, v1

    .line 1564
    goto :goto_33

    .line 1565
    :goto_34
    shr-long v5, v10, v26

    .line 1566
    .line 1567
    long-to-int v1, v5

    .line 1568
    int-to-float v1, v1

    .line 1569
    div-float/2addr v0, v1

    .line 1570
    and-long v5, v10, v37

    .line 1571
    .line 1572
    long-to-int v1, v5

    .line 1573
    int-to-float v1, v1

    .line 1574
    div-float/2addr v4, v1

    .line 1575
    invoke-static {v0, v4}, Lsh/s;->t(FF)J

    .line 1576
    .line 1577
    .line 1578
    move-result-wide v10

    .line 1579
    :goto_35
    new-instance v1, Lf1/u0;

    .line 1580
    .line 1581
    invoke-direct {v1, v10, v11}, Lf1/u0;-><init>(J)V

    .line 1582
    .line 1583
    .line 1584
    invoke-virtual {v15, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1585
    .line 1586
    .line 1587
    :cond_53
    check-cast v1, Lf1/u0;

    .line 1588
    .line 1589
    iget-wide v0, v1, Lf1/u0;->a:J

    .line 1590
    .line 1591
    invoke-virtual {v15, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1592
    .line 1593
    .line 1594
    move-result v4

    .line 1595
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v5

    .line 1599
    if-nez v4, :cond_54

    .line 1600
    .line 1601
    if-ne v5, v7, :cond_5a

    .line 1602
    .line 1603
    :cond_54
    iget-boolean v4, v12, Lsh/f0;->a:Z

    .line 1604
    .line 1605
    iget-boolean v5, v12, Lsh/f0;->b:Z

    .line 1606
    .line 1607
    iget-boolean v6, v12, Lsh/f0;->c:Z

    .line 1608
    .line 1609
    if-nez v4, :cond_55

    .line 1610
    .line 1611
    if-nez v5, :cond_55

    .line 1612
    .line 1613
    const/16 v18, 0x1

    .line 1614
    .line 1615
    goto :goto_36

    .line 1616
    :cond_55
    const/16 v18, 0x0

    .line 1617
    .line 1618
    :goto_36
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1619
    .line 1620
    if-eqz v6, :cond_56

    .line 1621
    .line 1622
    move v6, v8

    .line 1623
    goto :goto_37

    .line 1624
    :cond_56
    const/4 v6, 0x0

    .line 1625
    :goto_37
    if-eqz v18, :cond_57

    .line 1626
    .line 1627
    const/high16 v4, 0x3f000000    # 0.5f

    .line 1628
    .line 1629
    move v8, v4

    .line 1630
    goto :goto_38

    .line 1631
    :cond_57
    if-eqz v4, :cond_59

    .line 1632
    .line 1633
    :cond_58
    const/4 v8, 0x0

    .line 1634
    goto :goto_38

    .line 1635
    :cond_59
    if-eqz v5, :cond_58

    .line 1636
    .line 1637
    :goto_38
    invoke-static {v6, v8}, Lf1/c0;->g(FF)J

    .line 1638
    .line 1639
    .line 1640
    move-result-wide v4

    .line 1641
    new-instance v6, Lf1/u0;

    .line 1642
    .line 1643
    invoke-direct {v6, v4, v5}, Lf1/u0;-><init>(J)V

    .line 1644
    .line 1645
    .line 1646
    invoke-virtual {v15, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1647
    .line 1648
    .line 1649
    move-object v5, v6

    .line 1650
    :cond_5a
    check-cast v5, Lf1/u0;

    .line 1651
    .line 1652
    iget-wide v4, v5, Lf1/u0;->a:J

    .line 1653
    .line 1654
    new-instance v37, Lsh/d0;

    .line 1655
    .line 1656
    move-wide/from16 v40, v0

    .line 1657
    .line 1658
    move-object/from16 v38, v2

    .line 1659
    .line 1660
    move-wide/from16 v42, v4

    .line 1661
    .line 1662
    move-object/from16 v44, v12

    .line 1663
    .line 1664
    move-object/from16 v39, v14

    .line 1665
    .line 1666
    invoke-direct/range {v37 .. v44}, Lsh/d0;-><init>(Lu2/k;Lu2/k;JJLsh/f0;)V

    .line 1667
    .line 1668
    .line 1669
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v0

    .line 1673
    if-ne v0, v7, :cond_5b

    .line 1674
    .line 1675
    new-instance v0, Le1/b;

    .line 1676
    .line 1677
    const-wide/16 v12, 0x0

    .line 1678
    .line 1679
    invoke-direct {v0, v12, v13}, Le1/b;-><init>(J)V

    .line 1680
    .line 1681
    .line 1682
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v0

    .line 1686
    invoke-virtual {v15, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1687
    .line 1688
    .line 1689
    :cond_5b
    move-object v11, v0

    .line 1690
    check-cast v11, Li0/a1;

    .line 1691
    .line 1692
    invoke-interface/range {v25 .. v25}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v0

    .line 1696
    move-object v1, v0

    .line 1697
    new-instance v0, Lxh/m;

    .line 1698
    .line 1699
    move-object/from16 v10, p3

    .line 1700
    .line 1701
    move/from16 v8, p6

    .line 1702
    .line 1703
    move-object/from16 v14, p7

    .line 1704
    .line 1705
    move-object/from16 v45, v1

    .line 1706
    .line 1707
    move-object v9, v3

    .line 1708
    move-object/from16 v3, v19

    .line 1709
    .line 1710
    move-object/from16 v6, v20

    .line 1711
    .line 1712
    move-object/from16 v2, v22

    .line 1713
    .line 1714
    move-object/from16 v4, v23

    .line 1715
    .line 1716
    move-object/from16 v5, v24

    .line 1717
    .line 1718
    move-object/from16 v13, v30

    .line 1719
    .line 1720
    move-object/from16 v12, v32

    .line 1721
    .line 1722
    move-object/from16 v7, v37

    .line 1723
    .line 1724
    const/16 v31, 0x3

    .line 1725
    .line 1726
    move/from16 v1, p0

    .line 1727
    .line 1728
    invoke-direct/range {v0 .. v14}, Lxh/m;-><init>(ZLqg/t;Li/c;Li/c;Li/c;Li0/a1;Lsh/d0;FLsh/y;Lsh/g0;Li0/a1;Li0/a1;Li0/a1;Ls0/d;)V

    .line 1729
    .line 1730
    .line 1731
    const v1, -0x11b4c72f

    .line 1732
    .line 1733
    .line 1734
    invoke-static {v1, v0, v15}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v0

    .line 1738
    shl-int/lit8 v1, v16, 0x3

    .line 1739
    .line 1740
    and-int/lit16 v1, v1, 0x380

    .line 1741
    .line 1742
    or-int/lit8 v1, v1, 0x30

    .line 1743
    .line 1744
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v1

    .line 1748
    move-object/from16 v2, p1

    .line 1749
    .line 1750
    move-object/from16 v3, v45

    .line 1751
    .line 1752
    invoke-virtual {v2, v3, v0, v15, v1}, Ls0/d;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1753
    .line 1754
    .line 1755
    goto :goto_39

    .line 1756
    :cond_5c
    move-object v2, v8

    .line 1757
    invoke-virtual {v15}, Li0/h0;->V()V

    .line 1758
    .line 1759
    .line 1760
    :goto_39
    invoke-virtual {v15}, Li0/h0;->t()Li0/r1;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v11

    .line 1764
    if-eqz v11, :cond_5d

    .line 1765
    .line 1766
    new-instance v0, Lxh/j;

    .line 1767
    .line 1768
    const/4 v10, 0x2

    .line 1769
    move/from16 v1, p0

    .line 1770
    .line 1771
    move-object/from16 v3, p2

    .line 1772
    .line 1773
    move-object/from16 v4, p3

    .line 1774
    .line 1775
    move-object/from16 v5, p4

    .line 1776
    .line 1777
    move-object/from16 v6, p5

    .line 1778
    .line 1779
    move/from16 v7, p6

    .line 1780
    .line 1781
    move-object/from16 v8, p7

    .line 1782
    .line 1783
    move/from16 v9, p9

    .line 1784
    .line 1785
    invoke-direct/range {v0 .. v10}, Lxh/j;-><init>(ZLs0/d;Lsh/y;Lsh/g0;Lfg/a;Lfg/a;FLs0/d;II)V

    .line 1786
    .line 1787
    .line 1788
    iput-object v0, v11, Li0/r1;->d:Lfg/p;

    .line 1789
    .line 1790
    :cond_5d
    return-void
.end method

.method public static a0(Lv4/d0;Lh4/u;Z)Lt4/b;
    .locals 10

    .line 1
    const-string v0, "InnerClasses"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lh4/u;->o(Ljava/lang/String;)Lh4/s;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lh4/h;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    iget-object p1, p1, Lh4/h;->b:Lh4/u;

    .line 14
    .line 15
    iget-object v1, p1, Lz4/e;->h:[Ljava/lang/Object;

    .line 16
    .line 17
    array-length v1, v1

    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    move-object v5, v0

    .line 25
    move v4, v3

    .line 26
    :goto_0
    if-ge v4, v1, :cond_3

    .line 27
    .line 28
    invoke-virtual {p1, v4}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    check-cast v6, Lh4/t;

    .line 33
    .line 34
    iget-object v7, v6, Lh4/t;->a:Lv4/d0;

    .line 35
    .line 36
    invoke-virtual {v7, p0}, Lv4/d0;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-eqz v8, :cond_1

    .line 41
    .line 42
    move-object v5, v6

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    iget-object v6, v6, Lh4/t;->b:Lv4/d0;

    .line 45
    .line 46
    invoke-virtual {p0, v6}, Lv4/d0;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_2

    .line 51
    .line 52
    iget-object v6, v7, Lv4/d0;->g:Lw4/c;

    .line 53
    .line 54
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez v5, :cond_4

    .line 65
    .line 66
    if-nez p1, :cond_4

    .line 67
    .line 68
    :goto_2
    return-object v0

    .line 69
    :cond_4
    new-instance v0, Lt4/b;

    .line 70
    .line 71
    invoke-direct {v0}, Lt4/b;-><init>()V

    .line 72
    .line 73
    .line 74
    const/4 v1, 0x3

    .line 75
    if-eqz v5, :cond_7

    .line 76
    .line 77
    iget-object v4, v5, Lh4/t;->c:Lv4/c0;

    .line 78
    .line 79
    iget v6, v5, Lh4/t;->d:I

    .line 80
    .line 81
    new-instance v7, Lt4/a;

    .line 82
    .line 83
    sget-object v8, Lr4/d;->d:Lv4/d0;

    .line 84
    .line 85
    invoke-direct {v7, v8, v1}, Lt4/a;-><init>(Lv4/d0;I)V

    .line 86
    .line 87
    .line 88
    if-eqz v4, :cond_5

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_5
    sget-object v4, Lv4/r;->g:Lv4/r;

    .line 92
    .line 93
    :goto_3
    new-instance v8, Lt4/d;

    .line 94
    .line 95
    sget-object v9, Lr4/d;->j:Lv4/c0;

    .line 96
    .line 97
    invoke-direct {v8, v9, v4}, Lt4/d;-><init>(Lv4/c0;Lv4/a;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7, v8}, Lt4/a;->n(Lt4/d;)V

    .line 101
    .line 102
    .line 103
    new-instance v4, Lt4/d;

    .line 104
    .line 105
    sget-object v8, Lr4/d;->i:Lv4/c0;

    .line 106
    .line 107
    invoke-static {v6}, Lv4/o;->o(I)Lv4/o;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-direct {v4, v8, v6}, Lt4/d;-><init>(Lv4/c0;Lv4/a;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v7, v4}, Lt4/a;->n(Lt4/d;)V

    .line 115
    .line 116
    .line 117
    iput-boolean v3, v7, Lz4/j;->g:Z

    .line 118
    .line 119
    invoke-virtual {v0, v7}, Lt4/b;->l(Lt4/a;)V

    .line 120
    .line 121
    .line 122
    if-eqz p2, :cond_7

    .line 123
    .line 124
    iget-object p2, v5, Lh4/t;->b:Lv4/d0;

    .line 125
    .line 126
    if-eqz p2, :cond_6

    .line 127
    .line 128
    new-instance p0, Lt4/a;

    .line 129
    .line 130
    sget-object v4, Lr4/d;->b:Lv4/d0;

    .line 131
    .line 132
    invoke-direct {p0, v4, v1}, Lt4/a;-><init>(Lv4/d0;I)V

    .line 133
    .line 134
    .line 135
    new-instance v4, Lt4/d;

    .line 136
    .line 137
    sget-object v5, Lr4/d;->k:Lv4/c0;

    .line 138
    .line 139
    invoke-direct {v4, v5, p2}, Lt4/d;-><init>(Lv4/c0;Lv4/a;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, v4}, Lt4/a;->n(Lt4/d;)V

    .line 143
    .line 144
    .line 145
    iput-boolean v3, p0, Lz4/j;->g:Z

    .line 146
    .line 147
    invoke-virtual {v0, p0}, Lt4/b;->l(Lt4/a;)V

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    new-instance p1, Lz4/l;

    .line 152
    .line 153
    iget-object p0, p0, Lv4/d0;->g:Lw4/c;

    .line 154
    .line 155
    invoke-virtual {p0}, Lw4/c;->a()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    new-instance p2, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v0, "Ignoring InnerClasses attribute for an anonymous inner class\n("

    .line 162
    .line 163
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string p0, ") that doesn\'t come with an\nassociated EnclosingMethod attribute. This class was probably produced by a\ncompiler that did not target the modern .class file format. The recommended\nsolution is to recompile the class from source, using an up-to-date compiler\nand without specifying any \"-target\" type options. The consequence of ignoring\nthis warning is that reflective operations on this class will incorrectly\nindicate that it is *not* an inner class."

    .line 170
    .line 171
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw p1

    .line 182
    :cond_7
    :goto_4
    if-eqz p1, :cond_9

    .line 183
    .line 184
    new-instance p0, Lw4/b;

    .line 185
    .line 186
    invoke-direct {p0, p1}, Lz4/e;-><init>(I)V

    .line 187
    .line 188
    .line 189
    move p2, v3

    .line 190
    :goto_5
    if-ge p2, p1, :cond_8

    .line 191
    .line 192
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    check-cast v4, Lw4/c;

    .line 197
    .line 198
    invoke-virtual {p0, p2, v4}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    add-int/lit8 p2, p2, 0x1

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_8
    iput-boolean v3, p0, Lz4/j;->g:Z

    .line 205
    .line 206
    invoke-static {p0}, Lr4/d;->a(Lw4/e;)Lv4/d;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    new-instance p1, Lt4/a;

    .line 211
    .line 212
    sget-object p2, Lr4/d;->e:Lv4/d0;

    .line 213
    .line 214
    invoke-direct {p1, p2, v1}, Lt4/a;-><init>(Lv4/d0;I)V

    .line 215
    .line 216
    .line 217
    new-instance p2, Lt4/d;

    .line 218
    .line 219
    sget-object v1, Lr4/d;->k:Lv4/c0;

    .line 220
    .line 221
    invoke-direct {p2, v1, p0}, Lt4/d;-><init>(Lv4/c0;Lv4/a;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, p2}, Lt4/a;->n(Lt4/d;)V

    .line 225
    .line 226
    .line 227
    iput-boolean v3, p1, Lz4/j;->g:Z

    .line 228
    .line 229
    invoke-virtual {v0, p1}, Lt4/b;->l(Lt4/a;)V

    .line 230
    .line 231
    .line 232
    :cond_9
    iput-boolean v3, v0, Lz4/j;->g:Z

    .line 233
    .line 234
    return-object v0
.end method

.method public static final b(Lbi/b;Lbi/l;ZLs0/d;Li0/h0;I)V
    .locals 137

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    move-object/from16 v5, p3

    .line 4
    .line 5
    move-object/from16 v0, p4

    .line 6
    .line 7
    move/from16 v1, p5

    .line 8
    .line 9
    iget-object v2, v3, Lbi/b;->B:Li0/j1;

    .line 10
    .line 11
    iget-object v4, v3, Lbi/b;->A:Li0/j1;

    .line 12
    .line 13
    iget-object v6, v3, Lbi/b;->z:Li0/j1;

    .line 14
    .line 15
    iget-object v7, v3, Lbi/b;->y:Li0/j1;

    .line 16
    .line 17
    iget-object v8, v3, Lbi/b;->x:Li0/j1;

    .line 18
    .line 19
    iget-object v9, v3, Lbi/b;->v:Li0/j1;

    .line 20
    .line 21
    iget-object v10, v3, Lbi/b;->u:Li0/j1;

    .line 22
    .line 23
    iget-object v11, v3, Lbi/b;->t:Li0/j1;

    .line 24
    .line 25
    iget-object v12, v3, Lbi/b;->q:Li0/j1;

    .line 26
    .line 27
    iget-object v13, v3, Lbi/b;->p:Li0/j1;

    .line 28
    .line 29
    iget-object v14, v3, Lbi/b;->o:Li0/j1;

    .line 30
    .line 31
    iget-object v15, v3, Lbi/b;->n:Li0/j1;

    .line 32
    .line 33
    move-object/from16 v16, v2

    .line 34
    .line 35
    iget-object v2, v3, Lbi/b;->m:Li0/j1;

    .line 36
    .line 37
    move-object/from16 v17, v4

    .line 38
    .line 39
    iget-object v4, v3, Lbi/b;->l:Li0/j1;

    .line 40
    .line 41
    move-object/from16 v18, v6

    .line 42
    .line 43
    iget-object v6, v3, Lbi/b;->k:Li0/j1;

    .line 44
    .line 45
    move-object/from16 v19, v7

    .line 46
    .line 47
    iget-object v7, v3, Lbi/b;->i:Li0/j1;

    .line 48
    .line 49
    move-object/from16 v20, v8

    .line 50
    .line 51
    iget-object v8, v3, Lbi/b;->h:Li0/j1;

    .line 52
    .line 53
    move-object/from16 v21, v9

    .line 54
    .line 55
    iget-object v9, v3, Lbi/b;->g:Li0/j1;

    .line 56
    .line 57
    move-object/from16 v22, v10

    .line 58
    .line 59
    iget-object v10, v3, Lbi/b;->f:Li0/j1;

    .line 60
    .line 61
    move-object/from16 v23, v11

    .line 62
    .line 63
    iget-object v11, v3, Lbi/b;->e:Li0/j1;

    .line 64
    .line 65
    move-object/from16 v24, v12

    .line 66
    .line 67
    iget-object v12, v3, Lbi/b;->d:Li0/j1;

    .line 68
    .line 69
    move-object/from16 v25, v13

    .line 70
    .line 71
    iget-object v13, v3, Lbi/b;->c:Li0/j1;

    .line 72
    .line 73
    move-object/from16 v26, v14

    .line 74
    .line 75
    const v14, 0x5484e0

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v14}, Li0/h0;->b0(I)Li0/h0;

    .line 79
    .line 80
    .line 81
    and-int/lit8 v14, v1, 0x6

    .line 82
    .line 83
    if-nez v14, :cond_1

    .line 84
    .line 85
    invoke-virtual {v0, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v14

    .line 89
    if-eqz v14, :cond_0

    .line 90
    .line 91
    const/4 v14, 0x4

    .line 92
    goto :goto_0

    .line 93
    :cond_0
    const/4 v14, 0x2

    .line 94
    :goto_0
    or-int/2addr v14, v1

    .line 95
    goto :goto_1

    .line 96
    :cond_1
    move v14, v1

    .line 97
    :goto_1
    and-int/lit8 v27, v1, 0x30

    .line 98
    .line 99
    if-nez v27, :cond_2

    .line 100
    .line 101
    or-int/lit8 v14, v14, 0x10

    .line 102
    .line 103
    :cond_2
    or-int/lit16 v14, v14, 0x180

    .line 104
    .line 105
    move/from16 v27, v14

    .line 106
    .line 107
    and-int/lit16 v14, v1, 0xc00

    .line 108
    .line 109
    if-nez v14, :cond_4

    .line 110
    .line 111
    invoke-virtual {v0, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    if-eqz v14, :cond_3

    .line 116
    .line 117
    const/16 v14, 0x800

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    const/16 v14, 0x400

    .line 121
    .line 122
    :goto_2
    or-int v14, v27, v14

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_4
    move/from16 v14, v27

    .line 126
    .line 127
    :goto_3
    and-int/lit16 v1, v14, 0x493

    .line 128
    .line 129
    move/from16 v27, v14

    .line 130
    .line 131
    const/16 v14, 0x492

    .line 132
    .line 133
    const/16 v28, 0x1

    .line 134
    .line 135
    if-eq v1, v14, :cond_5

    .line 136
    .line 137
    move/from16 v1, v28

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_5
    const/4 v1, 0x0

    .line 141
    :goto_4
    and-int/lit8 v14, v27, 0x1

    .line 142
    .line 143
    invoke-virtual {v0, v14, v1}, Li0/h0;->S(IZ)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-eqz v1, :cond_c

    .line 148
    .line 149
    invoke-virtual {v0}, Li0/h0;->X()V

    .line 150
    .line 151
    .line 152
    and-int/lit8 v1, p5, 0x1

    .line 153
    .line 154
    if-eqz v1, :cond_7

    .line 155
    .line 156
    invoke-virtual {v0}, Li0/h0;->B()Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_6

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_6
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 164
    .line 165
    .line 166
    move-object/from16 v1, p1

    .line 167
    .line 168
    move/from16 v28, p2

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_7
    :goto_5
    sget-object v1, Lbi/m;->a:Li0/m2;

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    check-cast v1, Lbi/l;

    .line 178
    .line 179
    :goto_6
    invoke-virtual {v0}, Li0/h0;->q()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v14

    .line 186
    sget-object v5, Li0/l;->a:Li0/e;

    .line 187
    .line 188
    if-ne v14, v5, :cond_8

    .line 189
    .line 190
    invoke-virtual {v3}, Lbi/b;->j()J

    .line 191
    .line 192
    .line 193
    move-result-wide v30

    .line 194
    invoke-virtual {v3}, Lbi/b;->e()J

    .line 195
    .line 196
    .line 197
    move-result-wide v32

    .line 198
    invoke-virtual {v13}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v14

    .line 202
    check-cast v14, Lf1/w;

    .line 203
    .line 204
    move-object/from16 v136, v15

    .line 205
    .line 206
    iget-wide v14, v14, Lf1/w;->a:J

    .line 207
    .line 208
    invoke-virtual {v12}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v29

    .line 212
    move-wide/from16 v34, v14

    .line 213
    .line 214
    move-object/from16 v14, v29

    .line 215
    .line 216
    check-cast v14, Lf1/w;

    .line 217
    .line 218
    iget-wide v14, v14, Lf1/w;->a:J

    .line 219
    .line 220
    invoke-virtual {v11}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v29

    .line 224
    move-wide/from16 v36, v14

    .line 225
    .line 226
    move-object/from16 v14, v29

    .line 227
    .line 228
    check-cast v14, Lf1/w;

    .line 229
    .line 230
    iget-wide v14, v14, Lf1/w;->a:J

    .line 231
    .line 232
    invoke-virtual {v10}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v29

    .line 236
    move-wide/from16 v38, v14

    .line 237
    .line 238
    move-object/from16 v14, v29

    .line 239
    .line 240
    check-cast v14, Lf1/w;

    .line 241
    .line 242
    iget-wide v14, v14, Lf1/w;->a:J

    .line 243
    .line 244
    invoke-virtual {v9}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v29

    .line 248
    move-wide/from16 v40, v14

    .line 249
    .line 250
    move-object/from16 v14, v29

    .line 251
    .line 252
    check-cast v14, Lf1/w;

    .line 253
    .line 254
    iget-wide v14, v14, Lf1/w;->a:J

    .line 255
    .line 256
    invoke-virtual {v8}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v29

    .line 260
    move-wide/from16 v42, v14

    .line 261
    .line 262
    move-object/from16 v14, v29

    .line 263
    .line 264
    check-cast v14, Lf1/w;

    .line 265
    .line 266
    iget-wide v14, v14, Lf1/w;->a:J

    .line 267
    .line 268
    invoke-virtual {v7}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v29

    .line 272
    move-wide/from16 v44, v14

    .line 273
    .line 274
    move-object/from16 v14, v29

    .line 275
    .line 276
    check-cast v14, Lf1/w;

    .line 277
    .line 278
    iget-wide v14, v14, Lf1/w;->a:J

    .line 279
    .line 280
    invoke-virtual {v3}, Lbi/b;->b()J

    .line 281
    .line 282
    .line 283
    move-result-wide v48

    .line 284
    invoke-virtual {v6}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v29

    .line 288
    move-wide/from16 v46, v14

    .line 289
    .line 290
    move-object/from16 v14, v29

    .line 291
    .line 292
    check-cast v14, Lf1/w;

    .line 293
    .line 294
    iget-wide v14, v14, Lf1/w;->a:J

    .line 295
    .line 296
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v29

    .line 300
    move-wide/from16 v50, v14

    .line 301
    .line 302
    move-object/from16 v14, v29

    .line 303
    .line 304
    check-cast v14, Lf1/w;

    .line 305
    .line 306
    iget-wide v14, v14, Lf1/w;->a:J

    .line 307
    .line 308
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v29

    .line 312
    move-wide/from16 v52, v14

    .line 313
    .line 314
    move-object/from16 v14, v29

    .line 315
    .line 316
    check-cast v14, Lf1/w;

    .line 317
    .line 318
    iget-wide v14, v14, Lf1/w;->a:J

    .line 319
    .line 320
    invoke-virtual/range {v136 .. v136}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v29

    .line 324
    move-wide/from16 v54, v14

    .line 325
    .line 326
    move-object/from16 v14, v29

    .line 327
    .line 328
    check-cast v14, Lf1/w;

    .line 329
    .line 330
    iget-wide v14, v14, Lf1/w;->a:J

    .line 331
    .line 332
    invoke-virtual/range {v26 .. v26}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v29

    .line 336
    move-wide/from16 v56, v14

    .line 337
    .line 338
    move-object/from16 v14, v29

    .line 339
    .line 340
    check-cast v14, Lf1/w;

    .line 341
    .line 342
    iget-wide v14, v14, Lf1/w;->a:J

    .line 343
    .line 344
    invoke-virtual/range {v25 .. v25}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v29

    .line 348
    move-wide/from16 v58, v14

    .line 349
    .line 350
    move-object/from16 v14, v29

    .line 351
    .line 352
    check-cast v14, Lf1/w;

    .line 353
    .line 354
    iget-wide v14, v14, Lf1/w;->a:J

    .line 355
    .line 356
    invoke-virtual/range {v24 .. v24}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v29

    .line 360
    move-wide/from16 v60, v14

    .line 361
    .line 362
    move-object/from16 v14, v29

    .line 363
    .line 364
    check-cast v14, Lf1/w;

    .line 365
    .line 366
    iget-wide v14, v14, Lf1/w;->a:J

    .line 367
    .line 368
    invoke-virtual {v3}, Lbi/b;->k()J

    .line 369
    .line 370
    .line 371
    move-result-wide v64

    .line 372
    invoke-virtual {v3}, Lbi/b;->f()J

    .line 373
    .line 374
    .line 375
    move-result-wide v66

    .line 376
    invoke-virtual/range {v23 .. v23}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v29

    .line 380
    move-wide/from16 v62, v14

    .line 381
    .line 382
    move-object/from16 v14, v29

    .line 383
    .line 384
    check-cast v14, Lf1/w;

    .line 385
    .line 386
    iget-wide v14, v14, Lf1/w;->a:J

    .line 387
    .line 388
    invoke-virtual/range {v22 .. v22}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v29

    .line 392
    move-wide/from16 v68, v14

    .line 393
    .line 394
    move-object/from16 v14, v29

    .line 395
    .line 396
    check-cast v14, Lf1/w;

    .line 397
    .line 398
    iget-wide v14, v14, Lf1/w;->a:J

    .line 399
    .line 400
    invoke-virtual/range {v21 .. v21}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v29

    .line 404
    move-wide/from16 v70, v14

    .line 405
    .line 406
    move-object/from16 v14, v29

    .line 407
    .line 408
    check-cast v14, Lf1/w;

    .line 409
    .line 410
    iget-wide v14, v14, Lf1/w;->a:J

    .line 411
    .line 412
    invoke-virtual {v3}, Lbi/b;->c()J

    .line 413
    .line 414
    .line 415
    move-result-wide v74

    .line 416
    invoke-virtual/range {v20 .. v20}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v29

    .line 420
    move-wide/from16 v72, v14

    .line 421
    .line 422
    move-object/from16 v14, v29

    .line 423
    .line 424
    check-cast v14, Lf1/w;

    .line 425
    .line 426
    iget-wide v14, v14, Lf1/w;->a:J

    .line 427
    .line 428
    invoke-virtual/range {v19 .. v19}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v29

    .line 432
    move-wide/from16 v76, v14

    .line 433
    .line 434
    move-object/from16 v14, v29

    .line 435
    .line 436
    check-cast v14, Lf1/w;

    .line 437
    .line 438
    iget-wide v14, v14, Lf1/w;->a:J

    .line 439
    .line 440
    invoke-virtual/range {v18 .. v18}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v29

    .line 444
    move-wide/from16 v78, v14

    .line 445
    .line 446
    move-object/from16 v14, v29

    .line 447
    .line 448
    check-cast v14, Lf1/w;

    .line 449
    .line 450
    iget-wide v14, v14, Lf1/w;->a:J

    .line 451
    .line 452
    invoke-virtual/range {v17 .. v17}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v29

    .line 456
    move-wide/from16 v80, v14

    .line 457
    .line 458
    move-object/from16 v14, v29

    .line 459
    .line 460
    check-cast v14, Lf1/w;

    .line 461
    .line 462
    iget-wide v14, v14, Lf1/w;->a:J

    .line 463
    .line 464
    invoke-virtual/range {v16 .. v16}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v29

    .line 468
    move-wide/from16 v82, v14

    .line 469
    .line 470
    move-object/from16 v14, v29

    .line 471
    .line 472
    check-cast v14, Lf1/w;

    .line 473
    .line 474
    iget-wide v14, v14, Lf1/w;->a:J

    .line 475
    .line 476
    move-wide/from16 v84, v14

    .line 477
    .line 478
    iget-object v14, v3, Lbi/b;->C:Li0/j1;

    .line 479
    .line 480
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v14

    .line 484
    check-cast v14, Lf1/w;

    .line 485
    .line 486
    iget-wide v14, v14, Lf1/w;->a:J

    .line 487
    .line 488
    move-wide/from16 v86, v14

    .line 489
    .line 490
    iget-object v14, v3, Lbi/b;->D:Li0/j1;

    .line 491
    .line 492
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v14

    .line 496
    check-cast v14, Lf1/w;

    .line 497
    .line 498
    iget-wide v14, v14, Lf1/w;->a:J

    .line 499
    .line 500
    invoke-virtual {v3}, Lbi/b;->a()J

    .line 501
    .line 502
    .line 503
    move-result-wide v90

    .line 504
    invoke-virtual {v3}, Lbi/b;->d()J

    .line 505
    .line 506
    .line 507
    move-result-wide v92

    .line 508
    move-wide/from16 v88, v14

    .line 509
    .line 510
    iget-object v14, v3, Lbi/b;->G:Li0/j1;

    .line 511
    .line 512
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v14

    .line 516
    check-cast v14, Lf1/w;

    .line 517
    .line 518
    iget-wide v14, v14, Lf1/w;->a:J

    .line 519
    .line 520
    invoke-virtual {v3}, Lbi/b;->l()J

    .line 521
    .line 522
    .line 523
    move-result-wide v96

    .line 524
    invoke-virtual {v3}, Lbi/b;->g()J

    .line 525
    .line 526
    .line 527
    move-result-wide v98

    .line 528
    invoke-virtual {v3}, Lbi/b;->n()J

    .line 529
    .line 530
    .line 531
    move-result-wide v100

    .line 532
    move-wide/from16 v94, v14

    .line 533
    .line 534
    iget-object v14, v3, Lbi/b;->K:Li0/j1;

    .line 535
    .line 536
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v14

    .line 540
    check-cast v14, Lf1/w;

    .line 541
    .line 542
    iget-wide v14, v14, Lf1/w;->a:J

    .line 543
    .line 544
    invoke-virtual {v3}, Lbi/b;->h()J

    .line 545
    .line 546
    .line 547
    move-result-wide v104

    .line 548
    move-wide/from16 v102, v14

    .line 549
    .line 550
    iget-object v14, v3, Lbi/b;->M:Li0/j1;

    .line 551
    .line 552
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v14

    .line 556
    check-cast v14, Lf1/w;

    .line 557
    .line 558
    iget-wide v14, v14, Lf1/w;->a:J

    .line 559
    .line 560
    move-wide/from16 v106, v14

    .line 561
    .line 562
    iget-object v14, v3, Lbi/b;->N:Li0/j1;

    .line 563
    .line 564
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v14

    .line 568
    check-cast v14, Lf1/w;

    .line 569
    .line 570
    iget-wide v14, v14, Lf1/w;->a:J

    .line 571
    .line 572
    invoke-virtual {v3}, Lbi/b;->m()J

    .line 573
    .line 574
    .line 575
    move-result-wide v110

    .line 576
    move-wide/from16 v108, v14

    .line 577
    .line 578
    iget-object v14, v3, Lbi/b;->P:Li0/j1;

    .line 579
    .line 580
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v14

    .line 584
    check-cast v14, Lf1/w;

    .line 585
    .line 586
    iget-wide v14, v14, Lf1/w;->a:J

    .line 587
    .line 588
    move-wide/from16 v112, v14

    .line 589
    .line 590
    iget-object v14, v3, Lbi/b;->Q:Li0/j1;

    .line 591
    .line 592
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v14

    .line 596
    check-cast v14, Lf1/w;

    .line 597
    .line 598
    iget-wide v14, v14, Lf1/w;->a:J

    .line 599
    .line 600
    move-wide/from16 v114, v14

    .line 601
    .line 602
    iget-object v14, v3, Lbi/b;->R:Li0/j1;

    .line 603
    .line 604
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v14

    .line 608
    check-cast v14, Lf1/w;

    .line 609
    .line 610
    iget-wide v14, v14, Lf1/w;->a:J

    .line 611
    .line 612
    move-wide/from16 v116, v14

    .line 613
    .line 614
    iget-object v14, v3, Lbi/b;->S:Li0/j1;

    .line 615
    .line 616
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v14

    .line 620
    check-cast v14, Lf1/w;

    .line 621
    .line 622
    iget-wide v14, v14, Lf1/w;->a:J

    .line 623
    .line 624
    move-wide/from16 v118, v14

    .line 625
    .line 626
    iget-object v14, v3, Lbi/b;->T:Li0/j1;

    .line 627
    .line 628
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v14

    .line 632
    check-cast v14, Lf1/w;

    .line 633
    .line 634
    iget-wide v14, v14, Lf1/w;->a:J

    .line 635
    .line 636
    move-wide/from16 v120, v14

    .line 637
    .line 638
    iget-object v14, v3, Lbi/b;->U:Li0/j1;

    .line 639
    .line 640
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v14

    .line 644
    check-cast v14, Lf1/w;

    .line 645
    .line 646
    iget-wide v14, v14, Lf1/w;->a:J

    .line 647
    .line 648
    invoke-virtual {v3}, Lbi/b;->i()J

    .line 649
    .line 650
    .line 651
    move-result-wide v124

    .line 652
    move-wide/from16 v122, v14

    .line 653
    .line 654
    iget-object v14, v3, Lbi/b;->W:Li0/j1;

    .line 655
    .line 656
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v14

    .line 660
    check-cast v14, Lf1/w;

    .line 661
    .line 662
    iget-wide v14, v14, Lf1/w;->a:J

    .line 663
    .line 664
    invoke-virtual {v3}, Lbi/b;->o()J

    .line 665
    .line 666
    .line 667
    move-result-wide v128

    .line 668
    move-wide/from16 v126, v14

    .line 669
    .line 670
    iget-object v14, v3, Lbi/b;->Y:Li0/j1;

    .line 671
    .line 672
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v14

    .line 676
    check-cast v14, Lf1/w;

    .line 677
    .line 678
    iget-wide v14, v14, Lf1/w;->a:J

    .line 679
    .line 680
    move-wide/from16 v130, v14

    .line 681
    .line 682
    iget-object v14, v3, Lbi/b;->Z:Li0/j1;

    .line 683
    .line 684
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v14

    .line 688
    check-cast v14, Lf1/w;

    .line 689
    .line 690
    iget-wide v14, v14, Lf1/w;->a:J

    .line 691
    .line 692
    move-wide/from16 v132, v14

    .line 693
    .line 694
    iget-object v14, v3, Lbi/b;->a0:Li0/j1;

    .line 695
    .line 696
    invoke-virtual {v14}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v14

    .line 700
    check-cast v14, Lf1/w;

    .line 701
    .line 702
    iget-wide v14, v14, Lf1/w;->a:J

    .line 703
    .line 704
    new-instance v29, Lbi/b;

    .line 705
    .line 706
    move-wide/from16 v134, v14

    .line 707
    .line 708
    invoke-direct/range {v29 .. v135}, Lbi/b;-><init>(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)V

    .line 709
    .line 710
    .line 711
    move-object/from16 v14, v29

    .line 712
    .line 713
    invoke-virtual {v0, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 714
    .line 715
    .line 716
    goto :goto_7

    .line 717
    :cond_8
    move-object/from16 v136, v15

    .line 718
    .line 719
    :goto_7
    check-cast v14, Lbi/b;

    .line 720
    .line 721
    sget-object v15, Lbi/d;->a:Li0/m2;

    .line 722
    .line 723
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 724
    .line 725
    .line 726
    move-object v15, v1

    .line 727
    invoke-virtual {v3}, Lbi/b;->j()J

    .line 728
    .line 729
    .line 730
    move-result-wide v0

    .line 731
    move-object/from16 p1, v15

    .line 732
    .line 733
    iget-object v15, v14, Lbi/b;->a:Li0/j1;

    .line 734
    .line 735
    move-object/from16 p2, v5

    .line 736
    .line 737
    new-instance v5, Lf1/w;

    .line 738
    .line 739
    invoke-direct {v5, v0, v1}, Lf1/w;-><init>(J)V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v15, v5}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v3}, Lbi/b;->e()J

    .line 746
    .line 747
    .line 748
    move-result-wide v0

    .line 749
    iget-object v5, v14, Lbi/b;->b:Li0/j1;

    .line 750
    .line 751
    invoke-static {v0, v1, v5, v13}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    check-cast v0, Lf1/w;

    .line 756
    .line 757
    iget-wide v0, v0, Lf1/w;->a:J

    .line 758
    .line 759
    iget-object v5, v14, Lbi/b;->c:Li0/j1;

    .line 760
    .line 761
    invoke-static {v0, v1, v5, v12}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    check-cast v0, Lf1/w;

    .line 766
    .line 767
    iget-wide v0, v0, Lf1/w;->a:J

    .line 768
    .line 769
    iget-object v5, v14, Lbi/b;->d:Li0/j1;

    .line 770
    .line 771
    invoke-static {v0, v1, v5, v11}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    check-cast v0, Lf1/w;

    .line 776
    .line 777
    iget-wide v0, v0, Lf1/w;->a:J

    .line 778
    .line 779
    iget-object v5, v14, Lbi/b;->e:Li0/j1;

    .line 780
    .line 781
    invoke-static {v0, v1, v5, v10}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    check-cast v0, Lf1/w;

    .line 786
    .line 787
    iget-wide v0, v0, Lf1/w;->a:J

    .line 788
    .line 789
    iget-object v5, v14, Lbi/b;->f:Li0/j1;

    .line 790
    .line 791
    invoke-static {v0, v1, v5, v9}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    check-cast v0, Lf1/w;

    .line 796
    .line 797
    iget-wide v0, v0, Lf1/w;->a:J

    .line 798
    .line 799
    iget-object v5, v14, Lbi/b;->g:Li0/j1;

    .line 800
    .line 801
    invoke-static {v0, v1, v5, v8}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    check-cast v0, Lf1/w;

    .line 806
    .line 807
    iget-wide v0, v0, Lf1/w;->a:J

    .line 808
    .line 809
    iget-object v5, v14, Lbi/b;->h:Li0/j1;

    .line 810
    .line 811
    invoke-static {v0, v1, v5, v7}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v0

    .line 815
    check-cast v0, Lf1/w;

    .line 816
    .line 817
    iget-wide v0, v0, Lf1/w;->a:J

    .line 818
    .line 819
    iget-object v5, v14, Lbi/b;->i:Li0/j1;

    .line 820
    .line 821
    new-instance v7, Lf1/w;

    .line 822
    .line 823
    invoke-direct {v7, v0, v1}, Lf1/w;-><init>(J)V

    .line 824
    .line 825
    .line 826
    invoke-virtual {v5, v7}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v3}, Lbi/b;->b()J

    .line 830
    .line 831
    .line 832
    move-result-wide v0

    .line 833
    iget-object v5, v14, Lbi/b;->j:Li0/j1;

    .line 834
    .line 835
    invoke-static {v0, v1, v5, v6}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    check-cast v0, Lf1/w;

    .line 840
    .line 841
    iget-wide v0, v0, Lf1/w;->a:J

    .line 842
    .line 843
    iget-object v5, v14, Lbi/b;->k:Li0/j1;

    .line 844
    .line 845
    invoke-static {v0, v1, v5, v4}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    check-cast v0, Lf1/w;

    .line 850
    .line 851
    iget-wide v0, v0, Lf1/w;->a:J

    .line 852
    .line 853
    iget-object v4, v14, Lbi/b;->l:Li0/j1;

    .line 854
    .line 855
    invoke-static {v0, v1, v4, v2}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    check-cast v0, Lf1/w;

    .line 860
    .line 861
    iget-wide v0, v0, Lf1/w;->a:J

    .line 862
    .line 863
    iget-object v2, v14, Lbi/b;->m:Li0/j1;

    .line 864
    .line 865
    move-object/from16 v4, v136

    .line 866
    .line 867
    invoke-static {v0, v1, v2, v4}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    check-cast v0, Lf1/w;

    .line 872
    .line 873
    iget-wide v0, v0, Lf1/w;->a:J

    .line 874
    .line 875
    iget-object v2, v14, Lbi/b;->n:Li0/j1;

    .line 876
    .line 877
    move-object/from16 v4, v26

    .line 878
    .line 879
    invoke-static {v0, v1, v2, v4}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    check-cast v0, Lf1/w;

    .line 884
    .line 885
    iget-wide v0, v0, Lf1/w;->a:J

    .line 886
    .line 887
    iget-object v2, v14, Lbi/b;->o:Li0/j1;

    .line 888
    .line 889
    move-object/from16 v4, v25

    .line 890
    .line 891
    invoke-static {v0, v1, v2, v4}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    check-cast v0, Lf1/w;

    .line 896
    .line 897
    iget-wide v0, v0, Lf1/w;->a:J

    .line 898
    .line 899
    iget-object v2, v14, Lbi/b;->p:Li0/j1;

    .line 900
    .line 901
    move-object/from16 v4, v24

    .line 902
    .line 903
    invoke-static {v0, v1, v2, v4}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    check-cast v0, Lf1/w;

    .line 908
    .line 909
    iget-wide v0, v0, Lf1/w;->a:J

    .line 910
    .line 911
    iget-object v2, v14, Lbi/b;->q:Li0/j1;

    .line 912
    .line 913
    new-instance v4, Lf1/w;

    .line 914
    .line 915
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 916
    .line 917
    .line 918
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 919
    .line 920
    .line 921
    invoke-virtual {v3}, Lbi/b;->k()J

    .line 922
    .line 923
    .line 924
    move-result-wide v0

    .line 925
    iget-object v2, v14, Lbi/b;->r:Li0/j1;

    .line 926
    .line 927
    new-instance v4, Lf1/w;

    .line 928
    .line 929
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 930
    .line 931
    .line 932
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 933
    .line 934
    .line 935
    invoke-virtual {v3}, Lbi/b;->f()J

    .line 936
    .line 937
    .line 938
    move-result-wide v0

    .line 939
    iget-object v2, v14, Lbi/b;->s:Li0/j1;

    .line 940
    .line 941
    move-object/from16 v4, v23

    .line 942
    .line 943
    invoke-static {v0, v1, v2, v4}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v0

    .line 947
    check-cast v0, Lf1/w;

    .line 948
    .line 949
    iget-wide v0, v0, Lf1/w;->a:J

    .line 950
    .line 951
    iget-object v2, v14, Lbi/b;->t:Li0/j1;

    .line 952
    .line 953
    move-object/from16 v4, v22

    .line 954
    .line 955
    invoke-static {v0, v1, v2, v4}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 956
    .line 957
    .line 958
    move-result-object v0

    .line 959
    check-cast v0, Lf1/w;

    .line 960
    .line 961
    iget-wide v0, v0, Lf1/w;->a:J

    .line 962
    .line 963
    iget-object v2, v14, Lbi/b;->u:Li0/j1;

    .line 964
    .line 965
    move-object/from16 v4, v21

    .line 966
    .line 967
    invoke-static {v0, v1, v2, v4}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 968
    .line 969
    .line 970
    move-result-object v0

    .line 971
    check-cast v0, Lf1/w;

    .line 972
    .line 973
    iget-wide v0, v0, Lf1/w;->a:J

    .line 974
    .line 975
    iget-object v2, v14, Lbi/b;->v:Li0/j1;

    .line 976
    .line 977
    new-instance v4, Lf1/w;

    .line 978
    .line 979
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v3}, Lbi/b;->c()J

    .line 986
    .line 987
    .line 988
    move-result-wide v0

    .line 989
    iget-object v2, v14, Lbi/b;->w:Li0/j1;

    .line 990
    .line 991
    move-object/from16 v4, v20

    .line 992
    .line 993
    invoke-static {v0, v1, v2, v4}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 994
    .line 995
    .line 996
    move-result-object v0

    .line 997
    check-cast v0, Lf1/w;

    .line 998
    .line 999
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1000
    .line 1001
    iget-object v2, v14, Lbi/b;->x:Li0/j1;

    .line 1002
    .line 1003
    move-object/from16 v4, v19

    .line 1004
    .line 1005
    invoke-static {v0, v1, v2, v4}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v0

    .line 1009
    check-cast v0, Lf1/w;

    .line 1010
    .line 1011
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1012
    .line 1013
    iget-object v2, v14, Lbi/b;->y:Li0/j1;

    .line 1014
    .line 1015
    move-object/from16 v4, v18

    .line 1016
    .line 1017
    invoke-static {v0, v1, v2, v4}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    check-cast v0, Lf1/w;

    .line 1022
    .line 1023
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1024
    .line 1025
    iget-object v2, v14, Lbi/b;->z:Li0/j1;

    .line 1026
    .line 1027
    move-object/from16 v4, v17

    .line 1028
    .line 1029
    invoke-static {v0, v1, v2, v4}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    check-cast v0, Lf1/w;

    .line 1034
    .line 1035
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1036
    .line 1037
    iget-object v2, v14, Lbi/b;->A:Li0/j1;

    .line 1038
    .line 1039
    move-object/from16 v4, v16

    .line 1040
    .line 1041
    invoke-static {v0, v1, v2, v4}, Lbc/e;->e(JLi0/j1;Li0/j1;)Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    check-cast v0, Lf1/w;

    .line 1046
    .line 1047
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1048
    .line 1049
    iget-object v2, v14, Lbi/b;->B:Li0/j1;

    .line 1050
    .line 1051
    new-instance v4, Lf1/w;

    .line 1052
    .line 1053
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1057
    .line 1058
    .line 1059
    iget-object v0, v3, Lbi/b;->C:Li0/j1;

    .line 1060
    .line 1061
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    check-cast v0, Lf1/w;

    .line 1066
    .line 1067
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1068
    .line 1069
    iget-object v2, v14, Lbi/b;->C:Li0/j1;

    .line 1070
    .line 1071
    new-instance v4, Lf1/w;

    .line 1072
    .line 1073
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1077
    .line 1078
    .line 1079
    iget-object v0, v3, Lbi/b;->D:Li0/j1;

    .line 1080
    .line 1081
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    check-cast v0, Lf1/w;

    .line 1086
    .line 1087
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1088
    .line 1089
    iget-object v2, v14, Lbi/b;->D:Li0/j1;

    .line 1090
    .line 1091
    new-instance v4, Lf1/w;

    .line 1092
    .line 1093
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1097
    .line 1098
    .line 1099
    invoke-virtual {v3}, Lbi/b;->a()J

    .line 1100
    .line 1101
    .line 1102
    move-result-wide v0

    .line 1103
    iget-object v2, v14, Lbi/b;->E:Li0/j1;

    .line 1104
    .line 1105
    new-instance v4, Lf1/w;

    .line 1106
    .line 1107
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v3}, Lbi/b;->d()J

    .line 1114
    .line 1115
    .line 1116
    move-result-wide v0

    .line 1117
    iget-object v2, v14, Lbi/b;->F:Li0/j1;

    .line 1118
    .line 1119
    new-instance v4, Lf1/w;

    .line 1120
    .line 1121
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1125
    .line 1126
    .line 1127
    iget-object v0, v3, Lbi/b;->G:Li0/j1;

    .line 1128
    .line 1129
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v0

    .line 1133
    check-cast v0, Lf1/w;

    .line 1134
    .line 1135
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1136
    .line 1137
    iget-object v2, v14, Lbi/b;->G:Li0/j1;

    .line 1138
    .line 1139
    new-instance v4, Lf1/w;

    .line 1140
    .line 1141
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v3}, Lbi/b;->l()J

    .line 1148
    .line 1149
    .line 1150
    move-result-wide v0

    .line 1151
    iget-object v2, v14, Lbi/b;->H:Li0/j1;

    .line 1152
    .line 1153
    new-instance v4, Lf1/w;

    .line 1154
    .line 1155
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v3}, Lbi/b;->g()J

    .line 1162
    .line 1163
    .line 1164
    move-result-wide v0

    .line 1165
    iget-object v2, v14, Lbi/b;->I:Li0/j1;

    .line 1166
    .line 1167
    new-instance v4, Lf1/w;

    .line 1168
    .line 1169
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v3}, Lbi/b;->n()J

    .line 1176
    .line 1177
    .line 1178
    move-result-wide v0

    .line 1179
    iget-object v2, v14, Lbi/b;->J:Li0/j1;

    .line 1180
    .line 1181
    new-instance v4, Lf1/w;

    .line 1182
    .line 1183
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1187
    .line 1188
    .line 1189
    iget-object v0, v3, Lbi/b;->K:Li0/j1;

    .line 1190
    .line 1191
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v0

    .line 1195
    check-cast v0, Lf1/w;

    .line 1196
    .line 1197
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1198
    .line 1199
    iget-object v2, v14, Lbi/b;->K:Li0/j1;

    .line 1200
    .line 1201
    new-instance v4, Lf1/w;

    .line 1202
    .line 1203
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v3}, Lbi/b;->h()J

    .line 1210
    .line 1211
    .line 1212
    move-result-wide v0

    .line 1213
    iget-object v2, v14, Lbi/b;->L:Li0/j1;

    .line 1214
    .line 1215
    new-instance v4, Lf1/w;

    .line 1216
    .line 1217
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1218
    .line 1219
    .line 1220
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1221
    .line 1222
    .line 1223
    iget-object v0, v3, Lbi/b;->M:Li0/j1;

    .line 1224
    .line 1225
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v0

    .line 1229
    check-cast v0, Lf1/w;

    .line 1230
    .line 1231
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1232
    .line 1233
    iget-object v2, v14, Lbi/b;->M:Li0/j1;

    .line 1234
    .line 1235
    new-instance v4, Lf1/w;

    .line 1236
    .line 1237
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1241
    .line 1242
    .line 1243
    iget-object v0, v3, Lbi/b;->N:Li0/j1;

    .line 1244
    .line 1245
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v0

    .line 1249
    check-cast v0, Lf1/w;

    .line 1250
    .line 1251
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1252
    .line 1253
    iget-object v2, v14, Lbi/b;->N:Li0/j1;

    .line 1254
    .line 1255
    new-instance v4, Lf1/w;

    .line 1256
    .line 1257
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1258
    .line 1259
    .line 1260
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual {v3}, Lbi/b;->m()J

    .line 1264
    .line 1265
    .line 1266
    move-result-wide v0

    .line 1267
    iget-object v2, v14, Lbi/b;->O:Li0/j1;

    .line 1268
    .line 1269
    new-instance v4, Lf1/w;

    .line 1270
    .line 1271
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1275
    .line 1276
    .line 1277
    iget-object v0, v3, Lbi/b;->P:Li0/j1;

    .line 1278
    .line 1279
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v0

    .line 1283
    check-cast v0, Lf1/w;

    .line 1284
    .line 1285
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1286
    .line 1287
    iget-object v2, v14, Lbi/b;->P:Li0/j1;

    .line 1288
    .line 1289
    new-instance v4, Lf1/w;

    .line 1290
    .line 1291
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1292
    .line 1293
    .line 1294
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1295
    .line 1296
    .line 1297
    iget-object v0, v3, Lbi/b;->Q:Li0/j1;

    .line 1298
    .line 1299
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v0

    .line 1303
    check-cast v0, Lf1/w;

    .line 1304
    .line 1305
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1306
    .line 1307
    iget-object v2, v14, Lbi/b;->Q:Li0/j1;

    .line 1308
    .line 1309
    new-instance v4, Lf1/w;

    .line 1310
    .line 1311
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1312
    .line 1313
    .line 1314
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1315
    .line 1316
    .line 1317
    iget-object v0, v3, Lbi/b;->R:Li0/j1;

    .line 1318
    .line 1319
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v0

    .line 1323
    check-cast v0, Lf1/w;

    .line 1324
    .line 1325
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1326
    .line 1327
    iget-object v2, v14, Lbi/b;->R:Li0/j1;

    .line 1328
    .line 1329
    new-instance v4, Lf1/w;

    .line 1330
    .line 1331
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1332
    .line 1333
    .line 1334
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1335
    .line 1336
    .line 1337
    iget-object v0, v3, Lbi/b;->S:Li0/j1;

    .line 1338
    .line 1339
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v0

    .line 1343
    check-cast v0, Lf1/w;

    .line 1344
    .line 1345
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1346
    .line 1347
    iget-object v2, v14, Lbi/b;->S:Li0/j1;

    .line 1348
    .line 1349
    new-instance v4, Lf1/w;

    .line 1350
    .line 1351
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1352
    .line 1353
    .line 1354
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1355
    .line 1356
    .line 1357
    iget-object v0, v3, Lbi/b;->T:Li0/j1;

    .line 1358
    .line 1359
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v0

    .line 1363
    check-cast v0, Lf1/w;

    .line 1364
    .line 1365
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1366
    .line 1367
    iget-object v2, v14, Lbi/b;->T:Li0/j1;

    .line 1368
    .line 1369
    new-instance v4, Lf1/w;

    .line 1370
    .line 1371
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1372
    .line 1373
    .line 1374
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1375
    .line 1376
    .line 1377
    iget-object v0, v3, Lbi/b;->U:Li0/j1;

    .line 1378
    .line 1379
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v0

    .line 1383
    check-cast v0, Lf1/w;

    .line 1384
    .line 1385
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1386
    .line 1387
    iget-object v2, v14, Lbi/b;->U:Li0/j1;

    .line 1388
    .line 1389
    new-instance v4, Lf1/w;

    .line 1390
    .line 1391
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual {v3}, Lbi/b;->i()J

    .line 1398
    .line 1399
    .line 1400
    move-result-wide v0

    .line 1401
    iget-object v2, v14, Lbi/b;->V:Li0/j1;

    .line 1402
    .line 1403
    new-instance v4, Lf1/w;

    .line 1404
    .line 1405
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1406
    .line 1407
    .line 1408
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1409
    .line 1410
    .line 1411
    iget-object v0, v3, Lbi/b;->W:Li0/j1;

    .line 1412
    .line 1413
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v0

    .line 1417
    check-cast v0, Lf1/w;

    .line 1418
    .line 1419
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1420
    .line 1421
    iget-object v2, v14, Lbi/b;->W:Li0/j1;

    .line 1422
    .line 1423
    new-instance v4, Lf1/w;

    .line 1424
    .line 1425
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1426
    .line 1427
    .line 1428
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual {v3}, Lbi/b;->o()J

    .line 1432
    .line 1433
    .line 1434
    move-result-wide v0

    .line 1435
    iget-object v2, v14, Lbi/b;->X:Li0/j1;

    .line 1436
    .line 1437
    new-instance v4, Lf1/w;

    .line 1438
    .line 1439
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1440
    .line 1441
    .line 1442
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1443
    .line 1444
    .line 1445
    iget-object v0, v3, Lbi/b;->Y:Li0/j1;

    .line 1446
    .line 1447
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v0

    .line 1451
    check-cast v0, Lf1/w;

    .line 1452
    .line 1453
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1454
    .line 1455
    iget-object v2, v14, Lbi/b;->Y:Li0/j1;

    .line 1456
    .line 1457
    new-instance v4, Lf1/w;

    .line 1458
    .line 1459
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1460
    .line 1461
    .line 1462
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1463
    .line 1464
    .line 1465
    iget-object v0, v3, Lbi/b;->Z:Li0/j1;

    .line 1466
    .line 1467
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v0

    .line 1471
    check-cast v0, Lf1/w;

    .line 1472
    .line 1473
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1474
    .line 1475
    iget-object v2, v14, Lbi/b;->Z:Li0/j1;

    .line 1476
    .line 1477
    new-instance v4, Lf1/w;

    .line 1478
    .line 1479
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1480
    .line 1481
    .line 1482
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1483
    .line 1484
    .line 1485
    iget-object v0, v3, Lbi/b;->a0:Li0/j1;

    .line 1486
    .line 1487
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v0

    .line 1491
    check-cast v0, Lf1/w;

    .line 1492
    .line 1493
    iget-wide v0, v0, Lf1/w;->a:J

    .line 1494
    .line 1495
    iget-object v2, v14, Lbi/b;->a0:Li0/j1;

    .line 1496
    .line 1497
    new-instance v4, Lf1/w;

    .line 1498
    .line 1499
    invoke-direct {v4, v0, v1}, Lf1/w;-><init>(J)V

    .line 1500
    .line 1501
    .line 1502
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1503
    .line 1504
    .line 1505
    invoke-virtual/range {p4 .. p4}, Li0/h0;->P()Ljava/lang/Object;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v0

    .line 1509
    move-object/from16 v1, p2

    .line 1510
    .line 1511
    if-ne v0, v1, :cond_9

    .line 1512
    .line 1513
    move-object/from16 v15, p1

    .line 1514
    .line 1515
    iget-object v0, v15, Lbi/l;->a:Li0/j1;

    .line 1516
    .line 1517
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v0

    .line 1521
    move-object/from16 v30, v0

    .line 1522
    .line 1523
    check-cast v30, Li2/n0;

    .line 1524
    .line 1525
    iget-object v0, v15, Lbi/l;->b:Li0/j1;

    .line 1526
    .line 1527
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v0

    .line 1531
    move-object/from16 v31, v0

    .line 1532
    .line 1533
    check-cast v31, Li2/n0;

    .line 1534
    .line 1535
    iget-object v0, v15, Lbi/l;->c:Li0/j1;

    .line 1536
    .line 1537
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v0

    .line 1541
    move-object/from16 v32, v0

    .line 1542
    .line 1543
    check-cast v32, Li2/n0;

    .line 1544
    .line 1545
    iget-object v0, v15, Lbi/l;->d:Li0/j1;

    .line 1546
    .line 1547
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v0

    .line 1551
    move-object/from16 v33, v0

    .line 1552
    .line 1553
    check-cast v33, Li2/n0;

    .line 1554
    .line 1555
    iget-object v0, v15, Lbi/l;->e:Li0/j1;

    .line 1556
    .line 1557
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v0

    .line 1561
    move-object/from16 v34, v0

    .line 1562
    .line 1563
    check-cast v34, Li2/n0;

    .line 1564
    .line 1565
    iget-object v0, v15, Lbi/l;->f:Li0/j1;

    .line 1566
    .line 1567
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v0

    .line 1571
    move-object/from16 v35, v0

    .line 1572
    .line 1573
    check-cast v35, Li2/n0;

    .line 1574
    .line 1575
    iget-object v0, v15, Lbi/l;->g:Li0/j1;

    .line 1576
    .line 1577
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v0

    .line 1581
    move-object/from16 v36, v0

    .line 1582
    .line 1583
    check-cast v36, Li2/n0;

    .line 1584
    .line 1585
    iget-object v0, v15, Lbi/l;->h:Li0/j1;

    .line 1586
    .line 1587
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v0

    .line 1591
    move-object/from16 v37, v0

    .line 1592
    .line 1593
    check-cast v37, Li2/n0;

    .line 1594
    .line 1595
    iget-object v0, v15, Lbi/l;->i:Li0/j1;

    .line 1596
    .line 1597
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v0

    .line 1601
    move-object/from16 v38, v0

    .line 1602
    .line 1603
    check-cast v38, Li2/n0;

    .line 1604
    .line 1605
    iget-object v0, v15, Lbi/l;->j:Li0/j1;

    .line 1606
    .line 1607
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v0

    .line 1611
    move-object/from16 v39, v0

    .line 1612
    .line 1613
    check-cast v39, Li2/n0;

    .line 1614
    .line 1615
    iget-object v0, v15, Lbi/l;->k:Li0/j1;

    .line 1616
    .line 1617
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v0

    .line 1621
    move-object/from16 v40, v0

    .line 1622
    .line 1623
    check-cast v40, Li2/n0;

    .line 1624
    .line 1625
    iget-object v0, v15, Lbi/l;->l:Li0/j1;

    .line 1626
    .line 1627
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v0

    .line 1631
    move-object/from16 v41, v0

    .line 1632
    .line 1633
    check-cast v41, Li2/n0;

    .line 1634
    .line 1635
    iget-object v0, v15, Lbi/l;->m:Li0/j1;

    .line 1636
    .line 1637
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v0

    .line 1641
    move-object/from16 v42, v0

    .line 1642
    .line 1643
    check-cast v42, Li2/n0;

    .line 1644
    .line 1645
    iget-object v0, v15, Lbi/l;->n:Li0/j1;

    .line 1646
    .line 1647
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v0

    .line 1651
    move-object/from16 v43, v0

    .line 1652
    .line 1653
    check-cast v43, Li2/n0;

    .line 1654
    .line 1655
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1656
    .line 1657
    .line 1658
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1659
    .line 1660
    .line 1661
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1662
    .line 1663
    .line 1664
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1665
    .line 1666
    .line 1667
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1668
    .line 1669
    .line 1670
    invoke-virtual/range {v35 .. v35}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1671
    .line 1672
    .line 1673
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1674
    .line 1675
    .line 1676
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1677
    .line 1678
    .line 1679
    invoke-virtual/range {v38 .. v38}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1680
    .line 1681
    .line 1682
    invoke-virtual/range {v39 .. v39}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1683
    .line 1684
    .line 1685
    invoke-virtual/range {v40 .. v40}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1686
    .line 1687
    .line 1688
    invoke-virtual/range {v41 .. v41}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1689
    .line 1690
    .line 1691
    invoke-virtual/range {v42 .. v42}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1692
    .line 1693
    .line 1694
    invoke-virtual/range {v43 .. v43}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1695
    .line 1696
    .line 1697
    new-instance v29, Lbi/l;

    .line 1698
    .line 1699
    invoke-direct/range {v29 .. v43}, Lbi/l;-><init>(Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;Li2/n0;)V

    .line 1700
    .line 1701
    .line 1702
    move-object/from16 v2, p4

    .line 1703
    .line 1704
    move-object/from16 v0, v29

    .line 1705
    .line 1706
    invoke-virtual {v2, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1707
    .line 1708
    .line 1709
    goto :goto_8

    .line 1710
    :cond_9
    move-object/from16 v15, p1

    .line 1711
    .line 1712
    move-object/from16 v2, p4

    .line 1713
    .line 1714
    :goto_8
    check-cast v0, Lbi/l;

    .line 1715
    .line 1716
    sget-object v4, Lbi/m;->a:Li0/m2;

    .line 1717
    .line 1718
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1719
    .line 1720
    .line 1721
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1722
    .line 1723
    .line 1724
    iget-object v4, v15, Lbi/l;->a:Li0/j1;

    .line 1725
    .line 1726
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v4

    .line 1730
    check-cast v4, Li2/n0;

    .line 1731
    .line 1732
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1733
    .line 1734
    .line 1735
    iget-object v5, v0, Lbi/l;->a:Li0/j1;

    .line 1736
    .line 1737
    invoke-virtual {v5, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1738
    .line 1739
    .line 1740
    iget-object v4, v15, Lbi/l;->b:Li0/j1;

    .line 1741
    .line 1742
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v4

    .line 1746
    check-cast v4, Li2/n0;

    .line 1747
    .line 1748
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1749
    .line 1750
    .line 1751
    iget-object v5, v0, Lbi/l;->b:Li0/j1;

    .line 1752
    .line 1753
    invoke-virtual {v5, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1754
    .line 1755
    .line 1756
    iget-object v4, v15, Lbi/l;->c:Li0/j1;

    .line 1757
    .line 1758
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1759
    .line 1760
    .line 1761
    move-result-object v4

    .line 1762
    check-cast v4, Li2/n0;

    .line 1763
    .line 1764
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1765
    .line 1766
    .line 1767
    iget-object v5, v0, Lbi/l;->c:Li0/j1;

    .line 1768
    .line 1769
    invoke-virtual {v5, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1770
    .line 1771
    .line 1772
    iget-object v4, v15, Lbi/l;->d:Li0/j1;

    .line 1773
    .line 1774
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v4

    .line 1778
    check-cast v4, Li2/n0;

    .line 1779
    .line 1780
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1781
    .line 1782
    .line 1783
    iget-object v5, v0, Lbi/l;->d:Li0/j1;

    .line 1784
    .line 1785
    invoke-virtual {v5, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1786
    .line 1787
    .line 1788
    iget-object v4, v15, Lbi/l;->e:Li0/j1;

    .line 1789
    .line 1790
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v4

    .line 1794
    check-cast v4, Li2/n0;

    .line 1795
    .line 1796
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1797
    .line 1798
    .line 1799
    iget-object v5, v0, Lbi/l;->e:Li0/j1;

    .line 1800
    .line 1801
    invoke-virtual {v5, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1802
    .line 1803
    .line 1804
    iget-object v4, v15, Lbi/l;->f:Li0/j1;

    .line 1805
    .line 1806
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v4

    .line 1810
    check-cast v4, Li2/n0;

    .line 1811
    .line 1812
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1813
    .line 1814
    .line 1815
    iget-object v5, v0, Lbi/l;->f:Li0/j1;

    .line 1816
    .line 1817
    invoke-virtual {v5, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1818
    .line 1819
    .line 1820
    iget-object v4, v15, Lbi/l;->g:Li0/j1;

    .line 1821
    .line 1822
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v4

    .line 1826
    check-cast v4, Li2/n0;

    .line 1827
    .line 1828
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1829
    .line 1830
    .line 1831
    iget-object v5, v0, Lbi/l;->g:Li0/j1;

    .line 1832
    .line 1833
    invoke-virtual {v5, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1834
    .line 1835
    .line 1836
    iget-object v4, v15, Lbi/l;->h:Li0/j1;

    .line 1837
    .line 1838
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1839
    .line 1840
    .line 1841
    move-result-object v4

    .line 1842
    check-cast v4, Li2/n0;

    .line 1843
    .line 1844
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1845
    .line 1846
    .line 1847
    iget-object v5, v0, Lbi/l;->h:Li0/j1;

    .line 1848
    .line 1849
    invoke-virtual {v5, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1850
    .line 1851
    .line 1852
    iget-object v4, v15, Lbi/l;->i:Li0/j1;

    .line 1853
    .line 1854
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v4

    .line 1858
    check-cast v4, Li2/n0;

    .line 1859
    .line 1860
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1861
    .line 1862
    .line 1863
    iget-object v5, v0, Lbi/l;->i:Li0/j1;

    .line 1864
    .line 1865
    invoke-virtual {v5, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1866
    .line 1867
    .line 1868
    iget-object v4, v15, Lbi/l;->j:Li0/j1;

    .line 1869
    .line 1870
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v4

    .line 1874
    check-cast v4, Li2/n0;

    .line 1875
    .line 1876
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1877
    .line 1878
    .line 1879
    iget-object v5, v0, Lbi/l;->j:Li0/j1;

    .line 1880
    .line 1881
    invoke-virtual {v5, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1882
    .line 1883
    .line 1884
    iget-object v4, v15, Lbi/l;->k:Li0/j1;

    .line 1885
    .line 1886
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v4

    .line 1890
    check-cast v4, Li2/n0;

    .line 1891
    .line 1892
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1893
    .line 1894
    .line 1895
    iget-object v5, v0, Lbi/l;->k:Li0/j1;

    .line 1896
    .line 1897
    invoke-virtual {v5, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1898
    .line 1899
    .line 1900
    iget-object v4, v15, Lbi/l;->l:Li0/j1;

    .line 1901
    .line 1902
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1903
    .line 1904
    .line 1905
    move-result-object v4

    .line 1906
    check-cast v4, Li2/n0;

    .line 1907
    .line 1908
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1909
    .line 1910
    .line 1911
    iget-object v5, v0, Lbi/l;->l:Li0/j1;

    .line 1912
    .line 1913
    invoke-virtual {v5, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1914
    .line 1915
    .line 1916
    iget-object v4, v15, Lbi/l;->m:Li0/j1;

    .line 1917
    .line 1918
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v4

    .line 1922
    check-cast v4, Li2/n0;

    .line 1923
    .line 1924
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1925
    .line 1926
    .line 1927
    iget-object v5, v0, Lbi/l;->m:Li0/j1;

    .line 1928
    .line 1929
    invoke-virtual {v5, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1930
    .line 1931
    .line 1932
    iget-object v4, v15, Lbi/l;->n:Li0/j1;

    .line 1933
    .line 1934
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v4

    .line 1938
    check-cast v4, Li2/n0;

    .line 1939
    .line 1940
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1941
    .line 1942
    .line 1943
    iget-object v5, v0, Lbi/l;->n:Li0/j1;

    .line 1944
    .line 1945
    invoke-virtual {v5, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1946
    .line 1947
    .line 1948
    invoke-virtual {v14}, Lbi/b;->d()J

    .line 1949
    .line 1950
    .line 1951
    move-result-wide v4

    .line 1952
    invoke-virtual {v2, v4, v5}, Li0/h0;->e(J)Z

    .line 1953
    .line 1954
    .line 1955
    move-result v4

    .line 1956
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v5

    .line 1960
    if-nez v4, :cond_a

    .line 1961
    .line 1962
    if-ne v5, v1, :cond_b

    .line 1963
    .line 1964
    :cond_a
    new-instance v5, Lci/l;

    .line 1965
    .line 1966
    invoke-virtual {v14}, Lbi/b;->d()J

    .line 1967
    .line 1968
    .line 1969
    move-result-wide v6

    .line 1970
    invoke-direct {v5, v6, v7}, Lci/l;-><init>(J)V

    .line 1971
    .line 1972
    .line 1973
    invoke-virtual {v2, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1974
    .line 1975
    .line 1976
    :cond_b
    check-cast v5, Lci/l;

    .line 1977
    .line 1978
    sget-object v1, Lbi/d;->a:Li0/m2;

    .line 1979
    .line 1980
    invoke-virtual {v1, v14}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 1981
    .line 1982
    .line 1983
    move-result-object v1

    .line 1984
    sget-object v4, Lbi/m;->a:Li0/m2;

    .line 1985
    .line 1986
    invoke-virtual {v4, v0}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v0

    .line 1990
    sget-object v4, Lk/v0;->a:Li0/u;

    .line 1991
    .line 1992
    invoke-virtual {v4, v5}, Li0/u;->a(Ljava/lang/Object;)Li0/q1;

    .line 1993
    .line 1994
    .line 1995
    move-result-object v4

    .line 1996
    sget-object v5, Lk/m1;->a:Li0/u;

    .line 1997
    .line 1998
    sget-object v6, Lci/t;->a:Lci/t;

    .line 1999
    .line 2000
    invoke-virtual {v5, v6}, Li0/u;->a(Ljava/lang/Object;)Li0/q1;

    .line 2001
    .line 2002
    .line 2003
    move-result-object v5

    .line 2004
    sget-object v6, Lbi/k;->a:Li0/m2;

    .line 2005
    .line 2006
    invoke-static/range {v28 .. v28}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v7

    .line 2010
    invoke-virtual {v6, v7}, Li0/m2;->a(Ljava/lang/Object;)Li0/q1;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v6

    .line 2014
    filled-new-array {v1, v0, v4, v5, v6}, [Li0/q1;

    .line 2015
    .line 2016
    .line 2017
    move-result-object v0

    .line 2018
    new-instance v1, Lbi/i;

    .line 2019
    .line 2020
    move-object/from16 v5, p3

    .line 2021
    .line 2022
    const/4 v4, 0x0

    .line 2023
    invoke-direct {v1, v5, v4}, Lbi/i;-><init>(Ls0/d;I)V

    .line 2024
    .line 2025
    .line 2026
    const v4, -0x57f267e0

    .line 2027
    .line 2028
    .line 2029
    invoke-static {v4, v1, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 2030
    .line 2031
    .line 2032
    move-result-object v1

    .line 2033
    const/16 v4, 0x38

    .line 2034
    .line 2035
    invoke-static {v0, v1, v2, v4}, Li0/r;->b([Li0/q1;Lfg/p;Li0/h0;I)V

    .line 2036
    .line 2037
    .line 2038
    move-object v4, v15

    .line 2039
    move/from16 v6, v28

    .line 2040
    .line 2041
    goto :goto_9

    .line 2042
    :cond_c
    move-object/from16 v5, p3

    .line 2043
    .line 2044
    move-object v2, v0

    .line 2045
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 2046
    .line 2047
    .line 2048
    move-object/from16 v4, p1

    .line 2049
    .line 2050
    move/from16 v6, p2

    .line 2051
    .line 2052
    :goto_9
    invoke-virtual {v2}, Li0/h0;->t()Li0/r1;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v7

    .line 2056
    if-eqz v7, :cond_d

    .line 2057
    .line 2058
    new-instance v0, Lbi/j;

    .line 2059
    .line 2060
    const/4 v2, 0x0

    .line 2061
    move/from16 v1, p5

    .line 2062
    .line 2063
    invoke-direct/range {v0 .. v6}, Lbi/j;-><init>(IILjava/lang/Object;Ljava/lang/Object;Lsf/b;Z)V

    .line 2064
    .line 2065
    .line 2066
    iput-object v0, v7, Li0/r1;->d:Lfg/p;

    .line 2067
    .line 2068
    :cond_d
    return-void
.end method

.method public static final b0(Ljava/lang/Throwable;Lfg/a;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lbg/a;->a:Ljava/lang/Integer;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v2, 0x13

    .line 14
    .line 15
    if-lt v0, v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, Lag/a;->b:Ljava/lang/reflect/Method;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    check-cast v0, [Ljava/lang/Throwable;

    .line 29
    .line 30
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getSuppressed()[Ljava/lang/Throwable;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    const/4 v3, 0x0

    .line 60
    move v4, v3

    .line 61
    :goto_2
    if-ge v4, v2, :cond_4

    .line 62
    .line 63
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Ljava/lang/Throwable;

    .line 68
    .line 69
    instance-of v5, v5, Lx0/f;

    .line 70
    .line 71
    if-eqz v5, :cond_3

    .line 72
    .line 73
    return v3

    .line 74
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    :try_start_0
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Lx0/a;

    .line 82
    .line 83
    if-eqz p1, :cond_6

    .line 84
    .line 85
    iget-boolean v0, p1, Lx0/a;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    iget-object v2, p1, Lx0/a;->a:Ljava/util/List;

    .line 88
    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    :try_start_1
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    move v4, v3

    .line 96
    :goto_3
    if-ge v4, v0, :cond_6

    .line 97
    .line 98
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    check-cast v5, Lx0/b;

    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    add-int/lit8 v4, v4, 0x1

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :catchall_0
    move-exception p1

    .line 111
    goto :goto_4

    .line 112
    :cond_5
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_6

    .line 117
    .line 118
    const/4 v3, 0x1

    .line 119
    :cond_6
    if-eqz v3, :cond_7

    .line 120
    .line 121
    new-instance v1, Lx0/f;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-direct {v1, p1}, Lx0/f;-><init>(Lx0/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    .line 128
    .line 129
    goto :goto_5

    .line 130
    :goto_4
    move-object v1, p1

    .line 131
    :cond_7
    :goto_5
    if-eqz v1, :cond_8

    .line 132
    .line 133
    invoke-static {p0, v1}, Lac/p;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    :cond_8
    return v3
.end method

.method public static final c(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v3, "onLocationChanged"

    .line 31
    .line 32
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    array-length p0, v0

    .line 51
    const/4 v1, 0x3

    .line 52
    if-ne p0, v1, :cond_0

    .line 53
    .line 54
    aget-object p0, v0, v2

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const-string v1, "TencentLocation"

    .line 61
    .line 62
    invoke-static {p0, v1, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_0

    .line 67
    .line 68
    const/4 p0, 0x1

    .line 69
    aget-object v1, v0, p0

    .line 70
    .line 71
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 72
    .line 73
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_0

    .line 78
    .line 79
    const/4 v1, 0x2

    .line 80
    aget-object v0, v0, v1

    .line 81
    .line 82
    const-class v1, Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_0

    .line 89
    .line 90
    return p0

    .line 91
    :cond_0
    return v2
.end method

.method public static c0(I)I
    .locals 1

    .line 1
    shr-int/lit8 p0, p0, 0x7

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :goto_0
    if-eqz p0, :cond_0

    .line 5
    .line 6
    shr-int/lit8 p0, p0, 0x7

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    return v0
.end method

.method public static final d(Lua/i;Ljava/lang/String;Lua/c;)Lua/c;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget-object v2, v0, Lua/i;->b:Ljava/lang/String;

    .line 12
    .line 13
    move-object v4, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object/from16 v4, p1

    .line 16
    .line 17
    :goto_0
    iget-boolean v5, v0, Lua/i;->c:Z

    .line 18
    .line 19
    iget v6, v0, Lua/i;->d:I

    .line 20
    .line 21
    iget-wide v7, v0, Lua/i;->e:J

    .line 22
    .line 23
    iget-wide v9, v0, Lua/i;->f:J

    .line 24
    .line 25
    iget-wide v11, v0, Lua/i;->g:J

    .line 26
    .line 27
    iget-object v13, v0, Lua/i;->h:Ljava/lang/String;

    .line 28
    .line 29
    iget v14, v0, Lua/i;->i:I

    .line 30
    .line 31
    iget-object v15, v0, Lua/i;->j:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v2, v0, Lua/i;->k:Ljava/lang/String;

    .line 34
    .line 35
    iget-boolean v3, v0, Lua/i;->l:Z

    .line 36
    .line 37
    move-object/from16 v16, v2

    .line 38
    .line 39
    iget v2, v0, Lua/i;->m:I

    .line 40
    .line 41
    move/from16 v18, v2

    .line 42
    .line 43
    iget-object v2, v0, Lua/i;->n:Ljava/lang/String;

    .line 44
    .line 45
    move-object/from16 v19, v2

    .line 46
    .line 47
    iget v2, v0, Lua/i;->o:I

    .line 48
    .line 49
    move/from16 v20, v2

    .line 50
    .line 51
    iget v2, v0, Lua/i;->p:I

    .line 52
    .line 53
    move/from16 v21, v2

    .line 54
    .line 55
    iget-object v2, v0, Lua/i;->q:Ljava/lang/String;

    .line 56
    .line 57
    move-object/from16 v22, v2

    .line 58
    .line 59
    iget-boolean v2, v0, Lua/i;->r:Z

    .line 60
    .line 61
    move/from16 v23, v2

    .line 62
    .line 63
    iget v2, v0, Lua/i;->s:I

    .line 64
    .line 65
    move/from16 v24, v2

    .line 66
    .line 67
    iget v2, v0, Lua/i;->t:I

    .line 68
    .line 69
    move/from16 v25, v2

    .line 70
    .line 71
    iget-boolean v2, v0, Lua/i;->u:Z

    .line 72
    .line 73
    move/from16 v26, v2

    .line 74
    .line 75
    iget-object v2, v0, Lua/i;->v:Ljava/util/List;

    .line 76
    .line 77
    move-object/from16 v27, v2

    .line 78
    .line 79
    iget-boolean v2, v0, Lua/i;->w:Z

    .line 80
    .line 81
    if-eqz v2, :cond_1

    .line 82
    .line 83
    move/from16 v17, v2

    .line 84
    .line 85
    iget-boolean v2, v0, Lua/i;->x:Z

    .line 86
    .line 87
    :goto_1
    move/from16 v28, v2

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_1
    move/from16 v17, v2

    .line 91
    .line 92
    iget-boolean v2, v1, Lua/c;->v:Z

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :goto_2
    if-eqz v17, :cond_2

    .line 96
    .line 97
    iget-boolean v2, v0, Lua/i;->y:Z

    .line 98
    .line 99
    :goto_3
    move/from16 v29, v2

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_2
    iget-boolean v2, v1, Lua/c;->w:Z

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :goto_4
    if-eqz v17, :cond_3

    .line 106
    .line 107
    iget-boolean v2, v0, Lua/i;->z:Z

    .line 108
    .line 109
    :goto_5
    move/from16 v30, v2

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_3
    iget-boolean v2, v1, Lua/c;->x:Z

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :goto_6
    if-eqz v17, :cond_4

    .line 116
    .line 117
    iget v2, v0, Lua/i;->A:I

    .line 118
    .line 119
    :goto_7
    move/from16 v31, v2

    .line 120
    .line 121
    goto :goto_8

    .line 122
    :cond_4
    iget v2, v1, Lua/c;->y:I

    .line 123
    .line 124
    goto :goto_7

    .line 125
    :goto_8
    if-eqz v17, :cond_5

    .line 126
    .line 127
    iget-boolean v2, v0, Lua/i;->B:Z

    .line 128
    .line 129
    :goto_9
    move/from16 v32, v2

    .line 130
    .line 131
    goto :goto_a

    .line 132
    :cond_5
    iget-boolean v2, v1, Lua/c;->z:Z

    .line 133
    .line 134
    goto :goto_9

    .line 135
    :goto_a
    if-eqz v17, :cond_6

    .line 136
    .line 137
    iget-object v2, v0, Lua/i;->C:Ljava/lang/String;

    .line 138
    .line 139
    :goto_b
    move-object/from16 v33, v2

    .line 140
    .line 141
    goto :goto_c

    .line 142
    :cond_6
    iget-object v2, v1, Lua/c;->A:Ljava/lang/String;

    .line 143
    .line 144
    goto :goto_b

    .line 145
    :goto_c
    if-eqz v17, :cond_7

    .line 146
    .line 147
    iget-object v2, v0, Lua/i;->D:Ljava/lang/String;

    .line 148
    .line 149
    :goto_d
    move-object/from16 v34, v2

    .line 150
    .line 151
    goto :goto_e

    .line 152
    :cond_7
    iget-object v2, v1, Lua/c;->B:Ljava/lang/String;

    .line 153
    .line 154
    goto :goto_d

    .line 155
    :goto_e
    if-eqz v17, :cond_8

    .line 156
    .line 157
    iget-object v2, v0, Lua/i;->E:Ljava/lang/String;

    .line 158
    .line 159
    :goto_f
    move-object/from16 v35, v2

    .line 160
    .line 161
    goto :goto_10

    .line 162
    :cond_8
    iget-object v2, v1, Lua/c;->C:Ljava/lang/String;

    .line 163
    .line 164
    goto :goto_f

    .line 165
    :goto_10
    if-eqz v17, :cond_9

    .line 166
    .line 167
    iget-boolean v2, v0, Lua/i;->F:Z

    .line 168
    .line 169
    :goto_11
    move/from16 v36, v2

    .line 170
    .line 171
    goto :goto_12

    .line 172
    :cond_9
    iget-boolean v2, v1, Lua/c;->D:Z

    .line 173
    .line 174
    goto :goto_11

    .line 175
    :goto_12
    if-eqz v17, :cond_a

    .line 176
    .line 177
    iget-object v0, v0, Lua/i;->G:Ljava/lang/String;

    .line 178
    .line 179
    :goto_13
    move-object/from16 v37, v0

    .line 180
    .line 181
    move/from16 v17, v3

    .line 182
    .line 183
    goto :goto_14

    .line 184
    :cond_a
    iget-object v0, v1, Lua/c;->E:Ljava/lang/String;

    .line 185
    .line 186
    goto :goto_13

    .line 187
    :goto_14
    new-instance v3, Lua/c;

    .line 188
    .line 189
    invoke-direct/range {v3 .. v37}, Lua/c;-><init>(Ljava/lang/String;ZIJJJLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/String;ZIIZLjava/util/List;ZZZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 190
    .line 191
    .line 192
    return-object v3
.end method

.method public static d0(Ljava/io/ByteArrayOutputStream;I[B)V
    .locals 2

    .line 1
    shl-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    or-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    int-to-long v0, p1

    .line 6
    invoke-static {p0, v0, v1}, Lig/a;->f0(Ljava/io/ByteArrayOutputStream;J)V

    .line 7
    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    array-length p1, p2

    .line 15
    int-to-long v0, p1

    .line 16
    :goto_0
    invoke-static {p0, v0, v1}, Lig/a;->f0(Ljava/io/ByteArrayOutputStream;J)V

    .line 17
    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    array-length v0, p2

    .line 23
    invoke-virtual {p0, p2, p1, v0}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public static e(Lorg/json/JSONArray;Ljava/lang/String;Lorg/json/JSONArray;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_3

    .line 8
    :cond_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    sub-int/2addr v0, v1

    .line 14
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, "role"

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v3, 0x0

    .line 28
    :goto_0
    invoke-static {v3, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/4 v4, 0x0

    .line 33
    const-string v5, "parts"

    .line 34
    .line 35
    const-string v6, "content"

    .line 36
    .line 37
    if-eqz v3, :cond_4

    .line 38
    .line 39
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    :goto_1
    if-eqz v3, :cond_4

    .line 51
    .line 52
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    :goto_2
    if-lt v4, v0, :cond_3

    .line 57
    .line 58
    :goto_3
    return-void

    .line 59
    :cond_3
    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {v3, p0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 64
    .line 65
    .line 66
    add-int/lit8 v4, v4, 0x1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    const-string v0, "model"

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_5
    const-string v0, "assistant"

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    :goto_4
    move-object v5, v6

    .line 87
    goto :goto_5

    .line 88
    :cond_6
    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-eqz v0, :cond_7

    .line 93
    .line 94
    const-string v3, "type"

    .line 95
    .line 96
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-ne v0, v1, :cond_7

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_7
    :goto_5
    new-instance v0, Lorg/json/JSONObject;

    .line 104
    .line 105
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1, v5, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public static e0(Ljava/io/ByteArrayOutputStream;ILjava/lang/Object;)V
    .locals 5

    .line 1
    instance-of v0, p2, Lorg/json/JSONArray;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p2, Lorg/json/JSONArray;

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-ge v1, v0, :cond_7

    .line 13
    .line 14
    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p0, p1, v0}, Lig/a;->e0(Ljava/io/ByteArrayOutputStream;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    instance-of v0, p2, Lorg/json/JSONObject;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    check-cast p2, Lorg/json/JSONObject;

    .line 29
    .line 30
    invoke-static {p2}, Lig/a;->q(Lorg/json/JSONObject;)[B

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-static {p0, p1, p2}, Lig/a;->d0(Ljava/io/ByteArrayOutputStream;I[B)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    instance-of v0, p2, Ljava/lang/Number;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    shl-int/lit8 p1, p1, 0x3

    .line 43
    .line 44
    int-to-long v0, p1

    .line 45
    invoke-static {p0, v0, v1}, Lig/a;->f0(Ljava/io/ByteArrayOutputStream;J)V

    .line 46
    .line 47
    .line 48
    check-cast p2, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide p1

    .line 54
    invoke-static {p0, p1, p2}, Lig/a;->f0(Ljava/io/ByteArrayOutputStream;J)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 59
    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    shl-int/lit8 p1, p1, 0x3

    .line 63
    .line 64
    int-to-long v0, p1

    .line 65
    invoke-static {p0, v0, v1}, Lig/a;->f0(Ljava/io/ByteArrayOutputStream;J)V

    .line 66
    .line 67
    .line 68
    check-cast p2, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    const-wide/16 p1, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    const-wide/16 p1, 0x0

    .line 80
    .line 81
    :goto_1
    invoke-static {p0, p1, p2}, Lig/a;->f0(Ljava/io/ByteArrayOutputStream;J)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_4
    if-eqz p2, :cond_6

    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    const-string v2, "hex->"

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    const/4 v0, 0x5

    .line 104
    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    const-string v0, "[^0-9A-Fa-f]"

    .line 109
    .line 110
    const-string v2, ""

    .line 111
    .line 112
    invoke-virtual {p2, v0, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    div-int/lit8 v0, v0, 0x2

    .line 121
    .line 122
    new-array v2, v0, [B

    .line 123
    .line 124
    :goto_2
    if-ge v1, v0, :cond_5

    .line 125
    .line 126
    mul-int/lit8 v3, v1, 0x2

    .line 127
    .line 128
    add-int/lit8 v4, v3, 0x2

    .line 129
    .line 130
    invoke-virtual {p2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    const/16 v4, 0x10

    .line 135
    .line 136
    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    int-to-byte v3, v3

    .line 141
    aput-byte v3, v2, v1

    .line 142
    .line 143
    add-int/lit8 v1, v1, 0x1

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_5
    invoke-static {p0, p1, v2}, Lig/a;->d0(Ljava/io/ByteArrayOutputStream;I[B)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_6
    if-eqz p2, :cond_7

    .line 151
    .line 152
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 157
    .line 158
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    invoke-static {p0, p1, p2}, Lig/a;->d0(Ljava/io/ByteArrayOutputStream;I[B)V

    .line 163
    .line 164
    .line 165
    :cond_7
    return-void
.end method

.method public static f(Lud/r;Lgf/a;ZLjava/util/ArrayList;)Lpd/m;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    check-cast v0, Lnc/a;

    .line 7
    .line 8
    iget-object v0, v0, Lnc/a;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lqc/d;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lnc/a;

    .line 18
    .line 19
    iget-object v2, v2, Lnc/a;->h:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ljava/lang/String;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lnc/a;

    .line 29
    .line 30
    iget-object v3, v3, Lnc/a;->h:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Lmc/a;

    .line 33
    .line 34
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    new-instance v5, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iget-object v6, p0, Lud/r;->l:Lud/e;

    .line 44
    .line 45
    iget-object v7, v6, Lud/e;->k:Lud/u;

    .line 46
    .line 47
    invoke-static {v7}, La7/a;->f(Lud/u;)Lqd/m;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    :goto_0
    if-ge v1, v4, :cond_0

    .line 55
    .line 56
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    check-cast v8, Lnc/a;

    .line 61
    .line 62
    :try_start_0
    invoke-static {v7, v8}, La7/a;->o(Lud/u;Lnc/a;)Lqd/l;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catch_0
    move-exception v9

    .line 71
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    const-string v11, "Failed to build arg in invoke-custom insn: "

    .line 76
    .line 77
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    invoke-virtual {p0, v10, v9}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    new-instance v9, Lpd/d;

    .line 85
    .line 86
    invoke-virtual {v8}, Lnc/a;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-direct {v9, v8}, Lpd/d;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v9}, Lqd/l;->Z(Lud/p;)Lqd/m;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    invoke-virtual {v0}, Lqc/d;->b()I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    invoke-static {p0}, Lj8/b;->a(I)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-nez p0, :cond_1

    .line 112
    .line 113
    iget-object p0, v6, Lud/e;->k:Lud/u;

    .line 114
    .line 115
    invoke-virtual {v0}, Lqc/d;->a()Ljf/h;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-static {p0, v1}, Lod/d;->d(Lud/u;Ljf/h;)Lod/d;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v0}, Lqc/d;->b()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    invoke-static {v0}, Lr9/e0;->w(I)I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    new-instance v4, Lpd/n;

    .line 132
    .line 133
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    invoke-direct {v4, v1, v0, v6}, Lpd/n;-><init>(Lod/d;II)V

    .line 138
    .line 139
    .line 140
    new-instance v0, Lae/g;

    .line 141
    .line 142
    const/16 v1, 0x12

    .line 143
    .line 144
    invoke-direct {v0, v4, v1}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 148
    .line 149
    .line 150
    sget-object v0, Lqd/j;->k:Lqd/e;

    .line 151
    .line 152
    invoke-static {p0, v0}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {p0, v0, v2, v3}, Lod/d;->c(Lud/u;Lod/a;Ljava/lang/String;Lmc/a;)Lod/d;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    new-instance v0, Lpd/m;

    .line 161
    .line 162
    invoke-direct {v0, v4, p0, p1, p2}, Lpd/m;-><init>(Lpd/n;Lod/d;Lgf/a;Z)V

    .line 163
    .line 164
    .line 165
    iput-object p3, v0, Lpd/m;->r:Ljava/util/ArrayList;

    .line 166
    .line 167
    return-object v0

    .line 168
    :cond_1
    const-string p0, "Field handle not yet supported"

    .line 169
    .line 170
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    const/4 p0, 0x0

    .line 174
    return-object p0
.end method

.method public static f0(Ljava/io/ByteArrayOutputStream;J)V
    .locals 4

    .line 1
    :goto_0
    const-wide/16 v0, -0x80

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-wide/16 v0, 0x7f

    .line 11
    .line 12
    and-long/2addr v0, p1

    .line 13
    const-wide/16 v2, 0x80

    .line 14
    .line 15
    or-long/2addr v0, v2

    .line 16
    long-to-int v0, v0

    .line 17
    invoke-virtual {p0, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x7

    .line 21
    ushr-long/2addr p1, v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    long-to-int p1, p1

    .line 24
    invoke-virtual {p0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static g(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lp8/y;
    .locals 10

    .line 1
    invoke-static {p0, p2}, Lig/a;->J(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_9

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_6

    .line 11
    .line 12
    :cond_0
    sget-object p0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-class v1, Ljava/lang/String;

    .line 18
    .line 19
    filled-new-array {v1, p0}, [Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {p1, v2}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    if-eqz v5, :cond_9

    .line 28
    .line 29
    new-instance v2, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    move-object v3, p1

    .line 35
    :goto_0
    if-eqz v3, :cond_4

    .line 36
    .line 37
    const-class v4, Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_4

    .line 44
    .line 45
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    new-instance v6, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-eqz v7, :cond_2

    .line 63
    .line 64
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    move-object v8, v7

    .line 69
    check-cast v8, Ljava/lang/reflect/Field;

    .line 70
    .line 71
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-nez v8, :cond_1

    .line 80
    .line 81
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_3

    .line 94
    .line 95
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    check-cast v6, Ljava/lang/reflect/Field;

    .line 100
    .line 101
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    goto :goto_0

    .line 110
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    const/4 v3, 0x0

    .line 115
    move-object v4, v0

    .line 116
    :cond_5
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-eqz v6, :cond_7

    .line 121
    .line 122
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    move-object v7, v6

    .line 127
    check-cast v7, Ljava/lang/reflect/Field;

    .line 128
    .line 129
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    invoke-static {v7, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_5

    .line 138
    .line 139
    if-eqz v3, :cond_6

    .line 140
    .line 141
    :goto_4
    move-object v4, v0

    .line 142
    goto :goto_5

    .line 143
    :cond_6
    const/4 v3, 0x1

    .line 144
    move-object v4, v6

    .line 145
    goto :goto_3

    .line 146
    :cond_7
    if-nez v3, :cond_8

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_8
    :goto_5
    move-object v6, v4

    .line 150
    check-cast v6, Ljava/lang/reflect/Field;

    .line 151
    .line 152
    if-eqz v6, :cond_9

    .line 153
    .line 154
    const-string v2, "m"

    .line 155
    .line 156
    invoke-static {p1, v2, v1}, Lig/a;->P(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    if-eqz v7, :cond_9

    .line 161
    .line 162
    const-string v1, "p"

    .line 163
    .line 164
    invoke-static {p1, v1, p0}, Lig/a;->P(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    if-eqz v8, :cond_9

    .line 169
    .line 170
    sget-object p0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    const-string v1, "t"

    .line 176
    .line 177
    invoke-static {p1, v1, p0}, Lig/a;->P(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    if-eqz v9, :cond_9

    .line 182
    .line 183
    new-instance v3, Lp8/y;

    .line 184
    .line 185
    if-eqz p2, :cond_9

    .line 186
    .line 187
    move-object v4, p2

    .line 188
    invoke-direct/range {v3 .. v9}, Lp8/y;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 189
    .line 190
    .line 191
    return-object v3

    .line 192
    :cond_9
    :goto_6
    return-object v0
.end method

.method public static h(Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 1
    if-eqz p0, :cond_6

    .line 2
    .line 3
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p0, Ljava/lang/String;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    instance-of v0, p0, Lorg/json/JSONArray;

    .line 20
    .line 21
    if-eqz v0, :cond_5

    .line 22
    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    move-object v1, p0

    .line 29
    check-cast v1, Lorg/json/JSONArray;

    .line 30
    .line 31
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/4 p0, 0x0

    .line 36
    :goto_0
    if-lt p0, v2, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_2
    invoke-virtual {v1, p0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    if-eqz v3, :cond_3

    .line 48
    .line 49
    const-string v4, "type"

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    goto :goto_1

    .line 56
    :cond_3
    const/4 v4, 0x0

    .line 57
    :goto_1
    const-string v5, "text"

    .line 58
    .line 59
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    :cond_4
    add-int/lit8 p0, p0, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_6
    :goto_2
    const-string p0, ""

    .line 81
    .line 82
    return-object p0
.end method

.method public static final i(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    invoke-static {p1, p0}, Lac/p;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method public static j(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    :catchall_0
    :cond_0
    return-void
.end method

.method public static final k(Landroid/content/Context;)Lm2/e;
    .locals 4

    .line 1
    new-instance v0, Lm2/e;

    .line 2
    .line 3
    new-instance v1, Ll3/w;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    invoke-direct {v1, v2}, Ll3/w;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v3, 0x1f

    .line 15
    .line 16
    if-lt v2, v3, :cond_0

    .line 17
    .line 18
    sget-object v2, Lm2/l;->a:Lm2/l;

    .line 19
    .line 20
    invoke-virtual {v2, p0}, Lm2/l;->a(Landroid/content/Context;)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    :goto_0
    new-instance v2, Lm2/a;

    .line 27
    .line 28
    invoke-direct {v2, p0}, Lm2/a;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1, v2}, Lm2/e;-><init>(Ll3/w;Lm2/a;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public static l(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    :try_start_0
    invoke-static {v2, v3, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 29
    :catchall_1
    move-exception p1

    .line 30
    invoke-static {v2, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_0
    :goto_0
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 35
    .line 36
    if-lez v2, :cond_7

    .line 37
    .line 38
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 39
    .line 40
    if-gtz v2, :cond_1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    move v2, v1

    .line 44
    :goto_1
    iget v4, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 45
    .line 46
    div-int/2addr v4, v2

    .line 47
    iget v5, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 48
    .line 49
    div-int/2addr v5, v2

    .line 50
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    const/16 v5, 0x200

    .line 55
    .line 56
    if-le v4, v5, :cond_2

    .line 57
    .line 58
    mul-int/lit8 v2, v2, 0x2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-eqz p0, :cond_7

    .line 66
    .line 67
    :try_start_2
    new-instance p1, Landroid/graphics/BitmapFactory$Options;

    .line 68
    .line 69
    invoke-direct {p1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 70
    .line 71
    .line 72
    iput v2, p1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 73
    .line 74
    invoke-static {p0, v3, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 75
    .line 76
    .line 77
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 78
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 79
    .line 80
    .line 81
    if-eqz p1, :cond_7

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    const/16 v0, 0x100

    .line 96
    .line 97
    if-gt p0, v0, :cond_3

    .line 98
    .line 99
    return-object p1

    .line 100
    :cond_3
    const/high16 v0, 0x43800000    # 256.0f

    .line 101
    .line 102
    int-to-float p0, p0

    .line 103
    div-float/2addr v0, p0

    .line 104
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    int-to-float p0, p0

    .line 109
    mul-float/2addr p0, v0

    .line 110
    float-to-int p0, p0

    .line 111
    if-ge p0, v1, :cond_4

    .line 112
    .line 113
    move p0, v1

    .line 114
    :cond_4
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    int-to-float v2, v2

    .line 119
    mul-float/2addr v2, v0

    .line 120
    float-to-int v0, v2

    .line 121
    if-ge v0, v1, :cond_5

    .line 122
    .line 123
    move v0, v1

    .line 124
    :cond_5
    invoke-static {p1, p0, v0, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    if-eq p0, p1, :cond_6

    .line 132
    .line 133
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 134
    .line 135
    .line 136
    :cond_6
    return-object p0

    .line 137
    :catchall_2
    move-exception p1

    .line 138
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 139
    :catchall_3
    move-exception v0

    .line 140
    invoke-static {p0, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    throw v0

    .line 144
    :cond_7
    :goto_2
    return-object v3
.end method

.method public static m(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_3

    .line 5
    .line 6
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p1, v1

    .line 15
    :goto_0
    if-eqz p1, :cond_3

    .line 16
    .line 17
    new-instance v0, Ljava/io/File;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    new-instance p1, Ljava/io/File;

    .line 23
    .line 24
    invoke-static {p0}, Lub/b;->d(Landroid/content/Context;)Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string v2, "FloatingShortcut/icons"

    .line 29
    .line 30
    invoke-direct {p1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    new-instance p1, Lsf/f;

    .line 40
    .line 41
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    move-object p0, p1

    .line 45
    :goto_1
    nop

    .line 46
    instance-of p1, p0, Lsf/f;

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    move-object p0, v1

    .line 51
    :cond_1
    check-cast p0, Ljava/io/File;

    .line 52
    .line 53
    if-eqz p0, :cond_3

    .line 54
    .line 55
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 56
    .line 57
    .line 58
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    goto :goto_2

    .line 60
    :catchall_1
    move-exception p1

    .line 61
    new-instance v0, Lsf/f;

    .line 62
    .line 63
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    move-object p1, v0

    .line 67
    :goto_2
    nop

    .line 68
    instance-of v0, p1, Lsf/f;

    .line 69
    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_2
    move-object v1, p1

    .line 74
    :goto_3
    check-cast v1, Ljava/io/File;

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-eqz p0, :cond_3

    .line 87
    .line 88
    :try_start_2
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 89
    .line 90
    .line 91
    :catchall_2
    :cond_3
    return-void
.end method

.method public static n(Ljava/io/File;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lig/a;->o(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    :catchall_0
    :cond_0
    return-void
.end method

.method public static o(Ljava/io/File;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    array-length v1, v0

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    aget-object v3, v0, v2

    .line 18
    .line 19
    invoke-static {v3}, Lig/a;->o(Ljava/io/File;)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/a;)Lhh/q;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljh/o;

    .line 5
    .line 6
    invoke-direct {v0}, Lg6/c;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    invoke-virtual {p1, v1}, Lg6/c;->b(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget v2, p1, Lg6/c;->a:I

    .line 17
    .line 18
    add-int/2addr v1, v2

    .line 19
    invoke-virtual {p1, v1}, Lg6/c;->a(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v2, p1, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {p0, v0}, Lfb/v0;->r(Lorg/luckypray/dexkit/DexKitBridge;Ljh/o;)Lhh/l;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const/4 v0, 0x6

    .line 41
    invoke-virtual {p1, v0}, Lg6/c;->b(I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const/4 v2, 0x0

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    iget-object v3, p1, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    iget v4, p1, Lg6/c;->a:I

    .line 51
    .line 52
    add-int/2addr v1, v4

    .line 53
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move v1, v2

    .line 59
    :goto_1
    const/4 v3, 0x1

    .line 60
    if-ne v1, v3, :cond_2

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    const/4 v3, 0x2

    .line 64
    if-ne v1, v3, :cond_3

    .line 65
    .line 66
    :goto_2
    new-instance p1, Lhh/q;

    .line 67
    .line 68
    invoke-direct {p1, p0, v3}, Lhh/q;-><init>(Lhh/l;I)V

    .line 69
    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Lg6/c;->b(I)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    iget-object v1, p1, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    iget p1, p1, Lg6/c;->a:I

    .line 83
    .line 84
    add-int/2addr v0, p1

    .line 85
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    :cond_4
    const-string p1, "Unknown using type: "

    .line 90
    .line 91
    invoke-static {v2, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p0
.end method

.method public static q(Lorg/json/JSONObject;)[B
    .locals 5

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-array p0, v2, [B

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-ge v2, v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v0, v4, v3}, Lig/a;->e0(Ljava/io/ByteArrayOutputStream;ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public static r(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 6

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const-string p0, "message"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const-string p0, "Gemini \u8bf7\u6c42\u5931\u8d25"

    .line 22
    .line 23
    :cond_0
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    const/4 p0, 0x0

    .line 27
    return-object p0

    .line 28
    :cond_1
    const-string v0, "promptFeedback"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, ""

    .line 35
    .line 36
    const-string v2, " - "

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    if-eqz v0, :cond_5

    .line 40
    .line 41
    const-string v4, "blockReason"

    .line 42
    .line 43
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-nez v5, :cond_5

    .line 55
    .line 56
    const-string p0, "blockReasonMessage"

    .line 57
    .line 58
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move-object p0, v3

    .line 73
    :goto_1
    if-eqz p0, :cond_3

    .line 74
    .line 75
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    :cond_3
    if-nez v3, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    move-object v1, v3

    .line 83
    :goto_2
    const-string p0, "Gemini \u5df2\u62e6\u622a\u8bf7\u6c42: "

    .line 84
    .line 85
    invoke-static {p0, v4, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    const-string v0, "candidates"

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-eqz p0, :cond_a

    .line 100
    .line 101
    const/4 v0, 0x0

    .line 102
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    if-eqz p0, :cond_a

    .line 107
    .line 108
    const-string v0, "finishReason"

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-nez v4, :cond_9

    .line 122
    .line 123
    const-string v4, "STOP"

    .line 124
    .line 125
    const-string v5, "MAX_TOKENS"

    .line 126
    .line 127
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-static {v4}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-interface {v4, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-nez v4, :cond_9

    .line 140
    .line 141
    const-string v4, "finishMessage"

    .line 142
    .line 143
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-nez v4, :cond_6

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_6
    move-object p0, v3

    .line 158
    :goto_3
    if-eqz p0, :cond_7

    .line 159
    .line 160
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    :cond_7
    if-nez v3, :cond_8

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_8
    move-object v1, v3

    .line 168
    :goto_4
    const-string p0, "Gemini \u751f\u6210\u5931\u8d25: "

    .line 169
    .line 170
    invoke-static {p0, v0, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_9
    return-object p0

    .line 180
    :cond_a
    return-object v3
.end method

.method public static s(Lh4/u;)Lt4/b;
    .locals 12

    .line 1
    const-string v0, "RuntimeVisibleAnnotations"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lh4/u;->o(Ljava/lang/String;)Lh4/s;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lh4/m;

    .line 8
    .line 9
    const-string v1, "RuntimeInvisibleAnnotations"

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lh4/u;->o(Ljava/lang/String;)Lh4/s;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lh4/k;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    sget-object v0, Lt4/b;->i:Lt4/b;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, v1, Lh4/r;->d:Lz4/j;

    .line 26
    .line 27
    check-cast v0, Lt4/b;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v0, v0, Lh4/r;->d:Lz4/j;

    .line 31
    .line 32
    check-cast v0, Lt4/b;

    .line 33
    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    iget-object v1, v1, Lh4/r;->d:Lz4/j;

    .line 38
    .line 39
    check-cast v1, Lt4/b;

    .line 40
    .line 41
    new-instance v3, Lt4/b;

    .line 42
    .line 43
    invoke-direct {v3}, Lt4/b;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v0}, Lt4/b;->m(Lt4/b;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v1}, Lt4/b;->m(Lt4/b;)V

    .line 50
    .line 51
    .line 52
    iput-boolean v2, v3, Lz4/j;->g:Z

    .line 53
    .line 54
    move-object v0, v3

    .line 55
    :goto_0
    const-string v1, "Signature"

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Lh4/u;->o(Ljava/lang/String;)Lh4/s;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lh4/o;

    .line 62
    .line 63
    const/4 v3, 0x3

    .line 64
    const/4 v4, 0x0

    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    move-object v5, v4

    .line 68
    goto/16 :goto_6

    .line 69
    .line 70
    :cond_3
    iget-object v1, v1, Lh4/o;->b:Lv4/c0;

    .line 71
    .line 72
    new-instance v5, Lt4/a;

    .line 73
    .line 74
    sget-object v6, Lr4/d;->f:Lv4/d0;

    .line 75
    .line 76
    invoke-direct {v5, v6, v3}, Lt4/a;-><init>(Lv4/d0;I)V

    .line 77
    .line 78
    .line 79
    iget-object v1, v1, Lv4/c0;->g:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    new-instance v7, Ljava/util/ArrayList;

    .line 86
    .line 87
    const/16 v8, 0x14

    .line 88
    .line 89
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 90
    .line 91
    .line 92
    move v8, v2

    .line 93
    :goto_1
    if-ge v8, v6, :cond_9

    .line 94
    .line 95
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    add-int/lit8 v10, v8, 0x1

    .line 100
    .line 101
    const/16 v11, 0x4c

    .line 102
    .line 103
    if-ne v9, v11, :cond_6

    .line 104
    .line 105
    :goto_2
    if-ge v10, v6, :cond_8

    .line 106
    .line 107
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    const/16 v11, 0x3b

    .line 112
    .line 113
    if-ne v9, v11, :cond_4

    .line 114
    .line 115
    add-int/lit8 v10, v10, 0x1

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_4
    const/16 v11, 0x3c

    .line 119
    .line 120
    if-ne v9, v11, :cond_5

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_6
    :goto_3
    if-ge v10, v6, :cond_8

    .line 127
    .line 128
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    if-ne v9, v11, :cond_7

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_7
    add-int/lit8 v10, v10, 0x1

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_8
    :goto_4
    invoke-virtual {v1, v8, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move v8, v10

    .line 146
    goto :goto_1

    .line 147
    :cond_9
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    new-instance v6, Lv4/c;

    .line 152
    .line 153
    invoke-direct {v6, v1}, Lz4/e;-><init>(I)V

    .line 154
    .line 155
    .line 156
    move v8, v2

    .line 157
    :goto_5
    if-ge v8, v1, :cond_a

    .line 158
    .line 159
    new-instance v9, Lv4/c0;

    .line 160
    .line 161
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    check-cast v10, Ljava/lang/String;

    .line 166
    .line 167
    invoke-direct {v9, v10}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6, v8, v9}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    add-int/lit8 v8, v8, 0x1

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_a
    iput-boolean v2, v6, Lz4/j;->g:Z

    .line 177
    .line 178
    new-instance v1, Lt4/d;

    .line 179
    .line 180
    sget-object v7, Lr4/d;->k:Lv4/c0;

    .line 181
    .line 182
    new-instance v8, Lv4/d;

    .line 183
    .line 184
    invoke-direct {v8, v6}, Lv4/d;-><init>(Lv4/c;)V

    .line 185
    .line 186
    .line 187
    invoke-direct {v1, v7, v8}, Lt4/d;-><init>(Lv4/c0;Lv4/a;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v5, v1}, Lt4/a;->n(Lt4/d;)V

    .line 191
    .line 192
    .line 193
    iput-boolean v2, v5, Lz4/j;->g:Z

    .line 194
    .line 195
    :goto_6
    const-string v1, "SourceDebugExtension"

    .line 196
    .line 197
    invoke-virtual {p0, v1}, Lh4/u;->o(Ljava/lang/String;)Lh4/s;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, Lh4/p;

    .line 202
    .line 203
    if-nez p0, :cond_b

    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_b
    iget-object p0, p0, Lh4/p;->b:Lv4/c0;

    .line 207
    .line 208
    new-instance v4, Lt4/a;

    .line 209
    .line 210
    sget-object v1, Lr4/d;->g:Lv4/d0;

    .line 211
    .line 212
    invoke-direct {v4, v1, v3}, Lt4/a;-><init>(Lv4/d0;I)V

    .line 213
    .line 214
    .line 215
    new-instance v1, Lt4/d;

    .line 216
    .line 217
    sget-object v3, Lr4/d;->k:Lv4/c0;

    .line 218
    .line 219
    invoke-direct {v1, v3, p0}, Lt4/d;-><init>(Lv4/c0;Lv4/a;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v4, v1}, Lt4/a;->n(Lt4/d;)V

    .line 223
    .line 224
    .line 225
    iput-boolean v2, v4, Lz4/j;->g:Z

    .line 226
    .line 227
    :goto_7
    if-eqz v5, :cond_c

    .line 228
    .line 229
    invoke-static {v0, v5}, Lt4/b;->n(Lt4/b;Lt4/a;)Lt4/b;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    :cond_c
    if-eqz v4, :cond_d

    .line 234
    .line 235
    invoke-static {v0, v4}, Lt4/b;->n(Lt4/b;Lt4/a;)Lt4/b;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    return-object p0

    .line 240
    :cond_d
    return-object v0
.end method

.method public static t(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_6

    .line 3
    .line 4
    const-class v1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_6

    .line 11
    .line 12
    invoke-virtual {p3, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto :goto_3

    .line 19
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    array-length v2, v1

    .line 27
    const/4 v3, 0x0

    .line 28
    :goto_0
    if-lt v3, v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-static {p0, p1, p2, p3}, Lig/a;->t(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_1
    aget-object v4, v1, v3

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    :try_start_0
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-nez v5, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-static {p0, v0, v5}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    if-eqz v5, :cond_3

    .line 60
    .line 61
    invoke-virtual {p1, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    if-eqz v6, :cond_3

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :catchall_0
    :cond_3
    :goto_1
    move-object v5, v0

    .line 69
    :goto_2
    if-eqz v5, :cond_4

    .line 70
    .line 71
    return-object v5

    .line 72
    :cond_4
    invoke-static {p0, p1, v4, p3}, Lig/a;->t(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    if-eqz v4, :cond_5

    .line 77
    .line 78
    return-object v4

    .line 79
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_6
    :goto_3
    return-object v0
.end method

.method public static u(Ljava/io/File;)[B
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const/16 v2, 0x20

    .line 14
    .line 15
    shr-long v2, v0, v2

    .line 16
    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    cmp-long v2, v2, v4

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    long-to-int v0, v0

    .line 24
    new-array v1, v0, [B

    .line 25
    .line 26
    invoke-static {p0, v1, v0}, Lig/a;->U(Ljava/io/File;[BI)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_1
    const-string v0, "file too large, path:"

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0, v0}, Lj8/o;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method public static v(Lgf/a;)Lqc/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lgf/a;->d:Lgf/c;

    .line 2
    .line 3
    iget v0, v0, Lgf/c;->d:I

    .line 4
    .line 5
    const/4 v1, 0x6

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, Lgf/a;->n:Lsc/a;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    check-cast v0, Lqc/a;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    iget-object v0, p0, Lgf/a;->b:Lac/k;

    .line 18
    .line 19
    iget v1, p0, Lgf/a;->m:I

    .line 20
    .line 21
    iget-object p0, p0, Lgf/a;->c:Lac/k;

    .line 22
    .line 23
    iget-object v2, v0, Lac/k;->j:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Lff/e;

    .line 26
    .line 27
    iget-object v2, v2, Lff/e;->d:Ljf/e;

    .line 28
    .line 29
    iget v2, v2, Ljf/e;->h:I

    .line 30
    .line 31
    mul-int/lit8 v1, v1, 0x4

    .line 32
    .line 33
    add-int/2addr v1, v2

    .line 34
    invoke-virtual {v0, v1}, Lac/k;->a(I)V

    .line 35
    .line 36
    .line 37
    iget-object v1, v0, Lac/k;->i:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {v0, v1}, Lac/k;->a(I)V

    .line 46
    .line 47
    .line 48
    new-instance v1, Lqc/a;

    .line 49
    .line 50
    invoke-static {v0, p0}, La7/a;->H(Lac/k;Lac/k;)Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {v1, p0}, Lqc/a;-><init>(Ljava/util/ArrayList;)V

    .line 55
    .line 56
    .line 57
    return-object v1
.end method

.method public static w(Ll4/b;)Lt4/b;
    .locals 4

    .line 1
    invoke-interface {p0}, Ll4/a;->getAttributes()Lh4/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lig/a;->s(Lh4/u;)Lt4/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p0}, Ll4/a;->getAttributes()Lh4/u;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v1, "Exceptions"

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lh4/u;->o(Ljava/lang/String;)Lh4/s;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lh4/g;

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    sget-object p0, Lw4/b;->i:Lw4/b;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object p0, p0, Lh4/g;->b:Lw4/e;

    .line 27
    .line 28
    :goto_0
    invoke-interface {p0}, Lw4/e;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-static {p0}, Lr4/d;->a(Lw4/e;)Lv4/d;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    new-instance v1, Lt4/a;

    .line 39
    .line 40
    sget-object v2, Lr4/d;->h:Lv4/d0;

    .line 41
    .line 42
    const/4 v3, 0x3

    .line 43
    invoke-direct {v1, v2, v3}, Lt4/a;-><init>(Lv4/d0;I)V

    .line 44
    .line 45
    .line 46
    new-instance v2, Lt4/d;

    .line 47
    .line 48
    sget-object v3, Lr4/d;->k:Lv4/c0;

    .line 49
    .line 50
    invoke-direct {v2, v3, p0}, Lt4/d;-><init>(Lv4/c0;Lv4/a;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Lt4/a;->n(Lt4/d;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    iput-boolean p0, v1, Lz4/j;->g:Z

    .line 58
    .line 59
    invoke-static {v0, v1}, Lt4/b;->n(Lt4/b;Lt4/a;)Lt4/b;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :cond_1
    return-object v0
.end method

.method public static x(Lgf/a;)Ljf/h;
    .locals 4

    .line 1
    iget-object v0, p0, Lgf/a;->d:Lgf/c;

    .line 2
    .line 3
    iget v0, v0, Lgf/c;->d:I

    .line 4
    .line 5
    const/4 v1, 0x5

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p0, Lgf/a;->n:Lsc/a;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    check-cast v0, Ljf/h;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    iget-object v0, p0, Lgf/a;->b:Lac/k;

    .line 18
    .line 19
    iget p0, p0, Lgf/a;->m:I

    .line 20
    .line 21
    new-instance v1, Ljf/h;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v2, v0, Lac/k;->j:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lff/e;

    .line 29
    .line 30
    iget v2, v2, Lff/e;->a:I

    .line 31
    .line 32
    const v3, 0xffff

    .line 33
    .line 34
    .line 35
    and-int/2addr v2, v3

    .line 36
    shl-int/lit8 v2, v2, 0x10

    .line 37
    .line 38
    and-int/2addr v3, p0

    .line 39
    or-int/2addr v2, v3

    .line 40
    iput v2, v1, Ljf/h;->a:I

    .line 41
    .line 42
    iput p0, v1, Ljf/h;->f:I

    .line 43
    .line 44
    iput-object v0, v1, Ljf/h;->g:Lac/k;

    .line 45
    .line 46
    return-object v1
.end method

.method public static y(Ll4/b;)Lt4/c;
    .locals 8

    .line 1
    invoke-interface {p0}, Ll4/a;->getAttributes()Lh4/u;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "RuntimeVisibleParameterAnnotations"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lh4/u;->o(Ljava/lang/String;)Lh4/s;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lh4/n;

    .line 12
    .line 13
    const-string v1, "RuntimeInvisibleParameterAnnotations"

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lh4/u;->o(Ljava/lang/String;)Lh4/s;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lh4/l;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    sget-object p0, Lt4/c;->i:Lt4/c;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    iget-object p0, p0, Lh4/r;->d:Lz4/j;

    .line 29
    .line 30
    check-cast p0, Lt4/c;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_1
    iget-object v0, v0, Lh4/r;->d:Lz4/j;

    .line 34
    .line 35
    check-cast v0, Lt4/c;

    .line 36
    .line 37
    if-nez p0, :cond_2

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_2
    iget-object p0, p0, Lh4/r;->d:Lz4/j;

    .line 41
    .line 42
    check-cast p0, Lt4/c;

    .line 43
    .line 44
    sget-object v1, Lt4/c;->i:Lt4/c;

    .line 45
    .line 46
    iget-object v1, v0, Lz4/e;->h:[Ljava/lang/Object;

    .line 47
    .line 48
    array-length v1, v1

    .line 49
    iget-object v2, p0, Lz4/e;->h:[Ljava/lang/Object;

    .line 50
    .line 51
    array-length v2, v2

    .line 52
    if-ne v1, v2, :cond_4

    .line 53
    .line 54
    new-instance v2, Lt4/c;

    .line 55
    .line 56
    invoke-direct {v2, v1}, Lz4/e;-><init>(I)V

    .line 57
    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    move v4, v3

    .line 61
    :goto_0
    if-ge v4, v1, :cond_3

    .line 62
    .line 63
    invoke-virtual {v0, v4}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Lt4/b;

    .line 68
    .line 69
    invoke-virtual {p0, v4}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    check-cast v6, Lt4/b;

    .line 74
    .line 75
    new-instance v7, Lt4/b;

    .line 76
    .line 77
    invoke-direct {v7}, Lt4/b;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v7, v5}, Lt4/b;->m(Lt4/b;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7, v6}, Lt4/b;->m(Lt4/b;)V

    .line 84
    .line 85
    .line 86
    iput-boolean v3, v7, Lz4/j;->g:Z

    .line 87
    .line 88
    invoke-virtual {v7}, Lz4/j;->k()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v4, v7}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    add-int/lit8 v4, v4, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    iput-boolean v3, v2, Lz4/j;->g:Z

    .line 98
    .line 99
    return-object v2

    .line 100
    :cond_4
    const-string p0, "list1.size() != list2.size()"

    .line 101
    .line 102
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const/4 p0, 0x0

    .line 106
    return-object p0
.end method

.method public static final z(Ln2/s;)Li2/g;
    .locals 3

    .line 1
    iget-object v0, p0, Ln2/s;->a:Li2/g;

    .line 2
    .line 3
    iget-wide v1, p0, Ln2/s;->b:J

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Li2/m0;->f(J)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-static {v1, v2}, Li2/m0;->e(J)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, p0, v1}, Li2/g;->b(II)Li2/g;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

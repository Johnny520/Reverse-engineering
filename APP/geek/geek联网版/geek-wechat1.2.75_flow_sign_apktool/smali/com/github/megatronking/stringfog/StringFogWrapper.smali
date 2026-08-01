.class public final Lcom/github/megatronking/stringfog/StringFogWrapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/github/megatronking/stringfog/IStringFog;


# instance fields
.field private final mStringFogImpl:Lcom/github/megatronking/stringfog/IStringFog;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/github/megatronking/stringfog/IStringFog;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/github/megatronking/stringfog/StringFogWrapper;->mStringFogImpl:Lcom/github/megatronking/stringfog/IStringFog;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    return-void

    .line 22
    :catch_0
    move-exception p1

    .line 23
    goto :goto_0

    .line 24
    :catch_1
    move-exception p1

    .line 25
    goto :goto_0

    .line 26
    :catch_2
    move-exception p1

    .line 27
    goto :goto_0

    .line 28
    :catch_3
    move-exception p1

    .line 29
    goto :goto_1

    .line 30
    :goto_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string v1, "Stringfog implementation class create instance failed: "

    .line 37
    .line 38
    invoke-static {v1, p1}, Lg40;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :goto_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const-string v1, "Stringfog implementation class new instance failed: "

    .line 53
    .line 54
    invoke-static {v1, p1}, Lg40;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :catch_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 63
    .line 64
    const-string v1, "Stringfog implementation class not found: "

    .line 65
    .line 66
    invoke-static {v1, p1}, Lg40;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0
.end method


# virtual methods
.method public decrypt([B[B)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/megatronking/stringfog/StringFogWrapper;->mStringFogImpl:Lcom/github/megatronking/stringfog/IStringFog;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance p2, Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p2, p1}, Ljava/lang/String;-><init>([B)V

    .line 8
    .line 9
    .line 10
    return-object p2

    .line 11
    :cond_0
    invoke-interface {v0, p1, p2}, Lcom/github/megatronking/stringfog/IStringFog;->decrypt([B[B)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public encrypt(Ljava/lang/String;[B)[B
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/megatronking/stringfog/StringFogWrapper;->mStringFogImpl:Lcom/github/megatronking/stringfog/IStringFog;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-interface {v0, p1, p2}, Lcom/github/megatronking/stringfog/IStringFog;->encrypt(Ljava/lang/String;[B)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public shouldFog(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/megatronking/stringfog/StringFogWrapper;->mStringFogImpl:Lcom/github/megatronking/stringfog/IStringFog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/github/megatronking/stringfog/IStringFog;->shouldFog(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

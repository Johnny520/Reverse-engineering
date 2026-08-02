.class public final Lv20;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final c:Ljava/util/Set;


# instance fields
.field public final a:Lbf2;

.field public final b:Ljava/security/SecureRandom;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x18

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0x20

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    filled-new-array {v0, v1, v2}, [Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lv20;->c:Ljava/util/Set;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Lbf2;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/security/SecureRandom;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lv20;->a:Lbf2;

    .line 13
    .line 14
    iput-object v0, p0, Lv20;->b:Ljava/security/SecureRandom;

    .line 15
    .line 16
    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    sparse-switch v0, :sswitch_data_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :sswitch_0
    const-string v0, "SHA-1"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    return-object v0

    .line 27
    :sswitch_1
    const-string v0, "MD5"

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    return-object v0

    .line 36
    :sswitch_2
    const-string v0, "SHA-512"

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    return-object v0

    .line 45
    :sswitch_3
    const-string v0, "SHA-384"

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_0

    .line 52
    .line 53
    return-object v0

    .line 54
    :sswitch_4
    const-string v0, "SHA-256"

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_0

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_0
    :goto_0
    const/4 v5, 0x0

    .line 64
    const/16 v6, 0x1c

    .line 65
    .line 66
    const-string v1, "INVALID_ARGUMENT"

    .line 67
    .line 68
    const-string v2, "Unsupported digest algorithm."

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-static/range {v1 .. v6}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    return-object p0

    .line 77
    :sswitch_data_0
    .sparse-switch
        -0x5ad4ae6e -> :sswitch_4
        -0x5ad4aa52 -> :sswitch_3
        -0x5ad4a3ab -> :sswitch_2
        0x1297e -> :sswitch_1
        0x4b35330 -> :sswitch_0
    .end sparse-switch
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lv20;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sparse-switch v0, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :sswitch_0
    const-string v0, "SHA-1"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const-string p0, "HmacSHA1"

    .line 22
    .line 23
    return-object p0

    .line 24
    :sswitch_1
    const-string v0, "MD5"

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    const-string p0, "HmacMD5"

    .line 33
    .line 34
    return-object p0

    .line 35
    :sswitch_2
    const-string v0, "SHA-512"

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    const-string p0, "HmacSHA512"

    .line 44
    .line 45
    return-object p0

    .line 46
    :sswitch_3
    const-string v0, "SHA-384"

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_0

    .line 53
    .line 54
    const-string p0, "HmacSHA384"

    .line 55
    .line 56
    return-object p0

    .line 57
    :sswitch_4
    const-string v0, "SHA-256"

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_0

    .line 64
    .line 65
    const-string p0, "HmacSHA256"

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_0
    :goto_0
    const-string p0, "Unreachable digest algorithm."

    .line 69
    .line 70
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 p0, 0x0

    .line 74
    return-object p0

    .line 75
    :sswitch_data_0
    .sparse-switch
        -0x5ad4ae6e -> :sswitch_4
        -0x5ad4aa52 -> :sswitch_3
        -0x5ad4a3ab -> :sswitch_2
        0x1297e -> :sswitch_1
        0x4b35330 -> :sswitch_0
    .end sparse-switch
.end method

.method public static i(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const v3, -0x5ad4ae6e

    .line 15
    .line 16
    .line 17
    if-eq v2, v3, :cond_1

    .line 18
    .line 19
    const v3, -0x5ad4aa52

    .line 20
    .line 21
    .line 22
    if-eq v2, v3, :cond_0

    .line 23
    .line 24
    const v3, -0x5ad4a3ab

    .line 25
    .line 26
    .line 27
    if-ne v2, v3, :cond_2

    .line 28
    .line 29
    const-string v2, "SHA-512"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string v2, "SHA-384"

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const-string v2, "SHA-256"

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    :goto_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_2
    const/4 v4, 0x0

    .line 64
    const/16 v5, 0x1c

    .line 65
    .line 66
    const-string v0, "INVALID_ARGUMENT"

    .line 67
    .line 68
    const-string v1, "Unsupported KDF hash algorithm."

    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-static/range {v0 .. v5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    return-object p0
.end method


# virtual methods
.method public final a(I[B[B[B[B)[B
    .locals 8

    .line 1
    array-length v0, p2

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sget-object v1, Lv20;->c:Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    array-length v0, p3

    .line 16
    const/16 v2, 0xc

    .line 17
    .line 18
    if-ne v0, v2, :cond_2

    .line 19
    .line 20
    array-length v0, p2

    .line 21
    int-to-long v0, v0

    .line 22
    array-length v2, p3

    .line 23
    int-to-long v2, v2

    .line 24
    add-long/2addr v0, v2

    .line 25
    array-length v2, p4

    .line 26
    int-to-long v2, v2

    .line 27
    add-long/2addr v0, v2

    .line 28
    if-eqz p5, :cond_0

    .line 29
    .line 30
    array-length v2, p5

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v2, 0x0

    .line 33
    :goto_0
    int-to-long v2, v2

    .line 34
    add-long/2addr v0, v2

    .line 35
    invoke-virtual {p0, v0, v1}, Lv20;->h(J)V

    .line 36
    .line 37
    .line 38
    const-string p0, "AES/GCM/NoPadding"

    .line 39
    .line 40
    invoke-static {p0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    .line 45
    .line 46
    const-string v1, "AES"

    .line 47
    .line 48
    invoke-direct {v0, p2, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance p2, Ljavax/crypto/spec/GCMParameterSpec;

    .line 52
    .line 53
    const/16 v1, 0x80

    .line 54
    .line 55
    invoke-direct {p2, v1, p3}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1, v0, p2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 59
    .line 60
    .line 61
    if-eqz p5, :cond_1

    .line 62
    .line 63
    invoke-virtual {p0, p5}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-virtual {p0, p4}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_2
    const/4 v6, 0x0

    .line 75
    const/16 v7, 0x1c

    .line 76
    .line 77
    const-string v2, "INVALID_ARGUMENT"

    .line 78
    .line 79
    const-string v3, "AES-GCM IV must be 12 bytes."

    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    const/4 v5, 0x0

    .line 83
    invoke-static/range {v2 .. v7}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 84
    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_3
    const/4 p4, 0x0

    .line 88
    const/16 p5, 0x1c

    .line 89
    .line 90
    const-string p0, "INVALID_ARGUMENT"

    .line 91
    .line 92
    const-string p1, "AES key must be 16, 24, or 32 bytes."

    .line 93
    .line 94
    const/4 p2, 0x0

    .line 95
    const/4 p3, 0x0

    .line 96
    invoke-static/range {p0 .. p5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 97
    .line 98
    .line 99
    return-object v1
.end method

.method public final c([B[B[BILjava/lang/String;)[B
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    if-gt v6, v4, :cond_6

    .line 14
    .line 15
    iget-object v7, v0, Lv20;->a:Lbf2;

    .line 16
    .line 17
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/high16 v7, 0x1000000

    .line 21
    .line 22
    if-gt v4, v7, :cond_6

    .line 23
    .line 24
    array-length v7, v1

    .line 25
    int-to-long v7, v7

    .line 26
    const/4 v9, 0x0

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    array-length v10, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v10, v9

    .line 32
    :goto_0
    int-to-long v10, v10

    .line 33
    add-long/2addr v7, v10

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    array-length v10, v3

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v10, v9

    .line 39
    :goto_1
    int-to-long v10, v10

    .line 40
    add-long/2addr v7, v10

    .line 41
    invoke-virtual {v0, v7, v8}, Lv20;->h(J)V

    .line 42
    .line 43
    .line 44
    invoke-static/range {p5 .. p5}, Lv20;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Lv20;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    if-nez v2, :cond_2

    .line 57
    .line 58
    invoke-virtual {v7}, Ljavax/crypto/Mac;->getMacLength()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    new-array v2, v2, [B

    .line 63
    .line 64
    :cond_2
    new-instance v8, Ljavax/crypto/spec/SecretKeySpec;

    .line 65
    .line 66
    invoke-direct {v8, v2, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v7, v8}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7, v1}, Ljavax/crypto/Mac;->doFinal([B)[B

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    array-length v2, v1

    .line 77
    mul-int/lit16 v2, v2, 0xff

    .line 78
    .line 79
    if-gt v4, v2, :cond_5

    .line 80
    .line 81
    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    new-instance v5, Ljavax/crypto/spec/SecretKeySpec;

    .line 86
    .line 87
    invoke-direct {v5, v1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v5}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 91
    .line 92
    .line 93
    new-array v11, v4, [B

    .line 94
    .line 95
    new-array v0, v9, [B

    .line 96
    .line 97
    move v1, v6

    .line 98
    move v12, v9

    .line 99
    :goto_2
    if-ge v12, v4, :cond_4

    .line 100
    .line 101
    invoke-virtual {v2}, Ljavax/crypto/Mac;->reset()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v0}, Ljavax/crypto/Mac;->update([B)V

    .line 105
    .line 106
    .line 107
    if-eqz v3, :cond_3

    .line 108
    .line 109
    invoke-virtual {v2, v3}, Ljavax/crypto/Mac;->update([B)V

    .line 110
    .line 111
    .line 112
    :cond_3
    int-to-byte v0, v1

    .line 113
    invoke-virtual {v2, v0}, Ljavax/crypto/Mac;->update(B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Ljavax/crypto/Mac;->doFinal()[B

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    array-length v0, v10

    .line 124
    sub-int v5, v4, v12

    .line 125
    .line 126
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    .line 127
    .line 128
    .line 129
    move-result v14

    .line 130
    const/4 v13, 0x0

    .line 131
    const/4 v15, 0x4

    .line 132
    invoke-static/range {v10 .. v15}, Lmg;->d0([B[BIIII)V

    .line 133
    .line 134
    .line 135
    add-int/2addr v12, v14

    .line 136
    add-int/2addr v1, v6

    .line 137
    move-object v0, v10

    .line 138
    goto :goto_2

    .line 139
    :cond_4
    return-object v11

    .line 140
    :cond_5
    const/4 v0, 0x0

    .line 141
    const/16 v1, 0x1c

    .line 142
    .line 143
    const-string v2, "INVALID_ARGUMENT"

    .line 144
    .line 145
    const-string v3, "HKDF output is too long."

    .line 146
    .line 147
    const/4 v4, 0x0

    .line 148
    const/4 v6, 0x0

    .line 149
    move-object/from16 p4, v0

    .line 150
    .line 151
    move/from16 p5, v1

    .line 152
    .line 153
    move-object/from16 p0, v2

    .line 154
    .line 155
    move-object/from16 p1, v3

    .line 156
    .line 157
    move/from16 p2, v4

    .line 158
    .line 159
    move-object/from16 p3, v6

    .line 160
    .line 161
    invoke-static/range {p0 .. p5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 162
    .line 163
    .line 164
    return-object v5

    .line 165
    :cond_6
    const/4 v0, 0x0

    .line 166
    const/16 v1, 0x1c

    .line 167
    .line 168
    const-string v2, "INVALID_ARGUMENT"

    .line 169
    .line 170
    const-string v3, "Derived output length is invalid."

    .line 171
    .line 172
    const/4 v4, 0x0

    .line 173
    const/4 v6, 0x0

    .line 174
    move-object/from16 p4, v0

    .line 175
    .line 176
    move/from16 p5, v1

    .line 177
    .line 178
    move-object/from16 p0, v2

    .line 179
    .line 180
    move-object/from16 p1, v3

    .line 181
    .line 182
    move/from16 p2, v4

    .line 183
    .line 184
    move-object/from16 p3, v6

    .line 185
    .line 186
    invoke-static/range {p0 .. p5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 187
    .line 188
    .line 189
    return-object v5
.end method

.method public final d(Ljava/lang/String;[B[B)[B
    .locals 6

    .line 1
    array-length v0, p2

    .line 2
    if-eqz v0, :cond_0

    .line 3
    .line 4
    array-length v0, p2

    .line 5
    int-to-long v0, v0

    .line 6
    array-length v2, p3

    .line 7
    int-to-long v2, v2

    .line 8
    add-long/2addr v0, v2

    .line 9
    invoke-virtual {p0, v0, v1}, Lv20;->h(J)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lv20;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    .line 21
    .line 22
    invoke-direct {v0, p2, p0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p3}, Ljavax/crypto/Mac;->doFinal([B)[B

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    const/4 v4, 0x0

    .line 37
    const/16 v5, 0x1c

    .line 38
    .line 39
    const-string v0, "INVALID_ARGUMENT"

    .line 40
    .line 41
    const-string v1, "HMAC key must not be empty."

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-static/range {v0 .. v5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0
.end method

.method public final f([B[BIILjava/lang/String;)[B
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    if-gt v6, v3, :cond_4

    .line 14
    .line 15
    const v7, 0x989681

    .line 16
    .line 17
    .line 18
    if-ge v3, v7, :cond_4

    .line 19
    .line 20
    if-gt v6, v4, :cond_3

    .line 21
    .line 22
    iget-object v7, v0, Lv20;->a:Lbf2;

    .line 23
    .line 24
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const/high16 v7, 0x1000000

    .line 28
    .line 29
    if-gt v4, v7, :cond_3

    .line 30
    .line 31
    array-length v5, v1

    .line 32
    int-to-long v7, v5

    .line 33
    array-length v5, v2

    .line 34
    int-to-long v9, v5

    .line 35
    add-long/2addr v7, v9

    .line 36
    invoke-virtual {v0, v7, v8}, Lv20;->h(J)V

    .line 37
    .line 38
    .line 39
    invoke-static/range {p5 .. p5}, Lv20;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lv20;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    new-instance v7, Ljavax/crypto/spec/SecretKeySpec;

    .line 52
    .line 53
    invoke-direct {v7, v1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5, v7}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5}, Ljavax/crypto/Mac;->getMacLength()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    int-to-double v7, v4

    .line 64
    int-to-double v9, v0

    .line 65
    div-double/2addr v7, v9

    .line 66
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 67
    .line 68
    .line 69
    move-result-wide v7

    .line 70
    double-to-int v1, v7

    .line 71
    mul-int/2addr v0, v1

    .line 72
    new-array v8, v0, [B

    .line 73
    .line 74
    if-gt v6, v1, :cond_2

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    move v9, v0

    .line 78
    move v13, v6

    .line 79
    :goto_0
    invoke-virtual {v5}, Ljavax/crypto/Mac;->reset()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5, v2}, Ljavax/crypto/Mac;->update([B)V

    .line 83
    .line 84
    .line 85
    ushr-int/lit8 v7, v13, 0x18

    .line 86
    .line 87
    int-to-byte v7, v7

    .line 88
    ushr-int/lit8 v10, v13, 0x10

    .line 89
    .line 90
    int-to-byte v10, v10

    .line 91
    ushr-int/lit8 v11, v13, 0x8

    .line 92
    .line 93
    int-to-byte v11, v11

    .line 94
    int-to-byte v12, v13

    .line 95
    const/4 v14, 0x4

    .line 96
    new-array v14, v14, [B

    .line 97
    .line 98
    aput-byte v7, v14, v0

    .line 99
    .line 100
    aput-byte v10, v14, v6

    .line 101
    .line 102
    const/4 v7, 0x2

    .line 103
    aput-byte v11, v14, v7

    .line 104
    .line 105
    const/4 v7, 0x3

    .line 106
    aput-byte v12, v14, v7

    .line 107
    .line 108
    invoke-virtual {v5, v14}, Ljavax/crypto/Mac;->doFinal([B)[B

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    array-length v10, v7

    .line 116
    invoke-static {v7, v10}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    add-int/lit8 v11, v3, -0x1

    .line 121
    .line 122
    move v12, v0

    .line 123
    :goto_1
    if-ge v12, v11, :cond_1

    .line 124
    .line 125
    invoke-virtual {v5, v7}, Ljavax/crypto/Mac;->doFinal([B)[B

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    array-length v14, v10

    .line 130
    move v15, v0

    .line 131
    :goto_2
    if-ge v15, v14, :cond_0

    .line 132
    .line 133
    aget-byte v16, v10, v15

    .line 134
    .line 135
    aget-byte v17, v7, v15

    .line 136
    .line 137
    xor-int v0, v16, v17

    .line 138
    .line 139
    int-to-byte v0, v0

    .line 140
    aput-byte v0, v10, v15

    .line 141
    .line 142
    add-int/lit8 v15, v15, 0x1

    .line 143
    .line 144
    const/4 v0, 0x0

    .line 145
    goto :goto_2

    .line 146
    :cond_0
    add-int/lit8 v12, v12, 0x1

    .line 147
    .line 148
    const/4 v0, 0x0

    .line 149
    goto :goto_1

    .line 150
    :cond_1
    const/4 v11, 0x0

    .line 151
    const/16 v12, 0xc

    .line 152
    .line 153
    move-object v7, v10

    .line 154
    const/4 v10, 0x0

    .line 155
    invoke-static/range {v7 .. v12}, Lmg;->d0([B[BIIII)V

    .line 156
    .line 157
    .line 158
    array-length v0, v7

    .line 159
    add-int/2addr v9, v0

    .line 160
    if-eq v13, v1, :cond_2

    .line 161
    .line 162
    add-int/lit8 v13, v13, 0x1

    .line 163
    .line 164
    const/4 v0, 0x0

    .line 165
    goto :goto_0

    .line 166
    :cond_2
    invoke-static {v8, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    return-object v0

    .line 171
    :cond_3
    const/4 v0, 0x0

    .line 172
    const/16 v1, 0x1c

    .line 173
    .line 174
    const-string v2, "INVALID_ARGUMENT"

    .line 175
    .line 176
    const-string v3, "Derived output length is invalid."

    .line 177
    .line 178
    const/4 v4, 0x0

    .line 179
    const/4 v6, 0x0

    .line 180
    move-object/from16 p4, v0

    .line 181
    .line 182
    move/from16 p5, v1

    .line 183
    .line 184
    move-object/from16 p0, v2

    .line 185
    .line 186
    move-object/from16 p1, v3

    .line 187
    .line 188
    move/from16 p2, v4

    .line 189
    .line 190
    move-object/from16 p3, v6

    .line 191
    .line 192
    invoke-static/range {p0 .. p5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 193
    .line 194
    .line 195
    return-object v5

    .line 196
    :cond_4
    const/4 v0, 0x0

    .line 197
    const/16 v1, 0x1c

    .line 198
    .line 199
    const-string v2, "INVALID_ARGUMENT"

    .line 200
    .line 201
    const-string v3, "PBKDF2 iterations must be between 1 and 10000000."

    .line 202
    .line 203
    const/4 v4, 0x0

    .line 204
    const/4 v6, 0x0

    .line 205
    move-object/from16 p4, v0

    .line 206
    .line 207
    move/from16 p5, v1

    .line 208
    .line 209
    move-object/from16 p0, v2

    .line 210
    .line 211
    move-object/from16 p1, v3

    .line 212
    .line 213
    move/from16 p2, v4

    .line 214
    .line 215
    move-object/from16 p3, v6

    .line 216
    .line 217
    invoke-static/range {p0 .. p5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 218
    .line 219
    .line 220
    return-object v5
.end method

.method public final g(I)[B
    .locals 6

    .line 1
    iget-object v0, p0, Lv20;->a:Lbf2;

    .line 2
    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/high16 v1, 0x100000

    .line 9
    .line 10
    if-gt p1, v1, :cond_0

    .line 11
    .line 12
    new-array p1, p1, [B

    .line 13
    .line 14
    iget-object p0, p0, Lv20;->b:Ljava/security/SecureRandom;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    const/16 v5, 0x1c

    .line 25
    .line 26
    const-string v0, "INVALID_ARGUMENT"

    .line 27
    .line 28
    const-string v1, "Random byte length must be between 0 and 1048576."

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static/range {v0 .. v5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public final h(J)V
    .locals 6

    .line 1
    iget-object p0, p0, Lv20;->a:Lbf2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-wide/32 v0, 0x1000000

    .line 7
    .line 8
    .line 9
    cmp-long p0, p1, v0

    .line 10
    .line 11
    if-gtz p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 v4, 0x0

    .line 15
    const/16 v5, 0x1c

    .line 16
    .line 17
    const-string v0, "QUOTA_EXCEEDED"

    .line 18
    .line 19
    const-string v1, "Crypto input exceeds 16777216 bytes."

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static/range {v0 .. v5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

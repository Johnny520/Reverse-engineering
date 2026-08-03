.class public final Lbsh/snapshot/BshSnapshotHelper;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/snapshot/BshSnapshotHelper$FilteringObjectInputStream;
    }
.end annotation


# static fields
.field private static final GCM_TAG_BITS:I = 0x80

.field private static final HEADER_VERSION:I = 0x1

.field private static final IV_LENGTH:I = 0xc

.field private static final MAGIC:[B

.field private static final RANDOM:Ljava/security/SecureRandom;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lbsh/snapshot/BshSnapshotHelper;->MAGIC:[B

    .line 8
    .line 9
    new-instance v0, Ljava/security/SecureRandom;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lbsh/snapshot/BshSnapshotHelper;->RANDOM:Ljava/security/SecureRandom;

    .line 15
    .line 16
    return-void

    .line 17
    :array_0
    .array-data 1
        0x42t
        0x53t
        0x48t
        0x53t
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic a(Ljava/lang/Class;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/snapshot/BshSnapshotHelper;->isAllowed(Ljava/lang/Class;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static isAllowed(Ljava/lang/Class;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-eqz p0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-static {p0}, Lbsh/snapshot/BshSnapshotHelper;->isAllowed(Ljava/lang/Class;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_2

    .line 38
    .line 39
    :cond_1
    return v1

    .line 40
    :cond_2
    const/4 p0, 0x0

    .line 41
    return p0

    .line 42
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_5

    .line 47
    .line 48
    const-class v0, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    const-class v0, Ljava/lang/String;

    .line 57
    .line 58
    if-eq p0, v0, :cond_5

    .line 59
    .line 60
    const-class v0, Ljava/lang/Boolean;

    .line 61
    .line 62
    if-eq p0, v0, :cond_5

    .line 63
    .line 64
    const-class v0, Ljava/lang/Character;

    .line 65
    .line 66
    if-eq p0, v0, :cond_5

    .line 67
    .line 68
    const-class v0, Ljava/util/Collection;

    .line 69
    .line 70
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_5

    .line 75
    .line 76
    const-class v0, Ljava/util/Map;

    .line 77
    .line 78
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_5

    .line 83
    .line 84
    const-class v0, Ljava/lang/Enum;

    .line 85
    .line 86
    if-eq p0, v0, :cond_5

    .line 87
    .line 88
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_5

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v2, "java.lang.invoke."

    .line 99
    .line 100
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_5

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v2, "java.lang.constant."

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_4

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    const-string v0, "bsh."

    .line 124
    .line 125
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    return p0

    .line 130
    :cond_5
    :goto_1
    return v1
.end method

.method public static readEncrypted(Ljava/io/InputStream;Ljavax/crypto/SecretKey;)Lbsh/snapshot/BshSnapshot;
    .locals 6

    .line 1
    const-string v0, "BeanShell snapshot unsupported AST format: "

    .line 2
    .line 3
    sget-object v1, Lbsh/snapshot/BshSnapshotHelper;->MAGIC:[B

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    invoke-static {p0, v2}, Lbsh/snapshot/BshSnapshotHelper;->readExact(Ljava/io/InputStream;I)[B

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-static {v2, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x1

    .line 21
    if-ne v1, v2, :cond_3

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-lez v1, :cond_2

    .line 28
    .line 29
    const/16 v3, 0x20

    .line 30
    .line 31
    if-gt v1, v3, :cond_2

    .line 32
    .line 33
    invoke-static {p0, v1}, Lbsh/snapshot/BshSnapshotHelper;->readExact(Ljava/io/InputStream;I)[B

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :try_start_0
    const-string v3, "AES/GCM/NoPadding"

    .line 38
    .line 39
    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-instance v4, Ljavax/crypto/spec/GCMParameterSpec;

    .line 44
    .line 45
    const/16 v5, 0x80

    .line 46
    .line 47
    invoke-direct {v4, v5, v1}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x2

    .line 51
    invoke-virtual {v3, v1, p1, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 52
    .line 53
    .line 54
    new-instance p1, Lbsh/snapshot/BshSnapshotHelper$FilteringObjectInputStream;

    .line 55
    .line 56
    new-instance v1, Ljavax/crypto/CipherInputStream;

    .line 57
    .line 58
    invoke-direct {v1, p0, v3}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p1, v1}, Lbsh/snapshot/BshSnapshotHelper$FilteringObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    .line 64
    :try_start_1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    instance-of v1, p0, Lbsh/snapshot/BshSnapshot;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    check-cast p0, Lbsh/snapshot/BshSnapshot;

    .line 73
    .line 74
    invoke-virtual {p0}, Lbsh/snapshot/BshSnapshot;->getFormatVersion()I

    .line 75
    .line 76
    .line 77
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    if-ne v1, v2, :cond_0

    .line 79
    .line 80
    :try_start_2
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->close()V
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    .line 81
    .line 82
    .line 83
    return-object p0

    .line 84
    :cond_0
    :try_start_3
    new-instance v1, Ljava/io/IOException;

    .line 85
    .line 86
    new-instance v2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lbsh/snapshot/BshSnapshot;->getFormatVersion()I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-direct {v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v1

    .line 106
    :catchall_0
    move-exception p0

    .line 107
    goto :goto_0

    .line 108
    :cond_1
    new-instance p0, Ljava/io/InvalidClassException;

    .line 109
    .line 110
    const-string v0, "BeanShell snapshot unexpected payload"

    .line 111
    .line 112
    invoke-direct {p0, v0}, Ljava/io/InvalidClassException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 116
    :goto_0
    :try_start_4
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :catchall_1
    move-exception p1

    .line 121
    :try_start_5
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    :goto_1
    throw p0
    :try_end_5
    .catch Ljava/security/GeneralSecurityException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_0

    .line 125
    :catch_0
    move-exception p0

    .line 126
    new-instance p1, Ljava/io/IOException;

    .line 127
    .line 128
    const-string v0, "BeanShell snapshot class not found"

    .line 129
    .line 130
    invoke-direct {p1, v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    throw p1

    .line 134
    :catch_1
    move-exception p0

    .line 135
    new-instance p1, Ljava/io/IOException;

    .line 136
    .line 137
    const-string v0, "BeanShell snapshot decrypt failed"

    .line 138
    .line 139
    invoke-direct {p1, v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    throw p1

    .line 143
    :cond_2
    const-string p0, "BeanShell snapshot invalid IV length"

    .line 144
    .line 145
    invoke-static {p0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :goto_2
    const/4 p0, 0x0

    .line 149
    return-object p0

    .line 150
    :cond_3
    const-string p0, "BeanShell snapshot unsupported version: "

    .line 151
    .line 152
    invoke-static {v1, p0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-static {p0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_4
    const-string p0, "BeanShell snapshot invalid header"

    .line 161
    .line 162
    invoke-static {p0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto :goto_2
.end method

.method private static readExact(Ljava/io/InputStream;I)[B
    .locals 3

    .line 1
    new-array v0, p1, [B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, p1, :cond_1

    .line 5
    .line 6
    sub-int v2, p1, v1

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1, v2}, Ljava/io/InputStream;->read([BII)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ltz v2, :cond_0

    .line 13
    .line 14
    add-int/2addr v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p0, "BeanShell snapshot unexpected end"

    .line 17
    .line 18
    invoke-static {p0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_1
    return-object v0
.end method

.method public static writeEncrypted(Lbsh/snapshot/BshSnapshot;Ljava/io/OutputStream;Ljavax/crypto/SecretKey;)V
    .locals 5

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    sget-object v2, Lbsh/snapshot/BshSnapshotHelper;->RANDOM:Ljava/security/SecureRandom;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 8
    .line 9
    .line 10
    sget-object v2, Lbsh/snapshot/BshSnapshotHelper;->MAGIC:[B

    .line 11
    .line 12
    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write([B)V

    .line 23
    .line 24
    .line 25
    :try_start_0
    const-string v0, "AES/GCM/NoPadding"

    .line 26
    .line 27
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v3, Ljavax/crypto/spec/GCMParameterSpec;

    .line 32
    .line 33
    const/16 v4, 0x80

    .line 34
    .line 35
    invoke-direct {v3, v4, v1}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2, p2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 39
    .line 40
    .line 41
    new-instance p2, Ljava/io/ObjectOutputStream;

    .line 42
    .line 43
    new-instance v1, Ljavax/crypto/CipherOutputStream;

    .line 44
    .line 45
    invoke-direct {v1, p1, v0}, Ljavax/crypto/CipherOutputStream;-><init>(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p2, v1}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    :try_start_1
    invoke-virtual {p2, p0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    .line 53
    .line 54
    :try_start_2
    invoke-virtual {p2}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_0

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :catchall_0
    move-exception p0

    .line 59
    :try_start_3
    invoke-virtual {p2}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_1
    move-exception p1

    .line 64
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/security/GeneralSecurityException; {:try_start_4 .. :try_end_4} :catch_0

    .line 68
    :catch_0
    move-exception p0

    .line 69
    new-instance p1, Ljava/io/IOException;

    .line 70
    .line 71
    const-string p2, "BeanShell snapshot encrypt failed"

    .line 72
    .line 73
    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    throw p1
.end method

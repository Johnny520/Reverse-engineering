.class public Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer;
.super Lcom/esotericsoftware/kryo/Serializer;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field private static keySpec:Ljavax/crypto/spec/SecretKeySpec;


# instance fields
.field private final serializer:Lcom/esotericsoftware/kryo/Serializer;


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/Serializer;[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/Serializer;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer;->serializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 5
    .line 6
    new-instance p0, Ljavax/crypto/spec/SecretKeySpec;

    .line 7
    .line 8
    const-string p1, "Blowfish"

    .line 9
    .line 10
    invoke-direct {p0, p2, p1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sput-object p0, Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer;->keySpec:Ljavax/crypto/spec/SecretKeySpec;

    .line 14
    .line 15
    return-void
.end method

.method private static getCipher(I)Ljavax/crypto/Cipher;
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "Blowfish"

    .line 2
    .line 3
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer;->keySpec:Ljavax/crypto/spec/SecretKeySpec;

    .line 8
    .line 9
    invoke-virtual {v0, p0, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :catch_0
    move-exception p0

    .line 14
    new-instance v0, Lcom/esotericsoftware/kryo/KryoException;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    throw v0
.end method


# virtual methods
.method public copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer;->serializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Serializer;->copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer;->getCipher(I)Ljavax/crypto/Cipher;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    new-instance v1, Ljavax/crypto/CipherInputStream;

    .line 7
    .line 8
    invoke-direct {v1, p2, v0}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer;->serializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 12
    .line 13
    new-instance p2, Lcom/esotericsoftware/kryo/io/Input;

    .line 14
    .line 15
    const/16 v0, 0x100

    .line 16
    .line 17
    invoke-direct {p2, v1, v0}, Lcom/esotericsoftware/kryo/io/Input;-><init>(Ljava/io/InputStream;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/Serializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer;->getCipher(I)Ljavax/crypto/Cipher;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    new-instance v1, Ljavax/crypto/CipherOutputStream;

    .line 7
    .line 8
    invoke-direct {v1, p2, v0}, Ljavax/crypto/CipherOutputStream;-><init>(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer$1;

    .line 12
    .line 13
    const/16 v0, 0x100

    .line 14
    .line 15
    invoke-direct {p2, p0, v1, v0}, Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer$1;-><init>(Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer;Ljava/io/OutputStream;I)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer;->serializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/Serializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/esotericsoftware/kryo/io/Output;->flush()V

    .line 24
    .line 25
    .line 26
    :try_start_0
    invoke-virtual {v1}, Ljavax/crypto/CipherOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception p0

    .line 31
    new-instance p1, Lcom/esotericsoftware/kryo/KryoException;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw p1
.end method

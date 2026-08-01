.class public final Lcom/android/dx/command/dump/ClassDumper;
.super Lcom/android/dx/command/dump/BaseDumper;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method private constructor <init>([BLjava/io/PrintStream;Ljava/lang/String;Lcom/android/dx/command/dump/Args;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/dx/command/dump/BaseDumper;-><init>([BLjava/io/PrintStream;Ljava/lang/String;Lcom/android/dx/command/dump/Args;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static dump([BLjava/io/PrintStream;Ljava/lang/String;Lcom/android/dx/command/dump/Args;)V
    .locals 1

    .line 49
    new-instance v0, Lcom/android/dx/command/dump/ClassDumper;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/android/dx/command/dump/ClassDumper;-><init>([BLjava/io/PrintStream;Ljava/lang/String;Lcom/android/dx/command/dump/Args;)V

    .line 50
    invoke-virtual {v0}, Lcom/android/dx/command/dump/ClassDumper;->dump()V

    return-void
.end method


# virtual methods
.method public dump()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/command/dump/BaseDumper;->getBytes()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/android/dx/util/ByteArray;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/android/dx/util/ByteArray;-><init>([B)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lcom/android/dx/cf/direct/DirectClassFile;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/android/dx/command/dump/BaseDumper;->getFilePath()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {p0}, Lcom/android/dx/command/dump/BaseDumper;->getStrictParse()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-direct {v2, v1, v3, v4}, Lcom/android/dx/cf/direct/DirectClassFile;-><init>(Lcom/android/dx/util/ByteArray;Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    sget-object v3, Lcom/android/dx/cf/direct/StdAttributeFactory;->THE_ONE:Lcom/android/dx/cf/direct/StdAttributeFactory;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Lcom/android/dx/cf/direct/DirectClassFile;->setAttributeFactory(Lcom/android/dx/cf/direct/AttributeFactory;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p0}, Lcom/android/dx/cf/direct/DirectClassFile;->setObserver(Lcom/android/dx/cf/iface/ParseObserver;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/android/dx/cf/direct/DirectClassFile;->getMagic()I

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/android/dx/command/dump/BaseDumper;->getReadBytes()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    array-length v3, v0

    .line 39
    if-eq v2, v3, :cond_0

    .line 40
    .line 41
    array-length v0, v0

    .line 42
    sub-int/2addr v0, v2

    .line 43
    const-string v3, "<extra data at end of file>"

    .line 44
    .line 45
    invoke-virtual {p0, v1, v2, v0, v3}, Lcom/android/dx/command/dump/BaseDumper;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

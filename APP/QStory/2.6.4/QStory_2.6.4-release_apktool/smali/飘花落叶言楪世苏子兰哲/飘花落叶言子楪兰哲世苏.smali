.class public final L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰哲世苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言楪世苏子兰哲/飘花落叶言子楪哲兰世苏;
.implements L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰哲世苏;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰哲世苏;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰哲世苏;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/io/ByteArrayInputStream;
    .locals 5

    .line 1
    const-string v0, "data:image"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    const/16 v0, 0x2c

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, -0x1

    .line 17
    if-eq v0, v2, :cond_1

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v4, ";base64"

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 43
    .line 44
    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_0
    const-string p0, "Not a base64 image data URL."

    .line 49
    .line 50
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_1
    const-string p0, "Missing comma in data URL."

    .line 55
    .line 56
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_2
    const-string p0, "Not a valid image data URL."

    .line 61
    .line 62
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v1
.end method


# virtual methods
.method public 飘花落叶言子世兰楪哲苏(L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰苏哲世;)L飘花落叶言楪世苏子兰哲/飘花落叶言子楪哲苏兰世;
    .locals 4

    .line 1
    iget p0, p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-class v1, Ljava/io/InputStream;

    .line 5
    .line 6
    const-class v2, Landroid/net/Uri;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    sparse-switch p0, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子世楪哲苏兰;

    .line 13
    .line 14
    const-class v0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪苏世哲兰;

    .line 15
    .line 16
    invoke-virtual {p1, v0, v1}, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)L飘花落叶言楪世苏子兰哲/飘花落叶言子楪哲苏兰世;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, p1}, L飘花落叶言楪世苏子兰哲/飘花落叶言子世楪哲苏兰;-><init>(L飘花落叶言楪世苏子兰哲/飘花落叶言子楪哲苏兰世;)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :sswitch_0
    new-instance p0, L飘花落叶言楪世苏哲子兰/飘花落叶言子楪世兰哲苏;

    .line 25
    .line 26
    invoke-virtual {p1, v2, v1}, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)L飘花落叶言楪世苏子兰哲/飘花落叶言子楪哲苏兰世;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {p0, p1, v3}, L飘花落叶言楪世苏哲子兰/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言楪世苏子兰哲/飘花落叶言子楪哲苏兰世;I)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :sswitch_1
    new-instance p0, L飘花落叶言楪世苏哲子兰/飘花落叶言子楪世兰哲苏;

    .line 35
    .line 36
    const-class v0, Landroid/os/ParcelFileDescriptor;

    .line 37
    .line 38
    invoke-virtual {p1, v2, v0}, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)L飘花落叶言楪世苏子兰哲/飘花落叶言子楪哲苏兰世;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {p0, p1, v3}, L飘花落叶言楪世苏哲子兰/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言楪世苏子兰哲/飘花落叶言子楪哲苏兰世;I)V

    .line 43
    .line 44
    .line 45
    return-object p0

    .line 46
    :sswitch_2
    new-instance p0, L飘花落叶言楪世苏哲子兰/飘花落叶言子楪世兰哲苏;

    .line 47
    .line 48
    const-class v0, Landroid/content/res/AssetFileDescriptor;

    .line 49
    .line 50
    invoke-virtual {p1, v2, v0}, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)L飘花落叶言楪世苏子兰哲/飘花落叶言子楪哲苏兰世;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {p0, p1, v3}, L飘花落叶言楪世苏哲子兰/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言楪世苏子兰哲/飘花落叶言子楪哲苏兰世;I)V

    .line 55
    .line 56
    .line 57
    return-object p0

    .line 58
    :sswitch_3
    new-instance p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰哲苏世;

    .line 59
    .line 60
    invoke-direct {p0, v3}, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰哲苏世;-><init>(I)V

    .line 61
    .line 62
    .line 63
    return-object p0

    .line 64
    :sswitch_4
    new-instance p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪世哲苏兰;

    .line 65
    .line 66
    new-instance p1, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰哲世苏;

    .line 67
    .line 68
    const/4 v1, 0x3

    .line 69
    invoke-direct {p1, v1}, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰哲世苏;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-direct {p0, p1, v0}, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/Object;I)V

    .line 73
    .line 74
    .line 75
    return-object p0

    .line 76
    :sswitch_5
    new-instance p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪世哲苏兰;

    .line 77
    .line 78
    new-instance p1, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰哲世苏;

    .line 79
    .line 80
    invoke-direct {p1, v3}, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰哲世苏;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p0, p1, v0}, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/Object;I)V

    .line 84
    .line 85
    .line 86
    return-object p0

    .line 87
    :sswitch_6
    sget-object p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰哲苏世;

    .line 88
    .line 89
    return-object p0

    .line 90
    nop

    .line 91
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_6
        0x2 -> :sswitch_5
        0x4 -> :sswitch_4
        0x6 -> :sswitch_3
        0xb -> :sswitch_2
        0xc -> :sswitch_1
        0xd -> :sswitch_0
    .end sparse-switch
.end method

.method public 飘花落叶言子楪世苏兰哲()Ljava/lang/Class;
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    sparse-switch p0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    const-class p0, Ljava/io/InputStream;

    .line 7
    .line 8
    return-object p0

    .line 9
    :sswitch_0
    const-class p0, Landroid/os/ParcelFileDescriptor;

    .line 10
    .line 11
    return-object p0

    .line 12
    :sswitch_1
    const-class p0, Ljava/io/InputStream;

    .line 13
    .line 14
    return-object p0

    .line 15
    :sswitch_2
    const-class p0, Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_2
        0x3 -> :sswitch_1
        0x8 -> :sswitch_0
    .end sparse-switch
.end method

.method public 飘花落叶言子楪苏兰世哲(Ljava/lang/Object;Ljava/io/File;L飘花落叶言楪世子哲兰苏/飘花落叶言子楪苏世兰哲;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    :try_start_0
    invoke-static {p1, p2}, L飘花落叶言楪世兰苏哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/nio/ByteBuffer;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    const/4 p1, 0x3

    .line 10
    const-string p2, "ByteBufferEncoder"

    .line 11
    .line 12
    invoke-static {p2, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const-string p1, "Failed to write data"

    .line 19
    .line 20
    invoke-static {p2, p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 21
    .line 22
    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

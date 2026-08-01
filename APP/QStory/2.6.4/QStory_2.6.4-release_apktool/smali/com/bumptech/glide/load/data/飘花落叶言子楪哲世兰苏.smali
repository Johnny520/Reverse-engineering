.class public final Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世兰苏;
.super Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世苏兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪兰世哲苏:Landroid/content/UriMatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Landroid/content/UriMatcher;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-direct {v0, v1}, Landroid/content/UriMatcher;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰世哲苏:Landroid/content/UriMatcher;

    .line 8
    .line 9
    const-string v1, "com.android.contacts"

    .line 10
    .line 11
    const-string v2, "contacts/lookup/*/#"

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    const-string v2, "contacts/lookup/*"

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const-string v2, "contacts/#/photo"

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    const-string v2, "contacts/#"

    .line 29
    .line 30
    const/4 v3, 0x3

    .line 31
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    const-string v2, "contacts/#/display_photo"

    .line 35
    .line 36
    const/4 v3, 0x4

    .line 37
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const-string v2, "phone_lookup/*"

    .line 41
    .line 42
    const/4 v3, 0x5

    .line 43
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 44
    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰世哲苏:Landroid/content/UriMatcher;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v0, v2, :cond_3

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    if-eq v0, v3, :cond_2

    .line 13
    .line 14
    const/4 v3, 0x5

    .line 15
    if-eq v0, v3, :cond_3

    .line 16
    .line 17
    iget-boolean p0, p0, Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Z

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-static {p2}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Landroid/net/Uri;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 28
    .line 29
    const/16 v0, 0x1e

    .line 30
    .line 31
    if-lt p0, v0, :cond_1

    .line 32
    .line 33
    invoke-static {}, Landroidx/core/view/飘花落叶言子哲兰楪世苏;->飘花落叶言子世楪兰哲苏()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    const/16 v0, 0x11

    .line 38
    .line 39
    if-lt p0, v0, :cond_1

    .line 40
    .line 41
    invoke-static {p1, p2}, Landroidx/core/os/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/content/res/AssetFileDescriptor;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-eqz p0, :cond_0

    .line 46
    .line 47
    :try_start_0
    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 48
    .line 49
    .line 50
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    goto :goto_0

    .line 52
    :catch_0
    move-exception p1

    .line 53
    :try_start_1
    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 54
    .line 55
    .line 56
    :catch_1
    new-instance p0, Ljava/io/FileNotFoundException;

    .line 57
    .line 58
    const-string p2, "Unable to create stream"

    .line 59
    .line 60
    invoke-direct {p0, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, Ljava/io/FileNotFoundException;

    .line 68
    .line 69
    throw p0

    .line 70
    :cond_0
    const-string p0, "FileDescriptor is null for: "

    .line 71
    .line 72
    invoke-static {p2, p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_1
    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    goto :goto_0

    .line 81
    :cond_2
    invoke-static {p1, p2, v2}, Landroid/provider/ContactsContract$Contacts;->openContactPhotoInputStream(Landroid/content/ContentResolver;Landroid/net/Uri;Z)Ljava/io/InputStream;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    goto :goto_0

    .line 86
    :cond_3
    invoke-static {p1, p2}, Landroid/provider/ContactsContract$Contacts;->lookupContact(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/net/Uri;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    if-eqz p0, :cond_5

    .line 91
    .line 92
    invoke-static {p1, p0, v2}, Landroid/provider/ContactsContract$Contacts;->openContactPhotoInputStream(Landroid/content/ContentResolver;Landroid/net/Uri;Z)Ljava/io/InputStream;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    :goto_0
    if-eqz p0, :cond_4

    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_4
    const-string p0, "InputStream is null for "

    .line 100
    .line 101
    invoke-static {p2, p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-object v1

    .line 105
    :cond_5
    new-instance p0, Ljava/io/FileNotFoundException;

    .line 106
    .line 107
    const-string p1, "Contact cannot be found"

    .line 108
    .line 109
    invoke-direct {p0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, Ljava/io/InputStream;

    .line 2
    .line 3
    return-object p0
.end method

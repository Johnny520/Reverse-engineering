.class public final Lyyds/ᲁᛷᲁ;
.super Lyyds/ᛱᛴᲁᛵ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛶᛷᛲᲁ:I


# direct methods
.method public synthetic constructor <init>(Landroid/content/ContentResolver;Landroid/net/Uri;ZI)V
    .locals 0

    .line 1
    iput p4, p0, Lyyds/ᲁᛷᲁ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lyyds/ᛱᛴᲁᛵ;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget p1, p0, Lyyds/ᲁᛷᲁ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "FileDescriptor is null for: "

    .line 5
    .line 6
    const-string v2, "r"

    .line 7
    .line 8
    const/16 v3, 0x11

    .line 9
    .line 10
    const/16 v4, 0x1e

    .line 11
    .line 12
    iget-boolean v5, p0, Lyyds/ᛱᛴᲁᛵ;->ᲀᛲᛳᲀ:Z

    .line 13
    .line 14
    iget-object p0, p0, Lyyds/ᛱᛴᲁᛵ;->ᛲᛴᛳᛲ:Landroid/content/ContentResolver;

    .line 15
    .line 16
    packed-switch p1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    if-eqz v5, :cond_0

    .line 20
    .line 21
    invoke-static {p2}, Lyyds/ᛳᛵᲀ;->ᛲᛴᛳᛲ(Landroid/net/Uri;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-static {v4}, Landroid/os/ext/SdkExtensions;->getExtensionVersion(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-lt p1, v3, :cond_0

    .line 32
    .line 33
    invoke-static {p0, p2}, Lyyds/ᛳᛵᛱᛸ;->ᛵᛸᛸᛷ(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/content/res/AssetFileDescriptor;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p0, p2, v2}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    :goto_0
    if-eqz p0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-static {p2, v1}, Lyyds/ᛷᲈᲈᛶ;->ᛷᛵᲇᲀ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    return-object v0

    .line 53
    :pswitch_0
    if-eqz v5, :cond_2

    .line 54
    .line 55
    invoke-static {p2}, Lyyds/ᛳᛵᲀ;->ᛲᛴᛳᛲ(Landroid/net/Uri;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-static {v4}, Landroid/os/ext/SdkExtensions;->getExtensionVersion(I)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-lt p1, v3, :cond_2

    .line 66
    .line 67
    invoke-static {p0, p2}, Lyyds/ᛳᛵᛱᛸ;->ᛵᛸᛸᛷ(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/content/res/AssetFileDescriptor;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    invoke-virtual {p0, p2, v2}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    :goto_2
    if-eqz p0, :cond_3

    .line 77
    .line 78
    move-object v0, p0

    .line 79
    goto :goto_3

    .line 80
    :cond_3
    invoke-static {p2, v1}, Lyyds/ᛷᲈᲈᛶ;->ᛷᛵᲇᲀ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :goto_3
    return-object v0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛲᲈᲁ()Ljava/lang/Class;
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲁᛷᲁ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-class p0, Landroid/os/ParcelFileDescriptor;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-class p0, Landroid/content/res/AssetFileDescriptor;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᲀᛲᛳᲀ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲁᛷᲁ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    check-cast p1, Landroid/content/res/AssetFileDescriptor;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->close()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

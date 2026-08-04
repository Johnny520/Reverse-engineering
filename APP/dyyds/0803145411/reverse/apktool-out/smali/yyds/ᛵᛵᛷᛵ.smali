.class public final Lyyds/ᛵᛵᛷᛵ;
.super Lyyds/ᛲᛴᛷᲁ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lyyds/\u16f5\u16f5\u16f7\u16f5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛷᛲᛸᛵ;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛷᛲᛸᛵ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᛵᛵᛷᛵ;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Landroid/content/Context;Z)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_3

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 12
    .line 13
    if-lt v0, v1, :cond_3

    .line 14
    .line 15
    const-string p0, "android.permission.READ_MEDIA_IMAGES"

    .line 16
    .line 17
    invoke-static {p0}, Lyyds/ᛸᲇᛶᛵ;->ᛲᲈᲁ(Ljava/lang/String;)Lyyds/ᛲᛴᛷᲁ;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Lyyds/ᛴᛶᛷᛱ;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    sget-object v1, Lyyds/ᛸᲇᛶᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛶᛲ;

    .line 30
    .line 31
    invoke-virtual {v1, p0, v0}, Lyyds/ᛶᛲᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-virtual {v0, p1, p2}, Lyyds/ᛲᛴᛷᲁ;->ᛷᛵᲇᲀ(Landroid/content/Context;Z)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    const-string p0, "android.permission.READ_MEDIA_VIDEO"

    .line 41
    .line 42
    invoke-static {p0}, Lyyds/ᛸᲇᛶᛵ;->ᛲᲈᲁ(Ljava/lang/String;)Lyyds/ᛲᛴᛷᲁ;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance v0, Lyyds/ᛳᛶᛸᛱ;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    sget-object v1, Lyyds/ᛸᲇᛶᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛶᛲ;

    .line 55
    .line 56
    invoke-virtual {v1, p0, v0}, Lyyds/ᛶᛲᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :goto_1
    invoke-virtual {v0, p1, p2}, Lyyds/ᛲᛴᛷᲁ;->ᛷᛵᲇᲀ(Landroid/content/Context;Z)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_2

    .line 64
    .line 65
    invoke-static {}, Lyyds/ᛸᲇᛶᛵ;->ᲀᛲᛳᲀ()Lyyds/ᛲᛴᛷᲁ;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0, p1, p2}, Lyyds/ᛲᛴᛷᲁ;->ᛷᛵᲇᲀ(Landroid/content/Context;Z)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_2

    .line 74
    .line 75
    const/4 p0, 0x1

    .line 76
    return p0

    .line 77
    :cond_2
    const/4 p0, 0x0

    .line 78
    return p0

    .line 79
    :cond_3
    invoke-super {p0, p1, p2}, Lyyds/ᛲᛴᛷᲁ;->ᛱᛳᲇ(Landroid/content/Context;Z)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    return p0
.end method

.method public final ᛲᛳᛶᲁ()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "storage_group"

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛲᛴᛳᛲ()I
    .locals 0

    .line 1
    const/16 p0, 0x17

    .line 2
    .line 3
    return p0
.end method

.method public final ᛵᛸᛸᛷ(Landroid/app/Activity;Ljava/util/ArrayList;Lyyds/ᛴᛸᛶᛱ;Ljava/util/ArrayList;Lyyds/ᛸᲀᛴᛸ;)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Lyyds/ᛲᛴᛷᲁ;->ᛵᛸᛸᛷ(Landroid/app/Activity;Ljava/util/ArrayList;Lyyds/ᛴᛸᛶᛱ;Ljava/util/ArrayList;Lyyds/ᛸᲀᛴᛸ;)V

    .line 2
    .line 3
    .line 4
    const-string p0, "android.permission.ACCESS_MEDIA_LOCATION"

    .line 5
    .line 6
    invoke-static {p0, p2}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛴᛳᛲ(Ljava/lang/String;Ljava/util/ArrayList;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    iget-object p0, p3, Lyyds/ᛴᛸᛶᛱ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lyyds/ᛷᛶᛳᛸ;

    .line 16
    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 25
    .line 26
    iget-object p2, p0, Lyyds/ᛷᛶᛳᛸ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p2, Ljava/util/ArrayList;

    .line 29
    .line 30
    if-eqz p2, :cond_3

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    if-eqz p3, :cond_3

    .line 41
    .line 42
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    check-cast p3, Lyyds/ᛱᛶᲈᲁ;

    .line 47
    .line 48
    const-string p4, "ScopedStorage"

    .line 49
    .line 50
    iget-object p5, p3, Lyyds/ᛱᛶᲈᲁ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p4, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p4

    .line 56
    if-eqz p4, :cond_2

    .line 57
    .line 58
    iget-object p2, p3, Lyyds/ᛱᛶᲈᲁ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    const/4 p2, 0x0

    .line 66
    :goto_0
    const/16 p3, 0x1d

    .line 67
    .line 68
    if-lt p1, p3, :cond_5

    .line 69
    .line 70
    iget-boolean p0, p0, Lyyds/ᛷᛶᛳᛸ;->ᛲᲈᲁ:Z

    .line 71
    .line 72
    if-nez p0, :cond_5

    .line 73
    .line 74
    if-eqz p2, :cond_4

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    const-string p0, "Please register the android:requestLegacyExternalStorage=\"true\" attribute in the AndroidManifest.xml file, otherwise it will cause incompatibility with the old version"

    .line 78
    .line 79
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_5
    :goto_1
    const/16 p0, 0x1e

    .line 84
    .line 85
    if-lt p1, p0, :cond_7

    .line 86
    .line 87
    if-eqz p2, :cond_6

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    const-string p0, "The storage permission application is abnormal. If you have adapted the scope storage, please register the <meta-data android:name=\"ScopedStorage\" android:value=\"true\" /> attribute in the AndroidManifest.xml file. If there is no adaptation scope storage, please use \"android.permission.MANAGE_EXTERNAL_STORAGE\" to apply for permission"

    .line 91
    .line 92
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_7
    :goto_2
    return-void
.end method

.method public final ᛷᲈᲈᲁ()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "android.permission.READ_EXTERNAL_STORAGE"

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ(Landroid/app/Activity;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 6
    .line 7
    const/16 p1, 0x21

    .line 8
    .line 9
    if-ge p0, p1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "When the project targetSdkVersion >= 33, the \"android.permission.READ_EXTERNAL_STORAGE\" permission cannot be applied for, and some problems will occur.Because after testing, if targetSdkVersion >= 33 applies for \"android.permission.READ_EXTERNAL_STORAGE\" or \"android.permission.WRITE_EXTERNAL_STORAGE\", it will be directly rejected by the system and no authorization dialog box will be displayed.If the App has been adapted for scoped storage, the should be requested \"android.permission.READ_MEDIA_IMAGES\" or \"android.permission.READ_MEDIA_VIDEO\" or \"android.permission.READ_MEDIA_AUDIO\" permission.If the App does not need to adapt scoped storage, the should be requested \"android.permission.MANAGE_EXTERNAL_STORAGE\" permission"

    .line 13
    .line 14
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

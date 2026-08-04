.class public final Lyyds/ᛷᛱᛶᲈ;
.super Lyyds/ᛲᛴᛷᲁ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lyyds/\u16f7\u16f1\u16f6\u1c88;",
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
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛷᛲᛸᛵ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᛷᛱᛶᲈ;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public static ᛶᛳᛶᛵ(Landroid/content/Context;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    const-string v3, "com.android.permission.GET_INSTALLED_APPS"

    .line 8
    .line 9
    invoke-virtual {v2, v3, v1}, Landroid/content/pm/PackageManager;->getPermissionInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/content/pm/PermissionInfo;->getProtection()I

    .line 16
    .line 17
    .line 18
    move-result p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    if-ne p0, v0, :cond_0

    .line 20
    .line 21
    return v0

    .line 22
    :cond_0
    return v1

    .line 23
    :catch_0
    move-exception v2

    .line 24
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 25
    .line 26
    .line 27
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string v2, "oem_installed_apps_runtime_permission_enable"

    .line 32
    .line 33
    invoke-static {p0, v2}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result p0
    :try_end_1
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 37
    if-ne p0, v0, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move v0, v1

    .line 41
    :goto_0
    return v0

    .line 42
    :catch_1
    move-exception p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 44
    .line 45
    .line 46
    return v1
.end method

.method public static ᲇᛱᛲ(Landroid/content/Context;)Z
    .locals 3

    .line 1
    sget v0, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 2
    .line 3
    const v1, 0x48cc75a

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v0, "com.samsung.android.permission.GET_APP_LIST"

    .line 14
    .line 15
    invoke-virtual {p0, v0, v2}, Landroid/content/pm/PackageManager;->getPermissionInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionInfo;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/content/pm/PermissionInfo;->getProtection()I

    .line 22
    .line 23
    .line 24
    move-result p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    const/4 v0, 0x1

    .line 26
    if-ne p0, v0, :cond_0

    .line 27
    .line 28
    return v0

    .line 29
    :cond_0
    return v2

    .line 30
    :catch_0
    move-exception p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return v2
.end method


# virtual methods
.method public final ᛱᲈᲁ(Landroid/app/Activity;)I
    .locals 0

    .line 1
    invoke-static {p1}, Lyyds/ᛷᛱᛶᲈ;->ᛶᛳᛶᛵ(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-static {p1}, Lyyds/ᛷᛱᛶᲈ;->ᲇᛱᛲ(Landroid/content/Context;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    sget p0, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 17
    .line 18
    const p1, 0x40d592b

    .line 19
    .line 20
    .line 21
    if-ne p0, p1, :cond_5

    .line 22
    .line 23
    sget-object p0, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const-string p0, ""

    .line 29
    .line 30
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    const-string p1, "\\."

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    array-length p1, p0

    .line 44
    if-nez p1, :cond_4

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_4
    const/4 p1, 0x0

    .line 48
    :try_start_0
    aget-object p0, p0, p1

    .line 49
    .line 50
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    :catch_0
    :cond_5
    :goto_1
    const/4 p0, 0x2

    .line 54
    return p0
.end method

.method public final ᛲᛴᛳᛲ()I
    .locals 0

    .line 1
    const/16 p0, 0x11

    .line 2
    .line 3
    return p0
.end method

.method public final ᛳᲁᲁᲇ(Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lyyds/ᛲᛴᛷᲁ;->ᛳᲁᲁᲇ(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    invoke-static {p1}, Lyyds/ᛷᛱᛶᲈ;->ᛶᛳᛶᛵ(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    invoke-static {p1}, Lyyds/ᛷᛱᛶᲈ;->ᲇᛱᛲ(Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget p1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 21
    .line 22
    const v0, 0x241d30

    .line 23
    .line 24
    .line 25
    if-ne p1, v0, :cond_1

    .line 26
    .line 27
    if-ne p1, v0, :cond_3

    .line 28
    .line 29
    const-string p1, "OP_GET_INSTALLED_APPS"

    .line 30
    .line 31
    :try_start_0
    const-class v0, Landroid/app/AppOpsManager;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lyyds/ᛶᲀᛲᛲ;->ᛱᲈᲁ()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    :cond_1
    return p0

    .line 49
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 50
    :catch_0
    :cond_3
    return p0
.end method

.method public final ᛵᛸᛸᛷ(Landroid/app/Activity;Ljava/util/ArrayList;Lyyds/ᛴᛸᛶᛱ;Ljava/util/ArrayList;Lyyds/ᛸᲀᛴᛸ;)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Lyyds/ᛲᛴᛷᲁ;->ᛵᛸᛸᛷ(Landroid/app/Activity;Ljava/util/ArrayList;Lyyds/ᛴᛸᛶᛱ;Ljava/util/ArrayList;Lyyds/ᛸᲀᛴᛸ;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget p0, p0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 9
    .line 10
    const/16 p1, 0x1e

    .line 11
    .line 12
    if-ge p0, p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "android.permission.QUERY_ALL_PACKAGES"

    .line 16
    .line 17
    invoke-static {p0, p4}, Lyyds/ᛲᛴᛷᲁ;->ᲇᲈᛵᛷ(Ljava/lang/String;Ljava/util/ArrayList;)Lyyds/ᛸᲀᛴᛸ;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    iget-object p0, p3, Lyyds/ᛴᛸᛶᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-string p0, "Please register permissions in the AndroidManifest.xml file <uses-permission android:name=\"android.permission.QUERY_ALL_PACKAGES\" />, or add the app package name to the <queries> tag in the AndroidManifest.xml file"

    .line 35
    .line 36
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    :goto_0
    return-void
.end method

.method public final ᛷᛲᲈᛱ(Landroid/app/Activity;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lyyds/ᛶᲀᛲᛲ;->ᲇᲇᲇᛱ()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lyyds/ᛶᲀᛲᛲ;->ᛱᲈᲁ()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    :cond_0
    invoke-static {}, Lyyds/ᛶᲀᛲᛲ;->ᛶᛷᛲᲁ()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-static {}, Lyyds/ᛶᲀᛲᛲ;->ᛱᲈᲁ()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    :cond_1
    new-instance v1, Landroid/content/Intent;

    .line 31
    .line 32
    const-string v2, "miui.intent.action.APP_PERM_EDITOR"

    .line 33
    .line 34
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v2, "extra_pkgname"

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    sget v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 52
    .line 53
    const v2, 0x40d592b

    .line 54
    .line 55
    .line 56
    if-ne v1, v2, :cond_3

    .line 57
    .line 58
    new-instance v1, Landroid/content/Intent;

    .line 59
    .line 60
    const-string v2, "com.meizu.safe.security.SHOW_APPSEC"

    .line 61
    .line 62
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const-string v2, "packageName"

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_3
    :goto_0
    const/4 v1, 0x1

    .line 79
    new-array v1, v1, [Lyyds/ᛲᛴᛷᲁ;

    .line 80
    .line 81
    const/4 v2, 0x0

    .line 82
    aput-object p0, v1, v2

    .line 83
    .line 84
    invoke-static {p1, v1}, Lyyds/ᛴᛲᛴᛲ;->ᛲᛳᛶᲁ(Landroid/content/Context;[Lyyds/ᛲᛴᛷᲁ;)Landroid/content/Intent;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    new-instance p0, Landroid/content/Intent;

    .line 92
    .line 93
    const-string p1, "android.settings.MANAGE_APPLICATIONS_SETTINGS"

    .line 94
    .line 95
    invoke-direct {p0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    new-instance p0, Landroid/content/Intent;

    .line 102
    .line 103
    const-string p1, "android.settings.APPLICATION_SETTINGS"

    .line 104
    .line 105
    invoke-direct {p0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    new-instance p0, Landroid/content/Intent;

    .line 112
    .line 113
    const-string p1, "android.settings.SETTINGS"

    .line 114
    .line 115
    invoke-direct {p0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    return-object v0
.end method

.method public final ᛷᛵᲇᲀ(Landroid/content/Context;Z)Z
    .locals 7

    .line 1
    const-string p0, "OP_GET_INSTALLED_APPS"

    .line 2
    .line 3
    invoke-static {p1}, Lyyds/ᛷᛱᛶᲈ;->ᛶᛳᛶᛵ(Landroid/content/Context;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    const-string p0, "com.android.permission.GET_INSTALLED_APPS"

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    return v0

    .line 21
    :cond_1
    invoke-static {p1}, Lyyds/ᛷᛱᛶᲈ;->ᲇᛱᛲ(Landroid/content/Context;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_3

    .line 26
    .line 27
    const-string p0, "com.samsung.android.permission.GET_APP_LIST"

    .line 28
    .line 29
    invoke-virtual {p1, p0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-nez p0, :cond_2

    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    return v0

    .line 37
    :cond_3
    sget p2, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 38
    .line 39
    const v2, 0x40d592b

    .line 40
    .line 41
    .line 42
    const/4 v3, -0x1

    .line 43
    if-ne p2, v2, :cond_8

    .line 44
    .line 45
    sget-object p2, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 46
    .line 47
    if-eqz p2, :cond_4

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    const-string p2, ""

    .line 51
    .line 52
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_5

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_5
    const-string v2, "\\."

    .line 60
    .line 61
    invoke-virtual {p2, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    array-length v2, p2

    .line 66
    if-nez v2, :cond_6

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_6
    :try_start_0
    aget-object p2, p2, v0

    .line 70
    .line 71
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    goto :goto_2

    .line 76
    :catch_0
    :goto_1
    move p2, v3

    .line 77
    :goto_2
    const/16 v2, 0x9

    .line 78
    .line 79
    if-lt p2, v2, :cond_8

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    new-instance p2, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string p1, "_op_56"

    .line 98
    .line 99
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {p0, p1, v3}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    const/4 p1, 0x4

    .line 111
    if-eq p0, p1, :cond_d

    .line 112
    .line 113
    const/4 p1, 0x6

    .line 114
    if-ne p0, p1, :cond_7

    .line 115
    .line 116
    goto/16 :goto_7

    .line 117
    .line 118
    :cond_7
    return v0

    .line 119
    :cond_8
    sget p2, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 120
    .line 121
    const v2, 0x241d30

    .line 122
    .line 123
    .line 124
    if-ne p2, v2, :cond_d

    .line 125
    .line 126
    :try_start_1
    const-class p2, Landroid/app/AppOpsManager;

    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v2, p0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 137
    .line 138
    .line 139
    invoke-static {}, Lyyds/ᛶᲀᛲᛲ;->ᛱᲈᲁ()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-nez v2, :cond_9

    .line 144
    .line 145
    goto :goto_7

    .line 146
    :cond_9
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    check-cast v2, Landroid/app/AppOpsManager;

    .line 151
    .line 152
    if-nez v2, :cond_a

    .line 153
    .line 154
    :goto_3
    move p0, v3

    .line 155
    goto :goto_6

    .line 156
    :cond_a
    :try_start_2
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-result-object p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 164
    :try_start_3
    invoke-virtual {p2, p0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    const-class v4, Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-virtual {p0, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    check-cast p0, Ljava/lang/Integer;

    .line 175
    .line 176
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 177
    .line 178
    .line 179
    move-result p0
    :try_end_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 180
    goto :goto_4

    .line 181
    :catch_1
    move-exception p0

    .line 182
    goto :goto_5

    .line 183
    :catch_2
    const/16 p0, 0x2726

    .line 184
    .line 185
    :goto_4
    :try_start_4
    const-string v4, "checkOpNoThrow"

    .line 186
    .line 187
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 188
    .line 189
    const-class v6, Ljava/lang/String;

    .line 190
    .line 191
    filled-new-array {v5, v5, v6}, [Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-virtual {p2, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    iget v4, v4, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 208
    .line 209
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    filled-new-array {p0, v4, p1}, [Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    invoke-virtual {p2, v2, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    check-cast p0, Ljava/lang/Integer;

    .line 226
    .line 227
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 231
    goto :goto_6

    .line 232
    :goto_5
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :goto_6
    if-ne p0, v3, :cond_b

    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_b
    if-nez p0, :cond_c

    .line 240
    .line 241
    move v0, v1

    .line 242
    :cond_c
    move v1, v0

    .line 243
    :catch_3
    :cond_d
    :goto_7
    return v1
.end method

.method public final ᛷᲈᲈᲁ()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "com.android.permission.GET_INSTALLED_APPS"

    .line 2
    .line 3
    return-object p0
.end method

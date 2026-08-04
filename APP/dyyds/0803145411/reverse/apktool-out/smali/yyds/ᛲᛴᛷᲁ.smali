.class public abstract Lyyds/ᛲᛴᛷᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/os/Parcelable;


# direct methods
.method public static ᛲᲈᲁ(Lyyds/ᛸᲀᛴᛸ;Ljava/lang/String;I)V
    .locals 3

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    iget p0, p0, Lyyds/ᛸᲀᛴᛸ;->ᛵᛸᛸᛷ:I

    .line 4
    .line 5
    if-ge p0, p2, :cond_1

    .line 6
    .line 7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, "The AndroidManifest.xml file <uses-permission android:name=\""

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, "\" android:maxSdkVersion=\""

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p1, "\" /> does not meet the requirements, "

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const p1, 0x7fffffff

    .line 33
    .line 34
    .line 35
    if-eq p2, p1, :cond_0

    .line 36
    .line 37
    const-string p0, "the minimum requirement for maxSdkVersion is "

    .line 38
    .line 39
    invoke-static {p2, p0}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string p2, "please delete the android:maxSdkVersion=\""

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p0, "\" attribute"

    .line 55
    .line 56
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    :goto_0
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :cond_1
    return-void

    .line 75
    :cond_2
    const-string p0, "Please register permissions in the AndroidManifest.xml file <uses-permission android:name=\""

    .line 76
    .line 77
    const-string p2, "\" />"

    .line 78
    .line 79
    invoke-static {p0, p1, p2}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public static ᲇᲈᛵᛷ(Ljava/lang/String;Ljava/util/ArrayList;)Lyyds/ᛸᲀᛴᛸ;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lyyds/ᛸᲀᛴᛸ;

    .line 16
    .line 17
    iget-object v1, v0, Lyyds/ᛸᲀᛴᛸ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v1, p0}, Lyyds/ᛴᛶᲀᛲ;->ᛱᛳᲇ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lyyds/ᛲᛴᛷᲁ;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, Lyyds/ᛲᛴᛷᲁ;

    .line 10
    .line 11
    invoke-virtual {p0}, Lyyds/ᛲᛴᛷᲁ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p1}, Lyyds/ᛲᛴᛷᲁ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p0, p1}, Lyyds/ᛴᛶᲀᛲ;->ᛱᛳᲇ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_1
    instance-of v0, p1, Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    check-cast p1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0}, Lyyds/ᛲᛴᛷᲁ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0, p1}, Lyyds/ᛴᛶᲀᛲ;->ᛱᛳᲇ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :cond_2
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛲᛴᛷᲁ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛱᛳᲇ(Landroid/content/Context;Z)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛲᛴᛷᲁ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public ᛱᲈᲁ(Landroid/app/Activity;)I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public ᛲᛲᲈᲈ(Landroid/content/Context;Z)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public ᛲᛳᛶᲁ()Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public abstract ᛲᛴᛳᛲ()I
.end method

.method public ᛳᲁᲁᲇ(Landroid/content/Context;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛲᛴᛷᲁ;->ᛲᛴᛳᛲ()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    if-gt p0, p1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public ᛵᛸᛸᛷ(Landroid/app/Activity;Ljava/util/ArrayList;Lyyds/ᛴᛸᛶᛱ;Ljava/util/ArrayList;Lyyds/ᛸᲀᛴᛸ;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛲᛴᛷᲁ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const p1, 0x7fffffff

    .line 6
    .line 7
    .line 8
    invoke-static {p5, p0, p1}, Lyyds/ᛲᛴᛷᲁ;->ᛲᲈᲁ(Lyyds/ᛸᲀᛴᛸ;Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public ᛶᛷᛲᲁ()Ljava/util/List;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public ᛷᛲᲈᛱ(Landroid/app/Activity;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lyyds/ᛶᲀᛲᛲ;->ᛶᛷᛲᲁ()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-string v2, "extra_pkgname"

    .line 12
    .line 13
    const-string v3, "miui.intent.action.APP_PERM_EDITOR"

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-static {}, Lyyds/ᛶᲀᛲᛲ;->ᛱᲈᲁ()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    new-instance v1, Landroid/content/Intent;

    .line 24
    .line 25
    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-static {}, Lyyds/ᛶᲀᛲᛲ;->ᲇᲇᲇᛱ()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-static {}, Lyyds/ᛶᲀᛲᛲ;->ᛱᲈᲁ()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    sget-object v1, Lyyds/ᛶᲀᛲᛲ;->ᛷᛲᲈᛱ:Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const-string v1, ""

    .line 58
    .line 59
    :goto_0
    const-string v4, "^2\\.0\\.[0-5]\\.\\d+$"

    .line 60
    .line 61
    invoke-virtual {v1, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    new-instance v1, Landroid/content/Intent;

    .line 68
    .line 69
    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    sget v1, Lyyds/ᛶᲀᛲᛲ;->ᛲᛳᛶᲁ:I

    .line 85
    .line 86
    const v2, 0x40d592b

    .line 87
    .line 88
    .line 89
    if-ne v1, v2, :cond_3

    .line 90
    .line 91
    new-instance v1, Landroid/content/Intent;

    .line 92
    .line 93
    const-string v2, "com.meizu.safe.security.SHOW_APPSEC"

    .line 94
    .line 95
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const-string v2, "packageName"

    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    :cond_3
    :goto_1
    filled-new-array {p0}, [Lyyds/ᛲᛴᛷᲁ;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {p1, p0}, Lyyds/ᛴᛲᛴᛲ;->ᛲᛳᛶᲁ(Landroid/content/Context;[Lyyds/ᛲᛴᛷᲁ;)Landroid/content/Intent;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    new-instance p0, Landroid/content/Intent;

    .line 123
    .line 124
    const-string p1, "android.settings.MANAGE_APPLICATIONS_SETTINGS"

    .line 125
    .line 126
    invoke-direct {p0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    new-instance p0, Landroid/content/Intent;

    .line 133
    .line 134
    const-string p1, "android.settings.APPLICATION_SETTINGS"

    .line 135
    .line 136
    invoke-direct {p0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    new-instance p0, Landroid/content/Intent;

    .line 143
    .line 144
    const-string p1, "android.settings.SETTINGS"

    .line 145
    .line 146
    invoke-direct {p0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    return-object v0
.end method

.method public ᛷᛵᲇᲀ(Landroid/content/Context;Z)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyyds/ᛲᛴᛷᲁ;->ᛲᛴᛳᛲ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    if-le v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lyyds/ᛲᛴᛷᲁ;->ᛲᛲᲈᲈ(Landroid/content/Context;Z)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, Lyyds/ᛲᛴᛷᲁ;->ᛱᛳᲇ(Landroid/content/Context;Z)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public abstract ᛷᲈᲈᲁ()Ljava/lang/String;
.end method

.method public ᲀᛲᛳᲀ(Landroid/app/Activity;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᲇᲇᲇᛱ(Landroid/app/Activity;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛲᛴᛷᲁ;->ᛲᛴᛳᛲ()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

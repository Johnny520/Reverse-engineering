.class public final Lk8/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static a(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "receivehongbao"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_3

    .line 20
    .line 21
    const-string v2, "wxhb_personalreceive"

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_3

    .line 28
    .line 29
    const-string v2, "/hongbao/"

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const-string v0, "nativeurl"

    .line 39
    .line 40
    invoke-static {p0, v0}, Lk8/q;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_3

    .line 53
    .line 54
    const-string v1, "wxhb"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_3

    .line 61
    .line 62
    const-string v1, "hongbao"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    const-string v0, "type"

    .line 72
    .line 73
    invoke-static {p0, v0}, Lk8/q;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const-string v0, "2001"

    .line 78
    .line 79
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    return p0

    .line 84
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 85
    return p0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string v0, ":\n"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_1

    .line 17
    .line 18
    const-string v1, "<"

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-le v1, v0, :cond_1

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x2

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_1
    return-object p0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ">"

    .line 2
    .line 3
    const-string v1, "<"

    .line 4
    .line 5
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_2

    .line 10
    .line 11
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v3, "><!\\[CDATA\\[(.*?)\\]></"

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    const/4 v4, 0x1

    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    invoke-virtual {v2, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v1, ">(.*?)</"

    .line 70
    .line 71
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_2

    .line 97
    .line 98
    invoke-virtual {p0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    return-object p0

    .line 103
    :catchall_0
    :cond_2
    :goto_0
    const-string p0, ""

    .line 104
    .line 105
    return-object p0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const-string v0, "msgsource"

    .line 8
    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    :try_start_0
    const-string v0, "<msgsource\\b[^>]*>(.*?)</msgsource>"

    .line 17
    .line 18
    const/16 v1, 0x22

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    return-object p0

    .line 40
    :catchall_0
    :cond_1
    :goto_0
    const-string p0, ""

    .line 41
    .line 42
    return-object p0
.end method

.method public static e(Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 2

    .line 1
    :goto_0
    if-eqz p0, :cond_2

    .line 2
    .line 3
    :try_start_0
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    if-eq p0, v0, :cond_2

    .line 6
    .line 7
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/reflect/Field;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    :cond_2
    const/4 p0, 0x0

    .line 45
    return p0
.end method

.method public static f(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const-string v0, "@chatroom"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string v0, "@im.chatroom"

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    const-string v0, "@openim"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    :cond_0
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public static g(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "false"

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    const-string v0, "true"

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    const-string v0, "0"

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    const-string v0, "1"

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 p0, 0x0

    .line 42
    return p0

    .line 43
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 44
    return p0
.end method

.method public static h(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-class v0, Ljava/lang/String;

    .line 17
    .line 18
    if-eq p0, v0, :cond_4

    .line 19
    .line 20
    const-class v0, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_4

    .line 27
    .line 28
    const-class v0, Ljava/lang/Boolean;

    .line 29
    .line 30
    if-ne p0, v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const-string v0, "e"

    .line 34
    .line 35
    invoke-static {p0, v0}, Lk8/q;->e(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    const-string v0, "f"

    .line 42
    .line 43
    invoke-static {p0, v0}, Lk8/q;->e(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    const-string v0, "h"

    .line 50
    .line 51
    invoke-static {p0, v0}, Lk8/q;->e(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    const-string v0, "m"

    .line 58
    .line 59
    invoke-static {p0, v0}, Lk8/q;->e(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    :cond_2
    const-string v0, "g"

    .line 66
    .line 67
    invoke-static {p0, v0}, Lk8/q;->e(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_3

    .line 72
    .line 73
    const-string v0, "i"

    .line 74
    .line 75
    invoke-static {p0, v0}, Lk8/q;->e(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_4

    .line 80
    .line 81
    :cond_3
    const/4 p0, 0x1

    .line 82
    return p0

    .line 83
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 84
    return p0
.end method

.method public static i(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "<msgsource"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const-string v0, "<atuserlist"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const-string v0, "<msgsource>"

    .line 32
    .line 33
    const-string v1, "</msgsource>"

    .line 34
    .line 35
    :goto_0
    invoke-static {v0, p0, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_2
    const-string v0, "atuserlist"

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_4

    .line 47
    .line 48
    const-string v0, "notify@all"

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_4

    .line 55
    .line 56
    const-string v0, "announcement@all"

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    :goto_1
    return-object p0

    .line 66
    :cond_4
    :goto_2
    const-string v0, "<msgsource><atuserlist>"

    .line 67
    .line 68
    const-string v1, "</atuserlist></msgsource>"

    .line 69
    .line 70
    goto :goto_0
.end method

.method public static j(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    const-string v0, "]"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    if-nez v0, :cond_3

    .line 22
    .line 23
    const-string v0, ")"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    const-string v0, "\uff0c"

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    const-string v0, ","

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    const-string v0, ";"

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    const-string v0, "\uff1b"

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    const/16 v0, 0xa

    .line 65
    .line 66
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-lez v0, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    :cond_2
    return-object p0

    .line 81
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    add-int/lit8 v0, v0, -0x1

    .line 86
    .line 87
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    goto :goto_0
.end method

.method public static k(Ljava/lang/Object;Ljava/lang/String;)Ll8/e;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_14

    .line 6
    .line 7
    :cond_0
    const-string v1, "h"

    .line 8
    .line 9
    const-string v2, "m"

    .line 10
    .line 11
    const-string v3, "i"

    .line 12
    .line 13
    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    move v4, v2

    .line 19
    :goto_0
    const-string v5, ""

    .line 20
    .line 21
    const/4 v6, 0x3

    .line 22
    if-ge v4, v6, :cond_2

    .line 23
    .line 24
    aget-object v6, v1, v4

    .line 25
    .line 26
    invoke-static {v0, v6}, Lk8/q;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-nez v7, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move-object v6, v5

    .line 41
    :goto_1
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    goto/16 :goto_14

    .line 48
    .line 49
    :cond_3
    invoke-static {v6}, Lk8/q;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    const-string v1, "e"

    .line 54
    .line 55
    invoke-static {v0, v1}, Lk8/q;->n(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1}, Lk8/q;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-string v4, "f"

    .line 64
    .line 65
    invoke-static {v0, v4}, Lk8/q;->n(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-static {v4}, Lk8/q;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-static {v4}, Lk8/q;->f(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_4

    .line 78
    .line 79
    move-object/from16 v8, p1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    invoke-static {v1}, Lk8/q;->f(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-eqz v8, :cond_6

    .line 87
    .line 88
    :cond_5
    move-object/from16 v8, p1

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_6
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-nez v8, :cond_5

    .line 96
    .line 97
    move-object/from16 v8, p1

    .line 98
    .line 99
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    if-eqz v9, :cond_7

    .line 104
    .line 105
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    if-nez v9, :cond_7

    .line 110
    .line 111
    :goto_2
    move-object v9, v4

    .line 112
    goto :goto_4

    .line 113
    :cond_7
    :goto_3
    move-object v9, v1

    .line 114
    :goto_4
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    if-eqz v10, :cond_8

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_8
    move-object v4, v9

    .line 122
    :goto_5
    invoke-static {v4}, Lk8/q;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-nez v4, :cond_20

    .line 131
    .line 132
    invoke-static {v9}, Lk8/q;->g(Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    if-eqz v4, :cond_9

    .line 137
    .line 138
    goto/16 :goto_14

    .line 139
    .line 140
    :cond_9
    const-string v4, "fromusername"

    .line 141
    .line 142
    invoke-static {v7, v4}, Lk8/q;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    if-eqz v10, :cond_a

    .line 151
    .line 152
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    if-nez v10, :cond_a

    .line 157
    .line 158
    const-string v10, ":\n"

    .line 159
    .line 160
    invoke-virtual {v6, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    if-lez v10, :cond_a

    .line 165
    .line 166
    invoke-virtual {v6, v2, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    :cond_a
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    if-eqz v10, :cond_b

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_b
    move-object v1, v4

    .line 178
    :goto_6
    invoke-static {v1}, Lk8/q;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-static {v1}, Lk8/q;->g(Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-eqz v4, :cond_c

    .line 187
    .line 188
    goto/16 :goto_14

    .line 189
    .line 190
    :cond_c
    const-string v4, "nativeurl"

    .line 191
    .line 192
    invoke-static {v7, v4}, Lk8/q;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 197
    .line 198
    .line 199
    move-result v11

    .line 200
    if-eqz v11, :cond_d

    .line 201
    .line 202
    invoke-static {v6, v4}, Lk8/q;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    :cond_d
    const-string v4, "exclusive_recv_username"

    .line 207
    .line 208
    invoke-static {v7, v4}, Lk8/q;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    invoke-static {v7}, Lk8/q;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 217
    .line 218
    .line 219
    move-result v12

    .line 220
    if-eqz v12, :cond_e

    .line 221
    .line 222
    invoke-static {v6}, Lk8/q;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    :cond_e
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 227
    .line 228
    .line 229
    move-result v12

    .line 230
    const-string v13, "q"

    .line 231
    .line 232
    if-nez v12, :cond_10

    .line 233
    .line 234
    const-string v5, "<msgsource>"

    .line 235
    .line 236
    const-string v12, "</msgsource>"

    .line 237
    .line 238
    invoke-static {v5, v4, v12}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    :cond_f
    :goto_7
    move-object/from16 v18, v5

    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_10
    const-string v4, "p"

    .line 246
    .line 247
    invoke-static {v0, v4}, Lk8/q;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 252
    .line 253
    .line 254
    move-result v12

    .line 255
    if-nez v12, :cond_11

    .line 256
    .line 257
    invoke-static {v4}, Lk8/q;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    goto :goto_7

    .line 262
    :cond_11
    invoke-static {v0, v13}, Lk8/q;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 267
    .line 268
    .line 269
    move-result v12

    .line 270
    const-string v14, "msgsource"

    .line 271
    .line 272
    if-nez v12, :cond_12

    .line 273
    .line 274
    invoke-virtual {v4, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 275
    .line 276
    .line 277
    move-result v12

    .line 278
    if-eqz v12, :cond_12

    .line 279
    .line 280
    invoke-static {v4}, Lk8/q;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    goto :goto_7

    .line 285
    :cond_12
    const-string v20, "s"

    .line 286
    .line 287
    const-string v21, "t"

    .line 288
    .line 289
    const-string v15, "j"

    .line 290
    .line 291
    const-string v16, "k"

    .line 292
    .line 293
    const-string v17, "l"

    .line 294
    .line 295
    const-string v18, "n"

    .line 296
    .line 297
    const-string v19, "p"

    .line 298
    .line 299
    filled-new-array/range {v15 .. v21}, [Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    move v12, v2

    .line 304
    :goto_8
    const/4 v15, 0x7

    .line 305
    if-ge v12, v15, :cond_f

    .line 306
    .line 307
    aget-object v15, v4, v12

    .line 308
    .line 309
    invoke-static {v0, v15}, Lk8/q;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v15

    .line 313
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 314
    .line 315
    .line 316
    move-result v16

    .line 317
    if-nez v16, :cond_13

    .line 318
    .line 319
    invoke-virtual {v15, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 320
    .line 321
    .line 322
    move-result v16

    .line 323
    if-eqz v16, :cond_13

    .line 324
    .line 325
    move-object/from16 v18, v15

    .line 326
    .line 327
    goto :goto_9

    .line 328
    :cond_13
    add-int/lit8 v12, v12, 0x1

    .line 329
    .line 330
    goto :goto_8

    .line 331
    :goto_9
    invoke-static {v9}, Lk8/q;->f(Ljava/lang/String;)Z

    .line 332
    .line 333
    .line 334
    invoke-static {v6}, Lk8/q;->a(Ljava/lang/String;)Z

    .line 335
    .line 336
    .line 337
    move-result v12

    .line 338
    const-string v4, "g"

    .line 339
    .line 340
    invoke-static {v0, v4}, Lk8/q;->m(Ljava/lang/Object;Ljava/lang/String;)J

    .line 341
    .line 342
    .line 343
    move-result-wide v4

    .line 344
    const-wide/32 v14, 0x7fffffff

    .line 345
    .line 346
    .line 347
    cmp-long v16, v4, v14

    .line 348
    .line 349
    const-wide/32 v19, -0x80000000

    .line 350
    .line 351
    .line 352
    if-gtz v16, :cond_15

    .line 353
    .line 354
    cmp-long v16, v4, v19

    .line 355
    .line 356
    if-gez v16, :cond_14

    .line 357
    .line 358
    goto :goto_a

    .line 359
    :cond_14
    long-to-int v4, v4

    .line 360
    goto :goto_b

    .line 361
    :cond_15
    :goto_a
    move v4, v2

    .line 362
    :goto_b
    invoke-static {v0, v3}, Lk8/q;->m(Ljava/lang/Object;Ljava/lang/String;)J

    .line 363
    .line 364
    .line 365
    move-result-wide v2

    .line 366
    cmp-long v14, v2, v14

    .line 367
    .line 368
    if-gtz v14, :cond_17

    .line 369
    .line 370
    cmp-long v14, v2, v19

    .line 371
    .line 372
    if-gez v14, :cond_16

    .line 373
    .line 374
    goto :goto_c

    .line 375
    :cond_16
    long-to-int v2, v2

    .line 376
    goto :goto_d

    .line 377
    :cond_17
    :goto_c
    const/4 v2, 0x0

    .line 378
    :goto_d
    if-lez v4, :cond_18

    .line 379
    .line 380
    goto :goto_e

    .line 381
    :cond_18
    if-lez v2, :cond_19

    .line 382
    .line 383
    move v4, v2

    .line 384
    goto :goto_e

    .line 385
    :cond_19
    invoke-static {v6}, Lh/Hchat/hooks/api/model/WeChatMessage;->inferType(Ljava/lang/String;)I

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    :goto_e
    const-string v2, "o"

    .line 390
    .line 391
    invoke-static {v0, v2}, Lk8/q;->m(Ljava/lang/Object;Ljava/lang/String;)J

    .line 392
    .line 393
    .line 394
    move-result-wide v2

    .line 395
    invoke-static {v0, v13}, Lk8/q;->m(Ljava/lang/Object;Ljava/lang/String;)J

    .line 396
    .line 397
    .line 398
    move-result-wide v13

    .line 399
    const-wide/32 v15, 0x386cd300

    .line 400
    .line 401
    .line 402
    cmp-long v5, v2, v15

    .line 403
    .line 404
    const-wide v19, 0xf4865700L

    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    move-object/from16 v17, v1

    .line 410
    .line 411
    move-wide/from16 v21, v2

    .line 412
    .line 413
    const-wide/16 v1, 0x0

    .line 414
    .line 415
    if-ltz v5, :cond_1a

    .line 416
    .line 417
    cmp-long v3, v21, v19

    .line 418
    .line 419
    if-gtz v3, :cond_1a

    .line 420
    .line 421
    goto :goto_f

    .line 422
    :cond_1a
    cmp-long v3, v13, v15

    .line 423
    .line 424
    if-ltz v3, :cond_1b

    .line 425
    .line 426
    cmp-long v3, v13, v19

    .line 427
    .line 428
    if-gtz v3, :cond_1b

    .line 429
    .line 430
    move-wide/from16 v21, v13

    .line 431
    .line 432
    goto :goto_f

    .line 433
    :cond_1b
    move-wide/from16 v21, v1

    .line 434
    .line 435
    :goto_f
    cmp-long v3, v21, v1

    .line 436
    .line 437
    if-lez v3, :cond_1c

    .line 438
    .line 439
    move-wide/from16 v14, v21

    .line 440
    .line 441
    goto :goto_10

    .line 442
    :cond_1c
    move-wide v14, v1

    .line 443
    :goto_10
    const-string v3, "r"

    .line 444
    .line 445
    invoke-static {v0, v3}, Lk8/q;->m(Ljava/lang/Object;Ljava/lang/String;)J

    .line 446
    .line 447
    .line 448
    move-result-wide v19

    .line 449
    const-string v3, "u"

    .line 450
    .line 451
    move-wide/from16 v21, v1

    .line 452
    .line 453
    invoke-static {v0, v3}, Lk8/q;->m(Ljava/lang/Object;Ljava/lang/String;)J

    .line 454
    .line 455
    .line 456
    move-result-wide v1

    .line 457
    const-wide/32 v23, 0x186a0

    .line 458
    .line 459
    .line 460
    cmp-long v0, v19, v23

    .line 461
    .line 462
    if-lez v0, :cond_1d

    .line 463
    .line 464
    goto :goto_12

    .line 465
    :cond_1d
    cmp-long v0, v1, v23

    .line 466
    .line 467
    if-lez v0, :cond_1e

    .line 468
    .line 469
    move-wide/from16 v19, v1

    .line 470
    .line 471
    :goto_11
    move v13, v4

    .line 472
    goto :goto_13

    .line 473
    :cond_1e
    cmp-long v0, v19, v21

    .line 474
    .line 475
    if-lez v0, :cond_1f

    .line 476
    .line 477
    :goto_12
    goto :goto_11

    .line 478
    :cond_1f
    move v13, v4

    .line 479
    move-wide/from16 v3, v21

    .line 480
    .line 481
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 482
    .line 483
    .line 484
    move-result-wide v19

    .line 485
    :goto_13
    new-instance v5, Ll8/e;

    .line 486
    .line 487
    move-wide/from16 v25, v19

    .line 488
    .line 489
    move-object/from16 v19, v8

    .line 490
    .line 491
    move-object/from16 v8, v17

    .line 492
    .line 493
    move-wide/from16 v16, v25

    .line 494
    .line 495
    invoke-direct/range {v5 .. v19}, Ll8/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIJJLjava/lang/String;Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    return-object v5

    .line 499
    :cond_20
    :goto_14
    const/4 v0, 0x0

    .line 500
    return-object v0
.end method

.method public static l(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0, p1}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-static {p1, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    return-object p0

    .line 25
    :catchall_0
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public static m(Ljava/lang/Object;Ljava/lang/String;)J
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk8/q;->l(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/Number;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    return-wide p0

    .line 16
    :cond_0
    if-nez p0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    :try_start_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 24
    .line 25
    .line 26
    move-result-wide p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    return-wide p0

    .line 28
    :catchall_0
    :goto_0
    const-wide/16 p0, 0x0

    .line 29
    .line 30
    return-wide p0
.end method

.method public static n(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk8/q;->l(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    instance-of p1, p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    if-nez p1, :cond_3

    .line 10
    .line 11
    instance-of p1, p0, Ljava/lang/Number;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    instance-of p1, p0, Ljava/lang/CharSequence;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    const-string p1, "d"

    .line 26
    .line 27
    invoke-static {p0, p1}, Lk8/q;->l(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_2
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_3
    :goto_0
    const-string p0, ""

    .line 44
    .line 45
    return-object p0
.end method

.method public static o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lk8/q;->l(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    instance-of p1, p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    if-nez p1, :cond_2

    .line 10
    .line 11
    instance-of p1, p0, Ljava/lang/Number;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    instance-of p1, p0, Ljava/lang/CharSequence;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    const-string p1, "d"

    .line 26
    .line 27
    invoke-static {p0, p1}, Lk8/q;->l(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_2
    :goto_0
    const-string p0, ""

    .line 39
    .line 40
    return-object p0
.end method

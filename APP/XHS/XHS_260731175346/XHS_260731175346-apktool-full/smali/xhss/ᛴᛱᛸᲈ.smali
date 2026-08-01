.class public abstract Lxhss/ᛴᛱᛸᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static volatile ᛷᛵᛵᲈ:Z = true


# direct methods
.method public static final ᛱᛱᛲᲇ(Ljava/lang/reflect/AccessibleObject;)Z
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    new-instance v0, Lxhss/ᲈᛳᛱᲇ;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    move-object p0, v0

    .line 21
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 22
    .line 23
    instance-of v1, p0, Lxhss/ᲈᛳᛱᲇ;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    move-object p0, v0

    .line 28
    :cond_1
    check-cast p0, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public static final ᛷᛵᛵᲈ(Ljava/lang/reflect/Member;)Z
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/lang/reflect/AccessibleObject;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/reflect/AccessibleObject;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    :goto_0
    const/4 v0, 0x0

    .line 10
    if-eqz p0, :cond_3

    .line 11
    .line 12
    sget-boolean v1, Lxhss/ᛴᛱᛸᲈ;->ᛷᛵᛵᲈ:Z

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-static {p0}, Lxhss/ᛴᛱᛸᲈ;->ᛱᛱᛲᲇ(Ljava/lang/reflect/AccessibleObject;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    goto :goto_3

    .line 21
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/reflect/AccessibleObject;->trySetAccessible()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    new-instance v2, Lxhss/ᲈᛳᛱᲇ;

    .line 32
    .line 33
    invoke-direct {v2, v1}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object v1, v2

    .line 37
    :goto_1
    invoke-static {v1}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    sput-boolean v0, Lxhss/ᛴᛱᛸᲈ;->ᛷᛵᛵᲈ:Z

    .line 45
    .line 46
    invoke-static {p0}, Lxhss/ᛴᛱᛸᲈ;->ᛱᛱᛲᲇ(Ljava/lang/reflect/AccessibleObject;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :goto_2
    check-cast v1, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    :goto_3
    const/4 v1, 0x1

    .line 61
    if-ne p0, v1, :cond_3

    .line 62
    .line 63
    move v0, v1

    .line 64
    :cond_3
    return v0
.end method

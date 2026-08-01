.class public abstract Lc72;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:[Ljava/lang/String;

.field public static final γ:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lc72;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    const-string v0, "userId"

    .line 10
    .line 11
    const-string v1, "id"

    .line 12
    .line 13
    const-string v2, "uid"

    .line 14
    .line 15
    const-string v3, "user_id"

    .line 16
    .line 17
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lc72;->β:[Ljava/lang/String;

    .line 22
    .line 23
    const-string v0, "sec_uid"

    .line 24
    .line 25
    const-string v1, "secUid"

    .line 26
    .line 27
    const-string v2, "sec_user_id"

    .line 28
    .line 29
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lc72;->γ:[Ljava/lang/String;

    .line 34
    .line 35
    return-void
.end method

.method public static α(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v0

    .line 14
    :goto_0
    if-nez p0, :cond_1

    .line 15
    .line 16
    const-string p0, ""

    .line 17
    .line 18
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-lez v1, :cond_2

    .line 23
    .line 24
    const-string v1, "null"

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    return-object v0
.end method

.method public static β(Landroid/content/Intent;[Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_5

    .line 5
    .line 6
    :cond_0
    array-length v1, p1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_3

    .line 10
    .line 11
    aget-object v4, p1, v3

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_1

    .line 18
    :catchall_0
    move-exception v4

    .line 19
    new-instance v5, Leo1;

    .line 20
    .line 21
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    move-object v4, v5

    .line 25
    :goto_1
    instance-of v5, v4, Leo1;

    .line 26
    .line 27
    if-eqz v5, :cond_1

    .line 28
    .line 29
    move-object v4, v0

    .line 30
    :cond_1
    check-cast v4, Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v4}, Lc72;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    return-object v4

    .line 39
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 43
    .line 44
    .line 45
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    goto :goto_2

    .line 47
    :catchall_1
    move-exception p0

    .line 48
    new-instance v1, Leo1;

    .line 49
    .line 50
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    move-object p0, v1

    .line 54
    :goto_2
    instance-of v1, p0, Leo1;

    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    move-object p0, v0

    .line 59
    :cond_4
    check-cast p0, Landroid/net/Uri;

    .line 60
    .line 61
    if-nez p0, :cond_5

    .line 62
    .line 63
    goto :goto_5

    .line 64
    :cond_5
    array-length v1, p1

    .line 65
    :goto_3
    if-ge v2, v1, :cond_8

    .line 66
    .line 67
    aget-object v3, p1, v2

    .line 68
    .line 69
    :try_start_2
    invoke-virtual {p0, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 73
    goto :goto_4

    .line 74
    :catchall_2
    move-exception v3

    .line 75
    new-instance v4, Leo1;

    .line 76
    .line 77
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    move-object v3, v4

    .line 81
    :goto_4
    instance-of v4, v3, Leo1;

    .line 82
    .line 83
    if-eqz v4, :cond_6

    .line 84
    .line 85
    move-object v3, v0

    .line 86
    :cond_6
    check-cast v3, Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v3}, Lc72;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    if-eqz v3, :cond_7

    .line 93
    .line 94
    return-object v3

    .line 95
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_8
    :goto_5
    return-object v0
.end method

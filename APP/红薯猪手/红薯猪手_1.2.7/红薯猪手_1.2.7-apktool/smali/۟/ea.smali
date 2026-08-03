.class public final L۟/ea;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements L۟/x3;


# instance fields
.field public final ۥ:L۟/kb;

.field public final ۥ۟:Landroid/content/SharedPreferences$Editor;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, L۟/ea$a;->ۥ:L۟/ea$a;

    .line 5
    .line 6
    new-instance v1, L۟/kb;

    .line 7
    .line 8
    invoke-direct {v1, v0}, L۟/kb;-><init>(L۟/f3;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, L۟/ea;->ۥ:L۟/kb;

    .line 12
    .line 13
    invoke-virtual {p0}, L۟/ea;->ۥ۟ۡ()Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/16 v1, 0x9

    .line 22
    .line 23
    new-array v1, v1, [B

    .line 24
    .line 25
    fill-array-data v1, :array_0

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x6

    .line 29
    new-array v2, v2, [B

    .line 30
    .line 31
    fill-array-data v2, :array_1

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, L۟/ea;->ۥ۟:Landroid/content/SharedPreferences$Editor;

    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :array_0
    .array-data 1
        0x31t
        -0x64t
        -0x79t
        -0xdt
        0x6dt
        0x3dt
        0x7at
        -0x2at
        -0x39t
    .end array-data

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    nop

    .line 55
    :array_1
    .array-data 1
        0x54t
        -0x8t
        -0x12t
        -0x79t
        0x45t
        0x13t
    .end array-data
.end method


# virtual methods
.method public final getPath()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, L۟/l3;->ۥ:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string v0, ""

    .line 16
    .line 17
    :cond_0
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, "shared_prefs"

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v0, "com.skyhand.basexphelper.conf.xml"

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :cond_1
    const/4 v0, 0x7

    .line 49
    new-array v0, v0, [B

    .line 50
    .line 51
    fill-array-data v0, :array_0

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x6

    .line 55
    new-array v1, v1, [B

    .line 56
    .line 57
    fill-array-data v1, :array_1

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    throw v0

    .line 69
    :array_0
    .array-data 1
        -0x79t
        -0x69t
        0xft
        -0x3t
        -0x9t
        0x4et
        -0x70t
    .end array-data

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    :array_1
    .array-data 1
        -0x1ct
        -0x8t
        0x61t
        -0x77t
        -0x6et
        0x36t
    .end array-data
.end method

.method public final ۥ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x3

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    const/4 v2, 0x6

    new-array v3, v2, [B

    fill-array-data v3, :array_1

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v1, v2, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {p0}, L۟/ea;->ۥ۟ۡ()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    return-object p2

    :catch_0
    const-string p1, ""

    return-object p1

    :array_0
    .array-data 1
        -0x75t
        0x2ct
        -0x19t
    .end array-data

    :array_1
    .array-data 1
        -0x20t
        0x49t
        -0x62t
        -0x2at
        -0x53t
        0xbt
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x4at
        -0x5t
        -0x27t
    .end array-data

    :array_3
    .array-data 1
        -0x2et
        -0x62t
        -0x41t
        0x3ft
        0x34t
        -0x13t
    .end array-data
.end method

.method public final ۥ۟(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x5

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v1, v1, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-void

    :cond_1
    instance-of v0, p2, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    iget-object v0, p0, L۟/ea;->ۥ۟:Landroid/content/SharedPreferences$Editor;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :cond_2
    instance-of v0, p2, Ljava/lang/Float;

    if-eqz v0, :cond_3

    iget-object v0, p0, L۟/ea;->ۥ۟:Landroid/content/SharedPreferences$Editor;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :cond_3
    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, L۟/ea;->ۥ۟:Landroid/content/SharedPreferences$Editor;

    check-cast p2, Ljava/lang/String;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :cond_4
    instance-of v0, p2, Ljava/lang/Boolean;

    if-eqz v0, :cond_5

    iget-object v0, p0, L۟/ea;->ۥ۟:Landroid/content/SharedPreferences$Editor;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :cond_5
    instance-of v0, p2, Ljava/lang/Long;

    if-eqz v0, :cond_6

    iget-object v0, p0, L۟/ea;->ۥ۟:Landroid/content/SharedPreferences$Editor;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-interface {v0, p1, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :cond_6
    instance-of v0, p2, Ljava/util/Set;

    if-eqz v0, :cond_7

    iget-object v0, p0, L۟/ea;->ۥ۟:Landroid/content/SharedPreferences$Editor;

    check-cast p2, Ljava/util/Set;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    :cond_7
    :goto_1
    iget-object p1, p0, L۟/ea;->ۥ۟:Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void

    :array_0
    .array-data 1
        -0x4ft
        -0x53t
        -0x51t
    .end array-data

    :array_1
    .array-data 1
        -0x26t
        -0x38t
        -0x2at
        0x25t
        -0x6dt
        0x7dt
    .end array-data

    nop

    :array_2
    .array-data 1
        0x7bt
        0x40t
        -0x1t
        -0x41t
        -0x30t
    .end array-data

    nop

    :array_3
    .array-data 1
        0xdt
        0x21t
        -0x6dt
        -0x36t
        -0x4bt
        -0x5et
    .end array-data
.end method

.method public final ۥ۟۟(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    const/4 v2, 0x6

    new-array v3, v2, [B

    fill-array-data v3, :array_1

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v1, v2, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, L۟/ea;->ۥ۟ۡ()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    nop

    instance-of p1, p2, L۟/n4;

    if-nez p1, :cond_1

    return-object p2

    :cond_1
    const-string p1, "kotlin.collections.MutableSet"

    invoke-static {p1, p2}, L۟/sb;->ۥ۟(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    nop

    :array_0
    .array-data 1
        0x6et
        0x5t
        0x1ct
    .end array-data

    :array_1
    .array-data 1
        0x5t
        0x60t
        0x65t
        0x5ct
        0x38t
        -0x54t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x5at
        0x4ft
        0x31t
    .end array-data

    :array_3
    .array-data 1
        -0x3et
        0x2at
        0x57t
        -0x56t
        -0x3ft
        -0x71t
    .end array-data
.end method

.method public final ۥ۟۠(Ljava/lang/String;Z)Z
    .locals 2

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, L۟/ea;->ۥ۟ۡ()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1

    :array_0
    .array-data 1
        -0x75t
        -0x15t
        0x6bt
    .end array-data

    :array_1
    .array-data 1
        -0x20t
        -0x72t
        0x12t
        -0x37t
        0x56t
        0x61t
    .end array-data
.end method

.method public final ۥ۟ۡ()Landroid/content/SharedPreferences;
    .locals 3

    iget-object v0, p0, L۟/ea;->ۥ:L۟/kb;

    invoke-virtual {v0}, L۟/kb;->ۥ()Ljava/lang/Object;

    move-result-object v0

    const/16 v1, 0xd

    new-array v1, v1, [B

    fill-array-data v1, :array_0

    const/4 v2, 0x6

    new-array v2, v2, [B

    fill-array-data v2, :array_1

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Landroid/content/SharedPreferences;

    return-object v0

    nop

    :array_0
    .array-data 1
        0x6ft
        0x5t
        0x55t
        0x4et
        -0x5ft
        -0xet
        0x7dt
        0x5t
        0x9t
        0x36t
        -0x12t
        -0x50t
        0x21t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x8t
        0x60t
        0x21t
        0x18t
        -0x40t
        -0x62t
    .end array-data
.end method

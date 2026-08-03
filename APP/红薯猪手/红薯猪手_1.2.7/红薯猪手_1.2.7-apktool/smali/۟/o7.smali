.class public final L۟/o7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:L۟/o7;

.field public static final ۥ۟:L۟/kb;

.field public static final ۥ۟۟:Landroid/content/SharedPreferences$Editor;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L۟/o7;

    .line 2
    .line 3
    invoke-direct {v0}, L۟/o7;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L۟/o7;->ۥ:L۟/o7;

    .line 7
    .line 8
    sget-object v0, L۟/o7$a;->ۥ:L۟/o7$a;

    .line 9
    .line 10
    new-instance v1, L۟/kb;

    .line 11
    .line 12
    invoke-direct {v1, v0}, L۟/kb;-><init>(L۟/f3;)V

    .line 13
    .line 14
    .line 15
    sput-object v1, L۟/o7;->ۥ۟:L۟/kb;

    .line 16
    .line 17
    invoke-static {}, L۟/o7;->ۥ۟۟()Landroid/content/SharedPreferences;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/16 v1, 0x9

    .line 26
    .line 27
    new-array v1, v1, [B

    .line 28
    .line 29
    fill-array-data v1, :array_0

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x6

    .line 33
    new-array v2, v2, [B

    .line 34
    .line 35
    fill-array-data v2, :array_1

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sput-object v0, L۟/o7;->ۥ۟۟:Landroid/content/SharedPreferences$Editor;

    .line 46
    .line 47
    return-void

    .line 48
    nop

    .line 49
    :array_0
    .array-data 1
        -0xft
        0x42t
        0x14t
        0x30t
        -0xet
        -0x6ft
        -0x46t
        0x8t
        0x54t
    .end array-data

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    nop

    .line 59
    :array_1
    .array-data 1
        -0x6ct
        0x26t
        0x7dt
        0x44t
        -0x26t
        -0x41t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Ljava/lang/String;Z)Z
    .locals 2

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, L۟/o7;->ۥ۟۟()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0

    :array_0
    .array-data 1
        -0x42t
        0x1at
        0x33t
    .end array-data

    :array_1
    .array-data 1
        -0x2bt
        0x7ft
        0x4at
        -0xdt
        -0x9t
        0x53t
    .end array-data
.end method

.method public static ۥ۟(Ljava/lang/String;)I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x3

    new-array v1, v1, [B

    fill-array-data v1, :array_0

    const/4 v2, 0x6

    new-array v2, v2, [B

    fill-array-data v2, :array_1

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, L۟/o7;->ۥ۟۟()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1, p0, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p0

    return p0

    nop

    :array_0
    .array-data 1
        -0x6ft
        0x17t
        0x37t
    .end array-data

    :array_1
    .array-data 1
        -0x6t
        0x72t
        0x4et
        0x3bt
        -0x43t
        -0x7ft
    .end array-data
.end method

.method public static ۥ۟۟()Landroid/content/SharedPreferences;
    .locals 3

    sget-object v0, L۟/o7;->ۥ۟:L۟/kb;

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
        -0x35t
        0x17t
        -0x36t
        -0x27t
        0xbt
        0x32t
        -0x27t
        0x17t
        -0x6at
        -0x5ft
        0x44t
        0x70t
        -0x7bt
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x54t
        0x72t
        -0x42t
        -0x71t
        0x6at
        0x5et
    .end array-data
.end method

.method public static ۥ۟۠(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x3

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    const/4 v2, 0x6

    new-array v3, v2, [B

    fill-array-data v3, :array_1

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v1, v2, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const-string v0, ""

    invoke-static {}, L۟/o7;->ۥ۟۟()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1, p0, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0

    nop

    :array_0
    .array-data 1
        0x28t
        -0x7ct
        0x69t
    .end array-data

    :array_1
    .array-data 1
        0x43t
        -0x1ft
        0x10t
        -0x3at
        0x79t
        0x2bt
    .end array-data

    nop

    :array_2
    .array-data 1
        0x3t
        0x39t
        0x27t
    .end array-data

    :array_3
    .array-data 1
        0x67t
        0x5ct
        0x41t
        -0x1bt
        -0xft
        0x5bt
    .end array-data
.end method

.method public static ۥ۟ۡ(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, L۟/o7;->ۥ۟۟:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void

    nop

    :array_0
    .array-data 1
        0x1at
        -0x17t
        -0x5ft
    .end array-data

    :array_1
    .array-data 1
        0x71t
        -0x74t
        -0x28t
        -0x7ft
        -0x48t
        -0x51t
    .end array-data
.end method

.method public static ۥۣ۟(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4

    const/4 v0, 0x3

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    const/4 v2, 0x6

    new-array v3, v2, [B

    fill-array-data v3, :array_1

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v1, v2, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    sget-object v0, L۟/o7;->ۥ۟۟:Landroid/content/SharedPreferences$Editor;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_1

    sget-object v0, L۟/o7;->ۥ۟۟:Landroid/content/SharedPreferences$Editor;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_2

    sget-object v0, L۟/o7;->ۥ۟۟:Landroid/content/SharedPreferences$Editor;

    check-cast p1, Ljava/lang/String;

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_2
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    sget-object v0, L۟/o7;->ۥ۟۟:Landroid/content/SharedPreferences$Editor;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_3
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_4

    sget-object v0, L۟/o7;->ۥ۟۟:Landroid/content/SharedPreferences$Editor;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-interface {v0, p0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_4
    instance-of v0, p1, Ljava/util/Set;

    if-eqz v0, :cond_5

    sget-object v0, L۟/o7;->ۥ۟۟:Landroid/content/SharedPreferences$Editor;

    check-cast p1, Ljava/util/Set;

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    :cond_5
    :goto_0
    sget-object p0, L۟/o7;->ۥ۟۟:Landroid/content/SharedPreferences$Editor;

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void

    nop

    :array_0
    .array-data 1
        -0x11t
        -0x5t
        -0x51t
    .end array-data

    :array_1
    .array-data 1
        -0x7ct
        -0x62t
        -0x2at
        0x4at
        -0x4et
        0x7dt
    .end array-data

    nop

    :array_2
    .array-data 1
        0x7bt
        0x60t
        -0x47t
    .end array-data

    :array_3
    .array-data 1
        0x1at
        0xet
        -0x40t
        -0x4t
        -0x31t
        -0x28t
    .end array-data
.end method


# virtual methods
.method public final ۥ۟ۢ(Ljava/lang/String;)V
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

    sget-object v0, L۟/o7;->ۥ۟۟:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    return-void

    nop

    :array_0
    .array-data 1
        -0x73t
        0x59t
        -0xdt
    .end array-data

    :array_1
    .array-data 1
        -0x1at
        0x3ct
        -0x76t
        -0x4et
        -0x13t
        -0x29t
    .end array-data
.end method

.method public final ۥ۟ۤ(Ljava/lang/String;Ljava/lang/String;)V
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

    instance-of v0, p2, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    sget-object v0, L۟/o7;->ۥ۟۟:Landroid/content/SharedPreferences$Editor;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_0
    instance-of v0, p2, Ljava/lang/Float;

    if-eqz v0, :cond_1

    sget-object v0, L۟/o7;->ۥ۟۟:Landroid/content/SharedPreferences$Editor;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_1
    sget-object v0, L۟/o7;->ۥ۟۟:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :goto_0
    return-void

    :array_0
    .array-data 1
        0x78t
        -0x38t
        0x8t
    .end array-data

    :array_1
    .array-data 1
        0x13t
        -0x53t
        0x71t
        -0x3t
        -0x42t
        0x1at
    .end array-data

    nop

    :array_2
    .array-data 1
        -0xbt
        0x55t
        0x3et
    .end array-data

    :array_3
    .array-data 1
        -0x6ct
        0x3bt
        0x47t
        0x75t
        -0x2bt
        0x77t
    .end array-data
.end method

.class public abstract Lg1;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:I

.field public static volatile b:Ljava/lang/String;

.field public static volatile c:I

.field public static volatile d:Ljava/lang/String;

.field public static volatile e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0x5a

    .line 2
    .line 3
    const/16 v1, 0x66

    .line 4
    .line 5
    const/16 v2, 0xb0

    .line 6
    .line 7
    const/16 v3, 0x55

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sput v0, Lg1;->a:I

    .line 14
    .line 15
    const-string v1, ""

    .line 16
    .line 17
    sput-object v1, Lg1;->b:Ljava/lang/String;

    .line 18
    .line 19
    sput v0, Lg1;->c:I

    .line 20
    .line 21
    sput-object v1, Lg1;->d:Ljava/lang/String;

    .line 22
    .line 23
    const-string v0, "ah:mm"

    .line 24
    .line 25
    sput-object v0, Lg1;->e:Ljava/lang/String;

    .line 26
    .line 27
    return-void
.end method

.method public static a()I
    .locals 3

    .line 1
    const-string v0, "chat_message_corner_time_color"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/mr/elaris/HookEntry;->runtimeString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v1, v0

    .line 13
    :goto_0
    sget-object v0, Lg1;->b:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    sget v0, Lg1;->c:I

    .line 22
    .line 23
    return v0

    .line 24
    :cond_1
    sget v0, Lg1;->a:I

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    :catchall_0
    :goto_1
    sput v0, Lg1;->c:I

    .line 46
    .line 47
    sput-object v1, Lg1;->b:Ljava/lang/String;

    .line 48
    .line 49
    return v0
.end method

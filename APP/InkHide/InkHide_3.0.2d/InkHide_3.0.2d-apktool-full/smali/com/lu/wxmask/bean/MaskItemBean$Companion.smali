.class public final Lcom/lu/wxmask/bean/MaskItemBean$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lu/wxmask/bean/MaskItemBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LN0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/lu/wxmask/bean/MaskItemBean$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson(Ljava/lang/String;)Lcom/lu/wxmask/bean/MaskItemBean;
    .locals 10

    .line 1
    const-string v0, "jsonText"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catch_0
    new-instance v0, Lorg/json/JSONObject;

    .line 13
    .line 14
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 15
    .line 16
    .line 17
    :goto_0
    new-instance v1, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 18
    .line 19
    const-string p1, "maskId"

    .line 20
    .line 21
    const-string v2, ""

    .line 22
    .line 23
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v3, "optString(...)"

    .line 28
    .line 29
    invoke-static {p1, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v4, "tagName"

    .line 33
    .line 34
    invoke-virtual {v0, v4, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-static {v4, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v5, "tipMode"

    .line 42
    .line 43
    const/16 v6, 0x2766

    .line 44
    .line 45
    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const-string v6, "tipData"

    .line 50
    .line 51
    const-string v7, "{}"

    .line 52
    .line 53
    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    sget-object v7, Lg0/a;->a:LT/l;

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v8, La0/a;

    .line 63
    .line 64
    const-class v9, LT/r;

    .line 65
    .line 66
    invoke-direct {v8, v9}, La0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v7, v6, v8}, LT/l;->c(Ljava/lang/String;La0/a;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-static {v9}, LV/d;->k(Ljava/lang/Class;)Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v7, v6}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    check-cast v6, LT/o;

    .line 82
    .line 83
    const-string v7, "mapId"

    .line 84
    .line 85
    const-string v8, "gh_e087bb5b95e6"

    .line 86
    .line 87
    invoke-virtual {v0, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-static {v7, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const-string v8, "avatarUrl"

    .line 95
    .line 96
    invoke-virtual {v0, v8, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    move-object v2, p1

    .line 104
    move-object v3, v4

    .line 105
    move v4, v5

    .line 106
    move-object v5, v6

    .line 107
    move-object v6, v7

    .line 108
    move-object v7, v0

    .line 109
    invoke-direct/range {v1 .. v7}, Lcom/lu/wxmask/bean/MaskItemBean;-><init>(Ljava/lang/String;Ljava/lang/String;ILT/o;Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-object v1
.end method

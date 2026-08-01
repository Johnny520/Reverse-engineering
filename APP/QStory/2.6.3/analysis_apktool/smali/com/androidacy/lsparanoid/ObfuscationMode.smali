.class public final enum Lcom/androidacy/lsparanoid/ObfuscationMode;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/androidacy/lsparanoid/ObfuscationMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/androidacy/lsparanoid/ObfuscationMode;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u82cf\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf",
        "BASE64",
        "HEX",
        "BYTES",
        "CUSTOM",
        "core"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

.field private static final synthetic $VALUES:[Lcom/androidacy/lsparanoid/ObfuscationMode;

.field public static final enum BASE64:Lcom/androidacy/lsparanoid/ObfuscationMode;

.field public static final enum BYTES:Lcom/androidacy/lsparanoid/ObfuscationMode;

.field public static final enum CUSTOM:Lcom/androidacy/lsparanoid/ObfuscationMode;

.field public static final Companion:L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲兰苏;

.field public static final enum HEX:Lcom/androidacy/lsparanoid/ObfuscationMode;


# direct methods
.method private static final synthetic $values()[Lcom/androidacy/lsparanoid/ObfuscationMode;
    .locals 4

    .line 1
    sget-object v0, Lcom/androidacy/lsparanoid/ObfuscationMode;->BASE64:Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 2
    .line 3
    sget-object v1, Lcom/androidacy/lsparanoid/ObfuscationMode;->HEX:Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 4
    .line 5
    sget-object v2, Lcom/androidacy/lsparanoid/ObfuscationMode;->BYTES:Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 6
    .line 7
    sget-object v3, Lcom/androidacy/lsparanoid/ObfuscationMode;->CUSTOM:Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 2
    .line 3
    const-string v1, "BASE64"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/androidacy/lsparanoid/ObfuscationMode;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/androidacy/lsparanoid/ObfuscationMode;->BASE64:Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 10
    .line 11
    new-instance v0, Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 12
    .line 13
    const-string v1, "HEX"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/androidacy/lsparanoid/ObfuscationMode;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/androidacy/lsparanoid/ObfuscationMode;->HEX:Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 20
    .line 21
    new-instance v0, Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 22
    .line 23
    const-string v1, "BYTES"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/androidacy/lsparanoid/ObfuscationMode;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/androidacy/lsparanoid/ObfuscationMode;->BYTES:Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 30
    .line 31
    new-instance v0, Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 32
    .line 33
    const-string v1, "CUSTOM"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lcom/androidacy/lsparanoid/ObfuscationMode;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/androidacy/lsparanoid/ObfuscationMode;->CUSTOM:Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 40
    .line 41
    invoke-static {}, Lcom/androidacy/lsparanoid/ObfuscationMode;->$values()[Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lcom/androidacy/lsparanoid/ObfuscationMode;->$VALUES:[Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lcom/androidacy/lsparanoid/ObfuscationMode;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 52
    .line 53
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲兰苏;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    sput-object v0, Lcom/androidacy/lsparanoid/ObfuscationMode;->Companion:L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲兰苏;

    .line 59
    .line 60
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final fromString(Ljava/lang/String;)Lcom/androidacy/lsparanoid/ObfuscationMode;
    .locals 2

    .line 1
    sget-object v0, Lcom/androidacy/lsparanoid/ObfuscationMode;->Companion:L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    sparse-switch v1, :sswitch_data_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :sswitch_0
    const-string v1, "CUSTOM"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    sget-object p0, Lcom/androidacy/lsparanoid/ObfuscationMode;->CUSTOM:Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 35
    .line 36
    return-object p0

    .line 37
    :sswitch_1
    const-string v1, "BASE64"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    sget-object p0, Lcom/androidacy/lsparanoid/ObfuscationMode;->BASE64:Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 46
    .line 47
    return-object p0

    .line 48
    :sswitch_2
    const-string v1, "BYTES"

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    sget-object p0, Lcom/androidacy/lsparanoid/ObfuscationMode;->BYTES:Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 57
    .line 58
    return-object p0

    .line 59
    :sswitch_3
    const-string v1, "HEX"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    sget-object p0, Lcom/androidacy/lsparanoid/ObfuscationMode;->HEX:Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_0
    :goto_0
    const-string v0, "Unknown obfuscation mode: \'"

    .line 71
    .line 72
    const-string v1, "\'. Supported modes: bytes, base64, hex, custom"

    .line 73
    .line 74
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const/4 p0, 0x0

    .line 82
    return-object p0

    .line 83
    :sswitch_data_0
    .sparse-switch
        0x116fb -> :sswitch_3
        0x3cbc84b -> :sswitch_2
        0x745a954f -> :sswitch_1
        0x77297f71 -> :sswitch_0
    .end sparse-switch
.end method

.method public static getEntries()Lkotlin/enums/飘花落叶言子楪世苏哲兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/androidacy/lsparanoid/ObfuscationMode;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/androidacy/lsparanoid/ObfuscationMode;
    .locals 1

    .line 1
    const-class v0, Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/androidacy/lsparanoid/ObfuscationMode;
    .locals 1

    .line 1
    sget-object v0, Lcom/androidacy/lsparanoid/ObfuscationMode;->$VALUES:[Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/androidacy/lsparanoid/ObfuscationMode;

    .line 8
    .line 9
    return-object v0
.end method

.class final synthetic Lio/ktor/client/plugins/cookies/HttpCookiesKt$renderClientCookies$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lio/ktor/client/plugins/cookies/HttpCookiesKt$renderClientCookies$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/ktor/client/plugins/cookies/HttpCookiesKt$renderClientCookies$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/ktor/client/plugins/cookies/HttpCookiesKt$renderClientCookies$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/ktor/client/plugins/cookies/HttpCookiesKt$renderClientCookies$1;->INSTANCE:Lio/ktor/client/plugins/cookies/HttpCookiesKt$renderClientCookies$1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const-string v4, "renderCookieHeader(Lio/ktor/http/Cookie;)Ljava/lang/String;"

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    const/4 v1, 0x1

    .line 5
    const-class v2, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    const-string v3, "renderCookieHeader"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 153
    check-cast p1, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏哲兰世;

    invoke-virtual {p0, p1}, Lio/ktor/client/plugins/cookies/HttpCookiesKt$renderClientCookies$1;->invoke(L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏哲兰世;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏哲兰世;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/text/Regex;

    .line 5
    .line 6
    new-instance p0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x3d

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 22
    .line 23
    iget-object p1, p1, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Lio/ktor/http/CookieEncoding;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v1, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:[I

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    aget p1, v1, p1

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    if-eq p1, v1, :cond_6

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x2

    .line 45
    if-eq p1, v4, :cond_2

    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    if-eq p1, v4, :cond_1

    .line 49
    .line 50
    const/4 v3, 0x4

    .line 51
    if-ne p1, v3, :cond_0

    .line 52
    .line 53
    invoke-static {v0, v1}, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;Z)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    goto :goto_2

    .line 58
    :cond_0
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 59
    .line 60
    .line 61
    return-object v2

    .line 62
    :cond_1
    sget p1, Lio/ktor/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 63
    .line 64
    new-instance p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    const/16 v1, 0xe

    .line 70
    .line 71
    invoke-static {p1, v0, v3, v1}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lkotlinx/io/飘花落叶言子楪世苏哲兰;Ljava/lang/CharSequence;II)V

    .line 72
    .line 73
    .line 74
    const/4 v0, -0x1

    .line 75
    invoke-static {p1, v0}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lkotlinx/io/飘花落叶言子楪苏兰世哲;I)[B

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, Lio/ktor/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([B)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    goto :goto_2

    .line 84
    :cond_2
    const/16 p1, 0x22

    .line 85
    .line 86
    invoke-static {v0, p1}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏世楪哲兰(Ljava/lang/CharSequence;C)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_5

    .line 91
    .line 92
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-ge v3, v1, :cond_6

    .line 97
    .line 98
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-static {v1}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏哲楪兰(C)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-nez v2, :cond_4

    .line 107
    .line 108
    const/16 v2, 0x20

    .line 109
    .line 110
    invoke-static {v1, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(II)I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-ltz v2, :cond_4

    .line 115
    .line 116
    sget-object v2, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/util/Set;

    .line 117
    .line 118
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_3

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_4
    :goto_1
    const-string v1, "\""

    .line 133
    .line 134
    invoke-static {p1, v1, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    goto :goto_2

    .line 139
    :cond_5
    const-string p0, "The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode"

    .line 140
    .line 141
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-object v2

    .line 145
    :cond_6
    :goto_2
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0
.end method

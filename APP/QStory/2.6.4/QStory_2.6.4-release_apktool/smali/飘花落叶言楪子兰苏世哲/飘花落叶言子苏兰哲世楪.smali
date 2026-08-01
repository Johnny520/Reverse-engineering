.class public final L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰哲世楪;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰哲世楪;

.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰哲世楪;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰哲世楪;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰哲世楪;

    .line 8
    .line 9
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰哲世楪;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰哲世楪;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰哲世楪;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final 飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 9
    .line 10
    .line 11
    goto/16 :goto_1

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p3, "java.util.regex.Pattern"

    .line 22
    .line 23
    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-nez p3, :cond_7

    .line 28
    .line 29
    const-string p3, "net.sf.json.JSONNull"

    .line 30
    .line 31
    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    if-nez p3, :cond_6

    .line 36
    .line 37
    const-string p3, "java.net.Inet6Address"

    .line 38
    .line 39
    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    if-nez p3, :cond_5

    .line 44
    .line 45
    const-string p3, "com.fasterxml.jackson.databind.node.ArrayNode"

    .line 46
    .line 47
    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    if-nez p3, :cond_3

    .line 52
    .line 53
    const-string p3, "java.net.Inet4Address"

    .line 54
    .line 55
    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p3

    .line 59
    if-nez p3, :cond_5

    .line 60
    .line 61
    const-string p3, "java.text.SimpleDateFormat"

    .line 62
    .line 63
    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p3

    .line 67
    if-nez p3, :cond_2

    .line 68
    .line 69
    const-string p3, "java.net.InetSocketAddress"

    .line 70
    .line 71
    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    if-eqz p3, :cond_1

    .line 76
    .line 77
    check-cast p2, Ljava/net/InetSocketAddress;

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪哲世苏()V

    .line 80
    .line 81
    .line 82
    const-string p0, "address"

    .line 83
    .line 84
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏哲世楪()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪哲苏(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    const-string p0, "port"

    .line 98
    .line 99
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏哲世楪()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getPort()I

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世哲兰()V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_1
    const-string p1, "not support class : "

    .line 117
    .line 118
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    check-cast p2, Ljava/text/SimpleDateFormat;

    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    goto :goto_0

    .line 133
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    iget-boolean p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲兰世苏:Z

    .line 138
    .line 139
    if-eqz p2, :cond_4

    .line 140
    .line 141
    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 142
    .line 143
    invoke-virtual {p0, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世哲苏兰子([B)V

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_4
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世哲苏子兰(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_5
    check-cast p2, Ljava/net/InetAddress;

    .line 156
    .line 157
    invoke-virtual {p2}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    goto :goto_0

    .line 162
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_7
    check-cast p2, Ljava/util/regex/Pattern;

    .line 167
    .line 168
    invoke-virtual {p2}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    :goto_0
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    :goto_1
    :pswitch_0
    return-void

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

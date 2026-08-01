.class public Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;
.super Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/serializers/DefaultSerializers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LocaleSerializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer<",
        "Ljava/util/Locale;",
        ">;"
    }
.end annotation


# static fields
.field public static final SPAIN:Ljava/util/Locale;

.field public static final SPANISH:Ljava/util/Locale;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/Locale;

    .line 2
    .line 3
    const-string v1, "es"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->SPANISH:Ljava/util/Locale;

    .line 11
    .line 12
    new-instance v0, Ljava/util/Locale;

    .line 13
    .line 14
    const-string v3, "ES"

    .line 15
    .line 16
    invoke-direct {v0, v1, v3, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->SPAIN:Ljava/util/Locale;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/util/Locale;->getVariant()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return p0
.end method


# virtual methods
.method public create(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Locale;
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 13
    .line 14
    if-eq p0, v0, :cond_1

    .line 15
    .line 16
    invoke-static {v0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    sget-object p0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 24
    .line 25
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    sget-object p0, Ljava/util/Locale;->GERMAN:Ljava/util/Locale;

    .line 33
    .line 34
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_3
    sget-object p0, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->SPANISH:Ljava/util/Locale;

    .line 42
    .line 43
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_4
    sget-object p0, Ljava/util/Locale;->FRENCH:Ljava/util/Locale;

    .line 51
    .line 52
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_5

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_5
    sget-object p0, Ljava/util/Locale;->ITALIAN:Ljava/util/Locale;

    .line 60
    .line 61
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_6

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_6
    sget-object p0, Ljava/util/Locale;->JAPANESE:Ljava/util/Locale;

    .line 69
    .line 70
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_7

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_7
    sget-object p0, Ljava/util/Locale;->KOREAN:Ljava/util/Locale;

    .line 78
    .line 79
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_8

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_8
    sget-object p0, Ljava/util/Locale;->SIMPLIFIED_CHINESE:Ljava/util/Locale;

    .line 87
    .line 88
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_9

    .line 93
    .line 94
    return-object p0

    .line 95
    :cond_9
    sget-object p0, Ljava/util/Locale;->CHINESE:Ljava/util/Locale;

    .line 96
    .line 97
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_a

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_a
    sget-object p0, Ljava/util/Locale;->TRADITIONAL_CHINESE:Ljava/util/Locale;

    .line 105
    .line 106
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_b

    .line 111
    .line 112
    return-object p0

    .line 113
    :cond_b
    sget-object p0, Ljava/util/Locale;->UK:Ljava/util/Locale;

    .line 114
    .line 115
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_c

    .line 120
    .line 121
    return-object p0

    .line 122
    :cond_c
    sget-object p0, Ljava/util/Locale;->GERMANY:Ljava/util/Locale;

    .line 123
    .line 124
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_d

    .line 129
    .line 130
    return-object p0

    .line 131
    :cond_d
    sget-object p0, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->SPAIN:Ljava/util/Locale;

    .line 132
    .line 133
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_e

    .line 138
    .line 139
    return-object p0

    .line 140
    :cond_e
    sget-object p0, Ljava/util/Locale;->FRANCE:Ljava/util/Locale;

    .line 141
    .line 142
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_f

    .line 147
    .line 148
    return-object p0

    .line 149
    :cond_f
    sget-object p0, Ljava/util/Locale;->ITALY:Ljava/util/Locale;

    .line 150
    .line 151
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_10

    .line 156
    .line 157
    return-object p0

    .line 158
    :cond_10
    sget-object p0, Ljava/util/Locale;->JAPAN:Ljava/util/Locale;

    .line 159
    .line 160
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_11

    .line 165
    .line 166
    return-object p0

    .line 167
    :cond_11
    sget-object p0, Ljava/util/Locale;->KOREA:Ljava/util/Locale;

    .line 168
    .line 169
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_12

    .line 174
    .line 175
    return-object p0

    .line 176
    :cond_12
    sget-object p0, Ljava/util/Locale;->CANADA:Ljava/util/Locale;

    .line 177
    .line 178
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_13

    .line 183
    .line 184
    return-object p0

    .line 185
    :cond_13
    sget-object p0, Ljava/util/Locale;->CANADA_FRENCH:Ljava/util/Locale;

    .line 186
    .line 187
    invoke-static {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->isSameLocale(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_14

    .line 192
    .line 193
    return-object p0

    .line 194
    :cond_14
    new-instance p0, Ljava/util/Locale;

    .line 195
    .line 196
    invoke-direct {p0, p1, p2, p3}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    return-object p0
.end method

.method public bridge synthetic read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 18
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/util/Locale;

    move-result-object p0

    return-object p0
.end method

.method public read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/util/Locale;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "Lcom/esotericsoftware/kryo/io/Input;",
            "Ljava/lang/Class<",
            "+",
            "Ljava/util/Locale;",
            ">;)",
            "Ljava/util/Locale;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/esotericsoftware/kryo/io/Input;->readString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p2}, Lcom/esotericsoftware/kryo/io/Input;->readString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-virtual {p2}, Lcom/esotericsoftware/kryo/io/Input;->readString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p0, p1, p3, p2}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->create(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Locale;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public bridge synthetic write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 0

    .line 23
    check-cast p3, Ljava/util/Locale;

    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Locale;)V

    return-void
.end method

.method public write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Locale;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2, p0}, Lcom/esotericsoftware/kryo/io/Output;->writeAscii(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p2, p0}, Lcom/esotericsoftware/kryo/io/Output;->writeAscii(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/util/Locale;->getVariant()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p2, p0}, Lcom/esotericsoftware/kryo/io/Output;->writeString(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

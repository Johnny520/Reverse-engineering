.class public final Lbsh/CollectionManager;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field private static final manager:Lbsh/CollectionManager;

.field private static final unicodeBlockStarts:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lbsh/CollectionManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lbsh/CollectionManager;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbsh/CollectionManager;->manager:Lbsh/CollectionManager;

    .line 7
    .line 8
    const/16 v0, 0x119

    .line 9
    .line 10
    new-array v0, v0, [I

    .line 11
    .line 12
    fill-array-data v0, :array_0

    .line 13
    .line 14
    .line 15
    sput-object v0, Lbsh/CollectionManager;->unicodeBlockStarts:[I

    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :array_0
    .array-data 4
        0x30
        0x3a
        0x41
        0x5b
        0x61
        0x7b
        0x81
        0x100
        0x180
        0x250
        0x2b0
        0x300
        0x370
        0x400
        0x531
        0x591
        0x600
        0x700
        0x750
        0x780
        0x7c0
        0x800
        0x840
        0x860
        0x8a0
        0x900
        0x980
        0xa01
        0xa81
        0xb01
        0xb82
        0xc00
        0xc80
        0xd00
        0xd82
        0xe00
        0xe80
        0xf00
        0x1000
        0x8d0
        0x1100
        0x1200
        0x13a0
        0x1400
        0x1680
        0x16a0
        0x1700
        0x1720
        0x1740
        0x1760
        0x1780
        0x1800
        0x18b0
        0x1900
        0x1950
        0x1980
        0x19e0
        0x1a00
        0x1a20
        0x1ab0
        0x1b00
        0x1b80
        0x1bc0
        0x1c00
        0x1c50
        0x1c80
        0x1cc0
        0x1cd0
        0x1d00
        0x1dc0
        0x1e00
        0x1f00
        0x2000
        0x2070
        0x20a0
        0x20d0
        0x2100
        0x2150
        0x2190
        0x2200
        0x2300
        0x2400
        0x2440
        0x2460
        0x2500
        0x2580
        0x25a0
        0x2600
        0x2700
        0x27c0
        0x27f0
        0x2800
        0x2900
        0x2980
        0x2a00
        0x2b00
        0x2c00
        0x2c60
        0x2c80
        0x2d00
        0x2d30
        0x2d80
        0x2de0
        0x2e00
        0x2e80
        0x2f00
        0x2ff0
        0x3000
        0x3040
        0x30a0
        0x3100
        0x3130
        0x3190
        0x31a0
        0x31c0
        0x31f0
        0x3200
        0x3300
        0x3400
        0x4dc0
        0x4e00
        0xa000
        0xa490
        0xa4d0
        0xa500
        0xa640
        0xa6a0
        0xa700
        0xa720
        0xa800
        0xa830
        0xa840
        0xa880
        0xa8e0
        0xa900
        0xa930
        0xa960
        0xa980
        0xa9e0
        0xaa00
        0xaa60
        0xaa80
        0xaae0
        0xab00
        0xab30
        0xab70
        0xabc0
        0xac00
        0xd7b0
        0xd800
        0xdc00
        0xe000
        0xf900
        0xfb00
        0xfb50
        0xfe00
        0xfe10
        0xfe20
        0xfe30
        0xfe50
        0xfe70
        0xff00
        0xfff0
        0x10000
        0x10080
        0x10100
        0x10140
        0x10190
        0x101d0
        0x10280
        0x102a0
        0x102e0
        0x10300
        0x10330
        0x10350
        0x10380
        0x103a0
        0x10400
        0x10450
        0x10480
        0x104b0
        0x10500
        0x10530
        0x10600
        0x10800
        0x10840
        0x10860
        0x10880
        0x108e0
        0x10900
        0x10920
        0x10980
        0x109a0
        0x10a00
        0x10a60
        0x10a80
        0x10ac0
        0x10b00
        0x10b40
        0x10b60
        0x10b80
        0x10c00
        0x10c80
        0x10e60
        0x11000
        0x11080
        0x110d0
        0x11100
        0x11150
        0x11180
        0x111e0
        0x11200
        0x11280
        0x112b0
        0x11300
        0x11400
        0x11480
        0x11580
        0x11600
        0x11660
        0x11680
        0x11700    # 1.00086E-40f
        0x118a0
        0x11a00
        0x11a50
        0x11ac0
        0x11c00
        0x11c70
        0x11d00
        0x12000
        0x12400
        0x12480
        0x13000
        0x14400
        0x16800
        0x16a40
        0x16ad0
        0x16b00
        0x16f00
        0x16fe0
        0x17000
        0x18800
        0x1b000
        0x1b100
        0x1b170
        0x1bc00
        0x1bca0
        0x1d000
        0x1d100
        0x1d200
        0x1d300
        0x1d360
        0x1d400
        0x1d800
        0x1e000
        0x1e800
        0x1e900
        0x1ee00
        0x1f000
        0x1f030
        0x1f0a0
        0x1f100
        0x1f200
        0x1f300
        0x1f600
        0x1f650
        0x1f680
        0x1f700
        0x1f780
        0x1f800
        0x1f900
        0x20000
        0x2a700
        0x2b740
        0x2b820
        0x2ceb0
        0x2f800
        0xe0000
        0xe0100
        0xf0000
        0x100000
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(II)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lbsh/CollectionManager;->lambda$getBshIterator$0(II)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private arrayIt(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Iterator<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lbsh/CollectionManager$2;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lbsh/CollectionManager$2;-><init>(Lbsh/CollectionManager;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private emptyIt()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lbsh/CollectionManager$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lbsh/CollectionManager$1;-><init>(Lbsh/CollectionManager;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static declared-synchronized getCollectionManager()Lbsh/CollectionManager;
    .locals 2

    .line 1
    const-class v0, Lbsh/CollectionManager;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lbsh/CollectionManager;->manager:Lbsh/CollectionManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    throw v1
.end method

.method private static synthetic lambda$getBshIterator$0(II)I
    .locals 0

    .line 1
    sub-int/2addr p0, p1

    .line 2
    return p0
.end method

.method private reflectNames(Ljava/lang/Object;)Ljava/util/stream/Stream;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/stream/Stream<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, p1, Ljava/lang/Class;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Ljava/lang/Class;

    .line 11
    .line 12
    :cond_0
    instance-of v1, p1, Lbsh/ClassIdentifier;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    check-cast p1, Lbsh/ClassIdentifier;

    .line 17
    .line 18
    invoke-virtual {p1}, Lbsh/ClassIdentifier;->getTargetClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_1
    invoke-static {v0}, Lbsh/Reflect;->isGeneratedClass(Ljava/lang/Class;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const-string v1, "}"

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    invoke-static {v0}, Lbsh/StringUtil;->classString(Ljava/lang/Class;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, Ljava/util/stream/Stream;->of(Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {v0}, Lbsh/Reflect;->getDeclaredVariables(Ljava/lang/Class;)[Lbsh/Variable;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {v2}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, Lbsh/b;

    .line 47
    .line 48
    const/4 v4, 0x4

    .line 49
    invoke-direct {v3, v4}, Lbsh/b;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v2, v3}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-instance v3, Lbsh/b;

    .line 57
    .line 58
    const/4 v4, 0x5

    .line 59
    invoke-direct {v3, v4}, Lbsh/b;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v2, v3}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {v0}, Lbsh/Reflect;->getDeclaredMethods(Ljava/lang/Class;)[Lbsh/BshMethod;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    new-instance v3, Lbsh/b;

    .line 75
    .line 76
    const/4 v4, 0x6

    .line 77
    invoke-direct {v3, v4}, Lbsh/b;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v0, v3}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-instance v3, Lbsh/b;

    .line 85
    .line 86
    const/4 v4, 0x5

    .line 87
    invoke-direct {v3, v4}, Lbsh/b;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v0, v3}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v2, v0}, Ljava/util/stream/Stream;->concat(Ljava/util/stream/Stream;Ljava/util/stream/Stream;)Ljava/util/stream/Stream;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {p1, v0}, Ljava/util/stream/Stream;->concat(Ljava/util/stream/Stream;Ljava/util/stream/Stream;)Ljava/util/stream/Stream;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-static {v1}, Ljava/util/stream/Stream;->of(Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {p1, v0}, Ljava/util/stream/Stream;->concat(Ljava/util/stream/Stream;Ljava/util/stream/Stream;)Ljava/util/stream/Stream;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    return-object p1

    .line 111
    :cond_2
    invoke-static {v0}, Lbsh/StringUtil;->classString(Ljava/lang/Class;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-static {p1}, Ljava/util/stream/Stream;->of(Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-static {v2}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    new-instance v3, Lbsh/b;

    .line 128
    .line 129
    const/4 v4, 0x7

    .line 130
    invoke-direct {v3, v4}, Lbsh/b;-><init>(I)V

    .line 131
    .line 132
    .line 133
    invoke-interface {v2, v3}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    new-instance v3, Lbsh/b;

    .line 138
    .line 139
    const/4 v4, 0x5

    .line 140
    invoke-direct {v3, v4}, Lbsh/b;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v2, v3}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-static {v0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    new-instance v3, Lbsh/b;

    .line 156
    .line 157
    const/16 v4, 0x8

    .line 158
    .line 159
    invoke-direct {v3, v4}, Lbsh/b;-><init>(I)V

    .line 160
    .line 161
    .line 162
    invoke-interface {v0, v3}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    new-instance v3, Lbsh/b;

    .line 167
    .line 168
    const/4 v4, 0x5

    .line 169
    invoke-direct {v3, v4}, Lbsh/b;-><init>(I)V

    .line 170
    .line 171
    .line 172
    invoke-interface {v0, v3}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {v2, v0}, Ljava/util/stream/Stream;->concat(Ljava/util/stream/Stream;Ljava/util/stream/Stream;)Ljava/util/stream/Stream;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {p1, v0}, Ljava/util/stream/Stream;->concat(Ljava/util/stream/Stream;Ljava/util/stream/Stream;)Ljava/util/stream/Stream;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {v1}, Ljava/util/stream/Stream;->of(Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {p1, v0}, Ljava/util/stream/Stream;->concat(Ljava/util/stream/Stream;Ljava/util/stream/Stream;)Ljava/util/stream/Stream;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    return-object p1
.end method


# virtual methods
.method public getBshIterator(Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/util/Iterator<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 124
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    invoke-direct {p0, p1}, Lbsh/CollectionManager;->arrayIt(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public getBshIterator(Ljava/lang/Character;)Ljava/util/Iterator;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Character;",
            ")",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 131
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    .line 132
    sget-object v0, Lbsh/CollectionManager;->unicodeBlockStarts:[I

    array-length v1, v0

    const/16 v2, 0x21

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_0

    aget v5, v0, v3

    if-gt v2, p1, :cond_0

    add-int/lit8 v3, v3, 0x1

    move v4, v2

    move v2, v5

    goto :goto_0

    .line 133
    :cond_0
    invoke-static {v4, p1}, Ljava/util/stream/IntStream;->rangeClosed(II)Ljava/util/stream/IntStream;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/stream/IntStream;->boxed()Ljava/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lbsh/b;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lbsh/b;-><init>(I)V

    .line 134
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lbsh/b;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lbsh/b;-><init>(I)V

    .line 135
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/stream/BaseStream;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public getBshIterator(Ljava/lang/Iterable;)Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "TT;>;)",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    .line 123
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public getBshIterator(Ljava/lang/Number;)Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Number;",
            ")",
            "Ljava/util/Iterator<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 127
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-nez p1, :cond_0

    .line 128
    invoke-direct {p0}, Lbsh/CollectionManager;->emptyIt()Ljava/util/Iterator;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    if-lez p1, :cond_1

    .line 129
    invoke-static {v0, p1}, Ljava/util/stream/IntStream;->rangeClosed(II)Ljava/util/stream/IntStream;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/stream/IntStream;->iterator()Ljava/util/PrimitiveIterator$OfInt;

    move-result-object p1

    return-object p1

    .line 130
    :cond_1
    invoke-static {p1, v0}, Ljava/util/stream/IntStream;->rangeClosed(II)Ljava/util/stream/IntStream;

    move-result-object v0

    new-instance v1, Lbsh/g;

    invoke-direct {v1, p1}, Lbsh/g;-><init>(I)V

    invoke-interface {v0, v1}, Ljava/util/stream/IntStream;->map(Ljava/util/function/IntUnaryOperator;)Ljava/util/stream/IntStream;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/stream/IntStream;->iterator()Ljava/util/PrimitiveIterator$OfInt;

    move-result-object p1

    return-object p1
.end method

.method public getBshIterator(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Iterator<",
            "*>;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Lbsh/CollectionManager;->emptyIt()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1

    .line 8
    :cond_0
    instance-of v0, p1, Lbsh/Primitive;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Lbsh/CollectionManager;->getBshIterator(Ljava/lang/Object;)Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-direct {p0, p1}, Lbsh/CollectionManager;->arrayIt(Ljava/lang/Object;)Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_2
    instance-of v0, p1, Ljava/lang/Iterable;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    check-cast p1, Ljava/lang/Iterable;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lbsh/CollectionManager;->getBshIterator(Ljava/lang/Iterable;)Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :cond_3
    instance-of v0, p1, Ljava/util/Iterator;

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    check-cast p1, Ljava/util/Iterator;

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lbsh/CollectionManager;->getBshIterator(Ljava/util/Iterator;)Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :cond_4
    instance-of v0, p1, Ljava/util/Enumeration;

    .line 59
    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    check-cast p1, Ljava/util/Enumeration;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lbsh/CollectionManager;->getBshIterator(Ljava/util/Enumeration;)Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1

    .line 69
    :cond_5
    instance-of v0, p1, Ljava/lang/CharSequence;

    .line 70
    .line 71
    if-eqz v0, :cond_6

    .line 72
    .line 73
    check-cast p1, Ljava/lang/CharSequence;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Lbsh/CollectionManager;->getBshIterator(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_6
    instance-of v0, p1, Ljava/lang/Number;

    .line 81
    .line 82
    if-eqz v0, :cond_7

    .line 83
    .line 84
    check-cast p1, Ljava/lang/Number;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Lbsh/CollectionManager;->getBshIterator(Ljava/lang/Number;)Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :cond_7
    instance-of v0, p1, Ljava/lang/Character;

    .line 92
    .line 93
    if-eqz v0, :cond_8

    .line 94
    .line 95
    check-cast p1, Ljava/lang/Character;

    .line 96
    .line 97
    invoke-virtual {p0, p1}, Lbsh/CollectionManager;->getBshIterator(Ljava/lang/Character;)Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1

    .line 102
    :cond_8
    instance-of v0, p1, Ljava/lang/String;

    .line 103
    .line 104
    if-eqz v0, :cond_9

    .line 105
    .line 106
    check-cast p1, Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {p0, p1}, Lbsh/CollectionManager;->getBshIterator(Ljava/lang/String;)Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    return-object p1

    .line 113
    :cond_9
    invoke-direct {p0, p1}, Lbsh/CollectionManager;->reflectNames(Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-interface {p1}, Ljava/util/stream/BaseStream;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1
.end method

.method public getBshIterator(Ljava/lang/String;)Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Iterator<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 125
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    invoke-direct {p0, p1}, Lbsh/CollectionManager;->arrayIt(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public getBshIterator(Ljava/util/Enumeration;)Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Enumeration<",
            "TT;>;)",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    .line 122
    invoke-static {p1}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

.method public getBshIterator(Ljava/util/Iterator;)Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator<",
            "TT;>;)",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    .line 136
    return-object p1
.end method

.method public getBshIterator([Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    .line 126
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method

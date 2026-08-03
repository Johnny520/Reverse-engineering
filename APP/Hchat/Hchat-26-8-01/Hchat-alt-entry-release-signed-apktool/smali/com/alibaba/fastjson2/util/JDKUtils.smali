.class public Lcom/alibaba/fastjson2/util/JDKUtils;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final ANDROID_SDK_INT:I

.field public static final ARRAY_BYTE_BASE_OFFSET:J

.field public static final ARRAY_CHAR_BASE_OFFSET:J

.field public static final BIG_ENDIAN:Z

.field public static final FIELD_DECIMAL_INT_COMPACT_OFFSET:J

.field public static final GRAAL:Z = false

.field public static final UNSAFE:Lsun/misc/Unsafe;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    move v0, v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v2

    .line 14
    :goto_0
    sput-boolean v0, Lcom/alibaba/fastjson2/util/JDKUtils;->BIG_ENDIAN:Z

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    :try_start_0
    const-class v1, Lsun/misc/Unsafe;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    array-length v4, v1

    .line 24
    :goto_1
    if-ge v2, v4, :cond_2

    .line 25
    .line 26
    aget-object v5, v1, v2

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    const-string v7, "theUnsafe"

    .line 33
    .line 34
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-nez v7, :cond_3

    .line 39
    .line 40
    const-string v7, "THE_ONE"

    .line 41
    .line 42
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move-object v5, v0

    .line 53
    :cond_3
    :goto_2
    if-eqz v5, :cond_4

    .line 54
    .line 55
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lsun/misc/Unsafe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :catchall_0
    :cond_4
    move-object v1, v0

    .line 66
    :goto_3
    sput-object v1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 67
    .line 68
    const/4 v2, -0x1

    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    const-class v3, [B

    .line 72
    .line 73
    invoke-virtual {v1, v3}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    const-class v4, [C

    .line 78
    .line 79
    invoke-virtual {v1, v4}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    goto :goto_4

    .line 84
    :cond_5
    move v3, v2

    .line 85
    move v4, v3

    .line 86
    :goto_4
    int-to-long v5, v3

    .line 87
    sput-wide v5, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_BYTE_BASE_OFFSET:J

    .line 88
    .line 89
    int-to-long v3, v4

    .line 90
    sput-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->ARRAY_CHAR_BASE_OFFSET:J

    .line 91
    .line 92
    :try_start_1
    const-class v3, Ljava/math/BigDecimal;

    .line 93
    .line 94
    const-string v4, "intCompact"

    .line 95
    .line 96
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v1, v3}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 101
    .line 102
    .line 103
    move-result-wide v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    goto :goto_5

    .line 105
    :catchall_1
    const-wide/16 v3, -0x1

    .line 106
    .line 107
    :goto_5
    sput-wide v3, Lcom/alibaba/fastjson2/util/JDKUtils;->FIELD_DECIMAL_INT_COMPACT_OFFSET:J

    .line 108
    .line 109
    :try_start_2
    const-string v1, "android.os.Build$VERSION"

    .line 110
    .line 111
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const-string v3, "SDK_INT"

    .line 116
    .line 117
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 122
    .line 123
    .line 124
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 125
    :catchall_2
    sput v2, Lcom/alibaba/fastjson2/util/JDKUtils;->ANDROID_SDK_INT:I

    .line 126
    .line 127
    return-void
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

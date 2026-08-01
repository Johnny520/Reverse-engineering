.class public Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;
.super Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ModuleDefinitionAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;,
        Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$ExportsDefinitionAdapter;,
        Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase<",
        "TU;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final exports:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Exports;",
            ">;"
        }
    .end annotation
.end field

.field private final mainClass:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final modifiers:I

.field private final name:Ljava/lang/String;

.field private final opens:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Opens;",
            ">;"
        }
    .end annotation
.end field

.field private final packages:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final provides:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Provides;",
            ">;"
        }
    .end annotation
.end field

.field private final requires:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Requires;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

.field private final uses:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final version:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Ljava/lang/String;I)V
    .locals 12

    .line 1
    sget-object v6, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 2
    .line 3
    const-string v0, "java.base"

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 12
    .line 13
    :goto_0
    move-object v7, v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    new-instance v1, Lnet/bytebuddy/description/module/ModuleDescription$Requires$Simple;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const v3, 0x8000

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2, v3}, Lnet/bytebuddy/description/module/ModuleDescription$Requires$Simple;-><init>(Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :goto_1
    sget-object v8, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    move-object v9, v8

    .line 34
    move-object v10, v6

    .line 35
    move-object v11, v8

    .line 36
    move-object v0, p0

    .line 37
    move-object v1, p1

    .line 38
    move-object v2, p2

    .line 39
    move v3, p3

    .line 40
    invoke-direct/range {v0 .. v11}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V
    .locals 0
    .param p3    # I
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Requires;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Exports;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Opens;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Provides;",
            ">;)V"
        }
    .end annotation

    .line 44
    iput-object p1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    invoke-direct {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$AbstractBase;-><init>()V

    .line 45
    iput-object p2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->name:Ljava/lang/String;

    .line 46
    iput p3, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->modifiers:I

    .line 47
    iput-object p4, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->version:Ljava/lang/String;

    .line 48
    iput-object p5, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->mainClass:Ljava/lang/String;

    .line 49
    iput-object p6, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->packages:Ljava/util/Set;

    .line 50
    iput-object p7, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->requires:Ljava/util/Map;

    .line 51
    iput-object p8, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->exports:Ljava/util/Map;

    .line 52
    iput-object p9, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->opens:Ljava/util/Map;

    .line 53
    iput-object p10, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->uses:Ljava/util/Set;

    .line 54
    iput-object p11, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->provides:Ljava/util/Map;

    return-void
.end method

.method public static synthetic access$000(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->requires:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->modifiers:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$300(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->version:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$400(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->mainClass:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$500(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->packages:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$600(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->exports:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$700(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->opens:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$800(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->uses:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$900(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->provides:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->modifiers:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->modifiers:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->name:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->name:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->version:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->version:Ljava/lang/String;

    .line 43
    .line 44
    if-eqz v3, :cond_5

    .line 45
    .line 46
    if-eqz v2, :cond_6

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_7

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    if-eqz v2, :cond_7

    .line 56
    .line 57
    :cond_6
    return v1

    .line 58
    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->mainClass:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->mainClass:Ljava/lang/String;

    .line 61
    .line 62
    if-eqz v3, :cond_8

    .line 63
    .line 64
    if-eqz v2, :cond_9

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_a

    .line 71
    .line 72
    return v1

    .line 73
    :cond_8
    if-eqz v2, :cond_a

    .line 74
    .line 75
    :cond_9
    return v1

    .line 76
    :cond_a
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->packages:Ljava/util/Set;

    .line 77
    .line 78
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->packages:Ljava/util/Set;

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_b

    .line 85
    .line 86
    return v1

    .line 87
    :cond_b
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->requires:Ljava/util/Map;

    .line 88
    .line 89
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->requires:Ljava/util/Map;

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_c

    .line 96
    .line 97
    return v1

    .line 98
    :cond_c
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->exports:Ljava/util/Map;

    .line 99
    .line 100
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->exports:Ljava/util/Map;

    .line 101
    .line 102
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-nez v2, :cond_d

    .line 107
    .line 108
    return v1

    .line 109
    :cond_d
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->opens:Ljava/util/Map;

    .line 110
    .line 111
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->opens:Ljava/util/Map;

    .line 112
    .line 113
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-nez v2, :cond_e

    .line 118
    .line 119
    return v1

    .line 120
    :cond_e
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->uses:Ljava/util/Set;

    .line 121
    .line 122
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->uses:Ljava/util/Set;

    .line 123
    .line 124
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-nez v2, :cond_f

    .line 129
    .line 130
    return v1

    .line 131
    :cond_f
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->provides:Ljava/util/Map;

    .line 132
    .line 133
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->provides:Ljava/util/Map;

    .line 134
    .line 135
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-nez v2, :cond_10

    .line 140
    .line 141
    return v1

    .line 142
    :cond_10
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 143
    .line 144
    iget-object p1, p1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 145
    .line 146
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-nez p0, :cond_11

    .line 151
    .line 152
    return v1

    .line 153
    :cond_11
    return v0
.end method

.method public export(Ljava/lang/String;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$ExportsDefinition;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$ExportsDefinition<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$ExportsDefinitionAdapter;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$ExportsDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public bridge synthetic export(Ljava/lang/String;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 0

    .line 7
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->export(Ljava/lang/String;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$ExportsDefinition;

    move-result-object p0

    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->name:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->modifiers:I

    .line 19
    .line 20
    add-int/2addr v0, v2

    .line 21
    mul-int/2addr v0, v1

    .line 22
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->version:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-int/2addr v0, v2

    .line 31
    :cond_0
    mul-int/2addr v0, v1

    .line 32
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->mainClass:Ljava/lang/String;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v0, v2

    .line 41
    :cond_1
    mul-int/2addr v0, v1

    .line 42
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->packages:Ljava/util/Set;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v0

    .line 49
    mul-int/2addr v2, v1

    .line 50
    iget-object v0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->requires:Ljava/util/Map;

    .line 51
    .line 52
    invoke-static {v0, v2, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->exports:Ljava/util/Map;

    .line 57
    .line 58
    invoke-static {v2, v0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->opens:Ljava/util/Map;

    .line 63
    .line 64
    invoke-static {v2, v0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->uses:Ljava/util/Set;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    add-int/2addr v2, v0

    .line 75
    mul-int/2addr v2, v1

    .line 76
    iget-object v0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->provides:Ljava/util/Map;

    .line 77
    .line 78
    invoke-static {v0, v2, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 83
    .line 84
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->hashCode()I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    add-int/2addr p0, v0

    .line 89
    return p0
.end method

.method public mainClass(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->name:Ljava/lang/String;

    .line 6
    .line 7
    iget v3, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->modifiers:I

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->version:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v6, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->packages:Ljava/util/Set;

    .line 12
    .line 13
    iget-object v7, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->requires:Ljava/util/Map;

    .line 14
    .line 15
    iget-object v8, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->exports:Ljava/util/Map;

    .line 16
    .line 17
    iget-object v9, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->opens:Ljava/util/Map;

    .line 18
    .line 19
    iget-object v10, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->uses:Ljava/util/Set;

    .line 20
    .line 21
    iget-object v11, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->provides:Ljava/util/Map;

    .line 22
    .line 23
    move-object v5, p1

    .line 24
    invoke-direct/range {v0 .. v11}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public materialize()Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "TU;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 4
    .line 5
    iget-object v2, v1, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->instrumentedType:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 6
    .line 7
    new-instance v3, Lnet/bytebuddy/description/module/ModuleDescription$Latent;

    .line 8
    .line 9
    iget-object v4, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->name:Ljava/lang/String;

    .line 10
    .line 11
    iget v5, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->modifiers:I

    .line 12
    .line 13
    iget-object v6, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->version:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->mainClass:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v8, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->packages:Ljava/util/Set;

    .line 18
    .line 19
    iget-object v9, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->requires:Ljava/util/Map;

    .line 20
    .line 21
    iget-object v10, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->exports:Ljava/util/Map;

    .line 22
    .line 23
    iget-object v11, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->opens:Ljava/util/Map;

    .line 24
    .line 25
    iget-object v12, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->uses:Ljava/util/Set;

    .line 26
    .line 27
    iget-object v13, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->provides:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {v2}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 30
    .line 31
    .line 32
    move-result-object v14

    .line 33
    invoke-direct/range {v3 .. v14}, Lnet/bytebuddy/description/module/ModuleDescription$Latent;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v2, v3}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;->withModuleDescription(Lnet/bytebuddy/description/module/ModuleDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget v3, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->modifiers:I

    .line 41
    .line 42
    invoke-interface {v2, v3}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;->withModifiers(I)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v0, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 47
    .line 48
    iget-object v3, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->fieldRegistry:Lnet/bytebuddy/dynamic/scaffold/FieldRegistry;

    .line 49
    .line 50
    iget-object v4, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->methodRegistry:Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;

    .line 51
    .line 52
    iget-object v5, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->recordComponentRegistry:Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;

    .line 53
    .line 54
    iget-object v6, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->typeAttributeAppender:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;

    .line 55
    .line 56
    iget-object v7, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 57
    .line 58
    iget-object v8, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 59
    .line 60
    iget-object v9, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 61
    .line 62
    iget-object v10, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 63
    .line 64
    iget-object v11, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->annotationRetention:Lnet/bytebuddy/implementation/attribute/AnnotationRetention;

    .line 65
    .line 66
    iget-object v12, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 67
    .line 68
    iget-object v13, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->methodGraphCompiler:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;

    .line 69
    .line 70
    iget-object v14, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 71
    .line 72
    iget-object v15, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->visibilityBridgeStrategy:Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;

    .line 73
    .line 74
    move-object/from16 v16, v1

    .line 75
    .line 76
    iget-object v1, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 77
    .line 78
    move-object/from16 v17, v1

    .line 79
    .line 80
    iget-object v1, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 81
    .line 82
    move-object/from16 v18, v1

    .line 83
    .line 84
    iget-object v1, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->ignoredMethods:Lnet/bytebuddy/matcher/LatentMatcher;

    .line 85
    .line 86
    iget-object v0, v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->auxiliaryTypes:Ljava/util/List;

    .line 87
    .line 88
    move-object/from16 v19, v18

    .line 89
    .line 90
    move-object/from16 v18, v1

    .line 91
    .line 92
    move-object/from16 v1, v16

    .line 93
    .line 94
    move-object/from16 v16, v17

    .line 95
    .line 96
    move-object/from16 v17, v19

    .line 97
    .line 98
    move-object/from16 v19, v0

    .line 99
    .line 100
    invoke-virtual/range {v1 .. v19}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;->materialize(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;Lnet/bytebuddy/dynamic/scaffold/FieldRegistry;Lnet/bytebuddy/dynamic/scaffold/MethodRegistry;Lnet/bytebuddy/dynamic/scaffold/RecordComponentRegistry;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/dynamic/VisibilityBridgeStrategy;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/matcher/LatentMatcher;Ljava/util/List;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    return-object v0
.end method

.method public open(Ljava/lang/String;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$OpensDefinition;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$OpensDefinition<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$OpensDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public bridge synthetic open(Ljava/lang/String;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 0

    .line 7
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->open(Ljava/lang/String;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$OpensDefinition;

    move-result-object p0

    return-object p0
.end method

.method public packages(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    iget-object v0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->packages:Ljava/util/Set;

    .line 4
    .line 5
    invoke-direct {v6, v0}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v6, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 12
    .line 13
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 14
    .line 15
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->name:Ljava/lang/String;

    .line 16
    .line 17
    iget v3, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->modifiers:I

    .line 18
    .line 19
    iget-object v4, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->version:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v5, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->mainClass:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v7, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->requires:Ljava/util/Map;

    .line 24
    .line 25
    iget-object v8, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->exports:Ljava/util/Map;

    .line 26
    .line 27
    iget-object v9, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->opens:Ljava/util/Map;

    .line 28
    .line 29
    iget-object v10, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->uses:Ljava/util/Set;

    .line 30
    .line 31
    iget-object v11, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->provides:Ljava/util/Map;

    .line 32
    .line 33
    invoke-direct/range {v0 .. v11}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public provides(Ljava/lang/String;Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    iget-object v0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->provides:Ljava/util/Map;

    .line 4
    .line 5
    invoke-direct {v11, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lnet/bytebuddy/description/module/ModuleDescription$Provides$Simple;

    .line 9
    .line 10
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 11
    .line 12
    invoke-direct {v1, p2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/module/ModuleDescription$Provides$Simple;-><init>(Ljava/util/Set;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v11, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 22
    .line 23
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 24
    .line 25
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->name:Ljava/lang/String;

    .line 26
    .line 27
    iget v3, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->modifiers:I

    .line 28
    .line 29
    iget-object v4, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->version:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v5, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->mainClass:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v6, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->packages:Ljava/util/Set;

    .line 34
    .line 35
    iget-object v7, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->requires:Ljava/util/Map;

    .line 36
    .line 37
    iget-object v8, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->exports:Ljava/util/Map;

    .line 38
    .line 39
    iget-object v9, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->opens:Ljava/util/Map;

    .line 40
    .line 41
    iget-object v10, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->uses:Ljava/util/Set;

    .line 42
    .line 43
    invoke-direct/range {v0 .. v11}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method

.method public require(Ljava/lang/String;I)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition$RequiresDefinition<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter$RequiresDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public uses(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v10, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    iget-object v0, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->uses:Ljava/util/Set;

    .line 4
    .line 5
    invoke-direct {v10, v0}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v10, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 12
    .line 13
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 14
    .line 15
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->name:Ljava/lang/String;

    .line 16
    .line 17
    iget v3, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->modifiers:I

    .line 18
    .line 19
    iget-object v4, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->version:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v5, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->mainClass:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v6, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->packages:Ljava/util/Set;

    .line 24
    .line 25
    iget-object v7, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->requires:Ljava/util/Map;

    .line 26
    .line 27
    iget-object v8, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->exports:Ljava/util/Map;

    .line 28
    .line 29
    iget-object v9, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->opens:Ljava/util/Map;

    .line 30
    .line 31
    iget-object v11, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->provides:Ljava/util/Map;

    .line 32
    .line 33
    invoke-direct/range {v0 .. v11}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public version(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition;
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder$ModuleDefinition<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->this$0:Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->name:Ljava/lang/String;

    .line 6
    .line 7
    iget v3, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->modifiers:I

    .line 8
    .line 9
    iget-object v5, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->mainClass:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v6, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->packages:Ljava/util/Set;

    .line 12
    .line 13
    iget-object v7, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->requires:Ljava/util/Map;

    .line 14
    .line 15
    iget-object v8, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->exports:Ljava/util/Map;

    .line 16
    .line 17
    iget-object v9, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->opens:Ljava/util/Map;

    .line 18
    .line 19
    iget-object v10, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->uses:Ljava/util/Set;

    .line 20
    .line 21
    iget-object v11, p0, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;->provides:Ljava/util/Map;

    .line 22
    .line 23
    move-object v4, p1

    .line 24
    invoke-direct/range {v0 .. v11}, Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter$ModuleDefinitionAdapter;-><init>(Lnet/bytebuddy/dynamic/DynamicType$Builder$AbstractBase$Adapter;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

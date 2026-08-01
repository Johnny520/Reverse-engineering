.class public final Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
.super Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言子哲兰苏楪世;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/DescriptorProtos$FieldOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170"
.end annotation


# instance fields
.field private bitField0_:I

.field private ctype_:I

.field private debugRedact_:Z

.field private deprecated_:Z

.field private editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u5b50\u696a;"
        }
    .end annotation
.end field

.field private editionDefaults_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;",
            ">;"
        }
    .end annotation
.end field

.field private featureSupportBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a;"
        }
    .end annotation
.end field

.field private featureSupport_:Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

.field private featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a;"
        }
    .end annotation
.end field

.field private features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

.field private jstype_:I

.field private lazy_:Z

.field private packed_:Z

.field private retention_:I

.field private targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

.field private uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u5b50\u696a;"
        }
    .end annotation
.end field

.field private uninterpretedOption_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;",
            ">;"
        }
    .end annotation
.end field

.field private unverifiedLazy_:Z

.field private weak_:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ctype_:I

    .line 6
    .line 7
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->jstype_:I

    .line 8
    .line 9
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->retention_:I

    .line 10
    .line 11
    invoke-static {}, Lcom/google/protobuf/GeneratedMessage;->emptyIntList()Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 16
    .line 17
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->maybeForceBuilderInitialization()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    const/4 p1, 0x0

    .line 30
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ctype_:I

    .line 31
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->jstype_:I

    .line 32
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->retention_:I

    .line 33
    invoke-static {}, Lcom/google/protobuf/GeneratedMessage;->emptyIntList()Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    move-result-object p1

    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 34
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 35
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 36
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    return-void
.end method

.method private buildPartial0(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ctype_:I

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22202(Lcom/google/protobuf/DescriptorProtos$FieldOptions;I)I

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    and-int/lit8 v2, v0, 0x2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->packed_:Z

    .line 20
    .line 21
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22302(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Z)Z

    .line 22
    .line 23
    .line 24
    or-int/lit8 v1, v1, 0x2

    .line 25
    .line 26
    :cond_1
    and-int/lit8 v2, v0, 0x4

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->jstype_:I

    .line 31
    .line 32
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22402(Lcom/google/protobuf/DescriptorProtos$FieldOptions;I)I

    .line 33
    .line 34
    .line 35
    or-int/lit8 v1, v1, 0x4

    .line 36
    .line 37
    :cond_2
    and-int/lit8 v2, v0, 0x8

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->lazy_:Z

    .line 42
    .line 43
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22502(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Z)Z

    .line 44
    .line 45
    .line 46
    or-int/lit8 v1, v1, 0x8

    .line 47
    .line 48
    :cond_3
    and-int/lit8 v2, v0, 0x10

    .line 49
    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->unverifiedLazy_:Z

    .line 53
    .line 54
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22602(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Z)Z

    .line 55
    .line 56
    .line 57
    or-int/lit8 v1, v1, 0x10

    .line 58
    .line 59
    :cond_4
    and-int/lit8 v2, v0, 0x20

    .line 60
    .line 61
    if-eqz v2, :cond_5

    .line 62
    .line 63
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 64
    .line 65
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22702(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Z)Z

    .line 66
    .line 67
    .line 68
    or-int/lit8 v1, v1, 0x20

    .line 69
    .line 70
    :cond_5
    and-int/lit8 v2, v0, 0x40

    .line 71
    .line 72
    if-eqz v2, :cond_6

    .line 73
    .line 74
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->weak_:Z

    .line 75
    .line 76
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22802(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Z)Z

    .line 77
    .line 78
    .line 79
    or-int/lit8 v1, v1, 0x40

    .line 80
    .line 81
    :cond_6
    and-int/lit16 v2, v0, 0x80

    .line 82
    .line 83
    if-eqz v2, :cond_7

    .line 84
    .line 85
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->debugRedact_:Z

    .line 86
    .line 87
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22902(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Z)Z

    .line 88
    .line 89
    .line 90
    or-int/lit16 v1, v1, 0x80

    .line 91
    .line 92
    :cond_7
    and-int/lit16 v2, v0, 0x100

    .line 93
    .line 94
    if-eqz v2, :cond_8

    .line 95
    .line 96
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->retention_:I

    .line 97
    .line 98
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$23002(Lcom/google/protobuf/DescriptorProtos$FieldOptions;I)I

    .line 99
    .line 100
    .line 101
    or-int/lit16 v1, v1, 0x100

    .line 102
    .line 103
    :cond_8
    and-int/lit16 v2, v0, 0x200

    .line 104
    .line 105
    if-eqz v2, :cond_9

    .line 106
    .line 107
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 108
    .line 109
    check-cast v2, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;

    .line 110
    .line 111
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 112
    .line 113
    .line 114
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 115
    .line 116
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$23102(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;)Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 117
    .line 118
    .line 119
    :cond_9
    and-int/lit16 v2, v0, 0x800

    .line 120
    .line 121
    if-eqz v2, :cond_b

    .line 122
    .line 123
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 124
    .line 125
    if-nez v2, :cond_a

    .line 126
    .line 127
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_a
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/GeneratedMessage;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 135
    .line 136
    :goto_1
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$23202(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 137
    .line 138
    .line 139
    or-int/lit16 v1, v1, 0x200

    .line 140
    .line 141
    :cond_b
    and-int/lit16 v0, v0, 0x1000

    .line 142
    .line 143
    if-eqz v0, :cond_d

    .line 144
    .line 145
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupportBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 146
    .line 147
    if-nez v0, :cond_c

    .line 148
    .line 149
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupport_:Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_c
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/GeneratedMessage;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 157
    .line 158
    :goto_2
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$23302(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 159
    .line 160
    .line 161
    or-int/lit16 v1, v1, 0x400

    .line 162
    .line 163
    :cond_d
    invoke-static {p1, v1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$23476(Lcom/google/protobuf/DescriptorProtos$FieldOptions;I)I

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method private buildPartialRepeatedFields(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    and-int/lit16 v0, v0, 0x400

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 18
    .line 19
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 20
    .line 21
    and-int/lit16 v0, v0, -0x401

    .line 22
    .line 23
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22002(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Ljava/util/List;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏世哲兰()Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {p1, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22002(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Ljava/util/List;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 39
    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 43
    .line 44
    and-int/lit16 v0, v0, 0x2000

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 55
    .line 56
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 57
    .line 58
    and-int/lit16 v0, v0, -0x2001

    .line 59
    .line 60
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 61
    .line 62
    :cond_2
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 63
    .line 64
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22102(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Ljava/util/List;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏世哲兰()Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22102(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Ljava/util/List;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method private ensureEditionDefaultsIsMutable()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x400

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 17
    .line 18
    or-int/lit16 v0, v0, 0x400

    .line 19
    .line 20
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method private ensureTargetsIsMutable()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;

    .line 5
    .line 6
    iget-boolean v1, v1, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessage;->makeMutableCopy(Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;)Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 17
    .line 18
    :cond_0
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 19
    .line 20
    or-int/lit16 v0, v0, 0x200

    .line 21
    .line 22
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 23
    .line 24
    return-void
.end method

.method private ensureUninterpretedOptionIsMutable()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x2000

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 17
    .line 18
    or-int/lit16 v0, v0, 0x2000

    .line 19
    .line 20
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世苏哲楪兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
.end method

.method private internalGetEditionDefaultsFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u5b50\u696a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->getParentForChildren()Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->isClean()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;-><init>(Ljava/util/List;Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Z)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 26
    .line 27
    return-object p0
.end method

.method private internalGetFeatureSupportFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupportBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->getFeatureSupport()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->getParentForChildren()Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->isClean()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupportBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupport_:Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 26
    .line 27
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupportBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 28
    .line 29
    return-object p0
.end method

.method private internalGetFeaturesFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->getParentForChildren()Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->isClean()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 26
    .line 27
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 28
    .line 29
    return-object p0
.end method

.method private internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u5b50\u696a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->getParentForChildren()Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->isClean()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;-><init>(Ljava/util/List;Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Z)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 26
    .line 27
    return-object p0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetEditionDefaultsFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetFeaturesFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetFeatureSupportFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllEditionDefaults(Ljava/lang/Iterable;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;",
            ">;)",
            "Lcom/google/protobuf/DescriptorProtos$FieldOptions$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureEditionDefaultsIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {p1, v0}, Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Iterable;)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public addAllTargets(Ljava/lang/Iterable;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;",
            ">;)",
            "Lcom/google/protobuf/DescriptorProtos$FieldOptions$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureTargetsIsMutable()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;->getNumber()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    check-cast v1, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪世哲兰苏(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 33
    .line 34
    .line 35
    return-object p0
.end method

.method public addAllUninterpretedOption(Ljava/lang/Iterable;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;",
            ">;)",
            "Lcom/google/protobuf/DescriptorProtos$FieldOptions$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {p1, v0}, Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Iterable;)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public addEditionDefaults(ILcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 42
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureEditionDefaultsIsMutable()V

    .line 43
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 44
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 45
    :cond_0
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰苏哲(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addEditionDefaults(ILcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureEditionDefaultsIsMutable()V

    .line 32
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 33
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 34
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰苏哲(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addEditionDefaults(Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureEditionDefaultsIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/GeneratedMessage;)V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public addEditionDefaults(Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureEditionDefaultsIsMutable()V

    .line 38
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 40
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addEditionDefaultsBuilder()Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetEditionDefaultsFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    return-object p0
.end method

.method public addEditionDefaultsBuilder(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetEditionDefaultsFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    move-result-object p0

    .line 17
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;

    move-result-object v0

    .line 18
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏兰哲(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public addExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;Ljava/lang/Object;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u54f2\u4e16\u82cf;",
            "TType;)",
            "Lcom/google/protobuf/DescriptorProtos$FieldOptions$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->addExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    return-object p0
.end method

.method public addTargets(Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureTargetsIsMutable()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;->getNumber()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪世哲兰苏(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public addUninterpretedOption(ILcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 42
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 43
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 44
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 45
    :cond_0
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰苏哲(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addUninterpretedOption(ILcom/google/protobuf/DescriptorProtos$UninterpretedOption;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 32
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 33
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 34
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰苏哲(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addUninterpretedOption(Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/GeneratedMessage;)V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public addUninterpretedOption(Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 38
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 40
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addUninterpretedOptionBuilder()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    return-object p0
.end method

.method public addUninterpretedOptionBuilder(I)Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    move-result-object p0

    .line 17
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    move-result-object v0

    .line 18
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏兰哲(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public build()Lcom/google/protobuf/DescriptorProtos$FieldOptions;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->isInitialized()Z

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
    invoke-static {p0}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->newUninitializedMessageException(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/UninitializedMessageException;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    throw p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    move-result-object p0

    return-object p0
.end method

.method public buildPartial()Lcom/google/protobuf/DescriptorProtos$FieldOptions;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->buildPartialRepeatedFields(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->buildPartial0(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onBuilt()V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    move-result-object p0

    return-object p0
.end method

.method public clear()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ctype_:I

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->packed_:Z

    .line 10
    .line 11
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->jstype_:I

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->lazy_:Z

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->unverifiedLazy_:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->weak_:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->debugRedact_:Z

    .line 22
    .line 23
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->retention_:I

    .line 24
    .line 25
    invoke-static {}, Lcom/google/protobuf/GeneratedMessage;->emptyIntList()Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 30
    .line 31
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 37
    .line 38
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏世兰哲()V

    .line 44
    .line 45
    .line 46
    :goto_0
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 47
    .line 48
    and-int/lit16 v0, v0, -0x401

    .line 49
    .line 50
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 51
    .line 52
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 53
    .line 54
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 55
    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    iput-object v1, v0, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 59
    .line 60
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 61
    .line 62
    :cond_1
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupport_:Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 63
    .line 64
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupportBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    iput-object v1, v0, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 69
    .line 70
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupportBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 71
    .line 72
    :cond_2
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 73
    .line 74
    if-nez v0, :cond_3

    .line 75
    .line 76
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 77
    .line 78
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏世兰哲()V

    .line 84
    .line 85
    .line 86
    :goto_1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 87
    .line 88
    and-int/lit16 v0, v0, -0x2001

    .line 89
    .line 90
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 91
    .line 92
    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 94
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 93
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 96
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 95
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 97
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clearCtype()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x2

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ctype_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearDebugRedact()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, -0x81

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->debugRedact_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearDeprecated()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x21

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearEditionDefaults()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 8
    .line 9
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 10
    .line 11
    and-int/lit16 v0, v0, -0x401

    .line 12
    .line 13
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏世兰哲()V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public clearExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u54f2\u4e16\u82cf;",
            ")",
            "Lcom/google/protobuf/DescriptorProtos$FieldOptions$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->clearExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    return-object p0
.end method

.method public clearFeatureSupport()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, -0x1001

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupport_:Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupportBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iput-object v0, v1, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupportBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public clearFeatures()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, -0x801

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iput-object v0, v1, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public clearJstype()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x5

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->jstype_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearLazy()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x9

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->lazy_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearPacked()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x3

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->packed_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearRetention()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, -0x101

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->retention_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearTargets()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/GeneratedMessage;->emptyIntList()Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 6
    .line 7
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    and-int/lit16 v0, v0, -0x201

    .line 10
    .line 11
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public clearUninterpretedOption()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 8
    .line 9
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 10
    .line 11
    and-int/lit16 v0, v0, -0x2001

    .line 12
    .line 13
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏世兰哲()V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public clearUnverifiedLazy()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x11

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->unverifiedLazy_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearWeak()Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x41

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->weak_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public getCtype()Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ctype_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;->STRING:Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public getDebugRedact()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->debugRedact_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FieldOptions;
    .locals 0

    .line 7
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDeprecated()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世苏哲楪兰:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEditionDefaults(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    invoke-virtual {v0, p1, p0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪哲世苏兰(IZ)Lcom/google/protobuf/GeneratedMessage;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;

    .line 20
    .line 21
    return-object p0
.end method

.method public getEditionDefaultsBuilder(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetEditionDefaultsFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏兰世哲(I)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    return-object p0
.end method

.method public getEditionDefaultsBuilderList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetEditionDefaultsFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏兰哲世()Lcom/google/protobuf/飘花落叶言世哲兰子苏楪;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getEditionDefaultsCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    iget-object p0, v0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public getEditionDefaultsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/飘花落叶言世哲兰楪子苏;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public getEditionDefaultsOrBuilder(I)Lcom/google/protobuf/飘花落叶言子哲苏兰楪世;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/google/protobuf/飘花落叶言子哲苏兰楪世;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪哲苏世兰(I)Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lcom/google/protobuf/飘花落叶言子哲苏兰楪世;

    .line 19
    .line 20
    return-object p0
.end method

.method public getEditionDefaultsOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u54f2\u82cf\u5170\u696a\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪哲苏兰世()Lcom/google/protobuf/飘花落叶言世哲兰楪苏子;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public bridge synthetic getExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic getExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;I)Ljava/lang/Object;
    .locals 0

    .line 6
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Ljava/lang/Object;
    .locals 0

    .line 7
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;I)Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getExtensionCount(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtensionCount(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public bridge synthetic getExtensionCount(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)I
    .locals 0

    .line 6
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->getExtensionCount(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)I

    move-result p0

    return p0
.end method

.method public getFeatureSupport()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupportBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupport_:Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    return-object p0

    .line 14
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世兰苏哲()Lcom/google/protobuf/GeneratedMessage;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 19
    .line 20
    return-object p0
.end method

.method public getFeatureSupportBuilder()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    or-int/lit16 v0, v0, 0x1000

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetFeatureSupportFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世哲兰苏()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    return-object p0
.end method

.method public getFeatureSupportOrBuilder()Lcom/google/protobuf/飘花落叶言子哲兰楪世苏;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupportBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世兰哲苏()Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/protobuf/飘花落叶言子哲兰楪世苏;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupport_:Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 13
    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_1
    return-object p0
.end method

.method public getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    return-object p0

    .line 14
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世兰苏哲()Lcom/google/protobuf/GeneratedMessage;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 19
    .line 20
    return-object p0
.end method

.method public getFeaturesBuilder()Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    or-int/lit16 v0, v0, 0x800

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetFeaturesFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世哲兰苏()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    return-object p0
.end method

.method public getFeaturesOrBuilder()Lcom/google/protobuf/飘花落叶言子哲世楪兰苏;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世兰哲苏()Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/protobuf/飘花落叶言子哲世楪兰苏;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 13
    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_1
    return-object p0
.end method

.method public getJstype()Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->jstype_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;->JS_NORMAL:Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public getLazy()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->lazy_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getPacked()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->packed_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getRetention()Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->retention_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;->RETENTION_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public getTargets(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$23500()Lcom/google/protobuf/飘花落叶言世子苏楪哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 6
    .line 7
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪世兰哲苏(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    check-cast v0, Lcom/google/protobuf/飘花落叶言子哲苏楪世兰;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;->TARGET_TYPE_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;

    .line 25
    .line 26
    :cond_0
    return-object p0
.end method

.method public getTargetsCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 2
    .line 3
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getTargetsList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言世子苏楪兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 4
    .line 5
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$23500()Lcom/google/protobuf/飘花落叶言世子苏楪哲兰;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/飘花落叶言世子苏楪兰哲;-><init>(Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;Lcom/google/protobuf/飘花落叶言世子苏楪哲兰;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getUninterpretedOption(I)Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    invoke-virtual {v0, p1, p0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪哲世苏兰(IZ)Lcom/google/protobuf/GeneratedMessage;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    .line 20
    .line 21
    return-object p0
.end method

.method public getUninterpretedOptionBuilder(I)Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏兰世哲(I)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    return-object p0
.end method

.method public getUninterpretedOptionBuilderList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏兰哲世()Lcom/google/protobuf/飘花落叶言世哲兰子苏楪;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getUninterpretedOptionCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    iget-object p0, v0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public getUninterpretedOptionList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/飘花落叶言世哲兰楪子苏;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public getUninterpretedOptionOrBuilder(I)Lcom/google/protobuf/飘花落叶言楪子苏哲兰世;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪子苏哲兰世;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪哲苏世兰(I)Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lcom/google/protobuf/飘花落叶言楪子苏哲兰世;

    .line 19
    .line 20
    return-object p0
.end method

.method public getUninterpretedOptionOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u82cf\u54f2\u5170\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪哲苏兰世()Lcom/google/protobuf/飘花落叶言世哲兰楪苏子;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public getUnverifiedLazy()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->unverifiedLazy_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getWeak()Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->weak_:Z

    .line 2
    .line 3
    return p0
.end method

.method public hasCtype()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    and-int/2addr p0, v0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public hasDebugRedact()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x80

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public hasDeprecated()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x20

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public bridge synthetic hasExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->hasExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public bridge synthetic hasExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Z
    .locals 0

    .line 6
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言楪哲世兰苏子;->hasExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Z

    move-result p0

    return p0
.end method

.method public hasFeatureSupport()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x1000

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public hasFeatures()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x800

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public hasJstype()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x4

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public hasLazy()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x8

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public hasPacked()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x2

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public hasRetention()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x100

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public hasUnverifiedLazy()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x10

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public hasWeak()Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x40

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;
    .locals 2

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世苏哲兰楪:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final isInitialized()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->hasFeatures()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->isInitialized()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    move v0, v1

    .line 20
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->getUninterpretedOptionCount()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-ge v0, v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->getUninterpretedOption(I)Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;->isInitialized()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    return v1

    .line 37
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->extensionsAreInitialized()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-nez p0, :cond_3

    .line 45
    .line 46
    return v1

    .line 47
    :cond_3
    const/4 p0, 0x1

    .line 48
    return p0
.end method

.method public mergeFeatureSupport(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupportBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    and-int/lit16 v0, v0, 0x1000

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupport_:Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->getFeatureSupportBuilder()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupport_:Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupport_:Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 40
    .line 41
    or-int/lit16 p1, p1, 0x1000

    .line 42
    .line 43
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public mergeFeatures(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    and-int/lit16 v0, v0, 0x800

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->getFeaturesBuilder()Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 40
    .line 41
    or-int/lit16 p1, p1, 0x800

    .line 42
    .line 43
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 3

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasCtype()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getCtype()Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->setCtype(Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasPacked()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getPacked()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->setPacked(Z)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasJstype()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getJstype()Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->setJstype(Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasLazy()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getLazy()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->setLazy(Z)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasUnverifiedLazy()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getUnverifiedLazy()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->setUnverifiedLazy(Z)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasDeprecated()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_6

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getDeprecated()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->setDeprecated(Z)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 84
    .line 85
    .line 86
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasWeak()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_7

    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getWeak()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->setWeak(Z)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 97
    .line 98
    .line 99
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasDebugRedact()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_8

    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getDebugRedact()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->setDebugRedact(Z)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 110
    .line 111
    .line 112
    :cond_8
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasRetention()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_9

    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getRetention()Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->setRetention(Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 123
    .line 124
    .line 125
    :cond_9
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$23100(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_b

    .line 134
    .line 135
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 136
    .line 137
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_a

    .line 142
    .line 143
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$23100(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 148
    .line 149
    check-cast v0, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;

    .line 150
    .line 151
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 152
    .line 153
    .line 154
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 155
    .line 156
    or-int/lit16 v0, v0, 0x200

    .line 157
    .line 158
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_a
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureTargetsIsMutable()V

    .line 162
    .line 163
    .line 164
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 165
    .line 166
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$23100(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->addAll(Ljava/util/Collection;)Z

    .line 173
    .line 174
    .line 175
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 176
    .line 177
    .line 178
    :cond_b
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 179
    .line 180
    const/4 v1, 0x0

    .line 181
    if-nez v0, :cond_d

    .line 182
    .line 183
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22000(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-nez v0, :cond_10

    .line 192
    .line 193
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 194
    .line 195
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_c

    .line 200
    .line 201
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22000(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 206
    .line 207
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 208
    .line 209
    and-int/lit16 v0, v0, -0x401

    .line 210
    .line 211
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 212
    .line 213
    goto :goto_1

    .line 214
    :cond_c
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureEditionDefaultsIsMutable()V

    .line 215
    .line 216
    .line 217
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 218
    .line 219
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22000(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 224
    .line 225
    .line 226
    :goto_1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 227
    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_d
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22000(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-nez v0, :cond_10

    .line 239
    .line 240
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 241
    .line 242
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    .line 243
    .line 244
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 249
    .line 250
    if-eqz v0, :cond_f

    .line 251
    .line 252
    iput-object v1, v2, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 253
    .line 254
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 255
    .line 256
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22000(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 261
    .line 262
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 263
    .line 264
    and-int/lit16 v0, v0, -0x401

    .line 265
    .line 266
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 267
    .line 268
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 269
    .line 270
    if-eqz v0, :cond_e

    .line 271
    .line 272
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetEditionDefaultsFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    goto :goto_2

    .line 277
    :cond_e
    move-object v0, v1

    .line 278
    :goto_2
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_f
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22000(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Ljava/util/List;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {v2, v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Iterable;)V

    .line 286
    .line 287
    .line 288
    :cond_10
    :goto_3
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasFeatures()Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_11

    .line 293
    .line 294
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->mergeFeatures(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 299
    .line 300
    .line 301
    :cond_11
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->hasFeatureSupport()Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-eqz v0, :cond_12

    .line 306
    .line 307
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->getFeatureSupport()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->mergeFeatureSupport(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 312
    .line 313
    .line 314
    :cond_12
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 315
    .line 316
    if-nez v0, :cond_14

    .line 317
    .line 318
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22100(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    if-nez v0, :cond_17

    .line 327
    .line 328
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 329
    .line 330
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-eqz v0, :cond_13

    .line 335
    .line 336
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22100(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 341
    .line 342
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 343
    .line 344
    and-int/lit16 v0, v0, -0x2001

    .line 345
    .line 346
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_13
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 350
    .line 351
    .line 352
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 353
    .line 354
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22100(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Ljava/util/List;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 359
    .line 360
    .line 361
    :goto_4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 362
    .line 363
    .line 364
    goto :goto_5

    .line 365
    :cond_14
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22100(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Ljava/util/List;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-nez v0, :cond_17

    .line 374
    .line 375
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 376
    .line 377
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    .line 378
    .line 379
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 384
    .line 385
    if-eqz v0, :cond_16

    .line 386
    .line 387
    iput-object v1, v2, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 388
    .line 389
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 390
    .line 391
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22100(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Ljava/util/List;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 396
    .line 397
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 398
    .line 399
    and-int/lit16 v0, v0, -0x2001

    .line 400
    .line 401
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 402
    .line 403
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 404
    .line 405
    if-eqz v0, :cond_15

    .line 406
    .line 407
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    :cond_15
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 412
    .line 413
    goto :goto_5

    .line 414
    :cond_16
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions;->access$22100(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Ljava/util/List;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-virtual {v2, v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Iterable;)V

    .line 419
    .line 420
    .line 421
    :cond_17
    :goto_5
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->mergeExtensionFields(Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownFields(Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 429
    .line 430
    .line 431
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 432
    .line 433
    .line 434
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 440
    instance-of v0, p1, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    if-eqz v0, :cond_0

    .line 441
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$FieldOptions;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$FieldOptions;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0

    .line 442
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 5

    .line 444
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_9

    .line 445
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏哲兰楪()I

    move-result v1

    const/16 v2, 0x13

    const/4 v3, 0x1

    sparse-switch v1, :sswitch_data_0

    .line 446
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->parseUnknownField(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;I)Z

    move-result v1

    if-nez v1, :cond_0

    :sswitch_0
    move v0, v3

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_2

    .line 447
    :sswitch_1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;->parser()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    move-result-object v1

    .line 448
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲世苏(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object v1

    check-cast v1, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    .line 449
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v2, :cond_1

    .line 450
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 451
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 452
    :cond_1
    invoke-virtual {v2, v1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/GeneratedMessage;)V

    goto :goto_0

    .line 453
    :sswitch_2
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetFeatureSupportFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世哲兰苏()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    move-result-object v1

    .line 454
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲苏世(Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V

    .line 455
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit16 v1, v1, 0x1000

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto :goto_0

    .line 456
    :sswitch_3
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->internalGetFeaturesFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世哲兰苏()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    move-result-object v1

    .line 457
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲苏世(Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V

    .line 458
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit16 v1, v1, 0x800

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto :goto_0

    .line 459
    :sswitch_4
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;->parser()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    move-result-object v1

    .line 460
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲世苏(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object v1

    check-cast v1, Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;

    .line 461
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v2, :cond_2

    .line 462
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureEditionDefaultsIsMutable()V

    .line 463
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 464
    :cond_2
    invoke-virtual {v2, v1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/GeneratedMessage;)V

    goto :goto_0

    .line 465
    :sswitch_5
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏兰哲()I

    move-result v1

    .line 466
    invoke-virtual {p1, v1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏兰哲世(I)I

    move-result v1

    .line 467
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureTargetsIsMutable()V

    .line 468
    :goto_1
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世兰苏哲()I

    move-result v3

    if-lez v3, :cond_4

    .line 469
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()I

    move-result v3

    .line 470
    invoke-static {v3}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;

    move-result-object v4

    if-nez v4, :cond_3

    .line 471
    invoke-virtual {p0, v2, v3}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownVarintField(II)V

    goto :goto_1

    .line 472
    :cond_3
    iget-object v4, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    check-cast v4, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    invoke-virtual {v4, v3}, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪世哲兰苏(I)V

    goto :goto_1

    .line 473
    :cond_4
    invoke-virtual {p1, v1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏兰世哲(I)V

    goto/16 :goto_0

    .line 474
    :sswitch_6
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()I

    move-result v1

    .line 475
    invoke-static {v1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;

    move-result-object v3

    if-nez v3, :cond_5

    .line 476
    invoke-virtual {p0, v2, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownVarintField(II)V

    goto/16 :goto_0

    .line 477
    :cond_5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureTargetsIsMutable()V

    .line 478
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    check-cast v2, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    invoke-virtual {v2, v1}, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪世哲兰苏(I)V

    goto/16 :goto_0

    .line 479
    :sswitch_7
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()I

    move-result v1

    .line 480
    invoke-static {v1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;

    move-result-object v2

    if-nez v2, :cond_6

    const/16 v2, 0x11

    .line 481
    invoke-virtual {p0, v2, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownVarintField(II)V

    goto/16 :goto_0

    .line 482
    :cond_6
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->retention_:I

    .line 483
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit16 v1, v1, 0x100

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 484
    :sswitch_8
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->debugRedact_:Z

    .line 485
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit16 v1, v1, 0x80

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 486
    :sswitch_9
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->unverifiedLazy_:Z

    .line 487
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x10

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 488
    :sswitch_a
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->weak_:Z

    .line 489
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x40

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 490
    :sswitch_b
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()I

    move-result v1

    .line 491
    invoke-static {v1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;

    move-result-object v2

    if-nez v2, :cond_7

    const/4 v2, 0x6

    .line 492
    invoke-virtual {p0, v2, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownVarintField(II)V

    goto/16 :goto_0

    .line 493
    :cond_7
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->jstype_:I

    .line 494
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 495
    :sswitch_c
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->lazy_:Z

    .line 496
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x8

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 497
    :sswitch_d
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 498
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x20

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 499
    :sswitch_e
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->packed_:Z

    .line 500
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 501
    :sswitch_f
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()I

    move-result v1

    .line 502
    invoke-static {v1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;

    move-result-object v2

    if-nez v2, :cond_8

    .line 503
    invoke-virtual {p0, v3, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownVarintField(II)V

    goto/16 :goto_0

    .line 504
    :cond_8
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ctype_:I

    .line 505
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/2addr v1, v3

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 506
    :goto_2
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 507
    :goto_3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 508
    throw p1

    .line 509
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_f
        0x10 -> :sswitch_e
        0x18 -> :sswitch_d
        0x28 -> :sswitch_c
        0x30 -> :sswitch_b
        0x50 -> :sswitch_a
        0x78 -> :sswitch_9
        0x80 -> :sswitch_8
        0x88 -> :sswitch_7
        0x98 -> :sswitch_6
        0x9a -> :sswitch_5
        0xa2 -> :sswitch_4
        0xaa -> :sswitch_3
        0xb2 -> :sswitch_2
        0x1f3a -> :sswitch_1
    .end sparse-switch
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 439
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 438
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 437
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 436
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 435
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 443
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public removeEditionDefaults(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureEditionDefaultsIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪兰世苏哲(I)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public removeUninterpretedOption(I)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪兰世苏哲(I)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public setCtype(Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;->getNumber()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ctype_:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public setDebugRedact(Z)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->debugRedact_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit16 p1, p1, 0x80

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setDeprecated(Z)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x20

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setEditionDefaults(ILcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureEditionDefaultsIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪兰世哲苏(ILcom/google/protobuf/GeneratedMessage;)V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public setEditionDefaults(ILcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaultsBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureEditionDefaultsIsMutable()V

    .line 32
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->editionDefaults_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 33
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 34
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪兰世哲苏(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public setExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;ILjava/lang/Object;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u54f2\u4e16\u82cf;",
            "ITType;)",
            "Lcom/google/protobuf/DescriptorProtos$FieldOptions$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 8
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->setExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public setExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;Ljava/lang/Object;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u54f2\u4e16\u82cf;",
            "TType;)",
            "Lcom/google/protobuf/DescriptorProtos$FieldOptions$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->setExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    return-object p0
.end method

.method public setFeatureSupport(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupportBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupport_:Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 20
    .line 21
    or-int/lit16 p1, p1, 0x1000

    .line 22
    .line 23
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public setFeatureSupport(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupportBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featureSupport_:Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;

    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 33
    :goto_0
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit16 p1, p1, 0x1000

    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 34
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0
.end method

.method public setFeatures(Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 20
    .line 21
    or-int/lit16 p1, p1, 0x800

    .line 22
    .line 23
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public setFeatures(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 33
    :goto_0
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit16 p1, p1, 0x800

    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 34
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0
.end method

.method public setJstype(Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x4

    .line 7
    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;->getNumber()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->jstype_:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public setLazy(Z)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->lazy_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setPacked(Z)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->packed_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setRetention(Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 5
    .line 6
    or-int/lit16 v0, v0, 0x100

    .line 7
    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;->getNumber()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->retention_:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public setTargets(ILcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureTargetsIsMutable()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->targets_:Lcom/google/protobuf/飘花落叶言世子楪兰哲苏;

    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;->getNumber()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪苏哲世兰(II)I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public setUninterpretedOption(ILcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-virtual {p2}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪兰世哲苏(ILcom/google/protobuf/GeneratedMessage;)V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public setUninterpretedOption(ILcom/google/protobuf/DescriptorProtos$UninterpretedOption;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 32
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 33
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 34
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪兰世哲苏(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public setUnverifiedLazy(Z)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->unverifiedLazy_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x10

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setWeak(Z)Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->weak_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x40

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FieldOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

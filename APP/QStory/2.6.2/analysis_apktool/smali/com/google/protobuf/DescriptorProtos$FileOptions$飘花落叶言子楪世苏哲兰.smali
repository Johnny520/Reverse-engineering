.class public final Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
.super Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言子兰楪哲苏世;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/DescriptorProtos$FileOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170"
.end annotation


# instance fields
.field private bitField0_:I

.field private ccEnableArenas_:Z

.field private ccGenericServices_:Z

.field private csharpNamespace_:Ljava/lang/Object;

.field private deprecated_:Z

.field private featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a;"
        }
    .end annotation
.end field

.field private features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

.field private goPackage_:Ljava/lang/Object;

.field private javaGenerateEqualsAndHash_:Z

.field private javaGenericServices_:Z

.field private javaMultipleFiles_:Z

.field private javaOuterClassname_:Ljava/lang/Object;

.field private javaPackage_:Ljava/lang/Object;

.field private javaStringCheckUtf8_:Z

.field private objcClassPrefix_:Ljava/lang/Object;

.field private optimizeFor_:I

.field private phpClassPrefix_:Ljava/lang/Object;

.field private phpMetadataNamespace_:Ljava/lang/Object;

.field private phpNamespace_:Ljava/lang/Object;

.field private pyGenericServices_:Z

.field private rubyPackage_:Ljava/lang/Object;

.field private swiftPrefix_:Ljava/lang/Object;

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


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaPackage_:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaOuterClassname_:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->optimizeFor_:I

    .line 12
    .line 13
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->goPackage_:Ljava/lang/Object;

    .line 14
    .line 15
    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ccEnableArenas_:Z

    .line 16
    .line 17
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->objcClassPrefix_:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->csharpNamespace_:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->swiftPrefix_:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpClassPrefix_:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpNamespace_:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpMetadataNamespace_:Ljava/lang/Object;

    .line 28
    .line 29
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->rubyPackage_:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 32
    .line 33
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 34
    .line 35
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->maybeForceBuilderInitialization()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V
    .locals 1

    .line 41
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    .line 42
    const-string p1, ""

    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaPackage_:Ljava/lang/Object;

    .line 43
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaOuterClassname_:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 44
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->optimizeFor_:I

    .line 45
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->goPackage_:Ljava/lang/Object;

    .line 46
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ccEnableArenas_:Z

    .line 47
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->objcClassPrefix_:Ljava/lang/Object;

    .line 48
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->csharpNamespace_:Ljava/lang/Object;

    .line 49
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->swiftPrefix_:Ljava/lang/Object;

    .line 50
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpClassPrefix_:Ljava/lang/Object;

    .line 51
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpNamespace_:Ljava/lang/Object;

    .line 52
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpMetadataNamespace_:Ljava/lang/Object;

    .line 53
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->rubyPackage_:Ljava/lang/Object;

    .line 54
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 55
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;)V

    return-void
.end method

.method private buildPartial0(Lcom/google/protobuf/DescriptorProtos$FileOptions;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaPackage_:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16202(Lcom/google/protobuf/DescriptorProtos$FileOptions;Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaOuterClassname_:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16302(Lcom/google/protobuf/DescriptorProtos$FileOptions;Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaMultipleFiles_:Z

    .line 31
    .line 32
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16402(Lcom/google/protobuf/DescriptorProtos$FileOptions;Z)Z

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
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaGenerateEqualsAndHash_:Z

    .line 42
    .line 43
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16502(Lcom/google/protobuf/DescriptorProtos$FileOptions;Z)Z

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
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaStringCheckUtf8_:Z

    .line 53
    .line 54
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16602(Lcom/google/protobuf/DescriptorProtos$FileOptions;Z)Z

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
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->optimizeFor_:I

    .line 64
    .line 65
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16702(Lcom/google/protobuf/DescriptorProtos$FileOptions;I)I

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
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->goPackage_:Ljava/lang/Object;

    .line 75
    .line 76
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16802(Lcom/google/protobuf/DescriptorProtos$FileOptions;Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ccGenericServices_:Z

    .line 86
    .line 87
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16902(Lcom/google/protobuf/DescriptorProtos$FileOptions;Z)Z

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
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaGenericServices_:Z

    .line 97
    .line 98
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$17002(Lcom/google/protobuf/DescriptorProtos$FileOptions;Z)Z

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
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->pyGenericServices_:Z

    .line 108
    .line 109
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$17102(Lcom/google/protobuf/DescriptorProtos$FileOptions;Z)Z

    .line 110
    .line 111
    .line 112
    or-int/lit16 v1, v1, 0x200

    .line 113
    .line 114
    :cond_9
    and-int/lit16 v2, v0, 0x400

    .line 115
    .line 116
    if-eqz v2, :cond_a

    .line 117
    .line 118
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 119
    .line 120
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$17202(Lcom/google/protobuf/DescriptorProtos$FileOptions;Z)Z

    .line 121
    .line 122
    .line 123
    or-int/lit16 v1, v1, 0x400

    .line 124
    .line 125
    :cond_a
    and-int/lit16 v2, v0, 0x800

    .line 126
    .line 127
    if-eqz v2, :cond_b

    .line 128
    .line 129
    iget-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ccEnableArenas_:Z

    .line 130
    .line 131
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$17302(Lcom/google/protobuf/DescriptorProtos$FileOptions;Z)Z

    .line 132
    .line 133
    .line 134
    or-int/lit16 v1, v1, 0x800

    .line 135
    .line 136
    :cond_b
    and-int/lit16 v2, v0, 0x1000

    .line 137
    .line 138
    if-eqz v2, :cond_c

    .line 139
    .line 140
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->objcClassPrefix_:Ljava/lang/Object;

    .line 141
    .line 142
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$17402(Lcom/google/protobuf/DescriptorProtos$FileOptions;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    or-int/lit16 v1, v1, 0x1000

    .line 146
    .line 147
    :cond_c
    and-int/lit16 v2, v0, 0x2000

    .line 148
    .line 149
    if-eqz v2, :cond_d

    .line 150
    .line 151
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->csharpNamespace_:Ljava/lang/Object;

    .line 152
    .line 153
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$17502(Lcom/google/protobuf/DescriptorProtos$FileOptions;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    or-int/lit16 v1, v1, 0x2000

    .line 157
    .line 158
    :cond_d
    and-int/lit16 v2, v0, 0x4000

    .line 159
    .line 160
    if-eqz v2, :cond_e

    .line 161
    .line 162
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->swiftPrefix_:Ljava/lang/Object;

    .line 163
    .line 164
    invoke-static {p1, v2}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$17602(Lcom/google/protobuf/DescriptorProtos$FileOptions;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    or-int/lit16 v1, v1, 0x4000

    .line 168
    .line 169
    :cond_e
    const v2, 0x8000

    .line 170
    .line 171
    .line 172
    and-int v3, v0, v2

    .line 173
    .line 174
    if-eqz v3, :cond_f

    .line 175
    .line 176
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpClassPrefix_:Ljava/lang/Object;

    .line 177
    .line 178
    invoke-static {p1, v3}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$17702(Lcom/google/protobuf/DescriptorProtos$FileOptions;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    or-int/2addr v1, v2

    .line 182
    :cond_f
    const/high16 v2, 0x10000

    .line 183
    .line 184
    and-int v3, v0, v2

    .line 185
    .line 186
    if-eqz v3, :cond_10

    .line 187
    .line 188
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpNamespace_:Ljava/lang/Object;

    .line 189
    .line 190
    invoke-static {p1, v3}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$17802(Lcom/google/protobuf/DescriptorProtos$FileOptions;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    or-int/2addr v1, v2

    .line 194
    :cond_10
    const/high16 v2, 0x20000

    .line 195
    .line 196
    and-int v3, v0, v2

    .line 197
    .line 198
    if-eqz v3, :cond_11

    .line 199
    .line 200
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpMetadataNamespace_:Ljava/lang/Object;

    .line 201
    .line 202
    invoke-static {p1, v3}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$17902(Lcom/google/protobuf/DescriptorProtos$FileOptions;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    or-int/2addr v1, v2

    .line 206
    :cond_11
    const/high16 v2, 0x40000

    .line 207
    .line 208
    and-int v3, v0, v2

    .line 209
    .line 210
    if-eqz v3, :cond_12

    .line 211
    .line 212
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->rubyPackage_:Ljava/lang/Object;

    .line 213
    .line 214
    invoke-static {p1, v3}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$18002(Lcom/google/protobuf/DescriptorProtos$FileOptions;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    or-int/2addr v1, v2

    .line 218
    :cond_12
    const/high16 v2, 0x80000

    .line 219
    .line 220
    and-int/2addr v0, v2

    .line 221
    if-eqz v0, :cond_14

    .line 222
    .line 223
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 224
    .line 225
    if-nez v0, :cond_13

    .line 226
    .line 227
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 228
    .line 229
    goto :goto_1

    .line 230
    :cond_13
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/GeneratedMessage;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 235
    .line 236
    :goto_1
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$18102(Lcom/google/protobuf/DescriptorProtos$FileOptions;Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 237
    .line 238
    .line 239
    or-int/2addr v1, v2

    .line 240
    :cond_14
    invoke-static {p1, v1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$18276(Lcom/google/protobuf/DescriptorProtos$FileOptions;I)I

    .line 241
    .line 242
    .line 243
    return-void
.end method

.method private buildPartialRepeatedFields(Lcom/google/protobuf/DescriptorProtos$FileOptions;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/high16 v1, 0x100000

    .line 8
    .line 9
    and-int/2addr v0, v1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 19
    .line 20
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 21
    .line 22
    const v1, -0x100001

    .line 23
    .line 24
    .line 25
    and-int/2addr v0, v1

    .line 26
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 27
    .line 28
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16102(Lcom/google/protobuf/DescriptorProtos$FileOptions;Ljava/util/List;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏世哲兰()Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p1, p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16102(Lcom/google/protobuf/DescriptorProtos$FileOptions;Ljava/util/List;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private ensureUninterpretedOptionIsMutable()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    const/high16 v1, 0x100000

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 11
    .line 12
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 16
    .line 17
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 18
    .line 19
    or-int/2addr v0, v1

    .line 20
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世楪兰苏哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
    return-object v0
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
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

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
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 26
    .line 27
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

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
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

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
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->internalGetFeaturesFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllUninterpretedOption(Ljava/lang/Iterable;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;",
            ">;)",
            "Lcom/google/protobuf/DescriptorProtos$FileOptions$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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

.method public addExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;Ljava/lang/Object;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u54f2\u4e16\u82cf;",
            "TType;)",
            "Lcom/google/protobuf/DescriptorProtos$FileOptions$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->addExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    return-object p0
.end method

.method public addUninterpretedOption(ILcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 42
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 43
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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

.method public addUninterpretedOption(ILcom/google/protobuf/DescriptorProtos$UninterpretedOption;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 32
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 33
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 34
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰苏哲(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

.method public addUninterpretedOption(Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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

.method public addUninterpretedOption(Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 38
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

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
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

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

.method public build()Lcom/google/protobuf/DescriptorProtos$FileOptions;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 18
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    move-result-object p0

    return-object p0
.end method

.method public buildPartial()Lcom/google/protobuf/DescriptorProtos$FileOptions;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;-><init>(Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;Lcom/google/protobuf/飘花落叶言子世兰楪苏哲;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->buildPartialRepeatedFields(Lcom/google/protobuf/DescriptorProtos$FileOptions;)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->buildPartial0(Lcom/google/protobuf/DescriptorProtos$FileOptions;)V

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->buildPartial()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    move-result-object p0

    return-object p0
.end method

.method public clear()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const-string v1, ""

    .line 8
    .line 9
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaPackage_:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaOuterClassname_:Ljava/lang/Object;

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaMultipleFiles_:Z

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaGenerateEqualsAndHash_:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaStringCheckUtf8_:Z

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    iput v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->optimizeFor_:I

    .line 21
    .line 22
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->goPackage_:Ljava/lang/Object;

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ccGenericServices_:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaGenericServices_:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->pyGenericServices_:Z

    .line 29
    .line 30
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 31
    .line 32
    iput-boolean v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ccEnableArenas_:Z

    .line 33
    .line 34
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->objcClassPrefix_:Ljava/lang/Object;

    .line 35
    .line 36
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->csharpNamespace_:Ljava/lang/Object;

    .line 37
    .line 38
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->swiftPrefix_:Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpClassPrefix_:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpNamespace_:Ljava/lang/Object;

    .line 43
    .line 44
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpMetadataNamespace_:Ljava/lang/Object;

    .line 45
    .line 46
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->rubyPackage_:Ljava/lang/Object;

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 50
    .line 51
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 52
    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    iput-object v0, v1, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 56
    .line 57
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 58
    .line 59
    :cond_0
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 60
    .line 61
    if-nez v1, :cond_1

    .line 62
    .line 63
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 64
    .line 65
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 69
    .line 70
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏世兰哲()V

    .line 71
    .line 72
    .line 73
    :goto_0
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 74
    .line 75
    const v1, -0x100001

    .line 76
    .line 77
    .line 78
    and-int/2addr v0, v1

    .line 79
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 80
    .line 81
    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 83
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 82
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 85
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 84
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 86
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->clear()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public clearCcEnableArenas()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, -0x801

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ccEnableArenas_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearCcGenericServices()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, -0x81

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ccGenericServices_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearCsharpNamespace()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getCsharpNamespace()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->csharpNamespace_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    and-int/lit16 v0, v0, -0x2001

    .line 14
    .line 15
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public clearDeprecated()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, -0x401

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u54f2\u4e16\u82cf;",
            ")",
            "Lcom/google/protobuf/DescriptorProtos$FileOptions$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->clearExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    return-object p0
.end method

.method public clearFeatures()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    const v1, -0x80001

    .line 4
    .line 5
    .line 6
    and-int/2addr v0, v1

    .line 7
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iput-object v0, v1, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public clearGoPackage()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getGoPackage()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->goPackage_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    and-int/lit8 v0, v0, -0x41

    .line 14
    .line 15
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public clearJavaGenerateEqualsAndHash()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x9

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaGenerateEqualsAndHash_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearJavaGenericServices()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, -0x101

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaGenericServices_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearJavaMultipleFiles()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x5

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaMultipleFiles_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearJavaOuterClassname()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getJavaOuterClassname()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaOuterClassname_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    and-int/lit8 v0, v0, -0x3

    .line 14
    .line 15
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public clearJavaPackage()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getJavaPackage()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaPackage_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    and-int/lit8 v0, v0, -0x2

    .line 14
    .line 15
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public clearJavaStringCheckUtf8()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x11

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaStringCheckUtf8_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearObjcClassPrefix()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getObjcClassPrefix()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->objcClassPrefix_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    and-int/lit16 v0, v0, -0x1001

    .line 14
    .line 15
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public clearOptimizeFor()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, -0x21

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->optimizeFor_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearPhpClassPrefix()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getPhpClassPrefix()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpClassPrefix_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    const v1, -0x8001

    .line 14
    .line 15
    .line 16
    and-int/2addr v0, v1

    .line 17
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public clearPhpMetadataNamespace()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getPhpMetadataNamespace()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpMetadataNamespace_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    const v1, -0x20001

    .line 14
    .line 15
    .line 16
    and-int/2addr v0, v1

    .line 17
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public clearPhpNamespace()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getPhpNamespace()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpNamespace_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    const v1, -0x10001

    .line 14
    .line 15
    .line 16
    and-int/2addr v0, v1

    .line 17
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public clearPyGenericServices()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, -0x201

    .line 4
    .line 5
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->pyGenericServices_:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public clearRubyPackage()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getRubyPackage()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->rubyPackage_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    const v1, -0x40001

    .line 14
    .line 15
    .line 16
    and-int/2addr v0, v1

    .line 17
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public clearSwiftPrefix()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getSwiftPrefix()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->swiftPrefix_:Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    and-int/lit16 v0, v0, -0x4001

    .line 14
    .line 15
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public clearUninterpretedOption()Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 8
    .line 9
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 10
    .line 11
    const v1, -0x100001

    .line 12
    .line 13
    .line 14
    and-int/2addr v0, v1

    .line 15
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪苏世兰哲()V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public getCcEnableArenas()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ccEnableArenas_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getCcGenericServices()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ccGenericServices_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getCsharpNamespace()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->csharpNamespace_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->csharpNamespace_:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    return-object v1

    .line 22
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
.end method

.method public getCsharpNamespaceBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->csharpNamespace_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->csharpNamespace_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FileOptions;
    .locals 0

    .line 7
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FileOptions;

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
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;
    .locals 0

    .line 1
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世楪兰苏哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 2
    .line 3
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

.method public getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

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
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    const/high16 v1, 0x80000

    .line 4
    .line 5
    or-int/2addr v0, v1

    .line 6
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->internalGetFeaturesFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世哲兰苏()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    return-object p0
.end method

.method public getFeaturesOrBuilder()Lcom/google/protobuf/飘花落叶言子哲世楪兰苏;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

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
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

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

.method public getGoPackage()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->goPackage_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->goPackage_:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    return-object v1

    .line 22
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
.end method

.method public getGoPackageBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->goPackage_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->goPackage_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getJavaGenerateEqualsAndHash()Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaGenerateEqualsAndHash_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getJavaGenericServices()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaGenericServices_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getJavaMultipleFiles()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaMultipleFiles_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getJavaOuterClassname()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaOuterClassname_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaOuterClassname_:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    return-object v1

    .line 22
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
.end method

.method public getJavaOuterClassnameBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaOuterClassname_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaOuterClassname_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getJavaPackage()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaPackage_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaPackage_:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    return-object v1

    .line 22
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
.end method

.method public getJavaPackageBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaPackage_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaPackage_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getJavaStringCheckUtf8()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaStringCheckUtf8_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getObjcClassPrefix()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->objcClassPrefix_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->objcClassPrefix_:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    return-object v1

    .line 22
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
.end method

.method public getObjcClassPrefixBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->objcClassPrefix_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->objcClassPrefix_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getOptimizeFor()Lcom/google/protobuf/DescriptorProtos$FileOptions$OptimizeMode;
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->optimizeFor_:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$OptimizeMode;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FileOptions$OptimizeMode;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$OptimizeMode;->SPEED:Lcom/google/protobuf/DescriptorProtos$FileOptions$OptimizeMode;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public getPhpClassPrefix()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpClassPrefix_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpClassPrefix_:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    return-object v1

    .line 22
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
.end method

.method public getPhpClassPrefixBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpClassPrefix_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpClassPrefix_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getPhpMetadataNamespace()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpMetadataNamespace_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpMetadataNamespace_:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    return-object v1

    .line 22
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
.end method

.method public getPhpMetadataNamespaceBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpMetadataNamespace_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpMetadataNamespace_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getPhpNamespace()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpNamespace_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpNamespace_:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    return-object v1

    .line 22
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
.end method

.method public getPhpNamespaceBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpNamespace_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpNamespace_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getPyGenericServices()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->pyGenericServices_:Z

    .line 2
    .line 3
    return p0
.end method

.method public getRubyPackage()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->rubyPackage_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->rubyPackage_:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    return-object v1

    .line 22
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
.end method

.method public getRubyPackageBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->rubyPackage_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->rubyPackage_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getSwiftPrefix()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->swiftPrefix_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->swiftPrefix_:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    return-object v1

    .line 22
    :cond_1
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
.end method

.method public getSwiftPrefixBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->swiftPrefix_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->swiftPrefix_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getUninterpretedOption(I)Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

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
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

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
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

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
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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

.method public hasCcEnableArenas()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasCcGenericServices()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasCsharpNamespace()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x2000

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
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x400

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

.method public hasFeatures()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    const/high16 v0, 0x80000

    .line 4
    .line 5
    and-int/2addr p0, v0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public hasGoPackage()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasJavaGenerateEqualsAndHash()Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasJavaGenericServices()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasJavaMultipleFiles()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasJavaOuterClassname()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasJavaPackage()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasJavaStringCheckUtf8()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasObjcClassPrefix()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasOptimizeFor()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

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

.method public hasPhpClassPrefix()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    const v0, 0x8000

    .line 4
    .line 5
    .line 6
    and-int/2addr p0, v0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public hasPhpMetadataNamespace()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    const/high16 v0, 0x20000

    .line 4
    .line 5
    and-int/2addr p0, v0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public hasPhpNamespace()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    const/high16 v0, 0x10000

    .line 4
    .line 5
    and-int/2addr p0, v0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public hasPyGenericServices()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x200

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

.method public hasRubyPackage()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    const/high16 v0, 0x40000

    .line 4
    .line 5
    and-int/2addr p0, v0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public hasSwiftPrefix()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x4000

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
    sget-object p0, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子世楪兰哲苏:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 2
    .line 3
    const-class v0, Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 4
    .line 5
    const-class v1, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->hasFeatures()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->getUninterpretedOptionCount()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-ge v0, v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->getUninterpretedOption(I)Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

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

.method public mergeFeatures(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    .line 2
    .line 3
    const/high16 v1, 0x80000

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    and-int/2addr v0, v1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eq v0, v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->getFeaturesBuilder()Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏世哲兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 41
    .line 42
    or-int/2addr p1, v1

    .line 43
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 3

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FileOptions;

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
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasJavaPackage()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16200(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaPackage_:Ljava/lang/Object;

    .line 19
    .line 20
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 21
    .line 22
    or-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasJavaOuterClassname()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16300(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaOuterClassname_:Ljava/lang/Object;

    .line 40
    .line 41
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 42
    .line 43
    or-int/lit8 v0, v0, 0x2

    .line 44
    .line 45
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasJavaMultipleFiles()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getJavaMultipleFiles()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->setJavaMultipleFiles(Z)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasJavaGenerateEqualsAndHash()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getJavaGenerateEqualsAndHash()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->setJavaGenerateEqualsAndHash(Z)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    .line 74
    .line 75
    .line 76
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasJavaStringCheckUtf8()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getJavaStringCheckUtf8()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->setJavaStringCheckUtf8(Z)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    .line 87
    .line 88
    .line 89
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasOptimizeFor()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getOptimizeFor()Lcom/google/protobuf/DescriptorProtos$FileOptions$OptimizeMode;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->setOptimizeFor(Lcom/google/protobuf/DescriptorProtos$FileOptions$OptimizeMode;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    .line 100
    .line 101
    .line 102
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasGoPackage()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_7

    .line 107
    .line 108
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16800(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->goPackage_:Ljava/lang/Object;

    .line 113
    .line 114
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 115
    .line 116
    or-int/lit8 v0, v0, 0x40

    .line 117
    .line 118
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 121
    .line 122
    .line 123
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasCcGenericServices()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_8

    .line 128
    .line 129
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getCcGenericServices()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->setCcGenericServices(Z)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    .line 134
    .line 135
    .line 136
    :cond_8
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasJavaGenericServices()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_9

    .line 141
    .line 142
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getJavaGenericServices()Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->setJavaGenericServices(Z)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    .line 147
    .line 148
    .line 149
    :cond_9
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasPyGenericServices()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_a

    .line 154
    .line 155
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getPyGenericServices()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->setPyGenericServices(Z)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    .line 160
    .line 161
    .line 162
    :cond_a
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasDeprecated()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_b

    .line 167
    .line 168
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getDeprecated()Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->setDeprecated(Z)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    .line 173
    .line 174
    .line 175
    :cond_b
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasCcEnableArenas()Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_c

    .line 180
    .line 181
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getCcEnableArenas()Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->setCcEnableArenas(Z)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    .line 186
    .line 187
    .line 188
    :cond_c
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasObjcClassPrefix()Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_d

    .line 193
    .line 194
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$17400(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->objcClassPrefix_:Ljava/lang/Object;

    .line 199
    .line 200
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 201
    .line 202
    or-int/lit16 v0, v0, 0x1000

    .line 203
    .line 204
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 205
    .line 206
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 207
    .line 208
    .line 209
    :cond_d
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasCsharpNamespace()Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_e

    .line 214
    .line 215
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$17500(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->csharpNamespace_:Ljava/lang/Object;

    .line 220
    .line 221
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 222
    .line 223
    or-int/lit16 v0, v0, 0x2000

    .line 224
    .line 225
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 226
    .line 227
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 228
    .line 229
    .line 230
    :cond_e
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasSwiftPrefix()Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_f

    .line 235
    .line 236
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$17600(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->swiftPrefix_:Ljava/lang/Object;

    .line 241
    .line 242
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 243
    .line 244
    or-int/lit16 v0, v0, 0x4000

    .line 245
    .line 246
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 247
    .line 248
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 249
    .line 250
    .line 251
    :cond_f
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasPhpClassPrefix()Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-eqz v0, :cond_10

    .line 256
    .line 257
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$17700(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpClassPrefix_:Ljava/lang/Object;

    .line 262
    .line 263
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 264
    .line 265
    const v1, 0x8000

    .line 266
    .line 267
    .line 268
    or-int/2addr v0, v1

    .line 269
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 270
    .line 271
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 272
    .line 273
    .line 274
    :cond_10
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasPhpNamespace()Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-eqz v0, :cond_11

    .line 279
    .line 280
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$17800(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpNamespace_:Ljava/lang/Object;

    .line 285
    .line 286
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 287
    .line 288
    const/high16 v1, 0x10000

    .line 289
    .line 290
    or-int/2addr v0, v1

    .line 291
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 292
    .line 293
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 294
    .line 295
    .line 296
    :cond_11
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasPhpMetadataNamespace()Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-eqz v0, :cond_12

    .line 301
    .line 302
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$17900(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpMetadataNamespace_:Ljava/lang/Object;

    .line 307
    .line 308
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 309
    .line 310
    const/high16 v1, 0x20000

    .line 311
    .line 312
    or-int/2addr v0, v1

    .line 313
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 314
    .line 315
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 316
    .line 317
    .line 318
    :cond_12
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasRubyPackage()Z

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    if-eqz v0, :cond_13

    .line 323
    .line 324
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$18000(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->rubyPackage_:Ljava/lang/Object;

    .line 329
    .line 330
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 331
    .line 332
    const/high16 v1, 0x40000

    .line 333
    .line 334
    or-int/2addr v0, v1

    .line 335
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 336
    .line 337
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 338
    .line 339
    .line 340
    :cond_13
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hasFeatures()Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-eqz v0, :cond_14

    .line 345
    .line 346
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getFeatures()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->mergeFeatures(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    .line 351
    .line 352
    .line 353
    :cond_14
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 354
    .line 355
    const v1, -0x100001

    .line 356
    .line 357
    .line 358
    if-nez v0, :cond_16

    .line 359
    .line 360
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16100(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Ljava/util/List;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    if-nez v0, :cond_19

    .line 369
    .line 370
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 371
    .line 372
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-eqz v0, :cond_15

    .line 377
    .line 378
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16100(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 383
    .line 384
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 385
    .line 386
    and-int/2addr v0, v1

    .line 387
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 388
    .line 389
    goto :goto_0

    .line 390
    :cond_15
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 391
    .line 392
    .line 393
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 394
    .line 395
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16100(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Ljava/util/List;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 400
    .line 401
    .line 402
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 403
    .line 404
    .line 405
    goto :goto_1

    .line 406
    :cond_16
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16100(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Ljava/util/List;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    if-nez v0, :cond_19

    .line 415
    .line 416
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 417
    .line 418
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;

    .line 419
    .line 420
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 425
    .line 426
    if-eqz v0, :cond_18

    .line 427
    .line 428
    const/4 v0, 0x0

    .line 429
    iput-object v0, v2, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言子楪世苏兰哲;

    .line 430
    .line 431
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 432
    .line 433
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16100(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Ljava/util/List;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    iput-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    .line 438
    .line 439
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 440
    .line 441
    and-int/2addr v1, v2

    .line 442
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 443
    .line 444
    sget-boolean v1, Lcom/google/protobuf/GeneratedMessage;->alwaysUseFieldBuilders:Z

    .line 445
    .line 446
    if-eqz v1, :cond_17

    .line 447
    .line 448
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->internalGetUninterpretedOptionFieldBuilder()Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    :cond_17
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 453
    .line 454
    goto :goto_1

    .line 455
    :cond_18
    invoke-static {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->access$16100(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Ljava/util/List;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-virtual {v2, v0}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Iterable;)V

    .line 460
    .line 461
    .line 462
    :cond_19
    :goto_1
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->mergeExtensionFields(Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 466
    .line 467
    .line 468
    move-result-object p1

    .line 469
    invoke-virtual {p0, p1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownFields(Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    .line 470
    .line 471
    .line 472
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 473
    .line 474
    .line 475
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 481
    instance-of v0, p1, Lcom/google/protobuf/DescriptorProtos$FileOptions;

    if-eqz v0, :cond_0

    .line 482
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$FileOptions;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$FileOptions;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0

    .line 483
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 3

    .line 485
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    :goto_0
    if-nez v0, :cond_3

    .line 486
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏哲兰楪()I

    move-result v1

    const/4 v2, 0x1

    sparse-switch v1, :sswitch_data_0

    .line 487
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->parseUnknownField(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;I)Z

    move-result v1

    if-nez v1, :cond_0

    :sswitch_0
    move v0, v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :catch_0
    move-exception p1

    goto/16 :goto_1

    .line 488
    :sswitch_1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;->parser()Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;

    move-result-object v1

    .line 489
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲世苏(Lcom/google/protobuf/飘花落叶言世哲楪苏兰子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    move-result-object v1

    check-cast v1, Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;

    .line 490
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v2, :cond_1

    .line 491
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 492
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 493
    :cond_1
    invoke-virtual {v2, v1}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/GeneratedMessage;)V

    goto :goto_0

    .line 494
    :sswitch_2
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->internalGetFeaturesFieldBuilder()Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪世哲兰苏()Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;

    move-result-object v1

    .line 495
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲苏世(Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V

    .line 496
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    const/high16 v2, 0x80000

    or-int/2addr v1, v2

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto :goto_0

    .line 497
    :sswitch_3
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->rubyPackage_:Ljava/lang/Object;

    .line 498
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    const/high16 v2, 0x40000

    or-int/2addr v1, v2

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto :goto_0

    .line 499
    :sswitch_4
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpMetadataNamespace_:Ljava/lang/Object;

    .line 500
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    const/high16 v2, 0x20000

    or-int/2addr v1, v2

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto :goto_0

    .line 501
    :sswitch_5
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpNamespace_:Ljava/lang/Object;

    .line 502
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    const/high16 v2, 0x10000

    or-int/2addr v1, v2

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto :goto_0

    .line 503
    :sswitch_6
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpClassPrefix_:Ljava/lang/Object;

    .line 504
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    const v2, 0x8000

    or-int/2addr v1, v2

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto :goto_0

    .line 505
    :sswitch_7
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->swiftPrefix_:Ljava/lang/Object;

    .line 506
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit16 v1, v1, 0x4000

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 507
    :sswitch_8
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->csharpNamespace_:Ljava/lang/Object;

    .line 508
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit16 v1, v1, 0x2000

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 509
    :sswitch_9
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->objcClassPrefix_:Ljava/lang/Object;

    .line 510
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit16 v1, v1, 0x1000

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 511
    :sswitch_a
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ccEnableArenas_:Z

    .line 512
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit16 v1, v1, 0x800

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 513
    :sswitch_b
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaStringCheckUtf8_:Z

    .line 514
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x10

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 515
    :sswitch_c
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 516
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit16 v1, v1, 0x400

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 517
    :sswitch_d
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaGenerateEqualsAndHash_:Z

    .line 518
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x8

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 519
    :sswitch_e
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->pyGenericServices_:Z

    .line 520
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit16 v1, v1, 0x200

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 521
    :sswitch_f
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaGenericServices_:Z

    .line 522
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit16 v1, v1, 0x100

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 523
    :sswitch_10
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ccGenericServices_:Z

    .line 524
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit16 v1, v1, 0x80

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 525
    :sswitch_11
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->goPackage_:Ljava/lang/Object;

    .line 526
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x40

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 527
    :sswitch_12
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世苏兰()Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaMultipleFiles_:Z

    .line 528
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 529
    :sswitch_13
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()I

    move-result v1

    .line 530
    invoke-static {v1}, Lcom/google/protobuf/DescriptorProtos$FileOptions$OptimizeMode;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FileOptions$OptimizeMode;

    move-result-object v2

    if-nez v2, :cond_2

    const/16 v2, 0x9

    .line 531
    invoke-virtual {p0, v2, v1}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->mergeUnknownVarintField(II)V

    goto/16 :goto_0

    .line 532
    :cond_2
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->optimizeFor_:I

    .line 533
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x20

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 534
    :sswitch_14
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaOuterClassname_:Ljava/lang/Object;

    .line 535
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    goto/16 :goto_0

    .line 536
    :sswitch_15
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaPackage_:Ljava/lang/Object;

    .line 537
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    or-int/2addr v1, v2

    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 538
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 539
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 540
    throw p1

    .line 541
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_15
        0x42 -> :sswitch_14
        0x48 -> :sswitch_13
        0x50 -> :sswitch_12
        0x5a -> :sswitch_11
        0x80 -> :sswitch_10
        0x88 -> :sswitch_f
        0x90 -> :sswitch_e
        0xa0 -> :sswitch_d
        0xb8 -> :sswitch_c
        0xd8 -> :sswitch_b
        0xf8 -> :sswitch_a
        0x122 -> :sswitch_9
        0x12a -> :sswitch_8
        0x13a -> :sswitch_7
        0x142 -> :sswitch_6
        0x14a -> :sswitch_5
        0x162 -> :sswitch_4
        0x16a -> :sswitch_3
        0x192 -> :sswitch_2
        0x1f3a -> :sswitch_1
    .end sparse-switch
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 480
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 479
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪子兰哲;
    .locals 0

    .line 478
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 477
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 476
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 484
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    move-result-object p0

    return-object p0
.end method

.method public removeUninterpretedOption(I)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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

.method public setCcEnableArenas(Z)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ccEnableArenas_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit16 p1, p1, 0x800

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setCcGenericServices(Z)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ccGenericServices_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit16 p1, p1, 0x80

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setCsharpNamespace(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->csharpNamespace_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit16 p1, p1, 0x2000

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setCsharpNamespaceBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->csharpNamespace_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit16 p1, p1, 0x2000

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setDeprecated(Z)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->deprecated_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit16 p1, p1, 0x400

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;ILjava/lang/Object;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u54f2\u4e16\u82cf;",
            "ITType;)",
            "Lcom/google/protobuf/DescriptorProtos$FileOptions$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 8
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->setExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    return-object p0
.end method

.method public setExtension(Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;Ljava/lang/Object;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u5b50\u54f2\u4e16\u82cf;",
            "TType;)",
            "Lcom/google/protobuf/DescriptorProtos$FileOptions$\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;->setExtension(Lcom/google/protobuf/飘花落叶言楪世兰子哲苏;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    return-object p0
.end method

.method public setFeatures(Lcom/google/protobuf/DescriptorProtos$FeatureSet$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

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
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

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
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 20
    .line 21
    const/high16 v0, 0x80000

    .line 22
    .line 23
    or-int/2addr p1, v0

    .line 24
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public setFeatures(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->featuresBuilder_:Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;

    if-nez v0, :cond_0

    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->features_:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/飘花落叶言世兰子哲苏楪;->飘花落叶言子楪苏哲世兰(Lcom/google/protobuf/GeneratedMessage;)V

    .line 34
    :goto_0
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    const/high16 v0, 0x80000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 35
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0
.end method

.method public setGoPackage(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->goPackage_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x40

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setGoPackageBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->goPackage_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x40

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setJavaGenerateEqualsAndHash(Z)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaGenerateEqualsAndHash_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setJavaGenericServices(Z)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaGenericServices_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit16 p1, p1, 0x100

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setJavaMultipleFiles(Z)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaMultipleFiles_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x4

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setJavaOuterClassname(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaOuterClassname_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x2

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setJavaOuterClassnameBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaOuterClassname_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x2

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setJavaPackage(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaPackage_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setJavaPackageBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaPackage_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setJavaStringCheckUtf8(Z)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->javaStringCheckUtf8_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x10

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setObjcClassPrefix(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->objcClassPrefix_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit16 p1, p1, 0x1000

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setObjcClassPrefixBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->objcClassPrefix_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit16 p1, p1, 0x1000

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setOptimizeFor(Lcom/google/protobuf/DescriptorProtos$FileOptions$OptimizeMode;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x20

    .line 7
    .line 8
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileOptions$OptimizeMode;->getNumber()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->optimizeFor_:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public setPhpClassPrefix(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpClassPrefix_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    const v0, 0x8000

    .line 9
    .line 10
    .line 11
    or-int/2addr p1, v0

    .line 12
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public setPhpClassPrefixBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpClassPrefix_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    const v0, 0x8000

    .line 9
    .line 10
    .line 11
    or-int/2addr p1, v0

    .line 12
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public setPhpMetadataNamespace(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpMetadataNamespace_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    const/high16 v0, 0x20000

    .line 9
    .line 10
    or-int/2addr p1, v0

    .line 11
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public setPhpMetadataNamespaceBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpMetadataNamespace_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    const/high16 v0, 0x20000

    .line 9
    .line 10
    or-int/2addr p1, v0

    .line 11
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public setPhpNamespace(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpNamespace_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    const/high16 v0, 0x10000

    .line 9
    .line 10
    or-int/2addr p1, v0

    .line 11
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public setPhpNamespaceBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->phpNamespace_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    const/high16 v0, 0x10000

    .line 9
    .line 10
    or-int/2addr p1, v0

    .line 11
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public setPyGenericServices(Z)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->pyGenericServices_:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 4
    .line 5
    or-int/lit16 p1, p1, 0x200

    .line 6
    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setRubyPackage(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->rubyPackage_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    const/high16 v0, 0x40000

    .line 9
    .line 10
    or-int/2addr p1, v0

    .line 11
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public setRubyPackageBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->rubyPackage_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    const/high16 v0, 0x40000

    .line 9
    .line 10
    or-int/2addr p1, v0

    .line 11
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public setSwiftPrefix(Ljava/lang/String;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->swiftPrefix_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit16 p1, p1, 0x4000

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setSwiftPrefixBytes(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->swiftPrefix_:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 7
    .line 8
    or-int/lit16 p1, p1, 0x4000

    .line 9
    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->bitField0_:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public setUninterpretedOption(ILcom/google/protobuf/DescriptorProtos$UninterpretedOption$飘花落叶言子楪世苏哲兰;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

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

.method public setUninterpretedOption(ILcom/google/protobuf/DescriptorProtos$UninterpretedOption;)Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOptionBuilder_:Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-direct {p0}, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->ensureUninterpretedOptionIsMutable()V

    .line 32
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileOptions$飘花落叶言子楪世苏哲兰;->uninterpretedOption_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 33
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$飘花落叶言子楪世苏哲兰;->onChanged()V

    return-object p0

    .line 34
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/飘花落叶言世哲兰苏子楪;->飘花落叶言子楪兰世哲苏(ILcom/google/protobuf/GeneratedMessage;)V

    return-object p0
.end method

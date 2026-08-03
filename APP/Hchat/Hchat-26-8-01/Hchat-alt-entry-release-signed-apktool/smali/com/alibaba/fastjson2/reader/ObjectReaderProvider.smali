.class public Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$LRUAutoTypeCache;,
        Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$ObjectReaderCachePair;
    }
.end annotation


# static fields
.field static readerCache:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$ObjectReaderCachePair;


# instance fields
.field private acceptHashCodes:[J

.field private autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

.field private autoTypeHandler:Ljava/util/function/Consumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Consumer<",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field

.field final autoTypeList:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$LRUAutoTypeCache;

.field final cache:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/reader/ObjectReader;",
            ">;"
        }
    .end annotation
.end field

.field final cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/reader/ObjectReader;",
            ">;"
        }
    .end annotation
.end field

.field public final creator:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

.field private denyHashCodes:[J

.field final hashCache:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/Long;",
            "Lcom/alibaba/fastjson2/reader/ObjectReader;",
            ">;"
        }
    .end annotation
.end field

.field final mixInCache:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/Class;",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field

.field private typeConverts:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/function/Function;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->hashCache:Ljava/util/concurrent/ConcurrentMap;

    .line 24
    .line 25
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 31
    .line 32
    new-instance v1, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$LRUAutoTypeCache;

    .line 33
    .line 34
    const/16 v2, 0x400

    .line 35
    .line 36
    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$LRUAutoTypeCache;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->autoTypeList:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$LRUAutoTypeCache;

    .line 40
    .line 41
    const/16 v1, 0xa2

    .line 42
    .line 43
    new-array v1, v1, [J

    .line 44
    .line 45
    fill-array-data v1, :array_0

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->denyHashCodes:[J

    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    new-array v1, v1, [J

    .line 52
    .line 53
    const-wide v2, -0x575556d6bb90031cL    # -8.660931078614971E-113

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    aput-wide v2, v1, v4

    .line 60
    .line 61
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->acceptHashCodes:[J

    .line 62
    .line 63
    sget-wide v1, Lcom/alibaba/fastjson2/reader/ObjectArrayReader;->TYPE_HASH_CODE:J

    .line 64
    .line 65
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    sget-object v2, Lcom/alibaba/fastjson2/reader/ObjectArrayReader;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectArrayReader;

    .line 70
    .line 71
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    const-wide v1, -0x4318000b8f6218c8L    # -2.6645156755451724E-15

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    sget-object v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplString;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplString;

    .line 84
    .line 85
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    const-wide/16 v1, 0x4d

    .line 89
    .line 90
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    sget-object v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 95
    .line 96
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 100
    .line 101
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->creator:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->init()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :array_0
    .array-data 8
        -0x7f2f38f433d015feL    # -9.556794763479643E-305
        -0x797c7af6a5dd8da1L    # -2.752875440315231E-277
        -0x7903d40641508511L    # -5.085553800937495E-275
        -0x780ad5e4f815cc5aL
        -0x778d0d602f4f4859L    # -5.73854165649321E-268
        -0x7455117064088059L    # -1.836708762919172E-252
        -0x71522bf34d56bbbdL
        -0x708a0605f20fc080L    # -3.455901468587826E-234
        -0x6e8d5ac0ea86cf51L
        -0x6dedd28ef1c9b048L    # -1.257180119856368E-221
        -0x6be79918c4100b37L    # -7.248495544345653E-212
        -0x6bcfa3d9a7f08c3bL    # -1.943861383644949E-211
        -0x6bc886d7ce2082c1L
        -0x5edc59d06ce874e0L    # -4.802155510082355E-149
        -0x57a77d31efbb3bb0L
        -0x55c250024ef3b6c9L
        -0x555619483e1e3959L
        -0x5555f7d9b785c8c9L
        -0x547da9d0ac191b71L    # -4.191714158844199E-99
        -0x539d9d0ad36755c7L    # -6.886391444241167E-95
        -0x526c85bb67ce1760L    # -3.824696155682281E-89
        -0x51af25e0529f5f6aL    # -1.3554199460470375E-85
        -0x500900dcc771dda6L    # -1.2412673941092185E-77
        -0x5000b36a4665ccb3L    # -1.6894051133204177E-77
        -0x4bf0cbe38b9136b1L    # -6.213767217225293E-58
        -0x4817128a80a2ec5eL    # -2.2892361373052172E-39
        -0x467494ac696cd017L    # -1.6898413909066546E-31
        -0x4322623ed8990f32L    # -1.644030941651994E-15
        -0x431f211cb18d9b67L    # -1.8730190643927076E-15
        -0x41b0ec1695986930L    # -1.4471719223103779E-8
        -0x41458d04e3345bdaL    # -1.5764918430089148E-6
        -0x3ff41e21450d7f75L    # -3.485288105512216
        -0x3ef795051cd19da8L    # -200031.3609283145
        -0x3d99b2f6a71301b4L    # -7.662539098639468E11
        -0x3be00836378383fbL    # -1.4742602222991634E20
        -0x399b4c9c4535faf6L    # -1.3120653062289765E31
        -0x38a661401c18dbfaL    # -5.3210898116926836E35
        -0x372b61a9fe199e57L    # -7.184498624325357E42
        -0x370fb4c5d76f66cbL    # -2.271032093241071E43
        -0x369c96af7d028d72L    # -3.463106763999075E45
        -0x2e10320b4cce92ccL    # -4.9428513655242083E86
        -0x2ab46e33884dc613L    # -7.718587662525667E102
        -0x2a6116e0f4f615ffL    # -2.769276834562512E104
        -0x299097546d18010bL    # -2.305158249887012E108
        -0x2735c2a6a167d454L    # -5.293540616952125E119
        -0x232729ea59bb61c2L    # -1.8485208306343955E139
        -0x21dc5f7f6574642aL    # -3.063522061072579E145
        -0x2103df70dc82befcL    # -3.5965336067206575E149
        -0x20d2200cef324c8bL    # -3.0559968239287952E150
        -0x1f651b9fb7bda7d1L    # -2.3076098125244163E157
        -0x1e6e67fb2a40b971L    # -9.894137060283861E161
        -0x1d14c5381a93b982L    # -3.211360471030518E168
        -0x19fc295ae05296d5L    # -2.6342395696172524E183
        -0x16e7b41aa4e269d6L    # -1.816185970555075E198
        -0x160df452da09f7f9L    # -2.2100835374064227E202
        -0xd67c2f662d64b89L    # -1.0343819992267985E244
        -0xc8fd5b5ab6f4718L
        -0xb8b1bbae70d98caL    # -9.573036758577548E252
        -0xb26c0b04c1c266fL    # -7.404086096916242E254
        -0xa28823071b28e1aL    # -4.514878552434115E259
        -0x93fcbf18c5c9597L
        -0x816918b205a7244L
        -0x388c51df37d896fL
        -0x30c1879bb467428L    # -7.945197787260532E293
        -0x2a4039effa928e0L    # -7.14947811210233E295
        -0x5ea40fde0e1c84L
        -0x22e57f0e12cbfbL
        0x10e067cd55c5e5L
        0x761619136cc13eL
        0x22baa234c5bfb8aL
        0x3085068cb7201b8L
        0x45b11bc78a3aba3L
        0x55cfca0f2281c07L
        0xa555c74fe3a5155L
        0xb6e292fa5955adeL
        0xee6511b66fd5ef0L    # 6.854342740564376E-237
        0x100150a253996624L    # 1.394104277479804E-231
        0x10b2bdca849d9b3eL    # 3.09032861507223E-228
        0x10dbc48446e0dae5L
        0x119b5b1f10210afcL
        0x144277b467723158L    # 4.388573993986807E-211
        0x14db2e6fead04af0L    # 3.307156557815155E-208
        0x154b6cb22d294cfaL    # 4.271035506616844E-206
        0x17924cca5227622aL
        0x193b2697eaaed41aL    # 3.9000001662652114E-187
        0x1cd6f11c6a358bb7L    # 9.498405308272427E-170
        0x1e0a8c3358ff3daeL    # 5.762601583556236E-164
        0x24652ce717e713bbL
        0x24d2f6048fef4e49L
        0x24ec99d5e7dc5571L    # 8.058828264835688E-131
        0x25e962f1c28f71a2L
        0x275d0732b877af29L
        0x28ac82e44e933606L
        0x2a71ce2cc40a710cL    # 3.105364083941061E-104
        0x2ad1ce3a112f015dL
        0x2adfefbbfe29d931L
        0x2b3a37467a344cdfL
        0x2b6dd8b3229d6837L    # 1.7057077092413725E-99
        0x2d308dbbc851b0d8L    # 5.078962391870398E-91
        0x2fe950d3ea52ae0dL    # 6.832216944281275E-78
        0x313bb4abd8d4554cL    # 1.56808971921097E-71
        0x327c8ed7c8706905L    # 1.6948389662237084E-65
        0x332f0b5369a18310L
        0x339a3e0b6beebee9L    # 4.0826654570968825E-60
        0x33c64b921f523f2fL    # 2.77486720533494E-59
        0x33e7f3e02571b153L    # 1.1924611050770566E-58
        0x34a81ee78429fdf1L    # 4.918595094295287E-55
        0x37317698dcfce894L    # 7.830801102106149E-43
        0x378307cb0111e878L    # 2.730734411398275E-41
        0x3826f4b2380c8b9bL    # 3.373058177088523E-38
        0x398f942e01920cf0L    # 1.9461954727645544E-31
        0x3a31412dbb05c7ffL    # 2.1778372103247874E-28
        0x3a7ee0635eb2bc33L    # 6.235462802057997E-27
        0x3adba40367f73264L    # 3.5724737671988184E-25
        0x3b0b51ecbf6db221L    # 2.8248237289442712E-24
        0x42d11a560fc9fba9L    # 7.521924278884664E13
        0x43320dc9d2ae0892L    # 5.08171005500021E15
        0x440e89208f445fb9L    # 7.041042216469549E19
        0x46c808a4b5841f57L    # 9.749252615377375E32
        0x470fd3a18bb39414L    # 2.065669875132854E34
        0x49312bdafb0077d9L    # 3.829330118647328E44
        0x4a3797b30328202cL    # 3.448058737338662E49
        0x4ba3e254e758d70dL    # 2.4377845509161763E56
        0x4bf881e49d37f530L    # 9.614713083096315E57
        0x4cf54eec05e3e818L    # 5.478576021141778E62
        0x4da972745feb30c1L    # 1.339945589251118E66
        0x4ef08c90ff16c675L    # 1.8274816638330285E72
        0x4fd10ddc6d13821fL    # 3.085523505057036E76
        0x521b4f573376df4aL    # 3.3954649887443486E87
        0x527db6b46ce3bcbcL    # 2.3643694017797754E89
        0x535e552d6f9700c1L    # 3.954486474370437E93
        0x54855e265fe1dad5L    # 1.4605211590140444E99
        0x5728504a6d454ffcL    # 7.309005913296069E111
        0x599b5c1213a099acL    # 4.521565120980506E123
        0x5a5bd85c072e5efeL
        0x5ab0cb3071ab40d1L    # 7.275532043244496E128
        0x5b6149820275ea42L
        0x5d74d3e5b9370476L    # 1.5873759122766088E142
        0x5d92e6ddde40ed84L    # 5.762376793011253E142
        0x5e61093ef8cdddbbL    # 4.2545979149900575E146
        0x5f215622fb630753L    # 1.773407570959078E150
        0x61c5bdd721385107L    # 9.781342160839794E162
        0x62db241274397c34L
        0x636ecca2a131b235L    # 9.29884914075952E170
        0x63a220e60a17c7b9L    # 8.757288450874107E171
        0x647ab0224e149ebeL    # 1.0561215288164044E176
        0x65f81b84c1d920cdL    # 1.6005507777082922E183
        0x665c53c311193973L    # 1.2036519694555594E185
        0x6749835432e0f0d2L
        0x69b6e0175084b377L    # 1.750995289311963E201
        0x6a47501ebb2afdb2L    # 9.136601149026956E203
        0x6fcabf6fa54cafffL    # 3.244253068846464E230
        0x6fe92d83fc0a4628L    # 1.2215307041274365E231
        0x746bd4a53ec195fbL    # 6.376313675246868E252
        0x75cc60f5871d0fd3L    # 2.7270901325332595E259
        0x767a586a5107feefL    # 5.184902282980218E262
        0x793addded7a967f5L    # 9.301865880350898E275
        0x7aa7ee3627a19cf3L    # 6.950210684357695E282
        0x7afa070241b8cc4bL    # 2.4189469652688762E284
        0x7ed9311d28bf1a65L    # 1.0797314149657436E303
        0x7ed9481d28bf417aL    # 1.0835821490243428E303
        0x7ee6c477da20bbe3L    # 1.951641816604592E303
    .end array-data
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;)V
    .locals 5

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 109
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 110
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->hashCache:Ljava/util/concurrent/ConcurrentMap;

    .line 111
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 112
    new-instance v1, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$LRUAutoTypeCache;

    const/16 v2, 0x400

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$LRUAutoTypeCache;-><init>(I)V

    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->autoTypeList:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$LRUAutoTypeCache;

    const/16 v1, 0xa2

    .line 113
    new-array v1, v1, [J

    fill-array-data v1, :array_0

    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->denyHashCodes:[J

    const/4 v1, 0x1

    .line 114
    new-array v1, v1, [J

    const-wide v2, -0x575556d6bb90031cL    # -8.660931078614971E-113

    const/4 v4, 0x0

    aput-wide v2, v1, v4

    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->acceptHashCodes:[J

    .line 115
    sget-wide v1, Lcom/alibaba/fastjson2/reader/ObjectArrayReader;->TYPE_HASH_CODE:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, Lcom/alibaba/fastjson2/reader/ObjectArrayReader;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectArrayReader;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide v1, -0x4318000b8f6218c8L    # -2.6645156755451724E-15

    .line 116
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplString;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplString;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v1, 0x4d

    .line 117
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->creator:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 119
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->init()V

    return-void

    :array_0
    .array-data 8
        -0x7f2f38f433d015feL    # -9.556794763479643E-305
        -0x797c7af6a5dd8da1L    # -2.752875440315231E-277
        -0x7903d40641508511L    # -5.085553800937495E-275
        -0x780ad5e4f815cc5aL
        -0x778d0d602f4f4859L    # -5.73854165649321E-268
        -0x7455117064088059L    # -1.836708762919172E-252
        -0x71522bf34d56bbbdL
        -0x708a0605f20fc080L    # -3.455901468587826E-234
        -0x6e8d5ac0ea86cf51L
        -0x6dedd28ef1c9b048L    # -1.257180119856368E-221
        -0x6be79918c4100b37L    # -7.248495544345653E-212
        -0x6bcfa3d9a7f08c3bL    # -1.943861383644949E-211
        -0x6bc886d7ce2082c1L
        -0x5edc59d06ce874e0L    # -4.802155510082355E-149
        -0x57a77d31efbb3bb0L
        -0x55c250024ef3b6c9L
        -0x555619483e1e3959L
        -0x5555f7d9b785c8c9L
        -0x547da9d0ac191b71L    # -4.191714158844199E-99
        -0x539d9d0ad36755c7L    # -6.886391444241167E-95
        -0x526c85bb67ce1760L    # -3.824696155682281E-89
        -0x51af25e0529f5f6aL    # -1.3554199460470375E-85
        -0x500900dcc771dda6L    # -1.2412673941092185E-77
        -0x5000b36a4665ccb3L    # -1.6894051133204177E-77
        -0x4bf0cbe38b9136b1L    # -6.213767217225293E-58
        -0x4817128a80a2ec5eL    # -2.2892361373052172E-39
        -0x467494ac696cd017L    # -1.6898413909066546E-31
        -0x4322623ed8990f32L    # -1.644030941651994E-15
        -0x431f211cb18d9b67L    # -1.8730190643927076E-15
        -0x41b0ec1695986930L    # -1.4471719223103779E-8
        -0x41458d04e3345bdaL    # -1.5764918430089148E-6
        -0x3ff41e21450d7f75L    # -3.485288105512216
        -0x3ef795051cd19da8L    # -200031.3609283145
        -0x3d99b2f6a71301b4L    # -7.662539098639468E11
        -0x3be00836378383fbL    # -1.4742602222991634E20
        -0x399b4c9c4535faf6L    # -1.3120653062289765E31
        -0x38a661401c18dbfaL    # -5.3210898116926836E35
        -0x372b61a9fe199e57L    # -7.184498624325357E42
        -0x370fb4c5d76f66cbL    # -2.271032093241071E43
        -0x369c96af7d028d72L    # -3.463106763999075E45
        -0x2e10320b4cce92ccL    # -4.9428513655242083E86
        -0x2ab46e33884dc613L    # -7.718587662525667E102
        -0x2a6116e0f4f615ffL    # -2.769276834562512E104
        -0x299097546d18010bL    # -2.305158249887012E108
        -0x2735c2a6a167d454L    # -5.293540616952125E119
        -0x232729ea59bb61c2L    # -1.8485208306343955E139
        -0x21dc5f7f6574642aL    # -3.063522061072579E145
        -0x2103df70dc82befcL    # -3.5965336067206575E149
        -0x20d2200cef324c8bL    # -3.0559968239287952E150
        -0x1f651b9fb7bda7d1L    # -2.3076098125244163E157
        -0x1e6e67fb2a40b971L    # -9.894137060283861E161
        -0x1d14c5381a93b982L    # -3.211360471030518E168
        -0x19fc295ae05296d5L    # -2.6342395696172524E183
        -0x16e7b41aa4e269d6L    # -1.816185970555075E198
        -0x160df452da09f7f9L    # -2.2100835374064227E202
        -0xd67c2f662d64b89L    # -1.0343819992267985E244
        -0xc8fd5b5ab6f4718L
        -0xb8b1bbae70d98caL    # -9.573036758577548E252
        -0xb26c0b04c1c266fL    # -7.404086096916242E254
        -0xa28823071b28e1aL    # -4.514878552434115E259
        -0x93fcbf18c5c9597L
        -0x816918b205a7244L
        -0x388c51df37d896fL
        -0x30c1879bb467428L    # -7.945197787260532E293
        -0x2a4039effa928e0L    # -7.14947811210233E295
        -0x5ea40fde0e1c84L
        -0x22e57f0e12cbfbL
        0x10e067cd55c5e5L
        0x761619136cc13eL
        0x22baa234c5bfb8aL
        0x3085068cb7201b8L
        0x45b11bc78a3aba3L
        0x55cfca0f2281c07L
        0xa555c74fe3a5155L
        0xb6e292fa5955adeL
        0xee6511b66fd5ef0L    # 6.854342740564376E-237
        0x100150a253996624L    # 1.394104277479804E-231
        0x10b2bdca849d9b3eL    # 3.09032861507223E-228
        0x10dbc48446e0dae5L
        0x119b5b1f10210afcL
        0x144277b467723158L    # 4.388573993986807E-211
        0x14db2e6fead04af0L    # 3.307156557815155E-208
        0x154b6cb22d294cfaL    # 4.271035506616844E-206
        0x17924cca5227622aL
        0x193b2697eaaed41aL    # 3.9000001662652114E-187
        0x1cd6f11c6a358bb7L    # 9.498405308272427E-170
        0x1e0a8c3358ff3daeL    # 5.762601583556236E-164
        0x24652ce717e713bbL
        0x24d2f6048fef4e49L
        0x24ec99d5e7dc5571L    # 8.058828264835688E-131
        0x25e962f1c28f71a2L
        0x275d0732b877af29L
        0x28ac82e44e933606L
        0x2a71ce2cc40a710cL    # 3.105364083941061E-104
        0x2ad1ce3a112f015dL
        0x2adfefbbfe29d931L
        0x2b3a37467a344cdfL
        0x2b6dd8b3229d6837L    # 1.7057077092413725E-99
        0x2d308dbbc851b0d8L    # 5.078962391870398E-91
        0x2fe950d3ea52ae0dL    # 6.832216944281275E-78
        0x313bb4abd8d4554cL    # 1.56808971921097E-71
        0x327c8ed7c8706905L    # 1.6948389662237084E-65
        0x332f0b5369a18310L
        0x339a3e0b6beebee9L    # 4.0826654570968825E-60
        0x33c64b921f523f2fL    # 2.77486720533494E-59
        0x33e7f3e02571b153L    # 1.1924611050770566E-58
        0x34a81ee78429fdf1L    # 4.918595094295287E-55
        0x37317698dcfce894L    # 7.830801102106149E-43
        0x378307cb0111e878L    # 2.730734411398275E-41
        0x3826f4b2380c8b9bL    # 3.373058177088523E-38
        0x398f942e01920cf0L    # 1.9461954727645544E-31
        0x3a31412dbb05c7ffL    # 2.1778372103247874E-28
        0x3a7ee0635eb2bc33L    # 6.235462802057997E-27
        0x3adba40367f73264L    # 3.5724737671988184E-25
        0x3b0b51ecbf6db221L    # 2.8248237289442712E-24
        0x42d11a560fc9fba9L    # 7.521924278884664E13
        0x43320dc9d2ae0892L    # 5.08171005500021E15
        0x440e89208f445fb9L    # 7.041042216469549E19
        0x46c808a4b5841f57L    # 9.749252615377375E32
        0x470fd3a18bb39414L    # 2.065669875132854E34
        0x49312bdafb0077d9L    # 3.829330118647328E44
        0x4a3797b30328202cL    # 3.448058737338662E49
        0x4ba3e254e758d70dL    # 2.4377845509161763E56
        0x4bf881e49d37f530L    # 9.614713083096315E57
        0x4cf54eec05e3e818L    # 5.478576021141778E62
        0x4da972745feb30c1L    # 1.339945589251118E66
        0x4ef08c90ff16c675L    # 1.8274816638330285E72
        0x4fd10ddc6d13821fL    # 3.085523505057036E76
        0x521b4f573376df4aL    # 3.3954649887443486E87
        0x527db6b46ce3bcbcL    # 2.3643694017797754E89
        0x535e552d6f9700c1L    # 3.954486474370437E93
        0x54855e265fe1dad5L    # 1.4605211590140444E99
        0x5728504a6d454ffcL    # 7.309005913296069E111
        0x599b5c1213a099acL    # 4.521565120980506E123
        0x5a5bd85c072e5efeL
        0x5ab0cb3071ab40d1L    # 7.275532043244496E128
        0x5b6149820275ea42L
        0x5d74d3e5b9370476L    # 1.5873759122766088E142
        0x5d92e6ddde40ed84L    # 5.762376793011253E142
        0x5e61093ef8cdddbbL    # 4.2545979149900575E146
        0x5f215622fb630753L    # 1.773407570959078E150
        0x61c5bdd721385107L    # 9.781342160839794E162
        0x62db241274397c34L
        0x636ecca2a131b235L    # 9.29884914075952E170
        0x63a220e60a17c7b9L    # 8.757288450874107E171
        0x647ab0224e149ebeL    # 1.0561215288164044E176
        0x65f81b84c1d920cdL    # 1.6005507777082922E183
        0x665c53c311193973L    # 1.2036519694555594E185
        0x6749835432e0f0d2L
        0x69b6e0175084b377L    # 1.750995289311963E201
        0x6a47501ebb2afdb2L    # 9.136601149026956E203
        0x6fcabf6fa54cafffL    # 3.244253068846464E230
        0x6fe92d83fc0a4628L    # 1.2215307041274365E231
        0x746bd4a53ec195fbL    # 6.376313675246868E252
        0x75cc60f5871d0fd3L    # 2.7270901325332595E259
        0x767a586a5107feefL    # 5.184902282980218E262
        0x793addded7a967f5L    # 9.301865880350898E275
        0x7aa7ee3627a19cf3L    # 6.950210684357695E282
        0x7afa070241b8cc4bL    # 2.4189469652688762E284
        0x7ed9311d28bf1a65L    # 1.0797314149657436E303
        0x7ed9481d28bf417aL    # 1.0835821490243428E303
        0x7ee6c477da20bbe3L    # 1.951641816604592E303
    .end array-data
.end method

.method public static synthetic a(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$getBeanInfo1x$9(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(JLjava/util/concurrent/atomic/AtomicReference;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$createFieldReader$4(JLjava/util/concurrent/atomic/AtomicReference;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static buildInitTypeConverts()Ljava/util/concurrent/ConcurrentMap;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/function/Function;",
            ">;>;"
        }
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v3, Lcom/alibaba/fastjson2/reader/l;

    .line 19
    .line 20
    const/16 v4, 0x8

    .line 21
    .line 22
    invoke-direct {v3, v4}, Lcom/alibaba/fastjson2/reader/l;-><init>(I)V

    .line 23
    .line 24
    .line 25
    const-class v4, Ljava/lang/Character;

    .line 26
    .line 27
    sget-object v5, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-static {v2, v4, v5, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 30
    .line 31
    .line 32
    const-class v16, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 33
    .line 34
    const-class v17, Ljava/util/concurrent/atomic/AtomicLong;

    .line 35
    .line 36
    const-class v6, Ljava/lang/Boolean;

    .line 37
    .line 38
    const-class v7, Ljava/lang/Byte;

    .line 39
    .line 40
    const-class v8, Ljava/lang/Short;

    .line 41
    .line 42
    const-class v9, Ljava/lang/Integer;

    .line 43
    .line 44
    const-class v10, Ljava/lang/Long;

    .line 45
    .line 46
    const-class v11, Ljava/lang/Number;

    .line 47
    .line 48
    const-class v12, Ljava/lang/Float;

    .line 49
    .line 50
    const-class v13, Ljava/lang/Double;

    .line 51
    .line 52
    const-class v14, Ljava/math/BigInteger;

    .line 53
    .line 54
    const-class v15, Ljava/math/BigDecimal;

    .line 55
    .line 56
    filled-new-array/range {v6 .. v17}, [Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    new-instance v6, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 61
    .line 62
    const-class v7, Ljava/lang/Boolean;

    .line 63
    .line 64
    const/4 v8, 0x0

    .line 65
    invoke-direct {v6, v7, v8}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const/4 v9, 0x0

    .line 69
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    invoke-static {v9}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    invoke-static {v9}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    move v13, v9

    .line 82
    :goto_0
    const/16 v14, 0xc

    .line 83
    .line 84
    if-ge v13, v14, :cond_0

    .line 85
    .line 86
    aget-object v14, v3, v13

    .line 87
    .line 88
    invoke-static {v2, v14, v7, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 89
    .line 90
    .line 91
    add-int/lit8 v13, v13, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_0
    new-instance v6, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 95
    .line 96
    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-direct {v6, v7, v13}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    move v13, v9

    .line 102
    :goto_1
    sget-object v15, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 103
    .line 104
    if-ge v13, v14, :cond_1

    .line 105
    .line 106
    aget-object v9, v3, v13

    .line 107
    .line 108
    invoke-static {v2, v9, v15, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 109
    .line 110
    .line 111
    add-int/lit8 v13, v13, 0x1

    .line 112
    .line 113
    const/4 v9, 0x0

    .line 114
    goto :goto_1

    .line 115
    :cond_1
    new-instance v6, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 116
    .line 117
    const-class v9, Ljava/lang/String;

    .line 118
    .line 119
    invoke-direct {v6, v9}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;)V

    .line 120
    .line 121
    .line 122
    const/4 v13, 0x0

    .line 123
    :goto_2
    if-ge v13, v14, :cond_2

    .line 124
    .line 125
    aget-object v8, v3, v13

    .line 126
    .line 127
    invoke-static {v2, v8, v9, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 128
    .line 129
    .line 130
    add-int/lit8 v13, v13, 0x1

    .line 131
    .line 132
    const/4 v8, 0x0

    .line 133
    goto :goto_2

    .line 134
    :cond_2
    new-instance v6, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 135
    .line 136
    const-class v8, Ljava/math/BigDecimal;

    .line 137
    .line 138
    invoke-direct {v6, v8}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;)V

    .line 139
    .line 140
    .line 141
    const/4 v13, 0x0

    .line 142
    :goto_3
    if-ge v13, v14, :cond_3

    .line 143
    .line 144
    aget-object v14, v3, v13

    .line 145
    .line 146
    invoke-static {v2, v14, v8, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 147
    .line 148
    .line 149
    add-int/lit8 v13, v13, 0x1

    .line 150
    .line 151
    const/16 v14, 0xc

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_3
    new-instance v6, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 155
    .line 156
    const-class v13, Ljava/math/BigInteger;

    .line 157
    .line 158
    invoke-direct {v6, v13}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;)V

    .line 159
    .line 160
    .line 161
    move-object/from16 v18, v3

    .line 162
    .line 163
    const/4 v14, 0x0

    .line 164
    :goto_4
    const/16 v3, 0xc

    .line 165
    .line 166
    if-ge v14, v3, :cond_4

    .line 167
    .line 168
    aget-object v3, v18, v14

    .line 169
    .line 170
    invoke-static {v2, v3, v13, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 171
    .line 172
    .line 173
    add-int/lit8 v14, v14, 0x1

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_4
    new-instance v3, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 177
    .line 178
    const-class v6, Ljava/lang/Byte;

    .line 179
    .line 180
    invoke-direct {v3, v6}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;)V

    .line 181
    .line 182
    .line 183
    move-object/from16 v19, v13

    .line 184
    .line 185
    const/4 v14, 0x0

    .line 186
    :goto_5
    const/16 v13, 0xc

    .line 187
    .line 188
    if-ge v14, v13, :cond_5

    .line 189
    .line 190
    aget-object v13, v18, v14

    .line 191
    .line 192
    invoke-static {v2, v13, v6, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 193
    .line 194
    .line 195
    add-int/lit8 v14, v14, 0x1

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_5
    new-instance v3, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 199
    .line 200
    invoke-direct {v3, v6, v12}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    const/4 v13, 0x0

    .line 204
    :goto_6
    sget-object v14, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 205
    .line 206
    move-object/from16 v21, v8

    .line 207
    .line 208
    const/16 v8, 0xc

    .line 209
    .line 210
    if-ge v13, v8, :cond_6

    .line 211
    .line 212
    aget-object v8, v18, v13

    .line 213
    .line 214
    invoke-static {v2, v8, v14, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 215
    .line 216
    .line 217
    add-int/lit8 v13, v13, 0x1

    .line 218
    .line 219
    move-object/from16 v8, v21

    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_6
    new-instance v3, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 223
    .line 224
    const-class v8, Ljava/lang/Short;

    .line 225
    .line 226
    invoke-direct {v3, v8}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;)V

    .line 227
    .line 228
    .line 229
    move-object/from16 v20, v6

    .line 230
    .line 231
    const/4 v13, 0x0

    .line 232
    :goto_7
    const/16 v6, 0xc

    .line 233
    .line 234
    if-ge v13, v6, :cond_7

    .line 235
    .line 236
    aget-object v6, v18, v13

    .line 237
    .line 238
    invoke-static {v2, v6, v8, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 239
    .line 240
    .line 241
    add-int/lit8 v13, v13, 0x1

    .line 242
    .line 243
    goto :goto_7

    .line 244
    :cond_7
    new-instance v3, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 245
    .line 246
    invoke-direct {v3, v8, v11}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    const/4 v6, 0x0

    .line 250
    :goto_8
    sget-object v13, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 251
    .line 252
    move-object/from16 v23, v8

    .line 253
    .line 254
    const/16 v8, 0xc

    .line 255
    .line 256
    if-ge v6, v8, :cond_8

    .line 257
    .line 258
    aget-object v8, v18, v6

    .line 259
    .line 260
    invoke-static {v2, v8, v13, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 261
    .line 262
    .line 263
    add-int/lit8 v6, v6, 0x1

    .line 264
    .line 265
    move-object/from16 v8, v23

    .line 266
    .line 267
    goto :goto_8

    .line 268
    :cond_8
    new-instance v3, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 269
    .line 270
    const-class v6, Ljava/lang/Integer;

    .line 271
    .line 272
    invoke-direct {v3, v6}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;)V

    .line 273
    .line 274
    .line 275
    move-object/from16 v22, v7

    .line 276
    .line 277
    const/4 v8, 0x0

    .line 278
    :goto_9
    const/16 v7, 0xc

    .line 279
    .line 280
    if-ge v8, v7, :cond_9

    .line 281
    .line 282
    aget-object v7, v18, v8

    .line 283
    .line 284
    invoke-static {v2, v7, v6, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 285
    .line 286
    .line 287
    add-int/lit8 v8, v8, 0x1

    .line 288
    .line 289
    goto :goto_9

    .line 290
    :cond_9
    new-instance v3, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 291
    .line 292
    invoke-direct {v3, v6, v10}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    const/4 v7, 0x0

    .line 296
    :goto_a
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 297
    .line 298
    move-object/from16 v25, v6

    .line 299
    .line 300
    const/16 v6, 0xc

    .line 301
    .line 302
    if-ge v7, v6, :cond_a

    .line 303
    .line 304
    aget-object v6, v18, v7

    .line 305
    .line 306
    invoke-static {v2, v6, v8, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 307
    .line 308
    .line 309
    add-int/lit8 v7, v7, 0x1

    .line 310
    .line 311
    move-object/from16 v6, v25

    .line 312
    .line 313
    goto :goto_a

    .line 314
    :cond_a
    new-instance v3, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 315
    .line 316
    const-class v6, Ljava/lang/Long;

    .line 317
    .line 318
    invoke-direct {v3, v6}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;)V

    .line 319
    .line 320
    .line 321
    move-object/from16 v24, v4

    .line 322
    .line 323
    const/4 v7, 0x0

    .line 324
    :goto_b
    const/16 v4, 0xc

    .line 325
    .line 326
    if-ge v7, v4, :cond_b

    .line 327
    .line 328
    aget-object v4, v18, v7

    .line 329
    .line 330
    invoke-static {v2, v4, v6, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 331
    .line 332
    .line 333
    add-int/lit8 v7, v7, 0x1

    .line 334
    .line 335
    goto :goto_b

    .line 336
    :cond_b
    new-instance v3, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 337
    .line 338
    invoke-direct {v3, v6, v0}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    const/4 v4, 0x0

    .line 342
    :goto_c
    const/16 v7, 0xc

    .line 343
    .line 344
    if-ge v4, v7, :cond_c

    .line 345
    .line 346
    aget-object v7, v18, v4

    .line 347
    .line 348
    move/from16 v27, v4

    .line 349
    .line 350
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 351
    .line 352
    invoke-static {v2, v7, v4, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 353
    .line 354
    .line 355
    add-int/lit8 v4, v27, 0x1

    .line 356
    .line 357
    goto :goto_c

    .line 358
    :cond_c
    new-instance v3, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 359
    .line 360
    const-class v4, Ljava/lang/Float;

    .line 361
    .line 362
    invoke-direct {v3, v4}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;)V

    .line 363
    .line 364
    .line 365
    move-object/from16 v26, v6

    .line 366
    .line 367
    const/4 v7, 0x0

    .line 368
    :goto_d
    const/16 v6, 0xc

    .line 369
    .line 370
    if-ge v7, v6, :cond_d

    .line 371
    .line 372
    aget-object v6, v18, v7

    .line 373
    .line 374
    invoke-static {v2, v6, v4, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 375
    .line 376
    .line 377
    add-int/lit8 v7, v7, 0x1

    .line 378
    .line 379
    goto :goto_d

    .line 380
    :cond_d
    new-instance v3, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 381
    .line 382
    const/4 v6, 0x0

    .line 383
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 384
    .line 385
    .line 386
    move-result-object v6

    .line 387
    invoke-direct {v3, v4, v6}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    const/4 v6, 0x0

    .line 391
    :goto_e
    const/16 v7, 0xc

    .line 392
    .line 393
    if-ge v6, v7, :cond_e

    .line 394
    .line 395
    aget-object v7, v18, v6

    .line 396
    .line 397
    move/from16 v28, v6

    .line 398
    .line 399
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 400
    .line 401
    invoke-static {v2, v7, v6, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 402
    .line 403
    .line 404
    add-int/lit8 v6, v28, 0x1

    .line 405
    .line 406
    goto :goto_e

    .line 407
    :cond_e
    new-instance v3, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 408
    .line 409
    const-class v6, Ljava/lang/Double;

    .line 410
    .line 411
    invoke-direct {v3, v6}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;)V

    .line 412
    .line 413
    .line 414
    move-object/from16 v27, v4

    .line 415
    .line 416
    const/4 v7, 0x0

    .line 417
    :goto_f
    const/16 v4, 0xc

    .line 418
    .line 419
    if-ge v7, v4, :cond_f

    .line 420
    .line 421
    aget-object v4, v18, v7

    .line 422
    .line 423
    invoke-static {v2, v4, v6, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 424
    .line 425
    .line 426
    add-int/lit8 v7, v7, 0x1

    .line 427
    .line 428
    goto :goto_f

    .line 429
    :cond_f
    new-instance v3, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 430
    .line 431
    invoke-direct {v3, v6, v1}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    const/4 v4, 0x0

    .line 435
    :goto_10
    const/16 v7, 0xc

    .line 436
    .line 437
    if-ge v4, v7, :cond_10

    .line 438
    .line 439
    aget-object v7, v18, v4

    .line 440
    .line 441
    move/from16 v29, v4

    .line 442
    .line 443
    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 444
    .line 445
    invoke-static {v2, v7, v4, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 446
    .line 447
    .line 448
    add-int/lit8 v4, v29, 0x1

    .line 449
    .line 450
    goto :goto_10

    .line 451
    :cond_10
    new-instance v3, Lcom/alibaba/fastjson2/function/impl/ToAny;

    .line 452
    .line 453
    const-class v4, Ljava/lang/Number;

    .line 454
    .line 455
    invoke-direct {v3, v4, v1}, Lcom/alibaba/fastjson2/function/impl/ToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    move-object/from16 v16, v6

    .line 459
    .line 460
    const/4 v7, 0x0

    .line 461
    :goto_11
    const/16 v6, 0xc

    .line 462
    .line 463
    if-ge v7, v6, :cond_11

    .line 464
    .line 465
    aget-object v6, v18, v7

    .line 466
    .line 467
    invoke-static {v2, v6, v4, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 468
    .line 469
    .line 470
    add-int/lit8 v7, v7, 0x1

    .line 471
    .line 472
    goto :goto_11

    .line 473
    :cond_11
    new-instance v3, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 474
    .line 475
    const/16 v6, 0x30

    .line 476
    .line 477
    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 478
    .line 479
    .line 480
    move-result-object v6

    .line 481
    invoke-direct {v3, v5, v6}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    invoke-static {v2, v9, v5, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 485
    .line 486
    .line 487
    new-instance v3, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 488
    .line 489
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 490
    .line 491
    invoke-direct {v3, v15, v5}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    invoke-static {v2, v9, v15, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 495
    .line 496
    .line 497
    new-instance v3, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 498
    .line 499
    const/4 v5, 0x0

    .line 500
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 501
    .line 502
    .line 503
    move-result-object v5

    .line 504
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 505
    .line 506
    invoke-direct {v3, v6, v5}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    invoke-static {v2, v9, v6, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 510
    .line 511
    .line 512
    new-instance v3, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 513
    .line 514
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 515
    .line 516
    invoke-direct {v3, v5, v1}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    invoke-static {v2, v9, v5, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 520
    .line 521
    .line 522
    new-instance v1, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 523
    .line 524
    invoke-direct {v1, v14, v12}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    invoke-static {v2, v9, v14, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 528
    .line 529
    .line 530
    new-instance v1, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 531
    .line 532
    invoke-direct {v1, v13, v11}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 533
    .line 534
    .line 535
    invoke-static {v2, v9, v13, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 536
    .line 537
    .line 538
    new-instance v1, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 539
    .line 540
    invoke-direct {v1, v8, v10}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    invoke-static {v2, v9, v8, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 544
    .line 545
    .line 546
    new-instance v1, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 547
    .line 548
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 549
    .line 550
    invoke-direct {v1, v3, v0}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    invoke-static {v2, v9, v3, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 554
    .line 555
    .line 556
    new-instance v0, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 557
    .line 558
    move-object/from16 v1, v24

    .line 559
    .line 560
    const/4 v3, 0x0

    .line 561
    invoke-direct {v0, v1, v3}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    invoke-static {v2, v9, v1, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 565
    .line 566
    .line 567
    new-instance v0, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 568
    .line 569
    move-object/from16 v1, v22

    .line 570
    .line 571
    invoke-direct {v0, v1, v3}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    invoke-static {v2, v9, v1, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 575
    .line 576
    .line 577
    new-instance v0, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 578
    .line 579
    move-object/from16 v5, v16

    .line 580
    .line 581
    invoke-direct {v0, v5, v3}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    invoke-static {v2, v9, v5, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 585
    .line 586
    .line 587
    new-instance v0, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 588
    .line 589
    move-object/from16 v5, v27

    .line 590
    .line 591
    invoke-direct {v0, v5, v3}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    invoke-static {v2, v9, v5, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 595
    .line 596
    .line 597
    new-instance v0, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 598
    .line 599
    move-object/from16 v5, v20

    .line 600
    .line 601
    invoke-direct {v0, v5, v3}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 602
    .line 603
    .line 604
    invoke-static {v2, v9, v5, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 605
    .line 606
    .line 607
    new-instance v0, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 608
    .line 609
    move-object/from16 v5, v23

    .line 610
    .line 611
    invoke-direct {v0, v5, v3}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    invoke-static {v2, v9, v5, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 615
    .line 616
    .line 617
    new-instance v0, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 618
    .line 619
    move-object/from16 v5, v25

    .line 620
    .line 621
    invoke-direct {v0, v5, v3}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    invoke-static {v2, v9, v5, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 625
    .line 626
    .line 627
    new-instance v0, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 628
    .line 629
    move-object/from16 v5, v26

    .line 630
    .line 631
    invoke-direct {v0, v5, v3}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    invoke-static {v2, v9, v5, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 635
    .line 636
    .line 637
    new-instance v0, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 638
    .line 639
    move-object/from16 v5, v21

    .line 640
    .line 641
    invoke-direct {v0, v5, v3}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    invoke-static {v2, v9, v5, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 645
    .line 646
    .line 647
    new-instance v0, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 648
    .line 649
    move-object/from16 v6, v19

    .line 650
    .line 651
    invoke-direct {v0, v6, v3}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    invoke-static {v2, v9, v6, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 655
    .line 656
    .line 657
    new-instance v0, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 658
    .line 659
    invoke-direct {v0, v5, v3}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 660
    .line 661
    .line 662
    invoke-static {v2, v9, v4, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 663
    .line 664
    .line 665
    new-instance v0, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 666
    .line 667
    const-class v4, Ljava/util/Collection;

    .line 668
    .line 669
    invoke-direct {v0, v4, v3}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    const-class v4, Ljava/util/Collection;

    .line 673
    .line 674
    invoke-static {v2, v9, v4, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 675
    .line 676
    .line 677
    new-instance v0, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 678
    .line 679
    const-class v4, Ljava/util/List;

    .line 680
    .line 681
    invoke-direct {v0, v4, v3}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 682
    .line 683
    .line 684
    const-class v4, Ljava/util/List;

    .line 685
    .line 686
    invoke-static {v2, v9, v4, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 687
    .line 688
    .line 689
    new-instance v0, Lcom/alibaba/fastjson2/function/impl/StringToAny;

    .line 690
    .line 691
    const-class v4, Lcom/alibaba/fastjson2/JSONArray;

    .line 692
    .line 693
    invoke-direct {v0, v4, v3}, Lcom/alibaba/fastjson2/function/impl/StringToAny;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 694
    .line 695
    .line 696
    const-class v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 697
    .line 698
    invoke-static {v2, v9, v3, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 699
    .line 700
    .line 701
    new-instance v0, Lcom/alibaba/fastjson2/reader/l;

    .line 702
    .line 703
    const/16 v3, 0x9

    .line 704
    .line 705
    invoke-direct {v0, v3}, Lcom/alibaba/fastjson2/reader/l;-><init>(I)V

    .line 706
    .line 707
    .line 708
    invoke-static {v2, v1, v15, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 709
    .line 710
    .line 711
    new-instance v0, Lcom/alibaba/fastjson2/reader/l;

    .line 712
    .line 713
    const/16 v1, 0xa

    .line 714
    .line 715
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/l;-><init>(I)V

    .line 716
    .line 717
    .line 718
    const-class v1, Ljava/util/UUID;

    .line 719
    .line 720
    invoke-static {v2, v9, v1, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;

    .line 721
    .line 722
    .line 723
    return-object v2
.end method

.method public static synthetic c(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$getBeanInfo$7(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Ljava/lang/String;)Ljava/nio/charset/Charset;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$getObjectReaderModule$15(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-static {p1, p0, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$getCreator$13(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$processJSONField1x$11(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-static {p1, p0, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$getCreator$14(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private getBeanInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;[Ljava/lang/annotation/Annotation;)V
    .locals 4

    .line 175
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p2, v1

    .line 176
    invoke-interface {v2}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 177
    const-class v3, Lcom/alibaba/fastjson2/annotation/JSONType;

    invoke-static {v2, v3}, Lcom/alibaba/fastjson2/util/BeanUtils;->findAnnotation(Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v3

    check-cast v3, Lcom/alibaba/fastjson2/annotation/JSONType;

    if-eqz v3, :cond_0

    .line 178
    invoke-virtual {p0, p1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getBeanInfo1x(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/annotation/Annotation;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private getBeanInfo1xJSONPOJOBuilder(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/codec/BeanInfo;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/annotation/Annotation;",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p3, p1, p2, v1}, Lcom/alibaba/fastjson2/reader/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p4, v0}, Lcom/alibaba/fastjson2/util/BeanUtils;->annotationMethods(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private getCreator(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/codec/BeanInfo;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Constructor;",
            ")V"
        }
    .end annotation

    .line 113
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 114
    :cond_0
    invoke-virtual {p3}, Ljava/lang/reflect/Constructor;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    .line 115
    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_5

    aget-object v4, v0, v2

    .line 116
    invoke-interface {v4}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v5

    .line 117
    const-class v6, Lcom/alibaba/fastjson2/annotation/JSONCreator;

    invoke-static {v4, v6}, Lcom/alibaba/fastjson2/util/BeanUtils;->findAnnotation(Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v6

    check-cast v6, Lcom/alibaba/fastjson2/annotation/JSONCreator;

    const/4 v7, 0x1

    if-eqz v6, :cond_2

    .line 118
    invoke-interface {v6}, Lcom/alibaba/fastjson2/annotation/JSONCreator;->parameterNames()[Ljava/lang/String;

    move-result-object v3

    .line 119
    array-length v8, v3

    if-eqz v8, :cond_1

    .line 120
    iput-object v3, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->createParameterNames:[Ljava/lang/String;

    :cond_1
    move v3, v7

    if-ne v6, v4, :cond_2

    goto :goto_1

    .line 121
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    .line 122
    const-string v8, "com.alibaba.fastjson.annotation.JSONCreator"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    const-string v8, "com.alibaba.fastjson2.annotation.JSONCreator"

    .line 123
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 124
    :cond_3
    new-instance v3, Lcom/alibaba/fastjson2/reader/g;

    invoke-direct {v3, v4, p1, v7}, Lcom/alibaba/fastjson2/reader/g;-><init>(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;I)V

    invoke-static {v5, v3}, Lcom/alibaba/fastjson2/util/BeanUtils;->annotationMethods(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    move v3, v7

    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    if-nez v3, :cond_6

    goto :goto_3

    .line 125
    :cond_6
    :try_start_0
    invoke-virtual {p3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const/4 p2, 0x0

    :goto_2
    if-eqz p2, :cond_7

    .line 126
    iput-object p2, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    :cond_7
    :goto_3
    return-void
.end method

.method private getCreator(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/codec/BeanInfo;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Method;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Ljava/lang/Enum;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    const-string v1, "values"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    array-length v2, v1

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    move-object v6, v3

    .line 38
    move v5, v4

    .line 39
    :goto_0
    const/4 v7, 0x1

    .line 40
    if-ge v4, v2, :cond_4

    .line 41
    .line 42
    aget-object v6, v1, v4

    .line 43
    .line 44
    invoke-interface {v6}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    const-class v9, Lcom/alibaba/fastjson2/annotation/JSONCreator;

    .line 49
    .line 50
    invoke-static {v6, v9}, Lcom/alibaba/fastjson2/util/BeanUtils;->findAnnotation(Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    check-cast v9, Lcom/alibaba/fastjson2/annotation/JSONCreator;

    .line 55
    .line 56
    if-ne v9, v6, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v10

    .line 63
    const-string v11, "com.alibaba.fastjson.annotation.JSONCreator"

    .line 64
    .line 65
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    if-eqz v10, :cond_3

    .line 70
    .line 71
    new-instance v5, Lcom/alibaba/fastjson2/reader/g;

    .line 72
    .line 73
    const/4 v10, 0x2

    .line 74
    invoke-direct {v5, v6, p1, v10}, Lcom/alibaba/fastjson2/reader/g;-><init>(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;I)V

    .line 75
    .line 76
    .line 77
    invoke-static {v8, v5}, Lcom/alibaba/fastjson2/util/BeanUtils;->annotationMethods(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 78
    .line 79
    .line 80
    move v5, v7

    .line 81
    :cond_3
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 82
    .line 83
    move-object v6, v9

    .line 84
    goto :goto_0

    .line 85
    :cond_4
    if-eqz v6, :cond_6

    .line 86
    .line 87
    invoke-interface {v6}, Lcom/alibaba/fastjson2/annotation/JSONCreator;->parameterNames()[Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    array-length v2, v1

    .line 92
    if-eqz v2, :cond_5

    .line 93
    .line 94
    iput-object v1, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->createParameterNames:[Ljava/lang/String;

    .line 95
    .line 96
    :cond_5
    move v5, v7

    .line 97
    :cond_6
    if-nez v5, :cond_7

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_7
    :try_start_0
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    invoke-virtual {p2, v0, p3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 105
    .line 106
    .line 107
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    :catch_0
    if-eqz v3, :cond_8

    .line 109
    .line 110
    iput-object v3, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->createMethod:Ljava/lang/reflect/Method;

    .line 111
    .line 112
    :cond_8
    :goto_2
    return-void
.end method

.method private getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Lcom/alibaba/fastjson2/annotation/JSONField;)V
    .locals 10

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto/16 :goto_2

    .line 4
    .line 5
    :cond_0
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->name()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    iput-object v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 16
    .line 17
    :cond_1
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->format()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/16 v1, 0x54

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, -0x1

    .line 38
    if-eq v1, v2, :cond_2

    .line 39
    .line 40
    const-string v1, "\'T\'"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    const-string v2, "T"

    .line 49
    .line 50
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :cond_2
    iput-object v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 55
    .line 56
    :cond_3
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->label()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_4

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->label:Ljava/lang/String;

    .line 71
    .line 72
    :cond_4
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->defaultValue()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_5

    .line 81
    .line 82
    iput-object v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->defaultValue:Ljava/lang/String;

    .line 83
    .line 84
    :cond_5
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->locale()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    const/4 v2, 0x0

    .line 93
    const/4 v3, 0x1

    .line 94
    if-nez v1, :cond_6

    .line 95
    .line 96
    const-string v1, "_"

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    array-length v1, v0

    .line 103
    const/4 v4, 0x2

    .line 104
    if-ne v1, v4, :cond_6

    .line 105
    .line 106
    new-instance v1, Ljava/util/Locale;

    .line 107
    .line 108
    aget-object v4, v0, v2

    .line 109
    .line 110
    aget-object v0, v0, v3

    .line 111
    .line 112
    invoke-direct {v1, v4, v0}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iput-object v1, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->locale:Ljava/util/Locale;

    .line 116
    .line 117
    :cond_6
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->alternateNames()[Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    array-length v1, v0

    .line 122
    if-eqz v1, :cond_8

    .line 123
    .line 124
    iget-object v1, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    .line 125
    .line 126
    if-nez v1, :cond_7

    .line 127
    .line 128
    iput-object v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_7
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 132
    .line 133
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-static {v1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    iget-object v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 146
    .line 147
    .line 148
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    new-array v0, v0, [Ljava/lang/String;

    .line 153
    .line 154
    invoke-interface {v1, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, [Ljava/lang/String;

    .line 159
    .line 160
    iput-object v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    .line 161
    .line 162
    :cond_8
    :goto_0
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    .line 163
    .line 164
    if-nez v0, :cond_9

    .line 165
    .line 166
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->deserialize()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    xor-int/2addr v0, v3

    .line 171
    iput-boolean v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    .line 172
    .line 173
    :cond_9
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->deserializeFeatures()[Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    array-length v1, v0

    .line 178
    move v4, v2

    .line 179
    :goto_1
    if-ge v4, v1, :cond_b

    .line 180
    .line 181
    aget-object v5, v0, v4

    .line 182
    .line 183
    iget-wide v6, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 184
    .line 185
    iget-wide v8, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 186
    .line 187
    or-long/2addr v6, v8

    .line 188
    iput-wide v6, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 189
    .line 190
    iget-boolean v6, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    .line 191
    .line 192
    if-eqz v6, :cond_a

    .line 193
    .line 194
    sget-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 195
    .line 196
    if-ne v5, v6, :cond_a

    .line 197
    .line 198
    iput-boolean v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    .line 199
    .line 200
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_b
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->ordinal()I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-eqz v0, :cond_c

    .line 208
    .line 209
    iput v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 210
    .line 211
    :cond_c
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->value()Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_d

    .line 216
    .line 217
    iget-wide v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 218
    .line 219
    const-wide/high16 v4, 0x1000000000000L

    .line 220
    .line 221
    or-long/2addr v0, v4

    .line 222
    iput-wide v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 223
    .line 224
    :cond_d
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->unwrapped()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_e

    .line 229
    .line 230
    iget-wide v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 231
    .line 232
    const-wide/high16 v4, 0x2000000000000L

    .line 233
    .line 234
    or-long/2addr v0, v4

    .line 235
    iput-wide v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 236
    .line 237
    :cond_e
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->required()Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v0, :cond_f

    .line 242
    .line 243
    iput-boolean v3, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->required:Z

    .line 244
    .line 245
    :cond_f
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->deserializeUsing()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    const-class v1, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 250
    .line 251
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-eqz v1, :cond_10

    .line 256
    .line 257
    iput-object v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->readUsing:Ljava/lang/Class;

    .line 258
    .line 259
    :cond_10
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->arrayToMapKey()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-nez v1, :cond_11

    .line 272
    .line 273
    iput-object v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->arrayToMapKey:Ljava/lang/String;

    .line 274
    .line 275
    :cond_11
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->arrayToMapDuplicateHandler()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    const-class v0, Ljava/lang/Void;

    .line 280
    .line 281
    if-eq p2, v0, :cond_12

    .line 282
    .line 283
    iput-object p2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->arrayToMapDuplicateHandler:Ljava/lang/Class;

    .line 284
    .line 285
    :cond_12
    :goto_2
    return-void
.end method

.method private getPreviousObjectReader(ZLjava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 4
    .line 5
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 13
    .line 14
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 19
    .line 20
    return-object p1
.end method

.method public static synthetic h(Ljava/lang/String;)Ljava/time/ZoneId;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$getObjectReaderModule$18(Ljava/lang/String;)Ljava/time/ZoneId;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic i(Ljava/lang/String;)Ljava/io/File;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$getObjectReaderModule$16(Ljava/lang/String;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic j(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$getBeanInfo$8(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$buildInitTypeConverts$2(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic l(JLjava/util/concurrent/atomic/AtomicReference;Ljava/lang/reflect/Field;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$createFieldReader$3(JLjava/util/concurrent/atomic/AtomicReference;Ljava/lang/reflect/Field;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$buildInitTypeConverts$0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static synthetic lambda$buildInitTypeConverts$1(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static synthetic lambda$buildInitTypeConverts$2(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const-string v0, "null"

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method private static synthetic lambda$createFieldReader$3(JLjava/util/concurrent/atomic/AtomicReference;Ljava/lang/reflect/Field;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64LCase(Ljava/lang/String;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    cmp-long p0, p0, v0

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2, p3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method private static synthetic lambda$createFieldReader$4(JLjava/util/concurrent/atomic/AtomicReference;Ljava/lang/reflect/Method;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/alibaba/fastjson2/PropertyNamingStrategy;->CamelCase:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/BeanUtils;->setterName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64LCase(Ljava/lang/String;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    cmp-long p0, p0, v0

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2, p3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method private synthetic lambda$getBeanInfo$5(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getCreator(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$getBeanInfo$6(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getCreator(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$getBeanInfo$7(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getCreator(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$getBeanInfo$8(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getCreator(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$getBeanInfo1x$9(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/reflect/Method;)V
    .locals 6

    .line 1
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {p3, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    const-class v1, Ljava/lang/Void;

    .line 15
    .line 16
    const-class v2, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    sparse-switch p3, :sswitch_data_0

    .line 20
    .line 21
    .line 22
    goto/16 :goto_8

    .line 23
    .line 24
    :sswitch_0
    :try_start_1
    const-string p3, "seeAlso"

    .line 25
    .line 26
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    if-eqz p3, :cond_9

    .line 31
    .line 32
    check-cast p1, [Ljava/lang/Class;

    .line 33
    .line 34
    array-length p3, p1

    .line 35
    if-eqz p3, :cond_9

    .line 36
    .line 37
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlso:[Ljava/lang/Class;

    .line 38
    .line 39
    array-length p3, p1

    .line 40
    new-array p3, p3, [Ljava/lang/String;

    .line 41
    .line 42
    iput-object p3, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlsoNames:[Ljava/lang/String;

    .line 43
    .line 44
    :goto_0
    array-length p3, p1

    .line 45
    if-ge v3, p3, :cond_2

    .line 46
    .line 47
    aget-object p3, p1, v3

    .line 48
    .line 49
    new-instance v0, Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 50
    .line 51
    invoke-direct {v0}, Lcom/alibaba/fastjson2/codec/BeanInfo;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, v0, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->processSeeAlsoAnnotation(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, v0, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 58
    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    :cond_0
    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    :cond_1
    iget-object p3, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlsoNames:[Ljava/lang/String;

    .line 72
    .line 73
    aput-object v0, p3, v3

    .line 74
    .line 75
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    iget-wide v0, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 79
    .line 80
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 81
    .line 82
    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 83
    .line 84
    or-long/2addr v0, v2

    .line 85
    iput-wide v0, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 86
    .line 87
    return-void

    .line 88
    :sswitch_1
    const-string p3, "ignores"

    .line 89
    .line 90
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p3

    .line 94
    if-eqz p3, :cond_9

    .line 95
    .line 96
    check-cast p1, [Ljava/lang/String;

    .line 97
    .line 98
    array-length p3, p1

    .line 99
    if-lez p3, :cond_9

    .line 100
    .line 101
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->ignores:[Ljava/lang/String;

    .line 102
    .line 103
    return-void

    .line 104
    :sswitch_2
    const-string p3, "autoTypeCheckHandler"

    .line 105
    .line 106
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    if-eqz p3, :cond_9

    .line 111
    .line 112
    goto/16 :goto_4

    .line 113
    .line 114
    :sswitch_3
    const-string p3, "deserializeFeatures"

    .line 115
    .line 116
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p3

    .line 120
    if-eqz p3, :cond_9

    .line 121
    .line 122
    check-cast p1, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 123
    .line 124
    :goto_1
    array-length p3, p1

    .line 125
    if-ge v3, p3, :cond_9

    .line 126
    .line 127
    iget-wide v0, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 128
    .line 129
    aget-object p3, p1, v3

    .line 130
    .line 131
    iget-wide v4, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 132
    .line 133
    or-long/2addr v0, v4

    .line 134
    iput-wide v0, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 135
    .line 136
    add-int/lit8 v3, v3, 0x1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :sswitch_4
    const-string p3, "deserializeUsing"

    .line 140
    .line 141
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p3

    .line 145
    if-eqz p3, :cond_9

    .line 146
    .line 147
    check-cast p1, Ljava/lang/Class;

    .line 148
    .line 149
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 150
    .line 151
    .line 152
    move-result p3

    .line 153
    if-eqz p3, :cond_9

    .line 154
    .line 155
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->deserializer:Ljava/lang/Class;

    .line 156
    .line 157
    return-void

    .line 158
    :sswitch_5
    const-string p3, "builder"

    .line 159
    .line 160
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result p3

    .line 164
    if-eqz p3, :cond_9

    .line 165
    .line 166
    check-cast p1, Ljava/lang/Class;

    .line 167
    .line 168
    sget-object p3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 169
    .line 170
    if-eq p1, p3, :cond_9

    .line 171
    .line 172
    if-eq p1, v1, :cond_9

    .line 173
    .line 174
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->builder:Ljava/lang/Class;

    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 177
    .line 178
    .line 179
    move-result-object p3

    .line 180
    array-length v0, p3

    .line 181
    :goto_2
    if-ge v3, v0, :cond_5

    .line 182
    .line 183
    aget-object v1, p3, v3

    .line 184
    .line 185
    invoke-interface {v1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    const-string v5, "com.alibaba.fastjson.annotation.JSONPOJOBuilder"

    .line 194
    .line 195
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-eqz v4, :cond_3

    .line 200
    .line 201
    invoke-direct {p0, p2, p1, v1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getBeanInfo1xJSONPOJOBuilder(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_3
    const-class v1, Lcom/alibaba/fastjson2/annotation/JSONBuilder;

    .line 206
    .line 207
    invoke-static {p1, v1}, Lcom/alibaba/fastjson2/util/BeanUtils;->findAnnotation(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    check-cast v1, Lcom/alibaba/fastjson2/annotation/JSONBuilder;

    .line 212
    .line 213
    if-eqz v1, :cond_4

    .line 214
    .line 215
    invoke-interface {v1}, Lcom/alibaba/fastjson2/annotation/JSONBuilder;->buildMethod()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-static {p1, v2}, Lcom/alibaba/fastjson2/util/BeanUtils;->buildMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    iput-object v2, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->buildMethod:Ljava/lang/reflect/Method;

    .line 224
    .line 225
    invoke-interface {v1}, Lcom/alibaba/fastjson2/annotation/JSONBuilder;->withPrefix()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-nez v2, :cond_4

    .line 234
    .line 235
    iput-object v1, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->builderWithPrefix:Ljava/lang/String;

    .line 236
    .line 237
    :cond_4
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_5
    iget-object p3, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->buildMethod:Ljava/lang/reflect/Method;

    .line 241
    .line 242
    if-nez p3, :cond_6

    .line 243
    .line 244
    const-string p3, "build"

    .line 245
    .line 246
    invoke-static {p1, p3}, Lcom/alibaba/fastjson2/util/BeanUtils;->buildMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 247
    .line 248
    .line 249
    move-result-object p3

    .line 250
    iput-object p3, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->buildMethod:Ljava/lang/reflect/Method;

    .line 251
    .line 252
    :cond_6
    iget-object p3, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->buildMethod:Ljava/lang/reflect/Method;

    .line 253
    .line 254
    if-nez p3, :cond_9

    .line 255
    .line 256
    const-string p3, "create"

    .line 257
    .line 258
    invoke-static {p1, p3}, Lcom/alibaba/fastjson2/util/BeanUtils;->buildMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->buildMethod:Ljava/lang/reflect/Method;

    .line 263
    .line 264
    return-void

    .line 265
    :sswitch_6
    const-string p3, "rootName"

    .line 266
    .line 267
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result p3

    .line 271
    if-eqz p3, :cond_9

    .line 272
    .line 273
    check-cast p1, Ljava/lang/String;

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 276
    .line 277
    .line 278
    move-result p3

    .line 279
    if-nez p3, :cond_9

    .line 280
    .line 281
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->rootName:Ljava/lang/String;

    .line 282
    .line 283
    return-void

    .line 284
    :sswitch_7
    const-string p3, "autoTypeBeforeHandler"

    .line 285
    .line 286
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result p3

    .line 290
    if-eqz p3, :cond_9

    .line 291
    .line 292
    :goto_4
    check-cast p1, Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 293
    .line 294
    const-class p3, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 295
    .line 296
    if-eq p1, p3, :cond_9

    .line 297
    .line 298
    :try_start_2
    invoke-virtual {p3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 299
    .line 300
    .line 301
    move-result p3

    .line 302
    if-eqz p3, :cond_9

    .line 303
    .line 304
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->autoTypeBeforeHandler:Ljava/lang/Class;

    .line 305
    .line 306
    return-void

    .line 307
    :sswitch_8
    const-string p3, "seeAlsoDefault"

    .line 308
    .line 309
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result p3

    .line 313
    if-eqz p3, :cond_9

    .line 314
    .line 315
    move-object p3, p1

    .line 316
    check-cast p3, Ljava/lang/Class;

    .line 317
    .line 318
    if-eq p3, v1, :cond_7

    .line 319
    .line 320
    iput-object p3, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlsoDefault:Ljava/lang/Class;

    .line 321
    .line 322
    goto :goto_5

    .line 323
    :sswitch_9
    const-string p3, "typeName"

    .line 324
    .line 325
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result p3

    .line 329
    if-eqz p3, :cond_9

    .line 330
    .line 331
    check-cast p1, Ljava/lang/String;

    .line 332
    .line 333
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 334
    .line 335
    .line 336
    move-result p3

    .line 337
    if-nez p3, :cond_9

    .line 338
    .line 339
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 340
    .line 341
    return-void

    .line 342
    :sswitch_a
    const-string p3, "typeKey"

    .line 343
    .line 344
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result p3

    .line 348
    if-eqz p3, :cond_9

    .line 349
    .line 350
    :cond_7
    :goto_5
    check-cast p1, Ljava/lang/String;

    .line 351
    .line 352
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 353
    .line 354
    .line 355
    move-result p3

    .line 356
    if-nez p3, :cond_9

    .line 357
    .line 358
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 359
    .line 360
    return-void

    .line 361
    :sswitch_b
    const-string p3, "orders"

    .line 362
    .line 363
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result p3

    .line 367
    if-eqz p3, :cond_9

    .line 368
    .line 369
    check-cast p1, [Ljava/lang/String;

    .line 370
    .line 371
    array-length p3, p1

    .line 372
    if-eqz p3, :cond_9

    .line 373
    .line 374
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->orders:[Ljava/lang/String;

    .line 375
    .line 376
    return-void

    .line 377
    :sswitch_c
    const-string p3, "naming"

    .line 378
    .line 379
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result p3

    .line 383
    if-eqz p3, :cond_9

    .line 384
    .line 385
    check-cast p1, Ljava/lang/Enum;

    .line 386
    .line 387
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->namingStrategy:Ljava/lang/String;

    .line 392
    .line 393
    return-void

    .line 394
    :sswitch_d
    const-string p3, "parseFeatures"

    .line 395
    .line 396
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result p3

    .line 400
    if-eqz p3, :cond_9

    .line 401
    .line 402
    check-cast p1, [Ljava/lang/Enum;

    .line 403
    .line 404
    :goto_6
    array-length p3, p1

    .line 405
    if-ge v3, p3, :cond_9

    .line 406
    .line 407
    aget-object p3, p1, v3

    .line 408
    .line 409
    invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object p3

    .line 413
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    sparse-switch v0, :sswitch_data_1

    .line 418
    .line 419
    .line 420
    goto :goto_7

    .line 421
    :sswitch_e
    const-string v0, "InitStringFieldAsEmpty"

    .line 422
    .line 423
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result p3

    .line 427
    if-eqz p3, :cond_8

    .line 428
    .line 429
    iget-wide v0, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 430
    .line 431
    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 432
    .line 433
    iget-wide v4, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 434
    .line 435
    or-long/2addr v0, v4

    .line 436
    iput-wide v0, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 437
    .line 438
    goto :goto_7

    .line 439
    :sswitch_f
    const-string v0, "SupportAutoType"

    .line 440
    .line 441
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result p3

    .line 445
    if-eqz p3, :cond_8

    .line 446
    .line 447
    iget-wide v0, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 448
    .line 449
    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 450
    .line 451
    iget-wide v4, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 452
    .line 453
    or-long/2addr v0, v4

    .line 454
    iput-wide v0, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 455
    .line 456
    goto :goto_7

    .line 457
    :sswitch_10
    const-string v0, "SupportArrayToBean"

    .line 458
    .line 459
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result p3

    .line 463
    if-eqz p3, :cond_8

    .line 464
    .line 465
    iget-wide v0, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 466
    .line 467
    sget-object p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 468
    .line 469
    iget-wide v4, p3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 470
    .line 471
    or-long/2addr v0, v4

    .line 472
    iput-wide v0, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 473
    .line 474
    goto :goto_7

    .line 475
    :sswitch_11
    const-string v0, "TrimStringFieldValue"

    .line 476
    .line 477
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result p3

    .line 481
    :cond_8
    :goto_7
    add-int/lit8 v3, v3, 0x1

    .line 482
    .line 483
    goto :goto_6

    .line 484
    :sswitch_12
    const-string p3, "deserializer"

    .line 485
    .line 486
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result p3

    .line 490
    if-eqz p3, :cond_9

    .line 491
    .line 492
    check-cast p1, Ljava/lang/Class;

    .line 493
    .line 494
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 495
    .line 496
    .line 497
    move-result p3

    .line 498
    if-eqz p3, :cond_9

    .line 499
    .line 500
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/BeanInfo;->deserializer:Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 501
    .line 502
    :catchall_0
    :cond_9
    :goto_8
    return-void

    .line 503
    :sswitch_data_0
    .sparse-switch
        -0x64056b2d -> :sswitch_12
        -0x4000fff0 -> :sswitch_d
        -0x3ec0df78 -> :sswitch_c
        -0x3c209d1b -> :sswitch_b
        -0x32d96b3b -> :sswitch_a
        -0x2852af1b -> :sswitch_9
        -0x24dcc1d9 -> :sswitch_8
        -0x19c7a83e -> :sswitch_7
        -0x9f4d173 -> :sswitch_6
        0xdc3ef9b -> :sswitch_5
        0x3ecb2845 -> :sswitch_4
        0x539034dc -> :sswitch_3
        0x65b7914b -> :sswitch_2
        0x6873bce1 -> :sswitch_1
        0x75748aba -> :sswitch_0
    .end sparse-switch

    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    :sswitch_data_1
    .sparse-switch
        -0x5f9ef016 -> :sswitch_11
        -0x35496aab -> :sswitch_10
        -0xbf831a8 -> :sswitch_f
        0x778dede2 -> :sswitch_e
    .end sparse-switch
.end method

.method private static synthetic lambda$getBeanInfo1xJSONPOJOBuilder$12(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x7b4778ef

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    const p2, 0x7cbf22f8

    .line 16
    .line 17
    .line 18
    if-eq v1, p2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string p2, "withPrefix"

    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_2

    .line 28
    .line 29
    invoke-virtual {p3, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-nez p2, :cond_2

    .line 40
    .line 41
    iput-object p0, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->builderWithPrefix:Ljava/lang/String;

    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    const-string v1, "buildMethod"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p3, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {p2, p0}, Lcom/alibaba/fastjson2/util/BeanUtils;->buildMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iput-object p0, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->buildMethod:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method

.method private static synthetic lambda$getCreator$13(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/reflect/Method;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x4295151f

    .line 10
    .line 11
    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, "parameterNames"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p2, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, [Ljava/lang/String;

    .line 29
    .line 30
    array-length p2, p0

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    iput-object p0, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->createParameterNames:[Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method private static synthetic lambda$getCreator$14(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/reflect/Method;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x4295151f

    .line 10
    .line 11
    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, "parameterNames"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p2, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, [Ljava/lang/String;

    .line 29
    .line 30
    array-length p2, p0

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    iput-object p0, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->createParameterNames:[Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method private static synthetic lambda$getObjectReaderModule$15(Ljava/lang/String;)Ljava/nio/charset/Charset;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static synthetic lambda$getObjectReaderModule$16(Ljava/lang/String;)Ljava/io/File;
    .locals 1

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static synthetic lambda$getObjectReaderModule$17(Ljava/lang/String;)Ljava/net/URL;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-object v0

    .line 7
    :catch_0
    move-exception p0

    .line 8
    const-string v0, "read URL error"

    .line 9
    .line 10
    invoke-static {v0, p0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method private static synthetic lambda$getObjectReaderModule$18(Ljava/lang/String;)Ljava/time/ZoneId;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/time/ZoneId;->of(Ljava/lang/String;)Ljava/time/ZoneId;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static synthetic lambda$getObjectReaderModule$19(Ljava/lang/String;)Ljava/util/TimeZone;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static synthetic lambda$getObjectReaderModule$20(Ljava/lang/String;)Ljava/net/InetAddress;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception p0

    .line 7
    const-string v0, "create address error"

    .line 8
    .line 9
    invoke-static {v0, p0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method private static synthetic lambda$processJSONField1x$11(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/reflect/Method;)V
    .locals 5

    .line 1
    const-string v0, "\'T\'"

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    invoke-virtual {p2, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    sparse-switch p2, :sswitch_data_0

    .line 17
    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :sswitch_0
    const-string p2, "deserialize"

    .line 22
    .line 23
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_6

    .line 28
    .line 29
    check-cast p0, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_6

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    iput-boolean p0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    .line 39
    .line 40
    return-void

    .line 41
    :sswitch_1
    const-string p2, "deserializeUsing"

    .line 42
    .line 43
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_6

    .line 48
    .line 49
    check-cast p0, Ljava/lang/Class;

    .line 50
    .line 51
    const-class p2, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 52
    .line 53
    invoke-virtual {p2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-eqz p2, :cond_6

    .line 58
    .line 59
    iput-object p0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->readUsing:Ljava/lang/Class;

    .line 60
    .line 61
    return-void

    .line 62
    :sswitch_2
    const-string p2, "label"

    .line 63
    .line 64
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eqz p2, :cond_6

    .line 69
    .line 70
    check-cast p0, Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-nez p2, :cond_6

    .line 77
    .line 78
    iput-object p0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->label:Ljava/lang/String;

    .line 79
    .line 80
    return-void

    .line 81
    :sswitch_3
    const-string p2, "name"

    .line 82
    .line 83
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    if-eqz p2, :cond_6

    .line 88
    .line 89
    check-cast p0, Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-nez p2, :cond_6

    .line 96
    .line 97
    iput-object p0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 98
    .line 99
    return-void

    .line 100
    :sswitch_4
    const-string p2, "alternateNames"

    .line 101
    .line 102
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    if-eqz p2, :cond_6

    .line 107
    .line 108
    check-cast p0, [Ljava/lang/String;

    .line 109
    .line 110
    array-length p2, p0

    .line 111
    if-eqz p2, :cond_6

    .line 112
    .line 113
    iget-object p2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    .line 114
    .line 115
    if-nez p2, :cond_0

    .line 116
    .line 117
    iput-object p0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    .line 118
    .line 119
    return-void

    .line 120
    :cond_0
    new-instance p2, Ljava/util/LinkedHashSet;

    .line 121
    .line 122
    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-interface {p2, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 130
    .line 131
    .line 132
    iget-object p0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-interface {p2, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 139
    .line 140
    .line 141
    invoke-interface {p2}, Ljava/util/Set;->size()I

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    new-array p0, p0, [Ljava/lang/String;

    .line 146
    .line 147
    invoke-interface {p2, p0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    check-cast p0, [Ljava/lang/String;

    .line 152
    .line 153
    iput-object p0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    .line 154
    .line 155
    return-void

    .line 156
    :sswitch_5
    const-string p2, "defaultValue"

    .line 157
    .line 158
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    if-eqz p2, :cond_6

    .line 163
    .line 164
    check-cast p0, Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    if-nez p2, :cond_6

    .line 171
    .line 172
    iput-object p0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->defaultValue:Ljava/lang/String;

    .line 173
    .line 174
    return-void

    .line 175
    :sswitch_6
    const-string p2, "parseFeatures"

    .line 176
    .line 177
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-eqz p2, :cond_6

    .line 182
    .line 183
    check-cast p0, [Ljava/lang/Enum;

    .line 184
    .line 185
    array-length p2, p0

    .line 186
    const/4 v0, 0x0

    .line 187
    :goto_0
    if-ge v0, p2, :cond_6

    .line 188
    .line 189
    aget-object v1, p0, v0

    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    const v3, -0x35496aab    # -5982890.5f

    .line 200
    .line 201
    .line 202
    if-eq v2, v3, :cond_3

    .line 203
    .line 204
    const v3, -0xbf831a8

    .line 205
    .line 206
    .line 207
    if-eq v2, v3, :cond_2

    .line 208
    .line 209
    const v3, 0x778dede2

    .line 210
    .line 211
    .line 212
    if-eq v2, v3, :cond_1

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_1
    const-string v2, "InitStringFieldAsEmpty"

    .line 216
    .line 217
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-eqz v1, :cond_4

    .line 222
    .line 223
    iget-wide v1, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 224
    .line 225
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 226
    .line 227
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 228
    .line 229
    or-long/2addr v1, v3

    .line 230
    iput-wide v1, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 231
    .line 232
    goto :goto_1

    .line 233
    :cond_2
    const-string v2, "SupportAutoType"

    .line 234
    .line 235
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    if-eqz v1, :cond_4

    .line 240
    .line 241
    iget-wide v1, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 242
    .line 243
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 244
    .line 245
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 246
    .line 247
    or-long/2addr v1, v3

    .line 248
    iput-wide v1, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 249
    .line 250
    goto :goto_1

    .line 251
    :cond_3
    const-string v2, "SupportArrayToBean"

    .line 252
    .line 253
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    if-eqz v1, :cond_4

    .line 258
    .line 259
    iget-wide v1, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 260
    .line 261
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 262
    .line 263
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 264
    .line 265
    or-long/2addr v1, v3

    .line 266
    iput-wide v1, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 267
    .line 268
    :cond_4
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 269
    .line 270
    goto :goto_0

    .line 271
    :sswitch_7
    const-string p2, "ordinal"

    .line 272
    .line 273
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result p2

    .line 277
    if-eqz p2, :cond_6

    .line 278
    .line 279
    check-cast p0, Ljava/lang/Integer;

    .line 280
    .line 281
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 282
    .line 283
    .line 284
    move-result p2

    .line 285
    if-eqz p2, :cond_6

    .line 286
    .line 287
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 288
    .line 289
    .line 290
    move-result p0

    .line 291
    iput p0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 292
    .line 293
    return-void

    .line 294
    :sswitch_8
    const-string p2, "format"

    .line 295
    .line 296
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result p2

    .line 300
    if-eqz p2, :cond_6

    .line 301
    .line 302
    check-cast p0, Ljava/lang/String;

    .line 303
    .line 304
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 305
    .line 306
    .line 307
    move-result p2

    .line 308
    if-nez p2, :cond_6

    .line 309
    .line 310
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    const/16 p2, 0x54

    .line 315
    .line 316
    invoke-virtual {p0, p2}, Ljava/lang/String;->indexOf(I)I

    .line 317
    .line 318
    .line 319
    move-result p2

    .line 320
    const/4 v1, -0x1

    .line 321
    if-eq p2, v1, :cond_5

    .line 322
    .line 323
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 324
    .line 325
    .line 326
    move-result p2

    .line 327
    if-nez p2, :cond_5

    .line 328
    .line 329
    const-string p2, "T"

    .line 330
    .line 331
    invoke-virtual {p0, p2, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    :cond_5
    iput-object p0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 336
    .line 337
    :catchall_0
    :cond_6
    :goto_2
    return-void

    .line 338
    nop

    .line 339
    :sswitch_data_0
    .sparse-switch
        -0x4ba00809 -> :sswitch_8
        -0x47f1458f -> :sswitch_7
        -0x4000fff0 -> :sswitch_6
        -0x27497450 -> :sswitch_5
        -0xd631d12 -> :sswitch_4
        0x337a8b -> :sswitch_3
        0x61f7ef4 -> :sswitch_2
        0x3ecb2845 -> :sswitch_1
        0x6820db7f -> :sswitch_0
    .end sparse-switch
.end method

.method private static synthetic lambda$processSeeAlsoAnnotation$10(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/reflect/Method;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {p2, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string p2, "typeName"

    .line 11
    .line 12
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    check-cast p0, Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    iput-object p0, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    :catchall_0
    :cond_0
    return-void
.end method

.method public static synthetic m(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$getBeanInfo$5(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static match(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/lang/ClassLoader;)Z
    .locals 5

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-ne v0, p2, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->match(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/lang/ClassLoader;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    return v1

    .line 33
    :cond_1
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    move v0, v2

    .line 38
    :goto_0
    array-length v3, p0

    .line 39
    if-ge v0, v3, :cond_3

    .line 40
    .line 41
    aget-object v3, p0, v0

    .line 42
    .line 43
    invoke-static {v3, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->match(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/lang/ClassLoader;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    return v1

    .line 50
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    instance-of p0, p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;

    .line 54
    .line 55
    if-eqz p0, :cond_6

    .line 56
    .line 57
    check-cast p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;

    .line 58
    .line 59
    iget-object p0, p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueClass:Ljava/lang/Class;

    .line 60
    .line 61
    if-eqz p0, :cond_4

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-ne p0, p2, :cond_4

    .line 68
    .line 69
    return v1

    .line 70
    :cond_4
    iget-object p0, p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyType:Ljava/lang/reflect/Type;

    .line 71
    .line 72
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-eqz p0, :cond_5

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-ne p0, p2, :cond_5

    .line 83
    .line 84
    return v1

    .line 85
    :cond_5
    return v2

    .line 86
    :cond_6
    instance-of p0, p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 87
    .line 88
    if-eqz p0, :cond_8

    .line 89
    .line 90
    check-cast p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 91
    .line 92
    iget-object p0, p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->itemClass:Ljava/lang/Class;

    .line 93
    .line 94
    if-eqz p0, :cond_7

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    if-ne p0, p2, :cond_7

    .line 101
    .line 102
    return v1

    .line 103
    :cond_7
    return v2

    .line 104
    :cond_8
    instance-of p0, p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplOptional;

    .line 105
    .line 106
    if-eqz p0, :cond_a

    .line 107
    .line 108
    check-cast p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplOptional;

    .line 109
    .line 110
    iget-object p0, p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplOptional;->itemClass:Ljava/lang/Class;

    .line 111
    .line 112
    if-eqz p0, :cond_9

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    if-ne p0, p2, :cond_9

    .line 119
    .line 120
    return v1

    .line 121
    :cond_9
    return v2

    .line 122
    :cond_a
    instance-of p0, p1, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;

    .line 123
    .line 124
    if-eqz p0, :cond_d

    .line 125
    .line 126
    check-cast p1, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;

    .line 127
    .line 128
    iget-object p0, p1, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->fieldReaders:[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 129
    .line 130
    array-length p1, p0

    .line 131
    move v0, v2

    .line 132
    :goto_1
    if-ge v0, p1, :cond_d

    .line 133
    .line 134
    aget-object v3, p0, v0

    .line 135
    .line 136
    iget-object v4, v3, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 137
    .line 138
    if-eqz v4, :cond_b

    .line 139
    .line 140
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    if-ne v4, p2, :cond_b

    .line 145
    .line 146
    return v1

    .line 147
    :cond_b
    iget-object v3, v3, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldType:Ljava/lang/reflect/Type;

    .line 148
    .line 149
    instance-of v4, v3, Ljava/lang/reflect/ParameterizedType;

    .line 150
    .line 151
    if-eqz v4, :cond_c

    .line 152
    .line 153
    const/4 v4, 0x0

    .line 154
    invoke-static {v3, v4, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->match(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/lang/ClassLoader;)Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-eqz v3, :cond_c

    .line 159
    .line 160
    return v1

    .line 161
    :cond_c
    add-int/lit8 v0, v0, 0x1

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_d
    return v2
.end method

.method public static synthetic n(Ljava/lang/String;)Ljava/net/URL;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$getObjectReaderModule$17(Ljava/lang/String;)Ljava/net/URL;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic o(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-static {p1, p0, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$processSeeAlsoAnnotation$10(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic p(Ljava/lang/String;)Ljava/net/InetAddress;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$getObjectReaderModule$20(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private processAnnotation(Lcom/alibaba/fastjson2/codec/FieldInfo;[Ljava/lang/annotation/Annotation;)V
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_2

    .line 4
    .line 5
    aget-object v2, p2, v1

    .line 6
    .line 7
    invoke-interface {v2}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const-class v4, Lcom/alibaba/fastjson2/annotation/JSONField;

    .line 12
    .line 13
    invoke-static {v2, v4}, Lcom/alibaba/fastjson2/util/BeanUtils;->findAnnotation(Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Lcom/alibaba/fastjson2/annotation/JSONField;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    invoke-direct {p0, p1, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Lcom/alibaba/fastjson2/annotation/JSONField;)V

    .line 22
    .line 23
    .line 24
    if-ne v4, v2, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-string v4, "com.alibaba.fastjson.annotation.JSONField"

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-direct {p0, p1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->processJSONField1x(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/annotation/Annotation;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    return-void
.end method

.method private processJSONField1x(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/annotation/Annotation;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lbe/w;

    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    invoke-direct {v1, p2, v2, p1}, Lbe/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/BeanUtils;->annotationMethods(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private processSeeAlsoAnnotation(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/codec/BeanInfo;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Class;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    if-eq v0, p2, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->mixIn:Z

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->processSeeAlsoAnnotation(Lcom/alibaba/fastjson2/codec/BeanInfo;[Ljava/lang/annotation/Annotation;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->processSeeAlsoAnnotation(Lcom/alibaba/fastjson2/codec/BeanInfo;[Ljava/lang/annotation/Annotation;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private processSeeAlsoAnnotation(Lcom/alibaba/fastjson2/codec/BeanInfo;[Ljava/lang/annotation/Annotation;)V
    .locals 6

    .line 31
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p2, v1

    .line 32
    invoke-interface {v2}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v3

    .line 33
    new-instance v4, Lcom/alibaba/fastjson2/reader/g;

    const/4 v5, 0x0

    invoke-direct {v4, v2, p1, v5}, Lcom/alibaba/fastjson2/reader/g;-><init>(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;I)V

    invoke-static {v3, v4}, Lcom/alibaba/fastjson2/util/BeanUtils;->annotationMethods(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic q(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$getBeanInfo1xJSONPOJOBuilder$12(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$buildInitTypeConverts$0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static registerTypeConvert(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/function/Function;",
            ">;>;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/function/Function;",
            ")",
            "Ljava/util/function/Function;"
        }
    .end annotation

    .line 1
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/util/Map;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    move-object v0, p0

    .line 22
    check-cast v0, Ljava/util/Map;

    .line 23
    .line 24
    :cond_0
    invoke-interface {v0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ljava/util/function/Function;

    .line 29
    .line 30
    return-object p0
.end method

.method public static synthetic s(Ljava/lang/String;)Ljava/util/TimeZone;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$getObjectReaderModule$19(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic t(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$getBeanInfo$6(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static typedMap(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 10

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    if-ne p2, v0, :cond_1

    .line 6
    .line 7
    :cond_0
    if-ne p3, v0, :cond_1

    .line 8
    .line 9
    new-instance p2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapString;

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    invoke-direct {p2, p0, p1, v0, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapString;-><init>(Ljava/lang/Class;Ljava/lang/Class;J)V

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :cond_1
    new-instance v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;

    .line 18
    .line 19
    const-wide/16 v7, 0x0

    .line 20
    .line 21
    const/4 v9, 0x0

    .line 22
    move-object v3, p0

    .line 23
    move-object v4, p1

    .line 24
    move-object v5, p2

    .line 25
    move-object v6, p3

    .line 26
    invoke-direct/range {v2 .. v9}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;JLjava/util/function/Function;)V

    .line 27
    .line 28
    .line 29
    return-object v2
.end method

.method public static synthetic u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->lambda$buildInitTypeConverts$1(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public addAutoTypeAccept(Ljava/lang/String;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->acceptHashCodes:[J

    .line 14
    .line 15
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-gez p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->acceptHashCodes:[J

    .line 22
    .line 23
    array-length v2, p1

    .line 24
    add-int/lit8 v3, v2, 0x1

    .line 25
    .line 26
    new-array v3, v3, [J

    .line 27
    .line 28
    aput-wide v0, v3, v2

    .line 29
    .line 30
    array-length v0, p1

    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-static {p1, v1, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    .line 35
    invoke-static {v3}, Ljava/util/Arrays;->sort([J)V

    .line 36
    .line 37
    .line 38
    iput-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->acceptHashCodes:[J

    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public addAutoTypeDeny(Ljava/lang/String;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->denyHashCodes:[J

    .line 14
    .line 15
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-gez p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->denyHashCodes:[J

    .line 22
    .line 23
    array-length v2, p1

    .line 24
    add-int/lit8 v3, v2, 0x1

    .line 25
    .line 26
    new-array v3, v3, [J

    .line 27
    .line 28
    aput-wide v0, v3, v2

    .line 29
    .line 30
    array-length v0, p1

    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-static {p1, v1, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    .line 35
    invoke-static {v3}, Ljava/util/Arrays;->sort([J)V

    .line 36
    .line 37
    .line 38
    iput-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->denyHashCodes:[J

    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public final afterAutoType(Ljava/lang/String;Ljava/lang/Class;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->autoTypeHandler:Ljava/util/function/Consumer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->autoTypeList:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$LRUAutoTypeCache;

    .line 9
    .line 10
    monitor-enter p2

    .line 11
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->autoTypeList:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$LRUAutoTypeCache;

    .line 12
    .line 13
    new-instance v1, Ljava/util/Date;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    monitor-exit p2

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p1
.end method

.method public checkAutoType(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;J)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-wide/from16 v3, p3

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    if-eqz v6, :cond_1

    .line 17
    .line 18
    :cond_0
    move-object/from16 v18, v5

    .line 19
    .line 20
    goto/16 :goto_a

    .line 21
    .line 22
    :cond_1
    iget-object v6, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 23
    .line 24
    if-eqz v6, :cond_2

    .line 25
    .line 26
    invoke-interface {v6, v1, v2, v3, v4}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    if-eqz v6, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0, v1, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->afterAutoType(Ljava/lang/String;Ljava/lang/Class;)V

    .line 33
    .line 34
    .line 35
    return-object v6

    .line 36
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    const/16 v7, 0xc0

    .line 41
    .line 42
    const-string v8, "autoType is not support. "

    .line 43
    .line 44
    if-ge v6, v7, :cond_1c

    .line 45
    .line 46
    const/4 v7, 0x0

    .line 47
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    const/16 v10, 0x5b

    .line 52
    .line 53
    const/4 v11, 0x1

    .line 54
    if-ne v9, v10, :cond_3

    .line 55
    .line 56
    invoke-virtual {v1, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-virtual {v0, v9, v5, v3, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->checkAutoType(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    :cond_3
    if-eqz v2, :cond_4

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    if-eqz v9, :cond_4

    .line 74
    .line 75
    invoke-virtual/range {p0 .. p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->afterAutoType(Ljava/lang/String;Ljava/lang/Class;)V

    .line 76
    .line 77
    .line 78
    return-object v2

    .line 79
    :cond_4
    sget-object v9, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 80
    .line 81
    iget-wide v9, v9, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 82
    .line 83
    and-long/2addr v9, v3

    .line 84
    const-wide/16 v12, 0x0

    .line 85
    .line 86
    cmp-long v9, v9, v12

    .line 87
    .line 88
    if-eqz v9, :cond_5

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    move v11, v7

    .line 92
    :goto_0
    const/16 v14, 0x2e

    .line 93
    .line 94
    const/16 v15, 0x24

    .line 95
    .line 96
    const-wide v16, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    move-object/from16 v18, v5

    .line 102
    .line 103
    const-string v5, " -> "

    .line 104
    .line 105
    const-string v7, "type not match. "

    .line 106
    .line 107
    if-eqz v11, :cond_d

    .line 108
    .line 109
    move-wide/from16 v21, v16

    .line 110
    .line 111
    const/4 v9, 0x0

    .line 112
    const-wide v19, 0x100000001b3L

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    :goto_1
    if-ge v9, v6, :cond_c

    .line 118
    .line 119
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    if-ne v10, v15, :cond_6

    .line 124
    .line 125
    move v10, v14

    .line 126
    :cond_6
    move-wide/from16 v23, v12

    .line 127
    .line 128
    int-to-long v12, v10

    .line 129
    xor-long v12, v21, v12

    .line 130
    .line 131
    mul-long v12, v12, v19

    .line 132
    .line 133
    iget-object v10, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->acceptHashCodes:[J

    .line 134
    .line 135
    invoke-static {v10, v12, v13}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    if-ltz v10, :cond_9

    .line 140
    .line 141
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    if-eqz v10, :cond_9

    .line 146
    .line 147
    if-eqz v2, :cond_8

    .line 148
    .line 149
    invoke-virtual {v2, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_7

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_7
    invoke-static {v7, v1, v5}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-static {v1, v2}, Lah/a;->r(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :goto_2
    const/4 v1, 0x0

    .line 168
    return-object v1

    .line 169
    :cond_8
    :goto_3
    invoke-virtual {v0, v1, v10}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->afterAutoType(Ljava/lang/String;Ljava/lang/Class;)V

    .line 170
    .line 171
    .line 172
    return-object v10

    .line 173
    :cond_9
    iget-object v10, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->denyHashCodes:[J

    .line 174
    .line 175
    invoke-static {v10, v12, v13}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 176
    .line 177
    .line 178
    move-result v10

    .line 179
    if-ltz v10, :cond_b

    .line 180
    .line 181
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/String;)Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    if-eqz v10, :cond_a

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_a
    invoke-virtual {v8, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_b
    :goto_4
    add-int/lit8 v9, v9, 0x1

    .line 197
    .line 198
    move-wide/from16 v21, v12

    .line 199
    .line 200
    move-wide/from16 v12, v23

    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_c
    :goto_5
    move-wide/from16 v23, v12

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_d
    const-wide v19, 0x100000001b3L

    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    goto :goto_5

    .line 212
    :goto_6
    if-nez v11, :cond_13

    .line 213
    .line 214
    const/4 v9, 0x0

    .line 215
    :goto_7
    if-ge v9, v6, :cond_13

    .line 216
    .line 217
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 218
    .line 219
    .line 220
    move-result v10

    .line 221
    if-ne v10, v15, :cond_e

    .line 222
    .line 223
    move v10, v14

    .line 224
    :cond_e
    int-to-long v12, v10

    .line 225
    xor-long v12, v16, v12

    .line 226
    .line 227
    mul-long v12, v12, v19

    .line 228
    .line 229
    iget-object v10, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->denyHashCodes:[J

    .line 230
    .line 231
    invoke-static {v10, v12, v13}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    if-gez v10, :cond_12

    .line 236
    .line 237
    iget-object v10, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->acceptHashCodes:[J

    .line 238
    .line 239
    invoke-static {v10, v12, v13}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 240
    .line 241
    .line 242
    move-result v10

    .line 243
    if-ltz v10, :cond_11

    .line 244
    .line 245
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    if-eqz v3, :cond_10

    .line 250
    .line 251
    if-eqz v2, :cond_10

    .line 252
    .line 253
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    if-eqz v4, :cond_f

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_f
    invoke-static {v7, v1, v5}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    invoke-static {v1, v2}, Lah/a;->r(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_10
    :goto_8
    invoke-virtual {v0, v1, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->afterAutoType(Ljava/lang/String;Ljava/lang/Class;)V

    .line 273
    .line 274
    .line 275
    return-object v3

    .line 276
    :cond_11
    add-int/lit8 v9, v9, 0x1

    .line 277
    .line 278
    move-wide/from16 v16, v12

    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_12
    invoke-virtual {v8, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    goto :goto_2

    .line 289
    :cond_13
    if-nez v11, :cond_14

    .line 290
    .line 291
    return-object v18

    .line 292
    :cond_14
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/String;)Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    if-eqz v6, :cond_17

    .line 297
    .line 298
    if-eqz v2, :cond_16

    .line 299
    .line 300
    const-class v3, Ljava/lang/Object;

    .line 301
    .line 302
    if-eq v2, v3, :cond_16

    .line 303
    .line 304
    const-class v3, Ljava/util/HashMap;

    .line 305
    .line 306
    if-eq v6, v3, :cond_16

    .line 307
    .line 308
    invoke-virtual {v2, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    if-eqz v3, :cond_15

    .line 313
    .line 314
    goto :goto_9

    .line 315
    :cond_15
    invoke-static {v7, v1, v5}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    invoke-static {v1, v2}, Lah/a;->r(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    goto/16 :goto_2

    .line 327
    .line 328
    :cond_16
    :goto_9
    invoke-virtual {v0, v1, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->afterAutoType(Ljava/lang/String;Ljava/lang/Class;)V

    .line 329
    .line 330
    .line 331
    return-object v6

    .line 332
    :cond_17
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    move-result-object v6

    .line 336
    if-eqz v6, :cond_1b

    .line 337
    .line 338
    const-class v9, Ljava/lang/ClassLoader;

    .line 339
    .line 340
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 341
    .line 342
    .line 343
    move-result v9

    .line 344
    if-nez v9, :cond_1a

    .line 345
    .line 346
    const-class v9, Ljavax/sql/DataSource;

    .line 347
    .line 348
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 349
    .line 350
    .line 351
    move-result v9

    .line 352
    if-nez v9, :cond_1a

    .line 353
    .line 354
    const-class v9, Ljavax/sql/RowSet;

    .line 355
    .line 356
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 357
    .line 358
    .line 359
    move-result v9

    .line 360
    if-nez v9, :cond_1a

    .line 361
    .line 362
    if-eqz v2, :cond_1b

    .line 363
    .line 364
    invoke-virtual {v2, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 365
    .line 366
    .line 367
    move-result v8

    .line 368
    if-eqz v8, :cond_18

    .line 369
    .line 370
    invoke-virtual {v0, v1, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->afterAutoType(Ljava/lang/String;Ljava/lang/Class;)V

    .line 371
    .line 372
    .line 373
    return-object v6

    .line 374
    :cond_18
    sget-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreAutoTypeNotMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 375
    .line 376
    iget-wide v8, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 377
    .line 378
    and-long/2addr v3, v8

    .line 379
    cmp-long v3, v3, v23

    .line 380
    .line 381
    if-eqz v3, :cond_19

    .line 382
    .line 383
    return-object v2

    .line 384
    :cond_19
    invoke-static {v7, v1, v5}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-static {v1, v2}, Lah/a;->r(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    goto/16 :goto_2

    .line 396
    .line 397
    :cond_1a
    invoke-virtual {v8, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    goto/16 :goto_2

    .line 405
    .line 406
    :cond_1b
    invoke-virtual {v0, v1, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->afterAutoType(Ljava/lang/String;Ljava/lang/Class;)V

    .line 407
    .line 408
    .line 409
    return-object v6

    .line 410
    :cond_1c
    invoke-virtual {v8, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    goto/16 :goto_2

    .line 418
    .line 419
    :goto_a
    return-object v18
.end method

.method public cleanup(Ljava/lang/Class;)V
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/BeanUtils;->cleanupCache(Ljava/lang/Class;)V

    return-void
.end method

.method public cleanup(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/Class;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-ne v1, p1, :cond_0

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Ljava/util/Map$Entry;

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Ljava/lang/reflect/Type;

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 72
    .line 73
    invoke-static {v2, v1, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->match(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/lang/ClassLoader;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 84
    .line 85
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_5

    .line 98
    .line 99
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Ljava/util/Map$Entry;

    .line 104
    .line 105
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Ljava/lang/reflect/Type;

    .line 110
    .line 111
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 116
    .line 117
    invoke-static {v2, v1, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->match(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/lang/ClassLoader;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_4

    .line 122
    .line 123
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/BeanUtils;->cleanupCache(Ljava/lang/ClassLoader;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public cleanupMixIn()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public createFieldReader(Ljava/lang/Class;Ljava/lang/String;J)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 7

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 4
    .line 5
    and-long/2addr p3, v0

    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    cmp-long p3, p3, v0

    .line 9
    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 13
    .line 14
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    check-cast p3, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 22
    .line 23
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    check-cast p3, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 28
    .line 29
    :goto_0
    if-eqz p3, :cond_1

    .line 30
    .line 31
    invoke-interface {p3, p2}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFieldReader(Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_1
    new-instance p3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 37
    .line 38
    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64LCase(Ljava/lang/String;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    new-instance p4, Lcom/alibaba/fastjson2/reader/h;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct {p4, v0, v1, p3, v2}, Lcom/alibaba/fastjson2/reader/h;-><init>(JLjava/util/concurrent/atomic/AtomicReference;I)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1, p4}, Lcom/alibaba/fastjson2/util/BeanUtils;->fields(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    check-cast p3, Ljava/lang/reflect/Field;

    .line 59
    .line 60
    const/4 p4, 0x0

    .line 61
    if-eqz p3, :cond_2

    .line 62
    .line 63
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->creator:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 64
    .line 65
    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {p1, p2, p4, v0, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReader(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_2
    new-instance p3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 75
    .line 76
    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 77
    .line 78
    .line 79
    new-instance v2, Lcom/alibaba/fastjson2/reader/h;

    .line 80
    .line 81
    const/4 v3, 0x1

    .line 82
    invoke-direct {v2, v0, v1, p3, v3}, Lcom/alibaba/fastjson2/reader/h;-><init>(JLjava/util/concurrent/atomic/AtomicReference;I)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1, v2}, Lcom/alibaba/fastjson2/util/BeanUtils;->setters(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    move-object v6, p3

    .line 93
    check-cast v6, Ljava/lang/reflect/Method;

    .line 94
    .line 95
    if-eqz v6, :cond_3

    .line 96
    .line 97
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    const/4 p4, 0x0

    .line 102
    aget-object v4, p3, p4

    .line 103
    .line 104
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->creator:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 105
    .line 106
    const/4 v3, 0x0

    .line 107
    move-object v5, v4

    .line 108
    move-object v1, p1

    .line 109
    move-object v2, p2

    .line 110
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaderMethod(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1

    .line 115
    :cond_3
    return-object p4
.end method

.method public getAutoTypeBeforeHandler()Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAutoTypeHandler()Ljava/util/function/Consumer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/function/Consumer<",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->autoTypeHandler:Ljava/util/function/Consumer;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAutoTypeList()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->autoTypeList:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$LRUAutoTypeCache;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBeanInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/codec/BeanInfo;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Class;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    if-eq v0, p2, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    iput-boolean v2, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->mixIn:Z

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-direct {p0, p1, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getBeanInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;[Ljava/lang/annotation/Annotation;)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Lcom/alibaba/fastjson2/reader/m;

    .line 25
    .line 26
    invoke-direct {v3, p0, p1, p2, v1}, Lcom/alibaba/fastjson2/reader/m;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;I)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/BeanUtils;->staticMethod(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 30
    .line 31
    .line 32
    new-instance v3, Lcom/alibaba/fastjson2/reader/m;

    .line 33
    .line 34
    invoke-direct {v3, p0, p1, p2, v2}, Lcom/alibaba/fastjson2/reader/m;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/BeanUtils;->constructor(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v2, 0x0

    .line 45
    :goto_0
    if-eqz v0, :cond_5

    .line 46
    .line 47
    const-class v3, Ljava/lang/Object;

    .line 48
    .line 49
    if-eq v0, v3, :cond_5

    .line 50
    .line 51
    const-class v3, Ljava/lang/Enum;

    .line 52
    .line 53
    if-ne v0, v3, :cond_1

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_1
    new-instance v3, Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 57
    .line 58
    invoke-direct {v3}, Lcom/alibaba/fastjson2/codec/BeanInfo;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v3, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getBeanInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;)V

    .line 62
    .line 63
    .line 64
    iget-object v3, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlso:[Ljava/lang/Class;

    .line 65
    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    array-length v4, v3

    .line 69
    move v5, v1

    .line 70
    :goto_1
    if-ge v5, v4, :cond_3

    .line 71
    .line 72
    aget-object v6, v3, v5

    .line 73
    .line 74
    if-ne v6, p2, :cond_2

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move-object v2, v0

    .line 81
    :cond_4
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    goto :goto_0

    .line 86
    :cond_5
    :goto_3
    if-eqz v2, :cond_6

    .line 87
    .line 88
    invoke-virtual {p0, p1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getBeanInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;)V

    .line 89
    .line 90
    .line 91
    :cond_6
    invoke-virtual {p2}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getBeanInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;[Ljava/lang/annotation/Annotation;)V

    .line 96
    .line 97
    .line 98
    array-length v2, v0

    .line 99
    :goto_4
    if-ge v1, v2, :cond_8

    .line 100
    .line 101
    aget-object v3, v0, v1

    .line 102
    .line 103
    invoke-interface {v3}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const-string v5, "com.alibaba.fastjson.annotation.JSONType"

    .line 112
    .line 113
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-nez v4, :cond_7

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_7
    invoke-virtual {p0, p1, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getBeanInfo1x(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/annotation/Annotation;)V

    .line 121
    .line 122
    .line 123
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_8
    new-instance v0, Lcom/alibaba/fastjson2/reader/m;

    .line 127
    .line 128
    const/4 v1, 0x2

    .line 129
    invoke-direct {v0, p0, p1, p2, v1}, Lcom/alibaba/fastjson2/reader/m;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;I)V

    .line 130
    .line 131
    .line 132
    invoke-static {p2, v0}, Lcom/alibaba/fastjson2/util/BeanUtils;->staticMethod(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 133
    .line 134
    .line 135
    new-instance v0, Lcom/alibaba/fastjson2/reader/m;

    .line 136
    .line 137
    const/4 v1, 0x3

    .line 138
    invoke-direct {v0, p0, p1, p2, v1}, Lcom/alibaba/fastjson2/reader/m;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;I)V

    .line 139
    .line 140
    .line 141
    invoke-static {p2, v0}, Lcom/alibaba/fastjson2/util/BeanUtils;->constructor(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 142
    .line 143
    .line 144
    iget-object v0, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    .line 145
    .line 146
    if-nez v0, :cond_9

    .line 147
    .line 148
    iget-wide v0, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 149
    .line 150
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 151
    .line 152
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 153
    .line 154
    and-long/2addr v0, v2

    .line 155
    const-wide/16 v2, 0x0

    .line 156
    .line 157
    cmp-long v0, v0, v2

    .line 158
    .line 159
    if-nez v0, :cond_9

    .line 160
    .line 161
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->kotlin:Z

    .line 162
    .line 163
    if-eqz v0, :cond_9

    .line 164
    .line 165
    invoke-static {p2, p1}, Lcom/alibaba/fastjson2/util/BeanUtils;->getKotlinConstructor(Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/BeanInfo;)V

    .line 166
    .line 167
    .line 168
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/BeanUtils;->getKotlinConstructorParameters(Ljava/lang/Class;)[Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    iput-object p2, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->createParameterNames:[Ljava/lang/String;

    .line 173
    .line 174
    :cond_9
    return-void
.end method

.method public getBeanInfo1x(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/annotation/Annotation;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/alibaba/fastjson2/reader/k;

    .line 6
    .line 7
    invoke-direct {v1, p0, p2, p1}, Lcom/alibaba/fastjson2/reader/k;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/BeanUtils;->annotationMethods(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public getCreator()Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->creator:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    return-object v0
.end method

.method public getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;I[[Ljava/lang/annotation/Annotation;)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 336
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    if-eqz v1, :cond_0

    if-eq v1, p2, :cond_0

    .line 337
    :try_start_0
    invoke-virtual {p3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p2, v0

    :goto_0
    if-eqz p2, :cond_0

    .line 338
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object p2

    aget-object p2, p2, p4

    .line 339
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->processAnnotation(Lcom/alibaba/fastjson2/codec/FieldInfo;[Ljava/lang/annotation/Annotation;)V

    :cond_0
    if-nez p5, :cond_1

    .line 340
    invoke-virtual {p3}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object p5

    .line 341
    :cond_1
    array-length p2, p5

    invoke-virtual {p3}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    move-result p3

    if-ne p2, p3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 p4, p4, -0x1

    :goto_1
    if-ltz p4, :cond_3

    .line 342
    array-length p2, p5

    if-ge p4, p2, :cond_3

    .line 343
    aget-object v0, p5, p4

    :cond_3
    if-eqz v0, :cond_4

    .line 344
    array-length p2, v0

    if-lez p2, :cond_4

    .line 345
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->processAnnotation(Lcom/alibaba/fastjson2/codec/FieldInfo;[Ljava/lang/annotation/Annotation;)V

    :cond_4
    return-void
.end method

.method public getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Field;)V
    .locals 1

    if-eqz p2, :cond_0

    .line 292
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    if-eq v0, p2, :cond_0

    .line 293
    :try_start_0
    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_0

    .line 294
    invoke-virtual {p0, p1, v0, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Field;)V

    .line 295
    :cond_0
    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object p2

    .line 296
    array-length p3, p2

    if-lez p3, :cond_1

    .line 297
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->processAnnotation(Lcom/alibaba/fastjson2/codec/FieldInfo;[Ljava/lang/annotation/Annotation;)V

    :cond_1
    return-void
.end method

.method public getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 12

    .line 298
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p2, :cond_4

    .line 299
    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v3

    .line 300
    const-class v4, Ljava/lang/Object;

    if-eq v3, v4, :cond_0

    if-eqz v3, :cond_0

    .line 301
    invoke-static {v3, p3}, Lcom/alibaba/fastjson2/util/BeanUtils;->getMethod(Ljava/lang/Class;Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 302
    invoke-virtual {p0, p1, v3, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 303
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v4

    move v5, v2

    .line 304
    :goto_0
    array-length v6, v4

    if-ge v5, v6, :cond_3

    .line 305
    aget-object v6, v4, v5

    .line 306
    const-class v7, Ljava/io/Serializable;

    if-ne v6, v7, :cond_1

    goto :goto_1

    .line 307
    :cond_1
    invoke-static {v6, p3}, Lcom/alibaba/fastjson2/util/BeanUtils;->getMethod(Ljava/lang/Class;Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    move-result-object v6

    if-eqz v6, :cond_2

    if-eqz v3, :cond_2

    .line 308
    invoke-virtual {p0, p1, v3, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    :cond_2
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 309
    :cond_3
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    if-eqz v3, :cond_4

    if-eq v3, p2, :cond_4

    .line 310
    :try_start_0
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-object v4, v1

    :goto_2
    if-eqz v4, :cond_4

    .line 311
    invoke-virtual {p0, p1, v3, v4}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 312
    :cond_4
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object p3

    .line 313
    array-length v3, p3

    move-object v5, v1

    move v4, v2

    :goto_3
    if-ge v4, v3, :cond_7

    aget-object v6, p3, v4

    .line 314
    invoke-interface {v6}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v7

    .line 315
    const-class v8, Lcom/alibaba/fastjson2/annotation/JSONField;

    invoke-static {v6, v8}, Lcom/alibaba/fastjson2/util/BeanUtils;->findAnnotation(Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v8

    check-cast v8, Lcom/alibaba/fastjson2/annotation/JSONField;

    if-eqz v8, :cond_5

    .line 316
    invoke-direct {p0, p1, v8}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Lcom/alibaba/fastjson2/annotation/JSONField;)V

    .line 317
    invoke-interface {v8}, Lcom/alibaba/fastjson2/annotation/JSONField;->name()Ljava/lang/String;

    move-result-object v5

    if-ne v8, v6, :cond_5

    goto :goto_4

    .line 318
    :cond_5
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    .line 319
    const-string v8, "com.alibaba.fastjson.annotation.JSONField"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 320
    invoke-direct {p0, p1, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->processJSONField1x(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/annotation/Annotation;)V

    :cond_6
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 321
    :cond_7
    const-string p3, "set"

    invoke-virtual {v0, p3, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result p3

    if-eqz p3, :cond_8

    .line 322
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/BeanUtils;->setterName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    :goto_5
    move-object v9, p3

    goto :goto_6

    .line 323
    :cond_8
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/BeanUtils;->getterName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    goto :goto_5

    .line 324
    :goto_6
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result p3

    const/4 v0, 0x1

    if-le p3, v0, :cond_a

    .line 325
    invoke-virtual {v9, v2}, Ljava/lang/String;->charAt(I)C

    move-result p3

    const/16 v3, 0x41

    if-lt p3, v3, :cond_a

    const/16 v4, 0x5a

    if-gt p3, v4, :cond_a

    .line 326
    invoke-virtual {v9, v0}, Ljava/lang/String;->charAt(I)C

    move-result p3

    if-lt p3, v3, :cond_a

    if-gt p3, v4, :cond_a

    if-eqz v5, :cond_9

    .line 327
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_a

    .line 328
    :cond_9
    invoke-virtual {v9}, Ljava/lang/String;->toCharArray()[C

    move-result-object p3

    .line 329
    aget-char v1, p3, v2

    add-int/lit8 v1, v1, 0x20

    int-to-char v1, v1

    aput-char v1, p3, v2

    .line 330
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p3}, Ljava/lang/String;-><init>([C)V

    .line 331
    aget-char v2, p3, v0

    add-int/lit8 v2, v2, 0x20

    int-to-char v2, v2

    aput-char v2, p3, v0

    .line 332
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p3}, Ljava/lang/String;-><init>([C)V

    move-object v11, v0

    move-object v10, v1

    :goto_7
    move-object v8, p0

    move-object v7, p1

    move-object v6, p2

    goto :goto_8

    :cond_a
    move-object v10, v1

    move-object v11, v10

    goto :goto_7

    .line 333
    :goto_8
    invoke-static/range {v6 .. v11}, Lcom/alibaba/fastjson2/util/BeanUtils;->getFieldInfo(Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/FieldInfo;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v10

    move-object v0, v11

    if-eqz v1, :cond_b

    .line 334
    iget-object p1, v7, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    if-nez p1, :cond_b

    iget-object p1, v7, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    if-nez p1, :cond_b

    .line 335
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object p1

    iput-object p1, v7, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    :cond_b
    return-void
.end method

.method public getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;I)V
    .locals 2

    if-eqz p2, :cond_0

    .line 286
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    if-eq v0, p2, :cond_0

    .line 287
    :try_start_0
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_0

    .line 288
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object p2

    aget-object p2, p2, p4

    .line 289
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->processAnnotation(Lcom/alibaba/fastjson2/codec/FieldInfo;[Ljava/lang/annotation/Annotation;)V

    .line 290
    :cond_0
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object p2

    aget-object p2, p2, p4

    .line 291
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->processAnnotation(Lcom/alibaba/fastjson2/codec/FieldInfo;[Ljava/lang/annotation/Annotation;)V

    return-void
.end method

.method public getMixIn(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Class;

    .line 8
    .line 9
    return-object p1
.end method

.method public getObjectReader(J)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 3

    .line 242
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->readerCache:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$ObjectReaderCachePair;

    if-eqz v0, :cond_1

    .line 243
    iget-wide v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$ObjectReaderCachePair;->hashCode:J

    cmp-long v1, v1, p1

    if-nez v1, :cond_0

    .line 244
    iget-object p1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$ObjectReaderCachePair;->reader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    return-object p1

    .line 245
    :cond_0
    iget v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$ObjectReaderCachePair;->missCount:I

    add-int/lit8 v2, v1, 0x1

    iput v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$ObjectReaderCachePair;->missCount:I

    const/16 v0, 0x10

    if-le v1, v0, :cond_1

    const/4 v0, 0x0

    .line 246
    sput-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->readerCache:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$ObjectReaderCachePair;

    .line 247
    :cond_1
    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, p1, p2}, Ljava/lang/Long;-><init>(J)V

    .line 248
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->hashCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/alibaba/fastjson2/reader/ObjectReader;

    if-eqz v0, :cond_2

    .line 249
    sget-object v1, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->readerCache:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$ObjectReaderCachePair;

    if-nez v1, :cond_2

    .line 250
    new-instance v1, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$ObjectReaderCachePair;

    invoke-direct {v1, p1, p2, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$ObjectReaderCachePair;-><init>(JLcom/alibaba/fastjson2/reader/ObjectReader;)V

    sput-object v1, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->readerCache:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider$ObjectReaderCachePair;

    :cond_2
    return-object v0
.end method

.method public getObjectReader(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;J)",
            "Lcom/alibaba/fastjson2/reader/ObjectReader;"
        }
    .end annotation

    .line 237
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->checkAutoType(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 238
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p3, v1

    const-wide/16 v1, 0x0

    cmp-long p3, p3, v1

    if-eqz p3, :cond_1

    const/4 p3, 0x1

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    .line 239
    :goto_0
    invoke-virtual {p0, v0, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p3

    if-eq v0, p2, :cond_2

    .line 240
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerIfAbsent(JLcom/alibaba/fastjson2/reader/ObjectReader;)V

    :cond_2
    return-object p3
.end method

.method public getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 1

    const/4 v0, 0x0

    .line 241
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    return-object p1
.end method

.method public getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 7

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    move-object p1, v0

    .line 6
    :cond_0
    if-eqz p2, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 9
    .line 10
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 24
    .line 25
    :goto_0
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x1

    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    instance-of v4, p1, Ljava/lang/reflect/WildcardType;

    .line 30
    .line 31
    if-eqz v4, :cond_3

    .line 32
    .line 33
    move-object v4, p1

    .line 34
    check-cast v4, Ljava/lang/reflect/WildcardType;

    .line 35
    .line 36
    invoke-interface {v4}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    array-length v5, v4

    .line 41
    if-ne v5, v3, :cond_3

    .line 42
    .line 43
    aget-object v1, v4, v2

    .line 44
    .line 45
    if-eqz p2, :cond_2

    .line 46
    .line 47
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 48
    .line 49
    :goto_1
    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    :goto_2
    if-eqz v1, :cond_4

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_4
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReaderModule(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-eqz v1, :cond_7

    .line 67
    .line 68
    if-eqz p2, :cond_5

    .line 69
    .line 70
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 71
    .line 72
    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_5
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 80
    .line 81
    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 86
    .line 87
    :goto_3
    if-eqz p1, :cond_6

    .line 88
    .line 89
    return-object p1

    .line 90
    :cond_6
    return-object v1

    .line 91
    :cond_7
    instance-of v1, p1, Ljava/lang/reflect/TypeVariable;

    .line 92
    .line 93
    if-eqz v1, :cond_9

    .line 94
    .line 95
    move-object v1, p1

    .line 96
    check-cast v1, Ljava/lang/reflect/TypeVariable;

    .line 97
    .line 98
    invoke-interface {v1}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    array-length v4, v1

    .line 103
    if-lez v4, :cond_9

    .line 104
    .line 105
    aget-object v1, v1, v2

    .line 106
    .line 107
    instance-of v4, v1, Ljava/lang/Class;

    .line 108
    .line 109
    if-eqz v4, :cond_9

    .line 110
    .line 111
    invoke-virtual {p0, v1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    if-eqz v1, :cond_9

    .line 116
    .line 117
    invoke-direct {p0, p2, p1, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getPreviousObjectReader(ZLjava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-eqz p1, :cond_8

    .line 122
    .line 123
    return-object p1

    .line 124
    :cond_8
    return-object v1

    .line 125
    :cond_9
    instance-of v1, p1, Ljava/lang/reflect/ParameterizedType;

    .line 126
    .line 127
    if-eqz v1, :cond_10

    .line 128
    .line 129
    move-object v1, p1

    .line 130
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    .line 131
    .line 132
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    instance-of v5, v4, Ljava/lang/Class;

    .line 141
    .line 142
    if-eqz v5, :cond_10

    .line 143
    .line 144
    check-cast v4, Ljava/lang/Class;

    .line 145
    .line 146
    move-object v5, v4

    .line 147
    :goto_4
    if-eq v5, v0, :cond_b

    .line 148
    .line 149
    invoke-virtual {v5}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    array-length v6, v6

    .line 154
    if-lez v6, :cond_a

    .line 155
    .line 156
    move v2, v3

    .line 157
    goto :goto_5

    .line 158
    :cond_a
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    goto :goto_4

    .line 163
    :cond_b
    :goto_5
    array-length v0, v1

    .line 164
    if-eqz v0, :cond_c

    .line 165
    .line 166
    if-nez v2, :cond_e

    .line 167
    .line 168
    :cond_c
    invoke-virtual {p0, v4, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    if-eqz v0, :cond_e

    .line 173
    .line 174
    invoke-direct {p0, p2, p1, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getPreviousObjectReader(ZLjava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    if-eqz p1, :cond_d

    .line 179
    .line 180
    return-object p1

    .line 181
    :cond_d
    return-object v0

    .line 182
    :cond_e
    array-length v0, v1

    .line 183
    const-wide/16 v5, 0x0

    .line 184
    .line 185
    if-ne v0, v3, :cond_f

    .line 186
    .line 187
    const-class v0, Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-virtual {v0, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_f

    .line 194
    .line 195
    invoke-static {p1, v4, v5, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    return-object p1

    .line 200
    :cond_f
    array-length v0, v1

    .line 201
    const/4 v1, 0x2

    .line 202
    if-ne v0, v1, :cond_10

    .line 203
    .line 204
    const-class v0, Ljava/util/Map;

    .line 205
    .line 206
    invoke-virtual {v0, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_10

    .line 211
    .line 212
    invoke-static {p1, v4, v5, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    return-object p1

    .line 217
    :cond_10
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getCreator()Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {v0, v1, p1, p2, p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createObjectReader(Ljava/lang/Class;Ljava/lang/reflect/Type;ZLcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-direct {p0, p2, p1, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getPreviousObjectReader(ZLjava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    if-eqz p1, :cond_11

    .line 234
    .line 235
    return-object p1

    .line 236
    :cond_11
    return-object v0
.end method

.method public getObjectReaderModule(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 45

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-class v2, Ljava/lang/String;

    .line 4
    .line 5
    if-eq v0, v2, :cond_0

    .line 6
    .line 7
    const-class v3, Ljava/lang/CharSequence;

    .line 8
    .line 9
    if-ne v0, v3, :cond_1

    .line 10
    .line 11
    :cond_0
    move-object/from16 v4, p0

    .line 12
    .line 13
    goto/16 :goto_23

    .line 14
    .line 15
    :cond_1
    sget-object v3, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    if-eq v0, v3, :cond_2

    .line 18
    .line 19
    const-class v3, Ljava/lang/Character;

    .line 20
    .line 21
    if-ne v0, v3, :cond_3

    .line 22
    .line 23
    :cond_2
    move-object/from16 v4, p0

    .line 24
    .line 25
    goto/16 :goto_22

    .line 26
    .line 27
    :cond_3
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    if-eq v0, v3, :cond_4

    .line 30
    .line 31
    const-class v3, Ljava/lang/Boolean;

    .line 32
    .line 33
    if-ne v0, v3, :cond_5

    .line 34
    .line 35
    :cond_4
    move-object/from16 v4, p0

    .line 36
    .line 37
    goto/16 :goto_21

    .line 38
    .line 39
    :cond_5
    sget-object v3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 40
    .line 41
    if-eq v0, v3, :cond_6

    .line 42
    .line 43
    const-class v3, Ljava/lang/Byte;

    .line 44
    .line 45
    if-ne v0, v3, :cond_7

    .line 46
    .line 47
    :cond_6
    move-object/from16 v4, p0

    .line 48
    .line 49
    goto/16 :goto_20

    .line 50
    .line 51
    :cond_7
    sget-object v3, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    if-eq v0, v3, :cond_8

    .line 54
    .line 55
    const-class v3, Ljava/lang/Short;

    .line 56
    .line 57
    if-ne v0, v3, :cond_9

    .line 58
    .line 59
    :cond_8
    move-object/from16 v4, p0

    .line 60
    .line 61
    goto/16 :goto_1f

    .line 62
    .line 63
    :cond_9
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 64
    .line 65
    if-eq v0, v3, :cond_a

    .line 66
    .line 67
    const-class v4, Ljava/lang/Integer;

    .line 68
    .line 69
    if-ne v0, v4, :cond_b

    .line 70
    .line 71
    :cond_a
    move-object/from16 v4, p0

    .line 72
    .line 73
    goto/16 :goto_1e

    .line 74
    .line 75
    :cond_b
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 76
    .line 77
    if-eq v0, v4, :cond_c

    .line 78
    .line 79
    const-class v4, Ljava/lang/Long;

    .line 80
    .line 81
    if-ne v0, v4, :cond_d

    .line 82
    .line 83
    :cond_c
    move-object/from16 v4, p0

    .line 84
    .line 85
    goto/16 :goto_1d

    .line 86
    .line 87
    :cond_d
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 88
    .line 89
    if-eq v0, v5, :cond_e

    .line 90
    .line 91
    const-class v5, Ljava/lang/Float;

    .line 92
    .line 93
    if-ne v0, v5, :cond_f

    .line 94
    .line 95
    :cond_e
    move-object/from16 v4, p0

    .line 96
    .line 97
    goto/16 :goto_1c

    .line 98
    .line 99
    :cond_f
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 100
    .line 101
    if-eq v0, v5, :cond_10

    .line 102
    .line 103
    const-class v5, Ljava/lang/Double;

    .line 104
    .line 105
    if-ne v0, v5, :cond_11

    .line 106
    .line 107
    :cond_10
    move-object/from16 v4, p0

    .line 108
    .line 109
    goto/16 :goto_1b

    .line 110
    .line 111
    :cond_11
    const-class v5, Ljava/math/BigInteger;

    .line 112
    .line 113
    if-ne v0, v5, :cond_12

    .line 114
    .line 115
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplBigInteger;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplBigInteger;

    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_12
    const-class v5, Ljava/math/BigDecimal;

    .line 119
    .line 120
    if-ne v0, v5, :cond_13

    .line 121
    .line 122
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplBigDecimal;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplBigDecimal;

    .line 123
    .line 124
    return-object v0

    .line 125
    :cond_13
    const-class v5, Ljava/lang/Number;

    .line 126
    .line 127
    if-ne v0, v5, :cond_14

    .line 128
    .line 129
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplNumber;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplNumber;

    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_14
    const-class v5, Ljava/util/OptionalInt;

    .line 133
    .line 134
    if-ne v0, v5, :cond_15

    .line 135
    .line 136
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplOptionalInt;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplOptionalInt;

    .line 137
    .line 138
    return-object v0

    .line 139
    :cond_15
    const-class v5, Ljava/util/OptionalLong;

    .line 140
    .line 141
    if-ne v0, v5, :cond_16

    .line 142
    .line 143
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplOptionalLong;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplOptionalLong;

    .line 144
    .line 145
    return-object v0

    .line 146
    :cond_16
    const-class v5, Ljava/util/OptionalDouble;

    .line 147
    .line 148
    if-ne v0, v5, :cond_17

    .line 149
    .line 150
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplOptionalDouble;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplOptionalDouble;

    .line 151
    .line 152
    return-object v0

    .line 153
    :cond_17
    const-class v5, Ljava/util/Optional;

    .line 154
    .line 155
    if-ne v0, v5, :cond_18

    .line 156
    .line 157
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplOptional;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplOptional;

    .line 158
    .line 159
    return-object v0

    .line 160
    :cond_18
    const-class v6, Ljava/util/UUID;

    .line 161
    .line 162
    if-ne v0, v6, :cond_19

    .line 163
    .line 164
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplUUID;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplUUID;

    .line 165
    .line 166
    return-object v0

    .line 167
    :cond_19
    const-class v6, Ljava/time/Duration;

    .line 168
    .line 169
    if-ne v0, v6, :cond_1a

    .line 170
    .line 171
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;

    .line 172
    .line 173
    new-instance v2, Lcom/alibaba/fastjson2/reader/f;

    .line 174
    .line 175
    const/16 v3, 0x17

    .line 176
    .line 177
    invoke-direct {v2, v3}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 178
    .line 179
    .line 180
    invoke-direct {v0, v6, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 181
    .line 182
    .line 183
    return-object v0

    .line 184
    :cond_1a
    const-class v6, Ljava/time/Period;

    .line 185
    .line 186
    const/4 v7, 0x0

    .line 187
    if-ne v0, v6, :cond_1b

    .line 188
    .line 189
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;

    .line 190
    .line 191
    new-instance v2, Lcom/alibaba/fastjson2/reader/l;

    .line 192
    .line 193
    invoke-direct {v2, v7}, Lcom/alibaba/fastjson2/reader/l;-><init>(I)V

    .line 194
    .line 195
    .line 196
    invoke-direct {v0, v6, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 197
    .line 198
    .line 199
    return-object v0

    .line 200
    :cond_1b
    const-class v6, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 201
    .line 202
    const/4 v8, 0x1

    .line 203
    if-ne v0, v6, :cond_1c

    .line 204
    .line 205
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromBoolean;

    .line 206
    .line 207
    new-instance v2, Lcom/alibaba/fastjson2/reader/l;

    .line 208
    .line 209
    invoke-direct {v2, v8}, Lcom/alibaba/fastjson2/reader/l;-><init>(I)V

    .line 210
    .line 211
    .line 212
    invoke-direct {v0, v6, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromBoolean;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 213
    .line 214
    .line 215
    return-object v0

    .line 216
    :cond_1c
    const/4 v6, 0x2

    .line 217
    const-class v9, Ljava/net/URI;

    .line 218
    .line 219
    if-ne v0, v9, :cond_1d

    .line 220
    .line 221
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;

    .line 222
    .line 223
    new-instance v2, Lcom/alibaba/fastjson2/reader/l;

    .line 224
    .line 225
    invoke-direct {v2, v6}, Lcom/alibaba/fastjson2/reader/l;-><init>(I)V

    .line 226
    .line 227
    .line 228
    invoke-direct {v0, v9, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 229
    .line 230
    .line 231
    return-object v0

    .line 232
    :cond_1d
    const/4 v9, 0x3

    .line 233
    const-class v10, Ljava/nio/charset/Charset;

    .line 234
    .line 235
    if-ne v0, v10, :cond_1e

    .line 236
    .line 237
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;

    .line 238
    .line 239
    new-instance v2, Lcom/alibaba/fastjson2/reader/l;

    .line 240
    .line 241
    invoke-direct {v2, v9}, Lcom/alibaba/fastjson2/reader/l;-><init>(I)V

    .line 242
    .line 243
    .line 244
    invoke-direct {v0, v10, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 245
    .line 246
    .line 247
    return-object v0

    .line 248
    :cond_1e
    const/4 v10, 0x4

    .line 249
    const-class v11, Ljava/io/File;

    .line 250
    .line 251
    if-ne v0, v11, :cond_1f

    .line 252
    .line 253
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;

    .line 254
    .line 255
    new-instance v2, Lcom/alibaba/fastjson2/reader/l;

    .line 256
    .line 257
    invoke-direct {v2, v10}, Lcom/alibaba/fastjson2/reader/l;-><init>(I)V

    .line 258
    .line 259
    .line 260
    invoke-direct {v0, v11, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 261
    .line 262
    .line 263
    return-object v0

    .line 264
    :cond_1f
    const/4 v11, 0x5

    .line 265
    const-class v12, Ljava/net/URL;

    .line 266
    .line 267
    if-ne v0, v12, :cond_20

    .line 268
    .line 269
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;

    .line 270
    .line 271
    new-instance v2, Lcom/alibaba/fastjson2/reader/l;

    .line 272
    .line 273
    invoke-direct {v2, v11}, Lcom/alibaba/fastjson2/reader/l;-><init>(I)V

    .line 274
    .line 275
    .line 276
    invoke-direct {v0, v12, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 277
    .line 278
    .line 279
    return-object v0

    .line 280
    :cond_20
    const/4 v12, 0x6

    .line 281
    const-class v13, Ljava/util/regex/Pattern;

    .line 282
    .line 283
    if-ne v0, v13, :cond_21

    .line 284
    .line 285
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;

    .line 286
    .line 287
    new-instance v2, Lcom/alibaba/fastjson2/reader/l;

    .line 288
    .line 289
    invoke-direct {v2, v12}, Lcom/alibaba/fastjson2/reader/l;-><init>(I)V

    .line 290
    .line 291
    .line 292
    invoke-direct {v0, v13, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 293
    .line 294
    .line 295
    return-object v0

    .line 296
    :cond_21
    const/16 v13, 0x1d

    .line 297
    .line 298
    const-class v14, Ljava/text/SimpleDateFormat;

    .line 299
    .line 300
    if-ne v0, v14, :cond_22

    .line 301
    .line 302
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;

    .line 303
    .line 304
    new-instance v2, Lcom/alibaba/fastjson2/reader/f;

    .line 305
    .line 306
    invoke-direct {v2, v13}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 307
    .line 308
    .line 309
    invoke-direct {v0, v14, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 310
    .line 311
    .line 312
    return-object v0

    .line 313
    :cond_22
    const-class v14, Ljava/lang/Class;

    .line 314
    .line 315
    if-ne v0, v14, :cond_23

    .line 316
    .line 317
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplClass;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplClass;

    .line 318
    .line 319
    return-object v0

    .line 320
    :cond_23
    const-class v14, Ljava/lang/reflect/Method;

    .line 321
    .line 322
    if-ne v0, v14, :cond_24

    .line 323
    .line 324
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMethod;

    .line 325
    .line 326
    invoke-direct {v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMethod;-><init>()V

    .line 327
    .line 328
    .line 329
    return-object v0

    .line 330
    :cond_24
    const-class v14, Ljava/lang/reflect/Field;

    .line 331
    .line 332
    if-ne v0, v14, :cond_25

    .line 333
    .line 334
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplField;

    .line 335
    .line 336
    invoke-direct {v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplField;-><init>()V

    .line 337
    .line 338
    .line 339
    return-object v0

    .line 340
    :cond_25
    const-class v14, Ljava/lang/reflect/Type;

    .line 341
    .line 342
    if-ne v0, v14, :cond_26

    .line 343
    .line 344
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplClass;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplClass;

    .line 345
    .line 346
    return-object v0

    .line 347
    :cond_26
    instance-of v14, v0, Ljava/lang/Class;

    .line 348
    .line 349
    if-eqz v14, :cond_27

    .line 350
    .line 351
    move-object v15, v0

    .line 352
    check-cast v15, Ljava/lang/Class;

    .line 353
    .line 354
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v15

    .line 358
    :goto_0
    move/from16 v16, v7

    .line 359
    .line 360
    goto :goto_1

    .line 361
    :cond_27
    const-string v15, ""

    .line 362
    .line 363
    goto :goto_0

    .line 364
    :goto_1
    const-class v7, Ljava/util/Map;

    .line 365
    .line 366
    if-eq v0, v7, :cond_28

    .line 367
    .line 368
    const-class v12, Ljava/util/AbstractMap;

    .line 369
    .line 370
    if-ne v0, v12, :cond_29

    .line 371
    .line 372
    :cond_28
    move-object/from16 v4, p0

    .line 373
    .line 374
    const/4 v5, 0x0

    .line 375
    goto/16 :goto_1a

    .line 376
    .line 377
    :cond_29
    const-class v13, Ljava/util/concurrent/ConcurrentMap;

    .line 378
    .line 379
    move/from16 v17, v8

    .line 380
    .line 381
    const-class v8, Ljava/util/concurrent/ConcurrentHashMap;

    .line 382
    .line 383
    const-class v6, Ljava/lang/Object;

    .line 384
    .line 385
    if-eq v0, v13, :cond_2a

    .line 386
    .line 387
    if-ne v0, v8, :cond_2b

    .line 388
    .line 389
    :cond_2a
    move-object/from16 v4, p0

    .line 390
    .line 391
    const/4 v5, 0x0

    .line 392
    goto/16 :goto_19

    .line 393
    .line 394
    :cond_2b
    const-class v9, Ljava/util/concurrent/ConcurrentNavigableMap;

    .line 395
    .line 396
    const-class v10, Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 397
    .line 398
    if-eq v0, v9, :cond_2c

    .line 399
    .line 400
    if-ne v0, v10, :cond_2d

    .line 401
    .line 402
    :cond_2c
    move-object/from16 v4, p0

    .line 403
    .line 404
    move-object v7, v10

    .line 405
    const/4 v5, 0x0

    .line 406
    goto/16 :goto_18

    .line 407
    .line 408
    :cond_2d
    const-class v11, Ljava/util/SortedMap;

    .line 409
    .line 410
    move/from16 v19, v14

    .line 411
    .line 412
    const-class v14, Ljava/util/TreeMap;

    .line 413
    .line 414
    if-eq v0, v11, :cond_2e

    .line 415
    .line 416
    const-class v11, Ljava/util/NavigableMap;

    .line 417
    .line 418
    if-eq v0, v11, :cond_2e

    .line 419
    .line 420
    if-ne v0, v14, :cond_2f

    .line 421
    .line 422
    :cond_2e
    move-object/from16 v4, p0

    .line 423
    .line 424
    move-object v7, v14

    .line 425
    goto/16 :goto_17

    .line 426
    .line 427
    :cond_2f
    const-class v11, Ljava/util/Calendar;

    .line 428
    .line 429
    if-ne v0, v11, :cond_30

    .line 430
    .line 431
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplCalendar;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplCalendar;

    .line 432
    .line 433
    return-object v0

    .line 434
    :cond_30
    const-class v11, Ljava/util/Date;

    .line 435
    .line 436
    if-ne v0, v11, :cond_31

    .line 437
    .line 438
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;

    .line 439
    .line 440
    return-object v0

    .line 441
    :cond_31
    const-class v11, Ljava/time/LocalDate;

    .line 442
    .line 443
    if-ne v0, v11, :cond_32

    .line 444
    .line 445
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalDate;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalDate;

    .line 446
    .line 447
    return-object v0

    .line 448
    :cond_32
    const-class v11, Ljava/time/LocalTime;

    .line 449
    .line 450
    if-ne v0, v11, :cond_33

    .line 451
    .line 452
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalTime;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalTime;

    .line 453
    .line 454
    return-object v0

    .line 455
    :cond_33
    const-class v11, Ljava/time/LocalDateTime;

    .line 456
    .line 457
    if-ne v0, v11, :cond_34

    .line 458
    .line 459
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalDateTime;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalDateTime;

    .line 460
    .line 461
    return-object v0

    .line 462
    :cond_34
    const-class v11, Ljava/time/ZonedDateTime;

    .line 463
    .line 464
    if-ne v0, v11, :cond_35

    .line 465
    .line 466
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplZonedDateTime;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplZonedDateTime;

    .line 467
    .line 468
    return-object v0

    .line 469
    :cond_35
    const-class v11, Ljava/time/OffsetDateTime;

    .line 470
    .line 471
    if-ne v0, v11, :cond_36

    .line 472
    .line 473
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplOffsetDateTime;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplOffsetDateTime;

    .line 474
    .line 475
    return-object v0

    .line 476
    :cond_36
    const-class v11, Ljava/time/OffsetTime;

    .line 477
    .line 478
    if-ne v0, v11, :cond_37

    .line 479
    .line 480
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplOffsetTime;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplOffsetTime;

    .line 481
    .line 482
    return-object v0

    .line 483
    :cond_37
    const-class v11, Ljava/time/ZoneOffset;

    .line 484
    .line 485
    if-ne v0, v11, :cond_38

    .line 486
    .line 487
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;

    .line 488
    .line 489
    new-instance v2, Lcom/alibaba/fastjson2/reader/l;

    .line 490
    .line 491
    const/4 v3, 0x7

    .line 492
    invoke-direct {v2, v3}, Lcom/alibaba/fastjson2/reader/l;-><init>(I)V

    .line 493
    .line 494
    .line 495
    invoke-direct {v0, v11, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 496
    .line 497
    .line 498
    return-object v0

    .line 499
    :cond_38
    const/16 v20, 0x7

    .line 500
    .line 501
    const-class v11, Ljava/time/Instant;

    .line 502
    .line 503
    if-ne v0, v11, :cond_39

    .line 504
    .line 505
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInstant;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplInstant;

    .line 506
    .line 507
    return-object v0

    .line 508
    :cond_39
    const-class v11, Ljava/util/Locale;

    .line 509
    .line 510
    if-ne v0, v11, :cond_3a

    .line 511
    .line 512
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocale;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocale;

    .line 513
    .line 514
    return-object v0

    .line 515
    :cond_3a
    const-class v11, Ljava/util/Currency;

    .line 516
    .line 517
    if-ne v0, v11, :cond_3b

    .line 518
    .line 519
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplCurrency;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplCurrency;

    .line 520
    .line 521
    return-object v0

    .line 522
    :cond_3b
    const-class v11, Ljava/time/ZoneId;

    .line 523
    .line 524
    if-ne v0, v11, :cond_3c

    .line 525
    .line 526
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;

    .line 527
    .line 528
    new-instance v2, Lcom/alibaba/fastjson2/reader/f;

    .line 529
    .line 530
    const/16 v3, 0x18

    .line 531
    .line 532
    invoke-direct {v2, v3}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 533
    .line 534
    .line 535
    invoke-direct {v0, v11, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 536
    .line 537
    .line 538
    return-object v0

    .line 539
    :cond_3c
    const-class v11, Ljava/util/TimeZone;

    .line 540
    .line 541
    if-ne v0, v11, :cond_3d

    .line 542
    .line 543
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;

    .line 544
    .line 545
    new-instance v2, Lcom/alibaba/fastjson2/reader/f;

    .line 546
    .line 547
    const/16 v3, 0x19

    .line 548
    .line 549
    invoke-direct {v2, v3}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 550
    .line 551
    .line 552
    invoke-direct {v0, v11, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromString;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 553
    .line 554
    .line 555
    return-object v0

    .line 556
    :cond_3d
    const-class v11, [C

    .line 557
    .line 558
    if-ne v0, v11, :cond_3e

    .line 559
    .line 560
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplCharValueArray;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplCharValueArray;

    .line 561
    .line 562
    return-object v0

    .line 563
    :cond_3e
    const-class v11, [F

    .line 564
    .line 565
    if-ne v0, v11, :cond_3f

    .line 566
    .line 567
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFloatValueArray;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplFloatValueArray;

    .line 568
    .line 569
    return-object v0

    .line 570
    :cond_3f
    const-class v11, [D

    .line 571
    .line 572
    if-ne v0, v11, :cond_40

    .line 573
    .line 574
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDoubleValueArray;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplDoubleValueArray;

    .line 575
    .line 576
    return-object v0

    .line 577
    :cond_40
    const-class v11, [Z

    .line 578
    .line 579
    if-ne v0, v11, :cond_41

    .line 580
    .line 581
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplBoolValueArray;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplBoolValueArray;

    .line 582
    .line 583
    return-object v0

    .line 584
    :cond_41
    const-class v11, [B

    .line 585
    .line 586
    if-ne v0, v11, :cond_42

    .line 587
    .line 588
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8ValueArray;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8ValueArray;

    .line 589
    .line 590
    return-object v0

    .line 591
    :cond_42
    const-class v11, [S

    .line 592
    .line 593
    if-ne v0, v11, :cond_43

    .line 594
    .line 595
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt16ValueArray;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt16ValueArray;

    .line 596
    .line 597
    return-object v0

    .line 598
    :cond_43
    const-class v11, [I

    .line 599
    .line 600
    if-ne v0, v11, :cond_44

    .line 601
    .line 602
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt32ValueArray;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt32ValueArray;

    .line 603
    .line 604
    return-object v0

    .line 605
    :cond_44
    const-class v11, [J

    .line 606
    .line 607
    if-ne v0, v11, :cond_45

    .line 608
    .line 609
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt64ValueArray;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt64ValueArray;

    .line 610
    .line 611
    return-object v0

    .line 612
    :cond_45
    const-class v11, [Ljava/lang/Byte;

    .line 613
    .line 614
    if-ne v0, v11, :cond_46

    .line 615
    .line 616
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;

    .line 617
    .line 618
    return-object v0

    .line 619
    :cond_46
    const-class v11, [Ljava/lang/Short;

    .line 620
    .line 621
    if-ne v0, v11, :cond_47

    .line 622
    .line 623
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt16Array;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt16Array;

    .line 624
    .line 625
    return-object v0

    .line 626
    :cond_47
    const-class v11, [Ljava/lang/Integer;

    .line 627
    .line 628
    if-ne v0, v11, :cond_48

    .line 629
    .line 630
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt32Array;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt32Array;

    .line 631
    .line 632
    return-object v0

    .line 633
    :cond_48
    const-class v11, [Ljava/lang/Long;

    .line 634
    .line 635
    if-ne v0, v11, :cond_49

    .line 636
    .line 637
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt64Array;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt64Array;

    .line 638
    .line 639
    return-object v0

    .line 640
    :cond_49
    const-class v11, [Ljava/lang/Float;

    .line 641
    .line 642
    if-ne v0, v11, :cond_4a

    .line 643
    .line 644
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFloatArray;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplFloatArray;

    .line 645
    .line 646
    return-object v0

    .line 647
    :cond_4a
    const-class v11, [Ljava/lang/Double;

    .line 648
    .line 649
    if-ne v0, v11, :cond_4b

    .line 650
    .line 651
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDoubleArray;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplDoubleArray;

    .line 652
    .line 653
    return-object v0

    .line 654
    :cond_4b
    const-class v11, [Ljava/lang/Number;

    .line 655
    .line 656
    if-ne v0, v11, :cond_4c

    .line 657
    .line 658
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplNumberArray;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplNumberArray;

    .line 659
    .line 660
    return-object v0

    .line 661
    :cond_4c
    const-class v11, [Ljava/lang/String;

    .line 662
    .line 663
    if-ne v0, v11, :cond_4d

    .line 664
    .line 665
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplStringArray;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplStringArray;

    .line 666
    .line 667
    return-object v0

    .line 668
    :cond_4d
    const-class v11, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 669
    .line 670
    if-ne v0, v11, :cond_4e

    .line 671
    .line 672
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromInt;

    .line 673
    .line 674
    new-instance v2, Lcom/alibaba/fastjson2/reader/i;

    .line 675
    .line 676
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 677
    .line 678
    .line 679
    invoke-direct {v0, v11, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromInt;-><init>(Ljava/lang/Class;Ljava/util/function/IntFunction;)V

    .line 680
    .line 681
    .line 682
    return-object v0

    .line 683
    :cond_4e
    const-class v11, Ljava/util/concurrent/atomic/AtomicLong;

    .line 684
    .line 685
    if-ne v0, v11, :cond_4f

    .line 686
    .line 687
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromLong;

    .line 688
    .line 689
    new-instance v2, Lcom/alibaba/fastjson2/reader/j;

    .line 690
    .line 691
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 692
    .line 693
    .line 694
    invoke-direct {v0, v11, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFromLong;-><init>(Ljava/lang/Class;Ljava/util/function/LongFunction;)V

    .line 695
    .line 696
    .line 697
    return-object v0

    .line 698
    :cond_4f
    const-class v11, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 699
    .line 700
    if-ne v0, v11, :cond_50

    .line 701
    .line 702
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt32ValueArray;

    .line 703
    .line 704
    new-instance v2, Lcom/alibaba/fastjson2/reader/f;

    .line 705
    .line 706
    const/16 v3, 0x1a

    .line 707
    .line 708
    invoke-direct {v2, v3}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 709
    .line 710
    .line 711
    invoke-direct {v0, v11, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt32ValueArray;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 712
    .line 713
    .line 714
    return-object v0

    .line 715
    :cond_50
    const-class v11, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 716
    .line 717
    if-ne v0, v11, :cond_51

    .line 718
    .line 719
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt64ValueArray;

    .line 720
    .line 721
    new-instance v2, Lcom/alibaba/fastjson2/reader/f;

    .line 722
    .line 723
    const/16 v3, 0x1b

    .line 724
    .line 725
    invoke-direct {v2, v3}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 726
    .line 727
    .line 728
    invoke-direct {v0, v11, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt64ValueArray;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V

    .line 729
    .line 730
    .line 731
    return-object v0

    .line 732
    :cond_51
    const-class v11, Ljava/util/concurrent/atomic/AtomicReference;

    .line 733
    .line 734
    if-ne v0, v11, :cond_52

    .line 735
    .line 736
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplAtomicReference;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplAtomicReference;

    .line 737
    .line 738
    return-object v0

    .line 739
    :cond_52
    move-object/from16 v21, v15

    .line 740
    .line 741
    instance-of v15, v0, Lcom/alibaba/fastjson2/util/MultiType;

    .line 742
    .line 743
    if-eqz v15, :cond_53

    .line 744
    .line 745
    new-instance v2, Lcom/alibaba/fastjson2/reader/ObjectArrayReaderMultiType;

    .line 746
    .line 747
    check-cast v0, Lcom/alibaba/fastjson2/util/MultiType;

    .line 748
    .line 749
    invoke-direct {v2, v0}, Lcom/alibaba/fastjson2/reader/ObjectArrayReaderMultiType;-><init>(Lcom/alibaba/fastjson2/util/MultiType;)V

    .line 750
    .line 751
    .line 752
    return-object v2

    .line 753
    :cond_53
    instance-of v15, v0, Lcom/alibaba/fastjson2/util/MapMultiValueType;

    .line 754
    .line 755
    if-eqz v15, :cond_54

    .line 756
    .line 757
    new-instance v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapMultiValueType;

    .line 758
    .line 759
    check-cast v0, Lcom/alibaba/fastjson2/util/MapMultiValueType;

    .line 760
    .line 761
    invoke-direct {v2, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapMultiValueType;-><init>(Lcom/alibaba/fastjson2/util/MapMultiValueType;)V

    .line 762
    .line 763
    .line 764
    return-object v2

    .line 765
    :cond_54
    const-class v15, Ljava/lang/StringBuffer;

    .line 766
    .line 767
    if-eq v0, v15, :cond_55

    .line 768
    .line 769
    const-class v15, Ljava/lang/StringBuilder;

    .line 770
    .line 771
    if-ne v0, v15, :cond_56

    .line 772
    .line 773
    :cond_55
    move-object/from16 v4, p0

    .line 774
    .line 775
    goto/16 :goto_16

    .line 776
    .line 777
    :cond_56
    const-class v15, Ljava/lang/Iterable;

    .line 778
    .line 779
    if-eq v0, v15, :cond_57

    .line 780
    .line 781
    move-object/from16 v22, v4

    .line 782
    .line 783
    const-class v4, Ljava/util/Collection;

    .line 784
    .line 785
    if-eq v0, v4, :cond_57

    .line 786
    .line 787
    const-class v1, Ljava/util/List;

    .line 788
    .line 789
    if-eq v0, v1, :cond_57

    .line 790
    .line 791
    move-object/from16 v23, v11

    .line 792
    .line 793
    const-class v11, Ljava/util/AbstractCollection;

    .line 794
    .line 795
    if-eq v0, v11, :cond_57

    .line 796
    .line 797
    move-object/from16 v24, v5

    .line 798
    .line 799
    const-class v5, Ljava/util/AbstractList;

    .line 800
    .line 801
    if-eq v0, v5, :cond_57

    .line 802
    .line 803
    move-object/from16 v25, v5

    .line 804
    .line 805
    const-class v5, Ljava/util/ArrayList;

    .line 806
    .line 807
    if-ne v0, v5, :cond_58

    .line 808
    .line 809
    :cond_57
    move-object/from16 v4, p0

    .line 810
    .line 811
    const/4 v5, 0x0

    .line 812
    const-wide/16 v14, 0x0

    .line 813
    .line 814
    goto/16 :goto_15

    .line 815
    .line 816
    :cond_58
    move-object/from16 v26, v5

    .line 817
    .line 818
    const-class v5, Ljava/util/Queue;

    .line 819
    .line 820
    if-eq v0, v5, :cond_59

    .line 821
    .line 822
    move-object/from16 v27, v5

    .line 823
    .line 824
    const-class v5, Ljava/util/Deque;

    .line 825
    .line 826
    if-eq v0, v5, :cond_59

    .line 827
    .line 828
    move-object/from16 v28, v5

    .line 829
    .line 830
    const-class v5, Ljava/util/AbstractSequentialList;

    .line 831
    .line 832
    if-eq v0, v5, :cond_59

    .line 833
    .line 834
    move-object/from16 v29, v5

    .line 835
    .line 836
    const-class v5, Ljava/util/LinkedList;

    .line 837
    .line 838
    if-ne v0, v5, :cond_5a

    .line 839
    .line 840
    :cond_59
    move-object/from16 v4, p0

    .line 841
    .line 842
    const/4 v5, 0x0

    .line 843
    const-wide/16 v14, 0x0

    .line 844
    .line 845
    goto/16 :goto_14

    .line 846
    .line 847
    :cond_5a
    move-object/from16 v30, v5

    .line 848
    .line 849
    const-class v5, Ljava/util/Set;

    .line 850
    .line 851
    if-eq v0, v5, :cond_5b

    .line 852
    .line 853
    move-object/from16 v31, v5

    .line 854
    .line 855
    const-class v5, Ljava/util/AbstractSet;

    .line 856
    .line 857
    if-eq v0, v5, :cond_5b

    .line 858
    .line 859
    move-object/from16 v32, v5

    .line 860
    .line 861
    const-class v5, Ljava/util/EnumSet;

    .line 862
    .line 863
    if-ne v0, v5, :cond_5c

    .line 864
    .line 865
    :cond_5b
    move-object/from16 v4, p0

    .line 866
    .line 867
    const/4 v5, 0x0

    .line 868
    const-wide/16 v14, 0x0

    .line 869
    .line 870
    goto/16 :goto_13

    .line 871
    .line 872
    :cond_5c
    move-object/from16 v33, v5

    .line 873
    .line 874
    const-class v5, Ljava/util/NavigableSet;

    .line 875
    .line 876
    if-eq v0, v5, :cond_5d

    .line 877
    .line 878
    move-object/from16 v34, v5

    .line 879
    .line 880
    const-class v5, Ljava/util/SortedSet;

    .line 881
    .line 882
    if-ne v0, v5, :cond_5e

    .line 883
    .line 884
    :cond_5d
    move-object/from16 v4, p0

    .line 885
    .line 886
    const/4 v5, 0x0

    .line 887
    const-wide/16 v14, 0x0

    .line 888
    .line 889
    goto/16 :goto_12

    .line 890
    .line 891
    :cond_5e
    move-object/from16 v35, v5

    .line 892
    .line 893
    const-class v5, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 894
    .line 895
    if-eq v0, v5, :cond_5f

    .line 896
    .line 897
    move-object/from16 v36, v5

    .line 898
    .line 899
    const-class v5, Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 900
    .line 901
    if-eq v0, v5, :cond_5f

    .line 902
    .line 903
    move-object/from16 v37, v5

    .line 904
    .line 905
    const-class v5, Ljava/util/LinkedHashSet;

    .line 906
    .line 907
    if-eq v0, v5, :cond_5f

    .line 908
    .line 909
    move-object/from16 v38, v5

    .line 910
    .line 911
    const-class v5, Ljava/util/HashSet;

    .line 912
    .line 913
    if-eq v0, v5, :cond_5f

    .line 914
    .line 915
    move-object/from16 v39, v5

    .line 916
    .line 917
    const-class v5, Ljava/util/TreeSet;

    .line 918
    .line 919
    if-eq v0, v5, :cond_5f

    .line 920
    .line 921
    move-object/from16 v40, v5

    .line 922
    .line 923
    const-class v5, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 924
    .line 925
    if-ne v0, v5, :cond_60

    .line 926
    .line 927
    :cond_5f
    move-object/from16 v4, p0

    .line 928
    .line 929
    const/4 v5, 0x0

    .line 930
    const-wide/16 v14, 0x0

    .line 931
    .line 932
    goto/16 :goto_11

    .line 933
    .line 934
    :cond_60
    move-object/from16 v41, v5

    .line 935
    .line 936
    sget-object v5, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_EMPTY_SET:Ljava/lang/Class;

    .line 937
    .line 938
    if-eq v0, v5, :cond_61

    .line 939
    .line 940
    sget-object v5, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_EMPTY_LIST:Ljava/lang/Class;

    .line 941
    .line 942
    if-eq v0, v5, :cond_61

    .line 943
    .line 944
    sget-object v5, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_SINGLETON:Ljava/lang/Class;

    .line 945
    .line 946
    if-eq v0, v5, :cond_61

    .line 947
    .line 948
    sget-object v5, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_SINGLETON_LIST:Ljava/lang/Class;

    .line 949
    .line 950
    if-eq v0, v5, :cond_61

    .line 951
    .line 952
    sget-object v5, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_ARRAYS_LIST:Ljava/lang/Class;

    .line 953
    .line 954
    if-eq v0, v5, :cond_61

    .line 955
    .line 956
    sget-object v5, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_UNMODIFIABLE_COLLECTION:Ljava/lang/Class;

    .line 957
    .line 958
    if-eq v0, v5, :cond_61

    .line 959
    .line 960
    sget-object v5, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_UNMODIFIABLE_LIST:Ljava/lang/Class;

    .line 961
    .line 962
    if-eq v0, v5, :cond_61

    .line 963
    .line 964
    sget-object v5, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->CLASS_UNMODIFIABLE_SET:Ljava/lang/Class;

    .line 965
    .line 966
    if-ne v0, v5, :cond_62

    .line 967
    .line 968
    :cond_61
    move-object/from16 v4, p0

    .line 969
    .line 970
    const/4 v5, 0x0

    .line 971
    const-wide/16 v14, 0x0

    .line 972
    .line 973
    goto/16 :goto_10

    .line 974
    .line 975
    :cond_62
    sget-object v5, Lcom/alibaba/fastjson2/util/TypeUtils;->CLASS_SINGLE_SET:Ljava/lang/Class;

    .line 976
    .line 977
    if-ne v0, v5, :cond_63

    .line 978
    .line 979
    const/4 v5, 0x0

    .line 980
    const-wide/16 v14, 0x0

    .line 981
    .line 982
    invoke-static {v0, v5, v14, v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 983
    .line 984
    .line 985
    move-result-object v0

    .line 986
    return-object v0

    .line 987
    :cond_63
    move-object/from16 v43, v14

    .line 988
    .line 989
    move-object/from16 v42, v15

    .line 990
    .line 991
    if-eq v0, v6, :cond_64

    .line 992
    .line 993
    const-class v5, Ljava/lang/Cloneable;

    .line 994
    .line 995
    if-eq v0, v5, :cond_64

    .line 996
    .line 997
    const-class v5, Ljava/io/Closeable;

    .line 998
    .line 999
    if-eq v0, v5, :cond_64

    .line 1000
    .line 1001
    const-class v5, Ljava/io/Serializable;

    .line 1002
    .line 1003
    if-eq v0, v5, :cond_64

    .line 1004
    .line 1005
    const-class v5, Ljava/lang/Comparable;

    .line 1006
    .line 1007
    if-ne v0, v5, :cond_65

    .line 1008
    .line 1009
    :cond_64
    move-object/from16 v4, p0

    .line 1010
    .line 1011
    goto/16 :goto_f

    .line 1012
    .line 1013
    :cond_65
    const-class v5, Ljava/util/Map$Entry;

    .line 1014
    .line 1015
    if-ne v0, v5, :cond_66

    .line 1016
    .line 1017
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;

    .line 1018
    .line 1019
    const/4 v14, 0x0

    .line 1020
    invoke-direct {v0, v14, v14}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    .line 1021
    .line 1022
    .line 1023
    return-object v0

    .line 1024
    :cond_66
    const/4 v14, 0x0

    .line 1025
    if-eqz v19, :cond_6b

    .line 1026
    .line 1027
    move-object v15, v0

    .line 1028
    check-cast v15, Ljava/lang/Class;

    .line 1029
    .line 1030
    invoke-virtual {v7, v15}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1031
    .line 1032
    .line 1033
    move-result v18

    .line 1034
    if-eqz v18, :cond_67

    .line 1035
    .line 1036
    const-wide/16 v10, 0x0

    .line 1037
    .line 1038
    invoke-static {v14, v15, v10, v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    return-object v0

    .line 1043
    :cond_67
    move-object/from16 v19, v10

    .line 1044
    .line 1045
    move-object/from16 v44, v11

    .line 1046
    .line 1047
    const-wide/16 v10, 0x0

    .line 1048
    .line 1049
    invoke-virtual {v4, v15}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1050
    .line 1051
    .line 1052
    move-result v14

    .line 1053
    if-eqz v14, :cond_68

    .line 1054
    .line 1055
    invoke-static {v15, v15, v10, v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    return-object v0

    .line 1060
    :cond_68
    invoke-virtual {v15}, Ljava/lang/Class;->isArray()Z

    .line 1061
    .line 1062
    .line 1063
    move-result v10

    .line 1064
    if-eqz v10, :cond_6a

    .line 1065
    .line 1066
    invoke-virtual {v15}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v0

    .line 1070
    if-ne v0, v6, :cond_69

    .line 1071
    .line 1072
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectArrayReader;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectArrayReader;

    .line 1073
    .line 1074
    return-object v0

    .line 1075
    :cond_69
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;

    .line 1076
    .line 1077
    invoke-direct {v0, v15}, Lcom/alibaba/fastjson2/reader/ObjectArrayTypedReader;-><init>(Ljava/lang/Class;)V

    .line 1078
    .line 1079
    .line 1080
    return-object v0

    .line 1081
    :cond_6a
    sget-object v6, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 1082
    .line 1083
    iget-object v6, v6, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->creator:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 1084
    .line 1085
    const-class v10, Ljava/lang/StackTraceElement;

    .line 1086
    .line 1087
    if-ne v15, v10, :cond_6c

    .line 1088
    .line 1089
    :try_start_0
    filled-new-array {v2, v2, v2, v3}, [Ljava/lang/Class;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v3

    .line 1093
    invoke-virtual {v15, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v3

    .line 1097
    const-string v10, "className"

    .line 1098
    .line 1099
    const-string v11, "methodName"

    .line 1100
    .line 1101
    const-string v14, "fileName"

    .line 1102
    .line 1103
    const-string v15, "lineNumber"

    .line 1104
    .line 1105
    filled-new-array {v10, v11, v14, v15}, [Ljava/lang/String;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v10

    .line 1109
    invoke-virtual {v6, v3, v10}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createObjectReaderNoneDefaultConstructor(Ljava/lang/reflect/Constructor;[Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1113
    return-object v0

    .line 1114
    :cond_6b
    move-object/from16 v19, v10

    .line 1115
    .line 1116
    move-object/from16 v44, v11

    .line 1117
    .line 1118
    :catchall_0
    :cond_6c
    instance-of v3, v0, Ljava/lang/reflect/ParameterizedType;

    .line 1119
    .line 1120
    if-eqz v3, :cond_8e

    .line 1121
    .line 1122
    move-object v3, v0

    .line 1123
    check-cast v3, Ljava/lang/reflect/ParameterizedType;

    .line 1124
    .line 1125
    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v6

    .line 1129
    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v3

    .line 1133
    array-length v10, v3

    .line 1134
    const/4 v11, 0x2

    .line 1135
    if-ne v10, v11, :cond_75

    .line 1136
    .line 1137
    aget-object v10, v3, v16

    .line 1138
    .line 1139
    aget-object v11, v3, v17

    .line 1140
    .line 1141
    const-class v14, Ljava/util/HashMap;

    .line 1142
    .line 1143
    if-eq v6, v7, :cond_74

    .line 1144
    .line 1145
    if-eq v6, v12, :cond_74

    .line 1146
    .line 1147
    if-ne v6, v14, :cond_6d

    .line 1148
    .line 1149
    goto :goto_5

    .line 1150
    :cond_6d
    if-eq v6, v13, :cond_73

    .line 1151
    .line 1152
    if-ne v6, v8, :cond_6e

    .line 1153
    .line 1154
    goto :goto_4

    .line 1155
    :cond_6e
    move-object/from16 v7, v19

    .line 1156
    .line 1157
    if-eq v6, v9, :cond_72

    .line 1158
    .line 1159
    if-ne v6, v7, :cond_6f

    .line 1160
    .line 1161
    goto :goto_3

    .line 1162
    :cond_6f
    const-class v7, Ljava/util/LinkedHashMap;

    .line 1163
    .line 1164
    if-eq v6, v7, :cond_71

    .line 1165
    .line 1166
    move-object/from16 v7, v43

    .line 1167
    .line 1168
    if-eq v6, v7, :cond_71

    .line 1169
    .line 1170
    const-class v7, Ljava/util/EnumMap;

    .line 1171
    .line 1172
    if-ne v6, v7, :cond_70

    .line 1173
    .line 1174
    goto :goto_2

    .line 1175
    :cond_70
    if-ne v6, v5, :cond_75

    .line 1176
    .line 1177
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;

    .line 1178
    .line 1179
    invoke-direct {v0, v10, v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    .line 1180
    .line 1181
    .line 1182
    return-object v0

    .line 1183
    :cond_71
    :goto_2
    check-cast v6, Ljava/lang/Class;

    .line 1184
    .line 1185
    invoke-static {v6, v6, v10, v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->typedMap(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v0

    .line 1189
    return-object v0

    .line 1190
    :cond_72
    :goto_3
    check-cast v6, Ljava/lang/Class;

    .line 1191
    .line 1192
    invoke-static {v6, v7, v10, v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->typedMap(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v0

    .line 1196
    return-object v0

    .line 1197
    :cond_73
    :goto_4
    check-cast v6, Ljava/lang/Class;

    .line 1198
    .line 1199
    invoke-static {v6, v8, v10, v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->typedMap(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v0

    .line 1203
    return-object v0

    .line 1204
    :cond_74
    :goto_5
    check-cast v6, Ljava/lang/Class;

    .line 1205
    .line 1206
    invoke-static {v6, v14, v10, v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->typedMap(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v0

    .line 1210
    return-object v0

    .line 1211
    :cond_75
    array-length v5, v3

    .line 1212
    move/from16 v7, v17

    .line 1213
    .line 1214
    if-ne v5, v7, :cond_81

    .line 1215
    .line 1216
    aget-object v3, v3, v16

    .line 1217
    .line 1218
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v5

    .line 1222
    move-object/from16 v7, v42

    .line 1223
    .line 1224
    if-eq v6, v7, :cond_8b

    .line 1225
    .line 1226
    if-eq v6, v4, :cond_8b

    .line 1227
    .line 1228
    if-eq v6, v1, :cond_8b

    .line 1229
    .line 1230
    move-object/from16 v1, v44

    .line 1231
    .line 1232
    if-eq v6, v1, :cond_8b

    .line 1233
    .line 1234
    move-object/from16 v1, v25

    .line 1235
    .line 1236
    if-eq v6, v1, :cond_8b

    .line 1237
    .line 1238
    move-object/from16 v1, v26

    .line 1239
    .line 1240
    if-eq v6, v1, :cond_76

    .line 1241
    .line 1242
    const-class v4, Ljava/util/Stack;

    .line 1243
    .line 1244
    if-ne v6, v4, :cond_77

    .line 1245
    .line 1246
    :cond_76
    move-object/from16 v4, p0

    .line 1247
    .line 1248
    move-object/from16 v7, v22

    .line 1249
    .line 1250
    goto/16 :goto_b

    .line 1251
    .line 1252
    :cond_77
    move-object/from16 v4, v27

    .line 1253
    .line 1254
    if-eq v6, v4, :cond_88

    .line 1255
    .line 1256
    move-object/from16 v1, v28

    .line 1257
    .line 1258
    if-eq v6, v1, :cond_88

    .line 1259
    .line 1260
    move-object/from16 v1, v29

    .line 1261
    .line 1262
    if-eq v6, v1, :cond_88

    .line 1263
    .line 1264
    move-object/from16 v1, v30

    .line 1265
    .line 1266
    if-ne v6, v1, :cond_78

    .line 1267
    .line 1268
    move-object/from16 v4, p0

    .line 1269
    .line 1270
    move-object/from16 v7, v22

    .line 1271
    .line 1272
    goto/16 :goto_a

    .line 1273
    .line 1274
    :cond_78
    move-object/from16 v4, v31

    .line 1275
    .line 1276
    if-eq v6, v4, :cond_79

    .line 1277
    .line 1278
    move-object/from16 v1, v32

    .line 1279
    .line 1280
    if-eq v6, v1, :cond_79

    .line 1281
    .line 1282
    move-object/from16 v1, v33

    .line 1283
    .line 1284
    if-ne v6, v1, :cond_7a

    .line 1285
    .line 1286
    :cond_79
    move-object/from16 v4, p0

    .line 1287
    .line 1288
    move-object/from16 v7, v22

    .line 1289
    .line 1290
    move-object/from16 v1, v39

    .line 1291
    .line 1292
    goto/16 :goto_9

    .line 1293
    .line 1294
    :cond_7a
    move-object/from16 v1, v34

    .line 1295
    .line 1296
    if-eq v6, v1, :cond_7b

    .line 1297
    .line 1298
    move-object/from16 v1, v35

    .line 1299
    .line 1300
    if-ne v6, v1, :cond_7c

    .line 1301
    .line 1302
    :cond_7b
    move-object/from16 v4, p0

    .line 1303
    .line 1304
    move-object/from16 v7, v22

    .line 1305
    .line 1306
    move-object/from16 v1, v40

    .line 1307
    .line 1308
    goto :goto_8

    .line 1309
    :cond_7c
    move-object/from16 v1, v36

    .line 1310
    .line 1311
    if-eq v6, v1, :cond_7d

    .line 1312
    .line 1313
    move-object/from16 v1, v37

    .line 1314
    .line 1315
    if-eq v6, v1, :cond_7d

    .line 1316
    .line 1317
    move-object/from16 v1, v38

    .line 1318
    .line 1319
    if-eq v6, v1, :cond_7d

    .line 1320
    .line 1321
    move-object/from16 v1, v39

    .line 1322
    .line 1323
    if-eq v6, v1, :cond_7d

    .line 1324
    .line 1325
    move-object/from16 v1, v40

    .line 1326
    .line 1327
    if-eq v6, v1, :cond_7d

    .line 1328
    .line 1329
    move-object/from16 v1, v41

    .line 1330
    .line 1331
    if-ne v6, v1, :cond_7e

    .line 1332
    .line 1333
    :cond_7d
    move-object/from16 v4, p0

    .line 1334
    .line 1335
    goto :goto_7

    .line 1336
    :cond_7e
    move-object/from16 v1, v24

    .line 1337
    .line 1338
    if-ne v6, v1, :cond_7f

    .line 1339
    .line 1340
    const/4 v14, 0x0

    .line 1341
    invoke-static {v0, v14, v14}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplOptional;->of(Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/reader/ObjectReaderImplOptional;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v0

    .line 1345
    return-object v0

    .line 1346
    :cond_7f
    move-object/from16 v0, v23

    .line 1347
    .line 1348
    if-ne v6, v0, :cond_80

    .line 1349
    .line 1350
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplAtomicReference;

    .line 1351
    .line 1352
    invoke-direct {v0, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplAtomicReference;-><init>(Ljava/lang/reflect/Type;)V

    .line 1353
    .line 1354
    .line 1355
    return-object v0

    .line 1356
    :cond_80
    instance-of v0, v3, Ljava/lang/reflect/WildcardType;

    .line 1357
    .line 1358
    if-eqz v0, :cond_81

    .line 1359
    .line 1360
    move-object/from16 v4, p0

    .line 1361
    .line 1362
    invoke-virtual {v4, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReaderModule(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v0

    .line 1366
    return-object v0

    .line 1367
    :cond_81
    move-object/from16 v4, p0

    .line 1368
    .line 1369
    :goto_6
    const/4 v5, 0x0

    .line 1370
    goto/16 :goto_e

    .line 1371
    .line 1372
    :goto_7
    if-ne v3, v2, :cond_82

    .line 1373
    .line 1374
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;

    .line 1375
    .line 1376
    check-cast v6, Ljava/lang/Class;

    .line 1377
    .line 1378
    invoke-direct {v0, v6, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 1379
    .line 1380
    .line 1381
    return-object v0

    .line 1382
    :cond_82
    move-object/from16 v7, v22

    .line 1383
    .line 1384
    if-ne v5, v7, :cond_83

    .line 1385
    .line 1386
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;

    .line 1387
    .line 1388
    check-cast v6, Ljava/lang/Class;

    .line 1389
    .line 1390
    invoke-direct {v0, v6, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 1391
    .line 1392
    .line 1393
    return-object v0

    .line 1394
    :cond_83
    const/4 v5, 0x0

    .line 1395
    const-wide/16 v14, 0x0

    .line 1396
    .line 1397
    invoke-static {v0, v5, v14, v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0

    .line 1401
    return-object v0

    .line 1402
    :goto_8
    if-ne v3, v2, :cond_84

    .line 1403
    .line 1404
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;

    .line 1405
    .line 1406
    check-cast v6, Ljava/lang/Class;

    .line 1407
    .line 1408
    invoke-direct {v0, v6, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 1409
    .line 1410
    .line 1411
    return-object v0

    .line 1412
    :cond_84
    if-ne v5, v7, :cond_85

    .line 1413
    .line 1414
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;

    .line 1415
    .line 1416
    check-cast v6, Ljava/lang/Class;

    .line 1417
    .line 1418
    invoke-direct {v0, v6, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 1419
    .line 1420
    .line 1421
    return-object v0

    .line 1422
    :cond_85
    const/4 v5, 0x0

    .line 1423
    const-wide/16 v14, 0x0

    .line 1424
    .line 1425
    invoke-static {v0, v5, v14, v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v0

    .line 1429
    return-object v0

    .line 1430
    :goto_9
    if-ne v5, v2, :cond_86

    .line 1431
    .line 1432
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;

    .line 1433
    .line 1434
    check-cast v6, Ljava/lang/Class;

    .line 1435
    .line 1436
    invoke-direct {v0, v6, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 1437
    .line 1438
    .line 1439
    return-object v0

    .line 1440
    :cond_86
    if-ne v5, v7, :cond_87

    .line 1441
    .line 1442
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;

    .line 1443
    .line 1444
    check-cast v6, Ljava/lang/Class;

    .line 1445
    .line 1446
    invoke-direct {v0, v6, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 1447
    .line 1448
    .line 1449
    return-object v0

    .line 1450
    :cond_87
    const/4 v5, 0x0

    .line 1451
    const-wide/16 v14, 0x0

    .line 1452
    .line 1453
    invoke-static {v0, v5, v14, v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v0

    .line 1457
    return-object v0

    .line 1458
    :cond_88
    move-object/from16 v4, p0

    .line 1459
    .line 1460
    move-object/from16 v7, v22

    .line 1461
    .line 1462
    move-object/from16 v1, v30

    .line 1463
    .line 1464
    :goto_a
    if-ne v5, v2, :cond_89

    .line 1465
    .line 1466
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;

    .line 1467
    .line 1468
    check-cast v6, Ljava/lang/Class;

    .line 1469
    .line 1470
    invoke-direct {v0, v6, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 1471
    .line 1472
    .line 1473
    return-object v0

    .line 1474
    :cond_89
    if-ne v5, v7, :cond_8a

    .line 1475
    .line 1476
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;

    .line 1477
    .line 1478
    check-cast v6, Ljava/lang/Class;

    .line 1479
    .line 1480
    invoke-direct {v0, v6, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 1481
    .line 1482
    .line 1483
    return-object v0

    .line 1484
    :cond_8a
    const/4 v5, 0x0

    .line 1485
    const-wide/16 v14, 0x0

    .line 1486
    .line 1487
    invoke-static {v0, v5, v14, v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v0

    .line 1491
    return-object v0

    .line 1492
    :cond_8b
    move-object/from16 v4, p0

    .line 1493
    .line 1494
    move-object/from16 v7, v22

    .line 1495
    .line 1496
    move-object/from16 v1, v26

    .line 1497
    .line 1498
    :goto_b
    if-ne v5, v2, :cond_8c

    .line 1499
    .line 1500
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;

    .line 1501
    .line 1502
    check-cast v6, Ljava/lang/Class;

    .line 1503
    .line 1504
    invoke-direct {v0, v6, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListStr;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 1505
    .line 1506
    .line 1507
    return-object v0

    .line 1508
    :cond_8c
    if-ne v5, v7, :cond_8d

    .line 1509
    .line 1510
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;

    .line 1511
    .line 1512
    check-cast v6, Ljava/lang/Class;

    .line 1513
    .line 1514
    invoke-direct {v0, v6, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplListInt64;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 1515
    .line 1516
    .line 1517
    return-object v0

    .line 1518
    :cond_8d
    const/4 v5, 0x0

    .line 1519
    const-wide/16 v14, 0x0

    .line 1520
    .line 1521
    invoke-static {v0, v5, v14, v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v0

    .line 1525
    return-object v0

    .line 1526
    :cond_8e
    move-object/from16 v4, p0

    .line 1527
    .line 1528
    const/4 v11, 0x2

    .line 1529
    instance-of v1, v0, Ljava/lang/reflect/GenericArrayType;

    .line 1530
    .line 1531
    if-eqz v1, :cond_8f

    .line 1532
    .line 1533
    new-instance v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;

    .line 1534
    .line 1535
    check-cast v0, Ljava/lang/reflect/GenericArrayType;

    .line 1536
    .line 1537
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplGenericArray;-><init>(Ljava/lang/reflect/GenericArrayType;)V

    .line 1538
    .line 1539
    .line 1540
    return-object v1

    .line 1541
    :cond_8f
    instance-of v1, v0, Ljava/lang/reflect/WildcardType;

    .line 1542
    .line 1543
    if-eqz v1, :cond_90

    .line 1544
    .line 1545
    move-object v1, v0

    .line 1546
    check-cast v1, Ljava/lang/reflect/WildcardType;

    .line 1547
    .line 1548
    invoke-interface {v1}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v1

    .line 1552
    array-length v3, v1

    .line 1553
    const/4 v7, 0x1

    .line 1554
    if-ne v3, v7, :cond_91

    .line 1555
    .line 1556
    aget-object v0, v1, v16

    .line 1557
    .line 1558
    invoke-virtual {v4, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v0

    .line 1562
    return-object v0

    .line 1563
    :cond_90
    const/4 v7, 0x1

    .line 1564
    :cond_91
    const-class v1, Ljava/lang/reflect/ParameterizedType;

    .line 1565
    .line 1566
    if-ne v0, v1, :cond_92

    .line 1567
    .line 1568
    const-class v0, Lcom/alibaba/fastjson2/util/ParameterizedTypeImpl;

    .line 1569
    .line 1570
    invoke-static {v0}, Lcom/alibaba/fastjson2/reader/ObjectReaders;->ofReflect(Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v0

    .line 1574
    return-object v0

    .line 1575
    :cond_92
    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->hashCode()I

    .line 1576
    .line 1577
    .line 1578
    move-result v1

    .line 1579
    const/4 v3, -0x1

    .line 1580
    sparse-switch v1, :sswitch_data_0

    .line 1581
    .line 1582
    .line 1583
    :goto_c
    move v7, v3

    .line 1584
    goto/16 :goto_d

    .line 1585
    .line 1586
    :sswitch_0
    const-string v1, "java.util.RegularEnumSet"

    .line 1587
    .line 1588
    move-object/from16 v15, v21

    .line 1589
    .line 1590
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1591
    .line 1592
    .line 1593
    move-result v1

    .line 1594
    if-nez v1, :cond_93

    .line 1595
    .line 1596
    goto :goto_c

    .line 1597
    :cond_93
    move/from16 v7, v20

    .line 1598
    .line 1599
    goto/16 :goto_d

    .line 1600
    .line 1601
    :sswitch_1
    move-object/from16 v15, v21

    .line 1602
    .line 1603
    const-string v1, "java.net.InetSocketAddress"

    .line 1604
    .line 1605
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1606
    .line 1607
    .line 1608
    move-result v1

    .line 1609
    if-nez v1, :cond_94

    .line 1610
    .line 1611
    goto :goto_c

    .line 1612
    :cond_94
    const/4 v7, 0x6

    .line 1613
    goto :goto_d

    .line 1614
    :sswitch_2
    move-object/from16 v15, v21

    .line 1615
    .line 1616
    const-string v1, "java.text.SimpleDateFormat"

    .line 1617
    .line 1618
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1619
    .line 1620
    .line 1621
    move-result v1

    .line 1622
    if-nez v1, :cond_95

    .line 1623
    .line 1624
    goto :goto_c

    .line 1625
    :cond_95
    const/4 v7, 0x5

    .line 1626
    goto :goto_d

    .line 1627
    :sswitch_3
    move-object/from16 v15, v21

    .line 1628
    .line 1629
    const-string v1, "java.sql.Timestamp"

    .line 1630
    .line 1631
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1632
    .line 1633
    .line 1634
    move-result v1

    .line 1635
    if-nez v1, :cond_96

    .line 1636
    .line 1637
    goto :goto_c

    .line 1638
    :cond_96
    const/4 v7, 0x4

    .line 1639
    goto :goto_d

    .line 1640
    :sswitch_4
    move-object/from16 v15, v21

    .line 1641
    .line 1642
    const-string v1, "java.sql.Time"

    .line 1643
    .line 1644
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1645
    .line 1646
    .line 1647
    move-result v1

    .line 1648
    if-nez v1, :cond_97

    .line 1649
    .line 1650
    goto :goto_c

    .line 1651
    :cond_97
    const/4 v7, 0x3

    .line 1652
    goto :goto_d

    .line 1653
    :sswitch_5
    move-object/from16 v15, v21

    .line 1654
    .line 1655
    const-string v1, "java.sql.Date"

    .line 1656
    .line 1657
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1658
    .line 1659
    .line 1660
    move-result v1

    .line 1661
    if-nez v1, :cond_98

    .line 1662
    .line 1663
    goto :goto_c

    .line 1664
    :cond_98
    move v7, v11

    .line 1665
    goto :goto_d

    .line 1666
    :sswitch_6
    move-object/from16 v15, v21

    .line 1667
    .line 1668
    const-string v1, "java.net.InetAddress"

    .line 1669
    .line 1670
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1671
    .line 1672
    .line 1673
    move-result v1

    .line 1674
    if-nez v1, :cond_9a

    .line 1675
    .line 1676
    goto :goto_c

    .line 1677
    :sswitch_7
    move-object/from16 v15, v21

    .line 1678
    .line 1679
    const-string v1, "java.util.JumboEnumSet"

    .line 1680
    .line 1681
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1682
    .line 1683
    .line 1684
    move-result v1

    .line 1685
    if-nez v1, :cond_99

    .line 1686
    .line 1687
    goto :goto_c

    .line 1688
    :cond_99
    move/from16 v7, v16

    .line 1689
    .line 1690
    :cond_9a
    :goto_d
    packed-switch v7, :pswitch_data_0

    .line 1691
    .line 1692
    .line 1693
    goto/16 :goto_6

    .line 1694
    .line 1695
    :goto_e
    return-object v5

    .line 1696
    :pswitch_0
    new-instance v1, Lcom/alibaba/fastjson2/reader/ObjectReaderMisc;

    .line 1697
    .line 1698
    check-cast v0, Ljava/lang/Class;

    .line 1699
    .line 1700
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderMisc;-><init>(Ljava/lang/Class;)V

    .line 1701
    .line 1702
    .line 1703
    return-object v1

    .line 1704
    :pswitch_1
    check-cast v0, Ljava/lang/Class;

    .line 1705
    .line 1706
    new-instance v1, Lcom/alibaba/fastjson2/reader/f;

    .line 1707
    .line 1708
    const/16 v3, 0x1d

    .line 1709
    .line 1710
    invoke-direct {v1, v3}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 1711
    .line 1712
    .line 1713
    invoke-static {v0, v2, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->of(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v0

    .line 1717
    return-object v0

    .line 1718
    :pswitch_2
    const/4 v5, 0x0

    .line 1719
    new-instance v0, Lcom/alibaba/fastjson2/util/JdbcSupport$TimestampReader;

    .line 1720
    .line 1721
    invoke-direct {v0, v5, v5}, Lcom/alibaba/fastjson2/util/JdbcSupport$TimestampReader;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1722
    .line 1723
    .line 1724
    return-object v0

    .line 1725
    :pswitch_3
    const/4 v5, 0x0

    .line 1726
    new-instance v0, Lcom/alibaba/fastjson2/util/JdbcSupport$TimeReader;

    .line 1727
    .line 1728
    invoke-direct {v0, v5, v5}, Lcom/alibaba/fastjson2/util/JdbcSupport$TimeReader;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1729
    .line 1730
    .line 1731
    return-object v0

    .line 1732
    :pswitch_4
    const/4 v5, 0x0

    .line 1733
    new-instance v0, Lcom/alibaba/fastjson2/util/JdbcSupport$DateReader;

    .line 1734
    .line 1735
    invoke-direct {v0, v5, v5}, Lcom/alibaba/fastjson2/util/JdbcSupport$DateReader;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1736
    .line 1737
    .line 1738
    return-object v0

    .line 1739
    :pswitch_5
    check-cast v0, Ljava/lang/Class;

    .line 1740
    .line 1741
    new-instance v1, Lcom/alibaba/fastjson2/reader/f;

    .line 1742
    .line 1743
    const/16 v3, 0x1c

    .line 1744
    .line 1745
    invoke-direct {v1, v3}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 1746
    .line 1747
    .line 1748
    invoke-static {v0, v2, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;->of(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v0

    .line 1752
    return-object v0

    .line 1753
    :pswitch_6
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v1

    .line 1757
    const-wide/16 v14, 0x0

    .line 1758
    .line 1759
    invoke-static {v0, v1, v14, v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v0

    .line 1763
    return-object v0

    .line 1764
    :goto_f
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;

    .line 1765
    .line 1766
    return-object v0

    .line 1767
    :goto_10
    invoke-static {v0, v5, v14, v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v0

    .line 1771
    return-object v0

    .line 1772
    :goto_11
    invoke-static {v0, v5, v14, v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v0

    .line 1776
    return-object v0

    .line 1777
    :goto_12
    invoke-static {v0, v5, v14, v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1778
    .line 1779
    .line 1780
    move-result-object v0

    .line 1781
    return-object v0

    .line 1782
    :goto_13
    invoke-static {v0, v5, v14, v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v0

    .line 1786
    return-object v0

    .line 1787
    :goto_14
    invoke-static {v0, v5, v14, v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1788
    .line 1789
    .line 1790
    move-result-object v0

    .line 1791
    return-object v0

    .line 1792
    :goto_15
    invoke-static {v0, v5, v14, v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v0

    .line 1796
    return-object v0

    .line 1797
    :goto_16
    :try_start_1
    move-object v6, v0

    .line 1798
    check-cast v6, Ljava/lang/Class;

    .line 1799
    .line 1800
    new-instance v5, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;

    .line 1801
    .line 1802
    const-class v7, Ljava/lang/String;

    .line 1803
    .line 1804
    const-class v8, Ljava/lang/String;

    .line 1805
    .line 1806
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v0

    .line 1810
    invoke-virtual {v6, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v13

    .line 1814
    const/4 v14, 0x0

    .line 1815
    const/4 v15, 0x0

    .line 1816
    const-wide/16 v9, 0x0

    .line 1817
    .line 1818
    const/4 v11, 0x0

    .line 1819
    const/4 v12, 0x0

    .line 1820
    invoke-direct/range {v5 .. v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;JLjava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1821
    .line 1822
    .line 1823
    return-object v5

    .line 1824
    :catch_0
    move-exception v0

    .line 1825
    new-instance v1, Ljava/lang/RuntimeException;

    .line 1826
    .line 1827
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1828
    .line 1829
    .line 1830
    throw v1

    .line 1831
    :goto_17
    check-cast v0, Ljava/lang/Class;

    .line 1832
    .line 1833
    const/4 v5, 0x0

    .line 1834
    invoke-static {v0, v7, v5, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->typedMap(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1835
    .line 1836
    .line 1837
    move-result-object v0

    .line 1838
    return-object v0

    .line 1839
    :goto_18
    check-cast v0, Ljava/lang/Class;

    .line 1840
    .line 1841
    invoke-static {v0, v7, v5, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->typedMap(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1842
    .line 1843
    .line 1844
    move-result-object v0

    .line 1845
    return-object v0

    .line 1846
    :goto_19
    check-cast v0, Ljava/lang/Class;

    .line 1847
    .line 1848
    invoke-static {v0, v8, v5, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->typedMap(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v0

    .line 1852
    return-object v0

    .line 1853
    :goto_1a
    check-cast v0, Ljava/lang/Class;

    .line 1854
    .line 1855
    const-wide/16 v14, 0x0

    .line 1856
    .line 1857
    invoke-static {v5, v0, v14, v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v0

    .line 1861
    return-object v0

    .line 1862
    :goto_1b
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDouble;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplDouble;

    .line 1863
    .line 1864
    return-object v0

    .line 1865
    :goto_1c
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplFloat;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplFloat;

    .line 1866
    .line 1867
    return-object v0

    .line 1868
    :goto_1d
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt64;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt64;

    .line 1869
    .line 1870
    return-object v0

    .line 1871
    :goto_1e
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInteger;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplInteger;

    .line 1872
    .line 1873
    return-object v0

    .line 1874
    :goto_1f
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplShort;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplShort;

    .line 1875
    .line 1876
    return-object v0

    .line 1877
    :goto_20
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplByte;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplByte;

    .line 1878
    .line 1879
    return-object v0

    .line 1880
    :goto_21
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplBoolean;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplBoolean;

    .line 1881
    .line 1882
    return-object v0

    .line 1883
    :goto_22
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplCharacter;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplCharacter;

    .line 1884
    .line 1885
    return-object v0

    .line 1886
    :goto_23
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplString;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplString;

    .line 1887
    .line 1888
    return-object v0

    .line 1889
    :sswitch_data_0
    .sparse-switch
        -0x541731ee -> :sswitch_7
        -0x2aec35fd -> :sswitch_6
        0x40d5de3a -> :sswitch_5
        0x40dd4159 -> :sswitch_4
        0x4aad720a -> :sswitch_3
        0x5bc5408c -> :sswitch_2
        0x5e7d83d0 -> :sswitch_1
        0x6d0b6e25 -> :sswitch_0
    .end sparse-switch

    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_6
    .end packed-switch
.end method

.method public getTypeConvert(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/util/function/Function;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->typeConverts:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->buildInitTypeConverts()Ljava/util/concurrent/ConcurrentMap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->typeConverts:Ljava/util/concurrent/ConcurrentMap;

    .line 10
    .line 11
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/util/Map;

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return-object p1

    .line 21
    :cond_1
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/util/function/Function;

    .line 26
    .line 27
    return-object p1
.end method

.method public init()V
    .locals 0

    .line 1
    return-void
.end method

.method public mixIn(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :goto_0
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 13
    .line 14
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 18
    .line 19
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public register(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 17
    .line 18
    return-object p1
.end method

.method public registerIfAbsent(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 23
    .line 24
    return-object p1
.end method

.method public registerIfAbsent(JLcom/alibaba/fastjson2/reader/ObjectReader;)V
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->hashCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public registerSeeAlsoSubType(Ljava/lang/Class;)V
    .locals 1

    const/4 v0, 0x0

    .line 49
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->registerSeeAlsoSubType(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method

.method public registerSeeAlsoSubType(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v2, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    check-cast v1, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;

    .line 16
    .line 17
    invoke-virtual {v1, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;->addSubType(Ljava/lang/Class;Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    if-eq p2, v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 24
    .line 25
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 32
    .line 33
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 38
    .line 39
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void

    .line 43
    :cond_2
    const-string p1, "superclass is null"

    .line 44
    .line 45
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public setAutoTypeBeforeHandler(Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 2
    .line 3
    return-void
.end method

.method public setAutoTypeHandler(Ljava/util/function/Consumer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Consumer<",
            "Ljava/lang/Class;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->autoTypeHandler:Ljava/util/function/Consumer;

    .line 2
    .line 3
    return-void
.end method

.method public unregisterObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 8
    .line 9
    return-object p1
.end method

.method public unregisterObjectReader(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReader;)Z
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

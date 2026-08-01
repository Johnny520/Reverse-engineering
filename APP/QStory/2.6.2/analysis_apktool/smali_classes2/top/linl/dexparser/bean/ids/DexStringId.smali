.class public Ltop/linl/dexparser/bean/ids/DexStringId;
.super Ltop/linl/dexparser/bean/ids/BaseId;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public string_byte_length:I

.field public string_data:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public string_data_off:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ltop/linl/dexparser/bean/ids/BaseId;-><init>()V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ltop/linl/dexparser/bean/ids/BaseId;-><init>()V

    .line 10
    iput p1, p0, Ltop/linl/dexparser/bean/ids/DexStringId;->string_data_off:I

    .line 11
    iput p2, p0, Ltop/linl/dexparser/bean/ids/DexStringId;->string_byte_length:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ltop/linl/dexparser/bean/ids/BaseId;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ltop/linl/dexparser/bean/ids/DexStringId;->string_data:Ljava/lang/String;

    .line 5
    .line 6
    iput p1, p0, Ltop/linl/dexparser/bean/ids/DexStringId;->string_data_off:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Ltop/linl/dexparser/bean/ids/DexStringId;->string_byte_length:I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Ltop/linl/dexparser/bean/ids/DexStringId;->string_data:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p1, p1, Ltop/linl/dexparser/DexParser;->dexData:[B

    .line 11
    .line 12
    iget p0, p0, Ltop/linl/dexparser/bean/ids/DexStringId;->string_data_off:I

    .line 13
    .line 14
    add-int/lit8 p0, p0, 0x1

    .line 15
    .line 16
    invoke-static {p1, p0, v0}, Ltop/linl/dexparser/util/Utils;->copyArrays([BII)[B

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([B)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_1
    :goto_0
    iget-object p0, p0, Ltop/linl/dexparser/bean/ids/DexStringId;->string_data:Ljava/lang/String;

    .line 27
    .line 28
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/linl/dexparser/bean/ids/DexStringId;->string_data:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

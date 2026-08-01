.class public Ltop/linl/dexparser/bean/ids/DexTypeId;
.super Ltop/linl/dexparser/bean/ids/BaseId;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public descriptor_idx:I

.field public string_data:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ltop/linl/dexparser/bean/ids/BaseId;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ltop/linl/dexparser/bean/ids/BaseId;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ltop/linl/dexparser/bean/ids/DexTypeId;->descriptor_idx:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p1, Ltop/linl/dexparser/DexParser;->dexStringIdsList:[Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 2
    .line 3
    iget p0, p0, Ltop/linl/dexparser/bean/ids/DexTypeId;->descriptor_idx:I

    .line 4
    .line 5
    aget-object p0, v0, p0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ltop/linl/dexparser/bean/ids/DexStringId;->getString(Ltop/linl/dexparser/DexParser;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/linl/dexparser/bean/ids/DexTypeId;->string_data:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

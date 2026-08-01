.class public Ltop/linl/dexparser/bean/ids/DexProtoId;
.super Ltop/linl/dexparser/bean/ids/BaseId;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field parameters_off:I

.field return_type_idx:I

.field shorty_idx:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ltop/linl/dexparser/bean/ids/BaseId;-><init>()V

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ltop/linl/dexparser/bean/ids/BaseId;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ltop/linl/dexparser/bean/ids/DexProtoId;->shorty_idx:I

    .line 5
    .line 6
    iput p2, p0, Ltop/linl/dexparser/bean/ids/DexProtoId;->return_type_idx:I

    .line 7
    .line 8
    iput p3, p0, Ltop/linl/dexparser/bean/ids/DexProtoId;->parameters_off:I

    .line 9
    .line 10
    return-void
.end method

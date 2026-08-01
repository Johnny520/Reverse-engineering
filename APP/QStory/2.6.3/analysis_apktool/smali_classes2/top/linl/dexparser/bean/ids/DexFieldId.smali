.class public Ltop/linl/dexparser/bean/ids/DexFieldId;
.super Ltop/linl/dexparser/bean/ids/BaseId;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public class_idx:S

.field public name_idx:I

.field public type_idx:S


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ltop/linl/dexparser/bean/ids/BaseId;-><init>()V

    return-void
.end method

.method public constructor <init>(SSI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ltop/linl/dexparser/bean/ids/BaseId;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-short p1, p0, Ltop/linl/dexparser/bean/ids/DexFieldId;->class_idx:S

    .line 5
    .line 6
    iput-short p2, p0, Ltop/linl/dexparser/bean/ids/DexFieldId;->type_idx:S

    .line 7
    .line 8
    iput p3, p0, Ltop/linl/dexparser/bean/ids/DexFieldId;->name_idx:I

    .line 9
    .line 10
    return-void
.end method

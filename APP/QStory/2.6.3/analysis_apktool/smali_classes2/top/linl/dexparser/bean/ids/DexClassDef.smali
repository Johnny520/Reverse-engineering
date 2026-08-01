.class public Ltop/linl/dexparser/bean/ids/DexClassDef;
.super Ltop/linl/dexparser/bean/ids/BaseId;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public access_flags:I

.field public annotations_off:I

.field public class_data_off:I

.field public class_idx:I

.field public interfaces_off:I

.field public source_file_idx:I

.field public static_values_off:I

.field public superclass_idx:I


# direct methods
.method public constructor <init>(IIIIIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ltop/linl/dexparser/bean/ids/BaseId;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ltop/linl/dexparser/bean/ids/DexClassDef;->class_idx:I

    .line 5
    .line 6
    iput p2, p0, Ltop/linl/dexparser/bean/ids/DexClassDef;->access_flags:I

    .line 7
    .line 8
    iput p3, p0, Ltop/linl/dexparser/bean/ids/DexClassDef;->superclass_idx:I

    .line 9
    .line 10
    iput p4, p0, Ltop/linl/dexparser/bean/ids/DexClassDef;->interfaces_off:I

    .line 11
    .line 12
    iput p5, p0, Ltop/linl/dexparser/bean/ids/DexClassDef;->source_file_idx:I

    .line 13
    .line 14
    iput p6, p0, Ltop/linl/dexparser/bean/ids/DexClassDef;->annotations_off:I

    .line 15
    .line 16
    iput p7, p0, Ltop/linl/dexparser/bean/ids/DexClassDef;->class_data_off:I

    .line 17
    .line 18
    iput p8, p0, Ltop/linl/dexparser/bean/ids/DexClassDef;->static_values_off:I

    .line 19
    .line 20
    return-void
.end method

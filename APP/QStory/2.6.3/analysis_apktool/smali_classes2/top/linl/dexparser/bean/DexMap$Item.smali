.class public Ltop/linl/dexparser/bean/DexMap$Item;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/linl/dexparser/bean/DexMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Item"
.end annotation


# instance fields
.field public offset:I

.field public size:I

.field public type:I

.field public unused:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ltop/linl/dexparser/bean/DexMap$Item;->type:I

    .line 5
    .line 6
    iput p2, p0, Ltop/linl/dexparser/bean/DexMap$Item;->size:I

    .line 7
    .line 8
    iput p3, p0, Ltop/linl/dexparser/bean/DexMap$Item;->offset:I

    .line 9
    .line 10
    return-void
.end method

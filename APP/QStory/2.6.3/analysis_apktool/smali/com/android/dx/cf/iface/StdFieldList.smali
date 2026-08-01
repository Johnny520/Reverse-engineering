.class public final Lcom/android/dx/cf/iface/StdFieldList;
.super Lcom/android/dx/util/FixedSizeList;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/android/dx/cf/iface/FieldList;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/util/FixedSizeList;-><init>(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public get(I)Lcom/android/dx/cf/iface/Field;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/android/dx/cf/iface/Field;

    .line 6
    .line 7
    return-object p0
.end method

.method public set(ILcom/android/dx/cf/iface/Field;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/util/FixedSizeList;->set0(ILjava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

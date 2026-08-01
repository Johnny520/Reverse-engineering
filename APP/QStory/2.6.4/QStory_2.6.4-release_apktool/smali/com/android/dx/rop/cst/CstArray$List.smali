.class public final Lcom/android/dx/rop/cst/CstArray$List;
.super Lcom/android/dx/util/FixedSizeList;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/rop/cst/CstArray;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "List"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/dx/util/FixedSizeList;",
        "Ljava/lang/Comparable<",
        "Lcom/android/dx/rop/cst/CstArray$List;",
        ">;"
    }
.end annotation


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
.method public compareTo(Lcom/android/dx/rop/cst/CstArray$List;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    move v2, v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, v1

    .line 14
    :goto_0
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_1
    if-ge v4, v2, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0, v4}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Lcom/android/dx/rop/cst/Constant;

    .line 23
    .line 24
    invoke-virtual {p1, v4}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    check-cast v6, Lcom/android/dx/rop/cst/Constant;

    .line 29
    .line 30
    invoke-virtual {v5, v6}, Lcom/android/dx/rop/cst/Constant;->compareTo(Lcom/android/dx/rop/cst/Constant;)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    return v5

    .line 37
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    if-ge v0, v1, :cond_3

    .line 41
    .line 42
    const/4 p0, -0x1

    .line 43
    return p0

    .line 44
    :cond_3
    if-le v0, v1, :cond_4

    .line 45
    .line 46
    const/4 p0, 0x1

    .line 47
    return p0

    .line 48
    :cond_4
    return v3
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 49
    check-cast p1, Lcom/android/dx/rop/cst/CstArray$List;

    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/CstArray$List;->compareTo(Lcom/android/dx/rop/cst/CstArray$List;)I

    move-result p0

    return p0
.end method

.method public get(I)Lcom/android/dx/rop/cst/Constant;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/android/dx/rop/cst/Constant;

    .line 6
    .line 7
    return-object p0
.end method

.method public set(ILcom/android/dx/rop/cst/Constant;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/util/FixedSizeList;->set0(ILjava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

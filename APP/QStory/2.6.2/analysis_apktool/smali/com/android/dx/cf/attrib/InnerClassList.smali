.class public final Lcom/android/dx/cf/attrib/InnerClassList;
.super Lcom/android/dx/util/FixedSizeList;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/cf/attrib/InnerClassList$Item;
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
.method public get(I)Lcom/android/dx/cf/attrib/InnerClassList$Item;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/android/dx/cf/attrib/InnerClassList$Item;

    .line 6
    .line 7
    return-object p0
.end method

.method public set(ILcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstString;I)V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/cf/attrib/InnerClassList$Item;

    .line 2
    .line 3
    invoke-direct {v0, p2, p3, p4, p5}, Lcom/android/dx/cf/attrib/InnerClassList$Item;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstString;I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lcom/android/dx/util/FixedSizeList;->set0(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

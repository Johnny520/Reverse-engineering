.class public Lorg/apache/commons/lang3/NumberRange;
.super Lorg/apache/commons/lang3/Range;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<N:",
        "Ljava/lang/Number;",
        ">",
        "Lorg/apache/commons/lang3/Range<",
        "TN;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>(Ljava/lang/Number;Ljava/lang/Number;Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TN;TN;",
            "Ljava/util/Comparator<",
            "TN;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/commons/lang3/Range;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.class public Lcom/android/dx/ssa/DomFront$DomInfo;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/ssa/DomFront;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DomInfo"
.end annotation


# instance fields
.field public dominanceFrontiers:Lcom/android/dx/util/IntSet;

.field public idom:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/android/dx/ssa/DomFront$DomInfo;->idom:I

    .line 6
    .line 7
    return-void
.end method

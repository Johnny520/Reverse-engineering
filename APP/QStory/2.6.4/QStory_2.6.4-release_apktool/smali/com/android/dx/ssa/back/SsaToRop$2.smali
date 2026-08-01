.class Lcom/android/dx/ssa/back/SsaToRop$2;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/ssa/back/SsaToRop;->getRegistersByFrequency()[I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/ssa/back/SsaToRop;


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/back/SsaToRop;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/ssa/back/SsaToRop$2;->this$0:Lcom/android/dx/ssa/back/SsaToRop;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Integer;Ljava/lang/Integer;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/back/SsaToRop$2;->this$0:Lcom/android/dx/ssa/back/SsaToRop;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/android/dx/ssa/back/SsaToRop;->access$000(Lcom/android/dx/ssa/back/SsaToRop;)Lcom/android/dx/ssa/SsaMethod;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-virtual {v0, p2}, Lcom/android/dx/ssa/SsaMethod;->getUseListForRegister(I)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iget-object p0, p0, Lcom/android/dx/ssa/back/SsaToRop$2;->this$0:Lcom/android/dx/ssa/back/SsaToRop;

    .line 20
    .line 21
    invoke-static {p0}, Lcom/android/dx/ssa/back/SsaToRop;->access$000(Lcom/android/dx/ssa/back/SsaToRop;)Lcom/android/dx/ssa/SsaMethod;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0, p1}, Lcom/android/dx/ssa/SsaMethod;->getUseListForRegister(I)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    sub-int/2addr p2, p0

    .line 38
    return p2
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 39
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lcom/android/dx/ssa/back/SsaToRop$2;->compare(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result p0

    return p0
.end method

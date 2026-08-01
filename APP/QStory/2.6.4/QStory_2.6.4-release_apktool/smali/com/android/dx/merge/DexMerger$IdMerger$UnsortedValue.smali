.class Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/merge/DexMerger$IdMerger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "UnsortedValue"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/android/dx/merge/DexMerger$IdMerger<",
        "TT;>.UnsortedValue;>;"
    }
.end annotation


# instance fields
.field final index:I

.field final indexMap:Lcom/android/dx/merge/IndexMap;

.field final offset:I

.field final source:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

.field final synthetic this$1:Lcom/android/dx/merge/DexMerger$IdMerger;

.field final value:Ljava/lang/Comparable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/dx/merge/DexMerger$IdMerger;L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;Lcom/android/dx/merge/IndexMap;Ljava/lang/Comparable;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5b50\u5170\u82cf\u54f2\u4e16/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            "Lcom/android/dx/merge/IndexMap;",
            "TT;II)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->this$1:Lcom/android/dx/merge/DexMerger$IdMerger;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->source:L飘花落叶言楪子兰苏哲世/飘花落叶言子楪苏兰哲世;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->indexMap:Lcom/android/dx/merge/IndexMap;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->value:Ljava/lang/Comparable;

    .line 11
    .line 12
    iput p5, p0, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->index:I

    .line 13
    .line 14
    iput p6, p0, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->offset:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public compareTo(Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/merge/DexMerger$IdMerger<",
            "TT;>.UnsortedValue;)I"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->value:Ljava/lang/Comparable;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->value:Ljava/lang/Comparable;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 10
    check-cast p1, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;

    invoke-virtual {p0, p1}, Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;->compareTo(Lcom/android/dx/merge/DexMerger$IdMerger$UnsortedValue;)I

    move-result p0

    return p0
.end method

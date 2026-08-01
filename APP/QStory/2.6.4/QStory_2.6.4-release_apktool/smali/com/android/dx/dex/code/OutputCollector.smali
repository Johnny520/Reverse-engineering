.class public final Lcom/android/dx/dex/code/OutputCollector;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final finisher:Lcom/android/dx/dex/code/OutputFinisher;

.field private suffix:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/code/DalvInsn;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/dx/dex/DexOptions;IIII)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/android/dx/dex/code/OutputFinisher;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2, p4, p5}, Lcom/android/dx/dex/code/OutputFinisher;-><init>(Lcom/android/dx/dex/DexOptions;III)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/dx/dex/code/OutputCollector;->finisher:Lcom/android/dx/dex/code/OutputFinisher;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/android/dx/dex/code/OutputCollector;->suffix:Ljava/util/ArrayList;

    .line 17
    .line 18
    return-void
.end method

.method private appendSuffixToOutput()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/OutputCollector;->suffix:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_0

    .line 9
    .line 10
    iget-object v2, p0, Lcom/android/dx/dex/code/OutputCollector;->finisher:Lcom/android/dx/dex/code/OutputFinisher;

    .line 11
    .line 12
    iget-object v3, p0, Lcom/android/dx/dex/code/OutputCollector;->suffix:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Lcom/android/dx/dex/code/DalvInsn;

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Lcom/android/dx/dex/code/OutputFinisher;->add(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lcom/android/dx/dex/code/OutputCollector;->suffix:Ljava/util/ArrayList;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public add(Lcom/android/dx/dex/code/DalvInsn;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/OutputCollector;->finisher:Lcom/android/dx/dex/code/OutputFinisher;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/OutputFinisher;->add(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addSuffix(Lcom/android/dx/dex/code/DalvInsn;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/OutputCollector;->suffix:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public get(I)Lcom/android/dx/dex/code/DalvInsn;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/OutputCollector;->finisher:Lcom/android/dx/dex/code/OutputFinisher;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/dex/code/OutputFinisher;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_1

    .line 8
    .line 9
    if-gez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p0, p0, Lcom/android/dx/dex/code/OutputCollector;->finisher:Lcom/android/dx/dex/code/OutputFinisher;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/OutputFinisher;->get(I)Lcom/android/dx/dex/code/DalvInsn;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public getFinisher()Lcom/android/dx/dex/code/OutputFinisher;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/OutputCollector;->suffix:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/android/dx/dex/code/OutputCollector;->appendSuffixToOutput()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/android/dx/dex/code/OutputCollector;->finisher:Lcom/android/dx/dex/code/OutputFinisher;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    const-string p0, "already processed"

    .line 12
    .line 13
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method public reverseBranch(ILcom/android/dx/dex/code/CodeAddress;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/OutputCollector;->finisher:Lcom/android/dx/dex/code/OutputFinisher;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/dex/code/OutputFinisher;->reverseBranch(ILcom/android/dx/dex/code/CodeAddress;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/OutputCollector;->finisher:Lcom/android/dx/dex/code/OutputFinisher;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/OutputFinisher;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

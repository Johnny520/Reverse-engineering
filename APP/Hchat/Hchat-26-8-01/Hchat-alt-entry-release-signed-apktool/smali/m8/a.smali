.class public final Lm8/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lm8/c;


# direct methods
.method public constructor <init>(Lm8/c;Lg1/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm8/a;->a:Lm8/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lh/Hchat/dexkit/DexFinder;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p1, Lh/Hchat/dexkit/DexFinder;->netQueueClass:Ljava/lang/Class;

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    iget-object v0, p1, Lh/Hchat/dexkit/DexFinder;->netQueueCandidateClasses:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    return-void

    .line 21
    :cond_2
    :goto_1
    iget-object v0, p1, Lh/Hchat/dexkit/DexFinder;->netQueueClass:Ljava/lang/Class;

    .line 22
    .line 23
    iget-object p1, p1, Lh/Hchat/dexkit/DexFinder;->netQueueCandidateClasses:Ljava/util/List;

    .line 24
    .line 25
    iget-object v1, p0, Lm8/a;->a:Lm8/c;

    .line 26
    .line 27
    invoke-virtual {v1, v0, p1}, Lm8/c;->c(Ljava/lang/Class;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

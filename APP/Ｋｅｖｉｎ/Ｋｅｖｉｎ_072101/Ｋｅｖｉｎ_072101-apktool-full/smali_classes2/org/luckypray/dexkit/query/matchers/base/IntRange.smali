.class public final Lorg/luckypray/dexkit/query/matchers/base/IntRange;
.super Lorg/luckypray/dexkit/query/base/BaseQuery;
.source "IntRange.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\u0008\u0016\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007B\u000f\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u0004R$\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\r\"\u0004\u0008\u0010\u0010\u0004\u00a8\u0006\u0015"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "Lorg/luckypray/dexkit/query/base/BaseQuery;",
        "value",
        "",
        "(I)V",
        "min",
        "max",
        "(II)V",
        "range",
        "Lkotlin/ranges/IntRange;",
        "(Lkotlin/ranges/IntRange;)V",
        "<set-?>",
        "getMax",
        "()I",
        "setMax",
        "getMin",
        "setMin",
        "innerBuild",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "Companion",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;


# instance fields
.field private max:I

.field private min:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->Companion:Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1
    .param p1, "value"    # I

    .line 38
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 36
    const v0, 0x7fffffff

    iput v0, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    .line 39
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    .line 40
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    .line 41
    return-void
.end method

.method public constructor <init>(II)V
    .locals 1
    .param p1, "min"    # I
    .param p2, "max"    # I

    .line 43
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 36
    const v0, 0x7fffffff

    iput v0, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    .line 44
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    .line 45
    iput p2, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    .line 46
    return-void
.end method

.method public synthetic constructor <init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 43
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    :cond_1
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    .line 46
    return-void
.end method

.method public constructor <init>(Lkotlin/ranges/IntRange;)V
    .locals 1
    .param p1, "range"    # Lkotlin/ranges/IntRange;

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseQuery;-><init>()V

    .line 36
    const v0, 0x7fffffff

    iput v0, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    .line 49
    invoke-virtual {p1}, Lkotlin/ranges/IntRange;->getFirst()I

    move-result v0

    iput v0, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    .line 50
    invoke-virtual {p1}, Lkotlin/ranges/IntRange;->getLast()I

    move-result v0

    iput v0, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    .line 51
    return-void
.end method


# virtual methods
.method public final getMax()I
    .locals 1

    .line 36
    iget v0, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    return v0
.end method

.method public final getMin()I
    .locals 1

    .line 33
    iget v0, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    return v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 3
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    sget-object v0, Lorg/luckypray/dexkit/schema/-IntRange;->Companion:Lorg/luckypray/dexkit/schema/-IntRange$Companion;

    .line 60
    nop

    .line 61
    iget v1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    .line 62
    iget v2, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    .line 59
    invoke-virtual {v0, p1, v1, v2}, Lorg/luckypray/dexkit/schema/-IntRange$Companion;->createIntRange(Lcom/google/flatbuffers/FlatBufferBuilder;II)I

    move-result v0

    .line 64
    .local v0, "root":I
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 65
    return v0
.end method

.method public final synthetic setMax(I)V
    .locals 0
    .param p1, "<set-?>"    # I

    .line 36
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    return-void
.end method

.method public final synthetic setMin(I)V
    .locals 0
    .param p1, "<set-?>"    # I

    .line 33
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    return-void
.end method

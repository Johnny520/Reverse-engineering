.class public final Lorg/luckypray/dexkit/query/matchers/base/IntRange;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001d\u0008\u0016\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B\u0011\u0008\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000cH\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR*\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0005R*\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0011\u001a\u0004\u0008\u0015\u0010\u0013\"\u0004\u0008\u0016\u0010\u0005\u00a8\u0006\u0018"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/base/IntRange;",
        "Lorg/luckypray/dexkit/query/base/BaseMatcher;",
        "",
        "value",
        "<init>",
        "(I)V",
        "min",
        "max",
        "(II)V",
        "LYue/\u06e5\u06e0\u06e5\u06e3\u06e8;",
        "range",
        "(LYue/\u06e5\u06e0\u06e5\u06e3\u06e8;)V",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "fbb",
        "innerBuild",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;)I",
        "<set-?>",
        "I",
        "getMin",
        "()I",
        "setMin",
        "getMax",
        "setMax",
        "Companion",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field private max:I

.field private min:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->Companion:Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 2
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    .line 3
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 4
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 5
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    .line 6
    iput p2, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    return-void
.end method

.method public synthetic constructor <init>(IIILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    return-void
.end method

.method public constructor <init>(LYue/ۥ۠ۥۣۨ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۥۣۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "range"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    const v0, 0x7fffffff

    .line 9
    iput v0, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    .line 10
    invoke-virtual {p1}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟۠()I

    move-result v0

    iput v0, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    .line 11
    invoke-virtual {p1}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟ۢ()I

    move-result p1

    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    return-void
.end method


# virtual methods
.method public final getMax()I
    .locals 1

    iget v0, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    return v0
.end method

.method public final getMin()I
    .locals 1

    iget v0, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    return v0
.end method

.method public innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 3
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "fbb"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/schema/-IntRange;->Companion:Lorg/luckypray/dexkit/schema/-IntRange$Companion;

    iget v1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    iget v2, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    invoke-virtual {v0, p1, v1, v2}, Lorg/luckypray/dexkit/schema/-IntRange$Companion;->createIntRange(Lcom/google/flatbuffers/FlatBufferBuilder;II)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    return v0
.end method

.method public final synthetic setMax(I)V
    .locals 0

    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    return-void
.end method

.method public final synthetic setMin(I)V
    .locals 0

    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    return-void
.end method

.class public final Lorg/luckypray/dexkit/query/matchers/base/IntRange;
.super Lorg/luckypray/dexkit/query/base/BaseMatcher;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;


# instance fields
.field private max:I

.field private min:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;-><init>(Lpl;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->Companion:Lorg/luckypray/dexkit/query/matchers/base/IntRange$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 21
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    .line 22
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 18
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    .line 19
    iput p2, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    return-void
.end method

.method public synthetic constructor <init>(IIILpl;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    const p2, 0x7fffffff

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/IntRange;-><init>(II)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Lz20;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/base/BaseMatcher;-><init>()V

    .line 24
    iget v0, p1, Lx20;->d:I

    .line 25
    iput v0, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    .line 26
    iget p1, p1, Lx20;->e:I

    .line 27
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    return-void
.end method


# virtual methods
.method public final getMax()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    .line 2
    .line 3
    return p0
.end method

.method public final getMin()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    .line 2
    .line 3
    return p0
.end method

.method public innerBuild(Lxt;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/schema/-IntRange;->Companion:Lorg/luckypray/dexkit/schema/-IntRange$Companion;

    .line 5
    .line 6
    iget v1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    .line 7
    .line 8
    iget p0, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    .line 9
    .line 10
    invoke-virtual {v0, p1, v1, p0}, Lorg/luckypray/dexkit/schema/-IntRange$Companion;->createIntRange(Lxt;II)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-virtual {p1, p0}, Lxt;->n(I)V

    .line 15
    .line 16
    .line 17
    return p0
.end method

.method public final synthetic setMax(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->max:I

    .line 2
    .line 3
    return-void
.end method

.method public final synthetic setMin(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/base/IntRange;->min:I

    .line 2
    .line 3
    return-void
.end method

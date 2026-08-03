.class public final LYue/ۥۢۦۣۢ;
.super LYue/ۥۡۥۨۤ;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۦۣۢ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"
.end annotation


# static fields
.field public static final ۥ۟۟ۡ۠:LYue/ۥۢۦۣۢ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟ۡۡ:J


# instance fields
.field public ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:I

.field public ۥ۟۟۠ۧ:I

.field public ۥ۟۟۠ۨ:I

.field public ۥ۟۟ۡ:I

.field public ۥ۟۟ۡ۟:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۢۦۣۢ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۢۦۣۢ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۢۦۣۢ;->ۥ۟۟ۡ۠:LYue/ۥۢۦۣۢ$ۥ;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 7

    not-int v5, p1

    shl-int/lit8 v0, p1, 0xa

    ushr-int/lit8 v1, p2, 0x4

    xor-int v6, v0, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    .line 10
    invoke-direct/range {v0 .. v6}, LYue/ۥۢۦۣۢ;-><init>(IIIIII)V

    return-void
.end method

.method public constructor <init>(IIIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۡۥۨۤ;-><init>()V

    .line 2
    iput p1, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟۠ۥ:I

    .line 3
    iput p2, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟۠ۦ:I

    .line 4
    iput p3, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟۠ۧ:I

    .line 5
    iput p4, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟۠ۨ:I

    .line 6
    iput p5, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟ۡ:I

    .line 7
    iput p6, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟ۡ۟:I

    or-int/2addr p1, p2

    or-int/2addr p1, p3

    or-int/2addr p1, p4

    or-int/2addr p1, p5

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    :goto_0
    const/16 p2, 0x40

    if-ge p1, p2, :cond_0

    .line 8
    invoke-virtual {p0}, LYue/ۥۢۦۣۢ;->ۥ۟۟۟ۦ()I

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 9
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Initial state must have at least one non-zero element."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public ۥ۟(I)I
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۦۣۢ;->ۥ۟۟۟ۦ()I

    move-result v0

    invoke-static {v0, p1}, LYue/ۥۡۥۨۥ;->ۥ۟۟۟ۤ(II)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۦ()I
    .locals 3

    iget v0, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟۠ۥ:I

    ushr-int/lit8 v1, v0, 0x2

    xor-int/2addr v0, v1

    iget v1, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟۠ۦ:I

    iput v1, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟۠ۥ:I

    iget v1, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟۠ۧ:I

    iput v1, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟۠ۦ:I

    iget v1, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟۠ۨ:I

    iput v1, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟۠ۧ:I

    iget v1, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟ۡ:I

    iput v1, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟۠ۨ:I

    shl-int/lit8 v2, v0, 0x1

    xor-int/2addr v0, v2

    xor-int/2addr v0, v1

    shl-int/lit8 v1, v1, 0x4

    xor-int/2addr v0, v1

    iput v0, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟ۡ:I

    iget v1, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟ۡ۟:I

    const v2, 0x587c5

    add-int/2addr v1, v2

    iput v1, p0, LYue/ۥۢۦۣۢ;->ۥ۟۟ۡ۟:I

    add-int/2addr v0, v1

    return v0
.end method

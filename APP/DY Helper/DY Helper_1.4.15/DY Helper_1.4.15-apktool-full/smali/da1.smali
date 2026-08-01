.class public final enum Lda1;
.super Ljava/lang/Enum;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final enum ζ:Lda1;

.field public static final enum η:Lda1;

.field public static final enum θ:Lda1;

.field public static final enum ι:Lda1;

.field public static final enum κ:Lda1;

.field public static final synthetic λ:[Lda1;


# instance fields
.field public final ε:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lda1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const-string v3, "PCM_8_BIT"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3}, Lda1;-><init>(IILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lda1;->ζ:Lda1;

    .line 11
    .line 12
    new-instance v1, Lda1;

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    const-string v4, "PCM_16_BIT"

    .line 16
    .line 17
    invoke-direct {v1, v2, v3, v4}, Lda1;-><init>(IILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lda1;->η:Lda1;

    .line 21
    .line 22
    new-instance v2, Lda1;

    .line 23
    .line 24
    const/4 v4, 0x3

    .line 25
    const-string v5, "PCM_24_BIT_PACKED"

    .line 26
    .line 27
    invoke-direct {v2, v3, v4, v5}, Lda1;-><init>(IILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sput-object v2, Lda1;->θ:Lda1;

    .line 31
    .line 32
    new-instance v3, Lda1;

    .line 33
    .line 34
    const/4 v5, 0x4

    .line 35
    const-string v6, "PCM_32_BIT"

    .line 36
    .line 37
    invoke-direct {v3, v4, v5, v6}, Lda1;-><init>(IILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sput-object v3, Lda1;->ι:Lda1;

    .line 41
    .line 42
    new-instance v4, Lda1;

    .line 43
    .line 44
    const-string v6, "PCM_FLOAT"

    .line 45
    .line 46
    invoke-direct {v4, v5, v5, v6}, Lda1;-><init>(IILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sput-object v4, Lda1;->κ:Lda1;

    .line 50
    .line 51
    filled-new-array {v0, v1, v2, v3, v4}, [Lda1;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lda1;->λ:[Lda1;

    .line 56
    .line 57
    return-void
.end method

.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lda1;->ε:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lda1;
    .locals 1

    .line 1
    const-class v0, Lda1;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lda1;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lda1;
    .locals 1

    .line 1
    sget-object v0, Lda1;->λ:[Lda1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lda1;

    .line 8
    .line 9
    return-object v0
.end method
